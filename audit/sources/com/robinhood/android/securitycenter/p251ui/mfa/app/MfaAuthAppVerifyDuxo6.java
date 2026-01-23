package com.robinhood.android.securitycenter.p251ui.mfa.app;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MfaAuthAppVerifyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$3$1", m3645f = "MfaAuthAppVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyDuxo$handleLoggedOutVerification$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MfaAuthAppVerifyDuxo6 extends ContinuationImpl7 implements Function2<MfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    MfaAuthAppVerifyDuxo6(Continuation<? super MfaAuthAppVerifyDuxo6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MfaAuthAppVerifyDuxo6 mfaAuthAppVerifyDuxo6 = new MfaAuthAppVerifyDuxo6(continuation);
        mfaAuthAppVerifyDuxo6.L$0 = obj;
        return mfaAuthAppVerifyDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation<? super MfaAuthAppVerifyViewState> continuation) {
        return ((MfaAuthAppVerifyDuxo6) create(mfaAuthAppVerifyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((MfaAuthAppVerifyViewState) this.L$0).copy(false);
    }
}
