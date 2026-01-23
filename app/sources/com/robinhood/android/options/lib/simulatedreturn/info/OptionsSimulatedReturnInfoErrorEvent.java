package com.robinhood.android.options.lib.simulatedreturn.info;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnInfoErrorEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnInfoErrorEvent;", "", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnInfoErrorEvent {
    public static final int $stable = 8;
    private final Throwable error;

    public static /* synthetic */ OptionsSimulatedReturnInfoErrorEvent copy$default(OptionsSimulatedReturnInfoErrorEvent optionsSimulatedReturnInfoErrorEvent, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = optionsSimulatedReturnInfoErrorEvent.error;
        }
        return optionsSimulatedReturnInfoErrorEvent.copy(th);
    }

    /* renamed from: component1, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final OptionsSimulatedReturnInfoErrorEvent copy(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new OptionsSimulatedReturnInfoErrorEvent(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionsSimulatedReturnInfoErrorEvent) && Intrinsics.areEqual(this.error, ((OptionsSimulatedReturnInfoErrorEvent) other).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnInfoErrorEvent(error=" + this.error + ")";
    }

    public OptionsSimulatedReturnInfoErrorEvent(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    public final Throwable getError() {
        return this.error;
    }
}
