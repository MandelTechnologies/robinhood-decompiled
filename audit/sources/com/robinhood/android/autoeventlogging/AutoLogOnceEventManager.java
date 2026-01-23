package com.robinhood.android.autoeventlogging;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoLogOnceEventManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/AutoLogOnceEventManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "hostFragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "loggedEventIds", "", "", "isLogged", "", "identifier", "markAsLogged", "clear", "", "onStop", "owner", "Landroidx/lifecycle/LifecycleOwner;", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AutoLogOnceEventManager implements DefaultLifecycleObserver {
    private final Set<String> loggedEventIds;

    public AutoLogOnceEventManager(Fragment hostFragment) {
        Intrinsics.checkNotNullParameter(hostFragment, "hostFragment");
        hostFragment.getLifecycle().addObserver(this);
        this.loggedEventIds = new LinkedHashSet();
    }

    public final boolean isLogged(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.loggedEventIds.contains(identifier);
    }

    public final boolean markAsLogged(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.loggedEventIds.add(identifier);
    }

    private final void clear() {
        this.loggedEventIds.clear();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        clear();
    }
}
