package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: HubNavBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onChildNodeSelected$1$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onChildNodeSelected$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class HubNavBarDuxo2 extends ContinuationImpl7 implements Function2<HubNavBarDataState, Continuation<? super HubNavBarDataState>, Object> {
    final /* synthetic */ EcHubNavNode $childNode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HubNavBarDuxo2(EcHubNavNode ecHubNavNode, Continuation<? super HubNavBarDuxo2> continuation) {
        super(2, continuation);
        this.$childNode = ecHubNavNode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HubNavBarDuxo2 hubNavBarDuxo2 = new HubNavBarDuxo2(this.$childNode, continuation);
        hubNavBarDuxo2.L$0 = obj;
        return hubNavBarDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HubNavBarDataState hubNavBarDataState, Continuation<? super HubNavBarDataState> continuation) {
        return ((HubNavBarDuxo2) create(hubNavBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return HubNavBarDataState.copy$default((HubNavBarDataState) this.L$0, null, null, this.$childNode.getId(), false, 11, null);
    }
}
