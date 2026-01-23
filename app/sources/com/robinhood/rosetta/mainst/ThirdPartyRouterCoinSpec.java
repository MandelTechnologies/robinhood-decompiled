package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: ThirdPartyRouterCoinSpec.kt */
@kotlin.Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J&\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ThirdPartyRouterCoinSpec;", "Lcom/squareup/wire/Message;", "", "child_market_coin_spec", "", "", "Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpec;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "getChild_market_coin_spec", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ThirdPartyRouterCoinSpec extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ChildMarketCoinSpec#ADAPTER", jsonName = "childMarketCoinSpec", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final Map<String, ChildMarketCoinSpec> child_market_coin_spec;

    @JvmField
    public static final ProtoAdapter<ThirdPartyRouterCoinSpec> ADAPTER = new ThirdPartyRouterCoinSpec2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(ThirdPartyRouterCoinSpec.class), Syntax.PROTO_3);

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyRouterCoinSpec() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24704newBuilder();
    }

    public /* synthetic */ ThirdPartyRouterCoinSpec(Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyRouterCoinSpec(Map<String, ChildMarketCoinSpec> child_market_coin_spec, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(child_market_coin_spec, "child_market_coin_spec");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.child_market_coin_spec = Internal.immutableCopyOf("child_market_coin_spec", child_market_coin_spec);
    }

    public final Map<String, ChildMarketCoinSpec> getChild_market_coin_spec() {
        return this.child_market_coin_spec;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24704newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ThirdPartyRouterCoinSpec)) {
            return false;
        }
        ThirdPartyRouterCoinSpec thirdPartyRouterCoinSpec = (ThirdPartyRouterCoinSpec) other;
        return Intrinsics.areEqual(unknownFields(), thirdPartyRouterCoinSpec.unknownFields()) && Intrinsics.areEqual(this.child_market_coin_spec, thirdPartyRouterCoinSpec.child_market_coin_spec);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.child_market_coin_spec.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.child_market_coin_spec.isEmpty()) {
            arrayList.add("child_market_coin_spec=" + this.child_market_coin_spec);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThirdPartyRouterCoinSpec{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdPartyRouterCoinSpec copy$default(ThirdPartyRouterCoinSpec thirdPartyRouterCoinSpec, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = thirdPartyRouterCoinSpec.child_market_coin_spec;
        }
        if ((i & 2) != 0) {
            byteString = thirdPartyRouterCoinSpec.unknownFields();
        }
        return thirdPartyRouterCoinSpec.copy(map, byteString);
    }

    public final ThirdPartyRouterCoinSpec copy(Map<String, ChildMarketCoinSpec> child_market_coin_spec, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(child_market_coin_spec, "child_market_coin_spec");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ThirdPartyRouterCoinSpec(child_market_coin_spec, unknownFields);
    }
}
