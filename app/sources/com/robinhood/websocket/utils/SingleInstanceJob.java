package com.robinhood.websocket.utils;

import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: SingleInstanceJob.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/websocket/utils/SingleInstanceJob;", "", "<init>", "()V", "runningJob", "Lkotlinx/coroutines/Job;", "setNewJob", "", "newJob", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SingleInstanceJob {
    private Job runningJob;

    public final synchronized void setNewJob(Job newJob) {
        try {
            Job job = this.runningJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.runningJob = newJob;
        } catch (Throwable th) {
            throw th;
        }
    }
}
