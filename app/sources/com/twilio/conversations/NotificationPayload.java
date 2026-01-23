package com.twilio.conversations;

import android.os.Bundle;
import com.twilio.util.TwilioLogger;
import java.util.Map;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NotificationPayload {
    public static final long INVALID_MESSAGE_INDEX = -1;
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(NotificationPayload.class));
    Bundle payload;

    public enum Type {
        UNKNOWN(0),
        NEW_MESSAGE(1),
        ADDED_TO_CONVERSATION(3),
        REMOVED_FROM_CONVERSATION(4);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type fromString(String str) {
            if (str.contentEquals("twilio.conversations.new_message")) {
                return NEW_MESSAGE;
            }
            if (str.contentEquals("twilio.conversations.added_to_conversation")) {
                return ADDED_TO_CONVERSATION;
            }
            if (!str.contentEquals("twilio.conversations.removed_from_conversation")) {
                NotificationPayload.logger.m3201w("Unsupported notification type: " + str);
                return UNKNOWN;
            }
            return REMOVED_FROM_CONVERSATION;
        }

        public int getValue() {
            return this.value;
        }

        public static Type fromInt(int i) {
            for (Type type2 : values()) {
                if (type2.getValue() == i) {
                    return type2;
                }
            }
            NotificationPayload.logger.m3191e("Invalid value " + i + " for NotificationPayload.Type");
            throw new IllegalStateException("Invalid value " + i + " for NotificationPayload.Type");
        }
    }

    public NotificationPayload(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject((Map<?, ?>) map);
        Bundle bundle = new Bundle();
        copyStringToBundle(jSONObject, "twi_message_type", bundle);
        copyStringToBundle(jSONObject, "twi_body", bundle);
        copyStringToBundle(jSONObject, "twi_sound", bundle);
        copyStringToBundle(jSONObject, "twi_message_id", bundle);
        copyStringToBundle(jSONObject, "conversation_sid", bundle);
        copyStringToBundle(jSONObject, "conversation_title", bundle);
        copyStringToBundle(jSONObject, "author", bundle);
        copyStringToBundle(jSONObject, "message_sid", bundle);
        copyNonNegativeNumberToBundle(jSONObject, "message_index", bundle);
        copyNonNegativeNumberToBundle(jSONObject, "media_count", bundle);
        String strOptString = optString(jSONObject, "media");
        if (strOptString != null && !strOptString.isEmpty()) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                copyStringToBundle(jSONObject2, "sid", bundle, "media_sid");
                copyStringToBundle(jSONObject2, "filename", bundle, "media_filename");
                copyStringToBundle(jSONObject2, "content_type", bundle, "media_content_type");
                copyNonNegativeNumberToBundle(jSONObject2, "size", bundle, "media_size");
            } catch (JSONException e) {
                logger.m3195i("Media notification parsing exception: " + e.toString());
            }
        }
        this.payload = bundle;
    }

    public Type getType() {
        if (this.payload.containsKey("twi_message_type")) {
            return Type.fromString(this.payload.getString("twi_message_type"));
        }
        return Type.UNKNOWN;
    }

    public String getBody() {
        return this.payload.getString("twi_body", "");
    }

    public String getSound() {
        return this.payload.getString("twi_sound", "");
    }

    public String getConversationTitle() {
        return this.payload.getString("conversation_title", "");
    }

    public String getConversationSid() {
        return this.payload.getString("conversation_sid", "");
    }

    public String getAuthor() {
        return this.payload.getString("author", "");
    }

    public String getMessageSid() {
        return this.payload.getString("message_sid", "");
    }

    public long getMessageIndex() {
        return this.payload.getLong("message_index", -1L);
    }

    public long getMediaCount() {
        return this.payload.getLong("media_count", 0L);
    }

    public long getMediaSize() {
        return this.payload.getLong("media_size", 0L);
    }

    public String getMediaSid() {
        return this.payload.getString("media_sid", "");
    }

    public String getMediaFilename() {
        return this.payload.getString("media_filename", "");
    }

    public String getMediaContentType() {
        return this.payload.getString("media_content_type", "");
    }

    private static String optString(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    private static void copyStringToBundle(JSONObject jSONObject, String str, Bundle bundle) {
        copyStringToBundle(jSONObject, str, bundle, str);
    }

    private static void copyStringToBundle(JSONObject jSONObject, String str, Bundle bundle, String str2) {
        String strOptString = optString(jSONObject, str);
        if (strOptString != null) {
            bundle.putString(str2, strOptString);
        }
    }

    private static void copyNonNegativeNumberToBundle(JSONObject jSONObject, String str, Bundle bundle) {
        copyNonNegativeNumberToBundle(jSONObject, str, bundle, str);
    }

    private static void copyNonNegativeNumberToBundle(JSONObject jSONObject, String str, Bundle bundle, String str2) {
        long jOptLong = jSONObject.optLong(str, -1L);
        if (jOptLong >= 0) {
            bundle.putLong(str2, jOptLong);
        }
    }
}
