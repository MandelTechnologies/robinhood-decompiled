package com.robinhood.android.referral.rewardoffers.referralOffer.details.model;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.CreateSearchResults;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p355ui.referraloffer.ContactsAccessGranted;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContactsAccessGrantedViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\u0006\u0010'\u001a\u00020\u001e\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0003H\u0016J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018HÆ\u0003J\t\u0010W\u001a\u00020\u001aHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010Y\u001a\u00020\u001eHÆ\u0003J\t\u0010Z\u001a\u00020\u001cHÆ\u0003J\t\u0010[\u001a\u00020\u001eHÆ\u0003J\t\u0010\\\u001a\u00020\u001eHÆ\u0003J\t\u0010]\u001a\u00020\u001eHÆ\u0003J\t\u0010^\u001a\u00020$HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010&HÆ\u0003J\t\u0010`\u001a\u00020\u001eHÆ\u0003J\t\u0010a\u001a\u00020\u001eHÆ\u0003J\u0097\u0002\u0010b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020\u001eHÆ\u0001J\u0013\u0010c\u001a\u00020\u001e2\b\u0010d\u001a\u0004\u0018\u00010eHÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010AR\u0011\u0010\u001f\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0011\u0010 \u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010AR\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010AR\u0011\u0010\"\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010AR\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010%\u001a\u0004\u0018\u00010&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0014\u0010'\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010AR\u0014\u0010(\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010AR\u0014\u0010G\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010H\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010A¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "rawContacts", "", "Lcom/robinhood/models/contacts/ReferralContact;", "headerImageViewData", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "titleText", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "subtitleText", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "searchField", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SearchField;", "suggestedFriendsSectionHeader", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;", "suggestedFriends", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactItem;", "allFriendsSectionHeader", "allFriends", "searchResultsSectionHeader", "selectedContacts", "", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "pendingInvites", "", "multiSelectContent", "Lcom/robinhood/models/ui/referraloffer/ContactsAccessGranted$MultiSelectContent;", "query", "", "isSearching", "", "inviteContactCtaText", "isSendingEmailInvite", "isSendingSmsInvite", "isMultiSelectContactMember", "disclosureText", "Lcom/robinhood/models/serverdriven/db/RichText;", "shareLinkButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "isRhsg", "isWhatsAppInstalled", "<init>", "(Ljava/util/List;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SearchField;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;Ljava/util/List;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;Ljava/util/List;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;Ljava/util/Set;Ljava/util/List;Lcom/robinhood/models/ui/referraloffer/ContactsAccessGranted$MultiSelectContent;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/GenericButton;ZZ)V", "getHeaderImageViewData", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "getTitleText", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "getSubtitleText", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "getSearchField", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SearchField;", "getSuggestedFriendsSectionHeader", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;", "getSuggestedFriends", "()Ljava/util/List;", "getAllFriendsSectionHeader", "getAllFriends", "getSearchResultsSectionHeader", "getSelectedContacts", "()Ljava/util/Set;", "getPendingInvites", "getMultiSelectContent", "()Lcom/robinhood/models/ui/referraloffer/ContactsAccessGranted$MultiSelectContent;", "getQuery", "()Ljava/lang/String;", "()Z", "getInviteContactCtaText", "getDisclosureText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getShareLinkButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "isBottomBarVisible", "isTopBarVisible", "getViewDataList", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class ContactsAccessGrantedViewState extends ReferralOfferDetailsViewState {
    public static final int $stable = 8;
    private final List<ReferralOfferDetailsViewData.ContactItem> allFriends;
    private final ReferralOfferDetailsViewData.ContactSectionHeader allFriendsSectionHeader;
    private final RichText disclosureText;
    private final ReferralOfferDetailsViewData.HeaderImage headerImageViewData;
    private final String inviteContactCtaText;
    private final boolean isMultiSelectContactMember;
    private final boolean isRhsg;
    private final boolean isSearching;
    private final boolean isSendingEmailInvite;
    private final boolean isSendingSmsInvite;
    private final boolean isWhatsAppInstalled;
    private final ContactsAccessGranted.MultiSelectContent multiSelectContent;
    private final List<ReferralOfferDetailsViewData.ContactInfo> pendingInvites;
    private final String query;
    private final List<ReferralContact> rawContacts;
    private final ReferralOfferDetailsViewData.SearchField searchField;
    private final ReferralOfferDetailsViewData.ContactSectionHeader searchResultsSectionHeader;
    private final Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts;
    private final GenericButton shareLinkButton;
    private final ReferralOfferDetailsViewData.SubtitleText subtitleText;
    private final List<ReferralOfferDetailsViewData.ContactItem> suggestedFriends;
    private final ReferralOfferDetailsViewData.ContactSectionHeader suggestedFriendsSectionHeader;
    private final ReferralOfferDetailsViewData.TitleText titleText;

    private final List<ReferralContact> component1() {
        return this.rawContacts;
    }

    public static /* synthetic */ ContactsAccessGrantedViewState copy$default(ContactsAccessGrantedViewState contactsAccessGrantedViewState, List list, ReferralOfferDetailsViewData.HeaderImage headerImage, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, ReferralOfferDetailsViewData.SearchField searchField, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader, List list2, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader2, List list3, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader3, Set set, List list4, ContactsAccessGranted.MultiSelectContent multiSelectContent, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, RichText richText, GenericButton genericButton, boolean z5, boolean z6, int i, Object obj) {
        boolean z7;
        boolean z8;
        List list5 = (i & 1) != 0 ? contactsAccessGrantedViewState.rawContacts : list;
        ReferralOfferDetailsViewData.HeaderImage headerImage2 = (i & 2) != 0 ? contactsAccessGrantedViewState.headerImageViewData : headerImage;
        ReferralOfferDetailsViewData.TitleText titleText2 = (i & 4) != 0 ? contactsAccessGrantedViewState.titleText : titleText;
        ReferralOfferDetailsViewData.SubtitleText subtitleText2 = (i & 8) != 0 ? contactsAccessGrantedViewState.subtitleText : subtitleText;
        ReferralOfferDetailsViewData.SearchField searchField2 = (i & 16) != 0 ? contactsAccessGrantedViewState.searchField : searchField;
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader4 = (i & 32) != 0 ? contactsAccessGrantedViewState.suggestedFriendsSectionHeader : contactSectionHeader;
        List list6 = (i & 64) != 0 ? contactsAccessGrantedViewState.suggestedFriends : list2;
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader5 = (i & 128) != 0 ? contactsAccessGrantedViewState.allFriendsSectionHeader : contactSectionHeader2;
        List list7 = (i & 256) != 0 ? contactsAccessGrantedViewState.allFriends : list3;
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader6 = (i & 512) != 0 ? contactsAccessGrantedViewState.searchResultsSectionHeader : contactSectionHeader3;
        Set set2 = (i & 1024) != 0 ? contactsAccessGrantedViewState.selectedContacts : set;
        List list8 = (i & 2048) != 0 ? contactsAccessGrantedViewState.pendingInvites : list4;
        ContactsAccessGranted.MultiSelectContent multiSelectContent2 = (i & 4096) != 0 ? contactsAccessGrantedViewState.multiSelectContent : multiSelectContent;
        String str3 = (i & 8192) != 0 ? contactsAccessGrantedViewState.query : str;
        List list9 = list5;
        boolean z9 = (i & 16384) != 0 ? contactsAccessGrantedViewState.isSearching : z;
        String str4 = (i & 32768) != 0 ? contactsAccessGrantedViewState.inviteContactCtaText : str2;
        boolean z10 = (i & 65536) != 0 ? contactsAccessGrantedViewState.isSendingEmailInvite : z2;
        boolean z11 = (i & 131072) != 0 ? contactsAccessGrantedViewState.isSendingSmsInvite : z3;
        boolean z12 = (i & 262144) != 0 ? contactsAccessGrantedViewState.isMultiSelectContactMember : z4;
        RichText richText2 = (i & 524288) != 0 ? contactsAccessGrantedViewState.disclosureText : richText;
        GenericButton genericButton2 = (i & 1048576) != 0 ? contactsAccessGrantedViewState.shareLinkButton : genericButton;
        boolean z13 = (i & 2097152) != 0 ? contactsAccessGrantedViewState.isRhsg : z5;
        if ((i & 4194304) != 0) {
            z8 = z13;
            z7 = contactsAccessGrantedViewState.isWhatsAppInstalled;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return contactsAccessGrantedViewState.copy(list9, headerImage2, titleText2, subtitleText2, searchField2, contactSectionHeader4, list6, contactSectionHeader5, list7, contactSectionHeader6, set2, list8, multiSelectContent2, str3, z9, str4, z10, z11, z12, richText2, genericButton2, z8, z7);
    }

    /* renamed from: component10, reason: from getter */
    public final ReferralOfferDetailsViewData.ContactSectionHeader getSearchResultsSectionHeader() {
        return this.searchResultsSectionHeader;
    }

    public final Set<ReferralOfferDetailsViewData.ContactInfo> component11() {
        return this.selectedContacts;
    }

    public final List<ReferralOfferDetailsViewData.ContactInfo> component12() {
        return this.pendingInvites;
    }

    /* renamed from: component13, reason: from getter */
    public final ContactsAccessGranted.MultiSelectContent getMultiSelectContent() {
        return this.multiSelectContent;
    }

    /* renamed from: component14, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsSearching() {
        return this.isSearching;
    }

    /* renamed from: component16, reason: from getter */
    public final String getInviteContactCtaText() {
        return this.inviteContactCtaText;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsSendingEmailInvite() {
        return this.isSendingEmailInvite;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsSendingSmsInvite() {
        return this.isSendingSmsInvite;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsMultiSelectContactMember() {
        return this.isMultiSelectContactMember;
    }

    /* renamed from: component2, reason: from getter */
    public final ReferralOfferDetailsViewData.HeaderImage getHeaderImageViewData() {
        return this.headerImageViewData;
    }

    /* renamed from: component20, reason: from getter */
    public final RichText getDisclosureText() {
        return this.disclosureText;
    }

    /* renamed from: component21, reason: from getter */
    public final GenericButton getShareLinkButton() {
        return this.shareLinkButton;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsRhsg() {
        return this.isRhsg;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsWhatsAppInstalled() {
        return this.isWhatsAppInstalled;
    }

    /* renamed from: component3, reason: from getter */
    public final ReferralOfferDetailsViewData.TitleText getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final ReferralOfferDetailsViewData.SubtitleText getSubtitleText() {
        return this.subtitleText;
    }

    /* renamed from: component5, reason: from getter */
    public final ReferralOfferDetailsViewData.SearchField getSearchField() {
        return this.searchField;
    }

    /* renamed from: component6, reason: from getter */
    public final ReferralOfferDetailsViewData.ContactSectionHeader getSuggestedFriendsSectionHeader() {
        return this.suggestedFriendsSectionHeader;
    }

    public final List<ReferralOfferDetailsViewData.ContactItem> component7() {
        return this.suggestedFriends;
    }

    /* renamed from: component8, reason: from getter */
    public final ReferralOfferDetailsViewData.ContactSectionHeader getAllFriendsSectionHeader() {
        return this.allFriendsSectionHeader;
    }

    public final List<ReferralOfferDetailsViewData.ContactItem> component9() {
        return this.allFriends;
    }

    public final ContactsAccessGrantedViewState copy(List<ReferralContact> rawContacts, ReferralOfferDetailsViewData.HeaderImage headerImageViewData, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, ReferralOfferDetailsViewData.SearchField searchField, ReferralOfferDetailsViewData.ContactSectionHeader suggestedFriendsSectionHeader, List<? extends ReferralOfferDetailsViewData.ContactItem> suggestedFriends, ReferralOfferDetailsViewData.ContactSectionHeader allFriendsSectionHeader, List<? extends ReferralOfferDetailsViewData.ContactItem> allFriends, ReferralOfferDetailsViewData.ContactSectionHeader searchResultsSectionHeader, Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts, List<ReferralOfferDetailsViewData.ContactInfo> pendingInvites, ContactsAccessGranted.MultiSelectContent multiSelectContent, String query, boolean isSearching, String inviteContactCtaText, boolean isSendingEmailInvite, boolean isSendingSmsInvite, boolean isMultiSelectContactMember, RichText disclosureText, GenericButton shareLinkButton, boolean isRhsg, boolean isWhatsAppInstalled) {
        Intrinsics.checkNotNullParameter(headerImageViewData, "headerImageViewData");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(searchField, "searchField");
        Intrinsics.checkNotNullParameter(suggestedFriends, "suggestedFriends");
        Intrinsics.checkNotNullParameter(allFriends, "allFriends");
        Intrinsics.checkNotNullParameter(searchResultsSectionHeader, "searchResultsSectionHeader");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
        Intrinsics.checkNotNullParameter(multiSelectContent, "multiSelectContent");
        Intrinsics.checkNotNullParameter(inviteContactCtaText, "inviteContactCtaText");
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        return new ContactsAccessGrantedViewState(rawContacts, headerImageViewData, titleText, subtitleText, searchField, suggestedFriendsSectionHeader, suggestedFriends, allFriendsSectionHeader, allFriends, searchResultsSectionHeader, selectedContacts, pendingInvites, multiSelectContent, query, isSearching, inviteContactCtaText, isSendingEmailInvite, isSendingSmsInvite, isMultiSelectContactMember, disclosureText, shareLinkButton, isRhsg, isWhatsAppInstalled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsAccessGrantedViewState)) {
            return false;
        }
        ContactsAccessGrantedViewState contactsAccessGrantedViewState = (ContactsAccessGrantedViewState) other;
        return Intrinsics.areEqual(this.rawContacts, contactsAccessGrantedViewState.rawContacts) && Intrinsics.areEqual(this.headerImageViewData, contactsAccessGrantedViewState.headerImageViewData) && Intrinsics.areEqual(this.titleText, contactsAccessGrantedViewState.titleText) && Intrinsics.areEqual(this.subtitleText, contactsAccessGrantedViewState.subtitleText) && Intrinsics.areEqual(this.searchField, contactsAccessGrantedViewState.searchField) && Intrinsics.areEqual(this.suggestedFriendsSectionHeader, contactsAccessGrantedViewState.suggestedFriendsSectionHeader) && Intrinsics.areEqual(this.suggestedFriends, contactsAccessGrantedViewState.suggestedFriends) && Intrinsics.areEqual(this.allFriendsSectionHeader, contactsAccessGrantedViewState.allFriendsSectionHeader) && Intrinsics.areEqual(this.allFriends, contactsAccessGrantedViewState.allFriends) && Intrinsics.areEqual(this.searchResultsSectionHeader, contactsAccessGrantedViewState.searchResultsSectionHeader) && Intrinsics.areEqual(this.selectedContacts, contactsAccessGrantedViewState.selectedContacts) && Intrinsics.areEqual(this.pendingInvites, contactsAccessGrantedViewState.pendingInvites) && Intrinsics.areEqual(this.multiSelectContent, contactsAccessGrantedViewState.multiSelectContent) && Intrinsics.areEqual(this.query, contactsAccessGrantedViewState.query) && this.isSearching == contactsAccessGrantedViewState.isSearching && Intrinsics.areEqual(this.inviteContactCtaText, contactsAccessGrantedViewState.inviteContactCtaText) && this.isSendingEmailInvite == contactsAccessGrantedViewState.isSendingEmailInvite && this.isSendingSmsInvite == contactsAccessGrantedViewState.isSendingSmsInvite && this.isMultiSelectContactMember == contactsAccessGrantedViewState.isMultiSelectContactMember && Intrinsics.areEqual(this.disclosureText, contactsAccessGrantedViewState.disclosureText) && Intrinsics.areEqual(this.shareLinkButton, contactsAccessGrantedViewState.shareLinkButton) && this.isRhsg == contactsAccessGrantedViewState.isRhsg && this.isWhatsAppInstalled == contactsAccessGrantedViewState.isWhatsAppInstalled;
    }

    public int hashCode() {
        List<ReferralContact> list = this.rawContacts;
        int iHashCode = (((((((((list == null ? 0 : list.hashCode()) * 31) + this.headerImageViewData.hashCode()) * 31) + this.titleText.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.searchField.hashCode()) * 31;
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader = this.suggestedFriendsSectionHeader;
        int iHashCode2 = (((iHashCode + (contactSectionHeader == null ? 0 : contactSectionHeader.hashCode())) * 31) + this.suggestedFriends.hashCode()) * 31;
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader2 = this.allFriendsSectionHeader;
        int iHashCode3 = (((((((((((iHashCode2 + (contactSectionHeader2 == null ? 0 : contactSectionHeader2.hashCode())) * 31) + this.allFriends.hashCode()) * 31) + this.searchResultsSectionHeader.hashCode()) * 31) + this.selectedContacts.hashCode()) * 31) + this.pendingInvites.hashCode()) * 31) + this.multiSelectContent.hashCode()) * 31;
        String str = this.query;
        int iHashCode4 = (((((((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSearching)) * 31) + this.inviteContactCtaText.hashCode()) * 31) + Boolean.hashCode(this.isSendingEmailInvite)) * 31) + Boolean.hashCode(this.isSendingSmsInvite)) * 31) + Boolean.hashCode(this.isMultiSelectContactMember)) * 31) + this.disclosureText.hashCode()) * 31;
        GenericButton genericButton = this.shareLinkButton;
        return ((((iHashCode4 + (genericButton != null ? genericButton.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRhsg)) * 31) + Boolean.hashCode(this.isWhatsAppInstalled);
    }

    public String toString() {
        return "ContactsAccessGrantedViewState(rawContacts=" + this.rawContacts + ", headerImageViewData=" + this.headerImageViewData + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", searchField=" + this.searchField + ", suggestedFriendsSectionHeader=" + this.suggestedFriendsSectionHeader + ", suggestedFriends=" + this.suggestedFriends + ", allFriendsSectionHeader=" + this.allFriendsSectionHeader + ", allFriends=" + this.allFriends + ", searchResultsSectionHeader=" + this.searchResultsSectionHeader + ", selectedContacts=" + this.selectedContacts + ", pendingInvites=" + this.pendingInvites + ", multiSelectContent=" + this.multiSelectContent + ", query=" + this.query + ", isSearching=" + this.isSearching + ", inviteContactCtaText=" + this.inviteContactCtaText + ", isSendingEmailInvite=" + this.isSendingEmailInvite + ", isSendingSmsInvite=" + this.isSendingSmsInvite + ", isMultiSelectContactMember=" + this.isMultiSelectContactMember + ", disclosureText=" + this.disclosureText + ", shareLinkButton=" + this.shareLinkButton + ", isRhsg=" + this.isRhsg + ", isWhatsAppInstalled=" + this.isWhatsAppInstalled + ")";
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

    public final ReferralOfferDetailsViewData.SearchField getSearchField() {
        return this.searchField;
    }

    public final ReferralOfferDetailsViewData.ContactSectionHeader getSuggestedFriendsSectionHeader() {
        return this.suggestedFriendsSectionHeader;
    }

    public final List<ReferralOfferDetailsViewData.ContactItem> getSuggestedFriends() {
        return this.suggestedFriends;
    }

    public final ReferralOfferDetailsViewData.ContactSectionHeader getAllFriendsSectionHeader() {
        return this.allFriendsSectionHeader;
    }

    public final List<ReferralOfferDetailsViewData.ContactItem> getAllFriends() {
        return this.allFriends;
    }

    public final ReferralOfferDetailsViewData.ContactSectionHeader getSearchResultsSectionHeader() {
        return this.searchResultsSectionHeader;
    }

    public /* synthetic */ ContactsAccessGrantedViewState(List list, ReferralOfferDetailsViewData.HeaderImage headerImage, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, ReferralOfferDetailsViewData.SearchField searchField, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader, List list2, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader2, List list3, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader3, Set set, List list4, ContactsAccessGranted.MultiSelectContent multiSelectContent, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, RichText richText, GenericButton genericButton, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, headerImage, titleText, subtitleText, searchField, (i & 32) != 0 ? null : contactSectionHeader, list2, (i & 128) != 0 ? null : contactSectionHeader2, list3, contactSectionHeader3, (i & 1024) != 0 ? new LinkedHashSet() : set, (i & 2048) != 0 ? new ArrayList() : list4, multiSelectContent, (i & 8192) != 0 ? null : str, (i & 16384) != 0 ? false : z, str2, (65536 & i) != 0 ? false : z2, (i & 131072) != 0 ? false : z3, z4, richText, genericButton, z5, z6);
    }

    public final Set<ReferralOfferDetailsViewData.ContactInfo> getSelectedContacts() {
        return this.selectedContacts;
    }

    public final List<ReferralOfferDetailsViewData.ContactInfo> getPendingInvites() {
        return this.pendingInvites;
    }

    public final ContactsAccessGranted.MultiSelectContent getMultiSelectContent() {
        return this.multiSelectContent;
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public final String getInviteContactCtaText() {
        return this.inviteContactCtaText;
    }

    public final boolean isSendingEmailInvite() {
        return this.isSendingEmailInvite;
    }

    public final boolean isSendingSmsInvite() {
        return this.isSendingSmsInvite;
    }

    public final boolean isMultiSelectContactMember() {
        return this.isMultiSelectContactMember;
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
    /* JADX WARN: Multi-variable type inference failed */
    public ContactsAccessGrantedViewState(List<ReferralContact> list, ReferralOfferDetailsViewData.HeaderImage headerImageViewData, ReferralOfferDetailsViewData.TitleText titleText, ReferralOfferDetailsViewData.SubtitleText subtitleText, ReferralOfferDetailsViewData.SearchField searchField, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader, List<? extends ReferralOfferDetailsViewData.ContactItem> suggestedFriends, ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader2, List<? extends ReferralOfferDetailsViewData.ContactItem> allFriends, ReferralOfferDetailsViewData.ContactSectionHeader searchResultsSectionHeader, Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts, List<ReferralOfferDetailsViewData.ContactInfo> pendingInvites, ContactsAccessGranted.MultiSelectContent multiSelectContent, String str, boolean z, String inviteContactCtaText, boolean z2, boolean z3, boolean z4, RichText disclosureText, GenericButton genericButton, boolean z5, boolean z6) {
        super(null);
        Intrinsics.checkNotNullParameter(headerImageViewData, "headerImageViewData");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(searchField, "searchField");
        Intrinsics.checkNotNullParameter(suggestedFriends, "suggestedFriends");
        Intrinsics.checkNotNullParameter(allFriends, "allFriends");
        Intrinsics.checkNotNullParameter(searchResultsSectionHeader, "searchResultsSectionHeader");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
        Intrinsics.checkNotNullParameter(multiSelectContent, "multiSelectContent");
        Intrinsics.checkNotNullParameter(inviteContactCtaText, "inviteContactCtaText");
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        this.rawContacts = list;
        this.headerImageViewData = headerImageViewData;
        this.titleText = titleText;
        this.subtitleText = subtitleText;
        this.searchField = searchField;
        this.suggestedFriendsSectionHeader = contactSectionHeader;
        this.suggestedFriends = suggestedFriends;
        this.allFriendsSectionHeader = contactSectionHeader2;
        this.allFriends = allFriends;
        this.searchResultsSectionHeader = searchResultsSectionHeader;
        this.selectedContacts = selectedContacts;
        this.pendingInvites = pendingInvites;
        this.multiSelectContent = multiSelectContent;
        this.query = str;
        this.isSearching = z;
        this.inviteContactCtaText = inviteContactCtaText;
        this.isSendingEmailInvite = z2;
        this.isSendingSmsInvite = z3;
        this.isMultiSelectContactMember = z4;
        this.disclosureText = disclosureText;
        this.shareLinkButton = genericButton;
        this.isRhsg = z5;
        this.isWhatsAppInstalled = z6;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isBottomBarVisible() {
        if (this.isSearching) {
            return this.isMultiSelectContactMember && !this.selectedContacts.isEmpty();
        }
        return true;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public boolean isTopBarVisible() {
        return !this.isSearching;
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState
    public List<ReferralOfferDetailsViewData> getViewDataList() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (!this.isSearching) {
            arrayList.add(this.headerImageViewData);
            arrayList.add(new ReferralOfferDetailsViewData.Spacing(BentoSpacing.INSTANCE.m21598default().m21591getLargeD9Ej5fM(), null));
            arrayList.add(this.titleText);
            arrayList.add(this.subtitleText);
            arrayList.add(this.searchField);
        }
        String str3 = this.query;
        if (str3 != null && str3.length() != 0) {
            arrayList.add(this.searchResultsSectionHeader);
            List<ReferralContact> list = this.rawContacts;
            if (list != null) {
                arrayList.addAll(CreateSearchResults.createSearchResults(list, this.query, this.inviteContactCtaText));
            }
        }
        if (!this.suggestedFriends.isEmpty() && ((str2 = this.query) == null || str2.length() == 0)) {
            ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader = this.suggestedFriendsSectionHeader;
            if (contactSectionHeader != null) {
                arrayList.add(contactSectionHeader);
            }
            arrayList.addAll(this.suggestedFriends);
        }
        if (this.allFriends.isEmpty() || !((str = this.query) == null || str.length() == 0)) {
            return arrayList;
        }
        ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader2 = this.allFriendsSectionHeader;
        if (contactSectionHeader2 != null) {
            arrayList.add(contactSectionHeader2);
        }
        arrayList.addAll(this.allFriends);
        return arrayList;
    }
}
