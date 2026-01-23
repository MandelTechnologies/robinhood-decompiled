package com.robinhood.android.experiments.fetcher;

import com.robinhood.coroutines.RetryOnError;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.fetcher.ExperimentFetcher;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.KaizenExperiment2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.Installation;
import com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentService;
import com.robinhood.rosetta.experiment_assignment.HTTPAssignRequestDto;
import com.robinhood.rosetta.experiment_assignment.HTTPAssignResponseDto;
import com.robinhood.rosetta.experiment_assignment.HTTPAssignResultDto;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.http.Headers;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: TraderExperimentFetcher.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0096@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcher;", "Lcom/robinhood/librobinhood/data/fetcher/ExperimentFetcher;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "kaizenApi", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;Lcom/robinhood/prefs/Installation;)V", "fetchKaizenExperiments", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/db/KaizenExperiment;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDeviceIdExperiments", "Companion", "lib-experiment-fetcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class TraderExperimentFetcher implements ExperimentFetcher {
    private static final String DEVICE_ID_ENTITY_TYPE = "Device Id";
    private static final int MAX_RETRIES_DEVICE_ID_EXPERIMENTS = 5;
    private final Installation installation;
    private final ExperimentAssignmentService kaizenApi;
    private final UserStore userStore;

    /* compiled from: TraderExperimentFetcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.experiments.fetcher.TraderExperimentFetcher", m3645f = "TraderExperimentFetcher.kt", m3646l = {44}, m3647m = "fetchDeviceIdExperiments")
    /* renamed from: com.robinhood.android.experiments.fetcher.TraderExperimentFetcher$fetchDeviceIdExperiments$1 */
    static final class C166211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C166211(Continuation<? super C166211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderExperimentFetcher.this.fetchDeviceIdExperiments(this);
        }
    }

    /* compiled from: TraderExperimentFetcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.experiments.fetcher.TraderExperimentFetcher", m3645f = "TraderExperimentFetcher.kt", m3646l = {32, 34}, m3647m = "fetchKaizenExperiments")
    /* renamed from: com.robinhood.android.experiments.fetcher.TraderExperimentFetcher$fetchKaizenExperiments$1 */
    static final class C166231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C166231(Continuation<? super C166231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraderExperimentFetcher.this.fetchKaizenExperiments(this);
        }
    }

    public TraderExperimentFetcher(UserStore userStore, ExperimentAssignmentService kaizenApi, Installation installation) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(kaizenApi, "kaizenApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.userStore = userStore;
        this.kaizenApi = kaizenApi;
        this.installation = installation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r1 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.librobinhood.data.fetcher.ExperimentFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchKaizenExperiments(Continuation<? super Optional<? extends List<? extends KaizenExperiment>>> continuation) {
        C166231 c166231;
        if (continuation instanceof C166231) {
            c166231 = (C166231) continuation;
            int i = c166231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c166231.label = i - Integer.MIN_VALUE;
            } else {
                c166231 = new C166231(continuation);
            }
        }
        Object objFirstOrNull = c166231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c166231.label;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
            c166231.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowBuffer$default, c166231);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            List<HTTPAssignResultDto> experiments = ((HTTPAssignResponseDto) objFirstOrNull).getExperiments();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiments, 10));
            Iterator<T> it = experiments.iterator();
            while (it.hasNext()) {
                arrayList.add(KaizenExperiment2.toDbModel((HTTPAssignResultDto) it.next()));
            }
            return Optional3.asOptional(arrayList);
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        User user = (User) objFirstOrNull;
        if (user != null) {
            ExperimentAssignmentService experimentAssignmentService = this.kaizenApi;
            HTTPAssignRequestDto hTTPAssignRequestDto = new HTTPAssignRequestDto(Uuids.safeToString(user.getId()), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
            c166231.label = 2;
            objFirstOrNull = experimentAssignmentService.HTTPAssignExternal(hTTPAssignRequestDto, c166231);
        }
        return Optional3.asOptional(arrayList);
    }

    /* compiled from: TraderExperimentFetcher.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.experiments.fetcher.TraderExperimentFetcher$fetchDeviceIdExperiments$2", m3645f = "TraderExperimentFetcher.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.experiments.fetcher.TraderExperimentFetcher$fetchDeviceIdExperiments$2 */
    static final class C166222 extends ContinuationImpl7 implements Function1<Continuation<? super Response<? extends HTTPAssignResponseDto>>, Object> {
        int label;

        C166222(Continuation<? super C166222> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return TraderExperimentFetcher.this.new C166222(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Response<? extends HTTPAssignResponseDto>> continuation) {
            return invoke2((Continuation<? super Response<HTTPAssignResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Response<HTTPAssignResponseDto>> continuation) {
            return ((C166222) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Request<HTTPAssignRequestDto> request = new Request<>(new HTTPAssignRequestDto(TraderExperimentFetcher.this.installation.mo2745id(), null, TraderExperimentFetcher.DEVICE_ID_ENTITY_TYPE, null, null, null, null, null, null, null, null, null, 4090, null), MapsKt.mapOf(Tuples4.m3642to(Headers.OMIT_AUTH_HEADER, Constants.SdidMigrationStatusCodes.ALREADY_SDID)));
            ExperimentAssignmentService experimentAssignmentService = TraderExperimentFetcher.this.kaizenApi;
            this.label = 1;
            Object objHTTPAssignExternal = experimentAssignmentService.HTTPAssignExternal(request, this);
            return objHTTPAssignExternal == coroutine_suspended ? coroutine_suspended : objHTTPAssignExternal;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.librobinhood.data.fetcher.ExperimentFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchDeviceIdExperiments(Continuation<? super List<? extends KaizenExperiment>> continuation) {
        C166211 c166211;
        if (continuation instanceof C166211) {
            c166211 = (C166211) continuation;
            int i = c166211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c166211.label = i - Integer.MIN_VALUE;
            } else {
                c166211 = new C166211(continuation);
            }
        }
        C166211 c1662112 = c166211;
        Object objRetryExponential$default = c1662112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1662112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRetryExponential$default);
            C166222 c166222 = new C166222(null);
            c1662112.label = 1;
            objRetryExponential$default = RetryOnError.retryExponential$default(5, null, c166222, c1662112, 2, null);
            if (objRetryExponential$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRetryExponential$default);
        }
        List<HTTPAssignResultDto> experiments = ((HTTPAssignResponseDto) ((Response) objRetryExponential$default).getData()).getExperiments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiments, 10));
        Iterator<T> it = experiments.iterator();
        while (it.hasNext()) {
            arrayList.add(KaizenExperiment2.toDbModel((HTTPAssignResultDto) it.next()));
        }
        return arrayList;
    }
}
