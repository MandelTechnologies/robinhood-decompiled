package com.robinhood.shared.stepupverification.identityverification;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityVerificationInitiateViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "", "<init>", "()V", "isLoggedIn", "", "()Z", "showErrorView", "getShowErrorView", "showLoadingView", "getShowLoadingView", "Initial", "InputError", "UnknownError", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$Initial;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$InputError;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$UnknownError;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class IdentityVerificationInitiateViewState {
    public static final int $stable = 0;

    public /* synthetic */ IdentityVerificationInitiateViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: isLoggedIn */
    public abstract boolean getIsLoggedIn();

    private IdentityVerificationInitiateViewState() {
    }

    /* compiled from: IdentityVerificationInitiateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$Initial;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "isLoggedIn", "", "<init>", "(Z)V", "()Z", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Initial extends IdentityVerificationInitiateViewState {
        public static final int $stable = 0;
        private final boolean isLoggedIn;

        public Initial(boolean z) {
            super(null);
            this.isLoggedIn = z;
        }

        @Override // com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateViewState
        /* renamed from: isLoggedIn, reason: from getter */
        public boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }
    }

    /* compiled from: IdentityVerificationInitiateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$InputError;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "verificationSuccess", "", "isLoggedIn", "<init>", "(ZZ)V", "getVerificationSuccess", "()Z", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputError extends IdentityVerificationInitiateViewState {
        public static final int $stable = 0;
        private final boolean isLoggedIn;
        private final boolean verificationSuccess;

        public final boolean getVerificationSuccess() {
            return this.verificationSuccess;
        }

        @Override // com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateViewState
        /* renamed from: isLoggedIn, reason: from getter */
        public boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        public InputError(boolean z, boolean z2) {
            super(null);
            this.verificationSuccess = z;
            this.isLoggedIn = z2;
        }
    }

    /* compiled from: IdentityVerificationInitiateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState$UnknownError;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "throwable", "Lcom/robinhood/udf/UiEvent;", "", "isLoggedIn", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Z)V", "getThrowable", "()Lcom/robinhood/udf/UiEvent;", "()Z", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnknownError extends IdentityVerificationInitiateViewState {
        public static final int $stable = 8;
        private final boolean isLoggedIn;
        private final UiEvent<Throwable> throwable;

        public final UiEvent<Throwable> getThrowable() {
            return this.throwable;
        }

        @Override // com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateViewState
        /* renamed from: isLoggedIn, reason: from getter */
        public boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(UiEvent<Throwable> throwable, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
            this.isLoggedIn = z;
        }
    }

    public final boolean getShowErrorView() {
        return this instanceof InputError;
    }

    public final boolean getShowLoadingView() {
        return !(this instanceof InputError);
    }
}
