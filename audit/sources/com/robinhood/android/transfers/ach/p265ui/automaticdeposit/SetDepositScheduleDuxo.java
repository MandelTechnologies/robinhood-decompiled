package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.DepositScheduleStore;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.models.p355ui.UiDepositSchedule;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: SetDepositScheduleDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\n \"*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "depositScheduleStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "automaticDepositStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Landroidx/lifecycle/SavedStateHandle;)V", "", "logUserTransfersCount", "()V", "onStart", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "setSelectedFrequency", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "setSelectedStartDate", "(Lj$/time/LocalDate;)V", "onSubmitClicked", "onDialogContinueClicked", "Lcom/robinhood/analytics/AnalyticsLogger;", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "kotlin.jvm.PlatformType", "selectedStartDate", "Lj$/time/LocalDate;", "selectedFrequency", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "config", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SetDepositScheduleDuxo extends OldBaseDuxo<SetDepositScheduleViewState> implements HasSavedState {
    private final AnalyticsLogger analytics;
    private final AutomaticDepositStore automaticDepositStore;
    private final DepositScheduleFlowArgs2 config;
    private final DepositScheduleStore depositScheduleStore;
    private final SavedStateHandle savedStateHandle;
    private ApiDepositSchedule.Frequency selectedFrequency;
    private LocalDate selectedStartDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SetDepositScheduleDuxo(AnalyticsLogger analytics, DepositScheduleStore depositScheduleStore, AutomaticDepositStore automaticDepositStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(depositScheduleStore, "depositScheduleStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ApiDepositSchedule.Frequency frequency = ((SetDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getFrequencySelectionArgs().getFrequency();
        LocalDate startDate = ((SetDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getFrequencySelectionArgs().getStartDate();
        startDate = startDate == null ? LocalDate.now() : startDate;
        Intrinsics.checkNotNull(startDate);
        super(new SetDepositScheduleViewState.Loaded(frequency, startDate, ((SetDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getFrequencySelectionArgs()), null, 2, 0 == true ? 1 : 0);
        this.analytics = analytics;
        this.depositScheduleStore = depositScheduleStore;
        this.automaticDepositStore = automaticDepositStore;
        this.savedStateHandle = savedStateHandle;
        LocalDate startDate2 = ((SetDepositScheduleFragment.Args) companion.getArgs(getSavedStateHandle())).getFrequencySelectionArgs().getStartDate();
        this.selectedStartDate = startDate2 == null ? LocalDate.now() : startDate2;
        this.selectedFrequency = ((SetDepositScheduleFragment.Args) companion.getArgs(getSavedStateHandle())).getFrequencySelectionArgs().getFrequency();
        this.config = ((SetDepositScheduleFragment.Args) companion.getArgs(getSavedStateHandle())).getFrequencySelectionArgs();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetDepositScheduleDuxo.onStart$lambda$0(this.f$0, (SetDepositScheduleViewState) obj);
            }
        });
        logUserTransfersCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState onStart$lambda$0(SetDepositScheduleDuxo setDepositScheduleDuxo, SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiDepositSchedule.Frequency frequency = setDepositScheduleDuxo.selectedFrequency;
        LocalDate selectedStartDate = setDepositScheduleDuxo.selectedStartDate;
        Intrinsics.checkNotNullExpressionValue(selectedStartDate, "selectedStartDate");
        return new SetDepositScheduleViewState.Loaded(frequency, selectedStartDate, setDepositScheduleDuxo.config);
    }

    private final void logUserTransfersCount() {
        Observable map = Observables.INSTANCE.combineLatest(this.automaticDepositStore.getAutomaticDeposits(), this.depositScheduleStore.getStreamDepositSchedules().asObservable(Unit.INSTANCE)).map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo.logUserTransfersCount.1
            @Override // io.reactivex.functions.Function
            public final Integer apply(Tuples2<? extends List<AutomaticDepositWithBankInfo>, ? extends List<UiDepositSchedule>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Integer.valueOf(CollectionsKt.plus((Collection) tuples2.component1(), (Iterable) tuples2.component2()).size());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetDepositScheduleDuxo.logUserTransfersCount$lambda$1(this.f$0, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logUserTransfersCount$lambda$1(SetDepositScheduleDuxo setDepositScheduleDuxo, Integer num) {
        AnalyticsLogger.DefaultImpls.logUserAction$default(setDepositScheduleDuxo.analytics, AnalyticsStrings.USER_RECURRING_DEPOSITS_COUNT, null, null, "count: " + num, 6, null);
        return Unit.INSTANCE;
    }

    public final void setSelectedFrequency(ApiDepositSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.selectedFrequency = frequency;
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetDepositScheduleDuxo.setSelectedFrequency$lambda$2(this.f$0, (SetDepositScheduleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState setSelectedFrequency$lambda$2(SetDepositScheduleDuxo setDepositScheduleDuxo, SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiDepositSchedule.Frequency frequency = setDepositScheduleDuxo.selectedFrequency;
        LocalDate selectedStartDate = setDepositScheduleDuxo.selectedStartDate;
        Intrinsics.checkNotNullExpressionValue(selectedStartDate, "selectedStartDate");
        return new SetDepositScheduleViewState.Loaded(frequency, selectedStartDate, setDepositScheduleDuxo.config);
    }

    public final void setSelectedStartDate(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.selectedStartDate = date;
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetDepositScheduleDuxo.setSelectedStartDate$lambda$3(this.f$0, (SetDepositScheduleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState setSelectedStartDate$lambda$3(SetDepositScheduleDuxo setDepositScheduleDuxo, SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiDepositSchedule.Frequency frequency = setDepositScheduleDuxo.selectedFrequency;
        LocalDate selectedStartDate = setDepositScheduleDuxo.selectedStartDate;
        Intrinsics.checkNotNullExpressionValue(selectedStartDate, "selectedStartDate");
        return new SetDepositScheduleViewState.Loaded(frequency, selectedStartDate, setDepositScheduleDuxo.config);
    }

    public final void onSubmitClicked() {
        if (this.selectedFrequency == ApiDepositSchedule.Frequency.MONTHLY && this.selectedStartDate.getDayOfMonth() > 28) {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SetDepositScheduleDuxo.onSubmitClicked$lambda$4((SetDepositScheduleViewState) obj);
                }
            });
        } else {
            onDialogContinueClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState onSubmitClicked$lambda$4(SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SetDepositScheduleViewState.WarningDialog.INSTANCE;
    }

    public final void onDialogContinueClicked() {
        final DepositScheduleFlowArgs2 depositScheduleFlowArgs2 = this.config;
        if (depositScheduleFlowArgs2 instanceof DepositScheduleFlowArgs2.Edit) {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SetDepositScheduleDuxo.onDialogContinueClicked$lambda$5(depositScheduleFlowArgs2, this, (SetDepositScheduleViewState) obj);
                }
            });
        } else {
            if (!(depositScheduleFlowArgs2 instanceof DepositScheduleFlowArgs2.Create)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SetDepositScheduleDuxo.onDialogContinueClicked$lambda$6(this.f$0, (SetDepositScheduleViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState onDialogContinueClicked$lambda$5(DepositScheduleFlowArgs2 depositScheduleFlowArgs2, SetDepositScheduleDuxo setDepositScheduleDuxo, SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        DepositScheduleFlowArgs2.Edit edit = (DepositScheduleFlowArgs2.Edit) depositScheduleFlowArgs2;
        String depositScheduleId = edit.getDepositScheduleId();
        ApiDepositSchedule.Frequency frequency = setDepositScheduleDuxo.selectedFrequency;
        Intrinsics.checkNotNull(frequency);
        LocalDate selectedStartDate = setDepositScheduleDuxo.selectedStartDate;
        Intrinsics.checkNotNullExpressionValue(selectedStartDate, "selectedStartDate");
        return new SetDepositScheduleViewState.ShowReviewScreen(new DepositScheduleFlowArgs3.Edit(frequency, selectedStartDate, edit.getAmount(), edit.getAchRelationshipId(), depositScheduleId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetDepositScheduleViewState onDialogContinueClicked$lambda$6(SetDepositScheduleDuxo setDepositScheduleDuxo, SetDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiDepositSchedule.Frequency frequency = setDepositScheduleDuxo.selectedFrequency;
        Intrinsics.checkNotNull(frequency);
        LocalDate selectedStartDate = setDepositScheduleDuxo.selectedStartDate;
        Intrinsics.checkNotNullExpressionValue(selectedStartDate, "selectedStartDate");
        return new SetDepositScheduleViewState.ShowEnterAmountScreen(new DepositScheduleFlowArgs(frequency, selectedStartDate));
    }

    /* compiled from: SetDepositScheduleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SetDepositScheduleDuxo, SetDepositScheduleFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SetDepositScheduleFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SetDepositScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SetDepositScheduleFragment.Args getArgs(SetDepositScheduleDuxo setDepositScheduleDuxo) {
            return (SetDepositScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, setDepositScheduleDuxo);
        }
    }
}
