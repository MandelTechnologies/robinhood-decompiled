package com.twilio.util;

import com.robinhood.utils.http.ContentEncoding;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AccountDescriptor.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/twilio/util/AccountDescriptor;", "", "seen1", "", "accountSid", "", "instanceSids", "", ContentEncoding.IDENTITY, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getAccountSid$annotations", "()V", "getAccountSid", "()Ljava/lang/String;", "getIdentity$annotations", "getIdentity", "getInstanceSids$annotations", "getInstanceSids", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$shared_public_release", "$serializer", "Companion", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class AccountDescriptor {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountSid;
    private final String identity;
    private final Map<String, String> instanceSids;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountDescriptor copy$default(AccountDescriptor accountDescriptor, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountDescriptor.accountSid;
        }
        if ((i & 2) != 0) {
            map = accountDescriptor.instanceSids;
        }
        if ((i & 4) != 0) {
            str2 = accountDescriptor.identity;
        }
        return accountDescriptor.copy(str, map, str2);
    }

    @SerialName("account_sid")
    public static /* synthetic */ void getAccountSid$annotations() {
    }

    @SerialName(ContentEncoding.IDENTITY)
    public static /* synthetic */ void getIdentity$annotations() {
    }

    @SerialName("instance_sids")
    public static /* synthetic */ void getInstanceSids$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountSid() {
        return this.accountSid;
    }

    public final Map<String, String> component2() {
        return this.instanceSids;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentity() {
        return this.identity;
    }

    public final AccountDescriptor copy(String accountSid, Map<String, String> instanceSids, String identity) {
        Intrinsics.checkNotNullParameter(accountSid, "accountSid");
        Intrinsics.checkNotNullParameter(instanceSids, "instanceSids");
        Intrinsics.checkNotNullParameter(identity, "identity");
        return new AccountDescriptor(accountSid, instanceSids, identity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDescriptor)) {
            return false;
        }
        AccountDescriptor accountDescriptor = (AccountDescriptor) other;
        return Intrinsics.areEqual(this.accountSid, accountDescriptor.accountSid) && Intrinsics.areEqual(this.instanceSids, accountDescriptor.instanceSids) && Intrinsics.areEqual(this.identity, accountDescriptor.identity);
    }

    public int hashCode() {
        return (((this.accountSid.hashCode() * 31) + this.instanceSids.hashCode()) * 31) + this.identity.hashCode();
    }

    public String toString() {
        return "AccountDescriptor(accountSid=" + this.accountSid + ", instanceSids=" + this.instanceSids + ", identity=" + this.identity + ')';
    }

    @Deprecated
    public /* synthetic */ AccountDescriptor(int i, @SerialName("account_sid") String str, @SerialName("instance_sids") Map map, @SerialName(ContentEncoding.IDENTITY) String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, AccountDescriptor2.INSTANCE.getDescriptor());
        }
        this.accountSid = str;
        this.instanceSids = map;
        this.identity = str2;
    }

    public AccountDescriptor(String accountSid, Map<String, String> instanceSids, String identity) {
        Intrinsics.checkNotNullParameter(accountSid, "accountSid");
        Intrinsics.checkNotNullParameter(instanceSids, "instanceSids");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.accountSid = accountSid;
        this.instanceSids = instanceSids;
        this.identity = identity;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$shared_public_release(AccountDescriptor self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.accountSid);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.instanceSids);
        output.encodeStringElement(serialDesc, 2, self.identity);
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final Map<String, String> getInstanceSids() {
        return this.instanceSids;
    }

    public final String getIdentity() {
        return this.identity;
    }

    /* compiled from: AccountDescriptor.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/util/AccountDescriptor$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/util/AccountDescriptor;", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountDescriptor> serializer() {
            return AccountDescriptor2.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }
}
