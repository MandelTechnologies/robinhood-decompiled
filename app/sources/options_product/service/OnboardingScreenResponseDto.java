package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import options_product.service.ApprovedTradesResponseMetadataDto;
import options_product.service.DisclosureResponseMetadataDto;
import options_product.service.EducationL3StrategiesResponseMetadataDto;
import options_product.service.EducationSpreadResponseMetadataDto;
import options_product.service.EndResponseMetadataDto;
import options_product.service.ExperienceTestQuestionnaireResponseMetadataDto;
import options_product.service.FailureResponseMetadataDto;
import options_product.service.InvestmentProfileResponseMetadataDto;
import options_product.service.InvestorProfileV2ResponseMetadataDto;
import options_product.service.JAPendingApplicationResponseMetadataDto;
import options_product.service.KnowledgeCheckNeededResponseMetadataDto;
import options_product.service.KnowledgeTestQuestionnaireResponseMetadataDto;
import options_product.service.OnboardingProgressDto;
import options_product.service.OnboardingScreenResponse;
import options_product.service.OnboardingScreenResponseDto;
import options_product.service.ProfessionalTraderResponseMetadataDto;
import options_product.service.QuestionFinancialRegulatorResponseMetadataDto;
import options_product.service.QuestionInvestmentAdviceResponseMetadataDto;
import options_product.service.QuestionOptionExperienceResponseMetadataDto;
import options_product.service.QuestionUnderstandSpreadResponseMetadataDto;
import options_product.service.RHSGCompleteCARQuestionnaireResponseMetadataDto;
import options_product.service.RHSGHomeResponseMetadataDto;
import options_product.service.RHSGL2ApprovedTradesResponseMetadataDto;
import options_product.service.RHSGL3ApprovedTradesResponseMetadataDto;
import options_product.service.ReadyL3UpgradeResponseMetadataDto;
import options_product.service.ReviewInvestorProfileV2ResponseMetadataDto;
import options_product.service.SplashL0ResponseMetadataDto;
import options_product.service.SplashL2ResponseMetadataDto;
import options_product.service.SplashRetirementResponseMetadataDto;
import options_product.service.StartResponseMetadataDto;
import options_product.service.SuccessResponseMetadataDto;
import options_product.service.SuitabilityResponseMetadataDto;
import options_product.service.UKEducationHomeResponseMetadataDto;
import options_product.service.UKEducationProfessionalTraderResponseMetadataDto;
import options_product.service.UKEducationRisksResponseMetadataDto;
import options_product.service.UKEducationStrategyResponseMetadataDto;
import options_product.service.UKL3EducationHomeResponseMetadataDto;
import options_product.service.UKL3EducationSpreadBenefitsResponseMetadataDto;
import options_product.service.UpsellAlertResponseMetadataDto;
import options_product.service.UpsellAllSetResponseMetadataDto;
import options_product.service.UpsellTradeOnExpirationResponseMetadataDto;

/* compiled from: OnboardingScreenResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006102345B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010'R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/OnboardingScreenResponse;", "Landroid/os/Parcelable;", "Loptions_product/service/OnboardingScreenResponseDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/OnboardingScreenResponseDto$Surrogate;)V", "", "is_checkpoint", "should_live_in_backstack", "should_clear_backstack", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "upgrade_progress", "Loptions_product/service/OnboardingProgressDto;", "onboarding_progress", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "response_metadata", "(ZZZLoptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;Loptions_product/service/OnboardingProgressDto;Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;)V", "toProto", "()Loptions_product/service/OnboardingScreenResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/OnboardingScreenResponseDto$Surrogate;", "()Z", "getShould_live_in_backstack", "getShould_clear_backstack", "getUpgrade_progress", "()Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "getOnboarding_progress", "()Loptions_product/service/OnboardingProgressDto;", "getResponse_metadata", "()Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Companion", "Surrogate", "ResponseMetadataDto", "UpgradeProgressDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class OnboardingScreenResponseDto implements Dto3<OnboardingScreenResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OnboardingScreenResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OnboardingScreenResponseDto, OnboardingScreenResponse>> binaryBase64Serializer$delegate;
    private static final OnboardingScreenResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OnboardingScreenResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OnboardingScreenResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_checkpoint() {
        return this.surrogate.getIs_checkpoint();
    }

    public final boolean getShould_live_in_backstack() {
        return this.surrogate.getShould_live_in_backstack();
    }

    public final boolean getShould_clear_backstack() {
        return this.surrogate.getShould_clear_backstack();
    }

    public final UpgradeProgressDto getUpgrade_progress() {
        return this.surrogate.getUpgrade_progress();
    }

    public final OnboardingProgressDto getOnboarding_progress() {
        return this.surrogate.getOnboarding_progress();
    }

    public final ResponseMetadataDto getResponse_metadata() {
        if (this.surrogate.getStart() != null) {
            return new ResponseMetadataDto.Start(this.surrogate.getStart());
        }
        if (this.surrogate.getSplash_l0() != null) {
            return new ResponseMetadataDto.SplashL0(this.surrogate.getSplash_l0());
        }
        if (this.surrogate.getSplash_l2() != null) {
            return new ResponseMetadataDto.SplashL2(this.surrogate.getSplash_l2());
        }
        if (this.surrogate.getSplash_retirement() != null) {
            return new ResponseMetadataDto.SplashRetirement(this.surrogate.getSplash_retirement());
        }
        if (this.surrogate.getQuestion_option_experience() != null) {
            return new ResponseMetadataDto.QuestionOptionExperience(this.surrogate.getQuestion_option_experience());
        }
        if (this.surrogate.getQuestion_understand_spread() != null) {
            return new ResponseMetadataDto.QuestionUnderstandSpread(this.surrogate.getQuestion_understand_spread());
        }
        if (this.surrogate.getQuestion_investment_advice() != null) {
            return new ResponseMetadataDto.QuestionInvestmentAdvice(this.surrogate.getQuestion_investment_advice());
        }
        if (this.surrogate.getQuestion_financial_regulator() != null) {
            return new ResponseMetadataDto.QuestionFinancialRegulator(this.surrogate.getQuestion_financial_regulator());
        }
        if (this.surrogate.getSuitability() != null) {
            return new ResponseMetadataDto.Suitability(this.surrogate.getSuitability());
        }
        if (this.surrogate.getInvestment_profile() != null) {
            return new ResponseMetadataDto.InvestmentProfile(this.surrogate.getInvestment_profile());
        }
        if (this.surrogate.getDisclosure() != null) {
            return new ResponseMetadataDto.Disclosure(this.surrogate.getDisclosure());
        }
        if (this.surrogate.getApproved_trades() != null) {
            return new ResponseMetadataDto.ApprovedTrades(this.surrogate.getApproved_trades());
        }
        if (this.surrogate.getSuccess() != null) {
            return new ResponseMetadataDto.Success(this.surrogate.getSuccess());
        }
        if (this.surrogate.getFailure() != null) {
            return new ResponseMetadataDto.Failure(this.surrogate.getFailure());
        }
        if (this.surrogate.getEducation_spread() != null) {
            return new ResponseMetadataDto.EducationSpread(this.surrogate.getEducation_spread());
        }
        if (this.surrogate.getEducation_l3_strategies() != null) {
            return new ResponseMetadataDto.EducationL3Strategies(this.surrogate.getEducation_l3_strategies());
        }
        if (this.surrogate.getReady_l3_upgrade() != null) {
            return new ResponseMetadataDto.ReadyL3Upgrade(this.surrogate.getReady_l3_upgrade());
        }
        if (this.surrogate.getUpsell_alert() != null) {
            return new ResponseMetadataDto.UpsellAlert(this.surrogate.getUpsell_alert());
        }
        if (this.surrogate.getUpsell_trade_on_expiration() != null) {
            return new ResponseMetadataDto.UpsellTradeOnExpiration(this.surrogate.getUpsell_trade_on_expiration());
        }
        if (this.surrogate.getUpsell_all_set() != null) {
            return new ResponseMetadataDto.UpsellAllSet(this.surrogate.getUpsell_all_set());
        }
        if (this.surrogate.getEnd() != null) {
            return new ResponseMetadataDto.End(this.surrogate.getEnd());
        }
        if (this.surrogate.getKnowledge_test_questionnaire() != null) {
            return new ResponseMetadataDto.KnowledgeTestQuestionnaire(this.surrogate.getKnowledge_test_questionnaire());
        }
        if (this.surrogate.getExperience_test_questionnaire() != null) {
            return new ResponseMetadataDto.ExperienceTestQuestionnaire(this.surrogate.getExperience_test_questionnaire());
        }
        if (this.surrogate.getInvestor_profile() != null) {
            return new ResponseMetadataDto.InvestorProfile(this.surrogate.getInvestor_profile());
        }
        if (this.surrogate.getReview_investor_profile() != null) {
            return new ResponseMetadataDto.ReviewInvestorProfile(this.surrogate.getReview_investor_profile());
        }
        if (this.surrogate.getEducation_home() != null) {
            return new ResponseMetadataDto.EducationHome(this.surrogate.getEducation_home());
        }
        if (this.surrogate.getEducation_strategy() != null) {
            return new ResponseMetadataDto.EducationStrategy(this.surrogate.getEducation_strategy());
        }
        if (this.surrogate.getEducation_risks() != null) {
            return new ResponseMetadataDto.EducationRisks(this.surrogate.getEducation_risks());
        }
        if (this.surrogate.getEducation_professional_trader() != null) {
            return new ResponseMetadataDto.EducationProfessionalTrader(this.surrogate.getEducation_professional_trader());
        }
        if (this.surrogate.getUk_l3_education_home() != null) {
            return new ResponseMetadataDto.UkL3EducationHome(this.surrogate.getUk_l3_education_home());
        }
        if (this.surrogate.getUk_l3_education_spread_benefits() != null) {
            return new ResponseMetadataDto.UkL3EducationSpreadBenefits(this.surrogate.getUk_l3_education_spread_benefits());
        }
        if (this.surrogate.getRhsg_home() != null) {
            return new ResponseMetadataDto.RhsgHome(this.surrogate.getRhsg_home());
        }
        if (this.surrogate.getRhsg_complete_car_questionnaire() != null) {
            return new ResponseMetadataDto.RhsgCompleteCarQuestionnaire(this.surrogate.getRhsg_complete_car_questionnaire());
        }
        if (this.surrogate.getProfessional_trader() != null) {
            return new ResponseMetadataDto.ProfessionalTrader(this.surrogate.getProfessional_trader());
        }
        if (this.surrogate.getRhsg_l2_approved_trades() != null) {
            return new ResponseMetadataDto.RhsgL2ApprovedTrades(this.surrogate.getRhsg_l2_approved_trades());
        }
        if (this.surrogate.getRhsg_l3_approved_trades() != null) {
            return new ResponseMetadataDto.RhsgL3ApprovedTrades(this.surrogate.getRhsg_l3_approved_trades());
        }
        if (this.surrogate.getJa_pending_application() != null) {
            return new ResponseMetadataDto.JaPendingApplication(this.surrogate.getJa_pending_application());
        }
        if (this.surrogate.getKnowledge_check_needed() != null) {
            return new ResponseMetadataDto.KnowledgeCheckNeeded(this.surrogate.getKnowledge_check_needed());
        }
        return null;
    }

    public /* synthetic */ OnboardingScreenResponseDto(boolean z, boolean z2, boolean z3, UpgradeProgressDto upgradeProgressDto, OnboardingProgressDto onboardingProgressDto, ResponseMetadataDto responseMetadataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? UpgradeProgressDto.INSTANCE.getZeroValue() : upgradeProgressDto, (i & 16) != 0 ? null : onboardingProgressDto, (i & 32) != 0 ? null : responseMetadataDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnboardingScreenResponseDto(boolean z, boolean z2, boolean z3, UpgradeProgressDto upgrade_progress, OnboardingProgressDto onboardingProgressDto, ResponseMetadataDto responseMetadataDto) {
        Intrinsics.checkNotNullParameter(upgrade_progress, "upgrade_progress");
        ResponseMetadataDto.Start start = responseMetadataDto instanceof ResponseMetadataDto.Start ? (ResponseMetadataDto.Start) responseMetadataDto : null;
        StartResponseMetadataDto value = start != null ? start.getValue() : null;
        ResponseMetadataDto.SplashL0 splashL0 = responseMetadataDto instanceof ResponseMetadataDto.SplashL0 ? (ResponseMetadataDto.SplashL0) responseMetadataDto : null;
        SplashL0ResponseMetadataDto value2 = splashL0 != null ? splashL0.getValue() : null;
        ResponseMetadataDto.SplashL2 splashL2 = responseMetadataDto instanceof ResponseMetadataDto.SplashL2 ? (ResponseMetadataDto.SplashL2) responseMetadataDto : null;
        SplashL2ResponseMetadataDto value3 = splashL2 != null ? splashL2.getValue() : null;
        ResponseMetadataDto.SplashRetirement splashRetirement = responseMetadataDto instanceof ResponseMetadataDto.SplashRetirement ? (ResponseMetadataDto.SplashRetirement) responseMetadataDto : null;
        SplashRetirementResponseMetadataDto value4 = splashRetirement != null ? splashRetirement.getValue() : null;
        ResponseMetadataDto.QuestionOptionExperience questionOptionExperience = responseMetadataDto instanceof ResponseMetadataDto.QuestionOptionExperience ? (ResponseMetadataDto.QuestionOptionExperience) responseMetadataDto : null;
        QuestionOptionExperienceResponseMetadataDto value5 = questionOptionExperience != null ? questionOptionExperience.getValue() : null;
        ResponseMetadataDto.QuestionUnderstandSpread questionUnderstandSpread = responseMetadataDto instanceof ResponseMetadataDto.QuestionUnderstandSpread ? (ResponseMetadataDto.QuestionUnderstandSpread) responseMetadataDto : null;
        QuestionUnderstandSpreadResponseMetadataDto value6 = questionUnderstandSpread != null ? questionUnderstandSpread.getValue() : null;
        ResponseMetadataDto.QuestionInvestmentAdvice questionInvestmentAdvice = responseMetadataDto instanceof ResponseMetadataDto.QuestionInvestmentAdvice ? (ResponseMetadataDto.QuestionInvestmentAdvice) responseMetadataDto : null;
        QuestionInvestmentAdviceResponseMetadataDto value7 = questionInvestmentAdvice != null ? questionInvestmentAdvice.getValue() : null;
        ResponseMetadataDto.QuestionFinancialRegulator questionFinancialRegulator = responseMetadataDto instanceof ResponseMetadataDto.QuestionFinancialRegulator ? (ResponseMetadataDto.QuestionFinancialRegulator) responseMetadataDto : null;
        QuestionFinancialRegulatorResponseMetadataDto value8 = questionFinancialRegulator != null ? questionFinancialRegulator.getValue() : null;
        ResponseMetadataDto.Suitability suitability = responseMetadataDto instanceof ResponseMetadataDto.Suitability ? (ResponseMetadataDto.Suitability) responseMetadataDto : null;
        SuitabilityResponseMetadataDto value9 = suitability != null ? suitability.getValue() : null;
        ResponseMetadataDto.InvestmentProfile investmentProfile = responseMetadataDto instanceof ResponseMetadataDto.InvestmentProfile ? (ResponseMetadataDto.InvestmentProfile) responseMetadataDto : null;
        InvestmentProfileResponseMetadataDto value10 = investmentProfile != null ? investmentProfile.getValue() : null;
        ResponseMetadataDto.Disclosure disclosure = responseMetadataDto instanceof ResponseMetadataDto.Disclosure ? (ResponseMetadataDto.Disclosure) responseMetadataDto : null;
        DisclosureResponseMetadataDto value11 = disclosure != null ? disclosure.getValue() : null;
        ResponseMetadataDto.ApprovedTrades approvedTrades = responseMetadataDto instanceof ResponseMetadataDto.ApprovedTrades ? (ResponseMetadataDto.ApprovedTrades) responseMetadataDto : null;
        ApprovedTradesResponseMetadataDto value12 = approvedTrades != null ? approvedTrades.getValue() : null;
        ResponseMetadataDto.Success success = responseMetadataDto instanceof ResponseMetadataDto.Success ? (ResponseMetadataDto.Success) responseMetadataDto : null;
        SuccessResponseMetadataDto value13 = success != null ? success.getValue() : null;
        ResponseMetadataDto.Failure failure = responseMetadataDto instanceof ResponseMetadataDto.Failure ? (ResponseMetadataDto.Failure) responseMetadataDto : null;
        FailureResponseMetadataDto value14 = failure != null ? failure.getValue() : null;
        ResponseMetadataDto.EducationSpread educationSpread = responseMetadataDto instanceof ResponseMetadataDto.EducationSpread ? (ResponseMetadataDto.EducationSpread) responseMetadataDto : null;
        EducationSpreadResponseMetadataDto value15 = educationSpread != null ? educationSpread.getValue() : null;
        ResponseMetadataDto.EducationL3Strategies educationL3Strategies = responseMetadataDto instanceof ResponseMetadataDto.EducationL3Strategies ? (ResponseMetadataDto.EducationL3Strategies) responseMetadataDto : null;
        EducationL3StrategiesResponseMetadataDto value16 = educationL3Strategies != null ? educationL3Strategies.getValue() : null;
        ResponseMetadataDto.ReadyL3Upgrade readyL3Upgrade = responseMetadataDto instanceof ResponseMetadataDto.ReadyL3Upgrade ? (ResponseMetadataDto.ReadyL3Upgrade) responseMetadataDto : null;
        ReadyL3UpgradeResponseMetadataDto value17 = readyL3Upgrade != null ? readyL3Upgrade.getValue() : null;
        ResponseMetadataDto.UpsellAlert upsellAlert = responseMetadataDto instanceof ResponseMetadataDto.UpsellAlert ? (ResponseMetadataDto.UpsellAlert) responseMetadataDto : null;
        UpsellAlertResponseMetadataDto value18 = upsellAlert != null ? upsellAlert.getValue() : null;
        ResponseMetadataDto.UpsellTradeOnExpiration upsellTradeOnExpiration = responseMetadataDto instanceof ResponseMetadataDto.UpsellTradeOnExpiration ? (ResponseMetadataDto.UpsellTradeOnExpiration) responseMetadataDto : null;
        UpsellTradeOnExpirationResponseMetadataDto value19 = upsellTradeOnExpiration != null ? upsellTradeOnExpiration.getValue() : null;
        ResponseMetadataDto.UpsellAllSet upsellAllSet = responseMetadataDto instanceof ResponseMetadataDto.UpsellAllSet ? (ResponseMetadataDto.UpsellAllSet) responseMetadataDto : null;
        UpsellAllSetResponseMetadataDto value20 = upsellAllSet != null ? upsellAllSet.getValue() : null;
        ResponseMetadataDto.End end = responseMetadataDto instanceof ResponseMetadataDto.End ? (ResponseMetadataDto.End) responseMetadataDto : null;
        EndResponseMetadataDto value21 = end != null ? end.getValue() : null;
        ResponseMetadataDto.KnowledgeTestQuestionnaire knowledgeTestQuestionnaire = responseMetadataDto instanceof ResponseMetadataDto.KnowledgeTestQuestionnaire ? (ResponseMetadataDto.KnowledgeTestQuestionnaire) responseMetadataDto : null;
        KnowledgeTestQuestionnaireResponseMetadataDto value22 = knowledgeTestQuestionnaire != null ? knowledgeTestQuestionnaire.getValue() : null;
        ResponseMetadataDto.ExperienceTestQuestionnaire experienceTestQuestionnaire = responseMetadataDto instanceof ResponseMetadataDto.ExperienceTestQuestionnaire ? (ResponseMetadataDto.ExperienceTestQuestionnaire) responseMetadataDto : null;
        ExperienceTestQuestionnaireResponseMetadataDto value23 = experienceTestQuestionnaire != null ? experienceTestQuestionnaire.getValue() : null;
        ResponseMetadataDto.InvestorProfile investorProfile = responseMetadataDto instanceof ResponseMetadataDto.InvestorProfile ? (ResponseMetadataDto.InvestorProfile) responseMetadataDto : null;
        InvestorProfileV2ResponseMetadataDto value24 = investorProfile != null ? investorProfile.getValue() : null;
        ResponseMetadataDto.ReviewInvestorProfile reviewInvestorProfile = responseMetadataDto instanceof ResponseMetadataDto.ReviewInvestorProfile ? (ResponseMetadataDto.ReviewInvestorProfile) responseMetadataDto : null;
        ReviewInvestorProfileV2ResponseMetadataDto value25 = reviewInvestorProfile != null ? reviewInvestorProfile.getValue() : null;
        ResponseMetadataDto.EducationHome educationHome = responseMetadataDto instanceof ResponseMetadataDto.EducationHome ? (ResponseMetadataDto.EducationHome) responseMetadataDto : null;
        UKEducationHomeResponseMetadataDto value26 = educationHome != null ? educationHome.getValue() : null;
        ResponseMetadataDto.EducationStrategy educationStrategy = responseMetadataDto instanceof ResponseMetadataDto.EducationStrategy ? (ResponseMetadataDto.EducationStrategy) responseMetadataDto : null;
        UKEducationStrategyResponseMetadataDto value27 = educationStrategy != null ? educationStrategy.getValue() : null;
        ResponseMetadataDto.EducationRisks educationRisks = responseMetadataDto instanceof ResponseMetadataDto.EducationRisks ? (ResponseMetadataDto.EducationRisks) responseMetadataDto : null;
        UKEducationRisksResponseMetadataDto value28 = educationRisks != null ? educationRisks.getValue() : null;
        ResponseMetadataDto.EducationProfessionalTrader educationProfessionalTrader = responseMetadataDto instanceof ResponseMetadataDto.EducationProfessionalTrader ? (ResponseMetadataDto.EducationProfessionalTrader) responseMetadataDto : null;
        UKEducationProfessionalTraderResponseMetadataDto value29 = educationProfessionalTrader != null ? educationProfessionalTrader.getValue() : null;
        ResponseMetadataDto.UkL3EducationHome ukL3EducationHome = responseMetadataDto instanceof ResponseMetadataDto.UkL3EducationHome ? (ResponseMetadataDto.UkL3EducationHome) responseMetadataDto : null;
        UKL3EducationHomeResponseMetadataDto value30 = ukL3EducationHome != null ? ukL3EducationHome.getValue() : null;
        ResponseMetadataDto.UkL3EducationSpreadBenefits ukL3EducationSpreadBenefits = responseMetadataDto instanceof ResponseMetadataDto.UkL3EducationSpreadBenefits ? (ResponseMetadataDto.UkL3EducationSpreadBenefits) responseMetadataDto : null;
        UKL3EducationSpreadBenefitsResponseMetadataDto value31 = ukL3EducationSpreadBenefits != null ? ukL3EducationSpreadBenefits.getValue() : null;
        ResponseMetadataDto.RhsgHome rhsgHome = responseMetadataDto instanceof ResponseMetadataDto.RhsgHome ? (ResponseMetadataDto.RhsgHome) responseMetadataDto : null;
        RHSGHomeResponseMetadataDto value32 = rhsgHome != null ? rhsgHome.getValue() : null;
        ResponseMetadataDto.RhsgCompleteCarQuestionnaire rhsgCompleteCarQuestionnaire = responseMetadataDto instanceof ResponseMetadataDto.RhsgCompleteCarQuestionnaire ? (ResponseMetadataDto.RhsgCompleteCarQuestionnaire) responseMetadataDto : null;
        RHSGCompleteCARQuestionnaireResponseMetadataDto value33 = rhsgCompleteCarQuestionnaire != null ? rhsgCompleteCarQuestionnaire.getValue() : null;
        ResponseMetadataDto.ProfessionalTrader professionalTrader = responseMetadataDto instanceof ResponseMetadataDto.ProfessionalTrader ? (ResponseMetadataDto.ProfessionalTrader) responseMetadataDto : null;
        ProfessionalTraderResponseMetadataDto value34 = professionalTrader != null ? professionalTrader.getValue() : null;
        ResponseMetadataDto.RhsgL2ApprovedTrades rhsgL2ApprovedTrades = responseMetadataDto instanceof ResponseMetadataDto.RhsgL2ApprovedTrades ? (ResponseMetadataDto.RhsgL2ApprovedTrades) responseMetadataDto : null;
        RHSGL2ApprovedTradesResponseMetadataDto value35 = rhsgL2ApprovedTrades != null ? rhsgL2ApprovedTrades.getValue() : null;
        ResponseMetadataDto.RhsgL3ApprovedTrades rhsgL3ApprovedTrades = responseMetadataDto instanceof ResponseMetadataDto.RhsgL3ApprovedTrades ? (ResponseMetadataDto.RhsgL3ApprovedTrades) responseMetadataDto : null;
        RHSGL3ApprovedTradesResponseMetadataDto value36 = rhsgL3ApprovedTrades != null ? rhsgL3ApprovedTrades.getValue() : null;
        ResponseMetadataDto.JaPendingApplication jaPendingApplication = responseMetadataDto instanceof ResponseMetadataDto.JaPendingApplication ? (ResponseMetadataDto.JaPendingApplication) responseMetadataDto : null;
        JAPendingApplicationResponseMetadataDto value37 = jaPendingApplication != null ? jaPendingApplication.getValue() : null;
        ResponseMetadataDto.KnowledgeCheckNeeded knowledgeCheckNeeded = responseMetadataDto instanceof ResponseMetadataDto.KnowledgeCheckNeeded ? (ResponseMetadataDto.KnowledgeCheckNeeded) responseMetadataDto : null;
        this(new Surrogate(z, z2, z3, upgrade_progress, onboardingProgressDto, value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22, value23, value24, value25, value26, value27, value28, value29, value30, value31, value32, value33, value34, value35, value36, value37, knowledgeCheckNeeded != null ? knowledgeCheckNeeded.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OnboardingScreenResponse toProto() {
        boolean is_checkpoint = this.surrogate.getIs_checkpoint();
        boolean should_live_in_backstack = this.surrogate.getShould_live_in_backstack();
        boolean should_clear_backstack = this.surrogate.getShould_clear_backstack();
        OnboardingScreenResponse.UpgradeProgress upgradeProgress = (OnboardingScreenResponse.UpgradeProgress) this.surrogate.getUpgrade_progress().toProto();
        OnboardingProgressDto onboarding_progress = this.surrogate.getOnboarding_progress();
        OnboardingProgress proto = onboarding_progress != null ? onboarding_progress.toProto() : null;
        StartResponseMetadataDto start = this.surrogate.getStart();
        StartResponseMetadata proto2 = start != null ? start.toProto() : null;
        SplashL0ResponseMetadataDto splash_l0 = this.surrogate.getSplash_l0();
        SplashL0ResponseMetadata proto3 = splash_l0 != null ? splash_l0.toProto() : null;
        SplashL2ResponseMetadataDto splash_l2 = this.surrogate.getSplash_l2();
        SplashL2ResponseMetadata proto4 = splash_l2 != null ? splash_l2.toProto() : null;
        SplashRetirementResponseMetadataDto splash_retirement = this.surrogate.getSplash_retirement();
        SplashRetirementResponseMetadata proto5 = splash_retirement != null ? splash_retirement.toProto() : null;
        QuestionOptionExperienceResponseMetadataDto question_option_experience = this.surrogate.getQuestion_option_experience();
        QuestionOptionExperienceResponseMetadata proto6 = question_option_experience != null ? question_option_experience.toProto() : null;
        QuestionUnderstandSpreadResponseMetadataDto question_understand_spread = this.surrogate.getQuestion_understand_spread();
        QuestionUnderstandSpreadResponseMetadata proto7 = question_understand_spread != null ? question_understand_spread.toProto() : null;
        QuestionInvestmentAdviceResponseMetadataDto question_investment_advice = this.surrogate.getQuestion_investment_advice();
        QuestionInvestmentAdviceResponseMetadata proto8 = question_investment_advice != null ? question_investment_advice.toProto() : null;
        QuestionFinancialRegulatorResponseMetadataDto question_financial_regulator = this.surrogate.getQuestion_financial_regulator();
        QuestionFinancialRegulatorResponseMetadata proto9 = question_financial_regulator != null ? question_financial_regulator.toProto() : null;
        SuitabilityResponseMetadataDto suitability = this.surrogate.getSuitability();
        SuitabilityResponseMetadata proto10 = suitability != null ? suitability.toProto() : null;
        InvestmentProfileResponseMetadataDto investment_profile = this.surrogate.getInvestment_profile();
        InvestmentProfileResponseMetadata proto11 = investment_profile != null ? investment_profile.toProto() : null;
        DisclosureResponseMetadataDto disclosure = this.surrogate.getDisclosure();
        DisclosureResponseMetadata proto12 = disclosure != null ? disclosure.toProto() : null;
        ApprovedTradesResponseMetadataDto approved_trades = this.surrogate.getApproved_trades();
        ApprovedTradesResponseMetadata proto13 = approved_trades != null ? approved_trades.toProto() : null;
        SuccessResponseMetadataDto success = this.surrogate.getSuccess();
        SuccessResponseMetadata proto14 = success != null ? success.toProto() : null;
        FailureResponseMetadataDto failure = this.surrogate.getFailure();
        FailureResponseMetadata proto15 = failure != null ? failure.toProto() : null;
        EducationSpreadResponseMetadataDto education_spread = this.surrogate.getEducation_spread();
        EducationSpreadResponseMetadata proto16 = education_spread != null ? education_spread.toProto() : null;
        EducationL3StrategiesResponseMetadataDto education_l3_strategies = this.surrogate.getEducation_l3_strategies();
        EducationL3StrategiesResponseMetadata proto17 = education_l3_strategies != null ? education_l3_strategies.toProto() : null;
        ReadyL3UpgradeResponseMetadataDto ready_l3_upgrade = this.surrogate.getReady_l3_upgrade();
        ReadyL3UpgradeResponseMetadata proto18 = ready_l3_upgrade != null ? ready_l3_upgrade.toProto() : null;
        UpsellAlertResponseMetadataDto upsell_alert = this.surrogate.getUpsell_alert();
        UpsellAlertResponseMetadata proto19 = upsell_alert != null ? upsell_alert.toProto() : null;
        UpsellTradeOnExpirationResponseMetadataDto upsell_trade_on_expiration = this.surrogate.getUpsell_trade_on_expiration();
        UpsellTradeOnExpirationResponseMetadata proto20 = upsell_trade_on_expiration != null ? upsell_trade_on_expiration.toProto() : null;
        UpsellAllSetResponseMetadataDto upsell_all_set = this.surrogate.getUpsell_all_set();
        UpsellAllSetResponseMetadata proto21 = upsell_all_set != null ? upsell_all_set.toProto() : null;
        EndResponseMetadataDto end = this.surrogate.getEnd();
        EndResponseMetadata proto22 = end != null ? end.toProto() : null;
        KnowledgeTestQuestionnaireResponseMetadataDto knowledge_test_questionnaire = this.surrogate.getKnowledge_test_questionnaire();
        KnowledgeTestQuestionnaireResponseMetadata proto23 = knowledge_test_questionnaire != null ? knowledge_test_questionnaire.toProto() : null;
        ExperienceTestQuestionnaireResponseMetadataDto experience_test_questionnaire = this.surrogate.getExperience_test_questionnaire();
        ExperienceTestQuestionnaireResponseMetadata proto24 = experience_test_questionnaire != null ? experience_test_questionnaire.toProto() : null;
        InvestorProfileV2ResponseMetadataDto investor_profile = this.surrogate.getInvestor_profile();
        InvestorProfileV2ResponseMetadata proto25 = investor_profile != null ? investor_profile.toProto() : null;
        ReviewInvestorProfileV2ResponseMetadataDto review_investor_profile = this.surrogate.getReview_investor_profile();
        ReviewInvestorProfileV2ResponseMetadata proto26 = review_investor_profile != null ? review_investor_profile.toProto() : null;
        UKEducationHomeResponseMetadataDto education_home = this.surrogate.getEducation_home();
        UKEducationHomeResponseMetadata proto27 = education_home != null ? education_home.toProto() : null;
        UKEducationStrategyResponseMetadataDto education_strategy = this.surrogate.getEducation_strategy();
        UKEducationStrategyResponseMetadata proto28 = education_strategy != null ? education_strategy.toProto() : null;
        UKEducationRisksResponseMetadataDto education_risks = this.surrogate.getEducation_risks();
        UKEducationRisksResponseMetadata proto29 = education_risks != null ? education_risks.toProto() : null;
        UKEducationProfessionalTraderResponseMetadataDto education_professional_trader = this.surrogate.getEducation_professional_trader();
        UKEducationProfessionalTraderResponseMetadata proto30 = education_professional_trader != null ? education_professional_trader.toProto() : null;
        UKL3EducationHomeResponseMetadataDto uk_l3_education_home = this.surrogate.getUk_l3_education_home();
        UKL3EducationHomeResponseMetadata proto31 = uk_l3_education_home != null ? uk_l3_education_home.toProto() : null;
        UKL3EducationSpreadBenefitsResponseMetadataDto uk_l3_education_spread_benefits = this.surrogate.getUk_l3_education_spread_benefits();
        UKL3EducationSpreadBenefitsResponseMetadata proto32 = uk_l3_education_spread_benefits != null ? uk_l3_education_spread_benefits.toProto() : null;
        RHSGHomeResponseMetadataDto rhsg_home = this.surrogate.getRhsg_home();
        RHSGHomeResponseMetadata proto33 = rhsg_home != null ? rhsg_home.toProto() : null;
        RHSGCompleteCARQuestionnaireResponseMetadataDto rhsg_complete_car_questionnaire = this.surrogate.getRhsg_complete_car_questionnaire();
        RHSGCompleteCARQuestionnaireResponseMetadata proto34 = rhsg_complete_car_questionnaire != null ? rhsg_complete_car_questionnaire.toProto() : null;
        ProfessionalTraderResponseMetadataDto professional_trader = this.surrogate.getProfessional_trader();
        ProfessionalTraderResponseMetadata proto35 = professional_trader != null ? professional_trader.toProto() : null;
        RHSGL2ApprovedTradesResponseMetadataDto rhsg_l2_approved_trades = this.surrogate.getRhsg_l2_approved_trades();
        RHSGL2ApprovedTradesResponseMetadata proto36 = rhsg_l2_approved_trades != null ? rhsg_l2_approved_trades.toProto() : null;
        RHSGL3ApprovedTradesResponseMetadataDto rhsg_l3_approved_trades = this.surrogate.getRhsg_l3_approved_trades();
        RHSGL3ApprovedTradesResponseMetadata proto37 = rhsg_l3_approved_trades != null ? rhsg_l3_approved_trades.toProto() : null;
        JAPendingApplicationResponseMetadataDto ja_pending_application = this.surrogate.getJa_pending_application();
        JAPendingApplicationResponseMetadata proto38 = ja_pending_application != null ? ja_pending_application.toProto() : null;
        KnowledgeCheckNeededResponseMetadataDto knowledge_check_needed = this.surrogate.getKnowledge_check_needed();
        return new OnboardingScreenResponse(is_checkpoint, should_live_in_backstack, should_clear_backstack, upgradeProgress, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, proto28, proto29, proto30, proto31, proto32, proto33, proto34, proto35, proto36, proto37, proto38, knowledge_check_needed != null ? knowledge_check_needed.toProto() : null, proto, null, 0, 2048, null);
    }

    public String toString() {
        return "[OnboardingScreenResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OnboardingScreenResponseDto) && Intrinsics.areEqual(((OnboardingScreenResponseDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000¯\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0003\b²\u0001\b\u0083\b\u0018\u0000 \u0097\u00022\u00020\u0001:\u0004\u0098\u0002\u0097\u0002B\u0083\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WBË\u0003\b\u0010\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010Z\u001a\u00020X\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\b\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\u0010S\u001a\u0004\u0018\u00010R\u0012\b\u0010U\u001a\u0004\u0018\u00010T\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bV\u0010]J'\u0010f\u001a\u00020c2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010h\u001a\u00020gHÖ\u0001¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020XHÖ\u0001¢\u0006\u0004\bj\u0010kJ\u001a\u0010m\u001a\u00020\u00022\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bm\u0010nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010o\u0012\u0004\bq\u0010r\u001a\u0004\b\u0003\u0010pR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010o\u0012\u0004\bt\u0010r\u001a\u0004\bs\u0010pR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010o\u0012\u0004\bv\u0010r\u001a\u0004\bu\u0010pR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010w\u0012\u0004\bz\u0010r\u001a\u0004\bx\u0010yR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010{\u0012\u0004\b~\u0010r\u001a\u0004\b|\u0010}R%\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b\u000b\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010r\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010r\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000f\u0010\u0087\u0001\u0012\u0005\b\u008a\u0001\u0010r\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010\u008b\u0001\u0012\u0005\b\u008e\u0001\u0010r\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010\u008f\u0001\u0012\u0005\b\u0092\u0001\u0010r\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u0093\u0001\u0012\u0005\b\u0096\u0001\u0010r\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u0097\u0001\u0012\u0005\b\u009a\u0001\u0010r\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u009b\u0001\u0012\u0005\b\u009e\u0001\u0010r\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u009f\u0001\u0012\u0005\b¢\u0001\u0010r\u001a\u0006\b \u0001\u0010¡\u0001R&\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010£\u0001\u0012\u0005\b¦\u0001\u0010r\u001a\u0006\b¤\u0001\u0010¥\u0001R&\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010§\u0001\u0012\u0005\bª\u0001\u0010r\u001a\u0006\b¨\u0001\u0010©\u0001R&\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010«\u0001\u0012\u0005\b®\u0001\u0010r\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010¯\u0001\u0012\u0005\b²\u0001\u0010r\u001a\u0006\b°\u0001\u0010±\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010³\u0001\u0012\u0005\b¶\u0001\u0010r\u001a\u0006\b´\u0001\u0010µ\u0001R&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010·\u0001\u0012\u0005\bº\u0001\u0010r\u001a\u0006\b¸\u0001\u0010¹\u0001R&\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010»\u0001\u0012\u0005\b¾\u0001\u0010r\u001a\u0006\b¼\u0001\u0010½\u0001R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010¿\u0001\u0012\u0005\bÂ\u0001\u0010r\u001a\u0006\bÀ\u0001\u0010Á\u0001R&\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010Ã\u0001\u0012\u0005\bÆ\u0001\u0010r\u001a\u0006\bÄ\u0001\u0010Å\u0001R&\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010Ç\u0001\u0012\u0005\bÊ\u0001\u0010r\u001a\u0006\bÈ\u0001\u0010É\u0001R&\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010Ë\u0001\u0012\u0005\bÎ\u0001\u0010r\u001a\u0006\bÌ\u0001\u0010Í\u0001R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010Ï\u0001\u0012\u0005\bÒ\u0001\u0010r\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R&\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010Ó\u0001\u0012\u0005\bÖ\u0001\u0010r\u001a\u0006\bÔ\u0001\u0010Õ\u0001R&\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010×\u0001\u0012\u0005\bÚ\u0001\u0010r\u001a\u0006\bØ\u0001\u0010Ù\u0001R&\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b9\u0010Û\u0001\u0012\u0005\bÞ\u0001\u0010r\u001a\u0006\bÜ\u0001\u0010Ý\u0001R&\u0010;\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b;\u0010ß\u0001\u0012\u0005\bâ\u0001\u0010r\u001a\u0006\bà\u0001\u0010á\u0001R&\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b=\u0010ã\u0001\u0012\u0005\bæ\u0001\u0010r\u001a\u0006\bä\u0001\u0010å\u0001R&\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b?\u0010ç\u0001\u0012\u0005\bê\u0001\u0010r\u001a\u0006\bè\u0001\u0010é\u0001R&\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010ë\u0001\u0012\u0005\bî\u0001\u0010r\u001a\u0006\bì\u0001\u0010í\u0001R&\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bC\u0010ï\u0001\u0012\u0005\bò\u0001\u0010r\u001a\u0006\bð\u0001\u0010ñ\u0001R&\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010ó\u0001\u0012\u0005\bö\u0001\u0010r\u001a\u0006\bô\u0001\u0010õ\u0001R&\u0010G\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bG\u0010÷\u0001\u0012\u0005\bú\u0001\u0010r\u001a\u0006\bø\u0001\u0010ù\u0001R&\u0010I\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bI\u0010û\u0001\u0012\u0005\bþ\u0001\u0010r\u001a\u0006\bü\u0001\u0010ý\u0001R&\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bK\u0010ÿ\u0001\u0012\u0005\b\u0082\u0002\u0010r\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R&\u0010M\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010\u0083\u0002\u0012\u0005\b\u0086\u0002\u0010r\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R&\u0010O\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bO\u0010\u0087\u0002\u0012\u0005\b\u008a\u0002\u0010r\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R&\u0010Q\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bQ\u0010\u008b\u0002\u0012\u0005\b\u008e\u0002\u0010r\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R&\u0010S\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bS\u0010\u008f\u0002\u0012\u0005\b\u0092\u0002\u0010r\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R&\u0010U\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bU\u0010\u0093\u0002\u0012\u0005\b\u0096\u0002\u0010r\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002¨\u0006\u0099\u0002"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$Surrogate;", "", "", "is_checkpoint", "should_live_in_backstack", "should_clear_backstack", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "upgrade_progress", "Loptions_product/service/OnboardingProgressDto;", "onboarding_progress", "Loptions_product/service/StartResponseMetadataDto;", "start", "Loptions_product/service/SplashL0ResponseMetadataDto;", "splash_l0", "Loptions_product/service/SplashL2ResponseMetadataDto;", "splash_l2", "Loptions_product/service/SplashRetirementResponseMetadataDto;", "splash_retirement", "Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "question_option_experience", "Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "question_understand_spread", "Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "question_investment_advice", "Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "question_financial_regulator", "Loptions_product/service/SuitabilityResponseMetadataDto;", QuestionnaireContexts.SUITABILITY, "Loptions_product/service/InvestmentProfileResponseMetadataDto;", "investment_profile", "Loptions_product/service/DisclosureResponseMetadataDto;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "approved_trades", "Loptions_product/service/SuccessResponseMetadataDto;", "success", "Loptions_product/service/FailureResponseMetadataDto;", "failure", "Loptions_product/service/EducationSpreadResponseMetadataDto;", "education_spread", "Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "education_l3_strategies", "Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "ready_l3_upgrade", "Loptions_product/service/UpsellAlertResponseMetadataDto;", "upsell_alert", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "upsell_trade_on_expiration", "Loptions_product/service/UpsellAllSetResponseMetadataDto;", "upsell_all_set", "Loptions_product/service/EndResponseMetadataDto;", "end", "Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "knowledge_test_questionnaire", "Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "experience_test_questionnaire", "Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "investor_profile", "Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "review_investor_profile", "Loptions_product/service/UKEducationHomeResponseMetadataDto;", "education_home", "Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "education_strategy", "Loptions_product/service/UKEducationRisksResponseMetadataDto;", "education_risks", "Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "education_professional_trader", "Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "uk_l3_education_home", "Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "uk_l3_education_spread_benefits", "Loptions_product/service/RHSGHomeResponseMetadataDto;", "rhsg_home", "Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "rhsg_complete_car_questionnaire", "Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "professional_trader", "Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "rhsg_l2_approved_trades", "Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "rhsg_l3_approved_trades", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "ja_pending_application", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "knowledge_check_needed", "<init>", "(ZZZLoptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;Loptions_product/service/OnboardingProgressDto;Loptions_product/service/StartResponseMetadataDto;Loptions_product/service/SplashL0ResponseMetadataDto;Loptions_product/service/SplashL2ResponseMetadataDto;Loptions_product/service/SplashRetirementResponseMetadataDto;Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;Loptions_product/service/SuitabilityResponseMetadataDto;Loptions_product/service/InvestmentProfileResponseMetadataDto;Loptions_product/service/DisclosureResponseMetadataDto;Loptions_product/service/ApprovedTradesResponseMetadataDto;Loptions_product/service/SuccessResponseMetadataDto;Loptions_product/service/FailureResponseMetadataDto;Loptions_product/service/EducationSpreadResponseMetadataDto;Loptions_product/service/EducationL3StrategiesResponseMetadataDto;Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;Loptions_product/service/UpsellAlertResponseMetadataDto;Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;Loptions_product/service/UpsellAllSetResponseMetadataDto;Loptions_product/service/EndResponseMetadataDto;Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;Loptions_product/service/InvestorProfileV2ResponseMetadataDto;Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;Loptions_product/service/UKEducationHomeResponseMetadataDto;Loptions_product/service/UKEducationStrategyResponseMetadataDto;Loptions_product/service/UKEducationRisksResponseMetadataDto;Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;Loptions_product/service/UKL3EducationHomeResponseMetadataDto;Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;Loptions_product/service/RHSGHomeResponseMetadataDto;Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;Loptions_product/service/ProfessionalTraderResponseMetadataDto;Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;Loptions_product/service/JAPendingApplicationResponseMetadataDto;Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZZZLoptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;Loptions_product/service/OnboardingProgressDto;Loptions_product/service/StartResponseMetadataDto;Loptions_product/service/SplashL0ResponseMetadataDto;Loptions_product/service/SplashL2ResponseMetadataDto;Loptions_product/service/SplashRetirementResponseMetadataDto;Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;Loptions_product/service/SuitabilityResponseMetadataDto;Loptions_product/service/InvestmentProfileResponseMetadataDto;Loptions_product/service/DisclosureResponseMetadataDto;Loptions_product/service/ApprovedTradesResponseMetadataDto;Loptions_product/service/SuccessResponseMetadataDto;Loptions_product/service/FailureResponseMetadataDto;Loptions_product/service/EducationSpreadResponseMetadataDto;Loptions_product/service/EducationL3StrategiesResponseMetadataDto;Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;Loptions_product/service/UpsellAlertResponseMetadataDto;Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;Loptions_product/service/UpsellAllSetResponseMetadataDto;Loptions_product/service/EndResponseMetadataDto;Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;Loptions_product/service/InvestorProfileV2ResponseMetadataDto;Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;Loptions_product/service/UKEducationHomeResponseMetadataDto;Loptions_product/service/UKEducationStrategyResponseMetadataDto;Loptions_product/service/UKEducationRisksResponseMetadataDto;Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;Loptions_product/service/UKL3EducationHomeResponseMetadataDto;Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;Loptions_product/service/RHSGHomeResponseMetadataDto;Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;Loptions_product/service/ProfessionalTraderResponseMetadataDto;Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;Loptions_product/service/JAPendingApplicationResponseMetadataDto;Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/OnboardingScreenResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_checkpoint$annotations", "()V", "getShould_live_in_backstack", "getShould_live_in_backstack$annotations", "getShould_clear_backstack", "getShould_clear_backstack$annotations", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "getUpgrade_progress", "()Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "getUpgrade_progress$annotations", "Loptions_product/service/OnboardingProgressDto;", "getOnboarding_progress", "()Loptions_product/service/OnboardingProgressDto;", "getOnboarding_progress$annotations", "Loptions_product/service/StartResponseMetadataDto;", "getStart", "()Loptions_product/service/StartResponseMetadataDto;", "getStart$annotations", "Loptions_product/service/SplashL0ResponseMetadataDto;", "getSplash_l0", "()Loptions_product/service/SplashL0ResponseMetadataDto;", "getSplash_l0$annotations", "Loptions_product/service/SplashL2ResponseMetadataDto;", "getSplash_l2", "()Loptions_product/service/SplashL2ResponseMetadataDto;", "getSplash_l2$annotations", "Loptions_product/service/SplashRetirementResponseMetadataDto;", "getSplash_retirement", "()Loptions_product/service/SplashRetirementResponseMetadataDto;", "getSplash_retirement$annotations", "Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "getQuestion_option_experience", "()Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "getQuestion_option_experience$annotations", "Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "getQuestion_understand_spread", "()Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "getQuestion_understand_spread$annotations", "Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "getQuestion_investment_advice", "()Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "getQuestion_investment_advice$annotations", "Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "getQuestion_financial_regulator", "()Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "getQuestion_financial_regulator$annotations", "Loptions_product/service/SuitabilityResponseMetadataDto;", "getSuitability", "()Loptions_product/service/SuitabilityResponseMetadataDto;", "getSuitability$annotations", "Loptions_product/service/InvestmentProfileResponseMetadataDto;", "getInvestment_profile", "()Loptions_product/service/InvestmentProfileResponseMetadataDto;", "getInvestment_profile$annotations", "Loptions_product/service/DisclosureResponseMetadataDto;", "getDisclosure", "()Loptions_product/service/DisclosureResponseMetadataDto;", "getDisclosure$annotations", "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "getApproved_trades", "()Loptions_product/service/ApprovedTradesResponseMetadataDto;", "getApproved_trades$annotations", "Loptions_product/service/SuccessResponseMetadataDto;", "getSuccess", "()Loptions_product/service/SuccessResponseMetadataDto;", "getSuccess$annotations", "Loptions_product/service/FailureResponseMetadataDto;", "getFailure", "()Loptions_product/service/FailureResponseMetadataDto;", "getFailure$annotations", "Loptions_product/service/EducationSpreadResponseMetadataDto;", "getEducation_spread", "()Loptions_product/service/EducationSpreadResponseMetadataDto;", "getEducation_spread$annotations", "Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "getEducation_l3_strategies", "()Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "getEducation_l3_strategies$annotations", "Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "getReady_l3_upgrade", "()Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "getReady_l3_upgrade$annotations", "Loptions_product/service/UpsellAlertResponseMetadataDto;", "getUpsell_alert", "()Loptions_product/service/UpsellAlertResponseMetadataDto;", "getUpsell_alert$annotations", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "getUpsell_trade_on_expiration", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "getUpsell_trade_on_expiration$annotations", "Loptions_product/service/UpsellAllSetResponseMetadataDto;", "getUpsell_all_set", "()Loptions_product/service/UpsellAllSetResponseMetadataDto;", "getUpsell_all_set$annotations", "Loptions_product/service/EndResponseMetadataDto;", "getEnd", "()Loptions_product/service/EndResponseMetadataDto;", "getEnd$annotations", "Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "getKnowledge_test_questionnaire", "()Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "getKnowledge_test_questionnaire$annotations", "Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "getExperience_test_questionnaire", "()Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "getExperience_test_questionnaire$annotations", "Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "getInvestor_profile", "()Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "getInvestor_profile$annotations", "Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "getReview_investor_profile", "()Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "getReview_investor_profile$annotations", "Loptions_product/service/UKEducationHomeResponseMetadataDto;", "getEducation_home", "()Loptions_product/service/UKEducationHomeResponseMetadataDto;", "getEducation_home$annotations", "Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "getEducation_strategy", "()Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "getEducation_strategy$annotations", "Loptions_product/service/UKEducationRisksResponseMetadataDto;", "getEducation_risks", "()Loptions_product/service/UKEducationRisksResponseMetadataDto;", "getEducation_risks$annotations", "Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "getEducation_professional_trader", "()Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "getEducation_professional_trader$annotations", "Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "getUk_l3_education_home", "()Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "getUk_l3_education_home$annotations", "Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "getUk_l3_education_spread_benefits", "()Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "getUk_l3_education_spread_benefits$annotations", "Loptions_product/service/RHSGHomeResponseMetadataDto;", "getRhsg_home", "()Loptions_product/service/RHSGHomeResponseMetadataDto;", "getRhsg_home$annotations", "Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "getRhsg_complete_car_questionnaire", "()Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "getRhsg_complete_car_questionnaire$annotations", "Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "getProfessional_trader", "()Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "getProfessional_trader$annotations", "Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "getRhsg_l2_approved_trades", "()Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "getRhsg_l2_approved_trades$annotations", "Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "getRhsg_l3_approved_trades", "()Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "getRhsg_l3_approved_trades$annotations", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "getJa_pending_application", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "getJa_pending_application$annotations", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "getKnowledge_check_needed", "()Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "getKnowledge_check_needed$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApprovedTradesResponseMetadataDto approved_trades;
        private final DisclosureResponseMetadataDto disclosure;
        private final UKEducationHomeResponseMetadataDto education_home;
        private final EducationL3StrategiesResponseMetadataDto education_l3_strategies;
        private final UKEducationProfessionalTraderResponseMetadataDto education_professional_trader;
        private final UKEducationRisksResponseMetadataDto education_risks;
        private final EducationSpreadResponseMetadataDto education_spread;
        private final UKEducationStrategyResponseMetadataDto education_strategy;
        private final EndResponseMetadataDto end;
        private final ExperienceTestQuestionnaireResponseMetadataDto experience_test_questionnaire;
        private final FailureResponseMetadataDto failure;
        private final InvestmentProfileResponseMetadataDto investment_profile;
        private final InvestorProfileV2ResponseMetadataDto investor_profile;
        private final boolean is_checkpoint;
        private final JAPendingApplicationResponseMetadataDto ja_pending_application;
        private final KnowledgeCheckNeededResponseMetadataDto knowledge_check_needed;
        private final KnowledgeTestQuestionnaireResponseMetadataDto knowledge_test_questionnaire;
        private final OnboardingProgressDto onboarding_progress;
        private final ProfessionalTraderResponseMetadataDto professional_trader;
        private final QuestionFinancialRegulatorResponseMetadataDto question_financial_regulator;
        private final QuestionInvestmentAdviceResponseMetadataDto question_investment_advice;
        private final QuestionOptionExperienceResponseMetadataDto question_option_experience;
        private final QuestionUnderstandSpreadResponseMetadataDto question_understand_spread;
        private final ReadyL3UpgradeResponseMetadataDto ready_l3_upgrade;
        private final ReviewInvestorProfileV2ResponseMetadataDto review_investor_profile;
        private final RHSGCompleteCARQuestionnaireResponseMetadataDto rhsg_complete_car_questionnaire;
        private final RHSGHomeResponseMetadataDto rhsg_home;
        private final RHSGL2ApprovedTradesResponseMetadataDto rhsg_l2_approved_trades;
        private final RHSGL3ApprovedTradesResponseMetadataDto rhsg_l3_approved_trades;
        private final boolean should_clear_backstack;
        private final boolean should_live_in_backstack;
        private final SplashL0ResponseMetadataDto splash_l0;
        private final SplashL2ResponseMetadataDto splash_l2;
        private final SplashRetirementResponseMetadataDto splash_retirement;
        private final StartResponseMetadataDto start;
        private final SuccessResponseMetadataDto success;
        private final SuitabilityResponseMetadataDto suitability;
        private final UKL3EducationHomeResponseMetadataDto uk_l3_education_home;
        private final UKL3EducationSpreadBenefitsResponseMetadataDto uk_l3_education_spread_benefits;
        private final UpgradeProgressDto upgrade_progress;
        private final UpsellAlertResponseMetadataDto upsell_alert;
        private final UpsellAllSetResponseMetadataDto upsell_all_set;
        private final UpsellTradeOnExpirationResponseMetadataDto upsell_trade_on_expiration;

        public Surrogate() {
            this(false, false, false, (UpgradeProgressDto) null, (OnboardingProgressDto) null, (StartResponseMetadataDto) null, (SplashL0ResponseMetadataDto) null, (SplashL2ResponseMetadataDto) null, (SplashRetirementResponseMetadataDto) null, (QuestionOptionExperienceResponseMetadataDto) null, (QuestionUnderstandSpreadResponseMetadataDto) null, (QuestionInvestmentAdviceResponseMetadataDto) null, (QuestionFinancialRegulatorResponseMetadataDto) null, (SuitabilityResponseMetadataDto) null, (InvestmentProfileResponseMetadataDto) null, (DisclosureResponseMetadataDto) null, (ApprovedTradesResponseMetadataDto) null, (SuccessResponseMetadataDto) null, (FailureResponseMetadataDto) null, (EducationSpreadResponseMetadataDto) null, (EducationL3StrategiesResponseMetadataDto) null, (ReadyL3UpgradeResponseMetadataDto) null, (UpsellAlertResponseMetadataDto) null, (UpsellTradeOnExpirationResponseMetadataDto) null, (UpsellAllSetResponseMetadataDto) null, (EndResponseMetadataDto) null, (KnowledgeTestQuestionnaireResponseMetadataDto) null, (ExperienceTestQuestionnaireResponseMetadataDto) null, (InvestorProfileV2ResponseMetadataDto) null, (ReviewInvestorProfileV2ResponseMetadataDto) null, (UKEducationHomeResponseMetadataDto) null, (UKEducationStrategyResponseMetadataDto) null, (UKEducationRisksResponseMetadataDto) null, (UKEducationProfessionalTraderResponseMetadataDto) null, (UKL3EducationHomeResponseMetadataDto) null, (UKL3EducationSpreadBenefitsResponseMetadataDto) null, (RHSGHomeResponseMetadataDto) null, (RHSGCompleteCARQuestionnaireResponseMetadataDto) null, (ProfessionalTraderResponseMetadataDto) null, (RHSGL2ApprovedTradesResponseMetadataDto) null, (RHSGL3ApprovedTradesResponseMetadataDto) null, (JAPendingApplicationResponseMetadataDto) null, (KnowledgeCheckNeededResponseMetadataDto) null, -1, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_checkpoint == surrogate.is_checkpoint && this.should_live_in_backstack == surrogate.should_live_in_backstack && this.should_clear_backstack == surrogate.should_clear_backstack && this.upgrade_progress == surrogate.upgrade_progress && Intrinsics.areEqual(this.onboarding_progress, surrogate.onboarding_progress) && Intrinsics.areEqual(this.start, surrogate.start) && Intrinsics.areEqual(this.splash_l0, surrogate.splash_l0) && Intrinsics.areEqual(this.splash_l2, surrogate.splash_l2) && Intrinsics.areEqual(this.splash_retirement, surrogate.splash_retirement) && Intrinsics.areEqual(this.question_option_experience, surrogate.question_option_experience) && Intrinsics.areEqual(this.question_understand_spread, surrogate.question_understand_spread) && Intrinsics.areEqual(this.question_investment_advice, surrogate.question_investment_advice) && Intrinsics.areEqual(this.question_financial_regulator, surrogate.question_financial_regulator) && Intrinsics.areEqual(this.suitability, surrogate.suitability) && Intrinsics.areEqual(this.investment_profile, surrogate.investment_profile) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && Intrinsics.areEqual(this.approved_trades, surrogate.approved_trades) && Intrinsics.areEqual(this.success, surrogate.success) && Intrinsics.areEqual(this.failure, surrogate.failure) && Intrinsics.areEqual(this.education_spread, surrogate.education_spread) && Intrinsics.areEqual(this.education_l3_strategies, surrogate.education_l3_strategies) && Intrinsics.areEqual(this.ready_l3_upgrade, surrogate.ready_l3_upgrade) && Intrinsics.areEqual(this.upsell_alert, surrogate.upsell_alert) && Intrinsics.areEqual(this.upsell_trade_on_expiration, surrogate.upsell_trade_on_expiration) && Intrinsics.areEqual(this.upsell_all_set, surrogate.upsell_all_set) && Intrinsics.areEqual(this.end, surrogate.end) && Intrinsics.areEqual(this.knowledge_test_questionnaire, surrogate.knowledge_test_questionnaire) && Intrinsics.areEqual(this.experience_test_questionnaire, surrogate.experience_test_questionnaire) && Intrinsics.areEqual(this.investor_profile, surrogate.investor_profile) && Intrinsics.areEqual(this.review_investor_profile, surrogate.review_investor_profile) && Intrinsics.areEqual(this.education_home, surrogate.education_home) && Intrinsics.areEqual(this.education_strategy, surrogate.education_strategy) && Intrinsics.areEqual(this.education_risks, surrogate.education_risks) && Intrinsics.areEqual(this.education_professional_trader, surrogate.education_professional_trader) && Intrinsics.areEqual(this.uk_l3_education_home, surrogate.uk_l3_education_home) && Intrinsics.areEqual(this.uk_l3_education_spread_benefits, surrogate.uk_l3_education_spread_benefits) && Intrinsics.areEqual(this.rhsg_home, surrogate.rhsg_home) && Intrinsics.areEqual(this.rhsg_complete_car_questionnaire, surrogate.rhsg_complete_car_questionnaire) && Intrinsics.areEqual(this.professional_trader, surrogate.professional_trader) && Intrinsics.areEqual(this.rhsg_l2_approved_trades, surrogate.rhsg_l2_approved_trades) && Intrinsics.areEqual(this.rhsg_l3_approved_trades, surrogate.rhsg_l3_approved_trades) && Intrinsics.areEqual(this.ja_pending_application, surrogate.ja_pending_application) && Intrinsics.areEqual(this.knowledge_check_needed, surrogate.knowledge_check_needed);
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.is_checkpoint) * 31) + Boolean.hashCode(this.should_live_in_backstack)) * 31) + Boolean.hashCode(this.should_clear_backstack)) * 31) + this.upgrade_progress.hashCode()) * 31;
            OnboardingProgressDto onboardingProgressDto = this.onboarding_progress;
            int iHashCode2 = (iHashCode + (onboardingProgressDto == null ? 0 : onboardingProgressDto.hashCode())) * 31;
            StartResponseMetadataDto startResponseMetadataDto = this.start;
            int iHashCode3 = (iHashCode2 + (startResponseMetadataDto == null ? 0 : startResponseMetadataDto.hashCode())) * 31;
            SplashL0ResponseMetadataDto splashL0ResponseMetadataDto = this.splash_l0;
            int iHashCode4 = (iHashCode3 + (splashL0ResponseMetadataDto == null ? 0 : splashL0ResponseMetadataDto.hashCode())) * 31;
            SplashL2ResponseMetadataDto splashL2ResponseMetadataDto = this.splash_l2;
            int iHashCode5 = (iHashCode4 + (splashL2ResponseMetadataDto == null ? 0 : splashL2ResponseMetadataDto.hashCode())) * 31;
            SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDto = this.splash_retirement;
            int iHashCode6 = (iHashCode5 + (splashRetirementResponseMetadataDto == null ? 0 : splashRetirementResponseMetadataDto.hashCode())) * 31;
            QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDto = this.question_option_experience;
            int iHashCode7 = (iHashCode6 + (questionOptionExperienceResponseMetadataDto == null ? 0 : questionOptionExperienceResponseMetadataDto.hashCode())) * 31;
            QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDto = this.question_understand_spread;
            int iHashCode8 = (iHashCode7 + (questionUnderstandSpreadResponseMetadataDto == null ? 0 : questionUnderstandSpreadResponseMetadataDto.hashCode())) * 31;
            QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDto = this.question_investment_advice;
            int iHashCode9 = (iHashCode8 + (questionInvestmentAdviceResponseMetadataDto == null ? 0 : questionInvestmentAdviceResponseMetadataDto.hashCode())) * 31;
            QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDto = this.question_financial_regulator;
            int iHashCode10 = (iHashCode9 + (questionFinancialRegulatorResponseMetadataDto == null ? 0 : questionFinancialRegulatorResponseMetadataDto.hashCode())) * 31;
            SuitabilityResponseMetadataDto suitabilityResponseMetadataDto = this.suitability;
            int iHashCode11 = (iHashCode10 + (suitabilityResponseMetadataDto == null ? 0 : suitabilityResponseMetadataDto.hashCode())) * 31;
            InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto = this.investment_profile;
            int iHashCode12 = (iHashCode11 + (investmentProfileResponseMetadataDto == null ? 0 : investmentProfileResponseMetadataDto.hashCode())) * 31;
            DisclosureResponseMetadataDto disclosureResponseMetadataDto = this.disclosure;
            int iHashCode13 = (iHashCode12 + (disclosureResponseMetadataDto == null ? 0 : disclosureResponseMetadataDto.hashCode())) * 31;
            ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto = this.approved_trades;
            int iHashCode14 = (iHashCode13 + (approvedTradesResponseMetadataDto == null ? 0 : approvedTradesResponseMetadataDto.hashCode())) * 31;
            SuccessResponseMetadataDto successResponseMetadataDto = this.success;
            int iHashCode15 = (iHashCode14 + (successResponseMetadataDto == null ? 0 : successResponseMetadataDto.hashCode())) * 31;
            FailureResponseMetadataDto failureResponseMetadataDto = this.failure;
            int iHashCode16 = (iHashCode15 + (failureResponseMetadataDto == null ? 0 : failureResponseMetadataDto.hashCode())) * 31;
            EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto = this.education_spread;
            int iHashCode17 = (iHashCode16 + (educationSpreadResponseMetadataDto == null ? 0 : educationSpreadResponseMetadataDto.hashCode())) * 31;
            EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto = this.education_l3_strategies;
            int iHashCode18 = (iHashCode17 + (educationL3StrategiesResponseMetadataDto == null ? 0 : educationL3StrategiesResponseMetadataDto.hashCode())) * 31;
            ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto = this.ready_l3_upgrade;
            int iHashCode19 = (iHashCode18 + (readyL3UpgradeResponseMetadataDto == null ? 0 : readyL3UpgradeResponseMetadataDto.hashCode())) * 31;
            UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto = this.upsell_alert;
            int iHashCode20 = (iHashCode19 + (upsellAlertResponseMetadataDto == null ? 0 : upsellAlertResponseMetadataDto.hashCode())) * 31;
            UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto = this.upsell_trade_on_expiration;
            int iHashCode21 = (iHashCode20 + (upsellTradeOnExpirationResponseMetadataDto == null ? 0 : upsellTradeOnExpirationResponseMetadataDto.hashCode())) * 31;
            UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto = this.upsell_all_set;
            int iHashCode22 = (iHashCode21 + (upsellAllSetResponseMetadataDto == null ? 0 : upsellAllSetResponseMetadataDto.hashCode())) * 31;
            EndResponseMetadataDto endResponseMetadataDto = this.end;
            int iHashCode23 = (iHashCode22 + (endResponseMetadataDto == null ? 0 : endResponseMetadataDto.hashCode())) * 31;
            KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto = this.knowledge_test_questionnaire;
            int iHashCode24 = (iHashCode23 + (knowledgeTestQuestionnaireResponseMetadataDto == null ? 0 : knowledgeTestQuestionnaireResponseMetadataDto.hashCode())) * 31;
            ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto = this.experience_test_questionnaire;
            int iHashCode25 = (iHashCode24 + (experienceTestQuestionnaireResponseMetadataDto == null ? 0 : experienceTestQuestionnaireResponseMetadataDto.hashCode())) * 31;
            InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto = this.investor_profile;
            int iHashCode26 = (iHashCode25 + (investorProfileV2ResponseMetadataDto == null ? 0 : investorProfileV2ResponseMetadataDto.hashCode())) * 31;
            ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto = this.review_investor_profile;
            int iHashCode27 = (iHashCode26 + (reviewInvestorProfileV2ResponseMetadataDto == null ? 0 : reviewInvestorProfileV2ResponseMetadataDto.hashCode())) * 31;
            UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto = this.education_home;
            int iHashCode28 = (iHashCode27 + (uKEducationHomeResponseMetadataDto == null ? 0 : uKEducationHomeResponseMetadataDto.hashCode())) * 31;
            UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto = this.education_strategy;
            int iHashCode29 = (iHashCode28 + (uKEducationStrategyResponseMetadataDto == null ? 0 : uKEducationStrategyResponseMetadataDto.hashCode())) * 31;
            UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto = this.education_risks;
            int iHashCode30 = (iHashCode29 + (uKEducationRisksResponseMetadataDto == null ? 0 : uKEducationRisksResponseMetadataDto.hashCode())) * 31;
            UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto = this.education_professional_trader;
            int iHashCode31 = (iHashCode30 + (uKEducationProfessionalTraderResponseMetadataDto == null ? 0 : uKEducationProfessionalTraderResponseMetadataDto.hashCode())) * 31;
            UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto = this.uk_l3_education_home;
            int iHashCode32 = (iHashCode31 + (uKL3EducationHomeResponseMetadataDto == null ? 0 : uKL3EducationHomeResponseMetadataDto.hashCode())) * 31;
            UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto = this.uk_l3_education_spread_benefits;
            int iHashCode33 = (iHashCode32 + (uKL3EducationSpreadBenefitsResponseMetadataDto == null ? 0 : uKL3EducationSpreadBenefitsResponseMetadataDto.hashCode())) * 31;
            RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto = this.rhsg_home;
            int iHashCode34 = (iHashCode33 + (rHSGHomeResponseMetadataDto == null ? 0 : rHSGHomeResponseMetadataDto.hashCode())) * 31;
            RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto = this.rhsg_complete_car_questionnaire;
            int iHashCode35 = (iHashCode34 + (rHSGCompleteCARQuestionnaireResponseMetadataDto == null ? 0 : rHSGCompleteCARQuestionnaireResponseMetadataDto.hashCode())) * 31;
            ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto = this.professional_trader;
            int iHashCode36 = (iHashCode35 + (professionalTraderResponseMetadataDto == null ? 0 : professionalTraderResponseMetadataDto.hashCode())) * 31;
            RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto = this.rhsg_l2_approved_trades;
            int iHashCode37 = (iHashCode36 + (rHSGL2ApprovedTradesResponseMetadataDto == null ? 0 : rHSGL2ApprovedTradesResponseMetadataDto.hashCode())) * 31;
            RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto = this.rhsg_l3_approved_trades;
            int iHashCode38 = (iHashCode37 + (rHSGL3ApprovedTradesResponseMetadataDto == null ? 0 : rHSGL3ApprovedTradesResponseMetadataDto.hashCode())) * 31;
            JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDto = this.ja_pending_application;
            int iHashCode39 = (iHashCode38 + (jAPendingApplicationResponseMetadataDto == null ? 0 : jAPendingApplicationResponseMetadataDto.hashCode())) * 31;
            KnowledgeCheckNeededResponseMetadataDto knowledgeCheckNeededResponseMetadataDto = this.knowledge_check_needed;
            return iHashCode39 + (knowledgeCheckNeededResponseMetadataDto != null ? knowledgeCheckNeededResponseMetadataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(is_checkpoint=" + this.is_checkpoint + ", should_live_in_backstack=" + this.should_live_in_backstack + ", should_clear_backstack=" + this.should_clear_backstack + ", upgrade_progress=" + this.upgrade_progress + ", onboarding_progress=" + this.onboarding_progress + ", start=" + this.start + ", splash_l0=" + this.splash_l0 + ", splash_l2=" + this.splash_l2 + ", splash_retirement=" + this.splash_retirement + ", question_option_experience=" + this.question_option_experience + ", question_understand_spread=" + this.question_understand_spread + ", question_investment_advice=" + this.question_investment_advice + ", question_financial_regulator=" + this.question_financial_regulator + ", suitability=" + this.suitability + ", investment_profile=" + this.investment_profile + ", disclosure=" + this.disclosure + ", approved_trades=" + this.approved_trades + ", success=" + this.success + ", failure=" + this.failure + ", education_spread=" + this.education_spread + ", education_l3_strategies=" + this.education_l3_strategies + ", ready_l3_upgrade=" + this.ready_l3_upgrade + ", upsell_alert=" + this.upsell_alert + ", upsell_trade_on_expiration=" + this.upsell_trade_on_expiration + ", upsell_all_set=" + this.upsell_all_set + ", end=" + this.end + ", knowledge_test_questionnaire=" + this.knowledge_test_questionnaire + ", experience_test_questionnaire=" + this.experience_test_questionnaire + ", investor_profile=" + this.investor_profile + ", review_investor_profile=" + this.review_investor_profile + ", education_home=" + this.education_home + ", education_strategy=" + this.education_strategy + ", education_risks=" + this.education_risks + ", education_professional_trader=" + this.education_professional_trader + ", uk_l3_education_home=" + this.uk_l3_education_home + ", uk_l3_education_spread_benefits=" + this.uk_l3_education_spread_benefits + ", rhsg_home=" + this.rhsg_home + ", rhsg_complete_car_questionnaire=" + this.rhsg_complete_car_questionnaire + ", professional_trader=" + this.professional_trader + ", rhsg_l2_approved_trades=" + this.rhsg_l2_approved_trades + ", rhsg_l3_approved_trades=" + this.rhsg_l3_approved_trades + ", ja_pending_application=" + this.ja_pending_application + ", knowledge_check_needed=" + this.knowledge_check_needed + ")";
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OnboardingScreenResponseDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OnboardingScreenResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, boolean z, boolean z2, boolean z3, UpgradeProgressDto upgradeProgressDto, OnboardingProgressDto onboardingProgressDto, StartResponseMetadataDto startResponseMetadataDto, SplashL0ResponseMetadataDto splashL0ResponseMetadataDto, SplashL2ResponseMetadataDto splashL2ResponseMetadataDto, SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDto, QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDto, QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDto, QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDto, QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDto, SuitabilityResponseMetadataDto suitabilityResponseMetadataDto, InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto, DisclosureResponseMetadataDto disclosureResponseMetadataDto, ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto, SuccessResponseMetadataDto successResponseMetadataDto, FailureResponseMetadataDto failureResponseMetadataDto, EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto, EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto, ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto, UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto, UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto, UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto, EndResponseMetadataDto endResponseMetadataDto, KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto, ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto, InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto, ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto, UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto, UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto, UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto, UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto, UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto, UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto, RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto, RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto, ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto, RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto, RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto, JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDto, KnowledgeCheckNeededResponseMetadataDto knowledgeCheckNeededResponseMetadataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.is_checkpoint = false;
            } else {
                this.is_checkpoint = z;
            }
            if ((i & 2) == 0) {
                this.should_live_in_backstack = false;
            } else {
                this.should_live_in_backstack = z2;
            }
            if ((i & 4) == 0) {
                this.should_clear_backstack = false;
            } else {
                this.should_clear_backstack = z3;
            }
            if ((i & 8) == 0) {
                this.upgrade_progress = UpgradeProgressDto.INSTANCE.getZeroValue();
            } else {
                this.upgrade_progress = upgradeProgressDto;
            }
            if ((i & 16) == 0) {
                this.onboarding_progress = null;
            } else {
                this.onboarding_progress = onboardingProgressDto;
            }
            if ((i & 32) == 0) {
                this.start = null;
            } else {
                this.start = startResponseMetadataDto;
            }
            if ((i & 64) == 0) {
                this.splash_l0 = null;
            } else {
                this.splash_l0 = splashL0ResponseMetadataDto;
            }
            if ((i & 128) == 0) {
                this.splash_l2 = null;
            } else {
                this.splash_l2 = splashL2ResponseMetadataDto;
            }
            if ((i & 256) == 0) {
                this.splash_retirement = null;
            } else {
                this.splash_retirement = splashRetirementResponseMetadataDto;
            }
            if ((i & 512) == 0) {
                this.question_option_experience = null;
            } else {
                this.question_option_experience = questionOptionExperienceResponseMetadataDto;
            }
            if ((i & 1024) == 0) {
                this.question_understand_spread = null;
            } else {
                this.question_understand_spread = questionUnderstandSpreadResponseMetadataDto;
            }
            if ((i & 2048) == 0) {
                this.question_investment_advice = null;
            } else {
                this.question_investment_advice = questionInvestmentAdviceResponseMetadataDto;
            }
            if ((i & 4096) == 0) {
                this.question_financial_regulator = null;
            } else {
                this.question_financial_regulator = questionFinancialRegulatorResponseMetadataDto;
            }
            if ((i & 8192) == 0) {
                this.suitability = null;
            } else {
                this.suitability = suitabilityResponseMetadataDto;
            }
            if ((i & 16384) == 0) {
                this.investment_profile = null;
            } else {
                this.investment_profile = investmentProfileResponseMetadataDto;
            }
            if ((32768 & i) == 0) {
                this.disclosure = null;
            } else {
                this.disclosure = disclosureResponseMetadataDto;
            }
            if ((65536 & i) == 0) {
                this.approved_trades = null;
            } else {
                this.approved_trades = approvedTradesResponseMetadataDto;
            }
            if ((131072 & i) == 0) {
                this.success = null;
            } else {
                this.success = successResponseMetadataDto;
            }
            if ((262144 & i) == 0) {
                this.failure = null;
            } else {
                this.failure = failureResponseMetadataDto;
            }
            if ((524288 & i) == 0) {
                this.education_spread = null;
            } else {
                this.education_spread = educationSpreadResponseMetadataDto;
            }
            if ((1048576 & i) == 0) {
                this.education_l3_strategies = null;
            } else {
                this.education_l3_strategies = educationL3StrategiesResponseMetadataDto;
            }
            if ((2097152 & i) == 0) {
                this.ready_l3_upgrade = null;
            } else {
                this.ready_l3_upgrade = readyL3UpgradeResponseMetadataDto;
            }
            if ((4194304 & i) == 0) {
                this.upsell_alert = null;
            } else {
                this.upsell_alert = upsellAlertResponseMetadataDto;
            }
            if ((8388608 & i) == 0) {
                this.upsell_trade_on_expiration = null;
            } else {
                this.upsell_trade_on_expiration = upsellTradeOnExpirationResponseMetadataDto;
            }
            if ((16777216 & i) == 0) {
                this.upsell_all_set = null;
            } else {
                this.upsell_all_set = upsellAllSetResponseMetadataDto;
            }
            if ((33554432 & i) == 0) {
                this.end = null;
            } else {
                this.end = endResponseMetadataDto;
            }
            if ((67108864 & i) == 0) {
                this.knowledge_test_questionnaire = null;
            } else {
                this.knowledge_test_questionnaire = knowledgeTestQuestionnaireResponseMetadataDto;
            }
            if ((134217728 & i) == 0) {
                this.experience_test_questionnaire = null;
            } else {
                this.experience_test_questionnaire = experienceTestQuestionnaireResponseMetadataDto;
            }
            if ((268435456 & i) == 0) {
                this.investor_profile = null;
            } else {
                this.investor_profile = investorProfileV2ResponseMetadataDto;
            }
            if ((536870912 & i) == 0) {
                this.review_investor_profile = null;
            } else {
                this.review_investor_profile = reviewInvestorProfileV2ResponseMetadataDto;
            }
            if ((1073741824 & i) == 0) {
                this.education_home = null;
            } else {
                this.education_home = uKEducationHomeResponseMetadataDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.education_strategy = null;
            } else {
                this.education_strategy = uKEducationStrategyResponseMetadataDto;
            }
            if ((i2 & 1) == 0) {
                this.education_risks = null;
            } else {
                this.education_risks = uKEducationRisksResponseMetadataDto;
            }
            if ((i2 & 2) == 0) {
                this.education_professional_trader = null;
            } else {
                this.education_professional_trader = uKEducationProfessionalTraderResponseMetadataDto;
            }
            if ((i2 & 4) == 0) {
                this.uk_l3_education_home = null;
            } else {
                this.uk_l3_education_home = uKL3EducationHomeResponseMetadataDto;
            }
            if ((i2 & 8) == 0) {
                this.uk_l3_education_spread_benefits = null;
            } else {
                this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsResponseMetadataDto;
            }
            if ((i2 & 16) == 0) {
                this.rhsg_home = null;
            } else {
                this.rhsg_home = rHSGHomeResponseMetadataDto;
            }
            if ((i2 & 32) == 0) {
                this.rhsg_complete_car_questionnaire = null;
            } else {
                this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireResponseMetadataDto;
            }
            if ((i2 & 64) == 0) {
                this.professional_trader = null;
            } else {
                this.professional_trader = professionalTraderResponseMetadataDto;
            }
            if ((i2 & 128) == 0) {
                this.rhsg_l2_approved_trades = null;
            } else {
                this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesResponseMetadataDto;
            }
            if ((i2 & 256) == 0) {
                this.rhsg_l3_approved_trades = null;
            } else {
                this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesResponseMetadataDto;
            }
            if ((i2 & 512) == 0) {
                this.ja_pending_application = null;
            } else {
                this.ja_pending_application = jAPendingApplicationResponseMetadataDto;
            }
            if ((i2 & 1024) == 0) {
                this.knowledge_check_needed = null;
            } else {
                this.knowledge_check_needed = knowledgeCheckNeededResponseMetadataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_checkpoint;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.should_live_in_backstack;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            boolean z3 = self.should_clear_backstack;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 2, z3);
            }
            if (self.upgrade_progress != UpgradeProgressDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, UpgradeProgressDto.Serializer.INSTANCE, self.upgrade_progress);
            }
            OnboardingProgressDto onboardingProgressDto = self.onboarding_progress;
            if (onboardingProgressDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, OnboardingProgressDto.Serializer.INSTANCE, onboardingProgressDto);
            }
            StartResponseMetadataDto startResponseMetadataDto = self.start;
            if (startResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StartResponseMetadataDto.Serializer.INSTANCE, startResponseMetadataDto);
            }
            SplashL0ResponseMetadataDto splashL0ResponseMetadataDto = self.splash_l0;
            if (splashL0ResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SplashL0ResponseMetadataDto.Serializer.INSTANCE, splashL0ResponseMetadataDto);
            }
            SplashL2ResponseMetadataDto splashL2ResponseMetadataDto = self.splash_l2;
            if (splashL2ResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SplashL2ResponseMetadataDto.Serializer.INSTANCE, splashL2ResponseMetadataDto);
            }
            SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDto = self.splash_retirement;
            if (splashRetirementResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SplashRetirementResponseMetadataDto.Serializer.INSTANCE, splashRetirementResponseMetadataDto);
            }
            QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDto = self.question_option_experience;
            if (questionOptionExperienceResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, QuestionOptionExperienceResponseMetadataDto.Serializer.INSTANCE, questionOptionExperienceResponseMetadataDto);
            }
            QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDto = self.question_understand_spread;
            if (questionUnderstandSpreadResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, QuestionUnderstandSpreadResponseMetadataDto.Serializer.INSTANCE, questionUnderstandSpreadResponseMetadataDto);
            }
            QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDto = self.question_investment_advice;
            if (questionInvestmentAdviceResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, QuestionInvestmentAdviceResponseMetadataDto.Serializer.INSTANCE, questionInvestmentAdviceResponseMetadataDto);
            }
            QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDto = self.question_financial_regulator;
            if (questionFinancialRegulatorResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, QuestionFinancialRegulatorResponseMetadataDto.Serializer.INSTANCE, questionFinancialRegulatorResponseMetadataDto);
            }
            SuitabilityResponseMetadataDto suitabilityResponseMetadataDto = self.suitability;
            if (suitabilityResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, SuitabilityResponseMetadataDto.Serializer.INSTANCE, suitabilityResponseMetadataDto);
            }
            InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto = self.investment_profile;
            if (investmentProfileResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, InvestmentProfileResponseMetadataDto.Serializer.INSTANCE, investmentProfileResponseMetadataDto);
            }
            DisclosureResponseMetadataDto disclosureResponseMetadataDto = self.disclosure;
            if (disclosureResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, DisclosureResponseMetadataDto.Serializer.INSTANCE, disclosureResponseMetadataDto);
            }
            ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto = self.approved_trades;
            if (approvedTradesResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, ApprovedTradesResponseMetadataDto.Serializer.INSTANCE, approvedTradesResponseMetadataDto);
            }
            SuccessResponseMetadataDto successResponseMetadataDto = self.success;
            if (successResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, SuccessResponseMetadataDto.Serializer.INSTANCE, successResponseMetadataDto);
            }
            FailureResponseMetadataDto failureResponseMetadataDto = self.failure;
            if (failureResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, FailureResponseMetadataDto.Serializer.INSTANCE, failureResponseMetadataDto);
            }
            EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto = self.education_spread;
            if (educationSpreadResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, EducationSpreadResponseMetadataDto.Serializer.INSTANCE, educationSpreadResponseMetadataDto);
            }
            EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto = self.education_l3_strategies;
            if (educationL3StrategiesResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, EducationL3StrategiesResponseMetadataDto.Serializer.INSTANCE, educationL3StrategiesResponseMetadataDto);
            }
            ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto = self.ready_l3_upgrade;
            if (readyL3UpgradeResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, ReadyL3UpgradeResponseMetadataDto.Serializer.INSTANCE, readyL3UpgradeResponseMetadataDto);
            }
            UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto = self.upsell_alert;
            if (upsellAlertResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, UpsellAlertResponseMetadataDto.Serializer.INSTANCE, upsellAlertResponseMetadataDto);
            }
            UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto = self.upsell_trade_on_expiration;
            if (upsellTradeOnExpirationResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, UpsellTradeOnExpirationResponseMetadataDto.Serializer.INSTANCE, upsellTradeOnExpirationResponseMetadataDto);
            }
            UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto = self.upsell_all_set;
            if (upsellAllSetResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, UpsellAllSetResponseMetadataDto.Serializer.INSTANCE, upsellAllSetResponseMetadataDto);
            }
            EndResponseMetadataDto endResponseMetadataDto = self.end;
            if (endResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, EndResponseMetadataDto.Serializer.INSTANCE, endResponseMetadataDto);
            }
            KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto = self.knowledge_test_questionnaire;
            if (knowledgeTestQuestionnaireResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, KnowledgeTestQuestionnaireResponseMetadataDto.Serializer.INSTANCE, knowledgeTestQuestionnaireResponseMetadataDto);
            }
            ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto = self.experience_test_questionnaire;
            if (experienceTestQuestionnaireResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, ExperienceTestQuestionnaireResponseMetadataDto.Serializer.INSTANCE, experienceTestQuestionnaireResponseMetadataDto);
            }
            InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto = self.investor_profile;
            if (investorProfileV2ResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, InvestorProfileV2ResponseMetadataDto.Serializer.INSTANCE, investorProfileV2ResponseMetadataDto);
            }
            ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto = self.review_investor_profile;
            if (reviewInvestorProfileV2ResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, ReviewInvestorProfileV2ResponseMetadataDto.Serializer.INSTANCE, reviewInvestorProfileV2ResponseMetadataDto);
            }
            UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto = self.education_home;
            if (uKEducationHomeResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, UKEducationHomeResponseMetadataDto.Serializer.INSTANCE, uKEducationHomeResponseMetadataDto);
            }
            UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto = self.education_strategy;
            if (uKEducationStrategyResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, UKEducationStrategyResponseMetadataDto.Serializer.INSTANCE, uKEducationStrategyResponseMetadataDto);
            }
            UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto = self.education_risks;
            if (uKEducationRisksResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, UKEducationRisksResponseMetadataDto.Serializer.INSTANCE, uKEducationRisksResponseMetadataDto);
            }
            UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto = self.education_professional_trader;
            if (uKEducationProfessionalTraderResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, UKEducationProfessionalTraderResponseMetadataDto.Serializer.INSTANCE, uKEducationProfessionalTraderResponseMetadataDto);
            }
            UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto = self.uk_l3_education_home;
            if (uKL3EducationHomeResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, UKL3EducationHomeResponseMetadataDto.Serializer.INSTANCE, uKL3EducationHomeResponseMetadataDto);
            }
            UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto = self.uk_l3_education_spread_benefits;
            if (uKL3EducationSpreadBenefitsResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, UKL3EducationSpreadBenefitsResponseMetadataDto.Serializer.INSTANCE, uKL3EducationSpreadBenefitsResponseMetadataDto);
            }
            RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto = self.rhsg_home;
            if (rHSGHomeResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, RHSGHomeResponseMetadataDto.Serializer.INSTANCE, rHSGHomeResponseMetadataDto);
            }
            RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto = self.rhsg_complete_car_questionnaire;
            if (rHSGCompleteCARQuestionnaireResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, RHSGCompleteCARQuestionnaireResponseMetadataDto.Serializer.INSTANCE, rHSGCompleteCARQuestionnaireResponseMetadataDto);
            }
            ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto = self.professional_trader;
            if (professionalTraderResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 38, ProfessionalTraderResponseMetadataDto.Serializer.INSTANCE, professionalTraderResponseMetadataDto);
            }
            RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto = self.rhsg_l2_approved_trades;
            if (rHSGL2ApprovedTradesResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, RHSGL2ApprovedTradesResponseMetadataDto.Serializer.INSTANCE, rHSGL2ApprovedTradesResponseMetadataDto);
            }
            RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto = self.rhsg_l3_approved_trades;
            if (rHSGL3ApprovedTradesResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, RHSGL3ApprovedTradesResponseMetadataDto.Serializer.INSTANCE, rHSGL3ApprovedTradesResponseMetadataDto);
            }
            JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDto = self.ja_pending_application;
            if (jAPendingApplicationResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, JAPendingApplicationResponseMetadataDto.Serializer.INSTANCE, jAPendingApplicationResponseMetadataDto);
            }
            KnowledgeCheckNeededResponseMetadataDto knowledgeCheckNeededResponseMetadataDto = self.knowledge_check_needed;
            if (knowledgeCheckNeededResponseMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 42, KnowledgeCheckNeededResponseMetadataDto.Serializer.INSTANCE, knowledgeCheckNeededResponseMetadataDto);
            }
        }

        public Surrogate(boolean z, boolean z2, boolean z3, UpgradeProgressDto upgrade_progress, OnboardingProgressDto onboardingProgressDto, StartResponseMetadataDto startResponseMetadataDto, SplashL0ResponseMetadataDto splashL0ResponseMetadataDto, SplashL2ResponseMetadataDto splashL2ResponseMetadataDto, SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDto, QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDto, QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDto, QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDto, QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDto, SuitabilityResponseMetadataDto suitabilityResponseMetadataDto, InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto, DisclosureResponseMetadataDto disclosureResponseMetadataDto, ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto, SuccessResponseMetadataDto successResponseMetadataDto, FailureResponseMetadataDto failureResponseMetadataDto, EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto, EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto, ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto, UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto, UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto, UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto, EndResponseMetadataDto endResponseMetadataDto, KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto, ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto, InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto, ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto, UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto, UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto, UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto, UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto, UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto, UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto, RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto, RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto, ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto, RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto, RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto, JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDto, KnowledgeCheckNeededResponseMetadataDto knowledgeCheckNeededResponseMetadataDto) {
            Intrinsics.checkNotNullParameter(upgrade_progress, "upgrade_progress");
            this.is_checkpoint = z;
            this.should_live_in_backstack = z2;
            this.should_clear_backstack = z3;
            this.upgrade_progress = upgrade_progress;
            this.onboarding_progress = onboardingProgressDto;
            this.start = startResponseMetadataDto;
            this.splash_l0 = splashL0ResponseMetadataDto;
            this.splash_l2 = splashL2ResponseMetadataDto;
            this.splash_retirement = splashRetirementResponseMetadataDto;
            this.question_option_experience = questionOptionExperienceResponseMetadataDto;
            this.question_understand_spread = questionUnderstandSpreadResponseMetadataDto;
            this.question_investment_advice = questionInvestmentAdviceResponseMetadataDto;
            this.question_financial_regulator = questionFinancialRegulatorResponseMetadataDto;
            this.suitability = suitabilityResponseMetadataDto;
            this.investment_profile = investmentProfileResponseMetadataDto;
            this.disclosure = disclosureResponseMetadataDto;
            this.approved_trades = approvedTradesResponseMetadataDto;
            this.success = successResponseMetadataDto;
            this.failure = failureResponseMetadataDto;
            this.education_spread = educationSpreadResponseMetadataDto;
            this.education_l3_strategies = educationL3StrategiesResponseMetadataDto;
            this.ready_l3_upgrade = readyL3UpgradeResponseMetadataDto;
            this.upsell_alert = upsellAlertResponseMetadataDto;
            this.upsell_trade_on_expiration = upsellTradeOnExpirationResponseMetadataDto;
            this.upsell_all_set = upsellAllSetResponseMetadataDto;
            this.end = endResponseMetadataDto;
            this.knowledge_test_questionnaire = knowledgeTestQuestionnaireResponseMetadataDto;
            this.experience_test_questionnaire = experienceTestQuestionnaireResponseMetadataDto;
            this.investor_profile = investorProfileV2ResponseMetadataDto;
            this.review_investor_profile = reviewInvestorProfileV2ResponseMetadataDto;
            this.education_home = uKEducationHomeResponseMetadataDto;
            this.education_strategy = uKEducationStrategyResponseMetadataDto;
            this.education_risks = uKEducationRisksResponseMetadataDto;
            this.education_professional_trader = uKEducationProfessionalTraderResponseMetadataDto;
            this.uk_l3_education_home = uKL3EducationHomeResponseMetadataDto;
            this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsResponseMetadataDto;
            this.rhsg_home = rHSGHomeResponseMetadataDto;
            this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireResponseMetadataDto;
            this.professional_trader = professionalTraderResponseMetadataDto;
            this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesResponseMetadataDto;
            this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesResponseMetadataDto;
            this.ja_pending_application = jAPendingApplicationResponseMetadataDto;
            this.knowledge_check_needed = knowledgeCheckNeededResponseMetadataDto;
        }

        /* renamed from: is_checkpoint, reason: from getter */
        public final boolean getIs_checkpoint() {
            return this.is_checkpoint;
        }

        public final boolean getShould_live_in_backstack() {
            return this.should_live_in_backstack;
        }

        public final boolean getShould_clear_backstack() {
            return this.should_clear_backstack;
        }

        public final UpgradeProgressDto getUpgrade_progress() {
            return this.upgrade_progress;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(boolean z, boolean z2, boolean z3, UpgradeProgressDto upgradeProgressDto, OnboardingProgressDto onboardingProgressDto, StartResponseMetadataDto startResponseMetadataDto, SplashL0ResponseMetadataDto splashL0ResponseMetadataDto, SplashL2ResponseMetadataDto splashL2ResponseMetadataDto, SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDto, QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDto, QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDto, QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDto, QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDto, SuitabilityResponseMetadataDto suitabilityResponseMetadataDto, InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto, DisclosureResponseMetadataDto disclosureResponseMetadataDto, ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto, SuccessResponseMetadataDto successResponseMetadataDto, FailureResponseMetadataDto failureResponseMetadataDto, EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto, EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto, ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto, UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto, UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto, UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto, EndResponseMetadataDto endResponseMetadataDto, KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto, ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto, InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto, ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto, UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto, UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto, UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto, UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto, UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto, UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto, RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto, RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto, ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto, RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto, RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto, JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDto, KnowledgeCheckNeededResponseMetadataDto knowledgeCheckNeededResponseMetadataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z4 = (i & 1) != 0 ? false : z;
            this(z4, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? UpgradeProgressDto.INSTANCE.getZeroValue() : upgradeProgressDto, (i & 16) != 0 ? null : onboardingProgressDto, (i & 32) != 0 ? null : startResponseMetadataDto, (i & 64) != 0 ? null : splashL0ResponseMetadataDto, (i & 128) != 0 ? null : splashL2ResponseMetadataDto, (i & 256) != 0 ? null : splashRetirementResponseMetadataDto, (i & 512) != 0 ? null : questionOptionExperienceResponseMetadataDto, (i & 1024) != 0 ? null : questionUnderstandSpreadResponseMetadataDto, (i & 2048) != 0 ? null : questionInvestmentAdviceResponseMetadataDto, (i & 4096) != 0 ? null : questionFinancialRegulatorResponseMetadataDto, (i & 8192) != 0 ? null : suitabilityResponseMetadataDto, (i & 16384) != 0 ? null : investmentProfileResponseMetadataDto, (i & 32768) != 0 ? null : disclosureResponseMetadataDto, (i & 65536) != 0 ? null : approvedTradesResponseMetadataDto, (i & 131072) != 0 ? null : successResponseMetadataDto, (i & 262144) != 0 ? null : failureResponseMetadataDto, (i & 524288) != 0 ? null : educationSpreadResponseMetadataDto, (i & 1048576) != 0 ? null : educationL3StrategiesResponseMetadataDto, (i & 2097152) != 0 ? null : readyL3UpgradeResponseMetadataDto, (i & 4194304) != 0 ? null : upsellAlertResponseMetadataDto, (i & 8388608) != 0 ? null : upsellTradeOnExpirationResponseMetadataDto, (i & 16777216) != 0 ? null : upsellAllSetResponseMetadataDto, (i & 33554432) != 0 ? null : endResponseMetadataDto, (i & 67108864) != 0 ? null : knowledgeTestQuestionnaireResponseMetadataDto, (i & 134217728) != 0 ? null : experienceTestQuestionnaireResponseMetadataDto, (i & 268435456) != 0 ? null : investorProfileV2ResponseMetadataDto, (i & 536870912) != 0 ? null : reviewInvestorProfileV2ResponseMetadataDto, (i & 1073741824) != 0 ? null : uKEducationHomeResponseMetadataDto, (i & Integer.MIN_VALUE) != 0 ? null : uKEducationStrategyResponseMetadataDto, (i2 & 1) != 0 ? null : uKEducationRisksResponseMetadataDto, (i2 & 2) != 0 ? null : uKEducationProfessionalTraderResponseMetadataDto, (i2 & 4) != 0 ? null : uKL3EducationHomeResponseMetadataDto, (i2 & 8) != 0 ? null : uKL3EducationSpreadBenefitsResponseMetadataDto, (i2 & 16) != 0 ? null : rHSGHomeResponseMetadataDto, (i2 & 32) != 0 ? null : rHSGCompleteCARQuestionnaireResponseMetadataDto, (i2 & 64) != 0 ? null : professionalTraderResponseMetadataDto, (i2 & 128) != 0 ? null : rHSGL2ApprovedTradesResponseMetadataDto, (i2 & 256) != 0 ? null : rHSGL3ApprovedTradesResponseMetadataDto, (i2 & 512) != 0 ? null : jAPendingApplicationResponseMetadataDto, (i2 & 1024) != 0 ? null : knowledgeCheckNeededResponseMetadataDto);
        }

        public final OnboardingProgressDto getOnboarding_progress() {
            return this.onboarding_progress;
        }

        public final StartResponseMetadataDto getStart() {
            return this.start;
        }

        public final SplashL0ResponseMetadataDto getSplash_l0() {
            return this.splash_l0;
        }

        public final SplashL2ResponseMetadataDto getSplash_l2() {
            return this.splash_l2;
        }

        public final SplashRetirementResponseMetadataDto getSplash_retirement() {
            return this.splash_retirement;
        }

        public final QuestionOptionExperienceResponseMetadataDto getQuestion_option_experience() {
            return this.question_option_experience;
        }

        public final QuestionUnderstandSpreadResponseMetadataDto getQuestion_understand_spread() {
            return this.question_understand_spread;
        }

        public final QuestionInvestmentAdviceResponseMetadataDto getQuestion_investment_advice() {
            return this.question_investment_advice;
        }

        public final QuestionFinancialRegulatorResponseMetadataDto getQuestion_financial_regulator() {
            return this.question_financial_regulator;
        }

        public final SuitabilityResponseMetadataDto getSuitability() {
            return this.suitability;
        }

        public final InvestmentProfileResponseMetadataDto getInvestment_profile() {
            return this.investment_profile;
        }

        public final DisclosureResponseMetadataDto getDisclosure() {
            return this.disclosure;
        }

        public final ApprovedTradesResponseMetadataDto getApproved_trades() {
            return this.approved_trades;
        }

        public final SuccessResponseMetadataDto getSuccess() {
            return this.success;
        }

        public final FailureResponseMetadataDto getFailure() {
            return this.failure;
        }

        public final EducationSpreadResponseMetadataDto getEducation_spread() {
            return this.education_spread;
        }

        public final EducationL3StrategiesResponseMetadataDto getEducation_l3_strategies() {
            return this.education_l3_strategies;
        }

        public final ReadyL3UpgradeResponseMetadataDto getReady_l3_upgrade() {
            return this.ready_l3_upgrade;
        }

        public final UpsellAlertResponseMetadataDto getUpsell_alert() {
            return this.upsell_alert;
        }

        public final UpsellTradeOnExpirationResponseMetadataDto getUpsell_trade_on_expiration() {
            return this.upsell_trade_on_expiration;
        }

        public final UpsellAllSetResponseMetadataDto getUpsell_all_set() {
            return this.upsell_all_set;
        }

        public final EndResponseMetadataDto getEnd() {
            return this.end;
        }

        public final KnowledgeTestQuestionnaireResponseMetadataDto getKnowledge_test_questionnaire() {
            return this.knowledge_test_questionnaire;
        }

        public final ExperienceTestQuestionnaireResponseMetadataDto getExperience_test_questionnaire() {
            return this.experience_test_questionnaire;
        }

        public final InvestorProfileV2ResponseMetadataDto getInvestor_profile() {
            return this.investor_profile;
        }

        public final ReviewInvestorProfileV2ResponseMetadataDto getReview_investor_profile() {
            return this.review_investor_profile;
        }

        public final UKEducationHomeResponseMetadataDto getEducation_home() {
            return this.education_home;
        }

        public final UKEducationStrategyResponseMetadataDto getEducation_strategy() {
            return this.education_strategy;
        }

        public final UKEducationRisksResponseMetadataDto getEducation_risks() {
            return this.education_risks;
        }

        public final UKEducationProfessionalTraderResponseMetadataDto getEducation_professional_trader() {
            return this.education_professional_trader;
        }

        public final UKL3EducationHomeResponseMetadataDto getUk_l3_education_home() {
            return this.uk_l3_education_home;
        }

        public final UKL3EducationSpreadBenefitsResponseMetadataDto getUk_l3_education_spread_benefits() {
            return this.uk_l3_education_spread_benefits;
        }

        public final RHSGHomeResponseMetadataDto getRhsg_home() {
            return this.rhsg_home;
        }

        public final RHSGCompleteCARQuestionnaireResponseMetadataDto getRhsg_complete_car_questionnaire() {
            return this.rhsg_complete_car_questionnaire;
        }

        public final ProfessionalTraderResponseMetadataDto getProfessional_trader() {
            return this.professional_trader;
        }

        public final RHSGL2ApprovedTradesResponseMetadataDto getRhsg_l2_approved_trades() {
            return this.rhsg_l2_approved_trades;
        }

        public final RHSGL3ApprovedTradesResponseMetadataDto getRhsg_l3_approved_trades() {
            return this.rhsg_l3_approved_trades;
        }

        public final JAPendingApplicationResponseMetadataDto getJa_pending_application() {
            return this.ja_pending_application;
        }

        public final KnowledgeCheckNeededResponseMetadataDto getKnowledge_check_needed() {
            return this.knowledge_check_needed;
        }
    }

    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/OnboardingScreenResponseDto;", "Loptions_product/service/OnboardingScreenResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/OnboardingScreenResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OnboardingScreenResponseDto, OnboardingScreenResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OnboardingScreenResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OnboardingScreenResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OnboardingScreenResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) OnboardingScreenResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OnboardingScreenResponse> getProtoAdapter() {
            return OnboardingScreenResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OnboardingScreenResponseDto getZeroValue() {
            return OnboardingScreenResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OnboardingScreenResponseDto fromProto(OnboardingScreenResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean is_checkpoint = proto.getIs_checkpoint();
            boolean should_live_in_backstack = proto.getShould_live_in_backstack();
            boolean should_clear_backstack = proto.getShould_clear_backstack();
            UpgradeProgressDto upgradeProgressDtoFromProto = UpgradeProgressDto.INSTANCE.fromProto(proto.getUpgrade_progress());
            OnboardingProgress onboarding_progress = proto.getOnboarding_progress();
            OnboardingProgressDto onboardingProgressDtoFromProto = onboarding_progress != null ? OnboardingProgressDto.INSTANCE.fromProto(onboarding_progress) : null;
            StartResponseMetadata start = proto.getStart();
            StartResponseMetadataDto startResponseMetadataDtoFromProto = start != null ? StartResponseMetadataDto.INSTANCE.fromProto(start) : null;
            SplashL0ResponseMetadata splash_l0 = proto.getSplash_l0();
            SplashL0ResponseMetadataDto splashL0ResponseMetadataDtoFromProto = splash_l0 != null ? SplashL0ResponseMetadataDto.INSTANCE.fromProto(splash_l0) : null;
            SplashL2ResponseMetadata splash_l2 = proto.getSplash_l2();
            SplashL2ResponseMetadataDto splashL2ResponseMetadataDtoFromProto = splash_l2 != null ? SplashL2ResponseMetadataDto.INSTANCE.fromProto(splash_l2) : null;
            SplashRetirementResponseMetadata splash_retirement = proto.getSplash_retirement();
            SplashRetirementResponseMetadataDto splashRetirementResponseMetadataDtoFromProto = splash_retirement != null ? SplashRetirementResponseMetadataDto.INSTANCE.fromProto(splash_retirement) : null;
            QuestionOptionExperienceResponseMetadata question_option_experience = proto.getQuestion_option_experience();
            QuestionOptionExperienceResponseMetadataDto questionOptionExperienceResponseMetadataDtoFromProto = question_option_experience != null ? QuestionOptionExperienceResponseMetadataDto.INSTANCE.fromProto(question_option_experience) : null;
            QuestionUnderstandSpreadResponseMetadata question_understand_spread = proto.getQuestion_understand_spread();
            QuestionUnderstandSpreadResponseMetadataDto questionUnderstandSpreadResponseMetadataDtoFromProto = question_understand_spread != null ? QuestionUnderstandSpreadResponseMetadataDto.INSTANCE.fromProto(question_understand_spread) : null;
            QuestionInvestmentAdviceResponseMetadata question_investment_advice = proto.getQuestion_investment_advice();
            QuestionInvestmentAdviceResponseMetadataDto questionInvestmentAdviceResponseMetadataDtoFromProto = question_investment_advice != null ? QuestionInvestmentAdviceResponseMetadataDto.INSTANCE.fromProto(question_investment_advice) : null;
            QuestionFinancialRegulatorResponseMetadata question_financial_regulator = proto.getQuestion_financial_regulator();
            QuestionFinancialRegulatorResponseMetadataDto questionFinancialRegulatorResponseMetadataDtoFromProto = question_financial_regulator != null ? QuestionFinancialRegulatorResponseMetadataDto.INSTANCE.fromProto(question_financial_regulator) : null;
            SuitabilityResponseMetadata suitability = proto.getSuitability();
            SuitabilityResponseMetadataDto suitabilityResponseMetadataDtoFromProto = suitability != null ? SuitabilityResponseMetadataDto.INSTANCE.fromProto(suitability) : null;
            InvestmentProfileResponseMetadata investment_profile = proto.getInvestment_profile();
            OnboardingProgressDto onboardingProgressDto = onboardingProgressDtoFromProto;
            InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDtoFromProto = investment_profile != null ? InvestmentProfileResponseMetadataDto.INSTANCE.fromProto(investment_profile) : null;
            DisclosureResponseMetadata disclosure = proto.getDisclosure();
            InvestmentProfileResponseMetadataDto investmentProfileResponseMetadataDto = investmentProfileResponseMetadataDtoFromProto;
            DisclosureResponseMetadataDto disclosureResponseMetadataDtoFromProto = disclosure != null ? DisclosureResponseMetadataDto.INSTANCE.fromProto(disclosure) : null;
            ApprovedTradesResponseMetadata approved_trades = proto.getApproved_trades();
            DisclosureResponseMetadataDto disclosureResponseMetadataDto = disclosureResponseMetadataDtoFromProto;
            ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDtoFromProto = approved_trades != null ? ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(approved_trades) : null;
            SuccessResponseMetadata success = proto.getSuccess();
            ApprovedTradesResponseMetadataDto approvedTradesResponseMetadataDto = approvedTradesResponseMetadataDtoFromProto;
            SuccessResponseMetadataDto successResponseMetadataDtoFromProto = success != null ? SuccessResponseMetadataDto.INSTANCE.fromProto(success) : null;
            FailureResponseMetadata failure = proto.getFailure();
            SuccessResponseMetadataDto successResponseMetadataDto = successResponseMetadataDtoFromProto;
            FailureResponseMetadataDto failureResponseMetadataDtoFromProto = failure != null ? FailureResponseMetadataDto.INSTANCE.fromProto(failure) : null;
            EducationSpreadResponseMetadata education_spread = proto.getEducation_spread();
            FailureResponseMetadataDto failureResponseMetadataDto = failureResponseMetadataDtoFromProto;
            EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDtoFromProto = education_spread != null ? EducationSpreadResponseMetadataDto.INSTANCE.fromProto(education_spread) : null;
            EducationL3StrategiesResponseMetadata education_l3_strategies = proto.getEducation_l3_strategies();
            EducationSpreadResponseMetadataDto educationSpreadResponseMetadataDto = educationSpreadResponseMetadataDtoFromProto;
            EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDtoFromProto = education_l3_strategies != null ? EducationL3StrategiesResponseMetadataDto.INSTANCE.fromProto(education_l3_strategies) : null;
            ReadyL3UpgradeResponseMetadata ready_l3_upgrade = proto.getReady_l3_upgrade();
            EducationL3StrategiesResponseMetadataDto educationL3StrategiesResponseMetadataDto = educationL3StrategiesResponseMetadataDtoFromProto;
            ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDtoFromProto = ready_l3_upgrade != null ? ReadyL3UpgradeResponseMetadataDto.INSTANCE.fromProto(ready_l3_upgrade) : null;
            UpsellAlertResponseMetadata upsell_alert = proto.getUpsell_alert();
            ReadyL3UpgradeResponseMetadataDto readyL3UpgradeResponseMetadataDto = readyL3UpgradeResponseMetadataDtoFromProto;
            UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDtoFromProto = upsell_alert != null ? UpsellAlertResponseMetadataDto.INSTANCE.fromProto(upsell_alert) : null;
            UpsellTradeOnExpirationResponseMetadata upsell_trade_on_expiration = proto.getUpsell_trade_on_expiration();
            UpsellAlertResponseMetadataDto upsellAlertResponseMetadataDto = upsellAlertResponseMetadataDtoFromProto;
            UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDtoFromProto = upsell_trade_on_expiration != null ? UpsellTradeOnExpirationResponseMetadataDto.INSTANCE.fromProto(upsell_trade_on_expiration) : null;
            UpsellAllSetResponseMetadata upsell_all_set = proto.getUpsell_all_set();
            UpsellTradeOnExpirationResponseMetadataDto upsellTradeOnExpirationResponseMetadataDto = upsellTradeOnExpirationResponseMetadataDtoFromProto;
            UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDtoFromProto = upsell_all_set != null ? UpsellAllSetResponseMetadataDto.INSTANCE.fromProto(upsell_all_set) : null;
            EndResponseMetadata end = proto.getEnd();
            UpsellAllSetResponseMetadataDto upsellAllSetResponseMetadataDto = upsellAllSetResponseMetadataDtoFromProto;
            EndResponseMetadataDto endResponseMetadataDtoFromProto = end != null ? EndResponseMetadataDto.INSTANCE.fromProto(end) : null;
            KnowledgeTestQuestionnaireResponseMetadata knowledge_test_questionnaire = proto.getKnowledge_test_questionnaire();
            EndResponseMetadataDto endResponseMetadataDto = endResponseMetadataDtoFromProto;
            KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDtoFromProto = knowledge_test_questionnaire != null ? KnowledgeTestQuestionnaireResponseMetadataDto.INSTANCE.fromProto(knowledge_test_questionnaire) : null;
            ExperienceTestQuestionnaireResponseMetadata experience_test_questionnaire = proto.getExperience_test_questionnaire();
            KnowledgeTestQuestionnaireResponseMetadataDto knowledgeTestQuestionnaireResponseMetadataDto = knowledgeTestQuestionnaireResponseMetadataDtoFromProto;
            ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDtoFromProto = experience_test_questionnaire != null ? ExperienceTestQuestionnaireResponseMetadataDto.INSTANCE.fromProto(experience_test_questionnaire) : null;
            InvestorProfileV2ResponseMetadata investor_profile = proto.getInvestor_profile();
            ExperienceTestQuestionnaireResponseMetadataDto experienceTestQuestionnaireResponseMetadataDto = experienceTestQuestionnaireResponseMetadataDtoFromProto;
            InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDtoFromProto = investor_profile != null ? InvestorProfileV2ResponseMetadataDto.INSTANCE.fromProto(investor_profile) : null;
            ReviewInvestorProfileV2ResponseMetadata review_investor_profile = proto.getReview_investor_profile();
            InvestorProfileV2ResponseMetadataDto investorProfileV2ResponseMetadataDto = investorProfileV2ResponseMetadataDtoFromProto;
            ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDtoFromProto = review_investor_profile != null ? ReviewInvestorProfileV2ResponseMetadataDto.INSTANCE.fromProto(review_investor_profile) : null;
            UKEducationHomeResponseMetadata education_home = proto.getEducation_home();
            ReviewInvestorProfileV2ResponseMetadataDto reviewInvestorProfileV2ResponseMetadataDto = reviewInvestorProfileV2ResponseMetadataDtoFromProto;
            UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDtoFromProto = education_home != null ? UKEducationHomeResponseMetadataDto.INSTANCE.fromProto(education_home) : null;
            UKEducationStrategyResponseMetadata education_strategy = proto.getEducation_strategy();
            UKEducationHomeResponseMetadataDto uKEducationHomeResponseMetadataDto = uKEducationHomeResponseMetadataDtoFromProto;
            UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDtoFromProto = education_strategy != null ? UKEducationStrategyResponseMetadataDto.INSTANCE.fromProto(education_strategy) : null;
            UKEducationRisksResponseMetadata education_risks = proto.getEducation_risks();
            UKEducationStrategyResponseMetadataDto uKEducationStrategyResponseMetadataDto = uKEducationStrategyResponseMetadataDtoFromProto;
            UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDtoFromProto = education_risks != null ? UKEducationRisksResponseMetadataDto.INSTANCE.fromProto(education_risks) : null;
            UKEducationProfessionalTraderResponseMetadata education_professional_trader = proto.getEducation_professional_trader();
            UKEducationRisksResponseMetadataDto uKEducationRisksResponseMetadataDto = uKEducationRisksResponseMetadataDtoFromProto;
            UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDtoFromProto = education_professional_trader != null ? UKEducationProfessionalTraderResponseMetadataDto.INSTANCE.fromProto(education_professional_trader) : null;
            UKL3EducationHomeResponseMetadata uk_l3_education_home = proto.getUk_l3_education_home();
            UKEducationProfessionalTraderResponseMetadataDto uKEducationProfessionalTraderResponseMetadataDto = uKEducationProfessionalTraderResponseMetadataDtoFromProto;
            UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDtoFromProto = uk_l3_education_home != null ? UKL3EducationHomeResponseMetadataDto.INSTANCE.fromProto(uk_l3_education_home) : null;
            UKL3EducationSpreadBenefitsResponseMetadata uk_l3_education_spread_benefits = proto.getUk_l3_education_spread_benefits();
            UKL3EducationHomeResponseMetadataDto uKL3EducationHomeResponseMetadataDto = uKL3EducationHomeResponseMetadataDtoFromProto;
            UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDtoFromProto = uk_l3_education_spread_benefits != null ? UKL3EducationSpreadBenefitsResponseMetadataDto.INSTANCE.fromProto(uk_l3_education_spread_benefits) : null;
            RHSGHomeResponseMetadata rhsg_home = proto.getRhsg_home();
            UKL3EducationSpreadBenefitsResponseMetadataDto uKL3EducationSpreadBenefitsResponseMetadataDto = uKL3EducationSpreadBenefitsResponseMetadataDtoFromProto;
            RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDtoFromProto = rhsg_home != null ? RHSGHomeResponseMetadataDto.INSTANCE.fromProto(rhsg_home) : null;
            RHSGCompleteCARQuestionnaireResponseMetadata rhsg_complete_car_questionnaire = proto.getRhsg_complete_car_questionnaire();
            RHSGHomeResponseMetadataDto rHSGHomeResponseMetadataDto = rHSGHomeResponseMetadataDtoFromProto;
            RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDtoFromProto = rhsg_complete_car_questionnaire != null ? RHSGCompleteCARQuestionnaireResponseMetadataDto.INSTANCE.fromProto(rhsg_complete_car_questionnaire) : null;
            ProfessionalTraderResponseMetadata professional_trader = proto.getProfessional_trader();
            RHSGCompleteCARQuestionnaireResponseMetadataDto rHSGCompleteCARQuestionnaireResponseMetadataDto = rHSGCompleteCARQuestionnaireResponseMetadataDtoFromProto;
            ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDtoFromProto = professional_trader != null ? ProfessionalTraderResponseMetadataDto.INSTANCE.fromProto(professional_trader) : null;
            RHSGL2ApprovedTradesResponseMetadata rhsg_l2_approved_trades = proto.getRhsg_l2_approved_trades();
            ProfessionalTraderResponseMetadataDto professionalTraderResponseMetadataDto = professionalTraderResponseMetadataDtoFromProto;
            RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDtoFromProto = rhsg_l2_approved_trades != null ? RHSGL2ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(rhsg_l2_approved_trades) : null;
            RHSGL3ApprovedTradesResponseMetadata rhsg_l3_approved_trades = proto.getRhsg_l3_approved_trades();
            RHSGL2ApprovedTradesResponseMetadataDto rHSGL2ApprovedTradesResponseMetadataDto = rHSGL2ApprovedTradesResponseMetadataDtoFromProto;
            RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDtoFromProto = rhsg_l3_approved_trades != null ? RHSGL3ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(rhsg_l3_approved_trades) : null;
            JAPendingApplicationResponseMetadata ja_pending_application = proto.getJa_pending_application();
            RHSGL3ApprovedTradesResponseMetadataDto rHSGL3ApprovedTradesResponseMetadataDto = rHSGL3ApprovedTradesResponseMetadataDtoFromProto;
            JAPendingApplicationResponseMetadataDto jAPendingApplicationResponseMetadataDtoFromProto = ja_pending_application != null ? JAPendingApplicationResponseMetadataDto.INSTANCE.fromProto(ja_pending_application) : null;
            KnowledgeCheckNeededResponseMetadata knowledge_check_needed = proto.getKnowledge_check_needed();
            return new OnboardingScreenResponseDto(new Surrogate(is_checkpoint, should_live_in_backstack, should_clear_backstack, upgradeProgressDtoFromProto, onboardingProgressDto, startResponseMetadataDtoFromProto, splashL0ResponseMetadataDtoFromProto, splashL2ResponseMetadataDtoFromProto, splashRetirementResponseMetadataDtoFromProto, questionOptionExperienceResponseMetadataDtoFromProto, questionUnderstandSpreadResponseMetadataDtoFromProto, questionInvestmentAdviceResponseMetadataDtoFromProto, questionFinancialRegulatorResponseMetadataDtoFromProto, suitabilityResponseMetadataDtoFromProto, investmentProfileResponseMetadataDto, disclosureResponseMetadataDto, approvedTradesResponseMetadataDto, successResponseMetadataDto, failureResponseMetadataDto, educationSpreadResponseMetadataDto, educationL3StrategiesResponseMetadataDto, readyL3UpgradeResponseMetadataDto, upsellAlertResponseMetadataDto, upsellTradeOnExpirationResponseMetadataDto, upsellAllSetResponseMetadataDto, endResponseMetadataDto, knowledgeTestQuestionnaireResponseMetadataDto, experienceTestQuestionnaireResponseMetadataDto, investorProfileV2ResponseMetadataDto, reviewInvestorProfileV2ResponseMetadataDto, uKEducationHomeResponseMetadataDto, uKEducationStrategyResponseMetadataDto, uKEducationRisksResponseMetadataDto, uKEducationProfessionalTraderResponseMetadataDto, uKL3EducationHomeResponseMetadataDto, uKL3EducationSpreadBenefitsResponseMetadataDto, rHSGHomeResponseMetadataDto, rHSGCompleteCARQuestionnaireResponseMetadataDto, professionalTraderResponseMetadataDto, rHSGL2ApprovedTradesResponseMetadataDto, rHSGL3ApprovedTradesResponseMetadataDto, jAPendingApplicationResponseMetadataDtoFromProto, knowledge_check_needed != null ? KnowledgeCheckNeededResponseMetadataDto.INSTANCE.fromProto(knowledge_check_needed) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.OnboardingScreenResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnboardingScreenResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OnboardingScreenResponseDto(false, false, false, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 *2\u00020\u0001:'\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001&+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOP¨\u0006Q"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Start", "SplashL0", "SplashL2", "SplashRetirement", "QuestionOptionExperience", "QuestionUnderstandSpread", "QuestionInvestmentAdvice", "QuestionFinancialRegulator", "Suitability", "InvestmentProfile", "Disclosure", "ApprovedTrades", "Success", "Failure", "EducationSpread", "EducationL3Strategies", "ReadyL3Upgrade", "UpsellAlert", "UpsellTradeOnExpiration", "UpsellAllSet", "End", "KnowledgeTestQuestionnaire", "ExperienceTestQuestionnaire", "InvestorProfile", "ReviewInvestorProfile", "EducationHome", "EducationStrategy", "EducationRisks", "EducationProfessionalTrader", "UkL3EducationHome", "UkL3EducationSpreadBenefits", "RhsgHome", "RhsgCompleteCarQuestionnaire", "ProfessionalTrader", "RhsgL2ApprovedTrades", "RhsgL3ApprovedTrades", "JaPendingApplication", "KnowledgeCheckNeeded", "Companion", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Disclosure;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationL3Strategies;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationProfessionalTrader;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationRisks;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationSpread;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationStrategy;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$End;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ExperienceTestQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Failure;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$InvestmentProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$InvestorProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$JaPendingApplication;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$KnowledgeCheckNeeded;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$KnowledgeTestQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ProfessionalTrader;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionFinancialRegulator;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionInvestmentAdvice;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionOptionExperience;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionUnderstandSpread;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ReadyL3Upgrade;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ReviewInvestorProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgCompleteCarQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgL2ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgL3ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashL0;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashL2;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashRetirement;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Start;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Success;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Suitability;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UkL3EducationHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UkL3EducationSpreadBenefits;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellAlert;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellAllSet;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellTradeOnExpiration;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ResponseMetadataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ResponseMetadataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResponseMetadataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Start;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/StartResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/StartResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/StartResponseMetadataDto;", "getValue", "()Loptions_product/service/StartResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Start extends ResponseMetadataDto {
            private final StartResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Start) && Intrinsics.areEqual(this.value, ((Start) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Start(value=" + this.value + ")";
            }

            public final StartResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(StartResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashL0;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/SplashL0ResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashL0ResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashL0ResponseMetadataDto;", "getValue", "()Loptions_product/service/SplashL0ResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashL0 extends ResponseMetadataDto {
            private final SplashL0ResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SplashL0) && Intrinsics.areEqual(this.value, ((SplashL0) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SplashL0(value=" + this.value + ")";
            }

            public final SplashL0ResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashL0(SplashL0ResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashL2;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/SplashL2ResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashL2ResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashL2ResponseMetadataDto;", "getValue", "()Loptions_product/service/SplashL2ResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashL2 extends ResponseMetadataDto {
            private final SplashL2ResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SplashL2) && Intrinsics.areEqual(this.value, ((SplashL2) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SplashL2(value=" + this.value + ")";
            }

            public final SplashL2ResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashL2(SplashL2ResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$SplashRetirement;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/SplashRetirementResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashRetirementResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashRetirementResponseMetadataDto;", "getValue", "()Loptions_product/service/SplashRetirementResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashRetirement extends ResponseMetadataDto {
            private final SplashRetirementResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SplashRetirement) && Intrinsics.areEqual(this.value, ((SplashRetirement) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SplashRetirement(value=" + this.value + ")";
            }

            public final SplashRetirementResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashRetirement(SplashRetirementResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionOptionExperience;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "getValue", "()Loptions_product/service/QuestionOptionExperienceResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionOptionExperience extends ResponseMetadataDto {
            private final QuestionOptionExperienceResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuestionOptionExperience) && Intrinsics.areEqual(this.value, ((QuestionOptionExperience) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "QuestionOptionExperience(value=" + this.value + ")";
            }

            public final QuestionOptionExperienceResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionOptionExperience(QuestionOptionExperienceResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionUnderstandSpread;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "getValue", "()Loptions_product/service/QuestionUnderstandSpreadResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionUnderstandSpread extends ResponseMetadataDto {
            private final QuestionUnderstandSpreadResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuestionUnderstandSpread) && Intrinsics.areEqual(this.value, ((QuestionUnderstandSpread) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "QuestionUnderstandSpread(value=" + this.value + ")";
            }

            public final QuestionUnderstandSpreadResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionUnderstandSpread(QuestionUnderstandSpreadResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionInvestmentAdvice;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "getValue", "()Loptions_product/service/QuestionInvestmentAdviceResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionInvestmentAdvice extends ResponseMetadataDto {
            private final QuestionInvestmentAdviceResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuestionInvestmentAdvice) && Intrinsics.areEqual(this.value, ((QuestionInvestmentAdvice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "QuestionInvestmentAdvice(value=" + this.value + ")";
            }

            public final QuestionInvestmentAdviceResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionInvestmentAdvice(QuestionInvestmentAdviceResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$QuestionFinancialRegulator;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "getValue", "()Loptions_product/service/QuestionFinancialRegulatorResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionFinancialRegulator extends ResponseMetadataDto {
            private final QuestionFinancialRegulatorResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuestionFinancialRegulator) && Intrinsics.areEqual(this.value, ((QuestionFinancialRegulator) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "QuestionFinancialRegulator(value=" + this.value + ")";
            }

            public final QuestionFinancialRegulatorResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionFinancialRegulator(QuestionFinancialRegulatorResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Suitability;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/SuitabilityResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/SuitabilityResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SuitabilityResponseMetadataDto;", "getValue", "()Loptions_product/service/SuitabilityResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Suitability extends ResponseMetadataDto {
            private final SuitabilityResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Suitability) && Intrinsics.areEqual(this.value, ((Suitability) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Suitability(value=" + this.value + ")";
            }

            public final SuitabilityResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Suitability(SuitabilityResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$InvestmentProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/InvestmentProfileResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/InvestmentProfileResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/InvestmentProfileResponseMetadataDto;", "getValue", "()Loptions_product/service/InvestmentProfileResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvestmentProfile extends ResponseMetadataDto {
            private final InvestmentProfileResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvestmentProfile) && Intrinsics.areEqual(this.value, ((InvestmentProfile) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvestmentProfile(value=" + this.value + ")";
            }

            public final InvestmentProfileResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestmentProfile(InvestmentProfileResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Disclosure;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/DisclosureResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/DisclosureResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/DisclosureResponseMetadataDto;", "getValue", "()Loptions_product/service/DisclosureResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Disclosure extends ResponseMetadataDto {
            private final DisclosureResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Disclosure) && Intrinsics.areEqual(this.value, ((Disclosure) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Disclosure(value=" + this.value + ")";
            }

            public final DisclosureResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disclosure(DisclosureResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/ApprovedTradesResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "getValue", "()Loptions_product/service/ApprovedTradesResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ApprovedTrades extends ResponseMetadataDto {
            private final ApprovedTradesResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApprovedTrades) && Intrinsics.areEqual(this.value, ((ApprovedTrades) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ApprovedTrades(value=" + this.value + ")";
            }

            public final ApprovedTradesResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApprovedTrades(ApprovedTradesResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Success;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/SuccessResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/SuccessResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SuccessResponseMetadataDto;", "getValue", "()Loptions_product/service/SuccessResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ResponseMetadataDto {
            private final SuccessResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Success(value=" + this.value + ")";
            }

            public final SuccessResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(SuccessResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Failure;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/FailureResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/FailureResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/FailureResponseMetadataDto;", "getValue", "()Loptions_product/service/FailureResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends ResponseMetadataDto {
            private final FailureResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.value, ((Failure) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Failure(value=" + this.value + ")";
            }

            public final FailureResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(FailureResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationSpread;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/EducationSpreadResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/EducationSpreadResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EducationSpreadResponseMetadataDto;", "getValue", "()Loptions_product/service/EducationSpreadResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationSpread extends ResponseMetadataDto {
            private final EducationSpreadResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationSpread) && Intrinsics.areEqual(this.value, ((EducationSpread) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationSpread(value=" + this.value + ")";
            }

            public final EducationSpreadResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationSpread(EducationSpreadResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationL3Strategies;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/EducationL3StrategiesResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "getValue", "()Loptions_product/service/EducationL3StrategiesResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationL3Strategies extends ResponseMetadataDto {
            private final EducationL3StrategiesResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationL3Strategies) && Intrinsics.areEqual(this.value, ((EducationL3Strategies) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationL3Strategies(value=" + this.value + ")";
            }

            public final EducationL3StrategiesResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationL3Strategies(EducationL3StrategiesResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ReadyL3Upgrade;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "getValue", "()Loptions_product/service/ReadyL3UpgradeResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReadyL3Upgrade extends ResponseMetadataDto {
            private final ReadyL3UpgradeResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReadyL3Upgrade) && Intrinsics.areEqual(this.value, ((ReadyL3Upgrade) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReadyL3Upgrade(value=" + this.value + ")";
            }

            public final ReadyL3UpgradeResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadyL3Upgrade(ReadyL3UpgradeResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellAlert;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UpsellAlertResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellAlertResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellAlertResponseMetadataDto;", "getValue", "()Loptions_product/service/UpsellAlertResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellAlert extends ResponseMetadataDto {
            private final UpsellAlertResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpsellAlert) && Intrinsics.areEqual(this.value, ((UpsellAlert) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UpsellAlert(value=" + this.value + ")";
            }

            public final UpsellAlertResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellAlert(UpsellAlertResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellTradeOnExpiration;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "getValue", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellTradeOnExpiration extends ResponseMetadataDto {
            private final UpsellTradeOnExpirationResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpsellTradeOnExpiration) && Intrinsics.areEqual(this.value, ((UpsellTradeOnExpiration) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UpsellTradeOnExpiration(value=" + this.value + ")";
            }

            public final UpsellTradeOnExpirationResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellTradeOnExpiration(UpsellTradeOnExpirationResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UpsellAllSet;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UpsellAllSetResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellAllSetResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellAllSetResponseMetadataDto;", "getValue", "()Loptions_product/service/UpsellAllSetResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellAllSet extends ResponseMetadataDto {
            private final UpsellAllSetResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpsellAllSet) && Intrinsics.areEqual(this.value, ((UpsellAllSet) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UpsellAllSet(value=" + this.value + ")";
            }

            public final UpsellAllSetResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellAllSet(UpsellAllSetResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$End;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/EndResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/EndResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EndResponseMetadataDto;", "getValue", "()Loptions_product/service/EndResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class End extends ResponseMetadataDto {
            private final EndResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof End) && Intrinsics.areEqual(this.value, ((End) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "End(value=" + this.value + ")";
            }

            public final EndResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public End(EndResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$KnowledgeTestQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "getValue", "()Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KnowledgeTestQuestionnaire extends ResponseMetadataDto {
            private final KnowledgeTestQuestionnaireResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KnowledgeTestQuestionnaire) && Intrinsics.areEqual(this.value, ((KnowledgeTestQuestionnaire) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KnowledgeTestQuestionnaire(value=" + this.value + ")";
            }

            public final KnowledgeTestQuestionnaireResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KnowledgeTestQuestionnaire(KnowledgeTestQuestionnaireResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ExperienceTestQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "getValue", "()Loptions_product/service/ExperienceTestQuestionnaireResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExperienceTestQuestionnaire extends ResponseMetadataDto {
            private final ExperienceTestQuestionnaireResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExperienceTestQuestionnaire) && Intrinsics.areEqual(this.value, ((ExperienceTestQuestionnaire) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExperienceTestQuestionnaire(value=" + this.value + ")";
            }

            public final ExperienceTestQuestionnaireResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExperienceTestQuestionnaire(ExperienceTestQuestionnaireResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$InvestorProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/InvestorProfileV2ResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "getValue", "()Loptions_product/service/InvestorProfileV2ResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvestorProfile extends ResponseMetadataDto {
            private final InvestorProfileV2ResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvestorProfile) && Intrinsics.areEqual(this.value, ((InvestorProfile) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvestorProfile(value=" + this.value + ")";
            }

            public final InvestorProfileV2ResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestorProfile(InvestorProfileV2ResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ReviewInvestorProfile;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "getValue", "()Loptions_product/service/ReviewInvestorProfileV2ResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReviewInvestorProfile extends ResponseMetadataDto {
            private final ReviewInvestorProfileV2ResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReviewInvestorProfile) && Intrinsics.areEqual(this.value, ((ReviewInvestorProfile) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReviewInvestorProfile(value=" + this.value + ")";
            }

            public final ReviewInvestorProfileV2ResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReviewInvestorProfile(ReviewInvestorProfileV2ResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKEducationHomeResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationHomeResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationHomeResponseMetadataDto;", "getValue", "()Loptions_product/service/UKEducationHomeResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationHome extends ResponseMetadataDto {
            private final UKEducationHomeResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationHome) && Intrinsics.areEqual(this.value, ((EducationHome) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationHome(value=" + this.value + ")";
            }

            public final UKEducationHomeResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationHome(UKEducationHomeResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationStrategy;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationStrategyResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "getValue", "()Loptions_product/service/UKEducationStrategyResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationStrategy extends ResponseMetadataDto {
            private final UKEducationStrategyResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationStrategy) && Intrinsics.areEqual(this.value, ((EducationStrategy) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationStrategy(value=" + this.value + ")";
            }

            public final UKEducationStrategyResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationStrategy(UKEducationStrategyResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationRisks;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKEducationRisksResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationRisksResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationRisksResponseMetadataDto;", "getValue", "()Loptions_product/service/UKEducationRisksResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationRisks extends ResponseMetadataDto {
            private final UKEducationRisksResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationRisks) && Intrinsics.areEqual(this.value, ((EducationRisks) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationRisks(value=" + this.value + ")";
            }

            public final UKEducationRisksResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationRisks(UKEducationRisksResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$EducationProfessionalTrader;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "getValue", "()Loptions_product/service/UKEducationProfessionalTraderResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationProfessionalTrader extends ResponseMetadataDto {
            private final UKEducationProfessionalTraderResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EducationProfessionalTrader) && Intrinsics.areEqual(this.value, ((EducationProfessionalTrader) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EducationProfessionalTrader(value=" + this.value + ")";
            }

            public final UKEducationProfessionalTraderResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationProfessionalTrader(UKEducationProfessionalTraderResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UkL3EducationHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKL3EducationHomeResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "getValue", "()Loptions_product/service/UKL3EducationHomeResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UkL3EducationHome extends ResponseMetadataDto {
            private final UKL3EducationHomeResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UkL3EducationHome) && Intrinsics.areEqual(this.value, ((UkL3EducationHome) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UkL3EducationHome(value=" + this.value + ")";
            }

            public final UKL3EducationHomeResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UkL3EducationHome(UKL3EducationHomeResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$UkL3EducationSpreadBenefits;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "getValue", "()Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UkL3EducationSpreadBenefits extends ResponseMetadataDto {
            private final UKL3EducationSpreadBenefitsResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UkL3EducationSpreadBenefits) && Intrinsics.areEqual(this.value, ((UkL3EducationSpreadBenefits) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UkL3EducationSpreadBenefits(value=" + this.value + ")";
            }

            public final UKL3EducationSpreadBenefitsResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UkL3EducationSpreadBenefits(UKL3EducationSpreadBenefitsResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgHome;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/RHSGHomeResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGHomeResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGHomeResponseMetadataDto;", "getValue", "()Loptions_product/service/RHSGHomeResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgHome extends ResponseMetadataDto {
            private final RHSGHomeResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RhsgHome) && Intrinsics.areEqual(this.value, ((RhsgHome) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RhsgHome(value=" + this.value + ")";
            }

            public final RHSGHomeResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgHome(RHSGHomeResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgCompleteCarQuestionnaire;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "getValue", "()Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgCompleteCarQuestionnaire extends ResponseMetadataDto {
            private final RHSGCompleteCARQuestionnaireResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RhsgCompleteCarQuestionnaire) && Intrinsics.areEqual(this.value, ((RhsgCompleteCarQuestionnaire) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RhsgCompleteCarQuestionnaire(value=" + this.value + ")";
            }

            public final RHSGCompleteCARQuestionnaireResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgCompleteCarQuestionnaire(RHSGCompleteCARQuestionnaireResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$ProfessionalTrader;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/ProfessionalTraderResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "getValue", "()Loptions_product/service/ProfessionalTraderResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class ProfessionalTrader extends ResponseMetadataDto {
            private final ProfessionalTraderResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProfessionalTrader) && Intrinsics.areEqual(this.value, ((ProfessionalTrader) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ProfessionalTrader(value=" + this.value + ")";
            }

            public final ProfessionalTraderResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProfessionalTrader(ProfessionalTraderResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgL2ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "getValue", "()Loptions_product/service/RHSGL2ApprovedTradesResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgL2ApprovedTrades extends ResponseMetadataDto {
            private final RHSGL2ApprovedTradesResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RhsgL2ApprovedTrades) && Intrinsics.areEqual(this.value, ((RhsgL2ApprovedTrades) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RhsgL2ApprovedTrades(value=" + this.value + ")";
            }

            public final RHSGL2ApprovedTradesResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgL2ApprovedTrades(RHSGL2ApprovedTradesResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$RhsgL3ApprovedTrades;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "getValue", "()Loptions_product/service/RHSGL3ApprovedTradesResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgL3ApprovedTrades extends ResponseMetadataDto {
            private final RHSGL3ApprovedTradesResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RhsgL3ApprovedTrades) && Intrinsics.areEqual(this.value, ((RhsgL3ApprovedTrades) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RhsgL3ApprovedTrades(value=" + this.value + ")";
            }

            public final RHSGL3ApprovedTradesResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgL3ApprovedTrades(RHSGL3ApprovedTradesResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$JaPendingApplication;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "getValue", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class JaPendingApplication extends ResponseMetadataDto {
            private final JAPendingApplicationResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof JaPendingApplication) && Intrinsics.areEqual(this.value, ((JaPendingApplication) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "JaPendingApplication(value=" + this.value + ")";
            }

            public final JAPendingApplicationResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JaPendingApplication(JAPendingApplicationResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$KnowledgeCheckNeeded;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "value", "<init>", "(Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "getValue", "()Loptions_product/service/KnowledgeCheckNeededResponseMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class KnowledgeCheckNeeded extends ResponseMetadataDto {
            private final KnowledgeCheckNeededResponseMetadataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KnowledgeCheckNeeded) && Intrinsics.areEqual(this.value, ((KnowledgeCheckNeeded) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KnowledgeCheckNeeded(value=" + this.value + ")";
            }

            public final KnowledgeCheckNeededResponseMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KnowledgeCheckNeeded(KnowledgeCheckNeededResponseMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Loptions_product/service/OnboardingScreenResponseDto$ResponseMetadataDto;", "Loptions_product/service/OnboardingScreenResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto4.Creator<ResponseMetadataDto, OnboardingScreenResponse> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OnboardingScreenResponse> getProtoAdapter() {
                return OnboardingScreenResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponseMetadataDto fromProto(OnboardingScreenResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getStart() != null) {
                    return new Start(StartResponseMetadataDto.INSTANCE.fromProto(proto.getStart()));
                }
                if (proto.getSplash_l0() != null) {
                    return new SplashL0(SplashL0ResponseMetadataDto.INSTANCE.fromProto(proto.getSplash_l0()));
                }
                if (proto.getSplash_l2() != null) {
                    return new SplashL2(SplashL2ResponseMetadataDto.INSTANCE.fromProto(proto.getSplash_l2()));
                }
                if (proto.getSplash_retirement() != null) {
                    return new SplashRetirement(SplashRetirementResponseMetadataDto.INSTANCE.fromProto(proto.getSplash_retirement()));
                }
                if (proto.getQuestion_option_experience() != null) {
                    return new QuestionOptionExperience(QuestionOptionExperienceResponseMetadataDto.INSTANCE.fromProto(proto.getQuestion_option_experience()));
                }
                if (proto.getQuestion_understand_spread() != null) {
                    return new QuestionUnderstandSpread(QuestionUnderstandSpreadResponseMetadataDto.INSTANCE.fromProto(proto.getQuestion_understand_spread()));
                }
                if (proto.getQuestion_investment_advice() != null) {
                    return new QuestionInvestmentAdvice(QuestionInvestmentAdviceResponseMetadataDto.INSTANCE.fromProto(proto.getQuestion_investment_advice()));
                }
                if (proto.getQuestion_financial_regulator() != null) {
                    return new QuestionFinancialRegulator(QuestionFinancialRegulatorResponseMetadataDto.INSTANCE.fromProto(proto.getQuestion_financial_regulator()));
                }
                if (proto.getSuitability() != null) {
                    return new Suitability(SuitabilityResponseMetadataDto.INSTANCE.fromProto(proto.getSuitability()));
                }
                if (proto.getInvestment_profile() != null) {
                    return new InvestmentProfile(InvestmentProfileResponseMetadataDto.INSTANCE.fromProto(proto.getInvestment_profile()));
                }
                if (proto.getDisclosure() != null) {
                    return new Disclosure(DisclosureResponseMetadataDto.INSTANCE.fromProto(proto.getDisclosure()));
                }
                if (proto.getApproved_trades() != null) {
                    return new ApprovedTrades(ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(proto.getApproved_trades()));
                }
                if (proto.getSuccess() != null) {
                    return new Success(SuccessResponseMetadataDto.INSTANCE.fromProto(proto.getSuccess()));
                }
                if (proto.getFailure() != null) {
                    return new Failure(FailureResponseMetadataDto.INSTANCE.fromProto(proto.getFailure()));
                }
                if (proto.getEducation_spread() != null) {
                    return new EducationSpread(EducationSpreadResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_spread()));
                }
                if (proto.getEducation_l3_strategies() != null) {
                    return new EducationL3Strategies(EducationL3StrategiesResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_l3_strategies()));
                }
                if (proto.getReady_l3_upgrade() != null) {
                    return new ReadyL3Upgrade(ReadyL3UpgradeResponseMetadataDto.INSTANCE.fromProto(proto.getReady_l3_upgrade()));
                }
                if (proto.getUpsell_alert() != null) {
                    return new UpsellAlert(UpsellAlertResponseMetadataDto.INSTANCE.fromProto(proto.getUpsell_alert()));
                }
                if (proto.getUpsell_trade_on_expiration() != null) {
                    return new UpsellTradeOnExpiration(UpsellTradeOnExpirationResponseMetadataDto.INSTANCE.fromProto(proto.getUpsell_trade_on_expiration()));
                }
                if (proto.getUpsell_all_set() != null) {
                    return new UpsellAllSet(UpsellAllSetResponseMetadataDto.INSTANCE.fromProto(proto.getUpsell_all_set()));
                }
                if (proto.getEnd() != null) {
                    return new End(EndResponseMetadataDto.INSTANCE.fromProto(proto.getEnd()));
                }
                if (proto.getKnowledge_test_questionnaire() != null) {
                    return new KnowledgeTestQuestionnaire(KnowledgeTestQuestionnaireResponseMetadataDto.INSTANCE.fromProto(proto.getKnowledge_test_questionnaire()));
                }
                if (proto.getExperience_test_questionnaire() != null) {
                    return new ExperienceTestQuestionnaire(ExperienceTestQuestionnaireResponseMetadataDto.INSTANCE.fromProto(proto.getExperience_test_questionnaire()));
                }
                if (proto.getInvestor_profile() != null) {
                    return new InvestorProfile(InvestorProfileV2ResponseMetadataDto.INSTANCE.fromProto(proto.getInvestor_profile()));
                }
                if (proto.getReview_investor_profile() != null) {
                    return new ReviewInvestorProfile(ReviewInvestorProfileV2ResponseMetadataDto.INSTANCE.fromProto(proto.getReview_investor_profile()));
                }
                if (proto.getEducation_home() != null) {
                    return new EducationHome(UKEducationHomeResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_home()));
                }
                if (proto.getEducation_strategy() != null) {
                    return new EducationStrategy(UKEducationStrategyResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_strategy()));
                }
                if (proto.getEducation_risks() != null) {
                    return new EducationRisks(UKEducationRisksResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_risks()));
                }
                if (proto.getEducation_professional_trader() != null) {
                    return new EducationProfessionalTrader(UKEducationProfessionalTraderResponseMetadataDto.INSTANCE.fromProto(proto.getEducation_professional_trader()));
                }
                if (proto.getUk_l3_education_home() != null) {
                    return new UkL3EducationHome(UKL3EducationHomeResponseMetadataDto.INSTANCE.fromProto(proto.getUk_l3_education_home()));
                }
                if (proto.getUk_l3_education_spread_benefits() != null) {
                    return new UkL3EducationSpreadBenefits(UKL3EducationSpreadBenefitsResponseMetadataDto.INSTANCE.fromProto(proto.getUk_l3_education_spread_benefits()));
                }
                if (proto.getRhsg_home() != null) {
                    return new RhsgHome(RHSGHomeResponseMetadataDto.INSTANCE.fromProto(proto.getRhsg_home()));
                }
                if (proto.getRhsg_complete_car_questionnaire() != null) {
                    return new RhsgCompleteCarQuestionnaire(RHSGCompleteCARQuestionnaireResponseMetadataDto.INSTANCE.fromProto(proto.getRhsg_complete_car_questionnaire()));
                }
                if (proto.getProfessional_trader() != null) {
                    return new ProfessionalTrader(ProfessionalTraderResponseMetadataDto.INSTANCE.fromProto(proto.getProfessional_trader()));
                }
                if (proto.getRhsg_l2_approved_trades() != null) {
                    return new RhsgL2ApprovedTrades(RHSGL2ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(proto.getRhsg_l2_approved_trades()));
                }
                if (proto.getRhsg_l3_approved_trades() != null) {
                    return new RhsgL3ApprovedTrades(RHSGL3ApprovedTradesResponseMetadataDto.INSTANCE.fromProto(proto.getRhsg_l3_approved_trades()));
                }
                if (proto.getJa_pending_application() != null) {
                    return new JaPendingApplication(JAPendingApplicationResponseMetadataDto.INSTANCE.fromProto(proto.getJa_pending_application()));
                }
                if (proto.getKnowledge_check_needed() != null) {
                    return new KnowledgeCheckNeeded(KnowledgeCheckNeededResponseMetadataDto.INSTANCE.fromProto(proto.getKnowledge_check_needed()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UPGRADE_PROGRESS_UNSPECIFIED", "IN_PROGRESS", "SUCCESS", "FAILURE", "ALREADY_HAS_OPTIONS_ACCESS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class UpgradeProgressDto implements Dto2<OnboardingScreenResponse.UpgradeProgress>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpgradeProgressDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<UpgradeProgressDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UpgradeProgressDto, OnboardingScreenResponse.UpgradeProgress>> binaryBase64Serializer$delegate;
        public static final UpgradeProgressDto UPGRADE_PROGRESS_UNSPECIFIED = new UPGRADE_PROGRESS_UNSPECIFIED("UPGRADE_PROGRESS_UNSPECIFIED", 0);
        public static final UpgradeProgressDto IN_PROGRESS = new IN_PROGRESS("IN_PROGRESS", 1);
        public static final UpgradeProgressDto SUCCESS = new SUCCESS("SUCCESS", 2);
        public static final UpgradeProgressDto FAILURE = new FAILURE("FAILURE", 3);
        public static final UpgradeProgressDto ALREADY_HAS_OPTIONS_ACCESS = new ALREADY_HAS_OPTIONS_ACCESS("ALREADY_HAS_OPTIONS_ACCESS", 4);

        private static final /* synthetic */ UpgradeProgressDto[] $values() {
            return new UpgradeProgressDto[]{UPGRADE_PROGRESS_UNSPECIFIED, IN_PROGRESS, SUCCESS, FAILURE, ALREADY_HAS_OPTIONS_ACCESS};
        }

        public /* synthetic */ UpgradeProgressDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<UpgradeProgressDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private UpgradeProgressDto(String str, int i) {
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/OnboardingScreenResponseDto.UpgradeProgressDto.UPGRADE_PROGRESS_UNSPECIFIED", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "toProto", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPGRADE_PROGRESS_UNSPECIFIED extends UpgradeProgressDto {
            UPGRADE_PROGRESS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OnboardingScreenResponse.UpgradeProgress toProto() {
                return OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED;
            }
        }

        static {
            UpgradeProgressDto[] upgradeProgressDtoArr$values = $values();
            $VALUES = upgradeProgressDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upgradeProgressDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.OnboardingScreenResponseDto$UpgradeProgressDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OnboardingScreenResponseDto.UpgradeProgressDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/OnboardingScreenResponseDto.UpgradeProgressDto.IN_PROGRESS", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "toProto", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IN_PROGRESS extends UpgradeProgressDto {
            IN_PROGRESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OnboardingScreenResponse.UpgradeProgress toProto() {
                return OnboardingScreenResponse.UpgradeProgress.IN_PROGRESS;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/OnboardingScreenResponseDto.UpgradeProgressDto.SUCCESS", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "toProto", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS extends UpgradeProgressDto {
            SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OnboardingScreenResponse.UpgradeProgress toProto() {
                return OnboardingScreenResponse.UpgradeProgress.SUCCESS;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/OnboardingScreenResponseDto.UpgradeProgressDto.FAILURE", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "toProto", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILURE extends UpgradeProgressDto {
            FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OnboardingScreenResponse.UpgradeProgress toProto() {
                return OnboardingScreenResponse.UpgradeProgress.FAILURE;
            }
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/OnboardingScreenResponseDto.UpgradeProgressDto.ALREADY_HAS_OPTIONS_ACCESS", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "toProto", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALREADY_HAS_OPTIONS_ACCESS extends UpgradeProgressDto {
            ALREADY_HAS_OPTIONS_ACCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OnboardingScreenResponse.UpgradeProgress toProto() {
                return OnboardingScreenResponse.UpgradeProgress.ALREADY_HAS_OPTIONS_ACCESS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<UpgradeProgressDto, OnboardingScreenResponse.UpgradeProgress> {

            /* compiled from: OnboardingScreenResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OnboardingScreenResponse.UpgradeProgress.values().length];
                    try {
                        iArr[OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OnboardingScreenResponse.UpgradeProgress.IN_PROGRESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OnboardingScreenResponse.UpgradeProgress.SUCCESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OnboardingScreenResponse.UpgradeProgress.FAILURE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OnboardingScreenResponse.UpgradeProgress.ALREADY_HAS_OPTIONS_ACCESS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UpgradeProgressDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpgradeProgressDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpgradeProgressDto> getBinaryBase64Serializer() {
                return (KSerializer) UpgradeProgressDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OnboardingScreenResponse.UpgradeProgress> getProtoAdapter() {
                return OnboardingScreenResponse.UpgradeProgress.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpgradeProgressDto getZeroValue() {
                return UpgradeProgressDto.UPGRADE_PROGRESS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpgradeProgressDto fromProto(OnboardingScreenResponse.UpgradeProgress proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return UpgradeProgressDto.UPGRADE_PROGRESS_UNSPECIFIED;
                }
                if (i == 2) {
                    return UpgradeProgressDto.IN_PROGRESS;
                }
                if (i == 3) {
                    return UpgradeProgressDto.SUCCESS;
                }
                if (i == 4) {
                    return UpgradeProgressDto.FAILURE;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return UpgradeProgressDto.ALREADY_HAS_OPTIONS_ACCESS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OnboardingScreenResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<UpgradeProgressDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<UpgradeProgressDto, OnboardingScreenResponse.UpgradeProgress> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.OnboardingScreenResponse.UpgradeProgress", UpgradeProgressDto.getEntries(), UpgradeProgressDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public UpgradeProgressDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (UpgradeProgressDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UpgradeProgressDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static UpgradeProgressDto valueOf(String str) {
            return (UpgradeProgressDto) Enum.valueOf(UpgradeProgressDto.class, str);
        }

        public static UpgradeProgressDto[] values() {
            return (UpgradeProgressDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OnboardingScreenResponseDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/OnboardingScreenResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OnboardingScreenResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.OnboardingScreenResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OnboardingScreenResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OnboardingScreenResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OnboardingScreenResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OnboardingScreenResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "options_product.service.OnboardingScreenResponseDto";
        }
    }
}
