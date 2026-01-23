package com.robinhood.android.navigation;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;

/* compiled from: IntentResolver.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/navigation/IntentResolver;", "KeyT", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/android/navigation/NavigationResolver;", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/IntentKey;)Landroid/content/Intent;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface IntentResolver<KeyT extends IntentKey> extends NavigationResolver {
    Intent getIntent(Context context, KeyT key);
}
