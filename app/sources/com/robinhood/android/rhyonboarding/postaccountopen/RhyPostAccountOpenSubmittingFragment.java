package com.robinhood.android.rhyonboarding.postaccountopen;

import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.C27634R;
import com.robinhood.android.rhyonboarding.databinding.FragmentRhyPostAccountOpenSubmittingBinding;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyPostAccountOpenSubmittingFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenSubmittingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenSubmittingBinding;", "getBindings", "()Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenSubmittingBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyPostAccountOpenSubmittingFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyPostAccountOpenSubmittingFragment.class, "bindings", "getBindings()Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenSubmittingBinding;", 0))};
    public static final int $stable = 8;
    private static final LottieUrl APPLICATION_SUBMITTING_LOTTIE = LottieUrl.SUPPORT_CALL_WAITING;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyPostAccountOpenSubmittingFragment() {
        super(C27634R.layout.fragment_rhy_post_account_open_submitting);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, RhyPostAccountOpenSubmittingFragment2.INSTANCE);
    }

    private final FragmentRhyPostAccountOpenSubmittingBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyPostAccountOpenSubmittingBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LottieAnimationView rewardsOnboardingApplicationSubmittingAnimation = getBindings().rewardsOnboardingApplicationSubmittingAnimation;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingApplicationSubmittingAnimation, "rewardsOnboardingApplicationSubmittingAnimation");
        LottieAnimationViewsKt.setRemoteUrl(rewardsOnboardingApplicationSubmittingAnimation, APPLICATION_SUBMITTING_LOTTIE);
    }
}
