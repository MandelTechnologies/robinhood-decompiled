package com.userleap.internal.sessionreplay;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/userleap/internal/sessionreplay/RecorderLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "onPause", "onResume", "Lkotlin/Function0;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Lkotlin/jvm/functions/Function0;", "getOnBackground", "()Lkotlin/jvm/functions/Function0;", "onBackground", "b", "getOnResume", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class RecorderLifecycleObserver implements DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    private final Function0<Unit> onBackground;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function0<Unit> onResume;

    public RecorderLifecycleObserver(Function0<Unit> onBackground, Function0<Unit> onResume) {
        Intrinsics.checkNotNullParameter(onBackground, "onBackground");
        Intrinsics.checkNotNullParameter(onResume, "onResume");
        this.onBackground = onBackground;
        this.onResume = onResume;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.onBackground.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        this.onResume.invoke();
    }
}
