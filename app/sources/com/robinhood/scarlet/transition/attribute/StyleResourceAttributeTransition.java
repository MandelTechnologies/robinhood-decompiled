package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StyleResourceAttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/StyleResourceAttributeTransition;", "T", "", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;)V", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/resource/StyleResource;Lcom/robinhood/scarlet/util/resource/StyleResource;Lcom/robinhood/scarlet/util/resource/StyleResource;)Landroid/animation/Animator;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StyleResourceAttributeTransition<T> extends AttributeTransition<T, StyleResource> {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.scarlet.transition.AttributeTransition
    public /* bridge */ /* synthetic */ Animator createAnimator(Object obj, StyleResource styleResource, StyleResource styleResource2, StyleResource styleResource3) {
        return createAnimator2((StyleResourceAttributeTransition<T>) obj, styleResource, styleResource2, styleResource3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleResourceAttributeTransition(StyleableProperty<? super T, StyleResource> property) {
        super(property, false, false, 6, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }

    /* renamed from: createAnimator, reason: avoid collision after fix types in other method */
    protected Animator createAnimator2(T view, StyleResource currentValue, StyleResource previousValue, StyleResource newValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (newValue == null || Intrinsics.areEqual(currentValue, newValue)) {
            return null;
        }
        applyTo(view, newValue);
        return null;
    }
}
