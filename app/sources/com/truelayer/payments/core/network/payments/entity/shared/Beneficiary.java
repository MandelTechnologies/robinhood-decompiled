package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.network.payments.entity.shared.AccountIdentifier;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: Beneficiary.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "Companion", "ExternalAccount", "MerchantAccount", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$MerchantAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public interface Beneficiary extends IntoDomain<com.truelayer.payments.core.domain.payments.Beneficiary> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<Beneficiary> serializer() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.Beneficiary", Reflection.getOrCreateKotlinClass(Beneficiary.class), new KClass[]{Reflection.getOrCreateKotlinClass(ExternalAccount.class), Reflection.getOrCreateKotlinClass(MerchantAccount.class)}, new KSerializer[]{Beneficiary$ExternalAccount$$serializer.INSTANCE, Beneficiary$MerchantAccount$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "seen1", "", "accountHolderName", "", "accountIdentifier", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "reference", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;Ljava/lang/String;)V", "getAccountHolderName$annotations", "()V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountIdentifier$annotations", "getAccountIdentifier", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "getReference$annotations", "getReference", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$ExternalAccount;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("external_account")
    public static final /* data */ class ExternalAccount implements Beneficiary {
        private final String accountHolderName;
        private final AccountIdentifier accountIdentifier;
        private final String reference;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.AccountIdentifier", Reflection.getOrCreateKotlinClass(AccountIdentifier.class), new KClass[]{Reflection.getOrCreateKotlinClass(AccountIdentifier.Iban.class), Reflection.getOrCreateKotlinClass(AccountIdentifier.SortCodeAccountNumber.class)}, new KSerializer[]{AccountIdentifier$Iban$$serializer.INSTANCE, AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE}, new Annotation[0]), null};

        public ExternalAccount() {
            this((String) null, (AccountIdentifier) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ExternalAccount copy$default(ExternalAccount externalAccount, String str, AccountIdentifier accountIdentifier, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalAccount.accountHolderName;
            }
            if ((i & 2) != 0) {
                accountIdentifier = externalAccount.accountIdentifier;
            }
            if ((i & 4) != 0) {
                str2 = externalAccount.reference;
            }
            return externalAccount.copy(str, accountIdentifier, str2);
        }

        @SerialName("account_holder_name")
        public static /* synthetic */ void getAccountHolderName$annotations() {
        }

        @SerialName("account_identifier")
        public static /* synthetic */ void getAccountIdentifier$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getReference$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public final ExternalAccount copy(String accountHolderName, AccountIdentifier accountIdentifier, String reference) {
            return new ExternalAccount(accountHolderName, accountIdentifier, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalAccount)) {
                return false;
            }
            ExternalAccount externalAccount = (ExternalAccount) other;
            return Intrinsics.areEqual(this.accountHolderName, externalAccount.accountHolderName) && Intrinsics.areEqual(this.accountIdentifier, externalAccount.accountIdentifier) && Intrinsics.areEqual(this.reference, externalAccount.reference);
        }

        public int hashCode() {
            String str = this.accountHolderName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            int iHashCode2 = (iHashCode + (accountIdentifier == null ? 0 : accountIdentifier.hashCode())) * 31;
            String str2 = this.reference;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ExternalAccount(accountHolderName=" + this.accountHolderName + ", accountIdentifier=" + this.accountIdentifier + ", reference=" + this.reference + ")";
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$ExternalAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$ExternalAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ExternalAccount> serializer() {
                return Beneficiary$ExternalAccount$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ExternalAccount(int i, @SerialName("account_holder_name") String str, @SerialName("account_identifier") AccountIdentifier accountIdentifier, @SerialName("reference") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.accountHolderName = null;
            } else {
                this.accountHolderName = str;
            }
            if ((i & 2) == 0) {
                this.accountIdentifier = null;
            } else {
                this.accountIdentifier = accountIdentifier;
            }
            if ((i & 4) == 0) {
                this.reference = null;
            } else {
                this.reference = str2;
            }
        }

        public ExternalAccount(String str, AccountIdentifier accountIdentifier, String str2) {
            this.accountHolderName = str;
            this.accountIdentifier = accountIdentifier;
            this.reference = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(ExternalAccount self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accountHolderName != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.accountHolderName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.accountIdentifier != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.accountIdentifier);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.reference == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.reference);
        }

        public /* synthetic */ ExternalAccount(String str, AccountIdentifier accountIdentifier, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : accountIdentifier, (i & 4) != 0 ? null : str2);
        }

        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        public final AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        public final String getReference() {
            return this.reference;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.Beneficiary intoDomain2() {
            String str = this.accountHolderName;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            return new Beneficiary.ExternalAccount(str, accountIdentifier != null ? accountIdentifier.intoDomain2() : null, this.reference);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$MerchantAccount;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "seen1", "", "merchantAccountId", "", "accountHolderName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountHolderName$annotations", "()V", "getAccountHolderName", "()Ljava/lang/String;", "getMerchantAccountId$annotations", "getMerchantAccountId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$MerchantAccount;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("merchant_account")
    public static final /* data */ class MerchantAccount implements Beneficiary {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String accountHolderName;
        private final String merchantAccountId;

        /* JADX WARN: Multi-variable type inference failed */
        public MerchantAccount() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ MerchantAccount copy$default(MerchantAccount merchantAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantAccount.merchantAccountId;
            }
            if ((i & 2) != 0) {
                str2 = merchantAccount.accountHolderName;
            }
            return merchantAccount.copy(str, str2);
        }

        @SerialName("account_holder_name")
        public static /* synthetic */ void getAccountHolderName$annotations() {
        }

        @SerialName("merchant_account_id")
        public static /* synthetic */ void getMerchantAccountId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getMerchantAccountId() {
            return this.merchantAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        public final MerchantAccount copy(String merchantAccountId, String accountHolderName) {
            return new MerchantAccount(merchantAccountId, accountHolderName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantAccount)) {
                return false;
            }
            MerchantAccount merchantAccount = (MerchantAccount) other;
            return Intrinsics.areEqual(this.merchantAccountId, merchantAccount.merchantAccountId) && Intrinsics.areEqual(this.accountHolderName, merchantAccount.accountHolderName);
        }

        public int hashCode() {
            String str = this.merchantAccountId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MerchantAccount(merchantAccountId=" + this.merchantAccountId + ", accountHolderName=" + this.accountHolderName + ")";
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$MerchantAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary$MerchantAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MerchantAccount> serializer() {
                return Beneficiary$MerchantAccount$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ MerchantAccount(int i, @SerialName("merchant_account_id") String str, @SerialName("account_holder_name") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.merchantAccountId = null;
            } else {
                this.merchantAccountId = str;
            }
            if ((i & 2) == 0) {
                this.accountHolderName = null;
            } else {
                this.accountHolderName = str2;
            }
        }

        public MerchantAccount(String str, String str2) {
            this.merchantAccountId = str;
            this.accountHolderName = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(MerchantAccount self, Encoding3 output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.merchantAccountId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.merchantAccountId);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.accountHolderName == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.accountHolderName);
        }

        public /* synthetic */ MerchantAccount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getMerchantAccountId() {
            return this.merchantAccountId;
        }

        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.Beneficiary intoDomain2() {
            return new Beneficiary.MerchantAccount(this.merchantAccountId, this.accountHolderName, null, null);
        }
    }
}
