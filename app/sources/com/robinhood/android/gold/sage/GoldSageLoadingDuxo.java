package com.robinhood.android.gold.sage;

import com.robinhood.android.gold.sage.GoldSageLoadingEvent;
import com.robinhood.android.gold.sage.data.GoldSageFlow;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import gold.proto.p464v1.GetSageFlowRequestDto;
import gold.proto.p464v1.GetSageFlowResponse;
import gold.proto.p464v1.GetSageFlowResponseDto;
import gold.proto.p464v1.GoldSageSplash;
import gold.proto.p464v1.GoldSageStartApplication;
import gold.proto.p464v1.GoldSageTimeline;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSageLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/gold/sage/GoldSageLoadingEvent;", "goldService", "Lgold/proto/v1/GoldService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lgold/proto/v1/GoldService;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageLoadingDuxo extends BaseDuxo5<Unit, GoldSageLoadingEvent> {
    public static final int $stable = 8;
    private final GoldService goldService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageLoadingDuxo(GoldService goldService, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldService, "goldService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldService = goldService;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C178741(null), 3, null);
    }

    /* compiled from: GoldSageLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageLoadingDuxo$onCreate$1", m3645f = "GoldSageLoadingDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.sage.GoldSageLoadingDuxo$onCreate$1 */
    static final class C178741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C178741(Continuation<? super C178741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178741 c178741 = GoldSageLoadingDuxo.this.new C178741(continuation);
            c178741.L$0 = obj;
            return c178741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldSageLoadingDuxo goldSageLoadingDuxo = GoldSageLoadingDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    GoldService goldService = goldSageLoadingDuxo.goldService;
                    GetSageFlowRequestDto getSageFlowRequestDto = new GetSageFlowRequestDto(null, i2, 0 == true ? 1 : 0);
                    this.label = 1;
                    obj = goldService.GetSageFlow(getSageFlowRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(((GetSageFlowResponseDto) obj).toProto());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            GoldSageLoadingDuxo goldSageLoadingDuxo2 = GoldSageLoadingDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                GetSageFlowResponse getSageFlowResponse = (GetSageFlowResponse) objM28550constructorimpl;
                GoldSageSplash splash = getSageFlowResponse.getSplash();
                if (splash == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                GoldSageTimeline timeline = getSageFlowResponse.getTimeline();
                if (timeline == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                GoldSageStartApplication application = getSageFlowResponse.getApplication();
                if (application == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                goldSageLoadingDuxo2.submit(new GoldSageLoadingEvent.Success(new GoldSageFlow(splash, timeline, application)));
            } else {
                goldSageLoadingDuxo2.submit(new GoldSageLoadingEvent.Failure(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }
}
