package com.robinhood.scarlet.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.Themes3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.KProperties2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty6;

/* compiled from: AttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 ?*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001?B1\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0002\u0010%J%\u0010&\u001a\u00020'2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0002\u0010(J-\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-¢\u0006\u0002\u0010.J#\u0010&\u001a\u00020'2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-¢\u0006\u0002\u0010/J\u001d\u0010&\u001a\u00020'2\u0006\u0010\u001f\u001a\u00028\u00002\b\u00100\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u00101J2\u00102\u001a\u00020'2\n\u00103\u001a\u000604R\u0002052\b\u00106\u001a\u0004\u0018\u0001072\u0012\u00108\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030:09H\u0016J5\u0010;\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010<\u001a\u0004\u0018\u00018\u00012\b\u0010=\u001a\u0004\u0018\u00018\u00012\b\u00100\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010>J5\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010<\u001a\u0004\u0018\u00018\u00012\b\u0010=\u001a\u0004\u0018\u00018\u00012\b\u00100\u001a\u0004\u0018\u00018\u0001H$¢\u0006\u0002\u0010>R\"\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0014\u0010\t\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR#\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/AttributeTransition;", "T", "", "V", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "isOptIn", "", "applyNullValue", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;ZZ)V", "getProperty", "()Lcom/robinhood/scarlet/property/StyleableProperty;", "()Z", "getApplyNullValue", "receiverType", "Ljava/lang/Class;", "getReceiverType", "()Ljava/lang/Class;", "receiverType$delegate", "Lkotlin/reflect/KProperty0;", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "getStyleProperty", "()Lcom/robinhood/scarlet/property/StyleProperty;", "styleProperty$delegate", "attributes", "", "createAnimator", "Landroid/animation/Animator;", "view", "properties", "Lcom/robinhood/scarlet/util/ElementProperties;", "previousThemeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "newThemeNode", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;Lcom/robinhood/scarlet/util/ThemeNode;)Landroid/animation/Animator;", "applyTo", "", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;)V", "previousValues", "Lcom/robinhood/scarlet/res/ResourceArray;", "newValues", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "(Ljava/lang/Object;Lcom/robinhood/scarlet/res/ResourceArray;Lcom/robinhood/scarlet/res/ResourceArray;I)Landroid/animation/Animator;", "(Ljava/lang/Object;Lcom/robinhood/scarlet/res/ResourceArray;I)V", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "loadValues", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "createAnimatorOrApplyTo", "currentValue", "previousValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/Animator;", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class AttributeTransition<T, V> implements StylePropertyTransition<T, V> {
    private final boolean applyNullValue;
    private final int[] attributes;
    private final boolean isOptIn;
    private final StyleableProperty<? super T, V> property;

    /* renamed from: receiverType$delegate, reason: from kotlin metadata */
    private final KProperty6 receiverType;

    /* renamed from: styleProperty$delegate, reason: from kotlin metadata */
    private final KProperty6 styleProperty;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AttributeTransition.class, "receiverType", "getReceiverType()Ljava/lang/Class;", 0)), Reflection.property1(new PropertyReference1Impl(AttributeTransition.class, "styleProperty", "getStyleProperty()Lcom/robinhood/scarlet/property/StyleProperty;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Rect visibleRect = new Rect();

    protected abstract Animator createAnimator(T view, V currentValue, V previousValue, V newValue);

    public AttributeTransition(final StyleableProperty<? super T, V> property, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.property = property;
        this.isOptIn = z;
        this.applyNullValue = z2;
        this.receiverType = new PropertyReference0Impl(property) { // from class: com.robinhood.scarlet.transition.AttributeTransition$receiverType$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((StyleableProperty) this.receiver).getReceiverType();
            }
        };
        this.styleProperty = new PropertyReference0Impl(property) { // from class: com.robinhood.scarlet.transition.AttributeTransition$styleProperty$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((StyleableProperty) this.receiver).getStyleProperty();
            }
        };
        this.attributes = new int[]{getStyleProperty().getAttributeId()};
    }

    public /* synthetic */ AttributeTransition(StyleableProperty styleableProperty, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styleableProperty, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    protected final StyleableProperty<? super T, V> getProperty() {
        return this.property;
    }

    @Override // com.robinhood.scarlet.transition.StylePropertyTransition
    /* renamed from: isOptIn, reason: from getter */
    public final boolean getIsOptIn() {
        return this.isOptIn;
    }

    protected final boolean getApplyNullValue() {
        return this.applyNullValue;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Class<? super T> getReceiverType() {
        return (Class) KProperties2.getValue(this.receiverType, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // com.robinhood.scarlet.transition.StylePropertyTransition
    public final StyleProperty<V> getStyleProperty() {
        return (StyleProperty) KProperties2.getValue(this.styleProperty, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    @SuppressLint({"ResourceType"})
    public final Animator createAnimator(T view, ElementProperties properties, ThemeNode previousThemeNode, ThemeNode newThemeNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(previousThemeNode, "previousThemeNode");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        ResourceArray resourceArrayObtainStyledResources$default = ElementProperties.obtainStyledResources$default(properties, previousThemeNode, this.attributes, null, 4, null);
        ResourceArray resourceArrayObtainStyledResources$default2 = ElementProperties.obtainStyledResources$default(properties, newThemeNode, this.attributes, null, 4, null);
        Animator animatorCreateAnimator = createAnimator((AttributeTransition<T, V>) view, resourceArrayObtainStyledResources$default, resourceArrayObtainStyledResources$default2, 0);
        resourceArrayObtainStyledResources$default.recycle();
        resourceArrayObtainStyledResources$default2.recycle();
        return animatorCreateAnimator;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    @SuppressLint({"ResourceType"})
    public void applyTo(T view, ElementProperties properties, ThemeNode newThemeNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        ResourceArray resourceArrayObtainStyledResources$default = ElementProperties.obtainStyledResources$default(properties, newThemeNode, this.attributes, null, 4, null);
        try {
            applyTo((AttributeTransition<T, V>) view, resourceArrayObtainStyledResources$default, 0);
            Unit unit = Unit.INSTANCE;
        } finally {
            resourceArrayObtainStyledResources$default.recycle();
        }
    }

    public final Animator createAnimator(final T view, ResourceArray previousValues, ResourceArray newValues, int index) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(previousValues, "previousValues");
        Intrinsics.checkNotNullParameter(newValues, "newValues");
        final StyleableProperty<? super T, V> styleableProperty = this.property;
        StyleProperty<V> styleProperty = getStyleProperty();
        V v = styleableProperty.get(view);
        V from = styleProperty.readFrom(previousValues, index);
        final V from2 = styleProperty.readFrom(newValues, index);
        Animator animatorCreateAnimatorOrApplyTo = createAnimatorOrApplyTo(view, v, from, from2);
        if (animatorCreateAnimatorOrApplyTo == null) {
            return null;
        }
        animatorCreateAnimatorOrApplyTo.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.scarlet.transition.AttributeTransition$createAnimator$lambda$3$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Object obj = from2;
                if (obj != null) {
                    styleableProperty.set(view, obj);
                }
            }
        });
        return animatorCreateAnimatorOrApplyTo;
    }

    public final void applyTo(T view, ResourceArray newValues, int index) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(newValues, "newValues");
        applyTo(view, getStyleProperty().readFrom(newValues, index));
    }

    public final void applyTo(T view, V newValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.applyNullValue || newValue != null) {
            this.property.set(view, newValue);
        }
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
        Themes3.collectStyledAttributes(theme, attributeSet, this.attributes, outValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Animator createAnimatorOrApplyTo(T view, V currentValue, V previousValue, V newValue) {
        if ((view instanceof View) && !INSTANCE.isVisibleInWindow((View) view)) {
            applyTo(view, newValue);
            return null;
        }
        return createAnimator((AttributeTransition<T, V>) view, currentValue, previousValue, newValue);
    }

    /* compiled from: AttributeTransition.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/AttributeTransition$Companion;", "", "<init>", "()V", "visibleRect", "Landroid/graphics/Rect;", "isVisibleInWindow", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isVisibleInWindow(View view) {
            return view.getVisibility() == 0 && view.getGlobalVisibleRect(AttributeTransition.visibleRect);
        }
    }
}
