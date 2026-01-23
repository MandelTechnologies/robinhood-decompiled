package com.robinhood.librobinhood.data.store;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.rosetta.eventlogging.EventName;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "response", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/db/KaizenExperiment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$refreshInternal$job$1", m3645f = "ExperimentsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$refreshInternal$job$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ExperimentsStore6 extends ContinuationImpl7 implements Function3<Unit, Optional<? extends List<? extends KaizenExperiment>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $force;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExperimentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentsStore6(ExperimentsStore experimentsStore, boolean z, Continuation<? super ExperimentsStore6> continuation) {
        super(3, continuation);
        this.this$0 = experimentsStore;
        this.$force = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Unit unit, Optional<? extends List<? extends KaizenExperiment>> optional, Continuation<? super Unit> continuation) {
        ExperimentsStore6 experimentsStore6 = new ExperimentsStore6(this.this$0, this.$force, continuation);
        experimentsStore6.L$0 = optional;
        return experimentsStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            List list = (List) ((Optional) this.L$0).getOrNull();
            if (list != null) {
                this.this$0.kaizenDao.insert(list);
                if (this.$force) {
                    EventLogger eventLogger = this.this$0.eventLogger;
                    String value = EventName.EXPERIMENTS_UPDATED.getValue();
                    String analyticsExperimentsLogString = this.this$0.getAnalyticsExperimentsLogString();
                    if (analyticsExperimentsLogString == null) {
                        analyticsExperimentsLogString = "";
                    }
                    eventLogger.logExperimentAssignments(value, analyticsExperimentsLogString);
                }
            }
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
        return Unit.INSTANCE;
    }
}
