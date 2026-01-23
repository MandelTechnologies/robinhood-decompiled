package com.robinhood.rosetta.converters.brokerage;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: BrokerageAccountTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"toProtobuf", "Lrosetta/account/BrokerageAccountType;", "Lcom/robinhood/models/api/BrokerageAccountType;", "toDto", "Lrosetta/account/BrokerageAccountTypeDto;", "toBrokerageAccountType", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class BrokerageAccountTypes3 {

    /* compiled from: BrokerageAccountTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[rosetta.account.BrokerageAccountType.values().length];
            try {
                iArr2[rosetta.account.BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[rosetta.account.BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final rosetta.account.BrokerageAccountType toProtobuf(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
                return rosetta.account.BrokerageAccountType.CUSTODIAL_UGMA;
            case 2:
                return rosetta.account.BrokerageAccountType.CUSTODIAL_UTMA;
            case 3:
                return rosetta.account.BrokerageAccountType.INDIVIDUAL;
            case 4:
                return rosetta.account.BrokerageAccountType.IRA_ROTH;
            case 5:
                return rosetta.account.BrokerageAccountType.IRA_TRADITIONAL;
            case 6:
                return rosetta.account.BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
            case 7:
                return rosetta.account.BrokerageAccountType.ISA_STOCKS_AND_SHARES;
            case 8:
                return rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final BrokerageAccountTypeDto toDto(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        return BrokerageAccountTypeDto.INSTANCE.fromProto(toProtobuf(brokerageAccountType));
    }

    public static final BrokerageAccountType toBrokerageAccountType(rosetta.account.BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
                return BrokerageAccountType.CUSTODIAL_UGMA;
            case 2:
                return BrokerageAccountType.CUSTODIAL_UTMA;
            case 3:
                return BrokerageAccountType.INDIVIDUAL;
            case 4:
                return BrokerageAccountType.IRA_ROTH;
            case 5:
                return BrokerageAccountType.IRA_TRADITIONAL;
            case 6:
                return BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
            case 7:
                return BrokerageAccountType.ISA_STOCKS_AND_SHARES;
            default:
                return BrokerageAccountType.UNKNOWN;
        }
    }
}
