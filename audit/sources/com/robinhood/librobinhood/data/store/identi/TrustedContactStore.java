package com.robinhood.librobinhood.data.store.identi;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrustedContactStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u0010J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/TrustedContactStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/store/StoreBundle;)V", "trustedContactRemovedPublisher", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "refreshPublisher", "cachedTrustedContactObs", "Lio/reactivex/Observable;", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "streamTrustedContact", "Lcom/robinhood/utils/Optional;", "submitTrustedContact", "Lio/reactivex/Single;", "firstName", "", "lastName", "email", "phoneNumber", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "deleteTrustedContact", "Lio/reactivex/Completable;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TrustedContactStore extends Store {
    private final Observable<ApiTrustedContact> cachedTrustedContactObs;
    private final Identi identi;
    private final PersistentCacheManager persistentCacheManager;
    private final PublishSubject<Unit> refreshPublisher;
    private final PublishSubject<Unit> trustedContactRemovedPublisher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactStore(Identi identi2, PersistentCacheManager persistentCacheManager, StoreBundle storeBundle) {
        super(storeBundle, ApiTrustedContact.INSTANCE);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identi = identi2;
        this.persistentCacheManager = persistentCacheManager;
        PublishSubject<Unit> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.trustedContactRemovedPublisher = publishSubjectCreate;
        PublishSubject<Unit> publishSubjectCreate2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create(...)");
        this.refreshPublisher = publishSubjectCreate2;
        this.cachedTrustedContactObs = persistentCacheManager.getTrustedContact();
    }

    public final Observable<Optional<ApiTrustedContact>> streamTrustedContact() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Observable<Optional<ApiTrustedContact>> observableTakeUntil = this.cachedTrustedContactObs.repeatWhen(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.streamTrustedContact.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TrustedContactStore.this.refreshPublisher;
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.streamTrustedContact.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiTrustedContact apiTrustedContact) {
                objectRef.element = apiTrustedContact;
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.streamTrustedContact.3
            @Override // io.reactivex.functions.Function
            public final Optional<ApiTrustedContact> apply(ApiTrustedContact it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.streamTrustedContact.4
            @Override // io.reactivex.functions.Function
            public final Optional<ApiTrustedContact> apply(Throwable err) {
                Intrinsics.checkNotNullParameter(err, "err");
                Integer httpStatusCode = Throwables.getHttpStatusCode(err);
                if (httpStatusCode != null && httpStatusCode.intValue() == 404) {
                    TrustedContactStore.this.persistentCacheManager.invalidate(PersistentCacheManager.Keys.TRUSTED_CONTACT);
                    return Optional.INSTANCE.m2972of(null);
                }
                return Optional.INSTANCE.m2972of(objectRef.element);
            }
        }).mergeWith(this.trustedContactRemovedPublisher.map(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.streamTrustedContact.5
            @Override // io.reactivex.functions.Function
            public final Optional apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(null);
            }
        })).replay(1).refCount().distinctUntilChanged().takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Single<ApiTrustedContact> submitTrustedContact(String firstName, String lastName, String email, String phoneNumber, UiAddress address) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Single<ApiTrustedContact> singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C348511(new ApiTrustedContact(firstName, lastName, email, phoneNumber, address != null ? address.toApiAddress() : null), null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.submitTrustedContact.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiTrustedContact apiTrustedContact) {
                TrustedContactStore.this.refreshPublisher.onNext(Unit.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    /* compiled from: TrustedContactStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.TrustedContactStore$submitTrustedContact$1", m3645f = "TrustedContactStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.TrustedContactStore$submitTrustedContact$1 */
    static final class C348511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiTrustedContact>, Object> {
        final /* synthetic */ ApiTrustedContact $trustedContact;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348511(ApiTrustedContact apiTrustedContact, Continuation<? super C348511> continuation) {
            super(2, continuation);
            this.$trustedContact = apiTrustedContact;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrustedContactStore.this.new C348511(this.$trustedContact, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiTrustedContact> continuation) {
            return ((C348511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Identi identi2 = TrustedContactStore.this.identi;
            ApiTrustedContact apiTrustedContact = this.$trustedContact;
            this.label = 1;
            Object objSubmitTrustedContact = identi2.submitTrustedContact(apiTrustedContact, this);
            return objSubmitTrustedContact == coroutine_suspended ? coroutine_suspended : objSubmitTrustedContact;
        }
    }

    /* compiled from: TrustedContactStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.TrustedContactStore$deleteTrustedContact$1", m3645f = "TrustedContactStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.TrustedContactStore$deleteTrustedContact$1 */
    static final class C348441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C348441(Continuation<? super C348441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrustedContactStore.this.new C348441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = TrustedContactStore.this.identi;
                this.label = 1;
                if (identi2.deleteTrustedContact(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable deleteTrustedContact() {
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348441(null), 1, null).doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.identi.TrustedContactStore.deleteTrustedContact.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                TrustedContactStore.this.persistentCacheManager.invalidate(PersistentCacheManager.Keys.TRUSTED_CONTACT);
                TrustedContactStore.this.trustedContactRemovedPublisher.onNext(Unit.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }
}
