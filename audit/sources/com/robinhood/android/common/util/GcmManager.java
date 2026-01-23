package com.robinhood.android.common.util;

import android.content.Context;
import android.content.Intent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: GcmManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\fJ\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/util/GcmManager;", "", "getGcmToken", "", "isRegistered", "", "refreshGcmToken", "", "context", "Landroid/content/Context;", "token", "registerDevice", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promptMode", "Lcom/robinhood/android/common/util/RegisterDevicePromptMode;", "(Landroid/content/Context;Lcom/robinhood/android/common/util/RegisterDevicePromptMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface GcmManager {
    String getGcmToken();

    boolean isRegistered();

    void onActivityResult(Context context, int requestCode, int resultCode, Intent data);

    void refreshGcmToken(Context context, String token);

    Object registerDevice(Context context, GcmManager2 gcmManager2, Continuation<? super Boolean> continuation);

    Object registerDevice(Context context, Continuation<? super Boolean> continuation);

    Object unregisterDevice(Continuation<? super Unit> continuation);
}
