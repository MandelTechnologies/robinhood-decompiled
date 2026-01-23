package com.robinhood.android.shoestring.handlers;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import com.robinhood.android.shoestring.TagHandler;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: Link.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J0\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\t\u0010\u001a\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/shoestring/handlers/Link;", "Lcom/robinhood/android/shoestring/TagHandler$OpenClose;", "linkStyle", "Landroidx/compose/ui/text/SpanStyle;", "<init>", "(Landroidx/compose/ui/text/SpanStyle;)V", "urlsAndStarts", "Ljava/util/Stack;", "Lkotlin/Pair;", "", "", "handlesOpenTagText", "", "openingTagText", "", "handlesCloseTagText", "closingTagText", "applyOpen", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "openTagText", "applyClose", "closeTagText", "component1", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Link implements TagHandler.OpenClose {
    private final SpanStyle linkStyle;
    private final Stack<Tuples2<String, Integer>> urlsAndStarts;
    public static final int $stable = 8;
    private static final Regex TAG_PATTERN = new Regex("a( href=\"([^\"]*)\")?");

    /* renamed from: component1, reason: from getter */
    private final SpanStyle getLinkStyle() {
        return this.linkStyle;
    }

    public static /* synthetic */ Link copy$default(Link link, SpanStyle spanStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            spanStyle = link.linkStyle;
        }
        return link.copy(spanStyle);
    }

    public final Link copy(SpanStyle linkStyle) {
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        return new Link(linkStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Link) && Intrinsics.areEqual(this.linkStyle, ((Link) other).linkStyle);
    }

    public int hashCode() {
        return this.linkStyle.hashCode();
    }

    public String toString() {
        return "Link(linkStyle=" + this.linkStyle + ")";
    }

    public Link(SpanStyle linkStyle) {
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        this.linkStyle = linkStyle;
        this.urlsAndStarts = new Stack<>();
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public boolean handlesOpenTagText(CharSequence openingTagText) {
        Intrinsics.checkNotNullParameter(openingTagText, "openingTagText");
        return TAG_PATTERN.matches(openingTagText);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public boolean handlesCloseTagText(CharSequence closingTagText, CharSequence openingTagText) {
        Intrinsics.checkNotNullParameter(closingTagText, "closingTagText");
        Intrinsics.checkNotNullParameter(openingTagText, "openingTagText");
        return TAG_PATTERN.matches(closingTagText);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public ImmutableMap<String, InlineTextContent> applyOpen(AnnotatedString.Builder builder, CharSequence openTagText) {
        String str;
        List<String> groupValues;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(openTagText, "openTagText");
        MatchResult matchResultFind$default = Regex.find$default(TAG_PATTERN, openTagText, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = groupValues.get(2)) == null) {
            str = "";
        }
        this.urlsAndStarts.push(Tuples4.m3642to(str, Integer.valueOf(builder.getLength())));
        return TagHandler.INSTANCE.getEMPTY_INLINE_CONTENT_MAP();
    }

    @Override // com.robinhood.android.shoestring.TagHandler.OpenClose
    public ImmutableMap<String, InlineTextContent> applyClose(AnnotatedString.Builder builder, CharSequence closeTagText, CharSequence openTagText) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(closeTagText, "closeTagText");
        Intrinsics.checkNotNullParameter(openTagText, "openTagText");
        Tuples2<String, Integer> tuples2Pop = this.urlsAndStarts.pop();
        String strComponent1 = tuples2Pop.component1();
        builder.addLink(new LinkAnnotation.Url(strComponent1, new TextLinkStyles(this.linkStyle, null, null, null, 14, null), null, 4, null), tuples2Pop.component2().intValue(), builder.getLength());
        return TagHandler.INSTANCE.getEMPTY_INLINE_CONTENT_MAP();
    }
}
