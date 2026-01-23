package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
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

/* compiled from: InstantDeposit.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InstantDeposit;", "Lcom/squareup/wire/Message;", "", "user_group", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getUser_group", "()Ljava/lang/String;", "getTransfer_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InstantDeposit extends Message {

    @JvmField
    public static final ProtoAdapter<InstantDeposit> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String transfer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userGroup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_group;

    public InstantDeposit() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ InstantDeposit(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24311newBuilder();
    }

    public final String getUser_group() {
        return this.user_group;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantDeposit(String user_group, String transfer_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_group, "user_group");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_group = user_group;
        this.transfer_id = transfer_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24311newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstantDeposit)) {
            return false;
        }
        InstantDeposit instantDeposit = (InstantDeposit) other;
        return Intrinsics.areEqual(unknownFields(), instantDeposit.unknownFields()) && Intrinsics.areEqual(this.user_group, instantDeposit.user_group) && Intrinsics.areEqual(this.transfer_id, instantDeposit.transfer_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.user_group.hashCode()) * 37) + this.transfer_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_group=" + Internal.sanitize(this.user_group));
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstantDeposit{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InstantDeposit copy$default(InstantDeposit instantDeposit, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instantDeposit.user_group;
        }
        if ((i & 2) != 0) {
            str2 = instantDeposit.transfer_id;
        }
        if ((i & 4) != 0) {
            byteString = instantDeposit.unknownFields();
        }
        return instantDeposit.copy(str, str2, byteString);
    }

    public final InstantDeposit copy(String user_group, String transfer_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_group, "user_group");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstantDeposit(user_group, transfer_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstantDeposit.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstantDeposit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.InstantDeposit$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstantDeposit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_group(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_group());
                }
                return !Intrinsics.areEqual(value.getTransfer_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTransfer_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstantDeposit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_group(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_group());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstantDeposit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransfer_id());
                }
                if (Intrinsics.areEqual(value.getUser_group(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_group());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstantDeposit redact(InstantDeposit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InstantDeposit.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstantDeposit decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InstantDeposit(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
