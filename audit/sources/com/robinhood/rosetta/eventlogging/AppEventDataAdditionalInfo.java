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

/* compiled from: AppEventDataAdditionalInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;", "Lcom/squareup/wire/Message;", "", "num_shares", "", "direction", "", "time_spent", "referrer_host", Constants.REFERRER, "value", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNum_shares", "()I", "getDirection", "()Ljava/lang/String;", "getTime_spent", "getReferrer_host", "getReferrer", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AppEventDataAdditionalInfo extends Message {

    @JvmField
    public static final ProtoAdapter<AppEventDataAdditionalInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int num_shares;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referrerHost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String referrer_host;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int time_spent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String value;

    public AppEventDataAdditionalInfo() {
        this(0, null, 0, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ AppEventDataAdditionalInfo(int i, String str, int i2, String str2, String str3, String str4, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24011newBuilder();
    }

    public final int getNum_shares() {
        return this.num_shares;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    public final String getReferrer_host() {
        return this.referrer_host;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppEventDataAdditionalInfo(int i, String direction, int i2, String referrer_host, String referrer, String value, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.num_shares = i;
        this.direction = direction;
        this.time_spent = i2;
        this.referrer_host = referrer_host;
        this.referrer = referrer;
        this.value = value;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24011newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AppEventDataAdditionalInfo)) {
            return false;
        }
        AppEventDataAdditionalInfo appEventDataAdditionalInfo = (AppEventDataAdditionalInfo) other;
        return Intrinsics.areEqual(unknownFields(), appEventDataAdditionalInfo.unknownFields()) && this.num_shares == appEventDataAdditionalInfo.num_shares && Intrinsics.areEqual(this.direction, appEventDataAdditionalInfo.direction) && this.time_spent == appEventDataAdditionalInfo.time_spent && Intrinsics.areEqual(this.referrer_host, appEventDataAdditionalInfo.referrer_host) && Intrinsics.areEqual(this.referrer, appEventDataAdditionalInfo.referrer) && Intrinsics.areEqual(this.value, appEventDataAdditionalInfo.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.num_shares)) * 37) + this.direction.hashCode()) * 37) + Integer.hashCode(this.time_spent)) * 37) + this.referrer_host.hashCode()) * 37) + this.referrer.hashCode()) * 37) + this.value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("num_shares=" + this.num_shares);
        arrayList.add("direction=" + Internal.sanitize(this.direction));
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("referrer_host=" + Internal.sanitize(this.referrer_host));
        arrayList.add("referrer=" + Internal.sanitize(this.referrer));
        arrayList.add("value=" + Internal.sanitize(this.value));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppEventDataAdditionalInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AppEventDataAdditionalInfo copy$default(AppEventDataAdditionalInfo appEventDataAdditionalInfo, int i, String str, int i2, String str2, String str3, String str4, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appEventDataAdditionalInfo.num_shares;
        }
        if ((i3 & 2) != 0) {
            str = appEventDataAdditionalInfo.direction;
        }
        if ((i3 & 4) != 0) {
            i2 = appEventDataAdditionalInfo.time_spent;
        }
        if ((i3 & 8) != 0) {
            str2 = appEventDataAdditionalInfo.referrer_host;
        }
        if ((i3 & 16) != 0) {
            str3 = appEventDataAdditionalInfo.referrer;
        }
        if ((i3 & 32) != 0) {
            str4 = appEventDataAdditionalInfo.value;
        }
        if ((i3 & 64) != 0) {
            byteString = appEventDataAdditionalInfo.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        int i4 = i2;
        return appEventDataAdditionalInfo.copy(i, str, i4, str2, str6, str5, byteString2);
    }

    public final AppEventDataAdditionalInfo copy(int num_shares, String direction, int time_spent, String referrer_host, String referrer, String value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AppEventDataAdditionalInfo(num_shares, direction, time_spent, referrer_host, referrer, value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppEventDataAdditionalInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AppEventDataAdditionalInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AppEventDataAdditionalInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppEventDataAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNum_shares() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNum_shares()));
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getReferrer_host());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getReferrer());
                }
                return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getValue()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppEventDataAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNum_shares() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_shares()));
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReferrer_host());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getValue());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppEventDataAdditionalInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getReferrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReferrer_host());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getNum_shares() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_shares()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppEventDataAdditionalInfo redact(AppEventDataAdditionalInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AppEventDataAdditionalInfo.copy$default(value, 0, null, 0, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AppEventDataAdditionalInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AppEventDataAdditionalInfo(iIntValue, strDecode, iIntValue2, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
