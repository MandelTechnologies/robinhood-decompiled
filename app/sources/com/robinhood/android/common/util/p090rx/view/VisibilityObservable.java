package com.robinhood.android.common.util.p090rx.view;

import kotlin.Metadata;

/* compiled from: VisibilityObservable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/view/VisibilityObservable;", "", "addVisibilityListener", "", "listener", "Lcom/robinhood/android/common/util/rx/view/VisibilityObservable$VisibilityChangeListener;", "removeVisibilityListener", "VisibilityChangeListener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface VisibilityObservable {

    /* compiled from: VisibilityObservable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/view/VisibilityObservable$VisibilityChangeListener;", "", "onVisibilityChange", "", "visible", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface VisibilityChangeListener {
        void onVisibilityChange(boolean visible);
    }

    void addVisibilityListener(VisibilityChangeListener listener);

    void removeVisibilityListener(VisibilityChangeListener listener);
}
