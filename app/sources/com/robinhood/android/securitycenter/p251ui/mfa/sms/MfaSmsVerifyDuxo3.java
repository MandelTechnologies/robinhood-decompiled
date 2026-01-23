package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MfaSmsVerifyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeToPhoneNumber$2$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeToPhoneNumber$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MfaSmsVerifyDuxo3 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
    final /* synthetic */ String $phoneNumber;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MfaSmsVerifyDuxo3(String str, Continuation<? super MfaSmsVerifyDuxo3> continuation) {
        super(2, continuation);
        this.$phoneNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MfaSmsVerifyDuxo3 mfaSmsVerifyDuxo3 = new MfaSmsVerifyDuxo3(this.$phoneNumber, continuation);
        mfaSmsVerifyDuxo3.L$0 = obj;
        return mfaSmsVerifyDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
        return ((MfaSmsVerifyDuxo3) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, false, this.$phoneNumber, null, 10, null);
    }
}
