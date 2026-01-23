package com.robinhood.android.designsystem.textinput;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.textinput.format.InputFormatHelper;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsFormattedEditText.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 F2\u00020\u0001:\u0001FB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0016J\u0018\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0014J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018H\u0016J\u0018\u00100\u001a\u00020+2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0018H\u0016J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000206H\u0016J\"\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\n\u0010<\u001a\u0004\u0018\u00010=H\u0017J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0?H\u0016J\u0018\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\fH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020D0?H\u0016J\u0006\u0010E\u001a\u00020+R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0014R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR(\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/RdsFormattedEditText;", "Lcom/robinhood/android/designsystem/textinput/RdsGenericTextInput;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isValid", "", "()Z", "value", "", "typedText", "getTypedText", "()Ljava/lang/String;", "setTypedText", "(Ljava/lang/String;)V", "isInputMasked", "setInputMasked", "(Z)V", "useCustomNumpad", "getUseCustomNumpad", "setUseCustomNumpad", "", "placeholderCharacterTextColor", "getPlaceholderCharacterTextColor", "()Ljava/lang/Integer;", "setPlaceholderCharacterTextColor", "(Ljava/lang/Integer;)V", "focusedPlaceholderCharacterTextColor", "getFocusedPlaceholderCharacterTextColor", "setFocusedPlaceholderCharacterTextColor", "preFormattedCharacterTextColor", "getPreFormattedCharacterTextColor", "setPreFormattedCharacterTextColor", "focusChangesRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "formatHelper", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatHelper;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "", "state", "onSelectionChanged", "selStart", "selEnd", "setSelection", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "start", "stop", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "onFocusChanged", "focused", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "getText", "Landroid/text/Editable;", "focusChanges", "Lio/reactivex/Observable;", "setTemplate", "templateString", "placeholderString", "onEnterOrDonePressed", "Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "clearTemplate", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsFormattedEditText extends RdsGenericTextInput {
    private static final String SAVE_SUPER_STATE = "superState";
    private final PublishRelay<Boolean> focusChangesRelay;
    private final InputFormatHelper formatHelper;
    private boolean useCustomNumpad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsFormattedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        PublishRelay<Boolean> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.focusChangesRelay = publishRelayCreate;
        this.formatHelper = new InputFormatHelper(this);
        int[] RdsFormattedEditText = C13997R.styleable.RdsFormattedEditText;
        Intrinsics.checkNotNullExpressionValue(RdsFormattedEditText, "RdsFormattedEditText");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsFormattedEditText, 0, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsFormattedEditText_template);
        String string3 = typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsFormattedEditText_android_hint);
        setUseCustomNumpad(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsFormattedEditText_useCustomNumpad, false));
        setPlaceholderCharacterTextColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsFormattedEditText_placeholderCharacterTextColor, getCurrentHintTextColor())));
        setFocusedPlaceholderCharacterTextColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsFormattedEditText_focusedPlaceholderCharacterTextColor, getCurrentHintTextColor())));
        setPreFormattedCharacterTextColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C13997R.styleable.RdsFormattedEditText_preFormattedCharacterTextColor, getCurrentTextColor())));
        if (string2 != null && string3 != null) {
            setTemplate(string2, string3);
        }
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new RdsTextInputViewOutlineProvider());
    }

    @Override // com.robinhood.android.designsystem.textinput.ValidatingTextInput
    public boolean isValid() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            return inputFormatHelper.getIsValid();
        }
        return false;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setTypedText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setTypedText(value);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public String getTypedText() {
        String typedText;
        InputFormatHelper inputFormatHelper = this.formatHelper;
        return (inputFormatHelper == null || (typedText = inputFormatHelper.getTypedText()) == null) ? "" : typedText;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setInputMasked(boolean z) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setMasked(z);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public boolean isInputMasked() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            return inputFormatHelper.getIsMasked();
        }
        return false;
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
            return;
        }
        setShowSoftInputOnFocus(true);
    }

    public final Integer getPlaceholderCharacterTextColor() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            return inputFormatHelper.getPlaceholderTextColor();
        }
        return null;
    }

    public final void setPlaceholderCharacterTextColor(Integer num) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setPlaceholderTextColor(num);
        }
    }

    public final Integer getFocusedPlaceholderCharacterTextColor() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            return inputFormatHelper.getFocusedPlaceholderTextColor();
        }
        return null;
    }

    public final void setFocusedPlaceholderCharacterTextColor(Integer num) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setFocusedPlaceholderTextColor(num);
        }
    }

    public final Integer getPreFormattedCharacterTextColor() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            return inputFormatHelper.getPreFormattedTextColor();
        }
        return null;
    }

    public final void setPreFormattedCharacterTextColor(Integer num) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setPreFormattedTextColor(num);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState;
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null && (bundleOnSaveInstanceState = inputFormatHelper.onSaveInstanceState()) != null) {
            bundleOnSaveInstanceState.putParcelable(SAVE_SUPER_STATE, super.onSaveInstanceState());
            return bundleOnSaveInstanceState;
        }
        return super.onSaveInstanceState();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        InputFormatHelper inputFormatHelper = this.formatHelper;
        boolean z = state instanceof Bundle;
        Bundle bundle = z ? (Bundle) state : null;
        if (bundle != null) {
            bundle.setClassLoader(RdsFormattedEditText.class.getClassLoader());
        }
        if (z) {
            Bundle bundle2 = (Bundle) state;
            if (bundle2.containsKey(SAVE_SUPER_STATE) && inputFormatHelper != null) {
                inputFormatHelper.onRestoreInstanceState(bundle2);
                super.onRestoreInstanceState(bundle2.getParcelable(SAVE_SUPER_STATE));
                return;
            }
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int selStart, int selEnd) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null && inputFormatHelper.getHasFormatter()) {
            setSelection(selStart);
        } else {
            super.onSelectionChanged(selStart, selEnd);
        }
    }

    @Override // android.widget.EditText
    public void setSelection(int index) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        Editable text = getText();
        if (text != null && inputFormatHelper != null && inputFormatHelper.getHasFormatter()) {
            index = inputFormatHelper.getSelectionIndex(text);
        }
        super.setSelection(index);
    }

    @Override // android.widget.EditText
    public void setSelection(int start, int stop) {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null && inputFormatHelper.getHasFormatter()) {
            setSelection(start);
        } else {
            super.setSelection(start, stop);
        }
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InputFormatHelper inputFormatHelper = this.formatHelper;
        boolean zDispatchKeyEvent = inputFormatHelper != null ? inputFormatHelper.dispatchKeyEvent(event) : false;
        return !zDispatchKeyEvent ? super.dispatchKeyEvent(event) : zDispatchKeyEvent;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.setFocused(focused);
        }
        this.focusChangesRelay.accept(Boolean.valueOf(focused));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    @Deprecated
    public Editable getText() {
        return super.getText();
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public Observable<Boolean> focusChanges() {
        Observable<Boolean> observableHide = this.focusChangesRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public void setTemplate(String templateString, String placeholderString) {
        Intrinsics.checkNotNullParameter(templateString, "templateString");
        Intrinsics.checkNotNullParameter(placeholderString, "placeholderString");
        try {
            InputFormatHelper inputFormatHelper = this.formatHelper;
            if (inputFormatHelper != null) {
                inputFormatHelper.setTemplate(templateString, placeholderString);
            }
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    @Override // com.robinhood.android.designsystem.textinput.RdsGenericTextInput
    public Observable<TextViewEditorActionEvent> onEnterOrDonePressed() {
        return RxTextView.editorActionEvents(this, new Function1() { // from class: com.robinhood.android.designsystem.textinput.RdsFormattedEditText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RdsFormattedEditText.onEnterOrDonePressed$lambda$2((TextViewEditorActionEvent) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onEnterOrDonePressed$lambda$2(TextViewEditorActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        KeyEvent keyEvent = event.getKeyEvent();
        return (keyEvent != null && keyEvent.getKeyCode() == 66) || (event.getActionId() == 6);
    }

    public final void clearTemplate() {
        InputFormatHelper inputFormatHelper = this.formatHelper;
        if (inputFormatHelper != null) {
            inputFormatHelper.clearTemplate();
        }
    }
}
