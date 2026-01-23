package com.robinhood.android.settings.p254ui.recurring.pastinvestments;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.shared.models.history.shared.HistoryEvent2;
import com.robinhood.shared.recurring.contracts.RecurringPastInvestmentsFragmentKey;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PastInvestmentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/store/base/InvestmentScheduleEventStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PastInvestmentsDuxo extends BaseDuxo4<PastInvestmentsViewState> implements HasSavedState {
    private final InvestmentScheduleEventStore investmentScheduleEventStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PastInvestmentsDuxo(DuxoBundle duxoBundle, InvestmentScheduleEventStore investmentScheduleEventStore, SavedStateHandle savedStateHandle) {
        super(new PastInvestmentsViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PastInvestmentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1", m3645f = "PastInvestmentsDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1 */
    static final class C284671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C284671(Continuation<? super C284671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PastInvestmentsDuxo.this.new C284671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C284671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentScheduleEventStore.DefaultImpls.refresh$default(PastInvestmentsDuxo.this.investmentScheduleEventStore, false, null, 2, null);
                Flow<List<UiInvestmentScheduleEvent>> flowStreamInvestmentScheduleEventBySchedule = PastInvestmentsDuxo.this.investmentScheduleEventStore.streamInvestmentScheduleEventBySchedule(((RecurringPastInvestmentsFragmentKey) PastInvestmentsDuxo.INSTANCE.getArgs((HasSavedState) PastInvestmentsDuxo.this)).getInvestmentScheduleId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PastInvestmentsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamInvestmentScheduleEventBySchedule, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PastInvestmentsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "events", "", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1$1", m3645f = "PastInvestmentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiInvestmentScheduleEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PastInvestmentsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PastInvestmentsDuxo pastInvestmentsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pastInvestmentsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiInvestmentScheduleEvent> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiInvestmentScheduleEvent>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiInvestmentScheduleEvent> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PastInvestmentsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1$1$1", m3645f = "PastInvestmentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.settings.ui.recurring.pastinvestments.PastInvestmentsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505441 extends ContinuationImpl7 implements Function2<PastInvestmentsViewState, Continuation<? super PastInvestmentsViewState>, Object> {
                final /* synthetic */ List<UiInvestmentScheduleEvent> $events;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505441(List<UiInvestmentScheduleEvent> list, Continuation<? super C505441> continuation) {
                    super(2, continuation);
                    this.$events = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505441 c505441 = new C505441(this.$events, continuation);
                    c505441.L$0 = obj;
                    return c505441;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PastInvestmentsViewState pastInvestmentsViewState, Continuation<? super PastInvestmentsViewState> continuation) {
                    return ((C505441) create(pastInvestmentsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PastInvestmentsViewState pastInvestmentsViewState = (PastInvestmentsViewState) this.L$0;
                    return pastInvestmentsViewState.copy(HistoryEvent2.mergeState(pastInvestmentsViewState.getInvestmentScheduleEvents(), this.$events));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505441((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C284671(null));
    }

    /* compiled from: PastInvestmentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsDuxo;", "Lcom/robinhood/shared/recurring/contracts/RecurringPastInvestmentsFragmentKey;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PastInvestmentsDuxo, RecurringPastInvestmentsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringPastInvestmentsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringPastInvestmentsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringPastInvestmentsFragmentKey getArgs(PastInvestmentsDuxo pastInvestmentsDuxo) {
            return (RecurringPastInvestmentsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, pastInvestmentsDuxo);
        }
    }
}
