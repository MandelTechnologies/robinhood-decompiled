package microgram.p507ui.sdui;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextAreaValidators;", "", "Lmicrogram/ui/sdui/SduiLengthValidator;", "maxLengthValidator", "minLengthValidator", "Lmicrogram/ui/sdui/SduiNonEmptyValidator;", "nonEmptyValidator", "", "Lmicrogram/ui/sdui/SduiRegexValidator;", "regexValidators", "<init>", "(Lmicrogram/ui/sdui/SduiLengthValidator;Lmicrogram/ui/sdui/SduiLengthValidator;Lmicrogram/ui/sdui/SduiNonEmptyValidator;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiLengthValidator;Lmicrogram/ui/sdui/SduiLengthValidator;Lmicrogram/ui/sdui/SduiNonEmptyValidator;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextAreaValidators;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiLengthValidator;", "getMaxLengthValidator", "()Lmicrogram/ui/sdui/SduiLengthValidator;", "getMaxLengthValidator$annotations", "()V", "getMinLengthValidator", "getMinLengthValidator$annotations", "Lmicrogram/ui/sdui/SduiNonEmptyValidator;", "getNonEmptyValidator", "()Lmicrogram/ui/sdui/SduiNonEmptyValidator;", "getNonEmptyValidator$annotations", "Ljava/util/List;", "getRegexValidators", "()Ljava/util/List;", "getRegexValidators$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextAreaValidators {
    private final SduiLengthValidator maxLengthValidator;
    private final SduiLengthValidator minLengthValidator;
    private final SduiNonEmptyValidator nonEmptyValidator;
    private final List<SduiRegexValidator> regexValidators;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SduiRegexValidator$$serializer.INSTANCE)};

    public SduiTextAreaValidators() {
        this((SduiLengthValidator) null, (SduiLengthValidator) null, (SduiNonEmptyValidator) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextAreaValidators)) {
            return false;
        }
        SduiTextAreaValidators sduiTextAreaValidators = (SduiTextAreaValidators) other;
        return Intrinsics.areEqual(this.maxLengthValidator, sduiTextAreaValidators.maxLengthValidator) && Intrinsics.areEqual(this.minLengthValidator, sduiTextAreaValidators.minLengthValidator) && Intrinsics.areEqual(this.nonEmptyValidator, sduiTextAreaValidators.nonEmptyValidator) && Intrinsics.areEqual(this.regexValidators, sduiTextAreaValidators.regexValidators);
    }

    public int hashCode() {
        SduiLengthValidator sduiLengthValidator = this.maxLengthValidator;
        int iHashCode = (sduiLengthValidator == null ? 0 : sduiLengthValidator.hashCode()) * 31;
        SduiLengthValidator sduiLengthValidator2 = this.minLengthValidator;
        int iHashCode2 = (iHashCode + (sduiLengthValidator2 == null ? 0 : sduiLengthValidator2.hashCode())) * 31;
        SduiNonEmptyValidator sduiNonEmptyValidator = this.nonEmptyValidator;
        int iHashCode3 = (iHashCode2 + (sduiNonEmptyValidator == null ? 0 : sduiNonEmptyValidator.hashCode())) * 31;
        List<SduiRegexValidator> list = this.regexValidators;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SduiTextAreaValidators(maxLengthValidator=" + this.maxLengthValidator + ", minLengthValidator=" + this.minLengthValidator + ", nonEmptyValidator=" + this.nonEmptyValidator + ", regexValidators=" + this.regexValidators + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextAreaValidators$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextAreaValidators;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextAreaValidators> serializer() {
            return SduiTextAreaValidators$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTextAreaValidators(int i, @SerialName("max_length_validator") SduiLengthValidator sduiLengthValidator, @SerialName("min_length_validator") SduiLengthValidator sduiLengthValidator2, @SerialName("non_empty_validator") SduiNonEmptyValidator sduiNonEmptyValidator, @SerialName("regex_validators") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxLengthValidator = null;
        } else {
            this.maxLengthValidator = sduiLengthValidator;
        }
        if ((i & 2) == 0) {
            this.minLengthValidator = null;
        } else {
            this.minLengthValidator = sduiLengthValidator2;
        }
        if ((i & 4) == 0) {
            this.nonEmptyValidator = null;
        } else {
            this.nonEmptyValidator = sduiNonEmptyValidator;
        }
        if ((i & 8) == 0) {
            this.regexValidators = null;
        } else {
            this.regexValidators = list;
        }
    }

    public SduiTextAreaValidators(SduiLengthValidator sduiLengthValidator, SduiLengthValidator sduiLengthValidator2, SduiNonEmptyValidator sduiNonEmptyValidator, List<SduiRegexValidator> list) {
        this.maxLengthValidator = sduiLengthValidator;
        this.minLengthValidator = sduiLengthValidator2;
        this.nonEmptyValidator = sduiNonEmptyValidator;
        this.regexValidators = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextAreaValidators self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.maxLengthValidator != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiLengthValidator$$serializer.INSTANCE, self.maxLengthValidator);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.minLengthValidator != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiLengthValidator$$serializer.INSTANCE, self.minLengthValidator);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.nonEmptyValidator != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiNonEmptyValidator$$serializer.INSTANCE, self.nonEmptyValidator);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.regexValidators == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.regexValidators);
    }

    public /* synthetic */ SduiTextAreaValidators(SduiLengthValidator sduiLengthValidator, SduiLengthValidator sduiLengthValidator2, SduiNonEmptyValidator sduiNonEmptyValidator, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiLengthValidator, (i & 2) != 0 ? null : sduiLengthValidator2, (i & 4) != 0 ? null : sduiNonEmptyValidator, (i & 8) != 0 ? null : list);
    }
}
