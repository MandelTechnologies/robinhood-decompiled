package com.robinhood.android.lib.stepupverification;

import com.robinhood.android.models.stepupverification.api.ApiWorkflowMigratedResponse;
import com.robinhood.api.stepupverification.StepUpVerificationApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SuvMigrationManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/api/stepupverification/StepUpVerificationApi;)V", "isMigrated", "", "workflowId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SuvMigrationManager {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final StepUpVerificationApi stepUpVerificationApi;

    /* compiled from: SuvMigrationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.stepupverification.SuvMigrationManager", m3645f = "SuvMigrationManager.kt", m3646l = {38, 39, 28}, m3647m = "isMigrated")
    /* renamed from: com.robinhood.android.lib.stepupverification.SuvMigrationManager$isMigrated$1 */
    static final class C205311 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C205311(Continuation<? super C205311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuvMigrationManager.this.isMigrated(null, this);
        }
    }

    public SuvMigrationManager(ExperimentsStore experimentsStore, StepUpVerificationApi stepUpVerificationApi) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
        this.experimentsStore = experimentsStore;
        this.stepUpVerificationApi = stepUpVerificationApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:38:0x009f, B:35:0x0092), top: B:45:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isMigrated(UUID uuid, Continuation<? super Boolean> continuation) {
        C205311 c205311;
        if (continuation instanceof C205311) {
            c205311 = (C205311) continuation;
            int i = c205311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c205311.label = i - Integer.MIN_VALUE;
            } else {
                c205311 = new C205311(continuation);
            }
        }
        Object objAwait = c205311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c205311.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Single state$default = ExperimentsStore.getState$default(this.experimentsStore, SuvExperiments2.INSTANCE, false, 2, null);
                c205311.L$0 = uuid;
                c205311.label = 1;
                objAwait = RxAwait3.await(state$default, c205311);
                if (objAwait != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                uuid = (UUID) c205311.L$0;
                ResultKt.throwOnFailure(objAwait);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objAwait);
                    return boxing.boxBoolean(((ApiWorkflowMigratedResponse) objAwait).getResult());
                }
                uuid = (UUID) c205311.L$0;
                ResultKt.throwOnFailure(objAwait);
                if (!((Boolean) objAwait).booleanValue()) {
                    return boxing.boxBoolean(false);
                }
                StepUpVerificationApi stepUpVerificationApi = this.stepUpVerificationApi;
                c205311.L$0 = null;
                c205311.label = 3;
                objAwait = stepUpVerificationApi.isWorkflowMigrated(uuid, c205311);
            }
            if (((Boolean) objAwait).booleanValue()) {
                return boxing.boxBoolean(true);
            }
            Single state$default2 = ExperimentsStore.getState$default(this.experimentsStore, SuvExperiments.INSTANCE, false, 2, null);
            c205311.L$0 = uuid;
            c205311.label = 2;
            objAwait = RxAwait3.await(state$default2, c205311);
            if (objAwait != coroutine_suspended) {
                if (!((Boolean) objAwait).booleanValue()) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return boxing.boxBoolean(false);
        }
    }
}
