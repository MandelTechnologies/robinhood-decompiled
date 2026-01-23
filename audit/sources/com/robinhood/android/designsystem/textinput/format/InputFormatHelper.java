package com.robinhood.android.designsystem.textinput.format;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.widget.EditText;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacter;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputFormatHelper.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u0002GHB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u0010+\u001a\u000201H\u0016J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u000203J\u0016\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000eJ\u0006\u00109\u001a\u00020*J\u000e\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u000201J\u000e\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020>J\f\u0010\u000f\u001a\u00020\u000e*\u00020,H\u0002J\u0014\u0010?\u001a\u00020**\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\u001c\u0010C\u001a\u00020**\u00020@2\u0006\u0010A\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0007H\u0002J\b\u0010F\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR,\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR,\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0006\u001a\u0004\u0018\u00010%@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b'\u0010(¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatHelper;", "Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "editText", "Landroid/widget/EditText;", "<init>", "(Landroid/widget/EditText;)V", "value", "", "isValid", "()Z", "isMasked", "setMasked", "(Z)V", "typedText", "", "getTypedText", "()Ljava/lang/String;", "setTypedText", "(Ljava/lang/String;)V", "hasFormatter", "getHasFormatter", "isFocused", "setFocused", "", "preFormattedTextColor", "getPreFormattedTextColor", "()Ljava/lang/Integer;", "setPreFormattedTextColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "focusedPlaceholderTextColor", "getFocusedPlaceholderTextColor", "setFocusedPlaceholderTextColor", "placeholderTextColor", "getPlaceholderTextColor", "setPlaceholderTextColor", "stylingText", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacterList;", InputFormatHelper.SAVED_STATE_FORMAT_CHARACTERS, "setFormatCharacters", "(Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacterList;)V", "onTextChanged", "", "text", "", "start", "before", "count", "afterTextChanged", "Landroid/text/Editable;", "onSaveInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "bundle", "setTemplate", "templateString", "placeholderString", "clearTemplate", "getSelectionIndex", Constants.RequestParamsKeys.SESSION_ID_KEY, "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "appendPreFormatCharacter", "Landroid/text/SpannableStringBuilder;", "formatCharacter", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$PreFormat;", "appendPlaceholderCharacter", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$Placeholder;", "useFocusedTextColor", "refreshText", "CharacterReplacementSpan", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InputFormatHelper implements TextWatcherAdapter {
    private static final char MASK_CHARACTER = 8226;
    private static final char PLACEHOLDER_CHARACTER = ' ';
    private static final String SAVED_STATE_FORMAT_CHARACTERS = "formatCharacters";
    private final EditText editText;
    private Integer focusedPlaceholderTextColor;
    private InputFormatCharacterList formatCharacters;
    private boolean isFocused;
    private boolean isMasked;
    private boolean isValid;
    private Integer placeholderTextColor;
    private Integer preFormattedTextColor;
    private boolean stylingText;
    private String typedText;

    public InputFormatHelper(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.editText = editText;
        editText.addTextChangedListener(this);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: isMasked, reason: from getter */
    public final boolean getIsMasked() {
        return this.isMasked;
    }

    public final void setMasked(boolean z) {
        this.isMasked = z;
    }

    public final String getTypedText() {
        return this.typedText;
    }

    public final void setTypedText(String str) {
        this.typedText = str;
    }

    public final boolean getHasFormatter() {
        return this.formatCharacters != null;
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z) {
        if (this.isFocused != z) {
            this.isFocused = z;
            refreshText();
        }
    }

    public final Integer getPreFormattedTextColor() {
        return this.preFormattedTextColor;
    }

    public final void setPreFormattedTextColor(Integer num) {
        this.preFormattedTextColor = num;
        refreshText();
    }

    public final Integer getFocusedPlaceholderTextColor() {
        return this.focusedPlaceholderTextColor;
    }

    public final void setFocusedPlaceholderTextColor(Integer num) {
        this.focusedPlaceholderTextColor = num;
        refreshText();
    }

    public final Integer getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public final void setPlaceholderTextColor(Integer num) {
        this.placeholderTextColor = num;
        refreshText();
    }

    private final void setFormatCharacters(InputFormatCharacterList inputFormatCharacterList) {
        if (Intrinsics.areEqual(this.formatCharacters, inputFormatCharacterList)) {
            return;
        }
        this.formatCharacters = inputFormatCharacterList;
        this.editText.setText("");
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence text, int start, int before, int count) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.stylingText) {
            return;
        }
        String typedText = getTypedText(text);
        boolean zIsValid = true;
        if (this.isMasked) {
            String str = this.typedText;
            if (str == null) {
                str = "";
            }
            if (count == 0) {
                if (str.length() == 0) {
                    typedText = str;
                } else {
                    typedText = str.substring(0, str.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(typedText, "substring(...)");
                }
            } else {
                typedText = str + typedText;
                InputFormatCharacterList inputFormatCharacterList = this.formatCharacters;
                if (inputFormatCharacterList != null && typedText.length() > inputFormatCharacterList.getPlaceholderCount()) {
                    typedText = typedText.substring(0, inputFormatCharacterList.getPlaceholderCount());
                    Intrinsics.checkNotNullExpressionValue(typedText, "substring(...)");
                }
            }
        }
        this.typedText = typedText;
        InputFormatCharacterList inputFormatCharacterList2 = this.formatCharacters;
        if (inputFormatCharacterList2 != null) {
            zIsValid = inputFormatCharacterList2.isValid(typedText != null ? typedText : "");
        }
        this.isValid = zIsValid;
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable text) {
        InputFormatCharacterList inputFormatCharacterList;
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.stylingText || (inputFormatCharacterList = this.formatCharacters) == null) {
            return;
        }
        this.stylingText = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = this.typedText;
        if (str == null) {
            str = "";
        }
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < inputFormatCharacterList.getFormatCharacterCount(); i2++) {
            InputFormatCharacter formatCharacter = inputFormatCharacterList.getFormatCharacter(i2);
            if (formatCharacter instanceof InputFormatCharacter.PreFormat) {
                appendPreFormatCharacter(spannableStringBuilder, (InputFormatCharacter.PreFormat) formatCharacter);
                if (i == str.length()) {
                    z = true;
                }
            } else {
                if (!(formatCharacter instanceof InputFormatCharacter.Placeholder)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (i < str.length()) {
                    if (this.isMasked) {
                        spannableStringBuilder.append(MASK_CHARACTER);
                    } else {
                        spannableStringBuilder.append(str.charAt(i));
                    }
                    i++;
                } else {
                    appendPlaceholderCharacter(spannableStringBuilder, (InputFormatCharacter.Placeholder) formatCharacter, !z && this.isFocused);
                }
            }
        }
        for (Object obj : text.getSpans(0, text.length(), CharacterReplacementSpan.class)) {
            text.removeSpan((CharacterReplacementSpan) obj);
        }
        InputFilter[] filters = text.getFilters();
        text.setFilters(new InputFilter[0]);
        text.replace(0, text.length(), spannableStringBuilder);
        text.setFilters(filters);
        Selection.setSelection(text, getSelectionIndex(text));
        this.stylingText = false;
    }

    public final Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(SAVED_STATE_FORMAT_CHARACTERS, this.formatCharacters);
        return bundle;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(InputFormatCharacterList.class.getClassLoader());
        setFormatCharacters((InputFormatCharacterList) bundle.getParcelable(SAVED_STATE_FORMAT_CHARACTERS));
    }

    public final void setTemplate(String templateString, String placeholderString) {
        Intrinsics.checkNotNullParameter(templateString, "templateString");
        Intrinsics.checkNotNullParameter(placeholderString, "placeholderString");
        setFormatCharacters(new InputFormatCharacterList(templateString, placeholderString));
    }

    public final void clearTemplate() {
        setFormatCharacters(null);
    }

    public final int getSelectionIndex(Editable s) {
        Intrinsics.checkNotNullParameter(s, "s");
        InputFormatCharacterList inputFormatCharacterList = this.formatCharacters;
        if (inputFormatCharacterList == null || s.length() == 0) {
            return 0;
        }
        int i = -1;
        int length = s.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = s.charAt(length);
                if ((this.isMasked && cCharAt == 8226) || Character.isLetterOrDigit(cCharAt)) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            i = length;
        }
        return i >= 0 ? i + 1 : inputFormatCharacterList.getFirstPlaceholderIndex();
    }

    public final boolean dispatchKeyEvent(KeyEvent event) {
        char number;
        Intrinsics.checkNotNullParameter(event, "event");
        Editable text = this.editText.getText();
        if (text == null) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(text);
        if (event.getKeyCode() == 67) {
            if (event.getAction() == 0 && selectionStart > 0) {
                text.delete(selectionStart - 1, selectionStart);
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
            text.insert(selectionStart, String.valueOf(number));
        }
        return true;
    }

    private final String getTypedText(CharSequence charSequence) throws IOException {
        InputFormatCharacterList inputFormatCharacterList = this.formatCharacters;
        if (inputFormatCharacterList == null) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return StringsKt.take(sb, inputFormatCharacterList.getPlaceholderCount()).toString();
    }

    private final void appendPreFormatCharacter(SpannableStringBuilder spannableStringBuilder, InputFormatCharacter.PreFormat preFormat) {
        if (preFormat.getValue() != ' ') {
            CharacterReplacementSpan characterReplacementSpan = new CharacterReplacementSpan(preFormat.getValue(), this.preFormattedTextColor);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(PLACEHOLDER_CHARACTER);
            spannableStringBuilder.setSpan(characterReplacementSpan, length, spannableStringBuilder.length(), 17);
            return;
        }
        spannableStringBuilder.append(PLACEHOLDER_CHARACTER);
    }

    private final void appendPlaceholderCharacter(SpannableStringBuilder spannableStringBuilder, InputFormatCharacter.Placeholder placeholder, boolean z) {
        Integer num;
        if (placeholder.getPlaceholder() != ' ') {
            if (z) {
                num = this.focusedPlaceholderTextColor;
            } else {
                num = this.placeholderTextColor;
            }
            CharacterReplacementSpan characterReplacementSpan = new CharacterReplacementSpan(placeholder.getPlaceholder(), num);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(PLACEHOLDER_CHARACTER);
            spannableStringBuilder.setSpan(characterReplacementSpan, length, spannableStringBuilder.length(), 17);
            return;
        }
        spannableStringBuilder.append(PLACEHOLDER_CHARACTER);
    }

    private final void refreshText() {
        EditText editText = this.editText;
        editText.setText(editText.getText());
    }

    /* compiled from: InputFormatHelper.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016JR\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatHelper$CharacterReplacementSpan;", "Landroid/text/style/ReplacementSpan;", "replacementCharacter", "", ResourceTypes.COLOR, "", "<init>", "(CLjava/lang/Integer;)V", "Ljava/lang/Integer;", "replacementString", "", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CharacterReplacementSpan extends ReplacementSpan {
        private final Integer color;
        private final String replacementString;

        public /* synthetic */ CharacterReplacementSpan(char c, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c, (i & 2) != 0 ? null : num);
        }

        public CharacterReplacementSpan(char c, Integer num) {
            this.color = num;
            this.replacementString = String.valueOf(c);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            return (int) paint.measureText(this.replacementString);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(paint, "paint");
            int color = paint.getColor();
            Integer num = this.color;
            paint.setColor(num != null ? num.intValue() : color);
            canvas.drawText(this.replacementString, x, y, paint);
            paint.setColor(color);
        }
    }
}
