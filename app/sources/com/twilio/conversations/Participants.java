package com.twilio.conversations;

import com.twilio.util.TwilioLogger;
import java.util.List;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;

/* loaded from: classes12.dex */
final class Participants implements Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(Participants.class));
    private boolean isDisposed = false;
    private long nativeHandle;

    native void nativeAddByAddress(String str, String str2, String str3, StatusListener statusListener);

    native void nativeAddByIdentity(String str, String str2, StatusListener statusListener);

    native void nativeDispose();

    native Participant nativeGetMember(String str);

    native Participant nativeGetMemberBySid(String str);

    native List<Participant> nativeGetMembersList();

    native void nativeRemove(Participant participant, StatusListener statusListener);

    native void nativeRemoveByIdentity(String str, StatusListener statusListener);

    protected Participants(long j) {
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
            logger.m3191e("Attempt to use disposed object in Participants#" + str);
        }
    }
}
