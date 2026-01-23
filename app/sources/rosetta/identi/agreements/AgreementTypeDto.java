package rosetta.identi.agreements;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
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
/* compiled from: AgreementTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u007f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u008c\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u008c\u0001\u008d\u0001B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\n\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001¨\u0006\u008e\u0001"}, m3636d2 = {"Lrosetta/identi/agreements/AgreementTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/identi/agreements/AgreementType;", "Landroid/os/Parcelable;", "", "auto_values", "", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;)V", "getAuto_values", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "AGREEMENT_TYPE_UNSPECIFIED", "MARGIN_AGREEMENT", "MARKETING_CONSENT", "INSTANT_AGREEMENT", "BROKERAGE_AGREEMENT", "BROKERAGE_AGREEMENT_WITH_W8BEN", "EMAIL_VERIFICATION_AGREEMENT", "PHONE_VERIFICATION_AGREEMENT", "PERSONA_SELFIE_AGREEMENT", "RHY_USER_AGREEMENT", "SUTTON_DEBIT_CARD_AGREEMENT", "PINDROP_VOICE_VERIFICATION_AGREEMENT", "PINDROP_VOICE_ENROLLMENT_AGREEMENT", "CRYPTO_USER_AGREEMENT", "BENEFICIARY_GENERAL_AGREEMENT", "BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT", "STOCK_LOAN_CUSTOMER_AGREEMENT_V2", "STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT", "CASH_SWEEP_AGREEMENT", "RETIREMENT_IRA_ROTH_AGREEMENT", "RETIREMENT_IRA_TRADITIONAL_AGREEMENT", "RETIREMENT_MARGIN_AGREEMENT", "STOCK_LOAN_CUSTODIAN_AGREEMENT", "PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT", "GOLD_AGREEMENT", "RAM_ADVISORY_AGREEMENT", "W8_AGREEMENT", "W8_AGREEMENT_IN_APP", "W9_AGREEMENT", "W9_AGREEMENT_IN_APP", "RHD_ONBOARDING", "JOINT_ACCOUNT_AGREEMENT", "RHD_ONBOARDING_ADDITIONAL_RISK", "RHD_ONBOARDING_ARBITRATION", "ROBINHOOD_LEGEND_AGREEMENT", "OPTION_AGREEMENT", "OPTION_INSTANT_AGREEMENT", "W8_AGREEMENT_ONBOARDING", "W9_AGREEMENT_IN_APP_PART1", "W9_AGREEMENT_IN_APP_PART2", "W9_AGREEMENT_ONBOARDING_PART1", "W9_AGREEMENT_ONBOARDING_PART2", "CRYPTO_ROUNDUP_AGREEMENT", "ACATS_IN_AGREEMENT", "STOCK_ROUNDUP_AGREEMENT", "DEBIT_CARD_AGREEMENT", "SLIP_BROKERAGE_AGREEMENT_ONBOARDING", "NCW_REWARDS_TOS", "RETIREMENT_IRA_ROTH_DRIP_AGREEMENT", "EU_CRYPTO_USER_AGREEMENT", "DRIP_AGREEMENT", "USER_ACCOUNT_AGREEMENT", "GOLD_DEBIT_AUTHORIZATION_AGREEMENT", "BROKERAGE_AGREEMENT_ONBOARDING", "WALLET_AGREEMENT", "RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT", "RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING", "INTERNAL_ASSET_TRANSFER_AGREEMENT", "MARGIN_AGREEMENT_ONBOARDING", "SLIP_AGREEMENT_ONBOARDING", "SWEEP_AGREEMENT_ONBOARDING", "RHD_EVENT_CONTRACT_ATTESTATION_ELECTION", "RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT", "RAM_INDIVIDUAL_AGREEMENT", "RAM_IRA_ROTH_AGREEMENT", "RAM_IRA_TRADITIONAL_AGREEMENT", "RAM_SLIP_AGREEMENT_ONBOARDING", "RHY_PREPAID_DEBIT_AGREEMENT", "RHY_SPENDING_AGREEMENT", "RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON", "RAM_SLIP_NATIVE_ONBOARDING", "RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS", "RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR", "RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL", "RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY", "ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING", "ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING", "ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING", "ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN", "ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN", "COMMON_REPORTING_STANDARD_SELF_CERTIFICATION", "SAGE_AGREEMENT", "AUTO_SEND_EQUITIES_MOBILE_AGREEMENT", "CORTEX_DIGEST_AGREEMENT", "RHY_ELECTRONIC_COMMUNICATIONS_CONSENT", "RHY_TERMS_OF_USE", "RHY_DEPOSIT_ACCOUNT_AGREEMENT", "REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS", "RHY_ACCOUNT_AGGREGATION_AGREEMENT", "RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT", "RHY_CASH_DELIVERY_TERMS", "RHY_DEBIT_CARD_AGREEMENT", "AUTO_SEND_LEGEND_AGREEMENT", "CRS_CARF_SELF_CERTIFICATION", "ACCOUNT_SCOPE_DRIP_AGREEMENT", "ACCOUNT_SCOPE_JA_DRIP_AGREEMENT", "CUSTODIAL_UGMA_AGREEMENT", "CUSTODIAL_UTMA_AGREEMENT", "ECBSV_AGREEMENT", "AUTO_SEND_CRYPTO_MOBILE_AGREEMENT", "RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT", "CUSTODIAL_ACCOUNT_AGREEMENT", "ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT", "RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS", "RHUK_STOCKS_AND_SHARES_ISA_DECLARATION", "RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES", "ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING", "ROBINHOOD_SOCIAL_AGREEMENT", "CUSTODIAL_MINOR_W9_AGREEMENT", "MMF_AGREEMENT", "RHUK_ISA_CASH_TRANSFER_DECLARATION", "IRA_ROTH_CRYPTO_USER_AGREEMENT", "IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT", "ACCOUNT_SCOPE_SLIP_AGREEMENT", "ACCOUNT_SCOPE_SWEEP_AGREEMENT", "ACCOUNT_SCOPE_BROKERAGE_AGREEMENT", "CORTEX_LEGEND_AGREEMENT", "ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT", "ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT", "MINNESOTA_USER_CRYPTO_DISCLOSURES", "INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.identi.agreements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AgreementTypeDto implements Dto2<AgreementType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AgreementTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AgreementTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AgreementTypeDto, AgreementType>> binaryBase64Serializer$delegate;
    private final Boolean auto_values;
    public static final AgreementTypeDto AGREEMENT_TYPE_UNSPECIFIED = new AgreementTypeDto("AGREEMENT_TYPE_UNSPECIFIED", 0) { // from class: rosetta.identi.agreements.AgreementTypeDto.AGREEMENT_TYPE_UNSPECIFIED
        {
            Boolean bool = Boolean.FALSE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.AGREEMENT_TYPE_UNSPECIFIED;
        }
    };
    public static final AgreementTypeDto MARGIN_AGREEMENT = new AgreementTypeDto("MARGIN_AGREEMENT", 1) { // from class: rosetta.identi.agreements.AgreementTypeDto.MARGIN_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.MARGIN_AGREEMENT;
        }
    };
    public static final AgreementTypeDto MARKETING_CONSENT = new AgreementTypeDto("MARKETING_CONSENT", 2) { // from class: rosetta.identi.agreements.AgreementTypeDto.MARKETING_CONSENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.MARKETING_CONSENT;
        }
    };
    public static final AgreementTypeDto INSTANT_AGREEMENT = new AgreementTypeDto("INSTANT_AGREEMENT", 3) { // from class: rosetta.identi.agreements.AgreementTypeDto.INSTANT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.INSTANT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto BROKERAGE_AGREEMENT = new AgreementTypeDto("BROKERAGE_AGREEMENT", 4) { // from class: rosetta.identi.agreements.AgreementTypeDto.BROKERAGE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.BROKERAGE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto BROKERAGE_AGREEMENT_WITH_W8BEN = new AgreementTypeDto("BROKERAGE_AGREEMENT_WITH_W8BEN", 5) { // from class: rosetta.identi.agreements.AgreementTypeDto.BROKERAGE_AGREEMENT_WITH_W8BEN
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.BROKERAGE_AGREEMENT_WITH_W8BEN;
        }
    };
    public static final AgreementTypeDto EMAIL_VERIFICATION_AGREEMENT = new AgreementTypeDto("EMAIL_VERIFICATION_AGREEMENT", 6) { // from class: rosetta.identi.agreements.AgreementTypeDto.EMAIL_VERIFICATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.EMAIL_VERIFICATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto PHONE_VERIFICATION_AGREEMENT = new AgreementTypeDto("PHONE_VERIFICATION_AGREEMENT", 7) { // from class: rosetta.identi.agreements.AgreementTypeDto.PHONE_VERIFICATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.PHONE_VERIFICATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto PERSONA_SELFIE_AGREEMENT = new AgreementTypeDto("PERSONA_SELFIE_AGREEMENT", 8) { // from class: rosetta.identi.agreements.AgreementTypeDto.PERSONA_SELFIE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.PERSONA_SELFIE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHY_USER_AGREEMENT = new AgreementTypeDto("RHY_USER_AGREEMENT", 9) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_USER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_USER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto SUTTON_DEBIT_CARD_AGREEMENT = new AgreementTypeDto("SUTTON_DEBIT_CARD_AGREEMENT", 10) { // from class: rosetta.identi.agreements.AgreementTypeDto.SUTTON_DEBIT_CARD_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.SUTTON_DEBIT_CARD_AGREEMENT;
        }
    };
    public static final AgreementTypeDto PINDROP_VOICE_VERIFICATION_AGREEMENT = new AgreementTypeDto("PINDROP_VOICE_VERIFICATION_AGREEMENT", 11) { // from class: rosetta.identi.agreements.AgreementTypeDto.PINDROP_VOICE_VERIFICATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.PINDROP_VOICE_VERIFICATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto PINDROP_VOICE_ENROLLMENT_AGREEMENT = new AgreementTypeDto("PINDROP_VOICE_ENROLLMENT_AGREEMENT", 12) { // from class: rosetta.identi.agreements.AgreementTypeDto.PINDROP_VOICE_ENROLLMENT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.PINDROP_VOICE_ENROLLMENT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CRYPTO_USER_AGREEMENT = new AgreementTypeDto("CRYPTO_USER_AGREEMENT", 13) { // from class: rosetta.identi.agreements.AgreementTypeDto.CRYPTO_USER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CRYPTO_USER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto BENEFICIARY_GENERAL_AGREEMENT = new AgreementTypeDto("BENEFICIARY_GENERAL_AGREEMENT", 14) { // from class: rosetta.identi.agreements.AgreementTypeDto.BENEFICIARY_GENERAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.BENEFICIARY_GENERAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT = new AgreementTypeDto("BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT", 15) { // from class: rosetta.identi.agreements.AgreementTypeDto.BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto STOCK_LOAN_CUSTOMER_AGREEMENT_V2 = new AgreementTypeDto("STOCK_LOAN_CUSTOMER_AGREEMENT_V2", 16) { // from class: rosetta.identi.agreements.AgreementTypeDto.STOCK_LOAN_CUSTOMER_AGREEMENT_V2
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.STOCK_LOAN_CUSTOMER_AGREEMENT_V2;
        }
    };
    public static final AgreementTypeDto STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT = new AgreementTypeDto("STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT", 17) { // from class: rosetta.identi.agreements.AgreementTypeDto.STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CASH_SWEEP_AGREEMENT = new AgreementTypeDto("CASH_SWEEP_AGREEMENT", 18) { // from class: rosetta.identi.agreements.AgreementTypeDto.CASH_SWEEP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CASH_SWEEP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RETIREMENT_IRA_ROTH_AGREEMENT = new AgreementTypeDto("RETIREMENT_IRA_ROTH_AGREEMENT", 19) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_IRA_ROTH_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_IRA_ROTH_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RETIREMENT_IRA_TRADITIONAL_AGREEMENT = new AgreementTypeDto("RETIREMENT_IRA_TRADITIONAL_AGREEMENT", 20) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_IRA_TRADITIONAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_IRA_TRADITIONAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RETIREMENT_MARGIN_AGREEMENT = new AgreementTypeDto("RETIREMENT_MARGIN_AGREEMENT", 21) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_MARGIN_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_MARGIN_AGREEMENT;
        }
    };
    public static final AgreementTypeDto STOCK_LOAN_CUSTODIAN_AGREEMENT = new AgreementTypeDto("STOCK_LOAN_CUSTODIAN_AGREEMENT", 22) { // from class: rosetta.identi.agreements.AgreementTypeDto.STOCK_LOAN_CUSTODIAN_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.STOCK_LOAN_CUSTODIAN_AGREEMENT;
        }
    };
    public static final AgreementTypeDto PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT = new AgreementTypeDto("PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT", 23) { // from class: rosetta.identi.agreements.AgreementTypeDto.PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto GOLD_AGREEMENT = new AgreementTypeDto("GOLD_AGREEMENT", 24) { // from class: rosetta.identi.agreements.AgreementTypeDto.GOLD_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.GOLD_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RAM_ADVISORY_AGREEMENT = new AgreementTypeDto("RAM_ADVISORY_AGREEMENT", 25) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_ADVISORY_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_ADVISORY_AGREEMENT;
        }
    };
    public static final AgreementTypeDto W8_AGREEMENT = new AgreementTypeDto("W8_AGREEMENT", 26) { // from class: rosetta.identi.agreements.AgreementTypeDto.W8_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W8_AGREEMENT;
        }
    };
    public static final AgreementTypeDto W8_AGREEMENT_IN_APP = new AgreementTypeDto("W8_AGREEMENT_IN_APP", 27) { // from class: rosetta.identi.agreements.AgreementTypeDto.W8_AGREEMENT_IN_APP
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W8_AGREEMENT_IN_APP;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT = new AgreementTypeDto("W9_AGREEMENT", 28) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT_IN_APP = new AgreementTypeDto("W9_AGREEMENT_IN_APP", 29) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT_IN_APP
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT_IN_APP;
        }
    };
    public static final AgreementTypeDto RHD_ONBOARDING = new AgreementTypeDto("RHD_ONBOARDING", 30) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_ONBOARDING;
        }
    };
    public static final AgreementTypeDto JOINT_ACCOUNT_AGREEMENT = new AgreementTypeDto("JOINT_ACCOUNT_AGREEMENT", 31) { // from class: rosetta.identi.agreements.AgreementTypeDto.JOINT_ACCOUNT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.JOINT_ACCOUNT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHD_ONBOARDING_ADDITIONAL_RISK = new AgreementTypeDto("RHD_ONBOARDING_ADDITIONAL_RISK", 32) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_ONBOARDING_ADDITIONAL_RISK
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_ONBOARDING_ADDITIONAL_RISK;
        }
    };
    public static final AgreementTypeDto RHD_ONBOARDING_ARBITRATION = new AgreementTypeDto("RHD_ONBOARDING_ARBITRATION", 33) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_ONBOARDING_ARBITRATION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_ONBOARDING_ARBITRATION;
        }
    };
    public static final AgreementTypeDto ROBINHOOD_LEGEND_AGREEMENT = new AgreementTypeDto("ROBINHOOD_LEGEND_AGREEMENT", 34) { // from class: rosetta.identi.agreements.AgreementTypeDto.ROBINHOOD_LEGEND_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ROBINHOOD_LEGEND_AGREEMENT;
        }
    };
    public static final AgreementTypeDto OPTION_AGREEMENT = new AgreementTypeDto("OPTION_AGREEMENT", 35) { // from class: rosetta.identi.agreements.AgreementTypeDto.OPTION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.OPTION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto OPTION_INSTANT_AGREEMENT = new AgreementTypeDto("OPTION_INSTANT_AGREEMENT", 36) { // from class: rosetta.identi.agreements.AgreementTypeDto.OPTION_INSTANT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.OPTION_INSTANT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto W8_AGREEMENT_ONBOARDING = new AgreementTypeDto("W8_AGREEMENT_ONBOARDING", 37) { // from class: rosetta.identi.agreements.AgreementTypeDto.W8_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W8_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT_IN_APP_PART1 = new AgreementTypeDto("W9_AGREEMENT_IN_APP_PART1", 38) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT_IN_APP_PART1
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT_IN_APP_PART1;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT_IN_APP_PART2 = new AgreementTypeDto("W9_AGREEMENT_IN_APP_PART2", 39) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT_IN_APP_PART2
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT_IN_APP_PART2;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT_ONBOARDING_PART1 = new AgreementTypeDto("W9_AGREEMENT_ONBOARDING_PART1", 40) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT_ONBOARDING_PART1
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT_ONBOARDING_PART1;
        }
    };
    public static final AgreementTypeDto W9_AGREEMENT_ONBOARDING_PART2 = new AgreementTypeDto("W9_AGREEMENT_ONBOARDING_PART2", 41) { // from class: rosetta.identi.agreements.AgreementTypeDto.W9_AGREEMENT_ONBOARDING_PART2
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.W9_AGREEMENT_ONBOARDING_PART2;
        }
    };
    public static final AgreementTypeDto CRYPTO_ROUNDUP_AGREEMENT = new AgreementTypeDto("CRYPTO_ROUNDUP_AGREEMENT", 42) { // from class: rosetta.identi.agreements.AgreementTypeDto.CRYPTO_ROUNDUP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CRYPTO_ROUNDUP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACATS_IN_AGREEMENT = new AgreementTypeDto("ACATS_IN_AGREEMENT", 43) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACATS_IN_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACATS_IN_AGREEMENT;
        }
    };
    public static final AgreementTypeDto STOCK_ROUNDUP_AGREEMENT = new AgreementTypeDto("STOCK_ROUNDUP_AGREEMENT", 44) { // from class: rosetta.identi.agreements.AgreementTypeDto.STOCK_ROUNDUP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.STOCK_ROUNDUP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto DEBIT_CARD_AGREEMENT = new AgreementTypeDto("DEBIT_CARD_AGREEMENT", 45) { // from class: rosetta.identi.agreements.AgreementTypeDto.DEBIT_CARD_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.DEBIT_CARD_AGREEMENT;
        }
    };
    public static final AgreementTypeDto SLIP_BROKERAGE_AGREEMENT_ONBOARDING = new AgreementTypeDto("SLIP_BROKERAGE_AGREEMENT_ONBOARDING", 46) { // from class: rosetta.identi.agreements.AgreementTypeDto.SLIP_BROKERAGE_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.SLIP_BROKERAGE_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto NCW_REWARDS_TOS = new AgreementTypeDto("NCW_REWARDS_TOS", 47) { // from class: rosetta.identi.agreements.AgreementTypeDto.NCW_REWARDS_TOS
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.NCW_REWARDS_TOS;
        }
    };
    public static final AgreementTypeDto RETIREMENT_IRA_ROTH_DRIP_AGREEMENT = new AgreementTypeDto("RETIREMENT_IRA_ROTH_DRIP_AGREEMENT", 48) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_IRA_ROTH_DRIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_IRA_ROTH_DRIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto EU_CRYPTO_USER_AGREEMENT = new AgreementTypeDto("EU_CRYPTO_USER_AGREEMENT", 49) { // from class: rosetta.identi.agreements.AgreementTypeDto.EU_CRYPTO_USER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.EU_CRYPTO_USER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto DRIP_AGREEMENT = new AgreementTypeDto("DRIP_AGREEMENT", 50) { // from class: rosetta.identi.agreements.AgreementTypeDto.DRIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.DRIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto USER_ACCOUNT_AGREEMENT = new AgreementTypeDto("USER_ACCOUNT_AGREEMENT", 51) { // from class: rosetta.identi.agreements.AgreementTypeDto.USER_ACCOUNT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.USER_ACCOUNT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto GOLD_DEBIT_AUTHORIZATION_AGREEMENT = new AgreementTypeDto("GOLD_DEBIT_AUTHORIZATION_AGREEMENT", 52) { // from class: rosetta.identi.agreements.AgreementTypeDto.GOLD_DEBIT_AUTHORIZATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.GOLD_DEBIT_AUTHORIZATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto BROKERAGE_AGREEMENT_ONBOARDING = new AgreementTypeDto("BROKERAGE_AGREEMENT_ONBOARDING", 53) { // from class: rosetta.identi.agreements.AgreementTypeDto.BROKERAGE_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.BROKERAGE_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto WALLET_AGREEMENT = new AgreementTypeDto("WALLET_AGREEMENT", 54) { // from class: rosetta.identi.agreements.AgreementTypeDto.WALLET_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.WALLET_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT = new AgreementTypeDto("RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT", 55) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING = new AgreementTypeDto("RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING", 56) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto INTERNAL_ASSET_TRANSFER_AGREEMENT = new AgreementTypeDto("INTERNAL_ASSET_TRANSFER_AGREEMENT", 57) { // from class: rosetta.identi.agreements.AgreementTypeDto.INTERNAL_ASSET_TRANSFER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.INTERNAL_ASSET_TRANSFER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto MARGIN_AGREEMENT_ONBOARDING = new AgreementTypeDto("MARGIN_AGREEMENT_ONBOARDING", 58) { // from class: rosetta.identi.agreements.AgreementTypeDto.MARGIN_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.MARGIN_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto SLIP_AGREEMENT_ONBOARDING = new AgreementTypeDto("SLIP_AGREEMENT_ONBOARDING", 59) { // from class: rosetta.identi.agreements.AgreementTypeDto.SLIP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.SLIP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto SWEEP_AGREEMENT_ONBOARDING = new AgreementTypeDto("SWEEP_AGREEMENT_ONBOARDING", 60) { // from class: rosetta.identi.agreements.AgreementTypeDto.SWEEP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.SWEEP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_ELECTION = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_ELECTION", 61) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_ELECTION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_ELECTION;
        }
    };
    public static final AgreementTypeDto RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT = new AgreementTypeDto("RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT", 62) { // from class: rosetta.identi.agreements.AgreementTypeDto.RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RAM_INDIVIDUAL_AGREEMENT = new AgreementTypeDto("RAM_INDIVIDUAL_AGREEMENT", 63) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_INDIVIDUAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_INDIVIDUAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RAM_IRA_ROTH_AGREEMENT = new AgreementTypeDto("RAM_IRA_ROTH_AGREEMENT", 64) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_IRA_ROTH_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_IRA_ROTH_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RAM_IRA_TRADITIONAL_AGREEMENT = new AgreementTypeDto("RAM_IRA_TRADITIONAL_AGREEMENT", 65) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_IRA_TRADITIONAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_IRA_TRADITIONAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RAM_SLIP_AGREEMENT_ONBOARDING = new AgreementTypeDto("RAM_SLIP_AGREEMENT_ONBOARDING", 66) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_SLIP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_SLIP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto RHY_PREPAID_DEBIT_AGREEMENT = new AgreementTypeDto("RHY_PREPAID_DEBIT_AGREEMENT", 67) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_PREPAID_DEBIT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_PREPAID_DEBIT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHY_SPENDING_AGREEMENT = new AgreementTypeDto("RHY_SPENDING_AGREEMENT", 68) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_SPENDING_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_SPENDING_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON", 69) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON;
        }
    };
    public static final AgreementTypeDto RAM_SLIP_NATIVE_ONBOARDING = new AgreementTypeDto("RAM_SLIP_NATIVE_ONBOARDING", 70) { // from class: rosetta.identi.agreements.AgreementTypeDto.RAM_SLIP_NATIVE_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RAM_SLIP_NATIVE_ONBOARDING;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS", 71) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR", 72) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL", 73) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY", 74) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING", 75) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING", 76) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING", 77) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN", 78) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN", 79) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN;
        }
    };
    public static final AgreementTypeDto COMMON_REPORTING_STANDARD_SELF_CERTIFICATION = new AgreementTypeDto("COMMON_REPORTING_STANDARD_SELF_CERTIFICATION", 80) { // from class: rosetta.identi.agreements.AgreementTypeDto.COMMON_REPORTING_STANDARD_SELF_CERTIFICATION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.COMMON_REPORTING_STANDARD_SELF_CERTIFICATION;
        }
    };
    public static final AgreementTypeDto SAGE_AGREEMENT = new AgreementTypeDto("SAGE_AGREEMENT", 81) { // from class: rosetta.identi.agreements.AgreementTypeDto.SAGE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.SAGE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto AUTO_SEND_EQUITIES_MOBILE_AGREEMENT = new AgreementTypeDto("AUTO_SEND_EQUITIES_MOBILE_AGREEMENT", 82) { // from class: rosetta.identi.agreements.AgreementTypeDto.AUTO_SEND_EQUITIES_MOBILE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.AUTO_SEND_EQUITIES_MOBILE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CORTEX_DIGEST_AGREEMENT = new AgreementTypeDto("CORTEX_DIGEST_AGREEMENT", 83) { // from class: rosetta.identi.agreements.AgreementTypeDto.CORTEX_DIGEST_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CORTEX_DIGEST_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHY_ELECTRONIC_COMMUNICATIONS_CONSENT = new AgreementTypeDto("RHY_ELECTRONIC_COMMUNICATIONS_CONSENT", 84) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_ELECTRONIC_COMMUNICATIONS_CONSENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_ELECTRONIC_COMMUNICATIONS_CONSENT;
        }
    };
    public static final AgreementTypeDto RHY_TERMS_OF_USE = new AgreementTypeDto("RHY_TERMS_OF_USE", 85) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_TERMS_OF_USE
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_TERMS_OF_USE;
        }
    };
    public static final AgreementTypeDto RHY_DEPOSIT_ACCOUNT_AGREEMENT = new AgreementTypeDto("RHY_DEPOSIT_ACCOUNT_AGREEMENT", 86) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_DEPOSIT_ACCOUNT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_DEPOSIT_ACCOUNT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS = new AgreementTypeDto("REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS", 87) { // from class: rosetta.identi.agreements.AgreementTypeDto.REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS;
        }
    };
    public static final AgreementTypeDto RHY_ACCOUNT_AGGREGATION_AGREEMENT = new AgreementTypeDto("RHY_ACCOUNT_AGGREGATION_AGREEMENT", 88) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_ACCOUNT_AGGREGATION_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_ACCOUNT_AGGREGATION_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT = new AgreementTypeDto("RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT", 89) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHY_CASH_DELIVERY_TERMS = new AgreementTypeDto("RHY_CASH_DELIVERY_TERMS", 90) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_CASH_DELIVERY_TERMS
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_CASH_DELIVERY_TERMS;
        }
    };
    public static final AgreementTypeDto RHY_DEBIT_CARD_AGREEMENT = new AgreementTypeDto("RHY_DEBIT_CARD_AGREEMENT", 91) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHY_DEBIT_CARD_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHY_DEBIT_CARD_AGREEMENT;
        }
    };
    public static final AgreementTypeDto AUTO_SEND_LEGEND_AGREEMENT = new AgreementTypeDto("AUTO_SEND_LEGEND_AGREEMENT", 92) { // from class: rosetta.identi.agreements.AgreementTypeDto.AUTO_SEND_LEGEND_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.AUTO_SEND_LEGEND_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CRS_CARF_SELF_CERTIFICATION = new AgreementTypeDto("CRS_CARF_SELF_CERTIFICATION", 93) { // from class: rosetta.identi.agreements.AgreementTypeDto.CRS_CARF_SELF_CERTIFICATION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CRS_CARF_SELF_CERTIFICATION;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_DRIP_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_DRIP_AGREEMENT", 94) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_DRIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_DRIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_JA_DRIP_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_JA_DRIP_AGREEMENT", 95) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_JA_DRIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_JA_DRIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CUSTODIAL_UGMA_AGREEMENT = new AgreementTypeDto("CUSTODIAL_UGMA_AGREEMENT", 96) { // from class: rosetta.identi.agreements.AgreementTypeDto.CUSTODIAL_UGMA_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CUSTODIAL_UGMA_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CUSTODIAL_UTMA_AGREEMENT = new AgreementTypeDto("CUSTODIAL_UTMA_AGREEMENT", 97) { // from class: rosetta.identi.agreements.AgreementTypeDto.CUSTODIAL_UTMA_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CUSTODIAL_UTMA_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ECBSV_AGREEMENT = new AgreementTypeDto("ECBSV_AGREEMENT", 98) { // from class: rosetta.identi.agreements.AgreementTypeDto.ECBSV_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ECBSV_AGREEMENT;
        }
    };
    public static final AgreementTypeDto AUTO_SEND_CRYPTO_MOBILE_AGREEMENT = new AgreementTypeDto("AUTO_SEND_CRYPTO_MOBILE_AGREEMENT", 99) { // from class: rosetta.identi.agreements.AgreementTypeDto.AUTO_SEND_CRYPTO_MOBILE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.AUTO_SEND_CRYPTO_MOBILE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT = new AgreementTypeDto("RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT", 100) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CUSTODIAL_ACCOUNT_AGREEMENT = new AgreementTypeDto("CUSTODIAL_ACCOUNT_AGREEMENT", 101) { // from class: rosetta.identi.agreements.AgreementTypeDto.CUSTODIAL_ACCOUNT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CUSTODIAL_ACCOUNT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT = new AgreementTypeDto("ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT", 102) { // from class: rosetta.identi.agreements.AgreementTypeDto.ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS = new AgreementTypeDto("RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS", 103) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS;
        }
    };
    public static final AgreementTypeDto RHUK_STOCKS_AND_SHARES_ISA_DECLARATION = new AgreementTypeDto("RHUK_STOCKS_AND_SHARES_ISA_DECLARATION", 104) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_DECLARATION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHUK_STOCKS_AND_SHARES_ISA_DECLARATION;
        }
    };
    public static final AgreementTypeDto RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES = new AgreementTypeDto("RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES", 105) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING = new AgreementTypeDto("ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING", 106) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING;
        }
    };
    public static final AgreementTypeDto ROBINHOOD_SOCIAL_AGREEMENT = new AgreementTypeDto("ROBINHOOD_SOCIAL_AGREEMENT", 107) { // from class: rosetta.identi.agreements.AgreementTypeDto.ROBINHOOD_SOCIAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ROBINHOOD_SOCIAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CUSTODIAL_MINOR_W9_AGREEMENT = new AgreementTypeDto("CUSTODIAL_MINOR_W9_AGREEMENT", 108) { // from class: rosetta.identi.agreements.AgreementTypeDto.CUSTODIAL_MINOR_W9_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CUSTODIAL_MINOR_W9_AGREEMENT;
        }
    };
    public static final AgreementTypeDto MMF_AGREEMENT = new AgreementTypeDto("MMF_AGREEMENT", 109) { // from class: rosetta.identi.agreements.AgreementTypeDto.MMF_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.MMF_AGREEMENT;
        }
    };
    public static final AgreementTypeDto RHUK_ISA_CASH_TRANSFER_DECLARATION = new AgreementTypeDto("RHUK_ISA_CASH_TRANSFER_DECLARATION", 110) { // from class: rosetta.identi.agreements.AgreementTypeDto.RHUK_ISA_CASH_TRANSFER_DECLARATION
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.RHUK_ISA_CASH_TRANSFER_DECLARATION;
        }
    };
    public static final AgreementTypeDto IRA_ROTH_CRYPTO_USER_AGREEMENT = new AgreementTypeDto("IRA_ROTH_CRYPTO_USER_AGREEMENT", 111) { // from class: rosetta.identi.agreements.AgreementTypeDto.IRA_ROTH_CRYPTO_USER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.IRA_ROTH_CRYPTO_USER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT = new AgreementTypeDto("IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT", 112) { // from class: rosetta.identi.agreements.AgreementTypeDto.IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_SLIP_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_SLIP_AGREEMENT", 113) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_SLIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_SLIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_SWEEP_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_SWEEP_AGREEMENT", 114) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_SWEEP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_SWEEP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_BROKERAGE_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_BROKERAGE_AGREEMENT", 115) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_BROKERAGE_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_BROKERAGE_AGREEMENT;
        }
    };
    public static final AgreementTypeDto CORTEX_LEGEND_AGREEMENT = new AgreementTypeDto("CORTEX_LEGEND_AGREEMENT", 116) { // from class: rosetta.identi.agreements.AgreementTypeDto.CORTEX_LEGEND_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.CORTEX_LEGEND_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT = new AgreementTypeDto("ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT", 117) { // from class: rosetta.identi.agreements.AgreementTypeDto.ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT;
        }
    };
    public static final AgreementTypeDto ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT = new AgreementTypeDto("ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT", 118) { // from class: rosetta.identi.agreements.AgreementTypeDto.ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT;
        }
    };
    public static final AgreementTypeDto MINNESOTA_USER_CRYPTO_DISCLOSURES = new AgreementTypeDto("MINNESOTA_USER_CRYPTO_DISCLOSURES", 119) { // from class: rosetta.identi.agreements.AgreementTypeDto.MINNESOTA_USER_CRYPTO_DISCLOSURES
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.MINNESOTA_USER_CRYPTO_DISCLOSURES;
        }
    };
    public static final AgreementTypeDto INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT = new AgreementTypeDto("INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT", 120) { // from class: rosetta.identi.agreements.AgreementTypeDto.INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT
        {
            Boolean bool = Boolean.TRUE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AgreementType toProto() {
            return AgreementType.INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT;
        }
    };

    private static final /* synthetic */ AgreementTypeDto[] $values() {
        return new AgreementTypeDto[]{AGREEMENT_TYPE_UNSPECIFIED, MARGIN_AGREEMENT, MARKETING_CONSENT, INSTANT_AGREEMENT, BROKERAGE_AGREEMENT, BROKERAGE_AGREEMENT_WITH_W8BEN, EMAIL_VERIFICATION_AGREEMENT, PHONE_VERIFICATION_AGREEMENT, PERSONA_SELFIE_AGREEMENT, RHY_USER_AGREEMENT, SUTTON_DEBIT_CARD_AGREEMENT, PINDROP_VOICE_VERIFICATION_AGREEMENT, PINDROP_VOICE_ENROLLMENT_AGREEMENT, CRYPTO_USER_AGREEMENT, BENEFICIARY_GENERAL_AGREEMENT, BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT, STOCK_LOAN_CUSTOMER_AGREEMENT_V2, STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT, CASH_SWEEP_AGREEMENT, RETIREMENT_IRA_ROTH_AGREEMENT, RETIREMENT_IRA_TRADITIONAL_AGREEMENT, RETIREMENT_MARGIN_AGREEMENT, STOCK_LOAN_CUSTODIAN_AGREEMENT, PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT, GOLD_AGREEMENT, RAM_ADVISORY_AGREEMENT, W8_AGREEMENT, W8_AGREEMENT_IN_APP, W9_AGREEMENT, W9_AGREEMENT_IN_APP, RHD_ONBOARDING, JOINT_ACCOUNT_AGREEMENT, RHD_ONBOARDING_ADDITIONAL_RISK, RHD_ONBOARDING_ARBITRATION, ROBINHOOD_LEGEND_AGREEMENT, OPTION_AGREEMENT, OPTION_INSTANT_AGREEMENT, W8_AGREEMENT_ONBOARDING, W9_AGREEMENT_IN_APP_PART1, W9_AGREEMENT_IN_APP_PART2, W9_AGREEMENT_ONBOARDING_PART1, W9_AGREEMENT_ONBOARDING_PART2, CRYPTO_ROUNDUP_AGREEMENT, ACATS_IN_AGREEMENT, STOCK_ROUNDUP_AGREEMENT, DEBIT_CARD_AGREEMENT, SLIP_BROKERAGE_AGREEMENT_ONBOARDING, NCW_REWARDS_TOS, RETIREMENT_IRA_ROTH_DRIP_AGREEMENT, EU_CRYPTO_USER_AGREEMENT, DRIP_AGREEMENT, USER_ACCOUNT_AGREEMENT, GOLD_DEBIT_AUTHORIZATION_AGREEMENT, BROKERAGE_AGREEMENT_ONBOARDING, WALLET_AGREEMENT, RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT, RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING, INTERNAL_ASSET_TRANSFER_AGREEMENT, MARGIN_AGREEMENT_ONBOARDING, SLIP_AGREEMENT_ONBOARDING, SWEEP_AGREEMENT_ONBOARDING, RHD_EVENT_CONTRACT_ATTESTATION_ELECTION, RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT, RAM_INDIVIDUAL_AGREEMENT, RAM_IRA_ROTH_AGREEMENT, RAM_IRA_TRADITIONAL_AGREEMENT, RAM_SLIP_AGREEMENT_ONBOARDING, RHY_PREPAID_DEBIT_AGREEMENT, RHY_SPENDING_AGREEMENT, RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON, RAM_SLIP_NATIVE_ONBOARDING, RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS, RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR, RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL, RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY, ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING, ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING, ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING, ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN, ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN, COMMON_REPORTING_STANDARD_SELF_CERTIFICATION, SAGE_AGREEMENT, AUTO_SEND_EQUITIES_MOBILE_AGREEMENT, CORTEX_DIGEST_AGREEMENT, RHY_ELECTRONIC_COMMUNICATIONS_CONSENT, RHY_TERMS_OF_USE, RHY_DEPOSIT_ACCOUNT_AGREEMENT, REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS, RHY_ACCOUNT_AGGREGATION_AGREEMENT, RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT, RHY_CASH_DELIVERY_TERMS, RHY_DEBIT_CARD_AGREEMENT, AUTO_SEND_LEGEND_AGREEMENT, CRS_CARF_SELF_CERTIFICATION, ACCOUNT_SCOPE_DRIP_AGREEMENT, ACCOUNT_SCOPE_JA_DRIP_AGREEMENT, CUSTODIAL_UGMA_AGREEMENT, CUSTODIAL_UTMA_AGREEMENT, ECBSV_AGREEMENT, AUTO_SEND_CRYPTO_MOBILE_AGREEMENT, RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT, CUSTODIAL_ACCOUNT_AGREEMENT, ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT, RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS, RHUK_STOCKS_AND_SHARES_ISA_DECLARATION, RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES, ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING, ROBINHOOD_SOCIAL_AGREEMENT, CUSTODIAL_MINOR_W9_AGREEMENT, MMF_AGREEMENT, RHUK_ISA_CASH_TRANSFER_DECLARATION, IRA_ROTH_CRYPTO_USER_AGREEMENT, IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT, ACCOUNT_SCOPE_SLIP_AGREEMENT, ACCOUNT_SCOPE_SWEEP_AGREEMENT, ACCOUNT_SCOPE_BROKERAGE_AGREEMENT, CORTEX_LEGEND_AGREEMENT, ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT, ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT, MINNESOTA_USER_CRYPTO_DISCLOSURES, INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT};
    }

    public /* synthetic */ AgreementTypeDto(String str, int i, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, bool);
    }

    public static EnumEntries<AgreementTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AgreementTypeDto(String str, int i, Boolean bool) {
        this.auto_values = bool;
    }

    public final Boolean getAuto_values() {
        return this.auto_values;
    }

    static {
        AgreementTypeDto[] agreementTypeDtoArr$values = $values();
        $VALUES = agreementTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(agreementTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.identi.agreements.AgreementTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgreementTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AgreementTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/identi/agreements/AgreementTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/identi/agreements/AgreementTypeDto;", "Lrosetta/identi/agreements/AgreementType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/identi/agreements/AgreementTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.identi.agreements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AgreementTypeDto, AgreementType> {

        /* compiled from: AgreementTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AgreementType.values().length];
                try {
                    iArr[AgreementType.AGREEMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AgreementType.MARGIN_AGREEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AgreementType.MARKETING_CONSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AgreementType.INSTANT_AGREEMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AgreementType.BROKERAGE_AGREEMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AgreementType.BROKERAGE_AGREEMENT_WITH_W8BEN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AgreementType.EMAIL_VERIFICATION_AGREEMENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AgreementType.PHONE_VERIFICATION_AGREEMENT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AgreementType.PERSONA_SELFIE_AGREEMENT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AgreementType.RHY_USER_AGREEMENT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AgreementType.SUTTON_DEBIT_CARD_AGREEMENT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AgreementType.PINDROP_VOICE_VERIFICATION_AGREEMENT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AgreementType.PINDROP_VOICE_ENROLLMENT_AGREEMENT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AgreementType.CRYPTO_USER_AGREEMENT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AgreementType.BENEFICIARY_GENERAL_AGREEMENT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AgreementType.BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AgreementType.STOCK_LOAN_CUSTOMER_AGREEMENT_V2.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AgreementType.STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AgreementType.CASH_SWEEP_AGREEMENT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_IRA_ROTH_AGREEMENT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_IRA_TRADITIONAL_AGREEMENT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_MARGIN_AGREEMENT.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[AgreementType.STOCK_LOAN_CUSTODIAN_AGREEMENT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[AgreementType.PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[AgreementType.GOLD_AGREEMENT.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[AgreementType.RAM_ADVISORY_AGREEMENT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[AgreementType.W8_AGREEMENT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[AgreementType.W8_AGREEMENT_IN_APP.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT_IN_APP.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[AgreementType.RHD_ONBOARDING.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[AgreementType.JOINT_ACCOUNT_AGREEMENT.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[AgreementType.RHD_ONBOARDING_ADDITIONAL_RISK.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[AgreementType.RHD_ONBOARDING_ARBITRATION.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[AgreementType.ROBINHOOD_LEGEND_AGREEMENT.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[AgreementType.OPTION_AGREEMENT.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[AgreementType.OPTION_INSTANT_AGREEMENT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[AgreementType.W8_AGREEMENT_ONBOARDING.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT_IN_APP_PART1.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT_IN_APP_PART2.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT_ONBOARDING_PART1.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[AgreementType.W9_AGREEMENT_ONBOARDING_PART2.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[AgreementType.CRYPTO_ROUNDUP_AGREEMENT.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[AgreementType.ACATS_IN_AGREEMENT.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[AgreementType.STOCK_ROUNDUP_AGREEMENT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[AgreementType.DEBIT_CARD_AGREEMENT.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[AgreementType.SLIP_BROKERAGE_AGREEMENT_ONBOARDING.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[AgreementType.NCW_REWARDS_TOS.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_IRA_ROTH_DRIP_AGREEMENT.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[AgreementType.EU_CRYPTO_USER_AGREEMENT.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[AgreementType.DRIP_AGREEMENT.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[AgreementType.USER_ACCOUNT_AGREEMENT.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[AgreementType.GOLD_DEBIT_AUTHORIZATION_AGREEMENT.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[AgreementType.BROKERAGE_AGREEMENT_ONBOARDING.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[AgreementType.WALLET_AGREEMENT.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[AgreementType.RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[AgreementType.INTERNAL_ASSET_TRANSFER_AGREEMENT.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[AgreementType.MARGIN_AGREEMENT_ONBOARDING.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[AgreementType.SLIP_AGREEMENT_ONBOARDING.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[AgreementType.SWEEP_AGREEMENT_ONBOARDING.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_ELECTION.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[AgreementType.RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[AgreementType.RAM_INDIVIDUAL_AGREEMENT.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[AgreementType.RAM_IRA_ROTH_AGREEMENT.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[AgreementType.RAM_IRA_TRADITIONAL_AGREEMENT.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[AgreementType.RAM_SLIP_AGREEMENT_ONBOARDING.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[AgreementType.RHY_PREPAID_DEBIT_AGREEMENT.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[AgreementType.RHY_SPENDING_AGREEMENT.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[AgreementType.RAM_SLIP_NATIVE_ONBOARDING.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[AgreementType.COMMON_REPORTING_STANDARD_SELF_CERTIFICATION.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[AgreementType.SAGE_AGREEMENT.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[AgreementType.AUTO_SEND_EQUITIES_MOBILE_AGREEMENT.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[AgreementType.CORTEX_DIGEST_AGREEMENT.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[AgreementType.RHY_ELECTRONIC_COMMUNICATIONS_CONSENT.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[AgreementType.RHY_TERMS_OF_USE.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[AgreementType.RHY_DEPOSIT_ACCOUNT_AGREEMENT.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[AgreementType.REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[AgreementType.RHY_ACCOUNT_AGGREGATION_AGREEMENT.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[AgreementType.RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[AgreementType.RHY_CASH_DELIVERY_TERMS.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[AgreementType.RHY_DEBIT_CARD_AGREEMENT.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[AgreementType.AUTO_SEND_LEGEND_AGREEMENT.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[AgreementType.CRS_CARF_SELF_CERTIFICATION.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_DRIP_AGREEMENT.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_JA_DRIP_AGREEMENT.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[AgreementType.CUSTODIAL_UGMA_AGREEMENT.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[AgreementType.CUSTODIAL_UTMA_AGREEMENT.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[AgreementType.ECBSV_AGREEMENT.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[AgreementType.AUTO_SEND_CRYPTO_MOBILE_AGREEMENT.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[AgreementType.RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[AgreementType.CUSTODIAL_ACCOUNT_AGREEMENT.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[AgreementType.ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[AgreementType.RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[AgreementType.RHUK_STOCKS_AND_SHARES_ISA_DECLARATION.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[AgreementType.RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[AgreementType.ROBINHOOD_SOCIAL_AGREEMENT.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[AgreementType.CUSTODIAL_MINOR_W9_AGREEMENT.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[AgreementType.MMF_AGREEMENT.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[AgreementType.RHUK_ISA_CASH_TRANSFER_DECLARATION.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[AgreementType.IRA_ROTH_CRYPTO_USER_AGREEMENT.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[AgreementType.IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_SLIP_AGREEMENT.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_SWEEP_AGREEMENT.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_BROKERAGE_AGREEMENT.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[AgreementType.CORTEX_LEGEND_AGREEMENT.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[AgreementType.ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[AgreementType.ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[AgreementType.MINNESOTA_USER_CRYPTO_DISCLOSURES.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[AgreementType.INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AgreementTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgreementTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgreementTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AgreementTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AgreementType> getProtoAdapter() {
            return AgreementType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgreementTypeDto getZeroValue() {
            return AgreementTypeDto.AGREEMENT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgreementTypeDto fromProto(AgreementType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AgreementTypeDto.AGREEMENT_TYPE_UNSPECIFIED;
                case 2:
                    return AgreementTypeDto.MARGIN_AGREEMENT;
                case 3:
                    return AgreementTypeDto.MARKETING_CONSENT;
                case 4:
                    return AgreementTypeDto.INSTANT_AGREEMENT;
                case 5:
                    return AgreementTypeDto.BROKERAGE_AGREEMENT;
                case 6:
                    return AgreementTypeDto.BROKERAGE_AGREEMENT_WITH_W8BEN;
                case 7:
                    return AgreementTypeDto.EMAIL_VERIFICATION_AGREEMENT;
                case 8:
                    return AgreementTypeDto.PHONE_VERIFICATION_AGREEMENT;
                case 9:
                    return AgreementTypeDto.PERSONA_SELFIE_AGREEMENT;
                case 10:
                    return AgreementTypeDto.RHY_USER_AGREEMENT;
                case 11:
                    return AgreementTypeDto.SUTTON_DEBIT_CARD_AGREEMENT;
                case 12:
                    return AgreementTypeDto.PINDROP_VOICE_VERIFICATION_AGREEMENT;
                case 13:
                    return AgreementTypeDto.PINDROP_VOICE_ENROLLMENT_AGREEMENT;
                case 14:
                    return AgreementTypeDto.CRYPTO_USER_AGREEMENT;
                case 15:
                    return AgreementTypeDto.BENEFICIARY_GENERAL_AGREEMENT;
                case 16:
                    return AgreementTypeDto.BENEFICIARY_SPOUSAL_CONSENT_AGREEMENT;
                case 17:
                    return AgreementTypeDto.STOCK_LOAN_CUSTOMER_AGREEMENT_V2;
                case 18:
                    return AgreementTypeDto.STOCK_LOAN_WELLS_FARGO_CUSTODIAN_AGREEMENT;
                case 19:
                    return AgreementTypeDto.CASH_SWEEP_AGREEMENT;
                case 20:
                    return AgreementTypeDto.RETIREMENT_IRA_ROTH_AGREEMENT;
                case 21:
                    return AgreementTypeDto.RETIREMENT_IRA_TRADITIONAL_AGREEMENT;
                case 22:
                    return AgreementTypeDto.RETIREMENT_MARGIN_AGREEMENT;
                case 23:
                    return AgreementTypeDto.STOCK_LOAN_CUSTODIAN_AGREEMENT;
                case 24:
                    return AgreementTypeDto.PAYCHECK_RECURRING_INVESTMENTS_CUSTOMER_AGREEMENT;
                case 25:
                    return AgreementTypeDto.GOLD_AGREEMENT;
                case 26:
                    return AgreementTypeDto.RAM_ADVISORY_AGREEMENT;
                case 27:
                    return AgreementTypeDto.W8_AGREEMENT;
                case 28:
                    return AgreementTypeDto.W8_AGREEMENT_IN_APP;
                case 29:
                    return AgreementTypeDto.W9_AGREEMENT;
                case 30:
                    return AgreementTypeDto.W9_AGREEMENT_IN_APP;
                case 31:
                    return AgreementTypeDto.RHD_ONBOARDING;
                case 32:
                    return AgreementTypeDto.JOINT_ACCOUNT_AGREEMENT;
                case 33:
                    return AgreementTypeDto.RHD_ONBOARDING_ADDITIONAL_RISK;
                case 34:
                    return AgreementTypeDto.RHD_ONBOARDING_ARBITRATION;
                case 35:
                    return AgreementTypeDto.ROBINHOOD_LEGEND_AGREEMENT;
                case 36:
                    return AgreementTypeDto.OPTION_AGREEMENT;
                case 37:
                    return AgreementTypeDto.OPTION_INSTANT_AGREEMENT;
                case 38:
                    return AgreementTypeDto.W8_AGREEMENT_ONBOARDING;
                case 39:
                    return AgreementTypeDto.W9_AGREEMENT_IN_APP_PART1;
                case 40:
                    return AgreementTypeDto.W9_AGREEMENT_IN_APP_PART2;
                case 41:
                    return AgreementTypeDto.W9_AGREEMENT_ONBOARDING_PART1;
                case 42:
                    return AgreementTypeDto.W9_AGREEMENT_ONBOARDING_PART2;
                case 43:
                    return AgreementTypeDto.CRYPTO_ROUNDUP_AGREEMENT;
                case 44:
                    return AgreementTypeDto.ACATS_IN_AGREEMENT;
                case 45:
                    return AgreementTypeDto.STOCK_ROUNDUP_AGREEMENT;
                case 46:
                    return AgreementTypeDto.DEBIT_CARD_AGREEMENT;
                case 47:
                    return AgreementTypeDto.SLIP_BROKERAGE_AGREEMENT_ONBOARDING;
                case 48:
                    return AgreementTypeDto.NCW_REWARDS_TOS;
                case 49:
                    return AgreementTypeDto.RETIREMENT_IRA_ROTH_DRIP_AGREEMENT;
                case 50:
                    return AgreementTypeDto.EU_CRYPTO_USER_AGREEMENT;
                case 51:
                    return AgreementTypeDto.DRIP_AGREEMENT;
                case 52:
                    return AgreementTypeDto.USER_ACCOUNT_AGREEMENT;
                case 53:
                    return AgreementTypeDto.GOLD_DEBIT_AUTHORIZATION_AGREEMENT;
                case 54:
                    return AgreementTypeDto.BROKERAGE_AGREEMENT_ONBOARDING;
                case 55:
                    return AgreementTypeDto.WALLET_AGREEMENT;
                case 56:
                    return AgreementTypeDto.RETIREMENT_IRA_TRADITIONAL_DRIP_AGREEMENT;
                case 57:
                    return AgreementTypeDto.RHF_INSTANT_CUSTOMER_AGREEMENT_ONBOARDING;
                case 58:
                    return AgreementTypeDto.INTERNAL_ASSET_TRANSFER_AGREEMENT;
                case 59:
                    return AgreementTypeDto.MARGIN_AGREEMENT_ONBOARDING;
                case 60:
                    return AgreementTypeDto.SLIP_AGREEMENT_ONBOARDING;
                case 61:
                    return AgreementTypeDto.SWEEP_AGREEMENT_ONBOARDING;
                case 62:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_ELECTION;
                case 63:
                    return AgreementTypeDto.RETIREMENT_JOINT_ACCOUNT_REMEDIATION_AGREEMENT;
                case 64:
                    return AgreementTypeDto.RAM_INDIVIDUAL_AGREEMENT;
                case 65:
                    return AgreementTypeDto.RAM_IRA_ROTH_AGREEMENT;
                case 66:
                    return AgreementTypeDto.RAM_IRA_TRADITIONAL_AGREEMENT;
                case 67:
                    return AgreementTypeDto.RAM_SLIP_AGREEMENT_ONBOARDING;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return AgreementTypeDto.RHY_PREPAID_DEBIT_AGREEMENT;
                case 69:
                    return AgreementTypeDto.RHY_SPENDING_AGREEMENT;
                case 70:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_GRIDIRON;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return AgreementTypeDto.RAM_SLIP_NATIVE_ONBOARDING;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_THIRD_MONTH_CHAOS;
                case 73:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_ECONOMIC_INDICATOR;
                case 74:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_PRO_BASKETBALL;
                case 75:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_PRO_HOCKEY;
                case 76:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_MARGIN_AGREEMENT_ONBOARDING;
                case 77:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_SLIP_AGREEMENT_ONBOARDING;
                case 78:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_SWEEP_AGREEMENT_ONBOARDING;
                case 79:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITH_MARGIN;
                case 80:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_BROKERAGE_AGREEMENT_WITHOUT_MARGIN;
                case 81:
                    return AgreementTypeDto.COMMON_REPORTING_STANDARD_SELF_CERTIFICATION;
                case 82:
                    return AgreementTypeDto.SAGE_AGREEMENT;
                case 83:
                    return AgreementTypeDto.AUTO_SEND_EQUITIES_MOBILE_AGREEMENT;
                case 84:
                    return AgreementTypeDto.CORTEX_DIGEST_AGREEMENT;
                case 85:
                    return AgreementTypeDto.RHY_ELECTRONIC_COMMUNICATIONS_CONSENT;
                case 86:
                    return AgreementTypeDto.RHY_TERMS_OF_USE;
                case 87:
                    return AgreementTypeDto.RHY_DEPOSIT_ACCOUNT_AGREEMENT;
                case 88:
                    return AgreementTypeDto.REICH_TANG_CUSTOMER_TERMS_AND_CONDITIONS;
                case 89:
                    return AgreementTypeDto.RHY_ACCOUNT_AGGREGATION_AGREEMENT;
                case 90:
                    return AgreementTypeDto.RHY_REMOTE_DEPOSIT_CAPTURE_AGREEMENT;
                case 91:
                    return AgreementTypeDto.RHY_CASH_DELIVERY_TERMS;
                case 92:
                    return AgreementTypeDto.RHY_DEBIT_CARD_AGREEMENT;
                case 93:
                    return AgreementTypeDto.AUTO_SEND_LEGEND_AGREEMENT;
                case 94:
                    return AgreementTypeDto.CRS_CARF_SELF_CERTIFICATION;
                case 95:
                    return AgreementTypeDto.ACCOUNT_SCOPE_DRIP_AGREEMENT;
                case 96:
                    return AgreementTypeDto.ACCOUNT_SCOPE_JA_DRIP_AGREEMENT;
                case 97:
                    return AgreementTypeDto.CUSTODIAL_UGMA_AGREEMENT;
                case 98:
                    return AgreementTypeDto.CUSTODIAL_UTMA_AGREEMENT;
                case 99:
                    return AgreementTypeDto.ECBSV_AGREEMENT;
                case 100:
                    return AgreementTypeDto.AUTO_SEND_CRYPTO_MOBILE_AGREEMENT;
                case 101:
                    return AgreementTypeDto.RHD_EVENT_CONTRACT_ATTESTATION_UNIVERSAL_AGREEMENT;
                case 102:
                    return AgreementTypeDto.CUSTODIAL_ACCOUNT_AGREEMENT;
                case 103:
                    return AgreementTypeDto.ADVISOR_MARKETPLACE_ENROLLMENT_AGREEMENT;
                case 104:
                    return AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_TERMS_AND_CONDITIONS;
                case 105:
                    return AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_DECLARATION;
                case 106:
                    return AgreementTypeDto.RHUK_STOCKS_AND_SHARES_ISA_PRODUCT_KEY_FEATURES;
                case 107:
                    return AgreementTypeDto.ACCOUNT_SCOPE_INDIVIDUAL_MULTI_SLIP_AGREEMENT_ONBOARDING;
                case 108:
                    return AgreementTypeDto.ROBINHOOD_SOCIAL_AGREEMENT;
                case 109:
                    return AgreementTypeDto.CUSTODIAL_MINOR_W9_AGREEMENT;
                case 110:
                    return AgreementTypeDto.MMF_AGREEMENT;
                case 111:
                    return AgreementTypeDto.RHUK_ISA_CASH_TRANSFER_DECLARATION;
                case 112:
                    return AgreementTypeDto.IRA_ROTH_CRYPTO_USER_AGREEMENT;
                case 113:
                    return AgreementTypeDto.IRA_TRADITIONAL_CRYPTO_USER_AGREEMENT;
                case 114:
                    return AgreementTypeDto.ACCOUNT_SCOPE_SLIP_AGREEMENT;
                case 115:
                    return AgreementTypeDto.ACCOUNT_SCOPE_SWEEP_AGREEMENT;
                case 116:
                    return AgreementTypeDto.ACCOUNT_SCOPE_BROKERAGE_AGREEMENT;
                case 117:
                    return AgreementTypeDto.CORTEX_LEGEND_AGREEMENT;
                case 118:
                    return AgreementTypeDto.ROBINHOOD_EMPLOYEE_SOCIAL_AGREEMENT;
                case 119:
                    return AgreementTypeDto.ACCOUNT_SCOPE_MULTI_SLIP_AGREEMENT;
                case 120:
                    return AgreementTypeDto.MINNESOTA_USER_CRYPTO_DISCLOSURES;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return AgreementTypeDto.INVESTMENT_TRACKER_CONNECT_ACCOUNT_AGREEMENT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AgreementTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/identi/agreements/AgreementTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/identi/agreements/AgreementTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.identi.agreements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AgreementTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AgreementTypeDto, AgreementType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.identi.agreements.AgreementType", AgreementTypeDto.getEntries(), AgreementTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AgreementTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AgreementTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AgreementTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AgreementTypeDto valueOf(String str) {
        return (AgreementTypeDto) Enum.valueOf(AgreementTypeDto.class, str);
    }

    public static AgreementTypeDto[] values() {
        return (AgreementTypeDto[]) $VALUES.clone();
    }
}
