package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.odyssey.OdysseyApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.prefs.Installation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Maybe;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ServerDrivenStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\fJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "Lcom/robinhood/store/Store;", "odysseyApi", "Lcom/robinhood/api/odyssey/OdysseyApi;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/odyssey/OdysseyApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/store/StoreBundle;)V", "getGenericSdEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "submitGenericSdEntitiesEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "validateGenericSdEntityValuesEndpoint", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "submitWorkflowEntitiesEndpoint", "fetchSdFlow", "Lio/reactivex/Maybe;", "flowConfiguration", "submitSdFlowEntities", "request", "validateSdFlowEntities", "FlowConfiguration", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ServerDrivenStore extends Store {
    private final Endpoint<FlowConfiguration, ApiSdResponse> getGenericSdEndpoint;
    private final Installation installation;
    private final OdysseyApi odysseyApi;
    private final PostEndpoint<Tuples2<FlowConfiguration, ApiSdSubmitPayloadRequest>, ApiSdResponse> submitGenericSdEntitiesEndpoint;
    private final PostEndpoint<Tuples2<FlowConfiguration, ApiSdSubmitPayloadRequest>, ApiSdResponse> submitWorkflowEntitiesEndpoint;
    private final PostEndpoint<Tuples2<FlowConfiguration, ApiSdSubmitPayloadRequest>, ApiSdComponentDataChangeResponse> validateGenericSdEntityValuesEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerDrivenStore(OdysseyApi odysseyApi, Installation installation, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(odysseyApi, "odysseyApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.odysseyApi = odysseyApi;
        this.installation = installation;
        this.getGenericSdEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ServerDrivenStore2(this, null), getLogoutKillswitch(), new ServerDrivenStore3(null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.submitGenericSdEntitiesEndpoint = companion.create(new ServerDrivenStore4(this, null), new ServerDrivenStore5(null));
        this.validateGenericSdEntityValuesEndpoint = companion.create(new ServerDrivenStore8(this, null), new ServerDrivenStore9(null));
        this.submitWorkflowEntitiesEndpoint = companion.create(new ServerDrivenStore6(this, null), new ServerDrivenStore7(null));
    }

    /* compiled from: ServerDrivenStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$fetchSdFlow$1", m3645f = "ServerDrivenStore.kt", m3646l = {90, 92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$fetchSdFlow$1 */
    static final class C348391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSdResponse>, Object> {
        final /* synthetic */ FlowConfiguration $flowConfiguration;
        int label;
        final /* synthetic */ ServerDrivenStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348391(FlowConfiguration flowConfiguration, ServerDrivenStore serverDrivenStore, Continuation<? super C348391> continuation) {
            super(2, continuation);
            this.$flowConfiguration = flowConfiguration;
            this.this$0 = serverDrivenStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C348391(this.$flowConfiguration, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSdResponse> continuation) {
            return ((C348391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r13 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (r13 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ApiSdResponse) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ApiSdResponse) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.$flowConfiguration.isWorkflow()) {
                PostEndpoint postEndpoint = this.this$0.submitWorkflowEntitiesEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$flowConfiguration, new ApiSdSubmitPayloadRequest(null, null, null, null, 15, null));
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            } else {
                Endpoint endpoint = this.this$0.getGenericSdEndpoint;
                FlowConfiguration flowConfiguration = this.$flowConfiguration;
                this.label = 2;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, flowConfiguration, null, this, 2, null);
            }
            return coroutine_suspended;
        }
    }

    public final Maybe<ApiSdResponse> fetchSdFlow(FlowConfiguration flowConfiguration) {
        Intrinsics.checkNotNullParameter(flowConfiguration, "flowConfiguration");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C348391(flowConfiguration, this, null), 1, null);
    }

    /* compiled from: ServerDrivenStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$submitSdFlowEntities$1", m3645f = "ServerDrivenStore.kt", m3646l = {103, 105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$submitSdFlowEntities$1 */
    static final class C348401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSdResponse>, Object> {
        final /* synthetic */ FlowConfiguration $flowConfiguration;
        final /* synthetic */ ApiSdSubmitPayloadRequest $request;
        int label;
        final /* synthetic */ ServerDrivenStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348401(FlowConfiguration flowConfiguration, ServerDrivenStore serverDrivenStore, ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest, Continuation<? super C348401> continuation) {
            super(2, continuation);
            this.$flowConfiguration = flowConfiguration;
            this.this$0 = serverDrivenStore;
            this.$request = apiSdSubmitPayloadRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C348401(this.$flowConfiguration, this.this$0, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSdResponse> continuation) {
            return ((C348401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r11 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ApiSdResponse) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ApiSdResponse) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.$flowConfiguration.isWorkflow()) {
                PostEndpoint postEndpoint = this.this$0.submitWorkflowEntitiesEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$flowConfiguration, this.$request);
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            } else {
                PostEndpoint postEndpoint2 = this.this$0.submitGenericSdEntitiesEndpoint;
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(this.$flowConfiguration, this.$request);
                this.label = 2;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint2, tuples2M3642to2, null, this, 2, null);
            }
            return coroutine_suspended;
        }
    }

    public final Maybe<ApiSdResponse> submitSdFlowEntities(ApiSdSubmitPayloadRequest request, FlowConfiguration flowConfiguration) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(flowConfiguration, "flowConfiguration");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C348401(flowConfiguration, this, request, null), 1, null);
    }

    /* compiled from: ServerDrivenStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$validateSdFlowEntities$1", m3645f = "ServerDrivenStore.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$validateSdFlowEntities$1 */
    static final class C348411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSdComponentDataChangeResponse>, Object> {
        final /* synthetic */ FlowConfiguration $flowConfiguration;
        final /* synthetic */ ApiSdSubmitPayloadRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348411(FlowConfiguration flowConfiguration, ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest, Continuation<? super C348411> continuation) {
            super(2, continuation);
            this.$flowConfiguration = flowConfiguration;
            this.$request = apiSdSubmitPayloadRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerDrivenStore.this.new C348411(this.$flowConfiguration, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSdComponentDataChangeResponse> continuation) {
            return ((C348411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = ServerDrivenStore.this.validateGenericSdEntityValuesEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$flowConfiguration, this.$request);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Maybe<ApiSdComponentDataChangeResponse> validateSdFlowEntities(ApiSdSubmitPayloadRequest request, FlowConfiguration flowConfiguration) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(flowConfiguration, "flowConfiguration");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C348411(flowConfiguration, request, null), 1, null);
    }

    /* compiled from: ServerDrivenStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "", "flowPath", "", "isWorkflow", "", "queryParameters", "", "phoneNumber", "version", "deeplinkCompletionCheckpoint", "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlowPath", "()Ljava/lang/String;", "()Z", "getQueryParameters", "()Ljava/util/Map;", "getPhoneNumber", "getVersion", "getDeeplinkCompletionCheckpoint", "odysseyVersion", "getOdysseyVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FlowConfiguration {
        private final String deeplinkCompletionCheckpoint;
        private final String flowPath;
        private final boolean isWorkflow;
        private final String odysseyVersion;
        private final String phoneNumber;
        private final Map<String, String> queryParameters;
        private final String version;

        public static /* synthetic */ FlowConfiguration copy$default(FlowConfiguration flowConfiguration, String str, boolean z, Map map, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flowConfiguration.flowPath;
            }
            if ((i & 2) != 0) {
                z = flowConfiguration.isWorkflow;
            }
            if ((i & 4) != 0) {
                map = flowConfiguration.queryParameters;
            }
            if ((i & 8) != 0) {
                str2 = flowConfiguration.phoneNumber;
            }
            if ((i & 16) != 0) {
                str3 = flowConfiguration.version;
            }
            if ((i & 32) != 0) {
                str4 = flowConfiguration.deeplinkCompletionCheckpoint;
            }
            String str5 = str3;
            String str6 = str4;
            return flowConfiguration.copy(str, z, map, str2, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFlowPath() {
            return this.flowPath;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsWorkflow() {
            return this.isWorkflow;
        }

        public final Map<String, String> component3() {
            return this.queryParameters;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDeeplinkCompletionCheckpoint() {
            return this.deeplinkCompletionCheckpoint;
        }

        public final FlowConfiguration copy(String flowPath, boolean isWorkflow, Map<String, String> queryParameters, String phoneNumber, String version, String deeplinkCompletionCheckpoint) {
            Intrinsics.checkNotNullParameter(flowPath, "flowPath");
            Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
            return new FlowConfiguration(flowPath, isWorkflow, queryParameters, phoneNumber, version, deeplinkCompletionCheckpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlowConfiguration)) {
                return false;
            }
            FlowConfiguration flowConfiguration = (FlowConfiguration) other;
            return Intrinsics.areEqual(this.flowPath, flowConfiguration.flowPath) && this.isWorkflow == flowConfiguration.isWorkflow && Intrinsics.areEqual(this.queryParameters, flowConfiguration.queryParameters) && Intrinsics.areEqual(this.phoneNumber, flowConfiguration.phoneNumber) && Intrinsics.areEqual(this.version, flowConfiguration.version) && Intrinsics.areEqual(this.deeplinkCompletionCheckpoint, flowConfiguration.deeplinkCompletionCheckpoint);
        }

        public int hashCode() {
            int iHashCode = ((((this.flowPath.hashCode() * 31) + Boolean.hashCode(this.isWorkflow)) * 31) + this.queryParameters.hashCode()) * 31;
            String str = this.phoneNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.version;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deeplinkCompletionCheckpoint;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "FlowConfiguration(flowPath=" + this.flowPath + ", isWorkflow=" + this.isWorkflow + ", queryParameters=" + this.queryParameters + ", phoneNumber=" + this.phoneNumber + ", version=" + this.version + ", deeplinkCompletionCheckpoint=" + this.deeplinkCompletionCheckpoint + ")";
        }

        public FlowConfiguration(String flowPath, boolean z, Map<String, String> queryParameters, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(flowPath, "flowPath");
            Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
            this.flowPath = flowPath;
            this.isWorkflow = z;
            this.queryParameters = queryParameters;
            this.phoneNumber = str;
            this.version = str2;
            this.deeplinkCompletionCheckpoint = str3;
            this.odysseyVersion = str2 == null ? "1.3" : str2;
        }

        public final String getFlowPath() {
            return this.flowPath;
        }

        public final boolean isWorkflow() {
            return this.isWorkflow;
        }

        public /* synthetic */ FlowConfiguration(String str, boolean z, Map map, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
        }

        public final Map<String, String> getQueryParameters() {
            return this.queryParameters;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getDeeplinkCompletionCheckpoint() {
            return this.deeplinkCompletionCheckpoint;
        }

        public final String getOdysseyVersion() {
            return this.odysseyVersion;
        }
    }
}
