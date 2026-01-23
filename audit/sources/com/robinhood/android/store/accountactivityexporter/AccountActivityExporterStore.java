package com.robinhood.android.store.accountactivityexporter;

import com.robinhood.android.api.accountactivityexporter.AccountActivityExporterApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterRequest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import retrofit2.Response;

/* compiled from: AccountActivityExporterStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountActivityExporterApi", "Lcom/robinhood/android/api/accountactivityexporter/AccountActivityExporterApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/accountactivityexporter/AccountActivityExporterApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "streamAccountActivityExporter", "Lio/reactivex/Observable;", "submitAccountActivityExportRequest", "Lio/reactivex/Single;", "Lretrofit2/Response;", "request", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "lib-store-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountActivityExporterStore extends Store {
    private final AccountActivityExporterApi accountActivityExporterApi;
    private final Endpoint<Unit, ApiAccountActivityExporter> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountActivityExporterStore(StoreBundle storeBundle, AccountActivityExporterApi accountActivityExporterApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountActivityExporterApi, "accountActivityExporterApi");
        this.accountActivityExporterApi = accountActivityExporterApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AccountActivityExporterStore2(this, null), getLogoutKillswitch(), new AccountActivityExporterStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: AccountActivityExporterStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore$streamAccountActivityExporter$1", m3645f = "AccountActivityExporterStore.kt", m3646l = {27, 27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore$streamAccountActivityExporter$1 */
    static final class C287241 extends ContinuationImpl7 implements Function2<Produce4<? super ApiAccountActivityExporter>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C287241(Continuation<? super C287241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287241 c287241 = AccountActivityExporterStore.this.new C287241(continuation);
            c287241.L$0 = obj;
            return c287241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ApiAccountActivityExporter> produce4, Continuation<? super Unit> continuation) {
            return ((C287241) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r1.send(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            C287241 c287241;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Endpoint endpoint = AccountActivityExporterStore.this.endpoint;
                Unit unit = Unit.INSTANCE;
                this.L$0 = produce4;
                this.label = 1;
                c287241 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c287241, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            c287241 = this;
            c287241.L$0 = null;
            c287241.label = 2;
        }
    }

    public final Observable<ApiAccountActivityExporter> streamAccountActivityExporter() {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C287241(null), 1, null);
    }

    /* compiled from: AccountActivityExporterStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore$submitAccountActivityExportRequest$1", m3645f = "AccountActivityExporterStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore$submitAccountActivityExportRequest$1 */
    static final class C287251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiAccountActivityExporter>>, Object> {
        final /* synthetic */ ApiAccountActivityExporterRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287251(ApiAccountActivityExporterRequest apiAccountActivityExporterRequest, Continuation<? super C287251> continuation) {
            super(2, continuation);
            this.$request = apiAccountActivityExporterRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountActivityExporterStore.this.new C287251(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiAccountActivityExporter>> continuation) {
            return ((C287251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AccountActivityExporterApi accountActivityExporterApi = AccountActivityExporterStore.this.accountActivityExporterApi;
            ApiAccountActivityExporterRequest apiAccountActivityExporterRequest = this.$request;
            this.label = 1;
            Object objSubmitAccountActivityReportRequest = accountActivityExporterApi.submitAccountActivityReportRequest(apiAccountActivityExporterRequest, this);
            return objSubmitAccountActivityReportRequest == coroutine_suspended ? coroutine_suspended : objSubmitAccountActivityReportRequest;
        }
    }

    public final Single<Response<ApiAccountActivityExporter>> submitAccountActivityExportRequest(ApiAccountActivityExporterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287251(request, null), 1, null);
    }
}
