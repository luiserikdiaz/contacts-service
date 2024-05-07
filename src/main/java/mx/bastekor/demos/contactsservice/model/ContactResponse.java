package mx.bastekor.demos.contactsservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ContactResponse(
        @JsonProperty("contact_id")
        String contactId,
        @JsonProperty("name")
        String name,
        @JsonProperty("sur_name")
        String surName,
        @JsonProperty("alias")
        String alias,
        @JsonProperty("phone_number")
        String phoneNumber,
        @JsonProperty("email")
        String email,
        @JsonProperty("address")
        String address,
        @JsonProperty("date")
        String date,
        @JsonProperty("photo")
        boolean photo
) {
}