/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.speech_to_text.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;

/**
 * The getAudio options.
 */
public class GetAudioOptions extends GenericModel {

  private String customizationId;
  private String audioName;

  /**
   * Builder.
   */
  public static class Builder {
    private String customizationId;
    private String audioName;

    private Builder(GetAudioOptions getAudioOptions) {
      customizationId = getAudioOptions.customizationId;
      audioName = getAudioOptions.audioName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param customizationId the customizationId
     * @param audioName the audioName
     */
    public Builder(String customizationId, String audioName) {
      this.customizationId = customizationId;
      this.audioName = audioName;
    }

    /**
     * Builds a GetAudioOptions.
     *
     * @return the getAudioOptions
     */
    public GetAudioOptions build() {
      return new GetAudioOptions(this);
    }

    /**
     * Set the customizationId.
     *
     * @param customizationId the customizationId
     * @return the GetAudioOptions builder
     */
    public Builder customizationId(String customizationId) {
      this.customizationId = customizationId;
      return this;
    }

    /**
     * Set the audioName.
     *
     * @param audioName the audioName
     * @return the GetAudioOptions builder
     */
    public Builder audioName(String audioName) {
      this.audioName = audioName;
      return this;
    }
  }

  private GetAudioOptions(Builder builder) {
    Validator.notEmpty(builder.customizationId, "customizationId cannot be empty");
    Validator.notEmpty(builder.audioName, "audioName cannot be empty");
    customizationId = builder.customizationId;
    audioName = builder.audioName;
  }

  /**
   * New builder.
   *
   * @return a GetAudioOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the customizationId.
   *
   * The GUID of the custom acoustic model for which an audio resource is to be listed. You must make the request with
   * service credentials created for the instance of the service that owns the custom model.
   *
   * @return the customizationId
   */
  public String customizationId() {
    return customizationId;
  }

  /**
   * Gets the audioName.
   *
   * The name of the audio resource about which information is to be listed.
   *
   * @return the audioName
   */
  public String audioName() {
    return audioName;
  }
}
