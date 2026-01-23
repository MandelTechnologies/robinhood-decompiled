package com.robinhood.android.designsystem.textinput;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.EditText;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: TemplatedEditTextHelper.kt */
@Metadata(m3635d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004*\u0001'\u0018\u0000 <2\u00020\u0001:\u0001<B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0007J\u0010\u0010,\u001a\u00020*2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010,\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u000bH\u0002J\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020/J\u000e\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020*J\b\u00106\u001a\u00020*H\u0002J\b\u0010\u0004\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u0002092\u0006\u0010\u0006\u001a\u000209H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R,\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/TemplatedEditTextHelper;", "", "editText", "Landroid/widget/EditText;", "styleTextWithHighlightedSections", "", "template", "", "inputMask", "<init>", "(Landroid/widget/EditText;ZLjava/lang/String;Ljava/lang/String;)V", "", "numReplaceableHint", "", "cursorLocation", "value", "isMasked", "()Z", "setMasked", "(Z)V", "typedText", "getTypedText", "()Ljava/lang/String;", "setTypedText", "(Ljava/lang/String;)V", "secondaryHintColor", "getSecondaryHintColor", "()Ljava/lang/Integer;", "setSecondaryHintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shouldColorReplaceableCharsAsHint", "getShouldColorReplaceableCharsAsHint", "setShouldColorReplaceableCharsAsHint", "useCustomNumpad", "getUseCustomNumpad", "setUseCustomNumpad", "isFilled", "userInputTextListener", "com/robinhood/android/designsystem/textinput/TemplatedEditTextHelper$userInputTextListener$1", "Lcom/robinhood/android/designsystem/textinput/TemplatedEditTextHelper$userInputTextListener$1;", "setHintForTemplate", "", "hint", "setTemplate", "setInputMask", "onSaveInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "state", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "refreshText", "styleText", "isReplaceableText", "text", "", "matchesTemplate", "typed", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TemplatedEditTextHelper {
    private static final String MASK_CHARACTER = "•";
    private static final String SAVE_INPUT_MASK = "rh-inputMask";
    private static final String SAVE_TEMPLATE = "rh-template";
    private static final String SAVE_TYPED_TEXT = "rh-typedText";
    private static final char TEMPLATE_NUMERICAL = '#';
    private static final char TEMPLATE_WILDCARD = '*';

    @JvmField
    public int cursorLocation;
    private final EditText editText;
    private char[] inputMask;
    private int numReplaceableHint;
    private Integer secondaryHintColor;
    private boolean shouldColorReplaceableCharsAsHint;
    private boolean styleTextWithHighlightedSections;
    private char[] template;
    private String typedText;
    private boolean useCustomNumpad;
    private final TemplatedEditTextHelper2 userInputTextListener;

    private final boolean isReplaceableText(char text) {
        return text == '#' || text == '*';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.text.TextWatcher, com.robinhood.android.designsystem.textinput.TemplatedEditTextHelper$userInputTextListener$1] */
    public TemplatedEditTextHelper(EditText editText, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.editText = editText;
        this.styleTextWithHighlightedSections = z;
        this.template = new char[0];
        this.inputMask = new char[0];
        this.typedText = "";
        this.shouldColorReplaceableCharsAsHint = true;
        ?? r3 = new TextWatcherAdapter() { // from class: com.robinhood.android.designsystem.textinput.TemplatedEditTextHelper$userInputTextListener$1
            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextWatcherAdapter.DefaultImpls.afterTextChanged(this, editable);
            }

            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherAdapter.DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(text, "text");
                if (this.this$0.getUseCustomNumpad() || !this.this$0.editText.hasFocus()) {
                    return;
                }
                if (count == 0) {
                    if (this.this$0.getTypedText().length() > 0) {
                        TemplatedEditTextHelper templatedEditTextHelper = this.this$0;
                        String strSubstring = templatedEditTextHelper.getTypedText().substring(0, this.this$0.getTypedText().length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        templatedEditTextHelper.setTypedText(strSubstring);
                        return;
                    }
                    return;
                }
                TemplatedEditTextHelper templatedEditTextHelper2 = this.this$0;
                templatedEditTextHelper2.setTypedText(templatedEditTextHelper2.getTypedText() + text.subSequence(start, start + 1).toString());
            }
        };
        this.userInputTextListener = r3;
        if (str != null) {
            setTemplate(str);
        }
        if (str2 != null) {
            setInputMask(str2);
        }
        editText.addTextChangedListener(new TextWatcherAdapter.Stub() { // from class: com.robinhood.android.designsystem.textinput.TemplatedEditTextHelper.1
            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter.Stub, com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                Intrinsics.checkNotNullParameter(text, "text");
                TemplatedEditTextHelper.this.editText.setSelection(TemplatedEditTextHelper.this.cursorLocation);
            }
        });
        editText.addTextChangedListener(r3);
        editText.setCustomSelectionActionModeCallback(new EmptyActionModeCallback());
    }

    public final boolean isMasked() {
        return !(this.template.length == 0);
    }

    public final void setMasked(boolean z) {
        if (z) {
            int i = 0;
            for (char c : this.template) {
                if (c == '#' || c == '*') {
                    i++;
                }
            }
            setInputMask(StringsKt.repeat(MASK_CHARACTER, i));
            return;
        }
        setInputMask(new char[0]);
    }

    public final String getTypedText() {
        return this.typedText;
    }

    public final void setTypedText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.typedText = value;
        refreshText();
    }

    public final Integer getSecondaryHintColor() {
        return this.secondaryHintColor;
    }

    public final void setSecondaryHintColor(Integer num) {
        this.secondaryHintColor = num;
        refreshText();
    }

    public final boolean getShouldColorReplaceableCharsAsHint() {
        return this.shouldColorReplaceableCharsAsHint;
    }

    public final void setShouldColorReplaceableCharsAsHint(boolean z) {
        this.shouldColorReplaceableCharsAsHint = z;
    }

    public final boolean getUseCustomNumpad() {
        return this.useCustomNumpad;
    }

    public final void setUseCustomNumpad(boolean z) {
        this.useCustomNumpad = z;
    }

    public final boolean isFilled() {
        return this.typedText.length() >= this.numReplaceableHint;
    }

    public final void setHintForTemplate(String hint) {
        this.editText.setHint(hint);
        refreshText();
    }

    public final void setTemplate(String template) {
        if (template == null) {
            template = "";
        }
        char[] charArray = template.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        setTemplate(charArray);
    }

    private final void setTemplate(char[] template) {
        this.template = template;
        this.numReplaceableHint = SequencesKt.sumOfInt(SequencesKt.map(ArraysKt.asSequence(template), new Function1() { // from class: com.robinhood.android.designsystem.textinput.TemplatedEditTextHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(TemplatedEditTextHelper.setTemplate$lambda$1(this.f$0, ((Character) obj).charValue()));
            }
        }));
        refreshText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setTemplate$lambda$1(TemplatedEditTextHelper templatedEditTextHelper, char c) {
        return templatedEditTextHelper.isReplaceableText(c) ? 1 : 0;
    }

    private final void setInputMask(String inputMask) {
        char[] charArray = inputMask.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        setInputMask(charArray);
    }

    private final void setInputMask(char[] inputMask) {
        this.inputMask = inputMask;
        refreshText();
    }

    public final Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putString(SAVE_TYPED_TEXT, this.typedText);
        bundle.putCharArray(SAVE_TEMPLATE, this.template);
        bundle.putCharArray(SAVE_INPUT_MASK, this.inputMask);
        return bundle;
    }

    public final void onRestoreInstanceState(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String string2 = state.getString(SAVE_TYPED_TEXT);
        Intrinsics.checkNotNull(string2);
        setTypedText(string2);
        char[] charArray = state.getCharArray(SAVE_TEMPLATE);
        Intrinsics.checkNotNull(charArray);
        setTemplate(charArray);
        char[] charArray2 = state.getCharArray(SAVE_INPUT_MASK);
        Intrinsics.checkNotNull(charArray2);
        setInputMask(charArray2);
    }

    public final boolean dispatchKeyEvent(KeyEvent event) {
        char number;
        int length;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.useCustomNumpad) {
            return false;
        }
        if (event.getKeyCode() == 67) {
            if (event.getAction() == 0 && (length = this.typedText.length()) > 0) {
                String strSubstring = this.typedText.substring(0, length - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                setTypedText(strSubstring);
                refreshText();
            }
            return true;
        }
        if (event.getUnicodeChar() != 0) {
            number = (char) event.getUnicodeChar();
        } else {
            number = event.getNumber();
        }
        if (number == 0) {
            return false;
        }
        if (event.getAction() == 0) {
            setTypedText(this.typedText + number);
            refreshText();
        }
        return true;
    }

    public final void refreshText() {
        if (this.styleTextWithHighlightedSections) {
            styleTextWithHighlightedSections();
        } else {
            styleText();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void styleText() {
        int i;
        char c;
        CharSequence hint = this.editText.getHint();
        if (hint == null || hint.length() != this.template.length) {
            this.cursorLocation = this.typedText.length();
            this.editText.removeTextChangedListener(this.userInputTextListener);
            this.editText.setText(this.typedText);
            this.editText.addTextChangedListener(this.userInputTextListener);
            return;
        }
        int length = this.typedText.length();
        int i2 = this.numReplaceableHint;
        if (length > i2) {
            String strSubstring = this.typedText.substring(0, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            setTypedText(strSubstring);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length2 = hint.length();
        int length3 = this.inputMask.length;
        int i3 = 0;
        int i4 = 0;
        int length4 = -1;
        int i5 = -1;
        while (i3 < length2) {
            char c2 = this.template[i3];
            char cCharAt = hint.charAt(i3);
            Character chValueOf = i4 < this.typedText.length() ? Character.valueOf(this.typedText.charAt(i4)) : null;
            if (isReplaceableText(c2)) {
                if (chValueOf != null) {
                    if (matchesTemplate(chValueOf.charValue(), c2)) {
                        if (i4 < length3 && (c = this.inputMask[i4]) != ' ') {
                            spannableStringBuilder.append(c);
                        } else {
                            spannableStringBuilder.append(chValueOf.charValue());
                        }
                        i4++;
                    } else {
                        String strSubstring2 = this.typedText.substring(0, i4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        setTypedText(strSubstring2);
                        i = i3;
                        if (i3 < length2) {
                            i3 = -1;
                        }
                    }
                } else {
                    spannableStringBuilder.append(cCharAt);
                    if (i5 == -1) {
                        i5 = i3;
                    }
                }
                i3++;
                i = i3;
                if (i3 < length2) {
                }
            } else {
                spannableStringBuilder.append(cCharAt);
                i = i3 + 1;
            }
            if (i3 != -1 && i5 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.editText.getCurrentHintTextColor()), i5, i3, 17);
                if (length4 == -1) {
                    length4 = i5;
                }
                i5 = -1;
            }
            i3 = i;
        }
        if (length4 == -1) {
            length4 = spannableStringBuilder.length();
        }
        this.cursorLocation = length4;
        this.editText.removeTextChangedListener(this.userInputTextListener);
        this.editText.setText(spannableStringBuilder);
        this.editText.addTextChangedListener(this.userInputTextListener);
    }

    private final void styleTextWithHighlightedSections() {
        boolean z;
        boolean z2;
        Integer secondaryHintColor;
        char c;
        CharSequence hint = this.editText.getHint();
        if (hint == null || hint.length() != this.template.length) {
            this.cursorLocation = this.typedText.length();
            this.editText.removeTextChangedListener(this.userInputTextListener);
            this.editText.setText(this.typedText);
            this.editText.addTextChangedListener(this.userInputTextListener);
            return;
        }
        int length = this.typedText.length();
        int i = this.numReplaceableHint;
        if (length > i) {
            String strSubstring = this.typedText.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            setTypedText(strSubstring);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length2 = hint.length();
        int length3 = this.inputMask.length;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        Integer numValueOf = null;
        while (i2 < length2) {
            char c2 = this.template[i2];
            char cCharAt = hint.charAt(i2);
            Character chValueOf = i3 < this.typedText.length() ? Character.valueOf(this.typedText.charAt(i3)) : null;
            boolean zIsReplaceableText = isReplaceableText(c2);
            if (!zIsReplaceableText) {
                spannableStringBuilder.append(cCharAt);
                z = this.shouldColorReplaceableCharsAsHint;
                i2++;
                z2 = false;
            } else if (chValueOf != null) {
                if (matchesTemplate(chValueOf.charValue(), c2)) {
                    if (i3 < length3 && (c = this.inputMask[i3]) != ' ') {
                        spannableStringBuilder.append(c);
                    } else {
                        spannableStringBuilder.append(chValueOf.charValue());
                    }
                    i3++;
                    i2++;
                } else {
                    String strSubstring2 = this.typedText.substring(0, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    setTypedText(strSubstring2);
                }
                z2 = z3;
                z = false;
            } else {
                spannableStringBuilder.append(cCharAt);
                if (numValueOf == null && zIsReplaceableText) {
                    numValueOf = Integer.valueOf(i2);
                    z3 = true;
                }
                i2++;
                z2 = z3;
                z = true;
            }
            if (z) {
                int iIntValue = ((!zIsReplaceableText || (this.editText.isFocused() && z2)) && (secondaryHintColor = getSecondaryHintColor()) != null) ? secondaryHintColor.intValue() : this.editText.getCurrentHintTextColor();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(iIntValue), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            z3 = z2;
        }
        this.cursorLocation = numValueOf != null ? numValueOf.intValue() : spannableStringBuilder.length();
        this.editText.removeTextChangedListener(this.userInputTextListener);
        this.editText.setText(spannableStringBuilder);
        this.editText.addTextChangedListener(this.userInputTextListener);
    }

    private final boolean matchesTemplate(char typed, char template) {
        if (template == '#') {
            return Character.isDigit(typed);
        }
        if (template == '*') {
            return true;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Character.valueOf(typed));
        throw new ExceptionsH();
    }
}
