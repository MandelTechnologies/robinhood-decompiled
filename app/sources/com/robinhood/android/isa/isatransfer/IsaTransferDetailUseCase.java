package com.robinhood.android.isa.isatransfer;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.isa.IsaTransferStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IsaTransferDetailUseCase.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "isaTransferStore", "Lcom/robinhood/store/isa/IsaTransferStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/isa/IsaTransferStore;)V", "checkIsIsaAccount", "", "Lcom/robinhood/models/db/Account;", "streamTransferDetailWithAccountType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/isa/isatransfer/IsaTransferWithAccountType;", "transferId", "Ljava/util/UUID;", "lib-isa-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IsaTransferDetailUseCase {
    private final AccountProvider accountProvider;
    private final IsaTransferStore isaTransferStore;

    /* compiled from: IsaTransferDetailUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IsaTransferDetailUseCase(AccountProvider accountProvider, IsaTransferStore isaTransferStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(isaTransferStore, "isaTransferStore");
        this.accountProvider = accountProvider;
        this.isaTransferStore = isaTransferStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsIsaAccount(Account account) {
        switch (WhenMappings.$EnumSwitchMapping$0[account.getBrokerageAccountType().ordinal()]) {
            case 1:
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException(("BrokerageAccountType " + account.getBrokerageAccountType().name() + " is not supported").toString());
            case 8:
                throw new IllegalStateException("BrokerageAccountType is unknown");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Flow<IsaTransferWithAccountType> streamTransferDetailWithAccountType(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return FlowKt.transformLatest(this.isaTransferStore.streamTransferById(transferId), new C19914xd503819(null, this));
    }
}
