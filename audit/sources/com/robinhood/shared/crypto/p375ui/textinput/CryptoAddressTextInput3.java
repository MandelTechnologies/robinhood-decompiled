package com.robinhood.shared.crypto.p375ui.textinput;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoAddressTextInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInput$4$1", m3645f = "CryptoAddressTextInput.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInput$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddressTextInput3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ boolean $requestFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAddressTextInput3(boolean z, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Continuation<? super CryptoAddressTextInput3> continuation) {
        super(2, continuation);
        this.$requestFocus = z;
        this.$focusRequester = focusRequester;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoAddressTextInput3(this.$requestFocus, this.$focusRequester, this.$keyboardController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoAddressTextInput3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$requestFocus) {
            FocusRequester.m6497requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
            SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
        }
        return Unit.INSTANCE;
    }
}
