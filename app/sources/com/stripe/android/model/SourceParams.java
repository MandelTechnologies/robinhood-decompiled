package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Source;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parceler;
import org.json.JSONObject;

/* compiled from: SourceParams.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b=\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0006feghijB»\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010?R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00101\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010?R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010 \"\u0004\bZ\u0010[R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\\R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010]R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010d\u001a\u00020\u00038F¢\u0006\f\u0012\u0004\bb\u0010c\u001a\u0004\ba\u0010\"¨\u0006k"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "typeRaw", "Lcom/stripe/android/model/SourceParams$TypeData;", "typeData", "", "amount", "currency", "Lcom/stripe/android/model/SourceParams$OwnerParams;", "owner", "Lcom/stripe/android/model/Source$Usage;", "usage", "returnUrl", "Lcom/stripe/android/model/SourceParams$Flow;", "flow", "Lcom/stripe/android/model/SourceOrderParams;", "sourceOrder", "token", "", "metadata", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "weChatParams", "Lcom/stripe/android/model/SourceParams$ApiParams;", "apiParams", "", "attribution", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)V", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTypeRaw", "Lcom/stripe/android/model/SourceParams$TypeData;", "getTypeData$payments_core_release", "()Lcom/stripe/android/model/SourceParams$TypeData;", "setTypeData$payments_core_release", "(Lcom/stripe/android/model/SourceParams$TypeData;)V", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/SourceParams$OwnerParams;", "getOwner", "()Lcom/stripe/android/model/SourceParams$OwnerParams;", "setOwner", "(Lcom/stripe/android/model/SourceParams$OwnerParams;)V", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)V", "getReturnUrl", "setReturnUrl", "Lcom/stripe/android/model/SourceParams$Flow;", "getFlow", "()Lcom/stripe/android/model/SourceParams$Flow;", "setFlow", "(Lcom/stripe/android/model/SourceParams$Flow;)V", "Lcom/stripe/android/model/SourceOrderParams;", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrderParams;", "setSourceOrder", "(Lcom/stripe/android/model/SourceOrderParams;)V", "getToken", "setToken", "Ljava/util/Map;", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/SourceParams$ApiParams;", "Ljava/util/Set;", "getAttribution$payments_core_release", "()Ljava/util/Set;", "getType", "getType$annotations", "()V", "type", "Companion", "ApiParams", "Flow", "OwnerParams", "TypeData", "WeChatParams", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SourceParams implements StripeParamsModel, Parcelable {
    private Long amount;
    private ApiParams apiParams;
    private final Set<String> attribution;
    private String currency;
    private Flow flow;
    private Map<String, String> metadata;
    private OwnerParams owner;
    private String returnUrl;
    private SourceOrderParams sourceOrder;
    private String token;
    private TypeData typeData;
    private final String typeRaw;
    private Source.Usage usage;
    private WeChatParams weChatParams;
    public static final int $stable = 8;
    public static final Parcelable.Creator<SourceParams> CREATOR = new Creator();

    /* compiled from: SourceParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            TypeData typeData = (TypeData) parcel.readParcelable(SourceParams.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            OwnerParams ownerParamsCreateFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
            Source.Usage usageValueOf = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String string4 = parcel.readString();
            Flow flowValueOf = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            SourceOrderParams sourceOrderParamsCreateFromParcel = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            WeChatParams weChatParamsCreateFromParcel = parcel.readInt() == 0 ? null : WeChatParams.CREATOR.createFromParcel(parcel);
            ApiParams apiParamsCreateFromParcel = ApiParams.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashSet.add(parcel.readString());
            }
            return new SourceParams(string2, typeData, lValueOf, string3, ownerParamsCreateFromParcel, usageValueOf, string4, flowValueOf, sourceOrderParamsCreateFromParcel, string5, linkedHashMap, weChatParamsCreateFromParcel, apiParamsCreateFromParcel, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams[] newArray(int i) {
            return new SourceParams[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceParams)) {
            return false;
        }
        SourceParams sourceParams = (SourceParams) other;
        return Intrinsics.areEqual(this.typeRaw, sourceParams.typeRaw) && Intrinsics.areEqual(this.typeData, sourceParams.typeData) && Intrinsics.areEqual(this.amount, sourceParams.amount) && Intrinsics.areEqual(this.currency, sourceParams.currency) && Intrinsics.areEqual(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && Intrinsics.areEqual(this.returnUrl, sourceParams.returnUrl) && this.flow == sourceParams.flow && Intrinsics.areEqual(this.sourceOrder, sourceParams.sourceOrder) && Intrinsics.areEqual(this.token, sourceParams.token) && Intrinsics.areEqual(this.metadata, sourceParams.metadata) && Intrinsics.areEqual(this.weChatParams, sourceParams.weChatParams) && Intrinsics.areEqual(this.apiParams, sourceParams.apiParams) && Intrinsics.areEqual(this.attribution, sourceParams.attribution);
    }

    public int hashCode() {
        int iHashCode = this.typeRaw.hashCode() * 31;
        TypeData typeData = this.typeData;
        int iHashCode2 = (iHashCode + (typeData == null ? 0 : typeData.hashCode())) * 31;
        Long l = this.amount;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int iHashCode5 = (iHashCode4 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int iHashCode6 = (iHashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int iHashCode8 = (iHashCode7 + (flow == null ? 0 : flow.hashCode())) * 31;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        int iHashCode9 = (iHashCode8 + (sourceOrderParams == null ? 0 : sourceOrderParams.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        WeChatParams weChatParams = this.weChatParams;
        return ((((iHashCode11 + (weChatParams != null ? weChatParams.hashCode() : 0)) * 31) + this.apiParams.hashCode()) * 31) + this.attribution.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.typeRaw + ", typeData=" + this.typeData + ", amount=" + this.amount + ", currency=" + this.currency + ", owner=" + this.owner + ", usage=" + this.usage + ", returnUrl=" + this.returnUrl + ", flow=" + this.flow + ", sourceOrder=" + this.sourceOrder + ", token=" + this.token + ", metadata=" + this.metadata + ", weChatParams=" + this.weChatParams + ", apiParams=" + this.apiParams + ", attribution=" + this.attribution + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.typeRaw);
        parcel.writeParcelable(this.typeData, flags);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownerParams.writeToParcel(parcel, flags);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        parcel.writeString(this.returnUrl);
        Flow flow = this.flow;
        if (flow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(flow.name());
        }
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        if (sourceOrderParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceOrderParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.token);
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        WeChatParams weChatParams = this.weChatParams;
        if (weChatParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            weChatParams.writeToParcel(parcel, flags);
        }
        this.apiParams.writeToParcel(parcel, flags);
        Set<String> set = this.attribution;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    public SourceParams(String typeRaw, TypeData typeData, Long l, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.typeRaw = typeRaw;
        this.typeData = typeData;
        this.amount = l;
        this.currency = str;
        this.owner = ownerParams;
        this.usage = usage;
        this.returnUrl = str2;
        this.flow = flow;
        this.sourceOrder = sourceOrderParams;
        this.token = str3;
        this.metadata = map;
        this.weChatParams = weChatParams;
        this.apiParams = apiParams;
        this.attribution = attribution;
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final String getType() {
        return Source.INSTANCE.asSourceType(this.typeRaw);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("type", this.typeRaw));
        Map<String, Object> value = this.apiParams.getValue();
        if (value.isEmpty()) {
            value = null;
        }
        Map mapMapOf2 = value != null ? MapsKt.mapOf(Tuples4.m3642to(this.typeRaw, value)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        TypeData typeData = this.typeData;
        Map<String, Map<String, Object>> mapCreateParams = typeData != null ? typeData.createParams() : null;
        if (mapCreateParams == null) {
            mapCreateParams = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapCreateParams);
        Long l = this.amount;
        Map mapMapOf3 = l != null ? MapsKt.mapOf(Tuples4.m3642to("amount", Long.valueOf(l.longValue()))) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
        String str = this.currency;
        Map mapMapOf4 = str != null ? MapsKt.mapOf(Tuples4.m3642to("currency", str)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        Map mapPlus4 = MapsKt.plus(mapPlus3, mapMapOf4);
        Flow flow = this.flow;
        Map mapMapOf5 = flow != null ? MapsKt.mapOf(Tuples4.m3642to("flow", flow.getCode())) : null;
        if (mapMapOf5 == null) {
            mapMapOf5 = MapsKt.emptyMap();
        }
        Map mapPlus5 = MapsKt.plus(mapPlus4, mapMapOf5);
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        Map mapMapOf6 = sourceOrderParams != null ? MapsKt.mapOf(Tuples4.m3642to("source_order", sourceOrderParams.toParamMap())) : null;
        if (mapMapOf6 == null) {
            mapMapOf6 = MapsKt.emptyMap();
        }
        Map mapPlus6 = MapsKt.plus(mapPlus5, mapMapOf6);
        OwnerParams ownerParams = this.owner;
        Map mapMapOf7 = ownerParams != null ? MapsKt.mapOf(Tuples4.m3642to("owner", ownerParams.toParamMap())) : null;
        if (mapMapOf7 == null) {
            mapMapOf7 = MapsKt.emptyMap();
        }
        Map mapPlus7 = MapsKt.plus(mapPlus6, mapMapOf7);
        String str2 = this.returnUrl;
        Map mapMapOf8 = str2 != null ? MapsKt.mapOf(Tuples4.m3642to("redirect", MapsKt.mapOf(Tuples4.m3642to("return_url", str2)))) : null;
        if (mapMapOf8 == null) {
            mapMapOf8 = MapsKt.emptyMap();
        }
        Map mapPlus8 = MapsKt.plus(mapPlus7, mapMapOf8);
        Map<String, String> map = this.metadata;
        Map mapMapOf9 = map != null ? MapsKt.mapOf(Tuples4.m3642to("metadata", map)) : null;
        if (mapMapOf9 == null) {
            mapMapOf9 = MapsKt.emptyMap();
        }
        Map mapPlus9 = MapsKt.plus(mapPlus8, mapMapOf9);
        String str3 = this.token;
        Map mapMapOf10 = str3 != null ? MapsKt.mapOf(Tuples4.m3642to("token", str3)) : null;
        if (mapMapOf10 == null) {
            mapMapOf10 = MapsKt.emptyMap();
        }
        Map mapPlus10 = MapsKt.plus(mapPlus9, mapMapOf10);
        Source.Usage usage = this.usage;
        Map mapMapOf11 = usage != null ? MapsKt.mapOf(Tuples4.m3642to("usage", usage.getCode())) : null;
        if (mapMapOf11 == null) {
            mapMapOf11 = MapsKt.emptyMap();
        }
        Map mapPlus11 = MapsKt.plus(mapPlus10, mapMapOf11);
        WeChatParams weChatParams = this.weChatParams;
        Map mapMapOf12 = weChatParams != null ? MapsKt.mapOf(Tuples4.m3642to("wechat", weChatParams.toParamMap())) : null;
        if (mapMapOf12 == null) {
            mapMapOf12 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus11, mapMapOf12);
    }

    /* compiled from: SourceParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "appId", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class WeChatParams implements StripeParamsModel, Parcelable {
        private final String appId;
        private final String statementDescriptor;
        public static final Parcelable.Creator<WeChatParams> CREATOR = new Creator();

        /* compiled from: SourceParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WeChatParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams[] newArray(int i) {
                return new WeChatParams[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WeChatParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeChatParams)) {
                return false;
            }
            WeChatParams weChatParams = (WeChatParams) other;
            return Intrinsics.areEqual(this.appId, weChatParams.appId) && Intrinsics.areEqual(this.statementDescriptor, weChatParams.statementDescriptor);
        }

        public int hashCode() {
            String str = this.appId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.statementDescriptor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.appId + ", statementDescriptor=" + this.statementDescriptor + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.appId);
            parcel.writeString(this.statementDescriptor);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        public /* synthetic */ WeChatParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            String str = this.appId;
            Map mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("appid", str)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str2 = this.statementDescriptor;
            Map mapMapOf2 = str2 != null ? MapsKt.mapOf(Tuples4.m3642to("statement_descriptor", str2)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus, mapMapOf2);
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B9\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010'¨\u0006-"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "", "email", "name", "phone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "getAddress$payments_core_release", "()Lcom/stripe/android/model/Address;", "setAddress$payments_core_release", "(Lcom/stripe/android/model/Address;)V", "Ljava/lang/String;", "getEmail$payments_core_release", "setEmail$payments_core_release", "(Ljava/lang/String;)V", "getName$payments_core_release", "setName$payments_core_release", "getPhone$payments_core_release", "setPhone$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OwnerParams implements StripeParamsModel, Parcelable {
        private Address address;
        private String email;
        private String name;
        private String phone;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator();

        /* compiled from: SourceParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OwnerParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OwnerParams(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams[] newArray(int i) {
                return new OwnerParams[i];
            }
        }

        @JvmOverloads
        public OwnerParams() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnerParams)) {
                return false;
            }
            OwnerParams ownerParams = (OwnerParams) other;
            return Intrinsics.areEqual(this.address, ownerParams.address) && Intrinsics.areEqual(this.email, ownerParams.email) && Intrinsics.areEqual(this.name, ownerParams.name) && Intrinsics.areEqual(this.phone, ownerParams.phone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        @JvmOverloads
        public OwnerParams(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ OwnerParams(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            Address address = this.address;
            Map mapMapOf = address != null ? MapsKt.mapOf(Tuples4.m3642to(PlaceTypes.ADDRESS, address.toParamMap())) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str = this.email;
            Map mapMapOf2 = str != null ? MapsKt.mapOf(Tuples4.m3642to("email", str)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf2);
            String str2 = this.name;
            Map mapMapOf3 = str2 != null ? MapsKt.mapOf(Tuples4.m3642to("name", str2)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
            String str3 = this.phone;
            Map mapMapOf4 = str3 != null ? MapsKt.mapOf(Tuples4.m3642to("phone", str3)) : null;
            if (mapMapOf4 == null) {
                mapMapOf4 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus3, mapMapOf4);
        }

        /* compiled from: SourceParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SourceParams.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$Flow;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;
        private final String code;
        public static final Flow Redirect = new Flow("Redirect", 0, "redirect");
        public static final Flow Receiver = new Flow("Receiver", 1, "receiver");
        public static final Flow CodeVerification = new Flow("CodeVerification", 2, "code_verification");
        public static final Flow None = new Flow("None", 3, ApiRenderablePlatforms.VERSIONS_NONE);

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{Redirect, Receiver, CodeVerification, None};
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }

        private Flow(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(flowArr$values);
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams;", "Landroid/os/Parcelable;", "", "", "", "value", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getValue", "()Ljava/util/Map;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ApiParams implements Parcelable {
        private final Map<String, Object> value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<ApiParams> CREATOR = new Creator();

        /* compiled from: SourceParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ApiParams.INSTANCE.create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams[] newArray(int i) {
                return new ApiParams[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ApiParams() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiParams) && Intrinsics.areEqual(this.value, ((ApiParams) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            INSTANCE.write(this, parcel, flags);
        }

        public ApiParams(Map<String, ? extends Object> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public /* synthetic */ ApiParams(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, Object> getValue() {
            return this.value;
        }

        /* compiled from: SourceParams.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/model/SourceParams$ApiParams;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion implements Parceler<ApiParams> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public void write(ApiParams apiParams, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(apiParams, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JSONObject jSONObjectMapToJsonObject = StripeJsonUtils.INSTANCE.mapToJsonObject(apiParams.getValue());
                parcel.writeString(jSONObjectMapToJsonObject != null ? jSONObjectMapToJsonObject.toString() : null);
            }

            public ApiParams create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                String string2 = parcel.readString();
                Map mapJsonObjectToMap = stripeJsonUtils.jsonObjectToMap(string2 != null ? new JSONObject(string2) : null);
                if (mapJsonObjectToMap == null) {
                    mapJsonObjectToMap = MapsKt.emptyMap();
                }
                return new ApiParams(mapJsonObjectToMap);
            }
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/SourceParams$TypeData;", "Landroid/os/Parcelable;", "<init>", "()V", "", "", "", "createParams", "()Ljava/util/Map;", "getType", "()Ljava/lang/String;", "type", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "params", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static abstract class TypeData implements Parcelable {
        public abstract List<Tuples2<String, Object>> getParams();

        public abstract String getType();

        private TypeData() {
        }

        public final Map<String, Map<String, Object>> createParams() {
            Map<String, Map<String, Object>> mapMapOf;
            List<Tuples2<String, Object>> params = getParams();
            Map mapEmptyMap = MapsKt.emptyMap();
            Iterator<T> it = params.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Tuples2 tuples2 = (Tuples2) it.next();
                String str = (String) tuples2.component1();
                Object objComponent2 = tuples2.component2();
                mapMapOf = objComponent2 != null ? MapsKt.mapOf(Tuples4.m3642to(str, objComponent2)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            if (mapEmptyMap.isEmpty()) {
                mapEmptyMap = null;
            }
            mapMapOf = mapEmptyMap != null ? MapsKt.mapOf(Tuples4.m3642to(getType(), mapEmptyMap)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }
    }
}
