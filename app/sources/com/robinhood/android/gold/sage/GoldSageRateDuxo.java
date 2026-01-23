package com.robinhood.android.gold.sage;

import com.robinhood.android.gold.sage.GoldSageRateEvent;
import com.robinhood.android.gold.sage.GoldSageRateViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import gold.proto.p464v1.GetSageRateRequestDto;
import gold.proto.p464v1.GetSageRateResponse;
import gold.proto.p464v1.GetSageRateResponseDto;
import gold.proto.p464v1.GoldService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSageRateDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState;", "Lcom/robinhood/android/gold/sage/GoldSageRateEvent;", "goldService", "Lgold/proto/v1/GoldService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lgold/proto/v1/GoldService;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageRateDuxo extends BaseDuxo5<GoldSageRateViewState, GoldSageRateEvent> {
    public static final int $stable = 8;
    private final GoldService goldService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageRateDuxo(GoldService goldService, DuxoBundle duxoBundle) {
        super(GoldSageRateViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldService, "goldService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldService = goldService;
    }

    /* compiled from: GoldSageRateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageRateDuxo$onCreate$1", m3645f = "GoldSageRateDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.sage.GoldSageRateDuxo$onCreate$1 */
    static final class C178841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C178841(Continuation<? super C178841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178841 c178841 = GoldSageRateDuxo.this.new C178841(continuation);
            c178841.L$0 = obj;
            return c178841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldSageRateDuxo goldSageRateDuxo = GoldSageRateDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    GoldService goldService = goldSageRateDuxo.goldService;
                    GetSageRateRequestDto getSageRateRequestDto = new GetSageRateRequestDto();
                    this.label = 1;
                    obj = goldService.GetSageRate(getSageRateRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(((GetSageRateResponseDto) obj).toProto());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            GoldSageRateDuxo goldSageRateDuxo2 = GoldSageRateDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                goldSageRateDuxo2.applyMutation(new GoldSageRateDuxo2((GetSageRateResponse) objM28550constructorimpl, null));
            } else {
                goldSageRateDuxo2.submit(new GoldSageRateEvent.Error(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C178841(null));
    }
}
