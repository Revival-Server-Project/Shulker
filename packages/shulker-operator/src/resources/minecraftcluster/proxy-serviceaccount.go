/*
Copyright (c) Jérémy Levilain
SPDX-License-Identifier: GPL-3.0-or-later
*/

package resources

import (
	"fmt"

	corev1 "k8s.io/api/core/v1"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	"sigs.k8s.io/controller-runtime/pkg/client"
	"sigs.k8s.io/controller-runtime/pkg/controller/controllerutil"
)

type MinecraftClusterProxyServiceAccountBuilder struct {
	*MinecraftClusterResourceBuilder
}

func (b *MinecraftClusterResourceBuilder) MinecraftClusterProxyServiceAccount() *MinecraftClusterProxyServiceAccountBuilder {
	return &MinecraftClusterProxyServiceAccountBuilder{b}
}

func (b *MinecraftClusterProxyServiceAccountBuilder) Build() (client.Object, error) {
	return &corev1.ServiceAccount{
		ObjectMeta: metav1.ObjectMeta{
			Name:      b.getProxyServiceAccountName(),
			Namespace: b.Instance.Namespace,
			Labels:    b.getLabels(),
		},
	}, nil
}

func (b *MinecraftClusterProxyServiceAccountBuilder) Update(object client.Object) error {
	serviceAccount := object.(*corev1.ServiceAccount)

	if err := controllerutil.SetControllerReference(b.Instance, serviceAccount, b.Scheme); err != nil {
		return fmt.Errorf("failed setting controller reference for ServiceAccount: %v", err)
	}

	return nil
}

func (b *MinecraftClusterProxyServiceAccountBuilder) CanBeUpdated() bool {
	return true
}