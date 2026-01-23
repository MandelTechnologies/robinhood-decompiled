package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PipelinePhase.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lio/ktor/util/pipeline/InvalidPhaseException;", "", "message", "", "(Ljava/lang/String;)V", "ktor-utils"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.util.pipeline.InvalidPhaseException, reason: use source file name */
/* loaded from: classes14.dex */
public final class PipelinePhase2 extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelinePhase2(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
