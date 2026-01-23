package com.robinhood.android.stringscodegen.runtime;

import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CountryGroups.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/stringscodegen/runtime/CountryGroups;", "", "<init>", "()V", "EU_COUNTRIES", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getEU_COUNTRIES$annotations", "getEU_COUNTRIES", "()Ljava/util/Set;", "RHSG_COUNTRIES", "getRHSG_COUNTRIES$annotations", "getRHSG_COUNTRIES", "lib-strings-codegen-runtime_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CountryGroups {
    public static final CountryGroups INSTANCE = new CountryGroups();
    private static final Set<CountryCode.Supported> EU_COUNTRIES = CountryCode.Supported.INSTANCE.getEU_COUNTRIES();
    private static final Set<CountryCode.Supported> RHSG_COUNTRIES = Affiliate.RHSG.INSTANCE.getCountries();

    public static /* synthetic */ void getEU_COUNTRIES$annotations() {
    }

    public static /* synthetic */ void getRHSG_COUNTRIES$annotations() {
    }

    private CountryGroups() {
    }

    public final Set<CountryCode.Supported> getEU_COUNTRIES() {
        return EU_COUNTRIES;
    }

    public final Set<CountryCode.Supported> getRHSG_COUNTRIES() {
        return RHSG_COUNTRIES;
    }
}
