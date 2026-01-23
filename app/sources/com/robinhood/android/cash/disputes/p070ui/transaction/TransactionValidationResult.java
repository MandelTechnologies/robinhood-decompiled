package com.robinhood.android.cash.disputes.p070ui.transaction;

import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionValidationResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult;", "", "<init>", "()V", "Success", "Error", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult$Success;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class TransactionValidationResult {
    public static final int $stable = 0;

    public /* synthetic */ TransactionValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransactionValidationResult() {
    }

    /* compiled from: TransactionValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult$Success;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult;", "validatedTransactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "<init>", "(Ljava/util/List;)V", "getValidatedTransactions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends TransactionValidationResult {
        public static final int $stable = 8;
        private final List<SettledCardTransaction> validatedTransactions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.validatedTransactions;
            }
            return success.copy(list);
        }

        public final List<SettledCardTransaction> component1() {
            return this.validatedTransactions;
        }

        public final Success copy(List<SettledCardTransaction> validatedTransactions) {
            Intrinsics.checkNotNullParameter(validatedTransactions, "validatedTransactions");
            return new Success(validatedTransactions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.validatedTransactions, ((Success) other).validatedTransactions);
        }

        public int hashCode() {
            return this.validatedTransactions.hashCode();
        }

        public String toString() {
            return "Success(validatedTransactions=" + this.validatedTransactions + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<SettledCardTransaction> validatedTransactions) {
            super(null);
            Intrinsics.checkNotNullParameter(validatedTransactions, "validatedTransactions");
            this.validatedTransactions = validatedTransactions;
        }

        public final List<SettledCardTransaction> getValidatedTransactions() {
            return this.validatedTransactions;
        }
    }

    /* compiled from: TransactionValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends TransactionValidationResult {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
