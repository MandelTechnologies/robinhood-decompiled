package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.content.res.Resources;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.p355ui.matcha.Request;
import com.robinhood.models.p355ui.matcha.Transfer;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.utils.datetime.format.InstantFormatter2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionRowState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001a\u001b\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b\u0082\u0001\u0004\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "", "<init>", "()V", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "getTransaction", "()Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", "getPrimaryButton", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton", "primaryButtonText", "getPrimaryButtonText", "secondaryButtonText", "getSecondaryButtonText", "getSecondaryText", "", "resources", "Landroid/content/res/Resources;", "Action", "Button", "Companion", "Lcom/robinhood/android/matcha/ui/history/pending/row/RequestReceiver;", "Lcom/robinhood/android/matcha/ui/history/pending/row/RequestSender;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransferReceiver;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransferSender;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class TransactionRowState4 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ TransactionRowState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Button getPrimaryButton();

    public abstract StringResource getPrimaryText();

    public abstract Button getSecondaryButton();

    public abstract UiMatchaPendingTransaction getTransaction();

    private TransactionRowState4() {
    }

    /* compiled from: TransactionRowState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "", "AcceptRequest", "DeclineRequest", "ReviewRequest", "CancelRequest", "RemindRequest", "ClaimTransfer", "DeclineTransfer", "RemindTransfer", "CancelTransfer", "VerifyToSendTransfer", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$AcceptRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$CancelRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$CancelTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$ClaimTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$DeclineRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$DeclineTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$RemindRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$RemindTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$ReviewRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$VerifyToSendTransfer;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action */
    public interface Action {

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$AcceptRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$AcceptRequest */
        public static final class AcceptRequest implements Action {
            public static final int $stable = 0;
            public static final AcceptRequest INSTANCE = new AcceptRequest();

            private AcceptRequest() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$DeclineRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$DeclineRequest */
        public static final class DeclineRequest implements Action {
            public static final int $stable = 0;
            public static final DeclineRequest INSTANCE = new DeclineRequest();

            private DeclineRequest() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$ReviewRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$ReviewRequest */
        public static final class ReviewRequest implements Action {
            public static final int $stable = 0;
            public static final ReviewRequest INSTANCE = new ReviewRequest();

            private ReviewRequest() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$CancelRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$CancelRequest */
        public static final class CancelRequest implements Action {
            public static final int $stable = 0;
            public static final CancelRequest INSTANCE = new CancelRequest();

            private CancelRequest() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$RemindRequest;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$RemindRequest */
        public static final class RemindRequest implements Action {
            public static final int $stable = 0;
            public static final RemindRequest INSTANCE = new RemindRequest();

            private RemindRequest() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$ClaimTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$ClaimTransfer */
        public static final class ClaimTransfer implements Action {
            public static final int $stable = 0;
            public static final ClaimTransfer INSTANCE = new ClaimTransfer();

            private ClaimTransfer() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$DeclineTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$DeclineTransfer */
        public static final class DeclineTransfer implements Action {
            public static final int $stable = 0;
            public static final DeclineTransfer INSTANCE = new DeclineTransfer();

            private DeclineTransfer() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$RemindTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$RemindTransfer */
        public static final class RemindTransfer implements Action {
            public static final int $stable = 0;
            public static final RemindTransfer INSTANCE = new RemindTransfer();

            private RemindTransfer() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$CancelTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$CancelTransfer */
        public static final class CancelTransfer implements Action {
            public static final int $stable = 0;
            public static final CancelTransfer INSTANCE = new CancelTransfer();

            private CancelTransfer() {
            }
        }

        /* compiled from: TransactionRowState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action$VerifyToSendTransfer;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "verification", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "<init>", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;)V", "getVerification", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Action$VerifyToSendTransfer, reason: from toString */
        public static final /* data */ class VerifyToSendTransfer implements Action {
            public static final int $stable = 8;
            private final ApiMatchaTransfer.Verification verification;

            public static /* synthetic */ VerifyToSendTransfer copy$default(VerifyToSendTransfer verifyToSendTransfer, ApiMatchaTransfer.Verification verification, int i, Object obj) {
                if ((i & 1) != 0) {
                    verification = verifyToSendTransfer.verification;
                }
                return verifyToSendTransfer.copy(verification);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }

            public final VerifyToSendTransfer copy(ApiMatchaTransfer.Verification verification) {
                Intrinsics.checkNotNullParameter(verification, "verification");
                return new VerifyToSendTransfer(verification);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerifyToSendTransfer) && Intrinsics.areEqual(this.verification, ((VerifyToSendTransfer) other).verification);
            }

            public int hashCode() {
                return this.verification.hashCode();
            }

            public String toString() {
                return "VerifyToSendTransfer(verification=" + this.verification + ")";
            }

            public VerifyToSendTransfer(ApiMatchaTransfer.Verification verification) {
                Intrinsics.checkNotNullParameter(verification, "verification");
                this.verification = verification;
            }

            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }
        }
    }

    /* compiled from: TransactionRowState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", "", "action", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "textRes", "", "successText", "Lcom/robinhood/utils/resource/StringResource;", "isEnabled", "", "<init>", "(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;ILcom/robinhood/utils/resource/StringResource;Z)V", "getAction", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "getTextRes", "()I", "getSuccessText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Button, reason: from toString */
    public static final /* data */ class Button {
        public static final int $stable = StringResource.$stable;
        private final Action action;
        private final boolean isEnabled;
        private final StringResource successText;
        private final int textRes;

        public static /* synthetic */ Button copy$default(Button button, Action action, int i, StringResource stringResource, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                action = button.action;
            }
            if ((i2 & 2) != 0) {
                i = button.textRes;
            }
            if ((i2 & 4) != 0) {
                stringResource = button.successText;
            }
            if ((i2 & 8) != 0) {
                z = button.isEnabled;
            }
            return button.copy(action, i, stringResource, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTextRes() {
            return this.textRes;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSuccessText() {
            return this.successText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final Button copy(Action action, int textRes, StringResource successText, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(action, textRes, successText, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(this.action, button.action) && this.textRes == button.textRes && Intrinsics.areEqual(this.successText, button.successText) && this.isEnabled == button.isEnabled;
        }

        public int hashCode() {
            int iHashCode = ((this.action.hashCode() * 31) + Integer.hashCode(this.textRes)) * 31;
            StringResource stringResource = this.successText;
            return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "Button(action=" + this.action + ", textRes=" + this.textRes + ", successText=" + this.successText + ", isEnabled=" + this.isEnabled + ")";
        }

        public Button(Action action, int i, StringResource stringResource, boolean z) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.textRes = i;
            this.successText = stringResource;
            this.isEnabled = z;
        }

        public /* synthetic */ Button(Action action, int i, StringResource stringResource, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, i, stringResource, (i2 & 8) != 0 ? true : z);
        }

        public final Action getAction() {
            return this.action;
        }

        public final int getTextRes() {
            return this.textRes;
        }

        public final StringResource getSuccessText() {
            return this.successText;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    public final StringResource getPrimaryButtonText() {
        Button primaryButton = getPrimaryButton();
        if (primaryButton == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(primaryButton.getTextRes(), new Object[0]);
    }

    public final StringResource getSecondaryButtonText() {
        Button secondaryButton = getSecondaryButton();
        if (secondaryButton == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(secondaryButton.getTextRes(), new Object[0]);
    }

    public CharSequence getSecondaryText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return InstantFormatter2.formatRecent(getTransaction().getCreatedAt(), resources);
    }

    /* compiled from: TransactionRowState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Companion;", "", "<init>", "()V", "fromTransaction", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRow$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransactionRowState4 fromTransaction(UiMatchaPendingTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            boolean z = transaction instanceof Request;
            if (z && transaction.isSender()) {
                return new TransactionRowState3((Request) transaction);
            }
            if (z && transaction.isReceiver()) {
                return new TransactionRowState2((Request) transaction);
            }
            boolean z2 = transaction instanceof Transfer;
            if (z2 && transaction.isSender()) {
                return new TransactionRowState6((Transfer) transaction);
            }
            if (z2 && transaction.isReceiver()) {
                return new TransactionRowState5((Transfer) transaction);
            }
            throw new IllegalStateException("Unexpected transaction type");
        }
    }
}
