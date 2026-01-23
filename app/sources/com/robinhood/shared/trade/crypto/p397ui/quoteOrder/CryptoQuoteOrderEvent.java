package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetFragment;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoQuoteOrderEvent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "", "<init>", "()V", "DisplayCryptoFeeTooltip", "EnterRecurringFlow", "ShowFeeDefinitionBottomSheet", "DismissFeeDefinitionBottomSheet", "ShakeInput", "ShowTradeBonusBottomSheet", "StartActivity", "ShowSduiValidationAlert", "ShowValidationFailure", "HandleCryptoFeeEventType", "ShowOrderTypeSelector", "ShowFragmentInActivity", "ShowDialogFragment", "ShowAlertDto", "ShowRecurringAlertDialog", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$DisplayCryptoFeeTooltip;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$EnterRecurringFlow;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$HandleCryptoFeeEventType;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShakeInput;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowFragmentInActivity;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowRecurringAlertDialog;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowValidationFailure;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$StartActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoQuoteOrderEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoQuoteOrderEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoQuoteOrderEvent() {
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$DisplayCryptoFeeTooltip;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayCryptoFeeTooltip extends CryptoQuoteOrderEvent {
        public static final int $stable = 0;
        public static final DisplayCryptoFeeTooltip INSTANCE = new DisplayCryptoFeeTooltip();

        public boolean equals(Object other) {
            return this == other || (other instanceof DisplayCryptoFeeTooltip);
        }

        public int hashCode() {
            return -224011512;
        }

        public String toString() {
            return "DisplayCryptoFeeTooltip";
        }

        private DisplayCryptoFeeTooltip() {
            super(null);
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$EnterRecurringFlow;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "recurringHookFrequency", "j$/time/LocalDate", "recurringHookStartDate", "Lcom/robinhood/models/util/Money;", "recurringHookAmount", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)V", "component1", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component2", "()Lj$/time/LocalDate;", "component3", "()Lcom/robinhood/models/util/Money;", "copy", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$EnterRecurringFlow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getRecurringHookFrequency", "Lj$/time/LocalDate;", "getRecurringHookStartDate", "Lcom/robinhood/models/util/Money;", "getRecurringHookAmount", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnterRecurringFlow extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final Money recurringHookAmount;
        private final ApiInvestmentSchedule.Frequency recurringHookFrequency;
        private final LocalDate recurringHookStartDate;

        public static /* synthetic */ EnterRecurringFlow copy$default(EnterRecurringFlow enterRecurringFlow, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = enterRecurringFlow.recurringHookFrequency;
            }
            if ((i & 2) != 0) {
                localDate = enterRecurringFlow.recurringHookStartDate;
            }
            if ((i & 4) != 0) {
                money = enterRecurringFlow.recurringHookAmount;
            }
            return enterRecurringFlow.copy(frequency, localDate, money);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getRecurringHookFrequency() {
            return this.recurringHookFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getRecurringHookStartDate() {
            return this.recurringHookStartDate;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getRecurringHookAmount() {
            return this.recurringHookAmount;
        }

        public final EnterRecurringFlow copy(ApiInvestmentSchedule.Frequency recurringHookFrequency, LocalDate recurringHookStartDate, Money recurringHookAmount) {
            Intrinsics.checkNotNullParameter(recurringHookAmount, "recurringHookAmount");
            return new EnterRecurringFlow(recurringHookFrequency, recurringHookStartDate, recurringHookAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnterRecurringFlow)) {
                return false;
            }
            EnterRecurringFlow enterRecurringFlow = (EnterRecurringFlow) other;
            return this.recurringHookFrequency == enterRecurringFlow.recurringHookFrequency && Intrinsics.areEqual(this.recurringHookStartDate, enterRecurringFlow.recurringHookStartDate) && Intrinsics.areEqual(this.recurringHookAmount, enterRecurringFlow.recurringHookAmount);
        }

        public int hashCode() {
            ApiInvestmentSchedule.Frequency frequency = this.recurringHookFrequency;
            int iHashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
            LocalDate localDate = this.recurringHookStartDate;
            return ((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.recurringHookAmount.hashCode();
        }

        public String toString() {
            return "EnterRecurringFlow(recurringHookFrequency=" + this.recurringHookFrequency + ", recurringHookStartDate=" + this.recurringHookStartDate + ", recurringHookAmount=" + this.recurringHookAmount + ")";
        }

        public final ApiInvestmentSchedule.Frequency getRecurringHookFrequency() {
            return this.recurringHookFrequency;
        }

        public final LocalDate getRecurringHookStartDate() {
            return this.recurringHookStartDate;
        }

        public final Money getRecurringHookAmount() {
            return this.recurringHookAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterRecurringFlow(ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money recurringHookAmount) {
            super(null);
            Intrinsics.checkNotNullParameter(recurringHookAmount, "recurringHookAmount");
            this.recurringHookFrequency = frequency;
            this.recurringHookStartDate = localDate;
            this.recurringHookAmount = recurringHookAmount;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final CryptoFeeDefinitionBottomSheetFragment.Args args;

        public static /* synthetic */ ShowFeeDefinitionBottomSheet copy$default(ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet, CryptoFeeDefinitionBottomSheetFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showFeeDefinitionBottomSheet.args;
            }
            return showFeeDefinitionBottomSheet.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        public final ShowFeeDefinitionBottomSheet copy(CryptoFeeDefinitionBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowFeeDefinitionBottomSheet(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFeeDefinitionBottomSheet) && Intrinsics.areEqual(this.args, ((ShowFeeDefinitionBottomSheet) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowFeeDefinitionBottomSheet(args=" + this.args + ")";
        }

        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeeDefinitionBottomSheet(CryptoFeeDefinitionBottomSheetFragment.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissFeeDefinitionBottomSheet extends CryptoQuoteOrderEvent {
        public static final int $stable = 0;
        public static final DismissFeeDefinitionBottomSheet INSTANCE = new DismissFeeDefinitionBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissFeeDefinitionBottomSheet);
        }

        public int hashCode() {
            return -598318003;
        }

        public String toString() {
            return "DismissFeeDefinitionBottomSheet";
        }

        private DismissFeeDefinitionBottomSheet() {
            super(null);
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShakeInput;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "currentTimeMillis", "", "<init>", "(J)V", "getCurrentTimeMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShakeInput extends CryptoQuoteOrderEvent {
        public static final int $stable = 0;
        private final long currentTimeMillis;

        public static /* synthetic */ ShakeInput copy$default(ShakeInput shakeInput, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = shakeInput.currentTimeMillis;
            }
            return shakeInput.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCurrentTimeMillis() {
            return this.currentTimeMillis;
        }

        public final ShakeInput copy(long currentTimeMillis) {
            return new ShakeInput(currentTimeMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShakeInput) && this.currentTimeMillis == ((ShakeInput) other).currentTimeMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.currentTimeMillis);
        }

        public String toString() {
            return "ShakeInput(currentTimeMillis=" + this.currentTimeMillis + ")";
        }

        public ShakeInput(long j) {
            super(null);
            this.currentTimeMillis = j;
        }

        public final long getCurrentTimeMillis() {
            return this.currentTimeMillis;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradeBonusBottomSheet extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final CryptoTradeBonusReviewOrderBottomSheetFragment.Args args;

        public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, CryptoTradeBonusReviewOrderBottomSheetFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showTradeBonusBottomSheet.args;
            }
            return showTradeBonusBottomSheet.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTradeBonusReviewOrderBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        public final ShowTradeBonusBottomSheet copy(CryptoTradeBonusReviewOrderBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowTradeBonusBottomSheet(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTradeBonusBottomSheet) && Intrinsics.areEqual(this.args, ((ShowTradeBonusBottomSheet) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowTradeBonusBottomSheet(args=" + this.args + ")";
        }

        public final CryptoTradeBonusReviewOrderBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradeBonusBottomSheet(CryptoTradeBonusReviewOrderBottomSheetFragment.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$StartActivity;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartActivity extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ StartActivity copy$default(StartActivity startActivity, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = startActivity.intentKey;
            }
            return startActivity.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final StartActivity copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new StartActivity(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartActivity) && Intrinsics.areEqual(this.intentKey, ((StartActivity) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "StartActivity(intentKey=" + this.intentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartActivity(IntentKey intentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiValidationAlert extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final GenericAlertContent<CryptoValidateOrderAction> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowSduiValidationAlert copy$default(ShowSduiValidationAlert showSduiValidationAlert, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = showSduiValidationAlert.content;
            }
            return showSduiValidationAlert.copy(genericAlertContent);
        }

        public final GenericAlertContent<CryptoValidateOrderAction> component1() {
            return this.content;
        }

        public final ShowSduiValidationAlert copy(GenericAlertContent<? extends CryptoValidateOrderAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ShowSduiValidationAlert(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSduiValidationAlert) && Intrinsics.areEqual(this.content, ((ShowSduiValidationAlert) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ShowSduiValidationAlert(content=" + this.content + ")";
        }

        public final GenericAlertContent<CryptoValidateOrderAction> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowSduiValidationAlert(GenericAlertContent<? extends CryptoValidateOrderAction> content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowValidationFailure;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "failure", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getFailure", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowValidationFailure extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final CryptoOrderContext cryptoOrderContext;
        private final CryptoOrderValidator2 failure;

        public static /* synthetic */ ShowValidationFailure copy$default(ShowValidationFailure showValidationFailure, CryptoOrderValidator2 cryptoOrderValidator2, CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderValidator2 = showValidationFailure.failure;
            }
            if ((i & 2) != 0) {
                cryptoOrderContext = showValidationFailure.cryptoOrderContext;
            }
            return showValidationFailure.copy(cryptoOrderValidator2, cryptoOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderValidator2 getFailure() {
            return this.failure;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final ShowValidationFailure copy(CryptoOrderValidator2 failure, CryptoOrderContext cryptoOrderContext) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            return new ShowValidationFailure(failure, cryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowValidationFailure)) {
                return false;
            }
            ShowValidationFailure showValidationFailure = (ShowValidationFailure) other;
            return Intrinsics.areEqual(this.failure, showValidationFailure.failure) && Intrinsics.areEqual(this.cryptoOrderContext, showValidationFailure.cryptoOrderContext);
        }

        public int hashCode() {
            return (this.failure.hashCode() * 31) + this.cryptoOrderContext.hashCode();
        }

        public String toString() {
            return "ShowValidationFailure(failure=" + this.failure + ", cryptoOrderContext=" + this.cryptoOrderContext + ")";
        }

        public final CryptoOrderValidator2 getFailure() {
            return this.failure;
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowValidationFailure(CryptoOrderValidator2 failure, CryptoOrderContext cryptoOrderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            this.failure = failure;
            this.cryptoOrderContext = cryptoOrderContext;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$HandleCryptoFeeEventType;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "type", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoQuoteOrder;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoQuoteOrder;)V", "getType", "()Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoQuoteOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HandleCryptoFeeEventType extends CryptoQuoteOrderEvent {
        public static final int $stable = 0;
        private final CryptoFeeUiEventProvider4.CryptoQuoteOrder type;

        public static /* synthetic */ HandleCryptoFeeEventType copy$default(HandleCryptoFeeEventType handleCryptoFeeEventType, CryptoFeeUiEventProvider4.CryptoQuoteOrder cryptoQuoteOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoQuoteOrder = handleCryptoFeeEventType.type;
            }
            return handleCryptoFeeEventType.copy(cryptoQuoteOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeUiEventProvider4.CryptoQuoteOrder getType() {
            return this.type;
        }

        public final HandleCryptoFeeEventType copy(CryptoFeeUiEventProvider4.CryptoQuoteOrder type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new HandleCryptoFeeEventType(type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleCryptoFeeEventType) && Intrinsics.areEqual(this.type, ((HandleCryptoFeeEventType) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "HandleCryptoFeeEventType(type=" + this.type + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleCryptoFeeEventType(CryptoFeeUiEventProvider4.CryptoQuoteOrder type2) {
            super(null);
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public final CryptoFeeUiEventProvider4.CryptoQuoteOrder getType() {
            return this.type;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "isRecurringOrder", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOrderTypeSelector extends CryptoQuoteOrderEvent {
        public static final int $stable = 0;
        private final boolean isRecurringOrder;

        public static /* synthetic */ ShowOrderTypeSelector copy$default(ShowOrderTypeSelector showOrderTypeSelector, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showOrderTypeSelector.isRecurringOrder;
            }
            return showOrderTypeSelector.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecurringOrder() {
            return this.isRecurringOrder;
        }

        public final ShowOrderTypeSelector copy(boolean isRecurringOrder) {
            return new ShowOrderTypeSelector(isRecurringOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOrderTypeSelector) && this.isRecurringOrder == ((ShowOrderTypeSelector) other).isRecurringOrder;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRecurringOrder);
        }

        public String toString() {
            return "ShowOrderTypeSelector(isRecurringOrder=" + this.isRecurringOrder + ")";
        }

        public ShowOrderTypeSelector(boolean z) {
            super(null);
            this.isRecurringOrder = z;
        }

        public final boolean isRecurringOrder() {
            return this.isRecurringOrder;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowFragmentInActivity;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragmentInActivity extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ ShowFragmentInActivity copy$default(ShowFragmentInActivity showFragmentInActivity, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = showFragmentInActivity.fragmentKey;
            }
            return showFragmentInActivity.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowFragmentInActivity copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowFragmentInActivity(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFragmentInActivity) && Intrinsics.areEqual(this.fragmentKey, ((ShowFragmentInActivity) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowFragmentInActivity(fragmentKey=" + this.fragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFragmentInActivity(FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey dialogFragmentKey;

        public static /* synthetic */ ShowDialogFragment copy$default(ShowDialogFragment showDialogFragment, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = showDialogFragment.dialogFragmentKey;
            }
            return showDialogFragment.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final ShowDialogFragment copy(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new ShowDialogFragment(dialogFragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDialogFragment) && Intrinsics.areEqual(this.dialogFragmentKey, ((ShowDialogFragment) other).dialogFragmentKey);
        }

        public int hashCode() {
            return this.dialogFragmentKey.hashCode();
        }

        public String toString() {
            return "ShowDialogFragment(dialogFragmentKey=" + this.dialogFragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDialogFragment(DialogFragmentKey dialogFragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "alertDto", "Lrh_server_driven_ui/v1/AlertDto;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getAlertDto", "()Lrh_server_driven_ui/v1/AlertDto;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAlertDto extends CryptoQuoteOrderEvent {
        public static final int $stable = 8;
        private final AlertDto alertDto;
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;

        public static /* synthetic */ ShowAlertDto copy$default(ShowAlertDto showAlertDto, AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                alertDto = showAlertDto.alertDto;
            }
            if ((i & 2) != 0) {
                cryptoOrderContext = showAlertDto.loggingCryptoOrderContext;
            }
            return showAlertDto.copy(alertDto, cryptoOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertDto getAlertDto() {
            return this.alertDto;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        public final ShowAlertDto copy(AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            Intrinsics.checkNotNullParameter(alertDto, "alertDto");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            return new ShowAlertDto(alertDto, loggingCryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAlertDto)) {
                return false;
            }
            ShowAlertDto showAlertDto = (ShowAlertDto) other;
            return Intrinsics.areEqual(this.alertDto, showAlertDto.alertDto) && Intrinsics.areEqual(this.loggingCryptoOrderContext, showAlertDto.loggingCryptoOrderContext);
        }

        public int hashCode() {
            return (this.alertDto.hashCode() * 31) + this.loggingCryptoOrderContext.hashCode();
        }

        public String toString() {
            return "ShowAlertDto(alertDto=" + this.alertDto + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ")";
        }

        public final AlertDto getAlertDto() {
            return this.alertDto;
        }

        public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAlertDto(AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(alertDto, "alertDto");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            this.alertDto = alertDto;
            this.loggingCryptoOrderContext = loggingCryptoOrderContext;
        }
    }

    /* compiled from: CryptoQuoteOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent$ShowRecurringAlertDialog;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowRecurringAlertDialog extends CryptoQuoteOrderEvent {
        public static final int $stable = StringResource.$stable;
        private final CryptoRecurringOrderAlertDialogFragment.Args args;

        public static /* synthetic */ ShowRecurringAlertDialog copy$default(ShowRecurringAlertDialog showRecurringAlertDialog, CryptoRecurringOrderAlertDialogFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showRecurringAlertDialog.args;
            }
            return showRecurringAlertDialog.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoRecurringOrderAlertDialogFragment.Args getArgs() {
            return this.args;
        }

        public final ShowRecurringAlertDialog copy(CryptoRecurringOrderAlertDialogFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowRecurringAlertDialog(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowRecurringAlertDialog) && Intrinsics.areEqual(this.args, ((ShowRecurringAlertDialog) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowRecurringAlertDialog(args=" + this.args + ")";
        }

        public final CryptoRecurringOrderAlertDialogFragment.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRecurringAlertDialog(CryptoRecurringOrderAlertDialogFragment.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }
}
