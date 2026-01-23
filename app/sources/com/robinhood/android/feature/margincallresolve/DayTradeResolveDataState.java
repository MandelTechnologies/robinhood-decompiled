package com.robinhood.android.feature.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeResolveState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDataState;", "", "dayTradeCallView", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "throwable", "", "<init>", "(Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;Ljava/lang/Throwable;)V", "getDayTradeCallView", "()Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayTradeResolveDataState {
    public static final int $stable = 8;
    private final ApiDayTradeCallView dayTradeCallView;
    private final Throwable throwable;

    /* JADX WARN: Multi-variable type inference failed */
    public DayTradeResolveDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DayTradeResolveDataState copy$default(DayTradeResolveDataState dayTradeResolveDataState, ApiDayTradeCallView apiDayTradeCallView, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiDayTradeCallView = dayTradeResolveDataState.dayTradeCallView;
        }
        if ((i & 2) != 0) {
            th = dayTradeResolveDataState.throwable;
        }
        return dayTradeResolveDataState.copy(apiDayTradeCallView, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiDayTradeCallView getDayTradeCallView() {
        return this.dayTradeCallView;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final DayTradeResolveDataState copy(ApiDayTradeCallView dayTradeCallView, Throwable throwable) {
        return new DayTradeResolveDataState(dayTradeCallView, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayTradeResolveDataState)) {
            return false;
        }
        DayTradeResolveDataState dayTradeResolveDataState = (DayTradeResolveDataState) other;
        return Intrinsics.areEqual(this.dayTradeCallView, dayTradeResolveDataState.dayTradeCallView) && Intrinsics.areEqual(this.throwable, dayTradeResolveDataState.throwable);
    }

    public int hashCode() {
        ApiDayTradeCallView apiDayTradeCallView = this.dayTradeCallView;
        int iHashCode = (apiDayTradeCallView == null ? 0 : apiDayTradeCallView.hashCode()) * 31;
        Throwable th = this.throwable;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "DayTradeResolveDataState(dayTradeCallView=" + this.dayTradeCallView + ", throwable=" + this.throwable + ")";
    }

    public DayTradeResolveDataState(ApiDayTradeCallView apiDayTradeCallView, Throwable th) {
        this.dayTradeCallView = apiDayTradeCallView;
        this.throwable = th;
    }

    public /* synthetic */ DayTradeResolveDataState(ApiDayTradeCallView apiDayTradeCallView, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiDayTradeCallView, (i & 2) != 0 ? null : th);
    }

    public final ApiDayTradeCallView getDayTradeCallView() {
        return this.dayTradeCallView;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
