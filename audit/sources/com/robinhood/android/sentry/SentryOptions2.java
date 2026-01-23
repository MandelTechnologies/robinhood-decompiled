package com.robinhood.android.sentry;

import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SentryOptions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"addBeforeSendCallback", "", "Lio/sentry/SentryOptions;", "newCallback", "Lio/sentry/SentryOptions$BeforeSendCallback;", "lib-sentry_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.sentry.SentryOptionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SentryOptions2 {
    public static final void addBeforeSendCallback(SentryOptions sentryOptions, final SentryOptions.BeforeSendCallback newCallback) {
        Intrinsics.checkNotNullParameter(sentryOptions, "<this>");
        Intrinsics.checkNotNullParameter(newCallback, "newCallback");
        final SentryOptions.BeforeSendCallback beforeSend = sentryOptions.getBeforeSend();
        if (beforeSend != null) {
            newCallback = new SentryOptions.BeforeSendCallback() { // from class: com.robinhood.android.sentry.SentryOptionsKt.addBeforeSendCallback.1
                @Override // io.sentry.SentryOptions.BeforeSendCallback
                public final SentryEvent execute(SentryEvent event, Hint hint) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    Intrinsics.checkNotNullParameter(hint, "hint");
                    SentryEvent sentryEventExecute = beforeSend.execute(event, hint);
                    if (sentryEventExecute != null) {
                        return newCallback.execute(sentryEventExecute, hint);
                    }
                    return null;
                }
            };
        }
        sentryOptions.setBeforeSend(newCallback);
    }
}
