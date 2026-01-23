package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.p355ui.matcha.Transfer;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionRowState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransferSender;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "transaction", "Lcom/robinhood/models/ui/matcha/Transfer;", "<init>", "(Lcom/robinhood/models/ui/matcha/Transfer;)V", "getTransaction", "()Lcom/robinhood/models/ui/matcha/Transfer;", "verificationRequired", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "getVerificationRequired", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", "getPrimaryButton", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton", "getSecondaryText", "", "resources", "Landroid/content/res/Resources;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class TransferSender extends TransactionRowState4 {
    public static final int $stable = 8;
    private final StringResource primaryText;
    private final TransactionRowState4.Button secondaryButton;
    private final Transfer transaction;

    public static /* synthetic */ TransferSender copy$default(TransferSender transferSender, Transfer transfer, int i, Object obj) {
        if ((i & 1) != 0) {
            transfer = transferSender.transaction;
        }
        return transferSender.copy(transfer);
    }

    /* renamed from: component1, reason: from getter */
    public final Transfer getTransaction() {
        return this.transaction;
    }

    public final TransferSender copy(Transfer transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new TransferSender(transaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferSender) && Intrinsics.areEqual(this.transaction, ((TransferSender) other).transaction);
    }

    public int hashCode() {
        return this.transaction.hashCode();
    }

    public String toString() {
        return "TransferSender(transaction=" + this.transaction + ")";
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public Transfer getTransaction() {
        return this.transaction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSender(Transfer transaction) {
        super(null);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.transaction = transaction;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.primaryText = companion.invoke(C21284R.string.matcha_pending_transfer_sender_label, getTransaction().getTransactor().getDisplayName(), Money.format$default(getTransaction().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        this.secondaryButton = new TransactionRowState4.Button(TransactionRowState4.Action.CancelTransfer.INSTANCE, C11048R.string.general_label_cancel, companion.invoke(C21284R.string.matcha_transaction_cancel_transfer_success, getTransaction().getTransactor().getDisplayName()), false, 8, null);
    }

    private final ApiMatchaTransfer.Verification getVerificationRequired() {
        return (ApiMatchaTransfer.Verification) CollectionsKt.firstOrNull((List) getTransaction().getTransaction().getVerificationsRequired());
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public StringResource getPrimaryText() {
        return this.primaryText;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public TransactionRowState4.Button getPrimaryButton() {
        int i;
        if (getVerificationRequired() != null) {
            ApiMatchaTransfer.Verification verificationRequired = getVerificationRequired();
            Intrinsics.checkNotNull(verificationRequired);
            return new TransactionRowState4.Button(new TransactionRowState4.Action.VerifyToSendTransfer(verificationRequired), C21284R.string.matcha_verify_button_label, null, false, 8, null);
        }
        Boolean canRemind = getTransaction().getCanRemind();
        if (canRemind == null) {
            return null;
        }
        boolean zBooleanValue = canRemind.booleanValue();
        TransactionRowState4.Action.RemindTransfer remindTransfer = TransactionRowState4.Action.RemindTransfer.INSTANCE;
        if (zBooleanValue) {
            i = C21284R.string.matcha_pending_transaction_action_remind;
        } else {
            i = C21284R.string.matcha_pending_transaction_action_reminded;
        }
        return new TransactionRowState4.Button(remindTransfer, i, null, zBooleanValue);
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public TransactionRowState4.Button getSecondaryButton() {
        return this.secondaryButton;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public CharSequence getSecondaryText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        CharSequence secondaryText = super.getSecondaryText(resources);
        if (getVerificationRequired() == null) {
            return secondaryText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (((Object) secondaryText) + " · "));
        Object[] objArr = {new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE())), new StyleSpan(1)};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) resources.getString(C21284R.string.matcha_action_required));
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }
}
