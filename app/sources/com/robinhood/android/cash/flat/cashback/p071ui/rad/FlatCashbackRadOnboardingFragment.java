package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.FlatCashbackLoadableComposable;
import com.robinhood.android.cash.flat.cashback.p071ui.rad.FlatCashbackRadOnboardingFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferContract;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: FlatCashbackRadOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\r\u0010&\u001a\u00020 H\u0017¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\u000bH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \u0018*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/²\u0006\u0010\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "callbacks", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "transferLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/Transfer;", "kotlin.jvm.PlatformType", "duxo", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "feature-cash-flat-cashback_externalDebug", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackRadOnboardingFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FlatCashbackRadOnboardingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> transferLauncher;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: FlatCashbackRadOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment$Callbacks;", "", "onRecurringDepositSuccess", "", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRecurringDepositSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(FlatCashbackRadOnboardingFragment flatCashbackRadOnboardingFragment, int i, Composer composer, int i2) {
        flatCashbackRadOnboardingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public FlatCashbackRadOnboardingFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TransferContract(new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$transferLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    this.this$0.getCallbacks().onRecurringDepositSuccess();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transferLauncher = activityResultLauncherRegisterForActivityResult;
        this.duxo = DuxosKt.duxo(this, FlatCashbackRadOnboardingDuxo.class);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FlatCashbackRadOnboardingDuxo getDuxo() {
        return (FlatCashbackRadOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1510389152);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1510389152, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment.ComposeContent (FlatCashbackRadOnboardingFragment.kt:57)");
            }
            BaseFlatCashbackViewState<FlatCashbackRadOnboardingViewState> baseFlatCashbackViewStateComposeContent$lambda$2 = ComposeContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            FlatCashbackRadOnboardingDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FlatCashbackRadOnboardingFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FlatCashbackLoadableComposable.FlatCashbackLoadableComposable(baseFlatCashbackViewStateComposeContent$lambda$2, (Function0) ((KFunction) objRememberedValue), null, ComposableLambda3.rememberComposableLambda(568596287, true, new C101102(), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlatCashbackRadOnboardingFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FlatCashbackRadOnboardingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$ComposeContent$2 */
    static final class C101102 implements Function3<FlatCashbackRadOnboardingViewState, Composer, Integer, Unit> {
        C101102() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState, Composer composer, Integer num) {
            invoke(flatCashbackRadOnboardingViewState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final FlatCashbackRadOnboardingViewState loadedViewState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(loadedViewState, "loadedViewState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(568596287, i, -1, "com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment.ComposeContent.<anonymous> (FlatCashbackRadOnboardingFragment.kt:63)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(loadedViewState) | composer.changedInstance(FlatCashbackRadOnboardingFragment.this);
            final FlatCashbackRadOnboardingFragment flatCashbackRadOnboardingFragment = FlatCashbackRadOnboardingFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackRadOnboardingFragment.C101102.invoke$lambda$2$lambda$1(loadedViewState, flatCashbackRadOnboardingFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RadOnboardingComposable.RadOnboardingComposable((Function0) objRememberedValue, loadedViewState, composer, (i << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState, FlatCashbackRadOnboardingFragment flatCashbackRadOnboardingFragment) {
            Transfer transfer = flatCashbackRadOnboardingViewState.getTransfer();
            if (transfer != null) {
                NavigationActivityResultContract3.launch$default(flatCashbackRadOnboardingFragment.transferLauncher, transfer, null, false, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final BaseFlatCashbackViewState<FlatCashbackRadOnboardingViewState> ComposeContent$lambda$2(SnapshotState4<? extends BaseFlatCashbackViewState<FlatCashbackRadOnboardingViewState>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
