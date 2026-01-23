package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import android.view.View;
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
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill.PendingOrderPillKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\u001a\u009a\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102:\u0010\u0015\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010 \u001a\f\u0010!\u001a\u00020\u000e*\u00020\u0007H\u0002\u001a\u0014\u0010\"\u001a\u00020\u000e*\u00020\u00072\u0006\u0010#\u001a\u00020\u000eH\u0002\u001a\f\u0010$\u001a\u00020\u000e*\u00020\u0007H\u0002¨\u0006%²\u0006\f\u0010&\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u00102\u001a\u0004\u0018\u000103X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"LadderGestureAwareLazyColumn", "", "ladderData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;", "ladderGestureConfiguration", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onPendingOrderDragDirectionChanged", "Lkotlin/Function1;", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "onPendingOrderSelected", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "onPendingOrderDraggedOverRowChanged", "", "onPendingOrderDragEnded", "Lkotlin/Function2;", "", "onZoomStateChanged", "Lkotlin/Function3;", "onZoomScaleChanged", "onZoomDistanceChange", "", "Lkotlin/ParameterName;", "name", "distance", "center", "modifier", "Landroidx/compose/ui/Modifier;", "itemBlock", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/LadderLazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rowHeight", "getItemOffset", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getScrollOffset", "lib-trade-ladder_externalDebug", "ladderSelectedPendingOrders", "potentialDragTarget", "selectedRowOffset", "initialScrollOffset", "ladderViewBottomForDrag", "workingPillWidth", "workingPillYOffsetWithinRow", "latestPendingOrderDraggedOverRowIndex", "initialPinchDistance", "scale", "zoomScale", "currentScaleIsFromTheDuxo", "centerPriceBeforeZoom", "Ljava/math/BigDecimal;", "targetZoomScale"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LadderGestureAwareLazyColumnKt {

    /* compiled from: LadderGestureAwareLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$65(LadderState.LadderData ladderData, LadderGestureConfiguration ladderGestureConfiguration, LazyListState lazyListState, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Modifier modifier, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        LadderGestureAwareLazyColumn(ladderData, ladderGestureConfiguration, lazyListState, function1, function12, function13, function2, function3, function22, function23, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderGestureAwareLazyColumn(final LadderState.LadderData ladderData, final LadderGestureConfiguration ladderGestureConfiguration, final LazyListState lazyListState, final Function1<? super LadderCustomGestureDetector3, Unit> onPendingOrderDragDirectionChanged, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> onPendingOrderSelected, final Function1<? super Integer, Unit> onPendingOrderDraggedOverRowChanged, final Function2<? super Boolean, ? super Boolean, Unit> onPendingOrderDragEnded, final Function3<? super Boolean, ? super Integer, ? super Integer, Unit> onZoomStateChanged, final Function2<? super Integer, ? super Integer, Unit> onZoomScaleChanged, final Function2<? super Float, ? super Float, Unit> onZoomDistanceChange, Modifier modifier, final Function1<? super LadderLazyListScope, Unit> itemBlock, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        Object objRememberedValue3;
        Modifier modifier2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objMutableStateOf$default;
        Object objRememberedValue4;
        SnapshotState snapshotState2;
        Object objRememberedValue5;
        SnapshotState snapshotState3;
        Object obj;
        int i9;
        Object objAnimatable$default;
        Animatable animatable;
        Object objRememberedValue6;
        Animatable animatable2;
        Object objRememberedValue7;
        SnapshotIntState2 snapshotIntState2;
        BentoTheme bentoTheme;
        int i10;
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        float fMo5016toPx0680j_43;
        Object objRememberedValue8;
        float f;
        Object objRememberedValue9;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue10;
        SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue11;
        SnapshotIntState2 snapshotIntState22;
        Object objRememberedValue12;
        SnapshotFloatState2 snapshotFloatState23;
        SnapshotState snapshotState4;
        View view;
        Unit unit;
        int i11;
        int i12;
        boolean zChangedInstance;
        Object objRememberedValue13;
        int i13;
        Animatable animatable3;
        int i14;
        Composer composer2;
        Modifier modifier3;
        Animatable animatable4;
        int i15;
        View view2;
        Unit unit2;
        int i16;
        SnapshotFloatState2 snapshotFloatState24;
        float f2;
        SnapshotFloatState2 snapshotFloatState25;
        final SnapshotFloatState2 snapshotFloatState26;
        float f3;
        CoroutineScope coroutineScope2;
        Unit unit3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Modifier modifier4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue14;
        final SnapshotFloatState2 snapshotFloatState27;
        Object objRememberedValue15;
        SnapshotState4 snapshotState42;
        Object objRememberedValue16;
        int i17;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        SnapshotState snapshotState5;
        Object objRememberedValue17;
        SnapshotState snapshotState6;
        Object objRememberedValue18;
        SnapshotIntState2 snapshotIntState23;
        Integer numValueOf;
        int i18;
        boolean zChangedInstance2;
        Object c40963x670a1043;
        SnapshotFloatState2 snapshotFloatState28;
        Composer composer3;
        CoroutineScope coroutineScope3;
        Animatable animatable5;
        Modifier modifier5;
        BentoTheme bentoTheme2;
        ?? r9;
        Integer num;
        Animatable animatable6;
        SnapshotFloatState2 snapshotFloatState29;
        Unit unit4;
        int i19;
        float f4;
        int i20;
        LadderState.LadderData ladderData2;
        SnapshotIntState2 snapshotIntState24;
        SnapshotState snapshotState7;
        boolean zChangedInstance3;
        Object objRememberedValue19;
        final LazyListState lazyListState2;
        Modifier.Companion companion2;
        boolean z;
        Object objRememberedValue20;
        View view3;
        boolean zChangedInstance4;
        Object objRememberedValue21;
        Modifier.Companion companion3;
        int i21;
        final CoroutineScope coroutineScope4;
        final Animatable animatable7;
        final Animatable animatable8;
        boolean zChangedInstance5;
        Object objRememberedValue22;
        final Animatable animatable9;
        Composer composer4;
        final LazyListState lazyListState3;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;
        final Modifier modifier6;
        Side side;
        Alignment alignment;
        Modifier.Companion companion4;
        final SnapshotState snapshotState8;
        BoxScopeInstance boxScopeInstance;
        final SnapshotFloatState2 snapshotFloatState210;
        int i22;
        float floatValue;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Intrinsics.checkNotNullParameter(ladderData, "ladderData");
        Intrinsics.checkNotNullParameter(ladderGestureConfiguration, "ladderGestureConfiguration");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onPendingOrderDragDirectionChanged, "onPendingOrderDragDirectionChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderSelected, "onPendingOrderSelected");
        Intrinsics.checkNotNullParameter(onPendingOrderDraggedOverRowChanged, "onPendingOrderDraggedOverRowChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderDragEnded, "onPendingOrderDragEnded");
        Intrinsics.checkNotNullParameter(onZoomStateChanged, "onZoomStateChanged");
        Intrinsics.checkNotNullParameter(onZoomScaleChanged, "onZoomScaleChanged");
        Intrinsics.checkNotNullParameter(onZoomDistanceChange, "onZoomDistanceChange");
        Intrinsics.checkNotNullParameter(itemBlock, "itemBlock");
        Composer composerStartRestartGroup = composer.startRestartGroup(530488870);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(ladderGestureConfiguration) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPendingOrderDragDirectionChanged) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPendingOrderSelected) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            i27 = (196608 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderDraggedOverRowChanged) ? 131072 : 65536 : 196608;
            if ((i3 & 64) != 0) {
                i26 = (1572864 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderDragEnded) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i25 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(onZoomStateChanged) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i24 = (100663296 & i) == 0 ? composerStartRestartGroup.changedInstance(onZoomScaleChanged) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i23 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(onZoomDistanceChange) ? 536870912 : 268435456 : 805306368;
                            i5 = i4;
                            i6 = i3 & 1024;
                            if (i6 == 0) {
                                i7 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i7 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                            } else {
                                i7 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i7 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i7 |= composerStartRestartGroup.changedInstance(itemBlock) ? 32 : 16;
                            }
                            i8 = i7;
                            if ((i5 & 306783379) != 306783378 && (i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                lazyListState3 = lazyListState;
                                modifier6 = modifier;
                                composer4 = composerStartRestartGroup;
                            } else {
                                Modifier modifier7 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(530488870, i5, i8, "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumn (LadderGestureAwareLazyColumn.kt:77)");
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
                                    modifier2 = modifier7;
                                    snapshotMutationPolicy = null;
                                    objMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                                } else {
                                    modifier2 = modifier7;
                                    snapshotMutationPolicy = null;
                                    objMutableStateOf$default = objRememberedValue3;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                snapshotState2 = (SnapshotState) objMutableStateOf$default;
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
                                    i9 = 2;
                                    objAnimatable$default = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objAnimatable$default);
                                } else {
                                    obj = null;
                                    i9 = 2;
                                    objAnimatable$default = objRememberedValue5;
                                }
                                animatable = (Animatable) objAnimatable$default;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = Animatable2.Animatable$default(0.0f, 0.0f, i9, obj);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                animatable2 = (Animatable) objRememberedValue6;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(0);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1301216122);
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                bentoTheme = BentoTheme.INSTANCE;
                                i10 = BentoTheme.$stable;
                                fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21596getXxlargeD9Ej5fM());
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1301213018);
                                fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM());
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1301209468);
                                float fMo5016toPx0680j_44 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM());
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1301206426);
                                fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM());
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
                                SnapshotFloatState2 snapshotFloatState211 = (SnapshotFloatState2) objRememberedValue8;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue9 == companion.getEmpty()) {
                                    objRememberedValue9 = SnapshotFloatState3.mutableFloatStateOf(f);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                }
                                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue9;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue10 == companion.getEmpty()) {
                                    objRememberedValue10 = SnapshotFloatState3.mutableFloatStateOf(f);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                }
                                snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue10;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue11 == companion.getEmpty()) {
                                    objRememberedValue11 = SnapshotIntState3.mutableIntStateOf(-1);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                }
                                snapshotIntState22 = (SnapshotIntState2) objRememberedValue11;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue12 != companion.getEmpty()) {
                                    snapshotFloatState23 = snapshotFloatState211;
                                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                    objRememberedValue12 = snapshotStateMutableStateOf$default;
                                } else {
                                    snapshotFloatState23 = snapshotFloatState211;
                                }
                                snapshotState4 = (SnapshotState) objRememberedValue12;
                                composerStartRestartGroup.endReplaceGroup();
                                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                unit = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                i11 = i5 & 896;
                                i12 = i5 & 112;
                                zChangedInstance = ((i5 & 3670016) != 1048576) | ((i5 & 57344) != 16384) | (i11 != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | ((i5 & 7168) != 2048) | (i12 != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | ((i5 & 458752) != 131072) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue13 == companion.getEmpty()) {
                                    i13 = i12;
                                    animatable3 = animatable;
                                    i14 = i11;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    animatable4 = animatable2;
                                    i15 = i10;
                                    SnapshotFloatState2 snapshotFloatState212 = snapshotFloatState23;
                                    view2 = view;
                                    unit2 = unit;
                                    i16 = i5;
                                    snapshotFloatState24 = snapshotFloatState22;
                                    LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 = new LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(onPendingOrderSelected, lazyListState, coroutineScope, snapshotState2, snapshotState, snapshotIntState2, snapshotState3, animatable3, animatable4, fMo5016toPx0680j_42, onPendingOrderDragEnded, snapshotIntState22, snapshotFloatState24, snapshotFloatState2, onPendingOrderDragDirectionChanged, ladderGestureConfiguration, fMo5016toPx0680j_43, onPendingOrderDraggedOverRowChanged, snapshotFloatState212, fMo5016toPx0680j_4);
                                    snapshotState2 = snapshotState2;
                                    snapshotState3 = snapshotState3;
                                    f2 = fMo5016toPx0680j_42;
                                    snapshotFloatState25 = snapshotFloatState2;
                                    snapshotFloatState26 = snapshotFloatState212;
                                    f3 = fMo5016toPx0680j_4;
                                    coroutineScope2 = coroutineScope;
                                    composer2.updateRememberedValue(ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1);
                                    objRememberedValue13 = ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1;
                                } else {
                                    i13 = i12;
                                    coroutineScope2 = coroutineScope;
                                    animatable3 = animatable;
                                    i14 = i11;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    animatable4 = animatable2;
                                    i15 = i10;
                                    snapshotFloatState25 = snapshotFloatState2;
                                    snapshotFloatState24 = snapshotFloatState22;
                                    snapshotFloatState26 = snapshotFloatState23;
                                    view2 = view;
                                    unit2 = unit;
                                    f2 = fMo5016toPx0680j_42;
                                    i16 = i5;
                                    f3 = fMo5016toPx0680j_4;
                                }
                                composer2.endReplaceGroup();
                                unit3 = unit2;
                                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier3, unit3, (PointerInputEventHandler) objRememberedValue13);
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPointerInput);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
                                modifier4 = modifier3;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue14 = composer2.rememberedValue();
                                if (objRememberedValue14 == companion.getEmpty()) {
                                    objRememberedValue14 = SnapshotFloatState3.mutableFloatStateOf(ladderData.getLadderPriceLevels().getScale());
                                    composer2.updateRememberedValue(objRememberedValue14);
                                }
                                snapshotFloatState27 = (SnapshotFloatState2) objRememberedValue14;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue15 = composer2.rememberedValue();
                                if (objRememberedValue15 == companion.getEmpty()) {
                                    objRememberedValue15 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Integer.valueOf(LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$38$lambda$37(snapshotFloatState27));
                                        }
                                    });
                                    composer2.updateRememberedValue(objRememberedValue15);
                                }
                                snapshotState42 = (SnapshotState4) objRememberedValue15;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue16 = composer2.rememberedValue();
                                if (objRememberedValue16 != companion.getEmpty()) {
                                    i17 = 2;
                                    snapshotMutationPolicy2 = null;
                                    objRememberedValue16 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                    composer2.updateRememberedValue(objRememberedValue16);
                                } else {
                                    i17 = 2;
                                    snapshotMutationPolicy2 = null;
                                }
                                snapshotState5 = (SnapshotState) objRememberedValue16;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue17 = composer2.rememberedValue();
                                if (objRememberedValue17 == companion.getEmpty()) {
                                    objRememberedValue17 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i17, snapshotMutationPolicy2);
                                    composer2.updateRememberedValue(objRememberedValue17);
                                }
                                snapshotState6 = (SnapshotState) objRememberedValue17;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue18 = composer2.rememberedValue();
                                if (objRememberedValue18 == companion.getEmpty()) {
                                    objRememberedValue18 = SnapshotIntState3.mutableIntStateOf(ladderData.getLadderPriceLevels().getScale());
                                    composer2.updateRememberedValue(objRememberedValue18);
                                }
                                snapshotIntState23 = (SnapshotIntState2) objRememberedValue18;
                                composer2.endReplaceGroup();
                                numValueOf = Integer.valueOf(LadderGestureAwareLazyColumn$lambda$64$lambda$39(snapshotState42));
                                composer2.startReplaceGroup(-1224400529);
                                SnapshotFloatState2 snapshotFloatState213 = snapshotFloatState25;
                                i18 = i14;
                                zChangedInstance2 = (i18 != 256) | composer2.changedInstance(ladderData) | ((i16 & 234881024) != 67108864);
                                Object objRememberedValue23 = composer2.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue23 == companion.getEmpty()) {
                                    snapshotFloatState28 = snapshotFloatState27;
                                    composer3 = composer2;
                                    coroutineScope3 = coroutineScope2;
                                    animatable5 = animatable3;
                                    modifier5 = modifier4;
                                    bentoTheme2 = bentoTheme;
                                    r9 = 0;
                                    num = numValueOf;
                                    animatable6 = animatable4;
                                    snapshotFloatState29 = snapshotFloatState24;
                                    unit4 = unit3;
                                    i19 = i13;
                                    f4 = f3;
                                    i20 = i18;
                                    c40963x670a1043 = new C40963x670a1043(lazyListState, ladderData, onZoomScaleChanged, snapshotState5, snapshotState42, snapshotIntState23, snapshotState6, null);
                                    ladderData2 = ladderData;
                                    snapshotIntState24 = snapshotIntState23;
                                    snapshotState7 = snapshotState6;
                                    composer3.updateRememberedValue(c40963x670a1043);
                                } else {
                                    composer3 = composer2;
                                    c40963x670a1043 = objRememberedValue23;
                                    snapshotFloatState28 = snapshotFloatState27;
                                    snapshotIntState24 = snapshotIntState23;
                                    coroutineScope3 = coroutineScope2;
                                    animatable5 = animatable3;
                                    modifier5 = modifier4;
                                    snapshotState7 = snapshotState6;
                                    bentoTheme2 = bentoTheme;
                                    r9 = 0;
                                    num = numValueOf;
                                    ladderData2 = ladderData;
                                    animatable6 = animatable4;
                                    snapshotFloatState29 = snapshotFloatState24;
                                    unit4 = unit3;
                                    i19 = i13;
                                    f4 = f3;
                                    i20 = i18;
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c40963x670a1043, composer3, (int) r9);
                                BigDecimal displayPriceIncrement = ladderData2.getLadderPriceLevels().getDisplayPriceIncrement();
                                composer3.startReplaceGroup(-1224400529);
                                zChangedInstance3 = composer3.changedInstance(ladderData2) | (i20 != 256 ? true : r9);
                                objRememberedValue19 = composer3.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue19 == companion.getEmpty()) {
                                    C40964x670a1404 c40964x670a1404 = new C40964x670a1404(ladderData2, lazyListState, snapshotState7, snapshotIntState24, null);
                                    lazyListState2 = lazyListState;
                                    composer3.updateRememberedValue(c40964x670a1404);
                                    objRememberedValue19 = c40964x670a1404;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(displayPriceIncrement, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composer3, (int) r9);
                                boolean z2 = LadderGestureAwareLazyColumn$lambda$31(snapshotState4) != null ? true : r9;
                                companion2 = Modifier.INSTANCE;
                                composer3.startReplaceGroup(-1633490746);
                                z = i20 != 256 ? true : r9;
                                objRememberedValue20 = composer3.rememberedValue();
                                if (!z || objRememberedValue20 == companion.getEmpty()) {
                                    objRememberedValue20 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$52$lambda$51(lazyListState2, snapshotFloatState26, (LayoutCoordinates) obj2);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue20);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue20);
                                composer3.startReplaceGroup(-1224400529);
                                view3 = view2;
                                zChangedInstance4 = ((i16 & 29360128) != 8388608 ? true : r9) | (i20 != 256 ? true : r9) | ((i16 & 1879048192) != 536870912 ? true : r9) | (i19 != 32 ? true : r9) | composer3.changedInstance(view3);
                                objRememberedValue21 = composer3.rememberedValue();
                                if (!zChangedInstance4 || objRememberedValue21 == companion.getEmpty()) {
                                    companion3 = companion2;
                                    i21 = 32;
                                    C40965x670a1b86 c40965x670a1b86 = new C40965x670a1b86(lazyListState2, onZoomStateChanged, onZoomDistanceChange, snapshotState4, snapshotState7, ladderGestureConfiguration, view3, snapshotFloatState28);
                                    composer3.updateRememberedValue(c40965x670a1b86);
                                    objRememberedValue21 = c40965x670a1b86;
                                } else {
                                    companion3 = companion2;
                                    i21 = 32;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned, unit4, (PointerInputEventHandler) objRememberedValue21);
                                composer3.startReplaceGroup(-1224400529);
                                coroutineScope4 = coroutineScope3;
                                animatable7 = animatable5;
                                animatable8 = animatable6;
                                zChangedInstance5 = composer3.changedInstance(coroutineScope4) | (i20 != 256) | composer3.changedInstance(animatable7) | composer3.changedInstance(animatable8) | ((i8 & 112) != i21);
                                objRememberedValue22 = composer3.rememberedValue();
                                if (!zChangedInstance5 || objRememberedValue22 == companion.getEmpty()) {
                                    final SnapshotState snapshotState9 = snapshotState2;
                                    final SnapshotState snapshotState10 = snapshotState3;
                                    Function1 function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$55$lambda$54(itemBlock, lazyListState, coroutineScope4, snapshotState10, animatable7, animatable8, snapshotState9, (LazyListScope) obj2);
                                        }
                                    };
                                    animatable9 = animatable7;
                                    composer3.updateRememberedValue(function1);
                                    objRememberedValue22 = function1;
                                } else {
                                    animatable9 = animatable7;
                                }
                                composer3.endReplaceGroup();
                                Modifier.Companion companion7 = companion3;
                                boolean z3 = z2;
                                Composer composer5 = composer3;
                                LazyDslKt.LazyColumn(modifierPointerInput2, lazyListState, null, false, null, null, null, z3, null, (Function1) objRememberedValue22, composer5, (i16 >> 3) & 112, 380);
                                composer4 = composer5;
                                lazyListState3 = lazyListState;
                                selectedPendingOrders = ladderData.getSelectedPendingOrders();
                                composer4.startReplaceGroup(620226275);
                                if (selectedPendingOrders != null) {
                                    Side side2 = selectedPendingOrders.getSide();
                                    Alignment topEnd = side2 == Side.END ? companion5.getTopEnd() : companion5.getTopStart();
                                    float fFloatValue = ((Number) animatable9.getValue()).floatValue();
                                    float fAbs = Math.abs(fFloatValue);
                                    float f5 = f4;
                                    float fCoerceIn = (f5 - RangesKt.coerceIn(fAbs - f4, 0.0f, f5)) / f5;
                                    composer4.startReplaceGroup(620240444);
                                    if (ladderData.getPendingOrderDragDirection() == null || (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumn$lambda$4(snapshotState2)) == null) {
                                        side = side2;
                                        alignment = topEnd;
                                        companion4 = companion7;
                                        snapshotState8 = snapshotState3;
                                        boxScopeInstance = boxScopeInstance2;
                                        snapshotFloatState210 = snapshotFloatState213;
                                    } else {
                                        StringResource label = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getLabel();
                                        StringResource bottomLabel = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getBottomLabel();
                                        PillStyle.PillVisualState visualState = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getVisualState();
                                        PillStyle.PillVisualState bottomVisualState = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getBottomVisualState();
                                        if (bottomVisualState == null) {
                                            bottomVisualState = PillStyle.PillVisualState.ACTIVE;
                                        }
                                        PillStyle.PillVisualState pillVisualState = bottomVisualState;
                                        composer4.startReplaceGroup(-1746271574);
                                        boolean z4 = i20 == 256;
                                        Object objRememberedValue24 = composer4.rememberedValue();
                                        if (z4 || objRememberedValue24 == companion.getEmpty()) {
                                            final SnapshotFloatState2 snapshotFloatState214 = snapshotFloatState29;
                                            snapshotFloatState210 = snapshotFloatState213;
                                            objRememberedValue24 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return LadderGestureAwareLazyColumnKt.m2943x72e67b76(lazyListState3, snapshotFloatState210, snapshotFloatState214, (LayoutCoordinates) obj2);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue24);
                                        } else {
                                            snapshotFloatState210 = snapshotFloatState213;
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(companion7, (Function1) objRememberedValue24);
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance6 = composer4.changedInstance(animatable9) | composer4.changedInstance(animatable8);
                                        Object objRememberedValue25 = composer4.rememberedValue();
                                        if (zChangedInstance6 || objRememberedValue25 == companion.getEmpty()) {
                                            objRememberedValue25 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return LadderGestureAwareLazyColumnKt.m2944x9cafe0fa(animatable9, animatable8, (Density) obj2);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue25);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierAlpha = Alpha.alpha(OffsetKt.offset(modifierOnGloballyPositioned2, (Function1) objRememberedValue25), fCoerceIn);
                                        int i28 = StringResource.$stable;
                                        int i29 = (i28 << 6) | 6 | (i28 << 9);
                                        snapshotState8 = snapshotState3;
                                        Alignment alignment2 = topEnd;
                                        companion4 = companion7;
                                        boxScopeInstance = boxScopeInstance2;
                                        side = side2;
                                        PendingOrderPillKt.PendingOrderPill(boxScopeInstance, side, label, bottomLabel, modifierAlpha, null, alignment2, null, false, false, visualState, pillVisualState, composer4, i29, 0, 464);
                                        alignment = alignment2;
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(620284917);
                                    if (fFloatValue != 0.0f) {
                                        float fCoerceAtMost = RangesKt.coerceAtMost(fAbs / fMo5016toPx0680j_44, 1.0f);
                                        if (fAbs < f5) {
                                            fCoerceIn = fCoerceAtMost;
                                        }
                                        if (fFloatValue > 0.0f) {
                                            int i30 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                                            i22 = 1;
                                            if (i30 == 1) {
                                                floatValue = fFloatValue - (2 * f2);
                                            } else {
                                                if (i30 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                floatValue = ((-snapshotFloatState210.getFloatValue()) + fFloatValue) - fMo5016toPx0680j_44;
                                            }
                                        } else {
                                            i22 = 1;
                                            int i31 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                                            if (i31 == 1) {
                                                floatValue = snapshotFloatState210.getFloatValue() + fFloatValue + fMo5016toPx0680j_44;
                                            } else {
                                                if (i31 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                floatValue = (2 * f2) + fFloatValue;
                                            }
                                        }
                                        final int i32 = (int) floatValue;
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRASH_24);
                                        long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i15).m21425getFg0d7_KjU();
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(boxScopeInstance.align(companion4, alignment), 0.0f, C2002Dp.m7995constructorimpl(10), i22, null);
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer4.changed(i32);
                                        Object objRememberedValue26 = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue26 == companion.getEmpty()) {
                                            objRememberedValue26 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return LadderGestureAwareLazyColumnKt.m2945x7e18d317(i32, snapshotState8, (Density) obj2);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue26);
                                        }
                                        composer4.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, Alpha.alpha(Scale2.scale(OffsetKt.offset(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue26), fCoerceAtMost), fCoerceIn), null, false, composer4, BentoIcon4.Size24.$stable | 48, 48);
                                    }
                                    composer4.endReplaceGroup();
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier6 = modifier5;
                            }
                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final LazyListState lazyListState4 = lazyListState3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$65(ladderData, ladderGestureConfiguration, lazyListState4, onPendingOrderDragDirectionChanged, onPendingOrderSelected, onPendingOrderDraggedOverRowChanged, onPendingOrderDragEnded, onZoomStateChanged, onZoomScaleChanged, onZoomDistanceChange, modifier6, itemBlock, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= i23;
                        i5 = i4;
                        i6 = i3 & 1024;
                        if (i6 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i8 = i7;
                        if ((i5 & 306783379) != 306783378) {
                            if (i6 == 0) {
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
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            snapshotState2 = (SnapshotState) objMutableStateOf$default;
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
                            if (objRememberedValue7 == companion.getEmpty()) {
                            }
                            snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1301216122);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            bentoTheme = BentoTheme.INSTANCE;
                            i10 = BentoTheme.$stable;
                            fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21596getXxlargeD9Ej5fM());
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1301213018);
                            fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM());
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1301209468);
                            float fMo5016toPx0680j_442 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM());
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1301206426);
                            fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM());
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 != companion.getEmpty()) {
                            }
                            SnapshotFloatState2 snapshotFloatState2112 = (SnapshotFloatState2) objRememberedValue8;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == companion.getEmpty()) {
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue9;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == companion.getEmpty()) {
                            }
                            snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue10;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue11 == companion.getEmpty()) {
                            }
                            snapshotIntState22 = (SnapshotIntState2) objRememberedValue11;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue12 != companion.getEmpty()) {
                            }
                            snapshotState4 = (SnapshotState) objRememberedValue12;
                            composerStartRestartGroup.endReplaceGroup();
                            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                            unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            i11 = i5 & 896;
                            i12 = i5 & 112;
                            zChangedInstance = ((i5 & 3670016) != 1048576) | ((i5 & 57344) != 16384) | (i11 != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | ((i5 & 7168) != 2048) | (i12 != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | ((i5 & 458752) != 131072) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                i13 = i12;
                                animatable3 = animatable;
                                i14 = i11;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                animatable4 = animatable2;
                                i15 = i10;
                                SnapshotFloatState2 snapshotFloatState2122 = snapshotFloatState23;
                                view2 = view;
                                unit2 = unit;
                                i16 = i5;
                                snapshotFloatState24 = snapshotFloatState22;
                                LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$12 = new LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(onPendingOrderSelected, lazyListState, coroutineScope, snapshotState2, snapshotState, snapshotIntState2, snapshotState3, animatable3, animatable4, fMo5016toPx0680j_42, onPendingOrderDragEnded, snapshotIntState22, snapshotFloatState24, snapshotFloatState2, onPendingOrderDragDirectionChanged, ladderGestureConfiguration, fMo5016toPx0680j_43, onPendingOrderDraggedOverRowChanged, snapshotFloatState2122, fMo5016toPx0680j_4);
                                snapshotState2 = snapshotState2;
                                snapshotState3 = snapshotState3;
                                f2 = fMo5016toPx0680j_42;
                                snapshotFloatState25 = snapshotFloatState2;
                                snapshotFloatState26 = snapshotFloatState2122;
                                f3 = fMo5016toPx0680j_4;
                                coroutineScope2 = coroutineScope;
                                composer2.updateRememberedValue(ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$12);
                                objRememberedValue13 = ladderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$12;
                                composer2.endReplaceGroup();
                                unit3 = unit2;
                                Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(modifier3, unit3, (PointerInputEventHandler) objRememberedValue13);
                                Alignment.Companion companion52 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion52.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierPointerInput3);
                                ComposeUiNode.Companion companion62 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion62.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                modifier4 = modifier3;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion62.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion62.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion62.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion62.getSetModifier());
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceGroup(1849434622);
                                    objRememberedValue14 = composer2.rememberedValue();
                                    if (objRememberedValue14 == companion.getEmpty()) {
                                    }
                                    snapshotFloatState27 = (SnapshotFloatState2) objRememberedValue14;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    objRememberedValue15 = composer2.rememberedValue();
                                    if (objRememberedValue15 == companion.getEmpty()) {
                                    }
                                    snapshotState42 = (SnapshotState4) objRememberedValue15;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    objRememberedValue16 = composer2.rememberedValue();
                                    if (objRememberedValue16 != companion.getEmpty()) {
                                    }
                                    snapshotState5 = (SnapshotState) objRememberedValue16;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    objRememberedValue17 = composer2.rememberedValue();
                                    if (objRememberedValue17 == companion.getEmpty()) {
                                    }
                                    snapshotState6 = (SnapshotState) objRememberedValue17;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    objRememberedValue18 = composer2.rememberedValue();
                                    if (objRememberedValue18 == companion.getEmpty()) {
                                    }
                                    snapshotIntState23 = (SnapshotIntState2) objRememberedValue18;
                                    composer2.endReplaceGroup();
                                    numValueOf = Integer.valueOf(LadderGestureAwareLazyColumn$lambda$64$lambda$39(snapshotState42));
                                    composer2.startReplaceGroup(-1224400529);
                                    SnapshotFloatState2 snapshotFloatState2132 = snapshotFloatState25;
                                    i18 = i14;
                                    zChangedInstance2 = (i18 != 256) | composer2.changedInstance(ladderData) | ((i16 & 234881024) != 67108864);
                                    Object objRememberedValue232 = composer2.rememberedValue();
                                    if (zChangedInstance2) {
                                        snapshotFloatState28 = snapshotFloatState27;
                                        composer3 = composer2;
                                        coroutineScope3 = coroutineScope2;
                                        animatable5 = animatable3;
                                        modifier5 = modifier4;
                                        bentoTheme2 = bentoTheme;
                                        r9 = 0;
                                        num = numValueOf;
                                        animatable6 = animatable4;
                                        snapshotFloatState29 = snapshotFloatState24;
                                        unit4 = unit3;
                                        i19 = i13;
                                        f4 = f3;
                                        i20 = i18;
                                        c40963x670a1043 = new C40963x670a1043(lazyListState, ladderData, onZoomScaleChanged, snapshotState5, snapshotState42, snapshotIntState23, snapshotState6, null);
                                        ladderData2 = ladderData;
                                        snapshotIntState24 = snapshotIntState23;
                                        snapshotState7 = snapshotState6;
                                        composer3.updateRememberedValue(c40963x670a1043);
                                        composer3.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c40963x670a1043, composer3, (int) r9);
                                        BigDecimal displayPriceIncrement2 = ladderData2.getLadderPriceLevels().getDisplayPriceIncrement();
                                        composer3.startReplaceGroup(-1224400529);
                                        zChangedInstance3 = composer3.changedInstance(ladderData2) | (i20 != 256 ? true : r9);
                                        objRememberedValue19 = composer3.rememberedValue();
                                        if (zChangedInstance3) {
                                            C40964x670a1404 c40964x670a14042 = new C40964x670a1404(ladderData2, lazyListState, snapshotState7, snapshotIntState24, null);
                                            lazyListState2 = lazyListState;
                                            composer3.updateRememberedValue(c40964x670a14042);
                                            objRememberedValue19 = c40964x670a14042;
                                            composer3.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(displayPriceIncrement2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composer3, (int) r9);
                                            if (LadderGestureAwareLazyColumn$lambda$31(snapshotState4) != null) {
                                            }
                                            companion2 = Modifier.INSTANCE;
                                            composer3.startReplaceGroup(-1633490746);
                                            if (i20 != 256) {
                                            }
                                            objRememberedValue20 = composer3.rememberedValue();
                                            if (!z) {
                                                objRememberedValue20 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$52$lambda$51(lazyListState2, snapshotFloatState26, (LayoutCoordinates) obj2);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue20);
                                                composer3.endReplaceGroup();
                                                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue20);
                                                composer3.startReplaceGroup(-1224400529);
                                                view3 = view2;
                                                zChangedInstance4 = ((i16 & 29360128) != 8388608 ? true : r9) | (i20 != 256 ? true : r9) | ((i16 & 1879048192) != 536870912 ? true : r9) | (i19 != 32 ? true : r9) | composer3.changedInstance(view3);
                                                objRememberedValue21 = composer3.rememberedValue();
                                                if (zChangedInstance4) {
                                                    companion3 = companion2;
                                                    i21 = 32;
                                                    C40965x670a1b86 c40965x670a1b862 = new C40965x670a1b86(lazyListState2, onZoomStateChanged, onZoomDistanceChange, snapshotState4, snapshotState7, ladderGestureConfiguration, view3, snapshotFloatState28);
                                                    composer3.updateRememberedValue(c40965x670a1b862);
                                                    objRememberedValue21 = c40965x670a1b862;
                                                    composer3.endReplaceGroup();
                                                    Modifier modifierPointerInput22 = SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned3, unit4, (PointerInputEventHandler) objRememberedValue21);
                                                    composer3.startReplaceGroup(-1224400529);
                                                    coroutineScope4 = coroutineScope3;
                                                    animatable7 = animatable5;
                                                    animatable8 = animatable6;
                                                    zChangedInstance5 = composer3.changedInstance(coroutineScope4) | (i20 != 256) | composer3.changedInstance(animatable7) | composer3.changedInstance(animatable8) | ((i8 & 112) != i21);
                                                    objRememberedValue22 = composer3.rememberedValue();
                                                    if (zChangedInstance5) {
                                                        final SnapshotState snapshotState92 = snapshotState2;
                                                        final SnapshotState snapshotState102 = snapshotState3;
                                                        Function1 function12 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj2) {
                                                                return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$55$lambda$54(itemBlock, lazyListState, coroutineScope4, snapshotState102, animatable7, animatable8, snapshotState92, (LazyListScope) obj2);
                                                            }
                                                        };
                                                        animatable9 = animatable7;
                                                        composer3.updateRememberedValue(function12);
                                                        objRememberedValue22 = function12;
                                                        composer3.endReplaceGroup();
                                                        Modifier.Companion companion72 = companion3;
                                                        boolean z32 = z2;
                                                        Composer composer52 = composer3;
                                                        LazyDslKt.LazyColumn(modifierPointerInput22, lazyListState, null, false, null, null, null, z32, null, (Function1) objRememberedValue22, composer52, (i16 >> 3) & 112, 380);
                                                        composer4 = composer52;
                                                        lazyListState3 = lazyListState;
                                                        selectedPendingOrders = ladderData.getSelectedPendingOrders();
                                                        composer4.startReplaceGroup(620226275);
                                                        if (selectedPendingOrders != null) {
                                                        }
                                                        composer4.endReplaceGroup();
                                                        composer4.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        modifier6 = modifier5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i4 |= i24;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i23;
                    i5 = i4;
                    i6 = i3 & 1024;
                    if (i6 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i8 = i7;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i4 |= i25;
                if ((i3 & 256) != 0) {
                }
                i4 |= i24;
                if ((i3 & 512) == 0) {
                }
                i4 |= i23;
                i5 = i4;
                i6 = i3 & 1024;
                if (i6 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i8 = i7;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 |= i26;
            if ((i3 & 128) == 0) {
            }
            i4 |= i25;
            if ((i3 & 256) != 0) {
            }
            i4 |= i24;
            if ((i3 & 512) == 0) {
            }
            i4 |= i23;
            i5 = i4;
            i6 = i3 & 1024;
            if (i6 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i8 = i7;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 |= i27;
        if ((i3 & 64) != 0) {
        }
        i4 |= i26;
        if ((i3 & 128) == 0) {
        }
        i4 |= i25;
        if ((i3 & 256) != 0) {
        }
        i4 |= i24;
        if ((i3 & 512) == 0) {
        }
        i4 |= i23;
        i5 = i4;
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i8 = i7;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderState.LadderData.SelectedPendingOrders LadderGestureAwareLazyColumn$lambda$1(SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float LadderGestureAwareLazyColumn$lambda$31(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderState.LadderData.SelectedPendingOrders LadderGestureAwareLazyColumn$lambda$4(SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LadderGestureAwareLazyColumn$lambda$64$lambda$39(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderGestureAwareLazyColumn$lambda$64$lambda$41(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal LadderGestureAwareLazyColumn$lambda$64$lambda$44(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Integer LadderGestureAwareLazyColumn$lambda$7(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LadderGestureAwareLazyColumn$lambda$64$lambda$38$lambda$37(SnapshotFloatState2 snapshotFloatState2) {
        return (int) Math.floor(snapshotFloatState2.getFloatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderGestureAwareLazyColumn$lambda$64$lambda$42(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$64$lambda$52$lambda$51(LazyListState lazyListState, SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotFloatState2.setFloatValue(((int) (coords.mo7241getSizeYbymL2g() & 4294967295L)) - rowHeight(lazyListState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderGestureAwareLazyColumn$lambda$64$lambda$55$lambda$54(Function1 function1, final LazyListState lazyListState, final CoroutineScope coroutineScope, final SnapshotState snapshotState, final Animatable animatable, final Animatable animatable2, final SnapshotState snapshotState2, final LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        function1.invoke(new LadderLazyListScope(LazyColumn) { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$5$1$customScope$1
            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderGestureParent
            public void updatePotentialDragTarget(LadderState.LadderData.SelectedPendingOrders target) {
                Intrinsics.checkNotNullParameter(target, "target");
                int itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, target.getRowIndex());
                snapshotState.setValue(Integer.valueOf(itemOffset));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40967xb95f5296(animatable, animatable2, itemOffset, null), 3, null);
                snapshotState2.setValue(target);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$64$lambda$63$lambda$60$lambda$57$lambda$56 */
    public static final Unit m2943x72e67b76(LazyListState lazyListState, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotFloatState2.setFloatValue((int) (coords.mo7241getSizeYbymL2g() >> 32));
        snapshotFloatState22.setFloatValue((rowHeight(lazyListState) - ((int) (coords.mo7241getSizeYbymL2g() & 4294967295L))) / 2.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$64$lambda$63$lambda$60$lambda$59$lambda$58 */
    public static final IntOffset m2944x9cafe0fa(Animatable animatable, Animatable animatable2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(((Number) animatable2.getValue()).floatValue()) & 4294967295L) | (MathKt.roundToInt(((Number) animatable.getValue()).floatValue()) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LadderGestureAwareLazyColumn$lambda$64$lambda$63$lambda$62$lambda$61 */
    public static final IntOffset m2945x7e18d317(int i, SnapshotState snapshotState, Density offset) {
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
