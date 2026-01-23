package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedSectionContent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Landroid/os/Parcelable;", CarResultComposable2.BODY, "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "<init>", "(Ljava/util/List;)V", "getBody", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmbeddedSectionContent implements Parcelable {
    public static final Parcelable.Creator<EmbeddedSectionContent> CREATOR = new Creator();
    private final List<UIComponent<MicrogramAction>> body;

    /* compiled from: EmbeddedSectionContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedSectionContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedSectionContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EmbeddedSectionContent.class.getClassLoader()));
            }
            return new EmbeddedSectionContent(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedSectionContent[] newArray(int i) {
            return new EmbeddedSectionContent[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedSectionContent copy$default(EmbeddedSectionContent embeddedSectionContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = embeddedSectionContent.body;
        }
        return embeddedSectionContent.copy(list);
    }

    public final List<UIComponent<MicrogramAction>> component1() {
        return this.body;
    }

    public final EmbeddedSectionContent copy(List<? extends UIComponent<MicrogramAction>> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new EmbeddedSectionContent(body);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmbeddedSectionContent) && Intrinsics.areEqual(this.body, ((EmbeddedSectionContent) other).body);
    }

    public int hashCode() {
        return this.body.hashCode();
    }

    public String toString() {
        return "EmbeddedSectionContent(body=" + this.body + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UIComponent<MicrogramAction>> list = this.body;
        dest.writeInt(list.size());
        Iterator<UIComponent<MicrogramAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedSectionContent(List<? extends UIComponent<MicrogramAction>> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
    }

    public final List<UIComponent<MicrogramAction>> getBody() {
        return this.body;
    }
}
