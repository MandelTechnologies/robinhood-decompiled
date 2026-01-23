package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Worker.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\bJ\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/squareup/workflow1/Worker;", "OutputT", "", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Companion", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Worker<OutputT> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean doesSameWorkAs(Worker<?> otherWorker);

    Flow<OutputT> run();

    /* compiled from: Worker.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <OutputT> boolean doesSameWorkAs(Worker<? extends OutputT> worker, Worker<?> otherWorker) {
            Intrinsics.checkNotNullParameter(worker, "this");
            Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
            return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(otherWorker.getClass()), Reflection.getOrCreateKotlinClass(worker.getClass()));
        }
    }

    /* compiled from: Worker.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/Worker$Companion;", "", "<init>", "()V", "", "delayMs", "", "key", "Lcom/squareup/workflow1/Worker;", "", "timer", "(JLjava/lang/String;)Lcom/squareup/workflow1/Worker;", "Lkotlin/reflect/KType;", "TYPE_OF_NOTHING", "Lkotlin/reflect/KType;", "getTYPE_OF_NOTHING$annotations", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final KType TYPE_OF_NOTHING = Reflection.typeOf(Void.class);

        private Companion() {
        }

        public static /* synthetic */ Worker timer$default(Companion companion, long j, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.timer(j, str);
        }

        public final Worker<Unit> timer(long delayMs, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new TimerWorker(delayMs, key);
        }
    }
}
