package com.truelayer.payments.core.network.payments.entity.response;

import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.network.payments.entity.shared.AuthorizationFlow;
import com.truelayer.payments.core.network.payments.entity.shared.AuthorizationFlow6;
import com.truelayer.payments.core.network.payments.entity.shared.BankTransfer;
import com.truelayer.payments.core.network.payments.entity.shared.Beneficiary;
import com.truelayer.payments.core.network.payments.entity.shared.Mandate;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentFailureReason;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentFailureReason2;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod3;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod5;
import com.truelayer.payments.core.network.payments.entity.shared.ProviderSelection;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts2;
import com.truelayer.payments.core.network.payments.entity.shared.User;
import com.truelayer.payments.core.network.payments.entity.shared.User5;
import com.truelayer.payments.core.utils.JsonConverter;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: PaymentResponse.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u001d\u001e\u001f !\"#$B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0006%&'()*¨\u0006+"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "()V", "amountInMinor", "", "getAmountInMinor", "()J", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "paymentId", "getPaymentId", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "intoDomain", "paymentMethodIntoDomain", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "AuthorizationRequired", "Authorized", "Authorizing", "Companion", "Executed", "Failed", "PaymentResponseSerializer", "Settled", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$AuthorizationRequired;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorized;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorizing;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Executed;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Failed;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Settled;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = PaymentResponseSerializer.class)
/* loaded from: classes6.dex */
public abstract class PaymentResponse implements IntoDomain<Payment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PaymentResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getAmountInMinor();

    public abstract String getCurrencyCode();

    public abstract String getPaymentId();

    public abstract PaymentMethod getPaymentMethod();

    public abstract RelatedProducts getRelatedProducts();

    public abstract User getUser();

    private PaymentResponse() {
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B_\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003JI\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J&\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208HÁ\u0001¢\u0006\u0002\b9R\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$¨\u0006<"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$AuthorizationRequired;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorization_required")
    public static final /* data */ class AuthorizationRequired extends PaymentResponse {
        private final long amountInMinor;
        private final String currencyCode;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null};

        public static /* synthetic */ AuthorizationRequired copy$default(AuthorizationRequired authorizationRequired, String str, long j, String str2, PaymentMethod paymentMethod, User user, RelatedProducts relatedProducts, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationRequired.paymentId;
            }
            if ((i & 2) != 0) {
                j = authorizationRequired.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = authorizationRequired.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentMethod = authorizationRequired.paymentMethod;
            }
            if ((i & 16) != 0) {
                user = authorizationRequired.user;
            }
            if ((i & 32) != 0) {
                relatedProducts = authorizationRequired.relatedProducts;
            }
            return authorizationRequired.copy(str, j, str2, paymentMethod, user, relatedProducts);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationRequired copy(String paymentId, long amountInMinor, String currencyCode, PaymentMethod paymentMethod, User user, RelatedProducts relatedProducts) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new AuthorizationRequired(paymentId, amountInMinor, currencyCode, paymentMethod, user, relatedProducts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationRequired)) {
                return false;
            }
            AuthorizationRequired authorizationRequired = (AuthorizationRequired) other;
            return Intrinsics.areEqual(this.paymentId, authorizationRequired.paymentId) && this.amountInMinor == authorizationRequired.amountInMinor && Intrinsics.areEqual(this.currencyCode, authorizationRequired.currencyCode) && Intrinsics.areEqual(this.paymentMethod, authorizationRequired.paymentMethod) && Intrinsics.areEqual(this.user, authorizationRequired.user) && Intrinsics.areEqual(this.relatedProducts, authorizationRequired.relatedProducts);
        }

        public int hashCode() {
            int iHashCode = ((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            User user = this.user;
            int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            return iHashCode2 + (relatedProducts != null ? relatedProducts.hashCode() : 0);
        }

        public String toString() {
            return "AuthorizationRequired(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", paymentMethod=" + this.paymentMethod + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$AuthorizationRequired$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$AuthorizationRequired;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AuthorizationRequired> serializer() {
                return PaymentResponse2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ AuthorizationRequired(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, PaymentResponse2.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.paymentMethod = paymentMethod;
            if ((i & 16) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 32) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(AuthorizationRequired self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getPaymentMethod());
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, User5.INSTANCE, self.getUser());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getRelatedProducts() == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 5, RelatedProducts2.INSTANCE, self.getRelatedProducts());
        }

        public /* synthetic */ AuthorizationRequired(String str, long j, String str2, PaymentMethod paymentMethod, User user, RelatedProducts relatedProducts, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentMethod, (i & 16) != 0 ? null : user, (i & 32) != 0 ? null : relatedProducts);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizationRequired(String paymentId, long j, String currencyCode, PaymentMethod paymentMethod, User user, RelatedProducts relatedProducts) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.paymentMethod = paymentMethod;
            this.user = user;
            this.relatedProducts = relatedProducts;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002@ABk\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003JS\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J&\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>HÁ\u0001¢\u0006\u0002\b?R\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)¨\u0006B"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorizing;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "authorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getAuthorizationFlow$annotations", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorizing")
    public static final /* data */ class Authorizing extends PaymentResponse {
        private final long amountInMinor;
        private final AuthorizationFlow authorizationFlow;
        private final String currencyCode;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null, null};

        public static /* synthetic */ Authorizing copy$default(Authorizing authorizing, String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizing.paymentId;
            }
            if ((i & 2) != 0) {
                j = authorizing.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = authorizing.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentMethod = authorizing.paymentMethod;
            }
            if ((i & 16) != 0) {
                authorizationFlow = authorizing.authorizationFlow;
            }
            if ((i & 32) != 0) {
                user = authorizing.user;
            }
            if ((i & 64) != 0) {
                relatedProducts = authorizing.relatedProducts;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            String str3 = str2;
            return authorizing.copy(str, j, str3, paymentMethod, authorizationFlow2, user, relatedProducts2);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final Authorizing copy(String paymentId, long amountInMinor, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorizing(paymentId, amountInMinor, currencyCode, paymentMethod, authorizationFlow, user, relatedProducts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorizing)) {
                return false;
            }
            Authorizing authorizing = (Authorizing) other;
            return Intrinsics.areEqual(this.paymentId, authorizing.paymentId) && this.amountInMinor == authorizing.amountInMinor && Intrinsics.areEqual(this.currencyCode, authorizing.currencyCode) && Intrinsics.areEqual(this.paymentMethod, authorizing.paymentMethod) && Intrinsics.areEqual(this.authorizationFlow, authorizing.authorizationFlow) && Intrinsics.areEqual(this.user, authorizing.user) && Intrinsics.areEqual(this.relatedProducts, authorizing.relatedProducts);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.authorizationFlow.hashCode()) * 31;
            User user = this.user;
            int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            return iHashCode2 + (relatedProducts != null ? relatedProducts.hashCode() : 0);
        }

        public String toString() {
            return "Authorizing(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", paymentMethod=" + this.paymentMethod + ", authorizationFlow=" + this.authorizationFlow + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorizing$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorizing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Authorizing> serializer() {
                return PaymentResponse4.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Authorizing(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (31 != (i & 31)) {
                PluginExceptions.throwMissingFieldException(i, 31, PaymentResponse4.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 64) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Authorizing self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getPaymentMethod());
            output.encodeSerializableElement(serialDesc, 4, AuthorizationFlow6.INSTANCE, self.authorizationFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, User5.INSTANCE, self.getUser());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.getRelatedProducts() == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 6, RelatedProducts2.INSTANCE, self.getRelatedProducts());
        }

        public /* synthetic */ Authorizing(String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentMethod, authorizationFlow, (i & 32) != 0 ? null : user, (i & 64) != 0 ? null : relatedProducts);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authorizing(String paymentId, long j, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            this.user = user;
            this.relatedProducts = relatedProducts;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002DEBw\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001J&\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BHÁ\u0001¢\u0006\u0002\bCR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001fR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,¨\u0006F"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorized;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "authorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "creditableAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getAuthorizationFlow$annotations", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "getCreditableAt$annotations", "getCreditableAt", "()Ljava/lang/String;", "getCurrencyCode$annotations", "getCurrencyCode", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorized")
    public static final /* data */ class Authorized extends PaymentResponse {
        private final long amountInMinor;
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final String currencyCode;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null, null, null};

        public static /* synthetic */ Authorized copy$default(Authorized authorized, String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorized.paymentId;
            }
            if ((i & 2) != 0) {
                j = authorized.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = authorized.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentMethod = authorized.paymentMethod;
            }
            if ((i & 16) != 0) {
                authorizationFlow = authorized.authorizationFlow;
            }
            if ((i & 32) != 0) {
                user = authorized.user;
            }
            if ((i & 64) != 0) {
                relatedProducts = authorized.relatedProducts;
            }
            if ((i & 128) != 0) {
                str3 = authorized.creditableAt;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            String str4 = str3;
            return authorized.copy(str, j, str2, paymentMethod, authorizationFlow, user, relatedProducts2, str4);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("creditable_at")
        public static /* synthetic */ void getCreditableAt$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final Authorized copy(String paymentId, long amountInMinor, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorized(paymentId, amountInMinor, currencyCode, paymentMethod, authorizationFlow, user, relatedProducts, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorized)) {
                return false;
            }
            Authorized authorized = (Authorized) other;
            return Intrinsics.areEqual(this.paymentId, authorized.paymentId) && this.amountInMinor == authorized.amountInMinor && Intrinsics.areEqual(this.currencyCode, authorized.currencyCode) && Intrinsics.areEqual(this.paymentMethod, authorized.paymentMethod) && Intrinsics.areEqual(this.authorizationFlow, authorized.authorizationFlow) && Intrinsics.areEqual(this.user, authorized.user) && Intrinsics.areEqual(this.relatedProducts, authorized.relatedProducts) && Intrinsics.areEqual(this.creditableAt, authorized.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.authorizationFlow.hashCode()) * 31;
            User user = this.user;
            int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode3 = (iHashCode2 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            String str = this.creditableAt;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Authorized(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", paymentMethod=" + this.paymentMethod + ", authorizationFlow=" + this.authorizationFlow + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", creditableAt=" + this.creditableAt + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorized$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorized;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Authorized> serializer() {
                return PaymentResponse3.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Authorized(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("creditable_at") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (31 != (i & 31)) {
                PluginExceptions.throwMissingFieldException(i, 31, PaymentResponse3.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 64) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
            if ((i & 128) == 0) {
                this.creditableAt = null;
            } else {
                this.creditableAt = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Authorized self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getPaymentMethod());
            output.encodeSerializableElement(serialDesc, 4, AuthorizationFlow6.INSTANCE, self.authorizationFlow);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, User5.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.creditableAt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.creditableAt);
        }

        public /* synthetic */ Authorized(String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentMethod, authorizationFlow, (i & 32) != 0 ? null : user, (i & 64) != 0 ? null : relatedProducts, (i & 128) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authorized(String paymentId, long j, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.creditableAt = str;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002DEBw\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001J&\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BHÁ\u0001¢\u0006\u0002\bCR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001fR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,¨\u0006F"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Executed;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "authorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "creditableAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getAuthorizationFlow$annotations", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "getCreditableAt$annotations", "getCreditableAt", "()Ljava/lang/String;", "getCurrencyCode$annotations", "getCurrencyCode", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("executed")
    public static final /* data */ class Executed extends PaymentResponse {
        private final long amountInMinor;
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final String currencyCode;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null, null, null};

        public static /* synthetic */ Executed copy$default(Executed executed, String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = executed.paymentId;
            }
            if ((i & 2) != 0) {
                j = executed.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = executed.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentMethod = executed.paymentMethod;
            }
            if ((i & 16) != 0) {
                authorizationFlow = executed.authorizationFlow;
            }
            if ((i & 32) != 0) {
                user = executed.user;
            }
            if ((i & 64) != 0) {
                relatedProducts = executed.relatedProducts;
            }
            if ((i & 128) != 0) {
                str3 = executed.creditableAt;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            String str4 = str3;
            return executed.copy(str, j, str2, paymentMethod, authorizationFlow, user, relatedProducts2, str4);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("creditable_at")
        public static /* synthetic */ void getCreditableAt$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final Executed copy(String paymentId, long amountInMinor, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Executed(paymentId, amountInMinor, currencyCode, paymentMethod, authorizationFlow, user, relatedProducts, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Executed)) {
                return false;
            }
            Executed executed = (Executed) other;
            return Intrinsics.areEqual(this.paymentId, executed.paymentId) && this.amountInMinor == executed.amountInMinor && Intrinsics.areEqual(this.currencyCode, executed.currencyCode) && Intrinsics.areEqual(this.paymentMethod, executed.paymentMethod) && Intrinsics.areEqual(this.authorizationFlow, executed.authorizationFlow) && Intrinsics.areEqual(this.user, executed.user) && Intrinsics.areEqual(this.relatedProducts, executed.relatedProducts) && Intrinsics.areEqual(this.creditableAt, executed.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            int iHashCode2 = (iHashCode + (authorizationFlow == null ? 0 : authorizationFlow.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode4 = (iHashCode3 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            String str = this.creditableAt;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Executed(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", paymentMethod=" + this.paymentMethod + ", authorizationFlow=" + this.authorizationFlow + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", creditableAt=" + this.creditableAt + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Executed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Executed;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Executed> serializer() {
                return PaymentResponse5.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Executed(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("creditable_at") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, PaymentResponse5.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.paymentMethod = paymentMethod;
            if ((i & 16) == 0) {
                this.authorizationFlow = null;
            } else {
                this.authorizationFlow = authorizationFlow;
            }
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 64) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
            if ((i & 128) == 0) {
                this.creditableAt = null;
            } else {
                this.creditableAt = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Executed self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getPaymentMethod());
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.authorizationFlow != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AuthorizationFlow6.INSTANCE, self.authorizationFlow);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, User5.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.creditableAt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.creditableAt);
        }

        public /* synthetic */ Executed(String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentMethod, (i & 16) != 0 ? null : authorizationFlow, (i & 32) != 0 ? null : user, (i & 64) != 0 ? null : relatedProducts, (i & 128) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Executed(String paymentId, long j, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.creditableAt = str;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002DEBw\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001J&\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BHÁ\u0001¢\u0006\u0002\bCR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001fR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,¨\u0006F"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Settled;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "authorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "creditableAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getAuthorizationFlow$annotations", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "getCreditableAt$annotations", "getCreditableAt", "()Ljava/lang/String;", "getCurrencyCode$annotations", "getCurrencyCode", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("settled")
    public static final /* data */ class Settled extends PaymentResponse {
        private final long amountInMinor;
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final String currencyCode;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null, null, null};

        public static /* synthetic */ Settled copy$default(Settled settled, String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = settled.paymentId;
            }
            if ((i & 2) != 0) {
                j = settled.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = settled.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentMethod = settled.paymentMethod;
            }
            if ((i & 16) != 0) {
                authorizationFlow = settled.authorizationFlow;
            }
            if ((i & 32) != 0) {
                user = settled.user;
            }
            if ((i & 64) != 0) {
                relatedProducts = settled.relatedProducts;
            }
            if ((i & 128) != 0) {
                str3 = settled.creditableAt;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            String str4 = str3;
            return settled.copy(str, j, str2, paymentMethod, authorizationFlow, user, relatedProducts2, str4);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("creditable_at")
        public static /* synthetic */ void getCreditableAt$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final Settled copy(String paymentId, long amountInMinor, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Settled(paymentId, amountInMinor, currencyCode, paymentMethod, authorizationFlow, user, relatedProducts, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settled)) {
                return false;
            }
            Settled settled = (Settled) other;
            return Intrinsics.areEqual(this.paymentId, settled.paymentId) && this.amountInMinor == settled.amountInMinor && Intrinsics.areEqual(this.currencyCode, settled.currencyCode) && Intrinsics.areEqual(this.paymentMethod, settled.paymentMethod) && Intrinsics.areEqual(this.authorizationFlow, settled.authorizationFlow) && Intrinsics.areEqual(this.user, settled.user) && Intrinsics.areEqual(this.relatedProducts, settled.relatedProducts) && Intrinsics.areEqual(this.creditableAt, settled.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            int iHashCode2 = (iHashCode + (authorizationFlow == null ? 0 : authorizationFlow.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode4 = (iHashCode3 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            String str = this.creditableAt;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Settled(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", paymentMethod=" + this.paymentMethod + ", authorizationFlow=" + this.authorizationFlow + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", creditableAt=" + this.creditableAt + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Settled$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Settled;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Settled> serializer() {
                return PaymentResponse7.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Settled(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("creditable_at") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, PaymentResponse7.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.paymentMethod = paymentMethod;
            if ((i & 16) == 0) {
                this.authorizationFlow = null;
            } else {
                this.authorizationFlow = authorizationFlow;
            }
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 64) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
            if ((i & 128) == 0) {
                this.creditableAt = null;
            } else {
                this.creditableAt = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Settled self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getPaymentMethod());
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.authorizationFlow != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AuthorizationFlow6.INSTANCE, self.authorizationFlow);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, User5.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.creditableAt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.creditableAt);
        }

        public /* synthetic */ Settled(String str, long j, String str2, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentMethod, (i & 16) != 0 ? null : authorizationFlow, (i & 32) != 0 ? null : user, (i & 64) != 0 ? null : relatedProducts, (i & 128) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Settled(String paymentId, long j, String currencyCode, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.creditableAt = str;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0002JKB\u0083\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0017J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jk\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010!R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010!R\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101¨\u0006L"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Failed;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "seen1", "", "paymentId", "", "amountInMinor", "", "currencyCode", "failureReason", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;", "paymentMethod", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "authorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "user", "Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "creditableAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/payments/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Ljava/lang/String;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()J", "getAuthorizationFlow$annotations", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/payments/entity/shared/AuthorizationFlow;", "getCreditableAt$annotations", "getCreditableAt", "()Ljava/lang/String;", "getCurrencyCode$annotations", "getCurrencyCode", "getFailureReason$annotations", "getFailureReason", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;", "getPaymentId$annotations", "getPaymentId", "getPaymentMethod$annotations", "getPaymentMethod", "()Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/payments/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("failed")
    public static final /* data */ class Failed extends PaymentResponse {
        private final long amountInMinor;
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final String currencyCode;
        private final PaymentFailureReason failureReason;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]), null, null, null, null};

        public static /* synthetic */ Failed copy$default(Failed failed, String str, long j, String str2, PaymentFailureReason paymentFailureReason, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.paymentId;
            }
            if ((i & 2) != 0) {
                j = failed.amountInMinor;
            }
            if ((i & 4) != 0) {
                str2 = failed.currencyCode;
            }
            if ((i & 8) != 0) {
                paymentFailureReason = failed.failureReason;
            }
            if ((i & 16) != 0) {
                paymentMethod = failed.paymentMethod;
            }
            if ((i & 32) != 0) {
                authorizationFlow = failed.authorizationFlow;
            }
            if ((i & 64) != 0) {
                user = failed.user;
            }
            if ((i & 128) != 0) {
                relatedProducts = failed.relatedProducts;
            }
            if ((i & 256) != 0) {
                str3 = failed.creditableAt;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            String str4 = str3;
            User user2 = user;
            PaymentMethod paymentMethod2 = paymentMethod;
            String str5 = str2;
            return failed.copy(str, j, str5, paymentFailureReason, paymentMethod2, authorizationFlow, user2, relatedProducts2, str4);
        }

        @SerialName("amount_in_minor")
        public static /* synthetic */ void getAmountInMinor$annotations() {
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("creditable_at")
        public static /* synthetic */ void getCreditableAt$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("failure_reason")
        public static /* synthetic */ void getFailureReason$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getPaymentId$annotations() {
        }

        @SerialName("payment_method")
        public static /* synthetic */ void getPaymentMethod$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component6, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component7, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component8, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final Failed copy(String paymentId, long amountInMinor, String currencyCode, PaymentFailureReason failureReason, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Failed(paymentId, amountInMinor, currencyCode, failureReason, paymentMethod, authorizationFlow, user, relatedProducts, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.paymentId, failed.paymentId) && this.amountInMinor == failed.amountInMinor && Intrinsics.areEqual(this.currencyCode, failed.currencyCode) && this.failureReason == failed.failureReason && Intrinsics.areEqual(this.paymentMethod, failed.paymentMethod) && Intrinsics.areEqual(this.authorizationFlow, failed.authorizationFlow) && Intrinsics.areEqual(this.user, failed.user) && Intrinsics.areEqual(this.relatedProducts, failed.relatedProducts) && Intrinsics.areEqual(this.creditableAt, failed.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.paymentId.hashCode() * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.currencyCode.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            int iHashCode2 = (iHashCode + (authorizationFlow == null ? 0 : authorizationFlow.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode4 = (iHashCode3 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            String str = this.creditableAt;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Failed(paymentId=" + this.paymentId + ", amountInMinor=" + this.amountInMinor + ", currencyCode=" + this.currencyCode + ", failureReason=" + this.failureReason + ", paymentMethod=" + this.paymentMethod + ", authorizationFlow=" + this.authorizationFlow + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", creditableAt=" + this.creditableAt + ")";
        }

        /* compiled from: PaymentResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Failed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Failed;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Failed> serializer() {
                return PaymentResponse6.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Failed(int i, @SerialName("id") String str, @SerialName("amount_in_minor") long j, @SerialName("currency") String str2, @SerialName("failure_reason") PaymentFailureReason paymentFailureReason, @SerialName("payment_method") PaymentMethod paymentMethod, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("creditable_at") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (31 != (i & 31)) {
                PluginExceptions.throwMissingFieldException(i, 31, PaymentResponse6.INSTANCE.getDescriptor());
            }
            this.paymentId = str;
            this.amountInMinor = j;
            this.currencyCode = str2;
            this.failureReason = paymentFailureReason;
            this.paymentMethod = paymentMethod;
            if ((i & 32) == 0) {
                this.authorizationFlow = null;
            } else {
                this.authorizationFlow = authorizationFlow;
            }
            if ((i & 64) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 128) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
            if ((i & 256) == 0) {
                this.creditableAt = null;
            } else {
                this.creditableAt = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Failed self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getPaymentId());
            output.encodeLongElement(serialDesc, 1, self.getAmountInMinor());
            output.encodeStringElement(serialDesc, 2, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 3, PaymentFailureReason2.INSTANCE, self.failureReason);
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.getPaymentMethod());
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.authorizationFlow != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AuthorizationFlow6.INSTANCE, self.authorizationFlow);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, User5.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.creditableAt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.creditableAt);
        }

        public /* synthetic */ Failed(String str, long j, String str2, PaymentFailureReason paymentFailureReason, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, paymentFailureReason, paymentMethod, (i & 32) != 0 ? null : authorizationFlow, (i & 64) != 0 ? null : user, (i & 128) != 0 ? null : relatedProducts, (i & 256) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public long getAmountInMinor() {
            return this.amountInMinor;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.response.PaymentResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String paymentId, long j, String currencyCode, PaymentFailureReason failureReason, PaymentMethod paymentMethod, AuthorizationFlow authorizationFlow, User user, RelatedProducts relatedProducts, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.amountInMinor = j;
            this.currencyCode = currencyCode;
            this.failureReason = failureReason;
            this.paymentMethod = paymentMethod;
            this.authorizationFlow = authorizationFlow;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.creditableAt = str;
        }
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$PaymentResponseSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentResponseSerializer extends JsonContentPolymorphicSerializer<PaymentResponse> {
        public static final PaymentResponseSerializer INSTANCE = new PaymentResponseSerializer();

        private PaymentResponseSerializer() {
            super(Reflection.getOrCreateKotlinClass(PaymentResponse.class));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
        @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected KSerializer2<PaymentResponse> selectDeserializer(JsonElement element) {
            JsonElement7 jsonPrimitive;
            String content;
            KSerializer2<PaymentResponse> kSerializer2Serializer;
            Intrinsics.checkNotNullParameter(element, "element");
            JsonElement jsonElement = (JsonElement) JsonElement3.getJsonObject(element).get((Object) "status");
            if (jsonElement != null && (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) != null && (content = jsonPrimitive.getContent()) != null) {
                switch (content.hashCode()) {
                    case -1500711525:
                        if (content.equals("authorized")) {
                            kSerializer2Serializer = Authorized.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                                return kSerializer2Serializer;
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case -1281977283:
                        if (content.equals("failed")) {
                            kSerializer2Serializer = Failed.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 6223013:
                        if (content.equals("authorization_required")) {
                            kSerializer2Serializer = AuthorizationRequired.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 722587238:
                        if (content.equals("authorizing")) {
                            kSerializer2Serializer = Authorizing.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 1985943673:
                        if (content.equals("settled")) {
                            kSerializer2Serializer = Settled.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 2043017103:
                        if (content.equals("executed")) {
                            kSerializer2Serializer = Executed.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    default:
                        throw new SerializationExceptions2("PaymentResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                }
            }
            throw new SerializationExceptions2("PaymentResponseSerializer: Missing 'status' key in " + element);
        }
    }

    private final com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodIntoDomain() {
        PaymentMethod paymentMethod = getPaymentMethod();
        if (paymentMethod instanceof BankTransfer) {
            long amountInMinor = getAmountInMinor();
            Beneficiary beneficiary = getPaymentMethod().getBeneficiary();
            com.truelayer.payments.core.domain.payments.Beneficiary beneficiaryIntoDomain2 = beneficiary != null ? beneficiary.intoDomain2() : null;
            ProviderSelection providerSelection = getPaymentMethod().getProviderSelection();
            Intrinsics.checkNotNull(providerSelection);
            return new PaymentMethod.BankTransfer(amountInMinor, beneficiaryIntoDomain2, providerSelection.intoDomain2());
        }
        if (!(paymentMethod instanceof Mandate)) {
            throw new NoWhenBranchMatchedException();
        }
        long amountInMinor2 = getAmountInMinor();
        com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod paymentMethod2 = getPaymentMethod();
        Intrinsics.checkNotNull(paymentMethod2, "null cannot be cast to non-null type com.truelayer.payments.core.network.payments.entity.shared.Mandate");
        return new PaymentMethod.PaymentOfMandate(amountInMinor2, null, ((Mandate) paymentMethod2).getReference(), 2, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public Payment intoDomain2() {
        if (this instanceof AuthorizationRequired) {
            String paymentId = getPaymentId();
            Currency currency = new Currency(getCurrencyCode(), null, 2, null);
            com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain = paymentMethodIntoDomain();
            String strPaymentReference = getPaymentMethod().paymentReference();
            User user = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain2 = user != null ? user.intoDomain2() : null;
            RelatedProducts relatedProducts = getRelatedProducts();
            return new Payment.AuthorizationRequired(paymentId, currency, paymentMethodPaymentMethodIntoDomain, strPaymentReference, userIntoDomain2, (relatedProducts != null ? relatedProducts.getSignupPlus() : null) != null, null);
        }
        if (this instanceof Authorizing) {
            String paymentId2 = getPaymentId();
            Currency currency2 = new Currency(getCurrencyCode(), null, 2, null);
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain2 = ((Authorizing) this).getAuthorizationFlow().intoDomain2();
            com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain2 = paymentMethodIntoDomain();
            String strPaymentReference2 = getPaymentMethod().paymentReference();
            User user2 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain22 = user2 != null ? user2.intoDomain2() : null;
            RelatedProducts relatedProducts2 = getRelatedProducts();
            return new Payment.Authorizing(paymentId2, currency2, paymentMethodPaymentMethodIntoDomain2, strPaymentReference2, userIntoDomain22, (relatedProducts2 != null ? relatedProducts2.getSignupPlus() : null) != null, null, authorizationFlowIntoDomain2);
        }
        if (this instanceof Authorized) {
            String paymentId3 = getPaymentId();
            Currency currency3 = new Currency(getCurrencyCode(), null, 2, null);
            Authorized authorized = (Authorized) this;
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain22 = authorized.getAuthorizationFlow().intoDomain2();
            com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain3 = paymentMethodIntoDomain();
            String strPaymentReference3 = getPaymentMethod().paymentReference();
            User user3 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain23 = user3 != null ? user3.intoDomain2() : null;
            RelatedProducts relatedProducts3 = getRelatedProducts();
            return new Payment.Authorized(paymentId3, currency3, paymentMethodPaymentMethodIntoDomain3, strPaymentReference3, userIntoDomain23, (relatedProducts3 != null ? relatedProducts3.getSignupPlus() : null) != null, authorized.getCreditableAt(), authorizationFlowIntoDomain22);
        }
        if (this instanceof Executed) {
            String paymentId4 = getPaymentId();
            Currency currency4 = new Currency(getCurrencyCode(), null, 2, null);
            Executed executed = (Executed) this;
            AuthorizationFlow authorizationFlow = executed.getAuthorizationFlow();
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain23 = authorizationFlow != null ? authorizationFlow.intoDomain2() : null;
            com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain4 = paymentMethodIntoDomain();
            String strPaymentReference4 = getPaymentMethod().paymentReference();
            User user4 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain24 = user4 != null ? user4.intoDomain2() : null;
            RelatedProducts relatedProducts4 = getRelatedProducts();
            return new Payment.Executed(paymentId4, currency4, paymentMethodPaymentMethodIntoDomain4, strPaymentReference4, userIntoDomain24, (relatedProducts4 != null ? relatedProducts4.getSignupPlus() : null) != null, executed.getCreditableAt(), authorizationFlowIntoDomain23);
        }
        if (this instanceof Settled) {
            String paymentId5 = getPaymentId();
            Currency currency5 = new Currency(getCurrencyCode(), null, 2, null);
            Settled settled = (Settled) this;
            AuthorizationFlow authorizationFlow2 = settled.getAuthorizationFlow();
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain24 = authorizationFlow2 != null ? authorizationFlow2.intoDomain2() : null;
            com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain5 = paymentMethodIntoDomain();
            String strPaymentReference5 = getPaymentMethod().paymentReference();
            User user5 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain25 = user5 != null ? user5.intoDomain2() : null;
            RelatedProducts relatedProducts5 = getRelatedProducts();
            return new Payment.Settled(paymentId5, currency5, paymentMethodPaymentMethodIntoDomain5, strPaymentReference5, userIntoDomain25, (relatedProducts5 != null ? relatedProducts5.getSignupPlus() : null) != null, settled.getCreditableAt(), authorizationFlowIntoDomain24);
        }
        if (!(this instanceof Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        String paymentId6 = getPaymentId();
        Currency currency6 = new Currency(getCurrencyCode(), null, 2, null);
        Failed failed = (Failed) this;
        com.truelayer.payments.core.domain.payments.PaymentFailureReason paymentFailureReasonIntoDomain2 = failed.getFailureReason().intoDomain2();
        AuthorizationFlow authorizationFlow3 = failed.getAuthorizationFlow();
        com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain25 = authorizationFlow3 != null ? authorizationFlow3.intoDomain2() : null;
        com.truelayer.payments.core.domain.payments.PaymentMethod paymentMethodPaymentMethodIntoDomain6 = paymentMethodIntoDomain();
        String strPaymentReference6 = getPaymentMethod().paymentReference();
        User user6 = getUser();
        com.truelayer.payments.core.domain.payments.User userIntoDomain26 = user6 != null ? user6.intoDomain2() : null;
        RelatedProducts relatedProducts6 = getRelatedProducts();
        return new Payment.Failed(paymentId6, currency6, paymentMethodPaymentMethodIntoDomain6, strPaymentReference6, paymentFailureReasonIntoDomain2, userIntoDomain26, (relatedProducts6 != null ? relatedProducts6.getSignupPlus() : null) != null, failed.getCreditableAt(), authorizationFlowIntoDomain25);
    }

    /* compiled from: PaymentResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Companion;", "Lcom/truelayer/payments/core/utils/JsonConverter;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion implements JsonConverter<PaymentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentResponse> serializer() {
            return PaymentResponseSerializer.INSTANCE;
        }
    }
}
