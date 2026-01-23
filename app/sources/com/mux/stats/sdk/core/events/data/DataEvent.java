package com.mux.stats.sdk.core.events.data;

import com.mux.stats.sdk.core.events.BaseEvent;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;
import com.mux.stats.sdk.core.model.CustomerViewerData;
import com.mux.stats.sdk.core.model.EnvironmentData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewerData;

/* loaded from: classes27.dex */
public class DataEvent extends BaseEvent {

    /* renamed from: a */
    private ViewerData f1038a;

    /* renamed from: b */
    private EnvironmentData f1039b;

    /* renamed from: c */
    private VideoData f1040c;

    /* renamed from: d */
    private CustomerVideoData f1041d;

    /* renamed from: e */
    private CustomerViewData f1042e;

    /* renamed from: f */
    private CustomerPlayerData f1043f;

    /* renamed from: g */
    private CustomerViewerData f1044g;

    /* renamed from: h */
    private CustomData f1045h;

    public CustomData getCustomData() {
        return this.f1045h;
    }

    public CustomerPlayerData getCustomerPlayerData() {
        return this.f1043f;
    }

    public CustomerVideoData getCustomerVideoData() {
        return this.f1041d;
    }

    public CustomerViewData getCustomerViewData() {
        return this.f1042e;
    }

    public CustomerViewerData getCustomerViewerData() {
        return this.f1044g;
    }

    public EnvironmentData getEnvironmentData() {
        return this.f1039b;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "dataevent";
    }

    public VideoData getVideoData() {
        return this.f1040c;
    }

    public ViewerData getViewerData() {
        return this.f1038a;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isData() {
        return true;
    }

    public void setCustomData(CustomData customData) {
        this.f1045h = customData;
    }

    public void setCustomerPlayerData(CustomerPlayerData customerPlayerData) {
        this.f1043f = customerPlayerData;
    }

    public void setCustomerVideoData(CustomerVideoData customerVideoData) {
        this.f1041d = customerVideoData;
    }

    public void setCustomerViewData(CustomerViewData customerViewData) {
        this.f1042e = customerViewData;
    }

    public void setCustomerViewerData(CustomerViewerData customerViewerData) {
        this.f1044g = customerViewerData;
    }

    public void setEnvironmentData(EnvironmentData environmentData) {
        this.f1039b = environmentData;
    }

    public void setVideoData(VideoData videoData) {
        this.f1040c = videoData;
    }

    public void setViewerData(ViewerData viewerData) {
        this.f1038a = viewerData;
    }
}
