package com.robinhood.contentful.model;

import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ResourceMetadata;", "T", "Lcom/robinhood/contentful/model/ContentResource;", "Landroid/os/Parcelable;", "<init>", "()V", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/ArrayMetadata;", "Lcom/robinhood/contentful/model/IdentifiableResourceMetadata;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class ResourceMetadata<T extends ContentResource> implements Parcelable {
    public /* synthetic */ ResourceMetadata(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ContentResource.Type<? super T> getType();

    private ResourceMetadata() {
    }
}
