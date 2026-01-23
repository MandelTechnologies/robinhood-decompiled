package com.robinhood.android.equitytradeladder.quickconversion;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$QuickConversionEventHandler$2$2$1$1", m3645f = "QuickConversionEventHandler.kt", m3646l = {60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$QuickConversionEventHandler$2$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class QuickConversionEventHandler3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StringResource $message;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickConversionEventHandler3(SnackbarHostState snackbarHostState, StringResource stringResource, Continuation<? super QuickConversionEventHandler3> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$message = stringResource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickConversionEventHandler3(this.$snackbarHostState, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickConversionEventHandler3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnackbarData currentSnackbarData = this.$snackbarHostState.getCurrentSnackbarData();
            if (currentSnackbarData != null) {
                currentSnackbarData.dismiss();
            }
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            LadderSnackbarVisuals ladderSnackbarVisuals = new LadderSnackbarVisuals(null, this.$message, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            this.label = 1;
            if (snackbarHostState.showSnackbar(ladderSnackbarVisuals, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
