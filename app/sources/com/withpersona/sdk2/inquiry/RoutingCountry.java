package com.withpersona.sdk2.inquiry;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RoutingCountry.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/RoutingCountry;", "", "<init>", "(Ljava/lang/String;I)V", CountryCode.COUNTRY_CODE_DE, CountryCode.COUNTRY_CODE_US, "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RoutingCountry {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoutingCountry[] $VALUES;

    /* renamed from: DE */
    public static final RoutingCountry f6495DE = new RoutingCountry(CountryCode.COUNTRY_CODE_DE, 0);

    /* renamed from: US */
    public static final RoutingCountry f6496US = new RoutingCountry(CountryCode.COUNTRY_CODE_US, 1);

    private static final /* synthetic */ RoutingCountry[] $values() {
        return new RoutingCountry[]{f6495DE, f6496US};
    }

    public static EnumEntries<RoutingCountry> getEntries() {
        return $ENTRIES;
    }

    private RoutingCountry(String str, int i) {
    }

    static {
        RoutingCountry[] routingCountryArr$values = $values();
        $VALUES = routingCountryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(routingCountryArr$values);
    }

    public static RoutingCountry valueOf(String str) {
        return (RoutingCountry) Enum.valueOf(RoutingCountry.class, str);
    }

    public static RoutingCountry[] values() {
        return (RoutingCountry[]) $VALUES.clone();
    }
}
