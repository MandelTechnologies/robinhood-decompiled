package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.view.OnBackPressedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConditionalBackIcon.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.ConditionalBackIconKt$ConditionalBackIcon$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ConditionalBackIcon2 extends FunctionReferenceImpl implements Function0<Unit> {
    final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConditionalBackIcon2(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0, Intrinsics.Kotlin.class, "onBackClick", "ConditionalBackIcon$onBackClick(Landroidx/activity/OnBackPressedDispatcher;)V", 0);
        this.$onBackPressedDispatcher = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConditionalBackIcon.ConditionalBackIcon$onBackClick(this.$onBackPressedDispatcher);
    }
}
