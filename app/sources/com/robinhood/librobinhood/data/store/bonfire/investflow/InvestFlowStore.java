package com.robinhood.librobinhood.data.store.bonfire.investflow;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.investFlow.retrofit.InvestFlowApi;
import com.robinhood.api.investFlow.retrofit.InvestFlowEmbeddedDetailPageKey;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboRequest;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowOrderCheckResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowReceiptPostBody;
import com.robinhood.investflow.models.api.InvestFlowReceiptResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowEmbeddedDetailPageResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowMenuPageResponse;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
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
import p479j$.time.Duration;

/* compiled from: InvestFlowStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\"\u001a\u00020\nJ\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010-\u001a\u00020\u0017J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010-\u001a\u00020\u0017J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010-\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "Lcom/robinhood/store/Store;", "investFlowApi", "Lcom/robinhood/api/investFlow/retrofit/InvestFlowApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/investFlow/retrofit/InvestFlowApi;Lcom/robinhood/store/StoreBundle;)V", "investFlowDiscoveryEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "investFlowMenuPageEndpoint", "", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowMenuPageResponse;", "investFlowEmbeddedDetailEndpoint", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore$EmbeddedDetailQueryParams;", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;", "nbboEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRequest;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "investFlowCreateEndpoint", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "investFlowCheckEndpoint", "Lcom/robinhood/investflow/models/api/ApiInvestFlowOrderCheckResponse;", "investFlowReceiptEndpoint", "Lcom/robinhood/investflow/models/api/ApiInvestFlowReceiptPostBody;", "Lcom/robinhood/investflow/models/api/InvestFlowReceiptResponse;", "fetchInvestFlowMenuPage", "Lio/reactivex/Single;", "streamInvestFlowEmbeddedDetailPageHeader", "Lio/reactivex/Observable;", "assetType", "uuid", "Ljava/util/UUID;", "streamInvestFlowEmbeddedDetailPageFundamental", "fetchInvestFlowEmbeddedDetailPage", "fetchInvestFlowDiscoveryPage", "getNbbo", "assets", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "createInvestFlow", "postBody", "checkInvestFlow", "getReceipt", "EmbeddedDetailQueryParams", "lib-store-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InvestFlowStore extends Store {
    private final InvestFlowApi investFlowApi;
    private final PostEndpoint<ApiInvestFlowPostBody, ApiInvestFlowOrderCheckResponse> investFlowCheckEndpoint;
    private final PostEndpoint<ApiInvestFlowPostBody, ApiInvestFlowPostResponse> investFlowCreateEndpoint;
    private final Endpoint<ApiAssetType, ApiInvestFlowDiscoveryPageResponse> investFlowDiscoveryEndpoint;
    private final Endpoint<EmbeddedDetailQueryParams, ApiInvestFlowEmbeddedDetailPageResponse> investFlowEmbeddedDetailEndpoint;
    private final Endpoint<Unit, ApiInvestFlowMenuPageResponse> investFlowMenuPageEndpoint;
    private final PostEndpoint<ApiInvestFlowReceiptPostBody, InvestFlowReceiptResponse> investFlowReceiptEndpoint;
    private final PostEndpoint<ApiInvestFlowNbboRequest, ApiInvestFlowNbboResponse> nbboEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowStore(InvestFlowApi investFlowApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(investFlowApi, "investFlowApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.investFlowApi = investFlowApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.investFlowDiscoveryEndpoint = Endpoint.Companion.create$default(companion, new InvestFlowStore$investFlowDiscoveryEndpoint$1(this, null), getLogoutKillswitch(), new InvestFlowStore$investFlowDiscoveryEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.investFlowMenuPageEndpoint = Endpoint.Companion.create$default(companion, new InvestFlowStore$investFlowMenuPageEndpoint$1(this, null), getLogoutKillswitch(), new InvestFlowStore$investFlowMenuPageEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.investFlowEmbeddedDetailEndpoint = Endpoint.Companion.create$default(companion, new InvestFlowStore$investFlowEmbeddedDetailEndpoint$1(this, null), getLogoutKillswitch(), new InvestFlowStore$investFlowEmbeddedDetailEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.nbboEndpoint = companion2.create(new InvestFlowStore$nbboEndpoint$1(this, null), new InvestFlowStore$nbboEndpoint$2(null));
        this.investFlowCreateEndpoint = companion2.create(new InvestFlowStore$investFlowCreateEndpoint$1(this, null), new InvestFlowStore$investFlowCreateEndpoint$2(null));
        this.investFlowCheckEndpoint = companion2.create(new InvestFlowStore$investFlowCheckEndpoint$1(this, null), new InvestFlowStore$investFlowCheckEndpoint$2(null));
        this.investFlowReceiptEndpoint = companion2.create(new InvestFlowStore$investFlowReceiptEndpoint$1(this, null), new InvestFlowStore$investFlowReceiptEndpoint$2(null));
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowMenuPageResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowMenuPage$1", m3645f = "InvestFlowStore.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowMenuPage$1 */
    static final class C346511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowMenuPageResponse>, Object> {
        int label;

        C346511(Continuation<? super C346511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowMenuPageResponse> continuation) {
            return ((C346511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = InvestFlowStore.this.investFlowMenuPageEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiInvestFlowMenuPageResponse> fetchInvestFlowMenuPage() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346511(null), 1, null);
    }

    public final Observable<ApiInvestFlowEmbeddedDetailPageResponse> streamInvestFlowEmbeddedDetailPageHeader(ApiAssetType assetType, UUID uuid) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Endpoint<EmbeddedDetailQueryParams, ApiInvestFlowEmbeddedDetailPageResponse> endpoint = this.investFlowEmbeddedDetailEndpoint;
        EmbeddedDetailQueryParams embeddedDetailQueryParams = new EmbeddedDetailQueryParams(assetType, uuid, InvestFlowEmbeddedDetailPageKey.HEADER);
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return asObservable(Endpoint.DefaultImpls.poll$default(endpoint, embeddedDetailQueryParams, durationOfSeconds, null, 4, null));
    }

    public final Observable<ApiInvestFlowEmbeddedDetailPageResponse> streamInvestFlowEmbeddedDetailPageFundamental(ApiAssetType assetType, UUID uuid) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Endpoint<EmbeddedDetailQueryParams, ApiInvestFlowEmbeddedDetailPageResponse> endpoint = this.investFlowEmbeddedDetailEndpoint;
        EmbeddedDetailQueryParams embeddedDetailQueryParams = new EmbeddedDetailQueryParams(assetType, uuid, InvestFlowEmbeddedDetailPageKey.FUNDAMENTAL);
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return asObservable(Endpoint.DefaultImpls.poll$default(endpoint, embeddedDetailQueryParams, durationOfSeconds, null, 4, null));
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowEmbeddedDetailPage$1", m3645f = "InvestFlowStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowEmbeddedDetailPage$1 */
    static final class C346501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowEmbeddedDetailPageResponse>, Object> {
        final /* synthetic */ ApiAssetType $assetType;
        final /* synthetic */ UUID $uuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346501(ApiAssetType apiAssetType, UUID uuid, Continuation<? super C346501> continuation) {
            super(2, continuation);
            this.$assetType = apiAssetType;
            this.$uuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346501(this.$assetType, this.$uuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowEmbeddedDetailPageResponse> continuation) {
            return ((C346501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = InvestFlowStore.this.investFlowEmbeddedDetailEndpoint;
            EmbeddedDetailQueryParams embeddedDetailQueryParams = new EmbeddedDetailQueryParams(this.$assetType, this.$uuid, InvestFlowEmbeddedDetailPageKey.FULL_PAGE);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, embeddedDetailQueryParams, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiInvestFlowEmbeddedDetailPageResponse> fetchInvestFlowEmbeddedDetailPage(ApiAssetType assetType, UUID uuid) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346501(assetType, uuid, null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowDiscoveryPage$1", m3645f = "InvestFlowStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$fetchInvestFlowDiscoveryPage$1 */
    static final class C346491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowDiscoveryPageResponse>, Object> {
        final /* synthetic */ ApiAssetType $assetType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346491(ApiAssetType apiAssetType, Continuation<? super C346491> continuation) {
            super(2, continuation);
            this.$assetType = apiAssetType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346491(this.$assetType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowDiscoveryPageResponse> continuation) {
            return ((C346491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = InvestFlowStore.this.investFlowDiscoveryEndpoint;
            ApiAssetType apiAssetType = this.$assetType;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, apiAssetType, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiInvestFlowDiscoveryPageResponse> fetchInvestFlowDiscoveryPage(ApiAssetType assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346491(assetType, null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$getNbbo$1", m3645f = "InvestFlowStore.kt", m3646l = {131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$getNbbo$1 */
    static final class C346521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowNbboResponse>, Object> {
        final /* synthetic */ ApiInvestFlowNbboRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346521(ApiInvestFlowNbboRequest apiInvestFlowNbboRequest, Continuation<? super C346521> continuation) {
            super(2, continuation);
            this.$request = apiInvestFlowNbboRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346521(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowNbboResponse> continuation) {
            return ((C346521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = InvestFlowStore.this.nbboEndpoint;
            ApiInvestFlowNbboRequest apiInvestFlowNbboRequest = this.$request;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiInvestFlowNbboRequest, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiInvestFlowNbboResponse> getNbbo(List<ApiAssetAllocation> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346521(new ApiInvestFlowNbboRequest(assets), null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$createInvestFlow$1", m3645f = "InvestFlowStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$createInvestFlow$1 */
    static final class C346481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowPostResponse>, Object> {
        final /* synthetic */ ApiInvestFlowPostBody $postBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346481(ApiInvestFlowPostBody apiInvestFlowPostBody, Continuation<? super C346481> continuation) {
            super(2, continuation);
            this.$postBody = apiInvestFlowPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346481(this.$postBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowPostResponse> continuation) {
            return ((C346481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = InvestFlowStore.this.investFlowCreateEndpoint;
            ApiInvestFlowPostBody apiInvestFlowPostBody = this.$postBody;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiInvestFlowPostBody, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiInvestFlowPostResponse> createInvestFlow(ApiInvestFlowPostBody postBody) {
        Intrinsics.checkNotNullParameter(postBody, "postBody");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346481(postBody, null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/ApiInvestFlowOrderCheckResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$checkInvestFlow$1", m3645f = "InvestFlowStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$checkInvestFlow$1 */
    static final class C346471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestFlowOrderCheckResponse>, Object> {
        final /* synthetic */ ApiInvestFlowPostBody $postBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346471(ApiInvestFlowPostBody apiInvestFlowPostBody, Continuation<? super C346471> continuation) {
            super(2, continuation);
            this.$postBody = apiInvestFlowPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346471(this.$postBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestFlowOrderCheckResponse> continuation) {
            return ((C346471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = InvestFlowStore.this.investFlowCheckEndpoint;
            ApiInvestFlowPostBody apiInvestFlowPostBody = this.$postBody;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiInvestFlowPostBody, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiInvestFlowOrderCheckResponse> checkInvestFlow(ApiInvestFlowPostBody postBody) {
        Intrinsics.checkNotNullParameter(postBody, "postBody");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346471(postBody, null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/InvestFlowReceiptResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$getReceipt$1", m3645f = "InvestFlowStore.kt", m3646l = {144}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$getReceipt$1 */
    static final class C346531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InvestFlowReceiptResponse>, Object> {
        final /* synthetic */ ApiInvestFlowReceiptPostBody $postBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346531(ApiInvestFlowReceiptPostBody apiInvestFlowReceiptPostBody, Continuation<? super C346531> continuation) {
            super(2, continuation);
            this.$postBody = apiInvestFlowReceiptPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowStore.this.new C346531(this.$postBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestFlowReceiptResponse> continuation) {
            return ((C346531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = InvestFlowStore.this.investFlowReceiptEndpoint;
            ApiInvestFlowReceiptPostBody apiInvestFlowReceiptPostBody = this.$postBody;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiInvestFlowReceiptPostBody, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<InvestFlowReceiptResponse> getReceipt(ApiInvestFlowReceiptPostBody postBody) {
        Intrinsics.checkNotNullParameter(postBody, "postBody");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346531(postBody, null), 1, null);
    }

    /* compiled from: InvestFlowStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore$EmbeddedDetailQueryParams;", "", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "uuid", "Ljava/util/UUID;", "key", "Lcom/robinhood/api/investFlow/retrofit/InvestFlowEmbeddedDetailPageKey;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;Lcom/robinhood/api/investFlow/retrofit/InvestFlowEmbeddedDetailPageKey;)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getUuid", "()Ljava/util/UUID;", "getKey", "()Lcom/robinhood/api/investFlow/retrofit/InvestFlowEmbeddedDetailPageKey;", "lib-store-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EmbeddedDetailQueryParams {
        private final ApiAssetType assetType;
        private final InvestFlowEmbeddedDetailPageKey key;
        private final UUID uuid;

        public EmbeddedDetailQueryParams(ApiAssetType assetType, UUID uuid, InvestFlowEmbeddedDetailPageKey key) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(key, "key");
            this.assetType = assetType;
            this.uuid = uuid;
            this.key = key;
        }

        public final ApiAssetType getAssetType() {
            return this.assetType;
        }

        public final InvestFlowEmbeddedDetailPageKey getKey() {
            return this.key;
        }

        public final UUID getUuid() {
            return this.uuid;
        }
    }
}
