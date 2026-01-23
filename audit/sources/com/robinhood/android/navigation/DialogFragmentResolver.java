package com.robinhood.android.navigation;

import androidx.fragment.app.DialogFragment;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;

/* compiled from: DialogFragmentResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/DialogFragmentResolver;", "KeyT", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Lcom/robinhood/android/navigation/NavigationResolver;", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)Landroidx/fragment/app/DialogFragment;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DialogFragmentResolver<KeyT extends DialogFragmentKey> extends NavigationResolver {
    DialogFragment createDialogFragment(KeyT key);
}
