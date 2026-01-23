package bonfire.proto.idl.transfers.p040v1;

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
/* compiled from: TransferAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/transfers/v1/TransferAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "ACH", "DCF", "RHS", "RHY", "RHCE", "IRA_TRADITIONAL", "IRA_ROTH", "IRA_TRADITIONAL_INHERITED", "IRA_ROTH_INHERITED", "UK_BANK_ACCOUNT", "I18N_BANK_ACCOUNT", "SEPA", "RCT_FIRM_ACCOUNT", "APPLE_PAY_DCF", "JOINT_TENANCY_WITH_ROS", "OUTGOING_WIRE_ACCOUNT", "RHY_BANKING", "RHUK_ISA_STOCKS_AND_SHARES", "CUSTODIAL_UGMA", "CUSTODIAL_UTMA", "Companion", "bonfire.transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TransferAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAccountType[] $VALUES;
    public static final TransferAccountType ACH;

    @JvmField
    public static final ProtoAdapter<TransferAccountType> ADAPTER;
    public static final TransferAccountType APPLE_PAY_DCF;
    public static final TransferAccountType CUSTODIAL_UGMA;
    public static final TransferAccountType CUSTODIAL_UTMA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferAccountType DCF;
    public static final TransferAccountType I18N_BANK_ACCOUNT;
    public static final TransferAccountType IRA_ROTH;
    public static final TransferAccountType IRA_ROTH_INHERITED;
    public static final TransferAccountType IRA_TRADITIONAL;
    public static final TransferAccountType IRA_TRADITIONAL_INHERITED;
    public static final TransferAccountType JOINT_TENANCY_WITH_ROS;
    public static final TransferAccountType OUTGOING_WIRE_ACCOUNT;
    public static final TransferAccountType RCT_FIRM_ACCOUNT;
    public static final TransferAccountType RHCE;
    public static final TransferAccountType RHS;
    public static final TransferAccountType RHUK_ISA_STOCKS_AND_SHARES;
    public static final TransferAccountType RHY;
    public static final TransferAccountType RHY_BANKING;
    public static final TransferAccountType SEPA;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
    public static final TransferAccountType UK_BANK_ACCOUNT;
    private final int value;

    private static final /* synthetic */ TransferAccountType[] $values() {
        return new TransferAccountType[]{TRANSFER_ACCOUNT_TYPE_UNSPECIFIED, ACH, DCF, RHS, RHY, RHCE, IRA_TRADITIONAL, IRA_ROTH, IRA_TRADITIONAL_INHERITED, IRA_ROTH_INHERITED, UK_BANK_ACCOUNT, I18N_BANK_ACCOUNT, SEPA, RCT_FIRM_ACCOUNT, APPLE_PAY_DCF, JOINT_TENANCY_WITH_ROS, OUTGOING_WIRE_ACCOUNT, RHY_BANKING, RHUK_ISA_STOCKS_AND_SHARES, CUSTODIAL_UGMA, CUSTODIAL_UTMA};
    }

    @JvmStatic
    public static final TransferAccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferAccountType> getEntries() {
        return $ENTRIES;
    }

    private TransferAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferAccountType transferAccountType = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        TRANSFER_ACCOUNT_TYPE_UNSPECIFIED = transferAccountType;
        ACH = new TransferAccountType("ACH", 1, 1);
        DCF = new TransferAccountType("DCF", 2, 2);
        RHS = new TransferAccountType("RHS", 3, 3);
        RHY = new TransferAccountType("RHY", 4, 4);
        RHCE = new TransferAccountType("RHCE", 5, 5);
        IRA_TRADITIONAL = new TransferAccountType("IRA_TRADITIONAL", 6, 6);
        IRA_ROTH = new TransferAccountType("IRA_ROTH", 7, 7);
        IRA_TRADITIONAL_INHERITED = new TransferAccountType("IRA_TRADITIONAL_INHERITED", 8, 8);
        IRA_ROTH_INHERITED = new TransferAccountType("IRA_ROTH_INHERITED", 9, 9);
        UK_BANK_ACCOUNT = new TransferAccountType("UK_BANK_ACCOUNT", 10, 10);
        I18N_BANK_ACCOUNT = new TransferAccountType("I18N_BANK_ACCOUNT", 11, 11);
        SEPA = new TransferAccountType("SEPA", 12, 12);
        RCT_FIRM_ACCOUNT = new TransferAccountType("RCT_FIRM_ACCOUNT", 13, 13);
        APPLE_PAY_DCF = new TransferAccountType("APPLE_PAY_DCF", 14, 14);
        JOINT_TENANCY_WITH_ROS = new TransferAccountType("JOINT_TENANCY_WITH_ROS", 15, 15);
        OUTGOING_WIRE_ACCOUNT = new TransferAccountType("OUTGOING_WIRE_ACCOUNT", 16, 16);
        RHY_BANKING = new TransferAccountType("RHY_BANKING", 17, 17);
        RHUK_ISA_STOCKS_AND_SHARES = new TransferAccountType("RHUK_ISA_STOCKS_AND_SHARES", 18, 18);
        CUSTODIAL_UGMA = new TransferAccountType("CUSTODIAL_UGMA", 19, 19);
        CUSTODIAL_UTMA = new TransferAccountType("CUSTODIAL_UTMA", 20, 20);
        TransferAccountType[] transferAccountTypeArr$values = $values();
        $VALUES = transferAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferAccountType>(orCreateKotlinClass, syntax, transferAccountType) { // from class: bonfire.proto.idl.transfers.v1.TransferAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferAccountType fromValue(int value) {
                return TransferAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/transfers/v1/TransferAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/transfers/v1/TransferAccountType;", "fromValue", "value", "", "bonfire.transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferAccountType fromValue(int value) {
            switch (value) {
                case 0:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                case 1:
                    return TransferAccountType.ACH;
                case 2:
                    return TransferAccountType.DCF;
                case 3:
                    return TransferAccountType.RHS;
                case 4:
                    return TransferAccountType.RHY;
                case 5:
                    return TransferAccountType.RHCE;
                case 6:
                    return TransferAccountType.IRA_TRADITIONAL;
                case 7:
                    return TransferAccountType.IRA_ROTH;
                case 8:
                    return TransferAccountType.IRA_TRADITIONAL_INHERITED;
                case 9:
                    return TransferAccountType.IRA_ROTH_INHERITED;
                case 10:
                    return TransferAccountType.UK_BANK_ACCOUNT;
                case 11:
                    return TransferAccountType.I18N_BANK_ACCOUNT;
                case 12:
                    return TransferAccountType.SEPA;
                case 13:
                    return TransferAccountType.RCT_FIRM_ACCOUNT;
                case 14:
                    return TransferAccountType.APPLE_PAY_DCF;
                case 15:
                    return TransferAccountType.JOINT_TENANCY_WITH_ROS;
                case 16:
                    return TransferAccountType.OUTGOING_WIRE_ACCOUNT;
                case 17:
                    return TransferAccountType.RHY_BANKING;
                case 18:
                    return TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES;
                case 19:
                    return TransferAccountType.CUSTODIAL_UGMA;
                case 20:
                    return TransferAccountType.CUSTODIAL_UTMA;
                default:
                    return null;
            }
        }
    }

    public static TransferAccountType valueOf(String str) {
        return (TransferAccountType) Enum.valueOf(TransferAccountType.class, str);
    }

    public static TransferAccountType[] values() {
        return (TransferAccountType[]) $VALUES.clone();
    }
}
