package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetEvent;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002)*B/\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0019J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDataState;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Args;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/prefs/EnumPreference;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onNumpadKeyPress", "", "keyEvent", "Landroid/view/KeyEvent;", "onCurrencySwitcherClicked", "onOrderTypeSelected", "type", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "onActionButtonPressed", "action", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onOpenDisclosuresClicked", "onOrderReviewRowTapped", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuickTradeSheetDuxo extends BaseDuxo3<CryptoQuickTradeSheetDataState, CryptoQuickTradeSheetViewState, CryptoQuickTradeSheetEvent> implements HasArgs<Args> {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoQuickTradeSheetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    public final void onActionButtonPressed(ActionViewState action, int index) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    public final void onCurrencySwitcherClicked() {
    }

    public final void onNumpadKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
    }

    public final void onOpenDisclosuresClicked() {
    }

    public final void onOrderReviewRowTapped(CryptoOrderReviewRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
    }

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoQuickTradeSheetDuxo(DuxoBundle duxoBundle, CryptoQuickTradeSheetStateProvider stateProvider, SavedStateHandle savedStateHandle, EnumPreference<CryptoInputMode> cryptoInputModePref) {
        super(new CryptoQuickTradeSheetDataState(null, null, null, null, Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()), ((Args) INSTANCE.getArgs(savedStateHandle)).getOrderSide(), (CryptoInputMode) cryptoInputModePref.getValue(), null, CryptoQuickTradeSheetViewState.TradeStage.INPUT, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        this.savedStateHandle = savedStateHandle;
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((Args) INSTANCE.getArgs((HasArgs) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    public final void onOrderTypeSelected(CryptoOrderIntentKey.OrderType type2) {
        TradeAction tradeAction;
        Intrinsics.checkNotNullParameter(type2, "type");
        if (type2 == CryptoOrderIntentKey.OrderType.MARKET) {
            return;
        }
        Companion companion = INSTANCE;
        UUID currencyPairId = ((Args) companion.getArgs((HasArgs) this)).getCurrencyPairId();
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((HasArgs) this)).getOrderSide().ordinal()];
        if (i == 1) {
            tradeAction = TradeAction.BUY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tradeAction = TradeAction.SELL;
        }
        submit(new CryptoQuickTradeSheetEvent.NavigateToOrderType(new CryptoOrderIntentKey(currencyPairId, tradeAction, type2, null, "quick_trade_sheet", 8, null)));
    }

    /* compiled from: CryptoQuickTradeSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderUuid", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderUuid", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final OrderSide orderSide;
        private final UUID orderUuid;

        /* compiled from: CryptoQuickTradeSheetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, OrderSide orderSide, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                orderSide = args.orderSide;
            }
            if ((i & 4) != 0) {
                uuid2 = args.orderUuid;
            }
            return args.copy(uuid, orderSide, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final Args copy(UUID currencyPairId, OrderSide orderSide, UUID orderUuid) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            return new Args(currencyPairId, orderSide, orderUuid);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && this.orderSide == args.orderSide && Intrinsics.areEqual(this.orderUuid, args.orderUuid);
        }

        public int hashCode() {
            return (((this.currencyPairId.hashCode() * 31) + this.orderSide.hashCode()) * 31) + this.orderUuid.hashCode();
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", orderSide=" + this.orderSide + ", orderUuid=" + this.orderUuid + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.orderSide.name());
            dest.writeSerializable(this.orderUuid);
        }

        public Args(UUID currencyPairId, OrderSide orderSide, UUID orderUuid) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            this.currencyPairId = currencyPairId;
            this.orderSide = orderSide;
            this.orderUuid = orderUuid;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }
    }

    /* compiled from: CryptoQuickTradeSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoQuickTradeSheetDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoQuickTradeSheetDuxo);
        }
    }
}
