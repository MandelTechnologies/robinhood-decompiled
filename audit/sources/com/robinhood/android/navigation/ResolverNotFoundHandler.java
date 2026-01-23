package com.robinhood.android.navigation;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;

/* compiled from: ResolverNotFoundHandler.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "", "dialogFragmentResolverNotFound", "Landroidx/fragment/app/DialogFragment;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "fragmentResolverNotFound", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "intentResolverNotFound", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ResolverNotFoundHandler {
    DialogFragment dialogFragmentResolverNotFound(DialogFragmentKey key);

    Fragment fragmentResolverNotFound(FragmentKey key);

    Intent intentResolverNotFound(Context context, IntentKey key);
}
