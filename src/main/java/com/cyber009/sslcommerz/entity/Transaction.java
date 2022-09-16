// package com.cyber009.sslcommerz.entity;

// import java.util.UUID;

// import javax.persistence.Convert;
// import javax.persistence.Entity;
// import javax.persistence.Table;

// import com.cyber009.sslcommerz.enums.SSlTrStatus;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;
// import lombok.experimental.SuperBuilder;

// @Entity
// @Table(name = "transactions")
// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// @ToString(callSuper = true)
// @SuperBuilder
// public class Transaction extends BaseEntity {

// // BASIC INFORMATION
// private UUID trId;
// private String currencyCode;
// private Float totalAmount;

// @Convert(converter = SSlTrStatus.SSlTrStatusConverter.class)
// private SSlTrStatus sslTrStatus;

// // BASIC INFORMATION

// // # CUSTOMER INFORMATION
// private String cusName;
// private String cusEmail;
// private String cusAdd1;
// private String cusAdd2;
// private String cusCity;
// private String cusState;
// private String cusPostCode;
// private String cusCountry;
// private String cusPhone;
// private String cusFax;

// private String cusProductCategory;
// private String cusProductName;
// private String cuspreviousCustomer;
// private String cusshippingMethod;
// private String cusnumOfItem;
// private String cusproductShippingContry;

// // # SHIPMENT INFORMATION
// private String shipName;
// private String shipAdd1;
// private String shipAdd2;
// private String shipCity;
// private String shipState;
// private String shipPostcode;
// private String shipPhone;
// private String shipCountry;
// private String cart;

// @Builder.Default
// private Integer emiOption = 1;
// @Builder.Default
// private Integer tokenizeId = 1;
// @Builder.Default
// private Integer product_profile_id = 2;

// }
