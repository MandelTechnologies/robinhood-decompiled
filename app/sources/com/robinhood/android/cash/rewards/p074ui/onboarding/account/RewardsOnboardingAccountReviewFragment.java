package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOnboardingAccountReviewBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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

/* compiled from: RewardsOnboardingAccountReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u001bH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountReviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingAccountReviewBinding;", "getBindings", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingAccountReviewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingAccountReviewFragment extends BaseFragment implements RegionGated {
    private static final String ROUNDUP_REWARDS_ACCOUNT_REVIEW = "roundup/onboarding_brokerage_account_review";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingAccountReviewFragment.class, "bindings", "getBindings()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingAccountReviewBinding;", 0))};

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

    public RewardsOnboardingAccountReviewFragment() {
        super(C10176R.layout.fragment_rewards_onboarding_account_review);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, RewardsOnboardingAccountReviewFragment2.INSTANCE);
    }

    private final FragmentRewardsOnboardingAccountReviewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsOnboardingAccountReviewBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireBaseActivity().showCloseIcon();
        ImageLoader imageLoader = getImageLoader();
        ImageDensityUrl imageDensityUrl = new ImageDensityUrl(ROUNDUP_REWARDS_ACCOUNT_REVIEW, null, 2, 0 == true ? 1 : 0);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(imageDensityUrl.getImageDensityUrl(ContextsUiExtensions.getDensitySpec(contextRequireContext)));
        ImageView rewardsOnboardingAccountReviewIllustration = getBindings().rewardsOnboardingAccountReviewIllustration;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingAccountReviewIllustration, "rewardsOnboardingAccountReviewIllustration");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, rewardsOnboardingAccountReviewIllustration, null, null, 6, null);
        RdsButton rewardsOnboardingAccountReviewDoneButton = getBindings().rewardsOnboardingAccountReviewDoneButton;
        Intrinsics.checkNotNullExpressionValue(rewardsOnboardingAccountReviewDoneButton, "rewardsOnboardingAccountReviewDoneButton");
        OnClickListeners.onClick(rewardsOnboardingAccountReviewDoneButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.account.RewardsOnboardingAccountReviewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOnboardingAccountReviewFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RewardsOnboardingAccountReviewFragment rewardsOnboardingAccountReviewFragment) {
        Navigator navigator = rewardsOnboardingAccountReviewFragment.getNavigator();
        Context contextRequireContext = rewardsOnboardingAccountReviewFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, 12, null);
        intentCreateIntent$default.addFlags(131072);
        rewardsOnboardingAccountReviewFragment.startActivity(intentCreateIntent$default);
        rewardsOnboardingAccountReviewFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: RewardsOnboardingAccountReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountReviewFragment$Companion;", "", "<init>", "()V", "ROUNDUP_REWARDS_ACCOUNT_REVIEW", "", "newInstance", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountReviewFragment;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RewardsOnboardingAccountReviewFragment newInstance() {
            return new RewardsOnboardingAccountReviewFragment();
        }
    }
}
