package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.SLIPContext;
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

/* compiled from: SLIPContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\"\u001a\u00020\u0002H\u0017J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "Lcom/squareup/wire/Message;", "", "entry_point_source", "", "onboarding_variant", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "eligibility_status", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "dollar_amount", "percent_amount", "has_quick_enrollment", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "skip_intro", "account_checkboxes", "", "Lcom/robinhood/rosetta/eventlogging/SLIPAccountCheckbox;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Ljava/util/List;Lokio/ByteString;)V", "getEntry_point_source", "()Ljava/lang/String;", "getOnboarding_variant", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "getEligibility_status", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "getDollar_amount", "getPercent_amount", "getHas_quick_enrollment", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getSkip_intro", "getAccount_checkboxes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OnboardingVariant", "EligibilityStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SLIPContext extends Message {

    @JvmField
    public static final ProtoAdapter<SLIPContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SLIPAccountCheckbox#ADAPTER", jsonName = "accountCheckboxes", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final java.util.List<SLIPAccountCheckbox> account_checkboxes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dollarAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String dollar_amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SLIPContext$EligibilityStatus#ADAPTER", jsonName = "eligibilityStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EligibilityStatus eligibility_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String entry_point_source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasQuickEnrollment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Boolean has_quick_enrollment;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SLIPContext$OnboardingVariant#ADAPTER", jsonName = "onboardingVariant", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OnboardingVariant onboarding_variant;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "percentAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String percent_amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "skipIntro", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean skip_intro;

    public SLIPContext() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ SLIPContext(String str, OnboardingVariant onboardingVariant, EligibilityStatus eligibilityStatus, String str2, String str3, Boolean r7, Boolean r8, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED : onboardingVariant, (i & 4) != 0 ? EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED : eligibilityStatus, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r7, (i & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r8, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24547newBuilder();
    }

    public final String getEntry_point_source() {
        return this.entry_point_source;
    }

    public final OnboardingVariant getOnboarding_variant() {
        return this.onboarding_variant;
    }

    public final EligibilityStatus getEligibility_status() {
        return this.eligibility_status;
    }

    public final String getDollar_amount() {
        return this.dollar_amount;
    }

    public final String getPercent_amount() {
        return this.percent_amount;
    }

    public final Boolean getHas_quick_enrollment() {
        return this.has_quick_enrollment;
    }

    public final Boolean getSkip_intro() {
        return this.skip_intro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SLIPContext(String entry_point_source, OnboardingVariant onboarding_variant, EligibilityStatus eligibility_status, String dollar_amount, String percent_amount, Boolean has_quick_enrollment, Boolean skip_intro, java.util.List<SLIPAccountCheckbox> account_checkboxes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
        Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
        Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
        Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
        Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point_source = entry_point_source;
        this.onboarding_variant = onboarding_variant;
        this.eligibility_status = eligibility_status;
        this.dollar_amount = dollar_amount;
        this.percent_amount = percent_amount;
        this.has_quick_enrollment = has_quick_enrollment;
        this.skip_intro = skip_intro;
        this.account_checkboxes = Internal.immutableCopyOf("account_checkboxes", account_checkboxes);
    }

    public final java.util.List<SLIPAccountCheckbox> getAccount_checkboxes() {
        return this.account_checkboxes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24547newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SLIPContext)) {
            return false;
        }
        SLIPContext sLIPContext = (SLIPContext) other;
        return Intrinsics.areEqual(unknownFields(), sLIPContext.unknownFields()) && Intrinsics.areEqual(this.entry_point_source, sLIPContext.entry_point_source) && this.onboarding_variant == sLIPContext.onboarding_variant && this.eligibility_status == sLIPContext.eligibility_status && Intrinsics.areEqual(this.dollar_amount, sLIPContext.dollar_amount) && Intrinsics.areEqual(this.percent_amount, sLIPContext.percent_amount) && this.has_quick_enrollment == sLIPContext.has_quick_enrollment && this.skip_intro == sLIPContext.skip_intro && Intrinsics.areEqual(this.account_checkboxes, sLIPContext.account_checkboxes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.entry_point_source.hashCode()) * 37) + this.onboarding_variant.hashCode()) * 37) + this.eligibility_status.hashCode()) * 37) + this.dollar_amount.hashCode()) * 37) + this.percent_amount.hashCode()) * 37) + this.has_quick_enrollment.hashCode()) * 37) + this.skip_intro.hashCode()) * 37) + this.account_checkboxes.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_point_source=" + Internal.sanitize(this.entry_point_source));
        arrayList.add("onboarding_variant=" + this.onboarding_variant);
        arrayList.add("eligibility_status=" + this.eligibility_status);
        arrayList.add("dollar_amount=" + Internal.sanitize(this.dollar_amount));
        arrayList.add("percent_amount=" + Internal.sanitize(this.percent_amount));
        arrayList.add("has_quick_enrollment=" + this.has_quick_enrollment);
        arrayList.add("skip_intro=" + this.skip_intro);
        if (!this.account_checkboxes.isEmpty()) {
            arrayList.add("account_checkboxes=" + this.account_checkboxes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SLIPContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SLIPContext copy$default(SLIPContext sLIPContext, String str, OnboardingVariant onboardingVariant, EligibilityStatus eligibilityStatus, String str2, String str3, Boolean r6, Boolean r7, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sLIPContext.entry_point_source;
        }
        if ((i & 2) != 0) {
            onboardingVariant = sLIPContext.onboarding_variant;
        }
        if ((i & 4) != 0) {
            eligibilityStatus = sLIPContext.eligibility_status;
        }
        if ((i & 8) != 0) {
            str2 = sLIPContext.dollar_amount;
        }
        if ((i & 16) != 0) {
            str3 = sLIPContext.percent_amount;
        }
        if ((i & 32) != 0) {
            r6 = sLIPContext.has_quick_enrollment;
        }
        if ((i & 64) != 0) {
            r7 = sLIPContext.skip_intro;
        }
        if ((i & 128) != 0) {
            list = sLIPContext.account_checkboxes;
        }
        if ((i & 256) != 0) {
            byteString = sLIPContext.unknownFields();
        }
        java.util.List list2 = list;
        ByteString byteString2 = byteString;
        Boolean r8 = r6;
        Boolean r9 = r7;
        String str4 = str3;
        EligibilityStatus eligibilityStatus2 = eligibilityStatus;
        return sLIPContext.copy(str, onboardingVariant, eligibilityStatus2, str2, str4, r8, r9, list2, byteString2);
    }

    public final SLIPContext copy(String entry_point_source, OnboardingVariant onboarding_variant, EligibilityStatus eligibility_status, String dollar_amount, String percent_amount, Boolean has_quick_enrollment, Boolean skip_intro, java.util.List<SLIPAccountCheckbox> account_checkboxes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
        Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
        Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
        Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
        Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SLIPContext(entry_point_source, onboarding_variant, eligibility_status, dollar_amount, percent_amount, has_quick_enrollment, skip_intro, account_checkboxes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SLIPContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SLIPContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SLIPContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SLIPContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntry_point_source());
                }
                if (value.getOnboarding_variant() != SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED) {
                    size += SLIPContext.OnboardingVariant.ADAPTER.encodedSizeWithTag(2, value.getOnboarding_variant());
                }
                if (value.getEligibility_status() != SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED) {
                    size += SLIPContext.EligibilityStatus.ADAPTER.encodedSizeWithTag(3, value.getEligibility_status());
                }
                if (!Intrinsics.areEqual(value.getDollar_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDollar_amount());
                }
                if (!Intrinsics.areEqual(value.getPercent_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPercent_amount());
                }
                Boolean has_quick_enrollment = value.getHas_quick_enrollment();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_quick_enrollment != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(6, value.getHas_quick_enrollment());
                }
                if (value.getSkip_intro() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(7, value.getSkip_intro());
                }
                return size + SLIPAccountCheckbox.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getAccount_checkboxes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SLIPContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_source());
                }
                if (value.getOnboarding_variant() != SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED) {
                    SLIPContext.OnboardingVariant.ADAPTER.encodeWithTag(writer, 2, (int) value.getOnboarding_variant());
                }
                if (value.getEligibility_status() != SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED) {
                    SLIPContext.EligibilityStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getEligibility_status());
                }
                if (!Intrinsics.areEqual(value.getDollar_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDollar_amount());
                }
                if (!Intrinsics.areEqual(value.getPercent_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPercent_amount());
                }
                Boolean has_quick_enrollment = value.getHas_quick_enrollment();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_quick_enrollment != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getHas_quick_enrollment());
                }
                if (value.getSkip_intro() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getSkip_intro());
                }
                SLIPAccountCheckbox.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getAccount_checkboxes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SLIPContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SLIPAccountCheckbox.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getAccount_checkboxes());
                Boolean skip_intro = value.getSkip_intro();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (skip_intro != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getSkip_intro());
                }
                if (value.getHas_quick_enrollment() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getHas_quick_enrollment());
                }
                if (!Intrinsics.areEqual(value.getPercent_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPercent_amount());
                }
                if (!Intrinsics.areEqual(value.getDollar_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDollar_amount());
                }
                if (value.getEligibility_status() != SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED) {
                    SLIPContext.EligibilityStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getEligibility_status());
                }
                if (value.getOnboarding_variant() != SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED) {
                    SLIPContext.OnboardingVariant.ADAPTER.encodeWithTag(writer, 2, (int) value.getOnboarding_variant());
                }
                if (Intrinsics.areEqual(value.getEntry_point_source(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_source());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SLIPContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SLIPContext.OnboardingVariant onboardingVariantDecode = SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED;
                SLIPContext.EligibilityStatus eligibilityStatus = SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Boolean booleanDecode = r3;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                SLIPContext.EligibilityStatus eligibilityStatusDecode = eligibilityStatus;
                Boolean booleanDecode2 = booleanDecode;
                while (true) {
                    SLIPContext.OnboardingVariant onboardingVariant = onboardingVariantDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        onboardingVariantDecode = SLIPContext.OnboardingVariant.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        eligibilityStatusDecode = SLIPContext.EligibilityStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        booleanDecode2 = Boolean.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 7:
                                    try {
                                        booleanDecode = Boolean.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 8:
                                    arrayList.add(SLIPAccountCheckbox.ADAPTER.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new SLIPContext(strDecode, onboardingVariant, eligibilityStatusDecode, strDecode2, strDecode3, booleanDecode2, booleanDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SLIPContext redact(SLIPContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SLIPContext.copy$default(value, null, null, null, null, null, null, null, Internal.m26823redactElements(value.getAccount_checkboxes(), SLIPAccountCheckbox.ADAPTER), ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SLIPContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ONBOARDING_VARIANT_UNSPECIFIED", "ONBOARDING_VARIANT_GENERIC", "ONBOARDING_VARIANT_DOLLAR", "ONBOARDING_VARIANT_PERCENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OnboardingVariant implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardingVariant[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OnboardingVariant> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OnboardingVariant ONBOARDING_VARIANT_DOLLAR;
        public static final OnboardingVariant ONBOARDING_VARIANT_GENERIC;
        public static final OnboardingVariant ONBOARDING_VARIANT_PERCENT;
        public static final OnboardingVariant ONBOARDING_VARIANT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OnboardingVariant[] $values() {
            return new OnboardingVariant[]{ONBOARDING_VARIANT_UNSPECIFIED, ONBOARDING_VARIANT_GENERIC, ONBOARDING_VARIANT_DOLLAR, ONBOARDING_VARIANT_PERCENT};
        }

        @JvmStatic
        public static final OnboardingVariant fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OnboardingVariant> getEntries() {
            return $ENTRIES;
        }

        private OnboardingVariant(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OnboardingVariant onboardingVariant = new OnboardingVariant("ONBOARDING_VARIANT_UNSPECIFIED", 0, 0);
            ONBOARDING_VARIANT_UNSPECIFIED = onboardingVariant;
            ONBOARDING_VARIANT_GENERIC = new OnboardingVariant("ONBOARDING_VARIANT_GENERIC", 1, 1);
            ONBOARDING_VARIANT_DOLLAR = new OnboardingVariant("ONBOARDING_VARIANT_DOLLAR", 2, 2);
            ONBOARDING_VARIANT_PERCENT = new OnboardingVariant("ONBOARDING_VARIANT_PERCENT", 3, 3);
            OnboardingVariant[] onboardingVariantArr$values = $values();
            $VALUES = onboardingVariantArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardingVariantArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingVariant.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OnboardingVariant>(orCreateKotlinClass, syntax, onboardingVariant) { // from class: com.robinhood.rosetta.eventlogging.SLIPContext$OnboardingVariant$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SLIPContext.OnboardingVariant fromValue(int value) {
                    return SLIPContext.OnboardingVariant.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SLIPContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OnboardingVariant fromValue(int value) {
                if (value == 0) {
                    return OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED;
                }
                if (value == 1) {
                    return OnboardingVariant.ONBOARDING_VARIANT_GENERIC;
                }
                if (value == 2) {
                    return OnboardingVariant.ONBOARDING_VARIANT_DOLLAR;
                }
                if (value != 3) {
                    return null;
                }
                return OnboardingVariant.ONBOARDING_VARIANT_PERCENT;
            }
        }

        public static OnboardingVariant valueOf(String str) {
            return (OnboardingVariant) Enum.valueOf(OnboardingVariant.class, str);
        }

        public static OnboardingVariant[] values() {
            return (OnboardingVariant[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SLIPContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ELIGIBILITY_STATUS_UNSPECIFIED", "ELIGIBILITY_STATUS_NOT_ELIGIBLE", "ELIGIBILITY_STATUS_ELIGIBLE", "ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EligibilityStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EligibilityStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EligibilityStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EligibilityStatus ELIGIBILITY_STATUS_ELIGIBLE;
        public static final EligibilityStatus ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION;
        public static final EligibilityStatus ELIGIBILITY_STATUS_NOT_ELIGIBLE;
        public static final EligibilityStatus ELIGIBILITY_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ EligibilityStatus[] $values() {
            return new EligibilityStatus[]{ELIGIBILITY_STATUS_UNSPECIFIED, ELIGIBILITY_STATUS_NOT_ELIGIBLE, ELIGIBILITY_STATUS_ELIGIBLE, ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION};
        }

        @JvmStatic
        public static final EligibilityStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EligibilityStatus> getEntries() {
            return $ENTRIES;
        }

        private EligibilityStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EligibilityStatus eligibilityStatus = new EligibilityStatus("ELIGIBILITY_STATUS_UNSPECIFIED", 0, 0);
            ELIGIBILITY_STATUS_UNSPECIFIED = eligibilityStatus;
            ELIGIBILITY_STATUS_NOT_ELIGIBLE = new EligibilityStatus("ELIGIBILITY_STATUS_NOT_ELIGIBLE", 1, 1);
            ELIGIBILITY_STATUS_ELIGIBLE = new EligibilityStatus("ELIGIBILITY_STATUS_ELIGIBLE", 2, 2);
            ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION = new EligibilityStatus("ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION", 3, 3);
            EligibilityStatus[] eligibilityStatusArr$values = $values();
            $VALUES = eligibilityStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eligibilityStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EligibilityStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EligibilityStatus>(orCreateKotlinClass, syntax, eligibilityStatus) { // from class: com.robinhood.rosetta.eventlogging.SLIPContext$EligibilityStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SLIPContext.EligibilityStatus fromValue(int value) {
                    return SLIPContext.EligibilityStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SLIPContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EligibilityStatus fromValue(int value) {
                if (value == 0) {
                    return EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return EligibilityStatus.ELIGIBILITY_STATUS_NOT_ELIGIBLE;
                }
                if (value == 2) {
                    return EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE;
                }
                if (value != 3) {
                    return null;
                }
                return EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION;
            }
        }

        public static EligibilityStatus valueOf(String str) {
            return (EligibilityStatus) Enum.valueOf(EligibilityStatus.class, str);
        }

        public static EligibilityStatus[] values() {
            return (EligibilityStatus[]) $VALUES.clone();
        }
    }
}
