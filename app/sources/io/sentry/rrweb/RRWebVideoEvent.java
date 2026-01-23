package io.sentry.rrweb;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class RRWebVideoEvent extends RRWebEvent implements JsonSerializable {
    private String container;
    private Map<String, Object> dataUnknown;
    private long durationMs;

    /* renamed from: encoding, reason: collision with root package name */
    private String f10724encoding;
    private int frameCount;
    private int frameRate;
    private String frameRateType;
    private int height;
    private int left;
    private Map<String, Object> payloadUnknown;
    private int segmentId;
    private long size;
    private String tag;
    private int top;
    private Map<String, Object> unknown;
    private int width;

    public RRWebVideoEvent() {
        super(RRWebEventType.Custom);
        this.f10724encoding = "h264";
        this.container = "mp4";
        this.frameRateType = "constant";
        this.tag = "video";
    }

    public void setPayloadUnknown(Map<String, Object> map) {
        this.payloadUnknown = map;
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RRWebVideoEvent.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        RRWebVideoEvent rRWebVideoEvent = (RRWebVideoEvent) obj;
        return this.segmentId == rRWebVideoEvent.segmentId && this.size == rRWebVideoEvent.size && this.durationMs == rRWebVideoEvent.durationMs && this.height == rRWebVideoEvent.height && this.width == rRWebVideoEvent.width && this.frameCount == rRWebVideoEvent.frameCount && this.frameRate == rRWebVideoEvent.frameRate && this.left == rRWebVideoEvent.left && this.top == rRWebVideoEvent.top && Objects.equals(this.tag, rRWebVideoEvent.tag) && Objects.equals(this.f10724encoding, rRWebVideoEvent.f10724encoding) && Objects.equals(this.container, rRWebVideoEvent.container) && Objects.equals(this.frameRateType, rRWebVideoEvent.frameRateType);
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.tag, Integer.valueOf(this.segmentId), Long.valueOf(this.size), Long.valueOf(this.durationMs), this.f10724encoding, this.container, Integer.valueOf(this.height), Integer.valueOf(this.width), Integer.valueOf(this.frameCount), this.frameRateType, Integer.valueOf(this.frameRate), Integer.valueOf(this.left), Integer.valueOf(this.top));
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
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
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

    private void serializePayload(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("segmentId").value(this.segmentId);
        objectWriter.name("size").value(this.size);
        objectWriter.name("duration").value(this.durationMs);
        objectWriter.name("encoding").value(this.f10724encoding);
        objectWriter.name("container").value(this.container);
        objectWriter.name("height").value(this.height);
        objectWriter.name("width").value(this.width);
        objectWriter.name("frameCount").value(this.frameCount);
        objectWriter.name("frameRate").value(this.frameRate);
        objectWriter.name("frameRateType").value(this.frameRateType);
        objectWriter.name("left").value(this.left);
        objectWriter.name("top").value(this.top);
        Map<String, Object> map = this.payloadUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.payloadUnknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public static final class Deserializer implements JsonDeserializer<RRWebVideoEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebVideoEvent deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            RRWebVideoEvent rRWebVideoEvent = new RRWebVideoEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(WebsocketGatewayConstants.DATA_KEY)) {
                    deserializeData(rRWebVideoEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebVideoEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebVideoEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebVideoEvent;
        }

        private void deserializeData(RRWebVideoEvent rRWebVideoEvent, ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebVideoEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebVideoEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebVideoEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void deserializePayload(RRWebVideoEvent rRWebVideoEvent, ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                char c = 65535;
                switch (strNextName.hashCode()) {
                    case -1992012396:
                        if (strNextName.equals("duration")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1627805778:
                        if (strNextName.equals("segmentId")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -410956671:
                        if (strNextName.equals("container")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -296512606:
                        if (strNextName.equals("frameCount")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 115029:
                        if (strNextName.equals("top")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3317767:
                        if (strNextName.equals("left")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3530753:
                        if (strNextName.equals("size")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 545057773:
                        if (strNextName.equals("frameRate")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1711222099:
                        if (strNextName.equals("encoding")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 2135109831:
                        if (strNextName.equals("frameRateType")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        rRWebVideoEvent.durationMs = objectReader.nextLong();
                        break;
                    case 1:
                        rRWebVideoEvent.segmentId = objectReader.nextInt();
                        break;
                    case 2:
                        Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.height = numNextIntegerOrNull != null ? numNextIntegerOrNull.intValue() : 0;
                        break;
                    case 3:
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        rRWebVideoEvent.container = strNextStringOrNull != null ? strNextStringOrNull : "";
                        break;
                    case 4:
                        Integer numNextIntegerOrNull2 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameCount = numNextIntegerOrNull2 != null ? numNextIntegerOrNull2.intValue() : 0;
                        break;
                    case 5:
                        Integer numNextIntegerOrNull3 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.top = numNextIntegerOrNull3 != null ? numNextIntegerOrNull3.intValue() : 0;
                        break;
                    case 6:
                        Integer numNextIntegerOrNull4 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.left = numNextIntegerOrNull4 != null ? numNextIntegerOrNull4.intValue() : 0;
                        break;
                    case 7:
                        Long lNextLongOrNull = objectReader.nextLongOrNull();
                        rRWebVideoEvent.size = lNextLongOrNull == null ? 0L : lNextLongOrNull.longValue();
                        break;
                    case '\b':
                        Integer numNextIntegerOrNull5 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.width = numNextIntegerOrNull5 != null ? numNextIntegerOrNull5.intValue() : 0;
                        break;
                    case '\t':
                        Integer numNextIntegerOrNull6 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameRate = numNextIntegerOrNull6 != null ? numNextIntegerOrNull6.intValue() : 0;
                        break;
                    case '\n':
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.f10724encoding = strNextStringOrNull2 != null ? strNextStringOrNull2 : "";
                        break;
                    case 11:
                        String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.frameRateType = strNextStringOrNull3 != null ? strNextStringOrNull3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebVideoEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }
    }
}
