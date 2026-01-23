package com.robinhood.android.options.simulatedreturn;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.home.contracts.HomeDashboardKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.options.contracts.OptionsSimulatedReturnFragmentKey;
import com.robinhood.android.options.contracts.OptionsSimulatedReturnInfoFragmentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: OptionsSimulatedReturnFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\t\u0010\u001e\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDuxo;", "getDuxo", "()Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onInfoIconClicked", "onTradebarHeightUpdated", "newHeight", "", "onToolbarMenuItemTapped", "underlyingFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onNavigateBack", "navigateToHome", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-simulated-return_externalDebug", "viewState", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionsSimulatedReturnDuxo.class);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11(OptionsSimulatedReturnFragment optionsSimulatedReturnFragment, int i, Composer composer, int i2) {
        optionsSimulatedReturnFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final OptionsSimulatedReturnDuxo getDuxo() {
        return (OptionsSimulatedReturnDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-69984917);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-69984917, i2, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment.ComposeContent (OptionsSimulatedReturnFragment.kt:36)");
            }
            OptionsSimulatedReturnViewState optionsSimulatedReturnViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSimulatedReturnFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
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
                objRememberedValue2 = new OptionsSimulatedReturnFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
            OptionsSimulatedReturnDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new OptionsSimulatedReturnFragment3(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function03 = (Function0) ((KFunction) objRememberedValue3);
            OptionsSimulatedReturnDuxo duxo2 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new OptionsSimulatedReturnFragment4(duxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function04 = (Function0) ((KFunction) objRememberedValue4);
            OptionsSimulatedReturnDuxo duxo3 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo3);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new OptionsSimulatedReturnFragment5(duxo3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function05 = (Function0) ((KFunction) objRememberedValue5);
            OptionsSimulatedReturnDuxo duxo4 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(duxo4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new OptionsSimulatedReturnFragment6(duxo4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new OptionsSimulatedReturnFragment7(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue7);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new OptionsSimulatedReturnFragment8(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function06 = (Function0) ((KFunction) objRememberedValue8);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new OptionsSimulatedReturnFragment9(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionsSimulatedReturnComposable.OptionsSimulatedReturn(optionsSimulatedReturnViewStateComposeContent$lambda$0, activityErrorHandler, function0, function02, function03, function04, function05, function1, function12, function06, (Function0) ((KFunction) objRememberedValue9), composerStartRestartGroup, ActivityErrorHandler.$stable << 3, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnFragment.ComposeContent$lambda$11(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(OptionsSimulatedReturnFragment optionsSimulatedReturnFragment) {
        optionsSimulatedReturnFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInfoIconClicked() {
        getDuxo().onInfoIconClicked();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new OptionsSimulatedReturnInfoFragmentKey(false), false, false, false, false, null, false, null, null, 1020, null);
    }

    public final void onTradebarHeightUpdated(int newHeight) {
        getDuxo().onTradebarHeightUpdated(newHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToolbarMenuItemTapped(FragmentKey underlyingFragmentKey) {
        getDuxo().onToolbarMenuItemTapped();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, underlyingFragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigateBack() {
        requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToHome() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInTab(HomeDashboardKey.INSTANCE, false, true, null, 8, null), null, false, 12, null);
        intentCreateIntent$default.addFlags(335544320);
        startActivity(intentCreateIntent$default);
    }

    private static final OptionsSimulatedReturnViewState ComposeContent$lambda$0(SnapshotState4<OptionsSimulatedReturnViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: OptionsSimulatedReturnFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment$Args;", "Landroid/os/Parcelable;", "key", "Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;)V", "getKey", "()Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionsSimulatedReturnFragmentKey key;

        /* compiled from: OptionsSimulatedReturnFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OptionsSimulatedReturnFragmentKey) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                optionsSimulatedReturnFragmentKey = args.key;
            }
            return args.copy(optionsSimulatedReturnFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionsSimulatedReturnFragmentKey getKey() {
            return this.key;
        }

        public final Args copy(OptionsSimulatedReturnFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Args(key);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.key, ((Args) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "Args(key=" + this.key + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.key, flags);
        }

        public Args(OptionsSimulatedReturnFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final OptionsSimulatedReturnFragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: OptionsSimulatedReturnFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment$Args;", "<init>", "()V", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionsSimulatedReturnFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionsSimulatedReturnFragment optionsSimulatedReturnFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionsSimulatedReturnFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsSimulatedReturnFragment newInstance(Args args) {
            return (OptionsSimulatedReturnFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsSimulatedReturnFragment optionsSimulatedReturnFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionsSimulatedReturnFragment, args);
        }
    }
}
