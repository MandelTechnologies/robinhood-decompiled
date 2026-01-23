package com.robinhood.websocket.p410dx;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.api.WebsocketMessageHandler;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.p410dx.DxTopic;
import com.robinhood.websocket.p410dx.models.DxData;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxResponse;
import com.robinhood.websocket.p410dx.p411di.DxMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DxMessageHandler.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\rJ/\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxMessageHandler;", "Lcom/robinhood/websocket/api/WebsocketMessageHandler;", "Lcom/robinhood/websocket/dx/models/DxResponse;", "Lcom/robinhood/websocket/dx/models/DxData;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "responseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "domChannelMap", "", "", "", "deserialize", "message", "setDomChannel", "", "symbol", "channel", "extractMessageForTopic", "T", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/api/WebsocketTopic;", "(Lcom/robinhood/websocket/dx/models/DxResponse;Lcom/robinhood/websocket/api/WebsocketTopic;)Lcom/robinhood/websocket/dx/models/DxData;", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DxMessageHandler implements WebsocketMessageHandler<DxResponse, DxData> {
    private final Map<String, Integer> domChannelMap;
    private final JsonAdapter<DxResponse> responseAdapter;

    public DxMessageHandler(@DxMoshi LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        this.responseAdapter = moshi.adapter(new TypeToken<DxResponse>() { // from class: com.robinhood.websocket.dx.DxMessageHandler$special$$inlined$getAdapter$1
        }.getType());
        this.domChannelMap = new LinkedHashMap();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.websocket.api.WebsocketMessageHandler
    public DxResponse deserialize(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.responseAdapter.fromJson(message);
    }

    public final synchronized void setDomChannel(String symbol, int channel) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.domChannelMap.put(symbol, Integer.valueOf(channel));
    }

    @Override // com.robinhood.websocket.api.WebsocketMessageHandler
    public <T extends DxData> T extractMessageForTopic(DxResponse message, WebsocketTopic<? extends T> topic) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Object obj = null;
        if (topic instanceof DxTopic.DepthOfMarket) {
            if (message instanceof DxResponse.DomSnapshot) {
                Integer num = this.domChannelMap.get(((DxTopic.DepthOfMarket) topic).getContractSymbol());
                int channel = ((DxResponse.DomSnapshot) message).getChannel();
                if (num != null && num.intValue() == channel) {
                    return (T) message;
                }
            }
            return null;
        }
        if (topic instanceof DxTopic.Feed.Quote) {
            if (!(message instanceof DxResponse.FeedDataResponse)) {
                return null;
            }
            Iterator<T> it = ((DxResponse.FeedDataResponse) message).getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                DxFeedData dxFeedData = (DxFeedData) next;
                if ((dxFeedData instanceof DxFeedData.Quote) && Intrinsics.areEqual(((DxFeedData.Quote) dxFeedData).getEventSymbol(), ((DxTopic.Feed.Quote) topic).getSymbol())) {
                    obj = next;
                    break;
                }
            }
            return (T) obj;
        }
        if (topic instanceof DxTopic.Feed.LastTrade) {
            if (!(message instanceof DxResponse.FeedDataResponse)) {
                return null;
            }
            Iterator<T> it2 = ((DxResponse.FeedDataResponse) message).getData().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                DxFeedData dxFeedData2 = (DxFeedData) next2;
                if ((dxFeedData2 instanceof DxFeedData.Trade) && Intrinsics.areEqual(((DxFeedData.Trade) dxFeedData2).getEventSymbol(), ((DxTopic.Feed.LastTrade) topic).getSymbol())) {
                    obj = next2;
                    break;
                }
            }
            return (T) obj;
        }
        throw new IllegalArgumentException("Invalid topic for DxWebsocket: " + Reflection.getOrCreateKotlinClass(topic.getClass()));
    }
}
