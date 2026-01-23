package com.robinhood.android.transfers.international.p266ui.memo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/memo/MemoInputViewState;", "", "memoInput", "", "isPrimaryButtonEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getMemoInput", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MemoInputViewState {
    public static final int $stable = 0;
    private final boolean isPrimaryButtonEnabled;
    private final String memoInput;

    public static /* synthetic */ MemoInputViewState copy$default(MemoInputViewState memoInputViewState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoInputViewState.memoInput;
        }
        if ((i & 2) != 0) {
            z = memoInputViewState.isPrimaryButtonEnabled;
        }
        return memoInputViewState.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMemoInput() {
        return this.memoInput;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }

    public final MemoInputViewState copy(String memoInput, boolean isPrimaryButtonEnabled) {
        Intrinsics.checkNotNullParameter(memoInput, "memoInput");
        return new MemoInputViewState(memoInput, isPrimaryButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoInputViewState)) {
            return false;
        }
        MemoInputViewState memoInputViewState = (MemoInputViewState) other;
        return Intrinsics.areEqual(this.memoInput, memoInputViewState.memoInput) && this.isPrimaryButtonEnabled == memoInputViewState.isPrimaryButtonEnabled;
    }

    public int hashCode() {
        return (this.memoInput.hashCode() * 31) + Boolean.hashCode(this.isPrimaryButtonEnabled);
    }

    public String toString() {
        return "MemoInputViewState(memoInput=" + this.memoInput + ", isPrimaryButtonEnabled=" + this.isPrimaryButtonEnabled + ")";
    }

    public MemoInputViewState(String memoInput, boolean z) {
        Intrinsics.checkNotNullParameter(memoInput, "memoInput");
        this.memoInput = memoInput;
        this.isPrimaryButtonEnabled = z;
    }

    public final String getMemoInput() {
        return this.memoInput;
    }

    public final boolean isPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }
}
