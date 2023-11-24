// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.proto;

public interface FeatureConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.FeatureConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return Whether the fixedLenFeature field is set.
   */
  boolean hasFixedLenFeature();
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return The fixedLenFeature.
   */
  org.tensorflow.proto.FixedLenFeatureProto getFixedLenFeature();
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   */
  org.tensorflow.proto.FixedLenFeatureProtoOrBuilder getFixedLenFeatureOrBuilder();

  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return Whether the varLenFeature field is set.
   */
  boolean hasVarLenFeature();
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return The varLenFeature.
   */
  org.tensorflow.proto.VarLenFeatureProto getVarLenFeature();
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   */
  org.tensorflow.proto.VarLenFeatureProtoOrBuilder getVarLenFeatureOrBuilder();

  public org.tensorflow.proto.FeatureConfiguration.ConfigCase getConfigCase();
}