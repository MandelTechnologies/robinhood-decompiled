package com.robinhood.contentful.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/contentful/model/LinkBlock;", "T", "", "Lcom/robinhood/contentful/model/BlockNode;", "<init>", "()V", "target", "getTarget", "()Ljava/lang/Object;", "Lcom/robinhood/contentful/model/EmbedBlock;", "Lcom/robinhood/contentful/model/Hyperlink;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class LinkBlock<T> extends BlockNode {
    public /* synthetic */ LinkBlock(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T getTarget();

    private LinkBlock() {
        super(null);
    }
}
