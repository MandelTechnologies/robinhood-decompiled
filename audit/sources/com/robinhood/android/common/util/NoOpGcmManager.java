package com.robinhood.android.common.util;

import android.content.Context;
import android.content.Intent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoOpGcmManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/util/NoopGcmManager;", "Lcom/robinhood/android/common/util/GcmManager;", "<init>", "()V", "getGcmToken", "", "isRegistered", "", "refreshGcmToken", "", "context", "Landroid/content/Context;", "token", "registerDevice", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promptMode", "Lcom/robinhood/android/common/util/RegisterDevicePromptMode;", "(Landroid/content/Context;Lcom/robinhood/android/common/util/RegisterDevicePromptMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.NoopGcmManager, reason: use source file name */
/* loaded from: classes2.dex */
public final class NoOpGcmManager implements GcmManager {
    public static final int $stable = 0;
    public static final NoOpGcmManager INSTANCE = new NoOpGcmManager();

    @Override // com.robinhood.android.common.util.GcmManager
    public String getGcmToken() {
        return null;
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public boolean isRegistered() {
        return false;
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public void onActivityResult(Context context, int requestCode, int resultCode, Intent data) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public void refreshGcmToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
    }

    private NoOpGcmManager() {
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public Object registerDevice(Context context, Continuation<? super Boolean> continuation) {
        return boxing.boxBoolean(false);
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public Object registerDevice(Context context, GcmManager2 gcmManager2, Continuation<? super Boolean> continuation) {
        return boxing.boxBoolean(false);
    }

    @Override // com.robinhood.android.common.util.GcmManager
    public Object unregisterDevice(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
