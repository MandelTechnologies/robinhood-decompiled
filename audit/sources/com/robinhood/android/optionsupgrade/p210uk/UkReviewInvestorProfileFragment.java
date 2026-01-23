package com.robinhood.android.optionsupgrade.p210uk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable3;
import com.robinhood.android.optionsupgrade.OptionOnboardingLoggings;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.ProgressBarData;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.p210uk.UkReviewInvestorProfileFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UkReviewInvestorProfileFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u000245B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0016J\r\u0010+\u001a\u00020!H\u0017¢\u0006\u0002\u0010,J\r\u0010-\u001a\u00020!H\u0003¢\u0006\u0002\u0010,J\t\u0010.\u001a\u00020\rH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR+\u0010'\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u001eR\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkReviewInvestorProfileFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onStart", "onStop", "showReviewScreen", "getShowReviewScreen", "setShowReviewScreen", "showReviewScreen$delegate", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "ReviewInvestorProfileScreen", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug", "fragmentContainerId", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UkReviewInvestorProfileFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EventLogger eventLogger;

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading;

    /* renamed from: showReviewScreen$delegate, reason: from kotlin metadata */
    private final SnapshotState showReviewScreen;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkReviewInvestorProfileFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment, int i, Composer composer, int i2) {
        ukReviewInvestorProfileFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewInvestorProfileScreen$lambda$4(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment, int i, Composer composer, int i2) {
        ukReviewInvestorProfileFragment.ReviewInvestorProfileScreen(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    public UkReviewInvestorProfileFragment() {
        Boolean bool = Boolean.FALSE;
        this.loading = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.showReviewScreen = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getLoading() {
        return ((Boolean) this.loading.getValue()).booleanValue();
    }

    private final void setLoading(boolean z) {
        this.loading.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setLoading(isLoading);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ViewsKt.setMarginTop(rhToolbar, 0);
        }
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ReviewInvestorProfileScreen$lambda$3(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowReviewScreen() {
        return ((Boolean) this.showReviewScreen.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowReviewScreen(boolean z) {
        this.showReviewScreen.setValue(Boolean.valueOf(z));
    }

    /* compiled from: UkReviewInvestorProfileFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1 */
    static final class C252351 implements Function2<Composer, Integer, Unit> {
        C252351() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$0(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$1(int i) {
            return -i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$2(int i) {
            return -i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$3(int i) {
            return i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1679262982, i, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ComposeContent.<anonymous> (UkReviewInvestorProfileFragment.kt:85)");
            }
            Boolean boolValueOf = Boolean.valueOf(UkReviewInvestorProfileFragment.this.getShowReviewScreen());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UkReviewInvestorProfileFragment.C252351.invoke$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, "", null, ComposableLambda3.rememberComposableLambda(1574147619, true, new AnonymousClass2(UkReviewInvestorProfileFragment.this), composer, 54), composer, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final ContentTransform invoke$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (((Boolean) AnimatedContent.getTargetState()).booleanValue()) {
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(UkReviewInvestorProfileFragment.C252351.invoke$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                    }
                }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(UkReviewInvestorProfileFragment.C252351.invoke$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                    }
                }, 1, null));
            }
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(UkReviewInvestorProfileFragment.C252351.invoke$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(UkReviewInvestorProfileFragment.C252351.invoke$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                }
            }, 1, null));
        }

        /* compiled from: UkReviewInvestorProfileFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
            final /* synthetic */ UkReviewInvestorProfileFragment this$0;

            AnonymousClass2(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
                this.this$0 = ukReviewInvestorProfileFragment;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
                invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1574147619, i, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ComposeContent.<anonymous>.<anonymous> (UkReviewInvestorProfileFragment.kt:96)");
                }
                if (!z) {
                    composer.startReplaceGroup(-1316101058);
                    int i2 = C25121R.drawable.svg_ic_options_investor_profile_splash;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    long jade = bentoTheme.getColors(composer, i3).getJade();
                    boolean loading = this.this$0.getLoading();
                    long nova = bentoTheme.getColors(composer, i3).getNova();
                    Companion companion = UkReviewInvestorProfileFragment.INSTANCE;
                    String title = ((Args) companion.getArgs((Fragment) this.this$0)).getTitle();
                    String description = ((Args) companion.getArgs((Fragment) this.this$0)).getDescription();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UkReviewInvestorProfileFragment.C252351.AnonymousClass2.invoke$lambda$1$lambda$0(ukReviewInvestorProfileFragment);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                    final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment2 = this.this$0;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ComposeContent$1$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UkReviewInvestorProfileFragment.C252351.AnonymousClass2.invoke$lambda$3$lambda$2(ukReviewInvestorProfileFragment2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    I18nOptionsOnboardingSplashComposable3.m17392I18nOptionsOnboardingSplashComposableYeHINzE(i2, jade, loading, title, description, function0, (Function0) objRememberedValue2, null, null, 0, 0L, 0L, Color.m6701boximpl(nova), null, composer, 0, 3072, 3968);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1314923430);
                    this.this$0.ReviewInvestorProfileScreen(composer, 0);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
                EventLogger.DefaultImpls.logTap$default(ukReviewInvestorProfileFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, OptionOnboardingLoggings.getEventScreen(ukReviewInvestorProfileFragment.getScreenArgs()), null, null, null, false, 60, null);
                ukReviewInvestorProfileFragment.requireBaseActivity().finish();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
                EventLogger.DefaultImpls.logTap$default(ukReviewInvestorProfileFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, OptionOnboardingLoggings.getEventScreen(ukReviewInvestorProfileFragment.getScreenArgs()), null, null, null, false, 60, null);
                ukReviewInvestorProfileFragment.setShowReviewScreen(true);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-572119951);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-572119951, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ComposeContent (UkReviewInvestorProfileFragment.kt:83)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1679262982, true, new C252351(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkReviewInvestorProfileFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ReviewInvestorProfileScreen(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-577550957);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577550957, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen (UkReviewInvestorProfileFragment.kt:128)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen$lambda$2$lambda$1();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), ComposableLambda3.rememberComposableLambda(-617878697, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-617878697, i3, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.<anonymous> (UkReviewInvestorProfileFragment.kt:134)");
                    }
                    Function2<Composer, Integer, Unit> function2M17472getLambda$541460476$feature_options_upgrade_externalDebug = UkReviewInvestorProfileFragment2.INSTANCE.m17472getLambda$541460476$feature_options_upgrade_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(753443416, true, new AnonymousClass1(UkReviewInvestorProfileFragment.this), composer2, 54);
                    final ProgressBarData progressBarData = ((Args) UkReviewInvestorProfileFragment.INSTANCE.getArgs((Fragment) UkReviewInvestorProfileFragment.this)).getProgressBarData();
                    composer2.startReplaceGroup(-1075930031);
                    ComposableLambda composableLambdaRememberComposableLambda2 = progressBarData == null ? null : ComposableLambda3.rememberComposableLambda(1520127922, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$1$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope let, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(let, "$this$let");
                            if ((i4 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1520127922, i4, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.<anonymous>.<anonymous>.<anonymous> (UkReviewInvestorProfileFragment.kt:141)");
                            }
                            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(progressBarData.getCurrentSegment(), progressBarData.getSegmentProgress(), progressBarData.getNumberOfSegments(), null, 0L, 0L, false, composer3, 0, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    composer2.endReplaceGroup();
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17472getLambda$541460476$feature_options_upgrade_externalDebug, null, composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1898);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: UkReviewInvestorProfileFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ UkReviewInvestorProfileFragment this$0;

                    AnonymousClass1(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
                        this.this$0 = ukReviewInvestorProfileFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
                        ukReviewInvestorProfileFragment.setShowReviewScreen(false);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(753443416, i, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.<anonymous>.<anonymous> (UkReviewInvestorProfileFragment.kt:137)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UkReviewInvestorProfileFragment.C252361.AnonymousClass1.invoke$lambda$1$lambda$0(ukReviewInvestorProfileFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-608108136, true, new C252382(), composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1148523746, true, new C252393((SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6), this), composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 ReviewInvestorProfileScreen$lambda$2$lambda$1() {
        return SnapshotIntState3.mutableIntStateOf(View.generateViewId());
    }

    /* compiled from: UkReviewInvestorProfileFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$2 */
    static final class C252382 implements Function2<Composer, Integer, Unit> {
        C252382() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-608108136, i, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.<anonymous> (UkReviewInvestorProfileFragment.kt:152)");
            }
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            boolean loading = UkReviewInvestorProfileFragment.this.getLoading();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UkReviewInvestorProfileFragment.this);
            final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment = UkReviewInvestorProfileFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkReviewInvestorProfileFragment.C252382.invoke$lambda$1$lambda$0(ukReviewInvestorProfileFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, loading, null, null, null, null, false, null, composer, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
            OptionOnboardingScreens2 callbacks = ukReviewInvestorProfileFragment.getCallbacks();
            Companion companion = UkReviewInvestorProfileFragment.INSTANCE;
            callbacks.goToNextScreen(new ScreenRequest.UkReviewInvestorProfile(((Args) companion.getArgs((Fragment) ukReviewInvestorProfileFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) ukReviewInvestorProfileFragment)).getScreenArgs());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UkReviewInvestorProfileFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$3 */
    static final class C252393 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotIntState2 $fragmentContainerId$delegate;
        final /* synthetic */ UkReviewInvestorProfileFragment this$0;

        C252393(SnapshotIntState2 snapshotIntState2, UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
            this.$fragmentContainerId$delegate = snapshotIntState2;
            this.this$0 = ukReviewInvestorProfileFragment;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1148523746, i, -1, "com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen.<anonymous> (UkReviewInvestorProfileFragment.kt:165)");
            }
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$fragmentContainerId$delegate) | composer.changedInstance(this.this$0);
            final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment = this.this$0;
            final SnapshotIntState2 snapshotIntState2 = this.$fragmentContainerId$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UkReviewInvestorProfileFragment.C252393.invoke$lambda$2$lambda$1(ukReviewInvestorProfileFragment, snapshotIntState2, (Context) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$fragmentContainerId$delegate);
            final UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment2 = this.this$0;
            final SnapshotIntState2 snapshotIntState22 = this.$fragmentContainerId$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.uk.UkReviewInvestorProfileFragment$ReviewInvestorProfileScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UkReviewInvestorProfileFragment.C252393.invoke$lambda$6$lambda$5(ukReviewInvestorProfileFragment2, snapshotIntState22, (FragmentContainerView) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierPadding, null, (Function1) objRememberedValue2, null, composer, 0, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FragmentContainerView invoke$lambda$2$lambda$1(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment, SnapshotIntState2 snapshotIntState2, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
            fragmentContainerView.setId(UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen$lambda$3(snapshotIntState2));
            Navigator navigator = ukReviewInvestorProfileFragment.getNavigator();
            Companion companion = UkReviewInvestorProfileFragment.INSTANCE;
            ukReviewInvestorProfileFragment.getChildFragmentManager().beginTransaction().replace(UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen$lambda$3(snapshotIntState2), Navigator.DefaultImpls.createFragment$default(navigator, new InvestmentProfileSettings(((Args) companion.getArgs((Fragment) ukReviewInvestorProfileFragment)).getScreenArgs().getProductContext(), ((Args) companion.getArgs((Fragment) ukReviewInvestorProfileFragment)).getAccountNumber(), null, false, false, false, "options_upgrade", false, false, false, false, ukReviewInvestorProfileFragment.getString(C25121R.string.review_investor_profile), ukReviewInvestorProfileFragment.getString(C25121R.string.update_your_answers), 932, null), null, 2, null)).commit();
            return fragmentContainerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment, SnapshotIntState2 snapshotIntState2, FragmentContainerView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FragmentManager childFragmentManager = ukReviewInvestorProfileFragment.getChildFragmentManager();
            Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(UkReviewInvestorProfileFragment.ReviewInvestorProfileScreen$lambda$3(snapshotIntState2));
            if (fragmentFindFragmentById != null) {
                childFragmentManager.beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UkReviewInvestorProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkReviewInvestorProfileFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "title", "description", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkReviewInvestorProfile;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkReviewInvestorProfile;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getAccountNumber", "()Ljava/lang/String;", "getTitle", "getDescription", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkReviewInvestorProfile;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String description;
        private final ProgressBarData progressBarData;
        private final ScreenArgs.UkReviewInvestorProfile screenArgs;
        private final String title;

        /* compiled from: UkReviewInvestorProfileFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), ScreenArgs.UkReviewInvestorProfile.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, ScreenArgs.UkReviewInvestorProfile ukReviewInvestorProfile, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.title;
            }
            if ((i & 4) != 0) {
                str3 = args.description;
            }
            if ((i & 8) != 0) {
                ukReviewInvestorProfile = args.screenArgs;
            }
            if ((i & 16) != 0) {
                progressBarData = args.progressBarData;
            }
            ProgressBarData progressBarData2 = progressBarData;
            String str4 = str3;
            return args.copy(str, str2, str4, ukReviewInvestorProfile, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final ScreenArgs.UkReviewInvestorProfile getScreenArgs() {
            return this.screenArgs;
        }

        /* renamed from: component5, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final Args copy(String accountNumber, String title, String description, ScreenArgs.UkReviewInvestorProfile screenArgs, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(accountNumber, title, description, screenArgs, progressBarData);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.description, args.description) && Intrinsics.areEqual(this.screenArgs, args.screenArgs) && Intrinsics.areEqual(this.progressBarData, args.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.screenArgs.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", title=" + this.title + ", description=" + this.description + ", screenArgs=" + this.screenArgs + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.title);
            dest.writeString(this.description);
            this.screenArgs.writeToParcel(dest, flags);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public Args(String accountNumber, String title, String description, ScreenArgs.UkReviewInvestorProfile screenArgs, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.accountNumber = accountNumber;
            this.title = title;
            this.description = description;
            this.screenArgs = screenArgs;
            this.progressBarData = progressBarData;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ScreenArgs.UkReviewInvestorProfile getScreenArgs() {
            return this.screenArgs;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }
    }

    /* compiled from: UkReviewInvestorProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkReviewInvestorProfileFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/uk/UkReviewInvestorProfileFragment;", "Lcom/robinhood/android/optionsupgrade/uk/UkReviewInvestorProfileFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkReviewInvestorProfileFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukReviewInvestorProfileFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkReviewInvestorProfileFragment newInstance(Args args) {
            return (UkReviewInvestorProfileFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkReviewInvestorProfileFragment ukReviewInvestorProfileFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukReviewInvestorProfileFragment, args);
        }
    }
}
