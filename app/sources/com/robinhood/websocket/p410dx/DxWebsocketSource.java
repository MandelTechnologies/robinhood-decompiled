package com.robinhood.websocket.p410dx;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.BaseWebsocketSource;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.p410dx.DxTopic;
import com.robinhood.websocket.p410dx.models.ApiMarketdataError;
import com.robinhood.websocket.p410dx.models.DxData;
import com.robinhood.websocket.p410dx.models.DxMessage;
import com.robinhood.websocket.p410dx.models.DxResponse;
import com.robinhood.websocket.p410dx.models.DxSocketToken;
import com.robinhood.websocket.p410dx.models.DxSocketTokenResponse;
import com.robinhood.websocket.p410dx.p411di.DxMarketdataApi;
import com.robinhood.websocket.p410dx.p411di.DxMoshi;
import com.robinhood.websocket.p410dx.utils.DxMessages;
import com.robinhood.websocket.utils.SingleInstanceJob;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: DxWebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0094@¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0016H\u0081@¢\u0006\u0004\b!\u0010\u001fJ4\u0010\"\u001a\u00020#2\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&\u0018\u00010%2\u0014\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&\u0018\u00010%H\u0014J?\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140)2\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&\u0018\u00010%2\u0014\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&\u0018\u00010%H\u0001¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0002H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0014H\u0002J\u001d\u00105\u001a\u00020#2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0001¢\u0006\u0002\b8J\b\u00109\u001a\u00020#H\u0002J\b\u0010:\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0004\n\u0002\u00104¨\u0006<"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxWebsocketSource;", "Lcom/robinhood/websocket/BaseWebsocketSource;", "Lcom/robinhood/websocket/dx/models/DxResponse;", "Lcom/robinhood/websocket/dx/models/DxData;", "dxMarketdataApi", "Lcom/robinhood/websocket/dx/di/DxMarketdataApi;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/dx/DxMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/dx/DxWebsocketConnectionManager;", "<init>", "(Lcom/robinhood/websocket/dx/di/DxMarketdataApi;Lcom/robinhood/utils/ReleaseVersion;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/websocket/dx/DxMessageHandler;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/websocket/dx/DxWebsocketConnectionManager;)V", "messageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/websocket/dx/models/DxMessage;", "cachedToken", "Lcom/robinhood/websocket/dx/models/DxSocketToken;", "tokenMutex", "Lkotlinx/coroutines/sync/Mutex;", "domChannelMap", "", "", "", "nextAvailableDomChannel", "getWebsocketUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToken", "getToken$lib_websocket_dx_externalDebug", "onSubscriptionChanged", "", "addedTopics", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "removedTopics", "generateMessagesFromSubscriptionChanged", "", "generateMessagesFromSubscriptionChanged$lib_websocket_dx_externalDebug", "onResponseReceived", "response", "sendMessage", "message", "clientKeepAliveJob", "Lcom/robinhood/websocket/utils/SingleInstanceJob;", "serverKeepAliveJob", "serverKeepAliveTimeout", "", "Ljava/lang/Long;", "configureKeepAlive", "clientKeepAliveTimeoutInMs", "serverKeepAliveTimeoutInMs", "configureKeepAlive$lib_websocket_dx_externalDebug", "onKeepAliveReceived", "scheduleNextServerKeepAliveCheck", "DxWebsocketError", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DxWebsocketSource extends BaseWebsocketSource<DxResponse, DxData> {
    private DxSocketToken cachedToken;
    private final SingleInstanceJob clientKeepAliveJob;
    private final Map<String, Integer> domChannelMap;
    private final DxMarketdataApi dxMarketdataApi;
    private final JsonAdapter<DxMessage> messageAdapter;
    private final DxMessageHandler messageHandler;
    private int nextAvailableDomChannel;
    private final ReleaseVersion releaseVersion;
    private final SingleInstanceJob serverKeepAliveJob;
    private Long serverKeepAliveTimeout;
    private final Mutex tokenMutex;

    /* compiled from: DxWebsocketSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DxResponse.AuthState.State.values().length];
            try {
                iArr[DxResponse.AuthState.State.UNAUTHORIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DxResponse.AuthState.State.AUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DxWebsocketSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.dx.DxWebsocketSource", m3645f = "DxWebsocketSource.kt", m3646l = {70}, m3647m = "getWebsocketUrl")
    /* renamed from: com.robinhood.websocket.dx.DxWebsocketSource$getWebsocketUrl$1 */
    static final class C420471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C420471(Continuation<? super C420471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DxWebsocketSource.this.getWebsocketUrl(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxWebsocketSource(DxMarketdataApi dxMarketdataApi, ReleaseVersion releaseVersion, @RootCoroutineScope CoroutineScope rootCoroutineScope, DxMessageHandler messageHandler, @DxMoshi LazyMoshi moshi, DxWebsocketConnectionManager connectionManager) {
        super(DxConstants.INSTANCE.getCONFIGURATION(), rootCoroutineScope, messageHandler, connectionManager, null, 16, null);
        Intrinsics.checkNotNullParameter(dxMarketdataApi, "dxMarketdataApi");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        this.dxMarketdataApi = dxMarketdataApi;
        this.releaseVersion = releaseVersion;
        this.messageHandler = messageHandler;
        Types types = Types.INSTANCE;
        this.messageAdapter = moshi.adapter(new TypeToken<DxMessage>() { // from class: com.robinhood.websocket.dx.DxWebsocketSource$special$$inlined$getAdapter$1
        }.getType());
        this.tokenMutex = Mutex3.Mutex$default(false, 1, null);
        this.domChannelMap = new LinkedHashMap();
        this.nextAvailableDomChannel = 3;
        addConnectionOpenListener(new Function0() { // from class: com.robinhood.websocket.dx.DxWebsocketSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DxWebsocketSource._init_$lambda$0(this.f$0);
            }
        });
        addMessageListener(new Function1() { // from class: com.robinhood.websocket.dx.DxWebsocketSource$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DxWebsocketSource._init_$lambda$1(this.f$0, (DxResponse) obj);
            }
        });
        this.clientKeepAliveJob = new SingleInstanceJob();
        this.serverKeepAliveJob = new SingleInstanceJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DxWebsocketSource dxWebsocketSource) {
        dxWebsocketSource.sendMessage(DxMessages.setupMessage(dxWebsocketSource.releaseVersion.getVersionName()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(DxWebsocketSource dxWebsocketSource, DxResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        dxWebsocketSource.onResponseReceived(response);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.websocket.BaseWebsocketSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object getWebsocketUrl(Continuation<? super String> continuation) throws Throwable {
        C420471 c420471;
        if (continuation instanceof C420471) {
            c420471 = (C420471) continuation;
            int i = c420471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420471.label = i - Integer.MIN_VALUE;
            } else {
                c420471 = new C420471(continuation);
            }
        }
        Object token$lib_websocket_dx_externalDebug = c420471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(token$lib_websocket_dx_externalDebug);
            c420471.label = 1;
            token$lib_websocket_dx_externalDebug = getToken$lib_websocket_dx_externalDebug(c420471);
            if (token$lib_websocket_dx_externalDebug == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(token$lib_websocket_dx_externalDebug);
        }
        DxSocketToken dxSocketToken = (DxSocketToken) token$lib_websocket_dx_externalDebug;
        if (dxSocketToken != null) {
            return dxSocketToken.getWss_url();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091 A[Catch: all -> 0x0032, Exception -> 0x0035, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:40:0x0089, B:42:0x0091, B:44:0x0097, B:47:0x009f, B:48:0x00aa, B:50:0x00b0, B:52:0x00b6, B:57:0x00c6, B:56:0x00bd), top: B:64:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[Catch: all -> 0x0032, Exception -> 0x0035, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:40:0x0089, B:42:0x0091, B:44:0x0097, B:47:0x009f, B:48:0x00aa, B:50:0x00b0, B:52:0x00b6, B:57:0x00c6, B:56:0x00bd), top: B:64:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[Catch: all -> 0x0032, Exception -> 0x0035, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:40:0x0089, B:42:0x0091, B:44:0x0097, B:47:0x009f, B:48:0x00aa, B:50:0x00b0, B:52:0x00b6, B:57:0x00c6, B:56:0x00bd), top: B:64:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.websocket.dx.DxWebsocketSource$getToken$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.robinhood.websocket.dx.di.DxMarketdataApi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getToken$lib_websocket_dx_externalDebug(Continuation<? super DxSocketToken> continuation) throws Throwable {
        ?? dxWebsocketSource3;
        Mutex mutex;
        Mutex mutex2;
        Exception e;
        Object websocketData;
        Instant expiration;
        ApiMarketdataError error;
        if (continuation instanceof DxWebsocketSource3) {
            DxWebsocketSource3 dxWebsocketSource32 = (DxWebsocketSource3) continuation;
            int i = dxWebsocketSource32.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxWebsocketSource32.label = i - Integer.MIN_VALUE;
                dxWebsocketSource3 = dxWebsocketSource32;
            } else {
                dxWebsocketSource3 = new DxWebsocketSource3(this, continuation);
            }
        }
        Object obj = dxWebsocketSource3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dxWebsocketSource3.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? r10 = this.tokenMutex;
                    dxWebsocketSource3.L$0 = r10;
                    dxWebsocketSource3.label = 1;
                    Object objLock = r10.lock(null, dxWebsocketSource3);
                    mutex = r10;
                    if (objLock != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) dxWebsocketSource3.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex2 = mutex2;
                        DxSocketTokenResponse dxSocketTokenResponse = (DxSocketTokenResponse) obj;
                        error = dxSocketTokenResponse.getError();
                        if (error == null) {
                            DxSocketTokenResponse.InnerResponse data = dxSocketTokenResponse.getData();
                            error = data != null ? data.getError() : null;
                        }
                        if (error != null) {
                            Timber.INSTANCE.mo3353e(error.getMessage(), new Object[0]);
                        }
                        DxSocketTokenResponse.InnerResponse data2 = dxSocketTokenResponse.getData();
                        this.cachedToken = data2 == null ? data2.getData() : null;
                        dxWebsocketSource3 = mutex2;
                    } catch (Exception e2) {
                        e = e2;
                        Timber.INSTANCE.mo3355e(e, "Error occurred while fetching websocket token from MD", new Object[0]);
                        dxWebsocketSource3 = mutex2;
                        Unit unit = Unit.INSTANCE;
                        dxWebsocketSource3.unlock(null);
                        return this.cachedToken;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    dxWebsocketSource3.unlock(null);
                    return this.cachedToken;
                }
                Mutex mutex3 = (Mutex) dxWebsocketSource3.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                DxSocketToken dxSocketToken = this.cachedToken;
                if (dxSocketToken == null || (dxSocketToken != null && (expiration = dxSocketToken.getExpiration()) != null && expiration.isBefore(Instant.now()))) {
                    try {
                        ?? r2 = this.dxMarketdataApi;
                        dxWebsocketSource3.L$0 = mutex;
                        dxWebsocketSource3.label = 2;
                        websocketData = r2.getWebsocketData("futures", dxWebsocketSource3);
                    } catch (Exception e3) {
                        mutex2 = mutex;
                        e = e3;
                        Timber.INSTANCE.mo3355e(e, "Error occurred while fetching websocket token from MD", new Object[0]);
                        dxWebsocketSource3 = mutex2;
                        Unit unit22 = Unit.INSTANCE;
                        dxWebsocketSource3.unlock(null);
                        return this.cachedToken;
                    }
                    if (websocketData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = websocketData;
                        DxSocketTokenResponse dxSocketTokenResponse2 = (DxSocketTokenResponse) obj;
                        error = dxSocketTokenResponse2.getError();
                        if (error == null) {
                        }
                        if (error != null) {
                        }
                        DxSocketTokenResponse.InnerResponse data22 = dxSocketTokenResponse2.getData();
                        this.cachedToken = data22 == null ? data22.getData() : null;
                        dxWebsocketSource3 = mutex2;
                        Unit unit222 = Unit.INSTANCE;
                        dxWebsocketSource3.unlock(null);
                        return this.cachedToken;
                    }
                    return coroutine_suspended;
                }
                dxWebsocketSource3 = mutex;
                Unit unit2222 = Unit.INSTANCE;
                dxWebsocketSource3.unlock(null);
                return this.cachedToken;
            } catch (Throwable th) {
                dxWebsocketSource3 = mutex;
                th = th;
                dxWebsocketSource3.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.robinhood.websocket.BaseWebsocketSource
    protected void onSubscriptionChanged(Set<? extends WebsocketTopic<? extends DxData>> addedTopics, Set<? extends WebsocketTopic<? extends DxData>> removedTopics) {
        Iterator<T> it = m2994x84b12847(addedTopics, removedTopics).iterator();
        while (it.hasNext()) {
            sendMessage((DxMessage) it.next());
        }
    }

    /* renamed from: generateMessagesFromSubscriptionChanged$lib_websocket_dx_externalDebug */
    public final List<DxMessage> m2994x84b12847(Set<? extends WebsocketTopic<? extends DxData>> addedTopics, Set<? extends WebsocketTopic<? extends DxData>> removedTopics) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        synchronized (this.domChannelMap) {
            if (addedTopics != null) {
                try {
                    Iterator<T> it = addedTopics.iterator();
                    while (it.hasNext()) {
                        WebsocketTopic websocketTopic = (WebsocketTopic) it.next();
                        if (websocketTopic instanceof DxTopic.DepthOfMarket) {
                            int i = this.nextAvailableDomChannel;
                            this.nextAvailableDomChannel = i + 2;
                            this.domChannelMap.put(((DxTopic.DepthOfMarket) websocketTopic).getContractSymbol(), Integer.valueOf(i));
                            arrayList.add(DxMessages.openDomChannelMessage(i, ((DxTopic.DepthOfMarket) websocketTopic).getContractSymbol(), ((DxTopic.DepthOfMarket) websocketTopic).getInstrumentType()));
                            this.messageHandler.setDomChannel(((DxTopic.DepthOfMarket) websocketTopic).getContractSymbol(), i);
                        } else if (websocketTopic instanceof DxTopic.Feed) {
                            Intrinsics.checkNotNull(websocketTopic, "null cannot be cast to non-null type com.robinhood.websocket.dx.DxTopic.Feed<com.robinhood.websocket.dx.models.DxFeedData>");
                            linkedHashSet.add((DxTopic.Feed) websocketTopic);
                        } else {
                            throw new IllegalArgumentException("Unrecognized topic: " + Reflection.getOrCreateKotlinClass(websocketTopic.getClass()));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (removedTopics != null) {
                Iterator<T> it2 = removedTopics.iterator();
                while (it2.hasNext()) {
                    WebsocketTopic websocketTopic2 = (WebsocketTopic) it2.next();
                    if (websocketTopic2 instanceof DxTopic.DepthOfMarket) {
                        Integer num = this.domChannelMap.get(((DxTopic.DepthOfMarket) websocketTopic2).getContractSymbol());
                        if (num != null) {
                            arrayList.add(DxMessages.closeChannelMessage(num.intValue()));
                        }
                    } else if (websocketTopic2 instanceof DxTopic.Feed) {
                        Intrinsics.checkNotNull(websocketTopic2, "null cannot be cast to non-null type com.robinhood.websocket.dx.DxTopic.Feed<com.robinhood.websocket.dx.models.DxFeedData>");
                        linkedHashSet2.add((DxTopic.Feed) websocketTopic2);
                    } else {
                        throw new IllegalArgumentException("Unrecognized topic: " + Reflection.getOrCreateKotlinClass(websocketTopic2.getClass()));
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
            return arrayList;
        }
        arrayList.add(DxMessages.updateFeedSubscriptionMessage(linkedHashSet, linkedHashSet2));
        return arrayList;
    }

    private final void onResponseReceived(DxResponse response) {
        if (response instanceof DxResponse.Setup) {
            DxResponse.Setup setup = (DxResponse.Setup) response;
            configureKeepAlive$lib_websocket_dx_externalDebug(setup.getAcceptKeepaliveTimeoutInMs(), setup.getKeepaliveTimeoutInMs());
            return;
        }
        if (response instanceof DxResponse.AuthState) {
            int i = WhenMappings.$EnumSwitchMapping$0[((DxResponse.AuthState) response).getState().ordinal()];
            if (i == 1) {
                launchWithLifecycle(new C420481(null));
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sendMessage(DxMessages.openFeedChannelMessage());
                return;
            }
        }
        if (response instanceof DxResponse.ChannelOpened) {
            DxResponse.ChannelOpened channelOpened = (DxResponse.ChannelOpened) response;
            if (channelOpened.getChannel() == 1) {
                sendMessage(DxMessages.configureChannelMessage(channelOpened.getChannel(), "FEED"));
                onSocketReady();
                return;
            } else {
                sendMessage(DxMessages.configureChannelMessage(channelOpened.getChannel(), DxConstants.DOM_SERVICE));
                return;
            }
        }
        if (response instanceof DxResponse.KeepAlive) {
            onKeepAliveReceived();
            return;
        }
        if (response instanceof DxResponse.Error) {
            DxResponse.Error error = (DxResponse.Error) response;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DxWebsocketError(error.getError(), error.getMessage()), false, null, 4, null);
            resetWebsocketConnection();
        } else if (!(response instanceof DxResponse.DomSnapshot) && !(response instanceof DxResponse.FeedDataResponse) && !(response instanceof DxResponse.IgnoredResponse)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DxWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.dx.DxWebsocketSource$onResponseReceived$1", m3645f = "DxWebsocketSource.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.dx.DxWebsocketSource$onResponseReceived$1 */
    static final class C420481 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C420481(Continuation<? super C420481> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DxWebsocketSource.this.new C420481(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420481) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DxWebsocketSource dxWebsocketSource = DxWebsocketSource.this;
                this.label = 1;
                obj = dxWebsocketSource.getToken$lib_websocket_dx_externalDebug(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DxSocketToken dxSocketToken = (DxSocketToken) obj;
            if (dxSocketToken != null) {
                DxWebsocketSource.this.sendMessage(DxMessages.authMessage(dxSocketToken.getToken()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessage(DxMessage message) {
        String json = this.messageAdapter.toJson(message);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        sendMessage(json);
    }

    public final void configureKeepAlive$lib_websocket_dx_externalDebug(long clientKeepAliveTimeoutInMs, long serverKeepAliveTimeoutInMs) {
        this.serverKeepAliveTimeout = Long.valueOf(serverKeepAliveTimeoutInMs);
        scheduleNextServerKeepAliveCheck();
        this.clientKeepAliveJob.setNewJob(launchWithLifecycle(new DxWebsocketSource2(clientKeepAliveTimeoutInMs, this, null)));
    }

    private final void onKeepAliveReceived() {
        scheduleNextServerKeepAliveCheck();
    }

    private final void scheduleNextServerKeepAliveCheck() {
        Long l = this.serverKeepAliveTimeout;
        if (l != null) {
            this.serverKeepAliveJob.setNewJob(launchWithLifecycle(new DxWebsocketSource4(l.longValue(), this, null)));
        }
    }

    /* compiled from: DxWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxWebsocketSource$DxWebsocketError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DxWebsocketError extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DxWebsocketError(String error, String msg) {
            super(error + " - " + msg);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(msg, "msg");
        }
    }
}
