package com.robinhood.android.transfers.international.p266ui.memo;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/memo/MemoInputEvent;", "", "ButtonClicked", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputEvent$ButtonClicked;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface MemoInputEvent {

    /* compiled from: MemoInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/memo/MemoInputEvent$ButtonClicked;", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputEvent;", MemoInputActivity.EXTRA_MEMO, "", "<init>", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ButtonClicked implements MemoInputEvent {
        public static final int $stable = 0;
        private final String memo;

        public static /* synthetic */ ButtonClicked copy$default(ButtonClicked buttonClicked, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonClicked.memo;
            }
            return buttonClicked.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemo() {
            return this.memo;
        }

        public final ButtonClicked copy(String memo) {
            return new ButtonClicked(memo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ButtonClicked) && Intrinsics.areEqual(this.memo, ((ButtonClicked) other).memo);
        }

        public int hashCode() {
            String str = this.memo;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ButtonClicked(memo=" + this.memo + ")";
        }

        public ButtonClicked(String str) {
            this.memo = str;
        }

        public final String getMemo() {
            return this.memo;
        }
    }
}
