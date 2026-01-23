package com.truelayer.payments.core.network.mandates.entity.response;

import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: MandateAuthorizationFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "()V", "intoDomain", "AuthorizationFailed", "AuthorizationFlowResponseSerializer", "Authorizing", "Companion", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$AuthorizationFailed;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$Authorizing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = AuthorizationFlowResponseSerializer.class)
/* loaded from: classes6.dex */
public abstract class MandateAuthorizationFlowResponse implements IntoDomain<AuthorizationFlowResponse> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ MandateAuthorizationFlowResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MandateAuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MandateAuthorizationFlowResponse> serializer() {
            return AuthorizationFlowResponseSerializer.INSTANCE;
        }
    }

    /* compiled from: MandateAuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$Authorizing;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "seen1", "", "authorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;)V", "getAuthorizationFlow$annotations", "()V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Authorizing extends MandateAuthorizationFlowResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AuthorizationFlow authorizationFlow;

        public static /* synthetic */ Authorizing copy$default(Authorizing authorizing, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationFlow = authorizing.authorizationFlow;
            }
            return authorizing.copy(authorizationFlow);
        }

        @SerialName("authorization_flow")
        public static /* synthetic */ void getAuthorizationFlow$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorizing copy(AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorizing(authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Authorizing) && Intrinsics.areEqual(this.authorizationFlow, ((Authorizing) other).authorizationFlow);
        }

        public int hashCode() {
            return this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorizing(authorizationFlow=" + this.authorizationFlow + ")";
        }

        /* compiled from: MandateAuthorizationFlowResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$Authorizing$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$Authorizing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Authorizing> serializer() {
                return MandateAuthorizationFlowResponse3.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Authorizing(int i, @SerialName("authorization_flow") AuthorizationFlow authorizationFlow, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, MandateAuthorizationFlowResponse3.INSTANCE.getDescriptor());
            }
            this.authorizationFlow = authorizationFlow;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authorizing(AuthorizationFlow authorizationFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.authorizationFlow = authorizationFlow;
        }
    }

    private MandateAuthorizationFlowResponse() {
    }

    /* compiled from: MandateAuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\r\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R \u0010\u0004\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$AuthorizationFailed;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "seen1", "", "failureReason", "", "Lcom/truelayer/payments/core/network/mandates/entity/response/AuthorizationFailureReason;", "failureStage", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getFailureReason$annotations", "()V", "getFailureReason", "()Ljava/lang/String;", "getFailureStage$annotations", "getFailureStage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class AuthorizationFailed extends MandateAuthorizationFlowResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String failureReason;
        private final String failureStage;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthorizationFailed() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AuthorizationFailed copy$default(AuthorizationFailed authorizationFailed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationFailed.failureReason;
            }
            if ((i & 2) != 0) {
                str2 = authorizationFailed.failureStage;
            }
            return authorizationFailed.copy(str, str2);
        }

        @SerialName("failure_reason")
        public static /* synthetic */ void getFailureReason$annotations() {
        }

        @SerialName("failure_stage")
        public static /* synthetic */ void getFailureStage$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFailureStage() {
            return this.failureStage;
        }

        public final AuthorizationFailed copy(String failureReason, String failureStage) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(failureStage, "failureStage");
            return new AuthorizationFailed(failureReason, failureStage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationFailed)) {
                return false;
            }
            AuthorizationFailed authorizationFailed = (AuthorizationFailed) other;
            return Intrinsics.areEqual(this.failureReason, authorizationFailed.failureReason) && Intrinsics.areEqual(this.failureStage, authorizationFailed.failureStage);
        }

        public int hashCode() {
            return (this.failureReason.hashCode() * 31) + this.failureStage.hashCode();
        }

        public String toString() {
            return "AuthorizationFailed(failureReason=" + this.failureReason + ", failureStage=" + this.failureStage + ")";
        }

        /* compiled from: MandateAuthorizationFlowResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$AuthorizationFailed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$AuthorizationFailed;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AuthorizationFailed> serializer() {
                return MandateAuthorizationFlowResponse2.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ AuthorizationFailed(int i, @SerialName("failure_reason") String str, @SerialName("failure_stage") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.failureReason = "";
            } else {
                this.failureReason = str;
            }
            if ((i & 2) == 0) {
                this.failureStage = "";
            } else {
                this.failureStage = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(AuthorizationFailed self, Encoding3 output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.failureReason, "")) {
                output.encodeStringElement(serialDesc, 0, self.failureReason);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.failureStage, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.failureStage);
        }

        public /* synthetic */ AuthorizationFailed(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final String getFailureStage() {
            return this.failureStage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizationFailed(String failureReason, String failureStage) {
            super(null);
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(failureStage, "failureStage");
            this.failureReason = failureReason;
            this.failureStage = failureStage;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public AuthorizationFlowResponse intoDomain2() {
        if (this instanceof Authorizing) {
            return new AuthorizationFlowResponse.Authorizing(((Authorizing) this).getAuthorizationFlow().intoDomain2());
        }
        if (!(this instanceof AuthorizationFailed)) {
            throw new NoWhenBranchMatchedException();
        }
        AuthorizationFailed authorizationFailed = (AuthorizationFailed) this;
        return new AuthorizationFlowResponse.AuthorizationFailed(AuthorizationFlowResponse.AuthorizationFailed.FailureReason.INSTANCE.from(authorizationFailed.getFailureReason()), AuthorizationFlowResponse.AuthorizationFailed.FailureStage.INSTANCE.from(authorizationFailed.getFailureStage()));
    }

    /* compiled from: MandateAuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse$AuthorizationFlowResponseSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AuthorizationFlowResponseSerializer extends JsonContentPolymorphicSerializer<MandateAuthorizationFlowResponse> {
        public static final AuthorizationFlowResponseSerializer INSTANCE = new AuthorizationFlowResponseSerializer();

        private AuthorizationFlowResponseSerializer() {
            super(Reflection.getOrCreateKotlinClass(MandateAuthorizationFlowResponse.class));
        }

        @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
        protected KSerializer2<MandateAuthorizationFlowResponse> selectDeserializer(JsonElement element) {
            JsonElement7 jsonPrimitive;
            String content;
            KSerializer2<MandateAuthorizationFlowResponse> kSerializer2Serializer;
            Intrinsics.checkNotNullParameter(element, "element");
            JsonElement jsonElement = (JsonElement) JsonElement3.getJsonObject(element).get((Object) "status");
            if (jsonElement != null && (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) != null && (content = jsonPrimitive.getContent()) != null) {
                if (Intrinsics.areEqual(content, "authorizing")) {
                    kSerializer2Serializer = Authorizing.INSTANCE.serializer();
                } else {
                    if (!Intrinsics.areEqual(content, "failed")) {
                        throw new SerializationExceptions2("AuthorizationFlowResponseSerializer: Unable to match 'status' key of value '" + content + "' in " + element);
                    }
                    kSerializer2Serializer = AuthorizationFailed.INSTANCE.serializer();
                }
                if (kSerializer2Serializer != null) {
                    return kSerializer2Serializer;
                }
            }
            throw new SerializationExceptions2("AuthorizationFlowResponseSerializer: Missing 'status' key in " + element);
        }
    }
}
