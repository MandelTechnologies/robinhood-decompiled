package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Branding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrandingComponent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "name", "", "showBranding", "<init>", "(Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "getShowBranding", "()Z", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class BrandingComponent implements UiComponent {
    public static final Parcelable.Creator<BrandingComponent> CREATOR = new Creator();
    private final String name;
    private final boolean showBranding;

    /* compiled from: BrandingComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandingComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrandingComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandingComponent(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrandingComponent[] newArray(int i) {
            return new BrandingComponent[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingComponent)) {
            return false;
        }
        BrandingComponent brandingComponent = (BrandingComponent) other;
        return Intrinsics.areEqual(this.name, brandingComponent.name) && this.showBranding == brandingComponent.showBranding;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.showBranding);
    }

    public String toString() {
        return "BrandingComponent(name=" + this.name + ", showBranding=" + this.showBranding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.showBranding ? 1 : 0);
    }

    public BrandingComponent(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.showBranding = z;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final boolean getShowBranding() {
        return this.showBranding;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrandingComponent(Branding config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this(config.getName(), !(config.getAttributes() != null ? Intrinsics.areEqual(r3.getHideLogo(), Boolean.TRUE) : false));
    }
}
