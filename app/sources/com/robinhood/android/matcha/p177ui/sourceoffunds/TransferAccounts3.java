package com.robinhood.android.matcha.p177ui.sourceoffunds;

import android.content.res.Resources;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\f\u001a\u00020\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"sourceOfFundsLabel", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceOfFundsLabel", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Ljava/lang/String;", "toSourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "toBentoSelectionRowState", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "selectedAccountId", "resources", "Landroid/content/res/Resources;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "getSecondaryText", "DefaultSourceOfFundsType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getDefaultSourceOfFundsType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "isValidP2PSourceOfFunds", "", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Z", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.TransferAccountsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TransferAccounts3 {
    private static final ApiTransferAccount.TransferAccountType DefaultSourceOfFundsType = ApiTransferAccount.TransferAccountType.RHY;

    /* compiled from: TransferAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.TransferAccountsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getSourceOfFundsLabel(TransferAccount transferAccount) {
        Money money;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        BigDecimal withdrawableCash = transferAccount.getWithdrawableCash();
        String str = (withdrawableCash == null || (money = Money3.toMoney(withdrawableCash, Currencies.USD)) == null) ? null : Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (str != null) {
            return transferAccount.getAccountName() + ": " + str;
        }
        return transferAccount.getAccountName() + PlaceholderUtils.XXShortPlaceholderText + transferAccount.getAccountNumber();
    }

    public static final SourceOfFunds toSourceOfFunds(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        return new SourceOfFunds(transferAccount.getType(), transferAccount.getAccountId(), null, getSourceOfFundsLabel(transferAccount), 4, null);
    }

    public static final BentoSelectionRowState toBentoSelectionRowState(TransferAccount transferAccount, String str, Resources resources) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, getPrimaryText(transferAccount).getText(resources).toString(), Intrinsics.areEqual(str, transferAccount.getAccountId()), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(getSecondaryText(transferAccount).getText(resources).toString()), transferAccount.isDepositsEnabled(), false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2016, (DefaultConstructorMarker) null);
    }

    private static final StringResource getPrimaryText(TransferAccount transferAccount) {
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccount.getType().ordinal()];
        if (i == 1 || i == 2) {
            return StringResource.INSTANCE.invoke(transferAccount.getAccountName());
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(transferAccount.getDisplayTitle());
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(transferAccount.getType());
        throw new ExceptionsH();
    }

    private static final StringResource getSecondaryText(TransferAccount transferAccount) {
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccount.getType().ordinal()];
        if (i == 1 || i == 2) {
            return StringResource.INSTANCE.invoke(transferAccount.getDisplayDetail());
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C21284R.string.gated_instant_matcha_transfer_source_fund_instantly, new Object[0]);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(transferAccount.getType());
        throw new ExceptionsH();
    }

    public static final ApiTransferAccount.TransferAccountType getDefaultSourceOfFundsType() {
        return DefaultSourceOfFundsType;
    }

    public static final boolean isValidP2PSourceOfFunds(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccount.getType().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
