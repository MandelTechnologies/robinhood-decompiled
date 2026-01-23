package com.robinhood.android.transfers.p271ui.deeplink;

import com.robinhood.android.transfers.p271ui.deeplink.TransferFundsDeepLinkViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferFundsDeepLinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$exceptionHandler$2$1$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$exceptionHandler$2$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TransferFundsDeepLinkDuxo2 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {

    /* renamed from: $e */
    final /* synthetic */ Throwable f5028$e;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFundsDeepLinkDuxo2(Throwable th, Continuation<? super TransferFundsDeepLinkDuxo2> continuation) {
        super(2, continuation);
        this.f5028$e = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferFundsDeepLinkDuxo2(this.f5028$e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
        return ((TransferFundsDeepLinkDuxo2) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new TransferFundsDeepLinkViewState.Error(this.f5028$e);
    }
}
