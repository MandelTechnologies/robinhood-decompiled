package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u0016\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u0002H\u00030\u0004J-\u0010\u0006\u001a\u00028\u0000\"\f\b\u0002\u0010\u0007*\u00020\b*\u00028\u00012\u0006\u0010\t\u001a\u0002H\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithCallbacksCompanion;", "F", "Landroidx/fragment/app/DialogFragment;", "C1", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "", "newInstance", "C", "Landroidx/fragment/app/Fragment;", "callbacks", "requestCode", "", "(Landroidx/fragment/app/Fragment;I)Landroidx/fragment/app/DialogFragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FragmentWithCallbacksCompanion<F extends DialogFragment, C1> extends FragmentWithArgsAndCallbacksCompanion {
    <C extends Fragment & C1> F newInstance(C callbacks, int requestCode);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends DialogFragment, C1> Void getArgs(FragmentWithCallbacksCompanion<F, C1> fragmentWithCallbacksCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (Void) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(fragmentWithCallbacksCompanion, receiver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <F extends DialogFragment, C1, C extends Fragment & C1> F newInstance(FragmentWithCallbacksCompanion<F, C1> fragmentWithCallbacksCompanion, Void r1, C c, int i) {
            return (F) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(fragmentWithCallbacksCompanion, (Parcelable) r1, c, i);
        }

        public static /* synthetic */ DialogFragment newInstance$default(FragmentWithCallbacksCompanion fragmentWithCallbacksCompanion, Fragment fragment, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newInstance");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return fragmentWithCallbacksCompanion.newInstance(fragment, i);
        }

        public static <F extends DialogFragment, C1, C extends Fragment & C1> F newInstance(FragmentWithCallbacksCompanion<F, C1> fragmentWithCallbacksCompanion, C c, int i) {
            return (F) fragmentWithCallbacksCompanion.newInstance(null, c, i);
        }
    }
}
