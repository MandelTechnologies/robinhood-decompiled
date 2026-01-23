package com.withpersona.sdk2.inquiry.nfc;

import kotlin.Metadata;

/* compiled from: NfcUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/NfcUtils;", "", "<init>", "()V", "Ljava/lang/Class;", "getPassportNfcActivityClass$nfc_release", "()Ljava/lang/Class;", "getPassportNfcActivityClass", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NfcUtils {
    public static final NfcUtils INSTANCE = new NfcUtils();

    private NfcUtils() {
    }

    public final Class<?> getPassportNfcActivityClass$nfc_release() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.nfc.impl.NfcReaderActivity");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
