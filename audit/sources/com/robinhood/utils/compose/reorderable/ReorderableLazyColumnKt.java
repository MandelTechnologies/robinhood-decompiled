package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReorderableLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0082\u0001\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0092\u0001\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u00122\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 26\u0010\"\u001a2\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010)\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0080@¢\u0006\u0002\u0010*\u001a\r\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,¨\u0006-²\u0006\n\u0010.\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u000100X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020003X\u008a\u008e\u0002²\u0006\u0010\u00104\u001a\b\u0012\u0004\u0012\u00020003X\u008a\u008e\u0002"}, m3636d2 = {"ReorderableLazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ReorderableLazyColumnV2", "parentDragState", "Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScopeV2;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLcom/robinhood/utils/compose/reorderable/DragStateV2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "detectDragGesturesAfterLongPressV2", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Landroidx/compose/ui/geometry/Offset;", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "dragAmount", "dragState", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/compose/reorderable/DragStateV2;Lcom/robinhood/utils/compose/reorderable/DragStateV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-utils-compose_externalDebug", "list1Dragging", "list1LastReorder", "", "list2Dragging", "list1", "", "list2"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ReorderableLazyColumnKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String Preview$lambda$31$lambda$30$lambda$24(int i, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Preview$lambda$31$lambda$30$lambda$27(int i, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$32(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReorderableLazyColumn$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        ReorderableLazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReorderableLazyColumnV2$lambda$5(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, DragStateV2 dragStateV2, Function1 function1, int i, int i2, Composer composer, int i3) {
        ReorderableLazyColumnV2(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, dragStateV2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReorderableLazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super ReorderableLazyListScope, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        int i4;
        boolean z3;
        Arrangement.Vertical top;
        int i5;
        Alignment.Horizontal start;
        int i6;
        int i7;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyListState lazyListState2;
        Arrangement.Vertical vertical2;
        int i8;
        boolean z5;
        boolean z6;
        PaddingValues paddingValues2;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior3;
        Modifier modifier3;
        final boolean z7;
        final FlingBehavior flingBehavior4;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final boolean z8;
        final PaddingValues paddingValues3;
        final LazyListState lazyListState3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1953437153);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValuesM5135PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM5135PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        top = vertical;
                        int i12 = composerStartRestartGroup.changed(top) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        top = vertical;
                    }
                    i3 |= i12;
                } else {
                    top = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        start = horizontal;
                        i3 |= composerStartRestartGroup.changed(start) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                }
                                if (i11 != 0) {
                                    paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    i3 &= -57345;
                                    top = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                }
                                if (i5 != 0) {
                                    start = Alignment.INSTANCE.getStart();
                                }
                                if ((i2 & 64) == 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, ScrollableDefaults.$stable);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i7 == 0) {
                                    Arrangement.Vertical vertical4 = top;
                                    z4 = 3;
                                    lazyListState2 = lazyListStateRememberLazyListState;
                                    vertical2 = vertical4;
                                    boolean z9 = z3;
                                    i8 = i3;
                                    z5 = z9;
                                    z6 = true;
                                } else {
                                    Arrangement.Vertical vertical5 = top;
                                    z4 = 3;
                                    lazyListState2 = lazyListStateRememberLazyListState;
                                    vertical2 = vertical5;
                                    boolean z10 = z3;
                                    i8 = i3;
                                    z5 = z10;
                                    z6 = z2;
                                }
                                paddingValues2 = paddingValuesM5135PaddingValues0680j_4;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                                modifier3 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                Arrangement.Vertical vertical6 = top;
                                z4 = 3;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                vertical2 = vertical6;
                                boolean z11 = z3;
                                i8 = i3;
                                z5 = z11;
                                z6 = z2;
                                modifier3 = modifier2;
                                paddingValues2 = paddingValuesM5135PaddingValues0680j_4;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (!ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1953437153, i8, -1, "com.robinhood.utils.compose.reorderable.ReorderableLazyColumn (ReorderableLazyColumn.kt:69)");
                            }
                            ReorderableLazyColumnV2(modifier3, lazyListState2, paddingValues2, z5, vertical2, horizontal2, flingBehavior3, z6, null, content, composerStartRestartGroup, (33554430 & i8) | ((i8 << 3) & 1879048192), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z7 = z6;
                            flingBehavior4 = flingBehavior3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            z8 = z5;
                            paddingValues3 = paddingValues2;
                            lazyListState3 = lazyListState2;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            flingBehavior4 = flingBehavior;
                            modifier4 = modifier2;
                            lazyListState3 = lazyListStateRememberLazyListState;
                            paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                            z8 = z3;
                            vertical3 = top;
                            horizontal3 = start;
                            z7 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ReorderableLazyColumnKt.ReorderableLazyColumn$lambda$0(modifier4, lazyListState3, paddingValues3, z8, vertical3, horizontal3, flingBehavior4, z7, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    i7 = i6;
                    if ((i2 & 256) != 0) {
                    }
                    if ((38347923 & i3) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            Modifier modifier52 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            paddingValues2 = paddingValuesM5135PaddingValues0680j_4;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                            modifier3 = modifier52;
                            composerStartRestartGroup.endDefaults();
                            if (!ComposerKt.isTraceInProgress()) {
                            }
                            ReorderableLazyColumnV2(modifier3, lazyListState2, paddingValues2, z5, vertical2, horizontal2, flingBehavior3, z6, null, content, composerStartRestartGroup, (33554430 & i8) | ((i8 << 3) & 1879048192), 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z7 = z6;
                            flingBehavior4 = flingBehavior3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            z8 = z5;
                            paddingValues3 = paddingValues2;
                            lazyListState3 = lazyListState2;
                            modifier4 = modifier3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                start = horizontal;
                if ((i & 1572864) == 0) {
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                }
                i7 = i6;
                if ((i2 & 256) != 0) {
                }
                if ((38347923 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            start = horizontal;
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i6;
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValuesM5135PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        start = horizontal;
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i6;
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Preview$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Preview$lambda$13(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Preview$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final List<String> Preview$lambda$19(SnapshotState<List<String>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final List<String> Preview$lambda$22(SnapshotState<List<String>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReorderableLazyColumnV2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, DragStateV2 dragStateV2, final Function1<? super ReorderableLazyListScopeV2, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        int i4;
        boolean z3;
        Arrangement.Vertical top;
        int i5;
        Alignment.Horizontal start;
        int i6;
        int i7;
        int i8;
        int i9;
        FlingBehavior flingBehavior2;
        DragStateV2 dragStateV22;
        FlingBehavior flingBehavior3;
        LazyListState lazyListState2;
        boolean z4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final DragStateV2 dragStateV23;
        final HapticFeedback hapticFeedback;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        Composer composer2;
        final Modifier modifier3;
        final DragStateV2 dragStateV24;
        final LazyListState lazyListState3;
        final PaddingValues paddingValues2;
        final boolean z5;
        final Arrangement.Vertical vertical2;
        final Alignment.Horizontal horizontal2;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1327027312);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i11 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValuesM5135PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM5135PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        top = vertical;
                        int i13 = composerStartRestartGroup.changed(top) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        top = vertical;
                    }
                    i3 |= i13;
                } else {
                    top = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        start = horizontal;
                        i3 |= composerStartRestartGroup.changed(start) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                            if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changedInstance(dragStateV2) ? 67108864 : 33554432;
                            }
                            if ((i2 & 512) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i10 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    }
                                    if (i12 != 0) {
                                        paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                                    }
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        i3 &= -57345;
                                        top = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                    }
                                    if (i5 != 0) {
                                        start = Alignment.INSTANCE.getStart();
                                    }
                                    if ((i2 & 64) == 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, ScrollableDefaults.$stable);
                                        i3 &= -3670017;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                    }
                                    boolean z7 = i7 == 0 ? true : z2;
                                    dragStateV22 = i9 == 0 ? null : dragStateV2;
                                    flingBehavior3 = flingBehavior2;
                                    lazyListState2 = lazyListStateRememberLazyListState;
                                    z4 = z7;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    flingBehavior3 = flingBehavior;
                                    z4 = z2;
                                    dragStateV22 = dragStateV2;
                                    lazyListState2 = lazyListStateRememberLazyListState;
                                }
                                boolean z8 = z3;
                                Arrangement.Vertical vertical3 = top;
                                Alignment.Horizontal horizontal3 = start;
                                PaddingValues paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1327027312, i3, -1, "com.robinhood.utils.compose.reorderable.ReorderableLazyColumnV2 (ReorderableLazyColumn.kt:96)");
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new DragStateV2(lazyListState2, coroutineScope);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                dragStateV23 = (DragStateV2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                Unit unit = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance = composerStartRestartGroup.changedInstance(dragStateV23) | composerStartRestartGroup.changedInstance(dragStateV22);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1(dragStateV23, dragStateV22);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, unit, (PointerInputEventHandler) objRememberedValue3);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChangedInstance2 = ((1879048192 & i3) == 536870912) | composerStartRestartGroup.changedInstance(dragStateV23) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ReorderableLazyColumnKt.ReorderableLazyColumnV2$lambda$4$lambda$3(content, dragStateV23, hapticFeedback, (LazyListScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                LazyDslKt.LazyColumn(modifierPointerInput, lazyListState2, paddingValues3, z8, vertical3, horizontal3, flingBehavior3, z4, null, (Function1) objRememberedValue4, composer2, i3 & 33554416, 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                dragStateV24 = dragStateV22;
                                lazyListState3 = lazyListState2;
                                paddingValues2 = paddingValues3;
                                z5 = z8;
                                vertical2 = vertical3;
                                horizontal2 = horizontal3;
                                flingBehavior4 = flingBehavior3;
                                z6 = z4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z6 = z2;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                lazyListState3 = lazyListStateRememberLazyListState;
                                paddingValues2 = paddingValuesM5135PaddingValues0680j_4;
                                z5 = z3;
                                vertical2 = top;
                                horizontal2 = start;
                                flingBehavior4 = flingBehavior;
                                dragStateV24 = dragStateV2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ReorderableLazyColumnKt.ReorderableLazyColumnV2$lambda$5(modifier3, lazyListState3, paddingValues2, z5, vertical2, horizontal2, flingBehavior4, z6, dragStateV24, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i9 = i8;
                        if ((i2 & 512) == 0) {
                        }
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                flingBehavior3 = flingBehavior2;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                z4 = z7;
                                boolean z82 = z3;
                                Arrangement.Vertical vertical32 = top;
                                Alignment.Horizontal horizontal32 = start;
                                PaddingValues paddingValues32 = paddingValuesM5135PaddingValues0680j_4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                dragStateV23 = (DragStateV2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                Unit unit2 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance = composerStartRestartGroup.changedInstance(dragStateV23) | composerStartRestartGroup.changedInstance(dragStateV22);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue3 = new ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1(dragStateV23, dragStateV22);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, unit2, (PointerInputEventHandler) objRememberedValue3);
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    zChangedInstance2 = ((1879048192 & i3) == 536870912) | composerStartRestartGroup.changedInstance(dragStateV23) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return ReorderableLazyColumnKt.ReorderableLazyColumnV2$lambda$4$lambda$3(content, dragStateV23, hapticFeedback, (LazyListScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        LazyDslKt.LazyColumn(modifierPointerInput2, lazyListState2, paddingValues32, z82, vertical32, horizontal32, flingBehavior3, z4, null, (Function1) objRememberedValue4, composer2, i3 & 33554416, 256);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier2;
                                        dragStateV24 = dragStateV22;
                                        lazyListState3 = lazyListState2;
                                        paddingValues2 = paddingValues32;
                                        z5 = z82;
                                        vertical2 = vertical32;
                                        horizontal2 = horizontal32;
                                        flingBehavior4 = flingBehavior3;
                                        z6 = z4;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i2 & 512) == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                start = horizontal;
                if ((i & 1572864) == 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            start = horizontal;
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValuesM5135PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        start = horizontal;
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReorderableLazyColumnV2$lambda$4$lambda$3(Function1 function1, DragStateV2 dragStateV2, HapticFeedback hapticFeedback, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        function1.invoke(new ReorderableLazyListScopeImplV2(dragStateV2, hapticFeedback, LazyColumn));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPressV2$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, DragStateV2 dragStateV2, DragStateV2 dragStateV22, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ReorderableLazyColumnKt.detectDragGesturesAfterLongPressV2$lambda$6((Offset) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGesturesAfterLongPressV2(pointerInputScope, function1, function0, function03, function2, dragStateV2, dragStateV22, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGesturesAfterLongPressV2$lambda$6(Offset offset) {
        return Unit.INSTANCE;
    }

    /* compiled from: ReorderableLazyColumn.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5", m3645f = "ReorderableLazyColumn.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5 */
    static final class C418555 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DragStateV2 $dragState;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ DragStateV2 $parentDragState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C418555(DragStateV2 dragStateV2, DragStateV2 dragStateV22, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super C418555> continuation) {
            super(2, continuation);
            this.$dragState = dragStateV2;
            this.$parentDragState = dragStateV22;
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C418555 c418555 = new C418555(this.$dragState, this.$parentDragState, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            c418555.L$0 = obj;
            return c418555;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C418555) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x0078, PHI: r1 r8 r12
          0x0064: PHI (r1v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r1v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5) = 
          (r8v2 com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5)
          (r8v7 com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v16 java.lang.Object) = (r12v0 java.lang.Object), (r12v22 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0078, blocks: (B:43:0x00a0, B:45:0x00a8, B:46:0x00b6, B:48:0x00bc, B:50:0x00c8, B:51:0x00cc, B:53:0x00d0, B:54:0x00d3, B:55:0x00d9, B:57:0x00dd, B:58:0x00e0, B:30:0x0064, B:32:0x0068, B:34:0x0070, B:36:0x0074, B:39:0x007c, B:27:0x0053, B:23:0x004b), top: B:71:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074 A[Catch: CancellationException -> 0x0078, TryCatch #2 {CancellationException -> 0x0078, blocks: (B:43:0x00a0, B:45:0x00a8, B:46:0x00b6, B:48:0x00bc, B:50:0x00c8, B:51:0x00cc, B:53:0x00d0, B:54:0x00d3, B:55:0x00d9, B:57:0x00dd, B:58:0x00e0, B:30:0x0064, B:32:0x0068, B:34:0x0070, B:36:0x0074, B:39:0x007c, B:27:0x0053, B:23:0x004b), top: B:71:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: CancellationException -> 0x0078, TryCatch #2 {CancellationException -> 0x0078, blocks: (B:43:0x00a0, B:45:0x00a8, B:46:0x00b6, B:48:0x00bc, B:50:0x00c8, B:51:0x00cc, B:53:0x00d0, B:54:0x00d3, B:55:0x00d9, B:57:0x00dd, B:58:0x00e0, B:30:0x0064, B:32:0x0068, B:34:0x0070, B:36:0x0074, B:39:0x007c, B:27:0x0053, B:23:0x004b), top: B:71:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d9 A[Catch: CancellationException -> 0x0078, TryCatch #2 {CancellationException -> 0x0078, blocks: (B:43:0x00a0, B:45:0x00a8, B:46:0x00b6, B:48:0x00bc, B:50:0x00c8, B:51:0x00cc, B:53:0x00d0, B:54:0x00d3, B:55:0x00d9, B:57:0x00dd, B:58:0x00e0, B:30:0x0064, B:32:0x0068, B:34:0x0070, B:36:0x0074, B:39:0x007c, B:27:0x0053, B:23:0x004b), top: B:71:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            C418555 c418555;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            DragStateV2 dragStateV2;
            PointerInputChange pointerInputChange;
            DragStateV2 dragStateV22;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                try {
                    this.L$0 = awaitPointerEventScope3;
                    this.label = 1;
                    c418555 = this;
                } catch (CancellationException e) {
                    e = e;
                    c418555 = this;
                }
                try {
                    obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, null, c418555, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope3;
                    long id = ((PointerInputChange) obj).getId();
                    c418555.L$0 = awaitPointerEventScope;
                    c418555.label = 2;
                    obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    dragStateV2 = c418555.$parentDragState;
                    if (dragStateV2 != null) {
                    }
                    c418555.$onDragCancel.invoke();
                    throw cancellationException;
                }
            }
            try {
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c418555 = this;
                    long id2 = ((PointerInputChange) obj).getId();
                    c418555.L$0 = awaitPointerEventScope;
                    c418555.label = 2;
                    obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, this);
                    if (obj == coroutine_suspended) {
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            dragStateV22 = c418555.$parentDragState;
                            if (dragStateV22 != null) {
                            }
                            c418555.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                            long id3 = pointerInputChange.getId();
                            final Function2<PointerInputChange, Offset, Unit> function2 = c418555.$onDrag;
                            Function1 function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return ReorderableLazyColumnKt.C418555.invokeSuspend$lambda$0(function2, (PointerInputChange) obj2);
                                }
                            };
                            c418555.L$0 = awaitPointerEventScope;
                            c418555.label = 3;
                            obj = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope, id3, function1, this);
                            if (obj != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c418555 = this;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null && !c418555.$dragState.getNestedItemDragging()) {
                        dragStateV22 = c418555.$parentDragState;
                        if (dragStateV22 != null) {
                            dragStateV22.onNestedItemDraggingStart();
                        }
                        c418555.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                        long id32 = pointerInputChange.getId();
                        final Function2 function22 = c418555.$onDrag;
                        Function1 function12 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$detectDragGesturesAfterLongPressV2$5$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ReorderableLazyColumnKt.C418555.invokeSuspend$lambda$0(function22, (PointerInputChange) obj2);
                            }
                        };
                        c418555.L$0 = awaitPointerEventScope;
                        c418555.label = 3;
                        obj = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope, id32, function12, this);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c418555 = this;
                    if (((Boolean) obj).booleanValue()) {
                        DragStateV2 dragStateV23 = c418555.$parentDragState;
                        if (dragStateV23 != null) {
                            dragStateV23.onNestedItemDraggingFinish();
                        }
                        c418555.$onDragCancel.invoke();
                    } else {
                        for (PointerInputChange pointerInputChange2 : awaitPointerEventScope2.getCurrentEvent().getChanges()) {
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        DragStateV2 dragStateV24 = c418555.$parentDragState;
                        if (dragStateV24 != null) {
                            dragStateV24.onNestedItemDraggingFinish();
                        }
                        c418555.$onDragEnd.invoke();
                    }
                }
            } catch (CancellationException e3) {
                cancellationException = e3;
                c418555 = this;
                dragStateV2 = c418555.$parentDragState;
                if (dragStateV2 != null) {
                    dragStateV2.onNestedItemDraggingFinish();
                }
                c418555.$onDragCancel.invoke();
                throw cancellationException;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function2 function2, PointerInputChange pointerInputChange) {
            function2.invoke(pointerInputChange, Offset.m6534boximpl(PointerEventKt.positionChange(pointerInputChange)));
            pointerInputChange.consume();
            return Unit.INSTANCE;
        }
    }

    public static final Object detectDragGesturesAfterLongPressV2(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, DragStateV2 dragStateV2, DragStateV2 dragStateV22, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C418555(dragStateV2, dragStateV22, function1, function0, function02, function2, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1042814640);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1042814640, i, -1, "com.robinhood.utils.compose.reorderable.Preview (ReorderableLazyColumn.kt:270)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(CollectionsKt.listOf((Object[]) new String[]{"One", "Two", "Three", "Four", "Five"}), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(CollectionsKt.listOf((Object[]) new String[]{"Six", "Seven", "Eight"}), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m5552getBackground0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30(snapshotState, snapshotState2, snapshotState4, snapshotState3, snapshotState5, (ReorderableLazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue6 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            ReorderableLazyColumn(modifierM4872backgroundbw27NRU$default, null, null, false, null, null, null, false, (Function1) objRememberedValue6, composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderableLazyColumnKt.Preview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void Preview$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31$lambda$30(final SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, final SnapshotState snapshotState4, final SnapshotState snapshotState5, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        ComposableSingletons$ReorderableLazyColumnKt composableSingletons$ReorderableLazyColumnKt = ComposableSingletons$ReorderableLazyColumnKt.INSTANCE;
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$ReorderableLazyColumnKt.getLambda$593522786$lib_utils_compose_externalDebug(), 3, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1987320551, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$Preview$1$1$1
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
                    ComposerKt.traceEventStart(-1987320551, i, -1, "com.robinhood.utils.compose.reorderable.Preview.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyColumn.kt:281)");
                }
                TextKt.m5665Text4IGK_g("List 1 (Dragging: " + ReorderableLazyColumnKt.Preview$lambda$10(snapshotState) + ")", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1723623526, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$Preview$1$1$2
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
                    ComposerKt.traceEventStart(-1723623526, i, -1, "com.robinhood.utils.compose.reorderable.Preview.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyColumn.kt:282)");
                }
                String strPreview$lambda$13 = ReorderableLazyColumnKt.Preview$lambda$13(snapshotState2);
                if (strPreview$lambda$13 == null) {
                    strPreview$lambda$13 = "waiting";
                }
                TextKt.m5665Text4IGK_g(strPreview$lambda$13, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        ReorderableLazyListScope.DefaultImpls.reorderableItems$default(ReorderableLazyColumn, Preview$lambda$19(snapshotState3), "list1", new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$24(((Integer) obj).intValue(), (String) obj2);
            }
        }, null, new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$25(snapshotState);
            }
        }, null, new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$26(snapshotState3, snapshotState2, snapshotState, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, false, false, composableSingletons$ReorderableLazyColumnKt.getLambda$1900019409$lib_utils_compose_externalDebug(), 40, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1459926501, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$Preview$1$1$6
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
                    ComposerKt.traceEventStart(-1459926501, i, -1, "com.robinhood.utils.compose.reorderable.Preview.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyColumn.kt:303)");
                }
                TextKt.m5665Text4IGK_g("List 2 (Dragging: " + ReorderableLazyColumnKt.Preview$lambda$16(snapshotState4) + ")", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        ReorderableLazyListScope.DefaultImpls.reorderableItems$default(ReorderableLazyColumn, Preview$lambda$22(snapshotState5), "list2", new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$27(((Integer) obj).intValue(), (String) obj2);
            }
        }, null, new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$28(snapshotState4);
            }
        }, null, new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableLazyColumnKt.Preview$lambda$31$lambda$30$lambda$29(snapshotState5, snapshotState4, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, false, false, composableSingletons$ReorderableLazyColumnKt.m26606getLambda$574516280$lib_utils_compose_externalDebug(), 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31$lambda$30$lambda$25(SnapshotState snapshotState) {
        Preview$lambda$11(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31$lambda$30$lambda$26(SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, int i, int i2) {
        snapshotState.setValue(Reorder.reorder(Preview$lambda$19(snapshotState), i, i2));
        snapshotState2.setValue(((Object) Preview$lambda$19(snapshotState).get(i)) + " moved to " + ((Object) Preview$lambda$19(snapshotState).get(i2)));
        Preview$lambda$11(snapshotState3, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31$lambda$30$lambda$28(SnapshotState snapshotState) {
        Preview$lambda$17(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31$lambda$30$lambda$29(SnapshotState snapshotState, SnapshotState snapshotState2, int i, int i2) {
        snapshotState.setValue(Reorder.reorder(Preview$lambda$22(snapshotState), i, i2));
        Preview$lambda$17(snapshotState2, false);
        return Unit.INSTANCE;
    }
}
