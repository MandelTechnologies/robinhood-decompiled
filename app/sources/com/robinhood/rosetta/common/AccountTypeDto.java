package com.robinhood.rosetta.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import com.robinhood.utils.buildconfig.BuildFlavors;
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
/* compiled from: AccountTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000256B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/common/AccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/common/AccountType;", "Landroid/os/Parcelable;", "", "json_value", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDisplay_name", "ACCOUNT_TYPE_UNSPECIFIED", "RHY_ACCOUNT", "RHS_ACCOUNT", "EXTERNAL", "ACH_RELATIONSHIP", "RHY_FIRM_ACCOUNT", "RHS_FIRM_ACCOUNT", "DEBIT_CARD_INSTRUMENT", "RHC_FIRM_ACCOUNT", "RHS_TRADITIONAL_IRA", "RHS_ROTH_IRA", "RHS_TRADITIONAL_IRA_INHERITED", "RHS_ROTH_IRA_INHERITED", "RHY_SAVINGS", "RHM_FIRM_ACCOUNT", "UNKNOWN", "RHCE_USER_WALLET", "RHCE_FIRM_WALLET", "RHCE_CUSTOMER_ACCOUNT", "UK_BANK_ACCOUNT", "RCT_FIRM_ACCOUNT", "RHS_JOINT_TENANCY_WITH_ROS", "RCT_ACCOUNT", "OUTGOING_WIRE_ACCOUNT", "I18N_BANK_ACCOUNT", "RHD_ACCOUNT", "RHY_BANKING_FIRM_ACCOUNT", "RHY_BANKING_CHECKING", "RHY_BANKING_SAVINGS", "RHS_CUSTODIAL_UGMA", "RHS_CUSTODIAL_UTMA", "RHUK_ISA_STOCKS_AND_SHARES", "RHSG_FIRM_ACCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class AccountTypeDto implements Dto2<AccountType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AccountTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountTypeDto, AccountType>> binaryBase64Serializer$delegate;
    private final String display_name;
    private final String json_value;
    public static final AccountTypeDto ACCOUNT_TYPE_UNSPECIFIED = new AccountTypeDto("ACCOUNT_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.common.AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
        }
    };
    public static final AccountTypeDto RHY_ACCOUNT = new AccountTypeDto("RHY_ACCOUNT", 1) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_ACCOUNT
        {
            String str = "spending";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHS_ACCOUNT = new AccountTypeDto("RHS_ACCOUNT", 2) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_ACCOUNT
        {
            String str = "brokerage";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_ACCOUNT;
        }
    };
    public static final AccountTypeDto EXTERNAL = new AccountTypeDto("EXTERNAL", 3) { // from class: com.robinhood.rosetta.common.AccountTypeDto.EXTERNAL
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = BuildFlavors.EXTERNAL;
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.EXTERNAL;
        }
    };
    public static final AccountTypeDto ACH_RELATIONSHIP = new AccountTypeDto("ACH_RELATIONSHIP", 4) { // from class: com.robinhood.rosetta.common.AccountTypeDto.ACH_RELATIONSHIP
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "ach_relationship";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.ACH_RELATIONSHIP;
        }
    };
    public static final AccountTypeDto RHY_FIRM_ACCOUNT = new AccountTypeDto("RHY_FIRM_ACCOUNT", 5) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHS_FIRM_ACCOUNT = new AccountTypeDto("RHS_FIRM_ACCOUNT", 6) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto DEBIT_CARD_INSTRUMENT = new AccountTypeDto("DEBIT_CARD_INSTRUMENT", 7) { // from class: com.robinhood.rosetta.common.AccountTypeDto.DEBIT_CARD_INSTRUMENT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "debit_card_instrument";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.DEBIT_CARD_INSTRUMENT;
        }
    };
    public static final AccountTypeDto RHC_FIRM_ACCOUNT = new AccountTypeDto("RHC_FIRM_ACCOUNT", 8) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHC_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhc_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHC_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHS_TRADITIONAL_IRA = new AccountTypeDto("RHS_TRADITIONAL_IRA", 9) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_TRADITIONAL_IRA
        {
            String str = "Traditional IRA";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_traditional_ira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_TRADITIONAL_IRA;
        }
    };
    public static final AccountTypeDto RHS_ROTH_IRA = new AccountTypeDto("RHS_ROTH_IRA", 10) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_ROTH_IRA
        {
            String str = "Roth IRA";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_roth_ira";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_ROTH_IRA;
        }
    };
    public static final AccountTypeDto RHS_TRADITIONAL_IRA_INHERITED = new AccountTypeDto("RHS_TRADITIONAL_IRA_INHERITED", 11) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_TRADITIONAL_IRA_INHERITED
        {
            String str = "Inherited IRA";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_traditional_ira_inherited";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_TRADITIONAL_IRA_INHERITED;
        }
    };
    public static final AccountTypeDto RHS_ROTH_IRA_INHERITED = new AccountTypeDto("RHS_ROTH_IRA_INHERITED", 12) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_ROTH_IRA_INHERITED
        {
            String str = "Inherited IRA";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_roth_ira_inherited";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_ROTH_IRA_INHERITED;
        }
    };
    public static final AccountTypeDto RHY_SAVINGS = new AccountTypeDto("RHY_SAVINGS", 13) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_SAVINGS
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_savings";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_SAVINGS;
        }
    };
    public static final AccountTypeDto RHM_FIRM_ACCOUNT = new AccountTypeDto("RHM_FIRM_ACCOUNT", 14) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHM_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhm_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHM_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto UNKNOWN = new AccountTypeDto("UNKNOWN", 15) { // from class: com.robinhood.rosetta.common.AccountTypeDto.UNKNOWN
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "unknown";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.UNKNOWN;
        }
    };
    public static final AccountTypeDto RHCE_USER_WALLET = new AccountTypeDto("RHCE_USER_WALLET", 16) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHCE_USER_WALLET
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhce_user_wallet";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHCE_USER_WALLET;
        }
    };
    public static final AccountTypeDto RHCE_FIRM_WALLET = new AccountTypeDto("RHCE_FIRM_WALLET", 17) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHCE_FIRM_WALLET
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhce_firm_wallet";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHCE_FIRM_WALLET;
        }
    };
    public static final AccountTypeDto RHCE_CUSTOMER_ACCOUNT = new AccountTypeDto("RHCE_CUSTOMER_ACCOUNT", 18) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHCE_CUSTOMER_ACCOUNT
        {
            String str = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhce_customer_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHCE_CUSTOMER_ACCOUNT;
        }
    };
    public static final AccountTypeDto UK_BANK_ACCOUNT = new AccountTypeDto("UK_BANK_ACCOUNT", 19) { // from class: com.robinhood.rosetta.common.AccountTypeDto.UK_BANK_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE;
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.UK_BANK_ACCOUNT;
        }
    };
    public static final AccountTypeDto RCT_FIRM_ACCOUNT = new AccountTypeDto("RCT_FIRM_ACCOUNT", 20) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RCT_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rct_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RCT_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHS_JOINT_TENANCY_WITH_ROS = new AccountTypeDto("RHS_JOINT_TENANCY_WITH_ROS", 21) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_JOINT_TENANCY_WITH_ROS
        {
            String str = "Joint Tenancy With Rights Of Survivorship";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_joint_tenancy_with_ros";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_JOINT_TENANCY_WITH_ROS;
        }
    };
    public static final AccountTypeDto RCT_ACCOUNT = new AccountTypeDto("RCT_ACCOUNT", 22) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RCT_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rct_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RCT_ACCOUNT;
        }
    };
    public static final AccountTypeDto OUTGOING_WIRE_ACCOUNT = new AccountTypeDto("OUTGOING_WIRE_ACCOUNT", 23) { // from class: com.robinhood.rosetta.common.AccountTypeDto.OUTGOING_WIRE_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = PaymentInstrumentConstants.OUTGOING_WIRE_SERVER_VALUE;
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.OUTGOING_WIRE_ACCOUNT;
        }
    };
    public static final AccountTypeDto I18N_BANK_ACCOUNT = new AccountTypeDto("I18N_BANK_ACCOUNT", 24) { // from class: com.robinhood.rosetta.common.AccountTypeDto.I18N_BANK_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = PaymentInstrumentConstants.I18N_BANK_ACCOUNT_SERVER_VALUE;
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.I18N_BANK_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHD_ACCOUNT = new AccountTypeDto("RHD_ACCOUNT", 25) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHD_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhd_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHD_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHY_BANKING_FIRM_ACCOUNT = new AccountTypeDto("RHY_BANKING_FIRM_ACCOUNT", 26) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_BANKING_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_banking_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_BANKING_FIRM_ACCOUNT;
        }
    };
    public static final AccountTypeDto RHY_BANKING_CHECKING = new AccountTypeDto("RHY_BANKING_CHECKING", 27) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_BANKING_CHECKING
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_banking_checking";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_BANKING_CHECKING;
        }
    };
    public static final AccountTypeDto RHY_BANKING_SAVINGS = new AccountTypeDto("RHY_BANKING_SAVINGS", 28) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHY_BANKING_SAVINGS
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhy_banking_savings";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHY_BANKING_SAVINGS;
        }
    };
    public static final AccountTypeDto RHS_CUSTODIAL_UGMA = new AccountTypeDto("RHS_CUSTODIAL_UGMA", 29) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_CUSTODIAL_UGMA
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_custodial_ugma";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_CUSTODIAL_UGMA;
        }
    };
    public static final AccountTypeDto RHS_CUSTODIAL_UTMA = new AccountTypeDto("RHS_CUSTODIAL_UTMA", 30) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHS_CUSTODIAL_UTMA
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhs_custodial_utma";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHS_CUSTODIAL_UTMA;
        }
    };
    public static final AccountTypeDto RHUK_ISA_STOCKS_AND_SHARES = new AccountTypeDto("RHUK_ISA_STOCKS_AND_SHARES", 31) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHUK_ISA_STOCKS_AND_SHARES
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhuk_isa_stocks_and_shares";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHUK_ISA_STOCKS_AND_SHARES;
        }
    };
    public static final AccountTypeDto RHSG_FIRM_ACCOUNT = new AccountTypeDto("RHSG_FIRM_ACCOUNT", 32) { // from class: com.robinhood.rosetta.common.AccountTypeDto.RHSG_FIRM_ACCOUNT
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rhsg_firm_account";
        }

        @Override // com.robinhood.idl.Dto
        public AccountType toProto() {
            return AccountType.RHSG_FIRM_ACCOUNT;
        }
    };

    private static final /* synthetic */ AccountTypeDto[] $values() {
        return new AccountTypeDto[]{ACCOUNT_TYPE_UNSPECIFIED, RHY_ACCOUNT, RHS_ACCOUNT, EXTERNAL, ACH_RELATIONSHIP, RHY_FIRM_ACCOUNT, RHS_FIRM_ACCOUNT, DEBIT_CARD_INSTRUMENT, RHC_FIRM_ACCOUNT, RHS_TRADITIONAL_IRA, RHS_ROTH_IRA, RHS_TRADITIONAL_IRA_INHERITED, RHS_ROTH_IRA_INHERITED, RHY_SAVINGS, RHM_FIRM_ACCOUNT, UNKNOWN, RHCE_USER_WALLET, RHCE_FIRM_WALLET, RHCE_CUSTOMER_ACCOUNT, UK_BANK_ACCOUNT, RCT_FIRM_ACCOUNT, RHS_JOINT_TENANCY_WITH_ROS, RCT_ACCOUNT, OUTGOING_WIRE_ACCOUNT, I18N_BANK_ACCOUNT, RHD_ACCOUNT, RHY_BANKING_FIRM_ACCOUNT, RHY_BANKING_CHECKING, RHY_BANKING_SAVINGS, RHS_CUSTODIAL_UGMA, RHS_CUSTODIAL_UTMA, RHUK_ISA_STOCKS_AND_SHARES, RHSG_FIRM_ACCOUNT};
    }

    public /* synthetic */ AccountTypeDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<AccountTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountTypeDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.display_name = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    static {
        AccountTypeDto[] accountTypeDtoArr$values = $values();
        $VALUES = accountTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.common.AccountTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/common/AccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "Lcom/robinhood/rosetta/common/AccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AccountTypeDto, AccountType> {

        /* compiled from: AccountTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountType.values().length];
                try {
                    iArr[AccountType.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountType.RHY_ACCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountType.RHS_ACCOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccountType.EXTERNAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccountType.ACH_RELATIONSHIP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccountType.RHY_FIRM_ACCOUNT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AccountType.RHS_FIRM_ACCOUNT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AccountType.DEBIT_CARD_INSTRUMENT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AccountType.RHC_FIRM_ACCOUNT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AccountType.RHS_TRADITIONAL_IRA.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AccountType.RHS_ROTH_IRA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AccountType.RHS_TRADITIONAL_IRA_INHERITED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AccountType.RHS_ROTH_IRA_INHERITED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AccountType.RHY_SAVINGS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AccountType.RHM_FIRM_ACCOUNT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AccountType.UNKNOWN.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AccountType.RHCE_USER_WALLET.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AccountType.RHCE_FIRM_WALLET.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AccountType.RHCE_CUSTOMER_ACCOUNT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AccountType.UK_BANK_ACCOUNT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[AccountType.RCT_FIRM_ACCOUNT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[AccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[AccountType.RCT_ACCOUNT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[AccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[AccountType.I18N_BANK_ACCOUNT.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[AccountType.RHD_ACCOUNT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[AccountType.RHY_BANKING_FIRM_ACCOUNT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[AccountType.RHY_BANKING_CHECKING.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[AccountType.RHY_BANKING_SAVINGS.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[AccountType.RHS_CUSTODIAL_UGMA.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[AccountType.RHS_CUSTODIAL_UTMA.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[AccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[AccountType.RHSG_FIRM_ACCOUNT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountType> getProtoAdapter() {
            return AccountType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountTypeDto getZeroValue() {
            return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountTypeDto fromProto(AccountType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
                case 2:
                    return AccountTypeDto.RHY_ACCOUNT;
                case 3:
                    return AccountTypeDto.RHS_ACCOUNT;
                case 4:
                    return AccountTypeDto.EXTERNAL;
                case 5:
                    return AccountTypeDto.ACH_RELATIONSHIP;
                case 6:
                    return AccountTypeDto.RHY_FIRM_ACCOUNT;
                case 7:
                    return AccountTypeDto.RHS_FIRM_ACCOUNT;
                case 8:
                    return AccountTypeDto.DEBIT_CARD_INSTRUMENT;
                case 9:
                    return AccountTypeDto.RHC_FIRM_ACCOUNT;
                case 10:
                    return AccountTypeDto.RHS_TRADITIONAL_IRA;
                case 11:
                    return AccountTypeDto.RHS_ROTH_IRA;
                case 12:
                    return AccountTypeDto.RHS_TRADITIONAL_IRA_INHERITED;
                case 13:
                    return AccountTypeDto.RHS_ROTH_IRA_INHERITED;
                case 14:
                    return AccountTypeDto.RHY_SAVINGS;
                case 15:
                    return AccountTypeDto.RHM_FIRM_ACCOUNT;
                case 16:
                    return AccountTypeDto.UNKNOWN;
                case 17:
                    return AccountTypeDto.RHCE_USER_WALLET;
                case 18:
                    return AccountTypeDto.RHCE_FIRM_WALLET;
                case 19:
                    return AccountTypeDto.RHCE_CUSTOMER_ACCOUNT;
                case 20:
                    return AccountTypeDto.UK_BANK_ACCOUNT;
                case 21:
                    return AccountTypeDto.RCT_FIRM_ACCOUNT;
                case 22:
                    return AccountTypeDto.RHS_JOINT_TENANCY_WITH_ROS;
                case 23:
                    return AccountTypeDto.RCT_ACCOUNT;
                case 24:
                    return AccountTypeDto.OUTGOING_WIRE_ACCOUNT;
                case 25:
                    return AccountTypeDto.I18N_BANK_ACCOUNT;
                case 26:
                    return AccountTypeDto.RHD_ACCOUNT;
                case 27:
                    return AccountTypeDto.RHY_BANKING_FIRM_ACCOUNT;
                case 28:
                    return AccountTypeDto.RHY_BANKING_CHECKING;
                case 29:
                    return AccountTypeDto.RHY_BANKING_SAVINGS;
                case 30:
                    return AccountTypeDto.RHS_CUSTODIAL_UGMA;
                case 31:
                    return AccountTypeDto.RHS_CUSTODIAL_UTMA;
                case 32:
                    return AccountTypeDto.RHUK_ISA_STOCKS_AND_SHARES;
                case 33:
                    return AccountTypeDto.RHSG_FIRM_ACCOUNT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/common/AccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AccountTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AccountTypeDto, AccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.common.AccountType", AccountTypeDto.getEntries(), AccountTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AccountTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AccountTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AccountTypeDto valueOf(String str) {
        return (AccountTypeDto) Enum.valueOf(AccountTypeDto.class, str);
    }

    public static AccountTypeDto[] values() {
        return (AccountTypeDto[]) $VALUES.clone();
    }
}
