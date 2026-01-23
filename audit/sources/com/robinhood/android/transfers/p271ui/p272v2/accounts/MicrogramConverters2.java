package com.robinhood.android.transfers.p271ui.p272v2.accounts;

import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetArgs;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService;
import com.robinhood.transfers.accounts.contracts.model.CreateTransferState;
import com.robinhood.transfers.accounts.contracts.model.TransferEntryPoint;
import com.robinhood.transfers.accounts.contracts.model.TransferFrequency;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramConverters.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001ab\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u000eH\u0002\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\bH\u0002\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u0004\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u0006H\u0002\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u0013H\u0002\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001fH\u0000¨\u0006 "}, m3636d2 = {"launchBottomSheet", "", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetService;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "transferDirection", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "transferFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "amount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "sourceAccountId", "", "sinkAccountId", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetService;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/math/BigDecimal;Ljava/util/Currency;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/IraContributionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMicrogramEntryPoint", "Lcom/robinhood/transfers/accounts/contracts/model/TransferEntryPoint;", "toMicrogramTransferFrequency", "Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;", "toMicrogramTransferAccountDirection", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "toMicrogramTransferDirection", "Lcom/robinhood/lib/transfers/contracts/models/TransferDirection;", "toMicrogramIraContributionType", "Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;", "Lcom/robinhood/models/db/TransferDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.accounts.MicrogramConvertersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MicrogramConverters2 {

    /* compiled from: MicrogramConverters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.accounts.MicrogramConvertersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[MAXTransferContext.EntryPoint.values().length];
            try {
                iArr[MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.ROTH_CONVERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCreateTransferRequest2.values().length];
            try {
                iArr2[ApiCreateTransferRequest2.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferAccountDirection.values().length];
            try {
                iArr3[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TransferDirectionV2.values().length];
            try {
                iArr4[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[IraContributionType.values().length];
            try {
                iArr5[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[IraContributionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[TransferDirection.values().length];
            try {
                iArr6[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final Object launchBottomSheet(AccountSelectionBottomSheetService accountSelectionBottomSheetService, TransferAccountDirection transferAccountDirection, TransferDirectionV2 transferDirectionV2, ApiCreateTransferRequest2 apiCreateTransferRequest2, BigDecimal bigDecimal, Currency currency, MAXTransferContext.EntryPoint entryPoint, String str, String str2, IraContributionType iraContributionType, Continuation<? super Unit> continuation) {
        com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection microgramTransferAccountDirection = toMicrogramTransferAccountDirection(transferAccountDirection);
        com.robinhood.lib.transfers.contracts.models.TransferDirection microgramTransferDirection = toMicrogramTransferDirection(transferDirectionV2);
        com.ionspin.kotlin.bignum.decimal.BigDecimal bignumBigDecimal = BigDecimals6.toBignumBigDecimal(bigDecimal);
        String currencyCode = currency.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        Object objLaunchBottomSheet = accountSelectionBottomSheetService.launchBottomSheet(new AccountSelectionBottomSheetArgs(microgramTransferAccountDirection, new CreateTransferState(microgramTransferDirection, bignumBigDecimal, currencyCode, toMicrogramTransferFrequency(apiCreateTransferRequest2), str, str2, iraContributionType != null ? toMicrogramIraContributionType(iraContributionType) : null), toMicrogramEntryPoint(entryPoint)), continuation);
        return objLaunchBottomSheet == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLaunchBottomSheet : Unit.INSTANCE;
    }

    private static final TransferEntryPoint toMicrogramEntryPoint(MAXTransferContext.EntryPoint entryPoint) {
        int i = WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
        if (i == 1) {
            return TransferEntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON;
        }
        if (i == 2) {
            return TransferEntryPoint.ROTH_CONVERSION;
        }
        return TransferEntryPoint.UNSPECIFIED;
    }

    private static final TransferFrequency toMicrogramTransferFrequency(ApiCreateTransferRequest2 apiCreateTransferRequest2) {
        switch (WhenMappings.$EnumSwitchMapping$1[apiCreateTransferRequest2.ordinal()]) {
            case 1:
                return TransferFrequency.ONCE;
            case 2:
                return TransferFrequency.WEEKLY;
            case 3:
                return TransferFrequency.BIWEEKLY;
            case 4:
                return TransferFrequency.MONTHLY;
            case 5:
                return TransferFrequency.QUARTERLY;
            case 6:
                throw new IllegalStateException("Unknown frequency!");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection toMicrogramTransferAccountDirection(TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(transferAccountDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[transferAccountDirection.ordinal()];
        if (i == 1) {
            return com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection.SOURCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection.SINK;
    }

    private static final com.robinhood.lib.transfers.contracts.models.TransferDirection toMicrogramTransferDirection(TransferDirectionV2 transferDirectionV2) {
        int i = WhenMappings.$EnumSwitchMapping$3[transferDirectionV2.ordinal()];
        if (i == 1) {
            return com.robinhood.lib.transfers.contracts.models.TransferDirection.DEPOSIT;
        }
        if (i == 2) {
            return com.robinhood.lib.transfers.contracts.models.TransferDirection.WITHDRAW;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.lib.transfers.contracts.models.TransferDirection.INTER_ENTITY;
    }

    private static final com.robinhood.transfers.accounts.contracts.model.IraContributionType toMicrogramIraContributionType(IraContributionType iraContributionType) {
        int i = WhenMappings.$EnumSwitchMapping$4[iraContributionType.ordinal()];
        if (i == 1) {
            return com.robinhood.transfers.accounts.contracts.model.IraContributionType.ONE_TIME_CONTRIBUTION;
        }
        if (i == 2) {
            return com.robinhood.transfers.accounts.contracts.model.IraContributionType.INDIRECT_ROLLOVER;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final com.robinhood.lib.transfers.contracts.models.TransferDirection toMicrogramTransferDirection(TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$5[transferDirection.ordinal()];
        if (i == 1) {
            return com.robinhood.lib.transfers.contracts.models.TransferDirection.DEPOSIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.lib.transfers.contracts.models.TransferDirection.WITHDRAW;
    }
}
