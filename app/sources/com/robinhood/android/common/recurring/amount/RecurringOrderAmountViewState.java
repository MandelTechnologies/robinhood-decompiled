package com.robinhood.android.common.recurring.amount;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.text.ThemedStringResource;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringOrderAmountViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010#\u001a\u00020\"J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003Je\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00105\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010&\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState;", "", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "investmentScheduleId", "Ljava/util/UUID;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "showMaximumAmountDialogEvent", "Lcom/robinhood/udf/UiEvent;", "", "showMinimumAmountDialogEvent", "updateAmountState", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "loggingFlowType", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Ljava/util/UUID;Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;)V", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getInvestmentScheduleId", "()Ljava/util/UUID;", "getInvestmentSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "getShowMaximumAmountDialogEvent", "()Lcom/robinhood/udf/UiEvent;", "getShowMinimumAmountDialogEvent", "getUpdateAmountState", "()Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "getLoggingFlowType", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "scheduleId", "getScheduleId", "doneBtnEnabled", "", "fromInvestFlow", "recurringAmountSubtextState", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$SubtextState;", "doneBtnLoading", "getDoneBtnLoading", "()Z", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "UpdateAmountState", "SubtextState", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderAmountViewState {
    public static final int $stable = 8;
    private final InvestmentScheduleAmount amount;
    private final InvestmentSchedule investmentSchedule;
    private final UUID investmentScheduleId;
    private final RecurringContext loggingContext;
    private final RecurringContext.FlowType loggingFlowType;
    private final UiEvent<Unit> showMaximumAmountDialogEvent;
    private final UiEvent<Unit> showMinimumAmountDialogEvent;
    private final UpdateAmountState updateAmountState;

    /* compiled from: RecurringOrderAmountViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ RecurringOrderAmountViewState copy$default(RecurringOrderAmountViewState recurringOrderAmountViewState, InvestmentScheduleAmount investmentScheduleAmount, UUID uuid, InvestmentSchedule investmentSchedule, UiEvent uiEvent, UiEvent uiEvent2, UpdateAmountState updateAmountState, RecurringContext.FlowType flowType, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentScheduleAmount = recurringOrderAmountViewState.amount;
        }
        if ((i & 2) != 0) {
            uuid = recurringOrderAmountViewState.investmentScheduleId;
        }
        if ((i & 4) != 0) {
            investmentSchedule = recurringOrderAmountViewState.investmentSchedule;
        }
        if ((i & 8) != 0) {
            uiEvent = recurringOrderAmountViewState.showMaximumAmountDialogEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = recurringOrderAmountViewState.showMinimumAmountDialogEvent;
        }
        if ((i & 32) != 0) {
            updateAmountState = recurringOrderAmountViewState.updateAmountState;
        }
        if ((i & 64) != 0) {
            flowType = recurringOrderAmountViewState.loggingFlowType;
        }
        UpdateAmountState updateAmountState2 = updateAmountState;
        RecurringContext.FlowType flowType2 = flowType;
        UiEvent uiEvent3 = uiEvent2;
        InvestmentSchedule investmentSchedule2 = investmentSchedule;
        return recurringOrderAmountViewState.copy(investmentScheduleAmount, uuid, investmentSchedule2, uiEvent, uiEvent3, updateAmountState2, flowType2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentScheduleAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    /* renamed from: component3, reason: from getter */
    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    public final UiEvent<Unit> component4() {
        return this.showMaximumAmountDialogEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.showMinimumAmountDialogEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final UpdateAmountState getUpdateAmountState() {
        return this.updateAmountState;
    }

    /* renamed from: component7, reason: from getter */
    public final RecurringContext.FlowType getLoggingFlowType() {
        return this.loggingFlowType;
    }

    public final RecurringOrderAmountViewState copy(InvestmentScheduleAmount amount, UUID investmentScheduleId, InvestmentSchedule investmentSchedule, UiEvent<Unit> showMaximumAmountDialogEvent, UiEvent<Unit> showMinimumAmountDialogEvent, UpdateAmountState updateAmountState, RecurringContext.FlowType loggingFlowType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(loggingFlowType, "loggingFlowType");
        return new RecurringOrderAmountViewState(amount, investmentScheduleId, investmentSchedule, showMaximumAmountDialogEvent, showMinimumAmountDialogEvent, updateAmountState, loggingFlowType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderAmountViewState)) {
            return false;
        }
        RecurringOrderAmountViewState recurringOrderAmountViewState = (RecurringOrderAmountViewState) other;
        return Intrinsics.areEqual(this.amount, recurringOrderAmountViewState.amount) && Intrinsics.areEqual(this.investmentScheduleId, recurringOrderAmountViewState.investmentScheduleId) && Intrinsics.areEqual(this.investmentSchedule, recurringOrderAmountViewState.investmentSchedule) && Intrinsics.areEqual(this.showMaximumAmountDialogEvent, recurringOrderAmountViewState.showMaximumAmountDialogEvent) && Intrinsics.areEqual(this.showMinimumAmountDialogEvent, recurringOrderAmountViewState.showMinimumAmountDialogEvent) && Intrinsics.areEqual(this.updateAmountState, recurringOrderAmountViewState.updateAmountState) && this.loggingFlowType == recurringOrderAmountViewState.loggingFlowType;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        UUID uuid = this.investmentScheduleId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        int iHashCode3 = (iHashCode2 + (investmentSchedule == null ? 0 : investmentSchedule.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.showMaximumAmountDialogEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.showMinimumAmountDialogEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UpdateAmountState updateAmountState = this.updateAmountState;
        return ((iHashCode5 + (updateAmountState != null ? updateAmountState.hashCode() : 0)) * 31) + this.loggingFlowType.hashCode();
    }

    public String toString() {
        return "RecurringOrderAmountViewState(amount=" + this.amount + ", investmentScheduleId=" + this.investmentScheduleId + ", investmentSchedule=" + this.investmentSchedule + ", showMaximumAmountDialogEvent=" + this.showMaximumAmountDialogEvent + ", showMinimumAmountDialogEvent=" + this.showMinimumAmountDialogEvent + ", updateAmountState=" + this.updateAmountState + ", loggingFlowType=" + this.loggingFlowType + ")";
    }

    public RecurringOrderAmountViewState(InvestmentScheduleAmount amount, UUID uuid, InvestmentSchedule investmentSchedule, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, UpdateAmountState updateAmountState, RecurringContext.FlowType loggingFlowType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(loggingFlowType, "loggingFlowType");
        this.amount = amount;
        this.investmentScheduleId = uuid;
        this.investmentSchedule = investmentSchedule;
        this.showMaximumAmountDialogEvent = uiEvent;
        this.showMinimumAmountDialogEvent = uiEvent2;
        this.updateAmountState = updateAmountState;
        this.loggingFlowType = loggingFlowType;
        this.loggingContext = new RecurringContext(loggingFlowType, null, null, Recurring2.toProtobuf(investmentSchedule != null ? investmentSchedule.getFrequency() : null), Recurring2.toProtobuf(investmentSchedule != null ? investmentSchedule.getSourceOfFunds() : null), amount.getDollarAmount().getDecimalValue().doubleValue(), null, null, amount.getPercentageAmount().doubleValue(), null, null, 1734, null);
    }

    public final InvestmentScheduleAmount getAmount() {
        return this.amount;
    }

    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    public final UiEvent<Unit> getShowMaximumAmountDialogEvent() {
        return this.showMaximumAmountDialogEvent;
    }

    public final UiEvent<Unit> getShowMinimumAmountDialogEvent() {
        return this.showMinimumAmountDialogEvent;
    }

    public final UpdateAmountState getUpdateAmountState() {
        return this.updateAmountState;
    }

    public /* synthetic */ RecurringOrderAmountViewState(InvestmentScheduleAmount investmentScheduleAmount, UUID uuid, InvestmentSchedule investmentSchedule, UiEvent uiEvent, UiEvent uiEvent2, UpdateAmountState updateAmountState, RecurringContext.FlowType flowType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentScheduleAmount, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : investmentSchedule, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : updateAmountState, (i & 64) != 0 ? RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED : flowType);
    }

    public final RecurringContext.FlowType getLoggingFlowType() {
        return this.loggingFlowType;
    }

    public final UUID getScheduleId() {
        UUID uuid = this.investmentScheduleId;
        if (uuid != null) {
            return uuid;
        }
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule != null) {
            return investmentSchedule.getId();
        }
        return null;
    }

    public final boolean doneBtnEnabled(boolean fromInvestFlow) {
        InvestmentTarget investmentTarget;
        ApiAssetType targetType;
        if (fromInvestFlow) {
            return true;
        }
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null || (investmentTarget = investmentSchedule.getInvestmentTarget()) == null || (targetType = investmentTarget.getTargetType()) == null) {
            return false;
        }
        return this.amount.isValid(targetType);
    }

    public final SubtextState recurringAmountSubtextState(boolean fromInvestFlow) {
        InvestmentTarget investmentTarget;
        ApiAssetType targetType;
        int i = WhenMappings.$EnumSwitchMapping$0[this.amount.getAmountType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fromInvestFlow) {
            targetType = ApiAssetType.EQUITY;
        } else {
            InvestmentSchedule investmentSchedule = this.investmentSchedule;
            if (investmentSchedule == null || (investmentTarget = investmentSchedule.getInvestmentTarget()) == null || (targetType = investmentTarget.getTargetType()) == null) {
                return null;
            }
        }
        String str = Money.format$default(RecurringInvestmentsConstants.INSTANCE.maxRecurringOrderAmount(targetType), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (this.amount.isAboveMaxThreshold(targetType)) {
            return new SubtextState(false, new ThemedStringResource(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE()), StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_maximum_amount_exceeded_subtext, str)));
        }
        return new SubtextState(true, new ThemedStringResource(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2(), StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_amount_subtext, str)));
    }

    public final boolean getDoneBtnLoading() {
        return this.updateAmountState instanceof UpdateAmountState.Updating;
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    /* compiled from: RecurringOrderAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "", "<init>", "()V", "Updating", "Success", "Error", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Error;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Success;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Updating;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class UpdateAmountState {
        public static final int $stable = 0;

        public /* synthetic */ UpdateAmountState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: RecurringOrderAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Updating;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Updating extends UpdateAmountState {
            public static final int $stable = 0;
            public static final Updating INSTANCE = new Updating();

            private Updating() {
                super(null);
            }
        }

        private UpdateAmountState() {
        }

        /* compiled from: RecurringOrderAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Success;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends UpdateAmountState {
            public static final int $stable = 8;
            private final UiEvent<InvestmentScheduleAmount> event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UiEvent<InvestmentScheduleAmount> event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }

            public final UiEvent<InvestmentScheduleAmount> getEvent() {
                return this.event;
            }
        }

        /* compiled from: RecurringOrderAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState$Error;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$UpdateAmountState;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends UpdateAmountState {
            public static final int $stable = 8;
            private final UiEvent<Throwable> event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(UiEvent<Throwable> event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }

            public final UiEvent<Throwable> getEvent() {
                return this.event;
            }
        }
    }

    /* compiled from: RecurringOrderAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$SubtextState;", "", "isInfoIconVisible", "", "content", "Lcom/robinhood/android/common/util/text/ThemedStringResource;", "<init>", "(ZLcom/robinhood/android/common/util/text/ThemedStringResource;)V", "()Z", "getContent", "()Lcom/robinhood/android/common/util/text/ThemedStringResource;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SubtextState {
        public static final int $stable = ThemedStringResource.$stable;
        private final ThemedStringResource content;
        private final boolean isInfoIconVisible;

        public SubtextState(boolean z, ThemedStringResource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.isInfoIconVisible = z;
            this.content = content;
        }

        /* renamed from: isInfoIconVisible, reason: from getter */
        public final boolean getIsInfoIconVisible() {
            return this.isInfoIconVisible;
        }

        public final ThemedStringResource getContent() {
            return this.content;
        }
    }
}
