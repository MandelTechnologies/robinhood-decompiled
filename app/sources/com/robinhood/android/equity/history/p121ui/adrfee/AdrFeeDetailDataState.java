package com.robinhood.android.equity.history.p121ui.adrfee;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiAdrFee;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDataState;", "", "uiAdrFee", "Lcom/robinhood/models/ui/UiAdrFee;", "account", "Lcom/robinhood/models/db/Account;", "disclosureMarkdown", "", "<init>", "(Lcom/robinhood/models/ui/UiAdrFee;Lcom/robinhood/models/db/Account;Ljava/lang/String;)V", "getUiAdrFee", "()Lcom/robinhood/models/ui/UiAdrFee;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getDisclosureMarkdown", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdrFeeDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final String disclosureMarkdown;
    private final UiAdrFee uiAdrFee;

    public AdrFeeDetailDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdrFeeDetailDataState copy$default(AdrFeeDetailDataState adrFeeDetailDataState, UiAdrFee uiAdrFee, Account account, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAdrFee = adrFeeDetailDataState.uiAdrFee;
        }
        if ((i & 2) != 0) {
            account = adrFeeDetailDataState.account;
        }
        if ((i & 4) != 0) {
            str = adrFeeDetailDataState.disclosureMarkdown;
        }
        return adrFeeDetailDataState.copy(uiAdrFee, account, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAdrFee getUiAdrFee() {
        return this.uiAdrFee;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final AdrFeeDetailDataState copy(UiAdrFee uiAdrFee, Account account, String disclosureMarkdown) {
        return new AdrFeeDetailDataState(uiAdrFee, account, disclosureMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdrFeeDetailDataState)) {
            return false;
        }
        AdrFeeDetailDataState adrFeeDetailDataState = (AdrFeeDetailDataState) other;
        return Intrinsics.areEqual(this.uiAdrFee, adrFeeDetailDataState.uiAdrFee) && Intrinsics.areEqual(this.account, adrFeeDetailDataState.account) && Intrinsics.areEqual(this.disclosureMarkdown, adrFeeDetailDataState.disclosureMarkdown);
    }

    public int hashCode() {
        UiAdrFee uiAdrFee = this.uiAdrFee;
        int iHashCode = (uiAdrFee == null ? 0 : uiAdrFee.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.disclosureMarkdown;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AdrFeeDetailDataState(uiAdrFee=" + this.uiAdrFee + ", account=" + this.account + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
    }

    public AdrFeeDetailDataState(UiAdrFee uiAdrFee, Account account, String str) {
        this.uiAdrFee = uiAdrFee;
        this.account = account;
        this.disclosureMarkdown = str;
    }

    public /* synthetic */ AdrFeeDetailDataState(UiAdrFee uiAdrFee, Account account, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiAdrFee, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : str);
    }

    public final UiAdrFee getUiAdrFee() {
        return this.uiAdrFee;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }
}
