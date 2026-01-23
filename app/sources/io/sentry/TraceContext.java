package io.sentry;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class TraceContext implements JsonSerializable {
    private final String environment;
    private final String publicKey;
    private final String release;
    private final SentryId replayId;
    private final String sampleRate;
    private final String sampled;
    private final SentryId traceId;
    private final String transaction;
    private Map<String, Object> unknown;
    private final String userId;
    private final String userSegment;

    TraceContext(SentryId sentryId, String str) {
        this(sentryId, str, null, null, null, null, null, null, null);
    }

    TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, SentryId sentryId2) {
        this(sentryId, str, str2, str3, str4, null, str5, str6, str7, sentryId2);
    }

    @Deprecated
    TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SentryId sentryId2) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.userId = str4;
        this.userSegment = str5;
        this.transaction = str6;
        this.sampleRate = str7;
        this.sampled = str8;
        this.replayId = sentryId2;
    }

    public String getSampleRate() {
        return this.sampleRate;
    }

    @Deprecated
    /* loaded from: classes14.dex */
    private static final class TraceContextUser {

        /* renamed from: id */
        private String f6639id;
        private String segment;
        private Map<String, Object> unknown;

        private TraceContextUser(String str, String str2) {
            this.f6639id = str;
            this.segment = str2;
        }

        public String getId() {
            return this.f6639id;
        }

        @Deprecated
        public String getSegment() {
            return this.segment;
        }

        public void setUnknown(Map<String, Object> map) {
            this.unknown = map;
        }

        public static final class Deserializer implements JsonDeserializer<TraceContextUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public TraceContextUser deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
                objectReader.beginObject();
                String strNextStringOrNull = null;
                String strNextStringOrNull2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (objectReader.peek() == JsonToken.NAME) {
                    String strNextName = objectReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("id")) {
                        strNextStringOrNull = objectReader.nextStringOrNull();
                    } else if (strNextName.equals("segment")) {
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                    }
                }
                TraceContextUser traceContextUser = new TraceContextUser(strNextStringOrNull, strNextStringOrNull2);
                traceContextUser.setUnknown(concurrentHashMap);
                objectReader.endObject();
                return traceContextUser;
            }
        }
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("public_key").value(this.publicKey);
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.userId != null) {
            objectWriter.name(MatchaQrCodeDuxo6.USER_ID_KEY).value(this.userId);
        }
        if (this.userSegment != null) {
            objectWriter.name("user_segment").value(this.userSegment);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.sampleRate != null) {
            objectWriter.name("sample_rate").value(this.sampleRate);
        }
        if (this.sampled != null) {
            objectWriter.name("sampled").value(this.sampled);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
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

    /* loaded from: classes14.dex */
    public static final class Deserializer implements JsonDeserializer<TraceContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public TraceContext deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String str;
            String id;
            String strNextName;
            objectReader.beginObject();
            TraceContextUser traceContextUser = null;
            String strNextStringOrNull = null;
            SentryId sentryIdDeserialize = null;
            String strNextString = null;
            String segment = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            String strNextStringOrNull5 = null;
            String strNextStringOrNull6 = null;
            SentryId sentryIdDeserialize2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (true) {
                TraceContextUser traceContextUser2 = traceContextUser;
                String str2 = strNextStringOrNull;
                SentryId sentryId = sentryIdDeserialize;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (strNextString == null) {
                        throw missingRequiredFieldException("public_key", iLogger);
                    }
                    if (traceContextUser2 != null) {
                        id = str2 == null ? traceContextUser2.getId() : str2;
                        if (segment == null) {
                            segment = traceContextUser2.getSegment();
                        }
                        str = segment;
                    } else {
                        str = segment;
                        id = str2;
                    }
                    TraceContext traceContext = new TraceContext(sentryId, strNextString, strNextStringOrNull2, strNextStringOrNull3, id, str, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6, sentryIdDeserialize2);
                    traceContext.setUnknown(concurrentHashMap);
                    objectReader.endObject();
                    return traceContext;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "user_segment":
                        segment = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "replay_id":
                        sentryIdDeserialize2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "user_id":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "environment":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "user":
                        traceContextUser = (TraceContextUser) objectReader.nextOrNull(iLogger, new TraceContextUser.Deserializer());
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "sample_rate":
                        strNextStringOrNull5 = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "release":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        break;
                    case "sampled":
                        strNextStringOrNull6 = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "public_key":
                        strNextString = objectReader.nextString();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "transaction":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        traceContextUser = traceContextUser2;
                        strNextStringOrNull = str2;
                        sentryIdDeserialize = sentryId;
                        break;
                }
            }
        }

        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.log(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }
}
