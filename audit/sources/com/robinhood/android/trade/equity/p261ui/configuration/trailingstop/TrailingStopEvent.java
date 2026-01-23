package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopViewState;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrailingStopEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent;", "", "ClearInputEvent", "ValidationResultEvent", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent$ClearInputEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent$ValidationResultEvent;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TrailingStopEvent {

    /* compiled from: TrailingStopEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent$ClearInputEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent;", "eventContext", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEventContext", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClearInputEvent implements TrailingStopEvent {
        public static final int $stable = 8;
        private final UiEvent<Unit> eventContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClearInputEvent copy$default(ClearInputEvent clearInputEvent, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = clearInputEvent.eventContext;
            }
            return clearInputEvent.copy(uiEvent);
        }

        public final UiEvent<Unit> component1() {
            return this.eventContext;
        }

        public final ClearInputEvent copy(UiEvent<Unit> eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new ClearInputEvent(eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClearInputEvent) && Intrinsics.areEqual(this.eventContext, ((ClearInputEvent) other).eventContext);
        }

        public int hashCode() {
            return this.eventContext.hashCode();
        }

        public String toString() {
            return "ClearInputEvent(eventContext=" + this.eventContext + ")";
        }

        public ClearInputEvent(UiEvent<Unit> eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.eventContext = eventContext;
        }

        public final UiEvent<Unit> getEventContext() {
            return this.eventContext;
        }
    }

    /* compiled from: TrailingStopEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent$ValidationResultEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent;", "eventContext", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEventContext", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationResultEvent implements TrailingStopEvent {
        public static final int $stable = 8;
        private final UiEvent<TrailingStopViewState.ValidationResult> eventContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationResultEvent copy$default(ValidationResultEvent validationResultEvent, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = validationResultEvent.eventContext;
            }
            return validationResultEvent.copy(uiEvent);
        }

        public final UiEvent<TrailingStopViewState.ValidationResult> component1() {
            return this.eventContext;
        }

        public final ValidationResultEvent copy(UiEvent<TrailingStopViewState.ValidationResult> eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new ValidationResultEvent(eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationResultEvent) && Intrinsics.areEqual(this.eventContext, ((ValidationResultEvent) other).eventContext);
        }

        public int hashCode() {
            return this.eventContext.hashCode();
        }

        public String toString() {
            return "ValidationResultEvent(eventContext=" + this.eventContext + ")";
        }

        public ValidationResultEvent(UiEvent<TrailingStopViewState.ValidationResult> eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.eventContext = eventContext;
        }

        public final UiEvent<TrailingStopViewState.ValidationResult> getEventContext() {
            return this.eventContext;
        }
    }
}
