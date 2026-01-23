package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;

/* compiled from: UserAccount.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/UserAccount;", "", "id", "", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "maskedAccountIdentifier", "lastUsedAt", "Lkotlinx/datetime/Instant;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/lang/String;Lkotlinx/datetime/Instant;)V", "getId", "()Ljava/lang/String;", "getLastUsedAt", "()Lkotlinx/datetime/Instant;", "getMaskedAccountIdentifier", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UserAccount {
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
}
