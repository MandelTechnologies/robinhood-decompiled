package com.robinhood.android.advisory.projection.transfer;

import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferNavigationDestination.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"getTransferNavigationDestination", "Lcom/robinhood/android/navigation/keys/IntentKey;", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.transfer.TransferNavigationDestinationKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TransferNavigationDestination {

    /* compiled from: TransferNavigationDestination.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.projection.transfer.TransferNavigationDestinationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SimulateDepositFrequency.values().length];
            try {
                iArr[SimulateDepositFrequency.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimulateDepositFrequency.QUARTERLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimulateDepositFrequency.ONE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ IntentKey getTransferNavigationDestination$default(String str, BrokerageAccountType brokerageAccountType, SimulateDepositFrequency simulateDepositFrequency, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 4) != 0) {
            simulateDepositFrequency = SimulateDepositFrequency.ONE_TIME;
        }
        if ((i & 8) != 0) {
            entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        return getTransferNavigationDestination(str, brokerageAccountType, simulateDepositFrequency, entryPoint);
    }

    public static final IntentKey getTransferNavigationDestination(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, SimulateDepositFrequency frequency, MAXTransferContext.EntryPoint entryPoint) {
        ApiCreateTransferRequest2 apiCreateTransferRequest2;
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return new CreateRetirementContribution(null, rhsAccountNumber, null, false, SimulateDepositFrequency2.isRecurring(frequency), entryPoint, 13, null);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                TransferDirectionV2 transferDirectionV2 = TransferDirectionV2.DEPOSIT;
                TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(rhsAccountNumber, false, ApiTransferAccount.TransferAccountType.INSTANCE.fromBrokerageAccountType(brokerageAccountType), 2, null);
                int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
                if (i == 1) {
                    apiCreateTransferRequest2 = ApiCreateTransferRequest2.MONTHLY;
                } else if (i == 2) {
                    apiCreateTransferRequest2 = ApiCreateTransferRequest2.QUARTERLY;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
                }
                return new TransferV2(transferDirectionV2, new TransferConfiguration.Standard(null, apiCreateTransferRequest2, SimulateDepositFrequency2.isRecurring(frequency), null, transferAccountSelection, null, entryPoint, null, false, false, null, null, false, 8105, null), null, 4, null);
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
