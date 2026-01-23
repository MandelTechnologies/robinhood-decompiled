package com.robinhood.android.equityscreener.crud.unsavedChanges;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UnsavedScreenerChangesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.crud.unsavedChanges.UnsavedScreenerChangesFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class UnsavedScreenerChangesFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UnsavedScreenerChangesFragment2(Object obj) {
        super(0, obj, UnsavedScreenerChangesFragment.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UnsavedScreenerChangesFragment) this.receiver).dismiss();
    }
}
