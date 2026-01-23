package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.wizard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WizardActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\t\u0010\u0015\u001a\u00020\u000fH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/wizard/WizardActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", "<init>", "()V", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "showLoading", "", "show", "", "onResumeFragment", "fragment", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "setFragment", "proceed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public class WizardActivity extends BaseActivity implements RegionGated, WizardFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WizardActivity.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0))};
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardFragment.Callbacks
    public void onResumeFragment(WizardFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    public WizardActivity() {
        super(C10285R.layout.activity_wizard);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.loadingView = bindView(C10285R.id.loading_view);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardFragment.Callbacks
    public final void showLoading(boolean show) {
        getLoadingView().setVisibility(show ? 0 : 4);
    }

    protected final void setFragment(WizardFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setFragment(C10285R.id.fragment_container, fragment);
    }

    protected final void proceed(WizardFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Fragment currentFragment = getCurrentFragment();
        Intrinsics.checkNotNull(currentFragment, "null cannot be cast to non-null type com.robinhood.android.common.mcduckling.ui.WizardFragment");
        new ReplaceFragmentBuilder(fragment).setUseDefaultAnimation(false).setModifier(new C104201((WizardFragment) currentFragment)).buildAndExecute(this);
    }

    /* compiled from: WizardActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.wizard.WizardActivity$proceed$1 */
    /* synthetic */ class C104201 extends FunctionReferenceImpl implements Function1<FragmentTransaction, Unit> {
        C104201(Object obj) {
            super(1, obj, WizardFragment.class, "addSharedElements", "addSharedElements(Landroidx/fragment/app/FragmentTransaction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FragmentTransaction fragmentTransaction) {
            invoke2(fragmentTransaction);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FragmentTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((WizardFragment) this.receiver).addSharedElements(p0);
        }
    }
}
