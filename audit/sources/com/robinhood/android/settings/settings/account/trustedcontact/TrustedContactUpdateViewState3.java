package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.iso.countrycode.CountryCode;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TrustedContactUpdateViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"usInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "getUsInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "stripNumberToDigits", "", "feature-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateViewStateKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class TrustedContactUpdateViewState3 {
    private static final InternationalInfo usInfo = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null);

    public static final InternationalInfo getUsInfo() {
        return usInfo;
    }

    public static final String stripNumberToDigits(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
