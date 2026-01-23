package com.robinhood.android.graph.spark;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.graphics.ColorUtils;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.graph.C18339R;
import com.robinhood.android.graph.spark.ScrubGestureDetector;
import com.robinhood.android.graph.spark.graphobject.BaselineGraphObject;
import com.robinhood.android.graph.spark.graphobject.EtfGraphObject;
import com.robinhood.android.graph.spark.graphobject.GlowSparkGraphObject;
import com.robinhood.android.graph.spark.graphobject.LivePulseGraphObject;
import com.robinhood.android.graph.spark.graphobject.MaintenanceShadeGraphObject;
import com.robinhood.android.graph.spark.graphobject.ScrubLineGraphObject;
import com.robinhood.android.graph.spark.graphobject.SecondaryPulseGraphObject;
import com.robinhood.android.graph.spark.graphobject.SparkGraphObject;
import com.robinhood.android.graph.spark.graphobject.UnderlyingSparkGraphObject;
import com.robinhood.android.graph.spark.graphobject.WarningLineGraphObject;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: GraphView.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 º\u00012\u00020\u00012\u00020\u0002:\u0002º\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0014J\n\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0014J.\u0010\u008d\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u00122\u0007\u0010\u0090\u0001\u001a\u00020\u00122\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0014J.\u0010\u0092\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00122\u0007\u0010\u0094\u0001\u001a\u00020\u00122\u0007\u0010\u0095\u0001\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0012H\u0016J\u0013\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u0012H\u0014J\n\u0010\u009a\u0001\u001a\u00030\u008b\u0001H\u0014J\u0014\u0010\u009b\u0001\u001a\u00030\u008b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0014\u0010\u009e\u0001\u001a\u00030\u008b\u00012\b\u0010\u009f\u0001\u001a\u00030 \u0001H\u0014J\u001c\u0010¡\u0001\u001a\u00030\u008b\u00012\u0007\u0010¢\u0001\u001a\u00020+2\u0007\u0010£\u0001\u001a\u00020+H\u0016J\n\u0010¤\u0001\u001a\u00030\u008b\u0001H\u0016J\u001c\u0010¥\u0001\u001a\u00030\u008b\u00012\u0007\u0010¢\u0001\u001a\u00020+2\u0007\u0010£\u0001\u001a\u00020+H\u0002J\u001b\u00105\u001a\u0004\u0018\u00010\u00122\t\u0010¢\u0001\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0003\u0010¦\u0001J\u0010\u0010§\u0001\u001a\u00030\u008b\u00012\u0006\u0010.\u001a\u00020-J\u0010\u0010¨\u0001\u001a\u00030\u008b\u00012\u0006\u0010'\u001a\u00020\fJ\u0010\u0010©\u0001\u001a\u00030\u008b\u00012\u0006\u0010.\u001a\u00020-J\b\u0010ª\u0001\u001a\u00030\u008b\u0001J\n\u0010«\u0001\u001a\u00030\u008b\u0001H\u0002J\n\u0010¬\u0001\u001a\u00030\u008b\u0001H\u0002J\n\u0010\u00ad\u0001\u001a\u00030\u008b\u0001H\u0002J\u0018\u0010°\u0001\u001a\u00030¯\u00012\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0003\b±\u0001J\u0018\u0010³\u0001\u001a\u00030¯\u00012\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0003\b´\u0001J\u001b\u0010µ\u0001\u001a\u00030\u008b\u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0003\u0010¶\u0001J\n\u0010·\u0001\u001a\u00030\u008b\u0001H\u0002J\n\u0010¸\u0001\u001a\u00030\u008b\u0001H\u0002J\n\u0010¹\u0001\u001a\u00030\u008b\u0001H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010!\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u000e\u0010'\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0004\n\u0002\u0010,R\"\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0011\u001a\u0004\u0018\u00010-@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u00104\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00109\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010;R(\u0010A\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020- D*\n\u0012\u0004\u0012\u00020-\u0018\u00010C0C0BX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010E\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 D*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010C0C0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\f0\f0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010G\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\f0\f0HX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0J¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120C0J¢\u0006\b\n\u0000\u001a\u0004\bN\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0J¢\u0006\b\n\u0000\u001a\u0004\bO\u0010LR\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0C0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010V\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\b^\u0010_R\u001b\u0010a\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010[\u001a\u0004\bc\u0010dR\u001b\u0010f\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010[\u001a\u0004\bh\u0010iR\u001b\u0010k\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010[\u001a\u0004\bm\u0010nR\u001b\u0010p\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010[\u001a\u0004\br\u0010sR\u001b\u0010u\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010[\u001a\u0004\bw\u0010xR\u001b\u0010z\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010[\u001a\u0004\b|\u0010}R\u001f\u0010\u007f\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010[\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0084\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010[\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u000f\u0010\u0089\u0001\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010®\u0001\u001a\u0005\u0018\u00010¯\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010²\u0001\u001a\u0005\u0018\u00010¯\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006»\u0001"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphView;", "Landroid/view/View;", "Lcom/robinhood/android/graph/spark/ScrubGestureDetector$ScrubListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "styledAttributes", "Landroid/content/res/TypedArray;", "scrubEnabled", "", "paintCache", "Lcom/robinhood/android/graph/spark/GraphViewPaintCache;", "getPaintCache$lib_graph_externalDebug", "()Lcom/robinhood/android/graph/spark/GraphViewPaintCache;", "value", "", "screenBackgroundColor", "getScreenBackgroundColor", "()I", "setScreenBackgroundColor", "(I)V", "baseLineColor", "getBaseLineColor", "setBaseLineColor", "Landroid/content/res/ColorStateList;", "lineColor", "getLineColor", "()Landroid/content/res/ColorStateList;", "setLineColor", "(Landroid/content/res/ColorStateList;)V", "scrubLineColor", "getScrubLineColor", "setScrubLineColor", "glowColor", "getGlowColor", "setGlowColor", "isStale", "highlightSession", "Lcom/robinhood/models/ui/DataPoint$Session;", "scrubLinePosition", "", "Ljava/lang/Float;", "Lcom/robinhood/android/graph/spark/GraphData;", "graphData", "setGraphData", "(Lcom/robinhood/android/graph/spark/GraphData;)V", "underlyingGraphData", "xPoints", "", "scrubbedIndex", "getScrubbedIndex", "()Ljava/lang/Integer;", "contentRect", "Landroid/graphics/RectF;", "isPrimaryLineOnTop", "isPrimaryLineOnTop$lib_graph_externalDebug", "()Z", "setPrimaryLineOnTop$lib_graph_externalDebug", "(Z)V", "xInsetForPulse", "showLivePulse", "getShowLivePulse", "dataUpdatedSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/utils/Optional;", "kotlin.jvm.PlatformType", "scrubSubject", "isPrimaryLineOnTopSubject", "warningIconClickedSubject", "Lio/reactivex/subjects/PublishSubject;", "warningIconClickedObservable", "Lio/reactivex/Observable;", "getWarningIconClickedObservable", "()Lio/reactivex/Observable;", "historicalScrubbedObservable", "getHistoricalScrubbedObservable", "isPrimaryLineOnTopObservable", "dataUpdatedObservable", "viewState", "Lcom/robinhood/android/graph/spark/GraphViewState;", "graphObjects", "", "Lcom/robinhood/android/graph/spark/GraphObject;", "maintenanceShadeGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/MaintenanceShadeGraphObject;", "getMaintenanceShadeGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/MaintenanceShadeGraphObject;", "maintenanceShadeGraphObject$delegate", "Lkotlin/Lazy;", "glowSparkGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/GlowSparkGraphObject;", "getGlowSparkGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/GlowSparkGraphObject;", "glowSparkGraphObject$delegate", "livePulseGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/LivePulseGraphObject;", "getLivePulseGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/LivePulseGraphObject;", "livePulseGraphObject$delegate", "secondaryPulseGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/SecondaryPulseGraphObject;", "getSecondaryPulseGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/SecondaryPulseGraphObject;", "secondaryPulseGraphObject$delegate", "baselineGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/BaselineGraphObject;", "getBaselineGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/BaselineGraphObject;", "baselineGraphObject$delegate", "underlyingSparkGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/UnderlyingSparkGraphObject;", "getUnderlyingSparkGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/UnderlyingSparkGraphObject;", "underlyingSparkGraphObject$delegate", "sparkGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/SparkGraphObject;", "getSparkGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/SparkGraphObject;", "sparkGraphObject$delegate", "scrubLineGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/ScrubLineGraphObject;", "getScrubLineGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/ScrubLineGraphObject;", "scrubLineGraphObject$delegate", "warningLineGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/WarningLineGraphObject;", "getWarningLineGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/WarningLineGraphObject;", "warningLineGraphObject$delegate", "etfGraphObject", "Lcom/robinhood/android/graph/spark/graphobject/EtfGraphObject;", "getEtfGraphObject", "()Lcom/robinhood/android/graph/spark/graphobject/EtfGraphObject;", "etfGraphObject$delegate", "showSpyLine", "onAttachedToWindow", "", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "setPadding", "left", "top", "right", "bottom", "onCreateDrawableState", "", "extraSpace", "drawableStateChanged", "setOnTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onScrubbed", "x", "y", "onScrubEnded", "maybeReorderChartLines", "(Ljava/lang/Float;)Ljava/lang/Integer;", "setData", "setStale", "setUnderlyingData", "clear", "updateViewState", "populateGraphObjects", "populatePath", "_scaleHelper", "Lcom/robinhood/android/graph/spark/ScaleHelper;", "getScaleHelper", "getScaleHelper$lib_graph_externalDebug", "_underlyingScaleHelper", "getUnderlyingScaleHelper", "getUnderlyingScaleHelper$lib_graph_externalDebug", "setScrubLinePosition", "(Ljava/lang/Float;)V", "updateLineColor", "updateLowLightColor", "updateContentRect", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class GraphView extends View implements ScrubGestureDetector.ScrubListener {
    public static final float EXTRA_SMALL_PULSE_MULTIPLIER = 0.25f;
    public static final float LOWLIGHT_ALPHA = 0.4f;
    public static final float SMALL_DOT_MULTIPLIER = 0.5f;
    public static final float SMALL_PULSE_MULTIPLIER = 0.5f;
    private ScaleHelper _scaleHelper;
    private ScaleHelper _underlyingScaleHelper;

    /* renamed from: baselineGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy baselineGraphObject;
    private final RectF contentRect;
    private final Observable<Optional<GraphData>> dataUpdatedObservable;
    private final BehaviorSubject<Optional<GraphData>> dataUpdatedSubject;

    /* renamed from: etfGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy etfGraphObject;
    private int glowColor;

    /* renamed from: glowSparkGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy glowSparkGraphObject;
    private GraphData graphData;
    private final List<GraphObject> graphObjects;
    private DataPoint.Session highlightSession;
    private final Observable<Optional<Integer>> historicalScrubbedObservable;
    private boolean isPrimaryLineOnTop;
    private final Observable<Boolean> isPrimaryLineOnTopObservable;
    private final BehaviorSubject<Boolean> isPrimaryLineOnTopSubject;
    private boolean isStale;
    private ColorStateList lineColor;

    /* renamed from: livePulseGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy livePulseGraphObject;

    /* renamed from: maintenanceShadeGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy maintenanceShadeGraphObject;
    private final GraphViewPaintCache paintCache;
    private int screenBackgroundColor;
    private final boolean scrubEnabled;

    /* renamed from: scrubLineGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy scrubLineGraphObject;
    private Float scrubLinePosition;
    private final BehaviorSubject<Optional<Integer>> scrubSubject;

    /* renamed from: secondaryPulseGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy secondaryPulseGraphObject;
    private boolean showSpyLine;

    /* renamed from: sparkGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy sparkGraphObject;
    private final TypedArray styledAttributes;
    private GraphData underlyingGraphData;

    /* renamed from: underlyingSparkGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy underlyingSparkGraphObject;
    private GraphViewState viewState;
    private final Observable<Boolean> warningIconClickedObservable;
    private final PublishSubject<Boolean> warningIconClickedSubject;

    /* renamed from: warningLineGraphObject$delegate, reason: from kotlin metadata */
    private final Lazy warningLineGraphObject;
    private final int xInsetForPulse;
    private float[] xPoints;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int[] STALE_STATE_SET = {C11048R.attr.state_stale};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C11048R.styleable.GraphView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.styledAttributes = typedArrayObtainStyledAttributes;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.GraphView_scrubEnabled, true);
        this.scrubEnabled = z;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.GraphView_fill, false);
        int color = context.getColor(C11048R.color.background_color_primary);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_dashedLineLength, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_dashedLineSpacing, 0.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(C11048R.styleable.GraphView_baseLineColor, 0);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_baseLineWidth, 0.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_cornerRadius, 0.0f);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C11048R.styleable.GraphView_lineColor);
        Intrinsics.checkNotNull(colorStateList);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(C11048R.styleable.GraphView_secondaryLineColor);
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList2, "valueOf(...)");
        }
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_lineWidth, 0.0f);
        ColorStateList colorStateList3 = colorStateList2;
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_secondaryLineWidth, 0.0f);
        int color3 = typedArrayObtainStyledAttributes.getColor(C11048R.styleable.GraphView_prePublicLineColor, 0);
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_scrubLineWidth, typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_lineWidth, 0.0f));
        int i = C11048R.styleable.GraphView_scrubLineColor;
        this.paintCache = new GraphViewPaintCache(z2, color, dimension, dimension2, color2, dimension3, dimension4, colorStateList, colorStateList3, dimension5, dimension6, color3, dimension7, typedArrayObtainStyledAttributes.getColor(i, typedArrayObtainStyledAttributes.getColor(i, 0)), typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.GraphView_glowRadius, 0.0f), typedArrayObtainStyledAttributes.getColor(C11048R.styleable.GraphView_glowColor, 0), context.getColor(C18339R.color.etf_spy_line_color), getResources().getDimension(C18339R.dimen.etf_spy_line_stroke_width), getResources().getDimension(C18339R.dimen.etf_spy_line_dash_length), getResources().getDimension(C18339R.dimen.etf_spy_line_dash_spacing));
        this.screenBackgroundColor = context.getColor(C11048R.color.background_color_primary);
        ColorStateList colorStateList4 = typedArrayObtainStyledAttributes.getColorStateList(C11048R.styleable.GraphView_lineColor);
        if (colorStateList4 == null) {
            throw new IllegalArgumentException("Line color is required");
        }
        this.lineColor = colorStateList4;
        this.glowColor = typedArrayObtainStyledAttributes.getColor(C11048R.styleable.GraphView_glowColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        Handler handler = new Handler();
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        if (z) {
            ScrubGestureDetector scrubGestureDetector = new ScrubGestureDetector(this, handler, scaledTouchSlop);
            scrubGestureDetector.setEnabled(z);
            setOnTouchListener(scrubGestureDetector);
        }
        this.xPoints = new float[0];
        this.contentRect = new RectF();
        this.isPrimaryLineOnTop = true;
        this.xInsetForPulse = getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_default);
        BehaviorSubject<Optional<GraphData>> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.dataUpdatedSubject = behaviorSubjectCreate;
        BehaviorSubject<Optional<Integer>> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.scrubSubject = behaviorSubjectCreateDefault;
        BehaviorSubject<Boolean> behaviorSubjectCreate2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate2, "create(...)");
        this.isPrimaryLineOnTopSubject = behaviorSubjectCreate2;
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.warningIconClickedSubject = publishSubjectCreate;
        this.warningIconClickedObservable = publishSubjectCreate;
        Observable<Optional<Integer>> observableDistinctUntilChanged = behaviorSubjectCreateDefault.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.historicalScrubbedObservable = observableDistinctUntilChanged;
        Observable<Boolean> observableDistinctUntilChanged2 = behaviorSubjectCreate2.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        this.isPrimaryLineOnTopObservable = observableDistinctUntilChanged2;
        this.dataUpdatedObservable = behaviorSubjectCreate;
        this.viewState = new GraphViewState(null, null, null, null, false, 31, null);
        this.graphObjects = new ArrayList();
        this.maintenanceShadeGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.maintenanceShadeGraphObject_delegate$lambda$0(this.f$0);
            }
        });
        this.glowSparkGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.glowSparkGraphObject_delegate$lambda$1(this.f$0);
            }
        });
        this.livePulseGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.livePulseGraphObject_delegate$lambda$2(this.f$0);
            }
        });
        this.secondaryPulseGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.secondaryPulseGraphObject_delegate$lambda$3(this.f$0);
            }
        });
        this.baselineGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.baselineGraphObject_delegate$lambda$4(this.f$0);
            }
        });
        this.underlyingSparkGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.underlyingSparkGraphObject_delegate$lambda$5(this.f$0);
            }
        });
        this.sparkGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.sparkGraphObject_delegate$lambda$6(this.f$0);
            }
        });
        this.scrubLineGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.scrubLineGraphObject_delegate$lambda$7(this.f$0);
            }
        });
        this.warningLineGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.warningLineGraphObject_delegate$lambda$8(this.f$0);
            }
        });
        this.etfGraphObject = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphView.etfGraphObject_delegate$lambda$9(this.f$0);
            }
        });
    }

    /* renamed from: getPaintCache$lib_graph_externalDebug, reason: from getter */
    public final GraphViewPaintCache getPaintCache() {
        return this.paintCache;
    }

    public final int getScreenBackgroundColor() {
        return this.screenBackgroundColor;
    }

    public final void setScreenBackgroundColor(int i) {
        this.screenBackgroundColor = i;
        this.paintCache.getLowLightBaseLinePaint().setColor(ColorUtils.blendARGB(i, getBaseLineColor(), 0.4f));
        updateLowLightColor();
        invalidate();
    }

    public final int getBaseLineColor() {
        return this.paintCache.getBaseLinePaint().getColor();
    }

    public final void setBaseLineColor(int i) {
        this.paintCache.getBaseLinePaint().setColor(i);
        invalidate();
    }

    public final ColorStateList getLineColor() {
        return this.lineColor;
    }

    public final void setLineColor(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lineColor = value;
        updateLineColor();
        invalidate();
    }

    public final int getScrubLineColor() {
        return this.paintCache.getScrubLinePaint().getColor();
    }

    public final void setScrubLineColor(int i) {
        this.paintCache.getScrubLinePaint().setColor(i);
        invalidate();
    }

    public final int getGlowColor() {
        return this.glowColor;
    }

    public final void setGlowColor(int i) {
        this.glowColor = i;
        Paint glowPaint = this.paintCache.getGlowPaint();
        if (glowPaint != null) {
            glowPaint.setColor(i);
        }
        invalidate();
    }

    private final void setGraphData(GraphData graphData) {
        GraphData graphData2 = this.graphData;
        this.graphData = graphData;
        this.dataUpdatedSubject.onNext(graphData != null ? Optional.INSTANCE.m2972of(graphData) : Optional2.INSTANCE);
        if (graphData2 == null || graphData == null || graphData2.getStale() == graphData.getStale()) {
            return;
        }
        refreshDrawableState();
    }

    public final Integer getScrubbedIndex() {
        return getScrubbedIndex(this.scrubLinePosition);
    }

    /* renamed from: isPrimaryLineOnTop$lib_graph_externalDebug, reason: from getter */
    public final boolean getIsPrimaryLineOnTop() {
        return this.isPrimaryLineOnTop;
    }

    public final void setPrimaryLineOnTop$lib_graph_externalDebug(boolean z) {
        this.isPrimaryLineOnTop = z;
        getSecondaryPulseGraphObject().onInvalidate(this.viewState);
        this.isPrimaryLineOnTopSubject.onNext(Boolean.valueOf(z));
    }

    private final boolean getShowLivePulse() {
        GraphData graphData = this.graphData;
        if (graphData != null) {
            return graphData.getShowLivePulse();
        }
        return false;
    }

    public final Observable<Boolean> getWarningIconClickedObservable() {
        return this.warningIconClickedObservable;
    }

    public final Observable<Optional<Integer>> getHistoricalScrubbedObservable() {
        return this.historicalScrubbedObservable;
    }

    public final Observable<Boolean> isPrimaryLineOnTopObservable() {
        return this.isPrimaryLineOnTopObservable;
    }

    private final MaintenanceShadeGraphObject getMaintenanceShadeGraphObject() {
        return (MaintenanceShadeGraphObject) this.maintenanceShadeGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaintenanceShadeGraphObject maintenanceShadeGraphObject_delegate$lambda$0(GraphView graphView) {
        return new MaintenanceShadeGraphObject(graphView);
    }

    private final GlowSparkGraphObject getGlowSparkGraphObject() {
        return (GlowSparkGraphObject) this.glowSparkGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GlowSparkGraphObject glowSparkGraphObject_delegate$lambda$1(GraphView graphView) {
        return new GlowSparkGraphObject(graphView);
    }

    private final LivePulseGraphObject getLivePulseGraphObject() {
        return (LivePulseGraphObject) this.livePulseGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivePulseGraphObject livePulseGraphObject_delegate$lambda$2(GraphView graphView) {
        return new LivePulseGraphObject(graphView);
    }

    private final SecondaryPulseGraphObject getSecondaryPulseGraphObject() {
        return (SecondaryPulseGraphObject) this.secondaryPulseGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecondaryPulseGraphObject secondaryPulseGraphObject_delegate$lambda$3(GraphView graphView) {
        return new SecondaryPulseGraphObject(graphView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaselineGraphObject baselineGraphObject_delegate$lambda$4(GraphView graphView) {
        return new BaselineGraphObject(graphView);
    }

    private final BaselineGraphObject getBaselineGraphObject() {
        return (BaselineGraphObject) this.baselineGraphObject.getValue();
    }

    private final UnderlyingSparkGraphObject getUnderlyingSparkGraphObject() {
        return (UnderlyingSparkGraphObject) this.underlyingSparkGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnderlyingSparkGraphObject underlyingSparkGraphObject_delegate$lambda$5(GraphView graphView) {
        return new UnderlyingSparkGraphObject(graphView);
    }

    private final SparkGraphObject getSparkGraphObject() {
        return (SparkGraphObject) this.sparkGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparkGraphObject sparkGraphObject_delegate$lambda$6(GraphView graphView) {
        return new SparkGraphObject(graphView);
    }

    private final ScrubLineGraphObject getScrubLineGraphObject() {
        return (ScrubLineGraphObject) this.scrubLineGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubLineGraphObject scrubLineGraphObject_delegate$lambda$7(GraphView graphView) {
        return new ScrubLineGraphObject(graphView);
    }

    private final WarningLineGraphObject getWarningLineGraphObject() {
        return (WarningLineGraphObject) this.warningLineGraphObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WarningLineGraphObject warningLineGraphObject_delegate$lambda$8(GraphView graphView) {
        return new WarningLineGraphObject(graphView, graphView.warningIconClickedSubject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EtfGraphObject etfGraphObject_delegate$lambda$9(GraphView graphView) {
        return new EtfGraphObject(graphView);
    }

    private final EtfGraphObject getEtfGraphObject() {
        return (EtfGraphObject) this.etfGraphObject.getValue();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.scrubEnabled) {
            Observables observables = Observables.INSTANCE;
            Observable observableCombineLatest = Observable.combineLatest(this.historicalScrubbedObservable, this.dataUpdatedObservable, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.graph.spark.GraphView$onAttachedToWindow$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.BiFunction
                public final R apply(T1 t1, T2 t2) {
                    DataPoint.Session activeSession;
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    Integer num = (Integer) ((Optional) t1).component1();
                    GraphData graphData = (GraphData) ((Optional) t2).component1();
                    if (graphData == null || !graphData.getSelection().getHasBaseline()) {
                        return (R) Optional2.INSTANCE;
                    }
                    List<DataPoint> dataPoints = graphData.getDataPoints();
                    DataPoint dataPoint = (num == null || num.intValue() >= dataPoints.size()) ? null : dataPoints.get(num.intValue());
                    Optional.Companion companion = Optional.INSTANCE;
                    if (dataPoint == null || (activeSession = dataPoint.getSession()) == null) {
                        activeSession = graphData.getActiveSession();
                    }
                    return (R) companion.m2972of(activeSession);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
            Observable observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            ViewDisposerKt.bindTo$default(observableDistinctUntilChanged, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.graph.spark.GraphView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GraphView.onAttachedToWindow$lambda$11(this.f$0, (Optional) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$11(GraphView graphView, Optional optional) {
        graphView.highlightSession = (DataPoint.Session) optional.component1();
        graphView.updateViewState();
        graphView.invalidate();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.graphObjects.iterator();
        while (it.hasNext()) {
            ((GraphObject) it.next()).onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateContentRect();
        populatePath();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        updateContentRect();
        populatePath();
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (this.isStale) {
            int[] iArr = STALE_STATE_SET;
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + iArr.length);
            View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
            Intrinsics.checkNotNull(iArrOnCreateDrawableState);
            return iArrOnCreateDrawableState;
        }
        int[] iArrOnCreateDrawableState2 = super.onCreateDrawableState(extraSpace);
        Intrinsics.checkNotNull(iArrOnCreateDrawableState2);
        return iArrOnCreateDrawableState2;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateLineColor();
    }

    @Override // android.view.View
    public void setOnTouchListener(final View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.graph.spark.GraphView.setOnTouchListener.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 1) {
                    int iRoundToInt = MathKt.roundToInt(motionEvent.getX());
                    int iRoundToInt2 = MathKt.roundToInt(motionEvent.getY());
                    Iterator it = GraphView.this.graphObjects.iterator();
                    while (it.hasNext() && !((GraphObject) it.next()).onTouch(iRoundToInt, iRoundToInt2)) {
                    }
                }
                return listener.onTouch(view, motionEvent);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<T> it = this.graphObjects.iterator();
        while (it.hasNext()) {
            ((GraphObject) it.next()).onDraw(this.viewState, canvas);
        }
    }

    @Override // com.robinhood.android.graph.spark.ScrubGestureDetector.ScrubListener
    public synchronized void onScrubbed(float x, float y) {
        GraphData graphData = this.graphData;
        if (graphData == null) {
            return;
        }
        if (this.xPoints.length == 0) {
            return;
        }
        if (graphData.getCount() == 0) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        maybeReorderChartLines(x, y);
        setScrubLinePosition(Float.valueOf(RangesKt.coerceIn(x, ArraysKt.first(this.xPoints), ArraysKt.last(this.xPoints))));
        this.scrubSubject.onNext(Optional.INSTANCE.m2972of(getScrubbedIndex()));
    }

    @Override // com.robinhood.android.graph.spark.ScrubGestureDetector.ScrubListener
    public void onScrubEnded() {
        setPrimaryLineOnTop$lib_graph_externalDebug(true);
        synchronized (this) {
            populateGraphObjects();
            Unit unit = Unit.INSTANCE;
        }
        this.scrubSubject.onNext(Optional2.INSTANCE);
        setScrubLinePosition(null);
    }

    private final void maybeReorderChartLines(float x, float y) throws Resources.NotFoundException {
        GraphData graphData;
        Integer scrubbedIndex;
        boolean z;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (GraphObject graphObject : this.graphObjects) {
            int i4 = i3 + 1;
            if (graphObject instanceof SparkGraphObject) {
                i = i3;
            }
            if (graphObject instanceof UnderlyingSparkGraphObject) {
                i2 = i3;
            }
            i3 = i4;
        }
        if (i == -1 || i2 == -1 || (graphData = this.underlyingGraphData) == null || (scrubbedIndex = getScrubbedIndex(Float.valueOf(x))) == null) {
            return;
        }
        int iIntValue = scrubbedIndex.intValue();
        ScaleHelper underlyingScaleHelper$lib_graph_externalDebug = getUnderlyingScaleHelper$lib_graph_externalDebug(graphData);
        float dimension = getResources().getDimension(C18339R.dimen.scrub_target_distance_selected);
        int iRoundToInt = MathKt.roundToInt((float) Math.ceil(dimension / (underlyingScaleHelper$lib_graph_externalDebug.getWidth() / graphData.getCount())));
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iIntValue - iRoundToInt, 0);
        int iCoerceAtMost = RangesKt.coerceAtMost(iIntValue + iRoundToInt, graphData.getCount() - 1);
        int iRoundToInt2 = MathKt.roundToInt(dimension);
        int i5 = iRoundToInt2 * iRoundToInt2;
        Iterable primitiveRanges2 = new PrimitiveRanges2(iCoerceAtLeast, iCoerceAtMost);
        if ((primitiveRanges2 instanceof Collection) && ((Collection) primitiveRanges2).isEmpty()) {
            z = false;
        } else {
            Iterator it = primitiveRanges2.iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                int iRoundToInt3 = MathKt.roundToInt(Math.abs(y - underlyingScaleHelper$lib_graph_externalDebug.getY(graphData.getY(iNextInt))));
                int iRoundToInt4 = MathKt.roundToInt(Math.abs(x - underlyingScaleHelper$lib_graph_externalDebug.getX(iNextInt)));
                if ((iRoundToInt3 * iRoundToInt3) + (iRoundToInt4 * iRoundToInt4) <= i5) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = i > i2;
        if (z == z2) {
            Collections.swap(this.graphObjects, i, i2);
            setPrimaryLineOnTop$lib_graph_externalDebug(!z2);
        }
    }

    private final Integer getScrubbedIndex(Float x) {
        if (x == null) {
            return null;
        }
        int iBinarySearch$default = ArraysKt.binarySearch$default(this.xPoints, x.floatValue(), 0, 0, 6, (Object) null);
        if (iBinarySearch$default >= 0) {
            return Integer.valueOf(iBinarySearch$default);
        }
        int i = (-1) - iBinarySearch$default;
        if (i == 0) {
            return 0;
        }
        float[] fArr = this.xPoints;
        if (i == fArr.length) {
            return Integer.valueOf(ArraysKt.getLastIndex(fArr));
        }
        int i2 = (-2) - iBinarySearch$default;
        return fArr[i] - x.floatValue() > x.floatValue() - this.xPoints[i2] ? Integer.valueOf(i2) : Integer.valueOf(i);
    }

    public final synchronized void setData(GraphData graphData) {
        try {
            Intrinsics.checkNotNullParameter(graphData, "graphData");
            boolean showLivePulse = getShowLivePulse();
            setGraphData(graphData);
            if (getShowLivePulse() != showLivePulse) {
                updateContentRect();
            }
            updateViewState();
            populateGraphObjects();
            populatePath();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void setStale(boolean isStale) {
        if (this.isStale != isStale) {
            this.isStale = isStale;
            updateLineColor();
        }
    }

    public final synchronized void setUnderlyingData(GraphData graphData) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        this.underlyingGraphData = graphData;
        updateViewState();
        populateGraphObjects();
        populatePath();
    }

    public final synchronized void clear() {
        try {
            setGraphData(null);
            this.underlyingGraphData = null;
            this.highlightSession = null;
            this.scrubLinePosition = null;
            Iterator<T> it = this.graphObjects.iterator();
            while (it.hasNext()) {
                ((GraphObject) it.next()).reset();
            }
            updateContentRect();
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void updateViewState() {
        this.viewState = new GraphViewState(this.highlightSession, this.graphData, this.underlyingGraphData, this.scrubLinePosition, false, 16, null);
    }

    private final void populateGraphObjects() {
        this.graphObjects.clear();
        GraphData graphData = this.graphData;
        if (graphData != null && graphData.getShowMaintenanceLine()) {
            this.graphObjects.add(getMaintenanceShadeGraphObject());
        }
        if (this.paintCache.getGlowPaint() != null) {
            this.graphObjects.add(getGlowSparkGraphObject());
        }
        if (getShowLivePulse()) {
            if (this.isPrimaryLineOnTop) {
                if (this.underlyingGraphData != null) {
                    this.graphObjects.add(getSecondaryPulseGraphObject());
                }
                this.graphObjects.add(getLivePulseGraphObject());
            } else {
                this.graphObjects.add(getLivePulseGraphObject());
                if (this.underlyingGraphData != null) {
                    this.graphObjects.add(getSecondaryPulseGraphObject());
                }
            }
        }
        GraphData graphData2 = this.graphData;
        if (graphData2 != null && graphData2.hasBaseLine()) {
            this.graphObjects.add(getBaselineGraphObject());
        }
        if (this.showSpyLine) {
            this.graphObjects.add(getEtfGraphObject());
        }
        if (!this.isPrimaryLineOnTop) {
            this.graphObjects.add(getSparkGraphObject());
        }
        if (this.underlyingGraphData != null) {
            this.graphObjects.add(getUnderlyingSparkGraphObject());
        }
        if (this.isPrimaryLineOnTop) {
            this.graphObjects.add(getSparkGraphObject());
        }
        if (this.scrubEnabled) {
            this.graphObjects.add(getScrubLineGraphObject());
        }
        GraphData graphData3 = this.graphData;
        if (graphData3 == null || !graphData3.getShowMaintenanceLine()) {
            return;
        }
        this.graphObjects.add(getWarningLineGraphObject());
    }

    private final void populatePath() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        GraphData graphData = this.graphData;
        if (graphData == null || graphData.getCount() <= 1) {
            clear();
            return;
        }
        ScaleHelper scaleHelper$lib_graph_externalDebug = getScaleHelper$lib_graph_externalDebug(graphData);
        GraphViewState graphViewState = this.viewState;
        Iterator<T> it = this.graphObjects.iterator();
        while (it.hasNext()) {
            ((GraphObject) it.next()).onInvalidate(graphViewState);
        }
        if (this.scrubEnabled) {
            int count = graphData.getCount();
            float[] fArr = new float[count];
            for (int i = 0; i < count; i++) {
                fArr[i] = scaleHelper$lib_graph_externalDebug.getX(i);
            }
            this.xPoints = fArr;
            this.scrubSubject.onNext(Optional.INSTANCE.m2972of(getScrubbedIndex()));
        }
        invalidate();
    }

    public final ScaleHelper getScaleHelper$lib_graph_externalDebug(GraphData graphData) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        ScaleHelper scaleHelper = this._scaleHelper;
        if (scaleHelper == null || scaleHelper.getGraphData() != graphData) {
            scaleHelper = new ScaleHelper(graphData, this.contentRect, this.paintCache.getSparkLinePaint().getStrokeWidth(), this.paintCache.getGlowRadius(), this.paintCache.getFill(), getShowLivePulse() ? this.xInsetForPulse : 0.0f);
        }
        this._scaleHelper = scaleHelper;
        return scaleHelper;
    }

    public final ScaleHelper getUnderlyingScaleHelper$lib_graph_externalDebug(GraphData graphData) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        ScaleHelper scaleHelper = this._underlyingScaleHelper;
        if (scaleHelper == null || scaleHelper.getGraphData() != graphData) {
            scaleHelper = new ScaleHelper(graphData, this.contentRect, this.paintCache.getSecondarySparkLinePaint().getStrokeWidth(), this.paintCache.getGlowRadius(), this.paintCache.getFill(), getShowLivePulse() ? this.xInsetForPulse : 0.0f);
        }
        this._underlyingScaleHelper = scaleHelper;
        return scaleHelper;
    }

    private final void setScrubLinePosition(Float x) {
        this.scrubLinePosition = x;
        updateViewState();
        getScrubLineGraphObject().onInvalidate(this.viewState);
        invalidate();
    }

    private final void updateLineColor() {
        int colorForState;
        Paint sparkLinePaint = this.paintCache.getSparkLinePaint();
        if (this.isStale) {
            colorForState = getContext().getColor(C11048R.color.stale_color);
        } else {
            colorForState = this.lineColor.getColorForState(getDrawableState(), this.lineColor.getDefaultColor());
        }
        sparkLinePaint.setColor(colorForState);
        updateLowLightColor();
    }

    private final void updateLowLightColor() {
        this.paintCache.getLowLightSparkPaint().setColor(ColorUtils.blendARGB(this.screenBackgroundColor, this.paintCache.getSparkLinePaint().getColor(), 0.4f));
    }

    private final void updateContentRect() {
        int i = getShowLivePulse() ? this.xInsetForPulse : 0;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int width = (getWidth() - getPaddingEnd()) - i;
        int height = getHeight() - getPaddingBottom();
        float f = paddingStart;
        RectF rectF = this.contentRect;
        if (f != rectF.left || paddingTop != rectF.top || width != rectF.right || height != rectF.bottom) {
            rectF.set(f, paddingTop, width, height);
            this._scaleHelper = null;
            this._underlyingScaleHelper = null;
        }
        Iterator<T> it = this.graphObjects.iterator();
        while (it.hasNext()) {
            ((GraphObject) it.next()).onContentRectChanged();
        }
    }

    /* compiled from: GraphView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphView$Companion;", "", "<init>", "()V", "LOWLIGHT_ALPHA", "", "SMALL_PULSE_MULTIPLIER", "EXTRA_SMALL_PULSE_MULTIPLIER", "SMALL_DOT_MULTIPLIER", "STALE_STATE_SET", "", "getSTALE_STATE_SET", "()[I", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int[] getSTALE_STATE_SET() {
            return GraphView.STALE_STATE_SET;
        }
    }
}
