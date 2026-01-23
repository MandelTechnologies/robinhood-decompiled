package com.robinhood.android.markdown.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material.Divider2;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.compose.extendedspans.DottedUnderlineSpanPainter;
import com.robinhood.utils.compose.extendedspans.ExtendedSpans;
import com.robinhood.utils.compose.extendedspans.ExtendedSpans2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Document;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.ListBlock;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.Parser;

/* compiled from: MarkdownText.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'\u001a/\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b,\u0010-\u001a'\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b0\u00101\u001aR\u00109\u001a\u00020\u00052\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020*2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000504H\u0003¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;H\u0003¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0000H\u0003¢\u0006\u0004\bD\u0010E\u001a1\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\bG\u0010\u000b\u001a\u0013\u0010I\u001a\u00020H*\u00020\tH\u0002¢\u0006\u0004\bI\u0010J\u001a\u001b\u0010L\u001a\u00020\u0005*\u00020K2\u0006\u00107\u001a\u00020\tH\u0003¢\u0006\u0004\bL\u0010M\"\u001a\u0010N\u001a\u00020\u00008\u0000X\u0080T¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010Q\"\u001a\u0010R\u001a\u00020\u00008\u0000X\u0080T¢\u0006\f\n\u0004\bR\u0010O\u0012\u0004\bS\u0010Q¨\u0006V²\u0006\u0010\u0010U\u001a\u0004\u0018\u00010T8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "rawMarkdownString", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onTextClick", "MarkdownText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lorg/commonmark/node/Node;", "markdownNode", "(Lorg/commonmark/node/Node;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lorg/commonmark/node/Document;", "document", "Document", "(Lorg/commonmark/node/Document;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lorg/commonmark/node/Heading;", "heading", "Heading", "(Lorg/commonmark/node/Heading;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "MarkdownAnnotatedText", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/Paragraph;", "paragraph", "Paragraph", "(Lorg/commonmark/node/Paragraph;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ThematicBreak", "(Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/Image;", "image", "Image", "(Lorg/commonmark/node/Image;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/IndentedCodeBlock;", "codeBlock", "IndentedCodeBlock", "(Lorg/commonmark/node/IndentedCodeBlock;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/BulletList;", "bulletList", "", "level", "BulletList", "(Lorg/commonmark/node/BulletList;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/OrderedList;", "orderedList", "OrderedList", "(Lorg/commonmark/node/OrderedList;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/ListBlock;", "listBlock", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "node", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "ListItems", "(Lorg/commonmark/node/ListBlock;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/BlockQuote;", "blockQuote", "BlockQuote", "(Lorg/commonmark/node/BlockQuote;Landroidx/compose/runtime/Composer;I)V", "Lorg/commonmark/node/FencedCodeBlock;", "fencedCodeBlock", "FencedCodeBlock", "(Lorg/commonmark/node/FencedCodeBlock;Landroidx/compose/runtime/Composer;I)V", "codeString", "CodeBlock", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "parent", "MarkdownBlockChildren", "", "isEndOfDocument", "(Lorg/commonmark/node/Node;)Z", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "annotateStringFromNode", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Lorg/commonmark/node/Node;Landroidx/compose/runtime/Composer;I)V", "TagUrl", "Ljava/lang/String;", "getTagUrl$annotations", "()V", "TagImageUrl", "getTagImageUrl$annotations", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "lib-markdown-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.markdown.compose.MarkdownTextKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class MarkdownText4 {
    public static final String TagImageUrl = "imageUrl";
    public static final String TagUrl = "url";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockQuote$lambda$35(BlockQuote blockQuote, int i, Composer composer, int i2) {
        BlockQuote(blockQuote, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BulletList$lambda$25(BulletList bulletList, int i, Function0 function0, int i2, Composer composer, int i3) {
        BulletList(bulletList, i, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlock$lambda$38(String str, int i, Composer composer, int i2) {
        CodeBlock(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Document$lambda$3(Document document, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        Document(document, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FencedCodeBlock$lambda$36(FencedCodeBlock fencedCodeBlock, int i, Composer composer, int i2) {
        FencedCodeBlock(fencedCodeBlock, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$4(Heading heading, Function0 function0, int i, Composer composer, int i2) {
        Heading(heading, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$7(Heading heading, Function0 function0, int i, Composer composer, int i2) {
        Heading(heading, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Image$lambda$23(Image image, int i, Composer composer, int i2) {
        Image(image, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndentedCodeBlock$lambda$24(IndentedCodeBlock indentedCodeBlock, int i, Composer composer, int i2) {
        IndentedCodeBlock(indentedCodeBlock, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItems$lambda$29(ListBlock listBlock, int i, Function0 function0, Function3 function3, int i2, Composer composer, int i3) {
        ListItems(listBlock, i, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownAnnotatedText$lambda$16(AnnotatedString annotatedString, TextStyle textStyle, Function0 function0, int i, Composer composer, int i2) {
        MarkdownAnnotatedText(annotatedString, textStyle, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownBlockChildren$lambda$40(Node node, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        MarkdownBlockChildren(node, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText$lambda$1(String str, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        MarkdownText(str, modifier, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText$lambda$2(Node node, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        MarkdownText(node, modifier, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderedList$lambda$26(OrderedList orderedList, Function0 function0, int i, Composer composer, int i2) {
        OrderedList(orderedList, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Paragraph$lambda$20(Paragraph paragraph, Function0 function0, int i, Composer composer, int i2) {
        Paragraph(paragraph, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThematicBreak$lambda$21(int i, Composer composer, int i2) {
        ThematicBreak(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit annotateStringFromNode$lambda$41(AnnotatedString.Builder builder, Node node, int i, Composer composer, int i2) {
        annotateStringFromNode(builder, node, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTagImageUrl$annotations() {
    }

    public static /* synthetic */ void getTagUrl$annotations() {
    }

    public static final void MarkdownText(final String rawMarkdownString, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(rawMarkdownString, "rawMarkdownString");
        Composer composerStartRestartGroup = composer.startRestartGroup(497769071);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rawMarkdownString) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function0 = null;
            }
            Function0<Unit> function03 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(497769071, i3, -1, "com.robinhood.android.markdown.compose.MarkdownText (MarkdownText.kt:66)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Parser.builder().build();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Node node = ((Parser) objRememberedValue).parse(rawMarkdownString);
            Intrinsics.checkNotNull(node, "null cannot be cast to non-null type org.commonmark.node.Document");
            Modifier modifier3 = modifier;
            Document((Document) node, modifier3, function03, composerStartRestartGroup, i3 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function02 = function03;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.MarkdownText$lambda$1(rawMarkdownString, modifier2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MarkdownText(final Node markdownNode, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Function0<Unit> function02;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(markdownNode, "markdownNode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2144949024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(markdownNode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            Function0<Unit> function03 = i5 != 0 ? null : function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2144949024, i3, -1, "com.robinhood.android.markdown.compose.MarkdownText (MarkdownText.kt:73)");
            }
            int i6 = i3 & 1022;
            Function0<Unit> function04 = function03;
            Modifier modifier4 = modifier3;
            MarkdownBlockChildren(markdownNode, modifier4, function04, composerStartRestartGroup, i6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            function02 = function04;
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.MarkdownText$lambda$2(markdownNode, modifier2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Document(Document document, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Document document2;
        final Function0<Unit> function02;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071383430);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(document) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1071383430, i3, -1, "com.robinhood.android.markdown.compose.Document (MarkdownText.kt:78)");
            }
            MarkdownBlockChildren(document, modifier3, function0, composerStartRestartGroup, i3 & 1022, 0);
            document2 = document;
            function02 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
            modifier2 = modifier;
            document2 = document;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.Document$lambda$3(document2, modifier2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Heading(final Heading heading, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        TextStyle h1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500717003);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(heading) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500717003, i2, -1, "com.robinhood.android.markdown.compose.Heading (MarkdownText.kt:83)");
            }
            MarkdownStyle markdownStyle = (MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle());
            int level = heading.getLevel();
            composerStartRestartGroup.startReplaceGroup(919976680);
            switch (level) {
                case 1:
                    h1 = markdownStyle.getHeading().getH1();
                    break;
                case 2:
                    h1 = markdownStyle.getHeading().getH2();
                    break;
                case 3:
                    h1 = markdownStyle.getHeading().getH3();
                    break;
                case 4:
                    h1 = markdownStyle.getHeading().getH4();
                    break;
                case 5:
                    h1 = markdownStyle.getHeading().getH5();
                    break;
                case 6:
                    h1 = markdownStyle.getHeading().getH6();
                    break;
                default:
                    MarkdownBlockChildren(heading, null, function0, composerStartRestartGroup, ((i2 << 3) & 896) | (i2 & 14), 2);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MarkdownText4.Heading$lambda$4(heading, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
            }
            TextStyle textStyle = h1;
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, LineBreak.INSTANCE.m7858getHeadingrAG3T2k(), 0, null, 14680063, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-912200293);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int i3 = i2 << 3;
            annotateStringFromNode(builder, heading, composerStartRestartGroup, AnnotatedString.Builder.$stable | (i3 & 112));
            if (markdownStyle.getHeading().getAppendNewLine() && !isEndOfDocument(heading)) {
                builder.append("\n");
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            MarkdownAnnotatedText(annotatedString, textStyleM7655copyp1EtxEg$default, function0, composerStartRestartGroup, i3 & 896);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.Heading$lambda$7(heading, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult MarkdownAnnotatedText$lambda$9(SnapshotState<TextLayoutResult> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarkdownAnnotatedText(final AnnotatedString annotatedString, final TextStyle textStyle, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z;
        Modifier modifierPointerInput;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(248863970);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248863970, i2, -1, "com.robinhood.android.markdown.compose.MarkdownAnnotatedText (MarkdownText.kt:113)");
            }
            final MarkdownStyle markdownStyle = (MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle());
            UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final ExtendedSpans extendedSpans = new ExtendedSpans(new DottedUnderlineSpanPainter(Color.m6701boximpl(markdownStyle.getLink().m16277getColor0d7_KjU()), defaultConstructorMarker));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
                if ((stringAnnotations instanceof Collection) && stringAnnotations.isEmpty()) {
                    z = false;
                    objRememberedValue2 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    Iterator<T> it = stringAnnotations.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((AnnotatedString.Range) it.next()).getTag(), "url")) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    objRememberedValue2 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue2).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = zBooleanValue || function0 != null;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1359860368);
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler) | ((i2 & 896) == 256);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new MarkdownText5(snapshotState, function0, uriHandler);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, uriHandler, (PointerInputEventHandler) objRememberedValue3);
            } else {
                modifierPointerInput = companion2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierDrawBehind = ExtendedSpans2.drawBehind(companion2.then(modifierPointerInput), extendedSpans);
            AnnotatedString annotatedStringExtend = extendedSpans.extend(annotatedString);
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null);
            long jM16265getTextColor0d7_KjU = markdownStyle.m16265getTextColor0d7_KjU();
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(TagImageUrl, new InlineTextContent(new Placeholder(textStyle.m7662getFontSizeXSAIIZE(), textStyle.m7662getFontSizeXSAIIZE(), PlaceholderVerticalAlign.INSTANCE.m7578getTextBottomJ6kI3mc(), null), MarkdownText2.INSTANCE.getLambda$246295360$lib_markdown_compose_externalDebug())));
            TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(markdownStyle.m16264getTextAligne0LSkKk());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(markdownStyle) | composerStartRestartGroup.changed(extendedSpans);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarkdownText4.MarkdownAnnotatedText$lambda$15$lambda$14(markdownStyle, extendedSpans, snapshotState, (TextLayoutResult) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m5666TextIbK3jfQ(annotatedStringExtend, modifierDrawBehind, jM16265getTextColor0d7_KjU, 0L, null, null, null, 0L, null, textAlignM7912boximpl, 0L, 0, false, 0, 0, mapMapOf, (Function1) objRememberedValue4, textStyleM7655copyp1EtxEg$default, composer2, 0, 0, 32248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.MarkdownAnnotatedText$lambda$16(annotatedString, textStyle, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownAnnotatedText$lambda$15$lambda$14(MarkdownStyle markdownStyle, ExtendedSpans extendedSpans, SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        if (markdownStyle.getLink().getDottedUnderline()) {
            extendedSpans.onTextLayout(it);
        }
        return Unit.INSTANCE;
    }

    private static final void Paragraph(final Paragraph paragraph, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(973505757);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(paragraph) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973505757, i2, -1, "com.robinhood.android.markdown.compose.Paragraph (MarkdownText.kt:203)");
            }
            if ((paragraph.getFirstChild() instanceof Image) && Intrinsics.areEqual(paragraph.getFirstChild(), paragraph.getLastChild())) {
                composerStartRestartGroup.startReplaceGroup(2091008306);
                Node firstChild = paragraph.getFirstChild();
                Intrinsics.checkNotNull(firstChild, "null cannot be cast to non-null type org.commonmark.node.Image");
                Image((Image) firstChild, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2091113427);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextStyle defaultTextStyle = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultTextStyle();
                boolean appendExtraNewLine = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getParagraph().getAppendExtraNewLine();
                composerStartRestartGroup.startReplaceGroup(1002858742);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(1002859812);
                int iPushStyle = builder.pushStyle(defaultTextStyle.toSpanStyle());
                try {
                    int i3 = i2 << 3;
                    annotateStringFromNode(builder, paragraph, composerStartRestartGroup, AnnotatedString.Builder.$stable | (i3 & 112));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    if (!isEndOfDocument(paragraph) && appendExtraNewLine) {
                        builder.append("\n");
                    }
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    MarkdownAnnotatedText(annotatedString, defaultTextStyle, function0, composerStartRestartGroup, i3 & 896);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.Paragraph$lambda$20(paragraph, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ThematicBreak(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(949523471);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949523471, i, -1, "com.robinhood.android.markdown.compose.ThematicBreak (MarkdownText.kt:224)");
            }
            MarkdownStyle.ThematicBreak thematicBreak = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getThematicBreak();
            Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, thematicBreak.m16289getBottomPaddingD9Ej5fM(), 7, null), thematicBreak.m16290getColor0d7_KjU(), thematicBreak.m16291getThicknessD9Ej5fM(), 0.0f, composerStartRestartGroup, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.ThematicBreak$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Image(final Image image, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970651023);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(image) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970651023, i2, -1, "com.robinhood.android.markdown.compose.Image (MarkdownText.kt:234)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(image.getDestination(), Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), image.getTitle(), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.Image$lambda$23(image, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void IndentedCodeBlock(final IndentedCodeBlock indentedCodeBlock, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1810081435);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(indentedCodeBlock) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1810081435, i2, -1, "com.robinhood.android.markdown.compose.IndentedCodeBlock (MarkdownText.kt:247)");
            }
            String literal = indentedCodeBlock.getLiteral();
            Intrinsics.checkNotNullExpressionValue(literal, "getLiteral(...)");
            CodeBlock(literal, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.IndentedCodeBlock$lambda$24(indentedCodeBlock, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BulletList(BulletList bulletList, final int i, final Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        final BulletList bulletList2;
        final int i4;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2081167066);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bulletList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2081167066, i3, -1, "com.robinhood.android.markdown.compose.BulletList (MarkdownText.kt:256)");
            }
            final MarkdownStyle.BulletList bulletList3 = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getBulletList();
            final TextStyle defaultTextStyle = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultTextStyle();
            bulletList2 = bulletList;
            i4 = i;
            function02 = function0;
            ListItems(bulletList2, i4, function02, ComposableLambda3.rememberComposableLambda(-1121022064, true, new Function3<Node, Composer, Integer, Unit>() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt.BulletList.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Node node, Composer composer2, Integer num) {
                    invoke(node, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Node node, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(node, "node");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1121022064, i5, -1, "com.robinhood.android.markdown.compose.BulletList.<anonymous> (MarkdownText.kt:264)");
                    }
                    composer2.startReplaceGroup(734589221);
                    TextStyle textStyle = defaultTextStyle;
                    int i6 = i;
                    MarkdownStyle.BulletList bulletList4 = bulletList3;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer2.startReplaceGroup(734590296);
                    int iPushStyle = builder.pushStyle(textStyle.toSpanStyle());
                    try {
                        int i7 = i6 % 3;
                        if (i7 == 0) {
                            builder.append(bulletList4.getBulletMarker1());
                        } else if (i7 == 1) {
                            builder.append(bulletList4.getBulletMarker2());
                        } else if (i7 == 2) {
                            builder.append(bulletList4.getBulletMarker3());
                        }
                        builder.append(bulletList4.getBulletSeparator());
                        MarkdownText4.annotateStringFromNode(builder, node, composer2, ((i5 << 3) & 112) | AnnotatedString.Builder.$stable);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composer2.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        MarkdownText4.MarkdownAnnotatedText(annotatedString, defaultTextStyle, function0, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            bulletList2 = bulletList;
            i4 = i;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.BulletList$lambda$25(bulletList2, i4, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void OrderedList(OrderedList orderedList, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final OrderedList orderedList2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-613153501);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(orderedList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-613153501, i2, -1, "com.robinhood.android.markdown.compose.OrderedList (MarkdownText.kt:284)");
            }
            final TextStyle defaultTextStyle = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultTextStyle();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = orderedList.getStartNumber();
            final char delimiter = orderedList.getDelimiter();
            orderedList2 = orderedList;
            function02 = function0;
            ListItems(orderedList2, 0, function02, ComposableLambda3.rememberComposableLambda(-384221683, true, new Function3<Node, Composer, Integer, Unit>() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt.OrderedList.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Node node, Composer composer2, Integer num) {
                    invoke(node, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Node node, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(node, "node");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-384221683, i3, -1, "com.robinhood.android.markdown.compose.OrderedList.<anonymous> (MarkdownText.kt:293)");
                    }
                    composer2.startReplaceGroup(130151328);
                    TextStyle textStyle = defaultTextStyle;
                    Ref.IntRef intRef2 = intRef;
                    char c = delimiter;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer2.startReplaceGroup(130152403);
                    int iPushStyle = builder.pushStyle(textStyle.toSpanStyle());
                    try {
                        int i4 = intRef2.element;
                        intRef2.element = i4 + 1;
                        builder.append(String.valueOf(i4));
                        builder.append(String.valueOf(c));
                        builder.append("\t");
                        MarkdownText4.annotateStringFromNode(builder, node, composer2, ((i3 << 3) & 112) | AnnotatedString.Builder.$stable);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composer2.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        MarkdownText4.MarkdownAnnotatedText(annotatedString, defaultTextStyle, function0, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3120 | ((i2 << 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            orderedList2 = orderedList;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.OrderedList$lambda$26(orderedList2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ListItems(ListBlock listBlock, final int i, final Function0<Unit> function0, final Function3<? super Node, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        ListBlock listBlock2;
        int i3;
        float value;
        Composer composerStartRestartGroup = composer.startRestartGroup(419450565);
        if ((i2 & 6) == 0) {
            listBlock2 = listBlock;
            i3 = (composerStartRestartGroup.changedInstance(listBlock2) ? 4 : 2) | i2;
        } else {
            listBlock2 = listBlock;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419450565, i3, -1, "com.robinhood.android.markdown.compose.ListItems (MarkdownText.kt:312)");
            }
            MarkdownStyle.List list = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getList();
            TextStyle defaultTextStyle = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultTextStyle();
            composerStartRestartGroup.startReplaceGroup(-634923388);
            float fM7995constructorimpl = (!(listBlock2.getParent() instanceof Document) || isEndOfDocument(listBlock2)) ? C2002Dp.m7995constructorimpl(0) : ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultLineHeightPadding(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-634917673);
            if (listBlock2.getParent() instanceof Document) {
                value = list.m16282getInitialIndentSizeD9Ej5fM();
            } else {
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                TextIndent textIndent = defaultTextStyle.toParagraphStyle().getTextIndent();
                C2002Dp c2002DpM7993boximpl = textIndent != null ? C2002Dp.m7993boximpl(density.mo5011toDpGaN1DYA(textIndent.getFirstLine())) : null;
                value = c2002DpM7993boximpl != null ? c2002DpM7993boximpl.getValue() : list.m16283getSubsequentIndentSizeD9Ej5fM();
            }
            float f = value;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, fM7995constructorimpl, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5183494);
            for (Node firstChild = listBlock2.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                composerStartRestartGroup.startReplaceGroup(5186020);
                for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNext()) {
                    if (firstChild2 instanceof BulletList) {
                        composerStartRestartGroup.startReplaceGroup(5188667);
                        BulletList((BulletList) firstChild2, i + 1, function0, composerStartRestartGroup, i3 & 896);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild2 instanceof OrderedList) {
                        composerStartRestartGroup.startReplaceGroup(5192330);
                        OrderedList((OrderedList) firstChild2, function0, composerStartRestartGroup, (i3 >> 3) & 112);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(5195098);
                        function3.invoke(firstChild2, composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 112));
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ListBlock listBlock3 = listBlock2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.ListItems$lambda$29(listBlock3, i, function0, function3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BlockQuote(final BlockQuote blockQuote, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1789276523);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(blockQuote) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1789276523, i2, -1, "com.robinhood.android.markdown.compose.BlockQuote (MarkdownText.kt:346)");
            }
            final MarkdownStyle.BlockQuote blockQuote2 = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getBlockQuote();
            TextStyle defaultTextStyle = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultTextStyle();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultLineHeightPadding(composerStartRestartGroup, 0), 7, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(blockQuote2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarkdownText4.BlockQuote$lambda$31$lambda$30(blockQuote2, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(DrawModifierKt.drawBehind(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue), C2002Dp.m7995constructorimpl(24), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1882353857);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(1882354932);
            int iPushStyle = builder.pushStyle(defaultTextStyle.toSpanStyle());
            try {
                annotateStringFromNode(builder, blockQuote, composerStartRestartGroup, ((i2 << 3) & 112) | AnnotatedString.Builder.$stable);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer2.endReplaceGroup();
                TextKt.m5666TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.BlockQuote$lambda$35(blockQuote, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockQuote$lambda$31$lambda$30(MarkdownStyle.BlockQuote blockQuote, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        long jM16269getBg0d7_KjU = blockQuote.m16269getBg0d7_KjU();
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(C2002Dp.m7995constructorimpl(r0)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(16);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, jM16269getBg0d7_KjU, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fM7995constructorimpl) << 32)), 12.0f, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    private static final void FencedCodeBlock(final FencedCodeBlock fencedCodeBlock, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1393241493);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(fencedCodeBlock) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1393241493, i2, -1, "com.robinhood.android.markdown.compose.FencedCodeBlock (MarkdownText.kt:373)");
            }
            String literal = fencedCodeBlock.getLiteral();
            Intrinsics.checkNotNullExpressionValue(literal, "getLiteral(...)");
            CodeBlock(literal, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.FencedCodeBlock$lambda$36(fencedCodeBlock, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CodeBlock(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-403111608);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-403111608, i2, -1, "com.robinhood.android.markdown.compose.CodeBlock (MarkdownText.kt:378)");
            }
            MarkdownStyle.Code code = ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getCode();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ((MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle())).getDefaultLineHeightPadding(composerStartRestartGroup, 0), 7, null), code.m16273getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(8), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m5665Text4IGK_g(StringsKt.trim(str).toString(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, code.getTextStyle(), composer2, 48, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.CodeBlock$lambda$38(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MarkdownBlockChildren(Node node, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Node node2;
        int i3;
        Modifier modifier2;
        int i4;
        Node firstChild;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1370447963);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            node2 = node;
        } else {
            node2 = node;
            i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(node2) ? 4 : 2) | i : i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1370447963, i4, -1, "com.robinhood.android.markdown.compose.MarkdownBlockChildren (MarkdownText.kt:401)");
                }
                for (firstChild = node2.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                    int i6 = i4 >> 3;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (firstChild instanceof BlockQuote) {
                        composerStartRestartGroup.startReplaceGroup(-1015461207);
                        BlockQuote((BlockQuote) firstChild, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof BulletList) {
                        composerStartRestartGroup.startReplaceGroup(-1015459364);
                        BulletList((BulletList) firstChild, 0, function0, composerStartRestartGroup, (i4 & 896) | 48);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof Document) {
                        composerStartRestartGroup.startReplaceGroup(-1015456019);
                        Document((Document) firstChild, null, function0, composerStartRestartGroup, i4 & 896, 2);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof FencedCodeBlock) {
                        composerStartRestartGroup.startReplaceGroup(-1015452946);
                        FencedCodeBlock((FencedCodeBlock) firstChild, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof Heading) {
                        composerStartRestartGroup.startReplaceGroup(-1015451061);
                        Heading((Heading) firstChild, function0, composerStartRestartGroup, i6 & 112);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof Image) {
                        composerStartRestartGroup.startReplaceGroup(-1015448380);
                        Image((Image) firstChild, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof IndentedCodeBlock) {
                        composerStartRestartGroup.startReplaceGroup(-1015446512);
                        IndentedCodeBlock((IndentedCodeBlock) firstChild, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof OrderedList) {
                        composerStartRestartGroup.startReplaceGroup(-1015444429);
                        OrderedList((OrderedList) firstChild, function0, composerStartRestartGroup, i6 & 112);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof Paragraph) {
                        composerStartRestartGroup.startReplaceGroup(-1015441329);
                        Paragraph((Paragraph) firstChild, function0, composerStartRestartGroup, i6 & 112);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (firstChild instanceof ThematicBreak) {
                        composerStartRestartGroup.startReplaceGroup(-1015437630);
                        ThematicBreak(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1413767153);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                final Node node3 = node2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarkdownText4.MarkdownBlockChildren$lambda$40(node3, modifier4, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            while (firstChild != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean isEndOfDocument(Node node) {
        return node.getNext() == null && (node.getParent() instanceof Document);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ComposableNaming"})
    public static final void annotateStringFromNode(final AnnotatedString.Builder builder, final Node node, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1056166641);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(builder) : composerStartRestartGroup.changedInstance(builder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(node) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1056166641, i2, -1, "com.robinhood.android.markdown.compose.annotateStringFromNode (MarkdownText.kt:428)");
            }
            Nodes2.annotate(node, builder, (MarkdownStyle) composerStartRestartGroup.consume(MarkdownStyle2.getLocalMarkdownStyle()), composerStartRestartGroup, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | (AnnotatedString.Builder.$stable << 3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownText4.annotateStringFromNode$lambda$41(builder, node, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
