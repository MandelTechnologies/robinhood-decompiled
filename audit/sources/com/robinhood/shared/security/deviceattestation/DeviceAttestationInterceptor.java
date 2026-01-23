package com.robinhood.shared.security.deviceattestation;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.prefs.TrustedDeviceIdPref;
import dagger.Lazy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.HashingSink;
import okio.Okio;
import okio.Sink;

/* compiled from: DeviceAttestationInterceptor.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "Lokhttp3/Interceptor;", "deviceAttestationManager", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "<init>", "(Ldagger/Lazy;Lcom/robinhood/prefs/TrustedDeviceIdPref;)V", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DeviceAttestationInterceptor implements Interceptor {
    private final Lazy<DeviceAttestationManager> deviceAttestationManager;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    public DeviceAttestationInterceptor(Lazy<DeviceAttestationManager> deviceAttestationManager, TrustedDeviceIdPref trustedDeviceIdPref) {
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        this.deviceAttestationManager = deviceAttestationManager;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IllegalStateException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.getBody();
        String strHeader = request.header(DeviceAttestationConstants.HEADER_DEVICE_ATTESTATION_NONCE);
        if (strHeader == null || strHeader.length() == 0 || body == null) {
            return chain.proceed(request);
        }
        Sink sinkBlackhole = Okio.blackhole();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        HashingSink hashingSink = Okio.hashingSink(sinkBlackhole, messageDigest);
        BufferedSink bufferedSinkBuffer = Okio.buffer(hashingSink);
        try {
            body.writeTo(bufferedSinkBuffer);
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(bufferedSinkBuffer, null);
            String strSignRequest = this.deviceAttestationManager.get().signRequest(strHeader, hashingSink.hash());
            String keyId = this.deviceAttestationManager.get().getKeyId();
            Request.Builder builderNewBuilder = request.newBuilder();
            builderNewBuilder.removeHeader(DeviceAttestationConstants.HEADER_DEVICE_ATTESTATION_NONCE);
            builderNewBuilder.addHeader(DeviceAttestationConstants.HEADER_DEVICE_ATTEST_VERSION, DeviceAttestationConstants.DEVICE_ATTEST_VERSION);
            builderNewBuilder.addHeader(DeviceAttestationConstants.HEADER_DEVICE_TOKEN, this.trustedDeviceIdPref.get());
            builderNewBuilder.addHeader(DeviceAttestationConstants.HEADER_REQUEST_KEY_ID, keyId);
            builderNewBuilder.addHeader(DeviceAttestationConstants.HEADER_REQUEST_NONCE, strHeader);
            builderNewBuilder.addHeader(DeviceAttestationConstants.HEADER_REQUEST_SIGNATURE, strSignRequest);
            return chain.proceed(builderNewBuilder.build());
        } finally {
        }
    }
}
