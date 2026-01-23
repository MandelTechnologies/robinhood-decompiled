package bff_money_movement.service.p019v1;

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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "TRANSFER_ACCOUNT_TYPE_ACH", "TRANSFER_ACCOUNT_TYPE_DCF", "TRANSFER_ACCOUNT_TYPE_RHS", "TRANSFER_ACCOUNT_TYPE_RHY", "TRANSFER_ACCOUNT_TYPE_RHCE", "TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL", "TRANSFER_ACCOUNT_TYPE_IRA_ROTH", "TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED", "TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED", "TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_SEPA", "TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF", "TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS", "TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_RHY_BANKING", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TransferAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAccountType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransferAccountType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_ACH;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_DCF;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_RHCE;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_RHS;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_RHY;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_RHY_BANKING;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_SEPA;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT;
    public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TransferAccountType[] $values() {
        return new TransferAccountType[]{TRANSFER_ACCOUNT_TYPE_UNSPECIFIED, TRANSFER_ACCOUNT_TYPE_ACH, TRANSFER_ACCOUNT_TYPE_DCF, TRANSFER_ACCOUNT_TYPE_RHS, TRANSFER_ACCOUNT_TYPE_RHY, TRANSFER_ACCOUNT_TYPE_RHCE, TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL, TRANSFER_ACCOUNT_TYPE_IRA_ROTH, TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED, TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED, TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT, TRANSFER_ACCOUNT_TYPE_SEPA, TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT, TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF, TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS, TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT, TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT, TRANSFER_ACCOUNT_TYPE_RHY_BANKING};
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
        TRANSFER_ACCOUNT_TYPE_ACH = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_ACH", 1, 1);
        TRANSFER_ACCOUNT_TYPE_DCF = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_DCF", 2, 2);
        TRANSFER_ACCOUNT_TYPE_RHS = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_RHS", 3, 3);
        TRANSFER_ACCOUNT_TYPE_RHY = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_RHY", 4, 4);
        TRANSFER_ACCOUNT_TYPE_RHCE = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_RHCE", 5, 5);
        TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL", 6, 6);
        TRANSFER_ACCOUNT_TYPE_IRA_ROTH = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_IRA_ROTH", 7, 7);
        TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED", 8, 8);
        TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED", 9, 9);
        TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT", 10, 10);
        TRANSFER_ACCOUNT_TYPE_SEPA = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_SEPA", 11, 11);
        TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT", 12, 12);
        TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF", 13, 13);
        TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS", 14, 14);
        TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT", 15, 15);
        TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT", 16, 16);
        TRANSFER_ACCOUNT_TYPE_RHY_BANKING = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_RHY_BANKING", 17, 17);
        TransferAccountType[] transferAccountTypeArr$values = $values();
        $VALUES = transferAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferAccountType>(orCreateKotlinClass, syntax, transferAccountType) { // from class: bff_money_movement.service.v1.TransferAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferAccountType fromValue(int value) {
                return TransferAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/TransferAccountType;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_ACH;
                case 2:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_DCF;
                case 3:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHS;
                case 4:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY;
                case 5:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHCE;
                case 6:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
                case 7:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
                case 8:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED;
                case 9:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED;
                case 10:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT;
                case 11:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_SEPA;
                case 12:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT;
                case 13:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF;
                case 14:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
                case 15:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT;
                case 16:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT;
                case 17:
                    return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY_BANKING;
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
