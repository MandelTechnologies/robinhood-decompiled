package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdentityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, m3636d2 = {"strippedPhone", "", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityDuxoKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class IdentityDuxo3 {
    public static final String strippedPhone(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        if (string2.length() < 10) {
            return "";
        }
        String strSubstring = string2.substring(string2.length() - 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
