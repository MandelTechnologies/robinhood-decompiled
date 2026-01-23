package com.robinhood.android.plt;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import p479j$.time.Clock;

/* compiled from: RealPltManager.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00012B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/plt/RealPltManager;", "Lcom/robinhood/android/plt/contract/PltManager;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogger;Lj$/time/Clock;)V", "", "resetLoadingElements", "()J", "", "isLoading", "", "updateLoadingState", "(Z)V", "", "identifier", "onElementLoadStarted", "(Ljava/lang/String;)V", "onElementLoadEnded", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "hasZeroPlt", "onScreenAppear", "(Lcom/robinhood/rosetta/eventlogging/Screen;Z)V", "onScreenDisappear", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lkotlinx/coroutines/flow/Flow;", "streamLoadingState", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/analytics/EventLogger;", "Lj$/time/Clock;", "Lcom/robinhood/android/plt/Stopwatch;", "stopwatch", "Lcom/robinhood/android/plt/Stopwatch;", "activeScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/android/plt/RealPltManager$ScreenMetadata;", "activeScreenMetadata", "Lcom/robinhood/android/plt/RealPltManager$ScreenMetadata;", "", "loadingElements", "Ljava/util/Set;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "loadingStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "ScreenMetadata", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RealPltManager implements PltManager {
    public static final int $stable = 8;
    private Screen activeScreen;
    private ScreenMetadata activeScreenMetadata;
    private final Clock clock;
    private final CoroutineScope coroutineScope;
    private final EventLogger eventLogger;
    private final Set<String> loadingElements;
    private final SharedFlow2<Boolean> loadingStateFlow;
    private final Stopwatch stopwatch;

    public RealPltManager(@RootCoroutineScope CoroutineScope coroutineScope, EventLogger eventLogger, @ElapsedRealtime Clock clock) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
        this.clock = clock;
        this.stopwatch = new Stopwatch(clock);
        this.loadingElements = new LinkedHashSet();
        this.loadingStateFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    @Override // com.robinhood.android.plt.contract.PltManager
    public void onElementLoadStarted(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        synchronized (this) {
            try {
                if (this.activeScreen == null) {
                    return;
                }
                if (this.loadingElements.isEmpty()) {
                    updateLoadingState(true);
                }
                this.loadingElements.add(identifier);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.plt.contract.PltManager
    public void onElementLoadEnded(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        synchronized (this) {
            try {
                this.loadingElements.remove(identifier);
                if (this.loadingElements.isEmpty()) {
                    updateLoadingState(false);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.plt.contract.PltManager
    public void onScreenAppear(Screen screen, boolean hasZeroPlt) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        synchronized (this) {
            try {
                Screen screen2 = this.activeScreen;
                if (screen2 != null) {
                    onScreenDisappear(screen2);
                }
                this.activeScreen = screen;
                this.activeScreenMetadata = new ScreenMetadata(this.clock.millis(), hasZeroPlt);
                resetLoadingElements();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.plt.contract.PltManager
    public void onScreenDisappear(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        synchronized (this) {
            if (Intrinsics.areEqual(screen, this.activeScreen)) {
                this.activeScreen = null;
                boolean z = !this.loadingElements.isEmpty();
                long jResetLoadingElements = resetLoadingElements();
                ScreenMetadata screenMetadata = this.activeScreenMetadata;
                if (screenMetadata == null) {
                    return;
                }
                this.activeScreenMetadata = null;
                long jMillis = this.clock.millis() - screenMetadata.getStartTime();
                if (jMillis < 16) {
                    return;
                }
                this.eventLogger.logPltEvent(new PerceivedLoadingTimeEventData(screenMetadata.getHasZeroPlt() ? 0L : jResetLoadingElements, jMillis, screen, z, 0, 0, null, 112, null));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final long resetLoadingElements() {
        this.loadingElements.clear();
        updateLoadingState(false);
        return this.stopwatch.reset();
    }

    private final void updateLoadingState(boolean isLoading) {
        if (isLoading) {
            this.stopwatch.start();
        } else {
            this.stopwatch.stop();
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C255461(isLoading, null), 3, null);
    }

    /* compiled from: RealPltManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.plt.RealPltManager$updateLoadingState$1", m3645f = "RealPltManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.plt.RealPltManager$updateLoadingState$1 */
    static final class C255461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isLoading;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C255461(boolean z, Continuation<? super C255461> continuation) {
            super(2, continuation);
            this.$isLoading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealPltManager.this.new C255461(this.$isLoading, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = RealPltManager.this.loadingStateFlow;
                Boolean boolBoxBoolean = boxing.boxBoolean(this.$isLoading);
                this.label = 1;
                if (sharedFlow2.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.plt.contract.PltManager
    public Flow<Boolean> streamLoadingState() {
        return FlowKt.distinctUntilChanged(this.loadingStateFlow);
    }

    /* compiled from: RealPltManager.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/plt/RealPltManager$ScreenMetadata;", "", "startTime", "", "hasZeroPlt", "", "<init>", "(JZ)V", "getStartTime", "()J", "getHasZeroPlt", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScreenMetadata {
        public static final int $stable = 0;
        private final boolean hasZeroPlt;
        private final long startTime;

        public static /* synthetic */ ScreenMetadata copy$default(ScreenMetadata screenMetadata, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = screenMetadata.startTime;
            }
            if ((i & 2) != 0) {
                z = screenMetadata.hasZeroPlt;
            }
            return screenMetadata.copy(j, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasZeroPlt() {
            return this.hasZeroPlt;
        }

        public final ScreenMetadata copy(long startTime, boolean hasZeroPlt) {
            return new ScreenMetadata(startTime, hasZeroPlt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenMetadata)) {
                return false;
            }
            ScreenMetadata screenMetadata = (ScreenMetadata) other;
            return this.startTime == screenMetadata.startTime && this.hasZeroPlt == screenMetadata.hasZeroPlt;
        }

        public int hashCode() {
            return (Long.hashCode(this.startTime) * 31) + Boolean.hashCode(this.hasZeroPlt);
        }

        public String toString() {
            return "ScreenMetadata(startTime=" + this.startTime + ", hasZeroPlt=" + this.hasZeroPlt + ")";
        }

        public ScreenMetadata(long j, boolean z) {
            this.startTime = j;
            this.hasZeroPlt = z;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final boolean getHasZeroPlt() {
            return this.hasZeroPlt;
        }
    }
}
