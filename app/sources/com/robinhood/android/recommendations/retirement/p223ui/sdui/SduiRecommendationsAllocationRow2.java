package com.robinhood.android.recommendations.retirement.p223ui.sdui;

import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.recommendations.retirement.p223ui.sdui.SduiRecommendationsAllocationRow2;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.RecommendationsAllocationRow;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiRecommendationsAllocationRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"SduiRecommendationsAllocationRow", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/RecommendationsAllocationRow;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/RecommendationsAllocationRow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OutlinedSquare", "fillColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "size", "Landroidx/compose/ui/unit/Dp;", "borderThickness", "OutlinedSquare-UuyPYSY", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SduiRecommendationsAllocationRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedSquare_UuyPYSY$lambda$3(ThemedColor themedColor, Modifier modifier, float f, float f2, int i, int i2, Composer composer, int i3) {
        m17834OutlinedSquareUuyPYSY(themedColor, modifier, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRecommendationsAllocationRow$lambda$1(RecommendationsAllocationRow recommendationsAllocationRow, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiRecommendationsAllocationRow(recommendationsAllocationRow, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiRecommendationsAllocationRow(final RecommendationsAllocationRow<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-865601779);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-865601779, i3, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow (SduiRecommendationsAllocationRow.kt:38)");
                }
                Parcelable action = component.getAction();
                composerStartRestartGroup.startReplaceGroup(1380352845);
                Function0<Unit> function0Handling = action != null ? null : SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), null, ComposableLambda3.rememberComposableLambda(1399266249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt.SduiRecommendationsAllocationRow.1
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
                            ComposerKt.traceEventStart(1399266249, i5, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow.<anonymous> (SduiRecommendationsAllocationRow.kt:46)");
                        }
                        SduiRecommendationsAllocationRow2.m17834OutlinedSquareUuyPYSY(component.getSquare_color(), null, 0.0f, 0.0f, composer2, 0, 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1038806538, true, new C260962(function0Handling, component), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(317887116, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt.SduiRecommendationsAllocationRow.3
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
                            ComposerKt.traceEventStart(317887116, i5, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow.<anonymous> (SduiRecommendationsAllocationRow.kt:81)");
                        }
                        BentoText2.m20747BentoText38GnDrw(component.getMetadata_text(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 805306368, 0, 7678);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, true, true, null, composerStartRestartGroup, 918752640, 0, 1106);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiRecommendationsAllocationRow2.SduiRecommendationsAllocationRow$lambda$1(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Parcelable action2 = component.getAction();
            composerStartRestartGroup.startReplaceGroup(1380352845);
            if (action2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), null, ComposableLambda3.rememberComposableLambda(1399266249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt.SduiRecommendationsAllocationRow.1
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
                        ComposerKt.traceEventStart(1399266249, i5, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow.<anonymous> (SduiRecommendationsAllocationRow.kt:46)");
                    }
                    SduiRecommendationsAllocationRow2.m17834OutlinedSquareUuyPYSY(component.getSquare_color(), null, 0.0f, 0.0f, composer2, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1038806538, true, new C260962(function0Handling, component), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(317887116, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt.SduiRecommendationsAllocationRow.3
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
                        ComposerKt.traceEventStart(317887116, i5, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow.<anonymous> (SduiRecommendationsAllocationRow.kt:81)");
                    }
                    BentoText2.m20747BentoText38GnDrw(component.getMetadata_text(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 805306368, 0, 7678);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, true, true, null, composerStartRestartGroup, 918752640, 0, 1106);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SduiRecommendationsAllocationRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt$SduiRecommendationsAllocationRow$2 */
    static final class C260962 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RecommendationsAllocationRow<ActionT> $component;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: Multi-variable type inference failed */
        C260962(Function0<Unit> function0, RecommendationsAllocationRow<? extends ActionT> recommendationsAllocationRow) {
            this.$onClick = function0;
            this.$component = recommendationsAllocationRow;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1038806538, i, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRow.<anonymous> (SduiRecommendationsAllocationRow.kt:51)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z = this.$onClick != null;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onClick);
            final Function0<Unit> function0 = this.$onClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt$SduiRecommendationsAllocationRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SduiRecommendationsAllocationRow2.C260962.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, z, null, null, (Function0) objRememberedValue, 6, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            RecommendationsAllocationRow<ActionT> recommendationsAllocationRow = this.$component;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String primary_text = recommendationsAllocationRow.getPrimary_text();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(primary_text, null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 805306368, 0, 7678);
            composer.startReplaceGroup(-779901299);
            if (recommendationsAllocationRow.getAction() != null) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.QUESTION_12), "Question mark icon", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, BentoSpacing.INSTANCE.m21598default().m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer, BentoIcon4.Size12.$stable | 48, 48);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: OutlinedSquare-UuyPYSY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17834OutlinedSquareUuyPYSY(final ThemedColor fillColor, Modifier modifier, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float f3;
        int i4;
        float fM7995constructorimpl;
        float fM21590getDefaultD9Ej5fM;
        Modifier modifier3;
        float f4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-269291195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fillColor) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    f3 = f;
                    int i6 = composerStartRestartGroup.changed(f3) ? 256 : 128;
                    i3 |= i6;
                } else {
                    f3 = f;
                }
                i3 |= i6;
            } else {
                f3 = f;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    fM7995constructorimpl = f2;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    f5 = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                            i3 &= -897;
                        } else {
                            fM21590getDefaultD9Ej5fM = f3;
                        }
                        if (i4 == 0) {
                            f4 = fM21590getDefaultD9Ej5fM;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                            modifier3 = modifier5;
                        } else {
                            modifier3 = modifier5;
                            f4 = fM21590getDefaultD9Ej5fM;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        f4 = f3;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-269291195, i3, -1, "com.robinhood.android.recommendations.retirement.ui.sdui.OutlinedSquare (SduiRecommendationsAllocationRow.kt:99)");
                    }
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier3, f4);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
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
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(companion2, f4), SduiColors2.m18896toComposeColorDefaultediJQMabo(fillColor, 0L, composerStartRestartGroup, i3 & 14, 1), null, 2, null), composerStartRestartGroup, 0);
                    BoxKt.Box(BorderKt.border(SizeKt.m5169size3ABfNKs(companion2, f4), BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.INSTANCE.m6716getBlack0d7_KjU()), RectangleShape2.getRectangleShape()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier3;
                    f5 = f4;
                }
                final float f6 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.sdui.SduiRecommendationsAllocationRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiRecommendationsAllocationRow2.OutlinedSquare_UuyPYSY$lambda$3(fillColor, modifier4, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            fM7995constructorimpl = f2;
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier3, f4);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(companion22, f4), SduiColors2.m18896toComposeColorDefaultediJQMabo(fillColor, 0L, composerStartRestartGroup, i3 & 14, 1), null, 2, null), composerStartRestartGroup, 0);
                        BoxKt.Box(BorderKt.border(SizeKt.m5169size3ABfNKs(companion22, f4), BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.INSTANCE.m6716getBlack0d7_KjU()), RectangleShape2.getRectangleShape()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        f5 = f4;
                    }
                }
            }
            final float f62 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        fM7995constructorimpl = f2;
        if ((i3 & 1171) == 1170) {
        }
        final float f622 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
