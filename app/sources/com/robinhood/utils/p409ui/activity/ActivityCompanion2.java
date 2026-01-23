package com.robinhood.utils.p409ui.activity;

import android.app.Activity;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"F\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00068BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"activityClass", "Ljava/lang/Class;", "A", "Landroid/app/Activity;", "P", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/activity/ActivityCompanion;", "getActivityClass$annotations", "(Lcom/robinhood/utils/ui/activity/ActivityCompanion;)V", "getActivityClass", "(Lcom/robinhood/utils/ui/activity/ActivityCompanion;)Ljava/lang/Class;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.activity.ActivityCompanionKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ActivityCompanion2 {
    private static /* synthetic */ void getActivityClass$annotations(ActivityCompanion activityCompanion) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <A extends Activity, P extends Parcelable> Class<A> getActivityClass(ActivityCompanion<A, P> activityCompanion) {
        Class<A> cls = (Class<A>) activityCompanion.getClass().getDeclaringClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<A of com.robinhood.utils.ui.activity.ActivityCompanionKt.<get-activityClass>>");
        return cls;
    }
}
