package com.robinhood.scarlet.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.TypedArrays2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.AnimatorSetBuilder;
import com.robinhood.utils.extensions.SparseArrays2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: ThemeTransitionSet.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 **\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001*B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001eJ2\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\"R\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0012\u0010&\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030'0\u0011H\u0016J%\u0010(\u001a\u00020 2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010)R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/ThemeTransitionSet;", "T", "", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "receiverType", "Ljava/lang/Class;", "transitions", "", "mixins", "", "<init>", "(Ljava/lang/Class;Ljava/lang/Iterable;[I)V", "getReceiverType", "()Ljava/lang/Class;", "getMixins", "()[I", "attributeTransitions", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "themeTransitions", "", "attributes", "createAnimator", "Landroid/animation/AnimatorSet;", "view", "properties", "Lcom/robinhood/scarlet/util/ElementProperties;", "previousThemeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "newThemeNode", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;Lcom/robinhood/scarlet/util/ThemeNode;)Landroid/animation/AnimatorSet;", "loadValues", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "applyTo", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;)V", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public class ThemeTransitionSet<T> implements ThemeTransition<T> {
    private final SparseArray<AttributeTransition<T, ?>> attributeTransitions;
    private final int[] attributes;
    private final int[] mixins;
    private final Class<? super T> receiverType;
    private final List<ThemeTransition<T>> themeTransitions;
    public static final int $stable = 8;
    private static final int[] EMPTY_INT_ARRAY = new int[0];

    public ThemeTransitionSet(Class<? super T> receiverType, Iterable<? extends ThemeTransition<? super T>> transitions, int[] mixins) {
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(mixins, "mixins");
        this.receiverType = receiverType;
        this.mixins = mixins;
        this.attributeTransitions = new SparseArray<>();
        ArrayList arrayList = new ArrayList();
        for (ThemeTransition<? super T> themeTransition : transitions) {
            if (themeTransition instanceof AttributeTransition) {
                this.attributeTransitions.put(((AttributeTransition) themeTransition).getStyleProperty().getAttributeId(), themeTransition);
            } else {
                arrayList.add(themeTransition);
            }
        }
        for (int i : this.mixins) {
            this.attributeTransitions.put(i, null);
        }
        this.themeTransitions = arrayList;
        this.attributes = SparseArrays2.keysToIntArray(this.attributeTransitions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public /* bridge */ /* synthetic */ Animator createAnimator(Object obj, ElementProperties elementProperties, ThemeNode themeNode, ThemeNode themeNode2) {
        return createAnimator((ThemeTransitionSet<T>) obj, elementProperties, themeNode, themeNode2);
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Class<? super T> getReceiverType() {
        return this.receiverType;
    }

    public /* synthetic */ ThemeTransitionSet(Class cls, Iterable iterable, int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, iterable, (i & 4) != 0 ? EMPTY_INT_ARRAY : iArr);
    }

    protected final int[] getMixins() {
        return this.mixins;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public AnimatorSet createAnimator(T view, ElementProperties properties, ThemeNode previousThemeNode, ThemeNode newThemeNode) throws Resources.NotFoundException {
        Animator animatorCreateAnimator;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(previousThemeNode, "previousThemeNode");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        ResourceArray resourceArrayObtainStyledResources = properties.obtainStyledResources(previousThemeNode, this.attributes, this.mixins);
        ResourceArray resourceArrayObtainStyledResources2 = properties.obtainStyledResources(newThemeNode, this.attributes, this.mixins);
        SparseArray<AttributeTransition<T, ?>> sparseArray = this.attributeTransitions;
        AnimatorSetBuilder animatorSetBuilder = new AnimatorSetBuilder();
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, sparseArray.size());
        int first = primitiveRanges2Until.getFirst();
        int last = primitiveRanges2Until.getLast();
        if (first <= last) {
            while (true) {
                AttributeTransition<T, ?> attributeTransitionValueAt = sparseArray.valueAt(first);
                if (attributeTransitionValueAt != null && (animatorCreateAnimator = attributeTransitionValueAt.createAnimator((AttributeTransition<T, ?>) view, resourceArrayObtainStyledResources, resourceArrayObtainStyledResources2, first)) != null) {
                    animatorSetBuilder.with(animatorCreateAnimator);
                }
                if (first == last) {
                    break;
                }
                first++;
            }
        }
        List<ThemeTransition<T>> list = this.themeTransitions;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animatorCreateAnimator2 = list.get(i).createAnimator(view, properties, previousThemeNode, newThemeNode);
            if (animatorCreateAnimator2 != null) {
                animatorSetBuilder.with(animatorCreateAnimator2);
            }
        }
        AnimatorSet animatorSet = animatorSetBuilder.getAnimatorSet();
        resourceArrayObtainStyledResources.recycle();
        resourceArrayObtainStyledResources2.recycle();
        return animatorSet;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues) {
        ResourceReferences4<?> reference;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
        SparseArray<AttributeTransition<T, ?>> sparseArray = this.attributeTransitions;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, this.attributes, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            Iterator<Integer> it = RangesKt.until(0, sparseArray.size()).iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                AttributeTransition<T, ?> attributeTransitionValueAt = sparseArray.valueAt(iNextInt);
                if (attributeTransitionValueAt != null && (reference = TypedArrays2.getReference(typedArrayObtainStyledAttributes, theme, iNextInt)) != null) {
                    outValues.put(attributeTransitionValueAt.getStyleProperty().getAttributeId(), reference);
                }
            }
            List<ThemeTransition<T>> list = this.themeTransitions;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).loadValues(theme, attributeSet, outValues);
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void applyTo(T view, ElementProperties properties, ThemeNode newThemeNode) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        ResourceArray resourceArrayObtainStyledResources = properties.obtainStyledResources(newThemeNode, this.attributes, this.mixins);
        try {
            SparseArray<AttributeTransition<T, ?>> sparseArray = this.attributeTransitions;
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, sparseArray.size());
            int first = primitiveRanges2Until.getFirst();
            int last = primitiveRanges2Until.getLast();
            if (first <= last) {
                while (true) {
                    AttributeTransition<T, ?> attributeTransitionValueAt = sparseArray.valueAt(first);
                    if (attributeTransitionValueAt != null) {
                        attributeTransitionValueAt.applyTo((AttributeTransition<T, ?>) view, resourceArrayObtainStyledResources, first);
                    }
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            List<ThemeTransition<T>> list = this.themeTransitions;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).applyTo(view, properties, newThemeNode);
            }
            Unit unit = Unit.INSTANCE;
            resourceArrayObtainStyledResources.recycle();
        } catch (Throwable th) {
            resourceArrayObtainStyledResources.recycle();
            throw th;
        }
    }
}
