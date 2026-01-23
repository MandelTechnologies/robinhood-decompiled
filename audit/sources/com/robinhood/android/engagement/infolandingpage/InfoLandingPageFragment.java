package com.robinhood.android.engagement.infolandingpage;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment;
import com.robinhood.android.engagement.infolandingpage.InfoLandingPageViewState;
import com.robinhood.android.engagement.lib.infolandingpage.contracts.InfoLandingPageFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import com.robinhood.android.referral.lib.rewardOfferDetail.p235ui.RewardOfferDetailsComposable3;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferAction;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetailsSectionRenderingType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoLandingPageFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001b\u0010#\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160%H\u0003¢\u0006\u0002\u0010&J\b\u0010$\u001a\u00020\u0016H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "getDuxo", "()Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "analyticsLogger", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalyticsLogger", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalyticsLogger", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onButtonActionClicked", "buttonAction", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "pageId", "Ljava/util/UUID;", "onBulletActionClicked", "bulletAction", "handleAction", "ErrorDialog", "onDismissDialog", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-info-landing-page_externalRelease", "viewState", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InfoLandingPageFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public AnalyticsLogger analyticsLogger;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InfoLandingPageDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(InfoLandingPageFragment infoLandingPageFragment, int i, Composer composer, int i2) {
        infoLandingPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorDialog$lambda$2(InfoLandingPageFragment infoLandingPageFragment, Function0 function0, int i, Composer composer, int i2) {
        infoLandingPageFragment.ErrorDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private final InfoLandingPageDuxo getDuxo() {
        return (InfoLandingPageDuxo) this.duxo.getValue();
    }

    public final AnalyticsLogger getAnalyticsLogger() {
        AnalyticsLogger analyticsLogger = this.analyticsLogger;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsLogger");
        return null;
    }

    public final void setAnalyticsLogger(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analyticsLogger = analyticsLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, "info_landing_page_screen", null, 11, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1533322720);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533322720, i2, -1, "com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ComposeContent (InfoLandingPageFragment.kt:42)");
            }
            final InfoLandingPageViewState infoLandingPageViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (infoLandingPageViewStateComposeContent$lambda$0 instanceof InfoLandingPageViewState.Error) {
                composerStartRestartGroup.startReplaceGroup(-349344141);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1183521757, true, new C145911(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (infoLandingPageViewStateComposeContent$lambda$0 instanceof InfoLandingPageViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-349338232);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 0, composerStartRestartGroup, 432, 9);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(infoLandingPageViewStateComposeContent$lambda$0 instanceof InfoLandingPageViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(-349345902);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-349330908);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(2069661323, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ComposeContent.2

                    /* compiled from: InfoLandingPageFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ InfoLandingPageViewState $state;
                        final /* synthetic */ InfoLandingPageFragment this$0;

                        AnonymousClass1(InfoLandingPageViewState infoLandingPageViewState, InfoLandingPageFragment infoLandingPageFragment) {
                            this.$state = infoLandingPageViewState;
                            this.this$0 = infoLandingPageFragment;
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
                                ComposerKt.traceEventStart(-2133097120, i, -1, "com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ComposeContent.<anonymous>.<anonymous> (InfoLandingPageFragment.kt:64)");
                            }
                            RewardOfferDetails landingPage = ((InfoLandingPageViewState.Loaded) this.$state).getLandingPage();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final InfoLandingPageFragment infoLandingPageFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InfoLandingPageFragment.C145922.AnonymousClass1.invoke$lambda$1$lambda$0(infoLandingPageFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$state);
                            final InfoLandingPageFragment infoLandingPageFragment2 = this.this$0;
                            final InfoLandingPageViewState infoLandingPageViewState = this.$state;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InfoLandingPageFragment.C145922.AnonymousClass1.invoke$lambda$3$lambda$2(infoLandingPageFragment2, infoLandingPageViewState, (ApiRewardOfferButtonAction) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function02 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changed(this.$state);
                            final InfoLandingPageFragment infoLandingPageFragment3 = this.this$0;
                            final InfoLandingPageViewState infoLandingPageViewState2 = this.$state;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InfoLandingPageFragment.C145922.AnonymousClass1.invoke$lambda$7$lambda$6(infoLandingPageFragment3, infoLandingPageViewState2, (ApiRewardOfferButtonAction) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function12 = (Function1) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance4 = composer.changedInstance(this.this$0) | composer.changed(this.$state);
                            final InfoLandingPageFragment infoLandingPageFragment4 = this.this$0;
                            final InfoLandingPageViewState infoLandingPageViewState3 = this.$state;
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$2$1$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InfoLandingPageFragment.C145922.AnonymousClass1.invoke$lambda$9$lambda$8(infoLandingPageFragment4, infoLandingPageViewState3, (ApiRewardOfferButtonAction) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            composer.endReplaceGroup();
                            RewardOfferDetailsComposable3.RewardOfferDetailsComposable(landingPage, function0, function1, function02, function12, (Function1) objRememberedValue5, null, true, composer, RewardOfferDetails.$stable | 12585984, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(InfoLandingPageFragment infoLandingPageFragment) {
                            infoLandingPageFragment.requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(InfoLandingPageFragment infoLandingPageFragment, InfoLandingPageViewState infoLandingPageViewState, ApiRewardOfferButtonAction it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            infoLandingPageFragment.onButtonActionClicked(it, ((InfoLandingPageViewState.Loaded) infoLandingPageViewState).getLandingPage().getId());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$9$lambda$8(InfoLandingPageFragment infoLandingPageFragment, InfoLandingPageViewState infoLandingPageViewState, ApiRewardOfferButtonAction it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            infoLandingPageFragment.onButtonActionClicked(it, ((InfoLandingPageViewState.Loaded) infoLandingPageViewState).getLandingPage().getId());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(InfoLandingPageFragment infoLandingPageFragment, InfoLandingPageViewState infoLandingPageViewState, ApiRewardOfferButtonAction it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            infoLandingPageFragment.onBulletActionClicked(it, ((InfoLandingPageViewState.Loaded) infoLandingPageViewState).getLandingPage().getId());
                            return Unit.INSTANCE;
                        }
                    }

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
                            ComposerKt.traceEventStart(2069661323, i3, -1, "com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ComposeContent.<anonymous> (InfoLandingPageFragment.kt:63)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2133097120, true, new AnonymousClass1(infoLandingPageViewStateComposeContent$lambda$0, this), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoLandingPageFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InfoLandingPageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$1 */
    static final class C145911 implements Function2<Composer, Integer, Unit> {
        C145911() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InfoLandingPageFragment infoLandingPageFragment) {
            infoLandingPageFragment.onDismissDialog();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1183521757, i, -1, "com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ComposeContent.<anonymous> (InfoLandingPageFragment.kt:48)");
            }
            InfoLandingPageFragment infoLandingPageFragment = InfoLandingPageFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(InfoLandingPageFragment.this);
            final InfoLandingPageFragment infoLandingPageFragment2 = InfoLandingPageFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InfoLandingPageFragment.C145911.invoke$lambda$1$lambda$0(infoLandingPageFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            infoLandingPageFragment.ErrorDialog((Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    private static final InfoLandingPageViewState ComposeContent$lambda$0(SnapshotState4<? extends InfoLandingPageViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonActionClicked(ApiRewardOfferButtonAction buttonAction, UUID pageId) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalyticsLogger(), "info_landing_page_screen-" + buttonAction.getAction().getType().getServerValue(), "info_landing_page_id:" + pageId, buttonAction.getDisplay_text(), null, null, "cta_button", null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
        handleAction(buttonAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBulletActionClicked(ApiRewardOfferButtonAction bulletAction, UUID pageId) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalyticsLogger(), "info_landing_page_screen-" + bulletAction.getAction().getType().getServerValue(), "info_landing_page_id:" + pageId + ",", null, null, null, ApiRewardOfferDetailsSectionRenderingType.Type.BULLET.getServerValue(), null, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null);
        handleAction(bulletAction);
    }

    private final void handleAction(ApiRewardOfferButtonAction buttonAction) {
        ApiRewardOfferAction action = buttonAction.getAction();
        if (action instanceof ApiRewardOfferAction.DeepLinkAction) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((ApiRewardOfferAction.DeepLinkAction) action).getData().getAction_url(), null, null, false, null, 60, null);
            return;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(buttonAction);
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ErrorDialog(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(674841247);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674841247, i2, -1, "com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment.ErrorDialog (InfoLandingPageFragment.kt:115)");
            }
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C11048R.string.error_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), function0), null, null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.infolandingpage.InfoLandingPageFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoLandingPageFragment.ErrorDialog$lambda$2(this.f$0, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDismissDialog() {
        requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: InfoLandingPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageFragment;", "Lcom/robinhood/android/engagement/lib/infolandingpage/contracts/InfoLandingPageFragmentKey;", "<init>", "()V", "feature-info-landing-page_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<InfoLandingPageFragment, InfoLandingPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InfoLandingPageFragmentKey infoLandingPageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, infoLandingPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InfoLandingPageFragmentKey getArgs(InfoLandingPageFragment infoLandingPageFragment) {
            return (InfoLandingPageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, infoLandingPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InfoLandingPageFragment newInstance(InfoLandingPageFragmentKey infoLandingPageFragmentKey) {
            return (InfoLandingPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, infoLandingPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InfoLandingPageFragment infoLandingPageFragment, InfoLandingPageFragmentKey infoLandingPageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, infoLandingPageFragment, infoLandingPageFragmentKey);
        }
    }
}
