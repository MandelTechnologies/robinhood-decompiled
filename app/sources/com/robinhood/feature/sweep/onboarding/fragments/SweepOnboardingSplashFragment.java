package com.robinhood.feature.sweep.onboarding.fragments;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.R$attr;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.sweep.contracts.SweepOnboardingContract;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.feature.sweep.onboarding.C33184R;
import com.robinhood.feature.sweep.onboarding.databinding.SweepOnboardingSplashFragmentBinding;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SweepOnboardingSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00102\u001a\u00020\"H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0018\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u000204H\u0016J\b\u0010?\u001a\u000204H\u0016J\u0010\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020BH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020*0(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u0006F"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/feature/sweep/onboarding/databinding/SweepOnboardingSplashFragmentBinding;", "getBinding", "()Lcom/robinhood/feature/sweep/onboarding/databinding/SweepOnboardingSplashFragmentBinding;", "binding$delegate", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "toolbarOriginalBackgroundTint", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "headerBackgroundColorRes", "", "getHeaderBackgroundColorRes", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "headerBackgroundColorResId", "getHeaderBackgroundColorResId", "()I", "navigationIconColorResId", "getNavigationIconColorResId", "onBackPressed", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDisclosureDialog", "dialogTitle", "", "disclosureText", "Landroid/text/Spanned;", "onStart", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Callbacks", "Args", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingSplashFragment extends BaseFragment {
    private final Screen analyticsScreen;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean excludeFromAnalyticsLogging;
    public ImageLoader imageLoader;
    public Markwon markwon;
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    private ResourceReferences4<?> toolbarOriginalBackgroundTint;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepOnboardingSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(SweepOnboardingSplashFragment.class, "binding", "getBinding()Lcom/robinhood/feature/sweep/onboarding/databinding/SweepOnboardingSplashFragmentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SweepOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Callbacks;", "", "onContinueClicked", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClicked();
    }

    public SweepOnboardingSplashFragment() {
        super(C33184R.layout.sweep_onboarding_splash_fragment);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof SweepOnboardingSplashFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, SweepOnboardingSplashFragment2.INSTANCE);
        this.excludeFromAnalyticsLogging = true;
        this.analyticsScreen = new Screen(Screen.Name.SWEEP_ONBOARDING_VALUE_PROPS, null, null, null, 14, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final SweepOnboardingSplashFragmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SweepOnboardingSplashFragmentBinding) value;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    public final SweepOnboardingEventLogger getSweepOnboardingEventLogger() {
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger;
        if (sweepOnboardingEventLogger != null) {
            return sweepOnboardingEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepOnboardingEventLogger");
        return null;
    }

    public final void setSweepOnboardingEventLogger(SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "<set-?>");
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    private final ResourceReferences4<Integer> getHeaderBackgroundColorRes() {
        ResourceReferences4<Integer> colorResource = SduiColors2.toColorResource(((Args) INSTANCE.getArgs((Fragment) this)).getSweepOnboarding().getHeaderBackgroundColor());
        if (colorResource != null) {
            return colorResource;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final int getHeaderBackgroundColorResId() {
        ResourceReferences4<Integer> headerBackgroundColorRes = getHeaderBackgroundColorRes();
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        Integer numResolve = headerBackgroundColorRes.resolve(theme);
        if (numResolve != null) {
            return numResolve.intValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final int getNavigationIconColorResId() {
        if (Intrinsics.areEqual(((Args) INSTANCE.getArgs((Fragment) this)).getSweepOnboarding().isDarkNavigationBarTint(), Boolean.TRUE)) {
            return C20690R.attr.colorBlack;
        }
        return C20690R.attr.colorWhite;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getSweepOnboardingEventLogger().logTap(this.analyticsScreen, UserInteractionEventData.Action.BACK);
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().bannerImage.setBackgroundColor(getHeaderBackgroundColorResId());
        ImageLoader imageLoader = getImageLoader();
        Companion companion = INSTANCE;
        ImageDensityUrl imageDensityUrl = new ImageDensityUrl(((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getImagePath(), null, 2, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(imageDensityUrl.getImageDensityUrl(ContextsUiExtensions.getDensitySpec(contextRequireContext)));
        ImageView bannerImage = getBinding().bannerImage;
        Intrinsics.checkNotNullExpressionValue(bannerImage, "bannerImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, bannerImage, null, null, 6, null);
        getBinding().bannerImage.setContentDescription(((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getAltText());
        getBinding().goldInfoTag.setVisibility(((Args) companion.getArgs((Fragment) this)).isGold() ? 0 : 8);
        getBinding().titleText.setText(((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getTitle());
        getBinding().description.setText(((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getDescription());
        getBinding().continueBtnBar.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepOnboardingSplashFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        final String title = ((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getDisclosure().getTitle();
        final Spanned spanned$default = Markwons.toSpanned$default(getMarkwon(), new MarkdownContent(((Args) companion.getArgs((Fragment) this)).getSweepOnboarding().getDisclosure().getDescription()), null, 2, null);
        RhTextView disclosureInterestText = getBinding().disclosureInterestText;
        Intrinsics.checkNotNullExpressionValue(disclosureInterestText, "disclosureInterestText");
        OnClickListeners.onClick(disclosureInterestText, new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepOnboardingSplashFragment.onViewCreated$lambda$1(this.f$0, title, spanned$default);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SweepOnboardingSplashFragment sweepOnboardingSplashFragment) {
        sweepOnboardingSplashFragment.getSweepOnboardingEventLogger().logTap(sweepOnboardingSplashFragment.analyticsScreen, UserInteractionEventData.Action.CONTINUE);
        sweepOnboardingSplashFragment.getCallbacks().onContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SweepOnboardingSplashFragment sweepOnboardingSplashFragment, String str, Spanned spanned) {
        sweepOnboardingSplashFragment.showDisclosureDialog(str, spanned);
        return Unit.INSTANCE;
    }

    private final void showDisclosureDialog(String dialogTitle, Spanned disclosureText) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, dialogTitle, null, disclosureText, null, getString(C11048R.string.general_label_done), null, null, null, false, false, null, null, null, false, !((Args) r2.getArgs((Fragment) this)).isGold(), ((Args) INSTANCE.getArgs((Fragment) this)).isGold(), false, null, null, "VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", 950229, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "sweep_onboarding_variable_apy_bottom_sheet");
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (DayNightChanges.isDay(getScarletManager())) {
            requireBaseActivity().overrideStatusBarStyle(false);
        }
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        this.toolbarOriginalBackgroundTint = ScarletManager2.getAttribute(rhToolbar, R$attr.backgroundTint);
        RhToolbar rhToolbar2 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar2);
        rhToolbar2.setUseDesignSystemTheme(true);
        RhToolbar rhToolbar3 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar3);
        ScarletManager2.overrideAttribute(rhToolbar3, R.attr.backgroundTint, getHeaderBackgroundColorRes());
        RhToolbar rhToolbar4 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar4);
        rhToolbar4.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, getNavigationIconColorResId()));
        getSweepOnboardingEventLogger().logScreenAppear(this.analyticsScreen);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getSweepOnboardingEventLogger().logScreenDisappear(this.analyticsScreen);
        requireBaseActivity().resetStatusBarStyleOverride();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, this.toolbarOriginalBackgroundTint);
        RhToolbar rhToolbar2 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar2);
        rhToolbar2.setColorControlNormalOverride(null);
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getCanSkip()) {
            ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C33184R.id.sweep_onboarding_toolbar_content);
            if (viewGroup == null) {
                View viewFindViewById = RhToolbar.addCustomView$default(toolbar, C33184R.layout.include_sweep_toolbar_skip, false, 0, 6, null).findViewById(C33184R.id.sweep_onboarding_toolbar_content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                viewGroup = (ViewGroup) viewFindViewById;
            }
            View viewFindViewById2 = viewGroup.findViewById(C33184R.id.sweep_onboarding_skip_txt);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            RhTextView rhTextView = (RhTextView) viewFindViewById2;
            rhTextView.setTextColor(rhTextView.getContext().getColor(C20690R.color.mobius_foreground_1_night));
            OnClickListeners.onClick(viewFindViewById2, new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SweepOnboardingSplashFragment.configureToolbar$lambda$4$lambda$3(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$4$lambda$3(SweepOnboardingSplashFragment sweepOnboardingSplashFragment) {
        FragmentActivity fragmentActivityRequireActivity = sweepOnboardingSplashFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NavigationActivityResultContract3.finishWithResult(fragmentActivityRequireActivity, new SweepOnboardingContract.Result.Completed(false));
        return Unit.INSTANCE;
    }

    /* compiled from: SweepOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Args;", "Landroid/os/Parcelable;", "sweepOnboarding", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepOnboarding;", "isGold", "", "canSkip", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepOnboarding;ZZ)V", "getSweepOnboarding", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepOnboarding;", "()Z", "getCanSkip", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean canSkip;
        private final boolean isGold;
        private final ApiSweepFlow.SweepOnboarding sweepOnboarding;

        /* compiled from: SweepOnboardingSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiSweepFlow.SweepOnboarding) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiSweepFlow.SweepOnboarding sweepOnboarding, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                sweepOnboarding = args.sweepOnboarding;
            }
            if ((i & 2) != 0) {
                z = args.isGold;
            }
            if ((i & 4) != 0) {
                z2 = args.canSkip;
            }
            return args.copy(sweepOnboarding, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepFlow.SweepOnboarding getSweepOnboarding() {
            return this.sweepOnboarding;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanSkip() {
            return this.canSkip;
        }

        public final Args copy(ApiSweepFlow.SweepOnboarding sweepOnboarding, boolean isGold, boolean canSkip) {
            Intrinsics.checkNotNullParameter(sweepOnboarding, "sweepOnboarding");
            return new Args(sweepOnboarding, isGold, canSkip);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.sweepOnboarding, args.sweepOnboarding) && this.isGold == args.isGold && this.canSkip == args.canSkip;
        }

        public int hashCode() {
            return (((this.sweepOnboarding.hashCode() * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.canSkip);
        }

        public String toString() {
            return "Args(sweepOnboarding=" + this.sweepOnboarding + ", isGold=" + this.isGold + ", canSkip=" + this.canSkip + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sweepOnboarding, flags);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.canSkip ? 1 : 0);
        }

        public Args(ApiSweepFlow.SweepOnboarding sweepOnboarding, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(sweepOnboarding, "sweepOnboarding");
            this.sweepOnboarding = sweepOnboarding;
            this.isGold = z;
            this.canSkip = z2;
        }

        public final ApiSweepFlow.SweepOnboarding getSweepOnboarding() {
            return this.sweepOnboarding;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean getCanSkip() {
            return this.canSkip;
        }
    }

    /* compiled from: SweepOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingSplashFragment sweepOnboardingSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingSplashFragment newInstance(Args args) {
            return (SweepOnboardingSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingSplashFragment sweepOnboardingSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingSplashFragment, args);
        }
    }
}
