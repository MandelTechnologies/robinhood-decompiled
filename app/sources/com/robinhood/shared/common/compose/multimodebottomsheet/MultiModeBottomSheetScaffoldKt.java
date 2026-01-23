package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.ColorScheme2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MultiModeBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008b\u0002\u0010\"\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b \u0010!\u001a¼\u0001\u00103\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2'\u0010+\u001a#\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\u0019\u00100\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0003¢\u0006\u0004\b1\u00102\u001a©\u0001\u0010>\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00020\u00002!\u00108\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\r\u001a\u00020\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00152\u0006\u0010;\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0003¢\u0006\u0004\b<\u0010=\u001a#\u0010A\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010@\u001a\u00020\u001aH\u0007¢\u0006\u0004\bA\u0010B\u001aU\u0010H\u001a\u00020#2\b\b\u0002\u0010C\u001a\u00020*2\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170\u00002\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020\u00002\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020*0FH\u0007¢\u0006\u0004\bH\u0010I\u001aY\u0010H\u001a\u00020#2\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0F0J2\b\b\u0002\u0010C\u001a\u00020*2\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170\u00002\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\bH\u0010L\u001aY\u0010M\u001a\u00020#2\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0F0J2\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170\u00002\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010C\u001a\u00020*H\u0001¢\u0006\u0004\bM\u0010N\u001aU\u0010M\u001a\u00020#2\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170\u00002\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010C\u001a\u00020*2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020*0FH\u0001¢\u0006\u0004\bM\u0010O¨\u0006P"}, m3636d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "sheetOverlappingHeight", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "sheetCustomShadow", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "MultiModeBottomSheetScaffold-A036w5U", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;FJJFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MultiModeBottomSheetScaffold", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "state", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "sheetSize", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "calculateAnchors", "shape", "tonalElevation", "shadowElevation", "dragHandle", "customShadow", "MultiModeStandardBottomSheet-BErStDs", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;Lkotlin/jvm/functions/Function1;FZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MultiModeStandardBottomSheet", "innerPadding", CarResultComposable2.BODY, "", "layoutHeight", "bottomSheet", "", "sheetOffset", "sheetState", "MultiModeBottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;JJLandroidx/compose/runtime/Composer;I)V", "MultiModeBottomSheetScaffoldLayout", "bottomSheetState", "snackbarHostState", "rememberMultiModeBottomSheetScaffoldState", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;", "initialValue", "confirmValueChange", "onValueChangeSettled", "Lkotlinx/collections/immutable/ImmutableList;", "availableValues", "rememberMultiModeStandardBottomSheetState", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "Landroidx/compose/runtime/State;", "availableValuesState", "(Landroidx/compose/runtime/State;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "rememberMultiModeSheetState", "(Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class MultiModeBottomSheetScaffoldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$17(Modifier modifier, Function2 function2, Function3 function3, Function3 function32, Function2 function22, float f, Function0 function0, MultiModeSheetState multiModeSheetState, long j, long j2, int i, Composer composer, int i2) {
        m24810MultiModeBottomSheetScaffoldLayoutPxNyym8(modifier, function2, function3, function32, function22, f, function0, multiModeSheetState, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeBottomSheetScaffold_A036w5U$lambda$2(Function3 function3, Modifier modifier, MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, float f, Shape shape, float f2, long j, long j2, float f3, float f4, Function1 function1, Function2 function2, boolean z, Function2 function22, Function3 function32, long j3, long j4, Function3 function33, int i, int i2, int i3, Composer composer, int i4) {
        m24809MultiModeBottomSheetScaffoldA036w5U(function3, modifier, multiModeBottomSheetScaffoldState, f, shape, f2, j, j2, f3, f4, function1, function2, z, function22, function32, j3, j4, function33, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeStandardBottomSheet_BErStDs$lambda$9(MultiModeSheetState multiModeSheetState, Function1 function1, float f, boolean z, Shape shape, long j, long j2, float f2, float f3, Function2 function2, Function1 function12, Function3 function3, int i, int i2, Composer composer, int i3) {
        m24811MultiModeStandardBottomSheetBErStDs(multiModeSheetState, function1, f, z, shape, j, j2, f2, f3, function2, function12, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberMultiModeSheetState$lambda$29$lambda$28(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberMultiModeSheetState$lambda$35$lambda$34(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberMultiModeStandardBottomSheetState$lambda$21$lambda$20(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberMultiModeStandardBottomSheetState$lambda$25$lambda$24(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* renamed from: MultiModeBottomSheetScaffold-A036w5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24809MultiModeBottomSheetScaffoldA036w5U(final Function3<? super Column5, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, float f, Shape shape, float f2, long j, long j2, float f3, float f4, Function1<? super DrawScope, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, long j3, long j4, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState2;
        float fM5713getSheetMaxWidthD9Ej5fM;
        Shape expandedShape;
        int i5;
        float fM7995constructorimpl;
        long containerColor;
        float fM5712getElevationD9Ej5fM;
        float fM5712getElevationD9Ej5fM2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState;
        long jM5779contentColorForek8zF_U;
        Function2<? super Composer, ? super Integer, Unit> function2M2750xca049683;
        boolean z2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        Function1<? super DrawScope, Unit> function12;
        long surface;
        Modifier modifier3;
        long jM5779contentColorForek8zF_U2;
        long j5;
        int i17;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        Function1<? super DrawScope, Unit> function13;
        boolean z3;
        Object objRememberedValue;
        Composer composer2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        final Shape shape2;
        final float f5;
        final Modifier modifier4;
        final Function1<? super DrawScope, Unit> function14;
        final float f6;
        final MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState3;
        final long j6;
        final float f7;
        final float f8;
        final boolean z4;
        final long j7;
        final long j8;
        final long j9;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        int i19;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(591365849);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    multiModeBottomSheetScaffoldState2 = multiModeBottomSheetScaffoldState;
                    int i23 = composerStartRestartGroup.changed(multiModeBottomSheetScaffoldState2) ? 256 : 128;
                    i4 |= i23;
                } else {
                    multiModeBottomSheetScaffoldState2 = multiModeBottomSheetScaffoldState;
                }
                i4 |= i23;
            } else {
                multiModeBottomSheetScaffoldState2 = multiModeBottomSheetScaffoldState;
            }
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    fM5713getSheetMaxWidthD9Ej5fM = f;
                    if (composerStartRestartGroup.changed(fM5713getSheetMaxWidthD9Ej5fM)) {
                        i21 = 2048;
                    }
                    i4 |= i21;
                } else {
                    fM5713getSheetMaxWidthD9Ej5fM = f;
                }
                i21 = 1024;
                i4 |= i21;
            } else {
                fM5713getSheetMaxWidthD9Ej5fM = f;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    expandedShape = shape;
                    if (composerStartRestartGroup.changed(expandedShape)) {
                        i20 = 16384;
                    }
                    i4 |= i20;
                } else {
                    expandedShape = shape;
                }
                i20 = 8192;
                i4 |= i20;
            } else {
                expandedShape = shape;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                fM7995constructorimpl = f2;
            } else {
                fM7995constructorimpl = f2;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                containerColor = j;
                i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(containerColor)) ? 1048576 : 524288;
            } else {
                containerColor = j;
            }
            if ((i & 12582912) == 0) {
                i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    fM5712getElevationD9Ej5fM = f3;
                    int i24 = composerStartRestartGroup.changed(fM5712getElevationD9Ej5fM) ? 67108864 : 33554432;
                    i4 |= i24;
                } else {
                    fM5712getElevationD9Ej5fM = f3;
                }
                i4 |= i24;
            } else {
                fM5712getElevationD9Ej5fM = f3;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    fM5712getElevationD9Ej5fM2 = f4;
                    int i25 = composerStartRestartGroup.changed(fM5712getElevationD9Ej5fM2) ? 536870912 : 268435456;
                    i4 |= i25;
                } else {
                    fM5712getElevationD9Ej5fM2 = f4;
                }
                i4 |= i25;
            } else {
                fM5712getElevationD9Ej5fM2 = f4;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i7 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i7 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
            } else {
                i7 = i2;
            }
            i8 = i3 & 2048;
            if (i8 == 0) {
                i7 |= 48;
                i9 = i8;
            } else if ((i2 & 48) == 0) {
                i9 = i8;
                i7 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            } else {
                i9 = i8;
            }
            int i26 = i7;
            i10 = i3 & 4096;
            if (i10 == 0) {
                i11 = i26 | 384;
            } else {
                int i27 = i26;
                if ((i2 & 384) == 0) {
                    i27 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                i11 = i27;
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
                i13 = i11 | 3072;
            } else {
                int i28 = i11;
                if ((i2 & 3072) == 0) {
                    i13 = i28 | (composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024);
                } else {
                    i13 = i28;
                }
            }
            i14 = i3 & 16384;
            if (i14 == 0) {
                i15 = i13 | 24576;
            } else {
                i15 = i13;
                if ((i2 & 24576) == 0) {
                    i15 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32768) == 0) {
                        i16 = i14;
                        if (composerStartRestartGroup.changed(j3)) {
                            i19 = 131072;
                        }
                        i15 |= i19;
                    } else {
                        i16 = i14;
                    }
                    i19 = 65536;
                    i15 |= i19;
                } else {
                    i16 = i14;
                }
                if ((i2 & 1572864) == 0) {
                    i15 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(j4)) ? 1048576 : 524288;
                }
                if ((i3 & 131072) == 0) {
                    i18 = (i2 & 12582912) == 0 ? composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                    if ((i4 & 306783379) == 306783378 || (i15 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i22 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = rememberMultiModeBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = multiModeBottomSheetScaffoldState2;
                            }
                            if ((i3 & 8) != 0) {
                                fM5713getSheetMaxWidthD9Ej5fM = BottomSheetDefaults.INSTANCE.m5713getSheetMaxWidthD9Ej5fM();
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i5 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                            }
                            if ((i3 & 64) != 0) {
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) == 0) {
                                jM5779contentColorForek8zF_U = ColorScheme2.m5779contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM5779contentColorForek8zF_U = j2;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                                fM5712getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m5712getElevationD9Ej5fM();
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                fM5712getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m5712getElevationD9Ej5fM();
                            }
                            Function1<? super DrawScope, Unit> function15 = i6 == 0 ? null : function1;
                            function2M2750xca049683 = i9 == 0 ? ComposableSingletons$MultiModeBottomSheetScaffoldKt.INSTANCE.m2750xca049683() : function2;
                            z2 = i10 == 0 ? true : z;
                            function23 = i12 == 0 ? null : function22;
                            Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M2751xabb1b4e = i16 == 0 ? ComposableSingletons$MultiModeBottomSheetScaffoldKt.INSTANCE.m2751xabb1b4e() : function3;
                            if ((i3 & 32768) == 0) {
                                modifier2 = modifier5;
                                i15 &= -458753;
                                function12 = function15;
                                surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface();
                            } else {
                                modifier2 = modifier5;
                                function12 = function15;
                                surface = j3;
                            }
                            if ((i3 & 65536) == 0) {
                                modifier3 = modifier2;
                                function32 = function3M2751xabb1b4e;
                                jM5779contentColorForek8zF_U2 = ColorScheme2.m5779contentColorForek8zF_U(surface, composerStartRestartGroup, (i15 >> 15) & 14);
                                j5 = surface;
                                i17 = i15 & (-3670017);
                            } else {
                                modifier3 = modifier2;
                                jM5779contentColorForek8zF_U2 = j4;
                                j5 = surface;
                                i17 = i15;
                                function32 = function3M2751xabb1b4e;
                            }
                            function13 = function12;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((32768 & i3) != 0) {
                                i15 &= -458753;
                            }
                            if ((i3 & 65536) != 0) {
                                i15 &= -3670017;
                            }
                            jM5779contentColorForek8zF_U = j2;
                            function13 = function1;
                            z2 = z;
                            function23 = function22;
                            function32 = function3;
                            j5 = j3;
                            jM5779contentColorForek8zF_U2 = j4;
                            multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = multiModeBottomSheetScaffoldState2;
                            i17 = i15;
                            modifier3 = modifier;
                            function2M2750xca049683 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function1<? super DrawScope, Unit> function16 = function13;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(591365849, i4, i17, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffold (MultiModeBottomSheetScaffold.kt:97)");
                        }
                        MultiModeSheetState bottomSheetState = multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState.getBottomSheetState();
                        int i29 = i17;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1869063050, true, new MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState, fM5713getSheetMaxWidthD9Ej5fM, z2, expandedShape, containerColor, jM5779contentColorForek8zF_U, fM5712getElevationD9Ej5fM, fM5712getElevationD9Ej5fM2, function2M2750xca049683, function16, sheetContent), composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1687650544, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i30) {
                                if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1687650544, i30, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffold.<anonymous> (MultiModeBottomSheetScaffold.kt:104)");
                                }
                                function32.invoke(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState.getSnackbarHostState(), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z3 = (((i4 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState)) || (i4 & 384) == 256;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffold_A036w5U$lambda$1$lambda$0(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i30 = i29 << 9;
                        Modifier modifier6 = modifier3;
                        long j10 = j5;
                        long j11 = jM5779contentColorForek8zF_U2;
                        m24810MultiModeBottomSheetScaffoldLayoutPxNyym8(modifier6, function23, content, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, fM7995constructorimpl, (Function0) objRememberedValue, bottomSheetState, j10, j11, composerStartRestartGroup, ((i4 >> 3) & 14) | 27648 | ((i29 >> 6) & 112) | ((i29 >> 15) & 896) | (458752 & i4) | (234881024 & i30) | (i30 & 1879048192));
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function33 = function32;
                        shape2 = expandedShape;
                        f5 = fM7995constructorimpl;
                        modifier4 = modifier6;
                        Function2<? super Composer, ? super Integer, Unit> function25 = function2M2750xca049683;
                        function14 = function16;
                        f6 = fM5713getSheetMaxWidthD9Ej5fM;
                        multiModeBottomSheetScaffoldState3 = multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState;
                        j6 = containerColor;
                        f7 = fM5712getElevationD9Ej5fM;
                        f8 = fM5712getElevationD9Ej5fM2;
                        z4 = z2;
                        j7 = jM5779contentColorForek8zF_U;
                        j8 = j11;
                        j9 = j10;
                        function24 = function25;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        function23 = function22;
                        function33 = function3;
                        j9 = j3;
                        j8 = j4;
                        composer2 = composerStartRestartGroup;
                        f6 = fM5713getSheetMaxWidthD9Ej5fM;
                        shape2 = expandedShape;
                        f5 = fM7995constructorimpl;
                        j6 = containerColor;
                        multiModeBottomSheetScaffoldState3 = multiModeBottomSheetScaffoldState2;
                        f7 = fM5712getElevationD9Ej5fM;
                        f8 = fM5712getElevationD9Ej5fM2;
                        j7 = j2;
                        function14 = function1;
                        function24 = function2;
                        z4 = z;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffold_A036w5U$lambda$2(sheetContent, modifier4, multiModeBottomSheetScaffoldState3, f6, shape2, f5, j6, j7, f7, f8, function14, function24, z4, function23, function33, j9, j8, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i15 |= i18;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i22 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        if ((i3 & 512) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        function13 = function12;
                        composerStartRestartGroup.endDefaults();
                        Function1<? super DrawScope, Unit> function162 = function13;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MultiModeSheetState bottomSheetState2 = multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState.getBottomSheetState();
                        int i292 = i17;
                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1869063050, true, new MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState, fM5713getSheetMaxWidthD9Ej5fM, z2, expandedShape, containerColor, jM5779contentColorForek8zF_U, fM5712getElevationD9Ej5fM, fM5712getElevationD9Ej5fM2, function2M2750xca049683, function162, sheetContent), composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1687650544, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i302) {
                                if ((i302 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1687650544, i302, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffold.<anonymous> (MultiModeBottomSheetScaffold.kt:104)");
                                }
                                function32.invoke(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState.getSnackbarHostState(), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (((i4 & 896) ^ 384) <= 256) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z3) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffold_A036w5U$lambda$1$lambda$0(multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                int i302 = i292 << 9;
                                Modifier modifier62 = modifier3;
                                long j102 = j5;
                                long j112 = jM5779contentColorForek8zF_U2;
                                m24810MultiModeBottomSheetScaffoldLayoutPxNyym8(modifier62, function23, content, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, fM7995constructorimpl, (Function0) objRememberedValue, bottomSheetState2, j102, j112, composerStartRestartGroup, ((i4 >> 3) & 14) | 27648 | ((i292 >> 6) & 112) | ((i292 >> 15) & 896) | (458752 & i4) | (234881024 & i302) | (i302 & 1879048192));
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function33 = function32;
                                shape2 = expandedShape;
                                f5 = fM7995constructorimpl;
                                modifier4 = modifier62;
                                Function2<? super Composer, ? super Integer, Unit> function252 = function2M2750xca049683;
                                function14 = function162;
                                f6 = fM5713getSheetMaxWidthD9Ej5fM;
                                multiModeBottomSheetScaffoldState3 = multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState;
                                j6 = containerColor;
                                f7 = fM5712getElevationD9Ej5fM;
                                f8 = fM5712getElevationD9Ej5fM2;
                                z4 = z2;
                                j7 = jM5779contentColorForek8zF_U;
                                j8 = j112;
                                j9 = j102;
                                function24 = function252;
                            }
                        } else {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z3) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i3 & 131072) == 0) {
            }
            i15 |= i18;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i8 = i3 & 2048;
        if (i8 == 0) {
        }
        int i262 = i7;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        i14 = i3 & 16384;
        if (i14 == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i3 & 131072) == 0) {
        }
        i15 |= i18;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MultiModeBottomSheetScaffold_A036w5U$lambda$1$lambda$0(MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState) {
        return multiModeBottomSheetScaffoldState.getBottomSheetState().requireOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MultiModeStandardBottomSheet-BErStDs, reason: not valid java name */
    public static final void m24811MultiModeStandardBottomSheetBErStDs(final MultiModeSheetState multiModeSheetState, final Function1<? super IntSize, ? extends MultiModeDraggableAnchors<MultiModeSheetState2>> function1, final float f, final boolean z, final Shape shape, final long j, final long j2, final float f2, final float f3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super DrawScope, Unit> function12, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-590141606);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(multiModeSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            shape2 = shape;
            i3 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function12) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-590141606, i3, i5, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeStandardBottomSheet (MultiModeBottomSheetScaffold.kt:162)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Orientation orientation = Orientation.Vertical;
            int i6 = i3;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6725getTransparent0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i5 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.MultiModeStandardBottomSheet_BErStDs$lambda$4$lambda$3(function12, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5176widthInVpY3zN4$default(DrawModifierKt.drawBehind(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue2), 0.0f, f, 1, null), 0.0f, 1, null);
            MultiModeAnchoredDraggableState<MultiModeSheetState2> multiModeAnchoredDraggableStateM2763xe9eec44d = multiModeSheetState.m2763xe9eec44d();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(multiModeAnchoredDraggableStateM2763xe9eec44d);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = MultiModeSheetDefaults.m2761x1005d098(multiModeSheetState, orientation, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.MultiModeStandardBottomSheet_BErStDs$lambda$6$lambda$5(coroutineScope, multiModeSheetState, ((Float) obj).floatValue());
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAnchoredDraggable$default = MultiModeAnchoredDraggableKt.anchoredDraggable$default(NestedScrollModifier7.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollModifier) objRememberedValue3, null, 2, null), multiModeSheetState.m2763xe9eec44d(), orientation, z, false, null, false, 56, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i6 & 112) == 32) | composerStartRestartGroup.changedInstance(multiModeSheetState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.MultiModeStandardBottomSheet_BErStDs$lambda$8$lambda$7(function1, multiModeSheetState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = i6 >> 9;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5967SurfaceT9BRK9s(OnRemeasuredModifier2.onSizeChanged(modifierAnchoredDraggable$default, (Function1) objRememberedValue4), shape2, j, j2, f2, f3, null, ComposableLambda3.rememberComposableLambda(1879629215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeStandardBottomSheet$4
                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1879629215, i8, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeStandardBottomSheet.<anonymous> (MultiModeBottomSheetScaffold.kt:200)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    Function3<Column5, Composer, Integer, Unit> function32 = function3;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer3.startReplaceGroup(-1843860311);
                    if (function22 != null) {
                        Modifier modifierAlign = column6.align(companion2, companion3.getCenterHorizontally());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function22.invoke(composer3, 0);
                        composer3.endNode();
                    }
                    composer3.endReplaceGroup();
                    function32.invoke(column6, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiModeBottomSheetScaffoldKt.MultiModeStandardBottomSheet_BErStDs$lambda$9(multiModeSheetState, function1, f, z, shape, j, j2, f2, f3, function2, function12, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeStandardBottomSheet_BErStDs$lambda$4$lambda$3(Function1 function1, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (function1 != null) {
            function1.invoke(drawBehind);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeStandardBottomSheet_BErStDs$lambda$6$lambda$5(CoroutineScope coroutineScope, MultiModeSheetState multiModeSheetState, float f) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C37429x6a929d0(multiModeSheetState, f, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeStandardBottomSheet_BErStDs$lambda$8$lambda$7(Function1 function1, MultiModeSheetState multiModeSheetState, IntSize intSize) {
        multiModeSheetState.m2763xe9eec44d().updateAnchors((MultiModeDraggableAnchors) function1.invoke(intSize), multiModeSheetState.m2763xe9eec44d().getTargetValue());
        return Unit.INSTANCE;
    }

    /* renamed from: MultiModeBottomSheetScaffoldLayout-PxNyym8, reason: not valid java name */
    private static final void m24810MultiModeBottomSheetScaffoldLayoutPxNyym8(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, final Function0<Float> function0, final MultiModeSheetState multiModeSheetState, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function3<? super Integer, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-251706300);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function23 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
        } else {
            function23 = function2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function33 = function32;
            i2 |= composerStartRestartGroup.changedInstance(function33) ? 2048 : 1024;
        } else {
            function33 = function32;
        }
        if ((i & 24576) == 0) {
            function24 = function22;
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
        } else {
            function24 = function22;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(multiModeSheetState) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-251706300, i2, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldLayout (MultiModeBottomSheetScaffold.kt:223)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(multiModeSheetState) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$11$lambda$10(multiModeSheetState, density);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = ((i2 & 57344) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(multiModeSheetState) | composerStartRestartGroup.changed(density) | ((3670016 & i2) == 1048576) | ((458752 & i2) == 131072) | ((i2 & 14) == 4) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912) | ((i2 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function34 = function33;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function24;
                i3 = 0;
                Function2 function27 = new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$16$lambda$15(function25, multiModeSheetState, density, function26, function34, function0, f, modifier, j, j2, function3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function27);
                objRememberedValue2 = function27;
            } else {
                i3 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue2, composerStartRestartGroup, i3, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiModeBottomSheetScaffoldKt.MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$17(modifier, function2, function3, function32, function22, f, function0, multiModeSheetState, j, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$11$lambda$10(MultiModeSheetState multiModeSheetState, Density density) {
        multiModeSheetState.setDensity$lib_compose_multi_mode_bottom_sheet_externalDebug(density);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$16$lambda$15(final Function2 function2, final MultiModeSheetState multiModeSheetState, Density density, Function2 function22, final Function3 function3, final Function0 function0, float f, final Modifier modifier, final long j, final long j2, final Function3 function32, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        float fM7995constructorimpl;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        final int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(constraints.getValue());
        final int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(constraints.getValue());
        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 10, null);
        final Placeable placeableMo7239measureBRTryo0 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambda3.composableLambdaInstance(-1103575896, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffoldLayout$2$1$sheetPlaceable$1
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
                    ComposerKt.traceEventStart(-1103575896, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (MultiModeBottomSheetScaffold.kt:235)");
                }
                function3.invoke(Integer.valueOf(iM7974getMaxHeightimpl), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })).get(0).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        final Placeable placeableMo7239measureBRTryo02 = function2 != null ? SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambda3.composableLambdaInstance(-960559356, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffoldLayout$2$1$topBarPlaceable$1$1
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
                    ComposerKt.traceEventStart(-960559356, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MultiModeBottomSheetScaffold.kt:239)");
                }
                function2.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })).get(0).mo7239measureBRTryo0(jM7967copyZbe2FdA$default) : null;
        final int height = placeableMo7239measureBRTryo02 != null ? placeableMo7239measureBRTryo02.getHeight() : 0;
        MultiModeSheetState2 currentValue = multiModeSheetState.getCurrentValue();
        if (Intrinsics.areEqual(currentValue, MultiModeSheetState2.Hidden.INSTANCE)) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        } else if (Intrinsics.areEqual(currentValue, MultiModeSheetState2.Expanded.INSTANCE) || (currentValue instanceof MultiModeSheetState2.FixedHeight)) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(RangesKt.coerceAtLeast(C2002Dp.m7995constructorimpl(density.mo5012toDpu2uoSUM(iM7974getMaxHeightimpl - ((Number) function0.invoke()).floatValue()) - f), C2002Dp.m7995constructorimpl(0)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final float f2 = fM7995constructorimpl;
        final Placeable placeableMo7239measureBRTryo03 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambda3.composableLambdaInstance(-2127975501, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffoldLayout$2$1$bodyPlaceable$1
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
                    ComposerKt.traceEventStart(-2127975501, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (MultiModeBottomSheetScaffold.kt:251)");
                }
                Modifier modifier2 = modifier;
                long j3 = j;
                long j4 = j2;
                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                final float f3 = f2;
                SurfaceKt.m5967SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1614989256, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffoldLayout$2$1$bodyPlaceable$1.1
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
                            ComposerKt.traceEventStart(-1614989256, i2, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MultiModeBottomSheetScaffold.kt:255)");
                        }
                        function33.invoke(PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f3, 7, null), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 12582912, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })).get(0).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(jM7967copyZbe2FdA$default, 0, 0, 0, iM7974getMaxHeightimpl - height, 7, null));
        final Placeable placeableMo7239measureBRTryo04 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function22).get(0).mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
        return MeasureScope.layout$default(SubcomposeLayout, iM7975getMaxWidthimpl, iM7974getMaxHeightimpl, null, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiModeBottomSheetScaffoldKt.m2760x229d9301(function0, iM7975getMaxWidthimpl, placeableMo7239measureBRTryo0, placeableMo7239measureBRTryo04, multiModeSheetState, iM7974getMaxHeightimpl, placeableMo7239measureBRTryo03, height, placeableMo7239measureBRTryo02, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MultiModeBottomSheetScaffoldLayout_PxNyym8$lambda$16$lambda$15$lambda$14 */
    public static final Unit m2760x229d9301(Function0 function0, int i, Placeable placeable, Placeable placeable2, MultiModeSheetState multiModeSheetState, int i2, Placeable placeable3, int i3, Placeable placeable4, Placeable.PlacementScope layout) {
        int height;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int iRoundToInt = MathKt.roundToInt(((Number) function0.invoke()).floatValue());
        int iMax = Integer.max(0, (i - placeable.getWidth()) / 2);
        int width = (i - placeable2.getWidth()) / 2;
        MultiModeSheetState2 currentValue = multiModeSheetState.getCurrentValue();
        if (currentValue instanceof MultiModeSheetState2.FixedHeight) {
            height = iRoundToInt - placeable2.getHeight();
        } else {
            if (!Intrinsics.areEqual(currentValue, MultiModeSheetState2.Expanded.INSTANCE) && !Intrinsics.areEqual(currentValue, MultiModeSheetState2.Hidden.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            height = i2 - placeable2.getHeight();
        }
        Placeable.PlacementScope.placeRelative$default(layout, placeable3, 0, i3, 0.0f, 4, null);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable4, 0, 0, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, placeable, iMax, iRoundToInt, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, width, height, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final MultiModeBottomSheetScaffoldState rememberMultiModeBottomSheetScaffoldState(MultiModeSheetState multiModeSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        composer.startReplaceGroup(-1859047148);
        if ((i2 & 1) != 0) {
            composer2 = composer;
            multiModeSheetState = rememberMultiModeStandardBottomSheetState((MultiModeSheetState2) null, (Function1<? super MultiModeSheetState2, Boolean>) null, (Function1<? super MultiModeSheetState2, Unit>) null, (ImmutableList<? extends MultiModeSheetState2>) null, composer2, 0, 15);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1859047148, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.rememberMultiModeBottomSheetScaffoldState (MultiModeBottomSheetScaffold.kt:293)");
        }
        composer2.startReplaceGroup(-1633490746);
        boolean zChanged = composer2.changed(multiModeSheetState) | ((((i & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new MultiModeBottomSheetScaffoldState(multiModeSheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState = (MultiModeBottomSheetScaffoldState) objRememberedValue2;
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return multiModeBottomSheetScaffoldState;
    }

    public static final MultiModeSheetState rememberMultiModeStandardBottomSheetState(MultiModeSheetState2 multiModeSheetState2, Function1<? super MultiModeSheetState2, Boolean> function1, Function1<? super MultiModeSheetState2, Unit> function12, ImmutableList<? extends MultiModeSheetState2> immutableList, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-862954168);
        if ((i2 & 1) != 0) {
            multiModeSheetState2 = MultiModeSheetState2.Hidden.INSTANCE;
        }
        MultiModeSheetState2 multiModeSheetState22 = multiModeSheetState2;
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MultiModeBottomSheetScaffoldKt.rememberMultiModeStandardBottomSheetState$lambda$21$lambda$20((MultiModeSheetState2) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.rememberMultiModeStandardBottomSheetState$lambda$23$lambda$22((MultiModeSheetState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
        }
        Function1<? super MultiModeSheetState2, Unit> function13 = function12;
        if ((i2 & 8) != 0) {
            immutableList = extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE, MultiModeSheetState2.Expanded.INSTANCE);
        }
        ImmutableList<? extends MultiModeSheetState2> immutableList2 = immutableList;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862954168, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.rememberMultiModeStandardBottomSheetState (MultiModeBottomSheetScaffold.kt:309)");
        }
        MultiModeSheetState multiModeSheetStateRememberMultiModeSheetState = rememberMultiModeSheetState(function1, function13, multiModeSheetState22, immutableList2, composer, ((i >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i << 6) & 896) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetStateRememberMultiModeSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberMultiModeStandardBottomSheetState$lambda$23$lambda$22(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final MultiModeSheetState rememberMultiModeStandardBottomSheetState(SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>> availableValuesState, MultiModeSheetState2 multiModeSheetState2, Function1<? super MultiModeSheetState2, Boolean> function1, Function1<? super MultiModeSheetState2, Unit> function12, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(availableValuesState, "availableValuesState");
        composer.startReplaceGroup(-883316519);
        if ((i2 & 2) != 0) {
            multiModeSheetState2 = MultiModeSheetState2.Hidden.INSTANCE;
        }
        MultiModeSheetState2 multiModeSheetState22 = multiModeSheetState2;
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MultiModeBottomSheetScaffoldKt.rememberMultiModeStandardBottomSheetState$lambda$25$lambda$24((MultiModeSheetState2) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        Function1<? super MultiModeSheetState2, Boolean> function13 = function1;
        if ((i2 & 8) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.rememberMultiModeStandardBottomSheetState$lambda$27$lambda$26((MultiModeSheetState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
        }
        Function1<? super MultiModeSheetState2, Unit> function14 = function12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-883316519, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.rememberMultiModeStandardBottomSheetState (MultiModeBottomSheetScaffold.kt:323)");
        }
        int i3 = i >> 3;
        MultiModeSheetState multiModeSheetStateRememberMultiModeSheetState = rememberMultiModeSheetState(availableValuesState, function13, function14, multiModeSheetState22, composer, (i & 14) | (i3 & 112) | (i3 & 896) | ((i << 6) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetStateRememberMultiModeSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberMultiModeStandardBottomSheetState$lambda$27$lambda$26(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final MultiModeSheetState rememberMultiModeSheetState(final SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>> availableValuesState, Function1<? super MultiModeSheetState2, Boolean> function1, Function1<? super MultiModeSheetState2, Unit> function12, MultiModeSheetState2 multiModeSheetState2, Composer composer, int i, int i2) {
        final Function1<? super MultiModeSheetState2, Unit> function13;
        Intrinsics.checkNotNullParameter(availableValuesState, "availableValuesState");
        composer.startReplaceGroup(295174449);
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MultiModeBottomSheetScaffoldKt.rememberMultiModeSheetState$lambda$29$lambda$28((MultiModeSheetState2) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        final Function1<? super MultiModeSheetState2, Boolean> function14 = function1;
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.rememberMultiModeSheetState$lambda$31$lambda$30((MultiModeSheetState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            function13 = (Function1) objRememberedValue2;
        } else {
            function13 = function12;
        }
        final MultiModeSheetState2 multiModeSheetState22 = (i2 & 8) != 0 ? MultiModeSheetState2.Hidden.INSTANCE : multiModeSheetState2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(295174449, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.rememberMultiModeSheetState (MultiModeBottomSheetScaffold.kt:339)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = new Object[0];
        Saver<MultiModeSheetState, List<Object>> saver = MultiModeSheetState.INSTANCE.saver(availableValuesState, function14, function13, density);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = ((((i & 896) ^ 384) > 256 && composer.changed(function13)) || (i & 384) == 256) | composer.changed(density) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(multiModeSheetState22)) || (i & 3072) == 2048) | ((((i & 14) ^ 6) > 4 && composer.changed(availableValuesState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function14)) || (i & 48) == 32);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiModeBottomSheetScaffoldKt.rememberMultiModeSheetState$lambda$33$lambda$32(density, multiModeSheetState22, availableValuesState, function14, function13);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue3 = obj;
        }
        composer.endReplaceGroup();
        MultiModeSheetState multiModeSheetState = (MultiModeSheetState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue3, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberMultiModeSheetState$lambda$31$lambda$30(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiModeSheetState rememberMultiModeSheetState$lambda$33$lambda$32(Density density, MultiModeSheetState2 multiModeSheetState2, SnapshotState4 snapshotState4, Function1 function1, Function1 function12) {
        return new MultiModeSheetState(density, multiModeSheetState2, (SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>>) snapshotState4, (Function1<? super MultiModeSheetState2, Boolean>) function1, (Function1<? super MultiModeSheetState2, Unit>) function12);
    }

    public static final MultiModeSheetState rememberMultiModeSheetState(Function1<? super MultiModeSheetState2, Boolean> function1, Function1<? super MultiModeSheetState2, Unit> function12, MultiModeSheetState2 multiModeSheetState2, ImmutableList<? extends MultiModeSheetState2> immutableList, Composer composer, int i, int i2) {
        Function1<? super MultiModeSheetState2, Boolean> function13;
        Function1<? super MultiModeSheetState2, Unit> function14;
        composer.startReplaceGroup(-1007297120);
        if ((i2 & 1) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MultiModeBottomSheetScaffoldKt.rememberMultiModeSheetState$lambda$35$lambda$34((MultiModeSheetState2) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function13 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function13 = function1;
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiModeBottomSheetScaffoldKt.rememberMultiModeSheetState$lambda$37$lambda$36((MultiModeSheetState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function14 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            function14 = function12;
        }
        MultiModeSheetState2 multiModeSheetState22 = (i2 & 4) != 0 ? MultiModeSheetState2.Hidden.INSTANCE : multiModeSheetState2;
        ImmutableList<? extends MultiModeSheetState2> immutableListPersistentListOf = (i2 & 8) != 0 ? extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE, MultiModeSheetState2.Expanded.INSTANCE) : immutableList;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1007297120, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.rememberMultiModeSheetState (MultiModeBottomSheetScaffold.kt:367)");
        }
        MultiModeSheetState multiModeSheetStateRememberMultiModeSheetState = rememberMultiModeSheetState((SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>>) SnapshotStateKt.rememberUpdatedState(immutableListPersistentListOf, composer, (i >> 9) & 14), function13, function14, multiModeSheetState22, composer, (i << 3) & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return multiModeSheetStateRememberMultiModeSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberMultiModeSheetState$lambda$37$lambda$36(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
