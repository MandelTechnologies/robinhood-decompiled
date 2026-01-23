package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jm\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceViewState;", "", "selectedTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "continueButtonEnabled", "", "timeInForceDetail", "Lcom/robinhood/utils/resource/StringResource;", "goodForDayTitle", "goodTilCanceledTitle", "goodForDayDetailText", "defaultTimeInForceUiEvent", "Lcom/robinhood/udf/UiEvent;", "toolbarTitle", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/utils/resource/StringResource;)V", "getSelectedTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getContinueButtonEnabled", "()Z", "getTimeInForceDetail", "()Lcom/robinhood/utils/resource/StringResource;", "getGoodForDayTitle", "getGoodTilCanceledTitle", "getGoodForDayDetailText", "getDefaultTimeInForceUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getToolbarTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderTimeInForceViewState {
    public static final int $stable = 8;
    private final boolean continueButtonEnabled;
    private final UiEvent<OrderTimeInForce> defaultTimeInForceUiEvent;
    private final StringResource goodForDayDetailText;
    private final StringResource goodForDayTitle;
    private final StringResource goodTilCanceledTitle;
    private final OrderTimeInForce selectedTimeInForce;
    private final StringResource timeInForceDetail;
    private final StringResource toolbarTitle;

    public OrderTimeInForceViewState() {
        this(null, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ OrderTimeInForceViewState copy$default(OrderTimeInForceViewState orderTimeInForceViewState, OrderTimeInForce orderTimeInForce, boolean z, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, UiEvent uiEvent, StringResource stringResource5, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTimeInForce = orderTimeInForceViewState.selectedTimeInForce;
        }
        if ((i & 2) != 0) {
            z = orderTimeInForceViewState.continueButtonEnabled;
        }
        if ((i & 4) != 0) {
            stringResource = orderTimeInForceViewState.timeInForceDetail;
        }
        if ((i & 8) != 0) {
            stringResource2 = orderTimeInForceViewState.goodForDayTitle;
        }
        if ((i & 16) != 0) {
            stringResource3 = orderTimeInForceViewState.goodTilCanceledTitle;
        }
        if ((i & 32) != 0) {
            stringResource4 = orderTimeInForceViewState.goodForDayDetailText;
        }
        if ((i & 64) != 0) {
            uiEvent = orderTimeInForceViewState.defaultTimeInForceUiEvent;
        }
        if ((i & 128) != 0) {
            stringResource5 = orderTimeInForceViewState.toolbarTitle;
        }
        UiEvent uiEvent2 = uiEvent;
        StringResource stringResource6 = stringResource5;
        StringResource stringResource7 = stringResource3;
        StringResource stringResource8 = stringResource4;
        return orderTimeInForceViewState.copy(orderTimeInForce, z, stringResource, stringResource2, stringResource7, stringResource8, uiEvent2, stringResource6);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTimeInForceDetail() {
        return this.timeInForceDetail;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getGoodForDayTitle() {
        return this.goodForDayTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getGoodTilCanceledTitle() {
        return this.goodTilCanceledTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getGoodForDayDetailText() {
        return this.goodForDayDetailText;
    }

    public final UiEvent<OrderTimeInForce> component7() {
        return this.defaultTimeInForceUiEvent;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final OrderTimeInForceViewState copy(OrderTimeInForce selectedTimeInForce, boolean continueButtonEnabled, StringResource timeInForceDetail, StringResource goodForDayTitle, StringResource goodTilCanceledTitle, StringResource goodForDayDetailText, UiEvent<OrderTimeInForce> defaultTimeInForceUiEvent, StringResource toolbarTitle) {
        return new OrderTimeInForceViewState(selectedTimeInForce, continueButtonEnabled, timeInForceDetail, goodForDayTitle, goodTilCanceledTitle, goodForDayDetailText, defaultTimeInForceUiEvent, toolbarTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTimeInForceViewState)) {
            return false;
        }
        OrderTimeInForceViewState orderTimeInForceViewState = (OrderTimeInForceViewState) other;
        return this.selectedTimeInForce == orderTimeInForceViewState.selectedTimeInForce && this.continueButtonEnabled == orderTimeInForceViewState.continueButtonEnabled && Intrinsics.areEqual(this.timeInForceDetail, orderTimeInForceViewState.timeInForceDetail) && Intrinsics.areEqual(this.goodForDayTitle, orderTimeInForceViewState.goodForDayTitle) && Intrinsics.areEqual(this.goodTilCanceledTitle, orderTimeInForceViewState.goodTilCanceledTitle) && Intrinsics.areEqual(this.goodForDayDetailText, orderTimeInForceViewState.goodForDayDetailText) && Intrinsics.areEqual(this.defaultTimeInForceUiEvent, orderTimeInForceViewState.defaultTimeInForceUiEvent) && Intrinsics.areEqual(this.toolbarTitle, orderTimeInForceViewState.toolbarTitle);
    }

    public int hashCode() {
        OrderTimeInForce orderTimeInForce = this.selectedTimeInForce;
        int iHashCode = (((orderTimeInForce == null ? 0 : orderTimeInForce.hashCode()) * 31) + Boolean.hashCode(this.continueButtonEnabled)) * 31;
        StringResource stringResource = this.timeInForceDetail;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.goodForDayTitle;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.goodTilCanceledTitle;
        int iHashCode4 = (iHashCode3 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        StringResource stringResource4 = this.goodForDayDetailText;
        int iHashCode5 = (iHashCode4 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
        UiEvent<OrderTimeInForce> uiEvent = this.defaultTimeInForceUiEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        StringResource stringResource5 = this.toolbarTitle;
        return iHashCode6 + (stringResource5 != null ? stringResource5.hashCode() : 0);
    }

    public String toString() {
        return "OrderTimeInForceViewState(selectedTimeInForce=" + this.selectedTimeInForce + ", continueButtonEnabled=" + this.continueButtonEnabled + ", timeInForceDetail=" + this.timeInForceDetail + ", goodForDayTitle=" + this.goodForDayTitle + ", goodTilCanceledTitle=" + this.goodTilCanceledTitle + ", goodForDayDetailText=" + this.goodForDayDetailText + ", defaultTimeInForceUiEvent=" + this.defaultTimeInForceUiEvent + ", toolbarTitle=" + this.toolbarTitle + ")";
    }

    public OrderTimeInForceViewState(OrderTimeInForce orderTimeInForce, boolean z, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, UiEvent<OrderTimeInForce> uiEvent, StringResource stringResource5) {
        this.selectedTimeInForce = orderTimeInForce;
        this.continueButtonEnabled = z;
        this.timeInForceDetail = stringResource;
        this.goodForDayTitle = stringResource2;
        this.goodTilCanceledTitle = stringResource3;
        this.goodForDayDetailText = stringResource4;
        this.defaultTimeInForceUiEvent = uiEvent;
        this.toolbarTitle = stringResource5;
    }

    public /* synthetic */ OrderTimeInForceViewState(OrderTimeInForce orderTimeInForce, boolean z, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, UiEvent uiEvent, StringResource stringResource5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderTimeInForce, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : stringResource, (i & 8) != 0 ? null : stringResource2, (i & 16) != 0 ? null : stringResource3, (i & 32) != 0 ? null : stringResource4, (i & 64) != 0 ? null : uiEvent, (i & 128) != 0 ? null : stringResource5);
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    public final StringResource getTimeInForceDetail() {
        return this.timeInForceDetail;
    }

    public final StringResource getGoodForDayTitle() {
        return this.goodForDayTitle;
    }

    public final StringResource getGoodTilCanceledTitle() {
        return this.goodTilCanceledTitle;
    }

    public final StringResource getGoodForDayDetailText() {
        return this.goodForDayDetailText;
    }

    public final UiEvent<OrderTimeInForce> getDefaultTimeInForceUiEvent() {
        return this.defaultTimeInForceUiEvent;
    }

    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }
}
