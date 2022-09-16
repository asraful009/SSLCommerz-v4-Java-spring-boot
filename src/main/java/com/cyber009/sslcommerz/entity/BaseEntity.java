// package com.cyber009.sslcommerz.entity;

// import javax.persistence.*;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.EqualsAndHashCode;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;
// import lombok.experimental.SuperBuilder;

// import java.time.LocalDateTime;
// import java.time.ZoneId;
// import java.time.ZoneOffset;
// import java.util.UUID;

// @MappedSuperclass
// @NoArgsConstructor
// @AllArgsConstructor
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode(of = { "id" })
// @SuperBuilder(toBuilder = true)
// public class BaseEntity {

// @Id
// private UUID id;

// @Builder.Default
// @Version
// private Long version = 0L;

// @Builder.Default
// private boolean isDeleted = Boolean.FALSE;

// @Builder.Default
// private boolean isActive = Boolean.TRUE;

// @Basic
// @Column(name = "created_at", nullable = false, updatable = false)
// private LocalDateTime createdAt;

// @Basic
// @Column(name = "updated_at", nullable = false)
// private LocalDateTime updatedAt;

// private UUID createdByUser;

// private UUID updatedByUser;

// private UUID createdByEmployee;

// private UUID updatedByEmployee;

// private UUID createdBySupplier;

// private UUID updatedBySupplier;

// private String ipAddress;

// @PrePersist
// protected void onCreate() {
// createdAt = updatedAt =
// LocalDateTime.now().atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC)
// .toLocalDateTime();
// }

// @PreUpdate
// protected void onUpdate() {
// updatedAt =
// LocalDateTime.now().atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC)
// .toLocalDateTime();
// }
// }
