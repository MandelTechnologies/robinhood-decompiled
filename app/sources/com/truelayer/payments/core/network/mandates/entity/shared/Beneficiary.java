package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: Beneficiary.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "AccountIdentifier", "Companion", "ExternalAccount", "MerchantAccount", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$MerchantAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class Beneficiary implements IntoDomain<com.truelayer.payments.core.domain.payments.Beneficiary> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary", Reflection.getOrCreateKotlinClass(Beneficiary.class), new KClass[]{Reflection.getOrCreateKotlinClass(ExternalAccount.class), Reflection.getOrCreateKotlinClass(MerchantAccount.class)}, new KSerializer[]{Beneficiary$ExternalAccount$$serializer.INSTANCE, Beneficiary$MerchantAccount$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ Beneficiary(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Beneficiary self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Beneficiary.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Beneficiary> serializer() {
            return get$cachedSerializer();
        }
    }

    private Beneficiary() {
    }

    @Deprecated
    public /* synthetic */ Beneficiary(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0005HÖ\u0001J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u00060"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$MerchantAccount;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "seen1", "", "id", "", "accountHolderName", "accountIdentifier", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "reference", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;Ljava/lang/String;)V", "getAccountHolderName$annotations", "()V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountIdentifier$annotations", "getAccountIdentifier", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "getId$annotations", "getId", "getReference$annotations", "getReference", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$MerchantAccount;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("merchant_account")
    public static final /* data */ class MerchantAccount extends Beneficiary {
        private final String accountHolderName;
        private final AccountIdentifier accountIdentifier;
        private final String id;
        private final String reference;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, AccountIdentifier.INSTANCE.serializer(), null};

        public static /* synthetic */ MerchantAccount copy$default(MerchantAccount merchantAccount, String str, String str2, AccountIdentifier accountIdentifier, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = merchantAccount.accountHolderName;
            }
            if ((i & 4) != 0) {
                accountIdentifier = merchantAccount.accountIdentifier;
            }
            if ((i & 8) != 0) {
                str3 = merchantAccount.reference;
            }
            return merchantAccount.copy(str, str2, accountIdentifier, str3);
        }

        @SerialName("account_holder_name")
        public static /* synthetic */ void getAccountHolderName$annotations() {
        }

        @SerialName("account_identifier")
        public static /* synthetic */ void getAccountIdentifier$annotations() {
        }

        @SerialName("merchant_account_id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getReference$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public final MerchantAccount copy(String id, String accountHolderName, AccountIdentifier accountIdentifier, String reference) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new MerchantAccount(id, accountHolderName, accountIdentifier, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantAccount)) {
                return false;
            }
            MerchantAccount merchantAccount = (MerchantAccount) other;
            return Intrinsics.areEqual(this.id, merchantAccount.id) && Intrinsics.areEqual(this.accountHolderName, merchantAccount.accountHolderName) && Intrinsics.areEqual(this.accountIdentifier, merchantAccount.accountIdentifier) && Intrinsics.areEqual(this.reference, merchantAccount.reference);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.accountHolderName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            int iHashCode3 = (iHashCode2 + (accountIdentifier == null ? 0 : accountIdentifier.hashCode())) * 31;
            String str2 = this.reference;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MerchantAccount(id=" + this.id + ", accountHolderName=" + this.accountHolderName + ", accountIdentifier=" + this.accountIdentifier + ", reference=" + this.reference + ")";
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$MerchantAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$MerchantAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ MerchantAccount(int i, @SerialName("merchant_account_id") String str, @SerialName("account_holder_name") String str2, @SerialName("account_identifier") AccountIdentifier accountIdentifier, @SerialName("reference") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, Beneficiary$MerchantAccount$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            if ((i & 2) == 0) {
                this.accountHolderName = null;
            } else {
                this.accountHolderName = str2;
            }
            if ((i & 4) == 0) {
                this.accountIdentifier = null;
            } else {
                this.accountIdentifier = accountIdentifier;
            }
            if ((i & 8) == 0) {
                this.reference = null;
            } else {
                this.reference = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(MerchantAccount self, Encoding3 output, SerialDescriptor serialDesc) {
            Beneficiary.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.id);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.accountHolderName != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.accountHolderName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.accountIdentifier != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.accountIdentifier);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.reference == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.reference);
        }

        public /* synthetic */ MerchantAccount(String str, String str2, AccountIdentifier accountIdentifier, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : accountIdentifier, (i & 8) != 0 ? null : str3);
        }

        public final String getId() {
            return this.id;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantAccount(String id, String str, AccountIdentifier accountIdentifier, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.accountHolderName = str;
            this.accountIdentifier = accountIdentifier;
            this.reference = str2;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.Beneficiary intoDomain2() {
            String str = this.id;
            String str2 = this.accountHolderName;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            return new Beneficiary.MerchantAccount(str, str2, accountIdentifier != null ? accountIdentifier.intoDomain2() : null, this.reference);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "seen1", "", "accountHolderName", "", "accountIdentifier", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "reference", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;Ljava/lang/String;)V", "getAccountHolderName$annotations", "()V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountIdentifier$annotations", "getAccountIdentifier", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "getReference$annotations", "getReference", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$ExternalAccount;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("external_account")
    public static final /* data */ class ExternalAccount extends Beneficiary {
        private final String accountHolderName;
        private final AccountIdentifier accountIdentifier;
        private final String reference;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, AccountIdentifier.INSTANCE.serializer(), null};

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
            Intrinsics.checkNotNullParameter(accountHolderName, "accountHolderName");
            Intrinsics.checkNotNullParameter(accountIdentifier, "accountIdentifier");
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
            int iHashCode = ((this.accountHolderName.hashCode() * 31) + this.accountIdentifier.hashCode()) * 31;
            String str = this.reference;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExternalAccount(accountHolderName=" + this.accountHolderName + ", accountIdentifier=" + this.accountIdentifier + ", reference=" + this.reference + ")";
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$ExternalAccount$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$ExternalAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ ExternalAccount(int i, @SerialName("account_holder_name") String str, @SerialName("account_identifier") AccountIdentifier accountIdentifier, @SerialName("reference") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, Beneficiary$ExternalAccount$$serializer.INSTANCE.getDescriptor());
            }
            this.accountHolderName = str;
            this.accountIdentifier = accountIdentifier;
            if ((i & 4) == 0) {
                this.reference = null;
            } else {
                this.reference = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(ExternalAccount self, Encoding3 output, SerialDescriptor serialDesc) {
            Beneficiary.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.accountHolderName);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.accountIdentifier);
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.reference == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.reference);
        }

        public /* synthetic */ ExternalAccount(String str, AccountIdentifier accountIdentifier, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, accountIdentifier, (i & 4) != 0 ? null : str2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalAccount(String accountHolderName, AccountIdentifier accountIdentifier, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(accountHolderName, "accountHolderName");
            Intrinsics.checkNotNullParameter(accountIdentifier, "accountIdentifier");
            this.accountHolderName = accountHolderName;
            this.accountIdentifier = accountIdentifier;
            this.reference = str;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.Beneficiary intoDomain2() {
            return new Beneficiary.ExternalAccount(this.accountHolderName, this.accountIdentifier.intoDomain2(), this.reference);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u0011\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Iban", "SortCodeAccountNumber", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static abstract class AccountIdentifier implements IntoDomain<Beneficiary.AccountIdentifier> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary.AccountIdentifier.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new SealedSerializer("com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary.AccountIdentifier", Reflection.getOrCreateKotlinClass(AccountIdentifier.class), new KClass[]{Reflection.getOrCreateKotlinClass(Iban.class), Reflection.getOrCreateKotlinClass(SortCodeAccountNumber.class)}, new KSerializer[]{Beneficiary$AccountIdentifier$Iban$$serializer.INSTANCE, Beneficiary$AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE}, new Annotation[0]);
            }
        });

        public /* synthetic */ AccountIdentifier(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self(AccountIdentifier self, Encoding3 output, SerialDescriptor serialDesc) {
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) AccountIdentifier.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<AccountIdentifier> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "seen1", "", "sortCode", "", "accountNumber", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber$annotations", "()V", "getAccountNumber", "()Ljava/lang/String;", "getSortCode$annotations", "getSortCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @SerialName("sort_code_account_number")
        public static final /* data */ class SortCodeAccountNumber extends AccountIdentifier {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String accountNumber;
            private final String sortCode;

            public static /* synthetic */ SortCodeAccountNumber copy$default(SortCodeAccountNumber sortCodeAccountNumber, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sortCodeAccountNumber.sortCode;
                }
                if ((i & 2) != 0) {
                    str2 = sortCodeAccountNumber.accountNumber;
                }
                return sortCodeAccountNumber.copy(str, str2);
            }

            @SerialName("account_number")
            public static /* synthetic */ void getAccountNumber$annotations() {
            }

            @SerialName("sort_code")
            public static /* synthetic */ void getSortCode$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getSortCode() {
                return this.sortCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SortCodeAccountNumber copy(String sortCode, String accountNumber) {
                Intrinsics.checkNotNullParameter(sortCode, "sortCode");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new SortCodeAccountNumber(sortCode, accountNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SortCodeAccountNumber)) {
                    return false;
                }
                SortCodeAccountNumber sortCodeAccountNumber = (SortCodeAccountNumber) other;
                return Intrinsics.areEqual(this.sortCode, sortCodeAccountNumber.sortCode) && Intrinsics.areEqual(this.accountNumber, sortCodeAccountNumber.accountNumber);
            }

            public int hashCode() {
                return (this.sortCode.hashCode() * 31) + this.accountNumber.hashCode();
            }

            public String toString() {
                return "SortCodeAccountNumber(sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ")";
            }

            /* compiled from: Beneficiary.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$SortCodeAccountNumber$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SortCodeAccountNumber> serializer() {
                    return Beneficiary$AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @Deprecated
            public /* synthetic */ SortCodeAccountNumber(int i, @SerialName("sort_code") String str, @SerialName("account_number") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, Beneficiary$AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE.getDescriptor());
                }
                this.sortCode = str;
                this.accountNumber = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(SortCodeAccountNumber self, Encoding3 output, SerialDescriptor serialDesc) {
                AccountIdentifier.write$Self(self, output, serialDesc);
                output.encodeStringElement(serialDesc, 0, self.sortCode);
                output.encodeStringElement(serialDesc, 1, self.accountNumber);
            }

            public final String getSortCode() {
                return this.sortCode;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SortCodeAccountNumber(String sortCode, String accountNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(sortCode, "sortCode");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.sortCode = sortCode;
                this.accountNumber = accountNumber;
            }

            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public Beneficiary.AccountIdentifier intoDomain2() {
                return new Beneficiary.AccountIdentifier.SortCodeAccountNumber(this.sortCode, this.accountNumber);
            }
        }

        private AccountIdentifier() {
        }

        @Deprecated
        public /* synthetic */ AccountIdentifier(int i, SerializationConstructorMarker serializationConstructorMarker) {
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier;", "seen1", "", "iban", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getIban$annotations", "()V", "getIban", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$Iban;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @SerialName("iban")
        public static final /* data */ class Iban extends AccountIdentifier {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String iban;

            public static /* synthetic */ Iban copy$default(Iban iban, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iban.iban;
                }
                return iban.copy(str);
            }

            @SerialName("iban")
            public static /* synthetic */ void getIban$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getIban() {
                return this.iban;
            }

            public final Iban copy(String iban) {
                Intrinsics.checkNotNullParameter(iban, "iban");
                return new Iban(iban);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Iban) && Intrinsics.areEqual(this.iban, ((Iban) other).iban);
            }

            public int hashCode() {
                return this.iban.hashCode();
            }

            public String toString() {
                return "Iban(iban=" + this.iban + ")";
            }

            /* compiled from: Beneficiary.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$Iban$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary$AccountIdentifier$Iban;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Iban> serializer() {
                    return Beneficiary$AccountIdentifier$Iban$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @Deprecated
            public /* synthetic */ Iban(int i, @SerialName("iban") String str, SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, Beneficiary$AccountIdentifier$Iban$$serializer.INSTANCE.getDescriptor());
                }
                this.iban = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(Iban self, Encoding3 output, SerialDescriptor serialDesc) {
                AccountIdentifier.write$Self(self, output, serialDesc);
                output.encodeStringElement(serialDesc, 0, self.iban);
            }

            public final String getIban() {
                return this.iban;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Iban(String iban) {
                super(null);
                Intrinsics.checkNotNullParameter(iban, "iban");
                this.iban = iban;
            }

            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public Beneficiary.AccountIdentifier intoDomain2() {
                return new Beneficiary.AccountIdentifier.Iban(this.iban);
            }
        }
    }
}
