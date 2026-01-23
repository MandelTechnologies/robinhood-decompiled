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
/* compiled from: SecurityType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, m3636d2 = {"Lrosetta/mainst/SecurityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECURITY_TYPE_UNSPECIFIED", "ADR", "CEF", "CONTRA", "ESCROW", "ETP", "LP", "MLP", "NYRS", "OPEN_ENDED_FUND", "PFD", "PRE_FILING", "PRE_IPO", "REIT", "RIGHT", "RLT", "STOCK", "TRACKING", "UNIT", "WHEN_ISSUED", "WRT", "CVR", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SecurityType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SecurityType> ADAPTER;
    public static final SecurityType ADR;
    public static final SecurityType CEF;
    public static final SecurityType CONTRA;
    public static final SecurityType CVR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SecurityType ESCROW;
    public static final SecurityType ETP;

    /* renamed from: LP */
    public static final SecurityType f8172LP;
    public static final SecurityType MLP;
    public static final SecurityType NYRS;
    public static final SecurityType OPEN_ENDED_FUND;
    public static final SecurityType PFD;
    public static final SecurityType PRE_FILING;
    public static final SecurityType PRE_IPO;
    public static final SecurityType REIT;
    public static final SecurityType RIGHT;
    public static final SecurityType RLT;
    public static final SecurityType SECURITY_TYPE_UNSPECIFIED;
    public static final SecurityType STOCK;
    public static final SecurityType TRACKING;
    public static final SecurityType UNIT;
    public static final SecurityType WHEN_ISSUED;
    public static final SecurityType WRT;
    private final int value;

    private static final /* synthetic */ SecurityType[] $values() {
        return new SecurityType[]{SECURITY_TYPE_UNSPECIFIED, ADR, CEF, CONTRA, ESCROW, ETP, f8172LP, MLP, NYRS, OPEN_ENDED_FUND, PFD, PRE_FILING, PRE_IPO, REIT, RIGHT, RLT, STOCK, TRACKING, UNIT, WHEN_ISSUED, WRT, CVR};
    }

    @JvmStatic
    public static final SecurityType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SecurityType> getEntries() {
        return $ENTRIES;
    }

    private SecurityType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SecurityType securityType = new SecurityType("SECURITY_TYPE_UNSPECIFIED", 0, 0);
        SECURITY_TYPE_UNSPECIFIED = securityType;
        ADR = new SecurityType("ADR", 1, 1);
        CEF = new SecurityType("CEF", 2, 2);
        CONTRA = new SecurityType("CONTRA", 3, 3);
        ESCROW = new SecurityType("ESCROW", 4, 4);
        ETP = new SecurityType("ETP", 5, 5);
        f8172LP = new SecurityType("LP", 6, 6);
        MLP = new SecurityType("MLP", 7, 7);
        NYRS = new SecurityType("NYRS", 8, 8);
        OPEN_ENDED_FUND = new SecurityType("OPEN_ENDED_FUND", 9, 9);
        PFD = new SecurityType("PFD", 10, 10);
        PRE_FILING = new SecurityType("PRE_FILING", 11, 11);
        PRE_IPO = new SecurityType("PRE_IPO", 12, 12);
        REIT = new SecurityType("REIT", 13, 13);
        RIGHT = new SecurityType("RIGHT", 14, 14);
        RLT = new SecurityType("RLT", 15, 15);
        STOCK = new SecurityType("STOCK", 16, 16);
        TRACKING = new SecurityType("TRACKING", 17, 17);
        UNIT = new SecurityType("UNIT", 18, 18);
        WHEN_ISSUED = new SecurityType("WHEN_ISSUED", 19, 19);
        WRT = new SecurityType("WRT", 20, 20);
        CVR = new SecurityType("CVR", 21, 21);
        SecurityType[] securityTypeArr$values = $values();
        $VALUES = securityTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(securityTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SecurityType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SecurityType>(orCreateKotlinClass, syntax, securityType) { // from class: rosetta.mainst.SecurityType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SecurityType fromValue(int value) {
                return SecurityType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SecurityType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/SecurityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/SecurityType;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SecurityType fromValue(int value) {
            switch (value) {
                case 0:
                    return SecurityType.SECURITY_TYPE_UNSPECIFIED;
                case 1:
                    return SecurityType.ADR;
                case 2:
                    return SecurityType.CEF;
                case 3:
                    return SecurityType.CONTRA;
                case 4:
                    return SecurityType.ESCROW;
                case 5:
                    return SecurityType.ETP;
                case 6:
                    return SecurityType.f8172LP;
                case 7:
                    return SecurityType.MLP;
                case 8:
                    return SecurityType.NYRS;
                case 9:
                    return SecurityType.OPEN_ENDED_FUND;
                case 10:
                    return SecurityType.PFD;
                case 11:
                    return SecurityType.PRE_FILING;
                case 12:
                    return SecurityType.PRE_IPO;
                case 13:
                    return SecurityType.REIT;
                case 14:
                    return SecurityType.RIGHT;
                case 15:
                    return SecurityType.RLT;
                case 16:
                    return SecurityType.STOCK;
                case 17:
                    return SecurityType.TRACKING;
                case 18:
                    return SecurityType.UNIT;
                case 19:
                    return SecurityType.WHEN_ISSUED;
                case 20:
                    return SecurityType.WRT;
                case 21:
                    return SecurityType.CVR;
                default:
                    return null;
            }
        }
    }

    public static SecurityType valueOf(String str) {
        return (SecurityType) Enum.valueOf(SecurityType.class, str);
    }

    public static SecurityType[] values() {
        return (SecurityType[]) $VALUES.clone();
    }
}
