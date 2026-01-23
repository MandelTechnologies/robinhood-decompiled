package com.robinhood.android.sdui.chartgroup;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.TransformOrigin2;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawTransform;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.Interactions2;
import com.robinhood.android.charts.RectExtensions;
import com.robinhood.android.charts.model.Axis;
import com.robinhood.android.charts.model.AxisScrubLabel;
import com.robinhood.android.charts.model.AxisType;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.model.ProtoAxis;
import com.robinhood.android.charts.model.ProtoAxisScrubLabel;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.LineDto;
import rh_server_driven_ui.p531v1.PointDto;
import rh_server_driven_ui.p531v1.SegmentDto;
import rh_server_driven_ui.p531v1.StyleDto;
import rh_server_driven_ui.p531v1.StylesWithStatesDto;
import rh_server_driven_ui.p531v1.TextDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÇ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00010\u000e2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0015\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a»\u0001\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u001d2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00010\u000e2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0015\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001e\u001aÉ\u0001\u0010\u001f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0$2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010$2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0004\b;\u0010<\u001aÉ\u0001\u0010=\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020>2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0$2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010$2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010@H\u0003¢\u0006\u0004\bA\u0010B\u001aa\u0010C\u001a\u00020\u0001*\u00020 2\b\u0010D\u001a\u0004\u0018\u00010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010,\u001a\u00020-2\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010H\u001aa\u0010I\u001a\u00020\u0001*\u00020 2\b\u0010D\u001a\u0004\u0018\u00010J2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010,\u001a\u00020-2\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010K\u001au\u0010L\u001a\u00020\u0001*\u00020 2\b\u0010D\u001a\u0004\u0018\u00010E2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u00132\b\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0003¢\u0006\u0004\bO\u0010P\u001au\u0010Q\u001a\u00020\u0001*\u00020 2\b\u0010D\u001a\u0004\u0018\u00010J2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u00132\b\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0003¢\u0006\u0004\bR\u0010S\u001ae\u0010T\u001a\u00020\u0001*\u00020 2\u0006\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010E2\u0006\u0010W\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010X\u001a\u00020Y2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\\\u001ao\u0010]\u001a\u00020\u0001*\u00020 2\u0006\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010J2\u0006\u0010W\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010X\u001a\u00020^2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010_\u001aW\u0010`\u001a\u00020\u0001*\u00020 2\b\u0010V\u001a\u0004\u0018\u00010E2\u0006\u0010W\u001a\u00020%2\u0006\u0010a\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0003¢\u0006\u0002\u0010b\u001aW\u0010c\u001a\u00020\u0001*\u00020 2\b\u0010V\u001a\u0004\u0018\u00010J2\u0006\u0010W\u001a\u00020%2\u0006\u0010a\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0003¢\u0006\u0002\u0010d\u001aM\u0010e\u001a\u00020\u0001*\u00020 2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010,\u001a\u00020-2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020%0$2\b\u00102\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010i\u001aM\u0010j\u001a\u00020\u0001*\u00020 2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020l0k2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010,\u001a\u00020-2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020%0$2\b\u00102\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010m\u001aI\u0010n\u001a\u00020\u0001*\u00020 2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010,\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u00132\b\u0010p\u001a\u0004\u0018\u00010qH\u0003¢\u0006\u0002\u0010r\u001aI\u0010s\u001a\u00020\u0001*\u00020 2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010,\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u00132\b\u0010p\u001a\u0004\u0018\u00010tH\u0003¢\u0006\u0002\u0010u\u001a9\u0010v\u001a\u00020\u0001*\u00020 2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020g0$2\u0006\u0010x\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010y\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010z\u001a9\u0010{\u001a\u00020\u0001*\u00020 2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020l0k2\u0006\u0010x\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010y\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010|\u001aL\u0010}\u001a\u00020\u0001*\u00020 2\u0006\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010:2\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020%2\u0006\u0010y\u001a\u00020\u000fH\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a=\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0003\u0010\u008a\u0001\u001a-\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010!\u001a\u00020>2\u0007\u0010\u0089\u0001\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0003\u0010\u008c\u0001\u001ax\u0010\u008d\u0001\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020-2\u0006\u0010*\u001a\u00020+2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0007\u0010\u008e\u0001\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001ah\u0010\u0091\u0001\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020>2\u0007\u0010\u0089\u0001\u001a\u00020-2\u0006\u0010*\u001a\u00020+2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0007\u0010\u008e\u0001\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0003¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a(\u0010\u0094\u0001\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a-\u0010\u0099\u0001\u001a\u00020\u0001*\u00020 2\u0007\u0010\u009a\u0001\u001a\u00020%2\u0006\u0010W\u001a\u00020%2\u0007\u0010\u009b\u0001\u001a\u00020\u0011H\u0003¢\u0006\u0003\u0010\u009c\u0001\u001aY\u0010\u009d\u0001\u001a\u00020\u0001*\u00020 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010,\u001a\u00020-2\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0006\u0010G\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0003¢\u0006\u0003\u0010 \u0001\u001a\u000f\u0010¡\u0001\u001a\u00030¢\u0001*\u00030¢\u0001H\u0002\u001a\u0014\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010$*\u00020:H\u0002\u001a\"\u0010¤\u0001\u001a\u0004\u0018\u00010\u000f*\u00020:2\b\u0010¥\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a!\u0010¨\u0001\u001a\u00030\u0081\u0001*\u00030\u0081\u00012\u0007\u0010©\u0001\u001a\u00020:H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a?\u0010¬\u0001\u001a\u00020\u0001*\u00030\u00ad\u00012\b\u0010®\u0001\u001a\u00030\u0081\u00012\b\u0010¯\u0001\u001a\u00030\u0081\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001\u001aD\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020(0$*\u00020 2\u0007\u0010µ\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020%2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0$2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001\"\u0017\u0010¹\u0001\u001a\u00020+8CX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006¼\u0001²\u0006\u0011\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015X\u008a\u008e\u0002²\u0006\u000b\u0010¾\u0001\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\u000b\u0010¿\u0001\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010À\u0001\u001a\u00030Á\u0001X\u008a\u008e\u0002²\u0006\u000e\u0010Â\u0001\u001a\u0005\u0018\u00010\u0081\u0001X\u008a\u008e\u0002²\u0006\u000b\u0010Ã\u0001\u001a\u00020-X\u008a\u008e\u0002²\u0006\r\u0010\u0082\u0001\u001a\u0004\u0018\u00010:X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\u000b\u0010Ä\u0001\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\u0011\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015X\u008a\u008e\u0002²\u0006\u000b\u0010¾\u0001\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\u000b\u0010¿\u0001\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010À\u0001\u001a\u00030Á\u0001X\u008a\u008e\u0002²\u0006\u000e\u0010Â\u0001\u001a\u0005\u0018\u00010\u0081\u0001X\u008a\u008e\u0002²\u0006\u000b\u0010Ã\u0001\u001a\u00020-X\u008a\u008e\u0002²\u0006\r\u0010\u0082\u0001\u001a\u0004\u0018\u00010:X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\u000b\u0010Ä\u0001\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\u000b\u0010Å\u0001\u001a\u00020-X\u008a\u008e\u0002²\u0006\u000b\u0010Å\u0001\u001a\u00020-X\u008a\u008e\u0002"}, m3636d2 = {"SduiAdvancedChartGroup", "", "ActionT", "Landroid/os/Parcelable;", "chartGroup", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "modifier", "Landroidx/compose/ui/Modifier;", "chartGroupWithZoomKeys", "Lkotlin/Pair;", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartZoomKeys;", "state", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "onScrubbingProgressUpdated", "Lkotlin/Function1;", "", "onScrubbingModeUpdated", "", "onScrubStateUpdated", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "onXAxisZoomed", "Lkotlin/ranges/ClosedFloatingPointRange;", "onXAxisZoomEnd", "Lkotlin/Function0;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;Landroidx/compose/ui/Modifier;Lkotlin/Pair;Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProtoSduiAdvancedChartGroup", "component", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ChartGroup;", "Lrh_server_driven_ui/v1/ChartGroupDto;", "Lcom/robinhood/android/sdui/chartgroup/ProtoAdvancedChartGroupState;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ChartGroup;Landroidx/compose/ui/Modifier;Lkotlin/Pair;Lcom/robinhood/android/sdui/chartgroup/ProtoAdvancedChartGroupState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Chart", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "chartRefs", "", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "chartBottomDividerRefs", "horizontalGuidelines", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "useWeightsAsHeight", "chartTitleHeightDp", "Landroidx/compose/ui/unit/Dp;", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "", "lines", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "fills", "Lcom/robinhood/android/charts/model/Fill;", "scrubState", "yAxisPrimaryLocation", "Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "yAxisBarrierStart", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "yAxisBarrierEnd", "yAxisSecondaryBarrierStart", "onCanvasChanged", "Landroidx/compose/ui/geometry/Rect;", "Chart-kiIZU34", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZFILjava/util/List;Ljava/util/List;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ProtoChart", "Lrh_server_driven_ui/v1/ChartDto;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "ProtoChart-osRQHRo", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lrh_server_driven_ui/v1/ChartDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZFILjava/util/List;Ljava/util/List;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)V", "ChartYAxis", "chartYAxis", "Lcom/robinhood/android/charts/model/Axis;", "chartYAxisRefs", "yAxisLocation", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/Axis;Ljava/util/List;Ljava/util/List;ILcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProtoChartYAxis", "Lcom/robinhood/android/charts/model/ProtoAxis;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/ProtoAxis;Ljava/util/List;Ljava/util/List;ILcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChartYAxisScrubLabel", "chartYAxisScrubLabelRefs", "verticalScrubLineDistanceToRightOfChart", "ChartYAxisScrubLabel-skrPljE", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/Axis;Ljava/util/List;Ljava/util/List;FILcom/robinhood/android/sdui/chartgroup/ScrubState;Ljava/lang/Float;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;II)V", "ProtoChartYAxisScrubLabel", "ProtoChartYAxisScrubLabel-skrPljE", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/ProtoAxis;Ljava/util/List;Ljava/util/List;FILcom/robinhood/android/sdui/chartgroup/ScrubState;Ljava/lang/Float;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;II)V", "ChartGroupXAxis", "chartGroupSize", "chartGroupXAxis", "chartGroupXAxisRef", "axisConfig", "Lcom/robinhood/android/sdui/chartgroup/AxisConfig;", "onSizeChanged", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;ILcom/robinhood/android/charts/model/Axis;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Ljava/util/List;Lcom/robinhood/android/sdui/chartgroup/AxisConfig;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ProtoChartGroupXAxis", "Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;ILcom/robinhood/android/charts/model/ProtoAxis;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Ljava/util/List;Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ChartGroupXAxisScrubLabel", "chartGroupXAxisScrubLabelRef", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/Axis;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;I)V", "ProtoChartGroupXAxisScrubLabel", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/charts/model/ProtoAxis;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;I)V", "ChartLegends", "chartLegendLists", "Lcom/robinhood/android/sdui/chartgroup/LegendList;", "legendListRefs", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/runtime/Composer;I)V", "ProtoChartLegends", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/sdui/chartgroup/ProtoLegendList;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/List;ILjava/util/List;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/runtime/Composer;I)V", "ChartTitle", "chartTitleRefs", "title", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/util/List;Ljava/util/List;ILcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Landroidx/compose/runtime/Composer;I)V", "ProtoChartTitle", "Lrh_server_driven_ui/v1/TextDto;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/util/List;Ljava/util/List;ILcom/robinhood/android/sdui/chartgroup/ScrubState;Lrh_server_driven_ui/v1/TextDto;Landroidx/compose/runtime/Composer;I)V", "ChartGroupLegends", "chartGroupLegendLists", "chartGroupLegendRef", "animationProgress", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/util/List;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;FLandroidx/compose/runtime/Composer;I)V", "ProtoChartGroupLegends", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lkotlinx/collections/immutable/ImmutableList;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;FLandroidx/compose/runtime/Composer;I)V", "ChartGroupScrubLines", "scrubLineConfig", "Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "effectiveGlobalScrubOffset", "Landroidx/compose/ui/geometry/Offset;", "globalChartRect", "lineX", "scrubLineOverlayRef", "ChartGroupScrubLines-Liby8ZU", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;JLandroidx/compose/ui/geometry/Rect;FLandroidx/constraintlayout/compose/ConstrainedLayoutReference;FLandroidx/compose/runtime/Composer;I)V", "scrubDotOverlay", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "chartIndex", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;ILcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "protoScrubDotOverlay", "(Lrh_server_driven_ui/v1/ChartDto;ILcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "ScrubDot", "scrubDotRef", "ScrubDot-_-WMjBM", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/robinhood/models/serverdriven/experimental/api/Chart;IFLjava/util/List;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;I)V", "ProtoScrubDot", "ProtoScrubDot-_-WMjBM", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Lrh_server_driven_ui/v1/ChartDto;IFLjava/util/List;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;I)V", "DividerLine", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "DividerLine-iJQMabo", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "ChartGroupXAxisBottomDivider", "chartGroupXAxisBottomDividerRef", "enabled", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;ZLandroidx/compose/runtime/Composer;I)V", "ChartBottomDivider", "chartBottomDividerType", "Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/util/List;Ljava/util/List;ILcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/compose/runtime/Composer;I)V", "coerceInsideWindow", "Lcom/robinhood/android/charts/model/Point;", "cornerOffsets", "distanceToEdge", "offset", "distanceToEdge-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Ljava/lang/Float;", "coerceInRect", "rect", "coerceInRect-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "drawScrubLine", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "start", "end", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawScrubLine-jQ-KiII", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "getHorizontalGuidelines", "topIndicatorPaddingDp", "chartWeights", "getHorizontalGuidelines-rAjV9yQ", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;FLandroidx/constraintlayout/compose/ConstrainedLayoutReference;Ljava/util/List;Z)Ljava/util/List;", "ScrubLineBottomPadding", "getScrubLineBottomPadding", "(Landroidx/compose/runtime/Composer;I)F", "lib-sdui-charts_externalRelease", "xZoomRange", "edgeBounceOffset", "animatedEdgeBounceOffset", "pointerInputState", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartPointerInputState;", "globalScrubOffset", "chartGroupXAxisHeight", "scrubLineAnimationTarget", "composableHeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SduiAdvancedChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartBottomDivider$lambda$303(ConstraintLayoutScope constraintLayoutScope, List list, List list2, int i, AdvancedChartGroupState5 advancedChartGroupState5, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, int i2, Composer composer, int i3) {
        ChartBottomDivider(constraintLayoutScope, list, list2, i, advancedChartGroupState5, yAxisLocation, verticalAnchor, verticalAnchor2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupLegends$lambda$255(ConstraintLayoutScope constraintLayoutScope, List list, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, float f, int i, Composer composer, int i2) {
        ChartGroupLegends(constraintLayoutScope, list, constraintLayoutBaseScope4, scrubState, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupScrubLines_Liby8ZU$lambda$276(ConstraintLayoutScope constraintLayoutScope, ScrubConfig scrubConfig, long j, Rect rect, float f, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f2, int i, Composer composer, int i2) {
        m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope, scrubConfig, j, rect, f, constraintLayoutBaseScope4, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxis$lambda$218(ConstraintLayoutScope constraintLayoutScope, int i, Axis axis, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, AxisConfig advancedChartGroupState4, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Function1 function1, int i2, Composer composer, int i3) {
        ChartGroupXAxis(constraintLayoutScope, i, axis, constraintLayoutBaseScope4, list, advancedChartGroupState4, verticalAnchor, verticalAnchor2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxisBottomDivider$lambda$300(ConstraintLayoutScope constraintLayoutScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, boolean z, int i, Composer composer, int i2) {
        ChartGroupXAxisBottomDivider(constraintLayoutScope, constraintLayoutBaseScope4, constraintLayoutBaseScope42, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxisScrubLabel$lambda$224(ConstraintLayoutScope constraintLayoutScope, Axis axis, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, int i, Composer composer, int i2) {
        ChartGroupXAxisScrubLabel(constraintLayoutScope, axis, constraintLayoutBaseScope4, constraintLayoutBaseScope42, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartLegends$lambda$232(ConstraintLayoutScope constraintLayoutScope, List list, List list2, int i, List list3, ScrubState scrubState, int i2, Composer composer, int i3) {
        ChartLegends(constraintLayoutScope, list, list2, i, list3, scrubState, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTitle$lambda$240(ConstraintLayoutScope constraintLayoutScope, List list, List list2, int i, ScrubState scrubState, RichText richText, int i2, Composer composer, int i3) {
        ChartTitle(constraintLayoutScope, list, list2, i, scrubState, richText, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartYAxis$lambda$202(ConstraintLayoutScope constraintLayoutScope, Axis axis, List list, List list2, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ChartYAxis(constraintLayoutScope, axis, list, list2, i, yAxisLocation, verticalAnchor, verticalAnchor2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartYAxisScrubLabel_skrPljE$lambda$210(ConstraintLayoutScope constraintLayoutScope, Axis axis, List list, List list2, float f, int i, ScrubState scrubState, Float f2, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, int i2, int i3, Composer composer, int i4) {
        m18577ChartYAxisScrubLabelskrPljE(constraintLayoutScope, axis, list, list2, f, i, scrubState, f2, yAxisLocation, verticalAnchor, verticalAnchor2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart_kiIZU34$lambda$192(ConstraintLayoutScope constraintLayoutScope, Chart chart, List list, List list2, List list3, boolean z, float f, int i, List list4, List list5, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Function1 function1, int i2, int i3, Composer composer, int i4) {
        m18575ChartkiIZU34(constraintLayoutScope, chart, list, list2, list3, z, f, i, list4, list5, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DividerLine_iJQMabo$lambda$297(Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m18578DividerLineiJQMabo(modifier, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupLegends$lambda$267(ConstraintLayoutScope constraintLayoutScope, ImmutableList immutableList, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, float f, int i, Composer composer, int i2) {
        ProtoChartGroupLegends(constraintLayoutScope, immutableList, constraintLayoutBaseScope4, scrubState, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupXAxis$lambda$221(ConstraintLayoutScope constraintLayoutScope, int i, ProtoAxis protoAxis, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, ProtoAxisConfig advancedChartGroupState7, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Function1 function1, int i2, Composer composer, int i3) {
        ProtoChartGroupXAxis(constraintLayoutScope, i, protoAxis, constraintLayoutBaseScope4, list, advancedChartGroupState7, verticalAnchor, verticalAnchor2, verticalAnchor3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupXAxisScrubLabel$lambda$227(ConstraintLayoutScope constraintLayoutScope, ProtoAxis protoAxis, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, int i, Composer composer, int i2) {
        ProtoChartGroupXAxisScrubLabel(constraintLayoutScope, protoAxis, constraintLayoutBaseScope4, constraintLayoutBaseScope42, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartLegends$lambda$237(ConstraintLayoutScope constraintLayoutScope, ImmutableList immutableList, List list, int i, List list2, ScrubState scrubState, int i2, Composer composer, int i3) {
        ProtoChartLegends(constraintLayoutScope, immutableList, list, i, list2, scrubState, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartTitle$lambda$243(ConstraintLayoutScope constraintLayoutScope, List list, List list2, int i, ScrubState scrubState, TextDto textDto, int i2, Composer composer, int i3) {
        ProtoChartTitle(constraintLayoutScope, list, list2, i, scrubState, textDto, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartYAxis$lambda$205(ConstraintLayoutScope constraintLayoutScope, ProtoAxis protoAxis, List list, List list2, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ProtoChartYAxis(constraintLayoutScope, protoAxis, list, list2, i, yAxisLocation, verticalAnchor, verticalAnchor2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartYAxisScrubLabel_skrPljE$lambda$215(ConstraintLayoutScope constraintLayoutScope, ProtoAxis protoAxis, List list, List list2, float f, int i, ScrubState scrubState, Float f2, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, int i2, int i3, Composer composer, int i4) {
        m18580ProtoChartYAxisScrubLabelskrPljE(constraintLayoutScope, protoAxis, list, list2, f, i, scrubState, f2, yAxisLocation, verticalAnchor, verticalAnchor2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChart_osRQHRo$lambda$199(ConstraintLayoutScope constraintLayoutScope, ChartDto chartDto, List list, List list2, List list3, boolean z, float f, int i, List list4, List list5, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Function1 function1, AnimationSpec animationSpec, int i2, int i3, Composer composer, int i4) {
        m18579ProtoChartosRQHRo(constraintLayoutScope, chartDto, list, list2, list3, z, f, i, list4, list5, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, function1, animationSpec, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoScrubDot___WMjBM$lambda$296(ConstraintLayoutScope constraintLayoutScope, ChartDto chartDto, int i, float f, List list, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, int i2, Composer composer, int i3) {
        m18581ProtoScrubDot_WMjBM(constraintLayoutScope, chartDto, i, f, list, constraintLayoutBaseScope4, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProtoSduiAdvancedChartGroup$lambda$184$lambda$140$lambda$139$lambda$138$lambda$135$lambda$134 */
    public static final float m2459x26f7632e(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$185(UIComponentDto.ConcreteDto.ChartGroup chartGroup, Modifier modifier, Tuples2 tuples2, ProtoAdvancedChartGroupState advancedChartGroupState6, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i, int i2, Composer composer, int i3) {
        ProtoSduiAdvancedChartGroup(chartGroup, modifier, tuples2, advancedChartGroupState6, function1, function12, function13, function14, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrubDot___WMjBM$lambda$291(ConstraintLayoutScope constraintLayoutScope, Chart chart, int i, float f, List list, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, int i2, Composer composer, int i3) {
        m18582ScrubDot_WMjBM(constraintLayoutScope, chart, i, f, list, constraintLayoutBaseScope4, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SduiAdvancedChartGroup$lambda$48$lambda$47$lambda$46$lambda$43$lambda$42 */
    public static final float m2462xe75ccf6b(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$87(ChartGroup chartGroup, Modifier modifier, Tuples2 tuples2, AdvancedChartGroupState advancedChartGroupState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i, int i2, Composer composer, int i3) {
        SduiAdvancedChartGroup(chartGroup, modifier, tuples2, advancedChartGroupState, function1, function12, function13, function14, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: coerceInRect-3MmeM6k, reason: not valid java name */
    private static final long m18591coerceInRect3MmeM6k(long j, Rect rect) {
        float fCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (j >> 32)), 0.0f), rect.getRight() - rect.getLeft());
        float fCoerceAtMost2 = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f), rect.getBottom() - rect.getTop());
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fCoerceAtMost) << 32) | (Float.floatToRawIntBits(fCoerceAtMost2) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupScrubLines_Liby8ZU$lambda$275$lambda$274(Rect rect, long j, float f, ScrubConfig scrubConfig, long j2, Stroke stroke, float f2, float f3, DrawScope Canvas) throws Throwable {
        DrawContext drawContext;
        long j3;
        long j4;
        long j5 = j;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Rect rectIntersect = Rect2.m6564Rect3MmeM6k(j5, Float.max(rect.getRight() - rect.getLeft(), rect.getBottom() - rect.getTop()) * f).intersect(rect);
        DrawContext drawContext2 = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext2.mo6936getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            DrawTransform.m6967clipRectN_I0leg$default(drawContext2.getTransform(), rectIntersect.getLeft(), rectIntersect.getTop(), rectIntersect.getRight(), rectIntersect.getBottom(), 0, 16, null);
            if (scrubConfig.getYLineEnabled()) {
                try {
                    long jM6537copydBAh8RU$default = Offset.m6537copydBAh8RU$default(j5, rect.getLeft(), 0.0f, 2, null);
                    j5 = j;
                    drawContext = drawContext2;
                    j4 = jMo6936getSizeNHjbRc;
                    try {
                        m18593drawScrubLinejQKiII(Canvas, jM6537copydBAh8RU$default, Offset.m6537copydBAh8RU$default(j5, rect.getRight(), 0.0f, 2, null), j2, stroke);
                    } catch (Throwable th) {
                        th = th;
                        j3 = j4;
                        drawContext.getCanvas().restore();
                        drawContext.mo6937setSizeuvyYCjk(j3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    j4 = jMo6936getSizeNHjbRc;
                    j3 = j4;
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j3);
                    throw th;
                }
            } else {
                drawContext = drawContext2;
                j4 = jMo6936getSizeNHjbRc;
            }
            if (scrubConfig.getXLineEnabled()) {
                j3 = j4;
                try {
                    m18593drawScrubLinejQKiII(Canvas, Offset.m6536copydBAh8RU(j5, f2, rect.getTop()), Offset.m6536copydBAh8RU(j5, f2, rect.getBottom() - f3), j2, stroke);
                } catch (Throwable th3) {
                    th = th3;
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j3);
                    throw th;
                }
            } else {
                j3 = j4;
            }
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(j3);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            drawContext = drawContext2;
            j3 = jMo6936getSizeNHjbRc;
        }
    }

    private static final float ProtoSduiAdvancedChartGroup$lambda$184$lambda$104(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartGroupState2 ProtoSduiAdvancedChartGroup$lambda$184$lambda$106(SnapshotState<AdvancedChartGroupState2> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(SnapshotState4<Rect> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(SnapshotState4<ScrubState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float ProtoSduiAdvancedChartGroup$lambda$184$lambda$146(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ranges3<Float> ProtoSduiAdvancedChartGroup$lambda$184$lambda$99(SnapshotState<Ranges3<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ranges3<Float> SduiAdvancedChartGroup$lambda$11(SnapshotState<Ranges3<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final float SduiAdvancedChartGroup$lambda$16(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartGroupState2 SduiAdvancedChartGroup$lambda$18(SnapshotState<AdvancedChartGroupState2> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset SduiAdvancedChartGroup$lambda$24(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect SduiAdvancedChartGroup$lambda$36(SnapshotState4<Rect> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState SduiAdvancedChartGroup$lambda$49(SnapshotState4<ScrubState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float SduiAdvancedChartGroup$lambda$54(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$1$lambda$0(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$3$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$5$lambda$4(ScrubState scrubState) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$7$lambda$6(Ranges3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiAdvancedChartGroup(final ChartGroup<? extends ActionT> chartGroup, Modifier modifier, Tuples2<? extends ChartGroup<? extends ActionT>, AdvancedChartZoomKeys> tuples2, AdvancedChartGroupState advancedChartGroupState, Function1<? super Float, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super ScrubState, Unit> function13, Function1<? super Ranges3<Float>, Unit> function14, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Tuples2<? extends ChartGroup<? extends ActionT>, AdvancedChartZoomKeys> tuples22;
        AdvancedChartGroupState advancedChartGroupState2;
        int i5;
        Function1<? super Float, Unit> function15;
        int i6;
        final Function1<? super Boolean, Unit> function16;
        int i7;
        Function1<? super ScrubState, Unit> function17;
        int i8;
        int i9;
        AdvancedChartGroupState advancedChartGroupState3;
        Function1<? super Ranges3<Float>, Unit> function18;
        Function0<Unit> function02;
        AdvancedChartGroupState advancedChartGroupState4;
        boolean zChanged;
        Object objRememberedValue;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        ChartGroup<? extends ActionT> first;
        Function1<? super Ranges3<Float>, Unit> function19;
        final Axis axis;
        Iterator it;
        final int size;
        Object objRememberedValue4;
        Composer.Companion companion2;
        Tuples2<? extends ChartGroup<? extends ActionT>, AdvancedChartZoomKeys> tuples23;
        final SnapshotState snapshotState2;
        boolean zChanged2;
        Object objRememberedValue5;
        final SnapshotStateMap snapshotStateMap;
        boolean zChanged3;
        Object objRememberedValue6;
        final SnapshotStateMap snapshotStateMap2;
        Object objRememberedValue7;
        Object objRememberedValue8;
        SnapshotState4 snapshotState4;
        boolean zChanged4;
        final SnapshotState snapshotState3;
        int i10;
        Axis axis2;
        AdvancedChartGroupState advancedChartGroupState5;
        final SnapshotStateMap snapshotStateMap3;
        Object objDerivedStateOf;
        final SnapshotState4 snapshotState42;
        boolean zChanged5;
        Object objRememberedValue9;
        AdvancedChartGroupState advancedChartGroupState6;
        boolean zChanged6;
        Object objRememberedValue10;
        AdvancedChartGroupState advancedChartGroupState7;
        Function1<? super ScrubState, Unit> function110;
        final SnapshotState4 snapshotState43;
        Object objRememberedValue11;
        final HapticFeedback hapticFeedback;
        Object objRememberedValue12;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue13;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SnapshotState snapshotState5;
        final AdvancedChartGroupState advancedChartGroupState8;
        Function1<? super Ranges3<Float>, Unit> function111;
        final SnapshotState snapshotState6;
        Function0<Unit> function03;
        boolean z;
        Object objRememberedValue14;
        boolean zChangedInstance;
        Object objRememberedValue15;
        boolean zChangedInstance2;
        Object objRememberedValue16;
        Object objRememberedValue17;
        final Measurer2 measurer2;
        Object objRememberedValue18;
        Object objRememberedValue19;
        final SnapshotState snapshotState7;
        Object objRememberedValue20;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue21;
        final SnapshotState snapshotState8;
        final int i11;
        boolean zChanged7;
        Object objRememberedValue22;
        Object objRememberedValue23;
        boolean zChangedInstance3;
        Object objRememberedValue24;
        final Function1<? super Ranges3<Float>, Unit> function112;
        Composer composer2;
        final AdvancedChartGroupState advancedChartGroupState9;
        final Function1<? super ScrubState, Unit> function113;
        final Tuples2<? extends ChartGroup<? extends ActionT>, AdvancedChartZoomKeys> tuples24;
        final Function0<Unit> function04;
        final Function1<? super Float, Unit> function114;
        final Modifier modifier3;
        AdvancedChartZoomKeys second;
        int i12;
        Axis axisMapSduiAxis;
        AdvancedChartZoomKeys second2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(1216595645);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
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
                    tuples22 = tuples2;
                    i3 |= composerStartRestartGroup.changedInstance(tuples22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        advancedChartGroupState2 = advancedChartGroupState;
                        int i14 = composerStartRestartGroup.changedInstance(advancedChartGroupState2) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        advancedChartGroupState2 = advancedChartGroupState;
                    }
                    i3 |= i14;
                } else {
                    advancedChartGroupState2 = advancedChartGroupState;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function15 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        function16 = function12;
                    } else {
                        function16 = function12;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function17 = function13;
                    } else {
                        function17 = function13;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function17) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                tuples22 = null;
                            }
                            if ((i2 & 8) == 0) {
                                advancedChartGroupState3 = new AdvancedChartGroupState(null, null, null, 0, false, 31, null);
                                i3 &= -7169;
                            } else {
                                advancedChartGroupState3 = advancedChartGroupState2;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue25 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda43
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$1$lambda$0(((Float) obj).floatValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue25;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue26 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda47
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function16 = (Function1) objRememberedValue26;
                            }
                            if (i7 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue27 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda48
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$5$lambda$4((ScrubState) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function17 = (Function1) objRememberedValue27;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue28 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda49
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$7$lambda$6((Ranges3) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                                }
                                function18 = (Function1) objRememberedValue28;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function18 = function14;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue29 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda50
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue29;
                            } else {
                                function02 = function0;
                            }
                            advancedChartGroupState4 = advancedChartGroupState3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            function18 = function14;
                            function02 = function0;
                            advancedChartGroupState4 = advancedChartGroupState2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1216595645, i3, -1, "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartGroup (SduiAdvancedChart.kt:109)");
                        }
                        Object xZoomRangeResetKey = (tuples22 != null || (second2 = tuples22.getSecond()) == null) ? null : second2.getXZoomRangeResetKey();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(xZoomRangeResetKey);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            function18.invoke(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE());
                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                            objRememberedValue = snapshotStateMutableStateOf$default;
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(snapshotFloatState22.getFloatValue(), null, 0.0f, "adv-chart-edge-bounce", null, composerStartRestartGroup, 3072, 22);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(AdvancedChartGroupState2.IDLE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default2);
                            objRememberedValue3 = snapshotStateMutableStateOf$default2;
                        }
                        SnapshotState snapshotState9 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        if (tuples22 != null || (first = tuples22.getFirst()) == null) {
                            first = chartGroup;
                        }
                        function19 = function18;
                        final ChartGroup chartGroupTransform = SduiChartZoomTransformer.transform(first, SduiAdvancedChartGroup$lambda$11(snapshotState), advancedChartGroupState4.getAxisConfig().getXAxisZoomable(), advancedChartGroupState4.getAxisConfig().getSortedChartGroupZoomXAxes(), advancedChartGroupState4.getAxisConfig().getPointsForYAxisZoomRangeCalculation());
                        ChartAxis x_axis = chartGroupTransform.getX_axis();
                        composerStartRestartGroup.startReplaceGroup(917381824);
                        Axis axisMapSduiAxis2 = x_axis != null ? null : SduiChartMappersKt.mapSduiAxis(x_axis, AxisType.f3953X, composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(917384575);
                        List<Chart<ActionT>> charts = chartGroupTransform.getCharts();
                        axis = axisMapSduiAxis2;
                        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
                        it = charts.iterator();
                        while (it.hasNext()) {
                            ChartAxis y_axis = ((Chart) it.next()).getY_axis();
                            Iterator it2 = it;
                            composerStartRestartGroup.startReplaceGroup(917385472);
                            if (y_axis == null) {
                                i12 = i3;
                                axisMapSduiAxis = null;
                            } else {
                                i12 = i3;
                                axisMapSduiAxis = SduiChartMappersKt.mapSduiAxis(y_axis, AxisType.f3954Y, composerStartRestartGroup, 48);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            arrayList.add(axisMapSduiAxis);
                            it = it2;
                            i3 = i12;
                        }
                        int i15 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        size = first.getCharts().size();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue4 != companion2.getEmpty()) {
                            tuples23 = tuples22;
                            SnapshotState snapshotStateMutableStateOf$default3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default3);
                            objRememberedValue4 = snapshotStateMutableStateOf$default3;
                        } else {
                            tuples23 = tuples22;
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(chartGroupTransform);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.mutableStateMapOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        snapshotStateMap = (SnapshotStateMap) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged3 = composerStartRestartGroup.changed(chartGroupTransform);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = SnapshotStateKt.mutableStateMapOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        snapshotStateMap2 = (SnapshotStateMap) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion2.getEmpty()) {
                            objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda51
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$35$lambda$34(snapshotStateMap, snapshotIntState2);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        snapshotState4 = (SnapshotState4) objRememberedValue8;
                        composerStartRestartGroup.endReplaceGroup();
                        Offset offsetSduiAdvancedChartGroup$lambda$24 = SduiAdvancedChartGroup$lambda$24(snapshotState2);
                        ScrubConfig scrubConfig = advancedChartGroupState4.getScrubConfig();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged4 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(offsetSduiAdvancedChartGroup$lambda$24) | composerStartRestartGroup.changed(scrubConfig) | composerStartRestartGroup.changed(snapshotStateMap);
                        Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4 || objRememberedValue30 == companion2.getEmpty()) {
                            final AdvancedChartGroupState advancedChartGroupState10 = advancedChartGroupState4;
                            Function0 function05 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda52
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$48$lambda$47(snapshotState2, size, axis, advancedChartGroupState10, snapshotStateMap, snapshotStateMap2);
                                }
                            };
                            snapshotState3 = snapshotState2;
                            i10 = size;
                            axis2 = axis;
                            advancedChartGroupState5 = advancedChartGroupState10;
                            snapshotStateMap3 = snapshotStateMap;
                            objDerivedStateOf = SnapshotStateKt.derivedStateOf(function05);
                            composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                        } else {
                            objDerivedStateOf = objRememberedValue30;
                            snapshotStateMap3 = snapshotStateMap;
                            advancedChartGroupState5 = advancedChartGroupState4;
                            snapshotState3 = snapshotState2;
                            i10 = size;
                            axis2 = axis;
                        }
                        snapshotState42 = (SnapshotState4) objDerivedStateOf;
                        composerStartRestartGroup.endReplaceGroup();
                        final Axis axis3 = axis2;
                        ScrubState scrubStateSduiAdvancedChartGroup$lambda$49 = SduiAdvancedChartGroup$lambda$49(snapshotState42);
                        final int i16 = i10;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged5 = ((i15 & 3670016) != 1048576) | composerStartRestartGroup.changed(snapshotState42);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged5 || objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$6$1(function17, snapshotState42, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(scrubStateSduiAdvancedChartGroup$lambda$49, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, Point.$stable);
                        Object xZoomRangeValidationKey = (tuples23 != null || (second = tuples23.getSecond()) == null) ? null : second.getXZoomRangeValidationKey();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i17 = i15 & 29360128;
                        advancedChartGroupState6 = advancedChartGroupState5;
                        zChanged6 = (i17 != 8388608) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState5);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged6 || objRememberedValue10 == companion2.getEmpty()) {
                            objRememberedValue10 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$7$1(advancedChartGroupState6, function19, snapshotState4, snapshotState, null);
                            advancedChartGroupState7 = advancedChartGroupState6;
                            function110 = function17;
                            snapshotState43 = snapshotState4;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        } else {
                            advancedChartGroupState7 = advancedChartGroupState6;
                            function110 = function17;
                            snapshotState43 = snapshotState4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(xZoomRangeValidationKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == companion2.getEmpty()) {
                            objRememberedValue11 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda53
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$53$lambda$52(snapshotState43, snapshotState42);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        final SnapshotState4 snapshotState44 = (SnapshotState4) objRememberedValue11;
                        composerStartRestartGroup.endReplaceGroup();
                        hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == companion2.getEmpty()) {
                            objRememberedValue12 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue12;
                        composerStartRestartGroup.endReplaceGroup();
                        float floatValue = snapshotFloatState2.getFloatValue();
                        final SnapshotState4 snapshotState45 = snapshotState43;
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == companion2.getEmpty()) {
                            objRememberedValue13 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda54
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$59$lambda$58(snapshotState3, ((Float) obj).floatValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(floatValue, tweenSpecTween$default, 0.0f, null, (Function1) objRememberedValue13, composerStartRestartGroup, 24624, 12);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        SnapshotState snapshotState10 = snapshotState3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function15.invoke(snapshotState4AnimateFloatAsState2.getValue());
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(917609481);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(917610149);
                        if (advancedChartGroupState7.getAxisConfig().getXAxisZoomable()) {
                            snapshotState5 = snapshotState10;
                            advancedChartGroupState8 = advancedChartGroupState7;
                            function111 = function19;
                            snapshotState6 = snapshotState9;
                            function03 = function02;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged8 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                            Object objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                            if (zChanged8 || objRememberedValue31 == companion2.getEmpty()) {
                                objRememberedValue31 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda55
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$64$lambda$62$lambda$61(snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue31);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxSize$default, (Function1) objRememberedValue31);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChanged9 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState7) | (i17 == 8388608) | ((i15 & 234881024) == 67108864);
                            Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                            if (zChanged9 || objRememberedValue32 == companion2.getEmpty()) {
                                AdvancedChartGroupState advancedChartGroupState11 = advancedChartGroupState7;
                                objRememberedValue32 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1(advancedChartGroupState11, function19, snapshotState10, snapshotState9, snapshotState45, snapshotState, snapshotFloatState22, function02);
                                advancedChartGroupState8 = advancedChartGroupState11;
                                function111 = function19;
                                snapshotState5 = snapshotState10;
                                snapshotState6 = snapshotState9;
                                function03 = function02;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                            } else {
                                snapshotState5 = snapshotState10;
                                advancedChartGroupState8 = advancedChartGroupState7;
                                function111 = function19;
                                snapshotState6 = snapshotState9;
                                function03 = function02;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierFillMaxSize$default = SuspendingPointerInputFilterKt.pointerInput(modifierGraphicsLayer, first, (PointerInputEventHandler) objRememberedValue32);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i18 = i15 & 458752;
                        z = i18 != 131072;
                        Function1<? super Ranges3<Float>, Unit> function115 = function111;
                        objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue14 == companion2.getEmpty()) {
                            objRememberedValue14 = new PointerInputEventHandler() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1

                                /* compiled from: SduiAdvancedChart.kt */
                                @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
                                /* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1$1 */
                                static final class C278951 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SnapshotState<Offset> $globalScrubOffset$delegate;
                                    final /* synthetic */ Function1<Boolean, Unit> $onScrubbingModeUpdated;
                                    final /* synthetic */ SnapshotState<AdvancedChartGroupState2> $pointerInputState$delegate;
                                    final /* synthetic */ SnapshotFloatState2 $scrubLineAnimationTarget$delegate;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    C278951(Function1<? super Boolean, Unit> function1, SnapshotState<AdvancedChartGroupState2> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super C278951> continuation) {
                                        super(3, continuation);
                                        this.$onScrubbingModeUpdated = function1;
                                        this.$pointerInputState$delegate = snapshotState;
                                        this.$scrubLineAnimationTarget$delegate = snapshotFloatState2;
                                        this.$globalScrubOffset$delegate = snapshotState2;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                        return m18598invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                    }

                                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                    public final Object m18598invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                        return new C278951(this.$onScrubbingModeUpdated, this.$pointerInputState$delegate, this.$scrubLineAnimationTarget$delegate, this.$globalScrubOffset$delegate, continuation).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.$pointerInputState$delegate.setValue(AdvancedChartGroupState2.PRESSING);
                                            this.$scrubLineAnimationTarget$delegate.setFloatValue(0.0f);
                                            if (SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$24(this.$globalScrubOffset$delegate) != null) {
                                                this.$onScrubbingModeUpdated.invoke(boxing.boxBoolean(false));
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }

                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C278951(function16, snapshotState6, snapshotFloatState2, snapshotState5, null), null, continuation, 11, null);
                                    return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) objRememberedValue14);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | (i18 != 131072);
                        objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue15 == companion2.getEmpty()) {
                            final SnapshotState snapshotState11 = snapshotState5;
                            final SnapshotState snapshotState12 = snapshotState6;
                            final Function1<? super Boolean, Unit> function116 = function16;
                            objRememberedValue15 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda44
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$67$lambda$66(hapticFeedback, function116, snapshotState12, snapshotState11, snapshotFloatState2, (Offset) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                        }
                        Function1 function117 = (Function1) objRememberedValue15;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(advancedChartGroupState8);
                        objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue16 == companion2.getEmpty()) {
                            objRememberedValue16 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda45
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$69$lambda$68(advancedChartGroupState8, snapshotState6, snapshotState5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierScrubDetection = Interactions2.scrubDetection(modifierPointerInput, function117, (Function0) objRememberedValue16);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue17 == companion2.getEmpty()) {
                            objRememberedValue17 = new Measurer2(density);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                        }
                        measurer2 = (Measurer2) objRememberedValue17;
                        objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue18 == companion2.getEmpty()) {
                            objRememberedValue18 = new ConstraintLayoutScope();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue18;
                        objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue19 == companion2.getEmpty()) {
                            objRememberedValue19 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                        }
                        snapshotState7 = (SnapshotState) objRememberedValue19;
                        objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue20 == companion2.getEmpty()) {
                            objRememberedValue20 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue20;
                        objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue21 == companion2.getEmpty()) {
                            objRememberedValue21 = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                        }
                        snapshotState8 = (SnapshotState) objRememberedValue21;
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(measurer2);
                        i11 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged7 = zChangedInstance4 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged7 || objRememberedValue22 == companion2.getEmpty()) {
                            objRememberedValue22 = new MeasurePolicy() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState8.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i11);
                                    snapshotState7.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$2.1
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
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue22;
                        objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue23 == companion2.getEmpty()) {
                            objRememberedValue23 = new Function0<Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$3
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
                                    snapshotState7.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        }
                        final Function0 function06 = (Function0) objRememberedValue23;
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                        objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3 || objRememberedValue24 == companion2.getEmpty()) {
                            objRememberedValue24 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$4
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
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                        }
                        final AdvancedChartGroupState advancedChartGroupState12 = advancedChartGroupState8;
                        final ChartGroup<? extends ActionT> chartGroup2 = first;
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScrubDetection, false, (Function1) objRememberedValue24, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                Composer composer4 = composer3;
                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i19, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState8.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer4.startReplaceGroup(-200601766);
                                ArrayList arrayList2 = new ArrayList(i16);
                                for (int i20 = 0; i20 < i16; i20++) {
                                    arrayList2.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList3 = new ArrayList(i16);
                                for (int i21 = 0; i21 < i16; i21++) {
                                    arrayList3.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList4 = new ArrayList(i16);
                                for (int i22 = 0; i22 < i16; i22++) {
                                    arrayList4.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList5 = new ArrayList(i16);
                                for (int i23 = 0; i23 < i16; i23++) {
                                    arrayList5.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ArrayList arrayList6 = new ArrayList(i16);
                                for (int i24 = 0; i24 < i16; i24++) {
                                    arrayList6.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList7 = new ArrayList(i16);
                                for (int i25 = 0; i25 < i16; i25++) {
                                    arrayList7.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope2.createRef();
                                ArrayList arrayList8 = new ArrayList(i16);
                                for (int i26 = 0; i26 < i16; i26++) {
                                    arrayList8.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList4.toArray(new ConstraintLayoutBaseScope4[0]);
                                ArrayList arrayList9 = arrayList3;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                float fMo5013toDpu2uoSUM = ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(advancedChartGroupState12.getTopIndicatorPadding());
                                List charts2 = chartGroup2.getCharts();
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts2, 10));
                                Iterator it3 = charts2.iterator();
                                while (it3.hasNext()) {
                                    Float weight = ((Chart) it3.next()).getWeight();
                                    arrayList10.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
                                }
                                List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope2, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList10, advancedChartGroupState12.getUseWeightsAsHeight());
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
                                int i27 = i16;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8137createEndBarrier3ABfNKs$default;
                                Axis axis4 = axis3;
                                AxisConfig axisConfig = advancedChartGroupState12.getAxisConfig();
                                composer4.startReplaceGroup(5004770);
                                Object objRememberedValue33 = composer4.rememberedValue();
                                if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue33 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$1$1(snapshotIntState2);
                                    composer4.updateRememberedValue(objRememberedValue33);
                                }
                                composer4.endReplaceGroup();
                                ArrayList arrayList11 = arrayList8;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2 = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                SduiAdvancedChartKt.ChartGroupXAxis(constraintLayoutScope2, i27, axis4, constraintLayoutBaseScope4Component1, arrayList2, axisConfig, verticalAnchor2, verticalAnchor, (Function1) objRememberedValue33, composer4, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 6));
                                ArrayList arrayList12 = arrayList2;
                                composer4.startReplaceGroup(1933257821);
                                int i28 = 0;
                                for (Object obj : chartGroupTransform.getCharts()) {
                                    int i29 = i28 + 1;
                                    if (i28 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Chart chart = (Chart) obj;
                                    float fM7995constructorimpl2 = i28 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
                                    Axis axis5 = (Axis) arrayList.get(i28);
                                    YAxisLocation yAxisLocation = advancedChartGroupState12.getAxisConfig().getYAxisLocation();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged10 = composer4.changed(snapshotStateMap2) | composer4.changed(i28);
                                    Object objRememberedValue34 = composer4.rememberedValue();
                                    if (zChanged10 || objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue34 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$1$1(snapshotStateMap2, i28);
                                        composer4.updateRememberedValue(objRememberedValue34);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue34);
                                    int i30 = ConstraintLayoutScope.$stable;
                                    ArrayList arrayList13 = arrayList12;
                                    ArrayList arrayList14 = arrayList4;
                                    int i31 = i28;
                                    SduiAdvancedChartKt.ChartYAxis(constraintLayoutScope2, axis5, arrayList14, arrayList13, i31, yAxisLocation, verticalAnchor2, verticalAnchor, modifierOnGloballyPositioned, composer4, i30 | (Axis.$stable << 3), 0);
                                    arrayList12 = arrayList13;
                                    List<SegmentedLine> listMapSduiSegmentedLines = SduiChartMappersKt.mapSduiSegmentedLines(chart.getLines(), composer4, 0);
                                    ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(chart.getFills(), composer4, 0);
                                    boolean useWeightsAsHeight = advancedChartGroupState12.getUseWeightsAsHeight();
                                    ScrubState scrubStateSduiAdvancedChartGroup$lambda$492 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                    YAxisLocation yAxisLocation2 = advancedChartGroupState12.getAxisConfig().getYAxisLocation();
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged11 = composer4.changed(snapshotStateMap3) | composer4.changed(i31);
                                    Object objRememberedValue35 = composer4.rememberedValue();
                                    if (zChanged11 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue35 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$2$1(snapshotStateMap3, i31);
                                        composer4.updateRememberedValue(objRememberedValue35);
                                    }
                                    composer4.endReplaceGroup();
                                    int i32 = helpersHashCode;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3 = verticalAnchor2;
                                    List list = listM18594getHorizontalGuidelinesrAjV9yQ;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor;
                                    ArrayList arrayList15 = arrayList11;
                                    SduiAdvancedChartKt.m18575ChartkiIZU34(constraintLayoutScope2, chart, arrayList12, arrayList15, list, useWeightsAsHeight, fM7995constructorimpl2, i31, listMapSduiSegmentedLines, immutableListMapSduiFills, scrubStateSduiAdvancedChartGroup$lambda$492, yAxisLocation2, verticalAnchor3, verticalAnchor4, null, (Function1) objRememberedValue35, composer3, i30, Point.$stable | 24576);
                                    arrayList11 = arrayList15;
                                    verticalAnchor2 = verticalAnchor3;
                                    verticalAnchor = verticalAnchor4;
                                    SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope2, arrayList11, arrayList12, i31, advancedChartGroupState12.getChartBottomDividerType(), advancedChartGroupState12.getAxisConfig().getYAxisLocation(), verticalAnchor2, verticalAnchor, composer3, i30);
                                    composer4 = composer3;
                                    listM18594getHorizontalGuidelinesrAjV9yQ = list;
                                    i28 = i29;
                                    arrayList4 = arrayList14;
                                    helpersHashCode = i32;
                                    arrayList9 = arrayList9;
                                }
                                int i33 = helpersHashCode;
                                List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
                                ArrayList arrayList16 = arrayList9;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor2;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor;
                                composer3.endReplaceGroup();
                                boolean xAxisBottomDividers = advancedChartGroupState12.getAxisConfig().getXAxisBottomDividers();
                                int i34 = ConstraintLayoutScope.$stable;
                                SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope2, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer3, i34);
                                Composer composer5 = composer3;
                                ScrubState scrubStateSduiAdvancedChartGroup$lambda$493 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                Float snapX = scrubStateSduiAdvancedChartGroup$lambda$493 != null ? scrubStateSduiAdvancedChartGroup$lambda$493.getSnapX() : null;
                                composer5.startReplaceGroup(-1746271574);
                                boolean zChanged12 = composer5.changed(snapshotState42) | composer5.changedInstance(advancedChartGroupState12) | composer5.changedInstance(hapticFeedback);
                                Object objRememberedValue36 = composer5.rememberedValue();
                                if (zChanged12 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue36 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1(advancedChartGroupState12, hapticFeedback, snapshotState42, null);
                                    composer5.updateRememberedValue(objRememberedValue36);
                                }
                                composer5.endReplaceGroup();
                                int i35 = 0;
                                EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue36, composer5, 0);
                                ScrubState scrubStateSduiAdvancedChartGroup$lambda$494 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                composer5.startReplaceGroup(1933337281);
                                if (scrubStateSduiAdvancedChartGroup$lambda$494 != null) {
                                    SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope2, advancedChartGroupState12.getScrubConfig(), scrubStateSduiAdvancedChartGroup$lambda$494.m2457x73acf0ad(), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$36(snapshotState45), scrubStateSduiAdvancedChartGroup$lambda$494.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) snapshotState4AnimateFloatAsState2.getValue()).floatValue(), composer5, i34);
                                    composer5 = composer5;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1933353366);
                                int i36 = 0;
                                for (Object obj2 : chartGroupTransform.getCharts()) {
                                    int i37 = i36 + 1;
                                    if (i36 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Chart chart2 = (Chart) obj2;
                                    float fM7995constructorimpl3 = i36 == 0 ? C2002Dp.m7995constructorimpl(i35) : fM7995constructorimpl;
                                    ArrayList arrayList17 = arrayList16;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList17.get(i36);
                                    ScrubState scrubStateSduiAdvancedChartGroup$lambda$495 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                    YAxisLocation yAxisLocation3 = advancedChartGroupState12.getAxisConfig().getYAxisLocation();
                                    int i38 = ConstraintLayoutScope.$stable;
                                    int i39 = Point.$stable;
                                    arrayList16 = arrayList17;
                                    int i40 = i36;
                                    float f = fM7995constructorimpl3;
                                    List list3 = list2;
                                    int i41 = i35;
                                    Composer composer6 = composer5;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchor5;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor8 = verticalAnchor6;
                                    SduiAdvancedChartKt.m18582ScrubDot_WMjBM(constraintLayoutScope2, chart2, i40, f, list3, constraintLayoutBaseScope4, scrubStateSduiAdvancedChartGroup$lambda$495, yAxisLocation3, verticalAnchor7, verticalAnchor8, composer6, i38 | (i39 << 18));
                                    int i42 = i40;
                                    List list4 = list3;
                                    Composer composer7 = composer6;
                                    composer7.startReplaceGroup(1933375086);
                                    if (advancedChartGroupState12.getScrubConfig().getYLabelEnabled()) {
                                        SduiAdvancedChartKt.m18577ChartYAxisScrubLabelskrPljE(constraintLayoutScope2, (Axis) arrayList.get(i42), arrayList5, list4, f, i42, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$54(snapshotState44), advancedChartGroupState12.getAxisConfig().getYAxisLocation(), verticalAnchor7, verticalAnchor8, composer7, (i39 << 18) | i38 | (Axis.$stable << 3), 0);
                                        list4 = list4;
                                        i42 = i42;
                                        verticalAnchor5 = verticalAnchor7;
                                        verticalAnchor6 = verticalAnchor8;
                                        composer7 = composer7;
                                    } else {
                                        verticalAnchor5 = verticalAnchor7;
                                        verticalAnchor6 = verticalAnchor8;
                                    }
                                    composer7.endReplaceGroup();
                                    composer7.startReplaceGroup(1933399731);
                                    if (advancedChartGroupState12.getScrubConfig().getLegendsEnabled()) {
                                        SduiAdvancedChartKt.ChartLegends(constraintLayoutScope2, ChartLegend.toLegendLists(chart2.getLegend_data()), list4, i42, arrayList6, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), composer7, i38 | (i39 << 15));
                                    }
                                    composer3.endReplaceGroup();
                                    SduiAdvancedChartKt.ChartTitle(constraintLayoutScope2, arrayList7, list4, i42, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), chart2.getTitle(), composer3, i38 | (i39 << 12));
                                    list2 = list4;
                                    composer5 = composer3;
                                    i36 = i37;
                                    i35 = i41;
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1933420228);
                                if (advancedChartGroupState12.getScrubConfig().getXLabelEnabled()) {
                                    SduiAdvancedChartKt.ChartGroupXAxisScrubLabel(constraintLayoutScope2, axis3, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), advancedChartGroupState12.getAxisConfig().getYAxisLocation(), verticalAnchor5, verticalAnchor6, null, composer5, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 3) | (Point.$stable << 12));
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1933438664);
                                if (advancedChartGroupState12.getScrubConfig().getLegendsEnabled()) {
                                    SduiAdvancedChartKt.ChartGroupLegends(constraintLayoutScope2, ChartLegend.toLegendLists(chartGroupTransform.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), ((Number) snapshotState4AnimateFloatAsState2.getValue()).floatValue(), composer5, ConstraintLayoutScope.$stable | (Point.$stable << 9));
                                }
                                composer5.endReplaceGroup();
                                composer5.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i33) {
                                    EffectsKt.SideEffect(function06, composer5, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function112 = function115;
                        composer2 = composerStartRestartGroup;
                        advancedChartGroupState9 = advancedChartGroupState8;
                        function113 = function110;
                        tuples24 = tuples23;
                        function04 = function03;
                        function114 = function15;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function113 = function17;
                        tuples24 = tuples22;
                        advancedChartGroupState9 = advancedChartGroupState2;
                        function112 = function14;
                        function04 = function0;
                        modifier3 = modifier2;
                        function114 = function15;
                    }
                    final Function1<? super Boolean, Unit> function118 = function16;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda46
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$87(chartGroup, modifier3, tuples24, advancedChartGroupState9, function114, function118, function113, function112, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function15 = function1;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        advancedChartGroupState4 = advancedChartGroupState3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (tuples22 != null) {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(xZoomRangeResetKey);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                function18.invoke(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE());
                                SnapshotState snapshotStateMutableStateOf$default4 = SnapshotState3.mutableStateOf$default(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE(), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default4);
                                objRememberedValue = snapshotStateMutableStateOf$default4;
                                snapshotState = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                SnapshotFloatState2 snapshotFloatState222 = (SnapshotFloatState2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                final SnapshotState4 snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(snapshotFloatState222.getFloatValue(), null, 0.0f, "adv-chart-edge-bounce", null, composerStartRestartGroup, 3072, 22);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                }
                                SnapshotState snapshotState92 = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                if (tuples22 != null) {
                                    first = chartGroup;
                                    function19 = function18;
                                    final ChartGroup chartGroupTransform2 = SduiChartZoomTransformer.transform(first, SduiAdvancedChartGroup$lambda$11(snapshotState), advancedChartGroupState4.getAxisConfig().getXAxisZoomable(), advancedChartGroupState4.getAxisConfig().getSortedChartGroupZoomXAxes(), advancedChartGroupState4.getAxisConfig().getPointsForYAxisZoomRangeCalculation());
                                    ChartAxis x_axis2 = chartGroupTransform2.getX_axis();
                                    composerStartRestartGroup.startReplaceGroup(917381824);
                                    if (x_axis2 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(917384575);
                                    List<Chart<ActionT>> charts2 = chartGroupTransform2.getCharts();
                                    axis = axisMapSduiAxis2;
                                    final List arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts2, 10));
                                    it = charts2.iterator();
                                    while (it.hasNext()) {
                                    }
                                    int i152 = i3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    size = first.getCharts().size();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    companion2 = Composer.INSTANCE;
                                    if (objRememberedValue4 != companion2.getEmpty()) {
                                    }
                                    snapshotState2 = (SnapshotState) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged2 = composerStartRestartGroup.changed(chartGroupTransform2);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2) {
                                        objRememberedValue5 = SnapshotStateKt.mutableStateMapOf();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        snapshotStateMap = (SnapshotStateMap) objRememberedValue5;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChanged3 = composerStartRestartGroup.changed(chartGroupTransform2);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged3) {
                                            objRememberedValue6 = SnapshotStateKt.mutableStateMapOf();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            snapshotStateMap2 = (SnapshotStateMap) objRememberedValue6;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue7 == companion2.getEmpty()) {
                                            }
                                            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue7;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue8 == companion2.getEmpty()) {
                                            }
                                            snapshotState4 = (SnapshotState4) objRememberedValue8;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Offset offsetSduiAdvancedChartGroup$lambda$242 = SduiAdvancedChartGroup$lambda$24(snapshotState2);
                                            ScrubConfig scrubConfig2 = advancedChartGroupState4.getScrubConfig();
                                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                                            zChanged4 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(offsetSduiAdvancedChartGroup$lambda$242) | composerStartRestartGroup.changed(scrubConfig2) | composerStartRestartGroup.changed(snapshotStateMap);
                                            Object objRememberedValue302 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged4) {
                                                final AdvancedChartGroupState advancedChartGroupState102 = advancedChartGroupState4;
                                                Function0 function052 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda52
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$48$lambda$47(snapshotState2, size, axis, advancedChartGroupState102, snapshotStateMap, snapshotStateMap2);
                                                    }
                                                };
                                                snapshotState3 = snapshotState2;
                                                i10 = size;
                                                axis2 = axis;
                                                advancedChartGroupState5 = advancedChartGroupState102;
                                                snapshotStateMap3 = snapshotStateMap;
                                                objDerivedStateOf = SnapshotStateKt.derivedStateOf(function052);
                                                composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                                                snapshotState42 = (SnapshotState4) objDerivedStateOf;
                                                composerStartRestartGroup.endReplaceGroup();
                                                final Axis axis32 = axis2;
                                                ScrubState scrubStateSduiAdvancedChartGroup$lambda$492 = SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                                final int i162 = i10;
                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                zChanged5 = ((i152 & 3670016) != 1048576) | composerStartRestartGroup.changed(snapshotState42);
                                                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged5) {
                                                    objRememberedValue9 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$6$1(function17, snapshotState42, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(scrubStateSduiAdvancedChartGroup$lambda$492, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, Point.$stable);
                                                    if (tuples23 != null) {
                                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                        int i172 = i152 & 29360128;
                                                        advancedChartGroupState6 = advancedChartGroupState5;
                                                        zChanged6 = (i172 != 8388608) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState5);
                                                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                        if (zChanged6) {
                                                            objRememberedValue10 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$7$1(advancedChartGroupState6, function19, snapshotState4, snapshotState, null);
                                                            advancedChartGroupState7 = advancedChartGroupState6;
                                                            function110 = function17;
                                                            snapshotState43 = snapshotState4;
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(xZoomRangeValidationKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue11 == companion2.getEmpty()) {
                                                            }
                                                            final SnapshotState4 snapshotState442 = (SnapshotState4) objRememberedValue11;
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue12 == companion2.getEmpty()) {
                                                            }
                                                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue12;
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            float floatValue2 = snapshotFloatState2.getFloatValue();
                                                            final SnapshotState4 snapshotState452 = snapshotState43;
                                                            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                                            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue13 == companion2.getEmpty()) {
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            final SnapshotState4 snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(floatValue2, tweenSpecTween$default2, 0.0f, null, (Function1) objRememberedValue13, composerStartRestartGroup, 24624, 12);
                                                            Modifier.Companion companion32 = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                                                            if (composerStartRestartGroup.getApplier() == null) {
                                                            }
                                                            composerStartRestartGroup.startReusableNode();
                                                            if (composerStartRestartGroup.getInserting()) {
                                                            }
                                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                            SnapshotState snapshotState102 = snapshotState3;
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                                                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                                                            if (!composerM6388constructorimpl.getInserting()) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                function15.invoke(snapshotState4AnimateFloatAsState22.getValue());
                                                                composerStartRestartGroup.endNode();
                                                                composerStartRestartGroup.startReplaceGroup(917609481);
                                                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                                                composerStartRestartGroup.startReplaceGroup(917610149);
                                                                if (advancedChartGroupState7.getAxisConfig().getXAxisZoomable()) {
                                                                }
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                Unit unit2 = Unit.INSTANCE;
                                                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                int i182 = i152 & 458752;
                                                                if (i182 != 131072) {
                                                                }
                                                                Function1<? super Ranges3<Float>, Unit> function1152 = function111;
                                                                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                                                if (!z) {
                                                                    objRememberedValue14 = new PointerInputEventHandler() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1

                                                                        /* compiled from: SduiAdvancedChart.kt */
                                                                        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                        @DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
                                                                        /* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$10$1$1 */
                                                                        static final class C278951 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SnapshotState<Offset> $globalScrubOffset$delegate;
                                                                            final /* synthetic */ Function1<Boolean, Unit> $onScrubbingModeUpdated;
                                                                            final /* synthetic */ SnapshotState<AdvancedChartGroupState2> $pointerInputState$delegate;
                                                                            final /* synthetic */ SnapshotFloatState2 $scrubLineAnimationTarget$delegate;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            C278951(Function1<? super Boolean, Unit> function1, SnapshotState<AdvancedChartGroupState2> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super C278951> continuation) {
                                                                                super(3, continuation);
                                                                                this.$onScrubbingModeUpdated = function1;
                                                                                this.$pointerInputState$delegate = snapshotState;
                                                                                this.$scrubLineAnimationTarget$delegate = snapshotFloatState2;
                                                                                this.$globalScrubOffset$delegate = snapshotState2;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function3
                                                                            public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                                                                return m18598invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                                                            }

                                                                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                                                            public final Object m18598invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                                                                return new C278951(this.$onScrubbingModeUpdated, this.$pointerInputState$delegate, this.$scrubLineAnimationTarget$delegate, this.$globalScrubOffset$delegate, continuation).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                if (this.label == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.$pointerInputState$delegate.setValue(AdvancedChartGroupState2.PRESSING);
                                                                                    this.$scrubLineAnimationTarget$delegate.setFloatValue(0.0f);
                                                                                    if (SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$24(this.$globalScrubOffset$delegate) != null) {
                                                                                        this.$onScrubbingModeUpdated.invoke(boxing.boxBoolean(false));
                                                                                    }
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                        }

                                                                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                                            Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C278951(function16, snapshotState6, snapshotFloatState2, snapshotState5, null), null, continuation, 11, null);
                                                                            return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default2, unit2, (PointerInputEventHandler) objRememberedValue14);
                                                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                    zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | (i182 != 131072);
                                                                    objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                                                    if (!zChangedInstance) {
                                                                        final SnapshotState snapshotState112 = snapshotState5;
                                                                        final SnapshotState snapshotState122 = snapshotState6;
                                                                        final Function1 function1162 = function16;
                                                                        objRememberedValue15 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda44
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$67$lambda$66(hapticFeedback, function1162, snapshotState122, snapshotState112, snapshotFloatState2, (Offset) obj);
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                                                                        Function1 function1172 = (Function1) objRememberedValue15;
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(advancedChartGroupState8);
                                                                        objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                                                                        if (!zChangedInstance2) {
                                                                            objRememberedValue16 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda45
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    return SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$69$lambda$68(advancedChartGroupState8, snapshotState6, snapshotState5);
                                                                                }
                                                                            };
                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            Modifier modifierScrubDetection2 = Interactions2.scrubDetection(modifierPointerInput2, function1172, (Function0) objRememberedValue16);
                                                                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                                                                            composerStartRestartGroup.startReplaceGroup(212064437);
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                                            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue17 == companion2.getEmpty()) {
                                                                            }
                                                                            measurer2 = (Measurer2) objRememberedValue17;
                                                                            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue18 == companion2.getEmpty()) {
                                                                            }
                                                                            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue18;
                                                                            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue19 == companion2.getEmpty()) {
                                                                            }
                                                                            snapshotState7 = (SnapshotState) objRememberedValue19;
                                                                            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue20 == companion2.getEmpty()) {
                                                                            }
                                                                            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue20;
                                                                            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue21 == companion2.getEmpty()) {
                                                                            }
                                                                            snapshotState8 = (SnapshotState) objRememberedValue21;
                                                                            boolean zChangedInstance42 = composerStartRestartGroup.changedInstance(measurer2);
                                                                            i11 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                                                            zChanged7 = zChangedInstance42 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                                                            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChanged7) {
                                                                                objRememberedValue22 = new MeasurePolicy() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$2
                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    /* renamed from: measure-3p2s80s */
                                                                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                                                                        final Map linkedHashMap = new LinkedHashMap();
                                                                                        snapshotState8.getValue();
                                                                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i11);
                                                                                        snapshotState7.getValue();
                                                                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                                                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                                                                        final Measurer2 measurer22 = measurer2;
                                                                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$2.1
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
                                                                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                                                                            }
                                                                                        }, 4, null);
                                                                                    }
                                                                                };
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                                                                                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue22;
                                                                                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                                                                                if (objRememberedValue23 == companion2.getEmpty()) {
                                                                                }
                                                                                final Function0 function062 = (Function0) objRememberedValue23;
                                                                                zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                                                                                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                                                                                if (!zChangedInstance3) {
                                                                                    objRememberedValue24 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$4
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
                                                                                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                                                                        }
                                                                                    };
                                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                                                                                    final AdvancedChartGroupState advancedChartGroupState122 = advancedChartGroupState8;
                                                                                    final ChartGroup chartGroup22 = first;
                                                                                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScrubDetection2, false, (Function1) objRememberedValue24, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$$inlined$ConstraintLayout$5
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                                                            invoke(composer3, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer3, int i19) {
                                                                                            Composer composer4 = composer3;
                                                                                            if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                                                                composer4.skipToGroupEnd();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(1200550679, i19, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                                                                            }
                                                                                            snapshotState8.setValue(Unit.INSTANCE);
                                                                                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                                                                            constraintLayoutScope2.reset();
                                                                                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                                                                            composer4.startReplaceGroup(-200601766);
                                                                                            ArrayList arrayList22 = new ArrayList(i162);
                                                                                            for (int i20 = 0; i20 < i162; i20++) {
                                                                                                arrayList22.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList3 = new ArrayList(i162);
                                                                                            for (int i21 = 0; i21 < i162; i21++) {
                                                                                                arrayList3.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList4 = new ArrayList(i162);
                                                                                            for (int i22 = 0; i22 < i162; i22++) {
                                                                                                arrayList4.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList5 = new ArrayList(i162);
                                                                                            for (int i23 = 0; i23 < i162; i23++) {
                                                                                                arrayList5.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                                                                            ArrayList arrayList6 = new ArrayList(i162);
                                                                                            for (int i24 = 0; i24 < i162; i24++) {
                                                                                                arrayList6.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList7 = new ArrayList(i162);
                                                                                            for (int i25 = 0; i25 < i162; i25++) {
                                                                                                arrayList7.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope22.createRef();
                                                                                            ArrayList arrayList8 = new ArrayList(i162);
                                                                                            for (int i26 = 0; i26 < i162; i26++) {
                                                                                                arrayList8.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList4.toArray(new ConstraintLayoutBaseScope4[0]);
                                                                                            ArrayList arrayList9 = arrayList3;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                                                                            float fMo5013toDpu2uoSUM = ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(advancedChartGroupState122.getTopIndicatorPadding());
                                                                                            List charts22 = chartGroup22.getCharts();
                                                                                            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts22, 10));
                                                                                            Iterator it3 = charts22.iterator();
                                                                                            while (it3.hasNext()) {
                                                                                                Float weight = ((Chart) it3.next()).getWeight();
                                                                                                arrayList10.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
                                                                                            }
                                                                                            List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope22, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList10, advancedChartGroupState122.getUseWeightsAsHeight());
                                                                                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
                                                                                            int i27 = i162;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8137createEndBarrier3ABfNKs$default;
                                                                                            Axis axis4 = axis32;
                                                                                            AxisConfig axisConfig = advancedChartGroupState122.getAxisConfig();
                                                                                            composer4.startReplaceGroup(5004770);
                                                                                            Object objRememberedValue33 = composer4.rememberedValue();
                                                                                            if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                                                                                objRememberedValue33 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$1$1(snapshotIntState22);
                                                                                                composer4.updateRememberedValue(objRememberedValue33);
                                                                                            }
                                                                                            composer4.endReplaceGroup();
                                                                                            ArrayList arrayList11 = arrayList8;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2 = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                                                                            SduiAdvancedChartKt.ChartGroupXAxis(constraintLayoutScope22, i27, axis4, constraintLayoutBaseScope4Component1, arrayList22, axisConfig, verticalAnchor2, verticalAnchor, (Function1) objRememberedValue33, composer4, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 6));
                                                                                            ArrayList arrayList12 = arrayList22;
                                                                                            composer4.startReplaceGroup(1933257821);
                                                                                            int i28 = 0;
                                                                                            for (Object obj : chartGroupTransform2.getCharts()) {
                                                                                                int i29 = i28 + 1;
                                                                                                if (i28 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                Chart chart = (Chart) obj;
                                                                                                float fM7995constructorimpl2 = i28 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
                                                                                                Axis axis5 = (Axis) arrayList2.get(i28);
                                                                                                YAxisLocation yAxisLocation = advancedChartGroupState122.getAxisConfig().getYAxisLocation();
                                                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                                                composer4.startReplaceGroup(-1633490746);
                                                                                                boolean zChanged10 = composer4.changed(snapshotStateMap2) | composer4.changed(i28);
                                                                                                Object objRememberedValue34 = composer4.rememberedValue();
                                                                                                if (zChanged10 || objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                                                                                    objRememberedValue34 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$1$1(snapshotStateMap2, i28);
                                                                                                    composer4.updateRememberedValue(objRememberedValue34);
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue34);
                                                                                                int i30 = ConstraintLayoutScope.$stable;
                                                                                                ArrayList arrayList13 = arrayList12;
                                                                                                ArrayList arrayList14 = arrayList4;
                                                                                                int i31 = i28;
                                                                                                SduiAdvancedChartKt.ChartYAxis(constraintLayoutScope22, axis5, arrayList14, arrayList13, i31, yAxisLocation, verticalAnchor2, verticalAnchor, modifierOnGloballyPositioned, composer4, i30 | (Axis.$stable << 3), 0);
                                                                                                arrayList12 = arrayList13;
                                                                                                List<SegmentedLine> listMapSduiSegmentedLines = SduiChartMappersKt.mapSduiSegmentedLines(chart.getLines(), composer4, 0);
                                                                                                ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(chart.getFills(), composer4, 0);
                                                                                                boolean useWeightsAsHeight = advancedChartGroupState122.getUseWeightsAsHeight();
                                                                                                ScrubState scrubStateSduiAdvancedChartGroup$lambda$4922 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                                                                                YAxisLocation yAxisLocation2 = advancedChartGroupState122.getAxisConfig().getYAxisLocation();
                                                                                                composer4.startReplaceGroup(-1633490746);
                                                                                                boolean zChanged11 = composer4.changed(snapshotStateMap3) | composer4.changed(i31);
                                                                                                Object objRememberedValue35 = composer4.rememberedValue();
                                                                                                if (zChanged11 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                                                                                    objRememberedValue35 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$2$2$1(snapshotStateMap3, i31);
                                                                                                    composer4.updateRememberedValue(objRememberedValue35);
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                                int i32 = helpersHashCode;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3 = verticalAnchor2;
                                                                                                List list = listM18594getHorizontalGuidelinesrAjV9yQ;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor;
                                                                                                ArrayList arrayList15 = arrayList11;
                                                                                                SduiAdvancedChartKt.m18575ChartkiIZU34(constraintLayoutScope22, chart, arrayList12, arrayList15, list, useWeightsAsHeight, fM7995constructorimpl2, i31, listMapSduiSegmentedLines, immutableListMapSduiFills, scrubStateSduiAdvancedChartGroup$lambda$4922, yAxisLocation2, verticalAnchor3, verticalAnchor4, null, (Function1) objRememberedValue35, composer3, i30, Point.$stable | 24576);
                                                                                                arrayList11 = arrayList15;
                                                                                                verticalAnchor2 = verticalAnchor3;
                                                                                                verticalAnchor = verticalAnchor4;
                                                                                                SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope22, arrayList11, arrayList12, i31, advancedChartGroupState122.getChartBottomDividerType(), advancedChartGroupState122.getAxisConfig().getYAxisLocation(), verticalAnchor2, verticalAnchor, composer3, i30);
                                                                                                composer4 = composer3;
                                                                                                listM18594getHorizontalGuidelinesrAjV9yQ = list;
                                                                                                i28 = i29;
                                                                                                arrayList4 = arrayList14;
                                                                                                helpersHashCode = i32;
                                                                                                arrayList9 = arrayList9;
                                                                                            }
                                                                                            int i33 = helpersHashCode;
                                                                                            List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
                                                                                            ArrayList arrayList16 = arrayList9;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor2;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor;
                                                                                            composer3.endReplaceGroup();
                                                                                            boolean xAxisBottomDividers = advancedChartGroupState122.getAxisConfig().getXAxisBottomDividers();
                                                                                            int i34 = ConstraintLayoutScope.$stable;
                                                                                            SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope22, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer3, i34);
                                                                                            Composer composer5 = composer3;
                                                                                            ScrubState scrubStateSduiAdvancedChartGroup$lambda$493 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                                                                            Float snapX = scrubStateSduiAdvancedChartGroup$lambda$493 != null ? scrubStateSduiAdvancedChartGroup$lambda$493.getSnapX() : null;
                                                                                            composer5.startReplaceGroup(-1746271574);
                                                                                            boolean zChanged12 = composer5.changed(snapshotState42) | composer5.changedInstance(advancedChartGroupState122) | composer5.changedInstance(hapticFeedback);
                                                                                            Object objRememberedValue36 = composer5.rememberedValue();
                                                                                            if (zChanged12 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                                                                                objRememberedValue36 = new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1(advancedChartGroupState122, hapticFeedback, snapshotState42, null);
                                                                                                composer5.updateRememberedValue(objRememberedValue36);
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            int i35 = 0;
                                                                                            EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue36, composer5, 0);
                                                                                            ScrubState scrubStateSduiAdvancedChartGroup$lambda$494 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                                                                            composer5.startReplaceGroup(1933337281);
                                                                                            if (scrubStateSduiAdvancedChartGroup$lambda$494 != null) {
                                                                                                SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope22, advancedChartGroupState122.getScrubConfig(), scrubStateSduiAdvancedChartGroup$lambda$494.m2457x73acf0ad(), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$36(snapshotState452), scrubStateSduiAdvancedChartGroup$lambda$494.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) snapshotState4AnimateFloatAsState22.getValue()).floatValue(), composer5, i34);
                                                                                                composer5 = composer5;
                                                                                                Unit unit22 = Unit.INSTANCE;
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1933353366);
                                                                                            int i36 = 0;
                                                                                            for (Object obj2 : chartGroupTransform2.getCharts()) {
                                                                                                int i37 = i36 + 1;
                                                                                                if (i36 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                Chart chart2 = (Chart) obj2;
                                                                                                float fM7995constructorimpl3 = i36 == 0 ? C2002Dp.m7995constructorimpl(i35) : fM7995constructorimpl;
                                                                                                ArrayList arrayList17 = arrayList16;
                                                                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList17.get(i36);
                                                                                                ScrubState scrubStateSduiAdvancedChartGroup$lambda$495 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42);
                                                                                                YAxisLocation yAxisLocation3 = advancedChartGroupState122.getAxisConfig().getYAxisLocation();
                                                                                                int i38 = ConstraintLayoutScope.$stable;
                                                                                                int i39 = Point.$stable;
                                                                                                arrayList16 = arrayList17;
                                                                                                int i40 = i36;
                                                                                                float f = fM7995constructorimpl3;
                                                                                                List list3 = list2;
                                                                                                int i41 = i35;
                                                                                                Composer composer6 = composer5;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchor5;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor8 = verticalAnchor6;
                                                                                                SduiAdvancedChartKt.m18582ScrubDot_WMjBM(constraintLayoutScope22, chart2, i40, f, list3, constraintLayoutBaseScope4, scrubStateSduiAdvancedChartGroup$lambda$495, yAxisLocation3, verticalAnchor7, verticalAnchor8, composer6, i38 | (i39 << 18));
                                                                                                int i42 = i40;
                                                                                                List list4 = list3;
                                                                                                Composer composer7 = composer6;
                                                                                                composer7.startReplaceGroup(1933375086);
                                                                                                if (advancedChartGroupState122.getScrubConfig().getYLabelEnabled()) {
                                                                                                    SduiAdvancedChartKt.m18577ChartYAxisScrubLabelskrPljE(constraintLayoutScope22, (Axis) arrayList2.get(i42), arrayList5, list4, f, i42, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$54(snapshotState442), advancedChartGroupState122.getAxisConfig().getYAxisLocation(), verticalAnchor7, verticalAnchor8, composer7, (i39 << 18) | i38 | (Axis.$stable << 3), 0);
                                                                                                    list4 = list4;
                                                                                                    i42 = i42;
                                                                                                    verticalAnchor5 = verticalAnchor7;
                                                                                                    verticalAnchor6 = verticalAnchor8;
                                                                                                    composer7 = composer7;
                                                                                                } else {
                                                                                                    verticalAnchor5 = verticalAnchor7;
                                                                                                    verticalAnchor6 = verticalAnchor8;
                                                                                                }
                                                                                                composer7.endReplaceGroup();
                                                                                                composer7.startReplaceGroup(1933399731);
                                                                                                if (advancedChartGroupState122.getScrubConfig().getLegendsEnabled()) {
                                                                                                    SduiAdvancedChartKt.ChartLegends(constraintLayoutScope22, ChartLegend.toLegendLists(chart2.getLegend_data()), list4, i42, arrayList6, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), composer7, i38 | (i39 << 15));
                                                                                                }
                                                                                                composer3.endReplaceGroup();
                                                                                                SduiAdvancedChartKt.ChartTitle(constraintLayoutScope22, arrayList7, list4, i42, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), chart2.getTitle(), composer3, i38 | (i39 << 12));
                                                                                                list2 = list4;
                                                                                                composer5 = composer3;
                                                                                                i36 = i37;
                                                                                                i35 = i41;
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1933420228);
                                                                                            if (advancedChartGroupState122.getScrubConfig().getXLabelEnabled()) {
                                                                                                SduiAdvancedChartKt.ChartGroupXAxisScrubLabel(constraintLayoutScope22, axis32, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), advancedChartGroupState122.getAxisConfig().getYAxisLocation(), verticalAnchor5, verticalAnchor6, null, composer5, ConstraintLayoutScope.$stable | 100663296 | (Axis.$stable << 3) | (Point.$stable << 12));
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1933438664);
                                                                                            if (advancedChartGroupState122.getScrubConfig().getLegendsEnabled()) {
                                                                                                SduiAdvancedChartKt.ChartGroupLegends(constraintLayoutScope22, ChartLegend.toLegendLists(chartGroupTransform2.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(snapshotState42), ((Number) snapshotState4AnimateFloatAsState22.getValue()).floatValue(), composer5, ConstraintLayoutScope.$stable | (Point.$stable << 9));
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.endReplaceGroup();
                                                                                            if (constraintLayoutScope2.getHelpersHashCode() != i33) {
                                                                                                EffectsKt.SideEffect(function062, composer5, 6);
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                            }
                                                                                        }
                                                                                    }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                    }
                                                                                    function112 = function1152;
                                                                                    composer2 = composerStartRestartGroup;
                                                                                    advancedChartGroupState9 = advancedChartGroupState8;
                                                                                    function113 = function110;
                                                                                    tuples24 = tuples23;
                                                                                    function04 = function03;
                                                                                    function114 = function15;
                                                                                    modifier3 = modifier2;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final Function1 function1182 = function16;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            tuples22 = tuples2;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function15 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final Function1 function11822 = function16;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        tuples22 = tuples2;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function15 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final Function1 function118222 = function16;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect SduiAdvancedChartGroup$lambda$35$lambda$34(SnapshotStateMap snapshotStateMap, SnapshotIntState2 snapshotIntState2) {
        Collection collectionValues = snapshotStateMap.values();
        if (collectionValues.isEmpty()) {
            return null;
        }
        Collection collection = collectionValues;
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float left = ((Rect) it.next()).getLeft();
        while (it.hasNext()) {
            left = Math.min(left, ((Rect) it.next()).getLeft());
        }
        Iterator it2 = collection.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float top = ((Rect) it2.next()).getTop();
        while (it2.hasNext()) {
            top = Math.min(top, ((Rect) it2.next()).getTop());
        }
        Iterator it3 = collection.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float right = ((Rect) it3.next()).getRight();
        while (it3.hasNext()) {
            right = Math.max(right, ((Rect) it3.next()).getRight());
        }
        Iterator it4 = collection.iterator();
        if (it4.hasNext()) {
            float bottom = ((Rect) it4.next()).getBottom();
            while (it4.hasNext()) {
                bottom = Math.max(bottom, ((Rect) it4.next()).getBottom());
            }
            return new Rect(left, top, right, bottom + (snapshotIntState2.getIntValue() / 2));
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ScrubState SduiAdvancedChartGroup$lambda$48$lambda$47(SnapshotState snapshotState, int i, Axis axis, AdvancedChartGroupState advancedChartGroupState, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2) {
        Integer next;
        float fFloatValue;
        float fFloatValue2;
        float x;
        float right;
        List<AxisScrubLabel> scrubLabels;
        Offset offsetSduiAdvancedChartGroup$lambda$24 = SduiAdvancedChartGroup$lambda$24(snapshotState);
        Float fValueOf = null;
        if (offsetSduiAdvancedChartGroup$lambda$24 != null) {
            long packedValue = offsetSduiAdvancedChartGroup$lambda$24.getPackedValue();
            Iterator<Integer> it = RangesKt.until(0, i).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Rect rect = (Rect) snapshotStateMap.get(Integer.valueOf(next.intValue()));
                    Float fM18592distanceToEdgeUv8p0NA = rect != null ? m18592distanceToEdgeUv8p0NA(rect, packedValue) : null;
                    if (rect != null) {
                        if (rect.m6555containsk4lQ0M(packedValue)) {
                            fFloatValue = -1.0f;
                        } else if (fM18592distanceToEdgeUv8p0NA != null) {
                            fFloatValue = fM18592distanceToEdgeUv8p0NA.floatValue();
                        } else {
                            List<Offset> listCornerOffsets = cornerOffsets(rect);
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listCornerOffsets, 10));
                            Iterator<T> it2 = listCornerOffsets.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Float.valueOf(Offset.m6542getDistanceSquaredimpl(Offset.m6546minusMKHz9U(packedValue, ((Offset) it2.next()).getPackedValue()))));
                            }
                            Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList);
                            fFloatValue = fMinOrNull != null ? fMinOrNull.floatValue() : Float.POSITIVE_INFINITY;
                        }
                        do {
                            Integer next2 = it.next();
                            Rect rect2 = (Rect) snapshotStateMap.get(Integer.valueOf(next2.intValue()));
                            Float fM18592distanceToEdgeUv8p0NA2 = rect2 != null ? m18592distanceToEdgeUv8p0NA(rect2, packedValue) : null;
                            if (rect2 != null) {
                                if (rect2.m6555containsk4lQ0M(packedValue)) {
                                    fFloatValue2 = -1.0f;
                                } else if (fM18592distanceToEdgeUv8p0NA2 != null) {
                                    fFloatValue2 = fM18592distanceToEdgeUv8p0NA2.floatValue();
                                } else {
                                    List<Offset> listCornerOffsets2 = cornerOffsets(rect2);
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listCornerOffsets2, 10));
                                    Iterator<T> it3 = listCornerOffsets2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(Float.valueOf(Offset.m6542getDistanceSquaredimpl(Offset.m6546minusMKHz9U(packedValue, ((Offset) it3.next()).getPackedValue()))));
                                    }
                                    Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList2);
                                    fFloatValue2 = fMinOrNull2 != null ? fMinOrNull2.floatValue() : Float.POSITIVE_INFINITY;
                                }
                                if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                    next = next2;
                                    fFloatValue = fFloatValue2;
                                }
                            }
                        } while (it.hasNext());
                    }
                }
            } else {
                next = null;
            }
            Integer num = next;
            Rect rect3 = num != null ? (Rect) snapshotStateMap.get(Integer.valueOf(num.intValue())) : null;
            if (num != null && rect3 != null) {
                long jM18591coerceInRect3MmeM6k = m18591coerceInRect3MmeM6k(Offset.m6546minusMKHz9U(packedValue, rect3.m6560getTopLeftF1C5BW0()), rect3);
                Point pointCoerceInsideWindow = coerceInsideWindow(RectExtensions.m11982getNormalizedPointUv8p0NA(rect3, jM18591coerceInRect3MmeM6k));
                if (axis == null || (scrubLabels = axis.getScrubLabels()) == null) {
                    x = pointCoerceInsideWindow.getX();
                } else {
                    AxisScrubLabel axisScrubLabel = (AxisScrubLabel) UtilKt.getClosestItemByValue(scrubLabels, pointCoerceInsideWindow.getX(), new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.m2461xbd9369e7((AxisScrubLabel) obj));
                        }
                    });
                    Float fValueOf2 = axisScrubLabel != null ? Float.valueOf(axisScrubLabel.getValue()) : null;
                    if (fValueOf2 != null) {
                        x = fValueOf2.floatValue();
                    }
                }
                Point point = new Point(x, pointCoerceInsideWindow.getY());
                long jM6547plusMKHz9U = Offset.m6547plusMKHz9U(rect3.m6560getTopLeftF1C5BW0(), jM18591coerceInRect3MmeM6k);
                ImmutableList<Float> xAxisSnapPoints = advancedChartGroupState.getScrubConfig().getXAxisSnapPoints();
                Float f = xAxisSnapPoints != null ? (Float) UtilKt.getClosestItemByValue(xAxisSnapPoints, x, new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(SduiAdvancedChartKt.m2462xe75ccf6b(((Float) obj).floatValue()));
                    }
                }) : null;
                if (f != null) {
                    float fFloatValue3 = f.floatValue();
                    if (advancedChartGroupState.getAxisConfig().getYAxisLocation() == YAxisLocation.START) {
                        float right2 = fFloatValue3 * (rect3.getRight() - rect3.getLeft());
                        Iterator it4 = snapshotStateMap2.entrySet().iterator();
                        if (it4.hasNext()) {
                            Rect rect4 = (Rect) ((Map.Entry) it4.next()).getValue();
                            float right3 = rect4.getRight() - rect4.getLeft();
                            while (it4.hasNext()) {
                                Rect rect5 = (Rect) ((Map.Entry) it4.next()).getValue();
                                right3 = Math.max(right3, rect5.getRight() - rect5.getLeft());
                            }
                            fValueOf = Float.valueOf(right3);
                        }
                        right = right2 + (fValueOf != null ? fValueOf.floatValue() : 0.0f);
                    } else {
                        right = fFloatValue3 * (rect3.getRight() - rect3.getLeft());
                    }
                    fValueOf = Float.valueOf(right);
                }
                return new ScrubState(num.intValue(), Float.intBitsToFloat((int) (rect3.m6560getTopLeftF1C5BW0() >> 32)), jM6547plusMKHz9U, point, f, fValueOf != null ? fValueOf.floatValue() : Float.intBitsToFloat((int) (jM6547plusMKHz9U >> 32)), null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SduiAdvancedChartGroup$lambda$48$lambda$47$lambda$46$lambda$41$lambda$40 */
    public static final float m2461xbd9369e7(AxisScrubLabel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float SduiAdvancedChartGroup$lambda$53$lambda$52(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        Rect rectSduiAdvancedChartGroup$lambda$36 = SduiAdvancedChartGroup$lambda$36(snapshotState4);
        Float fValueOf = rectSduiAdvancedChartGroup$lambda$36 != null ? Float.valueOf(rectSduiAdvancedChartGroup$lambda$36.getRight() - rectSduiAdvancedChartGroup$lambda$36.getLeft()) : null;
        ScrubState scrubStateSduiAdvancedChartGroup$lambda$49 = SduiAdvancedChartGroup$lambda$49(snapshotState42);
        Float fValueOf2 = scrubStateSduiAdvancedChartGroup$lambda$49 != null ? Float.valueOf(Float.intBitsToFloat((int) (scrubStateSduiAdvancedChartGroup$lambda$49.m2457x73acf0ad() >> 32))) : null;
        if (fValueOf == null || fValueOf2 == null) {
            return null;
        }
        return Float.valueOf(fValueOf.floatValue() - fValueOf2.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$59$lambda$58(SnapshotState snapshotState, float f) {
        if (f == 0.0f) {
            snapshotState.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$64$lambda$62$lambda$61(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
        long jTransformOrigin;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(1 + Math.abs(SduiAdvancedChartGroup$lambda$16(snapshotState4)));
        if (SduiAdvancedChartGroup$lambda$16(snapshotState4) < 0.0f) {
            jTransformOrigin = TransformOrigin2.TransformOrigin(1.0f, 0.0f);
        } else {
            jTransformOrigin = TransformOrigin2.TransformOrigin(0.0f, 0.0f);
        }
        graphicsLayer.mo6764setTransformOrigin__ExYCQ(jTransformOrigin);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$67$lambda$66(HapticFeedback hapticFeedback, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, Offset offset) {
        snapshotState.setValue(AdvancedChartGroupState2.SCRUBBING);
        if (SduiAdvancedChartGroup$lambda$24(snapshotState2) == null) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            snapshotFloatState2.setFloatValue(1.0f);
            function1.invoke(Boolean.TRUE);
        }
        snapshotState2.setValue(offset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAdvancedChartGroup$lambda$69$lambda$68(AdvancedChartGroupState advancedChartGroupState, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(AdvancedChartGroupState2.IDLE);
        if (advancedChartGroupState.getScrubConfig().getClearOnScrubStop()) {
            snapshotState2.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$89$lambda$88(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$91$lambda$90(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$93$lambda$92(ScrubState scrubState) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$95$lambda$94(Ranges3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:369:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void ProtoSduiAdvancedChartGroup(final UIComponentDto.ConcreteDto.ChartGroup component, Modifier modifier, Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples2, ProtoAdvancedChartGroupState advancedChartGroupState6, Function1<? super Float, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super ScrubState, Unit> function13, Function1<? super Ranges3<Float>, Unit> function14, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples22;
        ProtoAdvancedChartGroupState advancedChartGroupState62;
        int i5;
        Function1<? super Float, Unit> function15;
        int i6;
        final Function1<? super Boolean, Unit> function16;
        int i7;
        Function1<? super ScrubState, Unit> function17;
        int i8;
        int i9;
        ProtoAdvancedChartGroupState advancedChartGroupState63;
        Function1<? super Ranges3<Float>, Unit> function18;
        Function0<Unit> function02;
        ProtoAdvancedChartGroupState advancedChartGroupState64;
        ChartGroupDto value;
        boolean zChanged;
        Object objRememberedValue;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        float f;
        Function1<? super Ranges3<Float>, Unit> function19;
        final ProtoAxis protoAxis;
        Iterator it;
        Iterator it2;
        final int size;
        Object objRememberedValue4;
        Composer.Companion companion2;
        final ArrayList arrayList;
        final SnapshotState snapshotState2;
        boolean zChanged2;
        Object objRememberedValue5;
        final SnapshotStateMap snapshotStateMap;
        boolean zChanged3;
        Object objRememberedValue6;
        final SnapshotStateMap snapshotStateMap2;
        boolean zChanged4;
        Object objRememberedValue7;
        Object objRememberedValue8;
        Object objRememberedValue9;
        SnapshotState4 snapshotState4;
        boolean zChanged5;
        final SnapshotState snapshotState3;
        int i10;
        ProtoAxis protoAxis2;
        final ProtoAdvancedChartGroupState advancedChartGroupState65;
        final SnapshotStateMap snapshotStateMap3;
        Object objDerivedStateOf;
        final SnapshotState4 snapshotState42;
        boolean zChanged6;
        Object objRememberedValue10;
        boolean zChanged7;
        Object objRememberedValue11;
        final SnapshotState4 snapshotState43;
        Object objRememberedValue12;
        final HapticFeedback hapticFeedback;
        Object objRememberedValue13;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue14;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SnapshotState snapshotState5;
        Function1<? super Ranges3<Float>, Unit> function110;
        final SnapshotState snapshotState6;
        Function0<Unit> function03;
        boolean z;
        Object objRememberedValue15;
        boolean zChangedInstance;
        Object objRememberedValue16;
        boolean zChangedInstance2;
        Object objRememberedValue17;
        Object objRememberedValue18;
        final Measurer2 measurer2;
        Object objRememberedValue19;
        Object objRememberedValue20;
        final SnapshotState snapshotState7;
        Object objRememberedValue21;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue22;
        final SnapshotState snapshotState8;
        final int i11;
        boolean zChanged8;
        Object objRememberedValue23;
        Object objRememberedValue24;
        boolean zChangedInstance3;
        Object objRememberedValue25;
        final Function0<Unit> function04;
        final ProtoAdvancedChartGroupState advancedChartGroupState66;
        final Function1<? super Ranges3<Float>, Unit> function111;
        Composer composer2;
        final Function1<? super ScrubState, Unit> function112;
        final Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples23;
        AdvancedChartZoomKeys second;
        Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples24;
        ProtoAxis protoAxisMapSduiAxis;
        int i12;
        ProtoAxis protoAxisMapSduiAxis2;
        ChartGroupDto first;
        AdvancedChartZoomKeys second2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-584321555);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
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
                    tuples22 = tuples2;
                    i3 |= composerStartRestartGroup.changedInstance(tuples22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        advancedChartGroupState62 = advancedChartGroupState6;
                        int i14 = composerStartRestartGroup.changedInstance(advancedChartGroupState62) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        advancedChartGroupState62 = advancedChartGroupState6;
                    }
                    i3 |= i14;
                } else {
                    advancedChartGroupState62 = advancedChartGroupState6;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function15 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        function16 = function12;
                    } else {
                        function16 = function12;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function17 = function13;
                    } else {
                        function17 = function13;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function17) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                tuples22 = null;
                            }
                            if ((i2 & 8) == 0) {
                                advancedChartGroupState63 = new ProtoAdvancedChartGroupState(null, null, null, 0, false, null, 63, null);
                                i3 &= -7169;
                            } else {
                                advancedChartGroupState63 = advancedChartGroupState62;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue26 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda26
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$89$lambda$88(((Float) obj).floatValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue26;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue27 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda30
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$91$lambda$90(((Boolean) obj).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function16 = (Function1) objRememberedValue27;
                            }
                            if (i7 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue28 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda31
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$93$lambda$92((ScrubState) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function17 = (Function1) objRememberedValue28;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue29 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda32
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$95$lambda$94((Ranges3) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                                }
                                function18 = (Function1) objRememberedValue29;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function18 = function14;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue30 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda33
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue30);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue30;
                            } else {
                                function02 = function0;
                            }
                            advancedChartGroupState64 = advancedChartGroupState63;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            function18 = function14;
                            function02 = function0;
                            advancedChartGroupState64 = advancedChartGroupState62;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-584321555, i3, -1, "com.robinhood.android.sdui.chartgroup.ProtoSduiAdvancedChartGroup (SduiAdvancedChart.kt:572)");
                        }
                        value = component.getValue();
                        Object xZoomRangeResetKey = (tuples22 != null || (second2 = tuples22.getSecond()) == null) ? null : second2.getXZoomRangeResetKey();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(xZoomRangeResetKey);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            function18.invoke(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE());
                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                            objRememberedValue = snapshotStateMutableStateOf$default;
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(snapshotFloatState22.getFloatValue(), null, 0.0f, "adv-chart-edge-bounce", null, composerStartRestartGroup, 3072, 22);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            f = 0.0f;
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(AdvancedChartGroupState2.IDLE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            f = 0.0f;
                        }
                        SnapshotState snapshotState9 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        if (tuples22 != null && (first = tuples22.getFirst()) != null) {
                            value = first;
                        }
                        function19 = function18;
                        final ChartGroupDto chartGroupDtoTransform = SduiChartZoomTransformer.transform(value, ProtoSduiAdvancedChartGroup$lambda$184$lambda$99(snapshotState), advancedChartGroupState64.getAxisConfig().getXAxisZoomable(), advancedChartGroupState64.getAxisConfig().getSortedChartGroupZoomXAxes(), advancedChartGroupState64.getAxisConfig().getPointsForYAxisZoomRangeCalculation());
                        ChartAxisDto x_axis = chartGroupDtoTransform.getX_axis();
                        composerStartRestartGroup.startReplaceGroup(1107774320);
                        ProtoAxis protoAxisMapSduiAxis3 = x_axis != null ? null : SduiChartMappersKt.mapSduiAxis(x_axis, AxisType.f3953X, composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1107777307);
                        List<ChartDto> charts = chartGroupDtoTransform.getCharts();
                        protoAxis = protoAxisMapSduiAxis3;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
                        it = charts.iterator();
                        while (it.hasNext()) {
                            ChartAxisDto y_axis = ((ChartDto) it.next()).getY_axis();
                            Iterator it3 = it;
                            composerStartRestartGroup.startReplaceGroup(1107778448);
                            if (y_axis == null) {
                                i12 = i3;
                                protoAxisMapSduiAxis2 = null;
                            } else {
                                i12 = i3;
                                protoAxisMapSduiAxis2 = SduiChartMappersKt.mapSduiAxis(y_axis, AxisType.f3954Y, composerStartRestartGroup, 48);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            arrayList2.add(protoAxisMapSduiAxis2);
                            it = it3;
                            i3 = i12;
                        }
                        int i15 = i3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1107781708);
                        List<ChartDto> charts2 = chartGroupDtoTransform.getCharts();
                        final ArrayList arrayList3 = new ArrayList();
                        it2 = charts2.iterator();
                        while (it2.hasNext()) {
                            ChartAxisDto y_axis_secondary = ((ChartDto) it2.next()).getY_axis_secondary();
                            Iterator it4 = it2;
                            composerStartRestartGroup.startReplaceGroup(1107783376);
                            if (y_axis_secondary == null) {
                                tuples24 = tuples22;
                                protoAxisMapSduiAxis = null;
                            } else {
                                tuples24 = tuples22;
                                protoAxisMapSduiAxis = SduiChartMappersKt.mapSduiAxis(y_axis_secondary, AxisType.f3954Y, composerStartRestartGroup, 48);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (protoAxisMapSduiAxis != null) {
                                arrayList3.add(protoAxisMapSduiAxis);
                            }
                            it2 = it4;
                            tuples22 = tuples24;
                        }
                        Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples25 = tuples22;
                        composerStartRestartGroup.endReplaceGroup();
                        size = value.getCharts().size();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue4 != companion2.getEmpty()) {
                            arrayList = arrayList2;
                            SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default2);
                            objRememberedValue4 = snapshotStateMutableStateOf$default2;
                        } else {
                            arrayList = arrayList2;
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(chartGroupDtoTransform);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.mutableStateMapOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        snapshotStateMap = (SnapshotStateMap) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged3 = composerStartRestartGroup.changed(chartGroupDtoTransform);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = SnapshotStateKt.mutableStateMapOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        snapshotStateMap2 = (SnapshotStateMap) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged4 = composerStartRestartGroup.changed(chartGroupDtoTransform);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4 || objRememberedValue7 == companion2.getEmpty()) {
                            objRememberedValue7 = SnapshotStateKt.mutableStateMapOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        final SnapshotStateMap snapshotStateMap4 = (SnapshotStateMap) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue8;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda34
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$127$lambda$126(snapshotStateMap, snapshotIntState2);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        snapshotState4 = (SnapshotState4) objRememberedValue9;
                        composerStartRestartGroup.endReplaceGroup();
                        Offset offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$114 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(snapshotState2);
                        ScrubConfig scrubConfig = advancedChartGroupState64.getScrubConfig();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged5 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$114) | composerStartRestartGroup.changed(scrubConfig) | composerStartRestartGroup.changed(snapshotStateMap);
                        Object objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged5 || objRememberedValue31 == companion2.getEmpty()) {
                            final ProtoAdvancedChartGroupState advancedChartGroupState67 = advancedChartGroupState64;
                            Function0 function05 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda35
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$140$lambda$139(snapshotState2, size, protoAxis, advancedChartGroupState67, snapshotStateMap, snapshotStateMap2);
                                }
                            };
                            snapshotState3 = snapshotState2;
                            i10 = size;
                            protoAxis2 = protoAxis;
                            advancedChartGroupState65 = advancedChartGroupState67;
                            snapshotStateMap3 = snapshotStateMap;
                            objDerivedStateOf = SnapshotStateKt.derivedStateOf(function05);
                            composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                        } else {
                            i10 = size;
                            snapshotStateMap3 = snapshotStateMap;
                            objDerivedStateOf = objRememberedValue31;
                            advancedChartGroupState65 = advancedChartGroupState64;
                            snapshotState3 = snapshotState2;
                            protoAxis2 = protoAxis;
                        }
                        snapshotState42 = (SnapshotState4) objDerivedStateOf;
                        composerStartRestartGroup.endReplaceGroup();
                        final int i16 = i10;
                        ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                        final ProtoAxis protoAxis3 = protoAxis2;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged6 = ((i15 & 3670016) != 1048576) | composerStartRestartGroup.changed(snapshotState42);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged6 || objRememberedValue10 == companion2.getEmpty()) {
                            objRememberedValue10 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$1$1(function17, snapshotState42, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, Point.$stable);
                        Object xZoomRangeValidationKey = (tuples25 != null || (second = tuples25.getSecond()) == null) ? null : second.getXZoomRangeValidationKey();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i17 = i15 & 29360128;
                        zChanged7 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState65) | (i17 != 8388608);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        Function1<? super ScrubState, Unit> function113 = function17;
                        if (!zChanged7 || objRememberedValue11 == companion2.getEmpty()) {
                            objRememberedValue11 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1(advancedChartGroupState65, function19, snapshotState4, snapshotState, null);
                            snapshotState43 = snapshotState4;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        } else {
                            snapshotState43 = snapshotState4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(xZoomRangeValidationKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == companion2.getEmpty()) {
                            objRememberedValue12 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda36
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$145$lambda$144(snapshotState43, snapshotState42);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        final SnapshotState4 snapshotState44 = (SnapshotState4) objRememberedValue12;
                        composerStartRestartGroup.endReplaceGroup();
                        hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == companion2.getEmpty()) {
                            objRememberedValue13 = SnapshotFloatState3.mutableFloatStateOf(f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue13;
                        composerStartRestartGroup.endReplaceGroup();
                        float floatValue = snapshotFloatState2.getFloatValue();
                        final SnapshotState4 snapshotState45 = snapshotState43;
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue14 == companion2.getEmpty()) {
                            objRememberedValue14 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda37
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$151$lambda$150(snapshotState3, ((Float) obj).floatValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(floatValue, tweenSpecTween$default, 0.0f, null, (Function1) objRememberedValue14, composerStartRestartGroup, 24624, 12);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        SnapshotState snapshotState10 = snapshotState3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function15.invoke(snapshotState4AnimateFloatAsState2.getValue());
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1108010809);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1108011477);
                        if (advancedChartGroupState65.getAxisConfig().getXAxisZoomable()) {
                            snapshotState5 = snapshotState10;
                            function110 = function19;
                            snapshotState6 = snapshotState9;
                            function03 = function02;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged9 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                            Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                            if (zChanged9 || objRememberedValue32 == companion2.getEmpty()) {
                                objRememberedValue32 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda38
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SduiAdvancedChartKt.m2460xc1a92d74(snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierFillMaxSize$default, (Function1) objRememberedValue32);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChanged10 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState65) | (i17 == 8388608) | ((i15 & 234881024) == 67108864);
                            Object objRememberedValue33 = composerStartRestartGroup.rememberedValue();
                            if (zChanged10 || objRememberedValue33 == companion2.getEmpty()) {
                                objRememberedValue33 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$4$2$1(advancedChartGroupState65, function19, snapshotState10, snapshotState9, snapshotState45, snapshotState, snapshotFloatState22, function02);
                                function110 = function19;
                                snapshotState5 = snapshotState10;
                                snapshotState6 = snapshotState9;
                                function03 = function02;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue33);
                            } else {
                                snapshotState5 = snapshotState10;
                                function110 = function19;
                                snapshotState6 = snapshotState9;
                                function03 = function02;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierFillMaxSize$default = SuspendingPointerInputFilterKt.pointerInput(modifierGraphicsLayer, value, (PointerInputEventHandler) objRememberedValue33);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i18 = i15 & 458752;
                        z = i18 != 131072;
                        Function1<? super Ranges3<Float>, Unit> function114 = function110;
                        objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue15 == companion2.getEmpty()) {
                            objRememberedValue15 = new PointerInputEventHandler() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1

                                /* compiled from: SduiAdvancedChart.kt */
                                @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
                                /* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1$1 */
                                static final class C278941 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SnapshotState<Offset> $globalScrubOffset$delegate;
                                    final /* synthetic */ Function1<Boolean, Unit> $onScrubbingModeUpdated;
                                    final /* synthetic */ SnapshotState<AdvancedChartGroupState2> $pointerInputState$delegate;
                                    final /* synthetic */ SnapshotFloatState2 $scrubLineAnimationTarget$delegate;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    C278941(Function1<? super Boolean, Unit> function1, SnapshotState<AdvancedChartGroupState2> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super C278941> continuation) {
                                        super(3, continuation);
                                        this.$onScrubbingModeUpdated = function1;
                                        this.$pointerInputState$delegate = snapshotState;
                                        this.$scrubLineAnimationTarget$delegate = snapshotFloatState2;
                                        this.$globalScrubOffset$delegate = snapshotState2;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                        return m18596invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                    }

                                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                    public final Object m18596invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                        return new C278941(this.$onScrubbingModeUpdated, this.$pointerInputState$delegate, this.$scrubLineAnimationTarget$delegate, this.$globalScrubOffset$delegate, continuation).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.$pointerInputState$delegate.setValue(AdvancedChartGroupState2.PRESSING);
                                            this.$scrubLineAnimationTarget$delegate.setFloatValue(0.0f);
                                            if (SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(this.$globalScrubOffset$delegate) != null) {
                                                this.$onScrubbingModeUpdated.invoke(boxing.boxBoolean(false));
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }

                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C278941(function16, snapshotState6, snapshotFloatState2, snapshotState5, null), null, continuation, 11, null);
                                    return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) objRememberedValue15);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | (i18 != 131072);
                        objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue16 == companion2.getEmpty()) {
                            final SnapshotState snapshotState11 = snapshotState6;
                            final SnapshotState snapshotState12 = snapshotState5;
                            final Function1<? super Boolean, Unit> function115 = function16;
                            objRememberedValue16 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda27
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$159$lambda$158(hapticFeedback, function115, snapshotState11, snapshotState12, snapshotFloatState2, (Offset) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                        }
                        Function1 function116 = (Function1) objRememberedValue16;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(advancedChartGroupState65);
                        objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue17 == companion2.getEmpty()) {
                            objRememberedValue17 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda28
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$161$lambda$160(advancedChartGroupState65, snapshotState6, snapshotState5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierScrubDetection = Interactions2.scrubDetection(modifierPointerInput, function116, (Function0) objRememberedValue17);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue18 == companion2.getEmpty()) {
                            objRememberedValue18 = new Measurer2(density);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                        }
                        measurer2 = (Measurer2) objRememberedValue18;
                        objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue19 == companion2.getEmpty()) {
                            objRememberedValue19 = new ConstraintLayoutScope();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue19;
                        objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue20 == companion2.getEmpty()) {
                            objRememberedValue20 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                        }
                        snapshotState7 = (SnapshotState) objRememberedValue20;
                        objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue21 == companion2.getEmpty()) {
                            objRememberedValue21 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue21;
                        objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue22 == companion2.getEmpty()) {
                            objRememberedValue22 = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                        }
                        snapshotState8 = (SnapshotState) objRememberedValue22;
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(measurer2);
                        i11 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged8 = zChangedInstance4 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged8 || objRememberedValue23 == companion2.getEmpty()) {
                            objRememberedValue23 = new MeasurePolicy() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState8.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i11);
                                    snapshotState7.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$2.1
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
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue23;
                        objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue24 == companion2.getEmpty()) {
                            objRememberedValue24 = new Function0<Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$3
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
                                    snapshotState7.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                        }
                        final Function0 function06 = (Function0) objRememberedValue24;
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                        objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3 || objRememberedValue25 == companion2.getEmpty()) {
                            objRememberedValue25 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$4
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
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                        }
                        final ProtoAdvancedChartGroupState advancedChartGroupState68 = advancedChartGroupState65;
                        final ChartGroupDto chartGroupDto = value;
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScrubDetection, false, (Function1) objRememberedValue25, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                ArrayList arrayList4;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                                int i20;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5;
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i19, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState8.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer3.startReplaceGroup(-1940731392);
                                ArrayList arrayList5 = new ArrayList(i16);
                                for (int i21 = 0; i21 < i16; i21++) {
                                    arrayList5.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList6 = new ArrayList(i16);
                                for (int i22 = 0; i22 < i16; i22++) {
                                    arrayList6.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList7 = new ArrayList(i16);
                                for (int i23 = 0; i23 < i16; i23++) {
                                    arrayList7.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList8 = new ArrayList(i16);
                                for (int i24 = 0; i24 < i16; i24++) {
                                    arrayList8.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList9 = new ArrayList(i16);
                                for (int i25 = 0; i25 < i16; i25++) {
                                    arrayList9.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ArrayList arrayList10 = new ArrayList(i16);
                                for (int i26 = 0; i26 < i16; i26++) {
                                    arrayList10.add(constraintLayoutScope2.createRef());
                                }
                                ArrayList arrayList11 = new ArrayList(i16);
                                for (int i27 = 0; i27 < i16; i27++) {
                                    arrayList11.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope2.createRef();
                                ArrayList arrayList12 = new ArrayList(i16);
                                for (int i28 = 0; i28 < i16; i28++) {
                                    arrayList12.add(constraintLayoutScope2.createRef());
                                }
                                ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList7.toArray(new ConstraintLayoutBaseScope4[0]);
                                ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr2 = (ConstraintLayoutBaseScope4[]) arrayList8.toArray(new ConstraintLayoutBaseScope4[0]);
                                ArrayList arrayList13 = arrayList7;
                                int i29 = helpersHashCode;
                                ArrayList arrayList14 = arrayList8;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
                                float fMo5013toDpu2uoSUM = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(advancedChartGroupState68.getTopIndicatorPadding());
                                List<ChartDto> charts3 = chartGroupDto.getCharts();
                                ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts3, 10));
                                Iterator<T> it5 = charts3.iterator();
                                while (it5.hasNext()) {
                                    Float weight = ((ChartDto) it5.next()).getWeight();
                                    arrayList15.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
                                }
                                List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope2, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList15, advancedChartGroupState68.getUseWeightsAsHeight());
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
                                int i30 = i16;
                                ProtoAxis protoAxis4 = protoAxis3;
                                ProtoAxisConfig axisConfig = advancedChartGroupState68.getAxisConfig();
                                if (arrayList3.isEmpty()) {
                                    arrayList4 = arrayList11;
                                    verticalAnchor = null;
                                } else {
                                    arrayList4 = arrayList11;
                                    verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                }
                                composer3.startReplaceGroup(5004770);
                                Object objRememberedValue34 = composer3.rememberedValue();
                                if (objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue34 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$2$1(snapshotIntState2);
                                    composer3.updateRememberedValue(objRememberedValue34);
                                }
                                composer3.endReplaceGroup();
                                ArrayList arrayList16 = arrayList4;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                ArrayList arrayList17 = arrayList12;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchorM8137createEndBarrier3ABfNKs$default;
                                SduiAdvancedChartKt.ProtoChartGroupXAxis(constraintLayoutScope2, i30, protoAxis4, constraintLayoutBaseScope4Component1, arrayList5, axisConfig, verticalAnchor6, verticalAnchor7, verticalAnchor, (Function1) objRememberedValue34, composer3, ConstraintLayoutScope.$stable | 805306368 | (ProtoAxis.$stable << 6));
                                ArrayList arrayList18 = arrayList5;
                                Composer composer4 = composer3;
                                composer4.startReplaceGroup(1600043778);
                                int i31 = 0;
                                for (Object obj : chartGroupDtoTransform.getCharts()) {
                                    int i32 = i31 + 1;
                                    if (i31 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    ChartDto chartDto = (ChartDto) obj;
                                    float fM7995constructorimpl2 = i31 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
                                    ProtoAxis protoAxis5 = (ProtoAxis) arrayList.get(i31);
                                    YAxisLocation yAxisPrimaryLocation = advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged11 = composer4.changed(snapshotStateMap2) | composer4.changed(i31);
                                    Object objRememberedValue35 = composer4.rememberedValue();
                                    if (zChanged11 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue35 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$1$1(snapshotStateMap2, i31);
                                        composer4.updateRememberedValue(objRememberedValue35);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue35);
                                    ArrayList arrayList19 = arrayList14;
                                    int i33 = ConstraintLayoutScope.$stable;
                                    int i34 = ProtoAxis.$stable;
                                    ArrayList arrayList20 = arrayList18;
                                    ArrayList arrayList21 = arrayList13;
                                    ArrayList arrayList22 = arrayList17;
                                    SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope2, protoAxis5, arrayList21, arrayList20, i31, yAxisPrimaryLocation, verticalAnchor6, verticalAnchor7, modifierOnGloballyPositioned, composer4, i33 | (i34 << 3), 0);
                                    arrayList18 = arrayList20;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor8 = verticalAnchor6;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor9 = verticalAnchor7;
                                    composer4.startReplaceGroup(1600064039);
                                    if (arrayList3.isEmpty()) {
                                        verticalAnchor4 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
                                        verticalAnchor5 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                    } else {
                                        ProtoAxis protoAxis6 = (ProtoAxis) arrayList3.get(i31);
                                        YAxisLocation yAxisSecondaryLocation = advancedChartGroupState68.getAxisConfig().getYAxisSecondaryLocation();
                                        if (yAxisSecondaryLocation == null) {
                                            yAxisSecondaryLocation = advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation();
                                        }
                                        YAxisLocation yAxisLocation = yAxisSecondaryLocation;
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged12 = composer4.changed(snapshotStateMap4) | composer4.changed(i31);
                                        Object objRememberedValue36 = composer4.rememberedValue();
                                        if (zChanged12 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue36 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$2$1(snapshotStateMap4, i31);
                                            composer4.updateRememberedValue(objRememberedValue36);
                                        }
                                        composer4.endReplaceGroup();
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor10 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor11 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
                                        SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope2, protoAxis6, arrayList19, arrayList18, i31, yAxisLocation, verticalAnchor10, verticalAnchor11, OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue36), composer4, i33 | (i34 << 3), 0);
                                        arrayList18 = arrayList18;
                                        verticalAnchor5 = verticalAnchor10;
                                        verticalAnchor4 = verticalAnchor11;
                                    }
                                    composer4.endReplaceGroup();
                                    List<SegmentedLine> listMapSegmentedDtoLines = SduiChartMappersKt.mapSegmentedDtoLines(extensions2.toImmutableList(chartDto.getLines()), composer4, 0);
                                    ImmutableList<Fill> immutableListMapFillDto = SduiChartMappersKt.mapFillDto(extensions2.toImmutableList(chartDto.getFills()), composer4, 0);
                                    boolean useWeightsAsHeight = advancedChartGroupState68.getUseWeightsAsHeight();
                                    ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                    YAxisLocation yAxisPrimaryLocation2 = advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation();
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor12 = !arrayList3.isEmpty() ? verticalAnchor5 : null;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged13 = composer4.changed(snapshotStateMap3) | composer4.changed(i31);
                                    Object objRememberedValue37 = composer4.rememberedValue();
                                    if (zChanged13 || objRememberedValue37 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue37 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$4$1(snapshotStateMap3, i31);
                                        composer4.updateRememberedValue(objRememberedValue37);
                                    }
                                    composer4.endReplaceGroup();
                                    int i35 = i31;
                                    List list = listM18594getHorizontalGuidelinesrAjV9yQ;
                                    SduiAdvancedChartKt.m18579ProtoChartosRQHRo(constraintLayoutScope2, chartDto, arrayList18, arrayList22, list, useWeightsAsHeight, fM7995constructorimpl2, i35, listMapSegmentedDtoLines, immutableListMapFillDto, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412, yAxisPrimaryLocation2, verticalAnchor8, verticalAnchor9, verticalAnchor12, (Function1) objRememberedValue37, advancedChartGroupState68.getLineRevealAnimationSpec(), composer3, i33, Point.$stable);
                                    verticalAnchor6 = verticalAnchor8;
                                    verticalAnchor7 = verticalAnchor9;
                                    arrayList17 = arrayList22;
                                    SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope2, arrayList17, arrayList18, i35, advancedChartGroupState68.getChartBottomDividerType(), advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor6, verticalAnchor7, composer3, i33);
                                    composer4 = composer3;
                                    listM18594getHorizontalGuidelinesrAjV9yQ = list;
                                    verticalAnchorM8138createStartBarrier3ABfNKs$default2 = verticalAnchor5;
                                    i31 = i32;
                                    arrayList14 = arrayList19;
                                    verticalAnchorM8137createEndBarrier3ABfNKs$default2 = verticalAnchor4;
                                    arrayList13 = arrayList21;
                                    i29 = i29;
                                    arrayList6 = arrayList6;
                                }
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor13 = verticalAnchor6;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor14 = verticalAnchor7;
                                ArrayList arrayList23 = arrayList6;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor15 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                int i36 = i29;
                                List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
                                composer3.endReplaceGroup();
                                boolean xAxisBottomDividers = advancedChartGroupState68.getAxisConfig().getXAxisBottomDividers();
                                int i37 = ConstraintLayoutScope.$stable;
                                SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope2, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer3, i37);
                                Composer composer5 = composer3;
                                ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                Float snapX = scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 != null ? scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413.getSnapX() : null;
                                composer5.startReplaceGroup(-1746271574);
                                boolean zChanged14 = composer5.changed(snapshotState42) | composer5.changedInstance(advancedChartGroupState68) | composer5.changedInstance(hapticFeedback);
                                Object objRememberedValue38 = composer5.rememberedValue();
                                if (zChanged14 || objRememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                    verticalAnchor2 = null;
                                    objRememberedValue38 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$4$1(advancedChartGroupState68, hapticFeedback, snapshotState42, null);
                                    composer5.updateRememberedValue(objRememberedValue38);
                                } else {
                                    verticalAnchor2 = null;
                                }
                                composer5.endReplaceGroup();
                                int i38 = 0;
                                EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue38, composer5, 0);
                                ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                composer5.startReplaceGroup(1600152781);
                                if (scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414 != null) {
                                    SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope2, advancedChartGroupState68.getScrubConfig(), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414.m2457x73acf0ad(), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(snapshotState45), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) snapshotState4AnimateFloatAsState2.getValue()).floatValue(), composer5, i37);
                                    composer5 = composer5;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1600168912);
                                int i39 = 0;
                                for (Object obj2 : chartGroupDtoTransform.getCharts()) {
                                    int i40 = i39 + 1;
                                    if (i39 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    ChartDto chartDto2 = (ChartDto) obj2;
                                    float fM7995constructorimpl3 = i39 == 0 ? C2002Dp.m7995constructorimpl(i38) : fM7995constructorimpl;
                                    ArrayList arrayList24 = arrayList23;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList24.get(i39);
                                    ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1415 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                    YAxisLocation yAxisPrimaryLocation3 = advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation();
                                    int i41 = ConstraintLayoutScope.$stable;
                                    int i42 = Point.$stable;
                                    arrayList23 = arrayList24;
                                    int i43 = i39;
                                    float f2 = fM7995constructorimpl3;
                                    List list3 = list2;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor16 = verticalAnchor13;
                                    Composer composer6 = composer5;
                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor17 = verticalAnchor14;
                                    SduiAdvancedChartKt.m18581ProtoScrubDot_WMjBM(constraintLayoutScope2, chartDto2, i43, f2, list3, constraintLayoutBaseScope4, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1415, yAxisPrimaryLocation3, verticalAnchor16, verticalAnchor17, composer6, i41 | (i42 << 18));
                                    int i44 = i43;
                                    List list4 = list3;
                                    Composer composer7 = composer6;
                                    composer7.startReplaceGroup(1600190989);
                                    if (advancedChartGroupState68.getScrubConfig().getYLabelEnabled()) {
                                        i20 = i38;
                                        SduiAdvancedChartKt.m18580ProtoChartYAxisScrubLabelskrPljE(constraintLayoutScope2, (ProtoAxis) arrayList.get(i44), arrayList9, list4, f2, i44, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$146(snapshotState44), advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor16, verticalAnchor17, composer7, (i42 << 18) | i41 | (ProtoAxis.$stable << 3), 0);
                                        list4 = list4;
                                        i44 = i44;
                                        verticalAnchor13 = verticalAnchor16;
                                        verticalAnchor3 = verticalAnchor17;
                                        composer7 = composer7;
                                    } else {
                                        verticalAnchor13 = verticalAnchor16;
                                        i20 = i38;
                                        verticalAnchor3 = verticalAnchor17;
                                    }
                                    composer7.endReplaceGroup();
                                    composer7.startReplaceGroup(1600216233);
                                    if (advancedChartGroupState68.getScrubConfig().getLegendsEnabled()) {
                                        SduiAdvancedChartKt.ProtoChartLegends(constraintLayoutScope2, ChartLegend.toProtoLegendLists(chartDto2.getLegend_data()), list4, i44, arrayList10, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), composer7, i41 | (i42 << 15));
                                    }
                                    composer3.endReplaceGroup();
                                    SduiAdvancedChartKt.ProtoChartTitle(constraintLayoutScope2, arrayList16, list4, i44, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), chartDto2.getTitle(), composer3, i41 | (i42 << 12));
                                    list2 = list4;
                                    composer5 = composer3;
                                    verticalAnchor14 = verticalAnchor3;
                                    i39 = i40;
                                    i38 = i20;
                                }
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor18 = verticalAnchor14;
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1600237259);
                                if (advancedChartGroupState68.getScrubConfig().getXLabelEnabled()) {
                                    SduiAdvancedChartKt.ProtoChartGroupXAxisScrubLabel(constraintLayoutScope2, protoAxis3, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), advancedChartGroupState68.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor13, verticalAnchor18, !arrayList3.isEmpty() ? verticalAnchor15 : verticalAnchor2, composer5, ConstraintLayoutScope.$stable | (ProtoAxis.$stable << 3) | (Point.$stable << 12));
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1600257534);
                                if (advancedChartGroupState68.getScrubConfig().getLegendsEnabled()) {
                                    SduiAdvancedChartKt.ProtoChartGroupLegends(constraintLayoutScope2, ChartLegend.toProtoLegendLists(chartGroupDtoTransform.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), ((Number) snapshotState4AnimateFloatAsState2.getValue()).floatValue(), composer5, ConstraintLayoutScope.$stable | (Point.$stable << 9));
                                }
                                composer5.endReplaceGroup();
                                composer5.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i36) {
                                    EffectsKt.SideEffect(function06, composer5, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ProtoAdvancedChartGroupState advancedChartGroupState69 = advancedChartGroupState65;
                        function04 = function03;
                        advancedChartGroupState66 = advancedChartGroupState69;
                        function111 = function114;
                        composer2 = composerStartRestartGroup;
                        function112 = function113;
                        tuples23 = tuples25;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function112 = function17;
                        tuples23 = tuples22;
                        advancedChartGroupState66 = advancedChartGroupState62;
                        function111 = function14;
                        function04 = function0;
                    }
                    final Modifier modifier3 = modifier2;
                    final Function1<? super Float, Unit> function117 = function15;
                    final Function1<? super Boolean, Unit> function118 = function16;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$185(component, modifier3, tuples23, advancedChartGroupState66, function117, function118, function112, function111, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function15 = function1;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        advancedChartGroupState64 = advancedChartGroupState63;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        value = component.getValue();
                        if (tuples22 != null) {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(xZoomRangeResetKey);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                function18.invoke(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE());
                                SnapshotState snapshotStateMutableStateOf$default3 = SnapshotState3.mutableStateOf$default(SduiChartZoomTransformer.getWHOLE_ZOOM_RANGE(), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default3);
                                objRememberedValue = snapshotStateMutableStateOf$default3;
                                snapshotState = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                SnapshotFloatState2 snapshotFloatState222 = (SnapshotFloatState2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                final SnapshotState4 snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(snapshotFloatState222.getFloatValue(), null, 0.0f, "adv-chart-edge-bounce", null, composerStartRestartGroup, 3072, 22);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState92 = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                if (tuples22 != null) {
                                    value = first;
                                }
                                function19 = function18;
                                final ChartGroupDto chartGroupDtoTransform2 = SduiChartZoomTransformer.transform(value, ProtoSduiAdvancedChartGroup$lambda$184$lambda$99(snapshotState), advancedChartGroupState64.getAxisConfig().getXAxisZoomable(), advancedChartGroupState64.getAxisConfig().getSortedChartGroupZoomXAxes(), advancedChartGroupState64.getAxisConfig().getPointsForYAxisZoomRangeCalculation());
                                ChartAxisDto x_axis2 = chartGroupDtoTransform2.getX_axis();
                                composerStartRestartGroup.startReplaceGroup(1107774320);
                                if (x_axis2 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1107777307);
                                List<ChartDto> charts3 = chartGroupDtoTransform2.getCharts();
                                protoAxis = protoAxisMapSduiAxis3;
                                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts3, 10));
                                it = charts3.iterator();
                                while (it.hasNext()) {
                                }
                                int i152 = i3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1107781708);
                                List<ChartDto> charts22 = chartGroupDtoTransform2.getCharts();
                                final List arrayList32 = new ArrayList();
                                it2 = charts22.iterator();
                                while (it2.hasNext()) {
                                }
                                Tuples2<ChartGroupDto, AdvancedChartZoomKeys> tuples252 = tuples22;
                                composerStartRestartGroup.endReplaceGroup();
                                size = value.getCharts().size();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                companion2 = Composer.INSTANCE;
                                if (objRememberedValue4 != companion2.getEmpty()) {
                                }
                                snapshotState2 = (SnapshotState) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged2 = composerStartRestartGroup.changed(chartGroupDtoTransform2);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue5 = SnapshotStateKt.mutableStateMapOf();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    snapshotStateMap = (SnapshotStateMap) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged3 = composerStartRestartGroup.changed(chartGroupDtoTransform2);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue6 = SnapshotStateKt.mutableStateMapOf();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        snapshotStateMap2 = (SnapshotStateMap) objRememberedValue6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChanged4 = composerStartRestartGroup.changed(chartGroupDtoTransform2);
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged4) {
                                            objRememberedValue7 = SnapshotStateKt.mutableStateMapOf();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                            final SnapshotStateMap snapshotStateMap42 = (SnapshotStateMap) objRememberedValue7;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue8 == companion2.getEmpty()) {
                                            }
                                            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue8;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue9 == companion2.getEmpty()) {
                                            }
                                            snapshotState4 = (SnapshotState4) objRememberedValue9;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Offset offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$1142 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(snapshotState2);
                                            ScrubConfig scrubConfig2 = advancedChartGroupState64.getScrubConfig();
                                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                                            zChanged5 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$1142) | composerStartRestartGroup.changed(scrubConfig2) | composerStartRestartGroup.changed(snapshotStateMap);
                                            Object objRememberedValue312 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged5) {
                                                final ProtoAdvancedChartGroupState advancedChartGroupState672 = advancedChartGroupState64;
                                                Function0 function052 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda35
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$140$lambda$139(snapshotState2, size, protoAxis, advancedChartGroupState672, snapshotStateMap, snapshotStateMap2);
                                                    }
                                                };
                                                snapshotState3 = snapshotState2;
                                                i10 = size;
                                                protoAxis2 = protoAxis;
                                                advancedChartGroupState65 = advancedChartGroupState672;
                                                snapshotStateMap3 = snapshotStateMap;
                                                objDerivedStateOf = SnapshotStateKt.derivedStateOf(function052);
                                                composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
                                                snapshotState42 = (SnapshotState4) objDerivedStateOf;
                                                composerStartRestartGroup.endReplaceGroup();
                                                final int i162 = i10;
                                                ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                                final ProtoAxis protoAxis32 = protoAxis2;
                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                zChanged6 = ((i152 & 3670016) != 1048576) | composerStartRestartGroup.changed(snapshotState42);
                                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged6) {
                                                    objRememberedValue10 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$1$1(function17, snapshotState42, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1412, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, Point.$stable);
                                                    if (tuples252 != null) {
                                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                        int i172 = i152 & 29360128;
                                                        zChanged7 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(advancedChartGroupState65) | (i172 != 8388608);
                                                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                        Function1<? super ScrubState, Unit> function1132 = function17;
                                                        if (zChanged7) {
                                                            objRememberedValue11 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1(advancedChartGroupState65, function19, snapshotState4, snapshotState, null);
                                                            snapshotState43 = snapshotState4;
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(xZoomRangeValidationKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue12 == companion2.getEmpty()) {
                                                            }
                                                            final SnapshotState4 snapshotState442 = (SnapshotState4) objRememberedValue12;
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue13 == companion2.getEmpty()) {
                                                            }
                                                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue13;
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            float floatValue2 = snapshotFloatState2.getFloatValue();
                                                            final SnapshotState4 snapshotState452 = snapshotState43;
                                                            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                                            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                                            if (objRememberedValue14 == companion2.getEmpty()) {
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            final SnapshotState4 snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(floatValue2, tweenSpecTween$default2, 0.0f, null, (Function1) objRememberedValue14, composerStartRestartGroup, 24624, 12);
                                                            Modifier.Companion companion32 = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                                                            if (composerStartRestartGroup.getApplier() == null) {
                                                            }
                                                            composerStartRestartGroup.startReusableNode();
                                                            if (composerStartRestartGroup.getInserting()) {
                                                            }
                                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                            SnapshotState snapshotState102 = snapshotState3;
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                                                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                                                            if (!composerM6388constructorimpl.getInserting()) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                function15.invoke(snapshotState4AnimateFloatAsState22.getValue());
                                                                composerStartRestartGroup.endNode();
                                                                composerStartRestartGroup.startReplaceGroup(1108010809);
                                                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, f, 1, null);
                                                                composerStartRestartGroup.startReplaceGroup(1108011477);
                                                                if (advancedChartGroupState65.getAxisConfig().getXAxisZoomable()) {
                                                                }
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                Unit unit2 = Unit.INSTANCE;
                                                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                int i182 = i152 & 458752;
                                                                if (i182 != 131072) {
                                                                }
                                                                Function1<? super Ranges3<Float>, Unit> function1142 = function110;
                                                                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                                                if (!z) {
                                                                    objRememberedValue15 = new PointerInputEventHandler() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1

                                                                        /* compiled from: SduiAdvancedChart.kt */
                                                                        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                        @DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
                                                                        /* renamed from: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$5$1$1 */
                                                                        static final class C278941 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SnapshotState<Offset> $globalScrubOffset$delegate;
                                                                            final /* synthetic */ Function1<Boolean, Unit> $onScrubbingModeUpdated;
                                                                            final /* synthetic */ SnapshotState<AdvancedChartGroupState2> $pointerInputState$delegate;
                                                                            final /* synthetic */ SnapshotFloatState2 $scrubLineAnimationTarget$delegate;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            C278941(Function1<? super Boolean, Unit> function1, SnapshotState<AdvancedChartGroupState2> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super C278941> continuation) {
                                                                                super(3, continuation);
                                                                                this.$onScrubbingModeUpdated = function1;
                                                                                this.$pointerInputState$delegate = snapshotState;
                                                                                this.$scrubLineAnimationTarget$delegate = snapshotFloatState2;
                                                                                this.$globalScrubOffset$delegate = snapshotState2;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function3
                                                                            public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                                                                return m18596invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                                                            }

                                                                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                                                            public final Object m18596invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                                                                return new C278941(this.$onScrubbingModeUpdated, this.$pointerInputState$delegate, this.$scrubLineAnimationTarget$delegate, this.$globalScrubOffset$delegate, continuation).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                if (this.label == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.$pointerInputState$delegate.setValue(AdvancedChartGroupState2.PRESSING);
                                                                                    this.$scrubLineAnimationTarget$delegate.setFloatValue(0.0f);
                                                                                    if (SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(this.$globalScrubOffset$delegate) != null) {
                                                                                        this.$onScrubbingModeUpdated.invoke(boxing.boxBoolean(false));
                                                                                    }
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                        }

                                                                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                                            Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C278941(function16, snapshotState6, snapshotFloatState2, snapshotState5, null), null, continuation, 11, null);
                                                                            return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default2, unit2, (PointerInputEventHandler) objRememberedValue15);
                                                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                    zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | (i182 != 131072);
                                                                    objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                                                                    if (!zChangedInstance) {
                                                                        final SnapshotState snapshotState112 = snapshotState6;
                                                                        final SnapshotState snapshotState122 = snapshotState5;
                                                                        final Function1 function1152 = function16;
                                                                        objRememberedValue16 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda27
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$159$lambda$158(hapticFeedback, function1152, snapshotState112, snapshotState122, snapshotFloatState2, (Offset) obj);
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                                                                        Function1 function1162 = (Function1) objRememberedValue16;
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(advancedChartGroupState65);
                                                                        objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                                                        if (!zChangedInstance2) {
                                                                            objRememberedValue17 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda28
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    return SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$161$lambda$160(advancedChartGroupState65, snapshotState6, snapshotState5);
                                                                                }
                                                                            };
                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            Modifier modifierScrubDetection2 = Interactions2.scrubDetection(modifierPointerInput2, function1162, (Function0) objRememberedValue17);
                                                                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                                                                            composerStartRestartGroup.startReplaceGroup(212064437);
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                                            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue18 == companion2.getEmpty()) {
                                                                            }
                                                                            measurer2 = (Measurer2) objRememberedValue18;
                                                                            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue19 == companion2.getEmpty()) {
                                                                            }
                                                                            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue19;
                                                                            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue20 == companion2.getEmpty()) {
                                                                            }
                                                                            snapshotState7 = (SnapshotState) objRememberedValue20;
                                                                            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue21 == companion2.getEmpty()) {
                                                                            }
                                                                            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue21;
                                                                            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                                                                            if (objRememberedValue22 == companion2.getEmpty()) {
                                                                            }
                                                                            snapshotState8 = (SnapshotState) objRememberedValue22;
                                                                            boolean zChangedInstance42 = composerStartRestartGroup.changedInstance(measurer2);
                                                                            i11 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                                                            zChanged8 = zChangedInstance42 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                                                            objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChanged8) {
                                                                                objRememberedValue23 = new MeasurePolicy() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$2
                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i19) {
                                                                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i19);
                                                                                    }

                                                                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                    /* renamed from: measure-3p2s80s */
                                                                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                                                                        final Map linkedHashMap = new LinkedHashMap();
                                                                                        snapshotState8.getValue();
                                                                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i11);
                                                                                        snapshotState7.getValue();
                                                                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                                                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                                                                        final Measurer2 measurer22 = measurer2;
                                                                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$2.1
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
                                                                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                                                                            }
                                                                                        }, 4, null);
                                                                                    }
                                                                                };
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                                                                                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue23;
                                                                                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                                                                                if (objRememberedValue24 == companion2.getEmpty()) {
                                                                                }
                                                                                final Function0 function062 = (Function0) objRememberedValue24;
                                                                                zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                                                                                objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                                                                                if (!zChangedInstance3) {
                                                                                    objRememberedValue25 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$4
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
                                                                                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                                                                        }
                                                                                    };
                                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                                                                                    final ProtoAdvancedChartGroupState advancedChartGroupState682 = advancedChartGroupState65;
                                                                                    final ChartGroupDto chartGroupDto2 = value;
                                                                                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScrubDetection2, false, (Function1) objRememberedValue25, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$lambda$184$$inlined$ConstraintLayout$5
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                                                            invoke(composer3, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer3, int i19) {
                                                                                            ArrayList arrayList4;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                                                                                            int i20;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5;
                                                                                            if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                                                                                composer3.skipToGroupEnd();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(1200550679, i19, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                                                                            }
                                                                                            snapshotState8.setValue(Unit.INSTANCE);
                                                                                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                                                                            constraintLayoutScope2.reset();
                                                                                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                                                                            composer3.startReplaceGroup(-1940731392);
                                                                                            ArrayList arrayList5 = new ArrayList(i162);
                                                                                            for (int i21 = 0; i21 < i162; i21++) {
                                                                                                arrayList5.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList6 = new ArrayList(i162);
                                                                                            for (int i22 = 0; i22 < i162; i22++) {
                                                                                                arrayList6.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList7 = new ArrayList(i162);
                                                                                            for (int i23 = 0; i23 < i162; i23++) {
                                                                                                arrayList7.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList8 = new ArrayList(i162);
                                                                                            for (int i24 = 0; i24 < i162; i24++) {
                                                                                                arrayList8.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList9 = new ArrayList(i162);
                                                                                            for (int i25 = 0; i25 < i162; i25++) {
                                                                                                arrayList9.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                                                                            ArrayList arrayList10 = new ArrayList(i162);
                                                                                            for (int i26 = 0; i26 < i162; i26++) {
                                                                                                arrayList10.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ArrayList arrayList11 = new ArrayList(i162);
                                                                                            for (int i27 = 0; i27 < i162; i27++) {
                                                                                                arrayList11.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope22.createRef();
                                                                                            ArrayList arrayList12 = new ArrayList(i162);
                                                                                            for (int i28 = 0; i28 < i162; i28++) {
                                                                                                arrayList12.add(constraintLayoutScope22.createRef());
                                                                                            }
                                                                                            ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr = (ConstraintLayoutBaseScope4[]) arrayList7.toArray(new ConstraintLayoutBaseScope4[0]);
                                                                                            ConstraintLayoutBaseScope4[] constraintLayoutBaseScope4Arr2 = (ConstraintLayoutBaseScope4[]) arrayList8.toArray(new ConstraintLayoutBaseScope4[0]);
                                                                                            ArrayList arrayList13 = arrayList7;
                                                                                            int i29 = helpersHashCode;
                                                                                            ArrayList arrayList14 = arrayList8;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr, constraintLayoutBaseScope4Arr.length), 0.0f, 2, null);
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope22, (ConstraintLayoutBaseScope6[]) Arrays.copyOf(constraintLayoutBaseScope4Arr2, constraintLayoutBaseScope4Arr2.length), 0.0f, 2, null);
                                                                                            float fMo5013toDpu2uoSUM = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(advancedChartGroupState682.getTopIndicatorPadding());
                                                                                            List<ChartDto> charts32 = chartGroupDto2.getCharts();
                                                                                            ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts32, 10));
                                                                                            Iterator<T> it5 = charts32.iterator();
                                                                                            while (it5.hasNext()) {
                                                                                                Float weight = ((ChartDto) it5.next()).getWeight();
                                                                                                arrayList15.add(Float.valueOf(weight != null ? weight.floatValue() : 0.0f));
                                                                                            }
                                                                                            List listM18594getHorizontalGuidelinesrAjV9yQ = SduiAdvancedChartKt.m18594getHorizontalGuidelinesrAjV9yQ(constraintLayoutScope22, fMo5013toDpu2uoSUM, constraintLayoutBaseScope4Component1, arrayList15, advancedChartGroupState682.getUseWeightsAsHeight());
                                                                                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
                                                                                            int i30 = i162;
                                                                                            ProtoAxis protoAxis4 = protoAxis32;
                                                                                            ProtoAxisConfig axisConfig = advancedChartGroupState682.getAxisConfig();
                                                                                            if (arrayList32.isEmpty()) {
                                                                                                arrayList4 = arrayList11;
                                                                                                verticalAnchor = null;
                                                                                            } else {
                                                                                                arrayList4 = arrayList11;
                                                                                                verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                                                                            }
                                                                                            composer3.startReplaceGroup(5004770);
                                                                                            Object objRememberedValue34 = composer3.rememberedValue();
                                                                                            if (objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                                                                                objRememberedValue34 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$2$1(snapshotIntState22);
                                                                                                composer3.updateRememberedValue(objRememberedValue34);
                                                                                            }
                                                                                            composer3.endReplaceGroup();
                                                                                            ArrayList arrayList16 = arrayList4;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                                                                            ArrayList arrayList17 = arrayList12;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchorM8137createEndBarrier3ABfNKs$default;
                                                                                            SduiAdvancedChartKt.ProtoChartGroupXAxis(constraintLayoutScope22, i30, protoAxis4, constraintLayoutBaseScope4Component1, arrayList5, axisConfig, verticalAnchor6, verticalAnchor7, verticalAnchor, (Function1) objRememberedValue34, composer3, ConstraintLayoutScope.$stable | 805306368 | (ProtoAxis.$stable << 6));
                                                                                            ArrayList arrayList18 = arrayList5;
                                                                                            Composer composer4 = composer3;
                                                                                            composer4.startReplaceGroup(1600043778);
                                                                                            int i31 = 0;
                                                                                            for (Object obj : chartGroupDtoTransform2.getCharts()) {
                                                                                                int i32 = i31 + 1;
                                                                                                if (i31 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                ChartDto chartDto = (ChartDto) obj;
                                                                                                float fM7995constructorimpl2 = i31 == 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl;
                                                                                                ProtoAxis protoAxis5 = (ProtoAxis) arrayList.get(i31);
                                                                                                YAxisLocation yAxisPrimaryLocation = advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation();
                                                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                                                composer4.startReplaceGroup(-1633490746);
                                                                                                boolean zChanged11 = composer4.changed(snapshotStateMap2) | composer4.changed(i31);
                                                                                                Object objRememberedValue35 = composer4.rememberedValue();
                                                                                                if (zChanged11 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                                                                                    objRememberedValue35 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$1$1(snapshotStateMap2, i31);
                                                                                                    composer4.updateRememberedValue(objRememberedValue35);
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue35);
                                                                                                ArrayList arrayList19 = arrayList14;
                                                                                                int i33 = ConstraintLayoutScope.$stable;
                                                                                                int i34 = ProtoAxis.$stable;
                                                                                                ArrayList arrayList20 = arrayList18;
                                                                                                ArrayList arrayList21 = arrayList13;
                                                                                                ArrayList arrayList222 = arrayList17;
                                                                                                SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope22, protoAxis5, arrayList21, arrayList20, i31, yAxisPrimaryLocation, verticalAnchor6, verticalAnchor7, modifierOnGloballyPositioned, composer4, i33 | (i34 << 3), 0);
                                                                                                arrayList18 = arrayList20;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor8 = verticalAnchor6;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor9 = verticalAnchor7;
                                                                                                composer4.startReplaceGroup(1600064039);
                                                                                                if (arrayList32.isEmpty()) {
                                                                                                    verticalAnchor4 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
                                                                                                    verticalAnchor5 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                                                                                } else {
                                                                                                    ProtoAxis protoAxis6 = (ProtoAxis) arrayList32.get(i31);
                                                                                                    YAxisLocation yAxisSecondaryLocation = advancedChartGroupState682.getAxisConfig().getYAxisSecondaryLocation();
                                                                                                    if (yAxisSecondaryLocation == null) {
                                                                                                        yAxisSecondaryLocation = advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation();
                                                                                                    }
                                                                                                    YAxisLocation yAxisLocation = yAxisSecondaryLocation;
                                                                                                    composer4.startReplaceGroup(-1633490746);
                                                                                                    boolean zChanged12 = composer4.changed(snapshotStateMap42) | composer4.changed(i31);
                                                                                                    Object objRememberedValue36 = composer4.rememberedValue();
                                                                                                    if (zChanged12 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                                                                                        objRememberedValue36 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$2$1(snapshotStateMap42, i31);
                                                                                                        composer4.updateRememberedValue(objRememberedValue36);
                                                                                                    }
                                                                                                    composer4.endReplaceGroup();
                                                                                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor10 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                                                                                    ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor11 = verticalAnchorM8137createEndBarrier3ABfNKs$default2;
                                                                                                    SduiAdvancedChartKt.ProtoChartYAxis(constraintLayoutScope22, protoAxis6, arrayList19, arrayList18, i31, yAxisLocation, verticalAnchor10, verticalAnchor11, OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue36), composer4, i33 | (i34 << 3), 0);
                                                                                                    arrayList18 = arrayList18;
                                                                                                    verticalAnchor5 = verticalAnchor10;
                                                                                                    verticalAnchor4 = verticalAnchor11;
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                                List<SegmentedLine> listMapSegmentedDtoLines = SduiChartMappersKt.mapSegmentedDtoLines(extensions2.toImmutableList(chartDto.getLines()), composer4, 0);
                                                                                                ImmutableList<Fill> immutableListMapFillDto = SduiChartMappersKt.mapFillDto(extensions2.toImmutableList(chartDto.getFills()), composer4, 0);
                                                                                                boolean useWeightsAsHeight = advancedChartGroupState682.getUseWeightsAsHeight();
                                                                                                ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$14122 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                                                                                YAxisLocation yAxisPrimaryLocation2 = advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation();
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor12 = !arrayList32.isEmpty() ? verticalAnchor5 : null;
                                                                                                composer4.startReplaceGroup(-1633490746);
                                                                                                boolean zChanged13 = composer4.changed(snapshotStateMap3) | composer4.changed(i31);
                                                                                                Object objRememberedValue37 = composer4.rememberedValue();
                                                                                                if (zChanged13 || objRememberedValue37 == Composer.INSTANCE.getEmpty()) {
                                                                                                    objRememberedValue37 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$3$4$1(snapshotStateMap3, i31);
                                                                                                    composer4.updateRememberedValue(objRememberedValue37);
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                                int i35 = i31;
                                                                                                List list = listM18594getHorizontalGuidelinesrAjV9yQ;
                                                                                                SduiAdvancedChartKt.m18579ProtoChartosRQHRo(constraintLayoutScope22, chartDto, arrayList18, arrayList222, list, useWeightsAsHeight, fM7995constructorimpl2, i35, listMapSegmentedDtoLines, immutableListMapFillDto, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$14122, yAxisPrimaryLocation2, verticalAnchor8, verticalAnchor9, verticalAnchor12, (Function1) objRememberedValue37, advancedChartGroupState682.getLineRevealAnimationSpec(), composer3, i33, Point.$stable);
                                                                                                verticalAnchor6 = verticalAnchor8;
                                                                                                verticalAnchor7 = verticalAnchor9;
                                                                                                arrayList17 = arrayList222;
                                                                                                SduiAdvancedChartKt.ChartBottomDivider(constraintLayoutScope22, arrayList17, arrayList18, i35, advancedChartGroupState682.getChartBottomDividerType(), advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor6, verticalAnchor7, composer3, i33);
                                                                                                composer4 = composer3;
                                                                                                listM18594getHorizontalGuidelinesrAjV9yQ = list;
                                                                                                verticalAnchorM8138createStartBarrier3ABfNKs$default2 = verticalAnchor5;
                                                                                                i31 = i32;
                                                                                                arrayList14 = arrayList19;
                                                                                                verticalAnchorM8137createEndBarrier3ABfNKs$default2 = verticalAnchor4;
                                                                                                arrayList13 = arrayList21;
                                                                                                i29 = i29;
                                                                                                arrayList6 = arrayList6;
                                                                                            }
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor13 = verticalAnchor6;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor14 = verticalAnchor7;
                                                                                            ArrayList arrayList23 = arrayList6;
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor15 = verticalAnchorM8138createStartBarrier3ABfNKs$default2;
                                                                                            int i36 = i29;
                                                                                            List list2 = listM18594getHorizontalGuidelinesrAjV9yQ;
                                                                                            composer3.endReplaceGroup();
                                                                                            boolean xAxisBottomDividers = advancedChartGroupState682.getAxisConfig().getXAxisBottomDividers();
                                                                                            int i37 = ConstraintLayoutScope.$stable;
                                                                                            SduiAdvancedChartKt.ChartGroupXAxisBottomDivider(constraintLayoutScope22, constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component1, xAxisBottomDividers, composer3, i37);
                                                                                            Composer composer5 = composer3;
                                                                                            ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                                                                            Float snapX = scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413 != null ? scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1413.getSnapX() : null;
                                                                                            composer5.startReplaceGroup(-1746271574);
                                                                                            boolean zChanged14 = composer5.changed(snapshotState42) | composer5.changedInstance(advancedChartGroupState682) | composer5.changedInstance(hapticFeedback);
                                                                                            Object objRememberedValue38 = composer5.rememberedValue();
                                                                                            if (zChanged14 || objRememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                                                                                verticalAnchor2 = null;
                                                                                                objRememberedValue38 = new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$8$4$1(advancedChartGroupState682, hapticFeedback, snapshotState42, null);
                                                                                                composer5.updateRememberedValue(objRememberedValue38);
                                                                                            } else {
                                                                                                verticalAnchor2 = null;
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            int i38 = 0;
                                                                                            EffectsKt.LaunchedEffect(snapX, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue38, composer5, 0);
                                                                                            ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                                                                            composer5.startReplaceGroup(1600152781);
                                                                                            if (scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414 != null) {
                                                                                                SduiAdvancedChartKt.m18576ChartGroupScrubLinesLiby8ZU(constraintLayoutScope22, advancedChartGroupState682.getScrubConfig(), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414.m2457x73acf0ad(), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(snapshotState452), scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1414.getScrubLineX(), constraintLayoutBaseScope4Component4, ((Number) snapshotState4AnimateFloatAsState22.getValue()).floatValue(), composer5, i37);
                                                                                                composer5 = composer5;
                                                                                                Unit unit22 = Unit.INSTANCE;
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1600168912);
                                                                                            int i39 = 0;
                                                                                            for (Object obj2 : chartGroupDtoTransform2.getCharts()) {
                                                                                                int i40 = i39 + 1;
                                                                                                if (i39 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                ChartDto chartDto2 = (ChartDto) obj2;
                                                                                                float fM7995constructorimpl3 = i39 == 0 ? C2002Dp.m7995constructorimpl(i38) : fM7995constructorimpl;
                                                                                                ArrayList arrayList24 = arrayList23;
                                                                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) arrayList24.get(i39);
                                                                                                ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1415 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
                                                                                                YAxisLocation yAxisPrimaryLocation3 = advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation();
                                                                                                int i41 = ConstraintLayoutScope.$stable;
                                                                                                int i42 = Point.$stable;
                                                                                                arrayList23 = arrayList24;
                                                                                                int i43 = i39;
                                                                                                float f2 = fM7995constructorimpl3;
                                                                                                List list3 = list2;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor16 = verticalAnchor13;
                                                                                                Composer composer6 = composer5;
                                                                                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor17 = verticalAnchor14;
                                                                                                SduiAdvancedChartKt.m18581ProtoScrubDot_WMjBM(constraintLayoutScope22, chartDto2, i43, f2, list3, constraintLayoutBaseScope4, scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$1415, yAxisPrimaryLocation3, verticalAnchor16, verticalAnchor17, composer6, i41 | (i42 << 18));
                                                                                                int i44 = i43;
                                                                                                List list4 = list3;
                                                                                                Composer composer7 = composer6;
                                                                                                composer7.startReplaceGroup(1600190989);
                                                                                                if (advancedChartGroupState682.getScrubConfig().getYLabelEnabled()) {
                                                                                                    i20 = i38;
                                                                                                    SduiAdvancedChartKt.m18580ProtoChartYAxisScrubLabelskrPljE(constraintLayoutScope22, (ProtoAxis) arrayList.get(i44), arrayList9, list4, f2, i44, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$146(snapshotState442), advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor16, verticalAnchor17, composer7, (i42 << 18) | i41 | (ProtoAxis.$stable << 3), 0);
                                                                                                    list4 = list4;
                                                                                                    i44 = i44;
                                                                                                    verticalAnchor13 = verticalAnchor16;
                                                                                                    verticalAnchor3 = verticalAnchor17;
                                                                                                    composer7 = composer7;
                                                                                                } else {
                                                                                                    verticalAnchor13 = verticalAnchor16;
                                                                                                    i20 = i38;
                                                                                                    verticalAnchor3 = verticalAnchor17;
                                                                                                }
                                                                                                composer7.endReplaceGroup();
                                                                                                composer7.startReplaceGroup(1600216233);
                                                                                                if (advancedChartGroupState682.getScrubConfig().getLegendsEnabled()) {
                                                                                                    SduiAdvancedChartKt.ProtoChartLegends(constraintLayoutScope22, ChartLegend.toProtoLegendLists(chartDto2.getLegend_data()), list4, i44, arrayList10, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), composer7, i41 | (i42 << 15));
                                                                                                }
                                                                                                composer3.endReplaceGroup();
                                                                                                SduiAdvancedChartKt.ProtoChartTitle(constraintLayoutScope22, arrayList16, list4, i44, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), chartDto2.getTitle(), composer3, i41 | (i42 << 12));
                                                                                                list2 = list4;
                                                                                                composer5 = composer3;
                                                                                                verticalAnchor14 = verticalAnchor3;
                                                                                                i39 = i40;
                                                                                                i38 = i20;
                                                                                            }
                                                                                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor18 = verticalAnchor14;
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1600237259);
                                                                                            if (advancedChartGroupState682.getScrubConfig().getXLabelEnabled()) {
                                                                                                SduiAdvancedChartKt.ProtoChartGroupXAxisScrubLabel(constraintLayoutScope22, protoAxis32, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), advancedChartGroupState682.getAxisConfig().getYAxisPrimaryLocation(), verticalAnchor13, verticalAnchor18, !arrayList32.isEmpty() ? verticalAnchor15 : verticalAnchor2, composer5, ConstraintLayoutScope.$stable | (ProtoAxis.$stable << 3) | (Point.$stable << 12));
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.startReplaceGroup(1600257534);
                                                                                            if (advancedChartGroupState682.getScrubConfig().getLegendsEnabled()) {
                                                                                                SduiAdvancedChartKt.ProtoChartGroupLegends(constraintLayoutScope22, ChartLegend.toProtoLegendLists(chartGroupDtoTransform2.getLegend_data()), constraintLayoutBaseScope4Component3, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42), ((Number) snapshotState4AnimateFloatAsState22.getValue()).floatValue(), composer5, ConstraintLayoutScope.$stable | (Point.$stable << 9));
                                                                                            }
                                                                                            composer5.endReplaceGroup();
                                                                                            composer5.endReplaceGroup();
                                                                                            if (constraintLayoutScope2.getHelpersHashCode() != i36) {
                                                                                                EffectsKt.SideEffect(function062, composer5, 6);
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                            }
                                                                                        }
                                                                                    }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                    }
                                                                                    ProtoAdvancedChartGroupState advancedChartGroupState692 = advancedChartGroupState65;
                                                                                    function04 = function03;
                                                                                    advancedChartGroupState66 = advancedChartGroupState692;
                                                                                    function111 = function1142;
                                                                                    composer2 = composerStartRestartGroup;
                                                                                    function112 = function1132;
                                                                                    tuples23 = tuples252;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final Modifier modifier32 = modifier2;
                final Function1 function1172 = function15;
                final Function1 function1182 = function16;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            tuples22 = tuples2;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function15 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final Modifier modifier322 = modifier2;
            final Function1 function11722 = function15;
            final Function1 function11822 = function16;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        tuples22 = tuples2;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function15 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final Modifier modifier3222 = modifier2;
        final Function1 function117222 = function15;
        final Function1 function118222 = function16;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect ProtoSduiAdvancedChartGroup$lambda$184$lambda$127$lambda$126(SnapshotStateMap snapshotStateMap, SnapshotIntState2 snapshotIntState2) {
        Collection collectionValues = snapshotStateMap.values();
        if (collectionValues.isEmpty()) {
            return null;
        }
        Collection collection = collectionValues;
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float left = ((Rect) it.next()).getLeft();
        while (it.hasNext()) {
            left = Math.min(left, ((Rect) it.next()).getLeft());
        }
        Iterator it2 = collection.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float top = ((Rect) it2.next()).getTop();
        while (it2.hasNext()) {
            top = Math.min(top, ((Rect) it2.next()).getTop());
        }
        Iterator it3 = collection.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float right = ((Rect) it3.next()).getRight();
        while (it3.hasNext()) {
            right = Math.max(right, ((Rect) it3.next()).getRight());
        }
        Iterator it4 = collection.iterator();
        if (it4.hasNext()) {
            float bottom = ((Rect) it4.next()).getBottom();
            while (it4.hasNext()) {
                bottom = Math.max(bottom, ((Rect) it4.next()).getBottom());
            }
            return new Rect(left, top, right, bottom + (snapshotIntState2.getIntValue() / 2));
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ScrubState ProtoSduiAdvancedChartGroup$lambda$184$lambda$140$lambda$139(SnapshotState snapshotState, int i, ProtoAxis protoAxis, ProtoAdvancedChartGroupState advancedChartGroupState6, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2) {
        Integer next;
        float fFloatValue;
        float fFloatValue2;
        float x;
        float right;
        List<ProtoAxisScrubLabel> scrubLabels;
        Offset offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$114 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(snapshotState);
        Float fValueOf = null;
        if (offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$114 != null) {
            long packedValue = offsetProtoSduiAdvancedChartGroup$lambda$184$lambda$114.getPackedValue();
            Iterator<Integer> it = RangesKt.until(0, i).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Rect rect = (Rect) snapshotStateMap.get(Integer.valueOf(next.intValue()));
                    Float fM18592distanceToEdgeUv8p0NA = rect != null ? m18592distanceToEdgeUv8p0NA(rect, packedValue) : null;
                    if (rect != null) {
                        if (rect.m6555containsk4lQ0M(packedValue)) {
                            fFloatValue = -1.0f;
                        } else if (fM18592distanceToEdgeUv8p0NA != null) {
                            fFloatValue = fM18592distanceToEdgeUv8p0NA.floatValue();
                        } else {
                            List<Offset> listCornerOffsets = cornerOffsets(rect);
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listCornerOffsets, 10));
                            Iterator<T> it2 = listCornerOffsets.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Float.valueOf(Offset.m6542getDistanceSquaredimpl(Offset.m6546minusMKHz9U(packedValue, ((Offset) it2.next()).getPackedValue()))));
                            }
                            Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList);
                            fFloatValue = fMinOrNull != null ? fMinOrNull.floatValue() : Float.POSITIVE_INFINITY;
                        }
                        do {
                            Integer next2 = it.next();
                            Rect rect2 = (Rect) snapshotStateMap.get(Integer.valueOf(next2.intValue()));
                            Float fM18592distanceToEdgeUv8p0NA2 = rect2 != null ? m18592distanceToEdgeUv8p0NA(rect2, packedValue) : null;
                            if (rect2 != null) {
                                if (rect2.m6555containsk4lQ0M(packedValue)) {
                                    fFloatValue2 = -1.0f;
                                } else if (fM18592distanceToEdgeUv8p0NA2 != null) {
                                    fFloatValue2 = fM18592distanceToEdgeUv8p0NA2.floatValue();
                                } else {
                                    List<Offset> listCornerOffsets2 = cornerOffsets(rect2);
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listCornerOffsets2, 10));
                                    Iterator<T> it3 = listCornerOffsets2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(Float.valueOf(Offset.m6542getDistanceSquaredimpl(Offset.m6546minusMKHz9U(packedValue, ((Offset) it3.next()).getPackedValue()))));
                                    }
                                    Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList2);
                                    fFloatValue2 = fMinOrNull2 != null ? fMinOrNull2.floatValue() : Float.POSITIVE_INFINITY;
                                }
                                if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                    next = next2;
                                    fFloatValue = fFloatValue2;
                                }
                            }
                        } while (it.hasNext());
                    }
                }
            } else {
                next = null;
            }
            Integer num = next;
            Rect rect3 = num != null ? (Rect) snapshotStateMap.get(Integer.valueOf(num.intValue())) : null;
            if (num != null && rect3 != null) {
                long jM18591coerceInRect3MmeM6k = m18591coerceInRect3MmeM6k(Offset.m6546minusMKHz9U(packedValue, rect3.m6560getTopLeftF1C5BW0()), rect3);
                Point pointCoerceInsideWindow = coerceInsideWindow(RectExtensions.m11982getNormalizedPointUv8p0NA(rect3, jM18591coerceInRect3MmeM6k));
                if (protoAxis == null || (scrubLabels = protoAxis.getScrubLabels()) == null) {
                    x = pointCoerceInsideWindow.getX();
                } else {
                    ProtoAxisScrubLabel protoAxisScrubLabel = (ProtoAxisScrubLabel) UtilKt.getClosestItemByValue(scrubLabels, pointCoerceInsideWindow.getX(), new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda88
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.m2458x1794186e((ProtoAxisScrubLabel) obj));
                        }
                    });
                    Float fValueOf2 = protoAxisScrubLabel != null ? Float.valueOf(protoAxisScrubLabel.getValue()) : null;
                    if (fValueOf2 != null) {
                        x = fValueOf2.floatValue();
                    }
                }
                Point point = new Point(x, pointCoerceInsideWindow.getY());
                long jM6547plusMKHz9U = Offset.m6547plusMKHz9U(rect3.m6560getTopLeftF1C5BW0(), jM18591coerceInRect3MmeM6k);
                ImmutableList<Float> xAxisSnapPoints = advancedChartGroupState6.getScrubConfig().getXAxisSnapPoints();
                Float f = xAxisSnapPoints != null ? (Float) UtilKt.getClosestItemByValue(xAxisSnapPoints, x, new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda89
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(SduiAdvancedChartKt.m2459x26f7632e(((Float) obj).floatValue()));
                    }
                }) : null;
                if (f != null) {
                    float fFloatValue3 = f.floatValue();
                    if (advancedChartGroupState6.getAxisConfig().getYAxisPrimaryLocation() == YAxisLocation.START) {
                        float right2 = fFloatValue3 * (rect3.getRight() - rect3.getLeft());
                        Iterator it4 = snapshotStateMap2.entrySet().iterator();
                        if (it4.hasNext()) {
                            Rect rect4 = (Rect) ((Map.Entry) it4.next()).getValue();
                            float right3 = rect4.getRight() - rect4.getLeft();
                            while (it4.hasNext()) {
                                Rect rect5 = (Rect) ((Map.Entry) it4.next()).getValue();
                                right3 = Math.max(right3, rect5.getRight() - rect5.getLeft());
                            }
                            fValueOf = Float.valueOf(right3);
                        }
                        right = right2 + (fValueOf != null ? fValueOf.floatValue() : 0.0f);
                    } else {
                        right = fFloatValue3 * (rect3.getRight() - rect3.getLeft());
                    }
                    fValueOf = Float.valueOf(right);
                }
                return new ScrubState(num.intValue(), Float.intBitsToFloat((int) (rect3.m6560getTopLeftF1C5BW0() >> 32)), jM6547plusMKHz9U, point, f, fValueOf != null ? fValueOf.floatValue() : Float.intBitsToFloat((int) (jM6547plusMKHz9U >> 32)), null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProtoSduiAdvancedChartGroup$lambda$184$lambda$140$lambda$139$lambda$138$lambda$133$lambda$132 */
    public static final float m2458x1794186e(ProtoAxisScrubLabel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float ProtoSduiAdvancedChartGroup$lambda$184$lambda$145$lambda$144(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        Rect rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(snapshotState4);
        Float fValueOf = rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128 != null ? Float.valueOf(rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128.getRight() - rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128.getLeft()) : null;
        ScrubState scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141 = ProtoSduiAdvancedChartGroup$lambda$184$lambda$141(snapshotState42);
        Float fValueOf2 = scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141 != null ? Float.valueOf(Float.intBitsToFloat((int) (scrubStateProtoSduiAdvancedChartGroup$lambda$184$lambda$141.m2457x73acf0ad() >> 32))) : null;
        if (fValueOf == null || fValueOf2 == null) {
            return null;
        }
        return Float.valueOf(fValueOf.floatValue() - fValueOf2.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$184$lambda$151$lambda$150(SnapshotState snapshotState, float f) {
        if (f == 0.0f) {
            snapshotState.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProtoSduiAdvancedChartGroup$lambda$184$lambda$156$lambda$154$lambda$153 */
    public static final Unit m2460xc1a92d74(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
        long jTransformOrigin;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(1 + Math.abs(ProtoSduiAdvancedChartGroup$lambda$184$lambda$104(snapshotState4)));
        if (ProtoSduiAdvancedChartGroup$lambda$184$lambda$104(snapshotState4) < 0.0f) {
            jTransformOrigin = TransformOrigin2.TransformOrigin(1.0f, 0.0f);
        } else {
            jTransformOrigin = TransformOrigin2.TransformOrigin(0.0f, 0.0f);
        }
        graphicsLayer.mo6764setTransformOrigin__ExYCQ(jTransformOrigin);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$184$lambda$159$lambda$158(HapticFeedback hapticFeedback, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, Offset offset) {
        snapshotState.setValue(AdvancedChartGroupState2.SCRUBBING);
        if (ProtoSduiAdvancedChartGroup$lambda$184$lambda$114(snapshotState2) == null) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            snapshotFloatState2.setFloatValue(1.0f);
            function1.invoke(Boolean.TRUE);
        }
        snapshotState2.setValue(offset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiAdvancedChartGroup$lambda$184$lambda$161$lambda$160(ProtoAdvancedChartGroupState advancedChartGroupState6, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(AdvancedChartGroupState2.IDLE);
        if (advancedChartGroupState6.getScrubConfig().getClearOnScrubStop()) {
            snapshotState2.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chart-kiIZU34, reason: not valid java name */
    public static final <ActionT extends Parcelable> void m18575ChartkiIZU34(final ConstraintLayoutScope constraintLayoutScope, Chart<? extends ActionT> chart, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope4> list2, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3, final boolean z, final float f, final int i, final List<? extends SegmentedLine> list4, final List<? extends Fill> list5, ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Function1<? super Rect, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        Modifier.Companion companion;
        int i12;
        Composer composer2;
        final int i13;
        final Chart<? extends ActionT> chart2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        int i14;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list6 = list3;
        ScrubState scrubState2 = scrubState;
        final Function1<? super Rect, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1329589640);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(chart) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list6) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            z2 = z;
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        } else {
            i5 = 196608;
            z2 = z;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list5) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | ((i3 & 8) == 0 ? composerStartRestartGroup.changed(scrubState2) : composerStartRestartGroup.changedInstance(scrubState2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(verticalAnchor) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(verticalAnchor2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(verticalAnchor3) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        int i15 = i6;
        if ((i4 & 306783379) != 306783378 || (74899 & i15) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1329589640, i4, i15, "com.robinhood.android.sdui.chartgroup.Chart (SduiAdvancedChart.kt:1068)");
            }
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i16 = 458752 & i4;
            int i17 = i4 & 29360128;
            int i18 = i15 & 112;
            int i19 = i15 & 57344;
            boolean zChangedInstance = (i16 == 131072) | (i17 == 8388608) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(list6) | (i18 == 32) | (i19 == 16384);
            int i20 = i15 & 7168;
            boolean z3 = zChangedInstance | (i20 == 2048);
            int i21 = i15 & 896;
            boolean z4 = z3 | (i21 == 256) | ((i4 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i7 = i17;
                i8 = i16;
                i9 = i21;
                i10 = i4;
                final boolean z5 = z2;
                i11 = i18;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                companion = companion2;
                i12 = i15;
                composer2 = composerStartRestartGroup;
                Function1 function13 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.Chart_kiIZU34$lambda$187$lambda$186(z5, i, list2, list6, yAxisLocation, verticalAnchor3, verticalAnchor2, verticalAnchor, f, (ConstrainScope) obj);
                    }
                };
                i13 = i;
                list6 = list6;
                composer2.updateRememberedValue(function13);
                objRememberedValue = function13;
            } else {
                i7 = i17;
                i8 = i16;
                i9 = i21;
                i10 = i4;
                i11 = i18;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                companion = companion2;
                i12 = i15;
                i13 = i;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue), composer2, 0);
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope43 = list.get(i13);
            composer2.startReplaceGroup(-1224400529);
            chart2 = chart;
            boolean zChanged = composer2.changed(constraintLayoutBaseScope4) | (i8 == 131072) | composer2.changedInstance(list6) | (i7 == 8388608) | (i11 == 32) | (i19 == 16384) | (i20 == 2048) | (i9 == 256) | composer2.changedInstance(chart2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope4;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                i14 = 131072;
                Function1 function14 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.Chart_kiIZU34$lambda$189$lambda$188(constraintLayoutBaseScope44, z, list6, i13, yAxisLocation, verticalAnchor3, verticalAnchor2, verticalAnchor, chart2, (ConstrainScope) obj);
                    }
                };
                composer2.updateRememberedValue(function14);
                objRememberedValue2 = function14;
            } else {
                constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                i14 = 131072;
            }
            composer2.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2);
            composer2.startReplaceGroup(5004770);
            boolean z6 = (i12 & 458752) == i14;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function12 = function1;
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.Chart_kiIZU34$lambda$191$lambda$190(function12, (LayoutCoordinates) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                function12 = function1;
            }
            composer2.endReplaceGroup();
            Modifier modifierClipToBounds = Clip.clipToBounds(OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue3));
            List<? extends Fill> list7 = list5;
            Point point = scrubState != null && i13 == scrubState.getChartIndex$lib_sdui_charts_externalRelease() ? scrubState.getPoint() : null;
            ScrubLineType scrubLineType = ScrubLineType.SCRUBBING_DISABLED;
            int i22 = Point.$stable;
            scrubState2 = scrubState;
            ChartWithOverlays.ChartWithOverlays(modifierClipToBounds, CollectionsKt.plus((Collection) list7, (Iterable) UtilKt.mapSegmentedLinesWithScrubPoint(list4, point, scrubLineType, null, composer2, ((i10 >> 24) & 14) | 384 | (i22 << 3), 8)), CollectionsKt.listOfNotNull(scrubDotOverlay(chart2, i13, scrubState2, composer2, ((i10 >> 3) & 14) | ((i10 >> 18) & 112) | (i22 << 6) | ((i12 << 6) & 896))), 0L, null, null, false, composer2, Overlays.$stable << 6, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i13 = i;
            chart2 = chart;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i23 = i13;
            final Chart<? extends ActionT> chart3 = chart2;
            final ScrubState scrubState3 = scrubState2;
            final Function1<? super Rect, Unit> function15 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.Chart_kiIZU34$lambda$192(constraintLayoutScope, chart3, list, list2, list3, z, f, i23, list4, list5, scrubState3, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, function15, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart_kiIZU34$lambda$187$lambda$186(boolean z, int i, List list, List list2, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, float f, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor start;
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        if (!z) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list2.get(i), 0.0f, 0.0f, 6, null);
        } else if (i != 0) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i - 1)).getBottom(), 0.0f, 0.0f, 6, null);
        } else {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }
        ConstraintScopeCommon6 start2 = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        if (yAxisLocation == yAxisLocation2) {
            start = verticalAnchor == null ? constrainAs.getParent().getStart() : verticalAnchor;
        } else {
            start = verticalAnchor2;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start2, start, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor3;
        } else {
            end = verticalAnchor == null ? constrainAs.getParent().getEnd() : verticalAnchor;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart_kiIZU34$lambda$189$lambda$188(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, boolean z, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Chart chart, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor start;
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Dimension fillToConstraints;
        float fM7995constructorimpl;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        if (!z) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        }
        ConstraintScopeCommon6 start2 = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        if (yAxisLocation == yAxisLocation2) {
            start = verticalAnchor == null ? constrainAs.getParent().getStart() : verticalAnchor;
        } else {
            start = verticalAnchor2;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start2, start, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor3;
        } else {
            end = verticalAnchor == null ? constrainAs.getParent().getEnd() : verticalAnchor;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        if (z) {
            Float weight = chart.getWeight();
            if (weight == null) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(weight.floatValue());
            }
            fillToConstraints = companion.m8160value0680j_4(fM7995constructorimpl);
        } else {
            fillToConstraints = companion.getFillToConstraints();
        }
        constrainAs.setHeight(fillToConstraints);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart_kiIZU34$lambda$191$lambda$190(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        function1.invoke(Rect2.m6565Recttz77jQw(LayoutCoordinates2.positionInParent(coordinates), IntSize2.m8067toSizeozmzZPI(coordinates.mo7241getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProtoChart-osRQHRo, reason: not valid java name */
    public static final void m18579ProtoChartosRQHRo(final ConstraintLayoutScope constraintLayoutScope, ChartDto chartDto, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope4> list2, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3, final boolean z, final float f, final int i, final List<? extends SegmentedLine> list4, final List<? extends Fill> list5, ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Function1<? super Rect, Unit> function1, final AnimationSpec<Float> animationSpec, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        Modifier.Companion companion;
        int i11;
        Composer composer2;
        final int i12;
        final ChartDto chartDto2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        int i13;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list6 = list3;
        ScrubState scrubState2 = scrubState;
        final Function1<? super Rect, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1693422890);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(chartDto) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list6) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z2 = z;
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list5) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? composerStartRestartGroup.changed(scrubState2) : composerStartRestartGroup.changedInstance(scrubState2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(verticalAnchor) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(verticalAnchor2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(verticalAnchor3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(animationSpec) ? 1048576 : 524288;
        }
        int i14 = i5;
        if ((i4 & 306783379) != 306783378 || (599187 & i14) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1693422890, i4, i14, "com.robinhood.android.sdui.chartgroup.ProtoChart (SduiAdvancedChart.kt:1158)");
            }
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i15 = 458752 & i4;
            int i16 = i4 & 29360128;
            int i17 = i14 & 112;
            int i18 = i14 & 57344;
            boolean zChangedInstance = (i15 == 131072) | (i16 == 8388608) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(list6) | (i17 == 32) | (i18 == 16384);
            int i19 = i14 & 7168;
            boolean z3 = zChangedInstance | (i19 == 2048);
            int i20 = i14 & 896;
            boolean z4 = z3 | (i20 == 256) | ((i4 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i6 = i16;
                i7 = i15;
                i8 = i20;
                i9 = i4;
                final boolean z5 = z2;
                i10 = i17;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                companion = companion2;
                i11 = i14;
                composer2 = composerStartRestartGroup;
                Function1 function13 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.ProtoChart_osRQHRo$lambda$194$lambda$193(z5, i, list2, list6, yAxisLocation, verticalAnchor3, verticalAnchor2, verticalAnchor, f, (ConstrainScope) obj);
                    }
                };
                i12 = i;
                list6 = list6;
                composer2.updateRememberedValue(function13);
                objRememberedValue = function13;
            } else {
                i6 = i16;
                i7 = i15;
                i8 = i20;
                i9 = i4;
                i10 = i17;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                companion = companion2;
                i11 = i14;
                i12 = i;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue), composer2, 0);
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope43 = list.get(i12);
            composer2.startReplaceGroup(-1224400529);
            chartDto2 = chartDto;
            boolean zChanged = composer2.changed(constraintLayoutBaseScope4) | (i7 == 131072) | composer2.changedInstance(list6) | (i6 == 8388608) | (i10 == 32) | (i18 == 16384) | (i19 == 2048) | (i8 == 256) | composer2.changedInstance(chartDto2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope4;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                i13 = 131072;
                Function1 function14 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda69
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.ProtoChart_osRQHRo$lambda$196$lambda$195(constraintLayoutBaseScope44, z, list6, i12, yAxisLocation, verticalAnchor3, verticalAnchor2, verticalAnchor, chartDto2, (ConstrainScope) obj);
                    }
                };
                composer2.updateRememberedValue(function14);
                objRememberedValue2 = function14;
            } else {
                constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                i13 = 131072;
            }
            composer2.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2);
            composer2.startReplaceGroup(5004770);
            boolean z6 = (i11 & 458752) == i13;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function12 = function1;
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.ProtoChart_osRQHRo$lambda$198$lambda$197(function12, (LayoutCoordinates) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                function12 = function1;
            }
            composer2.endReplaceGroup();
            Modifier modifierClipToBounds = Clip.clipToBounds(OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue3));
            List<? extends Fill> list7 = list5;
            Point point = scrubState != null && i12 == scrubState.getChartIndex$lib_sdui_charts_externalRelease() ? scrubState.getPoint() : null;
            ScrubLineType scrubLineType = ScrubLineType.SCRUBBING_DISABLED;
            int i21 = Point.$stable;
            scrubState2 = scrubState;
            ChartWithOverlays.ChartWithOverlays(modifierClipToBounds, CollectionsKt.plus((Collection) list7, (Iterable) UtilKt.mapSegmentedLinesWithScrubPoint(list4, point, scrubLineType, animationSpec, composer2, ((i9 >> 24) & 14) | 384 | (i21 << 3) | ((i11 >> 9) & 7168), 0)), CollectionsKt.listOfNotNull(protoScrubDotOverlay(chartDto2, i12, scrubState2, composer2, ((i9 >> 3) & 14) | ((i9 >> 18) & 112) | (i21 << 6) | ((i11 << 6) & 896))), 0L, null, null, false, composer2, Overlays.$stable << 6, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i12 = i;
            chartDto2 = chartDto;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i22 = i12;
            final ChartDto chartDto3 = chartDto2;
            final ScrubState scrubState3 = scrubState2;
            final Function1<? super Rect, Unit> function15 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChart_osRQHRo$lambda$199(constraintLayoutScope, chartDto3, list, list2, list3, z, f, i22, list4, list5, scrubState3, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, function15, animationSpec, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChart_osRQHRo$lambda$194$lambda$193(boolean z, int i, List list, List list2, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, float f, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor start;
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        if (!z) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list2.get(i), 0.0f, 0.0f, 6, null);
        } else if (i != 0) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i - 1)).getBottom(), 0.0f, 0.0f, 6, null);
        } else {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }
        ConstraintScopeCommon6 start2 = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        if (yAxisLocation == yAxisLocation2) {
            start = verticalAnchor == null ? constrainAs.getParent().getStart() : verticalAnchor;
        } else {
            start = verticalAnchor2;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start2, start, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor3;
        } else {
            end = verticalAnchor == null ? constrainAs.getParent().getEnd() : verticalAnchor;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChart_osRQHRo$lambda$196$lambda$195(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, boolean z, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, ChartDto chartDto, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor start;
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Dimension fillToConstraints;
        float fM7995constructorimpl;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        if (!z) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        }
        ConstraintScopeCommon6 start2 = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        if (yAxisLocation == yAxisLocation2) {
            start = verticalAnchor == null ? constrainAs.getParent().getStart() : verticalAnchor;
        } else {
            start = verticalAnchor2;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start2, start, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor3;
        } else {
            end = verticalAnchor == null ? constrainAs.getParent().getEnd() : verticalAnchor;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        if (z) {
            Float weight = chartDto.getWeight();
            if (weight == null) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(weight.floatValue());
            }
            fillToConstraints = companion.m8160value0680j_4(fM7995constructorimpl);
        } else {
            fillToConstraints = companion.getFillToConstraints();
        }
        constrainAs.setHeight(fillToConstraints);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChart_osRQHRo$lambda$198$lambda$197(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        function1.invoke(Rect2.m6565Recttz77jQw(LayoutCoordinates2.positionInParent(coordinates), IntSize2.m8067toSizeozmzZPI(coordinates.mo7241getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartYAxis(final ConstraintLayoutScope constraintLayoutScope, final Axis axis, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope4> list2, final int i, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        int i5;
        Modifier modifier2;
        Composer composer2;
        int i6;
        final YAxisLocation yAxisLocation2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1670694294);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((i3 & 16) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 131072 : 65536;
        }
        if ((i3 & 32) != 0) {
            i4 |= 1572864;
        } else {
            if ((i2 & 1572864) == 0) {
                verticalAnchor3 = verticalAnchor;
                i4 |= composerStartRestartGroup.changed(verticalAnchor3) ? 1048576 : 524288;
            }
            if ((i3 & 64) != 0) {
                if ((i2 & 12582912) == 0) {
                    verticalAnchor4 = verticalAnchor2;
                    i4 |= composerStartRestartGroup.changed(verticalAnchor4) ? 8388608 : 4194304;
                }
                i5 = i3 & 128;
                if (i5 != 0) {
                    i4 |= 100663296;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                }
                if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1670694294, i4, -1, "com.robinhood.android.sdui.chartgroup.ChartYAxis (SduiAdvancedChart.kt:1244)");
                    }
                    if (axis == null) {
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list.get(i);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor4;
                            i6 = i4;
                            yAxisLocation2 = yAxisLocation;
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda80
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.ChartYAxis$lambda$201$lambda$200(list2, i, yAxisLocation2, verticalAnchor3, verticalAnchor5, (ConstrainScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        } else {
                            i6 = i4;
                            yAxisLocation2 = yAxisLocation;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifier2, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                        composerStartRestartGroup.startReplaceGroup(-780514848);
                        float fM21593getSmallD9Ej5fM = yAxisLocation2 == YAxisLocation.END ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-780511582);
                        float fM21593getSmallD9Ej5fM2 = yAxisLocation2 == YAxisLocation.START ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                        composerStartRestartGroup.endReplaceGroup();
                        YAxisLocation yAxisLocation3 = yAxisLocation2;
                        composer2 = composerStartRestartGroup;
                        ChartAxisKt.m18517ChartAxis5S0dGQ(PaddingKt.m5146paddingqDBjuR0$default(modifierConstrainAs, fM21593getSmallD9Ej5fM, 0.0f, fM21593getSmallD9Ej5fM2, 0.0f, 10, null), axis, yAxisLocation3, (TextAlign) null, composer2, (Axis.$stable << 3) | (i6 & 112) | ((i6 >> 9) & 896), 8);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda81
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiAdvancedChartKt.ChartYAxis$lambda$202(constraintLayoutScope, axis, list, list2, i, yAxisLocation, verticalAnchor, verticalAnchor2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 12582912;
            verticalAnchor4 = verticalAnchor2;
            i5 = i3 & 128;
            if (i5 != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (axis == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        verticalAnchor3 = verticalAnchor;
        if ((i3 & 64) != 0) {
        }
        verticalAnchor4 = verticalAnchor2;
        i5 = i3 & 128;
        if (i5 != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartYAxis$lambda$201$lambda$200(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i)).getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), ((ConstraintLayoutBaseScope4) list.get(i)).getBottom(), 0.0f, 0.0f, 6, null);
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 0.0f, 0.0f, yAxisLocation == yAxisLocation2 ? 0.0f : 1.0f, 60, (Object) null);
        constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProtoChartYAxis(final ConstraintLayoutScope constraintLayoutScope, final ProtoAxis protoAxis, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope4> list2, final int i, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        int i5;
        Modifier modifier2;
        Composer composer2;
        int i6;
        final YAxisLocation yAxisLocation2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-802958002);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(protoAxis) : composerStartRestartGroup.changedInstance(protoAxis) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((i3 & 16) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 131072 : 65536;
        }
        if ((i3 & 32) != 0) {
            i4 |= 1572864;
        } else {
            if ((i2 & 1572864) == 0) {
                verticalAnchor3 = verticalAnchor;
                i4 |= composerStartRestartGroup.changed(verticalAnchor3) ? 1048576 : 524288;
            }
            if ((i3 & 64) != 0) {
                if ((i2 & 12582912) == 0) {
                    verticalAnchor4 = verticalAnchor2;
                    i4 |= composerStartRestartGroup.changed(verticalAnchor4) ? 8388608 : 4194304;
                }
                i5 = i3 & 128;
                if (i5 != 0) {
                    i4 |= 100663296;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                }
                if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-802958002, i4, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartYAxis (SduiAdvancedChart.kt:1279)");
                    }
                    if (protoAxis == null) {
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list.get(i);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor4;
                            i6 = i4;
                            yAxisLocation2 = yAxisLocation;
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAdvancedChartKt.ProtoChartYAxis$lambda$204$lambda$203(list2, i, yAxisLocation2, verticalAnchor3, verticalAnchor5, (ConstrainScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        } else {
                            i6 = i4;
                            yAxisLocation2 = yAxisLocation;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifier2, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                        composerStartRestartGroup.startReplaceGroup(1451511000);
                        float fM21593getSmallD9Ej5fM = yAxisLocation2 == YAxisLocation.END ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1451514266);
                        float fM21593getSmallD9Ej5fM2 = yAxisLocation2 == YAxisLocation.START ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                        composerStartRestartGroup.endReplaceGroup();
                        YAxisLocation yAxisLocation3 = yAxisLocation2;
                        composer2 = composerStartRestartGroup;
                        ChartAxisKt.m18518ChartAxis5S0dGQ(PaddingKt.m5146paddingqDBjuR0$default(modifierConstrainAs, fM21593getSmallD9Ej5fM, 0.0f, fM21593getSmallD9Ej5fM2, 0.0f, 10, null), protoAxis, yAxisLocation3, (TextAlign) null, composer2, (ProtoAxis.$stable << 3) | (i6 & 112) | ((i6 >> 9) & 896), 8);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiAdvancedChartKt.ProtoChartYAxis$lambda$205(constraintLayoutScope, protoAxis, list, list2, i, yAxisLocation, verticalAnchor, verticalAnchor2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 12582912;
            verticalAnchor4 = verticalAnchor2;
            i5 = i3 & 128;
            if (i5 != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (protoAxis == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        verticalAnchor3 = verticalAnchor;
        if ((i3 & 64) != 0) {
        }
        verticalAnchor4 = verticalAnchor2;
        i5 = i3 & 128;
        if (i5 != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartYAxis$lambda$204$lambda$203(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i)).getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), ((ConstraintLayoutBaseScope4) list.get(i)).getBottom(), 0.0f, 0.0f, 6, null);
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 0.0f, 0.0f, yAxisLocation == yAxisLocation2 ? 0.0f : 1.0f, 60, (Object) null);
        constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0271  */
    /* renamed from: ChartYAxisScrubLabel-skrPljE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18577ChartYAxisScrubLabelskrPljE(final ConstraintLayoutScope constraintLayoutScope, final Axis axis, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2, final float f, final int i, final ScrubState scrubState, final Float f2, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Composer composer, final int i2, final int i3) {
        int i4;
        float f3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        int i5;
        Composer composer2;
        Object obj;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3;
        int i6;
        Modifier.Companion companion;
        int i7;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        int i8;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        final int i9 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(2145133366);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f3 = f;
            i4 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
        } else {
            f3 = f;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(i9) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= (2097152 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i4 |= composerStartRestartGroup.changed(verticalAnchor3) ? 536870912 : 268435456;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(verticalAnchor2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2145133366, i4, i5, "com.robinhood.android.sdui.chartgroup.ChartYAxisScrubLabel (SduiAdvancedChart.kt:1316)");
            }
            if (axis == null) {
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if ((scrubState != null ? scrubState.getPoint() : null) != null && scrubState.getChartIndex$lib_sdui_charts_externalRelease() == i9) {
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i10 = i4 & 458752;
                    int i11 = i4 & 234881024;
                    int i12 = i4 & 1879048192;
                    int i13 = i5 & 14;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | (i10 == 131072) | (i11 == 67108864) | (i12 == 536870912) | (i13 == 4) | ((i4 & 57344) == 16384);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final float f4 = f3;
                        list3 = list2;
                        i6 = i4;
                        companion = companion2;
                        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor3;
                        i7 = i13;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                        i8 = 67108864;
                        obj = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SduiAdvancedChartKt.ChartYAxisScrubLabel_skrPljE$lambda$207$lambda$206(list3, i9, yAxisLocation, verticalAnchor4, verticalAnchor2, f4, (ConstrainScope) obj2);
                            }
                        };
                        i9 = i9;
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue;
                        i6 = i4;
                        companion = companion2;
                        i7 = i13;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                        i8 = 67108864;
                        list3 = list2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) obj), composerStartRestartGroup, 0);
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope43 = list.get(i9);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged = (i10 == 131072) | composerStartRestartGroup.changed(constraintLayoutBaseScope4) | composerStartRestartGroup.changedInstance(list3) | (i11 == i8) | (i12 == 536870912) | (i7 == 4);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list4 = list3;
                        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope4;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SduiAdvancedChartKt.ChartYAxisScrubLabel_skrPljE$lambda$209$lambda$208(constraintLayoutBaseScope44, list4, i9, yAxisLocation, verticalAnchor, verticalAnchor2, (ConstrainScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    } else {
                        constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    ChartAxisKt.ChartAxisScrubLabel(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2), axis, scrubState.getPoint(), f2, composer2, (Axis.$stable << 3) | (i6 & 112) | (Point.$stable << 6) | ((i6 >> 12) & 7168), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SduiAdvancedChartKt.ChartYAxisScrubLabel_skrPljE$lambda$210(constraintLayoutScope, axis, list, list2, f, i, scrubState, f2, yAxisLocation, verticalAnchor, verticalAnchor2, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartYAxisScrubLabel_skrPljE$lambda$207$lambda$206(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartYAxisScrubLabel_skrPljE$lambda$209$lambda$208(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0271  */
    /* renamed from: ProtoChartYAxisScrubLabel-skrPljE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18580ProtoChartYAxisScrubLabelskrPljE(final ConstraintLayoutScope constraintLayoutScope, final ProtoAxis protoAxis, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2, final float f, final int i, final ScrubState scrubState, final Float f2, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Composer composer, final int i2, final int i3) {
        int i4;
        float f3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        int i5;
        Composer composer2;
        Object obj;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3;
        int i6;
        Modifier.Companion companion;
        int i7;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        int i8;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        final int i9 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(1292207700);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(protoAxis) : composerStartRestartGroup.changedInstance(protoAxis) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f3 = f;
            i4 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
        } else {
            f3 = f;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(i9) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= (2097152 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i4 |= composerStartRestartGroup.changed(verticalAnchor3) ? 536870912 : 268435456;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(verticalAnchor2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292207700, i4, i5, "com.robinhood.android.sdui.chartgroup.ProtoChartYAxisScrubLabel (SduiAdvancedChart.kt:1359)");
            }
            if (protoAxis == null) {
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if ((scrubState != null ? scrubState.getPoint() : null) != null && scrubState.getChartIndex$lib_sdui_charts_externalRelease() == i9) {
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i10 = i4 & 458752;
                    int i11 = i4 & 234881024;
                    int i12 = i4 & 1879048192;
                    int i13 = i5 & 14;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | (i10 == 131072) | (i11 == 67108864) | (i12 == 536870912) | (i13 == 4) | ((i4 & 57344) == 16384);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final float f4 = f3;
                        list3 = list2;
                        i6 = i4;
                        companion = companion2;
                        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor3;
                        i7 = i13;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                        i8 = 67108864;
                        obj = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda85
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SduiAdvancedChartKt.ProtoChartYAxisScrubLabel_skrPljE$lambda$212$lambda$211(list3, i9, yAxisLocation, verticalAnchor4, verticalAnchor2, f4, (ConstrainScope) obj2);
                            }
                        };
                        i9 = i9;
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue;
                        i6 = i4;
                        companion = companion2;
                        i7 = i13;
                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4CreateRef;
                        i8 = 67108864;
                        list3 = list2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) obj), composerStartRestartGroup, 0);
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope43 = list.get(i9);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged = (i10 == 131072) | composerStartRestartGroup.changed(constraintLayoutBaseScope4) | composerStartRestartGroup.changedInstance(list3) | (i11 == i8) | (i12 == 536870912) | (i7 == 4);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list4 = list3;
                        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope4;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda86
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SduiAdvancedChartKt.ProtoChartYAxisScrubLabel_skrPljE$lambda$214$lambda$213(constraintLayoutBaseScope44, list4, i9, yAxisLocation, verticalAnchor, verticalAnchor2, (ConstrainScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    } else {
                        constraintLayoutBaseScope42 = constraintLayoutBaseScope43;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    ChartAxisKt.ChartAxisScrubLabel(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2), protoAxis, scrubState.getPoint(), f2, composer2, (ProtoAxis.$stable << 3) | (i6 & 112) | (Point.$stable << 6) | ((i6 >> 12) & 7168), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda87
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SduiAdvancedChartKt.ProtoChartYAxisScrubLabel_skrPljE$lambda$215(constraintLayoutScope, protoAxis, list, list2, f, i, scrubState, f2, yAxisLocation, verticalAnchor, verticalAnchor2, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartYAxisScrubLabel_skrPljE$lambda$212$lambda$211(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartYAxisScrubLabel_skrPljE$lambda$214$lambda$213(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, yAxisLocation == yAxisLocation2 ? verticalAnchor : constrainAs.getParent().getStart(), yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getEnd() : verticalAnchor2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartGroupXAxis(final ConstraintLayoutScope constraintLayoutScope, final int i, final Axis axis, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final List<ConstraintLayoutBaseScope4> list, final AxisConfig advancedChartGroupState4, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final Function1<? super IntSize, Unit> function1, Composer composer, final int i2) {
        int i3;
        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        Composer composer2;
        Object obj;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1449497993);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(advancedChartGroupState4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i3 |= composerStartRestartGroup.changed(verticalAnchor3) ? 1048576 : 524288;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((12582912 & i2) == 0) {
            verticalAnchor4 = verticalAnchor2;
            i3 |= composerStartRestartGroup.changed(verticalAnchor4) ? 8388608 : 4194304;
        } else {
            verticalAnchor4 = verticalAnchor2;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1449497993, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartGroupXAxis (SduiAdvancedChart.kt:1400)");
            }
            if (axis == null || i <= 0) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(advancedChartGroupState4) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor4;
                    obj = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiAdvancedChartKt.ChartGroupXAxis$lambda$217$lambda$216(list, i, advancedChartGroupState4, verticalAnchor5, verticalAnchor3, (ConstrainScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                    i4 = i3;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                ChartAxisKt.m18517ChartAxis5S0dGQ(OnRemeasuredModifier2.onSizeChanged(PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) obj), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), function1), axis, advancedChartGroupState4.getYAxisLocation(), advancedChartGroupState4.m18512getXAxisTextAlignbuA522U(), composer2, (Axis.$stable << 3) | ((i4 >> 3) & 112), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SduiAdvancedChartKt.ChartGroupXAxis$lambda$218(constraintLayoutScope, i, axis, constraintLayoutBaseScope4, list, advancedChartGroupState4, verticalAnchor, verticalAnchor2, function1, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxis$lambda$217$lambda$216(List list, int i, AxisConfig advancedChartGroupState4, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i - 1)).getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation = advancedChartGroupState4.getYAxisLocation();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), advancedChartGroupState4.getYAxisLocation() == yAxisLocation2 ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProtoChartGroupXAxis(final ConstraintLayoutScope constraintLayoutScope, final int i, final ProtoAxis protoAxis, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final List<ConstraintLayoutBaseScope4> list, final ProtoAxisConfig advancedChartGroupState7, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, final Function1<? super IntSize, Unit> function1, Composer composer, final int i2) {
        int i3;
        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5;
        Composer composer2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2145068858);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(protoAxis) : composerStartRestartGroup.changedInstance(protoAxis) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(advancedChartGroupState7) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            verticalAnchor4 = verticalAnchor;
            i3 |= composerStartRestartGroup.changed(verticalAnchor4) ? 1048576 : 524288;
        } else {
            verticalAnchor4 = verticalAnchor;
        }
        if ((12582912 & i2) == 0) {
            verticalAnchor5 = verticalAnchor2;
            i3 |= composerStartRestartGroup.changed(verticalAnchor5) ? 8388608 : 4194304;
        } else {
            verticalAnchor5 = verticalAnchor2;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(verticalAnchor3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2145068858, i3, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartGroupXAxis (SduiAdvancedChart.kt:1431)");
            }
            if (protoAxis == null || i <= 0) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(advancedChartGroupState7) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor5;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda39
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ProtoChartGroupXAxis$lambda$220$lambda$219(list, i, advancedChartGroupState7, verticalAnchor6, verticalAnchor4, verticalAnchor3, (ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i4 = i3;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                C2002Dp c2002DpM18536getXAxisTopPaddinglTKBWiU = advancedChartGroupState7.m18536getXAxisTopPaddinglTKBWiU();
                composerStartRestartGroup.startReplaceGroup(173175102);
                float fM21590getDefaultD9Ej5fM = c2002DpM18536getXAxisTopPaddinglTKBWiU == null ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM() : c2002DpM18536getXAxisTopPaddinglTKBWiU.getValue();
                composerStartRestartGroup.endReplaceGroup();
                C2002Dp c2002DpM18534getXAxisBottomPaddinglTKBWiU = advancedChartGroupState7.m18534getXAxisBottomPaddinglTKBWiU();
                composerStartRestartGroup.startReplaceGroup(173177889);
                float fM21590getDefaultD9Ej5fM2 = c2002DpM18534getXAxisBottomPaddinglTKBWiU == null ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM() : c2002DpM18534getXAxisBottomPaddinglTKBWiU.getValue();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                ChartAxisKt.m18518ChartAxis5S0dGQ(OnRemeasuredModifier2.onSizeChanged(PaddingKt.m5146paddingqDBjuR0$default(modifierConstrainAs, 0.0f, fM21590getDefaultD9Ej5fM, 0.0f, fM21590getDefaultD9Ej5fM2, 5, null), function1), protoAxis, advancedChartGroupState7.getYAxisPrimaryLocation(), advancedChartGroupState7.m18535getXAxisTextAlignbuA522U(), composer2, (ProtoAxis.$stable << 3) | ((i4 >> 3) & 112), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChartGroupXAxis$lambda$221(constraintLayoutScope, i, protoAxis, constraintLayoutBaseScope4, list, advancedChartGroupState7, verticalAnchor, verticalAnchor2, verticalAnchor3, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupXAxis$lambda$220$lambda$219(List list, int i, ProtoAxisConfig advancedChartGroupState7, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), ((ConstraintLayoutBaseScope4) list.get(i - 1)).getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisPrimaryLocation = advancedChartGroupState7.getYAxisPrimaryLocation();
        YAxisLocation yAxisLocation = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisPrimaryLocation == yAxisLocation ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (advancedChartGroupState7.getYAxisPrimaryLocation() == yAxisLocation) {
            end = verticalAnchor2;
        } else {
            end = verticalAnchor3 == null ? constrainAs.getParent().getEnd() : verticalAnchor3;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartGroupXAxisScrubLabel(final ConstraintLayoutScope constraintLayoutScope, final Axis axis, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, final ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Composer composer, final int i) {
        int i2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-164728396);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope42) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            verticalAnchor4 = verticalAnchor;
            i2 |= composerStartRestartGroup.changed(verticalAnchor4) ? 1048576 : 524288;
        } else {
            verticalAnchor4 = verticalAnchor;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(verticalAnchor2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            verticalAnchor5 = verticalAnchor3;
            i2 |= composerStartRestartGroup.changed(verticalAnchor5) ? 67108864 : 33554432;
        } else {
            verticalAnchor5 = verticalAnchor3;
        }
        if ((i2 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-164728396, i2, -1, "com.robinhood.android.sdui.chartgroup.ChartGroupXAxisScrubLabel (SduiAdvancedChart.kt:1474)");
            }
            if (axis != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean z = ((i2 & 896) == 256) | ((458752 & i2) == 131072) | ((234881024 & i2) == 67108864) | ((29360128 & i2) == 8388608) | ((3670016 & i2) == 1048576);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor4;
                    final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor7 = verticalAnchor5;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda76
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ChartGroupXAxisScrubLabel$lambda$223$lambda$222(constraintLayoutBaseScope4, yAxisLocation, verticalAnchor7, verticalAnchor2, verticalAnchor6, (ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChartAxisKt.ChartAxisScrubLabel(PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), axis, scrubState != null ? scrubState.getPoint() : null, (Float) null, composerStartRestartGroup, (i2 & 112) | (Axis.$stable << 3) | (Point.$stable << 6), 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda77
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartGroupXAxisScrubLabel$lambda$224(constraintLayoutScope, axis, constraintLayoutBaseScope4, constraintLayoutBaseScope42, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxisScrubLabel$lambda$223$lambda$222(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor start;
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constraintLayoutBaseScope4.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (Object) null);
        ConstraintScopeCommon6 start2 = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        if (yAxisLocation == yAxisLocation2) {
            start = verticalAnchor == null ? constrainAs.getParent().getStart() : verticalAnchor;
        } else {
            start = verticalAnchor2;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start2, start, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor3;
        } else {
            end = verticalAnchor == null ? constrainAs.getParent().getEnd() : verticalAnchor;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProtoChartGroupXAxisScrubLabel(final ConstraintLayoutScope constraintLayoutScope, final ProtoAxis protoAxis, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, final ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, Composer composer, final int i) {
        int i2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-230074774);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(protoAxis) : composerStartRestartGroup.changedInstance(protoAxis) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope42) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(verticalAnchor) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(verticalAnchor2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            verticalAnchor4 = verticalAnchor3;
            i2 |= composerStartRestartGroup.changed(verticalAnchor4) ? 67108864 : 33554432;
        } else {
            verticalAnchor4 = verticalAnchor3;
        }
        if ((i2 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-230074774, i2, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartGroupXAxisScrubLabel (SduiAdvancedChart.kt:1511)");
            }
            if (protoAxis != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean z = ((i2 & 896) == 256) | ((458752 & i2) == 131072) | ((29360128 & i2) == 8388608) | ((3670016 & i2) == 1048576) | ((234881024 & i2) == 67108864);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor4;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda78
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ProtoChartGroupXAxisScrubLabel$lambda$226$lambda$225(constraintLayoutBaseScope4, yAxisLocation, verticalAnchor2, verticalAnchor, verticalAnchor5, (ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChartAxisKt.ChartAxisScrubLabel(PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), protoAxis, scrubState != null ? scrubState.getPoint() : null, (Float) null, composerStartRestartGroup, (i2 & 112) | (ProtoAxis.$stable << 3) | (Point.$stable << 6), 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda79
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChartGroupXAxisScrubLabel$lambda$227(constraintLayoutScope, protoAxis, constraintLayoutBaseScope4, constraintLayoutBaseScope42, scrubState, yAxisLocation, verticalAnchor, verticalAnchor2, verticalAnchor3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupXAxisScrubLabel$lambda$226$lambda$225(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope.VerticalAnchor end;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constraintLayoutBaseScope4.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (Object) null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 end2 = constrainAs.getEnd();
        if (yAxisLocation == yAxisLocation2) {
            end = verticalAnchor2;
        } else {
            end = verticalAnchor3 == null ? constrainAs.getParent().getEnd() : verticalAnchor3;
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(end2, end, 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartLegends(final ConstraintLayoutScope constraintLayoutScope, final List<LegendList> list, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2, final int i, final List<ConstraintLayoutBaseScope4> list3, final ScrubState scrubState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1736885075);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1736885075, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartLegends (SduiAdvancedChart.kt:1544)");
            }
            if (scrubState != null) {
                float x = scrubState.getPoint().getX();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.ChartLegends$lambda$229$lambda$228((LegendList) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LegendList legendList = (LegendList) UtilKt.getClosestItemByValue(list, x, (Function1) objRememberedValue);
                if (legendList != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list3.get(i);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ChartLegends$lambda$231$lambda$230(list2, i, (ConstrainScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartLegend.AdvancedChartLegends(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4, (Function1) objRememberedValue2), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), legendList, false, 2, composerStartRestartGroup, 3456, 0);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartLegends$lambda$232(constraintLayoutScope, list, list2, i, list3, scrubState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChartLegends$lambda$229$lambda$228(LegendList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartLegends$lambda$231$lambda$230(List list, int i, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setHeight(companion.getWrapContent());
        constrainAs.setWidth(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProtoChartLegends(final ConstraintLayoutScope constraintLayoutScope, final ImmutableList<ProtoLegendList> immutableList, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list, final int i, final List<ConstraintLayoutBaseScope4> list2, final ScrubState scrubState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120590403);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120590403, i3, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartLegends (SduiAdvancedChart.kt:1573)");
            }
            if (scrubState != null) {
                float x = scrubState.getPoint().getX();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda82
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.ProtoChartLegends$lambda$234$lambda$233((ProtoLegendList) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ProtoLegendList chartLegend3 = (ProtoLegendList) UtilKt.getClosestItemByValue(immutableList, x, (Function1) objRememberedValue);
                if (chartLegend3 != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list2.get(i);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda83
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ProtoChartLegends$lambda$236$lambda$235(list, i, (ConstrainScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartLegend.ProtoAdvancedChartLegends(chartLegend3, false, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4, (Function1) objRememberedValue2), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 2, composerStartRestartGroup, 3120, 0);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda84
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChartLegends$lambda$237(constraintLayoutScope, immutableList, list, i, list2, scrubState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProtoChartLegends$lambda$234$lambda$233(ProtoLegendList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartLegends$lambda$236$lambda$235(List list, int i, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setHeight(companion.getWrapContent());
        constrainAs.setWidth(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartTitle(final ConstraintLayoutScope constraintLayoutScope, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2, final int i, final ScrubState scrubState, final RichText richText, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-288967074);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(richText) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288967074, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartTitle (SduiAdvancedChart.kt:1602)");
            }
            if (scrubState != null || richText == null) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list.get(i);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda66
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ChartTitle$lambda$239$lambda$238(list2, i, (ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoRichText.m15949BentoRichText0sCZWFg(richText, PaddingKt.m5143paddingVpY3zN4(modifierConstrainAs, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer2, (i3 >> 15) & 14, 1016);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartTitle$lambda$240(constraintLayoutScope, list, list2, i, scrubState, richText, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTitle$lambda$239$lambda$238(List list, int i, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProtoChartTitle(final ConstraintLayoutScope constraintLayoutScope, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2, final int i, final ScrubState scrubState, final TextDto textDto, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-195641573);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(textDto) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195641573, i3, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartTitle (SduiAdvancedChart.kt:1627)");
            }
            if (scrubState == null && textDto != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list.get(i);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda64
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ProtoChartTitle$lambda$242$lambda$241(list2, i, (ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                SduiText2.SduiText(textDto, PaddingKt.m5143paddingVpY3zN4(modifierConstrainAs, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, (i3 >> 15) & 14, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChartTitle$lambda$243(constraintLayoutScope, list, list2, i, scrubState, textDto, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartTitle$lambda$242$lambda$241(List list, int i, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8130linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartGroupLegends(final ConstraintLayoutScope constraintLayoutScope, final List<LegendList> list, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final ScrubState scrubState, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(159098718);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(159098718, i2, -1, "com.robinhood.android.sdui.chartgroup.ChartGroupLegends (SduiAdvancedChart.kt:1650)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (scrubState != null) {
                float x = scrubState.getPoint().getX();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda59
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.ChartGroupLegends$lambda$248$lambda$247((LegendList) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                LegendList legendList = (LegendList) UtilKt.getClosestItemByValue(list, x, (Function1) objRememberedValue2);
                if (legendList != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ChartGroupLegends$lambda$250$lambda$249((ConstrainScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda61
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ChartGroupLegends$lambda$252$lambda$251(snapshotIntState2, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = (i2 & 57344) == 16384;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda62
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ChartGroupLegends$lambda$254$lambda$253(f, snapshotIntState2, (Density) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartLegend.AdvancedChartLegends(OffsetKt.offset(modifierOnGloballyPositioned, (Function1) objRememberedValue5), legendList, true, 0, composerStartRestartGroup, 384, 8);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartGroupLegends$lambda$255(constraintLayoutScope, list, constraintLayoutBaseScope4, scrubState, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChartGroupLegends$lambda$248$lambda$247(LegendList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupLegends$lambda$250$lambda$249(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setHeight(companion.getWrapContent());
        constrainAs.setWidth(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupLegends$lambda$252$lambda$251(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ChartGroupLegends$lambda$254$lambda$253(float f, SnapshotIntState2 snapshotIntState2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((0 << 32) | (((int) ((f - 1) * snapshotIntState2.getIntValue())) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProtoChartGroupLegends(final ConstraintLayoutScope constraintLayoutScope, final ImmutableList<ProtoLegendList> immutableList, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final ScrubState scrubState, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1170648298);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170648298, i2, -1, "com.robinhood.android.sdui.chartgroup.ProtoChartGroupLegends (SduiAdvancedChart.kt:1687)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (scrubState != null) {
                float x = scrubState.getPoint().getX();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SduiAdvancedChartKt.ProtoChartGroupLegends$lambda$260$lambda$259((ProtoLegendList) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ProtoLegendList chartLegend3 = (ProtoLegendList) UtilKt.getClosestItemByValue(immutableList, x, (Function1) objRememberedValue2);
                if (chartLegend3 != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ProtoChartGroupLegends$lambda$262$lambda$261((ConstrainScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ProtoChartGroupLegends$lambda$264$lambda$263(snapshotIntState2, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = (i2 & 57344) == 16384;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiAdvancedChartKt.ProtoChartGroupLegends$lambda$266$lambda$265(f, snapshotIntState2, (Density) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartLegend.ProtoAdvancedChartLegends(chartLegend3, true, OffsetKt.offset(modifierOnGloballyPositioned, (Function1) objRememberedValue5), 0, composerStartRestartGroup, 48, 8);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ProtoChartGroupLegends$lambda$267(constraintLayoutScope, immutableList, constraintLayoutBaseScope4, scrubState, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProtoChartGroupLegends$lambda$260$lambda$259(ProtoLegendList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupLegends$lambda$262$lambda$261(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, (Object) null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setHeight(companion.getWrapContent());
        constrainAs.setWidth(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoChartGroupLegends$lambda$264$lambda$263(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ProtoChartGroupLegends$lambda$266$lambda$265(float f, SnapshotIntState2 snapshotIntState2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((0 << 32) | (((int) ((f - 1) * snapshotIntState2.getIntValue())) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartGroupScrubLines-Liby8ZU, reason: not valid java name */
    public static final void m18576ChartGroupScrubLinesLiby8ZU(final ConstraintLayoutScope constraintLayoutScope, final ScrubConfig scrubConfig, final long j, final Rect rect, final float f, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final float f2, Composer composer, final int i) {
        int i2;
        float f3;
        float f4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2124754984);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(scrubConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(rect) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f;
            i2 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
        } else {
            f3 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            i2 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
        } else {
            f4 = f2;
        }
        if ((i2 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2124754984, i2, -1, "com.robinhood.android.sdui.chartgroup.ChartGroupScrubLines (SduiAdvancedChart.kt:1730)");
            }
            if (rect != null) {
                final long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), scrubConfig.getPathEffect(), 2, null);
                composerStartRestartGroup.startReplaceGroup(-1780052248);
                final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(getScrubLineBottomPadding(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda56
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ChartGroupScrubLines_Liby8ZU$lambda$271$lambda$270((ConstrainScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | composerStartRestartGroup.changedInstance(scrubConfig) | composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changedInstance(stroke) | ((i2 & 57344) == 16384) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                    final float f5 = f3;
                    final float f6 = f4;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda57
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAdvancedChartKt.ChartGroupScrubLines_Liby8ZU$lambda$275$lambda$274(rect, j, f6, scrubConfig, jM21425getFg0d7_KjU, stroke, f5, fMo5016toPx0680j_4, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierConstrainAs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartGroupScrubLines_Liby8ZU$lambda$276(constraintLayoutScope, scrubConfig, j, rect, f, constraintLayoutBaseScope4, f2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupScrubLines_Liby8ZU$lambda$271$lambda$270(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    private static final <ActionT extends Parcelable> Overlays scrubDotOverlay(Chart<? extends ActionT> chart, int i, ScrubState scrubState, Composer composer, int i2) {
        Object next;
        composer.startReplaceGroup(1092689238);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1092689238, i2, -1, "com.robinhood.android.sdui.chartgroup.scrubDotOverlay (SduiAdvancedChart.kt:1798)");
        }
        if (scrubState == null || scrubState.getChartIndex$lib_sdui_charts_externalRelease() != i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Iterator<T> it = chart.getLines().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Line) next).is_primary()) {
                break;
            }
        }
        Line line = (Line) next;
        if (line == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        List<Segment> segments = line.getSegments();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : segments) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<com.robinhood.models.serverdriven.experimental.api.Point> points = ((Segment) obj).getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            Iterator<T> it2 = points.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Tuples4.m3642to((com.robinhood.models.serverdriven.experimental.api.Point) it2.next(), Integer.valueOf(i3)));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
            i3 = i4;
        }
        float x = scrubState.getPoint().getX();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Float.valueOf(SduiAdvancedChartKt.scrubDotOverlay$lambda$281$lambda$280((Tuples2) obj2));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Tuples2 tuples2 = (Tuples2) UtilKt.getClosestItemByValue(arrayList, x, (Function1) objRememberedValue);
        if (tuples2 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        com.robinhood.models.serverdriven.experimental.api.Point point = (com.robinhood.models.serverdriven.experimental.api.Point) tuples2.component1();
        final long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(line.getSegments().get(((Number) tuples2.component2()).intValue()).getStyles().getDefault().getColor(), 0L, composer, 0, 1);
        Overlays overlays = new Overlays(new OverlayPosition(new Point(point.getX(), point.getY()), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.CENTER), false, false, ComposableLambda3.rememberComposableLambda(1014182582, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt.scrubDotOverlay.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1014182582, i5, -1, "com.robinhood.android.sdui.chartgroup.scrubDotOverlay.<anonymous> (SduiAdvancedChart.kt:1817)");
                }
                BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(8)), jM18896toComposeColorDefaultediJQMabo, RoundedCornerShape2.getCircleShape()), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrubDotOverlay$lambda$281$lambda$280(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((com.robinhood.models.serverdriven.experimental.api.Point) it.getFirst()).getX();
    }

    private static final Overlays protoScrubDotOverlay(ChartDto chartDto, int i, ScrubState scrubState, Composer composer, int i2) {
        Object next;
        StyleDto styleDto;
        composer.startReplaceGroup(-1053577531);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1053577531, i2, -1, "com.robinhood.android.sdui.chartgroup.protoScrubDotOverlay (SduiAdvancedChart.kt:1831)");
        }
        ThemedColorDto color = null;
        if (scrubState == null || scrubState.getChartIndex$lib_sdui_charts_externalRelease() != i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Iterator<T> it = chartDto.getLines().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LineDto) next).is_primary()) {
                break;
            }
        }
        LineDto lineDto = (LineDto) next;
        if (lineDto == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        List<SegmentDto> segments = lineDto.getSegments();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : segments) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<PointDto> points = ((SegmentDto) obj).getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            Iterator<T> it2 = points.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Tuples4.m3642to((PointDto) it2.next(), Integer.valueOf(i3)));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
            i3 = i4;
        }
        float x = scrubState.getPoint().getX();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Float.valueOf(SduiAdvancedChartKt.protoScrubDotOverlay$lambda$286$lambda$285((Tuples2) obj2));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Tuples2 tuples2 = (Tuples2) UtilKt.getClosestItemByValue(arrayList, x, (Function1) objRememberedValue);
        if (tuples2 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        PointDto pointDto = (PointDto) tuples2.component1();
        StylesWithStatesDto styles = lineDto.getSegments().get(((Number) tuples2.component2()).intValue()).getStyles();
        if (styles != null && (styleDto = styles.getDefault()) != null) {
            color = styleDto.getColor();
        }
        final long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(color, 0L, composer, 0, 1);
        Overlays overlays = new Overlays(new OverlayPosition(new Point(pointDto.getX(), pointDto.getY()), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.CENTER), false, false, ComposableLambda3.rememberComposableLambda(-2125831131, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt.protoScrubDotOverlay.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2125831131, i5, -1, "com.robinhood.android.sdui.chartgroup.protoScrubDotOverlay.<anonymous> (SduiAdvancedChart.kt:1850)");
                }
                BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(8)), jM18897toComposeColorDefaultediJQMabo, RoundedCornerShape2.getCircleShape()), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float protoScrubDotOverlay$lambda$286$lambda$285(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((PointDto) it.getFirst()).getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScrubDot-_-WMjBM, reason: not valid java name */
    public static final <ActionT extends Parcelable> void m18582ScrubDot_WMjBM(final ConstraintLayoutScope constraintLayoutScope, Chart<? extends ActionT> chart, final int i, final float f, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Composer composer, final int i2) {
        int i3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        Object obj;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2;
        int i4;
        int i5;
        Modifier.Companion companion;
        int i6;
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        Chart<? extends ActionT> chart2;
        final ScrubState scrubState2;
        Composer composer2;
        final int i7 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(807102343);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chart) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i3 |= composerStartRestartGroup.changed(verticalAnchor3) ? 67108864 : 33554432;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(verticalAnchor2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807102343, i3, -1, "com.robinhood.android.sdui.chartgroup.ScrubDot (SduiAdvancedChart.kt:1870)");
            }
            final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i8 = i3 & 896;
            int i9 = i3 & 29360128;
            int i10 = 1879048192 & i3;
            int i11 = i3 & 234881024;
            boolean zChangedInstance = (i9 == 8388608) | composerStartRestartGroup.changedInstance(list) | (i8 == 256) | (i10 == 536870912) | (i11 == 67108864) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                list2 = list;
                i4 = i3;
                i5 = i10;
                companion = companion2;
                i6 = -1224400529;
                final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor3;
                obj = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SduiAdvancedChartKt.ScrubDot___WMjBM$lambda$288$lambda$287(list2, i7, yAxisLocation, verticalAnchor2, verticalAnchor4, f, (ConstrainScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
                i4 = i3;
                i5 = i10;
                companion = companion2;
                i6 = -1224400529;
                list2 = list;
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4CreateRef, (Function1) obj), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(i6);
            boolean zChanged = composerStartRestartGroup.changed(constraintLayoutBaseScope4CreateRef) | composerStartRestartGroup.changedInstance(list2) | (i8 == 256) | (i9 == 8388608) | (i5 == 536870912) | (i11 == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3 = list2;
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SduiAdvancedChartKt.ScrubDot___WMjBM$lambda$290$lambda$289(constraintLayoutBaseScope4CreateRef, list3, i, yAxisLocation, verticalAnchor2, verticalAnchor, (ConstrainScope) obj2);
                    }
                };
                i7 = i;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i7 = i;
            }
            composerStartRestartGroup.endReplaceGroup();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
            chart2 = chart;
            scrubState2 = scrubState;
            composer2 = composerStartRestartGroup;
            ChartWithOverlays.ChartWithOverlays(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2), CollectionsKt.emptyList(), CollectionsKt.listOfNotNull(scrubDotOverlay(chart2, i7, scrubState2, composerStartRestartGroup, ((i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (Point.$stable << 6) | ((i4 >> 12) & 896))), 0L, null, null, false, composer2, (Overlays.$stable << 6) | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
            chart2 = chart;
            scrubState2 = scrubState;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Chart<? extends ActionT> chart3 = chart2;
            final int i12 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SduiAdvancedChartKt.ScrubDot___WMjBM$lambda$291(constraintLayoutScope, chart3, i12, f, list, constraintLayoutBaseScope42, scrubState2, yAxisLocation, verticalAnchor, verticalAnchor2, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrubDot___WMjBM$lambda$288$lambda$287(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrubDot___WMjBM$lambda$290$lambda$289(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProtoScrubDot-_-WMjBM, reason: not valid java name */
    public static final void m18581ProtoScrubDot_WMjBM(final ConstraintLayoutScope constraintLayoutScope, ChartDto chartDto, final int i, final float f, final List<ConstraintLayoutBaseScope.HorizontalAnchor> list, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ScrubState scrubState, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Composer composer, final int i2) {
        int i3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        Object obj;
        final List<ConstraintLayoutBaseScope.HorizontalAnchor> list2;
        int i4;
        int i5;
        Modifier.Companion companion;
        int i6;
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ChartDto chartDto2;
        final ScrubState scrubState2;
        Composer composer2;
        final int i7 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1603212464);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartDto) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i3 |= composerStartRestartGroup.changed(verticalAnchor3) ? 67108864 : 33554432;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(verticalAnchor2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1603212464, i3, -1, "com.robinhood.android.sdui.chartgroup.ProtoScrubDot (SduiAdvancedChart.kt:1908)");
            }
            final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = constraintLayoutScope.createRef();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i8 = i3 & 896;
            int i9 = i3 & 29360128;
            int i10 = 1879048192 & i3;
            int i11 = i3 & 234881024;
            boolean zChangedInstance = (i9 == 8388608) | composerStartRestartGroup.changedInstance(list) | (i8 == 256) | (i10 == 536870912) | (i11 == 67108864) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                list2 = list;
                i4 = i3;
                i5 = i10;
                companion = companion2;
                i6 = -1224400529;
                final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4 = verticalAnchor3;
                obj = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SduiAdvancedChartKt.ProtoScrubDot___WMjBM$lambda$293$lambda$292(list2, i7, yAxisLocation, verticalAnchor2, verticalAnchor4, f, (ConstrainScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
                i4 = i3;
                i5 = i10;
                companion = companion2;
                i6 = -1224400529;
                list2 = list;
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4CreateRef, (Function1) obj), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(i6);
            boolean zChanged = composerStartRestartGroup.changed(constraintLayoutBaseScope4CreateRef) | composerStartRestartGroup.changedInstance(list2) | (i8 == 256) | (i9 == 8388608) | (i5 == 536870912) | (i11 == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final List<ConstraintLayoutBaseScope.HorizontalAnchor> list3 = list2;
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SduiAdvancedChartKt.ProtoScrubDot___WMjBM$lambda$295$lambda$294(constraintLayoutBaseScope4CreateRef, list3, i, yAxisLocation, verticalAnchor2, verticalAnchor, (ConstrainScope) obj2);
                    }
                };
                i7 = i;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i7 = i;
            }
            composerStartRestartGroup.endReplaceGroup();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
            chartDto2 = chartDto;
            scrubState2 = scrubState;
            composer2 = composerStartRestartGroup;
            ChartWithOverlays.ChartWithOverlays(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope42, (Function1) objRememberedValue2), CollectionsKt.emptyList(), CollectionsKt.listOfNotNull(protoScrubDotOverlay(chartDto2, i7, scrubState2, composerStartRestartGroup, ((i4 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (Point.$stable << 6) | ((i4 >> 12) & 896))), 0L, null, null, false, composer2, (Overlays.$stable << 6) | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
            chartDto2 = chartDto;
            scrubState2 = scrubState;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ChartDto chartDto3 = chartDto2;
            final int i12 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SduiAdvancedChartKt.ProtoScrubDot___WMjBM$lambda$296(constraintLayoutScope, chartDto3, i12, f, list, constraintLayoutBaseScope42, scrubState2, yAxisLocation, verticalAnchor, verticalAnchor2, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoScrubDot___WMjBM$lambda$293$lambda$292(List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.m8160value0680j_4(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoScrubDot___WMjBM$lambda$295$lambda$294(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List list, int i, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), (ConstraintLayoutBaseScope.HorizontalAnchor) list.get(i + 1), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        YAxisLocation yAxisLocation2 = YAxisLocation.END;
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, yAxisLocation == yAxisLocation2 ? constrainAs.getParent().getStart() : verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), yAxisLocation == yAxisLocation2 ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        Dimension.Companion companion = Dimension.INSTANCE;
        constrainAs.setWidth(companion.getFillToConstraints());
        constrainAs.setHeight(companion.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* renamed from: DividerLine-iJQMabo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m18578DividerLineiJQMabo(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(693775806);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    j = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    i3 &= -113;
                }
                int i5 = i3;
                Modifier modifier3 = modifier;
                long j3 = j;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(693775806, i5, -1, "com.robinhood.android.sdui.chartgroup.DividerLine (SduiAdvancedChart.kt:1940)");
                }
                Divider5.m5851HorizontalDivider9IZ8Weo(modifier3, C2002Dp.m7995constructorimpl(1), j3, composerStartRestartGroup, (i5 & 14) | 48 | ((i5 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j2 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                int i52 = i3;
                Modifier modifier32 = modifier;
                long j32 = j;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Divider5.m5851HorizontalDivider9IZ8Weo(modifier32, C2002Dp.m7995constructorimpl(1), j32, composerStartRestartGroup, (i52 & 14) | 48 | ((i52 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                j2 = j32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.DividerLine_iJQMabo$lambda$297(modifier2, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartGroupXAxisBottomDivider(final ConstraintLayoutScope constraintLayoutScope, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2012169264);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope42) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2012169264, i2, -1, "com.robinhood.android.sdui.chartgroup.ChartGroupXAxisBottomDivider (SduiAdvancedChart.kt:1953)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.ChartGroupXAxisBottomDivider$lambda$299$lambda$298(constraintLayoutBaseScope42, z, (ConstrainScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            m18578DividerLineiJQMabo(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda91
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartGroupXAxisBottomDivider$lambda$300(constraintLayoutScope, constraintLayoutBaseScope4, constraintLayoutBaseScope42, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGroupXAxisBottomDivider$lambda$299$lambda$298(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, boolean z, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope9 invisible;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, constraintLayoutBaseScope4.getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 60, (Object) null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        if (z) {
            invisible = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        } else {
            invisible = ConstraintLayoutBaseScope9.INSTANCE.getInvisible();
        }
        constrainAs.setVisibility(invisible);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartBottomDivider(final ConstraintLayoutScope constraintLayoutScope, final List<ConstraintLayoutBaseScope4> list, final List<ConstraintLayoutBaseScope4> list2, int i, final AdvancedChartGroupState5 advancedChartGroupState5, final YAxisLocation yAxisLocation, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, Composer composer, final int i2) {
        int i3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        long jM21427getFg30d7_KjU;
        Composer composer2;
        final int i4 = i;
        Composer composerStartRestartGroup = composer.startRestartGroup(714941666);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(advancedChartGroupState5.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            verticalAnchor3 = verticalAnchor;
            i3 |= composerStartRestartGroup.changed(verticalAnchor3) ? 1048576 : 524288;
        } else {
            verticalAnchor3 = verticalAnchor;
        }
        if ((12582912 & i2) == 0) {
            verticalAnchor4 = verticalAnchor2;
            i3 |= composerStartRestartGroup.changed(verticalAnchor4) ? 8388608 : 4194304;
        } else {
            verticalAnchor4 = verticalAnchor2;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(714941666, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartBottomDivider (SduiAdvancedChart.kt:1978)");
            }
            boolean z = advancedChartGroupState5 == AdvancedChartGroupState5.CONSTRAINED;
            Modifier.Companion companion = Modifier.INSTANCE;
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = list.get(i4);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changed(z) | ((458752 & i3) == 131072) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576) | ((i3 & 57344) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final boolean z2 = z;
                final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor5 = verticalAnchor4;
                final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor6 = verticalAnchor3;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAdvancedChartKt.ChartBottomDivider$lambda$302$lambda$301(list2, i4, z2, yAxisLocation, verticalAnchor5, verticalAnchor6, advancedChartGroupState5, (ConstrainScope) obj);
                    }
                };
                i4 = i4;
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
            if (i4 == list2.size() - 1) {
                composerStartRestartGroup.startReplaceGroup(85817523);
                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(85868115);
                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            m18578DividerLineiJQMabo(modifierConstrainAs, jM21427getFg30d7_KjU, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAdvancedChartKt.ChartBottomDivider$lambda$303(constraintLayoutScope, list, list2, i4, advancedChartGroupState5, yAxisLocation, verticalAnchor, verticalAnchor2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartBottomDivider$lambda$302$lambda$301(List list, int i, boolean z, YAxisLocation yAxisLocation, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, AdvancedChartGroupState5 advancedChartGroupState5, ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope9 visible;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstrainScope.m8129linkTo8ZKsbrE$default(constrainAs, ((ConstraintLayoutBaseScope4) list.get(i)).getTop(), ((ConstraintLayoutBaseScope4) list.get(i)).getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 60, (Object) null);
        ConstraintScopeCommon6 start = constrainAs.getStart();
        if (!z || yAxisLocation != YAxisLocation.START) {
            verticalAnchor = constrainAs.getParent().getStart();
        }
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(start, verticalAnchor, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), (z && yAxisLocation == YAxisLocation.END) ? verticalAnchor2 : constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
        if (advancedChartGroupState5 == AdvancedChartGroupState5.NONE) {
            visible = ConstraintLayoutBaseScope9.INSTANCE.getInvisible();
        } else {
            visible = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        }
        constrainAs.setVisibility(visible);
        return Unit.INSTANCE;
    }

    private static final Point coerceInsideWindow(Point point) {
        return new Point(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(point.getX(), 0.0f), 1.0f), RangesKt.coerceAtMost(RangesKt.coerceAtLeast(point.getY(), 0.0f), 1.0f));
    }

    private static final List<Offset> cornerOffsets(Rect rect) {
        return CollectionsKt.listOf((Object[]) new Offset[]{Offset.m6534boximpl(rect.m6560getTopLeftF1C5BW0()), Offset.m6534boximpl(rect.m6561getTopRightF1C5BW0()), Offset.m6534boximpl(rect.m6556getBottomLeftF1C5BW0()), Offset.m6534boximpl(rect.m6557getBottomRightF1C5BW0())});
    }

    /* renamed from: distanceToEdge-Uv8p0NA, reason: not valid java name */
    private static final Float m18592distanceToEdgeUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        if (left <= fIntBitsToFloat && fIntBitsToFloat <= right) {
            int i2 = (int) (j & 4294967295L);
            return Float.valueOf(Float.min(Math.abs(rect.getTop() - Float.intBitsToFloat(i2)), Math.abs(rect.getBottom() - Float.intBitsToFloat(i2))));
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (top > fIntBitsToFloat2 || fIntBitsToFloat2 > bottom) {
            return null;
        }
        return Float.valueOf(Float.min(Math.abs(rect.getLeft() - Float.intBitsToFloat(i)), Math.abs(rect.getRight() - Float.intBitsToFloat(i))));
    }

    /* renamed from: drawScrubLine-jQ-KiII, reason: not valid java name */
    private static final void m18593drawScrubLinejQKiII(DrawScope drawScope, long j, long j2, long j3, DrawScope2 drawScope2) {
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path.lineTo(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        DrawScope.m6955drawPathLG529CI$default(drawScope, Path, j3, 0.0f, drawScope2, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHorizontalGuidelines-rAjV9yQ, reason: not valid java name */
    public static final List<ConstraintLayoutBaseScope.HorizontalAnchor> m18594getHorizontalGuidelinesrAjV9yQ(ConstraintLayoutScope constraintLayoutScope, float f, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, List<Float> list, boolean z) {
        List listListOf;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop;
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        List<Float> list2 = list;
        Float fValueOf = Float.valueOf(0.0f);
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(list2, 9);
        if (iCollectionSizeOrDefault == 0) {
            listListOf = CollectionsKt.listOf(fValueOf);
        } else {
            ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
            arrayList.add(fValueOf);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                fValueOf = Float.valueOf(fValueOf.floatValue() + ((Number) it.next()).floatValue());
                arrayList.add(fValueOf);
            }
            listListOf = arrayList;
        }
        List listSubList = listListOf.subList(1, list.size());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator it2 = listSubList.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (z) {
                horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope.m8142createGuidelineFromTop0680j_4(C2002Dp.m7995constructorimpl(fFloatValue));
            } else {
                horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope.createGuidelineFromTop(fFloatValue);
            }
            arrayList2.add(horizontalAnchorCreateGuidelineFromTop);
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(constraintLayoutScope.m8142createGuidelineFromTop0680j_4(f));
        spreadBuilder.addSpread(arrayList2.toArray(new ConstraintLayoutBaseScope.HorizontalAnchor[0]));
        spreadBuilder.add(constraintLayoutBaseScope4.getTop());
        return CollectionsKt.listOf(spreadBuilder.toArray(new ConstraintLayoutBaseScope.HorizontalAnchor[spreadBuilder.size()]));
    }

    @JvmName
    private static final float getScrubLineBottomPadding(Composer composer, int i) {
        composer.startReplaceGroup(-1336110242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1336110242, i, -1, "com.robinhood.android.sdui.chartgroup.<get-ScrubLineBottomPadding> (SduiAdvancedChart.kt:2082)");
        }
        float fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM21593getSmallD9Ej5fM;
    }
}
