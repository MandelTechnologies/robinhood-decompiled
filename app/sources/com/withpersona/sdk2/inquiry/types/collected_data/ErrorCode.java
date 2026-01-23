package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCode.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NetworkError", "CameraPermissionError", "SdkConfigurationError", "CameraCompatibilityError", "IntegrationError", "SessionTokenError", "RateLimitExceeded", "UnexpectedError", "NoDiskSpaceError", "WebRtcIntegrationError", "InvalidOneTimeLinkCode", "ExceptionError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ErrorCode implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final Parcelable.Creator<ErrorCode> CREATOR;
    public static final ErrorCode NetworkError = new ErrorCode("NetworkError", 0);
    public static final ErrorCode CameraPermissionError = new ErrorCode("CameraPermissionError", 1);
    public static final ErrorCode SdkConfigurationError = new ErrorCode("SdkConfigurationError", 2);
    public static final ErrorCode CameraCompatibilityError = new ErrorCode("CameraCompatibilityError", 3);
    public static final ErrorCode IntegrationError = new ErrorCode("IntegrationError", 4);
    public static final ErrorCode SessionTokenError = new ErrorCode("SessionTokenError", 5);
    public static final ErrorCode RateLimitExceeded = new ErrorCode("RateLimitExceeded", 6);
    public static final ErrorCode UnexpectedError = new ErrorCode("UnexpectedError", 7);
    public static final ErrorCode NoDiskSpaceError = new ErrorCode("NoDiskSpaceError", 8);
    public static final ErrorCode WebRtcIntegrationError = new ErrorCode("WebRtcIntegrationError", 9);
    public static final ErrorCode InvalidOneTimeLinkCode = new ErrorCode("InvalidOneTimeLinkCode", 10);
    public static final ErrorCode ExceptionError = new ErrorCode("ExceptionError", 11);

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{NetworkError, CameraPermissionError, SdkConfigurationError, CameraCompatibilityError, IntegrationError, SessionTokenError, RateLimitExceeded, UnexpectedError, NoDiskSpaceError, WebRtcIntegrationError, InvalidOneTimeLinkCode, ExceptionError};
    }

    public static EnumEntries<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private ErrorCode(String str, int i) {
    }

    static {
        ErrorCode[] errorCodeArr$values = $values();
        $VALUES = errorCodeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(errorCodeArr$values);
        CREATOR = new Parcelable.Creator<ErrorCode>() { // from class: com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ErrorCode.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorCode[] newArray(int i) {
                return new ErrorCode[i];
            }
        };
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }
}
