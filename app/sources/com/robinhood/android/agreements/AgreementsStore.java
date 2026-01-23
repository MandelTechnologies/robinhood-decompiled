package com.robinhood.android.agreements;

import com.robinhood.android.agreements.api.AgreementsApi;
import com.robinhood.android.agreements.models.ApiAgreement;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.agreements.models.ApiSignAgreementRequest;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.GenericService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0010J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/agreements/AgreementsStore;", "Lcom/robinhood/store/Store;", "agreementsApi", "Lcom/robinhood/android/agreements/api/AgreementsApi;", "genericService", "Lcom/robinhood/api/retrofit/GenericService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/agreements/api/AgreementsApi;Lcom/robinhood/api/retrofit/GenericService;Lcom/robinhood/store/StoreBundle;)V", "getAgreementsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/agreements/models/ApiAgreement;", "getAgreement", "agreementName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAgreementWithContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "signAgreement", "", "agreement", "context", "accountNumber", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signAgreementWithRequest", "request", "Lcom/robinhood/android/agreements/models/ApiSignAgreementRequest;", "(Lcom/robinhood/android/agreements/models/ApiSignAgreementRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "lib-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AgreementsStore extends Store {
    private final AgreementsApi agreementsApi;
    private final GenericService genericService;
    private final Endpoint<String, ApiAgreement> getAgreementsEndpoint;

    /* compiled from: AgreementsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.agreements.AgreementsStore", m3645f = "AgreementsStore.kt", m3646l = {38, 39}, m3647m = "getAgreementWithContent")
    /* renamed from: com.robinhood.android.agreements.AgreementsStore$getAgreementWithContent$1 */
    static final class C95181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C95181(Continuation<? super C95181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgreementsStore.this.getAgreementWithContent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAgreementsEndpoint$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementsStore(AgreementsApi agreementsApi, GenericService genericService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(agreementsApi, "agreementsApi");
        Intrinsics.checkNotNullParameter(genericService, "genericService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.agreementsApi = agreementsApi;
        this.genericService = genericService;
        this.getAgreementsEndpoint = Endpoint.INSTANCE.create(new AgreementsStore2(this, null), getLogoutKillswitch(), new AgreementsStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.android.agreements.AgreementsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AgreementsStore.getAgreementsEndpoint$lambda$0((Long) obj));
            }
        });
    }

    public final Object getAgreement(String str, Continuation<? super ApiAgreement> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getAgreementsEndpoint, str, null, continuation, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAgreementWithContent(String str, Continuation<? super UiAgreementWithContent> continuation) {
        C95181 c95181;
        ApiAgreement apiAgreement;
        if (continuation instanceof C95181) {
            c95181 = (C95181) continuation;
            int i = c95181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c95181.label = i - Integer.MIN_VALUE;
            } else {
                c95181 = new C95181(continuation);
            }
        }
        C95181 c951812 = c95181;
        Object objForceFetch$default = c951812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c951812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, ApiAgreement> endpoint = this.getAgreementsEndpoint;
            c951812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c951812, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiAgreement = (ApiAgreement) c951812.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            return new UiAgreementWithContent(apiAgreement, (String) objForceFetch$default);
        }
        ResultKt.throwOnFailure(objForceFetch$default);
        apiAgreement = (ApiAgreement) objForceFetch$default;
        GenericService genericService = this.genericService;
        String url = apiAgreement.getCdn_url().getUrl();
        c951812.L$0 = apiAgreement;
        c951812.label = 2;
        objForceFetch$default = genericService.getRaw(url, c951812);
    }

    public static /* synthetic */ Object signAgreement$default(AgreementsStore agreementsStore, UiAgreementWithContent uiAgreementWithContent, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return agreementsStore.signAgreement(uiAgreementWithContent, str, str2, continuation);
    }

    public final Object signAgreement(UiAgreementWithContent uiAgreementWithContent, String str, String str2, Continuation<? super Unit> continuation) {
        Object objSignAgreement = this.agreementsApi.signAgreement(new ApiSignAgreementRequest(uiAgreementWithContent, str, str2), continuation);
        return objSignAgreement == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSignAgreement : Unit.INSTANCE;
    }

    public final Object signAgreementWithRequest(ApiSignAgreementRequest apiSignAgreementRequest, Continuation<? super Unit> continuation) {
        Object objSignAgreement = this.agreementsApi.signAgreement(apiSignAgreementRequest, continuation);
        return objSignAgreement == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSignAgreement : Unit.INSTANCE;
    }

    public final Object checkAgreement(String str, Continuation<? super ApiPreviousAgreement> continuation) {
        return this.agreementsApi.checkAgreement(str, continuation);
    }
}
