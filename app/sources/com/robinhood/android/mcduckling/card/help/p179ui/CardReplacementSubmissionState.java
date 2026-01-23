package com.robinhood.android.mcduckling.card.help.p179ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardReplacementSubmissionState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState;", "", "<init>", "()V", "Submitting", "Success", "Error", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Error;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Submitting;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Success;", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class CardReplacementSubmissionState {
    public static final int $stable = 0;

    public /* synthetic */ CardReplacementSubmissionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CardReplacementSubmissionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Submitting;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submitting extends CardReplacementSubmissionState {
        public static final int $stable = 0;
        public static final Submitting INSTANCE = new Submitting();

        public boolean equals(Object other) {
            return this == other || (other instanceof Submitting);
        }

        public int hashCode() {
            return -2028317637;
        }

        public String toString() {
            return "Submitting";
        }

        private Submitting() {
            super(null);
        }
    }

    private CardReplacementSubmissionState() {
    }

    /* compiled from: CardReplacementSubmissionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Success;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends CardReplacementSubmissionState {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -1563113746;
        }

        public String toString() {
            return "Success";
        }

        private Success() {
            super(null);
        }
    }

    /* compiled from: CardReplacementSubmissionState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState$Error;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends CardReplacementSubmissionState {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
