package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataPendingRequestBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataPendingRequestFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataPendingRequestFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataPendingRequestFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPersonalDataPendingRequestBinding> {
    public static final PersonalDataPendingRequestFragment2 INSTANCE = new PersonalDataPendingRequestFragment2();

    PersonalDataPendingRequestFragment2() {
        super(1, FragmentPersonalDataPendingRequestBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataPendingRequestBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPersonalDataPendingRequestBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPersonalDataPendingRequestBinding.bind(p0);
    }
}
