package com.robinhood.android.gold.downgrade;

import com.robinhood.android.gold.subscription.api.ApiGoldDowngradeConfirmation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDowngradeSubmissionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent$Failure;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent$Success;", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldDowngradeSubmissionEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldDowngradeSubmissionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldDowngradeSubmissionEvent() {
    }

    /* compiled from: GoldDowngradeSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent$Success;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent;", "goldDowngradeConfirmation", "Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "<init>", "(Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;)V", "getGoldDowngradeConfirmation", "()Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends GoldDowngradeSubmissionEvent {
        public static final int $stable = 8;
        private final ApiGoldDowngradeConfirmation goldDowngradeConfirmation;

        public static /* synthetic */ Success copy$default(Success success, ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldDowngradeConfirmation = success.goldDowngradeConfirmation;
            }
            return success.copy(apiGoldDowngradeConfirmation);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldDowngradeConfirmation getGoldDowngradeConfirmation() {
            return this.goldDowngradeConfirmation;
        }

        public final Success copy(ApiGoldDowngradeConfirmation goldDowngradeConfirmation) {
            return new Success(goldDowngradeConfirmation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.goldDowngradeConfirmation, ((Success) other).goldDowngradeConfirmation);
        }

        public int hashCode() {
            ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation = this.goldDowngradeConfirmation;
            if (apiGoldDowngradeConfirmation == null) {
                return 0;
            }
            return apiGoldDowngradeConfirmation.hashCode();
        }

        public String toString() {
            return "Success(goldDowngradeConfirmation=" + this.goldDowngradeConfirmation + ")";
        }

        public final ApiGoldDowngradeConfirmation getGoldDowngradeConfirmation() {
            return this.goldDowngradeConfirmation;
        }

        public Success(ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation) {
            super(null);
            this.goldDowngradeConfirmation = apiGoldDowngradeConfirmation;
        }
    }

    /* compiled from: GoldDowngradeSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent$Failure;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends GoldDowngradeSubmissionEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
