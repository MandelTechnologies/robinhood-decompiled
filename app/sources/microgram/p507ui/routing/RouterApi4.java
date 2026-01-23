package microgram.p507ui.routing;

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
import kotlinx.serialization.json.JsonAnnotations;

/* compiled from: RouterApi.kt */
@JsonAnnotations(discriminator = "message_type")
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0005\u0013\u0012\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"microgram/ui/routing/RouterApi$Inbound", "", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lmicrogram/ui/routing/RouterApi$Inbound;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lmicrogram/ui/routing/RouterApi$Inbound;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "AlertActionTriggered", "Teardown", "ToastActionTriggered", "ToastDismissed", "Lmicrogram/ui/routing/RouterApi$Inbound$AlertActionTriggered;", "Lmicrogram/ui/routing/RouterApi$Inbound$Teardown;", "Lmicrogram/ui/routing/RouterApi$Inbound$ToastActionTriggered;", "Lmicrogram/ui/routing/RouterApi$Inbound$ToastDismissed;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* renamed from: microgram.ui.routing.RouterApi$Inbound, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class RouterApi4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.routing.RouterApi.Inbound.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("microgram.ui.routing.RouterApi.Inbound", Reflection.getOrCreateKotlinClass(RouterApi4.class), new KClass[]{Reflection.getOrCreateKotlinClass(AlertActionTriggered.class), Reflection.getOrCreateKotlinClass(Teardown.class), Reflection.getOrCreateKotlinClass(ToastActionTriggered.class), Reflection.getOrCreateKotlinClass(ToastDismissed.class)}, new KSerializer[]{RouterApi.INSTANCE, new ObjectSerializer("TEARDOWN", Teardown.INSTANCE, new Annotation[]{new RouterApi5("message_type")}), RouterApi2.INSTANCE, RouterApi3.INSTANCE}, new Annotation[]{new RouterApi5("message_type")});
        }
    });

    public /* synthetic */ RouterApi4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(RouterApi4 self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: RouterApi.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/routing/RouterApi$Inbound;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: microgram.ui.routing.RouterApi$Inbound$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RouterApi4.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RouterApi4> serializer() {
            return get$cachedSerializer();
        }
    }

    private RouterApi4() {
    }

    @Deprecated
    public /* synthetic */ RouterApi4(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: RouterApi.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$Teardown;", "Lmicrogram/ui/routing/RouterApi$Inbound;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("TEARDOWN")
    /* renamed from: microgram.ui.routing.RouterApi$Inbound$Teardown */
    public static final class Teardown extends RouterApi4 {
        public static final Teardown INSTANCE = new Teardown();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.routing.RouterApi.Inbound.Teardown.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("TEARDOWN", Teardown.INSTANCE, new Annotation[]{new RouterApi5("message_type")});
            }
        });

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Teardown> serializer() {
            return get$cachedSerializer();
        }

        private Teardown() {
            super(null);
        }
    }

    /* compiled from: RouterApi.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$AlertActionTriggered;", "Lmicrogram/ui/routing/RouterApi$Inbound;", "", "action", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/routing/RouterApi$Inbound$AlertActionTriggered;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("ACTION_TRIGGERED")
    /* renamed from: microgram.ui.routing.RouterApi$Inbound$AlertActionTriggered, reason: from toString */
    public static final /* data */ class AlertActionTriggered extends RouterApi4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String action;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlertActionTriggered) && Intrinsics.areEqual(this.action, ((AlertActionTriggered) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "AlertActionTriggered(action=" + this.action + ")";
        }

        /* compiled from: RouterApi.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$AlertActionTriggered$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/routing/RouterApi$Inbound$AlertActionTriggered;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: microgram.ui.routing.RouterApi$Inbound$AlertActionTriggered$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AlertActionTriggered> serializer() {
                return RouterApi.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ AlertActionTriggered(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, RouterApi.INSTANCE.getDescriptor());
            }
            this.action = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui(AlertActionTriggered self, Encoding3 output, SerialDescriptor serialDesc) {
            RouterApi4.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.action);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertActionTriggered(String action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }
    }

    /* compiled from: RouterApi.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0016¨\u0006#"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$ToastActionTriggered;", "Lmicrogram/ui/routing/RouterApi$Inbound;", "", "toastId", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/routing/RouterApi$Inbound$ToastActionTriggered;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToastId", "getAction", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("TOAST_ACTION_TRIGGERED")
    /* renamed from: microgram.ui.routing.RouterApi$Inbound$ToastActionTriggered, reason: from toString */
    public static final /* data */ class ToastActionTriggered extends RouterApi4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String action;
        private final String toastId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToastActionTriggered)) {
                return false;
            }
            ToastActionTriggered toastActionTriggered = (ToastActionTriggered) other;
            return Intrinsics.areEqual(this.toastId, toastActionTriggered.toastId) && Intrinsics.areEqual(this.action, toastActionTriggered.action);
        }

        public int hashCode() {
            return (this.toastId.hashCode() * 31) + this.action.hashCode();
        }

        public String toString() {
            return "ToastActionTriggered(toastId=" + this.toastId + ", action=" + this.action + ")";
        }

        /* compiled from: RouterApi.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$ToastActionTriggered$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/routing/RouterApi$Inbound$ToastActionTriggered;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: microgram.ui.routing.RouterApi$Inbound$ToastActionTriggered$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ToastActionTriggered> serializer() {
                return RouterApi2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ ToastActionTriggered(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, RouterApi2.INSTANCE.getDescriptor());
            }
            this.toastId = str;
            this.action = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui(ToastActionTriggered self, Encoding3 output, SerialDescriptor serialDesc) {
            RouterApi4.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.toastId);
            output.encodeStringElement(serialDesc, 1, self.action);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToastActionTriggered(String toastId, String action) {
            super(null);
            Intrinsics.checkNotNullParameter(toastId, "toastId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.toastId = toastId;
            this.action = action;
        }
    }

    /* compiled from: RouterApi.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$ToastDismissed;", "Lmicrogram/ui/routing/RouterApi$Inbound;", "", "toastId", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/routing/RouterApi$Inbound$ToastDismissed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToastId", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("TOAST_DISMISSED")
    /* renamed from: microgram.ui.routing.RouterApi$Inbound$ToastDismissed, reason: from toString */
    public static final /* data */ class ToastDismissed extends RouterApi4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String toastId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToastDismissed) && Intrinsics.areEqual(this.toastId, ((ToastDismissed) other).toastId);
        }

        public int hashCode() {
            return this.toastId.hashCode();
        }

        public String toString() {
            return "ToastDismissed(toastId=" + this.toastId + ")";
        }

        /* compiled from: RouterApi.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/routing/RouterApi$Inbound$ToastDismissed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/routing/RouterApi$Inbound$ToastDismissed;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: microgram.ui.routing.RouterApi$Inbound$ToastDismissed$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ToastDismissed> serializer() {
                return RouterApi3.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ ToastDismissed(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, RouterApi3.INSTANCE.getDescriptor());
            }
            this.toastId = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui(ToastDismissed self, Encoding3 output, SerialDescriptor serialDesc) {
            RouterApi4.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.toastId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToastDismissed(String toastId) {
            super(null);
            Intrinsics.checkNotNullParameter(toastId, "toastId");
            this.toastId = toastId;
        }
    }
}
