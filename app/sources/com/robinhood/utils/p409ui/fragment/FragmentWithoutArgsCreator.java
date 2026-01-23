package com.robinhood.utils.p409ui.fragment;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\r\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCreator;", "F", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCreator;", "", "newInstance", "()Landroidx/fragment/app/Fragment;", "args", "(Ljava/lang/Void;)Landroidx/fragment/app/Fragment;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FragmentWithoutArgsCreator<F extends Fragment> extends FragmentWithArgsCreator {
    F newInstance();

    F newInstance(Void args);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment> F newInstance(FragmentWithoutArgsCreator<? extends F> fragmentWithoutArgsCreator, Void r1) {
            return (F) fragmentWithoutArgsCreator.newInstance();
        }
    }
}
