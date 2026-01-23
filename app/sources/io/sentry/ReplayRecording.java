package io.sentry;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.MapObjectReader;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public final class ReplayRecording implements JsonSerializable {
    private List<? extends RRWebEvent> payload;
    private Integer segmentId;
    private Map<String, Object> unknown;

    public void setSegmentId(Integer num) {
        this.segmentId = num;
    }

    public void setPayload(List<? extends RRWebEvent> list) {
        this.payload = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ReplayRecording.class == obj.getClass()) {
            ReplayRecording replayRecording = (ReplayRecording) obj;
            if (Objects.equals(this.segmentId, replayRecording.segmentId) && Objects.equals(this.payload, replayRecording.payload)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.segmentId, this.payload);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        if (this.segmentId != null) {
            objectWriter.name("segment_id").value(this.segmentId);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
        objectWriter.setLenient(true);
        if (this.segmentId != null) {
            objectWriter.jsonValue("\n");
        }
        List<? extends RRWebEvent> list = this.payload;
        if (list != null) {
            objectWriter.value(iLogger, list);
        }
        objectWriter.setLenient(false);
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static final class Deserializer implements JsonDeserializer<ReplayRecording> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
        @Override // io.sentry.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ReplayRecording deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            ReplayRecording replayRecording = new ReplayRecording();
            objectReader.beginObject();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numNextIntegerOrNull = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("segment_id")) {
                    numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            objectReader.setLenient(true);
            List list = (List) objectReader.nextObjectOrNull();
            objectReader.setLenient(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        MapObjectReader mapObjectReader = new MapObjectReader(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                RRWebEventType rRWebEventType = RRWebEventType.values()[((Integer) value).intValue()];
                                int i = C456911.$SwitchMap$io$sentry$rrweb$RRWebEventType[rRWebEventType.ordinal()];
                                char c = 2;
                                if (i == 1) {
                                    Map map3 = (Map) map2.get(WebsocketGatewayConstants.DATA_KEY);
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource = RRWebIncrementalSnapshotEvent.IncrementalSource.values()[num.intValue()];
                                        int i2 = C456911.f6635x9e5b10aa[incrementalSource.ordinal()];
                                        if (i2 == 1) {
                                            arrayList.add(new RRWebInteractionEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                        } else if (i2 == 2) {
                                            arrayList.add(new RRWebInteractionMoveEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                        } else {
                                            iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", incrementalSource);
                                        }
                                    }
                                } else if (i == 2) {
                                    arrayList.add(new RRWebMetaEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                } else if (i == 3) {
                                    Map map4 = (Map) map2.get(WebsocketGatewayConstants.DATA_KEY);
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2.hashCode()) {
                                            case -226040934:
                                                if (str2.equals("performanceSpan")) {
                                                    c = 0;
                                                    break;
                                                } else {
                                                    c = 65535;
                                                    break;
                                                }
                                            case 112202875:
                                                if (str2.equals("video")) {
                                                    c = 1;
                                                    break;
                                                }
                                                break;
                                            case 1106718723:
                                                if (!str2.equals("breadcrumb")) {
                                                }
                                                break;
                                        }
                                        switch (c) {
                                            case 0:
                                                arrayList.add(new RRWebSpanEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case 1:
                                                arrayList.add(new RRWebVideoEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case 2:
                                                arrayList.add(new RRWebBreadcrumbEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            default:
                                                iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                                break;
                                        }
                                    }
                                } else {
                                    iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                }
                            }
                        }
                    }
                }
            }
            replayRecording.setSegmentId(numNextIntegerOrNull);
            replayRecording.setPayload(arrayList);
            replayRecording.setUnknown(map);
            return replayRecording;
        }
    }

    /* renamed from: io.sentry.ReplayRecording$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C456911 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebEventType;

        /* renamed from: $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource */
        static final /* synthetic */ int[] f6635x9e5b10aa;

        static {
            int[] iArr = new int[RRWebEventType.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebEventType = iArr;
            try {
                iArr[RRWebEventType.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[RRWebEventType.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[RRWebEventType.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RRWebIncrementalSnapshotEvent.IncrementalSource.values().length];
            f6635x9e5b10aa = iArr2;
            try {
                iArr2[RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6635x9e5b10aa[RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
