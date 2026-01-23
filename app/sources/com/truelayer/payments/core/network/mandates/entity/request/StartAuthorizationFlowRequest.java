package com.truelayer.payments.core.network.mandates.entity.request;

import java.lang.annotation.Annotation;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StartAuthorizationFlowRequest.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000201B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÁ\u0001¢\u0006\u0002\b/R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;", "", "seen1", "", "providerSelection", "Lcom/truelayer/payments/core/network/mandates/entity/request/ProviderSelectionPayload;", "redirect", "Lcom/truelayer/payments/core/network/mandates/entity/request/RedirectPayload;", "consent", "Lcom/truelayer/payments/core/network/mandates/entity/request/ConsentPayload;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/request/ProviderSelectionPayload;Lcom/truelayer/payments/core/network/mandates/entity/request/RedirectPayload;Lcom/truelayer/payments/core/network/mandates/entity/request/ConsentPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/request/ProviderSelectionPayload;Lcom/truelayer/payments/core/network/mandates/entity/request/RedirectPayload;Lcom/truelayer/payments/core/network/mandates/entity/request/ConsentPayload;)V", "getConsent$annotations", "()V", "getConsent", "()Lcom/truelayer/payments/core/network/mandates/entity/request/ConsentPayload;", "setConsent", "(Lcom/truelayer/payments/core/network/mandates/entity/request/ConsentPayload;)V", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/mandates/entity/request/ProviderSelectionPayload;", "setProviderSelection", "(Lcom/truelayer/payments/core/network/mandates/entity/request/ProviderSelectionPayload;)V", "getRedirect$annotations", "getRedirect", "()Lcom/truelayer/payments/core/network/mandates/entity/request/RedirectPayload;", "setRedirect", "(Lcom/truelayer/payments/core/network/mandates/entity/request/RedirectPayload;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class StartAuthorizationFlowRequest {
    private ConsentPayload consent;
    private ProviderSelectionPayload providerSelection;
    private RedirectPayload redirect;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ObjectSerializer("com.truelayer.payments.core.network.mandates.entity.request.ProviderSelectionPayload", ProviderSelectionPayload.INSTANCE, new Annotation[0]), null, new ObjectSerializer("com.truelayer.payments.core.network.mandates.entity.request.ConsentPayload", ConsentPayload.INSTANCE, new Annotation[0])};

    public static /* synthetic */ StartAuthorizationFlowRequest copy$default(StartAuthorizationFlowRequest startAuthorizationFlowRequest, ProviderSelectionPayload providerSelectionPayload, RedirectPayload redirectPayload, ConsentPayload consentPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            providerSelectionPayload = startAuthorizationFlowRequest.providerSelection;
        }
        if ((i & 2) != 0) {
            redirectPayload = startAuthorizationFlowRequest.redirect;
        }
        if ((i & 4) != 0) {
            consentPayload = startAuthorizationFlowRequest.consent;
        }
        return startAuthorizationFlowRequest.copy(providerSelectionPayload, redirectPayload, consentPayload);
    }

    @SerialName("consent")
    public static /* synthetic */ void getConsent$annotations() {
    }

    @SerialName("provider_selection")
    public static /* synthetic */ void getProviderSelection$annotations() {
    }

    @SerialName("redirect")
    public static /* synthetic */ void getRedirect$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ProviderSelectionPayload getProviderSelection() {
        return this.providerSelection;
    }

    /* renamed from: component2, reason: from getter */
    public final RedirectPayload getRedirect() {
        return this.redirect;
    }

    /* renamed from: component3, reason: from getter */
    public final ConsentPayload getConsent() {
        return this.consent;
    }

    public final StartAuthorizationFlowRequest copy(ProviderSelectionPayload providerSelection, RedirectPayload redirect, ConsentPayload consent) {
        return new StartAuthorizationFlowRequest(providerSelection, redirect, consent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartAuthorizationFlowRequest)) {
            return false;
        }
        StartAuthorizationFlowRequest startAuthorizationFlowRequest = (StartAuthorizationFlowRequest) other;
        return Intrinsics.areEqual(this.providerSelection, startAuthorizationFlowRequest.providerSelection) && Intrinsics.areEqual(this.redirect, startAuthorizationFlowRequest.redirect) && Intrinsics.areEqual(this.consent, startAuthorizationFlowRequest.consent);
    }

    public int hashCode() {
        ProviderSelectionPayload providerSelectionPayload = this.providerSelection;
        int iHashCode = (providerSelectionPayload == null ? 0 : providerSelectionPayload.hashCode()) * 31;
        RedirectPayload redirectPayload = this.redirect;
        int iHashCode2 = (iHashCode + (redirectPayload == null ? 0 : redirectPayload.hashCode())) * 31;
        ConsentPayload consentPayload = this.consent;
        return iHashCode2 + (consentPayload != null ? consentPayload.hashCode() : 0);
    }

    public String toString() {
        return "StartAuthorizationFlowRequest(providerSelection=" + this.providerSelection + ", redirect=" + this.redirect + ", consent=" + this.consent + ")";
    }

    /* compiled from: StartAuthorizationFlowRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StartAuthorizationFlowRequest> serializer() {
            return StartAuthorizationFlowRequest$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ StartAuthorizationFlowRequest(int i, @SerialName("provider_selection") ProviderSelectionPayload providerSelectionPayload, @SerialName("redirect") RedirectPayload redirectPayload, @SerialName("consent") ConsentPayload consentPayload, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, StartAuthorizationFlowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.providerSelection = providerSelectionPayload;
        this.redirect = redirectPayload;
        this.consent = consentPayload;
    }

    public StartAuthorizationFlowRequest(ProviderSelectionPayload providerSelectionPayload, RedirectPayload redirectPayload, ConsentPayload consentPayload) {
        this.providerSelection = providerSelectionPayload;
        this.redirect = redirectPayload;
        this.consent = consentPayload;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(StartAuthorizationFlowRequest self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.providerSelection);
        output.encodeNullableSerializableElement(serialDesc, 1, RedirectPayload$$serializer.INSTANCE, self.redirect);
        output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.consent);
    }

    public final ProviderSelectionPayload getProviderSelection() {
        return this.providerSelection;
    }

    public final void setProviderSelection(ProviderSelectionPayload providerSelectionPayload) {
        this.providerSelection = providerSelectionPayload;
    }

    public final RedirectPayload getRedirect() {
        return this.redirect;
    }

    public final void setRedirect(RedirectPayload redirectPayload) {
        this.redirect = redirectPayload;
    }

    public final ConsentPayload getConsent() {
        return this.consent;
    }

    public final void setConsent(ConsentPayload consentPayload) {
        this.consent = consentPayload;
    }
}
