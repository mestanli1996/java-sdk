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
package com.ibm.watson.developer_cloud.conversation.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;

/**
 * The deleteDialogNode options.
 */
public class DeleteDialogNodeOptions extends GenericModel {

  private String workspaceId;
  private String dialogNode;

  /**
   * Builder.
   */
  public static class Builder {
    private String workspaceId;
    private String dialogNode;

    private Builder(DeleteDialogNodeOptions deleteDialogNodeOptions) {
      workspaceId = deleteDialogNodeOptions.workspaceId;
      dialogNode = deleteDialogNodeOptions.dialogNode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workspaceId the workspaceId
     * @param dialogNode the dialogNode
     */
    public Builder(String workspaceId, String dialogNode) {
      this.workspaceId = workspaceId;
      this.dialogNode = dialogNode;
    }

    /**
     * Builds a DeleteDialogNodeOptions.
     *
     * @return the deleteDialogNodeOptions
     */
    public DeleteDialogNodeOptions build() {
      return new DeleteDialogNodeOptions(this);
    }

    /**
     * Set the workspaceId.
     *
     * @param workspaceId the workspaceId
     * @return the DeleteDialogNodeOptions builder
     */
    public Builder workspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
      return this;
    }

    /**
     * Set the dialogNode.
     *
     * @param dialogNode the dialogNode
     * @return the DeleteDialogNodeOptions builder
     */
    public Builder dialogNode(String dialogNode) {
      this.dialogNode = dialogNode;
      return this;
    }
  }

  private DeleteDialogNodeOptions(Builder builder) {
    Validator.notEmpty(builder.workspaceId, "workspaceId cannot be empty");
    Validator.notEmpty(builder.dialogNode, "dialogNode cannot be empty");
    workspaceId = builder.workspaceId;
    dialogNode = builder.dialogNode;
  }

  /**
   * New builder.
   *
   * @return a DeleteDialogNodeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workspaceId.
   *
   * The workspace ID.
   *
   * @return the workspaceId
   */
  public String workspaceId() {
    return workspaceId;
  }

  /**
   * Gets the dialogNode.
   *
   * The dialog node ID (for example, `get_order`).
   *
   * @return the dialogNode
   */
  public String dialogNode() {
    return dialogNode;
  }
}
