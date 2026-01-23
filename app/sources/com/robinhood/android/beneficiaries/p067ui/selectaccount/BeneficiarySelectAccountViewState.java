package com.robinhood.android.beneficiaries.p067ui.selectaccount;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: BeneficiarySelectAccountViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState;", "", "<init>", "()V", "Loading", "Content", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Content;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Loading;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class BeneficiarySelectAccountViewState {
    public static final int $stable = 0;

    public /* synthetic */ BeneficiarySelectAccountViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BeneficiarySelectAccountViewState() {
    }

    /* compiled from: BeneficiarySelectAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Loading;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState;", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Content;", "getLoadingMock", "()Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Content;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends BeneficiarySelectAccountViewState {
        public static final int $stable;
        public static final Loading INSTANCE = new Loading();
        private static final Content loadingMock;

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1615655370;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }

        public final Content getLoadingMock() {
            return loadingMock;
        }

        static {
            String strRepeat = StringsKt.repeat(Constants.RequestParamsKeys.APP_NAME_KEY, 65);
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
                ManagementType managementType = ManagementType.SELF_DIRECTED;
                Instant EPOCH = Instant.EPOCH;
                Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                String strValueOf = String.valueOf(i);
                StringResource.Companion companion = StringResource.INSTANCE;
                arrayList.add(new AccountSelectorRowData(brokerageAccountType, managementType, EPOCH, null, strValueOf, companion.invoke("---------- -------"), companion.invoke("- -----------"), ServerToBentoAssetMapper2.FINANCE_24, null, null, false, 1800, null));
            }
            loadingMock = new Content("-------------", strRepeat, new AccountSelectorData(extensions2.toImmutableList(arrayList)));
            $stable = 8;
        }
    }

    /* compiled from: BeneficiarySelectAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState$Content;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState;", "title", "", "subtitleMarkdown", "accountSelectorData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAccountSelectorData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content extends BeneficiarySelectAccountViewState {
        public static final int $stable = 8;
        private final AccountSelectorData accountSelectorData;
        private final String subtitleMarkdown;
        private final String title;

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, AccountSelectorData accountSelectorData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.title;
            }
            if ((i & 2) != 0) {
                str2 = content.subtitleMarkdown;
            }
            if ((i & 4) != 0) {
                accountSelectorData = content.accountSelectorData;
            }
            return content.copy(str, str2, accountSelectorData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountSelectorData getAccountSelectorData() {
            return this.accountSelectorData;
        }

        public final Content copy(String title, String subtitleMarkdown, AccountSelectorData accountSelectorData) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
            Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
            return new Content(title, subtitleMarkdown, accountSelectorData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subtitleMarkdown, content.subtitleMarkdown) && Intrinsics.areEqual(this.accountSelectorData, content.accountSelectorData);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subtitleMarkdown.hashCode()) * 31) + this.accountSelectorData.hashCode();
        }

        public String toString() {
            return "Content(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", accountSelectorData=" + this.accountSelectorData + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final AccountSelectorData getAccountSelectorData() {
            return this.accountSelectorData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(String title, String subtitleMarkdown, AccountSelectorData accountSelectorData) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
            Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
            this.title = title;
            this.subtitleMarkdown = subtitleMarkdown;
            this.accountSelectorData = accountSelectorData;
        }
    }
}
