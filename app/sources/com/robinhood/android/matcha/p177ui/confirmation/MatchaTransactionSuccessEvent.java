package com.robinhood.android.matcha.p177ui.confirmation;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransactionSuccessEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessEvent;", "", "Exit", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessEvent$Exit;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaTransactionSuccessEvent {

    /* compiled from: MatchaTransactionSuccessEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessEvent$Exit;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessEvent;", "postPageKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getPostPageKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements MatchaTransactionSuccessEvent {
        public static final int $stable = 8;
        private final FragmentKey postPageKey;

        public static /* synthetic */ Exit copy$default(Exit exit, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = exit.postPageKey;
            }
            return exit.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getPostPageKey() {
            return this.postPageKey;
        }

        public final Exit copy(FragmentKey postPageKey) {
            return new Exit(postPageKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exit) && Intrinsics.areEqual(this.postPageKey, ((Exit) other).postPageKey);
        }

        public int hashCode() {
            FragmentKey fragmentKey = this.postPageKey;
            if (fragmentKey == null) {
                return 0;
            }
            return fragmentKey.hashCode();
        }

        public String toString() {
            return "Exit(postPageKey=" + this.postPageKey + ")";
        }

        public Exit(FragmentKey fragmentKey) {
            this.postPageKey = fragmentKey;
        }

        public final FragmentKey getPostPageKey() {
            return this.postPageKey;
        }
    }
}
