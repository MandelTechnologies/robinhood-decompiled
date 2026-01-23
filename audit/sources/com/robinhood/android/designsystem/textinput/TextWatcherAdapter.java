package com.robinhood.android.designsystem.textinput;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextWatcherAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "Landroid/text/TextWatcher;", "afterTextChanged", "", "text", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "Stub", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface TextWatcherAdapter extends TextWatcher {

    /* compiled from: TextWatcherAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void afterTextChanged(TextWatcherAdapter textWatcherAdapter, Editable text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void beforeTextChanged(TextWatcherAdapter textWatcherAdapter, CharSequence text, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onTextChanged(TextWatcherAdapter textWatcherAdapter, CharSequence text, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(text, "text");
        }
    }

    @Override // android.text.TextWatcher
    void afterTextChanged(Editable text);

    @Override // android.text.TextWatcher
    void beforeTextChanged(CharSequence text, int start, int count, int after);

    @Override // android.text.TextWatcher
    void onTextChanged(CharSequence text, int start, int before, int count);

    /* compiled from: TextWatcherAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter$Stub;", "Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "<init>", "()V", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Stub implements TextWatcherAdapter {
        @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DefaultImpls.afterTextChanged(this, editable);
        }

        @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
        }

        @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DefaultImpls.onTextChanged(this, charSequence, i, i2, i3);
        }
    }
}
