package com.robinhood.android.rhymigration.p245ui;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.model.UiRhyMigration;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoadingFragment;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoadingViewState2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RhyOnboardingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u000256B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\t\u0010/\u001a\u00020\u0013H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "<set-?>", "dialogShown", "getDialogShown", "setDialogShown", "(Z)V", "dialogShown$delegate", "Lkotlin/properties/ReadWriteProperty;", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBottomSheetDismissed", "id", "", "bind", "state", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingViewState;", "onLoadingError", "throwable", "", "onLoadingSuccess", "ui", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "isCmSunset", "showNotEligibleBottomSheet", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyOnboardingLoadingFragment extends GenericComposeFragment implements RegionGated, BaseBottomSheetDialogFragment.OnDismissListener {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyOnboardingLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyOnboardingLoadingFragment.class, "dialogShown", "getDialogShown()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RhyOnboardingLoadingDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RhyOnboardingLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: dialogShown$delegate, reason: from kotlin metadata */
    private final Interfaces3 dialogShown = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);

    /* compiled from: RhyOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Callbacks;", "", "onPrefetchSuccess", "", "rhyMigration", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "isCmSunset", "", "onPrefetchFailure", "throwable", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPrefetchFailure(Throwable throwable);

        void onPrefetchSuccess(UiRhyMigration rhyMigration, boolean isCmSunset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RhyOnboardingLoadingFragment rhyOnboardingLoadingFragment, int i, Composer composer, int i2) {
        rhyOnboardingLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final RhyOnboardingLoadingDuxo getDuxo() {
        return (RhyOnboardingLoadingDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final boolean getDialogShown() {
        return ((Boolean) this.dialogShown.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setDialogShown(boolean z) {
        this.dialogShown.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C275891(this));
    }

    /* compiled from: RhyOnboardingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment$onStart$1 */
    /* synthetic */ class C275891 extends FunctionReferenceImpl implements Function1<RhyOnboardingLoadingViewState, Unit> {
        C275891(Object obj) {
            super(1, obj, RhyOnboardingLoadingFragment.class, "bind", "bind(Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyOnboardingLoadingViewState rhyOnboardingLoadingViewState) {
            invoke2(rhyOnboardingLoadingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyOnboardingLoadingViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyOnboardingLoadingFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-475912036);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475912036, i, -1, "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment.ComposeContent (RhyOnboardingLoadingFragment.kt:50)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 0, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOnboardingLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost, com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RhyOnboardingLoadingViewState state) {
        RhyOnboardingLoadingViewState2 status = state.getStatus();
        if (!Intrinsics.areEqual(status, RhyOnboardingLoadingViewState2.Loading.INSTANCE)) {
            if (status instanceof RhyOnboardingLoadingViewState2.Error) {
                onLoadingError(((RhyOnboardingLoadingViewState2.Error) status).getThrowable());
            } else if (status instanceof RhyOnboardingLoadingViewState2.Success) {
                UiRhyMigration rhyMigration = ((RhyOnboardingLoadingViewState2.Success) status).getRhyMigration();
                Boolean boolIsInSunsetCm = state.isInSunsetCm();
                onLoadingSuccess(rhyMigration, boolIsInSunsetCm != null ? boolIsInSunsetCm.booleanValue() : false);
            } else {
                if (!(status instanceof RhyOnboardingLoadingViewState2.Ineligible)) {
                    throw new NoWhenBranchMatchedException();
                }
                showNotEligibleBottomSheet();
            }
        }
        if (Intrinsics.areEqual(state.isEligible(), Boolean.FALSE)) {
            showNotEligibleBottomSheet();
        }
    }

    private final void onLoadingError(Throwable throwable) {
        if (getDialogShown()) {
            return;
        }
        setDialogShown(true);
        getCallbacks().onPrefetchFailure(throwable);
    }

    private final void onLoadingSuccess(UiRhyMigration ui, boolean isCmSunset) {
        getCallbacks().onPrefetchSuccess(ui, isCmSunset);
    }

    private final void showNotEligibleBottomSheet() {
        if (getDialogShown()) {
            return;
        }
        setDialogShown(true);
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C27577R.id.dialog_rhy_ineligible, getString(C27577R.string.rhy_ineligible_bottom_sheet_title), null, getString(C27577R.string.rhy_ineligible_bottom_sheet_description), null, getString(C11048R.string.general_label_ok), null, null, null, false, false, null, null, 1, false, false, false, false, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_BottomSheetDialog), null, null, 1826772, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "rhy-ineligible-dialog");
    }

    /* compiled from: RhyOnboardingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhyOnboardingLoadingFragment newInstance() {
            return new RhyOnboardingLoadingFragment();
        }
    }
}
