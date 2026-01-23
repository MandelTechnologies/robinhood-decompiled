package com.robinhood.shared.history;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryLoaderV2.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryLoaderV2;", "", "callbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "supportedApps", "", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/shared/history/HistoryLoader$Callbacks;Ljava/util/Set;)V", "getCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getSupportedApps", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HistoryLoaderV2 {
    public static final int $stable = 8;
    private final HistoryLoader.Callbacks<HistoryEvent> callbacks;
    private final Set<AppType> supportedApps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryLoaderV2 copy$default(HistoryLoaderV2 historyLoaderV2, HistoryLoader.Callbacks callbacks, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            callbacks = historyLoaderV2.callbacks;
        }
        if ((i & 2) != 0) {
            set = historyLoaderV2.supportedApps;
        }
        return historyLoaderV2.copy(callbacks, set);
    }

    public final HistoryLoader.Callbacks<HistoryEvent> component1() {
        return this.callbacks;
    }

    public final Set<AppType> component2() {
        return this.supportedApps;
    }

    public final HistoryLoaderV2 copy(HistoryLoader.Callbacks<? extends HistoryEvent> callbacks, Set<? extends AppType> supportedApps) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(supportedApps, "supportedApps");
        return new HistoryLoaderV2(callbacks, supportedApps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryLoaderV2)) {
            return false;
        }
        HistoryLoaderV2 historyLoaderV2 = (HistoryLoaderV2) other;
        return Intrinsics.areEqual(this.callbacks, historyLoaderV2.callbacks) && Intrinsics.areEqual(this.supportedApps, historyLoaderV2.supportedApps);
    }

    public int hashCode() {
        return (this.callbacks.hashCode() * 31) + this.supportedApps.hashCode();
    }

    public String toString() {
        return "HistoryLoaderV2(callbacks=" + this.callbacks + ", supportedApps=" + this.supportedApps + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryLoaderV2(HistoryLoader.Callbacks<? extends HistoryEvent> callbacks, Set<? extends AppType> supportedApps) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(supportedApps, "supportedApps");
        this.callbacks = callbacks;
        this.supportedApps = supportedApps;
    }

    public final HistoryLoader.Callbacks<HistoryEvent> getCallbacks() {
        return this.callbacks;
    }

    public final Set<AppType> getSupportedApps() {
        return this.supportedApps;
    }
}
