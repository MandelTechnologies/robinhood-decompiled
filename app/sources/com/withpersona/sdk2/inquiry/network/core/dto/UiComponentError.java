package com.withpersona.sdk2.inquiry.network.core.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputInternationalDb;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes18.dex */
public abstract class UiComponentError implements Parcelable {
    public static final Companion Companion = new Companion(null);

    public static final class Companion extends JsonAdapter<UiComponentError> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(JsonReader jsonReader) throws IOException {
            JsonReader jsonReaderPeekJson = jsonReader.peekJson();
            jsonReaderPeekJson.beginObject();
            while (jsonReaderPeekJson.hasNext()) {
                if (Intrinsics.areEqual(jsonReaderPeekJson.nextName(), "type")) {
                    return jsonReaderPeekJson.nextString();
                }
                jsonReaderPeekJson.skipValue();
            }
            return null;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public UiComponentError fromJson(JsonReader jsonReader) throws IOException {
            Moshi moshiBuild = new Moshi.Builder().build();
            String jsonType = getJsonType(jsonReader);
            if (jsonType == null) {
                return null;
            }
            int iHashCode = jsonType.hashCode();
            if (iHashCode != -816959144) {
                if (iHashCode != -212588636) {
                    if (iHashCode == 1658531967 && jsonType.equals(InputAddress.f10640type)) {
                        return (UiComponentError) moshiBuild.adapter(UiInputAddressComponentError.class).fromJson(jsonReader);
                    }
                } else if (jsonType.equals(InputInternationalDb.f10646type)) {
                    return (UiComponentError) moshiBuild.adapter(UiInputInternationalDbComponentError.class).fromJson(jsonReader);
                }
            } else if (jsonType.equals("gov_id_nfc")) {
                return (UiComponentError) moshiBuild.adapter(UiGovernmentIdNfcScanComponentError.class).fromJson(jsonReader);
            }
            return (UiComponentError) moshiBuild.adapter(UiInputComponentError.class).fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter jsonWriter, UiComponentError uiComponentError) throws IOException {
            Moshi moshiBuild = new Moshi.Builder().build();
            if (uiComponentError instanceof UiGovernmentIdNfcScanComponentError) {
                moshiBuild.adapter(UiGovernmentIdNfcScanComponentError.class).toJson(jsonWriter, (JsonWriter) uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputAddressComponentError) {
                moshiBuild.adapter(UiInputAddressComponentError.class).toJson(jsonWriter, (JsonWriter) uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputComponentError) {
                moshiBuild.adapter(UiInputComponentError.class).toJson(jsonWriter, (JsonWriter) uiComponentError);
            } else if (uiComponentError instanceof UiInputInternationalDbComponentError) {
                moshiBuild.adapter(UiInputInternationalDbComponentError.class).toJson(jsonWriter, (JsonWriter) uiComponentError);
            } else {
                if (uiComponentError != null) {
                    throw new NoWhenBranchMatchedException();
                }
                jsonWriter.nullValue();
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputAddressComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f10614type;

        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError createFromParcel(Parcel parcel) {
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(string2, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError[] newArray(int i) {
                return new UiInputAddressComponentError[i];
            }
        }

        public UiInputAddressComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f10614type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputAddressComponentError.f10614type;
            }
            if ((i & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f10614type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputAddressComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputAddressComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputAddressComponentError.name) && Intrinsics.areEqual(this.f10614type, uiInputAddressComponentError.f10614type) && Intrinsics.areEqual(this.message, uiInputAddressComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f10614type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.f10614type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiInputAddressComponentError(name=" + this.name + ", type=" + this.f10614type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f10614type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();
        private final String message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f10615type;

        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError createFromParcel(Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError[] newArray(int i) {
                return new UiInputComponentError[i];
            }
        }

        public UiInputComponentError(String str, String str2, String str3) {
            super(null);
            this.name = str;
            this.f10615type = str2;
            this.message = str3;
        }

        public static /* synthetic */ UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputComponentError.f10615type;
            }
            if ((i & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f10615type;
        }

        public final String component3() {
            return this.message;
        }

        public final UiInputComponentError copy(String str, String str2, String str3) {
            return new UiInputComponentError(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputComponentError.name) && Intrinsics.areEqual(this.f10615type, uiInputComponentError.f10615type) && Intrinsics.areEqual(this.message, uiInputComponentError.message);
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f10615type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.f10615type.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "UiInputComponentError(name=" + this.name + ", type=" + this.f10615type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f10615type);
            parcel.writeString(this.message);
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f10616type;

        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError createFromParcel(Parcel parcel) {
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(string2, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError[] newArray(int i) {
                return new UiInputInternationalDbComponentError[i];
            }
        }

        public UiInputInternationalDbComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f10616type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.f10616type;
            }
            if ((i & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f10616type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputInternationalDbComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputInternationalDbComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputInternationalDbComponentError.name) && Intrinsics.areEqual(this.f10616type, uiInputInternationalDbComponentError.f10616type) && Intrinsics.areEqual(this.message, uiInputInternationalDbComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f10616type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.f10616type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiInputInternationalDbComponentError(name=" + this.name + ", type=" + this.f10616type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f10616type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public /* synthetic */ UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    public abstract String getType();

    @JsonClass(generateAdapter = true)
    public static final class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f10613type;

        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError createFromParcel(Parcel parcel) {
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(string2, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i) {
                return new UiGovernmentIdNfcScanComponentError[i];
            }
        }

        public /* synthetic */ UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "gov_id_nfc" : str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.f10613type;
            }
            if ((i & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f10613type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiGovernmentIdNfcScanComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiGovernmentIdNfcScanComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) obj;
            return Intrinsics.areEqual(this.name, uiGovernmentIdNfcScanComponentError.name) && Intrinsics.areEqual(this.f10613type, uiGovernmentIdNfcScanComponentError.f10613type) && Intrinsics.areEqual(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f10613type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.f10613type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiGovernmentIdNfcScanComponentError(name=" + this.name + ", type=" + this.f10613type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f10613type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public UiGovernmentIdNfcScanComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f10613type = str2;
            this.message = map;
        }
    }

    private UiComponentError() {
    }
}
