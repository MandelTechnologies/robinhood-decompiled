package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.experiments.AcqSocialGraphDeprecationKillswitch;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiReferral;
import com.robinhood.models.api.ContactData;
import com.robinhood.models.dao.ReferralDao;
import com.robinhood.models.p320db.Referral;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: ReferralStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ReferralStore;", "Lcom/robinhood/store/Store;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ReferralDao;", "<init>", "(Lcom/robinhood/api/referral/ReferralApi;Lcom/robinhood/referral/api/ContactsApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ReferralDao;)V", "getReferralsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiReferral;", "getAllReferred", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/Referral;", "refresh", "force", "", "remindPendingReferral", "referralId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadContactsData", "contactsData", "Lcom/robinhood/models/api/ContactData;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadContactInvitesData", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReferralStore extends Store {
    private final ContactsApi contactsApi;
    private final ReferralDao dao;
    private final ExperimentsStore experimentsStore;
    private final PaginatedEndpoint<Unit, ApiReferral> getReferralsEndpoint;
    private final ReferralApi referralApi;

    /* compiled from: ReferralStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ReferralStore", m3645f = "ReferralStore.kt", m3646l = {49}, m3647m = "remindPendingReferral")
    /* renamed from: com.robinhood.librobinhood.data.store.ReferralStore$remindPendingReferral$1 */
    static final class C342761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342761(Continuation<? super C342761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReferralStore.this.remindPendingReferral(null, this);
        }
    }

    /* compiled from: ReferralStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ReferralStore", m3645f = "ReferralStore.kt", m3646l = {73, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "uploadContactInvitesData")
    /* renamed from: com.robinhood.librobinhood.data.store.ReferralStore$uploadContactInvitesData$1 */
    static final class C342771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C342771(Continuation<? super C342771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReferralStore.this.uploadContactInvitesData(null, this);
        }
    }

    /* compiled from: ReferralStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ReferralStore", m3645f = "ReferralStore.kt", m3646l = {73, 57}, m3647m = "uploadContactsData")
    /* renamed from: com.robinhood.librobinhood.data.store.ReferralStore$uploadContactsData$1 */
    static final class C342781 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C342781(Continuation<? super C342781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReferralStore.this.uploadContactsData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralStore(ReferralApi referralApi, ContactsApi contactsApi, ExperimentsStore experimentsStore, StoreBundle storeBundle, ReferralDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.referralApi = referralApi;
        this.contactsApi = contactsApi;
        this.experimentsStore = experimentsStore;
        this.dao = dao;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        ReferralStore2 referralStore2 = new ReferralStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        ReferralStore3 referralStore3 = new ReferralStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.getReferralsEndpoint = companion.create(referralStore2, logoutKillswitch, referralStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getReferralsEndpoint$insert(ReferralDao referralDao, PaginatedResult paginatedResult, Continuation continuation) {
        referralDao.insert(paginatedResult);
        return Unit.INSTANCE;
    }

    public final Observable<List<Referral>> getAllReferred() {
        return asObservable(takeWhileLoggedIn(this.dao.getReferred()));
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getReferralsEndpoint, force);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remindPendingReferral(UUID uuid, Continuation<? super Unit> continuation) {
        C342761 c342761;
        if (continuation instanceof C342761) {
            c342761 = (C342761) continuation;
            int i = c342761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342761.label = i - Integer.MIN_VALUE;
            } else {
                c342761 = new C342761(continuation);
            }
        }
        Object obj = c342761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ReferralApi referralApi = this.referralApi;
            c342761.label = 1;
            if (referralApi.remindPendingReferral(uuid, c342761) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        refresh(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r13.uploadContactsData(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadContactsData(List<ContactData> list, Continuation<? super Unit> continuation) {
        C342781 c342781;
        if (continuation instanceof C342781) {
            c342781 = (C342781) continuation;
            int i = c342781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342781.label = i - Integer.MIN_VALUE;
            } else {
                c342781 = new C342781(continuation);
            }
        }
        Object objAwaitFirst = c342781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable observableOnErrorReturn = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AcqSocialGraphDeprecationKillswitch.INSTANCE}, false, null, 6, null).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.ReferralStore$uploadContactsData$socialGraphKillswitch$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.FALSE;
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
            c342781.L$0 = list;
            c342781.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableOnErrorReturn, c342781);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
            return Unit.INSTANCE;
        }
        list = (List) c342781.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        if (((Boolean) objAwaitFirst).booleanValue()) {
            return Unit.INSTANCE;
        }
        ContactsApi contactsApi = this.contactsApi;
        ContactData.Request request = new ContactData.Request(list);
        c342781.L$0 = null;
        c342781.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r13.uploadContactInvitesData(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadContactInvitesData(List<ContactData> list, Continuation<? super Unit> continuation) {
        C342771 c342771;
        if (continuation instanceof C342771) {
            c342771 = (C342771) continuation;
            int i = c342771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342771.label = i - Integer.MIN_VALUE;
            } else {
                c342771 = new C342771(continuation);
            }
        }
        Object objAwaitFirst = c342771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable observableOnErrorReturn = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AcqSocialGraphDeprecationKillswitch.INSTANCE}, false, null, 6, null).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.ReferralStore$uploadContactInvitesData$socialGraphKillswitch$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.FALSE;
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
            c342771.L$0 = list;
            c342771.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableOnErrorReturn, c342771);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
            return Unit.INSTANCE;
        }
        list = (List) c342771.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        if (((Boolean) objAwaitFirst).booleanValue()) {
            return Unit.INSTANCE;
        }
        ContactsApi contactsApi = this.contactsApi;
        ContactData.Request request = new ContactData.Request(list);
        c342771.L$0 = null;
        c342771.label = 2;
    }
}
