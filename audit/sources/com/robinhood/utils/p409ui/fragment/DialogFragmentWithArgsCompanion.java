package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import com.robinhood.utils.p409ui.fragment.FragmentCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u001f\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "F", "Landroidx/fragment/app/DialogFragment;", "A", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "newInstance", "args", "requestCode", "", "(Landroid/os/Parcelable;I)Landroidx/fragment/app/DialogFragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface DialogFragmentWithArgsCompanion<F extends DialogFragment, A extends Parcelable> extends FragmentCompanion<F, A> {
    F newInstance(A args, int requestCode);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends DialogFragment, A extends Parcelable> A getArgs(DialogFragmentWithArgsCompanion<F, A> dialogFragmentWithArgsCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.DefaultImpls.getArgs(dialogFragmentWithArgsCompanion, receiver);
        }

        public static <F extends DialogFragment, A extends Parcelable> F newInstance(DialogFragmentWithArgsCompanion<F, A> dialogFragmentWithArgsCompanion, A a, int i) {
            F f = (F) FragmentCompanionKt.createFragment(dialogFragmentWithArgsCompanion);
            FragmentCompanion.INSTANCE.setArgs$lib_utils_ui_externalDebug(f, a);
            return f;
        }

        public static /* synthetic */ DialogFragment newInstance$default(DialogFragmentWithArgsCompanion dialogFragmentWithArgsCompanion, Parcelable parcelable, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newInstance");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return dialogFragmentWithArgsCompanion.newInstance(parcelable, i);
        }
    }
}
