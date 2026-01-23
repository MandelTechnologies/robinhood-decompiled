package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes27.dex */
public final class MoreExecutors {
    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }
}
