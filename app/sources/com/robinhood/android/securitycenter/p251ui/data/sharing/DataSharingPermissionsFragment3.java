package com.robinhood.android.securitycenter.p251ui.data.sharing;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DataSharingPermissionsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class DataSharingPermissionsFragment3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    DataSharingPermissionsFragment3(Object obj) {
        super(1, obj, DataSharingPermissionsDuxo.class, "onToggledCheckChanged", "onToggledCheckChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((DataSharingPermissionsDuxo) this.receiver).onToggledCheckChanged(z);
    }
}
