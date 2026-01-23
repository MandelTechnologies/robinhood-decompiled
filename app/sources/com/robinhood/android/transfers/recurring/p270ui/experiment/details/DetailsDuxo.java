package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.DepositScheduleStateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubDestinations;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001 B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/Details$Args;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "id", "", "onResume", "", "showCancelDialog", "dismissCancelDialog", "dismissCancelConfirmationDialog", "cancel", "showPauseDialog", "dismissPauseDialog", "pause", "dismissResumeConfirmationDialog", "resume", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DetailsDuxo extends BaseDuxo3<DetailsDataState, DetailsViewState, DetailsEvent> implements HasArgs<RecurringDepositHubDestinations.Args> {
    private final AutomaticDepositStore automaticDepositStore;
    private final String id;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public RecurringDepositHubDestinations.Args getArgs(SavedStateHandle savedStateHandle) {
        return (RecurringDepositHubDestinations.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsDuxo(AutomaticDepositStore automaticDepositStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, DetailsStateProvider stateProvider) {
        super(new DetailsDataState(null, false, false, false, false, false, false, false, 255, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.automaticDepositStore = automaticDepositStore;
        this.savedStateHandle = savedStateHandle;
        this.id = ((RecurringDepositHubDestinations.Args) INSTANCE.getArgs((HasArgs) this)).getId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.automaticDepositStore.getAutomaticDeposit(this.id), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailsDuxo.onResume$lambda$0(this.f$0, (UiAutomaticDeposit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(DetailsDuxo detailsDuxo, UiAutomaticDeposit uiAutomaticDeposit) {
        Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "uiAutomaticDeposit");
        detailsDuxo.applyMutation(new DetailsDuxo2(uiAutomaticDeposit, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$showCancelDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$showCancelDialog$1 */
    static final class C304861 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304861(Continuation<? super C304861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304861 c304861 = new C304861(continuation);
            c304861.L$0 = obj;
            return c304861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304861) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, true, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }
    }

    public final void showCancelDialog() {
        applyMutation(new C304861(null));
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissCancelDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissCancelDialog$1 */
    static final class C304791 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304791(Continuation<? super C304791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304791 c304791 = new C304791(continuation);
            c304791.L$0 = obj;
            return c304791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304791) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }
    }

    public final void dismissCancelDialog() {
        applyMutation(new C304791(null));
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissCancelConfirmationDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissCancelConfirmationDialog$1 */
    static final class C304781 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304781(Continuation<? super C304781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304781 c304781 = new C304781(continuation);
            c304781.L$0 = obj;
            return c304781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304781) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
        }
    }

    public final void dismissCancelConfirmationDialog() {
        applyMutation(new C304781(null));
        submit(DetailsEvent.CancelConfirmationDismissed.INSTANCE);
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$1 */
    static final class C304761 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304761(Continuation<? super C304761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304761 c304761 = new C304761(continuation);
            c304761.L$0 = obj;
            return c304761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304761) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, true, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
        }
    }

    public final void cancel() {
        applyMutation(new C304761(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C304772(null), 3, null);
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2", m3645f = "DetailsDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2 */
    static final class C304772 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304772(Continuation<? super C304772> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DetailsDuxo.this.new C304772(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304772) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DetailsDuxo detailsDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutomaticDepositStore automaticDepositStore = DetailsDuxo.this.automaticDepositStore;
                    String str = DetailsDuxo.this.id;
                    this.label = 1;
                    if (automaticDepositStore.deleteAutomaticDeposit(str, true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DetailsDuxo.this.applyMutation(new AnonymousClass1(null));
                detailsDuxo = DetailsDuxo.this;
                anonymousClass2 = new AnonymousClass2(null);
            } catch (Throwable th) {
                try {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    detailsDuxo = DetailsDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Throwable th2) {
                    DetailsDuxo.this.applyMutation(new AnonymousClass2(null));
                    throw th2;
                }
            }
            detailsDuxo.applyMutation(anonymousClass2);
            return Unit.INSTANCE;
        }

        /* compiled from: DetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
                return ((AnonymousClass1) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, true, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
        }

        /* compiled from: DetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2$2", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$cancel$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
                return ((AnonymousClass2) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
            }
        }
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$showPauseDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$showPauseDialog$1 */
    static final class C304871 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304871(Continuation<? super C304871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304871 c304871 = new C304871(continuation);
            c304871.L$0 = obj;
            return c304871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304871) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, true, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
        }
    }

    public final void showPauseDialog() {
        applyMutation(new C304871(null));
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissPauseDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissPauseDialog$1 */
    static final class C304801 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304801(Continuation<? super C304801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304801 c304801 = new C304801(continuation);
            c304801.L$0 = obj;
            return c304801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304801) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
        }
    }

    public final void dismissPauseDialog() {
        applyMutation(new C304801(null));
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$1 */
    static final class C304821 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304821(Continuation<? super C304821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304821 c304821 = new C304821(continuation);
            c304821.L$0 = obj;
            return c304821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304821) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    public final void pause(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        applyMutation(new C304821(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C304832(id, null), 3, null);
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$2", m3645f = "DetailsDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$2 */
    static final class C304832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C304832(String str, Continuation<? super C304832> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DetailsDuxo.this.new C304832(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DetailsDuxo detailsDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutomaticDepositStore automaticDepositStore = DetailsDuxo.this.automaticDepositStore;
                    String str = this.$id;
                    DepositScheduleStateDto depositScheduleStateDto = DepositScheduleStateDto.DEPOSIT_SCHEDULE_STATE_PAUSED;
                    this.label = 1;
                    if (automaticDepositStore.updateAutomaticDeposit(str, depositScheduleStateDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                detailsDuxo = DetailsDuxo.this;
                anonymousClass1 = new AnonymousClass1(null);
            } catch (Throwable th) {
                try {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    detailsDuxo = DetailsDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable th2) {
                    DetailsDuxo.this.applyMutation(new AnonymousClass1(null));
                    throw th2;
                }
            }
            detailsDuxo.applyMutation(anonymousClass1);
            return Unit.INSTANCE;
        }

        /* compiled from: DetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$2$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$pause$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
                return ((AnonymousClass1) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissResumeConfirmationDialog$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$dismissResumeConfirmationDialog$1 */
    static final class C304811 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304811(Continuation<? super C304811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304811 c304811 = new C304811(continuation);
            c304811.L$0 = obj;
            return c304811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304811) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, 239, null);
        }
    }

    public final void dismissResumeConfirmationDialog() {
        applyMutation(new C304811(null));
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$1 */
    static final class C304841 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C304841(Continuation<? super C304841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C304841 c304841 = new C304841(continuation);
            c304841.L$0 = obj;
            return c304841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
            return ((C304841) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, true, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public final void resume() {
        applyMutation(new C304841(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C304852(null), 3, null);
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2", m3645f = "DetailsDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2 */
    static final class C304852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304852(Continuation<? super C304852> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DetailsDuxo.this.new C304852(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DetailsDuxo detailsDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutomaticDepositStore automaticDepositStore = DetailsDuxo.this.automaticDepositStore;
                    String str = DetailsDuxo.this.id;
                    DepositScheduleStateDto depositScheduleStateDto = DepositScheduleStateDto.DEPOSIT_SCHEDULE_STATE_ACTIVE;
                    this.label = 1;
                    if (automaticDepositStore.updateAutomaticDeposit(str, depositScheduleStateDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DetailsDuxo.this.applyMutation(new AnonymousClass1(null));
                detailsDuxo = DetailsDuxo.this;
                anonymousClass2 = new AnonymousClass2(null);
            } catch (Throwable th) {
                try {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    detailsDuxo = DetailsDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Throwable th2) {
                    DetailsDuxo.this.applyMutation(new AnonymousClass2(null));
                    throw th2;
                }
            }
            detailsDuxo.applyMutation(anonymousClass2);
            return Unit.INSTANCE;
        }

        /* compiled from: DetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2$1", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
                return ((AnonymousClass1) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, true, false, false, false, 239, null);
            }
        }

        /* compiled from: DetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2$2", m3645f = "DetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsDuxo$resume$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DetailsDataState, Continuation<? super DetailsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DetailsDataState detailsDataState, Continuation<? super DetailsDataState> continuation) {
                return ((AnonymousClass2) create(detailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DetailsDataState.copy$default((DetailsDataState) this.L$0, null, false, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
        }
    }

    /* compiled from: DetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/Details$Args;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<DetailsDuxo, RecurringDepositHubDestinations.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public RecurringDepositHubDestinations.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringDepositHubDestinations.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public RecurringDepositHubDestinations.Args getArgs(DetailsDuxo detailsDuxo) {
            return (RecurringDepositHubDestinations.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, detailsDuxo);
        }
    }
}
