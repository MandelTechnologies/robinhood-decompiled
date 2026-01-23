package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.models.api.identi.ApiTrustedContact;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TrustedContactDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$onCreate$1$1$1", m3645f = "TrustedContactDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class TrustedContactDetailDuxo3 extends ContinuationImpl7 implements Function2<TrustedContactDetailDataState, Continuation<? super TrustedContactDetailDataState>, Object> {
    final /* synthetic */ ApiTrustedContact $model;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedContactDetailDuxo3(ApiTrustedContact apiTrustedContact, Continuation<? super TrustedContactDetailDuxo3> continuation) {
        super(2, continuation);
        this.$model = apiTrustedContact;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrustedContactDetailDuxo3 trustedContactDetailDuxo3 = new TrustedContactDetailDuxo3(this.$model, continuation);
        trustedContactDetailDuxo3.L$0 = obj;
        return trustedContactDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TrustedContactDetailDataState trustedContactDetailDataState, Continuation<? super TrustedContactDetailDataState> continuation) {
        return ((TrustedContactDetailDuxo3) create(trustedContactDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TrustedContactDetailDataState.copy$default((TrustedContactDetailDataState) this.L$0, false, this.$model, 1, null);
    }
}
