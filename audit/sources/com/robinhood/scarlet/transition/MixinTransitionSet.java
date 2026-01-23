package com.robinhood.scarlet.transition;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.util.Themes3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MixinTransitionSet.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u001eBA\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017R\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001cH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/MixinTransitionSet;", "T", "Landroid/view/View;", "Lcom/robinhood/scarlet/transition/ThemeTransitionSet;", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "receiverType", "Ljava/lang/Class;", "isOptIn", "", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "transitions", "", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "<init>", "(Ljava/lang/Class;ZLcom/robinhood/scarlet/property/StyleProperty;Ljava/lang/Iterable;)V", "()Z", "getStyleProperty", "()Lcom/robinhood/scarlet/property/StyleProperty;", "loadValues", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MixinTransitionSet<T extends View> extends ThemeTransitionSet<T> implements StylePropertyTransition<T, StyleResource> {
    private final boolean isOptIn;
    private final StyleProperty<StyleResource> styleProperty;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.scarlet.transition.StylePropertyTransition
    /* renamed from: isOptIn, reason: from getter */
    public boolean getIsOptIn() {
        return this.isOptIn;
    }

    @Override // com.robinhood.scarlet.transition.StylePropertyTransition
    public StyleProperty<StyleResource> getStyleProperty() {
        return this.styleProperty;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixinTransitionSet(Class<? super T> receiverType, boolean z, StyleProperty<StyleResource> styleProperty, Iterable<? extends ThemeTransition<? super T>> transitions) {
        super(receiverType, transitions, new int[]{styleProperty.getAttributeId()});
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        this.isOptIn = z;
        this.styleProperty = styleProperty;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransitionSet, com.robinhood.scarlet.transition.ThemeTransition
    public void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
        Themes3.collectStyledAttributes(theme, attributeSet, getMixins(), outValues);
        super.loadValues(theme, attributeSet, outValues);
    }

    /* compiled from: MixinTransitionSet.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\n\b\u0001\u0010\u0006\u0018\u0001*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/MixinTransitionSet$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/transition/MixinTransitionSet;", "T", "Landroid/view/View;", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "transitions", "", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "isOptIn", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ MixinTransitionSet from$default(Companion companion, StyleProperty styleProperty, Iterable transitions, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            Intrinsics.reifiedOperationMarker(4, "T");
            return new MixinTransitionSet(View.class, z, styleProperty, transitions);
        }

        public final /* synthetic */ <T extends View> MixinTransitionSet<T> from(StyleProperty<StyleResource> styleProperty, Iterable<? extends ThemeTransition<? super T>> transitions, boolean isOptIn) {
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            Intrinsics.reifiedOperationMarker(4, "T");
            return new MixinTransitionSet<>(View.class, isOptIn, styleProperty, transitions);
        }
    }
}
