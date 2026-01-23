package com.robinhood.android.matcha.p177ui.confirmation;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransactionSuccessViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessViewState;", "", "postSuccessKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "doneButtonText", "", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/Integer;)V", "getPostSuccessKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getDoneButtonText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/Integer;)Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessViewState;", "equals", "", "other", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaTransactionSuccessViewState {
    public static final int $stable = 8;
    private final Integer doneButtonText;
    private final FragmentKey postSuccessKey;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaTransactionSuccessViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MatchaTransactionSuccessViewState copy$default(MatchaTransactionSuccessViewState matchaTransactionSuccessViewState, FragmentKey fragmentKey, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentKey = matchaTransactionSuccessViewState.postSuccessKey;
        }
        if ((i & 2) != 0) {
            num = matchaTransactionSuccessViewState.doneButtonText;
        }
        return matchaTransactionSuccessViewState.copy(fragmentKey, num);
    }

    /* renamed from: component1, reason: from getter */
    public final FragmentKey getPostSuccessKey() {
        return this.postSuccessKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getDoneButtonText() {
        return this.doneButtonText;
    }

    public final MatchaTransactionSuccessViewState copy(FragmentKey postSuccessKey, Integer doneButtonText) {
        return new MatchaTransactionSuccessViewState(postSuccessKey, doneButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaTransactionSuccessViewState)) {
            return false;
        }
        MatchaTransactionSuccessViewState matchaTransactionSuccessViewState = (MatchaTransactionSuccessViewState) other;
        return Intrinsics.areEqual(this.postSuccessKey, matchaTransactionSuccessViewState.postSuccessKey) && Intrinsics.areEqual(this.doneButtonText, matchaTransactionSuccessViewState.doneButtonText);
    }

    public int hashCode() {
        FragmentKey fragmentKey = this.postSuccessKey;
        int iHashCode = (fragmentKey == null ? 0 : fragmentKey.hashCode()) * 31;
        Integer num = this.doneButtonText;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MatchaTransactionSuccessViewState(postSuccessKey=" + this.postSuccessKey + ", doneButtonText=" + this.doneButtonText + ")";
    }

    public MatchaTransactionSuccessViewState(FragmentKey fragmentKey, Integer num) {
        this.postSuccessKey = fragmentKey;
        this.doneButtonText = num;
    }

    public /* synthetic */ MatchaTransactionSuccessViewState(FragmentKey fragmentKey, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fragmentKey, (i & 2) != 0 ? null : num);
    }

    public final FragmentKey getPostSuccessKey() {
        return this.postSuccessKey;
    }

    public final Integer getDoneButtonText() {
        return this.doneButtonText;
    }
}
