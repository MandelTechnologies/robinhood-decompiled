package com.robinhood.android.referral.rewardoffers.referralOffer.details.util;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.models.contacts.ReferralContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CreateSearchResults.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, m3636d2 = {"createSearchResults", "", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "Lcom/robinhood/models/contacts/ReferralContact;", "query", "", "inviteContactCtaText", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.util.CreateSearchResultsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CreateSearchResults {
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c A[EDGE_INSN: B:44:0x007c->B:31:0x007c BREAK  A[LOOP:1: B:10:0x003b->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:10:0x003b->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<ReferralOfferDetailsViewData.ContactInfo> createSearchResults(List<ReferralContact> list, String str, String inviteContactCtaText) {
        boolean zContains$default;
        boolean zContains$default2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(inviteContactCtaText, "inviteContactCtaText");
        List listSplit$default = StringsKt.split$default((CharSequence) (str == null ? "" : str), new String[]{"\\s+"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            ReferralContact referralContact = (ReferralContact) it.next();
            Iterator it2 = listSplit$default.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                String str2 = (String) it2.next();
                String[] strArr = referralContact.displayNameTokens;
                if (strArr != null) {
                    zContains$default = false;
                    for (String str3 : strArr) {
                        zContains$default |= StringsKt.contains$default((CharSequence) str3, (CharSequence) str2, false, 2, (Object) null);
                    }
                } else {
                    zContains$default = false;
                }
                if (referralContact.usePhone()) {
                    String str4 = referralContact.phoneNumber;
                    zContains$default2 = str4 != null ? StringsKt.contains$default((CharSequence) str4, (CharSequence) str2, false, 2, (Object) null) : zContains$default;
                    if (zContains$default2 | zContains$default) {
                        break;
                    }
                } else {
                    String str5 = referralContact.email;
                    if (str5 != null) {
                        zContains$default2 = StringsKt.contains$default((CharSequence) str5, (CharSequence) str2, false, 2, (Object) null);
                    }
                    if (zContains$default2 | zContains$default) {
                    }
                }
            }
            if (z) {
                arrayList.add(referralContact);
            }
        }
        List listSorted = CollectionsKt.sorted(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSorted, 10));
        Iterator it3 = listSorted.iterator();
        while (it3.hasNext()) {
            arrayList2.add(ToContactInfo.toContactInfo((ReferralContact) it3.next(), false, inviteContactCtaText, str));
        }
        return arrayList2;
    }
}
