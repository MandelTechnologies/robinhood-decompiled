package gold_flow.proto.p466v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: MultiAgreementsOption.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010#R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006%"}, m3636d2 = {"Lgold_flow/proto/v1/MultiAgreementsOption;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "full_agreement", "Lgold_flow/proto/v1/FullAgreement;", "is_checked", "", "on_check_action", "Lgold_flow/proto/v1/Action;", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreement;Ljava/lang/Boolean;Lgold_flow/proto/v1/Action;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getFull_agreement", "()Lgold_flow/proto/v1/FullAgreement;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOn_check_action", "()Lgold_flow/proto/v1/Action;", "getLogging_identifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreement;Ljava/lang/Boolean;Lgold_flow/proto/v1/Action;Ljava/lang/String;Lokio/ByteString;)Lgold_flow/proto/v1/MultiAgreementsOption;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MultiAgreementsOption extends Message {

    @JvmField
    public static final ProtoAdapter<MultiAgreementsOption> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "gold_flow.proto.v1.FullAgreement#ADAPTER", jsonName = "fullAgreement", schemaIndex = 2, tag = 3)
    private final FullAgreement full_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isChecked", schemaIndex = 3, tag = 4)
    private final Boolean is_checked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 5, tag = 6)
    private final String logging_identifier;

    @WireField(adapter = "gold_flow.proto.v1.Action#ADAPTER", jsonName = "onCheckAction", schemaIndex = 4, tag = 5)
    private final Action on_check_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public MultiAgreementsOption() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28173newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final FullAgreement getFull_agreement() {
        return this.full_agreement;
    }

    /* renamed from: is_checked, reason: from getter */
    public final Boolean getIs_checked() {
        return this.is_checked;
    }

    public final Action getOn_check_action() {
        return this.on_check_action;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public /* synthetic */ MultiAgreementsOption(String str, String str2, FullAgreement fullAgreement, Boolean bool, Action action, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : fullAgreement, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAgreementsOption(String str, String str2, FullAgreement fullAgreement, Boolean bool, Action action, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.description_markdown = str2;
        this.full_agreement = fullAgreement;
        this.is_checked = bool;
        this.on_check_action = action;
        this.logging_identifier = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28173newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MultiAgreementsOption)) {
            return false;
        }
        MultiAgreementsOption multiAgreementsOption = (MultiAgreementsOption) other;
        return Intrinsics.areEqual(unknownFields(), multiAgreementsOption.unknownFields()) && Intrinsics.areEqual(this.title, multiAgreementsOption.title) && Intrinsics.areEqual(this.description_markdown, multiAgreementsOption.description_markdown) && Intrinsics.areEqual(this.full_agreement, multiAgreementsOption.full_agreement) && Intrinsics.areEqual(this.is_checked, multiAgreementsOption.is_checked) && Intrinsics.areEqual(this.on_check_action, multiAgreementsOption.on_check_action) && Intrinsics.areEqual(this.logging_identifier, multiAgreementsOption.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description_markdown;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FullAgreement fullAgreement = this.full_agreement;
        int iHashCode4 = (iHashCode3 + (fullAgreement != null ? fullAgreement.hashCode() : 0)) * 37;
        Boolean bool = this.is_checked;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        Action action = this.on_check_action;
        int iHashCode6 = (iHashCode5 + (action != null ? action.hashCode() : 0)) * 37;
        String str3 = this.logging_identifier;
        int iHashCode7 = iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.description_markdown;
        if (str2 != null) {
            arrayList.add("description_markdown=" + Internal.sanitize(str2));
        }
        FullAgreement fullAgreement = this.full_agreement;
        if (fullAgreement != null) {
            arrayList.add("full_agreement=" + fullAgreement);
        }
        Boolean bool = this.is_checked;
        if (bool != null) {
            arrayList.add("is_checked=" + bool);
        }
        Action action = this.on_check_action;
        if (action != null) {
            arrayList.add("on_check_action=" + action);
        }
        String str3 = this.logging_identifier;
        if (str3 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiAgreementsOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MultiAgreementsOption copy$default(MultiAgreementsOption multiAgreementsOption, String str, String str2, FullAgreement fullAgreement, Boolean bool, Action action, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiAgreementsOption.title;
        }
        if ((i & 2) != 0) {
            str2 = multiAgreementsOption.description_markdown;
        }
        if ((i & 4) != 0) {
            fullAgreement = multiAgreementsOption.full_agreement;
        }
        if ((i & 8) != 0) {
            bool = multiAgreementsOption.is_checked;
        }
        if ((i & 16) != 0) {
            action = multiAgreementsOption.on_check_action;
        }
        if ((i & 32) != 0) {
            str3 = multiAgreementsOption.logging_identifier;
        }
        if ((i & 64) != 0) {
            byteString = multiAgreementsOption.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        Action action2 = action;
        FullAgreement fullAgreement2 = fullAgreement;
        return multiAgreementsOption.copy(str, str2, fullAgreement2, bool, action2, str4, byteString2);
    }

    public final MultiAgreementsOption copy(String title, String description_markdown, FullAgreement full_agreement, Boolean is_checked, Action on_check_action, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MultiAgreementsOption(title, description_markdown, full_agreement, is_checked, on_check_action, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MultiAgreementsOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MultiAgreementsOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.MultiAgreementsOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiAgreementsOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getDescription_markdown()) + FullAgreement.ADAPTER.encodedSizeWithTag(3, value.getFull_agreement()) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.getIs_checked()) + Action.ADAPTER.encodedSizeWithTag(5, value.getOn_check_action()) + protoAdapter.encodedSizeWithTag(6, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiAgreementsOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                FullAgreement.ADAPTER.encodeWithTag(writer, 3, (int) value.getFull_agreement());
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getIs_checked());
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_check_action());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiAgreementsOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLogging_identifier());
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_check_action());
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getIs_checked());
                FullAgreement.ADAPTER.encodeWithTag(writer, 3, (int) value.getFull_agreement());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiAgreementsOption redact(MultiAgreementsOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreement full_agreement = value.getFull_agreement();
                FullAgreement fullAgreementRedact = full_agreement != null ? FullAgreement.ADAPTER.redact(full_agreement) : null;
                Action on_check_action = value.getOn_check_action();
                return MultiAgreementsOption.copy$default(value, null, null, fullAgreementRedact, null, on_check_action != null ? Action.ADAPTER.redact(on_check_action) : null, null, ByteString.EMPTY, 43, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MultiAgreementsOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                FullAgreement fullAgreementDecode = null;
                Boolean boolDecode = null;
                Action actionDecode = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                fullAgreementDecode = FullAgreement.ADAPTER.decode(reader);
                                break;
                            case 4:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MultiAgreementsOption(strDecode, strDecode2, fullAgreementDecode, boolDecode, actionDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
