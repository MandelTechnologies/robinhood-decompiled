package com.robinhood.android.account.p060ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OptionsStatus;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsViewerFragmentKey;
import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewOptionsSettingCard.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"J$\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J$\u00101\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J$\u00102\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J \u00103\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00104\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J \u00105\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010=\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u001dHÖ\u0001J\t\u0010A\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010,\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/account/ui/OptionsSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "account", "Lcom/robinhood/models/db/Account;", "canUpgradeToOptions", "", "optionsStatus", "Lcom/robinhood/models/db/OptionsStatus;", "useServerDrivenOptionsSection", "showOptionLevel3EntryPoint", "optionKnowledgeCheckAppointmentId", "", "<init>", "(Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/OptionsStatus;ZZLjava/lang/String;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getCanUpgradeToOptions", "()Z", "getOptionsStatus", "()Lcom/robinhood/models/db/OptionsStatus;", "getUseServerDrivenOptionsSection", "getShowOptionLevel3EntryPoint", "getOptionKnowledgeCheckAppointmentId", "()Ljava/lang/String;", "optionsEnabled", "getOptionsEnabled", "hideOptionsSection", "getHideOptionsSection", "titleTextRes", "", "getTitleTextRes", "()I", "getSummary", "Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "getSummaryTextLinkOnClick", "Lkotlin/Function0;", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "firstCtaTextRes", "getFirstCtaTextRes", "()Ljava/lang/Integer;", "secondCtaTextRes", "getSecondCtaTextRes", "getFirstCtaOnClick", "getSecondCtaOnClick", "goToOptionsOnboarding", "goToAppointmentViewer", "goToOptionsSettings", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class OptionsSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean canUpgradeToOptions;
    private final boolean hideOptionsSection;
    private final String optionKnowledgeCheckAppointmentId;
    private final OptionsStatus optionsStatus;
    private final boolean showOptionLevel3EntryPoint;
    private final boolean useServerDrivenOptionsSection;

    /* compiled from: AccountOverviewOptionsSettingCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsStatus.values().length];
            try {
                iArr[OptionsStatus.OPTIONS_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsStatus.LEVEL_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsStatus.LEVEL_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsStatus.LEVEL_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsStatus.ACTION_NEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionsStatus.L2_ACTION_NEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionsStatus.PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionsStatus.PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionsStatus.L2_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionsStatus.JA_L0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionsStatus.JA_L0_INCOMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionsStatus.JA_L0_MR_REQUIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionsStatus.JA_L0_PENDING_CO_OWNER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionsStatus.JA_L0_PENDING_CO_OWNER_MR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionsStatus.JA_L2_MR_REQUIRED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionsStatus.JA_L2_PENDING_CO_OWNER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionsStatus.JA_L2_PENDING_CO_OWNER_MR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionsStatus.NOT_AVAILABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionsStatus.CUSTODIAL_UNAVAILABLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionsSectionState copy$default(OptionsSectionState optionsSectionState, Account account, boolean z, OptionsStatus optionsStatus, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionsSectionState.account;
        }
        if ((i & 2) != 0) {
            z = optionsSectionState.canUpgradeToOptions;
        }
        if ((i & 4) != 0) {
            optionsStatus = optionsSectionState.optionsStatus;
        }
        if ((i & 8) != 0) {
            z2 = optionsSectionState.useServerDrivenOptionsSection;
        }
        if ((i & 16) != 0) {
            z3 = optionsSectionState.showOptionLevel3EntryPoint;
        }
        if ((i & 32) != 0) {
            str = optionsSectionState.optionKnowledgeCheckAppointmentId;
        }
        boolean z4 = z3;
        String str2 = str;
        return optionsSectionState.copy(account, z, optionsStatus, z2, z4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsStatus getOptionsStatus() {
        return this.optionsStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseServerDrivenOptionsSection() {
        return this.useServerDrivenOptionsSection;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowOptionLevel3EntryPoint() {
        return this.showOptionLevel3EntryPoint;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOptionKnowledgeCheckAppointmentId() {
        return this.optionKnowledgeCheckAppointmentId;
    }

    public final OptionsSectionState copy(Account account, boolean canUpgradeToOptions, OptionsStatus optionsStatus, boolean useServerDrivenOptionsSection, boolean showOptionLevel3EntryPoint, String optionKnowledgeCheckAppointmentId) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(optionsStatus, "optionsStatus");
        return new OptionsSectionState(account, canUpgradeToOptions, optionsStatus, useServerDrivenOptionsSection, showOptionLevel3EntryPoint, optionKnowledgeCheckAppointmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSectionState)) {
            return false;
        }
        OptionsSectionState optionsSectionState = (OptionsSectionState) other;
        return Intrinsics.areEqual(this.account, optionsSectionState.account) && this.canUpgradeToOptions == optionsSectionState.canUpgradeToOptions && this.optionsStatus == optionsSectionState.optionsStatus && this.useServerDrivenOptionsSection == optionsSectionState.useServerDrivenOptionsSection && this.showOptionLevel3EntryPoint == optionsSectionState.showOptionLevel3EntryPoint && Intrinsics.areEqual(this.optionKnowledgeCheckAppointmentId, optionsSectionState.optionKnowledgeCheckAppointmentId);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.account.hashCode() * 31) + Boolean.hashCode(this.canUpgradeToOptions)) * 31) + this.optionsStatus.hashCode()) * 31) + Boolean.hashCode(this.useServerDrivenOptionsSection)) * 31) + Boolean.hashCode(this.showOptionLevel3EntryPoint)) * 31;
        String str = this.optionKnowledgeCheckAppointmentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OptionsSectionState(account=" + this.account + ", canUpgradeToOptions=" + this.canUpgradeToOptions + ", optionsStatus=" + this.optionsStatus + ", useServerDrivenOptionsSection=" + this.useServerDrivenOptionsSection + ", showOptionLevel3EntryPoint=" + this.showOptionLevel3EntryPoint + ", optionKnowledgeCheckAppointmentId=" + this.optionKnowledgeCheckAppointmentId + ")";
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    public final OptionsStatus getOptionsStatus() {
        return this.optionsStatus;
    }

    public final boolean getUseServerDrivenOptionsSection() {
        return this.useServerDrivenOptionsSection;
    }

    public final boolean getShowOptionLevel3EntryPoint() {
        return this.showOptionLevel3EntryPoint;
    }

    public final String getOptionKnowledgeCheckAppointmentId() {
        return this.optionKnowledgeCheckAppointmentId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSectionState(Account account, boolean z, OptionsStatus optionsStatus, boolean z2, boolean z3, String str) {
        super(CardOrder.CardIdentifier.OPTIONS_SETTINGS, null);
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(optionsStatus, "optionsStatus");
        this.account = account;
        this.canUpgradeToOptions = z;
        this.optionsStatus = optionsStatus;
        this.useServerDrivenOptionsSection = z2;
        this.showOptionLevel3EntryPoint = z3;
        this.optionKnowledgeCheckAppointmentId = str;
        this.hideOptionsSection = z2 && (optionsStatus == OptionsStatus.OPTIONS_STATUS_UNSPECIFIED || optionsStatus == OptionsStatus.NOT_AVAILABLE);
    }

    public final boolean getOptionsEnabled() {
        return !this.canUpgradeToOptions;
    }

    public final boolean getHideOptionsSection() {
        return this.hideOptionsSection;
    }

    public final int getTitleTextRes() {
        if (this.useServerDrivenOptionsSection) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.optionsStatus.ordinal()]) {
                case 1:
                    return C41827R.string.general_label_n_a;
                case 2:
                    return C8159R.string.options_setting_disabled_label;
                case 3:
                    return C8159R.string.options_setting_l2_label;
                case 4:
                    return C8159R.string.options_setting_l3_label;
                case 5:
                    return C8159R.string.gated_options_action_needed_label;
                case 6:
                    return C8159R.string.options_setting_l2_label;
                case 7:
                    return C8159R.string.gated_options_pending_label;
                case 8:
                    return C8159R.string.gated_options_pending_label;
                case 9:
                    return C8159R.string.options_setting_l2_label;
                case 10:
                    return C8159R.string.options_setting_l2_label;
                case 11:
                    return C8159R.string.options_setting_disabled_label;
                case 12:
                    return C8159R.string.gated_options_pending_label;
                case 13:
                    return C8159R.string.gated_options_pending_label;
                case 14:
                    return C8159R.string.gated_options_pending_label;
                case 15:
                    return C8159R.string.gated_options_pending_label;
                case 16:
                    return C8159R.string.options_setting_l2_label;
                case 17:
                    return C8159R.string.options_setting_l2_label;
                case 18:
                    return C8159R.string.options_setting_l2_label;
                case 19:
                    return C41827R.string.general_label_n_a;
                case 20:
                    return C8159R.string.options_custodial_unavailable_label;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        OptionsStatus optionsStatus = this.optionsStatus;
        if (optionsStatus == OptionsStatus.ACTION_NEEDED) {
            return C8159R.string.gated_options_action_needed_label;
        }
        if (optionsStatus == OptionsStatus.PENDING) {
            return C8159R.string.gated_options_pending_label;
        }
        if (this.canUpgradeToOptions) {
            return C8159R.string.options_setting_disabled_label;
        }
        OptionLevel optionLevel = OptionLevel.INSTANCE;
        return optionLevel.isAdvancedLevel(this.account.getOptionLevel()) ? C8159R.string.options_setting_l3_label : optionLevel.isBasicLevel(this.account.getOptionLevel()) ? C8159R.string.options_setting_l2_label : C41827R.string.general_label_n_a;
    }

    public final AccountOverviewOptionsSettingCard3 getSummary(Composer composer, int i) {
        String strLocalityStringResource;
        String strStringResource;
        AccountOverviewOptionsSettingCard3 textWithLink;
        AccountOverviewOptionsSettingCard3 text;
        composer.startReplaceGroup(1743847524);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1743847524, i, -1, "com.robinhood.android.account.ui.OptionsSectionState.getSummary (AccountOverviewOptionsSettingCard.kt:98)");
        }
        if (this.useServerDrivenOptionsSection) {
            composer.startReplaceGroup(-962545186);
            switch (WhenMappings.$EnumSwitchMapping$0[this.optionsStatus.ordinal()]) {
                case 1:
                    composer.startReplaceGroup(800232403);
                    composer.endReplaceGroup();
                    text = new AccountOverviewOptionsSettingCard3.Text("");
                    break;
                case 2:
                    composer.startReplaceGroup(800235337);
                    int i2 = C8159R.string.options_enable_summary;
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(LocalityStringResources2.localityStringResource(i2, C8159R.string.options_enable_summary_level_2_uk, i2, composer, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 3:
                    composer.startReplaceGroup(800250857);
                    int i3 = C8159R.string.options_enable_summary;
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(LocalityStringResources2.localityStringResource(i3, C8159R.string.options_enable_summary_level_3_uk, i3, composer, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 4:
                    composer.startReplaceGroup(800266377);
                    int i4 = C8159R.string.options_enable_summary;
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(LocalityStringResources2.localityStringResource(i4, C8159R.string.options_enable_summary_level_2_uk, i4, composer, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 5:
                    composer.startReplaceGroup(800281794);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_level0_needs_to_start_manual_review, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 6:
                    composer.startReplaceGroup(800288278);
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(StringResources_androidKt.stringResource(C8159R.string.gated_options_level2_needs_to_start_manual_review, composer, 0), StringResources_androidKt.stringResource(C8159R.string.gated_options_settings_continue_application_action, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 7:
                    composer.startReplaceGroup(800297947);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_level0_pending_manual_review, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 8:
                    composer.startReplaceGroup(800304507);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_level0_pending_manual_review, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 9:
                    composer.startReplaceGroup(800310459);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_level2_pending_manual_review, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 10:
                    composer.startReplaceGroup(800317221);
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(StringResources_androidKt.stringResource(C8159R.string.gated_options_level2_pending_manual_review, composer, 0), StringResources_androidKt.stringResource(C8159R.string.options_settings_view_appointment_action, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 11:
                    composer.startReplaceGroup(800326392);
                    text = new AccountOverviewOptionsSettingCard3.TextWithLink(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l0_summary, composer, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 12:
                    composer.startReplaceGroup(800335426);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l0_incomplete_summary, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 13:
                    composer.startReplaceGroup(800342040);
                    text = new AccountOverviewOptionsSettingCard3.TextWithSubstringLink(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l0_manual_review_required_summary, composer, 0), StringResources_androidKt.stringResource(C8159R.string.f3885x15451994, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 14:
                    composer.startReplaceGroup(800355240);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l0_pending_co_owner_summary, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 15:
                    composer.startReplaceGroup(800362149);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.f3886xa34168e, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 16:
                    composer.startReplaceGroup(800370840);
                    text = new AccountOverviewOptionsSettingCard3.TextWithSubstringLink(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l2_manual_review_required_summary, composer, 0), StringResources_androidKt.stringResource(C8159R.string.f3887x240f83d2, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 17:
                    composer.startReplaceGroup(800384040);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_joint_account_l2_pending_co_owner_summary, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 18:
                    composer.startReplaceGroup(800390949);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.f3888xb86ff84c, composer, 0));
                    composer.endReplaceGroup();
                    break;
                case 19:
                    composer.startReplaceGroup(800399187);
                    composer.endReplaceGroup();
                    text = new AccountOverviewOptionsSettingCard3.Text("");
                    break;
                case 20:
                    composer.startReplaceGroup(800402268);
                    text = new AccountOverviewOptionsSettingCard3.Text(StringResources_androidKt.stringResource(C8159R.string.gated_options_custodial_unavailable_summary, composer, 0));
                    composer.endReplaceGroup();
                    break;
                default:
                    composer.startReplaceGroup(800234572);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return text;
        }
        composer.startReplaceGroup(-957110080);
        OptionsStatus optionsStatus = this.optionsStatus;
        if (optionsStatus == OptionsStatus.ACTION_NEEDED) {
            composer.startReplaceGroup(800415348);
            strLocalityStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_level0_needs_to_start_manual_review, composer, 0);
            composer.endReplaceGroup();
        } else if (optionsStatus == OptionsStatus.L2_ACTION_NEEDED) {
            composer.startReplaceGroup(800421108);
            strLocalityStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_level2_needs_to_start_manual_review, composer, 0);
            composer.endReplaceGroup();
        } else if (optionsStatus == OptionsStatus.PENDING) {
            composer.startReplaceGroup(800426573);
            strLocalityStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_level0_pending_manual_review, composer, 0);
            composer.endReplaceGroup();
        } else if (optionsStatus == OptionsStatus.L2_PENDING) {
            composer.startReplaceGroup(800431917);
            strLocalityStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_level2_pending_manual_review, composer, 0);
            composer.endReplaceGroup();
        } else if (this.showOptionLevel3EntryPoint) {
            composer.startReplaceGroup(800436779);
            strLocalityStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_level3_entry_point_summary, composer, 0);
            composer.endReplaceGroup();
        } else if (OptionLevel.INSTANCE.isBasicLevel(this.account.getOptionLevel())) {
            composer.startReplaceGroup(800442340);
            int i5 = C8159R.string.options_enable_summary;
            strLocalityStringResource = LocalityStringResources2.localityStringResource(i5, C8159R.string.options_enable_summary_level_3_uk, i5, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(800451332);
            int i6 = C8159R.string.options_enable_summary;
            strLocalityStringResource = LocalityStringResources2.localityStringResource(i6, C8159R.string.options_enable_summary_level_2_uk, i6, composer, 0);
            composer.endReplaceGroup();
        }
        OptionsStatus optionsStatus2 = this.optionsStatus;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i7 = iArr[optionsStatus2.ordinal()];
        boolean z = i7 == 5 || i7 == 7 || i7 == 9 || this.showOptionLevel3EntryPoint;
        if (iArr[this.optionsStatus.ordinal()] == 6) {
            composer.startReplaceGroup(800471061);
            strStringResource = StringResources_androidKt.stringResource(C8159R.string.gated_options_settings_continue_application_action, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(800475420);
            strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0);
            composer.endReplaceGroup();
        }
        if (z) {
            textWithLink = new AccountOverviewOptionsSettingCard3.Text(strLocalityStringResource);
        } else {
            textWithLink = new AccountOverviewOptionsSettingCard3.TextWithLink(strLocalityStringResource, strStringResource);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textWithLink;
    }

    public final Function0<Unit> getSummaryTextLinkOnClick(final Navigator navigator, final Context context, final EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        if (this.useServerDrivenOptionsSection) {
            return new Function0() { // from class: com.robinhood.android.account.ui.OptionsSectionState$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsSectionState.getSummaryTextLinkOnClick$lambda$0(context, this, navigator, eventLogger);
                }
            };
        }
        return new Function0() { // from class: com.robinhood.android.account.ui.OptionsSectionState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsSectionState.getSummaryTextLinkOnClick$lambda$1(this.f$0, navigator, context, eventLogger);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSummaryTextLinkOnClick$lambda$0(Context context, OptionsSectionState optionsSectionState, Navigator navigator, EventLogger eventLogger) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String string2 = resources.getString(C8159R.string.account_overview_options_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C8159R.string.account_overview_options_call_put_url);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = resources.getString(C8159R.string.account_overview_options_advanced_strategy_url);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        switch (WhenMappings.$EnumSwitchMapping$0[optionsSectionState.optionsStatus.ordinal()]) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 2:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
                break;
            case 3:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
                break;
            case 4:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
                break;
            case 6:
                optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                break;
            case 10:
                optionsSectionState.goToAppointmentViewer(navigator, context);
                break;
            case 11:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
                break;
            case 13:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string3);
                break;
            case 16:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string4);
                break;
            case 20:
                Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSummaryTextLinkOnClick$lambda$1(OptionsSectionState optionsSectionState, Navigator navigator, Context context, EventLogger eventLogger) throws Resources.NotFoundException {
        if (WhenMappings.$EnumSwitchMapping$0[optionsSectionState.optionsStatus.ordinal()] == 6) {
            optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
        } else {
            String string2 = context.getResources().getString(C8159R.string.account_overview_options_url);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, context, string2);
        }
        return Unit.INSTANCE;
    }

    public final Integer getFirstCtaTextRes() {
        if (this.useServerDrivenOptionsSection) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.optionsStatus.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    return Integer.valueOf(C8159R.string.options_enable_action);
                case 3:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 4:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 5:
                    return Integer.valueOf(C8159R.string.gated_options_settings_continue_application_action);
                case 6:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 7:
                    return null;
                case 8:
                    return Integer.valueOf(C8159R.string.options_settings_view_appointment_action);
                case 9:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 10:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 11:
                    return Integer.valueOf(C8159R.string.options_enable_action);
                case 12:
                    return Integer.valueOf(C8159R.string.options_enable_action);
                case 13:
                    return Integer.valueOf(C8159R.string.options_schedule_call_action);
                case 14:
                case 15:
                    return null;
                case 16:
                    return Integer.valueOf(C8159R.string.options_schedule_call_action);
                case 17:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 18:
                    return Integer.valueOf(C8159R.string.options_settings_action);
                case 19:
                case 20:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        OptionsStatus optionsStatus = this.optionsStatus;
        if (optionsStatus == OptionsStatus.PENDING) {
            return null;
        }
        if (optionsStatus == OptionsStatus.ACTION_NEEDED) {
            return Integer.valueOf(C8159R.string.gated_options_settings_continue_application_action);
        }
        return getOptionsEnabled() ? Integer.valueOf(C8159R.string.options_settings_action) : Integer.valueOf(C8159R.string.options_enable_action);
    }

    public final Integer getSecondCtaTextRes() {
        if (this.useServerDrivenOptionsSection && this.optionsStatus == OptionsStatus.JA_L2_MR_REQUIRED) {
            return Integer.valueOf(C8159R.string.options_settings_action);
        }
        return null;
    }

    public final Function0<Unit> getFirstCtaOnClick(final Navigator navigator, final Context context, final EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        return new Function0() { // from class: com.robinhood.android.account.ui.OptionsSectionState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsSectionState.getFirstCtaOnClick$lambda$2(this.f$0, navigator, context, eventLogger);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFirstCtaOnClick$lambda$2(OptionsSectionState optionsSectionState, Navigator navigator, Context context, EventLogger eventLogger) {
        if (optionsSectionState.useServerDrivenOptionsSection) {
            switch (WhenMappings.$EnumSwitchMapping$0[optionsSectionState.optionsStatus.ordinal()]) {
                case 1:
                case 7:
                case 14:
                case 15:
                case 19:
                case 20:
                    break;
                case 2:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 3:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 4:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 5:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 6:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 8:
                    optionsSectionState.goToAppointmentViewer(navigator, context);
                    break;
                case 9:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 10:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 11:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 12:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 13:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 16:
                    optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
                    break;
                case 17:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                case 18:
                    optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (optionsSectionState.getOptionsEnabled()) {
            optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
        } else {
            optionsSectionState.goToOptionsOnboarding(navigator, context, eventLogger);
        }
        return Unit.INSTANCE;
    }

    public final Function0<Unit> getSecondCtaOnClick(final Navigator navigator, final Context context, final EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        return new Function0() { // from class: com.robinhood.android.account.ui.OptionsSectionState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsSectionState.getSecondCtaOnClick$lambda$3(this.f$0, navigator, context, eventLogger);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSecondCtaOnClick$lambda$3(OptionsSectionState optionsSectionState, Navigator navigator, Context context, EventLogger eventLogger) {
        if (optionsSectionState.useServerDrivenOptionsSection && optionsSectionState.optionsStatus == OptionsStatus.JA_L2_MR_REQUIRED) {
            optionsSectionState.goToOptionsSettings(navigator, context, eventLogger);
        }
        return Unit.INSTANCE;
    }

    private final void goToOptionsOnboarding(Navigator navigator, Context context, EventLogger eventLogger) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_OPTION_UPGRADE_FLOW, new Screen(Screen.Name.INVESTING_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.OPTIONS_STATUS_SECTION, this.optionsStatus.name(), null, 4, null), null, null, false, 56, null);
        Navigator.DefaultImpls.startActivity$default(navigator, context, new OptionOnboarding(new OptionOnboarding2.AccountNumber(this.account.getAccountNumber()), new OptionOnboarding.OptionOnboardingSource.Legacy("settings"), null, 4, null), null, false, null, null, 60, null);
    }

    private final void goToAppointmentViewer(Navigator navigator, Context context) {
        String str = this.optionKnowledgeCheckAppointmentId;
        if (str != null) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AppointmentsViewerFragmentKey(str, new AppointmentsSchedulerFragmentKey.Source.OptionsOnboarding(this.account.getAccountNumber())), false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    private final void goToOptionsSettings(Navigator navigator, Context context, EventLogger eventLogger) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_SETTINGS, new Screen(Screen.Name.INVESTING_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.OPTIONS_STATUS_SECTION, "LEVEL_2", null, 4, null), null, null, false, 56, null);
        Navigator.DefaultImpls.showFragment$default(navigator, context, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, true, false, null, null, this.account.getAccountNumber(), null, false, 442, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
    }
}
