package com.truelayer.payments.core.network.payments.entity.request;

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
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 I2\u00020\u0001:\u0002HIBa\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003JQ\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J&\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FHÁ\u0001¢\u0006\u0002\bGR&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0015\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006J"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "", "seen1", "", "providerSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/ProviderSelectionPayload;", "redirect", "Lcom/truelayer/payments/core/network/payments/entity/request/RedirectPayload;", "form", "Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;", "consent", "Lcom/truelayer/payments/core/network/payments/entity/request/ConsentPayload;", "schemeSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/SchemeSelectionPayload;", "userAccountSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/UserAccountSelectionPayload;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/request/ProviderSelectionPayload;Lcom/truelayer/payments/core/network/payments/entity/request/RedirectPayload;Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;Lcom/truelayer/payments/core/network/payments/entity/request/ConsentPayload;Lcom/truelayer/payments/core/network/payments/entity/request/SchemeSelectionPayload;Lcom/truelayer/payments/core/network/payments/entity/request/UserAccountSelectionPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/request/ProviderSelectionPayload;Lcom/truelayer/payments/core/network/payments/entity/request/RedirectPayload;Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;Lcom/truelayer/payments/core/network/payments/entity/request/ConsentPayload;Lcom/truelayer/payments/core/network/payments/entity/request/SchemeSelectionPayload;Lcom/truelayer/payments/core/network/payments/entity/request/UserAccountSelectionPayload;)V", "getConsent$annotations", "()V", "getConsent", "()Lcom/truelayer/payments/core/network/payments/entity/request/ConsentPayload;", "setConsent", "(Lcom/truelayer/payments/core/network/payments/entity/request/ConsentPayload;)V", "getForm$annotations", "getForm", "()Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;", "setForm", "(Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;)V", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/payments/entity/request/ProviderSelectionPayload;", "setProviderSelection", "(Lcom/truelayer/payments/core/network/payments/entity/request/ProviderSelectionPayload;)V", "getRedirect$annotations", "getRedirect", "()Lcom/truelayer/payments/core/network/payments/entity/request/RedirectPayload;", "setRedirect", "(Lcom/truelayer/payments/core/network/payments/entity/request/RedirectPayload;)V", "getSchemeSelection$annotations", "getSchemeSelection", "()Lcom/truelayer/payments/core/network/payments/entity/request/SchemeSelectionPayload;", "setSchemeSelection", "(Lcom/truelayer/payments/core/network/payments/entity/request/SchemeSelectionPayload;)V", "getUserAccountSelection$annotations", "getUserAccountSelection", "()Lcom/truelayer/payments/core/network/payments/entity/request/UserAccountSelectionPayload;", "setUserAccountSelection", "(Lcom/truelayer/payments/core/network/payments/entity/request/UserAccountSelectionPayload;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class StartAuthorizationFlowRequest {
    private ConsentPayload consent;
    private FormPayload form;
    private ProviderSelectionPayload providerSelection;
    private RedirectPayload redirect;
    private SchemeSelectionPayload schemeSelection;
    private UserAccountSelectionPayload userAccountSelection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.request.ProviderSelectionPayload", ProviderSelectionPayload.INSTANCE, new Annotation[0]), null, null, new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.request.ConsentPayload", ConsentPayload.INSTANCE, new Annotation[0]), new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.request.SchemeSelectionPayload", SchemeSelectionPayload.INSTANCE, new Annotation[0]), new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.request.UserAccountSelectionPayload", UserAccountSelectionPayload.INSTANCE, new Annotation[0])};

    public static /* synthetic */ StartAuthorizationFlowRequest copy$default(StartAuthorizationFlowRequest startAuthorizationFlowRequest, ProviderSelectionPayload providerSelectionPayload, RedirectPayload redirectPayload, FormPayload formPayload, ConsentPayload consentPayload, SchemeSelectionPayload schemeSelectionPayload, UserAccountSelectionPayload userAccountSelectionPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            providerSelectionPayload = startAuthorizationFlowRequest.providerSelection;
        }
        if ((i & 2) != 0) {
            redirectPayload = startAuthorizationFlowRequest.redirect;
        }
        if ((i & 4) != 0) {
            formPayload = startAuthorizationFlowRequest.form;
        }
        if ((i & 8) != 0) {
            consentPayload = startAuthorizationFlowRequest.consent;
        }
        if ((i & 16) != 0) {
            schemeSelectionPayload = startAuthorizationFlowRequest.schemeSelection;
        }
        if ((i & 32) != 0) {
            userAccountSelectionPayload = startAuthorizationFlowRequest.userAccountSelection;
        }
        SchemeSelectionPayload schemeSelectionPayload2 = schemeSelectionPayload;
        UserAccountSelectionPayload userAccountSelectionPayload2 = userAccountSelectionPayload;
        return startAuthorizationFlowRequest.copy(providerSelectionPayload, redirectPayload, formPayload, consentPayload, schemeSelectionPayload2, userAccountSelectionPayload2);
    }

    @SerialName("consent")
    public static /* synthetic */ void getConsent$annotations() {
    }

    @SerialName("form")
    public static /* synthetic */ void getForm$annotations() {
    }

    @SerialName("provider_selection")
    public static /* synthetic */ void getProviderSelection$annotations() {
    }

    @SerialName("redirect")
    public static /* synthetic */ void getRedirect$annotations() {
    }

    @SerialName("scheme_selection")
    public static /* synthetic */ void getSchemeSelection$annotations() {
    }

    @SerialName("user_account_selection")
    public static /* synthetic */ void getUserAccountSelection$annotations() {
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
    public final FormPayload getForm() {
        return this.form;
    }

    /* renamed from: component4, reason: from getter */
    public final ConsentPayload getConsent() {
        return this.consent;
    }

    /* renamed from: component5, reason: from getter */
    public final SchemeSelectionPayload getSchemeSelection() {
        return this.schemeSelection;
    }

    /* renamed from: component6, reason: from getter */
    public final UserAccountSelectionPayload getUserAccountSelection() {
        return this.userAccountSelection;
    }

    public final StartAuthorizationFlowRequest copy(ProviderSelectionPayload providerSelection, RedirectPayload redirect, FormPayload form, ConsentPayload consent, SchemeSelectionPayload schemeSelection, UserAccountSelectionPayload userAccountSelection) {
        return new StartAuthorizationFlowRequest(providerSelection, redirect, form, consent, schemeSelection, userAccountSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartAuthorizationFlowRequest)) {
            return false;
        }
        StartAuthorizationFlowRequest startAuthorizationFlowRequest = (StartAuthorizationFlowRequest) other;
        return Intrinsics.areEqual(this.providerSelection, startAuthorizationFlowRequest.providerSelection) && Intrinsics.areEqual(this.redirect, startAuthorizationFlowRequest.redirect) && Intrinsics.areEqual(this.form, startAuthorizationFlowRequest.form) && Intrinsics.areEqual(this.consent, startAuthorizationFlowRequest.consent) && Intrinsics.areEqual(this.schemeSelection, startAuthorizationFlowRequest.schemeSelection) && Intrinsics.areEqual(this.userAccountSelection, startAuthorizationFlowRequest.userAccountSelection);
    }

    public int hashCode() {
        ProviderSelectionPayload providerSelectionPayload = this.providerSelection;
        int iHashCode = (providerSelectionPayload == null ? 0 : providerSelectionPayload.hashCode()) * 31;
        RedirectPayload redirectPayload = this.redirect;
        int iHashCode2 = (iHashCode + (redirectPayload == null ? 0 : redirectPayload.hashCode())) * 31;
        FormPayload formPayload = this.form;
        int iHashCode3 = (iHashCode2 + (formPayload == null ? 0 : formPayload.hashCode())) * 31;
        ConsentPayload consentPayload = this.consent;
        int iHashCode4 = (iHashCode3 + (consentPayload == null ? 0 : consentPayload.hashCode())) * 31;
        SchemeSelectionPayload schemeSelectionPayload = this.schemeSelection;
        int iHashCode5 = (iHashCode4 + (schemeSelectionPayload == null ? 0 : schemeSelectionPayload.hashCode())) * 31;
        UserAccountSelectionPayload userAccountSelectionPayload = this.userAccountSelection;
        return iHashCode5 + (userAccountSelectionPayload != null ? userAccountSelectionPayload.hashCode() : 0);
    }

    public String toString() {
        return "StartAuthorizationFlowRequest(providerSelection=" + this.providerSelection + ", redirect=" + this.redirect + ", form=" + this.form + ", consent=" + this.consent + ", schemeSelection=" + this.schemeSelection + ", userAccountSelection=" + this.userAccountSelection + ")";
    }

    /* compiled from: StartAuthorizationFlowRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
    public /* synthetic */ StartAuthorizationFlowRequest(int i, @SerialName("provider_selection") ProviderSelectionPayload providerSelectionPayload, @SerialName("redirect") RedirectPayload redirectPayload, @SerialName("form") FormPayload formPayload, @SerialName("consent") ConsentPayload consentPayload, @SerialName("scheme_selection") SchemeSelectionPayload schemeSelectionPayload, @SerialName("user_account_selection") UserAccountSelectionPayload userAccountSelectionPayload, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptions.throwMissingFieldException(i, 63, StartAuthorizationFlowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.providerSelection = providerSelectionPayload;
        this.redirect = redirectPayload;
        this.form = formPayload;
        this.consent = consentPayload;
        this.schemeSelection = schemeSelectionPayload;
        this.userAccountSelection = userAccountSelectionPayload;
    }

    public StartAuthorizationFlowRequest(ProviderSelectionPayload providerSelectionPayload, RedirectPayload redirectPayload, FormPayload formPayload, ConsentPayload consentPayload, SchemeSelectionPayload schemeSelectionPayload, UserAccountSelectionPayload userAccountSelectionPayload) {
        this.providerSelection = providerSelectionPayload;
        this.redirect = redirectPayload;
        this.form = formPayload;
        this.consent = consentPayload;
        this.schemeSelection = schemeSelectionPayload;
        this.userAccountSelection = userAccountSelectionPayload;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(StartAuthorizationFlowRequest self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.providerSelection);
        output.encodeNullableSerializableElement(serialDesc, 1, RedirectPayload$$serializer.INSTANCE, self.redirect);
        output.encodeNullableSerializableElement(serialDesc, 2, FormPayload$$serializer.INSTANCE, self.form);
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.consent);
        output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.schemeSelection);
        output.encodeNullableSerializableElement(serialDesc, 5, kSerializerArr[5], self.userAccountSelection);
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

    public final FormPayload getForm() {
        return this.form;
    }

    public final void setForm(FormPayload formPayload) {
        this.form = formPayload;
    }

    public final ConsentPayload getConsent() {
        return this.consent;
    }

    public final void setConsent(ConsentPayload consentPayload) {
        this.consent = consentPayload;
    }

    public final SchemeSelectionPayload getSchemeSelection() {
        return this.schemeSelection;
    }

    public final void setSchemeSelection(SchemeSelectionPayload schemeSelectionPayload) {
        this.schemeSelection = schemeSelectionPayload;
    }

    public final UserAccountSelectionPayload getUserAccountSelection() {
        return this.userAccountSelection;
    }

    public final void setUserAccountSelection(UserAccountSelectionPayload userAccountSelectionPayload) {
        this.userAccountSelection = userAccountSelectionPayload;
    }
}
