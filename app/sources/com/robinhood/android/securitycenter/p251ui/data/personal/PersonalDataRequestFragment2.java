package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataRequestBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataRequestFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataRequestFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPersonalDataRequestBinding> {
    public static final PersonalDataRequestFragment2 INSTANCE = new PersonalDataRequestFragment2();

    PersonalDataRequestFragment2() {
        super(1, FragmentPersonalDataRequestBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPersonalDataRequestBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPersonalDataRequestBinding.bind(p0);
    }
}
