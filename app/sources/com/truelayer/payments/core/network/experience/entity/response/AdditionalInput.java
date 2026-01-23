package com.truelayer.payments.core.network.experience.entity.response;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.utils.IntoDomain;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AdditionalInput.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0001\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Info", "Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput$Info;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class AdditionalInput implements IntoDomain<com.truelayer.payments.core.domain.payments.AdditionalInput> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.experience.entity.response.AdditionalInput.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.experience.entity.response.AdditionalInput", Reflection.getOrCreateKotlinClass(AdditionalInput.class), new KClass[]{Reflection.getOrCreateKotlinClass(Info.class)}, new KSerializer[]{AdditionalInput2.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ AdditionalInput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(AdditionalInput self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: AdditionalInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AdditionalInput.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AdditionalInput> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: AdditionalInput.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006*"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput$Info;", "Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput;", "seen1", "", "key", "", "element", "text", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getElement$annotations", "()V", "getElement", "()Ljava/lang/String;", "getKey$annotations", "getKey", "getText$annotations", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput$Info;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName(SduiFeatureDiscovery3.INFO_TAG)
    public static final /* data */ class Info extends AdditionalInput {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String element;
        private final String key;
        private final String text;

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.key;
            }
            if ((i & 2) != 0) {
                str2 = info.element;
            }
            if ((i & 4) != 0) {
                str3 = info.text;
            }
            return info.copy(str, str2, str3);
        }

        @SerialName("element")
        public static /* synthetic */ void getElement$annotations() {
        }

        @SerialName("key")
        public static /* synthetic */ void getKey$annotations() {
        }

        @SerialName("text")
        public static /* synthetic */ void getText$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getElement() {
            return this.element;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Info copy(String key, String element, String text) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Info(key, element, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.key, info.key) && Intrinsics.areEqual(this.element, info.element) && Intrinsics.areEqual(this.text, info.text);
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.element.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Info(key=" + this.key + ", element=" + this.element + ", text=" + this.text + ")";
        }

        /* compiled from: AdditionalInput.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput$Info$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput$Info;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Info> serializer() {
                return AdditionalInput2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Info(int i, @SerialName("key") String str, @SerialName("element") String str2, @SerialName("text") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, AdditionalInput2.INSTANCE.getDescriptor());
            }
            this.key = str;
            this.element = str2;
            this.text = str3;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Info self, Encoding3 output, SerialDescriptor serialDesc) {
            AdditionalInput.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.key);
            output.encodeStringElement(serialDesc, 1, self.element);
            output.encodeStringElement(serialDesc, 2, self.text);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getElement() {
            return this.element;
        }

        public final String getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Info(String key, String element, String text) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(text, "text");
            this.key = key;
            this.element = element;
            this.text = text;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.AdditionalInput intoDomain2() {
            return new AdditionalInput.Info(this.key, Intrinsics.areEqual(this.element, MerchantRewardDetailComposable.BANNER_TEST_TAG) ? AdditionalInput.InfoElement.Banner : AdditionalInput.InfoElement.Unknown, this.text);
        }
    }

    private AdditionalInput() {
    }

    @Deprecated
    public /* synthetic */ AdditionalInput(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
