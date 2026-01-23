package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionRowState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState;", "", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "row", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "loadingButtonType", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;", "actionEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "retryPrimaryAction", "", "<init>", "(Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getTransaction", "()Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "getRow", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "getLoadingButtonType", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;", "getActionEvent", "()Lcom/robinhood/udf/UiEvent;", "getRetryPrimaryAction", "isPrimaryButtonLoading", "", "()Z", "isSecondaryButtonLoading", "isActionLoading", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Action", "ButtonType", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransactionRowState {
    public static final int $stable = 8;
    private final UiEvent<Action> actionEvent;
    private final ButtonType loadingButtonType;
    private final UiEvent<Unit> retryPrimaryAction;
    private final TransactionRowState4 row;
    private final UiMatchaPendingTransaction transaction;

    public TransactionRowState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TransactionRowState copy$default(TransactionRowState transactionRowState, UiMatchaPendingTransaction uiMatchaPendingTransaction, TransactionRowState4 transactionRowState4, ButtonType buttonType, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiMatchaPendingTransaction = transactionRowState.transaction;
        }
        if ((i & 2) != 0) {
            transactionRowState4 = transactionRowState.row;
        }
        if ((i & 4) != 0) {
            buttonType = transactionRowState.loadingButtonType;
        }
        if ((i & 8) != 0) {
            uiEvent = transactionRowState.actionEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = transactionRowState.retryPrimaryAction;
        }
        UiEvent uiEvent3 = uiEvent2;
        ButtonType buttonType2 = buttonType;
        return transactionRowState.copy(uiMatchaPendingTransaction, transactionRowState4, buttonType2, uiEvent, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final UiMatchaPendingTransaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component2, reason: from getter */
    public final TransactionRowState4 getRow() {
        return this.row;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonType getLoadingButtonType() {
        return this.loadingButtonType;
    }

    public final UiEvent<Action> component4() {
        return this.actionEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.retryPrimaryAction;
    }

    public final TransactionRowState copy(UiMatchaPendingTransaction transaction, TransactionRowState4 row, ButtonType loadingButtonType, UiEvent<Action> actionEvent, UiEvent<Unit> retryPrimaryAction) {
        return new TransactionRowState(transaction, row, loadingButtonType, actionEvent, retryPrimaryAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionRowState)) {
            return false;
        }
        TransactionRowState transactionRowState = (TransactionRowState) other;
        return Intrinsics.areEqual(this.transaction, transactionRowState.transaction) && Intrinsics.areEqual(this.row, transactionRowState.row) && this.loadingButtonType == transactionRowState.loadingButtonType && Intrinsics.areEqual(this.actionEvent, transactionRowState.actionEvent) && Intrinsics.areEqual(this.retryPrimaryAction, transactionRowState.retryPrimaryAction);
    }

    public int hashCode() {
        UiMatchaPendingTransaction uiMatchaPendingTransaction = this.transaction;
        int iHashCode = (uiMatchaPendingTransaction == null ? 0 : uiMatchaPendingTransaction.hashCode()) * 31;
        TransactionRowState4 transactionRowState4 = this.row;
        int iHashCode2 = (iHashCode + (transactionRowState4 == null ? 0 : transactionRowState4.hashCode())) * 31;
        ButtonType buttonType = this.loadingButtonType;
        int iHashCode3 = (iHashCode2 + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
        UiEvent<Action> uiEvent = this.actionEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.retryPrimaryAction;
        return iHashCode4 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "TransactionRowState(transaction=" + this.transaction + ", row=" + this.row + ", loadingButtonType=" + this.loadingButtonType + ", actionEvent=" + this.actionEvent + ", retryPrimaryAction=" + this.retryPrimaryAction + ")";
    }

    public TransactionRowState(UiMatchaPendingTransaction uiMatchaPendingTransaction, TransactionRowState4 transactionRowState4, ButtonType buttonType, UiEvent<Action> uiEvent, UiEvent<Unit> uiEvent2) {
        this.transaction = uiMatchaPendingTransaction;
        this.row = transactionRowState4;
        this.loadingButtonType = buttonType;
        this.actionEvent = uiEvent;
        this.retryPrimaryAction = uiEvent2;
    }

    public /* synthetic */ TransactionRowState(UiMatchaPendingTransaction uiMatchaPendingTransaction, TransactionRowState4 transactionRowState4, ButtonType buttonType, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiMatchaPendingTransaction, (i & 2) != 0 ? null : transactionRowState4, (i & 4) != 0 ? null : buttonType, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2);
    }

    public final UiMatchaPendingTransaction getTransaction() {
        return this.transaction;
    }

    public final TransactionRowState4 getRow() {
        return this.row;
    }

    public final ButtonType getLoadingButtonType() {
        return this.loadingButtonType;
    }

    public final UiEvent<Action> getActionEvent() {
        return this.actionEvent;
    }

    public final UiEvent<Unit> getRetryPrimaryAction() {
        return this.retryPrimaryAction;
    }

    /* compiled from: TransactionRowState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "", "<init>", "()V", "Completed", "ReviewRequest", "VerificationRequired", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$Completed;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$ReviewRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Action {
        public static final int $stable = 0;

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J*\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$Completed;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "result", "Lkotlin/Result;", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "successText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/utils/resource/StringResource;)V", "getResult-d1pmJ48", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccessText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component1-d1pmJ48", "component2", "copy", "(Ljava/lang/Object;Lcom/robinhood/utils/resource/StringResource;)Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$Completed;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Completed extends Action {
            public static final int $stable = 8;
            private final Object result;
            private final StringResource successText;

            public static /* synthetic */ Completed copy$default(Completed completed, Result result, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    result = Result.m28549boximpl(completed.result);
                }
                if ((i & 2) != 0) {
                    stringResource = completed.successText;
                }
                return completed.copy(result.getValue(), stringResource);
            }

            /* renamed from: component1-d1pmJ48, reason: not valid java name and from getter */
            public final Object getResult() {
                return this.result;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getSuccessText() {
                return this.successText;
            }

            public final Completed copy(Object result, StringResource successText) {
                return new Completed(result, successText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Completed)) {
                    return false;
                }
                Completed completed = (Completed) other;
                return Result.m28552equalsimpl0(this.result, completed.result) && Intrinsics.areEqual(this.successText, completed.successText);
            }

            public int hashCode() {
                int iM28554hashCodeimpl = Result.m28554hashCodeimpl(this.result) * 31;
                StringResource stringResource = this.successText;
                return iM28554hashCodeimpl + (stringResource == null ? 0 : stringResource.hashCode());
            }

            public String toString() {
                return "Completed(result=" + Result.m28557toStringimpl(this.result) + ", successText=" + this.successText + ")";
            }

            public /* synthetic */ Completed(Object obj, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, (i & 2) != 0 ? null : stringResource);
            }

            /* renamed from: getResult-d1pmJ48, reason: not valid java name */
            public final Object m16351getResultd1pmJ48() {
                return this.result;
            }

            public final StringResource getSuccessText() {
                return this.successText;
            }

            public Completed(Object obj, StringResource stringResource) {
                super(null);
                this.result = obj;
                this.successText = stringResource;
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$ReviewRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "requestId", "Ljava/util/UUID;", "transactor", "Lcom/robinhood/android/matcha/models/ui/UiMatchaUser;", "amount", "Lcom/robinhood/models/util/Money;", MemoInputActivity.EXTRA_MEMO, "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/matcha/models/ui/UiMatchaUser;Lcom/robinhood/models/util/Money;Ljava/lang/String;)V", "getRequestId", "()Ljava/util/UUID;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/UiMatchaUser;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getMemo", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReviewRequest extends Action {
            public static final int $stable = 8;
            private final Money amount;
            private final String memo;
            private final UUID requestId;
            private final UiMatchaUser transactor;

            public static /* synthetic */ ReviewRequest copy$default(ReviewRequest reviewRequest, UUID uuid, UiMatchaUser uiMatchaUser, Money money, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = reviewRequest.requestId;
                }
                if ((i & 2) != 0) {
                    uiMatchaUser = reviewRequest.transactor;
                }
                if ((i & 4) != 0) {
                    money = reviewRequest.amount;
                }
                if ((i & 8) != 0) {
                    str = reviewRequest.memo;
                }
                return reviewRequest.copy(uuid, uiMatchaUser, money, str);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getRequestId() {
                return this.requestId;
            }

            /* renamed from: component2, reason: from getter */
            public final UiMatchaUser getTransactor() {
                return this.transactor;
            }

            /* renamed from: component3, reason: from getter */
            public final Money getAmount() {
                return this.amount;
            }

            /* renamed from: component4, reason: from getter */
            public final String getMemo() {
                return this.memo;
            }

            public final ReviewRequest copy(UUID requestId, UiMatchaUser transactor, Money amount, String memo) {
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new ReviewRequest(requestId, transactor, amount, memo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewRequest)) {
                    return false;
                }
                ReviewRequest reviewRequest = (ReviewRequest) other;
                return Intrinsics.areEqual(this.requestId, reviewRequest.requestId) && Intrinsics.areEqual(this.transactor, reviewRequest.transactor) && Intrinsics.areEqual(this.amount, reviewRequest.amount) && Intrinsics.areEqual(this.memo, reviewRequest.memo);
            }

            public int hashCode() {
                int iHashCode = ((((this.requestId.hashCode() * 31) + this.transactor.hashCode()) * 31) + this.amount.hashCode()) * 31;
                String str = this.memo;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ReviewRequest(requestId=" + this.requestId + ", transactor=" + this.transactor + ", amount=" + this.amount + ", memo=" + this.memo + ")";
            }

            public final UUID getRequestId() {
                return this.requestId;
            }

            public final UiMatchaUser getTransactor() {
                return this.transactor;
            }

            public final Money getAmount() {
                return this.amount;
            }

            public final String getMemo() {
                return this.memo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReviewRequest(UUID requestId, UiMatchaUser transactor, Money amount, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.requestId = requestId;
                this.transactor = transactor;
                this.amount = amount;
                this.memo = str;
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", "verification", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "context", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired$Context;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired$Context;)V", "getTransferId", "()Ljava/util/UUID;", "getVerification", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "getContext", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired$Context;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Context", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VerificationRequired extends Action implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<VerificationRequired> CREATOR = new Creator();
            private final Context context;
            private final UUID transferId;
            private final ApiMatchaTransfer.Verification verification;

            /* compiled from: TransactionRowState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<VerificationRequired> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerificationRequired createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerificationRequired((UUID) parcel.readSerializable(), (ApiMatchaTransfer.Verification) parcel.readParcelable(VerificationRequired.class.getClassLoader()), Context.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerificationRequired[] newArray(int i) {
                    return new VerificationRequired[i];
                }
            }

            public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, UUID uuid, ApiMatchaTransfer.Verification verification, Context context, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = verificationRequired.transferId;
                }
                if ((i & 2) != 0) {
                    verification = verificationRequired.verification;
                }
                if ((i & 4) != 0) {
                    context = verificationRequired.context;
                }
                return verificationRequired.copy(uuid, verification, context);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getTransferId() {
                return this.transferId;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }

            /* renamed from: component3, reason: from getter */
            public final Context getContext() {
                return this.context;
            }

            public final VerificationRequired copy(UUID transferId, ApiMatchaTransfer.Verification verification, Context context) {
                Intrinsics.checkNotNullParameter(transferId, "transferId");
                Intrinsics.checkNotNullParameter(verification, "verification");
                Intrinsics.checkNotNullParameter(context, "context");
                return new VerificationRequired(transferId, verification, context);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerificationRequired)) {
                    return false;
                }
                VerificationRequired verificationRequired = (VerificationRequired) other;
                return Intrinsics.areEqual(this.transferId, verificationRequired.transferId) && Intrinsics.areEqual(this.verification, verificationRequired.verification) && this.context == verificationRequired.context;
            }

            public int hashCode() {
                return (((this.transferId.hashCode() * 31) + this.verification.hashCode()) * 31) + this.context.hashCode();
            }

            public String toString() {
                return "VerificationRequired(transferId=" + this.transferId + ", verification=" + this.verification + ", context=" + this.context + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.transferId);
                dest.writeParcelable(this.verification, flags);
                dest.writeString(this.context.name());
            }

            public final UUID getTransferId() {
                return this.transferId;
            }

            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }

            public final Context getContext() {
                return this.context;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerificationRequired(UUID transferId, ApiMatchaTransfer.Verification verification, Context context) {
                super(null);
                Intrinsics.checkNotNullParameter(transferId, "transferId");
                Intrinsics.checkNotNullParameter(verification, "verification");
                Intrinsics.checkNotNullParameter(context, "context");
                this.transferId = transferId;
                this.verification = verification;
                this.context = context;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: TransactionRowState.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired$Context;", "", "<init>", "(Ljava/lang/String;I)V", "SEND_TRANSFER", "CLAIM_TRANSFER", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Context {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Context[] $VALUES;
                public static final Context SEND_TRANSFER = new Context("SEND_TRANSFER", 0);
                public static final Context CLAIM_TRANSFER = new Context("CLAIM_TRANSFER", 1);

                private static final /* synthetic */ Context[] $values() {
                    return new Context[]{SEND_TRANSFER, CLAIM_TRANSFER};
                }

                public static EnumEntries<Context> getEntries() {
                    return $ENTRIES;
                }

                private Context(String str, int i) {
                }

                static {
                    Context[] contextArr$values = $values();
                    $VALUES = contextArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(contextArr$values);
                }

                public static Context valueOf(String str) {
                    return (Context) Enum.valueOf(Context.class, str);
                }

                public static Context[] values() {
                    return (Context[]) $VALUES.clone();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactionRowState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType PRIMARY = new ButtonType("PRIMARY", 0);
        public static final ButtonType SECONDARY = new ButtonType("SECONDARY", 1);

        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{PRIMARY, SECONDARY};
        }

        public static EnumEntries<ButtonType> getEntries() {
            return $ENTRIES;
        }

        private ButtonType(String str, int i) {
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonTypeArr$values);
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    public final boolean isPrimaryButtonLoading() {
        return this.loadingButtonType == ButtonType.PRIMARY;
    }

    public final boolean isSecondaryButtonLoading() {
        return this.loadingButtonType == ButtonType.SECONDARY;
    }

    public final boolean isActionLoading() {
        return this.loadingButtonType != null;
    }
}
