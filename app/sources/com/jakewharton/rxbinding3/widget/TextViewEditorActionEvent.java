package com.jakewharton.rxbinding3.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewEditorActionEventObservable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "", "Landroid/widget/TextView;", "view", "", "actionId", "Landroid/view/KeyEvent;", "keyEvent", "<init>", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "I", "getActionId", "Landroid/view/KeyEvent;", "getKeyEvent", "()Landroid/view/KeyEvent;", "rxbinding_release"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final /* data */ class TextViewEditorActionEvent {
    private final int actionId;
    private final KeyEvent keyEvent;
    private final TextView view;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextViewEditorActionEvent)) {
            return false;
        }
        TextViewEditorActionEvent textViewEditorActionEvent = (TextViewEditorActionEvent) other;
        return Intrinsics.areEqual(this.view, textViewEditorActionEvent.view) && this.actionId == textViewEditorActionEvent.actionId && Intrinsics.areEqual(this.keyEvent, textViewEditorActionEvent.keyEvent);
    }

    public int hashCode() {
        TextView textView = this.view;
        int iHashCode = (((textView != null ? textView.hashCode() : 0) * 31) + this.actionId) * 31;
        KeyEvent keyEvent = this.keyEvent;
        return iHashCode + (keyEvent != null ? keyEvent.hashCode() : 0);
    }

    public String toString() {
        return "TextViewEditorActionEvent(view=" + this.view + ", actionId=" + this.actionId + ", keyEvent=" + this.keyEvent + ")";
    }

    public TextViewEditorActionEvent(TextView view, int i, KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.view = view;
        this.actionId = i;
        this.keyEvent = keyEvent;
    }

    public final int getActionId() {
        return this.actionId;
    }

    public final KeyEvent getKeyEvent() {
        return this.keyEvent;
    }
}
