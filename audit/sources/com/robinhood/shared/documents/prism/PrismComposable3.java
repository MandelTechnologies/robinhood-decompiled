package com.robinhood.shared.documents.prism;

import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismComposableKt$PrismComposable$1$1", m3645f = "PrismComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt$PrismComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PrismComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PermissionState $cameraPermissionState;
    final /* synthetic */ PrismDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrismComposable3(PermissionState permissionState, EventLogger eventLogger, PrismDuxo prismDuxo, Continuation<? super PrismComposable3> continuation) {
        super(2, continuation);
        this.$cameraPermissionState = permissionState;
        this.$eventLogger = eventLogger;
        this.$duxo = prismDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrismComposable3(this.$cameraPermissionState, this.$eventLogger, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrismComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!PermissionsUtil2.isGranted(this.$cameraPermissionState.getStatus())) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SELFIE_STATE_UPDATE, new Screen(Screen.Name.PRISM, null, null, null, 14, null), null, UserInteractionEventData.Action.SELFIE_CAMERA_NOT_AUTHORIZED, null, null, null, 116, null), false, false, 6, null);
            this.$cameraPermissionState.launchPermissionRequest();
        } else {
            this.$duxo.onCameraPermissionGranted();
        }
        return Unit.INSTANCE;
    }
}
