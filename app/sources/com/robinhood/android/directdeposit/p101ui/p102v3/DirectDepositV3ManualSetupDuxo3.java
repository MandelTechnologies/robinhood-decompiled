package com.robinhood.android.directdeposit.p101ui.p102v3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DirectDepositV3ManualSetupDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$3$1", m3645f = "DirectDepositV3ManualSetupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$3$1, reason: use source file name */
/* loaded from: classes27.dex */
final class DirectDepositV3ManualSetupDuxo3 extends ContinuationImpl7 implements Function2<DirectDepositV3ManualSetupViewState, Continuation<? super DirectDepositV3ManualSetupViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    DirectDepositV3ManualSetupDuxo3(Continuation<? super DirectDepositV3ManualSetupDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectDepositV3ManualSetupDuxo3 directDepositV3ManualSetupDuxo3 = new DirectDepositV3ManualSetupDuxo3(continuation);
        directDepositV3ManualSetupDuxo3.L$0 = obj;
        return directDepositV3ManualSetupDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState, Continuation<? super DirectDepositV3ManualSetupViewState> continuation) {
        return ((DirectDepositV3ManualSetupDuxo3) create(directDepositV3ManualSetupViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DirectDepositV3ManualSetupViewState.copy$default((DirectDepositV3ManualSetupViewState) this.L$0, null, DirectDepositV3ManualSetupViewState2.EMAIL_SENT, 1, null);
    }
}
