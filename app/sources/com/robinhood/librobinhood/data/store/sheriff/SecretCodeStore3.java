package com.robinhood.librobinhood.data.store.sheriff;

import com.robinhood.models.api.sheriff.secretcode.ApiSecretCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SecretCodeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "secretCode", "Lcom/robinhood/models/api/sheriff/secretcode/ApiSecretCode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.sheriff.SecretCodeStore$refreshEndpoint$2", m3645f = "SecretCodeStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.sheriff.SecretCodeStore$refreshEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SecretCodeStore3 extends ContinuationImpl7 implements Function2<ApiSecretCode, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecretCodeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecretCodeStore3(SecretCodeStore secretCodeStore, Continuation<? super SecretCodeStore3> continuation) {
        super(2, continuation);
        this.this$0 = secretCodeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecretCodeStore3 secretCodeStore3 = new SecretCodeStore3(this.this$0, continuation);
        secretCodeStore3.L$0 = obj;
        return secretCodeStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSecretCode apiSecretCode, Continuation<? super Unit> continuation) {
        return ((SecretCodeStore3) create(apiSecretCode, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.secretCodePref.set(((ApiSecretCode) this.L$0).getSecret_code());
            this.this$0.secretCodeLastUpdatedPref.set(System.currentTimeMillis());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
