package com.robinhood.android.lib.pathfinder;

import androidx.lifecycle.ViewModel;
import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderRelay.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRelay;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "eventsRelay", "Lcom/jakewharton/rxrelay2/Relay;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "events", "Lio/reactivex/Observable;", "getEvents", "()Lio/reactivex/Observable;", "emitEvent", "", "event", "emitEvent$lib_pathfinder_externalDebug", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderRelay extends ViewModel {
    public static final int $stable = 8;
    private final Observable<PathfinderEvent> events;
    private final Relay<PathfinderEvent> eventsRelay;

    public PathfinderRelay() {
        PublishRelay publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.eventsRelay = publishRelayCreate;
        Observable observableHide = publishRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.events = observableHide;
    }

    public final Observable<PathfinderEvent> getEvents() {
        return this.events;
    }

    public final void emitEvent$lib_pathfinder_externalDebug(PathfinderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventsRelay.accept(event);
    }
}
