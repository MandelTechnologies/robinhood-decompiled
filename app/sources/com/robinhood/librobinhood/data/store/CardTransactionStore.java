package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiCardTransactions;
import com.robinhood.models.api.minerva.ApiCardTransactions4;
import com.robinhood.models.dao.CardTransactionDao;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: CardTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\fH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\fH\u0086@¢\u0006\u0004\b$\u0010#J#\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0)0%2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)¢\u0006\u0004\b+\u0010,J1\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0)0%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b.\u0010/J=\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0)0%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u00102J'\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0)0%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f03¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010=\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0012\u0004\u0012\u00020\u0015088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:¨\u0006>"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/CardTransactionDao;", "dao", "Lcom/robinhood/api/retrofit/Minerva;", "minerva", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CardTransactionDao;Lcom/robinhood/api/retrofit/Minerva;)V", "", "keyPrefix", "Ljava/util/UUID;", "id", "", "force", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/models/api/minerva/ApiCardTransaction;", "", "createRequest", "", "refreshSingle", "(Ljava/lang/String;Ljava/util/UUID;ZLkotlin/jvm/functions/Function2;)V", "Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;", "status", "refresh", "(Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;Ljava/util/UUID;Z)V", "j$/time/Instant", "initiatedAtLte", "initiatedAtGte", "refreshDisputableTransactions", "(ZLj$/time/Instant;Lj$/time/Instant;)V", "declinedTransactionId", "markFraudulent", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markNotFraudulent", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/CardTransaction;", "streamTransaction", "(Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;Ljava/util/UUID;)Lio/reactivex/Observable;", "", "ids", "streamTransactions", "(Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;Ljava/util/List;)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "streamDisputableTransactions", "(Lj$/time/Instant;Lj$/time/Instant;)Lio/reactivex/Observable;", "duplicateOf", "streamDuplicateDisputableTransactions", "(Lj$/time/Instant;Lj$/time/Instant;Ljava/util/UUID;)Lio/reactivex/Observable;", "", "streamSettledTransactionSet", "(Ljava/util/Set;)Lio/reactivex/Observable;", "Lcom/robinhood/models/dao/CardTransactionDao;", "Lcom/robinhood/api/retrofit/Minerva;", "Lkotlin/Function1;", "saveAction", "Lkotlin/jvm/functions/Function1;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiSettledCardTransaction;", "settledPaginatedSaveAction", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CardTransactionStore extends Store {
    private final CardTransactionDao dao;
    private final Minerva minerva;
    private final Function1<ApiCardTransactions, Unit> saveAction;
    private final Function1<PaginatedResult<ApiCardTransactions4>, Unit> settledPaginatedSaveAction;

    /* compiled from: CardTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTransaction.Status.values().length];
            try {
                iArr[CardTransaction.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTransaction.Status.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTransaction.Status.DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CardTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardTransactionStore", m3645f = "CardTransactionStore.kt", m3646l = {60}, m3647m = "markFraudulent")
    /* renamed from: com.robinhood.librobinhood.data.store.CardTransactionStore$markFraudulent$1 */
    static final class C336331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C336331(Continuation<? super C336331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardTransactionStore.this.markFraudulent(null, this);
        }
    }

    /* compiled from: CardTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardTransactionStore", m3645f = "CardTransactionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "markNotFraudulent")
    /* renamed from: com.robinhood.librobinhood.data.store.CardTransactionStore$markNotFraudulent$1 */
    static final class C336341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C336341(Continuation<? super C336341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardTransactionStore.this.markNotFraudulent(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionStore(StoreBundle storeBundle, final CardTransactionDao dao, Minerva minerva) {
        super(storeBundle, CardTransaction.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.dao = dao;
        this.minerva = minerva;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiCardTransactions, Unit>() { // from class: com.robinhood.librobinhood.data.store.CardTransactionStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCardTransactions apiCardTransactions) {
                m22597invoke(apiCardTransactions);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22597invoke(ApiCardTransactions apiCardTransactions) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiCardTransactions);
                        return;
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
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        final LogoutKillswitch logoutKillswitch2 = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase2 = ((Store) this).roomDatabase;
        this.settledPaginatedSaveAction = new Function1<PaginatedResult<? extends ApiCardTransactions4>, Unit>() { // from class: com.robinhood.librobinhood.data.store.CardTransactionStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiCardTransactions4> paginatedResult) {
                m22598invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22598invoke(PaginatedResult<? extends ApiCardTransactions4> paginatedResult) {
                if (!logoutKillswitch2.isLoggedOut()) {
                    try {
                        dao.insert(paginatedResult);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch2.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase2.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    public static /* synthetic */ void refresh$default(CardTransactionStore cardTransactionStore, CardTransaction.Status status, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        cardTransactionStore.refresh(status, uuid, z);
    }

    public final void refresh(CardTransaction.Status status, UUID id, boolean force) {
        Function2<? super UUID, ? super Continuation<? super ApiCardTransactions>, ? extends Object> cardTransactionStore2;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id, "id");
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            cardTransactionStore2 = new CardTransactionStore2(this.minerva);
        } else if (i == 2) {
            cardTransactionStore2 = new CardTransactionStore3(this.minerva);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cardTransactionStore2 = new CardTransactionStore4(this.minerva);
        }
        refreshSingle(status.getServerValue(), id, force, cardTransactionStore2);
    }

    public static /* synthetic */ void refreshDisputableTransactions$default(CardTransactionStore cardTransactionStore, boolean z, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = null;
        }
        if ((i & 4) != 0) {
            instant2 = null;
        }
        cardTransactionStore.refreshDisputableTransactions(z, instant, instant2);
    }

    /* compiled from: CardTransactionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiSettledCardTransaction;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardTransactionStore$refreshDisputableTransactions$1", m3645f = "CardTransactionStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CardTransactionStore$refreshDisputableTransactions$1 */
    static final class C336351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiCardTransactions4>>, Object> {
        final /* synthetic */ Instant $initiatedAtGte;
        final /* synthetic */ Instant $initiatedAtLte;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336351(Instant instant, Instant instant2, Continuation<? super C336351> continuation) {
            super(2, continuation);
            this.$initiatedAtGte = instant;
            this.$initiatedAtLte = instant2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardTransactionStore.this.new C336351(this.$initiatedAtGte, this.$initiatedAtLte, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiCardTransactions4>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiCardTransactions4>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiCardTransactions4>> continuation) {
            return ((C336351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = CardTransactionStore.this.minerva;
            Boolean boolBoxBoolean = boxing.boxBoolean(true);
            Instant instant = this.$initiatedAtGte;
            Instant instant2 = this.$initiatedAtLte;
            this.label = 1;
            Object settledCardTransactions$default = Minerva.DefaultImpls.getSettledCardTransactions$default(minerva, null, boolBoxBoolean, instant, instant2, this, 1, null);
            return settledCardTransactions$default == coroutine_suspended ? coroutine_suspended : settledCardTransactions$default;
        }
    }

    public final void refreshDisputableTransactions(boolean force, Instant initiatedAtLte, Instant initiatedAtGte) {
        ScopedSubscriptionKt.subscribeIn(refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C336351(initiatedAtGte, initiatedAtLte, null), 1, null)).force(force).saveAction(this.settledPaginatedSaveAction).toMaybe(getNetworkWrapper()), getStoreScope());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markFraudulent(UUID uuid, Continuation<? super Unit> continuation) {
        C336331 c336331;
        UUID uuid2;
        if (continuation instanceof C336331) {
            c336331 = (C336331) continuation;
            int i = c336331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336331.label = i - Integer.MIN_VALUE;
            } else {
                c336331 = new C336331(continuation);
            }
        }
        Object obj = c336331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336331.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = this.minerva;
                c336331.L$0 = uuid;
                c336331.label = 1;
                Object objMarkCardTransactionFraudulent = minerva.markCardTransactionFraudulent(uuid, c336331);
                uuid2 = uuid;
                if (objMarkCardTransactionFraudulent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                UUID uuid3 = (UUID) c336331.L$0;
                ResultKt.throwOnFailure(obj);
                uuid2 = uuid3;
            }
            refresh(CardTransaction.Status.DECLINED, uuid2, true);
            uuid = Unit.INSTANCE;
            return uuid;
        } catch (Throwable th) {
            refresh(CardTransaction.Status.DECLINED, uuid, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotFraudulent(UUID uuid, Continuation<? super Unit> continuation) {
        C336341 c336341;
        UUID uuid2;
        if (continuation instanceof C336341) {
            c336341 = (C336341) continuation;
            int i = c336341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336341.label = i - Integer.MIN_VALUE;
            } else {
                c336341 = new C336341(continuation);
            }
        }
        Object obj = c336341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336341.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = this.minerva;
                c336341.L$0 = uuid;
                c336341.label = 1;
                Object objMarkCardTransactionNotFraudulent = minerva.markCardTransactionNotFraudulent(uuid, c336341);
                uuid2 = uuid;
                if (objMarkCardTransactionNotFraudulent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                UUID uuid3 = (UUID) c336341.L$0;
                ResultKt.throwOnFailure(obj);
                uuid2 = uuid3;
            }
            refresh(CardTransaction.Status.DECLINED, uuid2, true);
            uuid = Unit.INSTANCE;
            return uuid;
        } catch (Throwable th) {
            refresh(CardTransaction.Status.DECLINED, uuid, true);
            throw th;
        }
    }

    public final Observable<CardTransaction> streamTransaction(CardTransaction.Status status, UUID id) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(this.dao.getTransaction(status, id));
    }

    public final Observable<List<CardTransaction>> streamTransactions(CardTransaction.Status status, List<UUID> ids) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return asObservable(takeWhileLoggedIn(this.dao.getTransactions(status, ids)));
    }

    public static /* synthetic */ Observable streamDisputableTransactions$default(CardTransactionStore cardTransactionStore, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = null;
        }
        if ((i & 2) != 0) {
            instant2 = null;
        }
        return cardTransactionStore.streamDisputableTransactions(instant, instant2);
    }

    public final Observable<List<SettledCardTransaction>> streamDisputableTransactions(Instant initiatedAtLte, Instant initiatedAtGte) {
        return asObservable(takeWhileLoggedIn(this.dao.getDisputableTransactions(initiatedAtLte, initiatedAtGte)));
    }

    public static /* synthetic */ Observable streamDuplicateDisputableTransactions$default(CardTransactionStore cardTransactionStore, Instant instant, Instant instant2, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = null;
        }
        if ((i & 2) != 0) {
            instant2 = null;
        }
        if ((i & 4) != 0) {
            uuid = null;
        }
        return cardTransactionStore.streamDuplicateDisputableTransactions(instant, instant2, uuid);
    }

    public final Observable<List<SettledCardTransaction>> streamDuplicateDisputableTransactions(Instant initiatedAtLte, Instant initiatedAtGte, UUID duplicateOf) {
        return asObservable(takeWhileLoggedIn(this.dao.getDuplicateDisputableTransactions(initiatedAtLte, initiatedAtGte, duplicateOf)));
    }

    public final Observable<List<SettledCardTransaction>> streamSettledTransactionSet(Set<UUID> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return asObservable(takeWhileLoggedIn(this.dao.getMultipleSettledTransactions(ids)));
    }

    /* compiled from: CardTransactionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiCardTransaction;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardTransactionStore$refreshSingle$1", m3645f = "CardTransactionStore.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CardTransactionStore$refreshSingle$1 */
    static final class C336361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCardTransactions>, Object> {
        final /* synthetic */ Function2<UUID, Continuation<? super ApiCardTransactions>, Object> $createRequest;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C336361(Function2<? super UUID, ? super Continuation<? super ApiCardTransactions>, ? extends Object> function2, UUID uuid, Continuation<? super C336361> continuation) {
            super(2, continuation);
            this.$createRequest = function2;
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C336361(this.$createRequest, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCardTransactions> continuation) {
            return ((C336361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<UUID, Continuation<? super ApiCardTransactions>, Object> function2 = this.$createRequest;
            UUID uuid = this.$id;
            this.label = 1;
            Object objInvoke = function2.invoke(uuid, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    private final void refreshSingle(String keyPrefix, UUID id, boolean force, Function2<? super UUID, ? super Continuation<? super ApiCardTransactions>, ? extends Object> createRequest) {
        ScopedSubscriptionKt.subscribeIn(refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C336361(createRequest, id, null), 1, null)).key(keyPrefix + ":" + id).saveAction(this.saveAction).force(force).toMaybe(getNetworkWrapper()), getStoreScope());
    }
}
