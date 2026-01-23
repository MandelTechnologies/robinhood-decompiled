package com.robinhood.iso.countrycode;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Affiliate.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\fJ\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0096\u0002J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096\u0002R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/Affiliate;", "", "countries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCountries", "()Ljava/util/Set;", "contains", "", PlaceTypes.COUNTRY, "Lcom/robinhood/iso/countrycode/CountryCode;", "plus", "RHSG", "Lcom/robinhood/iso/countrycode/Affiliate$RHSG;", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface Affiliate {
    boolean contains(CountryCode.Supported country);

    boolean contains(CountryCode country);

    Set<CountryCode.Supported> getCountries();

    Set<CountryCode.Supported> plus(CountryCode.Supported country);

    Set<CountryCode.Supported> plus(Set<? extends CountryCode.Supported> countries);

    /* compiled from: Affiliate.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/Affiliate$RHSG;", "Lcom/robinhood/iso/countrycode/Affiliate;", "<init>", "()V", "countries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCountries", "()Ljava/util/Set;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RHSG implements Affiliate {
        public static final RHSG INSTANCE = new RHSG();
        private static final Set<CountryCode.Supported> countries = SetsKt.setOf((Object[]) new CountryCode.Supported[]{CountryCode.Supported.Singapore.INSTANCE, CountryCode.Supported.Vietnam.INSTANCE, CountryCode.Supported.HongKongSARChina.INSTANCE, CountryCode.Supported.Taiwan.INSTANCE, CountryCode.Supported.Malaysia.INSTANCE, CountryCode.Supported.Indonesia.INSTANCE, CountryCode.Supported.Thailand.INSTANCE, CountryCode.Supported.India.INSTANCE});

        public boolean equals(Object other) {
            return this == other || (other instanceof RHSG);
        }

        public int hashCode() {
            return -1182505996;
        }

        public String toString() {
            return "RHSG";
        }

        private RHSG() {
        }

        @Override // com.robinhood.iso.countrycode.Affiliate
        public boolean contains(CountryCode.Supported supported) {
            return DefaultImpls.contains((Affiliate) this, supported);
        }

        @Override // com.robinhood.iso.countrycode.Affiliate
        public boolean contains(CountryCode countryCode) {
            return DefaultImpls.contains(this, countryCode);
        }

        @Override // com.robinhood.iso.countrycode.Affiliate
        public Set<CountryCode.Supported> plus(CountryCode.Supported supported) {
            return DefaultImpls.plus(this, supported);
        }

        @Override // com.robinhood.iso.countrycode.Affiliate
        public Set<CountryCode.Supported> plus(Set<? extends CountryCode.Supported> set) {
            return DefaultImpls.plus(this, set);
        }

        @Override // com.robinhood.iso.countrycode.Affiliate
        public Set<CountryCode.Supported> getCountries() {
            return countries;
        }
    }

    /* compiled from: Affiliate.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean contains(Affiliate affiliate, CountryCode countryCode) {
            return CollectionsKt.contains(affiliate.getCountries(), countryCode);
        }

        public static boolean contains(Affiliate affiliate, CountryCode.Supported supported) {
            return CollectionsKt.contains(affiliate.getCountries(), supported);
        }

        public static Set<CountryCode.Supported> plus(Affiliate affiliate, CountryCode.Supported country) {
            Intrinsics.checkNotNullParameter(country, "country");
            return SetsKt.plus(affiliate.getCountries(), country);
        }

        public static Set<CountryCode.Supported> plus(Affiliate affiliate, Set<? extends CountryCode.Supported> countries) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            return SetsKt.plus((Set) affiliate.getCountries(), (Iterable) countries);
        }
    }
}
