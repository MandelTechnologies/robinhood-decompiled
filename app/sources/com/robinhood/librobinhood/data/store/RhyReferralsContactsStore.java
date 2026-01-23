package com.robinhood.librobinhood.data.store;

import android.content.ContentResolver;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsContactsStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyReferralsContactsStore;", "Lcom/robinhood/librobinhood/data/store/ContactsStore;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "contentResolver", "Landroid/content/ContentResolver;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/referral/api/ContactsApi;Landroid/content/ContentResolver;Lcom/robinhood/store/StoreBundle;)V", "getContactRecommendations", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/contacts/ReferralContact;", "lib-store-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyReferralsContactsStore extends ContactsStore {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralsContactsStore(ContactsApi contactsApi, ContentResolver contentResolver, StoreBundle storeBundle) {
        super(contentResolver, contactsApi, storeBundle);
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
    }

    @Override // com.robinhood.librobinhood.data.store.ContactsStore
    public Single<List<ReferralContact>> getContactRecommendations() {
        Single<List<ReferralContact>> singleJust = Single.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }
}
