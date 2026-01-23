package com.robinhood.android.retirement.gold;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.adjust.sdk.network.ErrorCodes;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.responsive.Density4;
import com.robinhood.android.retirement.gold.RetirementGoldPromo5;
import com.robinhood.android.retirement.gold.RetirementGoldPromoViewState;
import com.robinhood.android.retirement.lib.RetirementUpsellTheme;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementGoldPromo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"CloseButtonTag", "", "ErrorScreenTag", "RetirementGoldPromo", "", "state", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;", "callbacks", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState;Lcom/robinhood/android/retirement/gold/RetirementGoldPromoCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RetirementGoldPromoLottieHeight", "Landroidx/compose/ui/unit/Dp;", "getRetirementGoldPromoLottieHeight", "(Landroidx/compose/runtime/Composer;I)F", "goldPromoScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "identifier", "RetirementGoldPromoScreenLottie", "Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loaded;", "(Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RetirementGoldPromoScreen", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lcom/robinhood/android/retirement/gold/RetirementGoldPromoViewState$Loaded;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-gold_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "compositionState", "", "showFooterDivider", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.gold.RetirementGoldPromoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementGoldPromo5 {
    public static final String CloseButtonTag = "retirement_gold_promo_close_button";
    public static final String ErrorScreenTag = "retirement_gold_promo_error_screen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementGoldPromo$lambda$0(RetirementGoldPromoViewState retirementGoldPromoViewState, RetirementGoldPromo4 retirementGoldPromo4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementGoldPromo(retirementGoldPromoViewState, retirementGoldPromo4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementGoldPromoScreen$lambda$12(RetirementGoldPromoViewState.Loaded loaded, SduiActionHandler sduiActionHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementGoldPromoScreen(loaded, sduiActionHandler, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementGoldPromoScreenLottie$lambda$5(RetirementGoldPromoViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementGoldPromoScreenLottie(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RetirementGoldPromo(final RetirementGoldPromoViewState state, final RetirementGoldPromo4 callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(114988396);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(114988396, i3, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo (RetirementGoldPromo.kt:63)");
            }
            RetirementUpsellTheme.RetirementUpsellTheme(false, ComposableLambda3.rememberComposableLambda(1876131075, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromo.1
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
                        ComposerKt.traceEventStart(1876131075, i5, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo.<anonymous> (RetirementGoldPromo.kt:65)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    Modifier modifier2 = modifier;
                    final RetirementGoldPromo4 retirementGoldPromo4 = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1761972801, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromo.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1761972801, i7, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo.<anonymous>.<anonymous> (RetirementGoldPromo.kt:70)");
                            }
                            Function2<Composer, Integer, Unit> lambda$412700722$feature_retirement_gold_externalDebug = RetirementGoldPromo2.INSTANCE.getLambda$412700722$feature_retirement_gold_externalDebug();
                            final RetirementGoldPromo4 retirementGoldPromo42 = retirementGoldPromo4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$412700722$feature_retirement_gold_externalDebug, null, ComposableLambda3.rememberComposableLambda(348620382, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromo.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(348620382, i8, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo.<anonymous>.<anonymous>.<anonymous> (RetirementGoldPromo.kt:73)");
                                    }
                                    ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()));
                                    final RetirementGoldPromo4 retirementGoldPromo43 = retirementGoldPromo42;
                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1782310498, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromo.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i9) {
                                            if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1782310498, i9, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementGoldPromo.kt:74)");
                                            }
                                            BentoAppBarScope bentoAppBarScope = BentoAppBar;
                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RetirementGoldPromo5.CloseButtonTag);
                                            RetirementGoldPromo4 retirementGoldPromo44 = retirementGoldPromo43;
                                            composer5.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer5.changedInstance(retirementGoldPromo44);
                                            Object objRememberedValue = composer5.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new RetirementGoldPromo6(retirementGoldPromo44);
                                                composer5.updateRememberedValue(objRememberedValue);
                                            }
                                            composer5.endReplaceGroup();
                                            bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(modifierTestTag, false, 0L, (Function0) ((KFunction) objRememberedValue), composer5, (BentoAppBarScope.$stable << 12) | 6, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, ProvidedValue.$stable | 48);
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
                    final RetirementGoldPromoViewState retirementGoldPromoViewState = state;
                    final RetirementGoldPromo4 retirementGoldPromo42 = callbacks;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(538476564, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromo.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i8 = (composer3.changed(paddingValues) ? 4 : 2) | i7;
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(538476564, i8, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromo.<anonymous>.<anonymous> (RetirementGoldPromo.kt:83)");
                            }
                            RetirementGoldPromoViewState retirementGoldPromoViewState2 = retirementGoldPromoViewState;
                            if (retirementGoldPromoViewState2 instanceof RetirementGoldPromoViewState.Failure) {
                                composer3.startReplaceGroup(52583289);
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), RetirementGoldPromo5.ErrorScreenTag), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                RetirementGoldPromo4 retirementGoldPromo43 = retirementGoldPromo42;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(retirementGoldPromo43);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RetirementGoldPromo7(retirementGoldPromo43);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(modifierVerticalScroll$default, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composer3.endReplaceGroup();
                            } else if (retirementGoldPromoViewState2 instanceof RetirementGoldPromoViewState.Loading) {
                                composer3.startReplaceGroup(53010345);
                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, true, true, composer3, 3456, 2);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(retirementGoldPromoViewState2 instanceof RetirementGoldPromoViewState.Loaded)) {
                                    composer3.startReplaceGroup(2079904561);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(53328188);
                                RetirementGoldPromo5.RetirementGoldPromoScreen((RetirementGoldPromoViewState.Loaded) retirementGoldPromoViewState, retirementGoldPromo42, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementGoldPromo5.RetirementGoldPromo$lambda$0(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RetirementGoldPromoScreen$lambda$8(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final LottieComposition RetirementGoldPromoScreenLottie$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RetirementGoldPromoScreenLottie$lambda$2(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    @JvmName
    private static final float getRetirementGoldPromoLottieHeight(Composer composer, int i) {
        composer.startReplaceGroup(349900062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(349900062, i, -1, "com.robinhood.android.retirement.gold.<get-RetirementGoldPromoLottieHeight> (RetirementGoldPromo.kt:116)");
        }
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(Density4.isLowDensityScreen(composer, 0) ? 250 : 300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM7995constructorimpl;
    }

    public static final Screen goldPromoScreen(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new Screen(Screen.Name.RETIREMENT_GOLD_MATCH_VALUE_PROPS, null, identifier, null, 10, null);
    }

    public static /* synthetic */ Screen goldPromoScreen$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return goldPromoScreen(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementGoldPromoScreenLottie(final RetirementGoldPromoViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1446433816);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1446433816, i3, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromoScreenLottie (RetirementGoldPromo.kt:127)");
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(loaded.getLottieUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                modifier3 = modifier4;
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(RetirementGoldPromoScreenLottie$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(loaded.getLottieStartFrame()), Integer.valueOf(loaded.getLottieEndFrame()), true), 0.0f, 0, null, false, false, composerStartRestartGroup, LottieClipSpec.Frame.$stable << 12, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                LottieComposition lottieCompositionRetirementGoldPromoScreenLottie$lambda$1 = RetirementGoldPromoScreenLottie$lambda$1(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(RetirementGoldPromo5.RetirementGoldPromoScreenLottie$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionRetirementGoldPromoScreenLottie$lambda$1, (Function0) objRememberedValue, SizeKt.m5156height3ABfNKs(modifier3, getRetirementGoldPromoLottieHeight(composerStartRestartGroup, 0)), false, false, false, null, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementGoldPromo5.RetirementGoldPromoScreenLottie$lambda$5(loaded, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(loaded.getLottieUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            modifier3 = modifier4;
            lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(RetirementGoldPromoScreenLottie$lambda$1(lottieCompositionResultRememberLottieComposition2), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(loaded.getLottieStartFrame()), Integer.valueOf(loaded.getLottieEndFrame()), true), 0.0f, 0, null, false, false, composerStartRestartGroup, LottieClipSpec.Frame.$stable << 12, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            LottieComposition lottieCompositionRetirementGoldPromoScreenLottie$lambda$12 = RetirementGoldPromoScreenLottie$lambda$1(lottieCompositionResultRememberLottieComposition2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RetirementGoldPromo5.RetirementGoldPromoScreenLottie$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionRetirementGoldPromoScreenLottie$lambda$12, (Function0) objRememberedValue, SizeKt.m5156height3ABfNKs(modifier3, getRetirementGoldPromoLottieHeight(composerStartRestartGroup, 0)), false, false, false, null, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RetirementGoldPromoScreen(final RetirementGoldPromoViewState.Loaded loaded, final SduiActionHandler<? super GenericAction> sduiActionHandler, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2121368609);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2121368609, i3, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromoScreen (RetirementGoldPromo.kt:151)");
            }
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(RetirementGoldPromo5.RetirementGoldPromoScreen$lambda$7$lambda$6(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(1081463646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt.RetirementGoldPromoScreen.1

                /* compiled from: RetirementGoldPromo.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$RetirementGoldPromoScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ LazyListState $listState;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ SnapshotState4<Boolean> $showFooterDivider$delegate;
                    final /* synthetic */ RetirementGoldPromoViewState.Loaded $state;

                    AnonymousClass1(Modifier modifier, LazyListState lazyListState, RetirementGoldPromoViewState.Loaded loaded, SnapshotState4<Boolean> snapshotState4) {
                        this.$modifier = modifier;
                        this.$listState = lazyListState;
                        this.$state = loaded;
                        this.$showFooterDivider$delegate = snapshotState4;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-626916141, i, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromoScreen.<anonymous>.<anonymous> (RetirementGoldPromo.kt:162)");
                        }
                        Modifier modifier = this.$modifier;
                        LazyListState lazyListState = this.$listState;
                        final RetirementGoldPromoViewState.Loaded loaded = this.$state;
                        SnapshotState4<Boolean> snapshotState4 = this.$showFooterDivider$delegate;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(loaded);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$RetirementGoldPromoScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RetirementGoldPromo5.C270091.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(loaded, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierWeight$default, lazyListState, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 476);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), RetirementGoldPromo5.RetirementGoldPromoScreen$lambda$8(snapshotState4) ? 0.5f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer, 0, 5);
                        ImmutableList<UIComponent<GenericAction>> footer = loaded.getFooter();
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                        composer.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), true, composer, 100663296, 0);
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(final RetirementGoldPromoViewState.Loaded loaded, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1251188642, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$RetirementGoldPromoScreen$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1251188642, i, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementGoldPromo.kt:169)");
                                }
                                RetirementGoldPromo5.RetirementGoldPromoScreenLottie(loaded, null, composer, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        SduiColumns.sduiItems(LazyColumn, loaded.getBody(), GenericAction.class, null, null, HorizontalPadding.Default);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1081463646, i5, -1, "com.robinhood.android.retirement.gold.RetirementGoldPromoScreen.<anonymous> (RetirementGoldPromo.kt:161)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(loaded.getEventDescriptor(), ComposableLambda3.rememberComposableLambda(-626916141, true, new AnonymousClass1(modifier, lazyListStateRememberLazyListState, loaded, snapshotState4), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(loaded);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementGoldPromo5.RetirementGoldPromoScreen$lambda$11$lambda$10(current, loaded, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementGoldPromo5.RetirementGoldPromoScreen$lambda$12(loaded, sduiActionHandler, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RetirementGoldPromoScreen$lambda$7$lambda$6(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult RetirementGoldPromoScreen$lambda$11$lambda$10(final EventLogger eventLogger, final RetirementGoldPromoViewState.Loaded loaded, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(loaded.getEventDescriptor(), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$RetirementGoldPromoScreen$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(loaded.getEventDescriptor(), UserInteractionEventData.EventType.DISAPPEAR), false, false, 6, null);
            }
        };
    }
}
