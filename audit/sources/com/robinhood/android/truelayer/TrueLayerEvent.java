package com.robinhood.android.truelayer;

import kotlin.Metadata;

/* compiled from: TrueLayerEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent;", "", "Initializing", "Initialized", "OpenedFlow", "Succeeded", "Failure", "Lcom/robinhood/android/truelayer/TrueLayerEvent$Failure;", "Lcom/robinhood/android/truelayer/TrueLayerEvent$Initialized;", "Lcom/robinhood/android/truelayer/TrueLayerEvent$Initializing;", "Lcom/robinhood/android/truelayer/TrueLayerEvent$OpenedFlow;", "Lcom/robinhood/android/truelayer/TrueLayerEvent$Succeeded;", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TrueLayerEvent {

    /* compiled from: TrueLayerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent$Initializing;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "<init>", "()V", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initializing implements TrueLayerEvent {
        public static final Initializing INSTANCE = new Initializing();

        private Initializing() {
        }
    }

    /* compiled from: TrueLayerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent$Initialized;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "<init>", "()V", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initialized implements TrueLayerEvent {
        public static final Initialized INSTANCE = new Initialized();

        private Initialized() {
        }
    }

    /* compiled from: TrueLayerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent$OpenedFlow;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "<init>", "()V", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OpenedFlow implements TrueLayerEvent {
        public static final OpenedFlow INSTANCE = new OpenedFlow();

        private OpenedFlow() {
        }
    }

    /* compiled from: TrueLayerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent$Succeeded;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "<init>", "()V", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Succeeded implements TrueLayerEvent {
        public static final Succeeded INSTANCE = new Succeeded();

        private Succeeded() {
        }
    }

    /* compiled from: TrueLayerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerEvent$Failure;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "<init>", "()V", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements TrueLayerEvent {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
        }
    }
}
