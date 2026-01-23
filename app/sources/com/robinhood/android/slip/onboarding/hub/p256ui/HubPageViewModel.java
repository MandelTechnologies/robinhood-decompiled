package com.robinhood.android.slip.onboarding.hub.p256ui;

import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubPageViewModel.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001BQ\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010 \u001a\u0004\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002%&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/ui/HubPageViewModel;", "", "title", "Lcom/robinhood/models/db/SlipHub$TextWithIconLink;", "accountSelectorText", "", "headerContent", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "lastMonthPaymentCard", "Lcom/robinhood/models/db/SlipHub$PaymentsCard;", "totalPaymentCard", "instrumentsSection", "Lcom/robinhood/models/db/SlipHub$InstrumentsSection;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/models/db/SlipHub$TextWithIconLink;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/db/SlipHub$PaymentsCard;Lcom/robinhood/models/db/SlipHub$PaymentsCard;Lcom/robinhood/models/db/SlipHub$InstrumentsSection;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getTitle", "()Lcom/robinhood/models/db/SlipHub$TextWithIconLink;", "getAccountSelectorText", "()Ljava/lang/String;", "getHeaderContent", "()Ljava/util/List;", "getLastMonthPaymentCard", "()Lcom/robinhood/models/db/SlipHub$PaymentsCard;", "getTotalPaymentCard", "getInstrumentsSection", "()Lcom/robinhood/models/db/SlipHub$InstrumentsSection;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getSelectorChipState", "Lcom/robinhood/android/slip/onboarding/hub/ui/SelectorChipState;", "onClick", "Lkotlin/Function0;", "", "Lcom/robinhood/android/slip/onboarding/hub/ui/AccountPageViewModel;", "Lcom/robinhood/android/slip/onboarding/hub/ui/AllAccountPageViewModel;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class HubPageViewModel {
    public static final int $stable = 8;
    private final String accountSelectorText;
    private final AccountSwitcherData accountSwitcherData;
    private final List<UIComponent<GenericAction>> headerContent;
    private final SlipHub.InstrumentsSection instrumentsSection;
    private final SlipHub.PaymentsCard lastMonthPaymentCard;
    private final SlipHub.TextWithIconLink title;
    private final SlipHub.PaymentsCard totalPaymentCard;

    public /* synthetic */ HubPageViewModel(SlipHub.TextWithIconLink textWithIconLink, String str, List list, SlipHub.PaymentsCard paymentsCard, SlipHub.PaymentsCard paymentsCard2, SlipHub.InstrumentsSection instrumentsSection, AccountSwitcherData accountSwitcherData, DefaultConstructorMarker defaultConstructorMarker) {
        this(textWithIconLink, str, list, paymentsCard, paymentsCard2, instrumentsSection, accountSwitcherData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HubPageViewModel(SlipHub.TextWithIconLink textWithIconLink, String str, List<? extends UIComponent<? extends GenericAction>> list, SlipHub.PaymentsCard paymentsCard, SlipHub.PaymentsCard paymentsCard2, SlipHub.InstrumentsSection instrumentsSection, AccountSwitcherData accountSwitcherData) {
        this.title = textWithIconLink;
        this.accountSelectorText = str;
        this.headerContent = list;
        this.lastMonthPaymentCard = paymentsCard;
        this.totalPaymentCard = paymentsCard2;
        this.instrumentsSection = instrumentsSection;
        this.accountSwitcherData = accountSwitcherData;
    }

    public SlipHub.TextWithIconLink getTitle() {
        return this.title;
    }

    public String getAccountSelectorText() {
        return this.accountSelectorText;
    }

    public List<UIComponent<GenericAction>> getHeaderContent() {
        return this.headerContent;
    }

    public SlipHub.PaymentsCard getLastMonthPaymentCard() {
        return this.lastMonthPaymentCard;
    }

    public SlipHub.PaymentsCard getTotalPaymentCard() {
        return this.totalPaymentCard;
    }

    public SlipHub.InstrumentsSection getInstrumentsSection() {
        return this.instrumentsSection;
    }

    public AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final SelectorChipState getSelectorChipState(Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        String accountSelectorText = getAccountSelectorText();
        if (accountSelectorText != null) {
            return new SelectorChipState(accountSelectorText, onClick);
        }
        return null;
    }
}
