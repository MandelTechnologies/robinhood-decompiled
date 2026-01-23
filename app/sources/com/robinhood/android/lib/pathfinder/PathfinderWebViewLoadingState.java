package com.robinhood.android.lib.pathfinder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PathfinderWebViewLoadingState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState;", "", "<init>", "()V", "LoadingState", "LoadedState", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState$LoadedState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState$LoadingState;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class PathfinderWebViewLoadingState {
    public static final int $stable = 0;

    public /* synthetic */ PathfinderWebViewLoadingState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PathfinderWebViewLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState$LoadingState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingState extends PathfinderWebViewLoadingState {
        public static final int $stable = 0;
        public static final LoadingState INSTANCE = new LoadingState();

        private LoadingState() {
            super(null);
        }
    }

    private PathfinderWebViewLoadingState() {
    }

    /* compiled from: PathfinderWebViewLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState$LoadedState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewLoadingState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadedState extends PathfinderWebViewLoadingState {
        public static final int $stable = 0;
        public static final LoadedState INSTANCE = new LoadedState();

        private LoadedState() {
            super(null);
        }
    }
}
