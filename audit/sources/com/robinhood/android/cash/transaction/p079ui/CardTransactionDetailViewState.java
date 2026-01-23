package com.robinhood.android.cash.transaction.p079ui;

import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.mcduckling.CardReward2;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.MerchantCardReward;
import com.robinhood.models.p320db.mcduckling.PendingCardTransaction;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010A\u001a\u00020\u0003HÂ\u0003J\t\u0010B\u001a\u00020\u0003HÂ\u0003J\t\u0010C\u001a\u00020\u0003HÂ\u0003J\t\u0010D\u001a\u00020\u0003HÂ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003J\u001d\u0010J\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010HÂ\u0003JÁ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010HÆ\u0001J\u0013\u0010P\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020-HÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R%\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010#R\u0011\u0010,\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0019\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b9\u0010&R\u0011\u0010:\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b;\u0010/R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailViewState;", "", "isOverviewLoading", "", "isConfirmTransactionLoading", "isDenyTransactionLoading", "isCancelDisputeLoading", "overview", "Lcom/robinhood/android/cash/transaction/ui/TransactionOverview;", "transaction", "Lcom/robinhood/shared/models/history/MinervaTransaction$FromCard;", ErrorResponse.DETAIL, "", "showFraudPrompt", "loadingText", "fraudActionResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult;", "", "errorUiEvent", "fromDeepLink", "cardActionPrompt", "Lcom/robinhood/android/cash/transaction/ui/CardActionEvent;", "shouldShowCardActionPrompt", "", "<init>", "(ZZZZLcom/robinhood/android/cash/transaction/ui/TransactionOverview;Lcom/robinhood/shared/models/history/MinervaTransaction$FromCard;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/android/cash/transaction/ui/CardActionEvent;Lcom/robinhood/udf/UiEvent;)V", "getOverview", "()Lcom/robinhood/android/cash/transaction/ui/TransactionOverview;", "getTransaction", "()Lcom/robinhood/shared/models/history/MinervaTransaction$FromCard;", "getDetail", "()Ljava/lang/CharSequence;", "getShowFraudPrompt", "()Z", "getLoadingText", "getFraudActionResult", "()Lcom/robinhood/udf/UiEvent;", "getErrorUiEvent", "getFromDeepLink", "isLoading", "isDisputeTransactionButtonVisible", "isDisputeTransactionButtonEnabled", "disputeTransactionButtonColor", "", "getDisputeTransactionButtonColor", "()I", "settledCardTransaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "getSettledCardTransaction", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "showPromptEvent", "getShowPromptEvent", "viewRewardTextRes", "getViewRewardTextRes", "merchantRewards", "", "Lcom/robinhood/models/db/mcduckling/MerchantCardReward;", "getMerchantRewards", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CardTransactionDetailViewState {
    public static final int $stable = 8;
    private final CardTransactionDetailViewState2 cardActionPrompt;
    private final CharSequence detail;
    private final UiEvent<Throwable> errorUiEvent;
    private final UiEvent<Either<CardTransactionDetailViewState3, Throwable>> fraudActionResult;
    private final boolean fromDeepLink;
    private final boolean isCancelDisputeLoading;
    private final boolean isConfirmTransactionLoading;
    private final boolean isDenyTransactionLoading;
    private final boolean isOverviewLoading;
    private final CharSequence loadingText;
    private final TransactionOverview overview;
    private final UiEvent<Unit> shouldShowCardActionPrompt;
    private final boolean showFraudPrompt;
    private final MinervaTransaction.FromCard transaction;

    public CardTransactionDetailViewState() {
        this(false, false, false, false, null, null, null, false, null, null, null, false, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getIsOverviewLoading() {
        return this.isOverviewLoading;
    }

    /* renamed from: component13, reason: from getter */
    private final CardTransactionDetailViewState2 getCardActionPrompt() {
        return this.cardActionPrompt;
    }

    private final UiEvent<Unit> component14() {
        return this.shouldShowCardActionPrompt;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsConfirmTransactionLoading() {
        return this.isConfirmTransactionLoading;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsDenyTransactionLoading() {
        return this.isDenyTransactionLoading;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsCancelDisputeLoading() {
        return this.isCancelDisputeLoading;
    }

    public final UiEvent<Either<CardTransactionDetailViewState3, Throwable>> component10() {
        return this.fraudActionResult;
    }

    public final UiEvent<Throwable> component11() {
        return this.errorUiEvent;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    /* renamed from: component5, reason: from getter */
    public final TransactionOverview getOverview() {
        return this.overview;
    }

    /* renamed from: component6, reason: from getter */
    public final MinervaTransaction.FromCard getTransaction() {
        return this.transaction;
    }

    /* renamed from: component7, reason: from getter */
    public final CharSequence getDetail() {
        return this.detail;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowFraudPrompt() {
        return this.showFraudPrompt;
    }

    /* renamed from: component9, reason: from getter */
    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    public final CardTransactionDetailViewState copy(boolean isOverviewLoading, boolean isConfirmTransactionLoading, boolean isDenyTransactionLoading, boolean isCancelDisputeLoading, TransactionOverview overview, MinervaTransaction.FromCard transaction, CharSequence detail, boolean showFraudPrompt, CharSequence loadingText, UiEvent<Either<CardTransactionDetailViewState3, Throwable>> fraudActionResult, UiEvent<Throwable> errorUiEvent, boolean fromDeepLink, CardTransactionDetailViewState2 cardActionPrompt, UiEvent<Unit> shouldShowCardActionPrompt) {
        Intrinsics.checkNotNullParameter(shouldShowCardActionPrompt, "shouldShowCardActionPrompt");
        return new CardTransactionDetailViewState(isOverviewLoading, isConfirmTransactionLoading, isDenyTransactionLoading, isCancelDisputeLoading, overview, transaction, detail, showFraudPrompt, loadingText, fraudActionResult, errorUiEvent, fromDeepLink, cardActionPrompt, shouldShowCardActionPrompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTransactionDetailViewState)) {
            return false;
        }
        CardTransactionDetailViewState cardTransactionDetailViewState = (CardTransactionDetailViewState) other;
        return this.isOverviewLoading == cardTransactionDetailViewState.isOverviewLoading && this.isConfirmTransactionLoading == cardTransactionDetailViewState.isConfirmTransactionLoading && this.isDenyTransactionLoading == cardTransactionDetailViewState.isDenyTransactionLoading && this.isCancelDisputeLoading == cardTransactionDetailViewState.isCancelDisputeLoading && Intrinsics.areEqual(this.overview, cardTransactionDetailViewState.overview) && Intrinsics.areEqual(this.transaction, cardTransactionDetailViewState.transaction) && Intrinsics.areEqual(this.detail, cardTransactionDetailViewState.detail) && this.showFraudPrompt == cardTransactionDetailViewState.showFraudPrompt && Intrinsics.areEqual(this.loadingText, cardTransactionDetailViewState.loadingText) && Intrinsics.areEqual(this.fraudActionResult, cardTransactionDetailViewState.fraudActionResult) && Intrinsics.areEqual(this.errorUiEvent, cardTransactionDetailViewState.errorUiEvent) && this.fromDeepLink == cardTransactionDetailViewState.fromDeepLink && Intrinsics.areEqual(this.cardActionPrompt, cardTransactionDetailViewState.cardActionPrompt) && Intrinsics.areEqual(this.shouldShowCardActionPrompt, cardTransactionDetailViewState.shouldShowCardActionPrompt);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isOverviewLoading) * 31) + Boolean.hashCode(this.isConfirmTransactionLoading)) * 31) + Boolean.hashCode(this.isDenyTransactionLoading)) * 31) + Boolean.hashCode(this.isCancelDisputeLoading)) * 31;
        TransactionOverview transactionOverview = this.overview;
        int iHashCode2 = (iHashCode + (transactionOverview == null ? 0 : transactionOverview.hashCode())) * 31;
        MinervaTransaction.FromCard fromCard = this.transaction;
        int iHashCode3 = (iHashCode2 + (fromCard == null ? 0 : fromCard.hashCode())) * 31;
        CharSequence charSequence = this.detail;
        int iHashCode4 = (((iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Boolean.hashCode(this.showFraudPrompt)) * 31;
        CharSequence charSequence2 = this.loadingText;
        int iHashCode5 = (iHashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        UiEvent<Either<CardTransactionDetailViewState3, Throwable>> uiEvent = this.fraudActionResult;
        int iHashCode6 = (iHashCode5 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorUiEvent;
        int iHashCode7 = (((iHashCode6 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.fromDeepLink)) * 31;
        CardTransactionDetailViewState2 cardTransactionDetailViewState2 = this.cardActionPrompt;
        return ((iHashCode7 + (cardTransactionDetailViewState2 != null ? cardTransactionDetailViewState2.hashCode() : 0)) * 31) + this.shouldShowCardActionPrompt.hashCode();
    }

    public String toString() {
        boolean z = this.isOverviewLoading;
        boolean z2 = this.isConfirmTransactionLoading;
        boolean z3 = this.isDenyTransactionLoading;
        boolean z4 = this.isCancelDisputeLoading;
        TransactionOverview transactionOverview = this.overview;
        MinervaTransaction.FromCard fromCard = this.transaction;
        CharSequence charSequence = this.detail;
        boolean z5 = this.showFraudPrompt;
        CharSequence charSequence2 = this.loadingText;
        return "CardTransactionDetailViewState(isOverviewLoading=" + z + ", isConfirmTransactionLoading=" + z2 + ", isDenyTransactionLoading=" + z3 + ", isCancelDisputeLoading=" + z4 + ", overview=" + transactionOverview + ", transaction=" + fromCard + ", detail=" + ((Object) charSequence) + ", showFraudPrompt=" + z5 + ", loadingText=" + ((Object) charSequence2) + ", fraudActionResult=" + this.fraudActionResult + ", errorUiEvent=" + this.errorUiEvent + ", fromDeepLink=" + this.fromDeepLink + ", cardActionPrompt=" + this.cardActionPrompt + ", shouldShowCardActionPrompt=" + this.shouldShowCardActionPrompt + ")";
    }

    public CardTransactionDetailViewState(boolean z, boolean z2, boolean z3, boolean z4, TransactionOverview transactionOverview, MinervaTransaction.FromCard fromCard, CharSequence charSequence, boolean z5, CharSequence charSequence2, UiEvent<Either<CardTransactionDetailViewState3, Throwable>> uiEvent, UiEvent<Throwable> uiEvent2, boolean z6, CardTransactionDetailViewState2 cardTransactionDetailViewState2, UiEvent<Unit> shouldShowCardActionPrompt) {
        Intrinsics.checkNotNullParameter(shouldShowCardActionPrompt, "shouldShowCardActionPrompt");
        this.isOverviewLoading = z;
        this.isConfirmTransactionLoading = z2;
        this.isDenyTransactionLoading = z3;
        this.isCancelDisputeLoading = z4;
        this.overview = transactionOverview;
        this.transaction = fromCard;
        this.detail = charSequence;
        this.showFraudPrompt = z5;
        this.loadingText = charSequence2;
        this.fraudActionResult = uiEvent;
        this.errorUiEvent = uiEvent2;
        this.fromDeepLink = z6;
        this.cardActionPrompt = cardTransactionDetailViewState2;
        this.shouldShowCardActionPrompt = shouldShowCardActionPrompt;
    }

    public final TransactionOverview getOverview() {
        return this.overview;
    }

    public final MinervaTransaction.FromCard getTransaction() {
        return this.transaction;
    }

    public final CharSequence getDetail() {
        return this.detail;
    }

    public final boolean getShowFraudPrompt() {
        return this.showFraudPrompt;
    }

    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    public final UiEvent<Either<CardTransactionDetailViewState3, Throwable>> getFraudActionResult() {
        return this.fraudActionResult;
    }

    public final UiEvent<Throwable> getErrorUiEvent() {
        return this.errorUiEvent;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public /* synthetic */ CardTransactionDetailViewState(boolean z, boolean z2, boolean z3, boolean z4, TransactionOverview transactionOverview, MinervaTransaction.FromCard fromCard, CharSequence charSequence, boolean z5, CharSequence charSequence2, UiEvent uiEvent, UiEvent uiEvent2, boolean z6, CardTransactionDetailViewState2 cardTransactionDetailViewState2, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : transactionOverview, (i & 32) != 0 ? null : fromCard, (i & 64) != 0 ? null : charSequence, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? null : charSequence2, (i & 512) != 0 ? null : uiEvent, (i & 1024) != 0 ? null : uiEvent2, (i & 2048) == 0 ? z6 : false, (i & 4096) == 0 ? cardTransactionDetailViewState2 : null, (i & 8192) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent3);
    }

    public final boolean isLoading() {
        return this.isOverviewLoading || this.isConfirmTransactionLoading || this.isDenyTransactionLoading || this.isCancelDisputeLoading;
    }

    public final boolean isDisputeTransactionButtonVisible() {
        MinervaTransaction.FromCard fromCard = this.transaction;
        CardTransaction event = fromCard != null ? fromCard.getEvent() : null;
        SettledCardTransaction settledCardTransaction = event instanceof SettledCardTransaction ? (SettledCardTransaction) event : null;
        if (settledCardTransaction != null ? settledCardTransaction.getCanDispute() : false) {
            return true;
        }
        MinervaTransaction.FromCard fromCard2 = this.transaction;
        return (fromCard2 != null ? fromCard2.getEvent() : null) instanceof PendingCardTransaction;
    }

    public final boolean isDisputeTransactionButtonEnabled() {
        if (isDisputeTransactionButtonVisible()) {
            MinervaTransaction.FromCard fromCard = this.transaction;
            CardTransaction event = fromCard != null ? fromCard.getEvent() : null;
            SettledCardTransaction settledCardTransaction = event instanceof SettledCardTransaction ? (SettledCardTransaction) event : null;
            if (settledCardTransaction != null ? settledCardTransaction.getCanDispute() : false) {
                return true;
            }
        }
        return false;
    }

    public final int getDisputeTransactionButtonColor() {
        if (isDisputeTransactionButtonEnabled()) {
            return C20690R.attr.colorPrimary;
        }
        return C20690R.attr.colorForeground3;
    }

    public final SettledCardTransaction getSettledCardTransaction() {
        MinervaTransaction.FromCard fromCard = this.transaction;
        CardTransaction event = fromCard != null ? fromCard.getEvent() : null;
        if (event instanceof SettledCardTransaction) {
            return (SettledCardTransaction) event;
        }
        return null;
    }

    public final UUID getCardId() {
        CardTransaction event;
        MinervaTransaction.FromCard fromCard = this.transaction;
        if (fromCard == null || (event = fromCard.getEvent()) == null) {
            return null;
        }
        return event.getCardId();
    }

    public final UiEvent<CardTransactionDetailViewState2> getShowPromptEvent() {
        if (!this.fromDeepLink || this.cardActionPrompt == null || this.shouldShowCardActionPrompt.consume() == null) {
            return null;
        }
        return new UiEvent<>(this.cardActionPrompt);
    }

    public final int getViewRewardTextRes() {
        if (getMerchantRewards().size() > 1) {
            return C10421R.string.card_transaction_detail_view_rewards;
        }
        return C10421R.string.card_transaction_detail_view_reward;
    }

    public final List<MerchantCardReward> getMerchantRewards() {
        MinervaTransaction.FromCard fromCard = this.transaction;
        CardTransaction event = fromCard != null ? fromCard.getEvent() : null;
        if ((event instanceof PendingCardTransaction) || (event instanceof SettledCardTransaction)) {
            List<MerchantCardReward> merchantRewards = CardReward2.getMerchantRewards(this.transaction.getRewards());
            return merchantRewards == null ? CollectionsKt.emptyList() : merchantRewards;
        }
        return CollectionsKt.emptyList();
    }
}
