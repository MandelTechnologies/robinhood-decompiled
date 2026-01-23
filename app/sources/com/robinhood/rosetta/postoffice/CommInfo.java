package com.robinhood.rosetta.postoffice;

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

/* compiled from: CommInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfo;", "Lcom/squareup/wire/Message;", "", "po_box", "", "campaign_id", "idempotent_id", "channel_type", "source_service", "ttl", "", "variant_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lokio/ByteString;)V", "getPo_box", "()Ljava/lang/String;", "getCampaign_id", "getIdempotent_id", "getChannel_type", "getSource_service", "getTtl", "()J", "getVariant_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CommInfo extends Message {

    @JvmField
    public static final ProtoAdapter<CommInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "campaignId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String campaign_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "channelType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String channel_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "idempotentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String idempotent_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "poBox", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String po_box;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceService", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String source_service;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final long ttl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "variantName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String variant_name;

    public CommInfo() {
        this(null, null, null, null, null, 0L, null, null, 255, null);
    }

    public /* synthetic */ CommInfo(String str, String str2, String str3, String str4, String str5, long j, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24739newBuilder();
    }

    public final String getPo_box() {
        return this.po_box;
    }

    public final String getCampaign_id() {
        return this.campaign_id;
    }

    public final String getIdempotent_id() {
        return this.idempotent_id;
    }

    public final String getChannel_type() {
        return this.channel_type;
    }

    public final String getSource_service() {
        return this.source_service;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final String getVariant_name() {
        return this.variant_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommInfo(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long j, String variant_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(channel_type, "channel_type");
        Intrinsics.checkNotNullParameter(source_service, "source_service");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.po_box = po_box;
        this.campaign_id = campaign_id;
        this.idempotent_id = idempotent_id;
        this.channel_type = channel_type;
        this.source_service = source_service;
        this.ttl = j;
        this.variant_name = variant_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24739newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CommInfo)) {
            return false;
        }
        CommInfo commInfo = (CommInfo) other;
        return Intrinsics.areEqual(unknownFields(), commInfo.unknownFields()) && Intrinsics.areEqual(this.po_box, commInfo.po_box) && Intrinsics.areEqual(this.campaign_id, commInfo.campaign_id) && Intrinsics.areEqual(this.idempotent_id, commInfo.idempotent_id) && Intrinsics.areEqual(this.channel_type, commInfo.channel_type) && Intrinsics.areEqual(this.source_service, commInfo.source_service) && this.ttl == commInfo.ttl && Intrinsics.areEqual(this.variant_name, commInfo.variant_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.po_box.hashCode()) * 37) + this.campaign_id.hashCode()) * 37) + this.idempotent_id.hashCode()) * 37) + this.channel_type.hashCode()) * 37) + this.source_service.hashCode()) * 37) + Long.hashCode(this.ttl)) * 37) + this.variant_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("po_box=" + Internal.sanitize(this.po_box));
        arrayList.add("campaign_id=" + Internal.sanitize(this.campaign_id));
        arrayList.add("idempotent_id=" + Internal.sanitize(this.idempotent_id));
        arrayList.add("channel_type=" + Internal.sanitize(this.channel_type));
        arrayList.add("source_service=" + Internal.sanitize(this.source_service));
        arrayList.add("ttl=" + this.ttl);
        arrayList.add("variant_name=" + Internal.sanitize(this.variant_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CommInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CommInfo copy$default(CommInfo commInfo, String str, String str2, String str3, String str4, String str5, long j, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commInfo.po_box;
        }
        if ((i & 2) != 0) {
            str2 = commInfo.campaign_id;
        }
        if ((i & 4) != 0) {
            str3 = commInfo.idempotent_id;
        }
        if ((i & 8) != 0) {
            str4 = commInfo.channel_type;
        }
        if ((i & 16) != 0) {
            str5 = commInfo.source_service;
        }
        if ((i & 32) != 0) {
            j = commInfo.ttl;
        }
        if ((i & 64) != 0) {
            str6 = commInfo.variant_name;
        }
        if ((i & 128) != 0) {
            byteString = commInfo.unknownFields();
        }
        long j2 = j;
        String str7 = str4;
        String str8 = str5;
        String str9 = str3;
        return commInfo.copy(str, str2, str9, str7, str8, j2, str6, byteString);
    }

    public final CommInfo copy(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long ttl, String variant_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(channel_type, "channel_type");
        Intrinsics.checkNotNullParameter(source_service, "source_service");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CommInfo(po_box, campaign_id, idempotent_id, channel_type, source_service, ttl, variant_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CommInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CommInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.postoffice.CommInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CommInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPo_box());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCampaign_id());
                }
                if (!Intrinsics.areEqual(value.getIdempotent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIdempotent_id());
                }
                if (!Intrinsics.areEqual(value.getChannel_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getChannel_type());
                }
                if (!Intrinsics.areEqual(value.getSource_service(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSource_service());
                }
                if (value.getTtl() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(value.getTtl()));
                }
                return !Intrinsics.areEqual(value.getVariant_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getVariant_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CommInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPo_box());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                if (!Intrinsics.areEqual(value.getIdempotent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdempotent_id());
                }
                if (!Intrinsics.areEqual(value.getChannel_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getChannel_type());
                }
                if (!Intrinsics.areEqual(value.getSource_service(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_service());
                }
                if (value.getTtl() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, (int) Long.valueOf(value.getTtl()));
                }
                if (!Intrinsics.areEqual(value.getVariant_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVariant_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CommInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getVariant_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getVariant_name());
                }
                if (value.getTtl() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, (int) Long.valueOf(value.getTtl()));
                }
                if (!Intrinsics.areEqual(value.getSource_service(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_service());
                }
                if (!Intrinsics.areEqual(value.getChannel_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getChannel_type());
                }
                if (!Intrinsics.areEqual(value.getIdempotent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdempotent_id());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                if (Intrinsics.areEqual(value.getPo_box(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPo_box());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CommInfo redact(CommInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CommInfo.copy$default(value, null, null, null, null, null, 0L, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CommInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                long jLongValue = 0;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CommInfo(strDecode, strDecode5, strDecode6, strDecode2, strDecode3, jLongValue, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
