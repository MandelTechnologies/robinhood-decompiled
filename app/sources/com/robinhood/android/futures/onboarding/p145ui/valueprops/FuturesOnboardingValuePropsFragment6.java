package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsFragment6;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import futures_onboarding_value_props.proto.p463v1.PageDto;
import futures_onboarding_value_props.proto.p463v1.ThemeDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FuturesOnboardingValuePropsFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"ValuePropsScreen", "", "state", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsViewState;", "shouldTouchTopScreenEdge", "", "onSignupClicked", "Lkotlin/Function0;", "onPageThemeChanged", "Lkotlin/Function1;", "Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "onBackPressed", "(Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsViewState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-futures-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsFragment6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropsScreen$lambda$0(FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState, boolean z, Function0 function0, Function1 function1, Function0 function02, int i, Composer composer, int i2) {
        ValuePropsScreen(futuresOnboardingValuePropsViewState, z, function0, function1, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingValuePropsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$ValuePropsScreen$1 */
    static final class C174441 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onBackPressed;
        final /* synthetic */ Function1<ThemeDto, Unit> $onPageThemeChanged;
        final /* synthetic */ Function0<Unit> $onSignupClicked;
        final /* synthetic */ boolean $shouldTouchTopScreenEdge;
        final /* synthetic */ FuturesOnboardingValuePropsViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C174441(boolean z, FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super ThemeDto, Unit> function1) {
            this.$shouldTouchTopScreenEdge = z;
            this.$state = futuresOnboardingValuePropsViewState;
            this.$onBackPressed = function0;
            this.$onSignupClicked = function02;
            this.$onPageThemeChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesOnboardingValuePropsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$ValuePropsScreen$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ Function1<ThemeDto, Unit> $onPageThemeChanged;
            final /* synthetic */ Function0<Unit> $onSignupClicked;
            final /* synthetic */ FuturesOnboardingValuePropsViewState $state;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState, Function0<Unit> function0, Function1<? super ThemeDto, Unit> function1) {
                this.$state = futuresOnboardingValuePropsViewState;
                this.$onSignupClicked = function0;
                this.$onPageThemeChanged = function1;
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
                    ComposerKt.traceEventStart(35083905, i, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen.<anonymous>.<anonymous> (FuturesOnboardingValuePropsFragment.kt:138)");
                }
                if (this.$state.isLoading()) {
                    composer.startReplaceGroup(1507627362);
                    LoadingScreenComposablesKt.PromoLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 1, composer, 48, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1507866527);
                    Function0<Unit> function0 = this.$onSignupClicked;
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                    ImmutableList<PageDto> pages = this.$state.getPages();
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(this.$onPageThemeChanged);
                    final Function1<ThemeDto, Unit> function1 = this.$onPageThemeChanged;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$ValuePropsScreen$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FuturesOnboardingValuePropsFragment6.C174441.AnonymousClass2.invoke$lambda$1$lambda$0(function1, (PageDto) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    FuturesOnboardingValuePropsScreen.FuturesOnboardingValuePropsScreen(function0, strStringResource, pages, (Function1) objRememberedValue, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 0, 0);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Function1 function1, PageDto page) {
                Intrinsics.checkNotNullParameter(page, "page");
                function1.invoke(page.getTheme());
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212911017, i, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen.<anonymous> (FuturesOnboardingValuePropsFragment.kt:127)");
            }
            if (!this.$shouldTouchTopScreenEdge || this.$state.isLoading()) {
                composer.startReplaceGroup(834687265);
                final Function0<Unit> function0 = this.$onBackPressed;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-931987402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt.ValuePropsScreen.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-931987402, i2, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen.<anonymous>.<anonymous> (FuturesOnboardingValuePropsFragment.kt:130)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1114766883$feature_futures_onboarding_externalDebug = FuturesOnboardingValuePropsFragment2.INSTANCE.getLambda$1114766883$feature_futures_onboarding_externalDebug();
                        final Function0<Unit> function02 = function0;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1114766883$feature_futures_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-231271049, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt.ValuePropsScreen.1.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i3 & 6) == 0) {
                                    i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i3 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-231271049, i3, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen.<anonymous>.<anonymous>.<anonymous> (FuturesOnboardingValuePropsFragment.kt:133)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(35083905, true, new AnonymousClass2(this.$state, this.$onSignupClicked, this.$onPageThemeChanged), composer, 54), composer, 805306416, 509);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(835933155);
                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(Modifier.INSTANCE, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                Function0<Unit> function02 = this.$onSignupClicked;
                FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState = this.$state;
                final Function1<ThemeDto, Unit> function1 = this.$onPageThemeChanged;
                final Function0<Unit> function03 = this.$onBackPressed;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                ImmutableList<PageDto> pages = futuresOnboardingValuePropsViewState.getPages();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$ValuePropsScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesOnboardingValuePropsFragment6.C174441.invoke$lambda$2$lambda$1$lambda$0(function1, (PageDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                FuturesOnboardingValuePropsScreen.FuturesOnboardingValuePropsScreen(function02, strStringResource, pages, (Function1) objRememberedValue, null, composer, 0, 16);
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(FuturesOnboardingValuePropsFragment2.INSTANCE.m14724getLambda$2078095314$feature_futures_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1459575426, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$ValuePropsScreen$1$3$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i2 & 6) == 0) {
                            i2 |= (i2 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i2 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1459575426, i2, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen.<anonymous>.<anonymous>.<anonymous> (FuturesOnboardingValuePropsFragment.kt:174)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer2, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2010);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, PageDto page) {
            Intrinsics.checkNotNullParameter(page, "page");
            function1.invoke(page.getTheme());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ValuePropsScreen(final FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState, final boolean z, final Function0<Unit> function0, final Function1<? super ThemeDto, Unit> function1, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1572218700);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(futuresOnboardingValuePropsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1572218700, i2, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ValuePropsScreen (FuturesOnboardingValuePropsFragment.kt:125)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-212911017, true, new C174441(z, futuresOnboardingValuePropsViewState, function02, function0, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOnboardingValuePropsFragment6.ValuePropsScreen$lambda$0(futuresOnboardingValuePropsViewState, z, function0, function1, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
