package accio.service.p003v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.shared.settings.contracts.Constants6;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSubtypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002Z[B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020XH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bR¨\u0006\\"}, m3636d2 = {"Laccio/service/v1/AccountSubtypeDto;", "Lcom/robinhood/idl/EnumDto;", "Laccio/service/v1/AccountSubtype;", "Landroid/os/Parcelable;", "", "json_value", "", "db_enum", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDb_enum", "ACCOUNT_SUBTYPE_UNSPECIFIED", "SUBTYPE_CHECKING", "SUBTYPE_SAVINGS", "SUBTYPE_HSA", "SUBTYPE_CD", "SUBTYPE_MONEY_MARKET", "SUBTYPE_PAYPAL", "SUBTYPE_PREPAID", "SUBTYPE_CASH_MANAGEMENT", "SUBTYPE_EBT", "SUBTYPE_529", "SUBTYPE_401A", "SUBTYPE_401K", "SUBTYPE_403B", "SUBTYPE_457B", "SUBTYPE_BROKERAGE", "SUBTYPE_CASH_ISA", "SUBTYPE_CRYPTO_EXCHANGE", "SUBTYPE_EDUCATION_SAVINGS_ACCOUNT", "SUBTYPE_FIXED_ANNUITY", "SUBTYPE_GIC", "SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT", "SUBTYPE_IRA", "SUBTYPE_ISA", "SUBTYPE_KEOGH", "SUBTYPE_LIF", "SUBTYPE_LIFE_INSURANCE", "SUBTYPE_LIRA", "SUBTYPE_LRIF", "SUBTYPE_LRSP", "SUBTYPE_MUTUAL_FUND", "SUBTYPE_NON_CUSTODIAL_WALLET", "SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT", "SUBTYPE_OTHER", "SUBTYPE_OTHER_ANNUITY", "SUBTYPE_OTHER_INSURANCE", "SUBTYPE_PENSION", "SUBTYPE_PRIF", "SUBTYPE_PROFIT_SHARING_PLAN", "SUBTYPE_QSHR", "SUBTYPE_RDSP", "SUBTYPE_RESP", "SUBTYPE_RETIREMENT", "SUBTYPE_RLIF", "SUBTYPE_ROTH", "SUBTYPE_ROTH_401K", "SUBTYPE_RRIF", "SUBTYPE_RRSP", "SUBTYPE_SARSEP", "SUBTYPE_SEP_IRA", "SUBTYPE_SIMPLE_IRA", "SUBTYPE_SIPP", "SUBTYPE_STOCK_PLAN", "SUBTYPE_TFSA", "SUBTYPE_TRUST", "SUBTYPE_UGMA", "SUBTYPE_UTMA", "SUBTYPE_VARIABLE_ANNUITY", "SUBTYPE_CREDIT_CARD", "SUBTYPE_AUTO", "SUBTYPE_BUSINESS", "SUBTYPE_COMMERCIAL", "SUBTYPE_CONSTRUCTION", "SUBTYPE_CONSUMER", "SUBTYPE_HOME_EQUITY", "SUBTYPE_LOAN", "SUBTYPE_MORTGAGE", "SUBTYPE_OVERDRAFT", "SUBTYPE_LINE_OF_CREDIT", "SUBTYPE_STUDENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AccountSubtypeDto implements Dto2<AccountSubtype>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSubtypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AccountSubtypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountSubtypeDto, AccountSubtype>> binaryBase64Serializer$delegate;
    private final String db_enum;
    private final String json_value;
    public static final AccountSubtypeDto ACCOUNT_SUBTYPE_UNSPECIFIED = new AccountSubtypeDto("ACCOUNT_SUBTYPE_UNSPECIFIED", 0) { // from class: accio.service.v1.AccountSubtypeDto.ACCOUNT_SUBTYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CHECKING = new AccountSubtypeDto("SUBTYPE_CHECKING", 1) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CHECKING
        {
            String str = "checking";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "checking";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CHECKING;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_SAVINGS = new AccountSubtypeDto("SUBTYPE_SAVINGS", 2) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_SAVINGS
        {
            String str = "savings";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "savings";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_SAVINGS;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_HSA = new AccountSubtypeDto("SUBTYPE_HSA", 3) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_HSA
        {
            String str = "hsa";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "hsa";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_HSA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CD = new AccountSubtypeDto("SUBTYPE_CD", 4) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CD
        {
            String str = "cd";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "cd";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CD;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_MONEY_MARKET = new AccountSubtypeDto("SUBTYPE_MONEY_MARKET", 5) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_MONEY_MARKET
        {
            String str = "money_market";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "money_market";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_MONEY_MARKET;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_PAYPAL = new AccountSubtypeDto("SUBTYPE_PAYPAL", 6) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_PAYPAL
        {
            String str = "paypal";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "paypal";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_PAYPAL;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_PREPAID = new AccountSubtypeDto("SUBTYPE_PREPAID", 7) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_PREPAID
        {
            String str = "prepaid";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "prepaid";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_PREPAID;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CASH_MANAGEMENT = new AccountSubtypeDto("SUBTYPE_CASH_MANAGEMENT", 8) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CASH_MANAGEMENT
        {
            String str = Constants6.CASH_MANAGEMENT_SETTINGS_PAGE_ID;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = Constants6.CASH_MANAGEMENT_SETTINGS_PAGE_ID;
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CASH_MANAGEMENT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_EBT = new AccountSubtypeDto("SUBTYPE_EBT", 9) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_EBT
        {
            String str = "ebt";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "ebt";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_EBT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_529 = new AccountSubtypeDto("SUBTYPE_529", 10) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_529
        {
            String str = "529";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "529";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_529;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_401A = new AccountSubtypeDto("SUBTYPE_401A", 11) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_401A
        {
            String str = "401a";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "401a";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_401A;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_401K = new AccountSubtypeDto("SUBTYPE_401K", 12) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_401K
        {
            String str = "401k";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "401k";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_401K;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_403B = new AccountSubtypeDto("SUBTYPE_403B", 13) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_403B
        {
            String str = "403b";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "403b";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_403B;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_457B = new AccountSubtypeDto("SUBTYPE_457B", 14) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_457B
        {
            String str = "457b";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "457b";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_457B;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_BROKERAGE = new AccountSubtypeDto("SUBTYPE_BROKERAGE", 15) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_BROKERAGE
        {
            String str = "brokerage";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "brokerage";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_BROKERAGE;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CASH_ISA = new AccountSubtypeDto("SUBTYPE_CASH_ISA", 16) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CASH_ISA
        {
            String str = "cash_isa";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "cash_isa";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CASH_ISA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CRYPTO_EXCHANGE = new AccountSubtypeDto("SUBTYPE_CRYPTO_EXCHANGE", 17) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CRYPTO_EXCHANGE
        {
            String str = "crypto_exchange";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "crypto_exchange";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CRYPTO_EXCHANGE;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_EDUCATION_SAVINGS_ACCOUNT = new AccountSubtypeDto("SUBTYPE_EDUCATION_SAVINGS_ACCOUNT", 18) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_EDUCATION_SAVINGS_ACCOUNT
        {
            String str = "education_savings_account";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "education_savings_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_EDUCATION_SAVINGS_ACCOUNT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_FIXED_ANNUITY = new AccountSubtypeDto("SUBTYPE_FIXED_ANNUITY", 19) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_FIXED_ANNUITY
        {
            String str = "fixed_annuity";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "fixed_annuity";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_FIXED_ANNUITY;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_GIC = new AccountSubtypeDto("SUBTYPE_GIC", 20) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_GIC
        {
            String str = "gic";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "gic";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_GIC;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT = new AccountSubtypeDto("SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT", 21) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT
        {
            String str = "health_reimbursement_arrangement";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "health_reimbursement_arrangement";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_IRA = new AccountSubtypeDto("SUBTYPE_IRA", 22) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_IRA
        {
            String str = "ira";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "ira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_IRA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_ISA = new AccountSubtypeDto("SUBTYPE_ISA", 23) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_ISA
        {
            String str = AnalyticsStrings.TAB_NAV_TAB_BAR_ISA;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = AnalyticsStrings.TAB_NAV_TAB_BAR_ISA;
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_ISA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_KEOGH = new AccountSubtypeDto("SUBTYPE_KEOGH", 24) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_KEOGH
        {
            String str = "keogh";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "keogh";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_KEOGH;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LIF = new AccountSubtypeDto("SUBTYPE_LIF", 25) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LIF
        {
            String str = "lif";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "lif";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LIF;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LIFE_INSURANCE = new AccountSubtypeDto("SUBTYPE_LIFE_INSURANCE", 26) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LIFE_INSURANCE
        {
            String str = "life_insurance";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "life_insurance";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LIFE_INSURANCE;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LIRA = new AccountSubtypeDto("SUBTYPE_LIRA", 27) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LIRA
        {
            String str = "lira";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "lira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LIRA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LRIF = new AccountSubtypeDto("SUBTYPE_LRIF", 28) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LRIF
        {
            String str = "lrif";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "lrif";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LRIF;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LRSP = new AccountSubtypeDto("SUBTYPE_LRSP", 29) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LRSP
        {
            String str = "lrsp";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "lrsp";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LRSP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_MUTUAL_FUND = new AccountSubtypeDto("SUBTYPE_MUTUAL_FUND", 30) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_MUTUAL_FUND
        {
            String str = "mutual_fund";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "mutual_fund";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_MUTUAL_FUND;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_NON_CUSTODIAL_WALLET = new AccountSubtypeDto("SUBTYPE_NON_CUSTODIAL_WALLET", 31) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_NON_CUSTODIAL_WALLET
        {
            String str = "non_custodial_wallet";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "non_custodial_wallet";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_NON_CUSTODIAL_WALLET;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT = new AccountSubtypeDto("SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT", 32) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT
        {
            String str = "non_taxable_brokerage_account";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "non_taxable_brokerage_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_OTHER = new AccountSubtypeDto("SUBTYPE_OTHER", 33) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_OTHER
        {
            String str = "other";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "other";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_OTHER;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_OTHER_ANNUITY = new AccountSubtypeDto("SUBTYPE_OTHER_ANNUITY", 34) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_OTHER_ANNUITY
        {
            String str = "other_annuity";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "other_annuity";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_OTHER_ANNUITY;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_OTHER_INSURANCE = new AccountSubtypeDto("SUBTYPE_OTHER_INSURANCE", 35) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_OTHER_INSURANCE
        {
            String str = "other_insurance";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "other_insurance";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_OTHER_INSURANCE;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_PENSION = new AccountSubtypeDto("SUBTYPE_PENSION", 36) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_PENSION
        {
            String str = "pension";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "pension";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_PENSION;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_PRIF = new AccountSubtypeDto("SUBTYPE_PRIF", 37) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_PRIF
        {
            String str = "prif";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "prif";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_PRIF;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_PROFIT_SHARING_PLAN = new AccountSubtypeDto("SUBTYPE_PROFIT_SHARING_PLAN", 38) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_PROFIT_SHARING_PLAN
        {
            String str = "profit_sharing_plan";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "profit_sharing_plan";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_PROFIT_SHARING_PLAN;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_QSHR = new AccountSubtypeDto("SUBTYPE_QSHR", 39) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_QSHR
        {
            String str = "qshr";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "qshr";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_QSHR;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RDSP = new AccountSubtypeDto("SUBTYPE_RDSP", 40) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RDSP
        {
            String str = "rdsp";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rdsp";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RDSP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RESP = new AccountSubtypeDto("SUBTYPE_RESP", 41) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RESP
        {
            String str = "resp";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "resp";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RESP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RETIREMENT = new AccountSubtypeDto("SUBTYPE_RETIREMENT", 42) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RETIREMENT
        {
            String str = "retirement";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "retirement";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RETIREMENT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RLIF = new AccountSubtypeDto("SUBTYPE_RLIF", 43) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RLIF
        {
            String str = "rlif";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rlif";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RLIF;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_ROTH = new AccountSubtypeDto("SUBTYPE_ROTH", 44) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_ROTH
        {
            String str = "roth";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "roth";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_ROTH;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_ROTH_401K = new AccountSubtypeDto("SUBTYPE_ROTH_401K", 45) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_ROTH_401K
        {
            String str = "roth_401k";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "roth_401k";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_ROTH_401K;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RRIF = new AccountSubtypeDto("SUBTYPE_RRIF", 46) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RRIF
        {
            String str = "rrif";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rrif";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RRIF;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_RRSP = new AccountSubtypeDto("SUBTYPE_RRSP", 47) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_RRSP
        {
            String str = "rrsp";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rrsp";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_RRSP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_SARSEP = new AccountSubtypeDto("SUBTYPE_SARSEP", 48) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_SARSEP
        {
            String str = "sarsep";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "sarsep";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_SARSEP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_SEP_IRA = new AccountSubtypeDto("SUBTYPE_SEP_IRA", 49) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_SEP_IRA
        {
            String str = "sep_ira";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "sep_ira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_SEP_IRA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_SIMPLE_IRA = new AccountSubtypeDto("SUBTYPE_SIMPLE_IRA", 50) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_SIMPLE_IRA
        {
            String str = "simple_ira";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "simple_ira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_SIMPLE_IRA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_SIPP = new AccountSubtypeDto("SUBTYPE_SIPP", 51) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_SIPP
        {
            String str = "sipp";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "sipp";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_SIPP;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_STOCK_PLAN = new AccountSubtypeDto("SUBTYPE_STOCK_PLAN", 52) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_STOCK_PLAN
        {
            String str = "stock_plan";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "stock_plan";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_STOCK_PLAN;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_TFSA = new AccountSubtypeDto("SUBTYPE_TFSA", 53) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_TFSA
        {
            String str = "tfsa";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "tfsa";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_TFSA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_TRUST = new AccountSubtypeDto("SUBTYPE_TRUST", 54) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_TRUST
        {
            String str = "trust";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "trust";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_TRUST;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_UGMA = new AccountSubtypeDto("SUBTYPE_UGMA", 55) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_UGMA
        {
            String str = "ugma";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "ugma";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_UGMA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_UTMA = new AccountSubtypeDto("SUBTYPE_UTMA", 56) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_UTMA
        {
            String str = "utma";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "utma";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_UTMA;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_VARIABLE_ANNUITY = new AccountSubtypeDto("SUBTYPE_VARIABLE_ANNUITY", 57) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_VARIABLE_ANNUITY
        {
            String str = "variable_annuity";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "variable_annuity";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_VARIABLE_ANNUITY;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CREDIT_CARD = new AccountSubtypeDto("SUBTYPE_CREDIT_CARD", 58) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CREDIT_CARD
        {
            String str = "credit_card";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "credit_card";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CREDIT_CARD;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_AUTO = new AccountSubtypeDto("SUBTYPE_AUTO", 59) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_AUTO
        {
            String str = "auto";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "auto";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_AUTO;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_BUSINESS = new AccountSubtypeDto("SUBTYPE_BUSINESS", 60) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_BUSINESS
        {
            String str = "business";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "business";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_BUSINESS;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_COMMERCIAL = new AccountSubtypeDto("SUBTYPE_COMMERCIAL", 61) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_COMMERCIAL
        {
            String str = "commercial";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "commercial";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_COMMERCIAL;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CONSTRUCTION = new AccountSubtypeDto("SUBTYPE_CONSTRUCTION", 62) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CONSTRUCTION
        {
            String str = "construction";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "construction";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CONSTRUCTION;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_CONSUMER = new AccountSubtypeDto("SUBTYPE_CONSUMER", 63) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_CONSUMER
        {
            String str = "consumer";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "consumer";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_CONSUMER;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_HOME_EQUITY = new AccountSubtypeDto("SUBTYPE_HOME_EQUITY", 64) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_HOME_EQUITY
        {
            String str = "home_equity";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "home_equity";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_HOME_EQUITY;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LOAN = new AccountSubtypeDto("SUBTYPE_LOAN", 65) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LOAN
        {
            String str = "loan";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "loan";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LOAN;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_MORTGAGE = new AccountSubtypeDto("SUBTYPE_MORTGAGE", 66) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_MORTGAGE
        {
            String str = "mortgage";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "mortgage";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_MORTGAGE;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_OVERDRAFT = new AccountSubtypeDto("SUBTYPE_OVERDRAFT", 67) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_OVERDRAFT
        {
            String str = "overdraft";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "overdraft";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_OVERDRAFT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_LINE_OF_CREDIT = new AccountSubtypeDto("SUBTYPE_LINE_OF_CREDIT", 68) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_LINE_OF_CREDIT
        {
            String str = "line_of_credit";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "line_of_credit";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_LINE_OF_CREDIT;
        }
    };
    public static final AccountSubtypeDto SUBTYPE_STUDENT = new AccountSubtypeDto("SUBTYPE_STUDENT", 69) { // from class: accio.service.v1.AccountSubtypeDto.SUBTYPE_STUDENT
        {
            String str = "student";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "student";
        }

        @Override // com.robinhood.idl.Dto
        public AccountSubtype toProto() {
            return AccountSubtype.SUBTYPE_STUDENT;
        }
    };

    private static final /* synthetic */ AccountSubtypeDto[] $values() {
        return new AccountSubtypeDto[]{ACCOUNT_SUBTYPE_UNSPECIFIED, SUBTYPE_CHECKING, SUBTYPE_SAVINGS, SUBTYPE_HSA, SUBTYPE_CD, SUBTYPE_MONEY_MARKET, SUBTYPE_PAYPAL, SUBTYPE_PREPAID, SUBTYPE_CASH_MANAGEMENT, SUBTYPE_EBT, SUBTYPE_529, SUBTYPE_401A, SUBTYPE_401K, SUBTYPE_403B, SUBTYPE_457B, SUBTYPE_BROKERAGE, SUBTYPE_CASH_ISA, SUBTYPE_CRYPTO_EXCHANGE, SUBTYPE_EDUCATION_SAVINGS_ACCOUNT, SUBTYPE_FIXED_ANNUITY, SUBTYPE_GIC, SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT, SUBTYPE_IRA, SUBTYPE_ISA, SUBTYPE_KEOGH, SUBTYPE_LIF, SUBTYPE_LIFE_INSURANCE, SUBTYPE_LIRA, SUBTYPE_LRIF, SUBTYPE_LRSP, SUBTYPE_MUTUAL_FUND, SUBTYPE_NON_CUSTODIAL_WALLET, SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT, SUBTYPE_OTHER, SUBTYPE_OTHER_ANNUITY, SUBTYPE_OTHER_INSURANCE, SUBTYPE_PENSION, SUBTYPE_PRIF, SUBTYPE_PROFIT_SHARING_PLAN, SUBTYPE_QSHR, SUBTYPE_RDSP, SUBTYPE_RESP, SUBTYPE_RETIREMENT, SUBTYPE_RLIF, SUBTYPE_ROTH, SUBTYPE_ROTH_401K, SUBTYPE_RRIF, SUBTYPE_RRSP, SUBTYPE_SARSEP, SUBTYPE_SEP_IRA, SUBTYPE_SIMPLE_IRA, SUBTYPE_SIPP, SUBTYPE_STOCK_PLAN, SUBTYPE_TFSA, SUBTYPE_TRUST, SUBTYPE_UGMA, SUBTYPE_UTMA, SUBTYPE_VARIABLE_ANNUITY, SUBTYPE_CREDIT_CARD, SUBTYPE_AUTO, SUBTYPE_BUSINESS, SUBTYPE_COMMERCIAL, SUBTYPE_CONSTRUCTION, SUBTYPE_CONSUMER, SUBTYPE_HOME_EQUITY, SUBTYPE_LOAN, SUBTYPE_MORTGAGE, SUBTYPE_OVERDRAFT, SUBTYPE_LINE_OF_CREDIT, SUBTYPE_STUDENT};
    }

    public /* synthetic */ AccountSubtypeDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<AccountSubtypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountSubtypeDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.db_enum = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        AccountSubtypeDto[] accountSubtypeDtoArr$values = $values();
        $VALUES = accountSubtypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountSubtypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accio.service.v1.AccountSubtypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSubtypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AccountSubtypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccio/service/v1/AccountSubtypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Laccio/service/v1/AccountSubtypeDto;", "Laccio/service/v1/AccountSubtype;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccio/service/v1/AccountSubtypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AccountSubtypeDto, AccountSubtype> {

        /* compiled from: AccountSubtypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountSubtype.values().length];
                try {
                    iArr[AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CHECKING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_SAVINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_HSA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_MONEY_MARKET.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_PAYPAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_PREPAID.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CASH_MANAGEMENT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_EBT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_529.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_401A.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_401K.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_403B.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_457B.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_BROKERAGE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CASH_ISA.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CRYPTO_EXCHANGE.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_EDUCATION_SAVINGS_ACCOUNT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_FIXED_ANNUITY.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_GIC.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_IRA.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_ISA.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_KEOGH.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LIF.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LIFE_INSURANCE.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LIRA.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LRIF.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LRSP.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_MUTUAL_FUND.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_NON_CUSTODIAL_WALLET.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_OTHER.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_OTHER_ANNUITY.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_OTHER_INSURANCE.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_PENSION.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_PRIF.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_PROFIT_SHARING_PLAN.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_QSHR.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RDSP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RESP.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RETIREMENT.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RLIF.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_ROTH.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_ROTH_401K.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RRIF.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_RRSP.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_SARSEP.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_SEP_IRA.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_SIMPLE_IRA.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_SIPP.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_STOCK_PLAN.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_TFSA.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_TRUST.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_UGMA.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_UTMA.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_VARIABLE_ANNUITY.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CREDIT_CARD.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_AUTO.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_BUSINESS.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_COMMERCIAL.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CONSTRUCTION.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_CONSUMER.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_HOME_EQUITY.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LOAN.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_MORTGAGE.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_OVERDRAFT.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_LINE_OF_CREDIT.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[AccountSubtype.SUBTYPE_STUDENT.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountSubtypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSubtypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSubtypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountSubtypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountSubtype> getProtoAdapter() {
            return AccountSubtype.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSubtypeDto getZeroValue() {
            return AccountSubtypeDto.ACCOUNT_SUBTYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSubtypeDto fromProto(AccountSubtype proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AccountSubtypeDto.ACCOUNT_SUBTYPE_UNSPECIFIED;
                case 2:
                    return AccountSubtypeDto.SUBTYPE_CHECKING;
                case 3:
                    return AccountSubtypeDto.SUBTYPE_SAVINGS;
                case 4:
                    return AccountSubtypeDto.SUBTYPE_HSA;
                case 5:
                    return AccountSubtypeDto.SUBTYPE_CD;
                case 6:
                    return AccountSubtypeDto.SUBTYPE_MONEY_MARKET;
                case 7:
                    return AccountSubtypeDto.SUBTYPE_PAYPAL;
                case 8:
                    return AccountSubtypeDto.SUBTYPE_PREPAID;
                case 9:
                    return AccountSubtypeDto.SUBTYPE_CASH_MANAGEMENT;
                case 10:
                    return AccountSubtypeDto.SUBTYPE_EBT;
                case 11:
                    return AccountSubtypeDto.SUBTYPE_529;
                case 12:
                    return AccountSubtypeDto.SUBTYPE_401A;
                case 13:
                    return AccountSubtypeDto.SUBTYPE_401K;
                case 14:
                    return AccountSubtypeDto.SUBTYPE_403B;
                case 15:
                    return AccountSubtypeDto.SUBTYPE_457B;
                case 16:
                    return AccountSubtypeDto.SUBTYPE_BROKERAGE;
                case 17:
                    return AccountSubtypeDto.SUBTYPE_CASH_ISA;
                case 18:
                    return AccountSubtypeDto.SUBTYPE_CRYPTO_EXCHANGE;
                case 19:
                    return AccountSubtypeDto.SUBTYPE_EDUCATION_SAVINGS_ACCOUNT;
                case 20:
                    return AccountSubtypeDto.SUBTYPE_FIXED_ANNUITY;
                case 21:
                    return AccountSubtypeDto.SUBTYPE_GIC;
                case 22:
                    return AccountSubtypeDto.SUBTYPE_HEALTH_REIMBURSEMENT_ARRANGEMENT;
                case 23:
                    return AccountSubtypeDto.SUBTYPE_IRA;
                case 24:
                    return AccountSubtypeDto.SUBTYPE_ISA;
                case 25:
                    return AccountSubtypeDto.SUBTYPE_KEOGH;
                case 26:
                    return AccountSubtypeDto.SUBTYPE_LIF;
                case 27:
                    return AccountSubtypeDto.SUBTYPE_LIFE_INSURANCE;
                case 28:
                    return AccountSubtypeDto.SUBTYPE_LIRA;
                case 29:
                    return AccountSubtypeDto.SUBTYPE_LRIF;
                case 30:
                    return AccountSubtypeDto.SUBTYPE_LRSP;
                case 31:
                    return AccountSubtypeDto.SUBTYPE_MUTUAL_FUND;
                case 32:
                    return AccountSubtypeDto.SUBTYPE_NON_CUSTODIAL_WALLET;
                case 33:
                    return AccountSubtypeDto.SUBTYPE_NON_TAXABLE_BROKERAGE_ACCOUNT;
                case 34:
                    return AccountSubtypeDto.SUBTYPE_OTHER;
                case 35:
                    return AccountSubtypeDto.SUBTYPE_OTHER_ANNUITY;
                case 36:
                    return AccountSubtypeDto.SUBTYPE_OTHER_INSURANCE;
                case 37:
                    return AccountSubtypeDto.SUBTYPE_PENSION;
                case 38:
                    return AccountSubtypeDto.SUBTYPE_PRIF;
                case 39:
                    return AccountSubtypeDto.SUBTYPE_PROFIT_SHARING_PLAN;
                case 40:
                    return AccountSubtypeDto.SUBTYPE_QSHR;
                case 41:
                    return AccountSubtypeDto.SUBTYPE_RDSP;
                case 42:
                    return AccountSubtypeDto.SUBTYPE_RESP;
                case 43:
                    return AccountSubtypeDto.SUBTYPE_RETIREMENT;
                case 44:
                    return AccountSubtypeDto.SUBTYPE_RLIF;
                case 45:
                    return AccountSubtypeDto.SUBTYPE_ROTH;
                case 46:
                    return AccountSubtypeDto.SUBTYPE_ROTH_401K;
                case 47:
                    return AccountSubtypeDto.SUBTYPE_RRIF;
                case 48:
                    return AccountSubtypeDto.SUBTYPE_RRSP;
                case 49:
                    return AccountSubtypeDto.SUBTYPE_SARSEP;
                case 50:
                    return AccountSubtypeDto.SUBTYPE_SEP_IRA;
                case 51:
                    return AccountSubtypeDto.SUBTYPE_SIMPLE_IRA;
                case 52:
                    return AccountSubtypeDto.SUBTYPE_SIPP;
                case 53:
                    return AccountSubtypeDto.SUBTYPE_STOCK_PLAN;
                case 54:
                    return AccountSubtypeDto.SUBTYPE_TFSA;
                case 55:
                    return AccountSubtypeDto.SUBTYPE_TRUST;
                case 56:
                    return AccountSubtypeDto.SUBTYPE_UGMA;
                case 57:
                    return AccountSubtypeDto.SUBTYPE_UTMA;
                case 58:
                    return AccountSubtypeDto.SUBTYPE_VARIABLE_ANNUITY;
                case 59:
                    return AccountSubtypeDto.SUBTYPE_CREDIT_CARD;
                case 60:
                    return AccountSubtypeDto.SUBTYPE_AUTO;
                case 61:
                    return AccountSubtypeDto.SUBTYPE_BUSINESS;
                case 62:
                    return AccountSubtypeDto.SUBTYPE_COMMERCIAL;
                case 63:
                    return AccountSubtypeDto.SUBTYPE_CONSTRUCTION;
                case 64:
                    return AccountSubtypeDto.SUBTYPE_CONSUMER;
                case 65:
                    return AccountSubtypeDto.SUBTYPE_HOME_EQUITY;
                case 66:
                    return AccountSubtypeDto.SUBTYPE_LOAN;
                case 67:
                    return AccountSubtypeDto.SUBTYPE_MORTGAGE;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return AccountSubtypeDto.SUBTYPE_OVERDRAFT;
                case 69:
                    return AccountSubtypeDto.SUBTYPE_LINE_OF_CREDIT;
                case 70:
                    return AccountSubtypeDto.SUBTYPE_STUDENT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountSubtypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Laccio/service/v1/AccountSubtypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccio/service/v1/AccountSubtypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AccountSubtypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AccountSubtypeDto, AccountSubtype> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/accio.service.v1.AccountSubtype", AccountSubtypeDto.getEntries(), AccountSubtypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AccountSubtypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AccountSubtypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountSubtypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AccountSubtypeDto valueOf(String str) {
        return (AccountSubtypeDto) Enum.valueOf(AccountSubtypeDto.class, str);
    }

    public static AccountSubtypeDto[] values() {
        return (AccountSubtypeDto[]) $VALUES.clone();
    }
}
