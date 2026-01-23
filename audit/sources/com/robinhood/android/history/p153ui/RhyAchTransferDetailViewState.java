package com.robinhood.android.history.p153ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.history.p153ui.transfer.OaExpandedToolbarSubtitleText;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfers6;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyAchTransferDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0017\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003Js\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0001J\u0013\u0010G\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020,HÖ\u0001J\t\u0010J\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010%\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010'\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0013\u0010)\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u001a\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0017R\u0011\u00101\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0017R\u0013\u00102\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0017R\u001a\u00109\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b:\u0010.R\u0016\u0010;\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0016\u0010=\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\"¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailViewState;", "", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "transferDetails", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "iraInfoRows", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isCancelRequestInFlight", "", "cancelSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "", "cancelErrorEvent", "", "<init>", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;Lcom/robinhood/models/db/AchRelationship;Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getIraInfoRows", "()Ljava/util/List;", "()Z", "getCancelSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getCancelErrorEvent", "titleText", "", "getTitleText", "()Ljava/lang/String;", "subtitleText", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "initiatedText", "getInitiatedText", "estimatedAvailabilityText", "getEstimatedAvailabilityText", "sourceText", "getSourceText", "destinationText", "getDestinationText", "statusResId", "", "getStatusResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isCancelButtonVisible", "isAnyFooterContentVisible", "acatMatchRemovalText", "getAcatMatchRemovalText", "goldDepositBoost", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "getGoldDepositBoost", "()Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "isGoldDepositBoostRowVisible", "goldDepositBoostIconRes", "getGoldDepositBoostIconRes", "originatingAccountText", "getOriginatingAccountText", "achRelationshipDisplayNameResource", "getAchRelationshipDisplayNameResource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class RhyAchTransferDetailViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final UiEvent<Throwable> cancelErrorEvent;
    private final UiEvent<Unit> cancelSuccessEvent;
    private final String estimatedAvailabilityText;
    private final GoldDepositBoostTransferDetail goldDepositBoost;
    private final Integer goldDepositBoostIconRes;
    private final String initiatedText;
    private final List<UIComponent<GenericAction>> iraInfoRows;
    private final boolean isAnyFooterContentVisible;
    private final boolean isCancelRequestInFlight;
    private final boolean isGoldDepositBoostRowVisible;
    private final Integer statusResId;
    private final PaymentTransfer transfer;
    private final ApiPaymentTransferDetails.ApiAchTransfer transferDetails;

    /* compiled from: RhyAchTransferDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            int[] iArr2 = new int[AccountType.values().length];
            try {
                iArr2[AccountType.RCT_FIRM_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AccountType.RHS_ROTH_IRA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountType.RHS_ROTH_IRA_INHERITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountType.RHS_TRADITIONAL_IRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccountType.RHS_TRADITIONAL_IRA_INHERITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AccountType.RHS_ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AccountType.RHS_FIRM_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AccountType.RHY_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AccountType.RHY_FIRM_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AccountType.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AccountType.RHCE_CUSTOMER_ACCOUNT.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AccountType.ACH_RELATIONSHIP.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AccountType.DEBIT_CARD_INSTRUMENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccountType.UK_BANK_ACCOUNT.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AccountType.EXTERNAL.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RhyAchTransferDetailViewState() {
        this(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component1, reason: from getter */
    private final PaymentTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component2, reason: from getter */
    private final ApiPaymentTransferDetails.ApiAchTransfer getTransferDetails() {
        return this.transferDetails;
    }

    /* renamed from: component3, reason: from getter */
    private final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public static /* synthetic */ RhyAchTransferDetailViewState copy$default(RhyAchTransferDetailViewState rhyAchTransferDetailViewState, PaymentTransfer paymentTransfer, ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer, AchRelationship achRelationship, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentTransfer = rhyAchTransferDetailViewState.transfer;
        }
        if ((i & 2) != 0) {
            apiAchTransfer = rhyAchTransferDetailViewState.transferDetails;
        }
        if ((i & 4) != 0) {
            achRelationship = rhyAchTransferDetailViewState.achRelationship;
        }
        if ((i & 8) != 0) {
            list = rhyAchTransferDetailViewState.iraInfoRows;
        }
        if ((i & 16) != 0) {
            z = rhyAchTransferDetailViewState.isCancelRequestInFlight;
        }
        if ((i & 32) != 0) {
            uiEvent = rhyAchTransferDetailViewState.cancelSuccessEvent;
        }
        if ((i & 64) != 0) {
            uiEvent2 = rhyAchTransferDetailViewState.cancelErrorEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        boolean z2 = z;
        AchRelationship achRelationship2 = achRelationship;
        return rhyAchTransferDetailViewState.copy(paymentTransfer, apiAchTransfer, achRelationship2, list, z2, uiEvent3, uiEvent4);
    }

    public final List<UIComponent<GenericAction>> component4() {
        return this.iraInfoRows;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final UiEvent<Unit> component6() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Throwable> component7() {
        return this.cancelErrorEvent;
    }

    public final RhyAchTransferDetailViewState copy(PaymentTransfer transfer, ApiPaymentTransferDetails.ApiAchTransfer transferDetails, AchRelationship achRelationship, List<? extends UIComponent<? extends GenericAction>> iraInfoRows, boolean isCancelRequestInFlight, UiEvent<Unit> cancelSuccessEvent, UiEvent<Throwable> cancelErrorEvent) {
        return new RhyAchTransferDetailViewState(transfer, transferDetails, achRelationship, iraInfoRows, isCancelRequestInFlight, cancelSuccessEvent, cancelErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyAchTransferDetailViewState)) {
            return false;
        }
        RhyAchTransferDetailViewState rhyAchTransferDetailViewState = (RhyAchTransferDetailViewState) other;
        return Intrinsics.areEqual(this.transfer, rhyAchTransferDetailViewState.transfer) && Intrinsics.areEqual(this.transferDetails, rhyAchTransferDetailViewState.transferDetails) && Intrinsics.areEqual(this.achRelationship, rhyAchTransferDetailViewState.achRelationship) && Intrinsics.areEqual(this.iraInfoRows, rhyAchTransferDetailViewState.iraInfoRows) && this.isCancelRequestInFlight == rhyAchTransferDetailViewState.isCancelRequestInFlight && Intrinsics.areEqual(this.cancelSuccessEvent, rhyAchTransferDetailViewState.cancelSuccessEvent) && Intrinsics.areEqual(this.cancelErrorEvent, rhyAchTransferDetailViewState.cancelErrorEvent);
    }

    public int hashCode() {
        PaymentTransfer paymentTransfer = this.transfer;
        int iHashCode = (paymentTransfer == null ? 0 : paymentTransfer.hashCode()) * 31;
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = this.transferDetails;
        int iHashCode2 = (iHashCode + (apiAchTransfer == null ? 0 : apiAchTransfer.hashCode())) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode3 = (iHashCode2 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        List<UIComponent<GenericAction>> list = this.iraInfoRows;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isCancelRequestInFlight)) * 31;
        UiEvent<Unit> uiEvent = this.cancelSuccessEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.cancelErrorEvent;
        return iHashCode5 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "RhyAchTransferDetailViewState(transfer=" + this.transfer + ", transferDetails=" + this.transferDetails + ", achRelationship=" + this.achRelationship + ", iraInfoRows=" + this.iraInfoRows + ", isCancelRequestInFlight=" + this.isCancelRequestInFlight + ", cancelSuccessEvent=" + this.cancelSuccessEvent + ", cancelErrorEvent=" + this.cancelErrorEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RhyAchTransferDetailViewState(PaymentTransfer paymentTransfer, ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer, AchRelationship achRelationship, List<? extends UIComponent<? extends GenericAction>> list, boolean z, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2) {
        ServerToBentoAssetMapper2 iconAsset;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        TransferState state;
        this.transfer = paymentTransfer;
        this.transferDetails = apiAchTransfer;
        this.achRelationship = achRelationship;
        this.iraInfoRows = list;
        this.isCancelRequestInFlight = z;
        this.cancelSuccessEvent = uiEvent;
        this.cancelErrorEvent = uiEvent2;
        Integer numValueOf = null;
        this.initiatedText = apiAchTransfer != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(apiAchTransfer.getCreated_at()) : null;
        this.estimatedAvailabilityText = apiAchTransfer != null ? LocalDateFormatter.MEDIUM.format(apiAchTransfer.getExpected_landing_date()) : null;
        this.statusResId = (paymentTransfer == null || (state = paymentTransfer.getState()) == null) ? null : Integer.valueOf(UtilsKt.getLabelResId(state));
        this.isAnyFooterContentVisible = isCancelButtonVisible();
        GoldDepositBoostTransferDetail dbModel = (apiAchTransfer == null || (gold_deposit_boost = apiAchTransfer.getGold_deposit_boost()) == null) ? null : GoldDepositBoostTransferDetail2.toDbModel(gold_deposit_boost);
        this.goldDepositBoost = dbModel;
        this.isGoldDepositBoostRowVisible = ((dbModel != null ? dbModel.getAmountText() : null) == null || dbModel.getAmountTitle() == null) ? false : true;
        if (dbModel != null && (iconAsset = dbModel.getIconAsset()) != null) {
            numValueOf = Integer.valueOf(iconAsset.getResourceId());
        }
        this.goldDepositBoostIconRes = numValueOf;
    }

    public /* synthetic */ RhyAchTransferDetailViewState(PaymentTransfer paymentTransfer, ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer, AchRelationship achRelationship, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentTransfer, (i & 2) != 0 ? null : apiAchTransfer, (i & 4) != 0 ? null : achRelationship, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? null : uiEvent2);
    }

    public final List<UIComponent<GenericAction>> getIraInfoRows() {
        return this.iraInfoRows;
    }

    public final boolean isCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final UiEvent<Unit> getCancelSuccessEvent() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Throwable> getCancelErrorEvent() {
        return this.cancelErrorEvent;
    }

    public final String getTitleText() {
        Money.Adjustment adjustment;
        PaymentTransfer paymentTransfer = this.transfer;
        if (paymentTransfer == null || (adjustment = paymentTransfer.getAdjustment()) == null) {
            return null;
        }
        return Money.Adjustment.format$default(adjustment, false, null, 3, null);
    }

    public final StringResource getSubtitleText() {
        PaymentTransfer paymentTransfer = this.transfer;
        if (paymentTransfer != null) {
            return OaExpandedToolbarSubtitleText.oaExpandedToolbarSubtitleText(paymentTransfer, this.achRelationship, paymentTransfer.getIsOwner());
        }
        return null;
    }

    public final String getInitiatedText() {
        return this.initiatedText;
    }

    public final String getEstimatedAvailabilityText() {
        return this.estimatedAvailabilityText;
    }

    public final StringResource getSourceText() {
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = this.transferDetails;
        TransferDirection direction = apiAchTransfer != null ? apiAchTransfer.getDirection() : null;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return getAchRelationshipDisplayNameResource();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getOriginatingAccountText();
    }

    public final StringResource getDestinationText() {
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = this.transferDetails;
        TransferDirection direction = apiAchTransfer != null ? apiAchTransfer.getDirection() : null;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return getOriginatingAccountText();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getAchRelationshipDisplayNameResource();
    }

    public final Integer getStatusResId() {
        return this.statusResId;
    }

    public final boolean isCancelButtonVisible() {
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = this.transferDetails;
        return (apiAchTransfer != null ? apiAchTransfer.getCancel() : null) != null;
    }

    /* renamed from: isAnyFooterContentVisible, reason: from getter */
    public final boolean getIsAnyFooterContentVisible() {
        return this.isAnyFooterContentVisible;
    }

    public final StringResource getAcatMatchRemovalText() {
        Money clawback_amount;
        PaymentTransfer paymentTransfer = this.transfer;
        ApiPaymentTransferDetails details = paymentTransfer != null ? paymentTransfer.getDetails() : null;
        ApiPaymentTransferDetails.ApiClawbackTransfer apiClawbackTransfer = details instanceof ApiPaymentTransferDetails.ApiClawbackTransfer ? (ApiPaymentTransferDetails.ApiClawbackTransfer) details : null;
        if (apiClawbackTransfer == null || (clawback_amount = apiClawbackTransfer.getClawback_amount()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }

    /* renamed from: isGoldDepositBoostRowVisible, reason: from getter */
    public final boolean getIsGoldDepositBoostRowVisible() {
        return this.isGoldDepositBoostRowVisible;
    }

    public final Integer getGoldDepositBoostIconRes() {
        return this.goldDepositBoostIconRes;
    }

    private final StringResource getOriginatingAccountText() {
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo;
        String accountNameTitle;
        StringResource stringResourceInvoke;
        PaymentTransfer paymentTransfer = this.transfer;
        StringResource stringResourceInvoke2 = null;
        AccountType originatingAccountType = paymentTransfer != null ? paymentTransfer.getOriginatingAccountType() : null;
        switch (originatingAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[originatingAccountType.ordinal()]) {
            case -1:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_credit_card, new Object[0]);
                break;
            case 2:
            case 3:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_ira_roth, new Object[0]);
                break;
            case 4:
            case 5:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_ira_traditional, new Object[0]);
                break;
            case 6:
            case 7:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_individual, new Object[0]);
                break;
            case 8:
            case 9:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C39006R.string.payment_transfer_account_type_rhy, new Object[0]);
                break;
            case 10:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_joint_tenancy_with_ros, new Object[0]);
                break;
            case 11:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.outgoing_wire_account, new Object[0]);
                break;
            case 12:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8179R.string.account_type_stocks_and_shares_isa, new Object[0]);
                break;
            case 13:
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C11048R.string.general_label_unknown, new Object[0]);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                throw new IllegalStateException(("Unsupported account type: " + originatingAccountType).toString());
        }
        PaymentTransfer paymentTransfer2 = this.transfer;
        return (paymentTransfer2 == null || (originatingTransferAccountInfo = paymentTransfer2.getOriginatingTransferAccountInfo()) == null || (accountNameTitle = originatingTransferAccountInfo.getAccountNameTitle()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(accountNameTitle)) == null) ? stringResourceInvoke2 : stringResourceInvoke;
    }

    private final StringResource getAchRelationshipDisplayNameResource() {
        PaymentTransfer paymentTransfer = this.transfer;
        if (paymentTransfer == null) {
            return null;
        }
        if (paymentTransfer.getIsOwner()) {
            AchRelationship achRelationship = this.achRelationship;
            if (achRelationship != null) {
                return AchRelationships.getAchRelationshipDisplayNameResource(achRelationship);
            }
            return null;
        }
        return PaymentTransfers6.getNonOwnerExternalAccountDisplayTitle(this.transfer);
    }
}
