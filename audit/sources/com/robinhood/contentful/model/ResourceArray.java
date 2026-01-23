package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import com.robinhood.contentful.model.ContentResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001&B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JG\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/contentful/model/ResourceArray;", "T", "Lcom/robinhood/contentful/model/ContentResource;", "total", "", "skip", "limit", "items", "", "includes", "Lcom/robinhood/contentful/model/ResourceArray$Includes;", "<init>", "(IIILjava/util/List;Lcom/robinhood/contentful/model/ResourceArray$Includes;)V", "getTotal", "()I", "getSkip", "getLimit", "getItems", "()Ljava/util/List;", "getIncludes", "()Lcom/robinhood/contentful/model/ResourceArray$Includes;", "sys", "Lcom/robinhood/contentful/model/ArrayMetadata;", "getSys", "()Lcom/robinhood/contentful/model/ArrayMetadata;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Includes", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class ResourceArray<T extends ContentResource> extends ContentResource {
    private final Includes includes;
    private final List<T> items;
    private final int limit;
    private final int skip;
    private final ResourceMetadata2 sys;
    private final int total;

    public static /* synthetic */ ResourceArray copy$default(ResourceArray resourceArray, int i, int i2, int i3, List list, Includes includes, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceArray.total;
        }
        if ((i4 & 2) != 0) {
            i2 = resourceArray.skip;
        }
        if ((i4 & 4) != 0) {
            i3 = resourceArray.limit;
        }
        if ((i4 & 8) != 0) {
            list = resourceArray.items;
        }
        if ((i4 & 16) != 0) {
            includes = resourceArray.includes;
        }
        Includes includes2 = includes;
        int i5 = i3;
        return resourceArray.copy(i, i2, i5, list, includes2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkip() {
        return this.skip;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<T> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final Includes getIncludes() {
        return this.includes;
    }

    public final ResourceArray<T> copy(int total, int skip, int limit, List<? extends T> items, Includes includes) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(includes, "includes");
        return new ResourceArray<>(total, skip, limit, items, includes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceArray)) {
            return false;
        }
        ResourceArray resourceArray = (ResourceArray) other;
        return this.total == resourceArray.total && this.skip == resourceArray.skip && this.limit == resourceArray.limit && Intrinsics.areEqual(this.items, resourceArray.items) && Intrinsics.areEqual(this.includes, resourceArray.includes);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.total) * 31) + Integer.hashCode(this.skip)) * 31) + Integer.hashCode(this.limit)) * 31) + this.items.hashCode()) * 31) + this.includes.hashCode();
    }

    public String toString() {
        return "ResourceArray(total=" + this.total + ", skip=" + this.skip + ", limit=" + this.limit + ", items=" + this.items + ", includes=" + this.includes + ")";
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getSkip() {
        return this.skip;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final Includes getIncludes() {
        return this.includes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceArray(int i, int i2, int i3, List<? extends T> items, Includes includes) {
        super(null);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(includes, "includes");
        this.total = i;
        this.skip = i2;
        this.limit = i3;
        this.items = items;
        this.includes = includes;
        this.sys = ResourceMetadata2.INSTANCE;
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public ResourceMetadata2 getSys() {
        return this.sys;
    }

    /* compiled from: ContentResource.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\u0013\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/contentful/model/ResourceArray$Includes;", "", "assets", "", "Lcom/robinhood/contentful/model/AssetResource;", "entries", "Lcom/robinhood/contentful/model/EntryResource;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAssets", "()Ljava/util/List;", "getEntries", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"MissingMoshiCodegenAnnotation"})
    public static final /* data */ class Includes {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Includes EMPTY = new Includes(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        private final List<AssetResource<?>> assets;
        private final List<EntryResource<?>> entries;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Includes copy$default(Includes includes, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = includes.assets;
            }
            if ((i & 2) != 0) {
                list2 = includes.entries;
            }
            return includes.copy(list, list2);
        }

        public final List<AssetResource<?>> component1() {
            return this.assets;
        }

        public final List<EntryResource<?>> component2() {
            return this.entries;
        }

        public final Includes copy(List<? extends AssetResource<?>> assets, List<? extends EntryResource<?>> entries) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new Includes(assets, entries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Includes)) {
                return false;
            }
            Includes includes = (Includes) other;
            return Intrinsics.areEqual(this.assets, includes.assets) && Intrinsics.areEqual(this.entries, includes.entries);
        }

        public int hashCode() {
            return (this.assets.hashCode() * 31) + this.entries.hashCode();
        }

        public String toString() {
            return "Includes(assets=" + this.assets + ", entries=" + this.entries + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Includes(List<? extends AssetResource<?>> assets, List<? extends EntryResource<?>> entries) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.assets = assets;
            this.entries = entries;
        }

        public final List<AssetResource<?>> getAssets() {
            return this.assets;
        }

        public final List<EntryResource<?>> getEntries() {
            return this.entries;
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/contentful/model/ResourceArray$Includes$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/robinhood/contentful/model/ResourceArray$Includes;", "getEMPTY", "()Lcom/robinhood/contentful/model/ResourceArray$Includes;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Includes getEMPTY() {
                return Includes.EMPTY;
            }
        }
    }
}
