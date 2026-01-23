package com.robinhood.android.transfers.ach.util;

import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.TransferContext;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a.\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¨\u0006\u000f"}, m3636d2 = {"toDirectionForLogging", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "Lcom/robinhood/models/db/TransferDirection;", "toFrequencyForLogging", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "createContextForLogging", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/android/common/ui/BaseFragment;", "achRelationshipId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "direction", "frequency", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.util.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LoggingUtils7 {

    /* compiled from: LoggingUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.util.LoggingUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr2[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TransferContext.Direction toDirectionForLogging(TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return TransferContext.Direction.DEPOSIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return TransferContext.Direction.WITHDRAWAL;
    }

    public static final TransferContext.Frequency toFrequencyForLogging(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == 1) {
            return TransferContext.Frequency.ONCE;
        }
        if (i == 2) {
            return TransferContext.Frequency.WEEKLY;
        }
        if (i == 3) {
            return TransferContext.Frequency.BIWEEKLY;
        }
        if (i == 4) {
            return TransferContext.Frequency.MONTHLY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return TransferContext.Frequency.QUARTERLY;
    }

    public static final Context createContextForLogging(BaseFragment baseFragment, UUID uuid, BigDecimal amount, TransferDirection direction, ApiAutomaticDeposit.Frequency frequency) {
        String string2;
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Money moneyForLogging = com.robinhood.android.transfers.lib.ExtensionsKt.toMoneyForLogging(amount);
        TransferContext.Direction directionForLogging = toDirectionForLogging(direction);
        TransferContext.EntryPoint entryPointForLogging = ExtensionsKt.getEntryPointForLogging(baseFragment);
        TransferContext.Frequency frequencyForLogging = toFrequencyForLogging(frequency);
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        if (uuid != null && !frequency.getIsRecurring()) {
            string2 = ExtensionsKt.generateRefId(baseFragment, new TransferData(uuid, amount, direction)).toString();
        } else {
            string2 = "";
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        String string3 = ExtensionsKt.getSessionId(baseFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new TransferContext(moneyForLogging, directionForLogging, entryPointForLogging, frequencyForLogging, paymentInstrument, str, string3, null, 128, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null);
    }
}
