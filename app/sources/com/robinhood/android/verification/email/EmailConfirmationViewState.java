package com.robinhood.android.verification.email;

import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "", "<init>", "()V", "Initial", "Loading", "LinkSentOrError", "VerificationWorkflow", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$Initial;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$LinkSentOrError;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$Loading;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$VerificationWorkflow;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class EmailConfirmationViewState {
    public static final int $stable = 0;

    public /* synthetic */ EmailConfirmationViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmailConfirmationViewState() {
    }

    /* compiled from: EmailConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationViewState$Initial;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initial extends EmailConfirmationViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* compiled from: EmailConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationViewState$Loading;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends EmailConfirmationViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: EmailConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationViewState$LinkSentOrError;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LinkSentOrError extends EmailConfirmationViewState {
        public static final int $stable = 8;
        private final UiEvent<Either<String, Throwable>> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkSentOrError(UiEvent<Either<String, Throwable>> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Either<String, Throwable>> getEvent() {
            return this.event;
        }
    }

    /* compiled from: EmailConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationViewState$VerificationWorkflow;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerificationWorkflow extends EmailConfirmationViewState {
        public static final int $stable = 8;
        private final UiEvent<Tuples2<UUID, Boolean>> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationWorkflow(UiEvent<Tuples2<UUID, Boolean>> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Tuples2<UUID, Boolean>> getEvent() {
            return this.event;
        }
    }
}
