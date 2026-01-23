package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddressConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationDuxo$onSubmit$2", m3645f = "AddressConfirmationDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationDuxo$onSubmit$2, reason: use source file name */
/* loaded from: classes2.dex */
final class AddressConfirmationDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AddressType $address;
    int label;
    final /* synthetic */ AddressConfirmationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressConfirmationDuxo4(AddressConfirmationDuxo addressConfirmationDuxo, AddressType addressType, Continuation<? super AddressConfirmationDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = addressConfirmationDuxo;
        this.$address = addressType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressConfirmationDuxo4(this.this$0, this.$address, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressConfirmationDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GraphqlValidationType<SubmitAddressChallengeResponse.Response> submitAddressChallenge;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            AddressType addressType = this.$address;
            this.label = 1;
            obj = creditCardStore.submitAddressChallenge(addressType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SubmitAddressChallengeResponse submitAddressChallengeResponse = (SubmitAddressChallengeResponse) obj;
        SubmitAddressChallengeResponse.Response data = (submitAddressChallengeResponse == null || (submitAddressChallenge = submitAddressChallengeResponse.getSubmitAddressChallenge()) == null) ? null : submitAddressChallenge.getData();
        if (data != null) {
            this.this$0.poll(data.getIdentityVerificationTaskId());
        } else {
            this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}
