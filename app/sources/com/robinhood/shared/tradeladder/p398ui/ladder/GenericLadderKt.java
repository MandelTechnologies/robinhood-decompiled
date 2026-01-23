package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.Zoomable;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.QuantityBarWidth;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderGestureAwareLazyColumnKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderLazyListScope;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows.LadderRowKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GenericLadder.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001aÅ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00102\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u000b2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a!\u0010!\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010&¨\u0006(²\u0006\u0012\u0010)\u001a\n **\u0004\u0018\u00010\u00070\u0007X\u008a\u008e\u0002²\u0006\u0012\u0010+\u001a\n **\u0004\u0018\u00010\u00070\u0007X\u008a\u008e\u0002²\u0006\u0012\u0010,\u001a\n **\u0004\u0018\u00010\u00070\u0007X\u008a\u008e\u0002²\u0006\u0012\u0010-\u001a\n **\u0004\u0018\u00010\u00070\u0007X\u008a\u008e\u0002²\u0006\u0016\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0\u0005X\u008a\u0084\u0002²\u0006\u0016\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0\u0005X\u008a\u0084\u0002²\u0006\u0010\u00101\u001a\b\u0012\u0004\u0012\u00020\u000602X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0003X\u008a\u0084\u0002"}, m3636d2 = {"GenericLadderComposable", "", "ladderData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;", "zoomOverlayData", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Ljava/math/BigDecimal;", "ladderGestureConfiguration", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;", "onZoomStateChanged", "Lkotlin/Function3;", "", "onZoomScaleChanged", "Lkotlin/Function2;", "onRowClicked", "Lkotlin/Function1;", "onPendingOrderSelected", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "onPendingOrderDragDirectionChanged", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "onPendingOrderDraggedOverRowChanged", "onPendingOrderDragEnded", "onPendingOrderClicked", "onStartOrderClicked", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "onEndOrderClicked", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;Lkotlinx/collections/immutable/ImmutableMap;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;III)V", "ZoomToast", "zoomDisplay", "Lcom/robinhood/utils/resource/StringResource;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ZoomToastPreview", "(Landroidx/compose/runtime/Composer;I)V", "GenericLadderPreview", "lib-trade-ladder_externalDebug", "minVisibleAskQuantity", "kotlin.jvm.PlatformType", "maxVisibleAskQuantity", "minVisibleBidQuantity", "maxVisibleBidQuantity", "visibleAskQuantityBars", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$QuantityBar;", "visibleBigQuantityBars", "zoomOverlayItems", "", "state"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GenericLadderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$48(LadderState.LadderData ladderData, ImmutableMap immutableMap, LadderGestureConfiguration ladderGestureConfiguration, Function3 function3, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15, Function3 function32, Function3 function33, Modifier modifier, LazyListState lazyListState, int i, int i2, int i3, Composer composer, int i4) {
        GenericLadderComposable(ladderData, immutableMap, ladderGestureConfiguration, function3, function2, function1, function12, function13, function14, function22, function15, function32, function33, modifier, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderPreview$lambda$56(int i, Composer composer, int i2) {
        GenericLadderPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZoomToast$lambda$49(StringResource stringResource, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ZoomToast(stringResource, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZoomToastPreview$lambda$50(int i, Composer composer, int i2) {
        ZoomToastPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericLadderComposable(final LadderState.LadderData ladderData, final ImmutableMap<Integer, ? extends BigDecimal> immutableMap, final LadderGestureConfiguration ladderGestureConfiguration, final Function3<? super Boolean, ? super Integer, ? super Integer, Unit> onZoomStateChanged, final Function2<? super Integer, ? super Integer, Unit> onZoomScaleChanged, final Function1<? super Integer, Unit> onRowClicked, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> onPendingOrderSelected, final Function1<? super LadderCustomGestureDetector3, Unit> onPendingOrderDragDirectionChanged, final Function1<? super Integer, Unit> onPendingOrderDraggedOverRowChanged, final Function2<? super Boolean, ? super Boolean, Unit> onPendingOrderDragEnded, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> onPendingOrderClicked, final Function3<? super Integer, ? super OrderType, ? super OrderTrigger, Unit> onStartOrderClicked, final Function3<? super Integer, ? super OrderType, ? super OrderTrigger, Unit> onEndOrderClicked, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        LazyListState lazyListStateRememberLazyListState;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        Object objRememberedValue6;
        SnapshotState snapshotState3;
        SnapshotState snapshotState4;
        int i11;
        SnapshotState snapshotState5;
        boolean z;
        boolean zChangedInstance;
        Object genericLadderKt$GenericLadderComposable$1$1;
        final SnapshotState snapshotState6;
        Float f;
        int i12;
        Composer composer2;
        int i13;
        final SnapshotState snapshotState7;
        final SnapshotState snapshotState8;
        final SnapshotState snapshotState9;
        final SnapshotState snapshotState10;
        Modifier modifier3;
        LazyListState lazyListState2;
        final LadderState.LadderData ladderData2;
        boolean zChanged;
        Object objRememberedValue7;
        boolean zChanged2;
        Object objRememberedValue8;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        LadderState.LadderData ladderData3;
        LazyListState lazyListState3;
        SnapshotState4 snapshotState42;
        SnapshotState4 snapshotState43;
        BoxScopeInstance boxScopeInstance;
        SnapshotState snapshotState11;
        SnapshotState snapshotState12;
        int i14;
        int i15;
        Modifier modifier4;
        Float f2;
        Float f3;
        int i16;
        Object objRememberedValue9;
        int i17;
        int i18;
        boolean z2;
        boolean z3;
        Object objRememberedValue10;
        int i19;
        Modifier modifier5;
        int i20;
        LazyListState lazyListState4;
        boolean zChangedInstance2;
        Object objRememberedValue11;
        final LazyListState lazyListState5;
        final Modifier modifier6;
        Object objDerivedStateOf;
        final Float f4;
        final SnapshotState4 snapshotState44;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(ladderData, "ladderData");
        Intrinsics.checkNotNullParameter(ladderGestureConfiguration, "ladderGestureConfiguration");
        Intrinsics.checkNotNullParameter(onZoomStateChanged, "onZoomStateChanged");
        Intrinsics.checkNotNullParameter(onZoomScaleChanged, "onZoomScaleChanged");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Intrinsics.checkNotNullParameter(onPendingOrderSelected, "onPendingOrderSelected");
        Intrinsics.checkNotNullParameter(onPendingOrderDragDirectionChanged, "onPendingOrderDragDirectionChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderDraggedOverRowChanged, "onPendingOrderDraggedOverRowChanged");
        Intrinsics.checkNotNullParameter(onPendingOrderDragEnded, "onPendingOrderDragEnded");
        Intrinsics.checkNotNullParameter(onPendingOrderClicked, "onPendingOrderClicked");
        Intrinsics.checkNotNullParameter(onStartOrderClicked, "onStartOrderClicked");
        Intrinsics.checkNotNullParameter(onEndOrderClicked, "onEndOrderClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1226895970);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(immutableMap) ? 32 : 16;
        }
        int i26 = i4;
        if ((i3 & 4) != 0) {
            i26 |= 384;
        } else if ((i & 384) == 0) {
            i26 |= composerStartRestartGroup.changed(ladderGestureConfiguration) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i26 |= 3072;
        } else if ((i & 3072) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(onZoomStateChanged) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i26 |= 24576;
        } else if ((i & 24576) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(onZoomScaleChanged) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            i25 = (196608 & i) == 0 ? composerStartRestartGroup.changedInstance(onRowClicked) ? 131072 : 65536 : 196608;
            if ((i3 & 64) != 0) {
                i24 = (1572864 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderSelected) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i23 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderDragDirectionChanged) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i22 = (100663296 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderDraggedOverRowChanged) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i21 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(onPendingOrderDragEnded) ? 536870912 : 268435456 : 805306368;
                            i5 = i26;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (composerStartRestartGroup.changedInstance(onPendingOrderClicked) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i6 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(onStartOrderClicked) ? 32 : 16;
                            }
                            if ((i3 & 4096) == 0) {
                                i6 |= 384;
                                i7 = i2;
                            } else {
                                i7 = i2;
                                if ((i7 & 384) == 0) {
                                    i6 |= composerStartRestartGroup.changedInstance(onEndOrderClicked) ? 256 : 128;
                                }
                            }
                            i8 = i3 & 8192;
                            if (i8 != 0) {
                                i9 = i8;
                                if ((i7 & 3072) == 0) {
                                    i6 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                                }
                                if ((i7 & 24576) == 0) {
                                    i6 |= ((i3 & 16384) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 16384 : 8192;
                                }
                                if ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier6 = modifier;
                                    lazyListState5 = lazyListState;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier = i9 == 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 16384) == 0) {
                                            i10 = i6 & (-57345);
                                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                            modifier2 = modifier;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1226895970, i5, i10, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderComposable (GenericLadder.kt:72)");
                                        }
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        SnapshotState snapshotState13 = (SnapshotState) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        Modifier modifier7 = modifier2;
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        final SnapshotState snapshotState14 = (SnapshotState) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceGroup();
                                        final Float f5 = (Float) snapshotState13.getValue();
                                        Float f6 = (Float) snapshotState14.getValue();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            snapshotState = snapshotState13;
                                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(BigDecimal.ZERO, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                            objRememberedValue3 = snapshotStateMutableStateOf$default;
                                        } else {
                                            snapshotState = snapshotState13;
                                        }
                                        SnapshotState snapshotState15 = (SnapshotState) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(BigDecimal.ZERO, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        SnapshotState snapshotState16 = (SnapshotState) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue5 == companion.getEmpty()) {
                                            snapshotState2 = snapshotState16;
                                            objRememberedValue5 = SnapshotState3.mutableStateOf$default(BigDecimal.ZERO, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        } else {
                                            snapshotState2 = snapshotState16;
                                        }
                                        SnapshotState snapshotState17 = (SnapshotState) objRememberedValue5;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue6 == companion.getEmpty()) {
                                            snapshotState3 = snapshotState17;
                                            objRememberedValue6 = SnapshotState3.mutableStateOf$default(BigDecimal.ZERO, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        } else {
                                            snapshotState3 = snapshotState17;
                                        }
                                        snapshotState4 = (SnapshotState) objRememberedValue6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        i11 = (57344 & i10) ^ 24576;
                                        if (i11 <= 16384 || !composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) {
                                            snapshotState5 = snapshotState4;
                                            if ((i10 & 24576) != 16384) {
                                                z = false;
                                            }
                                            zChangedInstance = z | composerStartRestartGroup.changedInstance(ladderData);
                                            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance || objRememberedValue12 == companion.getEmpty()) {
                                                snapshotState6 = snapshotState;
                                                f = f6;
                                                i12 = i11;
                                                composer2 = composerStartRestartGroup;
                                                LazyListState lazyListState6 = lazyListStateRememberLazyListState;
                                                i13 = i5;
                                                snapshotState7 = snapshotState15;
                                                snapshotState8 = snapshotState2;
                                                snapshotState9 = snapshotState3;
                                                snapshotState10 = snapshotState5;
                                                modifier3 = modifier7;
                                                genericLadderKt$GenericLadderComposable$1$1 = new GenericLadderKt$GenericLadderComposable$1$1(lazyListState6, ladderData, snapshotState7, snapshotState8, snapshotState9, snapshotState10, null);
                                                lazyListState2 = lazyListState6;
                                                ladderData2 = ladderData;
                                                composer2.updateRememberedValue(genericLadderKt$GenericLadderComposable$1$1);
                                            } else {
                                                snapshotState6 = snapshotState;
                                                ladderData2 = ladderData;
                                                i12 = i11;
                                                genericLadderKt$GenericLadderComposable$1$1 = objRememberedValue12;
                                                composer2 = composerStartRestartGroup;
                                                lazyListState2 = lazyListStateRememberLazyListState;
                                                f = f6;
                                                i13 = i5;
                                                snapshotState7 = snapshotState15;
                                                snapshotState8 = snapshotState2;
                                                snapshotState9 = snapshotState3;
                                                snapshotState10 = snapshotState5;
                                                modifier3 = modifier7;
                                            }
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(lazyListState2, ladderData2, (Function2) genericLadderKt$GenericLadderComposable$1$1, composer2, ((i10 >> 12) & 14) | ((i13 << 3) & 112));
                                            Map<Integer, LadderState.LadderData.QuantityBar> visibleAskQuantityBars = ladderData2.getVisibleAskQuantityBars();
                                            composer2.startReplaceGroup(5004770);
                                            zChanged = composer2.changed(visibleAskQuantityBars);
                                            objRememberedValue7 = composer2.rememberedValue();
                                            if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                                                objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return GenericLadderKt.GenericLadderComposable$lambda$17$lambda$16(ladderData2, ladderGestureConfiguration, snapshotState7, snapshotState8);
                                                    }
                                                });
                                                composer2.updateRememberedValue(objRememberedValue7);
                                            }
                                            final SnapshotState4 snapshotState45 = (SnapshotState4) objRememberedValue7;
                                            composer2.endReplaceGroup();
                                            Map<Integer, LadderState.LadderData.QuantityBar> visibleBidQuantityBars = ladderData2.getVisibleBidQuantityBars();
                                            composer2.startReplaceGroup(5004770);
                                            zChanged2 = composer2.changed(visibleBidQuantityBars);
                                            objRememberedValue8 = composer2.rememberedValue();
                                            if (!zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                                                objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return GenericLadderKt.GenericLadderComposable$lambda$21$lambda$20(ladderData2, ladderGestureConfiguration, snapshotState9, snapshotState10);
                                                    }
                                                });
                                                composer2.updateRememberedValue(objRememberedValue8);
                                            }
                                            SnapshotState4 snapshotState46 = (SnapshotState4) objRememberedValue8;
                                            composer2.endReplaceGroup();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier3);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceGroup(-1253406301);
                                            if (immutableMap == null) {
                                                final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                                                ImmutableSet immutableSet = (ImmutableSet) immutableMap.keySet();
                                                composer2.startReplaceGroup(5004770);
                                                boolean zChanged3 = composer2.changed(immutableSet);
                                                Object objRememberedValue13 = composer2.rememberedValue();
                                                if (zChanged3 || objRememberedValue13 == companion.getEmpty()) {
                                                    objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$24$lambda$23(immutableMap);
                                                        }
                                                    });
                                                    composer2.updateRememberedValue(objDerivedStateOf);
                                                } else {
                                                    objDerivedStateOf = objRememberedValue13;
                                                }
                                                final SnapshotState4 snapshotState47 = (SnapshotState4) objDerivedStateOf;
                                                composer2.endReplaceGroup();
                                                List<Integer> listGenericLadderComposable$lambda$47$lambda$25 = GenericLadderComposable$lambda$47$lambda$25(snapshotState47);
                                                composer2.startReplaceGroup(-1633490746);
                                                boolean zChanged4 = composer2.changed(snapshotState47) | ((i12 > 16384 && composer2.changed(lazyListState2)) || (i10 & 24576) == 16384);
                                                Object objRememberedValue14 = composer2.rememberedValue();
                                                if (zChanged4 || objRememberedValue14 == companion.getEmpty()) {
                                                    objRememberedValue14 = new GenericLadderKt$GenericLadderComposable$2$1$1(snapshotState47, lazyListState2, null);
                                                    composer2.updateRememberedValue(objRememberedValue14);
                                                }
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(listGenericLadderComposable$lambda$47$lambda$25, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer2, 0);
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue15 = composer2.rememberedValue();
                                                if (objRememberedValue15 == companion.getEmpty()) {
                                                    objRememberedValue15 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda9
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$28$lambda$27((LadderCustomGestureDetector3) obj);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue15);
                                                }
                                                Function1 function1 = (Function1) objRememberedValue15;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue16 = composer2.rememberedValue();
                                                if (objRememberedValue16 == companion.getEmpty()) {
                                                    objRememberedValue16 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda10
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$30$lambda$29((LadderState.LadderData.SelectedPendingOrders) obj);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue16);
                                                }
                                                Function1 function12 = (Function1) objRememberedValue16;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue17 = composer2.rememberedValue();
                                                if (objRememberedValue17 == companion.getEmpty()) {
                                                    objRememberedValue17 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda11
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$32$lambda$31(((Integer) obj).intValue());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue17);
                                                }
                                                Function1 function13 = (Function1) objRememberedValue17;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue18 = composer2.rememberedValue();
                                                if (objRememberedValue18 == companion.getEmpty()) {
                                                    objRememberedValue18 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda12
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$34$lambda$33(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue18);
                                                }
                                                Function2 function2 = (Function2) objRememberedValue18;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1633490746);
                                                Object objRememberedValue19 = composer2.rememberedValue();
                                                if (objRememberedValue19 == companion.getEmpty()) {
                                                    objRememberedValue19 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda13
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$36$lambda$35(snapshotState6, snapshotState14, (Float) obj, (Float) obj2);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue19);
                                                }
                                                Function2 function22 = (Function2) objRememberedValue19;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1224400529);
                                                Float f7 = f;
                                                boolean zChanged5 = ((i13 & 896) == 256) | composer2.changed(snapshotState47) | composer2.changed(f7) | composer2.changed(f5) | composer2.changedInstance(ladderData2) | composer2.changed(snapshotState45) | composer2.changed(snapshotState46) | composer2.changed(lazyListStateRememberLazyListState2);
                                                Object objRememberedValue20 = composer2.rememberedValue();
                                                if (zChanged5 || objRememberedValue20 == companion.getEmpty()) {
                                                    final LadderState.LadderData ladderData4 = ladderData2;
                                                    lazyListState3 = lazyListState2;
                                                    f4 = f7;
                                                    snapshotState44 = snapshotState46;
                                                    Function1 function14 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda14
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$40$lambda$39(snapshotState47, f4, f5, ladderGestureConfiguration, ladderData4, lazyListStateRememberLazyListState2, snapshotState45, snapshotState44, (LadderLazyListScope) obj);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(function14);
                                                    objRememberedValue20 = function14;
                                                } else {
                                                    lazyListState3 = lazyListState2;
                                                    f4 = f7;
                                                    snapshotState44 = snapshotState46;
                                                }
                                                composer2.endReplaceGroup();
                                                int i27 = i13 << 12;
                                                i16 = i13;
                                                i15 = i10;
                                                f2 = f4;
                                                modifier4 = modifier3;
                                                snapshotState11 = snapshotState14;
                                                snapshotState43 = snapshotState45;
                                                snapshotState42 = snapshotState44;
                                                snapshotState12 = snapshotState6;
                                                i14 = i12;
                                                boxScopeInstance = boxScopeInstance2;
                                                f3 = f5;
                                                ladderData3 = ladderData;
                                                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn(ladderData3, ladderGestureConfiguration, lazyListStateRememberLazyListState2, function1, function12, function13, function2, onZoomStateChanged, onZoomScaleChanged, function22, null, (Function1) objRememberedValue20, composer2, (i13 & 14) | 807103488 | ((i13 >> 3) & 112) | (29360128 & i27) | (i27 & 234881024), 0, 1024);
                                            } else {
                                                ladderData3 = ladderData2;
                                                lazyListState3 = lazyListState2;
                                                snapshotState42 = snapshotState46;
                                                snapshotState43 = snapshotState45;
                                                boxScopeInstance = boxScopeInstance2;
                                                snapshotState11 = snapshotState14;
                                                snapshotState12 = snapshotState6;
                                                i14 = i12;
                                                i15 = i10;
                                                modifier4 = modifier3;
                                                f2 = f;
                                                f3 = f5;
                                                i16 = i13;
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierAlpha = Alpha.alpha(companion4, immutableMap == null ? 0.0f : 1.0f);
                                            composer2.startReplaceGroup(-1633490746);
                                            objRememberedValue9 = composer2.rememberedValue();
                                            if (objRememberedValue9 == companion.getEmpty()) {
                                                final SnapshotState snapshotState18 = snapshotState12;
                                                final SnapshotState snapshotState19 = snapshotState11;
                                                objRememberedValue9 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda15
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$42$lambda$41(snapshotState18, snapshotState19, (Float) obj, (Float) obj2);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue9);
                                            }
                                            Function2 function23 = (Function2) objRememberedValue9;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-1224400529);
                                            final Float f8 = f2;
                                            final Float f9 = f3;
                                            final SnapshotState4 snapshotState48 = snapshotState43;
                                            final SnapshotState4 snapshotState49 = snapshotState42;
                                            boolean zChangedInstance3 = composer2.changedInstance(ladderData3) | composer2.changed(f8) | composer2.changed(f9) | composer2.changed(snapshotState48) | composer2.changed(snapshotState49);
                                            i17 = i14;
                                            final LazyListState lazyListState7 = lazyListState3;
                                            if (i17 > 16384 || !composer2.changed(lazyListState7)) {
                                                i18 = i15;
                                                if ((i18 & 24576) != 16384) {
                                                    z2 = false;
                                                }
                                                z3 = zChangedInstance3 | z2 | ((i16 & 458752) == 131072) | ((i18 & 112) == 32) | ((i18 & 896) == 256) | ((i16 & 3670016) == 1048576) | ((i18 & 14) == 4);
                                                objRememberedValue10 = composer2.rememberedValue();
                                                if (z3 || objRememberedValue10 == companion.getEmpty()) {
                                                    i19 = i17;
                                                    modifier5 = modifierAlpha;
                                                    i20 = i18;
                                                    Function1 function15 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$45$lambda$44(ladderData, f8, f9, lazyListState7, onRowClicked, onStartOrderClicked, onEndOrderClicked, onPendingOrderSelected, onPendingOrderClicked, snapshotState48, snapshotState49, (LadderLazyListScope) obj);
                                                        }
                                                    };
                                                    lazyListState4 = lazyListState7;
                                                    composer2.updateRememberedValue(function15);
                                                    objRememberedValue10 = function15;
                                                } else {
                                                    i19 = i17;
                                                    lazyListState4 = lazyListState7;
                                                    modifier5 = modifierAlpha;
                                                    i20 = i18;
                                                }
                                                composer2.endReplaceGroup();
                                                int i28 = i16 >> 9;
                                                int i29 = (i16 & 14) | 805306368 | ((i16 >> 3) & 112) | ((i20 >> 6) & 896) | ((i16 >> 12) & 7168) | (57344 & (i16 >> 6)) | (458752 & i28) | (i28 & 3670016);
                                                int i30 = i16 << 12;
                                                int i31 = i29 | (29360128 & i30) | (i30 & 234881024);
                                                int i32 = i20;
                                                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn(ladderData, ladderGestureConfiguration, lazyListState4, onPendingOrderDragDirectionChanged, onPendingOrderSelected, onPendingOrderDraggedOverRowChanged, onPendingOrderDragEnded, onZoomStateChanged, onZoomScaleChanged, function23, modifier5, (Function1) objRememberedValue10, composer2, i31, 0, 0);
                                                LadderState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
                                                composer2.startReplaceGroup(-1633490746);
                                                zChangedInstance2 = composer2.changedInstance(ladderData) | ((i19 <= 16384 && composer2.changed(lazyListState4)) || (i32 & 24576) == 16384);
                                                objRememberedValue11 = composer2.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                                                    objRememberedValue11 = new GenericLadderKt$GenericLadderComposable$2$10$1(ladderData, lazyListState4, null);
                                                    composer2.updateRememberedValue(objRememberedValue11);
                                                }
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(selectedRow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer2, 0);
                                                ZoomToast(ladderData.getZoomDisplay(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), composer2, StringResource.$stable, 0);
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                lazyListState5 = lazyListState4;
                                                modifier6 = modifier4;
                                            } else {
                                                i18 = i15;
                                            }
                                            z2 = true;
                                            z3 = zChangedInstance3 | z2 | ((i16 & 458752) == 131072) | ((i18 & 112) == 32) | ((i18 & 896) == 256) | ((i16 & 3670016) == 1048576) | ((i18 & 14) == 4);
                                            objRememberedValue10 = composer2.rememberedValue();
                                            if (z3) {
                                                i19 = i17;
                                                modifier5 = modifierAlpha;
                                                i20 = i18;
                                                Function1 function152 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$45$lambda$44(ladderData, f8, f9, lazyListState7, onRowClicked, onStartOrderClicked, onEndOrderClicked, onPendingOrderSelected, onPendingOrderClicked, snapshotState48, snapshotState49, (LadderLazyListScope) obj);
                                                    }
                                                };
                                                lazyListState4 = lazyListState7;
                                                composer2.updateRememberedValue(function152);
                                                objRememberedValue10 = function152;
                                                composer2.endReplaceGroup();
                                                int i282 = i16 >> 9;
                                                int i292 = (i16 & 14) | 805306368 | ((i16 >> 3) & 112) | ((i20 >> 6) & 896) | ((i16 >> 12) & 7168) | (57344 & (i16 >> 6)) | (458752 & i282) | (i282 & 3670016);
                                                int i302 = i16 << 12;
                                                int i312 = i292 | (29360128 & i302) | (i302 & 234881024);
                                                int i322 = i20;
                                                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn(ladderData, ladderGestureConfiguration, lazyListState4, onPendingOrderDragDirectionChanged, onPendingOrderSelected, onPendingOrderDraggedOverRowChanged, onPendingOrderDragEnded, onZoomStateChanged, onZoomScaleChanged, function23, modifier5, (Function1) objRememberedValue10, composer2, i312, 0, 0);
                                                LadderState.LadderData.SelectedRow selectedRow2 = ladderData.getSelectedRow();
                                                composer2.startReplaceGroup(-1633490746);
                                                if (i19 <= 16384) {
                                                    zChangedInstance2 = composer2.changedInstance(ladderData) | ((i19 <= 16384 && composer2.changed(lazyListState4)) || (i322 & 24576) == 16384);
                                                    objRememberedValue11 = composer2.rememberedValue();
                                                    if (zChangedInstance2) {
                                                        objRememberedValue11 = new GenericLadderKt$GenericLadderComposable$2$10$1(ladderData, lazyListState4, null);
                                                        composer2.updateRememberedValue(objRememberedValue11);
                                                        composer2.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(selectedRow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer2, 0);
                                                        ZoomToast(ladderData.getZoomDisplay(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), composer2, StringResource.$stable, 0);
                                                        composer2.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        lazyListState5 = lazyListState4;
                                                        modifier6 = modifier4;
                                                    }
                                                } else {
                                                    zChangedInstance2 = composer2.changedInstance(ladderData) | ((i19 <= 16384 && composer2.changed(lazyListState4)) || (i322 & 24576) == 16384);
                                                    objRememberedValue11 = composer2.rememberedValue();
                                                    if (zChangedInstance2) {
                                                    }
                                                }
                                            }
                                        } else {
                                            snapshotState5 = snapshotState4;
                                        }
                                        z = true;
                                        zChangedInstance = z | composerStartRestartGroup.changedInstance(ladderData);
                                        Object objRememberedValue122 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance) {
                                            snapshotState6 = snapshotState;
                                            f = f6;
                                            i12 = i11;
                                            composer2 = composerStartRestartGroup;
                                            LazyListState lazyListState62 = lazyListStateRememberLazyListState;
                                            i13 = i5;
                                            snapshotState7 = snapshotState15;
                                            snapshotState8 = snapshotState2;
                                            snapshotState9 = snapshotState3;
                                            snapshotState10 = snapshotState5;
                                            modifier3 = modifier7;
                                            genericLadderKt$GenericLadderComposable$1$1 = new GenericLadderKt$GenericLadderComposable$1$1(lazyListState62, ladderData, snapshotState7, snapshotState8, snapshotState9, snapshotState10, null);
                                            lazyListState2 = lazyListState62;
                                            ladderData2 = ladderData;
                                            composer2.updateRememberedValue(genericLadderKt$GenericLadderComposable$1$1);
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(lazyListState2, ladderData2, (Function2) genericLadderKt$GenericLadderComposable$1$1, composer2, ((i10 >> 12) & 14) | ((i13 << 3) & 112));
                                            Map<Integer, LadderState.LadderData.QuantityBar> visibleAskQuantityBars2 = ladderData2.getVisibleAskQuantityBars();
                                            composer2.startReplaceGroup(5004770);
                                            zChanged = composer2.changed(visibleAskQuantityBars2);
                                            objRememberedValue7 = composer2.rememberedValue();
                                            if (!zChanged) {
                                                objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return GenericLadderKt.GenericLadderComposable$lambda$17$lambda$16(ladderData2, ladderGestureConfiguration, snapshotState7, snapshotState8);
                                                    }
                                                });
                                                composer2.updateRememberedValue(objRememberedValue7);
                                                final SnapshotState4 snapshotState452 = (SnapshotState4) objRememberedValue7;
                                                composer2.endReplaceGroup();
                                                Map<Integer, LadderState.LadderData.QuantityBar> visibleBidQuantityBars2 = ladderData2.getVisibleBidQuantityBars();
                                                composer2.startReplaceGroup(5004770);
                                                zChanged2 = composer2.changed(visibleBidQuantityBars2);
                                                objRememberedValue8 = composer2.rememberedValue();
                                                if (!zChanged2) {
                                                    objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return GenericLadderKt.GenericLadderComposable$lambda$21$lambda$20(ladderData2, ladderGestureConfiguration, snapshotState9, snapshotState10);
                                                        }
                                                    });
                                                    composer2.updateRememberedValue(objRememberedValue8);
                                                    SnapshotState4 snapshotState462 = (SnapshotState4) objRememberedValue8;
                                                    composer2.endReplaceGroup();
                                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier3);
                                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl.getInserting()) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                        composer2.startReplaceGroup(-1253406301);
                                                        if (immutableMap == null) {
                                                        }
                                                        composer2.endReplaceGroup();
                                                        Modifier.Companion companion42 = Modifier.INSTANCE;
                                                        Modifier modifierAlpha2 = Alpha.alpha(companion42, immutableMap == null ? 0.0f : 1.0f);
                                                        composer2.startReplaceGroup(-1633490746);
                                                        objRememberedValue9 = composer2.rememberedValue();
                                                        if (objRememberedValue9 == companion.getEmpty()) {
                                                        }
                                                        Function2 function232 = (Function2) objRememberedValue9;
                                                        composer2.endReplaceGroup();
                                                        composer2.startReplaceGroup(-1224400529);
                                                        final Float f82 = f2;
                                                        final Float f92 = f3;
                                                        final SnapshotState4 snapshotState482 = snapshotState43;
                                                        final SnapshotState4 snapshotState492 = snapshotState42;
                                                        boolean zChangedInstance32 = composer2.changedInstance(ladderData3) | composer2.changed(f82) | composer2.changed(f92) | composer2.changed(snapshotState482) | composer2.changed(snapshotState492);
                                                        i17 = i14;
                                                        final LazyListState lazyListState72 = lazyListState3;
                                                        if (i17 > 16384) {
                                                            i18 = i15;
                                                            if ((i18 & 24576) != 16384) {
                                                                z2 = true;
                                                            }
                                                            z3 = zChangedInstance32 | z2 | ((i16 & 458752) == 131072) | ((i18 & 112) == 32) | ((i18 & 896) == 256) | ((i16 & 3670016) == 1048576) | ((i18 & 14) == 4);
                                                            objRememberedValue10 = composer2.rememberedValue();
                                                            if (z3) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i6 &= -57345;
                                        }
                                    }
                                    modifier2 = modifier;
                                    i10 = i6;
                                    lazyListStateRememberLazyListState = lazyListState;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState132 = (SnapshotState) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    Modifier modifier72 = modifier2;
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    final SnapshotState snapshotState142 = (SnapshotState) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final Float f52 = (Float) snapshotState132.getValue();
                                    Float f62 = (Float) snapshotState142.getValue();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState152 = (SnapshotState) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState162 = (SnapshotState) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState172 = (SnapshotState) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    snapshotState4 = (SnapshotState) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    i11 = (57344 & i10) ^ 24576;
                                    if (i11 <= 16384) {
                                        snapshotState5 = snapshotState4;
                                        if ((i10 & 24576) != 16384) {
                                            z = true;
                                        }
                                        zChangedInstance = z | composerStartRestartGroup.changedInstance(ladderData);
                                        Object objRememberedValue1222 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance) {
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return GenericLadderKt.GenericLadderComposable$lambda$48(ladderData, immutableMap, ladderGestureConfiguration, onZoomStateChanged, onZoomScaleChanged, onRowClicked, onPendingOrderSelected, onPendingOrderDragDirectionChanged, onPendingOrderDraggedOverRowChanged, onPendingOrderDragEnded, onPendingOrderClicked, onStartOrderClicked, onEndOrderClicked, modifier6, lazyListState5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 3072;
                            i9 = i8;
                            if ((i7 & 24576) == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    modifier = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 16384) == 0) {
                                        modifier2 = modifier;
                                        i10 = i6;
                                        lazyListStateRememberLazyListState = lazyListState;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState1322 = (SnapshotState) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    Modifier modifier722 = modifier2;
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    final SnapshotState snapshotState1422 = (SnapshotState) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final Float f522 = (Float) snapshotState1322.getValue();
                                    Float f622 = (Float) snapshotState1422.getValue();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState1522 = (SnapshotState) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState1622 = (SnapshotState) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    SnapshotState snapshotState1722 = (SnapshotState) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    snapshotState4 = (SnapshotState) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    i11 = (57344 & i10) ^ 24576;
                                    if (i11 <= 16384) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i26 |= i21;
                        i5 = i26;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                        }
                        if ((i7 & 24576) == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i26 |= i22;
                    if ((i3 & 512) == 0) {
                    }
                    i26 |= i21;
                    i5 = i26;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    if ((i7 & 24576) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i26 |= i23;
                if ((i3 & 256) != 0) {
                }
                i26 |= i22;
                if ((i3 & 512) == 0) {
                }
                i26 |= i21;
                i5 = i26;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i7 & 24576) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i26 |= i24;
            if ((i3 & 128) == 0) {
            }
            i26 |= i23;
            if ((i3 & 256) != 0) {
            }
            i26 |= i22;
            if ((i3 & 512) == 0) {
            }
            i26 |= i21;
            i5 = i26;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i7 & 24576) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i26 |= i25;
        if ((i3 & 64) != 0) {
        }
        i26 |= i24;
        if ((i3 & 128) == 0) {
        }
        i26 |= i23;
        if ((i3 & 256) != 0) {
        }
        i26 |= i22;
        if ((i3 & 512) == 0) {
        }
        i26 |= i21;
        i5 = i26;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i7 & 24576) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final BigDecimal GenericLadderComposable$lambda$12(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableMap<Integer, LadderState.LadderData.QuantityBar> GenericLadderComposable$lambda$18(SnapshotState4<? extends ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableMap<Integer, LadderState.LadderData.QuantityBar> GenericLadderComposable$lambda$22(SnapshotState4<? extends ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final BigDecimal GenericLadderComposable$lambda$3(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> GenericLadderComposable$lambda$47$lambda$25(SnapshotState4<? extends List<Integer>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final BigDecimal GenericLadderComposable$lambda$6(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    private static final BigDecimal GenericLadderComposable$lambda$9(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderState.LadderData GenericLadderPreview$lambda$54(SnapshotState<LadderState.LadderData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableMap GenericLadderComposable$lambda$17$lambda$16(LadderState.LadderData ladderData, LadderGestureConfiguration ladderGestureConfiguration, SnapshotState snapshotState, SnapshotState snapshotState2) {
        float fCalculateFractionalWidth;
        Map<Integer, LadderState.LadderData.QuantityBar> visibleAskQuantityBars = ladderData.getVisibleAskQuantityBars();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(visibleAskQuantityBars.size()));
        Iterator<T> it = visibleAskQuantityBars.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            LadderState.LadderData.QuantityBar quantityBar = (LadderState.LadderData.QuantityBar) entry.getValue();
            LadderState.LadderData.QuantityBar quantityBar2 = (LadderState.LadderData.QuantityBar) entry.getValue();
            Float quantityFraction = quantityBar.getQuantityFraction();
            if (quantityFraction != null) {
                fCalculateFractionalWidth = quantityFraction.floatValue();
            } else {
                float defaultQuantityBarSize = ladderGestureConfiguration.getDefaultQuantityBarSize();
                float minQuantityBarSize = ladderGestureConfiguration.getMinQuantityBarSize();
                BigDecimal quantity = quantityBar.getQuantity();
                BigDecimal bigDecimalGenericLadderComposable$lambda$3 = GenericLadderComposable$lambda$3(snapshotState);
                Intrinsics.checkNotNullExpressionValue(bigDecimalGenericLadderComposable$lambda$3, "GenericLadderComposable$lambda$3(...)");
                BigDecimal bigDecimalGenericLadderComposable$lambda$6 = GenericLadderComposable$lambda$6(snapshotState2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalGenericLadderComposable$lambda$6, "GenericLadderComposable$lambda$6(...)");
                fCalculateFractionalWidth = QuantityBarWidth.calculateFractionalWidth(defaultQuantityBarSize, minQuantityBarSize, quantity, bigDecimalGenericLadderComposable$lambda$3, bigDecimalGenericLadderComposable$lambda$6);
            }
            linkedHashMap.put(key, LadderState.LadderData.QuantityBar.copy$default(quantityBar2, null, null, Float.valueOf(fCalculateFractionalWidth), 0.0f, 11, null));
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableMap GenericLadderComposable$lambda$21$lambda$20(LadderState.LadderData ladderData, LadderGestureConfiguration ladderGestureConfiguration, SnapshotState snapshotState, SnapshotState snapshotState2) {
        float fCalculateFractionalWidth;
        Map<Integer, LadderState.LadderData.QuantityBar> visibleBidQuantityBars = ladderData.getVisibleBidQuantityBars();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(visibleBidQuantityBars.size()));
        Iterator<T> it = visibleBidQuantityBars.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            LadderState.LadderData.QuantityBar quantityBar = (LadderState.LadderData.QuantityBar) entry.getValue();
            LadderState.LadderData.QuantityBar quantityBar2 = (LadderState.LadderData.QuantityBar) entry.getValue();
            Float quantityFraction = quantityBar.getQuantityFraction();
            if (quantityFraction != null) {
                fCalculateFractionalWidth = quantityFraction.floatValue();
            } else {
                float defaultQuantityBarSize = ladderGestureConfiguration.getDefaultQuantityBarSize();
                float minQuantityBarSize = ladderGestureConfiguration.getMinQuantityBarSize();
                BigDecimal quantity = quantityBar.getQuantity();
                BigDecimal bigDecimalGenericLadderComposable$lambda$9 = GenericLadderComposable$lambda$9(snapshotState);
                Intrinsics.checkNotNullExpressionValue(bigDecimalGenericLadderComposable$lambda$9, "GenericLadderComposable$lambda$9(...)");
                BigDecimal bigDecimalGenericLadderComposable$lambda$12 = GenericLadderComposable$lambda$12(snapshotState2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalGenericLadderComposable$lambda$12, "GenericLadderComposable$lambda$12(...)");
                fCalculateFractionalWidth = QuantityBarWidth.calculateFractionalWidth(defaultQuantityBarSize, minQuantityBarSize, quantity, bigDecimalGenericLadderComposable$lambda$9, bigDecimalGenericLadderComposable$lambda$12);
            }
            linkedHashMap.put(key, LadderState.LadderData.QuantityBar.copy$default(quantityBar2, null, null, Float.valueOf(fCalculateFractionalWidth), 0.0f, 11, null));
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List GenericLadderComposable$lambda$47$lambda$24$lambda$23(ImmutableMap immutableMap) {
        return CollectionsKt.sorted(CollectionsKt.toList(immutableMap.keySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$30$lambda$29(LadderState.LadderData.SelectedPendingOrders it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$28$lambda$27(LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$32$lambda$31(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$34$lambda$33(boolean z, boolean z2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$36$lambda$35(SnapshotState snapshotState, SnapshotState snapshotState2, Float f, Float f2) {
        snapshotState.setValue(f);
        snapshotState2.setValue(f2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$40$lambda$39(SnapshotState4 snapshotState4, final Float f, final Float f2, final LadderGestureConfiguration ladderGestureConfiguration, final LadderState.LadderData ladderData, final LazyListState lazyListState, final SnapshotState4 snapshotState42, final SnapshotState4 snapshotState43, LadderLazyListScope LadderGestureAwareLazyColumn) {
        Intrinsics.checkNotNullParameter(LadderGestureAwareLazyColumn, "$this$LadderGestureAwareLazyColumn");
        final List<Integer> listGenericLadderComposable$lambda$47$lambda$25 = GenericLadderComposable$lambda$47$lambda$25(snapshotState4);
        final Function1 function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
        };
        final C40902x3d2ffbd c40902x3d2ffbd = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$lambda$47$lambda$40$lambda$39$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Integer num) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Integer) obj);
            }
        };
        LadderGestureAwareLazyColumn.items(listGenericLadderComposable$lambda$47$lambda$25.size(), new Function1<Integer, Object>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$lambda$47$lambda$40$lambda$39$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(listGenericLadderComposable$lambda$47$lambda$25.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$lambda$47$lambda$40$lambda$39$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c40902x3d2ffbd.invoke(listGenericLadderComposable$lambda$47$lambda$25.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$lambda$47$lambda$40$lambda$39$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final int iIntValue = ((Number) listGenericLadderComposable$lambda$47$lambda$25.get(i)).intValue();
                composer.startReplaceGroup(1172525620);
                Float f3 = f;
                Float f4 = f2;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(ladderGestureConfiguration.getZoomSensitivity());
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(ladderGestureConfiguration.getZoomInfluenceRange());
                float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(ladderGestureConfiguration.getZoomDeadZoneRadius());
                final LadderState.LadderData ladderData2 = ladderData;
                final LazyListState lazyListState2 = lazyListState;
                final SnapshotState4 snapshotState44 = snapshotState42;
                final SnapshotState4 snapshotState45 = snapshotState43;
                Zoomable.m26092ZoomableeiMxS0Y(f3, f4, null, fM7995constructorimpl, fM7995constructorimpl2, fM7995constructorimpl3, ComposableLambda3.rememberComposableLambda(-548280151, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$7$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-548280151, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadder.kt:184)");
                        }
                        LadderState.LadderData ladderData3 = ladderData2;
                        int i5 = iIntValue;
                        boolean animateQuantityBarsEntry = ladderData3.getAnimateQuantityBarsEntry();
                        boolean shortenQuantityBarValues = ladderData2.getShortenQuantityBarValues();
                        ImmutableMap immutableMapGenericLadderComposable$lambda$18 = GenericLadderKt.GenericLadderComposable$lambda$18(snapshotState44);
                        ImmutableMap immutableMapGenericLadderComposable$lambda$22 = GenericLadderKt.GenericLadderComposable$lambda$22(snapshotState45);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(lazyListState2);
                        final LazyListState lazyListState3 = lazyListState2;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Integer>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$7$1$2$1$1$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Integer invoke() {
                                    return Integer.valueOf(lazyListState3.getFirstVisibleItemIndex() + (lazyListState3.getLayoutInfo().getVisibleItemsInfo().size() / 2));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        LadderRowKt.LadderRow(ladderData3, i5, animateQuantityBarsEntry, shortenQuantityBarValues, immutableMapGenericLadderComposable$lambda$18, immutableMapGenericLadderComposable$lambda$22, (Function0) objRememberedValue, null, null, null, null, null, null, null, composer2, 0, 0, 16256);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1572864, 4);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$42$lambda$41(SnapshotState snapshotState, SnapshotState snapshotState2, Float f, Float f2) {
        snapshotState.setValue(f);
        snapshotState2.setValue(f2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderComposable$lambda$47$lambda$45$lambda$44(final LadderState.LadderData ladderData, final Float f, final Float f2, final LazyListState lazyListState, final Function1 function1, final Function3 function3, final Function3 function32, final Function1 function12, final Function1 function13, final SnapshotState4 snapshotState4, final SnapshotState4 snapshotState42, final LadderLazyListScope LadderGestureAwareLazyColumn) {
        Intrinsics.checkNotNullParameter(LadderGestureAwareLazyColumn, "$this$LadderGestureAwareLazyColumn");
        final LadderPriceLevels ladderPriceLevels = ladderData.getLadderPriceLevels();
        LazyListScope.items$default(LadderGestureAwareLazyColumn, ladderPriceLevels.getNumRows(), new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GenericLadderKt.GenericLadderComposable$lambda$47$lambda$45$lambda$44$lambda$43(ladderPriceLevels, ((Integer) obj).intValue());
            }
        }, null, ComposableLambda3.composableLambdaInstance(-1563228658, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i3 = i2 | (composer.changed(i) ? 32 : 16);
                } else {
                    i3 = i2;
                }
                if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1563228658, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadder.kt:228)");
                }
                Zoomable.m26092ZoomableeiMxS0Y(f, f2, null, 0.0f, 0.0f, 0.0f, ComposableLambda3.rememberComposableLambda(1129131342, true, new C409171(ladderData, i, lazyListState, function1, function3, function32, function12, function13, LadderGestureAwareLazyColumn, snapshotState4, snapshotState42), composer, 54), composer, 1572864, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: GenericLadder.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2$1 */
            static final class C409171 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ int $index;
                final /* synthetic */ LadderState.LadderData $ladderData;
                final /* synthetic */ LadderLazyListScope $listScope;
                final /* synthetic */ LazyListState $listState;
                final /* synthetic */ Function3<Integer, OrderType, OrderTrigger, Unit> $onEndOrderClicked;
                final /* synthetic */ Function1<LadderState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderClicked;
                final /* synthetic */ Function1<LadderState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderSelected;
                final /* synthetic */ Function1<Integer, Unit> $onRowClicked;
                final /* synthetic */ Function3<Integer, OrderType, OrderTrigger, Unit> $onStartOrderClicked;
                final /* synthetic */ SnapshotState4<ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> $visibleAskQuantityBars$delegate;
                final /* synthetic */ SnapshotState4<ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> $visibleBigQuantityBars$delegate;

                /* JADX WARN: Multi-variable type inference failed */
                C409171(LadderState.LadderData ladderData, int i, LazyListState lazyListState, Function1<? super Integer, Unit> function1, Function3<? super Integer, ? super OrderType, ? super OrderTrigger, Unit> function3, Function3<? super Integer, ? super OrderType, ? super OrderTrigger, Unit> function32, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function12, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function13, LadderLazyListScope ladderLazyListScope, SnapshotState4<? extends ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> snapshotState4, SnapshotState4<? extends ImmutableMap<Integer, LadderState.LadderData.QuantityBar>> snapshotState42) {
                    this.$ladderData = ladderData;
                    this.$index = i;
                    this.$listState = lazyListState;
                    this.$onRowClicked = function1;
                    this.$onStartOrderClicked = function3;
                    this.$onEndOrderClicked = function32;
                    this.$onPendingOrderSelected = function12;
                    this.$onPendingOrderClicked = function13;
                    this.$listScope = ladderLazyListScope;
                    this.$visibleAskQuantityBars$delegate = snapshotState4;
                    this.$visibleBigQuantityBars$delegate = snapshotState42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1129131342, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadder.kt:232)");
                    }
                    ImmutableMap immutableMapGenericLadderComposable$lambda$18 = GenericLadderKt.GenericLadderComposable$lambda$18(this.$visibleAskQuantityBars$delegate);
                    ImmutableMap immutableMapGenericLadderComposable$lambda$22 = GenericLadderKt.GenericLadderComposable$lambda$22(this.$visibleBigQuantityBars$delegate);
                    boolean animateQuantityBarsEntry = this.$ladderData.getAnimateQuantityBarsEntry();
                    boolean shortenQuantityBarValues = this.$ladderData.getShortenQuantityBarValues();
                    LadderState.LadderData ladderData = this.$ladderData;
                    int i2 = this.$index;
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(this.$listState);
                    final LazyListState lazyListState = this.$listState;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005f: CONSTRUCTOR (r10v1 'objRememberedValue' java.lang.Object) = (r9v0 'lazyListState' androidx.compose.foundation.lazy.LazyListState A[DONT_INLINE]) A[MD:(androidx.compose.foundation.lazy.LazyListState):void (m)] (LINE:243) call: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.foundation.lazy.LazyListState):void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 317
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderKt$GenericLadderComposable$2$9$1$2.C409171.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(Function1 function1, int i) {
                        function1.invoke(Integer.valueOf(i));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$1$lambda$0(LazyListState lazyListState) {
                        return lazyListState.getFirstVisibleItemIndex() + (lazyListState.getLayoutInfo().getVisibleItemsInfo().size() / 2);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(Function3 function3, int i, OrderType type2, OrderTrigger trigger) {
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(trigger, "trigger");
                        function3.invoke(Integer.valueOf(i), type2, trigger);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(Function3 function3, int i, OrderType type2, OrderTrigger trigger) {
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(trigger, "trigger");
                        function3.invoke(Integer.valueOf(i), type2, trigger);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8(LadderLazyListScope ladderLazyListScope, LadderState.LadderData.SelectedPendingOrders orders) {
                        Intrinsics.checkNotNullParameter(orders, "orders");
                        ladderLazyListScope.updatePotentialDragTarget(orders);
                        return Unit.INSTANCE;
                    }
                }
            }), 4, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object GenericLadderComposable$lambda$47$lambda$45$lambda$44$lambda$43(LadderPriceLevels ladderPriceLevels, int i) {
            return ladderPriceLevels.getDisplayTopPrice() + "-" + ladderPriceLevels.getDisplayPriceIncrement() + "-" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ZoomToast(final StringResource stringResource, final Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1653343131);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                Modifier modifier2 = modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1653343131, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.ZoomToast (GenericLadder.kt:287)");
                }
                AnimatedVisibilityKt.AnimatedVisibility(stringResource != null, modifier2, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1751459645, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt.ZoomToast.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1751459645, i5, -1, "com.robinhood.shared.tradeladder.ui.ladder.ZoomToast.<anonymous> (GenericLadder.kt:294)");
                        }
                        if (stringResource == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        float f = 20;
                        Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM());
                        BentoText2.m20747BentoText38GnDrw(StringResources5.getText(stringResource, composer2, StringResource.$stable), modifierM5143paddingVpY3zN4, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 200064, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericLadderKt.ZoomToast$lambda$49(stringResource, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        private static final void ZoomToastPreview(Composer composer, final int i) {
            Composer composerStartRestartGroup = composer.startRestartGroup(1057044329);
            if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057044329, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ZoomToastPreview (GenericLadder.kt:319)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$GenericLadderKt.INSTANCE.m26061getLambda$121226975$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericLadderKt.ZoomToastPreview$lambda$50(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        public static final void GenericLadderPreview(Composer composer, final int i) {
            Float fValueOf = Float.valueOf(1.0f);
            Composer composerStartRestartGroup = composer.startRestartGroup(-1555759634);
            if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555759634, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderPreview (GenericLadder.kt:330)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    LadderDisplayMode ladderDisplayMode = LadderDisplayMode.PRICE;
                    BigDecimal TEN = BigDecimal.TEN;
                    Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
                    BigDecimal ONE = BigDecimal.ONE;
                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                    LadderPriceLevels ladderPriceLevels = new LadderPriceLevels(TEN, ONE, new BigDecimal(String.valueOf(0.01d)), 0, null, 24, null);
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke = companion2.invoke("Last Price");
                    Side side = Side.START;
                    Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(0, new LadderState.LadderData.QuantityBar(side, new BigDecimal("100"), fValueOf, 1.0f)), Tuples4.m3642to(1, new LadderState.LadderData.QuantityBar(side, new BigDecimal("100"), fValueOf, 1.0f)));
                    Side side2 = Side.END;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(new LadderState.LadderData(ladderDisplayMode, ladderPriceLevels, new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return String.valueOf(((Integer) obj).intValue());
                        }
                    }, new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return String.valueOf(((Integer) obj).intValue());
                        }
                    }, 1, stringResourceInvoke, mapMapOf, MapsKt.mapOf(Tuples4.m3642to(0, new LadderState.LadderData.QuantityBar(side2, new BigDecimal("100"), fValueOf, 1.0f)), Tuples4.m3642to(1, new LadderState.LadderData.QuantityBar(side2, new BigDecimal("100"), fValueOf, 1.0f))), false, false, MapsKt.emptyMap(), null, null, null, null, new LadderState.LadderData.AverageCostLineData(0, 0.0f), false, companion2.invoke("")), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SnackbarHostState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableLambda3.rememberComposableLambda(293047471, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt.GenericLadderPreview.1

                    /* compiled from: GenericLadder.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<LadderState.LadderData> $state$delegate;

                        AnonymousClass2(SnapshotState<LadderState.LadderData> snapshotState) {
                            this.$state$delegate = snapshotState;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1914857536, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderPreview.<anonymous>.<anonymous> (GenericLadder.kt:403)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), paddingValues);
                            SnapshotState<LadderState.LadderData> snapshotState = this.$state$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            LadderState.LadderData ladder = GenericLadderKt.GenericLadderPreview$lambda$54(snapshotState).getLadder();
                            composer.startReplaceGroup(-746452953);
                            if (ladder != null) {
                                LadderGestureConfiguration ladderGestureConfiguration = new LadderGestureConfiguration(true, 0.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 506, null);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue == companion2.getEmpty()) {
                                    objRememberedValue = new Function3() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$1$lambda$0(((Boolean) obj).booleanValue(), (Integer) obj2, (Integer) obj3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function3 function3 = (Function3) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion2.getEmpty()) {
                                    objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$3$lambda$2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function2 function2 = (Function2) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (objRememberedValue3 == companion2.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$5$lambda$4(((Integer) obj).intValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                Function1 function1 = (Function1) objRememberedValue3;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (objRememberedValue4 == companion2.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$7$lambda$6((LadderState.LadderData.SelectedPendingOrders) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                Function1 function12 = (Function1) objRememberedValue4;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (objRememberedValue5 == companion2.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$9$lambda$8((LadderCustomGestureDetector3) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue5);
                                }
                                Function1 function13 = (Function1) objRememberedValue5;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue6 = composer.rememberedValue();
                                if (objRememberedValue6 == companion2.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$11$lambda$10(((Integer) obj).intValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue6);
                                }
                                Function1 function14 = (Function1) objRememberedValue6;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue7 = composer.rememberedValue();
                                if (objRememberedValue7 == companion2.getEmpty()) {
                                    objRememberedValue7 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$13$lambda$12(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue7);
                                }
                                Function2 function22 = (Function2) objRememberedValue7;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue8 = composer.rememberedValue();
                                if (objRememberedValue8 == companion2.getEmpty()) {
                                    objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$15$lambda$14((LadderState.LadderData.SelectedPendingOrders) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue8);
                                }
                                Function1 function15 = (Function1) objRememberedValue8;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composer.rememberedValue();
                                if (objRememberedValue9 == companion2.getEmpty()) {
                                    objRememberedValue9 = new Function3() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$17$lambda$16(((Integer) obj).intValue(), (OrderType) obj2, (OrderTrigger) obj3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue9);
                                }
                                Function3 function32 = (Function3) objRememberedValue9;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue10 = composer.rememberedValue();
                                if (objRememberedValue10 == companion2.getEmpty()) {
                                    objRememberedValue10 = new Function3() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderPreview$1$2$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            return GenericLadderKt.C409181.AnonymousClass2.invoke$lambda$20$lambda$19$lambda$18(((Integer) obj).intValue(), (OrderType) obj2, (OrderTrigger) obj3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue10);
                                }
                                composer.endReplaceGroup();
                                GenericLadderKt.GenericLadderComposable(ladder, null, ladderGestureConfiguration, function3, function2, function1, function12, function13, function14, function22, function15, function32, (Function3) objRememberedValue10, null, null, composer, 920349744, 438, 24576);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$1$lambda$0(boolean z, Integer num, Integer num2) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$3$lambda$2(int i, int i2) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$5$lambda$4(int i) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$7$lambda$6(LadderState.LadderData.SelectedPendingOrders it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$9$lambda$8(LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$11$lambda$10(int i) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$13$lambda$12(boolean z, boolean z2) {
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$15$lambda$14(LadderState.LadderData.SelectedPendingOrders it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$17$lambda$16(int i, OrderType orderType, OrderTrigger orderTrigger) {
                            Intrinsics.checkNotNullParameter(orderType, "<unused var>");
                            Intrinsics.checkNotNullParameter(orderTrigger, "<unused var>");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$20$lambda$19$lambda$18(int i, OrderType orderType, OrderTrigger orderTrigger) {
                            Intrinsics.checkNotNullParameter(orderType, "<unused var>");
                            Intrinsics.checkNotNullParameter(orderTrigger, "<unused var>");
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(293047471, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderPreview.<anonymous> (GenericLadder.kt:394)");
                        }
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, ComposableLambda3.rememberComposableLambda(-1930342359, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt.GenericLadderPreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1930342359, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderPreview.<anonymous>.<anonymous> (GenericLadder.kt:396)");
                                }
                                SnackbarHostKt.SnackbarHost(snackbarHostState2, null, ComposableSingletons$GenericLadderKt.INSTANCE.getLambda$1257548220$lib_trade_ladder_externalDebug(), composer3, 390, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1914857536, true, new AnonymousClass2(snapshotState), composer2, 54), composer2, 805309440, 503);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericLadderKt.GenericLadderPreview$lambda$56(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
