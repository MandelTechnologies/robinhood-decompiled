package io.sentry;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.SentryLevel;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class Breadcrumb implements JsonSerializable {
    private String category;
    private Map<String, Object> data;
    private SentryLevel level;
    private String message;
    private final Date timestamp;

    /* renamed from: type, reason: collision with root package name */
    private String f10709type;
    private Map<String, Object> unknown;

    public Breadcrumb(Date date) {
        this.data = new ConcurrentHashMap();
        this.timestamp = date;
    }

    Breadcrumb(Breadcrumb breadcrumb) {
        this.data = new ConcurrentHashMap();
        this.timestamp = breadcrumb.timestamp;
        this.message = breadcrumb.message;
        this.f10709type = breadcrumb.f10709type;
        this.category = breadcrumb.category;
        Map<String, Object> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(breadcrumb.data);
        if (mapNewConcurrentHashMap != null) {
            this.data = mapNewConcurrentHashMap;
        }
        this.unknown = CollectionUtils.newConcurrentHashMap(breadcrumb.unknown);
        this.level = breadcrumb.level;
    }

    public static Breadcrumb error(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("error");
        breadcrumb.setMessage(str);
        breadcrumb.setLevel(SentryLevel.ERROR);
        return breadcrumb;
    }

    public static Breadcrumb userInteraction(String str, String str2, String str3, String str4, Map<String, Object> map) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("user");
        breadcrumb.setCategory("ui." + str);
        if (str2 != null) {
            breadcrumb.setData("view.id", str2);
        }
        if (str3 != null) {
            breadcrumb.setData("view.class", str3);
        }
        if (str4 != null) {
            breadcrumb.setData("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            breadcrumb.getData().put(entry.getKey(), entry.getValue());
        }
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }

    public Breadcrumb() {
        this(DateUtils.getCurrentDateTime());
    }

    public Date getTimestamp() {
        return (Date) this.timestamp.clone();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setType(String str) {
        this.f10709type = str;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(String str, Object obj) {
        this.data.put(str, obj);
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Breadcrumb.class == obj.getClass()) {
            Breadcrumb breadcrumb = (Breadcrumb) obj;
            if (this.timestamp.getTime() == breadcrumb.timestamp.getTime() && Objects.equals(this.message, breadcrumb.message) && Objects.equals(this.f10709type, breadcrumb.f10709type) && Objects.equals(this.category, breadcrumb.category) && this.level == breadcrumb.level) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.timestamp, this.message, this.f10709type, this.category, this.level);
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.f10709type != null) {
            objectWriter.name("type").value(this.f10709type);
        }
        objectWriter.name(WebsocketGatewayConstants.DATA_KEY).value(iLogger, this.data);
        if (this.category != null) {
            objectWriter.name(RhGcmListenerService.EXTRA_CATEGORY).value(this.category);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
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

    public static final class Deserializer implements JsonDeserializer<Breadcrumb> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        @Override // io.sentry.JsonDeserializer
        public Breadcrumb deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            Date currentDateTime = DateUtils.getCurrentDateTime();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            SentryLevel sentryLevelDeserialize = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "data":
                        ?? NewConcurrentHashMap = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        if (NewConcurrentHashMap == 0) {
                            break;
                        } else {
                            concurrentHashMap = NewConcurrentHashMap;
                            break;
                        }
                    case "type":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            currentDateTime = dateNextDateOrNull;
                            break;
                        }
                    case "level":
                        try {
                            sentryLevelDeserialize = new SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (Exception e) {
                            iLogger.log(SentryLevel.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap2, strNextName);
                        break;
                }
            }
            Breadcrumb breadcrumb = new Breadcrumb(currentDateTime);
            breadcrumb.message = strNextStringOrNull;
            breadcrumb.f10709type = strNextStringOrNull2;
            breadcrumb.data = concurrentHashMap;
            breadcrumb.category = strNextStringOrNull3;
            breadcrumb.level = sentryLevelDeserialize;
            breadcrumb.setUnknown(concurrentHashMap2);
            objectReader.endObject();
            return breadcrumb;
        }
    }
}
