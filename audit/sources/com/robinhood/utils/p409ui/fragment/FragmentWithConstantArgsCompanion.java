package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.p409ui.fragment.FragmentCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0007\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithConstantArgsCompanion;", "F", "Landroidx/fragment/app/Fragment;", "A", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;", "constantArgs", "getConstantArgs", "()Landroid/os/Parcelable;", "newInstance", "()Landroidx/fragment/app/Fragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FragmentWithConstantArgsCompanion<F extends Fragment, A extends Parcelable> extends FragmentCompanion<F, A>, FragmentWithoutArgsCreator<F> {
    A getConstantArgs();

    F newInstance();

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment, A extends Parcelable> A getArgs(FragmentWithConstantArgsCompanion<F, A> fragmentWithConstantArgsCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.DefaultImpls.getArgs(fragmentWithConstantArgsCompanion, receiver);
        }

        public static <F extends Fragment, A extends Parcelable> F newInstance(FragmentWithConstantArgsCompanion<F, A> fragmentWithConstantArgsCompanion, Void r1) {
            return (F) FragmentWithoutArgsCreator.DefaultImpls.newInstance(fragmentWithConstantArgsCompanion, r1);
        }

        public static <F extends Fragment, A extends Parcelable> F newInstance(FragmentWithConstantArgsCompanion<F, A> fragmentWithConstantArgsCompanion) {
            F f = (F) FragmentCompanionKt.createFragment(fragmentWithConstantArgsCompanion);
            FragmentCompanion.INSTANCE.setArgs$lib_utils_ui_externalDebug(f, fragmentWithConstantArgsCompanion.getConstantArgs());
            return f;
        }
    }
}
