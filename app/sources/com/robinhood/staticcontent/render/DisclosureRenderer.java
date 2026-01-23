package com.robinhood.staticcontent.render;

import com.robinhood.android.markdown.elements.SecondaryText;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Node;
import org.commonmark.node.Paragraph;
import org.commonmark.node.Text;
import org.commonmark.parser.Parser;

/* compiled from: DisclosureRenderer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/staticcontent/render/DisclosureRenderer;", "Lcom/robinhood/contentful/render/EntryRenderer;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "parser", "Lorg/commonmark/parser/Parser;", "<init>", "(Lorg/commonmark/parser/Parser;)V", "render", "Lorg/commonmark/node/Node;", "value", "renderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "repository", "Lcom/robinhood/contentful/repository/ContentRepository;", "(Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/contentful/markdown/ContentRenderer;Lcom/robinhood/contentful/repository/ContentRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DisclosureRenderer implements EntryRenderer<Disclosure> {
    private final Parser parser;

    @Override // com.robinhood.contentful.render.EntryRenderer
    public /* bridge */ /* synthetic */ Object render(Disclosure disclosure, ContentRenderer contentRenderer, ContentRepository contentRepository, Continuation continuation) {
        return render2(disclosure, contentRenderer, contentRepository, (Continuation<? super Node>) continuation);
    }

    public DisclosureRenderer(Parser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    /* renamed from: render, reason: avoid collision after fix types in other method */
    public Object render2(Disclosure disclosure, ContentRenderer contentRenderer, ContentRepository contentRepository, Continuation<? super Node> continuation) {
        Node node = this.parser.parse(disclosure.getContent().getRaw());
        if (node == null) {
            throw new IllegalStateException(("Could not parse markdown for disclosure " + disclosure.getIdentifier()).toString());
        }
        Node firstChild = node.getFirstChild();
        if (!(firstChild instanceof Paragraph)) {
            firstChild = node;
        }
        while (firstChild != null) {
            Node firstChild2 = firstChild.getFirstChild();
            while (firstChild2 != null) {
                Text text = firstChild2 instanceof Text ? (Text) firstChild2 : null;
                if (text != null) {
                    firstChild2 = new SecondaryText();
                    text.insertBefore(firstChild2);
                    firstChild2.appendChild(text);
                }
                firstChild2 = firstChild2.getNext();
            }
            firstChild = firstChild.getNext();
        }
        return node;
    }

    public String toString() {
        String simpleName = DisclosureRenderer.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
