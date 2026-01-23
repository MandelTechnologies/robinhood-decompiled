package com.robinhood.android.trade.options;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderStopTriggerPriceRowView.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderStopTriggerPriceRowState;", "", "title", "", "subtitle", "textInputRawValue", "textInputRawHint", "enabled", "", "shouldRequestFocusStopTriggerPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTextInputRawValue", "getTextInputRawHint", "getEnabled", "()Z", "getShouldRequestFocusStopTriggerPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderStopTriggerPriceRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean shouldRequestFocusStopTriggerPrice;
    private final String subtitle;
    private final String textInputRawHint;
    private final String textInputRawValue;
    private final String title;

    public static /* synthetic */ OptionOrderStopTriggerPriceRowState copy$default(OptionOrderStopTriggerPriceRowState optionOrderStopTriggerPriceRowState, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderStopTriggerPriceRowState.title;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderStopTriggerPriceRowState.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderStopTriggerPriceRowState.textInputRawValue;
        }
        if ((i & 8) != 0) {
            str4 = optionOrderStopTriggerPriceRowState.textInputRawHint;
        }
        if ((i & 16) != 0) {
            z = optionOrderStopTriggerPriceRowState.enabled;
        }
        if ((i & 32) != 0) {
            z2 = optionOrderStopTriggerPriceRowState.shouldRequestFocusStopTriggerPrice;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return optionOrderStopTriggerPriceRowState.copy(str, str2, str3, str4, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextInputRawValue() {
        return this.textInputRawValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextInputRawHint() {
        return this.textInputRawHint;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldRequestFocusStopTriggerPrice() {
        return this.shouldRequestFocusStopTriggerPrice;
    }

    public final OptionOrderStopTriggerPriceRowState copy(String title, String subtitle, String textInputRawValue, String textInputRawHint, boolean enabled, boolean shouldRequestFocusStopTriggerPrice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textInputRawValue, "textInputRawValue");
        Intrinsics.checkNotNullParameter(textInputRawHint, "textInputRawHint");
        return new OptionOrderStopTriggerPriceRowState(title, subtitle, textInputRawValue, textInputRawHint, enabled, shouldRequestFocusStopTriggerPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderStopTriggerPriceRowState)) {
            return false;
        }
        OptionOrderStopTriggerPriceRowState optionOrderStopTriggerPriceRowState = (OptionOrderStopTriggerPriceRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderStopTriggerPriceRowState.title) && Intrinsics.areEqual(this.subtitle, optionOrderStopTriggerPriceRowState.subtitle) && Intrinsics.areEqual(this.textInputRawValue, optionOrderStopTriggerPriceRowState.textInputRawValue) && Intrinsics.areEqual(this.textInputRawHint, optionOrderStopTriggerPriceRowState.textInputRawHint) && this.enabled == optionOrderStopTriggerPriceRowState.enabled && this.shouldRequestFocusStopTriggerPrice == optionOrderStopTriggerPriceRowState.shouldRequestFocusStopTriggerPrice;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.textInputRawValue.hashCode()) * 31) + this.textInputRawHint.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.shouldRequestFocusStopTriggerPrice);
    }

    public String toString() {
        return "OptionOrderStopTriggerPriceRowState(title=" + this.title + ", subtitle=" + this.subtitle + ", textInputRawValue=" + this.textInputRawValue + ", textInputRawHint=" + this.textInputRawHint + ", enabled=" + this.enabled + ", shouldRequestFocusStopTriggerPrice=" + this.shouldRequestFocusStopTriggerPrice + ")";
    }

    public OptionOrderStopTriggerPriceRowState(String title, String subtitle, String textInputRawValue, String textInputRawHint, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textInputRawValue, "textInputRawValue");
        Intrinsics.checkNotNullParameter(textInputRawHint, "textInputRawHint");
        this.title = title;
        this.subtitle = subtitle;
        this.textInputRawValue = textInputRawValue;
        this.textInputRawHint = textInputRawHint;
        this.enabled = z;
        this.shouldRequestFocusStopTriggerPrice = z2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTextInputRawValue() {
        return this.textInputRawValue;
    }

    public final String getTextInputRawHint() {
        return this.textInputRawHint;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getShouldRequestFocusStopTriggerPrice() {
        return this.shouldRequestFocusStopTriggerPrice;
    }
}
