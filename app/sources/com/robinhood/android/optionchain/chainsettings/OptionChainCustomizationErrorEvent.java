package com.robinhood.android.optionchain.chainsettings;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationErrorEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "", "<init>", "()V", "OptionServiceDown", "RemovedMetricType", "UnsupportedMetricType", "GenericError", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$GenericError;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$OptionServiceDown;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$RemovedMetricType;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$UnsupportedMetricType;", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class OptionChainCustomizationErrorEvent {
    public static final int $stable = 0;

    public /* synthetic */ OptionChainCustomizationErrorEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionChainCustomizationErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$OptionServiceDown;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "<init>", "()V", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionServiceDown extends OptionChainCustomizationErrorEvent {
        public static final int $stable = 0;
        public static final OptionServiceDown INSTANCE = new OptionServiceDown();

        private OptionServiceDown() {
            super(null);
        }
    }

    private OptionChainCustomizationErrorEvent() {
    }

    /* compiled from: OptionChainCustomizationErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$RemovedMetricType;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "<init>", "()V", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RemovedMetricType extends OptionChainCustomizationErrorEvent {
        public static final int $stable = 0;
        public static final RemovedMetricType INSTANCE = new RemovedMetricType();

        private RemovedMetricType() {
            super(null);
        }
    }

    /* compiled from: OptionChainCustomizationErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$UnsupportedMetricType;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "<init>", "()V", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnsupportedMetricType extends OptionChainCustomizationErrorEvent {
        public static final int $stable = 0;
        public static final UnsupportedMetricType INSTANCE = new UnsupportedMetricType();

        private UnsupportedMetricType() {
            super(null);
        }
    }

    /* compiled from: OptionChainCustomizationErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent$GenericError;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GenericError extends OptionChainCustomizationErrorEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ GenericError copy$default(GenericError genericError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericError.error;
            }
            return genericError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final GenericError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new GenericError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericError) && Intrinsics.areEqual(this.error, ((GenericError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "GenericError(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
