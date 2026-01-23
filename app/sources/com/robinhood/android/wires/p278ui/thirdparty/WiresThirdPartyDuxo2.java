package com.robinhood.android.wires.p278ui.thirdparty;

import com.plaid.internal.EnumC7081g;
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
@DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$onStart$1$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes16.dex */
final class WiresThirdPartyDuxo2 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WiresThirdPartyDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiresThirdPartyDuxo2(WiresThirdPartyDuxo wiresThirdPartyDuxo, Continuation<? super WiresThirdPartyDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = wiresThirdPartyDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WiresThirdPartyDuxo2 wiresThirdPartyDuxo2 = new WiresThirdPartyDuxo2(this.this$0, continuation);
        wiresThirdPartyDuxo2.L$0 = obj;
        return wiresThirdPartyDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
        return ((WiresThirdPartyDuxo2) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WiresThirdPartyDataState wiresThirdPartyDataState = (WiresThirdPartyDataState) this.L$0;
            ResultKt.throwOnFailure(obj);
            return wiresThirdPartyDataState;
        }
        ResultKt.throwOnFailure(obj);
        WiresThirdPartyDataState wiresThirdPartyDataState2 = (WiresThirdPartyDataState) this.L$0;
        WiresThirdPartyDuxo wiresThirdPartyDuxo = this.this$0;
        this.L$0 = wiresThirdPartyDataState2;
        this.label = 1;
        return wiresThirdPartyDuxo.moveToDocumentUploadMode(this) == coroutine_suspended ? coroutine_suspended : wiresThirdPartyDataState2;
    }
}
