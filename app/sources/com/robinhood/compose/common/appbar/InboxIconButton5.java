package com.robinhood.compose.common.appbar;

import androidx.constraintlayout.compose.ConstrainScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxIconButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$1$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class InboxIconButton5 implements Function1<ConstrainScope, Unit> {
    public static final InboxIconButton5 INSTANCE = new InboxIconButton5();

    InboxIconButton5() {
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }
}
