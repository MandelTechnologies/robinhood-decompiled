package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;

@Metadata(m3635d1 = {"com/jakewharton/rxbinding3/widget/RxTextView__TextViewAfterTextChangeEventObservableKt", "com/jakewharton/rxbinding3/widget/RxTextView__TextViewEditorActionEventObservableKt", "com/jakewharton/rxbinding3/widget/RxTextView__TextViewEditorActionObservableKt", "com/jakewharton/rxbinding3/widget/RxTextView__TextViewTextChangeEventObservableKt", "com/jakewharton/rxbinding3/widget/RxTextView__TextViewTextChangesObservableKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 4, 0})
/* loaded from: classes17.dex */
public final class RxTextView {
    public static final InitialValueObservable<TextViewAfterTextChangeEvent> afterTextChangeEvents(TextView textView) {
        return TextViewAfterTextChangeEventObservable2.afterTextChangeEvents(textView);
    }

    @JvmOverloads
    public static final Observable<TextViewEditorActionEvent> editorActionEvents(TextView textView, Function1<? super TextViewEditorActionEvent, Boolean> function1) {
        return TextViewEditorActionEventObservable2.editorActionEvents(textView, function1);
    }

    @JvmOverloads
    public static final Observable<Integer> editorActions(TextView textView, Function1<? super Integer, Boolean> function1) {
        return TextViewEditorActionObservable2.editorActions(textView, function1);
    }

    public static final InitialValueObservable<TextViewTextChangeEvent> textChangeEvents(TextView textView) {
        return TextViewTextChangeEventObservable2.textChangeEvents(textView);
    }

    public static final InitialValueObservable<CharSequence> textChanges(TextView textView) {
        return TextViewTextChangesObservable2.textChanges(textView);
    }
}
