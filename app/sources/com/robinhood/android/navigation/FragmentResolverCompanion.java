package com.robinhood.android.navigation;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentResolverCompanion.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0012\u0004\u0012\u0002H\u00010\u0007J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "F", "Landroidx/fragment/app/Fragment;", "KeyT", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "createFragment", "key", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)Landroidx/fragment/app/Fragment;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FragmentResolverCompanion<F extends Fragment, KeyT extends FragmentKey & Parcelable> extends FragmentResolver<KeyT>, FragmentWithoutArgsCompanion<F> {
    @Override // com.robinhood.android.navigation.FragmentResolver
    Fragment createFragment(KeyT key);

    /* compiled from: FragmentResolverCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment, KeyT extends FragmentKey & Parcelable> Void getArgs(FragmentResolverCompanion<F, KeyT> fragmentResolverCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(fragmentResolverCompanion, receiver);
        }

        public static <F extends Fragment, KeyT extends FragmentKey & Parcelable> F newInstance(FragmentResolverCompanion<F, KeyT> fragmentResolverCompanion) {
            return (F) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(fragmentResolverCompanion);
        }

        public static <F extends Fragment, KeyT extends FragmentKey & Parcelable> F newInstance(FragmentResolverCompanion<F, KeyT> fragmentResolverCompanion, Void r1) {
            return (F) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(fragmentResolverCompanion, r1);
        }

        public static <F extends Fragment, KeyT extends FragmentKey & Parcelable> Fragment createFragment(FragmentResolverCompanion<F, KeyT> fragmentResolverCompanion, KeyT key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return fragmentResolverCompanion.newInstance();
        }
    }
}
