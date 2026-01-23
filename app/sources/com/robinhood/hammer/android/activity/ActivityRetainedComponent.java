package com.robinhood.hammer.android.activity;

import kotlin.Metadata;

/* compiled from: ActivityRetainedComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;", "Lcom/robinhood/hammer/android/activity/ActivityComponent;", "Factory", "ParentComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ActivityRetainedComponent extends ActivityComponent {

    /* compiled from: ActivityRetainedComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent$Factory;", "", "build", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        ActivityRetainedComponent build();
    }

    /* compiled from: ActivityRetainedComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent$ParentComponent;", "", "createActivityRetainedSubcomponentFactory", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent$Factory;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ParentComponent {
        Factory createActivityRetainedSubcomponentFactory();
    }
}
