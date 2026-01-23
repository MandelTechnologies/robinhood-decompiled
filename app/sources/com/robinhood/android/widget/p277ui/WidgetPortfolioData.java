package com.robinhood.android.widget.p277ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetPortfolioData.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WidgetPortfolioData;", "", "primaryValue", "", "secondaryValue", "isUp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPrimaryValue", "()Ljava/lang/String;", "getSecondaryValue", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WidgetPortfolioData {
    private final boolean isUp;
    private final String primaryValue;
    private final String secondaryValue;

    public static /* synthetic */ WidgetPortfolioData copy$default(WidgetPortfolioData widgetPortfolioData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetPortfolioData.primaryValue;
        }
        if ((i & 2) != 0) {
            str2 = widgetPortfolioData.secondaryValue;
        }
        if ((i & 4) != 0) {
            z = widgetPortfolioData.isUp;
        }
        return widgetPortfolioData.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryValue() {
        return this.primaryValue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryValue() {
        return this.secondaryValue;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUp() {
        return this.isUp;
    }

    public final WidgetPortfolioData copy(String primaryValue, String secondaryValue, boolean isUp) {
        Intrinsics.checkNotNullParameter(primaryValue, "primaryValue");
        Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
        return new WidgetPortfolioData(primaryValue, secondaryValue, isUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetPortfolioData)) {
            return false;
        }
        WidgetPortfolioData widgetPortfolioData = (WidgetPortfolioData) other;
        return Intrinsics.areEqual(this.primaryValue, widgetPortfolioData.primaryValue) && Intrinsics.areEqual(this.secondaryValue, widgetPortfolioData.secondaryValue) && this.isUp == widgetPortfolioData.isUp;
    }

    public int hashCode() {
        return (((this.primaryValue.hashCode() * 31) + this.secondaryValue.hashCode()) * 31) + Boolean.hashCode(this.isUp);
    }

    public String toString() {
        return "WidgetPortfolioData(primaryValue=" + this.primaryValue + ", secondaryValue=" + this.secondaryValue + ", isUp=" + this.isUp + ")";
    }

    public WidgetPortfolioData(String primaryValue, String secondaryValue, boolean z) {
        Intrinsics.checkNotNullParameter(primaryValue, "primaryValue");
        Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;
        this.isUp = z;
    }

    public final String getPrimaryValue() {
        return this.primaryValue;
    }

    public final String getSecondaryValue() {
        return this.secondaryValue;
    }

    public final boolean isUp() {
        return this.isUp;
    }
}
