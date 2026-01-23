package com.robinhood.android.feature.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeResolveState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "", "<init>", "()V", "Loading", "InDayTradeCall", "NotInDayTradeCall", "Error", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$Error;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$InDayTradeCall;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$Loading;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$NotInDayTradeCall;", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class DayTradeResolveState3 {
    public static final int $stable = 0;

    public /* synthetic */ DayTradeResolveState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DayTradeResolveState3() {
    }

    /* compiled from: DayTradeResolveState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$Loading;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveViewState$Loading */
    public static final /* data */ class Loading extends DayTradeResolveState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 395260688;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: DayTradeResolveState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$InDayTradeCall;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "view", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "<init>", "(Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;)V", "getView", "()Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveViewState$InDayTradeCall, reason: from toString */
    public static final /* data */ class InDayTradeCall extends DayTradeResolveState3 {
        public static final int $stable = 8;
        private final ApiDayTradeCallView view;

        public static /* synthetic */ InDayTradeCall copy$default(InDayTradeCall inDayTradeCall, ApiDayTradeCallView apiDayTradeCallView, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDayTradeCallView = inDayTradeCall.view;
            }
            return inDayTradeCall.copy(apiDayTradeCallView);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDayTradeCallView getView() {
            return this.view;
        }

        public final InDayTradeCall copy(ApiDayTradeCallView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new InDayTradeCall(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InDayTradeCall) && Intrinsics.areEqual(this.view, ((InDayTradeCall) other).view);
        }

        public int hashCode() {
            return this.view.hashCode();
        }

        public String toString() {
            return "InDayTradeCall(view=" + this.view + ")";
        }

        public final ApiDayTradeCallView getView() {
            return this.view;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InDayTradeCall(ApiDayTradeCallView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }
    }

    /* compiled from: DayTradeResolveState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$NotInDayTradeCall;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "view", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "<init>", "(Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;)V", "getView", "()Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveViewState$NotInDayTradeCall, reason: from toString */
    public static final /* data */ class NotInDayTradeCall extends DayTradeResolveState3 {
        public static final int $stable = 8;
        private final ApiDayTradeCallView view;

        public static /* synthetic */ NotInDayTradeCall copy$default(NotInDayTradeCall notInDayTradeCall, ApiDayTradeCallView apiDayTradeCallView, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDayTradeCallView = notInDayTradeCall.view;
            }
            return notInDayTradeCall.copy(apiDayTradeCallView);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDayTradeCallView getView() {
            return this.view;
        }

        public final NotInDayTradeCall copy(ApiDayTradeCallView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new NotInDayTradeCall(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotInDayTradeCall) && Intrinsics.areEqual(this.view, ((NotInDayTradeCall) other).view);
        }

        public int hashCode() {
            return this.view.hashCode();
        }

        public String toString() {
            return "NotInDayTradeCall(view=" + this.view + ")";
        }

        public final ApiDayTradeCallView getView() {
            return this.view;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotInDayTradeCall(ApiDayTradeCallView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }
    }

    /* compiled from: DayTradeResolveState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState$Error;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveViewState$Error, reason: from toString */
    public static final /* data */ class Error extends DayTradeResolveState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
