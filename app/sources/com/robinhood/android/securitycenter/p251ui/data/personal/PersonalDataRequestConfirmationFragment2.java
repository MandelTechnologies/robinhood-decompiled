package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataRequestConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataRequestConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataRequestConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPersonalDataRequestConfirmationBinding> {
    public static final PersonalDataRequestConfirmationFragment2 INSTANCE = new PersonalDataRequestConfirmationFragment2();

    PersonalDataRequestConfirmationFragment2() {
        super(1, FragmentPersonalDataRequestConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPersonalDataRequestConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPersonalDataRequestConfirmationBinding.bind(p0);
    }
}
