package com.stripe.android.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u001c\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b'\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b,\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "", "", "uniqueId", "initialInstitution", "", "manualEntryOnly", "searchSession", "Lcom/stripe/android/model/VerificationMethodParam;", "verificationMethod", "hostedSurface", "customer", "onBehalfOf", "", "amount", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "toMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUniqueId", "getInitialInstitution", "Ljava/lang/Boolean;", "getManualEntryOnly", "()Ljava/lang/Boolean;", "getSearchSession", "Lcom/stripe/android/model/VerificationMethodParam;", "getVerificationMethod", "()Lcom/stripe/android/model/VerificationMethodParam;", "getHostedSurface", "getCustomer", "getOnBehalfOf", "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Integer;", "getCurrency", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreateFinancialConnectionsSessionForDeferredPaymentParams {
    private static final Companion Companion = new Companion(null);
    private final Integer amount;
    private final String currency;
    private final String customer;
    private final String hostedSurface;
    private final String initialInstitution;
    private final Boolean manualEntryOnly;
    private final String onBehalfOf;
    private final String searchSession;
    private final String uniqueId;
    private final CreateFinancialConnectionsSessionForDeferredPaymentParams2 verificationMethod;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFinancialConnectionsSessionForDeferredPaymentParams)) {
            return false;
        }
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = (CreateFinancialConnectionsSessionForDeferredPaymentParams) other;
        return Intrinsics.areEqual(this.uniqueId, createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId) && Intrinsics.areEqual(this.initialInstitution, createFinancialConnectionsSessionForDeferredPaymentParams.initialInstitution) && Intrinsics.areEqual(this.manualEntryOnly, createFinancialConnectionsSessionForDeferredPaymentParams.manualEntryOnly) && Intrinsics.areEqual(this.searchSession, createFinancialConnectionsSessionForDeferredPaymentParams.searchSession) && this.verificationMethod == createFinancialConnectionsSessionForDeferredPaymentParams.verificationMethod && Intrinsics.areEqual(this.hostedSurface, createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface) && Intrinsics.areEqual(this.customer, createFinancialConnectionsSessionForDeferredPaymentParams.customer) && Intrinsics.areEqual(this.onBehalfOf, createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf) && Intrinsics.areEqual(this.amount, createFinancialConnectionsSessionForDeferredPaymentParams.amount) && Intrinsics.areEqual(this.currency, createFinancialConnectionsSessionForDeferredPaymentParams.currency);
    }

    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode() * 31;
        String str = this.initialInstitution;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.manualEntryOnly;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.searchSession;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CreateFinancialConnectionsSessionForDeferredPaymentParams2 createFinancialConnectionsSessionForDeferredPaymentParams2 = this.verificationMethod;
        int iHashCode5 = (iHashCode4 + (createFinancialConnectionsSessionForDeferredPaymentParams2 == null ? 0 : createFinancialConnectionsSessionForDeferredPaymentParams2.hashCode())) * 31;
        String str3 = this.hostedSurface;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customer;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onBehalfOf;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.currency;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.uniqueId + ", initialInstitution=" + this.initialInstitution + ", manualEntryOnly=" + this.manualEntryOnly + ", searchSession=" + this.searchSession + ", verificationMethod=" + this.verificationMethod + ", hostedSurface=" + this.hostedSurface + ", customer=" + this.customer + ", onBehalfOf=" + this.onBehalfOf + ", amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    public CreateFinancialConnectionsSessionForDeferredPaymentParams(String uniqueId, String str, Boolean bool, String str2, CreateFinancialConnectionsSessionForDeferredPaymentParams2 createFinancialConnectionsSessionForDeferredPaymentParams2, String str3, String str4, String str5, Integer num, String str6) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        this.uniqueId = uniqueId;
        this.initialInstitution = str;
        this.manualEntryOnly = bool;
        this.searchSession = str2;
        this.verificationMethod = createFinancialConnectionsSessionForDeferredPaymentParams2;
        this.hostedSurface = str3;
        this.customer = str4;
        this.onBehalfOf = str5;
        this.amount = num;
        this.currency = str6;
    }

    public final Map<String, Object> toMap() {
        Tuples2 tuples2M3642to = Tuples4.m3642to("unique_id", this.uniqueId);
        Tuples2 tuples2M3642to2 = Tuples4.m3642to("initial_institution", this.initialInstitution);
        Tuples2 tuples2M3642to3 = Tuples4.m3642to("manual_entry_only", this.manualEntryOnly);
        Tuples2 tuples2M3642to4 = Tuples4.m3642to("search_session", this.searchSession);
        CreateFinancialConnectionsSessionForDeferredPaymentParams2 createFinancialConnectionsSessionForDeferredPaymentParams2 = this.verificationMethod;
        return MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, Tuples4.m3642to("verification_method", createFinancialConnectionsSessionForDeferredPaymentParams2 != null ? createFinancialConnectionsSessionForDeferredPaymentParams2.getValue() : null), Tuples4.m3642to("customer", this.customer), Tuples4.m3642to("on_behalf_of", this.onBehalfOf), Tuples4.m3642to("hosted_surface", this.hostedSurface), Tuples4.m3642to("amount", this.amount), Tuples4.m3642to("currency", this.currency));
    }

    /* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;", "", "()V", "PARAM_AMOUNT", "", "PARAM_CURRENCY", "PARAM_CUSTOMER", "PARAM_HOSTED_SURFACE", "PARAM_INITIAL_INSTITUTION", "PARAM_MANUAL_ENTRY_ONLY", "PARAM_ON_BEHALF_OF", "PARAM_SEARCH_SESSION", "PARAM_UNIQUE_ID", "PARAM_VERIFICATION_METHOD", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
