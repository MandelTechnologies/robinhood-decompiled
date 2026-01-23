package com.stripe.android.core.model;

import com.stripe.android.core.model.CountryCode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryCode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"getCountryCode", "Lcom/stripe/android/core/model/CountryCode;", "Ljava/util/Locale;", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.model.CountryCodeKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CountryCode3 {
    public static final CountryCode getCountryCode(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        CountryCode.Companion companion = CountryCode.INSTANCE;
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return companion.create(country);
    }
}
