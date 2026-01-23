package com.truelayer.payments.core.network.payments.entity.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.core.domain.utils.IntoDomain;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TranslatableText.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "seen1", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "", "key", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefault$annotations", "()V", "getDefault", "()Ljava/lang/String;", "getKey$annotations", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class TranslatableText implements IntoDomain<com.truelayer.payments.core.domain.payments.TranslatableText> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String default;
    private final String key;

    public static /* synthetic */ TranslatableText copy$default(TranslatableText translatableText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translatableText.default;
        }
        if ((i & 2) != 0) {
            str2 = translatableText.key;
        }
        return translatableText.copy(str, str2);
    }

    @SerialName(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT)
    public static /* synthetic */ void getDefault$annotations() {
    }

    @SerialName("key")
    public static /* synthetic */ void getKey$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefault() {
        return this.default;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final TranslatableText copy(String str, String key) {
        Intrinsics.checkNotNullParameter(str, "default");
        return new TranslatableText(str, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslatableText)) {
            return false;
        }
        TranslatableText translatableText = (TranslatableText) other;
        return Intrinsics.areEqual(this.default, translatableText.default) && Intrinsics.areEqual(this.key, translatableText.key);
    }

    public int hashCode() {
        int iHashCode = this.default.hashCode() * 31;
        String str = this.key;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TranslatableText(default=" + this.default + ", key=" + this.key + ")";
    }

    /* compiled from: TranslatableText.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TranslatableText> serializer() {
            return TranslatableText4.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TranslatableText(int i, @SerialName(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT) String str, @SerialName("key") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, TranslatableText4.INSTANCE.getDescriptor());
        }
        this.default = str;
        if ((i & 2) == 0) {
            this.key = null;
        } else {
            this.key = str2;
        }
    }

    public TranslatableText(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "default");
        this.default = str;
        this.key = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(TranslatableText self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.default);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.key == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.key);
    }

    public /* synthetic */ TranslatableText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getDefault() {
        return this.default;
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    public com.truelayer.payments.core.domain.payments.TranslatableText intoDomain() {
        return new com.truelayer.payments.core.domain.payments.TranslatableText(this.default, this.key);
    }
}
