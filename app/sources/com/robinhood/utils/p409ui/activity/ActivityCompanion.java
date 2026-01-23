package com.robinhood.utils.p409ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u00020\u0005:\u0001\tR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/ui/activity/ActivityCompanion;", "A", "Landroid/app/Activity;", "P", "Landroid/os/Parcelable;", "", "extras", "getExtras", "(Landroid/app/Activity;)Landroid/os/Parcelable;", "Companion", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ActivityCompanion<A extends Activity, P extends Parcelable> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String EXTRAS_KEY = "ActivityCompanion_Extras";

    P getExtras(A a);

    /* compiled from: ActivityCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <A extends Activity, P extends Parcelable> P getExtras(ActivityCompanion<A, P> activityCompanion, A receiver) {
            Bundle extras;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intent intent = receiver.getIntent();
            return (P) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("ActivityCompanion_Extras"));
        }
    }

    /* compiled from: ActivityCompanion.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/ui/activity/ActivityCompanion$Companion;", "", "<init>", "()V", "EXTRAS_KEY", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String EXTRAS_KEY = "ActivityCompanion_Extras";

        private Companion() {
        }
    }
}
