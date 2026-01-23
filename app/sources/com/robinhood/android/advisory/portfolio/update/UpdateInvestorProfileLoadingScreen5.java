package com.robinhood.android.advisory.portfolio.update;

import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdateInvestorProfileLoadingScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"UpdateInvestorProfileLoadingScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UpdateInvestorProfileLoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileLoadingScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileLoadingScreen$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpdateInvestorProfileLoadingScreen(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileLoadingScreenPreview$lambda$3(int i, Composer composer, int i2) {
        UpdateInvestorProfileLoadingScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdateInvestorProfileLoadingScreen(final Function0<Unit> onBackClicked, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(644293037);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644293037, i3, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreen (UpdateInvestorProfileLoadingScreen.kt:33)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(25081661, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt.UpdateInvestorProfileLoadingScreen.1
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
                        ComposerKt.traceEventStart(25081661, i5, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreen.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:37)");
                    }
                    Modifier modifier2 = modifier;
                    final Function0<Unit> function0 = onBackClicked;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1836009729, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt.UpdateInvestorProfileLoadingScreen.1.1
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
                                ComposerKt.traceEventStart(1836009729, i6, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreen.<anonymous>.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:39)");
                            }
                            Function2<Composer, Integer, Unit> function2M11179getLambda$700554066$feature_advisory_portfolio_externalDebug = UpdateInvestorProfileLoadingScreen.INSTANCE.m11179getLambda$700554066$feature_advisory_portfolio_externalDebug();
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11179getLambda$700554066$feature_advisory_portfolio_externalDebug, null, ComposableLambda3.rememberComposableLambda(1586047746, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt.UpdateInvestorProfileLoadingScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1586047746, i7, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreen.<anonymous>.<anonymous>.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:48)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    UpdateInvestorProfileLoadingScreen updateInvestorProfileLoadingScreen = UpdateInvestorProfileLoadingScreen.INSTANCE;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, updateInvestorProfileLoadingScreen.m11178getLambda$312391102$feature_advisory_portfolio_externalDebug(), null, null, 0, 0L, 0L, null, updateInvestorProfileLoadingScreen.getLambda$462605196$feature_advisory_portfolio_externalDebug(), composer2, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateInvestorProfileLoadingScreen5.UpdateInvestorProfileLoadingScreen$lambda$0(onBackClicked, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void UpdateInvestorProfileLoadingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1440863178);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1440863178, i, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenPreview (UpdateInvestorProfileLoadingScreen.kt:99)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            UpdateInvestorProfileLoadingScreen((Function0) objRememberedValue, null, composerStartRestartGroup, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileLoadingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateInvestorProfileLoadingScreen5.UpdateInvestorProfileLoadingScreenPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
