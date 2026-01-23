package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorOrderRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "", "<init>", "()V", "OrderTypeRow", "BaseRowWithViewState", "Header", "MonetizationModelPreference", "RowViewState", "TapAction", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$BaseRowWithViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$Header;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$MonetizationModelPreference;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$OrderTypeRow;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoOrderTypeSelectorViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderTypeSelectorViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderTypeSelectorViewState2() {
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$OrderTypeRow;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeSelectorOrderRowState;", "tapAction", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "analyticsComponentIdentifier", "", "analyticsOrderKindType", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeSelectorOrderRowState;Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeSelectorOrderRowState;", "getTapAction", "()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "getAnalyticsComponentIdentifier", "()Ljava/lang/String;", "getAnalyticsOrderKindType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$OrderTypeRow, reason: from toString */
    public static final /* data */ class OrderTypeRow extends CryptoOrderTypeSelectorViewState2 {
        public static final int $stable = CryptoOrderTypeSelectorOrderRowState.$stable;
        private final String analyticsComponentIdentifier;
        private final String analyticsOrderKindType;
        private final CryptoOrderTypeSelectorOrderRowState state;
        private final TapAction tapAction;

        public static /* synthetic */ OrderTypeRow copy$default(OrderTypeRow orderTypeRow, CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorRow, TapAction tapAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderTypeSelectorRow = orderTypeRow.state;
            }
            if ((i & 2) != 0) {
                tapAction = orderTypeRow.tapAction;
            }
            if ((i & 4) != 0) {
                str = orderTypeRow.analyticsComponentIdentifier;
            }
            if ((i & 8) != 0) {
                str2 = orderTypeRow.analyticsOrderKindType;
            }
            return orderTypeRow.copy(cryptoOrderTypeSelectorRow, tapAction, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderTypeSelectorOrderRowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final TapAction getTapAction() {
            return this.tapAction;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnalyticsComponentIdentifier() {
            return this.analyticsComponentIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsOrderKindType() {
            return this.analyticsOrderKindType;
        }

        public final OrderTypeRow copy(CryptoOrderTypeSelectorOrderRowState state, TapAction tapAction, String analyticsComponentIdentifier, String analyticsOrderKindType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(analyticsComponentIdentifier, "analyticsComponentIdentifier");
            Intrinsics.checkNotNullParameter(analyticsOrderKindType, "analyticsOrderKindType");
            return new OrderTypeRow(state, tapAction, analyticsComponentIdentifier, analyticsOrderKindType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderTypeRow)) {
                return false;
            }
            OrderTypeRow orderTypeRow = (OrderTypeRow) other;
            return Intrinsics.areEqual(this.state, orderTypeRow.state) && Intrinsics.areEqual(this.tapAction, orderTypeRow.tapAction) && Intrinsics.areEqual(this.analyticsComponentIdentifier, orderTypeRow.analyticsComponentIdentifier) && Intrinsics.areEqual(this.analyticsOrderKindType, orderTypeRow.analyticsOrderKindType);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            TapAction tapAction = this.tapAction;
            return ((((iHashCode + (tapAction == null ? 0 : tapAction.hashCode())) * 31) + this.analyticsComponentIdentifier.hashCode()) * 31) + this.analyticsOrderKindType.hashCode();
        }

        public String toString() {
            return "OrderTypeRow(state=" + this.state + ", tapAction=" + this.tapAction + ", analyticsComponentIdentifier=" + this.analyticsComponentIdentifier + ", analyticsOrderKindType=" + this.analyticsOrderKindType + ")";
        }

        public final CryptoOrderTypeSelectorOrderRowState getState() {
            return this.state;
        }

        public final TapAction getTapAction() {
            return this.tapAction;
        }

        public /* synthetic */ OrderTypeRow(CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorRow, TapAction tapAction, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoOrderTypeSelectorRow, tapAction, (i & 4) != 0 ? "" : str, str2);
        }

        public final String getAnalyticsComponentIdentifier() {
            return this.analyticsComponentIdentifier;
        }

        public final String getAnalyticsOrderKindType() {
            return this.analyticsOrderKindType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderTypeRow(CryptoOrderTypeSelectorOrderRowState state, TapAction tapAction, String analyticsComponentIdentifier, String analyticsOrderKindType) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(analyticsComponentIdentifier, "analyticsComponentIdentifier");
            Intrinsics.checkNotNullParameter(analyticsOrderKindType, "analyticsOrderKindType");
            this.state = state;
            this.tapAction = tapAction;
            this.analyticsComponentIdentifier = analyticsComponentIdentifier;
            this.analyticsOrderKindType = analyticsOrderKindType;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$BaseRowWithViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "rowViewState", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "tapAction", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;)V", "getRowViewState", "()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "getTapAction", "()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$BaseRowWithViewState, reason: from toString */
    public static final /* data */ class BaseRowWithViewState extends CryptoOrderTypeSelectorViewState2 {
        public static final int $stable = 8;
        private final RowViewState rowViewState;
        private final TapAction tapAction;

        public static /* synthetic */ BaseRowWithViewState copy$default(BaseRowWithViewState baseRowWithViewState, RowViewState rowViewState, TapAction tapAction, int i, Object obj) {
            if ((i & 1) != 0) {
                rowViewState = baseRowWithViewState.rowViewState;
            }
            if ((i & 2) != 0) {
                tapAction = baseRowWithViewState.tapAction;
            }
            return baseRowWithViewState.copy(rowViewState, tapAction);
        }

        /* renamed from: component1, reason: from getter */
        public final RowViewState getRowViewState() {
            return this.rowViewState;
        }

        /* renamed from: component2, reason: from getter */
        public final TapAction getTapAction() {
            return this.tapAction;
        }

        public final BaseRowWithViewState copy(RowViewState rowViewState, TapAction tapAction) {
            Intrinsics.checkNotNullParameter(rowViewState, "rowViewState");
            Intrinsics.checkNotNullParameter(tapAction, "tapAction");
            return new BaseRowWithViewState(rowViewState, tapAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseRowWithViewState)) {
                return false;
            }
            BaseRowWithViewState baseRowWithViewState = (BaseRowWithViewState) other;
            return Intrinsics.areEqual(this.rowViewState, baseRowWithViewState.rowViewState) && Intrinsics.areEqual(this.tapAction, baseRowWithViewState.tapAction);
        }

        public int hashCode() {
            return (this.rowViewState.hashCode() * 31) + this.tapAction.hashCode();
        }

        public String toString() {
            return "BaseRowWithViewState(rowViewState=" + this.rowViewState + ", tapAction=" + this.tapAction + ")";
        }

        public final RowViewState getRowViewState() {
            return this.rowViewState;
        }

        public final TapAction getTapAction() {
            return this.tapAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseRowWithViewState(RowViewState rowViewState, TapAction tapAction) {
            super(null);
            Intrinsics.checkNotNullParameter(rowViewState, "rowViewState");
            Intrinsics.checkNotNullParameter(tapAction, "tapAction");
            this.rowViewState = rowViewState;
            this.tapAction = tapAction;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$Header;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$Header, reason: from toString */
    public static final /* data */ class Header extends CryptoOrderTypeSelectorViewState2 {
        public static final int $stable = StringResource.$stable;
        private final StringResource text;

        public static /* synthetic */ Header copy$default(Header header, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = header.text;
            }
            return header.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        public final Header copy(StringResource text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Header(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && Intrinsics.areEqual(this.text, ((Header) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Header(text=" + this.text + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(StringResource text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final StringResource getText() {
            return this.text;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$MonetizationModelPreference;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isMonetizationModelPreferenceFee", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Z)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$MonetizationModelPreference, reason: from toString */
    public static final /* data */ class MonetizationModelPreference extends CryptoOrderTypeSelectorViewState2 {
        public static final int $stable = 8;
        private final boolean isMonetizationModelPreferenceFee;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ MonetizationModelPreference copy$default(MonetizationModelPreference monetizationModelPreference, UiCurrencyPair uiCurrencyPair, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = monetizationModelPreference.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                z = monetizationModelPreference.isMonetizationModelPreferenceFee;
            }
            return monetizationModelPreference.copy(uiCurrencyPair, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMonetizationModelPreferenceFee() {
            return this.isMonetizationModelPreferenceFee;
        }

        public final MonetizationModelPreference copy(UiCurrencyPair uiCurrencyPair, boolean isMonetizationModelPreferenceFee) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            return new MonetizationModelPreference(uiCurrencyPair, isMonetizationModelPreferenceFee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MonetizationModelPreference)) {
                return false;
            }
            MonetizationModelPreference monetizationModelPreference = (MonetizationModelPreference) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, monetizationModelPreference.uiCurrencyPair) && this.isMonetizationModelPreferenceFee == monetizationModelPreference.isMonetizationModelPreferenceFee;
        }

        public int hashCode() {
            return (this.uiCurrencyPair.hashCode() * 31) + Boolean.hashCode(this.isMonetizationModelPreferenceFee);
        }

        public String toString() {
            return "MonetizationModelPreference(uiCurrencyPair=" + this.uiCurrencyPair + ", isMonetizationModelPreferenceFee=" + this.isMonetizationModelPreferenceFee + ")";
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final boolean isMonetizationModelPreferenceFee() {
            return this.isMonetizationModelPreferenceFee;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MonetizationModelPreference(UiCurrencyPair uiCurrencyPair, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            this.uiCurrencyPair = uiCurrencyPair;
            this.isMonetizationModelPreferenceFee = z;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B;\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "", "isEnabled", "", "titleString", "Lcom/robinhood/utils/resource/StringResource;", "subTitleString", "isDividerVisible", "iconRes", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZILcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "()Z", "getTitleString", "()Lcom/robinhood/utils/resource/StringResource;", "getSubTitleString", "getIconRes", "()I", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "MarketQuote", "MarketAmount", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState$MarketAmount;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState$MarketQuote;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$RowViewState */
    public static abstract class RowViewState {
        public static final int $stable = 8;
        private final int iconRes;
        private final boolean isDividerVisible;
        private final boolean isEnabled;
        private final StringResource subTitleString;
        private final StringResource titleString;
        private final UiCurrencyPair uiCurrencyPair;

        public /* synthetic */ RowViewState(boolean z, StringResource stringResource, StringResource stringResource2, boolean z2, int i, UiCurrencyPair uiCurrencyPair, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, stringResource, stringResource2, z2, i, uiCurrencyPair);
        }

        private RowViewState(boolean z, StringResource stringResource, StringResource stringResource2, boolean z2, int i, UiCurrencyPair uiCurrencyPair) {
            this.isEnabled = z;
            this.titleString = stringResource;
            this.subTitleString = stringResource2;
            this.isDividerVisible = z2;
            this.iconRes = i;
            this.uiCurrencyPair = uiCurrencyPair;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final StringResource getTitleString() {
            return this.titleString;
        }

        public final StringResource getSubTitleString() {
            return this.subTitleString;
        }

        /* renamed from: isDividerVisible, reason: from getter */
        public final boolean getIsDividerVisible() {
            return this.isDividerVisible;
        }

        public final int getIconRes() {
            return this.iconRes;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J\u000e\u0010\u0012\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState$MarketQuote;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "minFiatAskAmount", "", "minFiatBidAmount", "isRhcApp", "", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Ljava/lang/String;Z)V", "getMinFiatAskAmount$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getMinFiatBidAmount$feature_trade_crypto_externalDebug", "component1", "component2", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$RowViewState$MarketQuote, reason: from toString */
        public static final /* data */ class MarketQuote extends RowViewState {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final boolean isRhcApp;
            private final String minFiatAskAmount;
            private final String minFiatBidAmount;
            private final OrderSide orderSide;

            /* compiled from: CryptoOrderTypeSelectorViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$RowViewState$MarketQuote$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderSide.values().length];
                    try {
                        iArr[OrderSide.BUY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderSide.SELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final OrderSide getOrderSide() {
                return this.orderSide;
            }

            /* renamed from: component2, reason: from getter */
            private final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component5, reason: from getter */
            private final boolean getIsRhcApp() {
                return this.isRhcApp;
            }

            public static /* synthetic */ MarketQuote copy$default(MarketQuote marketQuote, OrderSide orderSide, UiCurrencyPair uiCurrencyPair, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderSide = marketQuote.orderSide;
                }
                if ((i & 2) != 0) {
                    uiCurrencyPair = marketQuote.currencyPair;
                }
                if ((i & 4) != 0) {
                    str = marketQuote.minFiatAskAmount;
                }
                if ((i & 8) != 0) {
                    str2 = marketQuote.minFiatBidAmount;
                }
                if ((i & 16) != 0) {
                    z = marketQuote.isRhcApp;
                }
                boolean z2 = z;
                String str3 = str;
                return marketQuote.copy(orderSide, uiCurrencyPair, str3, str2, z2);
            }

            /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
            public final String getMinFiatAskAmount() {
                return this.minFiatAskAmount;
            }

            /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
            public final String getMinFiatBidAmount() {
                return this.minFiatBidAmount;
            }

            public final MarketQuote copy(OrderSide orderSide, UiCurrencyPair currencyPair, String minFiatAskAmount, String minFiatBidAmount, boolean isRhcApp) {
                Intrinsics.checkNotNullParameter(orderSide, "orderSide");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(minFiatAskAmount, "minFiatAskAmount");
                Intrinsics.checkNotNullParameter(minFiatBidAmount, "minFiatBidAmount");
                return new MarketQuote(orderSide, currencyPair, minFiatAskAmount, minFiatBidAmount, isRhcApp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarketQuote)) {
                    return false;
                }
                MarketQuote marketQuote = (MarketQuote) other;
                return this.orderSide == marketQuote.orderSide && Intrinsics.areEqual(this.currencyPair, marketQuote.currencyPair) && Intrinsics.areEqual(this.minFiatAskAmount, marketQuote.minFiatAskAmount) && Intrinsics.areEqual(this.minFiatBidAmount, marketQuote.minFiatBidAmount) && this.isRhcApp == marketQuote.isRhcApp;
            }

            public int hashCode() {
                return (((((((this.orderSide.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.minFiatAskAmount.hashCode()) * 31) + this.minFiatBidAmount.hashCode()) * 31) + Boolean.hashCode(this.isRhcApp);
            }

            public String toString() {
                return "MarketQuote(orderSide=" + this.orderSide + ", currencyPair=" + this.currencyPair + ", minFiatAskAmount=" + this.minFiatAskAmount + ", minFiatBidAmount=" + this.minFiatBidAmount + ", isRhcApp=" + this.isRhcApp + ")";
            }

            public final String getMinFiatAskAmount$feature_trade_crypto_externalDebug() {
                return this.minFiatAskAmount;
            }

            public final String getMinFiatBidAmount$feature_trade_crypto_externalDebug() {
                return this.minFiatBidAmount;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public MarketQuote(OrderSide orderSide, UiCurrencyPair currencyPair, String minFiatAskAmount, String minFiatBidAmount, boolean z) {
                StringResource stringResourceInvoke;
                StringResource stringResourceInvoke2;
                Intrinsics.checkNotNullParameter(orderSide, "orderSide");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(minFiatAskAmount, "minFiatAskAmount");
                Intrinsics.checkNotNullParameter(minFiatBidAmount, "minFiatBidAmount");
                if (z) {
                    int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
                    if (i == 1) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_buy_in, currencyPair.getQuoteCurrency().getCode());
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_sell_in, currencyPair.getQuoteCurrency().getCode());
                    }
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_type_market_order_title, currencyPair.getQuoteCurrency().getCode());
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.rhc_order_type_description, minFiatBidAmount);
                    } else {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.order_type_sell_in_dollar_description, currencyPair.getAssetCurrency().getCode(), minFiatBidAmount);
                    }
                } else if (z) {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.rhc_order_type_description, minFiatAskAmount);
                } else {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.order_type_buy_in_dollar_description, currencyPair.getAssetCurrency().getCode(), minFiatAskAmount);
                }
                super(true, stringResourceInvoke, stringResourceInvoke2, true, currencyPair.getQuoteCurrency().isEur() ? C20690R.drawable.pict_clr_rds_order_types_buy_with_euros : C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars, currencyPair, null);
                this.orderSide = orderSide;
                this.currencyPair = currencyPair;
                this.minFiatAskAmount = minFiatAskAmount;
                this.minFiatBidAmount = minFiatBidAmount;
                this.isRhcApp = z;
            }
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J\u000e\u0010\u0012\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState$MarketAmount;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "minAssetAskAmount", "", "minAssetBidAmount", "isRhcApp", "", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Ljava/lang/String;Z)V", "getMinAssetAskAmount$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getMinAssetBidAmount$feature_trade_crypto_externalDebug", "component1", "component2", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$RowViewState$MarketAmount, reason: from toString */
        public static final /* data */ class MarketAmount extends RowViewState {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final boolean isRhcApp;
            private final String minAssetAskAmount;
            private final String minAssetBidAmount;
            private final OrderSide orderSide;

            /* compiled from: CryptoOrderTypeSelectorViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$RowViewState$MarketAmount$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderSide.values().length];
                    try {
                        iArr[OrderSide.BUY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderSide.SELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final OrderSide getOrderSide() {
                return this.orderSide;
            }

            /* renamed from: component2, reason: from getter */
            private final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component5, reason: from getter */
            private final boolean getIsRhcApp() {
                return this.isRhcApp;
            }

            public static /* synthetic */ MarketAmount copy$default(MarketAmount marketAmount, OrderSide orderSide, UiCurrencyPair uiCurrencyPair, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderSide = marketAmount.orderSide;
                }
                if ((i & 2) != 0) {
                    uiCurrencyPair = marketAmount.currencyPair;
                }
                if ((i & 4) != 0) {
                    str = marketAmount.minAssetAskAmount;
                }
                if ((i & 8) != 0) {
                    str2 = marketAmount.minAssetBidAmount;
                }
                if ((i & 16) != 0) {
                    z = marketAmount.isRhcApp;
                }
                boolean z2 = z;
                String str3 = str;
                return marketAmount.copy(orderSide, uiCurrencyPair, str3, str2, z2);
            }

            /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
            public final String getMinAssetAskAmount() {
                return this.minAssetAskAmount;
            }

            /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
            public final String getMinAssetBidAmount() {
                return this.minAssetBidAmount;
            }

            public final MarketAmount copy(OrderSide orderSide, UiCurrencyPair currencyPair, String minAssetAskAmount, String minAssetBidAmount, boolean isRhcApp) {
                Intrinsics.checkNotNullParameter(orderSide, "orderSide");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(minAssetAskAmount, "minAssetAskAmount");
                Intrinsics.checkNotNullParameter(minAssetBidAmount, "minAssetBidAmount");
                return new MarketAmount(orderSide, currencyPair, minAssetAskAmount, minAssetBidAmount, isRhcApp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarketAmount)) {
                    return false;
                }
                MarketAmount marketAmount = (MarketAmount) other;
                return this.orderSide == marketAmount.orderSide && Intrinsics.areEqual(this.currencyPair, marketAmount.currencyPair) && Intrinsics.areEqual(this.minAssetAskAmount, marketAmount.minAssetAskAmount) && Intrinsics.areEqual(this.minAssetBidAmount, marketAmount.minAssetBidAmount) && this.isRhcApp == marketAmount.isRhcApp;
            }

            public int hashCode() {
                return (((((((this.orderSide.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.minAssetAskAmount.hashCode()) * 31) + this.minAssetBidAmount.hashCode()) * 31) + Boolean.hashCode(this.isRhcApp);
            }

            public String toString() {
                return "MarketAmount(orderSide=" + this.orderSide + ", currencyPair=" + this.currencyPair + ", minAssetAskAmount=" + this.minAssetAskAmount + ", minAssetBidAmount=" + this.minAssetBidAmount + ", isRhcApp=" + this.isRhcApp + ")";
            }

            public final String getMinAssetAskAmount$feature_trade_crypto_externalDebug() {
                return this.minAssetAskAmount;
            }

            public final String getMinAssetBidAmount$feature_trade_crypto_externalDebug() {
                return this.minAssetBidAmount;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public MarketAmount(OrderSide orderSide, UiCurrencyPair currencyPair, String minAssetAskAmount, String minAssetBidAmount, boolean z) {
                StringResource stringResourceInvoke;
                StringResource stringResourceInvoke2;
                Intrinsics.checkNotNullParameter(orderSide, "orderSide");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(minAssetAskAmount, "minAssetAskAmount");
                Intrinsics.checkNotNullParameter(minAssetBidAmount, "minAssetBidAmount");
                if (z) {
                    int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
                    if (i == 1) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_buy_in, currencyPair.getAssetCurrency().getCode());
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.order_type_sell_in, currencyPair.getAssetCurrency().getCode());
                    }
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_type_market_order_title, currencyPair.getAssetCurrency().getCode());
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.rhc_order_type_description, minAssetBidAmount);
                    } else {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.order_type_sell_in_coin_description, currencyPair.getAssetCurrency().getCode(), minAssetBidAmount);
                    }
                } else if (z) {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.rhc_order_type_description, minAssetAskAmount);
                } else {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.order_type_buy_in_coin_description, currencyPair.getAssetCurrency().getCode(), minAssetAskAmount);
                }
                super(true, stringResourceInvoke, stringResourceInvoke2, true, C20690R.drawable.pict_clr_rds_order_types_buy_in_shares, currencyPair, null);
                this.orderSide = orderSide;
                this.currencyPair = currencyPair;
                this.minAssetAskAmount = minAssetAskAmount;
                this.minAssetBidAmount = minAssetBidAmount;
                this.isRhcApp = z;
            }
        }
    }

    /* compiled from: CryptoOrderTypeSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "", "<init>", "()V", "SelectOrderType", "TaxLotSelected", "ShowTaxLotDisabledAlert", "RecurringInvestmentSelected", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$RecurringInvestmentSelected;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$SelectOrderType;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$ShowTaxLotDisabledAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$TaxLotSelected;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$TapAction */
    public static abstract class TapAction {
        public static final int $stable = 0;

        public /* synthetic */ TapAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$SelectOrderType;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "type", "Lcom/robinhood/models/api/CryptoOrderType;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/api/CryptoOrderType;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getType", "()Lcom/robinhood/models/api/CryptoOrderType;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$TapAction$SelectOrderType, reason: from toString */
        public static final /* data */ class SelectOrderType extends TapAction {
            public static final int $stable = 8;
            private final CryptoInputMode inputMode;
            private final CryptoOrderType type;
            private final UiCurrencyPair uiCurrencyPair;

            public static /* synthetic */ SelectOrderType copy$default(SelectOrderType selectOrderType, UiCurrencyPair uiCurrencyPair, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = selectOrderType.uiCurrencyPair;
                }
                if ((i & 2) != 0) {
                    cryptoOrderType = selectOrderType.type;
                }
                if ((i & 4) != 0) {
                    cryptoInputMode = selectOrderType.inputMode;
                }
                return selectOrderType.copy(uiCurrencyPair, cryptoOrderType, cryptoInputMode);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            /* renamed from: component2, reason: from getter */
            public final CryptoOrderType getType() {
                return this.type;
            }

            /* renamed from: component3, reason: from getter */
            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            public final SelectOrderType copy(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode inputMode) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                Intrinsics.checkNotNullParameter(type2, "type");
                return new SelectOrderType(uiCurrencyPair, type2, inputMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectOrderType)) {
                    return false;
                }
                SelectOrderType selectOrderType = (SelectOrderType) other;
                return Intrinsics.areEqual(this.uiCurrencyPair, selectOrderType.uiCurrencyPair) && this.type == selectOrderType.type && this.inputMode == selectOrderType.inputMode;
            }

            public int hashCode() {
                int iHashCode = ((this.uiCurrencyPair.hashCode() * 31) + this.type.hashCode()) * 31;
                CryptoInputMode cryptoInputMode = this.inputMode;
                return iHashCode + (cryptoInputMode == null ? 0 : cryptoInputMode.hashCode());
            }

            public String toString() {
                return "SelectOrderType(uiCurrencyPair=" + this.uiCurrencyPair + ", type=" + this.type + ", inputMode=" + this.inputMode + ")";
            }

            public /* synthetic */ SelectOrderType(UiCurrencyPair uiCurrencyPair, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiCurrencyPair, cryptoOrderType, (i & 4) != 0 ? null : cryptoInputMode);
            }

            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            public final CryptoOrderType getType() {
                return this.type;
            }

            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectOrderType(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode cryptoInputMode) {
                super(null);
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                Intrinsics.checkNotNullParameter(type2, "type");
                this.uiCurrencyPair = uiCurrencyPair;
                this.type = type2;
                this.inputMode = cryptoInputMode;
            }
        }

        private TapAction() {
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$TaxLotSelected;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$TapAction$TaxLotSelected */
        public static final /* data */ class TaxLotSelected extends TapAction {
            public static final int $stable = 0;
            public static final TaxLotSelected INSTANCE = new TaxLotSelected();

            public boolean equals(Object other) {
                return this == other || (other instanceof TaxLotSelected);
            }

            public int hashCode() {
                return -998323330;
            }

            public String toString() {
                return "TaxLotSelected";
            }

            private TaxLotSelected() {
                super(null);
            }
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$ShowTaxLotDisabledAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "title", "", "message", "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDismissCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$TapAction$ShowTaxLotDisabledAlert, reason: from toString */
        public static final /* data */ class ShowTaxLotDisabledAlert extends TapAction {
            public static final int $stable = 0;
            private final String dismissCtaText;
            private final String message;
            private final String title;

            public static /* synthetic */ ShowTaxLotDisabledAlert copy$default(ShowTaxLotDisabledAlert showTaxLotDisabledAlert, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = showTaxLotDisabledAlert.title;
                }
                if ((i & 2) != 0) {
                    str2 = showTaxLotDisabledAlert.message;
                }
                if ((i & 4) != 0) {
                    str3 = showTaxLotDisabledAlert.dismissCtaText;
                }
                return showTaxLotDisabledAlert.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDismissCtaText() {
                return this.dismissCtaText;
            }

            public final ShowTaxLotDisabledAlert copy(String title, String message, String dismissCtaText) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
                return new ShowTaxLotDisabledAlert(title, message, dismissCtaText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowTaxLotDisabledAlert)) {
                    return false;
                }
                ShowTaxLotDisabledAlert showTaxLotDisabledAlert = (ShowTaxLotDisabledAlert) other;
                return Intrinsics.areEqual(this.title, showTaxLotDisabledAlert.title) && Intrinsics.areEqual(this.message, showTaxLotDisabledAlert.message) && Intrinsics.areEqual(this.dismissCtaText, showTaxLotDisabledAlert.dismissCtaText);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.dismissCtaText.hashCode();
            }

            public String toString() {
                return "ShowTaxLotDisabledAlert(title=" + this.title + ", message=" + this.message + ", dismissCtaText=" + this.dismissCtaText + ")";
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getDismissCtaText() {
                return this.dismissCtaText;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowTaxLotDisabledAlert(String title, String message, String dismissCtaText) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
                this.title = title;
                this.message = message;
                this.dismissCtaText = dismissCtaText;
            }
        }

        /* compiled from: CryptoOrderTypeSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction$RecurringInvestmentSelected;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "tradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "<init>", "(Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;)V", "getTradability", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorRowViewState$TapAction$RecurringInvestmentSelected, reason: from toString */
        public static final /* data */ class RecurringInvestmentSelected extends TapAction {
            public static final int $stable = 8;
            private final InstrumentRecurringTradability tradability;

            public static /* synthetic */ RecurringInvestmentSelected copy$default(RecurringInvestmentSelected recurringInvestmentSelected, InstrumentRecurringTradability instrumentRecurringTradability, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrumentRecurringTradability = recurringInvestmentSelected.tradability;
                }
                return recurringInvestmentSelected.copy(instrumentRecurringTradability);
            }

            /* renamed from: component1, reason: from getter */
            public final InstrumentRecurringTradability getTradability() {
                return this.tradability;
            }

            public final RecurringInvestmentSelected copy(InstrumentRecurringTradability tradability) {
                return new RecurringInvestmentSelected(tradability);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RecurringInvestmentSelected) && Intrinsics.areEqual(this.tradability, ((RecurringInvestmentSelected) other).tradability);
            }

            public int hashCode() {
                InstrumentRecurringTradability instrumentRecurringTradability = this.tradability;
                if (instrumentRecurringTradability == null) {
                    return 0;
                }
                return instrumentRecurringTradability.hashCode();
            }

            public String toString() {
                return "RecurringInvestmentSelected(tradability=" + this.tradability + ")";
            }

            public RecurringInvestmentSelected(InstrumentRecurringTradability instrumentRecurringTradability) {
                super(null);
                this.tradability = instrumentRecurringTradability;
            }

            public final InstrumentRecurringTradability getTradability() {
                return this.tradability;
            }
        }
    }
}
