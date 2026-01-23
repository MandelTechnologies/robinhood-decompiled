package com.robinhood.shared.crypto.transfer.send.address;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: SanitizeCryptoAddress.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"sanitizeCryptoAddress", "", "inputAddress", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.SanitizeCryptoAddressKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SanitizeCryptoAddress {
    public static final String sanitizeCryptoAddress(String inputAddress) {
        Intrinsics.checkNotNullParameter(inputAddress, "inputAddress");
        return new Regex("\\s+").replace(inputAddress, "");
    }
}
