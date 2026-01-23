package crypto_perpetuals.settlement.p441v1;

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
/* compiled from: SettlementType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SETTLEMENT_TYPE_UNSPECIFIED", "SETTLEMENT_TYPE_PERIODIC", "SETTLEMENT_TYPE_CLOSE", "Companion", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SettlementType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SettlementType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SettlementType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SettlementType SETTLEMENT_TYPE_CLOSE;
    public static final SettlementType SETTLEMENT_TYPE_PERIODIC;
    public static final SettlementType SETTLEMENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ SettlementType[] $values() {
        return new SettlementType[]{SETTLEMENT_TYPE_UNSPECIFIED, SETTLEMENT_TYPE_PERIODIC, SETTLEMENT_TYPE_CLOSE};
    }

    @JvmStatic
    public static final SettlementType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SettlementType> getEntries() {
        return $ENTRIES;
    }

    private SettlementType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SettlementType settlementType = new SettlementType("SETTLEMENT_TYPE_UNSPECIFIED", 0, 0);
        SETTLEMENT_TYPE_UNSPECIFIED = settlementType;
        SETTLEMENT_TYPE_PERIODIC = new SettlementType("SETTLEMENT_TYPE_PERIODIC", 1, 1);
        SETTLEMENT_TYPE_CLOSE = new SettlementType("SETTLEMENT_TYPE_CLOSE", 2, 2);
        SettlementType[] settlementTypeArr$values = $values();
        $VALUES = settlementTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(settlementTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SettlementType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SettlementType>(orCreateKotlinClass, syntax, settlementType) { // from class: crypto_perpetuals.settlement.v1.SettlementType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SettlementType fromValue(int value) {
                return SettlementType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SettlementType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/settlement/v1/SettlementType;", "fromValue", "value", "", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SettlementType fromValue(int value) {
            if (value == 0) {
                return SettlementType.SETTLEMENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return SettlementType.SETTLEMENT_TYPE_PERIODIC;
            }
            if (value != 2) {
                return null;
            }
            return SettlementType.SETTLEMENT_TYPE_CLOSE;
        }
    }

    public static SettlementType valueOf(String str) {
        return (SettlementType) Enum.valueOf(SettlementType.class, str);
    }

    public static SettlementType[] values() {
        return (SettlementType[]) $VALUES.clone();
    }
}
