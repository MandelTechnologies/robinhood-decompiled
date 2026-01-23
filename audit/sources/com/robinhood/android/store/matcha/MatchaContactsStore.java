package com.robinhood.android.store.matcha;

import android.content.ContentResolver;
import com.robinhood.librobinhood.data.store.ContactsStore;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MatchaContactsStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaContactsStore;", "Lcom/robinhood/librobinhood/data/store/ContactsStore;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "contentResolver", "Landroid/content/ContentResolver;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/referral/api/ContactsApi;Landroid/content/ContentResolver;Lcom/robinhood/store/StoreBundle;)V", "searchContacts", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/contacts/ReferralContact;", "query", "", "getContactRecommendations", "Lio/reactivex/Single;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaContactsStore extends ContactsStore {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaContactsStore(ContactsApi contactsApi, ContentResolver contentResolver, StoreBundle storeBundle) {
        super(contentResolver, contactsApi, storeBundle);
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
    }

    public final Observable<List<ReferralContact>> searchContacts(final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Observable map = getContacts().map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaContactsStore.searchContacts.1
            @Override // io.reactivex.functions.Function
            public final List<ReferralContact> apply(List<ReferralContact> contacts) {
                boolean z;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                String str = query;
                ArrayList arrayList = new ArrayList();
                for (T t : contacts) {
                    ReferralContact referralContact = (ReferralContact) t;
                    String[] strArr = referralContact.displayNameTokens;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    String str3 = referralContact.phoneNumber;
                    boolean zContains$default = str3 != null ? StringsKt.contains$default((CharSequence) str3, (CharSequence) str, false, 2, (Object) null) : false;
                    String str4 = referralContact.email;
                    if (z | zContains$default | (str4 != null ? StringsKt.contains$default((CharSequence) str4, (CharSequence) str, false, 2, (Object) null) : false)) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.robinhood.librobinhood.data.store.ContactsStore
    public Single<List<ReferralContact>> getContactRecommendations() {
        throw new Standard2("Unimplemented");
    }
}
