package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a¾\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\f\u0010\u001e\u001a\u00020\u0007*\u00020\u001fH\u0002\u001a\f\u0010 \u001a\u00020\u0007*\u00020\u001fH\u0002\u001a\f\u0010!\u001a\u00020\u0007*\u00020\u001fH\u0002\u001a#\u0010\"\u001a\u00020\u0007*\u00020\u001f2\u0006\u0010#\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010$\u001a+\u0010%\u001a\u00020\u0007*\u00020\u00032\u0006\u0010#\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0002\u0010'\u001a+\u0010(\u001a\u00020\u0007*\u00020\u00032\u0006\u0010)\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0002\u0010'\u001a#\u0010*\u001a\u00020\u0007*\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0002\u0010+\u001a#\u0010,\u001a\u00020\u0007*\u00020\u001f2\u0006\u0010#\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010$\u001aG\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0002\u00103\u001a\u0018\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002¨\u00067²\u0006\f\u00108\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\fX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {"OptionChainGestureAwareLazyColumn", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "cellWidth", "Landroidx/compose/ui/unit/Dp;", "sharedScrollValue", "", "callPosition", "Landroidx/compose/ui/geometry/Offset;", "putPosition", "quoteIndex", "", "disclosureIndex", "dragTargetFromViewState", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "onDraggedIndexChanged", "Lkotlin/Function1;", "onDragStart", "onDragEnd", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lcom/robinhood/android/optionschain/sbschain/table/OptionChainLazyListScope;", "Lkotlin/ExtensionFunctionType;", "OptionChainGestureAwareLazyColumn-BuJpD7Q", "(Landroidx/compose/foundation/lazy/LazyListState;FFJJLjava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "normalRowHeight", "Landroidx/compose/ui/unit/Density;", "quoteRowHeight", "normalRowAndQuoteRowHeightOffset", "getQuoteOffsetIgnoreQuoteVisibility", "itemIndex", "(Landroidx/compose/ui/unit/Density;ILjava/lang/Integer;)F", "getQuoteOffsetIfQuoteIsVisible", "density", "(Landroidx/compose/foundation/lazy/LazyListState;ILjava/lang/Integer;Landroidx/compose/ui/unit/Density;)F", "getItemOffset", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getScrollOffset", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Integer;Landroidx/compose/ui/unit/Density;)F", "getAbsoluteGlobalOffset", "calculateCurrentIndex", "absoluteOffset", "gestureVisibleQuoteIndex", "latestDraggedOverRowIndex", "isSingleLegDrag", "snapThresholdPx", "(FLandroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/unit/Density;Ljava/lang/Integer;IZF)I", "getAutoScrollSpeedFactor", "offsetPastBoundary", "maxOffset", "feature-options-chain_externalDebug", "potentialDragTarget", "initialScrollOffset", "tableViewBottomForDrag", "draggedItemY", "yOffsetFromDragStartRow"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainGestureAwareLazyColumn {

    /* compiled from: OptionChainGestureAwareLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$30 */
    public static final Unit m2332x43e0fe50(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$31 */
    public static final Unit m2333x43e0fe51(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$32 */
    public static final Unit m2334x43e0fe52(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$36 */
    public static final Unit m2336x43e0fe56(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$37 */
    public static final Unit m2337x43e0fe57(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$38 */
    public static final Unit m2338x43e0fe58(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$52(LazyListState lazyListState, float f, float f2, long j, long j2, Integer num, Integer num2, DragTarget dragTarget, SpreadSelectionState spreadSelectionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47 */
    public static final IntOffset m2341x94fad3f1(int i, int i2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((i2 & 4294967295L) | (i << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: OptionChainGestureAwareLazyColumn-BuJpD7Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17242OptionChainGestureAwareLazyColumnBuJpD7Q(final LazyListState lazyListState, final float f, final float f2, final long j, final long j2, final Integer num, final Integer num2, final DragTarget dragTarget, final SpreadSelectionState spreadSelectionState, final Function1<? super Integer, Unit> onDraggedIndexChanged, final Function1<? super DragTarget, Unit> onDragStart, final Function1<? super Boolean, Unit> onDragEnd, Modifier modifier, final Function1<? super OptionChainGestureAwareLazyColumn7, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue8;
        float f3;
        Object objMutableStateOf$default;
        boolean zChanged;
        float f4;
        Modifier modifier3;
        Composer composer2;
        Animatable animatable;
        CoroutineScope coroutineScope;
        float f5;
        Density density;
        int i10;
        Unit unit;
        Animatable animatable2;
        float f6;
        boolean zChanged2;
        Object objRememberedValue9;
        int i11;
        Unit unit2;
        char c;
        int i12;
        final Density density2;
        SnapshotIntState2 snapshotIntState2;
        Animatable animatable3;
        final SnapshotFloatState2 snapshotFloatState22;
        Composer composer3;
        final SnapshotState snapshotState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged3;
        Object objRememberedValue10;
        boolean z;
        Object objRememberedValue11;
        final DragTarget dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1;
        final Modifier modifier4;
        final PrimitiveRanges2 rowIndexRange;
        float fIntBitsToFloat;
        final float f7;
        Composer composer4;
        Composer composer5;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onDraggedIndexChanged, "onDraggedIndexChanged");
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragEnd, "onDragEnd");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(792184131);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changed(lazyListState) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i13 = i4;
        if ((i3 & 4) != 0) {
            i13 |= 384;
        } else if ((i & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i13 |= 3072;
        } else if ((i & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i13 |= 24576;
        } else if ((i & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i13 |= 196608;
        } else if ((i & 196608) == 0) {
            i13 |= composerStartRestartGroup.changed(num) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i13 |= composerStartRestartGroup.changed(num2) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i13 |= 12582912;
        } else {
            if ((i & 12582912) == 0) {
                i13 |= composerStartRestartGroup.changedInstance(dragTarget) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i13 |= 100663296;
            } else {
                if ((i & 100663296) == 0) {
                    i13 |= composerStartRestartGroup.changedInstance(spreadSelectionState) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i13 |= composerStartRestartGroup.changedInstance(onDraggedIndexChanged) ? 536870912 : 268435456;
                }
                i5 = i13;
                if ((i3 & 1024) != 0) {
                    i6 = i2;
                    i7 = i6 | 6;
                } else {
                    i6 = i2;
                    i7 = (i6 & 6) == 0 ? i6 | (composerStartRestartGroup.changedInstance(onDragStart) ? 4 : 2) : i6;
                }
                if ((i3 & 2048) != 0) {
                    i7 |= 48;
                } else if ((i6 & 48) == 0) {
                    i7 |= composerStartRestartGroup.changedInstance(onDragEnd) ? 32 : 16;
                }
                int i14 = i7;
                i8 = i3 & 4096;
                if (i8 != 0) {
                    i14 |= 384;
                    i9 = i8;
                } else {
                    i9 = i8;
                    if ((i6 & 384) == 0) {
                        i14 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                    }
                    if ((i3 & 8192) != 0) {
                        if ((i6 & 3072) == 0) {
                            i14 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
                        }
                        if ((i5 & 306783379) == 306783378 && (i14 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            f7 = f;
                            modifier5 = modifier;
                            composer5 = composerStartRestartGroup;
                        } else {
                            Modifier modifier6 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                modifier2 = modifier6;
                            } else {
                                modifier2 = modifier6;
                                ComposerKt.traceEventStart(792184131, i5, i14, "com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumn (OptionChainGestureAwareLazyColumn.kt:62)");
                            }
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            int i15 = i14;
                            if (objRememberedValue2 != companion.getEmpty()) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 != companion.getEmpty()) {
                                snapshotState = snapshotState3;
                                Animatable animatableAnimatable$default = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                                objRememberedValue3 = animatableAnimatable$default;
                            } else {
                                snapshotState = snapshotState3;
                            }
                            Animatable animatable4 = (Animatable) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            SnapshotFloatState2 snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            SnapshotFloatState2 snapshotFloatState24 = (SnapshotFloatState2) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = SnapshotIntState3.mutableIntStateOf(-1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 != companion.getEmpty()) {
                                snapshotFloatState2 = snapshotFloatState24;
                                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                objRememberedValue7 = snapshotStateMutableStateOf$default;
                            } else {
                                snapshotFloatState2 = snapshotFloatState24;
                            }
                            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            if (num != null) {
                                snapshotState4.setValue(num);
                            }
                            float fMo5016toPx0680j_4 = density3.mo5016toPx0680j_4(TableConstants.getDragSnapThreshold());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 != companion.getEmpty()) {
                                f3 = fMo5016toPx0680j_4;
                                objMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                            } else {
                                f3 = fMo5016toPx0680j_4;
                                objMutableStateOf$default = objRememberedValue8;
                            }
                            SnapshotState snapshotState5 = (SnapshotState) objMutableStateOf$default;
                            composerStartRestartGroup.endReplaceGroup();
                            float fMo5016toPx0680j_42 = density3.mo5016toPx0680j_4(TableConstants.getAutoScrollMaxSpeed());
                            float fMo5016toPx0680j_43 = density3.mo5016toPx0680j_4(TableConstants.getAutoScrollSmoothBuffer());
                            float fMo5016toPx0680j_44 = density3.mo5016toPx0680j_4(TableConstants.getAutoScrollThreshold());
                            Boolean boolValueOf = Boolean.valueOf(OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState) != null);
                            Float fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18 = OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18(snapshotState5);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            int i16 = i5 & 14;
                            zChanged = composerStartRestartGroup.changed(fMo5016toPx0680j_44) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | (i16 != 4) | composerStartRestartGroup.changed(fMo5016toPx0680j_42);
                            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                f4 = fMo5016toPx0680j_42;
                                if (objRememberedValue12 != companion.getEmpty()) {
                                    modifier3 = modifier2;
                                    composer2 = composerStartRestartGroup;
                                    animatable = animatable4;
                                    coroutineScope = coroutineScope2;
                                    f5 = f3;
                                    density = density3;
                                    i10 = 4;
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18, (Function2) objRememberedValue12, composer2, 0);
                                unit = Unit.INSTANCE;
                                composer2.startReplaceGroup(-1224400529);
                                animatable2 = animatable;
                                boolean zChanged4 = (i16 == i10) | composer2.changed(density) | ((i15 & 14) == i10) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(animatable2);
                                f6 = f5;
                                zChanged2 = zChanged4 | ((i15 & 112) == 32) | composer2.changed(f6) | ((i5 & 1879048192) == 536870912);
                                objRememberedValue9 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                                    i11 = currentMarker;
                                    unit2 = unit;
                                    c = ' ';
                                    Composer composer6 = composer2;
                                    Density density4 = density;
                                    i12 = i15;
                                    SnapshotState snapshotState6 = snapshotState;
                                    SnapshotFloatState2 snapshotFloatState25 = snapshotFloatState2;
                                    OptionChainGestureAwareLazyColumn3 optionChainGestureAwareLazyColumn3 = new OptionChainGestureAwareLazyColumn3(lazyListState, density4, onDragStart, coroutineScope, snapshotState6, snapshotState4, snapshotFloatState23, snapshotIntState22, animatable2, onDragEnd, 0.0f, f6, onDraggedIndexChanged, snapshotFloatState25, snapshotState5);
                                    density2 = density4;
                                    snapshotIntState2 = snapshotIntState22;
                                    animatable3 = animatable2;
                                    snapshotFloatState22 = snapshotFloatState25;
                                    composer3 = composer6;
                                    snapshotState2 = snapshotState6;
                                    composer3.updateRememberedValue(optionChainGestureAwareLazyColumn3);
                                    objRememberedValue9 = optionChainGestureAwareLazyColumn3;
                                } else {
                                    i11 = currentMarker;
                                    unit2 = unit;
                                    c = ' ';
                                    animatable3 = animatable2;
                                    composer3 = composer2;
                                    density2 = density;
                                    i12 = i15;
                                    snapshotState2 = snapshotState;
                                    snapshotIntState2 = snapshotIntState22;
                                    snapshotFloatState22 = snapshotFloatState2;
                                }
                                composer3.endReplaceGroup();
                                final Modifier modifier7 = modifier3;
                                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier7, unit2, (PointerInputEventHandler) objRememberedValue9);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPointerInput);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.useNode();
                                } else {
                                    composer3.createNode(constructor);
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(-1799166257);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer3.startReplaceGroup(-1633490746);
                                zChanged3 = composer3.changed(density2);
                                objRememberedValue10 = composer3.rememberedValue();
                                if (!zChanged3 || objRememberedValue10 == companion.getEmpty()) {
                                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionChainGestureAwareLazyColumn.m2330x3f0cf161(density2, snapshotFloatState22, (LayoutCoordinates) obj);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue10);
                                composer3.startReplaceGroup(-1633490746);
                                z = (i12 & 7168) != 2048;
                                objRememberedValue11 = composer3.rememberedValue();
                                if (!z || objRememberedValue11 == companion.getEmpty()) {
                                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionChainGestureAwareLazyColumn.m2331x68d656e5(content, snapshotState2, (LazyListScope) obj);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceGroup();
                                Composer composer7 = composer3;
                                LazyDslKt.LazyColumn(modifierOnGloballyPositioned, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue11, composer7, (i5 << 3) & 112, 508);
                                dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 = OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState2);
                                composer7.startReplaceGroup(1327455292);
                                if (dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 != null) {
                                    f7 = f;
                                    modifier4 = modifier7;
                                    composer4 = composer7;
                                } else {
                                    if (snapshotIntState2.getIntValue() < 0) {
                                        composer7.endToMarker(i11);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer7.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return OptionChainGestureAwareLazyColumn.m2332x43e0fe50(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier7, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    modifier4 = modifier7;
                                    int i17 = i11;
                                    if (dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 instanceof DragTarget.OptionLegDragTarget) {
                                        composer7.startReplaceGroup(-640110988);
                                        if (dragTarget == null) {
                                            composer7.endToMarker(i17);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer7.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup3 != null) {
                                                scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return OptionChainGestureAwareLazyColumn.m2333x43e0fe51(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) CollectionsKt.singleOrNull((List) dragTarget.getLegBundlesWithRowIndex());
                                        if (optionLegBundleWithRowIndex == null) {
                                            composer7.endToMarker(i17);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composer7.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup4 != null) {
                                                scopeUpdateScopeEndRestartGroup4.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return OptionChainGestureAwareLazyColumn.m2334x43e0fe52(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        f7 = f;
                                        Float fValueOf = num2 != null ? Float.valueOf(getItemOffset(lazyListState, num2.intValue(), num, density2) - normalRowHeight(density2)) : null;
                                        final float fCoerceAtMost = fValueOf != null ? RangesKt.coerceAtMost(((Number) animatable3.getValue()).floatValue(), fValueOf.floatValue()) : ((Number) animatable3.getValue()).floatValue();
                                        TableCellState.BidAsk bidAsk = new TableCellState.BidAsk(optionLegBundleWithRowIndex.getLegBundle().getOptionConfigurationBundle().getOptionSide() == OrderSide.SELL, true, null, null, null, false, false, null, optionLegBundleWithRowIndex.getContent(), 68, null);
                                        Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion4, f7, TableConstants.getCellHeightDp());
                                        composer7.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer7.changedInstance(dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1) | composer7.changed(fCoerceAtMost);
                                        Object objRememberedValue13 = composer7.rememberedValue();
                                        if (zChangedInstance || objRememberedValue13 == companion.getEmpty()) {
                                            objRememberedValue13 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainGestureAwareLazyColumn.m2335xbb9f90cf(dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1, fCoerceAtMost, (Density) obj);
                                                }
                                            };
                                            composer7.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer7.endReplaceGroup();
                                        composer4 = composer7;
                                        TableCell3.TableBidAskCell(bidAsk, -1, OffsetKt.offset(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue13), null, Float.valueOf(0.5f), null, false, null, null, null, null, null, composer4, 24624, 0, 4072);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (!(dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 instanceof DragTarget.OptionSpreadDragTarget)) {
                                            composer7.startReplaceGroup(-436286042);
                                            composer7.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer7.startReplaceGroup(-637926604);
                                        if (dragTarget == null) {
                                            composer7.endToMarker(i17);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composer7.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup5 != null) {
                                                scopeUpdateScopeEndRestartGroup5.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return OptionChainGestureAwareLazyColumn.m2336x43e0fe56(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex2 = (OptionLegBundleWithRowIndex) CollectionsKt.firstOrNull((List) dragTarget.getLegBundlesWithRowIndex());
                                        if (optionLegBundleWithRowIndex2 == null) {
                                            composer7.endToMarker(i17);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup6 = composer7.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup6 != null) {
                                                scopeUpdateScopeEndRestartGroup6.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return OptionChainGestureAwareLazyColumn.m2337x43e0fe57(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        final Integer num3 = num;
                                        OptionContractType optionContractType = optionLegBundleWithRowIndex2.getLegBundle().getOptionConfigurationBundle().getOptionContractType();
                                        if (spreadSelectionState == null || (rowIndexRange = spreadSelectionState.getRowIndexRange(optionContractType)) == null) {
                                            composer7.endToMarker(i17);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup7 = composer7.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup7 != null) {
                                                scopeUpdateScopeEndRestartGroup7.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return OptionChainGestureAwareLazyColumn.m2338x43e0fe58(lazyListState, f, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        int dragStartRowIndex = dragTarget.getDragStartRowIndex();
                                        int first = rowIndexRange.getFirst();
                                        composer7.startReplaceGroup(-1746271574);
                                        boolean zChanged5 = composer7.changed(dragStartRowIndex) | composer7.changed(first) | ((i5 & 458752) == 131072);
                                        Object objRememberedValue14 = composer7.rememberedValue();
                                        if (zChanged5 || objRememberedValue14 == companion.getEmpty()) {
                                            objRememberedValue14 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda11
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return OptionChainGestureAwareLazyColumn.m2339xdad9b86e(dragTarget, rowIndexRange, num3);
                                                }
                                            });
                                            composer7.updateRememberedValue(objRememberedValue14);
                                        }
                                        SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue14;
                                        composer7.endReplaceGroup();
                                        boolean z2 = num3 != null && rowIndexRange.contains(num3.intValue());
                                        float quoteOffsetIgnoreQuoteVisibility = z2 ? getQuoteOffsetIgnoreQuoteVisibility(density2, dragTarget.getDragStartRowIndex(), num3) : 0.0f;
                                        int i18 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
                                        if (i18 == 1) {
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> c));
                                        } else {
                                            if (i18 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> c));
                                        }
                                        float fFloatValue = (((Number) animatable3.getValue()).floatValue() + quoteOffsetIgnoreQuoteVisibility) - density2.mo5016toPx0680j_4(m2340x43e0fe70(snapshotState42));
                                        float fCalculateOverlayHeightPx = TableSpreadOverlay.calculateOverlayHeightPx(rowIndexRange, num3, composer7, (i5 >> 12) & 112);
                                        Float fValueOf2 = num2 != null ? Float.valueOf(getItemOffset(lazyListState, num2.intValue(), num3, density2) - fCalculateOverlayHeightPx) : null;
                                        float fCoerceAtMost2 = fValueOf2 != null ? RangesKt.coerceAtMost(fFloatValue, fValueOf2.floatValue()) : fFloatValue;
                                        float scrollOffset = getScrollOffset(lazyListState, num3, density2);
                                        float f8 = 0.0f;
                                        if (fFloatValue + scrollOffset < 0.0f) {
                                            fCoerceAtMost2 = RangesKt.coerceAtLeast(fCoerceAtMost2, -scrollOffset);
                                        }
                                        Modifier modifierClipToBounds = Clip.clipToBounds(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null));
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer7, modifierClipToBounds);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor2);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer7);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        float f9 = fIntBitsToFloat;
                                        TableSpreadOverlay.m17297TableSpreadOverlayOnDragPBTpf3Q(f, f2, fCoerceAtMost2, fCalculateOverlayHeightPx, OffsetKt.m5125offsetVpY3zN4$default(companion4, density2.mo5012toDpu2uoSUM(fIntBitsToFloat), 0.0f, 2, null), composer7, (i5 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                        float f10 = fCoerceAtMost2;
                                        f7 = f;
                                        composer4 = composer7;
                                        composer4.startReplaceGroup(2123944342);
                                        for (OptionLegBundleWithRowIndex optionLegBundleWithRowIndex3 : spreadSelectionState.getLegsWithRowIndex(optionContractType)) {
                                            OptionLegBundle legBundle = optionLegBundleWithRowIndex3.getLegBundle();
                                            int rowIndex = optionLegBundleWithRowIndex3.getRowIndex();
                                            Lazy<String> lazyComponent4 = optionLegBundleWithRowIndex3.component4();
                                            boolean z3 = legBundle.getOptionConfigurationBundle().getOptionSide() == OrderSide.SELL;
                                            final int iMo5016toPx0680j_4 = (int) ((f9 - f2) + (z3 ? f8 : density2.mo5016toPx0680j_4(f7)));
                                            final int iMo5016toPx0680j_42 = (int) ((density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(TableConstants.getCellHeightDp() * (rowIndex - rowIndexRange.getFirst()))) + f10) - (z2 ? getQuoteOffsetIgnoreQuoteVisibility(density2, rowIndex, num3) : f8));
                                            TableCellState.BidAsk bidAsk2 = new TableCellState.BidAsk(z3, true, null, null, null, false, false, null, lazyComponent4, 68, null);
                                            Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, f7, TableConstants.getCellHeightDp());
                                            composer4.startReplaceGroup(-1633490746);
                                            boolean zChanged6 = composer4.changed(iMo5016toPx0680j_4) | composer4.changed(iMo5016toPx0680j_42);
                                            Object objRememberedValue15 = composer4.rememberedValue();
                                            if (zChanged6 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue15 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return OptionChainGestureAwareLazyColumn.m2341x94fad3f1(iMo5016toPx0680j_4, iMo5016toPx0680j_42, (Density) obj);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue15);
                                            }
                                            composer4.endReplaceGroup();
                                            TableCell3.TableBidAskCell(bidAsk2, -1, OffsetKt.offset(modifierM5171sizeVpY3zN42, (Function1) objRememberedValue15), null, Float.valueOf(0.5f), null, false, null, null, null, null, null, composer4, 24624, 0, 4072);
                                            num3 = num;
                                            density2 = density2;
                                            f8 = f8;
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        composer4.endReplaceGroup();
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer5 = composer4;
                                modifier5 = modifier4;
                            } else {
                                f4 = fMo5016toPx0680j_42;
                            }
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            animatable = animatable4;
                            coroutineScope = coroutineScope2;
                            f5 = f3;
                            density = density3;
                            i10 = 4;
                            objRememberedValue12 = new OptionChainGestureAwareLazyColumn2(fMo5016toPx0680j_44, fMo5016toPx0680j_43, lazyListState, f4, snapshotState5, snapshotState, snapshotFloatState2, null);
                            composer2.updateRememberedValue(objRememberedValue12);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18, (Function2) objRememberedValue12, composer2, 0);
                            unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(-1224400529);
                            animatable2 = animatable;
                            boolean zChanged42 = (i16 == i10) | composer2.changed(density) | ((i15 & 14) == i10) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(animatable2);
                            f6 = f5;
                            zChanged2 = zChanged42 | ((i15 & 112) == 32) | composer2.changed(f6) | ((i5 & 1879048192) == 536870912);
                            objRememberedValue9 = composer2.rememberedValue();
                            if (zChanged2) {
                                i11 = currentMarker;
                                unit2 = unit;
                                c = ' ';
                                Composer composer62 = composer2;
                                Density density42 = density;
                                i12 = i15;
                                SnapshotState snapshotState62 = snapshotState;
                                SnapshotFloatState2 snapshotFloatState252 = snapshotFloatState2;
                                OptionChainGestureAwareLazyColumn3 optionChainGestureAwareLazyColumn32 = new OptionChainGestureAwareLazyColumn3(lazyListState, density42, onDragStart, coroutineScope, snapshotState62, snapshotState4, snapshotFloatState23, snapshotIntState22, animatable2, onDragEnd, 0.0f, f6, onDraggedIndexChanged, snapshotFloatState252, snapshotState5);
                                density2 = density42;
                                snapshotIntState2 = snapshotIntState22;
                                animatable3 = animatable2;
                                snapshotFloatState22 = snapshotFloatState252;
                                composer3 = composer62;
                                snapshotState2 = snapshotState62;
                                composer3.updateRememberedValue(optionChainGestureAwareLazyColumn32);
                                objRememberedValue9 = optionChainGestureAwareLazyColumn32;
                                composer3.endReplaceGroup();
                                final Modifier modifier72 = modifier3;
                                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier72, unit2, (PointerInputEventHandler) objRememberedValue9);
                                Alignment.Companion companion22 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierPointerInput2);
                                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                if (composer3.getApplier() == null) {
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(-1799166257);
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    composer3.startReplaceGroup(-1633490746);
                                    zChanged3 = composer3.changed(density2);
                                    objRememberedValue10 = composer3.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue10 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionChainGestureAwareLazyColumn.m2330x3f0cf161(density2, snapshotFloatState22, (LayoutCoordinates) obj);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue10);
                                        composer3.endReplaceGroup();
                                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(companion42, (Function1) objRememberedValue10);
                                        composer3.startReplaceGroup(-1633490746);
                                        if ((i12 & 7168) != 2048) {
                                        }
                                        objRememberedValue11 = composer3.rememberedValue();
                                        if (!z) {
                                            objRememberedValue11 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainGestureAwareLazyColumn.m2331x68d656e5(content, snapshotState2, (LazyListScope) obj);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue11);
                                            composer3.endReplaceGroup();
                                            Composer composer72 = composer3;
                                            LazyDslKt.LazyColumn(modifierOnGloballyPositioned2, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue11, composer72, (i5 << 3) & 112, 508);
                                            dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 = OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState2);
                                            composer72.startReplaceGroup(1327455292);
                                            if (dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 != null) {
                                            }
                                            composer4.endReplaceGroup();
                                            composer4.endReplaceGroup();
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer5 = composer4;
                                            modifier5 = modifier4;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$52(lazyListState, f7, f2, j, j2, num, num2, dragTarget, spreadSelectionState, onDraggedIndexChanged, onDragStart, onDragEnd, modifier5, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 |= 3072;
                    if ((i5 & 306783379) == 306783378) {
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Density density32 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        CoroutineScope coroutineScope22 = (CoroutineScope) objRememberedValue;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        int i152 = i14;
                        if (objRememberedValue2 != companion.getEmpty()) {
                        }
                        SnapshotState snapshotState32 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                        }
                        Animatable animatable42 = (Animatable) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        SnapshotFloatState2 snapshotFloatState232 = (SnapshotFloatState2) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        SnapshotFloatState2 snapshotFloatState242 = (SnapshotFloatState2) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 != companion.getEmpty()) {
                        }
                        SnapshotState snapshotState43 = (SnapshotState) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        if (num != null) {
                        }
                        float fMo5016toPx0680j_45 = density32.mo5016toPx0680j_4(TableConstants.getDragSnapThreshold());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 != companion.getEmpty()) {
                        }
                        SnapshotState snapshotState52 = (SnapshotState) objMutableStateOf$default;
                        composerStartRestartGroup.endReplaceGroup();
                        float fMo5016toPx0680j_422 = density32.mo5016toPx0680j_4(TableConstants.getAutoScrollMaxSpeed());
                        float fMo5016toPx0680j_432 = density32.mo5016toPx0680j_4(TableConstants.getAutoScrollSmoothBuffer());
                        float fMo5016toPx0680j_442 = density32.mo5016toPx0680j_4(TableConstants.getAutoScrollThreshold());
                        Boolean boolValueOf2 = Boolean.valueOf(OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState) != null);
                        Float fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$182 = OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18(snapshotState52);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i162 = i5 & 14;
                        zChanged = composerStartRestartGroup.changed(fMo5016toPx0680j_442) | composerStartRestartGroup.changed(fMo5016toPx0680j_432) | (i162 != 4) | composerStartRestartGroup.changed(fMo5016toPx0680j_422);
                        Object objRememberedValue122 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        animatable = animatable42;
                        coroutineScope = coroutineScope22;
                        f5 = f3;
                        density = density32;
                        i10 = 4;
                        objRememberedValue122 = new OptionChainGestureAwareLazyColumn2(fMo5016toPx0680j_442, fMo5016toPx0680j_432, lazyListState, f4, snapshotState52, snapshotState, snapshotFloatState2, null);
                        composer2.updateRememberedValue(objRememberedValue122);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, fOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$182, (Function2) objRememberedValue122, composer2, 0);
                        unit = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1224400529);
                        animatable2 = animatable;
                        boolean zChanged422 = (i162 == i10) | composer2.changed(density) | ((i152 & 14) == i10) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(animatable2);
                        f6 = f5;
                        zChanged2 = zChanged422 | ((i152 & 112) == 32) | composer2.changed(f6) | ((i5 & 1879048192) == 536870912);
                        objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged2) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 8192) != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 512) != 0) {
            }
            i5 = i13;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i142 = i7;
            i8 = i3 & 4096;
            if (i8 != 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i5 = i13;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i1422 = i7;
        i8 = i3 & 4096;
        if (i8 != 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DragTarget OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(SnapshotState<DragTarget> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$18(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue();
    }

    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$41 */
    private static final float m2340x43e0fe70(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$27$lambda$26 */
    public static final Unit m2330x3f0cf161(Density density, SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotFloatState2.setFloatValue(((int) (coords.mo7241getSizeYbymL2g() & 4294967295L)) - density.mo5016toPx0680j_4(TableConstants.getAutoScrollBottomThreshold()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$29$lambda$28 */
    public static final Unit m2331x68d656e5(Function1 function1, final SnapshotState snapshotState, final LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        function1.invoke(new OptionChainGestureAwareLazyColumn7(LazyColumn) { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$3$2$1$listScope$1
            @Override // com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumn7
            public void updatePotentialDragTarget(DragTarget dragTarget) {
                snapshotState.setValue(dragTarget);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$35$lambda$34 */
    public static final IntOffset m2335xbb9f90cf(DragTarget dragTarget, float f, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(f) & 4294967295L) | (((DragTarget.OptionLegDragTarget) dragTarget).getXOffset() << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* renamed from: OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$51$lambda$50$lambda$40$lambda$39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2002Dp m2339xdad9b86e(DragTarget dragTarget, PrimitiveRanges2 primitiveRanges2, Integer num) {
        float fM7995constructorimpl;
        if (dragTarget.getDragStartRowIndex() < primitiveRanges2.getFirst()) {
            int dragStartRowIndex = dragTarget.getDragStartRowIndex();
            if (num != null && num.intValue() == dragStartRowIndex) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(-TableConstants.getQuoteRowHeightDp());
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(TableConstants.getCellHeightDp() * (dragTarget.getDragStartRowIndex() - primitiveRanges2.getFirst()));
            }
        }
        return C2002Dp.m7993boximpl(fM7995constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float normalRowHeight(Density density) {
        density.getDensity();
        return density.mo5016toPx0680j_4(TableConstants.getCellHeightDp());
    }

    private static final float quoteRowHeight(Density density) {
        density.getDensity();
        return density.mo5016toPx0680j_4(TableConstants.getQuoteRowHeightDp());
    }

    private static final float normalRowAndQuoteRowHeightOffset(Density density) {
        density.getDensity();
        return density.mo5016toPx0680j_4(TableConstants.getCellAndQuoteRowHeightOffset());
    }

    private static final float getQuoteOffsetIgnoreQuoteVisibility(Density density, int i, Integer num) {
        if (num == null || i <= num.intValue()) {
            return 0.0f;
        }
        return normalRowAndQuoteRowHeightOffset(density);
    }

    private static final float getQuoteOffsetIfQuoteIsVisible(LazyListState lazyListState, int i, Integer num, Density density) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            int index = lazyListItemInfo.getIndex();
            if (num != null && i > num.intValue() && new PrimitiveRanges2(lazyListState.getFirstVisibleItemIndex(), index).contains(num.intValue())) {
                return normalRowAndQuoteRowHeightOffset(density);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getItemOffset(LazyListState lazyListState, int i, Integer num, Density density) {
        return (((i - lazyListState.getFirstVisibleItemIndex()) * normalRowHeight(density)) - lazyListState.getFirstVisibleItemScrollOffset()) - getQuoteOffsetIfQuoteIsVisible(lazyListState, i, num, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getScrollOffset(LazyListState lazyListState, Integer num, Density density) {
        return getAbsoluteGlobalOffset(density, lazyListState.getFirstVisibleItemIndex(), num) + lazyListState.getFirstVisibleItemScrollOffset();
    }

    private static final float getAbsoluteGlobalOffset(Density density, int i, Integer num) {
        if (num == null || i <= num.intValue()) {
            return i * normalRowHeight(density);
        }
        return ((i - 1) * normalRowHeight(density)) + quoteRowHeight(density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int calculateCurrentIndex(float f, LazyListState lazyListState, Density density, Integer num, int i, boolean z, float f2) {
        int i2;
        int i3;
        float fNormalRowHeight = normalRowHeight(density);
        if (z) {
            i2 = (num != null && num.intValue() == i + (-1)) ? i - 2 : i - 1;
        }
        float itemOffset = getItemOffset(lazyListState, i2, num, density) + lazyListState.getFirstVisibleItemScrollOffset();
        if (z) {
            i3 = (num != null && num.intValue() == i + 1) ? i + 2 : i + 1;
        }
        float itemOffset2 = getItemOffset(lazyListState, i3, num, density) + lazyListState.getFirstVisibleItemScrollOffset();
        if (i < 0) {
            return lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt(f / fNormalRowHeight);
        }
        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + ((int) (f / fNormalRowHeight));
        return itemOffset2 - f < f2 ? firstVisibleItemIndex + 1 : f - itemOffset < f2 ? firstVisibleItemIndex : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getAutoScrollSpeedFactor(float f, float f2) {
        return RangesKt.coerceIn(f, 0.0f, f2) / f2;
    }
}
