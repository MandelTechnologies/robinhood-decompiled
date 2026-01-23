package com.robinhood.android.referral.rewardoffers.referralOffer.details.util;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessDeniedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: Args.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a6\u0010\u0002\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"SHIMMERED_CONTACTS_COUNT", "", "toViewState", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Args;", "Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "contactsPermissionGranted", "", "isMultiSelectContactMember", "isRhsg", "isWhatsAppInstalled", "isFromArgs", "shareButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "getShareButton", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Args;)Lcom/robinhood/models/serverdriven/db/GenericButton;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ArgsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Args2 {
    private static final int SHIMMERED_CONTACTS_COUNT = 6;

    public static final ReferralOfferDetailsViewState toViewState(ReferralOfferDetailsFragment.Args args) {
        Intrinsics.checkNotNullParameter(args, "<this>");
        return toViewState(args.getDetails(), args.getContactsPermissionGranted(), args.isMultiSelectContactMember(), args.isRhsg(), args.isWhatsAppInstalled(), true);
    }

    public static /* synthetic */ ReferralOfferDetailsViewState toViewState$default(ReferralOfferDetails referralOfferDetails, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 16) != 0) {
            z5 = false;
        }
        return toViewState(referralOfferDetails, z, z2, z3, z4, z5);
    }

    public static final ReferralOfferDetailsViewState toViewState(ReferralOfferDetails referralOfferDetails, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(referralOfferDetails, "<this>");
        if (z && !referralOfferDetails.getShouldHideSystemContacts() && (!z3 || (z3 && !z5))) {
            ReferralOfferDetailsViewData.HeaderImage headerImage = new ReferralOfferDetailsViewData.HeaderImage(referralOfferDetails.getHeaderImage().getUrl(), referralOfferDetails.getHeaderImage().getAspectRatio());
            ReferralOfferDetailsViewData.TitleText titleText = new ReferralOfferDetailsViewData.TitleText(referralOfferDetails.getContactsAccessGranted().getHeader().getTitle(), false);
            ReferralOfferDetailsViewData.SubtitleText subtitleText = new ReferralOfferDetailsViewData.SubtitleText(referralOfferDetails.getContactsAccessGranted().getHeader().getSubtitle(), null);
            ReferralOfferDetailsViewData.SearchField searchField = new ReferralOfferDetailsViewData.SearchField(referralOfferDetails.getContactsAccessGranted().getHeader().getSearchContactsPlaceholder(), false, 2, null);
            List listEmptyList = CollectionsKt.emptyList();
            PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(0, 6);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
            Iterator<Integer> it = primitiveRanges2.iterator();
            while (it.hasNext()) {
                ((PrimitiveIterators6) it).nextInt();
                arrayList.add(new ReferralOfferDetailsViewData.ShimmeredContactInfo(0, 1, null));
            }
            return new ContactsAccessGrantedViewState(null, headerImage, titleText, subtitleText, searchField, null, listEmptyList, null, arrayList, new ReferralOfferDetailsViewData.ContactSectionHeader(StringResource.INSTANCE.invoke(referralOfferDetails.getContactsAccessGranted().getSearchResultsSectionTitle())), null, null, referralOfferDetails.getContactsAccessGranted().getMultiSelectContent(), null, false, referralOfferDetails.getContactsAccessGranted().getInviteContactCta(), false, false, z2, referralOfferDetails.getContactsAccessGranted().getFooter().getDisclosureText(), (GenericButton) CollectionsKt.firstOrNull((List) referralOfferDetails.getContactsAccessGranted().getFooter().getSecondaryButtons()), z3, z4, 224417, null);
        }
        return new ContactsAccessDeniedViewState(new ReferralOfferDetailsViewData.HeaderImage(referralOfferDetails.getHeaderImage().getUrl(), referralOfferDetails.getHeaderImage().getAspectRatio()), new ReferralOfferDetailsViewData.TitleText(referralOfferDetails.getContactsAccessDenied().getHeader().getTitle(), true), new ReferralOfferDetailsViewData.SubtitleText(referralOfferDetails.getContactsAccessDenied().getHeader().getSubtitle(), referralOfferDetails.getContactsAccessDenied().getHeader().getAdditionalInfoText()), referralOfferDetails.getContactsAccessDenied().getFooter().getInviteContacts(), referralOfferDetails.getShouldHideSystemContacts(), false, referralOfferDetails.getContactsAccessDenied().getFooter().getDisclosureText(), (GenericButton) CollectionsKt.firstOrNull((List) referralOfferDetails.getContactsAccessDenied().getFooter().getSecondaryButtons()), z3, z4);
    }

    public static final GenericButton getShareButton(ReferralOfferDetailsFragment.Args args) {
        Intrinsics.checkNotNullParameter(args, "<this>");
        if (args.getContactsPermissionGranted()) {
            return (GenericButton) CollectionsKt.firstOrNull((List) args.getDetails().getContactsAccessGranted().getFooter().getSecondaryButtons());
        }
        return (GenericButton) CollectionsKt.firstOrNull((List) args.getDetails().getContactsAccessDenied().getFooter().getSecondaryButtons());
    }
}
