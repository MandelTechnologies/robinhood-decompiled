package com.robinhood.utils.p409ui.fragment;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.p409ui.fragment.FragmentCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/AbstractFragmentCompanion;", "F", "Landroidx/fragment/app/Fragment;", "A", "Landroid/os/Parcelable;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AbstractFragmentCompanion<F extends Fragment, A extends Parcelable> extends FragmentCompanion<F, A> {

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <F extends Fragment, A extends Parcelable> A getArgs(AbstractFragmentCompanion<? super F, A> abstractFragmentCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.DefaultImpls.getArgs(abstractFragmentCompanion, receiver);
        }
    }
}
