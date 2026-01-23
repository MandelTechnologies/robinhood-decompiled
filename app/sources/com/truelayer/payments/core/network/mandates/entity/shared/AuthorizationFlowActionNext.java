package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AuthorizationFlowActionNext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010HÇ\u0001\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "intoDomain", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Consent", "ProviderSelection", "Redirect", "Wait", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Consent;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$ProviderSelection;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Redirect;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Wait;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class AuthorizationFlowActionNext implements IntoDomain<AuthorizationFlow2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlowActionNext.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlowActionNext", Reflection.getOrCreateKotlinClass(AuthorizationFlowActionNext.class), new KClass[]{Reflection.getOrCreateKotlinClass(Consent.class), Reflection.getOrCreateKotlinClass(ProviderSelection.class), Reflection.getOrCreateKotlinClass(Redirect.class), Reflection.getOrCreateKotlinClass(Wait.class)}, new KSerializer[]{AuthorizationFlowActionNext$Consent$$serializer.INSTANCE, AuthorizationFlowActionNext$ProviderSelection$$serializer.INSTANCE, AuthorizationFlowActionNext$Redirect$$serializer.INSTANCE, AuthorizationFlowActionNext$Wait$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ AuthorizationFlowActionNext(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(AuthorizationFlowActionNext self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: AuthorizationFlowActionNext.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$ProviderSelection;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "seen1", "", "providers", "", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PaymentProvider;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getProviders$annotations", "()V", "getProviders", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("provider_selection")
    public static final /* data */ class ProviderSelection extends AuthorizationFlowActionNext {
        private final List<PaymentProvider> providers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PaymentProvider3.INSTANCE)};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProviderSelection copy$default(ProviderSelection providerSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = providerSelection.providers;
            }
            return providerSelection.copy(list);
        }

        @SerialName("providers")
        public static /* synthetic */ void getProviders$annotations() {
        }

        public final List<PaymentProvider> component1() {
            return this.providers;
        }

        public final ProviderSelection copy(List<PaymentProvider> providers) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            return new ProviderSelection(providers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProviderSelection) && Intrinsics.areEqual(this.providers, ((ProviderSelection) other).providers);
        }

        public int hashCode() {
            return this.providers.hashCode();
        }

        public String toString() {
            return "ProviderSelection(providers=" + this.providers + ")";
        }

        /* compiled from: AuthorizationFlowActionNext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$ProviderSelection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$ProviderSelection;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProviderSelection> serializer() {
                return AuthorizationFlowActionNext$ProviderSelection$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ ProviderSelection(int i, @SerialName("providers") List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, AuthorizationFlowActionNext$ProviderSelection$$serializer.INSTANCE.getDescriptor());
            }
            this.providers = list;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(ProviderSelection self, Encoding3 output, SerialDescriptor serialDesc) {
            AuthorizationFlowActionNext.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.providers);
        }

        public final List<PaymentProvider> getProviders() {
            return this.providers;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderSelection(List<PaymentProvider> providers) {
            super(null);
            Intrinsics.checkNotNullParameter(providers, "providers");
            this.providers = providers;
        }
    }

    private AuthorizationFlowActionNext() {
    }

    @Deprecated
    public /* synthetic */ AuthorizationFlowActionNext(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: AuthorizationFlowActionNext.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Redirect;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "seen1", "", "uri", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getUri$annotations", "()V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("redirect")
    public static final /* data */ class Redirect extends AuthorizationFlowActionNext {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String uri;

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.uri;
            }
            return redirect.copy(str);
        }

        @SerialName("uri")
        public static /* synthetic */ void getUri$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final Redirect copy(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Redirect(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.areEqual(this.uri, ((Redirect) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "Redirect(uri=" + this.uri + ")";
        }

        /* compiled from: AuthorizationFlowActionNext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Redirect$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Redirect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Redirect> serializer() {
                return AuthorizationFlowActionNext$Redirect$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Redirect(int i, @SerialName("uri") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, AuthorizationFlowActionNext$Redirect$$serializer.INSTANCE.getDescriptor());
            }
            this.uri = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Redirect self, Encoding3 output, SerialDescriptor serialDesc) {
            AuthorizationFlowActionNext.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.uri);
        }

        public final String getUri() {
            return this.uri;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redirect(String uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }
    }

    /* compiled from: AuthorizationFlowActionNext.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Wait;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "seen1", "", "displayMessage", "Lcom/truelayer/payments/core/network/mandates/entity/shared/TranslatableText;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/shared/TranslatableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/TranslatableText;)V", "getDisplayMessage$annotations", "()V", "getDisplayMessage", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/TranslatableText;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("wait")
    public static final /* data */ class Wait extends AuthorizationFlowActionNext {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TranslatableText displayMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Wait() {
            this((TranslatableText) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Wait copy$default(Wait wait, TranslatableText translatableText, int i, Object obj) {
            if ((i & 1) != 0) {
                translatableText = wait.displayMessage;
            }
            return wait.copy(translatableText);
        }

        @SerialName("display_message")
        public static /* synthetic */ void getDisplayMessage$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TranslatableText getDisplayMessage() {
            return this.displayMessage;
        }

        public final Wait copy(TranslatableText displayMessage) {
            return new Wait(displayMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Wait) && Intrinsics.areEqual(this.displayMessage, ((Wait) other).displayMessage);
        }

        public int hashCode() {
            TranslatableText translatableText = this.displayMessage;
            if (translatableText == null) {
                return 0;
            }
            return translatableText.hashCode();
        }

        public String toString() {
            return "Wait(displayMessage=" + this.displayMessage + ")";
        }

        /* compiled from: AuthorizationFlowActionNext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Wait$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Wait;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Wait> serializer() {
                return AuthorizationFlowActionNext$Wait$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Wait(int i, @SerialName("display_message") TranslatableText translatableText, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.displayMessage = null;
            } else {
                this.displayMessage = translatableText;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Wait self, Encoding3 output, SerialDescriptor serialDesc) {
            AuthorizationFlowActionNext.write$Self(self, output, serialDesc);
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.displayMessage == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, TranslatableText3.INSTANCE, self.displayMessage);
        }

        public /* synthetic */ Wait(TranslatableText translatableText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : translatableText);
        }

        public final TranslatableText getDisplayMessage() {
            return this.displayMessage;
        }

        public Wait(TranslatableText translatableText) {
            super(null);
            this.displayMessage = translatableText;
        }
    }

    /* compiled from: AuthorizationFlowActionNext.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Consent;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "seen1", "", "subsequentActionHint", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getSubsequentActionHint$annotations", "()V", "getSubsequentActionHint", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("consent")
    public static final /* data */ class Consent extends AuthorizationFlowActionNext {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String subsequentActionHint;

        public static /* synthetic */ Consent copy$default(Consent consent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = consent.subsequentActionHint;
            }
            return consent.copy(str);
        }

        @SerialName("subsequent_action_hint")
        public static /* synthetic */ void getSubsequentActionHint$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubsequentActionHint() {
            return this.subsequentActionHint;
        }

        public final Consent copy(String subsequentActionHint) {
            Intrinsics.checkNotNullParameter(subsequentActionHint, "subsequentActionHint");
            return new Consent(subsequentActionHint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Consent) && Intrinsics.areEqual(this.subsequentActionHint, ((Consent) other).subsequentActionHint);
        }

        public int hashCode() {
            return this.subsequentActionHint.hashCode();
        }

        public String toString() {
            return "Consent(subsequentActionHint=" + this.subsequentActionHint + ")";
        }

        /* compiled from: AuthorizationFlowActionNext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Consent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Consent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Consent> serializer() {
                return AuthorizationFlowActionNext$Consent$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Consent(int i, @SerialName("subsequent_action_hint") String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, AuthorizationFlowActionNext$Consent$$serializer.INSTANCE.getDescriptor());
            }
            this.subsequentActionHint = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Consent self, Encoding3 output, SerialDescriptor serialDesc) {
            AuthorizationFlowActionNext.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.subsequentActionHint);
        }

        public final String getSubsequentActionHint() {
            return this.subsequentActionHint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Consent(String subsequentActionHint) {
            super(null);
            Intrinsics.checkNotNullParameter(subsequentActionHint, "subsequentActionHint");
            this.subsequentActionHint = subsequentActionHint;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public AuthorizationFlow2 intoDomain2() {
        AuthorizationFlow2.SubsequentActionHint subsequentActionHint;
        if (this instanceof ProviderSelection) {
            List<PaymentProvider> providers = ((ProviderSelection) this).getProviders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(providers, 10));
            Iterator<T> it = providers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaymentProvider) it.next()).intoDomain2());
            }
            return new AuthorizationFlow2.ProviderSelection(arrayList);
        }
        if (this instanceof Redirect) {
            return new AuthorizationFlow2.Redirect(((Redirect) this).getUri());
        }
        if (this instanceof Wait) {
            TranslatableText displayMessage = ((Wait) this).getDisplayMessage();
            return new AuthorizationFlow2.Wait(displayMessage != null ? displayMessage.intoDomain2() : null);
        }
        if (!(this instanceof Consent)) {
            throw new NoWhenBranchMatchedException();
        }
        String subsequentActionHint2 = ((Consent) this).getSubsequentActionHint();
        if (Intrinsics.areEqual(subsequentActionHint2, "redirect")) {
            subsequentActionHint = AuthorizationFlow2.SubsequentActionHint.Redirect;
        } else {
            subsequentActionHint = Intrinsics.areEqual(subsequentActionHint2, "form") ? AuthorizationFlow2.SubsequentActionHint.Form : AuthorizationFlow2.SubsequentActionHint.Unknown;
        }
        return new AuthorizationFlow2.Consent(subsequentActionHint);
    }

    /* compiled from: AuthorizationFlowActionNext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/AuthorizationFlowActionNext;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AuthorizationFlowActionNext.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AuthorizationFlowActionNext> serializer() {
            return get$cachedSerializer();
        }
    }
}
