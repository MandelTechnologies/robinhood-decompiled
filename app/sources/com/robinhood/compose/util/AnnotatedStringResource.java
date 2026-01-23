package com.robinhood.compose.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnnotatedStringResource.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u0013\u001a7\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"resources", "Landroid/content/res/Resources;", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "annotatedStringResource", "Landroidx/compose/ui/text/AnnotatedString;", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "annotatedStringResource-RIQooxk", "(Ljava/lang/CharSequence;JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "annotatedStringResourceV2", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "annotatedStringResourceV2-eopBjH0", "(Ljava/lang/CharSequence;JJLandroidx/compose/ui/text/LinkInteractionListener;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "id", "", "(IJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "(IJJLandroidx/compose/ui/text/LinkInteractionListener;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.util.AnnotatedStringResourceKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AnnotatedStringResource {
    private static final Resources resources(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1160843432, i, -1, "com.robinhood.compose.util.resources (AnnotatedStringResource.kt:27)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resources;
    }

    /* renamed from: annotatedStringResource-RIQooxk, reason: not valid java name */
    public static final AnnotatedString m22061annotatedStringResourceRIQooxk(CharSequence text, long j, long j2, Composer composer, int i, int i2) {
        AnnotatedString annotatedString;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        Spanned spanned;
        Intrinsics.checkNotNullParameter(text, "text");
        long j3 = (i2 & 4) != 0 ? j : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1856021537, i, -1, "com.robinhood.compose.util.annotatedStringResource (AnnotatedStringResource.kt:42)");
        }
        int i6 = 2;
        if (!(text instanceof Spanned)) {
            annotatedString = new AnnotatedString(text.toString(), null, 2, null);
        } else {
            int i7 = 0;
            int i8 = 1;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(text.toString());
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                Spanned spanned2 = (Spanned) text;
                Object[] spans = spanned2.getSpans(0, builder.getLength(), Object.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                int length = spans.length;
                while (i7 < length) {
                    Object obj = spans[i7];
                    int spanStart = spanned2.getSpanStart(obj);
                    int spanEnd = spanned2.getSpanEnd(obj);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == i8) {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        } else if (style == i6) {
                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        }
                    } else {
                        if (obj instanceof URLSpan) {
                            objArr = spans;
                            i3 = i7;
                            i4 = length;
                            i5 = i8;
                            spanned = spanned2;
                            builder.addStyle(new SpanStyle(j3, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), spanStart, spanEnd);
                            String url = ((URLSpan) obj).getURL();
                            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                            builder.addStringAnnotation("URL", url, spanStart, spanEnd);
                        }
                        i7 = i3 + 1;
                        spanned2 = spanned;
                        spans = objArr;
                        length = i4;
                        i8 = i5;
                        i6 = 2;
                    }
                    spanned = spanned2;
                    objArr = spans;
                    i3 = i7;
                    i5 = i8;
                    i4 = length;
                    i7 = i3 + 1;
                    spanned2 = spanned;
                    spans = objArr;
                    length = i4;
                    i8 = i5;
                    i6 = 2;
                }
                builder.toAnnotatedString();
                annotatedString = builder.toAnnotatedString();
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    /* renamed from: annotatedStringResourceV2-eopBjH0, reason: not valid java name */
    public static final AnnotatedString m22063annotatedStringResourceV2eopBjH0(CharSequence charSequence, long j, long j2, LinkInteractionListener linkInteractionListener, Composer composer, int i, int i2) throws Throwable {
        AnnotatedString annotatedString;
        AnnotatedString.Builder builder;
        int i3;
        int i4;
        int i5;
        int i6;
        int iPushStyle;
        final CharSequence text = charSequence;
        Intrinsics.checkNotNullParameter(text, "text");
        long j3 = (i2 & 4) != 0 ? j : j2;
        LinkInteractionListener linkInteractionListener2 = (i2 & 8) != 0 ? null : linkInteractionListener;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1245331523, i, -1, "com.robinhood.compose.util.annotatedStringResourceV2 (AnnotatedStringResource.kt:98)");
        }
        int i7 = 2;
        if (text instanceof Spanned) {
            int i8 = 0;
            int i9 = 1;
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            Object[] spans = ((Spanned) text).getSpans(0, text.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            List listSortedWith = ArraysKt.sortedWith(spans, new Comparator() { // from class: com.robinhood.compose.util.AnnotatedStringResourceKt$annotatedStringResourceV2_eopBjH0$lambda$9$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((Spanned) text).getSpanStart(t)), Integer.valueOf(((Spanned) text).getSpanStart(t2)));
                }
            });
            int iPushStyle2 = builder2.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                for (Object obj : listSortedWith) {
                    try {
                        int spanStart = ((Spanned) text).getSpanStart(obj);
                        int spanEnd = ((Spanned) text).getSpanEnd(obj);
                        if (spanStart > i8) {
                            builder2.append(text.subSequence(i8, spanStart));
                        }
                        if (obj instanceof StyleSpan) {
                            int style = ((StyleSpan) obj).getStyle();
                            if (style == i9) {
                                iPushStyle = builder2.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                try {
                                    builder2.append(text.subSequence(spanStart, spanEnd));
                                    builder2.pop(iPushStyle);
                                } finally {
                                }
                            } else if (style == i7) {
                                iPushStyle = builder2.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null));
                                try {
                                    builder2.append(text.subSequence(spanStart, spanEnd));
                                } finally {
                                }
                            }
                        } else {
                            if (obj instanceof URLSpan) {
                                String url = ((URLSpan) obj).getURL();
                                Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                                AnnotatedString.Builder builder3 = builder2;
                                i5 = i9;
                                i4 = iPushStyle2;
                                try {
                                    builder = builder3;
                                } catch (Throwable th) {
                                    th = th;
                                    builder = builder3;
                                }
                                try {
                                    int iPushLink = builder.pushLink(new LinkAnnotation.Url(url, new TextLinkStyles(new SpanStyle(j3, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), linkInteractionListener2));
                                    text = charSequence;
                                    i6 = spanEnd;
                                    try {
                                        builder.append(text.subSequence(spanStart, i6));
                                        builder.pop(iPushLink);
                                    } catch (Throwable th2) {
                                        builder.pop(iPushLink);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i3 = i4;
                                    builder.pop(i3);
                                    throw th;
                                }
                            }
                            i8 = i6;
                            builder2 = builder;
                            i9 = i5;
                            iPushStyle2 = i4;
                            i7 = 2;
                        }
                        builder = builder2;
                        i5 = i9;
                        i4 = iPushStyle2;
                        i6 = spanEnd;
                        i8 = i6;
                        builder2 = builder;
                        i9 = i5;
                        iPushStyle2 = i4;
                        i7 = 2;
                    } catch (Throwable th4) {
                        th = th4;
                        builder = builder2;
                        i4 = iPushStyle2;
                    }
                }
                AnnotatedString.Builder builder4 = builder2;
                int i10 = iPushStyle2;
                builder4.append(text.subSequence(i8, text.length()));
                builder4.pop(i10);
                builder4.toAnnotatedString();
                annotatedString = builder4.toAnnotatedString();
            } catch (Throwable th5) {
                th = th5;
                builder = builder2;
                i3 = iPushStyle2;
                builder.pop(i3);
                throw th;
            }
        } else {
            annotatedString = new AnnotatedString(text.toString(), null, 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    /* renamed from: annotatedStringResource-RIQooxk, reason: not valid java name */
    public static final AnnotatedString m22060annotatedStringResourceRIQooxk(int i, long j, long j2, Composer composer, int i2, int i3) {
        long j3 = (i3 & 4) != 0 ? j : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-671783289, i2, -1, "com.robinhood.compose.util.annotatedStringResource (AnnotatedStringResource.kt:167)");
        }
        CharSequence text = resources(composer, 0).getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        AnnotatedString annotatedStringM22061annotatedStringResourceRIQooxk = m22061annotatedStringResourceRIQooxk(text, j, j3, composer, i2 & 1008, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedStringM22061annotatedStringResourceRIQooxk;
    }

    /* renamed from: annotatedStringResourceV2-eopBjH0, reason: not valid java name */
    public static final AnnotatedString m22062annotatedStringResourceV2eopBjH0(int i, long j, long j2, LinkInteractionListener linkInteractionListener, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            j2 = j;
        }
        if ((i3 & 8) != 0) {
            linkInteractionListener = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1966239765, i2, -1, "com.robinhood.compose.util.annotatedStringResourceV2 (AnnotatedStringResource.kt:189)");
        }
        CharSequence text = resources(composer, 0).getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        AnnotatedString annotatedStringM22063annotatedStringResourceV2eopBjH0 = m22063annotatedStringResourceV2eopBjH0(text, j, j2, linkInteractionListener, composer, i2 & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedStringM22063annotatedStringResourceV2eopBjH0;
    }
}
