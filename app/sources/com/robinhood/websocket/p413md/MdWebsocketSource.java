package com.robinhood.websocket.p413md;

import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.BaseWebsocketSource;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.p413md.MdTopic;
import com.robinhood.websocket.p413md.models.MarketData;
import com.robinhood.websocket.p413md.models.MdMessage;
import com.robinhood.websocket.p413md.models.MdResponse;
import com.robinhood.websocket.p413md.p414di.MdMoshi;
import com.robinhood.websocket.p413md.utils.MdMessages;
import com.robinhood.websocket.utils.SingleInstanceJob;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MdWebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010\u0017J4\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0018\u00010\u001b2\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0018\u00010\u001bH\u0014J?\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0018\u00010\u001b2\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0018\u00010\u001bH\u0001¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0014H\u0002J\u001d\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0001¢\u0006\u0002\b.J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*¨\u00062"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdWebsocketSource;", "Lcom/robinhood/websocket/BaseWebsocketSource;", "Lcom/robinhood/websocket/md/models/MdResponse;", "Lcom/robinhood/websocket/md/models/MarketData;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/md/MdMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/md/MdWebsocketConnectionManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/websocket/md/MdMessageHandler;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/websocket/md/MdWebsocketConnectionManager;Lcom/robinhood/targetbackend/TargetBackend;)V", "messageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/websocket/md/models/MdMessage;", "getWebsocketUrl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscriptionChanged", "", "addedTopics", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "removedTopics", "generateMessagesFromSubscriptionChanged", "", "generateMessagesFromSubscriptionChanged$lib_websocket_md_externalDebug", "onResponseReceived", "response", "sendMessage", "message", "clientKeepAliveJob", "Lcom/robinhood/websocket/utils/SingleInstanceJob;", "serverKeepAliveJob", "serverKeepAliveTimeout", "", "Ljava/lang/Long;", "configureKeepAlive", "clientKeepAliveTimeoutInMs", "serverKeepAliveTimeoutInMs", "configureKeepAlive$lib_websocket_md_externalDebug", "onKeepAliveReceived", "scheduleNextServerKeepAliveCheck", "MdWebsocketError", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MdWebsocketSource extends BaseWebsocketSource<MdResponse, MarketData> {
    private final SingleInstanceJob clientKeepAliveJob;
    private final JsonAdapter<MdMessage> messageAdapter;
    private final MdMessageHandler messageHandler;
    private final ReleaseVersion releaseVersion;
    private final SingleInstanceJob serverKeepAliveJob;
    private Long serverKeepAliveTimeout;
    private final TargetBackend targetBackend;

    /* compiled from: MdWebsocketSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MdResponse.AuthState.State.values().length];
            try {
                iArr[MdResponse.AuthState.State.UNAUTHORIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MdResponse.AuthState.State.AUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MdWebsocketSource(ReleaseVersion releaseVersion, @RootCoroutineScope CoroutineScope rootCoroutineScope, MdMessageHandler messageHandler, @MdMoshi LazyMoshi moshi, MdWebsocketConnectionManager connectionManager, TargetBackend targetBackend) {
        super(MdConstants.INSTANCE.getCONFIGURATION(), rootCoroutineScope, messageHandler, connectionManager, null, 16, null);
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.releaseVersion = releaseVersion;
        this.messageHandler = messageHandler;
        this.targetBackend = targetBackend;
        Types types = Types.INSTANCE;
        this.messageAdapter = moshi.adapter(new TypeToken<MdMessage>() { // from class: com.robinhood.websocket.md.MdWebsocketSource$special$$inlined$getAdapter$1
        }.getType());
        addConnectionOpenListener(new Function0() { // from class: com.robinhood.websocket.md.MdWebsocketSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MdWebsocketSource._init_$lambda$0(this.f$0);
            }
        });
        addMessageListener(new Function1() { // from class: com.robinhood.websocket.md.MdWebsocketSource$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MdWebsocketSource._init_$lambda$1(this.f$0, (MdResponse) obj);
            }
        });
        this.clientKeepAliveJob = new SingleInstanceJob();
        this.serverKeepAliveJob = new SingleInstanceJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(MdWebsocketSource mdWebsocketSource) {
        mdWebsocketSource.sendMessage(MdMessages.setupMessage(mdWebsocketSource.releaseVersion.getVersionName()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MdWebsocketSource mdWebsocketSource, MdResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        mdWebsocketSource.onResponseReceived(response);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.websocket.BaseWebsocketSource
    protected Object getWebsocketUrl(Continuation<? super String> continuation) {
        String websocketUrl;
        synchronized (this) {
            websocketUrl = MdConstants.INSTANCE.getWebsocketUrl(this.targetBackend);
        }
        return websocketUrl;
    }

    @Override // com.robinhood.websocket.BaseWebsocketSource
    protected void onSubscriptionChanged(Set<? extends WebsocketTopic<? extends MarketData>> addedTopics, Set<? extends WebsocketTopic<? extends MarketData>> removedTopics) {
        Iterator<T> it = m2995x6dada80a(addedTopics, removedTopics).iterator();
        while (it.hasNext()) {
            sendMessage((MdMessage) it.next());
        }
    }

    /* renamed from: generateMessagesFromSubscriptionChanged$lib_websocket_md_externalDebug */
    public final List<MdMessage> m2995x6dada80a(Set<? extends WebsocketTopic<? extends MarketData>> addedTopics, Set<? extends WebsocketTopic<? extends MarketData>> removedTopics) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (addedTopics != null) {
            Iterator<T> it = addedTopics.iterator();
            while (it.hasNext()) {
                WebsocketTopic websocketTopic = (WebsocketTopic) it.next();
                if (!(websocketTopic instanceof MdTopic.Feed)) {
                    throw new IllegalArgumentException("Unrecognized topic: " + Reflection.getOrCreateKotlinClass(websocketTopic.getClass()));
                }
                Intrinsics.checkNotNull(websocketTopic, "null cannot be cast to non-null type com.robinhood.websocket.md.MdTopic.Feed<com.robinhood.websocket.md.models.MdFeedData>");
                linkedHashSet.add((MdTopic.Feed) websocketTopic);
            }
        }
        if (removedTopics != null) {
            Iterator<T> it2 = removedTopics.iterator();
            while (it2.hasNext()) {
                WebsocketTopic websocketTopic2 = (WebsocketTopic) it2.next();
                if (!(websocketTopic2 instanceof MdTopic.Feed)) {
                    throw new IllegalArgumentException("Unrecognized topic: " + Reflection.getOrCreateKotlinClass(websocketTopic2.getClass()));
                }
                Intrinsics.checkNotNull(websocketTopic2, "null cannot be cast to non-null type com.robinhood.websocket.md.MdTopic.Feed<com.robinhood.websocket.md.models.MdFeedData>");
                linkedHashSet2.add((MdTopic.Feed) websocketTopic2);
            }
        }
        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
            return arrayList;
        }
        arrayList.add(MdMessages.updateFeedSubscriptionMessage(linkedHashSet, linkedHashSet2));
        return arrayList;
    }

    private final void onResponseReceived(MdResponse response) {
        if (response instanceof MdResponse.Setup) {
            MdResponse.Setup setup = (MdResponse.Setup) response;
            configureKeepAlive$lib_websocket_md_externalDebug(setup.getAcceptKeepAliveTimeoutInMs(), setup.getKeepAliveTimeoutInMs());
            return;
        }
        if (response instanceof MdResponse.AuthState) {
            int i = WhenMappings.$EnumSwitchMapping$0[((MdResponse.AuthState) response).getState().ordinal()];
            if (i == 1) {
                sendMessage(MdMessages.authMessage("token"));
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sendMessage(MdMessages.getSetupLoggingMessage());
                sendMessage(MdMessages.getOpenFeedChannelMessage());
                return;
            }
        }
        if (response instanceof MdResponse.ChannelOpened) {
            if (((MdResponse.ChannelOpened) response).getChannel() == 1) {
                sendMessage(MdMessages.getFeedSetupMessage());
                onSocketReady();
                return;
            }
            return;
        }
        if (response instanceof MdResponse.KeepAlive) {
            onKeepAliveReceived();
            return;
        }
        if (response instanceof MdResponse.Error) {
            MdResponse.Error error = (MdResponse.Error) response;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new MdWebsocketError(error.getError(), error.getMessage()), false, null, 6, null);
            resetWebsocketConnection();
        } else if (!(response instanceof MdResponse.FeedConfig) && !(response instanceof MdResponse.FeedDataResponse) && !(response instanceof MdResponse.IgnoredResponse) && !(response instanceof MdResponse.ChannelClosed) && !(response instanceof MdResponse.StatusResponse)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessage(MdMessage message) {
        String json = this.messageAdapter.toJson(message);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        sendMessage(json);
    }

    public final void configureKeepAlive$lib_websocket_md_externalDebug(long clientKeepAliveTimeoutInMs, long serverKeepAliveTimeoutInMs) {
        this.serverKeepAliveTimeout = Long.valueOf(serverKeepAliveTimeoutInMs);
        scheduleNextServerKeepAliveCheck();
        this.clientKeepAliveJob.setNewJob(launchWithLifecycle(new MdWebsocketSource2(clientKeepAliveTimeoutInMs, this, null)));
    }

    private final void onKeepAliveReceived() {
        scheduleNextServerKeepAliveCheck();
    }

    private final void scheduleNextServerKeepAliveCheck() {
        Long l = this.serverKeepAliveTimeout;
        if (l != null) {
            this.serverKeepAliveJob.setNewJob(launchWithLifecycle(new MdWebsocketSource3(l.longValue(), this, null)));
        }
    }

    /* compiled from: MdWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdWebsocketSource$MdWebsocketError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class MdWebsocketError extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MdWebsocketError(String error, String msg) {
            super(error + " - " + msg);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(msg, "msg");
        }
    }
}
