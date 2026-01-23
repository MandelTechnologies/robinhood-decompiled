package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aÀ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\f*\u00020\u0005H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\f*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\fH\u0002\u001a\f\u0010\u001b\u001a\u00020\f*\u00020\u0005H\u0002¨\u0006\u001c²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"LadderGestureAwareLazyColumn", "", "ladderData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onPendingOrderDragDirectionChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "onPendingOrderSelected", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "onPendingOrderDraggedOverRowChanged", "", "onPendingOrderDragEnded", "Lkotlin/Function2;", "", "onZoomStateChanged", "onZoomScaleChanged", "modifier", "Landroidx/compose/ui/Modifier;", "itemBlock", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderLazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rowHeight", "getItemOffset", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getScrollOffset", "feature-futures-trade_externalDebug", "ladderSelectedPendingOrders", "potentialDragTarget", "selectedRowOffset", "initialScrollOffset", "ladderViewBottomForDrag", "", "workingPillWidth", "workingPillYOffsetWithinRow", "latestPendingOrderDraggedOverRowIndex", "scale", "zoomScale", "currentScaleIsFromTheDuxo"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LadderGestureAwareLazyColumnKt {

    /* compiled from: LadderGestureAwareLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderSide.values().length];
            try {
                iArr[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$56(FuturesLadderViewState.LadderData ladderData, LazyListState lazyListState, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14, Function1 function15, Modifier modifier, Function1 function16, int i, int i2, Composer composer, int i3) {
        LadderGestureAwareLazyColumn(ladderData, lazyListState, function1, function12, function13, function2, function14, function15, modifier, function16, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderGestureAwareLazyColumn(final FuturesLadderViewState.LadderData ladderData, LazyListState lazyListState, final Function1<? super LadderCustomGestureDetector, Unit> onPendingOrderDragDirectionChanged, final Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> onPendingOrderSelected, final Function1<? super Integer, Unit> onPendingOrderDraggedOverRowChanged, final Function2<? super Boolean, ? super Boolean, Unit> onPendingOrderDragEnded, final Function1<? super Boolean, Unit> onZoomStateChanged, final Function1<? super Integer, Unit> onZoomScaleChanged, Modifier modifier, final Function1<? super LadderLazyListScope, Unit> itemBlock, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        Object objRememberedValue3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        SnapshotState snapshotState3;
        Object obj;
        int i6;
        Object objAnimatable$default;
        Animatable animatable;
        Object objRememberedValue6;
        Animatable animatable2;
        Object objRememberedValue7;
        SnapshotIntState2 snapshotIntState2;
        int i7;
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        float fMo5016toPx0680j_43;
        Object objRememberedValue8;
        float f;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue9;
        final SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue10;
        final SnapshotFloatState2 snapshotFloatState23;
        Object objRememberedValue11;
        SnapshotIntState2 snapshotIntState22;
        Unit unit;
        int i8;
        boolean zChangedInstance;
        Object ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1;
        int i9;
        Unit unit2;
        Composer composer2;
        int i10;
        final LazyListState lazyListState2;
        int i11;
        final CoroutineScope coroutineScope2;
        SnapshotState snapshotState4;
        final Animatable animatable3;
        final Animatable animatable4;
        float f2;
        final SnapshotFloatState2 snapshotFloatState24;
        float f3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        final SnapshotState snapshotState5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue12;
        Object objRememberedValue13;
        SnapshotState4 snapshotState42;
        Object objRememberedValue14;
        SnapshotState snapshotState6;
        boolean z;
        Object objRememberedValue15;
        int i12;
        boolean z2;
        Object objRememberedValue16;
        boolean zChangedInstance2;
        Object objRememberedValue17;
        int i13;
        int i14;
        SnapshotState snapshotState7;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders;
        final Modifier modifier3;
        SnapshotFloatState2 snapshotFloatState25;
        FuturesOrderSide futuresOrderSide;
        float f4;
        BoxScopeInstance boxScopeInstance;
        Modifier.Companion companion2;
        float floatValue;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        int i16;
        int i17;
        final LazyListState lazyListState3 = lazyListState;
        Intrinsics.checkNotNullParameter(ladderData, "ladderData");
        Intrinsics.checkNotNullParameter(lazyListState3, "lazyListState");
        Intrinsics.checkNotNullParameter(onPendingOrderDragDirectionChanged, "onPendingOrderDragDirectionChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderSelected, "onPendingOrderSelected");
        Intrinsics.checkNotNullParameter(onPendingOrderDraggedOverRowChanged, "onPendingOrderDraggedOverRowChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderDragEnded, "onPendingOrderDragEnded");
        Intrinsics.checkNotNullParameter(onZoomStateChanged, "onZoomStateChanged");
        Intrinsics.checkNotNullParameter(onZoomScaleChanged, "onZoomScaleChanged");
        Intrinsics.checkNotNullParameter(itemBlock, "itemBlock");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442377664);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyListState3) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPendingOrderDragDirectionChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPendingOrderSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPendingOrderDraggedOverRowChanged) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPendingOrderDragEnded) ? 131072 : 65536;
        }
        if ((i2 & 64) == 0) {
            i17 = (1572864 & i) == 0 ? composerStartRestartGroup.changedInstance(onZoomStateChanged) ? 1048576 : 524288 : 1572864;
            if ((i2 & 128) != 0) {
                i16 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(onZoomScaleChanged) ? 8388608 : 4194304 : 12582912;
                i4 = i2 & 256;
                if (i4 != 0) {
                    i3 |= 100663296;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                }
                if ((i2 & 512) == 0) {
                    i15 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(itemBlock) ? 536870912 : 268435456 : 805306368;
                    i5 = i3;
                    if ((306783379 & i5) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1442377664, i5, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumn (LadderGestureAwareLazyColumn.kt:70)");
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        if (!Intrinsics.areEqual(LadderGestureAwareLazyColumn$lambda$1(snapshotState), ladderData.getSelectedPendingOrders())) {
                            snapshotState.setValue(ladderData.getSelectedPendingOrders());
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 != companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        snapshotState3 = (SnapshotState) objRememberedValue4;
                        if (objRememberedValue5 != companion.getEmpty()) {
                            obj = null;
                            i6 = 2;
                            objAnimatable$default = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objAnimatable$default);
                        } else {
                            obj = null;
                            i6 = 2;
                            objAnimatable$default = objRememberedValue5;
                        }
                        animatable = (Animatable) objAnimatable$default;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = Animatable2.Animatable$default(0.0f, 0.0f, i6, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        animatable2 = (Animatable) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        Modifier modifier5 = modifier4;
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1149586240);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        i7 = BentoTheme.$stable;
                        fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21596getXxlargeD9Ej5fM());
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1149589344);
                        fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1149592894);
                        float fMo5016toPx0680j_44 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1149595936);
                        fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 != companion.getEmpty()) {
                            f = 0.0f;
                            objRememberedValue8 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        } else {
                            f = 0.0f;
                        }
                        snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue8;
                        composerStartRestartGroup.endReplaceGroup();
                        float f5 = f;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = SnapshotFloatState3.mutableFloatStateOf(f5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue9;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == companion.getEmpty()) {
                            objRememberedValue10 = SnapshotFloatState3.mutableFloatStateOf(f5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue10;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = SnapshotIntState3.mutableIntStateOf(-1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        snapshotIntState22 = (SnapshotIntState2) objRememberedValue11;
                        composerStartRestartGroup.endReplaceGroup();
                        unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        i8 = i5 & 112;
                        zChangedInstance = ((i5 & 7168) != 2048) | (i8 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | ((i5 & 458752) != 131072) | ((i5 & 896) != 256) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | ((57344 & i5) != 16384) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                        Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue18 == companion.getEmpty()) {
                            i9 = i8;
                            unit2 = unit;
                            composer2 = composerStartRestartGroup;
                            i10 = i7;
                            lazyListState2 = lazyListState;
                            i11 = i5;
                            coroutineScope2 = coroutineScope;
                            snapshotState4 = snapshotState2;
                            ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 = new LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(onPendingOrderSelected, lazyListState2, coroutineScope2, snapshotState4, snapshotState, snapshotIntState2, snapshotState3, animatable, animatable2, fMo5016toPx0680j_42, onPendingOrderDragEnded, snapshotIntState22, snapshotFloatState23, snapshotFloatState22, onPendingOrderDragDirectionChanged, fMo5016toPx0680j_43, onPendingOrderDraggedOverRowChanged, snapshotFloatState2, fMo5016toPx0680j_4);
                            animatable3 = animatable;
                            animatable4 = animatable2;
                            f2 = fMo5016toPx0680j_42;
                            snapshotFloatState24 = snapshotFloatState2;
                            f3 = fMo5016toPx0680j_4;
                            snapshotState3 = snapshotState3;
                            composer2.updateRememberedValue(ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1);
                        } else {
                            i9 = i8;
                            f3 = fMo5016toPx0680j_4;
                            f2 = fMo5016toPx0680j_42;
                            i11 = i5;
                            composer2 = composerStartRestartGroup;
                            coroutineScope2 = coroutineScope;
                            snapshotState4 = snapshotState2;
                            animatable4 = animatable2;
                            i10 = i7;
                            snapshotFloatState24 = snapshotFloatState2;
                            ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 = objRememberedValue18;
                            unit2 = unit;
                            animatable3 = animatable;
                            lazyListState2 = lazyListState;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier5, unit2, (PointerInputEventHandler) ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPointerInput);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        snapshotState5 = snapshotState4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue12 = composer2.rememberedValue();
                        if (objRememberedValue12 == companion.getEmpty()) {
                            objRememberedValue12 = SnapshotFloatState3.mutableFloatStateOf(ladderData.getLadderPriceLevels().getScale());
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        final SnapshotFloatState2 snapshotFloatState26 = (SnapshotFloatState2) objRememberedValue12;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue13 = composer2.rememberedValue();
                        if (objRememberedValue13 == companion.getEmpty()) {
                            objRememberedValue13 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$35$lambda$34(snapshotFloatState26));
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        snapshotState42 = (SnapshotState4) objRememberedValue13;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue14 = composer2.rememberedValue();
                        if (objRememberedValue14 != companion.getEmpty()) {
                            objRememberedValue14 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        snapshotState6 = (SnapshotState) objRememberedValue14;
                        composer2.endReplaceGroup();
                        Integer numValueOf = Integer.valueOf(LadderGestureAwareLazyColumn$lambda$55$lambda$36(snapshotState42));
                        composer2.startReplaceGroup(-1746271574);
                        z = (i11 & 29360128) != 8388608;
                        objRememberedValue15 = composer2.rememberedValue();
                        if (!z || objRememberedValue15 == companion.getEmpty()) {
                            objRememberedValue15 = new C17553x670a1043(onZoomScaleChanged, snapshotState6, snapshotState42, null);
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composer2, 0);
                        composer2.startReplaceGroup(-125405418);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        i12 = i9;
                        z2 = i12 != 32;
                        objRememberedValue16 = composer2.rememberedValue();
                        if (!z2 || objRememberedValue16 == companion.getEmpty()) {
                            objRememberedValue16 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$42$lambda$41(lazyListState2, snapshotFloatState24, (LayoutCoordinates) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue16);
                        if (!BuildFlavors.INSTANCE.isDebugOrInternal()) {
                            composer2.startReplaceGroup(-1633490746);
                            boolean z3 = (i11 & 3670016) == 1048576;
                            Object objRememberedValue19 = composer2.rememberedValue();
                            if (z3 || objRememberedValue19 == companion.getEmpty()) {
                                objRememberedValue19 = new C17554xcce33f12(onZoomStateChanged, snapshotFloatState26);
                                composer2.updateRememberedValue(objRememberedValue19);
                            }
                            composer2.endReplaceGroup();
                            modifierOnGloballyPositioned = SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned, unit2, (PointerInputEventHandler) objRememberedValue19);
                        }
                        Modifier modifier6 = modifierOnGloballyPositioned;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance2 = ((i11 & 1879048192) != 536870912) | (i12 != 32) | composer2.changedInstance(coroutineScope2) | composer2.changedInstance(animatable3) | composer2.changedInstance(animatable4);
                        objRememberedValue17 = composer2.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue17 == companion.getEmpty()) {
                            i13 = i12;
                            final SnapshotState snapshotState8 = snapshotState3;
                            i14 = 32;
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$46$lambda$45(itemBlock, lazyListState2, coroutineScope2, snapshotState8, animatable3, animatable4, snapshotState5, (LazyListScope) obj2);
                                }
                            };
                            snapshotState7 = snapshotState5;
                            composer2.updateRememberedValue(function1);
                            objRememberedValue17 = function1;
                        } else {
                            snapshotState7 = snapshotState5;
                            i13 = i12;
                            i14 = 32;
                        }
                        composer2.endReplaceGroup();
                        final Animatable animatable5 = animatable3;
                        final Animatable animatable6 = animatable4;
                        final SnapshotState snapshotState9 = snapshotState3;
                        int i18 = i13;
                        composerStartRestartGroup = composer2;
                        int i19 = i14;
                        LazyDslKt.LazyColumn(modifier6, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue17, composerStartRestartGroup, i18, 508);
                        lazyListState3 = lazyListState;
                        selectedPendingOrders = ladderData.getSelectedPendingOrders();
                        composerStartRestartGroup.startReplaceGroup(-125359047);
                        if (selectedPendingOrders != null) {
                            FuturesOrderSide side = selectedPendingOrders.getSide();
                            Alignment topEnd = side == FuturesOrderSide.SELL ? companion3.getTopEnd() : companion3.getTopStart();
                            float fFloatValue = ((Number) animatable5.getValue()).floatValue();
                            float fAbs = Math.abs(fFloatValue);
                            float fCoerceIn = (f3 - RangesKt.coerceIn(fAbs - f3, 0.0f, f3)) / f3;
                            composerStartRestartGroup.startReplaceGroup(-125344521);
                            if (ladderData.getPendingOrderDragDirection() == null || (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumn$lambda$4(snapshotState7)) == null) {
                                snapshotFloatState25 = snapshotFloatState22;
                                futuresOrderSide = side;
                                f4 = f3;
                                boxScopeInstance = boxScopeInstance2;
                                companion2 = companion5;
                            } else {
                                StringResource label = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getLabel();
                                StringResource bottomLabel = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getBottomLabel();
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                boolean z4 = i18 == i19;
                                Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue20 == companion.getEmpty()) {
                                    objRememberedValue20 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.m2023x982041e0(lazyListState3, snapshotFloatState22, snapshotFloatState23, (LayoutCoordinates) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                companion2 = companion5;
                                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue20);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changedInstance(animatable6);
                                snapshotFloatState25 = snapshotFloatState22;
                                Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue21 == companion.getEmpty()) {
                                    objRememberedValue21 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.m2024xf8ac5139(animatable5, animatable6, (Density) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierAlpha = Alpha.alpha(OffsetKt.offset(modifierOnGloballyPositioned2, (Function1) objRememberedValue21), fCoerceIn);
                                int i20 = StringResource.$stable;
                                int i21 = (i20 << 6) | 6 | (i20 << 9);
                                futuresOrderSide = side;
                                f4 = f3;
                                PendingOrderPillKt.PendingOrderPill(boxScopeInstance2, futuresOrderSide, label, bottomLabel, modifierAlpha, null, topEnd, null, false, false, composerStartRestartGroup, i21, 464);
                                boxScopeInstance = boxScopeInstance2;
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-125305551);
                            if (fFloatValue != 0.0f) {
                                float fCoerceAtMost = RangesKt.coerceAtMost(fAbs / fMo5016toPx0680j_44, 1.0f);
                                if (fAbs < f4) {
                                    fCoerceIn = fCoerceAtMost;
                                }
                                if (fFloatValue > 0.0f) {
                                    int i22 = WhenMappings.$EnumSwitchMapping$0[futuresOrderSide.ordinal()];
                                    if (i22 == 1) {
                                        floatValue = fFloatValue - (2 * f2);
                                    } else {
                                        if (i22 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        floatValue = ((-snapshotFloatState25.getFloatValue()) + fFloatValue) - fMo5016toPx0680j_44;
                                    }
                                } else {
                                    int i23 = WhenMappings.$EnumSwitchMapping$0[futuresOrderSide.ordinal()];
                                    if (i23 == 1) {
                                        floatValue = snapshotFloatState25.getFloatValue() + fFloatValue + fMo5016toPx0680j_44;
                                    } else {
                                        if (i23 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        floatValue = (2 * f2) + fFloatValue;
                                    }
                                }
                                final int i24 = (int) floatValue;
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRASH_24);
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(boxScopeInstance.align(companion2, topEnd), 0.0f, C2002Dp.m7995constructorimpl(10), 1, null);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged = composerStartRestartGroup.changed(i24);
                                Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue22 == companion.getEmpty()) {
                                    objRememberedValue22 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.m2025x1e17a39f(i24, snapshotState9, (Density) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Composer composer3 = composerStartRestartGroup;
                                BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, Alpha.alpha(Scale2.scale(OffsetKt.offset(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue22), fCoerceAtMost), fCoerceIn), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                                composerStartRestartGroup = composer3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final LazyListState lazyListState4 = lazyListState3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$56(ladderData, lazyListState4, onPendingOrderDragDirectionChanged, onPendingOrderSelected, onPendingOrderDraggedOverRowChanged, onPendingOrderDragEnded, onZoomStateChanged, onZoomScaleChanged, modifier3, itemBlock, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i15;
                i5 = i3;
                if ((306783379 & i5) == 306783378) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (!Intrinsics.areEqual(LadderGestureAwareLazyColumn$lambda$1(snapshotState), ladderData.getSelectedPendingOrders())) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 != companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    snapshotState3 = (SnapshotState) objRememberedValue4;
                    if (objRememberedValue5 != companion.getEmpty()) {
                    }
                    animatable = (Animatable) objAnimatable$default;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                    }
                    animatable2 = (Animatable) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    Modifier modifier52 = modifier4;
                    if (objRememberedValue7 == companion.getEmpty()) {
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1149586240);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    i7 = BentoTheme.$stable;
                    fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21596getXxlargeD9Ej5fM());
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1149589344);
                    fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1149592894);
                    float fMo5016toPx0680j_442 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1149595936);
                    fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 != companion.getEmpty()) {
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    float f52 = f;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                    }
                    snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                    }
                    snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue10;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                    }
                    snapshotIntState22 = (SnapshotIntState2) objRememberedValue11;
                    composerStartRestartGroup.endReplaceGroup();
                    unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    i8 = i5 & 112;
                    zChangedInstance = ((i5 & 7168) != 2048) | (i8 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | ((i5 & 458752) != 131072) | ((i5 & 896) != 256) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | ((57344 & i5) != 16384) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                    Object objRememberedValue182 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        i9 = i8;
                        unit2 = unit;
                        composer2 = composerStartRestartGroup;
                        i10 = i7;
                        lazyListState2 = lazyListState;
                        i11 = i5;
                        coroutineScope2 = coroutineScope;
                        snapshotState4 = snapshotState2;
                        ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 = new LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(onPendingOrderSelected, lazyListState2, coroutineScope2, snapshotState4, snapshotState, snapshotIntState2, snapshotState3, animatable, animatable2, fMo5016toPx0680j_42, onPendingOrderDragEnded, snapshotIntState22, snapshotFloatState23, snapshotFloatState22, onPendingOrderDragDirectionChanged, fMo5016toPx0680j_43, onPendingOrderDraggedOverRowChanged, snapshotFloatState2, fMo5016toPx0680j_4);
                        animatable3 = animatable;
                        animatable4 = animatable2;
                        f2 = fMo5016toPx0680j_42;
                        snapshotFloatState24 = snapshotFloatState2;
                        f3 = fMo5016toPx0680j_4;
                        snapshotState3 = snapshotState3;
                        composer2.updateRememberedValue(ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1);
                        composer2.endReplaceGroup();
                        Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier52, unit2, (PointerInputEventHandler) ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1);
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierPointerInput2);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        snapshotState5 = snapshotState4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue12 = composer2.rememberedValue();
                            if (objRememberedValue12 == companion.getEmpty()) {
                            }
                            final SnapshotFloatState2 snapshotFloatState262 = (SnapshotFloatState2) objRememberedValue12;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue13 = composer2.rememberedValue();
                            if (objRememberedValue13 == companion.getEmpty()) {
                            }
                            snapshotState42 = (SnapshotState4) objRememberedValue13;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue14 = composer2.rememberedValue();
                            if (objRememberedValue14 != companion.getEmpty()) {
                            }
                            snapshotState6 = (SnapshotState) objRememberedValue14;
                            composer2.endReplaceGroup();
                            Integer numValueOf2 = Integer.valueOf(LadderGestureAwareLazyColumn$lambda$55$lambda$36(snapshotState42));
                            composer2.startReplaceGroup(-1746271574);
                            if ((i11 & 29360128) != 8388608) {
                            }
                            objRememberedValue15 = composer2.rememberedValue();
                            if (!z) {
                                objRememberedValue15 = new C17553x670a1043(onZoomScaleChanged, snapshotState6, snapshotState42, null);
                                composer2.updateRememberedValue(objRememberedValue15);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composer2, 0);
                                composer2.startReplaceGroup(-125405418);
                                Modifier.Companion companion52 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(-1633490746);
                                i12 = i9;
                                if (i12 != 32) {
                                }
                                objRememberedValue16 = composer2.rememberedValue();
                                if (!z2) {
                                    objRememberedValue16 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$42$lambda$41(lazyListState2, snapshotFloatState24, (LayoutCoordinates) obj2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue16);
                                    composer2.endReplaceGroup();
                                    Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifier3.onGloballyPositioned(companion52, (Function1) objRememberedValue16);
                                    if (!BuildFlavors.INSTANCE.isDebugOrInternal()) {
                                    }
                                    Modifier modifier62 = modifierOnGloballyPositioned3;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1224400529);
                                    zChangedInstance2 = ((i11 & 1879048192) != 536870912) | (i12 != 32) | composer2.changedInstance(coroutineScope2) | composer2.changedInstance(animatable3) | composer2.changedInstance(animatable4);
                                    objRememberedValue17 = composer2.rememberedValue();
                                    if (zChangedInstance2) {
                                        i13 = i12;
                                        final SnapshotState snapshotState82 = snapshotState3;
                                        i14 = 32;
                                        Function1 function12 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$46$lambda$45(itemBlock, lazyListState2, coroutineScope2, snapshotState82, animatable3, animatable4, snapshotState5, (LazyListScope) obj2);
                                            }
                                        };
                                        snapshotState7 = snapshotState5;
                                        composer2.updateRememberedValue(function12);
                                        objRememberedValue17 = function12;
                                        composer2.endReplaceGroup();
                                        final Animatable animatable52 = animatable3;
                                        final Animatable animatable62 = animatable4;
                                        final SnapshotState snapshotState92 = snapshotState3;
                                        int i182 = i13;
                                        composerStartRestartGroup = composer2;
                                        int i192 = i14;
                                        LazyDslKt.LazyColumn(modifier62, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue17, composerStartRestartGroup, i182, 508);
                                        lazyListState3 = lazyListState;
                                        selectedPendingOrders = ladderData.getSelectedPendingOrders();
                                        composerStartRestartGroup.startReplaceGroup(-125359047);
                                        if (selectedPendingOrders != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
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
            i3 |= i16;
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i15;
            i5 = i3;
            if ((306783379 & i5) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i3 |= i17;
        if ((i2 & 128) != 0) {
        }
        i3 |= i16;
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i15;
        i5 = i3;
        if ((306783379 & i5) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesLadderViewState.LadderData.SelectedPendingOrders LadderGestureAwareLazyColumn$lambda$1(SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesLadderViewState.LadderData.SelectedPendingOrders LadderGestureAwareLazyColumn$lambda$4(SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LadderGestureAwareLazyColumn$lambda$55$lambda$36(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderGestureAwareLazyColumn$lambda$55$lambda$38(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Integer LadderGestureAwareLazyColumn$lambda$7(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LadderGestureAwareLazyColumn$lambda$55$lambda$35$lambda$34(SnapshotFloatState2 snapshotFloatState2) {
        return (int) Math.floor(snapshotFloatState2.getFloatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderGestureAwareLazyColumn$lambda$55$lambda$39(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$55$lambda$42$lambda$41(LazyListState lazyListState, SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotFloatState2.setFloatValue(((int) (coords.mo7241getSizeYbymL2g() & 4294967295L)) - rowHeight(lazyListState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$55$lambda$46$lambda$45(Function1 function1, final LazyListState lazyListState, final CoroutineScope coroutineScope, final SnapshotState snapshotState, final Animatable animatable, final Animatable animatable2, final SnapshotState snapshotState2, final LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        function1.invoke(new LadderLazyListScope(LazyColumn) { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$4$1$customScope$1
            @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderGestureParent
            public void updatePotentialDragTarget(FuturesLadderViewState.LadderData.SelectedPendingOrders target) {
                Intrinsics.checkNotNullParameter(target, "target");
                int itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, target.getRowIndex());
                snapshotState.setValue(Integer.valueOf(itemOffset));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17556x1ebe9015(animatable, animatable2, itemOffset, null), 3, null);
                snapshotState2.setValue(target);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$55$lambda$54$lambda$51$lambda$48$lambda$47 */
    public static final Unit m2023x982041e0(LazyListState lazyListState, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotFloatState2.setFloatValue((int) (coords.mo7241getSizeYbymL2g() >> 32));
        snapshotFloatState22.setFloatValue((rowHeight(lazyListState) - ((int) (coords.mo7241getSizeYbymL2g() & 4294967295L))) / 2.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$55$lambda$54$lambda$51$lambda$50$lambda$49 */
    public static final IntOffset m2024xf8ac5139(Animatable animatable, Animatable animatable2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(((Number) animatable2.getValue()).floatValue()) & 4294967295L) | (MathKt.roundToInt(((Number) animatable.getValue()).floatValue()) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$55$lambda$54$lambda$53$lambda$52 */
    public static final IntOffset m2025x1e17a39f(int i, SnapshotState snapshotState, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((LadderGestureAwareLazyColumn$lambda$7(snapshotState) != null ? r5.intValue() : 0) & 4294967295L) | (i << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowHeight(LazyListState lazyListState) {
        if (lazyListState.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        return lazyListState.getLayoutInfo().getVisibleItemsInfo().get(0).getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getItemOffset(LazyListState lazyListState, int i) {
        return ((i - lazyListState.getFirstVisibleItemIndex()) * rowHeight(lazyListState)) - lazyListState.getFirstVisibleItemScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getScrollOffset(LazyListState lazyListState) {
        return (lazyListState.getFirstVisibleItemIndex() * rowHeight(lazyListState)) - lazyListState.getFirstVisibleItemScrollOffset();
    }
}
