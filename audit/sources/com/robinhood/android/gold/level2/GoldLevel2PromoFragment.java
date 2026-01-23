package com.robinhood.android.gold.level2;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldLevel2PromoFragmentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.databinding.FragmentGoldLevel2PromoBinding;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: GoldLevel2PromoFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/level2/GoldLevel2PromoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/gold/upgrade/databinding/FragmentGoldLevel2PromoBinding;", "getBinding", "()Lcom/robinhood/android/gold/upgrade/databinding/FragmentGoldLevel2PromoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "navigateAndFinish", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldLevel2PromoFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldLevel2PromoFragment.class, "binding", "getBinding()Lcom/robinhood/android/gold/upgrade/databinding/FragmentGoldLevel2PromoBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldLevel2PromoFragment() {
        super(C18003R.layout.fragment_gold_level_2_promo);
        this.binding = ViewBinding5.viewBinding(this, GoldLevel2PromoFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    private final FragmentGoldLevel2PromoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentGoldLevel2PromoBinding) value;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "MarginUpgrade24kgLevel2Fragment";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setUseDesignSystemTheme(true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay(GoldOverlay.INSTANCE, Boolean.FALSE);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getScarletManager().removeOverlay(GoldOverlay.INSTANCE.getPriority(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(8);
        ImageView previewImg = getBinding().previewImg;
        Intrinsics.checkNotNullExpressionValue(previewImg, "previewImg");
        previewImg.setVisibility(0);
        RhTextView titleTxt = getBinding().titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        titleTxt.setVisibility(0);
        RhTextView summaryTxt = getBinding().summaryTxt;
        Intrinsics.checkNotNullExpressionValue(summaryTxt, "summaryTxt");
        summaryTxt.setVisibility(0);
        SparkleButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        continueBtn.setVisibility(0);
        RhTextView summaryTxt2 = getBinding().summaryTxt;
        Intrinsics.checkNotNullExpressionValue(summaryTxt2, "summaryTxt");
        TextViewsKt.setTextWithLearnMore$default((TextView) summaryTxt2, C18003R.string.gold_level_2_promo_detail, "robinhood://24k_gold_reference_manual/?page=level-2&hide_main=true", false, false, 0, 28, (Object) null);
        SparkleButton continueBtn2 = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        OnClickListeners.onClick(continueBtn2, new Function0() { // from class: com.robinhood.android.gold.level2.GoldLevel2PromoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldLevel2PromoFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(GoldLevel2PromoFragment goldLevel2PromoFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(goldLevel2PromoFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_GOLD_LEVEL_TWO_MARKET_DATA_UPSELL, "continue", null, null, null, null, null, goldLevel2PromoFragment.getScreenDescription(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        goldLevel2PromoFragment.navigateAndFinish();
        return Unit.INSTANCE;
    }

    private final void navigateAndFinish() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldUpgradeIntentKey("stock_detail_l2_button", GoldFeature.LEVEL2, null, null, null, false, 60, null), null, false, null, null, 60, null);
        requireBaseActivity().finish();
    }

    /* compiled from: GoldLevel2PromoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/level2/GoldLevel2PromoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/gold/level2/GoldLevel2PromoFragment;", "Lcom/robinhood/android/gold/contracts/GoldLevel2PromoFragmentKey;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<GoldLevel2PromoFragment, GoldLevel2PromoFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldLevel2PromoFragmentKey goldLevel2PromoFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, goldLevel2PromoFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((GoldLevel2PromoFragment) fragment);
        }

        public Void getArgs(GoldLevel2PromoFragment goldLevel2PromoFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, goldLevel2PromoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldLevel2PromoFragment newInstance() {
            return (GoldLevel2PromoFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldLevel2PromoFragment newInstance(Void r1) {
            return (GoldLevel2PromoFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
