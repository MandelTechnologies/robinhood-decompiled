package com.robinhood.android.futures.onboarding.p145ui.result;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultDuxo4;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: FuturesAccountResultFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AccountResultScreen", "", "viewState", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "callbacks", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$Callbacks;", "onBackPressed", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$Callbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-futures-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAccountResultFragment5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountResultScreen$lambda$0(FuturesAccountResultDuxo4 futuresAccountResultDuxo4, FuturesAccountResultFragment.Callbacks callbacks, Function0 function0, int i, Composer composer, int i2) {
        AccountResultScreen(futuresAccountResultDuxo4, callbacks, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountResultScreen(final FuturesAccountResultDuxo4 futuresAccountResultDuxo4, final FuturesAccountResultFragment.Callbacks callbacks, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-987401870);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(futuresAccountResultDuxo4) : composerStartRestartGroup.changedInstance(futuresAccountResultDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-987401870, i2, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountResultScreen (FuturesAccountResultFragment.kt:93)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(357802759, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt.AccountResultScreen.1
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
                        ComposerKt.traceEventStart(357802759, i3, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountResultScreen.<anonymous> (FuturesAccountResultFragment.kt:95)");
                    }
                    final Function0<Unit> function02 = function0;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2023364291, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt.AccountResultScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2023364291, i4, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountResultScreen.<anonymous>.<anonymous> (FuturesAccountResultFragment.kt:96)");
                            }
                            Function2<Composer, Integer, Unit> function2M14706getLambda$814475530$feature_futures_onboarding_externalDebug = FuturesAccountResultFragment2.INSTANCE.m14706getLambda$814475530$feature_futures_onboarding_externalDebug();
                            final Function0<Unit> function03 = function02;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M14706getLambda$814475530$feature_futures_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(422837282, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt.AccountResultScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i5 & 6) == 0) {
                                        i5 |= (i5 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(422837282, i5, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountResultScreen.<anonymous>.<anonymous>.<anonymous> (FuturesAccountResultFragment.kt:96)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final FuturesAccountResultDuxo4 futuresAccountResultDuxo42 = futuresAccountResultDuxo4;
                    final FuturesAccountResultFragment.Callbacks callbacks2 = callbacks;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-204188328, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt.AccountResultScreen.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            int i5;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i5 = (composer3.changed(paddingValues) ? 4 : 2) | i4;
                            } else {
                                i5 = i4;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-204188328, i5, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountResultScreen.<anonymous>.<anonymous> (FuturesAccountResultFragment.kt:98)");
                            }
                            FuturesAccountResultDuxo4 futuresAccountResultDuxo43 = futuresAccountResultDuxo42;
                            if (futuresAccountResultDuxo43 instanceof FuturesAccountResultDuxo4.Ineligible) {
                                composer3.startReplaceGroup(-1300646175);
                                boolean zIsEventsContracts = ((FuturesAccountResultDuxo4.Ineligible) futuresAccountResultDuxo43).isEventsContracts();
                                FuturesAccountResultFragment.Callbacks callbacks3 = callbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(callbacks3);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FuturesAccountResultFragment6(callbacks3);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                IneligibleScreen5.IneligibleScreen(zIsEventsContracts, (Function0) ((KFunction) objRememberedValue), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else if (Intrinsics.areEqual(futuresAccountResultDuxo43, FuturesAccountResultDuxo4.ManualReview.INSTANCE)) {
                                composer3.startReplaceGroup(-1300254521);
                                FuturesAccountResultFragment.Callbacks callbacks4 = callbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(callbacks4);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new FuturesAccountResultFragment7(callbacks4);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                ManualReviewScreen.ManualReviewScreen(PaddingKt.padding(Modifier.INSTANCE, paddingValues), (Function0) ((KFunction) objRememberedValue2), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(futuresAccountResultDuxo43 instanceof FuturesAccountResultDuxo4.Approved)) {
                                    composer3.startReplaceGroup(1343514654);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-1299930261);
                                FuturesAccountResultDuxo4.Approved approved = (FuturesAccountResultDuxo4.Approved) futuresAccountResultDuxo43;
                                FuturesAccountResultFragment.Callbacks callbacks5 = callbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer3.changedInstance(callbacks5);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new FuturesAccountResultFragment8(callbacks5);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceGroup();
                                AccountApprovedScreen.AccountApprovedScreen(approved, PaddingKt.padding(Modifier.INSTANCE, paddingValues), (Function0) ((KFunction) objRememberedValue3), composer3, StringResource.$stable, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAccountResultFragment5.AccountResultScreen$lambda$0(futuresAccountResultDuxo4, callbacks, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
