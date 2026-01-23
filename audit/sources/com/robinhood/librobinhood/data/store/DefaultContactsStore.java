package com.robinhood.librobinhood.data.store;

import android.content.ContentResolver;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.experiments.AcqSocialGraphDeprecationKillswitch;
import com.robinhood.models.api.ContactRecommendations;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultContactsStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DefaultContactsStore;", "Lcom/robinhood/librobinhood/data/store/ContactsStore;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "contentResolver", "Landroid/content/ContentResolver;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/referral/api/ContactsApi;Landroid/content/ContentResolver;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "getContactRecommendations", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/contacts/ReferralContact;", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DefaultContactsStore extends ContactsStore {
    private final ContactsApi contactsApi;
    private final ExperimentsStore experimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContactsStore(ContactsApi contactsApi, ContentResolver contentResolver, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(contentResolver, contactsApi, storeBundle);
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.contactsApi = contactsApi;
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.librobinhood.data.store.ContactsStore
    public Single<List<ReferralContact>> getContactRecommendations() {
        Single<List<ReferralContact>> singleFlatMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AcqSocialGraphDeprecationKillswitch.INSTANCE}, false, null, 6, null).firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DefaultContactsStore.getContactRecommendations.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends List<ReferralContact>> apply(Boolean socialGraphKillswitch) {
                Intrinsics.checkNotNullParameter(socialGraphKillswitch, "socialGraphKillswitch");
                if (!socialGraphKillswitch.booleanValue()) {
                    DefaultContactsStore defaultContactsStore = DefaultContactsStore.this;
                    Single<R> map = Single.zip(RxFactory.DefaultImpls.rxSingle$default(defaultContactsStore, null, new AnonymousClass1(defaultContactsStore, null), 1, null), DefaultContactsStore.this.getContacts().firstOrError(), new BiFunction() { // from class: com.robinhood.librobinhood.data.store.DefaultContactsStore.getContactRecommendations.1.2
                        @Override // io.reactivex.functions.BiFunction
                        public final Tuples2<ContactRecommendations, List<ReferralContact>> apply(ContactRecommendations p0, List<ReferralContact> p1) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            Intrinsics.checkNotNullParameter(p1, "p1");
                            return new Tuples2<>(p0, p1);
                        }
                    }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DefaultContactsStore.getContactRecommendations.1.3
                        @Override // io.reactivex.functions.Function
                        public final List<ReferralContact> apply(Tuples2<ContactRecommendations, ? extends List<ReferralContact>> tuples2) {
                            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                            ContactRecommendations contactRecommendationsComponent1 = tuples2.component1();
                            List<ReferralContact> listComponent2 = tuples2.component2();
                            ArrayList arrayList = new ArrayList();
                            for (ContactRecommendations.Recommendation recommendation : contactRecommendationsComponent1.getRecommendations()) {
                                String key = recommendation.getKey();
                                boolean z = false;
                                for (ReferralContact referralContact : listComponent2) {
                                    Iterator<String> it = referralContact.emails.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        if (Intrinsics.areEqual(key, it.next())) {
                                            referralContact.numberOfContactsOnRobinhood = Integer.valueOf(recommendation.getCount());
                                            arrayList.add(referralContact);
                                            z = true;
                                            break;
                                        }
                                    }
                                    Iterator<String> it2 = referralContact.phoneNumbers.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if (Intrinsics.areEqual(key, it2.next())) {
                                            referralContact.numberOfContactsOnRobinhood = Integer.valueOf(recommendation.getCount());
                                            arrayList.add(referralContact);
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            return arrayList;
                        }
                    });
                    Intrinsics.checkNotNull(map);
                    return map;
                }
                Single singleJust = Single.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }

            /* compiled from: DefaultContactsStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ContactRecommendations;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DefaultContactsStore$getContactRecommendations$1$1", m3645f = "DefaultContactsStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.DefaultContactsStore$getContactRecommendations$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ContactRecommendations>, Object> {
                int label;
                final /* synthetic */ DefaultContactsStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DefaultContactsStore defaultContactsStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = defaultContactsStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContactRecommendations> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    ContactsApi contactsApi = this.this$0.contactsApi;
                    this.label = 1;
                    Object contactRecommendations = contactsApi.getContactRecommendations(this);
                    return contactRecommendations == coroutine_suspended ? coroutine_suspended : contactRecommendations;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }
}
