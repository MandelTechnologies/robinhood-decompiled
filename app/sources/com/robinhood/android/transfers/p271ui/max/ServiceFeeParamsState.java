package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceFeeParamsState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "", "<init>", "()V", "isLoading", "", "()Z", "None", "Error", "Loaded", "Loading", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Error;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Loaded;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Loading;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$None;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class ServiceFeeParamsState {
    public static final int $stable = 0;
    private final boolean isLoading;

    public /* synthetic */ ServiceFeeParamsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ServiceFeeParamsState() {
    }

    /* renamed from: isLoading, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    /* compiled from: ServiceFeeParamsState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$None;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None extends ServiceFeeParamsState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* compiled from: ServiceFeeParamsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Error;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "throwableEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getThrowableEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends ServiceFeeParamsState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> throwableEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UiEvent<Throwable> throwableEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(throwableEvent, "throwableEvent");
            this.throwableEvent = throwableEvent;
        }

        public final UiEvent<Throwable> getThrowableEvent() {
            return this.throwableEvent;
        }
    }

    /* compiled from: ServiceFeeParamsState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Loaded;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "apiServiceFeeParams", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;)V", "getApiServiceFeeParams", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends ServiceFeeParamsState {
        public static final int $stable = 8;
        private final ApiServiceFeeParams apiServiceFeeParams;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiServiceFeeParams apiServiceFeeParams, int i, Object obj) {
            if ((i & 1) != 0) {
                apiServiceFeeParams = loaded.apiServiceFeeParams;
            }
            return loaded.copy(apiServiceFeeParams);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiServiceFeeParams getApiServiceFeeParams() {
            return this.apiServiceFeeParams;
        }

        public final Loaded copy(ApiServiceFeeParams apiServiceFeeParams) {
            Intrinsics.checkNotNullParameter(apiServiceFeeParams, "apiServiceFeeParams");
            return new Loaded(apiServiceFeeParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.apiServiceFeeParams, ((Loaded) other).apiServiceFeeParams);
        }

        public int hashCode() {
            return this.apiServiceFeeParams.hashCode();
        }

        public String toString() {
            return "Loaded(apiServiceFeeParams=" + this.apiServiceFeeParams + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiServiceFeeParams apiServiceFeeParams) {
            super(null);
            Intrinsics.checkNotNullParameter(apiServiceFeeParams, "apiServiceFeeParams");
            this.apiServiceFeeParams = apiServiceFeeParams;
        }

        public final ApiServiceFeeParams getApiServiceFeeParams() {
            return this.apiServiceFeeParams;
        }
    }

    /* compiled from: ServiceFeeParamsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState$Loading;", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "<init>", "()V", "isLoading", "", "()Z", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ServiceFeeParamsState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static final boolean isLoading = true;

        private Loading() {
            super(null);
        }

        @Override // com.robinhood.android.transfers.p271ui.max.ServiceFeeParamsState
        /* renamed from: isLoading */
        public boolean getIsLoading() {
            return isLoading;
        }
    }
}
