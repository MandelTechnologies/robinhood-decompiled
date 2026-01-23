package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityResponse;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IdVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationDuxo$onSubmit$2", m3645f = "IdVerificationDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationDuxo$onSubmit$2, reason: use source file name */
/* loaded from: classes2.dex */
final class IdVerificationDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IdVerificationData $data;
    int label;
    final /* synthetic */ IdVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdVerificationDuxo4(IdVerificationDuxo idVerificationDuxo, IdVerificationData idVerificationData, Continuation<? super IdVerificationDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = idVerificationDuxo;
        this.$data = idVerificationData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IdVerificationDuxo4(this.this$0, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IdVerificationDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GraphqlQueryResponse<UpdateIdentityResponse.Response> updateIdentity;
        UpdateIdentityResponse.Response data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            IdVerificationData idVerificationData = this.$data;
            this.label = 1;
            obj = creditCardStore.updateIdentity(idVerificationData, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        UpdateIdentityResponse updateIdentityResponse = (UpdateIdentityResponse) obj;
        if (((updateIdentityResponse == null || (updateIdentity = updateIdentityResponse.getUpdateIdentity()) == null || (data = updateIdentity.getData()) == null) ? null : data.getId()) != null) {
            this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
        } else {
            this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}
