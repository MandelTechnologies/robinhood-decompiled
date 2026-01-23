package com.robinhood.android.lib.margin.api;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginTieredRates.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates;", "", "marginAvailable", "Lcom/robinhood/models/util/Money;", "rates", "", "Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$ApiMarginTieredRate;", "highlightedRate", "content", "Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$Content;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$ApiMarginTieredRate;Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$Content;)V", "getMarginAvailable", "()Lcom/robinhood/models/util/Money;", "getRates", "()Ljava/util/List;", "getHighlightedRate", "()Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$ApiMarginTieredRate;", "getContent", "()Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$Content;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ApiMarginTieredRate", "Content", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginTieredRates {
    private final Content content;
    private final ApiMarginTieredRate highlightedRate;
    private final Money marginAvailable;
    private final List<ApiMarginTieredRate> rates;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiMarginTieredRates copy$default(ApiMarginTieredRates apiMarginTieredRates, Money money, List list, ApiMarginTieredRate apiMarginTieredRate, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            money = apiMarginTieredRates.marginAvailable;
        }
        if ((i & 2) != 0) {
            list = apiMarginTieredRates.rates;
        }
        if ((i & 4) != 0) {
            apiMarginTieredRate = apiMarginTieredRates.highlightedRate;
        }
        if ((i & 8) != 0) {
            content = apiMarginTieredRates.content;
        }
        return apiMarginTieredRates.copy(money, list, apiMarginTieredRate, content);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMarginAvailable() {
        return this.marginAvailable;
    }

    public final List<ApiMarginTieredRate> component2() {
        return this.rates;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiMarginTieredRate getHighlightedRate() {
        return this.highlightedRate;
    }

    /* renamed from: component4, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public final ApiMarginTieredRates copy(@Json(name = "margin_available") Money marginAvailable, List<ApiMarginTieredRate> rates, @Json(name = "highlighted_rate") ApiMarginTieredRate highlightedRate, @Json(name = "content") Content content) {
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(highlightedRate, "highlightedRate");
        return new ApiMarginTieredRates(marginAvailable, rates, highlightedRate, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginTieredRates)) {
            return false;
        }
        ApiMarginTieredRates apiMarginTieredRates = (ApiMarginTieredRates) other;
        return Intrinsics.areEqual(this.marginAvailable, apiMarginTieredRates.marginAvailable) && Intrinsics.areEqual(this.rates, apiMarginTieredRates.rates) && Intrinsics.areEqual(this.highlightedRate, apiMarginTieredRates.highlightedRate) && Intrinsics.areEqual(this.content, apiMarginTieredRates.content);
    }

    public int hashCode() {
        int iHashCode = ((((this.marginAvailable.hashCode() * 31) + this.rates.hashCode()) * 31) + this.highlightedRate.hashCode()) * 31;
        Content content = this.content;
        return iHashCode + (content == null ? 0 : content.hashCode());
    }

    public String toString() {
        return "ApiMarginTieredRates(marginAvailable=" + this.marginAvailable + ", rates=" + this.rates + ", highlightedRate=" + this.highlightedRate + ", content=" + this.content + ")";
    }

    public ApiMarginTieredRates(@Json(name = "margin_available") Money marginAvailable, List<ApiMarginTieredRate> rates, @Json(name = "highlighted_rate") ApiMarginTieredRate highlightedRate, @Json(name = "content") Content content) {
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(highlightedRate, "highlightedRate");
        this.marginAvailable = marginAvailable;
        this.rates = rates;
        this.highlightedRate = highlightedRate;
        this.content = content;
    }

    public final Money getMarginAvailable() {
        return this.marginAvailable;
    }

    public final List<ApiMarginTieredRate> getRates() {
        return this.rates;
    }

    public final ApiMarginTieredRate getHighlightedRate() {
        return this.highlightedRate;
    }

    public final Content getContent() {
        return this.content;
    }

    /* compiled from: ApiMarginTieredRates.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$ApiMarginTieredRate;", "", "marginBalanceRange", "", "interestRateDisplay", "interestRate", "", "scheduleIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "getMarginBalanceRange", "()Ljava/lang/String;", "getInterestRateDisplay", "getInterestRate", "()F", "getScheduleIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiMarginTieredRate {
        private final float interestRate;
        private final String interestRateDisplay;
        private final String marginBalanceRange;
        private final String scheduleIdentifier;

        public static /* synthetic */ ApiMarginTieredRate copy$default(ApiMarginTieredRate apiMarginTieredRate, String str, String str2, float f, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiMarginTieredRate.marginBalanceRange;
            }
            if ((i & 2) != 0) {
                str2 = apiMarginTieredRate.interestRateDisplay;
            }
            if ((i & 4) != 0) {
                f = apiMarginTieredRate.interestRate;
            }
            if ((i & 8) != 0) {
                str3 = apiMarginTieredRate.scheduleIdentifier;
            }
            return apiMarginTieredRate.copy(str, str2, f, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMarginBalanceRange() {
            return this.marginBalanceRange;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInterestRateDisplay() {
            return this.interestRateDisplay;
        }

        /* renamed from: component3, reason: from getter */
        public final float getInterestRate() {
            return this.interestRate;
        }

        /* renamed from: component4, reason: from getter */
        public final String getScheduleIdentifier() {
            return this.scheduleIdentifier;
        }

        public final ApiMarginTieredRate copy(@Json(name = "margin_balance_range_string") String marginBalanceRange, @Json(name = "interest_rate_display_string") String interestRateDisplay, @Json(name = "interest_rate") float interestRate, @Json(name = "schedule_identifier") String scheduleIdentifier) {
            Intrinsics.checkNotNullParameter(marginBalanceRange, "marginBalanceRange");
            Intrinsics.checkNotNullParameter(interestRateDisplay, "interestRateDisplay");
            return new ApiMarginTieredRate(marginBalanceRange, interestRateDisplay, interestRate, scheduleIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiMarginTieredRate)) {
                return false;
            }
            ApiMarginTieredRate apiMarginTieredRate = (ApiMarginTieredRate) other;
            return Intrinsics.areEqual(this.marginBalanceRange, apiMarginTieredRate.marginBalanceRange) && Intrinsics.areEqual(this.interestRateDisplay, apiMarginTieredRate.interestRateDisplay) && Float.compare(this.interestRate, apiMarginTieredRate.interestRate) == 0 && Intrinsics.areEqual(this.scheduleIdentifier, apiMarginTieredRate.scheduleIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((((this.marginBalanceRange.hashCode() * 31) + this.interestRateDisplay.hashCode()) * 31) + Float.hashCode(this.interestRate)) * 31;
            String str = this.scheduleIdentifier;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ApiMarginTieredRate(marginBalanceRange=" + this.marginBalanceRange + ", interestRateDisplay=" + this.interestRateDisplay + ", interestRate=" + this.interestRate + ", scheduleIdentifier=" + this.scheduleIdentifier + ")";
        }

        public ApiMarginTieredRate(@Json(name = "margin_balance_range_string") String marginBalanceRange, @Json(name = "interest_rate_display_string") String interestRateDisplay, @Json(name = "interest_rate") float f, @Json(name = "schedule_identifier") String str) {
            Intrinsics.checkNotNullParameter(marginBalanceRange, "marginBalanceRange");
            Intrinsics.checkNotNullParameter(interestRateDisplay, "interestRateDisplay");
            this.marginBalanceRange = marginBalanceRange;
            this.interestRateDisplay = interestRateDisplay;
            this.interestRate = f;
            this.scheduleIdentifier = str;
        }

        public final String getMarginBalanceRange() {
            return this.marginBalanceRange;
        }

        public final String getInterestRateDisplay() {
            return this.interestRateDisplay;
        }

        public final float getInterestRate() {
            return this.interestRate;
        }

        public final String getScheduleIdentifier() {
            return this.scheduleIdentifier;
        }
    }

    /* compiled from: ApiMarginTieredRates.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates$Content;", "", CarResultComposable2.BODY, "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBody", "()Ljava/util/List;", "getFooter", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content {
        private final List<UIComponent<GenericAction>> body;
        private final List<UIComponent<GenericAction>> footer;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.body;
            }
            if ((i & 2) != 0) {
                list2 = content.footer;
            }
            return content.copy(list, list2);
        }

        public final List<UIComponent<GenericAction>> component1() {
            return this.body;
        }

        public final List<UIComponent<GenericAction>> component2() {
            return this.footer;
        }

        public final Content copy(List<? extends UIComponent<? extends GenericAction>> body, List<? extends UIComponent<? extends GenericAction>> footer) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            return new Content(body, footer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.body, content.body) && Intrinsics.areEqual(this.footer, content.footer);
        }

        public int hashCode() {
            return (this.body.hashCode() * 31) + this.footer.hashCode();
        }

        public String toString() {
            return "Content(body=" + this.body + ", footer=" + this.footer + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends UIComponent<? extends GenericAction>> body, List<? extends UIComponent<? extends GenericAction>> footer) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.body = body;
            this.footer = footer;
        }

        public final List<UIComponent<GenericAction>> getBody() {
            return this.body;
        }

        public final List<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }
    }
}
