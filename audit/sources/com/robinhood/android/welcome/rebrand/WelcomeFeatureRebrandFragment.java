package com.robinhood.android.welcome.rebrand;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.android.welcome.databinding.FragmentWelcomeFeatureBinding;
import com.robinhood.android.welcome.databinding.IncludeMaxWelcomeBottomSheetBinding;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WelcomeFeatureRebrandFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeFeatureRebrandFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WelcomeFeatureRebrandFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeFeatureRebrandFragment.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String screenTag;
    private final boolean toolbarVisible;

    public WelcomeFeatureRebrandFragment() {
        super(C31456R.layout.fragment_welcome_feature_rebrand);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
        this.binding = ViewBinding5.viewBinding(this, WelcomeFeatureRebrandFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return this.screenTag;
    }

    private final FragmentWelcomeFeatureBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeFeatureBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding = getBinding().maxWelcomeFeatureBottomSheet;
        RhTextView rhTextView = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((WelcomePageRebrand) companion.getArgs((Fragment) this)).getTitleRes());
        RhTextView rhTextView2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureSubtitle;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView2.setText(HtmlCompat2.fromHtml$default(resources, ((WelcomePageRebrand) companion.getArgs((Fragment) this)).getSubtitleRes(), 0, 2, null));
        RhTextView maxWelcomeFeatureDisclosure = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure, "maxWelcomeFeatureDisclosure");
        maxWelcomeFeatureDisclosure.setVisibility(((WelcomePageRebrand) companion.getArgs((Fragment) this)).getDisclosureRes() != null ? 0 : 8);
        RhTextView maxWelcomeFeatureDisclosure2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure2, "maxWelcomeFeatureDisclosure");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(maxWelcomeFeatureDisclosure2, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Integer disclosureRes = ((WelcomePageRebrand) companion.getArgs((Fragment) this)).getDisclosureRes();
        if (disclosureRes != null) {
            int iIntValue = disclosureRes.intValue();
            RhTextView rhTextView3 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rhTextView3.setText(HtmlCompat2.fromHtml$default(resources2, iIntValue, 0, 2, null));
        }
    }

    /* compiled from: WelcomeFeatureRebrandFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeFeatureRebrandFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/welcome/rebrand/WelcomeFeatureRebrandFragment;", "Lcom/robinhood/android/welcome/rebrand/WelcomePageRebrand;", "<init>", "()V", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeFeatureRebrandFragment, WelcomePageRebrand> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public WelcomePageRebrand getArgs(WelcomeFeatureRebrandFragment welcomeFeatureRebrandFragment) {
            return (WelcomePageRebrand) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeFeatureRebrandFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeFeatureRebrandFragment newInstance(WelcomePageRebrand welcomePageRebrand) {
            return (WelcomeFeatureRebrandFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, welcomePageRebrand);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeFeatureRebrandFragment welcomeFeatureRebrandFragment, WelcomePageRebrand welcomePageRebrand) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeFeatureRebrandFragment, welcomePageRebrand);
        }
    }
}
