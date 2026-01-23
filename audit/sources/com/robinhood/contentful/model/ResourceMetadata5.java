package com.robinhood.contentful.model;

import com.robinhood.contentful.model.ContentResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p479j$.time.Instant;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/contentful/model/EntityResourceMetadata;", "Lcom/robinhood/contentful/model/ContentResource;", "T", "Lcom/robinhood/contentful/model/IdentifiableResourceMetadata;", "<init>", "()V", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/SpaceResource;", "getSpace", "()Lcom/robinhood/contentful/model/ResourceLink;", "space", "getEnvironment", "environment", "", "getRevision", "()I", "revision", "j$/time/Instant", "getCreatedAt", "()Lj$/time/Instant;", "createdAt", "getUpdatedAt", "updatedAt", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "Lcom/robinhood/contentful/model/AssetMetadata;", "Lcom/robinhood/contentful/model/ContentTypeMetadata;", "Lcom/robinhood/contentful/model/EntryMetadata;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.contentful.model.EntityResourceMetadata, reason: use source file name */
/* loaded from: classes15.dex */
public abstract class ResourceMetadata5<T extends ContentResource> extends ResourceMetadata7<T> {
    public /* synthetic */ ResourceMetadata5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Instant getCreatedAt();

    public abstract ResourceLink<?> getEnvironment();

    public abstract Locale getLocale();

    public abstract int getRevision();

    public abstract ResourceLink<SpaceResource> getSpace();

    public abstract Instant getUpdatedAt();

    private ResourceMetadata5() {
        super(null);
    }
}
