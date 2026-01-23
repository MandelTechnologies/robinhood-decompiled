package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.errors.InternalError;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.coordinator.state.ValidatedState;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentProcessorState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00042\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "", "AuthorizationRequired", "Authorizing", "Companion", "Error", "FinishedProcessingRedirect", "MoreDataRequiredToExecuteStep", "PaymentFailed", "PaymentSuccess", "Uninitialized", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$AuthorizationRequired;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$FinishedProcessingRedirect;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$MoreDataRequiredToExecuteStep;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$PaymentFailed;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$PaymentSuccess;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Uninitialized;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface PaymentProcessorState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Uninitialized;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Uninitialized implements PaymentProcessorState {
        public static final int $stable = 0;
        public static final Uninitialized INSTANCE = new Uninitialized();

        public boolean equals(Object other) {
            return this == other || (other instanceof Uninitialized);
        }

        public int hashCode() {
            return -1819508001;
        }

        public String toString() {
            return "Uninitialized";
        }

        private Uninitialized() {
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$AuthorizationRequired;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuthorizationRequired implements PaymentProcessorState {
        public static final int $stable = 8;
        private final MerchantConfig merchantConfig;
        private final Payment payment;

        public static /* synthetic */ AuthorizationRequired copy$default(AuthorizationRequired authorizationRequired, Payment payment, MerchantConfig merchantConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = authorizationRequired.payment;
            }
            if ((i & 2) != 0) {
                merchantConfig = authorizationRequired.merchantConfig;
            }
            return authorizationRequired.copy(payment, merchantConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public final AuthorizationRequired copy(Payment payment, MerchantConfig merchantConfig) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            return new AuthorizationRequired(payment, merchantConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationRequired)) {
                return false;
            }
            AuthorizationRequired authorizationRequired = (AuthorizationRequired) other;
            return Intrinsics.areEqual(this.payment, authorizationRequired.payment) && Intrinsics.areEqual(this.merchantConfig, authorizationRequired.merchantConfig);
        }

        public int hashCode() {
            return (this.payment.hashCode() * 31) + this.merchantConfig.hashCode();
        }

        public AuthorizationRequired(Payment payment, MerchantConfig merchantConfig) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            this.payment = payment;
            this.merchantConfig = merchantConfig;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public String toString() {
            return "AuthorizationRequired(paymentId=" + this.payment.getPaymentId() + ", paymentMethod=" + this.payment.getPaymentMethod().getClass().getSimpleName() + ", merchantConfig=" + this.merchantConfig.getName() + ")";
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "Core", "Internal", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error$Core;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error$Internal;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Error extends PaymentProcessorState {

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error$Core;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error;", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "debugMessage", "", "(Lcom/truelayer/payments/core/domain/errors/CoreError;Ljava/lang/String;)V", "getDebugMessage", "()Ljava/lang/String;", "getError", "()Lcom/truelayer/payments/core/domain/errors/CoreError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Core implements Error {
            public static final int $stable = 8;
            private final String debugMessage;
            private final CoreError error;

            public static /* synthetic */ Core copy$default(Core core, CoreError coreError, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    coreError = core.error;
                }
                if ((i & 2) != 0) {
                    str = core.debugMessage;
                }
                return core.copy(coreError, str);
            }

            /* renamed from: component1, reason: from getter */
            public final CoreError getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public final Core copy(CoreError error, String debugMessage) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Core(error, debugMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Core)) {
                    return false;
                }
                Core core = (Core) other;
                return Intrinsics.areEqual(this.error, core.error) && Intrinsics.areEqual(this.debugMessage, core.debugMessage);
            }

            public int hashCode() {
                int iHashCode = this.error.hashCode() * 31;
                String str = this.debugMessage;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public Core(CoreError error, String str) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.debugMessage = str;
            }

            public /* synthetic */ Core(CoreError coreError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(coreError, (i & 2) != 0 ? null : str);
            }

            public final CoreError getError() {
                return this.error;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public String toString() {
                return "Core(error=" + this.error.getClass().getSimpleName() + ", debugMessage=" + this.debugMessage + ")";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error$Internal;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error;", "code", "Lcom/truelayer/payments/ui/errors/InternalError;", "error", "", "debugMessage", "", "(Lcom/truelayer/payments/ui/errors/InternalError;Ljava/lang/Throwable;Ljava/lang/String;)V", "getCode", "()Lcom/truelayer/payments/ui/errors/InternalError;", "getDebugMessage", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Internal implements Error {
            public static final int $stable = 8;
            private final InternalError code;
            private final String debugMessage;
            private final Throwable error;

            public static /* synthetic */ Internal copy$default(Internal internal, InternalError internalError, Throwable th, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    internalError = internal.code;
                }
                if ((i & 2) != 0) {
                    th = internal.error;
                }
                if ((i & 4) != 0) {
                    str = internal.debugMessage;
                }
                return internal.copy(internalError, th, str);
            }

            /* renamed from: component1, reason: from getter */
            public final InternalError getCode() {
                return this.code;
            }

            /* renamed from: component2, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public final Internal copy(InternalError code, Throwable error, String debugMessage) {
                Intrinsics.checkNotNullParameter(code, "code");
                return new Internal(code, error, debugMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return this.code == internal.code && Intrinsics.areEqual(this.error, internal.error) && Intrinsics.areEqual(this.debugMessage, internal.debugMessage);
            }

            public int hashCode() {
                int iHashCode = this.code.hashCode() * 31;
                Throwable th = this.error;
                int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
                String str = this.debugMessage;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public Internal(InternalError code, Throwable th, String str) {
                Intrinsics.checkNotNullParameter(code, "code");
                this.code = code;
                this.error = th;
                this.debugMessage = str;
            }

            public /* synthetic */ Internal(InternalError internalError, Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(internalError, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str);
            }

            public final InternalError getCode() {
                return this.code;
            }

            public final Throwable getError() {
                return this.error;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public String toString() {
                InternalError internalError = this.code;
                Throwable th = this.error;
                return "Internal(code=" + internalError + ", error=" + (th != null ? th.getClass().getSimpleName() : null) + ", debugMessage=" + this.debugMessage + ")";
            }
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\b\u0010#\u001a\u00020$H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$PaymentFailed;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "failureReason", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "authorizationFlowResponse", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;)V", "getAuthorizationFlowResponse", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "getFailureReason", "()Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class PaymentFailed implements PaymentProcessorState {
        public static final int $stable = 8;
        private final AuthorizationFlowResponse authorizationFlowResponse;
        private final PaymentFailureReason failureReason;
        private final MerchantConfig merchantConfig;
        private final Payment payment;
        private final PaymentProvider selectedProvider;

        public static /* synthetic */ PaymentFailed copy$default(PaymentFailed paymentFailed, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, PaymentFailureReason paymentFailureReason, AuthorizationFlowResponse authorizationFlowResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = paymentFailed.payment;
            }
            if ((i & 2) != 0) {
                merchantConfig = paymentFailed.merchantConfig;
            }
            if ((i & 4) != 0) {
                paymentProvider = paymentFailed.selectedProvider;
            }
            if ((i & 8) != 0) {
                paymentFailureReason = paymentFailed.failureReason;
            }
            if ((i & 16) != 0) {
                authorizationFlowResponse = paymentFailed.authorizationFlowResponse;
            }
            AuthorizationFlowResponse authorizationFlowResponse2 = authorizationFlowResponse;
            PaymentProvider paymentProvider2 = paymentProvider;
            return paymentFailed.copy(payment, merchantConfig, paymentProvider2, paymentFailureReason, authorizationFlowResponse2);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthorizationFlowResponse getAuthorizationFlowResponse() {
            return this.authorizationFlowResponse;
        }

        public final PaymentFailed copy(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, PaymentFailureReason failureReason, AuthorizationFlowResponse authorizationFlowResponse) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            return new PaymentFailed(payment, merchantConfig, selectedProvider, failureReason, authorizationFlowResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentFailed)) {
                return false;
            }
            PaymentFailed paymentFailed = (PaymentFailed) other;
            return Intrinsics.areEqual(this.payment, paymentFailed.payment) && Intrinsics.areEqual(this.merchantConfig, paymentFailed.merchantConfig) && Intrinsics.areEqual(this.selectedProvider, paymentFailed.selectedProvider) && this.failureReason == paymentFailed.failureReason && Intrinsics.areEqual(this.authorizationFlowResponse, paymentFailed.authorizationFlowResponse);
        }

        public int hashCode() {
            int iHashCode = ((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31;
            PaymentProvider paymentProvider = this.selectedProvider;
            int iHashCode2 = (((iHashCode + (paymentProvider == null ? 0 : paymentProvider.hashCode())) * 31) + this.failureReason.hashCode()) * 31;
            AuthorizationFlowResponse authorizationFlowResponse = this.authorizationFlowResponse;
            return iHashCode2 + (authorizationFlowResponse != null ? authorizationFlowResponse.hashCode() : 0);
        }

        public PaymentFailed(Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, PaymentFailureReason failureReason, AuthorizationFlowResponse authorizationFlowResponse) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            this.payment = payment;
            this.merchantConfig = merchantConfig;
            this.selectedProvider = paymentProvider;
            this.failureReason = failureReason;
            this.authorizationFlowResponse = authorizationFlowResponse;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        public final AuthorizationFlowResponse getAuthorizationFlowResponse() {
            return this.authorizationFlowResponse;
        }

        public String toString() {
            return "PaymentFailed(paymentId=" + this.payment.getPaymentId() + ", paymentMethod=" + this.payment.getPaymentMethod().getClass().getSimpleName() + ", merchantConfig=" + this.merchantConfig.getName() + ", failureReason=" + this.failureReason + ")";
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$PaymentSuccess;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class PaymentSuccess implements PaymentProcessorState {
        public static final int $stable = 8;
        private final MerchantConfig merchantConfig;
        private final Payment payment;
        private final PaymentProvider selectedProvider;

        public static /* synthetic */ PaymentSuccess copy$default(PaymentSuccess paymentSuccess, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = paymentSuccess.payment;
            }
            if ((i & 2) != 0) {
                merchantConfig = paymentSuccess.merchantConfig;
            }
            if ((i & 4) != 0) {
                paymentProvider = paymentSuccess.selectedProvider;
            }
            return paymentSuccess.copy(payment, merchantConfig, paymentProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public final PaymentSuccess copy(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            return new PaymentSuccess(payment, merchantConfig, selectedProvider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentSuccess)) {
                return false;
            }
            PaymentSuccess paymentSuccess = (PaymentSuccess) other;
            return Intrinsics.areEqual(this.payment, paymentSuccess.payment) && Intrinsics.areEqual(this.merchantConfig, paymentSuccess.merchantConfig) && Intrinsics.areEqual(this.selectedProvider, paymentSuccess.selectedProvider);
        }

        public int hashCode() {
            int iHashCode = ((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31;
            PaymentProvider paymentProvider = this.selectedProvider;
            return iHashCode + (paymentProvider == null ? 0 : paymentProvider.hashCode());
        }

        public PaymentSuccess(Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            this.payment = payment;
            this.merchantConfig = merchantConfig;
            this.selectedProvider = paymentProvider;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public String toString() {
            String paymentId = this.payment.getPaymentId();
            String simpleName = this.payment.getPaymentMethod().getClass().getSimpleName();
            String name = this.merchantConfig.getName();
            PaymentProvider paymentProvider = this.selectedProvider;
            return "PaymentSuccess(paymentId=" + paymentId + ", paymentMethod=" + simpleName + ", merchantConfig=" + name + ", selectedProvider=" + (paymentProvider != null ? paymentProvider.getId() : null) + ")";
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$FinishedProcessingRedirect;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "redirectUrl", "", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getRedirectUrl", "()Ljava/lang/String;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class FinishedProcessingRedirect implements PaymentProcessorState {
        public static final int $stable = 8;
        private final Payment payment;
        private final String redirectUrl;
        private final PaymentProvider selectedProvider;

        public static /* synthetic */ FinishedProcessingRedirect copy$default(FinishedProcessingRedirect finishedProcessingRedirect, Payment payment, String str, PaymentProvider paymentProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = finishedProcessingRedirect.payment;
            }
            if ((i & 2) != 0) {
                str = finishedProcessingRedirect.redirectUrl;
            }
            if ((i & 4) != 0) {
                paymentProvider = finishedProcessingRedirect.selectedProvider;
            }
            return finishedProcessingRedirect.copy(payment, str, paymentProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public final FinishedProcessingRedirect copy(Payment payment, String redirectUrl, PaymentProvider selectedProvider) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            return new FinishedProcessingRedirect(payment, redirectUrl, selectedProvider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishedProcessingRedirect)) {
                return false;
            }
            FinishedProcessingRedirect finishedProcessingRedirect = (FinishedProcessingRedirect) other;
            return Intrinsics.areEqual(this.payment, finishedProcessingRedirect.payment) && Intrinsics.areEqual(this.redirectUrl, finishedProcessingRedirect.redirectUrl) && Intrinsics.areEqual(this.selectedProvider, finishedProcessingRedirect.selectedProvider);
        }

        public int hashCode() {
            int iHashCode = this.payment.hashCode() * 31;
            String str = this.redirectUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PaymentProvider paymentProvider = this.selectedProvider;
            return iHashCode2 + (paymentProvider != null ? paymentProvider.hashCode() : 0);
        }

        public String toString() {
            return "FinishedProcessingRedirect(payment=" + this.payment + ", redirectUrl=" + this.redirectUrl + ", selectedProvider=" + this.selectedProvider + ")";
        }

        public FinishedProcessingRedirect(Payment payment, String str, PaymentProvider paymentProvider) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.payment = payment;
            this.redirectUrl = str;
            this.selectedProvider = paymentProvider;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$MoreDataRequiredToExecuteStep;", "T", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "clazz", "Ljava/lang/Class;", "snapshot", "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "(Ljava/lang/Class;Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;)V", "getClazz", "()Ljava/lang/Class;", "getSnapshot", "()Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class MoreDataRequiredToExecuteStep<T extends PaymentProcessorState> implements PaymentProcessorState {
        public static final int $stable = 8;
        private final Class<T> clazz;
        private final ManagerDataSnapshot snapshot;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MoreDataRequiredToExecuteStep copy$default(MoreDataRequiredToExecuteStep moreDataRequiredToExecuteStep, Class cls, ManagerDataSnapshot managerDataSnapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                cls = moreDataRequiredToExecuteStep.clazz;
            }
            if ((i & 2) != 0) {
                managerDataSnapshot = moreDataRequiredToExecuteStep.snapshot;
            }
            return moreDataRequiredToExecuteStep.copy(cls, managerDataSnapshot);
        }

        public final Class<T> component1() {
            return this.clazz;
        }

        /* renamed from: component2, reason: from getter */
        public final ManagerDataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public final MoreDataRequiredToExecuteStep<T> copy(Class<T> clazz, ManagerDataSnapshot snapshot) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            return new MoreDataRequiredToExecuteStep<>(clazz, snapshot);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoreDataRequiredToExecuteStep)) {
                return false;
            }
            MoreDataRequiredToExecuteStep moreDataRequiredToExecuteStep = (MoreDataRequiredToExecuteStep) other;
            return Intrinsics.areEqual(this.clazz, moreDataRequiredToExecuteStep.clazz) && Intrinsics.areEqual(this.snapshot, moreDataRequiredToExecuteStep.snapshot);
        }

        public int hashCode() {
            return (this.clazz.hashCode() * 31) + this.snapshot.hashCode();
        }

        public String toString() {
            return "MoreDataRequiredToExecuteStep(clazz=" + this.clazz + ", snapshot=" + this.snapshot + ")";
        }

        public MoreDataRequiredToExecuteStep(Class<T> clazz, ManagerDataSnapshot snapshot) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.clazz = clazz;
            this.snapshot = snapshot;
        }

        public final Class<T> getClazz() {
            return this.clazz;
        }

        public final ManagerDataSnapshot getSnapshot() {
            return this.snapshot;
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "Consent", "Form", "ProviderSelection", "Redirect", "SchemeSelection", "UserAccountSelection", "Wait", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Consent;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Form;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Redirect;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$SchemeSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$UserAccountSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Wait;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Authorizing extends PaymentProcessorState {
        MerchantConfig getMerchantConfig();

        Payment getPayment();

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\b\u0010)\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "providerSelectionResult", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "recommendedProviders", "", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "preferredCountryCode", "", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;Ljava/util/List;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPreferredCountryCode", "()Ljava/lang/String;", "getProviderSelectionResult", "()Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "getRecommendedProviders", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class ProviderSelection implements Authorizing {
            public static final int $stable = 8;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.ProviderSelection nextAction;
            private final Payment payment;
            private final String preferredCountryCode;
            private final ProviderSelectionResult providerSelectionResult;
            private final List<PaymentProvider> recommendedProviders;

            public static /* synthetic */ ProviderSelection copy$default(ProviderSelection providerSelection, Payment payment, MerchantConfig merchantConfig, ProviderSelectionResult providerSelectionResult, List list, String str, AuthorizationFlow2.ProviderSelection providerSelection2, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = providerSelection.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = providerSelection.merchantConfig;
                }
                if ((i & 4) != 0) {
                    providerSelectionResult = providerSelection.providerSelectionResult;
                }
                if ((i & 8) != 0) {
                    list = providerSelection.recommendedProviders;
                }
                if ((i & 16) != 0) {
                    str = providerSelection.preferredCountryCode;
                }
                if ((i & 32) != 0) {
                    providerSelection2 = providerSelection.nextAction;
                }
                String str2 = str;
                AuthorizationFlow2.ProviderSelection providerSelection3 = providerSelection2;
                return providerSelection.copy(payment, merchantConfig, providerSelectionResult, list, str2, providerSelection3);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final ProviderSelectionResult getProviderSelectionResult() {
                return this.providerSelectionResult;
            }

            public final List<PaymentProvider> component4() {
                return this.recommendedProviders;
            }

            /* renamed from: component5, reason: from getter */
            public final String getPreferredCountryCode() {
                return this.preferredCountryCode;
            }

            /* renamed from: component6, reason: from getter */
            public final AuthorizationFlow2.ProviderSelection getNextAction() {
                return this.nextAction;
            }

            public final ProviderSelection copy(Payment payment, MerchantConfig merchantConfig, ProviderSelectionResult providerSelectionResult, List<PaymentProvider> recommendedProviders, String preferredCountryCode, AuthorizationFlow2.ProviderSelection nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                return new ProviderSelection(payment, merchantConfig, providerSelectionResult, recommendedProviders, preferredCountryCode, nextAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProviderSelection)) {
                    return false;
                }
                ProviderSelection providerSelection = (ProviderSelection) other;
                return Intrinsics.areEqual(this.payment, providerSelection.payment) && Intrinsics.areEqual(this.merchantConfig, providerSelection.merchantConfig) && Intrinsics.areEqual(this.providerSelectionResult, providerSelection.providerSelectionResult) && Intrinsics.areEqual(this.recommendedProviders, providerSelection.recommendedProviders) && Intrinsics.areEqual(this.preferredCountryCode, providerSelection.preferredCountryCode) && Intrinsics.areEqual(this.nextAction, providerSelection.nextAction);
            }

            public int hashCode() {
                int iHashCode = ((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31;
                ProviderSelectionResult providerSelectionResult = this.providerSelectionResult;
                int iHashCode2 = (((iHashCode + (providerSelectionResult == null ? 0 : providerSelectionResult.hashCode())) * 31) + this.recommendedProviders.hashCode()) * 31;
                String str = this.preferredCountryCode;
                return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.nextAction.hashCode();
            }

            public ProviderSelection(Payment payment, MerchantConfig merchantConfig, ProviderSelectionResult providerSelectionResult, List<PaymentProvider> recommendedProviders, String str, AuthorizationFlow2.ProviderSelection nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.providerSelectionResult = providerSelectionResult;
                this.recommendedProviders = recommendedProviders;
                this.preferredCountryCode = str;
                this.nextAction = nextAction;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final ProviderSelectionResult getProviderSelectionResult() {
                return this.providerSelectionResult;
            }

            public final List<PaymentProvider> getRecommendedProviders() {
                return this.recommendedProviders;
            }

            public final String getPreferredCountryCode() {
                return this.preferredCountryCode;
            }

            public final AuthorizationFlow2.ProviderSelection getNextAction() {
                return this.nextAction;
            }

            public String toString() {
                String paymentId = getPayment().getPaymentId();
                String simpleName = getPayment().getPaymentMethod().getClass().getSimpleName();
                String name = getMerchantConfig().getName();
                ProviderSelectionResult providerSelectionResult = this.providerSelectionResult;
                List<PaymentProvider> list = this.recommendedProviders;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PaymentProvider) it.next()).getId());
                }
                return "ProviderSelection(paymentId=" + paymentId + ", paymentMethod=" + simpleName + ", merchantConfig=" + name + ", providerSelectionResult=" + providerSelectionResult + ", recommendedProviders=" + arrayList + ", preferredCountryCode=" + this.preferredCountryCode + "), nextAction=ProviderSelection providersCount = " + this.nextAction.getProviders().size();
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Redirect;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Redirect implements Authorizing {
            public static final int $stable = 8;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.Redirect nextAction;
            private final Payment payment;

            public static /* synthetic */ Redirect copy$default(Redirect redirect, Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.Redirect redirect2, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = redirect.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = redirect.merchantConfig;
                }
                if ((i & 4) != 0) {
                    redirect2 = redirect.nextAction;
                }
                return redirect.copy(payment, merchantConfig, redirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final AuthorizationFlow2.Redirect getNextAction() {
                return this.nextAction;
            }

            public final Redirect copy(Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.Redirect nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                return new Redirect(payment, merchantConfig, nextAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Redirect)) {
                    return false;
                }
                Redirect redirect = (Redirect) other;
                return Intrinsics.areEqual(this.payment, redirect.payment) && Intrinsics.areEqual(this.merchantConfig, redirect.merchantConfig) && Intrinsics.areEqual(this.nextAction, redirect.nextAction);
            }

            public int hashCode() {
                return (((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.nextAction.hashCode();
            }

            public Redirect(Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.Redirect nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.nextAction = nextAction;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final AuthorizationFlow2.Redirect getNextAction() {
                return this.nextAction;
            }

            public String toString() {
                return "Redirect(paymentId=" + getPayment().getPaymentId() + ", paymentMethod=" + getPayment().getPaymentMethod().getClass().getSimpleName() + ", merchantConfig=" + getMerchantConfig().getName() + ", nextAction=Redirect url = " + this.nextAction.getUrl() + ")";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\t\u0010\"\u001a\u00020\u000fHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\b\u0010*\u001a\u00020\nH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Wait;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "translations", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Ljava/util/Map;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;)V", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getTranslations", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Wait implements Authorizing {
            public static final int $stable = 8;
            private final Legals legals;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.Wait nextAction;
            private final Payment payment;
            private final PaymentProvider selectedProvider;
            private final Map<String, LocalisedText> translations;

            public static /* synthetic */ Wait copy$default(Wait wait, Payment payment, MerchantConfig merchantConfig, Legals legals, Map map, PaymentProvider paymentProvider, AuthorizationFlow2.Wait wait2, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = wait.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = wait.merchantConfig;
                }
                if ((i & 4) != 0) {
                    legals = wait.legals;
                }
                if ((i & 8) != 0) {
                    map = wait.translations;
                }
                if ((i & 16) != 0) {
                    paymentProvider = wait.selectedProvider;
                }
                if ((i & 32) != 0) {
                    wait2 = wait.nextAction;
                }
                PaymentProvider paymentProvider2 = paymentProvider;
                AuthorizationFlow2.Wait wait3 = wait2;
                return wait.copy(payment, merchantConfig, legals, map, paymentProvider2, wait3);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final Legals getLegals() {
                return this.legals;
            }

            public final Map<String, LocalisedText> component4() {
                return this.translations;
            }

            /* renamed from: component5, reason: from getter */
            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            /* renamed from: component6, reason: from getter */
            public final AuthorizationFlow2.Wait getNextAction() {
                return this.nextAction;
            }

            public final Wait copy(Payment payment, MerchantConfig merchantConfig, Legals legals, Map<String, LocalisedText> translations, PaymentProvider selectedProvider, AuthorizationFlow2.Wait nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(legals, "legals");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                return new Wait(payment, merchantConfig, legals, translations, selectedProvider, nextAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Wait)) {
                    return false;
                }
                Wait wait = (Wait) other;
                return Intrinsics.areEqual(this.payment, wait.payment) && Intrinsics.areEqual(this.merchantConfig, wait.merchantConfig) && Intrinsics.areEqual(this.legals, wait.legals) && Intrinsics.areEqual(this.translations, wait.translations) && Intrinsics.areEqual(this.selectedProvider, wait.selectedProvider) && Intrinsics.areEqual(this.nextAction, wait.nextAction);
            }

            public int hashCode() {
                int iHashCode = ((((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.legals.hashCode()) * 31;
                Map<String, LocalisedText> map = this.translations;
                return ((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.selectedProvider.hashCode()) * 31) + this.nextAction.hashCode();
            }

            public Wait(Payment payment, MerchantConfig merchantConfig, Legals legals, Map<String, LocalisedText> map, PaymentProvider selectedProvider, AuthorizationFlow2.Wait nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(legals, "legals");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.legals = legals;
                this.translations = map;
                this.selectedProvider = selectedProvider;
                this.nextAction = nextAction;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final Legals getLegals() {
                return this.legals;
            }

            public final Map<String, LocalisedText> getTranslations() {
                return this.translations;
            }

            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            public final AuthorizationFlow2.Wait getNextAction() {
                return this.nextAction;
            }

            public String toString() {
                String paymentId = getPayment().getPaymentId();
                String simpleName = getPayment().getPaymentMethod().getClass().getSimpleName();
                String name = getMerchantConfig().getName();
                Map<String, LocalisedText> map = this.translations;
                return "Wait(paymentId=" + paymentId + ", paymentMethod=" + simpleName + ", merchantConfig=" + name + ", legals=preloaded, translations=" + (map != null ? map.keySet() : null) + ", selectedProvider=" + this.selectedProvider.getId() + ", nextAction=Wait)";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\b\u0010-\u001a\u00020.H\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Form;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "selectedBranch", "Lcom/truelayer/payments/core/domain/payments/Branch;", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;", "mandatoryInputs", "", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "recentAdditionalInput", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/Branch;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;Ljava/util/List;Ljava/util/List;)V", "getMandatoryInputs", "()Ljava/util/List;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getRecentAdditionalInput", "getSelectedBranch", "()Lcom/truelayer/payments/core/domain/payments/Branch;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Form implements Authorizing {
            public static final int $stable = 8;
            private final List<FormInputWrapper> mandatoryInputs;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.Form nextAction;
            private final Payment payment;
            private final List<RecentAdditionalInput> recentAdditionalInput;
            private final Branch selectedBranch;
            private final PaymentProvider selectedProvider;

            public static /* synthetic */ Form copy$default(Form form, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, Branch branch, AuthorizationFlow2.Form form2, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = form.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = form.merchantConfig;
                }
                if ((i & 4) != 0) {
                    paymentProvider = form.selectedProvider;
                }
                if ((i & 8) != 0) {
                    branch = form.selectedBranch;
                }
                if ((i & 16) != 0) {
                    form2 = form.nextAction;
                }
                if ((i & 32) != 0) {
                    list = form.mandatoryInputs;
                }
                if ((i & 64) != 0) {
                    list2 = form.recentAdditionalInput;
                }
                List list3 = list;
                List list4 = list2;
                AuthorizationFlow2.Form form3 = form2;
                PaymentProvider paymentProvider2 = paymentProvider;
                return form.copy(payment, merchantConfig, paymentProvider2, branch, form3, list3, list4);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            /* renamed from: component4, reason: from getter */
            public final Branch getSelectedBranch() {
                return this.selectedBranch;
            }

            /* renamed from: component5, reason: from getter */
            public final AuthorizationFlow2.Form getNextAction() {
                return this.nextAction;
            }

            public final List<FormInputWrapper> component6() {
                return this.mandatoryInputs;
            }

            public final List<RecentAdditionalInput> component7() {
                return this.recentAdditionalInput;
            }

            public final Form copy(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, Branch selectedBranch, AuthorizationFlow2.Form nextAction, List<? extends FormInputWrapper> mandatoryInputs, List<RecentAdditionalInput> recentAdditionalInput) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                Intrinsics.checkNotNullParameter(mandatoryInputs, "mandatoryInputs");
                Intrinsics.checkNotNullParameter(recentAdditionalInput, "recentAdditionalInput");
                return new Form(payment, merchantConfig, selectedProvider, selectedBranch, nextAction, mandatoryInputs, recentAdditionalInput);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Form)) {
                    return false;
                }
                Form form = (Form) other;
                return Intrinsics.areEqual(this.payment, form.payment) && Intrinsics.areEqual(this.merchantConfig, form.merchantConfig) && Intrinsics.areEqual(this.selectedProvider, form.selectedProvider) && Intrinsics.areEqual(this.selectedBranch, form.selectedBranch) && Intrinsics.areEqual(this.nextAction, form.nextAction) && Intrinsics.areEqual(this.mandatoryInputs, form.mandatoryInputs) && Intrinsics.areEqual(this.recentAdditionalInput, form.recentAdditionalInput);
            }

            public int hashCode() {
                int iHashCode = ((((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.selectedProvider.hashCode()) * 31;
                Branch branch = this.selectedBranch;
                return ((((((iHashCode + (branch == null ? 0 : branch.hashCode())) * 31) + this.nextAction.hashCode()) * 31) + this.mandatoryInputs.hashCode()) * 31) + this.recentAdditionalInput.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Form(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, Branch branch, AuthorizationFlow2.Form nextAction, List<? extends FormInputWrapper> mandatoryInputs, List<RecentAdditionalInput> recentAdditionalInput) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                Intrinsics.checkNotNullParameter(mandatoryInputs, "mandatoryInputs");
                Intrinsics.checkNotNullParameter(recentAdditionalInput, "recentAdditionalInput");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.selectedProvider = selectedProvider;
                this.selectedBranch = branch;
                this.nextAction = nextAction;
                this.mandatoryInputs = mandatoryInputs;
                this.recentAdditionalInput = recentAdditionalInput;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            public final Branch getSelectedBranch() {
                return this.selectedBranch;
            }

            public final AuthorizationFlow2.Form getNextAction() {
                return this.nextAction;
            }

            public final List<FormInputWrapper> getMandatoryInputs() {
                return this.mandatoryInputs;
            }

            public final List<RecentAdditionalInput> getRecentAdditionalInput() {
                return this.recentAdditionalInput;
            }

            public String toString() {
                String paymentId = getPayment().getPaymentId();
                String simpleName = getPayment().getPaymentMethod().getClass().getSimpleName();
                String name = getMerchantConfig().getName();
                String id = this.selectedProvider.getId();
                Branch branch = this.selectedBranch;
                String id2 = branch != null ? branch.getId() : null;
                List<FormInput> inputs = this.nextAction.getInputs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(inputs, 10));
                Iterator<T> it = inputs.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FormInput) it.next()).getId());
                }
                List<RecentAdditionalInput> list = this.recentAdditionalInput;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((RecentAdditionalInput) it2.next()).getInputId());
                }
                return "Form(paymentId=" + paymentId + ", paymentMethod=" + simpleName + ", merchantConfig=" + name + ", selectedProvider=" + id + ", selectedBranch=" + id2 + ", nextAction=Form inputs = " + arrayList + ", recentAdditionalInput = " + arrayList2 + ")";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$Consent;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "requiresCollectingUserConsent", "", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Z)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getRequiresCollectingUserConsent", "()Z", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Consent implements Authorizing {
            public static final int $stable = 8;
            private final MerchantConfig merchantConfig;
            private final Payment payment;
            private final boolean requiresCollectingUserConsent;
            private final PaymentProvider selectedProvider;

            public static /* synthetic */ Consent copy$default(Consent consent, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = consent.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = consent.merchantConfig;
                }
                if ((i & 4) != 0) {
                    paymentProvider = consent.selectedProvider;
                }
                if ((i & 8) != 0) {
                    z = consent.requiresCollectingUserConsent;
                }
                return consent.copy(payment, merchantConfig, paymentProvider, z);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getRequiresCollectingUserConsent() {
                return this.requiresCollectingUserConsent;
            }

            public final Consent copy(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, boolean requiresCollectingUserConsent) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                return new Consent(payment, merchantConfig, selectedProvider, requiresCollectingUserConsent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Consent)) {
                    return false;
                }
                Consent consent = (Consent) other;
                return Intrinsics.areEqual(this.payment, consent.payment) && Intrinsics.areEqual(this.merchantConfig, consent.merchantConfig) && Intrinsics.areEqual(this.selectedProvider, consent.selectedProvider) && this.requiresCollectingUserConsent == consent.requiresCollectingUserConsent;
            }

            public int hashCode() {
                return (((((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.selectedProvider.hashCode()) * 31) + Boolean.hashCode(this.requiresCollectingUserConsent);
            }

            public Consent(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, boolean z) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.selectedProvider = selectedProvider;
                this.requiresCollectingUserConsent = z;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            public final boolean getRequiresCollectingUserConsent() {
                return this.requiresCollectingUserConsent;
            }

            public String toString() {
                return "Consent(paymentId=" + getPayment().getPaymentId() + ", paymentMethod=" + getPayment().getPaymentMethod().getClass().getSimpleName() + ", merchantConfig=" + getMerchantConfig().getName() + ", selectedProvider=" + this.selectedProvider.getId() + ", requiresCollectingUserConsent=" + this.requiresCollectingUserConsent + ")";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\b\u0010#\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$SchemeSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;", "selectedSchemeId", "", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;Ljava/lang/String;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getSelectedSchemeId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class SchemeSelection implements Authorizing {
            public static final int $stable = 8;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.SchemeSelection nextAction;
            private final Payment payment;
            private final PaymentProvider selectedProvider;
            private final String selectedSchemeId;

            public static /* synthetic */ SchemeSelection copy$default(SchemeSelection schemeSelection, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, AuthorizationFlow2.SchemeSelection schemeSelection2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = schemeSelection.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = schemeSelection.merchantConfig;
                }
                if ((i & 4) != 0) {
                    paymentProvider = schemeSelection.selectedProvider;
                }
                if ((i & 8) != 0) {
                    schemeSelection2 = schemeSelection.nextAction;
                }
                if ((i & 16) != 0) {
                    str = schemeSelection.selectedSchemeId;
                }
                String str2 = str;
                PaymentProvider paymentProvider2 = paymentProvider;
                return schemeSelection.copy(payment, merchantConfig, paymentProvider2, schemeSelection2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            /* renamed from: component4, reason: from getter */
            public final AuthorizationFlow2.SchemeSelection getNextAction() {
                return this.nextAction;
            }

            /* renamed from: component5, reason: from getter */
            public final String getSelectedSchemeId() {
                return this.selectedSchemeId;
            }

            public final SchemeSelection copy(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, AuthorizationFlow2.SchemeSelection nextAction, String selectedSchemeId) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                return new SchemeSelection(payment, merchantConfig, selectedProvider, nextAction, selectedSchemeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SchemeSelection)) {
                    return false;
                }
                SchemeSelection schemeSelection = (SchemeSelection) other;
                return Intrinsics.areEqual(this.payment, schemeSelection.payment) && Intrinsics.areEqual(this.merchantConfig, schemeSelection.merchantConfig) && Intrinsics.areEqual(this.selectedProvider, schemeSelection.selectedProvider) && Intrinsics.areEqual(this.nextAction, schemeSelection.nextAction) && Intrinsics.areEqual(this.selectedSchemeId, schemeSelection.selectedSchemeId);
            }

            public int hashCode() {
                int iHashCode = ((((((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.selectedProvider.hashCode()) * 31) + this.nextAction.hashCode()) * 31;
                String str = this.selectedSchemeId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public SchemeSelection(Payment payment, MerchantConfig merchantConfig, PaymentProvider selectedProvider, AuthorizationFlow2.SchemeSelection nextAction, String str) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.selectedProvider = selectedProvider;
                this.nextAction = nextAction;
                this.selectedSchemeId = str;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final PaymentProvider getSelectedProvider() {
                return this.selectedProvider;
            }

            public final AuthorizationFlow2.SchemeSelection getNextAction() {
                return this.nextAction;
            }

            public final String getSelectedSchemeId() {
                return this.selectedSchemeId;
            }

            public String toString() {
                return "SchemeSelection(paymentId=" + getPayment().getPaymentId() + ", paymentMethod=" + getPayment().getPaymentMethod().getClass().getSimpleName() + ", merchantConfig=" + getMerchantConfig().getName() + ", selectedProvider=" + this.selectedProvider.getId() + ", nextAction=SchemeSelection schemes = " + this.nextAction.getSchemes() + ", selectedSchemeId = " + this.selectedSchemeId + ")";
            }
        }

        /* compiled from: PaymentProcessorState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing$UserAccountSelection;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Authorizing;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "nextAction", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getNextAction", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class UserAccountSelection implements Authorizing {
            public static final int $stable = 8;
            private final MerchantConfig merchantConfig;
            private final AuthorizationFlow2.UserAccountSelection nextAction;
            private final Payment payment;

            public static /* synthetic */ UserAccountSelection copy$default(UserAccountSelection userAccountSelection, Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.UserAccountSelection userAccountSelection2, int i, Object obj) {
                if ((i & 1) != 0) {
                    payment = userAccountSelection.payment;
                }
                if ((i & 2) != 0) {
                    merchantConfig = userAccountSelection.merchantConfig;
                }
                if ((i & 4) != 0) {
                    userAccountSelection2 = userAccountSelection.nextAction;
                }
                return userAccountSelection.copy(payment, merchantConfig, userAccountSelection2);
            }

            /* renamed from: component1, reason: from getter */
            public final Payment getPayment() {
                return this.payment;
            }

            /* renamed from: component2, reason: from getter */
            public final MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final AuthorizationFlow2.UserAccountSelection getNextAction() {
                return this.nextAction;
            }

            public final UserAccountSelection copy(Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.UserAccountSelection nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                return new UserAccountSelection(payment, merchantConfig, nextAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserAccountSelection)) {
                    return false;
                }
                UserAccountSelection userAccountSelection = (UserAccountSelection) other;
                return Intrinsics.areEqual(this.payment, userAccountSelection.payment) && Intrinsics.areEqual(this.merchantConfig, userAccountSelection.merchantConfig) && Intrinsics.areEqual(this.nextAction, userAccountSelection.nextAction);
            }

            public int hashCode() {
                return (((this.payment.hashCode() * 31) + this.merchantConfig.hashCode()) * 31) + this.nextAction.hashCode();
            }

            public UserAccountSelection(Payment payment, MerchantConfig merchantConfig, AuthorizationFlow2.UserAccountSelection nextAction) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                this.payment = payment;
                this.merchantConfig = merchantConfig;
                this.nextAction = nextAction;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public Payment getPayment() {
                return this.payment;
            }

            @Override // com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorState.Authorizing
            public MerchantConfig getMerchantConfig() {
                return this.merchantConfig;
            }

            public final AuthorizationFlow2.UserAccountSelection getNextAction() {
                return this.nextAction;
            }

            public String toString() {
                String paymentId = getPayment().getPaymentId();
                String simpleName = getPayment().getPaymentMethod().getClass().getSimpleName();
                String name = getMerchantConfig().getName();
                List<UserAccount> userAccounts = this.nextAction.getUserAccounts();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(userAccounts, 10));
                Iterator<T> it = userAccounts.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserAccount) it.next()).getId());
                }
                return "UserAccountSelection(paymentId=" + paymentId + ", paymentMethod=" + simpleName + ", merchantConfig=" + name + ", nextAction=UserAccountSelection accounts: " + arrayList + ")";
            }
        }
    }

    /* compiled from: PaymentProcessorState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Companion;", "", "()V", "produceState", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dataSnapshot", "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/store/Store;Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object produceState(PaymentContext paymentContext, Store store, ManagerDataSnapshot managerDataSnapshot, Continuation<? super PaymentProcessorState> continuation) {
            PaymentProcessorState2 paymentProcessorState2;
            ManagerDataSnapshot managerDataSnapshot2;
            AuthorizationFlow authorizationFlow;
            AuthorizationFlow.FlowActions actions;
            if (continuation instanceof PaymentProcessorState2) {
                paymentProcessorState2 = (PaymentProcessorState2) continuation;
                int i = paymentProcessorState2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    paymentProcessorState2.label = i - Integer.MIN_VALUE;
                } else {
                    paymentProcessorState2 = new PaymentProcessorState2(this, continuation);
                }
            }
            PaymentProcessorState2 paymentProcessorState22 = paymentProcessorState2;
            Object objValidateAuthorizationStep = paymentProcessorState22.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = paymentProcessorState22.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objValidateAuthorizationStep);
                Payment payment = (Payment) Outcome4.okOrNull(managerDataSnapshot.getPayment());
                MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(managerDataSnapshot.getMerchantConfig());
                Object objOkOrNull = Outcome4.okOrNull(managerDataSnapshot.getAuthorizationFlowResponse());
                String str = null;
                Object[] objArr = 0;
                AuthorizationFlowResponse.Authorizing authorizing = objOkOrNull instanceof AuthorizationFlowResponse.Authorizing ? (AuthorizationFlowResponse.Authorizing) objOkOrNull : null;
                AuthorizationFlow2 next = (authorizing == null || (authorizationFlow = authorizing.getAuthorizationFlow()) == null || (actions = authorizationFlow.getActions()) == null) ? null : actions.getNext();
                Object objOkOrNull2 = Outcome4.okOrNull(managerDataSnapshot.getAuthorizationFlowResponse());
                AuthorizationFlowResponse.AuthorizationFailed authorizationFailed = objOkOrNull2 instanceof AuthorizationFlowResponse.AuthorizationFailed ? (AuthorizationFlowResponse.AuthorizationFailed) objOkOrNull2 : null;
                List<CoreError> errors = managerDataSnapshot.getErrors();
                if (!errors.isEmpty()) {
                    return new Error.Core((CoreError) CollectionsKt.first((List) errors), str, 2, objArr == true ? 1 : 0);
                }
                if (payment == null || merchantConfig == null) {
                    return new Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Payment or merchant config is not available");
                }
                if (payment.getPaymentMethod() instanceof PaymentMethod.PaymentOfMandate) {
                    return new Error.Internal(InternalError.UnsupportedPaymentMethod, null, "Payment of mandate is not supported");
                }
                if (authorizationFailed != null) {
                    return new PaymentFailed(payment.transitionToFailed(authorizationFailed), merchantConfig, managerDataSnapshot.getSelectedProvider(), authorizationFailed.getFailureReason().intoPaymentFailureReason(), authorizationFailed);
                }
                if (next == null && (payment instanceof Payment.Authorizing)) {
                    AuthorizationFlow.FlowActions actions2 = ((Payment.Authorizing) payment).getAuthorizationFlow().getActions();
                    next = actions2 != null ? actions2.getNext() : null;
                }
                AuthorizationFlow2 authorizationFlow2 = next;
                if (authorizationFlow2 != null) {
                    StateValidator stateValidator = StateValidator.INSTANCE;
                    paymentProcessorState22.L$0 = managerDataSnapshot;
                    paymentProcessorState22.label = 1;
                    objValidateAuthorizationStep = stateValidator.validateAuthorizationStep(paymentContext, store, managerDataSnapshot, authorizationFlow2, paymentProcessorState22);
                    if (objValidateAuthorizationStep == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    managerDataSnapshot2 = managerDataSnapshot;
                } else {
                    if (payment instanceof Payment.Authorizing) {
                        return new Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Authorizing step should have been already served");
                    }
                    if (!(payment instanceof Payment.Authorized) && !(payment instanceof Payment.Executed) && !(payment instanceof Payment.Settled)) {
                        if (payment instanceof Payment.Revoked) {
                            return new PaymentFailed(payment, merchantConfig, managerDataSnapshot.getSelectedProvider(), PaymentFailureReason.MandateRevoked, (AuthorizationFlowResponse) Outcome4.okOrNull(managerDataSnapshot.getAuthorizationFlowResponse()));
                        }
                        if (payment instanceof Payment.Failed) {
                            return new PaymentFailed(payment, merchantConfig, managerDataSnapshot.getSelectedProvider(), ((Payment.Failed) payment).getFailureReason(), (AuthorizationFlowResponse) Outcome4.okOrNull(managerDataSnapshot.getAuthorizationFlowResponse()));
                        }
                        if (payment instanceof Payment.AuthorizationRequired) {
                            return new AuthorizationRequired(payment, merchantConfig);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return new PaymentSuccess(payment, merchantConfig, managerDataSnapshot.getSelectedProvider());
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                managerDataSnapshot2 = (ManagerDataSnapshot) paymentProcessorState22.L$0;
                ResultKt.throwOnFailure(objValidateAuthorizationStep);
            }
            ValidatedState validatedState = (ValidatedState) objValidateAuthorizationStep;
            if (validatedState instanceof ValidatedState.Invalid) {
                ValidatedState.Invalid invalid = (ValidatedState.Invalid) validatedState;
                return new Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, invalid.getError(), invalid.getError().getMessage());
            }
            if (validatedState instanceof ValidatedState.MoreDataRequired) {
                return new MoreDataRequiredToExecuteStep(((ValidatedState.MoreDataRequired) validatedState).getName(), managerDataSnapshot2);
            }
            if (validatedState instanceof ValidatedState.Valid) {
                return ((ValidatedState.Valid) validatedState).getState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
