package com.robinhood.android.transfers.recurring.p270ui;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiAutomaticDepositItem.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/UiAutomaticDepositItem;", "", "id", "", "account", "Lcom/robinhood/models/db/Account;", "amount", "Lcom/robinhood/models/util/Money;", "destinationAccountType", "Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;", "frequencyDisplayText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;Lcom/robinhood/utils/resource/StringResource;)V", "getId", "()Ljava/lang/String;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getDestinationAccountType", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;", "getFrequencyDisplayText", "()Lcom/robinhood/utils/resource/StringResource;", "getDestinationDisplayText", "resources", "Landroid/content/res/Resources;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UiAutomaticDepositItem {
    public static final int $stable = 8;
    private final Account account;
    private final Money amount;
    private final ApiAutomaticDeposit.DestinationAccountType destinationAccountType;
    private final StringResource frequencyDisplayText;
    private final String id;

    public UiAutomaticDepositItem(String id, Account account, Money amount, ApiAutomaticDeposit.DestinationAccountType destinationAccountType, StringResource frequencyDisplayText) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(destinationAccountType, "destinationAccountType");
        Intrinsics.checkNotNullParameter(frequencyDisplayText, "frequencyDisplayText");
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.destinationAccountType = destinationAccountType;
        this.frequencyDisplayText = frequencyDisplayText;
    }

    public final String getId() {
        return this.id;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final ApiAutomaticDeposit.DestinationAccountType getDestinationAccountType() {
        return this.destinationAccountType;
    }

    public final StringResource getFrequencyDisplayText() {
        return this.frequencyDisplayText;
    }

    public final String getDestinationDisplayText(Resources resources) {
        String destinationAccountDisplayString;
        DisplayName displayName;
        DisplayName.Variants variants;
        StringResource title;
        CharSequence text;
        String nickname;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Account account = this.account;
        if (account == null || (nickname = account.getNickname()) == null || (destinationAccountDisplayString = StringsKt.nullIfEmpty(nickname)) == null) {
            Account account2 = this.account;
            destinationAccountDisplayString = (account2 == null || (displayName = AccountDisplayNames.getDisplayName(account2)) == null || (variants = displayName.getShort()) == null || (title = variants.getTitle()) == null || (text = title.getText(resources)) == null) ? UiAutomaticDeposits.getDestinationAccountDisplayString(this.destinationAccountType, resources) : text.toString();
        }
        if (destinationAccountDisplayString != null) {
            return resources.getString(C30439R.string.ach_transfer_automatic_deposit_list_item_title, destinationAccountDisplayString);
        }
        return null;
    }
}
