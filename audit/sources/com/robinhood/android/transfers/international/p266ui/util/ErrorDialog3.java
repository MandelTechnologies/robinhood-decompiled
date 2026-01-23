package com.robinhood.android.transfers.international.p266ui.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.ErrorDialogKt$ErrorDialogComposable$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ErrorDialog3 extends FunctionReferenceImpl implements Function0<Unit> {
    final /* synthetic */ ErrorDialog $errorDialog;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ Function0<Unit> $onFinishRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorDialog3(Function0<Unit> function0, ErrorDialog errorDialog, Function0<Unit> function02) {
        super(0, Intrinsics.Kotlin.class, "handleDismiss", "ErrorDialogComposable$handleDismiss(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;Lkotlin/jvm/functions/Function0;)V", 0);
        this.$onDismissRequest = function0;
        this.$errorDialog = errorDialog;
        this.$onFinishRequest = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ErrorDialog2.ErrorDialogComposable$handleDismiss(this.$onDismissRequest, this.$errorDialog, this.$onFinishRequest);
    }
}
