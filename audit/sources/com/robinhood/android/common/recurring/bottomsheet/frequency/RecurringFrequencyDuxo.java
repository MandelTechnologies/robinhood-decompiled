package com.robinhood.android.common.recurring.bottomsheet.frequency;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.utils.RecurringLoggingUtils;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiNextInvestmentDate;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Scheduler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringFrequencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "onCreate", "", "onResume", "onDestroy", "onRowClicked", "row", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "logRowTap", "context", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "logDismiss", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringFrequencyDuxo extends OldBaseDuxo<RecurringFrequencyViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EventLogger eventLogger;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final boolean isCrypto;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringFrequencyDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, RhyAccountStore rhyAccountStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Boolean bool = (Boolean) savedStateHandle.get("isCrypto");
        Scheduler scheduler = null;
        super(new RecurringFrequencyViewState(false, null, null, bool != null ? bool.booleanValue() : false, (RecurringContext) savedStateHandle.get(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT), (LocalDate) savedStateHandle.get(RecurringFrequencyBottomSheet.ARG_USER_SELECTED_NEXT_DATE), null, 71, null), scheduler, 2, 0 == true ? 1 : 0);
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.rhyAccountStore = rhyAccountStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.frequency = (ApiInvestmentSchedule.Frequency) getSavedStateHandle().get("frequency");
        Boolean bool2 = (Boolean) getSavedStateHandle().get("isCrypto");
        this.isCrypto = bool2 != null ? bool2.booleanValue() : false;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onCreate$lambda$0(this.f$0, (RecurringFrequencyViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringFrequencyViewState onCreate$lambda$0(RecurringFrequencyDuxo recurringFrequencyDuxo, RecurringFrequencyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiInvestmentSchedule.Frequency frequency = recurringFrequencyDuxo.frequency;
        return RecurringFrequencyViewState.copy$default(applyMutation, false, frequency != null ? RecurringFrequencyBottomSheet4.toBottomSheetRow(frequency, applyMutation.isCrypto()) : null, null, false, null, null, null, 125, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getHasDirectDepositRelationships(RhEntity.RHY), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LocalDate localDateDefaultInvestmentStartDate$default = InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null);
        ApiAssetType apiAssetType = this.isCrypto ? ApiAssetType.CRYPTO : ApiAssetType.EQUITY;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            frequency = ApiInvestmentSchedule.Frequency.WEEKLY;
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.investmentScheduleStore.getNextInvestmentDate(apiAssetType, localDateDefaultInvestmentStartDate$default, frequency), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$4(this.f$0, (ApiNextInvestmentDate) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$6(this.f$0, (RhyAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RecurringFrequencyDuxo recurringFrequencyDuxo, final boolean z) {
        recurringFrequencyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$2$lambda$1(z, (RecurringFrequencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringFrequencyViewState onResume$lambda$2$lambda$1(boolean z, RecurringFrequencyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringFrequencyViewState.copy$default(applyMutation, z, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(RecurringFrequencyDuxo recurringFrequencyDuxo, final ApiNextInvestmentDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        recurringFrequencyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$4$lambda$3(date, (RecurringFrequencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringFrequencyViewState onResume$lambda$4$lambda$3(ApiNextInvestmentDate apiNextInvestmentDate, RecurringFrequencyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringFrequencyViewState.copy$default(applyMutation, false, null, null, false, null, null, apiNextInvestmentDate.getNext_investment_date(), 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(RecurringFrequencyDuxo recurringFrequencyDuxo, final RhyAccount rhyAccount) {
        Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
        recurringFrequencyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onResume$lambda$6$lambda$5(rhyAccount, (RecurringFrequencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringFrequencyViewState onResume$lambda$6$lambda$5(RhyAccount rhyAccount, RecurringFrequencyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringFrequencyViewState.copy$default(applyMutation, false, null, rhyAccount, false, null, null, null, 123, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onDestroy() {
        super.onDestroy();
        logDismiss();
    }

    public final void onRowClicked(final RecurringFrequencyBottomSheet.Row row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringFrequencyDuxo.onRowClicked$lambda$7(this.f$0, row, (RecurringFrequencyViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringFrequencyViewState onRowClicked$lambda$7(RecurringFrequencyDuxo recurringFrequencyDuxo, RecurringFrequencyBottomSheet.Row row, RecurringFrequencyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        recurringFrequencyDuxo.logRowTap(row, applyMutation.getLoggingContext());
        return RecurringFrequencyViewState.copy$default(applyMutation, false, row, null, false, null, null, null, 125, null);
    }

    public final void logRowTap(RecurringFrequencyBottomSheet.Row row, RecurringContext context) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(context, "context");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT_FREQUENCY, new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RecurringContext.copy$default(context, null, null, null, RecurringLoggingUtils.toRecurringContextScheduleFrequency(row.getFrequency()), null, 0.0d, null, null, 0.0d, null, null, 2039, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
    }

    public final void logDismiss() {
        EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null), null, null, null, 28, null);
    }
}
