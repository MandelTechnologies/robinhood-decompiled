package com.truelayer.payments.p419ui.screens.components;

import kotlin.Metadata;

/* compiled from: CancelPaymentDialog.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/components/ErrorDialogResourceIds;", "", "title", "", "message", "dismiss", "continue", "(IIII)V", "getContinue", "()I", "getDismiss", "getMessage", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final /* data */ class ErrorDialogResourceIds {
    private final int continue;
    private final int dismiss;
    private final int message;
    private final int title;

    public static /* synthetic */ ErrorDialogResourceIds copy$default(ErrorDialogResourceIds errorDialogResourceIds, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = errorDialogResourceIds.title;
        }
        if ((i5 & 2) != 0) {
            i2 = errorDialogResourceIds.message;
        }
        if ((i5 & 4) != 0) {
            i3 = errorDialogResourceIds.dismiss;
        }
        if ((i5 & 8) != 0) {
            i4 = errorDialogResourceIds.continue;
        }
        return errorDialogResourceIds.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDismiss() {
        return this.dismiss;
    }

    /* renamed from: component4, reason: from getter */
    public final int getContinue() {
        return this.continue;
    }

    public final ErrorDialogResourceIds copy(int title, int message, int dismiss, int i) {
        return new ErrorDialogResourceIds(title, message, dismiss, i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDialogResourceIds)) {
            return false;
        }
        ErrorDialogResourceIds errorDialogResourceIds = (ErrorDialogResourceIds) other;
        return this.title == errorDialogResourceIds.title && this.message == errorDialogResourceIds.message && this.dismiss == errorDialogResourceIds.dismiss && this.continue == errorDialogResourceIds.continue;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.dismiss)) * 31) + Integer.hashCode(this.continue);
    }

    public String toString() {
        return "ErrorDialogResourceIds(title=" + this.title + ", message=" + this.message + ", dismiss=" + this.dismiss + ", continue=" + this.continue + ")";
    }

    public ErrorDialogResourceIds(int i, int i2, int i3, int i4) {
        this.title = i;
        this.message = i2;
        this.dismiss = i3;
        this.continue = i4;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getMessage() {
        return this.message;
    }

    public final int getDismiss() {
        return this.dismiss;
    }

    public final int getContinue() {
        return this.continue;
    }
}
