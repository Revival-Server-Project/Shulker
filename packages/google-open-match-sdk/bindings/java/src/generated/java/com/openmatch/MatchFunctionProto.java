// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/match-function.proto

// Protobuf Java Version: 3.25.0
package com.openmatch;

public final class MatchFunctionProto {
  private MatchFunctionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_RunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_RunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_RunResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_RunResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030api/match-function.proto\022\topenmatch\032\022a" +
      "pi/messages.proto\032\034google/api/annotation" +
      "s.proto\"?\n\nRunRequest\0221\n\007profile\030\001 \001(\0132\027" +
      ".openmatch.MatchProfileR\007profile\";\n\013RunR" +
      "esponse\022,\n\010proposal\030\001 \001(\0132\020.openmatch.Ma" +
      "tchR\010proposal2i\n\rMatchFunction\022X\n\003Run\022\025." +
      "openmatch.RunRequest\032\026.openmatch.RunResp" +
      "onse\" \202\323\344\223\002\032\"\025/v1/matchfunction:run:\001*0\001" +
      "B\211\001\n\rcom.openmatchB\022MatchFunctionProtoP\001" +
      "Z open-match.dev/open-match/pkg/pb\242\002\003OXX" +
      "\252\002\tOpenmatch\312\002\tOpenmatch\342\002\025Openmatch\\GPB" +
      "Metadata\352\002\tOpenmatchb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.openmatch.MessagesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_openmatch_RunRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openmatch_RunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_RunRequest_descriptor,
        new java.lang.String[] { "Profile", });
    internal_static_openmatch_RunResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_openmatch_RunResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_RunResponse_descriptor,
        new java.lang.String[] { "Proposal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.openmatch.MessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}