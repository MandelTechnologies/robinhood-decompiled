package com.robinhood.android.mcw.homesection;

import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
import com.robinhood.android.mcw.homesection.DashboardMcwSectionState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DashboardMcwSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$Data;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;", "mcwStore", "Lcom/robinhood/android/lib/store/mcw/McwStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/McwStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "initialize", "Lkotlinx/coroutines/Job;", "accountNumber", "", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DashboardMcwSectionDuxo extends BaseDuxo<DashboardMcwSectionState.Data, DashboardMcwSectionState.View> {
    public static final int $stable = BaseDuxo.$stable | McwStore.$stable;
    private final McwStore mcwStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardMcwSectionDuxo(McwStore mcwStore, DuxoBundle duxoBundle) {
        super(new DashboardMcwSectionState.Data(null, 1, null), DashboardMcwSectionState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(mcwStore, "mcwStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mcwStore = mcwStore;
    }

    /* compiled from: DashboardMcwSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1", m3645f = "DashboardMcwSectionDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1 */
    static final class C217401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C217401(String str, Continuation<? super C217401> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardMcwSectionDuxo.this.new C217401(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C217401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DashboardMcwSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1$1", m3645f = "DashboardMcwSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<McwHomeSectionData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardMcwSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardMcwSectionDuxo dashboardMcwSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardMcwSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(McwHomeSectionData mcwHomeSectionData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mcwHomeSectionData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardMcwSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$Data;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1$1$1", m3645f = "DashboardMcwSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.homesection.DashboardMcwSectionDuxo$initialize$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502891 extends ContinuationImpl7 implements Function2<DashboardMcwSectionState.Data, Continuation<? super DashboardMcwSectionState.Data>, Object> {
                final /* synthetic */ McwHomeSectionData $data;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502891(McwHomeSectionData mcwHomeSectionData, Continuation<? super C502891> continuation) {
                    super(2, continuation);
                    this.$data = mcwHomeSectionData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502891 c502891 = new C502891(this.$data, continuation);
                    c502891.L$0 = obj;
                    return c502891;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardMcwSectionState.Data data, Continuation<? super DashboardMcwSectionState.Data> continuation) {
                    return ((C502891) create(data, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((DashboardMcwSectionState.Data) this.L$0).copy(this.$data);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502891((McwHomeSectionData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<McwHomeSectionData> flowPollMcwHomeSection = DashboardMcwSectionDuxo.this.mcwStore.pollMcwHomeSection(this.$accountNumber);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DashboardMcwSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollMcwHomeSection, anonymousClass1, this) == coroutine_suspended) {
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
    }

    public final Job initialize(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C217401(accountNumber, null), 3, null);
    }
}
