package com.robinhood.android.cortex.store.portfolio;

import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PortfolioDigestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestEndpoint$2", m3645f = "PortfolioDigestStore.kt", m3646l = {73, 74, 78, 79}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class PortfolioDigestStore4 extends ContinuationImpl7 implements Function2<PortfolioDigestStore2, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PortfolioDigestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioDigestStore4(PortfolioDigestStore portfolioDigestStore, Continuation<? super PortfolioDigestStore4> continuation) {
        super(2, continuation);
        this.this$0 = portfolioDigestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PortfolioDigestStore4 portfolioDigestStore4 = new PortfolioDigestStore4(this.this$0, continuation);
        portfolioDigestStore4.L$0 = obj;
        return portfolioDigestStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PortfolioDigestStore2 portfolioDigestStore2, Continuation<? super Unit> continuation) {
        return ((PortfolioDigestStore4) create(portfolioDigestStore2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        if (r10.emit(r1, r9) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        if (r10.emit(r1, r9) != r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PortfolioDigestStore2 portfolioDigestStore2;
        Map map;
        PortfolioDigestStore2 portfolioDigestStore22;
        Map map2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PortfolioDigestStore2 portfolioDigestStore23 = (PortfolioDigestStore2) this.L$0;
            Map map3 = (Map) this.this$0.digestCacheFlow.getValue();
            Map map4 = (Map) this.this$0.sourcesCacheFlow.getValue();
            if (portfolioDigestStore23 instanceof PortfolioDigestStore2.NotFound) {
                StateFlow2 stateFlow2 = this.this$0.digestCacheFlow;
                Map mapPlus = MapsKt.plus(map3, Tuples4.m3642to(((PortfolioDigestStore2.NotFound) portfolioDigestStore23).getKey(), null));
                this.L$0 = portfolioDigestStore23;
                this.L$1 = map4;
                this.label = 1;
                if (stateFlow2.emit(mapPlus, this) != coroutine_suspended) {
                    portfolioDigestStore22 = portfolioDigestStore23;
                    map2 = map4;
                    StateFlow2 stateFlow22 = this.this$0.sourcesCacheFlow;
                    Map mapPlus2 = MapsKt.plus(map2, Tuples4.m3642to(((PortfolioDigestStore2.NotFound) portfolioDigestStore22).getKey(), null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                }
            } else if (portfolioDigestStore23 instanceof PortfolioDigestStore2.Success) {
                StateFlow2 stateFlow23 = this.this$0.digestCacheFlow;
                PortfolioDigestStore2.Success success = (PortfolioDigestStore2.Success) portfolioDigestStore23;
                Map mapPlus3 = MapsKt.plus(map3, Tuples4.m3642to(success.getKey(), success.getDigest()));
                this.L$0 = portfolioDigestStore23;
                this.L$1 = map4;
                this.label = 3;
                if (stateFlow23.emit(mapPlus3, this) != coroutine_suspended) {
                    portfolioDigestStore2 = portfolioDigestStore23;
                    map = map4;
                    StateFlow2 stateFlow24 = this.this$0.sourcesCacheFlow;
                    PortfolioDigestStore2.Success success2 = (PortfolioDigestStore2.Success) portfolioDigestStore2;
                    Map mapPlus4 = MapsKt.plus(map, Tuples4.m3642to(success2.getKey(), success2.getSources()));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            map2 = (Map) this.L$1;
            portfolioDigestStore22 = (PortfolioDigestStore2) this.L$0;
            ResultKt.throwOnFailure(obj);
            StateFlow2 stateFlow222 = this.this$0.sourcesCacheFlow;
            Map mapPlus22 = MapsKt.plus(map2, Tuples4.m3642to(((PortfolioDigestStore2.NotFound) portfolioDigestStore22).getKey(), null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    map = (Map) this.L$1;
                    portfolioDigestStore2 = (PortfolioDigestStore2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    StateFlow2 stateFlow242 = this.this$0.sourcesCacheFlow;
                    PortfolioDigestStore2.Success success22 = (PortfolioDigestStore2.Success) portfolioDigestStore2;
                    Map mapPlus42 = MapsKt.plus(map, Tuples4.m3642to(success22.getKey(), success22.getSources()));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }
}
