package com.robinhood.android.securitycenter.p251ui;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SecurityCenterComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1", m3645f = "SecurityCenterComposable.kt", m3646l = {355, 357}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ModalBottomSheetState $bottomSheetState;
    final /* synthetic */ boolean $showCreatePasskeySuccessBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1(boolean z, ModalBottomSheetState modalBottomSheetState, Continuation<? super SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$showCreatePasskeySuccessBottomSheet = z;
        this.$bottomSheetState = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1(this.$showCreatePasskeySuccessBottomSheet, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.show(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r5.hide(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$showCreatePasskeySuccessBottomSheet) {
                ModalBottomSheetState modalBottomSheetState = this.$bottomSheetState;
                this.label = 1;
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.$bottomSheetState;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
