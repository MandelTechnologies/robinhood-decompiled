package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider2;
import androidx.compose.foundation.interaction.DragInteraction2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
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
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LimitCarouselBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001aQ\u0010\r\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001aQ\u0010\u0015\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"ChooseCreditLimitScreen", "", "depositBy", "", "deposits", "Lkotlinx/collections/immutable/ImmutableList;", "", "limits", "selectedIndex", "", "onSelected", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DepositPicker", "isLimitsDragging", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;IZLandroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LimitPicker", "isDepositsDragging", "EmptyCarouselRow", "itemHeightPixels", "(ILandroidx/compose/runtime/Composer;I)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LimitCarouselBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChooseCreditLimitScreen$lambda$7(String str, ImmutableList immutableList, ImmutableList immutableList2, int i, Function1 function1, int i2, Composer composer, int i3) {
        ChooseCreditLimitScreen(str, immutableList, immutableList2, i, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositPicker$lambda$17(ImmutableList immutableList, int i, boolean z, LazyListState lazyListState, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        DepositPicker(immutableList, i, z, lazyListState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyCarouselRow$lambda$28(int i, int i2, Composer composer, int i3) {
        EmptyCarouselRow(i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitPicker$lambda$27(ImmutableList immutableList, int i, boolean z, LazyListState lazyListState, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        LimitPicker(immutableList, i, z, lazyListState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final boolean ChooseCreditLimitScreen$lambda$0(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean ChooseCreditLimitScreen$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    public static final void ChooseCreditLimitScreen(final String depositBy, final ImmutableList<Long> deposits, final ImmutableList<Long> limits, final int i, final Function1<? super Integer, Unit> onSelected, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(depositBy, "depositBy");
        Intrinsics.checkNotNullParameter(deposits, "deposits");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1366568831);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(depositBy) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(deposits) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(limits) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelected) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1366568831, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.ChooseCreditLimitScreen (LimitCarouselBottomSheet.kt:175)");
            }
            int i4 = (i3 >> 9) & 14;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i, 0, composerStartRestartGroup, i4, 2);
            SnapshotState4<Boolean> snapshotState4CollectIsDraggedAsState = DragInteraction2.collectIsDraggedAsState(lazyListStateRememberLazyListState.getInteractionSource(), composerStartRestartGroup, 0);
            LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i, 0, composerStartRestartGroup, i4, 2);
            SnapshotState4<Boolean> snapshotState4CollectIsDraggedAsState2 = DragInteraction2.collectIsDraggedAsState(lazyListStateRememberLazyListState2.getInteractionSource(), composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_carousel_title, composerStartRestartGroup, 0);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
            String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_carousel_subtitle, new Object[]{depositBy}, composerStartRestartGroup, 0);
            int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8120);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_carousel_deposit_column, composerStartRestartGroup, 0);
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8170);
            composerStartRestartGroup.endNode();
            Modifier modifierWeight$default2 = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_carousel_limit_column, composerStartRestartGroup, 0), null, Color.m6701boximpl(BentoColor.INSTANCE.m21138getCCGoldAccent0d7_KjU()), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            int i6 = i3 >> 6;
            int i7 = i3 & 57344;
            DepositPicker(deposits, i, ChooseCreditLimitScreen$lambda$0(snapshotState4CollectIsDraggedAsState), lazyListStateRememberLazyListState2, onSelected, Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, ((i3 >> 3) & 14) | (i6 & 112) | i7, 0);
            composer2 = composerStartRestartGroup;
            LimitPicker(limits, i, ChooseCreditLimitScreen$lambda$1(snapshotState4CollectIsDraggedAsState2), lazyListStateRememberLazyListState, onSelected, Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, (i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | i7, 0);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitCarouselBottomSheetKt.ChooseCreditLimitScreen$lambda$7(depositBy, deposits, limits, i, onSelected, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DepositPicker(final ImmutableList<Long> deposits, final int i, final boolean z, final LazyListState lazyListState, final Function1<? super Integer, Unit> onSelected, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        boolean z2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z3;
        Object objRememberedValue3;
        final SnapshotIntState2 snapshotIntState22;
        SnapshotIntState2 snapshotIntState23;
        boolean z4;
        Object objRememberedValue4;
        ImmutableList<Long> immutableList;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(deposits, "deposits");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(520167013);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(deposits) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(lazyListState) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onSelected) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
            }
            if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(520167013, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.DepositPicker (LimitCarouselBottomSheet.kt:265)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListState, null, composerStartRestartGroup, (i4 >> 9) & 14, 2);
                Integer numValueOf = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i7 = i4 & 7168;
                z2 = ((i4 & 112) != 32) | (i7 != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LimitCarouselBottomSheetKt$DepositPicker$1$1(i, lazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i8 = i4 >> 3;
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i8 & 14);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion4, companion2.getCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue(), composerStartRestartGroup, 0) * 1.2f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                int i9 = i4;
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C12201R.drawable.svg_caret_left, composerStartRestartGroup, 0), (String) null, SizeKt.m5169size3ABfNKs(companion4, C2002Dp.m7995constructorimpl(16)), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), composerStartRestartGroup, 432, 0);
                composerStartRestartGroup.endNode();
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue() * 5, composerStartRestartGroup, 0) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM * 2)));
                Brush.Companion companion5 = Brush.INSTANCE;
                Float fValueOf = Float.valueOf(0.0f);
                Color.Companion companion6 = Color.INSTANCE;
                Modifier modifierFadingEdge = Helpers5.fadingEdge(modifierM5156height3ABfNKs, Brush.Companion.m6683verticalGradient8A3gB4$default(companion5, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null));
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM21593getSmallD9Ej5fM);
                PaddingValues paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i10 = i9 & 14;
                z3 = i10 != 4;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                    snapshotIntState22 = snapshotIntState2;
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitCarouselBottomSheetKt.DepositPicker$lambda$15$lambda$14$lambda$13(deposits, snapshotIntState22, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotIntState22 = snapshotIntState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotIntState23 = snapshotIntState22;
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierFadingEdge, lazyListState, paddingValuesM5135PaddingValues0680j_4, false, horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, flingBehaviorRememberSnapFlingBehavior, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i9 >> 6) & 112) | 196608, 392);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                Boolean boolValueOf = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z4 = ((i9 & 896) != 256) | (i7 != 2048) | ((i9 & 57344) != 16384);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue4 == companion.getEmpty()) {
                    LimitCarouselBottomSheetKt$DepositPicker$3$1 limitCarouselBottomSheetKt$DepositPicker$3$1 = new LimitCarouselBottomSheetKt$DepositPicker$3$1(lazyListState, snapshotIntState23, z, onSelected, null);
                    composerStartRestartGroup.updateRememberedValue(limitCarouselBottomSheetKt$DepositPicker$3$1);
                    objRememberedValue4 = limitCarouselBottomSheetKt$DepositPicker$3$1;
                }
                composerStartRestartGroup.endReplaceGroup();
                immutableList = deposits;
                EffectsKt.LaunchedEffect(immutableList, boolValueOf, (Function2) objRememberedValue4, composerStartRestartGroup, i10 | (i8 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                immutableList = deposits;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final ImmutableList<Long> immutableList2 = immutableList;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LimitCarouselBottomSheetKt.DepositPicker$lambda$17(immutableList2, i, z, lazyListState, onSelected, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i4 & 74899) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            FlingBehavior flingBehaviorRememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListState, null, composerStartRestartGroup, (i4 >> 9) & 14, 2);
            Integer numValueOf2 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i72 = i4 & 7168;
            z2 = ((i4 & 112) != 32) | (i72 != 2048);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue2 = new LimitCarouselBottomSheetKt$DepositPicker$1$1(i, lazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                int i82 = i4 >> 3;
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i82 & 14);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion42, companion22.getCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue(), composerStartRestartGroup, 0) * 1.2f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenterEnd(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        int i92 = i4;
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C12201R.drawable.svg_caret_left, composerStartRestartGroup, 0), (String) null, SizeKt.m5169size3ABfNKs(companion42, C2002Dp.m7995constructorimpl(16)), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), composerStartRestartGroup, 432, 0);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion42, C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue() * 5, composerStartRestartGroup, 0) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM2 * 2)));
                        Brush.Companion companion52 = Brush.INSTANCE;
                        Float fValueOf2 = Float.valueOf(0.0f);
                        Color.Companion companion62 = Color.INSTANCE;
                        Modifier modifierFadingEdge2 = Helpers5.fadingEdge(modifierM5156height3ABfNKs2, Brush.Companion.m6683verticalGradient8A3gB4$default(companion52, new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(companion62.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion62.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null));
                        Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM21593getSmallD9Ej5fM2);
                        PaddingValues paddingValuesM5135PaddingValues0680j_42 = PaddingKt.m5135PaddingValues0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21591getLargeD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i102 = i92 & 14;
                        if (i102 != 4) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            snapshotIntState22 = snapshotIntState2;
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LimitCarouselBottomSheetKt.DepositPicker$lambda$15$lambda$14$lambda$13(deposits, snapshotIntState22, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotIntState23 = snapshotIntState22;
                            Modifier modifier52 = modifier4;
                            LazyDslKt.LazyColumn(modifierFadingEdge2, lazyListState, paddingValuesM5135PaddingValues0680j_42, false, horizontalOrVerticalM5089spacedBy0680j_42, centerHorizontally2, flingBehaviorRememberSnapFlingBehavior2, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i92 >> 6) & 112) | 196608, 392);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if (i72 != 2048) {
                            }
                            z4 = ((i92 & 896) != 256) | (i72 != 2048) | ((i92 & 57344) != 16384);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                LimitCarouselBottomSheetKt$DepositPicker$3$1 limitCarouselBottomSheetKt$DepositPicker$3$12 = new LimitCarouselBottomSheetKt$DepositPicker$3$1(lazyListState, snapshotIntState23, z, onSelected, null);
                                composerStartRestartGroup.updateRememberedValue(limitCarouselBottomSheetKt$DepositPicker$3$12);
                                objRememberedValue4 = limitCarouselBottomSheetKt$DepositPicker$3$12;
                                composerStartRestartGroup.endReplaceGroup();
                                immutableList = deposits;
                                EffectsKt.LaunchedEffect(immutableList, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, i102 | (i82 & 112));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositPicker$lambda$15$lambda$14$lambda$13(ImmutableList immutableList, final SnapshotIntState2 snapshotIntState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(290579306, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$DepositPicker$2$2$1$1
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
                    ComposerKt.traceEventStart(290579306, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.DepositPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LimitCarouselBottomSheet.kt:310)");
                }
                LimitCarouselBottomSheetKt.EmptyCarouselRow(snapshotIntState2.getIntValue(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(LazyColumn, immutableList.size(), null, null, ComposableLambda3.composableLambdaInstance(-1828148159, true, new LimitCarouselBottomSheetKt$DepositPicker$2$2$1$2(immutableList, snapshotIntState2)), 6, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(914139923, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$DepositPicker$2$2$1$3
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
                    ComposerKt.traceEventStart(914139923, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.DepositPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LimitCarouselBottomSheet.kt:329)");
                }
                LimitCarouselBottomSheetKt.EmptyCarouselRow(snapshotIntState2.getIntValue(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LimitPicker(final ImmutableList<Long> limits, final int i, final boolean z, final LazyListState lazyListState, final Function1<? super Integer, Unit> onSelected, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        boolean z2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z3;
        Object objRememberedValue3;
        final SnapshotIntState2 snapshotIntState22;
        SnapshotIntState2 snapshotIntState23;
        boolean z4;
        Object objRememberedValue4;
        ImmutableList<Long> immutableList;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813907480);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(limits) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(lazyListState) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onSelected) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
            }
            if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813907480, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPicker (LimitCarouselBottomSheet.kt:363)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListState, null, composerStartRestartGroup, (i4 >> 9) & 14, 2);
                Integer numValueOf = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i7 = i4 & 7168;
                z2 = ((i4 & 112) != 32) | (i7 != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LimitCarouselBottomSheetKt$LimitPicker$1$1(i, lazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i8 = i4 >> 3;
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i8 & 14);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion4, companion2.getCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue(), composerStartRestartGroup, 0) * 1.2f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                int i9 = i4;
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C12201R.drawable.svg_caret_right, composerStartRestartGroup, 0), (String) null, SizeKt.m5169size3ABfNKs(companion4, C2002Dp.m7995constructorimpl(16)), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), composerStartRestartGroup, 432, 0);
                composerStartRestartGroup.endNode();
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue() * 5, composerStartRestartGroup, 0) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM * 2)));
                Brush.Companion companion5 = Brush.INSTANCE;
                Float fValueOf = Float.valueOf(0.0f);
                Color.Companion companion6 = Color.INSTANCE;
                Modifier modifierFadingEdge = Helpers5.fadingEdge(modifierM5156height3ABfNKs, Brush.Companion.m6683verticalGradient8A3gB4$default(companion5, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null));
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM21593getSmallD9Ej5fM);
                PaddingValues paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i10 = i9 & 14;
                z3 = i10 != 4;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                    snapshotIntState22 = snapshotIntState2;
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitCarouselBottomSheetKt.LimitPicker$lambda$25$lambda$24$lambda$23(limits, snapshotIntState22, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotIntState22 = snapshotIntState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotIntState23 = snapshotIntState22;
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierFadingEdge, lazyListState, paddingValuesM5135PaddingValues0680j_4, false, horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, flingBehaviorRememberSnapFlingBehavior, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i9 >> 6) & 112) | 196608, 392);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                Boolean boolValueOf = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z4 = ((i9 & 896) != 256) | (i7 != 2048) | ((i9 & 57344) != 16384);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue4 == companion.getEmpty()) {
                    LimitCarouselBottomSheetKt$LimitPicker$3$1 limitCarouselBottomSheetKt$LimitPicker$3$1 = new LimitCarouselBottomSheetKt$LimitPicker$3$1(lazyListState, snapshotIntState23, z, onSelected, null);
                    composerStartRestartGroup.updateRememberedValue(limitCarouselBottomSheetKt$LimitPicker$3$1);
                    objRememberedValue4 = limitCarouselBottomSheetKt$LimitPicker$3$1;
                }
                composerStartRestartGroup.endReplaceGroup();
                immutableList = limits;
                EffectsKt.LaunchedEffect(immutableList, boolValueOf, (Function2) objRememberedValue4, composerStartRestartGroup, i10 | (i8 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                immutableList = limits;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final ImmutableList<Long> immutableList2 = immutableList;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LimitCarouselBottomSheetKt.LimitPicker$lambda$27(immutableList2, i, z, lazyListState, onSelected, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i4 & 74899) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            FlingBehavior flingBehaviorRememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListState, null, composerStartRestartGroup, (i4 >> 9) & 14, 2);
            Integer numValueOf2 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i72 = i4 & 7168;
            z2 = ((i4 & 112) != 32) | (i72 != 2048);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue2 = new LimitCarouselBottomSheetKt$LimitPicker$1$1(i, lazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                int i82 = i4 >> 3;
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i82 & 14);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion42, companion22.getCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue(), composerStartRestartGroup, 0) * 1.2f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenterStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        int i92 = i4;
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C12201R.drawable.svg_caret_right, composerStartRestartGroup, 0), (String) null, SizeKt.m5169size3ABfNKs(companion42, C2002Dp.m7995constructorimpl(16)), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), composerStartRestartGroup, 432, 0);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion42, C2002Dp.m7995constructorimpl(Helpers5.pixelsToDp(snapshotIntState2.getIntValue() * 5, composerStartRestartGroup, 0) + C2002Dp.m7995constructorimpl(fM21593getSmallD9Ej5fM2 * 2)));
                        Brush.Companion companion52 = Brush.INSTANCE;
                        Float fValueOf2 = Float.valueOf(0.0f);
                        Color.Companion companion62 = Color.INSTANCE;
                        Modifier modifierFadingEdge2 = Helpers5.fadingEdge(modifierM5156height3ABfNKs2, Brush.Companion.m6683verticalGradient8A3gB4$default(companion52, new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(companion62.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion62.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null));
                        Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM21593getSmallD9Ej5fM2);
                        PaddingValues paddingValuesM5135PaddingValues0680j_42 = PaddingKt.m5135PaddingValues0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21591getLargeD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i102 = i92 & 14;
                        if (i102 != 4) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            snapshotIntState22 = snapshotIntState2;
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LimitCarouselBottomSheetKt.LimitPicker$lambda$25$lambda$24$lambda$23(limits, snapshotIntState22, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotIntState23 = snapshotIntState22;
                            Modifier modifier52 = modifier4;
                            LazyDslKt.LazyColumn(modifierFadingEdge2, lazyListState, paddingValuesM5135PaddingValues0680j_42, false, horizontalOrVerticalM5089spacedBy0680j_42, centerHorizontally2, flingBehaviorRememberSnapFlingBehavior2, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i92 >> 6) & 112) | 196608, 392);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if (i72 != 2048) {
                            }
                            z4 = ((i92 & 896) != 256) | (i72 != 2048) | ((i92 & 57344) != 16384);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                LimitCarouselBottomSheetKt$LimitPicker$3$1 limitCarouselBottomSheetKt$LimitPicker$3$12 = new LimitCarouselBottomSheetKt$LimitPicker$3$1(lazyListState, snapshotIntState23, z, onSelected, null);
                                composerStartRestartGroup.updateRememberedValue(limitCarouselBottomSheetKt$LimitPicker$3$12);
                                objRememberedValue4 = limitCarouselBottomSheetKt$LimitPicker$3$12;
                                composerStartRestartGroup.endReplaceGroup();
                                immutableList = limits;
                                EffectsKt.LaunchedEffect(immutableList, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, i102 | (i82 & 112));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitPicker$lambda$25$lambda$24$lambda$23(ImmutableList immutableList, final SnapshotIntState2 snapshotIntState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-80070099, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$2$2$1$1
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
                    ComposerKt.traceEventStart(-80070099, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LimitCarouselBottomSheet.kt:408)");
                }
                LimitCarouselBottomSheetKt.EmptyCarouselRow(snapshotIntState2.getIntValue(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(LazyColumn, immutableList.size(), null, null, ComposableLambda3.composableLambdaInstance(619400388, true, new LimitCarouselBottomSheetKt$LimitPicker$2$2$1$2(immutableList, snapshotIntState2)), 6, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(211081238, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$2$2$1$3
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
                    ComposerKt.traceEventStart(211081238, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LimitCarouselBottomSheet.kt:433)");
                }
                LimitCarouselBottomSheetKt.EmptyCarouselRow(snapshotIntState2.getIntValue(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmptyCarouselRow(final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1990842777);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1990842777, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.EmptyCarouselRow (LimitCarouselBottomSheet.kt:459)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(PlaceholderUtils.XXShortPlaceholderText, SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Helpers5.pixelsToDp(i, composerStartRestartGroup, i3 & 14)), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 6, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitCarouselBottomSheetKt.EmptyCarouselRow$lambda$28(i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
