package com.robinhood.android.rhy.referral.contact;

import com.robinhood.models.contacts.ReferralContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhyReferralContactListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0002¨\u0006\b"}, m3636d2 = {"reduce", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "", "Lcom/robinhood/models/contacts/ReferralContact;", "query", "", "toContactRow", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListStateProviderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralContactListStateProvider2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079 A[EDGE_INSN: B:52:0x0079->B:32:0x0079 BREAK  A[LOOP:1: B:11:0x0037->B:53:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:1: B:11:0x0037->B:53:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImmutableList<RhyReferralContactRow> reduce(List<ReferralContact> list, String str) {
        boolean z;
        boolean zContains$default;
        boolean zContains$default2;
        if (str == null || str.length() == 0) {
            List<ReferralContact> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toContactRow((ReferralContact) it.next()));
            }
            return extensions2.toImmutableList(arrayList);
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"\\s+"}, false, 0, 6, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            ReferralContact referralContact = (ReferralContact) obj;
            Iterator it2 = listSplit$default.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                String str2 = (String) it2.next();
                String[] strArr = referralContact.displayNameTokens;
                z = false;
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
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(toContactRow((ReferralContact) it3.next()));
        }
        return extensions2.toImmutableList(arrayList3);
    }

    private static final RhyReferralContactRow toContactRow(ReferralContact referralContact) {
        String str;
        String strValidDisplayName = referralContact.validDisplayName();
        if (referralContact.usePhone()) {
            str = referralContact.phoneNumberForDisplay;
        } else {
            str = referralContact.email;
        }
        if (str == null) {
            str = "";
        }
        return new RhyReferralContactRow(referralContact, strValidDisplayName, str);
    }
}
