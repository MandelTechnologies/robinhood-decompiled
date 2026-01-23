package com.robinhood.android.earlypay.toggle.p113ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.databinding.FragmentEarlyPayToggleBinding;
import com.robinhood.android.earlypay.toggle.p113ui.EarlyPayEnrollmentDialogFragment;
import com.robinhood.android.earlypay.toggle.p113ui.EarlyPayInfoDialogFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResources6;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EarlyPayToggleFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0002J\t\u0010\"\u001a\u00020\u001eH\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayToggleBinding;", "getBinding", "()Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayToggleBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleDuxo;", "getDuxo", "()Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onEarlyPayEnrollmentUpdateConfirmed", "enrolled", "", "onEarlyPayEnrollmentUpdateDismissed", "onEarlyPayLearnMoreClicked", "launchEnrollmentFlow", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPayToggleFragment extends BaseFragment implements RegionGated, EarlyPayEnrollmentDialogFragment.Callbacks, EarlyPayInfoDialogFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyPayToggleFragment.class, "binding", "getBinding()Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayToggleBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EarlyPayToggleFragment() {
        super(C14433R.layout.fragment_early_pay_toggle);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, EarlyPayToggleFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EarlyPayToggleDuxo.class);
    }

    private final FragmentEarlyPayToggleBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEarlyPayToggleBinding) value;
    }

    private final EarlyPayToggleDuxo getDuxo() {
        return (EarlyPayToggleDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final RdsToggleView rdsToggleView = getBinding().toggleView;
        rdsToggleView.onCheckedChanged(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleFragment.onViewCreated$lambda$4$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleFragment.onViewCreated$lambda$4$lambda$3(rdsToggleView, this, (EarlyPayToggleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$1(EarlyPayToggleFragment earlyPayToggleFragment, boolean z) {
        earlyPayToggleFragment.getDuxo().onEarlyPayEnrollmentChanged(z);
        EarlyPayEnrollmentDialogFragment.INSTANCE.showUpdateConfirmation(earlyPayToggleFragment, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(final RdsToggleView rdsToggleView, final EarlyPayToggleFragment earlyPayToggleFragment, final EarlyPayToggleViewState state) throws Resources.NotFoundException {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        rdsToggleView.setEnabled(state.isEnabled());
        rdsToggleView.setLoading(state.isLoading());
        Intrinsics.checkNotNull(rdsToggleView);
        rdsToggleView.setSecondaryText(StringResources6.getText(rdsToggleView, state.getSecondaryText()));
        rdsToggleView.onPrimaryTextClick(new Function0() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyPayToggleFragment.onViewCreated$lambda$4$lambda$3$lambda$2(rdsToggleView, state, earlyPayToggleFragment);
            }
        });
        rdsToggleView.setCheckedProgrammatically(state.getIsToggleChecked());
        UiEvent<Throwable> earlyPayEnrollmentError = state.getEarlyPayEnrollmentError();
        if (earlyPayEnrollmentError != null && (thConsume = earlyPayEnrollmentError.consume()) != null) {
            AbsErrorHandler.handleError$default(earlyPayToggleFragment.getActivityErrorHandler(), thConsume, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3$lambda$2(RdsToggleView rdsToggleView, EarlyPayToggleViewState earlyPayToggleViewState, EarlyPayToggleFragment earlyPayToggleFragment) {
        if (!rdsToggleView.isEnabled()) {
            return Unit.INSTANCE;
        }
        if (earlyPayToggleViewState.getIsToggleChecked()) {
            EarlyPayInfoDialogFragment.INSTANCE.show(earlyPayToggleFragment);
        } else {
            earlyPayToggleFragment.launchEnrollmentFlow();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.earlypay.toggle.ui.EarlyPayEnrollmentDialogFragment.Callbacks
    public void onEarlyPayEnrollmentUpdateConfirmed(boolean enrolled) {
        getDuxo().onEarlyPayEnrollmentChangeConfirmed(enrolled);
    }

    @Override // com.robinhood.android.earlypay.toggle.ui.EarlyPayEnrollmentDialogFragment.Callbacks
    public void onEarlyPayEnrollmentUpdateDismissed(boolean enrolled) {
        getDuxo().onEarlyPayEnrollmentChangeDismissed();
    }

    @Override // com.robinhood.android.earlypay.toggle.ui.EarlyPayInfoDialogFragment.Callbacks
    public void onEarlyPayLearnMoreClicked() {
        launchEnrollmentFlow();
    }

    private final void launchEnrollmentFlow() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.EarlyPayEnrollment(false, 1, null), null, false, null, null, 60, null);
    }

    /* compiled from: EarlyPayToggleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EarlyPayToggle;", "<init>", "()V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EarlyPayToggleFragment, LegacyFragmentKey.EarlyPayToggle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.EarlyPayToggle earlyPayToggle) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, earlyPayToggle);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.EarlyPayToggle getArgs(EarlyPayToggleFragment earlyPayToggleFragment) {
            return (LegacyFragmentKey.EarlyPayToggle) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, earlyPayToggleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EarlyPayToggleFragment newInstance(LegacyFragmentKey.EarlyPayToggle earlyPayToggle) {
            return (EarlyPayToggleFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, earlyPayToggle);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EarlyPayToggleFragment earlyPayToggleFragment, LegacyFragmentKey.EarlyPayToggle earlyPayToggle) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, earlyPayToggleFragment, earlyPayToggle);
        }
    }
}
