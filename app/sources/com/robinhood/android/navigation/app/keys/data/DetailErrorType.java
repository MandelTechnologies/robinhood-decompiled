package com.robinhood.android.navigation.app.keys.data;

import com.robinhood.recurring.models.TradeSkippedReason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DetailErrorType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "", "<init>", "()V", "RecurringPausedError", "AchTransferDetailError", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType$AchTransferDetailError;", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType$RecurringPausedError;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class DetailErrorType {
    public /* synthetic */ DetailErrorType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DetailErrorType() {
    }

    /* compiled from: DetailErrorType.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType$RecurringPausedError;", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "tradeSkippedReason", "Lcom/robinhood/recurring/models/TradeSkippedReason;", "<init>", "(Lcom/robinhood/recurring/models/TradeSkippedReason;)V", "getTradeSkippedReason", "()Lcom/robinhood/recurring/models/TradeSkippedReason;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringPausedError extends DetailErrorType {
        private final TradeSkippedReason tradeSkippedReason;

        public final TradeSkippedReason getTradeSkippedReason() {
            return this.tradeSkippedReason;
        }

        public RecurringPausedError(TradeSkippedReason tradeSkippedReason) {
            super(null);
            this.tradeSkippedReason = tradeSkippedReason;
        }
    }

    /* compiled from: DetailErrorType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType$AchTransferDetailError;", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AchTransferDetailError extends DetailErrorType {
        public static final AchTransferDetailError INSTANCE = new AchTransferDetailError();

        private AchTransferDetailError() {
            super(null);
        }
    }
}
