package com.robinhood.android.options.comboorders.detail.components.topbar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailTopbarViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarViewState;", "", "orderStatusText", "", "accountText", "expandedTitleText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderStatusText", "()Ljava/lang/String;", "getAccountText", "getExpandedTitleText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailTopbarViewState {
    public static final int $stable = 0;
    private final String accountText;
    private final String expandedTitleText;
    private final String orderStatusText;

    public static /* synthetic */ ComboOrderDetailTopbarViewState copy$default(ComboOrderDetailTopbarViewState comboOrderDetailTopbarViewState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboOrderDetailTopbarViewState.orderStatusText;
        }
        if ((i & 2) != 0) {
            str2 = comboOrderDetailTopbarViewState.accountText;
        }
        if ((i & 4) != 0) {
            str3 = comboOrderDetailTopbarViewState.expandedTitleText;
        }
        return comboOrderDetailTopbarViewState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderStatusText() {
        return this.orderStatusText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountText() {
        return this.accountText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpandedTitleText() {
        return this.expandedTitleText;
    }

    public final ComboOrderDetailTopbarViewState copy(String orderStatusText, String accountText, String expandedTitleText) {
        Intrinsics.checkNotNullParameter(orderStatusText, "orderStatusText");
        Intrinsics.checkNotNullParameter(accountText, "accountText");
        Intrinsics.checkNotNullParameter(expandedTitleText, "expandedTitleText");
        return new ComboOrderDetailTopbarViewState(orderStatusText, accountText, expandedTitleText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailTopbarViewState)) {
            return false;
        }
        ComboOrderDetailTopbarViewState comboOrderDetailTopbarViewState = (ComboOrderDetailTopbarViewState) other;
        return Intrinsics.areEqual(this.orderStatusText, comboOrderDetailTopbarViewState.orderStatusText) && Intrinsics.areEqual(this.accountText, comboOrderDetailTopbarViewState.accountText) && Intrinsics.areEqual(this.expandedTitleText, comboOrderDetailTopbarViewState.expandedTitleText);
    }

    public int hashCode() {
        return (((this.orderStatusText.hashCode() * 31) + this.accountText.hashCode()) * 31) + this.expandedTitleText.hashCode();
    }

    public String toString() {
        return "ComboOrderDetailTopbarViewState(orderStatusText=" + this.orderStatusText + ", accountText=" + this.accountText + ", expandedTitleText=" + this.expandedTitleText + ")";
    }

    public ComboOrderDetailTopbarViewState(String orderStatusText, String accountText, String expandedTitleText) {
        Intrinsics.checkNotNullParameter(orderStatusText, "orderStatusText");
        Intrinsics.checkNotNullParameter(accountText, "accountText");
        Intrinsics.checkNotNullParameter(expandedTitleText, "expandedTitleText");
        this.orderStatusText = orderStatusText;
        this.accountText = accountText;
        this.expandedTitleText = expandedTitleText;
    }

    public final String getOrderStatusText() {
        return this.orderStatusText;
    }

    public final String getAccountText() {
        return this.accountText;
    }

    public final String getExpandedTitleText() {
        return this.expandedTitleText;
    }
}
