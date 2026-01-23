package com.robinhood.android.supportchat.thread.compose;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import androidx.view.result.ActivityResult;
import com.robinhood.android.mediaservice.CameraUtils;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.supportchat.thread.CxChatDuxo;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.store.supportchat.ChatImageUtils;
import com.robinhood.utils.Either;
import io.reactivex.Completable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CxChatComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$cameraImageCropperLauncher$1$1$1", m3645f = "CxChatComposable.kt", m3646l = {478, 1053, 1053, 1053}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$cameraImageCropperLauncher$1$1$1 */
/* loaded from: classes9.dex */
final class C29188x38dd84d extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Uri> $cameraFileUri$delegate;
    final /* synthetic */ CameraUtils $cameraUtils;
    final /* synthetic */ Context $context;
    final /* synthetic */ CxChatDuxo $duxo;
    final /* synthetic */ ImagePicker $imagePicker;
    final /* synthetic */ ActivityResult $result;
    final /* synthetic */ CxChatViewState.Success $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C29188x38dd84d(ActivityResult activityResult, CxChatViewState.Success success, ImagePicker imagePicker, CxChatDuxo cxChatDuxo, CameraUtils cameraUtils, Context context, SnapshotState<Uri> snapshotState, Continuation<? super C29188x38dd84d> continuation) {
        super(2, continuation);
        this.$result = activityResult;
        this.$state = success;
        this.$imagePicker = imagePicker;
        this.$duxo = cxChatDuxo;
        this.$cameraUtils = cameraUtils;
        this.$context = context;
        this.$cameraFileUri$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C29188x38dd84d(this.$result, this.$state, this.$imagePicker, this.$duxo, this.$cameraUtils, this.$context, this.$cameraFileUri$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C29188x38dd84d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.await(r11, r10) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.await(r11, r10) != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Throwable th2) {
                Completable completableClearCameraImageDirectory = this.$cameraUtils.clearCameraImageDirectory(this.$context, ChatImageUtils.SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME);
                this.L$0 = th2;
                this.label = 4;
                if (RxAwait3.await(completableClearCameraImageDirectory, this) != coroutine_suspended) {
                    th = th2;
                }
            }
        } catch (Throwable unused) {
            this.$duxo.openImageErrorDialog();
            Completable completableClearCameraImageDirectory2 = this.$cameraUtils.clearCameraImageDirectory(this.$context, ChatImageUtils.SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME);
            this.label = 3;
        }
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
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                ResultKt.throwOnFailure(obj);
                this.$cameraFileUri$delegate.setValue(null);
                return Unit.INSTANCE;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$cameraFileUri$delegate.setValue(null);
            throw th;
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.sendImageMessage(this.$state.getInquiryId(), this.$state.getChatMode(), (Either) obj, false);
        Completable completableClearCameraImageDirectory3 = this.$cameraUtils.clearCameraImageDirectory(this.$context, ChatImageUtils.SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME);
        this.label = 2;
    }
}
