package com.robinhood.android.recommendations.retirement.lib.p222ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.recommendations.retirement.lib.C26016R;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementUnavailableContent4;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecsRetirementUnavailableContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002"}, m3636d2 = {"CloseButtonTag", "", "UnavailableContent", "", "state", "Lcom/robinhood/android/recommendations/retirement/lib/ui/UnavailableContentState;", "callbacks", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableContentCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/recommendations/retirement/lib/ui/UnavailableContentState;Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableContentCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainContent", "feature-lib-recommendations-for-retirement_externalDebug", "loadingLottie", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementUnavailableContent4 {
    public static final String CloseButtonTag = "closeButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MainContent$lambda$7$lambda$4$lambda$3() {
        return 0.35150167f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$8(UnavailableContentState unavailableContentState, RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(unavailableContentState, recsRetirementUnavailableContent3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnavailableContent$lambda$1(UnavailableContentState unavailableContentState, RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnavailableContent(unavailableContentState, recsRetirementUnavailableContent3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnavailableContent(final UnavailableContentState state, final RecsRetirementUnavailableContent3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SystemUiController systemUiControllerRememberSystemUiController;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-945772104);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-945772104, i3, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent (RecsRetirementUnavailableContent.kt:47)");
                }
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new RecsRetirementUnavailableContent7(systemUiControllerRememberSystemUiController, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-756402320, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-756402320, i5, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous> (RecsRetirementUnavailableContent.kt:54)");
                        }
                        final UnavailableContentState unavailableContentState = state;
                        final Modifier modifier6 = modifier4;
                        final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3 = callbacks;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-69195781, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-69195781, i6, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:55)");
                                }
                                long jM17804getBackgroundColor0d7_KjU = unavailableContentState.m17804getBackgroundColor0d7_KjU();
                                Modifier modifier7 = modifier6;
                                final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent32 = recsRetirementUnavailableContent3;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1090746945, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1090746945, i7, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:57)");
                                        }
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(RecsRetirementUnavailableContent.INSTANCE.m2391x4bf7c5c8(), null, ComposableLambda3.rememberComposableLambda(1552157376, true, new C504801(recsRetirementUnavailableContent32), composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: RecsRetirementUnavailableContent.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C504801 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                        final /* synthetic */ RecsRetirementUnavailableContent3 $callbacks;

                                        C504801(RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3) {
                                            this.$callbacks = recsRetirementUnavailableContent3;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                            invoke(bentoAppBarScope, composer, num.intValue());
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
                                                ComposerKt.traceEventStart(1552157376, i, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:61)");
                                            }
                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "closeButton");
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
                                            final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3 = this.$callbacks;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$2$1$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RecsRetirementUnavailableContent4.C260242.AnonymousClass1.C504791.C504801.invoke$lambda$1$lambda$0(recsRetirementUnavailableContent3);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierTestTag, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3) {
                                            recsRetirementUnavailableContent3.onCloseClick();
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54);
                                final UnavailableContentState unavailableContentState2 = unavailableContentState;
                                final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent33 = recsRetirementUnavailableContent3;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier7, composableLambdaRememberComposableLambda, null, null, null, 0, jM17804getBackgroundColor0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-2121561782, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i7 & 6) == 0) {
                                            i7 |= composer4.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2121561782, i7, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:71)");
                                        }
                                        RecsRetirementUnavailableContent4.MainContent(unavailableContentState2, recsRetirementUnavailableContent33, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306416, 444);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementUnavailableContent4.UnavailableContent$lambda$1(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i3 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new RecsRetirementUnavailableContent7(systemUiControllerRememberSystemUiController, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifier52 = modifier4;
                BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-756402320, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-756402320, i5, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous> (RecsRetirementUnavailableContent.kt:54)");
                        }
                        final UnavailableContentState unavailableContentState = state;
                        final Modifier modifier6 = modifier4;
                        final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3 = callbacks;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-69195781, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-69195781, i6, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:55)");
                                }
                                long jM17804getBackgroundColor0d7_KjU = unavailableContentState.m17804getBackgroundColor0d7_KjU();
                                Modifier modifier7 = modifier6;
                                final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent32 = recsRetirementUnavailableContent3;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1090746945, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1090746945, i7, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:57)");
                                        }
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(RecsRetirementUnavailableContent.INSTANCE.m2391x4bf7c5c8(), null, ComposableLambda3.rememberComposableLambda(1552157376, true, new C504801(recsRetirementUnavailableContent32), composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: RecsRetirementUnavailableContent.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C504801 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                        final /* synthetic */ RecsRetirementUnavailableContent3 $callbacks;

                                        C504801(RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3) {
                                            this.$callbacks = recsRetirementUnavailableContent3;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                            invoke(bentoAppBarScope, composer, num.intValue());
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
                                                ComposerKt.traceEventStart(1552157376, i, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:61)");
                                            }
                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "closeButton");
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
                                            final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3 = this.$callbacks;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$UnavailableContent$2$1$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RecsRetirementUnavailableContent4.C260242.AnonymousClass1.C504791.C504801.invoke$lambda$1$lambda$0(recsRetirementUnavailableContent3);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierTestTag, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3) {
                                            recsRetirementUnavailableContent3.onCloseClick();
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54);
                                final UnavailableContentState unavailableContentState2 = unavailableContentState;
                                final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent33 = recsRetirementUnavailableContent3;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier7, composableLambdaRememberComposableLambda, null, null, null, 0, jM17804getBackgroundColor0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-2121561782, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt.UnavailableContent.2.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i7 & 6) == 0) {
                                            i7 |= composer4.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2121561782, i7, -1, "com.robinhood.android.recommendations.retirement.lib.ui.UnavailableContent.<anonymous>.<anonymous>.<anonymous> (RecsRetirementUnavailableContent.kt:71)");
                                        }
                                        RecsRetirementUnavailableContent4.MainContent(unavailableContentState2, recsRetirementUnavailableContent33, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306416, 444);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition MainContent$lambda$2(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final UnavailableContentState unavailableContentState, RecsRetirementUnavailableContent3 recsRetirementUnavailableContent3, Modifier modifier, Composer composer, final int i, final int i2) {
        UnavailableContentState unavailableContentState2;
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        int i5;
        Object obj;
        boolean z;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final RecsRetirementUnavailableContent3 recsRetirementUnavailableContent32 = recsRetirementUnavailableContent3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1029535555);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            unavailableContentState2 = unavailableContentState;
        } else if ((i & 6) == 0) {
            unavailableContentState2 = unavailableContentState;
            i3 = (composerStartRestartGroup.changed(unavailableContentState2) ? 4 : 2) | i;
        } else {
            unavailableContentState2 = unavailableContentState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(recsRetirementUnavailableContent32) : composerStartRestartGroup.changedInstance(recsRetirementUnavailableContent32) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1029535555, i4, -1, "com.robinhood.android.recommendations.retirement.lib.ui.MainContent (RecsRetirementUnavailableContent.kt:86)");
                }
                Modifier modifier5 = modifier4;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C26016R.raw.recs_ret_loading)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5144paddingVpY3zN4$default(modifier5, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = unavailableContentState2.getTitle();
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleLarge();
                Color.Companion companion3 = Color.INSTANCE;
                boolean z2 = false;
                BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(companion3.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composerStartRestartGroup, 384, 0, 8186);
                LottieComposition lottieCompositionMainContent$lambda$2 = MainContent$lambda$2(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(RecsRetirementUnavailableContent4.MainContent$lambda$7$lambda$4$lambda$3());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                LottieAnimation2.LottieAnimation(lottieCompositionMainContent$lambda$2, (Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Column5.weight$default(column6, PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null), 0.0f, 1, null), false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 48, 0, 65528);
                BentoText2.m20747BentoText38GnDrw(unavailableContentState.getSubtitle(), PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(companion3.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 384, 0, 8184);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 1, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                i5 = i4 & 112;
                if (i5 == 32) {
                    if ((i4 & 64) != 0) {
                        obj = recsRetirementUnavailableContent3;
                        if (composerStartRestartGroup.changedInstance(obj)) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new RecsRetirementUnavailableContent5(obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), unavailableContentState.getPrimaryCta(), modifierFillMaxWidth$default, null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i5 == 32) {
                            recsRetirementUnavailableContent32 = recsRetirementUnavailableContent3;
                            if ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(recsRetirementUnavailableContent32)) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new RecsRetirementUnavailableContent6(recsRetirementUnavailableContent32);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), unavailableContentState.getSecondaryCta(), modifierFillMaxWidth$default2, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            recsRetirementUnavailableContent32 = recsRetirementUnavailableContent3;
                        }
                        z2 = true;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            objRememberedValue3 = new RecsRetirementUnavailableContent6(recsRetirementUnavailableContent32);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), unavailableContentState.getSecondaryCta(), modifierFillMaxWidth$default2, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                        }
                    } else {
                        obj = recsRetirementUnavailableContent3;
                    }
                    z = false;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new RecsRetirementUnavailableContent5(obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), unavailableContentState.getPrimaryCta(), modifierFillMaxWidth$default, null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i5 == 32) {
                        }
                        z2 = true;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                        }
                    }
                } else {
                    obj = recsRetirementUnavailableContent3;
                }
                z = true;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RecsRetirementUnavailableContent4.MainContent$lambda$8(unavailableContentState, recsRetirementUnavailableContent32, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C26016R.raw.recs_ret_loading)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(PaddingKt.m5144paddingVpY3zN4$default(modifier52, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String title2 = unavailableContentState2.getTitle();
                TextStyle displayCapsuleLarge2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleLarge();
                Color.Companion companion32 = Color.INSTANCE;
                boolean z22 = false;
                BentoText2.m20747BentoText38GnDrw(title2, null, Color.m6701boximpl(companion32.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge2, composerStartRestartGroup, 384, 0, 8186);
                LottieComposition lottieCompositionMainContent$lambda$22 = MainContent$lambda$2(lottieCompositionResultRememberLottieComposition2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                LottieAnimation2.LottieAnimation(lottieCompositionMainContent$lambda$22, (Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Column5.weight$default(column62, PaddingKt.m5143paddingVpY3zN4(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21591getLargeD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null), 0.0f, 1, null), false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 48, 0, 65528);
                BentoText2.m20747BentoText38GnDrw(unavailableContentState.getSubtitle(), PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(companion32.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 384, 0, 8184);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 1, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                i5 = i4 & 112;
                if (i5 == 32) {
                }
                z = true;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
