package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Fragment;
import com.robinhood.android.transfers.util.ToApiAccount;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferV2DataState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0012HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\rHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003J¯\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\r2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010A\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010*R\u001f\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010*R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;", "", "amount", "Lcom/robinhood/models/util/Money;", "amountInput", "", "amountEntryState", "Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "transferDirection", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "sourceAccountId", "sinkAccountId", "isAddingNewAccount", "", "transferSummaryContent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "suggestedDepositAmounts", "isCreatingTransfer", "isaPromotion", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/android/transfers/ui/common/AmountEntryState;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZLcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getAmountInput", "()Ljava/lang/String;", "getAmountEntryState", "()Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "getTransferDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getTransferAccounts", "()Ljava/util/List;", "getSourceAccountId", "getSinkAccountId", "()Z", "getTransferSummaryContent", "getSuggestedDepositAmounts", "getIsaPromotion", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "transferData", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "getTransferData", "()Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransferV2DataState {
    private final Money amount;
    private final TransferAmountEntryLayout amountEntryState;
    private final String amountInput;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final boolean isAddingNewAccount;
    private final boolean isCreatingTransfer;
    private final IsaPromotion isaPromotion;
    private final String sinkAccountId;
    private final String sourceAccountId;
    private final List<Money> suggestedDepositAmounts;
    private final List<TransferAccount> transferAccounts;
    private final TransferDirectionV2 transferDirection;
    private final List<UIComponent<GenericAction>> transferSummaryContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ InternationalTransferV2DataState copy$default(InternationalTransferV2DataState internationalTransferV2DataState, Money money, String str, TransferAmountEntryLayout transferAmountEntryLayout, TransferDirectionV2 transferDirectionV2, MAXTransferContext.EntryPoint entryPoint, List list, String str2, String str3, boolean z, List list2, List list3, boolean z2, IsaPromotion isaPromotion, int i, Object obj) {
        if ((i & 1) != 0) {
            money = internationalTransferV2DataState.amount;
        }
        return internationalTransferV2DataState.copy(money, (i & 2) != 0 ? internationalTransferV2DataState.amountInput : str, (i & 4) != 0 ? internationalTransferV2DataState.amountEntryState : transferAmountEntryLayout, (i & 8) != 0 ? internationalTransferV2DataState.transferDirection : transferDirectionV2, (i & 16) != 0 ? internationalTransferV2DataState.entryPoint : entryPoint, (i & 32) != 0 ? internationalTransferV2DataState.transferAccounts : list, (i & 64) != 0 ? internationalTransferV2DataState.sourceAccountId : str2, (i & 128) != 0 ? internationalTransferV2DataState.sinkAccountId : str3, (i & 256) != 0 ? internationalTransferV2DataState.isAddingNewAccount : z, (i & 512) != 0 ? internationalTransferV2DataState.transferSummaryContent : list2, (i & 1024) != 0 ? internationalTransferV2DataState.suggestedDepositAmounts : list3, (i & 2048) != 0 ? internationalTransferV2DataState.isCreatingTransfer : z2, (i & 4096) != 0 ? internationalTransferV2DataState.isaPromotion : isaPromotion);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    public final List<UIComponent<GenericAction>> component10() {
        return this.transferSummaryContent;
    }

    public final List<Money> component11() {
        return this.suggestedDepositAmounts;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    /* renamed from: component13, reason: from getter */
    public final IsaPromotion getIsaPromotion() {
        return this.isaPromotion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountInput() {
        return this.amountInput;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAmountEntryLayout getAmountEntryState() {
        return this.amountEntryState;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    /* renamed from: component5, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final List<TransferAccount> component6() {
        return this.transferAccounts;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsAddingNewAccount() {
        return this.isAddingNewAccount;
    }

    public final InternationalTransferV2DataState copy(Money amount, String amountInput, TransferAmountEntryLayout amountEntryState, TransferDirectionV2 transferDirection, MAXTransferContext.EntryPoint entryPoint, List<TransferAccount> transferAccounts, String sourceAccountId, String sinkAccountId, boolean isAddingNewAccount, List<? extends UIComponent<? extends GenericAction>> transferSummaryContent, List<Money> suggestedDepositAmounts, boolean isCreatingTransfer, IsaPromotion isaPromotion) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountEntryState, "amountEntryState");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new InternationalTransferV2DataState(amount, amountInput, amountEntryState, transferDirection, entryPoint, transferAccounts, sourceAccountId, sinkAccountId, isAddingNewAccount, transferSummaryContent, suggestedDepositAmounts, isCreatingTransfer, isaPromotion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransferV2DataState)) {
            return false;
        }
        InternationalTransferV2DataState internationalTransferV2DataState = (InternationalTransferV2DataState) other;
        return Intrinsics.areEqual(this.amount, internationalTransferV2DataState.amount) && Intrinsics.areEqual(this.amountInput, internationalTransferV2DataState.amountInput) && this.amountEntryState == internationalTransferV2DataState.amountEntryState && this.transferDirection == internationalTransferV2DataState.transferDirection && this.entryPoint == internationalTransferV2DataState.entryPoint && Intrinsics.areEqual(this.transferAccounts, internationalTransferV2DataState.transferAccounts) && Intrinsics.areEqual(this.sourceAccountId, internationalTransferV2DataState.sourceAccountId) && Intrinsics.areEqual(this.sinkAccountId, internationalTransferV2DataState.sinkAccountId) && this.isAddingNewAccount == internationalTransferV2DataState.isAddingNewAccount && Intrinsics.areEqual(this.transferSummaryContent, internationalTransferV2DataState.transferSummaryContent) && Intrinsics.areEqual(this.suggestedDepositAmounts, internationalTransferV2DataState.suggestedDepositAmounts) && this.isCreatingTransfer == internationalTransferV2DataState.isCreatingTransfer && Intrinsics.areEqual(this.isaPromotion, internationalTransferV2DataState.isaPromotion);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.amount.hashCode() * 31) + this.amountInput.hashCode()) * 31) + this.amountEntryState.hashCode()) * 31) + this.transferDirection.hashCode()) * 31) + this.entryPoint.hashCode()) * 31;
        List<TransferAccount> list = this.transferAccounts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.sourceAccountId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sinkAccountId;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isAddingNewAccount)) * 31;
        List<UIComponent<GenericAction>> list2 = this.transferSummaryContent;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Money> list3 = this.suggestedDepositAmounts;
        int iHashCode6 = (((iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31) + Boolean.hashCode(this.isCreatingTransfer)) * 31;
        IsaPromotion isaPromotion = this.isaPromotion;
        return iHashCode6 + (isaPromotion != null ? isaPromotion.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransferV2DataState(amount=" + this.amount + ", amountInput=" + this.amountInput + ", amountEntryState=" + this.amountEntryState + ", transferDirection=" + this.transferDirection + ", entryPoint=" + this.entryPoint + ", transferAccounts=" + this.transferAccounts + ", sourceAccountId=" + this.sourceAccountId + ", sinkAccountId=" + this.sinkAccountId + ", isAddingNewAccount=" + this.isAddingNewAccount + ", transferSummaryContent=" + this.transferSummaryContent + ", suggestedDepositAmounts=" + this.suggestedDepositAmounts + ", isCreatingTransfer=" + this.isCreatingTransfer + ", isaPromotion=" + this.isaPromotion + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternationalTransferV2DataState(Money amount, String amountInput, TransferAmountEntryLayout amountEntryState, TransferDirectionV2 transferDirection, MAXTransferContext.EntryPoint entryPoint, List<TransferAccount> list, String str, String str2, boolean z, List<? extends UIComponent<? extends GenericAction>> list2, List<Money> list3, boolean z2, IsaPromotion isaPromotion) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountEntryState, "amountEntryState");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.amount = amount;
        this.amountInput = amountInput;
        this.amountEntryState = amountEntryState;
        this.transferDirection = transferDirection;
        this.entryPoint = entryPoint;
        this.transferAccounts = list;
        this.sourceAccountId = str;
        this.sinkAccountId = str2;
        this.isAddingNewAccount = z;
        this.transferSummaryContent = list2;
        this.suggestedDepositAmounts = list3;
        this.isCreatingTransfer = z2;
        this.isaPromotion = isaPromotion;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getAmountInput() {
        return this.amountInput;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InternationalTransferV2DataState(com.robinhood.models.util.Money r17, java.lang.String r18, com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout r19, com.robinhood.models.api.bonfire.transfer.TransferDirectionV2 r20, com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint r21, java.util.List r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.List r26, java.util.List r27, boolean r28, com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.robinhood.android.transfers.ui.common.AmountEntryState r1 = com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout.INPUT
            r5 = r1
            goto Lc
        La:
            r5 = r19
        Lc:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L13
            r8 = r2
            goto L15
        L13:
            r8 = r22
        L15:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r23
        L1d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r24
        L25:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L2c
            r11 = r3
            goto L2e
        L2c:
            r11 = r25
        L2e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L34
            r12 = r2
            goto L36
        L34:
            r12 = r26
        L36:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3c
            r13 = r2
            goto L3e
        L3c:
            r13 = r27
        L3e:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L44
            r14 = r3
            goto L46
        L44:
            r14 = r28
        L46:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L56
            r15 = r2
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r2 = r16
            goto L62
        L56:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
        L62:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2DataState.<init>(com.robinhood.models.util.Money, java.lang.String, com.robinhood.android.transfers.ui.common.AmountEntryState, com.robinhood.models.api.bonfire.transfer.TransferDirectionV2, com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint, java.util.List, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, boolean, com.robinhood.android.isa.models.isa.db.entity.IsaPromotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final TransferAmountEntryLayout getAmountEntryState() {
        return this.amountEntryState;
    }

    public final TransferDirectionV2 getTransferDirection() {
        return this.transferDirection;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final List<TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    public final boolean isAddingNewAccount() {
        return this.isAddingNewAccount;
    }

    public final List<UIComponent<GenericAction>> getTransferSummaryContent() {
        return this.transferSummaryContent;
    }

    public final List<Money> getSuggestedDepositAmounts() {
        return this.suggestedDepositAmounts;
    }

    public final boolean isCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    public final IsaPromotion getIsaPromotion() {
        return this.isaPromotion;
    }

    public final TransferData getTransferData() {
        Money money = this.amount;
        TransferDirectionV2 transferDirectionV2 = this.transferDirection;
        TransferAccount sourceAccount = InternationalTransferV2StateProvider2.getSourceAccount(this);
        ApiCreateTransferRequest.ApiTransferAccount apiAccount = sourceAccount != null ? ToApiAccount.toApiAccount(sourceAccount) : null;
        TransferAccount sinkAccount = InternationalTransferV2StateProvider2.getSinkAccount(this);
        return new TransferData(money, transferDirectionV2, apiAccount, sinkAccount != null ? ToApiAccount.toApiAccount(sinkAccount) : null);
    }

    /* compiled from: InternationalTransferV2DataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState$Companion;", "", "<init>", "()V", "createInitial", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;", "args", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Fragment$Args;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InternationalTransferV2DataState createInitial(InternationalTransferV2Fragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            Currency currency = Currencies.GBP;
            BigDecimal amount = args.getAmount();
            if (amount == null) {
                amount = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(amount);
            Money money = new Money(currency, amount);
            return new InternationalTransferV2DataState(money, Money.format$default(money, null, false, null, false, 0, null, false, null, true, false, 767, null), null, args.getTransferDirection(), args.getEntryPoint(), null, args.getSourceAccountId(), args.getSinkAccountId(), false, null, null, false, null, 7972, null);
        }
    }
}
