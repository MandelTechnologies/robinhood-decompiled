package moneytree.p510v1;

import com.robinhood.rosetta.common.Money;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: GetMembershipDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?BÇ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&JÍ\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00052\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010&R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b4\u00100R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b5\u0010&R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b6\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b7\u00100R\"\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b;\u0010&R\"\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b<\u0010:R\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b=\u0010&R\"\u0010\u0016\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b>\u0010:¨\u0006@"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponse;", "Lcom/squareup/wire/Message;", "", "Lmoneytree/v1/MMFProgramState;", "enrollment_state", "", "apy_rate", "Lcom/robinhood/rosetta/common/Money;", "lifetime_interest_paid", "sweep_balance", "key_information_document_url", "fee_percentage", "insurance_amount", "cta_text", "cta_deeplink", "interest_accrued", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "next_payment_date", "promo_period_apy", "promo_period_apy_expiry", "promo_period_fee", "enrollment_created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Lmoneytree/v1/MMFProgramState;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lmoneytree/v1/MMFProgramState;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lmoneytree/v1/GetMembershipDetailsResponse;", "Lmoneytree/v1/MMFProgramState;", "getEnrollment_state", "()Lmoneytree/v1/MMFProgramState;", "Ljava/lang/String;", "getApy_rate", "Lcom/robinhood/rosetta/common/Money;", "getLifetime_interest_paid", "()Lcom/robinhood/rosetta/common/Money;", "getSweep_balance", "getKey_information_document_url", "getFee_percentage", "getInsurance_amount", "getCta_text", "getCta_deeplink", "getInterest_accrued", "Lj$/time/Instant;", "getNext_payment_date", "()Lj$/time/Instant;", "getPromo_period_apy", "getPromo_period_apy_expiry", "getPromo_period_fee", "getEnrollment_created_at", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetMembershipDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMembershipDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "apyRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String apy_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "enrollmentCreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Instant enrollment_created_at;

    @WireField(adapter = "moneytree.v1.MMFProgramState#ADAPTER", jsonName = "enrollmentState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MMFProgramState enrollment_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String fee_percentage;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "insuranceAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money insurance_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "interestAccrued", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Money interest_accrued;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "keyInformationDocumentUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String key_information_document_url;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "lifetimeInterestPaid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money lifetime_interest_paid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextPaymentDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant next_payment_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoPeriodApy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String promo_period_apy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "promoPeriodApyExpiry", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant promo_period_apy_expiry;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoPeriodFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String promo_period_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "sweepBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money sweep_balance;

    public GetMembershipDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29331newBuilder();
    }

    public final MMFProgramState getEnrollment_state() {
        return this.enrollment_state;
    }

    public /* synthetic */ GetMembershipDetailsResponse(MMFProgramState mMFProgramState, String str, Money money, Money money2, String str2, String str3, Money money3, String str4, String str5, Money money4, Instant instant, String str6, Instant instant2, String str7, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED : mMFProgramState, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : money3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? null : money4, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? "" : str6, (i & 4096) != 0 ? null : instant2, (i & 8192) == 0 ? str7 : "", (i & 16384) != 0 ? null : instant3, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getApy_rate() {
        return this.apy_rate;
    }

    public final Money getLifetime_interest_paid() {
        return this.lifetime_interest_paid;
    }

    public final Money getSweep_balance() {
        return this.sweep_balance;
    }

    public final String getKey_information_document_url() {
        return this.key_information_document_url;
    }

    public final String getFee_percentage() {
        return this.fee_percentage;
    }

    public final Money getInsurance_amount() {
        return this.insurance_amount;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getCta_deeplink() {
        return this.cta_deeplink;
    }

    public final Money getInterest_accrued() {
        return this.interest_accrued;
    }

    public final Instant getNext_payment_date() {
        return this.next_payment_date;
    }

    public final String getPromo_period_apy() {
        return this.promo_period_apy;
    }

    public final Instant getPromo_period_apy_expiry() {
        return this.promo_period_apy_expiry;
    }

    public final String getPromo_period_fee() {
        return this.promo_period_fee;
    }

    public final Instant getEnrollment_created_at() {
        return this.enrollment_created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMembershipDetailsResponse(MMFProgramState enrollment_state, String apy_rate, Money money, Money money2, String key_information_document_url, String fee_percentage, Money money3, String cta_text, String cta_deeplink, Money money4, Instant instant, String promo_period_apy, Instant instant2, String promo_period_fee, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(enrollment_state, "enrollment_state");
        Intrinsics.checkNotNullParameter(apy_rate, "apy_rate");
        Intrinsics.checkNotNullParameter(key_information_document_url, "key_information_document_url");
        Intrinsics.checkNotNullParameter(fee_percentage, "fee_percentage");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(promo_period_apy, "promo_period_apy");
        Intrinsics.checkNotNullParameter(promo_period_fee, "promo_period_fee");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.enrollment_state = enrollment_state;
        this.apy_rate = apy_rate;
        this.lifetime_interest_paid = money;
        this.sweep_balance = money2;
        this.key_information_document_url = key_information_document_url;
        this.fee_percentage = fee_percentage;
        this.insurance_amount = money3;
        this.cta_text = cta_text;
        this.cta_deeplink = cta_deeplink;
        this.interest_accrued = money4;
        this.next_payment_date = instant;
        this.promo_period_apy = promo_period_apy;
        this.promo_period_apy_expiry = instant2;
        this.promo_period_fee = promo_period_fee;
        this.enrollment_created_at = instant3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29331newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMembershipDetailsResponse)) {
            return false;
        }
        GetMembershipDetailsResponse getMembershipDetailsResponse = (GetMembershipDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMembershipDetailsResponse.unknownFields()) && this.enrollment_state == getMembershipDetailsResponse.enrollment_state && Intrinsics.areEqual(this.apy_rate, getMembershipDetailsResponse.apy_rate) && Intrinsics.areEqual(this.lifetime_interest_paid, getMembershipDetailsResponse.lifetime_interest_paid) && Intrinsics.areEqual(this.sweep_balance, getMembershipDetailsResponse.sweep_balance) && Intrinsics.areEqual(this.key_information_document_url, getMembershipDetailsResponse.key_information_document_url) && Intrinsics.areEqual(this.fee_percentage, getMembershipDetailsResponse.fee_percentage) && Intrinsics.areEqual(this.insurance_amount, getMembershipDetailsResponse.insurance_amount) && Intrinsics.areEqual(this.cta_text, getMembershipDetailsResponse.cta_text) && Intrinsics.areEqual(this.cta_deeplink, getMembershipDetailsResponse.cta_deeplink) && Intrinsics.areEqual(this.interest_accrued, getMembershipDetailsResponse.interest_accrued) && Intrinsics.areEqual(this.next_payment_date, getMembershipDetailsResponse.next_payment_date) && Intrinsics.areEqual(this.promo_period_apy, getMembershipDetailsResponse.promo_period_apy) && Intrinsics.areEqual(this.promo_period_apy_expiry, getMembershipDetailsResponse.promo_period_apy_expiry) && Intrinsics.areEqual(this.promo_period_fee, getMembershipDetailsResponse.promo_period_fee) && Intrinsics.areEqual(this.enrollment_created_at, getMembershipDetailsResponse.enrollment_created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.enrollment_state.hashCode()) * 37) + this.apy_rate.hashCode()) * 37;
        Money money = this.lifetime_interest_paid;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.sweep_balance;
        int iHashCode3 = (((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.key_information_document_url.hashCode()) * 37) + this.fee_percentage.hashCode()) * 37;
        Money money3 = this.insurance_amount;
        int iHashCode4 = (((((iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.cta_text.hashCode()) * 37) + this.cta_deeplink.hashCode()) * 37;
        Money money4 = this.interest_accrued;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Instant instant = this.next_payment_date;
        int iHashCode6 = (((iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37) + this.promo_period_apy.hashCode()) * 37;
        Instant instant2 = this.promo_period_apy_expiry;
        int iHashCode7 = (((iHashCode6 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.promo_period_fee.hashCode()) * 37;
        Instant instant3 = this.enrollment_created_at;
        int iHashCode8 = iHashCode7 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("enrollment_state=" + this.enrollment_state);
        arrayList.add("apy_rate=" + Internal.sanitize(this.apy_rate));
        Money money = this.lifetime_interest_paid;
        if (money != null) {
            arrayList.add("lifetime_interest_paid=" + money);
        }
        Money money2 = this.sweep_balance;
        if (money2 != null) {
            arrayList.add("sweep_balance=" + money2);
        }
        arrayList.add("key_information_document_url=" + Internal.sanitize(this.key_information_document_url));
        arrayList.add("fee_percentage=" + Internal.sanitize(this.fee_percentage));
        Money money3 = this.insurance_amount;
        if (money3 != null) {
            arrayList.add("insurance_amount=" + money3);
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        arrayList.add("cta_deeplink=" + Internal.sanitize(this.cta_deeplink));
        Money money4 = this.interest_accrued;
        if (money4 != null) {
            arrayList.add("interest_accrued=" + money4);
        }
        Instant instant = this.next_payment_date;
        if (instant != null) {
            arrayList.add("next_payment_date=" + instant);
        }
        arrayList.add("promo_period_apy=" + Internal.sanitize(this.promo_period_apy));
        Instant instant2 = this.promo_period_apy_expiry;
        if (instant2 != null) {
            arrayList.add("promo_period_apy_expiry=" + instant2);
        }
        arrayList.add("promo_period_fee=" + Internal.sanitize(this.promo_period_fee));
        Instant instant3 = this.enrollment_created_at;
        if (instant3 != null) {
            arrayList.add("enrollment_created_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMembershipDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetMembershipDetailsResponse copy(MMFProgramState enrollment_state, String apy_rate, Money lifetime_interest_paid, Money sweep_balance, String key_information_document_url, String fee_percentage, Money insurance_amount, String cta_text, String cta_deeplink, Money interest_accrued, Instant next_payment_date, String promo_period_apy, Instant promo_period_apy_expiry, String promo_period_fee, Instant enrollment_created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(enrollment_state, "enrollment_state");
        Intrinsics.checkNotNullParameter(apy_rate, "apy_rate");
        Intrinsics.checkNotNullParameter(key_information_document_url, "key_information_document_url");
        Intrinsics.checkNotNullParameter(fee_percentage, "fee_percentage");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(promo_period_apy, "promo_period_apy");
        Intrinsics.checkNotNullParameter(promo_period_fee, "promo_period_fee");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMembershipDetailsResponse(enrollment_state, apy_rate, lifetime_interest_paid, sweep_balance, key_information_document_url, fee_percentage, insurance_amount, cta_text, cta_deeplink, interest_accrued, next_payment_date, promo_period_apy, promo_period_apy_expiry, promo_period_fee, enrollment_created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMembershipDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMembershipDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.GetMembershipDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMembershipDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEnrollment_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    size += MMFProgramState.ADAPTER.encodedSizeWithTag(1, value.getEnrollment_state());
                }
                if (!Intrinsics.areEqual(value.getApy_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getApy_rate());
                }
                if (value.getLifetime_interest_paid() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getLifetime_interest_paid());
                }
                if (value.getSweep_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getSweep_balance());
                }
                if (!Intrinsics.areEqual(value.getKey_information_document_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getKey_information_document_url());
                }
                if (!Intrinsics.areEqual(value.getFee_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFee_percentage());
                }
                if (value.getInsurance_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getInsurance_amount());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCta_deeplink());
                }
                if (value.getInterest_accrued() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(10, value.getInterest_accrued());
                }
                if (value.getNext_payment_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getNext_payment_date());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_apy(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getPromo_period_apy());
                }
                if (value.getPromo_period_apy_expiry() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getPromo_period_apy_expiry());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_fee(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getPromo_period_fee());
                }
                return value.getEnrollment_created_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getEnrollment_created_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMembershipDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEnrollment_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    MMFProgramState.ADAPTER.encodeWithTag(writer, 1, (int) value.getEnrollment_state());
                }
                if (!Intrinsics.areEqual(value.getApy_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApy_rate());
                }
                if (value.getLifetime_interest_paid() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getLifetime_interest_paid());
                }
                if (value.getSweep_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getSweep_balance());
                }
                if (!Intrinsics.areEqual(value.getKey_information_document_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getKey_information_document_url());
                }
                if (!Intrinsics.areEqual(value.getFee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFee_percentage());
                }
                if (value.getInsurance_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getInsurance_amount());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCta_deeplink());
                }
                if (value.getInterest_accrued() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 10, (int) value.getInterest_accrued());
                }
                if (value.getNext_payment_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getNext_payment_date());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_apy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getPromo_period_apy());
                }
                if (value.getPromo_period_apy_expiry() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getPromo_period_apy_expiry());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getPromo_period_fee());
                }
                if (value.getEnrollment_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getEnrollment_created_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMembershipDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnrollment_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getEnrollment_created_at());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getPromo_period_fee());
                }
                if (value.getPromo_period_apy_expiry() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getPromo_period_apy_expiry());
                }
                if (!Intrinsics.areEqual(value.getPromo_period_apy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getPromo_period_apy());
                }
                if (value.getNext_payment_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getNext_payment_date());
                }
                if (value.getInterest_accrued() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 10, (int) value.getInterest_accrued());
                }
                if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCta_text());
                }
                if (value.getInsurance_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getInsurance_amount());
                }
                if (!Intrinsics.areEqual(value.getFee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFee_percentage());
                }
                if (!Intrinsics.areEqual(value.getKey_information_document_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getKey_information_document_url());
                }
                if (value.getSweep_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getSweep_balance());
                }
                if (value.getLifetime_interest_paid() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getLifetime_interest_paid());
                }
                if (!Intrinsics.areEqual(value.getApy_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApy_rate());
                }
                if (value.getEnrollment_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    MMFProgramState.ADAPTER.encodeWithTag(writer, 1, (int) value.getEnrollment_state());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMembershipDetailsResponse decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MMFProgramState mMFProgramState = MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                MMFProgramState mMFProgramStateDecode = mMFProgramState;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    mMFProgramStateDecode = MMFProgramState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode7;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 14:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode7;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode7 = str;
                        strDecode2 = str3;
                        strDecode = str2;
                    } else {
                        return new GetMembershipDetailsResponse(mMFProgramStateDecode, strDecode7, moneyDecode, moneyDecode2, strDecode, strDecode2, moneyDecode3, strDecode3, strDecode4, moneyDecode4, instantDecode, strDecode5, instantDecode2, strDecode6, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMembershipDetailsResponse redact(GetMembershipDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money lifetime_interest_paid = value.getLifetime_interest_paid();
                Money moneyRedact = lifetime_interest_paid != null ? Money.ADAPTER.redact(lifetime_interest_paid) : null;
                Money sweep_balance = value.getSweep_balance();
                Money moneyRedact2 = sweep_balance != null ? Money.ADAPTER.redact(sweep_balance) : null;
                Money insurance_amount = value.getInsurance_amount();
                Money moneyRedact3 = insurance_amount != null ? Money.ADAPTER.redact(insurance_amount) : null;
                Money interest_accrued = value.getInterest_accrued();
                Money moneyRedact4 = interest_accrued != null ? Money.ADAPTER.redact(interest_accrued) : null;
                Instant next_payment_date = value.getNext_payment_date();
                Instant instantRedact = next_payment_date != null ? ProtoAdapter.INSTANT.redact(next_payment_date) : null;
                Instant promo_period_apy_expiry = value.getPromo_period_apy_expiry();
                Instant instantRedact2 = promo_period_apy_expiry != null ? ProtoAdapter.INSTANT.redact(promo_period_apy_expiry) : null;
                Instant enrollment_created_at = value.getEnrollment_created_at();
                return value.copy((10675 & 1) != 0 ? value.enrollment_state : null, (10675 & 2) != 0 ? value.apy_rate : null, (10675 & 4) != 0 ? value.lifetime_interest_paid : moneyRedact, (10675 & 8) != 0 ? value.sweep_balance : moneyRedact2, (10675 & 16) != 0 ? value.key_information_document_url : null, (10675 & 32) != 0 ? value.fee_percentage : null, (10675 & 64) != 0 ? value.insurance_amount : moneyRedact3, (10675 & 128) != 0 ? value.cta_text : null, (10675 & 256) != 0 ? value.cta_deeplink : null, (10675 & 512) != 0 ? value.interest_accrued : moneyRedact4, (10675 & 1024) != 0 ? value.next_payment_date : instantRedact, (10675 & 2048) != 0 ? value.promo_period_apy : null, (10675 & 4096) != 0 ? value.promo_period_apy_expiry : instantRedact2, (10675 & 8192) != 0 ? value.promo_period_fee : null, (10675 & 16384) != 0 ? value.enrollment_created_at : enrollment_created_at != null ? ProtoAdapter.INSTANT.redact(enrollment_created_at) : null, (10675 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
