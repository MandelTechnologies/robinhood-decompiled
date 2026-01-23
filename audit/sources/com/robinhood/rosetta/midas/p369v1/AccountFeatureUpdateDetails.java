package com.robinhood.rosetta.midas.p369v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
import p479j$.time.Instant;
import rosetta.midas.p538v1.SubscriptionFeatures;
import rosetta.midas.p538v1.UserProduct;

/* compiled from: AccountFeatureUpdateDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BE\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "Lcom/squareup/wire/Message;", "", "Lrosetta/midas/v1/SubscriptionFeatures;", "account_subscription_features", "Lokio/ByteString;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "subscription_updated_at", "Lrosetta/midas/v1/UserProduct;", "user_product", "unknownFields", "<init>", "(Lrosetta/midas/v1/SubscriptionFeatures;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProduct;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lrosetta/midas/v1/SubscriptionFeatures;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProduct;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "Lrosetta/midas/v1/SubscriptionFeatures;", "getAccount_subscription_features", "()Lrosetta/midas/v1/SubscriptionFeatures;", "Lokio/ByteString;", "getSubscription_id", "()Lokio/ByteString;", "Lj$/time/Instant;", "getSubscription_updated_at", "()Lj$/time/Instant;", "Lrosetta/midas/v1/UserProduct;", "getUser_product", "()Lrosetta/midas/v1/UserProduct;", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountFeatureUpdateDetails extends Message {

    @JvmField
    public static final ProtoAdapter<AccountFeatureUpdateDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.midas.v1.SubscriptionFeatures#ADAPTER", jsonName = "accountSubscriptionFeatures", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SubscriptionFeatures account_subscription_features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString subscription_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "subscriptionUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant subscription_updated_at;

    @WireField(adapter = "rosetta.midas.v1.UserProduct#ADAPTER", jsonName = "userProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final UserProduct user_product;

    public AccountFeatureUpdateDetails() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24711newBuilder();
    }

    public final SubscriptionFeatures getAccount_subscription_features() {
        return this.account_subscription_features;
    }

    public final ByteString getSubscription_id() {
        return this.subscription_id;
    }

    public /* synthetic */ AccountFeatureUpdateDetails(SubscriptionFeatures subscriptionFeatures, ByteString byteString, Instant instant, UserProduct userProduct, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : subscriptionFeatures, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : userProduct, (i & 16) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final Instant getSubscription_updated_at() {
        return this.subscription_updated_at;
    }

    public final UserProduct getUser_product() {
        return this.user_product;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFeatureUpdateDetails(SubscriptionFeatures subscriptionFeatures, ByteString subscription_id, Instant instant, UserProduct userProduct, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_subscription_features = subscriptionFeatures;
        this.subscription_id = subscription_id;
        this.subscription_updated_at = instant;
        this.user_product = userProduct;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24711newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountFeatureUpdateDetails)) {
            return false;
        }
        AccountFeatureUpdateDetails accountFeatureUpdateDetails = (AccountFeatureUpdateDetails) other;
        return Intrinsics.areEqual(unknownFields(), accountFeatureUpdateDetails.unknownFields()) && Intrinsics.areEqual(this.account_subscription_features, accountFeatureUpdateDetails.account_subscription_features) && Intrinsics.areEqual(this.subscription_id, accountFeatureUpdateDetails.subscription_id) && Intrinsics.areEqual(this.subscription_updated_at, accountFeatureUpdateDetails.subscription_updated_at) && Intrinsics.areEqual(this.user_product, accountFeatureUpdateDetails.user_product);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SubscriptionFeatures subscriptionFeatures = this.account_subscription_features;
        int iHashCode2 = (((iHashCode + (subscriptionFeatures != null ? subscriptionFeatures.hashCode() : 0)) * 37) + this.subscription_id.hashCode()) * 37;
        Instant instant = this.subscription_updated_at;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        UserProduct userProduct = this.user_product;
        int iHashCode4 = iHashCode3 + (userProduct != null ? userProduct.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SubscriptionFeatures subscriptionFeatures = this.account_subscription_features;
        if (subscriptionFeatures != null) {
            arrayList.add("account_subscription_features=" + subscriptionFeatures);
        }
        arrayList.add("subscription_id=" + this.subscription_id);
        Instant instant = this.subscription_updated_at;
        if (instant != null) {
            arrayList.add("subscription_updated_at=" + instant);
        }
        UserProduct userProduct = this.user_product;
        if (userProduct != null) {
            arrayList.add("user_product=" + userProduct);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountFeatureUpdateDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountFeatureUpdateDetails copy$default(AccountFeatureUpdateDetails accountFeatureUpdateDetails, SubscriptionFeatures subscriptionFeatures, ByteString byteString, Instant instant, UserProduct userProduct, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionFeatures = accountFeatureUpdateDetails.account_subscription_features;
        }
        if ((i & 2) != 0) {
            byteString = accountFeatureUpdateDetails.subscription_id;
        }
        if ((i & 4) != 0) {
            instant = accountFeatureUpdateDetails.subscription_updated_at;
        }
        if ((i & 8) != 0) {
            userProduct = accountFeatureUpdateDetails.user_product;
        }
        if ((i & 16) != 0) {
            byteString2 = accountFeatureUpdateDetails.unknownFields();
        }
        ByteString byteString3 = byteString2;
        Instant instant2 = instant;
        return accountFeatureUpdateDetails.copy(subscriptionFeatures, byteString, instant2, userProduct, byteString3);
    }

    public final AccountFeatureUpdateDetails copy(SubscriptionFeatures account_subscription_features, ByteString subscription_id, Instant subscription_updated_at, UserProduct user_product, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountFeatureUpdateDetails(account_subscription_features, subscription_id, subscription_updated_at, user_product, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountFeatureUpdateDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountFeatureUpdateDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.AccountFeatureUpdateDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountFeatureUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount_subscription_features() != null) {
                    size += SubscriptionFeatures.ADAPTER.encodedSizeWithTag(1, value.getAccount_subscription_features());
                }
                if (!Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getSubscription_id());
                }
                if (value.getSubscription_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getSubscription_updated_at());
                }
                return value.getUser_product() != null ? size + UserProduct.ADAPTER.encodedSizeWithTag(4, value.getUser_product()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountFeatureUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_subscription_features() != null) {
                    SubscriptionFeatures.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_subscription_features());
                }
                if (!Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_id());
                }
                if (value.getSubscription_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSubscription_updated_at());
                }
                if (value.getUser_product() != null) {
                    UserProduct.ADAPTER.encodeWithTag(writer, 4, (int) value.getUser_product());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountFeatureUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUser_product() != null) {
                    UserProduct.ADAPTER.encodeWithTag(writer, 4, (int) value.getUser_product());
                }
                if (value.getSubscription_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSubscription_updated_at());
                }
                if (!Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_id());
                }
                if (value.getAccount_subscription_features() != null) {
                    SubscriptionFeatures.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_subscription_features());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountFeatureUpdateDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                SubscriptionFeatures subscriptionFeaturesDecode = null;
                Instant instantDecode = null;
                UserProduct userProductDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountFeatureUpdateDetails(subscriptionFeaturesDecode, byteStringDecode, instantDecode, userProductDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        subscriptionFeaturesDecode = SubscriptionFeatures.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        userProductDecode = UserProduct.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountFeatureUpdateDetails redact(AccountFeatureUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SubscriptionFeatures account_subscription_features = value.getAccount_subscription_features();
                SubscriptionFeatures subscriptionFeaturesRedact = account_subscription_features != null ? SubscriptionFeatures.ADAPTER.redact(account_subscription_features) : null;
                Instant subscription_updated_at = value.getSubscription_updated_at();
                Instant instantRedact = subscription_updated_at != null ? ProtoAdapter.INSTANT.redact(subscription_updated_at) : null;
                UserProduct user_product = value.getUser_product();
                return AccountFeatureUpdateDetails.copy$default(value, subscriptionFeaturesRedact, null, instantRedact, user_product != null ? UserProduct.ADAPTER.redact(user_product) : null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
