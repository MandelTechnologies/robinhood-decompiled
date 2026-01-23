package com.robinhood.android.advisory.onboarding.outro;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.advisory.contracts.AdvisoryPostAgreementsKey;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsEvent;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.Retirement401kRollover;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryPostAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0002J\t\u0010(\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u000102X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCloseClicked", "onRefreshClicked", "onSwipeToSubmit", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "config", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "onCelebrationCtaClicked", "destination", "Lcom/robinhood/android/navigation/keys/IntentKey;", "handleEvent", "event", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPostAgreementsFragment extends GenericComposeFragment implements RegionGated, AdvisoryPostAgreementsScreen {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdvisoryPostAgreementsDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(AdvisoryPostAgreementsFragment advisoryPostAgreementsFragment, int i, Composer composer, int i2) {
        advisoryPostAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final AdvisoryPostAgreementsDuxo getDuxo() {
        return (AdvisoryPostAgreementsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1401887358);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1401887358, i2, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsFragment.ComposeContent (AdvisoryPostAgreementsFragment.kt:41)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AdvisoryPostAgreementsScreen2.AdvisoryPostAgreementsScreen(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            Event<AdvisoryPostAgreementsEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i2 & 14) == 4) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AdvisoryPostAgreementsFragment2(this, snapshotState4CollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(eventComposeContent$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPostAgreementsFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
    public void onCloseClicked() {
        requireBaseActivity().finish();
    }

    @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
    public void onRefreshClicked() {
        getDuxo().retry();
    }

    @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
    public void onSwipeToSubmit(TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer config) {
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(config, "config");
        getDuxo().submitFirstDeposit(sinkAccount, config);
    }

    @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
    public void onCelebrationCtaClicked(IntentKey destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, destination, null, false, null, null, 60, null);
    }

    private static final AdvisoryPostAgreementsViewState ComposeContent$lambda$0(SnapshotState4<? extends AdvisoryPostAgreementsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<AdvisoryPostAgreementsEvent> ComposeContent$lambda$1(SnapshotState4<Event<AdvisoryPostAgreementsEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AdvisoryPostAgreementsEvent event) {
        if (event instanceof AdvisoryPostAgreementsEvent.AccountLoadedButLostTransferConfig) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Somehow lost transfer config for newly created advisory account."), true, null, 4, null);
            requireBaseActivity().onBackPressed();
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.DepositConfigurationInvalid) {
            ((AdvisoryPostAgreementsEvent.DepositConfigurationInvalid) event).getError().showAlert(requireBaseActivity(), getEventLogger());
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.DepositSubmissionFailed) {
            AbsErrorHandler.handleError$default(requireBaseActivity().getActivityErrorHandler(), ((AdvisoryPostAgreementsEvent.DepositSubmissionFailed) event).getError(), false, 2, null);
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.FirstDepositPostTransfer) {
            requireBaseActivity().finish();
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new TransferSuccessKey(((AdvisoryPostAgreementsEvent.FirstDepositPostTransfer) event).getPostTransferFlow(), MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.GoToManagedDashboard) {
            requireBaseActivity().finish();
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, ((AdvisoryPostAgreementsEvent.GoToManagedDashboard) event).getDestination(), null, false, null, null, 60, null);
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.GoToAcats) {
            requireBaseActivity().finish();
            Navigator navigator3 = getNavigator();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            String source = ((AdvisoryPostAgreementsKey) INSTANCE.getArgs((Fragment) this)).getSource();
            Navigator.DefaultImpls.startActivity$default(navigator3, contextRequireContext3, new AcatsIn(source == null ? "" : source, false, false, ((AdvisoryPostAgreementsEvent.GoToAcats) event).getAccountNumber(), false, 22, null), null, false, null, null, 60, null);
            return;
        }
        if (event instanceof AdvisoryPostAgreementsEvent.GoToInternalAssetTransfers) {
            requireBaseActivity().finish();
            Navigator navigator4 = getNavigator();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            Companion companion = INSTANCE;
            String source2 = ((AdvisoryPostAgreementsKey) companion.getArgs((Fragment) this)).getSource();
            Navigator.DefaultImpls.startActivity$default(navigator4, contextRequireContext4, new InternalAssetTransfer(source2 == null ? "" : source2, true, ((AdvisoryPostAgreementsKey) companion.getArgs((Fragment) this)).getBrokerageAccountType(), null, 8, null), null, false, null, null, 60, null);
            return;
        }
        if (!(event instanceof AdvisoryPostAgreementsEvent.GoToRollover)) {
            throw new NoWhenBranchMatchedException();
        }
        requireBaseActivity().finish();
        Navigator navigator5 = getNavigator();
        Context contextRequireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
        Retirement401kRollover.Step.Education education = Retirement401kRollover.Step.Education.INSTANCE;
        String source3 = ((AdvisoryPostAgreementsKey) INSTANCE.getArgs((Fragment) this)).getSource();
        Navigator.DefaultImpls.startActivity$default(navigator5, contextRequireContext5, new Retirement401kRollover(education, source3 != null ? source3 : "", true), null, false, null, null, 60, null);
    }

    /* compiled from: AdvisoryPostAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryPostAgreementsKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AdvisoryPostAgreementsFragment, AdvisoryPostAgreementsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryPostAgreementsKey advisoryPostAgreementsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryPostAgreementsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryPostAgreementsKey getArgs(AdvisoryPostAgreementsFragment advisoryPostAgreementsFragment) {
            return (AdvisoryPostAgreementsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, advisoryPostAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryPostAgreementsFragment newInstance(AdvisoryPostAgreementsKey advisoryPostAgreementsKey) {
            return (AdvisoryPostAgreementsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryPostAgreementsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryPostAgreementsFragment advisoryPostAgreementsFragment, AdvisoryPostAgreementsKey advisoryPostAgreementsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, advisoryPostAgreementsFragment, advisoryPostAgreementsKey);
        }
    }
}
