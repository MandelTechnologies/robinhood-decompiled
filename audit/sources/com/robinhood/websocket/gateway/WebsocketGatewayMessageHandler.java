package com.robinhood.websocket.gateway;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.api.WebsocketMessageHandler;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.WebsocketGatewayTopic;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import com.robinhood.websocket.gateway.models.WebsocketGatewayResponse;
import com.robinhood.websocket.gateway.p412di.WebsocketGatewayMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WebsocketGatewayMessageHandler.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J/\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewayMessageHandler;", "Lcom/robinhood/websocket/api/WebsocketMessageHandler;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "responseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "deserialize", "message", "", "extractMessageForTopic", "T", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/api/WebsocketTopic;", "(Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;Lcom/robinhood/websocket/api/WebsocketTopic;)Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData;", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WebsocketGatewayMessageHandler implements WebsocketMessageHandler<WebsocketGatewayResponse, WebsocketGatewayData> {
    private final JsonAdapter<WebsocketGatewayResponse> responseAdapter;

    public WebsocketGatewayMessageHandler(@WebsocketGatewayMoshi LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        this.responseAdapter = moshi.adapter(new TypeToken<WebsocketGatewayResponse>() { // from class: com.robinhood.websocket.gateway.WebsocketGatewayMessageHandler$special$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.websocket.api.WebsocketMessageHandler
    public WebsocketGatewayResponse deserialize(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.responseAdapter.fromJson(message);
    }

    @Override // com.robinhood.websocket.api.WebsocketMessageHandler
    public <T extends WebsocketGatewayData> T extractMessageForTopic(WebsocketGatewayResponse message, WebsocketTopic<? extends T> topic) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(topic, "topic");
        if ((topic instanceof WebsocketGatewayTopic.FuturesOrderUpdates) && (message instanceof WebsocketGatewayResponse.EventResponse)) {
            WebsocketGatewayResponse.EventResponse eventResponse = (WebsocketGatewayResponse.EventResponse) message;
            if (eventResponse.getData() instanceof WebsocketGatewayData.FuturesOrderUpdateData) {
                T t = (T) eventResponse.getData();
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.robinhood.websocket.gateway.WebsocketGatewayMessageHandler.extractMessageForTopic");
                return t;
            }
        }
        return null;
    }
}
