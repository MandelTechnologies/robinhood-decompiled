package com.robinhood.contentful.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0007HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0007HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/contentful/model/EmbeddedAsset;", "Lcom/robinhood/contentful/model/EmbedBlock;", "Lcom/robinhood/contentful/model/AssetResource;", "content", "", "Lcom/robinhood/contentful/model/RichNode;", "target", "Lcom/robinhood/contentful/model/ResourceLink;", "<init>", "(Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;)V", "getContent", "()Ljava/util/List;", "getTarget", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EmbeddedAsset extends EmbedBlock<AssetResource<?>> {
    public static final Parcelable.Creator<EmbeddedAsset> CREATOR = new Creator();
    private final List<RichNode> content;
    private final ResourceLink<AssetResource<?>> target;

    /* compiled from: RichText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EmbeddedAsset.class.getClassLoader()));
            }
            return new EmbeddedAsset(arrayList, ResourceLink.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedAsset[] newArray(int i) {
            return new EmbeddedAsset[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedAsset copy$default(EmbeddedAsset embeddedAsset, List list, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            list = embeddedAsset.content;
        }
        if ((i & 2) != 0) {
            resourceLink = embeddedAsset.target;
        }
        return embeddedAsset.copy(list, resourceLink);
    }

    public final List<RichNode> component1() {
        return this.content;
    }

    public final ResourceLink<AssetResource<?>> component2() {
        return this.target;
    }

    public final EmbeddedAsset copy(List<? extends RichNode> content, ResourceLink<AssetResource<?>> target) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        return new EmbeddedAsset(content, target);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedAsset)) {
            return false;
        }
        EmbeddedAsset embeddedAsset = (EmbeddedAsset) other;
        return Intrinsics.areEqual(this.content, embeddedAsset.content) && Intrinsics.areEqual(this.target, embeddedAsset.target);
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.target.hashCode();
    }

    public String toString() {
        return "EmbeddedAsset(content=" + this.content + ", target=" + this.target + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<RichNode> list = this.content;
        dest.writeInt(list.size());
        Iterator<RichNode> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        this.target.writeToParcel(dest, flags);
    }

    @Override // com.robinhood.contentful.model.BlockNode
    public List<RichNode> getContent() {
        return this.content;
    }

    @Override // com.robinhood.contentful.model.LinkBlock
    public ResourceLink<AssetResource<?>> getTarget() {
        return this.target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedAsset(List<? extends RichNode> content, ResourceLink<AssetResource<?>> target) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        this.content = content;
        this.target = target;
    }
}
