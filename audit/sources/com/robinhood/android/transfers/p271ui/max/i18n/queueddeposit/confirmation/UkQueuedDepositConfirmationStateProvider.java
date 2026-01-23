package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import android.content.res.Resources;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UkQueuedDepositConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UkQueuedDepositConfirmationStateProvider implements StateProvider<UkQueuedDepositConfirmationDataState, UkQueuedDepositConfirmationViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public UkQueuedDepositConfirmationStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public UkQueuedDepositConfirmationViewState reduce(UkQueuedDepositConfirmationDataState dataState) throws Resources.NotFoundException {
        UkQueuedDepositConfirmationViewState.DataRow loaded;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiPostTransferPage.UkQueuedDeposit postTransferPage = dataState.getPostTransferPage();
        PaymentInstrumentV2 instrument = dataState.getInstrument();
        String title = postTransferPage.getTitle();
        String subtitle = postTransferPage.getSubtitle();
        String disclosure = postTransferPage.getDisclosure();
        StringResource.Companion companion = StringResource.INSTANCE;
        UkQueuedDepositConfirmationViewState.DataRow.Loaded loaded2 = new UkQueuedDepositConfirmationViewState.DataRow.Loaded(companion.invoke(C39006R.string.transaction_line_item_title_amount, new Object[0]), postTransferPage.getTargetAmount());
        if (instrument != null && UkQueuedDepositConfirmationStateProvider2.hasUkBankAccountDetails(instrument)) {
            loaded = new UkQueuedDepositConfirmationViewState.DataRow.Loaded(companion.invoke(C39006R.string.transaction_line_item_title_from, new Object[0]), UkQueuedDepositConfirmationStateProvider2.getUkBankAccountDisplayName(instrument));
        } else {
            loaded = UkQueuedDepositConfirmationViewState.DataRow.Loading.INSTANCE;
        }
        StringResource stringResourceInvoke = companion.invoke(C39006R.string.transaction_line_item_title_to, new Object[0]);
        String string2 = this.resources.getString(C8179R.string.account_type_individual);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new UkQueuedDepositConfirmationViewState(title, subtitle, extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new UkQueuedDepositConfirmationViewState.DataRow[]{loaded2, loaded, new UkQueuedDepositConfirmationViewState.DataRow.Loaded(stringResourceInvoke, string2), new UkQueuedDepositConfirmationViewState.DataRow.Loaded(companion.invoke(C30065R.string.uk_queued_deposit_confirmation_expiration, new Object[0]), dataState.getPostTransferPage().getMandateExpiration()), new UkQueuedDepositConfirmationViewState.DataRow.Loaded(companion.invoke(C30065R.string.uk_queued_deposit_confirmation_reference, new Object[0]), dataState.getPostTransferPage().getMandateReference())})), disclosure);
    }
}
