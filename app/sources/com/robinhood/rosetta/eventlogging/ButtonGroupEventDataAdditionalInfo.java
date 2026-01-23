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

/* compiled from: ButtonGroupEventDataAdditionalInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfo;", "Lcom/squareup/wire/Message;", "", "num_shares", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILokio/ByteString;)V", "getNum_shares", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ButtonGroupEventDataAdditionalInfo extends Message {

    @JvmField
    public static final ProtoAdapter<ButtonGroupEventDataAdditionalInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int num_shares;

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonGroupEventDataAdditionalInfo() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24038newBuilder();
    }

    public final int getNum_shares() {
        return this.num_shares;
    }

    public /* synthetic */ ButtonGroupEventDataAdditionalInfo(int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonGroupEventDataAdditionalInfo(int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.num_shares = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24038newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ButtonGroupEventDataAdditionalInfo)) {
            return false;
        }
        ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo = (ButtonGroupEventDataAdditionalInfo) other;
        return Intrinsics.areEqual(unknownFields(), buttonGroupEventDataAdditionalInfo.unknownFields()) && this.num_shares == buttonGroupEventDataAdditionalInfo.num_shares;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Integer.hashCode(this.num_shares);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("num_shares=" + this.num_shares);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonGroupEventDataAdditionalInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ButtonGroupEventDataAdditionalInfo copy$default(ButtonGroupEventDataAdditionalInfo buttonGroupEventDataAdditionalInfo, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = buttonGroupEventDataAdditionalInfo.num_shares;
        }
        if ((i2 & 2) != 0) {
            byteString = buttonGroupEventDataAdditionalInfo.unknownFields();
        }
        return buttonGroupEventDataAdditionalInfo.copy(i, byteString);
    }

    public final ButtonGroupEventDataAdditionalInfo copy(int num_shares, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ButtonGroupEventDataAdditionalInfo(num_shares, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ButtonGroupEventDataAdditionalInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ButtonGroupEventDataAdditionalInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ButtonGroupEventDataAdditionalInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ButtonGroupEventDataAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getNum_shares() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNum_shares())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ButtonGroupEventDataAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNum_shares() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_shares()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ButtonGroupEventDataAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNum_shares() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_shares()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ButtonGroupEventDataAdditionalInfo redact(ButtonGroupEventDataAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ButtonGroupEventDataAdditionalInfo.copy$default(value, 0, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ButtonGroupEventDataAdditionalInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ButtonGroupEventDataAdditionalInfo(iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
