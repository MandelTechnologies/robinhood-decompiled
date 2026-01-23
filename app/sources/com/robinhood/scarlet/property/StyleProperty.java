package com.robinhood.scarlet.property;

import android.content.res.Resources;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StyleProperty.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u001fB'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/scarlet/property/StyleProperty;", "V", "", "resourceType", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "name", "", "attributeId", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/String;I)V", "getResourceType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "getName", "()Ljava/lang/String;", "getAttributeId", "()I", "readFrom", "value", "Lcom/robinhood/scarlet/res/ResourceArray;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Lcom/robinhood/scarlet/res/ResourceArray;I)Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class StyleProperty<V> {
    private final int attributeId;
    private final String name;
    private final ResourceType<V> resourceType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StyleProperty copy$default(StyleProperty styleProperty, ResourceType resourceType, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceType = styleProperty.resourceType;
        }
        if ((i2 & 2) != 0) {
            str = styleProperty.name;
        }
        if ((i2 & 4) != 0) {
            i = styleProperty.attributeId;
        }
        return styleProperty.copy(resourceType, str, i);
    }

    public final ResourceType<V> component1() {
        return this.resourceType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAttributeId() {
        return this.attributeId;
    }

    public final StyleProperty<V> copy(ResourceType<V> resourceType, String name, int attributeId) {
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(name, "name");
        return new StyleProperty<>(resourceType, name, attributeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleProperty)) {
            return false;
        }
        StyleProperty styleProperty = (StyleProperty) other;
        return Intrinsics.areEqual(this.resourceType, styleProperty.resourceType) && Intrinsics.areEqual(this.name, styleProperty.name) && this.attributeId == styleProperty.attributeId;
    }

    public int hashCode() {
        return (((this.resourceType.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.attributeId);
    }

    public String toString() {
        return "StyleProperty(resourceType=" + this.resourceType + ", name=" + this.name + ", attributeId=" + this.attributeId + ")";
    }

    public StyleProperty(ResourceType<V> resourceType, String name, int i) {
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.resourceType = resourceType;
        this.name = name;
        this.attributeId = i;
    }

    public final ResourceType<V> getResourceType() {
        return this.resourceType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getAttributeId() {
        return this.attributeId;
    }

    public final V readFrom(ResourceArray value, int index) {
        Intrinsics.checkNotNullParameter(value, "value");
        ResourceReferences3 resource = value.getResource(this.resourceType, index);
        if (resource != null) {
            return (V) resource.get(value.getTheme());
        }
        return null;
    }

    /* compiled from: StyleProperty.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/scarlet/property/StyleProperty$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/property/StyleProperty;", "V", "resources", "Landroid/content/res/Resources;", "attributeId", "", "resourceType", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <V> StyleProperty<V> from(Resources resources, int attributeId, ResourceType<V> resourceType) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(resourceType, "resourceType");
            String resourceEntryName = resources.getResourceEntryName(attributeId);
            Intrinsics.checkNotNullExpressionValue(resourceEntryName, "getResourceEntryName(...)");
            return new StyleProperty<>(resourceType, resourceEntryName, attributeId);
        }
    }
}
