package io.sentry.android.timber;

import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.IntegrationUtils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: SentryTimberIntegration.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lio/sentry/android/timber/SentryTimberIntegration;", "Lio/sentry/Integration;", "Ljava/io/Closeable;", "Lio/sentry/SentryLevel;", "minEventLevel", "minBreadcrumbLevel", "<init>", "(Lio/sentry/SentryLevel;Lio/sentry/SentryLevel;)V", "Lio/sentry/IHub;", "hub", "Lio/sentry/SentryOptions;", "options", "", "register", "(Lio/sentry/IHub;Lio/sentry/SentryOptions;)V", "close", "()V", "Lio/sentry/SentryLevel;", "getMinEventLevel", "()Lio/sentry/SentryLevel;", "getMinBreadcrumbLevel", "Lio/sentry/android/timber/SentryTimberTree;", "tree", "Lio/sentry/android/timber/SentryTimberTree;", "Lio/sentry/ILogger;", "logger", "Lio/sentry/ILogger;", "sentry-android-timber_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SentryTimberIntegration implements Integration, Closeable {
    private ILogger logger;
    private final SentryLevel minBreadcrumbLevel;
    private final SentryLevel minEventLevel;
    private SentryTimberTree tree;

    /* JADX WARN: Multi-variable type inference failed */
    public SentryTimberIntegration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SentryTimberIntegration(SentryLevel minEventLevel, SentryLevel minBreadcrumbLevel) {
        Intrinsics.checkNotNullParameter(minEventLevel, "minEventLevel");
        Intrinsics.checkNotNullParameter(minBreadcrumbLevel, "minBreadcrumbLevel");
        this.minEventLevel = minEventLevel;
        this.minBreadcrumbLevel = minBreadcrumbLevel;
    }

    public /* synthetic */ SentryTimberIntegration(SentryLevel sentryLevel, SentryLevel sentryLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SentryLevel.ERROR : sentryLevel, (i & 2) != 0 ? SentryLevel.INFO : sentryLevel2);
    }

    @Override // io.sentry.Integration
    public void register(IHub hub, SentryOptions options) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(options, "options");
        ILogger logger = options.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "options.logger");
        this.logger = logger;
        SentryTimberTree sentryTimberTree = new SentryTimberTree(hub, this.minEventLevel, this.minBreadcrumbLevel);
        this.tree = sentryTimberTree;
        Timber.plant(sentryTimberTree);
        ILogger iLogger = this.logger;
        if (iLogger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logger");
            iLogger = null;
        }
        iLogger.log(SentryLevel.DEBUG, "SentryTimberIntegration installed.", new Object[0]);
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-timber", "7.14.0");
        IntegrationUtils.addIntegrationToSdkVersion((Class<?>) SentryTimberIntegration.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryTimberTree sentryTimberTree = this.tree;
        if (sentryTimberTree != null) {
            ILogger iLogger = null;
            if (sentryTimberTree == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tree");
                sentryTimberTree = null;
            }
            Timber.uproot(sentryTimberTree);
            ILogger iLogger2 = this.logger;
            if (iLogger2 != null) {
                if (iLogger2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("logger");
                } else {
                    iLogger = iLogger2;
                }
                iLogger.log(SentryLevel.DEBUG, "SentryTimberIntegration removed.", new Object[0]);
            }
        }
    }
}
