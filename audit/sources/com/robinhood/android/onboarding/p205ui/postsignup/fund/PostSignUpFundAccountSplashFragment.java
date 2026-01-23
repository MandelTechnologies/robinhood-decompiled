package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.android.onboarding.p205ui.postsignup.fund.PostSignUpFundAccountSplashFragment;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostSignUpFundAccountSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", "getCallbacks", "()Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "Companion", "feature-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashViewModel;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountSplashFragment extends GenericComposeFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PostSignUpFundAccountSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PostSignUpFundAccountSplashDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PostSignUpEvent.Receiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof PostSignUpEvent.Receiver) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostSignUpFundAccountSplashFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment, int i, Composer composer, int i2) {
        postSignUpFundAccountSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment, int i, Composer composer, int i2) {
        postSignUpFundAccountSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private final PostSignUpFundAccountSplashDuxo getDuxo() {
        return (PostSignUpFundAccountSplashDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostSignUpEvent.Receiver getCallbacks() {
        return (PostSignUpEvent.Receiver) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.POST_ONBOARDING_FUND_SPLASH, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1183862719);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1183862719, i2, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment.ComposeContent (PostSignUpFundAccountSplashFragment.kt:41)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final PostOnboardingFundAccountSplashScreenContent content = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getContent();
            if (content == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PostSignUpFundAccountSplashFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(2098847181, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: PostSignUpFundAccountSplashFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PostOnboardingFundAccountSplashScreenContent $content;
                    final /* synthetic */ long $topHalfColor;
                    final /* synthetic */ SnapshotState4<PostSignUpFundAccountSplashViewModel> $viewState$delegate;
                    final /* synthetic */ PostSignUpFundAccountSplashFragment this$0;

                    AnonymousClass1(PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment, long j, PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, SnapshotState4<PostSignUpFundAccountSplashViewModel> snapshotState4) {
                        this.this$0 = postSignUpFundAccountSplashFragment;
                        this.$topHalfColor = j;
                        this.$content = postOnboardingFundAccountSplashScreenContent;
                        this.$viewState$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(146544226, i, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment.ComposeContent.<anonymous>.<anonymous> (PostSignUpFundAccountSplashFragment.kt:52)");
                        }
                        Screen eventScreen = this.this$0.getEventScreen();
                        com.robinhood.rosetta.eventlogging.Context context = PostSignUpFundAccountSplashFragment.ComposeContent$lambda$1(this.$viewState$delegate).getContext();
                        long j = this.$topHalfColor;
                        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent = this.$content;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PostSignUpFundAccountSplashFragment.C228771.AnonymousClass1.invoke$lambda$1$lambda$0(postSignUpFundAccountSplashFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        PostSignUpFundAccountSplashComposable.m16851PostSignUpFundAccountSplashComposableZPw9REg(j, postOnboardingFundAccountSplashScreenContent, eventScreen, context, null, (Function0) objRememberedValue, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment) {
                        postSignUpFundAccountSplashFragment.getCallbacks().onEvent(PostSignUpEvent.PreFundSplashComplete.INSTANCE);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2098847181, i3, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment.ComposeContent.<anonymous> (PostSignUpFundAccountSplashFragment.kt:45)");
                    }
                    Color composeColor = SduiColors2.toComposeColor(DayNightChanges.isDay(PostSignUpFundAccountSplashFragment.this.getScarletManager()) ? content.getHeaderImageBackgroundColor().getLight() : content.getHeaderImageBackgroundColor().getDark(), composer3, 0);
                    composer3.startReplaceGroup(-1642480613);
                    long jM21371getBg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                    composer3.endReplaceGroup();
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(146544226, true, new AnonymousClass1(PostSignUpFundAccountSplashFragment.this, jM21371getBg0d7_KjU, content, snapshotState4CollectAsStateWithLifecycle), composer3, 54), composer3, 6);
                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController) | composer3.changed(jM21371getBg0d7_KjU);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PostSignUpFundAccountSplashFragment2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostSignUpFundAccountSplashFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onEvent(PostSignUpEvent.PreFundDetails.Exit.INSTANCE);
        return true;
    }

    /* compiled from: PostSignUpFundAccountSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashFragment;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<PostSignUpFundAccountSplashFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((PostSignUpFundAccountSplashFragment) fragment);
        }

        public Void getArgs(PostSignUpFundAccountSplashFragment postSignUpFundAccountSplashFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, postSignUpFundAccountSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public PostSignUpFundAccountSplashFragment newInstance() {
            return (PostSignUpFundAccountSplashFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public PostSignUpFundAccountSplashFragment newInstance(Void r1) {
            return (PostSignUpFundAccountSplashFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostSignUpFundAccountSplashViewModel ComposeContent$lambda$1(SnapshotState4<PostSignUpFundAccountSplashViewModel> snapshotState4) {
        return snapshotState4.getValue();
    }
}
