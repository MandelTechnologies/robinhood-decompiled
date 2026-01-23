package com.robinhood.contentful.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/model/BlockNode;", "Lcom/robinhood/contentful/model/RichNode;", "<init>", "()V", "content", "", "getContent", "()Ljava/util/List;", "Lcom/robinhood/contentful/model/BlockQuote;", "Lcom/robinhood/contentful/model/Document;", "Lcom/robinhood/contentful/model/Heading;", "Lcom/robinhood/contentful/model/LinkBlock;", "Lcom/robinhood/contentful/model/ListBlock;", "Lcom/robinhood/contentful/model/ListItem;", "Lcom/robinhood/contentful/model/Paragraph;", "Lcom/robinhood/contentful/model/ThematicBreak;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class BlockNode extends RichNode {
    public /* synthetic */ BlockNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<RichNode> getContent();

    private BlockNode() {
        super(null);
    }
}
