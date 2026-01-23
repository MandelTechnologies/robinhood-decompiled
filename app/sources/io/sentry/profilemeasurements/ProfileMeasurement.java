package io.sentry.profilemeasurements;

import com.robinhood.models.p320db.Instrument;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class ProfileMeasurement implements JsonSerializable {
    private String unit;
    private Map<String, Object> unknown;
    private Collection<ProfileMeasurementValue> values;

    public ProfileMeasurement() {
        this("unknown", new ArrayList());
    }

    public ProfileMeasurement(String str, Collection<ProfileMeasurementValue> collection) {
        this.unit = str;
        this.values = collection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProfileMeasurement.class == obj.getClass()) {
            ProfileMeasurement profileMeasurement = (ProfileMeasurement) obj;
            if (Objects.equals(this.unknown, profileMeasurement.unknown) && this.unit.equals(profileMeasurement.unit) && new ArrayList(this.values).equals(new ArrayList(profileMeasurement.values))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.unknown, this.unit, this.values);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name(Instrument.TYPE_UNIT).value(iLogger, this.unit);
        objectWriter.name("values").value(iLogger, this.values);
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

    public static final class Deserializer implements JsonDeserializer<ProfileMeasurement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfileMeasurement deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            ProfileMeasurement profileMeasurement = new ProfileMeasurement();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    List listNextListOrNull = objectReader.nextListOrNull(iLogger, new ProfileMeasurementValue.Deserializer());
                    if (listNextListOrNull != null) {
                        profileMeasurement.values = listNextListOrNull;
                    }
                } else if (strNextName.equals(Instrument.TYPE_UNIT)) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull != null) {
                        profileMeasurement.unit = strNextStringOrNull;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            profileMeasurement.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurement;
        }
    }
}
