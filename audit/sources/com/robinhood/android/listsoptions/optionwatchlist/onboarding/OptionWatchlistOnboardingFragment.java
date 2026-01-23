package com.robinhood.android.listsoptions.optionwatchlist.onboarding;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistOnboardingBinding;
import com.robinhood.android.listsoptions.optionwatchlist.EventLoggers3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: OptionWatchlistOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 82\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0016J\u0014\u0010+\u001a\u00020#*\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0014\u0010/\u001a\u00020#*\u0002002\u0006\u00101\u001a\u00020\u0019H\u0002J\u0014\u00102\u001a\u00020#*\u00020%2\u0006\u00101\u001a\u00020\u0019H\u0002J\u0014\u00103\u001a\u00020#*\u0002042\u0006\u00101\u001a\u00020\u0019H\u0002J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u0019H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "getOptionsWatchlistStore", "()Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "setOptionsWatchlistStore", "(Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;)V", "bindings", "Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistOnboardingBinding;", "getBindings", "()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistOnboardingBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pages", "", "Lkotlin/Pair;", "", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "pageHeight", "fadeoutY", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "onStop", "setAnimationProgress", "Lcom/airbnb/lottie/LottieAnimationView;", "progress", "", "setTextProgress", "Lcom/robinhood/android/designsystem/text/RhTextView;", "scrollY", "setPageTurnerProgress", "setCtaButtonProgress", "Lcom/robinhood/android/designsystem/button/RdsButton;", "bindPage", "pageNumber", "Args", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionWatchlistOnboardingFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionWatchlistOnboardingFragment.class, "bindings", "getBindings()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistOnboardingBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int PAGES = 3;
    public static final long SMOOTH_SCROLL_DURATION_MS = 1000;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public EventLogger eventLogger;
    private int fadeoutY;
    public OptionsWatchlistStore optionsWatchlistStore;
    private int pageHeight;
    private final List<Tuples2<Integer, Integer>> pages;
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar;

    public OptionWatchlistOnboardingFragment() {
        super(C20943R.layout.fragment_option_watchlist_onboarding);
        this.bindings = ViewBinding5.viewBinding(this, OptionWatchlistOnboardingFragment2.INSTANCE);
        this.pages = CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Integer.valueOf(C20943R.string.option_watchlist_onboarding_title1), Integer.valueOf(C20943R.string.option_watchlist_onboarding_message1)), Tuples4.m3642to(Integer.valueOf(C20943R.string.option_watchlist_onboarding_title2), Integer.valueOf(C20943R.string.option_watchlist_onboarding_message2)), Tuples4.m3642to(Integer.valueOf(C20943R.string.option_watchlist_onboarding_title3), Integer.valueOf(C20943R.string.option_watchlist_onboarding_message3))});
        this.useDesignSystemToolbar = true;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final OptionsWatchlistStore getOptionsWatchlistStore() {
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore;
        if (optionsWatchlistStore != null) {
            return optionsWatchlistStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionsWatchlistStore");
        return null;
    }

    public final void setOptionsWatchlistStore(OptionsWatchlistStore optionsWatchlistStore) {
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "<set-?>");
        this.optionsWatchlistStore = optionsWatchlistStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionWatchlistOnboardingBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionWatchlistOnboardingBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        this.fadeoutY = getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_default);
        bindPage(0);
        LottieAnimationView backgroundLottieView = getBindings().backgroundLottieView;
        Intrinsics.checkNotNullExpressionValue(backgroundLottieView, "backgroundLottieView");
        LottieAnimationViewsKt.setRemoteUrl(backgroundLottieView, LottieUrl.OPTIONS_WATCHLIST_BG);
        LottieAnimationView midLayerLottieView = getBindings().midLayerLottieView;
        Intrinsics.checkNotNullExpressionValue(midLayerLottieView, "midLayerLottieView");
        LottieAnimationViewsKt.setRemoteUrl(midLayerLottieView, LottieUrl.OPTIONS_WATCHLIST_MG);
        LottieAnimationView foregroundLottieView = getBindings().foregroundLottieView;
        Intrinsics.checkNotNullExpressionValue(foregroundLottieView, "foregroundLottieView");
        LottieAnimationViewsKt.setRemoteUrl(foregroundLottieView, LottieUrl.OPTIONS_WATCHLIST_FG);
        LottieAnimationView lighthouseLightLottieView = getBindings().lighthouseLightLottieView;
        Intrinsics.checkNotNullExpressionValue(lighthouseLightLottieView, "lighthouseLightLottieView");
        LottieAnimationViewsKt.setRemoteUrl(lighthouseLightLottieView, LottieUrl.OPTIONS_WATCHLIST_LIGHT);
        RdsIconButton pageTurner = getBindings().pageTurner;
        Intrinsics.checkNotNullExpressionValue(pageTurner, "pageTurner");
        OnClickListeners.onClick(pageTurner, new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistOnboardingFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton ctaButton = getBindings().ctaButton;
        Intrinsics.checkNotNullExpressionValue(ctaButton, "ctaButton");
        OnClickListeners.onClick(ctaButton, new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistOnboardingFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment) {
        int scrollY = optionWatchlistOnboardingFragment.getBindings().scrollView.getScrollY() + (optionWatchlistOnboardingFragment.pageHeight >> 1);
        int i = optionWatchlistOnboardingFragment.pageHeight;
        ObjectAnimator.ofInt(optionWatchlistOnboardingFragment.getBindings().scrollView, "scrollY", RangesKt.coerceAtMost(((scrollY / i) + 1) * i, i * 3)).setDuration(1000L).start();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(final OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment) {
        LifecycleHost.DefaultImpls.bind$default(optionWatchlistOnboardingFragment, optionWatchlistOnboardingFragment.getOptionsWatchlistStore().getOptionWatchlistId(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistOnboardingFragment.onViewCreated$lambda$2$lambda$1(this.f$0, (UUID) obj);
            }
        });
        Navigator navigator = optionWatchlistOnboardingFragment.getNavigator();
        Context contextRequireContext = optionWatchlistOnboardingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.OptionsWatchlistHub.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        Navigator navigator2 = optionWatchlistOnboardingFragment.getNavigator();
        Context contextRequireContext2 = optionWatchlistOnboardingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        String str = null;
        String str2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Navigator.DefaultImpls.showFragment$default(navigator2, contextRequireContext2, new SearchSelector(new SearchSelectorLaunchMode.Options.Watchlist(str, OptionChainLaunchMode.WatchlistOnboarding.INSTANCE, false, 5, null), objArr, str2, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        optionWatchlistOnboardingFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment, UUID optionWatchlistId) {
        Intrinsics.checkNotNullParameter(optionWatchlistId, "optionWatchlistId");
        EventLoggers3.logViewOptionWatchlistHubTap(optionWatchlistOnboardingFragment.getEventLogger(), optionWatchlistId);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final ViewTreeObserver viewTreeObserver = getBindings().placeholder.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$onResume$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int measuredWidth = this.this$0.getBindings().placeholder.getMeasuredWidth();
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment = this.this$0;
                optionWatchlistOnboardingFragment.pageHeight = optionWatchlistOnboardingFragment.getBindings().placeholder.getMeasuredHeight();
                if (this.this$0.getBindings().scrollContainerView.getChildCount() > 0) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                } else {
                    OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment2 = this.this$0;
                    for (int i = 0; i < 3; i++) {
                        optionWatchlistOnboardingFragment2.getBindings().scrollContainerView.addView(new View(optionWatchlistOnboardingFragment2.getContext()), measuredWidth, optionWatchlistOnboardingFragment2.pageHeight);
                    }
                }
            }
        };
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        getBindings().scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment.onResume.1
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                float measuredHeight = i2 / OptionWatchlistOnboardingFragment.this.getBindings().scrollContainerView.getMeasuredHeight();
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment = OptionWatchlistOnboardingFragment.this;
                LottieAnimationView backgroundLottieView = optionWatchlistOnboardingFragment.getBindings().backgroundLottieView;
                Intrinsics.checkNotNullExpressionValue(backgroundLottieView, "backgroundLottieView");
                optionWatchlistOnboardingFragment.setAnimationProgress(backgroundLottieView, measuredHeight);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment2 = OptionWatchlistOnboardingFragment.this;
                LottieAnimationView midLayerLottieView = optionWatchlistOnboardingFragment2.getBindings().midLayerLottieView;
                Intrinsics.checkNotNullExpressionValue(midLayerLottieView, "midLayerLottieView");
                optionWatchlistOnboardingFragment2.setAnimationProgress(midLayerLottieView, measuredHeight);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment3 = OptionWatchlistOnboardingFragment.this;
                LottieAnimationView foregroundLottieView = optionWatchlistOnboardingFragment3.getBindings().foregroundLottieView;
                Intrinsics.checkNotNullExpressionValue(foregroundLottieView, "foregroundLottieView");
                optionWatchlistOnboardingFragment3.setAnimationProgress(foregroundLottieView, measuredHeight);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment4 = OptionWatchlistOnboardingFragment.this;
                RhTextView title = optionWatchlistOnboardingFragment4.getBindings().title;
                Intrinsics.checkNotNullExpressionValue(title, "title");
                optionWatchlistOnboardingFragment4.setTextProgress(title, i2);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment5 = OptionWatchlistOnboardingFragment.this;
                RhTextView message = optionWatchlistOnboardingFragment5.getBindings().message;
                Intrinsics.checkNotNullExpressionValue(message, "message");
                optionWatchlistOnboardingFragment5.setTextProgress(message, i2);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment6 = OptionWatchlistOnboardingFragment.this;
                RdsIconButton pageTurner = optionWatchlistOnboardingFragment6.getBindings().pageTurner;
                Intrinsics.checkNotNullExpressionValue(pageTurner, "pageTurner");
                optionWatchlistOnboardingFragment6.setPageTurnerProgress(pageTurner, i2);
                OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment7 = OptionWatchlistOnboardingFragment.this;
                RdsButton ctaButton = optionWatchlistOnboardingFragment7.getBindings().ctaButton;
                Intrinsics.checkNotNullExpressionValue(ctaButton, "ctaButton");
                optionWatchlistOnboardingFragment7.setCtaButtonProgress(ctaButton, i2);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, getOptionsWatchlistStore().getOptionWatchlistId(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistOnboardingFragment.onStart$lambda$3(this.f$0, (UUID) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment, UUID optionWatchlistId) {
        Intrinsics.checkNotNullParameter(optionWatchlistId, "optionWatchlistId");
        EventLoggers3.logOptionWatchlistAboutAppear(optionWatchlistOnboardingFragment.getEventLogger(), optionWatchlistId, ((Args) INSTANCE.getArgs((Fragment) optionWatchlistOnboardingFragment)).getEventSourceType());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LifecycleHost.DefaultImpls.bind$default(this, getOptionsWatchlistStore().getOptionWatchlistId(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistOnboardingFragment.onStop$lambda$4(this.f$0, (UUID) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$4(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment, UUID optionWatchlistId) {
        Intrinsics.checkNotNullParameter(optionWatchlistId, "optionWatchlistId");
        EventLoggers3.logOptionWatchlistAboutDisappear(optionWatchlistOnboardingFragment.getEventLogger(), optionWatchlistId, ((Args) INSTANCE.getArgs((Fragment) optionWatchlistOnboardingFragment)).getEventSourceType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationProgress(LottieAnimationView lottieAnimationView, float f) {
        lottieAnimationView.setFrame((int) (f * lottieAnimationView.getMaxFrame()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextProgress(RhTextView rhTextView, int i) {
        int i2 = this.pageHeight;
        int i3 = i2 >> 1;
        int i4 = i2 >> 2;
        int i5 = i % i2;
        bindPage((i + i3) / i2);
        if (i5 < i4) {
            float f = i5 / i4;
            rhTextView.setAlpha(1.0f - f);
            rhTextView.setTranslationY((-this.fadeoutY) * f);
        } else if (i5 < i3) {
            rhTextView.setAlpha(0.0f);
            rhTextView.setTranslationY(0.0f);
        } else if (i5 < i4 + i3) {
            float f2 = (i5 - i3) / i4;
            rhTextView.setAlpha(f2);
            rhTextView.setTranslationY(this.fadeoutY * (1 - f2));
        } else {
            rhTextView.setAlpha(1.0f);
            rhTextView.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageTurnerProgress(View view, int i) {
        int i2 = this.pageHeight;
        int i3 = i2 >> 2;
        if (i <= i2) {
            view.setAlpha(1.0f);
            view.setClickable(true);
        } else if (i > i2 && i < i2 + i3) {
            view.setAlpha(1.0f - ((i - i2) / i3));
            view.setClickable(true);
        } else {
            view.setAlpha(0.0f);
            view.setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCtaButtonProgress(RdsButton rdsButton, int i) {
        int i2 = this.pageHeight;
        int i3 = i2 >> 1;
        int i4 = i2 >> 2;
        int i5 = (i2 * 2) - i3;
        if (i < i5) {
            rdsButton.setAlpha(0.0f);
            rdsButton.setClickable(false);
        } else if (i < i3 + i5) {
            rdsButton.setAlpha((i - i5) / i4);
            rdsButton.setClickable(true);
        } else {
            rdsButton.setAlpha(1.0f);
            rdsButton.setClickable(true);
        }
    }

    private final void bindPage(int pageNumber) {
        getBindings().title.setText(this.pages.get(pageNumber).getFirst().intValue());
        getBindings().message.setText(this.pages.get(pageNumber).getSecond().intValue());
    }

    /* compiled from: OptionWatchlistOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingFragment$Args;", "Landroid/os/Parcelable;", "eventSourceType", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;)V", "getEventSourceType", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionWatchlistAboutContext.SourceType eventSourceType;

        /* compiled from: OptionWatchlistOnboardingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OptionWatchlistAboutContext.SourceType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionWatchlistAboutContext.SourceType sourceType, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceType = args.eventSourceType;
            }
            return args.copy(sourceType);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionWatchlistAboutContext.SourceType getEventSourceType() {
            return this.eventSourceType;
        }

        public final Args copy(OptionWatchlistAboutContext.SourceType eventSourceType) {
            Intrinsics.checkNotNullParameter(eventSourceType, "eventSourceType");
            return new Args(eventSourceType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.eventSourceType == ((Args) other).eventSourceType;
        }

        public int hashCode() {
            return this.eventSourceType.hashCode();
        }

        public String toString() {
            return "Args(eventSourceType=" + this.eventSourceType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.eventSourceType.name());
        }

        public Args(OptionWatchlistAboutContext.SourceType eventSourceType) {
            Intrinsics.checkNotNullParameter(eventSourceType, "eventSourceType");
            this.eventSourceType = eventSourceType;
        }

        public final OptionWatchlistAboutContext.SourceType getEventSourceType() {
            return this.eventSourceType;
        }
    }

    /* compiled from: OptionWatchlistOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingFragment;", "Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingFragment$Args;", "<init>", "()V", "PAGES", "", "SMOOTH_SCROLL_DURATION_MS", "", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionWatchlistOnboardingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionWatchlistOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionWatchlistOnboardingFragment newInstance(Args args) {
            return (OptionWatchlistOnboardingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionWatchlistOnboardingFragment optionWatchlistOnboardingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionWatchlistOnboardingFragment, args);
        }
    }
}
