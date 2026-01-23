package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxoEvents;", "", "<init>", "()V", "ShowError", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxoEvents$ShowError;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxoEvents, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class DirectDepositBrokerageExperimentDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ DirectDepositBrokerageExperimentDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxoEvents$ShowError;", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxoEvents;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxoEvents$ShowError, reason: from toString */
    public static final /* data */ class ShowError extends DirectDepositBrokerageExperimentDuxo2 {
        public static final int $stable = 8;
        private final Exception exception;

        public static /* synthetic */ ShowError copy$default(ShowError showError, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = showError.exception;
            }
            return showError.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public final ShowError copy(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new ShowError(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.areEqual(this.exception, ((ShowError) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "ShowError(exception=" + this.exception + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Exception getException() {
            return this.exception;
        }
    }

    private DirectDepositBrokerageExperimentDuxo2() {
    }
}
