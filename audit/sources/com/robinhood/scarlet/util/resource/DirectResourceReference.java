package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001(B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016J2\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0003\"\b\b\u0001\u0010\u0016*\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00062\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "T", "", "Lcom/robinhood/scarlet/util/resource/Resource;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "resId", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceType;I)V", "getType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "getResId", "()I", "get", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "resolveResource", "convertTo", "R", "targetType", "describe", "", "resources", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final /* data */ class DirectResourceReference<T> extends ResourceReferences3<T> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<DirectResourceReference<Object>> CREATOR;
    private final int resId;
    private final ResourceType<T> type;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectResourceReference copy$default(DirectResourceReference directResourceReference, ResourceType resourceType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceType = directResourceReference.type;
        }
        if ((i2 & 2) != 0) {
            i = directResourceReference.resId;
        }
        return directResourceReference.copy(resourceType, i);
    }

    public final ResourceType<T> component1() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    public final DirectResourceReference<T> copy(ResourceType<T> type2, int resId) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new DirectResourceReference<>(type2, resId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectResourceReference)) {
            return false;
        }
        DirectResourceReference directResourceReference = (DirectResourceReference) other;
        return Intrinsics.areEqual(this.type, directResourceReference.type) && this.resId == directResourceReference.resId;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Integer.hashCode(this.resId);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceReferences3<T> resolveResource(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return this;
    }

    public String toString() {
        return "DirectResourceReference(type=" + this.type + ", resId=" + this.resId + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceType<T> getType() {
        return this.type;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectResourceReference(ResourceType<T> type2, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.resId = i;
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences3
    public T get(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return getType().getResource(theme, this.resId);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences3
    public <R> ResourceReferences3<R> convertTo(ResourceType<R> targetType, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new DirectResourceReference(targetType, this.resId);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public String describe(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return DirectResourceReference.class.getSimpleName() + "<" + getType() + ">(" + resources.getResourceName(this.resId) + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(getType(), flags);
        dest.writeInt(this.resId);
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<DirectResourceReference<Object>>() { // from class: com.robinhood.scarlet.util.resource.DirectResourceReference$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public DirectResourceReference<Object> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public DirectResourceReference<Object>[] newArray(int size) {
                return new DirectResourceReference[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public DirectResourceReference<Object> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                return new DirectResourceReference<>((ResourceType) parcelable, source.readInt());
            }
        };
    }
}
