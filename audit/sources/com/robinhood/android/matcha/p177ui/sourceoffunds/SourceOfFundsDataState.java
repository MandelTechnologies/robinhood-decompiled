package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceOfFundsDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018JT\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;", "", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "selectedAccountId", "", "selectionEvent", "Lcom/robinhood/udf/UiEvent;", "transferBanners", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "hasActiveDebitCard", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;Ljava/lang/Boolean;)V", "getTransferAccounts", "()Ljava/util/List;", "getSelectedAccountId", "()Ljava/lang/String;", "getSelectionEvent", "()Lcom/robinhood/udf/UiEvent;", "getTransferBanners", "()Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "getHasActiveDebitCard", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;Ljava/lang/Boolean;)Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SourceOfFundsDataState {
    public static final int $stable = 8;
    private final Boolean hasActiveDebitCard;
    private final String selectedAccountId;
    private final UiEvent<TransferAccount> selectionEvent;
    private final List<TransferAccount> transferAccounts;
    private final ApiTransferBanners transferBanners;

    public SourceOfFundsDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SourceOfFundsDataState copy$default(SourceOfFundsDataState sourceOfFundsDataState, List list, String str, UiEvent uiEvent, ApiTransferBanners apiTransferBanners, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sourceOfFundsDataState.transferAccounts;
        }
        if ((i & 2) != 0) {
            str = sourceOfFundsDataState.selectedAccountId;
        }
        if ((i & 4) != 0) {
            uiEvent = sourceOfFundsDataState.selectionEvent;
        }
        if ((i & 8) != 0) {
            apiTransferBanners = sourceOfFundsDataState.transferBanners;
        }
        if ((i & 16) != 0) {
            bool = sourceOfFundsDataState.hasActiveDebitCard;
        }
        Boolean bool2 = bool;
        UiEvent uiEvent2 = uiEvent;
        return sourceOfFundsDataState.copy(list, str, uiEvent2, apiTransferBanners, bool2);
    }

    public final List<TransferAccount> component1() {
        return this.transferAccounts;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final UiEvent<TransferAccount> component3() {
        return this.selectionEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiTransferBanners getTransferBanners() {
        return this.transferBanners;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasActiveDebitCard() {
        return this.hasActiveDebitCard;
    }

    public final SourceOfFundsDataState copy(List<TransferAccount> transferAccounts, String selectedAccountId, UiEvent<TransferAccount> selectionEvent, ApiTransferBanners transferBanners, Boolean hasActiveDebitCard) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        return new SourceOfFundsDataState(transferAccounts, selectedAccountId, selectionEvent, transferBanners, hasActiveDebitCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceOfFundsDataState)) {
            return false;
        }
        SourceOfFundsDataState sourceOfFundsDataState = (SourceOfFundsDataState) other;
        return Intrinsics.areEqual(this.transferAccounts, sourceOfFundsDataState.transferAccounts) && Intrinsics.areEqual(this.selectedAccountId, sourceOfFundsDataState.selectedAccountId) && Intrinsics.areEqual(this.selectionEvent, sourceOfFundsDataState.selectionEvent) && Intrinsics.areEqual(this.transferBanners, sourceOfFundsDataState.transferBanners) && Intrinsics.areEqual(this.hasActiveDebitCard, sourceOfFundsDataState.hasActiveDebitCard);
    }

    public int hashCode() {
        int iHashCode = this.transferAccounts.hashCode() * 31;
        String str = this.selectedAccountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<TransferAccount> uiEvent = this.selectionEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        ApiTransferBanners apiTransferBanners = this.transferBanners;
        int iHashCode4 = (iHashCode3 + (apiTransferBanners == null ? 0 : apiTransferBanners.hashCode())) * 31;
        Boolean bool = this.hasActiveDebitCard;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SourceOfFundsDataState(transferAccounts=" + this.transferAccounts + ", selectedAccountId=" + this.selectedAccountId + ", selectionEvent=" + this.selectionEvent + ", transferBanners=" + this.transferBanners + ", hasActiveDebitCard=" + this.hasActiveDebitCard + ")";
    }

    public SourceOfFundsDataState(List<TransferAccount> transferAccounts, String str, UiEvent<TransferAccount> uiEvent, ApiTransferBanners apiTransferBanners, Boolean bool) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        this.transferAccounts = transferAccounts;
        this.selectedAccountId = str;
        this.selectionEvent = uiEvent;
        this.transferBanners = apiTransferBanners;
        this.hasActiveDebitCard = bool;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SourceOfFundsDataState(java.util.List r2, java.lang.String r3, com.robinhood.udf.UiEvent r4, com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners r5, java.lang.Boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Le
            r3 = r0
        Le:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            r4 = r0
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            r5 = r0
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsDataState.<init>(java.util.List, java.lang.String, com.robinhood.udf.UiEvent, com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final UiEvent<TransferAccount> getSelectionEvent() {
        return this.selectionEvent;
    }

    public final ApiTransferBanners getTransferBanners() {
        return this.transferBanners;
    }

    public final Boolean getHasActiveDebitCard() {
        return this.hasActiveDebitCard;
    }
}
