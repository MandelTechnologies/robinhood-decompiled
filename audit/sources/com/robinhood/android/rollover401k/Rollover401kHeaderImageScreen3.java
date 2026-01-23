package com.robinhood.android.rollover401k;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImage3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Rollover401kHeaderImageScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Rollover401kHeaderImageScreen", "", "content", "Lcom/robinhood/android/rollover401k/Rollover401kHeaderImageScreenContent;", "interactions", "Lcom/robinhood/android/rollover401k/Rollover401kHeaderImageScreenInteractions;", "(Lcom/robinhood/android/rollover401k/Rollover401kHeaderImageScreenContent;Lcom/robinhood/android/rollover401k/Rollover401kHeaderImageScreenInteractions;Landroidx/compose/runtime/Composer;I)V", "HeaderImageScreen", "feature-rollover-401k_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Rollover401kHeaderImageScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderImageScreen$lambda$4(Rollover401kHeaderImageScreenContent rollover401kHeaderImageScreenContent, Rollover401kHeaderImageScreen2 rollover401kHeaderImageScreen2, int i, Composer composer, int i2) {
        HeaderImageScreen(rollover401kHeaderImageScreenContent, rollover401kHeaderImageScreen2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rollover401kHeaderImageScreen$lambda$0(Rollover401kHeaderImageScreenContent rollover401kHeaderImageScreenContent, Rollover401kHeaderImageScreen2 rollover401kHeaderImageScreen2, int i, Composer composer, int i2) {
        Rollover401kHeaderImageScreen(rollover401kHeaderImageScreenContent, rollover401kHeaderImageScreen2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void Rollover401kHeaderImageScreen(final Rollover401kHeaderImageScreenContent rollover401kHeaderImageScreenContent, final Rollover401kHeaderImageScreen2 interactions, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2086378315);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rollover401kHeaderImageScreenContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(interactions) : composerStartRestartGroup.changedInstance(interactions) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2086378315, i2, -1, "com.robinhood.android.rollover401k.Rollover401kHeaderImageScreen (Rollover401kHeaderImageScreen.kt:33)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-659790006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenKt.Rollover401kHeaderImageScreen.1
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
                        ComposerKt.traceEventStart(-659790006, i3, -1, "com.robinhood.android.rollover401k.Rollover401kHeaderImageScreen.<anonymous> (Rollover401kHeaderImageScreen.kt:35)");
                    }
                    if (rollover401kHeaderImageScreenContent == null) {
                        composer2.startReplaceGroup(-2033684862);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, true, true, composer2, 3456, 2);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2033470497);
                        Rollover401kHeaderImageScreen3.HeaderImageScreen(rollover401kHeaderImageScreenContent, interactions, composer2, 0);
                        composer2.endReplaceGroup();
                    }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kHeaderImageScreen3.Rollover401kHeaderImageScreen$lambda$0(rollover401kHeaderImageScreenContent, interactions, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImageScreen(final Rollover401kHeaderImageScreenContent rollover401kHeaderImageScreenContent, Rollover401kHeaderImageScreen2 rollover401kHeaderImageScreen2, Composer composer, final int i) {
        int i2;
        final Rollover401kHeaderImageScreen2 rollover401kHeaderImageScreen22 = rollover401kHeaderImageScreen2;
        Composer composerStartRestartGroup = composer.startRestartGroup(194093358);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(rollover401kHeaderImageScreenContent) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(rollover401kHeaderImageScreen22) : composerStartRestartGroup.changedInstance(rollover401kHeaderImageScreen22) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(194093358, i2, -1, "com.robinhood.android.rollover401k.HeaderImageScreen (Rollover401kHeaderImageScreen.kt:51)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            boolean z = false;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            String imageUrl = rollover401kHeaderImageScreenContent.getImageUrl();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(rollover401kHeaderImageScreen22))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Rollover401kHeaderImageScreen4(rollover401kHeaderImageScreen22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(imageUrl, (Function0) ((KFunction) objRememberedValue), null, null, composerStartRestartGroup, 0, 12);
            List<UIComponent<GenericAction>> content = rollover401kHeaderImageScreenContent.getContent();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(1510558093);
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            ImmutableList3 persistentList = extensions2.toPersistentList(content);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            int i4 = (((((((i2 << 6) & 7168) | 196608) & 7168) | 12582912) << 3) & 57344) | 100663296;
            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, rollover401kHeaderImageScreen22, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, i4, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            List<UIComponent<GenericAction>> footer = rollover401kHeaderImageScreenContent.getFooter();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(1510558093);
            ImmutableList3 persistentList2 = extensions2.toPersistentList(footer);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            rollover401kHeaderImageScreen22 = rollover401kHeaderImageScreen2;
            SduiColumns.SduiColumn(persistentList2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, rollover401kHeaderImageScreen22, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, i4, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kHeaderImageScreen3.HeaderImageScreen$lambda$4(rollover401kHeaderImageScreenContent, rollover401kHeaderImageScreen22, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
