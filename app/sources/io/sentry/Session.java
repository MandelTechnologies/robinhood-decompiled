package io.sentry;

import io.sentry.protocol.User;
import io.sentry.util.StringUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes21.dex */
public final class Session implements JsonSerializable {
    private String abnormalMechanism;
    private final String distinctId;
    private Double duration;
    private final String environment;
    private final AtomicInteger errorCount;
    private Boolean init;
    private final String ipAddress;
    private final String release;
    private Long sequence;
    private final UUID sessionId;
    private final Object sessionLock;
    private final Date started;
    private State status;
    private Date timestamp;
    private Map<String, Object> unknown;
    private String userAgent;

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(State state, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5, String str6) {
        this.sessionLock = new Object();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new AtomicInteger(i);
        this.distinctId = str;
        this.sessionId = uuid;
        this.init = bool;
        this.sequence = l;
        this.duration = d;
        this.ipAddress = str2;
        this.userAgent = str3;
        this.environment = str4;
        this.release = str5;
        this.abnormalMechanism = str6;
    }

    public Session(String str, User user, String str2, String str3) {
        this(State.Ok, DateUtils.getCurrentDateTime(), DateUtils.getCurrentDateTime(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, user != null ? user.getIpAddress() : null, null, str2, str3, null);
    }

    public boolean isTerminated() {
        return this.status != State.Ok;
    }

    public Date getStarted() {
        Date date = this.started;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public UUID getSessionId() {
        return this.sessionId;
    }

    public String getRelease() {
        return this.release;
    }

    public Boolean getInit() {
        return this.init;
    }

    public void setInitAsTrue() {
        this.init = Boolean.TRUE;
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    public State getStatus() {
        return this.status;
    }

    public String getAbnormalMechanism() {
        return this.abnormalMechanism;
    }

    public void end() {
        end(DateUtils.getCurrentDateTime());
    }

    public void end(Date date) {
        synchronized (this.sessionLock) {
            try {
                this.init = null;
                if (this.status == State.Ok) {
                    this.status = State.Exited;
                }
                if (date != null) {
                    this.timestamp = date;
                } else {
                    this.timestamp = DateUtils.getCurrentDateTime();
                }
                Date date2 = this.timestamp;
                if (date2 != null) {
                    this.duration = Double.valueOf(calculateDurationTime(date2));
                    this.sequence = Long.valueOf(getSequenceTimestamp(this.timestamp));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private double calculateDurationTime(Date date) {
        return Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    public boolean update(State state, String str, boolean z) {
        return update(state, str, z, null);
    }

    public boolean update(State state, String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.sessionLock) {
            z2 = true;
            if (state != null) {
                try {
                    this.status = state;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.userAgent = str;
                z3 = true;
            }
            if (z) {
                this.errorCount.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.abnormalMechanism = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.init = null;
                Date currentDateTime = DateUtils.getCurrentDateTime();
                this.timestamp = currentDateTime;
                if (currentDateTime != null) {
                    this.sequence = Long.valueOf(getSequenceTimestamp(currentDateTime));
                }
            }
        }
        return z2;
    }

    private long getSequenceTimestamp(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Session m28513clone() {
        return new Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release, this.abnormalMechanism);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        if (this.sessionId != null) {
            objectWriter.name("sid").value(this.sessionId.toString());
        }
        if (this.distinctId != null) {
            objectWriter.name("did").value(this.distinctId);
        }
        if (this.init != null) {
            objectWriter.name("init").value(this.init);
        }
        objectWriter.name("started").value(iLogger, this.started);
        objectWriter.name("status").value(iLogger, this.status.name().toLowerCase(Locale.ROOT));
        if (this.sequence != null) {
            objectWriter.name("seq").value(this.sequence);
        }
        objectWriter.name("errors").value(this.errorCount.intValue());
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, this.timestamp);
        }
        if (this.abnormalMechanism != null) {
            objectWriter.name("abnormal_mechanism").value(iLogger, this.abnormalMechanism);
        }
        objectWriter.name("attrs");
        objectWriter.beginObject();
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(iLogger, this.ipAddress);
        }
        if (this.userAgent != null) {
            objectWriter.name("user_agent").value(iLogger, this.userAgent);
        }
        objectWriter.endObject();
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

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static final class Deserializer implements JsonDeserializer<Session> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
        @Override // io.sentry.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Session deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            String strNextStringOrNull;
            objectReader.beginObject();
            Integer num = null;
            State stateValueOf = null;
            Date dateNextDateOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            Date dateNextDateOrNull2 = null;
            String strNextStringOrNull2 = null;
            UUID uuidFromString = null;
            Boolean boolNextBooleanOrNull = null;
            Long lNextLongOrNull = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            String strNextStringOrNull5 = null;
            String strNextStringOrNull6 = null;
            String strNextStringOrNull7 = null;
            while (true) {
                Integer numNextIntegerOrNull = num;
                State state = stateValueOf;
                Date date = dateNextDateOrNull;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Date date2 = dateNextDateOrNull2;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (state == null) {
                        throw missingRequiredFieldException("status", iLogger);
                    }
                    if (date == null) {
                        throw missingRequiredFieldException("started", iLogger);
                    }
                    if (numNextIntegerOrNull == null) {
                        throw missingRequiredFieldException("errors", iLogger);
                    }
                    if (strNextStringOrNull6 == null) {
                        throw missingRequiredFieldException("release", iLogger);
                    }
                    Session session = new Session(state, date, date2, numNextIntegerOrNull.intValue(), strNextStringOrNull2, uuidFromString, boolNextBooleanOrNull, lNextLongOrNull, dNextDoubleOrNull, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6, strNextStringOrNull7);
                    session.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return session;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "duration":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "started":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        stateValueOf = state;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "errors":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "status":
                        String strCapitalize = StringUtils.capitalize(objectReader.nextStringOrNull());
                        stateValueOf = strCapitalize != null ? State.valueOf(strCapitalize) : state;
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "did":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "seq":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "sid":
                        try {
                            strNextStringOrNull = objectReader.nextStringOrNull();
                        } catch (IllegalArgumentException unused) {
                            strNextStringOrNull = null;
                        }
                        try {
                            uuidFromString = UUID.fromString(strNextStringOrNull);
                        } catch (IllegalArgumentException unused2) {
                            iLogger.log(SentryLevel.ERROR, "%s sid is not valid.", strNextStringOrNull);
                            dateNextDateOrNull = date;
                            concurrentHashMap = concurrentHashMap2;
                            dateNextDateOrNull2 = date2;
                            num = numNextIntegerOrNull;
                        }
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                    case "init":
                        boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "timestamp":
                        dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        break;
                    case "attrs":
                        objectReader.beginObject();
                        while (objectReader.peek() == JsonToken.NAME) {
                            String strNextName2 = objectReader.nextName();
                            strNextName2.getClass();
                            switch (strNextName2) {
                                case "environment":
                                    strNextStringOrNull5 = objectReader.nextStringOrNull();
                                    break;
                                case "release":
                                    strNextStringOrNull6 = objectReader.nextStringOrNull();
                                    break;
                                case "ip_address":
                                    strNextStringOrNull3 = objectReader.nextStringOrNull();
                                    break;
                                case "user_agent":
                                    strNextStringOrNull4 = objectReader.nextStringOrNull();
                                    break;
                                default:
                                    objectReader.skipValue();
                                    break;
                            }
                        }
                        objectReader.endObject();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "abnormal_mechanism":
                        strNextStringOrNull7 = objectReader.nextStringOrNull();
                        dateNextDateOrNull = date;
                        concurrentHashMap = concurrentHashMap2;
                        dateNextDateOrNull2 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                }
                num = numNextIntegerOrNull;
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
