package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent;", "", "<init>", "()V", "WarningSheetContent", "AmountAvailableSheetContent", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent$AmountAvailableSheetContent;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent$WarningSheetContent;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoTransferSendAmountSheetContent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTransferSendAmountSheetContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoTransferSendAmountSheetContent() {
    }

    /* compiled from: CryptoTransferSendAmountComposable.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent$WarningSheetContent;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent;", "title", "", "descriptionMarkdown", "primaryCta", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "secondaryCta", "withdrawalData", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;)V", "getTitle", "()Ljava/lang/String;", "getDescriptionMarkdown", "getPrimaryCta", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "getSecondaryCta", "getWithdrawalData", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WarningSheetContent extends CryptoTransferSendAmountSheetContent {
        public static final int $stable = 8;
        private final String descriptionMarkdown;
        private final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState primaryCta;
        private final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState secondaryCta;
        private final String title;
        private final CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalData;

        public static /* synthetic */ WarningSheetContent copy$default(WarningSheetContent warningSheetContent, String str, String str2, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalAttempt, int i, Object obj) {
            if ((i & 1) != 0) {
                str = warningSheetContent.title;
            }
            if ((i & 2) != 0) {
                str2 = warningSheetContent.descriptionMarkdown;
            }
            if ((i & 4) != 0) {
                withdrawalWarningButtonState = warningSheetContent.primaryCta;
            }
            if ((i & 8) != 0) {
                withdrawalWarningButtonState2 = warningSheetContent.secondaryCta;
            }
            if ((i & 16) != 0) {
                withdrawalAttempt = warningSheetContent.withdrawalData;
            }
            CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalAttempt2 = withdrawalAttempt;
            CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState3 = withdrawalWarningButtonState;
            return warningSheetContent.copy(str, str2, withdrawalWarningButtonState3, withdrawalWarningButtonState2, withdrawalAttempt2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescriptionMarkdown() {
            return this.descriptionMarkdown;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState getSecondaryCta() {
            return this.secondaryCta;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoTransferSendAmountViewState.WithdrawalAttempt getWithdrawalData() {
            return this.withdrawalData;
        }

        public final WarningSheetContent copy(String title, String descriptionMarkdown, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState primaryCta, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState secondaryCta, CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalData) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
            Intrinsics.checkNotNullParameter(withdrawalData, "withdrawalData");
            return new WarningSheetContent(title, descriptionMarkdown, primaryCta, secondaryCta, withdrawalData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WarningSheetContent)) {
                return false;
            }
            WarningSheetContent warningSheetContent = (WarningSheetContent) other;
            return Intrinsics.areEqual(this.title, warningSheetContent.title) && Intrinsics.areEqual(this.descriptionMarkdown, warningSheetContent.descriptionMarkdown) && Intrinsics.areEqual(this.primaryCta, warningSheetContent.primaryCta) && Intrinsics.areEqual(this.secondaryCta, warningSheetContent.secondaryCta) && Intrinsics.areEqual(this.withdrawalData, warningSheetContent.withdrawalData);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.descriptionMarkdown.hashCode()) * 31;
            CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState = this.primaryCta;
            int iHashCode2 = (iHashCode + (withdrawalWarningButtonState == null ? 0 : withdrawalWarningButtonState.hashCode())) * 31;
            CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2 = this.secondaryCta;
            return ((iHashCode2 + (withdrawalWarningButtonState2 != null ? withdrawalWarningButtonState2.hashCode() : 0)) * 31) + this.withdrawalData.hashCode();
        }

        public String toString() {
            return "WarningSheetContent(title=" + this.title + ", descriptionMarkdown=" + this.descriptionMarkdown + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", withdrawalData=" + this.withdrawalData + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescriptionMarkdown() {
            return this.descriptionMarkdown;
        }

        public final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState getPrimaryCta() {
            return this.primaryCta;
        }

        public final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState getSecondaryCta() {
            return this.secondaryCta;
        }

        public final CryptoTransferSendAmountViewState.WithdrawalAttempt getWithdrawalData() {
            return this.withdrawalData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WarningSheetContent(String title, String descriptionMarkdown, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalData) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
            Intrinsics.checkNotNullParameter(withdrawalData, "withdrawalData");
            this.title = title;
            this.descriptionMarkdown = descriptionMarkdown;
            this.primaryCta = withdrawalWarningButtonState;
            this.secondaryCta = withdrawalWarningButtonState2;
            this.withdrawalData = withdrawalData;
        }
    }

    /* compiled from: CryptoTransferSendAmountComposable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent$AmountAvailableSheetContent;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent;", "amountAvailableForWithdrawal", "", "<init>", "(Ljava/lang/String;)V", "getAmountAvailableForWithdrawal", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AmountAvailableSheetContent extends CryptoTransferSendAmountSheetContent {
        public static final int $stable = 0;
        private final String amountAvailableForWithdrawal;

        public static /* synthetic */ AmountAvailableSheetContent copy$default(AmountAvailableSheetContent amountAvailableSheetContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amountAvailableSheetContent.amountAvailableForWithdrawal;
            }
            return amountAvailableSheetContent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAmountAvailableForWithdrawal() {
            return this.amountAvailableForWithdrawal;
        }

        public final AmountAvailableSheetContent copy(String amountAvailableForWithdrawal) {
            Intrinsics.checkNotNullParameter(amountAvailableForWithdrawal, "amountAvailableForWithdrawal");
            return new AmountAvailableSheetContent(amountAvailableForWithdrawal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AmountAvailableSheetContent) && Intrinsics.areEqual(this.amountAvailableForWithdrawal, ((AmountAvailableSheetContent) other).amountAvailableForWithdrawal);
        }

        public int hashCode() {
            return this.amountAvailableForWithdrawal.hashCode();
        }

        public String toString() {
            return "AmountAvailableSheetContent(amountAvailableForWithdrawal=" + this.amountAvailableForWithdrawal + ")";
        }

        public final String getAmountAvailableForWithdrawal() {
            return this.amountAvailableForWithdrawal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountAvailableSheetContent(String amountAvailableForWithdrawal) {
            super(null);
            Intrinsics.checkNotNullParameter(amountAvailableForWithdrawal, "amountAvailableForWithdrawal");
            this.amountAvailableForWithdrawal = amountAvailableForWithdrawal;
        }
    }
}
