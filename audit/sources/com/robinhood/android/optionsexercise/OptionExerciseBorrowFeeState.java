package com.robinhood.android.optionsexercise;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OptionExerciseBorrowFeeState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseBorrowFeeState;", "", "borrowFeeText", "", "borrowFeeLinkText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBorrowFeeText", "()Ljava/lang/String;", "getBorrowFeeLinkText", "startIndex", "", "getStartIndex", "()I", "endIndex", "getEndIndex", "areIndexValid", "", "getAreIndexValid", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionExerciseBorrowFeeState {
    public static final int $stable = 0;
    private final boolean areIndexValid;
    private final String borrowFeeLinkText;
    private final String borrowFeeText;
    private final int endIndex;
    private final int startIndex;

    public static /* synthetic */ OptionExerciseBorrowFeeState copy$default(OptionExerciseBorrowFeeState optionExerciseBorrowFeeState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionExerciseBorrowFeeState.borrowFeeText;
        }
        if ((i & 2) != 0) {
            str2 = optionExerciseBorrowFeeState.borrowFeeLinkText;
        }
        return optionExerciseBorrowFeeState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBorrowFeeText() {
        return this.borrowFeeText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBorrowFeeLinkText() {
        return this.borrowFeeLinkText;
    }

    public final OptionExerciseBorrowFeeState copy(String borrowFeeText, String borrowFeeLinkText) {
        Intrinsics.checkNotNullParameter(borrowFeeText, "borrowFeeText");
        Intrinsics.checkNotNullParameter(borrowFeeLinkText, "borrowFeeLinkText");
        return new OptionExerciseBorrowFeeState(borrowFeeText, borrowFeeLinkText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExerciseBorrowFeeState)) {
            return false;
        }
        OptionExerciseBorrowFeeState optionExerciseBorrowFeeState = (OptionExerciseBorrowFeeState) other;
        return Intrinsics.areEqual(this.borrowFeeText, optionExerciseBorrowFeeState.borrowFeeText) && Intrinsics.areEqual(this.borrowFeeLinkText, optionExerciseBorrowFeeState.borrowFeeLinkText);
    }

    public int hashCode() {
        return (this.borrowFeeText.hashCode() * 31) + this.borrowFeeLinkText.hashCode();
    }

    public String toString() {
        return "OptionExerciseBorrowFeeState(borrowFeeText=" + this.borrowFeeText + ", borrowFeeLinkText=" + this.borrowFeeLinkText + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionExerciseBorrowFeeState(String borrowFeeText, String borrowFeeLinkText) {
        boolean z;
        Intrinsics.checkNotNullParameter(borrowFeeText, "borrowFeeText");
        Intrinsics.checkNotNullParameter(borrowFeeLinkText, "borrowFeeLinkText");
        this.borrowFeeText = borrowFeeText;
        this.borrowFeeLinkText = borrowFeeLinkText;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) borrowFeeText, borrowFeeLinkText, 0, false, 6, (Object) null);
        this.startIndex = iIndexOf$default;
        int length = borrowFeeLinkText.length() + iIndexOf$default;
        this.endIndex = length;
        int length2 = borrowFeeText.length();
        if (iIndexOf$default < 0 || iIndexOf$default >= length2) {
            z = false;
        } else {
            int length3 = borrowFeeText.length();
            if (iIndexOf$default <= length && length <= length3) {
                z = true;
            }
        }
        this.areIndexValid = z;
    }

    public final String getBorrowFeeText() {
        return this.borrowFeeText;
    }

    public final String getBorrowFeeLinkText() {
        return this.borrowFeeLinkText;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final boolean getAreIndexValid() {
        return this.areIndexValid;
    }
}
