package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/GoToNextScreenJob;", "", "job", "Lkotlinx/coroutines/Job;", "currentScreenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "startTimestamp", "", "<init>", "(Lkotlinx/coroutines/Job;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lcom/robinhood/android/optionsupgrade/ScreenRequest;J)V", "getJob", "()Lkotlinx/coroutines/Job;", "getCurrentScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getCurrentScreenRequest", "()Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "getStartTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final /* data */ class GoToNextScreenJob {
    private final ScreenArgs currentScreenArgs;
    private final ScreenRequest currentScreenRequest;
    private final Job job;
    private final long startTimestamp;

    public static /* synthetic */ GoToNextScreenJob copy$default(GoToNextScreenJob goToNextScreenJob, Job job, ScreenArgs screenArgs, ScreenRequest screenRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            job = goToNextScreenJob.job;
        }
        if ((i & 2) != 0) {
            screenArgs = goToNextScreenJob.currentScreenArgs;
        }
        if ((i & 4) != 0) {
            screenRequest = goToNextScreenJob.currentScreenRequest;
        }
        if ((i & 8) != 0) {
            j = goToNextScreenJob.startTimestamp;
        }
        ScreenRequest screenRequest2 = screenRequest;
        return goToNextScreenJob.copy(job, screenArgs, screenRequest2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Job getJob() {
        return this.job;
    }

    /* renamed from: component2, reason: from getter */
    public final ScreenArgs getCurrentScreenArgs() {
        return this.currentScreenArgs;
    }

    /* renamed from: component3, reason: from getter */
    public final ScreenRequest getCurrentScreenRequest() {
        return this.currentScreenRequest;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final GoToNextScreenJob copy(Job job, ScreenArgs currentScreenArgs, ScreenRequest currentScreenRequest, long startTimestamp) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(currentScreenArgs, "currentScreenArgs");
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        return new GoToNextScreenJob(job, currentScreenArgs, currentScreenRequest, startTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoToNextScreenJob)) {
            return false;
        }
        GoToNextScreenJob goToNextScreenJob = (GoToNextScreenJob) other;
        return Intrinsics.areEqual(this.job, goToNextScreenJob.job) && Intrinsics.areEqual(this.currentScreenArgs, goToNextScreenJob.currentScreenArgs) && Intrinsics.areEqual(this.currentScreenRequest, goToNextScreenJob.currentScreenRequest) && this.startTimestamp == goToNextScreenJob.startTimestamp;
    }

    public int hashCode() {
        return (((((this.job.hashCode() * 31) + this.currentScreenArgs.hashCode()) * 31) + this.currentScreenRequest.hashCode()) * 31) + Long.hashCode(this.startTimestamp);
    }

    public String toString() {
        return "GoToNextScreenJob(job=" + this.job + ", currentScreenArgs=" + this.currentScreenArgs + ", currentScreenRequest=" + this.currentScreenRequest + ", startTimestamp=" + this.startTimestamp + ")";
    }

    public GoToNextScreenJob(Job job, ScreenArgs currentScreenArgs, ScreenRequest currentScreenRequest, long j) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(currentScreenArgs, "currentScreenArgs");
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        this.job = job;
        this.currentScreenArgs = currentScreenArgs;
        this.currentScreenRequest = currentScreenRequest;
        this.startTimestamp = j;
    }

    public final Job getJob() {
        return this.job;
    }

    public final ScreenArgs getCurrentScreenArgs() {
        return this.currentScreenArgs;
    }

    public final ScreenRequest getCurrentScreenRequest() {
        return this.currentScreenRequest;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }
}
