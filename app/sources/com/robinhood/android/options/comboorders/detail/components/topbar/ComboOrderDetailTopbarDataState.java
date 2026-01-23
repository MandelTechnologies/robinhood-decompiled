package com.robinhood.android.options.comboorders.detail.components.topbar;

import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailTopbarDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDataState;", "", "accountText", "Lcom/robinhood/utils/resource/StringResource;", "symbolText", "", "orderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/shared/models/history/shared/OrderState;)V", "getAccountText", "()Lcom/robinhood/utils/resource/StringResource;", "getSymbolText", "()Ljava/lang/String;", "getOrderState", "()Lcom/robinhood/shared/models/history/shared/OrderState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailTopbarDataState {
    public static final int $stable = StringResource.$stable;
    private final StringResource accountText;
    private final OrderState orderState;
    private final String symbolText;

    public ComboOrderDetailTopbarDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ComboOrderDetailTopbarDataState copy$default(ComboOrderDetailTopbarDataState comboOrderDetailTopbarDataState, StringResource stringResource, String str, OrderState orderState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = comboOrderDetailTopbarDataState.accountText;
        }
        if ((i & 2) != 0) {
            str = comboOrderDetailTopbarDataState.symbolText;
        }
        if ((i & 4) != 0) {
            orderState = comboOrderDetailTopbarDataState.orderState;
        }
        return comboOrderDetailTopbarDataState.copy(stringResource, str, orderState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getAccountText() {
        return this.accountText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbolText() {
        return this.symbolText;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderState getOrderState() {
        return this.orderState;
    }

    public final ComboOrderDetailTopbarDataState copy(StringResource accountText, String symbolText, OrderState orderState) {
        return new ComboOrderDetailTopbarDataState(accountText, symbolText, orderState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailTopbarDataState)) {
            return false;
        }
        ComboOrderDetailTopbarDataState comboOrderDetailTopbarDataState = (ComboOrderDetailTopbarDataState) other;
        return Intrinsics.areEqual(this.accountText, comboOrderDetailTopbarDataState.accountText) && Intrinsics.areEqual(this.symbolText, comboOrderDetailTopbarDataState.symbolText) && this.orderState == comboOrderDetailTopbarDataState.orderState;
    }

    public int hashCode() {
        StringResource stringResource = this.accountText;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        String str = this.symbolText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OrderState orderState = this.orderState;
        return iHashCode2 + (orderState != null ? orderState.hashCode() : 0);
    }

    public String toString() {
        return "ComboOrderDetailTopbarDataState(accountText=" + this.accountText + ", symbolText=" + this.symbolText + ", orderState=" + this.orderState + ")";
    }

    public ComboOrderDetailTopbarDataState(StringResource stringResource, String str, OrderState orderState) {
        this.accountText = stringResource;
        this.symbolText = str;
        this.orderState = orderState;
    }

    public /* synthetic */ ComboOrderDetailTopbarDataState(StringResource stringResource, String str, OrderState orderState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stringResource, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : orderState);
    }

    public final StringResource getAccountText() {
        return this.accountText;
    }

    public final String getSymbolText() {
        return this.symbolText;
    }

    public final OrderState getOrderState() {
        return this.orderState;
    }
}
