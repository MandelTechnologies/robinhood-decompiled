package com.robinhood.g11n.iso;

import com.robinhood.enums.RhEnum;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegionCode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/g11n/iso/RegionCode;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "EU", CountryCode.COUNTRY_CODE_US, "Companion", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RegionCode implements RhEnum<RegionCode> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegionCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: EU */
    public static final RegionCode f5251EU = new RegionCode("EU", 0, "eu");

    /* renamed from: US */
    public static final RegionCode f5252US = new RegionCode(CountryCode.COUNTRY_CODE_US, 1, "us");
    private final String serverValue;

    private static final /* synthetic */ RegionCode[] $values() {
        return new RegionCode[]{f5251EU, f5252US};
    }

    @JvmStatic
    public static RegionCode fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<RegionCode> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(RegionCode regionCode) {
        return INSTANCE.toServerValue(regionCode);
    }

    private RegionCode(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RegionCode[] regionCodeArr$values = $values();
        $VALUES = regionCodeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(regionCodeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: RegionCode.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/g11n/iso/RegionCode$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Required;", "Lcom/robinhood/g11n/iso/RegionCode;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    public static final class Companion extends RhEnum.Converter.Required<RegionCode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) RegionCode.getEntries().toArray(new RegionCode[0]));
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(RegionCode enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Required, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public RegionCode fromServerValue(String serverValue) {
            return (RegionCode) super.fromServerValue(serverValue);
        }
    }

    public static RegionCode valueOf(String str) {
        return (RegionCode) Enum.valueOf(RegionCode.class, str);
    }

    public static RegionCode[] values() {
        return (RegionCode[]) $VALUES.clone();
    }
}
