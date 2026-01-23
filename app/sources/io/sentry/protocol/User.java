package io.sentry.protocol;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.Geo;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class User implements JsonSerializable {
    private Map<String, String> data;
    private String email;
    private Geo geo;

    /* renamed from: id */
    private String f6646id;
    private String ipAddress;
    private String name;

    @Deprecated
    private String segment;
    private Map<String, Object> unknown;
    private String username;

    public User() {
    }

    public User(User user) {
        this.email = user.email;
        this.username = user.username;
        this.f6646id = user.f6646id;
        this.ipAddress = user.ipAddress;
        this.segment = user.segment;
        this.name = user.name;
        this.geo = user.geo;
        this.data = CollectionUtils.newConcurrentHashMap(user.data);
        this.unknown = CollectionUtils.newConcurrentHashMap(user.unknown);
    }

    public String getId() {
        return this.f6646id;
    }

    public void setId(String str) {
        this.f6646id = str;
    }

    @Deprecated
    public String getSegment() {
        return this.segment;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && User.class == obj.getClass()) {
            User user = (User) obj;
            if (Objects.equals(this.email, user.email) && Objects.equals(this.f6646id, user.f6646id) && Objects.equals(this.username, user.username) && Objects.equals(this.segment, user.segment) && Objects.equals(this.ipAddress, user.ipAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.email, this.f6646id, this.username, this.segment, this.ipAddress);
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.f6646id != null) {
            objectWriter.name("id").value(this.f6646id);
        }
        if (this.username != null) {
            objectWriter.name("username").value(this.username);
        }
        if (this.segment != null) {
            objectWriter.name("segment").value(this.segment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(this.ipAddress);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.geo != null) {
            objectWriter.name("geo");
            this.geo.serialize(objectWriter, iLogger);
        }
        if (this.data != null) {
            objectWriter.name(WebsocketGatewayConstants.DATA_KEY).value(iLogger, this.data);
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

    public static final class Deserializer implements JsonDeserializer<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public User deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            User user = new User();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "username":
                        user.username = objectReader.nextStringOrNull();
                        break;
                    case "id":
                        user.f6646id = objectReader.nextStringOrNull();
                        break;
                    case "geo":
                        user.geo = new Geo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "data":
                        user.data = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "name":
                        user.name = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        user.email = objectReader.nextStringOrNull();
                        break;
                    case "other":
                        if (user.data != null && !user.data.isEmpty()) {
                            break;
                        } else {
                            user.data = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                            break;
                        }
                        break;
                    case "ip_address":
                        user.ipAddress = objectReader.nextStringOrNull();
                        break;
                    case "segment":
                        user.segment = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            user.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return user;
        }
    }
}
