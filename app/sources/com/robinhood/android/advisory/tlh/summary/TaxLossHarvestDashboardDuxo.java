package com.robinhood.android.advisory.tlh.summary;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestUpdateEnrollmentResponse;
import com.robinhood.store.advisory.TaxLossHarvestStore;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TaxLossHarvestDashboardDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "taxLossHarvestStore", "Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/TaxLossHarvestStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "activeYear", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onStart", "", "onYearSelected", "year", "updateEnrollment", "isEnrolled", "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TaxLossHarvestDashboardDuxo extends BaseDuxo<TaxLossHarvestDashboardDataState, TaxLossHarvestDashboardViewState> {
    public static final int $stable = 8;
    private final StateFlow2<String> activeYear;
    private final TaxLossHarvestStore taxLossHarvestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaxLossHarvestDashboardDuxo(TaxLossHarvestStore taxLossHarvestStore, DuxoBundle duxoBundle) {
        super(new TaxLossHarvestDashboardDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), TaxLossHarvestDashboardDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(taxLossHarvestStore, "taxLossHarvestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLossHarvestStore = taxLossHarvestStore;
        this.activeYear = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: TaxLossHarvestDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1 */
    static final class C94681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94681(Continuation<? super C94681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94681 c94681 = TaxLossHarvestDashboardDuxo.this.new C94681(continuation);
            c94681.L$0 = obj;
            return c94681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TaxLossHarvestDashboardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TaxLossHarvestDashboardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taxLossHarvestDashboardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.activeYear, new C9467xddea2ca4(null, this.this$0.taxLossHarvestStore));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: TaxLossHarvestDashboardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", AnalyticsStrings.TAB_NAV_TAB_BAR_DASHBOARD, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1$2", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxLossHarvestDashboard, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TaxLossHarvestDashboardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = taxLossHarvestDashboardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestDashboard taxLossHarvestDashboard, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(taxLossHarvestDashboard, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TaxLossHarvestDashboardDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1$2$1", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C496231 extends ContinuationImpl7 implements Function2<TaxLossHarvestDashboardDataState, Continuation<? super TaxLossHarvestDashboardDataState>, Object> {
                    final /* synthetic */ TaxLossHarvestDashboard $dashboard;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496231(TaxLossHarvestDashboard taxLossHarvestDashboard, Continuation<? super C496231> continuation) {
                        super(2, continuation);
                        this.$dashboard = taxLossHarvestDashboard;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496231 c496231 = new C496231(this.$dashboard, continuation);
                        c496231.L$0 = obj;
                        return c496231;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TaxLossHarvestDashboardDataState taxLossHarvestDashboardDataState, Continuation<? super TaxLossHarvestDashboardDataState> continuation) {
                        return ((C496231) create(taxLossHarvestDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TaxLossHarvestDashboardDataState.copy$default((TaxLossHarvestDashboardDataState) this.L$0, this.$dashboard, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496231((TaxLossHarvestDashboard) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(TaxLossHarvestDashboardDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94681(null));
    }

    public final void onYearSelected(String year) {
        Intrinsics.checkNotNullParameter(year, "year");
        StateFlow2<String> stateFlow2 = this.activeYear;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), year)) {
        }
    }

    /* compiled from: TaxLossHarvestDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$updateEnrollment$1", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$updateEnrollment$1 */
    static final class C94691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isEnrolled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C94691(boolean z, Continuation<? super C94691> continuation) {
            super(2, continuation);
            this.$isEnrolled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TaxLossHarvestDashboardDuxo.this.new C94691(this.$isEnrolled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TaxLossHarvestStore taxLossHarvestStore = TaxLossHarvestDashboardDuxo.this.taxLossHarvestStore;
                    boolean z = this.$isEnrolled;
                    this.label = 1;
                    obj = taxLossHarvestStore.updateEnrollment(z, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                TaxLossHarvestUpdateEnrollmentResponse taxLossHarvestUpdateEnrollmentResponse = (TaxLossHarvestUpdateEnrollmentResponse) obj;
                if (taxLossHarvestUpdateEnrollmentResponse.getToastText() != null) {
                    TaxLossHarvestDashboardDuxo.this.applyMutation(new AnonymousClass1(taxLossHarvestUpdateEnrollmentResponse, null));
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TaxLossHarvestDashboardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$updateEnrollment$1$1", m3645f = "TaxLossHarvestDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDuxo$updateEnrollment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TaxLossHarvestDashboardDataState, Continuation<? super TaxLossHarvestDashboardDataState>, Object> {
            final /* synthetic */ TaxLossHarvestUpdateEnrollmentResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxLossHarvestUpdateEnrollmentResponse taxLossHarvestUpdateEnrollmentResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = taxLossHarvestUpdateEnrollmentResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaxLossHarvestDashboardDataState taxLossHarvestDashboardDataState, Continuation<? super TaxLossHarvestDashboardDataState> continuation) {
                return ((AnonymousClass1) create(taxLossHarvestDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TaxLossHarvestDashboardDataState.copy$default((TaxLossHarvestDashboardDataState) this.L$0, null, this.$response.getToastText(), 1, null);
            }
        }
    }

    public final void updateEnrollment(boolean isEnrolled) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C94691(isEnrolled, null), 3, null);
    }
}
