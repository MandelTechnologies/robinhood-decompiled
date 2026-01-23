package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.ProvideContentColorTextStyle;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.Velocity2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: AppBar.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ar\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u007f\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0089\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0089\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a-\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001eH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0083\u0001\u0010+\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a¡\u0001\u00101\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010,\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010.\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u0094\u0001\u0010A\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010&\u001a\u00020%2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020=2\u0006\u0010>\u001a\u00020'2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a@\u0010I\u001a\u00020H2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\u001e2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010D2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010FH\u0082@¢\u0006\u0004\bI\u0010J\"\u0014\u0010K\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\"\u001a\u0010M\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bN\u0010O\"\u0014\u0010P\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010L\"\u0014\u0010Q\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010L\"\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0014\u0010W\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010L\"\u0014\u0010X\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010L\"\u0014\u0010Y\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010L\"\u0014\u0010Z\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]²\u0006\f\u0010[\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010\\\u001a\u0002048\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/TopAppBarColors;", "colors", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "TopAppBar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "expandedHeight", "TopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar-GHTll3U", "CenterAlignedTopAppBar", "collapsedHeight", "MediumTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumTopAppBar", "LargeTopAppBar-oKE7A98", "LargeTopAppBar", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "Landroidx/compose/material3/TopAppBarState;", "rememberTopAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "Landroidx/compose/ui/text/TextStyle;", "titleTextStyle", "", "centeredTitle", "SingleRowTopAppBar-cJHQLPU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SingleRowTopAppBar", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "TwoRowsTopAppBar-nS6u9G4", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "TwoRowsTopAppBar", "Landroidx/compose/material3/ScrolledOffset;", "scrolledOffset", "Landroidx/compose/ui/graphics/Color;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleHorizontalArrangement", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TopAppBarLayout", "state", "velocity", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Velocity;", "settleAppBar", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BottomAppBarHorizontalPadding", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "Landroidx/compose/animation/core/CubicBezierEasing;", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "MediumTitleBottomPadding", "LargeTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "colorTransitionFraction", "appBarContainerColor", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* compiled from: AppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material3.AppBarKt", m3645f = "AppBar.kt", m3646l = {2501, 2515}, m3647m = "settleAppBar")
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1 */
    /* loaded from: classes4.dex */
    static final class C15441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C15441(Continuation<? super C15441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2 function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function2M5785getLambda1$material3_release;
        int i5;
        Function3 function3M5792getLambda2$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function32;
        WindowInsets windowInsets3;
        Modifier modifier3;
        Function2 function24;
        int i7;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors4;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906353009);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M5785getLambda1$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M5785getLambda1$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M5792getLambda2$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M5792getLambda2$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function25 = function2M5785getLambda1$material3_release;
                            function33 = function3M5792getLambda2$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M5785getLambda1$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5785getLambda1$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M5792getLambda2$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5792getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    function24 = function2M5785getLambda1$material3_release;
                                    function32 = function3M5792getLambda2$material3_release;
                                    modifier3 = modifier5;
                                } else {
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    function32 = function3M5792getLambda2$material3_release;
                                    windowInsets3 = windowInsets2;
                                    modifier3 = modifier5;
                                    function24 = function2M5785getLambda1$material3_release;
                                }
                                i7 = 1906353009;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i7 = 1906353009;
                                function32 = function3M5792getLambda2$material3_release;
                                windowInsets3 = windowInsets2;
                                modifier3 = modifier2;
                                function24 = function2M5785getLambda1$material3_release;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
                            }
                            int i11 = (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i12 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m5704TopAppBarGHTll3U(function23, modifier3, function24, function32, TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer2, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors4 = topAppBarColors3;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.1
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

                                public final void invoke(Composer composer3, int i13) {
                                    AppBarKt.TopAppBar(function2, modifier4, function25, function33, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            i7 = 1906353009;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i122 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m5704TopAppBarGHTll3U(function23, modifier3, function24, function32, TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer2, i112 | (458752 & i122) | (3670016 & i122) | (i122 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors4 = topAppBarColors3;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M5792getLambda2$material3_release = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M5785getLambda1$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M5792getLambda2$material3_release = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M5785getLambda1$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M5792getLambda2$material3_release = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5704TopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M5793getLambda3$material3_release;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M5794getLambda4$material3_release;
        int i6;
        float fM6087getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        float f2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Composer composer2;
        final float f3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors4;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(226148675);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M5793getLambda3$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M5793getLambda3$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M5794getLambda4$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M5794getLambda4$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM6087getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                int i12 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                                i3 |= i12;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                int i13 = composerStartRestartGroup.changed(topAppBarColors2) ? 1048576 : 524288;
                                i3 |= i13;
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i3 |= i13;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i14 = i3;
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function2M5793getLambda3$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5793getLambda3$material3_release();
                                    }
                                    if (i5 != 0) {
                                        function3M5794getLambda4$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5794getLambda4$material3_release();
                                    }
                                    if (i6 != 0) {
                                        fM6087getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) == 0) {
                                        i9 = i14 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    } else {
                                        i9 = i14;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                    }
                                    if (i8 == 0) {
                                        modifier3 = modifier5;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = modifier5;
                                    }
                                    function32 = function3M5794getLambda4$material3_release;
                                    f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    i10 = 226148675;
                                    function24 = function2M5793getLambda3$material3_release;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    int i15 = (i2 & 32) != 0 ? i14 & (-458753) : i14;
                                    if ((i2 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3M5794getLambda4$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    i10 = 226148675;
                                    i9 = i15;
                                    function24 = function2M5793getLambda3$material3_release;
                                    f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i9, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
                                }
                                TextStyle value = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                C2002Dp.Companion companion = C2002Dp.INSTANCE;
                                int i16 = i9 << 6;
                                composer2 = composerStartRestartGroup;
                                m5703SingleRowTopAppBarcJHQLPU(modifier3, function23, value, false, function24, function32, (!C2002Dp.m7997equalsimpl0(f2, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f2, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (57344 & i16) | (458752 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f2;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                function25 = function2M5793getLambda3$material3_release;
                                function33 = function3M5794getLambda4$material3_release;
                                f3 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets4 = windowInsets2;
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.2
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

                                    public final void invoke(Composer composer3, int i17) {
                                        AppBarKt.m5704TopAppBarGHTll3U(function2, modifier4, function25, function33, f3, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i7;
                        int i142 = i3;
                        if ((i3 & 4793491) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                function32 = function3M5794getLambda4$material3_release;
                                f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                i10 = 226148675;
                                function24 = function2M5793getLambda3$material3_release;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TextStyle value2 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                C2002Dp.Companion companion2 = C2002Dp.INSTANCE;
                                if (C2002Dp.m7997equalsimpl0(f2, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                    int i162 = i9 << 6;
                                    composer2 = composerStartRestartGroup;
                                    m5703SingleRowTopAppBarcJHQLPU(modifier3, function23, value2, false, function24, function32, (!C2002Dp.m7997equalsimpl0(f2, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f2, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (57344 & i162) | (458752 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f3 = f2;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors4 = topAppBarColors3;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i7;
                    int i1422 = i3;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M5794getLambda4$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                int i14222 = i3;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M5793getLambda3$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M5794getLambda4$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            int i142222 = i3;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M5793getLambda3$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M5794getLambda4$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        int i1422222 = i3;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5700CenterAlignedTopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M5795getLambda7$material3_release;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M5796getLambda8$material3_release;
        int i6;
        float fM6087getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors;
        int i7;
        int i8;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        float f2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Composer composer2;
        final float f3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1952988048);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M5795getLambda7$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M5795getLambda7$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M5796getLambda8$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M5796getLambda8$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM6087getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                int i12 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                                i3 |= i12;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                                int i13 = composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors) ? 1048576 : 524288;
                                i3 |= i13;
                            } else {
                                topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                            }
                            i3 |= i13;
                        } else {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i14 = i3;
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function2M5795getLambda7$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5795getLambda7$material3_release();
                                    }
                                    if (i5 != 0) {
                                        function3M5796getLambda8$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5796getLambda8$material3_release();
                                    }
                                    if (i6 != 0) {
                                        fM6087getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) == 0) {
                                        i9 = i14 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    } else {
                                        i9 = i14;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                        topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                                    }
                                    if (i8 == 0) {
                                        modifier3 = modifier5;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = modifier5;
                                    }
                                    function32 = function3M5796getLambda8$material3_release;
                                    f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    i10 = 1952988048;
                                    function24 = function2M5795getLambda7$material3_release;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    int i15 = (i2 & 32) != 0 ? i14 & (-458753) : i14;
                                    if ((i2 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3M5796getLambda8$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    i10 = 1952988048;
                                    i9 = i15;
                                    function24 = function2M5795getLambda7$material3_release;
                                    f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i9, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                                }
                                TextStyle value = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                C2002Dp.Companion companion = C2002Dp.INSTANCE;
                                int i16 = i9 << 6;
                                composer2 = composerStartRestartGroup;
                                m5703SingleRowTopAppBarcJHQLPU(modifier3, function23, value, true, function24, function32, (!C2002Dp.m7997equalsimpl0(f2, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f2, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (57344 & i16) | (458752 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f2;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets4 = windowInsets3;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                function25 = function2M5795getLambda7$material3_release;
                                function33 = function3M5796getLambda8$material3_release;
                                f3 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets4 = windowInsets2;
                                topAppBarColors3 = topAppBarColorsCenterAlignedTopAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$2
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

                                    public final void invoke(Composer composer3, int i17) {
                                        AppBarKt.m5700CenterAlignedTopAppBarGHTll3U(function2, modifier4, function25, function33, f3, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i7;
                        int i142 = i3;
                        if ((i3 & 4793491) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                function32 = function3M5796getLambda8$material3_release;
                                f2 = fM6087getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                i10 = 1952988048;
                                function24 = function2M5795getLambda7$material3_release;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TextStyle value2 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                C2002Dp.Companion companion2 = C2002Dp.INSTANCE;
                                if (C2002Dp.m7997equalsimpl0(f2, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                    int i162 = i9 << 6;
                                    composer2 = composerStartRestartGroup;
                                    m5703SingleRowTopAppBarcJHQLPU(modifier3, function23, value2, true, function24, function32, (!C2002Dp.m7997equalsimpl0(f2, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f2, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6087getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (57344 & i162) | (458752 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f3 = f2;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i7;
                    int i1422 = i3;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M5796getLambda8$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                int i14222 = i3;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M5795getLambda7$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M5796getLambda8$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            int i142222 = i3;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M5795getLambda7$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M5796getLambda8$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM6087getTopAppBarExpandedHeightD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        int i1422222 = i3;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5702MediumTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M5786getLambda11$material3_release;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M5787getLambda12$material3_release;
        int i6;
        float fM6085getMediumAppBarCollapsedHeightD9Ej5fM;
        int i7;
        float fM6086getMediumAppBarExpandedHeightD9Ej5fM;
        int i8;
        int i9;
        WindowInsets windowInsets2;
        int i10;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        float f3;
        Modifier modifier3;
        int i11;
        Composer composer2;
        final float f4;
        final float f5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1879191686);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M5786getLambda11$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M5786getLambda11$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M5787getLambda12$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M5787getLambda12$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM6085getMediumAppBarCollapsedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM6085getMediumAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
                                i3 |= composerStartRestartGroup.changed(fM6086getMediumAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
                            }
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 100663296) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 67108864 : 33554432;
                                }
                                int i13 = i3;
                                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    windowInsets4 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    function25 = function2M5786getLambda11$material3_release;
                                    function33 = function3M5787getLambda12$material3_release;
                                    f4 = fM6085getMediumAppBarCollapsedHeightD9Ej5fM;
                                    f5 = fM6086getMediumAppBarExpandedHeightD9Ej5fM;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function2M5786getLambda11$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5786getLambda11$material3_release();
                                        }
                                        if (i5 != 0) {
                                            function3M5787getLambda12$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5787getLambda12$material3_release();
                                        }
                                        if (i6 != 0) {
                                            fM6085getMediumAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6085getMediumAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            fM6086getMediumAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6086getMediumAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) == 0) {
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                            i10 = i13 & (-3670017);
                                        } else {
                                            windowInsets2 = windowInsets;
                                            i10 = i13;
                                        }
                                        if ((i2 & 128) == 0) {
                                            topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                                            i10 &= -29360129;
                                        } else {
                                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                                        }
                                        if (i9 == 0) {
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                            function24 = function2M5786getLambda11$material3_release;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                            function24 = function2M5786getLambda11$material3_release;
                                        }
                                        function32 = function3M5787getLambda12$material3_release;
                                        f3 = fM6085getMediumAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier2;
                                        i11 = i10;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        int i14 = (i2 & 64) != 0 ? i13 & (-3670017) : i13;
                                        if ((i2 & 128) != 0) {
                                            i14 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i11 = i14;
                                        f3 = fM6085getMediumAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier5;
                                        windowInsets3 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2M5786getLambda11$material3_release;
                                        function32 = function3M5787getLambda12$material3_release;
                                    }
                                    float f6 = fM6086getMediumAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1879191686, i11, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
                                    }
                                    TextStyle value = Typography4.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    TextStyle value2 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    float f7 = MediumTitleBottomPadding;
                                    C2002Dp.Companion companion = C2002Dp.INSTANCE;
                                    int i15 = i11 << 12;
                                    composer2 = composerStartRestartGroup;
                                    m5706TwoRowsTopAppBarnS6u9G4(modifier3, function23, value, f7, function2, value2, function24, function32, (!C2002Dp.m7997equalsimpl0(f3, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f3, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6085getMediumAppBarCollapsedHeightD9Ej5fM() : f3, (!C2002Dp.m7997equalsimpl0(f6, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f6, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6086getMediumAppBarExpandedHeightD9Ej5fM() : f6, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (57344 & i15) | (3670016 & i15) | (i15 & 29360128), (i11 >> 18) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f4 = f3;
                                    f5 = f6;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$MediumTopAppBar$2
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

                                        public final void invoke(Composer composer3, int i16) {
                                            AppBarKt.m5702MediumTopAppBaroKE7A98(function2, modifier4, function25, function33, f4, f5, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i9 = i8;
                            int i132 = i3;
                            if ((i3 & 38347923) == 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) == 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    function32 = function3M5787getLambda12$material3_release;
                                    f3 = fM6085getMediumAppBarCollapsedHeightD9Ej5fM;
                                    modifier3 = modifier2;
                                    i11 = i10;
                                    float f62 = fM6086getMediumAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    TextStyle value3 = Typography4.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    TextStyle value22 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    float f72 = MediumTitleBottomPadding;
                                    C2002Dp.Companion companion2 = C2002Dp.INSTANCE;
                                    if (C2002Dp.m7997equalsimpl0(f3, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                        if (C2002Dp.m7997equalsimpl0(f62, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                            int i152 = i11 << 12;
                                            composer2 = composerStartRestartGroup;
                                            m5706TwoRowsTopAppBarnS6u9G4(modifier3, function23, value3, f72, function2, value22, function24, function32, (!C2002Dp.m7997equalsimpl0(f3, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f3, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6085getMediumAppBarCollapsedHeightD9Ej5fM() : f3, (!C2002Dp.m7997equalsimpl0(f62, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f62, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6086getMediumAppBarExpandedHeightD9Ej5fM() : f62, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (57344 & i152) | (3670016 & i152) | (i152 & 29360128), (i11 >> 18) & 1022, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            f4 = f3;
                                            f5 = f62;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        int i1322 = i3;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    fM6085getMediumAppBarCollapsedHeightD9Ej5fM = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    int i13222 = i3;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M5787getLambda12$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM6085getMediumAppBarCollapsedHeightD9Ej5fM = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                int i132222 = i3;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M5786getLambda11$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M5787getLambda12$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM6085getMediumAppBarCollapsedHeightD9Ej5fM = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            int i1322222 = i3;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M5786getLambda11$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M5787getLambda12$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM6085getMediumAppBarCollapsedHeightD9Ej5fM = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        fM6086getMediumAppBarExpandedHeightD9Ej5fM = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        int i13222222 = i3;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5701LargeTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M5788getLambda15$material3_release;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M5789getLambda16$material3_release;
        int i6;
        float fM6083getLargeAppBarCollapsedHeightD9Ej5fM;
        int i7;
        float fM6084getLargeAppBarExpandedHeightD9Ej5fM;
        int i8;
        int i9;
        WindowInsets windowInsets2;
        int i10;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        float f3;
        Modifier modifier3;
        int i11;
        Composer composer2;
        final float f4;
        final float f5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-630005584);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function2M5788getLambda15$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M5788getLambda15$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M5789getLambda16$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M5789getLambda16$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM6083getLargeAppBarCollapsedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM6083getLargeAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
                                i3 |= composerStartRestartGroup.changed(fM6084getLargeAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
                            }
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 100663296) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 67108864 : 33554432;
                                }
                                int i13 = i3;
                                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    windowInsets4 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    function25 = function2M5788getLambda15$material3_release;
                                    function33 = function3M5789getLambda16$material3_release;
                                    f4 = fM6083getLargeAppBarCollapsedHeightD9Ej5fM;
                                    f5 = fM6084getLargeAppBarExpandedHeightD9Ej5fM;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function2M5788getLambda15$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5788getLambda15$material3_release();
                                        }
                                        if (i5 != 0) {
                                            function3M5789getLambda16$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m5789getLambda16$material3_release();
                                        }
                                        if (i6 != 0) {
                                            fM6083getLargeAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6083getLargeAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            fM6084getLargeAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m6084getLargeAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) == 0) {
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                            i10 = i13 & (-3670017);
                                        } else {
                                            windowInsets2 = windowInsets;
                                            i10 = i13;
                                        }
                                        if ((i2 & 128) == 0) {
                                            topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                                            i10 &= -29360129;
                                        } else {
                                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                                        }
                                        if (i9 == 0) {
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                            function24 = function2M5788getLambda15$material3_release;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                            function24 = function2M5788getLambda15$material3_release;
                                        }
                                        function32 = function3M5789getLambda16$material3_release;
                                        f3 = fM6083getLargeAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier2;
                                        i11 = i10;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        int i14 = (i2 & 64) != 0 ? i13 & (-3670017) : i13;
                                        if ((i2 & 128) != 0) {
                                            i14 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i11 = i14;
                                        f3 = fM6083getLargeAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier5;
                                        windowInsets3 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2M5788getLambda15$material3_release;
                                        function32 = function3M5789getLambda16$material3_release;
                                    }
                                    float f6 = fM6084getLargeAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-630005584, i11, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
                                    }
                                    TextStyle value = Typography4.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    TextStyle value2 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    float f7 = LargeTitleBottomPadding;
                                    C2002Dp.Companion companion = C2002Dp.INSTANCE;
                                    int i15 = i11 << 12;
                                    composer2 = composerStartRestartGroup;
                                    m5706TwoRowsTopAppBarnS6u9G4(modifier3, function23, value, f7, function2, value2, function24, function32, (!C2002Dp.m7997equalsimpl0(f3, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f3, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6083getLargeAppBarCollapsedHeightD9Ej5fM() : f3, (!C2002Dp.m7997equalsimpl0(f6, companion.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f6, companion.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6084getLargeAppBarExpandedHeightD9Ej5fM() : f6, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (57344 & i15) | (3670016 & i15) | (i15 & 29360128), (i11 >> 18) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f4 = f3;
                                    f5 = f6;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$LargeTopAppBar$2
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

                                        public final void invoke(Composer composer3, int i16) {
                                            AppBarKt.m5701LargeTopAppBaroKE7A98(function2, modifier4, function25, function33, f4, f5, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i9 = i8;
                            int i132 = i3;
                            if ((i3 & 38347923) == 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) == 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    function32 = function3M5789getLambda16$material3_release;
                                    f3 = fM6083getLargeAppBarCollapsedHeightD9Ej5fM;
                                    modifier3 = modifier2;
                                    i11 = i10;
                                    float f62 = fM6084getLargeAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    TextStyle value3 = Typography4.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    TextStyle value22 = Typography4.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
                                    float f72 = LargeTitleBottomPadding;
                                    C2002Dp.Companion companion2 = C2002Dp.INSTANCE;
                                    if (C2002Dp.m7997equalsimpl0(f3, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                        if (C2002Dp.m7997equalsimpl0(f62, companion2.m8004getUnspecifiedD9Ej5fM())) {
                                            int i152 = i11 << 12;
                                            composer2 = composerStartRestartGroup;
                                            m5706TwoRowsTopAppBarnS6u9G4(modifier3, function23, value3, f72, function2, value22, function24, function32, (!C2002Dp.m7997equalsimpl0(f3, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f3, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6083getLargeAppBarCollapsedHeightD9Ej5fM() : f3, (!C2002Dp.m7997equalsimpl0(f62, companion2.m8004getUnspecifiedD9Ej5fM()) || C2002Dp.m7997equalsimpl0(f62, companion2.m8003getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m6084getLargeAppBarExpandedHeightD9Ej5fM() : f62, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (57344 & i152) | (3670016 & i152) | (i152 & 29360128), (i11 >> 18) & 1022, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            f4 = f3;
                                            f5 = f62;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        int i1322 = i3;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    fM6083getLargeAppBarCollapsedHeightD9Ej5fM = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    int i13222 = i3;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M5789getLambda16$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM6083getLargeAppBarCollapsedHeightD9Ej5fM = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                int i132222 = i3;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M5788getLambda15$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M5789getLambda16$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM6083getLargeAppBarCollapsedHeightD9Ej5fM = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            int i1322222 = i3;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M5788getLambda15$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M5789getLambda16$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM6083getLargeAppBarCollapsedHeightD9Ej5fM = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        fM6084getLargeAppBarExpandedHeightD9Ej5fM = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        int i13222222 = i3;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5703SingleRowTopAppBarcJHQLPU(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, final float f, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifierDraggable$default;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-342194911);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) == 0) {
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(windowInsets) ? 8388608 : 4194304;
                            }
                            if ((i2 & 256) == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(topAppBarColors) ? 67108864 : 33554432;
                            }
                            if ((i2 & 512) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 536870912 : 268435456;
                            }
                            if ((306783379 & i3) != 306783378 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                            } else {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-342194911, i3, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
                                }
                                if (!Float.isNaN(f)) {
                                    if (!(f == Float.POSITIVE_INFINITY)) {
                                        final float fCoerceAtLeast = RangesKt.coerceAtLeast(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f), 0.0f);
                                        int i5 = i3 & 1879048192;
                                        boolean zChanged = (i5 == 536870912) | composerStartRestartGroup.changed(fCoerceAtLeast);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
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
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), -fCoerceAtLeast)) {
                                                        return;
                                                    }
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                    TopAppBarState state2 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                    if (state2 == null) {
                                                        return;
                                                    }
                                                    state2.setHeightOffsetLimit(-fCoerceAtLeast);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                        boolean z2 = i5 == 536870912;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Float invoke() {
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    return Float.valueOf(((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(topAppBarColors.m6078containerColorvNxB06k$material3_release(SingleRowTopAppBar_cJHQLPU$lambda$9((SnapshotState4) objRememberedValue2)), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, composerStartRestartGroup, 48, 12);
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1370231018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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

                                            public final void invoke(Composer composer3, int i6) {
                                                if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1370231018, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                                                    }
                                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<Row5, Composer, Integer, Unit> function32 = function3;
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    function32.invoke(Row6.INSTANCE, composer3, 6);
                                                    composer3.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        composerStartRestartGroup.startReplaceGroup(-1193605157);
                                        if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Orientation orientation = Orientation.Vertical;
                                            boolean z3 = i5 == 536870912;
                                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                                        invoke(f2.floatValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(float f2) {
                                                        TopAppBarState state = topAppBarScrollBehavior.getState();
                                                        state.setHeightOffset(state.getHeightOffset() + f2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            }
                                            DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                            boolean z4 = i5 == 536870912;
                                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            }
                                            modifierDraggable$default = DraggableKt.draggable$default(companion, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) objRememberedValue4, false, 188, null);
                                        } else {
                                            modifierDraggable$default = Modifier.INSTANCE;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        SurfaceKt.m5967SurfaceT9BRK9s(modifier2.then(modifierDraggable$default), null, SingleRowTopAppBar_cJHQLPU$lambda$10(snapshotState4M4805animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f, topAppBarScrollBehavior, topAppBarColors, function2, textStyle, z, function22, composableLambdaRememberComposableLambda), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                            }
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
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

                                    public final void invoke(Composer composer3, int i6) {
                                        AppBarKt.m5703SingleRowTopAppBarcJHQLPU(modifier3, function2, textStyle, z, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        if ((i2 & 256) == 0) {
                        }
                        if ((i2 & 512) == 0) {
                        }
                        if ((306783379 & i3) != 306783378) {
                            if (i4 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (!Float.isNaN(f)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5706TwoRowsTopAppBarnS6u9G4(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, final float f2, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        TextStyle textStyle3;
        int i5;
        final Modifier modifier3;
        Modifier modifierDraggable$default;
        Composer composer2;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1169193376);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                textStyle3 = textStyle;
                i4 |= composerStartRestartGroup.changed(textStyle3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changed(f3) ? 536870912 : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i5 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i5 = i2 | (composerStartRestartGroup.changed(windowInsets) ? 4 : 2);
                } else {
                    i5 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i5 |= 48;
                } else if ((i2 & 48) == 0) {
                    i5 |= composerStartRestartGroup.changed(topAppBarColors) ? 32 : 16;
                }
                int i7 = i5;
                if ((i3 & 4096) != 0) {
                    i7 |= 384;
                } else if ((i2 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                }
                if ((306783379 & i4) != 306783378 || (i7 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1169193376, i4, i7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
                    }
                    if (!Float.isNaN(f2)) {
                        if (!(f2 == Float.POSITIVE_INFINITY)) {
                            if (!Float.isNaN(f3)) {
                                if (!(f3 == Float.POSITIVE_INFINITY)) {
                                    if (C2002Dp.m7994compareTo0680j_4(f3, f2) < 0) {
                                        throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                                    }
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    floatRef.element = density.mo5016toPx0680j_4(f3);
                                    floatRef2.element = density.mo5016toPx0680j_4(f2);
                                    intRef.element = density.mo5010roundToPx0680j_4(f);
                                    Unit unit = Unit.INSTANCE;
                                    int i8 = i7 & 896;
                                    boolean zChanged = (i8 == 256) | composerStartRestartGroup.changed(floatRef2.element) | composerStartRestartGroup.changed(floatRef.element);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$5$1
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
                                                TopAppBarState state2;
                                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef2.element - floatRef.element)) {
                                                    return;
                                                }
                                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                if (state3 == null) {
                                                    return;
                                                }
                                                state3.setHeightOffsetLimit(floatRef2.element - floatRef.element);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                    float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                                    long jM6078containerColorvNxB06k$material3_release = topAppBarColors.m6078containerColorvNxB06k$material3_release(collapsedFraction);
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-89435287, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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

                                        public final void invoke(Composer composer3, int i9) {
                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-89435287, i9, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
                                                }
                                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3<Row5, Composer, Integer, Unit> function32 = function3;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                function32.invoke(Row6.INSTANCE, composer3, 6);
                                                composer3.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54);
                                    float fTransform = TopTitleAlphaEasing.transform(collapsedFraction);
                                    float f4 = 1.0f - collapsedFraction;
                                    boolean z = collapsedFraction < 0.5f;
                                    boolean z2 = !z;
                                    composerStartRestartGroup.startReplaceGroup(1641266888);
                                    if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Orientation orientation = Orientation.Vertical;
                                        boolean z3 = i8 == 256;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                                    invoke(f5.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(float f5) {
                                                    TopAppBarState state2 = topAppBarScrollBehavior.getState();
                                                    state2.setHeightOffset(state2.getHeightOffset() + f5);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                        boolean z4 = i8 == 256;
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        modifierDraggable$default = DraggableKt.draggable$default(companion, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) objRememberedValue3, false, 188, null);
                                    } else {
                                        modifierDraggable$default = Modifier.INSTANCE;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    SurfaceKt.m5967SurfaceT9BRK9s(modifier3.then(modifierDraggable$default), null, jM6078containerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets, f2, topAppBarColors, function22, textStyle2, fTransform, z, function23, composableLambdaRememberComposableLambda, f3, topAppBarScrollBehavior, function24, textStyle3, f4, intRef, z2), composerStartRestartGroup, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                    }
                    throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
                }
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$7
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

                        public final void invoke(Composer composer3, int i9) {
                            AppBarKt.m5706TwoRowsTopAppBarnS6u9G4(modifier3, function2, textStyle, f, function22, textStyle2, function23, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i72 = i5;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) != 306783378) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Float.isNaN(f2)) {
                }
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        textStyle3 = textStyle;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i722 = i5;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m5705TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        long j4;
        int i5;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-742442296);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(scrolledOffset) : composerStartRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j4 = j;
            i4 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        int i6 = i4;
        if ((i2 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changed(vertical) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        int i7 = i6;
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        int i8 = i5;
        if ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i7, i8, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z2 = ((i7 & 112) == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(scrolledOffset))) | ((1879048192 & i7) == 536870912) | ((234881024 & i7) == 67108864) | ((i8 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j5) {
                        int iCoerceAtLeast;
                        int iM7974getMaxHeightimpl;
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Measurable measurable = list.get(i9);
                            if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j5, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    Measurable measurable2 = list.get(i10);
                                    if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable placeableMo7239measureBRTryo02 = measurable2.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j5, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m7975getMaxWidthimpl(j5) == Integer.MAX_VALUE) {
                                            iCoerceAtLeast = Constraints.m7975getMaxWidthimpl(j5);
                                        } else {
                                            iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo0.getWidth()) - placeableMo7239measureBRTryo02.getWidth(), 0);
                                        }
                                        int i11 = iCoerceAtLeast;
                                        int size3 = list.size();
                                        for (int i12 = 0; i12 < size3; i12++) {
                                            Measurable measurable3 = list.get(i12);
                                            if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable3), "title")) {
                                                final Placeable placeableMo7239measureBRTryo03 = measurable3.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j5, 0, i11, 0, 0, 12, null));
                                                final int i13 = placeableMo7239measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo7239measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float fOffset = scrolledOffset.offset();
                                                int iRoundToInt = Float.isNaN(fOffset) ? 0 : MathKt.roundToInt(fOffset);
                                                if (Constraints.m7974getMaxHeightimpl(j5) == Integer.MAX_VALUE) {
                                                    iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j5);
                                                } else {
                                                    iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j5) + iRoundToInt;
                                                }
                                                final int i14 = iM7974getMaxHeightimpl;
                                                int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j5);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i15 = i;
                                                return MeasureScope.layout$default(measureScope, iM7975getMaxWidthimpl, i14, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                        int iMax;
                                                        int i16;
                                                        int height;
                                                        int iM7975getMaxWidthimpl2;
                                                        Placeable placeable = placeableMo7239measureBRTryo0;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i14 - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableMo7239measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        if (Intrinsics.areEqual(horizontal3, arrangement.getCenter())) {
                                                            iMax = (Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo03.getWidth()) / 2;
                                                            if (iMax < placeableMo7239measureBRTryo0.getWidth()) {
                                                                iM7975getMaxWidthimpl2 = placeableMo7239measureBRTryo0.getWidth() - iMax;
                                                            } else if (placeableMo7239measureBRTryo03.getWidth() + iMax > Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo02.getWidth()) {
                                                                iM7975getMaxWidthimpl2 = (Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo02.getWidth()) - (placeableMo7239measureBRTryo03.getWidth() + iMax);
                                                            }
                                                            iMax += iM7975getMaxWidthimpl2;
                                                        } else if (!Intrinsics.areEqual(horizontal3, arrangement.getEnd())) {
                                                            iMax = Math.max(measureScope.mo5010roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo7239measureBRTryo0.getWidth());
                                                        } else {
                                                            iMax = (Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo03.getWidth()) - placeableMo7239measureBRTryo02.getWidth();
                                                        }
                                                        int i17 = iMax;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (Intrinsics.areEqual(vertical3, arrangement.getCenter())) {
                                                            height = (i14 - placeableMo7239measureBRTryo03.getHeight()) / 2;
                                                        } else {
                                                            if (!Intrinsics.areEqual(vertical3, arrangement.getBottom())) {
                                                                i16 = 0;
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i17, i16, 0.0f, 4, null);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo02, Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo02.getWidth(), (i14 - placeableMo7239measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                            }
                                                            int i18 = i15;
                                                            if (i18 == 0) {
                                                                height = i14 - placeableMo7239measureBRTryo03.getHeight();
                                                            } else {
                                                                int height2 = i18 - (placeableMo7239measureBRTryo03.getHeight() - i13);
                                                                int height3 = placeableMo7239measureBRTryo03.getHeight() + height2;
                                                                if (height3 > Constraints.m7974getMaxHeightimpl(j5)) {
                                                                    height2 -= height3 - Constraints.m7974getMaxHeightimpl(j5);
                                                                }
                                                                height = (i14 - placeableMo7239measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                            }
                                                        }
                                                        i16 = height;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i17, i16, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo02, Constraints.m7975getMaxWidthimpl(j5) - placeableMo7239measureBRTryo02.getWidth(), (i14 - placeableMo7239measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierLayoutId = LayoutId2.layoutId(companion2, "navigationIcon");
            float f2 = TopAppBarHorizontalPadding;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierLayoutId, f2, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j4));
            int i9 = ProvidedValue.$stable;
            CompositionLocal3.CompositionLocalProvider(providedValueProvides, function22, composerStartRestartGroup, ((i8 >> 3) & 112) | i9);
            composerStartRestartGroup.endNode();
            Modifier modifierM6758graphicsLayerAp8cVGQ$default = GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(PaddingKt.m5144paddingVpY3zN4$default(LayoutId2.layoutId(companion2, "title"), f2, 0.0f, 2, null).then(z ? SemanticsModifier6.clearAndSetSemantics(companion2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }) : companion2), 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM6758graphicsLayerAp8cVGQ$default);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
            int i10 = i7 >> 9;
            ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, (i10 & 14) | ((i7 >> 15) & 112) | (i10 & 896));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(LayoutId2.layoutId(companion2, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
            CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j3)), function23, composer2, ((i8 >> 6) & 112) | i9);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = j4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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

                public final void invoke(Composer composer3, int i11) {
                    AppBarKt.m5705TopAppBarLayoutkXwM9vE(modifier, scrolledOffset, j5, j2, j3, function2, textStyle, f, vertical, horizontal, i, z, function22, function23, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        C15441 c15441;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof C15441) {
            c15441 = (C15441) continuation;
            int i = c15441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15441.label = i - Integer.MIN_VALUE;
            } else {
                c15441 = new C15441(continuation);
            }
        }
        C15441 c154412 = c15441;
        Object obj = c154412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c154412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (topAppBarState2.getCollapsedFraction() < 0.01f || topAppBarState2.getCollapsedFraction() == 1.0f) {
                return Velocity.m8095boximpl(Velocity.INSTANCE.m8109getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec != null && Math.abs(f) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationState3.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                Function1<AnimationState2<Float, AnimationVectors2>, Unit> function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                        invoke2(animationState2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                        float fFloatValue = animationState2.getValue().floatValue() - floatRef3.element;
                        float heightOffset = topAppBarState2.getHeightOffset();
                        topAppBarState2.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - topAppBarState2.getHeightOffset());
                        floatRef3.element = animationState2.getValue().floatValue();
                        floatRef.element = animationState2.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationState2.cancelAnimation();
                        }
                    }
                };
                c154412.L$0 = topAppBarState2;
                animationSpec2 = animationSpec;
                c154412.L$1 = animationSpec2;
                c154412.L$2 = floatRef;
                c154412.label = 1;
                if (SuspendAnimation.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, c154412, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) c154412.L$0;
                ResultKt.throwOnFailure(obj);
                floatRef = floatRef2;
                return Velocity.m8095boximpl(Velocity2.Velocity(0.0f, floatRef.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c154412.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c154412.L$1;
            TopAppBarState topAppBarState3 = (TopAppBarState) c154412.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            topAppBarState2 = topAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationState3.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = boxing.boxFloat(topAppBarState2.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            Function1<AnimationState2<Float, AnimationVectors2>, Unit> function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                    invoke2(animationState2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                    topAppBarState2.setHeightOffset(animationState2.getValue().floatValue());
                }
            };
            c154412.L$0 = floatRef;
            c154412.L$1 = null;
            c154412.L$2 = null;
            c154412.label = 2;
            if (SuspendAnimation.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, function12, c154412, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.m8095boximpl(Velocity2.Velocity(0.0f, floatRef.element));
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    static {
        float f = 16;
        float f2 = 12;
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f) - C2002Dp.m7995constructorimpl(f2));
        BottomAppBarHorizontalPadding = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f) - C2002Dp.m7995constructorimpl(f2));
        BottomAppBarVerticalPadding = fM7995constructorimpl2;
        FABHorizontalPadding = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f) - fM7995constructorimpl);
        FABVerticalPadding = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f2) - fM7995constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = C2002Dp.m7995constructorimpl(24);
        LargeTitleBottomPadding = C2002Dp.m7995constructorimpl(28);
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(4);
        TopAppBarHorizontalPadding = fM7995constructorimpl3;
        TopAppBarTitleInset = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f) - fM7995constructorimpl3);
    }
}
