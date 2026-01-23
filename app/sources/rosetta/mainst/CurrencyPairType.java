package rosetta.mainst;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrencyPairType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/mainst/CurrencyPairType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_PAIR_TYPE_UNSPECIFIED", "CURRENCY_PAIR_FOREX", "CURRENCY_PAIR_CRYPTO", "CURRENCY_PAIR_CRYPTO_PERPETUAL", "CURRENCY_PAIR_TOKENIZED_STOCK", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CurrencyPairType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyPairType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CurrencyPairType> ADAPTER;
    public static final CurrencyPairType CURRENCY_PAIR_CRYPTO;
    public static final CurrencyPairType CURRENCY_PAIR_CRYPTO_PERPETUAL;
    public static final CurrencyPairType CURRENCY_PAIR_FOREX;
    public static final CurrencyPairType CURRENCY_PAIR_TOKENIZED_STOCK;
    public static final CurrencyPairType CURRENCY_PAIR_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CurrencyPairType[] $values() {
        return new CurrencyPairType[]{CURRENCY_PAIR_TYPE_UNSPECIFIED, CURRENCY_PAIR_FOREX, CURRENCY_PAIR_CRYPTO, CURRENCY_PAIR_CRYPTO_PERPETUAL, CURRENCY_PAIR_TOKENIZED_STOCK};
    }

    @JvmStatic
    public static final CurrencyPairType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CurrencyPairType> getEntries() {
        return $ENTRIES;
    }

    private CurrencyPairType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CurrencyPairType currencyPairType = new CurrencyPairType("CURRENCY_PAIR_TYPE_UNSPECIFIED", 0, 0);
        CURRENCY_PAIR_TYPE_UNSPECIFIED = currencyPairType;
        CURRENCY_PAIR_FOREX = new CurrencyPairType("CURRENCY_PAIR_FOREX", 1, 1);
        CURRENCY_PAIR_CRYPTO = new CurrencyPairType("CURRENCY_PAIR_CRYPTO", 2, 2);
        CURRENCY_PAIR_CRYPTO_PERPETUAL = new CurrencyPairType("CURRENCY_PAIR_CRYPTO_PERPETUAL", 3, 3);
        CURRENCY_PAIR_TOKENIZED_STOCK = new CurrencyPairType("CURRENCY_PAIR_TOKENIZED_STOCK", 4, 4);
        CurrencyPairType[] currencyPairTypeArr$values = $values();
        $VALUES = currencyPairTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyPairTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CurrencyPairType>(orCreateKotlinClass, syntax, currencyPairType) { // from class: rosetta.mainst.CurrencyPairType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CurrencyPairType fromValue(int value) {
                return CurrencyPairType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CurrencyPairType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/CurrencyPairType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/CurrencyPairType;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CurrencyPairType fromValue(int value) {
            if (value == 0) {
                return CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return CurrencyPairType.CURRENCY_PAIR_FOREX;
            }
            if (value == 2) {
                return CurrencyPairType.CURRENCY_PAIR_CRYPTO;
            }
            if (value == 3) {
                return CurrencyPairType.CURRENCY_PAIR_CRYPTO_PERPETUAL;
            }
            if (value != 4) {
                return null;
            }
            return CurrencyPairType.CURRENCY_PAIR_TOKENIZED_STOCK;
        }
    }

    public static CurrencyPairType valueOf(String str) {
        return (CurrencyPairType) Enum.valueOf(CurrencyPairType.class, str);
    }

    public static CurrencyPairType[] values() {
        return (CurrencyPairType[]) $VALUES.clone();
    }
}
