package com.truelayer.payments.core.network.payments.entity.request;

import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StartAuthorizationFlowRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0003 !\"B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\n¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;", "", "seen1", "", "inputTypes", "", "Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload$FormInputType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getInputTypes$annotations", "()V", "getInputTypes", "()Ljava/util/List;", "setInputTypes", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "FormInputType", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class FormPayload {
    private List<? extends FormInputType> inputTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FormInputType.INSTANCE.serializer())};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormPayload copy$default(FormPayload formPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = formPayload.inputTypes;
        }
        return formPayload.copy(list);
    }

    @SerialName("input_types")
    public static /* synthetic */ void getInputTypes$annotations() {
    }

    public final List<FormInputType> component1() {
        return this.inputTypes;
    }

    public final FormPayload copy(List<? extends FormInputType> inputTypes) {
        Intrinsics.checkNotNullParameter(inputTypes, "inputTypes");
        return new FormPayload(inputTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FormPayload) && Intrinsics.areEqual(this.inputTypes, ((FormPayload) other).inputTypes);
    }

    public int hashCode() {
        return this.inputTypes.hashCode();
    }

    public String toString() {
        return "FormPayload(inputTypes=" + this.inputTypes + ")";
    }

    /* compiled from: StartAuthorizationFlowRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FormPayload> serializer() {
            return FormPayload$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FormPayload(int i, @SerialName("input_types") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, FormPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.inputTypes = list;
    }

    public FormPayload(List<? extends FormInputType> inputTypes) {
        Intrinsics.checkNotNullParameter(inputTypes, "inputTypes");
        this.inputTypes = inputTypes;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartAuthorizationFlowRequest.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload$FormInputType;", "", "(Ljava/lang/String;I)V", "Text", "Select", "TextWithImage", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class FormInputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FormInputType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("text")
        public static final FormInputType Text = new FormInputType("Text", 0);

        @SerialName(Fields4.TYPE)
        public static final FormInputType Select = new FormInputType("Select", 1);

        @SerialName("text_with_image")
        public static final FormInputType TextWithImage = new FormInputType("TextWithImage", 2);

        private static final /* synthetic */ FormInputType[] $values() {
            return new FormInputType[]{Text, Select, TextWithImage};
        }

        public static EnumEntries<FormInputType> getEntries() {
            return $ENTRIES;
        }

        public static FormInputType valueOf(String str) {
            return (FormInputType) Enum.valueOf(FormInputType.class, str);
        }

        public static FormInputType[] values() {
            return (FormInputType[]) $VALUES.clone();
        }

        /* compiled from: StartAuthorizationFlowRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload$FormInputType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/FormPayload$FormInputType;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) FormInputType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<FormInputType> serializer() {
                return get$cachedSerializer();
            }
        }

        private FormInputType(String str, int i) {
        }

        static {
            FormInputType[] formInputTypeArr$values = $values();
            $VALUES = formInputTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(formInputTypeArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.request.FormPayload.FormInputType.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return Enums4.createAnnotatedEnumSerializer("com.truelayer.payments.core.network.payments.entity.request.FormPayload.FormInputType", FormInputType.values(), new String[]{"text", Fields4.TYPE, "text_with_image"}, new Annotation[][]{null, null, null}, null);
                }
            });
        }
    }

    public final List<FormInputType> getInputTypes() {
        return this.inputTypes;
    }

    public final void setInputTypes(List<? extends FormInputType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inputTypes = list;
    }
}
