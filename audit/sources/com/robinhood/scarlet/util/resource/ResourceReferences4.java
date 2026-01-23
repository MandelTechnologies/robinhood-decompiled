package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcelable;
import android.util.TypedValue;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00002\n\u0010\f\u001a\u00060\rR\u00020\u000e¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00002\n\u0010\f\u001a\u00060\rR\u00020\u000e¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u0016\u000b\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceReference;", "T", "", "Landroid/os/Parcelable;", "<init>", "()V", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "getType", "()Lcom/robinhood/scarlet/util/resource/ResourceType;", "resolveResource", "Lcom/robinhood/scarlet/util/resource/Resource;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "describe", "", "resources", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "resolveOrThrow", "Companion", "Lcom/robinhood/scarlet/util/resource/BoxedResourceReference;", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.util.resource.ResourceReference, reason: use source file name */
/* loaded from: classes21.dex */
public abstract class ResourceReferences4<T> implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ResourceReferences4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String describe(Resources resources);

    public abstract ResourceType<? extends T> getType();

    public abstract ResourceReferences3<T> resolveResource(Resources.Theme theme);

    private ResourceReferences4() {
    }

    public final T resolve(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        ResourceReferences3<T> resourceReferences3ResolveResource = resolveResource(theme);
        if (resourceReferences3ResolveResource != null) {
            return resourceReferences3ResolveResource.get(theme);
        }
        return null;
    }

    public final T resolveOrThrow(Resources.Theme theme) throws ResourceReferences9 {
        Intrinsics.checkNotNullParameter(theme, "theme");
        T tResolve = resolve(theme);
        if (tResolve != null) {
            return tResolve;
        }
        Resources resources = theme.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String strDescribe = describe(resources);
        String string2 = theme.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        throw new ResourceReferences9(this, strDescribe, string2);
    }

    /* compiled from: ResourceReferences.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ'\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\r\u001a\u00060\u000eR\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceReference$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "T", "resources", "Landroid/content/res/Resources;", "resourceType", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "resId", "", "theme", "Landroid/content/res/Resources$Theme;", "typedValue", "Landroid/util/TypedValue;", "from$lib_scarlet_externalRelease", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.scarlet.util.resource.ResourceReference$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> ResourceReferences4<T> from(Resources resources, ResourceType<T> resourceType, int resId) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(resourceType, "resourceType");
            if (resId == 0) {
                return ResourceValue.INSTANCE.getEMPTY();
            }
            String resourceTypeName = resources.getResourceTypeName(resId);
            if (Intrinsics.areEqual(resourceTypeName, ResourceTypes.ATTRIBUTE) || Intrinsics.areEqual(resourceTypeName, ResourceTypes.SAMSUNG_PRIVATE_ATTRIBUTE)) {
                return new ResourceReferences8(resourceType, resId);
            }
            return new DirectResourceReference(resourceType, resId);
        }

        public final ResourceReferences4<?> from$lib_scarlet_externalRelease(Resources.Theme theme, TypedValue typedValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            int i = typedValue.type;
            if (i == 0) {
                if (typedValue.data == 1) {
                    return ResourceValue.INSTANCE.getEMPTY();
                }
                return null;
            }
            if (i == 1) {
                return new DirectResourceReference(ResourceType.DYNAMIC.INSTANCE, typedValue.data);
            }
            if (i == 2) {
                return new ResourceReferences8(ResourceType.DYNAMIC.INSTANCE, typedValue.data);
            }
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                return new DirectResourceReference(ResourceType.DYNAMIC.INSTANCE, i2);
            }
            ResourceType.DYNAMIC dynamic = ResourceType.DYNAMIC.INSTANCE;
            return new ResourceValue(dynamic, dynamic.readFrom(theme, typedValue));
        }
    }
}
