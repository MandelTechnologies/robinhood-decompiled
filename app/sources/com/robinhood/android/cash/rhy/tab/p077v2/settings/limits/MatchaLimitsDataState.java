package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import com.robinhood.android.models.matcha.api.ApiUserLimits;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaLimitsDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDataState;", "", "limits", "Lcom/robinhood/android/models/matcha/api/ApiUserLimits;", "throwable", "", "<init>", "(Lcom/robinhood/android/models/matcha/api/ApiUserLimits;Ljava/lang/Throwable;)V", "getLimits", "()Lcom/robinhood/android/models/matcha/api/ApiUserLimits;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MatchaLimitsDataState {
    public static final int $stable = 8;
    private final ApiUserLimits limits;
    private final Throwable throwable;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaLimitsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MatchaLimitsDataState copy$default(MatchaLimitsDataState matchaLimitsDataState, ApiUserLimits apiUserLimits, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiUserLimits = matchaLimitsDataState.limits;
        }
        if ((i & 2) != 0) {
            th = matchaLimitsDataState.throwable;
        }
        return matchaLimitsDataState.copy(apiUserLimits, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiUserLimits getLimits() {
        return this.limits;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final MatchaLimitsDataState copy(ApiUserLimits limits, Throwable throwable) {
        return new MatchaLimitsDataState(limits, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaLimitsDataState)) {
            return false;
        }
        MatchaLimitsDataState matchaLimitsDataState = (MatchaLimitsDataState) other;
        return Intrinsics.areEqual(this.limits, matchaLimitsDataState.limits) && Intrinsics.areEqual(this.throwable, matchaLimitsDataState.throwable);
    }

    public int hashCode() {
        ApiUserLimits apiUserLimits = this.limits;
        int iHashCode = (apiUserLimits == null ? 0 : apiUserLimits.hashCode()) * 31;
        Throwable th = this.throwable;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "MatchaLimitsDataState(limits=" + this.limits + ", throwable=" + this.throwable + ")";
    }

    public MatchaLimitsDataState(ApiUserLimits apiUserLimits, Throwable th) {
        this.limits = apiUserLimits;
        this.throwable = th;
    }

    public /* synthetic */ MatchaLimitsDataState(ApiUserLimits apiUserLimits, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiUserLimits, (i & 2) != 0 ? null : th);
    }

    public final ApiUserLimits getLimits() {
        return this.limits;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
