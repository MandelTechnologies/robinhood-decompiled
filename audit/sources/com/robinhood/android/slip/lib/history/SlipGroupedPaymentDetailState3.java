package com.robinhood.android.slip.lib.history;

import com.robinhood.models.p320db.SlipGroupedPaymentItem;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipGroupedPaymentDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Error;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loaded;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loading;", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailViewState, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class SlipGroupedPaymentDetailState3 {
    public static final int $stable = 0;

    public /* synthetic */ SlipGroupedPaymentDetailState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SlipGroupedPaymentDetailState3() {
    }

    /* compiled from: SlipGroupedPaymentDetailState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loading;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailViewState$Loading */
    public static final /* data */ class Loading extends SlipGroupedPaymentDetailState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 259161988;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SlipGroupedPaymentDetailState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Loaded;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "accountNumber", "", "account", "dateReceived", "payments", "", "Lcom/robinhood/models/db/SlipGroupedPaymentItem;", "withheldAmount", "Lcom/robinhood/models/util/Money;", "netCredit", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getAccountNumber", "()Ljava/lang/String;", "getAccount", "getDateReceived", "getPayments", "()Ljava/util/List;", "getWithheldAmount", "()Lcom/robinhood/models/util/Money;", "getNetCredit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends SlipGroupedPaymentDetailState3 {
        public static final int $stable = 8;
        private final StringResource account;
        private final String accountNumber;
        private final String dateReceived;
        private final Money netCredit;
        private final List<SlipGroupedPaymentItem> payments;
        private final StringResource subtitle;
        private final StringResource title;
        private final Money withheldAmount;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, StringResource stringResource2, String str, StringResource stringResource3, String str2, List list, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = loaded.subtitle;
            }
            if ((i & 4) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 8) != 0) {
                stringResource3 = loaded.account;
            }
            if ((i & 16) != 0) {
                str2 = loaded.dateReceived;
            }
            if ((i & 32) != 0) {
                list = loaded.payments;
            }
            if ((i & 64) != 0) {
                money = loaded.withheldAmount;
            }
            if ((i & 128) != 0) {
                money2 = loaded.netCredit;
            }
            Money money3 = money;
            Money money4 = money2;
            String str3 = str2;
            List list2 = list;
            return loaded.copy(stringResource, stringResource2, str, stringResource3, str3, list2, money3, money4);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getAccount() {
            return this.account;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDateReceived() {
            return this.dateReceived;
        }

        public final List<SlipGroupedPaymentItem> component6() {
            return this.payments;
        }

        /* renamed from: component7, reason: from getter */
        public final Money getWithheldAmount() {
            return this.withheldAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final Money getNetCredit() {
            return this.netCredit;
        }

        public final Loaded copy(StringResource title, StringResource subtitle, String accountNumber, StringResource account, String dateReceived, List<SlipGroupedPaymentItem> payments, Money withheldAmount, Money netCredit) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(payments, "payments");
            return new Loaded(title, subtitle, accountNumber, account, dateReceived, payments, withheldAmount, netCredit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.account, loaded.account) && Intrinsics.areEqual(this.dateReceived, loaded.dateReceived) && Intrinsics.areEqual(this.payments, loaded.payments) && Intrinsics.areEqual(this.withheldAmount, loaded.withheldAmount) && Intrinsics.areEqual(this.netCredit, loaded.netCredit);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
            StringResource stringResource = this.account;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            String str = this.dateReceived;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.payments.hashCode()) * 31;
            Money money = this.withheldAmount;
            int iHashCode4 = (iHashCode3 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.netCredit;
            return iHashCode4 + (money2 != null ? money2.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", accountNumber=" + this.accountNumber + ", account=" + this.account + ", dateReceived=" + this.dateReceived + ", payments=" + this.payments + ", withheldAmount=" + this.withheldAmount + ", netCredit=" + this.netCredit + ")";
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final StringResource getAccount() {
            return this.account;
        }

        public final String getDateReceived() {
            return this.dateReceived;
        }

        public final List<SlipGroupedPaymentItem> getPayments() {
            return this.payments;
        }

        public final Money getWithheldAmount() {
            return this.withheldAmount;
        }

        public final Money getNetCredit() {
            return this.netCredit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(StringResource title, StringResource subtitle, String accountNumber, StringResource stringResource, String str, List<SlipGroupedPaymentItem> payments, Money money, Money money2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(payments, "payments");
            this.title = title;
            this.subtitle = subtitle;
            this.accountNumber = accountNumber;
            this.account = stringResource;
            this.dateReceived = str;
            this.payments = payments;
            this.withheldAmount = money;
            this.netCredit = money2;
        }
    }

    /* compiled from: SlipGroupedPaymentDetailState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState$Error;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailViewState$Error, reason: from toString */
    public static final /* data */ class Error extends SlipGroupedPaymentDetailState3 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }
}
