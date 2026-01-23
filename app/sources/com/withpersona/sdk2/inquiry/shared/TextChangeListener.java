package com.withpersona.sdk2.inquiry.shared;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextChangeListener.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"setTextChangedListener", "", "Landroid/widget/TextView;", "listener", "Lkotlin/Function1;", "", "watcher", "Landroid/text/TextWatcher;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.TextChangeListenerKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextChangeListener {
    public static final void setTextChangedListener(TextView textView, final Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Object tag = textView.getTag(R$id.text_changed_listener);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        TextWatcher textWatcher = new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.shared.TextChangeListenerKt$setTextChangedListener$newListener$1
            private String oldText;

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String strValueOf = String.valueOf(s);
                String str = this.oldText;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("oldText");
                    str = null;
                }
                if (Intrinsics.areEqual(strValueOf, str)) {
                    return;
                }
                listener.invoke(String.valueOf(s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                this.oldText = String.valueOf(s);
            }
        };
        textView.addTextChangedListener(textWatcher);
        textView.setTag(R$id.text_changed_listener, textWatcher);
    }

    public static final void setTextChangedListener(TextView textView, TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        Object tag = textView.getTag(R$id.text_changed_listener);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        textView.addTextChangedListener(watcher);
        textView.setTag(R$id.text_changed_listener, watcher);
    }
}
