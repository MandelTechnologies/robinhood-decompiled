package hippo.model.p469v1;

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
/* compiled from: EquityQuantityType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lhippo/model/v1/EquityQuantityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EQUITY_QUANTITY_TYPE_UNSPECIFIED", "EQUITY_QUANTITY_TYPE_DOLLAR", "EQUITY_QUANTITY_TYPE_SHARE", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EquityQuantityType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityQuantityType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<EquityQuantityType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EquityQuantityType EQUITY_QUANTITY_TYPE_DOLLAR;
    public static final EquityQuantityType EQUITY_QUANTITY_TYPE_SHARE;
    public static final EquityQuantityType EQUITY_QUANTITY_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EquityQuantityType[] $values() {
        return new EquityQuantityType[]{EQUITY_QUANTITY_TYPE_UNSPECIFIED, EQUITY_QUANTITY_TYPE_DOLLAR, EQUITY_QUANTITY_TYPE_SHARE};
    }

    @JvmStatic
    public static final EquityQuantityType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<EquityQuantityType> getEntries() {
        return $ENTRIES;
    }

    private EquityQuantityType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final EquityQuantityType equityQuantityType = new EquityQuantityType("EQUITY_QUANTITY_TYPE_UNSPECIFIED", 0, 0);
        EQUITY_QUANTITY_TYPE_UNSPECIFIED = equityQuantityType;
        EQUITY_QUANTITY_TYPE_DOLLAR = new EquityQuantityType("EQUITY_QUANTITY_TYPE_DOLLAR", 1, 1);
        EQUITY_QUANTITY_TYPE_SHARE = new EquityQuantityType("EQUITY_QUANTITY_TYPE_SHARE", 2, 2);
        EquityQuantityType[] equityQuantityTypeArr$values = $values();
        $VALUES = equityQuantityTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityQuantityTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityQuantityType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EquityQuantityType>(orCreateKotlinClass, syntax, equityQuantityType) { // from class: hippo.model.v1.EquityQuantityType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public EquityQuantityType fromValue(int value) {
                return EquityQuantityType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: EquityQuantityType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/EquityQuantityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/EquityQuantityType;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityQuantityType fromValue(int value) {
            if (value == 0) {
                return EquityQuantityType.EQUITY_QUANTITY_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return EquityQuantityType.EQUITY_QUANTITY_TYPE_DOLLAR;
            }
            if (value != 2) {
                return null;
            }
            return EquityQuantityType.EQUITY_QUANTITY_TYPE_SHARE;
        }
    }

    public static EquityQuantityType valueOf(String str) {
        return (EquityQuantityType) Enum.valueOf(EquityQuantityType.class, str);
    }

    public static EquityQuantityType[] values() {
        return (EquityQuantityType[]) $VALUES.clone();
    }
}
