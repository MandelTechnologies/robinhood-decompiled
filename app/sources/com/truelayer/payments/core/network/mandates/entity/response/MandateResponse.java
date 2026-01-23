package com.truelayer.payments.core.network.mandates.entity.response;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow3;
import com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints3;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReason;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReason2;
import com.truelayer.payments.core.network.mandates.entity.shared.ProviderSelection;
import com.truelayer.payments.core.network.mandates.entity.shared.User;
import com.truelayer.payments.core.network.mandates.entity.shared.User4;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts2;
import com.truelayer.payments.core.utils.JsonConverter;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: MandateResponse.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007!\"#$%&'B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0002H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0005()*+,¨\u0006-"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "()V", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "id", "getId", "paymentReference", "getPaymentReference", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "intoDomain", "AuthorizationRequired", "Authorized", "Authorizing", "Companion", "Failed", "MandateResponseSerializer", "Revoked", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$AuthorizationRequired;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorized;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorizing;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Failed;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = MandateResponseSerializer.class)
/* loaded from: classes6.dex */
public abstract class MandateResponse implements IntoDomain<Payment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ MandateResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Beneficiary getBeneficiary();

    public abstract MandateConstraints getConstraints();

    public abstract String getCurrencyCode();

    public abstract String getId();

    public abstract String getPaymentReference();

    public abstract ProviderSelection getProviderSelection();

    public abstract RelatedProducts getRelatedProducts();

    public abstract User getUser();

    private MandateResponse() {
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002DEBy\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J_\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001J&\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BHÁ\u0001¢\u0006\u0002\bCR\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,¨\u0006F"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$AuthorizationRequired;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "seen1", "", "id", "", "currencyCode", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "paymentReference", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;)V", "getBeneficiary$annotations", "()V", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getConstraints$annotations", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getId$annotations", "getId", "getPaymentReference$annotations", "getPaymentReference", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorization_required")
    public static final /* data */ class AuthorizationRequired extends MandateResponse {
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final String currencyCode;
        private final String id;
        private final String paymentReference;
        private final ProviderSelection providerSelection;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, ProviderSelection.INSTANCE.serializer(), null, Beneficiary.INSTANCE.serializer(), null, null, null};

        public static /* synthetic */ AuthorizationRequired copy$default(AuthorizationRequired authorizationRequired, String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationRequired.id;
            }
            if ((i & 2) != 0) {
                str2 = authorizationRequired.currencyCode;
            }
            if ((i & 4) != 0) {
                providerSelection = authorizationRequired.providerSelection;
            }
            if ((i & 8) != 0) {
                mandateConstraints = authorizationRequired.constraints;
            }
            if ((i & 16) != 0) {
                beneficiary = authorizationRequired.beneficiary;
            }
            if ((i & 32) != 0) {
                str3 = authorizationRequired.paymentReference;
            }
            if ((i & 64) != 0) {
                user = authorizationRequired.user;
            }
            if ((i & 128) != 0) {
                relatedProducts = authorizationRequired.relatedProducts;
            }
            User user2 = user;
            RelatedProducts relatedProducts2 = relatedProducts;
            Beneficiary beneficiary2 = beneficiary;
            String str4 = str3;
            return authorizationRequired.copy(str, str2, providerSelection, mandateConstraints, beneficiary2, str4, user2, relatedProducts2);
        }

        @SerialName("beneficiary")
        public static /* synthetic */ void getBeneficiary$annotations() {
        }

        @SerialName("constraints")
        public static /* synthetic */ void getConstraints$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getPaymentReference$annotations() {
        }

        @SerialName("provider_selection")
        public static /* synthetic */ void getProviderSelection$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component5, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component7, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component8, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationRequired copy(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String paymentReference, User user, RelatedProducts relatedProducts) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            return new AuthorizationRequired(id, currencyCode, providerSelection, constraints, beneficiary, paymentReference, user, relatedProducts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationRequired)) {
                return false;
            }
            AuthorizationRequired authorizationRequired = (AuthorizationRequired) other;
            return Intrinsics.areEqual(this.id, authorizationRequired.id) && Intrinsics.areEqual(this.currencyCode, authorizationRequired.currencyCode) && Intrinsics.areEqual(this.providerSelection, authorizationRequired.providerSelection) && Intrinsics.areEqual(this.constraints, authorizationRequired.constraints) && Intrinsics.areEqual(this.beneficiary, authorizationRequired.beneficiary) && Intrinsics.areEqual(this.paymentReference, authorizationRequired.paymentReference) && Intrinsics.areEqual(this.user, authorizationRequired.user) && Intrinsics.areEqual(this.relatedProducts, authorizationRequired.relatedProducts);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.providerSelection.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            return iHashCode3 + (relatedProducts != null ? relatedProducts.hashCode() : 0);
        }

        public String toString() {
            return "AuthorizationRequired(id=" + this.id + ", currencyCode=" + this.currencyCode + ", providerSelection=" + this.providerSelection + ", constraints=" + this.constraints + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ")";
        }

        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$AuthorizationRequired$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$AuthorizationRequired;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AuthorizationRequired> serializer() {
                return MandateResponse2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ AuthorizationRequired(int i, @SerialName("id") String str, @SerialName("currency") String str2, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("constraints") MandateConstraints mandateConstraints, @SerialName("beneficiary") Beneficiary beneficiary, @SerialName("reference") String str3, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (31 != (i & 31)) {
                PluginExceptions.throwMissingFieldException(i, 31, MandateResponse2.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.currencyCode = str2;
            this.providerSelection = providerSelection;
            this.constraints = mandateConstraints;
            this.beneficiary = beneficiary;
            if ((i & 32) == 0) {
                this.paymentReference = null;
            } else {
                this.paymentReference = str3;
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
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(AuthorizationRequired self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.getProviderSelection());
            output.encodeSerializableElement(serialDesc, 3, MandateConstraints3.INSTANCE, self.getConstraints());
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.getBeneficiary());
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getPaymentReference() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getPaymentReference());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, User4.INSTANCE, self.getUser());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getRelatedProducts() == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 7, RelatedProducts2.INSTANCE, self.getRelatedProducts());
        }

        public /* synthetic */ AuthorizationRequired(String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, providerSelection, mandateConstraints, beneficiary, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : user, (i & 128) != 0 ? null : relatedProducts);
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizationRequired(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String str, User user, RelatedProducts relatedProducts) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.id = id;
            this.currencyCode = currencyCode;
            this.providerSelection = providerSelection;
            this.constraints = constraints;
            this.beneficiary = beneficiary;
            this.paymentReference = str;
            this.user = user;
            this.relatedProducts = relatedProducts;
        }
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0002JKB\u0085\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003Ji\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101¨\u0006L"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorizing;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "seen1", "", "id", "", "currencyCode", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "paymentReference", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "authorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;)V", "getAuthorizationFlow$annotations", "()V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "getBeneficiary$annotations", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getConstraints$annotations", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getId$annotations", "getId", "getPaymentReference$annotations", "getPaymentReference", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorizing")
    public static final /* data */ class Authorizing extends MandateResponse {
        private final AuthorizationFlow authorizationFlow;
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final String currencyCode;
        private final String id;
        private final String paymentReference;
        private final ProviderSelection providerSelection;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, ProviderSelection.INSTANCE.serializer(), null, Beneficiary.INSTANCE.serializer(), null, null, null, null};

        public static /* synthetic */ Authorizing copy$default(Authorizing authorizing, String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizing.id;
            }
            if ((i & 2) != 0) {
                str2 = authorizing.currencyCode;
            }
            if ((i & 4) != 0) {
                providerSelection = authorizing.providerSelection;
            }
            if ((i & 8) != 0) {
                mandateConstraints = authorizing.constraints;
            }
            if ((i & 16) != 0) {
                beneficiary = authorizing.beneficiary;
            }
            if ((i & 32) != 0) {
                str3 = authorizing.paymentReference;
            }
            if ((i & 64) != 0) {
                user = authorizing.user;
            }
            if ((i & 128) != 0) {
                relatedProducts = authorizing.relatedProducts;
            }
            if ((i & 256) != 0) {
                authorizationFlow = authorizing.authorizationFlow;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            String str4 = str3;
            User user2 = user;
            Beneficiary beneficiary2 = beneficiary;
            ProviderSelection providerSelection2 = providerSelection;
            return authorizing.copy(str, str2, providerSelection2, mandateConstraints, beneficiary2, str4, user2, relatedProducts2, authorizationFlow2);
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("beneficiary")
        public static /* synthetic */ void getBeneficiary$annotations() {
        }

        @SerialName("constraints")
        public static /* synthetic */ void getConstraints$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getPaymentReference$annotations() {
        }

        @SerialName("provider_selection")
        public static /* synthetic */ void getProviderSelection$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component5, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
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
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorizing copy(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String paymentReference, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorizing(id, currencyCode, providerSelection, constraints, beneficiary, paymentReference, user, relatedProducts, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorizing)) {
                return false;
            }
            Authorizing authorizing = (Authorizing) other;
            return Intrinsics.areEqual(this.id, authorizing.id) && Intrinsics.areEqual(this.currencyCode, authorizing.currencyCode) && Intrinsics.areEqual(this.providerSelection, authorizing.providerSelection) && Intrinsics.areEqual(this.constraints, authorizing.constraints) && Intrinsics.areEqual(this.beneficiary, authorizing.beneficiary) && Intrinsics.areEqual(this.paymentReference, authorizing.paymentReference) && Intrinsics.areEqual(this.user, authorizing.user) && Intrinsics.areEqual(this.relatedProducts, authorizing.relatedProducts) && Intrinsics.areEqual(this.authorizationFlow, authorizing.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.providerSelection.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            return ((iHashCode3 + (relatedProducts != null ? relatedProducts.hashCode() : 0)) * 31) + this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorizing(id=" + this.id + ", currencyCode=" + this.currencyCode + ", providerSelection=" + this.providerSelection + ", constraints=" + this.constraints + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorizing$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorizing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Authorizing> serializer() {
                return MandateResponse4.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Authorizing(int i, @SerialName("id") String str, @SerialName("currency") String str2, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("constraints") MandateConstraints mandateConstraints, @SerialName("beneficiary") Beneficiary beneficiary, @SerialName("reference") String str3, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (287 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE)) {
                PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, MandateResponse4.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.currencyCode = str2;
            this.providerSelection = providerSelection;
            this.constraints = mandateConstraints;
            this.beneficiary = beneficiary;
            if ((i & 32) == 0) {
                this.paymentReference = null;
            } else {
                this.paymentReference = str3;
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
            this.authorizationFlow = authorizationFlow;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Authorizing self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.getProviderSelection());
            output.encodeSerializableElement(serialDesc, 3, MandateConstraints3.INSTANCE, self.getConstraints());
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.getBeneficiary());
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getPaymentReference() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getPaymentReference());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, User4.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            output.encodeSerializableElement(serialDesc, 8, AuthorizationFlow3.INSTANCE, self.authorizationFlow);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Authorizing(String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            AuthorizationFlow authorizationFlow2;
            RelatedProducts relatedProducts2;
            str3 = (i & 32) != 0 ? null : str3;
            user = (i & 64) != 0 ? null : user;
            if ((i & 128) != 0) {
                authorizationFlow2 = authorizationFlow;
                relatedProducts2 = null;
            } else {
                authorizationFlow2 = authorizationFlow;
                relatedProducts2 = relatedProducts;
            }
            this(str, str2, providerSelection, mandateConstraints, beneficiary, str3, user, relatedProducts2, authorizationFlow2);
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authorizing(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String str, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.id = id;
            this.currencyCode = currencyCode;
            this.providerSelection = providerSelection;
            this.constraints = constraints;
            this.beneficiary = beneficiary;
            this.paymentReference = str;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.authorizationFlow = authorizationFlow;
        }
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0002JKB\u0085\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003Ji\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101¨\u0006L"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorized;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "seen1", "", "id", "", "currencyCode", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "paymentReference", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "authorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;)V", "getAuthorizationFlow$annotations", "()V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "getBeneficiary$annotations", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getConstraints$annotations", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getId$annotations", "getId", "getPaymentReference$annotations", "getPaymentReference", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("authorized")
    public static final /* data */ class Authorized extends MandateResponse {
        private final AuthorizationFlow authorizationFlow;
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final String currencyCode;
        private final String id;
        private final String paymentReference;
        private final ProviderSelection providerSelection;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, ProviderSelection.INSTANCE.serializer(), null, Beneficiary.INSTANCE.serializer(), null, null, null, null};

        public static /* synthetic */ Authorized copy$default(Authorized authorized, String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorized.id;
            }
            if ((i & 2) != 0) {
                str2 = authorized.currencyCode;
            }
            if ((i & 4) != 0) {
                providerSelection = authorized.providerSelection;
            }
            if ((i & 8) != 0) {
                mandateConstraints = authorized.constraints;
            }
            if ((i & 16) != 0) {
                beneficiary = authorized.beneficiary;
            }
            if ((i & 32) != 0) {
                str3 = authorized.paymentReference;
            }
            if ((i & 64) != 0) {
                user = authorized.user;
            }
            if ((i & 128) != 0) {
                relatedProducts = authorized.relatedProducts;
            }
            if ((i & 256) != 0) {
                authorizationFlow = authorized.authorizationFlow;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            String str4 = str3;
            User user2 = user;
            Beneficiary beneficiary2 = beneficiary;
            ProviderSelection providerSelection2 = providerSelection;
            return authorized.copy(str, str2, providerSelection2, mandateConstraints, beneficiary2, str4, user2, relatedProducts2, authorizationFlow2);
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("beneficiary")
        public static /* synthetic */ void getBeneficiary$annotations() {
        }

        @SerialName("constraints")
        public static /* synthetic */ void getConstraints$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getPaymentReference$annotations() {
        }

        @SerialName("provider_selection")
        public static /* synthetic */ void getProviderSelection$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component5, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
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
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorized copy(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String paymentReference, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorized(id, currencyCode, providerSelection, constraints, beneficiary, paymentReference, user, relatedProducts, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorized)) {
                return false;
            }
            Authorized authorized = (Authorized) other;
            return Intrinsics.areEqual(this.id, authorized.id) && Intrinsics.areEqual(this.currencyCode, authorized.currencyCode) && Intrinsics.areEqual(this.providerSelection, authorized.providerSelection) && Intrinsics.areEqual(this.constraints, authorized.constraints) && Intrinsics.areEqual(this.beneficiary, authorized.beneficiary) && Intrinsics.areEqual(this.paymentReference, authorized.paymentReference) && Intrinsics.areEqual(this.user, authorized.user) && Intrinsics.areEqual(this.relatedProducts, authorized.relatedProducts) && Intrinsics.areEqual(this.authorizationFlow, authorized.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.providerSelection.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            return ((iHashCode3 + (relatedProducts != null ? relatedProducts.hashCode() : 0)) * 31) + this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorized(id=" + this.id + ", currencyCode=" + this.currencyCode + ", providerSelection=" + this.providerSelection + ", constraints=" + this.constraints + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorized$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Authorized;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Authorized> serializer() {
                return MandateResponse3.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Authorized(int i, @SerialName("id") String str, @SerialName("currency") String str2, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("constraints") MandateConstraints mandateConstraints, @SerialName("beneficiary") Beneficiary beneficiary, @SerialName("reference") String str3, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (287 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE)) {
                PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, MandateResponse3.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.currencyCode = str2;
            this.providerSelection = providerSelection;
            this.constraints = mandateConstraints;
            this.beneficiary = beneficiary;
            if ((i & 32) == 0) {
                this.paymentReference = null;
            } else {
                this.paymentReference = str3;
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
            this.authorizationFlow = authorizationFlow;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Authorized self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.getProviderSelection());
            output.encodeSerializableElement(serialDesc, 3, MandateConstraints3.INSTANCE, self.getConstraints());
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.getBeneficiary());
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getPaymentReference() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getPaymentReference());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, User4.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            output.encodeSerializableElement(serialDesc, 8, AuthorizationFlow3.INSTANCE, self.authorizationFlow);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Authorized(String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            AuthorizationFlow authorizationFlow2;
            RelatedProducts relatedProducts2;
            str3 = (i & 32) != 0 ? null : str3;
            user = (i & 64) != 0 ? null : user;
            if ((i & 128) != 0) {
                authorizationFlow2 = authorizationFlow;
                relatedProducts2 = null;
            } else {
                authorizationFlow2 = authorizationFlow;
                relatedProducts2 = relatedProducts;
            }
            this(str, str2, providerSelection, mandateConstraints, beneficiary, str3, user, relatedProducts2, authorizationFlow2);
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authorized(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String str, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.id = id;
            this.currencyCode = currencyCode;
            this.providerSelection = providerSelection;
            this.constraints = constraints;
            this.beneficiary = beneficiary;
            this.paymentReference = str;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.authorizationFlow = authorizationFlow;
        }
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 Q2\u00020\u0001:\u0002PQB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018Be\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0019J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ju\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001J&\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NHÁ\u0001¢\u0006\u0002\bOR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010&R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010&R\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u00103R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106¨\u0006R"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Failed;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "seen1", "", "id", "", "currencyCode", "failureReason", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "paymentReference", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "authorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;)V", "getAuthorizationFlow$annotations", "()V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "getBeneficiary$annotations", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getConstraints$annotations", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getFailureReason$annotations", "getFailureReason", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;", "getId$annotations", "getId", "getPaymentReference$annotations", "getPaymentReference", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("failed")
    public static final /* data */ class Failed extends MandateResponse {
        private final AuthorizationFlow authorizationFlow;
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final String currencyCode;
        private final MandateFailureReason failureReason;
        private final String id;
        private final String paymentReference;
        private final ProviderSelection providerSelection;
        private final RelatedProducts relatedProducts;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, ProviderSelection.INSTANCE.serializer(), null, Beneficiary.INSTANCE.serializer(), null, null, null, null};

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, MandateFailureReason mandateFailureReason, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.id;
            }
            if ((i & 2) != 0) {
                str2 = failed.currencyCode;
            }
            if ((i & 4) != 0) {
                mandateFailureReason = failed.failureReason;
            }
            if ((i & 8) != 0) {
                providerSelection = failed.providerSelection;
            }
            if ((i & 16) != 0) {
                mandateConstraints = failed.constraints;
            }
            if ((i & 32) != 0) {
                beneficiary = failed.beneficiary;
            }
            if ((i & 64) != 0) {
                str3 = failed.paymentReference;
            }
            if ((i & 128) != 0) {
                user = failed.user;
            }
            if ((i & 256) != 0) {
                relatedProducts = failed.relatedProducts;
            }
            if ((i & 512) != 0) {
                authorizationFlow = failed.authorizationFlow;
            }
            RelatedProducts relatedProducts2 = relatedProducts;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            String str4 = str3;
            User user2 = user;
            MandateConstraints mandateConstraints2 = mandateConstraints;
            Beneficiary beneficiary2 = beneficiary;
            return failed.copy(str, str2, mandateFailureReason, providerSelection, mandateConstraints2, beneficiary2, str4, user2, relatedProducts2, authorizationFlow2);
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("beneficiary")
        public static /* synthetic */ void getBeneficiary$annotations() {
        }

        @SerialName("constraints")
        public static /* synthetic */ void getConstraints$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("failure_reason")
        public static /* synthetic */ void getFailureReason$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getPaymentReference$annotations() {
        }

        @SerialName("provider_selection")
        public static /* synthetic */ void getProviderSelection$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final MandateFailureReason getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component4, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component5, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component6, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component8, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component9, reason: from getter */
        public final RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final Failed copy(String id, String currencyCode, MandateFailureReason failureReason, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String paymentReference, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            return new Failed(id, currencyCode, failureReason, providerSelection, constraints, beneficiary, paymentReference, user, relatedProducts, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.id, failed.id) && Intrinsics.areEqual(this.currencyCode, failed.currencyCode) && this.failureReason == failed.failureReason && Intrinsics.areEqual(this.providerSelection, failed.providerSelection) && Intrinsics.areEqual(this.constraints, failed.constraints) && Intrinsics.areEqual(this.beneficiary, failed.beneficiary) && Intrinsics.areEqual(this.paymentReference, failed.paymentReference) && Intrinsics.areEqual(this.user, failed.user) && Intrinsics.areEqual(this.relatedProducts, failed.relatedProducts) && Intrinsics.areEqual(this.authorizationFlow, failed.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.providerSelection.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode4 = (iHashCode3 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            return iHashCode4 + (authorizationFlow != null ? authorizationFlow.hashCode() : 0);
        }

        public String toString() {
            return "Failed(id=" + this.id + ", currencyCode=" + this.currencyCode + ", failureReason=" + this.failureReason + ", providerSelection=" + this.providerSelection + ", constraints=" + this.constraints + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Failed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Failed;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Failed> serializer() {
                return MandateResponse5.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Failed(int i, @SerialName("id") String str, @SerialName("currency") String str2, @SerialName("failure_reason") MandateFailureReason mandateFailureReason, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("constraints") MandateConstraints mandateConstraints, @SerialName("beneficiary") Beneficiary beneficiary, @SerialName("reference") String str3, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (63 != (i & 63)) {
                PluginExceptions.throwMissingFieldException(i, 63, MandateResponse5.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.currencyCode = str2;
            this.failureReason = mandateFailureReason;
            this.providerSelection = providerSelection;
            this.constraints = mandateConstraints;
            this.beneficiary = beneficiary;
            if ((i & 64) == 0) {
                this.paymentReference = null;
            } else {
                this.paymentReference = str3;
            }
            if ((i & 128) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 256) == 0) {
                this.relatedProducts = null;
            } else {
                this.relatedProducts = relatedProducts;
            }
            if ((i & 512) == 0) {
                this.authorizationFlow = null;
            } else {
                this.authorizationFlow = authorizationFlow;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Failed self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 2, MandateFailureReason2.INSTANCE, self.failureReason);
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.getProviderSelection());
            output.encodeSerializableElement(serialDesc, 4, MandateConstraints3.INSTANCE, self.getConstraints());
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.getBeneficiary());
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getPaymentReference() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.getPaymentReference());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, User4.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.authorizationFlow == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 9, AuthorizationFlow3.INSTANCE, self.authorizationFlow);
        }

        public /* synthetic */ Failed(String str, String str2, MandateFailureReason mandateFailureReason, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, mandateFailureReason, providerSelection, mandateConstraints, beneficiary, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : user, (i & 256) != 0 ? null : relatedProducts, (i & 512) != 0 ? null : authorizationFlow);
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public final MandateFailureReason getFailureReason() {
            return this.failureReason;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String id, String currencyCode, MandateFailureReason failureReason, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String str, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.id = id;
            this.currencyCode = currencyCode;
            this.failureReason = failureReason;
            this.providerSelection = providerSelection;
            this.constraints = constraints;
            this.beneficiary = beneficiary;
            this.paymentReference = str;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.authorizationFlow = authorizationFlow;
        }
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 Q2\u00020\u0001:\u0003PQRB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018Be\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0019J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ju\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001J&\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NHÁ\u0001¢\u0006\u0002\bOR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010&R\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u00103R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106¨\u0006S"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "seen1", "", "id", "", "currencyCode", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "constraints", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "paymentReference", "user", "Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "relatedProducts", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "authorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "revocationSource", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/shared/User;Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;)V", "getAuthorizationFlow$annotations", "()V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "getBeneficiary$annotations", "getBeneficiary", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/Beneficiary;", "getConstraints$annotations", "getConstraints", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "getCurrencyCode$annotations", "getCurrencyCode", "()Ljava/lang/String;", "getId$annotations", "getId", "getPaymentReference$annotations", "getPaymentReference", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "getRelatedProducts$annotations", "getRelatedProducts", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "getRevocationSource$annotations", "getRevocationSource", "()Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;", "getUser$annotations", "getUser", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/User;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "RevocationSource", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("revoked")
    public static final /* data */ class Revoked extends MandateResponse {
        private final AuthorizationFlow authorizationFlow;
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final String currencyCode;
        private final String id;
        private final String paymentReference;
        private final ProviderSelection providerSelection;
        private final RelatedProducts relatedProducts;
        private final RevocationSource revocationSource;
        private final User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, ProviderSelection.INSTANCE.serializer(), null, Beneficiary.INSTANCE.serializer(), null, null, null, null, RevocationSource.INSTANCE.serializer()};

        public static /* synthetic */ Revoked copy$default(Revoked revoked, String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, RevocationSource revocationSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = revoked.id;
            }
            if ((i & 2) != 0) {
                str2 = revoked.currencyCode;
            }
            if ((i & 4) != 0) {
                providerSelection = revoked.providerSelection;
            }
            if ((i & 8) != 0) {
                mandateConstraints = revoked.constraints;
            }
            if ((i & 16) != 0) {
                beneficiary = revoked.beneficiary;
            }
            if ((i & 32) != 0) {
                str3 = revoked.paymentReference;
            }
            if ((i & 64) != 0) {
                user = revoked.user;
            }
            if ((i & 128) != 0) {
                relatedProducts = revoked.relatedProducts;
            }
            if ((i & 256) != 0) {
                authorizationFlow = revoked.authorizationFlow;
            }
            if ((i & 512) != 0) {
                revocationSource = revoked.revocationSource;
            }
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            RevocationSource revocationSource2 = revocationSource;
            User user2 = user;
            RelatedProducts relatedProducts2 = relatedProducts;
            Beneficiary beneficiary2 = beneficiary;
            String str4 = str3;
            return revoked.copy(str, str2, providerSelection, mandateConstraints, beneficiary2, str4, user2, relatedProducts2, authorizationFlow2, revocationSource2);
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        @SerialName("beneficiary")
        public static /* synthetic */ void getBeneficiary$annotations() {
        }

        @SerialName("constraints")
        public static /* synthetic */ void getConstraints$annotations() {
        }

        @SerialName("currency")
        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("reference")
        public static /* synthetic */ void getPaymentReference$annotations() {
        }

        @SerialName("provider_selection")
        public static /* synthetic */ void getProviderSelection$annotations() {
        }

        @SerialName("related_products")
        public static /* synthetic */ void getRelatedProducts$annotations() {
        }

        @SerialName("revocation_source")
        public static /* synthetic */ void getRevocationSource$annotations() {
        }

        @SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final RevocationSource getRevocationSource() {
            return this.revocationSource;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component5, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
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
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Revoked copy(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String paymentReference, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, RevocationSource revocationSource) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(revocationSource, "revocationSource");
            return new Revoked(id, currencyCode, providerSelection, constraints, beneficiary, paymentReference, user, relatedProducts, authorizationFlow, revocationSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Revoked)) {
                return false;
            }
            Revoked revoked = (Revoked) other;
            return Intrinsics.areEqual(this.id, revoked.id) && Intrinsics.areEqual(this.currencyCode, revoked.currencyCode) && Intrinsics.areEqual(this.providerSelection, revoked.providerSelection) && Intrinsics.areEqual(this.constraints, revoked.constraints) && Intrinsics.areEqual(this.beneficiary, revoked.beneficiary) && Intrinsics.areEqual(this.paymentReference, revoked.paymentReference) && Intrinsics.areEqual(this.user, revoked.user) && Intrinsics.areEqual(this.relatedProducts, revoked.relatedProducts) && Intrinsics.areEqual(this.authorizationFlow, revoked.authorizationFlow) && this.revocationSource == revoked.revocationSource;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.providerSelection.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
            RelatedProducts relatedProducts = this.relatedProducts;
            int iHashCode4 = (iHashCode3 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            return ((iHashCode4 + (authorizationFlow != null ? authorizationFlow.hashCode() : 0)) * 31) + this.revocationSource.hashCode();
        }

        public String toString() {
            return "Revoked(id=" + this.id + ", currencyCode=" + this.currencyCode + ", providerSelection=" + this.providerSelection + ", constraints=" + this.constraints + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", relatedProducts=" + this.relatedProducts + ", authorizationFlow=" + this.authorizationFlow + ", revocationSource=" + this.revocationSource + ")";
        }

        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Revoked> serializer() {
                return MandateResponse6.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Revoked(int i, @SerialName("id") String str, @SerialName("currency") String str2, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("constraints") MandateConstraints mandateConstraints, @SerialName("beneficiary") Beneficiary beneficiary, @SerialName("reference") String str3, @SerialName("user") User user, @SerialName("related_products") RelatedProducts relatedProducts, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, @SerialName("revocation_source") RevocationSource revocationSource, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (543 != (i & 543)) {
                PluginExceptions.throwMissingFieldException(i, 543, MandateResponse6.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.currencyCode = str2;
            this.providerSelection = providerSelection;
            this.constraints = mandateConstraints;
            this.beneficiary = beneficiary;
            if ((i & 32) == 0) {
                this.paymentReference = null;
            } else {
                this.paymentReference = str3;
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
                this.authorizationFlow = null;
            } else {
                this.authorizationFlow = authorizationFlow;
            }
            this.revocationSource = revocationSource;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Revoked self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getCurrencyCode());
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.getProviderSelection());
            output.encodeSerializableElement(serialDesc, 3, MandateConstraints3.INSTANCE, self.getConstraints());
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.getBeneficiary());
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getPaymentReference() != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getPaymentReference());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getUser() != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, User4.INSTANCE, self.getUser());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getRelatedProducts() != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, RelatedProducts2.INSTANCE, self.getRelatedProducts());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.authorizationFlow != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, AuthorizationFlow3.INSTANCE, self.authorizationFlow);
            }
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.revocationSource);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Revoked(String str, String str2, ProviderSelection providerSelection, MandateConstraints mandateConstraints, Beneficiary beneficiary, String str3, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, RevocationSource revocationSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            RevocationSource revocationSource2;
            AuthorizationFlow authorizationFlow2;
            str3 = (i & 32) != 0 ? null : str3;
            user = (i & 64) != 0 ? null : user;
            relatedProducts = (i & 128) != 0 ? null : relatedProducts;
            if ((i & 256) != 0) {
                revocationSource2 = revocationSource;
                authorizationFlow2 = null;
            } else {
                revocationSource2 = revocationSource;
                authorizationFlow2 = authorizationFlow;
            }
            this(str, str2, providerSelection, mandateConstraints, beneficiary, str3, user, relatedProducts, authorizationFlow2, revocationSource2);
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.network.mandates.entity.response.MandateResponse
        public RelatedProducts getRelatedProducts() {
            return this.relatedProducts;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MandateResponse.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;", "", "(Ljava/lang/String;I)V", "Client", "Provider", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final class RevocationSource {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ RevocationSource[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;

            @SerialName("client")
            public static final RevocationSource Client = new RevocationSource("Client", 0);

            @SerialName("provider")
            public static final RevocationSource Provider = new RevocationSource("Provider", 1);

            private static final /* synthetic */ RevocationSource[] $values() {
                return new RevocationSource[]{Client, Provider};
            }

            public static EnumEntries<RevocationSource> getEntries() {
                return $ENTRIES;
            }

            public static RevocationSource valueOf(String str) {
                return (RevocationSource) Enum.valueOf(RevocationSource.class, str);
            }

            public static RevocationSource[] values() {
                return (RevocationSource[]) $VALUES.clone();
            }

            /* compiled from: MandateResponse.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked$RevocationSource;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return (KSerializer) RevocationSource.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer<RevocationSource> serializer() {
                    return get$cachedSerializer();
                }
            }

            private RevocationSource(String str, int i) {
            }

            static {
                RevocationSource[] revocationSourceArr$values = $values();
                $VALUES = revocationSourceArr$values;
                $ENTRIES = EnumEntries2.enumEntries(revocationSourceArr$values);
                INSTANCE = new Companion(null);
                $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.response.MandateResponse.Revoked.RevocationSource.Companion.1
                    @Override // kotlin.jvm.functions.Function0
                    public final KSerializer<Object> invoke() {
                        return Enums4.createAnnotatedEnumSerializer("com.truelayer.payments.core.network.mandates.entity.response.MandateResponse.Revoked.RevocationSource", RevocationSource.values(), new String[]{"client", "provider"}, new Annotation[][]{null, null}, null);
                    }
                });
            }
        }

        public final RevocationSource getRevocationSource() {
            return this.revocationSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Revoked(String id, String currencyCode, ProviderSelection providerSelection, MandateConstraints constraints, Beneficiary beneficiary, String str, User user, RelatedProducts relatedProducts, AuthorizationFlow authorizationFlow, RevocationSource revocationSource) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(revocationSource, "revocationSource");
            this.id = id;
            this.currencyCode = currencyCode;
            this.providerSelection = providerSelection;
            this.constraints = constraints;
            this.beneficiary = beneficiary;
            this.paymentReference = str;
            this.user = user;
            this.relatedProducts = relatedProducts;
            this.authorizationFlow = authorizationFlow;
            this.revocationSource = revocationSource;
        }
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$MandateResponseSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class MandateResponseSerializer extends JsonContentPolymorphicSerializer<MandateResponse> {
        public static final MandateResponseSerializer INSTANCE = new MandateResponseSerializer();

        private MandateResponseSerializer() {
            super(Reflection.getOrCreateKotlinClass(MandateResponse.class));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected KSerializer2<MandateResponse> selectDeserializer(JsonElement element) {
            JsonElement7 jsonPrimitive;
            String content;
            KSerializer2<MandateResponse> kSerializer2Serializer;
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
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case -1281977283:
                        if (content.equals("failed")) {
                            kSerializer2Serializer = Failed.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 6223013:
                        if (content.equals("authorization_required")) {
                            kSerializer2Serializer = AuthorizationRequired.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 722587238:
                        if (content.equals("authorizing")) {
                            kSerializer2Serializer = Authorizing.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    case 1100137118:
                        if (content.equals("revoked")) {
                            kSerializer2Serializer = Revoked.INSTANCE.serializer();
                            if (kSerializer2Serializer != null) {
                            }
                        }
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    default:
                        throw new SerializationExceptions2("MandateResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                }
            }
            throw new SerializationExceptions2("MandateResponseSerializer: Missing 'status' key in " + element);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public Payment intoDomain2() {
        RelatedProducts.SignupPlus signupPlus;
        com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain2;
        PaymentMethod.Mandate mandate = new PaymentMethod.Mandate(getConstraints().intoDomain2(), getProviderSelection().intoDomain2(), getBeneficiary().intoDomain2());
        if (this instanceof AuthorizationRequired) {
            boolean z = false;
            String id = getId();
            Currency currency = new Currency(getCurrencyCode(), null, 2, null);
            String paymentReference = getPaymentReference();
            User user = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain2 = user != null ? user.intoDomain2() : null;
            RelatedProducts relatedProducts = getRelatedProducts();
            if ((relatedProducts != null ? relatedProducts.getSignupPlus() : null) != null) {
                z = true;
            }
            return new Payment.AuthorizationRequired(id, currency, mandate, paymentReference, userIntoDomain2, z, null);
        }
        boolean z2 = false;
        boolean z3 = true;
        if (this instanceof Authorizing) {
            String id2 = getId();
            Currency currency2 = new Currency(getCurrencyCode(), null, 2, null);
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain22 = ((Authorizing) this).getAuthorizationFlow().intoDomain2();
            String paymentReference2 = getPaymentReference();
            User user2 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain22 = user2 != null ? user2.intoDomain2() : null;
            RelatedProducts relatedProducts2 = getRelatedProducts();
            if ((relatedProducts2 != null ? relatedProducts2.getSignupPlus() : null) != null) {
                z2 = true;
            }
            return new Payment.Authorizing(id2, currency2, mandate, paymentReference2, userIntoDomain22, z2, null, authorizationFlowIntoDomain22);
        }
        if (this instanceof Authorized) {
            String id3 = getId();
            Currency currency3 = new Currency(getCurrencyCode(), null, 2, null);
            com.truelayer.payments.core.domain.payments.AuthorizationFlow authorizationFlowIntoDomain23 = ((Authorized) this).getAuthorizationFlow().intoDomain2();
            String paymentReference3 = getPaymentReference();
            User user3 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain23 = user3 != null ? user3.intoDomain2() : null;
            RelatedProducts relatedProducts3 = getRelatedProducts();
            if ((relatedProducts3 != null ? relatedProducts3.getSignupPlus() : null) != null) {
                z2 = true;
            }
            return new Payment.Authorized(id3, currency3, mandate, paymentReference3, userIntoDomain23, z2, null, authorizationFlowIntoDomain23);
        }
        if (this instanceof Failed) {
            String id4 = getId();
            Currency currency4 = new Currency(getCurrencyCode(), null, 2, null);
            Failed failed = (Failed) this;
            PaymentFailureReason paymentFailureReasonIntoDomain2 = failed.getFailureReason().intoDomain2();
            AuthorizationFlow authorizationFlow = failed.getAuthorizationFlow();
            if (authorizationFlow != null) {
                authorizationFlowIntoDomain2 = authorizationFlow.intoDomain2();
                signupPlus = null;
            } else {
                signupPlus = null;
                authorizationFlowIntoDomain2 = null;
            }
            String paymentReference4 = getPaymentReference();
            User user4 = getUser();
            com.truelayer.payments.core.domain.payments.User userIntoDomain24 = user4 != null ? user4.intoDomain2() : signupPlus;
            RelatedProducts relatedProducts4 = getRelatedProducts();
            if (relatedProducts4 != null) {
                signupPlus = relatedProducts4.getSignupPlus();
            }
            if (signupPlus == null) {
                z3 = false;
            }
            return new Payment.Failed(id4, currency4, mandate, paymentReference4, paymentFailureReasonIntoDomain2, userIntoDomain24, z3, null, authorizationFlowIntoDomain2);
        }
        if (!(this instanceof Revoked)) {
            throw new NoWhenBranchMatchedException();
        }
        String id5 = getId();
        RelatedProducts.SignupPlus signupPlus2 = null;
        Currency currency5 = new Currency(getCurrencyCode(), null, 2, null);
        String paymentReference5 = getPaymentReference();
        User user5 = getUser();
        com.truelayer.payments.core.domain.payments.User userIntoDomain25 = user5 != null ? user5.intoDomain2() : null;
        RelatedProducts relatedProducts5 = getRelatedProducts();
        if (relatedProducts5 != null) {
            signupPlus2 = relatedProducts5.getSignupPlus();
        }
        if (signupPlus2 != null) {
            z2 = true;
        }
        return new Payment.Revoked(id5, currency5, mandate, paymentReference5, userIntoDomain25, z2, null);
    }

    /* compiled from: MandateResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Companion;", "Lcom/truelayer/payments/core/utils/JsonConverter;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion implements JsonConverter<MandateResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MandateResponse> serializer() {
            return MandateResponseSerializer.INSTANCE;
        }
    }
}
