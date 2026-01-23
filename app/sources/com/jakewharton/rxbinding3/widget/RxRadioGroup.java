package com.jakewharton.rxbinding3.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;

@Metadata(m3635d1 = {"com/jakewharton/rxbinding3/widget/RxRadioGroup__RadioGroupCheckedChangeObservableKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final class RxRadioGroup {
    public static final InitialValueObservable<Integer> checkedChanges(RadioGroup radioGroup) {
        return RadioGroupCheckedChangeObservable2.checkedChanges(radioGroup);
    }
}
