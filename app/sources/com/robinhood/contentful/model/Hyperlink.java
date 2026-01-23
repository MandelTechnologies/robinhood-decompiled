package com.robinhood.contentful.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/contentful/model/Hyperlink;", "Lcom/robinhood/contentful/model/LinkBlock;", "Landroid/net/Uri;", "content", "", "Lcom/robinhood/contentful/model/RichNode;", "target", "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "getContent", "()Ljava/util/List;", "getTarget", "()Landroid/net/Uri;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Hyperlink extends LinkBlock<Uri> {
    public static final Parcelable.Creator<Hyperlink> CREATOR = new Creator();
    private final List<RichNode> content;
    private final Uri target;

    /* compiled from: RichText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Hyperlink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hyperlink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Hyperlink.class.getClassLoader()));
            }
            return new Hyperlink(arrayList, (Uri) parcel.readParcelable(Hyperlink.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hyperlink[] newArray(int i) {
            return new Hyperlink[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Hyperlink copy$default(Hyperlink hyperlink, List list, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hyperlink.content;
        }
        if ((i & 2) != 0) {
            uri = hyperlink.target;
        }
        return hyperlink.copy(list, uri);
    }

    public final List<RichNode> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getTarget() {
        return this.target;
    }

    public final Hyperlink copy(List<? extends RichNode> content, Uri target) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        return new Hyperlink(content, target);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Hyperlink)) {
            return false;
        }
        Hyperlink hyperlink = (Hyperlink) other;
        return Intrinsics.areEqual(this.content, hyperlink.content) && Intrinsics.areEqual(this.target, hyperlink.target);
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.target.hashCode();
    }

    public String toString() {
        return "Hyperlink(content=" + this.content + ", target=" + this.target + ")";
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
        dest.writeParcelable(this.target, flags);
    }

    @Override // com.robinhood.contentful.model.BlockNode
    public List<RichNode> getContent() {
        return this.content;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.contentful.model.LinkBlock
    public Uri getTarget() {
        return this.target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Hyperlink(List<? extends RichNode> content, Uri target) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(target, "target");
        this.content = content;
        this.target = target;
    }
}
