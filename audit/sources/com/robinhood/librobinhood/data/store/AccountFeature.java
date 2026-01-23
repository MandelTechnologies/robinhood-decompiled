package com.robinhood.librobinhood.data.store;

import com.robinhood.android.drip.experiments.DripJointAccountsExperiment;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.recurring.experiments.RecurringJointAccountsExperiment;
import com.robinhood.android.regiongate.AssetDigestsRegionGate;
import com.robinhood.android.regiongate.CryptoBitstampUkUpsellRegionGate;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.CustodialRegionOrExperimentGate;
import com.robinhood.android.regiongate.DripRegionGate;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.FxAtTradeUkRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.SweepRegionGate;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.OptionLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountFeature.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountFeature;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO", "CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL", "DRIP", "MARGIN", "OPTIONS_SUPPORTED", "OPTIONS_CAN_UPGRADE", "OPTIONS_HAS_ACCESS", "RECURRING", "SLIP", "SWEEP", "ACATS_BROKERAGE_MATCH", "FUTURES", "EVENT_CONTRACTS", "COPILOT_DIGESTS", "PNL_HUB", "DASHBOARD_CURATED_LIST", "NOTIFICATION_CARD_STACK", "CONTRIBUTIONS", "FX_AT_TRADE", "lock", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "getLock", "()Lcom/robinhood/librobinhood/data/store/FeatureLock;", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AccountFeature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountFeature[] $VALUES;
    public static final AccountFeature CRYPTO = new AccountFeature("CRYPTO", 0);
    public static final AccountFeature CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL = new AccountFeature("CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL", 1);
    public static final AccountFeature DRIP = new AccountFeature("DRIP", 2);
    public static final AccountFeature MARGIN = new AccountFeature("MARGIN", 3);
    public static final AccountFeature OPTIONS_SUPPORTED = new AccountFeature("OPTIONS_SUPPORTED", 4);
    public static final AccountFeature OPTIONS_CAN_UPGRADE = new AccountFeature("OPTIONS_CAN_UPGRADE", 5);
    public static final AccountFeature OPTIONS_HAS_ACCESS = new AccountFeature("OPTIONS_HAS_ACCESS", 6);
    public static final AccountFeature RECURRING = new AccountFeature("RECURRING", 7);
    public static final AccountFeature SLIP = new AccountFeature("SLIP", 8);
    public static final AccountFeature SWEEP = new AccountFeature("SWEEP", 9);
    public static final AccountFeature ACATS_BROKERAGE_MATCH = new AccountFeature("ACATS_BROKERAGE_MATCH", 10);
    public static final AccountFeature FUTURES = new AccountFeature("FUTURES", 11);
    public static final AccountFeature EVENT_CONTRACTS = new AccountFeature("EVENT_CONTRACTS", 12);
    public static final AccountFeature COPILOT_DIGESTS = new AccountFeature("COPILOT_DIGESTS", 13);
    public static final AccountFeature PNL_HUB = new AccountFeature("PNL_HUB", 14);
    public static final AccountFeature DASHBOARD_CURATED_LIST = new AccountFeature("DASHBOARD_CURATED_LIST", 15);
    public static final AccountFeature NOTIFICATION_CARD_STACK = new AccountFeature("NOTIFICATION_CARD_STACK", 16);
    public static final AccountFeature CONTRIBUTIONS = new AccountFeature("CONTRIBUTIONS", 17);
    public static final AccountFeature FX_AT_TRADE = new AccountFeature("FX_AT_TRADE", 18);

    /* compiled from: AccountFeature.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountFeature.values().length];
            try {
                iArr[AccountFeature.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountFeature.CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountFeature.MARGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountFeature.DRIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountFeature.OPTIONS_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountFeature.OPTIONS_CAN_UPGRADE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountFeature.OPTIONS_HAS_ACCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountFeature.RECURRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountFeature.SLIP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountFeature.SWEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountFeature.ACATS_BROKERAGE_MATCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountFeature.FUTURES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountFeature.EVENT_CONTRACTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccountFeature.COPILOT_DIGESTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AccountFeature.PNL_HUB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AccountFeature.DASHBOARD_CURATED_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AccountFeature.NOTIFICATION_CARD_STACK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AccountFeature.CONTRIBUTIONS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AccountFeature.FX_AT_TRADE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AccountFeature[] $values() {
        return new AccountFeature[]{CRYPTO, CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL, DRIP, MARGIN, OPTIONS_SUPPORTED, OPTIONS_CAN_UPGRADE, OPTIONS_HAS_ACCESS, RECURRING, SLIP, SWEEP, ACATS_BROKERAGE_MATCH, FUTURES, EVENT_CONTRACTS, COPILOT_DIGESTS, PNL_HUB, DASHBOARD_CURATED_LIST, NOTIFICATION_CARD_STACK, CONTRIBUTIONS, FX_AT_TRADE};
    }

    public static EnumEntries<AccountFeature> getEntries() {
        return $ENTRIES;
    }

    private AccountFeature(String str, int i) {
    }

    static {
        AccountFeature[] accountFeatureArr$values = $values();
        $VALUES = accountFeatureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountFeatureArr$values);
    }

    public final FeatureLock getLock() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$0((FeatureLockBuilder) obj);
                    }
                });
            case 2:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$1((FeatureLockBuilder) obj);
                    }
                });
            case 3:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$2((FeatureLockBuilder) obj);
                    }
                });
            case 4:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$6((FeatureLockBuilder) obj);
                    }
                });
            case 5:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$9((FeatureLockBuilder) obj);
                    }
                });
            case 6:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$12((FeatureLockBuilder) obj);
                    }
                });
            case 7:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$13((FeatureLockBuilder) obj);
                    }
                });
            case 8:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$17((FeatureLockBuilder) obj);
                    }
                });
            case 9:
                return FeatureLockBuilder2.orLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$21((FeatureLockBuilder) obj);
                    }
                });
            case 10:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$25((FeatureLockBuilder) obj);
                    }
                });
            case 11:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$26((FeatureLockBuilder) obj);
                    }
                });
            case 12:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$27((FeatureLockBuilder) obj);
                    }
                });
            case 13:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$28((FeatureLockBuilder) obj);
                    }
                });
            case 14:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$29((FeatureLockBuilder) obj);
                    }
                });
            case 15:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$30((FeatureLockBuilder) obj);
                    }
                });
            case 16:
                return FeatureLockBuilder2.orLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$33((FeatureLockBuilder) obj);
                    }
                });
            case 17:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$34((FeatureLockBuilder) obj);
                    }
                });
            case 18:
                return FeatureLockBuilder2.orLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$35((FeatureLockBuilder) obj);
                    }
                });
            case 19:
                return FeatureLockBuilder2.andLock(new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountFeature._get_lock_$lambda$36((FeatureLockBuilder) obj);
                    }
                });
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$0(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, CryptoRegionGate.INSTANCE);
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.isOriginalAccount(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$1(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, CryptoBitstampUkUpsellRegionGate.INSTANCE);
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.isOriginalAccount(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$2(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.marginAccountType(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$6(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, DripRegionGate.INSTANCE);
        FeatureLockBuilder2.m2609or(andLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$6$lambda$5((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$6$lambda$5(FeatureLockBuilder or) {
        Intrinsics.checkNotNullParameter(or, "$this$or");
        FeatureLockBuilder2.brokerageAccountType(or, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL);
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$6$lambda$5$lambda$3((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$6$lambda$5$lambda$4((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$6$lambda$5$lambda$3(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.experiment(and, DripJointAccountsExperiment.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$6$lambda$5$lambda$4(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.CUSTODIAL_UGMA);
        FeatureLockBuilder2.regionGate(and, CustodialRegionOrExperimentGate.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$9(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, OptionsRegionGate.INSTANCE);
        FeatureLockBuilder2.m2609or(andLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$9$lambda$8((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$9$lambda$8(FeatureLockBuilder or) {
        Intrinsics.checkNotNullParameter(or, "$this$or");
        FeatureLockBuilder2.brokerageAccountType(or, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL);
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$9$lambda$8$lambda$7((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$9$lambda$8$lambda$7(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.experiment(and, Experiments.OptionsInJointAccountPreSetupExperiment.INSTANCE);
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit _get_lock_$lambda$12(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.m2609or(andLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$12$lambda$11((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.optionLevel(andLock, OptionLevel.INSTANCE.getDOWNGRADE());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$12$lambda$11(FeatureLockBuilder or) {
        Intrinsics.checkNotNullParameter(or, "$this$or");
        FeatureLockBuilder2.brokerageAccountType(or, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL);
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$12$lambda$11$lambda$10((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$12$lambda$11$lambda$10(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.experiment(and, Experiments.OptionsInJointAccountPreSetupExperiment.INSTANCE);
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$13(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.optionLevel(andLock, OptionLevel.LEVEL_2, OptionLevel.LEVEL_3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$17(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.m2609or(andLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$17$lambda$16((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$17$lambda$16(FeatureLockBuilder or) {
        Intrinsics.checkNotNullParameter(or, "$this$or");
        FeatureLockBuilder2.brokerageAccountType(or, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL);
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$17$lambda$16$lambda$14((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$17$lambda$16$lambda$15((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$17$lambda$16$lambda$14(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.experiment(and, RecurringJointAccountsExperiment.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$17$lambda$16$lambda$15(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.regionGate(and, CustodialRegionOrExperimentGate.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$21(FeatureLockBuilder orLock) {
        Intrinsics.checkNotNullParameter(orLock, "$this$orLock");
        FeatureLockBuilder2.and(orLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$21$lambda$18((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.and(orLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$21$lambda$19((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.and(orLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$21$lambda$20((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$21$lambda$18(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$21$lambda$19(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(and, ManagementType.MANAGED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$21$lambda$20(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.regionGate(and, CustodialRegionOrExperimentGate.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$25(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, SweepRegionGate.INSTANCE);
        FeatureLockBuilder2.m2609or(andLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$25$lambda$24((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$25$lambda$24(FeatureLockBuilder or) {
        Intrinsics.checkNotNullParameter(or, "$this$or");
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$25$lambda$24$lambda$22((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.managementType(or, ManagementType.MANAGED);
        FeatureLockBuilder2.and(or, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$25$lambda$24$lambda$23((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$25$lambda$24$lambda$22(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$25$lambda$24$lambda$23(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA);
        FeatureLockBuilder2.regionGate(and, CustodialRegionOrExperimentGate.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$26(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$27(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.regionGate(andLock, FuturesTradingRegionGate.INSTANCE);
        FeatureLockBuilder2.isOriginalAccount(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$28(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.regionGate(andLock, EventContractsRegionGate.INSTANCE);
        FeatureLockBuilder2.isOriginalAccount(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$29(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, AssetDigestsRegionGate.INSTANCE);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$30(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$33(FeatureLockBuilder orLock) {
        Intrinsics.checkNotNullParameter(orLock, "$this$orLock");
        FeatureLockBuilder2.and(orLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$33$lambda$31((FeatureLockBuilder) obj);
            }
        });
        FeatureLockBuilder2.and(orLock, new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountFeature$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountFeature._get_lock_$lambda$33$lambda$32((FeatureLockBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$33$lambda$31(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$33$lambda$32(FeatureLockBuilder and) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        FeatureLockBuilder2.brokerageAccountType(and, BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA);
        FeatureLockBuilder2.managementType(and, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.regionGate(and, CustodialRegionOrExperimentGate.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$34(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.INDIVIDUAL);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        FeatureLockBuilder2.isOriginalAccount(andLock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$35(FeatureLockBuilder orLock) {
        Intrinsics.checkNotNullParameter(orLock, "$this$orLock");
        FeatureLockBuilder2.brokerageAccountType(orLock, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.ISA_STOCKS_AND_SHARES);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_lock_$lambda$36(FeatureLockBuilder andLock) {
        Intrinsics.checkNotNullParameter(andLock, "$this$andLock");
        FeatureLockBuilder2.regionGate(andLock, FxAtTradeUkRegionGate.INSTANCE);
        FeatureLockBuilder2.brokerageAccountType(andLock, BrokerageAccountType.ISA_STOCKS_AND_SHARES);
        FeatureLockBuilder2.managementType(andLock, ManagementType.SELF_DIRECTED);
        return Unit.INSTANCE;
    }

    public static AccountFeature valueOf(String str) {
        return (AccountFeature) Enum.valueOf(AccountFeature.class, str);
    }

    public static AccountFeature[] values() {
        return (AccountFeature[]) $VALUES.clone();
    }
}
