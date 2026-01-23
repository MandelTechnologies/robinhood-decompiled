package com.robinhood.android.supportchat.thread.compose;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResult;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.robinhood.android.mediaservice.CameraUtils;
import com.robinhood.android.supportchat.thread.CxChatDuxo;
import com.robinhood.store.supportchat.ChatImageUtils;
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
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$8$1", m3645f = "CxChatComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CxChatComposableKt$CxChatSuccess$8$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Uri> $cameraFileUri$delegate;
    final /* synthetic */ ActivityResultRegistry8<Intent, ActivityResult> $cameraLauncher;
    final /* synthetic */ PermissionState $cameraPermissionState;
    final /* synthetic */ CameraUtils $cameraUtils;
    final /* synthetic */ Context $context;
    final /* synthetic */ CxChatDuxo $duxo;
    final /* synthetic */ ActivityResultRegistry8<String, Boolean> $requestPermissionLauncher;
    final /* synthetic */ SnapshotState<Boolean> $triggerCameraFlow$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CxChatComposableKt$CxChatSuccess$8$1(PermissionState permissionState, CameraUtils cameraUtils, Context context, ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8, CxChatDuxo cxChatDuxo, ActivityResultRegistry8<String, Boolean> activityResultRegistry82, SnapshotState<Boolean> snapshotState, SnapshotState<Uri> snapshotState2, Continuation<? super CxChatComposableKt$CxChatSuccess$8$1> continuation) {
        super(2, continuation);
        this.$cameraPermissionState = permissionState;
        this.$cameraUtils = cameraUtils;
        this.$context = context;
        this.$cameraLauncher = activityResultRegistry8;
        this.$duxo = cxChatDuxo;
        this.$requestPermissionLauncher = activityResultRegistry82;
        this.$triggerCameraFlow$delegate = snapshotState;
        this.$cameraFileUri$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CxChatComposableKt$CxChatSuccess$8$1(this.$cameraPermissionState, this.$cameraUtils, this.$context, this.$cameraLauncher, this.$duxo, this.$requestPermissionLauncher, this.$triggerCameraFlow$delegate, this.$cameraFileUri$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CxChatComposableKt$CxChatSuccess$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!CxChatComposableKt.CxChatSuccess$lambda$27(this.$triggerCameraFlow$delegate)) {
                return Unit.INSTANCE;
            }
            if (PermissionsUtil2.isGranted(this.$cameraPermissionState.getStatus())) {
                this.$cameraFileUri$delegate.setValue(this.$cameraUtils.createCameraImageUri(this.$context, ChatImageUtils.SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME));
                Uri uriCxChatSuccess$lambda$20 = CxChatComposableKt.CxChatSuccess$lambda$20(this.$cameraFileUri$delegate);
                if (uriCxChatSuccess$lambda$20 != null) {
                    this.$cameraLauncher.launch(this.$cameraUtils.getCameraIntent(uriCxChatSuccess$lambda$20));
                } else {
                    this.$duxo.openImageErrorDialog();
                }
            } else if (PermissionsUtil2.getShouldShowRationale(this.$cameraPermissionState.getStatus())) {
                this.$duxo.openCameraPermissionDialog();
            } else {
                this.$requestPermissionLauncher.launch("android.permission.CAMERA");
            }
            CxChatComposableKt.CxChatSuccess$lambda$28(this.$triggerCameraFlow$delegate, false);
            this.$duxo.dismissBottomSheet();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
