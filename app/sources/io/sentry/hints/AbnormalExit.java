package io.sentry.hints;

/* loaded from: classes21.dex */
public interface AbnormalExit {
    boolean ignoreCurrentThread();

    String mechanism();

    Long timestamp();
}
