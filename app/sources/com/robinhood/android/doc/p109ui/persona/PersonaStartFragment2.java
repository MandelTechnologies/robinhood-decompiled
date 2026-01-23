package com.robinhood.android.doc.p109ui.persona;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentPersonaStartBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaStartFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.persona.PersonaStartFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class PersonaStartFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPersonaStartBinding> {
    public static final PersonaStartFragment2 INSTANCE = new PersonaStartFragment2();

    PersonaStartFragment2() {
        super(1, FragmentPersonaStartBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentPersonaStartBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPersonaStartBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPersonaStartBinding.bind(p0);
    }
}
