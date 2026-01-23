package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ServiceLevelType;
import com.robinhood.android.models.creditcard.api.graphql.UpdateCreditApplicationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateCreditApplicationResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onGoldBasicDownsellCtaClick$response$1", m3645f = "FinalTermsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onGoldBasicDownsellCtaClick$response$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UpdateCreditApplicationResponse>, Object> {
    int label;
    final /* synthetic */ FinalTermsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinalTermsDuxo5(FinalTermsDuxo finalTermsDuxo, Continuation<? super FinalTermsDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = finalTermsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinalTermsDuxo5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UpdateCreditApplicationResponse> continuation) {
        return ((FinalTermsDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CreditCardStore creditCardStore = this.this$0.creditCardStore;
        ServiceLevelType serviceLevelType = ServiceLevelType.RH_GOLD_BASIC;
        this.label = 1;
        Object objUpdateCreditApplication = creditCardStore.updateCreditApplication(serviceLevelType, this);
        return objUpdateCreditApplication == coroutine_suspended ? coroutine_suspended : objUpdateCreditApplication;
    }
}
