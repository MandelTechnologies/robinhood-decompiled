package com.robinhood.android.common.recurring.amount.type;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RecurringOrderAmountTypeViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u00014B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J=\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020'HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0011\u0010!\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010%\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState;", "", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "directDepositRelationshipState", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "selectedAmountType", "Lcom/robinhood/recurring/models/AmountType;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/lang/String;Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;Lcom/robinhood/recurring/models/AmountType;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getLoggingSource", "()Ljava/lang/String;", "getDirectDepositRelationshipState", "()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "getSelectedAmountType", "()Lcom/robinhood/recurring/models/AmountType;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "recurringContext", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getRecurringContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "recurringContext$delegate", "Lkotlin/Lazy;", "isDollarAmountOptionRowVisible", "", "()Z", "isDollarAmountOptionRowSelected", "isPercentageOptionRowVisible", "isPercentageOptionRowSelected", "isAmountTypeSelectedButtonEnabled", "isFooterVisible", "subtitleRes", "", "getSubtitleRes", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "DirectDepositRelationshipState", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderAmountTypeViewState {
    public static final int $stable = 8;
    private final ApiAssetType assetType;
    private final DirectDepositRelationshipState directDepositRelationshipState;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final String loggingSource;

    /* renamed from: recurringContext$delegate, reason: from kotlin metadata */
    private final Lazy recurringContext;
    private final AmountType selectedAmountType;

    public static /* synthetic */ RecurringOrderAmountTypeViewState copy$default(RecurringOrderAmountTypeViewState recurringOrderAmountTypeViewState, ApiAssetType apiAssetType, String str, DirectDepositRelationshipState directDepositRelationshipState, AmountType amountType, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = recurringOrderAmountTypeViewState.assetType;
        }
        if ((i & 2) != 0) {
            str = recurringOrderAmountTypeViewState.loggingSource;
        }
        if ((i & 4) != 0) {
            directDepositRelationshipState = recurringOrderAmountTypeViewState.directDepositRelationshipState;
        }
        if ((i & 8) != 0) {
            amountType = recurringOrderAmountTypeViewState.selectedAmountType;
        }
        if ((i & 16) != 0) {
            frequency = recurringOrderAmountTypeViewState.frequency;
        }
        ApiInvestmentSchedule.Frequency frequency2 = frequency;
        DirectDepositRelationshipState directDepositRelationshipState2 = directDepositRelationshipState;
        return recurringOrderAmountTypeViewState.copy(apiAssetType, str, directDepositRelationshipState2, amountType, frequency2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component3, reason: from getter */
    public final DirectDepositRelationshipState getDirectDepositRelationshipState() {
        return this.directDepositRelationshipState;
    }

    /* renamed from: component4, reason: from getter */
    public final AmountType getSelectedAmountType() {
        return this.selectedAmountType;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final RecurringOrderAmountTypeViewState copy(ApiAssetType assetType, String loggingSource, DirectDepositRelationshipState directDepositRelationshipState, AmountType selectedAmountType, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(directDepositRelationshipState, "directDepositRelationshipState");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new RecurringOrderAmountTypeViewState(assetType, loggingSource, directDepositRelationshipState, selectedAmountType, frequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderAmountTypeViewState)) {
            return false;
        }
        RecurringOrderAmountTypeViewState recurringOrderAmountTypeViewState = (RecurringOrderAmountTypeViewState) other;
        return this.assetType == recurringOrderAmountTypeViewState.assetType && Intrinsics.areEqual(this.loggingSource, recurringOrderAmountTypeViewState.loggingSource) && Intrinsics.areEqual(this.directDepositRelationshipState, recurringOrderAmountTypeViewState.directDepositRelationshipState) && this.selectedAmountType == recurringOrderAmountTypeViewState.selectedAmountType && this.frequency == recurringOrderAmountTypeViewState.frequency;
    }

    public int hashCode() {
        int iHashCode = ((((this.assetType.hashCode() * 31) + this.loggingSource.hashCode()) * 31) + this.directDepositRelationshipState.hashCode()) * 31;
        AmountType amountType = this.selectedAmountType;
        return ((iHashCode + (amountType == null ? 0 : amountType.hashCode())) * 31) + this.frequency.hashCode();
    }

    public String toString() {
        return "RecurringOrderAmountTypeViewState(assetType=" + this.assetType + ", loggingSource=" + this.loggingSource + ", directDepositRelationshipState=" + this.directDepositRelationshipState + ", selectedAmountType=" + this.selectedAmountType + ", frequency=" + this.frequency + ")";
    }

    public RecurringOrderAmountTypeViewState(ApiAssetType assetType, String loggingSource, DirectDepositRelationshipState directDepositRelationshipState, AmountType amountType, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(directDepositRelationshipState, "directDepositRelationshipState");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.assetType = assetType;
        this.loggingSource = loggingSource;
        this.directDepositRelationshipState = directDepositRelationshipState;
        this.selectedAmountType = amountType;
        this.frequency = frequency;
        this.recurringContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountTypeViewState.recurringContext_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    public /* synthetic */ RecurringOrderAmountTypeViewState(ApiAssetType apiAssetType, String str, DirectDepositRelationshipState directDepositRelationshipState, AmountType amountType, ApiInvestmentSchedule.Frequency frequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiAssetType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? DirectDepositRelationshipState.Loading.INSTANCE : directDepositRelationshipState, (i & 8) != 0 ? null : amountType, frequency);
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final DirectDepositRelationshipState getDirectDepositRelationshipState() {
        return this.directDepositRelationshipState;
    }

    public final AmountType getSelectedAmountType() {
        return this.selectedAmountType;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final RecurringContext getRecurringContext() {
        return (RecurringContext) this.recurringContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringContext recurringContext_delegate$lambda$0(RecurringOrderAmountTypeViewState recurringOrderAmountTypeViewState) {
        RecurringContext.EntryPoint entryPoint;
        RecurringContext.FlowType flowType = RecurringContext.FlowType.CREATE;
        RecurringContext.RecurringFundsSource recurringFundsSource = RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT;
        RecurringContext.ScheduleFrequency scheduleFrequency = RecurringContext.ScheduleFrequency.PAYCHECK;
        if (!StringsKt.isBlank(recurringOrderAmountTypeViewState.loggingSource)) {
            entryPoint = RecurringContext.EntryPoint.COMMS;
        } else {
            entryPoint = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        return new RecurringContext(flowType, entryPoint, recurringOrderAmountTypeViewState.loggingSource, scheduleFrequency, recurringFundsSource, 0.0d, Recurring2.toProtobuf(recurringOrderAmountTypeViewState.assetType), null, 0.0d, null, null, 1952, null);
    }

    public final boolean isDollarAmountOptionRowVisible() {
        return this.directDepositRelationshipState.isDollarAmountOptionRowVisible();
    }

    public final boolean isDollarAmountOptionRowSelected() {
        return this.selectedAmountType == AmountType.DOLLAR;
    }

    public final boolean isPercentageOptionRowVisible() {
        return this.directDepositRelationshipState.isPercentageOptionRowVisible();
    }

    public final boolean isPercentageOptionRowSelected() {
        return this.selectedAmountType == AmountType.PERCENTAGE;
    }

    public final boolean isAmountTypeSelectedButtonEnabled() {
        return this.selectedAmountType != null;
    }

    public final boolean isFooterVisible() {
        return this.directDepositRelationshipState.isFooterVisible();
    }

    public final int getSubtitleRes() {
        if (this.frequency == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            return C11595R.string.recurring_investment_amount_type_subtitle_paycheck;
        }
        return C11595R.string.recurring_investment_amount_type_subtitle;
    }

    /* compiled from: RecurringOrderAmountTypeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "", "<init>", "()V", "isDollarAmountOptionRowVisible", "", "()Z", "isPercentageOptionRowVisible", "isFooterVisible", "Loading", "None", "Some", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$Loading;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$None;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$Some;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DirectDepositRelationshipState {
        public static final int $stable = 0;

        public /* synthetic */ DirectDepositRelationshipState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean isDollarAmountOptionRowVisible();

        public abstract boolean isFooterVisible();

        public abstract boolean isPercentageOptionRowVisible();

        private DirectDepositRelationshipState() {
        }

        /* compiled from: RecurringOrderAmountTypeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$Loading;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "<init>", "()V", "isDollarAmountOptionRowVisible", "", "()Z", "isPercentageOptionRowVisible", "isFooterVisible", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends DirectDepositRelationshipState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();
            private static final boolean isDollarAmountOptionRowVisible = false;
            private static final boolean isFooterVisible = false;
            private static final boolean isPercentageOptionRowVisible = false;

            private Loading() {
                super(null);
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isDollarAmountOptionRowVisible() {
                return isDollarAmountOptionRowVisible;
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isPercentageOptionRowVisible() {
                return isPercentageOptionRowVisible;
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isFooterVisible() {
                return isFooterVisible;
            }
        }

        /* compiled from: RecurringOrderAmountTypeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$None;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "<init>", "()V", "isDollarAmountOptionRowVisible", "", "()Z", "isPercentageOptionRowVisible", "isFooterVisible", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class None extends DirectDepositRelationshipState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();
            private static final boolean isDollarAmountOptionRowVisible = true;
            private static final boolean isPercentageOptionRowVisible = true;
            private static final boolean isFooterVisible = true;

            private None() {
                super(null);
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isDollarAmountOptionRowVisible() {
                return isDollarAmountOptionRowVisible;
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isPercentageOptionRowVisible() {
                return isPercentageOptionRowVisible;
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isFooterVisible() {
                return isFooterVisible;
            }
        }

        /* compiled from: RecurringOrderAmountTypeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState$Some;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState$DirectDepositRelationshipState;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "<init>", "(Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;)V", "getDirectDepositRelationship", "()Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "isDollarAmountOptionRowVisible", "", "()Z", "isPercentageOptionRowVisible", "isFooterVisible", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Some extends DirectDepositRelationshipState {
            public static final int $stable = 8;
            private final DirectDepositRelationship directDepositRelationship;

            /* compiled from: RecurringOrderAmountTypeViewState.kt */
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

            public final DirectDepositRelationship getDirectDepositRelationship() {
                return this.directDepositRelationship;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Some(DirectDepositRelationship directDepositRelationship) {
                super(null);
                Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
                this.directDepositRelationship = directDepositRelationship;
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isDollarAmountOptionRowVisible() {
                AmountType paycheckInvestmentAmountType = this.directDepositRelationship.getPaycheckInvestmentAmountType();
                int i = paycheckInvestmentAmountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paycheckInvestmentAmountType.ordinal()];
                if (i == -1 || i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isPercentageOptionRowVisible() {
                AmountType paycheckInvestmentAmountType = this.directDepositRelationship.getPaycheckInvestmentAmountType();
                int i = paycheckInvestmentAmountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paycheckInvestmentAmountType.ordinal()];
                if (i == -1) {
                    return true;
                }
                if (i == 1) {
                    return false;
                }
                if (i == 2) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState.DirectDepositRelationshipState
            public boolean isFooterVisible() {
                AmountType paycheckInvestmentAmountType = this.directDepositRelationship.getPaycheckInvestmentAmountType();
                int i = paycheckInvestmentAmountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paycheckInvestmentAmountType.ordinal()];
                if (i == -1) {
                    return true;
                }
                if (i == 1 || i == 2) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
