package com.robinhood.android.search.highlights.p249ui.market;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.search.highlights.p249ui.market.SearchHighlightMarketCardDuxo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes5.dex */
public final class C27965x991edb4d extends ContinuationImpl7 implements Function3<FlowCollector<? super SearchHighlightMarketCardDuxo.FuturesChartData>, UUID, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27965x991edb4d(Continuation continuation, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo) {
        super(3, continuation);
        this.this$0 = searchHighlightMarketCardDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super SearchHighlightMarketCardDuxo.FuturesChartData> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        C27965x991edb4d c27965x991edb4d = new C27965x991edb4d(continuation, this.this$0);
        c27965x991edb4d.L$0 = flowCollector;
        c27965x991edb4d.L$1 = uuid;
        return c27965x991edb4d.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            UUID uuid = (UUID) this.L$1;
            SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = this.this$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = searchHighlightMarketCardDuxo.queryFuturesContract(uuid, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
