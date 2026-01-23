package bonfire.proto.idl.accounts.p028v1;

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

/* compiled from: IsaTabBannerConfig.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u009c\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "Lcom/squareup/wire/Message;", "", "title", "", "cta_text", "cta_deeplink", "asset_path_light_mobile", "asset_path_dark_mobile", "asset_path_light_web", "asset_path_dark_web", "asset_width_mobile", "", "asset_height_mobile", "asset_render_width_mobile", "asset_width_web", "asset_height_web", "asset_render_width_web", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getCta_text", "getCta_deeplink", "getAsset_path_light_mobile", "getAsset_path_dark_mobile", "getAsset_path_light_web", "getAsset_path_dark_web", "getAsset_width_mobile", "()J", "getAsset_height_mobile", "getAsset_render_width_mobile", "getAsset_width_web", "getAsset_height_web", "getAsset_render_width_web", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IsaTabBannerConfig extends Message {

    @JvmField
    public static final ProtoAdapter<IsaTabBannerConfig> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetHeightMobile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 15)
    private final long asset_height_mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetHeightWeb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 18)
    private final long asset_height_web;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPathDarkMobile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 11)
    private final String asset_path_dark_mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPathDarkWeb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 13)
    private final String asset_path_dark_web;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPathLightMobile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 10)
    private final String asset_path_light_mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPathLightWeb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 12)
    private final String asset_path_light_web;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetRenderWidthMobile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 16)
    private final long asset_render_width_mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetRenderWidthWeb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 19)
    private final long asset_render_width_web;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetWidthMobile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 14)
    private final long asset_width_mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "assetWidthWeb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 17)
    private final long asset_width_web;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 20)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public IsaTabBannerConfig() {
        this(null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 32767, null);
    }

    public /* synthetic */ IsaTabBannerConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, long j3, long j4, long j5, long j6, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? 0L : j2, (i & 512) != 0 ? 0L : j3, (i & 1024) != 0 ? 0L : j4, (i & 2048) != 0 ? 0L : j5, (i & 4096) == 0 ? j6 : 0L, (i & 8192) == 0 ? str8 : "", (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8731newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getCta_deeplink() {
        return this.cta_deeplink;
    }

    public final String getAsset_path_light_mobile() {
        return this.asset_path_light_mobile;
    }

    public final String getAsset_path_dark_mobile() {
        return this.asset_path_dark_mobile;
    }

    public final String getAsset_path_light_web() {
        return this.asset_path_light_web;
    }

    public final String getAsset_path_dark_web() {
        return this.asset_path_dark_web;
    }

    public final long getAsset_width_mobile() {
        return this.asset_width_mobile;
    }

    public final long getAsset_height_mobile() {
        return this.asset_height_mobile;
    }

    public final long getAsset_render_width_mobile() {
        return this.asset_render_width_mobile;
    }

    public final long getAsset_width_web() {
        return this.asset_width_web;
    }

    public final long getAsset_height_web() {
        return this.asset_height_web;
    }

    public final long getAsset_render_width_web() {
        return this.asset_render_width_web;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaTabBannerConfig(String title, String cta_text, String cta_deeplink, String asset_path_light_mobile, String asset_path_dark_mobile, String asset_path_light_web, String asset_path_dark_web, long j, long j2, long j3, long j4, long j5, long j6, String logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(asset_path_light_mobile, "asset_path_light_mobile");
        Intrinsics.checkNotNullParameter(asset_path_dark_mobile, "asset_path_dark_mobile");
        Intrinsics.checkNotNullParameter(asset_path_light_web, "asset_path_light_web");
        Intrinsics.checkNotNullParameter(asset_path_dark_web, "asset_path_dark_web");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.cta_text = cta_text;
        this.cta_deeplink = cta_deeplink;
        this.asset_path_light_mobile = asset_path_light_mobile;
        this.asset_path_dark_mobile = asset_path_dark_mobile;
        this.asset_path_light_web = asset_path_light_web;
        this.asset_path_dark_web = asset_path_dark_web;
        this.asset_width_mobile = j;
        this.asset_height_mobile = j2;
        this.asset_render_width_mobile = j3;
        this.asset_width_web = j4;
        this.asset_height_web = j5;
        this.asset_render_width_web = j6;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8731newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IsaTabBannerConfig)) {
            return false;
        }
        IsaTabBannerConfig isaTabBannerConfig = (IsaTabBannerConfig) other;
        return Intrinsics.areEqual(unknownFields(), isaTabBannerConfig.unknownFields()) && Intrinsics.areEqual(this.title, isaTabBannerConfig.title) && Intrinsics.areEqual(this.cta_text, isaTabBannerConfig.cta_text) && Intrinsics.areEqual(this.cta_deeplink, isaTabBannerConfig.cta_deeplink) && Intrinsics.areEqual(this.asset_path_light_mobile, isaTabBannerConfig.asset_path_light_mobile) && Intrinsics.areEqual(this.asset_path_dark_mobile, isaTabBannerConfig.asset_path_dark_mobile) && Intrinsics.areEqual(this.asset_path_light_web, isaTabBannerConfig.asset_path_light_web) && Intrinsics.areEqual(this.asset_path_dark_web, isaTabBannerConfig.asset_path_dark_web) && this.asset_width_mobile == isaTabBannerConfig.asset_width_mobile && this.asset_height_mobile == isaTabBannerConfig.asset_height_mobile && this.asset_render_width_mobile == isaTabBannerConfig.asset_render_width_mobile && this.asset_width_web == isaTabBannerConfig.asset_width_web && this.asset_height_web == isaTabBannerConfig.asset_height_web && this.asset_render_width_web == isaTabBannerConfig.asset_render_width_web && Intrinsics.areEqual(this.logging_identifier, isaTabBannerConfig.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.cta_text.hashCode()) * 37) + this.cta_deeplink.hashCode()) * 37) + this.asset_path_light_mobile.hashCode()) * 37) + this.asset_path_dark_mobile.hashCode()) * 37) + this.asset_path_light_web.hashCode()) * 37) + this.asset_path_dark_web.hashCode()) * 37) + Long.hashCode(this.asset_width_mobile)) * 37) + Long.hashCode(this.asset_height_mobile)) * 37) + Long.hashCode(this.asset_render_width_mobile)) * 37) + Long.hashCode(this.asset_width_web)) * 37) + Long.hashCode(this.asset_height_web)) * 37) + Long.hashCode(this.asset_render_width_web)) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        arrayList.add("cta_deeplink=" + Internal.sanitize(this.cta_deeplink));
        arrayList.add("asset_path_light_mobile=" + Internal.sanitize(this.asset_path_light_mobile));
        arrayList.add("asset_path_dark_mobile=" + Internal.sanitize(this.asset_path_dark_mobile));
        arrayList.add("asset_path_light_web=" + Internal.sanitize(this.asset_path_light_web));
        arrayList.add("asset_path_dark_web=" + Internal.sanitize(this.asset_path_dark_web));
        arrayList.add("asset_width_mobile=" + this.asset_width_mobile);
        arrayList.add("asset_height_mobile=" + this.asset_height_mobile);
        arrayList.add("asset_render_width_mobile=" + this.asset_render_width_mobile);
        arrayList.add("asset_width_web=" + this.asset_width_web);
        arrayList.add("asset_height_web=" + this.asset_height_web);
        arrayList.add("asset_render_width_web=" + this.asset_render_width_web);
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IsaTabBannerConfig{", "}", 0, null, null, 56, null);
    }

    public final IsaTabBannerConfig copy(String title, String cta_text, String cta_deeplink, String asset_path_light_mobile, String asset_path_dark_mobile, String asset_path_light_web, String asset_path_dark_web, long asset_width_mobile, long asset_height_mobile, long asset_render_width_mobile, long asset_width_web, long asset_height_web, long asset_render_width_web, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(asset_path_light_mobile, "asset_path_light_mobile");
        Intrinsics.checkNotNullParameter(asset_path_dark_mobile, "asset_path_dark_mobile");
        Intrinsics.checkNotNullParameter(asset_path_light_web, "asset_path_light_web");
        Intrinsics.checkNotNullParameter(asset_path_dark_web, "asset_path_dark_web");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IsaTabBannerConfig(title, cta_text, cta_deeplink, asset_path_light_mobile, asset_path_dark_mobile, asset_path_light_web, asset_path_dark_web, asset_width_mobile, asset_height_mobile, asset_render_width_mobile, asset_width_web, asset_height_web, asset_render_width_web, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsaTabBannerConfig.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IsaTabBannerConfig>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.IsaTabBannerConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IsaTabBannerConfig value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_mobile(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getAsset_path_light_mobile());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_mobile(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAsset_path_dark_mobile());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_web(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getAsset_path_light_web());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_web(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getAsset_path_dark_web());
                }
                if (value.getAsset_width_mobile() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(14, Long.valueOf(value.getAsset_width_mobile()));
                }
                if (value.getAsset_height_mobile() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(15, Long.valueOf(value.getAsset_height_mobile()));
                }
                if (value.getAsset_render_width_mobile() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(16, Long.valueOf(value.getAsset_render_width_mobile()));
                }
                if (value.getAsset_width_web() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(17, Long.valueOf(value.getAsset_width_web()));
                }
                if (value.getAsset_height_web() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(18, Long.valueOf(value.getAsset_height_web()));
                }
                if (value.getAsset_render_width_web() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(19, Long.valueOf(value.getAsset_render_width_web()));
                }
                return !Intrinsics.areEqual(value.getLogging_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(20, value.getLogging_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IsaTabBannerConfig value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_mobile(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAsset_path_light_mobile());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_mobile(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAsset_path_dark_mobile());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_web(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAsset_path_light_web());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_web(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAsset_path_dark_web());
                }
                if (value.getAsset_width_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getAsset_width_mobile()));
                }
                if (value.getAsset_height_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 15, (int) Long.valueOf(value.getAsset_height_mobile()));
                }
                if (value.getAsset_render_width_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 16, (int) Long.valueOf(value.getAsset_render_width_mobile()));
                }
                if (value.getAsset_width_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 17, (int) Long.valueOf(value.getAsset_width_web()));
                }
                if (value.getAsset_height_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 18, (int) Long.valueOf(value.getAsset_height_web()));
                }
                if (value.getAsset_render_width_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 19, (int) Long.valueOf(value.getAsset_render_width_web()));
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IsaTabBannerConfig value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getLogging_identifier());
                }
                if (value.getAsset_render_width_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 19, (int) Long.valueOf(value.getAsset_render_width_web()));
                }
                if (value.getAsset_height_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 18, (int) Long.valueOf(value.getAsset_height_web()));
                }
                if (value.getAsset_width_web() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 17, (int) Long.valueOf(value.getAsset_width_web()));
                }
                if (value.getAsset_render_width_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 16, (int) Long.valueOf(value.getAsset_render_width_mobile()));
                }
                if (value.getAsset_height_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 15, (int) Long.valueOf(value.getAsset_height_mobile()));
                }
                if (value.getAsset_width_mobile() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getAsset_width_mobile()));
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_web(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAsset_path_dark_web());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_web(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAsset_path_light_web());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_dark_mobile(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAsset_path_dark_mobile());
                }
                if (!Intrinsics.areEqual(value.getAsset_path_light_mobile(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAsset_path_light_mobile());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCta_text());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsaTabBannerConfig redact(IsaTabBannerConfig value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((16383 & 1) != 0 ? value.title : null, (16383 & 2) != 0 ? value.cta_text : null, (16383 & 4) != 0 ? value.cta_deeplink : null, (16383 & 8) != 0 ? value.asset_path_light_mobile : null, (16383 & 16) != 0 ? value.asset_path_dark_mobile : null, (16383 & 32) != 0 ? value.asset_path_light_web : null, (16383 & 64) != 0 ? value.asset_path_dark_web : null, (16383 & 128) != 0 ? value.asset_width_mobile : 0L, (16383 & 256) != 0 ? value.asset_height_mobile : 0L, (16383 & 512) != 0 ? value.asset_render_width_mobile : 0L, (16383 & 1024) != 0 ? value.asset_width_web : 0L, (16383 & 2048) != 0 ? value.asset_height_web : 0L, (16383 & 4096) != 0 ? value.asset_render_width_web : 0L, (16383 & 8192) != 0 ? value.logging_identifier : null, (16383 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IsaTabBannerConfig decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                long jLongValue = 0;
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                long jLongValue5 = 0;
                long jLongValue6 = 0;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IsaTabBannerConfig(strDecode, strDecode7, strDecode8, strDecode2, strDecode3, strDecode4, strDecode5, jLongValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, jLongValue6, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        switch (iNextTag) {
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 15:
                                jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 16:
                                jLongValue3 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 17:
                                jLongValue4 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 18:
                                jLongValue5 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 19:
                                jLongValue6 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 20:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    }
                }
            }
        };
    }
}
