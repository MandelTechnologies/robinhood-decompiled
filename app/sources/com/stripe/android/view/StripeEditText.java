package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.R$attr;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.extensions.ResourceTypes;
import com.stripe.android.R$color;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeEditText.kt */
@Metadata(m3635d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\n\n\u0002\b\u0015*\u0001l\b\u0017\u0018\u00002\u00020\u0001:\u0005{|}~\u007fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\n 8*\u0004\u0018\u00010202H\u0007¢\u0006\u0004\b9\u00107J\u0019\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b>\u0010=J\u0019\u0010C\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020\fH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010EJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ\u0017\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LR(\u0010M\u001a\u00020J8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010E\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010TR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010UR*\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u000eR\u0018\u0010\\\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010XR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR*\u0010d\u001a\u00020J2\u0006\u0010d\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010%R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR \u0010o\u001a\b\u0012\u0004\u0012\u0002020a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010c\u001a\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010t\u001a\u0004\u0018\u00010\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bt\u0010g\u001a\u0004\bu\u0010iR\u0014\u0010w\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010iR\u0011\u0010z\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/ColorStateList;", "colors", "", "setTextColor", "(Landroid/content/res/ColorStateList;)V", ResourceTypes.COLOR, "(I)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "afterTextChangedListener", "setAfterTextChangedListener", "(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "deleteEmptyListener", "setDeleteEmptyListener", "(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "errorMessageListener", "setErrorMessageListener", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "", "errorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorColor", "setErrorColor", "Landroid/view/accessibility/AccessibilityNodeInfo;", SduiFeatureDiscovery3.INFO_TAG, "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/view/View$OnFocusChangeListener;", "listener", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "kotlin.jvm.PlatformType", "getParentOnFocusChangeListener", "Landroid/text/TextWatcher;", "watcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "", "text", "setTextSilent$payments_core_release", "(Ljava/lang/CharSequence;)V", "setTextSilent", "setNumberOnlyInputType", "()V", "determineDefaultErrorColor", "listenForTextChanges", "listenForDeleteEmpty", "keyCode", "", "isDeleteKey", "(I)Z", "isLastKeyDelete", "Z", "isLastKeyDelete$payments_core_release", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "isLastKeyDelete$payments_core_release$annotations", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "<set-?>", "defaultColorStateList", "Landroid/content/res/ColorStateList;", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "externalColorStateList", "defaultErrorColor", "I", "externalErrorColor", "Ljava/lang/Integer;", "", "textWatchers", "Ljava/util/List;", "shouldShowError", "getShouldShowError", "setShouldShowError", "Ljava/lang/String;", "getErrorMessage$payments_core_release", "()Ljava/lang/String;", "setErrorMessage$payments_core_release", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "com/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1", "isLastKeyDeleteTextWatcher", "Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;", "internalFocusChangeListeners", "getInternalFocusChangeListeners", "()Ljava/util/List;", "externalFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "accessibilityText", "getAccessibilityText", "getFieldText$payments_core_release", "fieldText", "getDefaultErrorColorInt", "()I", "defaultErrorColorInt", "AfterTextChangedListener", "DeleteEmptyListener", "ErrorMessageListener", "SoftDeleteInputConnection", "StripeEditTextState", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public class StripeEditText extends TextInputEditText {
    private final String accessibilityText;
    private AfterTextChangedListener afterTextChangedListener;
    private ColorStateList defaultColorStateList;
    private int defaultErrorColor;
    private DeleteEmptyListener deleteEmptyListener;
    private String errorMessage;
    private ErrorMessageListener errorMessageListener;
    private ColorStateList externalColorStateList;
    private Integer externalErrorColor;
    private View.OnFocusChangeListener externalFocusChangeListener;
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;
    private boolean isLastKeyDelete;
    private final StripeEditText2 isLastKeyDeleteTextWatcher;
    private boolean shouldShowError;
    private List<TextWatcher> textWatchers;

    /* compiled from: StripeEditText.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "", "onTextChanged", "", "text", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface AfterTextChangedListener {
        void onTextChanged(String text);
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "", "onDeleteEmpty", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface DeleteEmptyListener {
        void onDeleteEmpty();
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "displayErrorMessage", "", "message", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ErrorMessageListener {
        void displayErrorMessage(String message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean isDeleteKey(int keyCode) {
        return keyCode == 67;
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1] */
    @JvmOverloads
    public StripeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isLastKeyDeleteTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                this.this$0.setLastKeyDelete$payments_core_release(count == 0);
            }
        };
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        listenForTextChanges();
        listenForDeleteEmpty();
        ColorStateList textColors = getTextColors();
        Intrinsics.checkNotNullExpressionValue(textColors, "getTextColors(...)");
        this.defaultColorStateList = textColors;
        determineDefaultErrorColor();
        setOnFocusChangeListener(null);
        this.internalFocusChangeListeners = new ArrayList();
    }

    /* renamed from: isLastKeyDelete$payments_core_release, reason: from getter */
    public final boolean getIsLastKeyDelete() {
        return this.isLastKeyDelete;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z) {
        this.isLastKeyDelete = z;
    }

    /* renamed from: getDefaultColorStateList$payments_core_release, reason: from getter */
    public final ColorStateList getDefaultColorStateList() {
        return this.defaultColorStateList;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    public final void setShouldShowError(boolean z) {
        ErrorMessageListener errorMessageListener;
        String str = this.errorMessage;
        if (str != null && (errorMessageListener = this.errorMessageListener) != null) {
            if (!z) {
                str = null;
            }
            errorMessageListener.displayErrorMessage(str);
        }
        if (this.shouldShowError != z) {
            if (z) {
                Integer num = this.externalErrorColor;
                super.setTextColor(num != null ? num.intValue() : this.defaultErrorColor);
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z;
    }

    /* renamed from: getErrorMessage$payments_core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String string2 = text != null ? text.toString() : null;
        return string2 == null ? "" : string2;
    }

    public final int getDefaultErrorColorInt() {
        determineDefaultErrorColor();
        return this.defaultErrorColor;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.internalFocusChangeListeners;
    }

    protected String getAccessibilityText() {
        return this.accessibilityText;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        this.externalColorStateList = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColor(ColorStateList.valueOf(color));
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null) {
            return new SoftDeleteInputConnection(inputConnectionOnCreateInputConnection, true, this.deleteEmptyListener);
        }
        return null;
    }

    public final void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public final void setDeleteEmptyListener(DeleteEmptyListener deleteEmptyListener) {
        this.deleteEmptyListener = deleteEmptyListener;
    }

    public final void setErrorMessageListener(ErrorMessageListener errorMessageListener) {
        this.errorMessageListener = errorMessageListener;
    }

    public final void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final void setErrorColor(int errorColor) {
        this.externalErrorColor = Integer.valueOf(errorColor);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        info.setError(str);
    }

    private final void determineDefaultErrorColor() {
        int i;
        Context context = getContext();
        if (StripeColorUtils.INSTANCE.isColorDark(this.defaultColorStateList.getDefaultColor())) {
            i = R$color.stripe_error_text_light_theme;
        } else {
            i = R$color.stripe_error_text_dark_theme;
        }
        this.defaultErrorColor = ContextCompat.getColor(context, i);
    }

    private final void listenForDeleteEmpty() {
        List<TextWatcher> listEmptyList = this.textWatchers;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.contains(this.isLastKeyDeleteTextWatcher)) {
            addTextChangedListener(this.isLastKeyDeleteTextWatcher);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.StripeEditText$$ExternalSyntheticLambda0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return StripeEditText.listenForDeleteEmpty$lambda$6(this.f$0, view, i, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listenForDeleteEmpty$lambda$6(StripeEditText this$0, View view, int i, KeyEvent keyEvent) {
        DeleteEmptyListener deleteEmptyListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        boolean zIsDeleteKey = this$0.isDeleteKey(i);
        this$0.isLastKeyDelete = zIsDeleteKey;
        if (!zIsDeleteKey || this$0.length() != 0 || (deleteEmptyListener = this$0.deleteEmptyListener) == null) {
            return false;
        }
        deleteEmptyListener.onDeleteEmpty();
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        StripeEditTextState stripeEditTextState = (StripeEditTextState) state;
        super.onRestoreInstanceState(stripeEditTextState.getSuperState());
        this.errorMessage = stripeEditTextState.getErrorMessage();
        setShouldShowError(stripeEditTextState.getShouldShowError());
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class SoftDeleteInputConnection extends InputConnectionWrapper {
        private final DeleteEmptyListener deleteEmptyListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoftDeleteInputConnection(InputConnection target, boolean z, DeleteEmptyListener deleteEmptyListener) {
            super(target, z);
            Intrinsics.checkNotNullParameter(target, "target");
            this.deleteEmptyListener = deleteEmptyListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            DeleteEmptyListener deleteEmptyListener;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (deleteEmptyListener = this.deleteEmptyListener) != null) {
                deleteEmptyListener.onDeleteEmpty();
            }
            return super.deleteSurroundingText(beforeLength, afterLength);
        }
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.StripeEditText$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StripeEditText.setOnFocusChangeListener$lambda$9(this.f$0, view, z);
            }
        });
        this.externalFocusChangeListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusChangeListener$lambda$9(StripeEditText this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.internalFocusChangeListeners.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z);
        }
        View.OnFocusChangeListener onFocusChangeListener = this$0.externalFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.add(watcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.remove(watcher);
    }

    public final void setTextSilent$payments_core_release(CharSequence text) {
        List<TextWatcher> list = this.textWatchers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(text);
        List<TextWatcher> list2 = this.textWatchers;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    public final void setNumberOnlyInputType() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "Landroid/os/Parcelable;", "superState", "", "errorMessage", "", "shouldShowError", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Parcelable;", "getSuperState", "()Landroid/os/Parcelable;", "Ljava/lang/String;", "getErrorMessage", "Z", "getShouldShowError", "()Z", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class StripeEditTextState implements Parcelable {
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean shouldShowError;
        private final Parcelable superState;

        /* compiled from: StripeEditText.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StripeEditTextState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState[] newArray(int i) {
                return new StripeEditTextState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StripeEditTextState)) {
                return false;
            }
            StripeEditTextState stripeEditTextState = (StripeEditTextState) other;
            return Intrinsics.areEqual(this.superState, stripeEditTextState.superState) && Intrinsics.areEqual(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.errorMessage;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowError);
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.superState + ", errorMessage=" + this.errorMessage + ", shouldShowError=" + this.shouldShowError + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.superState, flags);
            parcel.writeString(this.errorMessage);
            parcel.writeInt(this.shouldShowError ? 1 : 0);
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                StripeEditText.AfterTextChangedListener afterTextChangedListener = this.this$0.afterTextChangedListener;
                if (afterTextChangedListener != null) {
                    String string2 = s != null ? s.toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    afterTextChangedListener.onTextChanged(string2);
                }
            }
        });
    }
}
