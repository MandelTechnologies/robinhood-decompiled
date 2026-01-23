package com.robinhood.scarlet.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: ResourceArray.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 ?2\u00020\u0001:\u0001?J\u0018\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\bH&J2\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\f\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\bH&J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0012\u0010!\u001a\u00020 2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020#2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017J\u0019\u0010&\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\u001dJ\u0012\u0010'\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0017J\u0014\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0012\u0010*\u001a\u00020)2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010+\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010$J\u0012\u0010,\u001a\u00020#2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010-\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001dJ\u0012\u0010.\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u0010/\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001dJ\u0012\u00100\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0019\u00101\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001dJ\u0012\u00102\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0014\u00103\u001a\u0004\u0018\u0001042\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0012\u00105\u001a\u0002042\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0014\u00106\u001a\u0004\u0018\u0001072\b\b\u0001\u0010\r\u001a\u00020\bH\u0016J\u0012\u00108\u001a\u0002072\b\b\u0001\u0010\r\u001a\u00020\bH\u0016JB\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\b2#\u0010;\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u0001H:0<H\u0082\bR\u0016\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006@"}, m3636d2 = {"Lcom/robinhood/scarlet/res/ResourceArray;", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getTheme", "()Landroid/content/res/Resources$Theme;", "length", "", "getLength", "()I", "getResource", "Lcom/robinhood/scarlet/util/resource/Resource;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "T", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "recycle", "", "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "getFontOrThrow", "getBoolean", "", "(I)Ljava/lang/Boolean;", "getBooleanOrThrow", "getColor", "(I)Ljava/lang/Integer;", "getColorOrThrow", "getColorStateList", "Landroid/content/res/ColorStateList;", "getColorStateListOrThrow", "getDimension", "", "(I)Ljava/lang/Float;", "getDimensionOrThrow", "getDimensionPixelSize", "getDimensionPixelSizeOrThrow", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getDrawableOrThrow", "getFloat", "getFloatOrThrow", "getInt", "getIntOrThrow", "getLayoutDimension", "getLayoutDimensionOrThrow", "getResourceId", "getResourceIdOrThrow", "getString", "", "getStringOrThrow", "getText", "", "getTextOrThrow", "getOrThrow", "R", "get", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ResourceArray {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Boolean getBoolean(int index);

    boolean getBooleanOrThrow(int index);

    Integer getColor(int index);

    int getColorOrThrow(int index);

    ColorStateList getColorStateList(int index);

    ColorStateList getColorStateListOrThrow(int index);

    Float getDimension(int index);

    float getDimensionOrThrow(int index);

    Integer getDimensionPixelSize(int index);

    int getDimensionPixelSizeOrThrow(int index);

    Drawable getDrawable(int index);

    Drawable getDrawableOrThrow(int index);

    Float getFloat(int index);

    float getFloatOrThrow(int index);

    Typeface getFont(Context context, int index);

    Typeface getFontOrThrow(Context context, int index);

    Integer getInt(int index);

    int getIntOrThrow(int index);

    Integer getLayoutDimension(int index);

    int getLayoutDimensionOrThrow(int index);

    int getLength();

    ResourceReferences3<?> getResource(int index);

    <T> ResourceReferences3<T> getResource(ResourceType<T> type2, int index);

    Integer getResourceId(int index);

    int getResourceIdOrThrow(int index);

    String getString(int index);

    String getStringOrThrow(int index);

    CharSequence getText(int index);

    CharSequence getTextOrThrow(int index);

    Resources.Theme getTheme();

    void recycle();

    /* compiled from: ResourceArray.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void recycle(ResourceArray resourceArray) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> ResourceReferences3<T> getResource(ResourceArray resourceArray, ResourceType<T> type2, int i) {
            Intrinsics.checkNotNullParameter(type2, "type");
            ResourceReferences3<?> resource = resourceArray.getResource(i);
            if (resource != null) {
                return (ResourceReferences3<T>) resource.convertTo(type2, resourceArray.getTheme());
            }
            return null;
        }

        public static Typeface getFontOrThrow(ResourceArray resourceArray, Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Typeface font = resourceArray.getFont(context, i);
            if (font != null) {
                return font;
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Boolean getBoolean(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.BOOLEAN.INSTANCE, i);
            if (resource != null) {
                return (Boolean) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static boolean getBooleanOrThrow(ResourceArray resourceArray, int i) {
            Boolean bool = resourceArray.getBoolean(i);
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Integer getColor(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.COLOR.INSTANCE, i);
            if (resource != null) {
                return (Integer) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static int getColorOrThrow(ResourceArray resourceArray, int i) {
            Integer color = resourceArray.getColor(i);
            if (color != null) {
                return color.intValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static ColorStateList getColorStateList(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.COLOR_STATE_LIST.INSTANCE, i);
            if (resource != null) {
                return (ColorStateList) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static ColorStateList getColorStateListOrThrow(ResourceArray resourceArray, int i) {
            ColorStateList colorStateList = resourceArray.getColorStateList(i);
            if (colorStateList != null) {
                return colorStateList;
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Float getDimension(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.DIMENSION.INSTANCE, i);
            if (resource != null) {
                return (Float) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static float getDimensionOrThrow(ResourceArray resourceArray, int i) {
            Float dimension = resourceArray.getDimension(i);
            if (dimension != null) {
                return dimension.floatValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Integer getDimensionPixelSize(ResourceArray resourceArray, int i) {
            Float f;
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.DIMENSION.INSTANCE, i);
            if (resource == null || (f = (Float) resource.get(resourceArray.getTheme())) == null) {
                return null;
            }
            return Integer.valueOf(MathKt.roundToInt(f.floatValue()));
        }

        public static int getDimensionPixelSizeOrThrow(ResourceArray resourceArray, int i) {
            Integer dimensionPixelSize = resourceArray.getDimensionPixelSize(i);
            if (dimensionPixelSize != null) {
                return dimensionPixelSize.intValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Drawable getDrawable(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.DRAWABLE.INSTANCE, i);
            if (resource != null) {
                return (Drawable) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static Drawable getDrawableOrThrow(ResourceArray resourceArray, int i) {
            Drawable drawable = resourceArray.getDrawable(i);
            if (drawable != null) {
                return drawable;
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Float getFloat(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.FLOAT.INSTANCE, i);
            if (resource != null) {
                return (Float) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static float getFloatOrThrow(ResourceArray resourceArray, int i) {
            Float f = resourceArray.getFloat(i);
            if (f != null) {
                return f.floatValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Integer getInt(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.INTEGER.INSTANCE, i);
            if (resource != null) {
                return (Integer) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static int getIntOrThrow(ResourceArray resourceArray, int i) {
            Integer num = resourceArray.getInt(i);
            if (num != null) {
                return num.intValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Integer getLayoutDimension(ResourceArray resourceArray, int i) {
            return resourceArray.getDimensionPixelSize(i);
        }

        public static int getLayoutDimensionOrThrow(ResourceArray resourceArray, int i) {
            Integer layoutDimension = resourceArray.getLayoutDimension(i);
            if (layoutDimension != null) {
                return layoutDimension.intValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static Integer getResourceId(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.RESOURCE_ID.INSTANCE, i);
            if (resource != null) {
                return (Integer) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static int getResourceIdOrThrow(ResourceArray resourceArray, int i) {
            Integer resourceId = resourceArray.getResourceId(i);
            if (resourceId != null) {
                return resourceId.intValue();
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static String getString(ResourceArray resourceArray, int i) {
            CharSequence charSequence;
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.STRING.INSTANCE, i);
            if (resource == null || (charSequence = (CharSequence) resource.get(resourceArray.getTheme())) == null) {
                return null;
            }
            return charSequence.toString();
        }

        public static String getStringOrThrow(ResourceArray resourceArray, int i) {
            String string2 = resourceArray.getString(i);
            if (string2 != null) {
                return string2;
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        public static CharSequence getText(ResourceArray resourceArray, int i) {
            ResourceReferences3 resource = resourceArray.getResource(ResourceType.STRING.INSTANCE, i);
            if (resource != null) {
                return (CharSequence) resource.get(resourceArray.getTheme());
            }
            return null;
        }

        public static CharSequence getTextOrThrow(ResourceArray resourceArray, int i) {
            CharSequence text = resourceArray.getText(i);
            if (text != null) {
                return text;
            }
            throw new NoSuchElementException("No value at index " + i);
        }

        private static <R> R getOrThrow(ResourceArray resourceArray, int i, Function1<? super Integer, ? extends R> function1) {
            R rInvoke = function1.invoke(Integer.valueOf(i));
            if (rInvoke != null) {
                return rInvoke;
            }
            throw new NoSuchElementException("No value at index " + i);
        }
    }

    /* compiled from: ResourceArray.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J(\u0010\u000e\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/scarlet/res/ResourceArray$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/res/ResourceArray;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "typedArray", "Landroid/content/res/TypedArray;", "blank", "length", "", "compose", "layers", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ResourceArray from(Resources.Theme theme, TypedArray typedArray) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(typedArray, "typedArray");
            return new NativeResourceArray(theme, typedArray);
        }

        public final ResourceArray blank(Resources.Theme theme, int length) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new BlankResourceArray(theme, length);
        }

        public final ResourceArray compose(List<? extends ResourceArray> layers) {
            Intrinsics.checkNotNullParameter(layers, "layers");
            return CompositeResourceArray.INSTANCE.of$lib_scarlet_externalRelease(layers);
        }

        public final ResourceArray compose(Resources.Theme theme, int length, List<? extends ResourceArray> layers) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(layers, "layers");
            List<? extends ResourceArray> list = layers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((ResourceArray) it.next()).getLength() != length) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            ResourceArray resourceArrayOf$lib_scarlet_externalRelease = CompositeResourceArray.INSTANCE.of$lib_scarlet_externalRelease(layers);
            return resourceArrayOf$lib_scarlet_externalRelease == null ? blank(theme, length) : resourceArrayOf$lib_scarlet_externalRelease;
        }
    }
}
