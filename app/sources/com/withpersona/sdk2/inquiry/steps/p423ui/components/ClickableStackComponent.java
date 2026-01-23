package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClickableStackComponent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\b\u000f\u00107\"\u0004\b8\u00109R&\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010,\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010.¨\u0006@"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "styles", "", "isActive", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;)V", "newChildren", "updateChildren", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "Z", "()Z", "setActive", "(Z)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "getAssociatedViews", "getAssociatedViews$annotations", "()V", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class ClickableStackComponent implements UiComponent, UiComponentGroup, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final List<UiComponent> children;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private boolean isActive;
    private final String name;
    private final ClickableStack.ClickableStackComponentStyle styles;

    /* compiled from: ClickableStackComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ClickableStackComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStackComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ClickableStackComponent.class.getClassLoader()));
            }
            return new ClickableStackComponent(string2, arrayList, (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (ClickableStack.ClickableStackComponentStyle) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStackComponent[] newArray(int i) {
            return new ClickableStackComponent[i];
        }
    }

    public static /* synthetic */ ClickableStackComponent copy$default(ClickableStackComponent clickableStackComponent, String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clickableStackComponent.name;
        }
        if ((i & 2) != 0) {
            list = clickableStackComponent.children;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = clickableStackComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = clickableStackComponent.disabled;
        }
        if ((i & 16) != 0) {
            clickableStackComponentStyle = clickableStackComponent.styles;
        }
        if ((i & 32) != 0) {
            z = clickableStackComponent.isActive;
        }
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle2 = clickableStackComponentStyle;
        boolean z2 = z;
        return clickableStackComponent.copy(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle2, z2);
    }

    public final ClickableStackComponent copy(String name, List<? extends UiComponent> children, JsonLogicBoolean hidden, JsonLogicBoolean disabled, ClickableStack.ClickableStackComponentStyle styles, boolean isActive) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        return new ClickableStackComponent(name, children, hidden, disabled, styles, isActive);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) other;
        return Intrinsics.areEqual(this.name, clickableStackComponent.name) && Intrinsics.areEqual(this.children, clickableStackComponent.children) && Intrinsics.areEqual(this.hidden, clickableStackComponent.hidden) && Intrinsics.areEqual(this.disabled, clickableStackComponent.disabled) && Intrinsics.areEqual(this.styles, clickableStackComponent.styles) && this.isActive == clickableStackComponent.isActive;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        return ((iHashCode3 + (clickableStackComponentStyle != null ? clickableStackComponentStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "ClickableStackComponent(name=" + this.name + ", children=" + this.children + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", styles=" + this.styles + ", isActive=" + this.isActive + ")";
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
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.styles, flags);
        dest.writeInt(this.isActive ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableStackComponent(String name, List<? extends UiComponent> children, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.children = children;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = clickableStackComponentStyle;
        this.isActive = z;
        this.associatedViews = new ArrayList();
    }

    public /* synthetic */ ClickableStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, (i & 32) != 0 ? false : z);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    public final ClickableStack.ClickableStackComponentStyle getStyles() {
        return this.styles;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public ClickableStackComponent(ClickableStack config) {
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
        List list = listEmptyList;
        ClickableStack.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        ClickableStack.Attributes attributes2 = config.getAttributes();
        this(name, list, hidden, attributes2 != null ? attributes2.getDisabled() : null, config.getStyles(), false, 32, null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup
    public UiComponentGroup updateChildren(List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return copy$default(this, null, newChildren, null, null, null, false, 61, null);
    }
}
