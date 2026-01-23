package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessageExtension.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006("}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "Landroid/os/Parcelable;", "", "name", "id", "", "criticalityIndicator", "", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getId$3ds2sdk_release", "Z", "getCriticalityIndicator", "()Z", "Ljava/util/Map;", "isProcessable", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class MessageExtension implements Parcelable {
    private final boolean criticalityIndicator;
    private final Map<String, String> data;
    private final String id;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
    private static final List<String> SUPPORTED_MESSAGE_EXTENSIONS = CollectionsKt.emptyList();

    /* compiled from: MessageExtension.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageExtension> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MessageExtension(string2, string3, z, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension[] newArray(int i) {
            return new MessageExtension[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) other;
        return Intrinsics.areEqual(this.name, messageExtension.name) && Intrinsics.areEqual(this.id, messageExtension.id) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.data, messageExtension.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.id.hashCode()) * 31;
        boolean z = this.criticalityIndicator;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((iHashCode + i) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.name + ", id=" + this.id + ", criticalityIndicator=" + this.criticalityIndicator + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MessageExtension(String name, String id, boolean z, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.name = name;
        this.id = id;
        this.criticalityIndicator = z;
        this.data = data;
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final boolean isProcessable() {
        return SUPPORTED_MESSAGE_EXTENSIONS.contains(this.name);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.name).put("id", this.id).put("criticalityIndicator", this.criticalityIndicator).put(WebsocketGatewayConstants.DATA_KEY, new JSONObject((Map<?, ?>) this.data));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* compiled from: MessageExtension.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;", "", "()V", "DATA_VALUE_MAX_LENGTH", "", "FIELD_CRITICALITY_INDICATOR", "", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "ID_MAX_LENGTH", "MESSAGE_EXTENSIONS_MAX_COUNT", "NAME_MAX_LENGTH", "SUPPORTED_MESSAGE_EXTENSIONS", "", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageExtensionsJson", "Lorg/json/JSONArray;", "messageExtensionJson", "Lorg/json/JSONObject;", "toJsonArray", "messageExtensions", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final JSONArray toJsonArray(List<MessageExtension> messageExtensions) throws JSONException {
            if (messageExtensions == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = messageExtensions.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MessageExtension) it.next()).toJson$3ds2sdk_release());
            }
            return jSONArray;
        }

        @JvmStatic
        public final List<MessageExtension> fromJson(JSONArray messageExtensionsJson) throws ChallengeResponseParseException {
            if (messageExtensionsJson == null) {
                return null;
            }
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, messageExtensionsJson.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = messageExtensionsJson.optJSONObject(((PrimitiveIterators6) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(MessageExtension.INSTANCE.fromJson((JSONObject) it2.next()));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtensions");
        }

        private final MessageExtension fromJson(JSONObject messageExtensionJson) throws ChallengeResponseParseException {
            String strOptString = messageExtensionJson.optString("name");
            if (strOptString.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.name");
            }
            String strOptString2 = messageExtensionJson.optString("id");
            if (strOptString2.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.id");
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = messageExtensionJson.optJSONObject(WebsocketGatewayConstants.DATA_KEY);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString3 = jSONObjectOptJSONObject.optString(next);
                    if (strOptString3.length() > 8059) {
                        throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.data.value");
                    }
                    Intrinsics.checkNotNull(next);
                    Intrinsics.checkNotNull(strOptString3);
                    map.put(next, strOptString3);
                }
            }
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            return new MessageExtension(strOptString, strOptString2, messageExtensionJson.optBoolean("criticalityIndicator"), map);
        }
    }
}
