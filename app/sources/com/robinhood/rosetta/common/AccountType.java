package com.robinhood.rosetta.common;

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
/* compiled from: AccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\u0086\u0081\u0002\u0018\u0000 *2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001*B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/common/AccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "RHY_ACCOUNT", "RHS_ACCOUNT", "EXTERNAL", "ACH_RELATIONSHIP", "RHY_FIRM_ACCOUNT", "RHS_FIRM_ACCOUNT", "DEBIT_CARD_INSTRUMENT", "RHC_FIRM_ACCOUNT", "RHS_TRADITIONAL_IRA", "RHS_ROTH_IRA", "RHS_TRADITIONAL_IRA_INHERITED", "RHS_ROTH_IRA_INHERITED", "RHY_SAVINGS", "RHM_FIRM_ACCOUNT", "UNKNOWN", "RHCE_USER_WALLET", "RHCE_FIRM_WALLET", "RHCE_CUSTOMER_ACCOUNT", "UK_BANK_ACCOUNT", "RCT_FIRM_ACCOUNT", "RHS_JOINT_TENANCY_WITH_ROS", "RCT_ACCOUNT", "OUTGOING_WIRE_ACCOUNT", "I18N_BANK_ACCOUNT", "RHD_ACCOUNT", "RHY_BANKING_FIRM_ACCOUNT", "RHY_BANKING_CHECKING", "RHY_BANKING_SAVINGS", "RHS_CUSTODIAL_UGMA", "RHS_CUSTODIAL_UTMA", "RHUK_ISA_STOCKS_AND_SHARES", "RHSG_FIRM_ACCOUNT", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType ACCOUNT_TYPE_UNSPECIFIED;
    public static final AccountType ACH_RELATIONSHIP;

    @JvmField
    public static final ProtoAdapter<AccountType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountType DEBIT_CARD_INSTRUMENT;
    public static final AccountType EXTERNAL;
    public static final AccountType I18N_BANK_ACCOUNT;
    public static final AccountType OUTGOING_WIRE_ACCOUNT;
    public static final AccountType RCT_ACCOUNT;
    public static final AccountType RCT_FIRM_ACCOUNT;
    public static final AccountType RHCE_CUSTOMER_ACCOUNT;
    public static final AccountType RHCE_FIRM_WALLET;
    public static final AccountType RHCE_USER_WALLET;
    public static final AccountType RHC_FIRM_ACCOUNT;
    public static final AccountType RHD_ACCOUNT;
    public static final AccountType RHM_FIRM_ACCOUNT;
    public static final AccountType RHSG_FIRM_ACCOUNT;
    public static final AccountType RHS_ACCOUNT;
    public static final AccountType RHS_CUSTODIAL_UGMA;
    public static final AccountType RHS_CUSTODIAL_UTMA;
    public static final AccountType RHS_FIRM_ACCOUNT;
    public static final AccountType RHS_JOINT_TENANCY_WITH_ROS;
    public static final AccountType RHS_ROTH_IRA;
    public static final AccountType RHS_ROTH_IRA_INHERITED;
    public static final AccountType RHS_TRADITIONAL_IRA;
    public static final AccountType RHS_TRADITIONAL_IRA_INHERITED;
    public static final AccountType RHUK_ISA_STOCKS_AND_SHARES;
    public static final AccountType RHY_ACCOUNT;
    public static final AccountType RHY_BANKING_CHECKING;
    public static final AccountType RHY_BANKING_FIRM_ACCOUNT;
    public static final AccountType RHY_BANKING_SAVINGS;
    public static final AccountType RHY_FIRM_ACCOUNT;
    public static final AccountType RHY_SAVINGS;
    public static final AccountType UK_BANK_ACCOUNT;
    public static final AccountType UNKNOWN;
    private final int value;

    private static final /* synthetic */ AccountType[] $values() {
        return new AccountType[]{ACCOUNT_TYPE_UNSPECIFIED, RHY_ACCOUNT, RHS_ACCOUNT, EXTERNAL, ACH_RELATIONSHIP, RHY_FIRM_ACCOUNT, RHS_FIRM_ACCOUNT, DEBIT_CARD_INSTRUMENT, RHC_FIRM_ACCOUNT, RHS_TRADITIONAL_IRA, RHS_ROTH_IRA, RHS_TRADITIONAL_IRA_INHERITED, RHS_ROTH_IRA_INHERITED, RHY_SAVINGS, RHM_FIRM_ACCOUNT, UNKNOWN, RHCE_USER_WALLET, RHCE_FIRM_WALLET, RHCE_CUSTOMER_ACCOUNT, UK_BANK_ACCOUNT, RCT_FIRM_ACCOUNT, RHS_JOINT_TENANCY_WITH_ROS, RCT_ACCOUNT, OUTGOING_WIRE_ACCOUNT, I18N_BANK_ACCOUNT, RHD_ACCOUNT, RHY_BANKING_FIRM_ACCOUNT, RHY_BANKING_CHECKING, RHY_BANKING_SAVINGS, RHS_CUSTODIAL_UGMA, RHS_CUSTODIAL_UTMA, RHUK_ISA_STOCKS_AND_SHARES, RHSG_FIRM_ACCOUNT};
    }

    @JvmStatic
    public static final AccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountType> getEntries() {
        return $ENTRIES;
    }

    private AccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountType accountType = new AccountType("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        ACCOUNT_TYPE_UNSPECIFIED = accountType;
        RHY_ACCOUNT = new AccountType("RHY_ACCOUNT", 1, 1);
        RHS_ACCOUNT = new AccountType("RHS_ACCOUNT", 2, 2);
        EXTERNAL = new AccountType("EXTERNAL", 3, 3);
        ACH_RELATIONSHIP = new AccountType("ACH_RELATIONSHIP", 4, 4);
        RHY_FIRM_ACCOUNT = new AccountType("RHY_FIRM_ACCOUNT", 5, 5);
        RHS_FIRM_ACCOUNT = new AccountType("RHS_FIRM_ACCOUNT", 6, 6);
        DEBIT_CARD_INSTRUMENT = new AccountType("DEBIT_CARD_INSTRUMENT", 7, 7);
        RHC_FIRM_ACCOUNT = new AccountType("RHC_FIRM_ACCOUNT", 8, 8);
        RHS_TRADITIONAL_IRA = new AccountType("RHS_TRADITIONAL_IRA", 9, 9);
        RHS_ROTH_IRA = new AccountType("RHS_ROTH_IRA", 10, 10);
        RHS_TRADITIONAL_IRA_INHERITED = new AccountType("RHS_TRADITIONAL_IRA_INHERITED", 11, 11);
        RHS_ROTH_IRA_INHERITED = new AccountType("RHS_ROTH_IRA_INHERITED", 12, 12);
        RHY_SAVINGS = new AccountType("RHY_SAVINGS", 13, 13);
        RHM_FIRM_ACCOUNT = new AccountType("RHM_FIRM_ACCOUNT", 14, 14);
        UNKNOWN = new AccountType("UNKNOWN", 15, 15);
        RHCE_USER_WALLET = new AccountType("RHCE_USER_WALLET", 16, 16);
        RHCE_FIRM_WALLET = new AccountType("RHCE_FIRM_WALLET", 17, 17);
        RHCE_CUSTOMER_ACCOUNT = new AccountType("RHCE_CUSTOMER_ACCOUNT", 18, 18);
        UK_BANK_ACCOUNT = new AccountType("UK_BANK_ACCOUNT", 19, 19);
        RCT_FIRM_ACCOUNT = new AccountType("RCT_FIRM_ACCOUNT", 20, 20);
        RHS_JOINT_TENANCY_WITH_ROS = new AccountType("RHS_JOINT_TENANCY_WITH_ROS", 21, 21);
        RCT_ACCOUNT = new AccountType("RCT_ACCOUNT", 22, 22);
        OUTGOING_WIRE_ACCOUNT = new AccountType("OUTGOING_WIRE_ACCOUNT", 23, 23);
        I18N_BANK_ACCOUNT = new AccountType("I18N_BANK_ACCOUNT", 24, 24);
        RHD_ACCOUNT = new AccountType("RHD_ACCOUNT", 25, 25);
        RHY_BANKING_FIRM_ACCOUNT = new AccountType("RHY_BANKING_FIRM_ACCOUNT", 26, 26);
        RHY_BANKING_CHECKING = new AccountType("RHY_BANKING_CHECKING", 27, 27);
        RHY_BANKING_SAVINGS = new AccountType("RHY_BANKING_SAVINGS", 28, 28);
        RHS_CUSTODIAL_UGMA = new AccountType("RHS_CUSTODIAL_UGMA", 29, 29);
        RHS_CUSTODIAL_UTMA = new AccountType("RHS_CUSTODIAL_UTMA", 30, 30);
        RHUK_ISA_STOCKS_AND_SHARES = new AccountType("RHUK_ISA_STOCKS_AND_SHARES", 31, 31);
        RHSG_FIRM_ACCOUNT = new AccountType("RHSG_FIRM_ACCOUNT", 32, 32);
        AccountType[] accountTypeArr$values = $values();
        $VALUES = accountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountType>(orCreateKotlinClass, syntax, accountType) { // from class: com.robinhood.rosetta.common.AccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountType fromValue(int value) {
                return AccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/common/AccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/common/AccountType;", "fromValue", "value", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountType fromValue(int value) {
            switch (value) {
                case 0:
                    return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                case 1:
                    return AccountType.RHY_ACCOUNT;
                case 2:
                    return AccountType.RHS_ACCOUNT;
                case 3:
                    return AccountType.EXTERNAL;
                case 4:
                    return AccountType.ACH_RELATIONSHIP;
                case 5:
                    return AccountType.RHY_FIRM_ACCOUNT;
                case 6:
                    return AccountType.RHS_FIRM_ACCOUNT;
                case 7:
                    return AccountType.DEBIT_CARD_INSTRUMENT;
                case 8:
                    return AccountType.RHC_FIRM_ACCOUNT;
                case 9:
                    return AccountType.RHS_TRADITIONAL_IRA;
                case 10:
                    return AccountType.RHS_ROTH_IRA;
                case 11:
                    return AccountType.RHS_TRADITIONAL_IRA_INHERITED;
                case 12:
                    return AccountType.RHS_ROTH_IRA_INHERITED;
                case 13:
                    return AccountType.RHY_SAVINGS;
                case 14:
                    return AccountType.RHM_FIRM_ACCOUNT;
                case 15:
                    return AccountType.UNKNOWN;
                case 16:
                    return AccountType.RHCE_USER_WALLET;
                case 17:
                    return AccountType.RHCE_FIRM_WALLET;
                case 18:
                    return AccountType.RHCE_CUSTOMER_ACCOUNT;
                case 19:
                    return AccountType.UK_BANK_ACCOUNT;
                case 20:
                    return AccountType.RCT_FIRM_ACCOUNT;
                case 21:
                    return AccountType.RHS_JOINT_TENANCY_WITH_ROS;
                case 22:
                    return AccountType.RCT_ACCOUNT;
                case 23:
                    return AccountType.OUTGOING_WIRE_ACCOUNT;
                case 24:
                    return AccountType.I18N_BANK_ACCOUNT;
                case 25:
                    return AccountType.RHD_ACCOUNT;
                case 26:
                    return AccountType.RHY_BANKING_FIRM_ACCOUNT;
                case 27:
                    return AccountType.RHY_BANKING_CHECKING;
                case 28:
                    return AccountType.RHY_BANKING_SAVINGS;
                case 29:
                    return AccountType.RHS_CUSTODIAL_UGMA;
                case 30:
                    return AccountType.RHS_CUSTODIAL_UTMA;
                case 31:
                    return AccountType.RHUK_ISA_STOCKS_AND_SHARES;
                case 32:
                    return AccountType.RHSG_FIRM_ACCOUNT;
                default:
                    return null;
            }
        }
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
