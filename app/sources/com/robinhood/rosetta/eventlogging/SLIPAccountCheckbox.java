package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SLIPAccountCheckbox.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPAccountCheckbox;", "Lcom/squareup/wire/Message;", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "", "is_checked", "", AnnotatedPrivateKey.LABEL, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getBrokerage_account_type", "()Ljava/lang/String;", "()Z", "getLabel", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SLIPAccountCheckbox extends Message {

    @JvmField
    public static final ProtoAdapter<SLIPAccountCheckbox> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isChecked", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_checked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String label;

    public SLIPAccountCheckbox() {
        this(null, false, null, null, 15, null);
    }

    public /* synthetic */ SLIPAccountCheckbox(String str, boolean z, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24545newBuilder();
    }

    public final String getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    /* renamed from: is_checked, reason: from getter */
    public final boolean getIs_checked() {
        return this.is_checked;
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SLIPAccountCheckbox(String brokerage_account_type, boolean z, String label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.brokerage_account_type = brokerage_account_type;
        this.is_checked = z;
        this.label = label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24545newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SLIPAccountCheckbox)) {
            return false;
        }
        SLIPAccountCheckbox sLIPAccountCheckbox = (SLIPAccountCheckbox) other;
        return Intrinsics.areEqual(unknownFields(), sLIPAccountCheckbox.unknownFields()) && Intrinsics.areEqual(this.brokerage_account_type, sLIPAccountCheckbox.brokerage_account_type) && this.is_checked == sLIPAccountCheckbox.is_checked && Intrinsics.areEqual(this.label, sLIPAccountCheckbox.label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.brokerage_account_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_checked)) * 37) + this.label.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("brokerage_account_type=" + Internal.sanitize(this.brokerage_account_type));
        arrayList.add("is_checked=" + this.is_checked);
        arrayList.add("label=" + Internal.sanitize(this.label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SLIPAccountCheckbox{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SLIPAccountCheckbox copy$default(SLIPAccountCheckbox sLIPAccountCheckbox, String str, boolean z, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sLIPAccountCheckbox.brokerage_account_type;
        }
        if ((i & 2) != 0) {
            z = sLIPAccountCheckbox.is_checked;
        }
        if ((i & 4) != 0) {
            str2 = sLIPAccountCheckbox.label;
        }
        if ((i & 8) != 0) {
            byteString = sLIPAccountCheckbox.unknownFields();
        }
        return sLIPAccountCheckbox.copy(str, z, str2, byteString);
    }

    public final SLIPAccountCheckbox copy(String brokerage_account_type, boolean is_checked, String label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SLIPAccountCheckbox(brokerage_account_type, is_checked, label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SLIPAccountCheckbox.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SLIPAccountCheckbox>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SLIPAccountCheckbox$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SLIPAccountCheckbox value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBrokerage_account_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBrokerage_account_type());
                }
                if (value.getIs_checked()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getIs_checked()));
                }
                return !Intrinsics.areEqual(value.getLabel(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLabel()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SLIPAccountCheckbox value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBrokerage_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_checked()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLabel());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SLIPAccountCheckbox value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLabel());
                }
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_checked()));
                }
                if (Intrinsics.areEqual(value.getBrokerage_account_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SLIPAccountCheckbox redact(SLIPAccountCheckbox value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SLIPAccountCheckbox.copy$default(value, null, false, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SLIPAccountCheckbox decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SLIPAccountCheckbox(strDecode, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
