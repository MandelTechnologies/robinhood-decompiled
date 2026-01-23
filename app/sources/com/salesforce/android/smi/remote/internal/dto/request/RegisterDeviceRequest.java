package com.salesforce.android.smi.remote.internal.dto.request;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegisterDeviceRequest.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "", "pushServiceProvider", "", "<init>", "(Ljava/lang/String;)V", "getPushServiceProvider", "()Ljava/lang/String;", "RegisterPushNotificationsRequest", "RegisterCapabilitiesRequest", "Companion", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterCapabilitiesRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterPushNotificationsRequest;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class RegisterDeviceRequest {
    public static final String PUSH_SERVICE_PROVIDER = "FCM";
    private final String pushServiceProvider;

    public /* synthetic */ RegisterDeviceRequest(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private RegisterDeviceRequest(String str) {
        this.pushServiceProvider = str;
    }

    public final String getPushServiceProvider() {
        return this.pushServiceProvider;
    }

    /* compiled from: RegisterDeviceRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterPushNotificationsRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "deviceToken", "", "pushServiceProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceToken", "()Ljava/lang/String;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class RegisterPushNotificationsRequest extends RegisterDeviceRequest {
        private final String deviceToken;

        public final String getDeviceToken() {
            return this.deviceToken;
        }

        public /* synthetic */ RegisterPushNotificationsRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? RegisterDeviceRequest.PUSH_SERVICE_PROVIDER : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterPushNotificationsRequest(String deviceToken, String pushServiceProvider) {
            super(pushServiceProvider, null);
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            Intrinsics.checkNotNullParameter(pushServiceProvider, "pushServiceProvider");
            this.deviceToken = deviceToken;
        }
    }

    /* compiled from: RegisterDeviceRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterCapabilitiesRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "pushServiceProvider", "", "<init>", "(Ljava/lang/String;)V", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class RegisterCapabilitiesRequest extends RegisterDeviceRequest {
        /* JADX WARN: Multi-variable type inference failed */
        public RegisterCapabilitiesRequest() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RegisterCapabilitiesRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RegisterDeviceRequest.PUSH_SERVICE_PROVIDER : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterCapabilitiesRequest(String pushServiceProvider) {
            super(pushServiceProvider, null);
            Intrinsics.checkNotNullParameter(pushServiceProvider, "pushServiceProvider");
        }
    }
}
