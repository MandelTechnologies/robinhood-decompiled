package com.robinhood.android.advisory.onboarding.portfolioreveal.intro;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil.Coil;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.AdvisoryOnboardingSharedComponents;
import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreen7;
import com.robinhood.android.advisory.onboarding.portfolioreveal.PortfolioRevealUtils;
import com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposable;
import com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntroDataState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.onboarding.PortfolioRevealResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryPortfolioRevealIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aC\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"TopMostColorDarkMode", "Landroidx/compose/ui/graphics/Color;", "J", "TopMostColorLightMode", "PortfolioRevealIntroComposable", "", "onContinueClick", "Lkotlin/Function1;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioIntroRevealDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioIntroRevealDuxo;Landroidx/compose/runtime/Composer;II)V", "PortfolioRevealIntro", "intro", "Lcom/robinhood/models/advisory/db/onboarding/PortfolioRevealResponse$Intro;", "(Lcom/robinhood/models/advisory/db/onboarding/PortfolioRevealResponse$Intro;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-onboarding_externalDebug", "state", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/PortfolioRevealIntroDataState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealIntroComposable {
    private static final long TopMostColorDarkMode = Color2.Color(4286613146L);
    private static final long TopMostColorLightMode = Color2.Color(4278255873L);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRevealIntro$lambda$7(PortfolioRevealResponse.Intro intro, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PortfolioRevealIntro(intro, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRevealIntroComposable$lambda$6(Function1 function1, Function0 function0, Modifier modifier, AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioRevealIntroComposable(function1, function0, modifier, advisoryPortfolioIntroRevealDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$8(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioRevealIntroComposable(final Function1<? super GetPortfolioRevealResponseDto, Unit> onContinueClick, final Function0<Unit> onBackClicked, Modifier modifier, AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo2;
        Modifier modifier3;
        AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo3;
        final GetPortfolioRevealResponseDto portfolioReveal;
        final boolean isDay;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1950202404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinueClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    advisoryPortfolioIntroRevealDuxo2 = advisoryPortfolioIntroRevealDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(advisoryPortfolioIntroRevealDuxo2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    advisoryPortfolioIntroRevealDuxo2 = advisoryPortfolioIntroRevealDuxo;
                }
                i3 |= i5;
            } else {
                advisoryPortfolioIntroRevealDuxo2 = advisoryPortfolioIntroRevealDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisoryPortfolioIntroRevealDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        advisoryPortfolioIntroRevealDuxo3 = (AdvisoryPortfolioIntroRevealDuxo) baseDuxo;
                        i3 &= -7169;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1950202404, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntroComposable (AdvisoryPortfolioRevealIntroComposable.kt:55)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisoryPortfolioIntroRevealDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    portfolioReveal = PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getPortfolioReveal();
                    isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-2136352231, true, new C90351(modifier5, snapshotState4CollectAsStateWithLifecycle, onContinueClick, onBackClicked, advisoryPortfolioIntroRevealDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(portfolioReveal) | composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntroComposable$lambda$5$lambda$4(portfolioReveal, isDay, context, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(portfolioReveal, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    advisoryPortfolioIntroRevealDuxo4 = advisoryPortfolioIntroRevealDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                advisoryPortfolioIntroRevealDuxo3 = advisoryPortfolioIntroRevealDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advisoryPortfolioIntroRevealDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                portfolioReveal = PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getPortfolioReveal();
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-2136352231, true, new C90351(modifier52, snapshotState4CollectAsStateWithLifecycle2, onContinueClick, onBackClicked, advisoryPortfolioIntroRevealDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(portfolioReveal) | composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntroComposable$lambda$5$lambda$4(portfolioReveal, isDay, context, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(portfolioReveal, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    advisoryPortfolioIntroRevealDuxo4 = advisoryPortfolioIntroRevealDuxo3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                advisoryPortfolioIntroRevealDuxo4 = advisoryPortfolioIntroRevealDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntroComposable$lambda$6(onContinueClick, onBackClicked, modifier4, advisoryPortfolioIntroRevealDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                    advisoryPortfolioIntroRevealDuxo3 = advisoryPortfolioIntroRevealDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(advisoryPortfolioIntroRevealDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                portfolioReveal = PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getPortfolioReveal();
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                Modifier modifier522 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, PortfolioRevealIntroComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-2136352231, true, new C90351(modifier522, snapshotState4CollectAsStateWithLifecycle22, onContinueClick, onBackClicked, advisoryPortfolioIntroRevealDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(portfolioReveal) | composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AdvisoryPortfolioRevealIntroComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$1 */
    static final class C90351 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AdvisoryPortfolioIntroRevealDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onBackClicked;
        final /* synthetic */ Function1<GetPortfolioRevealResponseDto, Unit> $onContinueClick;
        final /* synthetic */ SnapshotState4<PortfolioRevealIntroDataState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C90351(Modifier modifier, SnapshotState4<PortfolioRevealIntroDataState> snapshotState4, Function1<? super GetPortfolioRevealResponseDto, Unit> function1, Function0<Unit> function0, AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo) {
            this.$modifier = modifier;
            this.$state$delegate = snapshotState4;
            this.$onContinueClick = function1;
            this.$onBackClicked = function0;
            this.$duxo = advisoryPortfolioIntroRevealDuxo;
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
                ComposerKt.traceEventStart(-2136352231, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntroComposable.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:64)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(this.$modifier);
            PortfolioRevealIntroDataState.ViewState viewState = AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntroComposable$lambda$0(this.$state$delegate).getViewState();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryPortfolioRevealIntroComposable.C90351.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(viewState, modifierNavigationBarsPadding, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(1577952928, true, new AnonymousClass2(this.$onContinueClick, this.$onBackClicked, this.$duxo), composer, 54), composer, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }

        /* compiled from: AdvisoryPortfolioRevealIntroComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function4<AnimatedContentScope, PortfolioRevealIntroDataState.ViewState, Composer, Integer, Unit> {
            final /* synthetic */ AdvisoryPortfolioIntroRevealDuxo $duxo;
            final /* synthetic */ Function0<Unit> $onBackClicked;
            final /* synthetic */ Function1<GetPortfolioRevealResponseDto, Unit> $onContinueClick;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super GetPortfolioRevealResponseDto, Unit> function1, Function0<Unit> function0, AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo) {
                this.$onContinueClick = function1;
                this.$onBackClicked = function0;
                this.$duxo = advisoryPortfolioIntroRevealDuxo;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, PortfolioRevealIntroDataState.ViewState viewState, Composer composer, Integer num) {
                invoke(animatedContentScope, viewState, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, final PortfolioRevealIntroDataState.ViewState vs, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(vs, "vs");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1577952928, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntroComposable.<anonymous>.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:71)");
                }
                if (vs instanceof PortfolioRevealIntroDataState.ViewState.Loaded) {
                    composer.startReplaceGroup(378733070);
                    PortfolioRevealResponse.Intro intro = ((PortfolioRevealIntroDataState.ViewState.Loaded) vs).getIntro();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changedInstance(vs)) || (i & 48) == 32) | composer.changed(this.$onContinueClick);
                    final Function1<GetPortfolioRevealResponseDto, Unit> function1 = this.$onContinueClick;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvisoryPortfolioRevealIntroComposable.C90351.AnonymousClass2.invoke$lambda$1$lambda$0(function1, vs);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntro(intro, (Function0) objRememberedValue, this.$onBackClicked, null, composer, 0, 8);
                    composer.endReplaceGroup();
                } else {
                    if (!(vs instanceof PortfolioRevealIntroDataState.ViewState.Loading)) {
                        composer.startReplaceGroup(289309672);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(379107829);
                    ImmutableList<Integer> messages = ((PortfolioRevealIntroDataState.ViewState.Loading) vs).getMessages();
                    AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo = this.$duxo;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(advisoryPortfolioIntroRevealDuxo);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new AdvisoryPortfolioRevealIntroComposable3(advisoryPortfolioIntroRevealDuxo);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    PortfolioRevealLoadingScreen.PortfolioRevealLoading(messages, (Function0) ((KFunction) objRememberedValue2), null, composer, 0, 4);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Function1 function1, PortfolioRevealIntroDataState.ViewState viewState) {
                function1.invoke(((PortfolioRevealIntroDataState.ViewState.Loaded) viewState).getResponse());
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioRevealIntroDataState PortfolioRevealIntroComposable$lambda$0(SnapshotState4<PortfolioRevealIntroDataState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PortfolioRevealIntroComposable$lambda$5$lambda$4(GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, boolean z, Context context, DisposableEffectScope DisposableEffect) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (getPortfolioRevealResponseDto == null || (listEmptyList = PortfolioRevealUtils.getImageUrls(getPortfolioRevealResponseDto, z)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Coil.imageLoader(context).enqueue(new ImageRequest.Builder(context).data((String) it.next()).build()));
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntroComposable$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Disposable) it2.next()).dispose();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioRevealIntro(final PortfolioRevealResponse.Intro intro, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145471012);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(intro) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1145471012, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro (AdvisoryPortfolioRevealIntroComposable.kt:117)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_INTRO, null, intro.getIdentifier(), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1932191431, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt.PortfolioRevealIntro.1
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1932191431, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:126)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                        PortfolioRevealResponse.Intro intro2 = intro;
                        final Function0<Unit> function03 = function02;
                        Function0<Unit> function04 = function0;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composer2, i6).getIsDay() ? AdvisoryPortfolioRevealIntroComposable.TopMostColorLightMode : AdvisoryPortfolioRevealIntroComposable.TopMostColorDarkMode, null, 2, null), 1.0f, false, 2, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        StrategiesValuePropsScreen7.StrategiesVideoContent(bentoTheme.getColors(composer2, i6).getIsDay() ? intro2.getVideoLightUrl() : intro2.getVideoDarkUrl(), boxScopeInstance.align(companion3, companion.getBottomCenter()), composer2, 0, 0);
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdvisoryPortfolioRevealIntroComposable4.INSTANCE.m11110getLambda$13734402$feature_advisory_onboarding_externalDebug(), boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getTopCenter()), ComposableLambda3.rememberComposableLambda(-512958678, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntro$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i8 = ((i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-512958678, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:158)");
                                }
                                Boolean bool = Boolean.FALSE;
                                final Function0<Unit> function05 = function03;
                                BentoTheme2.BentoTheme(bool, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1463272050, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntro$1$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1463272050, i9, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:161)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function05, composer4, BentoAppBarScope.$stable << 12, 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2008);
                        composer2.endNode();
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(intro2.getTitle(), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getAdvisoryOnboardingFancyTitle(bentoTheme.getTypography(composer2, i6)), composer2, 0, 0, 8188);
                        BentoMarkdownText2.BentoMarkdownText(intro2.getSubtitle(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i6).getTextM(), 0, bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function04, intro2.getCtaText(), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 47, null), true, false, false, true, false, null, 108, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryPortfolioRevealIntroComposable.PortfolioRevealIntro$lambda$7(intro, function0, function02, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_INTRO, null, intro.getIdentifier(), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1932191431, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt.PortfolioRevealIntro.1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1932191431, i5, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:126)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                    PortfolioRevealResponse.Intro intro2 = intro;
                    final Function0<Unit> function03 = function02;
                    Function0<Unit> function04 = function0;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composer2, i6).getIsDay() ? AdvisoryPortfolioRevealIntroComposable.TopMostColorLightMode : AdvisoryPortfolioRevealIntroComposable.TopMostColorDarkMode, null, 2, null), 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    StrategiesValuePropsScreen7.StrategiesVideoContent(bentoTheme.getColors(composer2, i6).getIsDay() ? intro2.getVideoLightUrl() : intro2.getVideoDarkUrl(), boxScopeInstance.align(companion3, companion.getBottomCenter()), composer2, 0, 0);
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdvisoryPortfolioRevealIntroComposable4.INSTANCE.m11110getLambda$13734402$feature_advisory_onboarding_externalDebug(), boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getTopCenter()), ComposableLambda3.rememberComposableLambda(-512958678, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntro$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i8 = ((i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-512958678, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:158)");
                            }
                            Boolean bool = Boolean.FALSE;
                            final Function0<Unit> function05 = function03;
                            BentoTheme2.BentoTheme(bool, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1463272050, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$PortfolioRevealIntro$1$1$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1463272050, i9, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:161)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function05, composer4, BentoAppBarScope.$stable << 12, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2008);
                    composer2.endNode();
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(intro2.getTitle(), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getAdvisoryOnboardingFancyTitle(bentoTheme.getTypography(composer2, i6)), composer2, 0, 0, 8188);
                    BentoMarkdownText2.BentoMarkdownText(intro2.getSubtitle(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i6).getTextM(), 0, bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function04, intro2.getCtaText(), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 47, null), true, false, false, true, false, null, 108, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1140401288);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1140401288, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.Preview (AdvisoryPortfolioRevealIntroComposable.kt:213)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, AdvisoryPortfolioRevealIntroComposable4.INSTANCE.m11111getLambda$145664560$feature_advisory_onboarding_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPortfolioRevealIntroComposable.Preview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
