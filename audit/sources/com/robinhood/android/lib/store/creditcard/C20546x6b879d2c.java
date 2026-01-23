package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.api.creditcard.XsellApi;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteQueryRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$getValidCreditApplicationInvites$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {697, 709, 712}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$getValidCreditApplicationInvites$$inlined$withScopeContext$1 */
/* loaded from: classes8.dex */
public final class C20546x6b879d2c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ValidCreditApplicationInviteResponse>, Object> {
    final /* synthetic */ String $rhUserId$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20546x6b879d2c(Continuation continuation, CreditCardStore creditCardStore, String str) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$rhUserId$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20546x6b879d2c(continuation, this.this$0, this.$rhUserId$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidCreditApplicationInviteResponse> continuation) {
        return ((C20546x6b879d2c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r13 == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean zBooleanValue = false;
        try {
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{XsellApiCreditApplicationsInvitesExperiment.INSTANCE}, true, null, 4, null);
            this.label = 1;
            obj = FlowKt.first(flowStreamStateFlow$default, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (ValidCreditApplicationInviteResponse) ((GraphqlQueryResponse) obj).getData();
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ValidCreditApplicationInviteResponse) ((GraphqlQueryResponse) obj).getData();
            }
            ResultKt.throwOnFailure(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        ValidCreditApplicationInviteQueryRequest validCreditApplicationInviteQueryRequest = new ValidCreditApplicationInviteQueryRequest(null, null, new ValidCreditApplicationInviteQueryRequestVariables(this.$rhUserId$inlined), 3, null);
        if (zBooleanValue) {
            XsellApi xsellApi = this.this$0.xsellApi;
            this.label = 2;
            obj = xsellApi.validCreditApplicationInvites(validCreditApplicationInviteQueryRequest, this);
        } else {
            CreditCardApi creditCardApi = this.this$0.creditCardApi;
            this.label = 3;
            obj = creditCardApi.validCreditApplicationInvites(validCreditApplicationInviteQueryRequest, this);
        }
        return coroutine_suspended;
    }
}
