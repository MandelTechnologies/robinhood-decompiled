package io.sentry.android.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SentryFragmentLifecycleCallbacks.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0001=B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010\"J1\u0010'\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010*J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010*J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010*J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u00107¨\u0006>"}, m3636d2 = {"Lio/sentry/android/fragment/SentryFragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lio/sentry/IHub;", "hub", "", "Lio/sentry/android/fragment/FragmentLifecycleState;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Lio/sentry/IHub;Ljava/util/Set;Z)V", "Landroidx/fragment/app/Fragment;", "fragment", "state", "", "addBreadcrumb", "(Landroidx/fragment/app/Fragment;Lio/sentry/android/fragment/FragmentLifecycleState;)V", "", "getFragmentName", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "isRunningSpan", "(Landroidx/fragment/app/Fragment;)Z", "startTracing", "(Landroidx/fragment/app/Fragment;)V", "stopTracing", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroid/content/Context;", "context", "onFragmentAttached", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V", "Landroid/os/Bundle;", "outState", "onFragmentSaveInstanceState", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "savedInstanceState", "onFragmentCreated", "Landroid/view/View;", "view", "onFragmentViewCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V", "onFragmentStarted", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "onFragmentResumed", "onFragmentPaused", "onFragmentStopped", "onFragmentViewDestroyed", "onFragmentDestroyed", "onFragmentDetached", "Lio/sentry/IHub;", "Ljava/util/Set;", "getFilterFragmentLifecycleBreadcrumbs", "()Ljava/util/Set;", "Z", "getEnableAutoFragmentLifecycleTracing", "()Z", "Ljava/util/WeakHashMap;", "Lio/sentry/ISpan;", "fragmentsWithOngoingTransactions", "Ljava/util/WeakHashMap;", "isPerformanceEnabled", "Companion", "sentry-android-fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SentryFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    private final boolean enableAutoFragmentLifecycleTracing;
    private final Set<FragmentLifecycleState> filterFragmentLifecycleBreadcrumbs;
    private final WeakHashMap<Fragment, ISpan> fragmentsWithOngoingTransactions;
    private final IHub hub;

    /* JADX WARN: Multi-variable type inference failed */
    public SentryFragmentLifecycleCallbacks(IHub hub, Set<? extends FragmentLifecycleState> filterFragmentLifecycleBreadcrumbs, boolean z) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.hub = hub;
        this.filterFragmentLifecycleBreadcrumbs = filterFragmentLifecycleBreadcrumbs;
        this.enableAutoFragmentLifecycleTracing = z;
        this.fragmentsWithOngoingTransactions = new WeakHashMap<>();
    }

    private final boolean isPerformanceEnabled() {
        return this.hub.getOptions().isTracingEnabled() && this.enableAutoFragmentLifecycleTracing;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, "context");
        addBreadcrumb(fragment, FragmentLifecycleState.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle outState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(outState, "outState");
        addBreadcrumb(fragment, FragmentLifecycleState.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, final Fragment fragment, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.CREATED);
        if (fragment.isAdded()) {
            if (this.hub.getOptions().isEnableScreenTracking()) {
                this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.fragment.SentryFragmentLifecycleCallbacks$$ExternalSyntheticLambda0
                    @Override // io.sentry.ScopeCallback
                    public final void run(IScope iScope) {
                        SentryFragmentLifecycleCallbacks.onFragmentCreated$lambda$2(this.f$0, fragment, iScope);
                    }
                });
            }
            startTracing(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFragmentCreated$lambda$2(SentryFragmentLifecycleCallbacks this$0, Fragment fragment, IScope it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setScreen(this$0.getFragmentName(fragment));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(view, "view");
        addBreadcrumb(fragment, FragmentLifecycleState.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.STARTED);
        stopTracing(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.VIEW_DESTROYED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.DESTROYED);
        stopTracing(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        addBreadcrumb(fragment, FragmentLifecycleState.DETACHED);
    }

    private final void addBreadcrumb(Fragment fragment, FragmentLifecycleState state) {
        if (this.filterFragmentLifecycleBreadcrumbs.contains(state)) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("navigation");
            breadcrumb.setData("state", state.getBreadcrumbName());
            breadcrumb.setData("screen", getFragmentName(fragment));
            breadcrumb.setCategory("ui.fragment.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            Hint hint = new Hint();
            hint.set("android:fragment", fragment);
            this.hub.addBreadcrumb(breadcrumb, hint);
        }
    }

    private final String getFragmentName(Fragment fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "fragment.javaClass.simpleName");
        return simpleName;
    }

    private final boolean isRunningSpan(Fragment fragment) {
        return this.fragmentsWithOngoingTransactions.containsKey(fragment);
    }

    private final void startTracing(Fragment fragment) {
        if (!isPerformanceEnabled() || isRunningSpan(fragment)) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.fragment.SentryFragmentLifecycleCallbacks$$ExternalSyntheticLambda1
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                SentryFragmentLifecycleCallbacks.startTracing$lambda$5(objectRef, iScope);
            }
        });
        String fragmentName = getFragmentName(fragment);
        ISpan iSpan = (ISpan) objectRef.element;
        ISpan iSpanStartChild = iSpan != null ? iSpan.startChild("ui.load", fragmentName) : null;
        if (iSpanStartChild != null) {
            this.fragmentsWithOngoingTransactions.put(fragment, iSpanStartChild);
            iSpanStartChild.getSpanContext().setOrigin("auto.ui.fragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, io.sentry.ITransaction] */
    public static final void startTracing$lambda$5(Ref.ObjectRef transaction, IScope it) {
        Intrinsics.checkNotNullParameter(transaction, "$transaction");
        Intrinsics.checkNotNullParameter(it, "it");
        transaction.element = it.getTransaction();
    }

    private final void stopTracing(Fragment fragment) {
        ISpan iSpan;
        if (isPerformanceEnabled() && isRunningSpan(fragment) && (iSpan = this.fragmentsWithOngoingTransactions.get(fragment)) != null) {
            SpanStatus status = iSpan.getStatus();
            if (status == null) {
                status = SpanStatus.OK;
            }
            iSpan.finish(status);
            this.fragmentsWithOngoingTransactions.remove(fragment);
        }
    }
}
