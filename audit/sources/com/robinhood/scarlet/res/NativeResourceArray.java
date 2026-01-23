package com.robinhood.scarlet.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.TypedArrays2;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.TypedArrays3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NativeResourceArray.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/scarlet/res/NativeResourceArray;", "Lcom/robinhood/scarlet/res/ResourceArray;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "typedArray", "Landroid/content/res/TypedArray;", "<init>", "(Landroid/content/res/Resources$Theme;Landroid/content/res/TypedArray;)V", "getTheme", "()Landroid/content/res/Resources$Theme;", "length", "", "getLength", "()I", "resolvedValues", "", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/scarlet/util/resource/Resource;", "[Lcom/robinhood/utils/Optional;", "getResource", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "recycle", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class NativeResourceArray implements ResourceArray {
    public static final int $stable = 8;
    private final Optional<ResourceReferences3<?>>[] resolvedValues;
    private final Resources.Theme theme;
    private final TypedArray typedArray;

    public NativeResourceArray(Resources.Theme theme, TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        this.theme = theme;
        this.typedArray = typedArray;
        this.resolvedValues = new Optional[getLength()];
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
    public Resources.Theme getTheme() {
        return this.theme;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public int getLength() {
        return this.typedArray.length();
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public ResourceReferences3<?> getResource(int index) {
        Optional<ResourceReferences3<?>>[] optionalArr = this.resolvedValues;
        Optional<ResourceReferences3<?>> optional = optionalArr[index];
        if (optional != null) {
            return optional.getOrNull();
        }
        ResourceReferences4<?> reference = TypedArrays2.getReference(this.typedArray, getTheme(), index);
        ResourceReferences3<?> resourceReferences3ResolveResource = reference != null ? reference.resolveResource(getTheme()) : null;
        optionalArr[index] = Optional3.asOptional(resourceReferences3ResolveResource);
        return resourceReferences3ResolveResource;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Typeface getFont(Context context, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedArrays3.getFontCompat(this.typedArray, context, index);
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public void recycle() {
        this.typedArray.recycle();
    }
}
