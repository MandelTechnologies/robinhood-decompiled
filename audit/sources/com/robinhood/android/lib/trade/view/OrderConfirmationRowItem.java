package com.robinhood.android.lib.trade.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfirmationRowItem.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRow;", "labelText", "", "labelMeta", "", "valueText", "valueMeta", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getLabelText", "()Ljava/lang/String;", "getLabelMeta", "()Ljava/lang/CharSequence;", "getValueText", "getValueMeta", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderConfirmationRowItem implements OrderConfirmationRowItem2 {
    public static final int $stable = 8;
    private final CharSequence labelMeta;
    private final String labelText;
    private final CharSequence valueMeta;
    private final CharSequence valueText;

    public static /* synthetic */ OrderConfirmationRowItem copy$default(OrderConfirmationRowItem orderConfirmationRowItem, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderConfirmationRowItem.labelText;
        }
        if ((i & 2) != 0) {
            charSequence = orderConfirmationRowItem.labelMeta;
        }
        if ((i & 4) != 0) {
            charSequence2 = orderConfirmationRowItem.valueText;
        }
        if ((i & 8) != 0) {
            charSequence3 = orderConfirmationRowItem.valueMeta;
        }
        return orderConfirmationRowItem.copy(str, charSequence, charSequence2, charSequence3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getLabelMeta() {
        return this.labelMeta;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getValueText() {
        return this.valueText;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getValueMeta() {
        return this.valueMeta;
    }

    public final OrderConfirmationRowItem copy(String labelText, CharSequence labelMeta, CharSequence valueText, CharSequence valueMeta) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        return new OrderConfirmationRowItem(labelText, labelMeta, valueText, valueMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfirmationRowItem)) {
            return false;
        }
        OrderConfirmationRowItem orderConfirmationRowItem = (OrderConfirmationRowItem) other;
        return Intrinsics.areEqual(this.labelText, orderConfirmationRowItem.labelText) && Intrinsics.areEqual(this.labelMeta, orderConfirmationRowItem.labelMeta) && Intrinsics.areEqual(this.valueText, orderConfirmationRowItem.valueText) && Intrinsics.areEqual(this.valueMeta, orderConfirmationRowItem.valueMeta);
    }

    public int hashCode() {
        int iHashCode = this.labelText.hashCode() * 31;
        CharSequence charSequence = this.labelMeta;
        int iHashCode2 = (((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.valueText.hashCode()) * 31;
        CharSequence charSequence2 = this.valueMeta;
        return iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public String toString() {
        return "OrderConfirmationRowItem(labelText=" + this.labelText + ", labelMeta=" + ((Object) this.labelMeta) + ", valueText=" + ((Object) this.valueText) + ", valueMeta=" + ((Object) this.valueMeta) + ")";
    }

    public OrderConfirmationRowItem(String labelText, CharSequence charSequence, CharSequence valueText, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        this.labelText = labelText;
        this.labelMeta = charSequence;
        this.valueText = valueText;
        this.valueMeta = charSequence2;
    }

    public /* synthetic */ OrderConfirmationRowItem(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3);
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final CharSequence getLabelMeta() {
        return this.labelMeta;
    }

    public final CharSequence getValueText() {
        return this.valueText;
    }

    public final CharSequence getValueMeta() {
        return this.valueMeta;
    }
}
