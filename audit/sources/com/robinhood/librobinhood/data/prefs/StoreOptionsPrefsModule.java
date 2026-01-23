package com.robinhood.librobinhood.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainLandingPage;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringSetPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreOptionsPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010 \u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010#\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0%2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020*0%2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010+\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010,\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010-\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010.\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010/\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u001a\u00100\u001a\u0002012\b\b\u0001\u0010\u000b\u001a\u00020\u00072\u0006\u00102\u001a\u000203H\u0007J\u0012\u00104\u001a\u0002052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u00106\u001a\u0002072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u00108\u001a\u0002072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u00109\u001a\u00020:2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010;\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010<\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006="}, m3636d2 = {"Lcom/robinhood/librobinhood/data/prefs/StoreOptionsPrefsModule;", "", "<init>", "()V", "provideHasShownOptionAlertOnboardingPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideHasShownReplaceConfirmationDialogPref", "provideAccountNumberPreference", "Lcom/robinhood/prefs/StringPreference;", "preferences", "provideChainOrderSidePref", "provideChainContractTypePref", "provideOptionOrderEducationShowStopMarketPref", "provideOptionOrderEducationShowMarketPref", "provideOptionOrderMarketGreenDotPref", "provideOptionOrderMarketNewTagPref", "provideOptionOrderMarketTooltipPref", "provideOptionChainMultipleUnderlyingsTooltipPref", "provideOptionChainSettleOnOpenTooltipPref", "provideOptionChainSwitchFocusedToSbsTooltipDismissedPref", "provideOptionChainSettingsSwitchToSbsTooltipShownPref", "provideOptionsSbsEduFooterDismissedPref", "provideOptionSbsLottieNuxAnimationSeenPref", "provideOptionChainSimulatedReturnSwitchChartTooltipShownPref", "provideOptionPreTradeSimulatedReturnChartShownPref", "provideOptionChainDisplayModePref", "provideHasShownSideBySideChainSpreadTooltipPref", "provideHasShownSwitchBackToClassicChainTooltipPref", "provideOptionSideBySideChainShownPref", "provideOptionSideBySideChainBottomSheetShownPref", "provideOptionChainSettingsShownPref", "provideOptionChainSettingsSbsBidAskPriceLabelShownPref", "provideOptionChainSettingsSbsBidAskPriceLabelNuxShownPref", "provideOptionChainSbsNuxRevampSettingsShownPref", "provideOptionChainLandingPagePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainLandingPage;", "provideOptionChainSettingsPnlChartTypePref", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "provideOptionChainSettingsSideBySideBidAskPriceLabelTypePref", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "provideOptionChainSimulatedReturnLongPressBannerSeenPref", "provideOptionPreTradeStatNuxDotShownPref", "provideOptionsDetailPageIndexCurbHoursTooltipPref", "provideIndexDetailPageCurbHoursTooltipPref", "provideCuratedRhListIndexOptionsCurbHoursTooltipPref", "provideOptionOrderTradingSessionPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideOptionTradingSessionPickerExtendedHoursNewTagPref", "Lcom/robinhood/prefs/StringSetPreference;", "provideOptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref", "Lcom/robinhood/prefs/LongPreference;", "provideOptionLevel3EntryPointSdpCardLastSeenTimePref", "provideOptionLevel3EntryPointSdpCardImpressionCountPref", "Lcom/robinhood/prefs/IntPreference;", "provideIndexOptionsListExtendedHoursBadgeSeenPref", "provideOptionsDetailPageShowAllHoursChartPref", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class StoreOptionsPrefsModule {
    public static final StoreOptionsPrefsModule INSTANCE = new StoreOptionsPrefsModule();

    private StoreOptionsPrefsModule() {
    }

    @HasShownOptionAlertOnboardingPref
    public final BooleanPreference provideHasShownOptionAlertOnboardingPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownOptionAlertOnboarding", false, null, 8, null);
    }

    @HasShownReplaceConfirmationDialogPref
    public final BooleanPreference provideHasShownReplaceConfirmationDialogPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownReplaceConfirmationDialogPref", false, null, 8, null);
    }

    @OptionsAccountNumberPref
    public final StringPreference provideAccountNumberPreference(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "optionsAccountSwitcherViewSharedPrefKey", null, null, 12, null);
    }

    @ChainOrderSidePref
    public final StringPreference provideChainOrderSidePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "chainOrderSidePref", OrderSide.BUY.getServerValue(), null, 8, null);
    }

    @ChainContractTypePref
    public final StringPreference provideChainContractTypePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "chainContractTypePref", OptionContractType.CALL.getServerValue(), null, 8, null);
    }

    @OptionOrderEducationShowStopMarketPref
    public final BooleanPreference provideOptionOrderEducationShowStopMarketPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionOrderEducationShowStopMarketPref", true, null, 8, null);
    }

    @OptionOrderEducationShowMarketPref
    public final BooleanPreference provideOptionOrderEducationShowMarketPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionOrderEducationShowMarketPref", true, null, 8, null);
    }

    @OptionOrderMarketGreenDotPref
    public final StringPreference provideOptionOrderMarketGreenDotPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "optionOrderMarketGreenDotPref", null, null, 12, null);
    }

    @OptionOrderMarketNewTagPref
    public final StringPreference provideOptionOrderMarketNewTagPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "optionOrderMarketNewTagPref", null, null, 12, null);
    }

    @OptionOrderMarketTooltipPref
    public final BooleanPreference provideOptionOrderMarketTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionOrderMarketTooltipPref", true, null, 8, null);
    }

    @OptionChainMultipleUnderlyingsTooltipPref
    public final BooleanPreference provideOptionChainMultipleUnderlyingsTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionChainMultipleUnderlyingsTooltipPref", true, null, 8, null);
    }

    @OptionChainSettleOnOpenTooltipPref
    public final BooleanPreference provideOptionChainSettleOnOpenTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionChainSettleOnOpenTooltipPref", true, null, 8, null);
    }

    @OptionChainSwitchFocusedToSbsTooltipDismissedPref
    public final BooleanPreference provideOptionChainSwitchFocusedToSbsTooltipDismissedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionChainSwitchFocusedToSbsTooltipDismissedPref", false, null, 8, null);
    }

    @OptionChainSettingsSwitchToSbsTooltipShownPref
    public final BooleanPreference provideOptionChainSettingsSwitchToSbsTooltipShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionChainSettingsSwitchToSbsTooltipShownPref", false, null, 8, null);
    }

    @OptionSbsEduFooterDismissedPref
    public final BooleanPreference provideOptionsSbsEduFooterDismissedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionsSbsEduFooterDismissedPref", false, null, 8, null);
    }

    @OptionSbsLottieNuxAnimation
    public final BooleanPreference provideOptionSbsLottieNuxAnimationSeenPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionSbsLottieNuxAnimationSeenPref", false, null, 8, null);
    }

    @OptionChainSimulatedReturnSwitchChartTooltipShownPref
    public final BooleanPreference provideOptionChainSimulatedReturnSwitchChartTooltipShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionChainSimulatedReturnSwitchChartTooltipShownPref", false, null, 8, null);
    }

    @OptionPreTradeSimulatedReturnChartShownPref
    public final BooleanPreference provideOptionPreTradeSimulatedReturnChartShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionPreTradeSimulatedReturnChartShownPref", false, null, 8, null);
    }

    @OptionChainDisplayModePref
    public final StringPreference provideOptionChainDisplayModePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "optionChainDisplayModePref", OptionChainDisplayMode.DEFAULT.getMode(), null, 8, null);
    }

    @HasShownSideBySideChainSpreadTooltipPref
    public final BooleanPreference provideHasShownSideBySideChainSpreadTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasShownSideBySideChainSpreadTooltipPref", false, null, 8, null);
    }

    @HasShownSwitchBackToClassicChainTooltipPref
    public final BooleanPreference provideHasShownSwitchBackToClassicChainTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasShownSwitchBackToClassicChainTooltipPref", false, null, 8, null);
    }

    @OptionSideBySideChainShownPref
    public final BooleanPreference provideOptionSideBySideChainShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionSideBySideChainShownPref", false, null, 8, null);
    }

    @OptionSideBySideChainBottomSheetShownPref
    public final BooleanPreference provideOptionSideBySideChainBottomSheetShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optionSideBySideChainBottomSheetShownPref", false, null, 8, null);
    }

    @OptionChainSettingsShownPref
    public final BooleanPreference provideOptionChainSettingsShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionChainSettingsShownPref", false, null, 8, null);
    }

    @OptionChainSettingsSbsBidAskPriceLabelShownPref
    public final BooleanPreference provideOptionChainSettingsSbsBidAskPriceLabelShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionChainSettingsSbsBidAskPriceLabelShownPref", false, null, 8, null);
    }

    @OptionChainSettingsSbsBidAskPriceLabelNuxShownPref
    public final BooleanPreference provideOptionChainSettingsSbsBidAskPriceLabelNuxShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionChainSettingsSbsBidAskPriceLabelNuxShownPref", false, null, 8, null);
    }

    @OptionChainSbsNuxRevampSettingsShownPref
    public final BooleanPreference provideOptionChainSbsNuxRevampSettingsShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionChainSbsNuxRevampSettingsShownPref", false, null, 8, null);
    }

    @OptionChainLandingPagePref
    public final EnumPreference<OptionChainLandingPage> provideOptionChainLandingPagePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(OptionChainLandingPage.class, preferences, "OptionChainLandingPagePref", OptionChainLandingPage.UNSET, null, 16, null);
    }

    @OptionChainSettingsPnlChartTypePref
    public final EnumPreference<OptionChainSettingsPnlChartType> provideOptionChainSettingsPnlChartTypePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(OptionChainSettingsPnlChartType.class, preferences, "optionChainSettingsPnlChartTypePref", OptionChainSettingsPnlChartType.BY_PRICE, null, 16, null);
    }

    @OptionChainSettingsSideBySideBidAskPriceLabelTypePref
    public final EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> provideOptionChainSettingsSideBySideBidAskPriceLabelTypePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(OptionChainSettingsSideBySideBidAskPriceLabelType.class, preferences, "optionChainSettingsSideBySideBidAskPriceLabelTypePref", OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK, null, 16, null);
    }

    @OptionChainSimulatedReturnLongPressBannerSeenPref
    public final BooleanPreference provideOptionChainSimulatedReturnLongPressBannerSeenPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionChainSimulatedReturnLongPressBannerSeenPref", false, null, 8, null);
    }

    @OptionPreTradeStatNuxDotShownPref
    public final BooleanPreference provideOptionPreTradeStatNuxDotShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionPreTradeStatNuxDotShownPref", false, null, 8, null);
    }

    @OptionsDetailPageIndexCurbHoursTooltipPref
    public final BooleanPreference provideOptionsDetailPageIndexCurbHoursTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionsDetailPageIndexCurbHoursTooltipPref", false, null, 8, null);
    }

    @IndexDetailPageCurbHoursTooltipPref
    public final BooleanPreference provideIndexDetailPageCurbHoursTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "IndexDetailPageCurbHoursTooltipPref", false, null, 8, null);
    }

    @CuratedRhListIndexOptionsCurbHoursTooltipPref
    public final BooleanPreference provideCuratedRhListIndexOptionsCurbHoursTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "CuratedRhListIndexOptionsCurbHoursTooltipPref", false, null, 8, null);
    }

    @OptionOrderTradingSessionPref
    public final StringToStringMapPreference provideOptionOrderTradingSessionPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToStringMapPreference(preferences, "optionOrderTradingSessionPref", null, moshi, 4, null);
    }

    @OptionTradingSessionPickerExtendedHoursNewTagPref
    public final StringSetPreference provideOptionTradingSessionPickerExtendedHoursNewTagPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringSetPreference(preferences, "OptionTradingSessionPickerExtendedHoursNewTagPref", null, 4, null);
    }

    @OptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref
    /* renamed from: provideOptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref */
    public final LongPreference m2601x43540c56(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "OptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref", 0L, 4, null);
    }

    @OptionLevel3EntryPointSdpCardLastSeenTimePref
    public final LongPreference provideOptionLevel3EntryPointSdpCardLastSeenTimePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "OptionLevel3EntryPointSdpCardLastSeenTimePref", 0L, 4, null);
    }

    @OptionLevel3EntryPointSdpCardImpressionCountPref
    public final IntPreference provideOptionLevel3EntryPointSdpCardImpressionCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "OptionLevel3EntryPointSdpCardImpressionCountPref", 0, 4, null);
    }

    @IndexOptionsListExtendedHoursBadgeSeenPref
    public final BooleanPreference provideIndexOptionsListExtendedHoursBadgeSeenPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "IndexOptionsListExtendedHoursBadgeSeenPref", false, null, 8, null);
    }

    @OptionsDetailPageShowAllHoursChartPref
    public final BooleanPreference provideOptionsDetailPageShowAllHoursChartPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "OptionsDetailPageShowAllHoursChartPref", true, null, 8, null);
    }
}
