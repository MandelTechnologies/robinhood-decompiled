package com.robinhood.android.isa.isatransferdetail;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.isa.isatransferdetail.models.BannerTextComponent;
import com.robinhood.android.isa.isatransferdetail.models.DetailRow;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailDataState;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailViewState;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDisplayState;
import com.robinhood.android.isa.isatransferdetail.models.SpacerHeight;
import com.robinhood.android.isa.isatransferdetail.models.ValueTextStyle;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaCashTransferDetails;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTransfer;
import com.robinhood.android.isa.models.isa.p163db.entity.TransactionState;
import com.robinhood.android.isa.models.isa.p163db.entity.TransferFailureReason;
import com.robinhood.android.isa.models.isa.p163db.entity.TransferType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: IsaTransferDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001eJ-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u001eJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u001eJ'\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailDataState;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/isa/models/isa/db/entity/TransactionState;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDisplayState;", "toDisplayState", "(Lcom/robinhood/android/isa/models/isa/db/entity/TransactionState;)Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDisplayState;", "Lcom/robinhood/models/api/BrokerageAccountType;", "Lcom/robinhood/utils/resource/StringResource;", "toDisplayName", "(Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaCashTransferDetails;", "getProviderInfoToDisplay", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaCashTransferDetails;)Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;", "transfer", ErrorBundle.DETAIL_ENTRY, "", "forceMoneyValue", "getAmountToDisplay", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;Lcom/robinhood/android/isa/models/isa/db/entity/IsaCashTransferDetails;Z)Lcom/robinhood/utils/resource/StringResource;", "sinkAccountType", "", "Lcom/robinhood/android/isa/isatransferdetail/models/DetailRow;", "buildIsaCashTransferPendingRows", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;Lcom/robinhood/android/isa/models/isa/db/entity/IsaCashTransferDetails;Lcom/robinhood/models/api/BrokerageAccountType;)Ljava/util/List;", "buildIsaCashTransferCompleteRows", "buildIsaCashTransferFailedRows", "buildIsaCashTransferPendingCancelRows", "buildIsaCashTransferCancelledRows", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState$Loaded;", "buildIsaCashTransfer", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;Lcom/robinhood/android/isa/models/isa/db/entity/IsaCashTransferDetails;Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState$Loaded;", "dataState", "reduce", "(Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailDataState;)Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState;", "Lj$/time/Clock;", "feature-isa-transfer-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaTransferDetailStateProvider implements StateProvider<IsaTransferDetailDataState, IsaTransferDetailViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    /* compiled from: IsaTransferDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[TransactionState.values().length];
            try {
                iArr[TransactionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionState.PENDING_TRANSFER_INITIATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionState.TRANSFER_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransactionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransactionState.PENDING_REVERSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransactionState.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransactionState.PENDING_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransactionState.CANCEL_REQUESTED_UNCONFIRMED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferFailureReason.values().length];
            try {
                iArr3[TransferFailureReason.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[TransferFailureReason.WINDSOR_REJECTED_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[TransferFailureReason.THIRD_PARTY_REJECTED_TRANSFER_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[IsaTransferDisplayState.values().length];
            try {
                iArr4[IsaTransferDisplayState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[IsaTransferDisplayState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[IsaTransferDisplayState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[IsaTransferDisplayState.PENDING_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[IsaTransferDisplayState.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[TransferType.values().length];
            try {
                iArr5[TransferType.ISA_CASH_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public IsaTransferDetailStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    private final IsaTransferDisplayState toDisplayState(TransactionState transactionState) {
        switch (WhenMappings.$EnumSwitchMapping$0[transactionState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return IsaTransferDisplayState.PENDING;
            case 4:
                return IsaTransferDisplayState.COMPLETE;
            case 5:
            case 6:
                return IsaTransferDisplayState.FAILED;
            case 7:
                return IsaTransferDisplayState.CANCELLED;
            case 8:
            case 9:
                return IsaTransferDisplayState.PENDING_CANCEL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final StringResource toDisplayName(BrokerageAccountType brokerageAccountType) {
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C19934R.string.transfer_type_stocks_and_shares_isa, new Object[0]);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException(("BrokerageAccountType " + brokerageAccountType.name() + " is not supported").toString());
            case 8:
                throw new IllegalStateException("BrokerageAccountType is unknown");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final StringResource getProviderInfoToDisplay(IsaCashTransferDetails isaCashTransferDetails) {
        String providerAccountNumber = isaCashTransferDetails.getProviderAccountNumber();
        if (providerAccountNumber.length() >= 5) {
            providerAccountNumber = StringsKt.repeat("•", providerAccountNumber.length() - 4) + StringsKt.takeLast(providerAccountNumber, 4);
        }
        return StringResource.INSTANCE.invoke(isaCashTransferDetails.getProviderName() + PlaceholderUtils.XXShortPlaceholderText + providerAccountNumber);
    }

    static /* synthetic */ StringResource getAmountToDisplay$default(IsaTransferDetailStateProvider isaTransferDetailStateProvider, IsaTransfer isaTransfer, IsaCashTransferDetails isaCashTransferDetails, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return isaTransferDetailStateProvider.getAmountToDisplay(isaTransfer, isaCashTransferDetails, z);
    }

    private final StringResource getAmountToDisplay(IsaTransfer transfer, IsaCashTransferDetails details, boolean forceMoneyValue) {
        if (details.isFullTransfer() && !forceMoneyValue) {
            return StringResource.INSTANCE.invoke(C19934R.string.transfer_amount_full_value, new Object[0]);
        }
        Money amount = transfer.getAmount();
        if (amount == null || !amount.isPositive()) {
            amount = new Money(Currencies.GBP, details.getRequestedTransferAmountGbp());
        }
        return StringResource.INSTANCE.invoke(Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    private final List<DetailRow> buildIsaCashTransferPendingRows(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        List listListOf;
        ArrayList arrayList = new ArrayList();
        if (ChronoUnit.DAYS.between(transfer.getCreatedAt(), Instant.now(this.clock)) < 30) {
            StringResource.Companion companion = StringResource.INSTANCE;
            listListOf = CollectionsKt.listOf((Object[]) new BannerTextComponent[]{new BannerTextComponent(companion.invoke(C19934R.string.info_banner_pending_bold_text, new Object[0]), true), new BannerTextComponent(companion.invoke(C19934R.string.info_banner_pending_regular_text, new Object[0]), false)});
        } else {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            listListOf = CollectionsKt.listOf((Object[]) new BannerTextComponent[]{new BannerTextComponent(companion2.invoke(C19934R.string.info_banner_pending_long_bold_text, new Object[0]), true), new BannerTextComponent(companion2.invoke(C19934R.string.info_banner_pending_long_regular_text, new Object[0]), false)});
        }
        arrayList.add(new DetailRow.Banner(listListOf));
        arrayList.add(new DetailRow.Spacer(SpacerHeight.DEFAULT));
        Timeline.Status status = Timeline.Status.COMPLETE;
        Timeline.Position position = Timeline.Position.TOP;
        StringResource.Companion companion3 = StringResource.INSTANCE;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.TimelineRow[]{new DetailRow.TimelineRow(status, position, companion3.invoke(C19934R.string.timeline_request_label, new Object[0]), companion3.invoke(C19934R.string.timeline_request_value, new Object[0])), new DetailRow.TimelineRow(Timeline.Status.ONGOING, Timeline.Position.BETWEEN, companion3.invoke(C19934R.string.timeline_review_label, new Object[0]), companion3.invoke(C19934R.string.label_in_progress, new Object[0])), new DetailRow.TimelineRow(Timeline.Status.INCOMPLETE, Timeline.Position.BOTTOM, companion3.invoke(C19934R.string.timeline_complete_label, new Object[0]), companion3.invoke(C11048R.string.general_label_pending, new Object[0]))}));
        SpacerHeight spacerHeight = SpacerHeight.MEDIUM;
        arrayList.add(new DetailRow.Spacer(spacerHeight));
        arrayList.add(DetailRow.Divider.INSTANCE);
        arrayList.add(new DetailRow.Spacer(spacerHeight));
        StringResource stringResourceInvoke = companion3.invoke(C11048R.string.general_label_status, new Object[0]);
        StringResource stringResourceInvoke2 = companion3.invoke(C19934R.string.label_in_progress, new Object[0]);
        ValueTextStyle valueTextStyle = ValueTextStyle.DEFAULT;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.InfoRow[]{new DetailRow.InfoRow(stringResourceInvoke, stringResourceInvoke2, valueTextStyle), new DetailRow.InfoRow(companion3.invoke(C19934R.string.label_requested, new Object[0]), companion3.invoke(LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(transfer.getCreatedAt(), null, 1, null))), valueTextStyle), new DetailRow.InfoRow(companion3.invoke(C11048R.string.general_label_from, new Object[0]), getProviderInfoToDisplay(details), valueTextStyle), new DetailRow.InfoRow(companion3.invoke(C11048R.string.general_label_to, new Object[0]), toDisplayName(sinkAccountType), valueTextStyle), new DetailRow.InfoRow(companion3.invoke(C19934R.string.label_transfer_amount, new Object[0]), getAmountToDisplay$default(this, transfer, details, false, 4, null), valueTextStyle)}));
        arrayList.add(new DetailRow.Spacer(spacerHeight));
        arrayList.add(DetailRow.CancelCta.INSTANCE);
        return arrayList;
    }

    private final List<DetailRow> buildIsaCashTransferCompleteRows(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        ArrayList arrayList = new ArrayList();
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C11048R.string.general_label_status, new Object[0]);
        StringResource stringResourceInvoke2 = companion.invoke(C19934R.string.label_completed, new Object[0]);
        ValueTextStyle valueTextStyle = ValueTextStyle.DEFAULT;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.InfoRow[]{new DetailRow.InfoRow(stringResourceInvoke, stringResourceInvoke2, valueTextStyle), new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_from, new Object[0]), getProviderInfoToDisplay(details), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), toDisplayName(sinkAccountType), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C19934R.string.label_transfer_amount, new Object[0]), getAmountToDisplay(transfer, details, true), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C19934R.string.label_completion_date, new Object[0]), companion.invoke(LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(transfer.getUpdatedAt(), null, 1, null))), valueTextStyle)}));
        return arrayList;
    }

    private final List<DetailRow> buildIsaCashTransferFailedRows(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        BannerTextComponent bannerTextComponent;
        ArrayList arrayList = new ArrayList();
        StringResource.Companion companion = StringResource.INSTANCE;
        BannerTextComponent bannerTextComponent2 = new BannerTextComponent(companion.invoke(C19934R.string.info_banner_failed_generic_bold_text, new Object[0]), true);
        int i = WhenMappings.$EnumSwitchMapping$2[transfer.getTransferFailureReason().ordinal()];
        if (i == 1 || i == 2) {
            bannerTextComponent = new BannerTextComponent(companion.invoke(C19934R.string.info_banner_failed_generic_regular_text, new Object[0]), false);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bannerTextComponent = new BannerTextComponent(companion.invoke(C19934R.string.info_banner_provider_rejected_regular_text, new Object[0]), false);
        }
        arrayList.add(new DetailRow.Banner(CollectionsKt.listOf((Object[]) new BannerTextComponent[]{bannerTextComponent2, bannerTextComponent})));
        arrayList.add(new DetailRow.Spacer(SpacerHeight.DEFAULT));
        DetailRow.InfoRow infoRow = new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_status, new Object[0]), companion.invoke(C11048R.string.general_label_failed, new Object[0]), ValueTextStyle.BOLD_NEGATIVE);
        StringResource stringResourceInvoke = companion.invoke(C11048R.string.general_label_from, new Object[0]);
        StringResource providerInfoToDisplay = getProviderInfoToDisplay(details);
        ValueTextStyle valueTextStyle = ValueTextStyle.DEFAULT;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.InfoRow[]{infoRow, new DetailRow.InfoRow(stringResourceInvoke, providerInfoToDisplay, valueTextStyle), new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), toDisplayName(sinkAccountType), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C19934R.string.label_transfer_amount, new Object[0]), getAmountToDisplay$default(this, transfer, details, false, 4, null), valueTextStyle)}));
        return arrayList;
    }

    private final List<DetailRow> buildIsaCashTransferPendingCancelRows(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        ArrayList arrayList = new ArrayList();
        StringResource.Companion companion = StringResource.INSTANCE;
        arrayList.add(new DetailRow.Banner(CollectionsKt.listOf((Object[]) new BannerTextComponent[]{new BannerTextComponent(companion.invoke(C19934R.string.info_banner_pending_cancel_bold_text, new Object[0]), true), new BannerTextComponent(companion.invoke(C19934R.string.info_banner_pending_cancel_regular_text, new Object[0]), false)})));
        arrayList.add(new DetailRow.Spacer(SpacerHeight.DEFAULT));
        DetailRow.InfoRow infoRow = new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_status, new Object[0]), companion.invoke(C19934R.string.label_pending_cancel, new Object[0]), ValueTextStyle.BOLD_FOREGROUND2);
        StringResource stringResourceInvoke = companion.invoke(C11048R.string.general_label_from, new Object[0]);
        StringResource providerInfoToDisplay = getProviderInfoToDisplay(details);
        ValueTextStyle valueTextStyle = ValueTextStyle.DEFAULT;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.InfoRow[]{infoRow, new DetailRow.InfoRow(stringResourceInvoke, providerInfoToDisplay, valueTextStyle), new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), toDisplayName(sinkAccountType), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C19934R.string.label_transfer_amount, new Object[0]), getAmountToDisplay$default(this, transfer, details, false, 4, null), valueTextStyle)}));
        return arrayList;
    }

    private final List<DetailRow> buildIsaCashTransferCancelledRows(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        ArrayList arrayList = new ArrayList();
        StringResource.Companion companion = StringResource.INSTANCE;
        arrayList.add(new DetailRow.Banner(CollectionsKt.listOf((Object[]) new BannerTextComponent[]{new BannerTextComponent(companion.invoke(C19934R.string.info_banner_cancelled_bold_text, new Object[0]), true), new BannerTextComponent(companion.invoke(C19934R.string.info_banner_cancelled_regular_text, new Object[0]), false)})));
        arrayList.add(new DetailRow.Spacer(SpacerHeight.DEFAULT));
        DetailRow.InfoRow infoRow = new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_status, new Object[0]), companion.invoke(C19934R.string.label_cancelled, new Object[0]), ValueTextStyle.BOLD_FOREGROUND2);
        StringResource stringResourceInvoke = companion.invoke(C11048R.string.general_label_from, new Object[0]);
        StringResource providerInfoToDisplay = getProviderInfoToDisplay(details);
        ValueTextStyle valueTextStyle = ValueTextStyle.DEFAULT;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new DetailRow.InfoRow[]{infoRow, new DetailRow.InfoRow(stringResourceInvoke, providerInfoToDisplay, valueTextStyle), new DetailRow.InfoRow(companion.invoke(C11048R.string.general_label_to, new Object[0]), toDisplayName(sinkAccountType), valueTextStyle), new DetailRow.InfoRow(companion.invoke(C19934R.string.label_transfer_amount, new Object[0]), getAmountToDisplay$default(this, transfer, details, false, 4, null), valueTextStyle)}));
        return arrayList;
    }

    private final IsaTransferDetailViewState.Loaded buildIsaCashTransfer(IsaTransfer transfer, IsaCashTransferDetails details, BrokerageAccountType sinkAccountType) {
        List<DetailRow> listBuildIsaCashTransferPendingRows;
        BentoButtons.Type type2;
        ArrayList arrayList = new ArrayList();
        StringResource.Companion companion = StringResource.INSTANCE;
        arrayList.add(new DetailRow.Title(companion.invoke(C19934R.string.cash_transfer_title, new Object[0])));
        arrayList.add(new DetailRow.Subtitle(companion.invoke(C19934R.string.cash_transfer_subtitle, details.getProviderName())));
        arrayList.add(new DetailRow.Spacer(SpacerHeight.MEDIUM));
        IsaTransferDisplayState displayState = toDisplayState(transfer.getState());
        int[] iArr = WhenMappings.$EnumSwitchMapping$3;
        int i = iArr[displayState.ordinal()];
        if (i == 1) {
            listBuildIsaCashTransferPendingRows = buildIsaCashTransferPendingRows(transfer, details, sinkAccountType);
        } else if (i == 2) {
            listBuildIsaCashTransferPendingRows = buildIsaCashTransferCompleteRows(transfer, details, sinkAccountType);
        } else if (i == 3) {
            listBuildIsaCashTransferPendingRows = buildIsaCashTransferFailedRows(transfer, details, sinkAccountType);
        } else if (i == 4) {
            listBuildIsaCashTransferPendingRows = buildIsaCashTransferPendingCancelRows(transfer, details, sinkAccountType);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            listBuildIsaCashTransferPendingRows = buildIsaCashTransferCancelledRows(transfer, details, sinkAccountType);
        }
        arrayList.addAll(listBuildIsaCashTransferPendingRows);
        int i2 = iArr[toDisplayState(transfer.getState()).ordinal()];
        if (i2 == 1 || i2 == 2) {
            type2 = BentoButtons.Type.Secondary;
        } else if (i2 == 3) {
            int i3 = WhenMappings.$EnumSwitchMapping$2[transfer.getTransferFailureReason().ordinal()];
            if (i3 == 1 || i3 == 2) {
                type2 = BentoButtons.Type.Primary;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                type2 = null;
            }
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            type2 = BentoButtons.Type.Secondary;
        }
        return new IsaTransferDetailViewState.Loaded(arrayList, type2);
    }

    @Override // com.robinhood.android.udf.StateProvider
    public IsaTransferDetailViewState reduce(IsaTransferDetailDataState dataState) {
        BrokerageAccountType sinkAccountType;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IsaTransfer transfer = dataState.getTransfer();
        if (transfer != null && (sinkAccountType = dataState.getSinkAccountType()) != null) {
            if (WhenMappings.$EnumSwitchMapping$4[transfer.getTransferType().ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            IsaCashTransferDetails isaCashTransferDetails = transfer.getIsaCashTransferDetails();
            if (isaCashTransferDetails != null) {
                return buildIsaCashTransfer(transfer, isaCashTransferDetails, sinkAccountType);
            }
            throw new IllegalStateException("TransferType is ISA_CASH_TRANSFER but isaCashTransferDetails is null");
        }
        return IsaTransferDetailViewState.Loading.INSTANCE;
    }
}
