package com.robinhood.websocket.gateway.utils;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import com.robinhood.websocket.gateway.models.WebsocketGatewayResponse;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import p479j$.util.Base64;

/* compiled from: WebsocketGatewayResponseJsonAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/utils/WebsocketGatewayResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;", "Lcom/squareup/moshi/JsonWriter;", "p0", "p1", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;)V", "j$/util/Base64.Decoder", "kotlin.jvm.PlatformType", "base64Decoder", "Lj$/util/Base64$Decoder;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;", "futuresOrderUpdateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WebsocketGatewayResponseJsonAdapter extends JsonAdapter<WebsocketGatewayResponse> {
    private final Base64.Decoder base64Decoder;
    private final JsonAdapter<WebsocketGatewayData.FuturesOrderUpdateData> futuresOrderUpdateAdapter;

    public WebsocketGatewayResponseJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.base64Decoder = Base64.getDecoder();
        Types types = Types.INSTANCE;
        JsonAdapter<WebsocketGatewayData.FuturesOrderUpdateData> jsonAdapterAdapter = moshi.adapter(new TypeToken<WebsocketGatewayData.FuturesOrderUpdateData>() { // from class: com.robinhood.websocket.gateway.utils.WebsocketGatewayResponseJsonAdapter$special$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.futuresOrderUpdateAdapter = jsonAdapterAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public WebsocketGatewayResponse fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1011591314) {
                    if (iHashCode != 3076010) {
                        if (iHashCode == 110546223 && strNextName.equals(WebsocketGatewayConstants.TOPIC_KEY)) {
                            strNextString = reader.nextString();
                        }
                    } else if (strNextName.equals(WebsocketGatewayConstants.DATA_KEY)) {
                        strNextString2 = reader.nextString();
                    }
                } else if (strNextName.equals(WebsocketGatewayConstants.OPCODE_KEY)) {
                    numValueOf = Integer.valueOf(reader.nextInt());
                }
            }
            reader.skipValue();
        }
        Unit unit = Unit.INSTANCE;
        reader.endObject();
        if (numValueOf == null) {
            throw new IllegalStateException("Expected opCode in the JSON response.");
        }
        if (numValueOf.intValue() != 1) {
            if (numValueOf.intValue() == 10) {
                return WebsocketGatewayResponse.Pong.INSTANCE;
            }
            return null;
        }
        if (strNextString == null) {
            throw new IllegalStateException("Expected topic for opCode=1");
        }
        if (!Intrinsics.areEqual(strNextString, WebsocketGatewayConstants.TOPIC_FUTURES_ORDER_UPDATE)) {
            return null;
        }
        byte[] bArrDecode = this.base64Decoder.decode(strNextString2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        String str = new String(bArrDecode, Charsets.UTF_8);
        WebsocketGatewayData.FuturesOrderUpdateData futuresOrderUpdateDataFromJson = this.futuresOrderUpdateAdapter.fromJson(str);
        if (futuresOrderUpdateDataFromJson != null) {
            return new WebsocketGatewayResponse.EventResponse(futuresOrderUpdateDataFromJson);
        }
        throw new IllegalStateException(("Failed to parse " + str + " into FuturesOrderUpdateData").toString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter p0, WebsocketGatewayResponse p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        throw new IllegalStateException("Should never need to convert WebsocketGatewayResponse into JSON.");
    }
}
