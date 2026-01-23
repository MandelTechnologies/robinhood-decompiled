package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainConstants;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionSideBySideChainUnderlyingQuoteRow.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0015\u001a[\u0010\u0016\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainUnderlyingQuoteRow", "", "underlyingQuoteStr", "", "loadingStyle", "Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "isSideBySide", "", "scrollToQuote", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "OptionSideBySideChainDottedLine", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionSideBySideChainTopUnderlyingQuoteIndicator", "Landroidx/compose/foundation/layout/BoxScope;", "visible", "(Landroidx/compose/foundation/layout/BoxScope;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OptionSideBySideChainBottomUnderlyingQuoteIndicator", "isBottomSheetVisible", "(Landroidx/compose/foundation/layout/BoxScope;ZLjava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OptionSideBySideChainUnderlyingQuoteIndicator", "alignment", "Landroidx/compose/ui/Alignment;", "contentAlignment", "height", "Landroidx/compose/ui/unit/Dp;", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "OptionSideBySideChainUnderlyingQuoteIndicator-_-WMjBM", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Alignment;FLandroidx/compose/foundation/layout/PaddingValues;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "animateAlignmentAsState", "Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "feature-options-chain_externalDebug", "quoteSize", "Landroidx/compose/ui/unit/IntSize;", "paddingStart", "offsetX", "biasX", "", "biasY"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainUnderlyingQuoteRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainBottomUnderlyingQuoteIndicator$lambda$25(BoxScope boxScope, boolean z, String str, boolean z2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionSideBySideChainBottomUnderlyingQuoteIndicator(boxScope, z, str, z2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainDottedLine$lambda$23(Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionSideBySideChainDottedLine(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTopUnderlyingQuoteIndicator$lambda$24(BoxScope boxScope, String str, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionSideBySideChainTopUnderlyingQuoteIndicator(boxScope, str, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainUnderlyingQuoteIndicator___WMjBM$lambda$26(BoxScope boxScope, Alignment alignment, Alignment alignment2, float f, PaddingValues paddingValues, String str, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(boxScope, alignment, alignment2, f, paddingValues, str, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainUnderlyingQuoteRow$lambda$14(String str, LoadingStyle loadingStyle, boolean z, Function0 function0, int i, Composer composer, int i2) {
        OptionSideBySideChainUnderlyingQuoteRow(str, loadingStyle, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionSideBySideChainUnderlyingQuoteRow(final String underlyingQuoteStr, final LoadingStyle loadingStyle, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
        Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-273922140);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(underlyingQuoteStr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(loadingStyle.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273922140, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRow (OptionSideBySideChainUnderlyingQuoteRow.kt:55)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), TableConstants.getQuoteRowHeightDp());
            boolean z2 = function0 != null;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainUnderlyingQuoteRow$lambda$1$lambda$0(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5156height3ABfNKs, z2, null, null, (Function0) objRememberedValue, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-973197258);
            if (loadingStyle == LoadingStyle.NUX) {
                composerStartRestartGroup.endReplaceGroup();
            } else {
                OptionSideBySideChainDottedLine(boxScopeInstance.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getCenter()), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Alignment> snapshotState4AnimateAlignmentAsState = animateAlignmentAsState(z ? companion2.getCenter() : companion2.getCenterStart(), composerStartRestartGroup, 0);
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(z ? 0 : 16), null, "underlyingQuotePaddingStart", null, composerStartRestartGroup, 384, 10);
                final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(z ? 0 : -16), null, "underlyingQuoteOffsetX", null, composerStartRestartGroup, 384, 10);
                Brush.Companion companion5 = Brush.INSTANCE;
                Float fValueOf = Float.valueOf(0.0f);
                Color.Companion companion6 = Color.INSTANCE;
                Tuples2 tuples2M3642to = Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()));
                Float fValueOf2 = Float.valueOf(0.15f);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BoxKt.Box(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(Background3.background$default(boxScopeInstance.align(companion, OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$5(snapshotState4AnimateAlignmentAsState)), Brush.Companion.m6677horizontalGradient8A3gB4$default(companion5, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.85f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null), TableConstants.getStrikeCellWidthDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(snapshotState4M4812animateDpAsStateAjpBEmI2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionSideBySideChainUnderlyingQuoteRow.m2351x4466333c(snapshotState4M4812animateDpAsStateAjpBEmI2, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(boxScopeInstance.align(OffsetKt.offset(companion, (Function1) objRememberedValue3), OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$5(snapshotState4AnimateAlignmentAsState)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionSideBySideChainUnderlyingQuoteRow.m2350x2431adae(snapshotState, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(OnRemeasuredModifier2.onSizeChanged(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue4), C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(2));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(underlyingQuoteStr, PaddingKt.m5146paddingqDBjuR0$default(companion, OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$6(snapshotState4M4812animateDpAsStateAjpBEmI), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, i3 & 14, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainUnderlyingQuoteRow$lambda$14(underlyingQuoteStr, loadingStyle, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainUnderlyingQuoteRow$lambda$1$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$4(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    private static final Alignment OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$5(SnapshotState4<? extends Alignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final float OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$6(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$7(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float animateAlignmentAsState$lambda$27(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float animateAlignmentAsState$lambda$28(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$9$lambda$8 */
    public static final IntOffset m2351x4466333c(SnapshotState4 snapshotState4, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((offset.mo5010roundToPx0680j_4(OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$7(snapshotState4)) << 32) | (0 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$11$lambda$10 */
    public static final Unit m2350x2431adae(SnapshotState snapshotState, IntSize intSize) {
        OptionSideBySideChainUnderlyingQuoteRow$lambda$13$lambda$4(snapshotState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    private static final void OptionSideBySideChainDottedLine(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2038452192);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2038452192, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainDottedLine (OptionSideBySideChainUnderlyingQuoteRow.kt:114)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final float fFloatValue = ((Number) objRememberedValue).floatValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final float fFloatValue2 = ((Number) objRememberedValue2).floatValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final float fFloatValue3 = ((Number) objRememberedValue3).floatValue();
            composerStartRestartGroup.endReplaceGroup();
            final long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainDottedLine$lambda$22$lambda$21(fFloatValue, fFloatValue2, jM21373getBg30d7_KjU, fFloatValue3, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifier3, (Function1) objRememberedValue4, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainDottedLine$lambda$23(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainDottedLine$lambda$22$lambda$21(float f, float f2, long j, float f3, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{f, f2}, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / 2;
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), f3, 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainTopUnderlyingQuoteIndicator(final BoxScope boxScope, final String underlyingQuoteStr, final boolean z, Modifier modifier, final Function0<Unit> scrollToQuote, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
        Intrinsics.checkNotNullParameter(scrollToQuote, "scrollToQuote");
        Composer composerStartRestartGroup = composer.startRestartGroup(1545063065);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(underlyingQuoteStr) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 8) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(scrollToQuote) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545063065, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTopUnderlyingQuoteIndicator (OptionSideBySideChainUnderlyingQuoteRow.kt:146)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                int i5 = i3;
                int i6 = (i5 & 14) | 28080;
                int i7 = i5 << 12;
                m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(boxScope, companion.getTopCenter(), companion.getCenter(), TableConstants.getQuoteRowHeightDp(), PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), underlyingQuoteStr, z, modifier3, scrollToQuote, composerStartRestartGroup, i6 | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainTopUnderlyingQuoteIndicator$lambda$24(boxScope, underlyingQuoteStr, z, modifier2, scrollToQuote, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            int i52 = i3;
            int i62 = (i52 & 14) | 28080;
            int i72 = i52 << 12;
            m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(boxScope, companion2.getTopCenter(), companion2.getCenter(), TableConstants.getQuoteRowHeightDp(), PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), underlyingQuoteStr, z, modifier3, scrollToQuote, composerStartRestartGroup, i62 | (458752 & i72) | (3670016 & i72) | (29360128 & i72) | (i72 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainBottomUnderlyingQuoteIndicator(final BoxScope boxScope, final boolean z, final String underlyingQuoteStr, final boolean z2, Modifier modifier, final Function0<Unit> scrollToQuote, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        Alignment center;
        float quoteRowHeightDp;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
        Intrinsics.checkNotNullParameter(scrollToQuote, "scrollToQuote");
        Composer composerStartRestartGroup = composer.startRestartGroup(1745182983);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(underlyingQuoteStr) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(scrollToQuote) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1745182983, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainBottomUnderlyingQuoteIndicator (OptionSideBySideChainUnderlyingQuoteRow.kt:168)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment bottomCenter = companion.getBottomCenter();
                    if (!z) {
                        center = companion.getTopCenter();
                    } else {
                        center = companion.getCenter();
                    }
                    if (!z) {
                        quoteRowHeightDp = C2002Dp.m7995constructorimpl(TableConstants.getQuoteRowHeightDp() + OptionSideBySideChainConstants.getBottomSheetOverlappingHeightDp());
                    } else {
                        quoteRowHeightDp = TableConstants.getQuoteRowHeightDp();
                    }
                    composerStartRestartGroup.startReplaceGroup(2083623687);
                    if (!z) {
                        paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    } else {
                        paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i5 = (i3 & 14) | 48;
                    int i6 = i3 << 9;
                    m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(boxScope, bottomCenter, center, quoteRowHeightDp, paddingValuesM5135PaddingValues0680j_4, underlyingQuoteStr, z3, modifier4, scrollToQuote, composerStartRestartGroup, (i6 & 234881024) | i5 | (458752 & i6) | (3670016 & i6) | (29360128 & i6), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainBottomUnderlyingQuoteIndicator$lambda$25(boxScope, z, underlyingQuoteStr, z2, modifier3, scrollToQuote, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i2 & 16) != 0) {
            }
            if ((74899 & i3) == 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment bottomCenter2 = companion2.getBottomCenter();
                if (!z) {
                }
                if (!z) {
                }
                composerStartRestartGroup.startReplaceGroup(2083623687);
                if (!z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (i3 & 14) | 48;
                int i62 = i3 << 9;
                m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(boxScope, bottomCenter2, center, quoteRowHeightDp, paddingValuesM5135PaddingValues0680j_4, underlyingQuoteStr, z3, modifier4, scrollToQuote, composerStartRestartGroup, (i62 & 234881024) | i52 | (458752 & i62) | (3670016 & i62) | (29360128 & i62), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z2;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 16) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee  */
    /* renamed from: OptionSideBySideChainUnderlyingQuoteIndicator-_-WMjBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m17285OptionSideBySideChainUnderlyingQuoteIndicator_WMjBM(final BoxScope boxScope, final Alignment alignment, final Alignment alignment2, final float f, final PaddingValues paddingValues, final String str, final boolean z, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final float f2;
        final PaddingValues paddingValues2;
        String str2;
        boolean z2;
        int i4;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2122885509);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(alignment2) ? 256 : 128;
            }
            if ((i2 & 4) == 0) {
                i3 |= 3072;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 24576;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 64;
                    if (i4 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((12582912 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 128) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                            }
                            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2122885509, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteIndicator (OptionSideBySideChainUnderlyingQuoteRow.kt:204)");
                                }
                                int i5 = i3;
                                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                final String str3 = str2;
                                modifier2 = modifier3;
                                composer2 = composerStartRestartGroup;
                                AnimatedVisibilityKt.AnimatedVisibility(z2, boxScope.align(Modifier.INSTANCE, alignment), enterTransitionFadeIn$default.plus(EnterExitTransitionKt.expandVertically$default(null, companion.getTop(), false, null, 13, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion.getTop(), false, null, 13, null)), (String) null, ComposableLambda3.rememberComposableLambda(1979755949, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$OptionSideBySideChainUnderlyingQuoteIndicator$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1979755949, i6, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteIndicator.<anonymous> (OptionSideBySideChainUnderlyingQuoteRow.kt:211)");
                                        }
                                        Modifier modifier4 = modifier3;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i7 = BentoTheme.$stable;
                                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU(), null, 2, null), paddingValues2), 0.0f, 1, null), f2), false, null, null, function0, 7, null);
                                        Alignment alignment3 = alignment2;
                                        String str4 = str3;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4893clickableXHw0xAI$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composer2, ((i5 >> 18) & 14) | 200064, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                            }
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainUnderlyingQuoteIndicator___WMjBM$lambda$26(boxScope, alignment, alignment2, f, paddingValues, str, z, modifier4, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if ((38347923 & i3) == 38347922) {
                            if (i4 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i52 = i3;
                            EnterTransition enterTransitionFadeIn$default2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            final String str32 = str2;
                            modifier2 = modifier3;
                            composer2 = composerStartRestartGroup;
                            AnimatedVisibilityKt.AnimatedVisibility(z2, boxScope.align(Modifier.INSTANCE, alignment), enterTransitionFadeIn$default2.plus(EnterExitTransitionKt.expandVertically$default(null, companion2.getTop(), false, null, 13, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion2.getTop(), false, null, 13, null)), (String) null, ComposableLambda3.rememberComposableLambda(1979755949, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$OptionSideBySideChainUnderlyingQuoteIndicator$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1979755949, i6, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteIndicator.<anonymous> (OptionSideBySideChainUnderlyingQuoteRow.kt:211)");
                                    }
                                    Modifier modifier42 = modifier3;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifier42, bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU(), null, 2, null), paddingValues2), 0.0f, 1, null), f2), false, null, null, function0, 7, null);
                                    Alignment alignment3 = alignment2;
                                    String str4 = str32;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4893clickableXHw0xAI$default);
                                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion22.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion22.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion22.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, ((i52 >> 18) & 14) | 200064, 16);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        final Modifier modifier42 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    if ((i2 & 128) == 0) {
                    }
                    if ((38347923 & i3) == 38347922) {
                    }
                    final Modifier modifier422 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z2 = z;
                i4 = i2 & 64;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i2 & 128) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                final Modifier modifier4222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            z2 = z;
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i2 & 128) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            final Modifier modifier42222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        z2 = z;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 128) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        final Modifier modifier422222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final SnapshotState4<Alignment> animateAlignmentAsState(Alignment alignment, Composer composer, int i) {
        composer.startReplaceGroup(-1843116115);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1843116115, i, -1, "com.robinhood.android.optionschain.sbschain.table.animateAlignmentAsState (OptionSideBySideChainUnderlyingQuoteRow.kt:234)");
        }
        Intrinsics.checkNotNull(alignment, "null cannot be cast to non-null type androidx.compose.ui.BiasAlignment");
        BiasAlignment biasAlignment = (BiasAlignment) alignment;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(biasAlignment.getHorizontalBias(), null, 0.0f, "UnderlyingQuoteRow biasX", null, composer, 3072, 22);
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(biasAlignment.getVerticalBias(), null, 0.0f, "UnderlyingQuoteRow biasY", null, composer, 3072, 22);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainUnderlyingQuoteRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainUnderlyingQuoteRow.animateAlignmentAsState$lambda$30$lambda$29(snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4<Alignment> snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment animateAlignmentAsState$lambda$30$lambda$29(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        return new BiasAlignment(animateAlignmentAsState$lambda$27(snapshotState4), animateAlignmentAsState$lambda$28(snapshotState42));
    }
}
