package com.robinhood.android.rhymigration.p245ui.agreements;

import androidx.core.text.PrecomputedTextCompat;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyAgreementState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "", "<init>", "()V", "Loading", "AgreementLoaded", "AgreementAcceptanceReported", "Error", "ApplicationSubmitted", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$AgreementAcceptanceReported;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$AgreementLoaded;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$ApplicationSubmitted;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$Error;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$Loading;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RhyAgreementState {
    public static final int $stable = 0;

    public /* synthetic */ RhyAgreementState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: RhyAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$Loading;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends RhyAgreementState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private RhyAgreementState() {
    }

    /* compiled from: RhyAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$AgreementLoaded;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "content", "Lcom/robinhood/udf/UiEvent;", "Landroidx/core/text/PrecomputedTextCompat;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getContent", "()Lcom/robinhood/udf/UiEvent;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AgreementLoaded extends RhyAgreementState {
        public static final int $stable = 8;
        private final UiEvent<PrecomputedTextCompat> content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementLoaded(UiEvent<PrecomputedTextCompat> content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final UiEvent<PrecomputedTextCompat> getContent() {
            return this.content;
        }
    }

    /* compiled from: RhyAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$AgreementAcceptanceReported;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AgreementAcceptanceReported extends RhyAgreementState {
        public static final int $stable = 0;
        public static final AgreementAcceptanceReported INSTANCE = new AgreementAcceptanceReported();

        private AgreementAcceptanceReported() {
            super(null);
        }
    }

    /* compiled from: RhyAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$Error;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "throwable", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getThrowable", "()Lcom/robinhood/udf/UiEvent;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends RhyAgreementState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UiEvent<Throwable> throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final UiEvent<Throwable> getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: RhyAgreementState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState$ApplicationSubmitted;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "isSubmittingApplication", "", "applicationError", "Lcom/robinhood/udf/UiEvent;", "", "proceedToOpenAccountPolling", "", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getApplicationError", "()Lcom/robinhood/udf/UiEvent;", "getProceedToOpenAccountPolling", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApplicationSubmitted extends RhyAgreementState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> applicationError;
        private final boolean isSubmittingApplication;
        private final UiEvent<Unit> proceedToOpenAccountPolling;

        public ApplicationSubmitted() {
            this(false, null, null, 7, null);
        }

        public /* synthetic */ ApplicationSubmitted(boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2);
        }

        /* renamed from: isSubmittingApplication, reason: from getter */
        public final boolean getIsSubmittingApplication() {
            return this.isSubmittingApplication;
        }

        public final UiEvent<Throwable> getApplicationError() {
            return this.applicationError;
        }

        public final UiEvent<Unit> getProceedToOpenAccountPolling() {
            return this.proceedToOpenAccountPolling;
        }

        public ApplicationSubmitted(boolean z, UiEvent<Throwable> uiEvent, UiEvent<Unit> uiEvent2) {
            super(null);
            this.isSubmittingApplication = z;
            this.applicationError = uiEvent;
            this.proceedToOpenAccountPolling = uiEvent2;
        }
    }
}
