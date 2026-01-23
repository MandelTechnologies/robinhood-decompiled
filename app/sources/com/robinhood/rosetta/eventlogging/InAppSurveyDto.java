package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: InAppSurveyDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0010JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/InAppSurvey;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate;)V", "id", "", "question", "choice_id", "selected", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "focus", "retryable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getId", "()Ljava/lang/String;", "getQuestion", "getChoice_id", "getSelected", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getFocus", "getRetryable", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class InAppSurveyDto implements Dto3<InAppSurvey>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InAppSurveyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InAppSurveyDto, InAppSurvey>> binaryBase64Serializer$delegate;
    private static final InAppSurveyDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InAppSurveyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InAppSurveyDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getQuestion() {
        return this.surrogate.getQuestion();
    }

    public final String getChoice_id() {
        return this.surrogate.getChoice_id();
    }

    public final BooleanDto getSelected() {
        return this.surrogate.getSelected();
    }

    public final BooleanDto getFocus() {
        return this.surrogate.getFocus();
    }

    public final BooleanDto getRetryable() {
        return this.surrogate.getRetryable();
    }

    public /* synthetic */ InAppSurveyDto(String str, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppSurveyDto(String id, String question, String choice_id, BooleanDto selected, BooleanDto focus, BooleanDto retryable) {
        this(new Surrogate(id, question, choice_id, selected, focus, retryable));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(choice_id, "choice_id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(retryable, "retryable");
    }

    public static /* synthetic */ InAppSurveyDto copy$default(InAppSurveyDto inAppSurveyDto, String str, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppSurveyDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = inAppSurveyDto.surrogate.getQuestion();
        }
        if ((i & 4) != 0) {
            str3 = inAppSurveyDto.surrogate.getChoice_id();
        }
        if ((i & 8) != 0) {
            booleanDto = inAppSurveyDto.surrogate.getSelected();
        }
        if ((i & 16) != 0) {
            booleanDto2 = inAppSurveyDto.surrogate.getFocus();
        }
        if ((i & 32) != 0) {
            booleanDto3 = inAppSurveyDto.surrogate.getRetryable();
        }
        BooleanDto booleanDto4 = booleanDto2;
        BooleanDto booleanDto5 = booleanDto3;
        return inAppSurveyDto.copy(str, str2, str3, booleanDto, booleanDto4, booleanDto5);
    }

    public final InAppSurveyDto copy(String id, String question, String choice_id, BooleanDto selected, BooleanDto focus, BooleanDto retryable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(choice_id, "choice_id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(retryable, "retryable");
        return new InAppSurveyDto(new Surrogate(id, question, choice_id, selected, focus, retryable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InAppSurvey toProto() {
        return new InAppSurvey(this.surrogate.getId(), this.surrogate.getQuestion(), this.surrogate.getChoice_id(), (Boolean) this.surrogate.getSelected().toProto(), (Boolean) this.surrogate.getFocus().toProto(), (Boolean) this.surrogate.getRetryable().toProto(), null, 64, null);
    }

    public String toString() {
        return "[InAppSurveyDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InAppSurveyDto) && Intrinsics.areEqual(((InAppSurveyDto) other).surrogate, this.surrogate);
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
    /* compiled from: InAppSurveyDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\rHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u001b¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate;", "", "id", "", "question", "choice_id", "selected", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "focus", "retryable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getQuestion$annotations", "getQuestion", "getChoice_id$annotations", "getChoice_id", "getSelected$annotations", "getSelected", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getFocus$annotations", "getFocus", "getRetryable$annotations", "getRetryable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String choice_id;
        private final BooleanDto focus;
        private final String id;
        private final String question;
        private final BooleanDto retryable;
        private final BooleanDto selected;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (BooleanDto) null, (BooleanDto) null, (BooleanDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.question;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.choice_id;
            }
            if ((i & 8) != 0) {
                booleanDto = surrogate.selected;
            }
            if ((i & 16) != 0) {
                booleanDto2 = surrogate.focus;
            }
            if ((i & 32) != 0) {
                booleanDto3 = surrogate.retryable;
            }
            BooleanDto booleanDto4 = booleanDto2;
            BooleanDto booleanDto5 = booleanDto3;
            return surrogate.copy(str, str2, str3, booleanDto, booleanDto4, booleanDto5);
        }

        @SerialName("choiceId")
        @JsonAnnotations2(names = {"choice_id"})
        public static /* synthetic */ void getChoice_id$annotations() {
        }

        @SerialName("focus")
        @JsonAnnotations2(names = {"focus"})
        public static /* synthetic */ void getFocus$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("question")
        @JsonAnnotations2(names = {"question"})
        public static /* synthetic */ void getQuestion$annotations() {
        }

        @SerialName("retryable")
        @JsonAnnotations2(names = {"retryable"})
        public static /* synthetic */ void getRetryable$annotations() {
        }

        @SerialName("selected")
        @JsonAnnotations2(names = {"selected"})
        public static /* synthetic */ void getSelected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChoice_id() {
            return this.choice_id;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getSelected() {
            return this.selected;
        }

        /* renamed from: component5, reason: from getter */
        public final BooleanDto getFocus() {
            return this.focus;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getRetryable() {
            return this.retryable;
        }

        public final Surrogate copy(String id, String question, String choice_id, BooleanDto selected, BooleanDto focus, BooleanDto retryable) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(choice_id, "choice_id");
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(focus, "focus");
            Intrinsics.checkNotNullParameter(retryable, "retryable");
            return new Surrogate(id, question, choice_id, selected, focus, retryable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.question, surrogate.question) && Intrinsics.areEqual(this.choice_id, surrogate.choice_id) && this.selected == surrogate.selected && this.focus == surrogate.focus && this.retryable == surrogate.retryable;
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.question.hashCode()) * 31) + this.choice_id.hashCode()) * 31) + this.selected.hashCode()) * 31) + this.focus.hashCode()) * 31) + this.retryable.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", question=" + this.question + ", choice_id=" + this.choice_id + ", selected=" + this.selected + ", focus=" + this.focus + ", retryable=" + this.retryable + ")";
        }

        /* compiled from: InAppSurveyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InAppSurveyDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.question = "";
            } else {
                this.question = str2;
            }
            if ((i & 4) == 0) {
                this.choice_id = "";
            } else {
                this.choice_id = str3;
            }
            if ((i & 8) == 0) {
                this.selected = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.selected = booleanDto;
            }
            if ((i & 16) == 0) {
                this.focus = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.focus = booleanDto2;
            }
            if ((i & 32) == 0) {
                this.retryable = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.retryable = booleanDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.question, "")) {
                output.encodeStringElement(serialDesc, 1, self.question);
            }
            if (!Intrinsics.areEqual(self.choice_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.choice_id);
            }
            BooleanDto booleanDto = self.selected;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.selected);
            }
            if (self.focus != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BooleanDto.Serializer.INSTANCE, self.focus);
            }
            if (self.retryable != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.retryable);
            }
        }

        public Surrogate(String id, String question, String choice_id, BooleanDto selected, BooleanDto focus, BooleanDto retryable) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(choice_id, "choice_id");
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(focus, "focus");
            Intrinsics.checkNotNullParameter(retryable, "retryable");
            this.id = id;
            this.question = question;
            this.choice_id = choice_id;
            this.selected = selected;
            this.focus = focus;
            this.retryable = retryable;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final String getChoice_id() {
            return this.choice_id;
        }

        public final BooleanDto getSelected() {
            return this.selected;
        }

        public final BooleanDto getFocus() {
            return this.focus;
        }

        public final BooleanDto getRetryable() {
            return this.retryable;
        }
    }

    /* compiled from: InAppSurveyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto;", "Lcom/robinhood/rosetta/eventlogging/InAppSurvey;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<InAppSurveyDto, InAppSurvey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InAppSurveyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InAppSurveyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InAppSurveyDto> getBinaryBase64Serializer() {
            return (KSerializer) InAppSurveyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InAppSurvey> getProtoAdapter() {
            return InAppSurvey.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InAppSurveyDto getZeroValue() {
            return InAppSurveyDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InAppSurveyDto fromProto(InAppSurvey proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String question = proto.getQuestion();
            String choice_id = proto.getChoice_id();
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            return new InAppSurveyDto(new Surrogate(id, question, choice_id, companion.fromProto(proto.getSelected()), companion.fromProto(proto.getFocus()), companion.fromProto(proto.getRetryable())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InAppSurveyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppSurveyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InAppSurveyDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InAppSurveyDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InAppSurveyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.InAppSurvey", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InAppSurveyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InAppSurveyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InAppSurveyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InAppSurveyDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppSurveyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.InAppSurveyDto";
        }
    }
}
