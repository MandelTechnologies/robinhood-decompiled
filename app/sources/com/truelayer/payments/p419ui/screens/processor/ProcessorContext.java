package com.truelayer.payments.p419ui.screens.processor;

import android.os.Parcel;
import android.os.Parcelable;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.p419ui.models.PaymentContext;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProcessorContext.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J#\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u0015J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\"#¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "Landroid/os/Parcelable;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "id", "", "getId", "()Ljava/lang/String;", "redirectUri", "getRedirectUri", "resourceToken", "getResourceToken", "intoPaymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "isReactNative", "", "integrationVersion", "intoPaymentContext$payments_ui_release", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "MandateContext", "MandatePreferences", "PaymentContext", "PaymentPreferences", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandateContext;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentContext;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public abstract class ProcessorContext implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorContext.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.ui.screens.processor.ProcessorContext", Reflection.getOrCreateKotlinClass(ProcessorContext.class), new KClass[]{Reflection.getOrCreateKotlinClass(MandateContext.class), Reflection.getOrCreateKotlinClass(PaymentContext.class)}, new KSerializer[]{ProcessorContext2.INSTANCE, ProcessorContext4.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ ProcessorContext(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ProcessorContext self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    public abstract String getId();

    public abstract String getRedirectUri();

    public abstract String getResourceToken();

    /* compiled from: ProcessorContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProcessorContext.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProcessorContext> serializer() {
            return get$cachedSerializer();
        }
    }

    private ProcessorContext() {
    }

    @Deprecated
    public /* synthetic */ ProcessorContext(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: ProcessorContext.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'J\u0019\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006."}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentContext;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "seen1", "", "id", "", "resourceToken", "redirectUri", "preferences", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;)V", "getId", "()Ljava/lang/String;", "getPreferences", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;", "getRedirectUri", "getResourceToken", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class PaymentContext extends ProcessorContext {
        public static final int $stable = 0;
        private final String id;
        private final PaymentPreferences preferences;
        private final String redirectUri;
        private final String resourceToken;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentContext> CREATOR = new Creator();

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentContext createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentContext(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentPreferences.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentContext[] newArray(int i) {
                return new PaymentContext[i];
            }
        }

        public static /* synthetic */ PaymentContext copy$default(PaymentContext paymentContext, String str, String str2, String str3, PaymentPreferences paymentPreferences, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentContext.id;
            }
            if ((i & 2) != 0) {
                str2 = paymentContext.resourceToken;
            }
            if ((i & 4) != 0) {
                str3 = paymentContext.redirectUri;
            }
            if ((i & 8) != 0) {
                paymentPreferences = paymentContext.preferences;
            }
            return paymentContext.copy(str, str2, str3, paymentPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResourceToken() {
            return this.resourceToken;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentPreferences getPreferences() {
            return this.preferences;
        }

        public final PaymentContext copy(String id, String resourceToken, String redirectUri, PaymentPreferences preferences) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            return new PaymentContext(id, resourceToken, redirectUri, preferences);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentContext)) {
                return false;
            }
            PaymentContext paymentContext = (PaymentContext) other;
            return Intrinsics.areEqual(this.id, paymentContext.id) && Intrinsics.areEqual(this.resourceToken, paymentContext.resourceToken) && Intrinsics.areEqual(this.redirectUri, paymentContext.redirectUri) && Intrinsics.areEqual(this.preferences, paymentContext.preferences);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.resourceToken.hashCode()) * 31) + this.redirectUri.hashCode()) * 31;
            PaymentPreferences paymentPreferences = this.preferences;
            return iHashCode + (paymentPreferences == null ? 0 : paymentPreferences.hashCode());
        }

        public String toString() {
            return "PaymentContext(id=" + this.id + ", resourceToken=" + this.resourceToken + ", redirectUri=" + this.redirectUri + ", preferences=" + this.preferences + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.resourceToken);
            parcel.writeString(this.redirectUri);
            PaymentPreferences paymentPreferences = this.preferences;
            if (paymentPreferences == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                paymentPreferences.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentContext;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PaymentContext> serializer() {
                return ProcessorContext4.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ PaymentContext(int i, String str, String str2, String str3, PaymentPreferences paymentPreferences, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, ProcessorContext4.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.resourceToken = str2;
            this.redirectUri = str3;
            if ((i & 8) == 0) {
                this.preferences = null;
            } else {
                this.preferences = paymentPreferences;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_ui_release(PaymentContext self, Encoding3 output, SerialDescriptor serialDesc) {
            ProcessorContext.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getResourceToken());
            output.encodeStringElement(serialDesc, 2, self.getRedirectUri());
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.preferences == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, ProcessorContext5.INSTANCE, self.preferences);
        }

        public /* synthetic */ PaymentContext(String str, String str2, String str3, PaymentPreferences paymentPreferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : paymentPreferences);
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getResourceToken() {
            return this.resourceToken;
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getRedirectUri() {
            return this.redirectUri;
        }

        public final PaymentPreferences getPreferences() {
            return this.preferences;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentContext(String id, String resourceToken, String redirectUri, PaymentPreferences paymentPreferences) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.id = id;
            this.resourceToken = resourceToken;
            this.redirectUri = redirectUri;
            this.preferences = paymentPreferences;
        }
    }

    /* compiled from: ProcessorContext.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'J\u0019\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006."}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandateContext;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "seen1", "", "id", "", "resourceToken", "redirectUri", "preferences", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;)V", "getId", "()Ljava/lang/String;", "getPreferences", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;", "getRedirectUri", "getResourceToken", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class MandateContext extends ProcessorContext {
        public static final int $stable = 0;
        private final String id;
        private final MandatePreferences preferences;
        private final String redirectUri;
        private final String resourceToken;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<MandateContext> CREATOR = new Creator();

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MandateContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandateContext createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MandateContext(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MandatePreferences.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandateContext[] newArray(int i) {
                return new MandateContext[i];
            }
        }

        public static /* synthetic */ MandateContext copy$default(MandateContext mandateContext, String str, String str2, String str3, MandatePreferences mandatePreferences, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mandateContext.id;
            }
            if ((i & 2) != 0) {
                str2 = mandateContext.resourceToken;
            }
            if ((i & 4) != 0) {
                str3 = mandateContext.redirectUri;
            }
            if ((i & 8) != 0) {
                mandatePreferences = mandateContext.preferences;
            }
            return mandateContext.copy(str, str2, str3, mandatePreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResourceToken() {
            return this.resourceToken;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: component4, reason: from getter */
        public final MandatePreferences getPreferences() {
            return this.preferences;
        }

        public final MandateContext copy(String id, String resourceToken, String redirectUri, MandatePreferences preferences) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            return new MandateContext(id, resourceToken, redirectUri, preferences);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MandateContext)) {
                return false;
            }
            MandateContext mandateContext = (MandateContext) other;
            return Intrinsics.areEqual(this.id, mandateContext.id) && Intrinsics.areEqual(this.resourceToken, mandateContext.resourceToken) && Intrinsics.areEqual(this.redirectUri, mandateContext.redirectUri) && Intrinsics.areEqual(this.preferences, mandateContext.preferences);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.resourceToken.hashCode()) * 31) + this.redirectUri.hashCode()) * 31;
            MandatePreferences mandatePreferences = this.preferences;
            return iHashCode + (mandatePreferences == null ? 0 : mandatePreferences.hashCode());
        }

        public String toString() {
            return "MandateContext(id=" + this.id + ", resourceToken=" + this.resourceToken + ", redirectUri=" + this.redirectUri + ", preferences=" + this.preferences + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.resourceToken);
            parcel.writeString(this.redirectUri);
            MandatePreferences mandatePreferences = this.preferences;
            if (mandatePreferences == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                mandatePreferences.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandateContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandateContext;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MandateContext> serializer() {
                return ProcessorContext2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ MandateContext(int i, String str, String str2, String str3, MandatePreferences mandatePreferences, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, ProcessorContext2.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.resourceToken = str2;
            this.redirectUri = str3;
            if ((i & 8) == 0) {
                this.preferences = null;
            } else {
                this.preferences = mandatePreferences;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_ui_release(MandateContext self, Encoding3 output, SerialDescriptor serialDesc) {
            ProcessorContext.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeStringElement(serialDesc, 1, self.getResourceToken());
            output.encodeStringElement(serialDesc, 2, self.getRedirectUri());
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.preferences == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, ProcessorContext3.INSTANCE, self.preferences);
        }

        public /* synthetic */ MandateContext(String str, String str2, String str3, MandatePreferences mandatePreferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : mandatePreferences);
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getResourceToken() {
            return this.resourceToken;
        }

        @Override // com.truelayer.payments.p419ui.screens.processor.ProcessorContext
        public String getRedirectUri() {
            return this.redirectUri;
        }

        public final MandatePreferences getPreferences() {
            return this.preferences;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MandateContext(String id, String resourceToken, String redirectUri, MandatePreferences mandatePreferences) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.id = id;
            this.resourceToken = resourceToken;
            this.redirectUri = redirectUri;
            this.preferences = mandatePreferences;
        }
    }

    /* compiled from: ProcessorContext.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(J\u0019\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;", "Landroid/os/Parcelable;", "seen1", "", "preferredCountryCode", "", "shouldPresentResultScreen", "", "waitTimeMillis", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZJ)V", "getPreferredCountryCode", "()Ljava/lang/String;", "getShouldPresentResultScreen", "()Z", "getWaitTimeMillis", "()J", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "intoInternalPreferences", "Lcom/truelayer/payments/ui/models/PaymentContext$Preferences;", "intoInternalPreferences$payments_ui_release", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class PaymentPreferences implements Parcelable {
        public static final int $stable = 0;
        private final String preferredCountryCode;
        private final boolean shouldPresentResultScreen;
        private final long waitTimeMillis;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentPreferences> CREATOR = new Creator();

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentPreferences> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPreferences createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentPreferences(parcel.readString(), parcel.readInt() != 0, parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPreferences[] newArray(int i) {
                return new PaymentPreferences[i];
            }
        }

        public PaymentPreferences() {
            this((String) null, false, 0L, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PaymentPreferences copy$default(PaymentPreferences paymentPreferences, String str, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentPreferences.preferredCountryCode;
            }
            if ((i & 2) != 0) {
                z = paymentPreferences.shouldPresentResultScreen;
            }
            if ((i & 4) != 0) {
                j = paymentPreferences.waitTimeMillis;
            }
            return paymentPreferences.copy(str, z, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPreferredCountryCode() {
            return this.preferredCountryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldPresentResultScreen() {
            return this.shouldPresentResultScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final long getWaitTimeMillis() {
            return this.waitTimeMillis;
        }

        public final PaymentPreferences copy(String preferredCountryCode, boolean shouldPresentResultScreen, long waitTimeMillis) {
            return new PaymentPreferences(preferredCountryCode, shouldPresentResultScreen, waitTimeMillis);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentPreferences)) {
                return false;
            }
            PaymentPreferences paymentPreferences = (PaymentPreferences) other;
            return Intrinsics.areEqual(this.preferredCountryCode, paymentPreferences.preferredCountryCode) && this.shouldPresentResultScreen == paymentPreferences.shouldPresentResultScreen && this.waitTimeMillis == paymentPreferences.waitTimeMillis;
        }

        public int hashCode() {
            String str = this.preferredCountryCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.shouldPresentResultScreen)) * 31) + Long.hashCode(this.waitTimeMillis);
        }

        public String toString() {
            return "PaymentPreferences(preferredCountryCode=" + this.preferredCountryCode + ", shouldPresentResultScreen=" + this.shouldPresentResultScreen + ", waitTimeMillis=" + this.waitTimeMillis + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.preferredCountryCode);
            parcel.writeInt(this.shouldPresentResultScreen ? 1 : 0);
            parcel.writeLong(this.waitTimeMillis);
        }

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$PaymentPreferences;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PaymentPreferences> serializer() {
                return ProcessorContext5.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ PaymentPreferences(int i, String str, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
            this.preferredCountryCode = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.shouldPresentResultScreen = true;
            } else {
                this.shouldPresentResultScreen = z;
            }
            if ((i & 4) == 0) {
                this.waitTimeMillis = 3000L;
            } else {
                this.waitTimeMillis = j;
            }
        }

        public PaymentPreferences(String str, boolean z, long j) {
            this.preferredCountryCode = str;
            this.shouldPresentResultScreen = z;
            this.waitTimeMillis = j;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_ui_release(PaymentPreferences self, Encoding3 output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.preferredCountryCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.preferredCountryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.shouldPresentResultScreen) {
                output.encodeBooleanElement(serialDesc, 1, self.shouldPresentResultScreen);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.waitTimeMillis == 3000) {
                return;
            }
            output.encodeLongElement(serialDesc, 2, self.waitTimeMillis);
        }

        public /* synthetic */ PaymentPreferences(String str, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? 3000L : j);
        }

        public final String getPreferredCountryCode() {
            return this.preferredCountryCode;
        }

        public final boolean getShouldPresentResultScreen() {
            return this.shouldPresentResultScreen;
        }

        public final long getWaitTimeMillis() {
            return this.waitTimeMillis;
        }

        public final PaymentContext.Preferences intoInternalPreferences$payments_ui_release() {
            return new PaymentContext.Preferences(this.preferredCountryCode, this.shouldPresentResultScreen, this.waitTimeMillis);
        }
    }

    /* compiled from: ProcessorContext.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(J\u0019\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;", "Landroid/os/Parcelable;", "seen1", "", "preferredCountryCode", "", "shouldPresentResultScreen", "", "waitTimeMillis", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZJ)V", "getPreferredCountryCode", "()Ljava/lang/String;", "getShouldPresentResultScreen", "()Z", "getWaitTimeMillis", "()J", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "intoInternalPreferences", "Lcom/truelayer/payments/ui/models/PaymentContext$Preferences;", "intoInternalPreferences$payments_ui_release", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class MandatePreferences implements Parcelable {
        public static final int $stable = 0;
        private final String preferredCountryCode;
        private final boolean shouldPresentResultScreen;
        private final long waitTimeMillis;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<MandatePreferences> CREATOR = new Creator();

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MandatePreferences> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandatePreferences createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MandatePreferences(parcel.readString(), parcel.readInt() != 0, parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandatePreferences[] newArray(int i) {
                return new MandatePreferences[i];
            }
        }

        public MandatePreferences() {
            this((String) null, false, 0L, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ MandatePreferences copy$default(MandatePreferences mandatePreferences, String str, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mandatePreferences.preferredCountryCode;
            }
            if ((i & 2) != 0) {
                z = mandatePreferences.shouldPresentResultScreen;
            }
            if ((i & 4) != 0) {
                j = mandatePreferences.waitTimeMillis;
            }
            return mandatePreferences.copy(str, z, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPreferredCountryCode() {
            return this.preferredCountryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldPresentResultScreen() {
            return this.shouldPresentResultScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final long getWaitTimeMillis() {
            return this.waitTimeMillis;
        }

        public final MandatePreferences copy(String preferredCountryCode, boolean shouldPresentResultScreen, long waitTimeMillis) {
            return new MandatePreferences(preferredCountryCode, shouldPresentResultScreen, waitTimeMillis);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MandatePreferences)) {
                return false;
            }
            MandatePreferences mandatePreferences = (MandatePreferences) other;
            return Intrinsics.areEqual(this.preferredCountryCode, mandatePreferences.preferredCountryCode) && this.shouldPresentResultScreen == mandatePreferences.shouldPresentResultScreen && this.waitTimeMillis == mandatePreferences.waitTimeMillis;
        }

        public int hashCode() {
            String str = this.preferredCountryCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.shouldPresentResultScreen)) * 31) + Long.hashCode(this.waitTimeMillis);
        }

        public String toString() {
            return "MandatePreferences(preferredCountryCode=" + this.preferredCountryCode + ", shouldPresentResultScreen=" + this.shouldPresentResultScreen + ", waitTimeMillis=" + this.waitTimeMillis + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.preferredCountryCode);
            parcel.writeInt(this.shouldPresentResultScreen ? 1 : 0);
            parcel.writeLong(this.waitTimeMillis);
        }

        /* compiled from: ProcessorContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext$MandatePreferences;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MandatePreferences> serializer() {
                return ProcessorContext3.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ MandatePreferences(int i, String str, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
            this.preferredCountryCode = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.shouldPresentResultScreen = true;
            } else {
                this.shouldPresentResultScreen = z;
            }
            if ((i & 4) == 0) {
                this.waitTimeMillis = 3000L;
            } else {
                this.waitTimeMillis = j;
            }
        }

        public MandatePreferences(String str, boolean z, long j) {
            this.preferredCountryCode = str;
            this.shouldPresentResultScreen = z;
            this.waitTimeMillis = j;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_ui_release(MandatePreferences self, Encoding3 output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.preferredCountryCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.preferredCountryCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.shouldPresentResultScreen) {
                output.encodeBooleanElement(serialDesc, 1, self.shouldPresentResultScreen);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.waitTimeMillis == 3000) {
                return;
            }
            output.encodeLongElement(serialDesc, 2, self.waitTimeMillis);
        }

        public /* synthetic */ MandatePreferences(String str, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? 3000L : j);
        }

        public final String getPreferredCountryCode() {
            return this.preferredCountryCode;
        }

        public final boolean getShouldPresentResultScreen() {
            return this.shouldPresentResultScreen;
        }

        public final long getWaitTimeMillis() {
            return this.waitTimeMillis;
        }

        public final PaymentContext.Preferences intoInternalPreferences$payments_ui_release() {
            return new PaymentContext.Preferences(this.preferredCountryCode, this.shouldPresentResultScreen, this.waitTimeMillis);
        }
    }

    public static /* synthetic */ com.truelayer.payments.p419ui.models.PaymentContext intoPaymentContext$payments_ui_release$default(ProcessorContext processorContext, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intoPaymentContext");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return processorContext.intoPaymentContext$payments_ui_release(z, str);
    }

    public final com.truelayer.payments.p419ui.models.PaymentContext intoPaymentContext$payments_ui_release(boolean isReactNative, String integrationVersion) {
        TrueLayerAnalytics.IntegrationType integrationType = isReactNative ? TrueLayerAnalytics.IntegrationType.ReactNative : TrueLayerAnalytics.IntegrationType.Native;
        if (this instanceof PaymentContext) {
            PaymentContext.Preferences preferencesIntoInternalPreferences$payments_ui_release = null;
            String id = getId();
            String resourceToken = getResourceToken();
            String redirectUri = getRedirectUri();
            PaymentPreferences preferences = ((PaymentContext) this).getPreferences();
            if (preferences != null) {
                preferencesIntoInternalPreferences$payments_ui_release = preferences.intoInternalPreferences$payments_ui_release();
            }
            return new com.truelayer.payments.p419ui.models.PaymentContext(id, resourceToken, redirectUri, preferencesIntoInternalPreferences$payments_ui_release, PaymentContext.PaymentType.SinglePayment, integrationType, integrationVersion);
        }
        PaymentContext.Preferences preferencesIntoInternalPreferences$payments_ui_release2 = null;
        if (!(this instanceof MandateContext)) {
            throw new NoWhenBranchMatchedException();
        }
        String id2 = getId();
        String resourceToken2 = getResourceToken();
        String redirectUri2 = getRedirectUri();
        MandatePreferences preferences2 = ((MandateContext) this).getPreferences();
        if (preferences2 != null) {
            preferencesIntoInternalPreferences$payments_ui_release2 = preferences2.intoInternalPreferences$payments_ui_release();
        }
        return new com.truelayer.payments.p419ui.models.PaymentContext(id2, resourceToken2, redirectUri2, preferencesIntoInternalPreferences$payments_ui_release2, PaymentContext.PaymentType.Mandate, integrationType, integrationVersion);
    }
}
