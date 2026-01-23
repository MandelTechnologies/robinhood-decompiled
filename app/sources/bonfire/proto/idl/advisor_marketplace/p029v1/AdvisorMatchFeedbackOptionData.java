package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AdvisorMatchFeedbackOptionData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOptionData;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption;", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption;Ljava/lang/String;Lokio/ByteString;)V", "getOption", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption;", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMatchFeedbackOptionData extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorMatchFeedbackOptionData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackOption#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AdvisorMatchFeedbackOption option;

    public AdvisorMatchFeedbackOptionData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8763newBuilder();
    }

    public final AdvisorMatchFeedbackOption getOption() {
        return this.option;
    }

    public /* synthetic */ AdvisorMatchFeedbackOptionData(AdvisorMatchFeedbackOption advisorMatchFeedbackOption, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED : advisorMatchFeedbackOption, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMatchFeedbackOptionData(AdvisorMatchFeedbackOption option, String name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option = option;
        this.name = name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8763newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorMatchFeedbackOptionData)) {
            return false;
        }
        AdvisorMatchFeedbackOptionData advisorMatchFeedbackOptionData = (AdvisorMatchFeedbackOptionData) other;
        return Intrinsics.areEqual(unknownFields(), advisorMatchFeedbackOptionData.unknownFields()) && this.option == advisorMatchFeedbackOptionData.option && Intrinsics.areEqual(this.name, advisorMatchFeedbackOptionData.name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.option.hashCode()) * 37) + this.name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("option=" + this.option);
        arrayList.add("name=" + Internal.sanitize(this.name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorMatchFeedbackOptionData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorMatchFeedbackOptionData copy$default(AdvisorMatchFeedbackOptionData advisorMatchFeedbackOptionData, AdvisorMatchFeedbackOption advisorMatchFeedbackOption, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            advisorMatchFeedbackOption = advisorMatchFeedbackOptionData.option;
        }
        if ((i & 2) != 0) {
            str = advisorMatchFeedbackOptionData.name;
        }
        if ((i & 4) != 0) {
            byteString = advisorMatchFeedbackOptionData.unknownFields();
        }
        return advisorMatchFeedbackOptionData.copy(advisorMatchFeedbackOption, str, byteString);
    }

    public final AdvisorMatchFeedbackOptionData copy(AdvisorMatchFeedbackOption option, String name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorMatchFeedbackOptionData(option, name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorMatchFeedbackOptionData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorMatchFeedbackOptionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackOptionData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorMatchFeedbackOptionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOption() != AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED) {
                    size += AdvisorMatchFeedbackOption.ADAPTER.encodedSizeWithTag(1, value.getOption());
                }
                return !Intrinsics.areEqual(value.getName(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorMatchFeedbackOptionData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOption() != AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED) {
                    AdvisorMatchFeedbackOption.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorMatchFeedbackOptionData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (value.getOption() != AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED) {
                    AdvisorMatchFeedbackOption.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchFeedbackOptionData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AdvisorMatchFeedbackOption advisorMatchFeedbackOptionDecode = AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorMatchFeedbackOptionData(advisorMatchFeedbackOptionDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            advisorMatchFeedbackOptionDecode = AdvisorMatchFeedbackOption.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchFeedbackOptionData redact(AdvisorMatchFeedbackOptionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisorMatchFeedbackOptionData.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
