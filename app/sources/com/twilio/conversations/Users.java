package com.twilio.conversations;

import com.twilio.util.TwilioLogger;
import java.util.List;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;

/* loaded from: classes12.dex */
final class Users implements Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(Users.class));
    private boolean isDisposed = false;
    private long nativeHandle;

    native User getMyUser();

    native List<User> getSubscribedUsers();

    native void nativeDispose();

    native void nativeGetAndSubscribeUser(String str, CallbackListener<User> callbackListener);

    protected Users(long j) {
        this.nativeHandle = j;
    }

    @Override // com.twilio.conversations.Disposable
    public void dispose() {
        synchronized (this) {
            try {
                checkDisposed("dispose");
                if (!this.isDisposed) {
                    nativeDispose();
                }
                this.nativeHandle = 0L;
                this.isDisposed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void checkDisposed(String str) {
        if (this.isDisposed) {
            logger.m3191e("Attempt to use disposed object in Users#" + str);
        }
    }
}
