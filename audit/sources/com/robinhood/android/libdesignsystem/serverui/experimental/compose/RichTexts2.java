package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.net.Uri;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
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
import com.adjust.sdk.Constants;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RichTexts.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0013\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u0014\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0002\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0002\u001a(\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0\u001dH\u0000\"\u000e\u0010\u001f\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"toAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "Lcom/robinhood/models/serverdriven/db/RichText;", "linkColor", "Landroidx/compose/ui/graphics/Color;", "toAnnotatedString-iJQMabo", "(Lcom/robinhood/models/serverdriven/db/RichText;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedStringV2", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "toAnnotatedStringV2-3IgeMak", "(Lcom/robinhood/models/serverdriven/db/RichText;JLandroidx/compose/ui/text/LinkInteractionListener;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "combineStyles", "Landroidx/compose/ui/text/SpanStyle;", "attributes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/db/RichText$Attribute;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/SpanStyle;", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;JLandroidx/compose/ui/text/LinkInteractionListener;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "hasLink", "", "firstClickableLinkText", "", "onClick", "", "offset", "", "Lkotlin/Function1;", "Landroid/net/Uri;", "TAG_LINK", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTextsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class RichTexts2 {
    private static final String TAG_LINK = "link";

    /* renamed from: toAnnotatedString-iJQMabo, reason: not valid java name */
    public static final AnnotatedString m15956toAnnotatedStringiJQMabo(RichText toAnnotatedString, long j, Composer composer, int i, int i2) {
        SpanStyle spanStyle;
        Intrinsics.checkNotNullParameter(toAnnotatedString, "$this$toAnnotatedString");
        composer.startReplaceGroup(210325380);
        int i3 = 1;
        long jM21368getAccent0d7_KjU = (i2 & 1) != 0 ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU() : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(210325380, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toAnnotatedString (RichTexts.kt:31)");
        }
        int i4 = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(i4, i3, null);
        builder.append(toAnnotatedString.getText());
        composer.startReplaceGroup(259233934);
        for (RichText.Attribute attribute : toAnnotatedString.getAttributes()) {
            RichText.TextStyle style = attribute.getStyle();
            composer.startReplaceGroup(259235033);
            if (style == RichText.TextStyle.BOLD) {
                spanStyle = new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null);
            } else if (style == RichText.TextStyle.ITALIC) {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null);
            } else if (style == RichText.TextStyle.UNDERLINE) {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null);
            } else {
                if (style == RichText.TextStyle.HIGHLIGHT) {
                    ThemedColor highlight_color = attribute.getHighlight_color();
                    com.robinhood.models.serverdriven.experimental.api.ThemedColor sduiThemedColor = highlight_color != null ? SduiColors2.toSduiThemedColor(highlight_color) : null;
                    Color composeColor = sduiThemedColor == null ? null : SduiColors2.toComposeColor(sduiThemedColor, composer, i4);
                    if (composeColor != null) {
                        spanStyle = new SpanStyle(composeColor.getValue(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null);
                    }
                } else if (style != null) {
                    throw new NoWhenBranchMatchedException();
                }
                spanStyle = null;
            }
            composer.endReplaceGroup();
            int location = attribute.getLocation() + attribute.getLength();
            if (spanStyle != null) {
                builder.addStyle(spanStyle, attribute.getLocation(), location);
            }
            Uri link = attribute.getLink();
            if (link != null) {
                if (Intrinsics.areEqual(link, Uri.EMPTY)) {
                    link = null;
                }
                if (link != null) {
                    String string2 = link.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    builder.addStringAnnotation(TAG_LINK, string2, attribute.getLocation(), location);
                    if (!Color.m6707equalsimpl0(jM21368getAccent0d7_KjU, Color.INSTANCE.m6726getUnspecified0d7_KjU())) {
                        builder.addStyle(new SpanStyle(jM21368getAccent0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), attribute.getLocation(), location);
                    }
                }
            }
            i4 = 0;
        }
        composer.endReplaceGroup();
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }

    /* renamed from: toAnnotatedStringV2-3IgeMak, reason: not valid java name */
    public static final AnnotatedString m15958toAnnotatedStringV23IgeMak(RichText richText, long j, LinkInteractionListener linkInteractionListener, Composer composer, int i, int i2) {
        Object next;
        int i3;
        List list;
        int i4;
        boolean z;
        int iPushStyle;
        Composer composer2 = composer;
        RichText toAnnotatedStringV2 = richText;
        Intrinsics.checkNotNullParameter(toAnnotatedStringV2, "$this$toAnnotatedStringV2");
        composer2.startReplaceGroup(-1022823648);
        long jM21368getAccent0d7_KjU = (i2 & 1) != 0 ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21368getAccent0d7_KjU() : j;
        DefaultConstructorMarker defaultConstructorMarker = null;
        LinkInteractionListener linkInteractionListener2 = (i2 & 2) != 0 ? null : linkInteractionListener;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022823648, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toAnnotatedStringV2 (RichTexts.kt:81)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, defaultConstructorMarker);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(0);
        linkedHashSet.add(Integer.valueOf(toAnnotatedStringV2.getText().length()));
        for (RichText.Attribute attribute : toAnnotatedStringV2.getAttributes()) {
            linkedHashSet.add(Integer.valueOf(attribute.getLocation()));
            linkedHashSet.add(Integer.valueOf(attribute.getLocation() + attribute.getLength()));
        }
        List listSorted = CollectionsKt.sorted(linkedHashSet);
        composer2.startReplaceGroup(614017995);
        int size = listSorted.size() - 1;
        int i5 = 0;
        while (i5 < size) {
            int iIntValue = ((Number) listSorted.get(i5)).intValue();
            int i6 = i5 + 1;
            int iIntValue2 = ((Number) listSorted.get(i6)).intValue();
            List<RichText.Attribute> attributes = toAnnotatedStringV2.getAttributes();
            ArrayList arrayList = new ArrayList();
            for (Object obj : attributes) {
                RichText.Attribute attribute2 = (RichText.Attribute) obj;
                int location = attribute2.getLocation();
                int location2 = attribute2.getLocation() + attribute2.getLength();
                if (location < iIntValue2 && location2 > iIntValue) {
                    arrayList.add(obj);
                }
            }
            String strSubstring = toAnnotatedStringV2.getText().substring(iIntValue, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            SpanStyle spanStyleCombineStyles = combineStyles(extensions2.toPersistentList(arrayList), composer2, 0);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RichText.Attribute) next).getLink() != null) {
                    break;
                }
            }
            RichText.Attribute attribute3 = (RichText.Attribute) next;
            if (attribute3 != null) {
                z = false;
                i4 = i6;
                list = listSorted;
                i3 = size;
                int iPushLink = builder.pushLink(new LinkAnnotation.Url(String.valueOf(attribute3.getLink()), new TextLinkStyles(new SpanStyle(jM21368getAccent0d7_KjU, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), linkInteractionListener2));
                if (spanStyleCombineStyles == null) {
                    builder.append(strSubstring);
                } else {
                    try {
                        iPushStyle = builder.pushStyle(spanStyleCombineStyles);
                        try {
                            builder.append(strSubstring);
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                        } finally {
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushLink);
            } else {
                i3 = size;
                list = listSorted;
                i4 = i6;
                z = false;
                if (spanStyleCombineStyles == null) {
                    builder.append(strSubstring);
                } else {
                    iPushStyle = builder.pushStyle(spanStyleCombineStyles);
                    try {
                        builder.append(strSubstring);
                        Unit unit3 = Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            toAnnotatedStringV2 = richText;
            composer2 = composer;
            i5 = i4;
            listSorted = list;
            size = i3;
        }
        composer.endReplaceGroup();
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }

    private static final SpanStyle combineStyles(ImmutableList<RichText.Attribute> immutableList, Composer composer, int i) {
        composer.startReplaceGroup(-1221708389);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1221708389, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.combineStyles (RichTexts.kt:152)");
        }
        if (immutableList.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Color colorM6701boximpl = null;
        FontWeight bold = null;
        FontStyle fontStyleM7700boximpl = null;
        TextDecoration underline = null;
        for (RichText.Attribute attribute : immutableList) {
            RichText.TextStyle style = attribute.getStyle();
            composer.startReplaceGroup(-1535678183);
            if (style == RichText.TextStyle.BOLD) {
                bold = FontWeight.INSTANCE.getBold();
                Unit unit = Unit.INSTANCE;
            } else if (style == RichText.TextStyle.ITALIC) {
                fontStyleM7700boximpl = FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA());
                Unit unit2 = Unit.INSTANCE;
            } else if (style == RichText.TextStyle.UNDERLINE) {
                underline = TextDecoration.INSTANCE.getUnderline();
                Unit unit3 = Unit.INSTANCE;
            } else if (style == RichText.TextStyle.HIGHLIGHT) {
                ThemedColor highlight_color = attribute.getHighlight_color();
                com.robinhood.models.serverdriven.experimental.api.ThemedColor sduiThemedColor = highlight_color != null ? SduiColors2.toSduiThemedColor(highlight_color) : null;
                Color composeColor = sduiThemedColor == null ? null : SduiColors2.toComposeColor(sduiThemedColor, composer, 0);
                if (composeColor != null) {
                    colorM6701boximpl = Color.m6701boximpl(composeColor.getValue());
                    Unit unit4 = Unit.INSTANCE;
                }
            } else {
                if (style != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit5 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        }
        SpanStyle spanStyle = new SpanStyle(colorM6701boximpl != null ? colorM6701boximpl.getValue() : Color.INSTANCE.m6726getUnspecified0d7_KjU(), 0L, bold, fontStyleM7700boximpl, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, underline, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61426, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spanStyle;
    }

    /* renamed from: toAnnotatedString-iJQMabo, reason: not valid java name */
    public static final AnnotatedString m15957toAnnotatedStringiJQMabo(com.robinhood.models.serverdriven.experimental.api.RichText toAnnotatedString, long j, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(toAnnotatedString, "$this$toAnnotatedString");
        composer.startReplaceGroup(210325380);
        if ((i2 & 1) != 0) {
            j = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU();
        }
        long j2 = j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(210325380, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toAnnotatedString (RichTexts.kt:185)");
        }
        AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = m15956toAnnotatedStringiJQMabo(IconExtensions.toDbRichText(toAnnotatedString), j2, composer, i & 112, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedStringM15956toAnnotatedStringiJQMabo;
    }

    /* renamed from: toAnnotatedStringV2-3IgeMak, reason: not valid java name */
    public static final AnnotatedString m15959toAnnotatedStringV23IgeMak(com.robinhood.models.serverdriven.experimental.api.RichText toAnnotatedStringV2, long j, LinkInteractionListener linkInteractionListener, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(toAnnotatedStringV2, "$this$toAnnotatedStringV2");
        composer.startReplaceGroup(-1022823648);
        if ((i2 & 1) != 0) {
            j = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU();
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            linkInteractionListener = null;
        }
        LinkInteractionListener linkInteractionListener2 = linkInteractionListener;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022823648, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toAnnotatedStringV2 (RichTexts.kt:194)");
        }
        AnnotatedString annotatedStringM15958toAnnotatedStringV23IgeMak = m15958toAnnotatedStringV23IgeMak(IconExtensions.toDbRichText(toAnnotatedStringV2), j2, linkInteractionListener2, composer, i & 1008, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedStringM15958toAnnotatedStringV23IgeMak;
    }

    public static final boolean hasLink(RichText richText) {
        Intrinsics.checkNotNullParameter(richText, "<this>");
        List<RichText.Attribute> attributes = richText.getAttributes();
        if ((attributes instanceof Collection) && attributes.isEmpty()) {
            return false;
        }
        for (RichText.Attribute attribute : attributes) {
            if (attribute.getLink() != null && !Intrinsics.areEqual(attribute.getLink(), Uri.EMPTY)) {
                return true;
            }
        }
        return false;
    }

    public static final String firstClickableLinkText(RichText richText) {
        Object next;
        Intrinsics.checkNotNullParameter(richText, "<this>");
        Iterator<T> it = richText.getAttributes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RichText.Attribute attribute = (RichText.Attribute) next;
            if (attribute.getLink() != null && !Intrinsics.areEqual(attribute.getLink(), Uri.EMPTY)) {
                break;
            }
        }
        RichText.Attribute attribute2 = (RichText.Attribute) next;
        if (attribute2 == null) {
            return null;
        }
        String strSubstring = richText.getText().substring(attribute2.getLocation(), attribute2.getLocation() + attribute2.getLength());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void onClick(AnnotatedString annotatedString, int i, Function1<? super Uri, Unit> onClick) {
        String str;
        Uri uriBuild;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations(TAG_LINK, i, i + 1));
        if (range == null || (str = (String) range.getItem()) == null || (uriBuild = Uri.parse(str)) == null) {
            return;
        }
        if (uriBuild.getScheme() == null) {
            uriBuild = uriBuild.buildUpon().scheme(Constants.SCHEME).build();
        }
        Intrinsics.checkNotNull(uriBuild);
        onClick.invoke(uriBuild);
    }
}
