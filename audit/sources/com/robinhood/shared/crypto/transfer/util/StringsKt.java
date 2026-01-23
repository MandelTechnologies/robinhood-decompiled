package com.robinhood.shared.crypto.transfer.util;

import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"sanitizedAddress", "", "getSanitizedAddress", "(Ljava/lang/String;)Ljava/lang/String;", "addressAfterColon", "getAddressAfterColon", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StringsKt {
    public static final String getSanitizedAddress(String str) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            queryParameter = uri.getQueryParameter(PlaceTypes.ADDRESS);
            if (queryParameter == null) {
                queryParameter = uri.getHost();
            }
        } catch (Exception unused) {
            queryParameter = null;
        }
        if (queryParameter != null) {
            return queryParameter;
        }
        String addressAfterColon = getAddressAfterColon(str);
        if (addressAfterColon != null) {
            str = addressAfterColon;
        }
        return kotlin.text.StringsKt.trim(str).toString();
    }

    private static final String getAddressAfterColon(String str) {
        if (kotlin.text.StringsKt.contains$default((CharSequence) str, ':', false, 2, (Object) null)) {
            return kotlin.text.StringsKt.substringAfter$default(str, ':', (String) null, 2, (Object) null);
        }
        return null;
    }
}
