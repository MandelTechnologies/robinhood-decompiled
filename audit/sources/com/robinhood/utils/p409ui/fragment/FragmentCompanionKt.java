package com.robinhood.utils.p409ui.fragment;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\t\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0002\u0010\n\"8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00048BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m3636d2 = {"fragmentClass", "Ljava/lang/Class;", "F", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/utils/ui/fragment/FragmentCompanion;", "getFragmentClass$annotations", "(Lcom/robinhood/utils/ui/fragment/FragmentCompanion;)V", "getFragmentClass", "(Lcom/robinhood/utils/ui/fragment/FragmentCompanion;)Ljava/lang/Class;", "createFragment", "(Lcom/robinhood/utils/ui/fragment/FragmentCompanion;)Landroidx/fragment/app/Fragment;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FragmentCompanionKt {
    private static /* synthetic */ void getFragmentClass$annotations(FragmentCompanion fragmentCompanion) {
    }

    private static final <F extends Fragment> Class<F> getFragmentClass(FragmentCompanion<? super F, ?> fragmentCompanion) {
        Class<F> cls = (Class<F>) fragmentCompanion.getClass().getDeclaringClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<F of com.robinhood.utils.ui.fragment.FragmentCompanionKt.<get-fragmentClass>>");
        return cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <F extends Fragment> F createFragment(FragmentCompanion<? super F, ?> fragmentCompanion) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = getFragmentClass(fragmentCompanion).getDeclaredConstructor(null).newInstance(null);
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "newInstance(...)");
        return (F) objNewInstance;
    }
}
