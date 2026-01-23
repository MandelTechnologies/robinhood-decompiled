package io.sentry.rrweb;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public final class RRWebInteractionMoveEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable {
    private Map<String, Object> dataUnknown;
    private int pointerId;
    private List<Position> positions;
    private Map<String, Object> unknown;

    /* loaded from: classes14.dex */
    public static final class Position implements JsonSerializable {

        /* renamed from: id */
        private int f6652id;
        private long timeOffset;
        private Map<String, Object> unknown;

        /* renamed from: x */
        private float f6653x;

        /* renamed from: y */
        private float f6654y;

        public void setUnknown(Map<String, Object> map) {
            this.unknown = map;
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
            objectWriter.beginObject();
            objectWriter.name("id").value(this.f6652id);
            objectWriter.name("x").value(this.f6653x);
            objectWriter.name("y").value(this.f6654y);
            objectWriter.name("timeOffset").value(this.timeOffset);
            Map<String, Object> map = this.unknown;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.unknown.get(str);
                    objectWriter.name(str);
                    objectWriter.value(iLogger, obj);
                }
            }
            objectWriter.endObject();
        }

        public static final class Deserializer implements JsonDeserializer<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public Position deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
                String strNextName;
                objectReader.beginObject();
                Position position = new Position();
                HashMap map = null;
                while (objectReader.peek() == JsonToken.NAME) {
                    strNextName = objectReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            position.f6653x = objectReader.nextFloat();
                            break;
                        case "y":
                            position.f6654y = objectReader.nextFloat();
                            break;
                        case "id":
                            position.f6652id = objectReader.nextInt();
                            break;
                        case "timeOffset":
                            position.timeOffset = objectReader.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                    }
                }
                position.setUnknown(map);
                objectReader.endObject();
                return position;
            }
        }
    }

    public RRWebInteractionMoveEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name(WebsocketGatewayConstants.DATA_KEY);
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        List<Position> list = this.positions;
        if (list != null && !list.isEmpty()) {
            objectWriter.name("positions").value(iLogger, this.positions);
        }
        objectWriter.name("pointerId").value(this.pointerId);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.dataUnknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public static final class Deserializer implements JsonDeserializer<RRWebInteractionMoveEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebInteractionMoveEvent deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(WebsocketGatewayConstants.DATA_KEY)) {
                    deserializeData(rRWebInteractionMoveEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionMoveEvent;
        }

        private void deserializeData(RRWebInteractionMoveEvent rRWebInteractionMoveEvent, ObjectReader objectReader, ILogger iLogger) throws Exception {
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    rRWebInteractionMoveEvent.pointerId = objectReader.nextInt();
                } else if (strNextName.equals("positions")) {
                    rRWebInteractionMoveEvent.positions = objectReader.nextListOrNull(iLogger, new Position.Deserializer());
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setDataUnknown(map);
            objectReader.endObject();
        }
    }
}
