package com.robinhood.shared.trade.crypto.context;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$switchOnMib$lambda$16$lambda$15$lambda$14$$inlined$flatMapLatest$1", m3645f = "CryptoOrderContextFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$switchOnMib$lambda$16$lambda$15$lambda$14$$inlined$flatMapLatest$1 */
/* loaded from: classes12.dex */
public final class C40107x97a02910<T> extends ContinuationImpl7 implements Function3<FlowCollector<? super T>, String, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $accountId$inlined;
    final /* synthetic */ CryptoAccountSwitcherLocation.WithCurrencyPair $location$inlined;
    final /* synthetic */ Function3 $mibFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40107x97a02910(Continuation continuation, Function3 function3, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, UUID uuid) {
        super(3, continuation);
        this.$mibFlow$inlined = function3;
        this.$location$inlined = withCurrencyPair;
        this.$accountId$inlined = uuid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super T> flowCollector, String str, Continuation<? super Unit> continuation) {
        C40107x97a02910 c40107x97a02910 = new C40107x97a02910(continuation, this.$mibFlow$inlined, this.$location$inlined, this.$accountId$inlined);
        c40107x97a02910.L$0 = flowCollector;
        c40107x97a02910.L$1 = str;
        return c40107x97a02910.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = (Flow) this.$mibFlow$inlined.invoke(this.$location$inlined, (String) this.L$1, this.$accountId$inlined);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
