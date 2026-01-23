package com.robinhood.shared.pictureinpicture.pipsupport;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PictureInPictureStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "applicationContext", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;)V", "streamIsInPipExperiment", "Lkotlinx/coroutines/flow/Flow;", "", "streamIsInOptionsPipExperiment", "streamIsInIndexOptionsPipExperiment", "streamIsInPipExperimentObservable", "Lio/reactivex/Observable;", "deviceSupportsPip", "launchPipMode", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "key", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Companion", "lib-pip-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PictureInPictureStore {
    private final Context applicationContext;
    private final ExperimentsStore experimentsStore;
    private final Navigator navigator;

    public PictureInPictureStore(ExperimentsStore experimentsStore, Context applicationContext, Navigator navigator) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.experimentsStore = experimentsStore;
        this.applicationContext = applicationContext;
        this.navigator = navigator;
    }

    public final Flow<Boolean> streamIsInPipExperiment() {
        return Context7.buffer$default(RxConvert.asFlow(streamIsInPipExperimentObservable()), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<Boolean> streamIsInOptionsPipExperiment() {
        return deviceSupportsPip() ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Companion.PipOptionsExperiment.INSTANCE}, false, null, 6, null) : FlowKt.flowOf(Boolean.FALSE);
    }

    public final Flow<Boolean> streamIsInIndexOptionsPipExperiment() {
        return deviceSupportsPip() ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Companion.PipIndexOptionsExperiment.INSTANCE}, false, null, 6, null) : FlowKt.flowOf(Boolean.FALSE);
    }

    public final Observable<Boolean> streamIsInPipExperimentObservable() {
        if (deviceSupportsPip()) {
            return ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Companion.PipExperiment.INSTANCE}, false, null, 6, null);
        }
        Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    public final boolean deviceSupportsPip() {
        return this.applicationContext.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    public final void launchPipMode(BaseActivity activity, PictureInPictureKey key) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(this.navigator, activity, key, null, false, 12, null);
        intentCreateIntent$default.setFlags(268468224);
        activity.startActivity(intentCreateIntent$default);
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(0, 0, 0);
            activity.overrideActivityTransition(1, 0, 0);
        } else {
            activity.overridePendingTransition(0, 0);
        }
    }
}
