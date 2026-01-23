package com.robinhood.android.supportchat.thread.compose;

import android.content.Intent;
import androidx.view.result.ActivityResult;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.supportchat.thread.CxChatDuxo;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CxChatComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1", m3645f = "CxChatComposable.kt", m3646l = {427}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CxChatDuxo $duxo;
    final /* synthetic */ ImagePicker $imagePicker;
    final /* synthetic */ ActivityResult $result;
    final /* synthetic */ CxChatViewState.Success $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1(ActivityResult activityResult, CxChatViewState.Success success, ImagePicker imagePicker, CxChatDuxo cxChatDuxo, Continuation<? super CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$result = activityResult;
        this.$state = success;
        this.$imagePicker = imagePicker;
        this.$duxo = cxChatDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1(this.$result, this.$state, this.$imagePicker, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Intent data = this.$result.getData();
                if (data == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ChatMode chatMode = this.$state.getChatMode();
                ImagePicker imagePicker = this.$imagePicker;
                this.label = 1;
                obj = CxChatComposableKt.extractImageData(data, chatMode, imagePicker, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$duxo.sendImageMessage(this.$state.getInquiryId(), this.$state.getChatMode(), (Either) obj, true);
        } catch (Throwable unused) {
            this.$duxo.openImageErrorDialog();
        }
        return Unit.INSTANCE;
    }
}
