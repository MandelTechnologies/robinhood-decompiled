package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001*B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\n\u0010\u0015\u001a\u00060\u0016R\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003JO\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010(\u001a\u00020 HÖ\u0001J\t\u0010)\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006+"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/SelectorResource;", "T", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "selector", "", "trueReference", "otherwiseReference", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceType;Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "getType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "getSelector", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getTrueReference", "getOtherwiseReference", "resolveResource", "Lcom/robinhood/scarlet/util/resource/Resource;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "describe", "", "resources", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final /* data */ class SelectorResource<T> extends ResourceReferences4<T> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<SelectorResource<Object>> CREATOR;
    private final ResourceReferences4<T> otherwiseReference;
    private final ResourceReferences4<Boolean> selector;
    private final ResourceReferences4<T> trueReference;
    private final ResourceType<T> type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectorResource copy$default(SelectorResource selectorResource, ResourceType resourceType, ResourceReferences4 resourceReferences4, ResourceReferences4 resourceReferences42, ResourceReferences4 resourceReferences43, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceType = selectorResource.type;
        }
        if ((i & 2) != 0) {
            resourceReferences4 = selectorResource.selector;
        }
        if ((i & 4) != 0) {
            resourceReferences42 = selectorResource.trueReference;
        }
        if ((i & 8) != 0) {
            resourceReferences43 = selectorResource.otherwiseReference;
        }
        return selectorResource.copy(resourceType, resourceReferences4, resourceReferences42, resourceReferences43);
    }

    public final ResourceType<T> component1() {
        return this.type;
    }

    public final ResourceReferences4<Boolean> component2() {
        return this.selector;
    }

    public final ResourceReferences4<T> component3() {
        return this.trueReference;
    }

    public final ResourceReferences4<T> component4() {
        return this.otherwiseReference;
    }

    public final SelectorResource<T> copy(ResourceType<T> type2, ResourceReferences4<Boolean> selector, ResourceReferences4<? extends T> trueReference, ResourceReferences4<? extends T> otherwiseReference) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(trueReference, "trueReference");
        Intrinsics.checkNotNullParameter(otherwiseReference, "otherwiseReference");
        return new SelectorResource<>(type2, selector, trueReference, otherwiseReference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectorResource)) {
            return false;
        }
        SelectorResource selectorResource = (SelectorResource) other;
        return Intrinsics.areEqual(this.type, selectorResource.type) && Intrinsics.areEqual(this.selector, selectorResource.selector) && Intrinsics.areEqual(this.trueReference, selectorResource.trueReference) && Intrinsics.areEqual(this.otherwiseReference, selectorResource.otherwiseReference);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.selector.hashCode()) * 31) + this.trueReference.hashCode()) * 31) + this.otherwiseReference.hashCode();
    }

    public String toString() {
        return "SelectorResource(type=" + this.type + ", selector=" + this.selector + ", trueReference=" + this.trueReference + ", otherwiseReference=" + this.otherwiseReference + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceType<T> getType() {
        return this.type;
    }

    public final ResourceReferences4<Boolean> getSelector() {
        return this.selector;
    }

    public final ResourceReferences4<T> getTrueReference() {
        return this.trueReference;
    }

    public final ResourceReferences4<T> getOtherwiseReference() {
        return this.otherwiseReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectorResource(ResourceType<T> type2, ResourceReferences4<Boolean> selector, ResourceReferences4<? extends T> trueReference, ResourceReferences4<? extends T> otherwiseReference) {
        super(null);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(trueReference, "trueReference");
        Intrinsics.checkNotNullParameter(otherwiseReference, "otherwiseReference");
        this.type = type2;
        this.selector = selector;
        this.trueReference = trueReference;
        this.otherwiseReference = otherwiseReference;
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceReferences3<T> resolveResource(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Boolean boolResolve = this.selector.resolve(theme);
        if (Intrinsics.areEqual(boolResolve, Boolean.TRUE)) {
            return this.trueReference.resolveResource(theme);
        }
        if (!Intrinsics.areEqual(boolResolve, Boolean.FALSE) && boolResolve != null) {
            throw new NoWhenBranchMatchedException();
        }
        return this.otherwiseReference.resolveResource(theme);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public String describe(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return SelectorResource.class.getSimpleName() + "<" + getType() + ">(sel=" + this.selector.describe(resources) + ", true=" + this.trueReference.describe(resources) + ", otherwise=" + this.otherwiseReference.describe(resources) + "})";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(getType(), flags);
        dest.writeParcelable(this.selector, flags);
        dest.writeParcelable(this.trueReference, flags);
        dest.writeParcelable(this.otherwiseReference, flags);
    }

    /* compiled from: ResourceReferences.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/SelectorResource$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<SelectorResource<Object>>() { // from class: com.robinhood.scarlet.util.resource.SelectorResource$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public SelectorResource<Object> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SelectorResource<Object>[] newArray(int size) {
                return new SelectorResource[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SelectorResource<Object> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                Parcelable parcelable2 = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable2);
                Parcelable parcelable3 = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable3);
                Parcelable parcelable4 = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable4);
                return new SelectorResource<>((ResourceType) parcelable, (ResourceReferences4) parcelable2, (ResourceReferences4) parcelable3, (ResourceReferences4) parcelable4);
            }
        };
    }
}
