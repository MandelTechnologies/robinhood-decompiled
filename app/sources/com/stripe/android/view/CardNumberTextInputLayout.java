package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroup2;
import com.google.android.material.R$attr;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$dimen;
import com.stripe.android.R$string;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* compiled from: CardNumberTextInputLayout.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "attachProgressView", "()V", "Lcom/stripe/android/view/CardWidgetProgressView;", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "", "<set-?>", "isLoading$delegate", "Lkotlin/properties/ReadWriteProperty;", "isLoading$payments_core_release", "()Z", "setLoading$payments_core_release", "(Z)V", "isLoading", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};
    public static final int $stable = 8;

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final Interfaces3 isLoading;
    private final CardWidgetProgressView progressView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.textInputStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressView = new CardWidgetProgressView(context, attributeSet, i);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.isLoading = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                if (oldValue.booleanValue() != zBooleanValue) {
                    if (zBooleanValue) {
                        this.progressView.show();
                    } else {
                        this.progressView.hide();
                    }
                }
            }
        };
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                this.this$0.attachProgressView();
            }
        });
        setPlaceholderText(getResources().getString(R$string.stripe_card_number_hint));
    }

    public final void setLoading$payments_core_release(boolean z) {
        this.isLoading.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachProgressView() {
        ViewParent parent = this.progressView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.progressView);
        }
        Object objFirst = SequencesKt.first(ViewGroup2.getChildren(this));
        Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) objFirst;
        frameLayout.addView(this.progressView);
        CardWidgetProgressView cardWidgetProgressView = this.progressView;
        ViewGroup.LayoutParams layoutParams = cardWidgetProgressView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(R$dimen.stripe_card_number_text_input_layout_progress_end_margin));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(R$dimen.stripe_card_number_text_input_layout_progress_top_margin);
            cardWidgetProgressView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
