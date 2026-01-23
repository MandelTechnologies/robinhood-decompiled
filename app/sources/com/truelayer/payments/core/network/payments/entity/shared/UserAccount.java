package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.utils.IntoDomain;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: UserAccount.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000201BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\b\u0010&\u001a\u00020\u0002H\u0016J\t\u0010'\u001a\u00020\u0006HÖ\u0001J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÁ\u0001¢\u0006\u0002\b/R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/UserAccount;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "seen1", "", "id", "", "provider", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;", "maskedAccountIdentifier", "lastUsedAt", "Lkotlinx/datetime/Instant;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;Ljava/lang/String;Lkotlinx/datetime/Instant;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLastUsedAt$annotations", "getLastUsedAt", "()Lkotlinx/datetime/Instant;", "getMaskedAccountIdentifier$annotations", "getMaskedAccountIdentifier", "getProvider$annotations", "getProvider", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class UserAccount implements IntoDomain<com.truelayer.payments.core.domain.payments.UserAccount> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final Instant lastUsedAt;
    private final String maskedAccountIdentifier;
    private final PaymentProvider provider;

    public static /* synthetic */ UserAccount copy$default(UserAccount userAccount, String str, PaymentProvider paymentProvider, String str2, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAccount.id;
        }
        if ((i & 2) != 0) {
            paymentProvider = userAccount.provider;
        }
        if ((i & 4) != 0) {
            str2 = userAccount.maskedAccountIdentifier;
        }
        if ((i & 8) != 0) {
            instant = userAccount.lastUsedAt;
        }
        return userAccount.copy(str, paymentProvider, str2, instant);
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("last_used_at")
    public static /* synthetic */ void getLastUsedAt$annotations() {
    }

    @SerialName("masked_account_identifier")
    public static /* synthetic */ void getMaskedAccountIdentifier$annotations() {
    }

    @SerialName("provider")
    public static /* synthetic */ void getProvider$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMaskedAccountIdentifier() {
        return this.maskedAccountIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getLastUsedAt() {
        return this.lastUsedAt;
    }

    public final UserAccount copy(String id, PaymentProvider provider, String maskedAccountIdentifier, Instant lastUsedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(maskedAccountIdentifier, "maskedAccountIdentifier");
        Intrinsics.checkNotNullParameter(lastUsedAt, "lastUsedAt");
        return new UserAccount(id, provider, maskedAccountIdentifier, lastUsedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAccount)) {
            return false;
        }
        UserAccount userAccount = (UserAccount) other;
        return Intrinsics.areEqual(this.id, userAccount.id) && Intrinsics.areEqual(this.provider, userAccount.provider) && Intrinsics.areEqual(this.maskedAccountIdentifier, userAccount.maskedAccountIdentifier) && Intrinsics.areEqual(this.lastUsedAt, userAccount.lastUsedAt);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.maskedAccountIdentifier.hashCode()) * 31) + this.lastUsedAt.hashCode();
    }

    public String toString() {
        return "UserAccount(id=" + this.id + ", provider=" + this.provider + ", maskedAccountIdentifier=" + this.maskedAccountIdentifier + ", lastUsedAt=" + this.lastUsedAt + ")";
    }

    /* compiled from: UserAccount.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/UserAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/UserAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UserAccount> serializer() {
            return UserAccount2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ UserAccount(int i, @SerialName("id") String str, @SerialName("provider") PaymentProvider paymentProvider, @SerialName("masked_account_identifier") String str2, @SerialName("last_used_at") Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, UserAccount2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.provider = paymentProvider;
        this.maskedAccountIdentifier = str2;
        this.lastUsedAt = instant;
    }

    public UserAccount(String id, PaymentProvider provider, String maskedAccountIdentifier, Instant lastUsedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(maskedAccountIdentifier, "maskedAccountIdentifier");
        Intrinsics.checkNotNullParameter(lastUsedAt, "lastUsedAt");
        this.id = id;
        this.provider = provider;
        this.maskedAccountIdentifier = maskedAccountIdentifier;
        this.lastUsedAt = lastUsedAt;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(UserAccount self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, PaymentProvider4.INSTANCE, self.provider);
        output.encodeStringElement(serialDesc, 2, self.maskedAccountIdentifier);
        output.encodeSerializableElement(serialDesc, 3, InstantSerializers.INSTANCE, self.lastUsedAt);
    }

    public final String getId() {
        return this.id;
    }

    public final PaymentProvider getProvider() {
        return this.provider;
    }

    public final String getMaskedAccountIdentifier() {
        return this.maskedAccountIdentifier;
    }

    public final Instant getLastUsedAt() {
        return this.lastUsedAt;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.UserAccount intoDomain2() {
        return new com.truelayer.payments.core.domain.payments.UserAccount(this.id, this.provider.intoDomain2(), this.maskedAccountIdentifier, this.lastUsedAt);
    }
}
