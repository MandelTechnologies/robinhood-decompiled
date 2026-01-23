package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public final class DebugImage implements JsonSerializable {
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;

    /* renamed from: type, reason: collision with root package name */
    private String f10718type;
    private Map<String, Object> unknown;
    private String uuid;

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setType(String str) {
        this.f10718type = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        if (this.uuid != null) {
            objectWriter.name("uuid").value(this.uuid);
        }
        if (this.f10718type != null) {
            objectWriter.name("type").value(this.f10718type);
        }
        if (this.debugId != null) {
            objectWriter.name("debug_id").value(this.debugId);
        }
        if (this.debugFile != null) {
            objectWriter.name("debug_file").value(this.debugFile);
        }
        if (this.codeId != null) {
            objectWriter.name("code_id").value(this.codeId);
        }
        if (this.codeFile != null) {
            objectWriter.name("code_file").value(this.codeFile);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.imageSize != null) {
            objectWriter.name("image_size").value(this.imageSize);
        }
        if (this.arch != null) {
            objectWriter.name("arch").value(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public static final class Deserializer implements JsonDeserializer<DebugImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public DebugImage deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            DebugImage debugImage = new DebugImage();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "debug_file":
                        debugImage.debugFile = objectReader.nextStringOrNull();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "image_size":
                        debugImage.imageSize = objectReader.nextLongOrNull();
                        break;
                    case "code_file":
                        debugImage.codeFile = objectReader.nextStringOrNull();
                        break;
                    case "arch":
                        debugImage.arch = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        debugImage.f10718type = objectReader.nextStringOrNull();
                        break;
                    case "uuid":
                        debugImage.uuid = objectReader.nextStringOrNull();
                        break;
                    case "debug_id":
                        debugImage.debugId = objectReader.nextStringOrNull();
                        break;
                    case "code_id":
                        debugImage.codeId = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }
}
