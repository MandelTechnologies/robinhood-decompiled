package com.robinhood.android.gold.upgrade.unified;

import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldFlowService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldUnifiedBaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo$sendAction$1$1", m3645f = "GoldUnifiedBaseDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo$sendAction$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedBaseDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $action;
    int label;
    final /* synthetic */ GoldUnifiedBaseDuxo<VS> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldUnifiedBaseDuxo2(GoldUnifiedBaseDuxo<VS> goldUnifiedBaseDuxo, Action action, Continuation<? super GoldUnifiedBaseDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = goldUnifiedBaseDuxo;
        this.$action = action;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldUnifiedBaseDuxo2(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldUnifiedBaseDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GoldFlowService goldFlowService = this.this$0.getGoldFlowService();
            Action action = this.$action;
            this.label = 1;
            if (GoldUnifiedBaseDuxo3.sendAction(goldFlowService, action, this) == coroutine_suspended) {
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
