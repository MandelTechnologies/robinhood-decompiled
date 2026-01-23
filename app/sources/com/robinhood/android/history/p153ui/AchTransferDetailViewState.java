package com.robinhood.android.history.p153ui;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.ach.format.AchTransfers;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.extensions.AdditionalInfoResBundles;
import com.robinhood.android.history.p153ui.transfer.OaExpandedToolbarSubtitleText;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.api.ApiGracePeriodContent;
import com.robinhood.transfers.api.ApiManagedAccountTransferDetails;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.transfers.models.p406db.AchTransfer2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AchTransferDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0002~\u007fB\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012 \b\u0002\u0010\f\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J \u0010a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u0001040cj\u0002`d0bH\u0007J\u0010\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020hJ\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010u\u001a\u00020\u000bHÂ\u0003J!\u0010v\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0083\u0001\u0010y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2 \b\u0002\u0010\f\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010z\u001a\u00020*2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010|\u001a\u00020<HÖ\u0001J\t\u0010}\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0015\u0010;\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0010\u0010@\u001a\u0004\u0018\u000108X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010A\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0013\u0010C\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0011\u0010E\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bF\u0010:R\u0013\u0010G\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0013\u0010I\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0013\u0010K\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0013\u0010M\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0013\u0010O\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0013\u0010Q\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\bR\u00106R\u000e\u0010S\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010T\u001a\u0004\u0018\u00010U¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0015\u0010X\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0002\u0010?\u001a\u0004\bY\u0010>R\u0013\u0010Z\u001a\u0004\u0018\u00010[¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010^\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b^\u00100R\u001a\u0010_\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b`\u0010>R\u0011\u0010i\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bi\u00100R\u0011\u0010j\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bj\u00100R\u0011\u0010k\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bl\u00100R\u0015\u0010m\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0002\u0010?\u001a\u0004\bn\u0010>R\u0015\u0010o\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0002\u0010?\u001a\u0004\bp\u0010>¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailViewState;", "", "account", "Lcom/robinhood/models/db/Account;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "paymentTransfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "uiInvestmentScheduleEvent", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "cancelTransferState", "Lcom/robinhood/android/history/ui/AchTransferDetailViewState$CancelTransferState;", "cancelTransferResponse", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "", "Lcom/robinhood/android/history/ui/ShowCancelledSnackbarEvent;", "", "managedByPaymentHubEvent", "Ljava/util/UUID;", "managedAccountTransferDetails", "Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;Lcom/robinhood/android/history/ui/AchTransferDetailViewState$CancelTransferState;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getPaymentTransfer", "()Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getUiInvestmentScheduleEvent", "()Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "getCancelTransferResponse", "()Lcom/robinhood/udf/UiEvent;", "getManagedByPaymentHubEvent", "getManagedAccountTransferDetails", "()Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "isCancellable", "", "isTransferPending", "isTransferInTransit", "isTransferInReview", "transferRequiresConfirmation", "getTransferRequiresConfirmation", "()Z", "showLoadingView", "getShowLoadingView", "expandedToolbarTitleText", "", "getExpandedToolbarTitleText", "()Ljava/lang/String;", "expandedToolbarSubtitleText", "Lcom/robinhood/utils/resource/StringResource;", "getExpandedToolbarSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "statusRes", "", "getStatusRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "originatingAccountDisplayText", "sourceAccountText", "getSourceAccountText", "destAccountText", "getDestAccountText", "availableNowSectionLabelText", "getAvailableNowSectionLabelText", "availableNowSectionVisibilityValueText", "getAvailableNowSectionVisibilityValueText", "initiatedSectionValueText", "getInitiatedSectionValueText", "lastUpdatedSectionValueText", "getLastUpdatedSectionValueText", "bonusRemovalValueText", "getBonusRemovalValueText", "bonusRemovalExplanationText", "getBonusRemovalExplanationText", "estAvailabilitySectionVisibilityValueText", "getEstAvailabilitySectionVisibilityValueText", "showInstantSummary", "gracePeriodContent", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "getGracePeriodContent", "()Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "errorSectionVisibilityTextRes", "getErrorSectionVisibilityTextRes", "goldDepositBoost", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "getGoldDepositBoost", "()Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "isGoldDepositBoostSectionVisible", "goldDepositBoostIconRes", "getGoldDepositBoostIconRes", "getTransferAdditionalInfo", "", "Lkotlin/Pair;", "Lcom/robinhood/android/history/ui/model/ResBundle;", "getTransferAdditionalInfoString", "", "resources", "Landroid/content/res/Resources;", "isCancelButtonVisible", "isAnyFooterContentVisible", "showStatusInfoBanner", "getShowStatusInfoBanner", "infoBannerTextRes", "getInfoBannerTextRes", "infoBannerIconRes", "getInfoBannerIconRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "CancelTransferState", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class AchTransferDetailViewState {
    private final Account account;
    private final AchRelationship achRelationship;
    private final AchTransfer achTransfer;
    private final String availableNowSectionVisibilityValueText;
    private final String bonusRemovalExplanationText;
    private final String bonusRemovalValueText;
    private final UiEvent<Either<Unit, Throwable>> cancelTransferResponse;
    private final CancelTransferState cancelTransferState;
    private final StringResource destAccountText;
    private final Integer errorSectionVisibilityTextRes;
    private final GoldDepositBoostTransferDetail goldDepositBoost;
    private final Integer goldDepositBoostIconRes;
    private final ApiGracePeriodContent gracePeriodContent;
    private final Integer infoBannerIconRes;
    private final Integer infoBannerTextRes;
    private final String initiatedSectionValueText;
    private final boolean isAnyFooterContentVisible;
    private final boolean isCancelButtonVisible;
    private final boolean isCancellable;
    private final boolean isGoldDepositBoostSectionVisible;
    private final boolean isTransferInReview;
    private final boolean isTransferInTransit;
    private final boolean isTransferPending;
    private final String lastUpdatedSectionValueText;
    private final ApiManagedAccountTransferDetails managedAccountTransferDetails;
    private final UiEvent<UUID> managedByPaymentHubEvent;
    private final StringResource originatingAccountDisplayText;
    private final PaymentTransfer paymentTransfer;
    private final boolean showInstantSummary;
    private final boolean showLoadingView;
    private final boolean showStatusInfoBanner;
    private final StringResource sourceAccountText;
    private final Integer statusRes;
    private final boolean transferRequiresConfirmation;
    private final UiInvestmentScheduleEvent uiInvestmentScheduleEvent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Tuples2<Integer, String> PENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE = new Tuples2<>(Integer.valueOf(C18359R.string.ach_transfer_detail_pending_cancellable_deposit_info), null);
    private static final Tuples2<Integer, String> PENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE = new Tuples2<>(Integer.valueOf(C18359R.string.ach_transfer_detail_deposit_pending_not_cancellable_deposit_info), null);

    /* compiled from: AchTransferDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[AchTransferState.values().length];
            try {
                iArr2[AchTransferState.REVERSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AchTransferState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AchTransferRhsState.values().length];
            try {
                iArr3[AchTransferRhsState.REVIEWING_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AchTransferRhsState.PENDING_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AchTransferRhsState.REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AchTransferRhsState.NEEDS_APPROVAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AchTransferRhsState.APPROVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AchTransferRhsState.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AchTransferRhsState.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[AchTransferRhsState.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[AchTransferRhsState.SUBMITTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[AchTransferRhsState.REVERSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[AchTransferRhsState.COMPLETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[AchTransferRhsState.NEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AchTransferRhsState.PENDING_CANCEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[AchTransferRhsState.REQUESTING.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[AchTransferRhsState.ASKING_APPROVAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[AchTransferRhsState.ABORTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public AchTransferDetailViewState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component5, reason: from getter */
    private final CancelTransferState getCancelTransferState() {
        return this.cancelTransferState;
    }

    public static /* synthetic */ AchTransferDetailViewState copy$default(AchTransferDetailViewState achTransferDetailViewState, Account account, AchRelationship achRelationship, PaymentTransfer paymentTransfer, UiInvestmentScheduleEvent uiInvestmentScheduleEvent, CancelTransferState cancelTransferState, UiEvent uiEvent, UiEvent uiEvent2, ApiManagedAccountTransferDetails apiManagedAccountTransferDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            account = achTransferDetailViewState.account;
        }
        if ((i & 2) != 0) {
            achRelationship = achTransferDetailViewState.achRelationship;
        }
        if ((i & 4) != 0) {
            paymentTransfer = achTransferDetailViewState.paymentTransfer;
        }
        if ((i & 8) != 0) {
            uiInvestmentScheduleEvent = achTransferDetailViewState.uiInvestmentScheduleEvent;
        }
        if ((i & 16) != 0) {
            cancelTransferState = achTransferDetailViewState.cancelTransferState;
        }
        if ((i & 32) != 0) {
            uiEvent = achTransferDetailViewState.cancelTransferResponse;
        }
        if ((i & 64) != 0) {
            uiEvent2 = achTransferDetailViewState.managedByPaymentHubEvent;
        }
        if ((i & 128) != 0) {
            apiManagedAccountTransferDetails = achTransferDetailViewState.managedAccountTransferDetails;
        }
        UiEvent uiEvent3 = uiEvent2;
        ApiManagedAccountTransferDetails apiManagedAccountTransferDetails2 = apiManagedAccountTransferDetails;
        CancelTransferState cancelTransferState2 = cancelTransferState;
        UiEvent uiEvent4 = uiEvent;
        return achTransferDetailViewState.copy(account, achRelationship, paymentTransfer, uiInvestmentScheduleEvent, cancelTransferState2, uiEvent4, uiEvent3, apiManagedAccountTransferDetails2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentTransfer getPaymentTransfer() {
        return this.paymentTransfer;
    }

    /* renamed from: component4, reason: from getter */
    public final UiInvestmentScheduleEvent getUiInvestmentScheduleEvent() {
        return this.uiInvestmentScheduleEvent;
    }

    public final UiEvent<Either<Unit, Throwable>> component6() {
        return this.cancelTransferResponse;
    }

    public final UiEvent<UUID> component7() {
        return this.managedByPaymentHubEvent;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiManagedAccountTransferDetails getManagedAccountTransferDetails() {
        return this.managedAccountTransferDetails;
    }

    public final AchTransferDetailViewState copy(Account account, AchRelationship achRelationship, PaymentTransfer paymentTransfer, UiInvestmentScheduleEvent uiInvestmentScheduleEvent, CancelTransferState cancelTransferState, UiEvent<Either<Unit, Throwable>> cancelTransferResponse, UiEvent<UUID> managedByPaymentHubEvent, ApiManagedAccountTransferDetails managedAccountTransferDetails) {
        Intrinsics.checkNotNullParameter(cancelTransferState, "cancelTransferState");
        return new AchTransferDetailViewState(account, achRelationship, paymentTransfer, uiInvestmentScheduleEvent, cancelTransferState, cancelTransferResponse, managedByPaymentHubEvent, managedAccountTransferDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchTransferDetailViewState)) {
            return false;
        }
        AchTransferDetailViewState achTransferDetailViewState = (AchTransferDetailViewState) other;
        return Intrinsics.areEqual(this.account, achTransferDetailViewState.account) && Intrinsics.areEqual(this.achRelationship, achTransferDetailViewState.achRelationship) && Intrinsics.areEqual(this.paymentTransfer, achTransferDetailViewState.paymentTransfer) && Intrinsics.areEqual(this.uiInvestmentScheduleEvent, achTransferDetailViewState.uiInvestmentScheduleEvent) && this.cancelTransferState == achTransferDetailViewState.cancelTransferState && Intrinsics.areEqual(this.cancelTransferResponse, achTransferDetailViewState.cancelTransferResponse) && Intrinsics.areEqual(this.managedByPaymentHubEvent, achTransferDetailViewState.managedByPaymentHubEvent) && Intrinsics.areEqual(this.managedAccountTransferDetails, achTransferDetailViewState.managedAccountTransferDetails);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        PaymentTransfer paymentTransfer = this.paymentTransfer;
        int iHashCode3 = (iHashCode2 + (paymentTransfer == null ? 0 : paymentTransfer.hashCode())) * 31;
        UiInvestmentScheduleEvent uiInvestmentScheduleEvent = this.uiInvestmentScheduleEvent;
        int iHashCode4 = (((iHashCode3 + (uiInvestmentScheduleEvent == null ? 0 : uiInvestmentScheduleEvent.hashCode())) * 31) + this.cancelTransferState.hashCode()) * 31;
        UiEvent<Either<Unit, Throwable>> uiEvent = this.cancelTransferResponse;
        int iHashCode5 = (iHashCode4 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<UUID> uiEvent2 = this.managedByPaymentHubEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        ApiManagedAccountTransferDetails apiManagedAccountTransferDetails = this.managedAccountTransferDetails;
        return iHashCode6 + (apiManagedAccountTransferDetails != null ? apiManagedAccountTransferDetails.hashCode() : 0);
    }

    public String toString() {
        return "AchTransferDetailViewState(account=" + this.account + ", achRelationship=" + this.achRelationship + ", paymentTransfer=" + this.paymentTransfer + ", uiInvestmentScheduleEvent=" + this.uiInvestmentScheduleEvent + ", cancelTransferState=" + this.cancelTransferState + ", cancelTransferResponse=" + this.cancelTransferResponse + ", managedByPaymentHubEvent=" + this.managedByPaymentHubEvent + ", managedAccountTransferDetails=" + this.managedAccountTransferDetails + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AchTransferDetailViewState(Account account, AchRelationship achRelationship, PaymentTransfer paymentTransfer, UiInvestmentScheduleEvent uiInvestmentScheduleEvent, CancelTransferState cancelTransferState, UiEvent<Either<Unit, Throwable>> uiEvent, UiEvent<UUID> uiEvent2, ApiManagedAccountTransferDetails apiManagedAccountTransferDetails) {
        boolean z;
        Integer numValueOf;
        StringResource stringResourceInvoke;
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo;
        String accountNameTitle;
        StringResource achRelationshipDisplayNameResource;
        String str;
        Integer numValueOf2;
        boolean z2;
        Integer numValueOf3;
        ServerToBentoAssetMapper2 iconAsset;
        Money clawbackAmount;
        Money earlyAccessAmount;
        AchTransferState state;
        Intrinsics.checkNotNullParameter(cancelTransferState, "cancelTransferState");
        this.account = account;
        this.achRelationship = achRelationship;
        this.paymentTransfer = paymentTransfer;
        this.uiInvestmentScheduleEvent = uiInvestmentScheduleEvent;
        this.cancelTransferState = cancelTransferState;
        this.cancelTransferResponse = uiEvent;
        this.managedByPaymentHubEvent = uiEvent2;
        this.managedAccountTransferDetails = apiManagedAccountTransferDetails;
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) (paymentTransfer != null ? paymentTransfer.getDetails() : null);
        AchTransfer dbModel = apiAchTransfer != null ? AchTransfer2.toDbModel(apiAchTransfer) : null;
        this.achTransfer = dbModel;
        boolean z3 = false;
        if (cancelTransferState.getCanUserCancelTransfer()) {
            if (dbModel != null ? dbModel.getCancellable() : false) {
                z = true;
            }
        } else {
            z = false;
        }
        this.isCancellable = z;
        this.isTransferPending = dbModel != null && dbModel.getIsPending();
        boolean z4 = (dbModel != null ? dbModel.getState() : null) == AchTransferState.PENDING && dbModel.getRhsState() == AchTransferRhsState.SUBMITTED;
        this.isTransferInTransit = z4;
        boolean z5 = (dbModel != null ? dbModel.getRhsState() : null) == AchTransferRhsState.REVIEWING_BALANCE;
        this.isTransferInReview = z5;
        boolean z6 = (dbModel != null ? dbModel.getRhsState() : null) == AchTransferRhsState.PENDING_CONFIRMATION;
        this.transferRequiresConfirmation = z6;
        this.showLoadingView = cancelTransferState.getIsCancelRequestInFlight();
        if (z4) {
            numValueOf = Integer.valueOf(C8331R.string.ach_transfer_state_in_transit);
        } else if (z5) {
            numValueOf = Integer.valueOf(C8331R.string.ach_transfer_state_in_review);
        } else if (z6) {
            numValueOf = Integer.valueOf(C8331R.string.ach_transfer_state_action_required);
        } else {
            numValueOf = dbModel != null ? Integer.valueOf(AchTransfers.getStateResId(dbModel)) : null;
        }
        this.statusRes = numValueOf;
        if (account == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke("");
        } else {
            String nickname = account.getNickname();
            if (nickname == null || nickname.length() == 0) {
                stringResourceInvoke = (paymentTransfer == null || (originatingTransferAccountInfo = paymentTransfer.getOriginatingTransferAccountInfo()) == null || (accountNameTitle = originatingTransferAccountInfo.getAccountNameTitle()) == null) ? null : StringResource.INSTANCE.invoke(accountNameTitle);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C39006R.string.payment_transfer_account_type_individual_with_nickname, account.getNickname());
            }
        }
        this.originatingAccountDisplayText = stringResourceInvoke;
        if (dbModel != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[dbModel.getDirection().ordinal()];
            if (i == 1) {
                achRelationshipDisplayNameResource = achRelationship != null ? AchRelationships.getAchRelationshipDisplayNameResource(achRelationship) : null;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                achRelationshipDisplayNameResource = stringResourceInvoke;
            }
        }
        this.sourceAccountText = achRelationshipDisplayNameResource;
        if (dbModel != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[dbModel.getDirection().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = achRelationship != null ? AchRelationships.getAchRelationshipDisplayNameResource(achRelationship) : null;
            }
        }
        this.destAccountText = stringResourceInvoke;
        if (((dbModel == null || (state = dbModel.getState()) == null) ? null : state.getIsSuccessful()) != null) {
            str = null;
        } else {
            if ((dbModel == null || (earlyAccessAmount = dbModel.getEarlyAccessAmount()) == null || !earlyAccessAmount.isPositive()) ? false : true) {
                str = Money.format$default(dbModel.getEarlyAccessAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
        }
        this.availableNowSectionVisibilityValueText = str;
        this.initiatedSectionValueText = dbModel != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(dbModel.getCreatedAt()) : null;
        this.lastUpdatedSectionValueText = dbModel != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(dbModel.getUpdatedAt()) : null;
        this.bonusRemovalValueText = (dbModel == null || (clawbackAmount = dbModel.getClawbackAmount()) == null) ? null : Money.format$default(clawbackAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.bonusRemovalExplanationText = dbModel != null ? dbModel.getClawbackAmountExplanation() : null;
        this.showInstantSummary = dbModel != null && dbModel.getDirection() == TransferDirection.DEPOSIT && dbModel.getIsPending();
        ApiGracePeriodContent gracePeriodContent = dbModel != null ? dbModel.getGracePeriodContent() : null;
        this.gracePeriodContent = gracePeriodContent;
        if (dbModel == null || uiInvestmentScheduleEvent == null || uiInvestmentScheduleEvent.getOrder() == null) {
            numValueOf2 = null;
        } else {
            Order order = uiInvestmentScheduleEvent.getOrder();
            Intrinsics.checkNotNull(order);
            int i3 = WhenMappings.$EnumSwitchMapping$1[dbModel.getState().ordinal()];
            if (i3 == 1) {
                if (order.isSuccess()) {
                    numValueOf2 = Integer.valueOf(C18359R.string.investment_schedule_event_ach_reversed_and_order_executed);
                } else if (order.isError()) {
                    numValueOf2 = Integer.valueOf(C18359R.string.investment_schedule_event_ach_order_canceled);
                }
            } else if (i3 == 2 && order.isError()) {
                numValueOf2 = Integer.valueOf(C18359R.string.investment_schedule_event_ach_order_canceled);
            }
        }
        this.errorSectionVisibilityTextRes = numValueOf2;
        GoldDepositBoostTransferDetail goldDepositBoost = dbModel != null ? dbModel.getGoldDepositBoost() : null;
        this.goldDepositBoost = goldDepositBoost;
        this.isGoldDepositBoostSectionVisible = ((goldDepositBoost != null ? goldDepositBoost.getAmountText() : null) == null || goldDepositBoost.getAmountTitle() == null) ? false : true;
        this.goldDepositBoostIconRes = (goldDepositBoost == null || (iconAsset = goldDepositBoost.getIconAsset()) == null) ? null : Integer.valueOf(iconAsset.getResourceId());
        this.isCancelButtonVisible = z;
        if (z) {
            z2 = true;
        } else {
            if ((gracePeriodContent != null ? gracePeriodContent.getCta() : null) == null) {
                z2 = false;
            }
        }
        this.isAnyFooterContentVisible = z2;
        AchTransferRhsState rhsState = dbModel != null ? dbModel.getRhsState() : null;
        switch (rhsState == null ? -1 : WhenMappings.$EnumSwitchMapping$2[rhsState.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                z3 = true;
                break;
        }
        this.showStatusInfoBanner = z3;
        AchTransferRhsState rhsState2 = dbModel != null ? dbModel.getRhsState() : null;
        switch (rhsState2 != null ? WhenMappings.$EnumSwitchMapping$2[rhsState2.ordinal()] : -1) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                numValueOf3 = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                numValueOf3 = Integer.valueOf(C18359R.string.ach_transfer_detail_in_review_summary);
                break;
            case 2:
                numValueOf3 = Integer.valueOf(C18359R.string.ach_transfer_detail_action_required_summary);
                break;
        }
        this.infoBannerTextRes = numValueOf3;
        this.infoBannerIconRes = z6 ? Integer.valueOf(C20690R.drawable.ic_rds_info_filled_24dp) : null;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final PaymentTransfer getPaymentTransfer() {
        return this.paymentTransfer;
    }

    public final UiInvestmentScheduleEvent getUiInvestmentScheduleEvent() {
        return this.uiInvestmentScheduleEvent;
    }

    public /* synthetic */ AchTransferDetailViewState(Account account, AchRelationship achRelationship, PaymentTransfer paymentTransfer, UiInvestmentScheduleEvent uiInvestmentScheduleEvent, CancelTransferState cancelTransferState, UiEvent uiEvent, UiEvent uiEvent2, ApiManagedAccountTransferDetails apiManagedAccountTransferDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : achRelationship, (i & 4) != 0 ? null : paymentTransfer, (i & 8) != 0 ? null : uiInvestmentScheduleEvent, (i & 16) != 0 ? CancelTransferState.NO_ACTION_TAKEN : cancelTransferState, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? null : uiEvent2, (i & 128) != 0 ? null : apiManagedAccountTransferDetails);
    }

    public final UiEvent<Either<Unit, Throwable>> getCancelTransferResponse() {
        return this.cancelTransferResponse;
    }

    public final UiEvent<UUID> getManagedByPaymentHubEvent() {
        return this.managedByPaymentHubEvent;
    }

    public final ApiManagedAccountTransferDetails getManagedAccountTransferDetails() {
        return this.managedAccountTransferDetails;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AchTransferDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailViewState$CancelTransferState;", "", "isCancelRequestInFlight", "", "canUserCancelTransfer", "<init>", "(Ljava/lang/String;IZZ)V", "()Z", "getCanUserCancelTransfer", "NO_ACTION_TAKEN", "CANCEL_REQUEST_IN_FLIGHT", "SUCCESSFULLY_CANCELLED", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CancelTransferState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CancelTransferState[] $VALUES;
        private final boolean canUserCancelTransfer;
        private final boolean isCancelRequestInFlight;
        public static final CancelTransferState NO_ACTION_TAKEN = new CancelTransferState("NO_ACTION_TAKEN", 0, false, true);
        public static final CancelTransferState CANCEL_REQUEST_IN_FLIGHT = new CancelTransferState("CANCEL_REQUEST_IN_FLIGHT", 1, true, false);
        public static final CancelTransferState SUCCESSFULLY_CANCELLED = new CancelTransferState("SUCCESSFULLY_CANCELLED", 2, false, false);

        private static final /* synthetic */ CancelTransferState[] $values() {
            return new CancelTransferState[]{NO_ACTION_TAKEN, CANCEL_REQUEST_IN_FLIGHT, SUCCESSFULLY_CANCELLED};
        }

        public static EnumEntries<CancelTransferState> getEntries() {
            return $ENTRIES;
        }

        private CancelTransferState(String str, int i, boolean z, boolean z2) {
            this.isCancelRequestInFlight = z;
            this.canUserCancelTransfer = z2;
        }

        /* renamed from: isCancelRequestInFlight, reason: from getter */
        public final boolean getIsCancelRequestInFlight() {
            return this.isCancelRequestInFlight;
        }

        public final boolean getCanUserCancelTransfer() {
            return this.canUserCancelTransfer;
        }

        static {
            CancelTransferState[] cancelTransferStateArr$values = $values();
            $VALUES = cancelTransferStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cancelTransferStateArr$values);
        }

        public static CancelTransferState valueOf(String str) {
            return (CancelTransferState) Enum.valueOf(CancelTransferState.class, str);
        }

        public static CancelTransferState[] values() {
            return (CancelTransferState[]) $VALUES.clone();
        }
    }

    public final AchTransfer getAchTransfer() {
        return this.achTransfer;
    }

    public final boolean getTransferRequiresConfirmation() {
        return this.transferRequiresConfirmation;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final String getExpandedToolbarTitleText() {
        Money.Adjustment adjustment;
        AchTransfer achTransfer = this.achTransfer;
        if (achTransfer == null || (adjustment = achTransfer.getAdjustment()) == null) {
            return null;
        }
        return Money.Adjustment.format$default(adjustment, false, null, 3, null);
    }

    public final StringResource getExpandedToolbarSubtitleText() {
        AchTransfer achTransfer = this.achTransfer;
        if (achTransfer != null) {
            return OaExpandedToolbarSubtitleText.oaExpandedToolbarSubtitleText$default(achTransfer, this.achRelationship, false, 2, (Object) null);
        }
        return null;
    }

    public final Integer getStatusRes() {
        return this.statusRes;
    }

    public final StringResource getSourceAccountText() {
        return this.sourceAccountText;
    }

    public final StringResource getDestAccountText() {
        return this.destAccountText;
    }

    public final StringResource getAvailableNowSectionLabelText() {
        Account account = this.account;
        if (account != null && account.isManaged()) {
            return StringResource.INSTANCE.invoke(C18359R.string.ach_transfer_detail_instant_header_managed, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C18359R.string.ach_transfer_detail_instant_header, new Object[0]);
    }

    public final String getAvailableNowSectionVisibilityValueText() {
        return this.availableNowSectionVisibilityValueText;
    }

    public final String getInitiatedSectionValueText() {
        return this.initiatedSectionValueText;
    }

    public final String getLastUpdatedSectionValueText() {
        return this.lastUpdatedSectionValueText;
    }

    public final String getBonusRemovalValueText() {
        return this.bonusRemovalValueText;
    }

    public final String getBonusRemovalExplanationText() {
        return this.bonusRemovalExplanationText;
    }

    public final String getEstAvailabilitySectionVisibilityValueText() {
        AchTransfer achTransfer;
        AchTransfer achTransfer2 = this.achTransfer;
        if ((achTransfer2 != null ? achTransfer2.getRhsState() : null) == AchTransferRhsState.PENDING_CONFIRMATION || (achTransfer = this.achTransfer) == null) {
            return null;
        }
        return LocalDateFormatter.MEDIUM.format(achTransfer.getExpectedLandingDate());
    }

    public final ApiGracePeriodContent getGracePeriodContent() {
        return this.gracePeriodContent;
    }

    public final Integer getErrorSectionVisibilityTextRes() {
        return this.errorSectionVisibilityTextRes;
    }

    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }

    /* renamed from: isGoldDepositBoostSectionVisible, reason: from getter */
    public final boolean getIsGoldDepositBoostSectionVisible() {
        return this.isGoldDepositBoostSectionVisible;
    }

    public final Integer getGoldDepositBoostIconRes() {
        return this.goldDepositBoostIconRes;
    }

    @Deprecated
    public final List<Tuples2<Integer, String>> getTransferAdditionalInfo() {
        Tuples2<Integer, String> tuples2;
        ArrayList arrayList = new ArrayList();
        AchTransfer achTransfer = this.achTransfer;
        if ((achTransfer != null ? achTransfer.getDirection() : null) == TransferDirection.DEPOSIT && this.isTransferPending) {
            if (this.isCancellable) {
                tuples2 = PENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE;
            } else {
                tuples2 = PENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE;
            }
            arrayList.add(tuples2);
        }
        if (this.showInstantSummary) {
            Integer numValueOf = Integer.valueOf(C18359R.string.ach_transfer_detail_pending_recurring_instant_summary);
            AchTransfer achTransfer2 = this.achTransfer;
            Intrinsics.checkNotNull(achTransfer2);
            arrayList.add(new Tuples2(numValueOf, Money.format$default(achTransfer2.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        }
        return arrayList;
    }

    public final CharSequence getTransferAdditionalInfoString(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        AchTransfer achTransfer = this.achTransfer;
        if (achTransfer == null && this.account == null) {
            return null;
        }
        if ((achTransfer != null ? achTransfer.getState() : null) == AchTransferState.REVERSED) {
            return AchTransferDetailStringsHelper.INSTANCE.getReversedTransferDetail(resources, this.achTransfer, this.account);
        }
        return AdditionalInfoResBundles.toString(getTransferAdditionalInfo(), resources);
    }

    /* renamed from: isCancelButtonVisible, reason: from getter */
    public final boolean getIsCancelButtonVisible() {
        return this.isCancelButtonVisible;
    }

    /* renamed from: isAnyFooterContentVisible, reason: from getter */
    public final boolean getIsAnyFooterContentVisible() {
        return this.isAnyFooterContentVisible;
    }

    public final boolean getShowStatusInfoBanner() {
        return this.showStatusInfoBanner;
    }

    public final Integer getInfoBannerTextRes() {
        return this.infoBannerTextRes;
    }

    public final Integer getInfoBannerIconRes() {
        return this.infoBannerIconRes;
    }

    /* compiled from: AchTransferDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailViewState$Companion;", "", "<init>", "()V", "PENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE", "Lkotlin/Pair;", "", "", "Lcom/robinhood/android/history/ui/model/ResBundle;", "getPENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE$feature_history_externalDebug", "()Lkotlin/Pair;", "PENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE", "getPENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE$feature_history_externalDebug", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getPENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE$feature_history_externalDebug */
        public final Tuples2<Integer, String> m2058x1587c2c3() {
            return AchTransferDetailViewState.PENDING_DEPOSIT_CANCELLABLE_RES_BUNDLE;
        }

        /* renamed from: getPENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE$feature_history_externalDebug */
        public final Tuples2<Integer, String> m2059x1230054f() {
            return AchTransferDetailViewState.PENDING_DEPOSIT_NOT_CANCELLABLE_RES_BUNDLE;
        }
    }
}
