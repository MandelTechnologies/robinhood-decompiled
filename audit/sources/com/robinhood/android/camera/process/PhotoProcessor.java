package com.robinhood.android.camera.process;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PhotoProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/camera/process/PhotoProcessor;", "", "processPhoto", "Lcom/robinhood/android/camera/process/ProcessPhotoResult;", WebsocketGatewayConstants.DATA_KEY, "", "processOptions", "Lcom/robinhood/android/camera/process/ProcessPhotoOptions;", "([BLcom/robinhood/android/camera/process/ProcessPhotoOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PhotoProcessor {
    Object processPhoto(byte[] bArr, ProcessPhotoOptions processPhotoOptions, Continuation<? super ProcessPhotoResult> continuation);
}
