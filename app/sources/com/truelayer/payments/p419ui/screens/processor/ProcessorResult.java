package com.truelayer.payments.p419ui.screens.processor;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessorResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "Landroid/os/Parcelable;", "Companion", "Failure", "FailureReason", "PaymentStep", "ResultCode", "Successful", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ProcessorResult extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Companion;", "", "()V", Companion.RESULT_KEY, "", "resultIntent", "Landroid/content/Intent;", "result", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "resultIntent$payments_ui_release", "unwrapResult", "intent", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String RESULT_KEY = "RESULT_KEY";

        private Companion() {
        }

        public final Intent resultIntent$payments_ui_release(ProcessorResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intent intent = new Intent();
            intent.putExtra(RESULT_KEY, result);
            return intent;
        }

        public final ProcessorResult unwrapResult(Intent intent) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (intent != null) {
                    return (ProcessorResult) intent.getParcelableExtra(RESULT_KEY, ProcessorResult.class);
                }
                return null;
            }
            if (intent != null) {
                return (ProcessorResult) intent.getParcelableExtra(RESULT_KEY);
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$ResultCode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "SUCCESS", "FAILURE", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ResultCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultCode[] $VALUES;
        private final int code;
        public static final ResultCode SUCCESS = new ResultCode("SUCCESS", 0, 10);
        public static final ResultCode FAILURE = new ResultCode("FAILURE", 1, 11);

        private static final /* synthetic */ ResultCode[] $values() {
            return new ResultCode[]{SUCCESS, FAILURE};
        }

        public static EnumEntries<ResultCode> getEntries() {
            return $ENTRIES;
        }

        public static ResultCode valueOf(String str) {
            return (ResultCode) Enum.valueOf(ResultCode.class, str);
        }

        public static ResultCode[] values() {
            return (ResultCode[]) $VALUES.clone();
        }

        private ResultCode(String str, int i, int i2) {
            this.code = i2;
        }

        public final int getCode() {
            return this.code;
        }

        static {
            ResultCode[] resultCodeArr$values = $values();
            $VALUES = resultCodeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultCodeArr$values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;", "", "(Ljava/lang/String;I)V", "toAnalyticsReturnToHostAppReason", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp$Reason;", "toAnalyticsReturnToHostAppReason$payments_ui_release", "NoInternet", "UserAborted", "UserAbortedProviderTemporarilyUnavailable", "UserAbortedFailedToNotifyBackend", "UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend", "CommunicationIssue", "ConnectionSecurityIssue", "PaymentFailed", "WaitAbandoned", "WaitTokenExpired", "ProcessorContextNotAvailable", "InvalidResource", "Unknown", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class FailureReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason NoInternet = new FailureReason("NoInternet", 0);
        public static final FailureReason UserAborted = new FailureReason("UserAborted", 1);
        public static final FailureReason UserAbortedProviderTemporarilyUnavailable = new FailureReason("UserAbortedProviderTemporarilyUnavailable", 2);
        public static final FailureReason UserAbortedFailedToNotifyBackend = new FailureReason("UserAbortedFailedToNotifyBackend", 3);
        public static final FailureReason UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend = new FailureReason("UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend", 4);
        public static final FailureReason CommunicationIssue = new FailureReason("CommunicationIssue", 5);
        public static final FailureReason ConnectionSecurityIssue = new FailureReason("ConnectionSecurityIssue", 6);
        public static final FailureReason PaymentFailed = new FailureReason("PaymentFailed", 7);
        public static final FailureReason WaitAbandoned = new FailureReason("WaitAbandoned", 8);
        public static final FailureReason WaitTokenExpired = new FailureReason("WaitTokenExpired", 9);
        public static final FailureReason ProcessorContextNotAvailable = new FailureReason("ProcessorContextNotAvailable", 10);
        public static final FailureReason InvalidResource = new FailureReason("InvalidResource", 11);
        public static final FailureReason Unknown = new FailureReason("Unknown", 12);

        /* compiled from: ProcessorResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FailureReason.values().length];
                try {
                    iArr[FailureReason.NoInternet.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FailureReason.CommunicationIssue.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FailureReason.ConnectionSecurityIssue.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FailureReason.PaymentFailed.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FailureReason.WaitTokenExpired.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FailureReason.ProcessorContextNotAvailable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FailureReason.InvalidResource.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FailureReason.Unknown.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FailureReason.WaitAbandoned.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[FailureReason.UserAborted.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[FailureReason.UserAbortedFailedToNotifyBackend.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[FailureReason.UserAbortedProviderTemporarilyUnavailable.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[FailureReason.UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ FailureReason[] $values() {
            return new FailureReason[]{NoInternet, UserAborted, UserAbortedProviderTemporarilyUnavailable, UserAbortedFailedToNotifyBackend, UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend, CommunicationIssue, ConnectionSecurityIssue, PaymentFailed, WaitAbandoned, WaitTokenExpired, ProcessorContextNotAvailable, InvalidResource, Unknown};
        }

        public static EnumEntries<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        private FailureReason(String str, int i) {
        }

        static {
            FailureReason[] failureReasonArr$values = $values();
            $VALUES = failureReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureReasonArr$values);
        }

        public final AnalyticsEvents.SDKReturnToHostApp.Reason toAnalyticsReturnToHostAppReason$payments_ui_release() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return AnalyticsEvents.SDKReturnToHostApp.Reason.Failure;
                case 9:
                    return AnalyticsEvents.SDKReturnToHostApp.Reason.Abort;
                case 10:
                case 11:
                    return AnalyticsEvents.SDKReturnToHostApp.Reason.Abort;
                case 12:
                case 13:
                    return AnalyticsEvents.SDKReturnToHostApp.Reason.AbortProviderTemporarilyUnavailable;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$PaymentStep;", "", "(Ljava/lang/String;I)V", "Redirect", "Wait", "Authorized", "Successful", "Settled", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentStep {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentStep[] $VALUES;
        public static final PaymentStep Redirect = new PaymentStep("Redirect", 0);
        public static final PaymentStep Wait = new PaymentStep("Wait", 1);
        public static final PaymentStep Authorized = new PaymentStep("Authorized", 2);
        public static final PaymentStep Successful = new PaymentStep("Successful", 3);
        public static final PaymentStep Settled = new PaymentStep("Settled", 4);

        private static final /* synthetic */ PaymentStep[] $values() {
            return new PaymentStep[]{Redirect, Wait, Authorized, Successful, Settled};
        }

        public static EnumEntries<PaymentStep> getEntries() {
            return $ENTRIES;
        }

        public static PaymentStep valueOf(String str) {
            return (PaymentStep) Enum.valueOf(PaymentStep.class, str);
        }

        public static PaymentStep[] values() {
            return (PaymentStep[]) $VALUES.clone();
        }

        private PaymentStep(String str, int i) {
        }

        static {
            PaymentStep[] paymentStepArr$values = $values();
            $VALUES = paymentStepArr$values;
            $ENTRIES = EnumEntries2.enumEntries(paymentStepArr$values);
        }
    }

    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "reason", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;)V", "getReason", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements ProcessorResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final FailureReason reason;

        /* compiled from: ProcessorResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure(FailureReason.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        public static /* synthetic */ Failure copy$default(Failure failure, FailureReason failureReason, int i, Object obj) {
            if ((i & 1) != 0) {
                failureReason = failure.reason;
            }
            return failure.copy(failureReason);
        }

        /* renamed from: component1, reason: from getter */
        public final FailureReason getReason() {
            return this.reason;
        }

        public final Failure copy(FailureReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(reason);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && this.reason == ((Failure) other).reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.reason.name());
        }

        public Failure(FailureReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final FailureReason getReason() {
            return this.reason;
        }
    }

    /* compiled from: ProcessorResult.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "step", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$PaymentStep;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$PaymentStep;)V", "getStep", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$PaymentStep;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Successful implements ProcessorResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Successful> CREATOR = new Creator();
        private final PaymentStep step;

        /* compiled from: ProcessorResult.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Successful> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Successful createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Successful(PaymentStep.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Successful[] newArray(int i) {
                return new Successful[i];
            }
        }

        public static /* synthetic */ Successful copy$default(Successful successful, PaymentStep paymentStep, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentStep = successful.step;
            }
            return successful.copy(paymentStep);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentStep getStep() {
            return this.step;
        }

        public final Successful copy(PaymentStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new Successful(step);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Successful) && this.step == ((Successful) other).step;
        }

        public int hashCode() {
            return this.step.hashCode();
        }

        public String toString() {
            return "Successful(step=" + this.step + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.step.name());
        }

        public Successful(PaymentStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
        }

        public final PaymentStep getStep() {
            return this.step;
        }
    }
}
