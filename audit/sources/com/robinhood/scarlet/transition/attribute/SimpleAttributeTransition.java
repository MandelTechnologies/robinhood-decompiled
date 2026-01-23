package com.robinhood.scarlet.transition.attribute;

import android.animation.Animator;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.AttributeTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleAttributeTransition.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/SimpleAttributeTransition;", "T", "", "V", "Lcom/robinhood/scarlet/transition/AttributeTransition;", "property", "Lcom/robinhood/scarlet/property/StyleableProperty;", "applyNullValue", "", "<init>", "(Lcom/robinhood/scarlet/property/StyleableProperty;Z)V", "createAnimator", "Landroid/animation/Animator;", "view", "currentValue", "previousValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/Animator;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SimpleAttributeTransition<T, V> extends AttributeTransition<T, V> {
    public static final int $stable = 8;

    public /* synthetic */ SimpleAttributeTransition(StyleableProperty styleableProperty, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styleableProperty, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleAttributeTransition(StyleableProperty<? super T, V> property, boolean z) {
        super(property, false, z, 2, null);
        Intrinsics.checkNotNullParameter(property, "property");
    }

    @Override // com.robinhood.scarlet.transition.AttributeTransition
    protected Animator createAnimator(T view, V currentValue, V previousValue, V newValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (getApplyNullValue()) {
            applyTo(view, newValue);
            return null;
        }
        if (newValue == null) {
            return null;
        }
        if (currentValue == null) {
            if (previousValue == null) {
                return null;
            }
            currentValue = previousValue;
        }
        if (Intrinsics.areEqual(currentValue, newValue)) {
            return null;
        }
        applyTo(view, newValue);
        return null;
    }
}
