package com.robinhood.android.portfolio.positionsSortOptions;

import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;", "", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "sortOptions", "", "Lcom/robinhood/android/models/portfolio/PositionsSortOptions$SortOption;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "sortPersistPending", "", "dismissed", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Ljava/util/List;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getSortOptions", "()Ljava/util/List;", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "getSortPersistPending", "()Z", "getDismissed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PositionsSortOptionsDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final boolean dismissed;
    private final PositionInstrumentType positionInstrumentType;
    private final List<PositionsSortOptions.SortOption> sortOptions;
    private final boolean sortPersistPending;
    private final PositionsSortPreference sortPreference;

    public static /* synthetic */ PositionsSortOptionsDataState copy$default(PositionsSortOptionsDataState positionsSortOptionsDataState, String str, PositionInstrumentType positionInstrumentType, List list, PositionsSortPreference positionsSortPreference, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionsSortOptionsDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            positionInstrumentType = positionsSortOptionsDataState.positionInstrumentType;
        }
        if ((i & 4) != 0) {
            list = positionsSortOptionsDataState.sortOptions;
        }
        if ((i & 8) != 0) {
            positionsSortPreference = positionsSortOptionsDataState.sortPreference;
        }
        if ((i & 16) != 0) {
            z = positionsSortOptionsDataState.sortPersistPending;
        }
        if ((i & 32) != 0) {
            z2 = positionsSortOptionsDataState.dismissed;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return positionsSortOptionsDataState.copy(str, positionInstrumentType, list, positionsSortPreference, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    public final List<PositionsSortOptions.SortOption> component3() {
        return this.sortOptions;
    }

    /* renamed from: component4, reason: from getter */
    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSortPersistPending() {
        return this.sortPersistPending;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDismissed() {
        return this.dismissed;
    }

    public final PositionsSortOptionsDataState copy(String accountNumber, PositionInstrumentType positionInstrumentType, List<PositionsSortOptions.SortOption> sortOptions, PositionsSortPreference sortPreference, boolean sortPersistPending, boolean dismissed) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        return new PositionsSortOptionsDataState(accountNumber, positionInstrumentType, sortOptions, sortPreference, sortPersistPending, dismissed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsSortOptionsDataState)) {
            return false;
        }
        PositionsSortOptionsDataState positionsSortOptionsDataState = (PositionsSortOptionsDataState) other;
        return Intrinsics.areEqual(this.accountNumber, positionsSortOptionsDataState.accountNumber) && this.positionInstrumentType == positionsSortOptionsDataState.positionInstrumentType && Intrinsics.areEqual(this.sortOptions, positionsSortOptionsDataState.sortOptions) && Intrinsics.areEqual(this.sortPreference, positionsSortOptionsDataState.sortPreference) && this.sortPersistPending == positionsSortOptionsDataState.sortPersistPending && this.dismissed == positionsSortOptionsDataState.dismissed;
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.positionInstrumentType.hashCode()) * 31;
        List<PositionsSortOptions.SortOption> list = this.sortOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        PositionsSortPreference positionsSortPreference = this.sortPreference;
        return ((((iHashCode2 + (positionsSortPreference != null ? positionsSortPreference.hashCode() : 0)) * 31) + Boolean.hashCode(this.sortPersistPending)) * 31) + Boolean.hashCode(this.dismissed);
    }

    public String toString() {
        return "PositionsSortOptionsDataState(accountNumber=" + this.accountNumber + ", positionInstrumentType=" + this.positionInstrumentType + ", sortOptions=" + this.sortOptions + ", sortPreference=" + this.sortPreference + ", sortPersistPending=" + this.sortPersistPending + ", dismissed=" + this.dismissed + ")";
    }

    public PositionsSortOptionsDataState(String accountNumber, PositionInstrumentType positionInstrumentType, List<PositionsSortOptions.SortOption> list, PositionsSortPreference positionsSortPreference, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        this.accountNumber = accountNumber;
        this.positionInstrumentType = positionInstrumentType;
        this.sortOptions = list;
        this.sortPreference = positionsSortPreference;
        this.sortPersistPending = z;
        this.dismissed = z2;
    }

    public /* synthetic */ PositionsSortOptionsDataState(String str, PositionInstrumentType positionInstrumentType, List list, PositionsSortPreference positionsSortPreference, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, positionInstrumentType, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : positionsSortPreference, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    public final List<PositionsSortOptions.SortOption> getSortOptions() {
        return this.sortOptions;
    }

    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }

    public final boolean getSortPersistPending() {
        return this.sortPersistPending;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }
}
