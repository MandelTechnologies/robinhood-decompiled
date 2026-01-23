package equity_trading_tax_lots.proto.p460v1;

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
/* compiled from: TaxLotTerm.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAX_LOT_TERM_UNSPECIFIED", "SHORT_TERM", "LONG_TERM", "MIXED_TERM", "OTHER_TERM", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TaxLotTerm implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLotTerm[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TaxLotTerm> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaxLotTerm LONG_TERM;
    public static final TaxLotTerm MIXED_TERM;
    public static final TaxLotTerm OTHER_TERM;
    public static final TaxLotTerm SHORT_TERM;
    public static final TaxLotTerm TAX_LOT_TERM_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TaxLotTerm[] $values() {
        return new TaxLotTerm[]{TAX_LOT_TERM_UNSPECIFIED, SHORT_TERM, LONG_TERM, MIXED_TERM, OTHER_TERM};
    }

    @JvmStatic
    public static final TaxLotTerm fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TaxLotTerm> getEntries() {
        return $ENTRIES;
    }

    private TaxLotTerm(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TaxLotTerm taxLotTerm = new TaxLotTerm("TAX_LOT_TERM_UNSPECIFIED", 0, 0);
        TAX_LOT_TERM_UNSPECIFIED = taxLotTerm;
        SHORT_TERM = new TaxLotTerm("SHORT_TERM", 1, 1);
        LONG_TERM = new TaxLotTerm("LONG_TERM", 2, 2);
        MIXED_TERM = new TaxLotTerm("MIXED_TERM", 3, 3);
        OTHER_TERM = new TaxLotTerm("OTHER_TERM", 4, 4);
        TaxLotTerm[] taxLotTermArr$values = $values();
        $VALUES = taxLotTermArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLotTermArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotTerm.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TaxLotTerm>(orCreateKotlinClass, syntax, taxLotTerm) { // from class: equity_trading_tax_lots.proto.v1.TaxLotTerm$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TaxLotTerm fromValue(int value) {
                return TaxLotTerm.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TaxLotTerm.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotTerm$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "fromValue", "value", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxLotTerm fromValue(int value) {
            if (value == 0) {
                return TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED;
            }
            if (value == 1) {
                return TaxLotTerm.SHORT_TERM;
            }
            if (value == 2) {
                return TaxLotTerm.LONG_TERM;
            }
            if (value == 3) {
                return TaxLotTerm.MIXED_TERM;
            }
            if (value != 4) {
                return null;
            }
            return TaxLotTerm.OTHER_TERM;
        }
    }

    public static TaxLotTerm valueOf(String str) {
        return (TaxLotTerm) Enum.valueOf(TaxLotTerm.class, str);
    }

    public static TaxLotTerm[] values() {
        return (TaxLotTerm[]) $VALUES.clone();
    }
}
