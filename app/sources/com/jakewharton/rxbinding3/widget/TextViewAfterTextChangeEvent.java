package com.jakewharton.rxbinding3.widget;

import android.text.Editable;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewAfterTextChangeEventObservable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/widget/TextViewAfterTextChangeEvent;", "", "Landroid/widget/TextView;", "view", "Landroid/text/Editable;", "editable", "<init>", "(Landroid/widget/TextView;Landroid/text/Editable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "Landroid/text/Editable;", "getEditable", "()Landroid/text/Editable;", "rxbinding_release"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final /* data */ class TextViewAfterTextChangeEvent {
    private final Editable editable;
    private final TextView view;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) other;
        return Intrinsics.areEqual(this.view, textViewAfterTextChangeEvent.view) && Intrinsics.areEqual(this.editable, textViewAfterTextChangeEvent.editable);
    }

    public int hashCode() {
        TextView textView = this.view;
        int iHashCode = (textView != null ? textView.hashCode() : 0) * 31;
        Editable editable = this.editable;
        return iHashCode + (editable != null ? editable.hashCode() : 0);
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.view + ", editable=" + ((Object) this.editable) + ")";
    }

    public TextViewAfterTextChangeEvent(TextView view, Editable editable) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.view = view;
        this.editable = editable;
    }
}
