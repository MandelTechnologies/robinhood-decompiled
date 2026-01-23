package com.robinhood.android.sentry;

import android.app.Application;
import com.robinhood.shared.app.type.AppType;
import io.sentry.Integration;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroid;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.timber.SentryTimberIntegration;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;

/* compiled from: InitializeSentry.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\u0004*\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"SENTRY_DSN", "", "CRASH_STORE_DIRECTORY_NAME", "initializeSentry", "", "application", "Landroid/app/Application;", "configureTimber", "Lio/sentry/android/core/SentryAndroidOptions;", "lib-sentry_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.sentry.InitializeSentryKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class InitializeSentry {
    private static final String CRASH_STORE_DIRECTORY_NAME = "rh_crash_store";
    public static final String SENTRY_DSN = "https://62485786a6d0457ea6cdfe1aded64fef@o62437.ingest.sentry.io/1471680";

    public static final void initializeSentry(final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SentryAndroid.init(application, (Sentry.OptionsConfiguration<SentryAndroidOptions>) new Sentry.OptionsConfiguration() { // from class: com.robinhood.android.sentry.InitializeSentryKt.initializeSentry.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryAndroidOptions options) {
                Intrinsics.checkNotNullParameter(options, "options");
                InitializeSentry.configureTimber(options);
                options.setDiagnosticLevel(SentryLevel.INFO);
                options.setDsn(InitializeSentry.SENTRY_DSN);
                options.setEnvironment("production");
                options.setTag("app.type", AppType.INSTANCE.from(application).name());
                options.addIntegration(CurrentScreenIntegration.INSTANCE);
                options.addIntegration(new BitdriftIntegration(null, 1, 0 == true ? 1 : 0));
                CoroutineDispatcher io2 = Dispatchers.getIO();
                FileSystem fileSystem = FileSystem.SYSTEM;
                Path.Companion companion = Path.INSTANCE;
                File cacheDir = application.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                options.addIntegration(new CrashStore2(io2, fileSystem, Path.Companion.get$default(companion, cacheDir, false, 1, (Object) null).resolve(InitializeSentry.CRASH_STORE_DIRECTORY_NAME)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTimber(SentryAndroidOptions sentryAndroidOptions) {
        List<Integration> integrations = sentryAndroidOptions.getIntegrations();
        Intrinsics.checkNotNullExpressionValue(integrations, "getIntegrations(...)");
        CollectionsKt.removeAll((List) integrations, new Function1() { // from class: com.robinhood.android.sentry.InitializeSentryKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InitializeSentry.configureTimber$lambda$0((Integration) obj));
            }
        });
        sentryAndroidOptions.addIntegration(new SentryTimberIntegration(SentryLevel.FATAL, SentryLevel.INFO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureTimber$lambda$0(Integration integration) {
        return integration instanceof SentryTimberIntegration;
    }
}
