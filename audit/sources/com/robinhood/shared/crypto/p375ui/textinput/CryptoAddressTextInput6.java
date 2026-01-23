package com.robinhood.shared.crypto.p375ui.textinput;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoAddressTextInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$3$1", m3645f = "CryptoAddressTextInput.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddressTextInput6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ SnapshotState<TextFieldValue> $internalTextField$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAddressTextInput6(String str, SnapshotState<TextFieldValue> snapshotState, Continuation<? super CryptoAddressTextInput6> continuation) {
        super(2, continuation);
        this.$address = str;
        this.$internalTextField$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoAddressTextInput6(this.$address, this.$internalTextField$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoAddressTextInput6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$24(this.$internalTextField$delegate).getText(), this.$address)) {
                SnapshotState<TextFieldValue> snapshotState = this.$internalTextField$delegate;
                String str = this.$address;
                snapshotState.setValue(new TextFieldValue(str, TextRange2.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
