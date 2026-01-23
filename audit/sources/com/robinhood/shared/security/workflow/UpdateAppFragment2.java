package com.robinhood.shared.security.workflow;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UpdateAppFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.workflow.UpdateAppFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class UpdateAppFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UpdateAppFragment2(Object obj) {
        super(0, obj, UpdateAppFragment.class, "onPrimaryCtaClicked", "onPrimaryCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Resources.NotFoundException {
        ((UpdateAppFragment) this.receiver).onPrimaryCtaClicked();
    }
}
