package com.robinhood.android.designsystem.textinput;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsTextInputEditText.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 A2\u00020\u0001:\u0001AB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020$H\u0014J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0+H\u0016J\u0006\u0010,\u001a\u00020$J\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010+H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u000203H\u0016J\u0010\u00106\u001a\u00020\n2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\u0010H\u0016J\u0018\u00109\u001a\u00020$2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0016J\u0018\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u0010H\u0014J\b\u0010@\u001a\u00020$H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u001f¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "Lcom/robinhood/android/designsystem/textinput/RdsGenericTextInput;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "focusChangesRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "templatedRhEditTextHelper", "Lcom/robinhood/android/designsystem/textinput/TemplatedEditTextHelper;", "isValid", "()Z", "value", "", "secondaryHintColor", "getSecondaryHintColor", "()Ljava/lang/Integer;", "setSecondaryHintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "", "typedText", "getTypedText", "()Ljava/lang/String;", "setTypedText", "(Ljava/lang/String;)V", "isInputMasked", "setInputMasked", "(Z)V", "useCustomNumpad", "getUseCustomNumpad", "setUseCustomNumpad", "onFocusChanged", "", "focused", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onFinishInflate", "focusChanges", "Lio/reactivex/Observable;", "initTemplatedRhEditTextHelper", "setTemplate", "templateString", "placeholderString", "onEnterOrDonePressed", "Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "setSelection", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "start", "stop", "onSelectionChanged", "selStart", "selEnd", "refreshText", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsTextInputEditText extends RdsGenericTextInput {
    private static final String SAVE_SUPER_STATE = "rh-superState";
    private final PublishRelay<Boolean> focusChangesRelay;
    private Integer secondaryHintColor;
    private TemplatedEditTextHelper templatedRhEditTextHelper;
    private boolean useCustomNumpad;

    public /* synthetic */ RdsTextInputEditText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        PublishRelay<Boolean> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.focusChangesRelay = publishRelayCreate;
        setSecondaryHintColor(Integer.valueOf(getCurrentHintTextColor()));
        int[] RdsTextInputEditText = C13997R.styleable.RdsTextInputEditText;
        Intrinsics.checkNotNullExpressionValue(RdsTextInputEditText, "RdsTextInputEditText");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsTextInputEditText, 0, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTextInputEditText_template);
        String string3 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTextInputEditText_inputMask);
        setUseCustomNumpad(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputEditText_useCustomNumpad, false));
        setSecondaryHintColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsTextInputEditText_secondaryHintColor, getCurrentHintTextColor())));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputEditText_shouldColorReplaceableCharsAsHint, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTextInputEditText_forceInitTemplateHelper, false);
        typedArrayObtainStyledAttributes.recycle();
        if (string2 != null || string3 != null || z2) {
            TemplatedEditTextHelper templatedEditTextHelper = new TemplatedEditTextHelper(this, true, string2, string3);
            templatedEditTextHelper.setSecondaryHintColor(this.secondaryHintColor);
            templatedEditTextHelper.setShouldColorReplaceableCharsAsHint(z);
            templatedEditTextHelper.setUseCustomNumpad(getUseCustomNumpad());
            this.templatedRhEditTextHelper = templatedEditTextHelper;
        }
        setOutlineProvider(new RdsTextInputViewOutlineProvider());
    }

    @Override // com.robinhood.android.designsystem.textinput.ValidatingTextInput
    public boolean isValid() {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            return templatedEditTextHelper.isFilled();
        }
        return true;
    }

    public final Integer getSecondaryHintColor() {
        return this.secondaryHintColor;
    }

    public final void setSecondaryHintColor(Integer num) {
        this.secondaryHintColor = num;
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper == null || templatedEditTextHelper == null) {
            return;
        }
        templatedEditTextHelper.setSecondaryHintColor(num);
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public String getTypedText() {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        String typedText = templatedEditTextHelper != null ? templatedEditTextHelper.getTypedText() : null;
        return typedText == null ? "" : typedText;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setTypedText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.setTypedText(value);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public boolean isInputMasked() {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            return templatedEditTextHelper.isMasked();
        }
        return false;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setInputMasked(boolean z) {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.setMasked(z);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public boolean getUseCustomNumpad() {
        return this.useCustomNumpad;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setUseCustomNumpad(boolean z) {
        this.useCustomNumpad = z;
        if (z) {
            setFocusable(true);
            setFocusableInTouchMode(true);
            setShowSoftInputOnFocus(false);
        } else {
            setShowSoftInputOnFocus(true);
        }
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.setUseCustomNumpad(z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        refreshText();
        this.focusChangesRelay.accept(Boolean.valueOf(focused));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.refreshText();
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public Observable<Boolean> focusChanges() {
        Observable<Boolean> observableHide = this.focusChangesRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final void initTemplatedRhEditTextHelper() {
        if (this.templatedRhEditTextHelper == null) {
            this.templatedRhEditTextHelper = new TemplatedEditTextHelper(this, true, null, null);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setTemplate(String templateString, String placeholderString) {
        Intrinsics.checkNotNullParameter(templateString, "templateString");
        Intrinsics.checkNotNullParameter(placeholderString, "placeholderString");
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.setTemplate(templateString);
        }
        TemplatedEditTextHelper templatedEditTextHelper2 = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper2 != null) {
            templatedEditTextHelper2.setHintForTemplate(placeholderString);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public Observable<TextViewEditorActionEvent> onEnterOrDonePressed() {
        return RxTextView.editorActionEvents(this, new Function1() { // from class: com.robinhood.android.designsystem.textinput.RdsTextInputEditText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RdsTextInputEditText.onEnterOrDonePressed$lambda$2((TextViewEditorActionEvent) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onEnterOrDonePressed$lambda$2(TextViewEditorActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        KeyEvent keyEvent = event.getKeyEvent();
        return (keyEvent != null && keyEvent.getKeyCode() == 66) || (event.getActionId() == 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState;
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null && (bundleOnSaveInstanceState = templatedEditTextHelper.onSaveInstanceState()) != null) {
            bundleOnSaveInstanceState.putParcelable(SAVE_SUPER_STATE, super.onSaveInstanceState());
            return bundleOnSaveInstanceState;
        }
        return super.onSaveInstanceState();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        TemplatedEditTextHelper templatedEditTextHelper;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            if (bundle.containsKey(SAVE_SUPER_STATE) && (templatedEditTextHelper = this.templatedRhEditTextHelper) != null) {
                if (templatedEditTextHelper != null) {
                    templatedEditTextHelper.onRestoreInstanceState(bundle);
                }
                super.onRestoreInstanceState(bundle.getParcelable(SAVE_SUPER_STATE));
                return;
            }
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null ? templatedEditTextHelper.dispatchKeyEvent(event) : false) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.widget.EditText
    public void setSelection(int index) {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            index = templatedEditTextHelper.cursorLocation;
        }
        super.setSelection(index);
    }

    @Override // android.widget.EditText
    public void setSelection(int start, int stop) {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper == null) {
            super.setSelection(start, stop);
        } else {
            super.setSelection(templatedEditTextHelper != null ? templatedEditTextHelper.cursorLocation : 0);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper == null) {
            return;
        }
        int i = templatedEditTextHelper.cursorLocation;
        if (selStart == i && selEnd == i) {
            return;
        }
        setSelection(i);
    }

    private final void refreshText() {
        TemplatedEditTextHelper templatedEditTextHelper = this.templatedRhEditTextHelper;
        if (templatedEditTextHelper != null) {
            templatedEditTextHelper.refreshText();
        }
    }
}
