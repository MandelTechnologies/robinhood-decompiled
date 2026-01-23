package com.robinhood.shared.crypto.transfer.verification;

import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: VerificationParentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentComposable$1$1$2$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class VerificationParentComposable4 extends AdaptedFunctionReference implements Function0<Unit> {
    VerificationParentComposable4(Object obj) {
        super(0, obj, NavHostController.class, "popBackStack", "popBackStack()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NavHostController) this.receiver).popBackStack();
    }
}
