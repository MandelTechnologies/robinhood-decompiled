package com.robinhood.android.account.p060ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.lib.store.instant.InstantDepositsCardStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes24.dex */
public final class C8188x650294dc extends ContinuationImpl7 implements Function3<FlowCollector<? super InstantDepositCard>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AccountOverviewDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8188x650294dc(Continuation continuation, AccountOverviewDuxo accountOverviewDuxo) {
        super(3, continuation);
        this.this$0 = accountOverviewDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super InstantDepositCard> flowCollector, String str, Continuation<? super Unit> continuation) {
        C8188x650294dc c8188x650294dc = new C8188x650294dc(continuation, this.this$0);
        c8188x650294dc.L$0 = flowCollector;
        c8188x650294dc.L$1 = str;
        return c8188x650294dc.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            InstantDepositsCardStore instantDepositsCardStore = this.this$0.instantDepositsCardStore;
            Intrinsics.checkNotNull(str);
            instantDepositsCardStore.refresh(str);
            Flow<InstantDepositCard> flowStreamInstantCard = this.this$0.instantDepositsCardStore.streamInstantCard(str);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamInstantCard, this) == coroutine_suspended) {
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
