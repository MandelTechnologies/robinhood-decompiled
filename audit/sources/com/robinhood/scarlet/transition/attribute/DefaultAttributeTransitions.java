package com.robinhood.scarlet.transition.attribute;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.MixinTransitionSet;
import com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\b&'()*+,-B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006."}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "view", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfView;", "getView", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfView;", "appCompatImageView", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfAppCompatImageView;", "getAppCompatImageView", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfAppCompatImageView;", "compoundButton", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfCompoundButton;", "getCompoundButton", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfCompoundButton;", "imageView", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfImageView;", "getImageView", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfImageView;", "progressBar", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfProgressBar;", "getProgressBar", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfProgressBar;", "spinner", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfSpinner;", "getSpinner", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfSpinner;", "textView", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfTextView;", "getTextView", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfTextView;", "toolbar", "Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfToolbar;", "getToolbar", "()Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfToolbar;", "OfView", "OfAppCompatImageView", "OfCompoundButton", "OfProgressBar", "OfImageView", "OfSpinner", "OfTextView", "OfToolbar", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DefaultAttributeTransitions {
    public static final int $stable = 8;
    private final OfAppCompatImageView appCompatImageView;
    private final OfCompoundButton compoundButton;
    private final OfImageView imageView;
    private final OfProgressBar progressBar;
    private final OfSpinner spinner;
    private final OfTextView textView;
    private final OfToolbar toolbar;
    private final OfView view;

    public DefaultAttributeTransitions(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.view = new OfView(resources);
        this.appCompatImageView = new OfAppCompatImageView(resources);
        this.compoundButton = new OfCompoundButton(resources);
        this.imageView = new OfImageView(resources);
        this.progressBar = new OfProgressBar(resources);
        this.spinner = new OfSpinner(resources);
        this.textView = new OfTextView(resources);
        this.toolbar = new OfToolbar(resources);
    }

    public final OfView getView() {
        return this.view;
    }

    public final OfAppCompatImageView getAppCompatImageView() {
        return this.appCompatImageView;
    }

    public final OfCompoundButton getCompoundButton() {
        return this.compoundButton;
    }

    public final OfImageView getImageView() {
        return this.imageView;
    }

    public final OfProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final OfSpinner getSpinner() {
        return this.spinner;
    }

    public final OfTextView getTextView() {
        return this.textView;
    }

    public final OfToolbar getToolbar() {
        return this.toolbar;
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\n¨\u0006#"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfView;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "alpha", "Lcom/robinhood/scarlet/transition/attribute/FloatAttributeTransition;", "Landroid/view/View;", "getAlpha", "()Lcom/robinhood/scarlet/transition/attribute/FloatAttributeTransition;", "backgroundTint", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "getBackgroundTint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "background", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "getBackground", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "foregroundTint", "getForegroundTint", "foreground", "getForeground", "paddingLeft", "getPaddingLeft", "paddingTop", "getPaddingTop", "paddingRight", "getPaddingRight", "paddingBottom", "getPaddingBottom", "paddingStart", "getPaddingStart", "paddingEnd", "getPaddingEnd", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfView {
        public static final int $stable = 8;
        private final FloatAttributeTransition<View> alpha;
        private final DrawableAttributeTransition<View> background;
        private final ColorStateListAttributeTransition<View> backgroundTint;
        private final DrawableAttributeTransition<View> foreground;
        private final ColorStateListAttributeTransition<View> foregroundTint;
        private final FloatAttributeTransition<View> paddingBottom;
        private final FloatAttributeTransition<View> paddingEnd;
        private final FloatAttributeTransition<View> paddingLeft;
        private final FloatAttributeTransition<View> paddingRight;
        private final FloatAttributeTransition<View> paddingStart;
        private final FloatAttributeTransition<View> paddingTop;

        public OfView(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
            DefaultAttributeTransitions$OfView$alpha$1 defaultAttributeTransitions$OfView$alpha$1 = DefaultAttributeTransitions$OfView$alpha$1.INSTANCE;
            Function2 function2 = new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.alpha$lambda$0((View) obj, (Float) obj2);
                }
            };
            StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
            StyleableProperty styleablePropertyFrom = companion.from(View.class, defaultAttributeTransitions$OfView$alpha$1, function2, companion2.from(resources, R.attr.alpha, ResourceType.FLOAT.INSTANCE));
            boolean z = false;
            int i = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.alpha = new FloatAttributeTransition<>(styleablePropertyFrom, false, 2, null);
            DefaultAttributeTransitions$OfView$backgroundTint$1 defaultAttributeTransitions$OfView$backgroundTint$1 = DefaultAttributeTransitions$OfView$backgroundTint$1.INSTANCE;
            Function2 function22 = new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.backgroundTint$lambda$1((View) obj, (ColorStateList) obj2);
                }
            };
            ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
            this.backgroundTint = new ColorStateListAttributeTransition<>(companion.from(View.class, defaultAttributeTransitions$OfView$backgroundTint$1, function22, companion2.from(resources, R.attr.backgroundTint, color_state_list)), false, 2, null);
            DefaultAttributeTransitions$OfView$background$1 defaultAttributeTransitions$OfView$background$1 = DefaultAttributeTransitions$OfView$background$1.INSTANCE;
            DefaultAttributeTransitions$OfView$background$2 defaultAttributeTransitions$OfView$background$2 = DefaultAttributeTransitions$OfView$background$2.INSTANCE;
            ResourceType.DRAWABLE drawable = ResourceType.DRAWABLE.INSTANCE;
            this.background = new DrawableAttributeTransition<>(companion.from(View.class, defaultAttributeTransitions$OfView$background$1, defaultAttributeTransitions$OfView$background$2, companion2.from(resources, R.attr.background, drawable)), z, i, defaultConstructorMarker);
            this.foregroundTint = new ColorStateListAttributeTransition<>(companion.from(View.class, DefaultAttributeTransitions$OfView$foregroundTint$1.INSTANCE, DefaultAttributeTransitions$OfView$foregroundTint$2.INSTANCE, companion2.from(resources, R.attr.foregroundTint, color_state_list)), false, 2, null);
            this.foreground = new DrawableAttributeTransition<>(companion.from(View.class, DefaultAttributeTransitions$OfView$foreground$1.INSTANCE, DefaultAttributeTransitions$OfView$foreground$2.INSTANCE, companion2.from(resources, R.attr.foreground, drawable)), z, i, defaultConstructorMarker);
            Function1 function1 = new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingLeft$lambda$2((View) obj);
                }
            };
            Function2 function23 = new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingLeft$lambda$3((View) obj, (Float) obj2);
                }
            };
            ResourceType.DIMENSION dimension = ResourceType.DIMENSION.INSTANCE;
            this.paddingLeft = new FloatAttributeTransition<>(companion.from(View.class, function1, function23, companion2.from(resources, R.attr.paddingLeft, dimension)), true);
            this.paddingTop = new FloatAttributeTransition<>(companion.from(View.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingTop$lambda$4((View) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingTop$lambda$5((View) obj, (Float) obj2);
                }
            }, companion2.from(resources, R.attr.paddingTop, dimension)), true);
            this.paddingRight = new FloatAttributeTransition<>(companion.from(View.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingRight$lambda$6((View) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingRight$lambda$7((View) obj, (Float) obj2);
                }
            }, companion2.from(resources, R.attr.paddingRight, dimension)), true);
            this.paddingBottom = new FloatAttributeTransition<>(companion.from(View.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingBottom$lambda$8((View) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingBottom$lambda$9((View) obj, (Float) obj2);
                }
            }, companion2.from(resources, R.attr.paddingBottom, dimension)), true);
            this.paddingStart = new FloatAttributeTransition<>(companion.from(View.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingStart$lambda$10((View) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingStart$lambda$11((View) obj, (Float) obj2);
                }
            }, companion2.from(resources, R.attr.paddingStart, dimension)), true);
            this.paddingEnd = new FloatAttributeTransition<>(companion.from(View.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfView.paddingEnd$lambda$12((View) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfView.paddingEnd$lambda$13((View) obj, (Float) obj2);
                }
            }, companion2.from(resources, R.attr.paddingEnd, dimension)), true);
        }

        public final FloatAttributeTransition<View> getAlpha() {
            return this.alpha;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit alpha$lambda$0(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            from.setAlpha(f != null ? f.floatValue() : 1.0f);
            return Unit.INSTANCE;
        }

        public final ColorStateListAttributeTransition<View> getBackgroundTint() {
            return this.backgroundTint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit backgroundTint$lambda$1(View from, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            from.setBackgroundTintList(colorStateList);
            return Unit.INSTANCE;
        }

        public final DrawableAttributeTransition<View> getBackground() {
            return this.background;
        }

        public final ColorStateListAttributeTransition<View> getForegroundTint() {
            return this.foregroundTint;
        }

        public final DrawableAttributeTransition<View> getForeground() {
            return this.foreground;
        }

        public final FloatAttributeTransition<View> getPaddingLeft() {
            return this.paddingLeft;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingLeft$lambda$2(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingLeft());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingLeft$lambda$3(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                from.setPadding((int) f.floatValue(), from.getPaddingTop(), from.getPaddingRight(), from.getPaddingBottom());
            }
            return Unit.INSTANCE;
        }

        public final FloatAttributeTransition<View> getPaddingTop() {
            return this.paddingTop;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingTop$lambda$4(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingTop());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingTop$lambda$5(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                from.setPadding(from.getPaddingLeft(), (int) f.floatValue(), from.getPaddingRight(), from.getPaddingBottom());
            }
            return Unit.INSTANCE;
        }

        public final FloatAttributeTransition<View> getPaddingRight() {
            return this.paddingRight;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingRight$lambda$6(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingRight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingRight$lambda$7(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                from.setPadding(from.getPaddingLeft(), from.getPaddingTop(), (int) f.floatValue(), from.getPaddingBottom());
            }
            return Unit.INSTANCE;
        }

        public final FloatAttributeTransition<View> getPaddingBottom() {
            return this.paddingBottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingBottom$lambda$8(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingBottom());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingBottom$lambda$9(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                from.setPadding(from.getPaddingLeft(), from.getPaddingTop(), from.getPaddingRight(), (int) f.floatValue());
            }
            return Unit.INSTANCE;
        }

        public final FloatAttributeTransition<View> getPaddingStart() {
            return this.paddingStart;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingStart$lambda$10(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingStart());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingStart$lambda$11(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                ViewsKt.setStartPadding(from, (int) f.floatValue());
            }
            return Unit.INSTANCE;
        }

        public final FloatAttributeTransition<View> getPaddingEnd() {
            return this.paddingEnd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float paddingEnd$lambda$12(View from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return Float.valueOf(from.getPaddingEnd());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit paddingEnd$lambda$13(View from, Float f) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (f != null) {
                ViewsKt.setEndPadding(from, (int) f.floatValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfAppCompatImageView;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "srcCompat", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "Landroidx/appcompat/widget/AppCompatImageView;", "getSrcCompat", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfAppCompatImageView {
        public static final int $stable = 8;
        private final DrawableAttributeTransition<AppCompatImageView> srcCompat;

        public OfAppCompatImageView(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.srcCompat = new DrawableAttributeTransition<>(StyleableProperty.INSTANCE.from(AppCompatImageView.class, DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$1.INSTANCE, DefaultAttributeTransitions$OfAppCompatImageView$srcCompat$2.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.srcCompat, ResourceType.DRAWABLE.INSTANCE)), false, 2, null);
        }

        public final DrawableAttributeTransition<AppCompatImageView> getSrcCompat() {
            return this.srcCompat;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfCompoundButton;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "buttonTint", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "Landroid/widget/CompoundButton;", "getButtonTint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfCompoundButton {
        public static final int $stable = 8;
        private final ColorStateListAttributeTransition<CompoundButton> buttonTint;

        public OfCompoundButton(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.buttonTint = new ColorStateListAttributeTransition<>(StyleableProperty.INSTANCE.from(CompoundButton.class, DefaultAttributeTransitions$OfCompoundButton$buttonTint$1.INSTANCE, DefaultAttributeTransitions$OfCompoundButton$buttonTint$2.INSTANCE, StyleProperty.INSTANCE.from(resources, R.attr.buttonTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
        }

        public final ColorStateListAttributeTransition<CompoundButton> getButtonTint() {
            return this.buttonTint;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfProgressBar;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "indeterminateTint", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "Landroid/widget/ProgressBar;", "getIndeterminateTint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "progressTint", "getProgressTint", "progressBackgroundTint", "getProgressBackgroundTint", "progressDrawable", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "getProgressDrawable", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfProgressBar {
        public static final int $stable = 8;
        private final ColorStateListAttributeTransition<ProgressBar> indeterminateTint;
        private final ColorStateListAttributeTransition<ProgressBar> progressBackgroundTint;
        private final DrawableAttributeTransition<ProgressBar> progressDrawable;
        private final ColorStateListAttributeTransition<ProgressBar> progressTint;

        public OfProgressBar(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
            DefaultAttributeTransitions$OfProgressBar$indeterminateTint$1 defaultAttributeTransitions$OfProgressBar$indeterminateTint$1 = DefaultAttributeTransitions$OfProgressBar$indeterminateTint$1.INSTANCE;
            DefaultAttributeTransitions$OfProgressBar$indeterminateTint$2 defaultAttributeTransitions$OfProgressBar$indeterminateTint$2 = DefaultAttributeTransitions$OfProgressBar$indeterminateTint$2.INSTANCE;
            StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
            ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
            this.indeterminateTint = new ColorStateListAttributeTransition<>(companion.from(ProgressBar.class, defaultAttributeTransitions$OfProgressBar$indeterminateTint$1, defaultAttributeTransitions$OfProgressBar$indeterminateTint$2, companion2.from(resources, R.attr.indeterminateTint, color_state_list)), false, 2, null);
            this.progressTint = new ColorStateListAttributeTransition<>(companion.from(ProgressBar.class, DefaultAttributeTransitions$OfProgressBar$progressTint$1.INSTANCE, DefaultAttributeTransitions$OfProgressBar$progressTint$2.INSTANCE, companion2.from(resources, R.attr.progressTint, color_state_list)), false, 2, null);
            this.progressBackgroundTint = new ColorStateListAttributeTransition<>(companion.from(ProgressBar.class, C37287xa755f139.INSTANCE, C37288xa755f13a.INSTANCE, companion2.from(resources, R.attr.progressBackgroundTint, color_state_list)), false, 2, null);
            this.progressDrawable = new DrawableAttributeTransition<>(companion.from(ProgressBar.class, DefaultAttributeTransitions$OfProgressBar$progressDrawable$1.INSTANCE, DefaultAttributeTransitions$OfProgressBar$progressDrawable$2.INSTANCE, companion2.from(resources, R.attr.progressDrawable, ResourceType.DRAWABLE.INSTANCE)), false, 2, null);
        }

        public final ColorStateListAttributeTransition<ProgressBar> getIndeterminateTint() {
            return this.indeterminateTint;
        }

        public final ColorStateListAttributeTransition<ProgressBar> getProgressTint() {
            return this.progressTint;
        }

        public final ColorStateListAttributeTransition<ProgressBar> getProgressBackgroundTint() {
            return this.progressBackgroundTint;
        }

        public final DrawableAttributeTransition<ProgressBar> getProgressDrawable() {
            return this.progressDrawable;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfImageView;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "tint", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "Landroid/widget/ImageView;", "getTint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "src", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "getSrc", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfImageView {
        public static final int $stable = 8;
        private final DrawableAttributeTransition<ImageView> src;
        private final ColorStateListAttributeTransition<ImageView> tint;

        public OfImageView(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
            DefaultAttributeTransitions$OfImageView$tint$1 defaultAttributeTransitions$OfImageView$tint$1 = DefaultAttributeTransitions$OfImageView$tint$1.INSTANCE;
            DefaultAttributeTransitions$OfImageView$tint$2 defaultAttributeTransitions$OfImageView$tint$2 = DefaultAttributeTransitions$OfImageView$tint$2.INSTANCE;
            StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
            this.tint = new ColorStateListAttributeTransition<>(companion.from(ImageView.class, defaultAttributeTransitions$OfImageView$tint$1, defaultAttributeTransitions$OfImageView$tint$2, companion2.from(resources, R.attr.tint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
            this.src = new DrawableAttributeTransition<>(companion.from(ImageView.class, DefaultAttributeTransitions$OfImageView$src$1.INSTANCE, DefaultAttributeTransitions$OfImageView$src$2.INSTANCE, companion2.from(resources, R.attr.src, ResourceType.DRAWABLE.INSTANCE)), false, 2, null);
        }

        public final ColorStateListAttributeTransition<ImageView> getTint() {
            return this.tint;
        }

        public final DrawableAttributeTransition<ImageView> getSrc() {
            return this.src;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfSpinner;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "popupBackground", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "Landroid/widget/Spinner;", "getPopupBackground", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfSpinner {
        public static final int $stable = 8;
        private final DrawableAttributeTransition<Spinner> popupBackground;

        public OfSpinner(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.popupBackground = new DrawableAttributeTransition<>(StyleableProperty.INSTANCE.from(Spinner.class, DefaultAttributeTransitions$OfSpinner$popupBackground$1.INSTANCE, DefaultAttributeTransitions$OfSpinner$popupBackground$2.INSTANCE, StyleProperty.INSTANCE.from(resources, R.attr.popupBackground, ResourceType.DRAWABLE.INSTANCE)), false);
        }

        public final DrawableAttributeTransition<Spinner> getPopupBackground() {
            return this.popupBackground;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfTextView;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "textColor", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "Landroid/widget/TextView;", "textAppearance", "Lcom/robinhood/scarlet/transition/MixinTransitionSet;", "getTextAppearance", "()Lcom/robinhood/scarlet/transition/MixinTransitionSet;", "textColorHint", "getTextColorHint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "textColorHighlight", "Lcom/robinhood/scarlet/transition/attribute/ColorAttributeTransition;", "getTextColorHighlight", "()Lcom/robinhood/scarlet/transition/attribute/ColorAttributeTransition;", "textColorLink", "getTextColorLink", "drawableTint", "getDrawableTint", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfTextView {
        public static final int $stable = 8;
        private final ColorStateListAttributeTransition<TextView> drawableTint;
        private final MixinTransitionSet<TextView> textAppearance;
        private final ColorStateListAttributeTransition<TextView> textColor;
        private final ColorAttributeTransition<TextView> textColorHighlight;
        private final ColorStateListAttributeTransition<TextView> textColorHint;
        private final ColorStateListAttributeTransition<TextView> textColorLink;

        public OfTextView(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
            DefaultAttributeTransitions$OfTextView$textColor$1 defaultAttributeTransitions$OfTextView$textColor$1 = DefaultAttributeTransitions$OfTextView$textColor$1.INSTANCE;
            DefaultAttributeTransitions$OfTextView$textColor$2 defaultAttributeTransitions$OfTextView$textColor$2 = DefaultAttributeTransitions$OfTextView$textColor$2.INSTANCE;
            StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
            ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
            ColorStateListAttributeTransition<TextView> colorStateListAttributeTransition = new ColorStateListAttributeTransition<>(companion.from(TextView.class, defaultAttributeTransitions$OfTextView$textColor$1, defaultAttributeTransitions$OfTextView$textColor$2, companion2.from(resources, R.attr.textColor, color_state_list)), false, 2, null);
            this.textColor = colorStateListAttributeTransition;
            MixinTransitionSet.Companion companion3 = MixinTransitionSet.INSTANCE;
            this.textAppearance = new MixinTransitionSet<>(TextView.class, false, companion2.from(resources, R.attr.textAppearance, ResourceType.STYLE.INSTANCE), CollectionsKt.listOf(colorStateListAttributeTransition));
            this.textColorHint = new ColorStateListAttributeTransition<>(companion.from(TextView.class, DefaultAttributeTransitions$OfTextView$textColorHint$1.INSTANCE, DefaultAttributeTransitions$OfTextView$textColorHint$2.INSTANCE, companion2.from(resources, R.attr.textColorHint, color_state_list)), false, 2, null);
            this.textColorHighlight = new ColorAttributeTransition<>(companion.from(TextView.class, DefaultAttributeTransitions$OfTextView$textColorHighlight$1.INSTANCE, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfTextView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfTextView.textColorHighlight$lambda$0((TextView) obj, (Integer) obj2);
                }
            }, companion2.from(resources, R.attr.textColorHighlight, ResourceType.COLOR.INSTANCE)));
            this.textColorLink = new ColorStateListAttributeTransition<>(companion.from(TextView.class, DefaultAttributeTransitions$OfTextView$textColorLink$1.INSTANCE, DefaultAttributeTransitions$OfTextView$textColorLink$2.INSTANCE, companion2.from(resources, R.attr.textColorLink, color_state_list)), false, 2, null);
            this.drawableTint = new ColorStateListAttributeTransition<>(companion.from(TextView.class, DefaultAttributeTransitions$OfTextView$drawableTint$1.INSTANCE, DefaultAttributeTransitions$OfTextView$drawableTint$2.INSTANCE, companion2.from(resources, R.attr.drawableTint, color_state_list)), false, 2, null);
        }

        public final MixinTransitionSet<TextView> getTextAppearance() {
            return this.textAppearance;
        }

        public final ColorStateListAttributeTransition<TextView> getTextColorHint() {
            return this.textColorHint;
        }

        public final ColorAttributeTransition<TextView> getTextColorHighlight() {
            return this.textColorHighlight;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit textColorHighlight$lambda$0(TextView from, Integer num) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            if (num != null) {
                from.setHighlightColor(num.intValue());
            }
            return Unit.INSTANCE;
        }

        public final ColorStateListAttributeTransition<TextView> getTextColorLink() {
            return this.textColorLink;
        }

        public final ColorStateListAttributeTransition<TextView> getDrawableTint() {
            return this.drawableTint;
        }
    }

    /* compiled from: DefaultAttributeTransitions.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/attribute/DefaultAttributeTransitions$OfToolbar;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "popupTheme", "Lcom/robinhood/scarlet/transition/attribute/StyleResourceAttributeTransition;", "Landroidx/appcompat/widget/Toolbar;", "getPopupTheme", "()Lcom/robinhood/scarlet/transition/attribute/StyleResourceAttributeTransition;", "titleTextAppearance", "getTitleTextAppearance", "subtitleTextAppearance", "getSubtitleTextAppearance", "colorControlNormal", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "getColorControlNormal", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OfToolbar {
        public static final int $stable = 8;
        private final ColorStateListAttributeTransition<Toolbar> colorControlNormal;
        private final StyleResourceAttributeTransition<Toolbar> popupTheme;
        private final StyleResourceAttributeTransition<Toolbar> subtitleTextAppearance;
        private final StyleResourceAttributeTransition<Toolbar> titleTextAppearance;

        /* JADX INFO: Access modifiers changed from: private */
        public static final ColorStateList colorControlNormal$lambda$6(Toolbar from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StyleResource subtitleTextAppearance$lambda$4(Toolbar from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StyleResource titleTextAppearance$lambda$2(Toolbar from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return null;
        }

        public OfToolbar(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
            Function1 function1 = new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfToolbar.popupTheme$lambda$0((Toolbar) obj);
                }
            };
            Function2 function2 = new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfToolbar.popupTheme$lambda$1((Toolbar) obj, (StyleResource) obj2);
                }
            };
            StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
            int i = R$attr.popupTheme;
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            this.popupTheme = new StyleResourceAttributeTransition<>(companion.from(Toolbar.class, function1, function2, companion2.from(resources, i, style)));
            this.titleTextAppearance = new StyleResourceAttributeTransition<>(companion.from(Toolbar.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfToolbar.titleTextAppearance$lambda$2((Toolbar) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfToolbar.titleTextAppearance$lambda$3((Toolbar) obj, (StyleResource) obj2);
                }
            }, companion2.from(resources, R$attr.titleTextAppearance, style)));
            this.subtitleTextAppearance = new StyleResourceAttributeTransition<>(companion.from(Toolbar.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfToolbar.subtitleTextAppearance$lambda$4((Toolbar) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfToolbar.subtitleTextAppearance$lambda$5((Toolbar) obj, (StyleResource) obj2);
                }
            }, companion2.from(resources, R$attr.subtitleTextAppearance, style)));
            this.colorControlNormal = new ColorStateListAttributeTransition<>(companion.from(Toolbar.class, new Function1() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAttributeTransitions.OfToolbar.colorControlNormal$lambda$6((Toolbar) obj);
                }
            }, new Function2() { // from class: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfToolbar$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultAttributeTransitions.OfToolbar.colorControlNormal$lambda$13((Toolbar) obj, (ColorStateList) obj2);
                }
            }, companion2.from(resources, R$attr.colorControlNormal, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
        }

        public final StyleResourceAttributeTransition<Toolbar> getPopupTheme() {
            return this.popupTheme;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StyleResource popupTheme$lambda$0(Toolbar from) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            return new StyleResource(from.getPopupTheme());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit popupTheme$lambda$1(Toolbar from, StyleResource styleResource) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            from.setPopupTheme(styleResource != null ? styleResource.getResId() : 0);
            return Unit.INSTANCE;
        }

        public final StyleResourceAttributeTransition<Toolbar> getTitleTextAppearance() {
            return this.titleTextAppearance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit titleTextAppearance$lambda$3(Toolbar from, StyleResource styleResource) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            from.setTitleTextAppearance(from.getContext(), styleResource != null ? styleResource.getResId() : 0);
            return Unit.INSTANCE;
        }

        public final StyleResourceAttributeTransition<Toolbar> getSubtitleTextAppearance() {
            return this.subtitleTextAppearance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit subtitleTextAppearance$lambda$5(Toolbar from, StyleResource styleResource) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            from.setSubtitleTextAppearance(from.getContext(), styleResource != null ? styleResource.getResId() : 0);
            return Unit.INSTANCE;
        }

        public final ColorStateListAttributeTransition<Toolbar> getColorControlNormal() {
            return this.colorControlNormal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit colorControlNormal$lambda$13(Toolbar from, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(from, "$this$from");
            Drawable navigationIcon = from.getNavigationIcon();
            if (navigationIcon != null) {
                Drawable drawableMutate = navigationIcon.mutate();
                drawableMutate.setTintList(colorStateList);
                from.setNavigationIcon(drawableMutate);
            }
            Drawable overflowIcon = from.getOverflowIcon();
            if (overflowIcon != null) {
                Drawable drawableMutate2 = overflowIcon.mutate();
                drawableMutate2.setTintList(colorStateList);
                from.setOverflowIcon(drawableMutate2);
            }
            Drawable collapseIcon = from.getCollapseIcon();
            if (collapseIcon != null) {
                Drawable drawableMutate3 = collapseIcon.mutate();
                drawableMutate3.setTintList(colorStateList);
                from.setCollapseIcon(drawableMutate3);
            }
            return Unit.INSTANCE;
        }
    }
}
