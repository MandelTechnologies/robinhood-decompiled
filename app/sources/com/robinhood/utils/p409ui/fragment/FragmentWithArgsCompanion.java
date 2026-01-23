package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006J\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eR(\u0010\b\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "F", "Landroidx/fragment/app/Fragment;", "A", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;", "value", "args", "getArgs", "(Landroidx/fragment/app/Fragment;)Landroid/os/Parcelable;", "setArgs", "(Landroidx/fragment/app/Fragment;Landroid/os/Parcelable;)V", "newInstance", "(Landroid/os/Parcelable;)Landroidx/fragment/app/Fragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface FragmentWithArgsCompanion<F extends Fragment, A extends Parcelable> extends FragmentCompanion<F, A>, FragmentWithArgsCreator<F, A> {
    @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
    A getArgs(F f);

    F newInstance(A args);

    void setArgs(F f, A a);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment, A extends Parcelable> A getArgs(FragmentWithArgsCompanion<F, A> fragmentWithArgsCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.INSTANCE.getArgs$lib_utils_ui_externalDebug(receiver);
        }

        public static <F extends Fragment, A extends Parcelable> void setArgs(FragmentWithArgsCompanion<F, A> fragmentWithArgsCompanion, F receiver, A a) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            FragmentCompanion.INSTANCE.setArgs$lib_utils_ui_externalDebug(receiver, a);
        }

        public static <F extends Fragment, A extends Parcelable> F newInstance(FragmentWithArgsCompanion<F, A> fragmentWithArgsCompanion, A a) {
            F f = (F) FragmentCompanionKt.createFragment(fragmentWithArgsCompanion);
            FragmentCompanion.INSTANCE.setArgs$lib_utils_ui_externalDebug(f, a);
            return f;
        }
    }
}
