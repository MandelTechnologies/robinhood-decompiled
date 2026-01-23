package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewTextChangesObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"textChanges", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "Landroid/widget/TextView;", "rxbinding_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/widget/RxTextView")
/* renamed from: com.jakewharton.rxbinding3.widget.RxTextView__TextViewTextChangesObservableKt, reason: use source file name */
/* loaded from: classes17.dex */
final /* synthetic */ class TextViewTextChangesObservable2 {
    public static final InitialValueObservable<CharSequence> textChanges(TextView textChanges) {
        Intrinsics.checkParameterIsNotNull(textChanges, "$this$textChanges");
        return new TextViewTextChangesObservable(textChanges);
    }
}
