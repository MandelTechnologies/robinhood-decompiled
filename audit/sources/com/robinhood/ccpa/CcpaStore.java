package com.robinhood.ccpa;

import androidx.room.RoomDatabase;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.identi.ApiConsentStatusRequest;
import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.models.dao.identi.OptOutConsentStatusDao;
import com.robinhood.models.p320db.identi.OptOutConsentStatus;
import com.robinhood.models.p320db.identi.OptOutConsentStatus2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.Completables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: CcpaStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ccpa/CcpaStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/identi/OptOutConsentStatusDao;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/identi/OptOutConsentStatusDao;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/db/identi/OptOutConsentStatus;", "", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "getCcpaOptOutStatus", "Lio/reactivex/Observable;", "updateCcpaOptOutStatus", "Lio/reactivex/Completable;", "isOptingIn", "Companion", "lib-store-ccpa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CcpaStore extends Store {
    private static final ApiOptOutConsentStatus STUBBED_CCPA_OPT_OUT_STATUS;
    private final OptOutConsentStatusDao dao;
    private final Endpoint<Unit, ApiOptOutConsentStatus> endpoint;
    private final Identi identi;
    private final Function1<OptOutConsentStatus, Unit> saveAction;

    /* JADX WARN: Illegal instructions before constructor call */
    public CcpaStore(Identi identi2, StoreBundle storeBundle, final OptOutConsentStatusDao dao) {
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        OptOutConsentStatus.Companion companion = OptOutConsentStatus.INSTANCE;
        super(storeBundle, companion);
        this.identi = identi2;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<OptOutConsentStatus, Unit>() { // from class: com.robinhood.ccpa.CcpaStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OptOutConsentStatus optOutConsentStatus) {
                m20241invoke(optOutConsentStatus);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20241invoke(OptOutConsentStatus optOutConsentStatus) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(optOutConsentStatus);
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
        this.endpoint = Endpoint.INSTANCE.create(new CcpaStore2(this, null), getLogoutKillswitch(), new CcpaStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
    }

    public static /* synthetic */ Job refresh$default(CcpaStore ccpaStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ccpaStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<OptOutConsentStatus> getCcpaOptOutStatus() {
        return asObservable(FlowKt.filterNotNull(this.dao.getStatus(OptOutConsentType.CCPA_MARKETING_CONSENT)));
    }

    /* compiled from: CcpaStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ccpa.CcpaStore$updateCcpaOptOutStatus$1", m3645f = "CcpaStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.ccpa.CcpaStore$updateCcpaOptOutStatus$1 */
    static final class C318861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptOutConsentStatus>, Object> {
        final /* synthetic */ boolean $isOptingIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C318861(boolean z, Continuation<? super C318861> continuation) {
            super(2, continuation);
            this.$isOptingIn = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CcpaStore.this.new C318861(this.$isOptingIn, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptOutConsentStatus> continuation) {
            return ((C318861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Identi identi2 = CcpaStore.this.identi;
            ApiConsentStatusRequest apiConsentStatusRequest = new ApiConsentStatusRequest(this.$isOptingIn);
            this.label = 1;
            Object objUpdateCcpaMarketingOptOutStatus = identi2.updateCcpaMarketingOptOutStatus(apiConsentStatusRequest, this);
            return objUpdateCcpaMarketingOptOutStatus == coroutine_suspended ? coroutine_suspended : objUpdateCcpaMarketingOptOutStatus;
        }
    }

    public final Completable updateCcpaOptOutStatus(boolean isOptingIn) {
        Completable completableFlatMapCompletable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C318861(isOptingIn, null), 1, null).flatMapCompletable(new Function() { // from class: com.robinhood.ccpa.CcpaStore.updateCcpaOptOutStatus.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final ApiOptOutConsentStatus apiOptOutConsentStatus) {
                Intrinsics.checkNotNullParameter(apiOptOutConsentStatus, "apiOptOutConsentStatus");
                final CcpaStore ccpaStore = CcpaStore.this;
                return Completable.fromAction(new Action() { // from class: com.robinhood.ccpa.CcpaStore.updateCcpaOptOutStatus.2.1
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        Function1 function1 = ccpaStore.saveAction;
                        ApiOptOutConsentStatus apiOptOutConsentStatus2 = apiOptOutConsentStatus;
                        Intrinsics.checkNotNull(apiOptOutConsentStatus2);
                        function1.invoke(OptOutConsentStatus2.toDbModel(apiOptOutConsentStatus2));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return Completables.ignoreNetworkExceptions(completableFlatMapCompletable);
    }

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        STUBBED_CCPA_OPT_OUT_STATUS = new ApiOptOutConsentStatus(uuidFromString, true, null, Instant.now(), Instant.now(), OptOutConsentType.CCPA_MARKETING_CONSENT);
    }
}
