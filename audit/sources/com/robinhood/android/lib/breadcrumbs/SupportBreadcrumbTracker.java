package com.robinhood.android.lib.breadcrumbs;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportBreadcrumbTracker.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "<init>", "()V", "breadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "kotlin.jvm.PlatformType", "", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onFragmentCreated", "fm", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentDestroyed", "addBreadcrumb", "breadcrumb", "removeBreadcrumb", "", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "source", "", "currentBreadcrumbs", "", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class SupportBreadcrumbTracker extends FragmentManager.FragmentLifecycleCallbacks implements ActivityLifecycleListener {
    private final Set<SupportBreadcrumb> breadcrumbs = Collections.synchronizedSet(new LinkedHashSet());

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        SupportBreadcrumb breadcrumb;
        Intrinsics.checkNotNullParameter(activity, "activity");
        SupportBreadcrumbTracker2 supportBreadcrumbTracker2 = activity instanceof SupportBreadcrumbTracker2 ? (SupportBreadcrumbTracker2) activity : null;
        if (supportBreadcrumbTracker2 == null || (breadcrumb = supportBreadcrumbTracker2.getBreadcrumb()) == null) {
            return;
        }
        addBreadcrumb(breadcrumb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        SupportBreadcrumb breadcrumb;
        Intrinsics.checkNotNullParameter(activity, "activity");
        SupportBreadcrumbTracker2 supportBreadcrumbTracker2 = activity instanceof SupportBreadcrumbTracker2 ? (SupportBreadcrumbTracker2) activity : null;
        if (supportBreadcrumbTracker2 == null || (breadcrumb = supportBreadcrumbTracker2.getBreadcrumb()) == null) {
            return;
        }
        removeBreadcrumb(breadcrumb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fm, Fragment fragment, Bundle savedInstanceState) {
        SupportBreadcrumb breadcrumb;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SupportBreadcrumbTracker2 supportBreadcrumbTracker2 = fragment instanceof SupportBreadcrumbTracker2 ? (SupportBreadcrumbTracker2) fragment : null;
        if (supportBreadcrumbTracker2 == null || (breadcrumb = supportBreadcrumbTracker2.getBreadcrumb()) == null) {
            return;
        }
        addBreadcrumb(breadcrumb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fm, Fragment fragment) {
        SupportBreadcrumb breadcrumb;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SupportBreadcrumbTracker2 supportBreadcrumbTracker2 = fragment instanceof SupportBreadcrumbTracker2 ? (SupportBreadcrumbTracker2) fragment : null;
        if (supportBreadcrumbTracker2 == null || (breadcrumb = supportBreadcrumbTracker2.getBreadcrumb()) == null) {
            return;
        }
        removeBreadcrumb(breadcrumb);
    }

    public final void addBreadcrumb(SupportBreadcrumb breadcrumb) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        this.breadcrumbs.add(breadcrumb);
    }

    public final boolean removeBreadcrumb(SupportBreadcrumb breadcrumb) {
        boolean zRemove;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Set<SupportBreadcrumb> breadcrumbs = this.breadcrumbs;
        Intrinsics.checkNotNullExpressionValue(breadcrumbs, "breadcrumbs");
        synchronized (breadcrumbs) {
            zRemove = this.breadcrumbs.remove(breadcrumb);
        }
        return zRemove;
    }

    public final boolean removeBreadcrumb(final SupportBreadcrumbType type2) {
        boolean zRemoveAll;
        Intrinsics.checkNotNullParameter(type2, "type");
        Set<SupportBreadcrumb> breadcrumbs = this.breadcrumbs;
        Intrinsics.checkNotNullExpressionValue(breadcrumbs, "breadcrumbs");
        synchronized (breadcrumbs) {
            Set<SupportBreadcrumb> breadcrumbs2 = this.breadcrumbs;
            Intrinsics.checkNotNullExpressionValue(breadcrumbs2, "breadcrumbs");
            zRemoveAll = CollectionsKt.removeAll(breadcrumbs2, new Function1() { // from class: com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SupportBreadcrumbTracker.removeBreadcrumb$lambda$6$lambda$5(type2, (SupportBreadcrumb) obj));
                }
            });
        }
        return zRemoveAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeBreadcrumb$lambda$6$lambda$5(SupportBreadcrumbType supportBreadcrumbType, SupportBreadcrumb supportBreadcrumb) {
        return supportBreadcrumb.getType() == supportBreadcrumbType;
    }

    public final boolean removeBreadcrumb(final String source) {
        boolean zRemoveAll;
        Intrinsics.checkNotNullParameter(source, "source");
        Set<SupportBreadcrumb> breadcrumbs = this.breadcrumbs;
        Intrinsics.checkNotNullExpressionValue(breadcrumbs, "breadcrumbs");
        synchronized (breadcrumbs) {
            Set<SupportBreadcrumb> breadcrumbs2 = this.breadcrumbs;
            Intrinsics.checkNotNullExpressionValue(breadcrumbs2, "breadcrumbs");
            zRemoveAll = CollectionsKt.removeAll(breadcrumbs2, new Function1() { // from class: com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SupportBreadcrumbTracker.removeBreadcrumb$lambda$8$lambda$7(source, (SupportBreadcrumb) obj));
                }
            });
        }
        return zRemoveAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeBreadcrumb$lambda$8$lambda$7(String str, SupportBreadcrumb supportBreadcrumb) {
        return Intrinsics.areEqual(supportBreadcrumb.getSource(), str);
    }

    public final List<SupportBreadcrumb> currentBreadcrumbs() {
        List<SupportBreadcrumb> listReversed;
        Set<SupportBreadcrumb> breadcrumbs = this.breadcrumbs;
        Intrinsics.checkNotNullExpressionValue(breadcrumbs, "breadcrumbs");
        synchronized (breadcrumbs) {
            Set<SupportBreadcrumb> breadcrumbs2 = this.breadcrumbs;
            Intrinsics.checkNotNullExpressionValue(breadcrumbs2, "breadcrumbs");
            listReversed = CollectionsKt.reversed(breadcrumbs2);
        }
        return listReversed;
    }
}
