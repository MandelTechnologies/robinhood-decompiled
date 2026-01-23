package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.res.ResourceArray2;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 2*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u00012BE\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\f¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c2\n\u0010\u001d\u001a\u00060\u001eR\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bH\u0016J\u0011\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\fHÆ\u0003JS\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\fHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020!HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u001a¨\u00063"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/BoxedResourceReference;", "T", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "attributeId", "", ResourceTypes.STYLE, "Lcom/robinhood/scarlet/util/resource/StyleResource;", "defStyle", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceType;ILcom/robinhood/scarlet/util/resource/ResourceReference;Ljava/util/List;)V", "getType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "getAttributeId", "()I", "getStyle", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getDefStyle", "()Ljava/util/List;", "attributes", "", "getAttributes$annotations", "()V", "resolveResource", "Lcom/robinhood/scarlet/util/resource/Resource;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "describe", "", "resources", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final /* data */ class BoxedResourceReference<T> extends ResourceReferences4<T> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<BoxedResourceReference<Object>> CREATOR;
    private final int attributeId;
    private final int[] attributes;
    private final List<ResourceReferences4<StyleResource>> defStyle;
    private final ResourceReferences4<StyleResource> style;
    private final ResourceType<? extends T> type;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoxedResourceReference copy$default(BoxedResourceReference boxedResourceReference, ResourceType resourceType, int i, ResourceReferences4 resourceReferences4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceType = boxedResourceReference.type;
        }
        if ((i2 & 2) != 0) {
            i = boxedResourceReference.attributeId;
        }
        if ((i2 & 4) != 0) {
            resourceReferences4 = boxedResourceReference.style;
        }
        if ((i2 & 8) != 0) {
            list = boxedResourceReference.defStyle;
        }
        return boxedResourceReference.copy(resourceType, i, resourceReferences4, list);
    }

    private static /* synthetic */ void getAttributes$annotations() {
    }

    public final ResourceType<? extends T> component1() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAttributeId() {
        return this.attributeId;
    }

    public final ResourceReferences4<StyleResource> component3() {
        return this.style;
    }

    public final List<ResourceReferences4<StyleResource>> component4() {
        return this.defStyle;
    }

    public final BoxedResourceReference<T> copy(ResourceType<? extends T> type2, int attributeId, ResourceReferences4<StyleResource> style, List<? extends ResourceReferences4<StyleResource>> defStyle) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        return new BoxedResourceReference<>(type2, attributeId, style, defStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxedResourceReference)) {
            return false;
        }
        BoxedResourceReference boxedResourceReference = (BoxedResourceReference) other;
        return Intrinsics.areEqual(this.type, boxedResourceReference.type) && this.attributeId == boxedResourceReference.attributeId && Intrinsics.areEqual(this.style, boxedResourceReference.style) && Intrinsics.areEqual(this.defStyle, boxedResourceReference.defStyle);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + Integer.hashCode(this.attributeId)) * 31;
        ResourceReferences4<StyleResource> resourceReferences4 = this.style;
        return ((iHashCode + (resourceReferences4 == null ? 0 : resourceReferences4.hashCode())) * 31) + this.defStyle.hashCode();
    }

    public String toString() {
        return "BoxedResourceReference(type=" + this.type + ", attributeId=" + this.attributeId + ", style=" + this.style + ", defStyle=" + this.defStyle + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceType<? extends T> getType() {
        return this.type;
    }

    public final int getAttributeId() {
        return this.attributeId;
    }

    public final ResourceReferences4<StyleResource> getStyle() {
        return this.style;
    }

    public final List<ResourceReferences4<StyleResource>> getDefStyle() {
        return this.defStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxedResourceReference(ResourceType<? extends T> type2, int i, ResourceReferences4<StyleResource> resourceReferences4, List<? extends ResourceReferences4<StyleResource>> defStyle) {
        super(null);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(defStyle, "defStyle");
        this.type = type2;
        this.attributeId = i;
        this.style = resourceReferences4;
        this.defStyle = defStyle;
        this.attributes = new int[]{i};
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public ResourceReferences3<T> resolveResource(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        ResourceArray resourceArrayObtainStyledResources = ResourceArray2.obtainStyledResources(theme, this.attributes, this.style, this.defStyle);
        try {
            return resourceArrayObtainStyledResources.getResource(getType(), 0);
        } finally {
            resourceArrayObtainStyledResources.recycle();
        }
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceReferences4
    public String describe(final Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return BoxedResourceReference.class.getSimpleName() + '<' + getType() + ">(styleReferences=" + CollectionsKt.joinToString$default(this.defStyle, null, null, null, 0, null, new Function1() { // from class: com.robinhood.scarlet.util.resource.BoxedResourceReference$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoxedResourceReference.describe$lambda$2$lambda$1(resources, (ResourceReferences4) obj);
            }
        }, 31, null) + ", attributeId=" + resources.getResourceName(this.attributeId) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence describe$lambda$2$lambda$1(Resources resources, ResourceReferences4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.describe(resources);
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(getType(), flags);
        dest.writeInt(this.attributeId);
        dest.writeParcelable(this.style, flags);
        dest.writeList(this.defStyle);
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<BoxedResourceReference<? extends Object>>() { // from class: com.robinhood.scarlet.util.resource.BoxedResourceReference$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public BoxedResourceReference<? extends Object> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public BoxedResourceReference<? extends Object>[] newArray(int size) {
                return new BoxedResourceReference[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public BoxedResourceReference<? extends Object> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                int i = source.readInt();
                ResourceReferences4 resourceReferences4 = (ResourceReferences4) source.readParcelable(loader);
                ArrayList arrayList = source.readArrayList(loader);
                Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.robinhood.scarlet.util.resource.ResourceReference<com.robinhood.scarlet.util.resource.StyleResource>>");
                return new BoxedResourceReference<>((ResourceType) parcelable, i, resourceReferences4, arrayList);
            }
        };
    }
}
