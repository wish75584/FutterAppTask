package com.example.futterapptask.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class SearchResult {

    @SerializedName("status")
    @Expose
    private SearchStatus status;
    @SerializedName("payload")
    @Expose
    private List<SearchPayload> sr_payload;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public SearchResult(SearchStatus status, List<SearchPayload> sr_payload, Meta meta) {
        this.status = status;
        this.sr_payload = sr_payload;
        this.meta = meta;
    }

    public SearchStatus getStatus() {
        return status;
    }

    public void setStatus(SearchStatus status) {
        this.status = status;
    }

    public List<SearchPayload> getSr_payload() {
        return sr_payload;
    }

    public void setSr_payload(List<SearchPayload> sr_payload) {
        this.sr_payload = sr_payload;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}


