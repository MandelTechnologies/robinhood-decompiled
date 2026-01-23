package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 **\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001*B!\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J2\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u0000\"\b\b\u0001\u0010\u001f*\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00062\n\u0010\u0010\u001a\u00060\u0011R\u00020\u0012H\u0016J\u0011\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010(\u001a\u00020\u001dHÖ\u0001J\t\u0010)\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006+"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceValue;", "T", "", "Lcom/robinhood/scarlet/util/resource/Resource;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "value", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)V", "getType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "resolveResource", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "get", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "describe", "", "resources", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "convertTo", "R", "targetType", "component1", "component2", "copy", "(Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Lcom/robinhood/scarlet/util/resource/ResourceValue;", "equals", "", "other", "hashCode", "toString", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final /* data */ class ResourceValue<T> extends ResourceReferences3<T> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<ResourceValue<Object>> CREATOR;
    private static final ResourceValue EMPTY;
    private final ResourceType<? extends T> type;
    private final T value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceValue copy$default(ResourceValue resourceValue, ResourceType resourceType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            resourceType = resourceValue.type;
        }
        if ((i & 2) != 0) {
            obj = resourceValue.value;
        }
        return resourceValue.copy(resourceType, obj);
    }

    public final ResourceType<? extends T> component1() {
        return this.type;
    }

    public final T component2() {
        return this.value;
    }

    public final ResourceValue<T> copy(ResourceType<? extends T> type2, T value) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ResourceValue<>(type2, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceValue)) {
            return false;
        }
        ResourceValue resourceValue = (ResourceValue) other;
        return Intrinsics.areEqual(this.type, resourceValue.type) && Intrinsics.areEqual(this.value, resourceValue.value);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        T t = this.value;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceValue<T> resolveResource(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return this;
    }

    public String toString() {
        return "ResourceValue(type=" + this.type + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceType<? extends T> getType() {
        return this.type;
    }

    public final T getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceValue(ResourceType<? extends T> type2, T t) {
        super(null);
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.value = t;
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences3
    public T get(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return this.value;
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public String describe(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return ResourceValue.class.getSimpleName() + '<' + getType() + ">(value=" + this.value + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(getType(), flags);
        dest.writeValue(this.value);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences3
    public <R> ResourceValue<R> convertTo(ResourceType<R> targetType, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (this.value == null) {
            return EMPTY;
        }
        return new ResourceValue<>(targetType, targetType.convertFrom$lib_scarlet_externalRelease(theme, getType(), this.value));
    }

    /* compiled from: ResourceReferences.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceValue$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lcom/robinhood/scarlet/util/resource/ResourceValue;", "EMPTY", "", "getEMPTY", "()Lcom/robinhood/scarlet/util/resource/ResourceValue;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResourceValue getEMPTY() {
            return ResourceValue.EMPTY;
        }
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<ResourceValue<? extends Object>>() { // from class: com.robinhood.scarlet.util.resource.ResourceValue$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public ResourceValue<? extends Object> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public ResourceValue<? extends Object>[] newArray(int size) {
                return new ResourceValue[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public ResourceValue<? extends Object> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                return new ResourceValue<>((ResourceType) parcelable, source.readValue(loader));
            }
        };
        EMPTY = new ResourceValue(ResourceType.NOTHING.INSTANCE, null);
    }
}
