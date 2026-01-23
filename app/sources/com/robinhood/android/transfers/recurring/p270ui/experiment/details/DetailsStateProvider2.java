package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import android.content.res.Resources;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.LoadableString;
import com.robinhood.android.transfers.recurring.p270ui.LoadableString2;
import com.robinhood.android.transfers.recurring.p270ui.UiAutomaticDeposits;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsViewState;
import com.robinhood.android.transfers.recurring.p270ui.experiment.update.ToUpdateInfoBannerIfUpdateNeeded;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.api.cashier.ExtraCashDepositScheduleState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplinkDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\u0003H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0012\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0013\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0003H\u0000\u001a\f\u0010\u0015\u001a\u00020\u000f*\u00020\u0003H\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"infoBanner", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;", "resources", "Landroid/content/res/Resources;", "subtitle", "Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "bankAccountName", "maximumBalance", Footer.f10637type, WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "isCancelButtonEnabled", "", "isCancelButtonLoading", "isPauseButtonEnabled", "isPauseButtonLoading", "isResumable", "isResumeButtonEnabled", "isResumeButtonLoading", "longPlaceholder", "shortPlaceHolder", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DetailsStateProvider2 {
    private static final LoadableString longPlaceholder = LoadableString2.loadingString("----------------");
    private static final LoadableString shortPlaceHolder = LoadableString2.loadingString("----------");

    public static final InfoBanner<GenericAction> infoBanner(DetailsDataState detailsDataState, Resources resources) {
        AutomaticDeposit automaticDeposit;
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        if (uiAutomaticDeposit == null || (automaticDeposit = uiAutomaticDeposit.getAutomaticDeposit()) == null) {
            return null;
        }
        return ToUpdateInfoBannerIfUpdateNeeded.toUpdateInfoBannerIfUpdateNeeded(automaticDeposit, resources, UpdateBankAccountDeeplinkDto.EntryPointDto.RECURRING_DEPOSIT_DETAIL);
    }

    public static final LoadableString subtitle(DetailsDataState detailsDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        if (uiAutomaticDeposit != null) {
            int i = C30439R.string.recurring_deposit_extra_cash_details_subtitle;
            Account associatedBrokerageAccount = uiAutomaticDeposit.getAssociatedBrokerageAccount();
            String destinationAccountDisplayString = null;
            String nickname = associatedBrokerageAccount != null ? associatedBrokerageAccount.getNickname() : null;
            if (nickname == null || nickname.length() == 0) {
                destinationAccountDisplayString = UiAutomaticDeposits.getDestinationAccountDisplayString(uiAutomaticDeposit.getAutomaticDeposit().getDestinationAccount().getAccountType(), resources);
            } else {
                Account associatedBrokerageAccount2 = uiAutomaticDeposit.getAssociatedBrokerageAccount();
                if (associatedBrokerageAccount2 != null) {
                    destinationAccountDisplayString = associatedBrokerageAccount2.getNickname();
                }
            }
            String string2 = resources.getString(i, destinationAccountDisplayString, InstantFormatter.DATE_IN_SYSTEM_ZONE.format(uiAutomaticDeposit.getAutomaticDeposit().getCreatedAt()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            LoadableString loadableStringLoadedString = LoadableString2.loadedString(string2);
            if (loadableStringLoadedString != null) {
                return loadableStringLoadedString;
            }
        }
        return longPlaceholder;
    }

    public static final LoadableString bankAccountName(DetailsDataState detailsDataState, Resources resources) {
        String achRelationshipDisplayName;
        LoadableString loadableStringLoadedString;
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        return (uiAutomaticDeposit == null || (achRelationshipDisplayName = UiAutomaticDeposits.getAchRelationshipDisplayName(uiAutomaticDeposit, resources)) == null || (loadableStringLoadedString = LoadableString2.loadedString(achRelationshipDisplayName)) == null) ? shortPlaceHolder : loadableStringLoadedString;
    }

    public static final LoadableString maximumBalance(DetailsDataState detailsDataState) {
        AutomaticDeposit automaticDeposit;
        Money amount;
        String str;
        LoadableString loadableStringLoadedString;
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        return (uiAutomaticDeposit == null || (automaticDeposit = uiAutomaticDeposit.getAutomaticDeposit()) == null || (amount = automaticDeposit.getAmount()) == null || (str = Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null || (loadableStringLoadedString = LoadableString2.loadedString(str)) == null) ? shortPlaceHolder : loadableStringLoadedString;
    }

    public static final LoadableString footer(DetailsDataState detailsDataState, Resources resources) throws Resources.NotFoundException {
        AutomaticDeposit automaticDeposit;
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        if (((uiAutomaticDeposit == null || (automaticDeposit = uiAutomaticDeposit.getAutomaticDeposit()) == null) ? null : automaticDeposit.getExtraCashDepositScheduleState()) == ExtraCashDepositScheduleState.PAUSED) {
            String string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_details_paused_footer);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return LoadableString2.loadedString(string2);
        }
        UiAutomaticDeposit uiAutomaticDeposit2 = detailsDataState.getUiAutomaticDeposit();
        if ((uiAutomaticDeposit2 != null ? uiAutomaticDeposit2.getAutomaticDeposit() : null) == null) {
            return longPlaceholder;
        }
        return null;
    }

    public static final DetailsViewState.Button primaryButton(DetailsDataState detailsDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (isResumable(detailsDataState)) {
            boolean zIsResumeButtonEnabled = isResumeButtonEnabled(detailsDataState);
            boolean zIsResumeButtonLoading = isResumeButtonLoading(detailsDataState);
            String string2 = resources.getString(C30439R.string.resume_deposits);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new DetailsViewState.Button(zIsResumeButtonEnabled, zIsResumeButtonLoading, string2, DetailsViewState.Button.Action.RESUME, false);
        }
        boolean zIsPauseButtonEnabled = isPauseButtonEnabled(detailsDataState);
        boolean zIsPauseButtonLoading = isPauseButtonLoading(detailsDataState);
        String string3 = resources.getString(C30439R.string.pause_deposits);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new DetailsViewState.Button(zIsPauseButtonEnabled, zIsPauseButtonLoading, string3, DetailsViewState.Button.Action.PAUSE, false);
    }

    public static final DetailsViewState.Button secondaryButton(DetailsDataState detailsDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean zIsCancelButtonEnabled = isCancelButtonEnabled(detailsDataState);
        boolean zIsCancelButtonLoading = isCancelButtonLoading(detailsDataState);
        String string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new DetailsViewState.Button(zIsCancelButtonEnabled, zIsCancelButtonLoading, string2, DetailsViewState.Button.Action.CANCEL, true);
    }

    public static final boolean isCancelButtonEnabled(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return (detailsDataState.isPauseRequestInFlight() || detailsDataState.isResumeRequestInFlight()) ? false : true;
    }

    public static final boolean isCancelButtonLoading(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return detailsDataState.getUiAutomaticDeposit() == null || detailsDataState.isCancelRequestInFlight();
    }

    public static final boolean isPauseButtonEnabled(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return (detailsDataState.isCancelRequestInFlight() || isResumable(detailsDataState)) ? false : true;
    }

    public static final boolean isPauseButtonLoading(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return detailsDataState.getUiAutomaticDeposit() == null || detailsDataState.isPauseRequestInFlight();
    }

    public static final boolean isResumable(DetailsDataState detailsDataState) {
        AutomaticDeposit automaticDeposit;
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        UiAutomaticDeposit uiAutomaticDeposit = detailsDataState.getUiAutomaticDeposit();
        return ((uiAutomaticDeposit == null || (automaticDeposit = uiAutomaticDeposit.getAutomaticDeposit()) == null) ? null : automaticDeposit.getExtraCashDepositScheduleState()) == ExtraCashDepositScheduleState.PAUSED;
    }

    public static final boolean isResumeButtonEnabled(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return !detailsDataState.isCancelRequestInFlight() && isResumable(detailsDataState);
    }

    public static final boolean isResumeButtonLoading(DetailsDataState detailsDataState) {
        Intrinsics.checkNotNullParameter(detailsDataState, "<this>");
        return detailsDataState.getUiAutomaticDeposit() == null || detailsDataState.isResumeRequestInFlight();
    }
}
