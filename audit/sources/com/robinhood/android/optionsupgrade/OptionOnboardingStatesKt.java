package com.robinhood.android.optionsupgrade;

import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding4;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenError;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.OnboardingErrorResponseDto;
import options_product.service.OnboardingProgressDto;
import options_product.service.OnboardingScreenResponseDto;
import options_product.service.UpsellAlertResponseMetadataDto;
import options_product.service.UpsellAllSetResponseMetadataDto;
import options_product.service.UpsellTradeOnExpirationResponseMetadataDto;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&\u001a\n\u0010'\u001a\u00020(*\u00020)\u001a\n\u0010*\u001a\u00020+*\u00020,\u001a\u000e\u0010-\u001a\u00020,*\u00060\u0015j\u0002`.\"\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102*\n\u0010\u0000\"\u00020\u00012\u00020\u0001*\n\u0010\u0002\"\u00020\u00032\u00020\u0003*\n\u0010\u0004\"\u00020\u00052\u00020\u0005*\n\u0010\u0006\"\u00020\u00072\u00020\u0007*\n\u0010\b\"\u00020\t2\u00020\t*\n\u0010\n\"\u00020\u000b2\u00020\u000b*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015*\n\u0010\u0016\"\u00020\u00172\u00020\u0017*\n\u0010\u0018\"\u00020\u00192\u00020\u0019*\n\u0010\u001a\"\u00020\u001b2\u00020\u001b*\n\u0010\u001c\"\u00020\u001d2\u00020\u001d¨\u00063"}, m3636d2 = {"OptionExperienceLevel", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "UpsellAlertAction", "Loptions_product/service/UpsellAlertRequestMetadataDto$ActionDto;", "UpsellTradeOnExpirationAction", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto$ActionDto;", "SplashL0AccountTypeInCopy", "Loptions_product/service/SplashL0ResponseMetadataDto$AccountTypeInCopyDto;", "SplashL2AccountTypeInCopy", "Loptions_product/service/SplashL2ResponseMetadataDto$AccountTypeInCopyDto;", "ApprovedTradesAccountTypeInCopy", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "ApprovedTradesOptionLevel", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "SuccessUpgradeFlow", "Loptions_product/service/SuccessResponseMetadataDto$UpgradeFlowDto;", "SuccessAccountTypeInCopy", "Loptions_product/service/SuccessResponseMetadataDto$AccountTypeInCopyDto;", "FailureType", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "UpgradeProgress", "Loptions_product/service/OnboardingScreenResponseDto$UpgradeProgressDto;", "UpsellAlertStyle", "Loptions_product/service/UpsellAlertResponseMetadataDto$StyleDto;", "UpsellTradeOnExpirationStyle", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "UpsellAllSetStyle", "Loptions_product/service/UpsellAllSetResponseMetadataDto$StyleDto;", "JAPendingApplicationUpgradeTypeInCopy", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "toScreenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Loptions_product/service/OnboardingScreenResponseDto;", "screenId", "Ljava/util/UUID;", "isPostEnablementMember", "", "source", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "toScreenError", "Lcom/robinhood/android/optionsupgrade/ScreenError;", "Loptions_product/service/OnboardingErrorResponseDto;", "toResult", "Lcom/robinhood/android/options/contracts/OptionOnboardingResultContract$Result;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "toOnboardingProgress", "Lcom/robinhood/android/optionsupgrade/UpgradeProgress;", "initialScreenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "getInitialScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingStatesKt {
    private static final ScreenArgs.Start initialScreenArgs;

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[UpsellAlertResponseMetadataDto.StyleDto.values().length];
            try {
                iArr[UpsellAlertResponseMetadataDto.StyleDto.STYLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpsellAlertResponseMetadataDto.StyleDto.STYLE_INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpsellAlertResponseMetadataDto.StyleDto.STYLE_RETIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UpsellAllSetResponseMetadataDto.StyleDto.values().length];
            try {
                iArr2[UpsellAllSetResponseMetadataDto.StyleDto.STYLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UpsellAllSetResponseMetadataDto.StyleDto.STYLE_INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UpsellAllSetResponseMetadataDto.StyleDto.STYLE_RETIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UpsellTradeOnExpirationResponseMetadataDto.StyleDto.values().length];
            try {
                iArr3[UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_RETIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionOnboardingProgress.values().length];
            try {
                iArr4[OptionOnboardingProgress.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[OptionOnboardingProgress.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[OptionOnboardingProgress.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[OptionOnboardingProgress.ALREADY_HAS_OPTIONS_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OnboardingScreenResponseDto.UpgradeProgressDto.values().length];
            try {
                iArr5[OnboardingScreenResponseDto.UpgradeProgressDto.UPGRADE_PROGRESS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[OnboardingScreenResponseDto.UpgradeProgressDto.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[OnboardingScreenResponseDto.UpgradeProgressDto.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[OnboardingScreenResponseDto.UpgradeProgressDto.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[OnboardingScreenResponseDto.UpgradeProgressDto.ALREADY_HAS_OPTIONS_ACCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static /* synthetic */ ScreenArgs toScreenArgs$default(OnboardingScreenResponseDto onboardingScreenResponseDto, UUID uuid, boolean z, OptionOnboarding.OptionOnboardingSource optionOnboardingSource, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return toScreenArgs(onboardingScreenResponseDto, uuid, z, optionOnboardingSource);
    }

    public static final ScreenArgs toScreenArgs(OnboardingScreenResponseDto onboardingScreenResponseDto, UUID screenId, boolean z, OptionOnboarding.OptionOnboardingSource source) {
        OptionOnboardingStyles optionOnboardingStyles;
        OptionOnboardingStyles optionOnboardingStyles2;
        OptionOnboardingStyles optionOnboardingStyles3;
        Intrinsics.checkNotNullParameter(onboardingScreenResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(source, "source");
        boolean zIsFromSdp = source.isFromSdp();
        OnboardingScreenResponseDto.ResponseMetadataDto response_metadata = onboardingScreenResponseDto.getResponse_metadata();
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.ApprovedTrades) {
            OnboardingScreenResponseDto.ResponseMetadataDto.ApprovedTrades approvedTrades = (OnboardingScreenResponseDto.ResponseMetadataDto.ApprovedTrades) response_metadata;
            return new ScreenArgs.ApprovedTrades(approvedTrades.getValue().getAccount_number(), approvedTrades.getValue().getAccount_type_in_copy(), approvedTrades.getValue().getOption_level(), zIsFromSdp, onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.Disclosure) {
            OnboardingScreenResponseDto.ResponseMetadataDto.Disclosure disclosure = (OnboardingScreenResponseDto.ResponseMetadataDto.Disclosure) response_metadata;
            return new ScreenArgs.Disclosure(disclosure.getValue().getTitle(), disclosure.getValue().getType(), disclosure.getValue().getAgreement_context(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationL3Strategies) {
            return new ScreenArgs.EducationL3Strategies(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationSpread) {
            return new ScreenArgs.EducationSpread(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.End) {
            return new ScreenArgs.End(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId, ((OnboardingScreenResponseDto.ResponseMetadataDto.End) response_metadata).getValue().getPost_flow_deeplink());
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.Failure) {
            OnboardingScreenResponseDto.ResponseMetadataDto.Failure failure = (OnboardingScreenResponseDto.ResponseMetadataDto.Failure) response_metadata;
            return new ScreenArgs.Failure(failure.getValue().getFailure_type(), failure.getValue().getMessage_override(), failure.getValue().getPrimary_cta_deeplink_action(), failure.getValue().getPrimary_cta_message_override(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.InvestmentProfile) {
            OnboardingScreenResponseDto.ResponseMetadataDto.InvestmentProfile investmentProfile = (OnboardingScreenResponseDto.ResponseMetadataDto.InvestmentProfile) response_metadata;
            return new ScreenArgs.InvestmentProfile(investmentProfile.getValue().getAccount_number(), investmentProfile.getValue().getContext(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.QuestionFinancialRegulator) {
            return new ScreenArgs.QuestionFinancialRegulator(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.QuestionInvestmentAdvice) {
            return new ScreenArgs.QuestionInvestmentAdvice(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.QuestionOptionExperience) {
            return new ScreenArgs.QuestionOptionExperience(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.QuestionUnderstandSpread) {
            return new ScreenArgs.QuestionUnderstandSpread(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.ReadyL3Upgrade) {
            return new ScreenArgs.ReadyL3Upgrade(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.SplashL0) {
            OnboardingScreenResponseDto.ResponseMetadataDto.SplashL0 splashL0 = (OnboardingScreenResponseDto.ResponseMetadataDto.SplashL0) response_metadata;
            return new ScreenArgs.SplashL0(splashL0.getValue().getAccount_number(), splashL0.getValue().getAccount_type_in_copy(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.SplashL2) {
            OnboardingScreenResponseDto.ResponseMetadataDto.SplashL2 splashL2 = (OnboardingScreenResponseDto.ResponseMetadataDto.SplashL2) response_metadata;
            return new ScreenArgs.SplashL2(splashL2.getValue().getAccount_number(), splashL2.getValue().getAccount_type_in_copy(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.SplashRetirement) {
            return new ScreenArgs.SplashRetirement(((OnboardingScreenResponseDto.ResponseMetadataDto.SplashRetirement) response_metadata).getValue().getAccount_number(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.Start) {
            return new ScreenArgs.Start(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.Success) {
            OnboardingScreenResponseDto.ResponseMetadataDto.Success success = (OnboardingScreenResponseDto.ResponseMetadataDto.Success) response_metadata;
            return new ScreenArgs.Success(success.getValue().getAccount_number(), success.getValue().getAccount_type_in_copy(), success.getValue().getUpgrade_flow(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.Suitability) {
            OnboardingScreenResponseDto.ResponseMetadataDto.Suitability suitability = (OnboardingScreenResponseDto.ResponseMetadataDto.Suitability) response_metadata;
            return new ScreenArgs.Suitability(suitability.getValue().getContext(), suitability.getValue().getAccount_number(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.UpsellAlert) {
            int i = WhenMappings.$EnumSwitchMapping$0[((OnboardingScreenResponseDto.ResponseMetadataDto.UpsellAlert) response_metadata).getValue().getStyle().ordinal()];
            if (i == 1 || i == 2) {
                optionOnboardingStyles3 = OptionOnboardingStyles.INDIVIDUAL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                optionOnboardingStyles3 = OptionOnboardingStyles.RETIREMENT;
            }
            return new ScreenArgs.UpsellAlert(optionOnboardingStyles3, z, onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.UpsellAllSet) {
            OnboardingScreenResponseDto.ResponseMetadataDto.UpsellAllSet upsellAllSet = (OnboardingScreenResponseDto.ResponseMetadataDto.UpsellAllSet) response_metadata;
            int i2 = WhenMappings.$EnumSwitchMapping$1[upsellAllSet.getValue().getStyle().ordinal()];
            if (i2 == 1 || i2 == 2) {
                optionOnboardingStyles2 = OptionOnboardingStyles.INDIVIDUAL;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                optionOnboardingStyles2 = OptionOnboardingStyles.RETIREMENT;
            }
            return new ScreenArgs.UpsellAllSet(upsellAllSet.getValue().getAccount_number(), optionOnboardingStyles2, null, z, zIsFromSdp, onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId, 4, null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.UpsellTradeOnExpiration) {
            OnboardingScreenResponseDto.ResponseMetadataDto.UpsellTradeOnExpiration upsellTradeOnExpiration = (OnboardingScreenResponseDto.ResponseMetadataDto.UpsellTradeOnExpiration) response_metadata;
            int i3 = WhenMappings.$EnumSwitchMapping$2[upsellTradeOnExpiration.getValue().getStyle().ordinal()];
            if (i3 == 1 || i3 == 2) {
                optionOnboardingStyles = OptionOnboardingStyles.INDIVIDUAL;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                optionOnboardingStyles = OptionOnboardingStyles.RETIREMENT;
            }
            return new ScreenArgs.UpsellTradeOnExpiration(optionOnboardingStyles, upsellTradeOnExpiration.getValue().getAccount_number(), z, onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationHome) {
            return new ScreenArgs.UkSplashL0(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationStrategy) {
            String microgram_page_id = ((OnboardingScreenResponseDto.ResponseMetadataDto.EducationStrategy) response_metadata).getValue().getMicrogram_page_id();
            boolean zIs_checkpoint = onboardingScreenResponseDto.is_checkpoint();
            boolean should_live_in_backstack = onboardingScreenResponseDto.getShould_live_in_backstack();
            boolean should_clear_backstack = onboardingScreenResponseDto.getShould_clear_backstack();
            OptionOnboardingProgress onboardingProgress = toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress());
            OnboardingProgressDto onboarding_progress = onboardingScreenResponseDto.getOnboarding_progress();
            return new ScreenArgs.UkEducationBenefits(microgram_page_id, zIs_checkpoint, should_live_in_backstack, should_clear_backstack, onboardingProgress, screenId, onboarding_progress != null ? new ProgressBarData(onboarding_progress.getNumber_of_segments(), onboarding_progress.getCurrent_segment(), onboarding_progress.getSegment_progress()) : null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationRisks) {
            String microgram_page_id2 = ((OnboardingScreenResponseDto.ResponseMetadataDto.EducationRisks) response_metadata).getValue().getMicrogram_page_id();
            boolean zIs_checkpoint2 = onboardingScreenResponseDto.is_checkpoint();
            boolean should_live_in_backstack2 = onboardingScreenResponseDto.getShould_live_in_backstack();
            boolean should_clear_backstack2 = onboardingScreenResponseDto.getShould_clear_backstack();
            OptionOnboardingProgress onboardingProgress2 = toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress());
            OnboardingProgressDto onboarding_progress2 = onboardingScreenResponseDto.getOnboarding_progress();
            return new ScreenArgs.UkEducationRisks(microgram_page_id2, zIs_checkpoint2, should_live_in_backstack2, should_clear_backstack2, onboardingProgress2, screenId, onboarding_progress2 != null ? new ProgressBarData(onboarding_progress2.getNumber_of_segments(), onboarding_progress2.getCurrent_segment(), onboarding_progress2.getSegment_progress()) : null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.InvestorProfile) {
            return new ScreenArgs.UkInvestorProfile(((OnboardingScreenResponseDto.ResponseMetadataDto.InvestorProfile) response_metadata).getValue().getProduct_context(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.ReviewInvestorProfile) {
            String product_context = ((OnboardingScreenResponseDto.ResponseMetadataDto.ReviewInvestorProfile) response_metadata).getValue().getProduct_context();
            boolean zIs_checkpoint3 = onboardingScreenResponseDto.is_checkpoint();
            boolean should_live_in_backstack3 = onboardingScreenResponseDto.getShould_live_in_backstack();
            boolean should_clear_backstack3 = onboardingScreenResponseDto.getShould_clear_backstack();
            OptionOnboardingProgress onboardingProgress3 = toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress());
            OnboardingProgressDto onboarding_progress3 = onboardingScreenResponseDto.getOnboarding_progress();
            return new ScreenArgs.UkReviewInvestorProfile(product_context, zIs_checkpoint3, should_live_in_backstack3, should_clear_backstack3, onboardingProgress3, screenId, onboarding_progress3 != null ? new ProgressBarData(onboarding_progress3.getNumber_of_segments(), onboarding_progress3.getCurrent_segment(), onboarding_progress3.getSegment_progress()) : null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.ExperienceTestQuestionnaire) {
            return new ScreenArgs.UkExperienceTestQuestionnaire(((OnboardingScreenResponseDto.ResponseMetadataDto.ExperienceTestQuestionnaire) response_metadata).getValue().getProduct_context(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.KnowledgeTestQuestionnaire) {
            return new ScreenArgs.UkKnowledgeTestQuestionnaire(((OnboardingScreenResponseDto.ResponseMetadataDto.KnowledgeTestQuestionnaire) response_metadata).getValue().getProduct_context(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.EducationProfessionalTrader) {
            boolean zIs_checkpoint4 = onboardingScreenResponseDto.is_checkpoint();
            boolean should_live_in_backstack4 = onboardingScreenResponseDto.getShould_live_in_backstack();
            boolean should_clear_backstack4 = onboardingScreenResponseDto.getShould_clear_backstack();
            OptionOnboardingProgress onboardingProgress4 = toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress());
            OnboardingProgressDto onboarding_progress4 = onboardingScreenResponseDto.getOnboarding_progress();
            return new ScreenArgs.UkProfessionalTrader(zIs_checkpoint4, should_live_in_backstack4, should_clear_backstack4, onboardingProgress4, screenId, onboarding_progress4 != null ? new ProgressBarData(onboarding_progress4.getNumber_of_segments(), onboarding_progress4.getCurrent_segment(), onboarding_progress4.getSegment_progress()) : null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.UkL3EducationHome) {
            return new ScreenArgs.UkSplashL2(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.UkL3EducationSpreadBenefits) {
            String microgram_page_id3 = ((OnboardingScreenResponseDto.ResponseMetadataDto.UkL3EducationSpreadBenefits) response_metadata).getValue().getMicrogram_page_id();
            boolean zIs_checkpoint5 = onboardingScreenResponseDto.is_checkpoint();
            boolean should_live_in_backstack5 = onboardingScreenResponseDto.getShould_live_in_backstack();
            boolean should_clear_backstack5 = onboardingScreenResponseDto.getShould_clear_backstack();
            OptionOnboardingProgress onboardingProgress5 = toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress());
            OnboardingProgressDto onboarding_progress5 = onboardingScreenResponseDto.getOnboarding_progress();
            return new ScreenArgs.UkEducationBenefitsL2(microgram_page_id3, zIs_checkpoint5, should_live_in_backstack5, should_clear_backstack5, onboardingProgress5, screenId, onboarding_progress5 != null ? new ProgressBarData(onboarding_progress5.getNumber_of_segments(), onboarding_progress5.getCurrent_segment(), onboarding_progress5.getSegment_progress()) : null);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.RhsgHome) {
            return new ScreenArgs.RhsgSplash(((OnboardingScreenResponseDto.ResponseMetadataDto.RhsgHome) response_metadata).getValue().getShould_show_gst_disclosure(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.RhsgCompleteCarQuestionnaire) {
            return new ScreenArgs.RhsgCustomerAccountReviewQuestionnaire(((OnboardingScreenResponseDto.ResponseMetadataDto.RhsgCompleteCarQuestionnaire) response_metadata).getValue().getProduct_context(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.ProfessionalTrader) {
            return new ScreenArgs.RhsgProfessionalTrader(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.RhsgL2ApprovedTrades) {
            return new ScreenArgs.RhsgL2ApprovedTrades(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.RhsgL3ApprovedTrades) {
            return new ScreenArgs.RhsgL3ApprovedTrades(onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.JaPendingApplication) {
            return new ScreenArgs.JointAccountPendingApplication(((OnboardingScreenResponseDto.ResponseMetadataDto.JaPendingApplication) response_metadata).getValue().getUpgrade_type_in_copy(), source.isFromAcatsJointAccount(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        if (response_metadata instanceof OnboardingScreenResponseDto.ResponseMetadataDto.KnowledgeCheckNeeded) {
            OnboardingScreenResponseDto.ResponseMetadataDto.KnowledgeCheckNeeded knowledgeCheckNeeded = (OnboardingScreenResponseDto.ResponseMetadataDto.KnowledgeCheckNeeded) response_metadata;
            return new ScreenArgs.KnowledgeCheckNeeded(knowledgeCheckNeeded.getValue().getAppointment_enabled(), knowledgeCheckNeeded.getValue().getChat_enabled(), knowledgeCheckNeeded.getValue().getChat_hidden(), knowledgeCheckNeeded.getValue().getChat_start_time(), knowledgeCheckNeeded.getValue().getChat_end_time(), knowledgeCheckNeeded.getValue().is_half_day(), knowledgeCheckNeeded.getValue().is_weekend(), knowledgeCheckNeeded.getValue().is_holiday(), knowledgeCheckNeeded.getValue().getDisclosure_contentful_id(), onboardingScreenResponseDto.is_checkpoint(), onboardingScreenResponseDto.getShould_live_in_backstack(), onboardingScreenResponseDto.getShould_clear_backstack(), toOnboardingProgress(onboardingScreenResponseDto.getUpgrade_progress()), screenId);
        }
        throw new IllegalStateException(("Unknown screen response: " + onboardingScreenResponseDto).toString());
    }

    public static final ScreenError toScreenError(OnboardingErrorResponseDto onboardingErrorResponseDto) {
        Intrinsics.checkNotNullParameter(onboardingErrorResponseDto, "<this>");
        OnboardingErrorResponseDto.MetadataDto metadata = onboardingErrorResponseDto.getMetadata();
        if (metadata instanceof OnboardingErrorResponseDto.MetadataDto.Dialog) {
            return new ScreenError.Dialog(((OnboardingErrorResponseDto.MetadataDto.Dialog) metadata).getValue().getError_message());
        }
        if (metadata != null) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unknown screen error: " + onboardingErrorResponseDto).toString());
    }

    public static final OptionOnboarding4.Result toResult(OptionOnboardingProgress optionOnboardingProgress) {
        Intrinsics.checkNotNullParameter(optionOnboardingProgress, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[optionOnboardingProgress.ordinal()];
        if (i == 1) {
            return OptionOnboarding4.Result.Canceled.INSTANCE;
        }
        if (i == 2) {
            return OptionOnboarding4.Result.Success.INSTANCE;
        }
        if (i == 3) {
            return OptionOnboarding4.Result.Failure.INSTANCE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionOnboarding4.Result.Success.INSTANCE;
    }

    public static final OptionOnboardingProgress toOnboardingProgress(OnboardingScreenResponseDto.UpgradeProgressDto upgradeProgressDto) {
        Intrinsics.checkNotNullParameter(upgradeProgressDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[upgradeProgressDto.ordinal()];
        if (i == 1 || i == 2) {
            return OptionOnboardingProgress.IN_PROGRESS;
        }
        if (i == 3) {
            return OptionOnboardingProgress.SUCCESS;
        }
        if (i == 4) {
            return OptionOnboardingProgress.FAILURE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionOnboardingProgress.ALREADY_HAS_OPTIONS_ACCESS;
    }

    static {
        OptionOnboardingProgress optionOnboardingProgress = OptionOnboardingProgress.IN_PROGRESS;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        initialScreenArgs = new ScreenArgs.Start(true, false, false, optionOnboardingProgress, uuidRandomUUID);
    }

    public static final ScreenArgs.Start getInitialScreenArgs() {
        return initialScreenArgs;
    }
}
