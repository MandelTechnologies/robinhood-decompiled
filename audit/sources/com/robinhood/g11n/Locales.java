package com.robinhood.g11n;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: Locales.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/g11n/Locales;", "", "<init>", "()V", "EN_SG", "Ljava/util/Locale;", "getEN_SG", "()Ljava/util/Locale;", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Locales {
    public static final Locales INSTANCE = new Locales();
    private static final Locale EN_SG = new Locale("en", CountryCode.COUNTRY_CODE_SG);

    private Locales() {
    }

    public final Locale getEN_SG() {
        return EN_SG;
    }
}
