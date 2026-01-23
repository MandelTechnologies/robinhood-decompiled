package com.truelayer.payments.core.network.payments.entity.shared;

import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.payments.Image;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FormInput.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003 !\"¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "displayText", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "getDisplayText", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "id", "", "getId", "()Ljava/lang/String;", "mandatory", "", "getMandatory", "()Z", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Select", "Text", "TextWithImage", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class FormInput implements IntoDomain<com.truelayer.payments.core.domain.payments.FormInput> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.FormInput.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.FormInput", Reflection.getOrCreateKotlinClass(FormInput.class), new KClass[]{Reflection.getOrCreateKotlinClass(Select.class), Reflection.getOrCreateKotlinClass(Text.class), Reflection.getOrCreateKotlinClass(TextWithImage.class)}, new KSerializer[]{FormInput$Select$$serializer.INSTANCE, FormInput$Text$$serializer.INSTANCE, FormInput$TextWithImage$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ FormInput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FormInput self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    public abstract TranslatableText getDisplayText();

    public abstract String getId();

    public abstract boolean getMandatory();

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FormInput.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FormInput> serializer() {
            return get$cachedSerializer();
        }
    }

    private FormInput() {
    }

    @Deprecated
    public /* synthetic */ FormInput(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0004QRSTB\u0087\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003Jt\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\b\u0010F\u001a\u00020GH\u0016J\t\u0010H\u001a\u00020\u0005HÖ\u0001J&\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OHÁ\u0001¢\u0006\u0002\bPR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010/\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010/\u0012\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010.R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0018\u001a\u0004\b3\u00104R\u001c\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010)¨\u0006U"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput;", "seen1", "", "id", "", "mandatory", "", "displayText", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "format", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "sensitive", "minLength", "maxLength", "regexes", "", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextValidator;", "description", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)V", "getDescription$annotations", "()V", "getDescription", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "getDisplayText$annotations", "getDisplayText", "setDisplayText", "(Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)V", "getFormat$annotations", "getFormat", "()Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMandatory$annotations", "getMandatory", "()Z", "setMandatory", "(Z)V", "getMaxLength$annotations", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinLength$annotations", "getMinLength", "getRegexes$annotations", "getRegexes", "()Ljava/util/List;", "getSensitive$annotations", "getSensitive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text;", "equals", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "TextFormat", "TextValidator", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("text")
    @SourceDebugExtension
    public static final /* data */ class Text extends FormInput {
        private final TranslatableText description;
        private TranslatableText displayText;
        private final TextFormat format;
        private String id;
        private boolean mandatory;
        private final Integer maxLength;
        private final Integer minLength;
        private final List<TextValidator> regexes;
        private final boolean sensitive;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(FormInput$Text$TextValidator$$serializer.INSTANCE), null};

        public static /* synthetic */ Text copy$default(Text text, String str, boolean z, TranslatableText translatableText, TextFormat textFormat, boolean z2, Integer num, Integer num2, List list, TranslatableText translatableText2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.id;
            }
            if ((i & 2) != 0) {
                z = text.mandatory;
            }
            if ((i & 4) != 0) {
                translatableText = text.displayText;
            }
            if ((i & 8) != 0) {
                textFormat = text.format;
            }
            if ((i & 16) != 0) {
                z2 = text.sensitive;
            }
            if ((i & 32) != 0) {
                num = text.minLength;
            }
            if ((i & 64) != 0) {
                num2 = text.maxLength;
            }
            if ((i & 128) != 0) {
                list = text.regexes;
            }
            if ((i & 256) != 0) {
                translatableText2 = text.description;
            }
            List list2 = list;
            TranslatableText translatableText3 = translatableText2;
            Integer num3 = num;
            Integer num4 = num2;
            boolean z3 = z2;
            TranslatableText translatableText4 = translatableText;
            return text.copy(str, z, translatableText4, textFormat, z3, num3, num4, list2, translatableText3);
        }

        @SerialName("description")
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("display_text")
        public static /* synthetic */ void getDisplayText$annotations() {
        }

        @SerialName("format")
        public static /* synthetic */ void getFormat$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("mandatory")
        public static /* synthetic */ void getMandatory$annotations() {
        }

        @SerialName("max_length")
        public static /* synthetic */ void getMaxLength$annotations() {
        }

        @SerialName("min_length")
        public static /* synthetic */ void getMinLength$annotations() {
        }

        @SerialName("regexes")
        public static /* synthetic */ void getRegexes$annotations() {
        }

        @SerialName("sensitive")
        public static /* synthetic */ void getSensitive$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* renamed from: component3, reason: from getter */
        public final TranslatableText getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component4, reason: from getter */
        public final TextFormat getFormat() {
            return this.format;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSensitive() {
            return this.sensitive;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getMinLength() {
            return this.minLength;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMaxLength() {
            return this.maxLength;
        }

        public final List<TextValidator> component8() {
            return this.regexes;
        }

        /* renamed from: component9, reason: from getter */
        public final TranslatableText getDescription() {
            return this.description;
        }

        public final Text copy(String id, boolean mandatory, TranslatableText displayText, TextFormat format2, boolean sensitive, Integer minLength, Integer maxLength, List<TextValidator> regexes, TranslatableText description) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(regexes, "regexes");
            return new Text(id, mandatory, displayText, format2, sensitive, minLength, maxLength, regexes, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.id, text.id) && this.mandatory == text.mandatory && Intrinsics.areEqual(this.displayText, text.displayText) && this.format == text.format && this.sensitive == text.sensitive && Intrinsics.areEqual(this.minLength, text.minLength) && Intrinsics.areEqual(this.maxLength, text.maxLength) && Intrinsics.areEqual(this.regexes, text.regexes) && Intrinsics.areEqual(this.description, text.description);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.mandatory)) * 31) + this.displayText.hashCode()) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.sensitive)) * 31;
            Integer num = this.minLength;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxLength;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.regexes.hashCode()) * 31;
            TranslatableText translatableText = this.description;
            return iHashCode3 + (translatableText != null ? translatableText.hashCode() : 0);
        }

        public String toString() {
            return "Text(id=" + this.id + ", mandatory=" + this.mandatory + ", displayText=" + this.displayText + ", format=" + this.format + ", sensitive=" + this.sensitive + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ", regexes=" + this.regexes + ", description=" + this.description + ")";
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Text> serializer() {
                return FormInput$Text$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Text(int i, @SerialName("id") String str, @SerialName("mandatory") boolean z, @SerialName("display_text") TranslatableText translatableText, @SerialName("format") TextFormat textFormat, @SerialName("sensitive") boolean z2, @SerialName("min_length") Integer num, @SerialName("max_length") Integer num2, @SerialName("regexes") List list, @SerialName("description") TranslatableText translatableText2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (23 != (i & 23)) {
                PluginExceptions.throwMissingFieldException(i, 23, FormInput$Text$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.mandatory = z;
            this.displayText = translatableText;
            if ((i & 8) == 0) {
                this.format = TextFormat.Any;
            } else {
                this.format = textFormat;
            }
            this.sensitive = z2;
            if ((i & 32) == 0) {
                this.minLength = null;
            } else {
                this.minLength = num;
            }
            if ((i & 64) == 0) {
                this.maxLength = null;
            } else {
                this.maxLength = num2;
            }
            if ((i & 128) == 0) {
                this.regexes = CollectionsKt.emptyList();
            } else {
                this.regexes = list;
            }
            if ((i & 256) == 0) {
                this.description = null;
            } else {
                this.description = translatableText2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Text self, Encoding3 output, SerialDescriptor serialDesc) {
            FormInput.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeBooleanElement(serialDesc, 1, self.getMandatory());
            TranslatableText4 translatableText4 = TranslatableText4.INSTANCE;
            output.encodeSerializableElement(serialDesc, 2, translatableText4, self.getDisplayText());
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.format != TextFormat.Any) {
                output.encodeSerializableElement(serialDesc, 3, TextFormat.TextFormatSerializer.INSTANCE, self.format);
            }
            output.encodeBooleanElement(serialDesc, 4, self.sensitive);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.minLength != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.minLength);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.maxLength != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.maxLength);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.regexes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.regexes);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.description == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 8, translatableText4, self.description);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public boolean getMandatory() {
            return this.mandatory;
        }

        public void setMandatory(boolean z) {
            this.mandatory = z;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public TranslatableText getDisplayText() {
            return this.displayText;
        }

        public void setDisplayText(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.displayText = translatableText;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Text(java.lang.String r13, boolean r14, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText r15, com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.TextFormat r16, boolean r17, java.lang.Integer r18, java.lang.Integer r19, java.util.List r20, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 8
                if (r1 == 0) goto La
                com.truelayer.payments.core.network.payments.entity.shared.FormInput$Text$TextFormat r1 = com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.TextFormat.Any
                r6 = r1
                goto Lc
            La:
                r6 = r16
            Lc:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L13
                r8 = r2
                goto L15
            L13:
                r8 = r18
            L15:
                r1 = r0 & 64
                if (r1 == 0) goto L1b
                r9 = r2
                goto L1d
            L1b:
                r9 = r19
            L1d:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L27
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                r10 = r1
                goto L29
            L27:
                r10 = r20
            L29:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L35
                r11 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r7 = r17
                r2 = r12
                goto L3d
            L35:
                r11 = r21
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r7 = r17
            L3d:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.<init>(java.lang.String, boolean, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText, com.truelayer.payments.core.network.payments.entity.shared.FormInput$Text$TextFormat, boolean, java.lang.Integer, java.lang.Integer, java.util.List, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final TextFormat getFormat() {
            return this.format;
        }

        public final boolean getSensitive() {
            return this.sensitive;
        }

        public final Integer getMinLength() {
            return this.minLength;
        }

        public final Integer getMaxLength() {
            return this.maxLength;
        }

        public final List<TextValidator> getRegexes() {
            return this.regexes;
        }

        public final TranslatableText getDescription() {
            return this.description;
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextValidator;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$RegexValidation;", "seen1", "", "regex", "", "message", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)V", "getMessage$annotations", "()V", "getMessage", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "getRegex$annotations", "getRegex", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class TextValidator implements IntoDomain<FormInput.Text.RegexValidation> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TranslatableText message;
            private final String regex;

            public static /* synthetic */ TextValidator copy$default(TextValidator textValidator, String str, TranslatableText translatableText, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textValidator.regex;
                }
                if ((i & 2) != 0) {
                    translatableText = textValidator.message;
                }
                return textValidator.copy(str, translatableText);
            }

            @SerialName("message")
            public static /* synthetic */ void getMessage$annotations() {
            }

            @SerialName("regex")
            public static /* synthetic */ void getRegex$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getRegex() {
                return this.regex;
            }

            /* renamed from: component2, reason: from getter */
            public final TranslatableText getMessage() {
                return this.message;
            }

            public final TextValidator copy(String regex, TranslatableText message) {
                Intrinsics.checkNotNullParameter(regex, "regex");
                Intrinsics.checkNotNullParameter(message, "message");
                return new TextValidator(regex, message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextValidator)) {
                    return false;
                }
                TextValidator textValidator = (TextValidator) other;
                return Intrinsics.areEqual(this.regex, textValidator.regex) && Intrinsics.areEqual(this.message, textValidator.message);
            }

            public int hashCode() {
                return (this.regex.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                return "TextValidator(regex=" + this.regex + ", message=" + this.message + ")";
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextValidator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextValidator;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TextValidator> serializer() {
                    return FormInput$Text$TextValidator$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ TextValidator(int i, @SerialName("regex") String str, @SerialName("message") TranslatableText translatableText, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, FormInput$Text$TextValidator$$serializer.INSTANCE.getDescriptor());
                }
                this.regex = str;
                this.message = translatableText;
            }

            public TextValidator(String regex, TranslatableText message) {
                Intrinsics.checkNotNullParameter(regex, "regex");
                Intrinsics.checkNotNullParameter(message, "message");
                this.regex = regex;
                this.message = message;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(TextValidator self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.regex);
                output.encodeSerializableElement(serialDesc, 1, TranslatableText4.INSTANCE, self.message);
            }

            public final String getRegex() {
                return this.regex;
            }

            public final TranslatableText getMessage() {
                return this.message;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public FormInput.Text.RegexValidation intoDomain2() {
                return new FormInput.Text.RegexValidation(new Regex(this.regex), this.message.intoDomain2());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String id, boolean z, TranslatableText displayText, TextFormat format2, boolean z2, Integer num, Integer num2, List<TextValidator> regexes, TranslatableText translatableText) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(regexes, "regexes");
            this.id = id;
            this.mandatory = z;
            this.displayText = displayText;
            this.format = format2;
            this.sensitive = z2;
            this.minLength = num;
            this.maxLength = num2;
            this.regexes = regexes;
            this.description = translatableText;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0014\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/FormInput$Text$TextFormat;", "format", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "intoDomain", "Any", "SortCode", "AccountNumber", "IBAN", "Email", "Alphabetical", "Alphanumerical", "Numerical", "Companion", "TextFormatSerializer", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable(with = TextFormatSerializer.class)
        public static final class TextFormat implements IntoDomain<FormInput.Text.TextFormat> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextFormat[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private String format;
            public static final TextFormat Any = new TextFormat("Any", 0, "any");
            public static final TextFormat SortCode = new TextFormat("SortCode", 1, "sort_code");
            public static final TextFormat AccountNumber = new TextFormat("AccountNumber", 2, "account_number");
            public static final TextFormat IBAN = new TextFormat("IBAN", 3, "iban");
            public static final TextFormat Email = new TextFormat("Email", 4, "email");
            public static final TextFormat Alphabetical = new TextFormat("Alphabetical", 5, "alphabetical");
            public static final TextFormat Alphanumerical = new TextFormat("Alphanumerical", 6, "alphanumerical");
            public static final TextFormat Numerical = new TextFormat("Numerical", 7, "numerical");

            /* compiled from: FormInput.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextFormat.values().length];
                    try {
                        iArr[TextFormat.Any.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextFormat.SortCode.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextFormat.AccountNumber.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TextFormat.IBAN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TextFormat.Email.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TextFormat.Alphabetical.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TextFormat.Alphanumerical.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[TextFormat.Numerical.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private static final /* synthetic */ TextFormat[] $values() {
                return new TextFormat[]{Any, SortCode, AccountNumber, IBAN, Email, Alphabetical, Alphanumerical, Numerical};
            }

            public static EnumEntries<TextFormat> getEntries() {
                return $ENTRIES;
            }

            public static TextFormat valueOf(String str) {
                return (TextFormat) Enum.valueOf(TextFormat.class, str);
            }

            public static TextFormat[] values() {
                return (TextFormat[]) $VALUES.clone();
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return (KSerializer) TextFormat.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer<TextFormat> serializer() {
                    return get$cachedSerializer();
                }
            }

            private TextFormat(String str, int i, String str2) {
                this.format = str2;
            }

            public final String getFormat() {
                return this.format;
            }

            public final void setFormat(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.format = str;
            }

            static {
                TextFormat[] textFormatArr$values = $values();
                $VALUES = textFormatArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textFormatArr$values);
                INSTANCE = new Companion(null);
                $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.TextFormat.Companion.1
                    @Override // kotlin.jvm.functions.Function0
                    public final KSerializer<Object> invoke() {
                        return TextFormatSerializer.INSTANCE;
                    }
                });
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public FormInput.Text.TextFormat intoDomain2() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return FormInput.Text.TextFormat.Any;
                    case 2:
                        return FormInput.Text.TextFormat.SortCode;
                    case 3:
                        return FormInput.Text.TextFormat.AccountNumber;
                    case 4:
                        return FormInput.Text.TextFormat.IBAN;
                    case 5:
                        return FormInput.Text.TextFormat.Email;
                    case 6:
                        return FormInput.Text.TextFormat.Alphabetical;
                    case 7:
                        return FormInput.Text.TextFormat.Alphanumerical;
                    case 8:
                        return FormInput.Text.TextFormat.Numerical;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat$TextFormatSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class TextFormatSerializer implements KSerializer<TextFormat> {
                public static final TextFormatSerializer INSTANCE = new TextFormatSerializer();
                private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("TextFormat", SerialKinds2.STRING.INSTANCE);

                private TextFormatSerializer() {
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TextFormat value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeString(value.getFormat());
                }

                @Override // kotlinx.serialization.KSerializer2
                public TextFormat deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    String strDecodeString = decoder.decodeString();
                    TextFormat textFormat = TextFormat.Any;
                    if (Intrinsics.areEqual(strDecodeString, textFormat.getFormat())) {
                        return textFormat;
                    }
                    TextFormat textFormat2 = TextFormat.SortCode;
                    if (Intrinsics.areEqual(strDecodeString, textFormat2.getFormat())) {
                        return textFormat2;
                    }
                    TextFormat textFormat3 = TextFormat.AccountNumber;
                    if (Intrinsics.areEqual(strDecodeString, textFormat3.getFormat())) {
                        return textFormat3;
                    }
                    TextFormat textFormat4 = TextFormat.IBAN;
                    if (Intrinsics.areEqual(strDecodeString, textFormat4.getFormat())) {
                        return textFormat4;
                    }
                    TextFormat textFormat5 = TextFormat.Email;
                    if (Intrinsics.areEqual(strDecodeString, textFormat5.getFormat())) {
                        return textFormat5;
                    }
                    TextFormat textFormat6 = TextFormat.Alphabetical;
                    if (Intrinsics.areEqual(strDecodeString, textFormat6.getFormat())) {
                        return textFormat6;
                    }
                    TextFormat textFormat7 = TextFormat.Alphanumerical;
                    if (Intrinsics.areEqual(strDecodeString, textFormat7.getFormat())) {
                        return textFormat7;
                    }
                    TextFormat textFormat8 = TextFormat.Numerical;
                    if (Intrinsics.areEqual(strDecodeString, textFormat8.getFormat())) {
                        return textFormat8;
                    }
                    Logger6.e$default(Logger6.INSTANCE, "Failed to parse text format: " + strDecodeString, null, null, 6, null);
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Failed to parse text format: " + strDecodeString, ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, null));
                    return textFormat;
                }
            }
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.FormInput intoDomain2() {
            PrimitiveRanges2 primitiveRanges2;
            String id = getId();
            com.truelayer.payments.core.domain.payments.TranslatableText translatableTextIntoDomain2 = getDisplayText().intoDomain2();
            FormInput.Text.TextFormat textFormatIntoDomain2 = this.format.intoDomain2();
            boolean z = this.sensitive;
            boolean mandatory = getMandatory();
            if (this.minLength == null && this.maxLength == null) {
                primitiveRanges2 = null;
            } else {
                Integer num = this.minLength;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = this.maxLength;
                primitiveRanges2 = new PrimitiveRanges2(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
            }
            List<TextValidator> list = this.regexes;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TextValidator) it.next()).intoDomain2());
            }
            FormInput.Text.TextInputValidation textInputValidation = new FormInput.Text.TextInputValidation(mandatory, primitiveRanges2, arrayList);
            TranslatableText translatableText = this.description;
            return new FormInput.Text(id, translatableTextIntoDomain2, null, translatableText != null ? translatableText.intoDomain2() : null, textFormatIntoDomain2, z, textInputValidation);
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0003WXYB\u0093\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0018J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00103J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J~\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\b\u0010L\u001a\u00020MH\u0016J\t\u0010N\u001a\u00020\u0005HÖ\u0001J&\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UHÁ\u0001¢\u0006\u0002\bVR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R$\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00104\u0012\u0004\b1\u0010\u001a\u001a\u0004\b2\u00103R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00104\u0012\u0004\b5\u0010\u001a\u001a\u0004\b6\u00103R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001a\u001a\u0004\b8\u00109R\u001c\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010.¨\u0006Z"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput;", "seen1", "", "id", "", "mandatory", "", "displayText", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "format", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "sensitive", "minLength", "maxLength", "regexes", "", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextValidator;", "description", "image", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;)V", "getDescription$annotations", "()V", "getDescription", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "getDisplayText$annotations", "getDisplayText", "setDisplayText", "(Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)V", "getFormat$annotations", "getFormat", "()Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getImage$annotations", "getImage", "()Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "getMandatory$annotations", "getMandatory", "()Z", "setMandatory", "(Z)V", "getMaxLength$annotations", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinLength$annotations", "getMinLength", "getRegexes$annotations", "getRegexes", "()Ljava/util/List;", "getSensitive$annotations", "getSensitive", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text$TextFormat;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;)Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage;", "equals", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/FormInput$TextWithImage;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "Image", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("text_with_image")
    @SourceDebugExtension
    public static final /* data */ class TextWithImage extends FormInput {
        private final TranslatableText description;
        private TranslatableText displayText;
        private final Text.TextFormat format;
        private String id;
        private final Image image;
        private boolean mandatory;
        private final Integer maxLength;
        private final Integer minLength;
        private final List<Text.TextValidator> regexes;
        private final boolean sensitive;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(FormInput$Text$TextValidator$$serializer.INSTANCE), null, Image.INSTANCE.serializer()};

        public static /* synthetic */ TextWithImage copy$default(TextWithImage textWithImage, String str, boolean z, TranslatableText translatableText, Text.TextFormat textFormat, boolean z2, Integer num, Integer num2, List list, TranslatableText translatableText2, Image image, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textWithImage.id;
            }
            if ((i & 2) != 0) {
                z = textWithImage.mandatory;
            }
            if ((i & 4) != 0) {
                translatableText = textWithImage.displayText;
            }
            if ((i & 8) != 0) {
                textFormat = textWithImage.format;
            }
            if ((i & 16) != 0) {
                z2 = textWithImage.sensitive;
            }
            if ((i & 32) != 0) {
                num = textWithImage.minLength;
            }
            if ((i & 64) != 0) {
                num2 = textWithImage.maxLength;
            }
            if ((i & 128) != 0) {
                list = textWithImage.regexes;
            }
            if ((i & 256) != 0) {
                translatableText2 = textWithImage.description;
            }
            if ((i & 512) != 0) {
                image = textWithImage.image;
            }
            TranslatableText translatableText3 = translatableText2;
            Image image2 = image;
            Integer num3 = num2;
            List list2 = list;
            boolean z3 = z2;
            Integer num4 = num;
            return textWithImage.copy(str, z, translatableText, textFormat, z3, num4, num3, list2, translatableText3, image2);
        }

        @SerialName("description")
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("display_text")
        public static /* synthetic */ void getDisplayText$annotations() {
        }

        @SerialName("format")
        public static /* synthetic */ void getFormat$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("image")
        public static /* synthetic */ void getImage$annotations() {
        }

        @SerialName("mandatory")
        public static /* synthetic */ void getMandatory$annotations() {
        }

        @SerialName("max_length")
        public static /* synthetic */ void getMaxLength$annotations() {
        }

        @SerialName("min_length")
        public static /* synthetic */ void getMinLength$annotations() {
        }

        @SerialName("regexes")
        public static /* synthetic */ void getRegexes$annotations() {
        }

        @SerialName("sensitive")
        public static /* synthetic */ void getSensitive$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* renamed from: component3, reason: from getter */
        public final TranslatableText getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component4, reason: from getter */
        public final Text.TextFormat getFormat() {
            return this.format;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSensitive() {
            return this.sensitive;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getMinLength() {
            return this.minLength;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMaxLength() {
            return this.maxLength;
        }

        public final List<Text.TextValidator> component8() {
            return this.regexes;
        }

        /* renamed from: component9, reason: from getter */
        public final TranslatableText getDescription() {
            return this.description;
        }

        public final TextWithImage copy(String id, boolean mandatory, TranslatableText displayText, Text.TextFormat format2, boolean sensitive, Integer minLength, Integer maxLength, List<Text.TextValidator> regexes, TranslatableText description, Image image) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(regexes, "regexes");
            Intrinsics.checkNotNullParameter(image, "image");
            return new TextWithImage(id, mandatory, displayText, format2, sensitive, minLength, maxLength, regexes, description, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithImage)) {
                return false;
            }
            TextWithImage textWithImage = (TextWithImage) other;
            return Intrinsics.areEqual(this.id, textWithImage.id) && this.mandatory == textWithImage.mandatory && Intrinsics.areEqual(this.displayText, textWithImage.displayText) && this.format == textWithImage.format && this.sensitive == textWithImage.sensitive && Intrinsics.areEqual(this.minLength, textWithImage.minLength) && Intrinsics.areEqual(this.maxLength, textWithImage.maxLength) && Intrinsics.areEqual(this.regexes, textWithImage.regexes) && Intrinsics.areEqual(this.description, textWithImage.description) && Intrinsics.areEqual(this.image, textWithImage.image);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.mandatory)) * 31) + this.displayText.hashCode()) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.sensitive)) * 31;
            Integer num = this.minLength;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxLength;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.regexes.hashCode()) * 31;
            TranslatableText translatableText = this.description;
            return ((iHashCode3 + (translatableText != null ? translatableText.hashCode() : 0)) * 31) + this.image.hashCode();
        }

        public String toString() {
            return "TextWithImage(id=" + this.id + ", mandatory=" + this.mandatory + ", displayText=" + this.displayText + ", format=" + this.format + ", sensitive=" + this.sensitive + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ", regexes=" + this.regexes + ", description=" + this.description + ", image=" + this.image + ")";
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TextWithImage> serializer() {
                return FormInput$TextWithImage$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ TextWithImage(int i, @SerialName("id") String str, @SerialName("mandatory") boolean z, @SerialName("display_text") TranslatableText translatableText, @SerialName("format") Text.TextFormat textFormat, @SerialName("sensitive") boolean z2, @SerialName("min_length") Integer num, @SerialName("max_length") Integer num2, @SerialName("regexes") List list, @SerialName("description") TranslatableText translatableText2, @SerialName("image") Image image, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (535 != (i & 535)) {
                PluginExceptions.throwMissingFieldException(i, 535, FormInput$TextWithImage$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.mandatory = z;
            this.displayText = translatableText;
            if ((i & 8) == 0) {
                this.format = Text.TextFormat.Any;
            } else {
                this.format = textFormat;
            }
            this.sensitive = z2;
            if ((i & 32) == 0) {
                this.minLength = null;
            } else {
                this.minLength = num;
            }
            if ((i & 64) == 0) {
                this.maxLength = null;
            } else {
                this.maxLength = num2;
            }
            if ((i & 128) == 0) {
                this.regexes = CollectionsKt.emptyList();
            } else {
                this.regexes = list;
            }
            if ((i & 256) == 0) {
                this.description = null;
            } else {
                this.description = translatableText2;
            }
            this.image = image;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(TextWithImage self, Encoding3 output, SerialDescriptor serialDesc) {
            FormInput.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeBooleanElement(serialDesc, 1, self.getMandatory());
            TranslatableText4 translatableText4 = TranslatableText4.INSTANCE;
            output.encodeSerializableElement(serialDesc, 2, translatableText4, self.getDisplayText());
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.format != Text.TextFormat.Any) {
                output.encodeSerializableElement(serialDesc, 3, Text.TextFormat.TextFormatSerializer.INSTANCE, self.format);
            }
            output.encodeBooleanElement(serialDesc, 4, self.sensitive);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.minLength != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.minLength);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.maxLength != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.maxLength);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.regexes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.regexes);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.description != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, translatableText4, self.description);
            }
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.image);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public boolean getMandatory() {
            return this.mandatory;
        }

        public void setMandatory(boolean z) {
            this.mandatory = z;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public TranslatableText getDisplayText() {
            return this.displayText;
        }

        public void setDisplayText(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.displayText = translatableText;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TextWithImage(java.lang.String r14, boolean r15, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText r16, com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.TextFormat r17, boolean r18, java.lang.Integer r19, java.lang.Integer r20, java.util.List r21, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText r22, com.truelayer.payments.core.network.payments.entity.shared.FormInput.TextWithImage.Image r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r13 = this;
                r0 = r24
                r1 = r0 & 8
                if (r1 == 0) goto La
                com.truelayer.payments.core.network.payments.entity.shared.FormInput$Text$TextFormat r1 = com.truelayer.payments.core.network.payments.entity.shared.FormInput.Text.TextFormat.Any
                r6 = r1
                goto Lc
            La:
                r6 = r17
            Lc:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L13
                r8 = r2
                goto L15
            L13:
                r8 = r19
            L15:
                r1 = r0 & 64
                if (r1 == 0) goto L1b
                r9 = r2
                goto L1d
            L1b:
                r9 = r20
            L1d:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L27
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                r10 = r1
                goto L29
            L27:
                r10 = r21
            L29:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L38
                r11 = r2
                r3 = r14
                r4 = r15
                r5 = r16
                r7 = r18
                r12 = r23
                r2 = r13
                goto L43
            L38:
                r11 = r22
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r7 = r18
                r12 = r23
            L43:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.truelayer.payments.core.network.payments.entity.shared.FormInput.TextWithImage.<init>(java.lang.String, boolean, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText, com.truelayer.payments.core.network.payments.entity.shared.FormInput$Text$TextFormat, boolean, java.lang.Integer, java.lang.Integer, java.util.List, com.truelayer.payments.core.network.payments.entity.shared.TranslatableText, com.truelayer.payments.core.network.payments.entity.shared.FormInput$TextWithImage$Image, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Text.TextFormat getFormat() {
            return this.format;
        }

        public final boolean getSensitive() {
            return this.sensitive;
        }

        public final Integer getMinLength() {
            return this.minLength;
        }

        public final Integer getMaxLength() {
            return this.maxLength;
        }

        public final List<Text.TextValidator> getRegexes() {
            return this.regexes;
        }

        public final TranslatableText getDescription() {
            return this.description;
        }

        public final Image getImage() {
            return this.image;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextWithImage(String id, boolean z, TranslatableText displayText, Text.TextFormat format2, boolean z2, Integer num, Integer num2, List<Text.TextValidator> regexes, TranslatableText translatableText, Image image) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(regexes, "regexes");
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = id;
            this.mandatory = z;
            this.displayText = displayText;
            this.format = format2;
            this.sensitive = z2;
            this.minLength = num;
            this.maxLength = num2;
            this.regexes = regexes;
            this.description = translatableText;
            this.image = image;
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u0011\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/Image;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Base64", "Companion", "Uri", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Base64;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Uri;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static abstract class Image implements IntoDomain<com.truelayer.payments.core.domain.payments.Image> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.FormInput.TextWithImage.Image.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.FormInput.TextWithImage.Image", Reflection.getOrCreateKotlinClass(Image.class), new KClass[]{Reflection.getOrCreateKotlinClass(Base64.class), Reflection.getOrCreateKotlinClass(Uri.class)}, new KSerializer[]{FormInput$TextWithImage$Image$Base64$$serializer.INSTANCE, FormInput$TextWithImage$Image$Uri$$serializer.INSTANCE}, new Annotation[0]);
                }
            });

            public /* synthetic */ Image(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self(Image self, Encoding3 output, SerialDescriptor serialDesc) {
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Base64;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "seen1", "", WebsocketGatewayConstants.DATA_KEY, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Image$Base64;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            @Serializable
            @SerialName("base64")
            public static final /* data */ class Base64 extends Image {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String data;

                public static /* synthetic */ Base64 copy$default(Base64 base64, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = base64.data;
                    }
                    return base64.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getData() {
                    return this.data;
                }

                public final Base64 copy(String data) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    return new Base64(data);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Base64) && Intrinsics.areEqual(this.data, ((Base64) other).data);
                }

                public int hashCode() {
                    return this.data.hashCode();
                }

                public String toString() {
                    return "Base64(data=" + this.data + ")";
                }

                /* compiled from: FormInput.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Base64$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Base64;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<Base64> serializer() {
                        return FormInput$TextWithImage$Image$Base64$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @Deprecated
                public /* synthetic */ Base64(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    super(i, serializationConstructorMarker);
                    if (1 != (i & 1)) {
                        PluginExceptions.throwMissingFieldException(i, 1, FormInput$TextWithImage$Image$Base64$$serializer.INSTANCE.getDescriptor());
                    }
                    this.data = str;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$payments_core_release(Base64 self, Encoding3 output, SerialDescriptor serialDesc) {
                    Image.write$Self(self, output, serialDesc);
                    output.encodeStringElement(serialDesc, 0, self.data);
                }

                public final String getData() {
                    return this.data;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Base64(String data) {
                    super(null);
                    Intrinsics.checkNotNullParameter(data, "data");
                    this.data = data;
                }

                @Override // com.truelayer.payments.core.domain.utils.IntoDomain
                /* renamed from: intoDomain */
                public com.truelayer.payments.core.domain.payments.Image intoDomain2() {
                    return new Image.Base64(this.data);
                }
            }

            private Image() {
            }

            @Deprecated
            public /* synthetic */ Image(int i, SerializationConstructorMarker serializationConstructorMarker) {
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Uri;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "seen1", "", "uri", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/Image$Uri;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            @Serializable
            @SerialName("uri")
            public static final /* data */ class Uri extends Image {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String uri;

                public static /* synthetic */ Uri copy$default(Uri uri, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = uri.uri;
                    }
                    return uri.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUri() {
                    return this.uri;
                }

                public final Uri copy(String uri) {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    return new Uri(uri);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Uri) && Intrinsics.areEqual(this.uri, ((Uri) other).uri);
                }

                public int hashCode() {
                    return this.uri.hashCode();
                }

                public String toString() {
                    return "Uri(uri=" + this.uri + ")";
                }

                /* compiled from: FormInput.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Uri$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Uri;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<Uri> serializer() {
                        return FormInput$TextWithImage$Image$Uri$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @Deprecated
                public /* synthetic */ Uri(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    super(i, serializationConstructorMarker);
                    if (1 != (i & 1)) {
                        PluginExceptions.throwMissingFieldException(i, 1, FormInput$TextWithImage$Image$Uri$$serializer.INSTANCE.getDescriptor());
                    }
                    this.uri = str;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$payments_core_release(Uri self, Encoding3 output, SerialDescriptor serialDesc) {
                    Image.write$Self(self, output, serialDesc);
                    output.encodeStringElement(serialDesc, 0, self.uri);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Uri(String uri) {
                    super(null);
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    this.uri = uri;
                }

                public final String getUri() {
                    return this.uri;
                }

                @Override // com.truelayer.payments.core.domain.utils.IntoDomain
                /* renamed from: intoDomain */
                public com.truelayer.payments.core.domain.payments.Image intoDomain2() {
                    return new Image.Uri(this.uri);
                }
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage$Image;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return (KSerializer) Image.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Image> serializer() {
                    return get$cachedSerializer();
                }
            }
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.FormInput intoDomain2() {
            PrimitiveRanges2 primitiveRanges2;
            String id = getId();
            com.truelayer.payments.core.domain.payments.TranslatableText translatableTextIntoDomain2 = getDisplayText().intoDomain2();
            FormInput.Text.TextFormat textFormatIntoDomain2 = this.format.intoDomain2();
            boolean z = this.sensitive;
            boolean mandatory = getMandatory();
            if (this.minLength == null && this.maxLength == null) {
                primitiveRanges2 = null;
            } else {
                Integer num = this.minLength;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = this.maxLength;
                primitiveRanges2 = new PrimitiveRanges2(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
            }
            List<Text.TextValidator> list = this.regexes;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Text.TextValidator) it.next()).intoDomain2());
            }
            FormInput.Text.TextInputValidation textInputValidation = new FormInput.Text.TextInputValidation(mandatory, primitiveRanges2, arrayList);
            TranslatableText translatableText = this.description;
            return new FormInput.TextWithImage(id, translatableTextIntoDomain2, null, translatableText != null ? translatableText.intoDomain2() : null, this.image.intoDomain2(), textFormatIntoDomain2, z, textInputValidation);
        }
    }

    /* compiled from: FormInput.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000389:BM\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\u0010J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J7\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\b\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0005HÖ\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R$\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006;"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput;", "seen1", "", "id", "", "mandatory", "", "displayText", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "options", "", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select$SelectOption;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Ljava/util/List;)V", "getDisplayText$annotations", "()V", "getDisplayText", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "setDisplayText", "(Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;)V", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMandatory$annotations", "getMandatory", "()Z", "setMandatory", "(Z)V", "getOptions$annotations", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "SelectOption", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName(Fields4.TYPE)
    @SourceDebugExtension
    public static final /* data */ class Select extends FormInput {
        private TranslatableText displayText;
        private String id;
        private boolean mandatory;
        private final List<SelectOption> options;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(FormInput$Select$SelectOption$$serializer.INSTANCE)};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Select copy$default(Select select, String str, boolean z, TranslatableText translatableText, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = select.id;
            }
            if ((i & 2) != 0) {
                z = select.mandatory;
            }
            if ((i & 4) != 0) {
                translatableText = select.displayText;
            }
            if ((i & 8) != 0) {
                list = select.options;
            }
            return select.copy(str, z, translatableText, list);
        }

        @SerialName("display_text")
        public static /* synthetic */ void getDisplayText$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("mandatory")
        public static /* synthetic */ void getMandatory$annotations() {
        }

        @SerialName("options")
        public static /* synthetic */ void getOptions$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* renamed from: component3, reason: from getter */
        public final TranslatableText getDisplayText() {
            return this.displayText;
        }

        public final List<SelectOption> component4() {
            return this.options;
        }

        public final Select copy(String id, boolean mandatory, TranslatableText displayText, List<SelectOption> options) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Select(id, mandatory, displayText, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.id, select.id) && this.mandatory == select.mandatory && Intrinsics.areEqual(this.displayText, select.displayText) && Intrinsics.areEqual(this.options, select.options);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Boolean.hashCode(this.mandatory)) * 31) + this.displayText.hashCode()) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "Select(id=" + this.id + ", mandatory=" + this.mandatory + ", displayText=" + this.displayText + ", options=" + this.options + ")";
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Select> serializer() {
                return FormInput$Select$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Select(int i, @SerialName("id") String str, @SerialName("mandatory") boolean z, @SerialName("display_text") TranslatableText translatableText, @SerialName("options") List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, FormInput$Select$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.mandatory = z;
            this.displayText = translatableText;
            this.options = list;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Select self, Encoding3 output, SerialDescriptor serialDesc) {
            FormInput.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getId());
            output.encodeBooleanElement(serialDesc, 1, self.getMandatory());
            output.encodeSerializableElement(serialDesc, 2, TranslatableText4.INSTANCE, self.getDisplayText());
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.options);
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public boolean getMandatory() {
            return this.mandatory;
        }

        public void setMandatory(boolean z) {
            this.mandatory = z;
        }

        @Override // com.truelayer.payments.core.network.payments.entity.shared.FormInput
        public TranslatableText getDisplayText() {
            return this.displayText;
        }

        public void setDisplayText(TranslatableText translatableText) {
            Intrinsics.checkNotNullParameter(translatableText, "<set-?>");
            this.displayText = translatableText;
        }

        public final List<SelectOption> getOptions() {
            return this.options;
        }

        /* compiled from: FormInput.kt */
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-BC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003J-\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\b\u0010\"\u001a\u00020\u0002H\u0016J\t\u0010#\u001a\u00020\u0006HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select$SelectOption;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select$SelectOption;", "seen1", "", "id", "", "displayText", "Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "searchAliases", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;Ljava/util/List;)V", "getDisplayText$annotations", "()V", "getDisplayText", "()Lcom/truelayer/payments/core/network/payments/entity/shared/TranslatableText;", "getId$annotations", "getId", "()Ljava/lang/String;", "getSearchAliases$annotations", "getSearchAliases", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class SelectOption implements IntoDomain<FormInput.Select.SelectOption> {
            private final TranslatableText displayText;
            private final String id;
            private final List<String> searchAliases;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SelectOption copy$default(SelectOption selectOption, String str, TranslatableText translatableText, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selectOption.id;
                }
                if ((i & 2) != 0) {
                    translatableText = selectOption.displayText;
                }
                if ((i & 4) != 0) {
                    list = selectOption.searchAliases;
                }
                return selectOption.copy(str, translatableText, list);
            }

            @SerialName("display_text")
            public static /* synthetic */ void getDisplayText$annotations() {
            }

            @SerialName("id")
            public static /* synthetic */ void getId$annotations() {
            }

            @SerialName("search_aliases")
            public static /* synthetic */ void getSearchAliases$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final TranslatableText getDisplayText() {
                return this.displayText;
            }

            public final List<String> component3() {
                return this.searchAliases;
            }

            public final SelectOption copy(String id, TranslatableText displayText, List<String> searchAliases) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
                return new SelectOption(id, displayText, searchAliases);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectOption)) {
                    return false;
                }
                SelectOption selectOption = (SelectOption) other;
                return Intrinsics.areEqual(this.id, selectOption.id) && Intrinsics.areEqual(this.displayText, selectOption.displayText) && Intrinsics.areEqual(this.searchAliases, selectOption.searchAliases);
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.displayText.hashCode()) * 31) + this.searchAliases.hashCode();
            }

            public String toString() {
                return "SelectOption(id=" + this.id + ", displayText=" + this.displayText + ", searchAliases=" + this.searchAliases + ")";
            }

            /* compiled from: FormInput.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select$SelectOption$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Select$SelectOption;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SelectOption> serializer() {
                    return FormInput$Select$SelectOption$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ SelectOption(int i, @SerialName("id") String str, @SerialName("display_text") TranslatableText translatableText, @SerialName("search_aliases") List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, FormInput$Select$SelectOption$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.displayText = translatableText;
                if ((i & 4) == 0) {
                    this.searchAliases = CollectionsKt.emptyList();
                } else {
                    this.searchAliases = list;
                }
            }

            public SelectOption(String id, TranslatableText displayText, List<String> searchAliases) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(displayText, "displayText");
                Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
                this.id = id;
                this.displayText = displayText;
                this.searchAliases = searchAliases;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(SelectOption self, Encoding3 output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.id);
                output.encodeSerializableElement(serialDesc, 1, TranslatableText4.INSTANCE, self.displayText);
                if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.searchAliases, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.searchAliases);
            }

            public final String getId() {
                return this.id;
            }

            public final TranslatableText getDisplayText() {
                return this.displayText;
            }

            public /* synthetic */ SelectOption(String str, TranslatableText translatableText, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, translatableText, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final List<String> getSearchAliases() {
                return this.searchAliases;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public FormInput.Select.SelectOption intoDomain2() {
                return new FormInput.Select.SelectOption(this.id, this.displayText.intoDomain2(), null, this.searchAliases, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Select(String id, boolean z, TranslatableText displayText, List<SelectOption> options) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayText, "displayText");
            Intrinsics.checkNotNullParameter(options, "options");
            this.id = id;
            this.mandatory = z;
            this.displayText = displayText;
            this.options = options;
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.FormInput intoDomain2() {
            String id = getId();
            boolean mandatory = getMandatory();
            com.truelayer.payments.core.domain.payments.TranslatableText translatableTextIntoDomain2 = getDisplayText().intoDomain2();
            List<SelectOption> list = this.options;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectOption) it.next()).intoDomain2());
            }
            return new FormInput.Select(id, translatableTextIntoDomain2, null, mandatory, arrayList);
        }
    }
}
