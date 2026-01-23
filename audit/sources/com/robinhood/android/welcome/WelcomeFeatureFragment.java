package com.robinhood.android.welcome;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
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

/* compiled from: WelcomeFeatureFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFeatureFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "toggleBottomSheet", "targetPageIdx", "", "isVisible", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class WelcomeFeatureFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeFeatureFragment.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String screenTag;
    private final boolean toolbarVisible;

    public WelcomeFeatureFragment() {
        super(C31456R.layout.fragment_welcome_feature);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
        this.binding = ViewBinding5.viewBinding(this, WelcomeFeatureFragment2.INSTANCE);
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
        rhTextView.setText(((WelcomePage) companion.getArgs((Fragment) this)).getTitleRes());
        includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureSubtitle.setText(((WelcomePage) companion.getArgs((Fragment) this)).getSubtitleRes());
        RhTextView maxWelcomeFeatureDisclosure = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure, "maxWelcomeFeatureDisclosure");
        maxWelcomeFeatureDisclosure.setVisibility(((WelcomePage) companion.getArgs((Fragment) this)).getDisclosureRes() != null ? 0 : 8);
        RhTextView maxWelcomeFeatureDisclosure2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure2, "maxWelcomeFeatureDisclosure");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(maxWelcomeFeatureDisclosure2, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Integer disclosureRes = ((WelcomePage) companion.getArgs((Fragment) this)).getDisclosureRes();
        if (disclosureRes != null) {
            int iIntValue = disclosureRes.intValue();
            RhTextView rhTextView2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView2.setText(HtmlCompat2.fromHtml$default(resources, iIntValue, 0, 2, null));
        }
        if (((WelcomePage) companion.getArgs((Fragment) this)).getPageIdx() == 1) {
            LinearLayout root = includeMaxWelcomeBottomSheetBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(8);
        }
    }

    public final void toggleBottomSheet(int targetPageIdx, boolean isVisible) {
        if (((WelcomePage) INSTANCE.getArgs((Fragment) this)).getPageIdx() == targetPageIdx) {
            LinearLayout root = getBinding().maxWelcomeFeatureBottomSheet.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(isVisible ? 0 : 8);
        }
    }

    /* compiled from: WelcomeFeatureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFeatureFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/welcome/WelcomeFeatureFragment;", "Lcom/robinhood/android/welcome/WelcomePage;", "<init>", "()V", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeFeatureFragment, WelcomePage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public WelcomePage getArgs(WelcomeFeatureFragment welcomeFeatureFragment) {
            return (WelcomePage) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeFeatureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeFeatureFragment newInstance(WelcomePage welcomePage) {
            return (WelcomeFeatureFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, welcomePage);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeFeatureFragment welcomeFeatureFragment, WelcomePage welcomePage) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeFeatureFragment, welcomePage);
        }
    }
}
