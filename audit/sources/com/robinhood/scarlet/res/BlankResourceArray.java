package com.robinhood.scarlet.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlankResourceArray.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/scarlet/res/BlankResourceArray;", "Lcom/robinhood/scarlet/res/ResourceArray;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "length", "", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "getTheme", "()Landroid/content/res/Resources$Theme;", "getLength", "()I", "getResource", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getFont", "context", "Landroid/content/Context;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BlankResourceArray implements ResourceArray {
    public static final int $stable = 8;
    private final int length;
    private final Resources.Theme theme;

    /* renamed from: getFont, reason: collision with other method in class */
    public Void m24745getFont(Context context, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* renamed from: getResource, reason: collision with other method in class */
    public Void m24746getResource(int index) {
        return null;
    }

    public BlankResourceArray(Resources.Theme theme, int i) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.theme = theme;
        this.length = i;
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
    public /* bridge */ /* synthetic */ Typeface getFont(Context context, int i) {
        return (Typeface) m24745getFont(context, i);
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
    public /* bridge */ /* synthetic */ ResourceReferences3 getResource(int i) {
        return (ResourceReferences3) m24746getResource(i);
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
        return this.length;
    }
}
