package com.robinhood.android.sentry;

import com.robinhood.shared.bitdrift.BitdriftCapture;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitdriftIntegration.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/sentry/BitdriftIntegration;", "Lio/sentry/Integration;", "capture", "Lcom/robinhood/shared/bitdrift/BitdriftCapture;", "<init>", "(Lcom/robinhood/shared/bitdrift/BitdriftCapture;)V", "register", "", "hub", "Lio/sentry/IHub;", "options", "Lio/sentry/SentryOptions;", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class BitdriftIntegration implements Integration {
    private final BitdriftCapture capture;

    /* JADX WARN: Multi-variable type inference failed */
    public BitdriftIntegration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BitdriftIntegration(BitdriftCapture capture) {
        Intrinsics.checkNotNullParameter(capture, "capture");
        this.capture = capture;
    }

    public /* synthetic */ BitdriftIntegration(BitdriftCapture bitdriftCapture, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BitdriftCapture.INSTANCE : bitdriftCapture);
    }

    @Override // io.sentry.Integration
    public void register(IHub hub, SentryOptions options) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(options, "options");
        SentryOptions2.addBeforeSendCallback(options, new SentryOptions.BeforeSendCallback() { // from class: com.robinhood.android.sentry.BitdriftIntegration.register.1
            @Override // io.sentry.SentryOptions.BeforeSendCallback
            public final SentryEvent execute(SentryEvent event, Hint hint) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(hint, "<unused var>");
                BitdriftIntegration.this.capture.errorTriggered();
                return event;
            }
        });
    }
}
