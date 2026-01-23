package com.robinhood.android.equities.equityscreener.crud.create;

import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateScreenerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "", "Loading", "Ready", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState$Loading;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState$Ready;", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface CreateScreenerViewState {

    /* compiled from: CreateScreenerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState$Loading;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "<init>", "()V", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements CreateScreenerViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: CreateScreenerViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState$Ready;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "presets", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "<init>", "(Ljava/util/List;)V", "getPresets", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements CreateScreenerViewState {
        public static final int $stable = 8;
        private final List<Screener> presets;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ready.presets;
            }
            return ready.copy(list);
        }

        public final List<Screener> component1() {
            return this.presets;
        }

        public final Ready copy(List<Screener> presets) {
            Intrinsics.checkNotNullParameter(presets, "presets");
            return new Ready(presets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.presets, ((Ready) other).presets);
        }

        public int hashCode() {
            return this.presets.hashCode();
        }

        public String toString() {
            return "Ready(presets=" + this.presets + ")";
        }

        public Ready(List<Screener> presets) {
            Intrinsics.checkNotNullParameter(presets, "presets");
            this.presets = presets;
        }

        public final List<Screener> getPresets() {
            return this.presets;
        }
    }
}
