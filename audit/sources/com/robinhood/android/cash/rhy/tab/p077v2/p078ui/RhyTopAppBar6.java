package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RhyTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyTopAppBarKt$RhyTopAppBar$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyTopAppBar6 extends FunctionReferenceImpl implements Function0<Unit> {
    RhyTopAppBar6(Object obj) {
        super(0, obj, RhyTopAppBar4.class, "onSearchClicked", "onSearchClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RhyTopAppBar4) this.receiver).onSearchClicked();
    }
}
