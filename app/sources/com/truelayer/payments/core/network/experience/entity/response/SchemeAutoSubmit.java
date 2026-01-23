package com.truelayer.payments.core.network.experience.entity.response;

import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SchemeSelectionResponse.kt */
@SerialName("auto-submit")
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeAutoSubmit;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse;", "seen1", "", "autoSubmitSchemeId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getAutoSubmitSchemeId$annotations", "()V", "getAutoSubmitSchemeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeAutoSubmit;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class SchemeAutoSubmit extends SchemeSelectionResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String autoSubmitSchemeId;

    public static /* synthetic */ SchemeAutoSubmit copy$default(SchemeAutoSubmit schemeAutoSubmit, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemeAutoSubmit.autoSubmitSchemeId;
        }
        return schemeAutoSubmit.copy(str);
    }

    @SerialName("auto_submit_scheme_id")
    public static /* synthetic */ void getAutoSubmitSchemeId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoSubmitSchemeId() {
        return this.autoSubmitSchemeId;
    }

    public final SchemeAutoSubmit copy(String autoSubmitSchemeId) {
        Intrinsics.checkNotNullParameter(autoSubmitSchemeId, "autoSubmitSchemeId");
        return new SchemeAutoSubmit(autoSubmitSchemeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SchemeAutoSubmit) && Intrinsics.areEqual(this.autoSubmitSchemeId, ((SchemeAutoSubmit) other).autoSubmitSchemeId);
    }

    public int hashCode() {
        return this.autoSubmitSchemeId.hashCode();
    }

    public String toString() {
        return "SchemeAutoSubmit(autoSubmitSchemeId=" + this.autoSubmitSchemeId + ")";
    }

    /* compiled from: SchemeSelectionResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeAutoSubmit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeAutoSubmit;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SchemeAutoSubmit> serializer() {
            return SchemeSelectionResponse5.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SchemeAutoSubmit(int i, @SerialName("auto_submit_scheme_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SchemeSelectionResponse5.INSTANCE.getDescriptor());
        }
        this.autoSubmitSchemeId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(SchemeAutoSubmit self, Encoding3 output, SerialDescriptor serialDesc) {
        SchemeSelectionResponse.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.autoSubmitSchemeId);
    }

    public final String getAutoSubmitSchemeId() {
        return this.autoSubmitSchemeId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchemeAutoSubmit(String autoSubmitSchemeId) {
        super(null);
        Intrinsics.checkNotNullParameter(autoSubmitSchemeId, "autoSubmitSchemeId");
        this.autoSubmitSchemeId = autoSubmitSchemeId;
    }

    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain, reason: merged with bridge method [inline-methods] */
    public SchemeSelection intoDomain2() {
        return new com.truelayer.payments.core.domain.experience.scheme.SchemeAutoSubmit(this.autoSubmitSchemeId);
    }
}
