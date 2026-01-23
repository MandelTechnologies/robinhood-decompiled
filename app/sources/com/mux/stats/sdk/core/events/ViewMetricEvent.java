package com.mux.stats.sdk.core.events;

import com.mux.stats.sdk.core.model.ViewData;

/* loaded from: classes27.dex */
public class ViewMetricEvent extends BaseEvent {

    /* renamed from: a */
    private final ViewData f1037a;

    public ViewMetricEvent(ViewData viewData) {
        this.f1037a = viewData;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "ViewMetricEvent";
    }

    public ViewData getViewData() {
        return this.f1037a;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isViewMetric() {
        return true;
    }
}
