package com.robinhood.android.retirement.onboarding.outro.invest;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementInvestViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u001c\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState;", "", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "Loading", "Success", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState$Loading;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState$Success;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementInvestViewState {
    UiEvent<? extends RetirementInvestEvent> getEvent();

    /* compiled from: RetirementInvestViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState$Loading;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementInvestViewState {
        public static final int $stable = 8;
        private final UiEvent<? extends RetirementInvestEvent> event;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = loading.event;
            }
            return loading.copy(uiEvent);
        }

        public final UiEvent<? extends RetirementInvestEvent> component1() {
            return this.event;
        }

        public final Loading copy(UiEvent<? extends RetirementInvestEvent> event) {
            return new Loading(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.event, ((Loading) other).event);
        }

        public int hashCode() {
            UiEvent<? extends RetirementInvestEvent> uiEvent = this.event;
            if (uiEvent == null) {
                return 0;
            }
            return uiEvent.hashCode();
        }

        public String toString() {
            return "Loading(event=" + this.event + ")";
        }

        public Loading(UiEvent<? extends RetirementInvestEvent> uiEvent) {
            this.event = uiEvent;
        }

        @Override // com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestViewState
        public UiEvent<? extends RetirementInvestEvent> getEvent() {
            return this.event;
        }
    }

    /* compiled from: RetirementInvestViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\r\u0010\u0014\u001a\u00060\bj\u0002`\tHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00052\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState$Success;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState;", "content", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getContent", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements RetirementInvestViewState {
        public static final int $stable = 8;
        private final RetirementUninvestedViewModel.Modal content;
        private final UiEvent<? extends RetirementInvestEvent> event;
        private final Context loggingContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, RetirementUninvestedViewModel.Modal modal, UiEvent uiEvent, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                modal = success.content;
            }
            if ((i & 2) != 0) {
                uiEvent = success.event;
            }
            if ((i & 4) != 0) {
                context = success.loggingContext;
            }
            return success.copy(modal, uiEvent, context);
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementUninvestedViewModel.Modal getContent() {
            return this.content;
        }

        public final UiEvent<? extends RetirementInvestEvent> component2() {
            return this.event;
        }

        /* renamed from: component3, reason: from getter */
        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        public final Success copy(RetirementUninvestedViewModel.Modal content, UiEvent<? extends RetirementInvestEvent> event, Context loggingContext) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Success(content, event, loggingContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.content, success.content) && Intrinsics.areEqual(this.event, success.event) && Intrinsics.areEqual(this.loggingContext, success.loggingContext);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            UiEvent<? extends RetirementInvestEvent> uiEvent = this.event;
            return ((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.loggingContext.hashCode();
        }

        public String toString() {
            return "Success(content=" + this.content + ", event=" + this.event + ", loggingContext=" + this.loggingContext + ")";
        }

        public Success(RetirementUninvestedViewModel.Modal content, UiEvent<? extends RetirementInvestEvent> uiEvent, Context loggingContext) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.content = content;
            this.event = uiEvent;
            this.loggingContext = loggingContext;
        }

        public final RetirementUninvestedViewModel.Modal getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestViewState
        public UiEvent<? extends RetirementInvestEvent> getEvent() {
            return this.event;
        }

        public final Context getLoggingContext() {
            return this.loggingContext;
        }
    }
}
