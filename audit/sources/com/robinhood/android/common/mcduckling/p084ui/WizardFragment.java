package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import android.os.Bundle;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.mcduckling.p084ui.WizardNavBar;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WizardFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0004J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016J\t\u0010+\u001a\u00020\u0007H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar$Callbacks;", "contentLayoutId", "", "navBarIsSharedElement", "", "<init>", "(IZ)V", "(I)V", "getContentLayoutId", "()I", "animateToolbarVisibility", "getAnimateToolbarVisibility", "()Z", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navBar", "Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar;", "getNavBar", "()Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar;", "showProgressBar", "", "show", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onBackButtonClick", "onContinueButtonClick", "addSharedElements", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class WizardFragment extends BaseFragment implements RegionGated, WizardNavBar.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WizardFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", 0))};
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final boolean animateToolbarVisibility;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int contentLayoutId;
    private final boolean navBarIsSharedElement;

    /* compiled from: WizardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WizardFragment$Callbacks;", "", "showLoading", "", "show", "", "showProgressBar", "onResumeFragment", "fragment", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onResumeFragment(WizardFragment fragment);

        void showLoading(boolean show);

        void showProgressBar(boolean show);
    }

    protected WizardNavBar getNavBar() {
        return null;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardNavBar.Callbacks
    public void onContinueButtonClick() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final int getContentLayoutId() {
        return this.contentLayoutId;
    }

    public WizardFragment(int i, boolean z) {
        super(i);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.contentLayoutId = i;
        this.navBarIsSharedElement = z;
        SimpleSlide simpleSlide = new SimpleSlide(8388613);
        Interpolators interpolators = Interpolators.INSTANCE;
        simpleSlide.setInterpolator(interpolators.getFastOutSlowIn());
        setEnterTransition(simpleSlide);
        SimpleSlide simpleSlide2 = new SimpleSlide(8388611);
        simpleSlide2.setInterpolator(interpolators.getFastOutSlowIn());
        setExitTransition(simpleSlide2);
        setSharedElementEnterTransition(new TransitionSet());
        setSharedElementReturnTransition(new TransitionSet());
        this.animateToolbarVisibility = true;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.WizardFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof WizardFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public WizardFragment(int i) {
        this(i, true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getAnimateToolbarVisibility() {
        return this.animateToolbarVisibility;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    protected final void showProgressBar(boolean show) {
        getCallbacks().showProgressBar(show);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WizardNavBar navBar = getNavBar();
        if (navBar != null) {
            navBar.setCallbacks(this);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getCallbacks().onResumeFragment(this);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WizardNavBar.Callbacks
    public void onBackButtonClick() {
        requireActivity().onBackPressed();
    }

    public void addSharedElements(FragmentTransaction fragmentTransaction) {
        WizardNavBar navBar;
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        if (this.navBarIsSharedElement && (navBar = getNavBar()) != null) {
            fragmentTransaction.addSharedElement(navBar, navBar.getTransitionName());
        }
    }
}
