package com.mux.stats.sdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class CustomerData extends BaseQueryData {

    /* renamed from: a */
    private CustomerPlayerData f1051a = new CustomerPlayerData();

    /* renamed from: b */
    private CustomerVideoData f1052b = new CustomerVideoData();

    /* renamed from: c */
    private CustomerViewData f1053c = new CustomerViewData();

    /* renamed from: d */
    private CustomerViewerData f1054d = new CustomerViewerData();

    /* renamed from: e */
    private CustomData f1055e = new CustomData();

    public CustomData getCustomData() {
        return this.f1055e;
    }

    public CustomerPlayerData getCustomerPlayerData() {
        return this.f1051a;
    }

    public CustomerVideoData getCustomerVideoData() {
        return this.f1052b;
    }

    public CustomerViewData getCustomerViewData() {
        return this.f1053c;
    }

    public CustomerViewerData getCustomerViewerData() {
        return this.f1054d;
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public JSONObject getMuxDictionary() throws JSONException {
        BaseQueryData baseQueryData = new BaseQueryData(this) { // from class: com.mux.stats.sdk.core.model.CustomerData.1
            @Override // com.mux.stats.sdk.core.model.BaseQueryData
            public final void sync() {
            }
        };
        baseQueryData.update(this.f1051a.getMuxDictionary());
        baseQueryData.update(this.f1052b.getMuxDictionary());
        baseQueryData.update(this.f1053c.getMuxDictionary());
        baseQueryData.update(this.f1054d.getMuxDictionary());
        baseQueryData.update(this.f1055e.getMuxDictionary());
        return baseQueryData.getMuxDictionary();
    }

    public void setCustomData(CustomData customData) {
        this.f1055e = customData;
    }

    public void setCustomerPlayerData(CustomerPlayerData customerPlayerData) {
        this.f1051a = customerPlayerData;
    }

    public void setCustomerVideoData(CustomerVideoData customerVideoData) {
        this.f1052b = customerVideoData;
    }

    public void setCustomerViewData(CustomerViewData customerViewData) {
        this.f1053c = customerViewData;
    }

    public void setCustomerViewerData(CustomerViewerData customerViewerData) {
        this.f1054d = customerViewerData;
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
