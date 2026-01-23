package com.robinhood.android.acatsin;

import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {165}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes24.dex */
final class AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AvailableAccount $selectedAccount;
    int label;
    final /* synthetic */ AcatsInDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1(AcatsInDuxo acatsInDuxo, AvailableAccount availableAccount, Continuation<? super AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1> continuation) {
        super(2, continuation);
        this.this$0 = acatsInDuxo;
        this.$selectedAccount = availableAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1(this.this$0, this.$selectedAccount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccountByRhs(this.$selectedAccount.getRhsAccountNumber())), Integer.MAX_VALUE, null, 2, null), new C7690x6e2bd693(null, this.this$0));
            this.label = 1;
            obj = FlowKt.firstOrNull(flowTransformLatest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        return boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }
}
