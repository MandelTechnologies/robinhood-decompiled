package com.robinhood.utils.p409ui.fragment;

import androidx.fragment.app.Fragment;
import com.robinhood.utils.p409ui.fragment.FragmentCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0005J\r\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "F", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;", "newInstance", "()Landroidx/fragment/app/Fragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FragmentWithoutArgsCompanion<F extends Fragment> extends FragmentCompanion, FragmentWithoutArgsCreator<F> {
    F newInstance();

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment> Void getArgs(FragmentWithoutArgsCompanion<F> fragmentWithoutArgsCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (Void) FragmentCompanion.DefaultImpls.getArgs(fragmentWithoutArgsCompanion, receiver);
        }

        public static <F extends Fragment> F newInstance(FragmentWithoutArgsCompanion<F> fragmentWithoutArgsCompanion, Void r1) {
            return (F) FragmentWithoutArgsCreator.DefaultImpls.newInstance(fragmentWithoutArgsCompanion, r1);
        }

        public static <F extends Fragment> F newInstance(FragmentWithoutArgsCompanion<F> fragmentWithoutArgsCompanion) {
            return (F) FragmentCompanionKt.createFragment(fragmentWithoutArgsCompanion);
        }
    }
}
