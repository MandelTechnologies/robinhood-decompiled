package crypto_perpetuals.position.p439v1;

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
/* compiled from: LiquidationRisk.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/LiquidationRisk;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIQUIDATION_RISK_UNSPECIFIED", "NO_RISK", "AT_RISK", "HIGH_RISK", "Companion", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class LiquidationRisk implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LiquidationRisk[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LiquidationRisk> ADAPTER;
    public static final LiquidationRisk AT_RISK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LiquidationRisk HIGH_RISK;
    public static final LiquidationRisk LIQUIDATION_RISK_UNSPECIFIED;
    public static final LiquidationRisk NO_RISK;
    private final int value;

    private static final /* synthetic */ LiquidationRisk[] $values() {
        return new LiquidationRisk[]{LIQUIDATION_RISK_UNSPECIFIED, NO_RISK, AT_RISK, HIGH_RISK};
    }

    @JvmStatic
    public static final LiquidationRisk fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LiquidationRisk> getEntries() {
        return $ENTRIES;
    }

    private LiquidationRisk(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LiquidationRisk liquidationRisk = new LiquidationRisk("LIQUIDATION_RISK_UNSPECIFIED", 0, 0);
        LIQUIDATION_RISK_UNSPECIFIED = liquidationRisk;
        NO_RISK = new LiquidationRisk("NO_RISK", 1, 1);
        AT_RISK = new LiquidationRisk("AT_RISK", 2, 2);
        HIGH_RISK = new LiquidationRisk("HIGH_RISK", 3, 3);
        LiquidationRisk[] liquidationRiskArr$values = $values();
        $VALUES = liquidationRiskArr$values;
        $ENTRIES = EnumEntries2.enumEntries(liquidationRiskArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LiquidationRisk.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LiquidationRisk>(orCreateKotlinClass, syntax, liquidationRisk) { // from class: crypto_perpetuals.position.v1.LiquidationRisk$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LiquidationRisk fromValue(int value) {
                return LiquidationRisk.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LiquidationRisk.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/LiquidationRisk$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/position/v1/LiquidationRisk;", "fromValue", "value", "", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LiquidationRisk fromValue(int value) {
            if (value == 0) {
                return LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED;
            }
            if (value == 1) {
                return LiquidationRisk.NO_RISK;
            }
            if (value == 2) {
                return LiquidationRisk.AT_RISK;
            }
            if (value != 3) {
                return null;
            }
            return LiquidationRisk.HIGH_RISK;
        }
    }

    public static LiquidationRisk valueOf(String str) {
        return (LiquidationRisk) Enum.valueOf(LiquidationRisk.class, str);
    }

    public static LiquidationRisk[] values() {
        return (LiquidationRisk[]) $VALUES.clone();
    }
}
