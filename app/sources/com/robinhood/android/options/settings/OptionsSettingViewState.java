package com.robinhood.android.options.settings;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.options.settings.OptionsSettingContract3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.resource.StringResource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSettingContract.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÂ\u0003J\u0095\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\bHÆ\u0001J\u0013\u0010I\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001cR\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R#\u0010+\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\b\u0012\u0006\u0012\u0002\b\u00030.\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001cR\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingViewState;", "", "account", "Lcom/robinhood/models/db/Account;", "changeOptionLevelState", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/options/settings/ChangeOptionLevelState;", "hasMultipleAccounts", "", "inMarginRoutingExperiment", "loading", "tradingOnExpirationState", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "managedAccountError", "", "isMarginSupported", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "inSelloutImprovementExperiment", "isShortSellingExerciseEnabled", "shortSellingSettingEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/udf/UiEvent;ZZZLcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/android/lib/margin/db/models/MarginSettings;ZZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getChangeOptionLevelState", "()Lcom/robinhood/udf/UiEvent;", "getHasMultipleAccounts", "()Z", "getInMarginRoutingExperiment", "getLoading", "getTradingOnExpirationState", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getManagedAccountError", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getInSelloutImprovementExperiment", "tradeOnExpirationDisclaimer", "Lcom/robinhood/utils/resource/StringResource;", "getTradeOnExpirationDisclaimer", "()Lcom/robinhood/utils/resource/StringResource;", "accountDisplayNameToShow", "getAccountDisplayNameToShow", "instantCashSwitchToMarginInputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "getInstantCashSwitchToMarginInputParams", "()Ljava/util/Map;", "upgradeCashAccountFailureState", "Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState;", "getUpgradeCashAccountFailureState", "()Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState;", "isMarginSupportedInCurrentAccount", "isMarginSupportedInCurrentAccount$annotations", "()V", "shortSellingState", "Lcom/robinhood/android/options/settings/OptionSettingShortSellingState;", "getShortSellingState", "()Lcom/robinhood/android/options/settings/OptionSettingShortSellingState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSettingViewState {
    public static final int $stable = 8;
    private final Account account;
    private final StringResource accountDisplayNameToShow;
    private final UiEvent<ChangeOptionLevelState> changeOptionLevelState;
    private final boolean hasMultipleAccounts;
    private final boolean inMarginRoutingExperiment;
    private final boolean inSelloutImprovementExperiment;
    private final Map<String, JsonPrimitive<?>> instantCashSwitchToMarginInputParams;
    private final boolean isMarginSupported;
    private final boolean isMarginSupportedInCurrentAccount;
    private final boolean isShortSellingExerciseEnabled;
    private final boolean loading;
    private final UiEvent<Unit> managedAccountError;
    private final MarginSettings marginSettings;
    private final boolean shortSellingSettingEnabled;
    private final OptionSettingShortSellingState shortSellingState;
    private final StringResource tradeOnExpirationDisclaimer;
    private final OptionSettings.TradingOnExpirationState tradingOnExpirationState;

    public OptionsSettingViewState() {
        this(null, null, false, false, false, null, null, false, null, false, false, false, 4095, null);
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getShortSellingSettingEnabled() {
        return this.shortSellingSettingEnabled;
    }

    public static /* synthetic */ OptionsSettingViewState copy$default(OptionsSettingViewState optionsSettingViewState, Account account, UiEvent uiEvent, boolean z, boolean z2, boolean z3, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiEvent uiEvent2, boolean z4, MarginSettings marginSettings, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionsSettingViewState.account;
        }
        if ((i & 2) != 0) {
            uiEvent = optionsSettingViewState.changeOptionLevelState;
        }
        if ((i & 4) != 0) {
            z = optionsSettingViewState.hasMultipleAccounts;
        }
        if ((i & 8) != 0) {
            z2 = optionsSettingViewState.inMarginRoutingExperiment;
        }
        if ((i & 16) != 0) {
            z3 = optionsSettingViewState.loading;
        }
        if ((i & 32) != 0) {
            tradingOnExpirationState = optionsSettingViewState.tradingOnExpirationState;
        }
        if ((i & 64) != 0) {
            uiEvent2 = optionsSettingViewState.managedAccountError;
        }
        if ((i & 128) != 0) {
            z4 = optionsSettingViewState.isMarginSupported;
        }
        if ((i & 256) != 0) {
            marginSettings = optionsSettingViewState.marginSettings;
        }
        if ((i & 512) != 0) {
            z5 = optionsSettingViewState.inSelloutImprovementExperiment;
        }
        if ((i & 1024) != 0) {
            z6 = optionsSettingViewState.isShortSellingExerciseEnabled;
        }
        if ((i & 2048) != 0) {
            z7 = optionsSettingViewState.shortSellingSettingEnabled;
        }
        boolean z8 = z6;
        boolean z9 = z7;
        MarginSettings marginSettings2 = marginSettings;
        boolean z10 = z5;
        UiEvent uiEvent3 = uiEvent2;
        boolean z11 = z4;
        boolean z12 = z3;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = tradingOnExpirationState;
        return optionsSettingViewState.copy(account, uiEvent, z, z2, z12, tradingOnExpirationState2, uiEvent3, z11, marginSettings2, z10, z8, z9);
    }

    public static /* synthetic */ void isMarginSupportedInCurrentAccount$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    public final UiEvent<ChangeOptionLevelState> component2() {
        return this.changeOptionLevelState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInMarginRoutingExperiment() {
        return this.inMarginRoutingExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradingOnExpirationState() {
        return this.tradingOnExpirationState;
    }

    public final UiEvent<Unit> component7() {
        return this.managedAccountError;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    /* renamed from: component9, reason: from getter */
    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final OptionsSettingViewState copy(Account account, UiEvent<ChangeOptionLevelState> changeOptionLevelState, boolean hasMultipleAccounts, boolean inMarginRoutingExperiment, boolean loading, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiEvent<Unit> managedAccountError, boolean isMarginSupported, MarginSettings marginSettings, boolean inSelloutImprovementExperiment, boolean isShortSellingExerciseEnabled, boolean shortSellingSettingEnabled) {
        Intrinsics.checkNotNullParameter(tradingOnExpirationState, "tradingOnExpirationState");
        return new OptionsSettingViewState(account, changeOptionLevelState, hasMultipleAccounts, inMarginRoutingExperiment, loading, tradingOnExpirationState, managedAccountError, isMarginSupported, marginSettings, inSelloutImprovementExperiment, isShortSellingExerciseEnabled, shortSellingSettingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSettingViewState)) {
            return false;
        }
        OptionsSettingViewState optionsSettingViewState = (OptionsSettingViewState) other;
        return Intrinsics.areEqual(this.account, optionsSettingViewState.account) && Intrinsics.areEqual(this.changeOptionLevelState, optionsSettingViewState.changeOptionLevelState) && this.hasMultipleAccounts == optionsSettingViewState.hasMultipleAccounts && this.inMarginRoutingExperiment == optionsSettingViewState.inMarginRoutingExperiment && this.loading == optionsSettingViewState.loading && this.tradingOnExpirationState == optionsSettingViewState.tradingOnExpirationState && Intrinsics.areEqual(this.managedAccountError, optionsSettingViewState.managedAccountError) && this.isMarginSupported == optionsSettingViewState.isMarginSupported && Intrinsics.areEqual(this.marginSettings, optionsSettingViewState.marginSettings) && this.inSelloutImprovementExperiment == optionsSettingViewState.inSelloutImprovementExperiment && this.isShortSellingExerciseEnabled == optionsSettingViewState.isShortSellingExerciseEnabled && this.shortSellingSettingEnabled == optionsSettingViewState.shortSellingSettingEnabled;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        UiEvent<ChangeOptionLevelState> uiEvent = this.changeOptionLevelState;
        int iHashCode2 = (((((((((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31) + Boolean.hashCode(this.inMarginRoutingExperiment)) * 31) + Boolean.hashCode(this.loading)) * 31) + this.tradingOnExpirationState.hashCode()) * 31;
        UiEvent<Unit> uiEvent2 = this.managedAccountError;
        int iHashCode3 = (((iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.isMarginSupported)) * 31;
        MarginSettings marginSettings = this.marginSettings;
        return ((((((iHashCode3 + (marginSettings != null ? marginSettings.hashCode() : 0)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.isShortSellingExerciseEnabled)) * 31) + Boolean.hashCode(this.shortSellingSettingEnabled);
    }

    public String toString() {
        return "OptionsSettingViewState(account=" + this.account + ", changeOptionLevelState=" + this.changeOptionLevelState + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", inMarginRoutingExperiment=" + this.inMarginRoutingExperiment + ", loading=" + this.loading + ", tradingOnExpirationState=" + this.tradingOnExpirationState + ", managedAccountError=" + this.managedAccountError + ", isMarginSupported=" + this.isMarginSupported + ", marginSettings=" + this.marginSettings + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", isShortSellingExerciseEnabled=" + this.isShortSellingExerciseEnabled + ", shortSellingSettingEnabled=" + this.shortSellingSettingEnabled + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionsSettingViewState(Account account, UiEvent<ChangeOptionLevelState> uiEvent, boolean z, boolean z2, boolean z3, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiEvent<Unit> uiEvent2, boolean z4, MarginSettings marginSettings, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        StringResource stringResourceInvoke;
        Map<String, JsonPrimitive<?>> switchAccountSassyInputParams;
        boolean z9;
        int i;
        InstantCashConstants2 instantCashConstants2;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        Intrinsics.checkNotNullParameter(tradingOnExpirationState, "tradingOnExpirationState");
        this.account = account;
        this.changeOptionLevelState = uiEvent;
        this.hasMultipleAccounts = z;
        this.inMarginRoutingExperiment = z2;
        this.loading = z3;
        this.tradingOnExpirationState = tradingOnExpirationState;
        this.managedAccountError = uiEvent2;
        this.isMarginSupported = z4;
        this.marginSettings = marginSettings;
        this.inSelloutImprovementExperiment = z5;
        this.isShortSellingExerciseEnabled = z6;
        this.shortSellingSettingEnabled = z7;
        Boolean boolValueOf = account != null ? Boolean.valueOf(account.isMargin()) : null;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            String to24HourTime$default = DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null);
            String to24HourTime$default2 = DateStrings2.formatTo24HourTime$default(15, 45, null, 4, null);
            String to24HourTime$default3 = DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null);
            if (z5) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C23695R.string.f4764xe293e590, to24HourTime$default, to24HourTime$default2, to24HourTime$default3);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C23695R.string.options_setting_extended_trade_on_expiration_disclaimer, to24HourTime$default);
            }
            z8 = false;
        } else if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            String to24HourTime$default4 = DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null);
            String to24HourTime$default5 = DateStrings2.formatTo24HourTime$default(15, 45, null, 4, null);
            z8 = false;
            String to24HourTime$default6 = DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null);
            if (z5) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C23695R.string.f4763x9bdfe14c, to24HourTime$default4, to24HourTime$default5, to24HourTime$default6);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C23695R.string.f4762xf0bdc838, to24HourTime$default4);
            }
        } else {
            z8 = false;
            if (boolValueOf != null) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = null;
        }
        this.tradeOnExpirationDisclaimer = stringResourceInvoke;
        this.accountDisplayNameToShow = (!z || account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null) ? null : withAccount.getTitle();
        if (account == null || account.isMargin()) {
            switchAccountSassyInputParams = null;
        } else {
            if (z2) {
                instantCashConstants2 = InstantCashConstants2.SOURCE_OPTIONS_L3_UPGRADE_SETTINGS;
            } else {
                instantCashConstants2 = InstantCashConstants2.SOURCE_OPTIONS_L3_UPGRADE;
            }
            switchAccountSassyInputParams = InstantCashUtils.getSwitchAccountSassyInputParams(account, instantCashConstants2);
        }
        this.instantCashSwitchToMarginInputParams = switchAccountSassyInputParams;
        boolean z10 = (account != null && account.isMargin() && z4 && marginSettings != null && marginSettings.isMarginInvestingEnabled()) ? true : z8;
        this.isMarginSupportedInCurrentAccount = z10;
        if (z6) {
            if ((account != null ? account.getBrokerageAccountType() : null) != BrokerageAccountType.INDIVIDUAL) {
                if ((account != null ? account.getBrokerageAccountType() : null) == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                }
            }
            z9 = true;
        } else {
            z9 = z8;
        }
        boolean z11 = (z6 && z10) ? true : z8;
        boolean z12 = (z7 && z10) ? true : z8;
        if (z10) {
            i = C23695R.string.options_setting_short_selling_subtitle;
        } else {
            i = C23695R.string.options_setting_short_selling_subtitle_margin_disabled;
        }
        this.shortSellingState = new OptionSettingShortSellingState(z9, z11, z12, i);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final UiEvent<ChangeOptionLevelState> getChangeOptionLevelState() {
        return this.changeOptionLevelState;
    }

    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    public final boolean getInMarginRoutingExperiment() {
        return this.inMarginRoutingExperiment;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final OptionSettings.TradingOnExpirationState getTradingOnExpirationState() {
        return this.tradingOnExpirationState;
    }

    public /* synthetic */ OptionsSettingViewState(Account account, UiEvent uiEvent, boolean z, boolean z2, boolean z3, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiEvent uiEvent2, boolean z4, MarginSettings marginSettings, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? OptionSettings.TradingOnExpirationState.INELIGIBLE : tradingOnExpirationState, (i & 64) != 0 ? null : uiEvent2, (i & 128) != 0 ? false : z4, (i & 256) == 0 ? marginSettings : null, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? false : z7);
    }

    public final UiEvent<Unit> getManagedAccountError() {
        return this.managedAccountError;
    }

    public final boolean isMarginSupported() {
        return this.isMarginSupported;
    }

    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    public final boolean isShortSellingExerciseEnabled() {
        return this.isShortSellingExerciseEnabled;
    }

    public final StringResource getTradeOnExpirationDisclaimer() {
        return this.tradeOnExpirationDisclaimer;
    }

    public final StringResource getAccountDisplayNameToShow() {
        return this.accountDisplayNameToShow;
    }

    public final Map<String, JsonPrimitive<?>> getInstantCashSwitchToMarginInputParams() {
        return this.instantCashSwitchToMarginInputParams;
    }

    public final OptionsSettingContract3 getUpgradeCashAccountFailureState() {
        if (this.inMarginRoutingExperiment) {
            return OptionsSettingContract3.MarginRouting.INSTANCE;
        }
        return OptionsSettingContract3.Control.INSTANCE;
    }

    /* renamed from: isMarginSupportedInCurrentAccount, reason: from getter */
    public final boolean getIsMarginSupportedInCurrentAccount() {
        return this.isMarginSupportedInCurrentAccount;
    }

    public final OptionSettingShortSellingState getShortSellingState() {
        return this.shortSellingState;
    }
}
