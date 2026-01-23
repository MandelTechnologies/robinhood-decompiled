package com.robinhood.android.common.history.p082ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryDetailErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryDetailErrorDialogData;", "", "title", "", "message", "<init>", "(ILjava/lang/Integer;)V", "getTitle", "()I", "getMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/robinhood/android/common/history/ui/HistoryDetailErrorDialogData;", "equals", "", "other", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryDetailErrorDialogData {
    public static final int $stable = 0;
    private final Integer message;
    private final int title;

    public static /* synthetic */ HistoryDetailErrorDialogData copy$default(HistoryDetailErrorDialogData historyDetailErrorDialogData, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = historyDetailErrorDialogData.title;
        }
        if ((i2 & 2) != 0) {
            num = historyDetailErrorDialogData.message;
        }
        return historyDetailErrorDialogData.copy(i, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMessage() {
        return this.message;
    }

    public final HistoryDetailErrorDialogData copy(int title, Integer message) {
        return new HistoryDetailErrorDialogData(title, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDetailErrorDialogData)) {
            return false;
        }
        HistoryDetailErrorDialogData historyDetailErrorDialogData = (HistoryDetailErrorDialogData) other;
        return this.title == historyDetailErrorDialogData.title && Intrinsics.areEqual(this.message, historyDetailErrorDialogData.message);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.title) * 31;
        Integer num = this.message;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "HistoryDetailErrorDialogData(title=" + this.title + ", message=" + this.message + ")";
    }

    public HistoryDetailErrorDialogData(int i, Integer num) {
        this.title = i;
        this.message = num;
    }

    public final int getTitle() {
        return this.title;
    }

    public final Integer getMessage() {
        return this.message;
    }
}
