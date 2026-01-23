package com.robinhood.android.transfers.ach.p265ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentRequestSource;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentVerification;
import com.robinhood.android.banking.p065ui.ScheduleAutomaticDepositFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.ach.p265ui.AutomaticDepositSplashFragment;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositFragment;
import com.robinhood.android.transfers.ach.p265ui.CreateTransferAchRelationshipListFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewQueuedAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs4;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.EnterDepositScheduleAmountFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ReviewDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.experiments.OnboardingRecurringDepositCleanup;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.DepositScheduleTimelineFragment;
import com.robinhood.android.transfers.contracts.AchTransferIntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty3;

/* compiled from: CreateAchTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\u0002\u0082\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u0002082\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020@H\u0014J\b\u0010A\u001a\u000208H\u0016J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020-H\u0016J\b\u0010E\u001a\u000208H\u0016J\u0010\u0010F\u001a\u0002082\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002082\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010J\u001a\u000208H\u0016J\b\u0010K\u001a\u000208H\u0016J\u0012\u0010L\u001a\u0002082\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J$\u0010O\u001a\u0002082\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010T\u001a\u0002082\u0006\u0010R\u001a\u00020SH\u0016J\u0012\u0010U\u001a\u0002082\b\u0010V\u001a\u0004\u0018\u00010HH\u0016J\b\u0010W\u001a\u000208H\u0016J$\u0010X\u001a\u0002082\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020^H\u0016J\u0012\u0010_\u001a\u0002082\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J$\u0010`\u001a\u0002082\b\u0010a\u001a\u0004\u0018\u00010Q2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010]\u001a\u00020^H\u0016J\"\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\b\u0010f\u001a\u0004\u0018\u00010@H\u0014J\u0010\u0010g\u001a\u0002082\u0006\u0010Y\u001a\u00020ZH\u0016J\u001a\u0010h\u001a\u0002082\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016JB\u0010i\u001a\u0002082\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010j\u001a\u00020-2\b\u0010k\u001a\u0004\u0018\u00010S2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010l\u001a\u0004\u0018\u00010mH\u0002J\u0012\u0010n\u001a\u0002082\b\u0010R\u001a\u0004\u0018\u00010^H\u0002J\u0012\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010r\u001a\u0002082\u0006\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u000208H\u0016J\u0010\u0010v\u001a\u0002082\u0006\u0010s\u001a\u00020wH\u0016J\u0010\u0010x\u001a\u0002082\u0006\u0010s\u001a\u00020yH\u0016J\u0010\u0010z\u001a\u0002082\u0006\u0010s\u001a\u00020{H\u0016J\t\u0010|\u001a\u00020-H\u0096\u0001R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0012\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0004\n\u0002\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u007f0~X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferActivity;", "Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/AutomaticDepositSplashFragment$Callbacks;", "Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/ReviewQueuedAchTransferFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Callback;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Callbacks;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "<init>", "()V", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "getShortcutManager", "()Lcom/robinhood/android/common/util/RhShortcutManager;", "setShortcutManager", "(Lcom/robinhood/android/common/util/RhShortcutManager;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "shouldCleanupOnboardingRecurringContent", "", "Ljava/lang/Boolean;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "isFromRhfOnboarding", "()Z", "account", "Lcom/robinhood/models/db/Account;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onBackPressed", "getStartFragment", "Landroidx/fragment/app/Fragment;", "shouldPromptForLockscreen", "onStartAutomaticDepositFlow", "onAutomaticDepositIntervalSelected", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "onScheduleAutomaticDepositFrequencySelected", "onScheduleAutomaticDepositSkipped", "onAchRelationshipSelected", "onWithdrawableCashLearnMoreClicked", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "reviewAchTransfer", "achRhId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "onCreateQueuedDepositReview", "editDepositFrequency", "currentFrequency", "editAchRelationship", "onTransferInitiated", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "amountMoney", "Lcom/robinhood/models/util/Money;", "onTransferFailed", "onQueuedTransferInitiated", "verificationDocumentRequestId", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "showInstantDepositPage", "showTransferConfirmation", "showConfirmation", "isQueuedDeposit", "maxEarlyAccessAmount", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", "setResultOkWithTransferAmount", "getScheduleAutomaticDepositFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "initialFrequency", "onShowReviewScreen", "args", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "onShowCreateAchRelationship", "editDepositSchedule", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "onShowEnterAmount", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "onDepositScheduleSubmitted", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateAchTransferActivity extends BaseCreateAchTransferActivity implements RegionGated, CreateAchTransferFragment.Callbacks, CreateQueuedAchDepositFragment.Callbacks, AutomaticDepositSplashFragment.Callbacks, ScheduleAutomaticDepositFragment.Callbacks, ScheduleAutomaticDepositV2Fragment.Callbacks, CreateTransferAchRelationshipListFragment.Callbacks, ReviewAchTransferFragment.Callbacks, ReviewQueuedAchTransferFragment.Callbacks, AchTransferConfirmationFragment.Callbacks, AchTransferTimelineFragment.Callbacks, SetDepositScheduleFragment.Callback, EnterDepositScheduleAmountFragment.Callbacks, ReviewDepositScheduleFragment.Callbacks, ReviewRecurringDepositFragment.Callbacks, FromOnboardingCallbacks {
    private static final int SET_AUTOMATIC_DEPOSIT_FROM_PROMPT = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
    private Account account;
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;
    public ExperimentsStore experimentsStore;
    public RhShortcutManager shortcutManager;
    private Boolean shouldCleanupOnboardingRecurringContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateAchTransferActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferContext.RobinhoodAccountType.values().length];
            try {
                iArr[TransferContext.RobinhoodAccountType.BROKERAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.SPENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.RHS_ROTH_IRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.RHS_TRADITIONAL_IRA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final RhShortcutManager getShortcutManager() {
        RhShortcutManager rhShortcutManager = this.shortcutManager;
        if (rhShortcutManager != null) {
            return rhShortcutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shortcutManager");
        return null;
    }

    public final void setShortcutManager(RhShortcutManager rhShortcutManager) {
        Intrinsics.checkNotNullParameter(rhShortcutManager, "<set-?>");
        this.shortcutManager = rhShortcutManager;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferActivity
    public TransferContext getTransferContext() {
        return ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getTransferContext();
    }

    @Override // com.robinhood.android.maxonboarding.FromOnboardingCallbacks
    public boolean isFromRhfOnboarding() {
        return ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        OnboardingProgress onboardingProgress;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getTransferContext() instanceof TransferContext.RecurringDepositFromOnboarding) {
            onboardingProgress = OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE;
        } else {
            onboardingProgress = OnboardingProgress.FUND_ACCOUNT_DEPOSIT;
        }
        ToolbarExt2.configureMaxActivity(toolbar, onboardingProgress, isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        DirectionOverlay directionOverlay;
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
        TransferContext transferContext = getTransferContext();
        if ((transferContext instanceof TransferContext.Normal) || (transferContext instanceof TransferContext.NormalIav) || (transferContext instanceof TransferContext.RecommendedDeposit) || (transferContext instanceof TransferContext.DepositDeepLink) || (transferContext instanceof TransferContext.AutomaticDeposit) || (transferContext instanceof TransferContext.RecurringDepositFromOnboarding) || (transferContext instanceof TransferContext.QueuedDeposit) || (transferContext instanceof TransferContext.MarginDeposit) || (transferContext instanceof TransferContext.RecurringInsufficientBuyingPower) || (transferContext instanceof TransferContext.RecommendationsOrderDeposit)) {
            directionOverlay = DirectionOverlay.POSITIVE;
        } else {
            if (!(transferContext instanceof TransferContext.MarginCallPrevention) && !(transferContext instanceof TransferContext.MarginResolution) && !(transferContext instanceof TransferContext.DayTradeCall)) {
                throw new NoWhenBranchMatchedException();
            }
            directionOverlay = DirectionOverlay.NEGATIVE;
        }
        Boolean bool = Boolean.FALSE;
        scarletManager.putOverlay(directionOverlay, bool);
        scarletManager.putOverlay(DesignSystemLegacyShim.INSTANCE, bool);
        if (isFromRhfOnboarding() || ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getUseAchromaticOverlay()) {
            ScarletManager.putOverlay$default(scarletManager, TransfersMonochromeOverlay.INSTANCE, null, 2, null);
        }
        super.onCreate(savedInstanceState);
        if (((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (getTransferContext().getDirection() != TransferDirection.WITHDRAW) {
            getShortcutManager().reportUse(RhShortcut.DEPOSIT);
        }
        if (getTransferContext() instanceof TransferContext.RecurringDepositFromOnboarding) {
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OnboardingRecurringDepositCleanup.INSTANCE}, false, null, 6, null)), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateAchTransferActivity.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateAchTransferActivity.onCreate$lambda$2(this.f$0, (Throwable) obj);
                }
            }, null, null, 12, null);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, getStartFragment());
        }
        Observable<Account> observableTake = getAccountProvider().streamIndividualAccount().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C300894(new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferActivity.onCreate.5
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((CreateAchTransferActivity) this.receiver).account;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((CreateAchTransferActivity) this.receiver).account = (Account) obj;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CreateAchTransferActivity createAchTransferActivity, boolean z) {
        createAchTransferActivity.shouldCleanupOnboardingRecurringContent = Boolean.valueOf(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CreateAchTransferActivity createAchTransferActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        createAchTransferActivity.shouldCleanupOnboardingRecurringContent = Boolean.FALSE;
        return Unit.INSTANCE;
    }

    /* compiled from: CreateAchTransferActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateAchTransferActivity$onCreate$4 */
    /* synthetic */ class C300894 extends FunctionReferenceImpl implements Function1<Account, Unit> {
        C300894(Object obj) {
            super(1, obj, KProperty3.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Account account) {
            invoke2(account);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Account account) {
            ((KProperty3) this.receiver).set(account);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setFragment(C11048R.id.fragment_container, getStartFragment());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && getSupportFragmentManager().getBackStackEntryCount() == 0) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_EXIT_TRANSFERS_FLOW_WITH_BACK_PRESS, "", null, null, null, null, getTransferContext().toString(), currentFragment.getClass().getSimpleName(), 60, null);
        }
        super.onBackPressed();
    }

    private final Fragment getStartFragment() {
        TransferContext transferContext = getTransferContext();
        if (transferContext instanceof TransferContext.QueuedDeposit) {
            Intrinsics.checkNotNull(getTransferContext().getAccountData());
            return CreateQueuedAchDepositFragment.INSTANCE.newInstance(new CreateQueuedAchDepositFragment.Args(getTransferContext()));
        }
        if ((transferContext instanceof TransferContext.AutomaticDeposit) || (transferContext instanceof TransferContext.RecurringDepositFromOnboarding)) {
            if (getTransferContext().getSkipAutomaticDepositSplashScreen()) {
                return getScheduleAutomaticDepositFragment(null);
            }
            return AutomaticDepositSplashFragment.INSTANCE.newInstance();
        }
        if (!(transferContext instanceof TransferContext.Normal) && !(transferContext instanceof TransferContext.NormalIav) && !(transferContext instanceof TransferContext.RecommendedDeposit) && !(transferContext instanceof TransferContext.DepositDeepLink) && !(transferContext instanceof TransferContext.MarginCallPrevention) && !(transferContext instanceof TransferContext.MarginResolution) && !(transferContext instanceof TransferContext.DayTradeCall) && !(transferContext instanceof TransferContext.MarginDeposit) && !(transferContext instanceof TransferContext.RecurringInsufficientBuyingPower) && !(transferContext instanceof TransferContext.RecommendationsOrderDeposit)) {
            throw new NoWhenBranchMatchedException();
        }
        return CreateAchTransferFragment.INSTANCE.newInstance(new CreateAchTransferFragment.Args(getTransferContext(), getTransferContext().getRecommendedFrequency()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        IavSource iavSource;
        return (isFromRhfOnboarding() || (iavSource = getTransferContext().getIavSource()) == null || iavSource.isFromOnboarding()) ? false : true;
    }

    @Override // com.robinhood.android.transfers.ach.ui.AutomaticDepositSplashFragment.Callbacks
    public void onStartAutomaticDepositFlow() {
        setCurrentFragmentTransitionSuccess();
        replaceFragment(getScheduleAutomaticDepositFragment(null));
    }

    @Override // com.robinhood.android.banking.ui.ScheduleAutomaticDepositFragment.Callbacks
    public void onAutomaticDepositIntervalSelected(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        setCurrentFragmentTransitionSuccess();
        replaceFragment(CreateAchTransferFragment.INSTANCE.newInstance(new CreateAchTransferFragment.Args(getTransferContext(), frequency)));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment.Callbacks
    public void onScheduleAutomaticDepositFrequencySelected(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        onAutomaticDepositIntervalSelected(frequency);
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment.Callbacks
    public void onScheduleAutomaticDepositSkipped() {
        finish();
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateTransferAchRelationshipListFragment.Callbacks
    public void onAchRelationshipSelected() {
        setCurrentFragmentTransitionSuccess();
        popLastFragment();
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment.Callbacks
    public void onWithdrawableCashLearnMoreClicked(AchRelationship achRelationship) {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(LegacyFragmentKey.WithdrawableAmountDetail.INSTANCE, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment.Callbacks
    public void reviewAchTransfer(UUID achRhId, BigDecimal amount, ApiAutomaticDeposit.Frequency frequency) {
        Account.MarginBalances marginBalances;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        if (achRhId != null) {
            setCurrentFragmentTransitionSuccess();
            if (Intrinsics.areEqual(this.shouldCleanupOnboardingRecurringContent, Boolean.TRUE)) {
                ReviewRecurringDepositFragment.Companion companion = ReviewRecurringDepositFragment.INSTANCE;
                TransferContext transferContext = getTransferContext();
                Intrinsics.checkNotNull(amount);
                Account account = this.account;
                BigDecimal unclearedDeposits = null;
                BigDecimal maxAchEarlyAccessAmount = account != null ? account.getMaxAchEarlyAccessAmount() : null;
                Account account2 = this.account;
                if (account2 != null && (marginBalances = account2.getMarginBalances()) != null) {
                    unclearedDeposits = marginBalances.getUnclearedDeposits();
                }
                replaceFragment(companion.newInstance((Parcelable) new ReviewRecurringDepositFragment.Args(transferContext, amount, achRhId, frequency, maxAchEarlyAccessAmount, unclearedDeposits)));
                return;
            }
            ReviewAchTransferFragment.Companion companion2 = ReviewAchTransferFragment.INSTANCE;
            TransferContext transferContext2 = getTransferContext();
            Intrinsics.checkNotNull(amount);
            replaceFragment(companion2.newInstance(new ReviewAchTransferFragment.Args(transferContext2, amount, achRhId, frequency)));
            return;
        }
        setCurrentFragmentTransitionReason(TransitionReason.ACH_TRANSFER_REVIEW_NO_ACCOUNT);
        replaceFragment(CreateTransferAchRelationshipListFragment.INSTANCE.newInstance((Parcelable) new CreateTransferAchRelationshipListFragment.Args(getTransferContext().getDirection())));
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.Callbacks
    public void onCreateQueuedDepositReview(BigDecimal amount) {
        RhAccountType rhAccountType;
        Intrinsics.checkNotNullParameter(amount, "amount");
        setCurrentFragmentTransitionSuccess();
        ReviewQueuedAchTransferFragment.Companion companion = ReviewQueuedAchTransferFragment.INSTANCE;
        TransferContext transferContext = getTransferContext();
        int i = WhenMappings.$EnumSwitchMapping$0[getTransferContext().getAccountType().ordinal()];
        if (i == 1 || i == 2) {
            rhAccountType = RhAccountType.RHS_ACCOUNT;
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unexpected IRA account in queued transfer flow");
            }
            rhAccountType = RhAccountType.RHY_ACCOUNT;
        }
        replaceFragment(companion.newInstance(transferContext, amount, rhAccountType));
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment.Callbacks
    public void editDepositFrequency(ApiAutomaticDeposit.Frequency currentFrequency) {
        setCurrentFragmentTransitionReason(TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT);
        replaceFragment(getScheduleAutomaticDepositFragment(currentFrequency));
    }

    @Override // com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment.Callbacks, com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment.Callbacks, com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment.Callbacks
    public void editAchRelationship() {
        setCurrentFragmentTransitionReason(TransitionReason.ACH_TRANSFER_CHANGE_BANK);
        replaceFragment(CreateTransferAchRelationshipListFragment.INSTANCE.newInstance((Parcelable) new CreateTransferAchRelationshipListFragment.Args(getTransferContext().getDirection())));
    }

    @Override // com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment.Callbacks, com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment.Callbacks
    public void onTransferInitiated(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, Money amountMoney) {
        BigDecimal bigDecimal;
        Money earlyAccessAmount;
        Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
        setResultOkWithTransferAmount(amountMoney);
        if (achTransfer == null || (earlyAccessAmount = achTransfer.getEarlyAccessAmount()) == null || (maxAchEarlyAccessAmount = earlyAccessAmount.getDecimalValue()) == null) {
            Account account = this.account;
            if (account != null) {
                BigDecimal maxAchEarlyAccessAmount = account.getMaxAchEarlyAccessAmount();
                bigDecimal = maxAchEarlyAccessAmount;
            } else {
                bigDecimal = null;
            }
        } else {
            bigDecimal = maxAchEarlyAccessAmount;
        }
        if (getTransferContext().showConfirmationScreen()) {
            if ((achTransfer != null ? achTransfer.getDirection() : null) == TransferDirection.DEPOSIT) {
                replaceFragment(AchTransferTimelineFragment.INSTANCE.newInstance((Parcelable) new AchTransferTimelineFragment.Args(achTransfer, automaticDeposit)));
                return;
            } else {
                showConfirmation(achTransfer, automaticDeposit, false, bigDecimal, null, null);
                return;
            }
        }
        finish();
    }

    @Override // com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment.Callbacks, com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment.Callbacks
    public void onTransferFailed(AchTransfer achTransfer) {
        if (achTransfer != null) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACH_TRANSFER, achTransfer.getId(), null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        setResult(0);
        finish();
    }

    @Override // com.robinhood.android.transfers.ach.ui.ReviewQueuedAchTransferFragment.Callbacks
    public void onQueuedTransferInitiated(UUID verificationDocumentRequestId, AchTransfer achTransfer, Money amountMoney) {
        BigDecimal bigDecimal;
        Money earlyAccessAmount;
        Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
        setResultOkWithTransferAmount(amountMoney);
        if (verificationDocumentRequestId == null) {
            Account account = this.account;
            if (account != null && (decimalValue = account.getMaxAchEarlyAccessAmount()) != null) {
                bigDecimal = decimalValue;
            } else if (achTransfer == null || (earlyAccessAmount = achTransfer.getEarlyAccessAmount()) == null) {
                bigDecimal = null;
            } else {
                BigDecimal decimalValue = earlyAccessAmount.getDecimalValue();
                bigDecimal = decimalValue;
            }
            CreateIavAccountData accountData = getTransferContext().getAccountData();
            showConfirmation(null, null, true, bigDecimal, amountMoney, accountData != null ? accountData.getAccount() : null);
            return;
        }
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new AchRelationshipDocumentVerification(verificationDocumentRequestId, ApiDocumentRequest.Type.BANK_STATEMENT, AchRelationshipDocumentRequestSource.TRANSFERS, shouldPromptForLockscreen(), ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getTheme()), null, false, null, null, 60, null);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == -1) {
                popEntireFragmentBackstack();
                replaceFragment(getScheduleAutomaticDepositFragment(null));
            } else {
                finish();
            }
        }
    }

    @Override // com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment.Callbacks, com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment.Callbacks
    public void showInstantDepositPage(AchTransfer achTransfer) {
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        if (achTransfer.getEarlyAccessAmount().isPositive()) {
            getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_ACH_TRANSFER_INSTANT_DEPOSIT);
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.AchTransferInstantDepositFragmentV3(achTransfer), false, true, true, false, false, false, 112, null), 1, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineFragment.Callbacks
    public void showTransferConfirmation(AchTransfer achTransfer, AutomaticDeposit automaticDeposit) {
        Account.MarginBalances marginBalances;
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        if (getTransferContext().showConfirmationScreen()) {
            AchTransferConfirmationFragment.Companion companion = AchTransferConfirmationFragment.INSTANCE;
            BigDecimal decimalValue = achTransfer.getEarlyAccessAmount().getDecimalValue();
            IavSource iavSource = getTransferContext().getIavSource();
            boolean isFromOnboardingRadExp = getTransferContext().getIsFromOnboardingRadExp();
            boolean zAreEqual = Intrinsics.areEqual(this.shouldCleanupOnboardingRecurringContent, Boolean.TRUE);
            Account account = this.account;
            replaceFragment(companion.newInstance((Parcelable) new AchTransferConfirmationFragment.Args(achTransfer, automaticDeposit, false, decimalValue, iavSource, isFromOnboardingRadExp, null, null, zAreEqual, (account == null || (marginBalances = account.getMarginBalances()) == null) ? null : marginBalances.getUnclearedDeposits(), ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getTheme())));
            return;
        }
        finish();
    }

    private final void showConfirmation(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, boolean isQueuedDeposit, BigDecimal maxEarlyAccessAmount, Money amountMoney, IavAccount iavAccount) {
        Account.MarginBalances marginBalances;
        AchTransferConfirmationFragment.Companion companion = AchTransferConfirmationFragment.INSTANCE;
        IavSource iavSource = getTransferContext().getIavSource();
        boolean isFromOnboardingRadExp = getTransferContext().getIsFromOnboardingRadExp();
        boolean zAreEqual = Intrinsics.areEqual(this.shouldCleanupOnboardingRecurringContent, Boolean.TRUE);
        Account account = this.account;
        replaceFragment(companion.newInstance((Parcelable) new AchTransferConfirmationFragment.Args(achTransfer, automaticDeposit, isQueuedDeposit, maxEarlyAccessAmount, iavSource, isFromOnboardingRadExp, amountMoney, iavAccount, zAreEqual, (account == null || (marginBalances = account.getMarginBalances()) == null) ? null : marginBalances.getUnclearedDeposits(), ((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getTheme())));
    }

    private final void setResultOkWithTransferAmount(Money amount) {
        Intent intent = new Intent();
        intent.putExtra(ReturnedData.EXTRA_RETURNED_DATA, new ReturnedData.AchTransferAmount(amount));
        setResult(-1, intent);
    }

    private final BaseFragment getScheduleAutomaticDepositFragment(ApiAutomaticDeposit.Frequency initialFrequency) {
        if (((AchTransferIntentKey) INSTANCE.getExtras((Activity) this)).getUseScheduleAutomaticDepositV2()) {
            return (BaseFragment) ScheduleAutomaticDepositV2Fragment.INSTANCE.newInstance((Parcelable) new ScheduleAutomaticDepositV2Fragment.Args(isFromRhfOnboarding()));
        }
        return (BaseFragment) ScheduleAutomaticDepositFragment.INSTANCE.newInstance((Parcelable) new ScheduleAutomaticDepositFragment.Args(initialFrequency));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment.Callback, com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment.Callbacks
    public void onShowReviewScreen(DepositScheduleFlowArgs3 args) {
        Intrinsics.checkNotNullParameter(args, "args");
        replaceFragment(ReviewDepositScheduleFragment.INSTANCE.newInstance((Parcelable) new ReviewDepositScheduleFragment.Args(args)));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment.Callbacks
    public void onShowCreateAchRelationship() {
        setCurrentFragmentTransitionReason(TransitionReason.ACH_TRANSFER_REVIEW_NO_ACCOUNT);
        replaceFragment(CreateTransferAchRelationshipListFragment.INSTANCE.newInstance((Parcelable) new CreateTransferAchRelationshipListFragment.Args(getTransferContext().getDirection())));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment.Callbacks
    public void editDepositSchedule(DepositScheduleFlowArgs2 args) {
        Intrinsics.checkNotNullParameter(args, "args");
        setCurrentFragmentTransitionReason(TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT);
        replaceFragment(SetDepositScheduleFragment.INSTANCE.newInstance((Parcelable) new SetDepositScheduleFragment.Args(args)));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment.Callback
    public void onShowEnterAmount(DepositScheduleFlowArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        replaceFragment(EnterDepositScheduleAmountFragment.INSTANCE.newInstance(new EnterDepositScheduleAmountFragment.Args(getTransferContext(), args)));
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment.Callbacks
    public void onDepositScheduleSubmitted(DepositScheduleFlowArgs4 args) {
        Intrinsics.checkNotNullParameter(args, "args");
        replaceFragmentWithoutAnimation(DepositScheduleTimelineFragment.INSTANCE.newInstance((Parcelable) new DepositScheduleTimelineFragment.Args(args)));
    }

    /* compiled from: CreateAchTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferActivity;", "Lcom/robinhood/android/transfers/contracts/AchTransferIntentKey;", "<init>", "()V", "SET_AUTOMATIC_DEPOSIT_FROM_PROMPT", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateAchTransferActivity, AchTransferIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public AchTransferIntentKey getExtras(CreateAchTransferActivity createAchTransferActivity) {
            return (AchTransferIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createAchTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AchTransferIntentKey achTransferIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, achTransferIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, AchTransferIntentKey achTransferIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, achTransferIntentKey);
        }
    }
}
