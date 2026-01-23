package com.robinhood.android.securitycenter.p251ui.mfa.app;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MfaAuthAppKeyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$3$1", m3645f = "MfaAuthAppKeyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyDuxo$fetchAuthAppToken$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MfaAuthAppKeyDuxo3 extends ContinuationImpl7 implements Function2<MfaAuthAppKeyViewState, Continuation<? super MfaAuthAppKeyViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    MfaAuthAppKeyDuxo3(Continuation<? super MfaAuthAppKeyDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MfaAuthAppKeyDuxo3 mfaAuthAppKeyDuxo3 = new MfaAuthAppKeyDuxo3(continuation);
        mfaAuthAppKeyDuxo3.L$0 = obj;
        return mfaAuthAppKeyDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaAuthAppKeyViewState mfaAuthAppKeyViewState, Continuation<? super MfaAuthAppKeyViewState> continuation) {
        return ((MfaAuthAppKeyDuxo3) create(mfaAuthAppKeyViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MfaAuthAppKeyViewState.copy$default((MfaAuthAppKeyViewState) this.L$0, false, null, 2, null);
    }
}
