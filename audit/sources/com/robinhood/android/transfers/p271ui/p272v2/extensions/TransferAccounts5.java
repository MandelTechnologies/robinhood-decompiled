package com.robinhood.android.transfers.p271ui.p272v2.extensions;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a2\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, m3636d2 = {"isEnabledForTransferDirection", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferDirection", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "partiallyNullInvalidAccountPairing", "Lkotlin/Pair;", "direction", "from", "to", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.extensions.TransferAccountsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccounts5 {

    /* compiled from: TransferAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.extensions.TransferAccountsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isEnabledForTransferDirection(TransferAccount transferAccount, TransferDirectionV2 transferDirection) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return transferAccount.isDepositsEnabled();
        }
        if (i == 2 || i == 3) {
            return transferAccount.isWithdrawalsEnabled();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Tuples2<TransferAccount, TransferAccount> partiallyNullInvalidAccountPairing(TransferDirectionV2 direction, TransferAccount transferAccount, TransferAccount transferAccount2) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            if ((transferAccount != null ? transferAccount.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                if ((transferAccount2 != null ? transferAccount2.getType() : null) != ApiTransferAccount.TransferAccountType.RHS) {
                    if ((transferAccount2 != null ? transferAccount2.getType() : null) != ApiTransferAccount.TransferAccountType.RHY) {
                        if ((transferAccount2 != null ? transferAccount2.getType() : null) != null) {
                            return Tuples4.m3642to(null, transferAccount2);
                        }
                    }
                }
                return Tuples4.m3642to(transferAccount, transferAccount2);
            }
            return Tuples4.m3642to(transferAccount, transferAccount2);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return Tuples4.m3642to(transferAccount, transferAccount2);
        }
        if ((transferAccount2 != null ? transferAccount2.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            if ((transferAccount != null ? transferAccount.getType() : null) != ApiTransferAccount.TransferAccountType.RHS || transferAccount.isManaged()) {
                if ((transferAccount != null ? transferAccount.getType() : null) != ApiTransferAccount.TransferAccountType.RHY) {
                    if ((transferAccount != null ? transferAccount.getType() : null) != null) {
                        return Tuples4.m3642to(transferAccount, null);
                    }
                }
            }
            return Tuples4.m3642to(transferAccount, transferAccount2);
        }
        return Tuples4.m3642to(transferAccount, transferAccount2);
    }
}
