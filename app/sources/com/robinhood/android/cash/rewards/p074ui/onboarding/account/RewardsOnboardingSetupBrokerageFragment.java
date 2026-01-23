package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOnboardingSetupBrokerageBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsOnboardingSetupBrokerageFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingSetupBrokerageFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingSetupBrokerageBinding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingSetupBrokerageBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onStart", "", "onStop", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingSetupBrokerageFragment extends BaseFragment implements RegionGated {
    private static final String ROUNDUP_REWARDS_SETUP_BROKERAGE = "roundup/onboarding_setup_brokerage";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingSetupBrokerageFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingSetupBrokerageBinding;", 0))};

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

    public RewardsOnboardingSetupBrokerageFragment() {
        super(C10176R.layout.fragment_rewards_onboarding_setup_brokerage);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RewardsOnboardingSetupBrokerageFragment2.INSTANCE);
    }

    private final FragmentRewardsOnboardingSetupBrokerageBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsOnboardingSetupBrokerageBinding) value;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ImageLoader imageLoader = getImageLoader();
        ImageDensityUrl imageDensityUrl = new ImageDensityUrl(ROUNDUP_REWARDS_SETUP_BROKERAGE, null, 2, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(imageDensityUrl.getImageDensityUrl(ContextsUiExtensions.getDensitySpec(contextRequireContext)));
        ImageView rewardsOnboardingSetupBrokerageImage = getBinding().rewardsOnboardingSetupBrokerageImage;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingSetupBrokerageImage, "rewardsOnboardingSetupBrokerageImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, rewardsOnboardingSetupBrokerageImage, null, null, 6, null);
        RdsButton rewardsOnboardingSetupBrokerageButton = getBinding().rewardsOnboardingSetupBrokerageButton;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingSetupBrokerageButton, "rewardsOnboardingSetupBrokerageButton");
        OnClickListeners.onClick(rewardsOnboardingSetupBrokerageButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.account.RewardsOnboardingSetupBrokerageFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOnboardingSetupBrokerageFragment.onStart$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RewardsOnboardingSetupBrokerageFragment rewardsOnboardingSetupBrokerageFragment) {
        Navigator navigator = rewardsOnboardingSetupBrokerageFragment.getNavigator();
        Context contextRequireContext = rewardsOnboardingSetupBrokerageFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey("rhf_upgrade", false, null, Uri.parse(DeepLinkPath.ROUNDUP_MAX_ONBOARDING_EXIT.getUri()), null, null, false, null, null, HttpStatusCode.BAD_GATEWAY_502, null), null, false, null, null, 60, null);
        rewardsOnboardingSetupBrokerageFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ImageLoader imageLoader = getImageLoader();
        ImageView rewardsOnboardingSetupBrokerageImage = getBinding().rewardsOnboardingSetupBrokerageImage;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingSetupBrokerageImage, "rewardsOnboardingSetupBrokerageImage");
        imageLoader.cancelRequest(rewardsOnboardingSetupBrokerageImage);
    }

    /* compiled from: RewardsOnboardingSetupBrokerageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingSetupBrokerageFragment$Companion;", "", "<init>", "()V", "ROUNDUP_REWARDS_SETUP_BROKERAGE", "", "newInstance", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingSetupBrokerageFragment;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RewardsOnboardingSetupBrokerageFragment newInstance() {
            return new RewardsOnboardingSetupBrokerageFragment();
        }
    }
}
