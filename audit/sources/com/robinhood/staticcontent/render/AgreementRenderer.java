package com.robinhood.staticcontent.render;

import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.Agreement;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Node;

/* compiled from: AgreementRenderer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/staticcontent/render/AgreementRenderer;", "Lcom/robinhood/contentful/render/EntryRenderer;", "Lcom/robinhood/staticcontent/model/Agreement;", "<init>", "()V", "render", "Lorg/commonmark/node/Node;", "value", "renderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "repository", "Lcom/robinhood/contentful/repository/ContentRepository;", "(Lcom/robinhood/staticcontent/model/Agreement;Lcom/robinhood/contentful/markdown/ContentRenderer;Lcom/robinhood/contentful/repository/ContentRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AgreementRenderer implements EntryRenderer<Agreement> {
    public static final AgreementRenderer INSTANCE = new AgreementRenderer();

    private AgreementRenderer() {
    }

    @Override // com.robinhood.contentful.render.EntryRenderer
    public /* bridge */ /* synthetic */ Object render(Agreement agreement, ContentRenderer contentRenderer, ContentRepository contentRepository, Continuation continuation) {
        return render2(agreement, contentRenderer, contentRepository, (Continuation<? super Node>) continuation);
    }

    /* renamed from: render, reason: avoid collision after fix types in other method */
    public Object render2(Agreement agreement, ContentRenderer contentRenderer, ContentRepository contentRepository, Continuation<? super Node> continuation) {
        return ContentRenderer.renderAssetLink$default(contentRenderer, agreement.getMarkdownContent(), null, continuation, 2, null);
    }

    public String toString() {
        String simpleName = AgreementRenderer.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
