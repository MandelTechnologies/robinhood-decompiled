package com.robinhood.android.shared.serverui.utils;

import android.net.Uri;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
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
import com.robinhood.android.markdown.compose.CustomMarkdownParser;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.markdown.compose.Nodes2;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.commonmark.node.Link;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: SduiCustomMarkdownParser.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0010H\u0002J\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0010H\u0002J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/shared/serverui/utils/SduiCustomMarkdownParser;", "Lcom/robinhood/android/markdown/compose/CustomMarkdownParser;", "<init>", "()V", "link", "", "Lorg/commonmark/node/Link;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "markdownStyle", "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "(Lorg/commonmark/node/Link;Landroidx/compose/ui/text/AnnotatedString$Builder;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Landroidx/compose/runtime/Composer;I)Z", "buildSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "destinations", "Lkotlinx/collections/immutable/ImmutableList;", "", "buildSpanStyle$lib_sdui_utils_externalRelease", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/SpanStyle;", "isColorScheme", "isStrikethroughScheme", "parseLinkForThemedColor", "Lrh_server_driven_ui/v1/ThemedColor;", "destination", "parseLinkForThemedColor$lib_sdui_utils_externalRelease", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lrh_server_driven_ui/v1/ThemedColor;", "lib-sdui-utils_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class SduiCustomMarkdownParser extends CustomMarkdownParser {
    public static final SduiCustomMarkdownParser INSTANCE = new SduiCustomMarkdownParser();
    public static final int $stable = CustomMarkdownParser.$stable;

    private SduiCustomMarkdownParser() {
    }

    @Override // com.robinhood.android.markdown.compose.CustomMarkdownParser
    public boolean link(Link link, AnnotatedString.Builder builder, MarkdownStyle markdownStyle, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(markdownStyle, "markdownStyle");
        composer.startReplaceGroup(-703380152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-703380152, i, -1, "com.robinhood.android.shared.serverui.utils.SduiCustomMarkdownParser.link (SduiCustomMarkdownParser.kt:27)");
        }
        String destination = link.getDestination();
        Intrinsics.checkNotNullExpressionValue(destination, "getDestination(...)");
        List<String> listSplit$default = StringsKt.split$default((CharSequence) destination, new String[]{"|"}, false, 0, 6, (Object) null);
        if (!(listSplit$default instanceof Collection) || !listSplit$default.isEmpty()) {
            for (String str : listSplit$default) {
                SduiCustomMarkdownParser sduiCustomMarkdownParser = INSTANCE;
                if (sduiCustomMarkdownParser.isColorScheme(str) || sduiCustomMarkdownParser.isStrikethroughScheme(str)) {
                    int iPushStyle = builder.pushStyle(buildSpanStyle$lib_sdui_utils_externalRelease(extensions2.toImmutableList(listSplit$default), composer, (CustomMarkdownParser.$stable << 3) | ((i >> 6) & 112)));
                    int i2 = i & 14;
                    try {
                        Nodes2.annotate(link, builder, markdownStyle, composer, (i & 896) | i2 | (AnnotatedString.Builder.$stable << 3) | (MarkdownStyle.$stable << 6));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return true;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return false;
    }

    public final SpanStyle buildSpanStyle$lib_sdui_utils_externalRelease(ImmutableList<String> destinations, Composer composer, int i) {
        SpanStyle spanStyleM7595copyGSF8kmg$default;
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        composer.startReplaceGroup(108368039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(108368039, i, -1, "com.robinhood.android.shared.serverui.utils.SduiCustomMarkdownParser.buildSpanStyle (SduiCustomMarkdownParser.kt:46)");
        }
        SpanStyle spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        SpanStyle spanStyle2 = spanStyle;
        for (String str : destinations) {
            composer.startReplaceGroup(1062477605);
            SduiCustomMarkdownParser sduiCustomMarkdownParser = INSTANCE;
            if (sduiCustomMarkdownParser.isColorScheme(str)) {
                ThemedColor linkForThemedColor$lib_sdui_utils_externalRelease = sduiCustomMarkdownParser.parseLinkForThemedColor$lib_sdui_utils_externalRelease(str, composer, CustomMarkdownParser.$stable << 3);
                Color composeColor = linkForThemedColor$lib_sdui_utils_externalRelease == null ? null : SduiColors2.toComposeColor(linkForThemedColor$lib_sdui_utils_externalRelease, composer, 0);
                if (composeColor != null) {
                    spanStyleM7595copyGSF8kmg$default = SpanStyle.m7595copyGSF8kmg$default(spanStyle2, composeColor.getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
                    spanStyle2 = spanStyleM7595copyGSF8kmg$default;
                }
            } else if (sduiCustomMarkdownParser.isStrikethroughScheme(str)) {
                spanStyleM7595copyGSF8kmg$default = SpanStyle.m7595copyGSF8kmg$default(spanStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getLineThrough(), null, null, null, 61439, null);
                spanStyle2 = spanStyleM7595copyGSF8kmg$default;
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spanStyle2;
    }

    private final boolean isColorScheme(String str) {
        return StringsKt.startsWith$default(str, "color://", false, 2, (Object) null);
    }

    private final boolean isStrikethroughScheme(String str) {
        return StringsKt.startsWith$default(str, "strikethrough://", false, 2, (Object) null);
    }

    public final ThemedColor parseLinkForThemedColor$lib_sdui_utils_externalRelease(String destination, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343051292, i, -1, "com.robinhood.android.shared.serverui.utils.SduiCustomMarkdownParser.parseLinkForThemedColor (SduiCustomMarkdownParser.kt:79)");
        }
        if (StringsKt.startsWith$default(destination, "color://", false, 2, (Object) null)) {
            try {
                Uri uri = Uri.parse(destination);
                String queryParameter = uri.getQueryParameter("light");
                rh_server_driven_ui.p531v1.Color colorValueOf = queryParameter != null ? rh_server_driven_ui.p531v1.Color.valueOf(queryParameter) : null;
                String queryParameter2 = uri.getQueryParameter("dark");
                rh_server_driven_ui.p531v1.Color colorValueOf2 = queryParameter2 != null ? rh_server_driven_ui.p531v1.Color.valueOf(queryParameter2) : null;
                if (colorValueOf != null && colorValueOf2 != null) {
                    ThemedColor themedColor = new ThemedColor(colorValueOf, colorValueOf2, null, 4, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return themedColor;
                }
            } catch (Exception unused) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return null;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return null;
    }
}
