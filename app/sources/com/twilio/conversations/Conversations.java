package com.twilio.conversations;

import com.twilio.util.TwilioLogger;
import java.util.List;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;

/* loaded from: classes12.dex */
final class Conversations implements Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(Conversations.class));
    private boolean isDisposed = false;
    private long nativeHandle;

    native void nativeCreateConversation(String str, String str2, String str3, CallbackListener<Conversation> callbackListener);

    native void nativeDispose();

    native void nativeGetConversation(String str, CallbackListener<Conversation> callbackListener);

    native List<Participant> nativeGetMembersByIdentity(String str);

    native List<Conversation> nativeGetMyConversations();

    protected Conversations(long j) {
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
            logger.m3191e("Attempt to use disposed object in Conversations#" + str);
        }
    }
}
