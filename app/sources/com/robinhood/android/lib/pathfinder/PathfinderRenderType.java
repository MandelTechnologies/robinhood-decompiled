package com.robinhood.android.lib.pathfinder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PathfinderRenderType.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType;", "", "<init>", "()V", "None", "Initialized", "NativeRendering", "WebRendering", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$Initialized;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$NativeRendering;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$None;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$WebRendering;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class PathfinderRenderType {
    public static final int $stable = 0;

    public /* synthetic */ PathfinderRenderType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PathfinderRenderType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$None;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None extends PathfinderRenderType {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    private PathfinderRenderType() {
    }

    /* compiled from: PathfinderRenderType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$Initialized;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initialized extends PathfinderRenderType {
        public static final int $stable = 0;
        public static final Initialized INSTANCE = new Initialized();

        private Initialized() {
            super(null);
        }
    }

    /* compiled from: PathfinderRenderType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$NativeRendering;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NativeRendering extends PathfinderRenderType {
        public static final int $stable = 0;
        public static final NativeRendering INSTANCE = new NativeRendering();

        private NativeRendering() {
            super(null);
        }
    }

    /* compiled from: PathfinderRenderType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType$WebRendering;", "Lcom/robinhood/android/lib/pathfinder/PathfinderRenderType;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WebRendering extends PathfinderRenderType {
        public static final int $stable = 0;
        public static final WebRendering INSTANCE = new WebRendering();

        private WebRendering() {
            super(null);
        }
    }
}
