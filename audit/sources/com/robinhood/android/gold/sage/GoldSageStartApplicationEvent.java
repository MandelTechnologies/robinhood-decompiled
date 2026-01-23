package com.robinhood.android.gold.sage;

import gold.proto.p464v1.CreateSageApplicationResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageStartApplicationEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent$Failure;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent$Success;", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldSageStartApplicationEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldSageStartApplicationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldSageStartApplicationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent$Success;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent;", "sageApplicationResponse", "Lgold/proto/v1/CreateSageApplicationResponse;", "<init>", "(Lgold/proto/v1/CreateSageApplicationResponse;)V", "getSageApplicationResponse", "()Lgold/proto/v1/CreateSageApplicationResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends GoldSageStartApplicationEvent {
        public static final int $stable = 8;
        private final CreateSageApplicationResponse sageApplicationResponse;

        public static /* synthetic */ Success copy$default(Success success, CreateSageApplicationResponse createSageApplicationResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                createSageApplicationResponse = success.sageApplicationResponse;
            }
            return success.copy(createSageApplicationResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final CreateSageApplicationResponse getSageApplicationResponse() {
            return this.sageApplicationResponse;
        }

        public final Success copy(CreateSageApplicationResponse sageApplicationResponse) {
            Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
            return new Success(sageApplicationResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.sageApplicationResponse, ((Success) other).sageApplicationResponse);
        }

        public int hashCode() {
            return this.sageApplicationResponse.hashCode();
        }

        public String toString() {
            return "Success(sageApplicationResponse=" + this.sageApplicationResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CreateSageApplicationResponse sageApplicationResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
            this.sageApplicationResponse = sageApplicationResponse;
        }

        public final CreateSageApplicationResponse getSageApplicationResponse() {
            return this.sageApplicationResponse;
        }
    }

    private GoldSageStartApplicationEvent() {
    }

    /* compiled from: GoldSageStartApplicationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent$Failure;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends GoldSageStartApplicationEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.error;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failure copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
