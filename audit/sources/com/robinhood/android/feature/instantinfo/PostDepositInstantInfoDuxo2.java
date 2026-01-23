package com.robinhood.android.feature.instantinfo;

import com.robinhood.models.api.bonfire.instantinfo.ApiPostDepositInstantInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostDepositInstantInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Error;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Loading;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Success;", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class PostDepositInstantInfoDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ PostDepositInstantInfoDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PostDepositInstantInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Loading;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "<init>", "()V", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoState$Loading */
    public static final class Loading extends PostDepositInstantInfoDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private PostDepositInstantInfoDuxo2() {
    }

    /* compiled from: PostDepositInstantInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Success;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "payload", "Lcom/robinhood/models/api/bonfire/instantinfo/ApiPostDepositInstantInfoResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/instantinfo/ApiPostDepositInstantInfoResponse;)V", "getPayload", "()Lcom/robinhood/models/api/bonfire/instantinfo/ApiPostDepositInstantInfoResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoState$Success, reason: from toString */
    public static final /* data */ class Success extends PostDepositInstantInfoDuxo2 {
        public static final int $stable = 8;
        private final ApiPostDepositInstantInfoResponse payload;

        public static /* synthetic */ Success copy$default(Success success, ApiPostDepositInstantInfoResponse apiPostDepositInstantInfoResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiPostDepositInstantInfoResponse = success.payload;
            }
            return success.copy(apiPostDepositInstantInfoResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiPostDepositInstantInfoResponse getPayload() {
            return this.payload;
        }

        public final Success copy(ApiPostDepositInstantInfoResponse payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Success(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.payload, ((Success) other).payload);
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "Success(payload=" + this.payload + ")";
        }

        public final ApiPostDepositInstantInfoResponse getPayload() {
            return this.payload;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ApiPostDepositInstantInfoResponse payload) {
            super(null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }
    }

    /* compiled from: PostDepositInstantInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState$Error;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoState$Error, reason: from toString */
    public static final /* data */ class Error extends PostDepositInstantInfoDuxo2 {
        public static final int $stable = 8;
        private final Throwable exception;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Error copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        public final Throwable getException() {
            return this.exception;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }
    }
}
