package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.chainsettings.ApiChainAvailableMetrics;
import com.robinhood.models.api.chainsettings.ApiChainCustomization;
import com.robinhood.models.api.chainsettings.ApiChainCustomizationEducation;
import com.robinhood.models.api.chainsettings.ApiChainCustomizationList;
import com.robinhood.models.dao.OptionChainAvailableMetricsDao;
import com.robinhood.models.dao.OptionChainCustomizationEducationDao;
import com.robinhood.models.dao.OptionChainSelectedMetricsDao;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u00105\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0004\u0018\u00010\u00172\u0006\u00108\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u00109J\u001e\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=H\u0086@¢\u0006\u0002\u0010>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00170\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00170\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R#\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\"¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u001d\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020*0\"¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020*0\"¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\"¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u001d\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\"¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%¨\u0006?"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "Lcom/robinhood/store/Store;", "optionChainSelectedMetricsDao", "Lcom/robinhood/models/dao/OptionChainSelectedMetricsDao;", "optionChainAvailableMetricsDao", "Lcom/robinhood/models/dao/OptionChainAvailableMetricsDao;", "optionChainCustomizationEducationDao", "Lcom/robinhood/models/dao/OptionChainCustomizationEducationDao;", "optionsProduct", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/OptionChainSelectedMetricsDao;Lcom/robinhood/models/dao/OptionChainAvailableMetricsDao;Lcom/robinhood/models/dao/OptionChainCustomizationEducationDao;Lcom/robinhood/android/api/optionsproduct/OptionsProduct;Lcom/robinhood/store/StoreBundle;)V", "getChainAvailableMetrics", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/chainsettings/ApiChainAvailableMetrics;", "getStrategyBuilderAvailableMetrics", "getChainSelectedMetrics", "", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomizationList;", "getChainSelectedMetricsById", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization;", "getStrategyBuilderSelectedMetricsById", "getChainEducation", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomizationEducation;", "getStrategyBuilderEducation", "updateChainSelectedMetricsEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization$UpdateMetricsRequest;", "updateStrategyBuilderSelectedMetricsEndpoint", "streamChainAvailableMetrics", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "getStreamChainAvailableMetrics", "()Lcom/robinhood/android/moria/db/Query;", "streamStrategyBuilderAvailableMetrics", "getStreamStrategyBuilderAvailableMetrics", "streamChainSelectedMetrics", "", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getStreamChainSelectedMetrics", "streamChainSelectedMetricsById", "getStreamChainSelectedMetricsById", "streamStrategyBuilderSelectedMetricsById", "getStreamStrategyBuilderSelectedMetricsById", "streamChainEducationById", "Lcom/robinhood/models/db/OptionChainCustomizationEducation;", "getStreamChainEducationById", "streamStrategyBuilderEducationById", "getStreamStrategyBuilderEducationById", "fetchChainSelectedMetrics", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStrategyBuilderSelectedMetrics", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectedMetric", "metric", "isChain", "", "(Lcom/robinhood/models/db/OptionChainSelectedMetrics;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionChainCustomizationStore extends Store {
    private final Endpoint<String, ApiChainAvailableMetrics> getChainAvailableMetrics;
    private final Endpoint<String, ApiChainCustomizationEducation> getChainEducation;
    private final Endpoint<Unit, ApiChainCustomizationList> getChainSelectedMetrics;
    private final Endpoint<String, ApiChainCustomization> getChainSelectedMetricsById;
    private final Endpoint<String, ApiChainAvailableMetrics> getStrategyBuilderAvailableMetrics;
    private final Endpoint<String, ApiChainCustomizationEducation> getStrategyBuilderEducation;
    private final Endpoint<String, ApiChainCustomization> getStrategyBuilderSelectedMetricsById;
    private final OptionChainAvailableMetricsDao optionChainAvailableMetricsDao;
    private final OptionChainCustomizationEducationDao optionChainCustomizationEducationDao;
    private final OptionChainSelectedMetricsDao optionChainSelectedMetricsDao;
    private final OptionsProduct optionsProduct;
    private final Query<String, OptionChainAvailableMetrics> streamChainAvailableMetrics;
    private final Query<String, OptionChainCustomizationEducation> streamChainEducationById;
    private final Query<Unit, List<OptionChainSelectedMetrics>> streamChainSelectedMetrics;
    private final Query<String, OptionChainSelectedMetrics> streamChainSelectedMetricsById;
    private final Query<String, OptionChainAvailableMetrics> streamStrategyBuilderAvailableMetrics;
    private final Query<String, OptionChainCustomizationEducation> streamStrategyBuilderEducationById;
    private final Query<String, OptionChainSelectedMetrics> streamStrategyBuilderSelectedMetricsById;
    private final PostEndpoint<Tuples2<String, ApiChainCustomization.UpdateMetricsRequest>, ApiChainCustomization> updateChainSelectedMetricsEndpoint;
    private final PostEndpoint<Tuples2<String, ApiChainCustomization.UpdateMetricsRequest>, ApiChainCustomization> updateStrategyBuilderSelectedMetricsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainCustomizationStore(OptionChainSelectedMetricsDao optionChainSelectedMetricsDao, OptionChainAvailableMetricsDao optionChainAvailableMetricsDao, OptionChainCustomizationEducationDao optionChainCustomizationEducationDao, OptionsProduct optionsProduct, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionChainSelectedMetricsDao, "optionChainSelectedMetricsDao");
        Intrinsics.checkNotNullParameter(optionChainAvailableMetricsDao, "optionChainAvailableMetricsDao");
        Intrinsics.checkNotNullParameter(optionChainCustomizationEducationDao, "optionChainCustomizationEducationDao");
        Intrinsics.checkNotNullParameter(optionsProduct, "optionsProduct");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionChainSelectedMetricsDao = optionChainSelectedMetricsDao;
        this.optionChainAvailableMetricsDao = optionChainAvailableMetricsDao;
        this.optionChainCustomizationEducationDao = optionChainCustomizationEducationDao;
        this.optionsProduct = optionsProduct;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getChainAvailableMetrics = Endpoint.Companion.create$default(companion, new OptionChainCustomizationStore$getChainAvailableMetrics$1(optionsProduct), getLogoutKillswitch(), new OptionChainCustomizationStore$getChainAvailableMetrics$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getStrategyBuilderAvailableMetrics = Endpoint.Companion.create$default(companion, new C34000xc3803323(optionsProduct), getLogoutKillswitch(), new C34001xc3803324(this, null), storeBundle.getClock(), null, 16, null);
        this.getChainSelectedMetrics = Endpoint.Companion.create$default(companion, new OptionChainCustomizationStore$getChainSelectedMetrics$1(this, null), getLogoutKillswitch(), new OptionChainCustomizationStore$getChainSelectedMetrics$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getChainSelectedMetricsById = Endpoint.Companion.create$default(companion, new OptionChainCustomizationStore$getChainSelectedMetricsById$1(optionsProduct), getLogoutKillswitch(), new OptionChainCustomizationStore$getChainSelectedMetricsById$2(optionChainSelectedMetricsDao), storeBundle.getClock(), null, 16, null);
        this.getStrategyBuilderSelectedMetricsById = Endpoint.Companion.create$default(companion, new C34002x564e1acb(optionsProduct), getLogoutKillswitch(), new C34003x564e1acc(optionChainSelectedMetricsDao), storeBundle.getClock(), null, 16, null);
        this.getChainEducation = Endpoint.Companion.create$default(companion, new OptionChainCustomizationStore$getChainEducation$1(optionsProduct), getLogoutKillswitch(), new OptionChainCustomizationStore$getChainEducation$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getStrategyBuilderEducation = Endpoint.Companion.create$default(companion, new OptionChainCustomizationStore$getStrategyBuilderEducation$1(optionsProduct), getLogoutKillswitch(), new OptionChainCustomizationStore$getStrategyBuilderEducation$2(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.updateChainSelectedMetricsEndpoint = companion2.create(new C34007xf154e95c(this, null), new C34008xf154e95d(this, null));
        this.updateStrategyBuilderSelectedMetricsEndpoint = companion2.create(new C34009x2c400195(this, null), new C34010x2c400196(this, null));
        Query.Companion companion3 = Query.INSTANCE;
        this.streamChainAvailableMetrics = Store.create$default(this, companion3, "streamChainAvailableMetrics", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamChainAvailableMetrics$lambda$1(this.f$0, (String) obj);
            }
        })), new OptionChainCustomizationStore$streamChainAvailableMetrics$2(optionChainAvailableMetricsDao), false, 8, null);
        this.streamStrategyBuilderAvailableMetrics = Store.create$default(this, companion3, "streamStrategyBuilderAvailableMetrics", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamStrategyBuilderAvailableMetrics$lambda$2(this.f$0, (String) obj);
            }
        })), new C34004x4be25166(optionChainAvailableMetricsDao), false, 8, null);
        this.streamChainSelectedMetrics = Store.create$default(this, companion3, "streamChainSelectedMetrics", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamChainSelectedMetrics$lambda$3(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamChainSelectedMetrics$lambda$4(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.streamChainSelectedMetricsById = Store.create$default(this, companion3, "streamChainSelectedMetricsById", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamChainSelectedMetricsById$lambda$5(this.f$0, (String) obj);
            }
        })), new OptionChainCustomizationStore$streamChainSelectedMetricsById$2(optionChainSelectedMetricsDao), false, 8, null);
        this.streamStrategyBuilderSelectedMetricsById = Store.create$default(this, companion3, "streamStrategyBuilderSelectedMetricsById", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamStrategyBuilderSelectedMetricsById$lambda$6(this.f$0, (String) obj);
            }
        })), new C34006x686d3d4a(optionChainSelectedMetricsDao), false, 8, null);
        this.streamChainEducationById = Store.create$default(this, companion3, "streamChainEducationById", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamChainEducationById$lambda$7(this.f$0, (String) obj);
            }
        })), new OptionChainCustomizationStore$streamChainEducationById$2(optionChainCustomizationEducationDao), false, 8, null);
        this.streamStrategyBuilderEducationById = Store.create$default(this, companion3, "streamStrategyBuilderEducationById", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationStore.streamStrategyBuilderEducationById$lambda$8(this.f$0, (String) obj);
            }
        })), new C34005x802334ca(optionChainCustomizationEducationDao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getChainSelectedMetricsById$insert(OptionChainSelectedMetricsDao optionChainSelectedMetricsDao, ApiChainCustomization apiChainCustomization, Continuation continuation) {
        optionChainSelectedMetricsDao.insert(apiChainCustomization);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getStrategyBuilderSelectedMetricsById$insert$0(OptionChainSelectedMetricsDao optionChainSelectedMetricsDao, ApiChainCustomization apiChainCustomization, Continuation continuation) {
        optionChainSelectedMetricsDao.insert(apiChainCustomization);
        return Unit.INSTANCE;
    }

    public final Query<String, OptionChainAvailableMetrics> getStreamChainAvailableMetrics() {
        return this.streamChainAvailableMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamChainAvailableMetrics$lambda$1(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getChainAvailableMetrics, params, true, null, 4, null);
    }

    public final Query<String, OptionChainAvailableMetrics> getStreamStrategyBuilderAvailableMetrics() {
        return this.streamStrategyBuilderAvailableMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamStrategyBuilderAvailableMetrics$lambda$2(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getStrategyBuilderAvailableMetrics, params, true, null, 4, null);
    }

    public final Query<Unit, List<OptionChainSelectedMetrics>> getStreamChainSelectedMetrics() {
        return this.streamChainSelectedMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamChainSelectedMetrics$lambda$3(OptionChainCustomizationStore optionChainCustomizationStore, Unit params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getChainSelectedMetrics, params, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamChainSelectedMetrics$lambda$4(OptionChainCustomizationStore optionChainCustomizationStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionChainCustomizationStore.optionChainSelectedMetricsDao.getOptionChainSelectedMetrics(CollectionsKt.listOf((Object[]) new String[]{OrderSide.BUY.getServerValue(), OrderSide.SELL.getServerValue()}));
    }

    public final Query<String, OptionChainSelectedMetrics> getStreamChainSelectedMetricsById() {
        return this.streamChainSelectedMetricsById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamChainSelectedMetricsById$lambda$5(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getChainSelectedMetricsById, params, true, null, 4, null);
    }

    public final Query<String, OptionChainSelectedMetrics> getStreamStrategyBuilderSelectedMetricsById() {
        return this.streamStrategyBuilderSelectedMetricsById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamStrategyBuilderSelectedMetricsById$lambda$6(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getStrategyBuilderSelectedMetricsById, params, true, null, 4, null);
    }

    public final Query<String, OptionChainCustomizationEducation> getStreamChainEducationById() {
        return this.streamChainEducationById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamChainEducationById$lambda$7(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getChainEducation, params, true, null, 4, null);
    }

    public final Query<String, OptionChainCustomizationEducation> getStreamStrategyBuilderEducationById() {
        return this.streamStrategyBuilderEducationById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamStrategyBuilderEducationById$lambda$8(OptionChainCustomizationStore optionChainCustomizationStore, String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(optionChainCustomizationStore.getStrategyBuilderEducation, params, true, null, 4, null);
    }

    public final Object fetchChainSelectedMetrics(Continuation<? super ApiChainCustomizationList> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getChainSelectedMetrics, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object fetchStrategyBuilderSelectedMetrics(String str, Continuation<? super ApiChainCustomization> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getStrategyBuilderSelectedMetricsById, str, null, continuation, 2, null);
    }

    public final Object updateSelectedMetric(OptionChainSelectedMetrics optionChainSelectedMetrics, boolean z, Continuation<? super Unit> continuation) {
        if (z) {
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.updateChainSelectedMetricsEndpoint, new Tuples2(optionChainSelectedMetrics.getId(), new ApiChainCustomization.UpdateMetricsRequest(optionChainSelectedMetrics.getSelectedMetricOne().getMetricType(), optionChainSelectedMetrics.getSelectedMetricTwo().getMetricType())), null, continuation, 2, null);
            if (objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objPost$default;
            }
        } else {
            Object objPost$default2 = PostEndpoint.DefaultImpls.post$default(this.updateStrategyBuilderSelectedMetricsEndpoint, new Tuples2(optionChainSelectedMetrics.getId(), new ApiChainCustomization.UpdateMetricsRequest(optionChainSelectedMetrics.getSelectedMetricOne().getMetricType(), optionChainSelectedMetrics.getSelectedMetricTwo().getMetricType())), null, continuation, 2, null);
            if (objPost$default2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objPost$default2;
            }
        }
        return Unit.INSTANCE;
    }
}
