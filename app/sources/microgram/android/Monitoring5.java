package microgram.android;

import com.robinhood.android.tracing.RhTrace6;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import microgram.android.Monitoring;
import timber.log.Timber;

/* compiled from: Monitoring.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/android/RealMonitor;", "Lmicrogram/android/Monitor;", "Lmicrogram/android/MonitorListener;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lcom/robinhood/android/tracing/TrackTrace;)V", "localTrace", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lmicrogram/android/MicrogramState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onLoading", "", "onReady", "onException", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "Lokio/IOException;", "onClosed", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.RealMonitor, reason: use source file name */
/* loaded from: classes14.dex */
public final class Monitoring5 implements Monitoring2, Monitoring3 {
    private final StateFlow2<Monitoring> _state;
    private final RhTrace6 localTrace;

    public Monitoring5(RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.localTrace = instanceTrace.withMethodNamePrefix("RealMonitor.");
        this._state = StateFlow4.MutableStateFlow(Monitoring.Loading.INSTANCE);
    }

    @Override // microgram.android.Monitoring2
    public StateFlow<Monitoring> getState() {
        return this._state;
    }

    @Override // microgram.android.Monitoring3
    public void onLoading() {
        Monitoring value;
        Monitoring monitoring;
        this.localTrace.instant("onLoading");
        Timber.INSTANCE.mo3350d("Loading", new Object[0]);
        StateFlow2<Monitoring> stateFlow2 = this._state;
        do {
            value = stateFlow2.getValue();
            monitoring = value;
            if ((monitoring instanceof Monitoring.Loading) || (monitoring instanceof Monitoring.Ready)) {
                monitoring = Monitoring.Loading.INSTANCE;
            } else if (!(monitoring instanceof Monitoring.Terminated)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!stateFlow2.compareAndSet(value, monitoring));
    }

    @Override // microgram.android.Monitoring3
    public void onReady() {
        Monitoring value;
        Monitoring monitoring;
        this.localTrace.instant("onReady");
        Timber.INSTANCE.mo3350d("Ready", new Object[0]);
        StateFlow2<Monitoring> stateFlow2 = this._state;
        do {
            value = stateFlow2.getValue();
            monitoring = value;
            if ((monitoring instanceof Monitoring.Loading) || (monitoring instanceof Monitoring.Ready)) {
                monitoring = Monitoring.Ready.INSTANCE;
            } else if (!(monitoring instanceof Monitoring.Terminated)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!stateFlow2.compareAndSet(value, monitoring));
    }

    @Override // microgram.android.Monitoring3
    public void onException(IOException e) {
        Monitoring value;
        Monitoring appUpdateRequired;
        Intrinsics.checkNotNullParameter(e, "e");
        RhTrace6 rhTrace6 = this.localTrace;
        if (rhTrace6.isEnabled()) {
            rhTrace6.instant("onException(" + e.getClass().getSimpleName() + ")");
        }
        Timber.INSTANCE.mo3354e(e);
        StateFlow2<Monitoring> stateFlow2 = this._state;
        do {
            value = stateFlow2.getValue();
            appUpdateRequired = value;
            if ((appUpdateRequired instanceof Monitoring.Loading) || (appUpdateRequired instanceof Monitoring.Ready)) {
                appUpdateRequired = e instanceof AppUpdateRequiredException ? new Monitoring.Terminated.AppUpdateRequired((AppUpdateRequiredException) e) : new Monitoring.Terminated.Failure(e);
            } else if (!(appUpdateRequired instanceof Monitoring.Terminated)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!stateFlow2.compareAndSet(value, appUpdateRequired));
    }

    @Override // microgram.android.Monitoring3
    public void onClosed() {
        Monitoring value;
        Monitoring monitoring;
        this.localTrace.instant("onClosed");
        Timber.INSTANCE.mo3350d("Closed", new Object[0]);
        StateFlow2<Monitoring> stateFlow2 = this._state;
        do {
            value = stateFlow2.getValue();
            monitoring = value;
            if ((monitoring instanceof Monitoring.Loading) || (monitoring instanceof Monitoring.Ready)) {
                monitoring = Monitoring.Terminated.Closed.INSTANCE;
            } else if (!(monitoring instanceof Monitoring.Terminated)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!stateFlow2.compareAndSet(value, monitoring));
    }
}
