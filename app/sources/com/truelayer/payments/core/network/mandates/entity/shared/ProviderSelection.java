package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.payments.ProviderSelection;
import com.truelayer.payments.core.domain.payments.SchemeSelectionType;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0013B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010HÇ\u0001\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "intoDomain", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "PreSelected", "UserSelected", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class ProviderSelection implements IntoDomain<com.truelayer.payments.core.domain.payments.ProviderSelection> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.ProviderSelection.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.mandates.entity.shared.ProviderSelection", Reflection.getOrCreateKotlinClass(ProviderSelection.class), new KClass[]{Reflection.getOrCreateKotlinClass(PreSelected.class), Reflection.getOrCreateKotlinClass(UserSelected.class)}, new KSerializer[]{ProviderSelection$PreSelected$$serializer.INSTANCE, ProviderSelection$UserSelected$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ ProviderSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ProviderSelection self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProviderSelection.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProviderSelection> serializer() {
            return get$cachedSerializer();
        }
    }

    private ProviderSelection() {
    }

    @Deprecated
    public /* synthetic */ ProviderSelection(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$UserSelected;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "seen1", "", "providerId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("user_selected")
    public static final /* data */ class UserSelected extends ProviderSelection {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String providerId;

        /* JADX WARN: Multi-variable type inference failed */
        public UserSelected() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserSelected copy$default(UserSelected userSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userSelected.providerId;
            }
            return userSelected.copy(str);
        }

        @SerialName("provider_id")
        public static /* synthetic */ void getProviderId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public final UserSelected copy(String providerId) {
            return new UserSelected(providerId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserSelected) && Intrinsics.areEqual(this.providerId, ((UserSelected) other).providerId);
        }

        public int hashCode() {
            String str = this.providerId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "UserSelected(providerId=" + this.providerId + ")";
        }

        @Deprecated
        public /* synthetic */ UserSelected(int i, @SerialName("provider_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.providerId = null;
            } else {
                this.providerId = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(UserSelected self, Encoding3 output, SerialDescriptor serialDesc) {
            ProviderSelection.write$Self(self, output, serialDesc);
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.providerId == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.providerId);
        }

        public /* synthetic */ UserSelected(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public UserSelected(String str) {
            super(null);
            this.providerId = str;
        }

        /* compiled from: ProviderSelection.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$UserSelected$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UserSelected> serializer() {
                return ProviderSelection$UserSelected$$serializer.INSTANCE;
            }
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection;", "seen1", "", "providerId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("preselected")
    public static final /* data */ class PreSelected extends ProviderSelection {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String providerId;

        public static /* synthetic */ PreSelected copy$default(PreSelected preSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preSelected.providerId;
            }
            return preSelected.copy(str);
        }

        @SerialName("provider_id")
        public static /* synthetic */ void getProviderId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public final PreSelected copy(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return new PreSelected(providerId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreSelected) && Intrinsics.areEqual(this.providerId, ((PreSelected) other).providerId);
        }

        public int hashCode() {
            return this.providerId.hashCode();
        }

        public String toString() {
            return "PreSelected(providerId=" + this.providerId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ PreSelected(int i, @SerialName("provider_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, ProviderSelection$PreSelected$$serializer.INSTANCE.getDescriptor());
            }
            this.providerId = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(PreSelected self, Encoding3 output, SerialDescriptor serialDesc) {
            ProviderSelection.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.providerId);
        }

        public final String getProviderId() {
            return this.providerId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreSelected(String providerId) {
            super(null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            this.providerId = providerId;
        }

        /* compiled from: ProviderSelection.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$PreSelected$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderSelection$PreSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PreSelected> serializer() {
                return ProviderSelection$PreSelected$$serializer.INSTANCE;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.ProviderSelection intoDomain2() {
        if (this instanceof UserSelected) {
            return new ProviderSelection.UserSelected(((UserSelected) this).getProviderId(), SchemeSelectionType.InstantPreferred.INSTANCE);
        }
        if (this instanceof PreSelected) {
            return new ProviderSelection.PreSelected(((PreSelected) this).getProviderId(), SchemeSelectionType.InstantPreferred.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
