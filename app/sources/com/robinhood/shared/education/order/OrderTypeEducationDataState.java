package com.robinhood.shared.education.order;

import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeEducationDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J7\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationDataState;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "instrument", "Lcom/robinhood/models/db/Instrument;", "hasSeenEducation", "", "<init>", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/Instrument;Z)V", "getConfiguration", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getHasSeenEducation", "()Z", "prompt", "Lcom/robinhood/utils/resource/StringResource;", "getPrompt", "()Lcom/robinhood/utils/resource/StringResource;", "showDismissButton", "getShowDismissButton", "orderTypeEducation", "Lcom/robinhood/shared/education/order/OrderTypeEducation;", "getOrderTypeEducation", "()Lcom/robinhood/shared/education/order/OrderTypeEducation;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class OrderTypeEducationDataState {
    public static final int $stable = 8;
    private final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration;
    private final UiCurrencyPair currencyPair;
    private final boolean hasSeenEducation;
    private final Instrument instrument;

    public OrderTypeEducationDataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ OrderTypeEducationDataState copy$default(OrderTypeEducationDataState orderTypeEducationDataState, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, UiCurrencyPair uiCurrencyPair, Instrument instrument, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTypeEducationConfiguration = orderTypeEducationDataState.configuration;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = orderTypeEducationDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            instrument = orderTypeEducationDataState.instrument;
        }
        if ((i & 8) != 0) {
            z = orderTypeEducationDataState.hasSeenEducation;
        }
        return orderTypeEducationDataState.copy(orderTypeEducationConfiguration, uiCurrencyPair, instrument, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasSeenEducation() {
        return this.hasSeenEducation;
    }

    public final OrderTypeEducationDataState copy(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration, UiCurrencyPair currencyPair, Instrument instrument, boolean hasSeenEducation) {
        return new OrderTypeEducationDataState(configuration, currencyPair, instrument, hasSeenEducation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypeEducationDataState)) {
            return false;
        }
        OrderTypeEducationDataState orderTypeEducationDataState = (OrderTypeEducationDataState) other;
        return Intrinsics.areEqual(this.configuration, orderTypeEducationDataState.configuration) && Intrinsics.areEqual(this.currencyPair, orderTypeEducationDataState.currencyPair) && Intrinsics.areEqual(this.instrument, orderTypeEducationDataState.instrument) && this.hasSeenEducation == orderTypeEducationDataState.hasSeenEducation;
    }

    public int hashCode() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = this.configuration;
        int iHashCode = (orderTypeEducationConfiguration == null ? 0 : orderTypeEducationConfiguration.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        Instrument instrument = this.instrument;
        return ((iHashCode2 + (instrument != null ? instrument.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSeenEducation);
    }

    public String toString() {
        return "OrderTypeEducationDataState(configuration=" + this.configuration + ", currencyPair=" + this.currencyPair + ", instrument=" + this.instrument + ", hasSeenEducation=" + this.hasSeenEducation + ")";
    }

    public OrderTypeEducationDataState(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, UiCurrencyPair uiCurrencyPair, Instrument instrument, boolean z) {
        this.configuration = orderTypeEducationConfiguration;
        this.currencyPair = uiCurrencyPair;
        this.instrument = instrument;
        this.hasSeenEducation = z;
    }

    public /* synthetic */ OrderTypeEducationDataState(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, UiCurrencyPair uiCurrencyPair, Instrument instrument, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderTypeEducationConfiguration, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : instrument, (i & 8) != 0 ? false : z);
    }

    public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
        return this.configuration;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final boolean getHasSeenEducation() {
        return this.hasSeenEducation;
    }

    public final StringResource getPrompt() {
        OrderTypeEducation orderTypeEducation = getOrderTypeEducation();
        if (orderTypeEducation == null) {
            return null;
        }
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = this.configuration;
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            if (this.currencyPair != null) {
                return StringResource.INSTANCE.invoke(orderTypeEducation.getPromptRes(), this.currencyPair.getAssetCurrency().getCode());
            }
            return null;
        }
        if ((orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) || (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
            if (this.instrument != null) {
                return StringResource.INSTANCE.invoke(orderTypeEducation.getPromptRes(), this.instrument.getSymbol());
            }
            return null;
        }
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            return StringResource.INSTANCE.invoke(orderTypeEducation.getPromptRes(), ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getInstrumentSymbol());
        }
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
            if (this.currencyPair != null) {
                return StringResource.INSTANCE.invoke(orderTypeEducation.getPromptRes(), UiCurrencyPairs.getSymbolWithType(this.currencyPair));
            }
            return null;
        }
        if (orderTypeEducationConfiguration == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowDismissButton() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = this.configuration;
        return (orderTypeEducationConfiguration == null || !orderTypeEducationConfiguration.getShowDismissBtn() || this.hasSeenEducation) ? false : true;
    }

    private final OrderTypeEducation getOrderTypeEducation() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = this.configuration;
        if (orderTypeEducationConfiguration != null) {
            return OrderTypeEducationConfiguration2.toOrderTypeEducation(orderTypeEducationConfiguration);
        }
        return null;
    }
}
