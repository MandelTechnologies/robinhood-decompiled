package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ShortingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.ShortingInfoStore$streamShortingInfoResult$1$1", m3645f = "ShortingInfoStore.kt", m3646l = {50, 47, 53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.equities.store.subzero.ShortingInfoStore$streamShortingInfoResult$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ShortingInfoStore4 extends ContinuationImpl7 implements Function2<FlowCollector<? super Result<? extends ShortingInfo>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShortingInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortingInfoStore4(ShortingInfoStore shortingInfoStore, UUID uuid, Continuation<? super ShortingInfoStore4> continuation) {
        super(2, continuation);
        this.this$0 = shortingInfoStore;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortingInfoStore4 shortingInfoStore4 = new ShortingInfoStore4(this.this$0, this.$instrumentId, continuation);
        shortingInfoStore4.L$0 = obj;
        return shortingInfoStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends ShortingInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<ShortingInfo>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<ShortingInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ShortingInfoStore4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|8|18|41|19|20|47|21|(5:24|43|25|34|(2:37|38))|40) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r13 = r0;
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r5, r12) != r1) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a3 -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Throwable th;
        ShortingInfoStore4 shortingInfoStore4;
        FlowCollector flowCollector2;
        Object objM28550constructorimpl;
        FlowCollector flowCollector3;
        Result resultM28549boximpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ShortingInfoStore shortingInfoStore = this.this$0;
            UUID uuid = this.$instrumentId;
            Result.Companion companion = Result.INSTANCE;
            Endpoint endpoint = shortingInfoStore.getShortingInfo;
            this.L$0 = flowCollector;
            this.L$1 = flowCollector;
            this.label = 1;
            shortingInfoStore4 = this;
            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, shortingInfoStore4, 2, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (FlowCollector) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                shortingInfoStore4 = this;
            } catch (Throwable th2) {
                th = th2;
                shortingInfoStore4 = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
                shortingInfoStore4.L$0 = flowCollector2;
                shortingInfoStore4.L$1 = null;
                shortingInfoStore4.label = 2;
                if (flowCollector.emit(resultM28549boximpl, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ShortingInfo) obj);
            resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
            shortingInfoStore4.L$0 = flowCollector2;
            shortingInfoStore4.L$1 = null;
            shortingInfoStore4.label = 2;
            if (flowCollector.emit(resultM28549boximpl, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
            ShortingInfoStore shortingInfoStore2 = this.this$0;
            UUID uuid2 = this.$instrumentId;
            Result.Companion companion3 = Result.INSTANCE;
            Endpoint endpoint2 = shortingInfoStore2.getShortingInfo;
            this.L$0 = flowCollector;
            this.L$1 = flowCollector;
            this.label = 1;
            shortingInfoStore4 = this;
            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint2, uuid2, null, shortingInfoStore4, 2, null);
            if (obj != coroutine_suspended) {
                flowCollector2 = flowCollector;
                try {
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
                    shortingInfoStore4.L$0 = flowCollector2;
                    shortingInfoStore4.L$1 = null;
                    shortingInfoStore4.label = 2;
                    if (flowCollector.emit(resultM28549boximpl, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ShortingInfo) obj);
                resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
                shortingInfoStore4.L$0 = flowCollector2;
                shortingInfoStore4.L$1 = null;
                shortingInfoStore4.label = 2;
                if (flowCollector.emit(resultM28549boximpl, this) != coroutine_suspended) {
                    flowCollector3 = flowCollector2;
                    Duration.Companion companion4 = Duration.INSTANCE;
                    long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                    shortingInfoStore4.L$0 = flowCollector3;
                    shortingInfoStore4.label = 3;
                }
            }
            return coroutine_suspended;
        }
        flowCollector3 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        shortingInfoStore4 = this;
        Duration.Companion companion42 = Duration.INSTANCE;
        long duration2 = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
        shortingInfoStore4.L$0 = flowCollector3;
        shortingInfoStore4.label = 3;
    }
}
