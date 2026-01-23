package com.robinhood.android.mcduckling.card.help.p179ui;

import com.robinhood.android.common.mcduckling.address.MailingAddress;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.models.api.minerva.ApiShippingUpdateRequest;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.PostalCodeUs;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardShippingAddressViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00103\u001a\u00020\rHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jp\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020$HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010$8G¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0013\u0010+\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001b¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressViewState;", "", "replacementType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "user", "Lcom/robinhood/models/db/sheriff/User;", "minervaShippingAddress", "Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;", "addressOverride", "Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "shippingAddressId", "Ljava/util/UUID;", "isBillingAddress", "", "isLoading", "loadAddressError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;Lcom/robinhood/android/common/mcduckling/address/MailingAddress;Ljava/util/UUID;Ljava/lang/Boolean;ZLcom/robinhood/udf/UiEvent;)V", "getReplacementType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getMinervaShippingAddress", "()Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;", "getAddressOverride", "()Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "getShippingAddressId", "()Ljava/util/UUID;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getLoadAddressError", "()Lcom/robinhood/udf/UiEvent;", "titleTextRes", "", "getTitleTextRes", "()I", "subtitleTextRes", "getSubtitleTextRes", "()Ljava/lang/Integer;", "isSubtitleVisible", "mailingAddress", "getMailingAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;Lcom/robinhood/android/common/mcduckling/address/MailingAddress;Ljava/util/UUID;Ljava/lang/Boolean;ZLcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressViewState;", "equals", "other", "hashCode", "toString", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CardShippingAddressViewState {
    public static final int $stable = 8;
    private final MailingAddress addressOverride;
    private final Boolean isBillingAddress;
    private final boolean isLoading;
    private final UiEvent<Throwable> loadAddressError;
    private final ApiShippingUpdateRequest minervaShippingAddress;
    private final CardReplacementType replacementType;
    private final UUID shippingAddressId;
    private final User user;

    /* compiled from: CardShippingAddressViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardReplacementType.values().length];
            try {
                iArr[CardReplacementType.LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardReplacementType.STOLEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardReplacementType.STOLEN_VIRTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardReplacementType.UNAUTHORIZED_TRANSACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardReplacementType.DAMAGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardReplacementType.VIRTUAL_TO_PHYSICAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CardShippingAddressViewState copy$default(CardShippingAddressViewState cardShippingAddressViewState, CardReplacementType cardReplacementType, User user, ApiShippingUpdateRequest apiShippingUpdateRequest, MailingAddress mailingAddress, UUID uuid, Boolean bool, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            cardReplacementType = cardShippingAddressViewState.replacementType;
        }
        if ((i & 2) != 0) {
            user = cardShippingAddressViewState.user;
        }
        if ((i & 4) != 0) {
            apiShippingUpdateRequest = cardShippingAddressViewState.minervaShippingAddress;
        }
        if ((i & 8) != 0) {
            mailingAddress = cardShippingAddressViewState.addressOverride;
        }
        if ((i & 16) != 0) {
            uuid = cardShippingAddressViewState.shippingAddressId;
        }
        if ((i & 32) != 0) {
            bool = cardShippingAddressViewState.isBillingAddress;
        }
        if ((i & 64) != 0) {
            z = cardShippingAddressViewState.isLoading;
        }
        if ((i & 128) != 0) {
            uiEvent = cardShippingAddressViewState.loadAddressError;
        }
        boolean z2 = z;
        UiEvent uiEvent2 = uiEvent;
        UUID uuid2 = uuid;
        Boolean bool2 = bool;
        return cardShippingAddressViewState.copy(cardReplacementType, user, apiShippingUpdateRequest, mailingAddress, uuid2, bool2, z2, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    /* renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiShippingUpdateRequest getMinervaShippingAddress() {
        return this.minervaShippingAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final MailingAddress getAddressOverride() {
        return this.addressOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getShippingAddressId() {
        return this.shippingAddressId;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBillingAddress() {
        return this.isBillingAddress;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component8() {
        return this.loadAddressError;
    }

    public final CardShippingAddressViewState copy(CardReplacementType replacementType, User user, ApiShippingUpdateRequest minervaShippingAddress, MailingAddress addressOverride, UUID shippingAddressId, Boolean isBillingAddress, boolean isLoading, UiEvent<Throwable> loadAddressError) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        return new CardShippingAddressViewState(replacementType, user, minervaShippingAddress, addressOverride, shippingAddressId, isBillingAddress, isLoading, loadAddressError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardShippingAddressViewState)) {
            return false;
        }
        CardShippingAddressViewState cardShippingAddressViewState = (CardShippingAddressViewState) other;
        return this.replacementType == cardShippingAddressViewState.replacementType && Intrinsics.areEqual(this.user, cardShippingAddressViewState.user) && Intrinsics.areEqual(this.minervaShippingAddress, cardShippingAddressViewState.minervaShippingAddress) && Intrinsics.areEqual(this.addressOverride, cardShippingAddressViewState.addressOverride) && Intrinsics.areEqual(this.shippingAddressId, cardShippingAddressViewState.shippingAddressId) && Intrinsics.areEqual(this.isBillingAddress, cardShippingAddressViewState.isBillingAddress) && this.isLoading == cardShippingAddressViewState.isLoading && Intrinsics.areEqual(this.loadAddressError, cardShippingAddressViewState.loadAddressError);
    }

    public int hashCode() {
        int iHashCode = this.replacementType.hashCode() * 31;
        User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        ApiShippingUpdateRequest apiShippingUpdateRequest = this.minervaShippingAddress;
        int iHashCode3 = (iHashCode2 + (apiShippingUpdateRequest == null ? 0 : apiShippingUpdateRequest.hashCode())) * 31;
        MailingAddress mailingAddress = this.addressOverride;
        int iHashCode4 = (iHashCode3 + (mailingAddress == null ? 0 : mailingAddress.hashCode())) * 31;
        UUID uuid = this.shippingAddressId;
        int iHashCode5 = (iHashCode4 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Boolean bool = this.isBillingAddress;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.loadAddressError;
        return iHashCode6 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "CardShippingAddressViewState(replacementType=" + this.replacementType + ", user=" + this.user + ", minervaShippingAddress=" + this.minervaShippingAddress + ", addressOverride=" + this.addressOverride + ", shippingAddressId=" + this.shippingAddressId + ", isBillingAddress=" + this.isBillingAddress + ", isLoading=" + this.isLoading + ", loadAddressError=" + this.loadAddressError + ")";
    }

    public CardShippingAddressViewState(CardReplacementType replacementType, User user, ApiShippingUpdateRequest apiShippingUpdateRequest, MailingAddress mailingAddress, UUID uuid, Boolean bool, boolean z, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        this.replacementType = replacementType;
        this.user = user;
        this.minervaShippingAddress = apiShippingUpdateRequest;
        this.addressOverride = mailingAddress;
        this.shippingAddressId = uuid;
        this.isBillingAddress = bool;
        this.isLoading = z;
        this.loadAddressError = uiEvent;
    }

    public /* synthetic */ CardShippingAddressViewState(CardReplacementType cardReplacementType, User user, ApiShippingUpdateRequest apiShippingUpdateRequest, MailingAddress mailingAddress, UUID uuid, Boolean bool, boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardReplacementType, (i & 2) != 0 ? null : user, (i & 4) != 0 ? null : apiShippingUpdateRequest, (i & 8) != 0 ? null : mailingAddress, (i & 16) != 0 ? null : uuid, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : uiEvent);
    }

    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final User getUser() {
        return this.user;
    }

    public final ApiShippingUpdateRequest getMinervaShippingAddress() {
        return this.minervaShippingAddress;
    }

    public final MailingAddress getAddressOverride() {
        return this.addressOverride;
    }

    public final UUID getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final Boolean isBillingAddress() {
        return this.isBillingAddress;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getLoadAddressError() {
        return this.loadAddressError;
    }

    public final int getTitleTextRes() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.replacementType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C21627R.string.card_help_shipping_address_title_cancel_reissue;
            case 5:
                return C21627R.string.card_help_shipping_address_title_new_card;
            case 6:
                return C21627R.string.card_help_shipping_address_title_default;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer getSubtitleTextRes() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.replacementType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return Integer.valueOf(C21627R.string.card_help_shipping_address_subtitle_cancel_reissue);
            case 4:
                return Integer.valueOf(C21627R.string.card_help_shipping_address_subtitle_reissue);
            case 5:
                return Integer.valueOf(C21627R.string.card_help_shipping_address_subtitle_new_card);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isSubtitleVisible() {
        return getSubtitleTextRes() != null;
    }

    public final MailingAddress getMailingAddress() {
        User user = this.user;
        if (user == null) {
            return null;
        }
        MailingAddress mailingAddress = this.addressOverride;
        if (mailingAddress != null) {
            return mailingAddress;
        }
        if (this.minervaShippingAddress == null) {
            return null;
        }
        return new MailingAddress(user.getFullName(), new UsAddress(this.minervaShippingAddress.getShip_to_address1(), this.minervaShippingAddress.getShip_to_address2(), new PostalCodeUs(this.minervaShippingAddress.getShip_to_postal_code()), this.minervaShippingAddress.getShip_to_city(), this.minervaShippingAddress.getShip_to_state()));
    }
}
