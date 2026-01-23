package com.robinhood.android.shoestring.handlers;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.SpanStyle;
import com.robinhood.android.shoestring.TagHandler;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: SimpleSpanStyleTagHandler.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J0\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/shoestring/handlers/SimpleSpanStyleTagHandler;", "Lcom/robinhood/android/shoestring/TagHandler$OpenClose;", "tagText", "", ResourceTypes.STYLE, "Landroidx/compose/ui/text/SpanStyle;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/SpanStyle;)V", "startPositions", "Ljava/util/Stack;", "", "handlesOpenTagText", "", "openingTagText", "", "handlesCloseTagText", "closingTagText", "applyOpen", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "openTagText", "applyClose", "closeTagText", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public class SimpleSpanStyleTagHandler implements TagHandler.OpenClose {
    public static final int $stable = 8;
    private final Stack<Integer> startPositions;
    private final SpanStyle style;
    private final String tagText;

    public SimpleSpanStyleTagHandler(String tagText, SpanStyle style) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(style, "style");
        this.tagText = tagText;
        this.style = style;
        this.startPositions = new Stack<>();
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public boolean handlesOpenTagText(CharSequence openingTagText) {
        Intrinsics.checkNotNullParameter(openingTagText, "openingTagText");
        return Intrinsics.areEqual(openingTagText, this.tagText);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public boolean handlesCloseTagText(CharSequence closingTagText, CharSequence openingTagText) {
        Intrinsics.checkNotNullParameter(closingTagText, "closingTagText");
        Intrinsics.checkNotNullParameter(openingTagText, "openingTagText");
        return Intrinsics.areEqual(openingTagText, closingTagText) && Intrinsics.areEqual(closingTagText, this.tagText);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public ImmutableMap<String, InlineTextContent> applyOpen(AnnotatedString.Builder builder, CharSequence openTagText) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(openTagText, "openTagText");
        this.startPositions.push(Integer.valueOf(builder.getLength()));
        return TagHandler.INSTANCE.getEMPTY_INLINE_CONTENT_MAP();
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public ImmutableMap<String, InlineTextContent> applyClose(AnnotatedString.Builder builder, CharSequence closeTagText, CharSequence openTagText) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(closeTagText, "closeTagText");
        Intrinsics.checkNotNullParameter(openTagText, "openTagText");
        Integer numPop = this.startPositions.pop();
        SpanStyle spanStyle = this.style;
        Intrinsics.checkNotNull(numPop);
        builder.addStyle(spanStyle, numPop.intValue(), builder.getLength());
        return TagHandler.INSTANCE.getEMPTY_INLINE_CONTENT_MAP();
    }
}
