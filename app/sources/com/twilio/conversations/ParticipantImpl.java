package com.twilio.conversations;

import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.internal.DateUtils;
import com.twilio.conversations.internal.StatusListenerForwarder;
import com.twilio.util.TwilioLogger;
import java.util.Date;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import org.json.JSONException;

/* loaded from: classes12.dex */
final class ParticipantImpl implements Participant, Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(ParticipantImpl.class));
    private boolean isDisposed = false;
    private long nativeHandle;

    private native void nativeDispose();

    private native void nativeGetAndSubscribeUser(CallbackListener<User> callbackListener);

    private native String nativeGetAttributes();

    private native Conversation nativeGetChannel();

    private native Long nativeGetLastConsumedMessageIndex();

    private native String nativeGetLastConsumptionTimestamp();

    private native void nativeRemove(StatusListener statusListener);

    private native void nativeUpdateAttributes(String str, StatusListener statusListener);

    @Override // com.twilio.conversations.Participant
    public native String getChannel();

    @Override // com.twilio.conversations.Participant
    public native String getDateCreated();

    @Override // com.twilio.conversations.Participant
    public native String getDateUpdated();

    @Override // com.twilio.conversations.Participant
    public native String getIdentity();

    @Override // com.twilio.conversations.Participant
    public native String getSid();

    protected ParticipantImpl(long j) {
        this.nativeHandle = j;
    }

    @Override // com.twilio.conversations.Participant
    public Long getLastReadMessageIndex() {
        checkDisposed("getLastReadMessageIndex");
        return nativeGetLastConsumedMessageIndex();
    }

    @Override // com.twilio.conversations.Participant
    public String getLastReadTimestamp() {
        checkDisposed("getLastReadTimestamp");
        return nativeGetLastConsumptionTimestamp();
    }

    @Override // com.twilio.conversations.Participant
    public Date getDateCreatedAsDate() {
        checkDisposed("getDateCreatedAsDate");
        return DateUtils.parseIso8601DateTime(getDateCreated());
    }

    @Override // com.twilio.conversations.Participant
    public Date getDateUpdatedAsDate() {
        checkDisposed("getDateUpdatedAsDate");
        return DateUtils.parseIso8601DateTime(getDateUpdated());
    }

    @Override // com.twilio.conversations.Participant
    public Conversation getConversation() {
        checkDisposed("getConversation");
        return nativeGetChannel();
    }

    @Override // com.twilio.conversations.Participant
    public Attributes getAttributes() {
        checkDisposed("getAttributes");
        try {
            return Attributes.parse(nativeGetAttributes());
        } catch (JSONException e) {
            logger.m3192e("Unable to parse participant attributes", e);
            return Attributes.DEFAULT;
        }
    }

    @Override // com.twilio.conversations.Participant
    public void setAttributes(Attributes attributes, StatusListener statusListener) {
        checkDisposed("setAttributes");
        nativeUpdateAttributes(attributes.toString(), new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Participant
    public void getAndSubscribeUser(CallbackListener<User> callbackListener) {
        checkDisposed("getAndSubscribeUser");
        nativeGetAndSubscribeUser(new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Participant
    public void remove(StatusListener statusListener) {
        checkDisposed("remove");
        nativeRemove(new StatusListenerForwarder(statusListener));
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
            logger.m3191e("Attempt to use disposed object in Participant#" + str);
        }
    }
}
