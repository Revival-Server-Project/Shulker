// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/query.proto

// Protobuf Java Version: 3.25.0
package com.openmatch;

public interface QueryBackfillsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:openmatch.QueryBackfillsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  java.util.List<com.openmatch.Backfill> 
      getBackfillsList();
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  com.openmatch.Backfill getBackfills(int index);
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  int getBackfillsCount();
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  java.util.List<? extends com.openmatch.BackfillOrBuilder> 
      getBackfillsOrBuilderList();
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  com.openmatch.BackfillOrBuilder getBackfillsOrBuilder(
      int index);
}