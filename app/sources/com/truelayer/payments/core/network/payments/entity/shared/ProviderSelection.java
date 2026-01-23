package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.payments.ProviderSelection;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0016J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014HÇ\u0001R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "schemeSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "getSchemeSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "intoDomain", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "PreSelected", "UserSelected", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class ProviderSelection implements IntoDomain<com.truelayer.payments.core.domain.payments.ProviderSelection> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.ProviderSelection.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.ProviderSelection", Reflection.getOrCreateKotlinClass(ProviderSelection.class), new KClass[]{Reflection.getOrCreateKotlinClass(PreSelected.class), Reflection.getOrCreateKotlinClass(UserSelected.class)}, new KSerializer[]{ProviderSelection$PreSelected$$serializer.INSTANCE, ProviderSelection$UserSelected$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ ProviderSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ProviderSelection self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    public abstract SchemeSelectionType getSchemeSelection();

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$UserSelected;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "seen1", "", "providerId", "", "schemeSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "getSchemeSelection$annotations", "getSchemeSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("user_selected")
    public static final /* data */ class UserSelected extends ProviderSelection {
        private final String providerId;
        private final SchemeSelectionType schemeSelection;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType", Reflection.getOrCreateKotlinClass(SchemeSelectionType.class), new KClass[]{Reflection.getOrCreateKotlinClass(SchemeSelectionType.InstantOnly.class), Reflection.getOrCreateKotlinClass(SchemeSelectionType.InstantPreferred.class), Reflection.getOrCreateKotlinClass(SchemeSelectionType.UserSelected.class)}, new KSerializer[]{new ObjectSerializer("instant_only", SchemeSelectionType.InstantOnly.INSTANCE, new Annotation[0]), new ObjectSerializer("instant_preferred", SchemeSelectionType.InstantPreferred.INSTANCE, new Annotation[0]), new ObjectSerializer("user_selected", SchemeSelectionType.UserSelected.INSTANCE, new Annotation[0])}, new Annotation[0])};

        /* JADX WARN: Multi-variable type inference failed */
        public UserSelected() {
            this((String) null, (SchemeSelectionType) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserSelected copy$default(UserSelected userSelected, String str, SchemeSelectionType schemeSelectionType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userSelected.providerId;
            }
            if ((i & 2) != 0) {
                schemeSelectionType = userSelected.schemeSelection;
            }
            return userSelected.copy(str, schemeSelectionType);
        }

        @SerialName("provider_id")
        public static /* synthetic */ void getProviderId$annotations() {
        }

        @SerialName("scheme_selection")
        public static /* synthetic */ void getSchemeSelection$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final SchemeSelectionType getSchemeSelection() {
            return this.schemeSelection;
        }

        public final UserSelected copy(String providerId, SchemeSelectionType schemeSelection) {
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            return new UserSelected(providerId, schemeSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserSelected)) {
                return false;
            }
            UserSelected userSelected = (UserSelected) other;
            return Intrinsics.areEqual(this.providerId, userSelected.providerId) && Intrinsics.areEqual(this.schemeSelection, userSelected.schemeSelection);
        }

        public int hashCode() {
            String str = this.providerId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.schemeSelection.hashCode();
        }

        public String toString() {
            return "UserSelected(providerId=" + this.providerId + ", schemeSelection=" + this.schemeSelection + ")";
        }

        @Deprecated
        public /* synthetic */ UserSelected(int i, @SerialName("provider_id") String str, @SerialName("scheme_selection") SchemeSelectionType schemeSelectionType, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            this.providerId = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.schemeSelection = SchemeSelectionType.InstantPreferred.INSTANCE;
            } else {
                this.schemeSelection = schemeSelectionType;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(UserSelected self, Encoding3 output, SerialDescriptor serialDesc) {
            ProviderSelection.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.providerId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.providerId);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.getSchemeSelection(), SchemeSelectionType.InstantPreferred.INSTANCE)) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.getSchemeSelection());
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public /* synthetic */ UserSelected(String str, SchemeSelectionType schemeSelectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? SchemeSelectionType.InstantPreferred.INSTANCE : schemeSelectionType);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.ProviderSelection
        public SchemeSelectionType getSchemeSelection() {
            return this.schemeSelection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserSelected(String str, SchemeSelectionType schemeSelection) {
            super(null);
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            this.providerId = str;
            this.schemeSelection = schemeSelection;
        }

        /* compiled from: ProviderSelection.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$UserSelected$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "seen1", "", "providerId", "", "schemeSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "getSchemeSelection$annotations", "getSchemeSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("preselected")
    public static final /* data */ class PreSelected extends ProviderSelection {
        private final String providerId;
        private final SchemeSelectionType schemeSelection;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType", Reflection.getOrCreateKotlinClass(SchemeSelectionType.class), new KClass[]{Reflection.getOrCreateKotlinClass(SchemeSelectionType.InstantOnly.class), Reflection.getOrCreateKotlinClass(SchemeSelectionType.InstantPreferred.class), Reflection.getOrCreateKotlinClass(SchemeSelectionType.UserSelected.class)}, new KSerializer[]{new ObjectSerializer("instant_only", SchemeSelectionType.InstantOnly.INSTANCE, new Annotation[0]), new ObjectSerializer("instant_preferred", SchemeSelectionType.InstantPreferred.INSTANCE, new Annotation[0]), new ObjectSerializer("user_selected", SchemeSelectionType.UserSelected.INSTANCE, new Annotation[0])}, new Annotation[0])};

        public static /* synthetic */ PreSelected copy$default(PreSelected preSelected, String str, SchemeSelectionType schemeSelectionType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preSelected.providerId;
            }
            if ((i & 2) != 0) {
                schemeSelectionType = preSelected.schemeSelection;
            }
            return preSelected.copy(str, schemeSelectionType);
        }

        @SerialName("provider_id")
        public static /* synthetic */ void getProviderId$annotations() {
        }

        @SerialName("scheme_selection")
        public static /* synthetic */ void getSchemeSelection$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final SchemeSelectionType getSchemeSelection() {
            return this.schemeSelection;
        }

        public final PreSelected copy(String providerId, SchemeSelectionType schemeSelection) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            return new PreSelected(providerId, schemeSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreSelected)) {
                return false;
            }
            PreSelected preSelected = (PreSelected) other;
            return Intrinsics.areEqual(this.providerId, preSelected.providerId) && Intrinsics.areEqual(this.schemeSelection, preSelected.schemeSelection);
        }

        public int hashCode() {
            return (this.providerId.hashCode() * 31) + this.schemeSelection.hashCode();
        }

        public String toString() {
            return "PreSelected(providerId=" + this.providerId + ", schemeSelection=" + this.schemeSelection + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ PreSelected(int i, @SerialName("provider_id") String str, @SerialName("scheme_selection") SchemeSelectionType schemeSelectionType, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, ProviderSelection$PreSelected$$serializer.INSTANCE.getDescriptor());
            }
            this.providerId = str;
            if ((i & 2) == 0) {
                this.schemeSelection = SchemeSelectionType.InstantPreferred.INSTANCE;
            } else {
                this.schemeSelection = schemeSelectionType;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(PreSelected self, Encoding3 output, SerialDescriptor serialDesc) {
            ProviderSelection.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.providerId);
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.getSchemeSelection(), SchemeSelectionType.InstantPreferred.INSTANCE)) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.getSchemeSelection());
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public /* synthetic */ PreSelected(String str, SchemeSelectionType schemeSelectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? SchemeSelectionType.InstantPreferred.INSTANCE : schemeSelectionType);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.ProviderSelection
        public SchemeSelectionType getSchemeSelection() {
            return this.schemeSelection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreSelected(String providerId, SchemeSelectionType schemeSelection) {
            super(null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(schemeSelection, "schemeSelection");
            this.providerId = providerId;
            this.schemeSelection = schemeSelection;
        }

        /* compiled from: ProviderSelection.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$PreSelected$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection$PreSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
            return new ProviderSelection.UserSelected(((UserSelected) this).getProviderId(), getSchemeSelection().intoDomain2());
        }
        if (this instanceof PreSelected) {
            return new ProviderSelection.PreSelected(((PreSelected) this).getProviderId(), getSchemeSelection().intoDomain2());
        }
        throw new NoWhenBranchMatchedException();
    }
}
