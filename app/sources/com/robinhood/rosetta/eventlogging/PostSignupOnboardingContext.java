package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: PostSignupOnboardingContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0017J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostSignupOnboardingContext;", "Lcom/squareup/wire/Message;", "", "is_application_approved", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PostSignupOnboardingContext extends Message {

    @JvmField
    public static final ProtoAdapter<PostSignupOnboardingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isApplicationApproved", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Boolean is_application_approved;

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignupOnboardingContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24509newBuilder();
    }

    /* renamed from: is_application_approved, reason: from getter */
    public final Boolean getIs_application_approved() {
        return this.is_application_approved;
    }

    public /* synthetic */ PostSignupOnboardingContext(Boolean r1, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSignupOnboardingContext(Boolean is_application_approved, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(is_application_approved, "is_application_approved");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_application_approved = is_application_approved;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24509newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostSignupOnboardingContext)) {
            return false;
        }
        PostSignupOnboardingContext postSignupOnboardingContext = (PostSignupOnboardingContext) other;
        return Intrinsics.areEqual(unknownFields(), postSignupOnboardingContext.unknownFields()) && this.is_application_approved == postSignupOnboardingContext.is_application_approved;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.is_application_approved.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_application_approved=" + this.is_application_approved);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostSignupOnboardingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PostSignupOnboardingContext copy$default(PostSignupOnboardingContext postSignupOnboardingContext, Boolean r1, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = postSignupOnboardingContext.is_application_approved;
        }
        if ((i & 2) != 0) {
            byteString = postSignupOnboardingContext.unknownFields();
        }
        return postSignupOnboardingContext.copy(r1, byteString);
    }

    public final PostSignupOnboardingContext copy(Boolean is_application_approved, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(is_application_approved, "is_application_approved");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostSignupOnboardingContext(is_application_approved, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostSignupOnboardingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostSignupOnboardingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PostSignupOnboardingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostSignupOnboardingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getIs_application_approved() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(1, value.getIs_application_approved()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostSignupOnboardingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_application_approved() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_application_approved());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostSignupOnboardingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_application_approved() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_application_approved());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PostSignupOnboardingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PostSignupOnboardingContext(booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostSignupOnboardingContext redact(PostSignupOnboardingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PostSignupOnboardingContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
