package com.robinhood.librobinhood.data.store.alert;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.ApiAlertHubUiResources2;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertItemRequest;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertRequest;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateIndicatorAlertRequest;
import com.robinhood.models.advanced.alert.dao.AlertHubUiResourcesDao;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.dao.AdvancedAlertDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0&2\u0006\u0010+\u001a\u00020,J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0&J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0&2\u0006\u0010+\u001a\u00020,J&\u00100\u001a\u0002012\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b0&2\u0006\u00102\u001a\u00020\u0018J&\u00108\u001a\u0002012\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\u00182\u0006\u00105\u001a\u0002062\u0006\u00109\u001a\u00020:J0\u0010;\u001a\u0002012\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u0002042\u0006\u00109\u001a\u00020<2\b\b\u0002\u00105\u001a\u000206J\u0016\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CJ$\u0010G\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\u00182\u0006\u00109\u001a\u00020FJ\u0016\u0010I\u001a\u0002012\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CJ\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020MJ\u0010\u0010N\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R8\u0010\u0016\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R2\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010=\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020?0>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010D\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020F0E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010H\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020?0>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010J\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020K0>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "Lcom/robinhood/store/Store;", "advancedAlertApi", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "resourceDao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubUiResourcesDao;", "alertHubSettingsStore", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "<init>", "(Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AdvancedAlertDao;Lcom/robinhood/models/advanced/alert/dao/AlertHubUiResourcesDao;Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;)V", "defaultSaveAlertAction", "Lkotlin/Function2;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function2;", "saveAlertActionWithSettingsUpdate", "Lkotlin/Function3;", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "Lkotlin/jvm/functions/Function3;", "defaultSaveResourceAction", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/alert/GetApiParams;", "resourceEndpoint", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertResourceEntityType;", "createAlert", "Lcom/robinhood/librobinhood/data/store/alert/CreateAlertParams;", "updateAlert", "Lcom/robinhood/librobinhood/data/store/alert/UpdateAlertParams;", "streamAdvancedAlert", "Lio/reactivex/Observable;", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "entityId", "Ljava/util/UUID;", "streamAlertHubResource", "digest", "", "streamFirstAlertHubResource", "isDigestExist", "", "fetchAdvancedAlert", "Lio/reactivex/Completable;", "entityType", "sortingType", "Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "allowMultiple", "", "fetchAlertHubResource", "createAdvancedAlert", CarResultComposable2.BODY, "Lcom/robinhood/models/advanced/alert/api/ApiCreateAdvancedAlertSettingItemRequest;", "updateAdvancedAlert", "Lcom/robinhood/models/advanced/alert/api/ApiUpdateAdvancedAlertSettingItemRequest;", "createIndicatorAlert", "Lkotlin/Pair;", "Lcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertRequest;", "createIndicatorAdvancedAlert", "instrumentId", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertItemRequest;", "deleteIndicatorAlert", "Lkotlin/Triple;", "Lcom/robinhood/models/advanced/alert/api/ApiDeleteAdvancedAlertSettingRequest;", "deleteAdvancedAlert", "updateIndicatorAlert", "updateIndicatorAdvancedAlert", "toggleIndicatorAlert", "Lcom/robinhood/models/advanced/alert/api/ApiUpdateIndicatorAlertRequest;", "toggleIndicatorAdvancedAlert", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem;", "fetchAlertHubSettings", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AdvancedAlertStore extends Store {
    private final AdvancedAlertApi advancedAlertApi;
    private final AlertHubSettingsStore alertHubSettingsStore;
    private final Endpoint<CreateAlertParams, Optional<ApiAdvancedAlert>> createAlert;
    private final Endpoint<Tuples2<UUID, ApiCreateIndicatorAlertRequest>, Optional<ApiAdvancedAlert>> createIndicatorAlert;
    private final AdvancedAlertDao dao;
    private final Function2<Optional<ApiAdvancedAlert>, Continuation<? super Unit>, Object> defaultSaveAlertAction;
    private final Function2<Optional<AlertHubUiResources>, Continuation<? super Unit>, Object> defaultSaveResourceAction;
    private final Endpoint<Tuples3<ApiAdvancedAlert2, UUID, ApiDeleteAdvancedAlertSettingRequest>, Optional<ApiAdvancedAlert>> deleteIndicatorAlert;
    private final Endpoint<GetApiParams, Optional<ApiAdvancedAlert>> endpoint;
    private final AlertHubUiResourcesDao resourceDao;
    private final Endpoint<ApiAlertHubUiResources2, Optional<AlertHubUiResources>> resourceEndpoint;
    private final Function3<ApiAdvancedAlert2, Optional<ApiAdvancedAlert>, Continuation<? super Unit>, Object> saveAlertActionWithSettingsUpdate;
    private final Endpoint<Tuples2<UUID, ApiUpdateIndicatorAlertRequest>, Optional<ApiAdvancedAlert>> toggleIndicatorAlert;
    private final Endpoint<UpdateAlertParams, Optional<ApiAdvancedAlert>> updateAlert;
    private final Endpoint<Tuples2<UUID, ApiCreateIndicatorAlertRequest>, Optional<ApiAdvancedAlert>> updateIndicatorAlert;

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAdvancedAlert2.values().length];
            try {
                iArr[ApiAdvancedAlert2.INSTRUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAdvancedAlert2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAlertStore(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AdvancedAlertDao dao, AlertHubUiResourcesDao resourceDao, AlertHubSettingsStore alertHubSettingsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(resourceDao, "resourceDao");
        Intrinsics.checkNotNullParameter(alertHubSettingsStore, "alertHubSettingsStore");
        this.advancedAlertApi = advancedAlertApi;
        this.dao = dao;
        this.resourceDao = resourceDao;
        this.alertHubSettingsStore = alertHubSettingsStore;
        AdvancedAlertStore$defaultSaveAlertAction$1 advancedAlertStore$defaultSaveAlertAction$1 = new AdvancedAlertStore$defaultSaveAlertAction$1(this, null);
        this.defaultSaveAlertAction = advancedAlertStore$defaultSaveAlertAction$1;
        this.saveAlertActionWithSettingsUpdate = new AdvancedAlertStore$saveAlertActionWithSettingsUpdate$1(this, null);
        AdvancedAlertStore$defaultSaveResourceAction$1 advancedAlertStore$defaultSaveResourceAction$1 = new AdvancedAlertStore$defaultSaveResourceAction$1(this, null);
        this.defaultSaveResourceAction = advancedAlertStore$defaultSaveResourceAction$1;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.endpoint = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$endpoint$1(this, null), getLogoutKillswitch(), advancedAlertStore$defaultSaveAlertAction$1, storeBundle.getClock(), null, 16, null);
        this.resourceEndpoint = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$resourceEndpoint$1(this, null), getLogoutKillswitch(), advancedAlertStore$defaultSaveResourceAction$1, storeBundle.getClock(), null, 16, null);
        this.createAlert = Endpoint.Companion.createWithParams$default(companion, new AdvancedAlertStore$createAlert$1(this, null), getLogoutKillswitch(), new AdvancedAlertStore$createAlert$2(this, null), storeBundle.getClock(), null, 16, null);
        this.updateAlert = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$updateAlert$1(this, null), getLogoutKillswitch(), advancedAlertStore$defaultSaveAlertAction$1, storeBundle.getClock(), null, 16, null);
        this.createIndicatorAlert = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$createIndicatorAlert$1(this, null), getLogoutKillswitch(), new AdvancedAlertStore$createIndicatorAlert$2(this, null), storeBundle.getClock(), null, 16, null);
        this.deleteIndicatorAlert = Endpoint.Companion.createWithParams$default(companion, new AdvancedAlertStore$deleteIndicatorAlert$1(this, null), getLogoutKillswitch(), new AdvancedAlertStore$deleteIndicatorAlert$2(this, null), storeBundle.getClock(), null, 16, null);
        this.updateIndicatorAlert = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$updateIndicatorAlert$1(this, null), getLogoutKillswitch(), advancedAlertStore$defaultSaveAlertAction$1, storeBundle.getClock(), null, 16, null);
        this.toggleIndicatorAlert = Endpoint.Companion.create$default(companion, new AdvancedAlertStore$toggleIndicatorAlert$1(this, null), getLogoutKillswitch(), advancedAlertStore$defaultSaveAlertAction$1, storeBundle.getClock(), null, 16, null);
    }

    public final Observable<AdvancedAlert> streamAdvancedAlert(UUID entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAdvancedAlert(entityId))));
    }

    public final Observable<AlertHubUiResources> streamAlertHubResource(String digest) {
        Intrinsics.checkNotNullParameter(digest, "digest");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.resourceDao.getAlertHubUiResources(digest))));
    }

    public final Observable<AlertHubUiResources> streamFirstAlertHubResource() {
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.resourceDao.getFirstAlertHubUiResources())));
    }

    public final Observable<Integer> isDigestExist(String digest) {
        Intrinsics.checkNotNullParameter(digest, "digest");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.resourceDao.isDigestExist(digest))));
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$fetchAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$fetchAdvancedAlert$1 */
    static final class C344391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $allowMultiple;
        final /* synthetic */ UUID $entityId;
        final /* synthetic */ ApiAdvancedAlert2 $entityType;
        final /* synthetic */ SortingType $sortingType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344391(UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, SortingType sortingType, boolean z, Continuation<? super C344391> continuation) {
            super(2, continuation);
            this.$entityId = uuid;
            this.$entityType = apiAdvancedAlert2;
            this.$sortingType = sortingType;
            this.$allowMultiple = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344391(this.$entityId, this.$entityType, this.$sortingType, this.$allowMultiple, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdvancedAlertStore.this.endpoint;
                GetApiParams getApiParams = new GetApiParams(this.$entityId, this.$entityType, this.$sortingType, this.$allowMultiple);
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, getApiParams, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable fetchAdvancedAlert(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, boolean allowMultiple) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344391(entityId, entityType, sortingType, allowMultiple, null), 1, null);
    }

    public final Observable<AlertHubUiResources> fetchAlertHubResource(ApiAdvancedAlert2 entityType) {
        ApiAlertHubUiResources2 apiAlertHubUiResources2;
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        int i = WhenMappings.$EnumSwitchMapping$0[entityType.ordinal()];
        if (i == 1) {
            apiAlertHubUiResources2 = ApiAlertHubUiResources2.STOCKS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            apiAlertHubUiResources2 = ApiAlertHubUiResources2.CRYPTO;
        }
        Observable<AlertHubUiResources> observableSwitchMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344401(apiAlertHubUiResources2, null), 1, null).toObservable().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore.fetchAlertHubResource.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AlertHubUiResources> apply(Optional<AlertHubUiResources> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                AlertHubUiResources alertHubUiResourcesComponent1 = optional.component1();
                if (alertHubUiResourcesComponent1 != null) {
                    return Observable.just(alertHubUiResourcesComponent1);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$fetchAlertHubResource$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$fetchAlertHubResource$1 */
    static final class C344401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends AlertHubUiResources>>, Object> {
        final /* synthetic */ ApiAlertHubUiResources2 $resourceEntityType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344401(ApiAlertHubUiResources2 apiAlertHubUiResources2, Continuation<? super C344401> continuation) {
            super(2, continuation);
            this.$resourceEntityType = apiAlertHubUiResources2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344401(this.$resourceEntityType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends AlertHubUiResources>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<AlertHubUiResources>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<AlertHubUiResources>> continuation) {
            return ((C344401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AdvancedAlertStore.this.resourceEndpoint;
            ApiAlertHubUiResources2 apiAlertHubUiResources2 = this.$resourceEntityType;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, apiAlertHubUiResources2, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createAdvancedAlert$1 */
    static final class C344351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $allowMultiple;
        final /* synthetic */ ApiCreateAdvancedAlertSettingItemRequest $body;
        final /* synthetic */ UUID $entityId;
        final /* synthetic */ ApiAdvancedAlert2 $entityType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344351(UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, boolean z, ApiCreateAdvancedAlertSettingItemRequest apiCreateAdvancedAlertSettingItemRequest, Continuation<? super C344351> continuation) {
            super(2, continuation);
            this.$entityId = uuid;
            this.$entityType = apiAdvancedAlert2;
            this.$allowMultiple = z;
            this.$body = apiCreateAdvancedAlertSettingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344351(this.$entityId, this.$entityType, this.$allowMultiple, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdvancedAlertStore.this.createAlert;
                CreateAlertParams createAlertParams = new CreateAlertParams(this.$entityId, this.$entityType, this.$allowMultiple, new ApiCreateAdvancedAlertSettingRequest(CollectionsKt.listOf(this.$body)));
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, createAlertParams, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable createAdvancedAlert(UUID entityId, ApiAdvancedAlert2 entityType, boolean allowMultiple, ApiCreateAdvancedAlertSettingItemRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(body, "body");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344351(entityId, entityType, allowMultiple, body, null), 1, null);
    }

    public static /* synthetic */ Completable updateAdvancedAlert$default(AdvancedAlertStore advancedAlertStore, UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, SortingType sortingType, ApiUpdateAdvancedAlertSettingItemRequest apiUpdateAdvancedAlertSettingItemRequest, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return advancedAlertStore.updateAdvancedAlert(uuid, apiAdvancedAlert2, sortingType, apiUpdateAdvancedAlertSettingItemRequest, z);
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$updateAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {204}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$updateAdvancedAlert$1 */
    static final class C344441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $allowMultiple;
        final /* synthetic */ ApiUpdateAdvancedAlertSettingItemRequest $body;
        final /* synthetic */ UUID $entityId;
        final /* synthetic */ ApiAdvancedAlert2 $entityType;
        final /* synthetic */ SortingType $sortingType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344441(UUID uuid, ApiAdvancedAlert2 apiAdvancedAlert2, SortingType sortingType, boolean z, ApiUpdateAdvancedAlertSettingItemRequest apiUpdateAdvancedAlertSettingItemRequest, Continuation<? super C344441> continuation) {
            super(2, continuation);
            this.$entityId = uuid;
            this.$entityType = apiAdvancedAlert2;
            this.$sortingType = sortingType;
            this.$allowMultiple = z;
            this.$body = apiUpdateAdvancedAlertSettingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344441(this.$entityId, this.$entityType, this.$sortingType, this.$allowMultiple, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdvancedAlertStore.this.updateAlert;
                UpdateAlertParams updateAlertParams = new UpdateAlertParams(this.$entityId, this.$entityType, this.$sortingType, this.$allowMultiple, new ApiUpdateAdvancedAlertSettingRequest(CollectionsKt.listOf(this.$body)));
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, updateAlertParams, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable updateAdvancedAlert(UUID entityId, ApiAdvancedAlert2 entityType, SortingType sortingType, ApiUpdateAdvancedAlertSettingItemRequest body, boolean allowMultiple) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(body, "body");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344441(entityId, entityType, sortingType, allowMultiple, body, null), 1, null);
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createIndicatorAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createIndicatorAdvancedAlert$1 */
    static final class C344361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ ApiCreateIndicatorAlertItemRequest $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344361(UUID uuid, ApiCreateIndicatorAlertItemRequest apiCreateIndicatorAlertItemRequest, Continuation<? super C344361> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$item = apiCreateIndicatorAlertItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344361(this.$instrumentId, this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdvancedAlertStore.this.createIndicatorAlert;
                Tuples2 tuples2 = new Tuples2(this.$instrumentId, new ApiCreateIndicatorAlertRequest(CollectionsKt.listOf(this.$item)));
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable createIndicatorAdvancedAlert(UUID instrumentId, ApiCreateIndicatorAlertItemRequest item) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(item, "item");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344361(instrumentId, item, null), 1, null);
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$deleteAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {280}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$deleteAdvancedAlert$1 */
    static final class C344371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiAdvancedAlert>>, Object> {
        final /* synthetic */ ApiDeleteAdvancedAlertSettingRequest $body;
        final /* synthetic */ UUID $entityId;
        final /* synthetic */ ApiAdvancedAlert2 $entityType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344371(ApiAdvancedAlert2 apiAdvancedAlert2, UUID uuid, ApiDeleteAdvancedAlertSettingRequest apiDeleteAdvancedAlertSettingRequest, Continuation<? super C344371> continuation) {
            super(2, continuation);
            this.$entityType = apiAdvancedAlert2;
            this.$entityId = uuid;
            this.$body = apiDeleteAdvancedAlertSettingRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344371(this.$entityType, this.$entityId, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiAdvancedAlert>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ApiAdvancedAlert>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiAdvancedAlert>> continuation) {
            return ((C344371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AdvancedAlertStore.this.deleteIndicatorAlert;
            Tuples3 tuples3 = new Tuples3(this.$entityType, this.$entityId, this.$body);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples3, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Observable<AdvancedAlert> deleteAdvancedAlert(UUID entityId, ApiAdvancedAlert2 entityType, ApiDeleteAdvancedAlertSettingRequest body) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(body, "body");
        Observable<AdvancedAlert> observableSwitchMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344371(entityType, entityId, body, null), 1, null).toObservable().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore.deleteAdvancedAlert.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AdvancedAlert> apply(Optional<ApiAdvancedAlert> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiAdvancedAlert apiAdvancedAlertComponent1 = optional.component1();
                if (apiAdvancedAlertComponent1 != null) {
                    return Observable.just(apiAdvancedAlertComponent1.toDbModel());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$updateIndicatorAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$updateIndicatorAdvancedAlert$1 */
    static final class C344451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ ApiCreateIndicatorAlertItemRequest $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344451(UUID uuid, ApiCreateIndicatorAlertItemRequest apiCreateIndicatorAlertItemRequest, Continuation<? super C344451> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$item = apiCreateIndicatorAlertItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344451(this.$instrumentId, this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdvancedAlertStore.this.updateIndicatorAlert;
                Tuples2 tuples2 = new Tuples2(this.$instrumentId, new ApiCreateIndicatorAlertRequest(CollectionsKt.listOf(this.$item)));
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable updateIndicatorAdvancedAlert(UUID instrumentId, ApiCreateIndicatorAlertItemRequest item) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(item, "item");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344451(instrumentId, item, null), 1, null);
    }

    /* compiled from: AdvancedAlertStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$toggleIndicatorAdvancedAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {347}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$toggleIndicatorAdvancedAlert$1 */
    static final class C344421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiAdvancedAlert>>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ ApiAlertHubSettingItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344421(UUID uuid, ApiAlertHubSettingItem apiAlertHubSettingItem, Continuation<? super C344421> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$item = apiAlertHubSettingItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedAlertStore.this.new C344421(this.$instrumentId, this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiAdvancedAlert>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ApiAdvancedAlert>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiAdvancedAlert>> continuation) {
            return ((C344421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = AdvancedAlertStore.this.toggleIndicatorAlert;
            Tuples2 tuples2 = new Tuples2(this.$instrumentId, new ApiUpdateIndicatorAlertRequest(CollectionsKt.listOf(this.$item)));
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Observable<AdvancedAlert> toggleIndicatorAdvancedAlert(UUID instrumentId, ApiAlertHubSettingItem item) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(item, "item");
        Observable<AdvancedAlert> observableSwitchMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344421(instrumentId, item, null), 1, null).toObservable().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore.toggleIndicatorAdvancedAlert.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AdvancedAlert> apply(Optional<ApiAdvancedAlert> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiAdvancedAlert apiAdvancedAlertComponent1 = optional.component1();
                if (apiAdvancedAlertComponent1 != null) {
                    return Observable.just(apiAdvancedAlertComponent1.toDbModel());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchAlertHubSettings(ApiAdvancedAlert2 entityType) {
        AlertHubSettings2 alertHubSettings2;
        AlertHubSettingsStore alertHubSettingsStore = this.alertHubSettingsStore;
        int i = WhenMappings.$EnumSwitchMapping$0[entityType.ordinal()];
        if (i == 1) {
            alertHubSettings2 = AlertHubSettings2.STOCK;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alertHubSettings2 = AlertHubSettings2.CRYPTO;
        }
        alertHubSettingsStore.fetchAlertHubSettings(alertHubSettings2);
    }
}
