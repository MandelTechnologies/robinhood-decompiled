package androidx.compose.p011ui.node;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp4;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(m3635d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001c\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJq\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JY\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JY\u0010%\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'JO\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jw\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u000203H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106Jk\u0010@\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?Jk\u0010@\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJY\u0010E\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJY\u0010E\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJM\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020H2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJM\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020H2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010NJq\u0010U\u001a\u00020\u00192\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010TJY\u0010W\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010DJY\u0010W\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010GJc\u0010]\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010\\Jc\u0010]\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010d\u001a\u00020a*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020a*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020`*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001a\u0010j\u001a\u00020`*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001a\u0010j\u001a\u00020`*\u00020aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010mJ\u0017\u0010q\u001a\u00020n*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\t*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010lJ\u0017\u0010s\u001a\u00020\t*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010iJ\u0014\u0010w\u001a\u00020v*\u00020uH\u0097\u0001¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u0010*\u00020nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010pJ\u0017\u0010}\u001a\u00020e*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J\u001a\u0010}\u001a\u00020e*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010|J\u001a\u0010}\u001a\u00020e*\u00020aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020\u0019H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J+\u0010\u0087\u0001\u001a\u00020\u0019*\u00030\u0082\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JG\u0010\u008f\u0001\u001a\u00020\u00192\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JG\u0010\u0092\u0001\u001a\u00020\u00192\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u008c\u0001\u001a\u00030\u0082\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u000f\n\u0005\b\u0004\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0096\u0001R\u001c\u0010\"\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010¡\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b \u0001\u0010\u009a\u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u0098\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006§\u0001"}, m3636d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", ResourceTypes.STYLE, "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "()V", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "drawDirect-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawDirect", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/node/DrawModifierNode;", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo6916drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6916drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo6917drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6917drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo6918drawCircleV9BoPsw(Brush brush, float radius, long center, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6918drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo6919drawCircleVaOC9Bg(long color, float radius, long center, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6919drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo6920drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.mo6920drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo6921drawImagegbVJVH8(ImageBitmap image, long topLeft, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6921drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo6922drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6922drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo6923drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6923drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo6924drawOvalAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6924drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo6925drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6925drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo6926drawPathGBMwjPU(Path path, Brush brush, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6926drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo6927drawPathLG529CI(Path path, long color, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6927drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo6928drawPointsF8ZwMP8(List<Offset> points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6928drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo6929drawRectAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6929drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo6930drawRectnJ9OG0(long color, long topLeft, long size, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6930drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo6931drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, float alpha, DrawScope2 style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6931drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo6932drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawScope2 style, float alpha, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6932drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo6962getCenterF1C5BW0() {
        return this.canvasDrawScope.mo6962getCenterF1C5BW0();
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo6963getSizeNHjbRc() {
        return this.canvasDrawScope.mo6963getSizeNHjbRc();
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo5009roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo5009roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo5010roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo5010roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo5011toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo5011toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5012toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo5012toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5013toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo5013toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo5014toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo5014toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo5015toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo5015toPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo5016toPx0680j_4(float f) {
        return this.canvasDrawScope.mo5016toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    public Rect toRect(Dp4 dp4) {
        return this.canvasDrawScope.toRect(dp4);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo5017toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo5017toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo5018toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo5018toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5019toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo5019toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5020toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo5020toSpkPz2Gy4(i);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m7319draweZhPAX0$ui_release(Canvas canvas, long size, NodeCoordinator coordinator, Modifier.Node drawNode, GraphicsLayer layer) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(4);
        DelegatingNode delegatingNodePop = drawNode;
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof DrawModifierNode) {
                m7320drawDirecteZhPAX0$ui_release(canvas, size, coordinator, delegatingNodePop, layer);
            } else if ((delegatingNodePop.getKindSet() & iM7381constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i == 1) {
                }
            }
            delegatingNodePop = DelegatableNode2.pop(mutableVector);
        }
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM7287requireCoordinator64DMado = DelegatableNode2.m7287requireCoordinator64DMado(drawModifierNode, NodeKind.m7381constructorimpl(4));
        nodeCoordinatorM7287requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m7320drawDirecteZhPAX0$ui_release(canvas, IntSize2.m8067toSizeozmzZPI(nodeCoordinatorM7287requireCoordinator64DMado.mo7241getSizeYbymL2g()), nodeCoordinatorM7287requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    /* renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m7320drawDirecteZhPAX0$ui_release(Canvas canvas, long size, NodeCoordinator coordinator, DrawModifierNode drawNode, GraphicsLayer layer) {
        DrawModifierNode drawModifierNode = this.drawNode;
        this.drawNode = drawNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo6936getSizeNHjbRc = canvasDrawScope.getDrawContext().mo6936getSizeNHjbRc();
        GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(coordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo6937setSizeuvyYCjk(size);
        drawContext.setGraphicsLayer(layer);
        canvas.save();
        try {
            drawNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            this.drawNode = drawModifierNode;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.p011ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode != null) {
            DelegatingNode delegatingNodeNextDrawNode = LayoutNodeDrawScope2.nextDrawNode(drawModifierNode);
            if (delegatingNodeNextDrawNode == 0) {
                NodeCoordinator nodeCoordinatorM7287requireCoordinator64DMado = DelegatableNode2.m7287requireCoordinator64DMado(drawModifierNode, NodeKind.m7381constructorimpl(4));
                if (nodeCoordinatorM7287requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                    nodeCoordinatorM7287requireCoordinator64DMado = nodeCoordinatorM7287requireCoordinator64DMado.getWrapped();
                    Intrinsics.checkNotNull(nodeCoordinatorM7287requireCoordinator64DMado);
                }
                nodeCoordinatorM7287requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
                return;
            }
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(4);
            MutableVector mutableVector = null;
            while (delegatingNodeNextDrawNode != 0) {
                if (delegatingNodeNextDrawNode instanceof DrawModifierNode) {
                    performDraw((DrawModifierNode) delegatingNodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
                } else if ((delegatingNodeNextDrawNode.getKindSet() & iM7381constructorimpl) != 0 && (delegatingNodeNextDrawNode instanceof DelegatingNode)) {
                    Modifier.Node delegate = delegatingNodeNextDrawNode.getDelegate();
                    int i = 0;
                    delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                delegatingNodeNextDrawNode = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodeNextDrawNode != 0) {
                                    mutableVector.add(delegatingNodeNextDrawNode);
                                    delegatingNodeNextDrawNode = 0;
                                }
                                mutableVector.add(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                    }
                    if (i == 1) {
                    }
                }
                delegatingNodeNextDrawNode = DelegatableNode2.pop(mutableVector);
            }
            return;
        }
        InlineClassHelper4.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new ExceptionsH();
    }
}
