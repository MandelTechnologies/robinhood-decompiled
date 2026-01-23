package com.robinhood.librobinhood.data.store.identi;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.engagement.crypto.impression.HasCryptoImpressionPref;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.dao.SortingHatDaoV2;
import com.robinhood.models.dao.identi.SortingHatUserStateDao;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.AsyncResult2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.singular.sdk.internal.Constants;
import com.squareup.moshi.JsonDataException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Duration;

/* compiled from: BaseSortingHatStore.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011JA\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0011J!\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010\u0011J\r\u0010)\u001a\u00020\"¢\u0006\u0004\b)\u0010&J\r\u0010*\u001a\u00020\"¢\u0006\u0004\b*\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R0\u00103\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001201j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\"0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u000f0\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0018\u0010?\u001a\u00020\u0012*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010A¨\u0006B"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/models/dao/SortingHatDaoV2;", "sortingHatDao", "Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;", "userStateDao", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/models/dao/SortingHatDaoV2;Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "args", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "streamLocalSortingHatRecord", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lcom/robinhood/store/AsyncResult;", "getSortingHatRecordFromNetwork", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Z)Lkotlinx/coroutines/flow/Flow;", "pollEndpoint", "networkStream", "shouldEmitInvestedStream", "combineStreams", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Lkotlinx/coroutines/flow/Flow;Z)Lkotlinx/coroutines/flow/Flow;", "getSortingHatRecord", "(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatUserState;", "getUserState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/moria/db/Query;", "", "streamUserState", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "()V", "pollSortingHatExperience", "refreshAndStreamSortingHatExperienceWithCache", "refreshSortingHatForDocUploadBestEffort", "invalidateSortingHatCacheIfNeeded", "Lcom/robinhood/models/dao/SortingHatDaoV2;", "Lcom/robinhood/models/dao/identi/SortingHatUserStateDao;", "Lcom/robinhood/prefs/BooleanPreference;", "j$/time/Duration", "sortingHatRefreshAfterDocUploadDuration", "Lj$/time/Duration;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sortingHatRecordInvestedMap", "Ljava/util/HashMap;", "Lcom/robinhood/android/moria/network/Endpoint;", "getSortingHatUserStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "queryUserState", "Lcom/robinhood/android/moria/db/Query;", "getSortingHatExperienceEndpoint", "getSortingHatExperienceWithDynamicStaleEndpoint", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "refreshFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "isInvested", "(Lcom/robinhood/store/AsyncResult;)Z", "(Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;)Z", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public abstract class BaseSortingHatStore extends Store {
    private final Endpoint<SortingHatQueryArgs, SortingHatRecord> getSortingHatExperienceEndpoint;
    private final Endpoint<SortingHatQueryArgs, SortingHatRecord> getSortingHatExperienceWithDynamicStaleEndpoint;
    private final Endpoint<Unit, SortingHatUserState> getSortingHatUserStateEndpoint;
    private final BooleanPreference hasCryptoImpressionPref;
    private final Query<Unit, SortingHatUserState> queryUserState;
    private final SharedFlow2<Unit> refreshFlow;
    private final SortingHatDaoV2 sortingHatDao;
    private final HashMap<SortingHatQueryArgs, Boolean> sortingHatRecordInvestedMap;
    private final Duration sortingHatRefreshAfterDocUploadDuration;
    private final SortingHatUserStateDao userStateDao;

    public abstract Object getSortingHatRecord(SortingHatQueryArgs sortingHatQueryArgs, Continuation<? super SortingHatRecord> continuation);

    public abstract Object getUserState(Continuation<? super SortingHatUserState> continuation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSortingHatStore(SortingHatDaoV2 sortingHatDao, SortingHatUserStateDao userStateDao, @HasCryptoImpressionPref BooleanPreference hasCryptoImpressionPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sortingHatDao, "sortingHatDao");
        Intrinsics.checkNotNullParameter(userStateDao, "userStateDao");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.sortingHatDao = sortingHatDao;
        this.userStateDao = userStateDao;
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.sortingHatRefreshAfterDocUploadDuration = durationOfSeconds;
        this.sortingHatRecordInvestedMap = new HashMap<>();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getSortingHatUserStateEndpoint = Endpoint.Companion.create$default(companion, new BaseSortingHatStore7(this, null), getLogoutKillswitch(), new BaseSortingHatStore8(userStateDao), storeBundle.getClock(), null, 16, null);
        this.queryUserState = Store.create$default(this, Query.INSTANCE, "streamUserState", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSortingHatStore.queryUserState$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSortingHatStore.queryUserState$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.getSortingHatExperienceEndpoint = Endpoint.Companion.create$default(companion, new BaseSortingHatStore2(this), getLogoutKillswitch(), new BaseSortingHatStore3(sortingHatDao), storeBundle.getClock(), null, 16, null);
        this.getSortingHatExperienceWithDynamicStaleEndpoint = companion.createWithParams(new BaseSortingHatStore4(this), getLogoutKillswitch(), new BaseSortingHatStore5(this, null), new BaseSortingHatStore6(this, storeBundle, null), storeBundle.getClock());
        this.refreshFlow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getSortingHatUserStateEndpoint$insert(SortingHatUserStateDao sortingHatUserStateDao, SortingHatUserState sortingHatUserState, Continuation continuation) {
        sortingHatUserStateDao.insert(sortingHatUserState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryUserState$lambda$0(BaseSortingHatStore baseSortingHatStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(baseSortingHatStore.getSortingHatUserStateEndpoint, Unit.INSTANCE, Durations.INSTANCE.getONE_HOUR(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryUserState$lambda$1(BaseSortingHatStore baseSortingHatStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return baseSortingHatStore.userStateDao.getUserState();
    }

    public final Query<Unit, SortingHatUserState> streamUserState() {
        CrashReporter.INSTANCE.log("Stream user state");
        return this.queryUserState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getSortingHatExperienceEndpoint$insert$2(SortingHatDaoV2 sortingHatDaoV2, SortingHatRecord sortingHatRecord, Continuation continuation) {
        sortingHatDaoV2.insert(sortingHatRecord);
        return Unit.INSTANCE;
    }

    public final void refresh() {
        if (!this.refreshFlow.tryEmit(Unit.INSTANCE)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<SortingHatRecord> streamLocalSortingHatRecord(SortingHatQueryArgs args) {
        SortingHatDaoV2 sortingHatDaoV2 = this.sortingHatDao;
        String applicationId = args.getApplicationId();
        if (applicationId == null) {
            applicationId = SortingHatRecord.NO_APPLICATION_ID;
        }
        String accountNumber = args.getAccountNumber();
        if (accountNumber == null) {
            accountNumber = SortingHatRecord.NO_ACCOUNT_NUMBER;
        }
        return FlowKt.retryWhen(sortingHatDaoV2.streamSortingHatRecord(applicationId, accountNumber, args.getHasCryptoImpression()), new C348291(null));
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "cause", "", "attempt", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$streamLocalSortingHatRecord$1", m3645f = "BaseSortingHatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$streamLocalSortingHatRecord$1 */
    /* loaded from: classes13.dex */
    static final class C348291 extends ContinuationImpl7 implements Function4<FlowCollector<? super SortingHatRecord>, Throwable, Long, Continuation<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        C348291(Continuation<? super C348291> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super SortingHatRecord> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super SortingHatRecord> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            C348291 c348291 = BaseSortingHatStore.this.new C348291(continuation);
            c348291.L$0 = th;
            c348291.J$0 = j;
            return c348291.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            long j = this.J$0;
            JsonDataException jsonDataException = (JsonDataException) Throwables.findCause(th, JsonDataException.class);
            Boolean boolBoxBoolean = boxing.boxBoolean(jsonDataException != null && j < 3);
            BaseSortingHatStore baseSortingHatStore = BaseSortingHatStore.this;
            boolean zBooleanValue = boolBoxBoolean.booleanValue();
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Sorting hat dao failed to parse JSON", jsonDataException), false, null, 6, null);
            if (zBooleanValue) {
                baseSortingHatStore.sortingHatDao.deleteEverything();
            }
            return boolBoxBoolean;
        }
    }

    static /* synthetic */ Flow getSortingHatRecordFromNetwork$default(BaseSortingHatStore baseSortingHatStore, SortingHatQueryArgs sortingHatQueryArgs, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSortingHatRecordFromNetwork");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return baseSortingHatStore.getSortingHatRecordFromNetwork(sortingHatQueryArgs, z);
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatRecordFromNetwork$1", m3645f = "BaseSortingHatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 147, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 150, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatRecordFromNetwork$1 */
    /* loaded from: classes13.dex */
    static final class C348241 extends ContinuationImpl7 implements Function2<FlowCollector<? super AsyncResult<? extends SortingHatRecord>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ SortingHatQueryArgs $args;
        final /* synthetic */ boolean $force;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348241(SortingHatQueryArgs sortingHatQueryArgs, boolean z, Continuation<? super C348241> continuation) {
            super(2, continuation);
            this.$args = sortingHatQueryArgs;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C348241 c348241 = BaseSortingHatStore.this.new C348241(this.$args, this.$force, continuation);
            c348241.L$0 = obj;
            return c348241;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends SortingHatRecord>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<SortingHatRecord>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<SortingHatRecord>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C348241) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        
            if (r14 != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
        
            if (r2.emit(r0, r13) != r1) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
        
            if (r2.emit(r14, r13) == r1) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[Catch: Exception -> 0x00bc, TryCatch #1 {Exception -> 0x00bc, blocks: (B:39:0x00a7, B:41:0x00ab, B:51:0x00d9, B:36:0x00a0, B:48:0x00c2), top: B:68:0x0006 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C348241 c348241;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            SortingHatRecord sortingHatRecord;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                try {
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                c348241 = this;
                AsyncResult.Failure failure = new AsyncResult.Failure(e);
                c348241.L$0 = e;
                c348241.label = 7;
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector2 = (FlowCollector) this.L$0;
                    AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    if (flowCollector2.emit(loading, this) != coroutine_suspended) {
                        Flow flowStreamLocalSortingHatRecord = BaseSortingHatStore.this.streamLocalSortingHatRecord(this.$args);
                        this.L$0 = flowCollector2;
                        this.label = 2;
                        obj = FlowKt.first(flowStreamLocalSortingHatRecord, this);
                        break;
                    }
                    return coroutine_suspended;
                case 1:
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamLocalSortingHatRecord2 = BaseSortingHatStore.this.streamLocalSortingHatRecord(this.$args);
                    this.L$0 = flowCollector2;
                    this.label = 2;
                    obj = FlowKt.first(flowStreamLocalSortingHatRecord2, this);
                    break;
                case 2:
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                    SortingHatRecord sortingHatRecord2 = (SortingHatRecord) obj;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        c348241 = this;
                        AsyncResult.Failure failure2 = new AsyncResult.Failure(e);
                        c348241.L$0 = e;
                        c348241.label = 7;
                        break;
                    }
                    if (this.$force || sortingHatRecord2 == null) {
                        c348241 = this;
                        Endpoint endpoint = BaseSortingHatStore.this.getSortingHatExperienceWithDynamicStaleEndpoint;
                        SortingHatQueryArgs sortingHatQueryArgs = c348241.$args;
                        c348241.L$0 = flowCollector;
                        c348241.label = 3;
                        obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, sortingHatQueryArgs, null, c348241, 2, null);
                        if (obj != coroutine_suspended) {
                            AsyncResult.Success success = new AsyncResult.Success((SortingHatRecord) obj);
                            c348241.L$0 = flowCollector;
                            c348241.label = 4;
                            break;
                        }
                    } else {
                        Endpoint endpoint2 = BaseSortingHatStore.this.getSortingHatExperienceWithDynamicStaleEndpoint;
                        SortingHatQueryArgs sortingHatQueryArgs2 = this.$args;
                        this.L$0 = flowCollector;
                        this.label = 5;
                        c348241 = this;
                        obj = Endpoint.DefaultImpls.fetch$default(endpoint2, sortingHatQueryArgs2, null, c348241, 2, null);
                        if (obj != coroutine_suspended) {
                            sortingHatRecord = (SortingHatRecord) obj;
                            if (sortingHatRecord != null) {
                                AsyncResult.Success success2 = new AsyncResult.Success(sortingHatRecord);
                                c348241.L$0 = flowCollector;
                                c348241.label = 6;
                                if (flowCollector.emit(success2, this) == coroutine_suspended) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c348241 = this;
                    AsyncResult.Success success3 = new AsyncResult.Success((SortingHatRecord) obj);
                    c348241.L$0 = flowCollector;
                    c348241.label = 4;
                    break;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c348241 = this;
                    sortingHatRecord = (SortingHatRecord) obj;
                    if (sortingHatRecord != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 7:
                    e = (Exception) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Exception exc = e;
                    Integer httpStatusCode = Throwables.getHttpStatusCode(exc);
                    if (httpStatusCode != null && httpStatusCode.intValue() == 500) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AsyncResult<SortingHatRecord>> getSortingHatRecordFromNetwork(SortingHatQueryArgs args, boolean force) {
        return FlowKt.flow(new C348241(args, force, null));
    }

    private final Flow<AsyncResult<SortingHatRecord>> pollEndpoint(SortingHatQueryArgs args) {
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.getSortingHatExperienceEndpoint, args, null, null, 6, null);
        return FlowKt.m28818catch(FlowKt.onStart(new Flow<AsyncResult<? extends SortingHatRecord>>() { // from class: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AsyncResult<? extends SortingHatRecord>> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C348172(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$$inlined$map$1$2 */
            public static final class C348172<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$$inlined$map$1$2", m3645f = "BaseSortingHatStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C348172.this.emit(null, this);
                    }
                }

                public C348172(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        AsyncResult.Success success = new AsyncResult.Success((SortingHatRecord) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new C348262(null)), new C348273(null));
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$2", m3645f = "BaseSortingHatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$2 */
    /* loaded from: classes13.dex */
    static final class C348262 extends ContinuationImpl7 implements Function2<FlowCollector<? super AsyncResult<? extends SortingHatRecord>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C348262(Continuation<? super C348262> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C348262 c348262 = new C348262(continuation);
            c348262.L$0 = obj;
            return c348262;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends SortingHatRecord>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<SortingHatRecord>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<SortingHatRecord>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C348262) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
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

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$3", m3645f = "BaseSortingHatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$pollEndpoint$3 */
    /* loaded from: classes13.dex */
    static final class C348273 extends ContinuationImpl7 implements Function3<FlowCollector<? super AsyncResult<? extends SortingHatRecord>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C348273(Continuation<? super C348273> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends SortingHatRecord>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<SortingHatRecord>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<SortingHatRecord>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C348273 c348273 = new C348273(continuation);
            c348273.L$0 = flowCollector;
            c348273.L$1 = th;
            return c348273.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                AsyncResult.Failure failure = new AsyncResult.Failure(th2);
                this.L$0 = th2;
                this.label = 1;
                if (flowCollector.emit(failure, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th = th2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th3 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                th = th3;
            }
            Integer httpStatusCode = Throwables.getHttpStatusCode(th);
            if (httpStatusCode != null && httpStatusCode.intValue() == 500) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<AsyncResult<SortingHatRecord>> pollSortingHatExperience(SortingHatQueryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return combineStreams$default(this, args, pollEndpoint(SortingHatQueryArgs.copy$default(args, null, null, this.hasCryptoImpressionPref.get(), 3, null)), false, 4, null);
    }

    public final Flow<AsyncResult<SortingHatRecord>> refreshAndStreamSortingHatExperienceWithCache(SortingHatQueryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        SortingHatQueryArgs sortingHatQueryArgsCopy$default = SortingHatQueryArgs.copy$default(args, null, null, this.hasCryptoImpressionPref.get(), 3, null);
        return combineStreams(sortingHatQueryArgsCopy$default, FlowKt.merge(getSortingHatRecordFromNetwork$default(this, sortingHatQueryArgsCopy$default, false, 2, null), FlowKt.transformLatest(this.refreshFlow, new C34818x28e38ea(null, this, sortingHatQueryArgsCopy$default))), true);
    }

    static /* synthetic */ Flow combineStreams$default(BaseSortingHatStore baseSortingHatStore, SortingHatQueryArgs sortingHatQueryArgs, Flow flow, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: combineStreams");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return baseSortingHatStore.combineStreams(sortingHatQueryArgs, flow, z);
    }

    private final Flow<AsyncResult<SortingHatRecord>> combineStreams(SortingHatQueryArgs args, Flow<? extends AsyncResult<SortingHatRecord>> networkStream, boolean shouldEmitInvestedStream) {
        return FlowKt.transformWhile(AsyncResult2.distinctUntilValueChanged(FlowKt.combine(streamLocalSortingHatRecord(args), networkStream, new C348191(null)), new Function2() { // from class: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(BaseSortingHatStore.combineStreams$lambda$5((SortingHatRecord) obj, (SortingHatRecord) obj2));
            }
        }), new C348203(shouldEmitInvestedStream, this, null));
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "localExperience", "networkState"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$combineStreams$1", m3645f = "BaseSortingHatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$combineStreams$1 */
    /* loaded from: classes13.dex */
    static final class C348191 extends ContinuationImpl7 implements Function3<SortingHatRecord, AsyncResult<? extends SortingHatRecord>, Continuation<? super AsyncResult<? extends SortingHatRecord>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C348191(Continuation<? super C348191> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SortingHatRecord sortingHatRecord, AsyncResult<SortingHatRecord> asyncResult, Continuation<? super AsyncResult<SortingHatRecord>> continuation) {
            C348191 c348191 = new C348191(continuation);
            c348191.L$0 = sortingHatRecord;
            c348191.L$1 = asyncResult;
            return c348191.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(SortingHatRecord sortingHatRecord, AsyncResult<? extends SortingHatRecord> asyncResult, Continuation<? super AsyncResult<? extends SortingHatRecord>> continuation) {
            return invoke2(sortingHatRecord, (AsyncResult<SortingHatRecord>) asyncResult, (Continuation<? super AsyncResult<SortingHatRecord>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SortingHatRecord sortingHatRecord = (SortingHatRecord) this.L$0;
            return sortingHatRecord != null ? new AsyncResult.Success(sortingHatRecord) : (AsyncResult) this.L$1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean combineStreams$lambda$5(SortingHatRecord old, SortingHatRecord sortingHatRecord) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(sortingHatRecord, "new");
        return Intrinsics.areEqual(sortingHatRecord.getApplicationId(), old.getApplicationId()) && Intrinsics.areEqual(sortingHatRecord.getAccountNumber(), old.getAccountNumber()) && Intrinsics.areEqual(sortingHatRecord.getExperience(), old.getExperience());
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "state"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$combineStreams$3", m3645f = "BaseSortingHatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$combineStreams$3 */
    /* loaded from: classes13.dex */
    static final class C348203 extends ContinuationImpl7 implements Function3<FlowCollector<? super AsyncResult<? extends SortingHatRecord>>, AsyncResult<? extends SortingHatRecord>, Continuation<? super Boolean>, Object> {
        final /* synthetic */ boolean $shouldEmitInvestedStream;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ BaseSortingHatStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348203(boolean z, BaseSortingHatStore baseSortingHatStore, Continuation<? super C348203> continuation) {
            super(3, continuation);
            this.$shouldEmitInvestedStream = z;
            this.this$0 = baseSortingHatStore;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends SortingHatRecord>> flowCollector, AsyncResult<? extends SortingHatRecord> asyncResult, Continuation<? super Boolean> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<SortingHatRecord>>) flowCollector, (AsyncResult<SortingHatRecord>) asyncResult, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<SortingHatRecord>> flowCollector, AsyncResult<SortingHatRecord> asyncResult, Continuation<? super Boolean> continuation) {
            C348203 c348203 = new C348203(this.$shouldEmitInvestedStream, this.this$0, continuation);
            c348203.L$0 = flowCollector;
            c348203.L$1 = asyncResult;
            return c348203.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AsyncResult asyncResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                AsyncResult asyncResult2 = (AsyncResult) this.L$1;
                this.L$0 = asyncResult2;
                this.label = 1;
                if (flowCollector.emit(asyncResult2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                asyncResult = asyncResult2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncResult = (AsyncResult) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!this.$shouldEmitInvestedStream && this.this$0.isInvested((AsyncResult<SortingHatRecord>) asyncResult)) {
                z = false;
            }
            return boxing.boxBoolean(z);
        }
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$refreshSortingHatForDocUploadBestEffort$1", m3645f = "BaseSortingHatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$refreshSortingHatForDocUploadBestEffort$1 */
    /* loaded from: classes13.dex */
    static final class C348281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C348281(Continuation<? super C348281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSortingHatStore.this.new C348281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration duration = BaseSortingHatStore.this.sortingHatRefreshAfterDocUploadDuration;
                this.label = 1;
                if (Time4.delay(duration, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = BaseSortingHatStore.this.refreshFlow;
            Unit unit = Unit.INSTANCE;
            this.label = 2;
        }
    }

    public final void refreshSortingHatForDocUploadBestEffort() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C348281(null), 3, null);
    }

    /* compiled from: BaseSortingHatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$invalidateSortingHatCacheIfNeeded$1", m3645f = "BaseSortingHatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$invalidateSortingHatCacheIfNeeded$1 */
    /* loaded from: classes13.dex */
    static final class C348251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C348251(Continuation<? super C348251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSortingHatStore.this.new C348251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    BaseSortingHatStore.this.sortingHatDao.deleteEverything();
                } catch (Throwable th) {
                    Integer httpStatusCode = Throwables.getHttpStatusCode(th);
                    if (httpStatusCode != null && httpStatusCode.intValue() == 500) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void invalidateSortingHatCacheIfNeeded() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C348251(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInvested(AsyncResult<SortingHatRecord> asyncResult) {
        if (asyncResult instanceof AsyncResult.Success) {
            return isInvested((SortingHatRecord) ((AsyncResult.Success) asyncResult).getValue());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInvested(SortingHatRecord sortingHatRecord) {
        return sortingHatRecord.getExperience() instanceof SortingHatExperienceV2.Invested;
    }
}
