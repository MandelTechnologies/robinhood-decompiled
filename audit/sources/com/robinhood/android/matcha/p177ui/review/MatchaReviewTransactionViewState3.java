package com.robinhood.android.matcha.p177ui.review;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MemoState;", "", "AddMemo", "Memo", "Lcom/robinhood/android/matcha/ui/review/MemoState$AddMemo;", "Lcom/robinhood/android/matcha/ui/review/MemoState$Memo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.review.MemoState, reason: use source file name */
/* loaded from: classes8.dex */
public interface MatchaReviewTransactionViewState3 {

    /* compiled from: MatchaReviewTransactionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MemoState$AddMemo;", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.review.MemoState$AddMemo */
    public static final class AddMemo implements MatchaReviewTransactionViewState3 {
        public static final int $stable = 0;
        public static final AddMemo INSTANCE = new AddMemo();

        private AddMemo() {
        }
    }

    /* compiled from: MatchaReviewTransactionViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MemoState$Memo;", "Lcom/robinhood/android/matcha/ui/review/MemoState;", MemoInputActivity.EXTRA_MEMO, "", "isEditable", "", "<init>", "(Ljava/lang/String;Z)V", "getMemo", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.review.MemoState$Memo, reason: from toString */
    public static final /* data */ class Memo implements MatchaReviewTransactionViewState3 {
        public static final int $stable = 0;
        private final boolean isEditable;
        private final String memo;

        public static /* synthetic */ Memo copy$default(Memo memo, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = memo.memo;
            }
            if ((i & 2) != 0) {
                z = memo.isEditable;
            }
            return memo.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemo() {
            return this.memo;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEditable() {
            return this.isEditable;
        }

        public final Memo copy(String memo, boolean isEditable) {
            Intrinsics.checkNotNullParameter(memo, "memo");
            return new Memo(memo, isEditable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Memo)) {
                return false;
            }
            Memo memo = (Memo) other;
            return Intrinsics.areEqual(this.memo, memo.memo) && this.isEditable == memo.isEditable;
        }

        public int hashCode() {
            return (this.memo.hashCode() * 31) + Boolean.hashCode(this.isEditable);
        }

        public String toString() {
            return "Memo(memo=" + this.memo + ", isEditable=" + this.isEditable + ")";
        }

        public Memo(String memo, boolean z) {
            Intrinsics.checkNotNullParameter(memo, "memo");
            this.memo = memo;
            this.isEditable = z;
        }

        public final String getMemo() {
            return this.memo;
        }

        public final boolean isEditable() {
            return this.isEditable;
        }
    }
}
