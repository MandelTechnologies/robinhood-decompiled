package com.robinhood.shared.security.deviceattestation;

import kotlin.Metadata;

/* compiled from: DeviceAttestationConstants.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationConstants;", "", "<init>", "()V", "DEVICE_ATTEST_VERSION", "", "HEADER_DEVICE_ATTESTATION_NONCE", "HEADER_DEVICE_TOKEN", "HEADER_REQUEST_KEY_ID", "HEADER_REQUEST_NONCE", "HEADER_REQUEST_SIGNATURE", "HEADER_DEVICE_ATTEST_VERSION", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeviceAttestationConstants {
    public static final String DEVICE_ATTEST_VERSION = "1.0";
    public static final String HEADER_DEVICE_ATTESTATION_NONCE = "X-Device-Attestation-Nonce";
    public static final String HEADER_DEVICE_ATTEST_VERSION = "X-Robinhood-DeviceAttestVersion";
    public static final String HEADER_DEVICE_TOKEN = "X-Robinhood-Device-Token";
    public static final String HEADER_REQUEST_KEY_ID = "X-Robinhood-RequestKeyId";
    public static final String HEADER_REQUEST_NONCE = "X-Robinhood-RequestNonce";
    public static final String HEADER_REQUEST_SIGNATURE = "X-Robinhood-RequestSignature";
    public static final DeviceAttestationConstants INSTANCE = new DeviceAttestationConstants();

    private DeviceAttestationConstants() {
    }
}
