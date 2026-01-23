package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShowBlockConfirmationDialogEvent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/ShowBlockConfirmationDialogEvent;", "", "isBlocked", "", "fullName", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getFullName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ShowBlockConfirmationDialogEvent {
    public static final int $stable = 0;
    private final String fullName;
    private final boolean isBlocked;

    public static /* synthetic */ ShowBlockConfirmationDialogEvent copy$default(ShowBlockConfirmationDialogEvent showBlockConfirmationDialogEvent, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = showBlockConfirmationDialogEvent.isBlocked;
        }
        if ((i & 2) != 0) {
            str = showBlockConfirmationDialogEvent.fullName;
        }
        return showBlockConfirmationDialogEvent.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final ShowBlockConfirmationDialogEvent copy(boolean isBlocked, String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        return new ShowBlockConfirmationDialogEvent(isBlocked, fullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowBlockConfirmationDialogEvent)) {
            return false;
        }
        ShowBlockConfirmationDialogEvent showBlockConfirmationDialogEvent = (ShowBlockConfirmationDialogEvent) other;
        return this.isBlocked == showBlockConfirmationDialogEvent.isBlocked && Intrinsics.areEqual(this.fullName, showBlockConfirmationDialogEvent.fullName);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isBlocked) * 31) + this.fullName.hashCode();
    }

    public String toString() {
        return "ShowBlockConfirmationDialogEvent(isBlocked=" + this.isBlocked + ", fullName=" + this.fullName + ")";
    }

    public ShowBlockConfirmationDialogEvent(boolean z, String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.isBlocked = z;
        this.fullName = fullName;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final String getFullName() {
        return this.fullName;
    }
}
