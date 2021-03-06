/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class OperationsScopedList implements ApiMessage {
  private final List<Operation> operations;
  private final Warning warning;

  private OperationsScopedList() {
    this.operations = null;
    this.warning = null;
  }

  private OperationsScopedList(List<Operation> operations, Warning warning) {
    this.operations = operations;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("operations".equals(fieldName)) {
      return operations;
    }
    if ("warning".equals(fieldName)) {
      return warning;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** [Output Only] A list of operations contained in this scope. */
  public List<Operation> getOperationsList() {
    return operations;
  }

  /**
   * [Output Only] Informational warning which replaces the list of operations when the list is
   * empty.
   */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(OperationsScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static OperationsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final OperationsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new OperationsScopedList();
  }

  public static class Builder {
    private List<Operation> operations;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(OperationsScopedList other) {
      if (other == OperationsScopedList.getDefaultInstance()) return this;
      if (other.getOperationsList() != null) {
        this.operations = other.operations;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(OperationsScopedList source) {
      this.operations = source.operations;
      this.warning = source.warning;
    }

    /** [Output Only] A list of operations contained in this scope. */
    public List<Operation> getOperationsList() {
      return operations;
    }

    /** [Output Only] A list of operations contained in this scope. */
    public Builder addAllOperations(List<Operation> operations) {
      if (this.operations == null) {
        this.operations = new LinkedList<>();
      }
      this.operations.addAll(operations);
      return this;
    }

    /** [Output Only] A list of operations contained in this scope. */
    public Builder addOperations(Operation operations) {
      if (this.operations == null) {
        this.operations = new LinkedList<>();
      }
      this.operations.add(operations);
      return this;
    }

    /**
     * [Output Only] Informational warning which replaces the list of operations when the list is
     * empty.
     */
    public Warning getWarning() {
      return warning;
    }

    /**
     * [Output Only] Informational warning which replaces the list of operations when the list is
     * empty.
     */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public OperationsScopedList build() {

      return new OperationsScopedList(operations, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllOperations(this.operations);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "OperationsScopedList{" + "operations=" + operations + ", " + "warning=" + warning + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OperationsScopedList) {
      OperationsScopedList that = (OperationsScopedList) o;
      return Objects.equals(this.operations, that.getOperationsList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, warning);
  }
}
