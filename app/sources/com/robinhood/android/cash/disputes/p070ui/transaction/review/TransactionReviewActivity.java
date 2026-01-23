package com.robinhood.android.cash.disputes.p070ui.transaction.review;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.p070ui.transaction.review.TransactionReviewFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.utils.extensions.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionReviewActivity.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u001b\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewFragment$Callbacks;", "<init>", "()V", "transactionArgs", "Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Args;", "getTransactionArgs", "()Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Args;", "transactionArgs$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTransactionsConfirmed", "selectedTransactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Result", "ResultContract", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TransactionReviewActivity extends BaseActivity implements RegionGated, TransactionReviewFragment.Callbacks {
    private static final String EXTRA_TRANSACTION_ARGS = "extraTransactionArgs";
    private static final String EXTRA_TRANSACTION_RESULT = "extraTransactionResult";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: transactionArgs$delegate, reason: from kotlin metadata */
    private final Lazy transactionArgs;
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public TransactionReviewActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.transactionArgs = Activity.intentExtra(this, EXTRA_TRANSACTION_ARGS);
    }

    private final Args getTransactionArgs() {
        return (Args) this.transactionArgs.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C10007R.id.fragment_container, TransactionReviewFragment.INSTANCE.newInstance((Parcelable) new TransactionReviewFragment.Args(getTransactionArgs().getDisputeReason(), getTransactionArgs().getTransactions(), getTransactionArgs().getPreSelectedTransactionId())));
        }
    }

    @Override // com.robinhood.android.cash.disputes.ui.transaction.review.TransactionReviewFragment.Callbacks
    public void onTransactionsConfirmed(List<SettledCardTransaction> selectedTransactions) {
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        Intent intent = new Intent();
        intent.putExtra(EXTRA_TRANSACTION_RESULT, new Result(selectedTransactions));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* compiled from: TransactionReviewActivity.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Args;", "Landroid/os/Parcelable;", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "preSelectedTransactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/api/minerva/ApiDispute$Reason;Ljava/util/List;Ljava/util/UUID;)V", "getDisputeReason", "()Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "getTransactions", "()Ljava/util/List;", "getPreSelectedTransactionId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDispute.Reason disputeReason;
        private final UUID preSelectedTransactionId;
        private final List<SettledCardTransaction> transactions;

        /* compiled from: TransactionReviewActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiDispute.Reason reasonValueOf = ApiDispute.Reason.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(reasonValueOf, arrayList, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, ApiDispute.Reason reason, List list, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = args.disputeReason;
            }
            if ((i & 2) != 0) {
                list = args.transactions;
            }
            if ((i & 4) != 0) {
                uuid = args.preSelectedTransactionId;
            }
            return args.copy(reason, list, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }

        public final List<SettledCardTransaction> component2() {
            return this.transactions;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getPreSelectedTransactionId() {
            return this.preSelectedTransactionId;
        }

        public final Args copy(ApiDispute.Reason disputeReason, List<SettledCardTransaction> transactions, UUID preSelectedTransactionId) {
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            return new Args(disputeReason, transactions, preSelectedTransactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.disputeReason == args.disputeReason && Intrinsics.areEqual(this.transactions, args.transactions) && Intrinsics.areEqual(this.preSelectedTransactionId, args.preSelectedTransactionId);
        }

        public int hashCode() {
            int iHashCode = ((this.disputeReason.hashCode() * 31) + this.transactions.hashCode()) * 31;
            UUID uuid = this.preSelectedTransactionId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Args(disputeReason=" + this.disputeReason + ", transactions=" + this.transactions + ", preSelectedTransactionId=" + this.preSelectedTransactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.disputeReason.name());
            List<SettledCardTransaction> list = this.transactions;
            dest.writeInt(list.size());
            Iterator<SettledCardTransaction> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeSerializable(this.preSelectedTransactionId);
        }

        public Args(ApiDispute.Reason disputeReason, List<SettledCardTransaction> transactions, UUID uuid) {
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            this.disputeReason = disputeReason;
            this.transactions = transactions;
            this.preSelectedTransactionId = uuid;
        }

        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }

        public final List<SettledCardTransaction> getTransactions() {
            return this.transactions;
        }

        public final UUID getPreSelectedTransactionId() {
            return this.preSelectedTransactionId;
        }
    }

    /* compiled from: TransactionReviewActivity.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Result;", "Landroid/os/Parcelable;", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "<init>", "(Ljava/util/List;)V", "getTransactions", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final List<SettledCardTransaction> transactions;

        /* compiled from: TransactionReviewActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Result.class.getClassLoader()));
                }
                return new Result(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = result.transactions;
            }
            return result.copy(list);
        }

        public final List<SettledCardTransaction> component1() {
            return this.transactions;
        }

        public final Result copy(List<SettledCardTransaction> transactions) {
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            return new Result(transactions);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.transactions, ((Result) other).transactions);
        }

        public int hashCode() {
            return this.transactions.hashCode();
        }

        public String toString() {
            return "Result(transactions=" + this.transactions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<SettledCardTransaction> list = this.transactions;
            dest.writeInt(list.size());
            Iterator<SettledCardTransaction> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public Result(List<SettledCardTransaction> transactions) {
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            this.transactions = transactions;
        }

        public final List<SettledCardTransaction> getTransactions() {
            return this.transactions;
        }
    }

    /* compiled from: TransactionReviewActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$ResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Args;", "Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Result;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ResultContract extends ActivityResultContract<Args, Result> {
        public static final ResultContract INSTANCE = new ResultContract();
        public static final int $stable = 8;

        private ResultContract() {
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Args input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intent = new Intent(context, (Class<?>) TransactionReviewActivity.class);
            intent.putExtra(TransactionReviewActivity.EXTRA_TRANSACTION_ARGS, input);
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public Result parseResult(int resultCode, Intent intent) {
            if (resultCode != -1 || intent == null) {
                return null;
            }
            return (Result) intent.getParcelableExtra(TransactionReviewActivity.EXTRA_TRANSACTION_RESULT);
        }
    }
}
