package com.robinhood.android.feature.livetrivia.composable;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatable5;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.feature.livetrivia.C16765R;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001f\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\" \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002"}, m3636d2 = {"ITEMS_PER_AXIS", "", "SQUARE_SIZE_DP", "COIN_SIZE_DP", "SPIRAL_REVEAL_ORDER", "", "Lkotlin/Pair;", "SPIRAL_REVEAL_INITIAL_DELAY_MS", "", "SPIRAL_REVEAL_INTERVAL_MS", "RANDOM_FLIP_INTERVAL_MS", "RANDOM_FLIP_COIN_DELAY_MS", "SpinningCoinGridComposable", "", "heightInDp", "Landroidx/compose/ui/unit/Dp;", "isGoldStyled", "", "modifier", "Landroidx/compose/ui/Modifier;", "SpinningCoinGridComposable-Kz89ssw", "(FZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpinningCoinComposable", "squareSize", "size", "isVisible", "composition", "Lcom/airbnb/lottie/LottieComposition;", "spinDirection", "Lcom/robinhood/android/feature/livetrivia/composable/SpinDirection;", "isDragging", "SpinningCoinComposable-cmh-DWc", "(FFZLcom/airbnb/lottie/LottieComposition;Lcom/robinhood/android/feature/livetrivia/composable/SpinDirection;ZLandroidx/compose/runtime/Composer;I)V", "feature-live-trivia_externalDebug", "revealFinished"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SpinningCoinGridComposable2 {
    private static final int COIN_SIZE_DP = 35;
    private static final int ITEMS_PER_AXIS = 7;
    private static final long RANDOM_FLIP_COIN_DELAY_MS = 100;
    private static final long RANDOM_FLIP_INTERVAL_MS = 1000;
    private static final long SPIRAL_REVEAL_INITIAL_DELAY_MS = 300;
    private static final long SPIRAL_REVEAL_INTERVAL_MS = 50;
    private static final List<Tuples2<Integer, Integer>> SPIRAL_REVEAL_ORDER = CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(3, 3), Tuples4.m3642to(3, 4), Tuples4.m3642to(2, 4), Tuples4.m3642to(2, 3), Tuples4.m3642to(2, 2), Tuples4.m3642to(3, 2), Tuples4.m3642to(4, 2), Tuples4.m3642to(4, 3), Tuples4.m3642to(4, 4), Tuples4.m3642to(4, 5), Tuples4.m3642to(3, 5), Tuples4.m3642to(2, 5), Tuples4.m3642to(1, 5), Tuples4.m3642to(1, 4), Tuples4.m3642to(1, 3), Tuples4.m3642to(1, 2), Tuples4.m3642to(1, 1), Tuples4.m3642to(2, 1), Tuples4.m3642to(3, 1), Tuples4.m3642to(4, 1), Tuples4.m3642to(5, 1), Tuples4.m3642to(5, 2), Tuples4.m3642to(5, 3), Tuples4.m3642to(5, 4), Tuples4.m3642to(5, 5), Tuples4.m3642to(5, 6), Tuples4.m3642to(4, 6), Tuples4.m3642to(3, 6), Tuples4.m3642to(2, 6), Tuples4.m3642to(1, 6), Tuples4.m3642to(0, 6), Tuples4.m3642to(0, 5), Tuples4.m3642to(0, 4), Tuples4.m3642to(0, 3), Tuples4.m3642to(0, 2), Tuples4.m3642to(0, 1), Tuples4.m3642to(0, 0), Tuples4.m3642to(1, 0), Tuples4.m3642to(2, 0), Tuples4.m3642to(3, 0), Tuples4.m3642to(4, 0), Tuples4.m3642to(5, 0), Tuples4.m3642to(6, 0), Tuples4.m3642to(6, 1), Tuples4.m3642to(6, 2), Tuples4.m3642to(6, 3), Tuples4.m3642to(6, 4), Tuples4.m3642to(6, 5), Tuples4.m3642to(6, 6)});
    private static final int SQUARE_SIZE_DP = 44;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinningCoinComposable_cmh_DWc$lambda$21(float f, float f2, boolean z, LottieComposition lottieComposition, SpinningCoinGridComposable spinningCoinGridComposable, boolean z2, int i, Composer composer, int i2) {
        m14477SpinningCoinComposablecmhDWc(f, f2, z, lottieComposition, spinningCoinGridComposable, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinningCoinGridComposable_Kz89ssw$lambda$16(float f, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14478SpinningCoinGridComposableKz89ssw(f, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /* renamed from: SpinningCoinGridComposable-Kz89ssw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14478SpinningCoinGridComposableKz89ssw(final float f, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        Object objRememberedValue;
        int iIntValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        int iIntValue2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState2;
        Object objRememberedValue5;
        SnapshotState snapshotState3;
        Object objRememberedValue6;
        SnapshotState snapshotState4;
        Object objRememberedValue7;
        boolean zChanged;
        Object objRememberedValue8;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        SnapshotStateMap snapshotStateMap;
        Object objRememberedValue9;
        Composer.Companion companion2;
        CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue10;
        final Modifier modifier3;
        float f2;
        SpinningCoinGridComposable spinningCoinGridComposable;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(474004153);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(474004153, i3, -1, "com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposable (SpinningCoinGridComposable.kt:77)");
                }
                int i7 = !z ? C16765R.raw.lottie_coin_yg : C16765R.raw.lottie_coin_ng;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = Integer.valueOf(Math.min((int) C2002Dp.m7995constructorimpl(f / 44), 7));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                iIntValue = ((Number) objRememberedValue).intValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(251470218);
                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                composerStartRestartGroup.endReplaceGroup();
                int i8 = (int) fMo5013toDpu2uoSUM;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = Integer.valueOf(Math.min((i8 - 48) / 44, 7));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                iIntValue2 = ((Number) objRememberedValue2).intValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i7)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                    snapshotMutationPolicy = null;
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    snapshotMutationPolicy = null;
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateMapOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.wrapContentSize$default(modifier4, null, false, 3, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(iIntValue);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new SpinningCoinGridComposable4(snapshotState2, iIntValue2, iIntValue, snapshotState3, snapshotState4);
                    i4 = iIntValue2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    i4 = iIntValue2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM4872backgroundbw27NRU$default, unit, (PointerInputEventHandler) objRememberedValue8);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(495290875);
                i5 = 0;
                while (i5 < iIntValue) {
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Modifier modifierAlign = column6.align(modifierWrapContentHeight$default, companion4.getCenterHorizontally());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1953851244);
                    int i9 = 0;
                    while (i9 < i4) {
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(44);
                        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(35);
                        boolean zContainsKey = snapshotStateMap2.containsKey(Tuples4.m3642to(Integer.valueOf(i5), Integer.valueOf(i9)));
                        int i10 = i4;
                        LottieComposition lottieCompositionSpinningCoinGridComposable_Kz89ssw$lambda$6 = SpinningCoinGridComposable_Kz89ssw$lambda$6(lottieCompositionResultRememberLottieComposition);
                        SnapshotStateMap snapshotStateMap3 = snapshotStateMap2;
                        if (Intrinsics.areEqual(snapshotState3.getValue(), Tuples4.m3642to(Integer.valueOf(i5), Integer.valueOf(i9)))) {
                            f2 = fM7995constructorimpl2;
                            spinningCoinGridComposable = (SpinningCoinGridComposable) snapshotState4.getValue();
                        } else {
                            f2 = fM7995constructorimpl2;
                            spinningCoinGridComposable = null;
                        }
                        m14477SpinningCoinComposablecmhDWc(fM7995constructorimpl, f2, zContainsKey, lottieCompositionSpinningCoinGridComposable_Kz89ssw$lambda$6, spinningCoinGridComposable, ((Boolean) snapshotState2.getValue()).booleanValue(), composerStartRestartGroup, 54);
                        i9++;
                        i5 = i5;
                        i4 = i10;
                        snapshotStateMap2 = snapshotStateMap3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    i5++;
                    snapshotStateMap2 = snapshotStateMap2;
                }
                snapshotStateMap = snapshotStateMap2;
                int i11 = i4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue9 == companion2.getEmpty()) {
                    objRememberedValue9 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                coroutineScope = (CoroutineScope) objRememberedValue9;
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue10 == companion2.getEmpty()) {
                    objRememberedValue10 = new SpinningCoinGridComposable5(snapshotState4, coroutineScope, snapshotStateMap, snapshotState3, snapshotState, null);
                    snapshotState4 = snapshotState4;
                    snapshotState3 = snapshotState3;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 6);
                if (SpinningCoinGridComposable_Kz89ssw$lambda$4(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(iIntValue);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue11 == companion2.getEmpty()) {
                        objRememberedValue11 = new SpinningCoinGridComposable6(coroutineScope, i11, iIntValue, snapshotState2, snapshotState4, snapshotState3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 6);
                }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpinningCoinGridComposable2.SpinningCoinGridComposable_Kz89ssw$lambda$16(f, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = Integer.valueOf(Math.min((int) C2002Dp.m7995constructorimpl(f / 44), 7));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                iIntValue = ((Number) objRememberedValue).intValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(251470218);
                float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                composerStartRestartGroup.endReplaceGroup();
                int i82 = (int) fMo5013toDpu2uoSUM2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                iIntValue2 = ((Number) objRememberedValue2).intValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i7)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                SnapshotStateMap snapshotStateMap22 = (SnapshotStateMap) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.wrapContentSize$default(modifier4, null, false, 3, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
                Unit unit3 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(iIntValue);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue8 = new SpinningCoinGridComposable4(snapshotState2, iIntValue2, iIntValue, snapshotState3, snapshotState4);
                    i4 = iIntValue2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierM4872backgroundbw27NRU$default2, unit3, (PointerInputEventHandler) objRememberedValue8);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(495290875);
                        i5 = 0;
                        while (i5 < iIntValue) {
                        }
                        snapshotStateMap = snapshotStateMap22;
                        int i112 = i4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue9 == companion2.getEmpty()) {
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue9;
                        Unit unit22 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue10 = new SpinningCoinGridComposable5(snapshotState4, coroutineScope, snapshotStateMap, snapshotState3, snapshotState, null);
                            snapshotState4 = snapshotState4;
                            snapshotState3 = snapshotState3;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 6);
                            if (SpinningCoinGridComposable_Kz89ssw$lambda$4(snapshotState)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean SpinningCoinGridComposable_Kz89ssw$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition SpinningCoinGridComposable_Kz89ssw$lambda$6(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpinningCoinGridComposable_Kz89ssw$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: SpinningCoinComposable-cmh-DWc, reason: not valid java name */
    private static final void m14477SpinningCoinComposablecmhDWc(final float f, final float f2, final boolean z, final LottieComposition lottieComposition, SpinningCoinGridComposable spinningCoinGridComposable, final boolean z2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Object spinningCoinGridComposable3;
        final SpinningCoinGridComposable spinningCoinGridComposable2;
        Composer composerStartRestartGroup = composer.startRestartGroup(864042796);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(spinningCoinGridComposable == null ? -1 : spinningCoinGridComposable.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            spinningCoinGridComposable2 = spinningCoinGridComposable;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(864042796, i2, -1, "com.robinhood.android.feature.livetrivia.composable.SpinningCoinComposable (SpinningCoinGridComposable.kt:198)");
            }
            final LottieAnimatable lottieAnimatableRememberLottieAnimatable = LottieAnimatable5.rememberLottieAnimatable(composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(ModifiersKt.isInvisible(SizeKt.m5169size3ABfNKs(companion, f), !z), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, f2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimatableRememberLottieAnimatable);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(lottieAnimatableRememberLottieAnimatable.getProgress());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierM5169size3ABfNKs, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i2 >> 9) & 14, 0, 65528);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            HapticFeedback hapticFeedback = (HapticFeedback) composer2.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer2);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            composer2.startReplaceGroup(-1224400529);
            boolean zChanged2 = ((i3 & 57344) == 16384) | composer2.changed(lottieAnimatableRememberLottieAnimatable) | ((i3 & 458752) == 131072) | composer2.changedInstance(hapticFeedback) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(lottieComposition);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion3.getEmpty()) {
                spinningCoinGridComposable3 = new SpinningCoinGridComposable3(lottieAnimatableRememberLottieAnimatable, spinningCoinGridComposable, z2, hapticFeedback, coroutineScope, lottieComposition, null);
                spinningCoinGridComposable2 = spinningCoinGridComposable;
                composer2.updateRememberedValue(spinningCoinGridComposable3);
            } else {
                spinningCoinGridComposable3 = objRememberedValue3;
                spinningCoinGridComposable2 = spinningCoinGridComposable;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(spinningCoinGridComposable2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) spinningCoinGridComposable3, composer2, (i3 >> 12) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpinningCoinGridComposable2.SpinningCoinComposable_cmh_DWc$lambda$21(f, f2, z, lottieComposition, spinningCoinGridComposable2, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
