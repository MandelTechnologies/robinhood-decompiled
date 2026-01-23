package com.robinhood.scarlet.transition.window;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Window;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceReferences3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.extensions.TypedValues2;
import com.robinhood.utils.p409ui.animation.AndroidProperties;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WindowBackgroundColorTransition.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010 J*\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J \u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J2\u0010&\u001a\u00020%2\n\u0010'\u001a\u00060(R\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0012\u0010,\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030.0-H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/window/WindowBackgroundColorTransition;", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "Landroid/app/Activity;", "<init>", "()V", "ATTRIBUTES", "", "typedValue", "Landroid/util/TypedValue;", "property", "Landroid/util/Property;", "Landroid/graphics/drawable/ColorDrawable;", "", "receiverType", "Ljava/lang/Class;", "getReceiverType", "()Ljava/lang/Class;", "windowBackgroundColor", "Lcom/robinhood/scarlet/util/ThemeNode;", "getWindowBackgroundColor", "(Lcom/robinhood/scarlet/util/ThemeNode;)Ljava/lang/Integer;", "backgroundColorDrawable", "Landroid/view/Window;", "getBackgroundColorDrawable", "(Landroid/view/Window;)Landroid/graphics/drawable/ColorDrawable;", "getDrawable", "window", "properties", "Lcom/robinhood/scarlet/util/ElementProperties;", "previousThemeNode", "getNewColor", "newThemeNode", "(Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;)Ljava/lang/Integer;", "createAnimator", "Landroid/animation/Animator;", "view", "applyTo", "", "loadValues", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class WindowBackgroundColorTransition implements ThemeTransition<Activity> {
    public static final int $stable;
    private static final Property<ColorDrawable, Integer> property;
    private static final Class<Activity> receiverType;
    public static final WindowBackgroundColorTransition INSTANCE = new WindowBackgroundColorTransition();
    private static final int[] ATTRIBUTES = {R.attr.windowBackground};
    private static final TypedValue typedValue = new TypedValue();

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
    }

    private WindowBackgroundColorTransition() {
    }

    static {
        AndroidProperties androidProperties = AndroidProperties.INSTANCE;
        final String str = "window_backgroundColor";
        final Class<Integer> cls = Integer.class;
        property = new Property<ColorDrawable, Integer>(str, cls) { // from class: com.robinhood.scarlet.transition.window.WindowBackgroundColorTransition$special$$inlined$create$1
            @Override // android.util.Property
            public boolean isReadOnly() {
                return false;
            }

            @Override // android.util.Property
            public Integer get(ColorDrawable view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return Integer.valueOf(view.getColor());
            }

            @Override // android.util.Property
            public void set(ColorDrawable view, Integer value) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.setColor(value.intValue());
            }
        };
        receiverType = Activity.class;
        $stable = 8;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Class<? super Activity> getReceiverType() {
        return receiverType;
    }

    private final Integer getWindowBackgroundColor(ThemeNode themeNode) {
        TypedValue typedValue2 = typedValue;
        if (themeNode.resolveAttribute(R.attr.windowBackground, typedValue2, true) && TypedValues2.isColorInt(typedValue2)) {
            return Integer.valueOf(typedValue2.data);
        }
        return null;
    }

    private final ColorDrawable getBackgroundColorDrawable(Window window) {
        Drawable background = window.getDecorView().getBackground();
        Drawable drawableMutate = background != null ? background.mutate() : null;
        if (drawableMutate instanceof ColorDrawable) {
            return (ColorDrawable) drawableMutate;
        }
        return null;
    }

    private final ColorDrawable getDrawable(Window window, ElementProperties properties, ThemeNode previousThemeNode) {
        ColorDrawable backgroundColorDrawable = getBackgroundColorDrawable(window);
        if (backgroundColorDrawable != null) {
            return backgroundColorDrawable;
        }
        ResourceArray resourceArrayObtainStyledResources$default = ElementProperties.obtainStyledResources$default(properties, previousThemeNode, ATTRIBUTES, null, 4, null);
        try {
            Drawable drawable = resourceArrayObtainStyledResources$default.getDrawable(0);
            ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
            if (colorDrawable != null) {
                return colorDrawable;
            }
            Integer windowBackgroundColor = getWindowBackgroundColor(previousThemeNode);
            if (windowBackgroundColor != null) {
                return new ColorDrawable(windowBackgroundColor.intValue());
            }
            return null;
        } finally {
            resourceArrayObtainStyledResources$default.recycle();
        }
    }

    private final Integer getNewColor(ElementProperties properties, ThemeNode newThemeNode) {
        ResourceArray resourceArrayObtainStyledResources$default = ElementProperties.obtainStyledResources$default(properties, newThemeNode, ATTRIBUTES, null, 4, null);
        try {
            ResourceReferences3<?> resource = resourceArrayObtainStyledResources$default.getResource(0);
            Integer numValueOf = null;
            ResourceType<? extends Object> type2 = resource != null ? resource.getType() : null;
            if (Intrinsics.areEqual(type2, ResourceType.COLOR.INSTANCE)) {
                Object obj = resource.get(newThemeNode.getTheme$lib_scarlet_externalRelease());
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                numValueOf = (Integer) obj;
            } else if (Intrinsics.areEqual(type2, ResourceType.COLOR_STATE_LIST.INSTANCE)) {
                Object obj2 = resource.get(newThemeNode.getTheme$lib_scarlet_externalRelease());
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.content.res.ColorStateList");
                numValueOf = Integer.valueOf(((ColorStateList) obj2).getDefaultColor());
            }
            resourceArrayObtainStyledResources$default.recycle();
            return numValueOf == null ? getWindowBackgroundColor(newThemeNode) : numValueOf;
        } catch (Throwable th) {
            resourceArrayObtainStyledResources$default.recycle();
            throw th;
        }
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Animator createAnimator(Activity view, ElementProperties properties, ThemeNode previousThemeNode, ThemeNode newThemeNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(previousThemeNode, "previousThemeNode");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        Window window = view.getWindow();
        Intrinsics.checkNotNull(window);
        ColorDrawable drawable = getDrawable(window, properties, previousThemeNode);
        if (drawable == null) {
            return null;
        }
        Integer newColor = getNewColor(properties, newThemeNode);
        window.setBackgroundDrawable(drawable);
        return ObjectAnimator.ofObject(drawable, (Property<ColorDrawable, V>) property, (TypeEvaluator) GammaEvaluator.INSTANCE, (Object[]) new Integer[]{Integer.valueOf(drawable.getColor()), newColor});
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void applyTo(Activity view, ElementProperties properties, ThemeNode newThemeNode) {
        Integer newColor;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        Window window = view.getWindow();
        Intrinsics.checkNotNull(window);
        ColorDrawable backgroundColorDrawable = getBackgroundColorDrawable(window);
        if (backgroundColorDrawable == null || (newColor = getNewColor(properties, newThemeNode)) == null) {
            return;
        }
        backgroundColorDrawable.setColor(newColor.intValue());
        window.setBackgroundDrawable(backgroundColorDrawable);
    }
}
