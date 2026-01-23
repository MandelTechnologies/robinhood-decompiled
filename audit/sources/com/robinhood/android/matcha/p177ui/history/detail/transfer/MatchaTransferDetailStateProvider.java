package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.transfer.MatchaTransferDetailViewState;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.models.matcha.api.MatchaMemo;
import com.robinhood.android.models.matcha.api.MatchaTransferRole;
import com.robinhood.android.models.matcha.api.MatchaTransferState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: MatchaTransferDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u000e*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001cR\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000e*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\t*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\u000e*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u0004\u0018\u00010%*\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u00020\t*\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "<init>", "()V", "reduce", "dataState", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "getSubtitle", "(Lcom/robinhood/models/db/matcha/MatchaTransfer;)Lcom/robinhood/utils/resource/StringResource;", "transactorIdLabel", "", "getTransactorIdLabel", "(Lcom/robinhood/models/db/matcha/MatchaTransfer;)I", "disputeState", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;", "getDisputeState", "(Lcom/robinhood/models/db/matcha/MatchaTransfer;)Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;", "toViewState", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "Lcom/robinhood/android/models/matcha/api/MatchaMemo;", "role", "Lcom/robinhood/android/models/matcha/api/MatchaTransferRole;", "bannerText", "Lcom/robinhood/android/models/matcha/api/MatchaMemo$State;", "(Lcom/robinhood/android/models/matcha/api/MatchaMemo$State;Lcom/robinhood/android/models/matcha/api/MatchaTransferRole;)Ljava/lang/Integer;", "statusDescription", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Dispute;", "getStatusDescription", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Dispute;)Lcom/robinhood/utils/resource/StringResource;", "accountLabel", "getAccountLabel", "(Lcom/robinhood/android/models/matcha/api/MatchaTransferRole;)I", "statusBanner", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "Lcom/robinhood/android/models/matcha/api/MatchaTransferState;", "getStatusBanner", "(Lcom/robinhood/android/models/matcha/api/MatchaTransferState;)Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "displayValue", "getDisplayValue", "(Lcom/robinhood/android/models/matcha/api/MatchaTransferState;)Lcom/robinhood/utils/resource/StringResource;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaTransferDetailStateProvider implements StateProvider<MatchaTransferDetailDataState, MatchaTransferDetailViewState> {
    public static final int $stable = 0;

    /* compiled from: MatchaTransferDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[MatchaMemo.State.values().length];
            try {
                iArr[MatchaMemo.State.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaMemo.State.FLAGGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchaMemo.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MatchaMemo.State.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiMatchaTransfer.Dispute.State.values().length];
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.UNDER_INVESTIGATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.TEMPORARY_CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.CREDITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.NOT_CREDITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiMatchaTransfer.Dispute.State.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MatchaTransferRole.values().length];
            try {
                iArr3[MatchaTransferRole.SENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MatchaTransferRole.RECEIVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MatchaTransferRole.SENDER_OR_RECEIVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MatchaTransferState.values().length];
            try {
                iArr4[MatchaTransferState.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[MatchaTransferState.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[MatchaTransferState.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[MatchaTransferState.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[MatchaTransferState.DECLINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[MatchaTransferState.PROCESSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[MatchaTransferState.PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[MatchaTransferState.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MatchaTransferDetailViewState reduce(MatchaTransferDetailDataState dataState) {
        StringResource displayValue;
        StringResource stringResource;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MatchaTransfer transfer = dataState.getTransfer();
        if (transfer != null) {
            ProfileAvatarState avatar = ProfileAvatars.getAvatar(transfer.getTransactor());
            String str = Money.Adjustment.format$default(transfer.getAdjustment(), false, null, 3, null);
            String str2 = InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) transfer.getCreatedAt());
            StringResource subtitle = getSubtitle(transfer);
            MatchaMemo memo = transfer.getMemo();
            MatchaTransferDetailViewState.Loaded.Memo viewState = memo != null ? toViewState(memo, transfer.getRole()) : null;
            if (transfer.getClawbackFromReceiver()) {
                displayValue = StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_detail_debited, new Object[0]);
            } else if (transfer.getDispute() == null) {
                displayValue = getDisplayValue(transfer.getState());
            } else {
                stringResource = null;
                MatchaTransferDetailViewState.Loaded.StatusBanner statusBanner = getStatusBanner(transfer.getState());
                int transactorIdLabel = getTransactorIdLabel(transfer);
                String displayIdentifier = transfer.getTransactor().getDisplayIdentifier();
                String string2 = transfer.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return new MatchaTransferDetailViewState.Loaded(avatar, str, subtitle, viewState, stringResource, statusBanner, str2, transfer.getTransactor(), displayIdentifier, transactorIdLabel, string2, getAccountLabel(transfer.getRole()), getDisputeState(transfer), !transfer.getClawbackFromReceiver() ? StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_clawback, Money.format$default(transfer.getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)) : null, dataState.getShowMenuSheet(), dataState.getLaunchReporting(), dataState.getShowBlockConfirmationDialog(), dataState.getBlockResultEvent(), dataState.isBlocked());
            }
            stringResource = displayValue;
            MatchaTransferDetailViewState.Loaded.StatusBanner statusBanner2 = getStatusBanner(transfer.getState());
            int transactorIdLabel2 = getTransactorIdLabel(transfer);
            String displayIdentifier2 = transfer.getTransactor().getDisplayIdentifier();
            String string22 = transfer.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            return new MatchaTransferDetailViewState.Loaded(avatar, str, subtitle, viewState, stringResource, statusBanner2, str2, transfer.getTransactor(), displayIdentifier2, transactorIdLabel2, string22, getAccountLabel(transfer.getRole()), getDisputeState(transfer), !transfer.getClawbackFromReceiver() ? StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_clawback, Money.format$default(transfer.getAdjustment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)) : null, dataState.getShowMenuSheet(), dataState.getLaunchReporting(), dataState.getShowBlockConfirmationDialog(), dataState.getBlockResultEvent(), dataState.isBlocked());
        }
        return MatchaTransferDetailViewState.Loading.INSTANCE;
    }

    private final StringResource getSubtitle(MatchaTransfer matchaTransfer) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (matchaTransfer.getRole() == MatchaTransferRole.SENDER) {
            i = C21284R.string.matcha_transfer_sender_subtitle;
        } else {
            i = C21284R.string.matcha_transfer_receiver_subtitle;
        }
        return companion.invoke(i, matchaTransfer.getTransactor().getDisplayName());
    }

    private final int getTransactorIdLabel(MatchaTransfer matchaTransfer) {
        if (matchaTransfer.getTransactor().getIdentifier().getType() == ApiMatchaIdentifier2.USER_UUID) {
            return C21284R.string.matcha_transaction_detail_username;
        }
        return C21284R.string.matcha_transaction_detail_contact;
    }

    private final MatchaTransferDetailViewState.Loaded.Dispute getDisputeState(MatchaTransfer matchaTransfer) {
        ApiMatchaTransfer.Dispute dispute = matchaTransfer.getDispute();
        if (dispute == null) {
            return null;
        }
        String serverValue = dispute.getDispute_state().getServerValue();
        StringResource statusDescription = getStatusDescription(dispute);
        Instant created_at = dispute.getCreated_at();
        InstantFormatter instantFormatter = InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE;
        return new MatchaTransferDetailViewState.Loaded.Dispute(serverValue, statusDescription, instantFormatter.format((InstantFormatter) created_at), instantFormatter.format((InstantFormatter) dispute.getUpdated_at()));
    }

    private final MatchaTransferDetailViewState.Loaded.Memo toViewState(MatchaMemo matchaMemo, MatchaTransferRole matchaTransferRole) {
        MatchaTransferDetailViewState.Loaded.MemoContent approved;
        MatchaMemo.State state = matchaMemo.getState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[state.ordinal()];
        Integer numValueOf = null;
        if (i == 1) {
            approved = new MatchaTransferDetailViewState.Loaded.MemoContent.Approved(matchaMemo.getContent());
        } else if (i == 2) {
            approved = new MatchaTransferDetailViewState.Loaded.MemoContent.Flagged(matchaMemo.getContent());
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            approved = MatchaTransferDetailViewState.Loaded.MemoContent.Removed.INSTANCE;
        }
        Integer numBannerText = bannerText(matchaMemo.getState(), matchaTransferRole);
        int i2 = iArr[matchaMemo.getState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                numValueOf = Integer.valueOf(C21284R.string.rh_app_use_standards_cta);
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new MatchaTransferDetailViewState.Loaded.Memo(approved, numBannerText, numValueOf);
    }

    private final Integer bannerText(MatchaMemo.State state, MatchaTransferRole matchaTransferRole) {
        MatchaMemo.State state2 = MatchaMemo.State.REMOVED;
        if (state == state2 && matchaTransferRole == MatchaTransferRole.SENDER) {
            return Integer.valueOf(C21284R.string.matcha_memo_removed_sender);
        }
        if (state == state2 && matchaTransferRole == MatchaTransferRole.RECEIVER) {
            return Integer.valueOf(C21284R.string.matcha_memo_removed_receiver);
        }
        MatchaMemo.State state3 = MatchaMemo.State.FLAGGED;
        if (state == state3 && matchaTransferRole == MatchaTransferRole.SENDER) {
            return Integer.valueOf(C21284R.string.matcha_memo_hidden_sender);
        }
        if (state == state3 && matchaTransferRole == MatchaTransferRole.RECEIVER) {
            return Integer.valueOf(C21284R.string.matcha_memo_hidden_receiver);
        }
        return null;
    }

    private final StringResource getStatusDescription(ApiMatchaTransfer.Dispute dispute) {
        switch (WhenMappings.$EnumSwitchMapping$1[dispute.getDispute_state().ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_detail_under_investigation, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_detail_temp_credit, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_detail_credited, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_detail_not_credited, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_dispute_detail_canceled, InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) dispute.getUpdated_at()));
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final int getAccountLabel(MatchaTransferRole matchaTransferRole) {
        int i = WhenMappings.$EnumSwitchMapping$2[matchaTransferRole.ordinal()];
        if (i == 1) {
            return C11048R.string.general_label_from;
        }
        if (i == 2) {
            return C11048R.string.general_label_to;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Unexpected");
    }

    private final MatchaTransferDetailViewState.Loaded.StatusBanner getStatusBanner(MatchaTransferState matchaTransferState) {
        int i = WhenMappings.$EnumSwitchMapping$3[matchaTransferState.ordinal()];
        if (i == 1) {
            return new MatchaTransferDetailViewState.Loaded.StatusBanner(C21284R.string.matcha_transfer_status_banner_failed, true);
        }
        if (i == 2) {
            return new MatchaTransferDetailViewState.Loaded.StatusBanner(C21284R.string.matcha_transfer_status_banner_canceled, true);
        }
        if (i != 3) {
            return null;
        }
        return new MatchaTransferDetailViewState.Loaded.StatusBanner(C21284R.string.matcha_transfer_status_banner_expired, false);
    }

    private final StringResource getDisplayValue(MatchaTransferState matchaTransferState) {
        switch (WhenMappings.$EnumSwitchMapping$3[matchaTransferState.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_failed, new Object[0]);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return StringResource.INSTANCE.invoke(matchaTransferState.getServerValue());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
