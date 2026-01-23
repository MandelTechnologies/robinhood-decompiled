package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReport;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportRequest;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportRequest3;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportVariables;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$getAccounts$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {694}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStore$getAccounts$$inlined$withScopeContext$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Account>>, Object> {
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStore$getAccounts$$inlined$withScopeContext$1(Continuation continuation, CreditCardStore creditCardStore) {
        super(2, continuation);
        this.this$0 = creditCardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardStore$getAccounts$$inlined$withScopeContext$1(continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Account>> continuation) {
        return ((CreditCardStore$getAccounts$$inlined$withScopeContext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objManageCreditApplicationAssetReport;
        ManageCreditApplicationAssetReportResponse.Response manageCreditApplicationAssetReport;
        ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardApi creditCardApi = this.this$0.creditCardApi;
                String str = this.this$0.creditApplicationId.get();
                if (str == null) {
                    str = "";
                }
                ManageCreditApplicationAssetReportRequest manageCreditApplicationAssetReportRequest = new ManageCreditApplicationAssetReportRequest(null, null, new ManageCreditApplicationAssetReportVariables(new ManageCreditApplicationAssetReport(str, ManageCreditApplicationAssetReportRequest3.LIST_ACCOUNTS.getServerValue(), null, null, null, 28, null)), 3, null);
                this.label = 1;
                objManageCreditApplicationAssetReport = creditCardApi.manageCreditApplicationAssetReport(manageCreditApplicationAssetReportRequest, this);
                if (objManageCreditApplicationAssetReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objManageCreditApplicationAssetReport = obj;
            }
            ManageCreditApplicationAssetReportResponse manageCreditApplicationAssetReportResponse = (ManageCreditApplicationAssetReportResponse) ((GraphqlQueryResponse) objManageCreditApplicationAssetReport).getData();
            List<ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport.ActionLink> accioLinks = (manageCreditApplicationAssetReportResponse == null || (manageCreditApplicationAssetReport = manageCreditApplicationAssetReportResponse.getManageCreditApplicationAssetReport()) == null || (data = manageCreditApplicationAssetReport.getData()) == null) ? null : data.getAccioLinks();
            if (accioLinks == null) {
                accioLinks = CollectionsKt.emptyList();
            }
            List<ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport.ActionLink> list = accioLinks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport.ActionLink actionLink : list) {
                arrayList.add(new Account(actionLink.getAccountLinkId(), "https://x1creditcard.com/static/x1-app/logos/institutions/" + actionLink.getInstitutionId() + ".png", actionLink.getInstitutionName(), actionLink.getAccountNumberMask(), actionLink.getAccountSubtype(), actionLink.getNumAccounts()));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            return null;
        }
    }
}
