package com.robinhood.librobinhood.data.store.util;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: IsPhoneNumberFromExcludedArea.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"isPhoneNumberExcluded", "", "", "excludePatterns", "", "lib-store-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.util.IsPhoneNumberFromExcludedAreaKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class IsPhoneNumberFromExcludedArea {
    public static final boolean isPhoneNumberExcluded(String str, List<String> excludePatterns) {
        Intrinsics.checkNotNullParameter(excludePatterns, "excludePatterns");
        if (str == null) {
            return false;
        }
        Iterator<String> it = excludePatterns.iterator();
        while (it.hasNext()) {
            if (new Regex(it.next()).matches(str)) {
                return true;
            }
        }
        return false;
    }
}
