package com.robinhood.android.advisory.returns;

import android.content.Context;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.returns.ReturnsHubScreen4;
import com.robinhood.android.advisory.returns.ReturnsHubViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.advisory.p304db.returns.ReturnComparisonRow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReturnsHubScreen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"LOGGING_IDENTIFIER_BENCHMARK_INFO_ICON", "", "ReturnsHubScreen", "", "viewState", "Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;", "onBackClick", "Lkotlin/Function0;", "onTooltipDismissed", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/returns/ReturnsHubViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-returns-hub_externalDebug", "showLearnMoreTooltip", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.returns.ReturnsHubScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsHubScreen4 {
    public static final String LOGGING_IDENTIFIER_BENCHMARK_INFO_ICON = "benchmark";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsHubScreen$lambda$3(ReturnsHubViewState returnsHubViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReturnsHubScreen(returnsHubViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReturnsHubScreen(final ReturnsHubViewState viewState, final Function0<Unit> onBackClick, final Function0<Unit> onTooltipDismissed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onTooltipDismissed, "onTooltipDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1975541061);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTooltipDismissed) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1975541061, i4, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen (ReturnsHubScreen.kt:66)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(-1630738687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.1
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
                            ComposerKt.traceEventStart(-1630738687, i6, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous> (ReturnsHubScreen.kt:74)");
                        }
                        Function2<Composer, Integer, Unit> function2M11251getLambda$1004808524$feature_returns_hub_externalDebug = ReturnsHubScreen.INSTANCE.m11251getLambda$1004808524$feature_returns_hub_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11251getLambda$1004808524$feature_returns_hub_externalDebug, null, ComposableLambda3.rememberComposableLambda(72903136, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.1.1
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
                                    ComposerKt.traceEventStart(72903136, i7, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous> (ReturnsHubScreen.kt:76)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(976857622, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(innerPadding) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(976857622, i6, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous> (ReturnsHubScreen.kt:84)");
                        }
                        ReturnsHubViewState returnsHubViewState = viewState;
                        if (returnsHubViewState instanceof ReturnsHubViewState.Loading) {
                            composer3.startReplaceGroup(-1837659482);
                            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding), false, composer3, 0, 2);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(returnsHubViewState instanceof ReturnsHubViewState.Loaded)) {
                                composer3.startReplaceGroup(-1837642341);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-1132045887);
                            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STRATEGIES_RETURNS_HUB, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(1120284002, true, new AnonymousClass1(innerPadding, viewState, onTooltipDismissed, navigator, context, snapshotState), composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ReturnsHubScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ PaddingValues $innerPadding;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ Function0<Unit> $onTooltipDismissed;
                        final /* synthetic */ SnapshotState<Boolean> $showLearnMoreTooltip$delegate;
                        final /* synthetic */ ReturnsHubViewState $viewState;

                        AnonymousClass1(PaddingValues paddingValues, ReturnsHubViewState returnsHubViewState, Function0<Unit> function0, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState) {
                            this.$innerPadding = paddingValues;
                            this.$viewState = returnsHubViewState;
                            this.$onTooltipDismissed = function0;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$showLearnMoreTooltip$delegate = snapshotState;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1120284002, i, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous> (ReturnsHubScreen.kt:100)");
                            }
                            composer.startReplaceGroup(-1443858857);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$innerPadding), 0.0f, 1, null);
                            boolean zIsBenchmarkInfoTooltipVisible = ((ReturnsHubViewState.Loaded) this.$viewState).isBenchmarkInfoTooltipVisible();
                            final Function0<Unit> function0 = this.$onTooltipDismissed;
                            if (zIsBenchmarkInfoTooltipVisible) {
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(function0);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ReturnsHubScreen4.C93532.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function0);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                modifierFillMaxSize$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxSize$default, false, null, null, (Function0) objRememberedValue, 7, null);
                            }
                            composer.endReplaceGroup();
                            final ReturnsHubViewState returnsHubViewState = this.$viewState;
                            final Function0<Unit> function02 = this.$onTooltipDismissed;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final SnapshotState<Boolean> snapshotState = this.$showLearnMoreTooltip$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            ReturnsHubViewState.Loaded loaded = (ReturnsHubViewState.Loaded) returnsHubViewState;
                            String title = loaded.getReturnsHubData().getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                            String subtitle = loaded.getReturnsHubData().getSubtitle();
                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(subtitle, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8120);
                            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(returnsHubViewState) | composer.changed(function02) | composer.changedInstance(navigator) | composer.changedInstance(context);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return ReturnsHubScreen4.C93532.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7(returnsHubViewState, function02, navigator, context, snapshotState, (LazyListScope) obj2);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue2 = obj;
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer, 0, 510);
                            BentoMarkdownText2.BentoMarkdownText(loaded.getReturnsHubData().getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
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
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$9$lambda$8$lambda$7(ReturnsHubViewState returnsHubViewState, Function0 function0, Navigator navigator, Context context, final SnapshotState snapshotState, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-3149077, true, new ReturnsHubScreen5(returnsHubViewState, function0, navigator, context)), 3, null);
                            final List<ReturnComparisonRow> comparisonRows = ((ReturnsHubViewState.Loaded) returnsHubViewState).getReturnsHubData().getComparisonRows();
                            final C9348xb65ad078 c9348xb65ad078 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(ReturnComparisonRow returnComparisonRow) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((ReturnComparisonRow) obj);
                                }
                            };
                            LazyColumn.items(comparisonRows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return c9348xb65ad078.invoke(comparisonRows.get(i));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                    int i3;
                                    long jM21426getFg20d7_KjU;
                                    long jM21452getNegative0d7_KjU;
                                    long jM21452getNegative0d7_KjU2;
                                    if ((i2 & 6) == 0) {
                                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                                    } else {
                                        i3 = i2;
                                    }
                                    if ((i2 & 48) == 0) {
                                        i3 |= composer.changed(i) ? 32 : 16;
                                    }
                                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    final ReturnComparisonRow returnComparisonRow = (ReturnComparisonRow) comparisonRows.get(i);
                                    composer.startReplaceGroup(-1415365516);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), centerVertically, composer, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor2);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    if (returnComparisonRow.getLearnMore() == null) {
                                        composer.startReplaceGroup(-1033673836);
                                        jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1033560717);
                                        jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU();
                                        composer.endReplaceGroup();
                                    }
                                    final long j = jM21426getFg20d7_KjU;
                                    final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU();
                                    float f = 18;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion, 1.2f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(f), bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(f), 1, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor3);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
                                    final SnapshotState snapshotState2 = snapshotState;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, 0L, 0L, jM21425getFg0d7_KjU, 0L, 0L, ComposableLambda3.rememberComposableLambda(937076910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i5) {
                                            Modifier modifierM4893clickableXHw0xAI$default;
                                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(937076910, i5, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReturnsHubScreen.kt:277)");
                                            }
                                            String span = returnComparisonRow.getSpan();
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i6 = BentoTheme.$stable;
                                            TextStyle textS = bentoTheme2.getTypography(composer2, i6).getTextS();
                                            FontWeight bold = FontWeight.INSTANCE.getBold();
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, 0.0f, 3, null);
                                            composer2.startReplaceGroup(-1412197661);
                                            String learnMore = returnComparisonRow.getLearnMore();
                                            if (learnMore == null || learnMore.length() == 0) {
                                                modifierM4893clickableXHw0xAI$default = companion4;
                                            } else {
                                                boolean zReturnsHubScreen$lambda$1 = ReturnsHubScreen4.ReturnsHubScreen$lambda$1(snapshotState2);
                                                PopupPositioning popupPositioning = PopupPositioning.BELOW;
                                                float fM21595getXsmallD9Ej5fM = bentoTheme2.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM();
                                                Boolean boolValueOf = Boolean.valueOf(zReturnsHubScreen$lambda$1);
                                                composer2.startReplaceGroup(5004770);
                                                final SnapshotState<Boolean> snapshotState3 = snapshotState2;
                                                Object objRememberedValue = composer2.rememberedValue();
                                                Composer.Companion companion5 = Composer.INSTANCE;
                                                if (objRememberedValue == companion5.getEmpty()) {
                                                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$1$1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            ReturnsHubScreen4.ReturnsHubScreen$lambda$2(snapshotState3, false);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                Function0 function02 = (Function0) objRememberedValue;
                                                composer2.endReplaceGroup();
                                                final ReturnComparisonRow returnComparisonRow2 = returnComparisonRow;
                                                final long j2 = jM21371getBg0d7_KjU;
                                                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(companion4, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                } : function02, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21595getXsmallD9Ej5fM, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-789697010, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1.2
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
                                                            ComposerKt.traceEventStart(-789697010, i7, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReturnsHubScreen.kt:296)");
                                                        }
                                                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(200), 1, null);
                                                        String learnMore2 = returnComparisonRow2.getLearnMore();
                                                        if (learnMore2 == null) {
                                                            throw new IllegalArgumentException("Required value was null.");
                                                        }
                                                        BentoText2.m20747BentoText38GnDrw(learnMore2, modifierM5176widthInVpY3zN4$default, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 48, 0, 8184);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54));
                                                composer2.startReplaceGroup(5004770);
                                                boolean zChanged = composer2.changed(j);
                                                final long j3 = j;
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue2 == companion5.getEmpty()) {
                                                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$3$1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(DrawScope drawBehind) {
                                                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                                            float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - (fMo5016toPx0680j_4 / 2);
                                                            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j3, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32)), fMo5016toPx0680j_4, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{4.0f, 4.0f}, 0.0f), 0.0f, null, 0, 464, null);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                            invoke2(drawScope);
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM26519popupTooltipBgaGok8, (Function1) objRememberedValue2);
                                                composer2.startReplaceGroup(5004770);
                                                final SnapshotState<Boolean> snapshotState4 = snapshotState2;
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (objRememberedValue3 == companion5.getEmpty()) {
                                                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$4$1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            ReturnsHubScreen4.ReturnsHubScreen$lambda$2(snapshotState4, !ReturnsHubScreen4.ReturnsHubScreen$lambda$1(r0));
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer2.endReplaceGroup();
                                                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierDrawBehind, false, null, null, (Function0) objRememberedValue3, 7, null);
                                            }
                                            composer2.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(span, modifierM5144paddingVpY3zN4$default.then(modifierM4893clickableXHw0xAI$default), Color.m6701boximpl(j), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8168);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, 805306368, 447);
                                    composer.endNode();
                                    String str = Formats.m2149x4a8e6258(null, 1, null).format(returnComparisonRow.getPortfolioReturn());
                                    TextStyle textS = bentoTheme.getTypography(composer, i4).getTextS();
                                    FontWeight bold = FontWeight.INSTANCE.getBold();
                                    BigDecimal portfolioReturn = returnComparisonRow.getPortfolioReturn();
                                    BigDecimal bigDecimal = BigDecimal.ZERO;
                                    if (portfolioReturn.compareTo(bigDecimal) >= 0) {
                                        composer.startReplaceGroup(-1027631130);
                                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1027504154);
                                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i4).m21452getNegative0d7_KjU();
                                        composer.endReplaceGroup();
                                    }
                                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(jM21452getNegative0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8168);
                                    String str2 = Formats.m2149x4a8e6258(null, 1, null).format(returnComparisonRow.getBenchmarkReturn());
                                    TextStyle textS2 = bentoTheme.getTypography(composer, i4).getTextS();
                                    if (returnComparisonRow.getBenchmarkReturn().compareTo(bigDecimal) >= 0) {
                                        composer.startReplaceGroup(-1026704602);
                                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1026577626);
                                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composer, i4).m21452getNegative0d7_KjU();
                                        composer.endReplaceGroup();
                                    }
                                    BentoText2.m20747BentoText38GnDrw(str2, SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer, 0, 0, 8184);
                                    composer.endNode();
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i4).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                                    composer.endNode();
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReturnsHubScreen4.ReturnsHubScreen$lambda$3(viewState, onBackClick, onTooltipDismissed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(-1630738687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.1
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
                        ComposerKt.traceEventStart(-1630738687, i6, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous> (ReturnsHubScreen.kt:74)");
                    }
                    Function2<Composer, Integer, Unit> function2M11251getLambda$1004808524$feature_returns_hub_externalDebug = ReturnsHubScreen.INSTANCE.m11251getLambda$1004808524$feature_returns_hub_externalDebug();
                    final Function0<Unit> function0 = onBackClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11251getLambda$1004808524$feature_returns_hub_externalDebug, null, ComposableLambda3.rememberComposableLambda(72903136, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.1.1
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
                                ComposerKt.traceEventStart(72903136, i7, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous> (ReturnsHubScreen.kt:76)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(976857622, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt.ReturnsHubScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(innerPadding) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(976857622, i6, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous> (ReturnsHubScreen.kt:84)");
                    }
                    ReturnsHubViewState returnsHubViewState = viewState;
                    if (returnsHubViewState instanceof ReturnsHubViewState.Loading) {
                        composer3.startReplaceGroup(-1837659482);
                        LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding), false, composer3, 0, 2);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(returnsHubViewState instanceof ReturnsHubViewState.Loaded)) {
                            composer3.startReplaceGroup(-1837642341);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-1132045887);
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STRATEGIES_RETURNS_HUB, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(1120284002, true, new AnonymousClass1(innerPadding, viewState, onTooltipDismissed, navigator2, context2, snapshotState2), composer3, 54), composer3, 48);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ReturnsHubScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ PaddingValues $innerPadding;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ Function0<Unit> $onTooltipDismissed;
                    final /* synthetic */ SnapshotState<Boolean> $showLearnMoreTooltip$delegate;
                    final /* synthetic */ ReturnsHubViewState $viewState;

                    AnonymousClass1(PaddingValues paddingValues, ReturnsHubViewState returnsHubViewState, Function0<Unit> function0, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState) {
                        this.$innerPadding = paddingValues;
                        this.$viewState = returnsHubViewState;
                        this.$onTooltipDismissed = function0;
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$showLearnMoreTooltip$delegate = snapshotState;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1120284002, i, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous> (ReturnsHubScreen.kt:100)");
                        }
                        composer.startReplaceGroup(-1443858857);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$innerPadding), 0.0f, 1, null);
                        boolean zIsBenchmarkInfoTooltipVisible = ((ReturnsHubViewState.Loaded) this.$viewState).isBenchmarkInfoTooltipVisible();
                        final Function0 function0 = this.$onTooltipDismissed;
                        if (zIsBenchmarkInfoTooltipVisible) {
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReturnsHubScreen4.C93532.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            modifierFillMaxSize$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxSize$default, false, null, null, (Function0) objRememberedValue, 7, null);
                        }
                        composer.endReplaceGroup();
                        final ReturnsHubViewState returnsHubViewState = this.$viewState;
                        final Function0 function02 = this.$onTooltipDismissed;
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        final SnapshotState snapshotState = this.$showLearnMoreTooltip$delegate;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                        ReturnsHubViewState.Loaded loaded = (ReturnsHubViewState.Loaded) returnsHubViewState;
                        String title = loaded.getReturnsHubData().getTitle();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
                        String subtitle = loaded.getReturnsHubData().getSubtitle();
                        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(subtitle, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8120);
                        Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(returnsHubViewState) | composer.changed(function02) | composer.changedInstance(navigator) | composer.changedInstance(context);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object obj = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return ReturnsHubScreen4.C93532.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7(returnsHubViewState, function02, navigator, context, snapshotState, (LazyListScope) obj2);
                                }
                            };
                            composer.updateRememberedValue(obj);
                            objRememberedValue2 = obj;
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer, 0, 510);
                        BentoMarkdownText2.BentoMarkdownText(loaded.getReturnsHubData().getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
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
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8$lambda$7(ReturnsHubViewState returnsHubViewState, Function0 function0, Navigator navigator, Context context, final SnapshotState snapshotState, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-3149077, true, new ReturnsHubScreen5(returnsHubViewState, function0, navigator, context)), 3, null);
                        final List comparisonRows = ((ReturnsHubViewState.Loaded) returnsHubViewState).getReturnsHubData().getComparisonRows();
                        final Function1 c9348xb65ad078 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Void invoke(ReturnComparisonRow returnComparisonRow) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((ReturnComparisonRow) obj);
                            }
                        };
                        LazyColumn.items(comparisonRows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return c9348xb65ad078.invoke(comparisonRows.get(i));
                            }
                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                int i3;
                                long jM21426getFg20d7_KjU;
                                long jM21452getNegative0d7_KjU;
                                long jM21452getNegative0d7_KjU2;
                                if ((i2 & 6) == 0) {
                                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                                } else {
                                    i3 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    i3 |= composer.changed(i) ? 32 : 16;
                                }
                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                final ReturnComparisonRow returnComparisonRow = (ReturnComparisonRow) comparisonRows.get(i);
                                composer.startReplaceGroup(-1415365516);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), centerVertically, composer, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor2);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                if (returnComparisonRow.getLearnMore() == null) {
                                    composer.startReplaceGroup(-1033673836);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-1033560717);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU();
                                    composer.endReplaceGroup();
                                }
                                final long j = jM21426getFg20d7_KjU;
                                final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU();
                                float f = 18;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion, 1.2f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(f), bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(f), 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor3);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
                                final SnapshotState<Boolean> snapshotState2 = snapshotState;
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, 0L, 0L, jM21425getFg0d7_KjU, 0L, 0L, ComposableLambda3.rememberComposableLambda(937076910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i5) {
                                        Modifier modifierM4893clickableXHw0xAI$default;
                                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(937076910, i5, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReturnsHubScreen.kt:277)");
                                        }
                                        String span = returnComparisonRow.getSpan();
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i6 = BentoTheme.$stable;
                                        TextStyle textS = bentoTheme2.getTypography(composer2, i6).getTextS();
                                        FontWeight bold = FontWeight.INSTANCE.getBold();
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, 0.0f, 3, null);
                                        composer2.startReplaceGroup(-1412197661);
                                        String learnMore = returnComparisonRow.getLearnMore();
                                        if (learnMore == null || learnMore.length() == 0) {
                                            modifierM4893clickableXHw0xAI$default = companion4;
                                        } else {
                                            boolean zReturnsHubScreen$lambda$1 = ReturnsHubScreen4.ReturnsHubScreen$lambda$1(snapshotState2);
                                            PopupPositioning popupPositioning = PopupPositioning.BELOW;
                                            float fM21595getXsmallD9Ej5fM = bentoTheme2.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM();
                                            Boolean boolValueOf = Boolean.valueOf(zReturnsHubScreen$lambda$1);
                                            composer2.startReplaceGroup(5004770);
                                            final SnapshotState<Boolean> snapshotState3 = snapshotState2;
                                            Object objRememberedValue = composer2.rememberedValue();
                                            Composer.Companion companion5 = Composer.INSTANCE;
                                            if (objRememberedValue == companion5.getEmpty()) {
                                                objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        ReturnsHubScreen4.ReturnsHubScreen$lambda$2(snapshotState3, false);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            Function0 function02 = (Function0) objRememberedValue;
                                            composer2.endReplaceGroup();
                                            final ReturnComparisonRow returnComparisonRow2 = returnComparisonRow;
                                            final long j2 = jM21371getBg0d7_KjU;
                                            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(companion4, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            } : function02, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21595getXsmallD9Ej5fM, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-789697010, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1.2
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
                                                        ComposerKt.traceEventStart(-789697010, i7, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReturnsHubScreen.kt:296)");
                                                    }
                                                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(200), 1, null);
                                                    String learnMore2 = returnComparisonRow2.getLearnMore();
                                                    if (learnMore2 == null) {
                                                        throw new IllegalArgumentException("Required value was null.");
                                                    }
                                                    BentoText2.m20747BentoText38GnDrw(learnMore2, modifierM5176widthInVpY3zN4$default, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 48, 0, 8184);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54));
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChanged = composer2.changed(j);
                                            final long j3 = j;
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion5.getEmpty()) {
                                                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$3$1
                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(DrawScope drawBehind) {
                                                        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                                        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - (fMo5016toPx0680j_4 / 2);
                                                        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j3, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32)), fMo5016toPx0680j_4, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{4.0f, 4.0f}, 0.0f), 0.0f, null, 0, 464, null);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                        invoke2(drawScope);
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM26519popupTooltipBgaGok8, (Function1) objRememberedValue2);
                                            composer2.startReplaceGroup(5004770);
                                            final SnapshotState<Boolean> snapshotState4 = snapshotState2;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (objRememberedValue3 == companion5.getEmpty()) {
                                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$2$1$1$1$1$4$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        ReturnsHubScreen4.ReturnsHubScreen$lambda$2(snapshotState4, !ReturnsHubScreen4.ReturnsHubScreen$lambda$1(r0));
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierDrawBehind, false, null, null, (Function0) objRememberedValue3, 7, null);
                                        }
                                        composer2.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(span, modifierM5144paddingVpY3zN4$default.then(modifierM4893clickableXHw0xAI$default), Color.m6701boximpl(j), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8168);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 805306368, 447);
                                composer.endNode();
                                String str = Formats.m2149x4a8e6258(null, 1, null).format(returnComparisonRow.getPortfolioReturn());
                                TextStyle textS = bentoTheme.getTypography(composer, i4).getTextS();
                                FontWeight bold = FontWeight.INSTANCE.getBold();
                                BigDecimal portfolioReturn = returnComparisonRow.getPortfolioReturn();
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                if (portfolioReturn.compareTo(bigDecimal) >= 0) {
                                    composer.startReplaceGroup(-1027631130);
                                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU();
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-1027504154);
                                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i4).m21452getNegative0d7_KjU();
                                    composer.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(str, SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(jM21452getNegative0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8168);
                                String str2 = Formats.m2149x4a8e6258(null, 1, null).format(returnComparisonRow.getBenchmarkReturn());
                                TextStyle textS2 = bentoTheme.getTypography(composer, i4).getTextS();
                                if (returnComparisonRow.getBenchmarkReturn().compareTo(bigDecimal) >= 0) {
                                    composer.startReplaceGroup(-1026704602);
                                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU();
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-1026577626);
                                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composer, i4).m21452getNegative0d7_KjU();
                                    composer.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(str2, SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer, 0, 0, 8184);
                                composer.endNode();
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i4).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                                composer.endNode();
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReturnsHubScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ReturnsHubScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
