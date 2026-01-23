package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.ItemPersonalDataRequestDetailsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataRequestDetailsItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDetailsItemView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataRequestDetailsItemView2 extends FunctionReferenceImpl implements Function1<View, ItemPersonalDataRequestDetailsBinding> {
    public static final PersonalDataRequestDetailsItemView2 INSTANCE = new PersonalDataRequestDetailsItemView2();

    PersonalDataRequestDetailsItemView2() {
        super(1, ItemPersonalDataRequestDetailsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/ItemPersonalDataRequestDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ItemPersonalDataRequestDetailsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ItemPersonalDataRequestDetailsBinding.bind(p0);
    }
}
