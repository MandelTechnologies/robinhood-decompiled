package com.truelayer.payments.core.network.experience.entity;

import com.robinhood.models.api.ErrorResponse;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.utils.IntoCoreError;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentsExperienceApiError.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002<=Bq\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0001\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u001b\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bHÆ\u0003JW\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J6\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0005H\u0016J\t\u00103\u001a\u00020\u0005HÖ\u0001J&\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:HÁ\u0001¢\u0006\u0002\b;R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R.\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u0006>"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/PaymentsExperienceApiError;", "Lcom/truelayer/payments/core/domain/utils/IntoCoreError$IntoHttpError;", "seen1", "", "type", "", "title", "status", "traceId", ErrorResponse.DETAIL, "errors", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDetail$annotations", "()V", "getDetail", "()Ljava/lang/String;", "getErrors$annotations", "getErrors", "()Ljava/util/Map;", "getStatus$annotations", "getStatus", "()I", "getTitle$annotations", "getTitle", "getTraceId$annotations", "getTraceId", "getType$annotations", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "intoCoreHttpError", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "httpStatusCode", "responseBody", "autoRetry", "endpoint", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PaymentsExperienceApiError implements IntoCoreError.IntoHttpError {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String detail;
    private final Map<String, List<String>> errors;
    private final int status;
    private final String title;
    private final String traceId;
    private final String type;

    public static /* synthetic */ PaymentsExperienceApiError copy$default(PaymentsExperienceApiError paymentsExperienceApiError, String str, String str2, int i, String str3, String str4, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentsExperienceApiError.type;
        }
        if ((i2 & 2) != 0) {
            str2 = paymentsExperienceApiError.title;
        }
        if ((i2 & 4) != 0) {
            i = paymentsExperienceApiError.status;
        }
        if ((i2 & 8) != 0) {
            str3 = paymentsExperienceApiError.traceId;
        }
        if ((i2 & 16) != 0) {
            str4 = paymentsExperienceApiError.detail;
        }
        if ((i2 & 32) != 0) {
            map = paymentsExperienceApiError.errors;
        }
        String str5 = str4;
        Map map2 = map;
        return paymentsExperienceApiError.copy(str, str2, i, str3, str5, map2);
    }

    @SerialName(ErrorResponse.DETAIL)
    public static /* synthetic */ void getDetail$annotations() {
    }

    @SerialName("errors")
    public static /* synthetic */ void getErrors$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("trace_id")
    public static /* synthetic */ void getTraceId$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final Map<String, List<String>> component6() {
        return this.errors;
    }

    public final PaymentsExperienceApiError copy(String type2, String title, int status, String traceId, String detail, Map<String, ? extends List<String>> errors) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new PaymentsExperienceApiError(type2, title, status, traceId, detail, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsExperienceApiError)) {
            return false;
        }
        PaymentsExperienceApiError paymentsExperienceApiError = (PaymentsExperienceApiError) other;
        return Intrinsics.areEqual(this.type, paymentsExperienceApiError.type) && Intrinsics.areEqual(this.title, paymentsExperienceApiError.title) && this.status == paymentsExperienceApiError.status && Intrinsics.areEqual(this.traceId, paymentsExperienceApiError.traceId) && Intrinsics.areEqual(this.detail, paymentsExperienceApiError.detail) && Intrinsics.areEqual(this.errors, paymentsExperienceApiError.errors);
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.traceId.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "PaymentsExperienceApiError(type=" + this.type + ", title=" + this.title + ", status=" + this.status + ", traceId=" + this.traceId + ", detail=" + this.detail + ", errors=" + this.errors + ")";
    }

    @Deprecated
    public /* synthetic */ PaymentsExperienceApiError(int i, @SerialName("type") String str, @SerialName("title") String str2, @SerialName("status") int i2, @SerialName("trace_id") String str3, @SerialName(ErrorResponse.DETAIL) String str4, @SerialName("errors") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, PaymentsExperienceApiError2.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.title = str2;
        this.status = i2;
        this.traceId = str3;
        this.detail = str4;
        if ((i & 32) == 0) {
            this.errors = MapsKt.emptyMap();
        } else {
            this.errors = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsExperienceApiError(String type2, String title, int i, String traceId, String detail, Map<String, ? extends List<String>> errors) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.type = type2;
        this.title = title;
        this.status = i;
        this.traceId = traceId;
        this.detail = detail;
        this.errors = errors;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PaymentsExperienceApiError self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeIntElement(serialDesc, 2, self.status);
        output.encodeStringElement(serialDesc, 3, self.traceId);
        output.encodeStringElement(serialDesc, 4, self.detail);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && Intrinsics.areEqual(self.errors, MapsKt.emptyMap())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.errors);
    }

    public final String getType() {
        return this.type;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getDetail() {
        return this.detail;
    }

    public /* synthetic */ PaymentsExperienceApiError(String str, String str2, int i, String str3, String str4, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, (i2 & 32) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, List<String>> getErrors() {
        return this.errors;
    }

    @Override // com.truelayer.payments.core.domain.utils.IntoCoreError.IntoHttpError
    public CoreError.HttpError intoCoreHttpError(int httpStatusCode, String responseBody, String traceId, int autoRetry, String endpoint) {
        CoreError.HttpError.ServerErrorType serverErrorType;
        if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "invalid-parameters", false, 2, (Object) null)) {
            return new CoreError.HttpError.InvalidParameters(httpStatusCode, responseBody, traceId, autoRetry, endpoint, this.title, this.detail, this.errors);
        }
        if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "unauthenticated", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.Unauthenticated;
        } else if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "forbidden", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.Forbidden;
        } else if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "not-found", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.NotFound;
        } else if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "idempotency-key-concurrency-conflict", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.IdempotencyKeyConcurrencyConflict;
        } else if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "idempotency-key-reuse", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.IdempotencyKeyReuse;
        } else if (StringsKt.contains$default((CharSequence) this.type, (CharSequence) "invalid-state", false, 2, (Object) null)) {
            serverErrorType = CoreError.HttpError.ServerErrorType.InvalidState;
        } else {
            serverErrorType = StringsKt.contains$default((CharSequence) this.type, (CharSequence) "provider-error", false, 2, (Object) null) ? CoreError.HttpError.ServerErrorType.ProviderError : CoreError.HttpError.ServerErrorType.UnknownError;
        }
        return new CoreError.HttpError.ServerError(httpStatusCode, serverErrorType, responseBody, traceId, autoRetry, endpoint, this.title, this.detail);
    }

    /* compiled from: PaymentsExperienceApiError.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/PaymentsExperienceApiError$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/PaymentsExperienceApiError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentsExperienceApiError> serializer() {
            return PaymentsExperienceApiError2.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(stringSerializer))};
    }
}
