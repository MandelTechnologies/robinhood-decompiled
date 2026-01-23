package com.robinhood.android.retirement.partnerships.matchhub;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchHubResponse;
import com.robinhood.android.retirement.lib.StickyFooterColumn;
import com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubViewState;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementMatchHubScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {RetirementMatchHubScreen4.MatchHubLoading, "", RetirementMatchHubScreen4.MatchHubBackButton, RetirementMatchHubScreen4.MatchHubHeader, "MatchHubScreen", "", "viewState", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "callbacks", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MatchHubContent", "MatchHub", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loaded;", "(Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loaded;Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "header", "Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse$MatchHubHeader;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse$MatchHubHeader;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-partnerships_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementMatchHubScreen4 {
    public static final String MatchHubBackButton = "MatchHubBackButton";
    public static final String MatchHubHeader = "MatchHubHeader";
    public static final String MatchHubLoading = "MatchHubLoading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchHub$lambda$4(RetirementMatchHubViewState.Loaded loaded, RetirementMatchHubScreen3 retirementMatchHubScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchHub(loaded, retirementMatchHubScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchHubContent$lambda$3(RetirementMatchHubViewState retirementMatchHubViewState, RetirementMatchHubScreen3 retirementMatchHubScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchHubContent(retirementMatchHubViewState, retirementMatchHubScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchHubHeader$lambda$6(ApiRetirementMatchHubResponse.MatchHubHeader matchHubHeader, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchHubHeader(matchHubHeader, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchHubScreen$lambda$1(RetirementMatchHubViewState retirementMatchHubViewState, RetirementMatchHubScreen3 retirementMatchHubScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchHubScreen(retirementMatchHubViewState, retirementMatchHubScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchHubScreen(final RetirementMatchHubViewState viewState, final RetirementMatchHubScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Ref.LongRef longRef;
        BentoTheme bentoTheme;
        int i4;
        final Ref.LongRef longRef2;
        Composer composer2;
        final Modifier modifier3;
        Color composeColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1345727606);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1345727606, i3, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen (RetirementMatchHubScreen.kt:49)");
                }
                longRef = new Ref.LongRef();
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                longRef.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                longRef2 = new Ref.LongRef();
                longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-459065241);
                if ((viewState instanceof RetirementMatchHubViewState.Loaded) && (composeColor = SduiColors2.toComposeColor(((RetirementMatchHubViewState.Loaded) viewState).getHeader().getBackground_color(), composerStartRestartGroup, 0)) != null) {
                    longRef.element = composeColor.getValue();
                    longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).getNova();
                }
                composerStartRestartGroup.endReplaceGroup();
                SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), longRef.element, false, null, 6, null);
                int i6 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-790810554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2
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
                            ComposerKt.traceEventStart(-790810554, i7, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous> (RetirementMatchHubScreen.kt:64)");
                        }
                        Function2<Composer, Integer, Unit> function2M2437xab38d59e = RetirementMatchHubScreen.INSTANCE.m2437xab38d59e();
                        final Ref.LongRef longRef3 = longRef2;
                        final RetirementMatchHubScreen3 retirementMatchHubScreen3 = callbacks;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2437xab38d59e, null, ComposableLambda3.rememberComposableLambda(1267635173, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1267635173, i9, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous>.<anonymous> (RetirementMatchHubScreen.kt:67)");
                                }
                                long j = longRef3.element;
                                final RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(216556727, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i10) {
                                        if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(216556727, i10, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous>.<anonymous>.<anonymous> (RetirementMatchHubScreen.kt:70)");
                                        }
                                        RetirementMatchHubScreen3 retirementMatchHubScreen33 = retirementMatchHubScreen32;
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChanged = composer5.changed(retirementMatchHubScreen33);
                                        Object objRememberedValue = composer5.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new RetirementMatchHubScreen6(retirementMatchHubScreen33);
                                            composer5.updateRememberedValue(objRememberedValue);
                                        }
                                        composer5.endReplaceGroup();
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, RetirementMatchHubScreen4.MatchHubBackButton), false, 0L, (Function0) ((KFunction) objRememberedValue), composer5, (BentoAppBarScope.$stable << 12) | 6, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 805306368, 509);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(longRef.element), 0L, null, composer3, 390, 0, 1786);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1263273061, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1263273061, i7, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous> (RetirementMatchHubScreen.kt:83)");
                        }
                        RetirementMatchHubScreen4.MatchHubContent(viewState, callbacks, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i6, 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementMatchHubScreen4.MatchHubScreen$lambda$1(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            longRef = new Ref.LongRef();
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            longRef.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
            longRef2 = new Ref.LongRef();
            longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-459065241);
            if (viewState instanceof RetirementMatchHubViewState.Loaded) {
                longRef.element = composeColor.getValue();
                longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).getNova();
            }
            composerStartRestartGroup.endReplaceGroup();
            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), longRef.element, false, null, 6, null);
            int i62 = ((i3 >> 6) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-790810554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2
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
                        ComposerKt.traceEventStart(-790810554, i7, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous> (RetirementMatchHubScreen.kt:64)");
                    }
                    Function2<Composer, Integer, Unit> function2M2437xab38d59e = RetirementMatchHubScreen.INSTANCE.m2437xab38d59e();
                    final Ref.LongRef longRef3 = longRef2;
                    final RetirementMatchHubScreen3 retirementMatchHubScreen3 = callbacks;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2437xab38d59e, null, ComposableLambda3.rememberComposableLambda(1267635173, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1267635173, i9, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous>.<anonymous> (RetirementMatchHubScreen.kt:67)");
                            }
                            long j = longRef3.element;
                            final RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(216556727, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i10) {
                                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(216556727, i10, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous>.<anonymous>.<anonymous> (RetirementMatchHubScreen.kt:70)");
                                    }
                                    RetirementMatchHubScreen3 retirementMatchHubScreen33 = retirementMatchHubScreen32;
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChanged = composer5.changed(retirementMatchHubScreen33);
                                    Object objRememberedValue = composer5.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RetirementMatchHubScreen6(retirementMatchHubScreen33);
                                        composer5.updateRememberedValue(objRememberedValue);
                                    }
                                    composer5.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, RetirementMatchHubScreen4.MatchHubBackButton), false, 0L, (Function0) ((KFunction) objRememberedValue), composer5, (BentoAppBarScope.$stable << 12) | 6, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 805306368, 509);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(longRef.element), 0L, null, composer3, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1263273061, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubScreen.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i7 & 6) == 0) {
                        i7 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1263273061, i7, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubScreen.<anonymous> (RetirementMatchHubScreen.kt:83)");
                    }
                    RetirementMatchHubScreen4.MatchHubContent(viewState, callbacks, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i62, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchHubContent(final RetirementMatchHubViewState viewState, final RetirementMatchHubScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1672838299);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1672838299, i3, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubContent (RetirementMatchHubScreen.kt:96)");
                }
                if (!(viewState instanceof RetirementMatchHubViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(1279844549);
                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(modifier3, MatchHubLoading), new ShimmerLoaderType.Hero.Size.Relative(0.4f), false, false, composerStartRestartGroup, ShimmerLoaderType.Hero.Size.Relative.$stable << 3, 12);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                } else {
                    if (!(viewState instanceof RetirementMatchHubViewState.Error)) {
                        modifier2 = modifier3;
                        if (!(viewState instanceof RetirementMatchHubViewState.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(1279843239);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1020878543);
                        RetirementMatchHubViewState.Loaded loaded = (RetirementMatchHubViewState.Loaded) viewState;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.RETIREMENT_MATCH_HUB, null, loaded.getLoggingIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, loaded.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1251537734, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHubContent.2
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
                                    ComposerKt.traceEventStart(1251537734, i5, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubContent.<anonymous> (RetirementMatchHubScreen.kt:117)");
                                }
                                RetirementMatchHubScreen4.MatchHub((RetirementMatchHubViewState.Loaded) viewState, callbacks, modifier2, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1020692109);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 112) == 32;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RetirementMatchHubScreen5(callbacks);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier4 = modifier3;
                        ErrorScreenComposable.ErrorScreenComposable(modifier4, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composerStartRestartGroup, (i3 >> 6) & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        modifier2 = modifier4;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementMatchHubScreen4.MatchHubContent$lambda$3(viewState, callbacks, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!(viewState instanceof RetirementMatchHubViewState.Loading)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier52 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchHub(final RetirementMatchHubViewState.Loaded loaded, final RetirementMatchHubScreen3 retirementMatchHubScreen3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-315541324);
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
            i3 |= composerStartRestartGroup.changed(retirementMatchHubScreen3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-315541324, i3, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHub (RetirementMatchHubScreen.kt:132)");
                }
                StickyFooterColumn.m18132StickyFooterColumnFHprtrg(ComposableLambda3.rememberComposableLambda(-738906261, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHub.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 StickyFooterColumn, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(StickyFooterColumn, "$this$StickyFooterColumn");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-738906261, i5, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHub.<anonymous> (RetirementMatchHubScreen.kt:135)");
                        }
                        RetirementMatchHubScreen4.MatchHubHeader(loaded.getHeader(), null, composer2, 0, 2);
                        ImmutableList<UIComponent<GenericAction>> content = loaded.getContent();
                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(content, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, retirementMatchHubScreen32, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 196608, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-658710116, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHub.2
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
                            ComposerKt.traceEventStart(-658710116, i5, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHub.<anonymous> (RetirementMatchHubScreen.kt:147)");
                        }
                        ImmutableList<UIComponent<GenericAction>> footer = loaded.getFooter();
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                        RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, retirementMatchHubScreen32, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), null, 0L, false, composerStartRestartGroup, 54, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementMatchHubScreen4.MatchHub$lambda$4(loaded, retirementMatchHubScreen3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            StickyFooterColumn.m18132StickyFooterColumnFHprtrg(ComposableLambda3.rememberComposableLambda(-738906261, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHub.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                    invoke(column5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 StickyFooterColumn, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(StickyFooterColumn, "$this$StickyFooterColumn");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-738906261, i5, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHub.<anonymous> (RetirementMatchHubScreen.kt:135)");
                    }
                    RetirementMatchHubScreen4.MatchHubHeader(loaded.getHeader(), null, composer2, 0, 2);
                    ImmutableList<UIComponent<GenericAction>> content = loaded.getContent();
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                    composer2.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(content, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, retirementMatchHubScreen32, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 196608, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-658710116, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt.MatchHub.2
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
                        ComposerKt.traceEventStart(-658710116, i5, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHub.<anonymous> (RetirementMatchHubScreen.kt:147)");
                    }
                    ImmutableList<UIComponent<GenericAction>> footer = loaded.getFooter();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                    RetirementMatchHubScreen3 retirementMatchHubScreen32 = retirementMatchHubScreen3;
                    composer2.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, retirementMatchHubScreen32, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer2, 100663296, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), null, 0L, false, composerStartRestartGroup, 54, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchHubHeader(final ApiRetirementMatchHubResponse.MatchHubHeader matchHubHeader, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(570801542);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(matchHubHeader) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(570801542, i3, -1, "com.robinhood.android.retirement.partnerships.matchhub.MatchHubHeader (RetirementMatchHubScreen.kt:162)");
                }
                Color composeColor = SduiColors2.toComposeColor(matchHubHeader.getBackground_color(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1215527002);
                long jM21371getBg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), jM21371getBg0d7_KjU, null, 2, null), MatchHubHeader);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                SduiComponent3.SduiComponent(matchHubHeader.getImage(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementMatchHubScreen4.MatchHubHeader$lambda$6(matchHubHeader, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Color composeColor2 = SduiColors2.toComposeColor(matchHubHeader.getBackground_color(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1215527002);
            long jM21371getBg0d7_KjU2 = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            Alignment topCenter2 = Alignment.INSTANCE.getTopCenter();
            Modifier modifierTestTag2 = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), jM21371getBg0d7_KjU2, null, 2, null), MatchHubHeader);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2, false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                SduiComponent3.SduiComponent(matchHubHeader.getImage(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
