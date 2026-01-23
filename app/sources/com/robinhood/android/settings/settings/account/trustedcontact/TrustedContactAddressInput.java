package com.robinhood.android.settings.settings.account.trustedcontact;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.android.settings.settings.databinding.MergeTrustedContactAddressInputBinding;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TrustedContactAddressInput.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!J\u0014\u0010\"\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactAddressInput;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactAddressInputBinding;", "getBinding", "()Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactAddressInputBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "hint", "getHint", "()Ljava/lang/CharSequence;", "setHint", "(Ljava/lang/CharSequence;)V", "text", "getText", "setText", "", "showButton", "getShowButton", "()Z", "setShowButton", "(Z)V", "setTextOnClick", "", "onClick", "Lkotlin/Function0;", "setButtonOnClick", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TrustedContactAddressInput extends RdsRippleContainerView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TrustedContactAddressInput.class, "binding", "getBinding()Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactAddressInputBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public /* synthetic */ TrustedContactAddressInput(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactAddressInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28321R.layout.merge_trusted_contact_address_input, true);
        this.binding = ViewBinding5.viewBinding(this, TrustedContactAddressInput2.INSTANCE);
        int[] TrustedContactAddressInput = C28321R.styleable.TrustedContactAddressInput;
        Intrinsics.checkNotNullExpressionValue(TrustedContactAddressInput, "TrustedContactAddressInput");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TrustedContactAddressInput, 0, 0);
        setHint(typedArrayObtainStyledAttributes.getString(C28321R.styleable.TrustedContactAddressInput_hint));
        setText(typedArrayObtainStyledAttributes.getString(C28321R.styleable.TrustedContactAddressInput_text));
        typedArrayObtainStyledAttributes.recycle();
        setClipToPadding(false);
        setClipChildren(false);
    }

    private final MergeTrustedContactAddressInputBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTrustedContactAddressInputBinding) value;
    }

    public final CharSequence getHint() {
        return getBinding().textView.getHint();
    }

    public final void setHint(CharSequence charSequence) {
        getBinding().textView.setHint(charSequence);
    }

    public final CharSequence getText() {
        return getBinding().textView.getText();
    }

    public final void setText(CharSequence charSequence) {
        getBinding().textView.setText(charSequence);
    }

    public final boolean getShowButton() {
        ImageView imageView = getBinding().imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        return imageView.getVisibility() == 0;
    }

    public final void setShowButton(boolean z) {
        ImageView imageView = getBinding().imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void setTextOnClick(Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        RhTextView textView = getBinding().textView;
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        OnClickListeners.onClick(textView, onClick);
    }

    public final void setButtonOnClick(Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        ImageView imageView = getBinding().imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        OnClickListeners.onClick(imageView, onClick);
    }
}
