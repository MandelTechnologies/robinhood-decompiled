package io.ktor.client.request;

import io.ktor.util.pipeline.Phase;
import io.ktor.util.pipeline.Pipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HttpRequestPipeline.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/util/pipeline/Pipeline;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "developmentMode", "", "(Z)V", "getDevelopmentMode", "()Z", "Phases", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.request.HttpSendPipeline, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpRequestPipeline2 extends Pipeline<Object, HttpRequest2> {
    private final boolean developmentMode;

    /* renamed from: Phases, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Phase Before = new Phase("Before");
    private static final Phase State = new Phase("State");
    private static final Phase Monitoring = new Phase("Monitoring");
    private static final Phase Engine = new Phase("Engine");
    private static final Phase Receive = new Phase("Receive");

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public HttpRequestPipeline2(boolean z) {
        super(Before, State, Monitoring, Engine, Receive);
        this.developmentMode = z;
    }

    /* compiled from: HttpRequestPipeline.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/client/request/HttpSendPipeline$Phases;", "", "<init>", "()V", "Lio/ktor/util/pipeline/PipelinePhase;", "Engine", "Lio/ktor/util/pipeline/PipelinePhase;", "getEngine", "()Lio/ktor/util/pipeline/PipelinePhase;", "Receive", "getReceive", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.client.request.HttpSendPipeline$Phases, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Phase getEngine() {
            return HttpRequestPipeline2.Engine;
        }

        public final Phase getReceive() {
            return HttpRequestPipeline2.Receive;
        }
    }
}
