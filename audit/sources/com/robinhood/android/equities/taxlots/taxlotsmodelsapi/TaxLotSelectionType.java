package com.robinhood.android.equities.taxlots.taxlotsmodelsapi;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxLotSelectionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CUSTOM", "FIFO", "LIFO", "HIGHEST_COST", "LOWEST_COST", "Companion", "lib-tax-lots-models-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TaxLotSelectionType implements RhEnum<TaxLotSelectionType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLotSelectionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final TaxLotSelectionType CUSTOM = new TaxLotSelectionType("CUSTOM", 0, "custom");
    public static final TaxLotSelectionType FIFO = new TaxLotSelectionType("FIFO", 1, "fifo");
    public static final TaxLotSelectionType LIFO = new TaxLotSelectionType("LIFO", 2, "lifo");
    public static final TaxLotSelectionType HIGHEST_COST = new TaxLotSelectionType("HIGHEST_COST", 3, "highest_cost");
    public static final TaxLotSelectionType LOWEST_COST = new TaxLotSelectionType("LOWEST_COST", 4, "lowest_cost");

    private static final /* synthetic */ TaxLotSelectionType[] $values() {
        return new TaxLotSelectionType[]{CUSTOM, FIFO, LIFO, HIGHEST_COST, LOWEST_COST};
    }

    @JvmStatic
    public static TaxLotSelectionType fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<TaxLotSelectionType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(TaxLotSelectionType taxLotSelectionType) {
        return INSTANCE.toServerValue(taxLotSelectionType);
    }

    private TaxLotSelectionType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        TaxLotSelectionType[] taxLotSelectionTypeArr$values = $values();
        $VALUES = taxLotSelectionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLotSelectionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TaxLotSelectionType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Required;", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-tax-lots-models-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Required<TaxLotSelectionType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(TaxLotSelectionType.values());
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(TaxLotSelectionType enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Required, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public TaxLotSelectionType fromServerValue(String serverValue) {
            return (TaxLotSelectionType) super.fromServerValue(serverValue);
        }
    }

    public static TaxLotSelectionType valueOf(String str) {
        return (TaxLotSelectionType) Enum.valueOf(TaxLotSelectionType.class, str);
    }

    public static TaxLotSelectionType[] values() {
        return (TaxLotSelectionType[]) $VALUES.clone();
    }
}
