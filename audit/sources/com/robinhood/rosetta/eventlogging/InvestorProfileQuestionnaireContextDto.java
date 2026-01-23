package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: InvestorProfileQuestionnaireContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate;)V", "questionnaire_context", "", "source", "account_number", InstantCashConstants.ACCOUNT_TYPE_KEY, "red_flag_status", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;)V", "getQuestionnaire_context", "()Ljava/lang/String;", "getSource", "getAccount_number", "getAccount_type", "getRed_flag_status", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "RedFlagStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class InvestorProfileQuestionnaireContextDto implements Dto3<InvestorProfileQuestionnaireContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestorProfileQuestionnaireContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestorProfileQuestionnaireContextDto, InvestorProfileQuestionnaireContext>> binaryBase64Serializer$delegate;
    private static final InvestorProfileQuestionnaireContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestorProfileQuestionnaireContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestorProfileQuestionnaireContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getQuestionnaire_context() {
        return this.surrogate.getQuestionnaire_context();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final RedFlagStatusDto getRed_flag_status() {
        return this.surrogate.getRed_flag_status();
    }

    public /* synthetic */ InvestorProfileQuestionnaireContextDto(String str, String str2, String str3, String str4, RedFlagStatusDto redFlagStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? RedFlagStatusDto.INSTANCE.getZeroValue() : redFlagStatusDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestorProfileQuestionnaireContextDto(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatusDto red_flag_status) {
        this(new Surrogate(questionnaire_context, source, account_number, account_type, red_flag_status));
        Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
    }

    public static /* synthetic */ InvestorProfileQuestionnaireContextDto copy$default(InvestorProfileQuestionnaireContextDto investorProfileQuestionnaireContextDto, String str, String str2, String str3, String str4, RedFlagStatusDto redFlagStatusDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investorProfileQuestionnaireContextDto.surrogate.getQuestionnaire_context();
        }
        if ((i & 2) != 0) {
            str2 = investorProfileQuestionnaireContextDto.surrogate.getSource();
        }
        if ((i & 4) != 0) {
            str3 = investorProfileQuestionnaireContextDto.surrogate.getAccount_number();
        }
        if ((i & 8) != 0) {
            str4 = investorProfileQuestionnaireContextDto.surrogate.getAccount_type();
        }
        if ((i & 16) != 0) {
            redFlagStatusDto = investorProfileQuestionnaireContextDto.surrogate.getRed_flag_status();
        }
        RedFlagStatusDto redFlagStatusDto2 = redFlagStatusDto;
        String str5 = str3;
        return investorProfileQuestionnaireContextDto.copy(str, str2, str5, str4, redFlagStatusDto2);
    }

    public final InvestorProfileQuestionnaireContextDto copy(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatusDto red_flag_status) {
        Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
        return new InvestorProfileQuestionnaireContextDto(new Surrogate(questionnaire_context, source, account_number, account_type, red_flag_status));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestorProfileQuestionnaireContext toProto() {
        return new InvestorProfileQuestionnaireContext(this.surrogate.getQuestionnaire_context(), this.surrogate.getSource(), this.surrogate.getAccount_number(), this.surrogate.getAccount_type(), (InvestorProfileQuestionnaireContext.RedFlagStatus) this.surrogate.getRed_flag_status().toProto(), null, 32, null);
    }

    public String toString() {
        return "[InvestorProfileQuestionnaireContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestorProfileQuestionnaireContextDto) && Intrinsics.areEqual(((InvestorProfileQuestionnaireContextDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate;", "", "questionnaire_context", "", "source", "account_number", InstantCashConstants.ACCOUNT_TYPE_KEY, "red_flag_status", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getQuestionnaire_context$annotations", "()V", "getQuestionnaire_context", "()Ljava/lang/String;", "getSource$annotations", "getSource", "getAccount_number$annotations", "getAccount_number", "getAccount_type$annotations", "getAccount_type", "getRed_flag_status$annotations", "getRed_flag_status", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final String account_type;
        private final String questionnaire_context;
        private final RedFlagStatusDto red_flag_status;
        private final String source;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (RedFlagStatusDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, RedFlagStatusDto redFlagStatusDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.questionnaire_context;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.source;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.account_number;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.account_type;
            }
            if ((i & 16) != 0) {
                redFlagStatusDto = surrogate.red_flag_status;
            }
            RedFlagStatusDto redFlagStatusDto2 = redFlagStatusDto;
            String str5 = str3;
            return surrogate.copy(str, str2, str5, str4, redFlagStatusDto2);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("questionnaireContext")
        @JsonAnnotations2(names = {"questionnaire_context"})
        public static /* synthetic */ void getQuestionnaire_context$annotations() {
        }

        @SerialName("redFlagStatus")
        @JsonAnnotations2(names = {"red_flag_status"})
        public static /* synthetic */ void getRed_flag_status$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuestionnaire_context() {
            return this.questionnaire_context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component5, reason: from getter */
        public final RedFlagStatusDto getRed_flag_status() {
            return this.red_flag_status;
        }

        public final Surrogate copy(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatusDto red_flag_status) {
            Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
            return new Surrogate(questionnaire_context, source, account_number, account_type, red_flag_status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.questionnaire_context, surrogate.questionnaire_context) && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.account_type, surrogate.account_type) && this.red_flag_status == surrogate.red_flag_status;
        }

        public int hashCode() {
            return (((((((this.questionnaire_context.hashCode() * 31) + this.source.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.account_type.hashCode()) * 31) + this.red_flag_status.hashCode();
        }

        public String toString() {
            return "Surrogate(questionnaire_context=" + this.questionnaire_context + ", source=" + this.source + ", account_number=" + this.account_number + ", account_type=" + this.account_type + ", red_flag_status=" + this.red_flag_status + ")";
        }

        /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestorProfileQuestionnaireContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, RedFlagStatusDto redFlagStatusDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.questionnaire_context = "";
            } else {
                this.questionnaire_context = str;
            }
            if ((i & 2) == 0) {
                this.source = "";
            } else {
                this.source = str2;
            }
            if ((i & 4) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str3;
            }
            if ((i & 8) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str4;
            }
            if ((i & 16) == 0) {
                this.red_flag_status = RedFlagStatusDto.INSTANCE.getZeroValue();
            } else {
                this.red_flag_status = redFlagStatusDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.questionnaire_context, "")) {
                output.encodeStringElement(serialDesc, 0, self.questionnaire_context);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 1, self.source);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_number);
            }
            if (!Intrinsics.areEqual(self.account_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_type);
            }
            if (self.red_flag_status != RedFlagStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RedFlagStatusDto.Serializer.INSTANCE, self.red_flag_status);
            }
        }

        public Surrogate(String questionnaire_context, String source, String account_number, String account_type, RedFlagStatusDto red_flag_status) {
            Intrinsics.checkNotNullParameter(questionnaire_context, "questionnaire_context");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(red_flag_status, "red_flag_status");
            this.questionnaire_context = questionnaire_context;
            this.source = source;
            this.account_number = account_number;
            this.account_type = account_type;
            this.red_flag_status = red_flag_status;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, RedFlagStatusDto redFlagStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? RedFlagStatusDto.INSTANCE.getZeroValue() : redFlagStatusDto);
        }

        public final String getQuestionnaire_context() {
            return this.questionnaire_context;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getAccount_type() {
            return this.account_type;
        }

        public final RedFlagStatusDto getRed_flag_status() {
            return this.red_flag_status;
        }
    }

    /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<InvestorProfileQuestionnaireContextDto, InvestorProfileQuestionnaireContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestorProfileQuestionnaireContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestorProfileQuestionnaireContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestorProfileQuestionnaireContextDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestorProfileQuestionnaireContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestorProfileQuestionnaireContext> getProtoAdapter() {
            return InvestorProfileQuestionnaireContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestorProfileQuestionnaireContextDto getZeroValue() {
            return InvestorProfileQuestionnaireContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestorProfileQuestionnaireContextDto fromProto(InvestorProfileQuestionnaireContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new InvestorProfileQuestionnaireContextDto(new Surrogate(proto.getQuestionnaire_context(), proto.getSource(), proto.getAccount_number(), proto.getAccount_type(), RedFlagStatusDto.INSTANCE.fromProto(proto.getRed_flag_status())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestorProfileQuestionnaireContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestorProfileQuestionnaireContextDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SLIP_RECOMMENDATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RedFlagStatusDto implements Dto2<InvestorProfileQuestionnaireContext.RedFlagStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RedFlagStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RedFlagStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RedFlagStatusDto, InvestorProfileQuestionnaireContext.RedFlagStatus>> binaryBase64Serializer$delegate;
        public static final RedFlagStatusDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final RedFlagStatusDto SLIP_RECOMMENDATION = new SLIP_RECOMMENDATION("SLIP_RECOMMENDATION", 1);

        private static final /* synthetic */ RedFlagStatusDto[] $values() {
            return new RedFlagStatusDto[]{UNSPECIFIED, SLIP_RECOMMENDATION};
        }

        public /* synthetic */ RedFlagStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RedFlagStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RedFlagStatusDto(String str, int i) {
        }

        /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto.RedFlagStatusDto.UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends RedFlagStatusDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestorProfileQuestionnaireContext.RedFlagStatus toProto() {
                return InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED;
            }
        }

        static {
            RedFlagStatusDto[] redFlagStatusDtoArr$values = $values();
            $VALUES = redFlagStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(redFlagStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContextDto$RedFlagStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestorProfileQuestionnaireContextDto.RedFlagStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto.RedFlagStatusDto.SLIP_RECOMMENDATION", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SLIP_RECOMMENDATION extends RedFlagStatusDto {
            SLIP_RECOMMENDATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public InvestorProfileQuestionnaireContext.RedFlagStatus toProto() {
                return InvestorProfileQuestionnaireContext.RedFlagStatus.SLIP_RECOMMENDATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContext$RedFlagStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RedFlagStatusDto, InvestorProfileQuestionnaireContext.RedFlagStatus> {

            /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InvestorProfileQuestionnaireContext.RedFlagStatus.values().length];
                    try {
                        iArr[InvestorProfileQuestionnaireContext.RedFlagStatus.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InvestorProfileQuestionnaireContext.RedFlagStatus.SLIP_RECOMMENDATION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RedFlagStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RedFlagStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RedFlagStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) RedFlagStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InvestorProfileQuestionnaireContext.RedFlagStatus> getProtoAdapter() {
                return InvestorProfileQuestionnaireContext.RedFlagStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RedFlagStatusDto getZeroValue() {
                return RedFlagStatusDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RedFlagStatusDto fromProto(InvestorProfileQuestionnaireContext.RedFlagStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RedFlagStatusDto.UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return RedFlagStatusDto.SLIP_RECOMMENDATION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$RedFlagStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RedFlagStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RedFlagStatusDto, InvestorProfileQuestionnaireContext.RedFlagStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.InvestorProfileQuestionnaireContext.RedFlagStatus", RedFlagStatusDto.getEntries(), RedFlagStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RedFlagStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RedFlagStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RedFlagStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RedFlagStatusDto valueOf(String str) {
            return (RedFlagStatusDto) Enum.valueOf(RedFlagStatusDto.class, str);
        }

        public static RedFlagStatusDto[] values() {
            return (RedFlagStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InvestorProfileQuestionnaireContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.InvestorProfileQuestionnaireContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestorProfileQuestionnaireContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestorProfileQuestionnaireContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestorProfileQuestionnaireContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestorProfileQuestionnaireContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestorProfileQuestionnaireContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContextDto";
        }
    }
}
