package com.robinhood.android.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentResolverWithExtrasCompanion.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0004*\u00020\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0012\u0004\u0012\u0002H\u00030\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "A", "Landroid/app/Activity;", "KeyT", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/navigation/IntentResolver;", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/content/Intent;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface IntentResolverWithExtrasCompanion<A extends Activity, KeyT extends Parcelable & IntentKey> extends ActivityCompanion3<A, KeyT>, IntentResolver<KeyT> {
    Intent getIntent(Context context, KeyT key);

    /* compiled from: IntentResolverWithExtrasCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <A extends Activity, KeyT extends Parcelable & IntentKey> KeyT getExtras(IntentResolverWithExtrasCompanion<A, KeyT> intentResolverWithExtrasCompanion, A receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (KeyT) ActivityCompanion3.DefaultImpls.getExtras(intentResolverWithExtrasCompanion, receiver);
        }

        public static <A extends Activity, KeyT extends Parcelable & IntentKey> Intent getIntentWithExtras(IntentResolverWithExtrasCompanion<A, KeyT> intentResolverWithExtrasCompanion, Context context, KeyT keyt) {
            Intrinsics.checkNotNullParameter(context, "context");
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(intentResolverWithExtrasCompanion, context, keyt);
        }

        public static <A extends Activity, KeyT extends Parcelable & IntentKey> Intent getIntent(IntentResolverWithExtrasCompanion<A, KeyT> intentResolverWithExtrasCompanion, Context context, KeyT keyt) {
            Intrinsics.checkNotNullParameter(context, "context");
            return intentResolverWithExtrasCompanion.getIntentWithExtras(context, keyt);
        }
    }
}
