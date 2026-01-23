package com.jakewharton.rxbinding3.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadioGroupCheckedChangeObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"checkedChanges", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "Landroid/widget/RadioGroup;", "rxbinding_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/widget/RxRadioGroup")
/* renamed from: com.jakewharton.rxbinding3.widget.RxRadioGroup__RadioGroupCheckedChangeObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class RadioGroupCheckedChangeObservable2 {
    public static final InitialValueObservable<Integer> checkedChanges(RadioGroup checkedChanges) {
        Intrinsics.checkParameterIsNotNull(checkedChanges, "$this$checkedChanges");
        return new RadioGroupCheckedChangeObservable(checkedChanges);
    }
}
