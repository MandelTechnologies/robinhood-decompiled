package com.robinhood.android.options.statistics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lists.options.OptionsListsQuickAddFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStatisticsFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\r\u0010\u001e\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0014H\u0016J\t\u0010!\u001a\u00020\u0014H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "getDuxo", "()Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "optionsListsQuickAddFragment", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "getOptionsListsQuickAddFragment", "()Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "optionOrderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStatisticsFragment extends GenericComposeFragment implements RegionGated {
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionStatisticsDuxo.class);
    private final ActivityResultLauncher<Intent> optionOrderLauncher;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionStatisticsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionStatisticsLaunchMode.values().length];
            try {
                iArr[OptionStatisticsLaunchMode.NORMAL_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStatisticsLaunchMode.STRATEGY_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStatisticsLaunchMode.ROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStatisticsLaunchMode.INFO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionWatchlistItemState.values().length];
            try {
                iArr2[OptionWatchlistItemState.NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionWatchlistItemState.ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionWatchlistItemState.NOT_ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(OptionStatisticsFragment optionStatisticsFragment, int i, Composer composer, int i2) {
        optionStatisticsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public OptionStatisticsFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.options.statistics.OptionStatisticsFragment$optionOrderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    fragmentActivityRequireActivity.setResult(-1);
                    fragmentActivityRequireActivity.finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.optionOrderLauncher = activityResultLauncherRegisterForActivityResult;
        this.useDesignSystemToolbar = true;
    }

    private final OptionStatisticsDuxo getDuxo() {
        return (OptionStatisticsDuxo) this.duxo.getValue();
    }

    private final OptionsListsQuickAddFragment getOptionsListsQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.lists.options.OptionsListsQuickAddFragment");
        return (OptionsListsQuickAddFragment) fragmentFindFragmentByTag;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setBackgroundColor(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add((OptionsListsQuickAddFragment) OptionsListsQuickAddFragment.INSTANCE.newInstance((Parcelable) new OptionsListsQuickAddFragment.Args(new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null))), "quickAddFragment").commit();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1437756872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1437756872, i2, -1, "com.robinhood.android.options.statistics.OptionStatisticsFragment.ComposeContent (OptionStatisticsFragment.kt:71)");
            }
            OptionStatisticsDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionStatisticsFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionStatisticsFragment.ComposeContent$lambda$3$lambda$2(this.f$0, (OptionWatchlistItemState) obj, (OptionStrategySecurity) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionStatisticsComposable.OptionStatisticsComposable(duxo, function0, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionStatisticsFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(OptionStatisticsFragment optionStatisticsFragment) {
        Companion companion = INSTANCE;
        OptionStatisticsTradableState tradableState = ((Args) companion.getArgs((Fragment) optionStatisticsFragment)).getStatisticFragmentKey().getTradableState();
        if (Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.NotAvailable.INSTANCE)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("There should not be a trade button."), true, null, 4, null);
        } else if (Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.NotTradable.INSTANCE)) {
            optionStatisticsFragment.requireActivity().finish();
        } else {
            if (!(tradableState instanceof OptionStatisticsTradableState.MultipleChainsSelected) && !Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.OppositeLegSelected.INSTANCE) && !Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.Tradable.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) optionStatisticsFragment)).getStatisticFragmentKey().getLaunchMode().ordinal()];
            if (i == 1 || i == 2) {
                optionStatisticsFragment.getDuxo().logTrade();
                OptionOrderIntentKey optionOrderIntentKey = ((Args) companion.getArgs((Fragment) optionStatisticsFragment)).getStatisticFragmentKey().getOptionOrderIntentKey();
                if (optionOrderIntentKey == null) {
                    return Unit.INSTANCE;
                }
                Navigator navigator = optionStatisticsFragment.getNavigator();
                Context contextRequireContext = optionStatisticsFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                optionStatisticsFragment.optionOrderLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, optionOrderIntentKey, null, false, 12, null));
            } else if (i == 3) {
                optionStatisticsFragment.requireActivity().setResult(-1, OptionChainLaunchMode.SingleLegAction.Roll.INSTANCE.getResultData(((Args) companion.getArgs((Fragment) optionStatisticsFragment)).getStatisticFragmentKey().getOptionLegBundle().getOptionInstrument()));
                optionStatisticsFragment.requireActivity().finish();
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(OptionStatisticsFragment optionStatisticsFragment, OptionWatchlistItemState watchlistState, OptionStrategySecurity optionStrategySecurity) {
        Intrinsics.checkNotNullParameter(watchlistState, "watchlistState");
        if (optionStrategySecurity == null) {
            return Unit.INSTANCE;
        }
        Screen screen = new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null);
        int i = WhenMappings.$EnumSwitchMapping$1[watchlistState.ordinal()];
        if (i == 1) {
            return Unit.INSTANCE;
        }
        if (i == 2) {
            OptionsListsQuickAddFragment.removeFromOptionsWatchlist$default(optionStatisticsFragment.getOptionsListsQuickAddFragment(), optionStrategySecurity, screen, null, 4, null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            OptionsListsQuickAddFragment.addToOptionsWatchlist$default(optionStatisticsFragment.getOptionsListsQuickAddFragment(), optionStrategySecurity, screen, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().logSwipeDismiss();
        return super.onBackPressed();
    }

    /* compiled from: OptionStatisticsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsFragment$Args;", "Landroid/os/Parcelable;", "statisticFragmentKey", "Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;)V", "getStatisticFragmentKey", "()Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionStatisticsFragmentKey statisticFragmentKey;

        /* compiled from: OptionStatisticsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OptionStatisticsFragmentKey) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionStatisticsFragmentKey optionStatisticsFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                optionStatisticsFragmentKey = args.statisticFragmentKey;
            }
            return args.copy(optionStatisticsFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStatisticsFragmentKey getStatisticFragmentKey() {
            return this.statisticFragmentKey;
        }

        public final Args copy(OptionStatisticsFragmentKey statisticFragmentKey) {
            Intrinsics.checkNotNullParameter(statisticFragmentKey, "statisticFragmentKey");
            return new Args(statisticFragmentKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.statisticFragmentKey, ((Args) other).statisticFragmentKey);
        }

        public int hashCode() {
            return this.statisticFragmentKey.hashCode();
        }

        public String toString() {
            return "Args(statisticFragmentKey=" + this.statisticFragmentKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.statisticFragmentKey, flags);
        }

        public Args(OptionStatisticsFragmentKey statisticFragmentKey) {
            Intrinsics.checkNotNullParameter(statisticFragmentKey, "statisticFragmentKey");
            this.statisticFragmentKey = statisticFragmentKey;
        }

        public final OptionStatisticsFragmentKey getStatisticFragmentKey() {
            return this.statisticFragmentKey;
        }
    }

    /* compiled from: OptionStatisticsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/options/statistics/OptionStatisticsFragment;", "Lcom/robinhood/android/options/statistics/OptionStatisticsFragment$Args;", "<init>", "()V", "QUICK_ADD_TAG", "", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionStatisticsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionStatisticsFragment optionStatisticsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionStatisticsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionStatisticsFragment newInstance(Args args) {
            return (OptionStatisticsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionStatisticsFragment optionStatisticsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionStatisticsFragment, args);
        }
    }
}
