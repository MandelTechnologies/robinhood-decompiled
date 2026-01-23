package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import options_product.service.ApprovedTradesRequestMetadataDto;
import options_product.service.DisclosureRequestMetadataDto;
import options_product.service.EducationL3StrategiesRequestMetadataDto;
import options_product.service.EducationSpreadRequestMetadataDto;
import options_product.service.EndRequestMetadataDto;
import options_product.service.ExperienceTestQuestionnaireRequestMetadataDto;
import options_product.service.FailureRequestMetadataDto;
import options_product.service.InvestmentProfileRequestMetadataDto;
import options_product.service.InvestorProfileV2RequestMetadataDto;
import options_product.service.JAPendingApplicationMetadataDto;
import options_product.service.KnowledgeCheckNeededRequestMetadataDto;
import options_product.service.KnowledgeTestQuestionnaireRequestMetadataDto;
import options_product.service.ProfessionalTraderRequestMetadataDto;
import options_product.service.QuestionFinancialRegulatorRequestMetadataDto;
import options_product.service.QuestionInvestmentAdviceRequestMetadataDto;
import options_product.service.QuestionOptionExperienceRequestMetadataDto;
import options_product.service.QuestionUnderstandSpreadRequestMetadataDto;
import options_product.service.RHSGCompleteCARQuestionnaireRequestMetadataDto;
import options_product.service.RHSGHomeRequestMetadataDto;
import options_product.service.RHSGL2ApprovedTradesRequestMetadataDto;
import options_product.service.RHSGL3ApprovedTradesRequestMetadataDto;
import options_product.service.ReadyL3UpgradeRequestMetadataDto;
import options_product.service.ReviewInvestorProfileV2RequestMetadataDto;
import options_product.service.SplashL0RequestMetadataDto;
import options_product.service.SplashL2RequestMetadataDto;
import options_product.service.SplashRetirementRequestMetadataDto;
import options_product.service.StartRequestMetadataDto;
import options_product.service.SuccessRequestMetadataDto;
import options_product.service.SuitabilityRequestMetadataDto;
import options_product.service.UKEducationHomeRequestMetadataDto;
import options_product.service.UKEducationProfessionalTraderRequestMetadataDto;
import options_product.service.UKEducationRisksRequestMetadataDto;
import options_product.service.UKEducationStrategyRequestMetadataDto;
import options_product.service.UKL3EducationHomeRequestMetadataDto;
import options_product.service.UKL3EducationSpreadBenefitsRequestMetadataDto;
import options_product.service.UpsellAlertRequestMetadataDto;
import options_product.service.UpsellAllSetRequestMetadataDto;
import options_product.service.UpsellTradeOnExpirationRequestMetadataDto;

/* compiled from: OnboardingScreenRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/OnboardingScreenRequest;", "Landroid/os/Parcelable;", "Loptions_product/service/OnboardingScreenRequestDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/OnboardingScreenRequestDto$Surrogate;)V", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "request_metadata", "(Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;)V", "toProto", "()Loptions_product/service/OnboardingScreenRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/OnboardingScreenRequestDto$Surrogate;", "Companion", "Surrogate", "RequestMetadataDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class OnboardingScreenRequestDto implements Dto3<OnboardingScreenRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OnboardingScreenRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OnboardingScreenRequestDto, OnboardingScreenRequest>> binaryBase64Serializer$delegate;
    private static final OnboardingScreenRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OnboardingScreenRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OnboardingScreenRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public OnboardingScreenRequestDto(options_product.service.OnboardingScreenRequestDto.RequestMetadataDto r42) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: options_product.service.OnboardingScreenRequestDto.<init>(options_product.service.OnboardingScreenRequestDto$RequestMetadataDto):void");
    }

    public /* synthetic */ OnboardingScreenRequestDto(RequestMetadataDto requestMetadataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMetadataDto);
    }

    @Override // com.robinhood.idl.Dto
    public OnboardingScreenRequest toProto() {
        StartRequestMetadataDto start = this.surrogate.getStart();
        StartRequestMetadata proto = start != null ? start.toProto() : null;
        SplashL0RequestMetadataDto splash_l0 = this.surrogate.getSplash_l0();
        SplashL0RequestMetadata proto2 = splash_l0 != null ? splash_l0.toProto() : null;
        SplashL2RequestMetadataDto splash_l2 = this.surrogate.getSplash_l2();
        SplashL2RequestMetadata proto3 = splash_l2 != null ? splash_l2.toProto() : null;
        SplashRetirementRequestMetadataDto splash_retirement = this.surrogate.getSplash_retirement();
        SplashRetirementRequestMetadata proto4 = splash_retirement != null ? splash_retirement.toProto() : null;
        QuestionOptionExperienceRequestMetadataDto question_option_experience = this.surrogate.getQuestion_option_experience();
        QuestionOptionExperienceRequestMetadata proto5 = question_option_experience != null ? question_option_experience.toProto() : null;
        QuestionUnderstandSpreadRequestMetadataDto question_understand_spread = this.surrogate.getQuestion_understand_spread();
        QuestionUnderstandSpreadRequestMetadata proto6 = question_understand_spread != null ? question_understand_spread.toProto() : null;
        QuestionInvestmentAdviceRequestMetadataDto question_investment_advice = this.surrogate.getQuestion_investment_advice();
        QuestionInvestmentAdviceRequestMetadata proto7 = question_investment_advice != null ? question_investment_advice.toProto() : null;
        QuestionFinancialRegulatorRequestMetadataDto question_financial_regulator = this.surrogate.getQuestion_financial_regulator();
        QuestionFinancialRegulatorRequestMetadata proto8 = question_financial_regulator != null ? question_financial_regulator.toProto() : null;
        SuitabilityRequestMetadataDto suitability = this.surrogate.getSuitability();
        SuitabilityRequestMetadata proto9 = suitability != null ? suitability.toProto() : null;
        InvestmentProfileRequestMetadataDto investment_profile = this.surrogate.getInvestment_profile();
        InvestmentProfileRequestMetadata proto10 = investment_profile != null ? investment_profile.toProto() : null;
        DisclosureRequestMetadataDto disclosure = this.surrogate.getDisclosure();
        DisclosureRequestMetadata proto11 = disclosure != null ? disclosure.toProto() : null;
        ApprovedTradesRequestMetadataDto approved_trades = this.surrogate.getApproved_trades();
        ApprovedTradesRequestMetadata proto12 = approved_trades != null ? approved_trades.toProto() : null;
        SuccessRequestMetadataDto success = this.surrogate.getSuccess();
        SuccessRequestMetadata proto13 = success != null ? success.toProto() : null;
        FailureRequestMetadataDto failure = this.surrogate.getFailure();
        FailureRequestMetadata proto14 = failure != null ? failure.toProto() : null;
        EducationSpreadRequestMetadataDto education_spread = this.surrogate.getEducation_spread();
        EducationSpreadRequestMetadata proto15 = education_spread != null ? education_spread.toProto() : null;
        EducationL3StrategiesRequestMetadataDto education_l3_strategies = this.surrogate.getEducation_l3_strategies();
        EducationL3StrategiesRequestMetadata proto16 = education_l3_strategies != null ? education_l3_strategies.toProto() : null;
        ReadyL3UpgradeRequestMetadataDto ready_l3_upgrade = this.surrogate.getReady_l3_upgrade();
        ReadyL3UpgradeRequestMetadata proto17 = ready_l3_upgrade != null ? ready_l3_upgrade.toProto() : null;
        UpsellAlertRequestMetadataDto upsell_alert = this.surrogate.getUpsell_alert();
        UpsellAlertRequestMetadata proto18 = upsell_alert != null ? upsell_alert.toProto() : null;
        UpsellTradeOnExpirationRequestMetadataDto upsell_trade_on_expiration = this.surrogate.getUpsell_trade_on_expiration();
        UpsellTradeOnExpirationRequestMetadata proto19 = upsell_trade_on_expiration != null ? upsell_trade_on_expiration.toProto() : null;
        UpsellAllSetRequestMetadataDto upsell_all_set = this.surrogate.getUpsell_all_set();
        UpsellAllSetRequestMetadata proto20 = upsell_all_set != null ? upsell_all_set.toProto() : null;
        EndRequestMetadataDto end = this.surrogate.getEnd();
        EndRequestMetadata proto21 = end != null ? end.toProto() : null;
        ExperienceTestQuestionnaireRequestMetadataDto experience_test_questionnaire = this.surrogate.getExperience_test_questionnaire();
        ExperienceTestQuestionnaireRequestMetadata proto22 = experience_test_questionnaire != null ? experience_test_questionnaire.toProto() : null;
        KnowledgeTestQuestionnaireRequestMetadataDto knowledge_test_questionnaire = this.surrogate.getKnowledge_test_questionnaire();
        KnowledgeTestQuestionnaireRequestMetadata proto23 = knowledge_test_questionnaire != null ? knowledge_test_questionnaire.toProto() : null;
        InvestorProfileV2RequestMetadataDto investor_profile = this.surrogate.getInvestor_profile();
        InvestorProfileV2RequestMetadata proto24 = investor_profile != null ? investor_profile.toProto() : null;
        ReviewInvestorProfileV2RequestMetadataDto review_investor_profile = this.surrogate.getReview_investor_profile();
        ReviewInvestorProfileV2RequestMetadata proto25 = review_investor_profile != null ? review_investor_profile.toProto() : null;
        UKEducationHomeRequestMetadataDto education_home = this.surrogate.getEducation_home();
        UKEducationHomeRequestMetadata proto26 = education_home != null ? education_home.toProto() : null;
        UKEducationStrategyRequestMetadataDto education_strategy = this.surrogate.getEducation_strategy();
        UKEducationStrategyRequestMetadata proto27 = education_strategy != null ? education_strategy.toProto() : null;
        UKEducationRisksRequestMetadataDto education_risks = this.surrogate.getEducation_risks();
        UKEducationRisksRequestMetadata proto28 = education_risks != null ? education_risks.toProto() : null;
        UKEducationProfessionalTraderRequestMetadataDto education_professional_trader = this.surrogate.getEducation_professional_trader();
        UKEducationProfessionalTraderRequestMetadata proto29 = education_professional_trader != null ? education_professional_trader.toProto() : null;
        UKL3EducationHomeRequestMetadataDto uk_l3_education_home = this.surrogate.getUk_l3_education_home();
        UKL3EducationHomeRequestMetadata proto30 = uk_l3_education_home != null ? uk_l3_education_home.toProto() : null;
        UKL3EducationSpreadBenefitsRequestMetadataDto uk_l3_education_spread_benefits = this.surrogate.getUk_l3_education_spread_benefits();
        UKL3EducationSpreadBenefitsRequestMetadata proto31 = uk_l3_education_spread_benefits != null ? uk_l3_education_spread_benefits.toProto() : null;
        RHSGHomeRequestMetadataDto rhsg_home = this.surrogate.getRhsg_home();
        RHSGHomeRequestMetadata proto32 = rhsg_home != null ? rhsg_home.toProto() : null;
        RHSGCompleteCARQuestionnaireRequestMetadataDto rhsg_complete_car_questionnaire = this.surrogate.getRhsg_complete_car_questionnaire();
        RHSGCompleteCARQuestionnaireRequestMetadata proto33 = rhsg_complete_car_questionnaire != null ? rhsg_complete_car_questionnaire.toProto() : null;
        ProfessionalTraderRequestMetadataDto professional_trader = this.surrogate.getProfessional_trader();
        ProfessionalTraderRequestMetadata proto34 = professional_trader != null ? professional_trader.toProto() : null;
        RHSGL2ApprovedTradesRequestMetadataDto rhsg_l2_approved_trades = this.surrogate.getRhsg_l2_approved_trades();
        RHSGL2ApprovedTradesRequestMetadata proto35 = rhsg_l2_approved_trades != null ? rhsg_l2_approved_trades.toProto() : null;
        RHSGL3ApprovedTradesRequestMetadataDto rhsg_l3_approved_trades = this.surrogate.getRhsg_l3_approved_trades();
        RHSGL3ApprovedTradesRequestMetadata proto36 = rhsg_l3_approved_trades != null ? rhsg_l3_approved_trades.toProto() : null;
        JAPendingApplicationMetadataDto ja_pending_application = this.surrogate.getJa_pending_application();
        JAPendingApplicationMetadata proto37 = ja_pending_application != null ? ja_pending_application.toProto() : null;
        KnowledgeCheckNeededRequestMetadataDto knowledge_check_needed = this.surrogate.getKnowledge_check_needed();
        return new OnboardingScreenRequest(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, proto28, proto29, proto30, proto31, proto32, proto33, proto34, proto35, proto36, proto37, knowledge_check_needed != null ? knowledge_check_needed.toProto() : null, null, 0, 64, null);
    }

    public String toString() {
        return "[OnboardingScreenRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OnboardingScreenRequestDto) && Intrinsics.areEqual(((OnboardingScreenRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: OnboardingScreenRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000£\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0003\b\u009e\u0001\b\u0083\b\u0018\u0000 \u0081\u00022\u00020\u0001:\u0004\u0082\u0002\u0081\u0002BÏ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OB\u009f\u0003\b\u0010\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010R\u001a\u00020P\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bN\u0010UJ'\u0010^\u001a\u00020[2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010`\u001a\u00020_HÖ\u0001¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020PHÖ\u0001¢\u0006\u0004\bb\u0010cJ\u001a\u0010f\u001a\u00020e2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bf\u0010gR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010h\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010jR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010m\u0012\u0004\bp\u0010l\u001a\u0004\bn\u0010oR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010q\u0012\u0004\bt\u0010l\u001a\u0004\br\u0010sR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010u\u0012\u0004\bx\u0010l\u001a\u0004\bv\u0010wR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010y\u0012\u0004\b|\u0010l\u001a\u0004\bz\u0010{R#\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\r\u0010}\u0012\u0005\b\u0080\u0001\u0010l\u001a\u0004\b~\u0010\u007fR&\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000f\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010l\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010l\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010\u0089\u0001\u0012\u0005\b\u008c\u0001\u0010l\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u008d\u0001\u0012\u0005\b\u0090\u0001\u0010l\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u0091\u0001\u0012\u0005\b\u0094\u0001\u0010l\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u0095\u0001\u0012\u0005\b\u0098\u0001\u0010l\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u0099\u0001\u0012\u0005\b\u009c\u0001\u0010l\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010\u009d\u0001\u0012\u0005\b \u0001\u0010l\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010¡\u0001\u0012\u0005\b¤\u0001\u0010l\u001a\u0006\b¢\u0001\u0010£\u0001R&\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010¥\u0001\u0012\u0005\b¨\u0001\u0010l\u001a\u0006\b¦\u0001\u0010§\u0001R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010©\u0001\u0012\u0005\b¬\u0001\u0010l\u001a\u0006\bª\u0001\u0010«\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010\u00ad\u0001\u0012\u0005\b°\u0001\u0010l\u001a\u0006\b®\u0001\u0010¯\u0001R&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010±\u0001\u0012\u0005\b´\u0001\u0010l\u001a\u0006\b²\u0001\u0010³\u0001R&\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010µ\u0001\u0012\u0005\b¸\u0001\u0010l\u001a\u0006\b¶\u0001\u0010·\u0001R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010¹\u0001\u0012\u0005\b¼\u0001\u0010l\u001a\u0006\bº\u0001\u0010»\u0001R&\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010½\u0001\u0012\u0005\bÀ\u0001\u0010l\u001a\u0006\b¾\u0001\u0010¿\u0001R&\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010Á\u0001\u0012\u0005\bÄ\u0001\u0010l\u001a\u0006\bÂ\u0001\u0010Ã\u0001R&\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010l\u001a\u0006\bÆ\u0001\u0010Ç\u0001R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010É\u0001\u0012\u0005\bÌ\u0001\u0010l\u001a\u0006\bÊ\u0001\u0010Ë\u0001R&\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010Í\u0001\u0012\u0005\bÐ\u0001\u0010l\u001a\u0006\bÎ\u0001\u0010Ï\u0001R&\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010Ñ\u0001\u0012\u0005\bÔ\u0001\u0010l\u001a\u0006\bÒ\u0001\u0010Ó\u0001R&\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b9\u0010Õ\u0001\u0012\u0005\bØ\u0001\u0010l\u001a\u0006\bÖ\u0001\u0010×\u0001R&\u0010;\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b;\u0010Ù\u0001\u0012\u0005\bÜ\u0001\u0010l\u001a\u0006\bÚ\u0001\u0010Û\u0001R&\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b=\u0010Ý\u0001\u0012\u0005\bà\u0001\u0010l\u001a\u0006\bÞ\u0001\u0010ß\u0001R&\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b?\u0010á\u0001\u0012\u0005\bä\u0001\u0010l\u001a\u0006\bâ\u0001\u0010ã\u0001R&\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010å\u0001\u0012\u0005\bè\u0001\u0010l\u001a\u0006\bæ\u0001\u0010ç\u0001R&\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bC\u0010é\u0001\u0012\u0005\bì\u0001\u0010l\u001a\u0006\bê\u0001\u0010ë\u0001R&\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010í\u0001\u0012\u0005\bð\u0001\u0010l\u001a\u0006\bî\u0001\u0010ï\u0001R&\u0010G\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bG\u0010ñ\u0001\u0012\u0005\bô\u0001\u0010l\u001a\u0006\bò\u0001\u0010ó\u0001R&\u0010I\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bI\u0010õ\u0001\u0012\u0005\bø\u0001\u0010l\u001a\u0006\bö\u0001\u0010÷\u0001R&\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bK\u0010ù\u0001\u0012\u0005\bü\u0001\u0010l\u001a\u0006\bú\u0001\u0010û\u0001R&\u0010M\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010ý\u0001\u0012\u0005\b\u0080\u0002\u0010l\u001a\u0006\bþ\u0001\u0010ÿ\u0001¨\u0006\u0083\u0002"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$Surrogate;", "", "Loptions_product/service/StartRequestMetadataDto;", "start", "Loptions_product/service/SplashL0RequestMetadataDto;", "splash_l0", "Loptions_product/service/SplashL2RequestMetadataDto;", "splash_l2", "Loptions_product/service/SplashRetirementRequestMetadataDto;", "splash_retirement", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "question_option_experience", "Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "question_understand_spread", "Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "question_investment_advice", "Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "question_financial_regulator", "Loptions_product/service/SuitabilityRequestMetadataDto;", QuestionnaireContexts.SUITABILITY, "Loptions_product/service/InvestmentProfileRequestMetadataDto;", "investment_profile", "Loptions_product/service/DisclosureRequestMetadataDto;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Loptions_product/service/ApprovedTradesRequestMetadataDto;", "approved_trades", "Loptions_product/service/SuccessRequestMetadataDto;", "success", "Loptions_product/service/FailureRequestMetadataDto;", "failure", "Loptions_product/service/EducationSpreadRequestMetadataDto;", "education_spread", "Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "education_l3_strategies", "Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "ready_l3_upgrade", "Loptions_product/service/UpsellAlertRequestMetadataDto;", "upsell_alert", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "upsell_trade_on_expiration", "Loptions_product/service/UpsellAllSetRequestMetadataDto;", "upsell_all_set", "Loptions_product/service/EndRequestMetadataDto;", "end", "Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "experience_test_questionnaire", "Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "knowledge_test_questionnaire", "Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "investor_profile", "Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "review_investor_profile", "Loptions_product/service/UKEducationHomeRequestMetadataDto;", "education_home", "Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "education_strategy", "Loptions_product/service/UKEducationRisksRequestMetadataDto;", "education_risks", "Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "education_professional_trader", "Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "uk_l3_education_home", "Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "uk_l3_education_spread_benefits", "Loptions_product/service/RHSGHomeRequestMetadataDto;", "rhsg_home", "Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "rhsg_complete_car_questionnaire", "Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "professional_trader", "Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "rhsg_l2_approved_trades", "Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "rhsg_l3_approved_trades", "Loptions_product/service/JAPendingApplicationMetadataDto;", "ja_pending_application", "Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "knowledge_check_needed", "<init>", "(Loptions_product/service/StartRequestMetadataDto;Loptions_product/service/SplashL0RequestMetadataDto;Loptions_product/service/SplashL2RequestMetadataDto;Loptions_product/service/SplashRetirementRequestMetadataDto;Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;Loptions_product/service/SuitabilityRequestMetadataDto;Loptions_product/service/InvestmentProfileRequestMetadataDto;Loptions_product/service/DisclosureRequestMetadataDto;Loptions_product/service/ApprovedTradesRequestMetadataDto;Loptions_product/service/SuccessRequestMetadataDto;Loptions_product/service/FailureRequestMetadataDto;Loptions_product/service/EducationSpreadRequestMetadataDto;Loptions_product/service/EducationL3StrategiesRequestMetadataDto;Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;Loptions_product/service/UpsellAlertRequestMetadataDto;Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;Loptions_product/service/UpsellAllSetRequestMetadataDto;Loptions_product/service/EndRequestMetadataDto;Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;Loptions_product/service/InvestorProfileV2RequestMetadataDto;Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;Loptions_product/service/UKEducationHomeRequestMetadataDto;Loptions_product/service/UKEducationStrategyRequestMetadataDto;Loptions_product/service/UKEducationRisksRequestMetadataDto;Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;Loptions_product/service/UKL3EducationHomeRequestMetadataDto;Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;Loptions_product/service/RHSGHomeRequestMetadataDto;Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;Loptions_product/service/ProfessionalTraderRequestMetadataDto;Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;Loptions_product/service/JAPendingApplicationMetadataDto;Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILoptions_product/service/StartRequestMetadataDto;Loptions_product/service/SplashL0RequestMetadataDto;Loptions_product/service/SplashL2RequestMetadataDto;Loptions_product/service/SplashRetirementRequestMetadataDto;Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;Loptions_product/service/SuitabilityRequestMetadataDto;Loptions_product/service/InvestmentProfileRequestMetadataDto;Loptions_product/service/DisclosureRequestMetadataDto;Loptions_product/service/ApprovedTradesRequestMetadataDto;Loptions_product/service/SuccessRequestMetadataDto;Loptions_product/service/FailureRequestMetadataDto;Loptions_product/service/EducationSpreadRequestMetadataDto;Loptions_product/service/EducationL3StrategiesRequestMetadataDto;Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;Loptions_product/service/UpsellAlertRequestMetadataDto;Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;Loptions_product/service/UpsellAllSetRequestMetadataDto;Loptions_product/service/EndRequestMetadataDto;Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;Loptions_product/service/InvestorProfileV2RequestMetadataDto;Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;Loptions_product/service/UKEducationHomeRequestMetadataDto;Loptions_product/service/UKEducationStrategyRequestMetadataDto;Loptions_product/service/UKEducationRisksRequestMetadataDto;Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;Loptions_product/service/UKL3EducationHomeRequestMetadataDto;Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;Loptions_product/service/RHSGHomeRequestMetadataDto;Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;Loptions_product/service/ProfessionalTraderRequestMetadataDto;Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;Loptions_product/service/JAPendingApplicationMetadataDto;Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/OnboardingScreenRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/StartRequestMetadataDto;", "getStart", "()Loptions_product/service/StartRequestMetadataDto;", "getStart$annotations", "()V", "Loptions_product/service/SplashL0RequestMetadataDto;", "getSplash_l0", "()Loptions_product/service/SplashL0RequestMetadataDto;", "getSplash_l0$annotations", "Loptions_product/service/SplashL2RequestMetadataDto;", "getSplash_l2", "()Loptions_product/service/SplashL2RequestMetadataDto;", "getSplash_l2$annotations", "Loptions_product/service/SplashRetirementRequestMetadataDto;", "getSplash_retirement", "()Loptions_product/service/SplashRetirementRequestMetadataDto;", "getSplash_retirement$annotations", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "getQuestion_option_experience", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "getQuestion_option_experience$annotations", "Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "getQuestion_understand_spread", "()Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "getQuestion_understand_spread$annotations", "Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "getQuestion_investment_advice", "()Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "getQuestion_investment_advice$annotations", "Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "getQuestion_financial_regulator", "()Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "getQuestion_financial_regulator$annotations", "Loptions_product/service/SuitabilityRequestMetadataDto;", "getSuitability", "()Loptions_product/service/SuitabilityRequestMetadataDto;", "getSuitability$annotations", "Loptions_product/service/InvestmentProfileRequestMetadataDto;", "getInvestment_profile", "()Loptions_product/service/InvestmentProfileRequestMetadataDto;", "getInvestment_profile$annotations", "Loptions_product/service/DisclosureRequestMetadataDto;", "getDisclosure", "()Loptions_product/service/DisclosureRequestMetadataDto;", "getDisclosure$annotations", "Loptions_product/service/ApprovedTradesRequestMetadataDto;", "getApproved_trades", "()Loptions_product/service/ApprovedTradesRequestMetadataDto;", "getApproved_trades$annotations", "Loptions_product/service/SuccessRequestMetadataDto;", "getSuccess", "()Loptions_product/service/SuccessRequestMetadataDto;", "getSuccess$annotations", "Loptions_product/service/FailureRequestMetadataDto;", "getFailure", "()Loptions_product/service/FailureRequestMetadataDto;", "getFailure$annotations", "Loptions_product/service/EducationSpreadRequestMetadataDto;", "getEducation_spread", "()Loptions_product/service/EducationSpreadRequestMetadataDto;", "getEducation_spread$annotations", "Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "getEducation_l3_strategies", "()Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "getEducation_l3_strategies$annotations", "Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "getReady_l3_upgrade", "()Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "getReady_l3_upgrade$annotations", "Loptions_product/service/UpsellAlertRequestMetadataDto;", "getUpsell_alert", "()Loptions_product/service/UpsellAlertRequestMetadataDto;", "getUpsell_alert$annotations", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "getUpsell_trade_on_expiration", "()Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "getUpsell_trade_on_expiration$annotations", "Loptions_product/service/UpsellAllSetRequestMetadataDto;", "getUpsell_all_set", "()Loptions_product/service/UpsellAllSetRequestMetadataDto;", "getUpsell_all_set$annotations", "Loptions_product/service/EndRequestMetadataDto;", "getEnd", "()Loptions_product/service/EndRequestMetadataDto;", "getEnd$annotations", "Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "getExperience_test_questionnaire", "()Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "getExperience_test_questionnaire$annotations", "Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "getKnowledge_test_questionnaire", "()Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "getKnowledge_test_questionnaire$annotations", "Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "getInvestor_profile", "()Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "getInvestor_profile$annotations", "Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "getReview_investor_profile", "()Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "getReview_investor_profile$annotations", "Loptions_product/service/UKEducationHomeRequestMetadataDto;", "getEducation_home", "()Loptions_product/service/UKEducationHomeRequestMetadataDto;", "getEducation_home$annotations", "Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "getEducation_strategy", "()Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "getEducation_strategy$annotations", "Loptions_product/service/UKEducationRisksRequestMetadataDto;", "getEducation_risks", "()Loptions_product/service/UKEducationRisksRequestMetadataDto;", "getEducation_risks$annotations", "Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "getEducation_professional_trader", "()Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "getEducation_professional_trader$annotations", "Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "getUk_l3_education_home", "()Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "getUk_l3_education_home$annotations", "Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "getUk_l3_education_spread_benefits", "()Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "getUk_l3_education_spread_benefits$annotations", "Loptions_product/service/RHSGHomeRequestMetadataDto;", "getRhsg_home", "()Loptions_product/service/RHSGHomeRequestMetadataDto;", "getRhsg_home$annotations", "Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "getRhsg_complete_car_questionnaire", "()Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "getRhsg_complete_car_questionnaire$annotations", "Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "getProfessional_trader", "()Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "getProfessional_trader$annotations", "Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "getRhsg_l2_approved_trades", "()Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "getRhsg_l2_approved_trades$annotations", "Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "getRhsg_l3_approved_trades", "()Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "getRhsg_l3_approved_trades$annotations", "Loptions_product/service/JAPendingApplicationMetadataDto;", "getJa_pending_application", "()Loptions_product/service/JAPendingApplicationMetadataDto;", "getJa_pending_application$annotations", "Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "getKnowledge_check_needed", "()Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "getKnowledge_check_needed$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApprovedTradesRequestMetadataDto approved_trades;
        private final DisclosureRequestMetadataDto disclosure;
        private final UKEducationHomeRequestMetadataDto education_home;
        private final EducationL3StrategiesRequestMetadataDto education_l3_strategies;
        private final UKEducationProfessionalTraderRequestMetadataDto education_professional_trader;
        private final UKEducationRisksRequestMetadataDto education_risks;
        private final EducationSpreadRequestMetadataDto education_spread;
        private final UKEducationStrategyRequestMetadataDto education_strategy;
        private final EndRequestMetadataDto end;
        private final ExperienceTestQuestionnaireRequestMetadataDto experience_test_questionnaire;
        private final FailureRequestMetadataDto failure;
        private final InvestmentProfileRequestMetadataDto investment_profile;
        private final InvestorProfileV2RequestMetadataDto investor_profile;
        private final JAPendingApplicationMetadataDto ja_pending_application;
        private final KnowledgeCheckNeededRequestMetadataDto knowledge_check_needed;
        private final KnowledgeTestQuestionnaireRequestMetadataDto knowledge_test_questionnaire;
        private final ProfessionalTraderRequestMetadataDto professional_trader;
        private final QuestionFinancialRegulatorRequestMetadataDto question_financial_regulator;
        private final QuestionInvestmentAdviceRequestMetadataDto question_investment_advice;
        private final QuestionOptionExperienceRequestMetadataDto question_option_experience;
        private final QuestionUnderstandSpreadRequestMetadataDto question_understand_spread;
        private final ReadyL3UpgradeRequestMetadataDto ready_l3_upgrade;
        private final ReviewInvestorProfileV2RequestMetadataDto review_investor_profile;
        private final RHSGCompleteCARQuestionnaireRequestMetadataDto rhsg_complete_car_questionnaire;
        private final RHSGHomeRequestMetadataDto rhsg_home;
        private final RHSGL2ApprovedTradesRequestMetadataDto rhsg_l2_approved_trades;
        private final RHSGL3ApprovedTradesRequestMetadataDto rhsg_l3_approved_trades;
        private final SplashL0RequestMetadataDto splash_l0;
        private final SplashL2RequestMetadataDto splash_l2;
        private final SplashRetirementRequestMetadataDto splash_retirement;
        private final StartRequestMetadataDto start;
        private final SuccessRequestMetadataDto success;
        private final SuitabilityRequestMetadataDto suitability;
        private final UKL3EducationHomeRequestMetadataDto uk_l3_education_home;
        private final UKL3EducationSpreadBenefitsRequestMetadataDto uk_l3_education_spread_benefits;
        private final UpsellAlertRequestMetadataDto upsell_alert;
        private final UpsellAllSetRequestMetadataDto upsell_all_set;
        private final UpsellTradeOnExpirationRequestMetadataDto upsell_trade_on_expiration;

        public Surrogate() {
            this((StartRequestMetadataDto) null, (SplashL0RequestMetadataDto) null, (SplashL2RequestMetadataDto) null, (SplashRetirementRequestMetadataDto) null, (QuestionOptionExperienceRequestMetadataDto) null, (QuestionUnderstandSpreadRequestMetadataDto) null, (QuestionInvestmentAdviceRequestMetadataDto) null, (QuestionFinancialRegulatorRequestMetadataDto) null, (SuitabilityRequestMetadataDto) null, (InvestmentProfileRequestMetadataDto) null, (DisclosureRequestMetadataDto) null, (ApprovedTradesRequestMetadataDto) null, (SuccessRequestMetadataDto) null, (FailureRequestMetadataDto) null, (EducationSpreadRequestMetadataDto) null, (EducationL3StrategiesRequestMetadataDto) null, (ReadyL3UpgradeRequestMetadataDto) null, (UpsellAlertRequestMetadataDto) null, (UpsellTradeOnExpirationRequestMetadataDto) null, (UpsellAllSetRequestMetadataDto) null, (EndRequestMetadataDto) null, (ExperienceTestQuestionnaireRequestMetadataDto) null, (KnowledgeTestQuestionnaireRequestMetadataDto) null, (InvestorProfileV2RequestMetadataDto) null, (ReviewInvestorProfileV2RequestMetadataDto) null, (UKEducationHomeRequestMetadataDto) null, (UKEducationStrategyRequestMetadataDto) null, (UKEducationRisksRequestMetadataDto) null, (UKEducationProfessionalTraderRequestMetadataDto) null, (UKL3EducationHomeRequestMetadataDto) null, (UKL3EducationSpreadBenefitsRequestMetadataDto) null, (RHSGHomeRequestMetadataDto) null, (RHSGCompleteCARQuestionnaireRequestMetadataDto) null, (ProfessionalTraderRequestMetadataDto) null, (RHSGL2ApprovedTradesRequestMetadataDto) null, (RHSGL3ApprovedTradesRequestMetadataDto) null, (JAPendingApplicationMetadataDto) null, (KnowledgeCheckNeededRequestMetadataDto) null, -1, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.start, surrogate.start) && Intrinsics.areEqual(this.splash_l0, surrogate.splash_l0) && Intrinsics.areEqual(this.splash_l2, surrogate.splash_l2) && Intrinsics.areEqual(this.splash_retirement, surrogate.splash_retirement) && Intrinsics.areEqual(this.question_option_experience, surrogate.question_option_experience) && Intrinsics.areEqual(this.question_understand_spread, surrogate.question_understand_spread) && Intrinsics.areEqual(this.question_investment_advice, surrogate.question_investment_advice) && Intrinsics.areEqual(this.question_financial_regulator, surrogate.question_financial_regulator) && Intrinsics.areEqual(this.suitability, surrogate.suitability) && Intrinsics.areEqual(this.investment_profile, surrogate.investment_profile) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && Intrinsics.areEqual(this.approved_trades, surrogate.approved_trades) && Intrinsics.areEqual(this.success, surrogate.success) && Intrinsics.areEqual(this.failure, surrogate.failure) && Intrinsics.areEqual(this.education_spread, surrogate.education_spread) && Intrinsics.areEqual(this.education_l3_strategies, surrogate.education_l3_strategies) && Intrinsics.areEqual(this.ready_l3_upgrade, surrogate.ready_l3_upgrade) && Intrinsics.areEqual(this.upsell_alert, surrogate.upsell_alert) && Intrinsics.areEqual(this.upsell_trade_on_expiration, surrogate.upsell_trade_on_expiration) && Intrinsics.areEqual(this.upsell_all_set, surrogate.upsell_all_set) && Intrinsics.areEqual(this.end, surrogate.end) && Intrinsics.areEqual(this.experience_test_questionnaire, surrogate.experience_test_questionnaire) && Intrinsics.areEqual(this.knowledge_test_questionnaire, surrogate.knowledge_test_questionnaire) && Intrinsics.areEqual(this.investor_profile, surrogate.investor_profile) && Intrinsics.areEqual(this.review_investor_profile, surrogate.review_investor_profile) && Intrinsics.areEqual(this.education_home, surrogate.education_home) && Intrinsics.areEqual(this.education_strategy, surrogate.education_strategy) && Intrinsics.areEqual(this.education_risks, surrogate.education_risks) && Intrinsics.areEqual(this.education_professional_trader, surrogate.education_professional_trader) && Intrinsics.areEqual(this.uk_l3_education_home, surrogate.uk_l3_education_home) && Intrinsics.areEqual(this.uk_l3_education_spread_benefits, surrogate.uk_l3_education_spread_benefits) && Intrinsics.areEqual(this.rhsg_home, surrogate.rhsg_home) && Intrinsics.areEqual(this.rhsg_complete_car_questionnaire, surrogate.rhsg_complete_car_questionnaire) && Intrinsics.areEqual(this.professional_trader, surrogate.professional_trader) && Intrinsics.areEqual(this.rhsg_l2_approved_trades, surrogate.rhsg_l2_approved_trades) && Intrinsics.areEqual(this.rhsg_l3_approved_trades, surrogate.rhsg_l3_approved_trades) && Intrinsics.areEqual(this.ja_pending_application, surrogate.ja_pending_application) && Intrinsics.areEqual(this.knowledge_check_needed, surrogate.knowledge_check_needed);
        }

        public int hashCode() {
            StartRequestMetadataDto startRequestMetadataDto = this.start;
            int iHashCode = (startRequestMetadataDto == null ? 0 : startRequestMetadataDto.hashCode()) * 31;
            SplashL0RequestMetadataDto splashL0RequestMetadataDto = this.splash_l0;
            int iHashCode2 = (iHashCode + (splashL0RequestMetadataDto == null ? 0 : splashL0RequestMetadataDto.hashCode())) * 31;
            SplashL2RequestMetadataDto splashL2RequestMetadataDto = this.splash_l2;
            int iHashCode3 = (iHashCode2 + (splashL2RequestMetadataDto == null ? 0 : splashL2RequestMetadataDto.hashCode())) * 31;
            SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDto = this.splash_retirement;
            int iHashCode4 = (iHashCode3 + (splashRetirementRequestMetadataDto == null ? 0 : splashRetirementRequestMetadataDto.hashCode())) * 31;
            QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDto = this.question_option_experience;
            int iHashCode5 = (iHashCode4 + (questionOptionExperienceRequestMetadataDto == null ? 0 : questionOptionExperienceRequestMetadataDto.hashCode())) * 31;
            QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDto = this.question_understand_spread;
            int iHashCode6 = (iHashCode5 + (questionUnderstandSpreadRequestMetadataDto == null ? 0 : questionUnderstandSpreadRequestMetadataDto.hashCode())) * 31;
            QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDto = this.question_investment_advice;
            int iHashCode7 = (iHashCode6 + (questionInvestmentAdviceRequestMetadataDto == null ? 0 : questionInvestmentAdviceRequestMetadataDto.hashCode())) * 31;
            QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDto = this.question_financial_regulator;
            int iHashCode8 = (iHashCode7 + (questionFinancialRegulatorRequestMetadataDto == null ? 0 : questionFinancialRegulatorRequestMetadataDto.hashCode())) * 31;
            SuitabilityRequestMetadataDto suitabilityRequestMetadataDto = this.suitability;
            int iHashCode9 = (iHashCode8 + (suitabilityRequestMetadataDto == null ? 0 : suitabilityRequestMetadataDto.hashCode())) * 31;
            InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDto = this.investment_profile;
            int iHashCode10 = (iHashCode9 + (investmentProfileRequestMetadataDto == null ? 0 : investmentProfileRequestMetadataDto.hashCode())) * 31;
            DisclosureRequestMetadataDto disclosureRequestMetadataDto = this.disclosure;
            int iHashCode11 = (iHashCode10 + (disclosureRequestMetadataDto == null ? 0 : disclosureRequestMetadataDto.hashCode())) * 31;
            ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDto = this.approved_trades;
            int iHashCode12 = (iHashCode11 + (approvedTradesRequestMetadataDto == null ? 0 : approvedTradesRequestMetadataDto.hashCode())) * 31;
            SuccessRequestMetadataDto successRequestMetadataDto = this.success;
            int iHashCode13 = (iHashCode12 + (successRequestMetadataDto == null ? 0 : successRequestMetadataDto.hashCode())) * 31;
            FailureRequestMetadataDto failureRequestMetadataDto = this.failure;
            int iHashCode14 = (iHashCode13 + (failureRequestMetadataDto == null ? 0 : failureRequestMetadataDto.hashCode())) * 31;
            EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDto = this.education_spread;
            int iHashCode15 = (iHashCode14 + (educationSpreadRequestMetadataDto == null ? 0 : educationSpreadRequestMetadataDto.hashCode())) * 31;
            EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDto = this.education_l3_strategies;
            int iHashCode16 = (iHashCode15 + (educationL3StrategiesRequestMetadataDto == null ? 0 : educationL3StrategiesRequestMetadataDto.hashCode())) * 31;
            ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDto = this.ready_l3_upgrade;
            int iHashCode17 = (iHashCode16 + (readyL3UpgradeRequestMetadataDto == null ? 0 : readyL3UpgradeRequestMetadataDto.hashCode())) * 31;
            UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDto = this.upsell_alert;
            int iHashCode18 = (iHashCode17 + (upsellAlertRequestMetadataDto == null ? 0 : upsellAlertRequestMetadataDto.hashCode())) * 31;
            UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDto = this.upsell_trade_on_expiration;
            int iHashCode19 = (iHashCode18 + (upsellTradeOnExpirationRequestMetadataDto == null ? 0 : upsellTradeOnExpirationRequestMetadataDto.hashCode())) * 31;
            UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDto = this.upsell_all_set;
            int iHashCode20 = (iHashCode19 + (upsellAllSetRequestMetadataDto == null ? 0 : upsellAllSetRequestMetadataDto.hashCode())) * 31;
            EndRequestMetadataDto endRequestMetadataDto = this.end;
            int iHashCode21 = (iHashCode20 + (endRequestMetadataDto == null ? 0 : endRequestMetadataDto.hashCode())) * 31;
            ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDto = this.experience_test_questionnaire;
            int iHashCode22 = (iHashCode21 + (experienceTestQuestionnaireRequestMetadataDto == null ? 0 : experienceTestQuestionnaireRequestMetadataDto.hashCode())) * 31;
            KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDto = this.knowledge_test_questionnaire;
            int iHashCode23 = (iHashCode22 + (knowledgeTestQuestionnaireRequestMetadataDto == null ? 0 : knowledgeTestQuestionnaireRequestMetadataDto.hashCode())) * 31;
            InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDto = this.investor_profile;
            int iHashCode24 = (iHashCode23 + (investorProfileV2RequestMetadataDto == null ? 0 : investorProfileV2RequestMetadataDto.hashCode())) * 31;
            ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDto = this.review_investor_profile;
            int iHashCode25 = (iHashCode24 + (reviewInvestorProfileV2RequestMetadataDto == null ? 0 : reviewInvestorProfileV2RequestMetadataDto.hashCode())) * 31;
            UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDto = this.education_home;
            int iHashCode26 = (iHashCode25 + (uKEducationHomeRequestMetadataDto == null ? 0 : uKEducationHomeRequestMetadataDto.hashCode())) * 31;
            UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDto = this.education_strategy;
            int iHashCode27 = (iHashCode26 + (uKEducationStrategyRequestMetadataDto == null ? 0 : uKEducationStrategyRequestMetadataDto.hashCode())) * 31;
            UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDto = this.education_risks;
            int iHashCode28 = (iHashCode27 + (uKEducationRisksRequestMetadataDto == null ? 0 : uKEducationRisksRequestMetadataDto.hashCode())) * 31;
            UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDto = this.education_professional_trader;
            int iHashCode29 = (iHashCode28 + (uKEducationProfessionalTraderRequestMetadataDto == null ? 0 : uKEducationProfessionalTraderRequestMetadataDto.hashCode())) * 31;
            UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDto = this.uk_l3_education_home;
            int iHashCode30 = (iHashCode29 + (uKL3EducationHomeRequestMetadataDto == null ? 0 : uKL3EducationHomeRequestMetadataDto.hashCode())) * 31;
            UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDto = this.uk_l3_education_spread_benefits;
            int iHashCode31 = (iHashCode30 + (uKL3EducationSpreadBenefitsRequestMetadataDto == null ? 0 : uKL3EducationSpreadBenefitsRequestMetadataDto.hashCode())) * 31;
            RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDto = this.rhsg_home;
            int iHashCode32 = (iHashCode31 + (rHSGHomeRequestMetadataDto == null ? 0 : rHSGHomeRequestMetadataDto.hashCode())) * 31;
            RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDto = this.rhsg_complete_car_questionnaire;
            int iHashCode33 = (iHashCode32 + (rHSGCompleteCARQuestionnaireRequestMetadataDto == null ? 0 : rHSGCompleteCARQuestionnaireRequestMetadataDto.hashCode())) * 31;
            ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDto = this.professional_trader;
            int iHashCode34 = (iHashCode33 + (professionalTraderRequestMetadataDto == null ? 0 : professionalTraderRequestMetadataDto.hashCode())) * 31;
            RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDto = this.rhsg_l2_approved_trades;
            int iHashCode35 = (iHashCode34 + (rHSGL2ApprovedTradesRequestMetadataDto == null ? 0 : rHSGL2ApprovedTradesRequestMetadataDto.hashCode())) * 31;
            RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDto = this.rhsg_l3_approved_trades;
            int iHashCode36 = (iHashCode35 + (rHSGL3ApprovedTradesRequestMetadataDto == null ? 0 : rHSGL3ApprovedTradesRequestMetadataDto.hashCode())) * 31;
            JAPendingApplicationMetadataDto jAPendingApplicationMetadataDto = this.ja_pending_application;
            int iHashCode37 = (iHashCode36 + (jAPendingApplicationMetadataDto == null ? 0 : jAPendingApplicationMetadataDto.hashCode())) * 31;
            KnowledgeCheckNeededRequestMetadataDto knowledgeCheckNeededRequestMetadataDto = this.knowledge_check_needed;
            return iHashCode37 + (knowledgeCheckNeededRequestMetadataDto != null ? knowledgeCheckNeededRequestMetadataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(start=" + this.start + ", splash_l0=" + this.splash_l0 + ", splash_l2=" + this.splash_l2 + ", splash_retirement=" + this.splash_retirement + ", question_option_experience=" + this.question_option_experience + ", question_understand_spread=" + this.question_understand_spread + ", question_investment_advice=" + this.question_investment_advice + ", question_financial_regulator=" + this.question_financial_regulator + ", suitability=" + this.suitability + ", investment_profile=" + this.investment_profile + ", disclosure=" + this.disclosure + ", approved_trades=" + this.approved_trades + ", success=" + this.success + ", failure=" + this.failure + ", education_spread=" + this.education_spread + ", education_l3_strategies=" + this.education_l3_strategies + ", ready_l3_upgrade=" + this.ready_l3_upgrade + ", upsell_alert=" + this.upsell_alert + ", upsell_trade_on_expiration=" + this.upsell_trade_on_expiration + ", upsell_all_set=" + this.upsell_all_set + ", end=" + this.end + ", experience_test_questionnaire=" + this.experience_test_questionnaire + ", knowledge_test_questionnaire=" + this.knowledge_test_questionnaire + ", investor_profile=" + this.investor_profile + ", review_investor_profile=" + this.review_investor_profile + ", education_home=" + this.education_home + ", education_strategy=" + this.education_strategy + ", education_risks=" + this.education_risks + ", education_professional_trader=" + this.education_professional_trader + ", uk_l3_education_home=" + this.uk_l3_education_home + ", uk_l3_education_spread_benefits=" + this.uk_l3_education_spread_benefits + ", rhsg_home=" + this.rhsg_home + ", rhsg_complete_car_questionnaire=" + this.rhsg_complete_car_questionnaire + ", professional_trader=" + this.professional_trader + ", rhsg_l2_approved_trades=" + this.rhsg_l2_approved_trades + ", rhsg_l3_approved_trades=" + this.rhsg_l3_approved_trades + ", ja_pending_application=" + this.ja_pending_application + ", knowledge_check_needed=" + this.knowledge_check_needed + ")";
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OnboardingScreenRequestDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OnboardingScreenRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, StartRequestMetadataDto startRequestMetadataDto, SplashL0RequestMetadataDto splashL0RequestMetadataDto, SplashL2RequestMetadataDto splashL2RequestMetadataDto, SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDto, QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDto, QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDto, QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDto, QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDto, SuitabilityRequestMetadataDto suitabilityRequestMetadataDto, InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDto, DisclosureRequestMetadataDto disclosureRequestMetadataDto, ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDto, SuccessRequestMetadataDto successRequestMetadataDto, FailureRequestMetadataDto failureRequestMetadataDto, EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDto, EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDto, ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDto, UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDto, UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDto, UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDto, EndRequestMetadataDto endRequestMetadataDto, ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDto, KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDto, InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDto, ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDto, UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDto, UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDto, UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDto, UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDto, UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDto, UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDto, RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDto, RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDto, ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDto, RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDto, RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDto, JAPendingApplicationMetadataDto jAPendingApplicationMetadataDto, KnowledgeCheckNeededRequestMetadataDto knowledgeCheckNeededRequestMetadataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.start = null;
            } else {
                this.start = startRequestMetadataDto;
            }
            if ((i & 2) == 0) {
                this.splash_l0 = null;
            } else {
                this.splash_l0 = splashL0RequestMetadataDto;
            }
            if ((i & 4) == 0) {
                this.splash_l2 = null;
            } else {
                this.splash_l2 = splashL2RequestMetadataDto;
            }
            if ((i & 8) == 0) {
                this.splash_retirement = null;
            } else {
                this.splash_retirement = splashRetirementRequestMetadataDto;
            }
            if ((i & 16) == 0) {
                this.question_option_experience = null;
            } else {
                this.question_option_experience = questionOptionExperienceRequestMetadataDto;
            }
            if ((i & 32) == 0) {
                this.question_understand_spread = null;
            } else {
                this.question_understand_spread = questionUnderstandSpreadRequestMetadataDto;
            }
            if ((i & 64) == 0) {
                this.question_investment_advice = null;
            } else {
                this.question_investment_advice = questionInvestmentAdviceRequestMetadataDto;
            }
            if ((i & 128) == 0) {
                this.question_financial_regulator = null;
            } else {
                this.question_financial_regulator = questionFinancialRegulatorRequestMetadataDto;
            }
            if ((i & 256) == 0) {
                this.suitability = null;
            } else {
                this.suitability = suitabilityRequestMetadataDto;
            }
            if ((i & 512) == 0) {
                this.investment_profile = null;
            } else {
                this.investment_profile = investmentProfileRequestMetadataDto;
            }
            if ((i & 1024) == 0) {
                this.disclosure = null;
            } else {
                this.disclosure = disclosureRequestMetadataDto;
            }
            if ((i & 2048) == 0) {
                this.approved_trades = null;
            } else {
                this.approved_trades = approvedTradesRequestMetadataDto;
            }
            if ((i & 4096) == 0) {
                this.success = null;
            } else {
                this.success = successRequestMetadataDto;
            }
            if ((i & 8192) == 0) {
                this.failure = null;
            } else {
                this.failure = failureRequestMetadataDto;
            }
            if ((i & 16384) == 0) {
                this.education_spread = null;
            } else {
                this.education_spread = educationSpreadRequestMetadataDto;
            }
            if ((32768 & i) == 0) {
                this.education_l3_strategies = null;
            } else {
                this.education_l3_strategies = educationL3StrategiesRequestMetadataDto;
            }
            if ((65536 & i) == 0) {
                this.ready_l3_upgrade = null;
            } else {
                this.ready_l3_upgrade = readyL3UpgradeRequestMetadataDto;
            }
            if ((131072 & i) == 0) {
                this.upsell_alert = null;
            } else {
                this.upsell_alert = upsellAlertRequestMetadataDto;
            }
            if ((262144 & i) == 0) {
                this.upsell_trade_on_expiration = null;
            } else {
                this.upsell_trade_on_expiration = upsellTradeOnExpirationRequestMetadataDto;
            }
            if ((524288 & i) == 0) {
                this.upsell_all_set = null;
            } else {
                this.upsell_all_set = upsellAllSetRequestMetadataDto;
            }
            if ((1048576 & i) == 0) {
                this.end = null;
            } else {
                this.end = endRequestMetadataDto;
            }
            if ((2097152 & i) == 0) {
                this.experience_test_questionnaire = null;
            } else {
                this.experience_test_questionnaire = experienceTestQuestionnaireRequestMetadataDto;
            }
            if ((4194304 & i) == 0) {
                this.knowledge_test_questionnaire = null;
            } else {
                this.knowledge_test_questionnaire = knowledgeTestQuestionnaireRequestMetadataDto;
            }
            if ((8388608 & i) == 0) {
                this.investor_profile = null;
            } else {
                this.investor_profile = investorProfileV2RequestMetadataDto;
            }
            if ((16777216 & i) == 0) {
                this.review_investor_profile = null;
            } else {
                this.review_investor_profile = reviewInvestorProfileV2RequestMetadataDto;
            }
            if ((33554432 & i) == 0) {
                this.education_home = null;
            } else {
                this.education_home = uKEducationHomeRequestMetadataDto;
            }
            if ((67108864 & i) == 0) {
                this.education_strategy = null;
            } else {
                this.education_strategy = uKEducationStrategyRequestMetadataDto;
            }
            if ((134217728 & i) == 0) {
                this.education_risks = null;
            } else {
                this.education_risks = uKEducationRisksRequestMetadataDto;
            }
            if ((268435456 & i) == 0) {
                this.education_professional_trader = null;
            } else {
                this.education_professional_trader = uKEducationProfessionalTraderRequestMetadataDto;
            }
            if ((536870912 & i) == 0) {
                this.uk_l3_education_home = null;
            } else {
                this.uk_l3_education_home = uKL3EducationHomeRequestMetadataDto;
            }
            if ((1073741824 & i) == 0) {
                this.uk_l3_education_spread_benefits = null;
            } else {
                this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsRequestMetadataDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.rhsg_home = null;
            } else {
                this.rhsg_home = rHSGHomeRequestMetadataDto;
            }
            if ((i2 & 1) == 0) {
                this.rhsg_complete_car_questionnaire = null;
            } else {
                this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireRequestMetadataDto;
            }
            if ((i2 & 2) == 0) {
                this.professional_trader = null;
            } else {
                this.professional_trader = professionalTraderRequestMetadataDto;
            }
            if ((i2 & 4) == 0) {
                this.rhsg_l2_approved_trades = null;
            } else {
                this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesRequestMetadataDto;
            }
            if ((i2 & 8) == 0) {
                this.rhsg_l3_approved_trades = null;
            } else {
                this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesRequestMetadataDto;
            }
            if ((i2 & 16) == 0) {
                this.ja_pending_application = null;
            } else {
                this.ja_pending_application = jAPendingApplicationMetadataDto;
            }
            if ((i2 & 32) == 0) {
                this.knowledge_check_needed = null;
            } else {
                this.knowledge_check_needed = knowledgeCheckNeededRequestMetadataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            StartRequestMetadataDto startRequestMetadataDto = self.start;
            if (startRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StartRequestMetadataDto.Serializer.INSTANCE, startRequestMetadataDto);
            }
            SplashL0RequestMetadataDto splashL0RequestMetadataDto = self.splash_l0;
            if (splashL0RequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SplashL0RequestMetadataDto.Serializer.INSTANCE, splashL0RequestMetadataDto);
            }
            SplashL2RequestMetadataDto splashL2RequestMetadataDto = self.splash_l2;
            if (splashL2RequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SplashL2RequestMetadataDto.Serializer.INSTANCE, splashL2RequestMetadataDto);
            }
            SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDto = self.splash_retirement;
            if (splashRetirementRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SplashRetirementRequestMetadataDto.Serializer.INSTANCE, splashRetirementRequestMetadataDto);
            }
            QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDto = self.question_option_experience;
            if (questionOptionExperienceRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, QuestionOptionExperienceRequestMetadataDto.Serializer.INSTANCE, questionOptionExperienceRequestMetadataDto);
            }
            QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDto = self.question_understand_spread;
            if (questionUnderstandSpreadRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, QuestionUnderstandSpreadRequestMetadataDto.Serializer.INSTANCE, questionUnderstandSpreadRequestMetadataDto);
            }
            QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDto = self.question_investment_advice;
            if (questionInvestmentAdviceRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, QuestionInvestmentAdviceRequestMetadataDto.Serializer.INSTANCE, questionInvestmentAdviceRequestMetadataDto);
            }
            QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDto = self.question_financial_regulator;
            if (questionFinancialRegulatorRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, QuestionFinancialRegulatorRequestMetadataDto.Serializer.INSTANCE, questionFinancialRegulatorRequestMetadataDto);
            }
            SuitabilityRequestMetadataDto suitabilityRequestMetadataDto = self.suitability;
            if (suitabilityRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SuitabilityRequestMetadataDto.Serializer.INSTANCE, suitabilityRequestMetadataDto);
            }
            InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDto = self.investment_profile;
            if (investmentProfileRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, InvestmentProfileRequestMetadataDto.Serializer.INSTANCE, investmentProfileRequestMetadataDto);
            }
            DisclosureRequestMetadataDto disclosureRequestMetadataDto = self.disclosure;
            if (disclosureRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DisclosureRequestMetadataDto.Serializer.INSTANCE, disclosureRequestMetadataDto);
            }
            ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDto = self.approved_trades;
            if (approvedTradesRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ApprovedTradesRequestMetadataDto.Serializer.INSTANCE, approvedTradesRequestMetadataDto);
            }
            SuccessRequestMetadataDto successRequestMetadataDto = self.success;
            if (successRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, SuccessRequestMetadataDto.Serializer.INSTANCE, successRequestMetadataDto);
            }
            FailureRequestMetadataDto failureRequestMetadataDto = self.failure;
            if (failureRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, FailureRequestMetadataDto.Serializer.INSTANCE, failureRequestMetadataDto);
            }
            EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDto = self.education_spread;
            if (educationSpreadRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, EducationSpreadRequestMetadataDto.Serializer.INSTANCE, educationSpreadRequestMetadataDto);
            }
            EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDto = self.education_l3_strategies;
            if (educationL3StrategiesRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, EducationL3StrategiesRequestMetadataDto.Serializer.INSTANCE, educationL3StrategiesRequestMetadataDto);
            }
            ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDto = self.ready_l3_upgrade;
            if (readyL3UpgradeRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, ReadyL3UpgradeRequestMetadataDto.Serializer.INSTANCE, readyL3UpgradeRequestMetadataDto);
            }
            UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDto = self.upsell_alert;
            if (upsellAlertRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, UpsellAlertRequestMetadataDto.Serializer.INSTANCE, upsellAlertRequestMetadataDto);
            }
            UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDto = self.upsell_trade_on_expiration;
            if (upsellTradeOnExpirationRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, UpsellTradeOnExpirationRequestMetadataDto.Serializer.INSTANCE, upsellTradeOnExpirationRequestMetadataDto);
            }
            UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDto = self.upsell_all_set;
            if (upsellAllSetRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, UpsellAllSetRequestMetadataDto.Serializer.INSTANCE, upsellAllSetRequestMetadataDto);
            }
            EndRequestMetadataDto endRequestMetadataDto = self.end;
            if (endRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, EndRequestMetadataDto.Serializer.INSTANCE, endRequestMetadataDto);
            }
            ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDto = self.experience_test_questionnaire;
            if (experienceTestQuestionnaireRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, ExperienceTestQuestionnaireRequestMetadataDto.Serializer.INSTANCE, experienceTestQuestionnaireRequestMetadataDto);
            }
            KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDto = self.knowledge_test_questionnaire;
            if (knowledgeTestQuestionnaireRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, KnowledgeTestQuestionnaireRequestMetadataDto.Serializer.INSTANCE, knowledgeTestQuestionnaireRequestMetadataDto);
            }
            InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDto = self.investor_profile;
            if (investorProfileV2RequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, InvestorProfileV2RequestMetadataDto.Serializer.INSTANCE, investorProfileV2RequestMetadataDto);
            }
            ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDto = self.review_investor_profile;
            if (reviewInvestorProfileV2RequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, ReviewInvestorProfileV2RequestMetadataDto.Serializer.INSTANCE, reviewInvestorProfileV2RequestMetadataDto);
            }
            UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDto = self.education_home;
            if (uKEducationHomeRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, UKEducationHomeRequestMetadataDto.Serializer.INSTANCE, uKEducationHomeRequestMetadataDto);
            }
            UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDto = self.education_strategy;
            if (uKEducationStrategyRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, UKEducationStrategyRequestMetadataDto.Serializer.INSTANCE, uKEducationStrategyRequestMetadataDto);
            }
            UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDto = self.education_risks;
            if (uKEducationRisksRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, UKEducationRisksRequestMetadataDto.Serializer.INSTANCE, uKEducationRisksRequestMetadataDto);
            }
            UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDto = self.education_professional_trader;
            if (uKEducationProfessionalTraderRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, UKEducationProfessionalTraderRequestMetadataDto.Serializer.INSTANCE, uKEducationProfessionalTraderRequestMetadataDto);
            }
            UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDto = self.uk_l3_education_home;
            if (uKL3EducationHomeRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, UKL3EducationHomeRequestMetadataDto.Serializer.INSTANCE, uKL3EducationHomeRequestMetadataDto);
            }
            UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDto = self.uk_l3_education_spread_benefits;
            if (uKL3EducationSpreadBenefitsRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, UKL3EducationSpreadBenefitsRequestMetadataDto.Serializer.INSTANCE, uKL3EducationSpreadBenefitsRequestMetadataDto);
            }
            RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDto = self.rhsg_home;
            if (rHSGHomeRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, RHSGHomeRequestMetadataDto.Serializer.INSTANCE, rHSGHomeRequestMetadataDto);
            }
            RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDto = self.rhsg_complete_car_questionnaire;
            if (rHSGCompleteCARQuestionnaireRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, RHSGCompleteCARQuestionnaireRequestMetadataDto.Serializer.INSTANCE, rHSGCompleteCARQuestionnaireRequestMetadataDto);
            }
            ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDto = self.professional_trader;
            if (professionalTraderRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, ProfessionalTraderRequestMetadataDto.Serializer.INSTANCE, professionalTraderRequestMetadataDto);
            }
            RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDto = self.rhsg_l2_approved_trades;
            if (rHSGL2ApprovedTradesRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, RHSGL2ApprovedTradesRequestMetadataDto.Serializer.INSTANCE, rHSGL2ApprovedTradesRequestMetadataDto);
            }
            RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDto = self.rhsg_l3_approved_trades;
            if (rHSGL3ApprovedTradesRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, RHSGL3ApprovedTradesRequestMetadataDto.Serializer.INSTANCE, rHSGL3ApprovedTradesRequestMetadataDto);
            }
            JAPendingApplicationMetadataDto jAPendingApplicationMetadataDto = self.ja_pending_application;
            if (jAPendingApplicationMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, JAPendingApplicationMetadataDto.Serializer.INSTANCE, jAPendingApplicationMetadataDto);
            }
            KnowledgeCheckNeededRequestMetadataDto knowledgeCheckNeededRequestMetadataDto = self.knowledge_check_needed;
            if (knowledgeCheckNeededRequestMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, KnowledgeCheckNeededRequestMetadataDto.Serializer.INSTANCE, knowledgeCheckNeededRequestMetadataDto);
            }
        }

        public Surrogate(StartRequestMetadataDto startRequestMetadataDto, SplashL0RequestMetadataDto splashL0RequestMetadataDto, SplashL2RequestMetadataDto splashL2RequestMetadataDto, SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDto, QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDto, QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDto, QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDto, QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDto, SuitabilityRequestMetadataDto suitabilityRequestMetadataDto, InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDto, DisclosureRequestMetadataDto disclosureRequestMetadataDto, ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDto, SuccessRequestMetadataDto successRequestMetadataDto, FailureRequestMetadataDto failureRequestMetadataDto, EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDto, EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDto, ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDto, UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDto, UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDto, UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDto, EndRequestMetadataDto endRequestMetadataDto, ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDto, KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDto, InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDto, ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDto, UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDto, UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDto, UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDto, UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDto, UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDto, UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDto, RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDto, RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDto, ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDto, RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDto, RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDto, JAPendingApplicationMetadataDto jAPendingApplicationMetadataDto, KnowledgeCheckNeededRequestMetadataDto knowledgeCheckNeededRequestMetadataDto) {
            this.start = startRequestMetadataDto;
            this.splash_l0 = splashL0RequestMetadataDto;
            this.splash_l2 = splashL2RequestMetadataDto;
            this.splash_retirement = splashRetirementRequestMetadataDto;
            this.question_option_experience = questionOptionExperienceRequestMetadataDto;
            this.question_understand_spread = questionUnderstandSpreadRequestMetadataDto;
            this.question_investment_advice = questionInvestmentAdviceRequestMetadataDto;
            this.question_financial_regulator = questionFinancialRegulatorRequestMetadataDto;
            this.suitability = suitabilityRequestMetadataDto;
            this.investment_profile = investmentProfileRequestMetadataDto;
            this.disclosure = disclosureRequestMetadataDto;
            this.approved_trades = approvedTradesRequestMetadataDto;
            this.success = successRequestMetadataDto;
            this.failure = failureRequestMetadataDto;
            this.education_spread = educationSpreadRequestMetadataDto;
            this.education_l3_strategies = educationL3StrategiesRequestMetadataDto;
            this.ready_l3_upgrade = readyL3UpgradeRequestMetadataDto;
            this.upsell_alert = upsellAlertRequestMetadataDto;
            this.upsell_trade_on_expiration = upsellTradeOnExpirationRequestMetadataDto;
            this.upsell_all_set = upsellAllSetRequestMetadataDto;
            this.end = endRequestMetadataDto;
            this.experience_test_questionnaire = experienceTestQuestionnaireRequestMetadataDto;
            this.knowledge_test_questionnaire = knowledgeTestQuestionnaireRequestMetadataDto;
            this.investor_profile = investorProfileV2RequestMetadataDto;
            this.review_investor_profile = reviewInvestorProfileV2RequestMetadataDto;
            this.education_home = uKEducationHomeRequestMetadataDto;
            this.education_strategy = uKEducationStrategyRequestMetadataDto;
            this.education_risks = uKEducationRisksRequestMetadataDto;
            this.education_professional_trader = uKEducationProfessionalTraderRequestMetadataDto;
            this.uk_l3_education_home = uKL3EducationHomeRequestMetadataDto;
            this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsRequestMetadataDto;
            this.rhsg_home = rHSGHomeRequestMetadataDto;
            this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireRequestMetadataDto;
            this.professional_trader = professionalTraderRequestMetadataDto;
            this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesRequestMetadataDto;
            this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesRequestMetadataDto;
            this.ja_pending_application = jAPendingApplicationMetadataDto;
            this.knowledge_check_needed = knowledgeCheckNeededRequestMetadataDto;
        }

        public /* synthetic */ Surrogate(StartRequestMetadataDto startRequestMetadataDto, SplashL0RequestMetadataDto splashL0RequestMetadataDto, SplashL2RequestMetadataDto splashL2RequestMetadataDto, SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDto, QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDto, QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDto, QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDto, QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDto, SuitabilityRequestMetadataDto suitabilityRequestMetadataDto, InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDto, DisclosureRequestMetadataDto disclosureRequestMetadataDto, ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDto, SuccessRequestMetadataDto successRequestMetadataDto, FailureRequestMetadataDto failureRequestMetadataDto, EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDto, EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDto, ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDto, UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDto, UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDto, UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDto, EndRequestMetadataDto endRequestMetadataDto, ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDto, KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDto, InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDto, ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDto, UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDto, UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDto, UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDto, UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDto, UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDto, UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDto, RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDto, RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDto, ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDto, RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDto, RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDto, JAPendingApplicationMetadataDto jAPendingApplicationMetadataDto, KnowledgeCheckNeededRequestMetadataDto knowledgeCheckNeededRequestMetadataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : startRequestMetadataDto, (i & 2) != 0 ? null : splashL0RequestMetadataDto, (i & 4) != 0 ? null : splashL2RequestMetadataDto, (i & 8) != 0 ? null : splashRetirementRequestMetadataDto, (i & 16) != 0 ? null : questionOptionExperienceRequestMetadataDto, (i & 32) != 0 ? null : questionUnderstandSpreadRequestMetadataDto, (i & 64) != 0 ? null : questionInvestmentAdviceRequestMetadataDto, (i & 128) != 0 ? null : questionFinancialRegulatorRequestMetadataDto, (i & 256) != 0 ? null : suitabilityRequestMetadataDto, (i & 512) != 0 ? null : investmentProfileRequestMetadataDto, (i & 1024) != 0 ? null : disclosureRequestMetadataDto, (i & 2048) != 0 ? null : approvedTradesRequestMetadataDto, (i & 4096) != 0 ? null : successRequestMetadataDto, (i & 8192) != 0 ? null : failureRequestMetadataDto, (i & 16384) != 0 ? null : educationSpreadRequestMetadataDto, (i & 32768) != 0 ? null : educationL3StrategiesRequestMetadataDto, (i & 65536) != 0 ? null : readyL3UpgradeRequestMetadataDto, (i & 131072) != 0 ? null : upsellAlertRequestMetadataDto, (i & 262144) != 0 ? null : upsellTradeOnExpirationRequestMetadataDto, (i & 524288) != 0 ? null : upsellAllSetRequestMetadataDto, (i & 1048576) != 0 ? null : endRequestMetadataDto, (i & 2097152) != 0 ? null : experienceTestQuestionnaireRequestMetadataDto, (i & 4194304) != 0 ? null : knowledgeTestQuestionnaireRequestMetadataDto, (i & 8388608) != 0 ? null : investorProfileV2RequestMetadataDto, (i & 16777216) != 0 ? null : reviewInvestorProfileV2RequestMetadataDto, (i & 33554432) != 0 ? null : uKEducationHomeRequestMetadataDto, (i & 67108864) != 0 ? null : uKEducationStrategyRequestMetadataDto, (i & 134217728) != 0 ? null : uKEducationRisksRequestMetadataDto, (i & 268435456) != 0 ? null : uKEducationProfessionalTraderRequestMetadataDto, (i & 536870912) != 0 ? null : uKL3EducationHomeRequestMetadataDto, (i & 1073741824) != 0 ? null : uKL3EducationSpreadBenefitsRequestMetadataDto, (i & Integer.MIN_VALUE) != 0 ? null : rHSGHomeRequestMetadataDto, (i2 & 1) != 0 ? null : rHSGCompleteCARQuestionnaireRequestMetadataDto, (i2 & 2) != 0 ? null : professionalTraderRequestMetadataDto, (i2 & 4) != 0 ? null : rHSGL2ApprovedTradesRequestMetadataDto, (i2 & 8) != 0 ? null : rHSGL3ApprovedTradesRequestMetadataDto, (i2 & 16) != 0 ? null : jAPendingApplicationMetadataDto, (i2 & 32) != 0 ? null : knowledgeCheckNeededRequestMetadataDto);
        }

        public final StartRequestMetadataDto getStart() {
            return this.start;
        }

        public final SplashL0RequestMetadataDto getSplash_l0() {
            return this.splash_l0;
        }

        public final SplashL2RequestMetadataDto getSplash_l2() {
            return this.splash_l2;
        }

        public final SplashRetirementRequestMetadataDto getSplash_retirement() {
            return this.splash_retirement;
        }

        public final QuestionOptionExperienceRequestMetadataDto getQuestion_option_experience() {
            return this.question_option_experience;
        }

        public final QuestionUnderstandSpreadRequestMetadataDto getQuestion_understand_spread() {
            return this.question_understand_spread;
        }

        public final QuestionInvestmentAdviceRequestMetadataDto getQuestion_investment_advice() {
            return this.question_investment_advice;
        }

        public final QuestionFinancialRegulatorRequestMetadataDto getQuestion_financial_regulator() {
            return this.question_financial_regulator;
        }

        public final SuitabilityRequestMetadataDto getSuitability() {
            return this.suitability;
        }

        public final InvestmentProfileRequestMetadataDto getInvestment_profile() {
            return this.investment_profile;
        }

        public final DisclosureRequestMetadataDto getDisclosure() {
            return this.disclosure;
        }

        public final ApprovedTradesRequestMetadataDto getApproved_trades() {
            return this.approved_trades;
        }

        public final SuccessRequestMetadataDto getSuccess() {
            return this.success;
        }

        public final FailureRequestMetadataDto getFailure() {
            return this.failure;
        }

        public final EducationSpreadRequestMetadataDto getEducation_spread() {
            return this.education_spread;
        }

        public final EducationL3StrategiesRequestMetadataDto getEducation_l3_strategies() {
            return this.education_l3_strategies;
        }

        public final ReadyL3UpgradeRequestMetadataDto getReady_l3_upgrade() {
            return this.ready_l3_upgrade;
        }

        public final UpsellAlertRequestMetadataDto getUpsell_alert() {
            return this.upsell_alert;
        }

        public final UpsellTradeOnExpirationRequestMetadataDto getUpsell_trade_on_expiration() {
            return this.upsell_trade_on_expiration;
        }

        public final UpsellAllSetRequestMetadataDto getUpsell_all_set() {
            return this.upsell_all_set;
        }

        public final EndRequestMetadataDto getEnd() {
            return this.end;
        }

        public final ExperienceTestQuestionnaireRequestMetadataDto getExperience_test_questionnaire() {
            return this.experience_test_questionnaire;
        }

        public final KnowledgeTestQuestionnaireRequestMetadataDto getKnowledge_test_questionnaire() {
            return this.knowledge_test_questionnaire;
        }

        public final InvestorProfileV2RequestMetadataDto getInvestor_profile() {
            return this.investor_profile;
        }

        public final ReviewInvestorProfileV2RequestMetadataDto getReview_investor_profile() {
            return this.review_investor_profile;
        }

        public final UKEducationHomeRequestMetadataDto getEducation_home() {
            return this.education_home;
        }

        public final UKEducationStrategyRequestMetadataDto getEducation_strategy() {
            return this.education_strategy;
        }

        public final UKEducationRisksRequestMetadataDto getEducation_risks() {
            return this.education_risks;
        }

        public final UKEducationProfessionalTraderRequestMetadataDto getEducation_professional_trader() {
            return this.education_professional_trader;
        }

        public final UKL3EducationHomeRequestMetadataDto getUk_l3_education_home() {
            return this.uk_l3_education_home;
        }

        public final UKL3EducationSpreadBenefitsRequestMetadataDto getUk_l3_education_spread_benefits() {
            return this.uk_l3_education_spread_benefits;
        }

        public final RHSGHomeRequestMetadataDto getRhsg_home() {
            return this.rhsg_home;
        }

        public final RHSGCompleteCARQuestionnaireRequestMetadataDto getRhsg_complete_car_questionnaire() {
            return this.rhsg_complete_car_questionnaire;
        }

        public final ProfessionalTraderRequestMetadataDto getProfessional_trader() {
            return this.professional_trader;
        }

        public final RHSGL2ApprovedTradesRequestMetadataDto getRhsg_l2_approved_trades() {
            return this.rhsg_l2_approved_trades;
        }

        public final RHSGL3ApprovedTradesRequestMetadataDto getRhsg_l3_approved_trades() {
            return this.rhsg_l3_approved_trades;
        }

        public final JAPendingApplicationMetadataDto getJa_pending_application() {
            return this.ja_pending_application;
        }

        public final KnowledgeCheckNeededRequestMetadataDto getKnowledge_check_needed() {
            return this.knowledge_check_needed;
        }
    }

    /* compiled from: OnboardingScreenRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/OnboardingScreenRequestDto;", "Loptions_product/service/OnboardingScreenRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/OnboardingScreenRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OnboardingScreenRequestDto, OnboardingScreenRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OnboardingScreenRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OnboardingScreenRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OnboardingScreenRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) OnboardingScreenRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OnboardingScreenRequest> getProtoAdapter() {
            return OnboardingScreenRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OnboardingScreenRequestDto getZeroValue() {
            return OnboardingScreenRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OnboardingScreenRequestDto fromProto(OnboardingScreenRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StartRequestMetadata start = proto.getStart();
            DefaultConstructorMarker defaultConstructorMarker = null;
            StartRequestMetadataDto startRequestMetadataDtoFromProto = start != null ? StartRequestMetadataDto.INSTANCE.fromProto(start) : null;
            SplashL0RequestMetadata splash_l0 = proto.getSplash_l0();
            SplashL0RequestMetadataDto splashL0RequestMetadataDtoFromProto = splash_l0 != null ? SplashL0RequestMetadataDto.INSTANCE.fromProto(splash_l0) : null;
            SplashL2RequestMetadata splash_l2 = proto.getSplash_l2();
            SplashL2RequestMetadataDto splashL2RequestMetadataDtoFromProto = splash_l2 != null ? SplashL2RequestMetadataDto.INSTANCE.fromProto(splash_l2) : null;
            SplashRetirementRequestMetadata splash_retirement = proto.getSplash_retirement();
            SplashRetirementRequestMetadataDto splashRetirementRequestMetadataDtoFromProto = splash_retirement != null ? SplashRetirementRequestMetadataDto.INSTANCE.fromProto(splash_retirement) : null;
            QuestionOptionExperienceRequestMetadata question_option_experience = proto.getQuestion_option_experience();
            QuestionOptionExperienceRequestMetadataDto questionOptionExperienceRequestMetadataDtoFromProto = question_option_experience != null ? QuestionOptionExperienceRequestMetadataDto.INSTANCE.fromProto(question_option_experience) : null;
            QuestionUnderstandSpreadRequestMetadata question_understand_spread = proto.getQuestion_understand_spread();
            QuestionUnderstandSpreadRequestMetadataDto questionUnderstandSpreadRequestMetadataDtoFromProto = question_understand_spread != null ? QuestionUnderstandSpreadRequestMetadataDto.INSTANCE.fromProto(question_understand_spread) : null;
            QuestionInvestmentAdviceRequestMetadata question_investment_advice = proto.getQuestion_investment_advice();
            QuestionInvestmentAdviceRequestMetadataDto questionInvestmentAdviceRequestMetadataDtoFromProto = question_investment_advice != null ? QuestionInvestmentAdviceRequestMetadataDto.INSTANCE.fromProto(question_investment_advice) : null;
            QuestionFinancialRegulatorRequestMetadata question_financial_regulator = proto.getQuestion_financial_regulator();
            QuestionFinancialRegulatorRequestMetadataDto questionFinancialRegulatorRequestMetadataDtoFromProto = question_financial_regulator != null ? QuestionFinancialRegulatorRequestMetadataDto.INSTANCE.fromProto(question_financial_regulator) : null;
            SuitabilityRequestMetadata suitability = proto.getSuitability();
            SuitabilityRequestMetadataDto suitabilityRequestMetadataDtoFromProto = suitability != null ? SuitabilityRequestMetadataDto.INSTANCE.fromProto(suitability) : null;
            InvestmentProfileRequestMetadata investment_profile = proto.getInvestment_profile();
            InvestmentProfileRequestMetadataDto investmentProfileRequestMetadataDtoFromProto = investment_profile != null ? InvestmentProfileRequestMetadataDto.INSTANCE.fromProto(investment_profile) : null;
            DisclosureRequestMetadata disclosure = proto.getDisclosure();
            DisclosureRequestMetadataDto disclosureRequestMetadataDtoFromProto = disclosure != null ? DisclosureRequestMetadataDto.INSTANCE.fromProto(disclosure) : null;
            ApprovedTradesRequestMetadata approved_trades = proto.getApproved_trades();
            ApprovedTradesRequestMetadataDto approvedTradesRequestMetadataDtoFromProto = approved_trades != null ? ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(approved_trades) : null;
            SuccessRequestMetadata success = proto.getSuccess();
            SuccessRequestMetadataDto successRequestMetadataDtoFromProto = success != null ? SuccessRequestMetadataDto.INSTANCE.fromProto(success) : null;
            FailureRequestMetadata failure = proto.getFailure();
            FailureRequestMetadataDto failureRequestMetadataDtoFromProto = failure != null ? FailureRequestMetadataDto.INSTANCE.fromProto(failure) : null;
            EducationSpreadRequestMetadata education_spread = proto.getEducation_spread();
            EducationSpreadRequestMetadataDto educationSpreadRequestMetadataDtoFromProto = education_spread != null ? EducationSpreadRequestMetadataDto.INSTANCE.fromProto(education_spread) : null;
            EducationL3StrategiesRequestMetadata education_l3_strategies = proto.getEducation_l3_strategies();
            EducationL3StrategiesRequestMetadataDto educationL3StrategiesRequestMetadataDtoFromProto = education_l3_strategies != null ? EducationL3StrategiesRequestMetadataDto.INSTANCE.fromProto(education_l3_strategies) : null;
            ReadyL3UpgradeRequestMetadata ready_l3_upgrade = proto.getReady_l3_upgrade();
            ReadyL3UpgradeRequestMetadataDto readyL3UpgradeRequestMetadataDtoFromProto = ready_l3_upgrade != null ? ReadyL3UpgradeRequestMetadataDto.INSTANCE.fromProto(ready_l3_upgrade) : null;
            UpsellAlertRequestMetadata upsell_alert = proto.getUpsell_alert();
            UpsellAlertRequestMetadataDto upsellAlertRequestMetadataDtoFromProto = upsell_alert != null ? UpsellAlertRequestMetadataDto.INSTANCE.fromProto(upsell_alert) : null;
            UpsellTradeOnExpirationRequestMetadata upsell_trade_on_expiration = proto.getUpsell_trade_on_expiration();
            UpsellTradeOnExpirationRequestMetadataDto upsellTradeOnExpirationRequestMetadataDtoFromProto = upsell_trade_on_expiration != null ? UpsellTradeOnExpirationRequestMetadataDto.INSTANCE.fromProto(upsell_trade_on_expiration) : null;
            UpsellAllSetRequestMetadata upsell_all_set = proto.getUpsell_all_set();
            UpsellAllSetRequestMetadataDto upsellAllSetRequestMetadataDtoFromProto = upsell_all_set != null ? UpsellAllSetRequestMetadataDto.INSTANCE.fromProto(upsell_all_set) : null;
            EndRequestMetadata end = proto.getEnd();
            EndRequestMetadataDto endRequestMetadataDtoFromProto = end != null ? EndRequestMetadataDto.INSTANCE.fromProto(end) : null;
            ExperienceTestQuestionnaireRequestMetadata experience_test_questionnaire = proto.getExperience_test_questionnaire();
            ExperienceTestQuestionnaireRequestMetadataDto experienceTestQuestionnaireRequestMetadataDtoFromProto = experience_test_questionnaire != null ? ExperienceTestQuestionnaireRequestMetadataDto.INSTANCE.fromProto(experience_test_questionnaire) : null;
            KnowledgeTestQuestionnaireRequestMetadata knowledge_test_questionnaire = proto.getKnowledge_test_questionnaire();
            KnowledgeTestQuestionnaireRequestMetadataDto knowledgeTestQuestionnaireRequestMetadataDtoFromProto = knowledge_test_questionnaire != null ? KnowledgeTestQuestionnaireRequestMetadataDto.INSTANCE.fromProto(knowledge_test_questionnaire) : null;
            InvestorProfileV2RequestMetadata investor_profile = proto.getInvestor_profile();
            InvestorProfileV2RequestMetadataDto investorProfileV2RequestMetadataDtoFromProto = investor_profile != null ? InvestorProfileV2RequestMetadataDto.INSTANCE.fromProto(investor_profile) : null;
            ReviewInvestorProfileV2RequestMetadata review_investor_profile = proto.getReview_investor_profile();
            ReviewInvestorProfileV2RequestMetadataDto reviewInvestorProfileV2RequestMetadataDtoFromProto = review_investor_profile != null ? ReviewInvestorProfileV2RequestMetadataDto.INSTANCE.fromProto(review_investor_profile) : null;
            UKEducationHomeRequestMetadata education_home = proto.getEducation_home();
            UKEducationHomeRequestMetadataDto uKEducationHomeRequestMetadataDtoFromProto = education_home != null ? UKEducationHomeRequestMetadataDto.INSTANCE.fromProto(education_home) : null;
            UKEducationStrategyRequestMetadata education_strategy = proto.getEducation_strategy();
            UKEducationStrategyRequestMetadataDto uKEducationStrategyRequestMetadataDtoFromProto = education_strategy != null ? UKEducationStrategyRequestMetadataDto.INSTANCE.fromProto(education_strategy) : null;
            UKEducationRisksRequestMetadata education_risks = proto.getEducation_risks();
            UKEducationRisksRequestMetadataDto uKEducationRisksRequestMetadataDtoFromProto = education_risks != null ? UKEducationRisksRequestMetadataDto.INSTANCE.fromProto(education_risks) : null;
            UKEducationProfessionalTraderRequestMetadata education_professional_trader = proto.getEducation_professional_trader();
            UKEducationProfessionalTraderRequestMetadataDto uKEducationProfessionalTraderRequestMetadataDtoFromProto = education_professional_trader != null ? UKEducationProfessionalTraderRequestMetadataDto.INSTANCE.fromProto(education_professional_trader) : null;
            UKL3EducationHomeRequestMetadata uk_l3_education_home = proto.getUk_l3_education_home();
            UKL3EducationHomeRequestMetadataDto uKL3EducationHomeRequestMetadataDtoFromProto = uk_l3_education_home != null ? UKL3EducationHomeRequestMetadataDto.INSTANCE.fromProto(uk_l3_education_home) : null;
            UKL3EducationSpreadBenefitsRequestMetadata uk_l3_education_spread_benefits = proto.getUk_l3_education_spread_benefits();
            UKL3EducationSpreadBenefitsRequestMetadataDto uKL3EducationSpreadBenefitsRequestMetadataDtoFromProto = uk_l3_education_spread_benefits != null ? UKL3EducationSpreadBenefitsRequestMetadataDto.INSTANCE.fromProto(uk_l3_education_spread_benefits) : null;
            RHSGHomeRequestMetadata rhsg_home = proto.getRhsg_home();
            RHSGHomeRequestMetadataDto rHSGHomeRequestMetadataDtoFromProto = rhsg_home != null ? RHSGHomeRequestMetadataDto.INSTANCE.fromProto(rhsg_home) : null;
            RHSGCompleteCARQuestionnaireRequestMetadata rhsg_complete_car_questionnaire = proto.getRhsg_complete_car_questionnaire();
            RHSGCompleteCARQuestionnaireRequestMetadataDto rHSGCompleteCARQuestionnaireRequestMetadataDtoFromProto = rhsg_complete_car_questionnaire != null ? RHSGCompleteCARQuestionnaireRequestMetadataDto.INSTANCE.fromProto(rhsg_complete_car_questionnaire) : null;
            ProfessionalTraderRequestMetadata professional_trader = proto.getProfessional_trader();
            ProfessionalTraderRequestMetadataDto professionalTraderRequestMetadataDtoFromProto = professional_trader != null ? ProfessionalTraderRequestMetadataDto.INSTANCE.fromProto(professional_trader) : null;
            RHSGL2ApprovedTradesRequestMetadata rhsg_l2_approved_trades = proto.getRhsg_l2_approved_trades();
            RHSGL2ApprovedTradesRequestMetadataDto rHSGL2ApprovedTradesRequestMetadataDtoFromProto = rhsg_l2_approved_trades != null ? RHSGL2ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(rhsg_l2_approved_trades) : null;
            RHSGL3ApprovedTradesRequestMetadata rhsg_l3_approved_trades = proto.getRhsg_l3_approved_trades();
            RHSGL3ApprovedTradesRequestMetadataDto rHSGL3ApprovedTradesRequestMetadataDtoFromProto = rhsg_l3_approved_trades != null ? RHSGL3ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(rhsg_l3_approved_trades) : null;
            JAPendingApplicationMetadata ja_pending_application = proto.getJa_pending_application();
            JAPendingApplicationMetadataDto jAPendingApplicationMetadataDtoFromProto = ja_pending_application != null ? JAPendingApplicationMetadataDto.INSTANCE.fromProto(ja_pending_application) : null;
            KnowledgeCheckNeededRequestMetadata knowledge_check_needed = proto.getKnowledge_check_needed();
            return new OnboardingScreenRequestDto(new Surrogate(startRequestMetadataDtoFromProto, splashL0RequestMetadataDtoFromProto, splashL2RequestMetadataDtoFromProto, splashRetirementRequestMetadataDtoFromProto, questionOptionExperienceRequestMetadataDtoFromProto, questionUnderstandSpreadRequestMetadataDtoFromProto, questionInvestmentAdviceRequestMetadataDtoFromProto, questionFinancialRegulatorRequestMetadataDtoFromProto, suitabilityRequestMetadataDtoFromProto, investmentProfileRequestMetadataDtoFromProto, disclosureRequestMetadataDtoFromProto, approvedTradesRequestMetadataDtoFromProto, successRequestMetadataDtoFromProto, failureRequestMetadataDtoFromProto, educationSpreadRequestMetadataDtoFromProto, educationL3StrategiesRequestMetadataDtoFromProto, readyL3UpgradeRequestMetadataDtoFromProto, upsellAlertRequestMetadataDtoFromProto, upsellTradeOnExpirationRequestMetadataDtoFromProto, upsellAllSetRequestMetadataDtoFromProto, endRequestMetadataDtoFromProto, experienceTestQuestionnaireRequestMetadataDtoFromProto, knowledgeTestQuestionnaireRequestMetadataDtoFromProto, investorProfileV2RequestMetadataDtoFromProto, reviewInvestorProfileV2RequestMetadataDtoFromProto, uKEducationHomeRequestMetadataDtoFromProto, uKEducationStrategyRequestMetadataDtoFromProto, uKEducationRisksRequestMetadataDtoFromProto, uKEducationProfessionalTraderRequestMetadataDtoFromProto, uKL3EducationHomeRequestMetadataDtoFromProto, uKL3EducationSpreadBenefitsRequestMetadataDtoFromProto, rHSGHomeRequestMetadataDtoFromProto, rHSGCompleteCARQuestionnaireRequestMetadataDtoFromProto, professionalTraderRequestMetadataDtoFromProto, rHSGL2ApprovedTradesRequestMetadataDtoFromProto, rHSGL3ApprovedTradesRequestMetadataDtoFromProto, jAPendingApplicationMetadataDtoFromProto, knowledge_check_needed != null ? KnowledgeCheckNeededRequestMetadataDto.INSTANCE.fromProto(knowledge_check_needed) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.OnboardingScreenRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnboardingScreenRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OnboardingScreenRequestDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OnboardingScreenRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 *2\u00020\u0001:'\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001&+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOP¨\u0006Q"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Start", "SplashL0", "SplashL2", "SplashRetirement", "QuestionOptionExperience", "QuestionUnderstandSpread", "QuestionInvestmentAdvice", "QuestionFinancialRegulator", "Suitability", "InvestmentProfile", "Disclosure", "ApprovedTrades", "Success", "Failure", "EducationSpread", "EducationL3Strategies", "ReadyL3Upgrade", "UpsellAlert", "UpsellTradeOnExpiration", "UpsellAllSet", "End", "ExperienceTestQuestionnaire", "KnowledgeTestQuestionnaire", "InvestorProfile", "ReviewInvestorProfile", "EducationHome", "EducationStrategy", "EducationRisks", "EducationProfessionalTrader", "UkL3EducationHome", "UkL3EducationSpreadBenefits", "RhsgHome", "RhsgCompleteCarQuestionnaire", "ProfessionalTrader", "RhsgL2ApprovedTrades", "RhsgL3ApprovedTrades", "JaPendingApplication", "KnowledgeCheckNeeded", "Companion", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Disclosure;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationL3Strategies;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationProfessionalTrader;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationRisks;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationSpread;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationStrategy;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$End;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ExperienceTestQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Failure;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$InvestmentProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$InvestorProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$JaPendingApplication;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$KnowledgeCheckNeeded;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$KnowledgeTestQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ProfessionalTrader;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionFinancialRegulator;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionInvestmentAdvice;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionOptionExperience;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionUnderstandSpread;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ReadyL3Upgrade;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ReviewInvestorProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgCompleteCarQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgL2ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgL3ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashL0;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashL2;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashRetirement;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Start;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Success;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Suitability;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UkL3EducationHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UkL3EducationSpreadBenefits;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellAlert;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellAllSet;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellTradeOnExpiration;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class RequestMetadataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ RequestMetadataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RequestMetadataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Start;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/StartRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/StartRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/StartRequestMetadataDto;", "getValue", "()Loptions_product/service/StartRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Start extends RequestMetadataDto {
            private final StartRequestMetadataDto value;

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

            public final StartRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(StartRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashL0;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/SplashL0RequestMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashL0RequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashL0RequestMetadataDto;", "getValue", "()Loptions_product/service/SplashL0RequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashL0 extends RequestMetadataDto {
            private final SplashL0RequestMetadataDto value;

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

            public final SplashL0RequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashL0(SplashL0RequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashL2;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/SplashL2RequestMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashL2RequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashL2RequestMetadataDto;", "getValue", "()Loptions_product/service/SplashL2RequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashL2 extends RequestMetadataDto {
            private final SplashL2RequestMetadataDto value;

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

            public final SplashL2RequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashL2(SplashL2RequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$SplashRetirement;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/SplashRetirementRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/SplashRetirementRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SplashRetirementRequestMetadataDto;", "getValue", "()Loptions_product/service/SplashRetirementRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SplashRetirement extends RequestMetadataDto {
            private final SplashRetirementRequestMetadataDto value;

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

            public final SplashRetirementRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SplashRetirement(SplashRetirementRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionOptionExperience;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "getValue", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionOptionExperience extends RequestMetadataDto {
            private final QuestionOptionExperienceRequestMetadataDto value;

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

            public final QuestionOptionExperienceRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionOptionExperience(QuestionOptionExperienceRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionUnderstandSpread;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "getValue", "()Loptions_product/service/QuestionUnderstandSpreadRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionUnderstandSpread extends RequestMetadataDto {
            private final QuestionUnderstandSpreadRequestMetadataDto value;

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

            public final QuestionUnderstandSpreadRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionUnderstandSpread(QuestionUnderstandSpreadRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionInvestmentAdvice;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "getValue", "()Loptions_product/service/QuestionInvestmentAdviceRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionInvestmentAdvice extends RequestMetadataDto {
            private final QuestionInvestmentAdviceRequestMetadataDto value;

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

            public final QuestionInvestmentAdviceRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionInvestmentAdvice(QuestionInvestmentAdviceRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$QuestionFinancialRegulator;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "getValue", "()Loptions_product/service/QuestionFinancialRegulatorRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionFinancialRegulator extends RequestMetadataDto {
            private final QuestionFinancialRegulatorRequestMetadataDto value;

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

            public final QuestionFinancialRegulatorRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionFinancialRegulator(QuestionFinancialRegulatorRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Suitability;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/SuitabilityRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/SuitabilityRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SuitabilityRequestMetadataDto;", "getValue", "()Loptions_product/service/SuitabilityRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Suitability extends RequestMetadataDto {
            private final SuitabilityRequestMetadataDto value;

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

            public final SuitabilityRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Suitability(SuitabilityRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$InvestmentProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/InvestmentProfileRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/InvestmentProfileRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/InvestmentProfileRequestMetadataDto;", "getValue", "()Loptions_product/service/InvestmentProfileRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvestmentProfile extends RequestMetadataDto {
            private final InvestmentProfileRequestMetadataDto value;

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

            public final InvestmentProfileRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestmentProfile(InvestmentProfileRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Disclosure;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/DisclosureRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/DisclosureRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/DisclosureRequestMetadataDto;", "getValue", "()Loptions_product/service/DisclosureRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Disclosure extends RequestMetadataDto {
            private final DisclosureRequestMetadataDto value;

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

            public final DisclosureRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disclosure(DisclosureRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/ApprovedTradesRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/ApprovedTradesRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ApprovedTradesRequestMetadataDto;", "getValue", "()Loptions_product/service/ApprovedTradesRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ApprovedTrades extends RequestMetadataDto {
            private final ApprovedTradesRequestMetadataDto value;

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

            public final ApprovedTradesRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApprovedTrades(ApprovedTradesRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Success;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/SuccessRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/SuccessRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/SuccessRequestMetadataDto;", "getValue", "()Loptions_product/service/SuccessRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends RequestMetadataDto {
            private final SuccessRequestMetadataDto value;

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

            public final SuccessRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(SuccessRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Failure;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/FailureRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/FailureRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/FailureRequestMetadataDto;", "getValue", "()Loptions_product/service/FailureRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends RequestMetadataDto {
            private final FailureRequestMetadataDto value;

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

            public final FailureRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(FailureRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationSpread;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/EducationSpreadRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/EducationSpreadRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EducationSpreadRequestMetadataDto;", "getValue", "()Loptions_product/service/EducationSpreadRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationSpread extends RequestMetadataDto {
            private final EducationSpreadRequestMetadataDto value;

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

            public final EducationSpreadRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationSpread(EducationSpreadRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationL3Strategies;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/EducationL3StrategiesRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "getValue", "()Loptions_product/service/EducationL3StrategiesRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationL3Strategies extends RequestMetadataDto {
            private final EducationL3StrategiesRequestMetadataDto value;

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

            public final EducationL3StrategiesRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationL3Strategies(EducationL3StrategiesRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ReadyL3Upgrade;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "getValue", "()Loptions_product/service/ReadyL3UpgradeRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReadyL3Upgrade extends RequestMetadataDto {
            private final ReadyL3UpgradeRequestMetadataDto value;

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

            public final ReadyL3UpgradeRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadyL3Upgrade(ReadyL3UpgradeRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellAlert;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UpsellAlertRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellAlertRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellAlertRequestMetadataDto;", "getValue", "()Loptions_product/service/UpsellAlertRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellAlert extends RequestMetadataDto {
            private final UpsellAlertRequestMetadataDto value;

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

            public final UpsellAlertRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellAlert(UpsellAlertRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellTradeOnExpiration;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "getValue", "()Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellTradeOnExpiration extends RequestMetadataDto {
            private final UpsellTradeOnExpirationRequestMetadataDto value;

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

            public final UpsellTradeOnExpirationRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellTradeOnExpiration(UpsellTradeOnExpirationRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UpsellAllSet;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UpsellAllSetRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UpsellAllSetRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellAllSetRequestMetadataDto;", "getValue", "()Loptions_product/service/UpsellAllSetRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpsellAllSet extends RequestMetadataDto {
            private final UpsellAllSetRequestMetadataDto value;

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

            public final UpsellAllSetRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellAllSet(UpsellAllSetRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$End;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/EndRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/EndRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/EndRequestMetadataDto;", "getValue", "()Loptions_product/service/EndRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class End extends RequestMetadataDto {
            private final EndRequestMetadataDto value;

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

            public final EndRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public End(EndRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ExperienceTestQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "getValue", "()Loptions_product/service/ExperienceTestQuestionnaireRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExperienceTestQuestionnaire extends RequestMetadataDto {
            private final ExperienceTestQuestionnaireRequestMetadataDto value;

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

            public final ExperienceTestQuestionnaireRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExperienceTestQuestionnaire(ExperienceTestQuestionnaireRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$KnowledgeTestQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "getValue", "()Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KnowledgeTestQuestionnaire extends RequestMetadataDto {
            private final KnowledgeTestQuestionnaireRequestMetadataDto value;

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

            public final KnowledgeTestQuestionnaireRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KnowledgeTestQuestionnaire(KnowledgeTestQuestionnaireRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$InvestorProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "value", "<init>", "(Loptions_product/service/InvestorProfileV2RequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "getValue", "()Loptions_product/service/InvestorProfileV2RequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvestorProfile extends RequestMetadataDto {
            private final InvestorProfileV2RequestMetadataDto value;

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

            public final InvestorProfileV2RequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestorProfile(InvestorProfileV2RequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ReviewInvestorProfile;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "value", "<init>", "(Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "getValue", "()Loptions_product/service/ReviewInvestorProfileV2RequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReviewInvestorProfile extends RequestMetadataDto {
            private final ReviewInvestorProfileV2RequestMetadataDto value;

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

            public final ReviewInvestorProfileV2RequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReviewInvestorProfile(ReviewInvestorProfileV2RequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKEducationHomeRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationHomeRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationHomeRequestMetadataDto;", "getValue", "()Loptions_product/service/UKEducationHomeRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationHome extends RequestMetadataDto {
            private final UKEducationHomeRequestMetadataDto value;

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

            public final UKEducationHomeRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationHome(UKEducationHomeRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationStrategy;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationStrategyRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "getValue", "()Loptions_product/service/UKEducationStrategyRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationStrategy extends RequestMetadataDto {
            private final UKEducationStrategyRequestMetadataDto value;

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

            public final UKEducationStrategyRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationStrategy(UKEducationStrategyRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationRisks;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKEducationRisksRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationRisksRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationRisksRequestMetadataDto;", "getValue", "()Loptions_product/service/UKEducationRisksRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationRisks extends RequestMetadataDto {
            private final UKEducationRisksRequestMetadataDto value;

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

            public final UKEducationRisksRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationRisks(UKEducationRisksRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$EducationProfessionalTrader;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "getValue", "()Loptions_product/service/UKEducationProfessionalTraderRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EducationProfessionalTrader extends RequestMetadataDto {
            private final UKEducationProfessionalTraderRequestMetadataDto value;

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

            public final UKEducationProfessionalTraderRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EducationProfessionalTrader(UKEducationProfessionalTraderRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UkL3EducationHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKL3EducationHomeRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "getValue", "()Loptions_product/service/UKL3EducationHomeRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UkL3EducationHome extends RequestMetadataDto {
            private final UKL3EducationHomeRequestMetadataDto value;

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

            public final UKL3EducationHomeRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UkL3EducationHome(UKL3EducationHomeRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$UkL3EducationSpreadBenefits;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "getValue", "()Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UkL3EducationSpreadBenefits extends RequestMetadataDto {
            private final UKL3EducationSpreadBenefitsRequestMetadataDto value;

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

            public final UKL3EducationSpreadBenefitsRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UkL3EducationSpreadBenefits(UKL3EducationSpreadBenefitsRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgHome;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/RHSGHomeRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGHomeRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGHomeRequestMetadataDto;", "getValue", "()Loptions_product/service/RHSGHomeRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgHome extends RequestMetadataDto {
            private final RHSGHomeRequestMetadataDto value;

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

            public final RHSGHomeRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgHome(RHSGHomeRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgCompleteCarQuestionnaire;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "getValue", "()Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgCompleteCarQuestionnaire extends RequestMetadataDto {
            private final RHSGCompleteCARQuestionnaireRequestMetadataDto value;

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

            public final RHSGCompleteCARQuestionnaireRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgCompleteCarQuestionnaire(RHSGCompleteCARQuestionnaireRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$ProfessionalTrader;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/ProfessionalTraderRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "getValue", "()Loptions_product/service/ProfessionalTraderRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class ProfessionalTrader extends RequestMetadataDto {
            private final ProfessionalTraderRequestMetadataDto value;

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

            public final ProfessionalTraderRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProfessionalTrader(ProfessionalTraderRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgL2ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "getValue", "()Loptions_product/service/RHSGL2ApprovedTradesRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgL2ApprovedTrades extends RequestMetadataDto {
            private final RHSGL2ApprovedTradesRequestMetadataDto value;

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

            public final RHSGL2ApprovedTradesRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgL2ApprovedTrades(RHSGL2ApprovedTradesRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$RhsgL3ApprovedTrades;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "getValue", "()Loptions_product/service/RHSGL3ApprovedTradesRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RhsgL3ApprovedTrades extends RequestMetadataDto {
            private final RHSGL3ApprovedTradesRequestMetadataDto value;

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

            public final RHSGL3ApprovedTradesRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsgL3ApprovedTrades(RHSGL3ApprovedTradesRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$JaPendingApplication;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/JAPendingApplicationMetadataDto;", "value", "<init>", "(Loptions_product/service/JAPendingApplicationMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/JAPendingApplicationMetadataDto;", "getValue", "()Loptions_product/service/JAPendingApplicationMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class JaPendingApplication extends RequestMetadataDto {
            private final JAPendingApplicationMetadataDto value;

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

            public final JAPendingApplicationMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JaPendingApplication(JAPendingApplicationMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$KnowledgeCheckNeeded;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "value", "<init>", "(Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "getValue", "()Loptions_product/service/KnowledgeCheckNeededRequestMetadataDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class KnowledgeCheckNeeded extends RequestMetadataDto {
            private final KnowledgeCheckNeededRequestMetadataDto value;

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

            public final KnowledgeCheckNeededRequestMetadataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KnowledgeCheckNeeded(KnowledgeCheckNeededRequestMetadataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OnboardingScreenRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Loptions_product/service/OnboardingScreenRequestDto$RequestMetadataDto;", "Loptions_product/service/OnboardingScreenRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto4.Creator<RequestMetadataDto, OnboardingScreenRequest> {
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
            public ProtoAdapter<OnboardingScreenRequest> getProtoAdapter() {
                return OnboardingScreenRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RequestMetadataDto fromProto(OnboardingScreenRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getStart() != null) {
                    return new Start(StartRequestMetadataDto.INSTANCE.fromProto(proto.getStart()));
                }
                if (proto.getSplash_l0() != null) {
                    return new SplashL0(SplashL0RequestMetadataDto.INSTANCE.fromProto(proto.getSplash_l0()));
                }
                if (proto.getSplash_l2() != null) {
                    return new SplashL2(SplashL2RequestMetadataDto.INSTANCE.fromProto(proto.getSplash_l2()));
                }
                if (proto.getSplash_retirement() != null) {
                    return new SplashRetirement(SplashRetirementRequestMetadataDto.INSTANCE.fromProto(proto.getSplash_retirement()));
                }
                if (proto.getQuestion_option_experience() != null) {
                    return new QuestionOptionExperience(QuestionOptionExperienceRequestMetadataDto.INSTANCE.fromProto(proto.getQuestion_option_experience()));
                }
                if (proto.getQuestion_understand_spread() != null) {
                    return new QuestionUnderstandSpread(QuestionUnderstandSpreadRequestMetadataDto.INSTANCE.fromProto(proto.getQuestion_understand_spread()));
                }
                if (proto.getQuestion_investment_advice() != null) {
                    return new QuestionInvestmentAdvice(QuestionInvestmentAdviceRequestMetadataDto.INSTANCE.fromProto(proto.getQuestion_investment_advice()));
                }
                if (proto.getQuestion_financial_regulator() != null) {
                    return new QuestionFinancialRegulator(QuestionFinancialRegulatorRequestMetadataDto.INSTANCE.fromProto(proto.getQuestion_financial_regulator()));
                }
                if (proto.getSuitability() != null) {
                    return new Suitability(SuitabilityRequestMetadataDto.INSTANCE.fromProto(proto.getSuitability()));
                }
                if (proto.getInvestment_profile() != null) {
                    return new InvestmentProfile(InvestmentProfileRequestMetadataDto.INSTANCE.fromProto(proto.getInvestment_profile()));
                }
                if (proto.getDisclosure() != null) {
                    return new Disclosure(DisclosureRequestMetadataDto.INSTANCE.fromProto(proto.getDisclosure()));
                }
                if (proto.getApproved_trades() != null) {
                    return new ApprovedTrades(ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(proto.getApproved_trades()));
                }
                if (proto.getSuccess() != null) {
                    return new Success(SuccessRequestMetadataDto.INSTANCE.fromProto(proto.getSuccess()));
                }
                if (proto.getFailure() != null) {
                    return new Failure(FailureRequestMetadataDto.INSTANCE.fromProto(proto.getFailure()));
                }
                if (proto.getEducation_spread() != null) {
                    return new EducationSpread(EducationSpreadRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_spread()));
                }
                if (proto.getEducation_l3_strategies() != null) {
                    return new EducationL3Strategies(EducationL3StrategiesRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_l3_strategies()));
                }
                if (proto.getReady_l3_upgrade() != null) {
                    return new ReadyL3Upgrade(ReadyL3UpgradeRequestMetadataDto.INSTANCE.fromProto(proto.getReady_l3_upgrade()));
                }
                if (proto.getUpsell_alert() != null) {
                    return new UpsellAlert(UpsellAlertRequestMetadataDto.INSTANCE.fromProto(proto.getUpsell_alert()));
                }
                if (proto.getUpsell_trade_on_expiration() != null) {
                    return new UpsellTradeOnExpiration(UpsellTradeOnExpirationRequestMetadataDto.INSTANCE.fromProto(proto.getUpsell_trade_on_expiration()));
                }
                if (proto.getUpsell_all_set() != null) {
                    return new UpsellAllSet(UpsellAllSetRequestMetadataDto.INSTANCE.fromProto(proto.getUpsell_all_set()));
                }
                if (proto.getEnd() != null) {
                    return new End(EndRequestMetadataDto.INSTANCE.fromProto(proto.getEnd()));
                }
                if (proto.getExperience_test_questionnaire() != null) {
                    return new ExperienceTestQuestionnaire(ExperienceTestQuestionnaireRequestMetadataDto.INSTANCE.fromProto(proto.getExperience_test_questionnaire()));
                }
                if (proto.getKnowledge_test_questionnaire() != null) {
                    return new KnowledgeTestQuestionnaire(KnowledgeTestQuestionnaireRequestMetadataDto.INSTANCE.fromProto(proto.getKnowledge_test_questionnaire()));
                }
                if (proto.getInvestor_profile() != null) {
                    return new InvestorProfile(InvestorProfileV2RequestMetadataDto.INSTANCE.fromProto(proto.getInvestor_profile()));
                }
                if (proto.getReview_investor_profile() != null) {
                    return new ReviewInvestorProfile(ReviewInvestorProfileV2RequestMetadataDto.INSTANCE.fromProto(proto.getReview_investor_profile()));
                }
                if (proto.getEducation_home() != null) {
                    return new EducationHome(UKEducationHomeRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_home()));
                }
                if (proto.getEducation_strategy() != null) {
                    return new EducationStrategy(UKEducationStrategyRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_strategy()));
                }
                if (proto.getEducation_risks() != null) {
                    return new EducationRisks(UKEducationRisksRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_risks()));
                }
                if (proto.getEducation_professional_trader() != null) {
                    return new EducationProfessionalTrader(UKEducationProfessionalTraderRequestMetadataDto.INSTANCE.fromProto(proto.getEducation_professional_trader()));
                }
                if (proto.getUk_l3_education_home() != null) {
                    return new UkL3EducationHome(UKL3EducationHomeRequestMetadataDto.INSTANCE.fromProto(proto.getUk_l3_education_home()));
                }
                if (proto.getUk_l3_education_spread_benefits() != null) {
                    return new UkL3EducationSpreadBenefits(UKL3EducationSpreadBenefitsRequestMetadataDto.INSTANCE.fromProto(proto.getUk_l3_education_spread_benefits()));
                }
                if (proto.getRhsg_home() != null) {
                    return new RhsgHome(RHSGHomeRequestMetadataDto.INSTANCE.fromProto(proto.getRhsg_home()));
                }
                if (proto.getRhsg_complete_car_questionnaire() != null) {
                    return new RhsgCompleteCarQuestionnaire(RHSGCompleteCARQuestionnaireRequestMetadataDto.INSTANCE.fromProto(proto.getRhsg_complete_car_questionnaire()));
                }
                if (proto.getProfessional_trader() != null) {
                    return new ProfessionalTrader(ProfessionalTraderRequestMetadataDto.INSTANCE.fromProto(proto.getProfessional_trader()));
                }
                if (proto.getRhsg_l2_approved_trades() != null) {
                    return new RhsgL2ApprovedTrades(RHSGL2ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(proto.getRhsg_l2_approved_trades()));
                }
                if (proto.getRhsg_l3_approved_trades() != null) {
                    return new RhsgL3ApprovedTrades(RHSGL3ApprovedTradesRequestMetadataDto.INSTANCE.fromProto(proto.getRhsg_l3_approved_trades()));
                }
                if (proto.getJa_pending_application() != null) {
                    return new JaPendingApplication(JAPendingApplicationMetadataDto.INSTANCE.fromProto(proto.getJa_pending_application()));
                }
                if (proto.getKnowledge_check_needed() != null) {
                    return new KnowledgeCheckNeeded(KnowledgeCheckNeededRequestMetadataDto.INSTANCE.fromProto(proto.getKnowledge_check_needed()));
                }
                return null;
            }
        }
    }

    /* compiled from: OnboardingScreenRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/OnboardingScreenRequestDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/OnboardingScreenRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OnboardingScreenRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.OnboardingScreenRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OnboardingScreenRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OnboardingScreenRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OnboardingScreenRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OnboardingScreenRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "options_product.service.OnboardingScreenRequestDto";
        }
    }
}
