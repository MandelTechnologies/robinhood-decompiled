package com.robinhood.shared.transfers.cryptocheckout;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodDropdownState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/PaymentMethodDropdownState;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "analyticsIdentifier", "", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons$Size24;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentMethodDropdownState {
    public static final int $stable = StringResource.$stable | BentoIcon4.Size24.$stable;
    private final String analyticsIdentifier;
    private final BentoIcon4.Size24 icon;
    private final StringResource primaryText;
    private final StringResource secondaryText;

    public static /* synthetic */ PaymentMethodDropdownState copy$default(PaymentMethodDropdownState paymentMethodDropdownState, BentoIcon4.Size24 size24, StringResource stringResource, StringResource stringResource2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            size24 = paymentMethodDropdownState.icon;
        }
        if ((i & 2) != 0) {
            stringResource = paymentMethodDropdownState.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = paymentMethodDropdownState.secondaryText;
        }
        if ((i & 8) != 0) {
            str = paymentMethodDropdownState.analyticsIdentifier;
        }
        return paymentMethodDropdownState.copy(size24, stringResource, stringResource2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoIcon4.Size24 getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }

    public final PaymentMethodDropdownState copy(BentoIcon4.Size24 icon, StringResource primaryText, StringResource secondaryText, String analyticsIdentifier) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
        return new PaymentMethodDropdownState(icon, primaryText, secondaryText, analyticsIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodDropdownState)) {
            return false;
        }
        PaymentMethodDropdownState paymentMethodDropdownState = (PaymentMethodDropdownState) other;
        return Intrinsics.areEqual(this.icon, paymentMethodDropdownState.icon) && Intrinsics.areEqual(this.primaryText, paymentMethodDropdownState.primaryText) && Intrinsics.areEqual(this.secondaryText, paymentMethodDropdownState.secondaryText) && Intrinsics.areEqual(this.analyticsIdentifier, paymentMethodDropdownState.analyticsIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.analyticsIdentifier.hashCode();
    }

    public String toString() {
        return "PaymentMethodDropdownState(icon=" + this.icon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", analyticsIdentifier=" + this.analyticsIdentifier + ")";
    }

    public PaymentMethodDropdownState(BentoIcon4.Size24 icon, StringResource primaryText, StringResource stringResource, String analyticsIdentifier) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
        this.icon = icon;
        this.primaryText = primaryText;
        this.secondaryText = stringResource;
        this.analyticsIdentifier = analyticsIdentifier;
    }

    public final BentoIcon4.Size24 getIcon() {
        return this.icon;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public /* synthetic */ PaymentMethodDropdownState(BentoIcon4.Size24 size24, StringResource stringResource, StringResource stringResource2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(size24, stringResource, stringResource2, (i & 8) != 0 ? "" : str);
    }

    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }
}
