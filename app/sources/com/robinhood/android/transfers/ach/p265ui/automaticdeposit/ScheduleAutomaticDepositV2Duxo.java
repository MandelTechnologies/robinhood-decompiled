package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment;
import com.robinhood.android.transfers.ach.p265ui.experiments.OnboardingRecurringDepositCleanup;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleAutomaticDepositV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setSelectedFrequency", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ScheduleAutomaticDepositV2Duxo extends BaseDuxo<ScheduleAutomaticDepositV2DataState, ScheduleAutomaticDepositV2ViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleAutomaticDepositV2Duxo(ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new ScheduleAutomaticDepositV2DataState(null, null, 3, null), ScheduleAutomaticDepositV2DataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((ScheduleAutomaticDepositV2Fragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIsFromRhfOnboarding()) {
            LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{OnboardingRecurringDepositCleanup.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Duxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScheduleAutomaticDepositV2Duxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            applyMutation(new C301602(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ScheduleAutomaticDepositV2Duxo scheduleAutomaticDepositV2Duxo, boolean z) {
        scheduleAutomaticDepositV2Duxo.applyMutation(new ScheduleAutomaticDepositV2Duxo2(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ScheduleAutomaticDepositV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Duxo$onCreate$2", m3645f = "ScheduleAutomaticDepositV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Duxo$onCreate$2 */
    static final class C301602 extends ContinuationImpl7 implements Function2<ScheduleAutomaticDepositV2DataState, Continuation<? super ScheduleAutomaticDepositV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C301602(Continuation<? super C301602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C301602 c301602 = new C301602(continuation);
            c301602.L$0 = obj;
            return c301602;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScheduleAutomaticDepositV2DataState scheduleAutomaticDepositV2DataState, Continuation<? super ScheduleAutomaticDepositV2DataState> continuation) {
            return ((C301602) create(scheduleAutomaticDepositV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ScheduleAutomaticDepositV2DataState.copy$default((ScheduleAutomaticDepositV2DataState) this.L$0, null, boxing.boxBoolean(false), 1, null);
        }
    }

    /* compiled from: ScheduleAutomaticDepositV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Duxo$setSelectedFrequency$1", m3645f = "ScheduleAutomaticDepositV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Duxo$setSelectedFrequency$1 */
    static final class C301611 extends ContinuationImpl7 implements Function2<ScheduleAutomaticDepositV2DataState, Continuation<? super ScheduleAutomaticDepositV2DataState>, Object> {
        final /* synthetic */ ApiAutomaticDeposit.Frequency $frequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301611(ApiAutomaticDeposit.Frequency frequency, Continuation<? super C301611> continuation) {
            super(2, continuation);
            this.$frequency = frequency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C301611 c301611 = new C301611(this.$frequency, continuation);
            c301611.L$0 = obj;
            return c301611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScheduleAutomaticDepositV2DataState scheduleAutomaticDepositV2DataState, Continuation<? super ScheduleAutomaticDepositV2DataState> continuation) {
            return ((C301611) create(scheduleAutomaticDepositV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ScheduleAutomaticDepositV2DataState.copy$default((ScheduleAutomaticDepositV2DataState) this.L$0, this.$frequency, null, 2, null);
        }
    }

    public final void setSelectedFrequency(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new C301611(frequency, null));
    }

    /* compiled from: ScheduleAutomaticDepositV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Duxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ScheduleAutomaticDepositV2Duxo, ScheduleAutomaticDepositV2Fragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScheduleAutomaticDepositV2Fragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ScheduleAutomaticDepositV2Fragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScheduleAutomaticDepositV2Fragment.Args getArgs(ScheduleAutomaticDepositV2Duxo scheduleAutomaticDepositV2Duxo) {
            return (ScheduleAutomaticDepositV2Fragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, scheduleAutomaticDepositV2Duxo);
        }
    }
}
