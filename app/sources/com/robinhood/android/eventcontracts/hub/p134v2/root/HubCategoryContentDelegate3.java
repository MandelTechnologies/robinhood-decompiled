package com.robinhood.android.eventcontracts.hub.p134v2.root;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HubCategoryContentDelegate.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentDelegateKt$BindNodeId$1$1", m3645f = "HubCategoryContentDelegate.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubCategoryContentDelegateKt$BindNodeId$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class HubCategoryContentDelegate3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $nodeId;
    final /* synthetic */ HubCategoryContentDelegate $this_BindNodeId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HubCategoryContentDelegate3(HubCategoryContentDelegate hubCategoryContentDelegate, UUID uuid, Continuation<? super HubCategoryContentDelegate3> continuation) {
        super(2, continuation);
        this.$this_BindNodeId = hubCategoryContentDelegate;
        this.$nodeId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HubCategoryContentDelegate3(this.$this_BindNodeId, this.$nodeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HubCategoryContentDelegate3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$this_BindNodeId.updateNodeId(this.$nodeId);
        return Unit.INSTANCE;
    }
}
