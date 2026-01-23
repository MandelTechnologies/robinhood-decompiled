package com.robinhood.rosetta.eventlogging;

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

/* compiled from: InAppSurvey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurvey;", "Lcom/squareup/wire/Message;", "", "id", "", "question", "choice_id", "selected", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "focus", "retryable", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getQuestion", "getChoice_id", "getSelected", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getFocus", "getRetryable", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InAppSurvey extends Message {

    @JvmField
    public static final ProtoAdapter<InAppSurvey> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "choiceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String choice_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Boolean focus;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String question;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Boolean retryable;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean selected;

    public InAppSurvey() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InAppSurvey(String str, String str2, String str3, Boolean r5, Boolean r6, Boolean r7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r5, (i & 16) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r6, (i & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r7, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24310newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getChoice_id() {
        return this.choice_id;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final Boolean getFocus() {
        return this.focus;
    }

    public final Boolean getRetryable() {
        return this.retryable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppSurvey(String id, String question, String choice_id, Boolean selected, Boolean focus, Boolean retryable, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(choice_id, "choice_id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(retryable, "retryable");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.question = question;
        this.choice_id = choice_id;
        this.selected = selected;
        this.focus = focus;
        this.retryable = retryable;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24310newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InAppSurvey)) {
            return false;
        }
        InAppSurvey inAppSurvey = (InAppSurvey) other;
        return Intrinsics.areEqual(unknownFields(), inAppSurvey.unknownFields()) && Intrinsics.areEqual(this.id, inAppSurvey.id) && Intrinsics.areEqual(this.question, inAppSurvey.question) && Intrinsics.areEqual(this.choice_id, inAppSurvey.choice_id) && this.selected == inAppSurvey.selected && this.focus == inAppSurvey.focus && this.retryable == inAppSurvey.retryable;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.question.hashCode()) * 37) + this.choice_id.hashCode()) * 37) + this.selected.hashCode()) * 37) + this.focus.hashCode()) * 37) + this.retryable.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("question=" + Internal.sanitize(this.question));
        arrayList.add("choice_id=" + Internal.sanitize(this.choice_id));
        arrayList.add("selected=" + this.selected);
        arrayList.add("focus=" + this.focus);
        arrayList.add("retryable=" + this.retryable);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppSurvey{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InAppSurvey copy$default(InAppSurvey inAppSurvey, String str, String str2, String str3, Boolean r4, Boolean r5, Boolean r6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppSurvey.id;
        }
        if ((i & 2) != 0) {
            str2 = inAppSurvey.question;
        }
        if ((i & 4) != 0) {
            str3 = inAppSurvey.choice_id;
        }
        if ((i & 8) != 0) {
            r4 = inAppSurvey.selected;
        }
        if ((i & 16) != 0) {
            r5 = inAppSurvey.focus;
        }
        if ((i & 32) != 0) {
            r6 = inAppSurvey.retryable;
        }
        if ((i & 64) != 0) {
            byteString = inAppSurvey.unknownFields();
        }
        Boolean r8 = r6;
        ByteString byteString2 = byteString;
        Boolean r7 = r5;
        String str4 = str3;
        return inAppSurvey.copy(str, str2, str4, r4, r7, r8, byteString2);
    }

    public final InAppSurvey copy(String id, String question, String choice_id, Boolean selected, Boolean focus, Boolean retryable, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(choice_id, "choice_id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(retryable, "retryable");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InAppSurvey(id, question, choice_id, selected, focus, retryable, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InAppSurvey.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InAppSurvey>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.InAppSurvey$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InAppSurvey value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getQuestion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuestion());
                }
                if (!Intrinsics.areEqual(value.getChoice_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getChoice_id());
                }
                Boolean selected = value.getSelected();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (selected != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getSelected());
                }
                if (value.getFocus() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(5, value.getFocus());
                }
                return value.getRetryable() != r2 ? size + Boolean.ADAPTER.encodedSizeWithTag(6, value.getRetryable()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InAppSurvey value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getQuestion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuestion());
                }
                if (!Intrinsics.areEqual(value.getChoice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getChoice_id());
                }
                Boolean selected = value.getSelected();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (selected != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getSelected());
                }
                if (value.getFocus() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getFocus());
                }
                if (value.getRetryable() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getRetryable());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InAppSurvey value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Boolean retryable = value.getRetryable();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (retryable != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getRetryable());
                }
                if (value.getFocus() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getFocus());
                }
                if (value.getSelected() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getSelected());
                }
                if (!Intrinsics.areEqual(value.getChoice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getChoice_id());
                }
                if (!Intrinsics.areEqual(value.getQuestion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuestion());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InAppSurvey decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean r0 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Boolean booleanDecode = r0;
                Boolean booleanDecode2 = booleanDecode;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Boolean booleanDecode3 = booleanDecode2;
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
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                try {
                                    booleanDecode3 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                try {
                                    booleanDecode2 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InAppSurvey(strDecode, strDecode2, strDecode3, booleanDecode3, booleanDecode, booleanDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InAppSurvey redact(InAppSurvey value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InAppSurvey.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
