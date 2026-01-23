package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
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

/* compiled from: WebAdditionalInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;", "Lcom/squareup/wire/Message;", "", "time_spent", "", Constants.REFERRER, "", "referrer_host", "value", "masked_referrer", "masked_referrer_host", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTime_spent", "()I", "getReferrer", "()Ljava/lang/String;", "getReferrer_host", "getValue", "getMasked_referrer", "getMasked_referrer_host", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WebAdditionalInfo extends Message {

    @JvmField
    public static final ProtoAdapter<WebAdditionalInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedReferrer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 1002)
    private final String masked_referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedReferrerHost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 1003)
    private final String masked_referrer_host;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referrerHost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String referrer_host;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int time_spent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String value;

    public WebAdditionalInfo() {
        this(0, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ WebAdditionalInfo(int i, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24608newBuilder();
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getReferrer_host() {
        return this.referrer_host;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getMasked_referrer() {
        return this.masked_referrer;
    }

    public final String getMasked_referrer_host() {
        return this.masked_referrer_host;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAdditionalInfo(int i, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.time_spent = i;
        this.referrer = referrer;
        this.referrer_host = referrer_host;
        this.value = value;
        this.masked_referrer = masked_referrer;
        this.masked_referrer_host = masked_referrer_host;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24608newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WebAdditionalInfo)) {
            return false;
        }
        WebAdditionalInfo webAdditionalInfo = (WebAdditionalInfo) other;
        return Intrinsics.areEqual(unknownFields(), webAdditionalInfo.unknownFields()) && this.time_spent == webAdditionalInfo.time_spent && Intrinsics.areEqual(this.referrer, webAdditionalInfo.referrer) && Intrinsics.areEqual(this.referrer_host, webAdditionalInfo.referrer_host) && Intrinsics.areEqual(this.value, webAdditionalInfo.value) && Intrinsics.areEqual(this.masked_referrer, webAdditionalInfo.masked_referrer) && Intrinsics.areEqual(this.masked_referrer_host, webAdditionalInfo.masked_referrer_host);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.time_spent)) * 37) + this.referrer.hashCode()) * 37) + this.referrer_host.hashCode()) * 37) + this.value.hashCode()) * 37) + this.masked_referrer.hashCode()) * 37) + this.masked_referrer_host.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("referrer=" + Internal.sanitize(this.referrer));
        arrayList.add("referrer_host=" + Internal.sanitize(this.referrer_host));
        arrayList.add("value=" + Internal.sanitize(this.value));
        arrayList.add("masked_referrer=" + Internal.sanitize(this.masked_referrer));
        arrayList.add("masked_referrer_host=" + Internal.sanitize(this.masked_referrer_host));
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebAdditionalInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WebAdditionalInfo copy$default(WebAdditionalInfo webAdditionalInfo, int i, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webAdditionalInfo.time_spent;
        }
        if ((i2 & 2) != 0) {
            str = webAdditionalInfo.referrer;
        }
        if ((i2 & 4) != 0) {
            str2 = webAdditionalInfo.referrer_host;
        }
        if ((i2 & 8) != 0) {
            str3 = webAdditionalInfo.value;
        }
        if ((i2 & 16) != 0) {
            str4 = webAdditionalInfo.masked_referrer;
        }
        if ((i2 & 32) != 0) {
            str5 = webAdditionalInfo.masked_referrer_host;
        }
        if ((i2 & 64) != 0) {
            byteString = webAdditionalInfo.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str2;
        return webAdditionalInfo.copy(i, str, str8, str3, str7, str6, byteString2);
    }

    public final WebAdditionalInfo copy(int time_spent, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WebAdditionalInfo(time_spent, referrer, referrer_host, value, masked_referrer, masked_referrer_host, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebAdditionalInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WebAdditionalInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WebAdditionalInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getReferrer_host());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getValue());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1002, value.getMasked_referrer());
                }
                return !Intrinsics.areEqual(value.getMasked_referrer_host(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1003, value.getMasked_referrer_host()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReferrer_host());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_referrer());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1003, (int) value.getMasked_referrer_host());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1003, (int) value.getMasked_referrer_host());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_referrer());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReferrer_host());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReferrer());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTime_spent()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebAdditionalInfo redact(WebAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return WebAdditionalInfo.copy$default(value, 0, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WebAdditionalInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WebAdditionalInfo(iIntValue, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1002) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1003) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
