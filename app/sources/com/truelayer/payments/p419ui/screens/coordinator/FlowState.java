package com.truelayer.payments.p419ui.screens.coordinator;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.utils.AnalyticsError;
import com.truelayer.payments.analytics.utils.ErrorType;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.errors.InternalError;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Standard2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlowState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "", "()V", "AuthorizationFlowRequired", "AuthorizingFlow", "Failure", "Finished", "FinishedWaiting", "Init", "Success", "Wait", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$AuthorizationFlowRequired;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$AuthorizingFlow;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Finished;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$FinishedWaiting;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Init;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Success;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Wait;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class FlowState {
    public static final int $stable = 0;

    public /* synthetic */ FlowState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FlowState() {
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Init;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "()V", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Init extends FlowState {
        public static final int $stable = 0;
        public static final Init INSTANCE = new Init();

        private Init() {
            super(null);
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Wait;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Wait extends FlowState {
        public static final int $stable = 8;
        private final Legals legals;
        private final Payment payment;
        private final PaymentProvider provider;

        public static /* synthetic */ Wait copy$default(Wait wait, Payment payment, Legals legals, PaymentProvider paymentProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = wait.payment;
            }
            if ((i & 2) != 0) {
                legals = wait.legals;
            }
            if ((i & 4) != 0) {
                paymentProvider = wait.provider;
            }
            return wait.copy(payment, legals, paymentProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final Legals getLegals() {
            return this.legals;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentProvider getProvider() {
            return this.provider;
        }

        public final Wait copy(Payment payment, Legals legals, PaymentProvider provider) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(legals, "legals");
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new Wait(payment, legals, provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wait)) {
                return false;
            }
            Wait wait = (Wait) other;
            return Intrinsics.areEqual(this.payment, wait.payment) && Intrinsics.areEqual(this.legals, wait.legals) && Intrinsics.areEqual(this.provider, wait.provider);
        }

        public int hashCode() {
            return (((this.payment.hashCode() * 31) + this.legals.hashCode()) * 31) + this.provider.hashCode();
        }

        public String toString() {
            return "Wait(payment=" + this.payment + ", legals=" + this.legals + ", provider=" + this.provider + ")";
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final Legals getLegals() {
            return this.legals;
        }

        public final PaymentProvider getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wait(Payment payment, Legals legals, PaymentProvider provider) {
            super(null);
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(legals, "legals");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.payment = payment;
            this.legals = legals;
            this.provider = provider;
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "reason", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "(Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;)V", "getReason", "()Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "intoProcessorResult", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "toAnalyticsError", "Lcom/truelayer/payments/analytics/utils/AnalyticsError;", "toString", "", "Reason", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends FlowState {
        public static final int $stable = 8;
        private final Reason reason;

        /* compiled from: FlowState.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InternalError.values().length];
                try {
                    iArr[InternalError.UnsupportedUseCase.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InternalError.ActivityNotFound.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InternalError.FlowCoordinatorInternalInconsistency.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InternalError.FlowCoordinatorInternalInconsistencyWait.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InternalError.AuthorizationFlowHasNoActions.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InternalError.ResponseValidationUnableToParseResponse.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InternalError.UnsupportedPaymentMethod.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = failure.reason;
            }
            return failure.copy(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final Reason getReason() {
            return this.reason;
        }

        public final Failure copy(Reason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.reason, ((Failure) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Reason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        /* compiled from: FlowState.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "", "AuthorizationFailed", "Failed", "Internal", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$AuthorizationFailed;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$Failed;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$Internal;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public interface Reason {

            /* compiled from: FlowState.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$Failed;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class Failed implements Reason {
                public static final int $stable = 0;
                public static final Failed INSTANCE = new Failed();

                public boolean equals(Object other) {
                    return this == other || (other instanceof Failed);
                }

                public int hashCode() {
                    return 2068468002;
                }

                public String toString() {
                    return "Failed";
                }

                private Failed() {
                }
            }

            /* compiled from: FlowState.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$AuthorizationFailed;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "reason", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "stage", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;)V", "getReason", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "getStage", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class AuthorizationFailed implements Reason {
                public static final int $stable = 0;
                private final AuthorizationFlowResponse.AuthorizationFailed.FailureReason reason;
                private final AuthorizationFlowResponse.AuthorizationFailed.FailureStage stage;

                public static /* synthetic */ AuthorizationFailed copy$default(AuthorizationFailed authorizationFailed, AuthorizationFlowResponse.AuthorizationFailed.FailureReason failureReason, AuthorizationFlowResponse.AuthorizationFailed.FailureStage failureStage, int i, Object obj) {
                    if ((i & 1) != 0) {
                        failureReason = authorizationFailed.reason;
                    }
                    if ((i & 2) != 0) {
                        failureStage = authorizationFailed.stage;
                    }
                    return authorizationFailed.copy(failureReason, failureStage);
                }

                /* renamed from: component1, reason: from getter */
                public final AuthorizationFlowResponse.AuthorizationFailed.FailureReason getReason() {
                    return this.reason;
                }

                /* renamed from: component2, reason: from getter */
                public final AuthorizationFlowResponse.AuthorizationFailed.FailureStage getStage() {
                    return this.stage;
                }

                public final AuthorizationFailed copy(AuthorizationFlowResponse.AuthorizationFailed.FailureReason reason, AuthorizationFlowResponse.AuthorizationFailed.FailureStage stage) {
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    Intrinsics.checkNotNullParameter(stage, "stage");
                    return new AuthorizationFailed(reason, stage);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AuthorizationFailed)) {
                        return false;
                    }
                    AuthorizationFailed authorizationFailed = (AuthorizationFailed) other;
                    return this.reason == authorizationFailed.reason && this.stage == authorizationFailed.stage;
                }

                public int hashCode() {
                    return (this.reason.hashCode() * 31) + this.stage.hashCode();
                }

                public String toString() {
                    return "AuthorizationFailed(reason=" + this.reason + ", stage=" + this.stage + ")";
                }

                public AuthorizationFailed(AuthorizationFlowResponse.AuthorizationFailed.FailureReason reason, AuthorizationFlowResponse.AuthorizationFailed.FailureStage stage) {
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    Intrinsics.checkNotNullParameter(stage, "stage");
                    this.reason = reason;
                    this.stage = stage;
                }

                public final AuthorizationFlowResponse.AuthorizationFailed.FailureReason getReason() {
                    return this.reason;
                }

                public final AuthorizationFlowResponse.AuthorizationFailed.FailureStage getStage() {
                    return this.stage;
                }
            }

            /* compiled from: FlowState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason$Internal;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure$Reason;", "errorCode", "Lcom/truelayer/payments/ui/errors/InternalError;", "(Lcom/truelayer/payments/ui/errors/InternalError;)V", "getErrorCode", "()Lcom/truelayer/payments/ui/errors/InternalError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class Internal implements Reason {
                public static final int $stable = 0;
                private final InternalError errorCode;

                public static /* synthetic */ Internal copy$default(Internal internal, InternalError internalError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        internalError = internal.errorCode;
                    }
                    return internal.copy(internalError);
                }

                /* renamed from: component1, reason: from getter */
                public final InternalError getErrorCode() {
                    return this.errorCode;
                }

                public final Internal copy(InternalError errorCode) {
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    return new Internal(errorCode);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Internal) && this.errorCode == ((Internal) other).errorCode;
                }

                public int hashCode() {
                    return this.errorCode.hashCode();
                }

                public String toString() {
                    return "Internal(errorCode=" + this.errorCode + ")";
                }

                public Internal(InternalError errorCode) {
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    this.errorCode = errorCode;
                }

                public final InternalError getErrorCode() {
                    return this.errorCode;
                }
            }
        }

        public final ProcessorResult.Failure intoProcessorResult() {
            ProcessorResult.FailureReason failureReason;
            Reason reason = this.reason;
            if (Intrinsics.areEqual(reason, Reason.Failed.INSTANCE) || (reason instanceof Reason.AuthorizationFailed)) {
                failureReason = ProcessorResult.FailureReason.PaymentFailed;
            } else if (reason instanceof Reason.Internal) {
                switch (WhenMappings.$EnumSwitchMapping$0[((Reason.Internal) this.reason).getErrorCode().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        failureReason = ProcessorResult.FailureReason.Unknown;
                        break;
                    case 5:
                    case 6:
                        failureReason = ProcessorResult.FailureReason.CommunicationIssue;
                        break;
                    case 7:
                        throw new Standard2(null, 1, null);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new ProcessorResult.Failure(failureReason);
        }

        public final AnalyticsError toAnalyticsError() {
            ErrorType errorType;
            Reason reason = this.reason;
            String str = null;
            if (Intrinsics.areEqual(reason, Reason.Failed.INSTANCE)) {
                errorType = ErrorType.PaymentFailed;
            } else if (reason instanceof Reason.AuthorizationFailed) {
                errorType = ErrorType.PaymentAuthorizationFailed;
            } else if (reason instanceof Reason.Internal) {
                switch (WhenMappings.$EnumSwitchMapping$0[((Reason.Internal) this.reason).getErrorCode().ordinal()]) {
                    case 1:
                    case 5:
                    case 6:
                        errorType = ErrorType.ParseFailed;
                        break;
                    case 2:
                        errorType = ErrorType.ActivityNotFound;
                        break;
                    case 3:
                    case 4:
                        errorType = ErrorType.FlowCoordinatorInconsistency;
                        break;
                    case 7:
                        throw new Standard2(null, 1, null);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ErrorType errorType2 = errorType;
            Reason reason2 = this.reason;
            if (reason2 instanceof Reason.AuthorizationFailed) {
                str = ((Reason.AuthorizationFailed) reason2).getReason() + " - " + ((Reason.AuthorizationFailed) this.reason).getStage();
            }
            return new AnalyticsError(errorType2, str, false, null, null, null, 0, null, null, 376, null);
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Success;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Lcom/truelayer/payments/core/domain/payments/Payment;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Success extends FlowState {
        public static final int $stable = 8;
        private final Payment payment;

        public static /* synthetic */ Success copy$default(Success success, Payment payment, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = success.payment;
            }
            return success.copy(payment);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        public final Success copy(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            return new Success(payment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.payment, ((Success) other).payment);
        }

        public int hashCode() {
            return this.payment.hashCode();
        }

        public String toString() {
            return "Success(payment=" + this.payment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Payment payment) {
            super(null);
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.payment = payment;
        }

        public final Payment getPayment() {
            return this.payment;
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$AuthorizationFlowRequired;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "()V", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AuthorizationFlowRequired extends FlowState {
        public static final int $stable = 0;
        public static final AuthorizationFlowRequired INSTANCE = new AuthorizationFlowRequired();

        private AuthorizationFlowRequired() {
            super(null);
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$AuthorizingFlow;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "authFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuthorizingFlow extends FlowState {
        public static final int $stable = 8;
        private final AuthorizationFlow authFlow;

        public static /* synthetic */ AuthorizingFlow copy$default(AuthorizingFlow authorizingFlow, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationFlow = authorizingFlow.authFlow;
            }
            return authorizingFlow.copy(authorizationFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorizationFlow getAuthFlow() {
            return this.authFlow;
        }

        public final AuthorizingFlow copy(AuthorizationFlow authFlow) {
            Intrinsics.checkNotNullParameter(authFlow, "authFlow");
            return new AuthorizingFlow(authFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthorizingFlow) && Intrinsics.areEqual(this.authFlow, ((AuthorizingFlow) other).authFlow);
        }

        public int hashCode() {
            return this.authFlow.hashCode();
        }

        public String toString() {
            return "AuthorizingFlow(authFlow=" + this.authFlow + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizingFlow(AuthorizationFlow authFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(authFlow, "authFlow");
            this.authFlow = authFlow;
        }

        public final AuthorizationFlow getAuthFlow() {
            return this.authFlow;
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Finished;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", "redirectUrl", "", "providerId", "providerCountryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProviderCountryCode", "()Ljava/lang/String;", "getProviderId", "getRedirectUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Finished extends FlowState {
        public static final int $stable = 0;
        private final String providerCountryCode;
        private final String providerId;
        private final String redirectUrl;

        public static /* synthetic */ Finished copy$default(Finished finished, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = finished.redirectUrl;
            }
            if ((i & 2) != 0) {
                str2 = finished.providerId;
            }
            if ((i & 4) != 0) {
                str3 = finished.providerCountryCode;
            }
            return finished.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        public final Finished copy(String redirectUrl, String providerId, String providerCountryCode) {
            return new Finished(redirectUrl, providerId, providerCountryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) other;
            return Intrinsics.areEqual(this.redirectUrl, finished.redirectUrl) && Intrinsics.areEqual(this.providerId, finished.providerId) && Intrinsics.areEqual(this.providerCountryCode, finished.providerCountryCode);
        }

        public int hashCode() {
            String str = this.redirectUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.providerId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.providerCountryCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Finished(redirectUrl=" + this.redirectUrl + ", providerId=" + this.providerId + ", providerCountryCode=" + this.providerCountryCode + ")";
        }

        public Finished(String str, String str2, String str3) {
            super(null);
            this.redirectUrl = str;
            this.providerId = str2;
            this.providerCountryCode = str3;
        }

        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }
    }

    /* compiled from: FlowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowState$FinishedWaiting;", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Lcom/truelayer/payments/core/domain/payments/Payment;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class FinishedWaiting extends FlowState {
        public static final int $stable = 8;
        private final Payment payment;

        public static /* synthetic */ FinishedWaiting copy$default(FinishedWaiting finishedWaiting, Payment payment, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = finishedWaiting.payment;
            }
            return finishedWaiting.copy(payment);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        public final FinishedWaiting copy(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            return new FinishedWaiting(payment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishedWaiting) && Intrinsics.areEqual(this.payment, ((FinishedWaiting) other).payment);
        }

        public int hashCode() {
            return this.payment.hashCode();
        }

        public String toString() {
            return "FinishedWaiting(payment=" + this.payment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishedWaiting(Payment payment) {
            super(null);
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.payment = payment;
        }

        public final Payment getPayment() {
            return this.payment;
        }
    }
}
