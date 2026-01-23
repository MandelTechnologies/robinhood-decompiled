package options_product.service;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import options_product.service.QuestionOptionExperienceRequestMetadata;

/* compiled from: QuestionOptionExperienceRequestMetadata.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "Lcom/squareup/wire/Message;", "", "option_experience_level", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;Lokio/ByteString;)V", "getOption_experience_level", "()Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "OptionExperienceLevel", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class QuestionOptionExperienceRequestMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<QuestionOptionExperienceRequestMetadata> ADAPTER;

    @WireField(adapter = "options_product.service.QuestionOptionExperienceRequestMetadata$OptionExperienceLevel#ADAPTER", jsonName = "optionExperienceLevel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OptionExperienceLevel option_experience_level;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionOptionExperienceRequestMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29536newBuilder();
    }

    public final OptionExperienceLevel getOption_experience_level() {
        return this.option_experience_level;
    }

    public /* synthetic */ QuestionOptionExperienceRequestMetadata(OptionExperienceLevel optionExperienceLevel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED : optionExperienceLevel, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionOptionExperienceRequestMetadata(OptionExperienceLevel option_experience_level, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option_experience_level, "option_experience_level");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option_experience_level = option_experience_level;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29536newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof QuestionOptionExperienceRequestMetadata)) {
            return false;
        }
        QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata = (QuestionOptionExperienceRequestMetadata) other;
        return Intrinsics.areEqual(unknownFields(), questionOptionExperienceRequestMetadata.unknownFields()) && this.option_experience_level == questionOptionExperienceRequestMetadata.option_experience_level;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.option_experience_level.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("option_experience_level=" + this.option_experience_level);
        return CollectionsKt.joinToString$default(arrayList, ", ", "QuestionOptionExperienceRequestMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ QuestionOptionExperienceRequestMetadata copy$default(QuestionOptionExperienceRequestMetadata questionOptionExperienceRequestMetadata, OptionExperienceLevel optionExperienceLevel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            optionExperienceLevel = questionOptionExperienceRequestMetadata.option_experience_level;
        }
        if ((i & 2) != 0) {
            byteString = questionOptionExperienceRequestMetadata.unknownFields();
        }
        return questionOptionExperienceRequestMetadata.copy(optionExperienceLevel, byteString);
    }

    public final QuestionOptionExperienceRequestMetadata copy(OptionExperienceLevel option_experience_level, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option_experience_level, "option_experience_level");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new QuestionOptionExperienceRequestMetadata(option_experience_level, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QuestionOptionExperienceRequestMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<QuestionOptionExperienceRequestMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.QuestionOptionExperienceRequestMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(QuestionOptionExperienceRequestMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getOption_experience_level() != QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED ? size + QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.ADAPTER.encodedSizeWithTag(1, value.getOption_experience_level()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, QuestionOptionExperienceRequestMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOption_experience_level() != QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED) {
                    QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_experience_level());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, QuestionOptionExperienceRequestMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOption_experience_level() != QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED) {
                    QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_experience_level());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuestionOptionExperienceRequestMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                QuestionOptionExperienceRequestMetadata.OptionExperienceLevel optionExperienceLevelDecode = QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new QuestionOptionExperienceRequestMetadata(optionExperienceLevelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            optionExperienceLevelDecode = QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuestionOptionExperienceRequestMetadata redact(QuestionOptionExperienceRequestMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return QuestionOptionExperienceRequestMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuestionOptionExperienceRequestMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EXPERIENCE_ANSWER_UNSPECIFIED", "EXPERIENCE_ANSWER_LOW", "EXPERIENCE_ANSWER_MED", "EXPERIENCE_ANSWER_HIGH", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class OptionExperienceLevel implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionExperienceLevel[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OptionExperienceLevel> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OptionExperienceLevel EXPERIENCE_ANSWER_HIGH;
        public static final OptionExperienceLevel EXPERIENCE_ANSWER_LOW;
        public static final OptionExperienceLevel EXPERIENCE_ANSWER_MED;
        public static final OptionExperienceLevel EXPERIENCE_ANSWER_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OptionExperienceLevel[] $values() {
            return new OptionExperienceLevel[]{EXPERIENCE_ANSWER_UNSPECIFIED, EXPERIENCE_ANSWER_LOW, EXPERIENCE_ANSWER_MED, EXPERIENCE_ANSWER_HIGH};
        }

        @JvmStatic
        public static final OptionExperienceLevel fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OptionExperienceLevel> getEntries() {
            return $ENTRIES;
        }

        private OptionExperienceLevel(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OptionExperienceLevel optionExperienceLevel = new OptionExperienceLevel("EXPERIENCE_ANSWER_UNSPECIFIED", 0, 0);
            EXPERIENCE_ANSWER_UNSPECIFIED = optionExperienceLevel;
            EXPERIENCE_ANSWER_LOW = new OptionExperienceLevel("EXPERIENCE_ANSWER_LOW", 1, 1);
            EXPERIENCE_ANSWER_MED = new OptionExperienceLevel("EXPERIENCE_ANSWER_MED", 2, 2);
            EXPERIENCE_ANSWER_HIGH = new OptionExperienceLevel("EXPERIENCE_ANSWER_HIGH", 3, 3);
            OptionExperienceLevel[] optionExperienceLevelArr$values = $values();
            $VALUES = optionExperienceLevelArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionExperienceLevelArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionExperienceLevel.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OptionExperienceLevel>(orCreateKotlinClass, syntax, optionExperienceLevel) { // from class: options_product.service.QuestionOptionExperienceRequestMetadata$OptionExperienceLevel$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public QuestionOptionExperienceRequestMetadata.OptionExperienceLevel fromValue(int value) {
                    return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: QuestionOptionExperienceRequestMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OptionExperienceLevel fromValue(int value) {
                if (value == 0) {
                    return OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED;
                }
                if (value == 1) {
                    return OptionExperienceLevel.EXPERIENCE_ANSWER_LOW;
                }
                if (value == 2) {
                    return OptionExperienceLevel.EXPERIENCE_ANSWER_MED;
                }
                if (value != 3) {
                    return null;
                }
                return OptionExperienceLevel.EXPERIENCE_ANSWER_HIGH;
            }
        }

        public static OptionExperienceLevel valueOf(String str) {
            return (OptionExperienceLevel) Enum.valueOf(OptionExperienceLevel.class, str);
        }

        public static OptionExperienceLevel[] values() {
            return (OptionExperienceLevel[]) $VALUES.clone();
        }
    }
}
