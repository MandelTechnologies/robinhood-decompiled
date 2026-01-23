package com.robinhood.utils.p409ui.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\f\b\u0001\u0010\u0003 \u0001*\u0004\u0018\u00010\u00042\u00020\u0005:\u0001\tR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "F", "Landroidx/fragment/app/Fragment;", "A", "Landroid/os/Parcelable;", "", "args", "getArgs", "(Landroidx/fragment/app/Fragment;)Landroid/os/Parcelable;", "Companion", "Lcom/robinhood/utils/ui/fragment/AbstractFragmentCompanion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithConstantArgsCompanion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface FragmentCompanion<F extends Fragment, A extends Parcelable> {
    public static final String ARGS_KEY = "rh_navigation_args";
    public static final String COMPOSE_HOST_KEY = "rh_fragment_is_hosted_in_compose";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    A getArgs(F f);

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static <F extends Fragment, A extends Parcelable> A getArgs(FragmentCompanion<? super F, ? extends A> fragmentCompanion, F receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) FragmentCompanion.INSTANCE.getArgs$lib_utils_ui_externalDebug(receiver);
        }
    }

    /* compiled from: FragmentCompanion.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0002H\b\"\n\b\u0002\u0010\b*\u0004\u0018\u00010\t*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e*\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/FragmentCompanion$Companion;", "", "<init>", "()V", "ARGS_KEY", "", "COMPOSE_HOST_KEY", "getArgs", "A", "Landroid/os/Parcelable;", "Landroidx/fragment/app/Fragment;", "getArgs$lib_utils_ui_externalDebug", "(Landroidx/fragment/app/Fragment;)Landroid/os/Parcelable;", "setArgs", "", "value", "setArgs$lib_utils_ui_externalDebug", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ARGS_KEY = "rh_navigation_args";
        public static final String COMPOSE_HOST_KEY = "rh_fragment_is_hosted_in_compose";

        private Companion() {
        }

        public final <A extends Parcelable> A getArgs$lib_utils_ui_externalDebug(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return (A) arguments.getParcelable("rh_navigation_args");
            }
            return null;
        }

        public final void setArgs$lib_utils_ui_externalDebug(Fragment fragment, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            if (fragment.getArguments() == null) {
                fragment.setArguments(new Bundle());
            }
            fragment.requireArguments().putParcelable("rh_navigation_args", parcelable);
        }
    }
}
