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
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompositeResourceArray.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00060\u000bR\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/res/CompositeResourceArray;", "Lcom/robinhood/scarlet/res/ResourceArray;", "layers", "", "<init>", "(Ljava/util/List;)V", "length", "", "getLength", "()I", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getTheme", "()Landroid/content/res/Resources$Theme;", "layersByIndex", "", "Lcom/robinhood/utils/Optional;", "[Lcom/robinhood/utils/Optional;", "getLayerForIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getResource", "Lcom/robinhood/scarlet/util/resource/Resource;", "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "recycle", "", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class CompositeResourceArray implements ResourceArray {
    private final List<ResourceArray> layers;
    private final Optional<ResourceArray>[] layersByIndex;
    private final int length;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ CompositeResourceArray(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CompositeResourceArray(List<? extends ResourceArray> list) {
        this.layers = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one layer");
        }
        int length = ((ResourceArray) CollectionsKt.first((List) list)).getLength();
        List<? extends ResourceArray> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ResourceArray) it.next()).getLength() != length) {
                    throw new IllegalArgumentException(("All layers must have the same length: " + this.layers).toString());
                }
            }
        }
        this.length = length;
        this.layersByIndex = new Optional[getLength()];
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
    public int getLength() {
        return this.length;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Resources.Theme getTheme() {
        return ((ResourceArray) CollectionsKt.first((List) this.layers)).getTheme();
    }

    private final ResourceArray getLayerForIndex(int index) {
        Object next;
        Optional<ResourceArray>[] optionalArr = this.layersByIndex;
        Optional<ResourceArray> optional = optionalArr[index];
        if (optional != null) {
            return optional.getOrNull();
        }
        Iterator<T> it = this.layers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ResourceArray) next).getResource(index) != null) {
                break;
            }
        }
        ResourceArray resourceArray = (ResourceArray) next;
        optionalArr[index] = Optional3.asOptional(resourceArray);
        return resourceArray;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public ResourceReferences3<?> getResource(int index) {
        ResourceArray layerForIndex = getLayerForIndex(index);
        if (layerForIndex != null) {
            return layerForIndex.getResource(index);
        }
        return null;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public Typeface getFont(Context context, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        ResourceArray layerForIndex = getLayerForIndex(index);
        if (layerForIndex != null) {
            return layerForIndex.getFont(context, index);
        }
        return null;
    }

    @Override // com.robinhood.scarlet.res.ResourceArray
    public void recycle() {
        Iterator<ResourceArray> it = this.layers.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        ResourceArray.DefaultImpls.recycle(this);
    }

    /* compiled from: CompositeResourceArray.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/scarlet/res/CompositeResourceArray$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/scarlet/res/ResourceArray;", "layers", "", "of$lib_scarlet_externalRelease", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResourceArray of$lib_scarlet_externalRelease(List<? extends ResourceArray> layers) {
            Intrinsics.checkNotNullParameter(layers, "layers");
            int size = layers.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (ResourceArray) CollectionsKt.single((List) layers);
            }
            return new CompositeResourceArray(layers, defaultConstructorMarker);
        }
    }
}
