package com.robinhood.utils.p409ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.robinhood.utils.p409ui.activity.ActivityCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityCompanion.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "A", "Landroid/app/Activity;", "P", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/activity/ActivityCompanion;", "getIntentWithExtras", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/content/Intent;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.activity.ActivityWithExtrasCompanion, reason: use source file name */
/* loaded from: classes21.dex */
public interface ActivityCompanion3<A extends Activity, P extends Parcelable> extends ActivityCompanion<A, P> {
    Intent getIntentWithExtras(Context context, P extras);

    /* compiled from: ActivityCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.ui.activity.ActivityWithExtrasCompanion$DefaultImpls */
    public static final class DefaultImpls {
        public static <A extends Activity, P extends Parcelable> P getExtras(ActivityCompanion3<A, P> activityCompanion3, A receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (P) ActivityCompanion.DefaultImpls.getExtras(activityCompanion3, receiver);
        }

        public static <A extends Activity, P extends Parcelable> Intent getIntentWithExtras(ActivityCompanion3<A, P> activityCompanion3, Context context, P p) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) ActivityCompanion2.getActivityClass(activityCompanion3)).putExtra("ActivityCompanion_Extras", p);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
