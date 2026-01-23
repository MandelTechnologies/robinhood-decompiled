package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataDownloadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataDownloadFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataDownloadFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPersonalDataDownloadBinding> {
    public static final PersonalDataDownloadFragment2 INSTANCE = new PersonalDataDownloadFragment2();

    PersonalDataDownloadFragment2() {
        super(1, FragmentPersonalDataDownloadBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataDownloadBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPersonalDataDownloadBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPersonalDataDownloadBinding.bind(p0);
    }
}
