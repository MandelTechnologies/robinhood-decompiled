package leakcanary;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import shark.SharkLog;

/* compiled from: AndroidLeakFixes.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m3636d2 = {"<anonymous>", "", "invoke"}, m3637k = 3, m3638mv = {1, 4, 1})
/* renamed from: leakcanary.AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3 */
/* loaded from: classes14.dex */
final class C46188xff5bafd4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Handler $flushHandler;
    final /* synthetic */ HandlerThread $handlerThread;
    final /* synthetic */ Ref.BooleanRef $scheduleFlush;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C46188xff5bafd4(HandlerThread handlerThread, Ref.BooleanRef booleanRef, Handler handler) {
        super(0);
        this.$handlerThread = handlerThread;
        this.$scheduleFlush = booleanRef;
        this.$flushHandler = handler;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$handlerThread.isAlive()) {
            Ref.BooleanRef booleanRef = this.$scheduleFlush;
            if (booleanRef.element) {
                booleanRef.element = false;
                try {
                    if (this.$flushHandler.postDelayed(new Runnable() { // from class: leakcanary.AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3$posted$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.this$0.$scheduleFlush.element = true;
                        }
                    }, 1000L)) {
                        return;
                    }
                    SharkLog.INSTANCE.getLogger();
                } catch (RuntimeException unused) {
                    SharkLog.INSTANCE.getLogger();
                }
            }
        }
    }
}
