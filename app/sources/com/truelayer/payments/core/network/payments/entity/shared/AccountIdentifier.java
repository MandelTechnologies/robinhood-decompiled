package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: Beneficiary.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "Companion", "Iban", "SortCodeAccountNumber", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$SortCodeAccountNumber;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public interface AccountIdentifier extends IntoDomain<Beneficiary.AccountIdentifier> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<AccountIdentifier> serializer() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.AccountIdentifier", Reflection.getOrCreateKotlinClass(AccountIdentifier.class), new KClass[]{Reflection.getOrCreateKotlinClass(Iban.class), Reflection.getOrCreateKotlinClass(SortCodeAccountNumber.class)}, new KSerializer[]{AccountIdentifier$Iban$$serializer.INSTANCE, AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$SortCodeAccountNumber;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "seen1", "", "sortCode", "", "accountNumber", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber$annotations", "()V", "getAccountNumber", "()Ljava/lang/String;", "getSortCode$annotations", "getSortCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("sort_code_account_number")
    public static final /* data */ class SortCodeAccountNumber implements AccountIdentifier {

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
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$SortCodeAccountNumber$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$SortCodeAccountNumber;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SortCodeAccountNumber> serializer() {
                return AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ SortCodeAccountNumber(int i, @SerialName("sort_code") String str, @SerialName("account_number") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, AccountIdentifier$SortCodeAccountNumber$$serializer.INSTANCE.getDescriptor());
            }
            this.sortCode = str;
            this.accountNumber = str2;
        }

        public SortCodeAccountNumber(String sortCode, String accountNumber) {
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.sortCode = sortCode;
            this.accountNumber = accountNumber;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(SortCodeAccountNumber self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.sortCode);
            output.encodeStringElement(serialDesc, 1, self.accountNumber);
        }

        public final String getSortCode() {
            return this.sortCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public Beneficiary.AccountIdentifier intoDomain2() {
            return new Beneficiary.AccountIdentifier.SortCodeAccountNumber(this.sortCode, this.accountNumber);
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier;", "seen1", "", "iban", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getIban$annotations", "()V", "getIban", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$Iban;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("iban")
    public static final /* data */ class Iban implements AccountIdentifier {

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
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$Iban$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/AccountIdentifier$Iban;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Iban> serializer() {
                return AccountIdentifier$Iban$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Iban(int i, @SerialName("iban") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, AccountIdentifier$Iban$$serializer.INSTANCE.getDescriptor());
            }
            this.iban = str;
        }

        public Iban(String iban) {
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.iban = iban;
        }

        public final String getIban() {
            return this.iban;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public Beneficiary.AccountIdentifier intoDomain2() {
            return new Beneficiary.AccountIdentifier.Iban(this.iban);
        }
    }
}
