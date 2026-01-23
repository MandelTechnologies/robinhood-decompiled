package com.robinhood.android.advisory.history.fee;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.fee.AdvisoryFee;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryFeeDetailsDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState;", "", "fee", "Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;Lcom/robinhood/models/db/Account;)V", "getFee", "()Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;", "getAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Reducer", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFeeDetailsDataState {
    private final Account account;
    private final AdvisoryFee fee;

    /* renamed from: Reducer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisoryFeeDetailsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvisoryFeeDetailsDataState copy$default(AdvisoryFeeDetailsDataState advisoryFeeDetailsDataState, AdvisoryFee advisoryFee, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            advisoryFee = advisoryFeeDetailsDataState.fee;
        }
        if ((i & 2) != 0) {
            account = advisoryFeeDetailsDataState.account;
        }
        return advisoryFeeDetailsDataState.copy(advisoryFee, account);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisoryFee getFee() {
        return this.fee;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final AdvisoryFeeDetailsDataState copy(AdvisoryFee fee, Account account) {
        return new AdvisoryFeeDetailsDataState(fee, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFeeDetailsDataState)) {
            return false;
        }
        AdvisoryFeeDetailsDataState advisoryFeeDetailsDataState = (AdvisoryFeeDetailsDataState) other;
        return Intrinsics.areEqual(this.fee, advisoryFeeDetailsDataState.fee) && Intrinsics.areEqual(this.account, advisoryFeeDetailsDataState.account);
    }

    public int hashCode() {
        AdvisoryFee advisoryFee = this.fee;
        int iHashCode = (advisoryFee == null ? 0 : advisoryFee.hashCode()) * 31;
        Account account = this.account;
        return iHashCode + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryFeeDetailsDataState(fee=" + this.fee + ", account=" + this.account + ")";
    }

    public AdvisoryFeeDetailsDataState(AdvisoryFee advisoryFee, Account account) {
        this.fee = advisoryFee;
        this.account = account;
    }

    public /* synthetic */ AdvisoryFeeDetailsDataState(AdvisoryFee advisoryFee, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisoryFee, (i & 2) != 0 ? null : account);
    }

    public final AdvisoryFee getFee() {
        return this.fee;
    }

    public final Account getAccount() {
        return this.account;
    }

    /* compiled from: AdvisoryFeeDetailsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState$Reducer;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDataState$Reducer, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<AdvisoryFeeDetailsDataState, AdvisoryFeeDetailsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryFeeDetailsViewState reduce(AdvisoryFeeDetailsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getFee() != null && dataState.getAccount() != null) {
                StringResource title = AccountDisplayNames.getDisplayName(dataState.getAccount()).getShort().getTitle();
                List<AdvisoryFee.AdvisoryFeeData> data = dataState.getFee().getData();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                for (AdvisoryFee.AdvisoryFeeData advisoryFeeData : data) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    arrayList.add(new LineItem(companion.invoke(advisoryFeeData.getLabel()), companion.invoke(advisoryFeeData.getValue()), advisoryFeeData.getBottomSheet()));
                }
                return new AdvisoryFeeDetailsViewState.Loaded(title, extensions2.toPersistentList(arrayList));
            }
            return AdvisoryFeeDetailsViewState.Loading.INSTANCE;
        }
    }
}
