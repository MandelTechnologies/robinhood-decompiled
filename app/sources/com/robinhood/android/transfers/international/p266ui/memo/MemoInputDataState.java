package com.robinhood.android.transfers.international.p266ui.memo;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/memo/MemoInputDataState;", "", MemoInputActivity.EXTRA_MEMO, "", "<init>", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MemoInputDataState {
    public static final int $stable = 0;
    private final String memo;

    /* JADX WARN: Multi-variable type inference failed */
    public MemoInputDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MemoInputDataState copy$default(MemoInputDataState memoInputDataState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoInputDataState.memo;
        }
        return memoInputDataState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final MemoInputDataState copy(String memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new MemoInputDataState(memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MemoInputDataState) && Intrinsics.areEqual(this.memo, ((MemoInputDataState) other).memo);
    }

    public int hashCode() {
        return this.memo.hashCode();
    }

    public String toString() {
        return "MemoInputDataState(memo=" + this.memo + ")";
    }

    public MemoInputDataState(String memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.memo = memo;
    }

    public /* synthetic */ MemoInputDataState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getMemo() {
        return this.memo;
    }
}
