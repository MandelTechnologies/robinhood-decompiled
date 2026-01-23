package com.robinhood.android.referral.rewardoffers.referralOffer.details.model;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsAccessDeniedViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003Jo\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\u0013\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001e¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessDeniedViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "headerImageViewData", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "titleText", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "subtitleText", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "inviteContactsText", "", "shouldHideSystemContacts", "", "showPermissionsDialog", "disclosureText", "Lcom/robinhood/models/serverdriven/db/RichText;", "shareLinkButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "isRhsg", "isWhatsAppInstalled", "<init>", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;Ljava/lang/String;ZZLcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/GenericButton;ZZ)V", "getHeaderImageViewData", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "getTitleText", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "getSubtitleText", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "getInviteContactsText", "()Ljava/lang/String;", "getShouldHideSystemContacts", "()Z", "getShowPermissionsDialog", "getDisclosureText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getShareLinkButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "isTopBarVisible", "isBottomBarVisible", "getViewDataList", "", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContactsAccessDeniedViewState extends ReferralOfferDetailsViewState {
    public static final int $stable = 8;
    private final RichText disclosureText;
    private final ReferralOfferDetailsViewData.HeaderImage headerImageViewData;
    private final String inviteContactsText;
    private final boolean isRhsg;
    private final boolean isWhatsAppInstalled;
    private final GenericButton shareLinkButton;
    private final boolean shouldHideSystemContacts;
    private final boolean showPermissionsDialog;
    private final ReferralOfferDetailsViewData.SubtitleText subtitleText;
    private final ReferralOfferDetailsViewData.TitleText titleText;

    public static /* synthetic */ ContactsAccessDeniedViewState copy$default(ContactsAccessDeniedViewState contactsAccessDeniedViewState, ReferralOfferDetailsViewData.HeaderImage headerImage, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, String str, boolean z, boolean z2, RichText richText, GenericButton genericButton, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            headerImage = contactsAccessDeniedViewState.headerImageViewData;
        }
        if ((i & 2) != 0) {
            titleText = contactsAccessDeniedViewState.titleText;
        }
        if ((i & 4) != 0) {
            subtitleText = contactsAccessDeniedViewState.subtitleText;
        }
        if ((i & 8) != 0) {
            str = contactsAccessDeniedViewState.inviteContactsText;
        }
        if ((i & 16) != 0) {
            z = contactsAccessDeniedViewState.shouldHideSystemContacts;
        }
        if ((i & 32) != 0) {
            z2 = contactsAccessDeniedViewState.showPermissionsDialog;
        }
        if ((i & 64) != 0) {
            richText = contactsAccessDeniedViewState.disclosureText;
        }
        if ((i & 128) != 0) {
            genericButton = contactsAccessDeniedViewState.shareLinkButton;
        }
        if ((i & 256) != 0) {
            z3 = contactsAccessDeniedViewState.isRhsg;
        }
        if ((i & 512) != 0) {
            z4 = contactsAccessDeniedViewState.isWhatsAppInstalled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        RichText richText2 = richText;
        GenericButton genericButton2 = genericButton;
        boolean z7 = z;
        boolean z8 = z2;
        return contactsAccessDeniedViewState.copy(headerImage, titleText, subtitleText, str, z7, z8, richText2, genericButton2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferralOfferDetailsViewData.HeaderImage getHeaderImageViewData() {
        return this.headerImageViewData;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsWhatsAppInstalled() {
        return this.isWhatsAppInstalled;
    }

    /* renamed from: component2, reason: from getter */
    public final ReferralOfferDetailsViewData.TitleText getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final ReferralOfferDetailsViewData.SubtitleText getSubtitleText() {
        return this.subtitleText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInviteContactsText() {
        return this.inviteContactsText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldHideSystemContacts() {
        return this.shouldHideSystemContacts;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowPermissionsDialog() {
        return this.showPermissionsDialog;
    }

    /* renamed from: component7, reason: from getter */
    public final RichText getDisclosureText() {
        return this.disclosureText;
    }

    /* renamed from: component8, reason: from getter */
    public final GenericButton getShareLinkButton() {
        return this.shareLinkButton;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRhsg() {
        return this.isRhsg;
    }

    public final ContactsAccessDeniedViewState copy(ReferralOfferDetailsViewData.HeaderImage headerImageViewData, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, String inviteContactsText, boolean shouldHideSystemContacts, boolean showPermissionsDialog, RichText disclosureText, GenericButton shareLinkButton, boolean isRhsg, boolean isWhatsAppInstalled) {
        Intrinsics.checkNotNullParameter(headerImageViewData, "headerImageViewData");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(inviteContactsText, "inviteContactsText");
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        return new ContactsAccessDeniedViewState(headerImageViewData, titleText, subtitleText, inviteContactsText, shouldHideSystemContacts, showPermissionsDialog, disclosureText, shareLinkButton, isRhsg, isWhatsAppInstalled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsAccessDeniedViewState)) {
            return false;
        }
        ContactsAccessDeniedViewState contactsAccessDeniedViewState = (ContactsAccessDeniedViewState) other;
        return Intrinsics.areEqual(this.headerImageViewData, contactsAccessDeniedViewState.headerImageViewData) && Intrinsics.areEqual(this.titleText, contactsAccessDeniedViewState.titleText) && Intrinsics.areEqual(this.subtitleText, contactsAccessDeniedViewState.subtitleText) && Intrinsics.areEqual(this.inviteContactsText, contactsAccessDeniedViewState.inviteContactsText) && this.shouldHideSystemContacts == contactsAccessDeniedViewState.shouldHideSystemContacts && this.showPermissionsDialog == contactsAccessDeniedViewState.showPermissionsDialog && Intrinsics.areEqual(this.disclosureText, contactsAccessDeniedViewState.disclosureText) && Intrinsics.areEqual(this.shareLinkButton, contactsAccessDeniedViewState.shareLinkButton) && this.isRhsg == contactsAccessDeniedViewState.isRhsg && this.isWhatsAppInstalled == contactsAccessDeniedViewState.isWhatsAppInstalled;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.headerImageViewData.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.inviteContactsText.hashCode()) * 31) + Boolean.hashCode(this.shouldHideSystemContacts)) * 31) + Boolean.hashCode(this.showPermissionsDialog)) * 31) + this.disclosureText.hashCode()) * 31;
        GenericButton genericButton = this.shareLinkButton;
        return ((((iHashCode + (genericButton == null ? 0 : genericButton.hashCode())) * 31) + Boolean.hashCode(this.isRhsg)) * 31) + Boolean.hashCode(this.isWhatsAppInstalled);
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isBottomBarVisible() {
        return true;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isTopBarVisible() {
        return true;
    }

    public String toString() {
        return "ContactsAccessDeniedViewState(headerImageViewData=" + this.headerImageViewData + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", inviteContactsText=" + this.inviteContactsText + ", shouldHideSystemContacts=" + this.shouldHideSystemContacts + ", showPermissionsDialog=" + this.showPermissionsDialog + ", disclosureText=" + this.disclosureText + ", shareLinkButton=" + this.shareLinkButton + ", isRhsg=" + this.isRhsg + ", isWhatsAppInstalled=" + this.isWhatsAppInstalled + ")";
    }

    public final ReferralOfferDetailsViewData.HeaderImage getHeaderImageViewData() {
        return this.headerImageViewData;
    }

    public final ReferralOfferDetailsViewData.TitleText getTitleText() {
        return this.titleText;
    }

    public final ReferralOfferDetailsViewData.SubtitleText getSubtitleText() {
        return this.subtitleText;
    }

    public final String getInviteContactsText() {
        return this.inviteContactsText;
    }

    public final boolean getShouldHideSystemContacts() {
        return this.shouldHideSystemContacts;
    }

    public final boolean getShowPermissionsDialog() {
        return this.showPermissionsDialog;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public RichText getDisclosureText() {
        return this.disclosureText;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public GenericButton getShareLinkButton() {
        return this.shareLinkButton;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isRhsg() {
        return this.isRhsg;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isWhatsAppInstalled() {
        return this.isWhatsAppInstalled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsAccessDeniedViewState(ReferralOfferDetailsViewData.HeaderImage headerImageViewData, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, String inviteContactsText, boolean z, boolean z2, RichText disclosureText, GenericButton genericButton, boolean z3, boolean z4) {
        super(null);
        Intrinsics.checkNotNullParameter(headerImageViewData, "headerImageViewData");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(inviteContactsText, "inviteContactsText");
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        this.headerImageViewData = headerImageViewData;
        this.titleText = titleText;
        this.subtitleText = subtitleText;
        this.inviteContactsText = inviteContactsText;
        this.shouldHideSystemContacts = z;
        this.showPermissionsDialog = z2;
        this.disclosureText = disclosureText;
        this.shareLinkButton = genericButton;
        this.isRhsg = z3;
        this.isWhatsAppInstalled = z4;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public List<ReferralOfferDetailsViewData> getViewDataList() {
        BentoSpacing.Companion companion = BentoSpacing.INSTANCE;
        return CollectionsKt.listOf((Object[]) new ReferralOfferDetailsViewData[]{new ReferralOfferDetailsViewData.Spacing(companion.m21598default().m21592getMediumD9Ej5fM(), null), this.headerImageViewData, new ReferralOfferDetailsViewData.Spacing(companion.m21598default().m21594getXlargeD9Ej5fM(), null), this.titleText, this.subtitleText});
    }
}
