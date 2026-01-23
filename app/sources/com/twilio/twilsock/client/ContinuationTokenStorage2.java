package com.twilio.twilsock.client;

import com.twilio.util.Preferences4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ContinuationTokenStorage.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/twilio/twilsock/client/ContinuationTokenStorageImpl;", "Lcom/twilio/twilsock/client/ContinuationTokenStorage;", "()V", "<set-?>", "", "continuationToken", "getContinuationToken", "()Ljava/lang/String;", "setContinuationToken", "(Ljava/lang/String;)V", "continuationToken$delegate", "Lkotlin/properties/ReadWriteProperty;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.client.ContinuationTokenStorageImpl, reason: use source file name */
/* loaded from: classes12.dex */
public final class ContinuationTokenStorage2 implements ContinuationTokenStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ContinuationTokenStorage2.class, "continuationToken", "getContinuationToken()Ljava/lang/String;", 0))};

    /* renamed from: continuationToken$delegate, reason: from kotlin metadata */
    private final Interfaces3 continuationToken = Preferences4.stringPreference();

    @Override // com.twilio.twilsock.client.ContinuationTokenStorage
    public String getContinuationToken() {
        return (String) this.continuationToken.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.twilio.twilsock.client.ContinuationTokenStorage
    public void setContinuationToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.continuationToken.setValue(this, $$delegatedProperties[0], str);
    }
}
