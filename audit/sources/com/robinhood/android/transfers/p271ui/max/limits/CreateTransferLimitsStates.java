package com.robinhood.android.transfers.p271ui.max.limits;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateTransferLimitsStates.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m3636d2 = {"asDisclosure", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "Lcom/robinhood/android/transfers/lib/limits/CreateTransferLimitsState;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.limits.CreateTransferLimitsStatesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferLimitsStates {

    /* compiled from: CreateTransferLimitsStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.limits.CreateTransferLimitsStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated
    public static final CreateTransferDisclosure asDisclosure(CreateTransferLimitsState createTransferLimitsState, TransferDirection direction) {
        List<ApiAmountLimit> amount_limits;
        Object next;
        int i;
        Intrinsics.checkNotNullParameter(createTransferLimitsState, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if ((createTransferLimitsState instanceof CreateTransferLimitsState.LimitsRetrieved) && (amount_limits = ((CreateTransferLimitsState.LimitsRetrieved) createTransferLimitsState).getTransferLimits().getAmount_limits()) != null) {
            Iterator<T> it = amount_limits.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ApiAmountLimit) next).getLimits_interval() == LimitsInterval.DAILY) {
                    break;
                }
            }
            ApiAmountLimit apiAmountLimit = (ApiAmountLimit) next;
            if (apiAmountLimit != null) {
                CreateTransferDisclosure.Action.LimitsHubDetails limitsHubDetails = CreateTransferDisclosure.Action.LimitsHubDetails.INSTANCE;
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
                if (i2 == 1) {
                    i = C30065R.string.transfer_daily_deposit_limit_disclosure_template;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C30065R.string.transfer_daily_withdrawal_limit_disclosure_template;
                }
                return new CreateTransferDisclosure.Resource(companion.invoke(i, Money.format$default(Money3.toMoney(apiAmountLimit.getTotal_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)), limitsHubDetails);
            }
        }
        return null;
    }
}
