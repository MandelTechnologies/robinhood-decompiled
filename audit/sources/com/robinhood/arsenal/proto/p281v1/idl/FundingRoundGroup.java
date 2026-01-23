package com.robinhood.arsenal.proto.p281v1.idl;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: FundingRoundGroup.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundGroup;", "Lcom/squareup/wire/Message;", "", "group_name", "", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getGroup_name", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FundingRoundGroup extends Message {

    @JvmField
    public static final ProtoAdapter<FundingRoundGroup> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FundingRoundDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<FundingRoundDetails> details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "groupName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String group_name;

    public FundingRoundGroup() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20146newBuilder();
    }

    public final String getGroup_name() {
        return this.group_name;
    }

    public /* synthetic */ FundingRoundGroup(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingRoundGroup(String group_name, List<FundingRoundDetails> details, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(group_name, "group_name");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.group_name = group_name;
        this.details = Internal.immutableCopyOf(ErrorBundle.DETAIL_ENTRY, details);
    }

    public final List<FundingRoundDetails> getDetails() {
        return this.details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20146newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FundingRoundGroup)) {
            return false;
        }
        FundingRoundGroup fundingRoundGroup = (FundingRoundGroup) other;
        return Intrinsics.areEqual(unknownFields(), fundingRoundGroup.unknownFields()) && Intrinsics.areEqual(this.group_name, fundingRoundGroup.group_name) && Intrinsics.areEqual(this.details, fundingRoundGroup.details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.group_name.hashCode()) * 37) + this.details.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("group_name=" + Internal.sanitize(this.group_name));
        if (!this.details.isEmpty()) {
            arrayList.add("details=" + this.details);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FundingRoundGroup{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FundingRoundGroup copy$default(FundingRoundGroup fundingRoundGroup, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingRoundGroup.group_name;
        }
        if ((i & 2) != 0) {
            list = fundingRoundGroup.details;
        }
        if ((i & 4) != 0) {
            byteString = fundingRoundGroup.unknownFields();
        }
        return fundingRoundGroup.copy(str, list, byteString);
    }

    public final FundingRoundGroup copy(String group_name, List<FundingRoundDetails> details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(group_name, "group_name");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FundingRoundGroup(group_name, details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundingRoundGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FundingRoundGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.FundingRoundGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FundingRoundGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getGroup_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getGroup_name());
                }
                return size + FundingRoundDetails.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getDetails());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FundingRoundGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getGroup_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGroup_name());
                }
                FundingRoundDetails.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDetails());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FundingRoundGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FundingRoundDetails.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDetails());
                if (Intrinsics.areEqual(value.getGroup_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGroup_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FundingRoundGroup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FundingRoundGroup(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(FundingRoundDetails.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundingRoundGroup redact(FundingRoundGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FundingRoundGroup.copy$default(value, null, Internal.m26823redactElements(value.getDetails(), FundingRoundDetails.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
