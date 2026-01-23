package com.robinhood.android.welcome.p276gb;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.android.welcome.WelcomeAnimationViewState;
import com.robinhood.android.welcome.databinding.FragmentWelcomeIntroGbBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WelcomeIntroFragmentGb.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeIntroFragmentGb;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeIntroGbBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeIntroGbBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WelcomeIntroFragmentGb extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeIntroFragmentGb.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeIntroGbBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final String screenTag;
    private final boolean toolbarVisible;

    public WelcomeIntroFragmentGb() {
        super(C31456R.layout.fragment_welcome_intro_gb);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
        this.binding = ViewBinding5.viewBinding(this, WelcomeIntroFragmentGb2.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return this.screenTag;
    }

    private final FragmentWelcomeIntroGbBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeIntroGbBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().welcomeIntroSubtitle;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(HtmlCompat2.fromHtml$default(resources, C31456R.string.welcome_gb_subtitle, 0, 2, null));
        LottieAnimationView lottieAnimationView = getBinding().welcomeAnimationView;
        WelcomeAnimationViewState.Companion companion = WelcomeAnimationViewState.INSTANCE;
        lottieAnimationView.setMaxFrame(companion.getAnimationFrames().get(0).getFinalLoopingFrame());
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView, Integer.valueOf(companion.getAnimationFrames().get(0).getInitialLoopingFrame()), Integer.valueOf(companion.getAnimationFrames().get(0).getFinalLoopingFrame()));
        lottieAnimationView.playAnimation();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().welcomeAnimationView.removeAllLottieOnCompositionLoadedListener();
        super.onDestroyView();
    }

    /* compiled from: WelcomeIntroFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeIntroFragmentGb$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/welcome/gb/WelcomeIntroFragmentGb;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WelcomeIntroFragmentGb newInstance() {
            return new WelcomeIntroFragmentGb();
        }
    }
}
