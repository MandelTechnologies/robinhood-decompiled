package com.robinhood.android.transfers.canceltransfer;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.account.strings.TransferAccountNaming;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.moneymovement.strings.C22208R;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OutgoingWireTransaction;
import com.robinhood.shared.models.history.RhyInternalTransferTransaction;
import com.robinhood.shared.models.history.RhyOriginatedAchTransaction;
import com.robinhood.transfers.api.Direction;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CancelTransferConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"isLoadingMessage", "", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;", "getMessage", "Lcom/robinhood/utils/resource/StringResource;", "isPrimaryButtonLoading", "isSecondaryButtonDisabled", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CancelTransferConfirmationStateProvider2 {

    /* compiled from: CancelTransferConfirmationStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationStateProviderKt$WhenMappings */
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
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.PULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Direction.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Direction.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean isLoadingMessage(CancelTransferConfirmationDataState cancelTransferConfirmationDataState) {
        Intrinsics.checkNotNullParameter(cancelTransferConfirmationDataState, "<this>");
        return cancelTransferConfirmationDataState.getTransaction() == null;
    }

    public static final StringResource getMessage(CancelTransferConfirmationDataState cancelTransferConfirmationDataState) {
        StringResource stringResource;
        StringResource stringResource2;
        String accountNameInline;
        String accountNameInline2;
        StringResource stringResourceInvoke;
        Object stringResource3;
        StringResource stringResource4;
        int i;
        StringResource stringResourceInvoke2;
        StringResource stringResource5;
        int i2;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        Intrinsics.checkNotNullParameter(cancelTransferConfirmationDataState, "<this>");
        if (cancelTransferConfirmationDataState.getTransaction() == null) {
            return StringResource.INSTANCE.invoke("----------\n-----------\n");
        }
        MinervaTransaction transaction = cancelTransferConfirmationDataState.getTransaction();
        if (transaction instanceof MinervaTransaction.OriginatedAch) {
            StringResource achRelationshipDisplayNameResource = AchRelationships.getAchRelationshipDisplayNameResource(((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getRelationship());
            Account originatingAccount = ((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getOriginatingAccount();
            if (originatingAccount == null || (displayName = AccountDisplayNames.getDisplayName(originatingAccount)) == null || (withAccount = displayName.getWithAccount()) == null || (stringResourceInvoke2 = withAccount.getInSentence()) == null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                stringResourceInvoke2 = companion.invoke(C30556R.string.account_descriptor_with_account, companion.invoke(C39006R.string.payment_transfer_account_type_individual, new Object[0]));
            }
            TransferDirection direction = ((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[direction.ordinal()];
            if (i3 == 1) {
                stringResource5 = achRelationshipDisplayNameResource;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResource5 = stringResourceInvoke2;
            }
            int i4 = iArr[((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection().ordinal()];
            if (i4 == 1) {
                achRelationshipDisplayNameResource = stringResourceInvoke2;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i5 = C30556R.string.cancel_ach_transfer_confirmation_dialog_message;
            String str = Money.format$default(((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getEvent().getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            int i6 = iArr[((MinervaTransaction.OriginatedAch) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection().ordinal()];
            if (i6 == 1) {
                i2 = C22208R.string.deposit_lowercase;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C22208R.string.withdrawal_lowercase;
            }
            return companion2.invoke(i5, str, companion2.invoke(i2, new Object[0]), stringResource5, achRelationshipDisplayNameResource);
        }
        if (transaction instanceof RhyOriginatedAchTransaction) {
            AchRelationship relationship = ((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getRelationship();
            if (relationship == null || (stringResourceInvoke = AchRelationships.getAchRelationshipDisplayNameResource(relationship)) == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke("");
            }
            StringResource.Companion companion3 = StringResource.INSTANCE;
            int i7 = C30556R.string.account_descriptor_with_account;
            PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = ((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getOriginatingTransferAccountInfo();
            if (originatingTransferAccountInfo == null || (stringResource3 = originatingTransferAccountInfo.getAccountNameInline()) == null) {
                stringResource3 = TransferAccountNaming.getStringResource(((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getOriginatingAccountType());
            }
            StringResource stringResourceInvoke3 = companion3.invoke(i7, stringResource3);
            Direction direction2 = ((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection();
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
            int i8 = iArr2[direction2.ordinal()];
            if (i8 == 1) {
                stringResource4 = stringResourceInvoke;
            } else {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown direction!");
                }
                stringResource4 = stringResourceInvoke3;
            }
            int i9 = iArr2[((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection().ordinal()];
            if (i9 == 1) {
                stringResourceInvoke = stringResourceInvoke3;
            } else if (i9 != 2) {
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown direction!");
            }
            int i10 = C30556R.string.cancel_ach_transfer_confirmation_dialog_message;
            String str2 = Money.format$default(((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            int i11 = iArr2[((RhyOriginatedAchTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getDirection().ordinal()];
            if (i11 == 1) {
                i = C22208R.string.deposit_lowercase;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown direction!");
                }
                i = C22208R.string.withdrawal_lowercase;
            }
            return companion3.invoke(i10, str2, companion3.invoke(i, new Object[0]), stringResource4, stringResourceInvoke);
        }
        if (transaction instanceof RhyInternalTransferTransaction) {
            PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo2 = ((RhyInternalTransferTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getOriginatingTransferAccountInfo();
            if (originatingTransferAccountInfo2 == null || (accountNameInline2 = originatingTransferAccountInfo2.getAccountNameInline()) == null || (stringResource = StringResource.INSTANCE.invoke(accountNameInline2)) == null) {
                stringResource = TransferAccountNaming.getStringResource(((RhyInternalTransferTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getOriginatingAccountType());
            }
            PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = ((RhyInternalTransferTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getReceivingTransferAccountInfo();
            if (receivingTransferAccountInfo == null || (accountNameInline = receivingTransferAccountInfo.getAccountNameInline()) == null || (stringResource2 = StringResource.INSTANCE.invoke(accountNameInline)) == null) {
                stringResource2 = TransferAccountNaming.getStringResource(((RhyInternalTransferTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getReceivingAccountType());
            }
            StringResource.Companion companion4 = StringResource.INSTANCE;
            return companion4.invoke(C30556R.string.cancel_internal_transfer_confirmation_dialog_message, Money.format$default(((RhyInternalTransferTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), companion4.invoke(C22208R.string.transfer_lowercase, new Object[0]), stringResource, stringResource2);
        }
        if (transaction instanceof OutgoingWireTransaction) {
            return StringResource.INSTANCE.invoke(C30556R.string.cancel_outgoing_wire_confirmation_dialog_message, Money.format$default(((OutgoingWireTransaction) cancelTransferConfirmationDataState.getTransaction()).getEvent().getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        throw new IllegalStateException(("Unsupported transaction! id: " + cancelTransferConfirmationDataState.getTransaction().getEvent().getId()).toString());
    }

    public static final boolean isPrimaryButtonLoading(CancelTransferConfirmationDataState cancelTransferConfirmationDataState) {
        Intrinsics.checkNotNullParameter(cancelTransferConfirmationDataState, "<this>");
        return cancelTransferConfirmationDataState.isCancelingTransfer();
    }

    public static final boolean isSecondaryButtonDisabled(CancelTransferConfirmationDataState cancelTransferConfirmationDataState) {
        Intrinsics.checkNotNullParameter(cancelTransferConfirmationDataState, "<this>");
        return !cancelTransferConfirmationDataState.isCancelingTransfer();
    }
}
