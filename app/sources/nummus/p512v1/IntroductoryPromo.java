package nummus.p512v1;

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

/* compiled from: IntroductoryPromo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\rH\u0016JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006%"}, m3636d2 = {"Lnummus/v1/IntroductoryPromo;", "Lcom/squareup/wire/Message;", "", "is_promo_claimed", "", "is_account_eligible_for_promo", "target_tier", "Lnummus/v1/FeeTier;", "lockup_period_days", "", "trigger_type", "Lnummus/v1/FeeTierPromoTriggerType;", "promo_start_time", "", "promo_end_time", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLnummus/v1/FeeTier;ILnummus/v1/FeeTierPromoTriggerType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getTarget_tier", "()Lnummus/v1/FeeTier;", "getLockup_period_days", "()I", "getTrigger_type", "()Lnummus/v1/FeeTierPromoTriggerType;", "getPromo_start_time", "()Ljava/lang/String;", "getPromo_end_time", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class IntroductoryPromo extends Message {

    @JvmField
    public static final ProtoAdapter<IntroductoryPromo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccountEligibleForPromo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_account_eligible_for_promo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPromoClaimed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_promo_claimed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockupPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int lockup_period_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoEndTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String promo_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoStartTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String promo_start_time;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "targetTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final FeeTier target_tier;

    @WireField(adapter = "nummus.v1.FeeTierPromoTriggerType#ADAPTER", jsonName = "triggerType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FeeTierPromoTriggerType trigger_type;

    public IntroductoryPromo() {
        this(false, false, null, 0, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29433newBuilder();
    }

    /* renamed from: is_promo_claimed, reason: from getter */
    public final boolean getIs_promo_claimed() {
        return this.is_promo_claimed;
    }

    /* renamed from: is_account_eligible_for_promo, reason: from getter */
    public final boolean getIs_account_eligible_for_promo() {
        return this.is_account_eligible_for_promo;
    }

    public final FeeTier getTarget_tier() {
        return this.target_tier;
    }

    public final int getLockup_period_days() {
        return this.lockup_period_days;
    }

    public final FeeTierPromoTriggerType getTrigger_type() {
        return this.trigger_type;
    }

    public /* synthetic */ IntroductoryPromo(boolean z, boolean z2, FeeTier feeTier, int i, FeeTierPromoTriggerType feeTierPromoTriggerType, String str, String str2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : feeTier, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED : feeTierPromoTriggerType, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPromo_start_time() {
        return this.promo_start_time;
    }

    public final String getPromo_end_time() {
        return this.promo_end_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroductoryPromo(boolean z, boolean z2, FeeTier feeTier, int i, FeeTierPromoTriggerType trigger_type, String promo_start_time, String promo_end_time, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trigger_type, "trigger_type");
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_promo_claimed = z;
        this.is_account_eligible_for_promo = z2;
        this.target_tier = feeTier;
        this.lockup_period_days = i;
        this.trigger_type = trigger_type;
        this.promo_start_time = promo_start_time;
        this.promo_end_time = promo_end_time;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29433newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), introductoryPromo.unknownFields()) && this.is_promo_claimed == introductoryPromo.is_promo_claimed && this.is_account_eligible_for_promo == introductoryPromo.is_account_eligible_for_promo && Intrinsics.areEqual(this.target_tier, introductoryPromo.target_tier) && this.lockup_period_days == introductoryPromo.lockup_period_days && this.trigger_type == introductoryPromo.trigger_type && Intrinsics.areEqual(this.promo_start_time, introductoryPromo.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, introductoryPromo.promo_end_time);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_promo_claimed)) * 37) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 37;
        FeeTier feeTier = this.target_tier;
        int iHashCode2 = ((((((((iHashCode + (feeTier != null ? feeTier.hashCode() : 0)) * 37) + Integer.hashCode(this.lockup_period_days)) * 37) + this.trigger_type.hashCode()) * 37) + this.promo_start_time.hashCode()) * 37) + this.promo_end_time.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_promo_claimed=" + this.is_promo_claimed);
        arrayList.add("is_account_eligible_for_promo=" + this.is_account_eligible_for_promo);
        FeeTier feeTier = this.target_tier;
        if (feeTier != null) {
            arrayList.add("target_tier=" + feeTier);
        }
        arrayList.add("lockup_period_days=" + this.lockup_period_days);
        arrayList.add("trigger_type=" + this.trigger_type);
        arrayList.add("promo_start_time=" + Internal.sanitize(this.promo_start_time));
        arrayList.add("promo_end_time=" + Internal.sanitize(this.promo_end_time));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IntroductoryPromo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IntroductoryPromo copy$default(IntroductoryPromo introductoryPromo, boolean z, boolean z2, FeeTier feeTier, int i, FeeTierPromoTriggerType feeTierPromoTriggerType, String str, String str2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = introductoryPromo.is_promo_claimed;
        }
        if ((i2 & 2) != 0) {
            z2 = introductoryPromo.is_account_eligible_for_promo;
        }
        if ((i2 & 4) != 0) {
            feeTier = introductoryPromo.target_tier;
        }
        if ((i2 & 8) != 0) {
            i = introductoryPromo.lockup_period_days;
        }
        if ((i2 & 16) != 0) {
            feeTierPromoTriggerType = introductoryPromo.trigger_type;
        }
        if ((i2 & 32) != 0) {
            str = introductoryPromo.promo_start_time;
        }
        if ((i2 & 64) != 0) {
            str2 = introductoryPromo.promo_end_time;
        }
        if ((i2 & 128) != 0) {
            byteString = introductoryPromo.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        FeeTierPromoTriggerType feeTierPromoTriggerType2 = feeTierPromoTriggerType;
        String str4 = str;
        return introductoryPromo.copy(z, z2, feeTier, i, feeTierPromoTriggerType2, str4, str3, byteString2);
    }

    public final IntroductoryPromo copy(boolean is_promo_claimed, boolean is_account_eligible_for_promo, FeeTier target_tier, int lockup_period_days, FeeTierPromoTriggerType trigger_type, String promo_start_time, String promo_end_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trigger_type, "trigger_type");
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IntroductoryPromo(is_promo_claimed, is_account_eligible_for_promo, target_tier, lockup_period_days, trigger_type, promo_start_time, promo_end_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IntroductoryPromo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IntroductoryPromo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.IntroductoryPromo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IntroductoryPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_promo_claimed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getIs_account_eligible_for_promo()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getTarget_tier() != null) {
                    size += FeeTier.ADAPTER.encodedSizeWithTag(3, value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getTrigger_type() != FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED) {
                    size += FeeTierPromoTriggerType.ADAPTER.encodedSizeWithTag(5, value.getTrigger_type());
                }
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPromo_start_time());
                }
                return !Intrinsics.areEqual(value.getPromo_end_time(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPromo_end_time()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IntroductoryPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 3, (int) value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getTrigger_type() != FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED) {
                    FeeTierPromoTriggerType.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrigger_type());
                }
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPromo_start_time());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPromo_end_time());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IntroductoryPromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPromo_end_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPromo_end_time());
                }
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPromo_start_time());
                }
                if (value.getTrigger_type() != FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED) {
                    FeeTierPromoTriggerType.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrigger_type());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 3, (int) value.getTarget_tier());
                }
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IntroductoryPromo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeeTierPromoTriggerType feeTierPromoTriggerType = FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FeeTier feeTierDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode = "";
                String strDecode2 = strDecode;
                FeeTierPromoTriggerType feeTierPromoTriggerTypeDecode = feeTierPromoTriggerType;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                feeTierDecode = FeeTier.ADAPTER.decode(reader);
                                break;
                            case 4:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                try {
                                    feeTierPromoTriggerTypeDecode = FeeTierPromoTriggerType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new IntroductoryPromo(zBooleanValue2, zBooleanValue, feeTierDecode, iIntValue, feeTierPromoTriggerTypeDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IntroductoryPromo redact(IntroductoryPromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeTier target_tier = value.getTarget_tier();
                return IntroductoryPromo.copy$default(value, false, false, target_tier != null ? FeeTier.ADAPTER.redact(target_tier) : null, 0, null, null, null, ByteString.EMPTY, 123, null);
            }
        };
    }
}
