package com.robinhood.shared.navigation.provisions;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.ResolverNotFoundHandler;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: StrictResolverNotFoundHandler.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/StrictResolverNotFoundHandler;", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "<init>", "()V", "dialogFragmentResolverNotFound", "Landroidx/fragment/app/DialogFragment;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "fragmentResolverNotFound", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "intentResolverNotFound", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StrictResolverNotFoundHandler implements ResolverNotFoundHandler {
    public static final int $stable = 0;
    public static final StrictResolverNotFoundHandler INSTANCE = new StrictResolverNotFoundHandler();

    private StrictResolverNotFoundHandler() {
    }

    @Override // com.robinhood.android.navigation.ResolverNotFoundHandler
    public DialogFragment dialogFragmentResolverNotFound(DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalStateException(("Cannot resolve DialogFragmentKey " + Reflection.getOrCreateKotlinClass(key.getClass()).getSimpleName()).toString());
    }

    @Override // com.robinhood.android.navigation.ResolverNotFoundHandler
    public Fragment fragmentResolverNotFound(FragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalStateException(("Cannot resolve FragmentKey " + Reflection.getOrCreateKotlinClass(key.getClass()).getSimpleName()).toString());
    }

    @Override // com.robinhood.android.navigation.ResolverNotFoundHandler
    public Intent intentResolverNotFound(Context context, IntentKey key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalStateException(("Cannot resolve IntentKey " + Reflection.getOrCreateKotlinClass(key.getClass()).getSimpleName()).toString());
    }
}
