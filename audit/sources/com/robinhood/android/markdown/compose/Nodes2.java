package com.robinhood.android.markdown.compose;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Code;
import org.commonmark.node.Emphasis;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;

/* compiled from: Nodes.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"annotate", "", "Lorg/commonmark/node/Node;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "markdownStyle", "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "(Lorg/commonmark/node/Node;Landroidx/compose/ui/text/AnnotatedString$Builder;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Landroidx/compose/runtime/Composer;I)V", "lib-markdown-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.markdown.compose.NodesKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class Nodes2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit annotate$lambda$4(Node node, AnnotatedString.Builder builder, MarkdownStyle markdownStyle, int i, Composer composer, int i2) {
        annotate(node, builder, markdownStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @SuppressLint({"ComposableNaming"})
    public static final void annotate(final Node node, final AnnotatedString.Builder builder, final MarkdownStyle markdownStyle, Composer composer, final int i) {
        CustomMarkdownParser customMarkdownParser;
        int iPushStyle;
        ApplicationComponentManagerHolder applicationComponentManagerHolder;
        Intrinsics.checkNotNullParameter(node, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(markdownStyle, "markdownStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(412224037);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(node) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(builder) : composerStartRestartGroup.changedInstance(builder) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(markdownStyle) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(412224037, i3, -1, "com.robinhood.android.markdown.compose.annotate (Nodes.kt:35)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            try {
                if (context instanceof Application) {
                    applicationComponentManagerHolder = (ApplicationComponentManagerHolder) ((Application) context);
                } else {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    applicationComponentManagerHolder = (ApplicationComponentManagerHolder) ((Application) applicationContext);
                }
                customMarkdownParser = ((CustomMarkdownParser2) applicationComponentManagerHolder.getComponentManager().get()).customMarkdownParser();
            } catch (Exception unused) {
                customMarkdownParser = null;
            }
            for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                composerStartRestartGroup.startReplaceGroup(1010332330);
                composerStartRestartGroup.startReplaceGroup(1010330667);
                Boolean boolValueOf = customMarkdownParser == null ? null : Boolean.valueOf(customMarkdownParser.annotate$lib_markdown_compose_externalDebug(firstChild, builder, markdownStyle, composerStartRestartGroup, (AnnotatedString.Builder.$stable << 3) | (i3 & 112) | (i3 & 896)));
                composerStartRestartGroup.endReplaceGroup();
                if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                    if (firstChild instanceof Code) {
                        composerStartRestartGroup.startReplaceGroup(1010334449);
                        composerStartRestartGroup.endReplaceGroup();
                        iPushStyle = builder.pushStyle(SpanStyle.m7595copyGSF8kmg$default(markdownStyle.getCode().getTextStyle().toSpanStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, markdownStyle.getCode().m16273getBg0d7_KjU(), null, null, null, null, 63487, null));
                        try {
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            String literal = ((Code) firstChild).getLiteral();
                            Intrinsics.checkNotNullExpressionValue(literal, "getLiteral(...)");
                            builder.append(literal);
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            Unit unit = Unit.INSTANCE;
                        } finally {
                        }
                    } else if (firstChild instanceof Emphasis) {
                        composerStartRestartGroup.startReplaceGroup(1255901951);
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null));
                        try {
                            annotate(firstChild, builder, markdownStyle, composerStartRestartGroup, (AnnotatedString.Builder.$stable << 3) | (i3 & 896));
                            Unit unit2 = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                        } finally {
                        }
                    } else if (firstChild instanceof HardLineBreak) {
                        composerStartRestartGroup.startReplaceGroup(1010352659);
                        composerStartRestartGroup.endReplaceGroup();
                        builder.append("\n\n");
                    } else if (firstChild instanceof Image) {
                        composerStartRestartGroup.startReplaceGroup(1010354359);
                        composerStartRestartGroup.endReplaceGroup();
                        String destination = ((Image) firstChild).getDestination();
                        Intrinsics.checkNotNullExpressionValue(destination, "getDestination(...)");
                        InlineTextContent2.appendInlineContent(builder, MarkdownText4.TagImageUrl, destination);
                    } else if (firstChild instanceof Link) {
                        composerStartRestartGroup.startReplaceGroup(1256328728);
                        String destination2 = ((Link) firstChild).getDestination();
                        Intrinsics.checkNotNullExpressionValue(destination2, "getDestination(...)");
                        int iPushLink = builder.pushLink(new LinkAnnotation.Url(destination2, new TextLinkStyles(new SpanStyle(markdownStyle.getLink().m16277getColor0d7_KjU(), 0L, markdownStyle.getLink().getBold() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, markdownStyle.getLink().getDottedUnderline() ? TextDecoration.INSTANCE.getNone() : TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                        try {
                            annotate(firstChild, builder, markdownStyle, composerStartRestartGroup, (AnnotatedString.Builder.$stable << 3) | (i3 & 896));
                            Unit unit3 = Unit.INSTANCE;
                            builder.pop(iPushLink);
                            composerStartRestartGroup.endReplaceGroup();
                        } catch (Throwable th) {
                            builder.pop(iPushLink);
                            throw th;
                        }
                    } else if (firstChild instanceof Paragraph) {
                        composerStartRestartGroup.startReplaceGroup(1010397274);
                        annotate(firstChild, builder, markdownStyle, composerStartRestartGroup, (AnnotatedString.Builder.$stable << 3) | (i3 & 112) | (i3 & 896));
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof SoftLineBreak) {
                        composerStartRestartGroup.startReplaceGroup(1010402385);
                        composerStartRestartGroup.endReplaceGroup();
                        builder.append("\n");
                    } else if (firstChild instanceof StrongEmphasis) {
                        composerStartRestartGroup.startReplaceGroup(1257764896);
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            annotate(firstChild, builder, markdownStyle, composerStartRestartGroup, (AnnotatedString.Builder.$stable << 3) | (i3 & 896));
                            Unit unit4 = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                        } finally {
                        }
                    } else if (firstChild instanceof Text) {
                        composerStartRestartGroup.startReplaceGroup(1010409465);
                        composerStartRestartGroup.endReplaceGroup();
                        String literal2 = ((Text) firstChild).getLiteral();
                        Intrinsics.checkNotNullExpressionValue(literal2, "getLiteral(...)");
                        builder.append(literal2);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1257955453);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.NodesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Nodes2.annotate$lambda$4(node, builder, markdownStyle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
