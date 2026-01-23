package com.twilio.conversations;

import com.twilio.util.TwilioLogger;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes12.dex */
public class Attributes {
    private final String mJson;
    private final Type mType;
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(Attributes.class));
    public static final Attributes DEFAULT = new Attributes(new JSONObject());

    enum Type {
        OBJECT,
        ARRAY,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL
    }

    public Attributes() {
        this.mType = Type.NULL;
        this.mJson = JSONObject.NULL.toString();
    }

    public Attributes(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("object must not be null");
        }
        this.mType = Type.OBJECT;
        this.mJson = jSONObject.toString();
    }

    public Attributes(JSONArray jSONArray) {
        if (jSONArray == null) {
            throw new IllegalArgumentException("array must not be null");
        }
        this.mType = Type.ARRAY;
        this.mJson = jSONArray.toString();
    }

    public Attributes(String str) {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        this.mType = Type.STRING;
        this.mJson = JSONObject.quote(str);
    }

    public Attributes(Number number) {
        if (number == null) {
            throw new IllegalArgumentException("number must not be null");
        }
        this.mType = Type.NUMBER;
        try {
            this.mJson = JSONObject.numberToString(number);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Cannot serialize number: " + number, e);
        }
    }

    public Attributes(boolean z) {
        this.mType = Type.BOOLEAN;
        this.mJson = String.valueOf(z);
    }

    public Type getType() {
        return this.mType;
    }

    public JSONObject getJSONObject() {
        if (this.mType != Type.OBJECT) {
            return null;
        }
        try {
            return new JSONObject(this.mJson);
        } catch (Exception e) {
            logger.m3192e("Error creating JSONObject: " + this.mJson, e);
            return null;
        }
    }

    public JSONArray getJSONArray() {
        if (this.mType != Type.ARRAY) {
            return null;
        }
        try {
            return new JSONArray(this.mJson);
        } catch (Exception e) {
            logger.m3192e("Error creating JSONArray: " + this.mJson, e);
            return null;
        }
    }

    public String getString() {
        if (this.mType != Type.STRING) {
            return null;
        }
        try {
            return (String) new JSONTokener(this.mJson).nextValue();
        } catch (Exception e) {
            logger.m3192e("Error creating String: " + this.mJson, e);
            return null;
        }
    }

    public Number getNumber() {
        if (this.mType != Type.NUMBER) {
            return null;
        }
        try {
            return (Number) new JSONTokener(this.mJson).nextValue();
        } catch (Exception e) {
            logger.m3192e("Error creating Number: " + this.mJson, e);
            return null;
        }
    }

    public Boolean getBoolean() {
        if (this.mType != Type.BOOLEAN) {
            return null;
        }
        try {
            return (Boolean) new JSONTokener(this.mJson).nextValue();
        } catch (Exception e) {
            logger.m3192e("Error creating Boolean: " + this.mJson, e);
            return null;
        }
    }

    public String toString() {
        return this.mJson;
    }

    public int hashCode() {
        return (this.mType.hashCode() * 31) + this.mJson.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        return this.mType == attributes.mType && this.mJson.equals(attributes.mJson);
    }

    static Attributes parse(String str) throws JSONException {
        Object objNextValue = new JSONTokener(str).nextValue();
        if (objNextValue instanceof JSONObject) {
            return new Attributes((JSONObject) objNextValue);
        }
        if (objNextValue instanceof JSONArray) {
            return new Attributes((JSONArray) objNextValue);
        }
        if (JSONObject.NULL.equals(objNextValue)) {
            return new Attributes();
        }
        if (objNextValue instanceof Boolean) {
            return new Attributes(((Boolean) objNextValue).booleanValue());
        }
        if (objNextValue instanceof Number) {
            return new Attributes((Number) objNextValue);
        }
        if (objNextValue instanceof String) {
            return new Attributes((String) objNextValue);
        }
        throw new JSONException("Unknown JSON value type: " + objNextValue);
    }
}
