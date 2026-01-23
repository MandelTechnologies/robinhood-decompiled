package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.Attachment;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.gestures.ViewUtils;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.internal.viewhierarchy.ViewHierarchyExporter;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.ViewHierarchy;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.thread.IMainThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes21.dex */
public final class ViewHierarchyEventProcessor implements EventProcessor {
    private final Debouncer debouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 2000, 3);
    private final SentryAndroidOptions options;

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            IntegrationUtils.addIntegrationToSdkVersion((Class<?>) ViewHierarchyEventProcessor.class);
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        ViewHierarchy viewHierarchySnapshotViewHierarchy;
        if (sentryEvent.isErrored()) {
            if (!this.options.isAttachViewHierarchy()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return sentryEvent;
            }
            if (!HintUtils.isFromHybridSdk(hint)) {
                boolean zCheckForDebounce = this.debouncer.checkForDebounce();
                this.options.getBeforeViewHierarchyCaptureCallback();
                if (!zCheckForDebounce && (viewHierarchySnapshotViewHierarchy = snapshotViewHierarchy(CurrentActivityHolder.getInstance().getActivity(), this.options.getViewHierarchyExporters(), this.options.getMainThreadChecker(), this.options.getLogger())) != null) {
                    hint.setViewHierarchy(Attachment.fromViewHierarchy(viewHierarchySnapshotViewHierarchy));
                }
            }
        }
        return sentryEvent;
    }

    public static ViewHierarchy snapshotViewHierarchy(Activity activity, final List<ViewHierarchyExporter> list, IMainThreadChecker iMainThreadChecker, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th;
        if (activity == null) {
            iLogger.log(SentryLevel.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.log(SentryLevel.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.log(SentryLevel.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            iLogger2 = iLogger;
        }
        if (iMainThreadChecker.isMainThread()) {
            try {
                return snapshotViewHierarchy(viewPeekDecorView, list);
            } catch (Throwable th3) {
                th = th3;
                iLogger2 = iLogger;
                iLogger2.log(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
                return null;
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        iLogger2 = iLogger;
        try {
            activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.ViewHierarchyEventProcessor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewHierarchyEventProcessor.$r8$lambda$yi9jbtrjTD1_XPRxLabzLeFjENQ(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                }
            });
            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                return (ViewHierarchy) atomicReference.get();
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            iLogger2.log(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
            return null;
        }
        return null;
    }

    public static /* synthetic */ void $r8$lambda$yi9jbtrjTD1_XPRxLabzLeFjENQ(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(snapshotViewHierarchy(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    public static ViewHierarchy snapshotViewHierarchy(View view, List<ViewHierarchyExporter> list) {
        ArrayList arrayList = new ArrayList(1);
        ViewHierarchy viewHierarchy = new ViewHierarchy("android_view_system", arrayList);
        ViewHierarchyNode viewHierarchyNodeViewToNode = viewToNode(view);
        arrayList.add(viewHierarchyNodeViewToNode);
        addChildren(view, viewHierarchyNodeViewToNode, list);
        return viewHierarchy;
    }

    private static void addChildren(View view, ViewHierarchyNode viewHierarchyNode, List<ViewHierarchyExporter> list) {
        if (view instanceof ViewGroup) {
            Iterator<ViewHierarchyExporter> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().export(viewHierarchyNode, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    ViewHierarchyNode viewHierarchyNodeViewToNode = viewToNode(childAt);
                    arrayList.add(viewHierarchyNodeViewToNode);
                    addChildren(childAt, viewHierarchyNodeViewToNode, list);
                }
            }
            viewHierarchyNode.setChildren(arrayList);
        }
    }

    private static ViewHierarchyNode viewToNode(View view) {
        ViewHierarchyNode viewHierarchyNode = new ViewHierarchyNode();
        viewHierarchyNode.setType(ClassUtil.getClassName(view));
        try {
            viewHierarchyNode.setIdentifier(ViewUtils.getResourceId(view));
        } catch (Throwable unused) {
        }
        viewHierarchyNode.setX(Double.valueOf(view.getX()));
        viewHierarchyNode.setY(Double.valueOf(view.getY()));
        viewHierarchyNode.setWidth(Double.valueOf(view.getWidth()));
        viewHierarchyNode.setHeight(Double.valueOf(view.getHeight()));
        viewHierarchyNode.setAlpha(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            viewHierarchyNode.setVisibility("visible");
        } else if (visibility == 4) {
            viewHierarchyNode.setVisibility("invisible");
        } else if (visibility == 8) {
            viewHierarchyNode.setVisibility("gone");
        }
        return viewHierarchyNode;
    }
}
