package com.robinhood.android.trade.options.confirmation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionsCancelNewContextData;", "", "currentOrderId", "", "orderToReplaceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentOrderId", "()Ljava/lang/String;", "getOrderToReplaceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionsCancelNewContextData {
    public static final int $stable = 0;
    private final String currentOrderId;
    private final String orderToReplaceId;

    public static /* synthetic */ OptionsCancelNewContextData copy$default(OptionsCancelNewContextData optionsCancelNewContextData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsCancelNewContextData.currentOrderId;
        }
        if ((i & 2) != 0) {
            str2 = optionsCancelNewContextData.orderToReplaceId;
        }
        return optionsCancelNewContextData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentOrderId() {
        return this.currentOrderId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderToReplaceId() {
        return this.orderToReplaceId;
    }

    public final OptionsCancelNewContextData copy(String currentOrderId, String orderToReplaceId) {
        return new OptionsCancelNewContextData(currentOrderId, orderToReplaceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsCancelNewContextData)) {
            return false;
        }
        OptionsCancelNewContextData optionsCancelNewContextData = (OptionsCancelNewContextData) other;
        return Intrinsics.areEqual(this.currentOrderId, optionsCancelNewContextData.currentOrderId) && Intrinsics.areEqual(this.orderToReplaceId, optionsCancelNewContextData.orderToReplaceId);
    }

    public int hashCode() {
        String str = this.currentOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderToReplaceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OptionsCancelNewContextData(currentOrderId=" + this.currentOrderId + ", orderToReplaceId=" + this.orderToReplaceId + ")";
    }

    public OptionsCancelNewContextData(String str, String str2) {
        this.currentOrderId = str;
        this.orderToReplaceId = str2;
    }

    public final String getCurrentOrderId() {
        return this.currentOrderId;
    }

    public final String getOrderToReplaceId() {
        return this.orderToReplaceId;
    }
}
