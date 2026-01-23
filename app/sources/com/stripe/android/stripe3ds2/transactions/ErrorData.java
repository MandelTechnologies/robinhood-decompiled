package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorData.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000256Bo\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104¨\u00067"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Landroid/os/Parcelable;", "", "serverTransId", "acsTransId", "dsTransId", "errorCode", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageVersion", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getServerTransId", "getAcsTransId", "getDsTransId", "getErrorCode", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "getErrorComponent", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageVersion", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Companion", "ErrorComponent", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ErrorData implements Parcelable {
    private final String acsTransId;
    private final String dsTransId;
    private final String errorCode;
    private final ErrorComponent errorComponent;
    private final String errorDescription;
    private final String errorDetail;
    private final String errorMessageType;
    private final String messageVersion;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorData> CREATOR = new Creator();

    /* compiled from: ErrorData.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorComponent.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SdkTransactionId.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData[] newArray(int i) {
            return new ErrorData[i];
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
        if (!(other instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) other;
        return Intrinsics.areEqual(this.serverTransId, errorData.serverTransId) && Intrinsics.areEqual(this.acsTransId, errorData.acsTransId) && Intrinsics.areEqual(this.dsTransId, errorData.dsTransId) && Intrinsics.areEqual(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && Intrinsics.areEqual(this.errorDescription, errorData.errorDescription) && Intrinsics.areEqual(this.errorDetail, errorData.errorDetail) && Intrinsics.areEqual(this.errorMessageType, errorData.errorMessageType) && Intrinsics.areEqual(this.messageVersion, errorData.messageVersion) && Intrinsics.areEqual(this.sdkTransId, errorData.sdkTransId);
    }

    public int hashCode() {
        String str = this.serverTransId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode.hashCode()) * 31;
        ErrorComponent errorComponent = this.errorComponent;
        int iHashCode4 = (((((iHashCode3 + (errorComponent == null ? 0 : errorComponent.hashCode())) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetail.hashCode()) * 31;
        String str4 = this.errorMessageType;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        return iHashCode5 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0);
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.dsTransId);
        parcel.writeString(this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(errorComponent.name());
        }
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorDetail);
        parcel.writeString(this.errorMessageType);
        parcel.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkTransactionId.writeToParcel(parcel, flags);
        }
    }

    public ErrorData(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = errorCode;
        this.errorComponent = errorComponent;
        this.errorDescription = errorDescription;
        this.errorDetail = errorDetail;
        this.errorMessageType = str4;
        this.messageVersion = messageVersion;
        this.sdkTransId = sdkTransactionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SdkTransactionId sdkTransactionId2;
        String str9;
        String str10;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        errorComponent = (i & 16) != 0 ? null : errorComponent;
        if ((i & 128) != 0) {
            sdkTransactionId2 = sdkTransactionId;
            str9 = str8;
            str10 = null;
        } else {
            sdkTransactionId2 = sdkTransactionId;
            str9 = str8;
            str10 = str7;
        }
        this(str, str2, str3, str4, errorComponent, str5, str6, str10, str9, sdkTransactionId2);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("messageType", "Erro").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put("errorCode", this.errorCode).put("errorDescription", this.errorDescription).put("errorDetail", this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            jSONObjectPut.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            jSONObjectPut.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            jSONObjectPut.put("dsTransID", str3);
        }
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent != null) {
            jSONObjectPut.put("errorComponent", errorComponent.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            jSONObjectPut.put("errorMessageType", str4);
        }
        Intrinsics.checkNotNull(jSONObjectPut);
        return jSONObjectPut;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorData.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ThreeDsSdk", "ThreeDsServer", "DirectoryServer", "Acs", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ErrorComponent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorComponent[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final ErrorComponent ThreeDsSdk = new ErrorComponent("ThreeDsSdk", 0, "C");
        public static final ErrorComponent ThreeDsServer = new ErrorComponent("ThreeDsServer", 1, "S");
        public static final ErrorComponent DirectoryServer = new ErrorComponent("DirectoryServer", 2, "D");
        public static final ErrorComponent Acs = new ErrorComponent("Acs", 3, "A");

        private static final /* synthetic */ ErrorComponent[] $values() {
            return new ErrorComponent[]{ThreeDsSdk, ThreeDsServer, DirectoryServer, Acs};
        }

        public static EnumEntries<ErrorComponent> getEntries() {
            return $ENTRIES;
        }

        public static ErrorComponent valueOf(String str) {
            return (ErrorComponent) Enum.valueOf(ErrorComponent.class, str);
        }

        public static ErrorComponent[] values() {
            return (ErrorComponent[]) $VALUES.clone();
        }

        private ErrorComponent(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            ErrorComponent[] errorComponentArr$values = $values();
            $VALUES = errorComponentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorComponentArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ErrorData.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "code", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ErrorComponent fromCode(String code) {
                ErrorComponent next;
                Iterator<ErrorComponent> it = ErrorComponent.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }
    }

    /* compiled from: ErrorData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$Companion;", "", "()V", "FIELD_3DS_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "payload", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "isErrorMessage", "", "isErrorMessage$3ds2sdk_release", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorData fromJson$3ds2sdk_release(JSONObject payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            String strOptString = payload.optString("threeDSServerTransID");
            String strOptString2 = payload.optString("acsTransID");
            String strOptString3 = payload.optString("dsTransID");
            String strOptString4 = payload.optString("errorCode");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            ErrorComponent errorComponentFromCode = ErrorComponent.INSTANCE.fromCode(payload.optString("errorComponent"));
            String strOptString5 = payload.optString("errorDescription");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            String strOptString6 = payload.optString("errorDetail");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            String strOptString7 = payload.optString("errorMessageType");
            String strOptString8 = payload.optString("messageVersion");
            Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(...)");
            String strOptString9 = payload.optString("sdkTransID");
            return new ErrorData(strOptString, strOptString2, strOptString3, strOptString4, errorComponentFromCode, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9 != null ? new SdkTransactionId(strOptString9) : null);
        }

        public final boolean isErrorMessage$3ds2sdk_release(JSONObject payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return Intrinsics.areEqual("Erro", payload.optString("messageType"));
        }
    }
}
