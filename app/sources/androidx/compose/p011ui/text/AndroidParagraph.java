package androidx.compose.p011ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.android.TextLayout;
import androidx.compose.p011ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.p011ui.text.android.selection.WordIterator;
import androidx.compose.p011ui.text.android.style.PlaceholderSpan;
import androidx.compose.p011ui.text.internal.InlineClassHelper5;
import androidx.compose.p011ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.p011ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.p011ui.text.platform.AndroidTextPaint;
import androidx.compose.p011ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u0010:\u001a\u0002072\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u0002012\u0006\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010=J,\u0010D\u001a\u00020\u00192\u0006\u0010>\u001a\u0002072\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u0002012\u0006\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010=J\u001d\u0010M\u001a\u0002072\u0006\u0010;\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010PJ\u0017\u0010R\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010PJ\u0017\u0010S\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010PJ\u0017\u0010T\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bT\u0010PJ\u0017\u0010U\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bU\u0010PJ\u0017\u0010V\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010Y\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0014H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b]\u0010WJ\u001f\u0010_\u001a\u00020(2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u0014H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020a2\u0006\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020a2\u0006\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\bd\u0010cJH\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010f\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010j\u001a\u0004\u0018\u00010i2\b\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010n\u001a\u00020mH\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJP\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020(2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010j\u001a\u0004\u0018\u00010i2\b\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010n\u001a\u00020mH\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010y\u001a\u0004\bz\u0010{R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010y\u001a\u0004\b|\u0010{R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010}\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0017\n\u0005\b%\u0010\u0082\u0001\u0012\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0088\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001010\u0087\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R\u0017\u0010\u0092\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001R\u0017\u0010\u0094\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008d\u0001R\u0017\u0010\u0096\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u008d\u0001R\u0017\u0010\u0098\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u008d\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010{R \u0010¢\u0001\u001a\u00030\u009e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b¡\u0001\u0010\u0086\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, m3636d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "getShaderBrushSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "hasSpan", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "", "charSequence", "constructTextLayout", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;", "", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "offset", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", ResourceTypes.ARRAY, "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineStart", "(I)I", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", "getOverflow-gIe3tQ8", "J", "getConstraints-msEJaDk", "()J", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "getLineCount", "lineCount", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, i2, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j) {
        CharSequence charSequence;
        TextStyle textStyle;
        int i3;
        int i4;
        int i5;
        TextUtils.TruncateAt truncateAt;
        TextLayout textLayoutConstructTextLayout$default;
        int i6;
        int i7;
        AndroidParagraph androidParagraph;
        int i8;
        boolean z;
        ShaderBrushSpan[] shaderBrushSpans;
        CharSequence charSequence2;
        List<Rect> listEmptyList;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.overflow = i2;
        this.constraints = j;
        if ((Constraints.m7976getMinHeightimpl(j) == 0 && Constraints.m7977getMinWidthimpl(j) == 0) == false) {
            InlineClassHelper5.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if ((i >= 1) == false) {
            InlineClassHelper5.throwIllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        if (AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, TextOverflow.m7955equalsimpl0(i2, companion.m7959getEllipsisgIe3tQ8()))) {
            charSequence = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence());
        } else {
            charSequence = androidParagraphIntrinsics.getCharSequence();
        }
        this.charSequence = charSequence;
        int iM7524toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m7524toLayoutAlignaXe7zB0(style.m7669getTextAligne0LSkKk());
        boolean zM7915equalsimpl0 = TextAlign.m7915equalsimpl0(style.m7669getTextAligne0LSkKk(), TextAlign.INSTANCE.m7921getJustifye0LSkKk());
        int iM7526toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m7526toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle().getHyphens());
        int iM7525toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m7525toLayoutBreakStrategyxImikfE(LineBreak.m7852getStrategyfcGXIks(style.m7667getLineBreakrAG3T2k()));
        int iM7527toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m7527toLayoutLineBreakStylehpcqdu8(LineBreak.m7853getStrictnessusljTpc(style.m7667getLineBreakrAG3T2k()));
        int iM7528toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m7528toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m7854getWordBreakjp8hJ3c(style.m7667getLineBreakrAG3T2k()));
        if (TextOverflow.m7955equalsimpl0(i2, companion.m7959getEllipsisgIe3tQ8())) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (TextOverflow.m7955equalsimpl0(i2, companion.m7960getMiddleEllipsisgIe3tQ8())) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (!TextOverflow.m7955equalsimpl0(i2, companion.m7961getStartEllipsisgIe3tQ8())) {
                textStyle = style;
                i3 = zM7915equalsimpl0 ? 1 : 0;
                i4 = iM7525toLayoutBreakStrategyxImikfE;
                i5 = iM7528toLayoutLineBreakWordStylewPN0Rpw;
                truncateAt = null;
                TextUtils.TruncateAt truncateAt2 = truncateAt;
                CharSequence charSequence3 = charSequence;
                textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM7524toLayoutAlignaXe7zB0, i3, truncateAt2, i, iM7526toLayoutHyphenationFrequency3fSNIE, i4, iM7527toLayoutLineBreakStylehpcqdu8, i5, null, 256, null);
                if (Build.VERSION.SDK_INT < 35 || getTextPaint$ui_text_release().getLetterSpacing() == 0.0f || (!(TextOverflow.m7955equalsimpl0(i2, companion.m7961getStartEllipsisgIe3tQ8()) || TextOverflow.m7955equalsimpl0(i2, companion.m7960getMiddleEllipsisgIe3tQ8())) || textLayoutConstructTextLayout$default.getLineEllipsisCount(0) <= 0)) {
                    i6 = i;
                    i7 = 1;
                } else {
                    int lineEllipsisOffset = textLayoutConstructTextLayout$default.getLineEllipsisOffset(0);
                    i7 = 1;
                    i6 = i;
                    textLayoutConstructTextLayout$default = constructTextLayout(iM7524toLayoutAlignaXe7zB0, i3, truncateAt2, i6, iM7526toLayoutHyphenationFrequency3fSNIE, i4, iM7527toLayoutLineBreakStylehpcqdu8, i5, TextUtils.concat(charSequence3.subSequence(0, lineEllipsisOffset), "…", charSequence3.subSequence(textLayoutConstructTextLayout$default.getLineEllipsisCount(0) + lineEllipsisOffset, charSequence3.length())));
                }
                if (!TextOverflow.m7955equalsimpl0(i2, companion.m7959getEllipsisgIe3tQ8()) && textLayoutConstructTextLayout$default.getHeight() > Constraints.m7974getMaxHeightimpl(j) && i6 > i7) {
                    int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout$default, Constraints.m7974getMaxHeightimpl(j));
                    if (iNumberOfLinesThatFitMaxHeight < 0 || iNumberOfLinesThatFitMaxHeight == i6) {
                        androidParagraph = this;
                        i8 = 2;
                        z = i7;
                    } else {
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(iNumberOfLinesThatFitMaxHeight, i7);
                        i8 = 2;
                        z = i7;
                        androidParagraph = this;
                        textLayoutConstructTextLayout$default = constructTextLayout$default(androidParagraph, iM7524toLayoutAlignaXe7zB0, i3, truncateAt2, iCoerceAtLeast, iM7526toLayoutHyphenationFrequency3fSNIE, i4, iM7527toLayoutLineBreakStylehpcqdu8, i5, null, 256, null);
                    }
                    androidParagraph.layout = textLayoutConstructTextLayout$default;
                } else {
                    androidParagraph = this;
                    i8 = 2;
                    z = i7;
                    androidParagraph.layout = textLayoutConstructTextLayout$default;
                }
                androidParagraph.getTextPaint$ui_text_release().m7806setBrush12SF9DM(textStyle.getBrush(), Size.m6575constructorimpl((Float.floatToRawIntBits(androidParagraph.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << 32)), textStyle.getAlpha());
                shaderBrushSpans = androidParagraph.getShaderBrushSpans(androidParagraph.layout);
                if (shaderBrushSpans != null) {
                    Iterator it = ArrayIterator2.iterator(shaderBrushSpans);
                    while (it.hasNext()) {
                        ((ShaderBrushSpan) it.next()).m7826setSizeuvyYCjk(Size.m6575constructorimpl((Float.floatToRawIntBits(androidParagraph.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << 32)));
                    }
                }
                charSequence2 = androidParagraph.charSequence;
                if (charSequence2 instanceof Spanned) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    Spanned spanned = (Spanned) charSequence2;
                    Object[] spans = spanned.getSpans(0, charSequence2.length(), PlaceholderSpan.class);
                    ArrayList arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                        int spanStart = spanned.getSpanStart(placeholderSpan);
                        int spanEnd = spanned.getSpanEnd(placeholderSpan);
                        int lineForOffset = androidParagraph.layout.getLineForOffset(spanStart);
                        boolean z2 = lineForOffset >= androidParagraph.maxLines ? z : false;
                        boolean z3 = (androidParagraph.layout.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= androidParagraph.layout.getLineEllipsisOffset(lineForOffset)) ? false : z;
                        boolean z4 = spanEnd > androidParagraph.layout.getLineEnd(lineForOffset) ? z : false;
                        if (z3 || z4 || z2) {
                            rect = null;
                        } else {
                            int i9 = WhenMappings.$EnumSwitchMapping$0[androidParagraph.getBidiRunDirection(spanStart).ordinal()];
                            if (i9 == z) {
                                horizontalPosition = androidParagraph.getHorizontalPosition(spanStart, z);
                            } else {
                                if (i9 != i8) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                horizontalPosition = androidParagraph.getHorizontalPosition(spanStart, z) - placeholderSpan.getWidthPx();
                            }
                            float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                            TextLayout textLayout = androidParagraph.layout;
                            switch (placeholderSpan.getVerticalAlign()) {
                                case 0:
                                    lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 1:
                                    lineTop = textLayout.getLineTop(lineForOffset);
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 2:
                                    lineBaseline = textLayout.getLineBottom(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 3:
                                    lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / i8;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 4:
                                    heightPx2 = placeholderSpan.getFontMetrics().ascent;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = heightPx2 + lineBaseline2;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 5:
                                    lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                    heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / i8;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = heightPx2 + lineBaseline2;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        }
                        arrayList.add(rect);
                    }
                    listEmptyList = arrayList;
                }
                androidParagraph.placeholderRects = listEmptyList;
            }
            truncateAt = TextUtils.TruncateAt.START;
        }
        textStyle = style;
        i3 = zM7915equalsimpl0 ? 1 : 0;
        i4 = iM7525toLayoutBreakStrategyxImikfE;
        i5 = iM7528toLayoutLineBreakWordStylewPN0Rpw;
        TextUtils.TruncateAt truncateAt22 = truncateAt;
        CharSequence charSequence32 = charSequence;
        textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM7524toLayoutAlignaXe7zB0, i3, truncateAt22, i, iM7526toLayoutHyphenationFrequency3fSNIE, i4, iM7527toLayoutLineBreakStylehpcqdu8, i5, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) {
            i6 = i;
            i7 = 1;
        }
        if (!TextOverflow.m7955equalsimpl0(i2, companion.m7959getEllipsisgIe3tQ8())) {
            androidParagraph = this;
            i8 = 2;
            z = i7;
            androidParagraph.layout = textLayoutConstructTextLayout$default;
        }
        androidParagraph.getTextPaint$ui_text_release().m7806setBrush12SF9DM(textStyle.getBrush(), Size.m6575constructorimpl((Float.floatToRawIntBits(androidParagraph.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << 32)), textStyle.getAlpha());
        shaderBrushSpans = androidParagraph.getShaderBrushSpans(androidParagraph.layout);
        if (shaderBrushSpans != null) {
        }
        charSequence2 = androidParagraph.charSequence;
        if (charSequence2 instanceof Spanned) {
        }
        androidParagraph.placeholderRects = listEmptyList;
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getWidth() {
        return Constraints.m7975getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo7513getOffsetForPositionk4lQ0M(long position) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Float.intBitsToFloat((int) (4294967295L & position))), Float.intBitsToFloat((int) (position >> 32)));
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo7514getRangeForRect86BmAI(Rect rect, int granularity, final TextInclusionStrategy inclusionStrategy) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m7529toLayoutTextGranularityduNsdkg(granularity), new Function2<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(inclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2)));
            }
        });
        if (rangeForRect == null) {
            return TextRange.INSTANCE.m7651getZerod9O1mEE();
        }
        return TextRange2.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public Rect getBoundingBox(int offset) {
        boolean z = false;
        if (offset >= 0 && offset < this.charSequence.length()) {
            z = true;
        }
        if (!z) {
            InlineClassHelper5.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF boundingBox = this.layout.getBoundingBox(offset);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo7512fillBoundingBoxes8ffj60Q(long range, float[] array2, int arrayStart) {
        this.layout.fillBoundingBoxes(TextRange.m7644getMinimpl(range), TextRange.m7643getMaximpl(range), array2, arrayStart);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public Path getPathForRange(int start, int end) {
        if (!(start >= 0 && start <= end && end <= this.charSequence.length())) {
            InlineClassHelper5.throwIllegalArgumentException("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(start, end, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public Rect getCursorRect(int offset) {
        if (!(offset >= 0 && offset <= this.charSequence.length())) {
            InlineClassHelper5.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(offset);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo7515getWordBoundaryjx7JFs(int offset) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRange2.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, offset), WordBoundary_androidKt.getWordEnd(wordIterator, offset));
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    public float getLineBaseline(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.layout.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        if (visibleEnd) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.layout.isLineEllipsized(lineIndex);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        if (usePrimaryDirection) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int offset) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.layout.isRtlCharAt(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo7516paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration, DrawScope2 drawStyle, int blendMode) {
        int backingBlendMode = getTextPaint$ui_text_release().getBackingBlendMode();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m7807setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m7805setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m7805setBlendModes9anfk8(backingBlendMode);
    }

    @Override // androidx.compose.p011ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo7517painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration textDecoration, DrawScope2 drawStyle, int blendMode) {
        int backingBlendMode = getTextPaint$ui_text_release().getBackingBlendMode();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        float width = getWidth();
        float height = getHeight();
        textPaint$ui_text_release.m7806setBrush12SF9DM(brush, Size.m6575constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), alpha);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m7805setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m7805setBlendModes9anfk8(backingBlendMode);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return androidParagraph.constructTextLayout(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    private final TextLayout constructTextLayout(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), getTextPaint$ui_text_release(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }
}
