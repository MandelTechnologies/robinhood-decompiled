package com.plaid.internal;

import com.google.gson.internal.LinkedTreeMap;
import com.plaid.internal.AbstractC6043b4;
import com.robinhood.models.api.ErrorResponse;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.r1 */
/* loaded from: classes16.dex */
public final class C7193r1 {
    /* renamed from: a */
    public static final boolean m1579a(AbstractC6043b4.a<Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.f1920a;
        if (obj instanceof LinkedTreeMap) {
            String upperCase = String.valueOf(((Map) obj).get(ErrorResponse.ERROR_CODE)).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (aVar.f1921b == 400 && Intrinsics.areEqual("INVALID_CHANNEL_ID", upperCase)) {
                return true;
            }
        }
        return false;
    }
}
