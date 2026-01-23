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
/* compiled from: CurrencyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrosetta/mainst/CurrencyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_TYPE_UNSPECIFIED", "FIAT", "CRYPTOCURRENCY", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CurrencyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CurrencyType> ADAPTER;
    public static final CurrencyType CRYPTOCURRENCY;
    public static final CurrencyType CURRENCY_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CurrencyType FIAT;
    private final int value;

    private static final /* synthetic */ CurrencyType[] $values() {
        return new CurrencyType[]{CURRENCY_TYPE_UNSPECIFIED, FIAT, CRYPTOCURRENCY};
    }

    @JvmStatic
    public static final CurrencyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CurrencyType> getEntries() {
        return $ENTRIES;
    }

    private CurrencyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CurrencyType currencyType = new CurrencyType("CURRENCY_TYPE_UNSPECIFIED", 0, 0);
        CURRENCY_TYPE_UNSPECIFIED = currencyType;
        FIAT = new CurrencyType("FIAT", 1, 1);
        CRYPTOCURRENCY = new CurrencyType("CRYPTOCURRENCY", 2, 2);
        CurrencyType[] currencyTypeArr$values = $values();
        $VALUES = currencyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CurrencyType>(orCreateKotlinClass, syntax, currencyType) { // from class: rosetta.mainst.CurrencyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CurrencyType fromValue(int value) {
                return CurrencyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CurrencyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/CurrencyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/CurrencyType;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CurrencyType fromValue(int value) {
            if (value == 0) {
                return CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return CurrencyType.FIAT;
            }
            if (value != 2) {
                return null;
            }
            return CurrencyType.CRYPTOCURRENCY;
        }
    }

    public static CurrencyType valueOf(String str) {
        return (CurrencyType) Enum.valueOf(CurrencyType.class, str);
    }

    public static CurrencyType[] values() {
        return (CurrencyType[]) $VALUES.clone();
    }
}
