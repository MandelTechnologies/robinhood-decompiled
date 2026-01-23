package com.robinhood.android.navigation.app.keys;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.app.keys.data.AccountOverviewLaunchType;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.app.keys.data.RhySpendingAccountLearnMoreKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.performancelogger.PerformanceMetricTrigger;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.transfers.models.p406db.AchTransfer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.OptIn3;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: LegacyFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmno\u0082\u0001Ì\u0001pqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001¨\u0006Þ\u0001"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "AccountOverview", "AchAccountInfo", "AchTransferInstantDepositFragmentV3", "AnalystReport", "AutoplaySettings", "AverageCostUnavailable", "AutomaticDepositDetail", "BlockedProfiles", "CardReplacementVirtualToPhysicalSubmission", "CardRestrictedSupport", "CheckPaymentDetail", "CryptoWithSymbol", "CryptoUpgradeUnderReview", "DataSharingPermissionsFragment", "DebitCardDynamicCodeVerification", "DividendDetail", "ProgramEnrollmentCelebration", "RhyConfirmAddress", "RhyDirectDepositInfo", "RhySpendingAccountLearnMore", "RhyStatements", "EarlyPayToggle", "Earnings", "EducationHome", "ProgramDetail", "EquityInstrumentDetail", "InboxThreadList", "InboxThreadDetail", "IpoAnnouncement", "IpoLearningHub", "HyperExtendedOnboarding", "LoggedOutSecretCodeValidation", "MarginInvesting", "ManageDirectDeposit", "MediaImageViewer", "NewsFeedAsset", "NewsFeedVideoPlayer", "NewsFeedEmbeddedArticle", "OptionOrderDetail", "OptionsProfitLossChartEducation", "OptionStrategyBuilderIntro", "OptionsWatchlistHub", "OrderDetail", "OrderSummaryExplanation", "OutboundVoicePage", "MatchaRequestDetail", "MatchaQrCode", "NewProductsLanding", "PathfinderEmailChallenge", "PathfinderSmsChallenge", "PathfinderSmsMfaEnrollOtp", "PathfinderAppMfaEnroll", "PathfinderIdentityVerificationInitiate", "PathfinderLoggedInIdentityVerificationWait", "PathfinderPdtDepositFundsInitiated", "PathfinderSdui", "PathfinderSmsMfaEnrollPhoneInput", "PaycheckDetail", "PaycheckHub", "PaycheckRecurringInvestmentsHub", "PreviousTaxDocuments", "ProfileVisibility", "AccountCenter", "ProfileEdit", "RhyOnboardingIntro", "RhyOverviewV2", "RhyFullScreenInfo", "RhyPendingScreen", "RhyAccountSettings", "RhyCardSettings", "RhyMerchantRewardsOfferTerms", "RhyMerchantRewardsOverview", "MerchantRewardHistory", "RhyMerchantRewardsWelcome", "RhyWaitlistComingSoon", "RhyWaitlistError", "RoundupRewardsOverviewV2", "RoundupRewardsSettings", "SafetyLabelsLesson", "SlipFaqs", "SlipPreviouslySignedAgreements", "ShareholderAskQuestion", "ShareholderEventInfo", "ShareholderEventsPage", "ShareholderEventQuestionList", "ShareholderExperienceIntro", "ShareholderQuestionSubmitted", "SnacksSubscribe", "DeviceSecurityFragment", "SupportCallStatus", "SurveyComplete", "SurveyCompleteToast", "SurveyContactRedirect", "SurveyFreeFormQuestion", "SurveyMultipleChoiceQuestion", "SurveyRatingQuestion", "SurveyYesNoQuestion", "PathfinderTransferFunds", "UarContactSelfieVerificationInitiate", "UarContactSelfieVerificationWait", "UarEmailUpdateInput", "UarEmailUpdateVerification", "UarVerificationSuccess", "VerifyTaxInfo", "TaxCenter", "TaxTimelineInfo", "TrustedContactDetail", "TrustedContactUpdate", "ViewTaxDocument", "WithdrawableAmountDetail", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountCenter;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchAccountInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchTransferInstantDepositFragmentV3;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AnalystReport;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutomaticDepositDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutoplaySettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AverageCostUnavailable;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$BlockedProfiles;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CardReplacementVirtualToPhysicalSubmission;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CardRestrictedSupport;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CheckPaymentDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoWithSymbol;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DataSharingPermissionsFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DeviceSecurityFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DividendDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EarlyPayToggle;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$Earnings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EducationHome;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$HyperExtendedOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoAnnouncement;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoLearningHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$LoggedOutSecretCodeValidation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ManageDirectDeposit;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaRequestDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MediaImageViewer;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MerchantRewardHistory;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewProductsLanding;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedAsset;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedEmbeddedArticle;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedVideoPlayer;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionOrderDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionStrategyBuilderIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsProfitLossChartEducation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsWatchlistHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderSummaryExplanation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OutboundVoicePage;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderAppMfaEnroll;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderEmailChallenge;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderIdentityVerificationInitiate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderLoggedInIdentityVerificationWait;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderPdtDepositFundsInitiated;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsChallenge;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollOtp;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollPhoneInput;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderTransferFunds;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckRecurringInvestmentsHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PreviousTaxDocuments;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileVisibility;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramEnrollmentCelebration;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyAccountSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyConfirmAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyDirectDepositInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyFullScreenInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOfferTerms;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsWelcome;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyOnboardingIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyOverviewV2;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyPendingScreen;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhySpendingAccountLearnMore;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyStatements;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyWaitlistComingSoon;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyWaitlistError;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsOverviewV2;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SafetyLabelsLesson;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderAskQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventQuestionList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventsPage;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderExperienceIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderQuestionSubmitted;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SlipFaqs;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SlipPreviouslySignedAgreements;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SnacksSubscribe;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SupportCallStatus;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyComplete;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyCompleteToast;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyContactRedirect;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyFreeFormQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyMultipleChoiceQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyRatingQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyYesNoQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxCenter;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxTimelineInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactUpdate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationInitiate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationWait;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateInput;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateVerification;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarVerificationSuccess;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ViewTaxDocument;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$WithdrawableAmountDetail;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LegacyFragmentKey extends FragmentKey {

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SlipPreviouslySignedAgreements;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SlipPreviouslySignedAgreements implements LegacyFragmentKey {
        public static final Parcelable.Creator<SlipPreviouslySignedAgreements> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SlipPreviouslySignedAgreements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipPreviouslySignedAgreements createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new SlipPreviouslySignedAgreements();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipPreviouslySignedAgreements[] newArray(int i) {
                return new SlipPreviouslySignedAgreements[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "launchType", "Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;Ljava/lang/String;)V", "getLaunchType", "()Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;", "getAccountNumber", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountOverview implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<AccountOverview> CREATOR = new Creator();
        private final String accountNumber;
        private final AccountOverviewLaunchType launchType;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AccountOverview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountOverview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountOverview(AccountOverviewLaunchType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountOverview[] newArray(int i) {
                return new AccountOverview[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AccountOverview() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AccountOverview copy$default(AccountOverview accountOverview, AccountOverviewLaunchType accountOverviewLaunchType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                accountOverviewLaunchType = accountOverview.launchType;
            }
            if ((i & 2) != 0) {
                str = accountOverview.accountNumber;
            }
            return accountOverview.copy(accountOverviewLaunchType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountOverviewLaunchType getLaunchType() {
            return this.launchType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountOverview copy(AccountOverviewLaunchType launchType, String accountNumber) {
            Intrinsics.checkNotNullParameter(launchType, "launchType");
            return new AccountOverview(launchType, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountOverview)) {
                return false;
            }
            AccountOverview accountOverview = (AccountOverview) other;
            return this.launchType == accountOverview.launchType && Intrinsics.areEqual(this.accountNumber, accountOverview.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.launchType.hashCode() * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AccountOverview(launchType=" + this.launchType + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.launchType.name());
            dest.writeString(this.accountNumber);
        }

        public AccountOverview(AccountOverviewLaunchType launchType, String str) {
            Intrinsics.checkNotNullParameter(launchType, "launchType");
            this.launchType = launchType;
            this.accountNumber = str;
        }

        public /* synthetic */ AccountOverview(AccountOverviewLaunchType accountOverviewLaunchType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AccountOverviewLaunchType.NONE : accountOverviewLaunchType, (i & 2) != 0 ? null : str);
        }

        public final AccountOverviewLaunchType getLaunchType() {
            return this.launchType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchAccountInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "showLockWithdrawalsToggle", "", "showTitle", "compatibleSpacingForOlderView", "<init>", "(ZZZ)V", "getShowLockWithdrawalsToggle", "()Z", "getShowTitle", "getCompatibleSpacingForOlderView", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AchAccountInfo implements LegacyFragmentKey {
        public static final Parcelable.Creator<AchAccountInfo> CREATOR = new Creator();
        private final boolean compatibleSpacingForOlderView;
        private final boolean showLockWithdrawalsToggle;
        private final boolean showTitle;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AchAccountInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchAccountInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AchAccountInfo(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchAccountInfo[] newArray(int i) {
                return new AchAccountInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showLockWithdrawalsToggle ? 1 : 0);
            dest.writeInt(this.showTitle ? 1 : 0);
            dest.writeInt(this.compatibleSpacingForOlderView ? 1 : 0);
        }

        public AchAccountInfo(boolean z, boolean z2, boolean z3) {
            this.showLockWithdrawalsToggle = z;
            this.showTitle = z2;
            this.compatibleSpacingForOlderView = z3;
        }

        public /* synthetic */ AchAccountInfo(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, z2, (i & 4) != 0 ? false : z3);
        }

        public final boolean getShowLockWithdrawalsToggle() {
            return this.showLockWithdrawalsToggle;
        }

        public final boolean getShowTitle() {
            return this.showTitle;
        }

        public final boolean getCompatibleSpacingForOlderView() {
            return this.compatibleSpacingForOlderView;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchTransferInstantDepositFragmentV3;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AchTransferInstantDepositFragmentV3 implements LegacyFragmentKey {
        public static final Parcelable.Creator<AchTransferInstantDepositFragmentV3> CREATOR = new Creator();
        private final AchTransfer achTransfer;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AchTransferInstantDepositFragmentV3> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchTransferInstantDepositFragmentV3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AchTransferInstantDepositFragmentV3((AchTransfer) parcel.readParcelable(AchTransferInstantDepositFragmentV3.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchTransferInstantDepositFragmentV3[] newArray(int i) {
                return new AchTransferInstantDepositFragmentV3[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.achTransfer, flags);
        }

        public AchTransferInstantDepositFragmentV3(AchTransfer achTransfer) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            this.achTransfer = achTransfer;
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AnalystReport;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnalystReport implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<AnalystReport> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AnalystReport> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AnalystReport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnalystReport((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AnalystReport[] newArray(int i) {
                return new AnalystReport[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public AnalystReport(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutoplaySettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AutoplaySettings implements LegacyFragmentKey, TabFragmentKey {
        public static final AutoplaySettings INSTANCE = new AutoplaySettings();
        public static final Parcelable.Creator<AutoplaySettings> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AutoplaySettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoplaySettings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutoplaySettings.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoplaySettings[] newArray(int i) {
                return new AutoplaySettings[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AutoplaySettings() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.BROWSE;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AverageCostUnavailable;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AverageCostUnavailable implements LegacyFragmentKey {
        public static final AverageCostUnavailable INSTANCE = new AverageCostUnavailable();
        public static final Parcelable.Creator<AverageCostUnavailable> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AverageCostUnavailable> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AverageCostUnavailable createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AverageCostUnavailable.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AverageCostUnavailable[] newArray(int i) {
                return new AverageCostUnavailable[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AverageCostUnavailable() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutomaticDepositDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "automaticDepositId", "", "<init>", "(Ljava/lang/String;)V", "getAutomaticDepositId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AutomaticDepositDetail implements LegacyFragmentKey {
        public static final Parcelable.Creator<AutomaticDepositDetail> CREATOR = new Creator();
        private final String automaticDepositId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AutomaticDepositDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutomaticDepositDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutomaticDepositDetail(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutomaticDepositDetail[] newArray(int i) {
                return new AutomaticDepositDetail[i];
            }
        }

        public static /* synthetic */ AutomaticDepositDetail copy$default(AutomaticDepositDetail automaticDepositDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = automaticDepositDetail.automaticDepositId;
            }
            return automaticDepositDetail.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAutomaticDepositId() {
            return this.automaticDepositId;
        }

        public final AutomaticDepositDetail copy(String automaticDepositId) {
            Intrinsics.checkNotNullParameter(automaticDepositId, "automaticDepositId");
            return new AutomaticDepositDetail(automaticDepositId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutomaticDepositDetail) && Intrinsics.areEqual(this.automaticDepositId, ((AutomaticDepositDetail) other).automaticDepositId);
        }

        public int hashCode() {
            return this.automaticDepositId.hashCode();
        }

        public String toString() {
            return "AutomaticDepositDetail(automaticDepositId=" + this.automaticDepositId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.automaticDepositId);
        }

        public AutomaticDepositDetail(String automaticDepositId) {
            Intrinsics.checkNotNullParameter(automaticDepositId, "automaticDepositId");
            this.automaticDepositId = automaticDepositId;
        }

        public final String getAutomaticDepositId() {
            return this.automaticDepositId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$BlockedProfiles;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BlockedProfiles implements LegacyFragmentKey, TabFragmentKey {
        public static final BlockedProfiles INSTANCE = new BlockedProfiles();
        public static final Parcelable.Creator<BlockedProfiles> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<BlockedProfiles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlockedProfiles createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BlockedProfiles.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlockedProfiles[] newArray(int i) {
                return new BlockedProfiles[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private BlockedProfiles() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CardReplacementVirtualToPhysicalSubmission;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "cardId", "Ljava/util/UUID;", "cardColor", "Lcom/robinhood/models/api/mcduckling/CardColor;", "shippingAddressId", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/mcduckling/CardColor;Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "getCardColor", "()Lcom/robinhood/models/api/mcduckling/CardColor;", "getShippingAddressId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardReplacementVirtualToPhysicalSubmission implements LegacyFragmentKey {
        public static final Parcelable.Creator<CardReplacementVirtualToPhysicalSubmission> CREATOR = new Creator();
        private final CardColor cardColor;
        private final UUID cardId;
        private final UUID shippingAddressId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CardReplacementVirtualToPhysicalSubmission> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardReplacementVirtualToPhysicalSubmission createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardReplacementVirtualToPhysicalSubmission((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : CardColor.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardReplacementVirtualToPhysicalSubmission[] newArray(int i) {
                return new CardReplacementVirtualToPhysicalSubmission[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.cardId);
            CardColor cardColor = this.cardColor;
            if (cardColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cardColor.name());
            }
            dest.writeSerializable(this.shippingAddressId);
        }

        public CardReplacementVirtualToPhysicalSubmission(UUID cardId, CardColor cardColor, UUID uuid) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.cardId = cardId;
            this.cardColor = cardColor;
            this.shippingAddressId = uuid;
        }

        public /* synthetic */ CardReplacementVirtualToPhysicalSubmission(UUID uuid, CardColor cardColor, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : cardColor, (i & 4) != 0 ? null : uuid2);
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final CardColor getCardColor() {
            return this.cardColor;
        }

        public final UUID getShippingAddressId() {
            return this.shippingAddressId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CardRestrictedSupport;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardRestrictedSupport implements LegacyFragmentKey {
        public static final CardRestrictedSupport INSTANCE = new CardRestrictedSupport();
        public static final Parcelable.Creator<CardRestrictedSupport> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CardRestrictedSupport> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardRestrictedSupport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardRestrictedSupport.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardRestrictedSupport[] newArray(int i) {
                return new CardRestrictedSupport[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CardRestrictedSupport() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CheckPaymentDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "checkId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCheckId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckPaymentDetail implements LegacyFragmentKey {
        public static final Parcelable.Creator<CheckPaymentDetail> CREATOR = new Creator();
        private final UUID checkId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CheckPaymentDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckPaymentDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckPaymentDetail((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckPaymentDetail[] newArray(int i) {
                return new CheckPaymentDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.checkId);
        }

        public CheckPaymentDetail(UUID checkId) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            this.checkId = checkId;
        }

        public final UUID getCheckId() {
            return this.checkId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoWithSymbol;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoWithSymbol implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<CryptoWithSymbol> CREATOR = new Creator();
        private final String symbol;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CryptoWithSymbol> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoWithSymbol createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoWithSymbol(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoWithSymbol[] newArray(int i) {
                return new CryptoWithSymbol[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
        }

        public CryptoWithSymbol(String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "messageType", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;)V", "getMessageType", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MessageType", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoUpgradeUnderReview implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<CryptoUpgradeUnderReview> CREATOR = new Creator();
        private final MessageType messageType;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CryptoUpgradeUnderReview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoUpgradeUnderReview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoUpgradeUnderReview(MessageType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoUpgradeUnderReview[] newArray(int i) {
                return new CryptoUpgradeUnderReview[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.messageType.name());
        }

        public CryptoUpgradeUnderReview(MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.messageType = messageType;
        }

        public final MessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDER_REVIEW", "VERIFYING_RESIDENCY", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class MessageType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ MessageType[] $VALUES;
            public static final MessageType UNDER_REVIEW = new MessageType("UNDER_REVIEW", 0);
            public static final MessageType VERIFYING_RESIDENCY = new MessageType("VERIFYING_RESIDENCY", 1);

            private static final /* synthetic */ MessageType[] $values() {
                return new MessageType[]{UNDER_REVIEW, VERIFYING_RESIDENCY};
            }

            public static EnumEntries<MessageType> getEntries() {
                return $ENTRIES;
            }

            private MessageType(String str, int i) {
            }

            static {
                MessageType[] messageTypeArr$values = $values();
                $VALUES = messageTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(messageTypeArr$values);
            }

            public static MessageType valueOf(String str) {
                return (MessageType) Enum.valueOf(MessageType.class, str);
            }

            public static MessageType[] values() {
                return (MessageType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DataSharingPermissionsFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DataSharingPermissionsFragment implements LegacyFragmentKey {
        public static final DataSharingPermissionsFragment INSTANCE = new DataSharingPermissionsFragment();
        public static final Parcelable.Creator<DataSharingPermissionsFragment> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DataSharingPermissionsFragment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataSharingPermissionsFragment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DataSharingPermissionsFragment.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataSharingPermissionsFragment[] newArray(int i) {
                return new DataSharingPermissionsFragment[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DataSharingPermissionsFragment() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "debitCardInstrumentId", "Ljava/util/UUID;", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "Standalone", "WithinLinking", "InternalDebitCardLinkingNavigation", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification$Standalone;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification$WithinLinking;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DebitCardDynamicCodeVerification implements LegacyFragmentKey {

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification$InternalDebitCardLinkingNavigation;", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @OptIn3
        @Retention(RetentionPolicy.CLASS)
        @kotlin.annotation.Retention
        /* loaded from: classes8.dex */
        public @interface InternalDebitCardLinkingNavigation {
        }

        public /* synthetic */ DebitCardDynamicCodeVerification(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract UUID getDebitCardInstrumentId();

        private DebitCardDynamicCodeVerification() {
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification$Standalone;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification;", "debitCardInstrumentId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Standalone extends DebitCardDynamicCodeVerification {
            public static final Parcelable.Creator<Standalone> CREATOR = new Creator();
            private final UUID debitCardInstrumentId;
            private final PaymentLinkingContext.EntryPoint entryPoint;

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Standalone> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Standalone createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Standalone((UUID) parcel.readSerializable(), PaymentLinkingContext.EntryPoint.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Standalone[] newArray(int i) {
                    return new Standalone[i];
                }
            }

            public static /* synthetic */ Standalone copy$default(Standalone standalone, UUID uuid, PaymentLinkingContext.EntryPoint entryPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = standalone.debitCardInstrumentId;
                }
                if ((i & 2) != 0) {
                    entryPoint = standalone.entryPoint;
                }
                return standalone.copy(uuid, entryPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getDebitCardInstrumentId() {
                return this.debitCardInstrumentId;
            }

            /* renamed from: component2, reason: from getter */
            public final PaymentLinkingContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            public final Standalone copy(UUID debitCardInstrumentId, PaymentLinkingContext.EntryPoint entryPoint) {
                Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                return new Standalone(debitCardInstrumentId, entryPoint);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Standalone)) {
                    return false;
                }
                Standalone standalone = (Standalone) other;
                return Intrinsics.areEqual(this.debitCardInstrumentId, standalone.debitCardInstrumentId) && this.entryPoint == standalone.entryPoint;
            }

            public int hashCode() {
                return (this.debitCardInstrumentId.hashCode() * 31) + this.entryPoint.hashCode();
            }

            public String toString() {
                return "Standalone(debitCardInstrumentId=" + this.debitCardInstrumentId + ", entryPoint=" + this.entryPoint + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.debitCardInstrumentId);
                dest.writeString(this.entryPoint.name());
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.DebitCardDynamicCodeVerification
            public UUID getDebitCardInstrumentId() {
                return this.debitCardInstrumentId;
            }

            public final PaymentLinkingContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Standalone(UUID debitCardInstrumentId, PaymentLinkingContext.EntryPoint entryPoint) {
                super(null);
                Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.debitCardInstrumentId = debitCardInstrumentId;
                this.entryPoint = entryPoint;
            }
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification$WithinLinking;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification;", "debitCardInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @InternalDebitCardLinkingNavigation
        public static final class WithinLinking extends DebitCardDynamicCodeVerification {
            public static final Parcelable.Creator<WithinLinking> CREATOR = new Creator();
            private final UUID debitCardInstrumentId;

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<WithinLinking> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WithinLinking createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WithinLinking((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WithinLinking[] newArray(int i) {
                    return new WithinLinking[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.debitCardInstrumentId);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.DebitCardDynamicCodeVerification
            public UUID getDebitCardInstrumentId() {
                return this.debitCardInstrumentId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithinLinking(UUID debitCardInstrumentId) {
                super(null);
                Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
                this.debitCardInstrumentId = debitCardInstrumentId;
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DividendDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "dividendId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDividendId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DividendDetail implements LegacyFragmentKey {
        public static final Parcelable.Creator<DividendDetail> CREATOR = new Creator();
        private final UUID dividendId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DividendDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DividendDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DividendDetail((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DividendDetail[] newArray(int i) {
                return new DividendDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.dividendId);
        }

        public DividendDetail(UUID dividendId) {
            Intrinsics.checkNotNullParameter(dividendId, "dividendId");
            this.dividendId = dividendId;
        }

        public final UUID getDividendId() {
            return this.dividendId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramEnrollmentCelebration;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "initialBackgroundColor", "", "enrollmentResponse", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "<init>", "(ILcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;)V", "getInitialBackgroundColor", "()I", "getEnrollmentResponse", "()Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProgramEnrollmentCelebration implements LegacyFragmentKey {
        public static final Parcelable.Creator<ProgramEnrollmentCelebration> CREATOR = new Creator();
        private final ApiPspEnrollmentResponse enrollmentResponse;
        private final int initialBackgroundColor;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ProgramEnrollmentCelebration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgramEnrollmentCelebration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProgramEnrollmentCelebration(parcel.readInt(), (ApiPspEnrollmentResponse) parcel.readParcelable(ProgramEnrollmentCelebration.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgramEnrollmentCelebration[] newArray(int i) {
                return new ProgramEnrollmentCelebration[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.initialBackgroundColor);
            dest.writeParcelable(this.enrollmentResponse, flags);
        }

        public ProgramEnrollmentCelebration(int i, ApiPspEnrollmentResponse enrollmentResponse) {
            Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
            this.initialBackgroundColor = i;
            this.enrollmentResponse = enrollmentResponse;
        }

        public final int getInitialBackgroundColor() {
            return this.initialBackgroundColor;
        }

        public final ApiPspEnrollmentResponse getEnrollmentResponse() {
            return this.enrollmentResponse;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyConfirmAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "showShippingAddress", "", "isInCmSunset", "<init>", "(ZZ)V", "getShowShippingAddress", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyConfirmAddress implements LegacyFragmentKey {
        public static final Parcelable.Creator<RhyConfirmAddress> CREATOR = new Creator();
        private final boolean isInCmSunset;
        private final boolean showShippingAddress;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyConfirmAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyConfirmAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyConfirmAddress(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyConfirmAddress[] newArray(int i) {
                return new RhyConfirmAddress[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showShippingAddress ? 1 : 0);
            dest.writeInt(this.isInCmSunset ? 1 : 0);
        }

        public RhyConfirmAddress(boolean z, boolean z2) {
            this.showShippingAddress = z;
            this.isInCmSunset = z2;
        }

        public /* synthetic */ RhyConfirmAddress(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getShowShippingAddress() {
            return this.showShippingAddress;
        }

        /* renamed from: isInCmSunset, reason: from getter */
        public final boolean getIsInCmSunset() {
            return this.isInCmSunset;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyDirectDepositInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "hasDdRelationship", "", "fromMigrationFlow", "<init>", "(ZZ)V", "getHasDdRelationship", "()Z", "getFromMigrationFlow", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyDirectDepositInfo implements LegacyFragmentKey {
        public static final Parcelable.Creator<RhyDirectDepositInfo> CREATOR = new Creator();
        private final boolean fromMigrationFlow;
        private final boolean hasDdRelationship;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyDirectDepositInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyDirectDepositInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyDirectDepositInfo(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyDirectDepositInfo[] newArray(int i) {
                return new RhyDirectDepositInfo[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RhyDirectDepositInfo() {
            boolean z = false;
            this(z, z, 3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasDdRelationship ? 1 : 0);
            dest.writeInt(this.fromMigrationFlow ? 1 : 0);
        }

        public RhyDirectDepositInfo(boolean z, boolean z2) {
            this.hasDdRelationship = z;
            this.fromMigrationFlow = z2;
        }

        public /* synthetic */ RhyDirectDepositInfo(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getHasDdRelationship() {
            return this.hasDdRelationship;
        }

        public final boolean getFromMigrationFlow() {
            return this.fromMigrationFlow;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhySpendingAccountLearnMore;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "key", "Lcom/robinhood/android/navigation/app/keys/data/RhySpendingAccountLearnMoreKey;", "p2pContentOverride", "", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/RhySpendingAccountLearnMoreKey;Z)V", "getKey", "()Lcom/robinhood/android/navigation/app/keys/data/RhySpendingAccountLearnMoreKey;", "getP2pContentOverride", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhySpendingAccountLearnMore implements LegacyFragmentKey {
        public static final Parcelable.Creator<RhySpendingAccountLearnMore> CREATOR = new Creator();
        private final RhySpendingAccountLearnMoreKey key;
        private final boolean p2pContentOverride;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhySpendingAccountLearnMore> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhySpendingAccountLearnMore createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhySpendingAccountLearnMore(RhySpendingAccountLearnMoreKey.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhySpendingAccountLearnMore[] newArray(int i) {
                return new RhySpendingAccountLearnMore[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RhySpendingAccountLearnMore() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.key.writeToParcel(dest, flags);
            dest.writeInt(this.p2pContentOverride ? 1 : 0);
        }

        public RhySpendingAccountLearnMore(RhySpendingAccountLearnMoreKey key, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.p2pContentOverride = z;
        }

        public /* synthetic */ RhySpendingAccountLearnMore(RhySpendingAccountLearnMoreKey rhySpendingAccountLearnMoreKey, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RhySpendingAccountLearnMoreKey.RHY_ONBOARDING : rhySpendingAccountLearnMoreKey, (i & 2) != 0 ? false : z);
        }

        public final RhySpendingAccountLearnMoreKey getKey() {
            return this.key;
        }

        public final boolean getP2pContentOverride() {
            return this.p2pContentOverride;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyStatements;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyStatements implements LegacyFragmentKey, TabFragmentKey {
        public static final RhyStatements INSTANCE = new RhyStatements();
        public static final Parcelable.Creator<RhyStatements> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyStatements> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyStatements createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RhyStatements.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyStatements[] newArray(int i) {
                return new RhyStatements[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RhyStatements() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EarlyPayToggle;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EarlyPayToggle implements LegacyFragmentKey {
        public static final EarlyPayToggle INSTANCE = new EarlyPayToggle();
        public static final Parcelable.Creator<EarlyPayToggle> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<EarlyPayToggle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarlyPayToggle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EarlyPayToggle.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarlyPayToggle[] newArray(int i) {
                return new EarlyPayToggle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private EarlyPayToggle() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$Earnings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Earnings implements LegacyFragmentKey, TabFragmentKey {
        public static final Earnings INSTANCE = new Earnings();
        public static final Parcelable.Creator<Earnings> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<Earnings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Earnings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Earnings.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Earnings[] newArray(int i) {
                return new Earnings[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Earnings() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EducationHome;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EducationHome implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<EducationHome> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<EducationHome> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationHome createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EducationHome(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationHome[] newArray(int i) {
                return new EducationHome[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        public EducationHome(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.BROWSE;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "programId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getProgramId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProgramDetail implements LegacyFragmentKey {
        public static final Parcelable.Creator<ProgramDetail> CREATOR = new Creator();
        private final UUID programId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ProgramDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgramDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProgramDetail((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgramDetail[] newArray(int i) {
                return new ProgramDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.programId);
        }

        public ProgramDetail(UUID programId) {
            Intrinsics.checkNotNullParameter(programId, "programId");
            this.programId = programId;
        }

        public final UUID getProgramId() {
            return this.programId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B?\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0011B%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003JQ\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u00105\u001a\u000206J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000206HÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000206R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u001a\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "id", "Ljava/util/UUID;", "symbol", "", "instrumentIds", "", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "accountNumber", "openTradingTrendsDetails", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;Ljava/lang/String;Z)V", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;Z)V", "(Ljava/lang/String;Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getInstrumentIds", "()Ljava/util/List;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "getAccountNumber", "getOpenTradingTrendsDetails", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "performanceMetricName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getPerformanceMetricName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "performanceMetricContextualId", "getPerformanceMetricContextualId", "performanceMetricContext", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "getPerformanceMetricContext$annotations", "()V", "getPerformanceMetricContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquityInstrumentDetail implements LegacyFragmentKey, PerformanceMetricTrigger, TabFragmentKey {
        public static final Parcelable.Creator<EquityInstrumentDetail> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID id;
        private final List<UUID> instrumentIds;
        private final boolean openTradingTrendsDetails;
        private final PerformanceMetricEventData.Context performanceMetricContext;
        private final InstrumentDetailSource source;
        private final String symbol;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<EquityInstrumentDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityInstrumentDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new EquityInstrumentDetail(uuid, string2, arrayList, InstrumentDetailSource.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityInstrumentDetail[] newArray(int i) {
                return new EquityInstrumentDetail[i];
            }
        }

        public static /* synthetic */ EquityInstrumentDetail copy$default(EquityInstrumentDetail equityInstrumentDetail, UUID uuid, String str, List list, InstrumentDetailSource instrumentDetailSource, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = equityInstrumentDetail.id;
            }
            if ((i & 2) != 0) {
                str = equityInstrumentDetail.symbol;
            }
            if ((i & 4) != 0) {
                list = equityInstrumentDetail.instrumentIds;
            }
            if ((i & 8) != 0) {
                instrumentDetailSource = equityInstrumentDetail.source;
            }
            if ((i & 16) != 0) {
                str2 = equityInstrumentDetail.accountNumber;
            }
            if ((i & 32) != 0) {
                z = equityInstrumentDetail.openTradingTrendsDetails;
            }
            String str3 = str2;
            boolean z2 = z;
            return equityInstrumentDetail.copy(uuid, str, list, instrumentDetailSource, str3, z2);
        }

        public static /* synthetic */ void getPerformanceMetricContext$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final List<UUID> component3() {
            return this.instrumentIds;
        }

        /* renamed from: component4, reason: from getter */
        public final InstrumentDetailSource getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getOpenTradingTrendsDetails() {
            return this.openTradingTrendsDetails;
        }

        public final EquityInstrumentDetail copy(UUID id, String symbol, List<UUID> instrumentIds, InstrumentDetailSource source, String accountNumber, boolean openTradingTrendsDetails) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(source, "source");
            return new EquityInstrumentDetail(id, symbol, instrumentIds, source, accountNumber, openTradingTrendsDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquityInstrumentDetail)) {
                return false;
            }
            EquityInstrumentDetail equityInstrumentDetail = (EquityInstrumentDetail) other;
            return Intrinsics.areEqual(this.id, equityInstrumentDetail.id) && Intrinsics.areEqual(this.symbol, equityInstrumentDetail.symbol) && Intrinsics.areEqual(this.instrumentIds, equityInstrumentDetail.instrumentIds) && this.source == equityInstrumentDetail.source && Intrinsics.areEqual(this.accountNumber, equityInstrumentDetail.accountNumber) && this.openTradingTrendsDetails == equityInstrumentDetail.openTradingTrendsDetails;
        }

        public int hashCode() {
            UUID uuid = this.id;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            String str = this.symbol;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.instrumentIds.hashCode()) * 31) + this.source.hashCode()) * 31;
            String str2 = this.accountNumber;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.openTradingTrendsDetails);
        }

        public String toString() {
            return "EquityInstrumentDetail(id=" + this.id + ", symbol=" + this.symbol + ", instrumentIds=" + this.instrumentIds + ", source=" + this.source + ", accountNumber=" + this.accountNumber + ", openTradingTrendsDetails=" + this.openTradingTrendsDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.symbol);
            List<UUID> list = this.instrumentIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            this.source.writeToParcel(dest, flags);
            dest.writeString(this.accountNumber);
            dest.writeInt(this.openTradingTrendsDetails ? 1 : 0);
        }

        protected EquityInstrumentDetail(UUID uuid, String str, List<UUID> instrumentIds, InstrumentDetailSource source, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(source, "source");
            this.id = uuid;
            this.symbol = str;
            this.instrumentIds = instrumentIds;
            this.source = source;
            this.accountNumber = str2;
            this.openTradingTrendsDetails = z;
            this.performanceMetricContext = new PerformanceMetricEventData.Context(false, false, str != null, null, null, null, null, null, null, null, null, null, 4091, null);
        }

        public /* synthetic */ EquityInstrumentDetail(UUID uuid, String str, List list, InstrumentDetailSource instrumentDetailSource, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, list, instrumentDetailSource, str2, (i & 32) != 0 ? false : z);
        }

        public final UUID getId() {
            return this.id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }

        public final InstrumentDetailSource getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getOpenTradingTrendsDetails() {
            return this.openTradingTrendsDetails;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public PerformanceMetricEventData.Name getPerformanceMetricName() {
            return PerformanceMetricEventData.Name.STOCK_DETAIL;
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public UUID getPerformanceMetricContextualId() {
            return this.id;
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public PerformanceMetricEventData.Context getPerformanceMetricContext() {
            return this.performanceMetricContext;
        }

        public /* synthetic */ EquityInstrumentDetail(UUID uuid, List list, String str, InstrumentDetailSource instrumentDetailSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (List<UUID>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list), (i & 4) != 0 ? null : str, instrumentDetailSource, (i & 16) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EquityInstrumentDetail(UUID id, List<UUID> instrumentIds, String str, InstrumentDetailSource source, boolean z) {
            this(id, null, instrumentIds, source, str, z);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(source, "source");
        }

        public /* synthetic */ EquityInstrumentDetail(String str, InstrumentDetailSource instrumentDetailSource, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, instrumentDetailSource, (i & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EquityInstrumentDetail(String symbol, InstrumentDetailSource source, String str) {
            this(null, symbol, CollectionsKt.emptyList(), source, str, false, 32, null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(source, "source");
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "performanceMetricName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getPerformanceMetricName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InboxThreadList implements LegacyFragmentKey, PerformanceMetricTrigger, TabFragmentKey {
        public static final InboxThreadList INSTANCE = new InboxThreadList();
        public static final Parcelable.Creator<InboxThreadList> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<InboxThreadList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InboxThreadList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InboxThreadList.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InboxThreadList[] newArray(int i) {
                return new InboxThreadList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private InboxThreadList() {
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public PerformanceMetricEventData.Context getPerformanceMetricContext() {
            return PerformanceMetricTrigger.DefaultImpls.getPerformanceMetricContext(this);
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public UUID getPerformanceMetricContextualId() {
            return PerformanceMetricTrigger.DefaultImpls.getPerformanceMetricContextualId(this);
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.INBOX;
        }

        @Override // com.robinhood.android.performancelogger.PerformanceMetricTrigger
        public PerformanceMetricEventData.Name getPerformanceMetricName() {
            return PerformanceMetricEventData.Name.MESSAGE;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "threadId", "", "<init>", "(Ljava/lang/String;)V", "getThreadId", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InboxThreadDetail implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<InboxThreadDetail> CREATOR = new Creator();
        private final String threadId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<InboxThreadDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InboxThreadDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboxThreadDetail(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InboxThreadDetail[] newArray(int i) {
                return new InboxThreadDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.threadId);
        }

        public InboxThreadDetail(String threadId) {
            Intrinsics.checkNotNullParameter(threadId, "threadId");
            this.threadId = threadId;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.INBOX;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoAnnouncement;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IpoAnnouncement implements LegacyFragmentKey {
        public static final Parcelable.Creator<IpoAnnouncement> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<IpoAnnouncement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IpoAnnouncement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IpoAnnouncement((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IpoAnnouncement[] newArray(int i) {
                return new IpoAnnouncement[i];
            }
        }

        public static /* synthetic */ IpoAnnouncement copy$default(IpoAnnouncement ipoAnnouncement, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ipoAnnouncement.instrumentId;
            }
            return ipoAnnouncement.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final IpoAnnouncement copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new IpoAnnouncement(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IpoAnnouncement) && Intrinsics.areEqual(this.instrumentId, ((IpoAnnouncement) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "IpoAnnouncement(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public IpoAnnouncement(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoLearningHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "startingTabKey", "", "<init>", "(Ljava/lang/String;)V", "getStartingTabKey", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IpoLearningHub implements LegacyFragmentKey {
        public static final Parcelable.Creator<IpoLearningHub> CREATOR = new Creator();
        private final String startingTabKey;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<IpoLearningHub> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IpoLearningHub createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IpoLearningHub(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IpoLearningHub[] newArray(int i) {
                return new IpoLearningHub[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IpoLearningHub() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ IpoLearningHub copy$default(IpoLearningHub ipoLearningHub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ipoLearningHub.startingTabKey;
            }
            return ipoLearningHub.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStartingTabKey() {
            return this.startingTabKey;
        }

        public final IpoLearningHub copy(String startingTabKey) {
            return new IpoLearningHub(startingTabKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IpoLearningHub) && Intrinsics.areEqual(this.startingTabKey, ((IpoLearningHub) other).startingTabKey);
        }

        public int hashCode() {
            String str = this.startingTabKey;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "IpoLearningHub(startingTabKey=" + this.startingTabKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.startingTabKey);
        }

        public IpoLearningHub(String str) {
            this.startingTabKey = str;
        }

        public /* synthetic */ IpoLearningHub(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getStartingTabKey() {
            return this.startingTabKey;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$HyperExtendedOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HyperExtendedOnboarding implements LegacyFragmentKey {
        public static final HyperExtendedOnboarding INSTANCE = new HyperExtendedOnboarding();
        public static final Parcelable.Creator<HyperExtendedOnboarding> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<HyperExtendedOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HyperExtendedOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HyperExtendedOnboarding.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HyperExtendedOnboarding[] newArray(int i) {
                return new HyperExtendedOnboarding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private HyperExtendedOnboarding() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$LoggedOutSecretCodeValidation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$ContactSecretCode;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoggedOutSecretCodeValidation implements LegacyFragmentKey {
        public static final Parcelable.Creator<LoggedOutSecretCodeValidation> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.ContactSecretCode> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<LoggedOutSecretCodeValidation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoggedOutSecretCodeValidation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoggedOutSecretCodeValidation((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(LoggedOutSecretCodeValidation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoggedOutSecretCodeValidation[] newArray(int i) {
                return new LoggedOutSecretCodeValidation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public LoggedOutSecretCodeValidation(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.ContactSecretCode> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.ContactSecretCode> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "DisableMarginInvesting", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting$DisableMarginInvesting;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MarginInvesting implements LegacyFragmentKey, Parcelable, TabFragmentKey {
        public /* synthetic */ MarginInvesting(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MarginInvesting() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting$DisableMarginInvesting;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DisableMarginInvesting extends MarginInvesting {
            public static final String RESULT_KEY = "disable_margin_investing";
            private final String accountNumber;
            public static final Parcelable.Creator<DisableMarginInvesting> CREATOR = new Creator();

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<DisableMarginInvesting> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisableMarginInvesting createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisableMarginInvesting(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisableMarginInvesting[] newArray(int i) {
                    return new DisableMarginInvesting[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisableMarginInvesting() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DisableMarginInvesting copy$default(DisableMarginInvesting disableMarginInvesting, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disableMarginInvesting.accountNumber;
                }
                return disableMarginInvesting.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final DisableMarginInvesting copy(String accountNumber) {
                return new DisableMarginInvesting(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisableMarginInvesting) && Intrinsics.areEqual(this.accountNumber, ((DisableMarginInvesting) other).accountNumber);
            }

            public int hashCode() {
                String str = this.accountNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisableMarginInvesting(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            public DisableMarginInvesting(String str) {
                super(null);
                this.accountNumber = str;
            }

            public /* synthetic */ DisableMarginInvesting(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ManageDirectDeposit;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ManageDirectDeposit implements LegacyFragmentKey, TabFragmentKey {
        public static final ManageDirectDeposit INSTANCE = new ManageDirectDeposit();
        public static final Parcelable.Creator<ManageDirectDeposit> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ManageDirectDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManageDirectDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageDirectDeposit.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManageDirectDeposit[] newArray(int i) {
                return new ManageDirectDeposit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ManageDirectDeposit() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MediaImageViewer;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "<init>", "(Lcom/robinhood/models/db/MediaMetadata;)V", "getMediaMetadata", "()Lcom/robinhood/models/db/MediaMetadata;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MediaImageViewer implements LegacyFragmentKey {
        public static final Parcelable.Creator<MediaImageViewer> CREATOR = new Creator();
        private final MediaMetadata mediaMetadata;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MediaImageViewer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaImageViewer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MediaImageViewer((MediaMetadata) parcel.readParcelable(MediaImageViewer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaImageViewer[] newArray(int i) {
                return new MediaImageViewer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.mediaMetadata, flags);
        }

        public MediaImageViewer(MediaMetadata mediaMetadata) {
            Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
            this.mediaMetadata = mediaMetadata;
        }

        public final MediaMetadata getMediaMetadata() {
            return this.mediaMetadata;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedAsset;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "assetId", "Ljava/util/UUID;", "assetSymbol", "", "isCrypto", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Z)V", "getAssetId", "()Ljava/util/UUID;", "getAssetSymbol", "()Ljava/lang/String;", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NewsFeedAsset implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<NewsFeedAsset> CREATOR = new Creator();
        private final UUID assetId;
        private final String assetSymbol;
        private final boolean isCrypto;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<NewsFeedAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedAsset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewsFeedAsset((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedAsset[] newArray(int i) {
                return new NewsFeedAsset[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.assetId);
            dest.writeString(this.assetSymbol);
            dest.writeInt(this.isCrypto ? 1 : 0);
        }

        public NewsFeedAsset(UUID assetId, String assetSymbol, boolean z) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            this.assetId = assetId;
            this.assetSymbol = assetSymbol;
            this.isCrypto = z;
        }

        public /* synthetic */ NewsFeedAsset(UUID uuid, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, (i & 4) != 0 ? false : z);
        }

        public final UUID getAssetId() {
            return this.assetId;
        }

        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: isCrypto, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.BROWSE;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedVideoPlayer;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "videoId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getVideoId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NewsFeedVideoPlayer implements LegacyFragmentKey {
        public static final Parcelable.Creator<NewsFeedVideoPlayer> CREATOR = new Creator();
        private final UUID videoId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<NewsFeedVideoPlayer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedVideoPlayer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewsFeedVideoPlayer((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedVideoPlayer[] newArray(int i) {
                return new NewsFeedVideoPlayer[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsFeedVideoPlayer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.videoId);
        }

        public NewsFeedVideoPlayer(UUID uuid) {
            this.videoId = uuid;
        }

        public /* synthetic */ NewsFeedVideoPlayer(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getVideoId() {
            return this.videoId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedEmbeddedArticle;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "articleId", "Ljava/util/UUID;", "articleTemplate", "", "articleType", "analyticsPrefix", "sourceAssetId", "navBackUrl", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getArticleId", "()Ljava/util/UUID;", "getArticleTemplate", "()Ljava/lang/String;", "getArticleType", "getAnalyticsPrefix", "getSourceAssetId", "getNavBackUrl", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NewsFeedEmbeddedArticle implements LegacyFragmentKey {
        public static final Parcelable.Creator<NewsFeedEmbeddedArticle> CREATOR = new Creator();
        private final String analyticsPrefix;
        private final UUID articleId;
        private final String articleTemplate;
        private final String articleType;
        private final String navBackUrl;
        private final UUID sourceAssetId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<NewsFeedEmbeddedArticle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedEmbeddedArticle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewsFeedEmbeddedArticle((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewsFeedEmbeddedArticle[] newArray(int i) {
                return new NewsFeedEmbeddedArticle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.articleId);
            dest.writeString(this.articleTemplate);
            dest.writeString(this.articleType);
            dest.writeString(this.analyticsPrefix);
            dest.writeSerializable(this.sourceAssetId);
            dest.writeString(this.navBackUrl);
        }

        public NewsFeedEmbeddedArticle(UUID articleId, String str, String str2, String analyticsPrefix, UUID uuid, String str3) {
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(analyticsPrefix, "analyticsPrefix");
            this.articleId = articleId;
            this.articleTemplate = str;
            this.articleType = str2;
            this.analyticsPrefix = analyticsPrefix;
            this.sourceAssetId = uuid;
            this.navBackUrl = str3;
        }

        public /* synthetic */ NewsFeedEmbeddedArticle(UUID uuid, String str, String str2, String str3, UUID uuid2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, str2, str3, (i & 16) != 0 ? null : uuid2, (i & 32) != 0 ? null : str4);
        }

        public final UUID getArticleId() {
            return this.articleId;
        }

        public final String getArticleTemplate() {
            return this.articleTemplate;
        }

        public final String getArticleType() {
            return this.articleType;
        }

        public final String getAnalyticsPrefix() {
            return this.analyticsPrefix;
        }

        public final UUID getSourceAssetId() {
            return this.sourceAssetId;
        }

        public final String getNavBackUrl() {
            return this.navBackUrl;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionOrderDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "optionOrderIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getOptionOrderIds", "()Ljava/util/List;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionOrderDetail implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<OptionOrderDetail> CREATOR = new Creator();
        private final List<UUID> optionOrderIds;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionOrderDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new OptionOrderDetail(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOrderDetail[] newArray(int i) {
                return new OptionOrderDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UUID> list = this.optionOrderIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public OptionOrderDetail(List<UUID> optionOrderIds) {
            Intrinsics.checkNotNullParameter(optionOrderIds, "optionOrderIds");
            this.optionOrderIds = optionOrderIds;
        }

        public final List<UUID> getOptionOrderIds() {
            return this.optionOrderIds;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsProfitLossChartEducation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsProfitLossChartEducation implements LegacyFragmentKey {
        public static final OptionsProfitLossChartEducation INSTANCE = new OptionsProfitLossChartEducation();
        public static final Parcelable.Creator<OptionsProfitLossChartEducation> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionsProfitLossChartEducation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsProfitLossChartEducation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptionsProfitLossChartEducation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsProfitLossChartEducation[] newArray(int i) {
                return new OptionsProfitLossChartEducation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private OptionsProfitLossChartEducation() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionStrategyBuilderIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "accountNumber", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionStrategyBuilderIntro implements LegacyFragmentKey {
        public static final Parcelable.Creator<OptionStrategyBuilderIntro> CREATOR = new Creator();
        private final String accountNumber;
        private final String source;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionStrategyBuilderIntro> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionStrategyBuilderIntro createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionStrategyBuilderIntro(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionStrategyBuilderIntro[] newArray(int i) {
                return new OptionStrategyBuilderIntro[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.source);
        }

        public OptionStrategyBuilderIntro(String str, String str2) {
            this.accountNumber = str;
            this.source = str2;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsWatchlistHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsWatchlistHub implements LegacyFragmentKey {
        public static final OptionsWatchlistHub INSTANCE = new OptionsWatchlistHub();
        public static final Parcelable.Creator<OptionsWatchlistHub> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionsWatchlistHub> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsWatchlistHub createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptionsWatchlistHub.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsWatchlistHub[] newArray(int i) {
                return new OptionsWatchlistHub[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private OptionsWatchlistHub() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "name", "", "orderIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOrderIds", "()Ljava/util/List;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderDetail implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<OrderDetail> CREATOR = new Creator();
        private final String name;
        private final List<UUID> orderIds;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OrderDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new OrderDetail(string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderDetail[] newArray(int i) {
                return new OrderDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            List<UUID> list = this.orderIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public OrderDetail(String name, List<UUID> orderIds) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(orderIds, "orderIds");
            this.name = name;
            this.orderIds = orderIds;
        }

        public final String getName() {
            return this.name;
        }

        public final List<UUID> getOrderIds() {
            return this.orderIds;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderSummaryExplanation;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "instrumentIds", "", "Ljava/util/UUID;", "isPresetPercentLimitOrder", "", "presetPercentLimit", "Ljava/math/BigDecimal;", "loggingIdentifier", "<init>", "(Ljava/util/List;ZLjava/math/BigDecimal;Ljava/util/UUID;)V", "getInstrumentIds", "()Ljava/util/List;", "()Z", "getPresetPercentLimit", "()Ljava/math/BigDecimal;", "getLoggingIdentifier", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderSummaryExplanation implements LegacyFragmentKey {
        public static final Parcelable.Creator<OrderSummaryExplanation> CREATOR = new Creator();
        private final List<UUID> instrumentIds;
        private final boolean isPresetPercentLimitOrder;
        private final UUID loggingIdentifier;
        private final BigDecimal presetPercentLimit;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OrderSummaryExplanation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderSummaryExplanation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new OrderSummaryExplanation(arrayList, parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderSummaryExplanation[] newArray(int i) {
                return new OrderSummaryExplanation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UUID> list = this.instrumentIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeInt(this.isPresetPercentLimitOrder ? 1 : 0);
            dest.writeSerializable(this.presetPercentLimit);
            dest.writeSerializable(this.loggingIdentifier);
        }

        public OrderSummaryExplanation(List<UUID> instrumentIds, boolean z, BigDecimal bigDecimal, UUID uuid) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            this.instrumentIds = instrumentIds;
            this.isPresetPercentLimitOrder = z;
            this.presetPercentLimit = bigDecimal;
            this.loggingIdentifier = uuid;
        }

        public /* synthetic */ OrderSummaryExplanation(List list, boolean z, BigDecimal bigDecimal, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, bigDecimal, (i & 8) != 0 ? null : uuid);
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }

        /* renamed from: isPresetPercentLimitOrder, reason: from getter */
        public final boolean getIsPresetPercentLimitOrder() {
            return this.isPresetPercentLimitOrder;
        }

        public final BigDecimal getPresetPercentLimit() {
            return this.presetPercentLimit;
        }

        public final UUID getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OutboundVoicePage;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$OutboundVoicePage;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OutboundVoicePage implements LegacyFragmentKey {
        public static final Parcelable.Creator<OutboundVoicePage> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.OutboundVoicePage> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OutboundVoicePage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutboundVoicePage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutboundVoicePage((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(OutboundVoicePage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutboundVoicePage[] newArray(int i) {
                return new OutboundVoicePage[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public OutboundVoicePage(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.OutboundVoicePage> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.OutboundVoicePage> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaRequestDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "requestId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getRequestId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MatchaRequestDetail implements LegacyFragmentKey {
        public static final Parcelable.Creator<MatchaRequestDetail> CREATOR = new Creator();
        private final UUID requestId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MatchaRequestDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaRequestDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MatchaRequestDetail((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaRequestDetail[] newArray(int i) {
                return new MatchaRequestDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.requestId);
        }

        public MatchaRequestDetail(UUID requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.requestId = requestId;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Scan", "View", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode$Scan;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode$View;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface MatchaQrCode extends LegacyFragmentKey {

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode$Scan;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Scan implements MatchaQrCode {
            public static final Scan INSTANCE = new Scan();
            public static final Parcelable.Creator<Scan> CREATOR = new Creator();

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Scan> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Scan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Scan.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Scan[] newArray(int i) {
                    return new Scan[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Scan() {
            }
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode$View;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class View implements MatchaQrCode {
            public static final View INSTANCE = new View();
            public static final Parcelable.Creator<View> CREATOR = new Creator();

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<View> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final View createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return View.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final View[] newArray(int i) {
                    return new View[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private View() {
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewProductsLanding;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NewProductsLanding implements LegacyFragmentKey {
        public static final Parcelable.Creator<NewProductsLanding> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<NewProductsLanding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewProductsLanding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewProductsLanding(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewProductsLanding[] newArray(int i) {
                return new NewProductsLanding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        public NewProductsLanding(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderEmailChallenge;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$EmailChallenge;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderEmailChallenge implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderEmailChallenge> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.EmailChallenge> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderEmailChallenge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderEmailChallenge createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderEmailChallenge((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderEmailChallenge.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderEmailChallenge[] newArray(int i) {
                return new PathfinderEmailChallenge[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderEmailChallenge copy$default(PathfinderEmailChallenge pathfinderEmailChallenge, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderEmailChallenge.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderEmailChallenge.userViewState;
            }
            return pathfinderEmailChallenge.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.EmailChallenge> component2() {
            return this.userViewState;
        }

        public final PathfinderEmailChallenge copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.EmailChallenge> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderEmailChallenge(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderEmailChallenge)) {
                return false;
            }
            PathfinderEmailChallenge pathfinderEmailChallenge = (PathfinderEmailChallenge) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderEmailChallenge.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderEmailChallenge.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderEmailChallenge(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderEmailChallenge(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.EmailChallenge> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.EmailChallenge> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsChallenge;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SmsChallenge;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderSmsChallenge implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderSmsChallenge> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SmsChallenge> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderSmsChallenge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsChallenge createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderSmsChallenge((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderSmsChallenge.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsChallenge[] newArray(int i) {
                return new PathfinderSmsChallenge[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderSmsChallenge copy$default(PathfinderSmsChallenge pathfinderSmsChallenge, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderSmsChallenge.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderSmsChallenge.userViewState;
            }
            return pathfinderSmsChallenge.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsChallenge> component2() {
            return this.userViewState;
        }

        public final PathfinderSmsChallenge copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsChallenge> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderSmsChallenge(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderSmsChallenge)) {
                return false;
            }
            PathfinderSmsChallenge pathfinderSmsChallenge = (PathfinderSmsChallenge) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderSmsChallenge.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderSmsChallenge.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderSmsChallenge(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderSmsChallenge(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsChallenge> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsChallenge> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollOtp;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SmsMfaEnrollOtp;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderSmsMfaEnrollOtp implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderSmsMfaEnrollOtp> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderSmsMfaEnrollOtp> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsMfaEnrollOtp createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderSmsMfaEnrollOtp((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderSmsMfaEnrollOtp.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsMfaEnrollOtp[] newArray(int i) {
                return new PathfinderSmsMfaEnrollOtp[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderSmsMfaEnrollOtp copy$default(PathfinderSmsMfaEnrollOtp pathfinderSmsMfaEnrollOtp, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderSmsMfaEnrollOtp.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderSmsMfaEnrollOtp.userViewState;
            }
            return pathfinderSmsMfaEnrollOtp.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> component2() {
            return this.userViewState;
        }

        public final PathfinderSmsMfaEnrollOtp copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderSmsMfaEnrollOtp(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderSmsMfaEnrollOtp)) {
                return false;
            }
            PathfinderSmsMfaEnrollOtp pathfinderSmsMfaEnrollOtp = (PathfinderSmsMfaEnrollOtp) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderSmsMfaEnrollOtp.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderSmsMfaEnrollOtp.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderSmsMfaEnrollOtp(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderSmsMfaEnrollOtp(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderAppMfaEnroll;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$AppMfaEnroll;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderAppMfaEnroll implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderAppMfaEnroll> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.AppMfaEnroll> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderAppMfaEnroll> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderAppMfaEnroll createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderAppMfaEnroll((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderAppMfaEnroll.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderAppMfaEnroll[] newArray(int i) {
                return new PathfinderAppMfaEnroll[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderAppMfaEnroll copy$default(PathfinderAppMfaEnroll pathfinderAppMfaEnroll, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderAppMfaEnroll.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderAppMfaEnroll.userViewState;
            }
            return pathfinderAppMfaEnroll.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.AppMfaEnroll> component2() {
            return this.userViewState;
        }

        public final PathfinderAppMfaEnroll copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.AppMfaEnroll> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderAppMfaEnroll(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderAppMfaEnroll)) {
                return false;
            }
            PathfinderAppMfaEnroll pathfinderAppMfaEnroll = (PathfinderAppMfaEnroll) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderAppMfaEnroll.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderAppMfaEnroll.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderAppMfaEnroll(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderAppMfaEnroll(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.AppMfaEnroll> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.AppMfaEnroll> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderIdentityVerificationInitiate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$IdentityVerificationInitiate;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderIdentityVerificationInitiate implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderIdentityVerificationInitiate> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.IdentityVerificationInitiate> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderIdentityVerificationInitiate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderIdentityVerificationInitiate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderIdentityVerificationInitiate((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderIdentityVerificationInitiate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderIdentityVerificationInitiate[] newArray(int i) {
                return new PathfinderIdentityVerificationInitiate[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderIdentityVerificationInitiate copy$default(PathfinderIdentityVerificationInitiate pathfinderIdentityVerificationInitiate, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderIdentityVerificationInitiate.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderIdentityVerificationInitiate.userViewState;
            }
            return pathfinderIdentityVerificationInitiate.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.IdentityVerificationInitiate> component2() {
            return this.userViewState;
        }

        public final PathfinderIdentityVerificationInitiate copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.IdentityVerificationInitiate> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderIdentityVerificationInitiate(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderIdentityVerificationInitiate)) {
                return false;
            }
            PathfinderIdentityVerificationInitiate pathfinderIdentityVerificationInitiate = (PathfinderIdentityVerificationInitiate) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderIdentityVerificationInitiate.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderIdentityVerificationInitiate.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderIdentityVerificationInitiate(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderIdentityVerificationInitiate(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.IdentityVerificationInitiate> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.IdentityVerificationInitiate> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderLoggedInIdentityVerificationWait;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$LoggedInIdentityVerificationWait;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderLoggedInIdentityVerificationWait implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderLoggedInIdentityVerificationWait> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.LoggedInIdentityVerificationWait> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderLoggedInIdentityVerificationWait> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderLoggedInIdentityVerificationWait createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderLoggedInIdentityVerificationWait((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderLoggedInIdentityVerificationWait.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderLoggedInIdentityVerificationWait[] newArray(int i) {
                return new PathfinderLoggedInIdentityVerificationWait[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderLoggedInIdentityVerificationWait copy$default(PathfinderLoggedInIdentityVerificationWait pathfinderLoggedInIdentityVerificationWait, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderLoggedInIdentityVerificationWait.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderLoggedInIdentityVerificationWait.userViewState;
            }
            return pathfinderLoggedInIdentityVerificationWait.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.LoggedInIdentityVerificationWait> component2() {
            return this.userViewState;
        }

        public final PathfinderLoggedInIdentityVerificationWait copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.LoggedInIdentityVerificationWait> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderLoggedInIdentityVerificationWait(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderLoggedInIdentityVerificationWait)) {
                return false;
            }
            PathfinderLoggedInIdentityVerificationWait pathfinderLoggedInIdentityVerificationWait = (PathfinderLoggedInIdentityVerificationWait) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderLoggedInIdentityVerificationWait.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderLoggedInIdentityVerificationWait.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderLoggedInIdentityVerificationWait(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderLoggedInIdentityVerificationWait(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.LoggedInIdentityVerificationWait> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.LoggedInIdentityVerificationWait> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderPdtDepositFundsInitiated;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$PdtDepositFundsInitiated;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderPdtDepositFundsInitiated implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderPdtDepositFundsInitiated> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.PdtDepositFundsInitiated> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderPdtDepositFundsInitiated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderPdtDepositFundsInitiated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderPdtDepositFundsInitiated((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderPdtDepositFundsInitiated.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderPdtDepositFundsInitiated[] newArray(int i) {
                return new PathfinderPdtDepositFundsInitiated[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderPdtDepositFundsInitiated copy$default(PathfinderPdtDepositFundsInitiated pathfinderPdtDepositFundsInitiated, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderPdtDepositFundsInitiated.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderPdtDepositFundsInitiated.userViewState;
            }
            return pathfinderPdtDepositFundsInitiated.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.PdtDepositFundsInitiated> component2() {
            return this.userViewState;
        }

        public final PathfinderPdtDepositFundsInitiated copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.PdtDepositFundsInitiated> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderPdtDepositFundsInitiated(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderPdtDepositFundsInitiated)) {
                return false;
            }
            PathfinderPdtDepositFundsInitiated pathfinderPdtDepositFundsInitiated = (PathfinderPdtDepositFundsInitiated) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderPdtDepositFundsInitiated.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderPdtDepositFundsInitiated.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderPdtDepositFundsInitiated(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderPdtDepositFundsInitiated(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.PdtDepositFundsInitiated> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.PdtDepositFundsInitiated> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "inquiryId", "Ljava/util/UUID;", "getInquiryId", "()Ljava/util/UUID;", "sequence", "", "getSequence", "()I", "Default", "PaginatedList", "PaginatedListWithTabs", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$Default;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$PaginatedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$PaginatedListWithTabs;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PathfinderSdui implements LegacyFragmentKey {
        public /* synthetic */ PathfinderSdui(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract UUID getInquiryId();

        public abstract int getSequence();

        private PathfinderSdui() {
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$Default;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "inquiryId", "Ljava/util/UUID;", "sequence", "", "<init>", "(Ljava/util/UUID;I)V", "getInquiryId", "()Ljava/util/UUID;", "getSequence", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Default extends PathfinderSdui {
            public static final Parcelable.Creator<Default> CREATOR = new Creator();
            private final UUID inquiryId;
            private final int sequence;

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Default> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default((UUID) parcel.readSerializable(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.inquiryId);
                dest.writeInt(this.sequence);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public UUID getInquiryId() {
                return this.inquiryId;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public int getSequence() {
                return this.sequence;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(UUID inquiryId, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
                this.sequence = i;
            }
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$PaginatedList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "inquiryId", "Ljava/util/UUID;", "sequence", "", "<init>", "(Ljava/util/UUID;I)V", "getInquiryId", "()Ljava/util/UUID;", "getSequence", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PaginatedList extends PathfinderSdui {
            public static final Parcelable.Creator<PaginatedList> CREATOR = new Creator();
            private final UUID inquiryId;
            private final int sequence;

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<PaginatedList> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaginatedList createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaginatedList((UUID) parcel.readSerializable(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaginatedList[] newArray(int i) {
                    return new PaginatedList[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.inquiryId);
                dest.writeInt(this.sequence);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public UUID getInquiryId() {
                return this.inquiryId;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public int getSequence() {
                return this.sequence;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaginatedList(UUID inquiryId, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
                this.sequence = i;
            }
        }

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui$PaginatedListWithTabs;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "inquiryId", "Ljava/util/UUID;", "sequence", "", "<init>", "(Ljava/util/UUID;I)V", "getInquiryId", "()Ljava/util/UUID;", "getSequence", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PaginatedListWithTabs extends PathfinderSdui {
            public static final Parcelable.Creator<PaginatedListWithTabs> CREATOR = new Creator();
            private final UUID inquiryId;
            private final int sequence;

            /* compiled from: LegacyFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<PaginatedListWithTabs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaginatedListWithTabs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaginatedListWithTabs((UUID) parcel.readSerializable(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaginatedListWithTabs[] newArray(int i) {
                    return new PaginatedListWithTabs[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.inquiryId);
                dest.writeInt(this.sequence);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public UUID getInquiryId() {
                return this.inquiryId;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyFragmentKey.PathfinderSdui
            public int getSequence() {
                return this.sequence;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaginatedListWithTabs(UUID inquiryId, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
                this.sequence = i;
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollPhoneInput;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SmsMfaEnrollPhoneInput;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PathfinderSmsMfaEnrollPhoneInput implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderSmsMfaEnrollPhoneInput> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollPhoneInput> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderSmsMfaEnrollPhoneInput> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsMfaEnrollPhoneInput createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderSmsMfaEnrollPhoneInput((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderSmsMfaEnrollPhoneInput.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderSmsMfaEnrollPhoneInput[] newArray(int i) {
                return new PathfinderSmsMfaEnrollPhoneInput[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PathfinderSmsMfaEnrollPhoneInput copy$default(PathfinderSmsMfaEnrollPhoneInput pathfinderSmsMfaEnrollPhoneInput, UUID uuid, UserViewState.Page page, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pathfinderSmsMfaEnrollPhoneInput.inquiryId;
            }
            if ((i & 2) != 0) {
                page = pathfinderSmsMfaEnrollPhoneInput.userViewState;
            }
            return pathfinderSmsMfaEnrollPhoneInput.copy(uuid, page);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollPhoneInput> component2() {
            return this.userViewState;
        }

        public final PathfinderSmsMfaEnrollPhoneInput copy(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollPhoneInput> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            return new PathfinderSmsMfaEnrollPhoneInput(inquiryId, userViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathfinderSmsMfaEnrollPhoneInput)) {
                return false;
            }
            PathfinderSmsMfaEnrollPhoneInput pathfinderSmsMfaEnrollPhoneInput = (PathfinderSmsMfaEnrollPhoneInput) other;
            return Intrinsics.areEqual(this.inquiryId, pathfinderSmsMfaEnrollPhoneInput.inquiryId) && Intrinsics.areEqual(this.userViewState, pathfinderSmsMfaEnrollPhoneInput.userViewState);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.userViewState.hashCode();
        }

        public String toString() {
            return "PathfinderSmsMfaEnrollPhoneInput(inquiryId=" + this.inquiryId + ", userViewState=" + this.userViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderSmsMfaEnrollPhoneInput(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollPhoneInput> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollPhoneInput> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "receivedAchTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getReceivedAchTransferId", "()Ljava/util/UUID;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaycheckDetail implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<PaycheckDetail> CREATOR = new Creator();
        private final UUID receivedAchTransferId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PaycheckDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaycheckDetail((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckDetail[] newArray(int i) {
                return new PaycheckDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.receivedAchTransferId);
        }

        public PaycheckDetail(UUID receivedAchTransferId) {
            Intrinsics.checkNotNullParameter(receivedAchTransferId, "receivedAchTransferId");
            this.receivedAchTransferId = receivedAchTransferId;
        }

        public final UUID getReceivedAchTransferId() {
            return this.receivedAchTransferId;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaycheckHub implements LegacyFragmentKey, TabFragmentKey {
        public static final PaycheckHub INSTANCE = new PaycheckHub();
        public static final Parcelable.Creator<PaycheckHub> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PaycheckHub> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckHub createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaycheckHub.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckHub[] newArray(int i) {
                return new PaycheckHub[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private PaycheckHub() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckRecurringInvestmentsHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaycheckRecurringInvestmentsHub implements LegacyFragmentKey, TabFragmentKey {
        public static final PaycheckRecurringInvestmentsHub INSTANCE = new PaycheckRecurringInvestmentsHub();
        public static final Parcelable.Creator<PaycheckRecurringInvestmentsHub> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PaycheckRecurringInvestmentsHub> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckRecurringInvestmentsHub createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaycheckRecurringInvestmentsHub.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaycheckRecurringInvestmentsHub[] newArray(int i) {
                return new PaycheckRecurringInvestmentsHub[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private PaycheckRecurringInvestmentsHub() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PreviousTaxDocuments;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PreviousTaxDocuments implements LegacyFragmentKey, TabFragmentKey {
        public static final PreviousTaxDocuments INSTANCE = new PreviousTaxDocuments();
        public static final Parcelable.Creator<PreviousTaxDocuments> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PreviousTaxDocuments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviousTaxDocuments createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreviousTaxDocuments.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviousTaxDocuments[] newArray(int i) {
                return new PreviousTaxDocuments[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private PreviousTaxDocuments() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileVisibility;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "showSetupProfileButton", "", "<init>", "(Z)V", "getShowSetupProfileButton", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProfileVisibility implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<ProfileVisibility> CREATOR = new Creator();
        private final boolean showSetupProfileButton;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ProfileVisibility> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProfileVisibility createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProfileVisibility(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProfileVisibility[] newArray(int i) {
                return new ProfileVisibility[i];
            }
        }

        public ProfileVisibility() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showSetupProfileButton ? 1 : 0);
        }

        public ProfileVisibility(boolean z) {
            this.showSetupProfileButton = z;
        }

        public /* synthetic */ ProfileVisibility(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getShowSetupProfileButton() {
            return this.showSetupProfileButton;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountCenter;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountCenter implements LegacyFragmentKey, TabFragmentKey {
        public static final AccountCenter INSTANCE = new AccountCenter();
        public static final Parcelable.Creator<AccountCenter> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<AccountCenter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountCenter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountCenter.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountCenter[] newArray(int i) {
                return new AccountCenter[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AccountCenter() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "context", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;)V", "getContext", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Context", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ProfileEdit implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<ProfileEdit> CREATOR = new Creator();
        private final Context context;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ProfileEdit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProfileEdit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProfileEdit(Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProfileEdit[] newArray(int i) {
                return new ProfileEdit[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ProfileEdit() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.context.name());
        }

        public ProfileEdit(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        public /* synthetic */ ProfileEdit(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Context.STANDARD : context);
        }

        public final Context getContext() {
            return this.context;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "FROM_EDIT_VISIBILITY", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Context {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Context[] $VALUES;
            public static final Context STANDARD = new Context("STANDARD", 0);
            public static final Context FROM_EDIT_VISIBILITY = new Context("FROM_EDIT_VISIBILITY", 1);

            private static final /* synthetic */ Context[] $values() {
                return new Context[]{STANDARD, FROM_EDIT_VISIBILITY};
            }

            public static EnumEntries<Context> getEntries() {
                return $ENTRIES;
            }

            private Context(String str, int i) {
            }

            static {
                Context[] contextArr$values = $values();
                $VALUES = contextArr$values;
                $ENTRIES = EnumEntries2.enumEntries(contextArr$values);
            }

            public static Context valueOf(String str) {
                return (Context) Enum.valueOf(Context.class, str);
            }

            public static Context[] values() {
                return (Context[]) $VALUES.clone();
            }
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyOnboardingIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "hasClosedCashManagementBanner", "", "<init>", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Z)V", "getContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getHasClosedCashManagementBanner", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyOnboardingIntro implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<RhyOnboardingIntro> CREATOR = new Creator();
        private final ProductMarketingContent content;
        private final boolean hasClosedCashManagementBanner;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyOnboardingIntro> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOnboardingIntro createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyOnboardingIntro((ProductMarketingContent) parcel.readParcelable(RhyOnboardingIntro.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOnboardingIntro[] newArray(int i) {
                return new RhyOnboardingIntro[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
            dest.writeInt(this.hasClosedCashManagementBanner ? 1 : 0);
        }

        public RhyOnboardingIntro(ProductMarketingContent content, boolean z) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.hasClosedCashManagementBanner = z;
        }

        public /* synthetic */ RhyOnboardingIntro(ProductMarketingContent productMarketingContent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(productMarketingContent, (i & 2) != 0 ? false : z);
        }

        public final ProductMarketingContent getContent() {
            return this.content;
        }

        public final boolean getHasClosedCashManagementBanner() {
            return this.hasClosedCashManagementBanner;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyOverviewV2;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyOverviewV2 implements LegacyFragmentKey, TabFragmentKey, AccountSelectorTabKey {
        public static final Parcelable.Creator<RhyOverviewV2> CREATOR = new Creator();
        private final AccountSelectorTabArgs accountSelectorTabArgs;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyOverviewV2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOverviewV2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyOverviewV2((AccountSelectorTabArgs) parcel.readParcelable(RhyOverviewV2.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOverviewV2[] newArray(int i) {
                return new RhyOverviewV2[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RhyOverviewV2() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RhyOverviewV2 copy$default(RhyOverviewV2 rhyOverviewV2, AccountSelectorTabArgs accountSelectorTabArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSelectorTabArgs = rhyOverviewV2.accountSelectorTabArgs;
            }
            return rhyOverviewV2.copy(accountSelectorTabArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
            return this.accountSelectorTabArgs;
        }

        public final RhyOverviewV2 copy(AccountSelectorTabArgs accountSelectorTabArgs) {
            return new RhyOverviewV2(accountSelectorTabArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyOverviewV2) && Intrinsics.areEqual(this.accountSelectorTabArgs, ((RhyOverviewV2) other).accountSelectorTabArgs);
        }

        public int hashCode() {
            AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
            if (accountSelectorTabArgs == null) {
                return 0;
            }
            return accountSelectorTabArgs.hashCode();
        }

        public String toString() {
            return "RhyOverviewV2(accountSelectorTabArgs=" + this.accountSelectorTabArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountSelectorTabArgs, flags);
        }

        public RhyOverviewV2(AccountSelectorTabArgs accountSelectorTabArgs) {
            this.accountSelectorTabArgs = accountSelectorTabArgs;
        }

        public /* synthetic */ RhyOverviewV2(AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountSelectorTabArgs);
        }

        @Override // com.robinhood.android.redesign.accounttab.AccountSelectorTabKey
        public AccountSelectorTabArgs getAccountSelectorTabArgs() {
            return this.accountSelectorTabArgs;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyFullScreenInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "<init>", "(Lcom/robinhood/models/db/rhy/RhyTabState$Info;)V", "getInfo", "()Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyFullScreenInfo implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<RhyFullScreenInfo> CREATOR = new Creator();
        private final RhyTabState.Info info;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyFullScreenInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyFullScreenInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyFullScreenInfo((RhyTabState.Info) parcel.readParcelable(RhyFullScreenInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyFullScreenInfo[] newArray(int i) {
                return new RhyFullScreenInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.info, flags);
        }

        public RhyFullScreenInfo(RhyTabState.Info info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final RhyTabState.Info getInfo() {
            return this.info;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyPendingScreen;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "<init>", "(Lcom/robinhood/models/db/rhy/RhyTabState$Info;)V", "getInfo", "()Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyPendingScreen implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<RhyPendingScreen> CREATOR = new Creator();
        private final RhyTabState.Info info;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyPendingScreen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyPendingScreen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyPendingScreen((RhyTabState.Info) parcel.readParcelable(RhyPendingScreen.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyPendingScreen[] newArray(int i) {
                return new RhyPendingScreen[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.info, flags);
        }

        public RhyPendingScreen(RhyTabState.Info info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final RhyTabState.Info getInfo() {
            return this.info;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyAccountSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyAccountSettings implements LegacyFragmentKey, TabFragmentKey {
        public static final RhyAccountSettings INSTANCE = new RhyAccountSettings();
        public static final Parcelable.Creator<RhyAccountSettings> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyAccountSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyAccountSettings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RhyAccountSettings.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyAccountSettings[] newArray(int i) {
                return new RhyAccountSettings[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RhyAccountSettings() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings$Action;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings$Action;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings$Action;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Action", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyCardSettings implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<RhyCardSettings> CREATOR = new Creator();
        private final Action action;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyCardSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyCardSettings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyCardSettings(parcel.readInt() == 0 ? null : Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyCardSettings[] newArray(int i) {
                return new RhyCardSettings[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RhyCardSettings() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RhyCardSettings copy$default(RhyCardSettings rhyCardSettings, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                action = rhyCardSettings.action;
            }
            return rhyCardSettings.copy(action);
        }

        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final RhyCardSettings copy(Action action) {
            return new RhyCardSettings(action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyCardSettings) && this.action == ((RhyCardSettings) other).action;
        }

        public int hashCode() {
            Action action = this.action;
            if (action == null) {
                return 0;
            }
            return action.hashCode();
        }

        public String toString() {
            return "RhyCardSettings(action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Action action = this.action;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(action.name());
            }
        }

        public RhyCardSettings(Action action) {
            this.action = action;
        }

        public /* synthetic */ RhyCardSettings(Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : action);
        }

        public final Action getAction() {
            return this.action;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings$Action;", "", "<init>", "(Ljava/lang/String;I)V", "UNLOCK_CARD", "SHOW_CARD_NUMBER", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Action {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action UNLOCK_CARD = new Action("UNLOCK_CARD", 0);
            public static final Action SHOW_CARD_NUMBER = new Action("SHOW_CARD_NUMBER", 1);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{UNLOCK_CARD, SHOW_CARD_NUMBER};
            }

            public static EnumEntries<Action> getEntries() {
                return $ENTRIES;
            }

            private Action(String str, int i) {
            }

            static {
                Action[] actionArr$values = $values();
                $VALUES = actionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOfferTerms;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyMerchantRewardsOfferTerms implements LegacyFragmentKey {
        public static final Parcelable.Creator<RhyMerchantRewardsOfferTerms> CREATOR = new Creator();
        private final UUID id;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyMerchantRewardsOfferTerms> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsOfferTerms createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyMerchantRewardsOfferTerms((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsOfferTerms[] newArray(int i) {
                return new RhyMerchantRewardsOfferTerms[i];
            }
        }

        public static /* synthetic */ RhyMerchantRewardsOfferTerms copy$default(RhyMerchantRewardsOfferTerms rhyMerchantRewardsOfferTerms, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhyMerchantRewardsOfferTerms.id;
            }
            return rhyMerchantRewardsOfferTerms.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final RhyMerchantRewardsOfferTerms copy(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new RhyMerchantRewardsOfferTerms(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyMerchantRewardsOfferTerms) && Intrinsics.areEqual(this.id, ((RhyMerchantRewardsOfferTerms) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "RhyMerchantRewardsOfferTerms(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
        }

        public RhyMerchantRewardsOfferTerms(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final UUID getId() {
            return this.id;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "offerId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOfferId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyMerchantRewardsOverview implements LegacyFragmentKey {
        public static final Parcelable.Creator<RhyMerchantRewardsOverview> CREATOR = new Creator();
        private final UUID offerId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyMerchantRewardsOverview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsOverview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyMerchantRewardsOverview((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsOverview[] newArray(int i) {
                return new RhyMerchantRewardsOverview[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RhyMerchantRewardsOverview() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RhyMerchantRewardsOverview copy$default(RhyMerchantRewardsOverview rhyMerchantRewardsOverview, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhyMerchantRewardsOverview.offerId;
            }
            return rhyMerchantRewardsOverview.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOfferId() {
            return this.offerId;
        }

        public final RhyMerchantRewardsOverview copy(UUID offerId) {
            return new RhyMerchantRewardsOverview(offerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyMerchantRewardsOverview) && Intrinsics.areEqual(this.offerId, ((RhyMerchantRewardsOverview) other).offerId);
        }

        public int hashCode() {
            UUID uuid = this.offerId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "RhyMerchantRewardsOverview(offerId=" + this.offerId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.offerId);
        }

        public RhyMerchantRewardsOverview(UUID uuid) {
            this.offerId = uuid;
        }

        public /* synthetic */ RhyMerchantRewardsOverview(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getOfferId() {
            return this.offerId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MerchantRewardHistory;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "j$/time/Instant", "startAt", "<init>", "(Lj$/time/Instant;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MerchantRewardHistory;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getStartAt", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "defaultTab", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MerchantRewardHistory implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<MerchantRewardHistory> CREATOR = new Creator();
        private final Instant startAt;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MerchantRewardHistory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantRewardHistory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantRewardHistory((Instant) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantRewardHistory[] newArray(int i) {
                return new MerchantRewardHistory[i];
            }
        }

        public static /* synthetic */ MerchantRewardHistory copy$default(MerchantRewardHistory merchantRewardHistory, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = merchantRewardHistory.startAt;
            }
            return merchantRewardHistory.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getStartAt() {
            return this.startAt;
        }

        public final MerchantRewardHistory copy(Instant startAt) {
            Intrinsics.checkNotNullParameter(startAt, "startAt");
            return new MerchantRewardHistory(startAt);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MerchantRewardHistory) && Intrinsics.areEqual(this.startAt, ((MerchantRewardHistory) other).startAt);
        }

        public int hashCode() {
            return this.startAt.hashCode();
        }

        public String toString() {
            return "MerchantRewardHistory(startAt=" + this.startAt + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.startAt);
        }

        public MerchantRewardHistory(Instant startAt) {
            Intrinsics.checkNotNullParameter(startAt, "startAt");
            this.startAt = startAt;
        }

        public final Instant getStartAt() {
            return this.startAt;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsWelcome;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "fromOverviewPage", "", "offerId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "getFromOverviewPage", "()Z", "getOfferId", "()Ljava/util/UUID;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyMerchantRewardsWelcome implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<RhyMerchantRewardsWelcome> CREATOR = new Creator();
        private final boolean fromOverviewPage;
        private final UUID offerId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyMerchantRewardsWelcome> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsWelcome createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyMerchantRewardsWelcome(parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewardsWelcome[] newArray(int i) {
                return new RhyMerchantRewardsWelcome[i];
            }
        }

        public static /* synthetic */ RhyMerchantRewardsWelcome copy$default(RhyMerchantRewardsWelcome rhyMerchantRewardsWelcome, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rhyMerchantRewardsWelcome.fromOverviewPage;
            }
            if ((i & 2) != 0) {
                uuid = rhyMerchantRewardsWelcome.offerId;
            }
            return rhyMerchantRewardsWelcome.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getFromOverviewPage() {
            return this.fromOverviewPage;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOfferId() {
            return this.offerId;
        }

        public final RhyMerchantRewardsWelcome copy(boolean fromOverviewPage, UUID offerId) {
            return new RhyMerchantRewardsWelcome(fromOverviewPage, offerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhyMerchantRewardsWelcome)) {
                return false;
            }
            RhyMerchantRewardsWelcome rhyMerchantRewardsWelcome = (RhyMerchantRewardsWelcome) other;
            return this.fromOverviewPage == rhyMerchantRewardsWelcome.fromOverviewPage && Intrinsics.areEqual(this.offerId, rhyMerchantRewardsWelcome.offerId);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromOverviewPage) * 31;
            UUID uuid = this.offerId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "RhyMerchantRewardsWelcome(fromOverviewPage=" + this.fromOverviewPage + ", offerId=" + this.offerId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.fromOverviewPage ? 1 : 0);
            dest.writeSerializable(this.offerId);
        }

        public RhyMerchantRewardsWelcome(boolean z, UUID uuid) {
            this.fromOverviewPage = z;
            this.offerId = uuid;
        }

        public /* synthetic */ RhyMerchantRewardsWelcome(boolean z, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : uuid);
        }

        public final boolean getFromOverviewPage() {
            return this.fromOverviewPage;
        }

        public final UUID getOfferId() {
            return this.offerId;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyWaitlistComingSoon;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyWaitlistComingSoon implements LegacyFragmentKey, TabFragmentKey {
        public static final RhyWaitlistComingSoon INSTANCE = new RhyWaitlistComingSoon();
        public static final Parcelable.Creator<RhyWaitlistComingSoon> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyWaitlistComingSoon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlistComingSoon createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RhyWaitlistComingSoon.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlistComingSoon[] newArray(int i) {
                return new RhyWaitlistComingSoon[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RhyWaitlistComingSoon() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyWaitlistError;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyWaitlistError implements LegacyFragmentKey, TabFragmentKey {
        public static final RhyWaitlistError INSTANCE = new RhyWaitlistError();
        public static final Parcelable.Creator<RhyWaitlistError> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyWaitlistError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlistError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RhyWaitlistError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlistError[] newArray(int i) {
                return new RhyWaitlistError[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RhyWaitlistError() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.SPENDING;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsOverviewV2;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RoundupRewardsOverviewV2 implements LegacyFragmentKey {
        public static final RoundupRewardsOverviewV2 INSTANCE = new RoundupRewardsOverviewV2();
        public static final Parcelable.Creator<RoundupRewardsOverviewV2> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RoundupRewardsOverviewV2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsOverviewV2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoundupRewardsOverviewV2.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsOverviewV2[] newArray(int i) {
                return new RoundupRewardsOverviewV2[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RoundupRewardsOverviewV2() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RoundupRewardsSettings implements LegacyFragmentKey {
        public static final RoundupRewardsSettings INSTANCE = new RoundupRewardsSettings();
        public static final Parcelable.Creator<RoundupRewardsSettings> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RoundupRewardsSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsSettings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoundupRewardsSettings.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsSettings[] newArray(int i) {
                return new RoundupRewardsSettings[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RoundupRewardsSettings() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SafetyLabelsLesson;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "lessonId", "", "<init>", "(Ljava/lang/String;)V", "getLessonId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SafetyLabelsLesson implements LegacyFragmentKey {
        public static final Parcelable.Creator<SafetyLabelsLesson> CREATOR = new Creator();
        private final String lessonId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SafetyLabelsLesson> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SafetyLabelsLesson createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SafetyLabelsLesson(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SafetyLabelsLesson[] newArray(int i) {
                return new SafetyLabelsLesson[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.lessonId);
        }

        public SafetyLabelsLesson(String lessonId) {
            Intrinsics.checkNotNullParameter(lessonId, "lessonId");
            this.lessonId = lessonId;
        }

        public final String getLessonId() {
            return this.lessonId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SlipFaqs;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SlipFaqs implements LegacyFragmentKey {
        public static final Parcelable.Creator<SlipFaqs> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SlipFaqs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipFaqs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlipFaqs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipFaqs[] newArray(int i) {
                return new SlipFaqs[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        public SlipFaqs(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderAskQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "instrumentId", "Ljava/util/UUID;", "eventSlug", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getEventSlug", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShareholderAskQuestion implements LegacyFragmentKey {
        public static final Parcelable.Creator<ShareholderAskQuestion> CREATOR = new Creator();
        private final String eventSlug;
        private final UUID instrumentId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderAskQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderAskQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderAskQuestion((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderAskQuestion[] newArray(int i) {
                return new ShareholderAskQuestion[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.eventSlug);
        }

        public ShareholderAskQuestion(UUID instrumentId, String eventSlug) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            this.instrumentId = instrumentId;
            this.eventSlug = eventSlug;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "qaEventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "shareEnabled", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Z)V", "getQaEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getShareEnabled", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShareholderEventInfo implements LegacyFragmentKey {
        public static final Parcelable.Creator<ShareholderEventInfo> CREATOR = new Creator();
        private final QaEventMetadata qaEventMetadata;
        private final boolean shareEnabled;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderEventInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderEventInfo((QaEventMetadata) parcel.readParcelable(ShareholderEventInfo.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventInfo[] newArray(int i) {
                return new ShareholderEventInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.qaEventMetadata, flags);
            dest.writeInt(this.shareEnabled ? 1 : 0);
        }

        public ShareholderEventInfo(QaEventMetadata qaEventMetadata, boolean z) {
            Intrinsics.checkNotNullParameter(qaEventMetadata, "qaEventMetadata");
            this.qaEventMetadata = qaEventMetadata;
            this.shareEnabled = z;
        }

        public final QaEventMetadata getQaEventMetadata() {
            return this.qaEventMetadata;
        }

        public final boolean getShareEnabled() {
            return this.shareEnabled;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventsPage;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShareholderEventsPage implements LegacyFragmentKey {
        public static final Parcelable.Creator<ShareholderEventsPage> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderEventsPage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventsPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderEventsPage((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventsPage[] newArray(int i) {
                return new ShareholderEventsPage[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public ShareholderEventsPage(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventQuestionList;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Landroid/os/Parcelable;", "eventSlug", "", "instrumentId", "Ljava/util/UUID;", "symbol", "questionId", "sayReferenceId", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;)V", "getEventSlug", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "getQuestionId", "getSayReferenceId", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderEventQuestionList implements LegacyFragmentKey, Parcelable {
        public static final Parcelable.Creator<ShareholderEventQuestionList> CREATOR = new Creator();
        private final ShareholderQAContext.EntryPoint entryPoint;
        private final String eventSlug;
        private final UUID instrumentId;
        private final UUID questionId;
        private final String sayReferenceId;
        private final String symbol;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderEventQuestionList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventQuestionList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderEventQuestionList(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), ShareholderQAContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderEventQuestionList[] newArray(int i) {
                return new ShareholderEventQuestionList[i];
            }
        }

        public static /* synthetic */ ShareholderEventQuestionList copy$default(ShareholderEventQuestionList shareholderEventQuestionList, String str, UUID uuid, String str2, UUID uuid2, String str3, ShareholderQAContext.EntryPoint entryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareholderEventQuestionList.eventSlug;
            }
            if ((i & 2) != 0) {
                uuid = shareholderEventQuestionList.instrumentId;
            }
            if ((i & 4) != 0) {
                str2 = shareholderEventQuestionList.symbol;
            }
            if ((i & 8) != 0) {
                uuid2 = shareholderEventQuestionList.questionId;
            }
            if ((i & 16) != 0) {
                str3 = shareholderEventQuestionList.sayReferenceId;
            }
            if ((i & 32) != 0) {
                entryPoint = shareholderEventQuestionList.entryPoint;
            }
            String str4 = str3;
            ShareholderQAContext.EntryPoint entryPoint2 = entryPoint;
            return shareholderEventQuestionList.copy(str, uuid, str2, uuid2, str4, entryPoint2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventSlug() {
            return this.eventSlug;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getQuestionId() {
            return this.questionId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSayReferenceId() {
            return this.sayReferenceId;
        }

        /* renamed from: component6, reason: from getter */
        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final ShareholderEventQuestionList copy(String eventSlug, UUID instrumentId, String symbol, UUID questionId, String sayReferenceId, ShareholderQAContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new ShareholderEventQuestionList(eventSlug, instrumentId, symbol, questionId, sayReferenceId, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareholderEventQuestionList)) {
                return false;
            }
            ShareholderEventQuestionList shareholderEventQuestionList = (ShareholderEventQuestionList) other;
            return Intrinsics.areEqual(this.eventSlug, shareholderEventQuestionList.eventSlug) && Intrinsics.areEqual(this.instrumentId, shareholderEventQuestionList.instrumentId) && Intrinsics.areEqual(this.symbol, shareholderEventQuestionList.symbol) && Intrinsics.areEqual(this.questionId, shareholderEventQuestionList.questionId) && Intrinsics.areEqual(this.sayReferenceId, shareholderEventQuestionList.sayReferenceId) && this.entryPoint == shareholderEventQuestionList.entryPoint;
        }

        public int hashCode() {
            int iHashCode = this.eventSlug.hashCode() * 31;
            UUID uuid = this.instrumentId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.symbol;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            UUID uuid2 = this.questionId;
            int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            String str2 = this.sayReferenceId;
            return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "ShareholderEventQuestionList(eventSlug=" + this.eventSlug + ", instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", questionId=" + this.questionId + ", sayReferenceId=" + this.sayReferenceId + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.eventSlug);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.symbol);
            dest.writeSerializable(this.questionId);
            dest.writeString(this.sayReferenceId);
            dest.writeString(this.entryPoint.name());
        }

        public ShareholderEventQuestionList(String eventSlug, UUID uuid, String str, UUID uuid2, String str2, ShareholderQAContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.eventSlug = eventSlug;
            this.instrumentId = uuid;
            this.symbol = str;
            this.questionId = uuid2;
            this.sayReferenceId = str2;
            this.entryPoint = entryPoint;
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final UUID getQuestionId() {
            return this.questionId;
        }

        public final String getSayReferenceId() {
            return this.sayReferenceId;
        }

        public /* synthetic */ ShareholderEventQuestionList(String str, UUID uuid, String str2, UUID uuid2, String str3, ShareholderQAContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
        }

        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderExperienceIntro;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "qaEventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "questionId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;)V", "getQaEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getQuestionId", "()Ljava/util/UUID;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderExperienceIntro implements LegacyFragmentKey {
        public static final Parcelable.Creator<ShareholderExperienceIntro> CREATOR = new Creator();
        private final ShareholderQAContext.EntryPoint entryPoint;
        private final QaEventMetadata qaEventMetadata;
        private final UUID questionId;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderExperienceIntro> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderExperienceIntro createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderExperienceIntro((QaEventMetadata) parcel.readParcelable(ShareholderExperienceIntro.class.getClassLoader()), (UUID) parcel.readSerializable(), ShareholderQAContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderExperienceIntro[] newArray(int i) {
                return new ShareholderExperienceIntro[i];
            }
        }

        public static /* synthetic */ ShareholderExperienceIntro copy$default(ShareholderExperienceIntro shareholderExperienceIntro, QaEventMetadata qaEventMetadata, UUID uuid, ShareholderQAContext.EntryPoint entryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = shareholderExperienceIntro.qaEventMetadata;
            }
            if ((i & 2) != 0) {
                uuid = shareholderExperienceIntro.questionId;
            }
            if ((i & 4) != 0) {
                entryPoint = shareholderExperienceIntro.entryPoint;
            }
            return shareholderExperienceIntro.copy(qaEventMetadata, uuid, entryPoint);
        }

        /* renamed from: component1, reason: from getter */
        public final QaEventMetadata getQaEventMetadata() {
            return this.qaEventMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getQuestionId() {
            return this.questionId;
        }

        /* renamed from: component3, reason: from getter */
        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final ShareholderExperienceIntro copy(QaEventMetadata qaEventMetadata, UUID questionId, ShareholderQAContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(qaEventMetadata, "qaEventMetadata");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new ShareholderExperienceIntro(qaEventMetadata, questionId, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareholderExperienceIntro)) {
                return false;
            }
            ShareholderExperienceIntro shareholderExperienceIntro = (ShareholderExperienceIntro) other;
            return Intrinsics.areEqual(this.qaEventMetadata, shareholderExperienceIntro.qaEventMetadata) && Intrinsics.areEqual(this.questionId, shareholderExperienceIntro.questionId) && this.entryPoint == shareholderExperienceIntro.entryPoint;
        }

        public int hashCode() {
            int iHashCode = this.qaEventMetadata.hashCode() * 31;
            UUID uuid = this.questionId;
            return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "ShareholderExperienceIntro(qaEventMetadata=" + this.qaEventMetadata + ", questionId=" + this.questionId + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.qaEventMetadata, flags);
            dest.writeSerializable(this.questionId);
            dest.writeString(this.entryPoint.name());
        }

        public ShareholderExperienceIntro(QaEventMetadata qaEventMetadata, UUID uuid, ShareholderQAContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(qaEventMetadata, "qaEventMetadata");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.qaEventMetadata = qaEventMetadata;
            this.questionId = uuid;
            this.entryPoint = entryPoint;
        }

        public final QaEventMetadata getQaEventMetadata() {
            return this.qaEventMetadata;
        }

        public final UUID getQuestionId() {
            return this.questionId;
        }

        public /* synthetic */ ShareholderExperienceIntro(QaEventMetadata qaEventMetadata, UUID uuid, ShareholderQAContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(qaEventMetadata, uuid, (i & 4) != 0 ? ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
        }

        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderQuestionSubmitted;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "shareCopy", "", "<init>", "(Ljava/lang/String;)V", "getShareCopy", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderQuestionSubmitted implements LegacyFragmentKey {
        public static final Parcelable.Creator<ShareholderQuestionSubmitted> CREATOR = new Creator();
        private final String shareCopy;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ShareholderQuestionSubmitted> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderQuestionSubmitted createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareholderQuestionSubmitted(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShareholderQuestionSubmitted[] newArray(int i) {
                return new ShareholderQuestionSubmitted[i];
            }
        }

        public static /* synthetic */ ShareholderQuestionSubmitted copy$default(ShareholderQuestionSubmitted shareholderQuestionSubmitted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareholderQuestionSubmitted.shareCopy;
            }
            return shareholderQuestionSubmitted.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getShareCopy() {
            return this.shareCopy;
        }

        public final ShareholderQuestionSubmitted copy(String shareCopy) {
            return new ShareholderQuestionSubmitted(shareCopy);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareholderQuestionSubmitted) && Intrinsics.areEqual(this.shareCopy, ((ShareholderQuestionSubmitted) other).shareCopy);
        }

        public int hashCode() {
            String str = this.shareCopy;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ShareholderQuestionSubmitted(shareCopy=" + this.shareCopy + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.shareCopy);
        }

        public ShareholderQuestionSubmitted(String str) {
            this.shareCopy = str;
        }

        public final String getShareCopy() {
            return this.shareCopy;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SnacksSubscribe;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SnacksSubscribe implements LegacyFragmentKey {
        public static final SnacksSubscribe INSTANCE = new SnacksSubscribe();
        public static final Parcelable.Creator<SnacksSubscribe> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SnacksSubscribe> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SnacksSubscribe createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SnacksSubscribe.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SnacksSubscribe[] newArray(int i) {
                return new SnacksSubscribe[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SnacksSubscribe() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DeviceSecurityFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DeviceSecurityFragment implements LegacyFragmentKey {
        public static final DeviceSecurityFragment INSTANCE = new DeviceSecurityFragment();
        public static final Parcelable.Creator<DeviceSecurityFragment> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DeviceSecurityFragment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceSecurityFragment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeviceSecurityFragment.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceSecurityFragment[] newArray(int i) {
                return new DeviceSecurityFragment[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DeviceSecurityFragment() {
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SupportCallStatus;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "issueId", "Ljava/util/UUID;", "clearTask", "", "showPushPrompt", "<init>", "(Ljava/util/UUID;ZZ)V", "getIssueId", "()Ljava/util/UUID;", "getClearTask", "()Z", "getShowPushPrompt", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SupportCallStatus implements LegacyFragmentKey {
        public static final Parcelable.Creator<SupportCallStatus> CREATOR = new Creator();
        private final boolean clearTask;
        private final UUID issueId;
        private final boolean showPushPrompt;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SupportCallStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SupportCallStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SupportCallStatus((UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SupportCallStatus[] newArray(int i) {
                return new SupportCallStatus[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.issueId);
            dest.writeInt(this.clearTask ? 1 : 0);
            dest.writeInt(this.showPushPrompt ? 1 : 0);
        }

        public SupportCallStatus(UUID issueId, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(issueId, "issueId");
            this.issueId = issueId;
            this.clearTask = z;
            this.showPushPrompt = z2;
        }

        public /* synthetic */ SupportCallStatus(UUID uuid, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, z, (i & 4) != 0 ? false : z2);
        }

        public final UUID getIssueId() {
            return this.issueId;
        }

        public final boolean getClearTask() {
            return this.clearTask;
        }

        public final boolean getShowPushPrompt() {
            return this.showPushPrompt;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyComplete;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyComplete;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyComplete implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyComplete> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyComplete> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyComplete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyComplete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyComplete((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyComplete.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyComplete[] newArray(int i) {
                return new SurveyComplete[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyComplete(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyComplete> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyComplete> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyCompleteToast;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyCompleteToast;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyCompleteToast implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyCompleteToast> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyCompleteToast> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyCompleteToast> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyCompleteToast createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyCompleteToast((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyCompleteToast.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyCompleteToast[] newArray(int i) {
                return new SurveyCompleteToast[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyCompleteToast(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyCompleteToast> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyCompleteToast> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyContactRedirect;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyContactRedirect;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyContactRedirect implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyContactRedirect> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyContactRedirect> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyContactRedirect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyContactRedirect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyContactRedirect((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyContactRedirect.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyContactRedirect[] newArray(int i) {
                return new SurveyContactRedirect[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyContactRedirect(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyContactRedirect> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyContactRedirect> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyFreeFormQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyFreeFormQuestion;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyFreeFormQuestion implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyFreeFormQuestion> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyFreeFormQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyFreeFormQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyFreeFormQuestion((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyFreeFormQuestion.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyFreeFormQuestion[] newArray(int i) {
                return new SurveyFreeFormQuestion[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyFreeFormQuestion(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyFreeFormQuestion> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyMultipleChoiceQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyMultipleChoiceQuestion;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyMultipleChoiceQuestion implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyMultipleChoiceQuestion> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyMultipleChoiceQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyMultipleChoiceQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyMultipleChoiceQuestion((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyMultipleChoiceQuestion.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyMultipleChoiceQuestion[] newArray(int i) {
                return new SurveyMultipleChoiceQuestion[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyMultipleChoiceQuestion(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyMultipleChoiceQuestion> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyRatingQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyRatingQuestion;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyRatingQuestion implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyRatingQuestion> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyRatingQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyRatingQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyRatingQuestion((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyRatingQuestion.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyRatingQuestion[] newArray(int i) {
                return new SurveyRatingQuestion[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyRatingQuestion(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyRatingQuestion> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyYesNoQuestion;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SurveyYesNoQuestion;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SurveyYesNoQuestion implements LegacyFragmentKey {
        public static final Parcelable.Creator<SurveyYesNoQuestion> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SurveyYesNoQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyYesNoQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SurveyYesNoQuestion((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(SurveyYesNoQuestion.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SurveyYesNoQuestion[] newArray(int i) {
                return new SurveyYesNoQuestion[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public SurveyYesNoQuestion(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.SurveyYesNoQuestion> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderTransferFunds;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$TransferFundsPage;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PathfinderTransferFunds implements LegacyFragmentKey {
        public static final Parcelable.Creator<PathfinderTransferFunds> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.TransferFundsPage> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PathfinderTransferFunds> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderTransferFunds createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PathfinderTransferFunds((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(PathfinderTransferFunds.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PathfinderTransferFunds[] newArray(int i) {
                return new PathfinderTransferFunds[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public PathfinderTransferFunds(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.TransferFundsPage> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.TransferFundsPage> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationInitiate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$UarContactSelfieVerificationInitiate;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UarContactSelfieVerificationInitiate implements LegacyFragmentKey {
        public static final Parcelable.Creator<UarContactSelfieVerificationInitiate> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationInitiate> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UarContactSelfieVerificationInitiate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarContactSelfieVerificationInitiate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UarContactSelfieVerificationInitiate((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(UarContactSelfieVerificationInitiate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarContactSelfieVerificationInitiate[] newArray(int i) {
                return new UarContactSelfieVerificationInitiate[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public UarContactSelfieVerificationInitiate(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationInitiate> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationInitiate> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationWait;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$UarContactSelfieVerificationWait;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UarContactSelfieVerificationWait implements LegacyFragmentKey {
        public static final Parcelable.Creator<UarContactSelfieVerificationWait> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationWait> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UarContactSelfieVerificationWait> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarContactSelfieVerificationWait createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UarContactSelfieVerificationWait((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(UarContactSelfieVerificationWait.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarContactSelfieVerificationWait[] newArray(int i) {
                return new UarContactSelfieVerificationWait[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public UarContactSelfieVerificationWait(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationWait> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.UarContactSelfieVerificationWait> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateInput;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$UarEmailUpdateInput;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UarEmailUpdateInput implements LegacyFragmentKey {
        public static final Parcelable.Creator<UarEmailUpdateInput> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.UarEmailUpdateInput> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UarEmailUpdateInput> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarEmailUpdateInput createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UarEmailUpdateInput((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(UarEmailUpdateInput.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarEmailUpdateInput[] newArray(int i) {
                return new UarEmailUpdateInput[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public UarEmailUpdateInput(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.UarEmailUpdateInput> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.UarEmailUpdateInput> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateVerification;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$UarEmailUpdateVerification;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UarEmailUpdateVerification implements LegacyFragmentKey {
        public static final Parcelable.Creator<UarEmailUpdateVerification> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.UarEmailUpdateVerification> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UarEmailUpdateVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarEmailUpdateVerification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UarEmailUpdateVerification((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(UarEmailUpdateVerification.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarEmailUpdateVerification[] newArray(int i) {
                return new UarEmailUpdateVerification[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public UarEmailUpdateVerification(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.UarEmailUpdateVerification> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.UarEmailUpdateVerification> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarVerificationSuccess;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$UarVerificationSuccess;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UarVerificationSuccess implements LegacyFragmentKey {
        public static final Parcelable.Creator<UarVerificationSuccess> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.UarVerificationSuccess> userViewState;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<UarVerificationSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarVerificationSuccess createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UarVerificationSuccess((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(UarVerificationSuccess.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UarVerificationSuccess[] newArray(int i) {
                return new UarVerificationSuccess[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        public UarVerificationSuccess(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.UarVerificationSuccess> userViewState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final UserViewState.Page<UserViewStatePageContext.UarVerificationSuccess> getUserViewState() {
            return this.userViewState;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "showSsn", "", "<init>", "(Z)V", "getShowSsn", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerifyTaxInfo implements LegacyFragmentKey {
        public static final Parcelable.Creator<VerifyTaxInfo> CREATOR = new Creator();
        private final boolean showSsn;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<VerifyTaxInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyTaxInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyTaxInfo(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyTaxInfo[] newArray(int i) {
                return new VerifyTaxInfo[i];
            }
        }

        public VerifyTaxInfo() {
            this(false, 1, null);
        }

        public static /* synthetic */ VerifyTaxInfo copy$default(VerifyTaxInfo verifyTaxInfo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = verifyTaxInfo.showSsn;
            }
            return verifyTaxInfo.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowSsn() {
            return this.showSsn;
        }

        public final VerifyTaxInfo copy(boolean showSsn) {
            return new VerifyTaxInfo(showSsn);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyTaxInfo) && this.showSsn == ((VerifyTaxInfo) other).showSsn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showSsn);
        }

        public String toString() {
            return "VerifyTaxInfo(showSsn=" + this.showSsn + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showSsn ? 1 : 0);
        }

        public VerifyTaxInfo(boolean z) {
            this.showSsn = z;
        }

        public /* synthetic */ VerifyTaxInfo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean getShowSsn() {
            return this.showSsn;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxCenter;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxCenter implements LegacyFragmentKey, TabFragmentKey {
        public static final TaxCenter INSTANCE = new TaxCenter();
        public static final Parcelable.Creator<TaxCenter> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TaxCenter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxCenter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxCenter.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxCenter[] newArray(int i) {
                return new TaxCenter[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TaxCenter() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxTimelineInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxTimelineInfo implements LegacyFragmentKey, TabFragmentKey {
        public static final TaxTimelineInfo INSTANCE = new TaxTimelineInfo();
        public static final Parcelable.Creator<TaxTimelineInfo> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TaxTimelineInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxTimelineInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxTimelineInfo.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxTimelineInfo[] newArray(int i) {
                return new TaxTimelineInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TaxTimelineInfo() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TrustedContactDetail implements LegacyFragmentKey, TabFragmentKey {
        public static final TrustedContactDetail INSTANCE = new TrustedContactDetail();
        public static final Parcelable.Creator<TrustedContactDetail> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TrustedContactDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrustedContactDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrustedContactDetail.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrustedContactDetail[] newArray(int i) {
                return new TrustedContactDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TrustedContactDetail() {
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactUpdate;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "trustedContact", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "<init>", "(Lcom/robinhood/models/api/identi/ApiTrustedContact;)V", "getTrustedContact", "()Lcom/robinhood/models/api/identi/ApiTrustedContact;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TrustedContactUpdate implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<TrustedContactUpdate> CREATOR = new Creator();
        private final ApiTrustedContact trustedContact;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<TrustedContactUpdate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrustedContactUpdate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrustedContactUpdate((ApiTrustedContact) parcel.readParcelable(TrustedContactUpdate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrustedContactUpdate[] newArray(int i) {
                return new TrustedContactUpdate[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TrustedContactUpdate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.trustedContact, flags);
        }

        public TrustedContactUpdate(ApiTrustedContact apiTrustedContact) {
            this.trustedContact = apiTrustedContact;
        }

        public /* synthetic */ TrustedContactUpdate(ApiTrustedContact apiTrustedContact, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiTrustedContact);
        }

        public final ApiTrustedContact getTrustedContact() {
            return this.trustedContact;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ViewTaxDocument;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewTaxDocument implements LegacyFragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<ViewTaxDocument> CREATOR = new Creator();
        private final String id;

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ViewTaxDocument> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ViewTaxDocument createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewTaxDocument(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ViewTaxDocument[] newArray(int i) {
                return new ViewTaxDocument[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
        }

        public ViewTaxDocument(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return FragmentTab.ACCOUNT;
        }
    }

    /* compiled from: LegacyFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$WithdrawableAmountDetail;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WithdrawableAmountDetail implements LegacyFragmentKey {
        public static final WithdrawableAmountDetail INSTANCE = new WithdrawableAmountDetail();
        public static final Parcelable.Creator<WithdrawableAmountDetail> CREATOR = new Creator();

        /* compiled from: LegacyFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<WithdrawableAmountDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawableAmountDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithdrawableAmountDetail.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawableAmountDetail[] newArray(int i) {
                return new WithdrawableAmountDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private WithdrawableAmountDetail() {
        }
    }
}
