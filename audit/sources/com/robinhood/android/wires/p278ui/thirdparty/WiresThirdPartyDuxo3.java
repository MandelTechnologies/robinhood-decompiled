package com.robinhood.android.wires.p278ui.thirdparty;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: WiresThirdPartyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$onStop$1$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$onStop$1$1, reason: use source file name */
/* loaded from: classes16.dex */
final class WiresThirdPartyDuxo3 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    WiresThirdPartyDuxo3(Continuation<? super WiresThirdPartyDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WiresThirdPartyDuxo3 wiresThirdPartyDuxo3 = new WiresThirdPartyDuxo3(continuation);
        wiresThirdPartyDuxo3.L$0 = obj;
        return wiresThirdPartyDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
        return ((WiresThirdPartyDuxo3) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, true, false, false, 111, null);
    }
}
