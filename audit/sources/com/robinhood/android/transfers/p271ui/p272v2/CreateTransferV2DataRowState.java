package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CreateTransferV2DataRowState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "onClickAction", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "isLocked", "", "testTag", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;ZLjava/lang/String;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getOnClickAction", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "()Z", "getTestTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "OnClickAction", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferV2DataRowState {
    public static final int $stable = StringResource.$stable;
    private final boolean isLocked;
    private final StringResource label;
    private final OnClickAction onClickAction;
    private final String testTag;
    private final StringResource value;

    public static /* synthetic */ CreateTransferV2DataRowState copy$default(CreateTransferV2DataRowState createTransferV2DataRowState, StringResource stringResource, StringResource stringResource2, OnClickAction onClickAction, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = createTransferV2DataRowState.label;
        }
        if ((i & 2) != 0) {
            stringResource2 = createTransferV2DataRowState.value;
        }
        if ((i & 4) != 0) {
            onClickAction = createTransferV2DataRowState.onClickAction;
        }
        if ((i & 8) != 0) {
            z = createTransferV2DataRowState.isLocked;
        }
        if ((i & 16) != 0) {
            str = createTransferV2DataRowState.testTag;
        }
        String str2 = str;
        OnClickAction onClickAction2 = onClickAction;
        return createTransferV2DataRowState.copy(stringResource, stringResource2, onClickAction2, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final OnClickAction getOnClickAction() {
        return this.onClickAction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public final CreateTransferV2DataRowState copy(StringResource label, StringResource value, OnClickAction onClickAction, boolean isLocked, String testTag) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        return new CreateTransferV2DataRowState(label, value, onClickAction, isLocked, testTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferV2DataRowState)) {
            return false;
        }
        CreateTransferV2DataRowState createTransferV2DataRowState = (CreateTransferV2DataRowState) other;
        return Intrinsics.areEqual(this.label, createTransferV2DataRowState.label) && Intrinsics.areEqual(this.value, createTransferV2DataRowState.value) && Intrinsics.areEqual(this.onClickAction, createTransferV2DataRowState.onClickAction) && this.isLocked == createTransferV2DataRowState.isLocked && Intrinsics.areEqual(this.testTag, createTransferV2DataRowState.testTag);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
        OnClickAction onClickAction = this.onClickAction;
        return ((((iHashCode + (onClickAction == null ? 0 : onClickAction.hashCode())) * 31) + Boolean.hashCode(this.isLocked)) * 31) + this.testTag.hashCode();
    }

    public String toString() {
        return "CreateTransferV2DataRowState(label=" + this.label + ", value=" + this.value + ", onClickAction=" + this.onClickAction + ", isLocked=" + this.isLocked + ", testTag=" + this.testTag + ")";
    }

    public CreateTransferV2DataRowState(StringResource label, StringResource value, OnClickAction onClickAction, boolean z, String testTag) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        this.label = label;
        this.value = value;
        this.onClickAction = onClickAction;
        this.isLocked = z;
        this.testTag = testTag;
    }

    public /* synthetic */ CreateTransferV2DataRowState(StringResource stringResource, StringResource stringResource2, OnClickAction onClickAction, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, onClickAction, (i & 8) != 0 ? false : z, str);
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getValue() {
        return this.value;
    }

    public final OnClickAction getOnClickAction() {
        return this.onClickAction;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    /* compiled from: CreateTransferV2DataRowState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "", "AccountSelection", "EditIraContributionType", "EditIraContributionTaxYear", "EditIraDistributionType", "EditIraDistributionTaxWithholding", "FrequencySelection", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$AccountSelection;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraContributionTaxYear;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraContributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraDistributionTaxWithholding;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraDistributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$FrequencySelection;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnClickAction {

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$AccountSelection;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getDirection", "()Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountSelection implements OnClickAction {
            public static final int $stable = 8;
            private final TransferAccountDirection direction;
            private final TransferAccount transferAccount;

            public static /* synthetic */ AccountSelection copy$default(AccountSelection accountSelection, TransferAccountDirection transferAccountDirection, TransferAccount transferAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccountDirection = accountSelection.direction;
                }
                if ((i & 2) != 0) {
                    transferAccount = accountSelection.transferAccount;
                }
                return accountSelection.copy(transferAccountDirection, transferAccount);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccountDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }

            public final AccountSelection copy(TransferAccountDirection direction, TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new AccountSelection(direction, transferAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountSelection)) {
                    return false;
                }
                AccountSelection accountSelection = (AccountSelection) other;
                return this.direction == accountSelection.direction && Intrinsics.areEqual(this.transferAccount, accountSelection.transferAccount);
            }

            public int hashCode() {
                int iHashCode = this.direction.hashCode() * 31;
                TransferAccount transferAccount = this.transferAccount;
                return iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode());
            }

            public String toString() {
                return "AccountSelection(direction=" + this.direction + ", transferAccount=" + this.transferAccount + ")";
            }

            public AccountSelection(TransferAccountDirection direction, TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.direction = direction;
                this.transferAccount = transferAccount;
            }

            public final TransferAccountDirection getDirection() {
                return this.direction;
            }

            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }
        }

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraContributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "currentContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getCurrentContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditIraContributionType implements OnClickAction {
            public static final int $stable = 8;
            private final IraContributionType currentContributionType;
            private final TransferAccount transferAccount;

            public static /* synthetic */ EditIraContributionType copy$default(EditIraContributionType editIraContributionType, TransferAccount transferAccount, IraContributionType iraContributionType, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccount = editIraContributionType.transferAccount;
                }
                if ((i & 2) != 0) {
                    iraContributionType = editIraContributionType.currentContributionType;
                }
                return editIraContributionType.copy(transferAccount, iraContributionType);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }

            /* renamed from: component2, reason: from getter */
            public final IraContributionType getCurrentContributionType() {
                return this.currentContributionType;
            }

            public final EditIraContributionType copy(TransferAccount transferAccount, IraContributionType currentContributionType) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                Intrinsics.checkNotNullParameter(currentContributionType, "currentContributionType");
                return new EditIraContributionType(transferAccount, currentContributionType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EditIraContributionType)) {
                    return false;
                }
                EditIraContributionType editIraContributionType = (EditIraContributionType) other;
                return Intrinsics.areEqual(this.transferAccount, editIraContributionType.transferAccount) && this.currentContributionType == editIraContributionType.currentContributionType;
            }

            public int hashCode() {
                return (this.transferAccount.hashCode() * 31) + this.currentContributionType.hashCode();
            }

            public String toString() {
                return "EditIraContributionType(transferAccount=" + this.transferAccount + ", currentContributionType=" + this.currentContributionType + ")";
            }

            public EditIraContributionType(TransferAccount transferAccount, IraContributionType currentContributionType) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                Intrinsics.checkNotNullParameter(currentContributionType, "currentContributionType");
                this.transferAccount = transferAccount;
                this.currentContributionType = currentContributionType;
            }

            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }

            public final IraContributionType getCurrentContributionType() {
                return this.currentContributionType;
            }
        }

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraContributionTaxYear;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditIraContributionTaxYear implements OnClickAction {
            public static final int $stable = 0;
            public static final EditIraContributionTaxYear INSTANCE = new EditIraContributionTaxYear();

            public boolean equals(Object other) {
                return this == other || (other instanceof EditIraContributionTaxYear);
            }

            public int hashCode() {
                return 339913297;
            }

            public String toString() {
                return "EditIraContributionTaxYear";
            }

            private EditIraContributionTaxYear() {
            }
        }

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraDistributionType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditIraDistributionType implements OnClickAction {
            public static final int $stable = 8;
            private final TransferAccount transferAccount;

            public static /* synthetic */ EditIraDistributionType copy$default(EditIraDistributionType editIraDistributionType, TransferAccount transferAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccount = editIraDistributionType.transferAccount;
                }
                return editIraDistributionType.copy(transferAccount);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }

            public final EditIraDistributionType copy(TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                return new EditIraDistributionType(transferAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditIraDistributionType) && Intrinsics.areEqual(this.transferAccount, ((EditIraDistributionType) other).transferAccount);
            }

            public int hashCode() {
                return this.transferAccount.hashCode();
            }

            public String toString() {
                return "EditIraDistributionType(transferAccount=" + this.transferAccount + ")";
            }

            public EditIraDistributionType(TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                this.transferAccount = transferAccount;
            }

            public final TransferAccount getTransferAccount() {
                return this.transferAccount;
            }
        }

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$EditIraDistributionTaxWithholding;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditIraDistributionTaxWithholding implements OnClickAction {
            public static final int $stable = 0;
            public static final EditIraDistributionTaxWithholding INSTANCE = new EditIraDistributionTaxWithholding();

            public boolean equals(Object other) {
                return this == other || (other instanceof EditIraDistributionTaxWithholding);
            }

            public int hashCode() {
                return 318794269;
            }

            public String toString() {
                return "EditIraDistributionTaxWithholding";
            }

            private EditIraDistributionTaxWithholding() {
            }
        }

        /* compiled from: CreateTransferV2DataRowState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction$FrequencySelection;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FrequencySelection implements OnClickAction {
            public static final int $stable = 0;
            public static final FrequencySelection INSTANCE = new FrequencySelection();

            public boolean equals(Object other) {
                return this == other || (other instanceof FrequencySelection);
            }

            public int hashCode() {
                return 1299647831;
            }

            public String toString() {
                return "FrequencySelection";
            }

            private FrequencySelection() {
            }
        }
    }
}
