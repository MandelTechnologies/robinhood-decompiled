package io.bitdrift.capture.network.okhttp;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import io.bitdrift.capture.Capture;
import io.bitdrift.capture.ILogger;
import io.bitdrift.capture.common.DefaultClock;
import io.bitdrift.capture.common.IClock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;

/* compiled from: CaptureOkHttpEventListenerFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003BF\b\u0000\u0012%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/CaptureOkHttpEventListenerFactory;", "Lokhttp3/EventListener$Factory;", "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/Call;", "Lkotlin/ParameterName;", "name", "call", "Lokhttp3/EventListener;", "targetEventListenerCreator", "Lio/bitdrift/capture/ILogger;", "logger", "Lio/bitdrift/capture/common/IClock;", Card.Icon.CLOCK, "(Lkotlin/jvm/functions/Function1;Lio/bitdrift/capture/ILogger;Lio/bitdrift/capture/common/IClock;)V", "getLogger", "()Lio/bitdrift/capture/ILogger;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lokhttp3/Call;)Lokhttp3/EventListener;", "Lkotlin/jvm/functions/Function1;", "Lio/bitdrift/capture/ILogger;", "Lio/bitdrift/capture/common/IClock;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class CaptureOkHttpEventListenerFactory implements EventListener.Factory {
    private final IClock clock;
    private final ILogger logger;
    private final Function1<Call, EventListener> targetEventListenerCreator;

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureOkHttpEventListenerFactory(Function1<? super Call, ? extends EventListener> function1, ILogger iLogger, IClock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.targetEventListenerCreator = function1;
        this.logger = iLogger;
        this.clock = clock;
    }

    public /* synthetic */ CaptureOkHttpEventListenerFactory(Function1 function1, ILogger iLogger, IClock iClock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? Capture.INSTANCE.logger() : iLogger, (i & 4) != 0 ? DefaultClock.INSTANCE.getInstance() : iClock);
    }

    public CaptureOkHttpEventListenerFactory() {
        this(null, null, null, 6, null);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ILogger logger = getLogger();
        IClock iClock = this.clock;
        Function1<Call, EventListener> function1 = this.targetEventListenerCreator;
        return new CaptureOkHttpEventListener(logger, iClock, function1 != null ? function1.invoke(call) : null);
    }

    private final ILogger getLogger() {
        ILogger iLogger = this.logger;
        return iLogger == null ? Capture.INSTANCE.logger() : iLogger;
    }
}
