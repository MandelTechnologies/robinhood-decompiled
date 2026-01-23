package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FooterComponent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "", "name", "", "children", "", "firstBelowTheFoldChildIndex", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;)V", "newChildren", "updateChildren", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Ljava/lang/Integer;", "getFirstBelowTheFoldChildIndex", "()Ljava/lang/Integer;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class FooterComponent implements UiComponent, UiComponentGroup {
    public static final Parcelable.Creator<FooterComponent> CREATOR = new Creator();
    private final List<UiComponent> children;
    private final Integer firstBelowTheFoldChildIndex;
    private final String name;

    /* compiled from: FooterComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FooterComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FooterComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(FooterComponent.class.getClassLoader()));
            }
            return new FooterComponent(string2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FooterComponent[] newArray(int i) {
            return new FooterComponent[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterComponent copy$default(FooterComponent footerComponent, String str, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerComponent.name;
        }
        if ((i & 2) != 0) {
            list = footerComponent.children;
        }
        if ((i & 4) != 0) {
            num = footerComponent.firstBelowTheFoldChildIndex;
        }
        return footerComponent.copy(str, list, num);
    }

    public final FooterComponent copy(String name, List<? extends UiComponent> children, Integer firstBelowTheFoldChildIndex) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        return new FooterComponent(name, children, firstBelowTheFoldChildIndex);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterComponent)) {
            return false;
        }
        FooterComponent footerComponent = (FooterComponent) other;
        return Intrinsics.areEqual(this.name, footerComponent.name) && Intrinsics.areEqual(this.children, footerComponent.children) && Intrinsics.areEqual(this.firstBelowTheFoldChildIndex, footerComponent.firstBelowTheFoldChildIndex);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        Integer num = this.firstBelowTheFoldChildIndex;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "FooterComponent(name=" + this.name + ", children=" + this.children + ", firstBelowTheFoldChildIndex=" + this.firstBelowTheFoldChildIndex + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        List<UiComponent> list = this.children;
        dest.writeInt(list.size());
        Iterator<UiComponent> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        Integer num = this.firstBelowTheFoldChildIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FooterComponent(String name, List<? extends UiComponent> children, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.children = children;
        this.firstBelowTheFoldChildIndex = num;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup
    public List<UiComponent> getChildren() {
        return this.children;
    }

    public final Integer getFirstBelowTheFoldChildIndex() {
        return this.firstBelowTheFoldChildIndex;
    }

    public FooterComponent(Footer config) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        List<UiComponentConfig> children = config.getChildren();
        if (children == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                UiComponent uiComponent = UiComponent3.toUiComponent((UiComponentConfig) it.next());
                if (uiComponent != null) {
                    listEmptyList.add(uiComponent);
                }
            }
        }
        Footer.Attributes attributes = config.getAttributes();
        this(name, listEmptyList, attributes != null ? attributes.getFirstBelowTheFoldChildIndex() : null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup
    public UiComponentGroup updateChildren(List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return copy$default(this, null, newChildren, null, 5, null);
    }
}
