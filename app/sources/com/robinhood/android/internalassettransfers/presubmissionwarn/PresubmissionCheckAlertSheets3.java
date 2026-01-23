package com.robinhood.android.internalassettransfers.presubmissionwarn;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.advisory.dashboard.ManagedDashboardKey;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionCheckAlertSheets2;
import com.robinhood.android.internalassettransfers.presubmissionwarn.models.WarningType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nimbus.service.p511v1.PreSubmissionChecksResponseDto;
import nimbus.service.p511v1.PreSubmissionWarningDto;
import nimbus.service.p511v1.PreSubmissionWarningTypeDto;

/* compiled from: PresubmissionCheckAlertSheets.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\"\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitAlertSheetFactory;", "", "<init>", "()V", "build", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "presubmissionChecksResponse", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/Account;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "factoryPreSubmitAlertSheet", "warning", "Lnimbus/service/v1/PreSubmissionWarningDto;", "createNegativeTransferPreSubmitAlertSheet", "isBlocking", "", "createInstantCheckPreSubmitAlertSheet", "createGenericPreSubmitAlertSheet", "createTransferLimitPreSubmitAlertSheet", "create2kMinimumEquityPreSubmitAlertSheet", "createMaintenanceExcessPreSubmitAlertSheet", "createPdt25kMinimumEquityPreSubmitAlertSheet", "createBorrowingLimitPreSubmitAlertSheet", "createAcatsClawbackPreSubmitAlertSheet", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$AcatsClawback;", "createAcatsClawbackPreSubmitAlertSheetExperiment", "createAcatsClawbackPreSubmitAlertSheetExperimentInsufficientFunds", "createGoldBoostPreSubmitAlertSheet", "Lnimbus/service/v1/PreSubmissionWarningTypeDto$WarningTypeDto$GoldBoostDetails;", "createStrategiesMinimumTransferAmountAlertSheet", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitAlertSheetFactory, reason: use source file name */
/* loaded from: classes10.dex */
public final class PresubmissionCheckAlertSheets3 {
    public static final int $stable = 0;

    public final List<PresubmissionChecksAlertSheet> build(PreSubmissionChecksResponseDto presubmissionChecksResponse, Account sourceAccount, Account sinkAccount) {
        Intrinsics.checkNotNullParameter(presubmissionChecksResponse, "presubmissionChecksResponse");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        List<PreSubmissionWarningDto> warnings = presubmissionChecksResponse.getWarnings();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            PresubmissionChecksAlertSheet presubmissionChecksAlertSheetFactoryPreSubmitAlertSheet = factoryPreSubmitAlertSheet((PreSubmissionWarningDto) it.next(), sourceAccount, sinkAccount);
            if (presubmissionChecksAlertSheetFactoryPreSubmitAlertSheet != null) {
                arrayList.add(presubmissionChecksAlertSheetFactoryPreSubmitAlertSheet);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitAlertSheetFactory$build$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer num;
                Integer num2 = 1;
                WarningType type2 = ((PresubmissionChecksAlertSheet) t).getType();
                if (type2 instanceof WarningType.TransferLimitCheckFailed) {
                    num = 0;
                } else if (type2 instanceof WarningType.AcatsClawback) {
                    num = 2;
                } else {
                    num = type2 instanceof WarningType.GoldBoostDetails ? 3 : num2;
                }
                WarningType type3 = ((PresubmissionChecksAlertSheet) t2).getType();
                if (type3 instanceof WarningType.TransferLimitCheckFailed) {
                    num2 = 0;
                } else if (type3 instanceof WarningType.AcatsClawback) {
                    num2 = 2;
                } else if (type3 instanceof WarningType.GoldBoostDetails) {
                    num2 = 3;
                }
                return ComparisonsKt.compareValues(num, num2);
            }
        });
    }

    private final PresubmissionChecksAlertSheet factoryPreSubmitAlertSheet(PreSubmissionWarningDto warning, Account sourceAccount, Account sinkAccount) {
        PreSubmissionWarningTypeDto warning_type = warning.getWarning_type();
        PreSubmissionWarningTypeDto.WarningTypeDto warning_type2 = warning_type != null ? warning_type.getWarning_type() : null;
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.AcatsClawback) {
            return createAcatsClawbackPreSubmitAlertSheet((PreSubmissionWarningTypeDto.WarningTypeDto.AcatsClawback) warning_type2, sourceAccount, sinkAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.BorrowingLimitCheckFailed) {
            return createBorrowingLimitPreSubmitAlertSheet(sinkAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.GoldBoostDetails) {
            return createGoldBoostPreSubmitAlertSheet((PreSubmissionWarningTypeDto.WarningTypeDto.GoldBoostDetails) warning_type2, sinkAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.InstantCheckFailed) {
            return createInstantCheckPreSubmitAlertSheet(warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.MaintenanceExcessCheckFailed) {
            return createMaintenanceExcessPreSubmitAlertSheet(sourceAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.NegativeTransferMarketValue) {
            return createNegativeTransferPreSubmitAlertSheet(warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.Pdt25kLimit) {
            return createPdt25kMinimumEquityPreSubmitAlertSheet(sourceAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.TransferLimitCheckFailed) {
            return createTransferLimitPreSubmitAlertSheet(warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.TwoKMinimumEquityCheckFailed) {
            return create2kMinimumEquityPreSubmitAlertSheet(sourceAccount, warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.UnsettledPositionsCheckFailed) {
            return createGenericPreSubmitAlertSheet(warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.EmptyTransfer) {
            return createGenericPreSubmitAlertSheet(warning.is_blocking());
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.TransferCountCheckFailed) {
            return null;
        }
        if (warning_type2 instanceof PreSubmissionWarningTypeDto.WarningTypeDto.ManagedAccountFundingTransferValueCheckFailed) {
            return createStrategiesMinimumTransferAmountAlertSheet(sourceAccount, sinkAccount);
        }
        if (warning_type2 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final PresubmissionChecksAlertSheet createNegativeTransferPreSubmitAlertSheet(boolean isBlocking) {
        WarningType.NegativeTransferMarketValue negativeTransferMarketValue = WarningType.NegativeTransferMarketValue.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.MEGAPHONE;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(negativeTransferMarketValue, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_negative_value_check_title, new Object[0]), companion.invoke(C18977R.string.internal_asset_transfer_review_negative_value_check_subtitle, new Object[0]), new Button(companion.invoke(C18977R.string.edit_transfer, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createInstantCheckPreSubmitAlertSheet(boolean isBlocking) {
        WarningType.InstantCheckFailed instantCheckFailed = WarningType.InstantCheckFailed.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.MEGAPHONE;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(instantCheckFailed, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_unsettled_positions_check_title, new Object[0]), companion.invoke(C18977R.string.f4228x677db967, new Object[0]), new Button(companion.invoke(C18977R.string.edit_transfer, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_close, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createGenericPreSubmitAlertSheet(boolean isBlocking) {
        WarningType.GenericWarning genericWarning = WarningType.GenericWarning.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(genericWarning, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_generic_check_title, new Object[0]), companion.invoke(C18977R.string.internal_asset_transfer_review_generic_check_subtitle, new Object[0]), new Button(companion.invoke(C18977R.string.internal_asset_transfer_review_try_again, new Object[0]), PresubmissionCheckAlertSheets2.TryAgain.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_close, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createTransferLimitPreSubmitAlertSheet(boolean isBlocking) {
        WarningType.TransferLimitCheckFailed transferLimitCheckFailed = WarningType.TransferLimitCheckFailed.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(transferLimitCheckFailed, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_transfer_limit_check_title, new Object[0]), companion.invoke(C18977R.string.internal_asset_transfer_review_transfer_limit_check_subtitle, new Object[0]), new Button(companion.invoke(C11048R.string.general_label_contact_support, new Object[0]), new PresubmissionCheckAlertSheets2.Navigate(new ContactSupportFragmentKey.TriageFlow(null, "87", null, null, null, 29, null))), new Button(companion.invoke(C11048R.string.general_label_close, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet create2kMinimumEquityPreSubmitAlertSheet(Account sourceAccount, boolean isBlocking) {
        WarningType.TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed = WarningType.TwoKMinimumEquityCheckFailed.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(twoKMinimumEquityCheckFailed, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_2k_limit_check_title, new Object[0]), companion.invoke(C18977R.string.internal_asset_transfer_review_2k_limit_check_subtitle, AccountDisplayNames.getDisplayName(sourceAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.edit_transfer_cta, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createMaintenanceExcessPreSubmitAlertSheet(Account sourceAccount, boolean isBlocking) {
        WarningType.MaintenanceExcessCheckFailed maintenanceExcessCheckFailed = WarningType.MaintenanceExcessCheckFailed.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(maintenanceExcessCheckFailed, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_tranfer_review_margin_call_check_title, new Object[0]), companion.invoke(C18977R.string.internal_asset_tranfer_review_margin_call_check_subtitle, AccountDisplayNames.getDisplayName(sourceAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.edit_transfer_cta, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createPdt25kMinimumEquityPreSubmitAlertSheet(Account sourceAccount, boolean isBlocking) {
        WarningType.Pdt25kLimit pdt25kLimit = WarningType.Pdt25kLimit.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(pdt25kLimit, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_pdt_check_title, AccountDisplayNames.getDisplayName(sourceAccount).getWithAccount().getInSentence()), companion.invoke(C18977R.string.internal_asset_transfer_review_pdt_check_subtitle, AccountDisplayNames.getDisplayName(sourceAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.edit_transfer_cta, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createBorrowingLimitPreSubmitAlertSheet(Account sinkAccount, boolean isBlocking) {
        WarningType.BorrowingLimitCheckFailed borrowingLimitCheckFailed = WarningType.BorrowingLimitCheckFailed.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(borrowingLimitCheckFailed, serverToBentoAssetMapper3, companion.invoke(C18977R.string.internal_asset_transfer_review_borrowing_limit_check_title, AccountDisplayNames.getDisplayName(sinkAccount).getWithAccount().getInSentence()), companion.invoke(C18977R.string.internal_asset_transfer_review_borrowing_limit_check_subtitle, AccountDisplayNames.getDisplayName(sinkAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.edit_transfer_cta, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C18977R.string.go_to_settings, new Object[0]), new PresubmissionCheckAlertSheets2.Navigate(new LegacyFragmentKey.AccountOverview(null, sinkAccount.getAccountNumber(), 1, null))), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createAcatsClawbackPreSubmitAlertSheet(PreSubmissionWarningTypeDto.WarningTypeDto.AcatsClawback warning, Account sourceAccount, Account sinkAccount, boolean isBlocking) {
        if (warning.getValue().is_insufficient_funds()) {
            return m2106x1195adf8(warning, isBlocking);
        }
        return createAcatsClawbackPreSubmitAlertSheetExperiment(warning, sourceAccount, sinkAccount, isBlocking);
    }

    private final PresubmissionChecksAlertSheet createAcatsClawbackPreSubmitAlertSheetExperiment(PreSubmissionWarningTypeDto.WarningTypeDto.AcatsClawback warning, Account sourceAccount, Account sinkAccount, boolean isBlocking) {
        BigDecimal bigDecimalOrNull = warning.getValue().getMoved_match_amount().toBigDecimalOrNull();
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = BigDecimal.ZERO;
        }
        WarningType.AcatsClawback acatsClawback = WarningType.AcatsClawback.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.MEGAPHONE;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C18977R.string.internal_asset_transfer_review_acats_clawback_blocked_title;
        Intrinsics.checkNotNull(bigDecimalOrNull);
        return new PresubmissionChecksAlertSheet(acatsClawback, serverToBentoAssetMapper3, companion.invoke(i, Money.format$default(Money3.toMoney$default(bigDecimalOrNull, null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null)), companion.invoke(C18977R.string.internal_asset_transfer_review_acats_clawback_blocked_subtitle, AccountDisplayNames.getDisplayName(sourceAccount).getWithAccount().getInSentence(), Money.format$default(Money3.toMoney$default(bigDecimalOrNull, null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null), AccountDisplayNames.getDisplayName(sinkAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.continue_transfer, new Object[0]), PresubmissionCheckAlertSheets2.ContinueTransfer.INSTANCE), new Button(companion.invoke(C18977R.string.go_back, new Object[0]), PresubmissionCheckAlertSheets2.GoBack.INSTANCE), isBlocking);
    }

    /* renamed from: createAcatsClawbackPreSubmitAlertSheetExperimentInsufficientFunds */
    private final PresubmissionChecksAlertSheet m2106x1195adf8(PreSubmissionWarningTypeDto.WarningTypeDto.AcatsClawback warning, boolean isBlocking) {
        BigDecimal bigDecimalOrNull = warning.getValue().getMoved_match_amount().toBigDecimalOrNull();
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalOrNull2 = warning.getValue().getClawback_amount().toBigDecimalOrNull();
        if (bigDecimalOrNull2 == null) {
            bigDecimalOrNull2 = BigDecimal.ZERO;
        }
        WarningType.AcatsClawback acatsClawback = WarningType.AcatsClawback.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C18977R.string.f4219x22ec3f83;
        Intrinsics.checkNotNull(bigDecimalOrNull);
        Intrinsics.checkNotNull(bigDecimalOrNull2);
        BigDecimal bigDecimalAdd = bigDecimalOrNull.add(bigDecimalOrNull2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return new PresubmissionChecksAlertSheet(acatsClawback, serverToBentoAssetMapper3, companion.invoke(i, Money.format$default(Money3.toMoney$default(bigDecimalAdd, null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null)), companion.invoke(C18977R.string.f4218xf7199b0d, new Object[0]), new Button(companion.invoke(C11048R.string.general_label_close, new Object[0]), PresubmissionCheckAlertSheets2.Close.INSTANCE), null, isBlocking);
    }

    private final PresubmissionChecksAlertSheet createGoldBoostPreSubmitAlertSheet(PreSubmissionWarningTypeDto.WarningTypeDto.GoldBoostDetails warning, Account sinkAccount, boolean isBlocking) {
        BigDecimal bigDecimalOrNull = warning.getValue().getMoved_gold_boost_amount().toBigDecimalOrNull();
        if (bigDecimalOrNull == null) {
            return null;
        }
        WarningType.GoldBoostDetails goldBoostDetails = WarningType.GoldBoostDetails.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.MEGAPHONE;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new PresubmissionChecksAlertSheet(goldBoostDetails, serverToBentoAssetMapper3, companion.invoke(C18977R.string.gated_gold_internal_asset_transfer_review_gold_boost_reset_title, new Object[0]), companion.invoke(C18977R.string.f4210x9c2d578, Money.format$default(Money3.toMoney(bigDecimalOrNull, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null), AccountDisplayNames.getDisplayName(sinkAccount).getWithAccount().getInSentence()), new Button(companion.invoke(C18977R.string.continue_transfer, new Object[0]), PresubmissionCheckAlertSheets2.ContinueTransfer.INSTANCE), new Button(companion.invoke(C18977R.string.go_back, new Object[0]), PresubmissionCheckAlertSheets2.GoBack.INSTANCE), isBlocking);
    }

    private final PresubmissionChecksAlertSheet createStrategiesMinimumTransferAmountAlertSheet(Account sourceAccount, Account sinkAccount) {
        int i;
        WarningType.StrategiesMinimumTransfer strategiesMinimumTransfer = WarningType.StrategiesMinimumTransfer.INSTANCE;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C18977R.string.strategies_minimum_value_header, new Object[0]);
        if (BigDecimals7.isPositive(sourceAccount.getCashAvailableForWithdrawal())) {
            i = C18977R.string.strategies_minimum_value_equities_or_cash;
        } else {
            i = C18977R.string.strategies_minimum_value_equities_only;
        }
        return new PresubmissionChecksAlertSheet(strategiesMinimumTransfer, serverToBentoAssetMapper3, stringResourceInvoke, companion.invoke(i, new Object[0]), new Button(companion.invoke(C18977R.string.edit_transfer_short, new Object[0]), PresubmissionCheckAlertSheets2.NavigateToTransferSelection.INSTANCE), new Button(companion.invoke(C18977R.string.cancel_transfer, new Object[0]), new PresubmissionCheckAlertSheets2.ExitFlow(ManagedDashboardKey.buildManagedDashboardKey(sinkAccount.getAccountNumber(), sinkAccount.getBrokerageAccountType()))), true);
    }
}
