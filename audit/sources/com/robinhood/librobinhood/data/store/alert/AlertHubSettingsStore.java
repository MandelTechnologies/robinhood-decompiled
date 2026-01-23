package com.robinhood.librobinhood.data.store.alert;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.advanced.alert.dao.AlertHubSettingsDao;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.dao.AdvancedAlertDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AlertHubSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0$2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R8\u0010\u0014\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "Lcom/robinhood/store/Store;", "advancedAlertApi", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubSettingsDao;", "advancedAlertDao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "<init>", "(Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/advanced/alert/dao/AlertHubSettingsDao;Lcom/robinhood/models/dao/AdvancedAlertDao;)V", "defaultSaveSettingsAction", "Lkotlin/Function2;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function2;", "deleteSaveSettingsAction", "Lkotlin/Function3;", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$DeleteApiParams;", "Lkotlin/jvm/functions/Function3;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$GetApiParams;", "deleteEndpoint", "fetchAlertHubSettings", "Lio/reactivex/Completable;", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "deleteAlertHubSettingsItem", "entityId", "Ljava/util/UUID;", "streamAlertHubSettings", "Lio/reactivex/Observable;", "GetApiParams", "DeleteApiParams", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AlertHubSettingsStore extends Store {
    private final AdvancedAlertApi advancedAlertApi;
    private final AdvancedAlertDao advancedAlertDao;
    private final AlertHubSettingsDao dao;
    private final Function2<Optional<AlertHubSettings>, Continuation<? super Unit>, Object> defaultSaveSettingsAction;
    private final Endpoint<DeleteApiParams, Optional<AlertHubSettings>> deleteEndpoint;
    private final Function3<DeleteApiParams, Optional<AlertHubSettings>, Continuation<? super Unit>, Object> deleteSaveSettingsAction;
    private final Endpoint<GetApiParams, Optional<AlertHubSettings>> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertHubSettingsStore(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AlertHubSettingsDao dao, AdvancedAlertDao advancedAlertDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(advancedAlertDao, "advancedAlertDao");
        this.advancedAlertApi = advancedAlertApi;
        this.dao = dao;
        this.advancedAlertDao = advancedAlertDao;
        AlertHubSettingsStore2 alertHubSettingsStore2 = new AlertHubSettingsStore2(this, null);
        this.defaultSaveSettingsAction = alertHubSettingsStore2;
        AlertHubSettingsStore4 alertHubSettingsStore4 = new AlertHubSettingsStore4(this, null);
        this.deleteSaveSettingsAction = alertHubSettingsStore4;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.endpoint = Endpoint.Companion.create$default(companion, new AlertHubSettingsStore5(this, null), getLogoutKillswitch(), alertHubSettingsStore2, storeBundle.getClock(), null, 16, null);
        this.deleteEndpoint = Endpoint.Companion.createWithParams$default(companion, new AlertHubSettingsStore3(this, null), getLogoutKillswitch(), alertHubSettingsStore4, storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: AlertHubSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$fetchAlertHubSettings$1", m3645f = "AlertHubSettingsStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$fetchAlertHubSettings$1 */
    static final class C344471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AlertHubSettings2 $entityType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344471(AlertHubSettings2 alertHubSettings2, Continuation<? super C344471> continuation) {
            super(2, continuation);
            this.$entityType = alertHubSettings2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlertHubSettingsStore.this.new C344471(this.$entityType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AlertHubSettingsStore.this.endpoint;
                GetApiParams getApiParams = new GetApiParams(this.$entityType);
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

    public final Completable fetchAlertHubSettings(AlertHubSettings2 entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344471(entityType, null), 1, null);
    }

    /* compiled from: AlertHubSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteAlertHubSettingsItem$1", m3645f = "AlertHubSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore$deleteAlertHubSettingsItem$1 */
    static final class C344461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $entityId;
        final /* synthetic */ AlertHubSettings2 $entityType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344461(UUID uuid, AlertHubSettings2 alertHubSettings2, Continuation<? super C344461> continuation) {
            super(2, continuation);
            this.$entityId = uuid;
            this.$entityType = alertHubSettings2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlertHubSettingsStore.this.new C344461(this.$entityId, this.$entityType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AlertHubSettingsStore.this.deleteEndpoint;
                DeleteApiParams deleteApiParams = new DeleteApiParams(this.$entityId, this.$entityType);
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, deleteApiParams, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable deleteAlertHubSettingsItem(UUID entityId, AlertHubSettings2 entityType) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344461(entityId, entityType, null), 1, null);
    }

    public final Observable<AlertHubSettings> streamAlertHubSettings(AlertHubSettings2 entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAdvancedAlertHubSettings(entityType))));
    }

    /* compiled from: AlertHubSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$GetApiParams;", "", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;)V", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetApiParams {
        private final AlertHubSettings2 entityType;

        public static /* synthetic */ GetApiParams copy$default(GetApiParams getApiParams, AlertHubSettings2 alertHubSettings2, int i, Object obj) {
            if ((i & 1) != 0) {
                alertHubSettings2 = getApiParams.entityType;
            }
            return getApiParams.copy(alertHubSettings2);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }

        public final GetApiParams copy(AlertHubSettings2 entityType) {
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            return new GetApiParams(entityType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetApiParams) && this.entityType == ((GetApiParams) other).entityType;
        }

        public int hashCode() {
            return this.entityType.hashCode();
        }

        public String toString() {
            return "GetApiParams(entityType=" + this.entityType + ")";
        }

        public GetApiParams(AlertHubSettings2 entityType) {
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            this.entityType = entityType;
        }

        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }
    }

    /* compiled from: AlertHubSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore$DeleteApiParams;", "", "entityId", "Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;)V", "getEntityId", "()Ljava/util/UUID;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DeleteApiParams {
        private final UUID entityId;
        private final AlertHubSettings2 entityType;

        public static /* synthetic */ DeleteApiParams copy$default(DeleteApiParams deleteApiParams, UUID uuid, AlertHubSettings2 alertHubSettings2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = deleteApiParams.entityId;
            }
            if ((i & 2) != 0) {
                alertHubSettings2 = deleteApiParams.entityType;
            }
            return deleteApiParams.copy(uuid, alertHubSettings2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEntityId() {
            return this.entityId;
        }

        /* renamed from: component2, reason: from getter */
        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }

        public final DeleteApiParams copy(UUID entityId, AlertHubSettings2 entityType) {
            Intrinsics.checkNotNullParameter(entityId, "entityId");
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            return new DeleteApiParams(entityId, entityType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteApiParams)) {
                return false;
            }
            DeleteApiParams deleteApiParams = (DeleteApiParams) other;
            return Intrinsics.areEqual(this.entityId, deleteApiParams.entityId) && this.entityType == deleteApiParams.entityType;
        }

        public int hashCode() {
            return (this.entityId.hashCode() * 31) + this.entityType.hashCode();
        }

        public String toString() {
            return "DeleteApiParams(entityId=" + this.entityId + ", entityType=" + this.entityType + ")";
        }

        public DeleteApiParams(UUID entityId, AlertHubSettings2 entityType) {
            Intrinsics.checkNotNullParameter(entityId, "entityId");
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            this.entityId = entityId;
            this.entityType = entityType;
        }

        public final UUID getEntityId() {
            return this.entityId;
        }

        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }
    }
}
