package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.dao.AchRelationshipDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AchRelationship2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: AchRelationshipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u0017J \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0017J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0\u0017J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001aJ\u0010\u0010'\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020\"J$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0012J*\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0\u00112\b\u00105\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00120\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AchRelationshipDao;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AchRelationshipDao;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/prefs/StringPreference;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiAchRelationship;", "", "getAchRelationshipsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "getAchRelationship", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/AchRelationship;", "achRelationshipId", "Ljava/util/UUID;", "getLinkedAchRelationships", "", "getLinkedRelationshipsByState", "states", "", "Lcom/robinhood/models/api/ApiAchRelationship$State;", "getHasReachedLinkedAchRelationshipsLimit", "", "getDefaultAchRelationship", "Lcom/robinhood/utils/Optional;", "setDefaultAchRelationship", "id", "refresh", "force", "createAchRelationship", "routingNumber", "", "accountNumber", "accountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "unlinkAchRelationship", "achRhId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAchRelationship", "apiAchRelationship", "mapRelationshipToDefaultRelationship", "defaultId", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class AchRelationshipStore extends Store {
    private final AccountProvider accountProvider;
    private final Cashier cashier;
    private final AchRelationshipDao dao;
    private final StringPreference defaultAchRelationshipPref;
    private final PaginatedEndpoint<Unit, ApiAchRelationship> getAchRelationshipsEndpoint;
    private final Function1<ApiAchRelationship, Unit> saveAction;
    private final UserStore userStore;

    /* compiled from: AchRelationshipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AchRelationshipStore", m3645f = "AchRelationshipStore.kt", m3646l = {115}, m3647m = "unlinkAchRelationship")
    /* renamed from: com.robinhood.librobinhood.data.store.AchRelationshipStore$unlinkAchRelationship$1 */
    /* loaded from: classes13.dex */
    static final class C335351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C335351(Continuation<? super C335351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AchRelationshipStore.this.unlinkAchRelationship(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchRelationshipStore(StoreBundle storeBundle, AchRelationshipDao dao, AccountProvider accountProvider, UserStore userStore, Cashier cashier, @DefaultAchRelationship StringPreference defaultAchRelationshipPref) {
        super(storeBundle, AchRelationship.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        this.dao = dao;
        this.accountProvider = accountProvider;
        this.userStore = userStore;
        this.cashier = cashier;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiAchRelationship, Unit>() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiAchRelationship apiAchRelationship) {
                m22582invoke(apiAchRelationship);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22582invoke(ApiAchRelationship apiAchRelationship) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    this.dao.insert((AchRelationshipDao) AchRelationship2.toDbModel(apiAchRelationship));
                } catch (IllegalStateException e) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
        this.getAchRelationshipsEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new AchRelationshipStore2(this, null), getLogoutKillswitch(), new AchRelationshipStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<AchRelationship> getAchRelationship(UUID achRelationshipId) {
        Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAchRelationship(achRelationshipId))));
    }

    public final Observable<List<AchRelationship>> getLinkedAchRelationships() {
        return asObservable(takeWhileLoggedIn(this.dao.getLinkedAchRelationships()));
    }

    public final Observable<List<AchRelationship>> getLinkedRelationshipsByState(Set<? extends ApiAchRelationship.State> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        return asObservable(takeWhileLoggedIn(this.dao.getLinkedRelationshipsByState(states)));
    }

    public final Observable<Boolean> getHasReachedLinkedAchRelationshipsLimit() {
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getHasReachedAchRelationshipLimit())));
    }

    public final Observable<Optional<AchRelationship>> getDefaultAchRelationship() {
        String str = this.defaultAchRelationshipPref.get();
        UUID uuidFromString = str != null ? UUID.fromString(str) : null;
        Observable<List<AchRelationship>> linkedAchRelationships = getLinkedAchRelationships();
        final Function1<List<AchRelationship>, Optional<AchRelationship>> function1MapRelationshipToDefaultRelationship = mapRelationshipToDefaultRelationship(uuidFromString);
        Observable map = linkedAchRelationships.map(new Function(function1MapRelationshipToDefaultRelationship) { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStoreKt$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1MapRelationshipToDefaultRelationship, "function");
                this.function = function1MapRelationshipToDefaultRelationship;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void setDefaultAchRelationship(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.defaultAchRelationshipPref.set(id.toString());
    }

    public static /* synthetic */ void refresh$default(AchRelationshipStore achRelationshipStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        achRelationshipStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getAchRelationshipsEndpoint, force);
    }

    public final Observable<ApiAchRelationship> createAchRelationship(final String routingNumber, final String accountNumber, final ApiAchRelationship.BankAccountType accountType) {
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountProvider.refresh(false);
        this.userStore.refresh(false);
        Observable<ApiAchRelationship> observableSubscribeOn = this.accountProvider.streamIndividualAccount().take(1L).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStore.createAchRelationship.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiAchRelationship> apply(final Account acct) {
                Intrinsics.checkNotNullParameter(acct, "acct");
                Observable<User> observableTake = AchRelationshipStore.this.userStore.getUser().take(1L);
                final AchRelationshipStore achRelationshipStore = AchRelationshipStore.this;
                final String str = routingNumber;
                final String str2 = accountNumber;
                final ApiAchRelationship.BankAccountType bankAccountType = accountType;
                return observableTake.flatMapSingle(new Function() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStore.createAchRelationship.1.1

                    /* compiled from: AchRelationshipStore.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiAchRelationship;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AchRelationshipStore$createAchRelationship$1$1$1", m3645f = "AchRelationshipStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.librobinhood.data.store.AchRelationshipStore$createAchRelationship$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C506571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAchRelationship>, Object> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ ApiAchRelationship.BankAccountType $accountType;
                        final /* synthetic */ Account $acct;
                        final /* synthetic */ String $routingNumber;
                        final /* synthetic */ User $user;
                        int label;
                        final /* synthetic */ AchRelationshipStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C506571(AchRelationshipStore achRelationshipStore, Account account, String str, String str2, ApiAchRelationship.BankAccountType bankAccountType, User user, Continuation<? super C506571> continuation) {
                            super(2, continuation);
                            this.this$0 = achRelationshipStore;
                            this.$acct = account;
                            this.$routingNumber = str;
                            this.$accountNumber = str2;
                            this.$accountType = bankAccountType;
                            this.$user = user;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C506571(this.this$0, this.$acct, this.$routingNumber, this.$accountNumber, this.$accountType, this.$user, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAchRelationship> continuation) {
                            return ((C506571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            Cashier cashier = this.this$0.cashier;
                            String url = this.$acct.getUrl();
                            String str = this.$routingNumber;
                            String str2 = this.$accountNumber;
                            ApiAchRelationship.BankAccountType bankAccountType = this.$accountType;
                            String fullName = this.$user.getFullName();
                            this.label = 1;
                            Object objCreateAchRelationship = cashier.createAchRelationship(url, str, str2, bankAccountType, fullName, this);
                            return objCreateAchRelationship == coroutine_suspended ? coroutine_suspended : objCreateAchRelationship;
                        }
                    }

                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends ApiAchRelationship> apply(User user) {
                        Intrinsics.checkNotNullParameter(user, "user");
                        AchRelationshipStore achRelationshipStore2 = achRelationshipStore;
                        return RxFactory.DefaultImpls.rxSingle$default(achRelationshipStore2, null, new C506571(achRelationshipStore2, acct, str, str2, bankAccountType, user, null), 1, null);
                    }
                });
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStore.createAchRelationship.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiAchRelationship apiAchRelationship) {
                Function1 function1 = AchRelationshipStore.this.saveAction;
                Intrinsics.checkNotNull(apiAchRelationship);
                function1.invoke(apiAchRelationship);
                AchRelationshipStore.this.refresh(true);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unlinkAchRelationship(UUID uuid, Continuation<? super Unit> continuation) {
        C335351 c335351;
        UUID uuidFromString;
        if (continuation instanceof C335351) {
            c335351 = (C335351) continuation;
            int i = c335351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c335351.label = i - Integer.MIN_VALUE;
            } else {
                c335351 = new C335351(continuation);
            }
        }
        Object obj = c335351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c335351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.defaultAchRelationshipPref.get();
            uuidFromString = str != null ? UUID.fromString(str) : null;
            Cashier cashier = this.cashier;
            c335351.L$0 = uuid;
            c335351.L$1 = uuidFromString;
            c335351.label = 1;
            if (cashier.unlinkAchRelationship(uuid, c335351) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UUID uuid2 = (UUID) c335351.L$1;
            UUID uuid3 = (UUID) c335351.L$0;
            ResultKt.throwOnFailure(obj);
            uuidFromString = uuid2;
            uuid = uuid3;
        }
        refresh(true);
        if (Intrinsics.areEqual(uuid, uuidFromString)) {
            this.defaultAchRelationshipPref.delete();
        }
        return Unit.INSTANCE;
    }

    public final void saveAchRelationship(ApiAchRelationship apiAchRelationship) {
        Intrinsics.checkNotNullParameter(apiAchRelationship, "apiAchRelationship");
        this.saveAction.invoke(apiAchRelationship);
        refresh(true);
        setDefaultAchRelationship(apiAchRelationship.getId());
    }

    private final Function1<List<AchRelationship>, Optional<AchRelationship>> mapRelationshipToDefaultRelationship(final UUID defaultId) {
        return new Function1() { // from class: com.robinhood.librobinhood.data.store.AchRelationshipStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchRelationshipStore.mapRelationshipToDefaultRelationship$lambda$6(defaultId, this, (List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Optional mapRelationshipToDefaultRelationship$lambda$6(UUID uuid, AchRelationshipStore achRelationshipStore, List achRelationships) {
        AchRelationship achRelationship;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        List list = achRelationships;
        Iterator it = list.iterator();
        while (true) {
            achRelationship = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((AchRelationship) next).getId(), uuid)) {
                break;
            }
        }
        AchRelationship achRelationship2 = (AchRelationship) next;
        if (achRelationship2 == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((AchRelationship) next2).getVerified()) {
                    break;
                }
            }
            AchRelationship achRelationship3 = (AchRelationship) next2;
            if (achRelationship3 != null) {
                achRelationshipStore.setDefaultAchRelationship(achRelationship3.getId());
                achRelationship = achRelationship3;
            }
        } else {
            achRelationship = achRelationship2;
        }
        return Optional3.asOptional(achRelationship);
    }
}
