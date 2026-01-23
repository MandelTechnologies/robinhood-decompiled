package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo6;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageType;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.UnderwriteApplicationResponse;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$underwrite$1", m3645f = "CreditApplicationDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$underwrite$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CreditApplicationDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreditApplicationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditApplicationDuxo4(CreditApplicationDuxo creditApplicationDuxo, Continuation<? super CreditApplicationDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = creditApplicationDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditApplicationDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditApplicationDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GraphqlValidationType<UnderwriteApplicationResponse.Response> underwriteApplication;
        UnderwriteApplicationResponse.Response data;
        UnderwriteApplicationResponse.Response.IdType creditApplication;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardStore creditCardStore = this.this$0.creditCardStore;
                this.label = 1;
                obj = creditCardStore.underwriteApplication(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UnderwriteApplicationResponse underwriteApplicationResponse = (UnderwriteApplicationResponse) obj;
            if (((underwriteApplicationResponse == null || (underwriteApplication = underwriteApplicationResponse.getUnderwriteApplication()) == null || (data = underwriteApplication.getData()) == null || (creditApplication = data.getCreditApplication()) == null) ? null : creditApplication.getId()) != null) {
                if (this.this$0.page == null) {
                    this.this$0.page = CreditApplicationPageType.RUN_ELIGIBILITY_PROMPT;
                }
                this.this$0.m1875xb14037d7();
            } else {
                this.this$0.submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            Timber.INSTANCE.mo3355e(th, "underwriteApplication error (creditApplicationId: " + this.this$0.creditApplicationId.get() + ")", new Object[0]);
            this.this$0.submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
