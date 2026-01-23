package com.robinhood.android.navigation;

import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogFragmentResolverWithArgsCompanion.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00030\u00062\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "F", "Landroidx/fragment/app/DialogFragment;", "KeyT", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "createDialogFragment", "key", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)Landroidx/fragment/app/DialogFragment;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DialogFragmentResolverWithArgsCompanion<F extends DialogFragment, KeyT extends DialogFragmentKey & Parcelable> extends DialogFragmentResolver<KeyT>, FragmentWithArgsCompanion<F, KeyT> {
    @Override // com.robinhood.android.navigation.DialogFragmentResolver
    F createDialogFragment(KeyT key);

    /* compiled from: DialogFragmentResolverWithArgsCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends DialogFragment, KeyT extends DialogFragmentKey & Parcelable> KeyT getArgs(DialogFragmentResolverWithArgsCompanion<F, KeyT> dialogFragmentResolverWithArgsCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (KeyT) ((DialogFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(dialogFragmentResolverWithArgsCompanion, receiver));
        }

        public static <F extends DialogFragment, KeyT extends DialogFragmentKey & Parcelable> F newInstance(DialogFragmentResolverWithArgsCompanion<F, KeyT> dialogFragmentResolverWithArgsCompanion, KeyT args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return (F) FragmentWithArgsCompanion.DefaultImpls.newInstance(dialogFragmentResolverWithArgsCompanion, args);
        }

        public static <F extends DialogFragment, KeyT extends DialogFragmentKey & Parcelable> void setArgs(DialogFragmentResolverWithArgsCompanion<F, KeyT> dialogFragmentResolverWithArgsCompanion, F receiver, KeyT value) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(value, "value");
            FragmentWithArgsCompanion.DefaultImpls.setArgs(dialogFragmentResolverWithArgsCompanion, receiver, value);
        }

        public static <F extends DialogFragment, KeyT extends DialogFragmentKey & Parcelable> F createDialogFragment(DialogFragmentResolverWithArgsCompanion<F, KeyT> dialogFragmentResolverWithArgsCompanion, KeyT key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return dialogFragmentResolverWithArgsCompanion.newInstance((DialogFragmentResolverWithArgsCompanion<F, KeyT>) key);
        }
    }
}
