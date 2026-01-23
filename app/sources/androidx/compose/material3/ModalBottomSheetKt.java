package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.TransformOrigin2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.input.pointer.C1842xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aµ\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aä\u0001\u0010*\u001a\u00020\u0001*\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010-\u001a\u00020\u001e*\u00020+2\u0006\u0010,\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u0010/\u001a\u00020\u001e*\u00020+2\u0006\u0010,\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010.\u001a/\u00104\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u0002002\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002000\u0015H\u0007¢\u0006\u0004\b4\u00105\u001a0\u0010:\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u00107\u001a\u000200H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<\"\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\f\u0010A\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheet", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/CoroutineScope;", "scope", "animateToDismiss", "Lkotlin/ParameterName;", "name", "velocity", "settleToDismiss", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetContent", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "progress", "calculatePredictiveBackScaleX", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F", "calculatePredictiveBackScaleY", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "rememberModalBottomSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", ResourceTypes.COLOR, "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "PredictiveBackMaxScaleXDistance", "F", "PredictiveBackMaxScaleYDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "PredictiveBackChildTransformOrigin", "J", "alpha", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = C2002Dp.m7995constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = C2002Dp.m7995constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOrigin2.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5886ModalBottomSheetdYc4hso(final Function0<Unit> function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final SheetState sheetStateRememberModalBottomSheetState;
        int i5;
        float f3;
        Shape shape2;
        long jM5779contentColorForek8zF_U;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32;
        int i15;
        Shape expandedShape;
        long containerColor;
        float f4;
        long scrimColor;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        final float f5;
        ModalBottomSheetProperties properties;
        final float f6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        final Shape shape3;
        final long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Animatable animatable;
        boolean zChangedInstance3;
        Object objRememberedValue5;
        Composer composer2;
        final SheetState sheetState2;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final float f7;
        final Shape shape4;
        final long j7;
        final long j8;
        final float f8;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132719801);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState;
                    int i18 = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) ? 256 : 128;
                    i4 |= i18;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                i4 |= i18;
            } else {
                sheetStateRememberModalBottomSheetState = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f3 = f;
                    i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i4 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i & 196608) == 0) {
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    jM5779contentColorForek8zF_U = j2;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(jM5779contentColorForek8zF_U)) ? 1048576 : 524288;
                } else {
                    jM5779contentColorForek8zF_U = j2;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        i16 = i4;
                        int i20 = composerStartRestartGroup.changed(j3) ? 67108864 : 33554432;
                        i7 = i16 | i20;
                    } else {
                        i16 = i4;
                    }
                    i7 = i16 | i20;
                } else {
                    i7 = i4;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i10 = i7 | 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i9 = i7 | (composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456);
                    } else {
                        i9 = i7;
                    }
                    i10 = i9;
                }
                if ((i2 & 6) == 0) {
                    i11 = i6;
                    i12 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changedInstance(function22)) ? 4 : 2);
                } else {
                    i11 = i6;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= composerStartRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i21 = i12;
                if ((i3 & 4096) == 0) {
                    if ((i2 & 384) == 0) {
                        function32 = function3;
                        i21 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
                    }
                    if ((306783379 & i10) == 306783378 || (i21 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i10 &= -897;
                                sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            }
                            float fM5713getSheetMaxWidthD9Ej5fM = i5 == 0 ? BottomSheetDefaults.INSTANCE.m5713getSheetMaxWidthD9Ej5fM() : f3;
                            if ((i3 & 16) == 0) {
                                i15 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i10 &= -57345;
                            } else {
                                i15 = 6;
                                expandedShape = shape2;
                            }
                            if ((i3 & 32) == 0) {
                                i10 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i15);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & 64) != 0) {
                                jM5779contentColorForek8zF_U = ColorScheme2.m5779contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i10 >> 15) & 14);
                                i10 &= -3670017;
                            }
                            int i22 = i10;
                            float fM7995constructorimpl = i11 == 0 ? C2002Dp.m7995constructorimpl(0) : f2;
                            if ((i3 & 256) == 0) {
                                f4 = fM7995constructorimpl;
                                scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i10 = i22 & (-234881025);
                            } else {
                                f4 = fM7995constructorimpl;
                                i10 = i22;
                                scrimColor = j3;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2M5801getLambda1$material3_release = i8 == 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m5801getLambda1$material3_release() : function2;
                            if ((i3 & 1024) == 0) {
                                function23 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                                    public final WindowInsets invoke(Composer composer3, int i23) {
                                        composer3.startReplaceGroup(58488196);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(58488196, i23, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
                                        }
                                        WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return windowInsets;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                        return invoke(composer3, num.intValue());
                                    }
                                };
                                i21 &= -15;
                            } else {
                                function23 = function22;
                            }
                            if (i14 == 0) {
                                properties = ModalBottomSheetDefaults.INSTANCE.getProperties();
                                f5 = f4;
                            } else {
                                f5 = f4;
                                properties = modalBottomSheetProperties;
                            }
                            f6 = fM5713getSheetMaxWidthD9Ej5fM;
                            function24 = function2M5801getLambda1$material3_release;
                            function25 = function23;
                            shape3 = expandedShape;
                            j4 = containerColor;
                            modifier3 = modifier2;
                            j5 = jM5779contentColorForek8zF_U;
                            j6 = scrimColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i10 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i10 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i10 &= -234881025;
                            }
                            if ((i3 & 1024) != 0) {
                                i21 &= -15;
                            }
                            j4 = j;
                            f5 = f2;
                            j6 = j3;
                            function24 = function2;
                            function25 = function22;
                            properties = modalBottomSheetProperties;
                            f6 = f3;
                            shape3 = shape2;
                            modifier3 = modifier2;
                            j5 = jM5779contentColorForek8zF_U;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2132719801, i10, i21, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        int i23 = (i10 & 896) ^ 384;
                        boolean z = true;
                        int i24 = i10 & 14;
                        zChangedInstance = ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i24 == 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16301(sheetStateRememberModalBottomSheetState, null), 3, null);
                                        final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                        final Function0<Unit> function02 = function0;
                                        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                invoke2(th);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Throwable th) {
                                                if (sheetState3.isVisible()) {
                                                    return;
                                                }
                                                function02.invoke();
                                            }
                                        });
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                static final class C16301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C16301(SheetState sheetState, Continuation<? super C16301> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C16301(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C16301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.$sheetState;
                                            this.label = 1;
                                            if (sheetState.hide(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final Function0 function02 = (Function0) objRememberedValue2;
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i24 == 4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f9) {
                                    invoke(f9.floatValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                static final class C16321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ float $it;
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C16321(SheetState sheetState, float f, Continuation<? super C16321> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                        this.$it = f;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C16321(this.$sheetState, this.$it, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C16321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.$sheetState;
                                            float f = this.$it;
                                            this.label = 1;
                                            if (sheetState.settle$material3_release(f, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(float f9) {
                                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16321(sheetStateRememberModalBottomSheetState, f9, null), 3, null);
                                    final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                    final Function0<Unit> function03 = function0;
                                    jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                            invoke2(th);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Throwable th) {
                                            if (sheetState3.isVisible()) {
                                                return;
                                            }
                                            function03.invoke();
                                        }
                                    });
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        final Function1 function1 = (Function1) objRememberedValue3;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        animatable = (Animatable) objRememberedValue4;
                        zChangedInstance3 = (i24 == 4) | ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (sheetStateRememberModalBottomSheetState.getCurrentValue() != SheetValue.Expanded || !sheetStateRememberModalBottomSheetState.getHasPartiallyExpandedState()) {
                                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16273(sheetStateRememberModalBottomSheetState, null), 3, null);
                                        final Function0<Unit> function03 = function0;
                                        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                invoke2(th);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Throwable th) {
                                                function03.invoke();
                                            }
                                        });
                                    } else {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16251(animatable, null), 3, null);
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16262(sheetStateRememberModalBottomSheetState, null), 3, null);
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1 */
                                static final class C16251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Animatable<Float, AnimationVectors2> $predictiveBackProgress;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C16251(Animatable<Float, AnimationVectors2> animatable, Continuation<? super C16251> continuation) {
                                        super(2, continuation);
                                        this.$predictiveBackProgress = animatable;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C16251(this.$predictiveBackProgress, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C16251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            Animatable<Float, AnimationVectors2> animatable = this.$predictiveBackProgress;
                                            Float fBoxFloat = boxing.boxFloat(0.0f);
                                            this.label = 1;
                                            if (Animatable.animateTo$default(animatable, fBoxFloat, null, null, null, this, 14, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2 */
                                static final class C16262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C16262(SheetState sheetState, Continuation<? super C16262> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C16262(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C16262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.$sheetState;
                                            this.label = 1;
                                            if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3 */
                                static final class C16273 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C16273(SheetState sheetState, Continuation<? super C16273> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C16273(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C16273) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.$sheetState;
                                            this.label = 1;
                                            if (sheetState.hide(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function33 = function32;
                        final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                        ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) objRememberedValue5, properties, animatable, ComposableLambda3.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i25) {
                                if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-314673510, i25, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                    }
                                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                        }
                                    }, 1, null);
                                    long j9 = j6;
                                    Function0<Unit> function03 = function02;
                                    SheetState sheetState4 = sheetState3;
                                    Animatable<Float, AnimationVectors2> animatable2 = animatable;
                                    CoroutineScope coroutineScope2 = coroutineScope;
                                    Function1<Float, Unit> function12 = function1;
                                    Modifier modifier4 = modifier3;
                                    float f9 = f6;
                                    Shape shape5 = shape3;
                                    long j10 = j4;
                                    long j11 = j5;
                                    float f10 = f5;
                                    Function2<Composer, Integer, Unit> function28 = function24;
                                    Function2<Composer, Integer, WindowInsets> function29 = function25;
                                    Function3<Column5, Composer, Integer, Unit> function34 = function33;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierSemantics$default);
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
                                    ModalBottomSheetKt.m5888Scrim3JVO9M(j9, function03, sheetState4.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                    ModalBottomSheetKt.m5887ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function12, modifier4, sheetState4, f9, shape5, j10, j11, f10, function28, function29, function34, composer3, (Animatable.$stable << 3) | 6, 0, 0);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i21 & 112) | 3072 | (Animatable.$stable << 6));
                        composer2 = composerStartRestartGroup;
                        if (sheetStateRememberModalBottomSheetState.getHasExpandedState()) {
                            if ((i23 <= 256 || !composer2.changed(sheetStateRememberModalBottomSheetState)) && (i10 & 384) != 256) {
                                z = false;
                            }
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (z || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetStateRememberModalBottomSheetState, null);
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            EffectsKt.LaunchedEffect(sheetStateRememberModalBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer2, (i10 >> 6) & 14);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        modalBottomSheetProperties2 = properties;
                        modifier2 = modifier3;
                        f7 = f6;
                        shape4 = shape3;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        function26 = function24;
                        function27 = function25;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j7 = j;
                        j6 = j3;
                        composer2 = composerStartRestartGroup;
                        f7 = f3;
                        shape4 = shape2;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        j8 = jM5779contentColorForek8zF_U;
                        f8 = f2;
                        function26 = function2;
                        function27 = function22;
                        modalBottomSheetProperties2 = modalBottomSheetProperties;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final long j9 = j6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i25) {
                                ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function0, modifier4, sheetState2, f7, shape4, j7, j8, f8, j9, function26, function27, modalBottomSheetProperties2, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i21 |= 384;
                function32 = function3;
                if ((306783379 & i10) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        int i222 = i10;
                        if (i11 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        f6 = fM5713getSheetMaxWidthD9Ej5fM;
                        function24 = function2M5801getLambda1$material3_release;
                        function25 = function23;
                        shape3 = expandedShape;
                        j4 = containerColor;
                        modifier3 = modifier2;
                        j5 = jM5779contentColorForek8zF_U;
                        j6 = scrimColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        int i232 = (i10 & 896) ^ 384;
                        boolean z2 = true;
                        if (i232 <= 256) {
                            int i242 = i10 & 14;
                            zChangedInstance = ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i242 == 4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16301(sheetStateRememberModalBottomSheetState, null), 3, null);
                                            final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                            final Function0<Unit> function022 = function0;
                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Throwable th) {
                                                    if (sheetState32.isVisible()) {
                                                        return;
                                                    }
                                                    function022.invoke();
                                                }
                                            });
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                    static final class C16301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C16301(SheetState sheetState, Continuation<? super C16301> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new C16301(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((C16301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                SheetState sheetState = this.$sheetState;
                                                this.label = 1;
                                                if (sheetState.hide(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                final Function0<Unit> function022 = (Function0) objRememberedValue2;
                                if (i232 <= 256) {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i242 == 4);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                        objRememberedValue3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f9) {
                                                invoke(f9.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                            @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                            static final class C16321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ float $it;
                                                final /* synthetic */ SheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C16321(SheetState sheetState, float f, Continuation<? super C16321> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = sheetState;
                                                    this.$it = f;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new C16321(this.$sheetState, this.$it, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((C16321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.$sheetState;
                                                        float f = this.$it;
                                                        this.label = 1;
                                                        if (sheetState.settle$material3_release(f, this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            public final void invoke(float f9) {
                                                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16321(sheetStateRememberModalBottomSheetState, f9, null), 3, null);
                                                final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                final Function0<Unit> function03 = function0;
                                                jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                        invoke2(th);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Throwable th) {
                                                        if (sheetState32.isVisible()) {
                                                            return;
                                                        }
                                                        function03.invoke();
                                                    }
                                                });
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        final Function1<? super Float, Unit> function12 = (Function1) objRememberedValue3;
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == companion.getEmpty()) {
                                        }
                                        animatable = (Animatable) objRememberedValue4;
                                        if (i232 <= 256) {
                                            zChangedInstance3 = (i242 == 4) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                                objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (sheetStateRememberModalBottomSheetState.getCurrentValue() != SheetValue.Expanded || !sheetStateRememberModalBottomSheetState.getHasPartiallyExpandedState()) {
                                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16273(sheetStateRememberModalBottomSheetState, null), 3, null);
                                                            final Function0<Unit> function03 = function0;
                                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                                    invoke2(th);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Throwable th) {
                                                                    function03.invoke();
                                                                }
                                                            });
                                                        } else {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16251(animatable, null), 3, null);
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16262(sheetStateRememberModalBottomSheetState, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1 */
                                                    static final class C16251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ Animatable<Float, AnimationVectors2> $predictiveBackProgress;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C16251(Animatable<Float, AnimationVectors2> animatable, Continuation<? super C16251> continuation) {
                                                            super(2, continuation);
                                                            this.$predictiveBackProgress = animatable;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C16251(this.$predictiveBackProgress, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C16251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                Animatable<Float, AnimationVectors2> animatable = this.$predictiveBackProgress;
                                                                Float fBoxFloat = boxing.boxFloat(0.0f);
                                                                this.label = 1;
                                                                if (Animatable.animateTo$default(animatable, fBoxFloat, null, null, null, this, 14, null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2 */
                                                    static final class C16262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C16262(SheetState sheetState, Continuation<? super C16262> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C16262(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C16262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3 */
                                                    static final class C16273 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C16273(SheetState sheetState, Continuation<? super C16273> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C16273(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C16273) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (sheetState.hide(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function332 = function32;
                                                final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) objRememberedValue5, properties, animatable, ComposableLambda3.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i25) {
                                                        if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-314673510, i25, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                                            }
                                                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    invoke2(semanticsPropertyReceiver);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                                                }
                                                            }, 1, null);
                                                            long j92 = j6;
                                                            Function0<Unit> function03 = function022;
                                                            SheetState sheetState4 = sheetState32;
                                                            Animatable<Float, AnimationVectors2> animatable2 = animatable;
                                                            CoroutineScope coroutineScope2 = coroutineScope;
                                                            Function1<Float, Unit> function122 = function12;
                                                            Modifier modifier42 = modifier3;
                                                            float f9 = f6;
                                                            Shape shape5 = shape3;
                                                            long j10 = j4;
                                                            long j11 = j5;
                                                            float f10 = f5;
                                                            Function2<Composer, Integer, Unit> function28 = function24;
                                                            Function2<Composer, Integer, WindowInsets> function29 = function25;
                                                            Function3<Column5, Composer, Integer, Unit> function34 = function332;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierSemantics$default);
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
                                                            ModalBottomSheetKt.m5888Scrim3JVO9M(j92, function03, sheetState4.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                                            ModalBottomSheetKt.m5887ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function122, modifier42, sheetState4, f9, shape5, j10, j11, f10, function28, function29, function34, composer3, (Animatable.$stable << 3) | 6, 0, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i21 & 112) | 3072 | (Animatable.$stable << 6));
                                                composer2 = composerStartRestartGroup;
                                                if (sheetStateRememberModalBottomSheetState.getHasExpandedState()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                sheetState2 = sheetStateRememberModalBottomSheetState;
                                                modalBottomSheetProperties2 = properties;
                                                modifier2 = modifier3;
                                                f7 = f6;
                                                shape4 = shape3;
                                                j7 = j4;
                                                j8 = j5;
                                                f8 = f5;
                                                function26 = function24;
                                                function27 = function25;
                                            }
                                        } else {
                                            zChangedInstance3 = (i242 == 4) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                            }
                                        }
                                    }
                                } else {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i242 == 4);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                    }
                                }
                            }
                        } else {
                            int i2422 = i10 & 14;
                            zChangedInstance = ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i2422 == 4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            if ((i & 24576) == 0) {
            }
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i212 = i12;
            if ((i3 & 4096) == 0) {
            }
            function32 = function3;
            if ((306783379 & i10) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i2122 = i12;
        if ((i3 & 4096) == 0) {
        }
        function32 = function3;
        if ((306783379 & i10) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5887ModalBottomSheetContentIQkwcL4(final BoxScope boxScope, final Animatable<Float, AnimationVectors2> animatable, final CoroutineScope coroutineScope, final Function0<Unit> function0, final Function1<? super Float, Unit> function1, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        CoroutineScope coroutineScope2;
        int i5;
        Modifier modifier2;
        final SheetState sheetStateRememberModalBottomSheetState;
        int i6;
        float fM5713getSheetMaxWidthD9Ej5fM;
        Shape expandedShape;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long containerColor;
        long jM5779contentColorForek8zF_U;
        Function2<? super Composer, ? super Integer, Unit> function2M5802getLambda2$material3_release;
        int i17;
        Modifier modifier3;
        int i18;
        float f3;
        long j4;
        Shape shape2;
        float f4;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        Shape shape3;
        int i19;
        int i20;
        boolean z;
        Object objRememberedValue;
        long j5;
        boolean z2;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        boolean z4;
        Object objRememberedValue5;
        Composer composer2;
        final SheetState sheetState2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        final Shape shape4;
        final float f5;
        final Modifier modifier4;
        final float f6;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1676960531);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                coroutineScope2 = coroutineScope;
                i4 |= composerStartRestartGroup.changedInstance(coroutineScope2) ? 256 : 128;
            }
            int i22 = 1024;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                    i4 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) ? 1048576 : 524288;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 12582912;
                    fM5713getSheetMaxWidthD9Ej5fM = f;
                } else {
                    fM5713getSheetMaxWidthD9Ej5fM = f;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(fM5713getSheetMaxWidthD9Ej5fM) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 128) == 0) {
                        expandedShape = shape;
                        int i23 = composerStartRestartGroup.changed(expandedShape) ? 67108864 : 33554432;
                        i4 |= i23;
                    } else {
                        expandedShape = shape;
                    }
                    i4 |= i23;
                } else {
                    expandedShape = shape;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 256) == 0) {
                        i21 = i4;
                        int i24 = composerStartRestartGroup.changed(j) ? 536870912 : 268435456;
                        i7 = i21 | i24;
                    } else {
                        i21 = i4;
                    }
                    i7 = i21 | i24;
                } else {
                    i7 = i4;
                }
                if ((i2 & 6) == 0) {
                    j3 = j2;
                    i8 = (((i3 & 512) == 0 && composerStartRestartGroup.changed(j3)) ? 4 : 2) | i2;
                } else {
                    j3 = j2;
                    i8 = i2;
                }
                int i25 = i8;
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i12 = i25 | 48;
                    i10 = i9;
                } else if ((i2 & 48) == 0) {
                    i10 = i9;
                    i12 = i25 | (composerStartRestartGroup.changed(f2) ? 32 : 16);
                } else {
                    i10 = i9;
                    i11 = i25;
                    i13 = i7;
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i15 = i11 | 384;
                    } else {
                        int i26 = i11;
                        if ((i2 & 384) == 0) {
                            i15 = i26 | (composerStartRestartGroup.changedInstance(function2) ? 256 : 128);
                        } else {
                            i15 = i26;
                        }
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 4096) == 0 && composerStartRestartGroup.changedInstance(function22)) {
                            i22 = 2048;
                        }
                        i15 |= i22;
                    }
                    int i27 = i15;
                    if ((i3 & 8192) != 0) {
                        if ((i2 & 24576) == 0) {
                            i27 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                        }
                        if ((i13 & 306783379) != 306783378 || (i27 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i5 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 32) == 0) {
                                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                                    i16 = i13 & (-3670017);
                                } else {
                                    i16 = i13;
                                }
                                if (i6 != 0) {
                                    fM5713getSheetMaxWidthD9Ej5fM = BottomSheetDefaults.INSTANCE.m5713getSheetMaxWidthD9Ej5fM();
                                }
                                if ((i3 & 128) != 0) {
                                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                    i16 &= -234881025;
                                }
                                if ((i3 & 256) == 0) {
                                    i16 &= -1879048193;
                                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                } else {
                                    containerColor = j;
                                }
                                if ((i3 & 512) == 0) {
                                    jM5779contentColorForek8zF_U = ColorScheme2.m5779contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i16 >> 27) & 14);
                                    i27 &= -15;
                                } else {
                                    jM5779contentColorForek8zF_U = j2;
                                }
                                float fM5712getElevationD9Ej5fM = i10 == 0 ? BottomSheetDefaults.INSTANCE.m5712getElevationD9Ej5fM() : f2;
                                function2M5802getLambda2$material3_release = i14 == 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m5802getLambda2$material3_release() : function2;
                                int i28 = i16;
                                if ((i3 & 4096) == 0) {
                                    Modifier modifier5 = modifier2;
                                    i17 = i27 & (-7169);
                                    modifier3 = modifier5;
                                    float f7 = fM5712getElevationD9Ej5fM;
                                    function23 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1
                                        public final WindowInsets invoke(Composer composer3, int i29) {
                                            composer3.startReplaceGroup(-11444670);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-11444670, i29, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
                                            }
                                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return windowInsets;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                            return invoke(composer3, num.intValue());
                                        }
                                    };
                                    f3 = fM5713getSheetMaxWidthD9Ej5fM;
                                    j4 = containerColor;
                                    shape2 = expandedShape;
                                    f4 = f7;
                                    i18 = i28;
                                } else {
                                    Modifier modifier6 = modifier2;
                                    i17 = i27;
                                    modifier3 = modifier6;
                                    i18 = i28;
                                    f3 = fM5713getSheetMaxWidthD9Ej5fM;
                                    j4 = containerColor;
                                    shape2 = expandedShape;
                                    f4 = fM5712getElevationD9Ej5fM;
                                    function23 = function22;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i29 = (i3 & 32) != 0 ? i13 & (-3670017) : i13;
                                if ((i3 & 128) != 0) {
                                    i29 &= -234881025;
                                }
                                if ((i3 & 256) != 0) {
                                    i29 &= -1879048193;
                                }
                                if ((i3 & 512) != 0) {
                                    i27 &= -15;
                                }
                                if ((i3 & 4096) != 0) {
                                    i27 &= -7169;
                                }
                                Modifier modifier7 = modifier2;
                                i17 = i27;
                                modifier3 = modifier7;
                                function2M5802getLambda2$material3_release = function2;
                                function23 = function22;
                                i18 = i29;
                                jM5779contentColorForek8zF_U = j3;
                                f3 = fM5713getSheetMaxWidthD9Ej5fM;
                                shape2 = expandedShape;
                                j4 = j;
                                f4 = f2;
                            }
                            composerStartRestartGroup.endDefaults();
                            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function26 = function23;
                            if (ComposerKt.isTraceInProgress()) {
                                shape3 = shape2;
                            } else {
                                shape3 = shape2;
                                ComposerKt.traceEventStart(-1676960531, i18, i17, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            final String strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_pane_title), composerStartRestartGroup, 0);
                            Modifier modifier8 = modifier3;
                            i19 = i18;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5176widthInVpY3zN4$default(boxScope.align(modifier3, Alignment.INSTANCE.getTopCenter()), 0.0f, f3, 1, null), 0.0f, 1, null);
                            i20 = (i19 & 3670016) ^ 1572864;
                            z = (i20 <= 1048576 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i19 & 1572864) == 1048576;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetStateRememberModalBottomSheetState, Orientation.Vertical, function1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            float f8 = f3;
                            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollModifier) objRememberedValue, null, 2, null);
                            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release();
                            Orientation orientation = Orientation.Vertical;
                            if (i20 > 1048576 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) {
                                j5 = j4;
                                if ((i19 & 1572864) != 1048576) {
                                    z2 = false;
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function2<IntSize, Constraints, Tuples2<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[SheetValue.values().length];
                                                try {
                                                    iArr[SheetValue.Hidden.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[SheetValue.Expanded.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                $EnumSwitchMapping$0 = iArr;
                                            }
                                        }

                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Tuples2<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                            return m5890invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                        }

                                        /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                        public final Tuples2<DraggableAnchors<SheetValue>, SheetValue> m5890invokeGpV2Q24(final long j8, long j9) {
                                            SheetValue sheetValue;
                                            final float fM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j9);
                                            final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                            DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                    invoke2(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.m149at(SheetValue.Hidden, fM7974getMaxHeightimpl);
                                                    if (IntSize.m8059getHeightimpl(j8) > fM7974getMaxHeightimpl / 2 && !sheetState3.getSkipPartiallyExpanded()) {
                                                        draggableAnchorsConfig.m149at(SheetValue.PartiallyExpanded, fM7974getMaxHeightimpl / 2.0f);
                                                    }
                                                    if (IntSize.m8059getHeightimpl(j8) != 0) {
                                                        draggableAnchorsConfig.m149at(SheetValue.Expanded, Math.max(0.0f, fM7974getMaxHeightimpl - IntSize.m8059getHeightimpl(j8)));
                                                    }
                                                }
                                            });
                                            int i30 = WhenMappings.$EnumSwitchMapping$0[sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                            if (i30 == 1) {
                                                sheetValue = SheetValue.Hidden;
                                            } else if (i30 == 2 || i30 == 3) {
                                                sheetValue = SheetValue.PartiallyExpanded;
                                                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                                                    sheetValue = SheetValue.Expanded;
                                                    if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                                                        sheetValue = SheetValue.Hidden;
                                                    }
                                                }
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return Tuples4.m3642to(DraggableAnchors, sheetValue);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                Modifier modifierDraggableAnchors = AnchoredDraggableKt.draggableAnchors(modifierNestedScroll$default, anchoredDraggableState$material3_release, orientation, (Function2) objRememberedValue2);
                                DraggableState draggableState = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getDraggableState();
                                boolean zIsVisible = sheetStateRememberModalBottomSheetState.isVisible();
                                boolean zIsAnimationRunning = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                z3 = (i19 & 57344) != 16384;
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                Modifier modifierDraggable$default = DraggableKt.draggable$default(modifierDraggableAnchors, draggableState, orientation, zIsVisible, null, zIsAnimationRunning, null, (Function3) objRememberedValue3, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
                                zChanged = composerStartRestartGroup.changed(strM6095getString2EP1pXo);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM6095getString2EP1pXo);
                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierDraggable$default, false, (Function1) objRememberedValue4, 1, null);
                                z4 = ((i20 <= 1048576 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i19 & 1572864) == 1048576) | ((i19 & 112) == 32 || ((i19 & 64) != 0 && composerStartRestartGroup.changedInstance(animatable)));
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!z4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            float offset = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getOffset();
                                            float fM6580getHeightimpl = Size.m6580getHeightimpl(graphicsLayerScope.getSize());
                                            if (Float.isNaN(offset) || Float.isNaN(fM6580getHeightimpl) || fM6580getHeightimpl == 0.0f) {
                                                return;
                                            }
                                            float fFloatValue = animatable.getValue().floatValue();
                                            graphicsLayerScope.setScaleX(ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue));
                                            graphicsLayerScope.setScaleY(ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue));
                                            graphicsLayerScope.mo6764setTransformOrigin__ExYCQ(TransformOrigin2.TransformOrigin(0.5f, (offset + fM6580getHeightimpl) / fM6580getHeightimpl));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function2M5802getLambda2$material3_release;
                                int i30 = i19 >> 21;
                                int i31 = i17 << 9;
                                int i32 = (57344 & i31) | (i30 & 896) | (i30 & 112) | 12582912 | (i31 & 7168);
                                Shape shape5 = shape3;
                                long j8 = jM5779contentColorForek8zF_U;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m5967SurfaceT9BRK9s(GraphicsLayerModifier6.graphicsLayer(modifierSemantics$default, (Function1) objRememberedValue5), shape5, j5, j8, f4, 0.0f, null, ComposableLambda3.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i33) {
                                        if ((i33 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-692668920, i33, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), function26.invoke(composer3, 0));
                                        boolean zChangedInstance = composer3.changedInstance(animatable);
                                        final Animatable<Float, AnimationVectors2> animatable2 = animatable;
                                        Object objRememberedValue6 = composer3.rememberedValue();
                                        if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                    float fFloatValue = animatable2.getValue().floatValue();
                                                    float fCalculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue);
                                                    float fCalculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue);
                                                    graphicsLayerScope.setScaleY(fCalculatePredictiveBackScaleY == 0.0f ? 1.0f : fCalculatePredictiveBackScaleX / fCalculatePredictiveBackScaleY);
                                                    graphicsLayerScope.mo6764setTransformOrigin__ExYCQ(ModalBottomSheetKt.PredictiveBackChildTransformOrigin);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue6);
                                        }
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierWindowInsetsPadding, (Function1) objRememberedValue6);
                                        Function2<Composer, Integer, Unit> function28 = function27;
                                        final SheetState sheetState4 = sheetState3;
                                        final Function0<Unit> function02 = function0;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        Function3<Column5, Composer, Integer, Unit> function32 = function3;
                                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierGraphicsLayer);
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
                                        composer3.startReplaceGroup(-1636564008);
                                        if (function28 != null) {
                                            Strings.Companion companion5 = Strings.INSTANCE;
                                            final String strM6095getString2EP1pXo2 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_collapse_description), composer3, 0);
                                            final String strM6095getString2EP1pXo3 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                                            final String strM6095getString2EP1pXo4 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_expand_description), composer3, 0);
                                            Modifier modifierAlign = column6.align(companion2, companion3.getCenterHorizontally());
                                            boolean zChanged2 = composer3.changed(sheetState4) | composer3.changed(strM6095getString2EP1pXo3) | composer3.changed(function02) | composer3.changed(strM6095getString2EP1pXo4) | composer3.changedInstance(coroutineScope4) | composer3.changed(strM6095getString2EP1pXo2);
                                            Object objRememberedValue7 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        final SheetState sheetState5 = sheetState4;
                                                        String str = strM6095getString2EP1pXo3;
                                                        String str2 = strM6095getString2EP1pXo4;
                                                        String str3 = strM6095getString2EP1pXo2;
                                                        final Function0<Unit> function03 = function02;
                                                        final CoroutineScope coroutineScope5 = coroutineScope4;
                                                        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                function03.invoke();
                                                                return Boolean.TRUE;
                                                            }
                                                        });
                                                        if (sheetState5.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* compiled from: ModalBottomSheet.kt */
                                                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
                                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1 */
                                                                static final class C16341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ SheetState $sheetState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C16341(SheetState sheetState, Continuation<? super C16341> continuation) {
                                                                        super(2, continuation);
                                                                        this.$sheetState = sheetState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C16341(this.$sheetState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C16341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            SheetState sheetState = this.$sheetState;
                                                                            this.label = 1;
                                                                            if (sheetState.expand(this) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        } else {
                                                                            if (i != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            ResultKt.throwOnFailure(obj);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C16341(sheetState5, null), 3, null);
                                                                    }
                                                                    return Boolean.TRUE;
                                                                }
                                                            });
                                                        } else if (sheetState5.getHasPartiallyExpandedState()) {
                                                            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C16351(sheetState5, null), 3, null);
                                                                    }
                                                                    return Boolean.TRUE;
                                                                }

                                                                /* compiled from: ModalBottomSheet.kt */
                                                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                                @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", m3645f = "ModalBottomSheet.kt", m3646l = {330}, m3647m = "invokeSuspend")
                                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1 */
                                                                static final class C16351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ SheetState $this_with;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C16351(SheetState sheetState, Continuation<? super C16351> continuation) {
                                                                        super(2, continuation);
                                                                        this.$this_with = sheetState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C16351(this.$this_with, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C16351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            SheetState sheetState = this.$this_with;
                                                                            this.label = 1;
                                                                            if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        } else {
                                                                            if (i != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            ResultKt.throwOnFailure(obj);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue7);
                                            }
                                            Modifier modifierSemantics = SemanticsModifier6.semantics(modifierAlign, true, (Function1) objRememberedValue7);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierSemantics);
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
                                            function28.invoke(composer3, 0);
                                            composer3.endNode();
                                        }
                                        composer3.endReplaceGroup();
                                        function32.invoke(column6, composer3, 6);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composer2, i32, 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                sheetState2 = sheetState3;
                                function24 = function27;
                                function25 = function26;
                                shape4 = shape5;
                                f5 = f4;
                                modifier4 = modifier8;
                                f6 = f8;
                                j6 = j8;
                                j7 = j5;
                            } else {
                                j5 = j4;
                            }
                            z2 = true;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                                objRememberedValue2 = new Function2<IntSize, Constraints, Tuples2<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[SheetValue.values().length];
                                            try {
                                                iArr[SheetValue.Hidden.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[SheetValue.Expanded.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Tuples2<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                        return m5890invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                    }

                                    /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                    public final Tuples2<DraggableAnchors<SheetValue>, SheetValue> m5890invokeGpV2Q24(final long j82, long j9) {
                                        SheetValue sheetValue;
                                        final float fM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j9);
                                        final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                invoke2(draggableAnchorsConfig);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                draggableAnchorsConfig.m149at(SheetValue.Hidden, fM7974getMaxHeightimpl);
                                                if (IntSize.m8059getHeightimpl(j82) > fM7974getMaxHeightimpl / 2 && !sheetState32.getSkipPartiallyExpanded()) {
                                                    draggableAnchorsConfig.m149at(SheetValue.PartiallyExpanded, fM7974getMaxHeightimpl / 2.0f);
                                                }
                                                if (IntSize.m8059getHeightimpl(j82) != 0) {
                                                    draggableAnchorsConfig.m149at(SheetValue.Expanded, Math.max(0.0f, fM7974getMaxHeightimpl - IntSize.m8059getHeightimpl(j82)));
                                                }
                                            }
                                        });
                                        int i302 = WhenMappings.$EnumSwitchMapping$0[sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                        if (i302 == 1) {
                                            sheetValue = SheetValue.Hidden;
                                        } else if (i302 == 2 || i302 == 3) {
                                            sheetValue = SheetValue.PartiallyExpanded;
                                            if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                                                sheetValue = SheetValue.Expanded;
                                                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                                                    sheetValue = SheetValue.Hidden;
                                                }
                                            }
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Tuples4.m3642to(DraggableAnchors, sheetValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                Modifier modifierDraggableAnchors2 = AnchoredDraggableKt.draggableAnchors(modifierNestedScroll$default, anchoredDraggableState$material3_release, orientation, (Function2) objRememberedValue2);
                                DraggableState draggableState2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getDraggableState();
                                boolean zIsVisible2 = sheetStateRememberModalBottomSheetState.isVisible();
                                boolean zIsAnimationRunning2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                if ((i19 & 57344) != 16384) {
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z3) {
                                    objRememberedValue3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    Modifier modifierDraggable$default2 = DraggableKt.draggable$default(modifierDraggableAnchors2, draggableState2, orientation, zIsVisible2, null, zIsAnimationRunning2, null, (Function3) objRememberedValue3, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
                                    zChanged = composerStartRestartGroup.changed(strM6095getString2EP1pXo);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM6095getString2EP1pXo);
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierDraggable$default2, false, (Function1) objRememberedValue4, 1, null);
                                        if (i20 <= 1048576) {
                                            if ((i19 & 112) == 32) {
                                                z4 = ((i20 <= 1048576 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i19 & 1572864) == 1048576) | ((i19 & 112) == 32 || ((i19 & 64) != 0 && composerStartRestartGroup.changedInstance(animatable)));
                                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                if (!z4) {
                                                    objRememberedValue5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            invoke2(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                            float offset = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getOffset();
                                                            float fM6580getHeightimpl = Size.m6580getHeightimpl(graphicsLayerScope.getSize());
                                                            if (Float.isNaN(offset) || Float.isNaN(fM6580getHeightimpl) || fM6580getHeightimpl == 0.0f) {
                                                                return;
                                                            }
                                                            float fFloatValue = animatable.getValue().floatValue();
                                                            graphicsLayerScope.setScaleX(ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue));
                                                            graphicsLayerScope.setScaleY(ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue));
                                                            graphicsLayerScope.mo6764setTransformOrigin__ExYCQ(TransformOrigin2.TransformOrigin(0.5f, (offset + fM6580getHeightimpl) / fM6580getHeightimpl));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                    final CoroutineScope coroutineScope32 = coroutineScope2;
                                                    final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                    final Function2<? super Composer, ? super Integer, Unit> function272 = function2M5802getLambda2$material3_release;
                                                    int i302 = i19 >> 21;
                                                    int i312 = i17 << 9;
                                                    int i322 = (57344 & i312) | (i302 & 896) | (i302 & 112) | 12582912 | (i312 & 7168);
                                                    Shape shape52 = shape3;
                                                    long j82 = jM5779contentColorForek8zF_U;
                                                    composer2 = composerStartRestartGroup;
                                                    SurfaceKt.m5967SurfaceT9BRK9s(GraphicsLayerModifier6.graphicsLayer(modifierSemantics$default2, (Function1) objRememberedValue5), shape52, j5, j82, f4, 0.0f, null, ComposableLambda3.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                            invoke(composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer3, int i33) {
                                                            if ((i33 & 3) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-692668920, i33, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                                            }
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), function26.invoke(composer3, 0));
                                                            boolean zChangedInstance = composer3.changedInstance(animatable);
                                                            final Animatable<Float, AnimationVectors2> animatable2 = animatable;
                                                            Object objRememberedValue6 = composer3.rememberedValue();
                                                            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        invoke2(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                        float fFloatValue = animatable2.getValue().floatValue();
                                                                        float fCalculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue);
                                                                        float fCalculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue);
                                                                        graphicsLayerScope.setScaleY(fCalculatePredictiveBackScaleY == 0.0f ? 1.0f : fCalculatePredictiveBackScaleX / fCalculatePredictiveBackScaleY);
                                                                        graphicsLayerScope.mo6764setTransformOrigin__ExYCQ(ModalBottomSheetKt.PredictiveBackChildTransformOrigin);
                                                                    }
                                                                };
                                                                composer3.updateRememberedValue(objRememberedValue6);
                                                            }
                                                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierWindowInsetsPadding, (Function1) objRememberedValue6);
                                                            Function2<Composer, Integer, Unit> function28 = function272;
                                                            final SheetState sheetState4 = sheetState32;
                                                            final Function0<Unit> function02 = function0;
                                                            final CoroutineScope coroutineScope4 = coroutineScope32;
                                                            Function3<Column5, Composer, Integer, Unit> function32 = function3;
                                                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierGraphicsLayer);
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
                                                            composer3.startReplaceGroup(-1636564008);
                                                            if (function28 != null) {
                                                                Strings.Companion companion5 = Strings.INSTANCE;
                                                                final String strM6095getString2EP1pXo2 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_collapse_description), composer3, 0);
                                                                final String strM6095getString2EP1pXo3 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                                                                final String strM6095getString2EP1pXo4 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_expand_description), composer3, 0);
                                                                Modifier modifierAlign = column6.align(companion2, companion3.getCenterHorizontally());
                                                                boolean zChanged2 = composer3.changed(sheetState4) | composer3.changed(strM6095getString2EP1pXo3) | composer3.changed(function02) | composer3.changed(strM6095getString2EP1pXo4) | composer3.changedInstance(coroutineScope4) | composer3.changed(strM6095getString2EP1pXo2);
                                                                Object objRememberedValue7 = composer3.rememberedValue();
                                                                if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            invoke2(semanticsPropertyReceiver);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            final SheetState sheetState5 = sheetState4;
                                                                            String str = strM6095getString2EP1pXo3;
                                                                            String str2 = strM6095getString2EP1pXo4;
                                                                            String str3 = strM6095getString2EP1pXo2;
                                                                            final Function0<Unit> function03 = function02;
                                                                            final CoroutineScope coroutineScope5 = coroutineScope4;
                                                                            SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(0);
                                                                                }

                                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Boolean invoke() {
                                                                                    function03.invoke();
                                                                                    return Boolean.TRUE;
                                                                                }
                                                                            });
                                                                            if (sheetState5.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    {
                                                                                        super(0);
                                                                                    }

                                                                                    /* compiled from: ModalBottomSheet.kt */
                                                                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", m3645f = "ModalBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
                                                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1 */
                                                                                    static final class C16341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                        final /* synthetic */ SheetState $sheetState;
                                                                                        int label;

                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        C16341(SheetState sheetState, Continuation<? super C16341> continuation) {
                                                                                            super(2, continuation);
                                                                                            this.$sheetState = sheetState;
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                            return new C16341(this.$sheetState, continuation);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                            return ((C16341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                            int i = this.label;
                                                                                            if (i == 0) {
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                SheetState sheetState = this.$sheetState;
                                                                                                this.label = 1;
                                                                                                if (sheetState.expand(this) == coroutine_suspended) {
                                                                                                    return coroutine_suspended;
                                                                                                }
                                                                                            } else {
                                                                                                if (i != 1) {
                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                }
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }

                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final Boolean invoke() {
                                                                                        if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C16341(sheetState5, null), 3, null);
                                                                                        }
                                                                                        return Boolean.TRUE;
                                                                                    }
                                                                                });
                                                                            } else if (sheetState5.getHasPartiallyExpandedState()) {
                                                                                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    {
                                                                                        super(0);
                                                                                    }

                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final Boolean invoke() {
                                                                                        if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C16351(sheetState5, null), 3, null);
                                                                                        }
                                                                                        return Boolean.TRUE;
                                                                                    }

                                                                                    /* compiled from: ModalBottomSheet.kt */
                                                                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                                                                                    @DebugMetadata(m3644c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", m3645f = "ModalBottomSheet.kt", m3646l = {330}, m3647m = "invokeSuspend")
                                                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1 */
                                                                                    static final class C16351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                        final /* synthetic */ SheetState $this_with;
                                                                                        int label;

                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        C16351(SheetState sheetState, Continuation<? super C16351> continuation) {
                                                                                            super(2, continuation);
                                                                                            this.$this_with = sheetState;
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                            return new C16351(this.$this_with, continuation);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                            return ((C16351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                            int i = this.label;
                                                                                            if (i == 0) {
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                SheetState sheetState = this.$this_with;
                                                                                                this.label = 1;
                                                                                                if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                                                    return coroutine_suspended;
                                                                                                }
                                                                                            } else {
                                                                                                if (i != 1) {
                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                }
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }
                                                                                });
                                                                            }
                                                                        }
                                                                    };
                                                                    composer3.updateRememberedValue(objRememberedValue7);
                                                                }
                                                                Modifier modifierSemantics = SemanticsModifier6.semantics(modifierAlign, true, (Function1) objRememberedValue7);
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierSemantics);
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
                                                                function28.invoke(composer3, 0);
                                                                composer3.endNode();
                                                            }
                                                            composer3.endReplaceGroup();
                                                            function32.invoke(column6, composer3, 6);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composerStartRestartGroup, 54), composer2, i322, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    sheetState2 = sheetState32;
                                                    function24 = function272;
                                                    function25 = function26;
                                                    shape4 = shape52;
                                                    f5 = f4;
                                                    modifier4 = modifier8;
                                                    f6 = f8;
                                                    j6 = j82;
                                                    j7 = j5;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f5 = f2;
                            function25 = function22;
                            composer2 = composerStartRestartGroup;
                            sheetState2 = sheetStateRememberModalBottomSheetState;
                            modifier4 = modifier2;
                            function24 = function2;
                            long j9 = j3;
                            f6 = fM5713getSheetMaxWidthD9Ej5fM;
                            j7 = j;
                            shape4 = expandedShape;
                            j6 = j9;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i33) {
                                    ModalBottomSheetKt.m5887ModalBottomSheetContentIQkwcL4(boxScope, animatable, coroutineScope, function0, function1, modifier4, sheetState2, f6, shape4, j7, j6, f5, function24, function25, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i27 |= 24576;
                    if ((i13 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i3 & 128) != 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if ((i3 & 512) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            int i282 = i16;
                            if ((i3 & 4096) == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function262 = function23;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Strings.Companion companion2 = Strings.INSTANCE;
                            final String strM6095getString2EP1pXo2 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_bottom_sheet_pane_title), composerStartRestartGroup, 0);
                            Modifier modifier82 = modifier3;
                            i19 = i18;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5176widthInVpY3zN4$default(boxScope.align(modifier3, Alignment.INSTANCE.getTopCenter()), 0.0f, f3, 1, null), 0.0f, 1, null);
                            i20 = (i19 & 3670016) ^ 1572864;
                            if (i20 <= 1048576) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z) {
                                    objRememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetStateRememberModalBottomSheetState, Orientation.Vertical, function1);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    float f82 = f3;
                                    Modifier modifierNestedScroll$default2 = NestedScrollModifier7.nestedScroll$default(modifierFillMaxWidth$default2, (NestedScrollModifier) objRememberedValue, null, 2, null);
                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release();
                                    Orientation orientation2 = Orientation.Vertical;
                                    if (i20 > 1048576) {
                                        j5 = j4;
                                        if ((i19 & 1572864) != 1048576) {
                                            z2 = true;
                                        }
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z2) {
                                        }
                                    }
                                }
                            } else {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i11 = i12;
                i13 = i7;
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i272 = i15;
                if ((i3 & 8192) != 0) {
                }
                if ((i13 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            int i252 = i8;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            i11 = i12;
            i13 = i7;
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i2722 = i15;
            if ((i3 & 8192) != 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        coroutineScope2 = coroutineScope;
        int i222 = 1024;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        int i2522 = i8;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        i11 = i12;
        i13 = i7;
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i27222 = i15;
        if ((i3 & 8192) != 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float fM6583getWidthimpl = Size.m6583getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM6583getWidthimpl) || fM6583getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpers.lerp(0.0f, Math.min(graphicsLayerScope.mo5016toPx0680j_4(PredictiveBackMaxScaleXDistance), fM6583getWidthimpl), f) / fM6583getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float fM6580getHeightimpl = Size.m6580getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM6580getHeightimpl) || fM6580getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpers.lerp(0.0f, Math.min(graphicsLayerScope.mo5016toPx0680j_4(PredictiveBackMaxScaleYDistance), fM6580getHeightimpl), f) / fM6580getHeightimpl);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m5888Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(951870469);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j != 16) {
                int i3 = i2;
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Strings.Companion companion = Strings.INSTANCE;
                final String strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(androidx.compose.p011ui.R$string.close_sheet), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1785653838);
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierThen = companion2.then(new SuspendPointerInputElement(function0, null, null, new C1842xe3d9cdbd((Function2) objRememberedValue), 6, null));
                    boolean zChanged = composerStartRestartGroup.changed(strM6095getString2EP1pXo) | (i4 == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM6095getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    modifierSemantics = SemanticsModifier6.semantics(modifierThen, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | ((i3 & 14) == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            DrawScope.m6958drawRectnJ9OG0$default(drawScope, j, 0L, 0L, RangesKt.coerceIn(ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(snapshotState4AnimateFloatAsState), 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Canvas2.Canvas(modifierThen2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ModalBottomSheetKt.m5888Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
