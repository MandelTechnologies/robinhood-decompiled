package rosetta.account;

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
/* compiled from: BrokerageAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lrosetta/account/BrokerageAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED", "INDIVIDUAL", "IRA_TRADITIONAL", "IRA_ROTH", "IRA_TRADITIONAL_INHERITED", "IRA_ROTH_INHERITED", "JOINT_TENANCY_WITH_ROS", "CUSTODIAL_UGMA", "CUSTODIAL_UTMA", "ISA_STOCKS_AND_SHARES", "Companion", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class BrokerageAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageAccountType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BrokerageAccountType> ADAPTER;
    public static final BrokerageAccountType BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
    public static final BrokerageAccountType CUSTODIAL_UGMA;
    public static final BrokerageAccountType CUSTODIAL_UTMA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BrokerageAccountType INDIVIDUAL;
    public static final BrokerageAccountType IRA_ROTH;
    public static final BrokerageAccountType IRA_ROTH_INHERITED;
    public static final BrokerageAccountType IRA_TRADITIONAL;
    public static final BrokerageAccountType IRA_TRADITIONAL_INHERITED;
    public static final BrokerageAccountType ISA_STOCKS_AND_SHARES;
    public static final BrokerageAccountType JOINT_TENANCY_WITH_ROS;
    private final int value;

    private static final /* synthetic */ BrokerageAccountType[] $values() {
        return new BrokerageAccountType[]{BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED, INDIVIDUAL, IRA_TRADITIONAL, IRA_ROTH, IRA_TRADITIONAL_INHERITED, IRA_ROTH_INHERITED, JOINT_TENANCY_WITH_ROS, CUSTODIAL_UGMA, CUSTODIAL_UTMA, ISA_STOCKS_AND_SHARES};
    }

    @JvmStatic
    public static final BrokerageAccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BrokerageAccountType> getEntries() {
        return $ENTRIES;
    }

    private BrokerageAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BrokerageAccountType brokerageAccountType = new BrokerageAccountType("BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED = brokerageAccountType;
        INDIVIDUAL = new BrokerageAccountType("INDIVIDUAL", 1, 1);
        IRA_TRADITIONAL = new BrokerageAccountType("IRA_TRADITIONAL", 2, 2);
        IRA_ROTH = new BrokerageAccountType("IRA_ROTH", 3, 3);
        IRA_TRADITIONAL_INHERITED = new BrokerageAccountType("IRA_TRADITIONAL_INHERITED", 4, 4);
        IRA_ROTH_INHERITED = new BrokerageAccountType("IRA_ROTH_INHERITED", 5, 5);
        JOINT_TENANCY_WITH_ROS = new BrokerageAccountType("JOINT_TENANCY_WITH_ROS", 6, 6);
        CUSTODIAL_UGMA = new BrokerageAccountType("CUSTODIAL_UGMA", 7, 7);
        CUSTODIAL_UTMA = new BrokerageAccountType("CUSTODIAL_UTMA", 8, 8);
        ISA_STOCKS_AND_SHARES = new BrokerageAccountType("ISA_STOCKS_AND_SHARES", 9, 9);
        BrokerageAccountType[] brokerageAccountTypeArr$values = $values();
        $VALUES = brokerageAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokerageAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BrokerageAccountType>(orCreateKotlinClass, syntax, brokerageAccountType) { // from class: rosetta.account.BrokerageAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BrokerageAccountType fromValue(int value) {
                return BrokerageAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BrokerageAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/account/BrokerageAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/account/BrokerageAccountType;", "fromValue", "value", "", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BrokerageAccountType fromValue(int value) {
            switch (value) {
                case 0:
                    return BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                case 1:
                    return BrokerageAccountType.INDIVIDUAL;
                case 2:
                    return BrokerageAccountType.IRA_TRADITIONAL;
                case 3:
                    return BrokerageAccountType.IRA_ROTH;
                case 4:
                    return BrokerageAccountType.IRA_TRADITIONAL_INHERITED;
                case 5:
                    return BrokerageAccountType.IRA_ROTH_INHERITED;
                case 6:
                    return BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                case 7:
                    return BrokerageAccountType.CUSTODIAL_UGMA;
                case 8:
                    return BrokerageAccountType.CUSTODIAL_UTMA;
                case 9:
                    return BrokerageAccountType.ISA_STOCKS_AND_SHARES;
                default:
                    return null;
            }
        }
    }

    public static BrokerageAccountType valueOf(String str) {
        return (BrokerageAccountType) Enum.valueOf(BrokerageAccountType.class, str);
    }

    public static BrokerageAccountType[] values() {
        return (BrokerageAccountType[]) $VALUES.clone();
    }
}
