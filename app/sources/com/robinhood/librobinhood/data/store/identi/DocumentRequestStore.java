package com.robinhood.librobinhood.data.store.identi;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.api.docupload.DocUploadBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.models.api.identi.ApiVideoSelfieAdditionalInfo;
import com.robinhood.models.api.identi.ApiVideoSelfieCaptureFailedRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieThresholds;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadResponse;
import com.robinhood.models.api.identi.ApiVideoSelfieVerificationResponse;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003WXYB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00162\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010&\u001a\u00020%H\u0086@¢\u0006\u0004\b&\u0010'JL\u00103\u001a\u0002022\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0086@¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b7\u00108J \u0010;\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0086@¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R,\u0010B\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100@8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010ER \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020#0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00110@8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bH\u0010C\u0012\u0004\bI\u0010ER \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020!0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010CR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020%0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010CR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002060@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010CR,\u0010N\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002090M\u0012\u0004\u0012\u00020#0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010CR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u0002020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u0002000S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "api", "Lcom/robinhood/android/api/docupload/DocUploadBonfireApi;", "bonfireApi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/docupload/DocUploadApi;Lcom/robinhood/android/api/docupload/DocUploadBonfireApi;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "type", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;", "state", "", "Lcom/robinhood/models/ui/DocumentRequest;", "getDocumentRequests", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Duration", "duration", "Lio/reactivex/Observable;", "pollDocumentRequests", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;Lj$/time/Duration;)Lio/reactivex/Observable;", "Ljava/util/UUID;", "id", "getDocumentRequest", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uuids", "Lio/reactivex/Single;", "getDocumentRequestsByIds", "(Ljava/util/List;Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;", "getDocumentRequestContentById", "", "patchDocumentRequest", "Lcom/robinhood/models/api/identi/ApiVideoSelfieThresholds;", "getVideoSelfieThresholds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "nonce", "documentRequestId", "", "setBaseline", "videoPath", "photoPath", "timeSeries", "Lcom/robinhood/models/api/identi/ApiVideoSelfieAdditionalInfo;", "additionalInfo", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadResponse;", "uploadVideoSelfie", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/identi/ApiVideoSelfieAdditionalInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/api/identi/ApiVideoSelfieVerificationResponse;", "pollVideoSelfieVerification", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/api/identi/ApiVideoSelfieCaptureFailedRequest;", "request", "reportVideoSelfieCaptureFailed", "(Ljava/util/UUID;Lcom/robinhood/models/api/identi/ApiVideoSelfieCaptureFailedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "Lcom/robinhood/android/api/docupload/DocUploadBonfireApi;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestsParams;", "getDocumentRequestsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "getGetDocumentRequestsEndpoint$annotations", "()V", "patchDocumentRequestsEndpoint", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestParams;", "getDocumentRequestEndpoint", "getGetDocumentRequestEndpoint$annotations", "getDocumentRequestContentEndpoint", "getVideoSelfieThresholdsEndpoint", "getVideoSelfieVerificationEndpoint", "Lkotlin/Pair;", "reportVideoSelfieCaptureFailedEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadRequest;", "uploadVideoSelfieEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/squareup/moshi/JsonAdapter;", "getAdditionalInfoAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "additionalInfoAdapter", "GetDocumentRequestsParams", "GetDocumentRequestParams", "LoadDocumentResult", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DocumentRequestStore extends Store {
    private final DocUploadApi api;
    private final DocUploadBonfireApi bonfireApi;
    private final Endpoint<UUID, ApiDocumentRequestContent> getDocumentRequestContentEndpoint;
    private final Endpoint<GetDocumentRequestParams, DocumentRequest> getDocumentRequestEndpoint;
    private final Endpoint<GetDocumentRequestsParams, List<DocumentRequest>> getDocumentRequestsEndpoint;
    private final Endpoint<Unit, ApiVideoSelfieThresholds> getVideoSelfieThresholdsEndpoint;
    private final Endpoint<UUID, ApiVideoSelfieVerificationResponse> getVideoSelfieVerificationEndpoint;
    private final LazyMoshi moshi;
    private final Endpoint<UUID, Unit> patchDocumentRequestsEndpoint;
    private final Endpoint<Tuples2<UUID, ApiVideoSelfieCaptureFailedRequest>, Unit> reportVideoSelfieCaptureFailedEndpoint;
    private final PostEndpoint<ApiVideoSelfieUploadRequest, ApiVideoSelfieUploadResponse> uploadVideoSelfieEndpoint;

    private static /* synthetic */ void getGetDocumentRequestEndpoint$annotations() {
    }

    private static /* synthetic */ void getGetDocumentRequestsEndpoint$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getVideoSelfieVerificationEndpoint$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentRequestStore(DocUploadApi api, DocUploadBonfireApi bonfireApi, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.bonfireApi = bonfireApi;
        this.moshi = moshi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getDocumentRequestsEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$getDocumentRequestsEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$getDocumentRequestsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.patchDocumentRequestsEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$patchDocumentRequestsEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$patchDocumentRequestsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getDocumentRequestEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$getDocumentRequestEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$getDocumentRequestEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getDocumentRequestContentEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$getDocumentRequestContentEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$getDocumentRequestContentEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getVideoSelfieThresholdsEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$getVideoSelfieThresholdsEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$getVideoSelfieThresholdsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getVideoSelfieVerificationEndpoint = companion.create(new DocumentRequestStore$getVideoSelfieVerificationEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$getVideoSelfieVerificationEndpoint$2(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DocumentRequestStore.getVideoSelfieVerificationEndpoint$lambda$0((Long) obj));
            }
        });
        this.reportVideoSelfieCaptureFailedEndpoint = Endpoint.Companion.create$default(companion, new DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$1(this, null), getLogoutKillswitch(), new DocumentRequestStore$reportVideoSelfieCaptureFailedEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.uploadVideoSelfieEndpoint = PostEndpoint.INSTANCE.create(new DocumentRequestStore$uploadVideoSelfieEndpoint$1(this, null), new DocumentRequestStore$uploadVideoSelfieEndpoint$2(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ApiVideoSelfieAdditionalInfo> getAdditionalInfoAdapter() {
        return this.moshi.adapter(ApiVideoSelfieAdditionalInfo.class);
    }

    public static /* synthetic */ Object getDocumentRequests$default(DocumentRequestStore documentRequestStore, ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = null;
        }
        if ((i & 2) != 0) {
            state = null;
        }
        return documentRequestStore.getDocumentRequests(type2, state, continuation);
    }

    public final Object getDocumentRequests(ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, Continuation<? super List<DocumentRequest>> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getDocumentRequestsEndpoint, new GetDocumentRequestsParams(type2, state), null, continuation, 2, null);
    }

    public static /* synthetic */ Observable pollDocumentRequests$default(DocumentRequestStore documentRequestStore, ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = null;
        }
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return documentRequestStore.pollDocumentRequests(type2, state, duration);
    }

    public final Observable<List<DocumentRequest>> pollDocumentRequests(ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return asObservable(Endpoint.DefaultImpls.poll$default(this.getDocumentRequestsEndpoint, new GetDocumentRequestsParams(type2, state), duration, null, 4, null));
    }

    public final Object getDocumentRequest(UUID uuid, Continuation<? super DocumentRequest> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getDocumentRequestEndpoint, new GetDocumentRequestParams(uuid), null, continuation, 2, null);
    }

    public static /* synthetic */ Single getDocumentRequestsByIds$default(DocumentRequestStore documentRequestStore, List list, ApiDocumentRequest.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = null;
        }
        return documentRequestStore.getDocumentRequestsByIds(list, state);
    }

    /* compiled from: DocumentRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestsByIds$1", m3645f = "DocumentRequestStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestsByIds$1 */
    static final class C348311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends DocumentRequest>>, Object> {
        final /* synthetic */ ApiDocumentRequest.State $state;
        final /* synthetic */ List<UUID> $uuids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348311(ApiDocumentRequest.State state, List<UUID> list, Continuation<? super C348311> continuation) {
            super(2, continuation);
            this.$state = state;
            this.$uuids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocumentRequestStore.this.new C348311(this.$state, this.$uuids, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DocumentRequest>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<DocumentRequest>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DocumentRequest>> continuation) {
            return ((C348311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C348311 c348311;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DocumentRequestStore documentRequestStore = DocumentRequestStore.this;
                ApiDocumentRequest.State state = this.$state;
                this.label = 1;
                c348311 = this;
                obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c348311, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c348311 = this;
            }
            List<UUID> list = c348311.$uuids;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (CollectionsKt.contains(list, ((DocumentRequest) obj2).getId())) {
                    arrayList.add(obj2);
                }
            }
            final List<UUID> list2 = c348311.$uuids;
            return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestsByIds$1$invokeSuspend$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(CollectionsKt.indexOf((List<? extends UUID>) list2, ((DocumentRequest) t).getId())), Integer.valueOf(CollectionsKt.indexOf((List<? extends UUID>) list2, ((DocumentRequest) t2).getId())));
                }
            });
        }
    }

    public final Single<List<DocumentRequest>> getDocumentRequestsByIds(List<UUID> uuids, ApiDocumentRequest.State state) {
        Intrinsics.checkNotNullParameter(uuids, "uuids");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348311(state, uuids, null), 1, null);
    }

    public final Object getDocumentRequestContentById(UUID uuid, Continuation<? super ApiDocumentRequestContent> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getDocumentRequestContentEndpoint, uuid, null, continuation, 2, null);
    }

    public final Object patchDocumentRequest(UUID uuid, Continuation<? super Unit> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.patchDocumentRequestsEndpoint, uuid, null, continuation, 2, null);
    }

    public final Object getVideoSelfieThresholds(Continuation<? super ApiVideoSelfieThresholds> continuation) {
        return Endpoint8.forceFetch$default(this.getVideoSelfieThresholdsEndpoint, null, continuation, 1, null);
    }

    public final Object uploadVideoSelfie(String str, String str2, boolean z, String str3, String str4, String str5, ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo, Continuation<? super ApiVideoSelfieUploadResponse> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.uploadVideoSelfieEndpoint, new ApiVideoSelfieUploadRequest(str, str2, z, str4, str3, str5, apiVideoSelfieAdditionalInfo), null, continuation, 2, null);
    }

    public final Flow<ApiVideoSelfieVerificationResponse> pollVideoSelfieVerification(UUID documentRequestId) {
        Intrinsics.checkNotNullParameter(documentRequestId, "documentRequestId");
        Endpoint<UUID, ApiVideoSelfieVerificationResponse> endpoint = this.getVideoSelfieVerificationEndpoint;
        Duration durationOfMillis = Duration.ofMillis(200L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, documentRequestId, durationOfMillis, null, 4, null);
    }

    public final Object reportVideoSelfieCaptureFailed(UUID uuid, ApiVideoSelfieCaptureFailedRequest apiVideoSelfieCaptureFailedRequest, Continuation<? super Unit> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.reportVideoSelfieCaptureFailedEndpoint, Tuples4.m3642to(uuid, apiVideoSelfieCaptureFailedRequest), null, continuation, 2, null);
    }

    /* compiled from: DocumentRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestsParams;", "", "type", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "state", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;)V", "getType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getState", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetDocumentRequestsParams {
        private final ApiDocumentRequest.State state;
        private final ApiDocumentRequest.Type type;

        /* JADX WARN: Multi-variable type inference failed */
        public GetDocumentRequestsParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ GetDocumentRequestsParams copy$default(GetDocumentRequestsParams getDocumentRequestsParams, ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = getDocumentRequestsParams.type;
            }
            if ((i & 2) != 0) {
                state = getDocumentRequestsParams.state;
            }
            return getDocumentRequestsParams.copy(type2, state);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDocumentRequest.Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequest.State getState() {
            return this.state;
        }

        public final GetDocumentRequestsParams copy(ApiDocumentRequest.Type type2, ApiDocumentRequest.State state) {
            return new GetDocumentRequestsParams(type2, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetDocumentRequestsParams)) {
                return false;
            }
            GetDocumentRequestsParams getDocumentRequestsParams = (GetDocumentRequestsParams) other;
            return this.type == getDocumentRequestsParams.type && this.state == getDocumentRequestsParams.state;
        }

        public int hashCode() {
            ApiDocumentRequest.Type type2 = this.type;
            int iHashCode = (type2 == null ? 0 : type2.hashCode()) * 31;
            ApiDocumentRequest.State state = this.state;
            return iHashCode + (state != null ? state.hashCode() : 0);
        }

        public String toString() {
            return "GetDocumentRequestsParams(type=" + this.type + ", state=" + this.state + ")";
        }

        public GetDocumentRequestsParams(ApiDocumentRequest.Type type2, ApiDocumentRequest.State state) {
            this.type = type2;
            this.state = state;
        }

        public /* synthetic */ GetDocumentRequestsParams(ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? null : state);
        }

        public final ApiDocumentRequest.Type getType() {
            return this.type;
        }

        public final ApiDocumentRequest.State getState() {
            return this.state;
        }
    }

    /* compiled from: DocumentRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestParams;", "", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetDocumentRequestParams {
        private final UUID id;

        public static /* synthetic */ GetDocumentRequestParams copy$default(GetDocumentRequestParams getDocumentRequestParams, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getDocumentRequestParams.id;
            }
            return getDocumentRequestParams.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final GetDocumentRequestParams copy(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new GetDocumentRequestParams(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetDocumentRequestParams) && Intrinsics.areEqual(this.id, ((GetDocumentRequestParams) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "GetDocumentRequestParams(id=" + this.id + ")";
        }

        public GetDocumentRequestParams(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final UUID getId() {
            return this.id;
        }
    }

    /* compiled from: DocumentRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$LoadDocumentResult;", "", "<init>", "()V", "Success", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$LoadDocumentResult$Success;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class LoadDocumentResult {
        public /* synthetic */ LoadDocumentResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LoadDocumentResult() {
        }

        /* compiled from: DocumentRequestStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$LoadDocumentResult$Success;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$LoadDocumentResult;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "getDocumentRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends LoadDocumentResult {
            private final DocumentRequest documentRequest;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(DocumentRequest documentRequest) {
                super(null);
                Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
                this.documentRequest = documentRequest;
            }

            public final DocumentRequest getDocumentRequest() {
                return this.documentRequest;
            }
        }
    }
}
