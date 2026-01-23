package com.truelayer.payments.core.network.payments.entity.request;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SubmitUserAccountSelectionRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Delete", "Existing", "New", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Delete;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Existing;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$New;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class SubmitUserAccountSelectionRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.request.SubmitUserAccountSelectionRequest.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.request.SubmitUserAccountSelectionRequest", Reflection.getOrCreateKotlinClass(SubmitUserAccountSelectionRequest.class), new KClass[]{Reflection.getOrCreateKotlinClass(Delete.class), Reflection.getOrCreateKotlinClass(Existing.class), Reflection.getOrCreateKotlinClass(New.class)}, new KSerializer[]{SubmitUserAccountSelectionRequest2.INSTANCE, SubmitUserAccountSelectionRequest3.INSTANCE, new ObjectSerializer("new", New.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    });

    public /* synthetic */ SubmitUserAccountSelectionRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(SubmitUserAccountSelectionRequest self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: SubmitUserAccountSelectionRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SubmitUserAccountSelectionRequest.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SubmitUserAccountSelectionRequest> serializer() {
            return get$cachedSerializer();
        }
    }

    private SubmitUserAccountSelectionRequest() {
    }

    @Deprecated
    public /* synthetic */ SubmitUserAccountSelectionRequest(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: SubmitUserAccountSelectionRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$New;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("new")
    public static final class New extends SubmitUserAccountSelectionRequest {
        public static final New INSTANCE = new New();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.request.SubmitUserAccountSelectionRequest.New.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("new", New.INSTANCE, new Annotation[0]);
            }
        });

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<New> serializer() {
            return get$cachedSerializer();
        }

        private New() {
            super(null);
        }
    }

    /* compiled from: SubmitUserAccountSelectionRequest.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Existing;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "seen1", "", "userAccountId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getUserAccountId$annotations", "()V", "getUserAccountId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("existing")
    public static final /* data */ class Existing extends SubmitUserAccountSelectionRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String userAccountId;

        public static /* synthetic */ Existing copy$default(Existing existing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existing.userAccountId;
            }
            return existing.copy(str);
        }

        @SerialName("user_account_id")
        public static /* synthetic */ void getUserAccountId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserAccountId() {
            return this.userAccountId;
        }

        public final Existing copy(String userAccountId) {
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            return new Existing(userAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Existing) && Intrinsics.areEqual(this.userAccountId, ((Existing) other).userAccountId);
        }

        public int hashCode() {
            return this.userAccountId.hashCode();
        }

        public String toString() {
            return "Existing(userAccountId=" + this.userAccountId + ")";
        }

        /* compiled from: SubmitUserAccountSelectionRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Existing$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Existing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Existing> serializer() {
                return SubmitUserAccountSelectionRequest3.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Existing(int i, @SerialName("user_account_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, SubmitUserAccountSelectionRequest3.INSTANCE.getDescriptor());
            }
            this.userAccountId = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Existing self, Encoding3 output, SerialDescriptor serialDesc) {
            SubmitUserAccountSelectionRequest.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.userAccountId);
        }

        public final String getUserAccountId() {
            return this.userAccountId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Existing(String userAccountId) {
            super(null);
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            this.userAccountId = userAccountId;
        }
    }

    /* compiled from: SubmitUserAccountSelectionRequest.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Delete;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "seen1", "", "userAccountId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getUserAccountId$annotations", "()V", "getUserAccountId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName(AnalyticsStrings.BUTTON_LIST_DELETE)
    public static final /* data */ class Delete extends SubmitUserAccountSelectionRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String userAccountId;

        public static /* synthetic */ Delete copy$default(Delete delete, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = delete.userAccountId;
            }
            return delete.copy(str);
        }

        @SerialName("user_account_id")
        public static /* synthetic */ void getUserAccountId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserAccountId() {
            return this.userAccountId;
        }

        public final Delete copy(String userAccountId) {
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            return new Delete(userAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Delete) && Intrinsics.areEqual(this.userAccountId, ((Delete) other).userAccountId);
        }

        public int hashCode() {
            return this.userAccountId.hashCode();
        }

        public String toString() {
            return "Delete(userAccountId=" + this.userAccountId + ")";
        }

        /* compiled from: SubmitUserAccountSelectionRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Delete$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest$Delete;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Delete> serializer() {
                return SubmitUserAccountSelectionRequest2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Delete(int i, @SerialName("user_account_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, SubmitUserAccountSelectionRequest2.INSTANCE.getDescriptor());
            }
            this.userAccountId = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Delete self, Encoding3 output, SerialDescriptor serialDesc) {
            SubmitUserAccountSelectionRequest.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.userAccountId);
        }

        public final String getUserAccountId() {
            return this.userAccountId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delete(String userAccountId) {
            super(null);
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            this.userAccountId = userAccountId;
        }
    }
}
