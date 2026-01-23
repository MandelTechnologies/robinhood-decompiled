package com.robinhood.contentful.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0006J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/contentful/model/Heading;", "Lcom/robinhood/contentful/model/BlockNode;", "content", "", "Lcom/robinhood/contentful/model/RichNode;", "level", "", "<init>", "(Ljava/util/List;I)V", "getContent", "()Ljava/util/List;", "getLevel", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Heading extends BlockNode {
    public static final Parcelable.Creator<Heading> CREATOR = new Creator();
    private final List<RichNode> content;
    private final int level;

    /* compiled from: RichText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Heading> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Heading createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Heading.class.getClassLoader()));
            }
            return new Heading(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Heading[] newArray(int i) {
            return new Heading[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Heading copy$default(Heading heading, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = heading.content;
        }
        if ((i2 & 2) != 0) {
            i = heading.level;
        }
        return heading.copy(list, i);
    }

    public final List<RichNode> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public final Heading copy(List<? extends RichNode> content, int level) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new Heading(content, level);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Heading)) {
            return false;
        }
        Heading heading = (Heading) other;
        return Intrinsics.areEqual(this.content, heading.content) && this.level == heading.level;
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + Integer.hashCode(this.level);
    }

    public String toString() {
        return "Heading(content=" + this.content + ", level=" + this.level + ")";
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
        dest.writeInt(this.level);
    }

    @Override // com.robinhood.contentful.model.BlockNode
    public List<RichNode> getContent() {
        return this.content;
    }

    public final int getLevel() {
        return this.level;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Heading(List<? extends RichNode> content, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.level = i;
    }
}
