package accio.service.p003v1;

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
/* compiled from: AccountSubtype.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bL\b\u0086\u0081\u0002\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001OB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bN¨\u0006P"}, m3636d2 = {"Laccio/service/v1/AccountSubtype;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_SUBTYPE_UNSPECIFIED", "SUBTYPE_CHECKING", "SUBTYPE_SAVINGS", "SUBTYPE_HSA", "SUBTYPE_CD", "SUBTYPE_MONEY_MARKET", "SUBTYPE_PAYPAL", "SUBTYPE_PREPAID", "SUBTYPE_CASH_MANAGEMENT", "SUBTYPE_EBT", "SUBTYPE_529", "SUBTYPE_401A", "SUBTYPE_401K", "SUBTYPE_403B", "SUBTYPE_457B", "SUBTYPE_BROKERAGE", "SUBTYPE_CASH_ISA", "SUBTYPE_CRYPTO_EXCHANGE", "SUBTYPE_EDUCATION_SAVINGS_ACCOUNT", "SUBTYPE_FIXED_ANNUITY", "SUBTYPE_GIC", "SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT", "SUBTYPE_IRA", "SUBTYPE_ISA", "SUBTYPE_KEOGH", "SUBTYPE_LIF", "SUBTYPE_LIFE_INSURANCE", "SUBTYPE_LIRA", "SUBTYPE_LRIF", "SUBTYPE_LRSP", "SUBTYPE_MUTUAL_FUND", "SUBTYPE_NON_CUSTODIAL_WALLET", "SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT", "SUBTYPE_OTHER", "SUBTYPE_OTHER_ANNUITY", "SUBTYPE_OTHER_INSURANCE", "SUBTYPE_PENSION", "SUBTYPE_PRIF", "SUBTYPE_PROFIT_SHARING_PLAN", "SUBTYPE_QSHR", "SUBTYPE_RDSP", "SUBTYPE_RESP", "SUBTYPE_RETIREMENT", "SUBTYPE_RLIF", "SUBTYPE_ROTH", "SUBTYPE_ROTH_401K", "SUBTYPE_RRIF", "SUBTYPE_RRSP", "SUBTYPE_SARSEP", "SUBTYPE_SEP_IRA", "SUBTYPE_SIMPLE_IRA", "SUBTYPE_SIPP", "SUBTYPE_STOCK_PLAN", "SUBTYPE_TFSA", "SUBTYPE_TRUST", "SUBTYPE_UGMA", "SUBTYPE_UTMA", "SUBTYPE_VARIABLE_ANNUITY", "SUBTYPE_CREDIT_CARD", "SUBTYPE_AUTO", "SUBTYPE_BUSINESS", "SUBTYPE_COMMERCIAL", "SUBTYPE_CONSTRUCTION", "SUBTYPE_CONSUMER", "SUBTYPE_HOME_EQUITY", "SUBTYPE_LOAN", "SUBTYPE_MORTGAGE", "SUBTYPE_OVERDRAFT", "SUBTYPE_LINE_OF_CREDIT", "SUBTYPE_STUDENT", "Companion", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AccountSubtype implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSubtype[] $VALUES;
    public static final AccountSubtype ACCOUNT_SUBTYPE_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountSubtype> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountSubtype SUBTYPE_401A;
    public static final AccountSubtype SUBTYPE_401K;
    public static final AccountSubtype SUBTYPE_403B;
    public static final AccountSubtype SUBTYPE_457B;
    public static final AccountSubtype SUBTYPE_529;
    public static final AccountSubtype SUBTYPE_AUTO;
    public static final AccountSubtype SUBTYPE_BROKERAGE;
    public static final AccountSubtype SUBTYPE_BUSINESS;
    public static final AccountSubtype SUBTYPE_CASH_ISA;
    public static final AccountSubtype SUBTYPE_CASH_MANAGEMENT;
    public static final AccountSubtype SUBTYPE_CD;
    public static final AccountSubtype SUBTYPE_CHECKING;
    public static final AccountSubtype SUBTYPE_COMMERCIAL;
    public static final AccountSubtype SUBTYPE_CONSTRUCTION;
    public static final AccountSubtype SUBTYPE_CONSUMER;
    public static final AccountSubtype SUBTYPE_CREDIT_CARD;
    public static final AccountSubtype SUBTYPE_CRYPTO_EXCHANGE;
    public static final AccountSubtype SUBTYPE_EBT;
    public static final AccountSubtype SUBTYPE_EDUCATION_SAVINGS_ACCOUNT;
    public static final AccountSubtype SUBTYPE_FIXED_ANNUITY;
    public static final AccountSubtype SUBTYPE_GIC;
    public static final AccountSubtype SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT;
    public static final AccountSubtype SUBTYPE_HOME_EQUITY;
    public static final AccountSubtype SUBTYPE_HSA;
    public static final AccountSubtype SUBTYPE_IRA;
    public static final AccountSubtype SUBTYPE_ISA;
    public static final AccountSubtype SUBTYPE_KEOGH;
    public static final AccountSubtype SUBTYPE_LIF;
    public static final AccountSubtype SUBTYPE_LIFE_INSURANCE;
    public static final AccountSubtype SUBTYPE_LINE_OF_CREDIT;
    public static final AccountSubtype SUBTYPE_LIRA;
    public static final AccountSubtype SUBTYPE_LOAN;
    public static final AccountSubtype SUBTYPE_LRIF;
    public static final AccountSubtype SUBTYPE_LRSP;
    public static final AccountSubtype SUBTYPE_MONEY_MARKET;
    public static final AccountSubtype SUBTYPE_MORTGAGE;
    public static final AccountSubtype SUBTYPE_MUTUAL_FUND;
    public static final AccountSubtype SUBTYPE_NON_CUSTODIAL_WALLET;
    public static final AccountSubtype SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT;
    public static final AccountSubtype SUBTYPE_OTHER;
    public static final AccountSubtype SUBTYPE_OTHER_ANNUITY;
    public static final AccountSubtype SUBTYPE_OTHER_INSURANCE;
    public static final AccountSubtype SUBTYPE_OVERDRAFT;
    public static final AccountSubtype SUBTYPE_PAYPAL;
    public static final AccountSubtype SUBTYPE_PENSION;
    public static final AccountSubtype SUBTYPE_PREPAID;
    public static final AccountSubtype SUBTYPE_PRIF;
    public static final AccountSubtype SUBTYPE_PROFIT_SHARING_PLAN;
    public static final AccountSubtype SUBTYPE_QSHR;
    public static final AccountSubtype SUBTYPE_RDSP;
    public static final AccountSubtype SUBTYPE_RESP;
    public static final AccountSubtype SUBTYPE_RETIREMENT;
    public static final AccountSubtype SUBTYPE_RLIF;
    public static final AccountSubtype SUBTYPE_ROTH;
    public static final AccountSubtype SUBTYPE_ROTH_401K;
    public static final AccountSubtype SUBTYPE_RRIF;
    public static final AccountSubtype SUBTYPE_RRSP;
    public static final AccountSubtype SUBTYPE_SARSEP;
    public static final AccountSubtype SUBTYPE_SAVINGS;
    public static final AccountSubtype SUBTYPE_SEP_IRA;
    public static final AccountSubtype SUBTYPE_SIMPLE_IRA;
    public static final AccountSubtype SUBTYPE_SIPP;
    public static final AccountSubtype SUBTYPE_STOCK_PLAN;
    public static final AccountSubtype SUBTYPE_STUDENT;
    public static final AccountSubtype SUBTYPE_TFSA;
    public static final AccountSubtype SUBTYPE_TRUST;
    public static final AccountSubtype SUBTYPE_UGMA;
    public static final AccountSubtype SUBTYPE_UTMA;
    public static final AccountSubtype SUBTYPE_VARIABLE_ANNUITY;
    private final int value;

    private static final /* synthetic */ AccountSubtype[] $values() {
        return new AccountSubtype[]{ACCOUNT_SUBTYPE_UNSPECIFIED, SUBTYPE_CHECKING, SUBTYPE_SAVINGS, SUBTYPE_HSA, SUBTYPE_CD, SUBTYPE_MONEY_MARKET, SUBTYPE_PAYPAL, SUBTYPE_PREPAID, SUBTYPE_CASH_MANAGEMENT, SUBTYPE_EBT, SUBTYPE_529, SUBTYPE_401A, SUBTYPE_401K, SUBTYPE_403B, SUBTYPE_457B, SUBTYPE_BROKERAGE, SUBTYPE_CASH_ISA, SUBTYPE_CRYPTO_EXCHANGE, SUBTYPE_EDUCATION_SAVINGS_ACCOUNT, SUBTYPE_FIXED_ANNUITY, SUBTYPE_GIC, SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT, SUBTYPE_IRA, SUBTYPE_ISA, SUBTYPE_KEOGH, SUBTYPE_LIF, SUBTYPE_LIFE_INSURANCE, SUBTYPE_LIRA, SUBTYPE_LRIF, SUBTYPE_LRSP, SUBTYPE_MUTUAL_FUND, SUBTYPE_NON_CUSTODIAL_WALLET, SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT, SUBTYPE_OTHER, SUBTYPE_OTHER_ANNUITY, SUBTYPE_OTHER_INSURANCE, SUBTYPE_PENSION, SUBTYPE_PRIF, SUBTYPE_PROFIT_SHARING_PLAN, SUBTYPE_QSHR, SUBTYPE_RDSP, SUBTYPE_RESP, SUBTYPE_RETIREMENT, SUBTYPE_RLIF, SUBTYPE_ROTH, SUBTYPE_ROTH_401K, SUBTYPE_RRIF, SUBTYPE_RRSP, SUBTYPE_SARSEP, SUBTYPE_SEP_IRA, SUBTYPE_SIMPLE_IRA, SUBTYPE_SIPP, SUBTYPE_STOCK_PLAN, SUBTYPE_TFSA, SUBTYPE_TRUST, SUBTYPE_UGMA, SUBTYPE_UTMA, SUBTYPE_VARIABLE_ANNUITY, SUBTYPE_CREDIT_CARD, SUBTYPE_AUTO, SUBTYPE_BUSINESS, SUBTYPE_COMMERCIAL, SUBTYPE_CONSTRUCTION, SUBTYPE_CONSUMER, SUBTYPE_HOME_EQUITY, SUBTYPE_LOAN, SUBTYPE_MORTGAGE, SUBTYPE_OVERDRAFT, SUBTYPE_LINE_OF_CREDIT, SUBTYPE_STUDENT};
    }

    @JvmStatic
    public static final AccountSubtype fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountSubtype> getEntries() {
        return $ENTRIES;
    }

    private AccountSubtype(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountSubtype accountSubtype = new AccountSubtype("ACCOUNT_SUBTYPE_UNSPECIFIED", 0, 0);
        ACCOUNT_SUBTYPE_UNSPECIFIED = accountSubtype;
        SUBTYPE_CHECKING = new AccountSubtype("SUBTYPE_CHECKING", 1, 1);
        SUBTYPE_SAVINGS = new AccountSubtype("SUBTYPE_SAVINGS", 2, 2);
        SUBTYPE_HSA = new AccountSubtype("SUBTYPE_HSA", 3, 3);
        SUBTYPE_CD = new AccountSubtype("SUBTYPE_CD", 4, 4);
        SUBTYPE_MONEY_MARKET = new AccountSubtype("SUBTYPE_MONEY_MARKET", 5, 5);
        SUBTYPE_PAYPAL = new AccountSubtype("SUBTYPE_PAYPAL", 6, 6);
        SUBTYPE_PREPAID = new AccountSubtype("SUBTYPE_PREPAID", 7, 7);
        SUBTYPE_CASH_MANAGEMENT = new AccountSubtype("SUBTYPE_CASH_MANAGEMENT", 8, 8);
        SUBTYPE_EBT = new AccountSubtype("SUBTYPE_EBT", 9, 9);
        SUBTYPE_529 = new AccountSubtype("SUBTYPE_529", 10, 10);
        SUBTYPE_401A = new AccountSubtype("SUBTYPE_401A", 11, 11);
        SUBTYPE_401K = new AccountSubtype("SUBTYPE_401K", 12, 12);
        SUBTYPE_403B = new AccountSubtype("SUBTYPE_403B", 13, 13);
        SUBTYPE_457B = new AccountSubtype("SUBTYPE_457B", 14, 14);
        SUBTYPE_BROKERAGE = new AccountSubtype("SUBTYPE_BROKERAGE", 15, 15);
        SUBTYPE_CASH_ISA = new AccountSubtype("SUBTYPE_CASH_ISA", 16, 16);
        SUBTYPE_CRYPTO_EXCHANGE = new AccountSubtype("SUBTYPE_CRYPTO_EXCHANGE", 17, 17);
        SUBTYPE_EDUCATION_SAVINGS_ACCOUNT = new AccountSubtype("SUBTYPE_EDUCATION_SAVINGS_ACCOUNT", 18, 18);
        SUBTYPE_FIXED_ANNUITY = new AccountSubtype("SUBTYPE_FIXED_ANNUITY", 19, 19);
        SUBTYPE_GIC = new AccountSubtype("SUBTYPE_GIC", 20, 20);
        SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT = new AccountSubtype("SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT", 21, 21);
        SUBTYPE_IRA = new AccountSubtype("SUBTYPE_IRA", 22, 22);
        SUBTYPE_ISA = new AccountSubtype("SUBTYPE_ISA", 23, 23);
        SUBTYPE_KEOGH = new AccountSubtype("SUBTYPE_KEOGH", 24, 24);
        SUBTYPE_LIF = new AccountSubtype("SUBTYPE_LIF", 25, 25);
        SUBTYPE_LIFE_INSURANCE = new AccountSubtype("SUBTYPE_LIFE_INSURANCE", 26, 26);
        SUBTYPE_LIRA = new AccountSubtype("SUBTYPE_LIRA", 27, 27);
        SUBTYPE_LRIF = new AccountSubtype("SUBTYPE_LRIF", 28, 28);
        SUBTYPE_LRSP = new AccountSubtype("SUBTYPE_LRSP", 29, 29);
        SUBTYPE_MUTUAL_FUND = new AccountSubtype("SUBTYPE_MUTUAL_FUND", 30, 30);
        SUBTYPE_NON_CUSTODIAL_WALLET = new AccountSubtype("SUBTYPE_NON_CUSTODIAL_WALLET", 31, 31);
        SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT = new AccountSubtype("SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT", 32, 32);
        SUBTYPE_OTHER = new AccountSubtype("SUBTYPE_OTHER", 33, 33);
        SUBTYPE_OTHER_ANNUITY = new AccountSubtype("SUBTYPE_OTHER_ANNUITY", 34, 34);
        SUBTYPE_OTHER_INSURANCE = new AccountSubtype("SUBTYPE_OTHER_INSURANCE", 35, 35);
        SUBTYPE_PENSION = new AccountSubtype("SUBTYPE_PENSION", 36, 36);
        SUBTYPE_PRIF = new AccountSubtype("SUBTYPE_PRIF", 37, 37);
        SUBTYPE_PROFIT_SHARING_PLAN = new AccountSubtype("SUBTYPE_PROFIT_SHARING_PLAN", 38, 38);
        SUBTYPE_QSHR = new AccountSubtype("SUBTYPE_QSHR", 39, 39);
        SUBTYPE_RDSP = new AccountSubtype("SUBTYPE_RDSP", 40, 40);
        SUBTYPE_RESP = new AccountSubtype("SUBTYPE_RESP", 41, 41);
        SUBTYPE_RETIREMENT = new AccountSubtype("SUBTYPE_RETIREMENT", 42, 42);
        SUBTYPE_RLIF = new AccountSubtype("SUBTYPE_RLIF", 43, 43);
        SUBTYPE_ROTH = new AccountSubtype("SUBTYPE_ROTH", 44, 44);
        SUBTYPE_ROTH_401K = new AccountSubtype("SUBTYPE_ROTH_401K", 45, 45);
        SUBTYPE_RRIF = new AccountSubtype("SUBTYPE_RRIF", 46, 46);
        SUBTYPE_RRSP = new AccountSubtype("SUBTYPE_RRSP", 47, 47);
        SUBTYPE_SARSEP = new AccountSubtype("SUBTYPE_SARSEP", 48, 48);
        SUBTYPE_SEP_IRA = new AccountSubtype("SUBTYPE_SEP_IRA", 49, 49);
        SUBTYPE_SIMPLE_IRA = new AccountSubtype("SUBTYPE_SIMPLE_IRA", 50, 50);
        SUBTYPE_SIPP = new AccountSubtype("SUBTYPE_SIPP", 51, 51);
        SUBTYPE_STOCK_PLAN = new AccountSubtype("SUBTYPE_STOCK_PLAN", 52, 52);
        SUBTYPE_TFSA = new AccountSubtype("SUBTYPE_TFSA", 53, 53);
        SUBTYPE_TRUST = new AccountSubtype("SUBTYPE_TRUST", 54, 54);
        SUBTYPE_UGMA = new AccountSubtype("SUBTYPE_UGMA", 55, 55);
        SUBTYPE_UTMA = new AccountSubtype("SUBTYPE_UTMA", 56, 56);
        SUBTYPE_VARIABLE_ANNUITY = new AccountSubtype("SUBTYPE_VARIABLE_ANNUITY", 57, 57);
        SUBTYPE_CREDIT_CARD = new AccountSubtype("SUBTYPE_CREDIT_CARD", 58, 58);
        SUBTYPE_AUTO = new AccountSubtype("SUBTYPE_AUTO", 59, 59);
        SUBTYPE_BUSINESS = new AccountSubtype("SUBTYPE_BUSINESS", 60, 60);
        SUBTYPE_COMMERCIAL = new AccountSubtype("SUBTYPE_COMMERCIAL", 61, 61);
        SUBTYPE_CONSTRUCTION = new AccountSubtype("SUBTYPE_CONSTRUCTION", 62, 62);
        SUBTYPE_CONSUMER = new AccountSubtype("SUBTYPE_CONSUMER", 63, 63);
        SUBTYPE_HOME_EQUITY = new AccountSubtype("SUBTYPE_HOME_EQUITY", 64, 64);
        SUBTYPE_LOAN = new AccountSubtype("SUBTYPE_LOAN", 65, 65);
        SUBTYPE_MORTGAGE = new AccountSubtype("SUBTYPE_MORTGAGE", 66, 66);
        SUBTYPE_OVERDRAFT = new AccountSubtype("SUBTYPE_OVERDRAFT", 67, 67);
        SUBTYPE_LINE_OF_CREDIT = new AccountSubtype("SUBTYPE_LINE_OF_CREDIT", 68, 68);
        SUBTYPE_STUDENT = new AccountSubtype("SUBTYPE_STUDENT", 69, 69);
        AccountSubtype[] accountSubtypeArr$values = $values();
        $VALUES = accountSubtypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountSubtypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountSubtype.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountSubtype>(orCreateKotlinClass, syntax, accountSubtype) { // from class: accio.service.v1.AccountSubtype$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountSubtype fromValue(int value) {
                return AccountSubtype.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountSubtype.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Laccio/service/v1/AccountSubtype$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Laccio/service/v1/AccountSubtype;", "fromValue", "value", "", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountSubtype fromValue(int value) {
            switch (value) {
                case 0:
                    return AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED;
                case 1:
                    return AccountSubtype.SUBTYPE_CHECKING;
                case 2:
                    return AccountSubtype.SUBTYPE_SAVINGS;
                case 3:
                    return AccountSubtype.SUBTYPE_HSA;
                case 4:
                    return AccountSubtype.SUBTYPE_CD;
                case 5:
                    return AccountSubtype.SUBTYPE_MONEY_MARKET;
                case 6:
                    return AccountSubtype.SUBTYPE_PAYPAL;
                case 7:
                    return AccountSubtype.SUBTYPE_PREPAID;
                case 8:
                    return AccountSubtype.SUBTYPE_CASH_MANAGEMENT;
                case 9:
                    return AccountSubtype.SUBTYPE_EBT;
                case 10:
                    return AccountSubtype.SUBTYPE_529;
                case 11:
                    return AccountSubtype.SUBTYPE_401A;
                case 12:
                    return AccountSubtype.SUBTYPE_401K;
                case 13:
                    return AccountSubtype.SUBTYPE_403B;
                case 14:
                    return AccountSubtype.SUBTYPE_457B;
                case 15:
                    return AccountSubtype.SUBTYPE_BROKERAGE;
                case 16:
                    return AccountSubtype.SUBTYPE_CASH_ISA;
                case 17:
                    return AccountSubtype.SUBTYPE_CRYPTO_EXCHANGE;
                case 18:
                    return AccountSubtype.SUBTYPE_EDUCATION_SAVINGS_ACCOUNT;
                case 19:
                    return AccountSubtype.SUBTYPE_FIXED_ANNUITY;
                case 20:
                    return AccountSubtype.SUBTYPE_GIC;
                case 21:
                    return AccountSubtype.SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT;
                case 22:
                    return AccountSubtype.SUBTYPE_IRA;
                case 23:
                    return AccountSubtype.SUBTYPE_ISA;
                case 24:
                    return AccountSubtype.SUBTYPE_KEOGH;
                case 25:
                    return AccountSubtype.SUBTYPE_LIF;
                case 26:
                    return AccountSubtype.SUBTYPE_LIFE_INSURANCE;
                case 27:
                    return AccountSubtype.SUBTYPE_LIRA;
                case 28:
                    return AccountSubtype.SUBTYPE_LRIF;
                case 29:
                    return AccountSubtype.SUBTYPE_LRSP;
                case 30:
                    return AccountSubtype.SUBTYPE_MUTUAL_FUND;
                case 31:
                    return AccountSubtype.SUBTYPE_NON_CUSTODIAL_WALLET;
                case 32:
                    return AccountSubtype.SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT;
                case 33:
                    return AccountSubtype.SUBTYPE_OTHER;
                case 34:
                    return AccountSubtype.SUBTYPE_OTHER_ANNUITY;
                case 35:
                    return AccountSubtype.SUBTYPE_OTHER_INSURANCE;
                case 36:
                    return AccountSubtype.SUBTYPE_PENSION;
                case 37:
                    return AccountSubtype.SUBTYPE_PRIF;
                case 38:
                    return AccountSubtype.SUBTYPE_PROFIT_SHARING_PLAN;
                case 39:
                    return AccountSubtype.SUBTYPE_QSHR;
                case 40:
                    return AccountSubtype.SUBTYPE_RDSP;
                case 41:
                    return AccountSubtype.SUBTYPE_RESP;
                case 42:
                    return AccountSubtype.SUBTYPE_RETIREMENT;
                case 43:
                    return AccountSubtype.SUBTYPE_RLIF;
                case 44:
                    return AccountSubtype.SUBTYPE_ROTH;
                case 45:
                    return AccountSubtype.SUBTYPE_ROTH_401K;
                case 46:
                    return AccountSubtype.SUBTYPE_RRIF;
                case 47:
                    return AccountSubtype.SUBTYPE_RRSP;
                case 48:
                    return AccountSubtype.SUBTYPE_SARSEP;
                case 49:
                    return AccountSubtype.SUBTYPE_SEP_IRA;
                case 50:
                    return AccountSubtype.SUBTYPE_SIMPLE_IRA;
                case 51:
                    return AccountSubtype.SUBTYPE_SIPP;
                case 52:
                    return AccountSubtype.SUBTYPE_STOCK_PLAN;
                case 53:
                    return AccountSubtype.SUBTYPE_TFSA;
                case 54:
                    return AccountSubtype.SUBTYPE_TRUST;
                case 55:
                    return AccountSubtype.SUBTYPE_UGMA;
                case 56:
                    return AccountSubtype.SUBTYPE_UTMA;
                case 57:
                    return AccountSubtype.SUBTYPE_VARIABLE_ANNUITY;
                case 58:
                    return AccountSubtype.SUBTYPE_CREDIT_CARD;
                case 59:
                    return AccountSubtype.SUBTYPE_AUTO;
                case 60:
                    return AccountSubtype.SUBTYPE_BUSINESS;
                case 61:
                    return AccountSubtype.SUBTYPE_COMMERCIAL;
                case 62:
                    return AccountSubtype.SUBTYPE_CONSTRUCTION;
                case 63:
                    return AccountSubtype.SUBTYPE_CONSUMER;
                case 64:
                    return AccountSubtype.SUBTYPE_HOME_EQUITY;
                case 65:
                    return AccountSubtype.SUBTYPE_LOAN;
                case 66:
                    return AccountSubtype.SUBTYPE_MORTGAGE;
                case 67:
                    return AccountSubtype.SUBTYPE_OVERDRAFT;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return AccountSubtype.SUBTYPE_LINE_OF_CREDIT;
                case 69:
                    return AccountSubtype.SUBTYPE_STUDENT;
                default:
                    return null;
            }
        }
    }

    public static AccountSubtype valueOf(String str) {
        return (AccountSubtype) Enum.valueOf(AccountSubtype.class, str);
    }

    public static AccountSubtype[] values() {
        return (AccountSubtype[]) $VALUES.clone();
    }
}
