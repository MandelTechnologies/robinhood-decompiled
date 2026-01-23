package com.robinhood.android.safetylabels.p247ui;

import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLesson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafetyLabelsLessonDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState;", "", "status", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "expandDisclosure", "", "<init>", "(Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;Z)V", "getStatus", "()Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "getExpandDisclosure", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Status", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SafetyLabelsLessonDataState {
    public static final int $stable = 0;
    private final boolean expandDisclosure;
    private final Status status;

    /* JADX WARN: Multi-variable type inference failed */
    public SafetyLabelsLessonDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SafetyLabelsLessonDataState copy$default(SafetyLabelsLessonDataState safetyLabelsLessonDataState, Status status, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            status = safetyLabelsLessonDataState.status;
        }
        if ((i & 2) != 0) {
            z = safetyLabelsLessonDataState.expandDisclosure;
        }
        return safetyLabelsLessonDataState.copy(status, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    public final SafetyLabelsLessonDataState copy(Status status, boolean expandDisclosure) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new SafetyLabelsLessonDataState(status, expandDisclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetyLabelsLessonDataState)) {
            return false;
        }
        SafetyLabelsLessonDataState safetyLabelsLessonDataState = (SafetyLabelsLessonDataState) other;
        return Intrinsics.areEqual(this.status, safetyLabelsLessonDataState.status) && this.expandDisclosure == safetyLabelsLessonDataState.expandDisclosure;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + Boolean.hashCode(this.expandDisclosure);
    }

    public String toString() {
        return "SafetyLabelsLessonDataState(status=" + this.status + ", expandDisclosure=" + this.expandDisclosure + ")";
    }

    public SafetyLabelsLessonDataState(Status status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.expandDisclosure = z;
    }

    public /* synthetic */ SafetyLabelsLessonDataState(Status status, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Status.Loading.INSTANCE : status, (i & 2) != 0 ? false : z);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    /* compiled from: SafetyLabelsLessonDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Failure;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Loading;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Success;", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Status() {
        }

        /* compiled from: SafetyLabelsLessonDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Loading;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "<init>", "()V", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: SafetyLabelsLessonDataState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Success;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "lesson", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLesson;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLesson;)V", "getLesson", "()Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLesson;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Status {
            public static final int $stable = 8;
            private final SafetyLabelsLesson lesson;

            public static /* synthetic */ Success copy$default(Success success, SafetyLabelsLesson safetyLabelsLesson, int i, Object obj) {
                if ((i & 1) != 0) {
                    safetyLabelsLesson = success.lesson;
                }
                return success.copy(safetyLabelsLesson);
            }

            /* renamed from: component1, reason: from getter */
            public final SafetyLabelsLesson getLesson() {
                return this.lesson;
            }

            public final Success copy(SafetyLabelsLesson lesson) {
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                return new Success(lesson);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.lesson, ((Success) other).lesson);
            }

            public int hashCode() {
                return this.lesson.hashCode();
            }

            public String toString() {
                return "Success(lesson=" + this.lesson + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(SafetyLabelsLesson lesson) {
                super(null);
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                this.lesson = lesson;
            }

            public final SafetyLabelsLesson getLesson() {
                return this.lesson;
            }
        }

        /* compiled from: SafetyLabelsLessonDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status$Failure;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState$Status;", "<init>", "()V", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends Status {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }
    }
}
