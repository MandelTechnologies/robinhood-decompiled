package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewEditorActionEventObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, m3636d2 = {"editorActionEvents", "Lio/reactivex/Observable;", "Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "Landroid/widget/TextView;", "handled", "Lkotlin/Function1;", "", "rxbinding_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/widget/RxTextView")
/* renamed from: com.jakewharton.rxbinding3.widget.RxTextView__TextViewEditorActionEventObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class TextViewEditorActionEventObservable2 {
    @JvmOverloads
    public static final Observable<TextViewEditorActionEvent> editorActionEvents(TextView editorActionEvents, Function1<? super TextViewEditorActionEvent, Boolean> handled) {
        Intrinsics.checkParameterIsNotNull(editorActionEvents, "$this$editorActionEvents");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new TextViewEditorActionEventObservable(editorActionEvents, handled);
    }
}
