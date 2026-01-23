package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.IntervalSelectorState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector3;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Placeholders;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: ScrollingIntervalSelector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001aC\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"PICKER_VISIBLE_ITEM_COUNT", "", "ScrollingIntervalSelector", "", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/IntervalSelectorState;", "onIntervalSelected", "Lkotlin/Function1;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "onIntervalMenuOpen", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/IntervalSelectorState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "pixelsToDp", "Landroidx/compose/ui/unit/Dp;", "pixels", "(ILandroidx/compose/runtime/Composer;I)F", "fadingEdge", "brush", "Landroidx/compose/ui/graphics/Brush;", "ScrollingIntervalSelectorPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "internalInterval", "itemHeightPixels", "showIntervalSelector", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ScrollingIntervalSelector3 {
    private static final int PICKER_VISIBLE_ITEM_COUNT = 7;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollingIntervalSelector$lambda$17(IntervalSelectorState intervalSelectorState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ScrollingIntervalSelector(intervalSelectorState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollingIntervalSelectorPreview$lambda$20(int i, Composer composer, int i2) {
        ScrollingIntervalSelectorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollingIntervalSelector(IntervalSelectorState intervalSelectorState, final Function1<? super IntervalDto, Unit> onIntervalSelected, final Function0<Unit> onIntervalMenuOpen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final HapticFeedback hapticFeedback;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int iMax;
        boolean zChanged2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        IntervalSelectorState intervalSelectorState2;
        Modifier modifier3;
        final Modifier modifier4;
        LazyListState lazyListState;
        SnapshotState snapshotState2;
        IntervalDto currentInterval;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onIntervalSelected, "onIntervalSelected");
        Intrinsics.checkNotNullParameter(onIntervalMenuOpen, "onIntervalMenuOpen");
        Composer composerStartRestartGroup = composer.startRestartGroup(894030290);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(intervalSelectorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIntervalSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIntervalMenuOpen) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(894030290, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector (ScrollingIntervalSelector.kt:70)");
                }
                View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(intervalSelectorState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                iMax = intervalSelectorState != null ? 0 : Math.max(0, CollectionsKt.indexOf((List<? extends IntervalDto>) intervalSelectorState.getIntervals(), intervalSelectorState.getCurrentInterval()));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(intervalSelectorState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new LazyListState(iMax, 0, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                LazyListState lazyListState2 = (LazyListState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue5 = snapshotStateMutableStateOf$default;
                }
                snapshotState = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(modifier5, (intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null) != null, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i3 & 896) != 256);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$11$lambda$10(hapticFeedback, onIntervalMenuOpen, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(ClickableKt.m4893clickableXHw0xAI$default(modifierBentoPlaceholder$default, false, null, null, (Function0) objRememberedValue6, 7, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                if (intervalSelectorState != null || (currentInterval = intervalSelectorState.getCurrentInterval()) == null || (label = currentInterval.getLabel()) == null) {
                    String label = "XXX XXX";
                }
                BentoText2.m20747BentoText38GnDrw(label, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21371getBg0d7_KjU2), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8168);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.DROPDOWN_12), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ScrollingIntervalSelector$lambda$8(snapshotState)) {
                    intervalSelectorState2 = intervalSelectorState;
                    modifier3 = modifier5;
                } else {
                    Alignment centerEnd = companion2.getCenterEnd();
                    long jM8033constructorimpl = IntOffset.m8033constructorimpl(((-((int) (snapshotIntState2.getIntValue() * 2.5d))) & 4294967295L) | (0 << 32));
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer2.changedInstance(hapticFeedback);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$14$lambda$13(hapticFeedback, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    int i6 = i3;
                    modifier3 = modifier5;
                    AndroidPopup_androidKt.m8111PopupK5zGePQ(centerEnd, jM8033constructorimpl, (Function0) objRememberedValue7, null, ComposableLambda3.rememberComposableLambda(-1689256406, true, new C106754(jM21371getBg0d7_KjU, intervalSelectorState, lazyListState2, coroutineScope, onIntervalSelected, snapshotIntState2, 6), composer2, 54), composer2, 24582, 8);
                    composer2 = composer2;
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged3 = composer2.changed(lazyListState2) | composer2.changedInstance(intervalSelectorState) | composer2.changed(snapshotState3) | composer2.changedInstance(view);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                        lazyListState = lazyListState2;
                        ScrollingIntervalSelector8 scrollingIntervalSelector8 = new ScrollingIntervalSelector8(lazyListState, intervalSelectorState, snapshotIntState2, view, snapshotState3, null);
                        intervalSelectorState2 = intervalSelectorState;
                        snapshotState2 = snapshotState3;
                        composer2.updateRememberedValue(scrollingIntervalSelector8);
                        objRememberedValue8 = scrollingIntervalSelector8;
                    } else {
                        intervalSelectorState2 = intervalSelectorState;
                        lazyListState = lazyListState2;
                        snapshotState2 = snapshotState3;
                    }
                    composer2.endReplaceGroup();
                    int i7 = i6 & 14;
                    EffectsKt.LaunchedEffect(intervalSelectorState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, i7);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged4 = composer2.changed(lazyListState) | composer2.changed(snapshotState2) | ((i6 & 112) == 32) | composer2.changedInstance(hapticFeedback);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue9 == companion.getEmpty()) {
                        ScrollingIntervalSelector9 scrollingIntervalSelector9 = new ScrollingIntervalSelector9(lazyListState, hapticFeedback, snapshotState2, onIntervalSelected, snapshotState, null);
                        composer2.updateRememberedValue(scrollingIntervalSelector9);
                        objRememberedValue9 = scrollingIntervalSelector9;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(intervalSelectorState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composer2, i7);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                intervalSelectorState2 = intervalSelectorState;
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final IntervalSelectorState intervalSelectorState3 = intervalSelectorState2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$17(intervalSelectorState3, onIntervalSelected, onIntervalMenuOpen, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(intervalSelectorState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                SnapshotState snapshotState32 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                if (intervalSelectorState != null) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(intervalSelectorState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue4 = new LazyListState(iMax, 0, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    LazyListState lazyListState22 = (LazyListState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU3 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(modifier5, (intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null) != null, null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i3 & 896) != 256);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$11$lambda$10(hapticFeedback, onIntervalMenuOpen, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(ClickableKt.m4893clickableXHw0xAI$default(modifierBentoPlaceholder$default2, false, null, null, (Function0) objRememberedValue6, 7, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                            TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                            FontWeight bold2 = FontWeight.INSTANCE.getBold();
                            long jM21371getBg0d7_KjU22 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                            if (intervalSelectorState != null) {
                                String label2 = "XXX XXX";
                                BentoText2.m20747BentoText38GnDrw(label2, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21371getBg0d7_KjU22), null, bold2, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 24576, 0, 8168);
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.DROPDOWN_12), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                                composer2 = composerStartRestartGroup;
                                composer2.endNode();
                                if (ScrollingIntervalSelector$lambda$8(snapshotState)) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ScrollingIntervalSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4 */
    static final class C106754 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ LazyListState $columnState;
        final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate;
        final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ int $spacerItems;
        final /* synthetic */ IntervalSelectorState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C106754(long j, IntervalSelectorState intervalSelectorState, LazyListState lazyListState, CoroutineScope coroutineScope, Function1<? super IntervalDto, Unit> function1, SnapshotIntState2 snapshotIntState2, int i) {
            this.$backgroundColor = j;
            this.$state = intervalSelectorState;
            this.$columnState = lazyListState;
            this.$scope = coroutineScope;
            this.$onIntervalSelected = function1;
            this.$itemHeightPixels$delegate = snapshotIntState2;
            this.$spacerItems = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$9$lambda$8$lambda$7$lambda$1(int i, IntervalDto item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item;
        }

        public final void invoke(Composer composer, int i) {
            final LazyListState lazyListState;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1689256406, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector.<anonymous> (ScrollingIntervalSelector.kt:129)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM())), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            long j = this.$backgroundColor;
            final IntervalSelectorState intervalSelectorState = this.$state;
            LazyListState lazyListState2 = this.$columnState;
            final CoroutineScope coroutineScope = this.$scope;
            final Function1<IntervalDto, Unit> function1 = this.$onIntervalSelected;
            final SnapshotIntState2 snapshotIntState2 = this.$itemHeightPixels$delegate;
            final int i3 = this.$spacerItems;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()));
            float f = 100;
            BoxKt.Box(SizeKt.m5171sizeVpY3zN4(modifierM4871backgroundbw27NRU, C2002Dp.m7995constructorimpl(f), ScrollingIntervalSelector3.pixelsToDp(ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$4(snapshotIntState2), composer, 0)), composer, 0);
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(f), ScrollingIntervalSelector3.pixelsToDp(ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$4(snapshotIntState2) * 7, composer, 0));
            Brush.Companion companion4 = Brush.INSTANCE;
            Float fValueOf = Float.valueOf(0.0f);
            Color.Companion companion5 = Color.INSTANCE;
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(ScrollingIntervalSelector3.fadingEdge(modifierM5171sizeVpY3zN4, Brush.Companion.m6683verticalGradient8A3gB4$default(companion4, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion5.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.3f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(0.7f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion5.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null)), intervalSelectorState == null, null, 2, null);
            FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProvider2.rememberSnapFlingBehavior(lazyListState2, null, composer, 0, 2);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(intervalSelectorState) | composer.changedInstance(coroutineScope) | composer.changed(lazyListState2) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                lazyListState = lazyListState2;
                Object obj = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ScrollingIntervalSelector3.C106754.invoke$lambda$9$lambda$8$lambda$7(i3, intervalSelectorState, snapshotIntState2, coroutineScope, lazyListState, function1, (LazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                lazyListState = lazyListState2;
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierBentoPlaceholder$default, lazyListState, null, false, center2, centerHorizontally, flingBehaviorRememberSnapFlingBehavior, false, null, (Function1) objRememberedValue, composer, 221184, WaitlistAnimationConstants.LEFT_YAW_START);
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
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(int i, final IntervalSelectorState intervalSelectorState, final SnapshotIntState2 snapshotIntState2, final CoroutineScope coroutineScope, final LazyListState lazyListState, final Function1 function1, LazyListScope lazyListScope) {
            ImmutableList<IntervalDto> placeholder_intervals;
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            int i2 = i / 2;
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                LazyListScope lazyListScope2 = LazyColumn;
                LazyListScope.item$default(lazyListScope2, null, null, ComposableLambda3.composableLambdaInstance(-1003990815, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i5) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i5 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1003990815, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScrollingIntervalSelector.kt:166)");
                        }
                        BoxKt.Box(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, ScrollingIntervalSelector3.pixelsToDp(ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$4(snapshotIntState2), composer, 0)), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                i4++;
                LazyColumn = lazyListScope2;
            }
            LazyListScope lazyListScope3 = LazyColumn;
            if (intervalSelectorState == null || (placeholder_intervals = intervalSelectorState.getIntervals()) == null) {
                placeholder_intervals = Placeholders.getPLACEHOLDER_INTERVALS();
            }
            final ImmutableList<IntervalDto> immutableList = placeholder_intervals;
            final Function2 function2 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScrollingIntervalSelector3.C106754.invoke$lambda$9$lambda$8$lambda$7$lambda$1(((Integer) obj).intValue(), (IntervalDto) obj2);
                }
            };
            lazyListScope3.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i5) {
                    return function2.invoke(Integer.valueOf(i5), immutableList.get(i5));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i5) {
                    immutableList.get(i5);
                    return null;
                }
            }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, final int i5, Composer composer, int i6) {
                    int i7;
                    final IntervalDto intervalDto;
                    long jM21427getFg30d7_KjU;
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i6 & 48) == 0) {
                        i7 |= composer.changed(i5) ? 32 : 16;
                    }
                    boolean z = true;
                    if (!composer.shouldExecute((i7 & 147) != 146, i7 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i7, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    IntervalDto intervalDto2 = (IntervalDto) immutableList.get(i5);
                    composer.startReplaceGroup(1997608115);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        final SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                        objRememberedValue = new Function1<IntSize, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m11840invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m11840invokeozmzZPI(long j) {
                                snapshotIntState22.setIntValue((int) (j & 4294967295L));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierOnSizeChanged, 0.0f, bentoTheme.getSpacing(composer, i8).m21595getXsmallD9Ej5fM(), 1, null);
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(lazyListState);
                    if ((((i7 & 112) ^ 48) <= 32 || !composer.changed(i5)) && (i7 & 48) != 32) {
                        z = false;
                    }
                    boolean zChanged = zChangedInstance | z | composer.changed(function1) | composer.changedInstance(intervalDto2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                        intervalDto = intervalDto2;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final LazyListState lazyListState2 = lazyListState;
                        final Function1 function12 = function1;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$3$2$1

                            /* compiled from: ScrollingIntervalSelector.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$3$2$1$1", m3645f = "ScrollingIntervalSelector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$3$2$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ LazyListState $columnState;
                                final /* synthetic */ int $index;
                                final /* synthetic */ IntervalDto $interval;
                                final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(LazyListState lazyListState, int i, Function1<? super IntervalDto, Unit> function1, IntervalDto intervalDto, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$columnState = lazyListState;
                                    this.$index = i;
                                    this.$onIntervalSelected = function1;
                                    this.$interval = intervalDto;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$columnState, this.$index, this.$onIntervalSelected, this.$interval, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    AnonymousClass1 anonymousClass1;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        LazyListState lazyListState = this.$columnState;
                                        int i2 = this.$index;
                                        this.label = 1;
                                        anonymousClass1 = this;
                                        if (LazyListState.animateScrollToItem$default(lazyListState, i2, 0, anonymousClass1, 2, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        anonymousClass1 = this;
                                    }
                                    anonymousClass1.$onIntervalSelected.invoke(anonymousClass1.$interval);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(lazyListState2, i5, function12, intervalDto, null), 3, null);
                            }
                        };
                        composer.updateRememberedValue(function0);
                        objRememberedValue2 = function0;
                    } else {
                        intervalDto = intervalDto2;
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String label = intervalDto.getLabel();
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    IntervalSelectorState intervalSelectorState2 = intervalSelectorState;
                    if (Intrinsics.areEqual(intervalDto, intervalSelectorState2 != null ? intervalSelectorState2.getCurrentInterval() : null)) {
                        composer.startReplaceGroup(342657067);
                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i8).m21425getFg0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(342754314);
                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i8).m21427getFg30d7_KjU();
                        composer.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(label, companion, Color.m6701boximpl(jM21427getFg30d7_KjU), null, bold, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, null, composer, 24624, 0, 16296);
                    composer.endNode();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            while (i3 < i2) {
                LazyListScope.item$default(lazyListScope3, null, null, ComposableLambda3.composableLambdaInstance(185782858, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$4$1$1$1$4$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i5) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i5 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(185782858, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScrollingIntervalSelector.kt:203)");
                        }
                        BoxKt.Box(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, ScrollingIntervalSelector3.pixelsToDp(ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$4(snapshotIntState2), composer, 0)), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                i3++;
                lazyListScope3 = lazyListScope;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ScrollingIntervalSelector$lambda$4(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntervalDto ScrollingIntervalSelector$lambda$1(SnapshotState<IntervalDto> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean ScrollingIntervalSelector$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollingIntervalSelector$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollingIntervalSelector$lambda$11$lambda$10(HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        ScrollingIntervalSelector$lambda$9(snapshotState, !ScrollingIntervalSelector$lambda$8(snapshotState));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollingIntervalSelector$lambda$14$lambda$13(HapticFeedback hapticFeedback, SnapshotState snapshotState) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        ScrollingIntervalSelector$lambda$9(snapshotState, false);
        return Unit.INSTANCE;
    }

    public static final float pixelsToDp(int i, Composer composer, int i2) {
        composer.startReplaceGroup(578069163);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(578069163, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.pixelsToDp (ScrollingIntervalSelector.kt:244)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    public static final Modifier fadingEdge(Modifier modifier, final Brush brush) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(brush, "brush");
        return DrawModifierKt.drawWithContent(GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI(), Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScrollingIntervalSelector3.fadingEdge$lambda$19(brush, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fadingEdge$lambda$19(Brush brush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6651getDstIn0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    private static final void ScrollingIntervalSelectorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-762474271);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-762474271, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorPreview (ScrollingIntervalSelector.kt:255)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScrollingIntervalSelector.INSTANCE.m1752x5addd2f1(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScrollingIntervalSelector3.ScrollingIntervalSelectorPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
