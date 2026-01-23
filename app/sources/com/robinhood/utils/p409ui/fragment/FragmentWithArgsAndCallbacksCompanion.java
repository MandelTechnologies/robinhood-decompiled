package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.p409ui.fragment.FragmentCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0004*\u0004\b\u0002\u0010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006J5\u0010\u0007\u001a\u00028\u0000\"\f\b\u0003\u0010\b*\u00020\t*\u00028\u00022\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u0002H\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "F", "Landroidx/fragment/app/DialogFragment;", "A", "Landroid/os/Parcelable;", "C1", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "newInstance", "C", "Landroidx/fragment/app/Fragment;", "args", "callbacks", "requestCode", "", "(Landroid/os/Parcelable;Landroidx/fragment/app/Fragment;I)Landroidx/fragment/app/DialogFragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FragmentWithArgsAndCallbacksCompanion<F extends DialogFragment, A extends Parcelable, C1> extends FragmentCompanion<F, A> {
    <C extends Fragment & C1> F newInstance(A args, C callbacks, int requestCode);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends DialogFragment, A extends Parcelable, C1> A getArgs(FragmentWithArgsAndCallbacksCompanion<F, A, C1> fragmentWithArgsAndCallbacksCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.DefaultImpls.getArgs(fragmentWithArgsAndCallbacksCompanion, receiver);
        }

        public static /* synthetic */ DialogFragment newInstance$default(FragmentWithArgsAndCallbacksCompanion fragmentWithArgsAndCallbacksCompanion, Parcelable parcelable, Fragment fragment, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newInstance");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return fragmentWithArgsAndCallbacksCompanion.newInstance(parcelable, fragment, i);
        }

        public static <F extends DialogFragment, A extends Parcelable, C1, C extends Fragment & C1> F newInstance(FragmentWithArgsAndCallbacksCompanion<F, A, C1> fragmentWithArgsAndCallbacksCompanion, A a, C c, int i) {
            F f = (F) FragmentCompanionKt.createFragment(fragmentWithArgsAndCallbacksCompanion);
            f.setTargetFragment(c, i);
            FragmentCompanion.INSTANCE.setArgs$lib_utils_ui_externalDebug(f, a);
            return f;
        }
    }
}
