package com.robinhood.librobinhood.data.store;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.util.SparseArray;
import androidx.core.util.SparseArray2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.util.extensions.Cursors;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.util.IsPhoneNumberFromExcludedArea;
import com.robinhood.models.api.ExcludePatternsResponse;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.contacts.ReferralContactData;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: ContactsStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0014JP\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\f0\u0014\"\b\b\u0000\u0010\u0016*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u00160\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ContactsStore;", "Lcom/robinhood/store/Store;", "contentResolver", "Landroid/content/ContentResolver;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Landroid/content/ContentResolver;Lcom/robinhood/referral/api/ContactsApi;Lcom/robinhood/store/StoreBundle;)V", "contactsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/robinhood/models/contacts/ReferralContact;", "kotlin.jvm.PlatformType", "getContactRecommendations", "Lio/reactivex/Single;", "refresh", "", "getContacts", "Lio/reactivex/Observable;", "loadContactData", "T", "Lcom/robinhood/models/contacts/ReferralContactData;", "loader", "Lkotlin/Function1;", "Landroid/database/Cursor;", "mapper", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class ContactsStore extends Store {
    private final ContactsApi contactsApi;
    private final BehaviorRelay<List<ReferralContact>> contactsRelay;
    private final ContentResolver contentResolver;

    public abstract Single<List<ReferralContact>> getContactRecommendations();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsStore(ContentResolver contentResolver, ContactsApi contactsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.contentResolver = contentResolver;
        this.contactsApi = contactsApi;
        BehaviorRelay<List<ReferralContact>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.contactsRelay = behaviorRelayCreate;
    }

    @SuppressLint({"CheckResult"})
    public final void refresh() {
        Observable observableLoadContactData = loadContactData(this.contentResolver, new ContactsStore$refresh$rawData$1(ReferralContactData.Raw.INSTANCE), ContactsStore$refresh$rawData$2.INSTANCE);
        Observable observableLoadContactData2 = loadContactData(this.contentResolver, new ContactsStore$refresh$structuredName$1(ReferralContactData.StructuredName.INSTANCE), ContactsStore$refresh$structuredName$2.INSTANCE);
        Observable observableLoadContactData3 = loadContactData(this.contentResolver, new ContactsStore$refresh$phoneNumber$1(ReferralContactData.Phone.INSTANCE), ContactsStore$refresh$phoneNumber$2.INSTANCE);
        Observable observableLoadContactData4 = loadContactData(this.contentResolver, new ContactsStore$refresh$email$1(ReferralContactData.Email.INSTANCE), ContactsStore$refresh$email$2.INSTANCE);
        Observable observableOnErrorReturnItem = RxFactory.DefaultImpls.rxSingle$default(this, null, new ContactsStore$refresh$excludePatternsObs$1(this, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.ContactsStore$refresh$excludePatternsObs$2
            @Override // io.reactivex.functions.Function
            public final List<String> apply(ExcludePatternsResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getExcludePatterns();
            }
        }).toObservable().onErrorReturnItem(CollectionsKt.emptyList());
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(observableLoadContactData, observableLoadContactData2, observableLoadContactData3, observableLoadContactData4, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.librobinhood.data.store.ContactsStore$refresh$$inlined$combineLatest$1
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                List<ReferralContactData> listFlatten = CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{(List) t1, (List) t2, (List) t3, (List) t4}));
                SparseArray sparseArray = new SparseArray();
                for (ReferralContactData referralContactData : listFlatten) {
                    int i = referralContactData.contactId;
                    Object referralContact = sparseArray.get(i);
                    if (referralContact == null) {
                        referralContact = new ReferralContact(referralContactData.contactId);
                        sparseArray.put(i, referralContact);
                    }
                    referralContactData.copyData((ReferralContact) referralContact);
                }
                return (R) SequencesKt.toList(SequencesKt.asSequence(SparseArray2.valueIterator(sparseArray)));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable map = observableCombineLatest.zipWith(observableOnErrorReturnItem, new BiFunction() { // from class: com.robinhood.librobinhood.data.store.ContactsStore.refresh.2
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<List<ReferralContact>, List<String>> apply(List<ReferralContact> contacts, List<String> excludePatterns) {
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                Intrinsics.checkNotNullParameter(excludePatterns, "excludePatterns");
                return Tuples4.m3642to(contacts, excludePatterns);
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.ContactsStore.refresh.3
            @Override // io.reactivex.functions.Function
            public final List<ReferralContact> apply(Tuples2<? extends List<ReferralContact>, ? extends List<String>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                List<ReferralContact> listComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(listComponent1, "component1(...)");
                List<String> listComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(listComponent2, "component2(...)");
                List<String> list = listComponent2;
                List<ReferralContact> list2 = listComponent1;
                for (ReferralContact referralContact : list2) {
                    if (IsPhoneNumberFromExcludedArea.isPhoneNumberExcluded(referralContact.phoneNumber, list)) {
                        referralContact.phoneNumber = null;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if (((ReferralContact) t).validForDisplay()) {
                        arrayList.add(t);
                    }
                }
                return CollectionsKt.sorted(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(map);
        final BehaviorRelay<List<ReferralContact>> behaviorRelay = this.contactsRelay;
        observableObserveOnMainThread.subscribe(new Consumer() { // from class: com.robinhood.librobinhood.data.store.ContactsStore.refresh.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<ReferralContact> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                behaviorRelay.accept(p0);
            }
        });
    }

    public final Observable<List<ReferralContact>> getContacts() {
        return this.contactsRelay;
    }

    private final <T extends ReferralContactData> Observable<List<T>> loadContactData(final ContentResolver contentResolver, final Function1<? super ContentResolver, ? extends Cursor> loader, final Function1<? super Cursor, ? extends T> mapper) {
        Observable<List<T>> observableSubscribeOn = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.librobinhood.data.store.ContactsStore.loadContactData.1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<List<T>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                emitter.onNext(Cursors.toList(loader.invoke(contentResolver), mapper));
                emitter.onComplete();
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }
}
