package com.robinhood.android.wires.p278ui.thirdparty;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.formentry.FormEntryDuxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WiresThirdPartyFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$2$1$1", m3645f = "WiresThirdPartyFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$2$1$1, reason: use source file name */
/* loaded from: classes16.dex */
final class WiresThirdPartyFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ WiresThirdPartyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiresThirdPartyFragment2(WiresThirdPartyFragment wiresThirdPartyFragment, Continuation<? super WiresThirdPartyFragment2> continuation) {
        super(2, continuation);
        this.this$0 = wiresThirdPartyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WiresThirdPartyFragment2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WiresThirdPartyFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        WiresThirdPartyDuxo wiresThirdPartyDuxo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WiresThirdPartyDuxo duxo = this.this$0.getDuxo();
            FormEntryDuxo formEntryDuxo = this.this$0.getFormEntryDuxo();
            this.L$0 = duxo;
            this.label = 1;
            Object objCanContinue = formEntryDuxo.canContinue(this);
            if (objCanContinue == coroutine_suspended) {
                return coroutine_suspended;
            }
            wiresThirdPartyDuxo = duxo;
            obj = objCanContinue;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wiresThirdPartyDuxo = (WiresThirdPartyDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        wiresThirdPartyDuxo.stateChanged((Boolean) obj);
        return Unit.INSTANCE;
    }
}
