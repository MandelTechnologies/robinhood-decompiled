package com.truelayer.payments.core.network.payments.entity.request;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SubmitSchemeSelectionRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitSchemeSelectionRequest;", "", "seen1", "", "schemeId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getSchemeId$annotations", "()V", "getSchemeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class SubmitSchemeSelectionRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String schemeId;

    public static /* synthetic */ SubmitSchemeSelectionRequest copy$default(SubmitSchemeSelectionRequest submitSchemeSelectionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSchemeSelectionRequest.schemeId;
        }
        return submitSchemeSelectionRequest.copy(str);
    }

    @SerialName("scheme_id")
    public static /* synthetic */ void getSchemeId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSchemeId() {
        return this.schemeId;
    }

    public final SubmitSchemeSelectionRequest copy(String schemeId) {
        Intrinsics.checkNotNullParameter(schemeId, "schemeId");
        return new SubmitSchemeSelectionRequest(schemeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubmitSchemeSelectionRequest) && Intrinsics.areEqual(this.schemeId, ((SubmitSchemeSelectionRequest) other).schemeId);
    }

    public int hashCode() {
        return this.schemeId.hashCode();
    }

    public String toString() {
        return "SubmitSchemeSelectionRequest(schemeId=" + this.schemeId + ")";
    }

    /* compiled from: SubmitSchemeSelectionRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitSchemeSelectionRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitSchemeSelectionRequest;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubmitSchemeSelectionRequest> serializer() {
            return SubmitSchemeSelectionRequest2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SubmitSchemeSelectionRequest(int i, @SerialName("scheme_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SubmitSchemeSelectionRequest2.INSTANCE.getDescriptor());
        }
        this.schemeId = str;
    }

    public SubmitSchemeSelectionRequest(String schemeId) {
        Intrinsics.checkNotNullParameter(schemeId, "schemeId");
        this.schemeId = schemeId;
    }

    public final String getSchemeId() {
        return this.schemeId;
    }
}
