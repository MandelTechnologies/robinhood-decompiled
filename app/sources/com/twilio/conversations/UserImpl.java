package com.twilio.conversations;

import com.twilio.conversations.internal.StatusListenerForwarder;
import com.twilio.util.TwilioLogger;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import org.json.JSONException;

/* loaded from: classes12.dex */
final class UserImpl implements User, Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(UserImpl.class));
    private boolean isDisposed = false;
    private long nativeHandle;

    private native void nativeDispose();

    private native String nativeGetAttributes();

    private native void nativeSetFriendlyName(String str, StatusListener statusListener);

    private native void nativeUpdateAttributes(String str, StatusListener statusListener);

    @Override // com.twilio.conversations.User
    public native String getFriendlyName();

    @Override // com.twilio.conversations.User
    public native String getIdentity();

    @Override // com.twilio.conversations.User
    public native boolean isNotifiable();

    @Override // com.twilio.conversations.User
    public native boolean isOnline();

    @Override // com.twilio.conversations.User
    public native boolean isSubscribed();

    @Override // com.twilio.conversations.User
    public native void unsubscribe();

    protected UserImpl(long j) {
        this.nativeHandle = j;
    }

    @Override // com.twilio.conversations.User
    public void setFriendlyName(String str, StatusListener statusListener) {
        checkDisposed("setFriendlyName");
        nativeSetFriendlyName(str, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.User
    public Attributes getAttributes() {
        checkDisposed("getAttributes");
        try {
            return Attributes.parse(nativeGetAttributes());
        } catch (JSONException e) {
            logger.m3192e("Unable to parse user attributes", e);
            return Attributes.DEFAULT;
        }
    }

    @Override // com.twilio.conversations.User
    public void setAttributes(Attributes attributes, StatusListener statusListener) {
        checkDisposed("setAttributes");
        nativeUpdateAttributes(attributes.toString(), new StatusListenerForwarder(statusListener));
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
            logger.m3191e("Attempt to use disposed object in UserInfo#" + str);
        }
    }
}
