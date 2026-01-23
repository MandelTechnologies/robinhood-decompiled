package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.utils.ApiExperimentManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.enums.RhEnum;
import com.robinhood.enums.RhEnum2;
import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.experiments.ExperimentQueryMode;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.MicrogramOnlyUsageExperimentationApi;
import com.robinhood.experiments.ProcessInvariantExperiment;
import com.robinhood.experiments.UnsafeExperimentsApi;
import com.robinhood.experiments.UnsupportedAppUsageExperimentationApi;
import com.robinhood.experiments.variant.FullExtendedHoursVariant;
import com.robinhood.librobinhood.data.fetcher.ExperimentFetcher;
import com.robinhood.models.api.ReferrerData;
import com.robinhood.models.dao.KaizenExperimentDao;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.rosetta.eventlogging.EventName;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import dispatch.core.Launch;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import timber.log.Timber;

/* compiled from: ExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160!H\u0014J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160#H\u0007J7\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100&\"\u00020\u00102\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0017¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u001d2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-H\u0016J?\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030-0&\"\u0006\u0012\u0002\b\u00030-2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u00100J?\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030-0&\"\u0006\u0012\u0002\b\u00030-2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u00102J\u0016\u00106\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u00107J\u0014\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001609H\u0014J\u001c\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160;H\u0094@¢\u0006\u0004\b<\u0010=J$\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f092\n\u0010,\u001a\u0006\u0012\u0002\b\u00030?2\b\b\u0002\u0010'\u001a\u00020\u001fH\u0016J,\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0;2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030?2\b\b\u0002\u0010'\u001a\u00020\u001fH\u0096@¢\u0006\u0004\bA\u0010BJ(\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010050#2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010'\u001a\u00020\u001fH\u0016J$\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100!2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010'\u001a\u00020\u001fH\u0016J0\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00160!2\u0010\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0\u00162\u0006\u0010'\u001a\u00020\u001fH\u0016J \u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100!2\u0006\u0010F\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u001fH\u0017J9\u0010G\u001a\u0002HH\"\u0018\b\u0000\u0010H*\b\u0012\u0004\u0012\u0002HH0I*\b\u0012\u0004\u0012\u0002HH0J2\b\u0010K\u001a\u0004\u0018\u00010\u00102\u0006\u0010L\u001a\u0002HHH\u0002¢\u0006\u0002\u0010MJK\u0010N\u001a\b\u0012\u0004\u0012\u0002HH0#\"\u0018\b\u0000\u0010H*\b\u0012\u0004\u0012\u0002HH0I*\b\u0012\u0004\u0012\u0002HH0J2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002HH0-2\u0006\u0010L\u001a\u0002HH2\u0006\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010OJK\u0010P\u001a\b\u0012\u0004\u0012\u0002HH0!\"\u0018\b\u0000\u0010H*\b\u0012\u0004\u0012\u0002HH0I*\b\u0012\u0004\u0012\u0002HH0J2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002HH0-2\u0006\u0010L\u001a\u0002HH2\u0006\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010QJH\u0010R\u001a\u0002HH\"\u0018\b\u0000\u0010H*\b\u0012\u0004\u0012\u0002HH0I*\b\u0012\u0004\u0012\u0002HH0J2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002HH0?2\u0006\u0010L\u001a\u0002HH2\b\b\u0002\u0010'\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010SJ\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0094@¢\u0006\u0002\u0010=J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0081@¢\u0006\u0004\bV\u0010=J:\u0010>\u001a\u00020\u001f2\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030W0&\"\u0006\u0012\u0002\b\u00030W2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010XJ$\u0010Y\u001a\u0004\u0018\u00010\u00102\n\u0010,\u001a\u0006\u0012\u0002\b\u00030W2\u0006\u0010'\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010ZJ\u000e\u0010[\u001a\u00020\u001dH\u0097@¢\u0006\u0002\u0010=J\u000e\u0010\\\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010=J\b\u0010]\u001a\u00020\u001dH\u0016J\u000e\u0010^\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020`J\b\u0010a\u001a\u00020\u001dH\u0002J\u000e\u0010b\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010=J\n\u0010c\u001a\u0004\u0018\u00010\u0010H\u0016J(\u0010d\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u00162\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010'\u001a\u00020\u001fH\u0002J4\u0010>\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0010\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00162\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002J5\u0010>\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0003¢\u0006\u0002\beJ\u001a\u0010f\u001a\u00020\u001d2\u0010\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160504X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006g"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lcom/robinhood/api/utils/ApiExperimentManager;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "experimentFetcher", "Lcom/robinhood/librobinhood/data/fetcher/ExperimentFetcher;", "kaizenDao", "Lcom/robinhood/models/dao/KaizenExperimentDao;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "supportedExperimentsByName", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/librobinhood/data/fetcher/ExperimentFetcher;Lcom/robinhood/models/dao/KaizenExperimentDao;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;Ljava/util/Map;)V", "dynamicExperiments", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/models/db/KaizenExperiment;", "processInvariantExperiments", "serverExperimentAnalyticsStrings", "referrerExperiment", "analyticsExperimentsLogString", "refresh", "", "force", "", "streamExperimentList", "Lkotlinx/coroutines/flow/Flow;", "streamExperiments", "Lio/reactivex/Observable;", "coStreamStateForNames", "experimentNames", "", "trigger", "mode", "Lcom/robinhood/experiments/ExperimentQueryMode;", "([Ljava/lang/String;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lkotlinx/coroutines/flow/Flow;", "logExposure", "experiment", "Lcom/robinhood/experiments/Experiment;", "streamState", "experiments", "([Lcom/robinhood/experiments/Experiment;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lio/reactivex/Observable;", "streamStateFlow", "([Lcom/robinhood/experiments/Experiment;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lkotlinx/coroutines/flow/Flow;", "experimentsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/utils/Optional;", "refreshInternal", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceIdExperiments", "Lio/reactivex/Single;", "coGetDeviceIdExperiments", "Lkotlin/Result;", "coGetDeviceIdExperiments-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getState", "Lcom/robinhood/experiments/DeviceIdExperiment;", "coGetState", "coGetState-0E7RQCE", "(Lcom/robinhood/experiments/DeviceIdExperiment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamVariation", "coStreamVariation", "coStreamVariations", "experimentName", "getVariantTypeOrDefault", "E", "Lcom/robinhood/enums/RhEnum;", "", "variantString", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "streamVariant", "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;Z)Lio/reactivex/Observable;", "coStreamVariant", "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;Z)Lkotlinx/coroutines/flow/Flow;", "getVariant", "(Lcom/robinhood/experiments/DeviceIdExperiment;Ljava/lang/Enum;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProcessInvariantExperimentList", "getProcessInvariantExperiments", "getProcessInvariantExperiments$lib_store_experiments_externalRelease", "Lcom/robinhood/experiments/ProcessInvariantExperiment;", "([Lcom/robinhood/experiments/ProcessInvariantExperiment;ZLcom/robinhood/experiments/ExperimentQueryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVariation", "(Lcom/robinhood/experiments/ProcessInvariantExperiment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshProcessInvariantExperiments", "loadProcessInvariantExperiments", "onAppCreated", "onReferrerCampaign", "referrerData", "Lcom/robinhood/models/api/ReferrerData;", "resetAnalyticsString", "shouldEnableFullExtendedHours", "getCommaSeparatedExperimentNames", "get", "getStateRaw", "validate", "lib-store-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public class ExperimentsStore extends Store implements ExperimentsProvider, ApiExperimentManager {
    private String analyticsExperimentsLogString;
    private final StateFlow2<List<KaizenExperiment>> dynamicExperiments;
    private final EventLogger eventLogger;
    private final ExperimentExposureLogger experimentExposureLogger;
    private final ExperimentFetcher experimentFetcher;
    private final Endpoint<Unit, Optional<List<KaizenExperiment>>> experimentsEndpoint;
    private final KaizenExperimentDao kaizenDao;
    private final StateFlow2<List<KaizenExperiment>> processInvariantExperiments;
    private String referrerExperiment;
    private List<String> serverExperimentAnalyticsStrings;
    private final Map<String, ExperimentDeclaration<?>> supportedExperimentsByName;

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExperimentQueryMode.values().length];
            try {
                iArr[ExperimentQueryMode.ANY_ARE_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExperimentQueryMode.ALL_ARE_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {405}, m3647m = "getState$suspendImpl")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$getState$2 */
    /* loaded from: classes13.dex */
    static final class C338532 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C338532(Continuation<? super C338532> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.getState$suspendImpl(ExperimentsStore.this, null, false, null, this);
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {377}, m3647m = "getVariant")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$getVariant$1 */
    /* loaded from: classes13.dex */
    static final class C338541<E extends Enum<E> & RhEnum<E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C338541(Continuation<? super C338541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.this.getVariant(null, null, false, this);
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {422}, m3647m = "getVariation$suspendImpl")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$getVariation$1 */
    /* loaded from: classes13.dex */
    static final class C338551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C338551(Continuation<? super C338551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.getVariation$suspendImpl(ExperimentsStore.this, null, false, this);
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {435}, m3647m = "loadProcessInvariantExperiments")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$loadProcessInvariantExperiments$1 */
    /* loaded from: classes13.dex */
    static final class C338561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C338561(Continuation<? super C338561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.this.loadProcessInvariantExperiments(this);
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {430, 431}, m3647m = "refreshProcessInvariantExperiments$suspendImpl")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$refreshProcessInvariantExperiments$1 */
    /* loaded from: classes13.dex */
    static final class C338601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C338601(Continuation<? super C338601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.refreshProcessInvariantExperiments$suspendImpl(ExperimentsStore.this, this);
        }
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {479}, m3647m = "shouldEnableFullExtendedHours$suspendImpl")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$shouldEnableFullExtendedHours$1 */
    /* loaded from: classes13.dex */
    static final class C338611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C338611(Continuation<? super C338611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentsStore.shouldEnableFullExtendedHours$suspendImpl(ExperimentsStore.this, this);
        }
    }

    /* renamed from: coGetDeviceIdExperiments-IoAF18A, reason: not valid java name */
    protected Object m22652coGetDeviceIdExperimentsIoAF18A(Continuation<? super Result<? extends List<? extends KaizenExperiment>>> continuation) {
        return m22649coGetDeviceIdExperimentsIoAF18A$suspendImpl(this, continuation);
    }

    /* renamed from: coGetState-0E7RQCE, reason: not valid java name */
    public Object m22653coGetState0E7RQCE(DeviceIdExperiment<?> deviceIdExperiment, boolean z, Continuation<? super Result<Boolean>> continuation) {
        return m22651coGetState0E7RQCE$suspendImpl(this, deviceIdExperiment, z, continuation);
    }

    protected Object getProcessInvariantExperimentList(Continuation<? super List<? extends KaizenExperiment>> continuation) {
        return getProcessInvariantExperimentList$suspendImpl(this, continuation);
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Object getState(ProcessInvariantExperiment<?>[] processInvariantExperimentArr, boolean z, ExperimentQueryMode experimentQueryMode, Continuation<? super Boolean> continuation) {
        return getState$suspendImpl(this, processInvariantExperimentArr, z, experimentQueryMode, continuation);
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Object getVariation(ProcessInvariantExperiment<?> processInvariantExperiment, boolean z, Continuation<? super String> continuation) {
        return getVariation$suspendImpl(this, processInvariantExperiment, z, continuation);
    }

    @UnsafeExperimentsApi
    public Object refreshProcessInvariantExperiments(Continuation<? super Unit> continuation) {
        return refreshProcessInvariantExperiments$suspendImpl(this, continuation);
    }

    @Override // com.robinhood.api.utils.ApiExperimentManager
    public Object shouldEnableFullExtendedHours(Continuation<? super Boolean> continuation) {
        return shouldEnableFullExtendedHours$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExperimentsStore(StoreBundle storeBundle, ExperimentFetcher experimentFetcher, KaizenExperimentDao kaizenDao, EventLogger eventLogger, ExperimentExposureLogger experimentExposureLogger, Map<String, ? extends ExperimentDeclaration<?>> supportedExperimentsByName) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(experimentFetcher, "experimentFetcher");
        Intrinsics.checkNotNullParameter(kaizenDao, "kaizenDao");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(supportedExperimentsByName, "supportedExperimentsByName");
        this.experimentFetcher = experimentFetcher;
        this.kaizenDao = kaizenDao;
        this.eventLogger = eventLogger;
        this.experimentExposureLogger = experimentExposureLogger;
        this.supportedExperimentsByName = supportedExperimentsByName;
        this.dynamicExperiments = StateFlow4.MutableStateFlow(null);
        this.processInvariantExperiments = StateFlow4.MutableStateFlow(null);
        this.serverExperimentAnalyticsStrings = CollectionsKt.emptyList();
        Launch.launchIO$default(getStoreScope(), null, null, new C338491(null), 3, null);
        this.experimentsEndpoint = Endpoint.INSTANCE.create(new ExperimentsStore4(this, null), getLogoutKillswitch(), new ExperimentsStore5(null), storeBundle.getClock(), new DefaultStaleDecider(KaizenExperiment.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$1", m3645f = "ExperimentsStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$1 */
    /* loaded from: classes13.dex */
    static final class C338491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338491(Continuation<? super C338491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExperimentsStore.this.new C338491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(ExperimentsStore.this.dynamicExperiments);
                Flow<List<? extends String>> flow = new Flow<List<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C338412<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$1$invokeSuspend$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C338412.this.emit(null, this);
                            }
                        }

                        public C338412(FlowCollector flowCollector) {
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((KaizenExperiment) it.next()).toString());
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C338412(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final ExperimentsStore experimentsStore = ExperimentsStore.this;
                FlowCollector<? super List<? extends String>> flowCollector = new FlowCollector() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<String>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<String> list, Continuation<? super Unit> continuation) {
                        experimentsStore.serverExperimentAnalyticsStrings = list;
                        experimentsStore.resetAnalyticsString();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$refresh$1", m3645f = "ExperimentsStore.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$refresh$1 */
    /* loaded from: classes13.dex */
    static final class C338591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338591(boolean z, Continuation<? super C338591> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExperimentsStore.this.new C338591(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore = ExperimentsStore.this;
                boolean z = this.$force;
                this.label = 1;
                if (experimentsStore.refreshInternal(z, this) == coroutine_suspended) {
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

    public final void refresh(boolean force) {
        Launch.launchIO$default(getStoreScope(), null, null, new C338591(force, null), 3, null);
    }

    protected Flow<List<KaizenExperiment>> streamExperimentList() {
        refresh(false);
        return FlowKt.filterNotNull(this.dynamicExperiments);
    }

    @Deprecated
    public final Observable<List<KaizenExperiment>> streamExperiments() {
        return asObservable(streamExperimentList());
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    @UnsupportedAppUsageExperimentationApi
    public Flow<Boolean> coStreamStateForNames(final String[] experimentNames, final boolean trigger, final ExperimentQueryMode mode) {
        Intrinsics.checkNotNullParameter(experimentNames, "experimentNames");
        Intrinsics.checkNotNullParameter(mode, "mode");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamStateForNames$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamStateForNames$$inlined$map$1$2 */
            public static final class C338422<T> implements FlowCollector {
                final /* synthetic */ String[] $experimentNames$inlined;
                final /* synthetic */ ExperimentQueryMode $mode$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamStateForNames$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamStateForNames$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338422.this.emit(null, this);
                    }
                }

                public C338422(FlowCollector flowCollector, ExperimentsStore experimentsStore, String[] strArr, boolean z, ExperimentQueryMode experimentQueryMode) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = experimentsStore;
                    this.$experimentNames$inlined = strArr;
                    this.$trigger$inlined = z;
                    this.$mode$inlined = experimentQueryMode;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(this.this$0.getStateRaw((List) obj, ArraysKt.asList(this.$experimentNames$inlined), this.$trigger$inlined, this.$mode$inlined));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338422(flowCollector, this, experimentNames, trigger, mode), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public void logExposure(Experiment<?> experiment) {
        Object next;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        List<KaizenExperiment> value = this.dynamicExperiments.getValue();
        if (value == null) {
            value = CollectionsKt.emptyList();
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((KaizenExperiment) next).getName(), experiment.getServerName())) {
                    break;
                }
            }
        }
        KaizenExperiment kaizenExperiment = (KaizenExperiment) next;
        if (kaizenExperiment != null) {
            this.experimentExposureLogger.logExposure(kaizenExperiment.getName(), kaizenExperiment.getSafeVariation());
        }
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Observable<Boolean> streamState(Experiment<?>[] experiments, boolean trigger, ExperimentQueryMode mode) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return asObservable(streamStateFlow((Experiment[]) Arrays.copyOf(experiments, experiments.length), trigger, mode));
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Flow<Boolean> streamStateFlow(final Experiment<?>[] experiments, final boolean trigger, final ExperimentQueryMode mode) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(mode, "mode");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$streamStateFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338472(flowCollector, this, experiments, trigger, mode), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$streamStateFlow$$inlined$map$1$2 */
            public static final class C338472<T> implements FlowCollector {
                final /* synthetic */ Experiment[] $experiments$inlined;
                final /* synthetic */ ExperimentQueryMode $mode$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$streamStateFlow$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$streamStateFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338472.this.emit(null, this);
                    }
                }

                public C338472(FlowCollector flowCollector, ExperimentsStore experimentsStore, Experiment[] experimentArr, boolean z, ExperimentQueryMode experimentQueryMode) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = experimentsStore;
                    this.$experiments$inlined = experimentArr;
                    this.$trigger$inlined = z;
                    this.$mode$inlined = experimentQueryMode;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(this.this$0.getState((List<? extends KaizenExperiment>) obj, (List<? extends ExperimentDeclaration<?>>) ArraysKt.asList(this.$experiments$inlined), this.$trigger$inlined, this.$mode$inlined));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public final Object refreshInternal(boolean z, Continuation<? super Unit> continuation) {
        Endpoint<Unit, Optional<List<KaizenExperiment>>> endpoint = this.experimentsEndpoint;
        Unit unit = Unit.INSTANCE;
        Object objJoin = endpoint.refresh(unit, z, new ExperimentsStore6(this, z, null)).join(continuation);
        return objJoin == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : unit;
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/KaizenExperiment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$getDeviceIdExperiments$1", m3645f = "ExperimentsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$getDeviceIdExperiments$1 */
    static final class C338501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends KaizenExperiment>>, Object> {
        int label;

        C338501(Continuation<? super C338501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExperimentsStore.this.new C338501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends KaizenExperiment>> continuation) {
            return ((C338501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ExperimentFetcher experimentFetcher = ExperimentsStore.this.experimentFetcher;
            this.label = 1;
            Object objFetchDeviceIdExperiments = experimentFetcher.fetchDeviceIdExperiments(this);
            return objFetchDeviceIdExperiments == coroutine_suspended ? coroutine_suspended : objFetchDeviceIdExperiments;
        }
    }

    protected Single<List<KaizenExperiment>> getDeviceIdExperiments() {
        Single<List<KaizenExperiment>> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C338501(null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore.getDeviceIdExperiments.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final List<KaizenExperiment> apply(List<? extends KaizenExperiment> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                ExperimentsStore.this.eventLogger.logExperimentAssignments(EventName.DEVICE_EXPERIMENTS_UPDATED.getValue(), CollectionsKt.joinToString$default(response, ",", null, null, 0, null, null, 62, null));
                return response;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: coGetDeviceIdExperiments-IoAF18A$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object m22649coGetDeviceIdExperimentsIoAF18A$suspendImpl(ExperimentsStore experimentsStore, Continuation<? super Result<? extends List<? extends KaizenExperiment>>> continuation) {
        ExperimentsStore2 experimentsStore2;
        Object objM28550constructorimpl;
        if (continuation instanceof ExperimentsStore2) {
            experimentsStore2 = (ExperimentsStore2) continuation;
            int i = experimentsStore2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                experimentsStore2.label = i - Integer.MIN_VALUE;
            } else {
                experimentsStore2 = new ExperimentsStore2(experimentsStore, continuation);
            }
        }
        Object objFetchDeviceIdExperiments = experimentsStore2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = experimentsStore2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetchDeviceIdExperiments);
                Result.Companion companion = Result.INSTANCE;
                ExperimentFetcher experimentFetcher = experimentsStore.experimentFetcher;
                experimentsStore2.L$0 = experimentsStore;
                experimentsStore2.label = 1;
                objFetchDeviceIdExperiments = experimentFetcher.fetchDeviceIdExperiments(experimentsStore2);
                if (objFetchDeviceIdExperiments == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                experimentsStore = (ExperimentsStore) experimentsStore2.L$0;
                ResultKt.throwOnFailure(objFetchDeviceIdExperiments);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((List) objFetchDeviceIdExperiments);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            experimentsStore.eventLogger.logExperimentAssignments(EventName.DEVICE_EXPERIMENTS_UPDATED.getValue(), CollectionsKt.joinToString$default((List) objM28550constructorimpl, ",", null, null, 0, null, null, 62, null));
        }
        return objM28550constructorimpl;
    }

    public static /* synthetic */ Single getState$default(ExperimentsStore experimentsStore, DeviceIdExperiment deviceIdExperiment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getState");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return experimentsStore.getState(deviceIdExperiment, z);
    }

    public Single<Boolean> getState(final DeviceIdExperiment<?> experiment, final boolean trigger) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Single map = getDeviceIdExperiments().map(new Function() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore.getState.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<? extends KaizenExperiment> experiments) {
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                return Boolean.valueOf(ExperimentsStore.this.getState(experiments, (List<? extends ExperimentDeclaration<?>>) CollectionsKt.listOf(experiment), trigger, ExperimentQueryMode.ANY_ARE_MEMBER));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* renamed from: coGetState-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m22650coGetState0E7RQCE$default(ExperimentsStore experimentsStore, DeviceIdExperiment deviceIdExperiment, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coGetState-0E7RQCE");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return experimentsStore.m22653coGetState0E7RQCE(deviceIdExperiment, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: coGetState-0E7RQCE$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object m22651coGetState0E7RQCE$suspendImpl(ExperimentsStore experimentsStore, DeviceIdExperiment<?> deviceIdExperiment, boolean z, Continuation<? super Result<Boolean>> continuation) {
        ExperimentsStore3 experimentsStore3;
        Object objM22652coGetDeviceIdExperimentsIoAF18A;
        if (continuation instanceof ExperimentsStore3) {
            experimentsStore3 = (ExperimentsStore3) continuation;
            int i = experimentsStore3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                experimentsStore3.label = i - Integer.MIN_VALUE;
            } else {
                experimentsStore3 = new ExperimentsStore3(experimentsStore, continuation);
            }
        }
        Object obj = experimentsStore3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = experimentsStore3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            experimentsStore3.L$0 = experimentsStore;
            experimentsStore3.L$1 = deviceIdExperiment;
            experimentsStore3.Z$0 = z;
            experimentsStore3.label = 1;
            objM22652coGetDeviceIdExperimentsIoAF18A = experimentsStore.m22652coGetDeviceIdExperimentsIoAF18A(experimentsStore3);
            if (objM22652coGetDeviceIdExperimentsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = experimentsStore3.Z$0;
            deviceIdExperiment = (DeviceIdExperiment) experimentsStore3.L$1;
            experimentsStore = (ExperimentsStore) experimentsStore3.L$0;
            ResultKt.throwOnFailure(obj);
            objM22652coGetDeviceIdExperimentsIoAF18A = ((Result) obj).getValue();
        }
        return Result.m28556isSuccessimpl(objM22652coGetDeviceIdExperimentsIoAF18A) ? Result.m28550constructorimpl(boxing.boxBoolean(experimentsStore.getState((List<? extends KaizenExperiment>) objM22652coGetDeviceIdExperimentsIoAF18A, CollectionsKt.listOf(deviceIdExperiment), z, ExperimentQueryMode.ANY_ARE_MEMBER))) : Result.m28550constructorimpl(objM22652coGetDeviceIdExperimentsIoAF18A);
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Observable<Optional<String>> streamVariation(Experiment<?> experiment, boolean trigger) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        final Flow<String> flowCoStreamVariation = coStreamVariation(experiment, trigger);
        return asObservable(new Flow<Optional<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$streamVariation$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = flowCoStreamVariation.collect(new C338482(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$streamVariation$$inlined$map$1$2 */
            public static final class C338482<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$streamVariation$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$streamVariation$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338482.this.emit(null, this);
                    }
                }

                public C338482(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((String) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Flow<String> coStreamVariation(final Experiment<?> experiment, final boolean trigger) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338442(flowCollector, this, experiment, trigger), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$1$2 */
            public static final class C338442<T> implements FlowCollector {
                final /* synthetic */ Experiment $experiment$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338442.this.emit(null, this);
                    }
                }

                public C338442(FlowCollector flowCollector, ExperimentsStore experimentsStore, Experiment experiment, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = experimentsStore;
                    this.$experiment$inlined = experiment;
                    this.$trigger$inlined = z;
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
                        KaizenExperiment kaizenExperiment = this.this$0.get((List) obj, this.$experiment$inlined, this.$trigger$inlined);
                        String safeVariation = kaizenExperiment != null ? kaizenExperiment.getSafeVariation() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(safeVariation, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    public Flow<List<String>> coStreamVariations(final List<? extends Experiment<?>> experiments, final boolean trigger) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return new Flow<List<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariations$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338462(flowCollector, experiments, this, trigger), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariations$$inlined$map$1$2 */
            public static final class C338462<T> implements FlowCollector {
                final /* synthetic */ List $experiments$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariations$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariations$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338462.this.emit(null, this);
                    }
                }

                public C338462(FlowCollector flowCollector, List list, ExperimentsStore experimentsStore, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$experiments$inlined = list;
                    this.this$0 = experimentsStore;
                    this.$trigger$inlined = z;
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
                        List list = (List) obj;
                        List list2 = this.$experiments$inlined;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            KaizenExperiment kaizenExperiment = this.this$0.get(list, (Experiment) it.next(), this.$trigger$inlined);
                            arrayList.add(kaizenExperiment != null ? kaizenExperiment.getSafeVariation() : null);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    @MicrogramOnlyUsageExperimentationApi
    public Flow<String> coStreamVariation(final String experimentName, final boolean trigger) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338452(flowCollector, experimentName, trigger, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$2$2 */
            public static final class C338452<T> implements FlowCollector {
                final /* synthetic */ String $experimentName$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$2$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariation$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C338452.this.emit(null, this);
                    }
                }

                public C338452(FlowCollector flowCollector, String str, boolean z, ExperimentsStore experimentsStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$experimentName$inlined = str;
                    this.$trigger$inlined = z;
                    this.this$0 = experimentsStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    String safeVariation;
                    T next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            safeVariation = null;
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((KaizenExperiment) next).getName(), this.$experimentName$inlined)) {
                                break;
                            }
                        }
                        KaizenExperiment kaizenExperiment = next;
                        if (kaizenExperiment != null) {
                            if (this.$trigger$inlined) {
                                this.this$0.experimentExposureLogger.logExposure(kaizenExperiment.getName(), kaizenExperiment.getSafeVariation());
                            }
                            safeVariation = kaizenExperiment.getSafeVariation();
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(safeVariation, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect return type in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Ljava/lang/String;TE;)TE; */
    public final Enum getVariantTypeOrDefault(String variantString, Enum r4) {
        Enum enumFromServerValue;
        Class declaringClass = r4.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return (variantString == null || (enumFromServerValue = RhEnum2.getConverter(declaringClass).fromServerValue(variantString)) == null) ? r4 : enumFromServerValue;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Lcom/robinhood/experiments/Experiment<TE;>;TE;Z)Lio/reactivex/Observable<TE;>; */
    @Override // com.robinhood.experiments.ExperimentsProvider
    public Observable streamVariant(Experiment experiment, Enum r3, boolean trigger) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(r3, "default");
        return asObservable(coStreamVariant(experiment, r3, trigger));
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Lcom/robinhood/experiments/Experiment<TE;>;TE;Z)Lkotlinx/coroutines/flow/Flow<TE;>; */
    @Override // com.robinhood.experiments.ExperimentsProvider
    public Flow coStreamVariant(final Experiment experiment, final Enum r9, final boolean trigger) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(r9, "default");
        final Flow<List<KaizenExperiment>> flowStreamExperimentList = streamExperimentList();
        return new Flow<E>() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariant$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowStreamExperimentList.collect(new C338432(flowCollector, this, experiment, trigger, r9), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariant$$inlined$map$1$2 */
            public static final class C338432<T> implements FlowCollector {
                final /* synthetic */ Enum $default$inlined;
                final /* synthetic */ Experiment $experiment$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ boolean $trigger$inlined;
                final /* synthetic */ ExperimentsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariant$$inlined$map$1$2", m3645f = "ExperimentsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coStreamVariant$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C338432.this.emit(null, this);
                    }
                }

                public C338432(FlowCollector flowCollector, ExperimentsStore experimentsStore, Experiment experiment, boolean z, Enum r5) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = experimentsStore;
                    this.$experiment$inlined = experiment;
                    this.$trigger$inlined = z;
                    this.$default$inlined = r5;
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
                        KaizenExperiment kaizenExperiment = this.this$0.get((List) obj, this.$experiment$inlined, this.$trigger$inlined);
                        Enum variantTypeOrDefault = this.this$0.getVariantTypeOrDefault(kaizenExperiment != null ? kaizenExperiment.getSafeVariation() : null, this.$default$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(variantTypeOrDefault, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public static /* synthetic */ Object getVariant$default(ExperimentsStore experimentsStore, DeviceIdExperiment deviceIdExperiment, Enum r2, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVariant");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return experimentsStore.getVariant(deviceIdExperiment, r2, z, continuation);
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Lcom/robinhood/experiments/DeviceIdExperiment<TE;>;TE;ZLkotlin/coroutines/Continuation<-TE;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getVariant(DeviceIdExperiment deviceIdExperiment, Enum r6, boolean z, Continuation continuation) {
        C338541 c338541;
        Object objM22652coGetDeviceIdExperimentsIoAF18A;
        Object objM28550constructorimpl;
        if (continuation instanceof C338541) {
            c338541 = (C338541) continuation;
            int i = c338541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338541.label = i - Integer.MIN_VALUE;
            } else {
                c338541 = new C338541(continuation);
            }
        }
        Object obj = c338541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c338541.L$0 = deviceIdExperiment;
            c338541.L$1 = r6;
            c338541.Z$0 = z;
            c338541.label = 1;
            objM22652coGetDeviceIdExperimentsIoAF18A = m22652coGetDeviceIdExperimentsIoAF18A(c338541);
            if (objM22652coGetDeviceIdExperimentsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c338541.Z$0;
            r6 = (Enum) c338541.L$1;
            deviceIdExperiment = (DeviceIdExperiment) c338541.L$0;
            ResultKt.throwOnFailure(obj);
            objM22652coGetDeviceIdExperimentsIoAF18A = ((Result) obj).getValue();
        }
        if (Result.m28556isSuccessimpl(objM22652coGetDeviceIdExperimentsIoAF18A)) {
            KaizenExperiment kaizenExperiment = get((List) objM22652coGetDeviceIdExperimentsIoAF18A, deviceIdExperiment, z);
            objM28550constructorimpl = Result.m28550constructorimpl(kaizenExperiment != null ? kaizenExperiment.getSafeVariation() : null);
        } else {
            objM28550constructorimpl = Result.m28550constructorimpl(objM22652coGetDeviceIdExperimentsIoAF18A);
        }
        return getVariantTypeOrDefault((String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl), r6);
    }

    static /* synthetic */ Object getProcessInvariantExperimentList$suspendImpl(ExperimentsStore experimentsStore, Continuation<? super List<? extends KaizenExperiment>> continuation) {
        return FlowKt.first(FlowKt.filterNotNull(experimentsStore.processInvariantExperiments), continuation);
    }

    /* renamed from: getProcessInvariantExperiments$lib_store_experiments_externalRelease */
    public final Object m2607x87038126(Continuation<? super List<? extends KaizenExperiment>> continuation) {
        return getProcessInvariantExperimentList(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object getState$suspendImpl(ExperimentsStore experimentsStore, ProcessInvariantExperiment<?>[] processInvariantExperimentArr, boolean z, ExperimentQueryMode experimentQueryMode, Continuation<? super Boolean> continuation) {
        C338532 c338532;
        if (continuation instanceof C338532) {
            c338532 = (C338532) continuation;
            int i = c338532.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338532.label = i - Integer.MIN_VALUE;
            } else {
                c338532 = experimentsStore.new C338532(continuation);
            }
        }
        Object objM2607x87038126 = c338532.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338532.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM2607x87038126);
            c338532.L$0 = experimentsStore;
            c338532.L$1 = processInvariantExperimentArr;
            c338532.L$2 = experimentQueryMode;
            c338532.Z$0 = z;
            c338532.label = 1;
            objM2607x87038126 = experimentsStore.m2607x87038126(c338532);
            if (objM2607x87038126 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c338532.Z$0;
            experimentQueryMode = (ExperimentQueryMode) c338532.L$2;
            processInvariantExperimentArr = (ProcessInvariantExperiment[]) c338532.L$1;
            experimentsStore = (ExperimentsStore) c338532.L$0;
            ResultKt.throwOnFailure(objM2607x87038126);
        }
        return boxing.boxBoolean(experimentsStore.getState((List<? extends KaizenExperiment>) objM2607x87038126, ArraysKt.asList(processInvariantExperimentArr), z, experimentQueryMode));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object getVariation$suspendImpl(ExperimentsStore experimentsStore, ProcessInvariantExperiment<?> processInvariantExperiment, boolean z, Continuation<? super String> continuation) {
        C338551 c338551;
        if (continuation instanceof C338551) {
            c338551 = (C338551) continuation;
            int i = c338551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338551.label = i - Integer.MIN_VALUE;
            } else {
                c338551 = experimentsStore.new C338551(continuation);
            }
        }
        Object objM2607x87038126 = c338551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM2607x87038126);
            c338551.L$0 = experimentsStore;
            c338551.L$1 = processInvariantExperiment;
            c338551.Z$0 = z;
            c338551.label = 1;
            objM2607x87038126 = experimentsStore.m2607x87038126(c338551);
            if (objM2607x87038126 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c338551.Z$0;
            processInvariantExperiment = (ProcessInvariantExperiment) c338551.L$1;
            experimentsStore = (ExperimentsStore) c338551.L$0;
            ResultKt.throwOnFailure(objM2607x87038126);
        }
        KaizenExperiment kaizenExperiment = experimentsStore.get((List) objM2607x87038126, processInvariantExperiment, z);
        if (kaizenExperiment != null) {
            return kaizenExperiment.getSafeVariation();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r6.loadProcessInvariantExperiments(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @UnsafeExperimentsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object refreshProcessInvariantExperiments$suspendImpl(ExperimentsStore experimentsStore, Continuation<? super Unit> continuation) {
        C338601 c338601;
        if (continuation instanceof C338601) {
            c338601 = (C338601) continuation;
            int i = c338601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338601.label = i - Integer.MIN_VALUE;
            } else {
                c338601 = experimentsStore.new C338601(continuation);
            }
        }
        Object obj = c338601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Timber.INSTANCE.mo3350d("Refreshing process invariant experiments", new Object[0]);
            c338601.L$0 = experimentsStore;
            c338601.label = 1;
            if (experimentsStore.refreshInternal(true, c338601) != coroutine_suspended) {
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
        experimentsStore = (ExperimentsStore) c338601.L$0;
        ResultKt.throwOnFailure(obj);
        c338601.L$0 = null;
        c338601.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadProcessInvariantExperiments(Continuation<? super Unit> continuation) {
        C338561 c338561;
        if (continuation instanceof C338561) {
            c338561 = (C338561) continuation;
            int i = c338561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338561.label = i - Integer.MIN_VALUE;
            } else {
                c338561 = new C338561(continuation);
            }
        }
        Object objFirst = c338561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<List<KaizenExperiment>> experiments = this.kaizenDao.getExperiments();
            c338561.label = 1;
            objFirst = FlowKt.first(experiments, c338561);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        List list = (List) objFirst;
        Map<String, ExperimentDeclaration<?>> map = this.supportedExperimentsByName;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ExperimentDeclaration<?>> entry : map.entrySet()) {
            if (entry.getValue() instanceof ProcessInvariantExperiment) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        StateFlow2<List<KaizenExperiment>> stateFlow2 = this.processInvariantExperiments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (setKeySet.contains(((KaizenExperiment) obj).getName())) {
                arrayList.add(obj);
            }
        }
        stateFlow2.setValue(arrayList);
        return Unit.INSTANCE;
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$onAppCreated$1", m3645f = "ExperimentsStore.kt", m3646l = {451}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$onAppCreated$1 */
    static final class C338571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338571(Continuation<? super C338571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExperimentsStore.this.new C338571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore = ExperimentsStore.this;
                Flow flowTakeWhileLoggedIn = experimentsStore.takeWhileLoggedIn(experimentsStore.kaizenDao.getExperiments());
                final ExperimentsStore experimentsStore2 = ExperimentsStore.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore.onAppCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<? extends KaizenExperiment>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<? extends KaizenExperiment> list, Continuation<? super Unit> continuation) {
                        experimentsStore2.dynamicExperiments.setValue(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTakeWhileLoggedIn.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.experiments.ExperimentsProvider
    public void onAppCreated() {
        refresh(true);
        Launch.launchIO$default(getStoreScope(), null, null, new C338571(null), 3, null);
        Launch.launchIO$default(getStoreScope(), null, null, new C338582(null), 3, null);
    }

    /* compiled from: ExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$onAppCreated$2", m3645f = "ExperimentsStore.kt", m3646l = {455}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$onAppCreated$2 */
    /* loaded from: classes13.dex */
    static final class C338582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338582(Continuation<? super C338582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExperimentsStore.this.new C338582(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore = ExperimentsStore.this;
                this.label = 1;
                if (experimentsStore.loadProcessInvariantExperiments(this) == coroutine_suspended) {
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

    public final void onReferrerCampaign(ReferrerData referrerData) {
        Intrinsics.checkNotNullParameter(referrerData, "referrerData");
        this.referrerExperiment = "referrals-" + referrerData.getCampaign() + "_" + referrerData.getExperiment();
        resetAnalyticsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAnalyticsString() {
        try {
            ArrayList arrayList = new ArrayList(this.serverExperimentAnalyticsStrings.size());
            arrayList.addAll(this.serverExperimentAnalyticsStrings);
            String str = this.referrerExperiment;
            if (str != null) {
                arrayList.add(str);
            }
            this.analyticsExperimentsLogString = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object shouldEnableFullExtendedHours$suspendImpl(ExperimentsStore experimentsStore, Continuation<? super Boolean> continuation) {
        C338611 c338611;
        if (continuation instanceof C338611) {
            c338611 = (C338611) continuation;
            int i = c338611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338611.label = i - Integer.MIN_VALUE;
            } else {
                c338611 = experimentsStore.new C338611(continuation);
            }
        }
        Object objFirst = c338611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(experimentsStore, Experiment.FULL_EXTENDED_HOURS.INSTANCE, FullExtendedHoursVariant.CONTROL, false, 4, null);
            c338611.label = 1;
            objFirst = FlowKt.first(flowCoStreamVariant$default, c338611);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return boxing.boxBoolean(((FullExtendedHoursVariant) objFirst).isMember());
    }

    @Override // com.robinhood.experiments.ExperimentsProvider
    /* renamed from: getCommaSeparatedExperimentNames, reason: from getter */
    public String getAnalyticsExperimentsLogString() {
        return this.analyticsExperimentsLogString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KaizenExperiment get(List<? extends KaizenExperiment> list, ExperimentDeclaration<?> experimentDeclaration, boolean z) {
        validate(CollectionsKt.listOf(experimentDeclaration));
        List<? extends KaizenExperiment> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((KaizenExperiment) obj).getName(), obj);
        }
        KaizenExperiment kaizenExperiment = (KaizenExperiment) linkedHashMap.get(experimentDeclaration.getServerName());
        if (kaizenExperiment == null) {
            return null;
        }
        if (z) {
            ExperimentExposureLogger2.logExposure(this.experimentExposureLogger, experimentDeclaration, kaizenExperiment.getSafeVariation());
        }
        return kaizenExperiment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getState(List<? extends KaizenExperiment> list, List<? extends ExperimentDeclaration<?>> list2, boolean z, ExperimentQueryMode experimentQueryMode) {
        validate(list2);
        List<? extends ExperimentDeclaration<?>> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExperimentDeclaration) it.next()).getServerName());
        }
        return getStateRaw(list, arrayList, z, experimentQueryMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public final boolean getStateRaw(List<? extends KaizenExperiment> list, List<String> list2, boolean z, ExperimentQueryMode experimentQueryMode) {
        List<? extends KaizenExperiment> list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((KaizenExperiment) obj).getName(), obj);
        }
        List<String> list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            KaizenExperiment kaizenExperiment = (KaizenExperiment) linkedHashMap.get((String) it.next());
            if (kaizenExperiment == null) {
                kaizenExperiment = null;
            } else if (z) {
                this.experimentExposureLogger.logExposure(kaizenExperiment.getName(), kaizenExperiment.getSafeVariation());
            }
            arrayList.add(kaizenExperiment);
        }
        Function1 function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.ExperimentsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(ExperimentsStore.getState$lambda$24((KaizenExperiment) obj2));
            }
        };
        int i = WhenMappings.$EnumSwitchMapping$0[experimentQueryMode.ordinal()];
        if (i == 1) {
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!((Boolean) function1.invoke(it3.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getState$lambda$24(KaizenExperiment kaizenExperiment) {
        if (kaizenExperiment != null) {
            return kaizenExperiment.isInExperiment();
        }
        return false;
    }

    private final void validate(List<? extends ExperimentDeclaration<?>> experiments) {
        for (ExperimentDeclaration<?> experimentDeclaration : experiments) {
            ExperimentDeclaration<?> experimentDeclaration2 = this.supportedExperimentsByName.get(experimentDeclaration.getServerName());
            if (experimentDeclaration2 == null) {
                throw new IllegalStateException(("Unsupported experiment (did you multibind it into Set<NamedExperiment>?): " + experimentDeclaration).toString());
            }
            if (!Intrinsics.areEqual(experimentDeclaration2, experimentDeclaration)) {
                throw new IllegalStateException(("Experiment " + experimentDeclaration + " did not match the provisioned definition: " + experimentDeclaration2).toString());
            }
        }
    }
}
