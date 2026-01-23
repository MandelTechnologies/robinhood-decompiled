package com.robinhood.scarlet.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RuntimeResourceArray.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/scarlet/res/RuntimeResourceArray;", "Lcom/robinhood/scarlet/res/ResourceArray;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributes", "", "naiveValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "<init>", "(Landroid/content/res/Resources$Theme;[ILandroid/util/SparseArray;)V", "getTheme", "()Landroid/content/res/Resources$Theme;", "length", "", "getLength", "()I", "resolvedValues", "", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/scarlet/util/resource/Resource;", "[Lcom/robinhood/utils/Optional;", "getResource", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class RuntimeResourceArray implements ResourceArray {
    public static final int $stable = 8;
    private final int[] attributes;
    private final SparseArray<ResourceReferences4<?>> naiveValues;
    private final Optional<ResourceReferences3<?>>[] resolvedValues;
    private final Resources.Theme theme;

    public RuntimeResourceArray(Resources.Theme theme, int[] attributes, SparseArray<ResourceReferences4<?>> naiveValues) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(naiveValues, "naiveValues");
        this.theme = theme;
        this.attributes = attributes;
        this.naiveValues = naiveValues;
        this.resolvedValues = new Optional[attributes.length];
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Boolean getBoolean(int i) {
        return ResourceArray.DefaultImpls.getBoolean(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public boolean getBooleanOrThrow(int i) {
        return ResourceArray.DefaultImpls.getBooleanOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Integer getColor(int i) {
        return ResourceArray.DefaultImpls.getColor(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getColorOrThrow(int i) {
        return ResourceArray.DefaultImpls.getColorOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public ColorStateList getColorStateList(int i) {
        return ResourceArray.DefaultImpls.getColorStateList(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public ColorStateList getColorStateListOrThrow(int i) {
        return ResourceArray.DefaultImpls.getColorStateListOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Float getDimension(int i) {
        return ResourceArray.DefaultImpls.getDimension(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public float getDimensionOrThrow(int i) {
        return ResourceArray.DefaultImpls.getDimensionOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Integer getDimensionPixelSize(int i) {
        return ResourceArray.DefaultImpls.getDimensionPixelSize(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getDimensionPixelSizeOrThrow(int i) {
        return ResourceArray.DefaultImpls.getDimensionPixelSizeOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Drawable getDrawable(int i) {
        return ResourceArray.DefaultImpls.getDrawable(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Drawable getDrawableOrThrow(int i) {
        return ResourceArray.DefaultImpls.getDrawableOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Float getFloat(int i) {
        return ResourceArray.DefaultImpls.getFloat(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public float getFloatOrThrow(int i) {
        return ResourceArray.DefaultImpls.getFloatOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Typeface getFontOrThrow(Context context, int i) {
        return ResourceArray.DefaultImpls.getFontOrThrow(this, context, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Integer getInt(int i) {
        return ResourceArray.DefaultImpls.getInt(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getIntOrThrow(int i) {
        return ResourceArray.DefaultImpls.getIntOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Integer getLayoutDimension(int i) {
        return ResourceArray.DefaultImpls.getLayoutDimension(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getLayoutDimensionOrThrow(int i) {
        return ResourceArray.DefaultImpls.getLayoutDimensionOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public <T> ResourceReferences3<T> getResource(ResourceType<T> resourceType, int i) {
        return ResourceArray.DefaultImpls.getResource(this, resourceType, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Integer getResourceId(int i) {
        return ResourceArray.DefaultImpls.getResourceId(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getResourceIdOrThrow(int i) {
        return ResourceArray.DefaultImpls.getResourceIdOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public String getString(int i) {
        return ResourceArray.DefaultImpls.getString(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public String getStringOrThrow(int i) {
        return ResourceArray.DefaultImpls.getStringOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public CharSequence getText(int i) {
        return ResourceArray.DefaultImpls.getText(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public CharSequence getTextOrThrow(int i) {
        return ResourceArray.DefaultImpls.getTextOrThrow(this, i);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public void recycle() {
        ResourceArray.DefaultImpls.recycle(this);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Resources.Theme getTheme() {
        return this.theme;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getLength() {
        return this.attributes.length;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public ResourceReferences3<?> getResource(int index) {
        Optional<ResourceReferences3<?>>[] optionalArr = this.resolvedValues;
        Optional<ResourceReferences3<?>> optional = optionalArr[index];
        if (optional != null) {
            return optional.getOrNull();
        }
        ResourceReferences4<?> resourceReferences4 = this.naiveValues.get(this.attributes[index]);
        ResourceReferences3<?> resourceReferences3ResolveResource = resourceReferences4 != null ? resourceReferences4.resolveResource(getTheme()) : null;
        optionalArr[index] = Optional3.asOptional(resourceReferences3ResolveResource);
        return resourceReferences3ResolveResource;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Typeface getFont(Context context, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer resourceId = getResourceId(index);
        if (resourceId != null) {
            return ContextsUiExtensions.getFont(context, resourceId.intValue());
        }
        return null;
    }
}
