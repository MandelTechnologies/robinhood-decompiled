package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: BreakingNewsContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContext;", "Lcom/squareup/wire/Message;", "", "title", "", CarResultComposable2.BODY, "url", "asset_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getUrl", "getAsset_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BreakingNewsContext extends Message {

    @JvmField
    public static final ProtoAdapter<BreakingNewsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String asset_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String url;

    public BreakingNewsContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ BreakingNewsContext(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24032newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakingNewsContext(String title, String body, String url, String asset_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.body = body;
        this.url = url;
        this.asset_id = asset_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24032newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BreakingNewsContext)) {
            return false;
        }
        BreakingNewsContext breakingNewsContext = (BreakingNewsContext) other;
        return Intrinsics.areEqual(unknownFields(), breakingNewsContext.unknownFields()) && Intrinsics.areEqual(this.title, breakingNewsContext.title) && Intrinsics.areEqual(this.body, breakingNewsContext.body) && Intrinsics.areEqual(this.url, breakingNewsContext.url) && Intrinsics.areEqual(this.asset_id, breakingNewsContext.asset_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.url.hashCode()) * 37) + this.asset_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("body=" + Internal.sanitize(this.body));
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("asset_id=" + Internal.sanitize(this.asset_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BreakingNewsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BreakingNewsContext copy$default(BreakingNewsContext breakingNewsContext, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = breakingNewsContext.title;
        }
        if ((i & 2) != 0) {
            str2 = breakingNewsContext.body;
        }
        if ((i & 4) != 0) {
            str3 = breakingNewsContext.url;
        }
        if ((i & 8) != 0) {
            str4 = breakingNewsContext.asset_id;
        }
        if ((i & 16) != 0) {
            byteString = breakingNewsContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return breakingNewsContext.copy(str, str2, str5, str4, byteString2);
    }

    public final BreakingNewsContext copy(String title, String body, String url, String asset_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BreakingNewsContext(title, body, url, asset_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BreakingNewsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BreakingNewsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.BreakingNewsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BreakingNewsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUrl());
                }
                return !Intrinsics.areEqual(value.getAsset_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAsset_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BreakingNewsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BreakingNewsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_id());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BreakingNewsContext redact(BreakingNewsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BreakingNewsContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BreakingNewsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BreakingNewsContext(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
