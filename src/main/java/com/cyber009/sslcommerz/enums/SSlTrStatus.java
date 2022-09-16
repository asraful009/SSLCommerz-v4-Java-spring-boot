package com.cyber009.sslcommerz.enums;

import java.util.Arrays;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum SSlTrStatus {
  LIST(1, "List"),
  BUTTON(2, "Button"),
  FORM(3, "Form"),
  MESSAGES(4, "Messages"),
  PLACEHOLDER(5, "Placeholder"),
  VALIDATION(6, "Validation"),
  PARENT_MODULE(7, "Parent Module"),
  MODULE(8, "Module"),
  SUB_MODULE(9, "Sub Module"),
  SYS_MSG(10, "SYS_MSG"),

  UNKNOWN(0, "unknown");

  private Integer id;
  private String type;

  SSlTrStatus(Integer id, String type) {
    this.id = id;
    this.type = type;
  }

  public static String[] toArray() {
    return Arrays.stream(SSlTrStatus.values()).sequential().collect(Collectors.toList()).toArray(String[]::new);
  }

  public static SSlTrStatus getById(Integer id) {
    for (SSlTrStatus level : SSlTrStatus.values()) {
      if (level.getId() == id)
        return level;
    }

    return null;
  }

  public static SSlTrStatus getByType(String type) {
    for (SSlTrStatus value : SSlTrStatus.values()) {
      if (value.getType().equals(type))
        return value;
    }

    return null;
  }

  // @Converter
  // public static class SSlTrStatusConverter implements
  // AttributeConverter<SSlTrStatus, Integer> {
  // @Override
  // public Integer convertToDatabaseColumn(SSlTrStatus type) {
  // return type != null ? type.getId() : UNKNOWN.id;
  // }

  // @Override
  // public SSlTrStatus convertToEntityAttribute(Integer id) {
  // return id != null ? SSlTrStatus.getById(id) : UNKNOWN;
  // }
  // }
}
