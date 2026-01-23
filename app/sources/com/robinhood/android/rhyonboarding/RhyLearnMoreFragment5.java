package com.robinhood.android.rhyonboarding;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhyLearnMoreFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a9\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00170\u0016H\u0003¢\u0006\u0002\u0010\u0018\u001a7\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00170\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"LoadedContent", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "response", "Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;", "mainContentChunkCallbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDismissCallback", "Lkotlin/Function0;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "Content", "state", "Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentViewState;", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MainContentChunk", "Landroidx/compose/foundation/layout/ColumnScope;", "chunkCallbacks", "chunk", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "FooterChunk", "(Lcom/robinhood/android/navigation/Navigator;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyLearnMoreFragment5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(Navigator navigator, RhyLearnMoreFragmentViewState rhyLearnMoreFragmentViewState, SduiActionHandler6 sduiActionHandler6, Function0 function0, int i, Composer composer, int i2) {
        Content(navigator, rhyLearnMoreFragmentViewState, sduiActionHandler6, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterChunk$lambda$4(Navigator navigator, List list, Function0 function0, int i, Composer composer, int i2) {
        FooterChunk(navigator, list, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$0(Navigator navigator, RhySpendingAccountLearnMore rhySpendingAccountLearnMore, SduiActionHandler6 sduiActionHandler6, Function0 function0, PaddingValues paddingValues, int i, Composer composer, int i2) {
        LoadedContent(navigator, rhySpendingAccountLearnMore, sduiActionHandler6, function0, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContentChunk$lambda$2(Column5 column5, SduiActionHandler6 sduiActionHandler6, List list, int i, Composer composer, int i2) {
        MainContentChunk(column5, sduiActionHandler6, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(final Navigator navigator, final RhySpendingAccountLearnMore rhySpendingAccountLearnMore, final SduiActionHandler6<GenericAction> sduiActionHandler6, final Function0<Unit> function0, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(804652692);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rhySpendingAccountLearnMore) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler6) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(804652692, i2, -1, "com.robinhood.android.rhyonboarding.LoadedContent (RhyLearnMoreFragment.kt:82)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3)), ComposableLambda3.rememberComposableLambda(1094232916, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt.LoadedContent.1
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
                        ComposerKt.traceEventStart(1094232916, i3, -1, "com.robinhood.android.rhyonboarding.LoadedContent.<anonymous> (RhyLearnMoreFragment.kt:84)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    RhySpendingAccountLearnMore rhySpendingAccountLearnMore2 = rhySpendingAccountLearnMore;
                    SduiActionHandler6<GenericAction> sduiActionHandler62 = sduiActionHandler6;
                    Navigator navigator2 = navigator;
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    RhyLearnMoreFragment5.MainContentChunk(Column6.INSTANCE, sduiActionHandler62, rhySpendingAccountLearnMore2.getContent(), composer2, 6);
                    RhyLearnMoreFragment5.FooterChunk(navigator2, rhySpendingAccountLearnMore2.getFooter(), function02, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyLearnMoreFragment5.LoadedContent$lambda$0(navigator, rhySpendingAccountLearnMore, sduiActionHandler6, function0, paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final Navigator navigator, final RhyLearnMoreFragmentViewState rhyLearnMoreFragmentViewState, final SduiActionHandler6<GenericAction> sduiActionHandler6, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1024767131);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rhyLearnMoreFragmentViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler6) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1024767131, i2, -1, "com.robinhood.android.rhyonboarding.Content (RhyLearnMoreFragment.kt:106)");
            }
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-956073315, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$Content$topBar$1
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
                        ComposerKt.traceEventStart(-956073315, i3, -1, "com.robinhood.android.rhyonboarding.Content.<anonymous> (RhyLearnMoreFragment.kt:108)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1587591952$feature_rhy_onboarding_externalDebug = RhyLearnMoreFragment2.INSTANCE.getLambda$1587591952$feature_rhy_onboarding_externalDebug();
                    final Function0<Unit> function02 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1587591952$feature_rhy_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1191171780, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$Content$topBar$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1191171780, i4, -1, "com.robinhood.android.rhyonboarding.Content.<anonymous>.<anonymous> (RhyLearnMoreFragment.kt:109)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-285104464, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt.Content.1
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
                        ComposerKt.traceEventStart(-285104464, i3, -1, "com.robinhood.android.rhyonboarding.Content.<anonymous> (RhyLearnMoreFragment.kt:114)");
                    }
                    Function2<Composer, Integer, Unit> function2 = composableLambdaRememberComposableLambda;
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final RhyLearnMoreFragmentViewState rhyLearnMoreFragmentViewState2 = rhyLearnMoreFragmentViewState;
                    final Navigator navigator2 = navigator;
                    final SduiActionHandler6<GenericAction> sduiActionHandler62 = sduiActionHandler6;
                    final Function0<Unit> function02 = function0;
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, function2, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(1010114158, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt.Content.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1010114158, i4, -1, "com.robinhood.android.rhyonboarding.Content.<anonymous>.<anonymous> (RhyLearnMoreFragment.kt:118)");
                            }
                            composer3.startReplaceGroup(57098180);
                            if (rhyLearnMoreFragmentViewState2.getIsLoading()) {
                                LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, composer3, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return;
                            }
                            composer3.endReplaceGroup();
                            RhySpendingAccountLearnMore rhySpendingAccountLearnMore = rhyLearnMoreFragmentViewState2.getRhySpendingAccountLearnMore();
                            if (rhySpendingAccountLearnMore != null) {
                                RhyLearnMoreFragment5.LoadedContent(navigator2, rhySpendingAccountLearnMore, sduiActionHandler62, function02, paddingValues, composer3, (i4 << 12) & 57344);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 12582912, 98299);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyLearnMoreFragment5.Content$lambda$1(navigator, rhyLearnMoreFragmentViewState, sduiActionHandler6, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContentChunk(Column5 column5, SduiActionHandler6<GenericAction> sduiActionHandler6, final List<? extends UIComponent<? extends GenericAction>> list, Composer composer, final int i) {
        int i2;
        final Column5 column52;
        final SduiActionHandler6<GenericAction> sduiActionHandler62;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249346778);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249346778, i3, -1, "com.robinhood.android.rhyonboarding.MainContentChunk (RhyLearnMoreFragment.kt:172)");
            }
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            column52 = column5;
            sduiActionHandler62 = sduiActionHandler6;
            SduiColumns.SduiColumn(extensions2.toPersistentList(list), GenericAction.class, ScrollKt.verticalScroll$default(Column5.weight$default(column5, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), null, sduiActionHandler62, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composerStartRestartGroup, (((((i3 << 6) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            column52 = column5;
            sduiActionHandler62 = sduiActionHandler6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyLearnMoreFragment5.MainContentChunk$lambda$2(column52, sduiActionHandler62, list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterChunk(final Navigator navigator, final List<? extends UIComponent<? extends GenericAction>> list, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(901780203);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901780203, i2, -1, "com.robinhood.android.rhyonboarding.FooterChunk (RhyLearnMoreFragment.kt:188)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhyLearnMoreFragment4(navigator, context, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RhyLearnMoreFragment4 rhyLearnMoreFragment4 = (RhyLearnMoreFragment4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ImmutableList3 persistentList = extensions2.toPersistentList(list);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, rhyLearnMoreFragment4, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composerStartRestartGroup, 100663680, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyLearnMoreFragment5.FooterChunk$lambda$4(navigator, list, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
