package com.robinhood.android.verification.email;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailLinkSentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "", "<init>", "()V", "Initial", "Loading", "Event", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Event;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Initial;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Loading;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class EmailLinkSentViewState {
    public static final int $stable = 0;

    public /* synthetic */ EmailLinkSentViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Initial;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initial extends EmailLinkSentViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    private EmailLinkSentViewState() {
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Loading;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends EmailLinkSentViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: EmailLinkSentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Event;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewStateEvent;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Event extends EmailLinkSentViewState {
        public static final int $stable = 8;
        private final UiEvent<EmailLinkSentViewState2> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(UiEvent<EmailLinkSentViewState2> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<EmailLinkSentViewState2> getEvent() {
            return this.event;
        }
    }
}
