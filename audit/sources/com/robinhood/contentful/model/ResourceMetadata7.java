package com.robinhood.contentful.model;

import com.robinhood.contentful.model.ContentResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/contentful/model/IdentifiableResourceMetadata;", "T", "Lcom/robinhood/contentful/model/ContentResource;", "Lcom/robinhood/contentful/model/ResourceMetadata;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "Lcom/robinhood/contentful/model/EntityResourceMetadata;", "Lcom/robinhood/contentful/model/LinkMetadata;", "Lcom/robinhood/contentful/model/SpaceMetadata;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.contentful.model.IdentifiableResourceMetadata, reason: use source file name */
/* loaded from: classes15.dex */
public abstract class ResourceMetadata7<T extends ContentResource> extends ResourceMetadata<T> {
    public /* synthetic */ ResourceMetadata7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    private ResourceMetadata7() {
        super(null);
    }
}
