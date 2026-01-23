package com.robinhood.android.taxcenter.timelineinfo;

import com.robinhood.android.models.taxcenter.p195db.TaxTimelineInfo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.TaxCenterStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TaxTimelineInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDataState;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState;", "taxCenterStore", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "stateProvider", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TaxCenterStore;Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TaxTimelineInfoDuxo extends BaseDuxo<TaxTimelineInfoDataState, TaxTimelineInfoViewState> {
    public static final int $stable = 8;
    private final TaxCenterStore taxCenterStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaxTimelineInfoDuxo(TaxCenterStore taxCenterStore, TaxTimelineInfoViewState2 stateProvider, DuxoBundle duxoBundle) {
        super(new TaxTimelineInfoDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(taxCenterStore, "taxCenterStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxCenterStore = taxCenterStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C292601(null));
    }

    /* compiled from: TaxTimelineInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1", m3645f = "TaxTimelineInfoDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1 */
    static final class C292601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C292601(Continuation<? super C292601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TaxTimelineInfoDuxo.this.new C292601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C292601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(TaxTimelineInfoDuxo.this.taxCenterStore.timelineInfoFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TaxTimelineInfoDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: TaxTimelineInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/models/taxcenter/db/TaxTimelineInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1$1", m3645f = "TaxTimelineInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TaxTimelineInfo, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TaxTimelineInfoDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxTimelineInfoDuxo taxTimelineInfoDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taxTimelineInfoDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaxTimelineInfo taxTimelineInfo, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(taxTimelineInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TaxTimelineInfoDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1$1$1", m3645f = "TaxTimelineInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505671 extends ContinuationImpl7 implements Function2<TaxTimelineInfoDataState, Continuation<? super TaxTimelineInfoDataState>, Object> {
                final /* synthetic */ TaxTimelineInfo $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505671(TaxTimelineInfo taxTimelineInfo, Continuation<? super C505671> continuation) {
                    super(2, continuation);
                    this.$response = taxTimelineInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505671 c505671 = new C505671(this.$response, continuation);
                    c505671.L$0 = obj;
                    return c505671;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxTimelineInfoDataState taxTimelineInfoDataState, Continuation<? super TaxTimelineInfoDataState> continuation) {
                    return ((C505671) create(taxTimelineInfoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((TaxTimelineInfoDataState) this.L$0).copy(this.$response.getContent(), this.$response.getCtaContent());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505671((TaxTimelineInfo) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
