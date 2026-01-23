package com.robinhood.android.common.margin.p083ui.limit;

import android.R;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.databinding.FragmentMarginUpgradeMarginLimitBinding;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment;
import com.robinhood.android.common.margin.p083ui.toolbar.RhToolbarUtil;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginUpgradeMarginLimitFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitFragment;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/margin/databinding/FragmentMarginUpgradeMarginLimitBinding;", "getBinding", "()Lcom/robinhood/android/common/margin/databinding/FragmentMarginUpgradeMarginLimitBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "setLimitBtn", "Landroid/widget/TextView;", "getSetLimitBtn", "()Landroid/widget/TextView;", "removeLimitBtn", "Landroid/view/View;", "getRemoveLimitBtn", "()Landroid/view/View;", "confirmBtn", "getConfirmBtn", "marginBuyingPowerTxt", "getMarginBuyingPowerTxt", "totalTxt", "getTotalTxt", "disclosureTxt", "getDisclosureTxt", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MarginUpgradeMarginLimitFragment extends BaseMarginUpgradeMarginLimitFragment {
    private static final SelectorResource<Drawable> CARD_BACKGROUND;
    private static final SelectorResource<Float> TOTAL_TEXT_ALPHA;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeMarginLimitFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/margin/databinding/FragmentMarginUpgradeMarginLimitBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginUpgradeMarginLimitFragment() {
        super(C11223R.layout.fragment_margin_upgrade_margin_limit);
        this.binding = ViewBinding5.viewBinding(this, MarginUpgradeMarginLimitFragment2.INSTANCE);
    }

    static {
        ResourceType.DRAWABLE drawable = ResourceType.DRAWABLE.INSTANCE;
        ResourceType.BOOLEAN r3 = ResourceType.BOOLEAN.INSTANCE;
        CARD_BACKGROUND = new SelectorResource<>(drawable, new ThemedResourceReference(r3, C20690R.attr.isDay), new SelectorResource(drawable, new ThemedResourceReference(r3, C20690R.attr.isGold), new DirectResourceReference(drawable, C11223R.drawable.margin_limit_card_background_day_gold), new DirectResourceReference(drawable, C11223R.drawable.margin_limit_card_background_day_default)), new SelectorResource(drawable, new ThemedResourceReference(r3, C20690R.attr.isGold), new DirectResourceReference(drawable, C11223R.drawable.margin_limit_card_background_night_gold), new DirectResourceReference(drawable, C11223R.drawable.margin_limit_card_background_night_default)));
        ResourceType.FLOAT r1 = ResourceType.FLOAT.INSTANCE;
        TOTAL_TEXT_ALPHA = new SelectorResource<>(r1, new ThemedResourceReference(r3, C20690R.attr.isDay), new ResourceValue(r1, Float.valueOf(0.6f)), new ResourceValue(r1, Float.valueOf(0.8f)));
    }

    private final FragmentMarginUpgradeMarginLimitBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMarginUpgradeMarginLimitBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "MarginUpgradeMarginLimitFragment";
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected TextView getSetLimitBtn() {
        RdsTextButton setLimitBtn = getBinding().setLimitBtn;
        Intrinsics.checkNotNullExpressionValue(setLimitBtn, "setLimitBtn");
        return setLimitBtn;
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected View getRemoveLimitBtn() {
        RdsTextButton removeLimitBtn = getBinding().removeLimitBtn;
        Intrinsics.checkNotNullExpressionValue(removeLimitBtn, "removeLimitBtn");
        return removeLimitBtn;
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected View getConfirmBtn() {
        SparkleButton confirmBtn = getBinding().confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn, "confirmBtn");
        return confirmBtn;
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected TextView getMarginBuyingPowerTxt() {
        RhTextView marginBuyingPowerTxt = getBinding().marginBuyingPowerTxt;
        Intrinsics.checkNotNullExpressionValue(marginBuyingPowerTxt, "marginBuyingPowerTxt");
        return marginBuyingPowerTxt;
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected TextView getTotalTxt() {
        RhTextView totalTxt = getBinding().totalTxt;
        Intrinsics.checkNotNullExpressionValue(totalTxt, "totalTxt");
        return totalTxt;
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment
    protected TextView getDisclosureTxt() {
        RhTextView disclosureTxt = getBinding().disclosureTxt;
        Intrinsics.checkNotNullExpressionValue(disclosureTxt, "disclosureTxt");
        return disclosureTxt;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (((BaseMarginUpgradeMarginLimitFragment.Args) INSTANCE.getArgs((Fragment) this)).getFromMarginUpgrade()) {
            RhToolbarUtil.setCenteredTitle(toolbar, C11223R.string.margin_investing_toolbar_title);
            toolbar.getProgressBar().setNumSegments(1);
            RdsSegmentedProgressBar.setProgressByAbsolutePosition$default(toolbar.getProgressBar(), MarginUpgradeStep.MARGIN_LIMIT.getProgressBarValue() / 9, false, 2, null);
            toolbar.getProgressBar().setVisibility(0);
        }
    }

    @Override // com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentMarginUpgradeMarginLimitBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        LinearLayout marginLimitCard = binding.marginLimitCard;
        Intrinsics.checkNotNullExpressionValue(marginLimitCard, "marginLimitCard");
        ScarletManager2.overrideAttribute(marginLimitCard, R.attr.background, CARD_BACKGROUND);
        RhTextView totalTxt = binding.totalTxt;
        Intrinsics.checkNotNullExpressionValue(totalTxt, "totalTxt");
        ScarletManager2.overrideAttribute(totalTxt, R.attr.alpha, TOTAL_TEXT_ALPHA);
    }

    /* compiled from: MarginUpgradeMarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitFragment;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Args;", "<init>", "()V", "CARD_BACKGROUND", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "Landroid/graphics/drawable/Drawable;", "TOTAL_TEXT_ALPHA", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeMarginLimitFragment, BaseMarginUpgradeMarginLimitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BaseMarginUpgradeMarginLimitFragment.Args getArgs(MarginUpgradeMarginLimitFragment marginUpgradeMarginLimitFragment) {
            return (BaseMarginUpgradeMarginLimitFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeMarginLimitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeMarginLimitFragment newInstance(BaseMarginUpgradeMarginLimitFragment.Args args) {
            return (MarginUpgradeMarginLimitFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeMarginLimitFragment marginUpgradeMarginLimitFragment, BaseMarginUpgradeMarginLimitFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeMarginLimitFragment, args);
        }
    }
}
