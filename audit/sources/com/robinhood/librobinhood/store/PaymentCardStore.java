package com.robinhood.librobinhood.store;

import android.graphics.Bitmap;
import android.util.Base64;
import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.api.extension.Responses;
import com.robinhood.api.retrofit.Galileo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.api.utils.NetworkRefresh;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiChangePinParams;
import com.robinhood.models.api.minerva.ApiCommitChangePinRequest;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.api.minerva.ApiPreflightAction;
import com.robinhood.models.api.minerva.ExternalResource;
import com.robinhood.models.api.minerva.MockedResourceException;
import com.robinhood.models.api.minerva.SimpleDebitCardActionEvent;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.api.minerva.galileo.GalileoImageRequest;
import com.robinhood.models.dao.PaymentCardDao;
import com.robinhood.models.p320db.mcduckling.CardImageConfiguration;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.mcduckling.PaymentCard2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.http.Headers;
import com.robinhood.utils.http.MediaTypes;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.singular.sdk.internal.Constants;
import com.squareup.moshi.JsonAdapter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.nio.charset.Charset;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: PaymentCardStore.kt */
@Metadata(m3635d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 [2\u00020\u0001:\u0002Z[BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J\u0010\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020#J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bJ\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bJ\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010 \u001a\u00020!J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0*2\u0006\u0010,\u001a\u00020-J\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001c0*2\u0006\u0010 \u001a\u00020!2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020#*\u0004\u0018\u000103H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u000206H\u0002J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d082\u0006\u0010 \u001a\u00020!J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d082\u0006\u0010 \u001a\u00020!J\u001e\u0010:\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0086@¢\u0006\u0002\u0010=J$\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00150?2\u0006\u0010@\u001a\u00020A2\u0006\u0010;\u001a\u00020<H\u0082@¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0014082\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001c\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017082\u0006\u0010\"\u001a\u00020#H\u0002J$\u0010F\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00150?H\u0082@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010J\u001a\u00020KH\u0002J\u0016\u0010L\u001a\u00020<2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00150?H\u0002J\f\u0010M\u001a\u00020N*\u000201H\u0002J\u0014\u0010O\u001a\u00020P*\u00020Q2\u0006\u0010R\u001a\u00020SH\u0002J\u0014\u0010O\u001a\u00020T*\u00020U2\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020NH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/PaymentCardStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/PaymentCardDao;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "galileo", "Lcom/robinhood/api/retrofit/Galileo;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/PaymentCardDao;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/api/retrofit/Galileo;Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/minerva/ApiPaymentCard;", "", "paginatedSaveAction", "Lcom/robinhood/models/PaginatedResult;", "cachedImage", "Lcom/robinhood/librobinhood/store/PaymentCardStore$CachedImage;", "cachedActiveCashManagementCard", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "cachedActiveRhySpendingCard", "refresh", "cardId", "Ljava/util/UUID;", "force", "", "streamActiveCashManagementCard", "streamActiveCashManagementCardOptional", "streamActiveRhyCard", "streamActiveRhyCardOptional", "streamCard", "fetchPreflightAction", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/minerva/ApiPreflightAction;", "action", "Lcom/robinhood/models/api/minerva/SimpleDebitCardActionEvent;", "fetchCardImage", "Landroid/graphics/Bitmap;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "isMockedResource", "Lcom/robinhood/models/api/minerva/ExternalResource;", "extractExternalResource", "error", "", "enableCard", "Lio/reactivex/Maybe;", "disableCard", "changePin", "newPin", "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePinWithGalileo", "Lretrofit2/Response;", "apiChangePinParams", "Lcom/robinhood/models/api/minerva/ApiChangePinParams;", "(Lcom/robinhood/models/api/minerva/ApiChangePinParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activateCard", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshMaybe", "commitPinChange", "response", "(Ljava/util/UUID;Lretrofit2/Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createActiveCardObservable", "accountType", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount$Type;", "extractGalileoResponseCode", "toApiRequest", "Lcom/robinhood/models/api/minerva/galileo/GalileoImageRequest;", "toFieldOptions", "Lcom/robinhood/models/api/minerva/galileo/GalileoImageRequest$GenericFieldOptions;", "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration$TextLayout;", "fontScale", "", "Lcom/robinhood/models/api/minerva/galileo/GalileoImageRequest$CardNumberFieldOptions;", "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration$CardNumberTextLayout;", "createHttpUrl", "Lokhttp3/HttpUrl;", "url", "request", "CachedImage", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PaymentCardStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENCODING_FLAGS = 9;
    public static final String QUERY_PARAM = "image";
    private final Observable<Optional<PaymentCard>> cachedActiveCashManagementCard;
    private final Observable<Optional<PaymentCard>> cachedActiveRhySpendingCard;
    private CachedImage cachedImage;
    private final PaymentCardDao dao;
    private final Galileo galileo;
    private final Minerva minerva;
    private final MinervaAccountStore minervaAccountStore;
    private final LazyMoshi moshi;
    private final Function1<PaginatedResult<ApiPaymentCard>, Unit> paginatedSaveAction;
    private final Function1<ApiPaymentCard, Unit> saveAction;
    private final SuvMigrationManager suvMigrationManager;

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore", m3645f = "PaymentCardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, 337}, m3647m = "activateCard")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$activateCard$1 */
    static final class C349011 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C349011(Continuation<? super C349011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentCardStore.this.activateCard(null, this);
        }
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore", m3645f = "PaymentCardStore.kt", m3646l = {200, 201, 202, 337}, m3647m = "changePin")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$changePin$1 */
    static final class C349021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C349021(Continuation<? super C349021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentCardStore.this.changePin(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentCardStore(StoreBundle storeBundle, final PaymentCardDao dao, MinervaAccountStore minervaAccountStore, Galileo galileo, Minerva minerva, LazyMoshi moshi, SuvMigrationManager suvMigrationManager) {
        super(storeBundle, PaymentCard.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(galileo, "galileo");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        this.dao = dao;
        this.minervaAccountStore = minervaAccountStore;
        this.galileo = galileo;
        this.minerva = minerva;
        this.moshi = moshi;
        this.suvMigrationManager = suvMigrationManager;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiPaymentCard, Unit>() { // from class: com.robinhood.librobinhood.store.PaymentCardStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiPaymentCard apiPaymentCard) {
                m22816invoke(apiPaymentCard);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22816invoke(ApiPaymentCard apiPaymentCard) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insertCard(apiPaymentCard);
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
        this.paginatedSaveAction = new Function1<PaginatedResult<? extends ApiPaymentCard>, Unit>() { // from class: com.robinhood.librobinhood.store.PaymentCardStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiPaymentCard> paginatedResult) {
                m22817invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22817invoke(PaginatedResult<? extends ApiPaymentCard> paginatedResult) {
                if (!logoutKillswitch2.isLoggedOut()) {
                    try {
                        dao.insertCards(paginatedResult);
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
        this.cachedActiveCashManagementCard = createActiveCardObservable(ApiMinervaAccount.Type.BROKERAGE);
        this.cachedActiveRhySpendingCard = createActiveCardObservable(ApiMinervaAccount.Type.RHY_SPENDING);
    }

    public static /* synthetic */ void refresh$default(PaymentCardStore paymentCardStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        paymentCardStore.refresh(uuid, z);
    }

    public final void refresh(UUID cardId, boolean force) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        ScopedSubscriptionKt.subscribeIn(refreshMaybe(cardId, force), getStoreScope());
    }

    public static /* synthetic */ void refresh$default(PaymentCardStore paymentCardStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paymentCardStore.refresh(z);
    }

    public final void refresh(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refreshMaybe(force), getStoreScope());
    }

    public final Observable<PaymentCard> streamActiveCashManagementCard() {
        return ObservablesKt.filterIsPresent(streamActiveCashManagementCardOptional());
    }

    public final Observable<Optional<PaymentCard>> streamActiveCashManagementCardOptional() {
        Observable<Optional<PaymentCard>> observableTakeUntil = this.cachedActiveCashManagementCard.takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<PaymentCard> streamActiveRhyCard() {
        return ObservablesKt.filterIsPresent(streamActiveRhyCardOptional());
    }

    public final Observable<Optional<PaymentCard>> streamActiveRhyCardOptional() {
        Observable<Optional<PaymentCard>> observableTakeUntil = this.cachedActiveRhySpendingCard.takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<PaymentCard> streamCard(UUID cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getCard(cardId))));
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiPreflightAction;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$fetchPreflightAction$1", m3645f = "PaymentCardStore.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$fetchPreflightAction$1 */
    static final class C349121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPreflightAction>, Object> {
        final /* synthetic */ SimpleDebitCardActionEvent $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349121(SimpleDebitCardActionEvent simpleDebitCardActionEvent, Continuation<? super C349121> continuation) {
            super(2, continuation);
            this.$action = simpleDebitCardActionEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentCardStore.this.new C349121(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPreflightAction> continuation) {
            return ((C349121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = PaymentCardStore.this.minerva;
            SimpleDebitCardActionEvent simpleDebitCardActionEvent = this.$action;
            this.label = 1;
            Object preflightAction = minerva.getPreflightAction(simpleDebitCardActionEvent, this);
            return preflightAction == coroutine_suspended ? coroutine_suspended : preflightAction;
        }
    }

    public final Single<Optional<ApiPreflightAction>> fetchPreflightAction(SimpleDebitCardActionEvent action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Single<Optional<ApiPreflightAction>> singleFlatMap = SinglesKt.mapToOptional(RxFactory.DefaultImpls.rxSingle$default(this, null, new C349121(action, null), 1, null)).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.fetchPreflightAction.2
            @Override // io.reactivex.functions.Function
            public final Optional<ApiPreflightAction> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional2.INSTANCE;
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.fetchPreflightAction.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiPreflightAction>> apply(Optional<ApiPreflightAction> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                ApiPreflightAction orNull = response.getOrNull();
                if (!(orNull != null ? orNull.shouldTriggerVerification() : false)) {
                    response = Optional2.INSTANCE;
                }
                return Single.just(response);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Single<Optional<Bitmap>> fetchCardImage(final UUID cardId, final CardImageConfiguration configuration) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        CachedImage cachedImage = this.cachedImage;
        if (cachedImage != null && Intrinsics.areEqual(cachedImage.getCardId(), cardId) && Intrinsics.areEqual(cachedImage.getConfiguration(), configuration)) {
            Single<Optional<Bitmap>> singleJust = Single.just(Optional3.asOptional(cachedImage.getImage()));
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        Single<Optional<Bitmap>> singleDoAfterSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C349091(cardId, null), 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.fetchCardImage.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<Bitmap>> apply(ExternalResource resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                if (PaymentCardStore.this.isMockedResource(resource)) {
                    Single singleError = Single.error(new MockedResourceException());
                    Intrinsics.checkNotNull(singleError);
                    return singleError;
                }
                PaymentCardStore paymentCardStore = PaymentCardStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(paymentCardStore, null, new AnonymousClass1(paymentCardStore, resource, configuration, null), 1, null);
            }

            /* compiled from: PaymentCardStore.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$fetchCardImage$2$1", m3645f = "PaymentCardStore.kt", m3646l = {156}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$fetchCardImage$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Bitmap>>, Object> {
                final /* synthetic */ CardImageConfiguration $configuration;
                final /* synthetic */ ExternalResource $resource;
                int label;
                final /* synthetic */ PaymentCardStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PaymentCardStore paymentCardStore, ExternalResource externalResource, CardImageConfiguration cardImageConfiguration, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = paymentCardStore;
                    this.$resource = externalResource;
                    this.$configuration = cardImageConfiguration;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$resource, this.$configuration, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Bitmap>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<Bitmap>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Bitmap>> continuation) {
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
                    Galileo galileo = this.this$0.galileo;
                    PaymentCardStore paymentCardStore = this.this$0;
                    HttpUrl location = this.$resource.getLocation();
                    if (location != null) {
                        HttpUrl httpUrlCreateHttpUrl = paymentCardStore.createHttpUrl(location, this.this$0.toApiRequest(this.$configuration));
                        this.label = 1;
                        Object cardImage = galileo.getCardImage(httpUrlCreateHttpUrl, this);
                        return cardImage == coroutine_suspended ? coroutine_suspended : cardImage;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }).doAfterSuccess(new Consumer() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.fetchCardImage.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Bitmap> optional) {
                Bitmap bitmapComponent1 = optional.component1();
                if (bitmapComponent1 != null) {
                    PaymentCardStore.this.cachedImage = new CachedImage(cardId, configuration, bitmapComponent1);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ExternalResource;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$fetchCardImage$1", m3645f = "PaymentCardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 144}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$fetchCardImage$1 */
    static final class C349091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ExternalResource>, Object> {
        final /* synthetic */ UUID $cardId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349091(UUID uuid, Continuation<? super C349091> continuation) {
            super(2, continuation);
            this.$cardId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentCardStore.this.new C349091(this.$cardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExternalResource> continuation) {
            return ((C349091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ExternalResource externalResourceExtractExternalResource;
            UUID workflow_instance_uuid;
            VerificationRequiredException.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                externalResourceExtractExternalResource = PaymentCardStore.this.extractExternalResource(th);
                if (externalResourceExtractExternalResource != null && (workflow_instance_uuid = externalResourceExtractExternalResource.getWorkflow_instance_uuid()) != null) {
                    PaymentCardStore paymentCardStore = PaymentCardStore.this;
                    VerificationRequiredException.Companion companion2 = VerificationRequiredException.INSTANCE;
                    SuvMigrationManager suvMigrationManager = paymentCardStore.suvMigrationManager;
                    this.L$0 = externalResourceExtractExternalResource;
                    this.L$1 = companion2;
                    this.label = 2;
                    obj = suvMigrationManager.isMigrated(workflow_instance_uuid, this);
                    if (obj != coroutine_suspended) {
                        companion = companion2;
                    }
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = PaymentCardStore.this.minerva;
                UUID uuid = this.$cardId;
                this.label = 1;
                obj = minerva.getPaymentCardImageUrl(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (VerificationRequiredException.Companion) this.L$1;
                    externalResourceExtractExternalResource = (ExternalResource) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw companion.fromExternalResource(externalResourceExtractExternalResource, ((Boolean) obj).booleanValue());
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ExternalResource) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMockedResource(ExternalResource externalResource) {
        HttpUrl location;
        return Intrinsics.areEqual((externalResource == null || (location = externalResource.getLocation()) == null) ? null : location.getHost(), "galileo_url.com") && BuildFlavors.INSTANCE.isDebugOrInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalResource extractExternalResource(Throwable error) {
        Integer httpStatusCode = Throwables.getHttpStatusCode(error);
        if (httpStatusCode == null || httpStatusCode.intValue() != 403) {
            return null;
        }
        Intrinsics.checkNotNull(error, "null cannot be cast to non-null type retrofit2.HttpException");
        Response<?> response = ((HttpException) error).response();
        String strExtractErrorBodyString = response != null ? NetworkThrowables.extractErrorBodyString(response) : null;
        try {
            LazyMoshi lazyMoshi = this.moshi;
            Types types = Types.INSTANCE;
            return (ExternalResource) lazyMoshi.adapter(new TypeToken<ExternalResource>() { // from class: com.robinhood.librobinhood.store.PaymentCardStore$extractExternalResource$$inlined$getAdapter$1
            }.getType()).fromJson(strExtractErrorBodyString);
        } catch (IOException unused) {
            return null;
        }
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$enableCard$1", m3645f = "PaymentCardStore.kt", m3646l = {188}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$enableCard$1 */
    static final class C349071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $cardId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349071(UUID uuid, Continuation<? super C349071> continuation) {
            super(2, continuation);
            this.$cardId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentCardStore.this.new C349071(this.$cardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C349071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = PaymentCardStore.this.minerva;
                UUID uuid = this.$cardId;
                this.label = 1;
                if (minerva.enableCard(uuid, this) == coroutine_suspended) {
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

    public final Maybe<PaymentCard> enableCard(UUID cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Maybe<PaymentCard> map = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C349071(cardId, null), 1, null).andThen(refreshMaybe(cardId, true)).map(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.enableCard.2
            @Override // io.reactivex.functions.Function
            public final PaymentCard apply(ApiPaymentCard p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return PaymentCard2.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$disableCard$1", m3645f = "PaymentCardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$disableCard$1 */
    static final class C349051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $cardId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349051(UUID uuid, Continuation<? super C349051> continuation) {
            super(2, continuation);
            this.$cardId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentCardStore.this.new C349051(this.$cardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C349051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = PaymentCardStore.this.minerva;
                UUID uuid = this.$cardId;
                this.label = 1;
                if (minerva.disableCard(uuid, this) == coroutine_suspended) {
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

    public final Maybe<PaymentCard> disableCard(UUID cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Maybe<PaymentCard> map = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C349051(cardId, null), 1, null).andThen(refreshMaybe(cardId, true)).map(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.disableCard.2
            @Override // io.reactivex.functions.Function
            public final PaymentCard apply(ApiPaymentCard p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return PaymentCard2.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.awaitSingleOrNull(r9, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[PHI: r9
      0x0086: PHI (r9v3 java.util.UUID) = (r9v2 java.util.UUID), (r9v13 java.util.UUID) binds: [B:27:0x0083, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changePin(UUID uuid, String str, Continuation<? super Unit> continuation) {
        C349021 c349021;
        if (continuation instanceof C349021) {
            c349021 = (C349021) continuation;
            int i = c349021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349021.label = i - Integer.MIN_VALUE;
            } else {
                c349021 = new C349021(continuation);
            }
        }
        Object objChangePin = c349021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c349021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objChangePin);
            Minerva minerva = this.minerva;
            c349021.L$0 = uuid;
            c349021.L$1 = str;
            c349021.label = 1;
            objChangePin = minerva.changePin(uuid, c349021);
            if (objChangePin != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            str = (String) c349021.L$1;
            uuid = (UUID) c349021.L$0;
            ResultKt.throwOnFailure(objChangePin);
        } else {
            if (i2 == 2) {
                uuid = (UUID) c349021.L$0;
                ResultKt.throwOnFailure(objChangePin);
                c349021.L$0 = uuid;
                c349021.label = 3;
                if (commitPinChange(uuid, (Response) objChangePin, c349021) != coroutine_suspended) {
                    Maybe<ApiPaymentCard> maybeRefreshMaybe = refreshMaybe(uuid, true);
                    c349021.L$0 = null;
                    c349021.label = 4;
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objChangePin);
                return Unit.INSTANCE;
            }
            uuid = (UUID) c349021.L$0;
            ResultKt.throwOnFailure(objChangePin);
            Maybe<ApiPaymentCard> maybeRefreshMaybe2 = refreshMaybe(uuid, true);
            c349021.L$0 = null;
            c349021.label = 4;
        }
        c349021.L$0 = uuid;
        c349021.L$1 = null;
        c349021.label = 2;
        objChangePin = changePinWithGalileo((ApiChangePinParams) objChangePin, str, c349021);
        if (objChangePin != coroutine_suspended) {
            c349021.L$0 = uuid;
            c349021.label = 3;
            if (commitPinChange(uuid, (Response) objChangePin, c349021) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object changePinWithGalileo(ApiChangePinParams apiChangePinParams, String str, Continuation<? super Response<Unit>> continuation) {
        return this.galileo.changePin(apiChangePinParams.getAction_url(), apiChangePinParams.getSubmitter_id(), str, str, apiChangePinParams.getPin_change_key(), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.awaitSingleOrNull(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object activateCard(UUID uuid, Continuation<? super Unit> continuation) {
        C349011 c349011;
        if (continuation instanceof C349011) {
            c349011 = (C349011) continuation;
            int i = c349011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349011.label = i - Integer.MIN_VALUE;
            } else {
                c349011 = new C349011(continuation);
            }
        }
        Object obj = c349011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c349011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Minerva minerva = this.minerva;
            c349011.L$0 = uuid;
            c349011.label = 1;
            if (minerva.activateCard(uuid, c349011) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        uuid = (UUID) c349011.L$0;
        ResultKt.throwOnFailure(obj);
        Maybe<ApiPaymentCard> maybeRefreshMaybe = refreshMaybe(uuid, true);
        c349011.L$0 = null;
        c349011.label = 2;
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiPaymentCard;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.PaymentCardStore$refreshMaybe$1", m3645f = "PaymentCardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.store.PaymentCardStore$refreshMaybe$1 */
    static final class C349151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPaymentCard>, Object> {
        final /* synthetic */ UUID $cardId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C349151(UUID uuid, Continuation<? super C349151> continuation) {
            super(2, continuation);
            this.$cardId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentCardStore.this.new C349151(this.$cardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPaymentCard> continuation) {
            return ((C349151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = PaymentCardStore.this.minerva;
            UUID uuid = this.$cardId;
            this.label = 1;
            Object paymentCard = minerva.getPaymentCard(uuid, this);
            return paymentCard == coroutine_suspended ? coroutine_suspended : paymentCard;
        }
    }

    private final Maybe<ApiPaymentCard> refreshMaybe(UUID cardId, boolean force) {
        NetworkRefresh networkRefreshRefresh = refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C349151(cardId, null), 1, null));
        String string2 = cardId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return networkRefreshRefresh.key(string2).saveAction(this.saveAction).force(force).toMaybe(getNetworkWrapper());
    }

    private final Maybe<PaginatedResult<ApiPaymentCard>> refreshMaybe(boolean force) {
        return refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.store.PaymentCardStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentCardStore.refreshMaybe$lambda$1(this.f$0, (String) obj);
            }
        }).saveAction(this.paginatedSaveAction).force(force).toMaybe(getNetworkWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refreshMaybe$lambda$1(PaymentCardStore paymentCardStore, String str) {
        return RxFactory.DefaultImpls.rxSingle$default(paymentCardStore, null, new PaymentCardStore2(paymentCardStore, str, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object commitPinChange(UUID uuid, Response<Unit> response, Continuation<? super Unit> continuation) {
        Object objCommitPinChange = this.minerva.commitPinChange(uuid, new ApiCommitChangePinRequest(extractGalileoResponseCode(response)), continuation);
        return objCommitPinChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCommitPinChange : Unit.INSTANCE;
    }

    private final Observable<Optional<PaymentCard>> createActiveCardObservable(ApiMinervaAccount.Type accountType) {
        Observable<Optional<PaymentCard>> observableAutoConnect = this.minervaAccountStore.streamAccountOptional(accountType).map(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.createActiveCardObservable.1
            @Override // io.reactivex.functions.Function
            public final Optional<UUID> apply(Optional<MinervaAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                MinervaAccount minervaAccountComponent1 = optional.component1();
                return Optional3.asOptional(minervaAccountComponent1 != null ? minervaAccountComponent1.getDefaultCardId() : null);
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.store.PaymentCardStore.createActiveCardObservable.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<PaymentCard>> apply(Optional<UUID> optional) {
                Flow<PaymentCard> card;
                Flow<? extends T> optionals;
                Observable<T> observableAsObservable;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                UUID uuidComponent1 = optional.component1();
                return (uuidComponent1 == null || (card = PaymentCardStore.this.dao.getCard(uuidComponent1)) == null || (optionals = Operators.toOptionals(card)) == null || (observableAsObservable = PaymentCardStore.this.asObservable(optionals)) == null) ? Observable.just(Optional2.INSTANCE) : observableAsObservable;
            }
        }).replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        return observableAutoConnect;
    }

    private final String extractGalileoResponseCode(Response<Unit> response) {
        String strHeader;
        HttpUrl httpUrl;
        String strQueryParameter;
        HttpException httpException = new HttpException(Response.error(400, ResponseBody.INSTANCE.create("", MediaTypes.JSON_UTF8)));
        if (response.code() != 302 || (strHeader = Responses.header(response, Headers.LOCATION)) == null || (httpUrl = HttpUrl.INSTANCE.parse(strHeader)) == null || (strQueryParameter = httpUrl.queryParameter(Constants.REVENUE_AMOUNT_KEY)) == null) {
            throw httpException;
        }
        return strQueryParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GalileoImageRequest toApiRequest(CardImageConfiguration cardImageConfiguration) {
        int width = cardImageConfiguration.getSize().getWidth();
        int height = cardImageConfiguration.getSize().getHeight();
        GalileoImageRequest.Color.Companion companion = GalileoImageRequest.Color.INSTANCE;
        GalileoImageRequest.Color colorFrom = companion.from(cardImageConfiguration.getBackgroundColor());
        String serverValue = cardImageConfiguration.getTextAppearance().getFont().getServerValue();
        GalileoImageRequest.Color colorFrom2 = companion.from(cardImageConfiguration.getTextAppearance().getColor());
        GalileoImageRequest.CardNumberFieldOptions fieldOptions = toFieldOptions(cardImageConfiguration.getFields().getCardNumber(), cardImageConfiguration.getTextAppearance().getFont().getFontScale());
        CardImageConfiguration.TextLayout expirationDate = cardImageConfiguration.getFields().getExpirationDate();
        GalileoImageRequest.GenericFieldOptions fieldOptions2 = expirationDate != null ? toFieldOptions(expirationDate, cardImageConfiguration.getTextAppearance().getFont().getFontScale()) : null;
        CardImageConfiguration.TextLayout cvv = cardImageConfiguration.getFields().getCvv();
        GalileoImageRequest.GenericFieldOptions fieldOptions3 = cvv != null ? toFieldOptions(cvv, cardImageConfiguration.getTextAppearance().getFont().getFontScale()) : null;
        CardImageConfiguration.TextLayout name = cardImageConfiguration.getFields().getName();
        return new GalileoImageRequest(width, height, new GalileoImageRequest.TextOptions(serverValue, colorFrom2, new GalileoImageRequest.FieldsOptions(fieldOptions, fieldOptions2, fieldOptions3, name != null ? toFieldOptions(name, cardImageConfiguration.getTextAppearance().getFont().getFontScale()) : null)), colorFrom, 0, 16, null);
    }

    private final GalileoImageRequest.GenericFieldOptions toFieldOptions(CardImageConfiguration.TextLayout textLayout, float f) {
        int i = textLayout.getPosition().x;
        int i2 = textLayout.getPosition().y;
        Float angle = textLayout.getAngle();
        String prefix = textLayout.getPrefix();
        String suffix = textLayout.getSuffix();
        Float size = textLayout.getSize();
        return new GalileoImageRequest.GenericFieldOptions(i, i2, prefix, suffix, angle, size != null ? Float.valueOf(size.floatValue() / f) : null);
    }

    private final GalileoImageRequest.CardNumberFieldOptions toFieldOptions(CardImageConfiguration.CardNumberTextLayout cardNumberTextLayout, float f) {
        int i = cardNumberTextLayout.getPosition().x;
        int i2 = cardNumberTextLayout.getPosition().y;
        Float angle = cardNumberTextLayout.getAngle();
        String prefix = cardNumberTextLayout.getPrefix();
        String suffix = cardNumberTextLayout.getSuffix();
        Float size = cardNumberTextLayout.getSize();
        return new GalileoImageRequest.CardNumberFieldOptions(i, i2, prefix, suffix, angle, size != null ? Float.valueOf(size.floatValue() / f) : null, cardNumberTextLayout.getSeparator());
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/PaymentCardStore$CachedImage;", "", "cardId", "Ljava/util/UUID;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "image", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;Landroid/graphics/Bitmap;)V", "getCardId", "()Ljava/util/UUID;", "getConfiguration", "()Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "getImage", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class CachedImage {
        private final UUID cardId;
        private final CardImageConfiguration configuration;
        private final Bitmap image;

        public static /* synthetic */ CachedImage copy$default(CachedImage cachedImage, UUID uuid, CardImageConfiguration cardImageConfiguration, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cachedImage.cardId;
            }
            if ((i & 2) != 0) {
                cardImageConfiguration = cachedImage.configuration;
            }
            if ((i & 4) != 0) {
                bitmap = cachedImage.image;
            }
            return cachedImage.copy(uuid, cardImageConfiguration, bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCardId() {
            return this.cardId;
        }

        /* renamed from: component2, reason: from getter */
        public final CardImageConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        public final CachedImage copy(UUID cardId, CardImageConfiguration configuration, Bitmap image) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(image, "image");
            return new CachedImage(cardId, configuration, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedImage)) {
                return false;
            }
            CachedImage cachedImage = (CachedImage) other;
            return Intrinsics.areEqual(this.cardId, cachedImage.cardId) && Intrinsics.areEqual(this.configuration, cachedImage.configuration) && Intrinsics.areEqual(this.image, cachedImage.image);
        }

        public int hashCode() {
            return (((this.cardId.hashCode() * 31) + this.configuration.hashCode()) * 31) + this.image.hashCode();
        }

        public String toString() {
            return "CachedImage(cardId=" + this.cardId + ", configuration=" + this.configuration + ", image=" + this.image + ")";
        }

        public CachedImage(UUID cardId, CardImageConfiguration configuration, Bitmap image) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(image, "image");
            this.cardId = cardId;
            this.configuration = configuration;
            this.image = image;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final CardImageConfiguration getConfiguration() {
            return this.configuration;
        }

        public final Bitmap getImage() {
            return this.image;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpUrl createHttpUrl(HttpUrl url, GalileoImageRequest request) {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = lazyMoshi.adapter(new TypeToken<GalileoImageRequest>() { // from class: com.robinhood.librobinhood.store.PaymentCardStore$createHttpUrl$$inlined$getAdapter$1
        }.getType());
        Companion companion = INSTANCE;
        String json = jsonAdapterAdapter.toJson(request);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return url.newBuilder().removeAllQueryParameters("config").addEncodedQueryParameter("config", "sherwood").addEncodedQueryParameter("image", companion.encodeRequest(json)).build();
    }

    /* compiled from: PaymentCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/PaymentCardStore$Companion;", "", "<init>", "()V", "QUERY_PARAM", "", "ENCODING_FLAGS", "", "encodeRequest", "payload", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String encodeRequest(String payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = payload.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrEncode = Base64.encode(bytes, 9);
            Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
            return new String(bArrEncode, charset);
        }
    }
}
