package com.robinhood.android.history.p153ui;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p355ui.UiDividend;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DividendDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailViewState;", "", "requiredPageState", "Lcom/robinhood/android/history/ui/DividendDetailViewState$RequiredPageState;", "showDripHistoryUpsell", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/android/history/ui/DividendDetailViewState$RequiredPageState;Lcom/robinhood/udf/UiEvent;)V", "getRequiredPageState", "()Lcom/robinhood/android/history/ui/DividendDetailViewState$RequiredPageState;", "getShowDripHistoryUpsell", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "RequiredPageState", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DividendDetailViewState {
    public static final int $stable = 8;
    private final RequiredPageState requiredPageState;
    private final UiEvent<String> showDripHistoryUpsell;

    /* JADX WARN: Multi-variable type inference failed */
    public DividendDetailViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DividendDetailViewState copy$default(DividendDetailViewState dividendDetailViewState, RequiredPageState requiredPageState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            requiredPageState = dividendDetailViewState.requiredPageState;
        }
        if ((i & 2) != 0) {
            uiEvent = dividendDetailViewState.showDripHistoryUpsell;
        }
        return dividendDetailViewState.copy(requiredPageState, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final RequiredPageState getRequiredPageState() {
        return this.requiredPageState;
    }

    public final UiEvent<String> component2() {
        return this.showDripHistoryUpsell;
    }

    public final DividendDetailViewState copy(RequiredPageState requiredPageState, UiEvent<String> showDripHistoryUpsell) {
        return new DividendDetailViewState(requiredPageState, showDripHistoryUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DividendDetailViewState)) {
            return false;
        }
        DividendDetailViewState dividendDetailViewState = (DividendDetailViewState) other;
        return Intrinsics.areEqual(this.requiredPageState, dividendDetailViewState.requiredPageState) && Intrinsics.areEqual(this.showDripHistoryUpsell, dividendDetailViewState.showDripHistoryUpsell);
    }

    public int hashCode() {
        RequiredPageState requiredPageState = this.requiredPageState;
        int iHashCode = (requiredPageState == null ? 0 : requiredPageState.hashCode()) * 31;
        UiEvent<String> uiEvent = this.showDripHistoryUpsell;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "DividendDetailViewState(requiredPageState=" + this.requiredPageState + ", showDripHistoryUpsell=" + this.showDripHistoryUpsell + ")";
    }

    public DividendDetailViewState(RequiredPageState requiredPageState, UiEvent<String> uiEvent) {
        this.requiredPageState = requiredPageState;
        this.showDripHistoryUpsell = uiEvent;
    }

    public /* synthetic */ DividendDetailViewState(RequiredPageState requiredPageState, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requiredPageState, (i & 2) != 0 ? null : uiEvent);
    }

    public final RequiredPageState getRequiredPageState() {
        return this.requiredPageState;
    }

    public final UiEvent<String> getShowDripHistoryUpsell() {
        return this.showDripHistoryUpsell;
    }

    /* compiled from: DividendDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailViewState$RequiredPageState;", "", "uiDividend", "Lcom/robinhood/models/ui/UiDividend;", "account", "Lcom/robinhood/models/db/Account;", "tradeConfirmDocs", "", "Lcom/robinhood/models/db/Document;", "shouldShowDripStatusButton", "", "uiInstrumentDripSettings", "Lcom/robinhood/models/ui/UiInstrumentDripSettings;", "backupWithholdingResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "<init>", "(Lcom/robinhood/models/ui/UiDividend;Lcom/robinhood/models/db/Account;Ljava/util/List;ZLcom/robinhood/models/ui/UiInstrumentDripSettings;Lcom/robinhood/models/db/bonfire/WithholdingAmount;)V", "getUiDividend", "()Lcom/robinhood/models/ui/UiDividend;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getTradeConfirmDocs", "()Ljava/util/List;", "getShouldShowDripStatusButton", "()Z", "getUiInstrumentDripSettings", "()Lcom/robinhood/models/ui/UiInstrumentDripSettings;", "getBackupWithholdingResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequiredPageState {
        public static final int $stable = 8;
        private final Account account;
        private final WithholdingAmount backupWithholdingResponse;
        private final boolean shouldShowDripStatusButton;
        private final List<Document> tradeConfirmDocs;
        private final UiDividend uiDividend;
        private final UiInstrumentDripSettings uiInstrumentDripSettings;

        public static /* synthetic */ RequiredPageState copy$default(RequiredPageState requiredPageState, UiDividend uiDividend, Account account, List list, boolean z, UiInstrumentDripSettings uiInstrumentDripSettings, WithholdingAmount withholdingAmount, int i, Object obj) {
            if ((i & 1) != 0) {
                uiDividend = requiredPageState.uiDividend;
            }
            if ((i & 2) != 0) {
                account = requiredPageState.account;
            }
            if ((i & 4) != 0) {
                list = requiredPageState.tradeConfirmDocs;
            }
            if ((i & 8) != 0) {
                z = requiredPageState.shouldShowDripStatusButton;
            }
            if ((i & 16) != 0) {
                uiInstrumentDripSettings = requiredPageState.uiInstrumentDripSettings;
            }
            if ((i & 32) != 0) {
                withholdingAmount = requiredPageState.backupWithholdingResponse;
            }
            UiInstrumentDripSettings uiInstrumentDripSettings2 = uiInstrumentDripSettings;
            WithholdingAmount withholdingAmount2 = withholdingAmount;
            return requiredPageState.copy(uiDividend, account, list, z, uiInstrumentDripSettings2, withholdingAmount2);
        }

        /* renamed from: component1, reason: from getter */
        public final UiDividend getUiDividend() {
            return this.uiDividend;
        }

        /* renamed from: component2, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        public final List<Document> component3() {
            return this.tradeConfirmDocs;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldShowDripStatusButton() {
            return this.shouldShowDripStatusButton;
        }

        /* renamed from: component5, reason: from getter */
        public final UiInstrumentDripSettings getUiInstrumentDripSettings() {
            return this.uiInstrumentDripSettings;
        }

        /* renamed from: component6, reason: from getter */
        public final WithholdingAmount getBackupWithholdingResponse() {
            return this.backupWithholdingResponse;
        }

        public final RequiredPageState copy(UiDividend uiDividend, Account account, List<Document> tradeConfirmDocs, boolean shouldShowDripStatusButton, UiInstrumentDripSettings uiInstrumentDripSettings, WithholdingAmount backupWithholdingResponse) {
            Intrinsics.checkNotNullParameter(uiDividend, "uiDividend");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(tradeConfirmDocs, "tradeConfirmDocs");
            return new RequiredPageState(uiDividend, account, tradeConfirmDocs, shouldShowDripStatusButton, uiInstrumentDripSettings, backupWithholdingResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequiredPageState)) {
                return false;
            }
            RequiredPageState requiredPageState = (RequiredPageState) other;
            return Intrinsics.areEqual(this.uiDividend, requiredPageState.uiDividend) && Intrinsics.areEqual(this.account, requiredPageState.account) && Intrinsics.areEqual(this.tradeConfirmDocs, requiredPageState.tradeConfirmDocs) && this.shouldShowDripStatusButton == requiredPageState.shouldShowDripStatusButton && Intrinsics.areEqual(this.uiInstrumentDripSettings, requiredPageState.uiInstrumentDripSettings) && Intrinsics.areEqual(this.backupWithholdingResponse, requiredPageState.backupWithholdingResponse);
        }

        public int hashCode() {
            int iHashCode = ((((((this.uiDividend.hashCode() * 31) + this.account.hashCode()) * 31) + this.tradeConfirmDocs.hashCode()) * 31) + Boolean.hashCode(this.shouldShowDripStatusButton)) * 31;
            UiInstrumentDripSettings uiInstrumentDripSettings = this.uiInstrumentDripSettings;
            int iHashCode2 = (iHashCode + (uiInstrumentDripSettings == null ? 0 : uiInstrumentDripSettings.hashCode())) * 31;
            WithholdingAmount withholdingAmount = this.backupWithholdingResponse;
            return iHashCode2 + (withholdingAmount != null ? withholdingAmount.hashCode() : 0);
        }

        public String toString() {
            return "RequiredPageState(uiDividend=" + this.uiDividend + ", account=" + this.account + ", tradeConfirmDocs=" + this.tradeConfirmDocs + ", shouldShowDripStatusButton=" + this.shouldShowDripStatusButton + ", uiInstrumentDripSettings=" + this.uiInstrumentDripSettings + ", backupWithholdingResponse=" + this.backupWithholdingResponse + ")";
        }

        public RequiredPageState(UiDividend uiDividend, Account account, List<Document> tradeConfirmDocs, boolean z, UiInstrumentDripSettings uiInstrumentDripSettings, WithholdingAmount withholdingAmount) {
            Intrinsics.checkNotNullParameter(uiDividend, "uiDividend");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(tradeConfirmDocs, "tradeConfirmDocs");
            this.uiDividend = uiDividend;
            this.account = account;
            this.tradeConfirmDocs = tradeConfirmDocs;
            this.shouldShowDripStatusButton = z;
            this.uiInstrumentDripSettings = uiInstrumentDripSettings;
            this.backupWithholdingResponse = withholdingAmount;
        }

        public final UiDividend getUiDividend() {
            return this.uiDividend;
        }

        public final Account getAccount() {
            return this.account;
        }

        public final List<Document> getTradeConfirmDocs() {
            return this.tradeConfirmDocs;
        }

        public final boolean getShouldShowDripStatusButton() {
            return this.shouldShowDripStatusButton;
        }

        public final UiInstrumentDripSettings getUiInstrumentDripSettings() {
            return this.uiInstrumentDripSettings;
        }

        public final WithholdingAmount getBackupWithholdingResponse() {
            return this.backupWithholdingResponse;
        }
    }
}
