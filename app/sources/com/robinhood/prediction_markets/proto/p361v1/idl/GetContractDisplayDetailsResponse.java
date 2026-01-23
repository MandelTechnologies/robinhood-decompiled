package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetContractDisplayDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u0088\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponse;", "Lcom/squareup/wire/Message;", "", "contract_title_name", "", "event_display_name", "contract_subtitle_name", "contract_prefix", "image_url_dark", "image_url_light", "yes_no_and_contract_subtitle_name", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequest;", "prop_name", "selected_leg_display_details", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequest;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getContract_title_name", "()Ljava/lang/String;", "getEvent_display_name", "getContract_subtitle_name", "getContract_prefix", "getImage_url_dark", "getImage_url_light", "getYes_no_and_contract_subtitle_name", "getYes_no_and_contract_name", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequest;", "getProp_name", "getSelected_leg_display_details", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetContractDisplayDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetContractDisplayDetailsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsRequest#ADAPTER", jsonName = "cachingKey", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final GetContractDisplayDetailsRequest caching_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractPrefix", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String contract_prefix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractSubtitleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String contract_subtitle_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractTitleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_title_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String image_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "imageUrlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String image_url_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "propName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String prop_name;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsResponse#ADAPTER", jsonName = "selectedLegDisplayDetails", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    private final List<GetContractDisplayDetailsResponse> selected_leg_display_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "yesNoAndContractName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String yes_no_and_contract_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "yesNoAndContractSubtitleName", schemaIndex = 6, tag = 7)
    private final String yes_no_and_contract_subtitle_name;

    public GetContractDisplayDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ GetContractDisplayDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequest getContractDisplayDetailsRequest, String str9, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? getContractDisplayDetailsRequest : null, (i & 512) == 0 ? str9 : "", (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23799newBuilder();
    }

    public final String getContract_title_name() {
        return this.contract_title_name;
    }

    public final String getEvent_display_name() {
        return this.event_display_name;
    }

    public final String getContract_subtitle_name() {
        return this.contract_subtitle_name;
    }

    public final String getContract_prefix() {
        return this.contract_prefix;
    }

    public final String getImage_url_dark() {
        return this.image_url_dark;
    }

    public final String getImage_url_light() {
        return this.image_url_light;
    }

    public final String getYes_no_and_contract_subtitle_name() {
        return this.yes_no_and_contract_subtitle_name;
    }

    public final String getYes_no_and_contract_name() {
        return this.yes_no_and_contract_name;
    }

    public final GetContractDisplayDetailsRequest getCaching_key() {
        return this.caching_key;
    }

    public final String getProp_name() {
        return this.prop_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContractDisplayDetailsResponse(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String str, String yes_no_and_contract_name, GetContractDisplayDetailsRequest getContractDisplayDetailsRequest, String prop_name, List<GetContractDisplayDetailsResponse> selected_leg_display_details, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
        Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
        Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
        Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(prop_name, "prop_name");
        Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_title_name = contract_title_name;
        this.event_display_name = event_display_name;
        this.contract_subtitle_name = contract_subtitle_name;
        this.contract_prefix = contract_prefix;
        this.image_url_dark = image_url_dark;
        this.image_url_light = image_url_light;
        this.yes_no_and_contract_subtitle_name = str;
        this.yes_no_and_contract_name = yes_no_and_contract_name;
        this.caching_key = getContractDisplayDetailsRequest;
        this.prop_name = prop_name;
        this.selected_leg_display_details = Internal.immutableCopyOf("selected_leg_display_details", selected_leg_display_details);
    }

    public final List<GetContractDisplayDetailsResponse> getSelected_leg_display_details() {
        return this.selected_leg_display_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23799newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetContractDisplayDetailsResponse)) {
            return false;
        }
        GetContractDisplayDetailsResponse getContractDisplayDetailsResponse = (GetContractDisplayDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getContractDisplayDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.contract_title_name, getContractDisplayDetailsResponse.contract_title_name) && Intrinsics.areEqual(this.event_display_name, getContractDisplayDetailsResponse.event_display_name) && Intrinsics.areEqual(this.contract_subtitle_name, getContractDisplayDetailsResponse.contract_subtitle_name) && Intrinsics.areEqual(this.contract_prefix, getContractDisplayDetailsResponse.contract_prefix) && Intrinsics.areEqual(this.image_url_dark, getContractDisplayDetailsResponse.image_url_dark) && Intrinsics.areEqual(this.image_url_light, getContractDisplayDetailsResponse.image_url_light) && Intrinsics.areEqual(this.yes_no_and_contract_subtitle_name, getContractDisplayDetailsResponse.yes_no_and_contract_subtitle_name) && Intrinsics.areEqual(this.yes_no_and_contract_name, getContractDisplayDetailsResponse.yes_no_and_contract_name) && Intrinsics.areEqual(this.caching_key, getContractDisplayDetailsResponse.caching_key) && Intrinsics.areEqual(this.prop_name, getContractDisplayDetailsResponse.prop_name) && Intrinsics.areEqual(this.selected_leg_display_details, getContractDisplayDetailsResponse.selected_leg_display_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.contract_title_name.hashCode()) * 37) + this.event_display_name.hashCode()) * 37) + this.contract_subtitle_name.hashCode()) * 37) + this.contract_prefix.hashCode()) * 37) + this.image_url_dark.hashCode()) * 37) + this.image_url_light.hashCode()) * 37;
        String str = this.yes_no_and_contract_subtitle_name;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.yes_no_and_contract_name.hashCode()) * 37;
        GetContractDisplayDetailsRequest getContractDisplayDetailsRequest = this.caching_key;
        int iHashCode3 = ((((iHashCode2 + (getContractDisplayDetailsRequest != null ? getContractDisplayDetailsRequest.hashCode() : 0)) * 37) + this.prop_name.hashCode()) * 37) + this.selected_leg_display_details.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_title_name=" + Internal.sanitize(this.contract_title_name));
        arrayList.add("event_display_name=" + Internal.sanitize(this.event_display_name));
        arrayList.add("contract_subtitle_name=" + Internal.sanitize(this.contract_subtitle_name));
        arrayList.add("contract_prefix=" + Internal.sanitize(this.contract_prefix));
        arrayList.add("image_url_dark=" + Internal.sanitize(this.image_url_dark));
        arrayList.add("image_url_light=" + Internal.sanitize(this.image_url_light));
        String str = this.yes_no_and_contract_subtitle_name;
        if (str != null) {
            arrayList.add("yes_no_and_contract_subtitle_name=" + Internal.sanitize(str));
        }
        arrayList.add("yes_no_and_contract_name=" + Internal.sanitize(this.yes_no_and_contract_name));
        GetContractDisplayDetailsRequest getContractDisplayDetailsRequest = this.caching_key;
        if (getContractDisplayDetailsRequest != null) {
            arrayList.add("caching_key=" + getContractDisplayDetailsRequest);
        }
        arrayList.add("prop_name=" + Internal.sanitize(this.prop_name));
        if (!this.selected_leg_display_details.isEmpty()) {
            arrayList.add("selected_leg_display_details=" + this.selected_leg_display_details);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetContractDisplayDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetContractDisplayDetailsResponse copy$default(GetContractDisplayDetailsResponse getContractDisplayDetailsResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, GetContractDisplayDetailsRequest getContractDisplayDetailsRequest, String str9, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getContractDisplayDetailsResponse.contract_title_name;
        }
        if ((i & 2) != 0) {
            str2 = getContractDisplayDetailsResponse.event_display_name;
        }
        if ((i & 4) != 0) {
            str3 = getContractDisplayDetailsResponse.contract_subtitle_name;
        }
        if ((i & 8) != 0) {
            str4 = getContractDisplayDetailsResponse.contract_prefix;
        }
        if ((i & 16) != 0) {
            str5 = getContractDisplayDetailsResponse.image_url_dark;
        }
        if ((i & 32) != 0) {
            str6 = getContractDisplayDetailsResponse.image_url_light;
        }
        if ((i & 64) != 0) {
            str7 = getContractDisplayDetailsResponse.yes_no_and_contract_subtitle_name;
        }
        if ((i & 128) != 0) {
            str8 = getContractDisplayDetailsResponse.yes_no_and_contract_name;
        }
        if ((i & 256) != 0) {
            getContractDisplayDetailsRequest = getContractDisplayDetailsResponse.caching_key;
        }
        if ((i & 512) != 0) {
            str9 = getContractDisplayDetailsResponse.prop_name;
        }
        if ((i & 1024) != 0) {
            list = getContractDisplayDetailsResponse.selected_leg_display_details;
        }
        if ((i & 2048) != 0) {
            byteString = getContractDisplayDetailsResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        GetContractDisplayDetailsRequest getContractDisplayDetailsRequest2 = getContractDisplayDetailsRequest;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return getContractDisplayDetailsResponse.copy(str, str2, str3, str4, str13, str14, str11, str12, getContractDisplayDetailsRequest2, str10, list2, byteString2);
    }

    public final GetContractDisplayDetailsResponse copy(String contract_title_name, String event_display_name, String contract_subtitle_name, String contract_prefix, String image_url_dark, String image_url_light, String yes_no_and_contract_subtitle_name, String yes_no_and_contract_name, GetContractDisplayDetailsRequest caching_key, String prop_name, List<GetContractDisplayDetailsResponse> selected_leg_display_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_title_name, "contract_title_name");
        Intrinsics.checkNotNullParameter(event_display_name, "event_display_name");
        Intrinsics.checkNotNullParameter(contract_subtitle_name, "contract_subtitle_name");
        Intrinsics.checkNotNullParameter(contract_prefix, "contract_prefix");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(prop_name, "prop_name");
        Intrinsics.checkNotNullParameter(selected_leg_display_details, "selected_leg_display_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetContractDisplayDetailsResponse(contract_title_name, event_display_name, contract_subtitle_name, contract_prefix, image_url_dark, image_url_light, yes_no_and_contract_subtitle_name, yes_no_and_contract_name, caching_key, prop_name, selected_leg_display_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetContractDisplayDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetContractDisplayDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetContractDisplayDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetContractDisplayDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_title_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_title_name());
                }
                if (!Intrinsics.areEqual(value.getEvent_display_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent_display_name());
                }
                if (!Intrinsics.areEqual(value.getContract_subtitle_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getContract_subtitle_name());
                }
                if (!Intrinsics.areEqual(value.getContract_prefix(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getContract_prefix());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getImage_url_dark());
                }
                if (!Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getImage_url_light());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(7, value.getYes_no_and_contract_subtitle_name());
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getYes_no_and_contract_name());
                }
                if (value.getCaching_key() != null) {
                    iEncodedSizeWithTag += GetContractDisplayDetailsRequest.ADAPTER.encodedSizeWithTag(9, value.getCaching_key());
                }
                if (!Intrinsics.areEqual(value.getProp_name(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(10, value.getProp_name());
                }
                return iEncodedSizeWithTag + GetContractDisplayDetailsResponse.ADAPTER.asRepeated().encodedSizeWithTag(11, value.getSelected_leg_display_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetContractDisplayDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_title_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_title_name());
                }
                if (!Intrinsics.areEqual(value.getEvent_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_display_name());
                }
                if (!Intrinsics.areEqual(value.getContract_subtitle_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_subtitle_name());
                }
                if (!Intrinsics.areEqual(value.getContract_prefix(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContract_prefix());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getImage_url_dark());
                }
                if (!Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getImage_url_light());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getYes_no_and_contract_subtitle_name());
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getYes_no_and_contract_name());
                }
                if (value.getCaching_key() != null) {
                    GetContractDisplayDetailsRequest.ADAPTER.encodeWithTag(writer, 9, (int) value.getCaching_key());
                }
                if (!Intrinsics.areEqual(value.getProp_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getProp_name());
                }
                GetContractDisplayDetailsResponse.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getSelected_leg_display_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetContractDisplayDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetContractDisplayDetailsResponse.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getSelected_leg_display_details());
                if (!Intrinsics.areEqual(value.getProp_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getProp_name());
                }
                if (value.getCaching_key() != null) {
                    GetContractDisplayDetailsRequest.ADAPTER.encodeWithTag(writer, 9, (int) value.getCaching_key());
                }
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getYes_no_and_contract_name());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getYes_no_and_contract_subtitle_name());
                if (!Intrinsics.areEqual(value.getImage_url_light(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getImage_url_light());
                }
                if (!Intrinsics.areEqual(value.getImage_url_dark(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getImage_url_dark());
                }
                if (!Intrinsics.areEqual(value.getContract_prefix(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getContract_prefix());
                }
                if (!Intrinsics.areEqual(value.getContract_subtitle_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_subtitle_name());
                }
                if (!Intrinsics.areEqual(value.getEvent_display_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getEvent_display_name());
                }
                if (Intrinsics.areEqual(value.getContract_title_name(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContract_title_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetContractDisplayDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = null;
                GetContractDisplayDetailsRequest getContractDisplayDetailsRequestDecode = null;
                String strDecode9 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                getContractDisplayDetailsRequestDecode = GetContractDisplayDetailsRequest.ADAPTER.decode(reader);
                                break;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                arrayList.add(GetContractDisplayDetailsResponse.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetContractDisplayDetailsResponse(strDecode, strDecode9, strDecode2, strDecode3, strDecode4, strDecode5, strDecode8, strDecode6, getContractDisplayDetailsRequestDecode, strDecode7, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetContractDisplayDetailsResponse redact(GetContractDisplayDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetContractDisplayDetailsRequest caching_key = value.getCaching_key();
                return GetContractDisplayDetailsResponse.copy$default(value, null, null, null, null, null, null, null, null, caching_key != null ? GetContractDisplayDetailsRequest.ADAPTER.redact(caching_key) : null, null, Internal.m26823redactElements(value.getSelected_leg_display_details(), GetContractDisplayDetailsResponse.ADAPTER), ByteString.EMPTY, 767, null);
            }
        };
    }
}
