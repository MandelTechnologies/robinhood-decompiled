package crypto_perpetuals.contract.p436v1;

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
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: ContractLearnAbout.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractLearnAbout;", "Lcom/squareup/wire/Message;", "", "url", "", "text", "icon", "Lrh_server_driven_ui/v1/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getText", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ContractLearnAbout extends Message {

    @JvmField
    public static final ProtoAdapter<ContractLearnAbout> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url;

    public ContractLearnAbout() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ContractLearnAbout(String str, String str2, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27828newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getText() {
        return this.text;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractLearnAbout(String url, String text, Icon icon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = url;
        this.text = text;
        this.icon = icon;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27828newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractLearnAbout)) {
            return false;
        }
        ContractLearnAbout contractLearnAbout = (ContractLearnAbout) other;
        return Intrinsics.areEqual(unknownFields(), contractLearnAbout.unknownFields()) && Intrinsics.areEqual(this.url, contractLearnAbout.url) && Intrinsics.areEqual(this.text, contractLearnAbout.text) && this.icon == contractLearnAbout.icon;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.text.hashCode()) * 37) + this.icon.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("icon=" + this.icon);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractLearnAbout{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractLearnAbout copy$default(ContractLearnAbout contractLearnAbout, String str, String str2, Icon icon, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractLearnAbout.url;
        }
        if ((i & 2) != 0) {
            str2 = contractLearnAbout.text;
        }
        if ((i & 4) != 0) {
            icon = contractLearnAbout.icon;
        }
        if ((i & 8) != 0) {
            byteString = contractLearnAbout.unknownFields();
        }
        return contractLearnAbout.copy(str, str2, icon, byteString);
    }

    public final ContractLearnAbout copy(String url, String text, Icon icon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractLearnAbout(url, text, icon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractLearnAbout.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractLearnAbout>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.contract.v1.ContractLearnAbout$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractLearnAbout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                }
                return value.getIcon() != Icon.ICON_UNSPECIFIED ? size + Icon.ADAPTER.encodedSizeWithTag(3, value.getIcon()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractLearnAbout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractLearnAbout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (Intrinsics.areEqual(value.getUrl(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractLearnAbout decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Icon iconDecode = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContractLearnAbout(strDecode, strDecode2, iconDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractLearnAbout redact(ContractLearnAbout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractLearnAbout.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
