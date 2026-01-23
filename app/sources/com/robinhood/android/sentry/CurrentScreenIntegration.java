package com.robinhood.android.sentry;

import android.app.Activity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.CurrentActivityHolder;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.thread.IMainThreadChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;

/* compiled from: CurrentScreenIntegration.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/sentry/CurrentScreenIntegration;", "Lio/sentry/Integration;", "<init>", "()V", "EXTRA_NAME", "", "register", "", "hub", "Lio/sentry/IHub;", "options", "Lio/sentry/SentryOptions;", "Processor", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CurrentScreenIntegration implements Integration {
    public static final String EXTRA_NAME = "Current Screen Path";
    public static final CurrentScreenIntegration INSTANCE = new CurrentScreenIntegration();

    private CurrentScreenIntegration() {
    }

    @Override // io.sentry.Integration
    public void register(IHub hub, SentryOptions options) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(options, "options");
        IMainThreadChecker mainThreadChecker = options.getMainThreadChecker();
        Intrinsics.checkNotNullExpressionValue(mainThreadChecker, "getMainThreadChecker(...)");
        ILogger logger = options.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        options.addEventProcessor(new Processor(mainThreadChecker, logger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CurrentScreenIntegration.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0010H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/sentry/CurrentScreenIntegration$Processor;", "Lio/sentry/EventProcessor;", "mainThreadChecker", "Lio/sentry/util/thread/IMainThreadChecker;", "logger", "Lio/sentry/ILogger;", "<init>", "(Lio/sentry/util/thread/IMainThreadChecker;Lio/sentry/ILogger;)V", "process", "Lio/sentry/SentryEvent;", "event", "hint", "Lio/sentry/Hint;", "collectComponentNames", "", "", "Landroid/app/Activity;", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class Processor implements EventProcessor {
        private final ILogger logger;
        private final IMainThreadChecker mainThreadChecker;

        @Override // io.sentry.EventProcessor
        public /* bridge */ /* synthetic */ SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
            return super.process(sentryReplayEvent, hint);
        }

        @Override // io.sentry.EventProcessor
        public /* bridge */ /* synthetic */ SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
            return super.process(sentryTransaction, hint);
        }

        public Processor(IMainThreadChecker mainThreadChecker, ILogger logger) {
            Intrinsics.checkNotNullParameter(mainThreadChecker, "mainThreadChecker");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.mainThreadChecker = mainThreadChecker;
            this.logger = logger;
        }

        @Override // io.sentry.EventProcessor
        public SentryEvent process(SentryEvent event, Hint hint) {
            List<String> listCollectComponentNames;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(hint, "hint");
            final Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity == null) {
                return event;
            }
            try {
                if (this.mainThreadChecker.isMainThread()) {
                    listCollectComponentNames = collectComponentNames(activity);
                } else {
                    final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
                    activity.runOnUiThread(new Runnable() { // from class: com.robinhood.android.sentry.CurrentScreenIntegration$Processor$process$componentNames$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            completableDeferredCompletableDeferred$default.complete(this.collectComponentNames(activity));
                        }
                    });
                    listCollectComponentNames = (List) BuildersKt__BuildersKt.runBlocking$default(null, new CurrentScreenIntegration3(completableDeferredCompletableDeferred$default, null), 1, null);
                }
                event.setExtra(CurrentScreenIntegration.EXTRA_NAME, listCollectComponentNames);
                return event;
            } catch (Exception e) {
                this.logger.log(SentryLevel.ERROR, "Unable to retrieve current screen", e);
                return event;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final List<String> collectComponentNames(Activity activity) {
            PrimaryFragmentHost primaryFragmentHost = activity instanceof PrimaryFragmentHost ? (PrimaryFragmentHost) activity : null;
            ArrayList arrayList = new ArrayList();
            while (primaryFragmentHost != null) {
                arrayList.add(primaryFragmentHost.getClass().getName());
                ActivityResultCaller currentFragment = primaryFragmentHost.getCurrentFragment();
                primaryFragmentHost = currentFragment instanceof PrimaryFragmentHost ? (PrimaryFragmentHost) currentFragment : null;
            }
            return arrayList;
        }
    }
}
