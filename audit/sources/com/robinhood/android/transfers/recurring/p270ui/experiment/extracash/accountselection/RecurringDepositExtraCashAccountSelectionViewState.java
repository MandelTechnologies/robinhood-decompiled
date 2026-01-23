package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringDepositExtraCashAccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState;", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState$Row;", "isAddAccountButtonVisible", "", "infoBannerMessage", "Landroidx/compose/ui/text/AnnotatedString;", "isContinueButtonEnabled", "selectedBankAccount", "Lcom/robinhood/models/db/AchRelationship;", "selectedRobinhoodAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/ui/text/AnnotatedString;ZLcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getInfoBannerMessage", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedBankAccount", "()Lcom/robinhood/models/db/AchRelationship;", "getSelectedRobinhoodAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "Row", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositExtraCashAccountSelectionViewState {
    public static final int $stable = 8;
    private final AnnotatedString infoBannerMessage;
    private final boolean isAddAccountButtonVisible;
    private final boolean isContinueButtonEnabled;
    private final ImmutableList<Row> rows;
    private final AchRelationship selectedBankAccount;
    private final TransferAccount selectedRobinhoodAccount;

    public static /* synthetic */ RecurringDepositExtraCashAccountSelectionViewState copy$default(RecurringDepositExtraCashAccountSelectionViewState recurringDepositExtraCashAccountSelectionViewState, ImmutableList immutableList, boolean z, AnnotatedString annotatedString, boolean z2, AchRelationship achRelationship, TransferAccount transferAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = recurringDepositExtraCashAccountSelectionViewState.rows;
        }
        if ((i & 2) != 0) {
            z = recurringDepositExtraCashAccountSelectionViewState.isAddAccountButtonVisible;
        }
        if ((i & 4) != 0) {
            annotatedString = recurringDepositExtraCashAccountSelectionViewState.infoBannerMessage;
        }
        if ((i & 8) != 0) {
            z2 = recurringDepositExtraCashAccountSelectionViewState.isContinueButtonEnabled;
        }
        if ((i & 16) != 0) {
            achRelationship = recurringDepositExtraCashAccountSelectionViewState.selectedBankAccount;
        }
        if ((i & 32) != 0) {
            transferAccount = recurringDepositExtraCashAccountSelectionViewState.selectedRobinhoodAccount;
        }
        AchRelationship achRelationship2 = achRelationship;
        TransferAccount transferAccount2 = transferAccount;
        return recurringDepositExtraCashAccountSelectionViewState.copy(immutableList, z, annotatedString, z2, achRelationship2, transferAccount2);
    }

    public final ImmutableList<Row> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAddAccountButtonVisible() {
        return this.isAddAccountButtonVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final AnnotatedString getInfoBannerMessage() {
        return this.infoBannerMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final AchRelationship getSelectedBankAccount() {
        return this.selectedBankAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getSelectedRobinhoodAccount() {
        return this.selectedRobinhoodAccount;
    }

    public final RecurringDepositExtraCashAccountSelectionViewState copy(ImmutableList<Row> rows, boolean isAddAccountButtonVisible, AnnotatedString infoBannerMessage, boolean isContinueButtonEnabled, AchRelationship selectedBankAccount, TransferAccount selectedRobinhoodAccount) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new RecurringDepositExtraCashAccountSelectionViewState(rows, isAddAccountButtonVisible, infoBannerMessage, isContinueButtonEnabled, selectedBankAccount, selectedRobinhoodAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositExtraCashAccountSelectionViewState)) {
            return false;
        }
        RecurringDepositExtraCashAccountSelectionViewState recurringDepositExtraCashAccountSelectionViewState = (RecurringDepositExtraCashAccountSelectionViewState) other;
        return Intrinsics.areEqual(this.rows, recurringDepositExtraCashAccountSelectionViewState.rows) && this.isAddAccountButtonVisible == recurringDepositExtraCashAccountSelectionViewState.isAddAccountButtonVisible && Intrinsics.areEqual(this.infoBannerMessage, recurringDepositExtraCashAccountSelectionViewState.infoBannerMessage) && this.isContinueButtonEnabled == recurringDepositExtraCashAccountSelectionViewState.isContinueButtonEnabled && Intrinsics.areEqual(this.selectedBankAccount, recurringDepositExtraCashAccountSelectionViewState.selectedBankAccount) && Intrinsics.areEqual(this.selectedRobinhoodAccount, recurringDepositExtraCashAccountSelectionViewState.selectedRobinhoodAccount);
    }

    public int hashCode() {
        int iHashCode = ((this.rows.hashCode() * 31) + Boolean.hashCode(this.isAddAccountButtonVisible)) * 31;
        AnnotatedString annotatedString = this.infoBannerMessage;
        int iHashCode2 = (((iHashCode + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31;
        AchRelationship achRelationship = this.selectedBankAccount;
        int iHashCode3 = (iHashCode2 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        TransferAccount transferAccount = this.selectedRobinhoodAccount;
        return iHashCode3 + (transferAccount != null ? transferAccount.hashCode() : 0);
    }

    public String toString() {
        ImmutableList<Row> immutableList = this.rows;
        boolean z = this.isAddAccountButtonVisible;
        AnnotatedString annotatedString = this.infoBannerMessage;
        return "RecurringDepositExtraCashAccountSelectionViewState(rows=" + immutableList + ", isAddAccountButtonVisible=" + z + ", infoBannerMessage=" + ((Object) annotatedString) + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", selectedBankAccount=" + this.selectedBankAccount + ", selectedRobinhoodAccount=" + this.selectedRobinhoodAccount + ")";
    }

    public RecurringDepositExtraCashAccountSelectionViewState(ImmutableList<Row> rows, boolean z, AnnotatedString annotatedString, boolean z2, AchRelationship achRelationship, TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.isAddAccountButtonVisible = z;
        this.infoBannerMessage = annotatedString;
        this.isContinueButtonEnabled = z2;
        this.selectedBankAccount = achRelationship;
        this.selectedRobinhoodAccount = transferAccount;
    }

    public final ImmutableList<Row> getRows() {
        return this.rows;
    }

    public final boolean isAddAccountButtonVisible() {
        return this.isAddAccountButtonVisible;
    }

    public final AnnotatedString getInfoBannerMessage() {
        return this.infoBannerMessage;
    }

    public final boolean isContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final AchRelationship getSelectedBankAccount() {
        return this.selectedBankAccount;
    }

    public final TransferAccount getSelectedRobinhoodAccount() {
        return this.selectedRobinhoodAccount;
    }

    /* compiled from: RecurringDepositExtraCashAccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState$Row;", "", "account", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/AchRelationship;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "primaryText", "", "secondaryText", "enabled", "", "selected", "<init>", "(Lcom/robinhood/utils/Either;Lcom/robinhood/compose/bento/component/BentoIcons$Size16;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAccount", "()Lcom/robinhood/utils/Either;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getEnabled", "()Z", "getSelected", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 8;
        private final Either<AchRelationship, TransferAccount> account;
        private final boolean enabled;
        private final BentoIcon4.Size16 icon;
        private final String primaryText;
        private final String secondaryText;
        private final boolean selected;

        public static /* synthetic */ Row copy$default(Row row, Either either, BentoIcon4.Size16 size16, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                either = row.account;
            }
            if ((i & 2) != 0) {
                size16 = row.icon;
            }
            if ((i & 4) != 0) {
                str = row.primaryText;
            }
            if ((i & 8) != 0) {
                str2 = row.secondaryText;
            }
            if ((i & 16) != 0) {
                z = row.enabled;
            }
            if ((i & 32) != 0) {
                z2 = row.selected;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return row.copy(either, size16, str, str2, z3, z4);
        }

        public final Either<AchRelationship, TransferAccount> component1() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoIcon4.Size16 getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Row copy(Either<AchRelationship, TransferAccount> account, BentoIcon4.Size16 icon, String primaryText, String secondaryText, boolean enabled, boolean selected) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new Row(account, icon, primaryText, secondaryText, enabled, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.account, row.account) && Intrinsics.areEqual(this.icon, row.icon) && Intrinsics.areEqual(this.primaryText, row.primaryText) && Intrinsics.areEqual(this.secondaryText, row.secondaryText) && this.enabled == row.enabled && this.selected == row.selected;
        }

        public int hashCode() {
            int iHashCode = this.account.hashCode() * 31;
            BentoIcon4.Size16 size16 = this.icon;
            return ((((((((iHashCode + (size16 == null ? 0 : size16.hashCode())) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Row(account=" + this.account + ", icon=" + this.icon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", enabled=" + this.enabled + ", selected=" + this.selected + ")";
        }

        public Row(Either<AchRelationship, TransferAccount> account, BentoIcon4.Size16 size16, String primaryText, String secondaryText, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.account = account;
            this.icon = size16;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.enabled = z;
            this.selected = z2;
        }

        public final Either<AchRelationship, TransferAccount> getAccount() {
            return this.account;
        }

        public final BentoIcon4.Size16 getIcon() {
            return this.icon;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }
}
