package com.robinhood.android.transfers.limits.p267ui;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.limits.p267ui.LimitsHubDetailsEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsResponse;
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

/* compiled from: LimitsHubDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;", "Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsEvent;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-transfer-limits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LimitsHubDetailsDuxo extends BaseDuxo5<LimitsHubDetailsViewState, LimitsHubDetailsEvent> {
    public static final int $stable = 8;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsHubDetailsDuxo(TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle) {
        super(new LimitsHubDetailsViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C303931(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303942(null), 3, null);
    }

    /* compiled from: LimitsHubDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$1", m3645f = "LimitsHubDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$1 */
    static final class C303931 extends ContinuationImpl7 implements Function2<LimitsHubDetailsViewState, Continuation<? super LimitsHubDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303931(Continuation<? super C303931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303931 c303931 = new C303931(continuation);
            c303931.L$0 = obj;
            return c303931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LimitsHubDetailsViewState limitsHubDetailsViewState, Continuation<? super LimitsHubDetailsViewState> continuation) {
            return ((C303931) create(limitsHubDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LimitsHubDetailsViewState limitsHubDetailsViewState = (LimitsHubDetailsViewState) this.L$0;
            return limitsHubDetailsViewState.getResponse() == null ? LimitsHubDetailsViewState.copy$default(limitsHubDetailsViewState, true, null, 2, null) : limitsHubDetailsViewState;
        }
    }

    /* compiled from: LimitsHubDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$2", m3645f = "LimitsHubDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$2 */
    static final class C303942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303942(Continuation<? super C303942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LimitsHubDetailsDuxo.this.new C303942(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LimitsHubDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$2$1", m3645f = "LimitsHubDetailsDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<LimitsHubDetailsViewState, Continuation<? super LimitsHubDetailsViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LimitsHubDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LimitsHubDetailsDuxo limitsHubDetailsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = limitsHubDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LimitsHubDetailsViewState limitsHubDetailsViewState, Continuation<? super LimitsHubDetailsViewState> continuation) {
                return ((AnonymousClass1) create(limitsHubDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                LimitsHubDetailsViewState limitsHubDetailsViewState;
                Throwable th;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LimitsHubDetailsViewState limitsHubDetailsViewState2 = (LimitsHubDetailsViewState) this.L$0;
                    try {
                        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                        this.L$0 = limitsHubDetailsViewState2;
                        this.label = 1;
                        Object limitsHubDetails = transfersBonfireApi.getLimitsHubDetails(this);
                        if (limitsHubDetails == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        limitsHubDetailsViewState = limitsHubDetailsViewState2;
                        obj = limitsHubDetails;
                    } catch (Throwable th2) {
                        limitsHubDetailsViewState = limitsHubDetailsViewState2;
                        th = th2;
                        if (limitsHubDetailsViewState.getResponse() == null) {
                        }
                        return limitsHubDetailsViewState;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    limitsHubDetailsViewState = (LimitsHubDetailsViewState) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (limitsHubDetailsViewState.getResponse() == null) {
                            this.this$0.submit(new LimitsHubDetailsEvent.Error(th));
                        }
                        return limitsHubDetailsViewState;
                    }
                }
                return limitsHubDetailsViewState.copy(false, (ApiLimitsHubDetailsResponse) obj);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LimitsHubDetailsDuxo limitsHubDetailsDuxo = LimitsHubDetailsDuxo.this;
            limitsHubDetailsDuxo.applyMutation(new AnonymousClass1(limitsHubDetailsDuxo, null));
            return Unit.INSTANCE;
        }
    }
}
