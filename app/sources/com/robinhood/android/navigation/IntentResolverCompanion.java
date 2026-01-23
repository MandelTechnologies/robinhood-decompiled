package com.robinhood.android.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentResolverCompanion.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/IntentResolverCompanion;", "A", "Landroid/app/Activity;", "KeyT", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/android/navigation/IntentResolver;", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/IntentKey;)Landroid/content/Intent;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface IntentResolverCompanion<A extends Activity, KeyT extends IntentKey> extends IntentResolver<KeyT> {
    @Override // com.robinhood.android.navigation.IntentResolver
    Intent getIntent(Context context, KeyT key);

    /* compiled from: IntentResolverCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <A extends Activity, KeyT extends IntentKey> Intent getIntent(IntentResolverCompanion<A, KeyT> intentResolverCompanion, Context context, KeyT key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Class<?> declaringClass = intentResolverCompanion.getClass().getDeclaringClass();
            Intrinsics.checkNotNull(declaringClass, "null cannot be cast to non-null type java.lang.Class<A of com.robinhood.android.navigation.IntentResolverCompanion>");
            return new Intent(context, declaringClass);
        }
    }
}
