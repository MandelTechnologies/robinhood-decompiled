package com.robinhood.contentful.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\tHÆ\u0003J5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\tHÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/contentful/model/EmbeddedEntry;", "T", "", "Lcom/robinhood/contentful/model/EmbedBlock;", "Lcom/robinhood/contentful/model/EntryResource;", "content", "", "Lcom/robinhood/contentful/model/RichNode;", "target", "Lcom/robinhood/contentful/model/ResourceLink;", "<init>", "(Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;)V", "getContent", "()Ljava/util/List;", "getTarget", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EmbeddedEntry<T> extends EmbedBlock<EntryResource<T>> {
    public static final Parcelable.Creator<EmbeddedEntry<?>> CREATOR = new Creator();
    private final List<RichNode> content;
    private final ResourceLink<EntryResource<T>> target;

    /* compiled from: RichText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedEntry<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedEntry<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EmbeddedEntry.class.getClassLoader()));
            }
            return new EmbeddedEntry<>(arrayList, ResourceLink.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedEntry<?>[] newArray(int i) {
            return new EmbeddedEntry[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedEntry copy$default(EmbeddedEntry embeddedEntry, List list, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            list = embeddedEntry.content;
        }
        if ((i & 2) != 0) {
            resourceLink = embeddedEntry.target;
        }
        return embeddedEntry.copy(list, resourceLink);
    }

    public final List<RichNode> component1() {
        return this.content;
    }

    public final ResourceLink<EntryResource<T>> component2() {
        return this.target;
    }

    public final EmbeddedEntry<T> copy(List<? extends RichNode> content, ResourceLink<EntryResource<T>> target) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        return new EmbeddedEntry<>(content, target);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedEntry)) {
            return false;
        }
        EmbeddedEntry embeddedEntry = (EmbeddedEntry) other;
        return Intrinsics.areEqual(this.content, embeddedEntry.content) && Intrinsics.areEqual(this.target, embeddedEntry.target);
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.target.hashCode();
    }

    public String toString() {
        return "EmbeddedEntry(content=" + this.content + ", target=" + this.target + ")";
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
    public ResourceLink<EntryResource<T>> getTarget() {
        return this.target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedEntry(List<? extends RichNode> content, ResourceLink<EntryResource<T>> target) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        this.content = content;
        this.target = target;
    }
}
