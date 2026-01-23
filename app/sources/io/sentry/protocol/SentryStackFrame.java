package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class SentryStackFrame implements JsonSerializable {
    private Boolean _native;
    private String _package;
    private String absPath;
    private Integer colno;
    private String contextLine;
    private String filename;
    private String function;
    private String imageAddr;
    private Boolean inApp;
    private String instructionAddr;
    private Integer lineno;
    private SentryLockReason lock;
    private String module;
    private String platform;
    private String rawFunction;
    private String symbol;
    private String symbolAddr;
    private Map<String, Object> unknown;

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public String getFunction() {
        return this.function;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public Integer getLineno() {
        return this.lineno;
    }

    public void setLineno(Integer num) {
        this.lineno = num;
    }

    public void setInApp(Boolean bool) {
        this.inApp = bool;
    }

    public void setPackage(String str) {
        this._package = str;
    }

    public Boolean isNative() {
        return this._native;
    }

    public void setNative(Boolean bool) {
        this._native = bool;
    }

    public void setLock(SentryLockReason sentryLockReason) {
        this.lock = sentryLockReason;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        if (this.filename != null) {
            objectWriter.name("filename").value(this.filename);
        }
        if (this.function != null) {
            objectWriter.name("function").value(this.function);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.lineno != null) {
            objectWriter.name("lineno").value(this.lineno);
        }
        if (this.colno != null) {
            objectWriter.name("colno").value(this.colno);
        }
        if (this.absPath != null) {
            objectWriter.name("abs_path").value(this.absPath);
        }
        if (this.contextLine != null) {
            objectWriter.name("context_line").value(this.contextLine);
        }
        if (this.inApp != null) {
            objectWriter.name("in_app").value(this.inApp);
        }
        if (this._package != null) {
            objectWriter.name("package").value(this._package);
        }
        if (this._native != null) {
            objectWriter.name("native").value(this._native);
        }
        if (this.platform != null) {
            objectWriter.name("platform").value(this.platform);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.symbolAddr != null) {
            objectWriter.name("symbol_addr").value(this.symbolAddr);
        }
        if (this.instructionAddr != null) {
            objectWriter.name("instruction_addr").value(this.instructionAddr);
        }
        if (this.rawFunction != null) {
            objectWriter.name("raw_function").value(this.rawFunction);
        }
        if (this.symbol != null) {
            objectWriter.name("symbol").value(this.symbol);
        }
        if (this.lock != null) {
            objectWriter.name("lock").value(iLogger, this.lock);
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

    public static final class Deserializer implements JsonDeserializer<SentryStackFrame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryStackFrame deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            SentryStackFrame sentryStackFrame = new SentryStackFrame();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "image_addr":
                        sentryStackFrame.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "in_app":
                        sentryStackFrame.inApp = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_function":
                        sentryStackFrame.rawFunction = objectReader.nextStringOrNull();
                        break;
                    case "lineno":
                        sentryStackFrame.lineno = objectReader.nextIntegerOrNull();
                        break;
                    case "module":
                        sentryStackFrame.module = objectReader.nextStringOrNull();
                        break;
                    case "native":
                        sentryStackFrame._native = objectReader.nextBooleanOrNull();
                        break;
                    case "symbol":
                        sentryStackFrame.symbol = objectReader.nextStringOrNull();
                        break;
                    case "package":
                        sentryStackFrame._package = objectReader.nextStringOrNull();
                        break;
                    case "filename":
                        sentryStackFrame.filename = objectReader.nextStringOrNull();
                        break;
                    case "symbol_addr":
                        sentryStackFrame.symbolAddr = objectReader.nextStringOrNull();
                        break;
                    case "lock":
                        sentryStackFrame.lock = (SentryLockReason) objectReader.nextOrNull(iLogger, new SentryLockReason.Deserializer());
                        break;
                    case "colno":
                        sentryStackFrame.colno = objectReader.nextIntegerOrNull();
                        break;
                    case "instruction_addr":
                        sentryStackFrame.instructionAddr = objectReader.nextStringOrNull();
                        break;
                    case "context_line":
                        sentryStackFrame.contextLine = objectReader.nextStringOrNull();
                        break;
                    case "function":
                        sentryStackFrame.function = objectReader.nextStringOrNull();
                        break;
                    case "abs_path":
                        sentryStackFrame.absPath = objectReader.nextStringOrNull();
                        break;
                    case "platform":
                        sentryStackFrame.platform = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackFrame.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackFrame;
        }
    }
}
