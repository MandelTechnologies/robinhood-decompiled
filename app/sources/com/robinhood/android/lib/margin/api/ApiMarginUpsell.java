package com.robinhood.android.lib.margin.api;

import com.robinhood.android.lib.margin.api.models.EnableMarginUpsellOrderType;
import com.robinhood.models.util.Money;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginUpsell.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "", "accountNumber", "", "orderType", "Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "orderIdentifier", "shouldShowUpsell", "", "buyingPower", "Lcom/robinhood/models/util/Money;", "content", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell$Content;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;Ljava/lang/String;ZLcom/robinhood/models/util/Money;Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell$Content;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderType", "()Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "getOrderIdentifier", "getShouldShowUpsell", "()Z", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "getContent", "()Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell$Content;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Content", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginUpsell {
    private final String accountNumber;
    private final Money buyingPower;
    private final Content content;
    private final String orderIdentifier;
    private final EnableMarginUpsellOrderType orderType;
    private final boolean shouldShowUpsell;

    public static /* synthetic */ ApiMarginUpsell copy$default(ApiMarginUpsell apiMarginUpsell, String str, EnableMarginUpsellOrderType enableMarginUpsellOrderType, String str2, boolean z, Money money, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMarginUpsell.accountNumber;
        }
        if ((i & 2) != 0) {
            enableMarginUpsellOrderType = apiMarginUpsell.orderType;
        }
        if ((i & 4) != 0) {
            str2 = apiMarginUpsell.orderIdentifier;
        }
        if ((i & 8) != 0) {
            z = apiMarginUpsell.shouldShowUpsell;
        }
        if ((i & 16) != 0) {
            money = apiMarginUpsell.buyingPower;
        }
        if ((i & 32) != 0) {
            content = apiMarginUpsell.content;
        }
        Money money2 = money;
        Content content2 = content;
        return apiMarginUpsell.copy(str, enableMarginUpsellOrderType, str2, z, money2, content2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final EnableMarginUpsellOrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderIdentifier() {
        return this.orderIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldShowUpsell() {
        return this.shouldShowUpsell;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component6, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public final ApiMarginUpsell copy(@Json(name = "account_number") String accountNumber, @Json(name = "order_type") EnableMarginUpsellOrderType orderType, @Json(name = "order_identifier") String orderIdentifier, @Json(name = "should_show_upsell") boolean shouldShowUpsell, @Json(name = "buying_power") Money buyingPower, Content content) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderIdentifier, "orderIdentifier");
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ApiMarginUpsell(accountNumber, orderType, orderIdentifier, shouldShowUpsell, buyingPower, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginUpsell)) {
            return false;
        }
        ApiMarginUpsell apiMarginUpsell = (ApiMarginUpsell) other;
        return Intrinsics.areEqual(this.accountNumber, apiMarginUpsell.accountNumber) && this.orderType == apiMarginUpsell.orderType && Intrinsics.areEqual(this.orderIdentifier, apiMarginUpsell.orderIdentifier) && this.shouldShowUpsell == apiMarginUpsell.shouldShowUpsell && Intrinsics.areEqual(this.buyingPower, apiMarginUpsell.buyingPower) && Intrinsics.areEqual(this.content, apiMarginUpsell.content);
    }

    public int hashCode() {
        return (((((((((this.accountNumber.hashCode() * 31) + this.orderType.hashCode()) * 31) + this.orderIdentifier.hashCode()) * 31) + Boolean.hashCode(this.shouldShowUpsell)) * 31) + this.buyingPower.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "ApiMarginUpsell(accountNumber=" + this.accountNumber + ", orderType=" + this.orderType + ", orderIdentifier=" + this.orderIdentifier + ", shouldShowUpsell=" + this.shouldShowUpsell + ", buyingPower=" + this.buyingPower + ", content=" + this.content + ")";
    }

    public ApiMarginUpsell(@Json(name = "account_number") String accountNumber, @Json(name = "order_type") EnableMarginUpsellOrderType orderType, @Json(name = "order_identifier") String orderIdentifier, @Json(name = "should_show_upsell") boolean z, @Json(name = "buying_power") Money buyingPower, Content content) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderIdentifier, "orderIdentifier");
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(content, "content");
        this.accountNumber = accountNumber;
        this.orderType = orderType;
        this.orderIdentifier = orderIdentifier;
        this.shouldShowUpsell = z;
        this.buyingPower = buyingPower;
        this.content = content;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final EnableMarginUpsellOrderType getOrderType() {
        return this.orderType;
    }

    public final String getOrderIdentifier() {
        return this.orderIdentifier;
    }

    public final boolean getShouldShowUpsell() {
        return this.shouldShowUpsell;
    }

    public final Money getBuyingPower() {
        return this.buyingPower;
    }

    public final Content getContent() {
        return this.content;
    }

    /* compiled from: ApiMarginUpsell.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell$Content;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content {
        private final String description;
        private final String title;

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.title;
            }
            if ((i & 2) != 0) {
                str2 = content.description;
            }
            return content.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Content copy(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Content(title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.description, content.description);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Content(title=" + this.title + ", description=" + this.description + ")";
        }

        public Content(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }
    }
}
