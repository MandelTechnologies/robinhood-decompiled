package com.robinhood.android.designsystem.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.Themes4;
import com.robinhood.utils.extensions.ViewsKt;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsTextInputContainerView.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001dB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010M\u001a\u00020\u00142\b\u0010N\u001a\u0004\u0018\u00010OJ\u0010\u0010P\u001a\u00020\u00142\b\u0010N\u001a\u0004\u0018\u00010OJ\u001a\u0010Q\u001a\u00020\u00142\u0006\u0010R\u001a\u00020S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010&J\u0010\u0010U\u001a\u00020\u00142\b\b\u0001\u0010V\u001a\u00020!J \u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020!2\u0006\u0010[\u001a\u00020\\H\u0016J\u000e\u0010]\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\tH\u0002J\u0010\u0010`\u001a\u00020\u00142\u0006\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\n\u001a\u0004\u0018\u00010&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b\u0019\u0010*R\u001a\u0010+\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\n\u001a\u0004\u0018\u00010-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00103\u001a\u0004\u0018\u00010-2\b\u0010\n\u001a\u0004\u0018\u00010-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R(\u00107\u001a\u0004\u0018\u0001062\b\u0010\n\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010<\u001a\u0004\u0018\u00010-2\b\u0010\n\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00100\"\u0004\b>\u00102R(\u0010?\u001a\u0004\u0018\u00010-2\b\u0010\n\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00100\"\u0004\bA\u00102R\u0016\u0010B\u001a\n D*\u0004\u0018\u00010C0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\n D*\u0004\u0018\u00010C0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010F\u001a\n D*\u0004\u0018\u00010G0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010H\u001a\n D*\u0004\u0018\u00010I0IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010J\u001a\n D*\u0004\u0018\u00010G0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "passwordVisibilityToggleEnabled", "", "value", "Landroid/widget/EditText;", "editText", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "focusChangesDisposable", "Lio/reactivex/disposables/Disposable;", "setOnFocusChangeListener", "", "onEditTextFocusChanged", "hasFocus", "updateErrorTextState", "updateCounterTextColor", "setCounterText", "setAfterTextChanged", "alwaysShowErrorText", "getAlwaysShowErrorText", "()Z", "setAlwaysShowErrorText", "(Z)V", "counterMaxLength", "", "getCounterMaxLength", "()I", "setCounterMaxLength", "(I)V", "", "counterText", "getCounterText", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "isCounterEnabled", "setCounterEnabled", "Landroid/content/res/ColorStateList;", "counterValidColor", "getCounterValidColor", "()Landroid/content/res/ColorStateList;", "setCounterValidColor", "(Landroid/content/res/ColorStateList;)V", "counterInvalidColor", "getCounterInvalidColor", "setCounterInvalidColor", "", "errorText", "getErrorText", "()Ljava/lang/CharSequence;", "setErrorText", "(Ljava/lang/CharSequence;)V", "drawableStartTint", "getDrawableStartTint", "setDrawableStartTint", "drawableEndTint", "getDrawableEndTint", "setDrawableEndTint", "startIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "endIcon", "errorTextView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "inputContainer", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputBackgroundContainer;", "counterTextView", "drawableEyeClosed", "drawableEyeOpened", "setStartDrawableOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setEndDrawableOnClickListener", "setStartIcon", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "contentDescription", "setEndDrawable", "resId", "addView", "child", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "params", "Landroid/view/ViewGroup$LayoutParams;", "setupEditTextForPasswordVisibility", "togglePasswordEndIcon", "visible", "updateAccessoryVisibility", "accessoryState", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView$AccessoryState;", "isOverCounterMaxLength", "AccessoryState", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RdsTextInputContainerView extends ConstraintLayout {
    private boolean alwaysShowErrorText;
    private ColorStateList counterInvalidColor;
    private int counterMaxLength;
    private String counterText;
    private final RhTextView counterTextView;
    private ColorStateList counterValidColor;
    private final int drawableEyeClosed;
    private final int drawableEyeOpened;
    private EditText editText;
    private final ImageView endIcon;
    private final RhTextView errorTextView;
    private Disposable focusChangesDisposable;
    private final RdsTextInputBackgroundContainer inputContainer;
    private boolean isCounterEnabled;
    private boolean passwordVisibilityToggleEnabled;
    private final ImageView startIcon;

    /* compiled from: RdsTextInputContainerView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessoryState.values().length];
            try {
                iArr[AccessoryState.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessoryState.ERROR_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessoryState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ RdsTextInputContainerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTextInputContainerView(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, null, 6, null), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.counterMaxLength = Integer.MAX_VALUE;
        View.inflate(getContext(), C13997R.layout.merge_text_input, this);
        ImageView imageView = (ImageView) findViewById(C13997R.id.text_input_start_icon_view);
        this.startIcon = imageView;
        ImageView imageView2 = (ImageView) findViewById(C13997R.id.text_input_end_icon_view);
        this.endIcon = imageView2;
        this.errorTextView = (RhTextView) findViewById(C13997R.id.text_input_error_text_view);
        RdsTextInputBackgroundContainer rdsTextInputBackgroundContainer = (RdsTextInputBackgroundContainer) findViewById(C13997R.id.text_input_input_container);
        this.inputContainer = rdsTextInputBackgroundContainer;
        this.counterTextView = (RhTextView) findViewById(C13997R.id.text_input_counter_text_view);
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        this.drawableEyeClosed = Themes4.resolveAttribute$default(theme, C20690R.attr.iconEyeClosed24dp, false, 2, null).resourceId;
        Resources.Theme theme2 = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme2, "getTheme(...)");
        this.drawableEyeOpened = Themes4.resolveAttribute$default(theme2, C20690R.attr.iconEyeOpen24dp, false, 2, null).resourceId;
        int[] RdsTextInputContainerView = C13997R.styleable.RdsTextInputContainerView;
        Intrinsics.checkNotNullExpressionValue(RdsTextInputContainerView, "RdsTextInputContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsTextInputContainerView, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsTextInputContainerView_drawableStart);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsTextInputContainerView_drawableEnd);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsTextInputContainerView_drawableStartTint);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsTextInputContainerView_drawableEndTint);
        this.passwordVisibilityToggleEnabled = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputContainerView_passwordToggleEnabled, this.passwordVisibilityToggleEnabled);
        this.alwaysShowErrorText = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputContainerView_alwaysShowErrorText, false);
        setErrorText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsTextInputContainerView_errorText));
        this.isCounterEnabled = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputContainerView_counterEnabled, false);
        this.counterMaxLength = typedArrayObtainStyledAttributes.getInteger(C13997R.styleable.RdsTextInputContainerView_counterMaxLength, Integer.MAX_VALUE);
        if (this.isCounterEnabled) {
            this.alwaysShowErrorText = true;
        }
        imageView.setImageTintList(colorStateList);
        if (drawable != null) {
            setStartIcon(drawable, typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTextInputContainerView_drawableStartContentDescription));
        }
        if (this.passwordVisibilityToggleEnabled) {
            CharSequence errorText = getErrorText();
            if (errorText == null || errorText.length() == 0) {
                this.alwaysShowErrorText = true;
            }
            imageView2.setImageTintList(colorStateList2);
            imageView2.setVisibility(0);
            imageView2.setContentDescription(typedArrayObtainStyledAttributes.getResources().getString(C13997R.string.input_text_password_toggle_content_description));
            Resources.Theme theme3 = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme3, "getTheme(...)");
            imageView2.setBackgroundResource(Themes4.resolveAttribute$default(theme3, R$attr.selectableItemBackgroundBorderless, false, 2, null).resourceId);
            togglePasswordEndIcon(false);
        } else if (drawable2 != null) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setImageTintList(colorStateList2);
            imageView2.setVisibility(0);
            imageView2.setContentDescription(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTextInputContainerView_drawableEndContentDescription));
            rdsTextInputBackgroundContainer.setPaddingRelative(rdsTextInputBackgroundContainer.getPaddingStart(), rdsTextInputBackgroundContainer.getPaddingTop(), 0, rdsTextInputBackgroundContainer.getPaddingBottom());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    protected final EditText getEditText() {
        return this.editText;
    }

    protected final void setEditText(EditText editText) {
        this.editText = editText;
        setOnFocusChangeListener(editText);
        setAfterTextChanged(this.editText);
    }

    private final void setOnFocusChangeListener(EditText editText) {
        InitialValueObservable<Boolean> initialValueObservableFocusChanges;
        Disposable disposable = this.focusChangesDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.focusChangesDisposable = (editText == null || (initialValueObservableFocusChanges = RxView.focusChanges(editText)) == null) ? null : initialValueObservableFocusChanges.subscribe(new Consumer() { // from class: com.robinhood.android.designsystem.textinput.RdsTextInputContainerView.setOnFocusChangeListener.1
            @Override // io.reactivex.functions.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept(((Boolean) obj).booleanValue());
            }

            public final void accept(boolean z) {
                RdsTextInputContainerView.this.onEditTextFocusChanged(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEditTextFocusChanged(boolean hasFocus) {
        updateErrorTextState(hasFocus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r0.length() > r4.counterMaxLength) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateErrorTextState(boolean hasFocus) {
        AccessoryState accessoryState;
        EditText editText;
        CharSequence errorText;
        if (getErrorText() != null || this.isCounterEnabled) {
            KeyEvent.Callback callback = this.editText;
            ValidatingTextInput validatingTextInput = callback instanceof ValidatingTextInput ? (ValidatingTextInput) callback : null;
            boolean z = true;
            boolean zIsValid = validatingTextInput != null ? validatingTextInput.isValid() : true;
            if ((this.alwaysShowErrorText && (errorText = getErrorText()) != null && errorText.length() != 0) || (!hasFocus && !zIsValid)) {
                z = false;
            }
            if (this.isCounterEnabled) {
                if (!hasFocus) {
                    if (!hasFocus && z && (editText = this.editText) != null) {
                        Intrinsics.checkNotNull(editText);
                    }
                }
                updateAccessoryVisibility(AccessoryState.COUNTER);
                CharSequence text = this.counterTextView.getText();
                if (text == null || text.length() == 0) {
                    setCounterText();
                    return;
                }
                return;
            }
            if (!hasFocus && this.isCounterEnabled) {
                this.counterTextView.setText((CharSequence) null);
            }
            if (!z) {
                accessoryState = AccessoryState.ERROR_TEXT;
            } else {
                accessoryState = AccessoryState.NONE;
            }
            updateAccessoryVisibility(accessoryState);
        }
    }

    private final void setAfterTextChanged(EditText editText) {
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.designsystem.textinput.RdsTextInputContainerView$setAfterTextChanged$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    this.this$0.setCounterText();
                }
            });
        }
    }

    private final void updateCounterTextColor() {
        ColorStateList colorStateList;
        EditText editText = this.editText;
        if (editText != null) {
            int length = editText.length();
            ColorStateList colorStateList2 = this.counterInvalidColor;
            if (colorStateList2 == null || (colorStateList = this.counterValidColor) == null) {
                return;
            }
            RhTextView rhTextView = this.counterTextView;
            if (length <= this.counterMaxLength) {
                colorStateList2 = colorStateList;
            }
            rhTextView.setTextColor(colorStateList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCounterText() {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        String string2 = this.counterText;
        if (string2 == null) {
            string2 = ViewsKt.getString(this, C13997R.string.input_text_counter_format, Integer.valueOf(editText.length()), Integer.valueOf(this.counterMaxLength));
        }
        this.counterTextView.setText(string2);
        if (editText.length() == this.counterMaxLength) {
            this.counterTextView.announceForAccessibility(ViewsKt.getString(this, C13997R.string.input_text_maximum_length_reached));
        } else if (editText.length() > this.counterMaxLength) {
            this.counterTextView.announceForAccessibility(ViewsKt.getString(this, C13997R.string.input_text_character_limit_exceeded, Integer.valueOf(editText.length()), Integer.valueOf(this.counterMaxLength)));
        }
        updateCounterTextColor();
    }

    public final boolean getAlwaysShowErrorText() {
        return this.alwaysShowErrorText;
    }

    public final void setAlwaysShowErrorText(boolean z) {
        this.alwaysShowErrorText = z;
    }

    public final int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public final void setCounterMaxLength(int i) {
        this.counterMaxLength = i;
    }

    public final String getCounterText() {
        return this.counterText;
    }

    public final void setCounterText(String str) {
        this.counterText = str;
        setCounterText();
    }

    /* renamed from: isCounterEnabled, reason: from getter */
    public final boolean getIsCounterEnabled() {
        return this.isCounterEnabled;
    }

    public final void setCounterEnabled(boolean z) {
        this.isCounterEnabled = z;
    }

    public final ColorStateList getCounterValidColor() {
        return this.counterValidColor;
    }

    public final void setCounterValidColor(ColorStateList colorStateList) {
        this.counterValidColor = colorStateList;
        updateCounterTextColor();
    }

    public final ColorStateList getCounterInvalidColor() {
        return this.counterInvalidColor;
    }

    public final void setCounterInvalidColor(ColorStateList colorStateList) {
        this.counterInvalidColor = colorStateList;
        updateCounterTextColor();
    }

    public final CharSequence getErrorText() {
        return this.errorTextView.getText().toString();
    }

    public final void setErrorText(CharSequence charSequence) {
        AccessoryState accessoryState;
        CharSequence errorText;
        this.errorTextView.setText(charSequence);
        if (charSequence != null) {
            this.errorTextView.announceForAccessibility(charSequence);
        }
        if (!this.alwaysShowErrorText || (errorText = getErrorText()) == null || errorText.length() == 0) {
            accessoryState = this.isCounterEnabled ? AccessoryState.COUNTER : AccessoryState.NONE;
        } else {
            accessoryState = AccessoryState.ERROR_TEXT;
        }
        updateAccessoryVisibility(accessoryState);
        setOnFocusChangeListener(this.editText);
    }

    public final ColorStateList getDrawableStartTint() {
        return this.startIcon.getImageTintList();
    }

    public final void setDrawableStartTint(ColorStateList colorStateList) {
        this.startIcon.setImageTintList(colorStateList);
    }

    public final ColorStateList getDrawableEndTint() {
        return this.endIcon.getImageTintList();
    }

    public final void setDrawableEndTint(ColorStateList colorStateList) {
        this.endIcon.setImageTintList(colorStateList);
    }

    public final void setStartDrawableOnClickListener(View.OnClickListener onClickListener) {
        this.startIcon.setOnClickListener(onClickListener);
    }

    public final void setEndDrawableOnClickListener(View.OnClickListener onClickListener) {
        this.endIcon.setOnClickListener(onClickListener);
    }

    public static /* synthetic */ void setStartIcon$default(RdsTextInputContainerView rdsTextInputContainerView, Drawable drawable, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStartIcon");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        rdsTextInputContainerView.setStartIcon(drawable, str);
    }

    public final void setStartIcon(Drawable drawable, String contentDescription) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.startIcon.setImageDrawable(drawable);
        this.startIcon.setVisibility(0);
        this.startIcon.setContentDescription(contentDescription);
        RdsTextInputBackgroundContainer rdsTextInputBackgroundContainer = this.inputContainer;
        rdsTextInputBackgroundContainer.setPaddingRelative(0, rdsTextInputBackgroundContainer.getPaddingTop(), this.inputContainer.getPaddingEnd(), this.inputContainer.getPaddingBottom());
    }

    public final void setEndDrawable(int resId) {
        this.endIcon.setImageResource(resId);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (child instanceof EditText) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 17;
            this.inputContainer.addView(child, 1, layoutParams);
            EditText editText = (EditText) child;
            setEditText(editText);
            if (this.passwordVisibilityToggleEnabled) {
                setupEditTextForPasswordVisibility(editText);
                return;
            }
            return;
        }
        super.addView(child, index, params);
    }

    public final void setupEditTextForPasswordVisibility(final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.endIcon.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.designsystem.textinput.RdsTextInputContainerView.setupEditTextForPasswordVisibility.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int selectionEnd = editText.getSelectionEnd();
                if (editText.getTransformationMethod() instanceof PasswordTransformationMethod) {
                    this.togglePasswordEndIcon(true);
                    editText.setTransformationMethod(null);
                } else {
                    this.togglePasswordEndIcon(false);
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                editText.setSelection(selectionEnd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void togglePasswordEndIcon(boolean visible) {
        if (visible) {
            this.endIcon.setImageResource(this.drawableEyeOpened);
        } else {
            this.endIcon.setImageResource(this.drawableEyeClosed);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsTextInputContainerView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView$AccessoryState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "COUNTER", "ERROR_TEXT", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    private static final class AccessoryState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccessoryState[] $VALUES;
        public static final AccessoryState NONE = new AccessoryState("NONE", 0);
        public static final AccessoryState COUNTER = new AccessoryState("COUNTER", 1);
        public static final AccessoryState ERROR_TEXT = new AccessoryState("ERROR_TEXT", 2);

        private static final /* synthetic */ AccessoryState[] $values() {
            return new AccessoryState[]{NONE, COUNTER, ERROR_TEXT};
        }

        public static EnumEntries<AccessoryState> getEntries() {
            return $ENTRIES;
        }

        private AccessoryState(String str, int i) {
        }

        static {
            AccessoryState[] accessoryStateArr$values = $values();
            $VALUES = accessoryStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accessoryStateArr$values);
        }

        public static AccessoryState valueOf(String str) {
            return (AccessoryState) Enum.valueOf(AccessoryState.class, str);
        }

        public static AccessoryState[] values() {
            return (AccessoryState[]) $VALUES.clone();
        }
    }

    private final void updateAccessoryVisibility(AccessoryState accessoryState) {
        int i = WhenMappings.$EnumSwitchMapping$0[accessoryState.ordinal()];
        if (i == 1) {
            RhTextView counterTextView = this.counterTextView;
            Intrinsics.checkNotNullExpressionValue(counterTextView, "counterTextView");
            counterTextView.setVisibility(0);
            RhTextView errorTextView = this.errorTextView;
            Intrinsics.checkNotNullExpressionValue(errorTextView, "errorTextView");
            errorTextView.setVisibility(8);
            this.inputContainer.setError$lib_design_system_externalDebug(isOverCounterMaxLength());
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            RhTextView counterTextView2 = this.counterTextView;
            Intrinsics.checkNotNullExpressionValue(counterTextView2, "counterTextView");
            counterTextView2.setVisibility(8);
            RhTextView errorTextView2 = this.errorTextView;
            Intrinsics.checkNotNullExpressionValue(errorTextView2, "errorTextView");
            errorTextView2.setVisibility(8);
            this.inputContainer.setError$lib_design_system_externalDebug(false);
            return;
        }
        RhTextView counterTextView3 = this.counterTextView;
        Intrinsics.checkNotNullExpressionValue(counterTextView3, "counterTextView");
        counterTextView3.setVisibility(8);
        RhTextView errorTextView3 = this.errorTextView;
        Intrinsics.checkNotNullExpressionValue(errorTextView3, "errorTextView");
        errorTextView3.setVisibility(0);
        RdsTextInputBackgroundContainer rdsTextInputBackgroundContainer = this.inputContainer;
        CharSequence errorText = getErrorText();
        rdsTextInputBackgroundContainer.setError$lib_design_system_externalDebug(!(errorText == null || errorText.length() == 0));
    }

    private final boolean isOverCounterMaxLength() {
        EditText editText = this.editText;
        return editText != null && editText.length() > this.counterMaxLength;
    }
}
