package com.robinhood.android.equity.validation.event;

import com.robinhood.android.equity.ordercheck.OrderCheckFailure;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.api.ApiBuySellOrderOnboardingResponse;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent;", "", "Dollar", "Share", "Advanced", "CancelPendingCryptoOrderEvent", "ChangeOrderConfiguration", "CheckForceSuitabilityOnAccountSwitchedEvent", "BuySellOrderOnboardingEvent", "TwentyFourHourMarketOnboardingBottomSheetEvent", "OrderCheckEvent", "AccountSwitcherRefreshedEvent", "Exit", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderEvent {

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent;", "OrderSubmittedEvent", "ConvertToSharesEvent", "ConvertToSharesAmountEvent", "InputErrorEvent", "QuickTradeToggledEvent", "QuickTradeLoadedEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$AccountSwitcherRefreshedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$BuySellOrderOnboardingEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CancelPendingCryptoOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$ChangeOrderConfiguration;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CheckForceSuitabilityOnAccountSwitchedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$ConvertToSharesAmountEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$ConvertToSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$InputErrorEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$OrderSubmittedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$QuickTradeLoadedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$QuickTradeToggledEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Exit;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$OrderCheckEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$TwentyFourHourMarketOnboardingBottomSheetEvent;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Dollar extends EquityOrderEvent {

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$OrderSubmittedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "orderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "<init>", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;)V", "getOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderSubmittedEvent implements Dollar {
            public static final int $stable = 8;
            private final EquityOrderContext orderContext;

            public static /* synthetic */ OrderSubmittedEvent copy$default(OrderSubmittedEvent orderSubmittedEvent, EquityOrderContext equityOrderContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    equityOrderContext = orderSubmittedEvent.orderContext;
                }
                return orderSubmittedEvent.copy(equityOrderContext);
            }

            /* renamed from: component1, reason: from getter */
            public final EquityOrderContext getOrderContext() {
                return this.orderContext;
            }

            public final OrderSubmittedEvent copy(EquityOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                return new OrderSubmittedEvent(orderContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderSubmittedEvent) && Intrinsics.areEqual(this.orderContext, ((OrderSubmittedEvent) other).orderContext);
            }

            public int hashCode() {
                return this.orderContext.hashCode();
            }

            public String toString() {
                return "OrderSubmittedEvent(orderContext=" + this.orderContext + ")";
            }

            public OrderSubmittedEvent(EquityOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                this.orderContext = orderContext;
            }

            public final EquityOrderContext getOrderContext() {
                return this.orderContext;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$ConvertToSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConvertToSharesEvent implements Dollar {
            public static final int $stable = 8;
            private final EquityOrderConfiguration configuration;

            public static /* synthetic */ ConvertToSharesEvent copy$default(ConvertToSharesEvent convertToSharesEvent, EquityOrderConfiguration equityOrderConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    equityOrderConfiguration = convertToSharesEvent.configuration;
                }
                return convertToSharesEvent.copy(equityOrderConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final EquityOrderConfiguration getConfiguration() {
                return this.configuration;
            }

            public final ConvertToSharesEvent copy(EquityOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ConvertToSharesEvent(configuration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConvertToSharesEvent) && Intrinsics.areEqual(this.configuration, ((ConvertToSharesEvent) other).configuration);
            }

            public int hashCode() {
                return this.configuration.hashCode();
            }

            public String toString() {
                return "ConvertToSharesEvent(configuration=" + this.configuration + ")";
            }

            public ConvertToSharesEvent(EquityOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.configuration = configuration;
            }

            public final EquityOrderConfiguration getConfiguration() {
                return this.configuration;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$ConvertToSharesAmountEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConvertToSharesAmountEvent implements Dollar {
            public static final int $stable = 8;
            private final EquityOrderConfiguration configuration;

            public static /* synthetic */ ConvertToSharesAmountEvent copy$default(ConvertToSharesAmountEvent convertToSharesAmountEvent, EquityOrderConfiguration equityOrderConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    equityOrderConfiguration = convertToSharesAmountEvent.configuration;
                }
                return convertToSharesAmountEvent.copy(equityOrderConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final EquityOrderConfiguration getConfiguration() {
                return this.configuration;
            }

            public final ConvertToSharesAmountEvent copy(EquityOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ConvertToSharesAmountEvent(configuration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConvertToSharesAmountEvent) && Intrinsics.areEqual(this.configuration, ((ConvertToSharesAmountEvent) other).configuration);
            }

            public int hashCode() {
                return this.configuration.hashCode();
            }

            public String toString() {
                return "ConvertToSharesAmountEvent(configuration=" + this.configuration + ")";
            }

            public ConvertToSharesAmountEvent(EquityOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.configuration = configuration;
            }

            public final EquityOrderConfiguration getConfiguration() {
                return this.configuration;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$InputErrorEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "errorMessage", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getErrorMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InputErrorEvent implements Dollar {
            public static final int $stable = StringResource.$stable;
            private final StringResource errorMessage;

            public static /* synthetic */ InputErrorEvent copy$default(InputErrorEvent inputErrorEvent, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = inputErrorEvent.errorMessage;
                }
                return inputErrorEvent.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getErrorMessage() {
                return this.errorMessage;
            }

            public final InputErrorEvent copy(StringResource errorMessage) {
                return new InputErrorEvent(errorMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InputErrorEvent) && Intrinsics.areEqual(this.errorMessage, ((InputErrorEvent) other).errorMessage);
            }

            public int hashCode() {
                StringResource stringResource = this.errorMessage;
                if (stringResource == null) {
                    return 0;
                }
                return stringResource.hashCode();
            }

            public String toString() {
                return "InputErrorEvent(errorMessage=" + this.errorMessage + ")";
            }

            public InputErrorEvent(StringResource stringResource) {
                this.errorMessage = stringResource;
            }

            public final StringResource getErrorMessage() {
                return this.errorMessage;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$QuickTradeToggledEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "canShowReviewButton", "", "<init>", "(Z)V", "getCanShowReviewButton", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuickTradeToggledEvent implements Dollar {
            public static final int $stable = 0;
            private final boolean canShowReviewButton;

            public static /* synthetic */ QuickTradeToggledEvent copy$default(QuickTradeToggledEvent quickTradeToggledEvent, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = quickTradeToggledEvent.canShowReviewButton;
                }
                return quickTradeToggledEvent.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getCanShowReviewButton() {
                return this.canShowReviewButton;
            }

            public final QuickTradeToggledEvent copy(boolean canShowReviewButton) {
                return new QuickTradeToggledEvent(canShowReviewButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuickTradeToggledEvent) && this.canShowReviewButton == ((QuickTradeToggledEvent) other).canShowReviewButton;
            }

            public int hashCode() {
                return Boolean.hashCode(this.canShowReviewButton);
            }

            public String toString() {
                return "QuickTradeToggledEvent(canShowReviewButton=" + this.canShowReviewButton + ")";
            }

            public QuickTradeToggledEvent(boolean z) {
                this.canShowReviewButton = z;
            }

            public final boolean getCanShowReviewButton() {
                return this.canShowReviewButton;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar$QuickTradeLoadedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "canShowReviewButton", "", "<init>", "(Z)V", "getCanShowReviewButton", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuickTradeLoadedEvent implements Dollar {
            public static final int $stable = 0;
            private final boolean canShowReviewButton;

            public static /* synthetic */ QuickTradeLoadedEvent copy$default(QuickTradeLoadedEvent quickTradeLoadedEvent, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = quickTradeLoadedEvent.canShowReviewButton;
                }
                return quickTradeLoadedEvent.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getCanShowReviewButton() {
                return this.canShowReviewButton;
            }

            public final QuickTradeLoadedEvent copy(boolean canShowReviewButton) {
                return new QuickTradeLoadedEvent(canShowReviewButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuickTradeLoadedEvent) && this.canShowReviewButton == ((QuickTradeLoadedEvent) other).canShowReviewButton;
            }

            public int hashCode() {
                return Boolean.hashCode(this.canShowReviewButton);
            }

            public String toString() {
                return "QuickTradeLoadedEvent(canShowReviewButton=" + this.canShowReviewButton + ")";
            }

            public QuickTradeLoadedEvent(boolean z) {
                this.canShowReviewButton = z;
            }

            public final boolean getCanShowReviewButton() {
                return this.canShowReviewButton;
            }
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "", "NotEnoughSharesEvent", "SellAllEvent", "ConvertToSharesEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$AccountSwitcherRefreshedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$BuySellOrderOnboardingEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CancelPendingCryptoOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$ChangeOrderConfiguration;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CheckForceSuitabilityOnAccountSwitchedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Exit;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$OrderCheckEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$ConvertToSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$NotEnoughSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$SellAllEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$TwentyFourHourMarketOnboardingBottomSheetEvent;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Share {

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$NotEnoughSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "position", "Lcom/robinhood/models/db/Position;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;)V", "getPosition", "()Lcom/robinhood/models/db/Position;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotEnoughSharesEvent implements Share {
            public static final int $stable = 8;
            private final Instrument instrument;
            private final Position position;
            private final Quote quote;

            public static /* synthetic */ NotEnoughSharesEvent copy$default(NotEnoughSharesEvent notEnoughSharesEvent, Position position, Instrument instrument, Quote quote, int i, Object obj) {
                if ((i & 1) != 0) {
                    position = notEnoughSharesEvent.position;
                }
                if ((i & 2) != 0) {
                    instrument = notEnoughSharesEvent.instrument;
                }
                if ((i & 4) != 0) {
                    quote = notEnoughSharesEvent.quote;
                }
                return notEnoughSharesEvent.copy(position, instrument, quote);
            }

            /* renamed from: component1, reason: from getter */
            public final Position getPosition() {
                return this.position;
            }

            /* renamed from: component2, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component3, reason: from getter */
            public final Quote getQuote() {
                return this.quote;
            }

            public final NotEnoughSharesEvent copy(Position position, Instrument instrument, Quote quote) {
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new NotEnoughSharesEvent(position, instrument, quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotEnoughSharesEvent)) {
                    return false;
                }
                NotEnoughSharesEvent notEnoughSharesEvent = (NotEnoughSharesEvent) other;
                return Intrinsics.areEqual(this.position, notEnoughSharesEvent.position) && Intrinsics.areEqual(this.instrument, notEnoughSharesEvent.instrument) && Intrinsics.areEqual(this.quote, notEnoughSharesEvent.quote);
            }

            public int hashCode() {
                return (((this.position.hashCode() * 31) + this.instrument.hashCode()) * 31) + this.quote.hashCode();
            }

            public String toString() {
                return "NotEnoughSharesEvent(position=" + this.position + ", instrument=" + this.instrument + ", quote=" + this.quote + ")";
            }

            public NotEnoughSharesEvent(Position position, Instrument instrument, Quote quote) {
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.position = position;
                this.instrument = instrument;
                this.quote = quote;
            }

            public final Position getPosition() {
                return this.position;
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final Quote getQuote() {
                return this.quote;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$SellAllEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "shareQuantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getShareQuantity", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SellAllEvent implements Share {
            public static final int $stable = 8;
            private final BigDecimal shareQuantity;

            public static /* synthetic */ SellAllEvent copy$default(SellAllEvent sellAllEvent, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = sellAllEvent.shareQuantity;
                }
                return sellAllEvent.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getShareQuantity() {
                return this.shareQuantity;
            }

            public final SellAllEvent copy(BigDecimal shareQuantity) {
                Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
                return new SellAllEvent(shareQuantity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SellAllEvent) && Intrinsics.areEqual(this.shareQuantity, ((SellAllEvent) other).shareQuantity);
            }

            public int hashCode() {
                return this.shareQuantity.hashCode();
            }

            public String toString() {
                return "SellAllEvent(shareQuantity=" + this.shareQuantity + ")";
            }

            public SellAllEvent(BigDecimal shareQuantity) {
                Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
                this.shareQuantity = shareQuantity;
            }

            public final BigDecimal getShareQuantity() {
                return this.shareQuantity;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share$ConvertToSharesEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConvertToSharesEvent implements Share {
            public static final int $stable = 0;
            private final String accountNumber;

            public static /* synthetic */ ConvertToSharesEvent copy$default(ConvertToSharesEvent convertToSharesEvent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = convertToSharesEvent.accountNumber;
                }
                return convertToSharesEvent.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final ConvertToSharesEvent copy(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new ConvertToSharesEvent(accountNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConvertToSharesEvent) && Intrinsics.areEqual(this.accountNumber, ((ConvertToSharesEvent) other).accountNumber);
            }

            public int hashCode() {
                return this.accountNumber.hashCode();
            }

            public String toString() {
                return "ConvertToSharesEvent(accountNumber=" + this.accountNumber + ")";
            }

            public ConvertToSharesEvent(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.accountNumber = accountNumber;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u0012\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent;", "ShowMissingLimitPriceDialog", "ShowNotEnoughSharesDialog", "SetEditingFieldText", "ShowTaxLotLimitOrderFractionalLotsAlert", "ShowTaxLotMaxLotsDialog", "CompleteOrderEvent", "ConfirmOrderEvent", "ShowSuitabilityEvent", "ShowAccountSwitcher", "ShowMarketDataDisclosureDialog", "ShowBackupWithholdingDialog", "ShowTaxLotsSelection", "ShowNoAvailableSharesDialog", "ShowBorrowFeesUnavailableDialog", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$CompleteOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ConfirmOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$SetEditingFieldText;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowAccountSwitcher;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowBackupWithholdingDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowBorrowFeesUnavailableDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowMarketDataDisclosureDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowMissingLimitPriceDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowNoAvailableSharesDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowNotEnoughSharesDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowSuitabilityEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotLimitOrderFractionalLotsAlert;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotMaxLotsDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotsSelection;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CancelPendingCryptoOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$ChangeOrderConfiguration;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Exit;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$OrderCheckEvent;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Advanced extends EquityOrderEvent {

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowMissingLimitPriceDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowMissingLimitPriceDialog implements Advanced {
            public static final int $stable = 0;
            public static final ShowMissingLimitPriceDialog INSTANCE = new ShowMissingLimitPriceDialog();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowMissingLimitPriceDialog);
            }

            public int hashCode() {
                return 1432100220;
            }

            public String toString() {
                return "ShowMissingLimitPriceDialog";
            }

            private ShowMissingLimitPriceDialog() {
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowNotEnoughSharesDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", EquityShareOrderFragment.ARG_SHARES, "Ljava/math/BigDecimal;", "symbol", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getShares", "()Ljava/math/BigDecimal;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowNotEnoughSharesDialog implements Advanced {
            public static final int $stable = 8;
            private final BigDecimal shares;
            private final String symbol;

            public static /* synthetic */ ShowNotEnoughSharesDialog copy$default(ShowNotEnoughSharesDialog showNotEnoughSharesDialog, BigDecimal bigDecimal, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = showNotEnoughSharesDialog.shares;
                }
                if ((i & 2) != 0) {
                    str = showNotEnoughSharesDialog.symbol;
                }
                return showNotEnoughSharesDialog.copy(bigDecimal, str);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getShares() {
                return this.shares;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public final ShowNotEnoughSharesDialog copy(BigDecimal shares, String symbol) {
                Intrinsics.checkNotNullParameter(shares, "shares");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new ShowNotEnoughSharesDialog(shares, symbol);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowNotEnoughSharesDialog)) {
                    return false;
                }
                ShowNotEnoughSharesDialog showNotEnoughSharesDialog = (ShowNotEnoughSharesDialog) other;
                return Intrinsics.areEqual(this.shares, showNotEnoughSharesDialog.shares) && Intrinsics.areEqual(this.symbol, showNotEnoughSharesDialog.symbol);
            }

            public int hashCode() {
                return (this.shares.hashCode() * 31) + this.symbol.hashCode();
            }

            public String toString() {
                return "ShowNotEnoughSharesDialog(shares=" + this.shares + ", symbol=" + this.symbol + ")";
            }

            public ShowNotEnoughSharesDialog(BigDecimal shares, String symbol) {
                Intrinsics.checkNotNullParameter(shares, "shares");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.shares = shares;
                this.symbol = symbol;
            }

            public final BigDecimal getShares() {
                return this.shares;
            }

            public final String getSymbol() {
                return this.symbol;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$SetEditingFieldText;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "textField", "Lcom/robinhood/android/equity/validation/event/TextField;", "text", "", "<init>", "(Lcom/robinhood/android/equity/validation/event/TextField;Ljava/lang/String;)V", "getTextField", "()Lcom/robinhood/android/equity/validation/event/TextField;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetEditingFieldText implements Advanced {
            public static final int $stable = 0;
            private final String text;
            private final TextField textField;

            public static /* synthetic */ SetEditingFieldText copy$default(SetEditingFieldText setEditingFieldText, TextField textField, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    textField = setEditingFieldText.textField;
                }
                if ((i & 2) != 0) {
                    str = setEditingFieldText.text;
                }
                return setEditingFieldText.copy(textField, str);
            }

            /* renamed from: component1, reason: from getter */
            public final TextField getTextField() {
                return this.textField;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final SetEditingFieldText copy(TextField textField, String text) {
                Intrinsics.checkNotNullParameter(textField, "textField");
                Intrinsics.checkNotNullParameter(text, "text");
                return new SetEditingFieldText(textField, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetEditingFieldText)) {
                    return false;
                }
                SetEditingFieldText setEditingFieldText = (SetEditingFieldText) other;
                return this.textField == setEditingFieldText.textField && Intrinsics.areEqual(this.text, setEditingFieldText.text);
            }

            public int hashCode() {
                return (this.textField.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "SetEditingFieldText(textField=" + this.textField + ", text=" + this.text + ")";
            }

            public SetEditingFieldText(TextField textField, String text) {
                Intrinsics.checkNotNullParameter(textField, "textField");
                Intrinsics.checkNotNullParameter(text, "text");
                this.textField = textField;
                this.text = text;
            }

            public final TextField getTextField() {
                return this.textField;
            }

            public final String getText() {
                return this.text;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotLimitOrderFractionalLotsAlert;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowTaxLotLimitOrderFractionalLotsAlert implements Advanced {
            public static final int $stable = 0;
            public static final ShowTaxLotLimitOrderFractionalLotsAlert INSTANCE = new ShowTaxLotLimitOrderFractionalLotsAlert();

            private ShowTaxLotLimitOrderFractionalLotsAlert() {
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotMaxLotsDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "selectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "maxNumberOfTaxLots", "", "<init>", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lcom/robinhood/rosetta/eventlogging/Context;I)V", "getSelectionStrategySummary", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "getSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getMaxNumberOfTaxLots", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowTaxLotMaxLotsDialog implements Advanced {
            public static final int $stable = 8;
            private final Context eventContext;
            private final int maxNumberOfTaxLots;
            private final SelectionStrategy selectionStrategy;
            private final SelectionStrategySummary selectionStrategySummary;

            public static /* synthetic */ ShowTaxLotMaxLotsDialog copy$default(ShowTaxLotMaxLotsDialog showTaxLotMaxLotsDialog, SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, Context context, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    selectionStrategySummary = showTaxLotMaxLotsDialog.selectionStrategySummary;
                }
                if ((i2 & 2) != 0) {
                    selectionStrategy = showTaxLotMaxLotsDialog.selectionStrategy;
                }
                if ((i2 & 4) != 0) {
                    context = showTaxLotMaxLotsDialog.eventContext;
                }
                if ((i2 & 8) != 0) {
                    i = showTaxLotMaxLotsDialog.maxNumberOfTaxLots;
                }
                return showTaxLotMaxLotsDialog.copy(selectionStrategySummary, selectionStrategy, context, i);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectionStrategySummary getSelectionStrategySummary() {
                return this.selectionStrategySummary;
            }

            /* renamed from: component2, reason: from getter */
            public final SelectionStrategy getSelectionStrategy() {
                return this.selectionStrategy;
            }

            /* renamed from: component3, reason: from getter */
            public final Context getEventContext() {
                return this.eventContext;
            }

            /* renamed from: component4, reason: from getter */
            public final int getMaxNumberOfTaxLots() {
                return this.maxNumberOfTaxLots;
            }

            public final ShowTaxLotMaxLotsDialog copy(SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, Context eventContext, int maxNumberOfTaxLots) {
                Intrinsics.checkNotNullParameter(selectionStrategySummary, "selectionStrategySummary");
                Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
                return new ShowTaxLotMaxLotsDialog(selectionStrategySummary, selectionStrategy, eventContext, maxNumberOfTaxLots);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowTaxLotMaxLotsDialog)) {
                    return false;
                }
                ShowTaxLotMaxLotsDialog showTaxLotMaxLotsDialog = (ShowTaxLotMaxLotsDialog) other;
                return Intrinsics.areEqual(this.selectionStrategySummary, showTaxLotMaxLotsDialog.selectionStrategySummary) && this.selectionStrategy == showTaxLotMaxLotsDialog.selectionStrategy && Intrinsics.areEqual(this.eventContext, showTaxLotMaxLotsDialog.eventContext) && this.maxNumberOfTaxLots == showTaxLotMaxLotsDialog.maxNumberOfTaxLots;
            }

            public int hashCode() {
                int iHashCode = ((this.selectionStrategySummary.hashCode() * 31) + this.selectionStrategy.hashCode()) * 31;
                Context context = this.eventContext;
                return ((iHashCode + (context == null ? 0 : context.hashCode())) * 31) + Integer.hashCode(this.maxNumberOfTaxLots);
            }

            public String toString() {
                return "ShowTaxLotMaxLotsDialog(selectionStrategySummary=" + this.selectionStrategySummary + ", selectionStrategy=" + this.selectionStrategy + ", eventContext=" + this.eventContext + ", maxNumberOfTaxLots=" + this.maxNumberOfTaxLots + ")";
            }

            public ShowTaxLotMaxLotsDialog(SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, Context context, int i) {
                Intrinsics.checkNotNullParameter(selectionStrategySummary, "selectionStrategySummary");
                Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
                this.selectionStrategySummary = selectionStrategySummary;
                this.selectionStrategy = selectionStrategy;
                this.eventContext = context;
                this.maxNumberOfTaxLots = i;
            }

            public final SelectionStrategySummary getSelectionStrategySummary() {
                return this.selectionStrategySummary;
            }

            public final SelectionStrategy getSelectionStrategy() {
                return this.selectionStrategy;
            }

            public final Context getEventContext() {
                return this.eventContext;
            }

            public final int getMaxNumberOfTaxLots() {
                return this.maxNumberOfTaxLots;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$CompleteOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CompleteOrderEvent implements Advanced {
            public static final int $stable = 8;
            private final AdvancedOrder.Complete configuration;

            public CompleteOrderEvent(AdvancedOrder.Complete configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.configuration = configuration;
            }

            public final AdvancedOrder.Complete getConfiguration() {
                return this.configuration;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ConfirmOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ConfirmOrderEvent implements Advanced {
            public static final int $stable = 8;
            private final Order order;

            public ConfirmOrderEvent(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                this.order = order;
            }

            public final Order getOrder() {
                return this.order;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowSuitabilityEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowSuitabilityEvent implements Advanced {
            public static final int $stable = 0;
            private final String accountNumber;

            public ShowSuitabilityEvent(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.accountNumber = accountNumber;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowAccountSwitcher;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowAccountSwitcher implements Advanced {
            public static final int $stable = 8;
            private final AccountSwitcherData data;

            public ShowAccountSwitcher(AccountSwitcherData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public final AccountSwitcherData getData() {
                return this.data;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowMarketDataDisclosureDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "quote", "Lcom/robinhood/models/db/Quote;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "<init>", "(Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Order$Configuration;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowMarketDataDisclosureDialog implements Advanced {
            public static final int $stable = 8;
            private final Order.Configuration orderConfiguration;
            private final Quote quote;

            public ShowMarketDataDisclosureDialog(Quote quote, Order.Configuration configuration) {
                this.quote = quote;
                this.orderConfiguration = configuration;
            }

            public final Quote getQuote() {
                return this.quote;
            }

            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowBackupWithholdingDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowBackupWithholdingDialog implements Advanced {
            public static final int $stable = 0;
            public static final ShowBackupWithholdingDialog INSTANCE = new ShowBackupWithholdingDialog();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowBackupWithholdingDialog);
            }

            public int hashCode() {
                return -972200957;
            }

            public String toString() {
                return "ShowBackupWithholdingDialog";
            }

            private ShowBackupWithholdingDialog() {
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowTaxLotsSelection;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "numberOfShares", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getNumberOfShares", "()Ljava/math/BigDecimal;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowTaxLotsSelection implements Advanced {
            public static final int $stable = 8;
            private final String accountNumber;
            private final UUID instrumentId;
            private final BigDecimal numberOfShares;
            private final UUID orderId;

            public ShowTaxLotsSelection(String accountNumber, UUID orderId, UUID instrumentId, BigDecimal bigDecimal) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.accountNumber = accountNumber;
                this.orderId = orderId;
                this.instrumentId = instrumentId;
                this.numberOfShares = bigDecimal;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final UUID getOrderId() {
                return this.orderId;
            }

            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final BigDecimal getNumberOfShares() {
                return this.numberOfShares;
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowNoAvailableSharesDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowNoAvailableSharesDialog implements Advanced {
            public static final int $stable = 0;
            public static final ShowNoAvailableSharesDialog INSTANCE = new ShowNoAvailableSharesDialog();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowNoAvailableSharesDialog);
            }

            public int hashCode() {
                return 1884510148;
            }

            public String toString() {
                return "ShowNoAvailableSharesDialog";
            }

            private ShowNoAvailableSharesDialog() {
            }
        }

        /* compiled from: EquityOrderEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$ShowBorrowFeesUnavailableDialog;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowBorrowFeesUnavailableDialog implements Advanced {
            public static final int $stable = 0;
            public static final ShowBorrowFeesUnavailableDialog INSTANCE = new ShowBorrowFeesUnavailableDialog();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowBorrowFeesUnavailableDialog);
            }

            public int hashCode() {
                return -446600362;
            }

            public String toString() {
                return "ShowBorrowFeesUnavailableDialog";
            }

            private ShowBorrowFeesUnavailableDialog() {
            }
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CancelPendingCryptoOrderEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "description", "Lcom/robinhood/utils/resource/StringResource;", "error", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Throwable;)V", "getDescription", "()Lcom/robinhood/utils/resource/StringResource;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CancelPendingCryptoOrderEvent implements Share, Dollar, Advanced {
        public static final int $stable = 8;
        private final StringResource description;
        private final Throwable error;

        public static /* synthetic */ CancelPendingCryptoOrderEvent copy$default(CancelPendingCryptoOrderEvent cancelPendingCryptoOrderEvent, StringResource stringResource, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = cancelPendingCryptoOrderEvent.description;
            }
            if ((i & 2) != 0) {
                th = cancelPendingCryptoOrderEvent.error;
            }
            return cancelPendingCryptoOrderEvent.copy(stringResource, th);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final CancelPendingCryptoOrderEvent copy(StringResource description, Throwable error) {
            return new CancelPendingCryptoOrderEvent(description, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelPendingCryptoOrderEvent)) {
                return false;
            }
            CancelPendingCryptoOrderEvent cancelPendingCryptoOrderEvent = (CancelPendingCryptoOrderEvent) other;
            return Intrinsics.areEqual(this.description, cancelPendingCryptoOrderEvent.description) && Intrinsics.areEqual(this.error, cancelPendingCryptoOrderEvent.error);
        }

        public int hashCode() {
            StringResource stringResource = this.description;
            int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
            Throwable th = this.error;
            return iHashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "CancelPendingCryptoOrderEvent(description=" + this.description + ", error=" + this.error + ")";
        }

        public CancelPendingCryptoOrderEvent(StringResource stringResource, Throwable th) {
            this.description = stringResource;
            this.error = th;
        }

        public final StringResource getDescription() {
            return this.description;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$ChangeOrderConfiguration;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChangeOrderConfiguration implements Share, Dollar, Advanced {
        public static final int $stable = 8;
        private final DirectOrder configuration;

        public static /* synthetic */ ChangeOrderConfiguration copy$default(ChangeOrderConfiguration changeOrderConfiguration, DirectOrder directOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                directOrder = changeOrderConfiguration.configuration;
            }
            return changeOrderConfiguration.copy(directOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectOrder getConfiguration() {
            return this.configuration;
        }

        public final ChangeOrderConfiguration copy(DirectOrder configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ChangeOrderConfiguration(configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeOrderConfiguration) && Intrinsics.areEqual(this.configuration, ((ChangeOrderConfiguration) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "ChangeOrderConfiguration(configuration=" + this.configuration + ")";
        }

        public ChangeOrderConfiguration(DirectOrder configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final DirectOrder getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$CheckForceSuitabilityOnAccountSwitchedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CheckForceSuitabilityOnAccountSwitchedEvent implements Share, Dollar {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ CheckForceSuitabilityOnAccountSwitchedEvent copy$default(CheckForceSuitabilityOnAccountSwitchedEvent checkForceSuitabilityOnAccountSwitchedEvent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkForceSuitabilityOnAccountSwitchedEvent.accountNumber;
            }
            return checkForceSuitabilityOnAccountSwitchedEvent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final CheckForceSuitabilityOnAccountSwitchedEvent copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new CheckForceSuitabilityOnAccountSwitchedEvent(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckForceSuitabilityOnAccountSwitchedEvent) && Intrinsics.areEqual(this.accountNumber, ((CheckForceSuitabilityOnAccountSwitchedEvent) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "CheckForceSuitabilityOnAccountSwitchedEvent(accountNumber=" + this.accountNumber + ")";
        }

        public CheckForceSuitabilityOnAccountSwitchedEvent(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$BuySellOrderOnboardingEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "onboardingResponse", "Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;", "<init>", "(Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;)V", "getOnboardingResponse", "()Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BuySellOrderOnboardingEvent implements Share, Dollar {
        public static final int $stable = 8;
        private final ApiBuySellOrderOnboardingResponse onboardingResponse;

        public static /* synthetic */ BuySellOrderOnboardingEvent copy$default(BuySellOrderOnboardingEvent buySellOrderOnboardingEvent, ApiBuySellOrderOnboardingResponse apiBuySellOrderOnboardingResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiBuySellOrderOnboardingResponse = buySellOrderOnboardingEvent.onboardingResponse;
            }
            return buySellOrderOnboardingEvent.copy(apiBuySellOrderOnboardingResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBuySellOrderOnboardingResponse getOnboardingResponse() {
            return this.onboardingResponse;
        }

        public final BuySellOrderOnboardingEvent copy(ApiBuySellOrderOnboardingResponse onboardingResponse) {
            Intrinsics.checkNotNullParameter(onboardingResponse, "onboardingResponse");
            return new BuySellOrderOnboardingEvent(onboardingResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BuySellOrderOnboardingEvent) && Intrinsics.areEqual(this.onboardingResponse, ((BuySellOrderOnboardingEvent) other).onboardingResponse);
        }

        public int hashCode() {
            return this.onboardingResponse.hashCode();
        }

        public String toString() {
            return "BuySellOrderOnboardingEvent(onboardingResponse=" + this.onboardingResponse + ")";
        }

        public BuySellOrderOnboardingEvent(ApiBuySellOrderOnboardingResponse onboardingResponse) {
            Intrinsics.checkNotNullParameter(onboardingResponse, "onboardingResponse");
            this.onboardingResponse = onboardingResponse;
        }

        public final ApiBuySellOrderOnboardingResponse getOnboardingResponse() {
            return this.onboardingResponse;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$TwentyFourHourMarketOnboardingBottomSheetEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "sheetId", "", "accountNumber", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/QuantityOrAmount;)V", "getSheetId", "()Ljava/lang/String;", "getAccountNumber", "getQuantityOrAmount", "()Lcom/robinhood/models/api/QuantityOrAmount;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TwentyFourHourMarketOnboardingBottomSheetEvent implements Dollar, Share {
        public static final int $stable = 8;
        private final String accountNumber;
        private final OrderRequest2 quantityOrAmount;
        private final String sheetId;

        public static /* synthetic */ TwentyFourHourMarketOnboardingBottomSheetEvent copy$default(TwentyFourHourMarketOnboardingBottomSheetEvent twentyFourHourMarketOnboardingBottomSheetEvent, String str, String str2, OrderRequest2 orderRequest2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = twentyFourHourMarketOnboardingBottomSheetEvent.sheetId;
            }
            if ((i & 2) != 0) {
                str2 = twentyFourHourMarketOnboardingBottomSheetEvent.accountNumber;
            }
            if ((i & 4) != 0) {
                orderRequest2 = twentyFourHourMarketOnboardingBottomSheetEvent.quantityOrAmount;
            }
            return twentyFourHourMarketOnboardingBottomSheetEvent.copy(str, str2, orderRequest2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSheetId() {
            return this.sheetId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderRequest2 getQuantityOrAmount() {
            return this.quantityOrAmount;
        }

        public final TwentyFourHourMarketOnboardingBottomSheetEvent copy(String sheetId, String accountNumber, OrderRequest2 quantityOrAmount) {
            Intrinsics.checkNotNullParameter(sheetId, "sheetId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
            return new TwentyFourHourMarketOnboardingBottomSheetEvent(sheetId, accountNumber, quantityOrAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TwentyFourHourMarketOnboardingBottomSheetEvent)) {
                return false;
            }
            TwentyFourHourMarketOnboardingBottomSheetEvent twentyFourHourMarketOnboardingBottomSheetEvent = (TwentyFourHourMarketOnboardingBottomSheetEvent) other;
            return Intrinsics.areEqual(this.sheetId, twentyFourHourMarketOnboardingBottomSheetEvent.sheetId) && Intrinsics.areEqual(this.accountNumber, twentyFourHourMarketOnboardingBottomSheetEvent.accountNumber) && Intrinsics.areEqual(this.quantityOrAmount, twentyFourHourMarketOnboardingBottomSheetEvent.quantityOrAmount);
        }

        public int hashCode() {
            return (((this.sheetId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.quantityOrAmount.hashCode();
        }

        public String toString() {
            return "TwentyFourHourMarketOnboardingBottomSheetEvent(sheetId=" + this.sheetId + ", accountNumber=" + this.accountNumber + ", quantityOrAmount=" + this.quantityOrAmount + ")";
        }

        public TwentyFourHourMarketOnboardingBottomSheetEvent(String sheetId, String accountNumber, OrderRequest2 quantityOrAmount) {
            Intrinsics.checkNotNullParameter(sheetId, "sheetId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
            this.sheetId = sheetId;
            this.accountNumber = accountNumber;
            this.quantityOrAmount = quantityOrAmount;
        }

        public final String getSheetId() {
            return this.sheetId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OrderRequest2 getQuantityOrAmount() {
            return this.quantityOrAmount;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$OrderCheckEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "failure", "Lcom/robinhood/android/equity/ordercheck/OrderCheckFailure;", "error", "", "accountNumber", "", "orderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "<init>", "(Lcom/robinhood/android/equity/ordercheck/OrderCheckFailure;Ljava/lang/Throwable;Ljava/lang/String;Lcom/robinhood/android/equity/validation/EquityOrderContext;)V", "getFailure", "()Lcom/robinhood/android/equity/ordercheck/OrderCheckFailure;", "getError", "()Ljava/lang/Throwable;", "getAccountNumber", "()Ljava/lang/String;", "getOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderCheckEvent implements Share, Dollar, Advanced {
        public static final int $stable = 8;
        private final String accountNumber;
        private final Throwable error;
        private final OrderCheckFailure failure;
        private final EquityOrderContext orderContext;

        public static /* synthetic */ OrderCheckEvent copy$default(OrderCheckEvent orderCheckEvent, OrderCheckFailure orderCheckFailure, Throwable th, String str, EquityOrderContext equityOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                orderCheckFailure = orderCheckEvent.failure;
            }
            if ((i & 2) != 0) {
                th = orderCheckEvent.error;
            }
            if ((i & 4) != 0) {
                str = orderCheckEvent.accountNumber;
            }
            if ((i & 8) != 0) {
                equityOrderContext = orderCheckEvent.orderContext;
            }
            return orderCheckEvent.copy(orderCheckFailure, th, str, equityOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderCheckFailure getFailure() {
            return this.failure;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final EquityOrderContext getOrderContext() {
            return this.orderContext;
        }

        public final OrderCheckEvent copy(OrderCheckFailure failure, Throwable error, String accountNumber, EquityOrderContext orderContext) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            return new OrderCheckEvent(failure, error, accountNumber, orderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderCheckEvent)) {
                return false;
            }
            OrderCheckEvent orderCheckEvent = (OrderCheckEvent) other;
            return Intrinsics.areEqual(this.failure, orderCheckEvent.failure) && Intrinsics.areEqual(this.error, orderCheckEvent.error) && Intrinsics.areEqual(this.accountNumber, orderCheckEvent.accountNumber) && Intrinsics.areEqual(this.orderContext, orderCheckEvent.orderContext);
        }

        public int hashCode() {
            OrderCheckFailure orderCheckFailure = this.failure;
            int iHashCode = (orderCheckFailure == null ? 0 : orderCheckFailure.hashCode()) * 31;
            Throwable th = this.error;
            return ((((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + this.accountNumber.hashCode()) * 31) + this.orderContext.hashCode();
        }

        public String toString() {
            return "OrderCheckEvent(failure=" + this.failure + ", error=" + this.error + ", accountNumber=" + this.accountNumber + ", orderContext=" + this.orderContext + ")";
        }

        public OrderCheckEvent(OrderCheckFailure orderCheckFailure, Throwable th, String accountNumber, EquityOrderContext orderContext) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.failure = orderCheckFailure;
            this.error = th;
            this.accountNumber = accountNumber;
            this.orderContext = orderContext;
        }

        public final OrderCheckFailure getFailure() {
            return this.failure;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final EquityOrderContext getOrderContext() {
            return this.orderContext;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$AccountSwitcherRefreshedEvent;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "error", "", "<init>", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Ljava/lang/Throwable;)V", "getData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountSwitcherRefreshedEvent implements Share, Dollar {
        public static final int $stable = 8;
        private final AccountSwitcherData data;
        private final Throwable error;

        public static /* synthetic */ AccountSwitcherRefreshedEvent copy$default(AccountSwitcherRefreshedEvent accountSwitcherRefreshedEvent, AccountSwitcherData accountSwitcherData, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSwitcherData = accountSwitcherRefreshedEvent.data;
            }
            if ((i & 2) != 0) {
                th = accountSwitcherRefreshedEvent.error;
            }
            return accountSwitcherRefreshedEvent.copy(accountSwitcherData, th);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSwitcherData getData() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final AccountSwitcherRefreshedEvent copy(AccountSwitcherData data, Throwable error) {
            return new AccountSwitcherRefreshedEvent(data, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountSwitcherRefreshedEvent)) {
                return false;
            }
            AccountSwitcherRefreshedEvent accountSwitcherRefreshedEvent = (AccountSwitcherRefreshedEvent) other;
            return Intrinsics.areEqual(this.data, accountSwitcherRefreshedEvent.data) && Intrinsics.areEqual(this.error, accountSwitcherRefreshedEvent.error);
        }

        public int hashCode() {
            AccountSwitcherData accountSwitcherData = this.data;
            int iHashCode = (accountSwitcherData == null ? 0 : accountSwitcherData.hashCode()) * 31;
            Throwable th = this.error;
            return iHashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "AccountSwitcherRefreshedEvent(data=" + this.data + ", error=" + this.error + ")";
        }

        public AccountSwitcherRefreshedEvent(AccountSwitcherData accountSwitcherData, Throwable th) {
            this.data = accountSwitcherData;
            this.error = th;
        }

        public final AccountSwitcherData getData() {
            return this.data;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: EquityOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Exit;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements Share, Dollar, Advanced {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return -1614967929;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
        }
    }
}
