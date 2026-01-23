package options_product.service;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: OnboardingScreenRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 ©\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002©\u0001BÙ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\b\b\u0002\u0010O\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\t\u0010\u009f\u0001\u001a\u00020\u0002H\u0017J\u0017\u0010 \u0001\u001a\u00030¡\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0096\u0002J\n\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J\n\u0010¦\u0001\u001a\u00030§\u0001H\u0016JÙ\u0003\u0010¨\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010O\u001a\u00020PR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0019\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010G\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010I\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010M\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006ª\u0001"}, m3636d2 = {"Loptions_product/service/OnboardingScreenRequest;", "Lcom/squareup/wire/Message;", "", "start", "Loptions_product/service/StartRequestMetadata;", "splash_l0", "Loptions_product/service/SplashL0RequestMetadata;", "splash_l2", "Loptions_product/service/SplashL2RequestMetadata;", "splash_retirement", "Loptions_product/service/SplashRetirementRequestMetadata;", "question_option_experience", "Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "question_understand_spread", "Loptions_product/service/QuestionUnderstandSpreadRequestMetadata;", "question_investment_advice", "Loptions_product/service/QuestionInvestmentAdviceRequestMetadata;", "question_financial_regulator", "Loptions_product/service/QuestionFinancialRegulatorRequestMetadata;", QuestionnaireContexts.SUITABILITY, "Loptions_product/service/SuitabilityRequestMetadata;", "investment_profile", "Loptions_product/service/InvestmentProfileRequestMetadata;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Loptions_product/service/DisclosureRequestMetadata;", "approved_trades", "Loptions_product/service/ApprovedTradesRequestMetadata;", "success", "Loptions_product/service/SuccessRequestMetadata;", "failure", "Loptions_product/service/FailureRequestMetadata;", "education_spread", "Loptions_product/service/EducationSpreadRequestMetadata;", "education_l3_strategies", "Loptions_product/service/EducationL3StrategiesRequestMetadata;", "ready_l3_upgrade", "Loptions_product/service/ReadyL3UpgradeRequestMetadata;", "upsell_alert", "Loptions_product/service/UpsellAlertRequestMetadata;", "upsell_trade_on_expiration", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadata;", "upsell_all_set", "Loptions_product/service/UpsellAllSetRequestMetadata;", "end", "Loptions_product/service/EndRequestMetadata;", "experience_test_questionnaire", "Loptions_product/service/ExperienceTestQuestionnaireRequestMetadata;", "knowledge_test_questionnaire", "Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadata;", "investor_profile", "Loptions_product/service/InvestorProfileV2RequestMetadata;", "review_investor_profile", "Loptions_product/service/ReviewInvestorProfileV2RequestMetadata;", "education_home", "Loptions_product/service/UKEducationHomeRequestMetadata;", "education_strategy", "Loptions_product/service/UKEducationStrategyRequestMetadata;", "education_risks", "Loptions_product/service/UKEducationRisksRequestMetadata;", "education_professional_trader", "Loptions_product/service/UKEducationProfessionalTraderRequestMetadata;", "uk_l3_education_home", "Loptions_product/service/UKL3EducationHomeRequestMetadata;", "uk_l3_education_spread_benefits", "Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadata;", "rhsg_home", "Loptions_product/service/RHSGHomeRequestMetadata;", "rhsg_complete_car_questionnaire", "Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadata;", "professional_trader", "Loptions_product/service/ProfessionalTraderRequestMetadata;", "rhsg_l2_approved_trades", "Loptions_product/service/RHSGL2ApprovedTradesRequestMetadata;", "rhsg_l3_approved_trades", "Loptions_product/service/RHSGL3ApprovedTradesRequestMetadata;", "ja_pending_application", "Loptions_product/service/JAPendingApplicationMetadata;", "knowledge_check_needed", "Loptions_product/service/KnowledgeCheckNeededRequestMetadata;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/StartRequestMetadata;Loptions_product/service/SplashL0RequestMetadata;Loptions_product/service/SplashL2RequestMetadata;Loptions_product/service/SplashRetirementRequestMetadata;Loptions_product/service/QuestionOptionExperienceRequestMetadata;Loptions_product/service/QuestionUnderstandSpreadRequestMetadata;Loptions_product/service/QuestionInvestmentAdviceRequestMetadata;Loptions_product/service/QuestionFinancialRegulatorRequestMetadata;Loptions_product/service/SuitabilityRequestMetadata;Loptions_product/service/InvestmentProfileRequestMetadata;Loptions_product/service/DisclosureRequestMetadata;Loptions_product/service/ApprovedTradesRequestMetadata;Loptions_product/service/SuccessRequestMetadata;Loptions_product/service/FailureRequestMetadata;Loptions_product/service/EducationSpreadRequestMetadata;Loptions_product/service/EducationL3StrategiesRequestMetadata;Loptions_product/service/ReadyL3UpgradeRequestMetadata;Loptions_product/service/UpsellAlertRequestMetadata;Loptions_product/service/UpsellTradeOnExpirationRequestMetadata;Loptions_product/service/UpsellAllSetRequestMetadata;Loptions_product/service/EndRequestMetadata;Loptions_product/service/ExperienceTestQuestionnaireRequestMetadata;Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadata;Loptions_product/service/InvestorProfileV2RequestMetadata;Loptions_product/service/ReviewInvestorProfileV2RequestMetadata;Loptions_product/service/UKEducationHomeRequestMetadata;Loptions_product/service/UKEducationStrategyRequestMetadata;Loptions_product/service/UKEducationRisksRequestMetadata;Loptions_product/service/UKEducationProfessionalTraderRequestMetadata;Loptions_product/service/UKL3EducationHomeRequestMetadata;Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadata;Loptions_product/service/RHSGHomeRequestMetadata;Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadata;Loptions_product/service/ProfessionalTraderRequestMetadata;Loptions_product/service/RHSGL2ApprovedTradesRequestMetadata;Loptions_product/service/RHSGL3ApprovedTradesRequestMetadata;Loptions_product/service/JAPendingApplicationMetadata;Loptions_product/service/KnowledgeCheckNeededRequestMetadata;Lokio/ByteString;)V", "getStart", "()Loptions_product/service/StartRequestMetadata;", "getSplash_l0", "()Loptions_product/service/SplashL0RequestMetadata;", "getSplash_l2", "()Loptions_product/service/SplashL2RequestMetadata;", "getSplash_retirement", "()Loptions_product/service/SplashRetirementRequestMetadata;", "getQuestion_option_experience", "()Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "getQuestion_understand_spread", "()Loptions_product/service/QuestionUnderstandSpreadRequestMetadata;", "getQuestion_investment_advice", "()Loptions_product/service/QuestionInvestmentAdviceRequestMetadata;", "getQuestion_financial_regulator", "()Loptions_product/service/QuestionFinancialRegulatorRequestMetadata;", "getSuitability", "()Loptions_product/service/SuitabilityRequestMetadata;", "getInvestment_profile", "()Loptions_product/service/InvestmentProfileRequestMetadata;", "getDisclosure", "()Loptions_product/service/DisclosureRequestMetadata;", "getApproved_trades", "()Loptions_product/service/ApprovedTradesRequestMetadata;", "getSuccess", "()Loptions_product/service/SuccessRequestMetadata;", "getFailure", "()Loptions_product/service/FailureRequestMetadata;", "getEducation_spread", "()Loptions_product/service/EducationSpreadRequestMetadata;", "getEducation_l3_strategies", "()Loptions_product/service/EducationL3StrategiesRequestMetadata;", "getReady_l3_upgrade", "()Loptions_product/service/ReadyL3UpgradeRequestMetadata;", "getUpsell_alert", "()Loptions_product/service/UpsellAlertRequestMetadata;", "getUpsell_trade_on_expiration", "()Loptions_product/service/UpsellTradeOnExpirationRequestMetadata;", "getUpsell_all_set", "()Loptions_product/service/UpsellAllSetRequestMetadata;", "getEnd", "()Loptions_product/service/EndRequestMetadata;", "getExperience_test_questionnaire", "()Loptions_product/service/ExperienceTestQuestionnaireRequestMetadata;", "getKnowledge_test_questionnaire", "()Loptions_product/service/KnowledgeTestQuestionnaireRequestMetadata;", "getInvestor_profile", "()Loptions_product/service/InvestorProfileV2RequestMetadata;", "getReview_investor_profile", "()Loptions_product/service/ReviewInvestorProfileV2RequestMetadata;", "getEducation_home", "()Loptions_product/service/UKEducationHomeRequestMetadata;", "getEducation_strategy", "()Loptions_product/service/UKEducationStrategyRequestMetadata;", "getEducation_risks", "()Loptions_product/service/UKEducationRisksRequestMetadata;", "getEducation_professional_trader", "()Loptions_product/service/UKEducationProfessionalTraderRequestMetadata;", "getUk_l3_education_home", "()Loptions_product/service/UKL3EducationHomeRequestMetadata;", "getUk_l3_education_spread_benefits", "()Loptions_product/service/UKL3EducationSpreadBenefitsRequestMetadata;", "getRhsg_home", "()Loptions_product/service/RHSGHomeRequestMetadata;", "getRhsg_complete_car_questionnaire", "()Loptions_product/service/RHSGCompleteCARQuestionnaireRequestMetadata;", "getProfessional_trader", "()Loptions_product/service/ProfessionalTraderRequestMetadata;", "getRhsg_l2_approved_trades", "()Loptions_product/service/RHSGL2ApprovedTradesRequestMetadata;", "getRhsg_l3_approved_trades", "()Loptions_product/service/RHSGL3ApprovedTradesRequestMetadata;", "getJa_pending_application", "()Loptions_product/service/JAPendingApplicationMetadata;", "getKnowledge_check_needed", "()Loptions_product/service/KnowledgeCheckNeededRequestMetadata;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OnboardingScreenRequest extends Message {

    @JvmField
    public static final ProtoAdapter<OnboardingScreenRequest> ADAPTER;

    @WireField(adapter = "options_product.service.ApprovedTradesRequestMetadata#ADAPTER", jsonName = "approvedTrades", oneofName = "request_metadata", schemaIndex = 11, tag = 12)
    private final ApprovedTradesRequestMetadata approved_trades;

    @WireField(adapter = "options_product.service.DisclosureRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 10, tag = 11)
    private final DisclosureRequestMetadata disclosure;

    @WireField(adapter = "options_product.service.UKEducationHomeRequestMetadata#ADAPTER", jsonName = EducationSource.EDUCATION_SOURCE_EDUCATION_HOME, oneofName = "request_metadata", schemaIndex = 25, tag = 26)
    private final UKEducationHomeRequestMetadata education_home;

    @WireField(adapter = "options_product.service.EducationL3StrategiesRequestMetadata#ADAPTER", jsonName = "educationL3Strategies", oneofName = "request_metadata", schemaIndex = 15, tag = 16)
    private final EducationL3StrategiesRequestMetadata education_l3_strategies;

    @WireField(adapter = "options_product.service.UKEducationProfessionalTraderRequestMetadata#ADAPTER", jsonName = "educationProfessionalTrader", oneofName = "request_metadata", schemaIndex = 28, tag = 29)
    private final UKEducationProfessionalTraderRequestMetadata education_professional_trader;

    @WireField(adapter = "options_product.service.UKEducationRisksRequestMetadata#ADAPTER", jsonName = "educationRisks", oneofName = "request_metadata", schemaIndex = 27, tag = 28)
    private final UKEducationRisksRequestMetadata education_risks;

    @WireField(adapter = "options_product.service.EducationSpreadRequestMetadata#ADAPTER", jsonName = "educationSpread", oneofName = "request_metadata", schemaIndex = 14, tag = 15)
    private final EducationSpreadRequestMetadata education_spread;

    @WireField(adapter = "options_product.service.UKEducationStrategyRequestMetadata#ADAPTER", jsonName = "educationStrategy", oneofName = "request_metadata", schemaIndex = 26, tag = 27)
    private final UKEducationStrategyRequestMetadata education_strategy;

    @WireField(adapter = "options_product.service.EndRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 20, tag = 21)
    private final EndRequestMetadata end;

    @WireField(adapter = "options_product.service.ExperienceTestQuestionnaireRequestMetadata#ADAPTER", jsonName = "experienceTestQuestionnaire", oneofName = "request_metadata", schemaIndex = 21, tag = 22)
    private final ExperienceTestQuestionnaireRequestMetadata experience_test_questionnaire;

    @WireField(adapter = "options_product.service.FailureRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 13, tag = 14)
    private final FailureRequestMetadata failure;

    @WireField(adapter = "options_product.service.InvestmentProfileRequestMetadata#ADAPTER", jsonName = "investmentProfile", oneofName = "request_metadata", schemaIndex = 9, tag = 10)
    private final InvestmentProfileRequestMetadata investment_profile;

    @WireField(adapter = "options_product.service.InvestorProfileV2RequestMetadata#ADAPTER", jsonName = "investorProfile", oneofName = "request_metadata", schemaIndex = 23, tag = 24)
    private final InvestorProfileV2RequestMetadata investor_profile;

    @WireField(adapter = "options_product.service.JAPendingApplicationMetadata#ADAPTER", jsonName = "jaPendingApplication", oneofName = "request_metadata", schemaIndex = 36, tag = 37)
    private final JAPendingApplicationMetadata ja_pending_application;

    @WireField(adapter = "options_product.service.KnowledgeCheckNeededRequestMetadata#ADAPTER", jsonName = "knowledgeCheckNeeded", oneofName = "request_metadata", schemaIndex = 37, tag = 38)
    private final KnowledgeCheckNeededRequestMetadata knowledge_check_needed;

    @WireField(adapter = "options_product.service.KnowledgeTestQuestionnaireRequestMetadata#ADAPTER", jsonName = "knowledgeTestQuestionnaire", oneofName = "request_metadata", schemaIndex = 22, tag = 23)
    private final KnowledgeTestQuestionnaireRequestMetadata knowledge_test_questionnaire;

    @WireField(adapter = "options_product.service.ProfessionalTraderRequestMetadata#ADAPTER", jsonName = "professionalTrader", oneofName = "request_metadata", schemaIndex = 33, tag = 34)
    private final ProfessionalTraderRequestMetadata professional_trader;

    @WireField(adapter = "options_product.service.QuestionFinancialRegulatorRequestMetadata#ADAPTER", jsonName = "questionFinancialRegulator", oneofName = "request_metadata", schemaIndex = 7, tag = 8)
    private final QuestionFinancialRegulatorRequestMetadata question_financial_regulator;

    @WireField(adapter = "options_product.service.QuestionInvestmentAdviceRequestMetadata#ADAPTER", jsonName = "questionInvestmentAdvice", oneofName = "request_metadata", schemaIndex = 6, tag = 7)
    private final QuestionInvestmentAdviceRequestMetadata question_investment_advice;

    @WireField(adapter = "options_product.service.QuestionOptionExperienceRequestMetadata#ADAPTER", jsonName = "questionOptionExperience", oneofName = "request_metadata", schemaIndex = 4, tag = 5)
    private final QuestionOptionExperienceRequestMetadata question_option_experience;

    @WireField(adapter = "options_product.service.QuestionUnderstandSpreadRequestMetadata#ADAPTER", jsonName = "questionUnderstandSpread", oneofName = "request_metadata", schemaIndex = 5, tag = 6)
    private final QuestionUnderstandSpreadRequestMetadata question_understand_spread;

    @WireField(adapter = "options_product.service.ReadyL3UpgradeRequestMetadata#ADAPTER", jsonName = "readyL3Upgrade", oneofName = "request_metadata", schemaIndex = 16, tag = 17)
    private final ReadyL3UpgradeRequestMetadata ready_l3_upgrade;

    @WireField(adapter = "options_product.service.ReviewInvestorProfileV2RequestMetadata#ADAPTER", jsonName = "reviewInvestorProfile", oneofName = "request_metadata", schemaIndex = 24, tag = 25)
    private final ReviewInvestorProfileV2RequestMetadata review_investor_profile;

    @WireField(adapter = "options_product.service.RHSGCompleteCARQuestionnaireRequestMetadata#ADAPTER", jsonName = "rhsgCompleteCarQuestionnaire", oneofName = "request_metadata", schemaIndex = 32, tag = 33)
    private final RHSGCompleteCARQuestionnaireRequestMetadata rhsg_complete_car_questionnaire;

    @WireField(adapter = "options_product.service.RHSGHomeRequestMetadata#ADAPTER", jsonName = "rhsgHome", oneofName = "request_metadata", schemaIndex = 31, tag = 32)
    private final RHSGHomeRequestMetadata rhsg_home;

    @WireField(adapter = "options_product.service.RHSGL2ApprovedTradesRequestMetadata#ADAPTER", jsonName = "rhsgL2ApprovedTrades", oneofName = "request_metadata", schemaIndex = 34, tag = 35)
    private final RHSGL2ApprovedTradesRequestMetadata rhsg_l2_approved_trades;

    @WireField(adapter = "options_product.service.RHSGL3ApprovedTradesRequestMetadata#ADAPTER", jsonName = "rhsgL3ApprovedTrades", oneofName = "request_metadata", schemaIndex = 35, tag = 36)
    private final RHSGL3ApprovedTradesRequestMetadata rhsg_l3_approved_trades;

    @WireField(adapter = "options_product.service.SplashL0RequestMetadata#ADAPTER", jsonName = "splashL0", oneofName = "request_metadata", schemaIndex = 1, tag = 2)
    private final SplashL0RequestMetadata splash_l0;

    @WireField(adapter = "options_product.service.SplashL2RequestMetadata#ADAPTER", jsonName = "splashL2", oneofName = "request_metadata", schemaIndex = 2, tag = 3)
    private final SplashL2RequestMetadata splash_l2;

    @WireField(adapter = "options_product.service.SplashRetirementRequestMetadata#ADAPTER", jsonName = "splashRetirement", oneofName = "request_metadata", schemaIndex = 3, tag = 4)
    private final SplashRetirementRequestMetadata splash_retirement;

    @WireField(adapter = "options_product.service.StartRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 0, tag = 1)
    private final StartRequestMetadata start;

    @WireField(adapter = "options_product.service.SuccessRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 12, tag = 13)
    private final SuccessRequestMetadata success;

    @WireField(adapter = "options_product.service.SuitabilityRequestMetadata#ADAPTER", oneofName = "request_metadata", schemaIndex = 8, tag = 9)
    private final SuitabilityRequestMetadata suitability;

    @WireField(adapter = "options_product.service.UKL3EducationHomeRequestMetadata#ADAPTER", jsonName = "ukL3EducationHome", oneofName = "request_metadata", schemaIndex = 29, tag = 30)
    private final UKL3EducationHomeRequestMetadata uk_l3_education_home;

    @WireField(adapter = "options_product.service.UKL3EducationSpreadBenefitsRequestMetadata#ADAPTER", jsonName = "ukL3EducationSpreadBenefits", oneofName = "request_metadata", schemaIndex = 30, tag = 31)
    private final UKL3EducationSpreadBenefitsRequestMetadata uk_l3_education_spread_benefits;

    @WireField(adapter = "options_product.service.UpsellAlertRequestMetadata#ADAPTER", jsonName = "upsellAlert", oneofName = "request_metadata", schemaIndex = 17, tag = 18)
    private final UpsellAlertRequestMetadata upsell_alert;

    @WireField(adapter = "options_product.service.UpsellAllSetRequestMetadata#ADAPTER", jsonName = "upsellAllSet", oneofName = "request_metadata", schemaIndex = 19, tag = 20)
    private final UpsellAllSetRequestMetadata upsell_all_set;

    @WireField(adapter = "options_product.service.UpsellTradeOnExpirationRequestMetadata#ADAPTER", jsonName = "upsellTradeOnExpiration", oneofName = "request_metadata", schemaIndex = 18, tag = 19)
    private final UpsellTradeOnExpirationRequestMetadata upsell_trade_on_expiration;

    public OnboardingScreenRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29520newBuilder();
    }

    public final StartRequestMetadata getStart() {
        return this.start;
    }

    public final SplashL0RequestMetadata getSplash_l0() {
        return this.splash_l0;
    }

    public final SplashL2RequestMetadata getSplash_l2() {
        return this.splash_l2;
    }

    public final SplashRetirementRequestMetadata getSplash_retirement() {
        return this.splash_retirement;
    }

    public final QuestionOptionExperienceRequestMetadata getQuestion_option_experience() {
        return this.question_option_experience;
    }

    public final QuestionUnderstandSpreadRequestMetadata getQuestion_understand_spread() {
        return this.question_understand_spread;
    }

    public final QuestionInvestmentAdviceRequestMetadata getQuestion_investment_advice() {
        return this.question_investment_advice;
    }

    public final QuestionFinancialRegulatorRequestMetadata getQuestion_financial_regulator() {
        return this.question_financial_regulator;
    }

    public final SuitabilityRequestMetadata getSuitability() {
        return this.suitability;
    }

    public final InvestmentProfileRequestMetadata getInvestment_profile() {
        return this.investment_profile;
    }

    public final DisclosureRequestMetadata getDisclosure() {
        return this.disclosure;
    }

    public final ApprovedTradesRequestMetadata getApproved_trades() {
        return this.approved_trades;
    }

    public final SuccessRequestMetadata getSuccess() {
        return this.success;
    }

    public final FailureRequestMetadata getFailure() {
        return this.failure;
    }

    public final EducationSpreadRequestMetadata getEducation_spread() {
        return this.education_spread;
    }

    public final EducationL3StrategiesRequestMetadata getEducation_l3_strategies() {
        return this.education_l3_strategies;
    }

    public final ReadyL3UpgradeRequestMetadata getReady_l3_upgrade() {
        return this.ready_l3_upgrade;
    }

    public final UpsellAlertRequestMetadata getUpsell_alert() {
        return this.upsell_alert;
    }

    public final UpsellTradeOnExpirationRequestMetadata getUpsell_trade_on_expiration() {
        return this.upsell_trade_on_expiration;
    }

    public final UpsellAllSetRequestMetadata getUpsell_all_set() {
        return this.upsell_all_set;
    }

    public final EndRequestMetadata getEnd() {
        return this.end;
    }

    public final ExperienceTestQuestionnaireRequestMetadata getExperience_test_questionnaire() {
        return this.experience_test_questionnaire;
    }

    public final KnowledgeTestQuestionnaireRequestMetadata getKnowledge_test_questionnaire() {
        return this.knowledge_test_questionnaire;
    }

    public final InvestorProfileV2RequestMetadata getInvestor_profile() {
        return this.investor_profile;
    }

    public final ReviewInvestorProfileV2RequestMetadata getReview_investor_profile() {
        return this.review_investor_profile;
    }

    public final UKEducationHomeRequestMetadata getEducation_home() {
        return this.education_home;
    }

    public final UKEducationStrategyRequestMetadata getEducation_strategy() {
        return this.education_strategy;
    }

    public final UKEducationRisksRequestMetadata getEducation_risks() {
        return this.education_risks;
    }

    public final UKEducationProfessionalTraderRequestMetadata getEducation_professional_trader() {
        return this.education_professional_trader;
    }

    public final UKL3EducationHomeRequestMetadata getUk_l3_education_home() {
        return this.uk_l3_education_home;
    }

    public final UKL3EducationSpreadBenefitsRequestMetadata getUk_l3_education_spread_benefits() {
        return this.uk_l3_education_spread_benefits;
    }

    public final RHSGHomeRequestMetadata getRhsg_home() {
        return this.rhsg_home;
    }

    public final RHSGCompleteCARQuestionnaireRequestMetadata getRhsg_complete_car_questionnaire() {
        return this.rhsg_complete_car_questionnaire;
    }

    public final ProfessionalTraderRequestMetadata getProfessional_trader() {
        return this.professional_trader;
    }

    public final RHSGL2ApprovedTradesRequestMetadata getRhsg_l2_approved_trades() {
        return this.rhsg_l2_approved_trades;
    }

    public final RHSGL3ApprovedTradesRequestMetadata getRhsg_l3_approved_trades() {
        return this.rhsg_l3_approved_trades;
    }

    public final JAPendingApplicationMetadata getJa_pending_application() {
        return this.ja_pending_application;
    }

    public final KnowledgeCheckNeededRequestMetadata getKnowledge_check_needed() {
        return this.knowledge_check_needed;
    }

    public /* synthetic */ OnboardingScreenRequest(StartRequestMetadata startRequestMetadata, SplashL0RequestMetadata splashL0RequestMetadata, SplashL2RequestMetadata splashL2RequestMetadata, SplashRetirementRequestMetadata splashRetirementRequestMetadata, QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata, QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadata, QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadata, QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadata, SuitabilityRequestMetadata suitabilityRequestMetadata, InvestmentProfileRequestMetadata investmentProfileRequestMetadata, DisclosureRequestMetadata disclosureRequestMetadata, ApprovedTradesRequestMetadata approvedTradesRequestMetadata, SuccessRequestMetadata successRequestMetadata, FailureRequestMetadata failureRequestMetadata, EducationSpreadRequestMetadata educationSpreadRequestMetadata, EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadata, ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata, UpsellAlertRequestMetadata upsellAlertRequestMetadata, UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata, UpsellAllSetRequestMetadata upsellAllSetRequestMetadata, EndRequestMetadata endRequestMetadata, ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadata, KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata, InvestorProfileV2RequestMetadata investorProfileV2RequestMetadata, ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata, UKEducationHomeRequestMetadata uKEducationHomeRequestMetadata, UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata, UKEducationRisksRequestMetadata uKEducationRisksRequestMetadata, UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata, UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadata, UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata, RHSGHomeRequestMetadata rHSGHomeRequestMetadata, RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata, ProfessionalTraderRequestMetadata professionalTraderRequestMetadata, RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata, RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadata, JAPendingApplicationMetadata jAPendingApplicationMetadata, KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadata, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : startRequestMetadata, (i & 2) != 0 ? null : splashL0RequestMetadata, (i & 4) != 0 ? null : splashL2RequestMetadata, (i & 8) != 0 ? null : splashRetirementRequestMetadata, (i & 16) != 0 ? null : questionOptionExperienceRequestMetadata, (i & 32) != 0 ? null : questionUnderstandSpreadRequestMetadata, (i & 64) != 0 ? null : questionInvestmentAdviceRequestMetadata, (i & 128) != 0 ? null : questionFinancialRegulatorRequestMetadata, (i & 256) != 0 ? null : suitabilityRequestMetadata, (i & 512) != 0 ? null : investmentProfileRequestMetadata, (i & 1024) != 0 ? null : disclosureRequestMetadata, (i & 2048) != 0 ? null : approvedTradesRequestMetadata, (i & 4096) != 0 ? null : successRequestMetadata, (i & 8192) != 0 ? null : failureRequestMetadata, (i & 16384) != 0 ? null : educationSpreadRequestMetadata, (i & 32768) != 0 ? null : educationL3StrategiesRequestMetadata, (i & 65536) != 0 ? null : readyL3UpgradeRequestMetadata, (i & 131072) != 0 ? null : upsellAlertRequestMetadata, (i & 262144) != 0 ? null : upsellTradeOnExpirationRequestMetadata, (i & 524288) != 0 ? null : upsellAllSetRequestMetadata, (i & 1048576) != 0 ? null : endRequestMetadata, (i & 2097152) != 0 ? null : experienceTestQuestionnaireRequestMetadata, (i & 4194304) != 0 ? null : knowledgeTestQuestionnaireRequestMetadata, (i & 8388608) != 0 ? null : investorProfileV2RequestMetadata, (i & 16777216) != 0 ? null : reviewInvestorProfileV2RequestMetadata, (i & 33554432) != 0 ? null : uKEducationHomeRequestMetadata, (i & 67108864) != 0 ? null : uKEducationStrategyRequestMetadata, (i & 134217728) != 0 ? null : uKEducationRisksRequestMetadata, (i & 268435456) != 0 ? null : uKEducationProfessionalTraderRequestMetadata, (i & 536870912) != 0 ? null : uKL3EducationHomeRequestMetadata, (i & 1073741824) != 0 ? null : uKL3EducationSpreadBenefitsRequestMetadata, (i & Integer.MIN_VALUE) != 0 ? null : rHSGHomeRequestMetadata, (i2 & 1) != 0 ? null : rHSGCompleteCARQuestionnaireRequestMetadata, (i2 & 2) != 0 ? null : professionalTraderRequestMetadata, (i2 & 4) != 0 ? null : rHSGL2ApprovedTradesRequestMetadata, (i2 & 8) != 0 ? null : rHSGL3ApprovedTradesRequestMetadata, (i2 & 16) != 0 ? null : jAPendingApplicationMetadata, (i2 & 32) != 0 ? null : knowledgeCheckNeededRequestMetadata, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingScreenRequest(StartRequestMetadata startRequestMetadata, SplashL0RequestMetadata splashL0RequestMetadata, SplashL2RequestMetadata splashL2RequestMetadata, SplashRetirementRequestMetadata splashRetirementRequestMetadata, QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata, QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadata, QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadata, QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadata, SuitabilityRequestMetadata suitabilityRequestMetadata, InvestmentProfileRequestMetadata investmentProfileRequestMetadata, DisclosureRequestMetadata disclosureRequestMetadata, ApprovedTradesRequestMetadata approvedTradesRequestMetadata, SuccessRequestMetadata successRequestMetadata, FailureRequestMetadata failureRequestMetadata, EducationSpreadRequestMetadata educationSpreadRequestMetadata, EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadata, ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata, UpsellAlertRequestMetadata upsellAlertRequestMetadata, UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata, UpsellAllSetRequestMetadata upsellAllSetRequestMetadata, EndRequestMetadata endRequestMetadata, ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadata, KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata, InvestorProfileV2RequestMetadata investorProfileV2RequestMetadata, ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata, UKEducationHomeRequestMetadata uKEducationHomeRequestMetadata, UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata, UKEducationRisksRequestMetadata uKEducationRisksRequestMetadata, UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata, UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadata, UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata, RHSGHomeRequestMetadata rHSGHomeRequestMetadata, RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata, ProfessionalTraderRequestMetadata professionalTraderRequestMetadata, RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata, RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadata, JAPendingApplicationMetadata jAPendingApplicationMetadata, KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.start = startRequestMetadata;
        this.splash_l0 = splashL0RequestMetadata;
        this.splash_l2 = splashL2RequestMetadata;
        this.splash_retirement = splashRetirementRequestMetadata;
        this.question_option_experience = questionOptionExperienceRequestMetadata;
        this.question_understand_spread = questionUnderstandSpreadRequestMetadata;
        this.question_investment_advice = questionInvestmentAdviceRequestMetadata;
        this.question_financial_regulator = questionFinancialRegulatorRequestMetadata;
        this.suitability = suitabilityRequestMetadata;
        this.investment_profile = investmentProfileRequestMetadata;
        this.disclosure = disclosureRequestMetadata;
        this.approved_trades = approvedTradesRequestMetadata;
        this.success = successRequestMetadata;
        this.failure = failureRequestMetadata;
        this.education_spread = educationSpreadRequestMetadata;
        this.education_l3_strategies = educationL3StrategiesRequestMetadata;
        this.ready_l3_upgrade = readyL3UpgradeRequestMetadata;
        this.upsell_alert = upsellAlertRequestMetadata;
        this.upsell_trade_on_expiration = upsellTradeOnExpirationRequestMetadata;
        this.upsell_all_set = upsellAllSetRequestMetadata;
        this.end = endRequestMetadata;
        this.experience_test_questionnaire = experienceTestQuestionnaireRequestMetadata;
        this.knowledge_test_questionnaire = knowledgeTestQuestionnaireRequestMetadata;
        this.investor_profile = investorProfileV2RequestMetadata;
        this.review_investor_profile = reviewInvestorProfileV2RequestMetadata;
        this.education_home = uKEducationHomeRequestMetadata;
        this.education_strategy = uKEducationStrategyRequestMetadata;
        this.education_risks = uKEducationRisksRequestMetadata;
        this.education_professional_trader = uKEducationProfessionalTraderRequestMetadata;
        this.uk_l3_education_home = uKL3EducationHomeRequestMetadata;
        this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsRequestMetadata;
        this.rhsg_home = rHSGHomeRequestMetadata;
        this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireRequestMetadata;
        this.professional_trader = professionalTraderRequestMetadata;
        this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesRequestMetadata;
        this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesRequestMetadata;
        this.ja_pending_application = jAPendingApplicationMetadata;
        this.knowledge_check_needed = knowledgeCheckNeededRequestMetadata;
        if (Internal.countNonNull(startRequestMetadata, splashL0RequestMetadata, splashL2RequestMetadata, splashRetirementRequestMetadata, questionOptionExperienceRequestMetadata, questionUnderstandSpreadRequestMetadata, questionInvestmentAdviceRequestMetadata, questionFinancialRegulatorRequestMetadata, suitabilityRequestMetadata, investmentProfileRequestMetadata, disclosureRequestMetadata, approvedTradesRequestMetadata, successRequestMetadata, failureRequestMetadata, educationSpreadRequestMetadata, educationL3StrategiesRequestMetadata, readyL3UpgradeRequestMetadata, upsellAlertRequestMetadata, upsellTradeOnExpirationRequestMetadata, upsellAllSetRequestMetadata, endRequestMetadata, experienceTestQuestionnaireRequestMetadata, knowledgeTestQuestionnaireRequestMetadata, investorProfileV2RequestMetadata, reviewInvestorProfileV2RequestMetadata, uKEducationHomeRequestMetadata, uKEducationStrategyRequestMetadata, uKEducationRisksRequestMetadata, uKEducationProfessionalTraderRequestMetadata, uKL3EducationHomeRequestMetadata, uKL3EducationSpreadBenefitsRequestMetadata, rHSGHomeRequestMetadata, rHSGCompleteCARQuestionnaireRequestMetadata, professionalTraderRequestMetadata, rHSGL2ApprovedTradesRequestMetadata, rHSGL3ApprovedTradesRequestMetadata, jAPendingApplicationMetadata, knowledgeCheckNeededRequestMetadata) > 1) {
            throw new IllegalArgumentException("At most one of start, splash_l0, splash_l2, splash_retirement, question_option_experience, question_understand_spread, question_investment_advice, question_financial_regulator, suitability, investment_profile, disclosure, approved_trades, success, failure, education_spread, education_l3_strategies, ready_l3_upgrade, upsell_alert, upsell_trade_on_expiration, upsell_all_set, end, experience_test_questionnaire, knowledge_test_questionnaire, investor_profile, review_investor_profile, education_home, education_strategy, education_risks, education_professional_trader, uk_l3_education_home, uk_l3_education_spread_benefits, rhsg_home, rhsg_complete_car_questionnaire, professional_trader, rhsg_l2_approved_trades, rhsg_l3_approved_trades, ja_pending_application, knowledge_check_needed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29520newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OnboardingScreenRequest)) {
            return false;
        }
        OnboardingScreenRequest onboardingScreenRequest = (OnboardingScreenRequest) other;
        return Intrinsics.areEqual(unknownFields(), onboardingScreenRequest.unknownFields()) && Intrinsics.areEqual(this.start, onboardingScreenRequest.start) && Intrinsics.areEqual(this.splash_l0, onboardingScreenRequest.splash_l0) && Intrinsics.areEqual(this.splash_l2, onboardingScreenRequest.splash_l2) && Intrinsics.areEqual(this.splash_retirement, onboardingScreenRequest.splash_retirement) && Intrinsics.areEqual(this.question_option_experience, onboardingScreenRequest.question_option_experience) && Intrinsics.areEqual(this.question_understand_spread, onboardingScreenRequest.question_understand_spread) && Intrinsics.areEqual(this.question_investment_advice, onboardingScreenRequest.question_investment_advice) && Intrinsics.areEqual(this.question_financial_regulator, onboardingScreenRequest.question_financial_regulator) && Intrinsics.areEqual(this.suitability, onboardingScreenRequest.suitability) && Intrinsics.areEqual(this.investment_profile, onboardingScreenRequest.investment_profile) && Intrinsics.areEqual(this.disclosure, onboardingScreenRequest.disclosure) && Intrinsics.areEqual(this.approved_trades, onboardingScreenRequest.approved_trades) && Intrinsics.areEqual(this.success, onboardingScreenRequest.success) && Intrinsics.areEqual(this.failure, onboardingScreenRequest.failure) && Intrinsics.areEqual(this.education_spread, onboardingScreenRequest.education_spread) && Intrinsics.areEqual(this.education_l3_strategies, onboardingScreenRequest.education_l3_strategies) && Intrinsics.areEqual(this.ready_l3_upgrade, onboardingScreenRequest.ready_l3_upgrade) && Intrinsics.areEqual(this.upsell_alert, onboardingScreenRequest.upsell_alert) && Intrinsics.areEqual(this.upsell_trade_on_expiration, onboardingScreenRequest.upsell_trade_on_expiration) && Intrinsics.areEqual(this.upsell_all_set, onboardingScreenRequest.upsell_all_set) && Intrinsics.areEqual(this.end, onboardingScreenRequest.end) && Intrinsics.areEqual(this.experience_test_questionnaire, onboardingScreenRequest.experience_test_questionnaire) && Intrinsics.areEqual(this.knowledge_test_questionnaire, onboardingScreenRequest.knowledge_test_questionnaire) && Intrinsics.areEqual(this.investor_profile, onboardingScreenRequest.investor_profile) && Intrinsics.areEqual(this.review_investor_profile, onboardingScreenRequest.review_investor_profile) && Intrinsics.areEqual(this.education_home, onboardingScreenRequest.education_home) && Intrinsics.areEqual(this.education_strategy, onboardingScreenRequest.education_strategy) && Intrinsics.areEqual(this.education_risks, onboardingScreenRequest.education_risks) && Intrinsics.areEqual(this.education_professional_trader, onboardingScreenRequest.education_professional_trader) && Intrinsics.areEqual(this.uk_l3_education_home, onboardingScreenRequest.uk_l3_education_home) && Intrinsics.areEqual(this.uk_l3_education_spread_benefits, onboardingScreenRequest.uk_l3_education_spread_benefits) && Intrinsics.areEqual(this.rhsg_home, onboardingScreenRequest.rhsg_home) && Intrinsics.areEqual(this.rhsg_complete_car_questionnaire, onboardingScreenRequest.rhsg_complete_car_questionnaire) && Intrinsics.areEqual(this.professional_trader, onboardingScreenRequest.professional_trader) && Intrinsics.areEqual(this.rhsg_l2_approved_trades, onboardingScreenRequest.rhsg_l2_approved_trades) && Intrinsics.areEqual(this.rhsg_l3_approved_trades, onboardingScreenRequest.rhsg_l3_approved_trades) && Intrinsics.areEqual(this.ja_pending_application, onboardingScreenRequest.ja_pending_application) && Intrinsics.areEqual(this.knowledge_check_needed, onboardingScreenRequest.knowledge_check_needed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        StartRequestMetadata startRequestMetadata = this.start;
        int iHashCode2 = (iHashCode + (startRequestMetadata != null ? startRequestMetadata.hashCode() : 0)) * 37;
        SplashL0RequestMetadata splashL0RequestMetadata = this.splash_l0;
        int iHashCode3 = (iHashCode2 + (splashL0RequestMetadata != null ? splashL0RequestMetadata.hashCode() : 0)) * 37;
        SplashL2RequestMetadata splashL2RequestMetadata = this.splash_l2;
        int iHashCode4 = (iHashCode3 + (splashL2RequestMetadata != null ? splashL2RequestMetadata.hashCode() : 0)) * 37;
        SplashRetirementRequestMetadata splashRetirementRequestMetadata = this.splash_retirement;
        int iHashCode5 = (iHashCode4 + (splashRetirementRequestMetadata != null ? splashRetirementRequestMetadata.hashCode() : 0)) * 37;
        QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata = this.question_option_experience;
        int iHashCode6 = (iHashCode5 + (questionOptionExperienceRequestMetadata != null ? questionOptionExperienceRequestMetadata.hashCode() : 0)) * 37;
        QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadata = this.question_understand_spread;
        int iHashCode7 = (iHashCode6 + (questionUnderstandSpreadRequestMetadata != null ? questionUnderstandSpreadRequestMetadata.hashCode() : 0)) * 37;
        QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadata = this.question_investment_advice;
        int iHashCode8 = (iHashCode7 + (questionInvestmentAdviceRequestMetadata != null ? questionInvestmentAdviceRequestMetadata.hashCode() : 0)) * 37;
        QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadata = this.question_financial_regulator;
        int iHashCode9 = (iHashCode8 + (questionFinancialRegulatorRequestMetadata != null ? questionFinancialRegulatorRequestMetadata.hashCode() : 0)) * 37;
        SuitabilityRequestMetadata suitabilityRequestMetadata = this.suitability;
        int iHashCode10 = (iHashCode9 + (suitabilityRequestMetadata != null ? suitabilityRequestMetadata.hashCode() : 0)) * 37;
        InvestmentProfileRequestMetadata investmentProfileRequestMetadata = this.investment_profile;
        int iHashCode11 = (iHashCode10 + (investmentProfileRequestMetadata != null ? investmentProfileRequestMetadata.hashCode() : 0)) * 37;
        DisclosureRequestMetadata disclosureRequestMetadata = this.disclosure;
        int iHashCode12 = (iHashCode11 + (disclosureRequestMetadata != null ? disclosureRequestMetadata.hashCode() : 0)) * 37;
        ApprovedTradesRequestMetadata approvedTradesRequestMetadata = this.approved_trades;
        int iHashCode13 = (iHashCode12 + (approvedTradesRequestMetadata != null ? approvedTradesRequestMetadata.hashCode() : 0)) * 37;
        SuccessRequestMetadata successRequestMetadata = this.success;
        int iHashCode14 = (iHashCode13 + (successRequestMetadata != null ? successRequestMetadata.hashCode() : 0)) * 37;
        FailureRequestMetadata failureRequestMetadata = this.failure;
        int iHashCode15 = (iHashCode14 + (failureRequestMetadata != null ? failureRequestMetadata.hashCode() : 0)) * 37;
        EducationSpreadRequestMetadata educationSpreadRequestMetadata = this.education_spread;
        int iHashCode16 = (iHashCode15 + (educationSpreadRequestMetadata != null ? educationSpreadRequestMetadata.hashCode() : 0)) * 37;
        EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadata = this.education_l3_strategies;
        int iHashCode17 = (iHashCode16 + (educationL3StrategiesRequestMetadata != null ? educationL3StrategiesRequestMetadata.hashCode() : 0)) * 37;
        ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata = this.ready_l3_upgrade;
        int iHashCode18 = (iHashCode17 + (readyL3UpgradeRequestMetadata != null ? readyL3UpgradeRequestMetadata.hashCode() : 0)) * 37;
        UpsellAlertRequestMetadata upsellAlertRequestMetadata = this.upsell_alert;
        int iHashCode19 = (iHashCode18 + (upsellAlertRequestMetadata != null ? upsellAlertRequestMetadata.hashCode() : 0)) * 37;
        UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata = this.upsell_trade_on_expiration;
        int iHashCode20 = (iHashCode19 + (upsellTradeOnExpirationRequestMetadata != null ? upsellTradeOnExpirationRequestMetadata.hashCode() : 0)) * 37;
        UpsellAllSetRequestMetadata upsellAllSetRequestMetadata = this.upsell_all_set;
        int iHashCode21 = (iHashCode20 + (upsellAllSetRequestMetadata != null ? upsellAllSetRequestMetadata.hashCode() : 0)) * 37;
        EndRequestMetadata endRequestMetadata = this.end;
        int iHashCode22 = (iHashCode21 + (endRequestMetadata != null ? endRequestMetadata.hashCode() : 0)) * 37;
        ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadata = this.experience_test_questionnaire;
        int iHashCode23 = (iHashCode22 + (experienceTestQuestionnaireRequestMetadata != null ? experienceTestQuestionnaireRequestMetadata.hashCode() : 0)) * 37;
        KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata = this.knowledge_test_questionnaire;
        int iHashCode24 = (iHashCode23 + (knowledgeTestQuestionnaireRequestMetadata != null ? knowledgeTestQuestionnaireRequestMetadata.hashCode() : 0)) * 37;
        InvestorProfileV2RequestMetadata investorProfileV2RequestMetadata = this.investor_profile;
        int iHashCode25 = (iHashCode24 + (investorProfileV2RequestMetadata != null ? investorProfileV2RequestMetadata.hashCode() : 0)) * 37;
        ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata = this.review_investor_profile;
        int iHashCode26 = (iHashCode25 + (reviewInvestorProfileV2RequestMetadata != null ? reviewInvestorProfileV2RequestMetadata.hashCode() : 0)) * 37;
        UKEducationHomeRequestMetadata uKEducationHomeRequestMetadata = this.education_home;
        int iHashCode27 = (iHashCode26 + (uKEducationHomeRequestMetadata != null ? uKEducationHomeRequestMetadata.hashCode() : 0)) * 37;
        UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata = this.education_strategy;
        int iHashCode28 = (iHashCode27 + (uKEducationStrategyRequestMetadata != null ? uKEducationStrategyRequestMetadata.hashCode() : 0)) * 37;
        UKEducationRisksRequestMetadata uKEducationRisksRequestMetadata = this.education_risks;
        int iHashCode29 = (iHashCode28 + (uKEducationRisksRequestMetadata != null ? uKEducationRisksRequestMetadata.hashCode() : 0)) * 37;
        UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata = this.education_professional_trader;
        int iHashCode30 = (iHashCode29 + (uKEducationProfessionalTraderRequestMetadata != null ? uKEducationProfessionalTraderRequestMetadata.hashCode() : 0)) * 37;
        UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadata = this.uk_l3_education_home;
        int iHashCode31 = (iHashCode30 + (uKL3EducationHomeRequestMetadata != null ? uKL3EducationHomeRequestMetadata.hashCode() : 0)) * 37;
        UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata = this.uk_l3_education_spread_benefits;
        int iHashCode32 = (iHashCode31 + (uKL3EducationSpreadBenefitsRequestMetadata != null ? uKL3EducationSpreadBenefitsRequestMetadata.hashCode() : 0)) * 37;
        RHSGHomeRequestMetadata rHSGHomeRequestMetadata = this.rhsg_home;
        int iHashCode33 = (iHashCode32 + (rHSGHomeRequestMetadata != null ? rHSGHomeRequestMetadata.hashCode() : 0)) * 37;
        RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata = this.rhsg_complete_car_questionnaire;
        int iHashCode34 = (iHashCode33 + (rHSGCompleteCARQuestionnaireRequestMetadata != null ? rHSGCompleteCARQuestionnaireRequestMetadata.hashCode() : 0)) * 37;
        ProfessionalTraderRequestMetadata professionalTraderRequestMetadata = this.professional_trader;
        int iHashCode35 = (iHashCode34 + (professionalTraderRequestMetadata != null ? professionalTraderRequestMetadata.hashCode() : 0)) * 37;
        RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata = this.rhsg_l2_approved_trades;
        int iHashCode36 = (iHashCode35 + (rHSGL2ApprovedTradesRequestMetadata != null ? rHSGL2ApprovedTradesRequestMetadata.hashCode() : 0)) * 37;
        RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadata = this.rhsg_l3_approved_trades;
        int iHashCode37 = (iHashCode36 + (rHSGL3ApprovedTradesRequestMetadata != null ? rHSGL3ApprovedTradesRequestMetadata.hashCode() : 0)) * 37;
        JAPendingApplicationMetadata jAPendingApplicationMetadata = this.ja_pending_application;
        int iHashCode38 = (iHashCode37 + (jAPendingApplicationMetadata != null ? jAPendingApplicationMetadata.hashCode() : 0)) * 37;
        KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadata = this.knowledge_check_needed;
        int iHashCode39 = iHashCode38 + (knowledgeCheckNeededRequestMetadata != null ? knowledgeCheckNeededRequestMetadata.hashCode() : 0);
        this.hashCode = iHashCode39;
        return iHashCode39;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        StartRequestMetadata startRequestMetadata = this.start;
        if (startRequestMetadata != null) {
            arrayList.add("start=" + startRequestMetadata);
        }
        SplashL0RequestMetadata splashL0RequestMetadata = this.splash_l0;
        if (splashL0RequestMetadata != null) {
            arrayList.add("splash_l0=" + splashL0RequestMetadata);
        }
        SplashL2RequestMetadata splashL2RequestMetadata = this.splash_l2;
        if (splashL2RequestMetadata != null) {
            arrayList.add("splash_l2=" + splashL2RequestMetadata);
        }
        SplashRetirementRequestMetadata splashRetirementRequestMetadata = this.splash_retirement;
        if (splashRetirementRequestMetadata != null) {
            arrayList.add("splash_retirement=" + splashRetirementRequestMetadata);
        }
        QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata = this.question_option_experience;
        if (questionOptionExperienceRequestMetadata != null) {
            arrayList.add("question_option_experience=" + questionOptionExperienceRequestMetadata);
        }
        QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadata = this.question_understand_spread;
        if (questionUnderstandSpreadRequestMetadata != null) {
            arrayList.add("question_understand_spread=" + questionUnderstandSpreadRequestMetadata);
        }
        QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadata = this.question_investment_advice;
        if (questionInvestmentAdviceRequestMetadata != null) {
            arrayList.add("question_investment_advice=" + questionInvestmentAdviceRequestMetadata);
        }
        QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadata = this.question_financial_regulator;
        if (questionFinancialRegulatorRequestMetadata != null) {
            arrayList.add("question_financial_regulator=" + questionFinancialRegulatorRequestMetadata);
        }
        SuitabilityRequestMetadata suitabilityRequestMetadata = this.suitability;
        if (suitabilityRequestMetadata != null) {
            arrayList.add("suitability=" + suitabilityRequestMetadata);
        }
        InvestmentProfileRequestMetadata investmentProfileRequestMetadata = this.investment_profile;
        if (investmentProfileRequestMetadata != null) {
            arrayList.add("investment_profile=" + investmentProfileRequestMetadata);
        }
        DisclosureRequestMetadata disclosureRequestMetadata = this.disclosure;
        if (disclosureRequestMetadata != null) {
            arrayList.add("disclosure=" + disclosureRequestMetadata);
        }
        ApprovedTradesRequestMetadata approvedTradesRequestMetadata = this.approved_trades;
        if (approvedTradesRequestMetadata != null) {
            arrayList.add("approved_trades=" + approvedTradesRequestMetadata);
        }
        SuccessRequestMetadata successRequestMetadata = this.success;
        if (successRequestMetadata != null) {
            arrayList.add("success=" + successRequestMetadata);
        }
        FailureRequestMetadata failureRequestMetadata = this.failure;
        if (failureRequestMetadata != null) {
            arrayList.add("failure=" + failureRequestMetadata);
        }
        EducationSpreadRequestMetadata educationSpreadRequestMetadata = this.education_spread;
        if (educationSpreadRequestMetadata != null) {
            arrayList.add("education_spread=" + educationSpreadRequestMetadata);
        }
        EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadata = this.education_l3_strategies;
        if (educationL3StrategiesRequestMetadata != null) {
            arrayList.add("education_l3_strategies=" + educationL3StrategiesRequestMetadata);
        }
        ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata = this.ready_l3_upgrade;
        if (readyL3UpgradeRequestMetadata != null) {
            arrayList.add("ready_l3_upgrade=" + readyL3UpgradeRequestMetadata);
        }
        UpsellAlertRequestMetadata upsellAlertRequestMetadata = this.upsell_alert;
        if (upsellAlertRequestMetadata != null) {
            arrayList.add("upsell_alert=" + upsellAlertRequestMetadata);
        }
        UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata = this.upsell_trade_on_expiration;
        if (upsellTradeOnExpirationRequestMetadata != null) {
            arrayList.add("upsell_trade_on_expiration=" + upsellTradeOnExpirationRequestMetadata);
        }
        UpsellAllSetRequestMetadata upsellAllSetRequestMetadata = this.upsell_all_set;
        if (upsellAllSetRequestMetadata != null) {
            arrayList.add("upsell_all_set=" + upsellAllSetRequestMetadata);
        }
        EndRequestMetadata endRequestMetadata = this.end;
        if (endRequestMetadata != null) {
            arrayList.add("end=" + endRequestMetadata);
        }
        ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadata = this.experience_test_questionnaire;
        if (experienceTestQuestionnaireRequestMetadata != null) {
            arrayList.add("experience_test_questionnaire=" + experienceTestQuestionnaireRequestMetadata);
        }
        KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata = this.knowledge_test_questionnaire;
        if (knowledgeTestQuestionnaireRequestMetadata != null) {
            arrayList.add("knowledge_test_questionnaire=" + knowledgeTestQuestionnaireRequestMetadata);
        }
        InvestorProfileV2RequestMetadata investorProfileV2RequestMetadata = this.investor_profile;
        if (investorProfileV2RequestMetadata != null) {
            arrayList.add("investor_profile=" + investorProfileV2RequestMetadata);
        }
        ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata = this.review_investor_profile;
        if (reviewInvestorProfileV2RequestMetadata != null) {
            arrayList.add("review_investor_profile=" + reviewInvestorProfileV2RequestMetadata);
        }
        UKEducationHomeRequestMetadata uKEducationHomeRequestMetadata = this.education_home;
        if (uKEducationHomeRequestMetadata != null) {
            arrayList.add("education_home=" + uKEducationHomeRequestMetadata);
        }
        UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata = this.education_strategy;
        if (uKEducationStrategyRequestMetadata != null) {
            arrayList.add("education_strategy=" + uKEducationStrategyRequestMetadata);
        }
        UKEducationRisksRequestMetadata uKEducationRisksRequestMetadata = this.education_risks;
        if (uKEducationRisksRequestMetadata != null) {
            arrayList.add("education_risks=" + uKEducationRisksRequestMetadata);
        }
        UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata = this.education_professional_trader;
        if (uKEducationProfessionalTraderRequestMetadata != null) {
            arrayList.add("education_professional_trader=" + uKEducationProfessionalTraderRequestMetadata);
        }
        UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadata = this.uk_l3_education_home;
        if (uKL3EducationHomeRequestMetadata != null) {
            arrayList.add("uk_l3_education_home=" + uKL3EducationHomeRequestMetadata);
        }
        UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata = this.uk_l3_education_spread_benefits;
        if (uKL3EducationSpreadBenefitsRequestMetadata != null) {
            arrayList.add("uk_l3_education_spread_benefits=" + uKL3EducationSpreadBenefitsRequestMetadata);
        }
        RHSGHomeRequestMetadata rHSGHomeRequestMetadata = this.rhsg_home;
        if (rHSGHomeRequestMetadata != null) {
            arrayList.add("rhsg_home=" + rHSGHomeRequestMetadata);
        }
        RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata = this.rhsg_complete_car_questionnaire;
        if (rHSGCompleteCARQuestionnaireRequestMetadata != null) {
            arrayList.add("rhsg_complete_car_questionnaire=" + rHSGCompleteCARQuestionnaireRequestMetadata);
        }
        ProfessionalTraderRequestMetadata professionalTraderRequestMetadata = this.professional_trader;
        if (professionalTraderRequestMetadata != null) {
            arrayList.add("professional_trader=" + professionalTraderRequestMetadata);
        }
        RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata = this.rhsg_l2_approved_trades;
        if (rHSGL2ApprovedTradesRequestMetadata != null) {
            arrayList.add("rhsg_l2_approved_trades=" + rHSGL2ApprovedTradesRequestMetadata);
        }
        RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadata = this.rhsg_l3_approved_trades;
        if (rHSGL3ApprovedTradesRequestMetadata != null) {
            arrayList.add("rhsg_l3_approved_trades=" + rHSGL3ApprovedTradesRequestMetadata);
        }
        JAPendingApplicationMetadata jAPendingApplicationMetadata = this.ja_pending_application;
        if (jAPendingApplicationMetadata != null) {
            arrayList.add("ja_pending_application=" + jAPendingApplicationMetadata);
        }
        KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadata = this.knowledge_check_needed;
        if (knowledgeCheckNeededRequestMetadata != null) {
            arrayList.add("knowledge_check_needed=" + knowledgeCheckNeededRequestMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingScreenRequest{", "}", 0, null, null, 56, null);
    }

    public final OnboardingScreenRequest copy(StartRequestMetadata start, SplashL0RequestMetadata splash_l0, SplashL2RequestMetadata splash_l2, SplashRetirementRequestMetadata splash_retirement, QuestionOptionExperienceRequestMetadata question_option_experience, QuestionUnderstandSpreadRequestMetadata question_understand_spread, QuestionInvestmentAdviceRequestMetadata question_investment_advice, QuestionFinancialRegulatorRequestMetadata question_financial_regulator, SuitabilityRequestMetadata suitability, InvestmentProfileRequestMetadata investment_profile, DisclosureRequestMetadata disclosure, ApprovedTradesRequestMetadata approved_trades, SuccessRequestMetadata success, FailureRequestMetadata failure, EducationSpreadRequestMetadata education_spread, EducationL3StrategiesRequestMetadata education_l3_strategies, ReadyL3UpgradeRequestMetadata ready_l3_upgrade, UpsellAlertRequestMetadata upsell_alert, UpsellTradeOnExpirationRequestMetadata upsell_trade_on_expiration, UpsellAllSetRequestMetadata upsell_all_set, EndRequestMetadata end, ExperienceTestQuestionnaireRequestMetadata experience_test_questionnaire, KnowledgeTestQuestionnaireRequestMetadata knowledge_test_questionnaire, InvestorProfileV2RequestMetadata investor_profile, ReviewInvestorProfileV2RequestMetadata review_investor_profile, UKEducationHomeRequestMetadata education_home, UKEducationStrategyRequestMetadata education_strategy, UKEducationRisksRequestMetadata education_risks, UKEducationProfessionalTraderRequestMetadata education_professional_trader, UKL3EducationHomeRequestMetadata uk_l3_education_home, UKL3EducationSpreadBenefitsRequestMetadata uk_l3_education_spread_benefits, RHSGHomeRequestMetadata rhsg_home, RHSGCompleteCARQuestionnaireRequestMetadata rhsg_complete_car_questionnaire, ProfessionalTraderRequestMetadata professional_trader, RHSGL2ApprovedTradesRequestMetadata rhsg_l2_approved_trades, RHSGL3ApprovedTradesRequestMetadata rhsg_l3_approved_trades, JAPendingApplicationMetadata ja_pending_application, KnowledgeCheckNeededRequestMetadata knowledge_check_needed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OnboardingScreenRequest(start, splash_l0, splash_l2, splash_retirement, question_option_experience, question_understand_spread, question_investment_advice, question_financial_regulator, suitability, investment_profile, disclosure, approved_trades, success, failure, education_spread, education_l3_strategies, ready_l3_upgrade, upsell_alert, upsell_trade_on_expiration, upsell_all_set, end, experience_test_questionnaire, knowledge_test_questionnaire, investor_profile, review_investor_profile, education_home, education_strategy, education_risks, education_professional_trader, uk_l3_education_home, uk_l3_education_spread_benefits, rhsg_home, rhsg_complete_car_questionnaire, professional_trader, rhsg_l2_approved_trades, rhsg_l3_approved_trades, ja_pending_application, knowledge_check_needed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingScreenRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OnboardingScreenRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.OnboardingScreenRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SplashL0RequestMetadata splashL0RequestMetadataDecode = null;
                SplashL2RequestMetadata splashL2RequestMetadataDecode = null;
                SplashRetirementRequestMetadata splashRetirementRequestMetadataDecode = null;
                QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadataDecode = null;
                QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadataDecode = null;
                QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadataDecode = null;
                QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadataDecode = null;
                SuitabilityRequestMetadata suitabilityRequestMetadataDecode = null;
                InvestmentProfileRequestMetadata investmentProfileRequestMetadataDecode = null;
                DisclosureRequestMetadata disclosureRequestMetadataDecode = null;
                ApprovedTradesRequestMetadata approvedTradesRequestMetadataDecode = null;
                SuccessRequestMetadata successRequestMetadataDecode = null;
                FailureRequestMetadata failureRequestMetadataDecode = null;
                EducationSpreadRequestMetadata educationSpreadRequestMetadataDecode = null;
                EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadataDecode = null;
                ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadataDecode = null;
                UpsellAlertRequestMetadata upsellAlertRequestMetadataDecode = null;
                UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadataDecode = null;
                UpsellAllSetRequestMetadata upsellAllSetRequestMetadataDecode = null;
                EndRequestMetadata endRequestMetadataDecode = null;
                ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadataDecode = null;
                KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadataDecode = null;
                InvestorProfileV2RequestMetadata investorProfileV2RequestMetadataDecode = null;
                ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadataDecode = null;
                UKEducationHomeRequestMetadata uKEducationHomeRequestMetadataDecode = null;
                UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadataDecode = null;
                UKEducationRisksRequestMetadata uKEducationRisksRequestMetadataDecode = null;
                UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadataDecode = null;
                UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadataDecode = null;
                UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadataDecode = null;
                RHSGHomeRequestMetadata rHSGHomeRequestMetadataDecode = null;
                RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadataDecode = null;
                ProfessionalTraderRequestMetadata professionalTraderRequestMetadataDecode = null;
                RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadataDecode = null;
                RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadataDecode = null;
                JAPendingApplicationMetadata jAPendingApplicationMetadataDecode = null;
                KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadataDecode = null;
                StartRequestMetadata startRequestMetadataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    SplashL0RequestMetadata splashL0RequestMetadata = splashL0RequestMetadataDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                startRequestMetadataDecode = StartRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 2:
                                splashL0RequestMetadataDecode = SplashL0RequestMetadata.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                splashL2RequestMetadataDecode = SplashL2RequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 4:
                                splashRetirementRequestMetadataDecode = SplashRetirementRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 5:
                                questionOptionExperienceRequestMetadataDecode = QuestionOptionExperienceRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 6:
                                questionUnderstandSpreadRequestMetadataDecode = QuestionUnderstandSpreadRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 7:
                                questionInvestmentAdviceRequestMetadataDecode = QuestionInvestmentAdviceRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 8:
                                questionFinancialRegulatorRequestMetadataDecode = QuestionFinancialRegulatorRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 9:
                                suitabilityRequestMetadataDecode = SuitabilityRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 10:
                                investmentProfileRequestMetadataDecode = InvestmentProfileRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 11:
                                disclosureRequestMetadataDecode = DisclosureRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 12:
                                approvedTradesRequestMetadataDecode = ApprovedTradesRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 13:
                                successRequestMetadataDecode = SuccessRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 14:
                                failureRequestMetadataDecode = FailureRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 15:
                                educationSpreadRequestMetadataDecode = EducationSpreadRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 16:
                                educationL3StrategiesRequestMetadataDecode = EducationL3StrategiesRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 17:
                                readyL3UpgradeRequestMetadataDecode = ReadyL3UpgradeRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 18:
                                upsellAlertRequestMetadataDecode = UpsellAlertRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 19:
                                upsellTradeOnExpirationRequestMetadataDecode = UpsellTradeOnExpirationRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 20:
                                upsellAllSetRequestMetadataDecode = UpsellAllSetRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 21:
                                endRequestMetadataDecode = EndRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 22:
                                experienceTestQuestionnaireRequestMetadataDecode = ExperienceTestQuestionnaireRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 23:
                                knowledgeTestQuestionnaireRequestMetadataDecode = KnowledgeTestQuestionnaireRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 24:
                                investorProfileV2RequestMetadataDecode = InvestorProfileV2RequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 25:
                                reviewInvestorProfileV2RequestMetadataDecode = ReviewInvestorProfileV2RequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 26:
                                uKEducationHomeRequestMetadataDecode = UKEducationHomeRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 27:
                                uKEducationStrategyRequestMetadataDecode = UKEducationStrategyRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 28:
                                uKEducationRisksRequestMetadataDecode = UKEducationRisksRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 29:
                                uKEducationProfessionalTraderRequestMetadataDecode = UKEducationProfessionalTraderRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 30:
                                uKL3EducationHomeRequestMetadataDecode = UKL3EducationHomeRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 31:
                                uKL3EducationSpreadBenefitsRequestMetadataDecode = UKL3EducationSpreadBenefitsRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 32:
                                rHSGHomeRequestMetadataDecode = RHSGHomeRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 33:
                                rHSGCompleteCARQuestionnaireRequestMetadataDecode = RHSGCompleteCARQuestionnaireRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 34:
                                professionalTraderRequestMetadataDecode = ProfessionalTraderRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 35:
                                rHSGL2ApprovedTradesRequestMetadataDecode = RHSGL2ApprovedTradesRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 36:
                                rHSGL3ApprovedTradesRequestMetadataDecode = RHSGL3ApprovedTradesRequestMetadata.ADAPTER.decode(reader);
                                break;
                            case 37:
                                jAPendingApplicationMetadataDecode = JAPendingApplicationMetadata.ADAPTER.decode(reader);
                                break;
                            case 38:
                                knowledgeCheckNeededRequestMetadataDecode = KnowledgeCheckNeededRequestMetadata.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        splashL0RequestMetadataDecode = splashL0RequestMetadata;
                    } else {
                        return new OnboardingScreenRequest(startRequestMetadataDecode, splashL0RequestMetadata, splashL2RequestMetadataDecode, splashRetirementRequestMetadataDecode, questionOptionExperienceRequestMetadataDecode, questionUnderstandSpreadRequestMetadataDecode, questionInvestmentAdviceRequestMetadataDecode, questionFinancialRegulatorRequestMetadataDecode, suitabilityRequestMetadataDecode, investmentProfileRequestMetadataDecode, disclosureRequestMetadataDecode, approvedTradesRequestMetadataDecode, successRequestMetadataDecode, failureRequestMetadataDecode, educationSpreadRequestMetadataDecode, educationL3StrategiesRequestMetadataDecode, readyL3UpgradeRequestMetadataDecode, upsellAlertRequestMetadataDecode, upsellTradeOnExpirationRequestMetadataDecode, upsellAllSetRequestMetadataDecode, endRequestMetadataDecode, experienceTestQuestionnaireRequestMetadataDecode, knowledgeTestQuestionnaireRequestMetadataDecode, investorProfileV2RequestMetadataDecode, reviewInvestorProfileV2RequestMetadataDecode, uKEducationHomeRequestMetadataDecode, uKEducationStrategyRequestMetadataDecode, uKEducationRisksRequestMetadataDecode, uKEducationProfessionalTraderRequestMetadataDecode, uKL3EducationHomeRequestMetadataDecode, uKL3EducationSpreadBenefitsRequestMetadataDecode, rHSGHomeRequestMetadataDecode, rHSGCompleteCARQuestionnaireRequestMetadataDecode, professionalTraderRequestMetadataDecode, rHSGL2ApprovedTradesRequestMetadataDecode, rHSGL3ApprovedTradesRequestMetadataDecode, jAPendingApplicationMetadataDecode, knowledgeCheckNeededRequestMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OnboardingScreenRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StartRequestMetadata.ADAPTER.encodedSizeWithTag(1, value.getStart()) + SplashL0RequestMetadata.ADAPTER.encodedSizeWithTag(2, value.getSplash_l0()) + SplashL2RequestMetadata.ADAPTER.encodedSizeWithTag(3, value.getSplash_l2()) + SplashRetirementRequestMetadata.ADAPTER.encodedSizeWithTag(4, value.getSplash_retirement()) + QuestionOptionExperienceRequestMetadata.ADAPTER.encodedSizeWithTag(5, value.getQuestion_option_experience()) + QuestionUnderstandSpreadRequestMetadata.ADAPTER.encodedSizeWithTag(6, value.getQuestion_understand_spread()) + QuestionInvestmentAdviceRequestMetadata.ADAPTER.encodedSizeWithTag(7, value.getQuestion_investment_advice()) + QuestionFinancialRegulatorRequestMetadata.ADAPTER.encodedSizeWithTag(8, value.getQuestion_financial_regulator()) + SuitabilityRequestMetadata.ADAPTER.encodedSizeWithTag(9, value.getSuitability()) + InvestmentProfileRequestMetadata.ADAPTER.encodedSizeWithTag(10, value.getInvestment_profile()) + DisclosureRequestMetadata.ADAPTER.encodedSizeWithTag(11, value.getDisclosure()) + ApprovedTradesRequestMetadata.ADAPTER.encodedSizeWithTag(12, value.getApproved_trades()) + SuccessRequestMetadata.ADAPTER.encodedSizeWithTag(13, value.getSuccess()) + FailureRequestMetadata.ADAPTER.encodedSizeWithTag(14, value.getFailure()) + EducationSpreadRequestMetadata.ADAPTER.encodedSizeWithTag(15, value.getEducation_spread()) + EducationL3StrategiesRequestMetadata.ADAPTER.encodedSizeWithTag(16, value.getEducation_l3_strategies()) + ReadyL3UpgradeRequestMetadata.ADAPTER.encodedSizeWithTag(17, value.getReady_l3_upgrade()) + UpsellAlertRequestMetadata.ADAPTER.encodedSizeWithTag(18, value.getUpsell_alert()) + UpsellTradeOnExpirationRequestMetadata.ADAPTER.encodedSizeWithTag(19, value.getUpsell_trade_on_expiration()) + UpsellAllSetRequestMetadata.ADAPTER.encodedSizeWithTag(20, value.getUpsell_all_set()) + EndRequestMetadata.ADAPTER.encodedSizeWithTag(21, value.getEnd()) + ExperienceTestQuestionnaireRequestMetadata.ADAPTER.encodedSizeWithTag(22, value.getExperience_test_questionnaire()) + KnowledgeTestQuestionnaireRequestMetadata.ADAPTER.encodedSizeWithTag(23, value.getKnowledge_test_questionnaire()) + InvestorProfileV2RequestMetadata.ADAPTER.encodedSizeWithTag(24, value.getInvestor_profile()) + ReviewInvestorProfileV2RequestMetadata.ADAPTER.encodedSizeWithTag(25, value.getReview_investor_profile()) + UKEducationHomeRequestMetadata.ADAPTER.encodedSizeWithTag(26, value.getEducation_home()) + UKEducationStrategyRequestMetadata.ADAPTER.encodedSizeWithTag(27, value.getEducation_strategy()) + UKEducationRisksRequestMetadata.ADAPTER.encodedSizeWithTag(28, value.getEducation_risks()) + UKEducationProfessionalTraderRequestMetadata.ADAPTER.encodedSizeWithTag(29, value.getEducation_professional_trader()) + UKL3EducationHomeRequestMetadata.ADAPTER.encodedSizeWithTag(30, value.getUk_l3_education_home()) + UKL3EducationSpreadBenefitsRequestMetadata.ADAPTER.encodedSizeWithTag(31, value.getUk_l3_education_spread_benefits()) + RHSGHomeRequestMetadata.ADAPTER.encodedSizeWithTag(32, value.getRhsg_home()) + RHSGCompleteCARQuestionnaireRequestMetadata.ADAPTER.encodedSizeWithTag(33, value.getRhsg_complete_car_questionnaire()) + ProfessionalTraderRequestMetadata.ADAPTER.encodedSizeWithTag(34, value.getProfessional_trader()) + RHSGL2ApprovedTradesRequestMetadata.ADAPTER.encodedSizeWithTag(35, value.getRhsg_l2_approved_trades()) + RHSGL3ApprovedTradesRequestMetadata.ADAPTER.encodedSizeWithTag(36, value.getRhsg_l3_approved_trades()) + JAPendingApplicationMetadata.ADAPTER.encodedSizeWithTag(37, value.getJa_pending_application()) + KnowledgeCheckNeededRequestMetadata.ADAPTER.encodedSizeWithTag(38, value.getKnowledge_check_needed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OnboardingScreenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StartRequestMetadata.ADAPTER.encodeWithTag(writer, 1, (int) value.getStart());
                SplashL0RequestMetadata.ADAPTER.encodeWithTag(writer, 2, (int) value.getSplash_l0());
                SplashL2RequestMetadata.ADAPTER.encodeWithTag(writer, 3, (int) value.getSplash_l2());
                SplashRetirementRequestMetadata.ADAPTER.encodeWithTag(writer, 4, (int) value.getSplash_retirement());
                QuestionOptionExperienceRequestMetadata.ADAPTER.encodeWithTag(writer, 5, (int) value.getQuestion_option_experience());
                QuestionUnderstandSpreadRequestMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getQuestion_understand_spread());
                QuestionInvestmentAdviceRequestMetadata.ADAPTER.encodeWithTag(writer, 7, (int) value.getQuestion_investment_advice());
                QuestionFinancialRegulatorRequestMetadata.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuestion_financial_regulator());
                SuitabilityRequestMetadata.ADAPTER.encodeWithTag(writer, 9, (int) value.getSuitability());
                InvestmentProfileRequestMetadata.ADAPTER.encodeWithTag(writer, 10, (int) value.getInvestment_profile());
                DisclosureRequestMetadata.ADAPTER.encodeWithTag(writer, 11, (int) value.getDisclosure());
                ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getApproved_trades());
                SuccessRequestMetadata.ADAPTER.encodeWithTag(writer, 13, (int) value.getSuccess());
                FailureRequestMetadata.ADAPTER.encodeWithTag(writer, 14, (int) value.getFailure());
                EducationSpreadRequestMetadata.ADAPTER.encodeWithTag(writer, 15, (int) value.getEducation_spread());
                EducationL3StrategiesRequestMetadata.ADAPTER.encodeWithTag(writer, 16, (int) value.getEducation_l3_strategies());
                ReadyL3UpgradeRequestMetadata.ADAPTER.encodeWithTag(writer, 17, (int) value.getReady_l3_upgrade());
                UpsellAlertRequestMetadata.ADAPTER.encodeWithTag(writer, 18, (int) value.getUpsell_alert());
                UpsellTradeOnExpirationRequestMetadata.ADAPTER.encodeWithTag(writer, 19, (int) value.getUpsell_trade_on_expiration());
                UpsellAllSetRequestMetadata.ADAPTER.encodeWithTag(writer, 20, (int) value.getUpsell_all_set());
                EndRequestMetadata.ADAPTER.encodeWithTag(writer, 21, (int) value.getEnd());
                ExperienceTestQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 22, (int) value.getExperience_test_questionnaire());
                KnowledgeTestQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 23, (int) value.getKnowledge_test_questionnaire());
                InvestorProfileV2RequestMetadata.ADAPTER.encodeWithTag(writer, 24, (int) value.getInvestor_profile());
                ReviewInvestorProfileV2RequestMetadata.ADAPTER.encodeWithTag(writer, 25, (int) value.getReview_investor_profile());
                UKEducationHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 26, (int) value.getEducation_home());
                UKEducationStrategyRequestMetadata.ADAPTER.encodeWithTag(writer, 27, (int) value.getEducation_strategy());
                UKEducationRisksRequestMetadata.ADAPTER.encodeWithTag(writer, 28, (int) value.getEducation_risks());
                UKEducationProfessionalTraderRequestMetadata.ADAPTER.encodeWithTag(writer, 29, (int) value.getEducation_professional_trader());
                UKL3EducationHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 30, (int) value.getUk_l3_education_home());
                UKL3EducationSpreadBenefitsRequestMetadata.ADAPTER.encodeWithTag(writer, 31, (int) value.getUk_l3_education_spread_benefits());
                RHSGHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 32, (int) value.getRhsg_home());
                RHSGCompleteCARQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 33, (int) value.getRhsg_complete_car_questionnaire());
                ProfessionalTraderRequestMetadata.ADAPTER.encodeWithTag(writer, 34, (int) value.getProfessional_trader());
                RHSGL2ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 35, (int) value.getRhsg_l2_approved_trades());
                RHSGL3ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 36, (int) value.getRhsg_l3_approved_trades());
                JAPendingApplicationMetadata.ADAPTER.encodeWithTag(writer, 37, (int) value.getJa_pending_application());
                KnowledgeCheckNeededRequestMetadata.ADAPTER.encodeWithTag(writer, 38, (int) value.getKnowledge_check_needed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OnboardingScreenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                KnowledgeCheckNeededRequestMetadata.ADAPTER.encodeWithTag(writer, 38, (int) value.getKnowledge_check_needed());
                JAPendingApplicationMetadata.ADAPTER.encodeWithTag(writer, 37, (int) value.getJa_pending_application());
                RHSGL3ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 36, (int) value.getRhsg_l3_approved_trades());
                RHSGL2ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 35, (int) value.getRhsg_l2_approved_trades());
                ProfessionalTraderRequestMetadata.ADAPTER.encodeWithTag(writer, 34, (int) value.getProfessional_trader());
                RHSGCompleteCARQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 33, (int) value.getRhsg_complete_car_questionnaire());
                RHSGHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 32, (int) value.getRhsg_home());
                UKL3EducationSpreadBenefitsRequestMetadata.ADAPTER.encodeWithTag(writer, 31, (int) value.getUk_l3_education_spread_benefits());
                UKL3EducationHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 30, (int) value.getUk_l3_education_home());
                UKEducationProfessionalTraderRequestMetadata.ADAPTER.encodeWithTag(writer, 29, (int) value.getEducation_professional_trader());
                UKEducationRisksRequestMetadata.ADAPTER.encodeWithTag(writer, 28, (int) value.getEducation_risks());
                UKEducationStrategyRequestMetadata.ADAPTER.encodeWithTag(writer, 27, (int) value.getEducation_strategy());
                UKEducationHomeRequestMetadata.ADAPTER.encodeWithTag(writer, 26, (int) value.getEducation_home());
                ReviewInvestorProfileV2RequestMetadata.ADAPTER.encodeWithTag(writer, 25, (int) value.getReview_investor_profile());
                InvestorProfileV2RequestMetadata.ADAPTER.encodeWithTag(writer, 24, (int) value.getInvestor_profile());
                KnowledgeTestQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 23, (int) value.getKnowledge_test_questionnaire());
                ExperienceTestQuestionnaireRequestMetadata.ADAPTER.encodeWithTag(writer, 22, (int) value.getExperience_test_questionnaire());
                EndRequestMetadata.ADAPTER.encodeWithTag(writer, 21, (int) value.getEnd());
                UpsellAllSetRequestMetadata.ADAPTER.encodeWithTag(writer, 20, (int) value.getUpsell_all_set());
                UpsellTradeOnExpirationRequestMetadata.ADAPTER.encodeWithTag(writer, 19, (int) value.getUpsell_trade_on_expiration());
                UpsellAlertRequestMetadata.ADAPTER.encodeWithTag(writer, 18, (int) value.getUpsell_alert());
                ReadyL3UpgradeRequestMetadata.ADAPTER.encodeWithTag(writer, 17, (int) value.getReady_l3_upgrade());
                EducationL3StrategiesRequestMetadata.ADAPTER.encodeWithTag(writer, 16, (int) value.getEducation_l3_strategies());
                EducationSpreadRequestMetadata.ADAPTER.encodeWithTag(writer, 15, (int) value.getEducation_spread());
                FailureRequestMetadata.ADAPTER.encodeWithTag(writer, 14, (int) value.getFailure());
                SuccessRequestMetadata.ADAPTER.encodeWithTag(writer, 13, (int) value.getSuccess());
                ApprovedTradesRequestMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getApproved_trades());
                DisclosureRequestMetadata.ADAPTER.encodeWithTag(writer, 11, (int) value.getDisclosure());
                InvestmentProfileRequestMetadata.ADAPTER.encodeWithTag(writer, 10, (int) value.getInvestment_profile());
                SuitabilityRequestMetadata.ADAPTER.encodeWithTag(writer, 9, (int) value.getSuitability());
                QuestionFinancialRegulatorRequestMetadata.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuestion_financial_regulator());
                QuestionInvestmentAdviceRequestMetadata.ADAPTER.encodeWithTag(writer, 7, (int) value.getQuestion_investment_advice());
                QuestionUnderstandSpreadRequestMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getQuestion_understand_spread());
                QuestionOptionExperienceRequestMetadata.ADAPTER.encodeWithTag(writer, 5, (int) value.getQuestion_option_experience());
                SplashRetirementRequestMetadata.ADAPTER.encodeWithTag(writer, 4, (int) value.getSplash_retirement());
                SplashL2RequestMetadata.ADAPTER.encodeWithTag(writer, 3, (int) value.getSplash_l2());
                SplashL0RequestMetadata.ADAPTER.encodeWithTag(writer, 2, (int) value.getSplash_l0());
                StartRequestMetadata.ADAPTER.encodeWithTag(writer, 1, (int) value.getStart());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenRequest redact(OnboardingScreenRequest value) {
                EducationSpreadRequestMetadata educationSpreadRequestMetadata;
                ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata;
                UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata;
                EndRequestMetadata endRequestMetadata;
                KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata;
                ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata;
                UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata;
                UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata;
                UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata;
                RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata;
                RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata;
                KnowledgeCheckNeededRequestMetadata knowledgeCheckNeededRequestMetadataRedact;
                JAPendingApplicationMetadata jAPendingApplicationMetadata;
                Intrinsics.checkNotNullParameter(value, "value");
                StartRequestMetadata start = value.getStart();
                StartRequestMetadata startRequestMetadataRedact = start != null ? StartRequestMetadata.ADAPTER.redact(start) : null;
                SplashL0RequestMetadata splash_l0 = value.getSplash_l0();
                SplashL0RequestMetadata splashL0RequestMetadataRedact = splash_l0 != null ? SplashL0RequestMetadata.ADAPTER.redact(splash_l0) : null;
                SplashL2RequestMetadata splash_l2 = value.getSplash_l2();
                SplashL2RequestMetadata splashL2RequestMetadataRedact = splash_l2 != null ? SplashL2RequestMetadata.ADAPTER.redact(splash_l2) : null;
                SplashRetirementRequestMetadata splash_retirement = value.getSplash_retirement();
                SplashRetirementRequestMetadata splashRetirementRequestMetadataRedact = splash_retirement != null ? SplashRetirementRequestMetadata.ADAPTER.redact(splash_retirement) : null;
                QuestionOptionExperienceRequestMetadata question_option_experience = value.getQuestion_option_experience();
                QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadataRedact = question_option_experience != null ? QuestionOptionExperienceRequestMetadata.ADAPTER.redact(question_option_experience) : null;
                QuestionUnderstandSpreadRequestMetadata question_understand_spread = value.getQuestion_understand_spread();
                QuestionUnderstandSpreadRequestMetadata questionUnderstandSpreadRequestMetadataRedact = question_understand_spread != null ? QuestionUnderstandSpreadRequestMetadata.ADAPTER.redact(question_understand_spread) : null;
                QuestionInvestmentAdviceRequestMetadata question_investment_advice = value.getQuestion_investment_advice();
                QuestionInvestmentAdviceRequestMetadata questionInvestmentAdviceRequestMetadataRedact = question_investment_advice != null ? QuestionInvestmentAdviceRequestMetadata.ADAPTER.redact(question_investment_advice) : null;
                QuestionFinancialRegulatorRequestMetadata question_financial_regulator = value.getQuestion_financial_regulator();
                QuestionFinancialRegulatorRequestMetadata questionFinancialRegulatorRequestMetadataRedact = question_financial_regulator != null ? QuestionFinancialRegulatorRequestMetadata.ADAPTER.redact(question_financial_regulator) : null;
                SuitabilityRequestMetadata suitability = value.getSuitability();
                SuitabilityRequestMetadata suitabilityRequestMetadataRedact = suitability != null ? SuitabilityRequestMetadata.ADAPTER.redact(suitability) : null;
                InvestmentProfileRequestMetadata investment_profile = value.getInvestment_profile();
                InvestmentProfileRequestMetadata investmentProfileRequestMetadataRedact = investment_profile != null ? InvestmentProfileRequestMetadata.ADAPTER.redact(investment_profile) : null;
                DisclosureRequestMetadata disclosure = value.getDisclosure();
                DisclosureRequestMetadata disclosureRequestMetadataRedact = disclosure != null ? DisclosureRequestMetadata.ADAPTER.redact(disclosure) : null;
                ApprovedTradesRequestMetadata approved_trades = value.getApproved_trades();
                ApprovedTradesRequestMetadata approvedTradesRequestMetadataRedact = approved_trades != null ? ApprovedTradesRequestMetadata.ADAPTER.redact(approved_trades) : null;
                SuccessRequestMetadata success = value.getSuccess();
                SuccessRequestMetadata successRequestMetadataRedact = success != null ? SuccessRequestMetadata.ADAPTER.redact(success) : null;
                FailureRequestMetadata failure = value.getFailure();
                FailureRequestMetadata failureRequestMetadataRedact = failure != null ? FailureRequestMetadata.ADAPTER.redact(failure) : null;
                EducationSpreadRequestMetadata education_spread = value.getEducation_spread();
                StartRequestMetadata startRequestMetadata = startRequestMetadataRedact;
                EducationSpreadRequestMetadata educationSpreadRequestMetadataRedact = education_spread != null ? EducationSpreadRequestMetadata.ADAPTER.redact(education_spread) : null;
                EducationL3StrategiesRequestMetadata education_l3_strategies = value.getEducation_l3_strategies();
                EducationSpreadRequestMetadata educationSpreadRequestMetadata2 = educationSpreadRequestMetadataRedact;
                EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadataRedact = education_l3_strategies != null ? EducationL3StrategiesRequestMetadata.ADAPTER.redact(education_l3_strategies) : null;
                ReadyL3UpgradeRequestMetadata ready_l3_upgrade = value.getReady_l3_upgrade();
                EducationL3StrategiesRequestMetadata educationL3StrategiesRequestMetadata = educationL3StrategiesRequestMetadataRedact;
                ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadataRedact = ready_l3_upgrade != null ? ReadyL3UpgradeRequestMetadata.ADAPTER.redact(ready_l3_upgrade) : null;
                UpsellAlertRequestMetadata upsell_alert = value.getUpsell_alert();
                ReadyL3UpgradeRequestMetadata readyL3UpgradeRequestMetadata2 = readyL3UpgradeRequestMetadataRedact;
                UpsellAlertRequestMetadata upsellAlertRequestMetadataRedact = upsell_alert != null ? UpsellAlertRequestMetadata.ADAPTER.redact(upsell_alert) : null;
                UpsellTradeOnExpirationRequestMetadata upsell_trade_on_expiration = value.getUpsell_trade_on_expiration();
                UpsellAlertRequestMetadata upsellAlertRequestMetadata = upsellAlertRequestMetadataRedact;
                UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadataRedact = upsell_trade_on_expiration != null ? UpsellTradeOnExpirationRequestMetadata.ADAPTER.redact(upsell_trade_on_expiration) : null;
                UpsellAllSetRequestMetadata upsell_all_set = value.getUpsell_all_set();
                UpsellTradeOnExpirationRequestMetadata upsellTradeOnExpirationRequestMetadata2 = upsellTradeOnExpirationRequestMetadataRedact;
                UpsellAllSetRequestMetadata upsellAllSetRequestMetadataRedact = upsell_all_set != null ? UpsellAllSetRequestMetadata.ADAPTER.redact(upsell_all_set) : null;
                EndRequestMetadata end = value.getEnd();
                UpsellAllSetRequestMetadata upsellAllSetRequestMetadata = upsellAllSetRequestMetadataRedact;
                EndRequestMetadata endRequestMetadataRedact = end != null ? EndRequestMetadata.ADAPTER.redact(end) : null;
                ExperienceTestQuestionnaireRequestMetadata experience_test_questionnaire = value.getExperience_test_questionnaire();
                EndRequestMetadata endRequestMetadata2 = endRequestMetadataRedact;
                ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadataRedact = experience_test_questionnaire != null ? ExperienceTestQuestionnaireRequestMetadata.ADAPTER.redact(experience_test_questionnaire) : null;
                KnowledgeTestQuestionnaireRequestMetadata knowledge_test_questionnaire = value.getKnowledge_test_questionnaire();
                ExperienceTestQuestionnaireRequestMetadata experienceTestQuestionnaireRequestMetadata = experienceTestQuestionnaireRequestMetadataRedact;
                KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadataRedact = knowledge_test_questionnaire != null ? KnowledgeTestQuestionnaireRequestMetadata.ADAPTER.redact(knowledge_test_questionnaire) : null;
                InvestorProfileV2RequestMetadata investor_profile = value.getInvestor_profile();
                KnowledgeTestQuestionnaireRequestMetadata knowledgeTestQuestionnaireRequestMetadata2 = knowledgeTestQuestionnaireRequestMetadataRedact;
                InvestorProfileV2RequestMetadata investorProfileV2RequestMetadataRedact = investor_profile != null ? InvestorProfileV2RequestMetadata.ADAPTER.redact(investor_profile) : null;
                ReviewInvestorProfileV2RequestMetadata review_investor_profile = value.getReview_investor_profile();
                InvestorProfileV2RequestMetadata investorProfileV2RequestMetadata = investorProfileV2RequestMetadataRedact;
                ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadataRedact = review_investor_profile != null ? ReviewInvestorProfileV2RequestMetadata.ADAPTER.redact(review_investor_profile) : null;
                UKEducationHomeRequestMetadata education_home = value.getEducation_home();
                ReviewInvestorProfileV2RequestMetadata reviewInvestorProfileV2RequestMetadata2 = reviewInvestorProfileV2RequestMetadataRedact;
                UKEducationHomeRequestMetadata uKEducationHomeRequestMetadataRedact = education_home != null ? UKEducationHomeRequestMetadata.ADAPTER.redact(education_home) : null;
                UKEducationStrategyRequestMetadata education_strategy = value.getEducation_strategy();
                UKEducationHomeRequestMetadata uKEducationHomeRequestMetadata = uKEducationHomeRequestMetadataRedact;
                UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadataRedact = education_strategy != null ? UKEducationStrategyRequestMetadata.ADAPTER.redact(education_strategy) : null;
                UKEducationRisksRequestMetadata education_risks = value.getEducation_risks();
                UKEducationStrategyRequestMetadata uKEducationStrategyRequestMetadata2 = uKEducationStrategyRequestMetadataRedact;
                UKEducationRisksRequestMetadata uKEducationRisksRequestMetadataRedact = education_risks != null ? UKEducationRisksRequestMetadata.ADAPTER.redact(education_risks) : null;
                UKEducationProfessionalTraderRequestMetadata education_professional_trader = value.getEducation_professional_trader();
                UKEducationRisksRequestMetadata uKEducationRisksRequestMetadata = uKEducationRisksRequestMetadataRedact;
                UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadataRedact = education_professional_trader != null ? UKEducationProfessionalTraderRequestMetadata.ADAPTER.redact(education_professional_trader) : null;
                UKL3EducationHomeRequestMetadata uk_l3_education_home = value.getUk_l3_education_home();
                UKEducationProfessionalTraderRequestMetadata uKEducationProfessionalTraderRequestMetadata2 = uKEducationProfessionalTraderRequestMetadataRedact;
                UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadataRedact = uk_l3_education_home != null ? UKL3EducationHomeRequestMetadata.ADAPTER.redact(uk_l3_education_home) : null;
                UKL3EducationSpreadBenefitsRequestMetadata uk_l3_education_spread_benefits = value.getUk_l3_education_spread_benefits();
                UKL3EducationHomeRequestMetadata uKL3EducationHomeRequestMetadata = uKL3EducationHomeRequestMetadataRedact;
                UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadataRedact = uk_l3_education_spread_benefits != null ? UKL3EducationSpreadBenefitsRequestMetadata.ADAPTER.redact(uk_l3_education_spread_benefits) : null;
                RHSGHomeRequestMetadata rhsg_home = value.getRhsg_home();
                UKL3EducationSpreadBenefitsRequestMetadata uKL3EducationSpreadBenefitsRequestMetadata2 = uKL3EducationSpreadBenefitsRequestMetadataRedact;
                RHSGHomeRequestMetadata rHSGHomeRequestMetadataRedact = rhsg_home != null ? RHSGHomeRequestMetadata.ADAPTER.redact(rhsg_home) : null;
                RHSGCompleteCARQuestionnaireRequestMetadata rhsg_complete_car_questionnaire = value.getRhsg_complete_car_questionnaire();
                RHSGHomeRequestMetadata rHSGHomeRequestMetadata = rHSGHomeRequestMetadataRedact;
                RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadataRedact = rhsg_complete_car_questionnaire != null ? RHSGCompleteCARQuestionnaireRequestMetadata.ADAPTER.redact(rhsg_complete_car_questionnaire) : null;
                ProfessionalTraderRequestMetadata professional_trader = value.getProfessional_trader();
                RHSGCompleteCARQuestionnaireRequestMetadata rHSGCompleteCARQuestionnaireRequestMetadata2 = rHSGCompleteCARQuestionnaireRequestMetadataRedact;
                ProfessionalTraderRequestMetadata professionalTraderRequestMetadataRedact = professional_trader != null ? ProfessionalTraderRequestMetadata.ADAPTER.redact(professional_trader) : null;
                RHSGL2ApprovedTradesRequestMetadata rhsg_l2_approved_trades = value.getRhsg_l2_approved_trades();
                ProfessionalTraderRequestMetadata professionalTraderRequestMetadata = professionalTraderRequestMetadataRedact;
                RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadataRedact = rhsg_l2_approved_trades != null ? RHSGL2ApprovedTradesRequestMetadata.ADAPTER.redact(rhsg_l2_approved_trades) : null;
                RHSGL3ApprovedTradesRequestMetadata rhsg_l3_approved_trades = value.getRhsg_l3_approved_trades();
                RHSGL2ApprovedTradesRequestMetadata rHSGL2ApprovedTradesRequestMetadata2 = rHSGL2ApprovedTradesRequestMetadataRedact;
                RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadataRedact = rhsg_l3_approved_trades != null ? RHSGL3ApprovedTradesRequestMetadata.ADAPTER.redact(rhsg_l3_approved_trades) : null;
                JAPendingApplicationMetadata ja_pending_application = value.getJa_pending_application();
                RHSGL3ApprovedTradesRequestMetadata rHSGL3ApprovedTradesRequestMetadata = rHSGL3ApprovedTradesRequestMetadataRedact;
                JAPendingApplicationMetadata jAPendingApplicationMetadataRedact = ja_pending_application != null ? JAPendingApplicationMetadata.ADAPTER.redact(ja_pending_application) : null;
                KnowledgeCheckNeededRequestMetadata knowledge_check_needed = value.getKnowledge_check_needed();
                if (knowledge_check_needed != null) {
                    knowledgeCheckNeededRequestMetadataRedact = KnowledgeCheckNeededRequestMetadata.ADAPTER.redact(knowledge_check_needed);
                    educationSpreadRequestMetadata = educationSpreadRequestMetadata2;
                    readyL3UpgradeRequestMetadata = readyL3UpgradeRequestMetadata2;
                    upsellTradeOnExpirationRequestMetadata = upsellTradeOnExpirationRequestMetadata2;
                    endRequestMetadata = endRequestMetadata2;
                    knowledgeTestQuestionnaireRequestMetadata = knowledgeTestQuestionnaireRequestMetadata2;
                    reviewInvestorProfileV2RequestMetadata = reviewInvestorProfileV2RequestMetadata2;
                    uKEducationStrategyRequestMetadata = uKEducationStrategyRequestMetadata2;
                    uKEducationProfessionalTraderRequestMetadata = uKEducationProfessionalTraderRequestMetadata2;
                    uKL3EducationSpreadBenefitsRequestMetadata = uKL3EducationSpreadBenefitsRequestMetadata2;
                    rHSGCompleteCARQuestionnaireRequestMetadata = rHSGCompleteCARQuestionnaireRequestMetadata2;
                    rHSGL2ApprovedTradesRequestMetadata = rHSGL2ApprovedTradesRequestMetadata2;
                    jAPendingApplicationMetadata = jAPendingApplicationMetadataRedact;
                } else {
                    educationSpreadRequestMetadata = educationSpreadRequestMetadata2;
                    readyL3UpgradeRequestMetadata = readyL3UpgradeRequestMetadata2;
                    upsellTradeOnExpirationRequestMetadata = upsellTradeOnExpirationRequestMetadata2;
                    endRequestMetadata = endRequestMetadata2;
                    knowledgeTestQuestionnaireRequestMetadata = knowledgeTestQuestionnaireRequestMetadata2;
                    reviewInvestorProfileV2RequestMetadata = reviewInvestorProfileV2RequestMetadata2;
                    uKEducationStrategyRequestMetadata = uKEducationStrategyRequestMetadata2;
                    uKEducationProfessionalTraderRequestMetadata = uKEducationProfessionalTraderRequestMetadata2;
                    uKL3EducationSpreadBenefitsRequestMetadata = uKL3EducationSpreadBenefitsRequestMetadata2;
                    rHSGCompleteCARQuestionnaireRequestMetadata = rHSGCompleteCARQuestionnaireRequestMetadata2;
                    rHSGL2ApprovedTradesRequestMetadata = rHSGL2ApprovedTradesRequestMetadata2;
                    knowledgeCheckNeededRequestMetadataRedact = null;
                    jAPendingApplicationMetadata = jAPendingApplicationMetadataRedact;
                }
                return value.copy(startRequestMetadata, splashL0RequestMetadataRedact, splashL2RequestMetadataRedact, splashRetirementRequestMetadataRedact, questionOptionExperienceRequestMetadataRedact, questionUnderstandSpreadRequestMetadataRedact, questionInvestmentAdviceRequestMetadataRedact, questionFinancialRegulatorRequestMetadataRedact, suitabilityRequestMetadataRedact, investmentProfileRequestMetadataRedact, disclosureRequestMetadataRedact, approvedTradesRequestMetadataRedact, successRequestMetadataRedact, failureRequestMetadataRedact, educationSpreadRequestMetadata, educationL3StrategiesRequestMetadata, readyL3UpgradeRequestMetadata, upsellAlertRequestMetadata, upsellTradeOnExpirationRequestMetadata, upsellAllSetRequestMetadata, endRequestMetadata, experienceTestQuestionnaireRequestMetadata, knowledgeTestQuestionnaireRequestMetadata, investorProfileV2RequestMetadata, reviewInvestorProfileV2RequestMetadata, uKEducationHomeRequestMetadata, uKEducationStrategyRequestMetadata, uKEducationRisksRequestMetadata, uKEducationProfessionalTraderRequestMetadata, uKL3EducationHomeRequestMetadata, uKL3EducationSpreadBenefitsRequestMetadata, rHSGHomeRequestMetadata, rHSGCompleteCARQuestionnaireRequestMetadata, professionalTraderRequestMetadata, rHSGL2ApprovedTradesRequestMetadata, rHSGL3ApprovedTradesRequestMetadata, jAPendingApplicationMetadata, knowledgeCheckNeededRequestMetadataRedact, ByteString.EMPTY);
            }
        };
    }
}
