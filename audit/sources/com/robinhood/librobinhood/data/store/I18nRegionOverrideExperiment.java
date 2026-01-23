package com.robinhood.librobinhood.data.store;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: I18nRegionOverrideExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/I18nRegionOverrideExperiment;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/librobinhood/data/store/I18nRegionOverrideExperiment$Variant;", "<init>", "()V", "Variant", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class I18nRegionOverrideExperiment extends DeviceIdExperiment<Variant> {
    public static final I18nRegionOverrideExperiment INSTANCE = new I18nRegionOverrideExperiment();

    private I18nRegionOverrideExperiment() {
        super("i18n-region-override", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: I18nRegionOverrideExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/I18nRegionOverrideExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", CountryCode.COUNTRY_CODE_GB, CountryCode.COUNTRY_CODE_SG, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_TW, CountryCode.COUNTRY_CODE_HK, CountryCode.COUNTRY_CODE_MY, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_TH, CountryCode.COUNTRY_CODE_IN, "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        private final String serverValue;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);

        /* renamed from: GB */
        public static final Variant f5269GB = new Variant(CountryCode.COUNTRY_CODE_GB, 1, "gb");

        /* renamed from: SG */
        public static final Variant f5274SG = new Variant(CountryCode.COUNTRY_CODE_SG, 2, "sg");

        /* renamed from: VN */
        public static final Variant f5277VN = new Variant(CountryCode.COUNTRY_CODE_VN, 3, "vn");

        /* renamed from: TW */
        public static final Variant f5276TW = new Variant(CountryCode.COUNTRY_CODE_TW, 4, "tw");

        /* renamed from: HK */
        public static final Variant f5270HK = new Variant(CountryCode.COUNTRY_CODE_HK, 5, "hk");

        /* renamed from: MY */
        public static final Variant f5273MY = new Variant(CountryCode.COUNTRY_CODE_MY, 6, "my");

        /* renamed from: ID */
        public static final Variant f5271ID = new Variant(CountryCode.COUNTRY_CODE_ID, 7, "id");

        /* renamed from: TH */
        public static final Variant f5275TH = new Variant(CountryCode.COUNTRY_CODE_TH, 8, "th");

        /* renamed from: IN */
        public static final Variant f5272IN = new Variant(CountryCode.COUNTRY_CODE_IN, 9, "in");

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, f5269GB, f5274SG, f5277VN, f5276TW, f5270HK, f5273MY, f5271ID, f5275TH, f5272IN};
        }

        public static EnumEntries<Variant> getEntries() {
            return $ENTRIES;
        }

        private Variant(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Variant[] variantArr$values = $values();
            $VALUES = variantArr$values;
            $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
            INSTANCE = new Companion(null);
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }
}
