package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.utils.IntoDomain;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AuthorizationFlow.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B%\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "seen1", "", "actions", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActions;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActions;)V", "getActions$annotations", "()V", "getActions", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActions;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class AuthorizationFlow implements IntoDomain<com.truelayer.payments.core.domain.payments.AuthorizationFlow> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AuthorizationFlowActions actions;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizationFlow() {
        this((AuthorizationFlowActions) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AuthorizationFlow copy$default(AuthorizationFlow authorizationFlow, AuthorizationFlowActions authorizationFlowActions, int i, Object obj) {
        if ((i & 1) != 0) {
            authorizationFlowActions = authorizationFlow.actions;
        }
        return authorizationFlow.copy(authorizationFlowActions);
    }

    @SerialName("actions")
    public static /* synthetic */ void getActions$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final AuthorizationFlowActions getActions() {
        return this.actions;
    }

    public final AuthorizationFlow copy(AuthorizationFlowActions actions) {
        return new AuthorizationFlow(actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthorizationFlow) && Intrinsics.areEqual(this.actions, ((AuthorizationFlow) other).actions);
    }

    public int hashCode() {
        AuthorizationFlowActions authorizationFlowActions = this.actions;
        if (authorizationFlowActions == null) {
            return 0;
        }
        return authorizationFlowActions.hashCode();
    }

    public String toString() {
        return "AuthorizationFlow(actions=" + this.actions + ")";
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlow;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AuthorizationFlow> serializer() {
            return AuthorizationFlow3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AuthorizationFlow(int i, @SerialName("actions") AuthorizationFlowActions authorizationFlowActions, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actions = null;
        } else {
            this.actions = authorizationFlowActions;
        }
    }

    public AuthorizationFlow(AuthorizationFlowActions authorizationFlowActions) {
        this.actions = authorizationFlowActions;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(AuthorizationFlow self, Encoding3 output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.actions == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, AuthorizationFlow5.INSTANCE, self.actions);
    }

    public /* synthetic */ AuthorizationFlow(AuthorizationFlowActions authorizationFlowActions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authorizationFlowActions);
    }

    public final AuthorizationFlowActions getActions() {
        return this.actions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.AuthorizationFlow intoDomain2() {
        AuthorizationFlowActions authorizationFlowActions = this.actions;
        return new com.truelayer.payments.core.domain.payments.AuthorizationFlow(authorizationFlowActions != null ? authorizationFlowActions.intoDomain2() : null);
    }
}
