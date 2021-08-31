package com.example.futterapptask;

import com.example.futterapptask.Models.AvailabilityDays;
import com.example.futterapptask.Models.Meta;
import com.example.futterapptask.Models.MorePayload;
import com.example.futterapptask.Models.Status;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class UserData {
    @SerializedName("payload")
    List<MorePayload> morePayloads;

    Status status;
    AvailabilityDays availabilityDays;
    Meta meta;
    Root root;


    public UserData(List<MorePayload> morePayloads, Status status, AvailabilityDays availabilityDays, Meta meta, Root root) {
        this.morePayloads = morePayloads;
        this.status = status;
        this.availabilityDays = availabilityDays;
        this.meta = meta;
        this.root = root;
    }

    public List<MorePayload> getMorePayloads() {
        return morePayloads;
    }

    public void setMorePayloads(List<MorePayload> morePayloads) {
        this.morePayloads = morePayloads;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AvailabilityDays getAvailabilityDays() {
        return availabilityDays;
    }

    public void setAvailabilityDays(AvailabilityDays availabilityDays) {
        this.availabilityDays = availabilityDays;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }
}
