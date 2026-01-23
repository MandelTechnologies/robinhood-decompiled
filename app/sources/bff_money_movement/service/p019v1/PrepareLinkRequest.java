package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import accio.service.p003v1.Purpose;
import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PrepareLinkRequest.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\nH\u0016J`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequest;", "Lcom/squareup/wire/Message;", "", "provider", "Laccio/service/v1/Provider;", "purposes", "", "Laccio/service/v1/Purpose;", "metadata", "", "", "is_update_mode", "", "institution_id", "plaid_details", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Laccio/service/v1/Provider;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;Lokio/ByteString;)V", "getProvider", "()Laccio/service/v1/Provider;", "()Z", "getInstitution_id", "()Ljava/lang/String;", "getPlaid_details", "()Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "getPurposes", "()Ljava/util/List;", "getMetadata", "()Ljava/util/Map;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PrepareLinkRequest extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String institution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUpdateMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final boolean is_update_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, String> metadata;

    @WireField(adapter = "bff_money_movement.service.v1.PlaidPrepareLinkDetails#ADAPTER", jsonName = "plaidDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 5, tag = 50)
    private final PlaidPrepareLinkDetails plaid_details;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Provider provider;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Purpose> purposes;

    @JvmField
    public static final ProtoAdapter<PrepareLinkRequest> ADAPTER = new PrepareLinkRequest2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PrepareLinkRequest.class), Syntax.PROTO_3);

    public PrepareLinkRequest() {
        this(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8506newBuilder();
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public /* synthetic */ PrepareLinkRequest(Provider provider, List list, Map map, boolean z, String str, PlaidPrepareLinkDetails plaidPrepareLinkDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : plaidPrepareLinkDetails, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_update_mode, reason: from getter */
    public final boolean getIs_update_mode() {
        return this.is_update_mode;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public final PlaidPrepareLinkDetails getPlaid_details() {
        return this.plaid_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareLinkRequest(Provider provider, List<? extends Purpose> purposes, Map<String, String> metadata, boolean z, String institution_id, PlaidPrepareLinkDetails plaidPrepareLinkDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.provider = provider;
        this.is_update_mode = z;
        this.institution_id = institution_id;
        this.plaid_details = plaidPrepareLinkDetails;
        this.purposes = Internal.immutableCopyOf("purposes", purposes);
        this.metadata = Internal.immutableCopyOf("metadata", metadata);
    }

    public final List<Purpose> getPurposes() {
        return this.purposes;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8506newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrepareLinkRequest)) {
            return false;
        }
        PrepareLinkRequest prepareLinkRequest = (PrepareLinkRequest) other;
        return Intrinsics.areEqual(unknownFields(), prepareLinkRequest.unknownFields()) && this.provider == prepareLinkRequest.provider && Intrinsics.areEqual(this.purposes, prepareLinkRequest.purposes) && Intrinsics.areEqual(this.metadata, prepareLinkRequest.metadata) && this.is_update_mode == prepareLinkRequest.is_update_mode && Intrinsics.areEqual(this.institution_id, prepareLinkRequest.institution_id) && Intrinsics.areEqual(this.plaid_details, prepareLinkRequest.plaid_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.provider.hashCode()) * 37) + this.purposes.hashCode()) * 37) + this.metadata.hashCode()) * 37) + Boolean.hashCode(this.is_update_mode)) * 37) + this.institution_id.hashCode()) * 37;
        PlaidPrepareLinkDetails plaidPrepareLinkDetails = this.plaid_details;
        int iHashCode2 = iHashCode + (plaidPrepareLinkDetails != null ? plaidPrepareLinkDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("provider=" + this.provider);
        if (!this.purposes.isEmpty()) {
            arrayList.add("purposes=" + this.purposes);
        }
        if (!this.metadata.isEmpty()) {
            arrayList.add("metadata=" + this.metadata);
        }
        arrayList.add("is_update_mode=" + this.is_update_mode);
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        PlaidPrepareLinkDetails plaidPrepareLinkDetails = this.plaid_details;
        if (plaidPrepareLinkDetails != null) {
            arrayList.add("plaid_details=" + plaidPrepareLinkDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepareLinkRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PrepareLinkRequest copy$default(PrepareLinkRequest prepareLinkRequest, Provider provider, List list, Map map, boolean z, String str, PlaidPrepareLinkDetails plaidPrepareLinkDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            provider = prepareLinkRequest.provider;
        }
        if ((i & 2) != 0) {
            list = prepareLinkRequest.purposes;
        }
        if ((i & 4) != 0) {
            map = prepareLinkRequest.metadata;
        }
        if ((i & 8) != 0) {
            z = prepareLinkRequest.is_update_mode;
        }
        if ((i & 16) != 0) {
            str = prepareLinkRequest.institution_id;
        }
        if ((i & 32) != 0) {
            plaidPrepareLinkDetails = prepareLinkRequest.plaid_details;
        }
        if ((i & 64) != 0) {
            byteString = prepareLinkRequest.unknownFields();
        }
        PlaidPrepareLinkDetails plaidPrepareLinkDetails2 = plaidPrepareLinkDetails;
        ByteString byteString2 = byteString;
        String str2 = str;
        Map map2 = map;
        return prepareLinkRequest.copy(provider, list, map2, z, str2, plaidPrepareLinkDetails2, byteString2);
    }

    public final PrepareLinkRequest copy(Provider provider, List<? extends Purpose> purposes, Map<String, String> metadata, boolean is_update_mode, String institution_id, PlaidPrepareLinkDetails plaid_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrepareLinkRequest(provider, purposes, metadata, is_update_mode, institution_id, plaid_details, unknownFields);
    }
}
