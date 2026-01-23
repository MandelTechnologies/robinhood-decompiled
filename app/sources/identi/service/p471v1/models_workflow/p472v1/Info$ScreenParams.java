package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.Info$ScreenParams;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Info.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003678B¡\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J§\u0001\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b,\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b.\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b/\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b0\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b4\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b5\u0010\"¨\u00069"}, m3636d2 = {"identi/service/v1/models_workflow/v1/Info$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "", "", "title", CarResultComposable2.BODY, "primary_cta_text", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "primary_cta_callback", "secondary_cta_text", "secondary_cta_callback", "close_btn_callback", "header_title", "header_body", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "image", "primary_cta_deeplink", "secondary_cta_deeplink", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "Ljava/lang/String;", "getTitle", "getBody", "getPrimary_cta_text", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "getPrimary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "getSecondary_cta_text", "getSecondary_cta_callback", "getClose_btn_callback", "getHeader_title", "getHeader_body", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "getImage", "()Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "getPrimary_cta_deeplink", "getSecondary_cta_deeplink", "Companion", "Callback", "Image", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Info$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<Info$ScreenParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$ScreenParams$Callback#ADAPTER", jsonName = "closeBtnCallback", schemaIndex = 6, tag = 7)
    private final Callback close_btn_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerBody", schemaIndex = 8, tag = 9)
    private final String header_body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerTitle", schemaIndex = 7, tag = 8)
    private final String header_title;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$ScreenParams$Image#ADAPTER", schemaIndex = 9, tag = 10)
    private final Image image;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$ScreenParams$Callback#ADAPTER", jsonName = "primaryCtaCallback", schemaIndex = 3, tag = 4)
    private final Callback primary_cta_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaDeeplink", schemaIndex = 10, tag = 11)
    private final String primary_cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", schemaIndex = 2, tag = 3)
    private final String primary_cta_text;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$ScreenParams$Callback#ADAPTER", jsonName = "secondaryCtaCallback", schemaIndex = 5, tag = 6)
    private final Callback secondary_cta_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaDeeplink", schemaIndex = 11, tag = 12)
    private final String secondary_cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", schemaIndex = 4, tag = 5)
    private final String secondary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public Info$ScreenParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28346newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    public final Callback getPrimary_cta_callback() {
        return this.primary_cta_callback;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    public final Callback getSecondary_cta_callback() {
        return this.secondary_cta_callback;
    }

    public final Callback getClose_btn_callback() {
        return this.close_btn_callback;
    }

    public final String getHeader_title() {
        return this.header_title;
    }

    public final String getHeader_body() {
        return this.header_body;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getPrimary_cta_deeplink() {
        return this.primary_cta_deeplink;
    }

    public final String getSecondary_cta_deeplink() {
        return this.secondary_cta_deeplink;
    }

    public /* synthetic */ Info$ScreenParams(String str, String str2, String str3, Callback callback, String str4, Callback callback2, Callback callback3, String str5, String str6, Image image, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : callback, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : callback2, (i & 64) != 0 ? null : callback3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : image, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? str8 : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Info$ScreenParams(String str, String str2, String str3, Callback callback, String str4, Callback callback2, Callback callback3, String str5, String str6, Image image, String str7, String str8, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.body = str2;
        this.primary_cta_text = str3;
        this.primary_cta_callback = callback;
        this.secondary_cta_text = str4;
        this.secondary_cta_callback = callback2;
        this.close_btn_callback = callback3;
        this.header_title = str5;
        this.header_body = str6;
        this.image = image;
        this.primary_cta_deeplink = str7;
        this.secondary_cta_deeplink = str8;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28346newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Info$ScreenParams)) {
            return false;
        }
        Info$ScreenParams info$ScreenParams = (Info$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), info$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.title, info$ScreenParams.title) && Intrinsics.areEqual(this.body, info$ScreenParams.body) && Intrinsics.areEqual(this.primary_cta_text, info$ScreenParams.primary_cta_text) && this.primary_cta_callback == info$ScreenParams.primary_cta_callback && Intrinsics.areEqual(this.secondary_cta_text, info$ScreenParams.secondary_cta_text) && this.secondary_cta_callback == info$ScreenParams.secondary_cta_callback && this.close_btn_callback == info$ScreenParams.close_btn_callback && Intrinsics.areEqual(this.header_title, info$ScreenParams.header_title) && Intrinsics.areEqual(this.header_body, info$ScreenParams.header_body) && this.image == info$ScreenParams.image && Intrinsics.areEqual(this.primary_cta_deeplink, info$ScreenParams.primary_cta_deeplink) && Intrinsics.areEqual(this.secondary_cta_deeplink, info$ScreenParams.secondary_cta_deeplink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.primary_cta_text;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Callback callback = this.primary_cta_callback;
        int iHashCode5 = (iHashCode4 + (callback != null ? callback.hashCode() : 0)) * 37;
        String str4 = this.secondary_cta_text;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Callback callback2 = this.secondary_cta_callback;
        int iHashCode7 = (iHashCode6 + (callback2 != null ? callback2.hashCode() : 0)) * 37;
        Callback callback3 = this.close_btn_callback;
        int iHashCode8 = (iHashCode7 + (callback3 != null ? callback3.hashCode() : 0)) * 37;
        String str5 = this.header_title;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.header_body;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Image image = this.image;
        int iHashCode11 = (iHashCode10 + (image != null ? image.hashCode() : 0)) * 37;
        String str7 = this.primary_cta_deeplink;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.secondary_cta_deeplink;
        int iHashCode13 = iHashCode12 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.body;
        if (str2 != null) {
            arrayList.add("body=" + Internal.sanitize(str2));
        }
        String str3 = this.primary_cta_text;
        if (str3 != null) {
            arrayList.add("primary_cta_text=" + Internal.sanitize(str3));
        }
        Callback callback = this.primary_cta_callback;
        if (callback != null) {
            arrayList.add("primary_cta_callback=" + callback);
        }
        String str4 = this.secondary_cta_text;
        if (str4 != null) {
            arrayList.add("secondary_cta_text=" + Internal.sanitize(str4));
        }
        Callback callback2 = this.secondary_cta_callback;
        if (callback2 != null) {
            arrayList.add("secondary_cta_callback=" + callback2);
        }
        Callback callback3 = this.close_btn_callback;
        if (callback3 != null) {
            arrayList.add("close_btn_callback=" + callback3);
        }
        String str5 = this.header_title;
        if (str5 != null) {
            arrayList.add("header_title=" + Internal.sanitize(str5));
        }
        String str6 = this.header_body;
        if (str6 != null) {
            arrayList.add("header_body=" + Internal.sanitize(str6));
        }
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        String str7 = this.primary_cta_deeplink;
        if (str7 != null) {
            arrayList.add("primary_cta_deeplink=" + Internal.sanitize(str7));
        }
        String str8 = this.secondary_cta_deeplink;
        if (str8 != null) {
            arrayList.add("secondary_cta_deeplink=" + Internal.sanitize(str8));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Info$ScreenParams copy$default(Info$ScreenParams info$ScreenParams, String str, String str2, String str3, Callback callback, String str4, Callback callback2, Callback callback3, String str5, String str6, Image image, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = info$ScreenParams.title;
        }
        return info$ScreenParams.copy(str, (i & 2) != 0 ? info$ScreenParams.body : str2, (i & 4) != 0 ? info$ScreenParams.primary_cta_text : str3, (i & 8) != 0 ? info$ScreenParams.primary_cta_callback : callback, (i & 16) != 0 ? info$ScreenParams.secondary_cta_text : str4, (i & 32) != 0 ? info$ScreenParams.secondary_cta_callback : callback2, (i & 64) != 0 ? info$ScreenParams.close_btn_callback : callback3, (i & 128) != 0 ? info$ScreenParams.header_title : str5, (i & 256) != 0 ? info$ScreenParams.header_body : str6, (i & 512) != 0 ? info$ScreenParams.image : image, (i & 1024) != 0 ? info$ScreenParams.primary_cta_deeplink : str7, (i & 2048) != 0 ? info$ScreenParams.secondary_cta_deeplink : str8, (i & 4096) != 0 ? info$ScreenParams.unknownFields() : byteString);
    }

    public final Info$ScreenParams copy(String title, String body, String primary_cta_text, Callback primary_cta_callback, String secondary_cta_text, Callback secondary_cta_callback, Callback close_btn_callback, String header_title, String header_body, Image image, String primary_cta_deeplink, String secondary_cta_deeplink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Info$ScreenParams(title, body, primary_cta_text, primary_cta_callback, secondary_cta_text, secondary_cta_callback, close_btn_callback, header_title, header_body, image, primary_cta_deeplink, secondary_cta_deeplink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Info$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Info$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Info$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Info$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getBody()) + protoAdapter.encodedSizeWithTag(3, value.getPrimary_cta_text());
                ProtoAdapter<Info$ScreenParams.Callback> protoAdapter2 = Info$ScreenParams.Callback.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, value.getPrimary_cta_callback()) + protoAdapter.encodedSizeWithTag(5, value.getSecondary_cta_text()) + protoAdapter2.encodedSizeWithTag(6, value.getSecondary_cta_callback()) + protoAdapter2.encodedSizeWithTag(7, value.getClose_btn_callback()) + protoAdapter.encodedSizeWithTag(8, value.getHeader_title()) + protoAdapter.encodedSizeWithTag(9, value.getHeader_body()) + Info$ScreenParams.Image.ADAPTER.encodedSizeWithTag(10, value.getImage()) + protoAdapter.encodedSizeWithTag(11, value.getPrimary_cta_deeplink()) + protoAdapter.encodedSizeWithTag(12, value.getSecondary_cta_deeplink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Info$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBody());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                ProtoAdapter<Info$ScreenParams.Callback> protoAdapter2 = Info$ScreenParams.Callback.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getPrimary_cta_callback());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta_callback());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getClose_btn_callback());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getHeader_title());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getHeader_body());
                Info$ScreenParams.Image.ADAPTER.encodeWithTag(writer, 10, (int) value.getImage());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getPrimary_cta_deeplink());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getSecondary_cta_deeplink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Info$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 12, (int) value.getSecondary_cta_deeplink());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getPrimary_cta_deeplink());
                Info$ScreenParams.Image.ADAPTER.encodeWithTag(writer, 10, (int) value.getImage());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getHeader_body());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getHeader_title());
                ProtoAdapter<Info$ScreenParams.Callback> protoAdapter2 = Info$ScreenParams.Callback.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getClose_btn_callback());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta_callback());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getPrimary_cta_callback());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBody());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Info$ScreenParams redact(Info$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Info$ScreenParams.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 4095, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Info$ScreenParams decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Info$ScreenParams.Callback callback;
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Info$ScreenParams.Callback callbackDecode = null;
                String strDecode3 = null;
                Info$ScreenParams.Callback callbackDecode2 = null;
                Info$ScreenParams.Callback callbackDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                Info$ScreenParams.Image imageDecode = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                str = strDecode;
                                str2 = strDecode2;
                                callback = callbackDecode;
                                try {
                                    callbackDecode = Info$ScreenParams.Callback.ADAPTER.decode(reader);
                                    strDecode = str;
                                    strDecode2 = str2;
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                str = strDecode;
                                str2 = strDecode2;
                                callback = callbackDecode;
                                try {
                                    callbackDecode2 = Info$ScreenParams.Callback.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                str = strDecode;
                                str2 = strDecode2;
                                callback = callbackDecode;
                                try {
                                    callbackDecode3 = Info$ScreenParams.Callback.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                try {
                                    imageDecode = Info$ScreenParams.Image.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    str = strDecode;
                                    str2 = strDecode2;
                                    callback = callbackDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 11:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                str2 = strDecode2;
                                callback = callbackDecode;
                                break;
                        }
                        strDecode = str;
                        strDecode2 = str2;
                        callbackDecode = callback;
                    } else {
                        return new Info$ScreenParams(strDecode8, strDecode, strDecode2, callbackDecode, strDecode3, callbackDecode2, callbackDecode3, strDecode4, strDecode5, imageDecode, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Info.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "DEEPLINK", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Callback implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Callback[] $VALUES;
        public static final Callback ACTION;

        @JvmField
        public static final ProtoAdapter<Callback> ADAPTER;
        public static final Callback CALLBACK_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Callback DEEPLINK;
        public static final Callback EXIT;
        private final int value;

        private static final /* synthetic */ Callback[] $values() {
            return new Callback[]{CALLBACK_UNSPECIFIED, EXIT, ACTION, DEEPLINK};
        }

        @JvmStatic
        public static final Callback fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Callback> getEntries() {
            return $ENTRIES;
        }

        private Callback(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Callback callback = new Callback("CALLBACK_UNSPECIFIED", 0, 0);
            CALLBACK_UNSPECIFIED = callback;
            EXIT = new Callback("EXIT", 1, 1);
            ACTION = new Callback("ACTION", 2, 2);
            DEEPLINK = new Callback("DEEPLINK", 3, 3);
            Callback[] callbackArr$values = $values();
            $VALUES = callbackArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callbackArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Callback.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Callback>(orCreateKotlinClass, syntax, callback) { // from class: identi.service.v1.models_workflow.v1.Info$ScreenParams$Callback$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Info$ScreenParams.Callback fromValue(int value) {
                    return Info$ScreenParams.Callback.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Info.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Callback fromValue(int value) {
                if (value == 0) {
                    return Callback.CALLBACK_UNSPECIFIED;
                }
                if (value == 1) {
                    return Callback.EXIT;
                }
                if (value == 2) {
                    return Callback.ACTION;
                }
                if (value != 3) {
                    return null;
                }
                return Callback.DEEPLINK;
            }
        }

        public static Callback valueOf(String str) {
            return (Callback) Enum.valueOf(Callback.class, str);
        }

        public static Callback[] values() {
            return (Callback[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Info.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IMAGE_UNSPECIFIED", "ALERT", "SECURITY_AND_PRIVACY", "HOURGLASS_LOADING", "PROMPT_ATTEMPT", "SECURE_LOCK", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Image implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Image[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Image> ADAPTER;
        public static final Image ALERT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Image HOURGLASS_LOADING;
        public static final Image IMAGE_UNSPECIFIED;
        public static final Image PROMPT_ATTEMPT;
        public static final Image SECURE_LOCK;
        public static final Image SECURITY_AND_PRIVACY;
        private final int value;

        private static final /* synthetic */ Image[] $values() {
            return new Image[]{IMAGE_UNSPECIFIED, ALERT, SECURITY_AND_PRIVACY, HOURGLASS_LOADING, PROMPT_ATTEMPT, SECURE_LOCK};
        }

        @JvmStatic
        public static final Image fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Image> getEntries() {
            return $ENTRIES;
        }

        private Image(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Image image = new Image("IMAGE_UNSPECIFIED", 0, 0);
            IMAGE_UNSPECIFIED = image;
            ALERT = new Image("ALERT", 1, 1);
            SECURITY_AND_PRIVACY = new Image("SECURITY_AND_PRIVACY", 2, 2);
            HOURGLASS_LOADING = new Image("HOURGLASS_LOADING", 3, 3);
            PROMPT_ATTEMPT = new Image("PROMPT_ATTEMPT", 4, 4);
            SECURE_LOCK = new Image("SECURE_LOCK", 5, 5);
            Image[] imageArr$values = $values();
            $VALUES = imageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(imageArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Image.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Image>(orCreateKotlinClass, syntax, image) { // from class: identi.service.v1.models_workflow.v1.Info$ScreenParams$Image$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Info$ScreenParams.Image fromValue(int value) {
                    return Info$ScreenParams.Image.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Info.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Image fromValue(int value) {
                if (value == 0) {
                    return Image.IMAGE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Image.ALERT;
                }
                if (value == 2) {
                    return Image.SECURITY_AND_PRIVACY;
                }
                if (value == 3) {
                    return Image.HOURGLASS_LOADING;
                }
                if (value == 4) {
                    return Image.PROMPT_ATTEMPT;
                }
                if (value != 5) {
                    return null;
                }
                return Image.SECURE_LOCK;
            }
        }

        public static Image valueOf(String str) {
            return (Image) Enum.valueOf(Image.class, str);
        }

        public static Image[] values() {
            return (Image[]) $VALUES.clone();
        }
    }
}
