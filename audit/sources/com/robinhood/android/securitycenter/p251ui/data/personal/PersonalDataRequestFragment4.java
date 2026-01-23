package com.robinhood.android.securitycenter.p251ui.data.personal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: PersonalDataRequestFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class PersonalDataRequestFragment4 extends AdaptedFunctionReference implements Function0<Unit> {
    PersonalDataRequestFragment4(Object obj) {
        super(0, obj, PersonalDataRequestFragment.class, "submitRequest", "submitRequest(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PersonalDataRequestFragment.submitRequest$default((PersonalDataRequestFragment) this.receiver, null, 1, null);
    }
}
