package crypto.fee_tier.proto.p434v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: IntroductoryPromo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJe\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\u0004\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0019R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\r\u0010 ¨\u0006+"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/IntroductoryPromo;", "Lcom/squareup/wire/Message;", "", "", "is_promo_claimed", "Lcrypto/fee_tier/proto/v1/FeeTier;", "target_tier", "", "lockup_period_days", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "promo_start_time", "promo_end_time", "is_account_eligible_for_promo", "Lokio/ByteString;", "unknownFields", "<init>", "(ZLcrypto/fee_tier/proto/v1/FeeTier;ILj$/time/Instant;Lj$/time/Instant;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(ZLcrypto/fee_tier/proto/v1/FeeTier;ILj$/time/Instant;Lj$/time/Instant;ZLokio/ByteString;)Lcrypto/fee_tier/proto/v1/IntroductoryPromo;", "Z", "()Z", "Lcrypto/fee_tier/proto/v1/FeeTier;", "getTarget_tier", "()Lcrypto/fee_tier/proto/v1/FeeTier;", "I", "getLockup_period_days", "Lj$/time/Instant;", "getPromo_start_time", "()Lj$/time/Instant;", "getPromo_end_time", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class IntroductoryPromo extends Message {

    @JvmField
    public static final ProtoAdapter<IntroductoryPromo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccountEligibleForPromo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_account_eligible_for_promo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPromoClaimed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_promo_claimed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockupPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int lockup_period_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "promoEndTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant promo_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "promoStartTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant promo_start_time;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "targetTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeeTier target_tier;

    public IntroductoryPromo() {
        this(false, null, 0, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27788newBuilder();
    }

    /* renamed from: is_promo_claimed, reason: from getter */
    public final boolean getIs_promo_claimed() {
        return this.is_promo_claimed;
    }

    public final FeeTier getTarget_tier() {
        return this.target_tier;
    }

    public final int getLockup_period_days() {
        return this.lockup_period_days;
    }

    public final Instant getPromo_start_time() {
        return this.promo_start_time;
    }

    public final Instant getPromo_end_time() {
        return this.promo_end_time;
    }

    /* renamed from: is_account_eligible_for_promo, reason: from getter */
    public final boolean getIs_account_eligible_for_promo() {
        return this.is_account_eligible_for_promo;
    }

    public /* synthetic */ IntroductoryPromo(boolean z, FeeTier feeTier, int i, Instant instant, Instant instant2, boolean z2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : feeTier, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : instant, (i2 & 16) != 0 ? null : instant2, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroductoryPromo(boolean z, FeeTier feeTier, int i, Instant instant, Instant instant2, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_promo_claimed = z;
        this.target_tier = feeTier;
        this.lockup_period_days = i;
        this.promo_start_time = instant;
        this.promo_end_time = instant2;
        this.is_account_eligible_for_promo = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27788newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IntroductoryPromo)) {
            return false;
        }
        IntroductoryPromo introductoryPromo = (IntroductoryPromo) other;
        return Intrinsics.areEqual(unknownFields(), introductoryPromo.unknownFields()) && this.is_promo_claimed == introductoryPromo.is_promo_claimed && Intrinsics.areEqual(this.target_tier, introductoryPromo.target_tier) && this.lockup_period_days == introductoryPromo.lockup_period_days && Intrinsics.areEqual(this.promo_start_time, introductoryPromo.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, introductoryPromo.promo_end_time) && this.is_account_eligible_for_promo == introductoryPromo.is_account_eligible_for_promo;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_promo_claimed)) * 37;
        FeeTier feeTier = this.target_tier;
        int iHashCode2 = (((iHashCode + (feeTier != null ? feeTier.hashCode() : 0)) * 37) + Integer.hashCode(this.lockup_period_days)) * 37;
        Instant instant = this.promo_start_time;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.promo_end_time;
        int iHashCode4 = ((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_account_eligible_for_promo);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_promo_claimed=" + this.is_promo_claimed);
        FeeTier feeTier = this.target_tier;
        if (feeTier != null) {
            arrayList.add("target_tier=" + feeTier);
        }
        arrayList.add("lockup_period_days=" + this.lockup_period_days);
        Instant instant = this.promo_start_time;
        if (instant != null) {
            arrayList.add("promo_start_time=" + instant);
        }
        Instant instant2 = this.promo_end_time;
        if (instant2 != null) {
            arrayList.add("promo_end_time=" + instant2);
        }
        arrayList.add("is_account_eligible_for_promo=" + this.is_account_eligible_for_promo);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IntroductoryPromo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IntroductoryPromo copy$default(IntroductoryPromo introductoryPromo, boolean z, FeeTier feeTier, int i, Instant instant, Instant instant2, boolean z2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = introductoryPromo.is_promo_claimed;
        }
        if ((i2 & 2) != 0) {
            feeTier = introductoryPromo.target_tier;
        }
        if ((i2 & 4) != 0) {
            i = introductoryPromo.lockup_period_days;
        }
        if ((i2 & 8) != 0) {
            instant = introductoryPromo.promo_start_time;
        }
        if ((i2 & 16) != 0) {
            instant2 = introductoryPromo.promo_end_time;
        }
        if ((i2 & 32) != 0) {
            z2 = introductoryPromo.is_account_eligible_for_promo;
        }
        if ((i2 & 64) != 0) {
            byteString = introductoryPromo.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        int i3 = i;
        return introductoryPromo.copy(z, feeTier, i3, instant, instant3, z3, byteString2);
    }

    public final IntroductoryPromo copy(boolean is_promo_claimed, FeeTier target_tier, int lockup_period_days, Instant promo_start_time, Instant promo_end_time, boolean is_account_eligible_for_promo, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IntroductoryPromo(is_promo_claimed, target_tier, lockup_period_days, promo_start_time, promo_end_time, is_account_eligible_for_promo, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IntroductoryPromo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IntroductoryPromo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.IntroductoryPromo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IntroductoryPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_promo_claimed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getTarget_tier() != null) {
                    size += FeeTier.ADAPTER.encodedSizeWithTag(2, value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getPromo_start_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getPromo_start_time());
                }
                if (value.getPromo_end_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getPromo_end_time());
                }
                return value.getIs_account_eligible_for_promo() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_account_eligible_for_promo())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IntroductoryPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getPromo_start_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getPromo_start_time());
                }
                if (value.getPromo_end_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getPromo_end_time());
                }
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IntroductoryPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getPromo_end_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getPromo_end_time());
                }
                if (value.getPromo_start_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getPromo_start_time());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_tier());
                }
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IntroductoryPromo redact(IntroductoryPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeTier target_tier = value.getTarget_tier();
                FeeTier feeTierRedact = target_tier != null ? FeeTier.ADAPTER.redact(target_tier) : null;
                Instant promo_start_time = value.getPromo_start_time();
                Instant instantRedact = promo_start_time != null ? ProtoAdapter.INSTANT.redact(promo_start_time) : null;
                Instant promo_end_time = value.getPromo_end_time();
                return IntroductoryPromo.copy$default(value, false, feeTierRedact, 0, instantRedact, promo_end_time != null ? ProtoAdapter.INSTANT.redact(promo_end_time) : null, false, ByteString.EMPTY, 37, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IntroductoryPromo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FeeTier feeTierDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                boolean zBooleanValue2 = false;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                feeTierDecode = FeeTier.ADAPTER.decode(reader);
                                break;
                            case 3:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new IntroductoryPromo(zBooleanValue, feeTierDecode, iIntValue, instantDecode, instantDecode2, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
