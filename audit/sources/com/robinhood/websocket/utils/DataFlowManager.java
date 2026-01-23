package com.robinhood.websocket.utils;

import com.robinhood.websocket.api.WebsocketMessageHandler;
import com.robinhood.websocket.api.WebsocketMessageListener;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: DataFlowManager.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u001f B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0010\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00010\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/websocket/utils/DataFlowManager;", "ResponseT", "DataT", "Lcom/robinhood/websocket/api/WebsocketMessageListener;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/api/WebsocketMessageHandler;", "timeProvider", "Lcom/robinhood/websocket/utils/TimeProvider;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/websocket/api/WebsocketMessageHandler;Lcom/robinhood/websocket/utils/TimeProvider;)V", "dataStateMap", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "Lcom/robinhood/websocket/utils/DataFlowManager$TopicState;", "cachedValues", "Lcom/robinhood/websocket/utils/DataFlowManager$CachedValue;", "getDataFlow", "Lkotlinx/coroutines/flow/Flow;", "T", WebsocketGatewayConstants.TOPIC_KEY, "dataSubscriptionTimeout", "", "subscriptionListener", "Lcom/robinhood/websocket/utils/DataFlowSubscriptionListener;", "removeDataFlow", "", "onMessageReceived", "message", "(Ljava/lang/Object;)V", "TopicState", "CachedValue", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DataFlowManager<ResponseT, DataT> implements WebsocketMessageListener<ResponseT> {
    private final Map<WebsocketTopic<DataT>, DataFlowManager<ResponseT, DataT>.CachedValue<DataT>> cachedValues;
    private final CoroutineScope coroutineScope;
    private final Map<WebsocketTopic<DataT>, TopicState<DataT>> dataStateMap;
    private final WebsocketMessageHandler<ResponseT, DataT> messageHandler;
    private final DataFlowManager6 timeProvider;

    public DataFlowManager(CoroutineScope coroutineScope, WebsocketMessageHandler<ResponseT, DataT> messageHandler, DataFlowManager6 timeProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.coroutineScope = coroutineScope;
        this.messageHandler = messageHandler;
        this.timeProvider = timeProvider;
        this.dataStateMap = new LinkedHashMap();
        this.cachedValues = new LinkedHashMap();
    }

    public final <T extends DataT> Flow<T> getDataFlow(WebsocketTopic<? extends T> topic, long dataSubscriptionTimeout, DataFlowManager5<DataT> subscriptionListener) {
        Flow<T> dataFlow;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(subscriptionListener, "subscriptionListener");
        synchronized (this.dataStateMap) {
            try {
                Map<WebsocketTopic<DataT>, TopicState<DataT>> map = this.dataStateMap;
                TopicState<DataT> topicState = map.get(topic);
                if (topicState == null) {
                    SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                    SingleInstanceJob singleInstanceJob = new SingleInstanceJob();
                    TopicState<DataT> topicState2 = new TopicState<>(sharedFlow2MutableSharedFlow$default, FlowKt.launchIn(FlowKt.onEach(sharedFlow2MutableSharedFlow$default.getSubscriptionCount(), new DataFlowManager3(subscriptionListener, topic, singleInstanceJob, this, dataSubscriptionTimeout, null)), this.coroutineScope), singleInstanceJob);
                    map.put(topic, topicState2);
                    topicState = topicState2;
                }
                TopicState<DataT> topicState3 = topicState;
                DataFlowManager<ResponseT, DataT>.CachedValue<DataT> cachedValue = this.cachedValues.get(topic);
                if (topic.getCacheLatestValue() && cachedValue != null && cachedValue.isValid(topic.getCacheTimeoutMs())) {
                    dataFlow = FlowKt.flow(new DataFlowManager2(cachedValue, topicState3, null));
                } else {
                    dataFlow = topicState3.getDataFlow();
                    Intrinsics.checkNotNull(dataFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of com.robinhood.websocket.utils.DataFlowManager.getDataFlow>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDataFlow(WebsocketTopic<?> topic) {
        SingleInstanceJob pendingCancelJob;
        Job subscriptionJob;
        synchronized (this.dataStateMap) {
            try {
                TopicState topicState = (TopicState) TypeIntrinsics.asMutableMap(this.dataStateMap).remove(topic);
                if (topicState != null && (subscriptionJob = topicState.getSubscriptionJob()) != null) {
                    Job.DefaultImpls.cancel$default(subscriptionJob, null, 1, null);
                }
                if (topicState != null && (pendingCancelJob = topicState.getPendingCancelJob()) != null) {
                    pendingCancelJob.setNewJob(null);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.robinhood.websocket.api.WebsocketMessageListener
    public void onMessageReceived(ResponseT message) {
        synchronized (this.dataStateMap) {
            try {
                for (Map.Entry<WebsocketTopic<DataT>, TopicState<DataT>> entry : this.dataStateMap.entrySet()) {
                    WebsocketTopic<DataT> key = entry.getKey();
                    TopicState<DataT> value = entry.getValue();
                    Object objExtractMessageForTopic = this.messageHandler.extractMessageForTopic(message, key);
                    if (objExtractMessageForTopic != null) {
                        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DataFlowManager4(value, objExtractMessageForTopic, null), 3, null);
                        if (key.getCacheLatestValue()) {
                            this.cachedValues.put(key, new CachedValue<>(objExtractMessageForTopic));
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: DataFlowManager.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/websocket/utils/DataFlowManager$TopicState;", "DataT", "", "dataFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "subscriptionJob", "Lkotlinx/coroutines/Job;", "pendingCancelJob", "Lcom/robinhood/websocket/utils/SingleInstanceJob;", "<init>", "(Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/Job;Lcom/robinhood/websocket/utils/SingleInstanceJob;)V", "getDataFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSubscriptionJob", "()Lkotlinx/coroutines/Job;", "getPendingCancelJob", "()Lcom/robinhood/websocket/utils/SingleInstanceJob;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopicState<DataT> {
        private final SharedFlow2<DataT> dataFlow;
        private final SingleInstanceJob pendingCancelJob;
        private final Job subscriptionJob;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TopicState copy$default(TopicState topicState, SharedFlow2 sharedFlow2, Job job, SingleInstanceJob singleInstanceJob, int i, Object obj) {
            if ((i & 1) != 0) {
                sharedFlow2 = topicState.dataFlow;
            }
            if ((i & 2) != 0) {
                job = topicState.subscriptionJob;
            }
            if ((i & 4) != 0) {
                singleInstanceJob = topicState.pendingCancelJob;
            }
            return topicState.copy(sharedFlow2, job, singleInstanceJob);
        }

        public final SharedFlow2<DataT> component1() {
            return this.dataFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final Job getSubscriptionJob() {
            return this.subscriptionJob;
        }

        /* renamed from: component3, reason: from getter */
        public final SingleInstanceJob getPendingCancelJob() {
            return this.pendingCancelJob;
        }

        public final TopicState<DataT> copy(SharedFlow2<DataT> dataFlow, Job subscriptionJob, SingleInstanceJob pendingCancelJob) {
            Intrinsics.checkNotNullParameter(dataFlow, "dataFlow");
            Intrinsics.checkNotNullParameter(subscriptionJob, "subscriptionJob");
            Intrinsics.checkNotNullParameter(pendingCancelJob, "pendingCancelJob");
            return new TopicState<>(dataFlow, subscriptionJob, pendingCancelJob);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopicState)) {
                return false;
            }
            TopicState topicState = (TopicState) other;
            return Intrinsics.areEqual(this.dataFlow, topicState.dataFlow) && Intrinsics.areEqual(this.subscriptionJob, topicState.subscriptionJob) && Intrinsics.areEqual(this.pendingCancelJob, topicState.pendingCancelJob);
        }

        public int hashCode() {
            return (((this.dataFlow.hashCode() * 31) + this.subscriptionJob.hashCode()) * 31) + this.pendingCancelJob.hashCode();
        }

        public String toString() {
            return "TopicState(dataFlow=" + this.dataFlow + ", subscriptionJob=" + this.subscriptionJob + ", pendingCancelJob=" + this.pendingCancelJob + ")";
        }

        public TopicState(SharedFlow2<DataT> dataFlow, Job subscriptionJob, SingleInstanceJob pendingCancelJob) {
            Intrinsics.checkNotNullParameter(dataFlow, "dataFlow");
            Intrinsics.checkNotNullParameter(subscriptionJob, "subscriptionJob");
            Intrinsics.checkNotNullParameter(pendingCancelJob, "pendingCancelJob");
            this.dataFlow = dataFlow;
            this.subscriptionJob = subscriptionJob;
            this.pendingCancelJob = pendingCancelJob;
        }

        public final SharedFlow2<DataT> getDataFlow() {
            return this.dataFlow;
        }

        public final Job getSubscriptionJob() {
            return this.subscriptionJob;
        }

        public final SingleInstanceJob getPendingCancelJob() {
            return this.pendingCancelJob;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataFlowManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0013\u0010\u0003\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/websocket/utils/DataFlowManager$CachedValue;", "DataT", "", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lcom/robinhood/websocket/utils/DataFlowManager;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "cachedTime", "", "getCachedTime", "()J", "isValid", "", "timeout", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class CachedValue<DataT> {
        private final long cachedTime;
        private final DataT data;

        public final DataT getData() {
            return this.data;
        }

        public final long getCachedTime() {
            return this.cachedTime;
        }

        public CachedValue(DataT datat) {
            this.data = datat;
            this.cachedTime = DataFlowManager.this.timeProvider.elapsedRealtime();
        }

        public final boolean isValid(long timeout) {
            return ((DataFlowManager) DataFlowManager.this).timeProvider.elapsedRealtime() - this.cachedTime <= timeout;
        }
    }
}
