package com.robinhood.android.mcw.contracts;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrencyConversionDeeplinkSource.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "PDT_RESOLUTION", "UNKNOWN", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConversionDeeplinkSource implements RhEnum<CurrencyConversionDeeplinkSource> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyConversionDeeplinkSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CurrencyConversionDeeplinkSource PDT_RESOLUTION = new CurrencyConversionDeeplinkSource("PDT_RESOLUTION", 0, "pdt_resolution");
    public static final CurrencyConversionDeeplinkSource UNKNOWN = new CurrencyConversionDeeplinkSource("UNKNOWN", 1, "unknown");
    private final String serverValue;

    private static final /* synthetic */ CurrencyConversionDeeplinkSource[] $values() {
        return new CurrencyConversionDeeplinkSource[]{PDT_RESOLUTION, UNKNOWN};
    }

    public static EnumEntries<CurrencyConversionDeeplinkSource> getEntries() {
        return $ENTRIES;
    }

    private CurrencyConversionDeeplinkSource(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        CurrencyConversionDeeplinkSource[] currencyConversionDeeplinkSourceArr$values = $values();
        $VALUES = currencyConversionDeeplinkSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyConversionDeeplinkSourceArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CurrencyConversionDeeplinkSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "<init>", "()V", "fromQueryParam", "param", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends RhEnum.Converter.Optional<CurrencyConversionDeeplinkSource> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) CurrencyConversionDeeplinkSource.getEntries().toArray(new CurrencyConversionDeeplinkSource[0]), false, 2, null);
        }

        public final CurrencyConversionDeeplinkSource fromQueryParam(String param) {
            CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource = CurrencyConversionDeeplinkSource.PDT_RESOLUTION;
            return Intrinsics.areEqual(param, currencyConversionDeeplinkSource.getServerValue()) ? currencyConversionDeeplinkSource : CurrencyConversionDeeplinkSource.UNKNOWN;
        }
    }

    public static CurrencyConversionDeeplinkSource valueOf(String str) {
        return (CurrencyConversionDeeplinkSource) Enum.valueOf(CurrencyConversionDeeplinkSource.class, str);
    }

    public static CurrencyConversionDeeplinkSource[] values() {
        return (CurrencyConversionDeeplinkSource[]) $VALUES.clone();
    }
}
