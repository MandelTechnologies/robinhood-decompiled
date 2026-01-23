package com.robinhood.android.slip.onboarding.hub.p256ui;

import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubPageViewModel.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/ui/AccountPageViewModel;", "Lcom/robinhood/android/slip/onboarding/hub/ui/HubPageViewModel;", "title", "Lcom/robinhood/models/db/SlipHub$TextWithIconLink;", "accountSelectorText", "", "headerContent", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "lastMonthPaymentCard", "Lcom/robinhood/models/db/SlipHub$PaymentsCard;", "totalPaymentCard", "instrumentsSection", "Lcom/robinhood/models/db/SlipHub$InstrumentsSection;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "accountNumber", "enableButtonCta", "enableDeeplink", "enableAlert", "Lcom/robinhood/models/db/SlipHub$EnableAlert;", "isEnabled", "", "<init>", "(Lcom/robinhood/models/db/SlipHub$TextWithIconLink;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/db/SlipHub$PaymentsCard;Lcom/robinhood/models/db/SlipHub$PaymentsCard;Lcom/robinhood/models/db/SlipHub$InstrumentsSection;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/SlipHub$EnableAlert;Z)V", "getTitle", "()Lcom/robinhood/models/db/SlipHub$TextWithIconLink;", "getAccountSelectorText", "()Ljava/lang/String;", "getHeaderContent", "()Ljava/util/List;", "getLastMonthPaymentCard", "()Lcom/robinhood/models/db/SlipHub$PaymentsCard;", "getTotalPaymentCard", "getInstrumentsSection", "()Lcom/robinhood/models/db/SlipHub$InstrumentsSection;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getAccountNumber", "getEnableButtonCta", "getEnableDeeplink", "getEnableAlert", "()Lcom/robinhood/models/db/SlipHub$EnableAlert;", "()Z", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.ui.AccountPageViewModel, reason: use source file name */
/* loaded from: classes5.dex */
public final class HubPageViewModel2 extends HubPageViewModel {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String accountSelectorText;
    private final AccountSwitcherData accountSwitcherData;
    private final SlipHub.EnableAlert enableAlert;
    private final String enableButtonCta;
    private final String enableDeeplink;
    private final List<UIComponent<GenericAction>> headerContent;
    private final SlipHub.InstrumentsSection instrumentsSection;
    private final boolean isEnabled;
    private final SlipHub.PaymentsCard lastMonthPaymentCard;
    private final SlipHub.TextWithIconLink title;
    private final SlipHub.PaymentsCard totalPaymentCard;

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public SlipHub.TextWithIconLink getTitle() {
        return this.title;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public String getAccountSelectorText() {
        return this.accountSelectorText;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public List<UIComponent<GenericAction>> getHeaderContent() {
        return this.headerContent;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public SlipHub.PaymentsCard getLastMonthPaymentCard() {
        return this.lastMonthPaymentCard;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public SlipHub.PaymentsCard getTotalPaymentCard() {
        return this.totalPaymentCard;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public SlipHub.InstrumentsSection getInstrumentsSection() {
        return this.instrumentsSection;
    }

    @Override // com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel
    public AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEnableButtonCta() {
        return this.enableButtonCta;
    }

    public final String getEnableDeeplink() {
        return this.enableDeeplink;
    }

    public final SlipHub.EnableAlert getEnableAlert() {
        return this.enableAlert;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HubPageViewModel2(SlipHub.TextWithIconLink title, String str, List<? extends UIComponent<? extends GenericAction>> headerContent, SlipHub.PaymentsCard lastMonthPaymentCard, SlipHub.PaymentsCard totalPaymentCard, SlipHub.InstrumentsSection instrumentsSection, AccountSwitcherData accountSwitcherData, String str2, String str3, String str4, SlipHub.EnableAlert enableAlert, boolean z) {
        super(title, str, headerContent, lastMonthPaymentCard, totalPaymentCard, instrumentsSection, accountSwitcherData, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerContent, "headerContent");
        Intrinsics.checkNotNullParameter(lastMonthPaymentCard, "lastMonthPaymentCard");
        Intrinsics.checkNotNullParameter(totalPaymentCard, "totalPaymentCard");
        Intrinsics.checkNotNullParameter(instrumentsSection, "instrumentsSection");
        this.title = title;
        this.accountSelectorText = str;
        this.headerContent = headerContent;
        this.lastMonthPaymentCard = lastMonthPaymentCard;
        this.totalPaymentCard = totalPaymentCard;
        this.instrumentsSection = instrumentsSection;
        this.accountSwitcherData = accountSwitcherData;
        this.accountNumber = str2;
        this.enableButtonCta = str3;
        this.enableDeeplink = str4;
        this.enableAlert = enableAlert;
        this.isEnabled = z;
    }
}
