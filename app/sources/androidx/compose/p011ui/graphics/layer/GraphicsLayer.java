package androidx.compose.p011ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.ScatterSet2;
import androidx.collection.ScatterSet5;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.RenderEffect;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawContext2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidGraphicsLayer.android.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Ä\u00012\u00020\u0001:\u0002Ä\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0011JA\u00105\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f00¢\u0006\u0002\b1ø\u0001\u0000¢\u0006\u0004\b3\u00104J!\u0010;\u001a\u00020\f2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u0011J\u000f\u0010?\u001a\u00020\fH\u0000¢\u0006\u0004\b>\u0010\u0011J\u0015\u0010@\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b@\u0010AJ.\u0010H\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020B2\b\b\u0002\u0010\u000b\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020Dø\u0001\u0000¢\u0006\u0004\bF\u0010GJ$\u0010J\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020B2\b\b\u0002\u0010\u000b\u001a\u00020Cø\u0001\u0000¢\u0006\u0004\bI\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010NR\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010OR'\u0010P\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f00¢\u0006\u0002\b18\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR%\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f00¢\u0006\u0002\b18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010X\u001a\u00020B8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010Z\u001a\u00020C8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010WR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010q\u001a\u00020U2\u0006\u0010p\u001a\u00020U8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010W\u001a\u0004\bq\u0010rR0\u0010\t\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010Y\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR0\u0010\u000b\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010Y\u001a\u0004\bx\u0010u\"\u0004\by\u0010wR0\u0010z\u001a\u00020B2\u0006\u0010s\u001a\u00020B8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bz\u0010Y\u001a\u0004\b{\u0010u\"\u0004\b|\u0010wR2\u0010}\u001a\u00020U2\u0006\u0010s\u001a\u00020U8F@FX\u0086\u000e¢\u0006\u001a\n\u0004\b}\u0010W\u0012\u0005\b\u0081\u0001\u0010\u0011\u001a\u0004\b~\u0010r\"\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R1\u0010\u0089\u0001\u001a\u00030\u0084\u00012\u0007\u0010s\u001a\u00030\u0084\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u008e\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0092\u0001\u001a\u00030\u008f\u00012\u0007\u0010s\u001a\u00030\u008f\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0086\u0001\"\u0006\b\u0091\u0001\u0010\u0088\u0001R/\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00012\t\u0010s\u001a\u0005\u0018\u00010\u0093\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009b\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u008b\u0001\"\u0006\b\u009a\u0001\u0010\u008d\u0001R)\u0010\u009e\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u008b\u0001\"\u0006\b\u009d\u0001\u0010\u008d\u0001R)\u0010¡\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009f\u0001\u0010\u008b\u0001\"\u0006\b \u0001\u0010\u008d\u0001R)\u0010¤\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010\u008b\u0001\"\u0006\b£\u0001\u0010\u008d\u0001R)\u0010§\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010\u008b\u0001\"\u0006\b¦\u0001\u0010\u008d\u0001R)\u0010ª\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010\u008b\u0001\"\u0006\b©\u0001\u0010\u008d\u0001R)\u0010\u00ad\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0001\u0010\u008b\u0001\"\u0006\b¬\u0001\u0010\u008d\u0001R)\u0010°\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010\u008b\u0001\"\u0006\b¯\u0001\u0010\u008d\u0001R)\u0010³\u0001\u001a\u00020D2\u0006\u0010s\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b±\u0001\u0010\u008b\u0001\"\u0006\b²\u0001\u0010\u008d\u0001R/\u0010¹\u0001\u001a\u0005\u0018\u00010´\u00012\t\u0010s\u001a\u0005\u0018\u00010´\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u0014\u0010¼\u0001\u001a\u00020]8F¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R/\u0010À\u0001\u001a\u00030½\u00012\u0007\u0010s\u001a\u00030½\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b¾\u0001\u0010u\"\u0005\b¿\u0001\u0010wR/\u0010Ã\u0001\u001a\u00030½\u00012\u0007\u0010s\u001a\u00030½\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\bÁ\u0001\u0010u\"\u0005\bÂ\u0001\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, m3636d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "Landroidx/compose/ui/graphics/layer/LayerManager;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "Landroidx/compose/ui/unit/IntSize;", "size", "", "setPosition-VbeCjmY", "(JJ)V", "setPosition", "recordInternal", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawWithChildTracking", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "graphicsLayer", "addSubLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "transformCanvas", "(Landroid/graphics/Canvas;)V", "recreateDisplayListIfNeeded", "onAddedToParentLayer", "onRemovedFromParentLayer", "Landroid/graphics/RectF;", "obtainPathBounds", "()Landroid/graphics/RectF;", "configureOutlineAndClip", "Landroidx/compose/ui/graphics/Path;", "path", "Landroid/graphics/Outline;", "updatePathOutline", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "obtainAndroidOutline", "()Landroid/graphics/Outline;", "discardContentIfReleasedAndHaveNoParentLayerUsages", "resetOutlineParams", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "parentLayer", "draw$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "release$ui_graphics_release", "release", "discardDisplayList$ui_graphics_release", "discardDisplayList", "setPathOutline", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "setRoundRectOutline", "setRectOutline-tz77jQw", "setRectOutline", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "drawBlock", "Lkotlin/jvm/functions/Function1;", "clipDrawBlock", "androidOutline", "Landroid/graphics/Outline;", "", "outlineDirty", "Z", "roundRectOutlineTopLeft", "J", "roundRectOutlineSize", "roundRectCornerRadius", "F", "Landroidx/compose/ui/graphics/Outline;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "roundRectClipPath", "usePathForClip", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "", "parentLayerUsages", "I", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "<set-?>", "isReleased", "()Z", "value", "getTopLeft-nOcc-ac", "()J", "setTopLeft--gyyYBs", "(J)V", "getSize-YbymL2g", "setSize-ozmzZPI", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "clip", "getClip", "setClip", "(Z)V", "getClip$annotations", "pathBounds", "Landroid/graphics/RectF;", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "Companion", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.p011ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContext2.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }
    };
    private final Function1<DrawScope, Unit> clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
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
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6938clipPathmtrdDE(path, iM6700getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        Offset.Companion companion = Offset.INSTANCE;
        this.roundRectOutlineTopLeft = companion.m6553getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.INSTANCE.m6588getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.INSTANCE.m8047getZeronOccac();
        this.size = IntSize.INSTANCE.m8064getZeroYbymL2g();
        this.pivotOffset = companion.m6552getUnspecifiedF1C5BW0();
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m6979getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m6985setCompositingStrategyWpw9cng(int i) {
        if (CompositingStrategy.m6972equalsimpl0(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.mo6996setCompositingStrategyWpw9cng(i);
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m6990setTopLeftgyyYBs(long j) {
        if (IntOffset.m8037equalsimpl0(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        m6976setPositionVbeCjmY(j, this.size);
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m6977setSizeozmzZPI(long j) {
        if (IntSize.m8058equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        m6976setPositionVbeCjmY(this.topLeft, j);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6978getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m6986setPivotOffsetk4lQ0M(long j) {
        if (Offset.m6540equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.mo6998setPivotOffsetk4lQ0M(j);
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m6976setPositionVbeCjmY(long topLeft, long size) {
        this.impl.mo6999setPositionH0pRuoY(IntOffset.m8038getXimpl(topLeft), IntOffset.m8039getYimpl(topLeft), size);
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m6983recordmLhObY(Density density, LayoutDirection layoutDirection, long size, Function1<? super DrawScope, Unit> block) {
        m6977setSizeozmzZPI(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawWithChildTracking(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        ScatterSet2 scatterSet2 = childLayerDependenciesTracker.dependenciesSet;
        if (scatterSet2 != null && scatterSet2.isNotEmpty()) {
            ScatterSet2 scatterSet2MutableScatterSetOf = childLayerDependenciesTracker.oldDependenciesSet;
            if (scatterSet2MutableScatterSetOf == null) {
                scatterSet2MutableScatterSetOf = ScatterSet5.mutableScatterSetOf();
                childLayerDependenciesTracker.oldDependenciesSet = scatterSet2MutableScatterSetOf;
            }
            scatterSet2MutableScatterSetOf.addAll(scatterSet2);
            scatterSet2.clear();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
        }
        ScatterSet2 scatterSet22 = childLayerDependenciesTracker.oldDependenciesSet;
        if (scatterSet22 == null || !scatterSet22.isNotEmpty()) {
            return;
        }
        Object[] objArr = scatterSet22.elements;
        long[] jArr = scatterSet22.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        scatterSet22.clear();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void transformCanvas(Canvas androidCanvas) {
        Canvas canvas;
        float fM8038getXimpl = IntOffset.m8038getXimpl(this.topLeft);
        float fM8039getYimpl = IntOffset.m8039getYimpl(this.topLeft);
        float fM8038getXimpl2 = IntOffset.m8038getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float fM8039getYimpl2 = IntOffset.m8039getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM6978getBlendMode0nO6VwU = m6978getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m6640equalsimpl0(iM6978getBlendMode0nO6VwU, BlendMode.INSTANCE.m6670getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m6972equalsimpl0(m6979getCompositingStrategyke2Ky5w(), CompositingStrategy.INSTANCE.m6975getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo6616setBlendModes9anfk8(iM6978getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas = androidCanvas;
            canvas.saveLayer(fM8038getXimpl, fM8039getYimpl, fM8038getXimpl2, fM8039getYimpl2, Paint.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fM8038getXimpl, fM8039getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    public final void draw$ui_graphics_release(androidx.compose.p011ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        boolean z;
        boolean z2;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z3 = getShadowElevation() > 0.0f;
        if (z3) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z4 = !zIsHardwareAccelerated && this.clip;
        if (z4) {
            canvas.save();
            androidx.compose.p011ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.p011ui.graphics.Canvas.m6695clipRectmtrdDE$default(canvas, outline.getRect(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.p011ui.graphics.Canvas.m6693clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.p011ui.graphics.Canvas.m6693clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z = z3;
            z2 = z4;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.p011ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
            long jMo6936getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo6936getSizeNHjbRc();
            z = z3;
            GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z2 = z4;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo6937setSizeuvyYCjk(jM8067toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            }
        }
        if (z2) {
            canvas.restore();
        }
        if (z) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            android.graphics.Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    android.graphics.Outline outlineUpdatePathOutline = updatePathOutline(path);
                    if (outlineUpdatePathOutline != null) {
                        outlineUpdatePathOutline.setAlpha(getAlpha());
                        outline = outlineUpdatePathOutline;
                    }
                    this.impl.mo6997setOutlineO0kMr_c(outline, IntSize.m8056constructorimpl((4294967295L & Math.round(rectFObtainPathBounds.height())) | (Math.round(rectFObtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.INSTANCE.m6589getZeroNHjbRc();
                    android.graphics.Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 == 9205357640488583168L ? jM8067toSizeozmzZPI : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L))), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo6997setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSize2.m8066roundToIntSizeuvyYCjk(j3));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo6997setOutlineO0kMr_c(null, IntSize.INSTANCE.m8064getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final android.graphics.Outline updatePathOutline(Path path) {
        android.graphics.Outline outline;
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || path.isConvex()) {
            android.graphics.Outline outlineObtainAndroidOutline = obtainAndroidOutline();
            if (i < 30) {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            } else {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
            outline = outlineObtainAndroidOutline;
        } else {
            android.graphics.Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    private final android.graphics.Outline obtainAndroidOutline() {
        android.graphics.Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            discardDisplayList$ui_graphics_release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void discardDisplayList$ui_graphics_release() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
            childLayerDependenciesTracker.dependency = null;
        }
        ScatterSet2 scatterSet2 = childLayerDependenciesTracker.dependenciesSet;
        if (scatterSet2 != null) {
            Object[] objArr = scatterSet2.elements;
            long[] jArr = scatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            scatterSet2.clear();
        }
        this.impl.discardDisplayList();
    }

    public final androidx.compose.p011ui.graphics.Outline getOutline() {
        androidx.compose.p011ui.graphics.Outline rectangle;
        androidx.compose.p011ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != 9205357640488583168L) {
            jM8067toSizeozmzZPI = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM8067toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM8067toSizeozmzZPI & 4294967295L));
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRect2.m6572RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.m6588getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.m6553getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m6988setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (Offset.m6540equalsimpl0(this.roundRectOutlineTopLeft, topLeft) && Size.m6579equalsimpl0(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        configureOutlineAndClip();
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m6987setRectOutlinetz77jQw(long topLeft, long size) {
        m6988setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m6984setAmbientShadowColor8_81llA(long j) {
        if (Color.m6707equalsimpl0(j, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo6995setAmbientShadowColor8_81llA(j);
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m6989setSpotShadowColor8_81llA(long j) {
        if (Color.m6707equalsimpl0(j, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo7000setSpotShadowColor8_81llA(j);
    }

    static {
        LayerSnapshotImpl layerSnapshotImpl;
        if (LayerManager.INSTANCE.isRobolectric()) {
            layerSnapshotImpl = LayerSnapshotV21.INSTANCE;
        } else if (Build.VERSION.SDK_INT >= 28) {
            layerSnapshotImpl = LayerSnapshotV28.INSTANCE;
        } else if (SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable()) {
            layerSnapshotImpl = LayerSnapshotV22.INSTANCE;
        } else {
            layerSnapshotImpl = LayerSnapshotV21.INSTANCE;
        }
        SnapshotImpl = layerSnapshotImpl;
    }
}
