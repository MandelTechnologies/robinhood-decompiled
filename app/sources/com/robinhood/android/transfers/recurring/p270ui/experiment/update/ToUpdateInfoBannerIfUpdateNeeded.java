package com.robinhood.android.transfers.recurring.p270ui.experiment.update;

import android.content.res.Resources;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.models.api.cashier.ExtraCashDepositScheduleState;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplinkDto;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToUpdateInfoBannerIfUpdateNeeded.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"toUpdateInfoBannerIfUpdateNeeded", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/models/db/AutomaticDeposit;", "resources", "Landroid/content/res/Resources;", "entryPoint", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.update.ToUpdateInfoBannerIfUpdateNeededKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToUpdateInfoBannerIfUpdateNeeded {
    public static final InfoBanner<GenericAction> toUpdateInfoBannerIfUpdateNeeded(AutomaticDeposit automaticDeposit, Resources resources, UpdateBankAccountDeeplinkDto.EntryPointDto entryPoint) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(automaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        if (automaticDeposit.getExtraCashDepositScheduleState() != ExtraCashDepositScheduleState.EXPIRED) {
            return null;
        }
        String string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_expired_banner_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new InfoBanner<>(null, new RichText(string2, CollectionsKt.emptyList()), null, resources.getString(C30439R.string.relink), new GenericAction.Deeplink(new DeeplinkAction("robinhood://update_bank_account?bank_account_id=" + automaticDeposit.getAchRelationshipId() + "&transfer_id=" + automaticDeposit.getId() + "&entry_point=" + entryPoint)), false, null, null, null, 485, null);
    }
}
