package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.settings.limits.MatchaLimitsViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.social.contracts.MatchaLimitsFragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: MatchaLimitsFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showInfoSheet", "title", "", "description", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug", "viewState", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MatchaLimitsFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaLimitsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(MatchaLimitsFragment matchaLimitsFragment, int i, Composer composer, int i2) throws Throwable {
        matchaLimitsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final MatchaLimitsDuxo getDuxo() {
        return (MatchaLimitsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1007871767);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1007871767, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsFragment.ComposeContent (MatchaLimitsFragment.kt:29)");
            }
            MatchaLimitsViewState matchaLimitsViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (matchaLimitsViewStateComposeContent$lambda$0 instanceof MatchaLimitsViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-608341117);
                MatchaLimitsViewState.Loaded loaded = (MatchaLimitsViewState.Loaded) matchaLimitsViewStateComposeContent$lambda$0;
                String weeklySendLimit = loaded.getWeeklySendLimit();
                int weeklyTransactionsLimit = loaded.getWeeklyTransactionsLimit();
                String minTransactionAmount = loaded.getMinTransactionAmount();
                String instantTransferFee = loaded.getInstantTransferFee();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MatchaLimitsFragment4(this);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                MatchaLimitsComposable.MatchaLimits(weeklySendLimit, weeklyTransactionsLimit, minTransactionAmount, instantTransferFee, (Function2) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (matchaLimitsViewStateComposeContent$lambda$0 instanceof MatchaLimitsViewState.Error) {
                composerStartRestartGroup.startReplaceGroup(-2097820196);
                composerStartRestartGroup.endReplaceGroup();
                getActivityErrorHandler().invoke2(((MatchaLimitsViewState.Error) matchaLimitsViewStateComposeContent$lambda$0).getThrowable());
            } else {
                if (!(matchaLimitsViewStateComposeContent$lambda$0 instanceof MatchaLimitsViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-2097835679);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-607817434);
                LocalShowPlaceholder.Loadable(true, null, null, MatchaLimitsFragment2.INSTANCE.m11699getLambda$1150031417$feature_cash_rhy_tab_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaLimitsFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C10285R.string.matcha_limits_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInfoSheet(int title, int description) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, getString(title), null, getString(description), null, getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, true, false, false, null, null, null, 2064341, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "limit-info-sheet");
    }

    /* compiled from: MatchaLimitsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/social/contracts/MatchaLimitsFragmentKey;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsFragment;", "key", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<MatchaLimitsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public MatchaLimitsFragment createFragment(MatchaLimitsFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new MatchaLimitsFragment();
        }
    }

    private static final MatchaLimitsViewState ComposeContent$lambda$0(SnapshotState4<? extends MatchaLimitsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
