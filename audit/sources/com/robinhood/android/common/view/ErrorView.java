package com.robinhood.android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.databinding.MergeErrorViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: ErrorView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020!J\u0016\u0010$\u001a\u00020\n2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\tJ\u0010\u0010'\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010(\u001a\u00020\n2\u0006\u0010 \u001a\u00020!J\u0016\u0010)\u001a\u00020\n2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\tJ\u000e\u0010*\u001a\u00020\n2\u0006\u0010 \u001a\u00020!R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/view/ErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onPrimaryButtonClick", "Lkotlin/Function0;", "", "getOnPrimaryButtonClick", "()Lkotlin/jvm/functions/Function0;", "setOnPrimaryButtonClick", "(Lkotlin/jvm/functions/Function0;)V", "onSecondaryButtonClick", "getOnSecondaryButtonClick", "setOnSecondaryButtonClick", "binding", "Lcom/robinhood/android/common/databinding/MergeErrorViewBinding;", "getBinding", "()Lcom/robinhood/android/common/databinding/MergeErrorViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "setTitle", "title", "", "setDescription", "description", "setPrimaryButtonText", AccountOverviewOptionsSettingCard4.CTA, "showPrimaryButton", "show", "", "setPrimaryButtonLoading", "isLoading", "setPrimaryButtonEventData", "accessor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "setSecondaryButtonText", "showSecondaryButton", "setSecondaryButtonEventData", "showImage", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ErrorView extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ErrorView.class, "binding", "getBinding()Lcom/robinhood/android/common/databinding/MergeErrorViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Function0<Unit> onPrimaryButtonClick;
    private Function0<Unit> onSecondaryButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = true;
        ViewGroups.inflate(this, C11048R.layout.merge_error_view, true);
        this.binding = ViewBinding5.viewBinding(this, ErrorView2.INSTANCE);
        int[] ErrorView = C11048R.styleable.ErrorView;
        Intrinsics.checkNotNullExpressionValue(ErrorView, "ErrorView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ErrorView, 0, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.ErrorView_useCondensedStyle, false)) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(context, C11048R.layout.error_view_condensed_constraint_set);
            constraintSet.applyTo(this);
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C11048R.styleable.ErrorView_errorIconImage);
        if (drawable != null) {
            getBinding().errorIconImg.setImageDrawable(drawable);
        }
        CharSequence text = typedArrayObtainStyledAttributes.getText(C11048R.styleable.ErrorView_errorTitleText);
        if (text != null) {
            getBinding().errorTitleTxt.setText(text);
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(C11048R.styleable.ErrorView_errorDescriptionText);
        if (text2 != null) {
            getBinding().errorDescriptionTxt.setText(text2);
        }
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(C11048R.styleable.ErrorView_primaryButtonText);
        if (text3 != null) {
            getBinding().errorPrimaryBtn.setText(text3);
        }
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(C11048R.styleable.ErrorView_secondaryButtonText);
        RdsButton errorSecondaryBtn = getBinding().errorSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorSecondaryBtn, "errorSecondaryBtn");
        if (text4 != null && !StringsKt.isBlank(text4)) {
            z = false;
        }
        errorSecondaryBtn.setVisibility(z ? 8 : 0);
        getBinding().errorSecondaryBtn.setText(text4);
        typedArrayObtainStyledAttributes.recycle();
        RdsButton errorPrimaryBtn = getBinding().errorPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorPrimaryBtn, "errorPrimaryBtn");
        OnClickListeners.onClick(errorPrimaryBtn, new Function0() { // from class: com.robinhood.android.common.view.ErrorView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorView._init_$lambda$2(this.f$0);
            }
        });
        RdsButton errorSecondaryBtn2 = getBinding().errorSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorSecondaryBtn2, "errorSecondaryBtn");
        OnClickListeners.onClick(errorSecondaryBtn2, new Function0() { // from class: com.robinhood.android.common.view.ErrorView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorView._init_$lambda$3(this.f$0);
            }
        });
    }

    public final Function0<Unit> getOnPrimaryButtonClick() {
        return this.onPrimaryButtonClick;
    }

    public final void setOnPrimaryButtonClick(Function0<Unit> function0) {
        this.onPrimaryButtonClick = function0;
    }

    public final Function0<Unit> getOnSecondaryButtonClick() {
        return this.onSecondaryButtonClick;
    }

    public final void setOnSecondaryButtonClick(Function0<Unit> function0) {
        this.onSecondaryButtonClick = function0;
    }

    private final MergeErrorViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeErrorViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(ErrorView errorView) {
        Function0<Unit> function0 = errorView.onPrimaryButtonClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(ErrorView errorView) {
        Function0<Unit> function0 = errorView.onSecondaryButtonClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(CharSequence title) {
        getBinding().errorTitleTxt.setText(title);
    }

    public final void setDescription(CharSequence description) {
        getBinding().errorDescriptionTxt.setText(description);
    }

    public final void setPrimaryButtonText(CharSequence cta) {
        getBinding().errorPrimaryBtn.setText(cta);
    }

    public final void showPrimaryButton(boolean show) {
        RdsButton errorPrimaryBtn = getBinding().errorPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorPrimaryBtn, "errorPrimaryBtn");
        errorPrimaryBtn.setVisibility(show ? 0 : 8);
    }

    public final void setPrimaryButtonLoading(boolean isLoading) {
        getBinding().errorPrimaryBtn.setLoading(isLoading);
    }

    public final void setPrimaryButtonEventData(Function0<UserInteractionEventDescriptor> accessor) {
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        RdsButton errorPrimaryBtn = getBinding().errorPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorPrimaryBtn, "errorPrimaryBtn");
        ViewsKt.eventData(errorPrimaryBtn, false, accessor);
    }

    public final void setSecondaryButtonText(CharSequence cta) {
        getBinding().errorSecondaryBtn.setText(cta);
    }

    public final void showSecondaryButton(boolean show) {
        RdsButton errorSecondaryBtn = getBinding().errorSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorSecondaryBtn, "errorSecondaryBtn");
        errorSecondaryBtn.setVisibility(show ? 0 : 8);
    }

    public final void setSecondaryButtonEventData(Function0<UserInteractionEventDescriptor> accessor) {
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        RdsButton errorSecondaryBtn = getBinding().errorSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(errorSecondaryBtn, "errorSecondaryBtn");
        ViewsKt.eventData(errorSecondaryBtn, false, accessor);
    }

    public final void showImage(boolean show) {
        ImageView errorIconImg = getBinding().errorIconImg;
        Intrinsics.checkNotNullExpressionValue(errorIconImg, "errorIconImg");
        errorIconImg.setVisibility(show ? 0 : 8);
    }
}
