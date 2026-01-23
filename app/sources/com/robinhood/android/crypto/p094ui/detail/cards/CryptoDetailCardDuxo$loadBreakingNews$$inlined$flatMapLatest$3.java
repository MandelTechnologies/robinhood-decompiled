package com.robinhood.android.crypto.p094ui.detail.cards;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDuxo;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.udf.HasArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3 extends ContinuationImpl7 implements Function3<FlowCollector<? super BreakingNews>, Tuples2<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoDetailCardDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3(Continuation continuation, CryptoDetailCardDuxo cryptoDetailCardDuxo) {
        super(3, continuation);
        this.this$0 = cryptoDetailCardDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super BreakingNews> flowCollector, Tuples2<? extends String, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
        CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3 cryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3 = new CryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3(continuation, this.this$0);
        cryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3.L$0 = flowCollector;
        cryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3.L$1 = tuples2;
        return cryptoDetailCardDuxo$loadBreakingNews$$inlined$flatMapLatest$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<BreakingNews> flowStreamBreakingNewsOrNull;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            String str = (String) tuples2.component1();
            if (((Boolean) tuples2.component2()).booleanValue()) {
                flowStreamBreakingNewsOrNull = FlowKt.flowOf((Object) null);
            } else {
                flowStreamBreakingNewsOrNull = this.this$0.breakingNewsStore.streamBreakingNewsOrNull(((CryptoDetailCardDuxo.Args) CryptoDetailCardDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId(), ApiAssetType.CRYPTO, str);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamBreakingNewsOrNull, this) == coroutine_suspended) {
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
